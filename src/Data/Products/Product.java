package Data.Products;

@SuppressWarnings("unused")
public abstract class Product {
    String Name, prodID;
    int Quantity;
    float cost, Price;

    abstract float getCost();
    abstract float getTotalCost();
    abstract float getPrice();
    abstract String getName();
    abstract String getProdID();
    abstract int getQuantity();

}
