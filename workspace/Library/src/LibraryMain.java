import java.util.ArrayList;



class Books {

	String ISBN, author ,title, category;
	float price;
	Books(String ISBN,String author, String title,String category,int price )
	{
		this.ISBN=ISBN;
		this.author=author;
		this.title=title;
		this.price=price;
		this.category=category;
	}
}

public class LibraryMain extends database{

public static void main(String s[])
{
	
	System.out.println("main");
	new LoginWindow();
	
}
}
