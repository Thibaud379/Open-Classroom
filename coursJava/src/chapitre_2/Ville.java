package chapitre_2;


public class Ville {
	
	//variables locales
	public static int nbreInstances = 0;
	protected static int nbreInstancesBis = 0;  
	
	//Variables d'instance: penser à les encapsuler:
	//i.e. -> les rendre "private" afin d'empecher leur acces depuis l'extérieur de la classe
	//	   -> protected les rends aussi accessibles par les classes qui héritent
	protected String nom;					//Nom de la ville
	protected String pays;				//Pays de la ville
	protected int habitants;				//Nombre d'habitants dans la ville
	protected char categorie;				//Catégorie de la ville
	
	/*Constructeur par défaut
	 *Il doit impérativement avoir le même nom que la classe
	 *Il n'a pas de type de retour
	 */
	public Ville(){
		System.out.println("*Création d'une ville vide*");
		nom = "Inconnu";
		pays = "Inconnu";
		habitants = 0;
		this.setCategorie();
		
		nbreInstances++;
		nbreInstancesBis++;
	}
	//Constructeur avec paramètres
	public Ville(String nom, String pays,int habitants) {
		System.out.println("*Création d'une ville avec des paramètres*");
		this.nom = nom;
		this.pays = pays;
		this.habitants = habitants;
		this.setCategorie();
		
		nbreInstances++;
		nbreInstancesBis++;
	}
	//Retourne une description de la ville
	public String desc(){
		return "\t" +this.nom+ " est une ville de " +this.pays+ ", elle comporte: " 
				+this.habitants+ " habitant(s) => elle est donc une ville de catégorie: " 
				+this.categorie; 
	}
	//Retourne un String ui compare les deux villes
	public String comparer(Ville v){
		String str = new String();
		
		if(v.getHabitants() > this.habitants)
			str = v.getNom()+ " est une ville plus peuplée que " +this.nom;
		else
			str = this.nom+ " est une ville plus peuplée que " +v.getNom();
		
		return str;
	}
	
	public String toString(){
		return "\t" +this.nom+ " est une ville de " +this.pays+ ", elle comporte : "
				+this.habitants+ " => elle est donc de catégorie : " +this.categorie;
	}
	//Retourne un code similaire si l'objet est equivalent
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + categorie;
		result = prime * result + habitants;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((pays == null) ? 0 : pays.hashCode());
		return result;
	}
	//Teste l'égalité de deux objets
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ville other = (Ville) obj;
		if (categorie != other.categorie)
			return false;
		if (habitants != other.habitants)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (pays == null) {
			if (other.pays != null)
				return false;
		} else if (!pays.equals(other.pays))
			return false;
		return true;
	}
	
	/*Les Getters et les Setters permettent d'accéder 
	 *au variables d'instances d'un objet en limitant 
	 *et surveillant les modifications qui y sont apportées.	 
	 */
	
	//*************** ACCESEURS ***************
	
	
	//retourne la catégorie de la ville
	public char getCategorie() {
		return categorie;
	}
	//retourne le nom de la ville
	public String getNom() {
		return nom;
	}
	//retourne le pays de la ville
	public String getPays() {
		return pays;
	}
	//retourne le nombre d'habitants de la ville
	public int getHabitants() {
		return habitants;
	}
	//retourne le nombre de l'objet ville
	public static int getNbreInstancesBis() {
		return nbreInstancesBis;
	}

	//*************** MUTATEURS ***************
	
	//Définit la catégorie de la ville
	public void setCategorie() {
		int bornesSup[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
		char categories[] = {'?', 'A', 'B', 'C', 'D', 'E','F', 'G','H'};
		
		int i =0;
		while ( i < bornesSup.length && this.habitants > bornesSup[i])
			i++;
		
		this.categorie = categories[i];
	}
	//Définit le nom de la ville
	public void setNom(String nom) {
		this.nom = nom;
	}
	//Définit le pays de la ville
	public void setPays(String pays) {
		this.pays = pays;
	}
	//Définit le nombre d'habitants de la ville
	public void setHabitants(int habitants) {
		this.habitants = habitants;
	}
}
