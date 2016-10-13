
public void setup()
{
	//your variable declarations here 
    Cow c = new Cow("cow", "moo");   
    System.out.println(c.getType() + " goes " + c.getSound());
    Chick a = new Chick("chick", "cluck");
    System.out.println(a.getType() + " goes " + a.getSound());
    Pig p = new Pig("pig", "oink");
    System.out.println(p.getType() + " goes " + p.getSound());
}