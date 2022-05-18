public class CustomerCheck {

    public static boolean customerCheckMethod(String alarmstufe, int customerAmount){

        int maxAmount = 0;
        boolean alarm;

        switch (alarmstufe){
            case "Grün":
                System.out.println("Alarmstufe Gelb: Es sind maximal 60 Personen im Laden erlaubt.");
                maxAmount = 60;
                break;
            case "Gelb":
                System.out.println("Alarmstufe Gelb: Es sind maximal 30 Personen im Laden erlaubt.");
                maxAmount = 30;
                break;
            case "Rot":
                System.out.println("Alarmstufe Rot: Es sind keine Personen im Laden erlaubt.");
                maxAmount = 0;
                break;
            default:
                System.out.println("Ungültige Alarmstufe");
                maxAmount = 0;
                break;

        }


        if (customerAmount < maxAmount){
            System.out.println("Es dürfen mehr Personen in den Laden.");
            alarm = false;
            return alarm;
        } else {
            System.out.println("Die maximale Anzahl an Personen im Laden ist erreicht oder überschritten.");
            alarm = true;
            return alarm;
        }


    }

}
