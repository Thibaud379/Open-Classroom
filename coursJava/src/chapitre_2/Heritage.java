package chapitre_2;

public class Heritage {

	public static void main(String[] args){
		System.out.println("Création d'un objet Capital vide\n");
		Capitale cap = new Capitale();
		System.out.println(cap.desc()+ "\n");
		
		
		Capitale cap1 = new Capitale("Paris", "France", 654987, "la tour Eiffel");
		System.out.println(cap1.desc());
	}
	
	
}
