
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
public class DevDAO {
    public Dev createDev(){
        Scanner s = new Scanner(System.in);
        Dev d = new Dev();
        System.out.println("Digite o nome do dev ");
        d.setNome(s.next());
        
        return d;
    }
}
