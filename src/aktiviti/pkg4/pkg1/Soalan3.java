/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktiviti.pkg4.pkg1;

/**
 *
 * @author Dell
 */
public class Soalan3 {
    public static void main(String[] args){
        
        double diskaun=0.1;
        double harga_asal=35.50;
        double harga_diskaun;
        harga_diskaun = harga_asal- (harga_asal * diskaun);
        
        System.out.println("Apacer USB Flash Drive 32 GB");
        System.out.println("Harga asal adalah RM"+harga_asal+"Diskaun sebanyak 10%");
        System.out.println("Harga selepas diskaun adalah RM"+harga_diskaun);
    }
}
