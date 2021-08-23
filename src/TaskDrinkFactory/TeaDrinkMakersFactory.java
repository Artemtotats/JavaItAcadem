package TaskDrinkFactory;

class TeaDrinkMakersFactory implements DrinkMakersFactory {
    @Override
    public DrinkMakers createDrinkMakers() {
        return new DrinkMakersTea();
    }
}
