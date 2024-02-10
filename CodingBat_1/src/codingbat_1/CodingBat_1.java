
package codingbat_1; // dizinin ilk ve son elamanı 6 ise true değilse false döndüren metot

import java.util.Random;


public class CodingBat_1 {
    
public static int [] Dizi(){
    Random rn = new Random();
    int []dizi = new int[rn.nextInt(10)+1];
    for(int i=0; i<dizi.length;i++){
        dizi[i] = rn.nextInt(10)+1;
      
    }
    
    return dizi;
}

public boolean firstlast6(int []dizi){
    if(dizi[0]==6 || dizi[dizi.length-1]==6){
        return true;
    }else{
        return false;
    }
    
}
   
    public static void main(String[] args) {
       
        CodingBat_1 s = new CodingBat_1();
        
        System.out.println(s.firstlast6(Dizi()));
        
        
    }
    
}
