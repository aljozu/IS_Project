package com.example.restbackend.model.solicitud;

import javax.persistence.*;

@Entity
@Table
public class Solicitud {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String email;
    @Column
    private String timeStamp;
    @Column
    private String academicDepartment;
    @Column
    private String researchCenter;
    @Column
    private String projectTitle;
    @Column
    private String projectType;
    @Column
    private String researchTopic;
    @Column
    private String principalInvestigator;
    @Column
    private String coInvestigatorsUTEC;
    @Column
    private String UTECParticipation;
    @Column
    private String startDate;
    @Column
    private String fundingInstitution;
    @Column
    private String fundingType;
    @Column
    private Double projectBudget;
    @Column
    private String currency;
    @Column
    private String fundingStatus;
    @Column
    private Double overhead;
    @Column
    private String PDFlink;
    @Column
    private Boolean approvalNeeded;
    @Column
    private Double assignedAmount;
    @Column
    private String status;

    public Solicitud() {
    }

    public Solicitud(String email, String timeStamp, String academicDepartment, String researchCenter,
                     String projectTitle, String projectType, String researchTopic, String principalInvestigator,
                     String coInvestigatorsUTEC, String UTECParticipation, String startDate, String fundingInstitution,
                     String fundingType, Double projectBudget, String currency, String fundingStatus, Double overhead,
                     String PDFlink, Boolean approvalNeeded, Double assignedAmount, String status) {
        this.email = email;
        this.timeStamp = timeStamp;
        this.academicDepartment = academicDepartment;
        this.researchCenter = researchCenter;
        this.projectTitle = projectTitle;
        this.projectType = projectType;
        this.researchTopic = researchTopic;
        this.principalInvestigator = principalInvestigator;
        this.coInvestigatorsUTEC = coInvestigatorsUTEC;
        this.UTECParticipation = UTECParticipation;
        this.startDate = startDate;
        this.fundingInstitution = fundingInstitution;
        this.fundingType = fundingType;
        this.projectBudget = projectBudget;
        this.currency = currency;
        this.fundingStatus = fundingStatus;
        this.overhead = overhead;
        this.PDFlink = PDFlink;
        this.approvalNeeded = approvalNeeded;
        this.assignedAmount = assignedAmount;
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getAcademicDepartment() {
        return academicDepartment;
    }

    public void setAcademicDepartment(String academicDepartment) {
        this.academicDepartment = academicDepartment;
    }

    public String getResearchCenter() {
        return researchCenter;
    }

    public void setResearchCenter(String researchCenter) {
        this.researchCenter = researchCenter;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    public String getPrincipalInvestigator() {
        return principalInvestigator;
    }

    public void setPrincipalInvestigator(String principalInvestigator) {
        this.principalInvestigator = principalInvestigator;
    }

    public String getCoInvestigatorsUTEC() {
        return coInvestigatorsUTEC;
    }

    public void setCoInvestigatorsUTEC(String coInvestigatorsUTEC) {
        this.coInvestigatorsUTEC = coInvestigatorsUTEC;
    }

    public String getUTECParticipation() {
        return UTECParticipation;
    }

    public void setUTECParticipation(String UTECParticipation) {
        this.UTECParticipation = UTECParticipation;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getFundingInstitution() {
        return fundingInstitution;
    }

    public void setFundingInstitution(String fundingInstitution) {
        this.fundingInstitution = fundingInstitution;
    }

    public String getFundingType() {
        return fundingType;
    }

    public void setFundingType(String fundingType) {
        this.fundingType = fundingType;
    }

    public Double getProjectBudget() {
        return projectBudget;
    }

    public void setProjectBudget(Double projectBudget) {
        this.projectBudget = projectBudget;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getFundingStatus() {
        return fundingStatus;
    }

    public void setFundingStatus(String fundingStatus) {
        this.fundingStatus = fundingStatus;
    }

    public Double getOverhead() {
        return overhead;
    }

    public void setOverhead(Double overhead) {
        this.overhead = overhead;
    }

    public String getPDFlink() {
        return PDFlink;
    }

    public void setPDFlink(String PDFlink) {
        this.PDFlink = PDFlink;
    }

    public Boolean getApprovalNeeded() {
        return approvalNeeded;
    }

    public void setApprovalNeeded(Boolean approvalNeeded) {
        this.approvalNeeded = approvalNeeded;
    }

    public Double getAssignedAmount() {
        return assignedAmount;
    }

    public void setAssignedAmount(Double assignedAmount) {
        this.assignedAmount = assignedAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
