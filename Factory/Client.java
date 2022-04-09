public class Client {
    public static void main(String[] args) {
        ProfessionFactory factoryobject=new ProfessionFactory();
        Profession obj=factoryobject.getInstance("doctor");
        obj.print();
    }
    
}
