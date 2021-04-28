package discount;

public class DiscountTypeD implements DiscountStrategy
{
    @Override
    public double getBillAmount(double billAmount)
    {
        return billAmount - (billAmount * 0.5);
    }
}
