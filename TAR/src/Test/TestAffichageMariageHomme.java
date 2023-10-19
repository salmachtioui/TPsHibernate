
package Test;
import java.util.Date;
import ma.projet.beans.Homme;
import ma.projet.beans.Mariage;
import ma.projet.services.HommeService;
/**
 *
 * @author hp
 */
public class TestAffichageMariageHomme {
    public static void main(String[] args) {     
        // Créer un homme
        Homme homme = new Homme();
        homme.setNom("CHTIOUI");
        homme.setPrenom("Salime");

        // Ajouter des mariages (en cours et échoués)
        Mariage mariageEnCours1 = new Mariage(new Date(2022,02,02),3);
        mariageEnCours1.setDateDebut(new Date(2022,02,02));
        homme.ajouterMariage(mariageEnCours1);

        Mariage mariageEnCours2 = new Mariage(new Date(2022,04,04),4);
        mariageEnCours2.setDateDebut(new Date(2022,04,04));
        homme.ajouterMariage(mariageEnCours2);

        Mariage mariageEchoue1 = new Mariage(new Date(2022,01,02),new Date(2023,10,16),2);
        mariageEchoue1.setDateDebut(new Date(2022,01,02));
        mariageEchoue1.setDateFin(new Date(2023,10,16));
        homme.ajouterMariage(mariageEchoue1);

        // Appeler les méthodes pour afficher les mariages
        HommeService hommeService = new HommeService();
        hommeService.afficherMariagesHomme(homme);
    }
}
  
