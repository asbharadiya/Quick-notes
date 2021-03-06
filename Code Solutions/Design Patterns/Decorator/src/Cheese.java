/**
 * @author Nitinkumar Gove
 */
public class Cheese extends ItemDecorator{
	Item item;
	private String description;
	
	public Cheese(Item item) {
		super();
		this.item = item;
		this.description = "Cheese";
	}

	@Override
	public void printDescription() {
		// TODO Auto-generated method stub
		item.printDescription();
		System.out.println("+ " + description);		
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return ( 3 + item.cost() );
	}

}
