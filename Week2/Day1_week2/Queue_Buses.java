package Day1_week2;

import java.util.Scanner;

public class Queue_Buses {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        int[] groups=new int[n];
        for(int i=0;i<n;i++){
            groups[i]=sc.nextInt();
        }
        int busesN=0;
        int currentBC=m;
        for(int i=0;i<n;i++){
            if(groups[i]>currentBC){
                busesN++;
                currentBC=m;
            }
            currentBC-=groups[i];
        }
        if(currentBC<m){
                busesN++;
            
        }
        System.out.println(busesN);
        sc.close();
    }
    
}
