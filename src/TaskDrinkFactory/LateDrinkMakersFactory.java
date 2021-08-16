package TaskDrinkFactory;

  class LateDrinkMakersFactory implements DrinkMakersFactory{
    @Override
    public DrinkMakers createDrinkMakers() {
        return new DrinkMakersLatte();
    }
}
