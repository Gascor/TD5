package modele;

public class Date {
    protected int chJour, chMois, chAnnee;

    /**
     * Date class constructor for one argument.
     * Creates a date corresponding to the first of january of a given year.
     *
     * @param parAnnee The year of the date.
     */
    public Date(int parAnnee) {
        chJour = 1;
        chMois = 1;
        chAnnee = parAnnee;
    }
    /**
     * Date class constructor for three argument.
     * Creates a date corresponding to the given parameters.
     *
     * @param parJour  The day of the date
     * @param parMois  The month of the date
     * @param parAnnee The year of the date
     */
    public Date(int parJour, int parMois, int parAnnee){
        chJour = parJour;
        chMois = parMois;
        chAnnee = parAnnee;
    }
    /**
     * Returns True if the given year is a Leap year, else False.
     *
     * @param parAnnee The year to check
     * @return boolean
     */
    public static boolean estBissextile(int parAnnee){
        return parAnnee % 400 == 0 || (parAnnee % 4 == 0 && parAnnee % 100 != 0);
    }
    /**
     * Returns the last day in a given month of a given year.
     *
     * @param parMois  The month to check
     * @param parAnnee The year to check
     * @return int
     */
    public static int dernierJourDuMois(int parMois, int parAnnee){
        switch (parMois) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
            case 2 -> {
                if (Date.estBissextile(parAnnee)) {
                    return 29;
                } else {
                    return 28;
                }
            }
            case 4, 6, 9, 11 -> {
                return 30;
            }
            default -> {
                return -1;
            }
        }
    }
    /**
     * Returns a date corresponding to day after the object's.
     *
     * @return Date
     */
    public Date dateDuLendemain(){
        if (chJour == Date.dernierJourDuMois(chMois, chAnnee)) {
            if (chMois == 12) {
                return new Date(1,1,chAnnee+1);
            } else {
                return new Date(1,chMois+1,chAnnee);
            }
        } else {
            return new Date(chJour+1,chMois,chAnnee);
        }
    }
    /**
     * Returns a date corresponding to day before the object's.
     *
     * @return Date
     */
    public Date dateDeLaVeille(){
        if (chJour == 1) {
            if (chMois == 1) {
                return new Date(Date.dernierJourDuMois(12,chAnnee-1),12,chAnnee-1);
            } else {
                return new Date(Date.dernierJourDuMois(chMois-1,chAnnee),chMois-1,chAnnee);
            }
        } else {
            return new Date(chJour-1, chMois, chAnnee);
        }
    }
    /**
     * Compares two dates.
     *
     * @param parDate The date to compare the object with.
     * @return        0 if they are equal, a negative int if the date is greater, a positive int if the date is lower.
     */
    public int compareTo(Date parDate) {
        return 0;
    }
}
