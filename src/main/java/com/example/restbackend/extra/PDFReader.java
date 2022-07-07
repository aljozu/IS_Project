package com.example.restbackend.extra;

import com.example.restbackend.model.solicitud.Solicitud;
import com.google.common.base.CharMatcher;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;

public class PDFReader {
    static final Logger logger = Logger.getLogger(PDFReader.class.getName());
    static String projecTittle = "Título del proyecto";
    static String startDate = "Inicio del Proyecto";
    static String budget = "Total";
    public Solicitud readPDF(String PDFPath) throws Exception{
        URL url = new URL(PDFPath);
        Solicitud solicitud = new Solicitud();

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter
                = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm");
        String formattedString = formatter.format(dateTime);

        PDDocument pdDocument = PDDocument.load(url.openStream());
        PDFTextStripper pdfTextStripper = new PDFTextStripper();
        String text = pdfTextStripper.getText(pdDocument);

        //System.out.println(text);
        String pT = getWordUntilSpace(text, text.indexOf(projecTittle) + projecTittle.length()).replaceFirst("^\\s*", "");
        String sD = getWordUntilSpace(text, text.indexOf(startDate) + startDate.length()).replaceFirst("^\\s*", "");
        String bud = getWordUntilSpace(text, text.indexOf(budget) + budget.length());
        String amount = CharMatcher.inRange('0', '9').retainFrom(bud);
        String mon = bud.replace(amount, "").replaceFirst("^\\s*", "");

        solicitud.setTimeStamp(formattedString);
        solicitud.setProjectTitle(pT);
        solicitud.setStartDate(sD);
        solicitud.setProjectBudget(Double.valueOf(amount));
        solicitud.setCurrency(mon);
        solicitud.setStatus("Pending of information");
        solicitud.setFundingStatus("Pending");
        solicitud.setFundingInstitution("UTEC");
        solicitud.setPDFlink(PDFPath);

        pdDocument.close();

        return solicitud;
    }

    String getWordUntilSpace(String txt, int index){
        StringBuilder temp = new StringBuilder();
        boolean flag = true;
        while(flag){
            if(txt.charAt(index) == '\n') flag = false;
            else {
                temp.append(txt.charAt(index));
                index++;
            }
        }
        return temp.toString();
    }
}
