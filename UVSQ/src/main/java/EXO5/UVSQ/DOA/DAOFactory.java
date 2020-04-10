package EXO5.UVSQ.DOA;
import java.io.IOException;
import EXO5.UVSQ.Groupe;
import EXO5.UVSQ.Numero_telephone;
import EXO5.UVSQ.Personne1;
/**
 * Classe DAOFactory.
 * @author koussaila
 */
public class DAOFactory {
	/**
	 * methode  getPersonne1DAO.
	 * @author koussaila
     * @return Personne1DAO fichier 20 créé, ou null en cas d'erreur
     * @throws IOException En cas d'erreur d'ecriture .
     */
	public static DAO<Personne1> getPersonne1DAO() throws IOException {
			return  new Personne1DAO(20);
		}
	/**
	 * methode  getNumero_telephoneDAO.
     * @return Numero_telephone fichier 20 créé, ou null en cas d'erreur
     * @throws IOException En cas d'erreur d'ecriture .
     */
	public static DAO<Numero_telephone> getNumero_telephoneDAO()
			throws IOException {
		return new Numero_telephoneDAO(20);
		}
	/**
	 * methode  getGroupe.
     * @return GroupeDAO fichier 20 créé, ou null en cas d'erreur
     * @throws IOException En cas d'erreur d'ecriture .
     */
    public static DAO<Groupe> getGroupe() throws IOException {
		        return new GroupeDAO(20);
 }
}
