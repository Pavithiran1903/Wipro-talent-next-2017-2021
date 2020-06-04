public class Test1{
    public static void main(String[]args){
        Person p= new Person("SHIN");
        Student1 s=new Student1("NEON",2045);
        Teacher t = new Teacher("Cerena",35000,"BioTech");
        CollegeStudent cs = new CollegeStudent("FANNY",4652,3,"BIOENG");
        System.out.println(p);
        System.out.println(s);
        System.out.println(t);
        System.out.println(cs);
    }
}