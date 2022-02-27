/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class bd {
    private Bootcamp b;
    private CursoDAO curso;
    private MentoriaDAO mentoria;
    private DevDAO dev;
    bd(){
        this.b= new Bootcamp();
        this.b.setNome("Programação Web");
        this.b.setDescricao("Foco na web");
        this.curso= new CursoDAO();
        this.mentoria= new MentoriaDAO();
        this.dev= new DevDAO();
    }

    public DevDAO getDev() {
        return dev;
    }

    public void setDev(DevDAO dev) {
        this.dev = dev;
    }

    public MentoriaDAO getMentoria() {
        return mentoria;
    }

    public void setMentoria(MentoriaDAO mentoria) {
        this.mentoria = mentoria;
    }

    public CursoDAO getCurso() {
        return curso;
    }

    public void setCurso(CursoDAO curso) {
        this.curso = curso;
    }

    public Bootcamp getB() {
        return b;
    }

    public void setB(Bootcamp b) {
        this.b = b;
    }
}
