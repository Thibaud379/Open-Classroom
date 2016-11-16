package chapitre_2;

public class II_Heritage {

	public static void main(String[] args){
		
		Capitale cap = new Capitale();
		System.out.println("\n" +cap.desc()+ "\n");
		
		
		Capitale cap1 = new Capitale("Paris", "France", 654987, "la tour Eiffel");
		System.out.println("\n" +cap1.desc());
		
		/*	Le polymorphisme:
		 * 		-La méthode desc() est polymorphe car elle permet de 
		 * 		traiter indifferement les objets Ville et Capitale
		 * 		-Cela permet donc de traiter des objets dont on ne 
		 * 		connait pas le type
		 */
		
		System.out.println("\n		Polymorphisme : \n");
		//Tableau de Villes vide qui peut aussi contenir des Capitales 
		//Car une Capitale est aussi une Ville
		Ville[] tableau = new Ville[6];
		//Tableau de nom de villes et de nombre d'habitants
		String[] tab = {"Marseille", "Lille", "Caen", "Lyon", "Paris", "Nantes"};
		int[] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};
		//Les 3 premiers éléments seront des Villes et le reste des Capitales
		for(int i = 0; i < 6; i++){
			if(i < 3){
				Ville V = new Ville(tab[i], "France", tab2[i]);
				tableau[i] = V;
			}else{
				Capitale C = new Capitale(tab[i], "France", tab2[i], "La Tour Eiffel");
				tableau[i] = C;
			}
		}
		
		System.out.println("\nDescription du tableau :");
		//Description du tableau
		//Covariance des variables: Un objet peut etre contenu par sa superclasse
		for(Object obj : tableau){
			//System.out.println(obj.toString());
			//On doit caster l'object en ville avant d epouvoir invoquer une de ses méthodes
			System.out.println(((Ville) obj).desc());
		}
		
	}
	
	
}
