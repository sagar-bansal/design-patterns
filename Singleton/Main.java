public class Main {
   public static void main(String[] args) {
       Singleton.getInstance();
       System.out.println(Singleton.getInstance());
       System.out.println(Singleton.getInstance());
       System.out.println(Singleton.getInstance());
      
       System.out.println(SingletonLazyInitialization.getInstance());
       System.out.println(SingletonLazyInitialization.getInstance());
       System.out.println(SingletonLazyInitialization.getInstance());
       
      
  }
}
