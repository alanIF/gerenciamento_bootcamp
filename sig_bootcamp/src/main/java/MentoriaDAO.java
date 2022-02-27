
import java.time.LocalDate;
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
public class MentoriaDAO {
     public Mentoria createMentoria(){
        Scanner s = new Scanner(System.in);
        Mentoria mentoria = new Mentoria();
        System.out.println("Digite o titulo da mentoria");

        mentoria.setTitulo(s.next());
        System.out.println("Digite a descricao da mentoria");

        mentoria.setDescricao(s.next());
        mentoria.setData(LocalDate.now());
        return  mentoria;
    }
}
