package nit.GitProj01;

/**
 * Hello world!
 */
public class App {
	
	public int sum(int x,int y)
	{
		return x+y;
	}
    public static void main(String[] args) {
        System.out.println("Hello World!");
        App app=new App();
        System.out.println("Sum of the no are:-"+app.sum(10,20));
    }
}
