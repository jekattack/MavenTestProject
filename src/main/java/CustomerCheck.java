public class CustomerCheck {

    public static String customerCheckMethod(int customerAmount){

        if (customerAmount > 30){
            System.out.println("Es sind zu viele Personen im Laden.");
            return "Es sind zu viele Personen im Laden.";
        } else {
            System.out.println("Es sind maximal 30 Leute im Laden.");
            return "Es sind maximal 30 Leute im Laden.";
        }
    }

}
