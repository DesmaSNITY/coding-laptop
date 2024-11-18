
public class Main {
    public static void main(String[] args) {
        manusia person1 = new manusia();
        manusia person2 = new manusia();

        person1.nama = "doni";
        person1.berat = 40;
        person1.tinggi = 1.6;
        
        person2.nama = "dedeng";
        person2.berat = 70;
        person2.tinggi = 1.9;
        
        System.out.println("nama person 1 "+person1.nama);
        System.out.println("tinggi badan "+person1.tinggi);
        System.out.println("berat badan "+person1.berat);
        System.out.println("body max index person1 "+person1.BMI());
        System.out.println("status berat badan anda adalah "+ person1.status_BMI());
    }
}

