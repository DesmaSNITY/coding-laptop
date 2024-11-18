import java.util.Scanner;

public class ujicoba2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kode minuman (1-3): ");
        int kodeMinuman = input.nextInt();

        switch (kodeMinuman) {
            case 1:
                System.out.println("Anda memilih Kopi.");
                break;
            case 2:
                System.out.println("Anda memilih Teh.");
                break;  
            case 3:
                System.out.println("Anda memilih Jus.");
                break;  
            default:
                System.out.println("Kode minuman tidak valid.");
                break; 
        }

        input.close();  
    }
}