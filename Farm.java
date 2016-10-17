class Farm 
{     
   //your code here 
   private Animal [] aBunchOfAnimals = new Animal[3];    
   public Farm()     
   {       
      aBunchOfAnimals[0] = new NamedCow("Cow","moo!","Elsie");           
      aBunchOfAnimals[1] = new Chick("Chick","cheep!","cluck!");       
      aBunchOfAnimals[2] = new Pig("Pig","oink!");    
  }         
   public void animalSounds()    
   {       
     for (int nI=0; nI < aBunchOfAnimals.length; nI++)       
     {          
    	System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());       
     }    
    	System.out.println( "The cow is known as " + ((NamedCow)aBunchOfAnimals[0]).getName());
    } 
} 

