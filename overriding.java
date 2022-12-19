package oops;
class vehicle{
	static void run()
	{
		System.out.println("vehicle is running");
	}
}

 public class overriding extends vehicle{
	public static void main(String args[])
	{
		overriding b=new overriding();
		overriding.run();

}
}