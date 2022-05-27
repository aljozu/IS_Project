package com.example.restbackend.model.proyeccion;

import javax.persistence.*;

@Entity
@Table
public class Proyeccion {

    @Id
    private long cursoId;
    @Column(nullable = true)
    private String cursoDesc;
    @Column(nullable = true)
    private String cursoCod;
    @Column(nullable = true)
    private String areaFunId;
    @Column(nullable = true)
    private String areaFunDesc;
    @Column(nullable = true)
    private long numAlumn;

    public Proyeccion(){}

    public Proyeccion(long cursoId, String cursoDesc, String cursoCod, String areaFunId, String areaFunDesc) {
        this.cursoId = cursoId;
        this.cursoDesc = cursoDesc;
        this.cursoCod = cursoCod;
        this.areaFunId = areaFunId;
        this.areaFunDesc = areaFunDesc;
    }

    public long getNumAlumn() {
        return numAlumn;
    }

    public void setNumAlumn(long numAlumn) {
        this.numAlumn = numAlumn;
    }

    public long getCursoId() {
        return cursoId;
    }

    public void setCursoId(long cursoId) {
        this.cursoId = cursoId;
    }

    public String getCursoDesc() {
        return cursoDesc;
    }

    public void setCursoDesc(String cursoDesc) {
        this.cursoDesc = cursoDesc;
    }

    public String getCursoCod() {
        return cursoCod;
    }

    public void setCursoCod(String cursoCod) {
        this.cursoCod = cursoCod;
    }

    public String getAreaFunId() {
        return areaFunId;
    }

    public void setAreaFunId(String areaFunId) {
        this.areaFunId = areaFunId;
    }

    public String getAreaFunDesc() {
        return areaFunDesc;
    }

    public void setAreaFunDesc(String areaFunDesc) {
        this.areaFunDesc = areaFunDesc;
    }
}
