package chapitre_2;


public class I_Ville {
	
	//variables locales
	public static int nbreInstances = 0;
	protected static int nbreInstancesBis = 0;  
	
	//Variables d'instance: penser � les encapsuler:
	//i.e. -> les rendre "private" afin d'empecher leur acces depuis l'ext�rieur de la classe
	//	   -> protected les rends aussi accessibles par les classes qui h�ritent
	protected String nom;					//Nom de la ville
	protected String pays;				//Pays de la ville
	protected int habitants;				//Nombre d'habitants dans la ville
	protected char categorie;				//Cat�gorie de la ville
	
	/*Constructeur par d�faut
	 *Il doit imp�rativement avoir le m�me nom que la classe
	 *Il n'a pas de type de retour
	 */
	public I_Ville(){
		System.out.println("*Cr�ation d'une ville*");
		nom = "Inconnu";
		pays = "Inconnu";
		habitants = 0;
		this.setCategorie();
		
		nbreInstances++;
		nbreInstancesBis++;
	}
	//Constructeur avec param�tres
	public I_Ville(String nom, String pays,int habitants) {
		System.out.println("*Cr�ation d'une ville avec des param�tres*");
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
				+this.habitants+ " habitant(s) => elle est donc une ville de cat�gorie: " 
				+this.categorie; 
	}
	//Retourne un String ui compare les deux villes
	public String comparer(I_Ville v){
		String str = new String();
		
		if(v.getHabitants() > this.habitants)
			str = v.getNom()+ " est une ville plus peupl�e que " +this.nom;
		else
			str = this.nom+ " est une ville plus peupl�e que " +v.getNom();
		
		return str;
	}
	
	/*Les Getters et les Setters permettent d'acc�der 
	 *au variables d'instances d'un objet en limitant 
	 *et surveillant les modifications qui y sont apport�es.	 
	 */
	
	//*************** ACCESEURS ***************
	
	//retourne la cat�gorie de la ville
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
	
	//D�finit la cat�gorie de la ville
	public void setCategorie() {
		int bornesSup[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
		char categories[] = {'?', 'A', 'B', 'C', 'D', 'E','F', 'G','H'};
		
		int i =0;
		while ( i < bornesSup.length && this.habitants > bornesSup[i])
			i++;
		
		this.categorie = categories[i];
	}
	//D�finit le nom de la ville
	public void setNom(String nom) {
		this.nom = nom;
	}
	//D�finit le pays de la ville
	public void setPays(String pays) {
		this.pays = pays;
	}
	//D�finit le nombre d'habitants de la ville
	public void setHabitants(int habitants) {
		this.habitants = habitants;
	}
}
