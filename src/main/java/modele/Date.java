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
        return false;
    }
}
