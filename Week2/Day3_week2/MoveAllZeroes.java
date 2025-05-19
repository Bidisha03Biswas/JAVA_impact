package Day3_week2;
import java.util.*;

public class MoveAllZeroes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            String n=sc.next();
            String result=MoveZeroesToEnd(n);
            System.out.println(result);
        }
        sc.close();
    }
    private static String MoveZeroesToEnd(String n){
        StringBuilder str=new StringBuilder();
        int count=0;
        for(char ch:n.toCharArray()){
            if (ch=='0'){
                count++;
            }else{
                str.append(ch);
            }
        }
        for(int i=0;i<count;i++){
            str.append('0');
        }
        return str.toString();
    }
    

}
