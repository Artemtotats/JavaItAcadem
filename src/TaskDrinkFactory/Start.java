package TaskDrinkFactory;

public class Start {
    public static void main(String[] args) {
        DrinkMakersFactory drinkMakersFactory = createDrinkMakersBySpecialty("Mug");
        DrinkMakers drinkMakers = drinkMakersFactory.createDrinkMakers();
        drinkMakers.prepareDrink();
    }

    static DrinkMakersFactory createDrinkMakersBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("Cup")) {
            return new CofeDrinkMakersFactory();
        } else if (specialty.equalsIgnoreCase("Mug")) {
            return new TeaDrinkMakersFactory();
        } else if (specialty.equalsIgnoreCase("Glass")) {
            return new LateDrinkMakersFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown specialty");
        }
    }
}
