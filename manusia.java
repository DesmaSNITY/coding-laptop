public class manusia{
    String nama;
    double berat;
    double tinggi;

    public double BMI(){
        return (berat / Math.pow(tinggi,2));
    }

    public String status_BMI(){
        if(BMI()<18.5){
            return "kekurangan berat badan";
        }else if(BMI()>= 18.5 && BMI() <25.0){
            return "normal(ideal)";
        }else if(BMI()>= 25.0 && BMI() <30.0){
            return "kelebihan berat badan";
        }
        return "kegemukan (Obesitas)";
    }
}