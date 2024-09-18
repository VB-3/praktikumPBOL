import java.util.Scanner;
public class Tugas1 {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input Nama Anda : ");
    String nama= input.nextLine();

    System.out.print("Input NIM Anda : ");
    String nim = input.nextLine();
    
    System.out.println("\n");
    
    System.out.println("Nama Anda : "+nama);
    System.out.println("NIM Anda : "+nim);
 }   
}