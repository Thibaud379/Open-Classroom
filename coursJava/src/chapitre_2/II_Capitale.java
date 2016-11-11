package chapitre_2;

public class II_Capitale extends I_Ville{

	private String monument;
	
	
	public II_Capitale(){
		super();		//appelle le constructeur de la classe mère
		monument = "aucun";
	}
	
	public II_Capitale(String nom, String pays, int habitants, String monument){
		super(nom, pays, habitants);
		this.monument = monument;
		System.out.println("*Création d'une capitale avec des paramètres*");
	}
	//Javadoc
	/** 
	 * Description d'une capitale
	 * @return String retourne la description de l'objet
	 */
	public String desc(){
		System.out.println("*Invocation de super.desc()*\n");
		String str = super.desc()+ "\n \t ==>> " +this.monument+ " en est un monument";
		return str;
		
	}
	/**
	 * 
	 * @return Le nom du monument
	 */
	public String getMonument() {
		return monument;
	}
	//Définit le nom du monument
	public void setMonument(String monument) {
		this.monument = monument;
	}
}
