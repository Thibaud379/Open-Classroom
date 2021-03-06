package chapitre_2;

public class Capitale extends Ville{

	private String monument;
	
	
	public Capitale(){
		
		super();	//appelle le constructeur de la classe m�re
		System.out.println("*Cr�ation d'une capitale vide*");
		monument = "aucun";
		
	}
	
	public Capitale(String nom, String pays, int habitants, String monument){
		
		super(nom, pays, habitants);
		System.out.println("*Cr�ation d'une capitale avec des param�tres*");
		this.monument = monument;
	}
	//Javadoc
	/** 
	 * Description d'une capitale
	 * @return String retourne la description de l'objet
	 */
	public String desc(){
		String str = super.desc()+ "\n \t ==>> " +this.monument+ " en est un monument";
		return str;
		
	}
	
	public String toString(){
		String str = super.toString()+ "\n \t ==>" +this.monument+ " en est un monument";
		return str;
	}
	
	/**
	 * 
	 * @return Le nom du monument
	 */
	public String getMonument() {
		return monument;
	}
	//D�finit le nom du monument
	public void setMonument(String monument) {
		this.monument = monument;
	}
}
