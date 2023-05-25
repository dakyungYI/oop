package ab;

public class RecipeWithMicrowave extends AbstractReceipe {
    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("Switch on the microwave");
    }

    @Override
    void doTheDish() {
        System.out.println("get stuff ready");
        System.out.println("Put in the microwave");
    }

    @Override
    void cleanup() {
        System.out.println("Cleanup the utensils");
        System.out.println("Switch off the microwave");

    }
}



