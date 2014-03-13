
public class PasswordMatch extends Exception {
	int a;
	PasswordMatch(int a){
		this.a=a;
		if(a>3)
		{
			System.exit(0);
		}
		
	}

public String toString()
{
	return " ";
}
}