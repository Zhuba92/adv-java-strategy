package discount;

public class DiscountTypeL implements DiscountStrategy
{
    @Override
    public double getBillAmount(double billAmount)
    {
        return billAmount - (billAmount * 0.75);
    }
}
