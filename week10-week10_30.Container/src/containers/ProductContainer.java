package containers;

public class ProductContainer extends Container {
    private String productName;

    public ProductContainer(String productName, double tilavuus) {
        super(tilavuus);
        this.productName = productName;
    }

    public String getName() {
        return productName;
    }

    public void setName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return productName + ": " + super.toString();
    }
}
