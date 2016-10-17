class Chick implements Animal 
{     
     //your code here
	private String myType;
	private String mySound1;
	private String mySound2;
	public Chick(String Type,String Sound1,String Sound2)
	{
		myType = Type;
		mySound1 = Sound1;
		mySound2 = Sound2;
	} 
	public String getType()
	{
		return myType;
	}
	public String getSound()
	{
		if (((Math.random()*6)-3) < 0)
		{
			return mySound1;
		} 
		else
		{
			return mySound2;
		}
	}
}