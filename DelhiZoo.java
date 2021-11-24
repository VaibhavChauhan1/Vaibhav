package zoo;

import animals.Lion;
import animals.Tiger;
import animals.Deer;
import animals.Monkey;
import animals.Elephant;
import animals.Giraffe;
public class DelhiZoo {
	Lion l = new Lion("Brown", 300, 30);
	Tiger t = new Tiger("Yello", 250, 28);
	Deer d = new Deer("Red-Brown", 100, 12);
	Monkey m = new Monkey("Brown", 30, 12);
	Elephant e = new Elephant("Grey", 4000, 10);
	Giraffe g = new Giraffe("Brown", 150, 25);
	
	public void display() {
		System.out.print("\nweight of lion is " +l.getWeight()+" kg. age of a lion is "+l.getAge() +" years. colour of a lion is "+l.getColor()+". lion is a vegetarian "+l.isVegetarian()+". lion can climb on the tree "+ l.canClimb()+". the sound of a lion is "+l.sound()+".\n\n");
		
		System.out.print("weight of a tiger is " +t.getWeight()+" kg. age of a tiger is "+t.getAge() +" years. colour of a tiger is "+t.getColor()+". tiger is a vegetarian "+t.isVegetarian()+". tiger can climb on the tree "+ t.canClimb()+". the sound of a tiger is "+t.sound()+".\n\n");
		
		System.out.print("weight of a deer is " +d.getWeight()+" kg. age of a deer is "+d.getAge() +" years. colour of a deer is "+d.getColor()+". deer is a vegetarian "+d.isVegetarian()+". deer can climb on the tree "+ d.canClimb()+". the sound of a deer is "+d.sound()+".\n\n");
		
		System.out.print("weight of a monkey is " +m.getWeight()+" kg. age of a monkey is "+m.getAge() +" years. colour of a monkey is "+m.getColor()+". monkey is a vegetarian "+m.isVegetarian()+". monkey can climb on the tree "+ m.canClimb()+". the sound of a monkey is "+m.sound()+".\n\n");
		
		System.out.print("weight of a elephant is " +e.getWeight()+" kg. age of a elephant is "+e.getAge() +" years. colour of a elephant is "+e.getColor()+". elephant is a vegetarian "+e.isVegetarian()+". elephant can climb on the tree "+ e.canClimb()+". the sound of a elephant is "+e.sound()+".\n\n");
		
		System.out.print("weight of a giraffe is " +g.getWeight()+" kg. age of a giraffe is "+g.getAge() +" years. colour of a giraffe is "+g.getColor()+". giraffe is a vegetarian "+g.isVegetarian()+". giraffe can climb on the tree "+ g.canClimb()+". the sound of a giraffe is "+g.sound()+".");
	}	
}