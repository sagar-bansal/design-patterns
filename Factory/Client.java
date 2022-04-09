public class Client {
    public static void main(String[] args) {
        ProfessionFactory factoryobject=new ProfessionalFactory();
        Profession obj=factoryobject.getInstance("doctor");
        obj.print();
    }
    
}
