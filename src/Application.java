
public class Application {

	public static void main(String[] args) {

		// Product aanmaken
		Product product1 = new Product();
		// Product vullen
		// (private geworden) product1.name = "TV";
		// (private geworden) product1.price = 120;
		product1.printDetails();		
		product1.stelPrijsIn(290);
		product1.printDetails();
		String productnaam = product1.watIsDeNaam();
		int prijs = product1.watIsDePrijs();
		
		System.out.println(productnaam);
		System.out.println(prijs);

		Product product2 = new Product();
		// (private geworden) product2.name = "Wasmachine";
		// (private geworden) product2.price = 300;
		product2.printDetails();
	
		
		Cat c = new Cat();
		c.setLegs(4);
		c.setName("Sylvester");
		System.out.println(c.getName());
		System.out.println(c.name);//dit mag vanwege het feit daat ze in dezelfde package zitten
		System.out.println(c.getLegs());
		System.out.println(c.legs);

		Dog d = new Dog();
		d.setLegs(4);
		d.setName("Spike");
		System.out.println(d.getName());
		System.out.println(d.name);
		System.out.println(d.getLegs());
		System.out.println(d.legs);
	}

}
