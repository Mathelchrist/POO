
public class Wilder {
	
    private String firstName;
    private boolean aware;
    
    public Wilder() {}

    public Wilder(String firstName, boolean aware) {

        this.firstName = firstName;
        this.aware = aware;

    }


	public String getFirsName() {
		return firstName;
	}

	public void setFirsName(String firsName) {
		this.firstName = firsName;
	}

	public boolean isAware() {
		return aware;
	}

	public void setAware(boolean aware) {
		this.aware = aware;
	}

	public String whoIAm() {
		String  pas = "";
		String ne = "";
		if(!this.aware) {
			pas = "pas ";
			ne = "ne ";
		}
		return "Je m'appelle "+ this.firstName +" et je "+ne +"suis "+pas+"aware";
	}
	public static void main(String[] args) {
	}
    
}
