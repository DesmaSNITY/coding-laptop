
import java.util.Scanner;

public class ujicoba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Berapa usia kamu? ");
        int umur = input.nextInt();
        input.nextLine();  
        
        System.out.print("Apakah kamu punya KTP? (ya/tidak) ");
        String ktp = input.nextLine().toLowerCase();

        if (umur >= 17) {
            
            if (ktp.equals("ya")) {
                System.out.println("Kamu bisa mendaftar SIM.");
            } else {
                System.out.println("Kamu tidak bisa mendaftar SIM karena tidak punya KTP.");
            }
        } else {
            System.out.println("Kamu tidak bisa mendaftar SIM karena belum berusia 17 tahun.");
        }

        input.close();
    }
}
