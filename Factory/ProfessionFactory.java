public class ProfessionFactory {
    public Profession getInstance(String type){
        if(type==null)
        return null;
        else if(type.equalsIgnoreCase("doctor"))
        return new Doctor();
        else if(type.equalsIgnoreCase("engineer"))
        return new Engineer();
        else if(type.equalsIgnoreCase("teacher"))
        return new Teacher();
    }
}
