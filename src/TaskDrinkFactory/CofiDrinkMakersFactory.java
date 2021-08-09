package TaskDrinkFactory;

 class CofeDrinkMakersFactory implements DrinkMakersFactory{
    @Override
    public DrinkMakers createDrinkMakers() {
        return new DrinkMakersCofe();
    }
}
