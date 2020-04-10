package EXO5.UVSQ;

import java.io.IOException;
import java.time.LocalDate;
import  EXO5.UVSQ.Personne1.Builder;
import EXO5.UVSQ.DOA.DAO;
import EXO5.UVSQ.DOA.DAOFactory;
/**
 * enum app c est le main.
 * @author koussaila
 */
public enum App {
	/**
     * application .
     */
   APPLICATION;
	/**
     *@param  args .
     */
	public void run(final String[] args) {
		}
	/**
	 * @param  args .
     *@throws IOException En cas d'erreur d'ecriture .
     */

    public static void main(final String[] args) throws IOException {
    	/**
        * Initialise les variables.
        */
    	DAO<Personne1> DAOPersonne = DAOFactory.getPersonne1DAO();
    	Groupe G = new Groupe(1, "informatique");
    	Groupe G2 = new Groupe(2, "gestion");
    	Personne1 personne = new Builder(1,
    			"joa",
    		    "michel",
    			"directeur",
    			LocalDate.parse("1990-07-15"),
    			new Numero_telephone(1, Type_tel.fix_perso, "0104050506"))
    			.build();
       	Personne1 personne2 = new Builder(1,
       			"BOKHACHEBA",
       			"CANAVARO",
       			"directeur",
       			LocalDate.parse("1987-05-07"),
       			new Numero_telephone(1, Type_tel.fix_perso, "0676788956"))
    			.build();
       	Personne1 personne3 = new Builder(1,
       			"ROJA",
       			"NABIL",
       			"directeur",
       			LocalDate.parse("199-02-13"),
       			new Numero_telephone(1, Type_tel.fix_perso, "0678655565"))
    			.build();
       	Personne1 personne4 = new Builder(1,
       			"ABRIKH",
       			"KAMILIA",
       			"directeur",
       			LocalDate.parse("1991-04-09"),
       			new Numero_telephone(1, Type_tel.fix_perso, "0755666567"))
    			.build();
       	Personne1 personne5 = null;
    	G.add(personne);
    	G.add(personne2);
    	System.out.println(G.size());
    	personne5 = DAOPersonne.create(personne2);
    	System.out.println("personne5 " + personne5.getNom());
    	System.out.println("personne2 " + personne2.getNom());
    	System.out.println("personne4 " + personne4.getId());
    	System.out.println("personne3 " + personne3.getId());
    	System.out.println("La taille de G2 est  " + G2.size());
    	}

}