
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class CursoDAO {
    public Curso createCurso(){
        Scanner s = new Scanner(System.in);
        Curso c = new Curso();
        System.out.println("Digite o titulo do curso");
        c.setTitulo(s.next());
        System.out.println("Digite o descricao do curso");
        c.setDescricao(s.next());
        System.out.println("Digite a carga horaria do curso");

        c.setCargaHoraria(s.nextInt());
        return c;
    }
    
}
