class Farm 
{     
   //your code here
	private Animal[] aBunchOfAnimals = new Animal[3];
	public Farm()
	{
		aBunchOfAnimals[0] = new NamedCow("Cow");
		aBunchOfAnimals[1] = new Chick("Chick", "Cluck");
		aBunchOfAnimals[2] = new Pig("Pig", "Oink");
	}
	public void animalSounds()
	{
		for(int i = 0; i < aBunchOfAnimals.length; i++)
		{
			System.out.println(aBunchOfAnimals[i].getType() + " goes " + aBunchOfAnimals[i].getSound());
		}
		System.out.println("The cow's name is "+(NamedCow)aBunchOfAnimals[0].getName());
	}
}
