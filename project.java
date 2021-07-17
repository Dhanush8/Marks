import java.util.Scanner;

public class project {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int number=sc.nextInt();
        
        int x=1,total=0,highestMarks=0,lowestMarks=100;
        
        while(x<=number)
        {
            System.out.print("Enter the marks: ");
            int marks=sc.nextInt();
            
            total=marks+total;
            
            if(marks>highestMarks)
            {
                highestMarks=marks;
            }
            if(marks<lowestMarks)
            {
                lowestMarks=marks;
            }
            
            x++;
        }
        System.out.println("");
        
        System.out.println("Highest marks: "+highestMarks);
        
        System.out.println("Lowest marks: "+lowestMarks);
        
        System.out.println("Total: "+total);
        
        float average=(float)total/number;
        
        System.out.println("Average: "+average);
        
    }
    
}
