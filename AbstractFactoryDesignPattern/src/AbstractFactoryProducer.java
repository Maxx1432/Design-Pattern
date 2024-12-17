public class AbstractFactoryProducer {
    public AbstractFactory getFactoryInstance(String value){
        if (value.equals("Economic"))
            return new EconomicCarFactory();
        else if(value.equals("Premium") || value.equals("Luxury"))
            return new LuxuryCarFactory();
        else
            return null;
    }
}
