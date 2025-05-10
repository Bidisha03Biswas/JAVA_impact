import java.io.*;
import java.util.*;

public class ModernWorldCinderella {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size1=sc.nextInt();
        int size2=sc.nextInt();
        if (size1!=size2){
            System.out.println("Not Same");
            return;
        }
        int[] array1=new int[size1];
        int[] array2=new int[size2];
        for(int i=0;i<size1;i++){
            array1[i]=sc.nextInt();
        }
        for (int i=0;i<size2;i++){
            array2[i]=sc.nextInt();
        }
        int sum1=0;
        int sum2=0;
        for(int num:array1){
            sum1+=num;
        }
        for(int num:array2){
            sum2+=num;
        }
        
        if(sum1==sum2){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }
        sc.close();
    }
}