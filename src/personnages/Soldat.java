package personnages;

public class Soldat extends Romain{
	
	public Grade grade; 
	
	public Soldat(String nom, int force, Grade garde) {
		super(nom, force); 
		this.grade = garde; 
	}

}