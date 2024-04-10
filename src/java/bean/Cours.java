package bean;

public class Cours{
    
    private int codecours;
    private String Titre;
    private String Contenu;
    private String Categorie;
    
    public Cours(){};
    
    public Cours(int codecours, String Titre, String Contenu, String Categorie){
        super();
        this.codecours = codecours;
        this.Titre = Titre;
        this.Contenu = Contenu;
        this.Categorie = Categorie;
    }
    
    public int getCodecours(){
        return codecours;
    }
    
    public void setCodecours(int codecours){
        this.codecours = codecours;
    }
    
    public String getTitre(){
        return Titre;
    }
    
    public void setTitre(String Titre){
        this.Titre = Titre;
    }
    
    public String getContenu(){
        return Contenu;
    }
    
    public void setContenu(String Contenu){
        this.Contenu = Contenu;
    }
    
    public String getCategorie(){
        return Categorie;
    }
    
    public void setCategorie(String Categorie){
        this.Categorie = Categorie;
    }
    
    @Override
	public String toString() {
		return "Cours [codecours=" + codecours + ", Titre=" + Titre + ", Contenu=" + Contenu + ", Categorie=" + Categorie + ","
				 + "]";
	}
}
