public class PizzaMaker{

        public static void main(String[] args)
        {

            Pizza basicPizza = new Sauce(new Mozzarella(new PlainPizza()));

            System.out.println("Ingredients: " + basicPizza.getDescription());
            System.out.println("Full Price: " + basicPizza.getCost());

        }
}