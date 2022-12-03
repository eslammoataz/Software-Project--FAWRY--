public class CompanyFactory {
    public static Object selectCompany(String compName){
        if (compName.equalsIgnoreCase("Vodafone") || compName.equals("1")) {
            return new Vodafone();
        } else if (compName.equalsIgnoreCase("Etisalat") || compName.equals("2")) {
            return new Etisalat();
        } else if (compName.equalsIgnoreCase("Orange") || compName.equals("3")){
            return new Orange();
        } else if (compName.equalsIgnoreCase("We") || compName.equals("4")){
            return new We();
        }
        return null;




    }
}
