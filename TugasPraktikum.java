public class TugasPraktikum{
    public static void main(String[] args) {
        System.out.println("===========================");
        Biodata bio = new Biodata("Muhammad Fajar", (long) 202011420029F,22, 170, 2024,'A',70.5,38.5 );
        System.out.println("Nama Saya " + bio.nama + ", NIM " + bio.nim + ", umur "+ bio.umur + ", Tinggibadan " + bio.tb + ", Berat Badan " + bio.bb + " saya lulusan " + bio.gYear + " dengan IPK " + bio.ipk + "grade " + bio.grade);
    }
}
class Biodata {
    String nama;
    int umur, tb, gYear;
    long nim;
    char grade;
    double bb, ipk;
    Biodata(String nama, long nim, int umur, int tb, int gYear, char grade, double bb, double ipk ) {
    this.nama = nama;
    this.nim = nim;
    this.umur = umur;
    this.tb = tb;
    this.gYear = gYear;
    this.grade = grade;
    this.bb = bb;
    this.ipk = ipk;
    }
    }
    //Inisiasi class dan push data
   
    