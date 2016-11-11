package chapitre_2;

public class II_Heritage {

	public static void main(String[] args){
		System.out.println("Création d'un objet Capital vide\n");
		II_Capitale cap = new II_Capitale();
		System.out.println(cap.desc()+ "\n");
		
		
		II_Capitale cap1 = new II_Capitale("Paris", "France", 654987, "la tour Eiffel");
		System.out.println(cap1.desc());
	}
	
	
}
