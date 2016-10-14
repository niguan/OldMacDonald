class NamedCow extends Cow
{
	private String myName;
	public NamedCow(String Sound, String Type, String Name)
	{
		mySound = Sound;
		myType = Type;
		myName = Name;
	}
	public String getName()
	{
		return myName;
	}
}