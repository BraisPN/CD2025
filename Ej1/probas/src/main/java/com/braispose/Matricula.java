package com.braispose;

public class Matricula {
    private Alumno alumno;
    private Module modulo;
    private Integer nota;
    private String curso;
    
    public Matricula(Alumno alumno, Module modulo, Integer nota, String curso) {
        this.alumno = alumno;
        this.modulo = modulo;
        this.nota = nota;
        this.curso = curso;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Module getModulo() {
        return modulo;
    }

    public void setModulo(Module modulo) {
        this.modulo = modulo;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Matricula [alumno=" + alumno + ", modulo=" + modulo + ", nota=" + nota + ", curso=" + curso + "]";
    }

    
}
