
import java.util.Scanner;


public class TestClassroom {
    
    public static void main(String[] args) {
        
        Classroom[] stud = new Classroom[5];
        
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < stud.length; i++) {
            stud[i] = new Classroom();
            
            System.out.println("Enter Id: ");
            stud[i].setId(scan.nextInt());
            
            System.out.println("Enter Name: ");
            stud[i].setName(scan.next());
            
            System.out.println("Enter Address: ");
            stud[i].setAddress(scan.next());
            
            System.out.println("Enter Program Name: ");
            stud[i].setProgramName(scan.next());
        }
        
        for (int i = 0; i < stud.length; i++) {
            System.out.println(); 
            System.out.println(stud[i].getId() + " " + stud[i].getName() + 
                    " " + stud[i].getAddress() + " " + stud[i].getProgramName());
        }
    }
    
}
