class Chick implements Animal 
{     
     //your code here
	private String mySound;
	private String myType;
	public Chick(String Sound,String Type)
	{
		mySound = Sound;
		myType = Type;
	}  
	public Chick()
	{
		mySound = "unknown";
		myType = "unknown";
	}
	public String getSound()
	{
		return mySound;
	}
	public String getType()
	{
		return myType;
	}
}
