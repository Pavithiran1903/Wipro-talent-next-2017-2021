public class Bmi{
    public static void main(String[] args)
    {
        Patient p=new Patient(70,18);
        System.out.println("BMI= " + p.bmi());
    }
}
class Patient
{
    String name;
    double w,h;
    Patient(double weight,double height)
    {
     w=weight;
     h=height;
    }
    double bmi()
    {
        double b = (w/(h*h))*703;
        return b;
    }
}