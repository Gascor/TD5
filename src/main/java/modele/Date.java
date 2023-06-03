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
        return 0;
    }
}
