class Cow implements Animal 
{     
     //your code here
	protected String myType;
	protected String mySound;
	public Cow(String Type, String Sound)
	{
		myType = Type;
		mySound = Sound;
	}
	public Cow()
	{
		
	}
	public String getType()
	{
		return myType;
	}
	public String getSound()
	{
		return mySound;
	}
}