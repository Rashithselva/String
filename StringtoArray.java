package String;

public class StringtoArray {
    public static void main(String[] args) {
        String res="hi selva";
        char a[]=res.toCharArray();

        // for(int i=0;i<a.length;i++){
        //     System.out.println(a[i]);
        // }
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }
    
}
