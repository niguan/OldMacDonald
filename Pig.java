class Pig implements Animal 
{     
     //your code here
	private String mySound;
	private String myType;
	public Pig(String Type, String Sound)
	{
		mySound = Sound;
		myType = Type;
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