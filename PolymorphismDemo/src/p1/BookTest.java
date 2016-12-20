package p1; //inheritance

class Book
{
	String authorname;
	String title;
	double price;
	int pages;
}
class software extends Book
{
	float swversion;
	String swname;
	public void showSW()
	{
		authorname="Kevin";
		title="Excellent";
		price=350;
		pages=200;
		swversion=1.8f;
		swname="Java";
		System.out.println("author name is "+authorname);
		System.out.println("title is "+title);
		System.out.println("price is "+price);
		System.out.println("pages are "+pages);
		System.out.println("swversion is "+swversion);
		System.out.println("swname is "+swname);
	}
}
class hardware extends Book
{
	String category;
	String publisher;
	public void showSW()
	{
		authorname="San";
		title="Iphone";
		price=450;
		pages=100;
		category="down version";
		publisher="joan";
		System.out.println("author name is "+authorname);
		System.out.println("title is "+title);
		System.out.println("price is "+price);
		System.out.println("pages are "+pages);
		System.out.println("category is "+category);
		System.out.println("publisher is "+publisher);
	
}
}
public class BookTest {

	public static void main(String[] args) {
		software s1=new software(); //we created objects for child class here. this is called re-usabilty. 
		s1.showSW();
		hardware h1=new hardware();
		h1.showSW();

	}

}
