class NamedCow extends Cow
{
	private String myName;
	public NamedCow(String Type, String Sound,String Name)
	{
		myType = Type;
		mySound = Sound;
		myName = Name;
	}
	public String getName()
	{
		return myName;
	}
}