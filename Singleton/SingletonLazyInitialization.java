public class SingletonLazyInitialization {
    private static SingletonLazyInitialization singleObj;
    private SingletonLazyInitialization(){};
    public static SingletonLazyInitialization getInstance(){
        if(singleObj==null)
         singleObj=new SingletonLazyInitialization();
        return singleObj;
    }
    
}
