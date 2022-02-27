
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
public class main {
    public static void main(String []args){
        System.out.println("Gerenciador do Bootcamp: ");
        Scanner s = new Scanner(System.in);
        bd bd = new bd();
        int menu;
        menu =-1;
      
        while(menu!=0){
            System.out.println("(1)-Adicionar Curso ; (2)- Adicionar Mentoria ; (3) - Adicionar dev ; (4)- Exibir dados Bootcamp; "); 
            menu = s.nextInt();
               switch (menu){
                case 1:
                    bd.getB().getConteudos().add(bd.getCurso().createCurso());
                    break;
                case 2:
                    bd.getB().getConteudos().add(bd.getMentoria().createMentoria());
                    break;
                case 3: 
                    bd.getDev().createDev().inscreverBootcamp(bd.getB());     
                case 4:
                    System.out.println(""+bd.getB().getNome()+" "+bd.getB().getDescricao());
            }
        }
        
       
        
       
        
      
       


        
    }
}
