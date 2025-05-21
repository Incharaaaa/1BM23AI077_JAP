import java.util.Scanner;
import java.util.Arrays;

public class Examscore {

    public static void  main(String[] args){

        final  int NUM_STUDENTS=5;
        int[] Examscores=new int[NUM_STUDENTS];

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the marks of 5 students");
        for(int i=0;i<NUM_STUDENTS;i++){
            System.out.println("enter the score of "+(i+1)+"student");
            Examscores[i]=sc.nextInt();
        }

        int sum=0;
        int highest=Examscores[0];
        for(int i=0;i<NUM_STUDENTS;i++){
            sum+=Examscores[i];
            if(Examscores[i]>highest){
                highest=Examscores[i];
            }
        }

        System.out.println(sum);
        System.out.println(highest);


    }
}
