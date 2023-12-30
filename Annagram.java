package String;
import java.util.Arrays;

public class Annagram {
      public static void main(String[] args) {
        
        String res="is my boy";
        String m1="",m2="",m3="",m4="",m5="",m6="";
        String a[]=res.split(" ");

        for(int i=0;i<a.length;i++){
            if(i==0){
                m1+=a[i];
                
            }
            if(i==1){
                m2+=a[i];
               
            }
            if(i==2){
                m3+=a[i];
                
            }
        }
        // System.out.println(Arrays.toString(a));
    }  
}
