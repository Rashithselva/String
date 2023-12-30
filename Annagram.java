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
                for(int j=m1.length()-1;j>=0;j--){
                    m4+=m1.charAt(j);
                }
            }
            if(i==1){
                m2+=a[i];
                for(int j=m2.length()-1;j>=0;j--){
                    m5+=m2.charAt(j);
                }
            }
            if(i==2){
                m3+=a[i];
                for(int j=m3.length()-1;j>=0;j--){
                    m6+=m3.charAt(j);
                }
            }
        }
        for(int i=0;i<a.length;i++){
            if(i==0){
                a[i]=m4;
            }
            if(i==1){
                a[i]=m5;
            }
            if(i==2){
                a[i]=m6;
            }
        }
        System.out.println(Arrays.toString(a));
    }  
}
