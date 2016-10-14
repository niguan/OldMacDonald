class Cow implements Animal 
{     
     //your code here
	protected String mySound;
	protected String myType;
	public Cow(String Type, String Sound)
	{
		myType = Type;
		mySound = Sound;
	}
	public Cow()
	{
		
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