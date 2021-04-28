package discount;

public class DicountDefault implements DiscountStrategy
{
    @Override
    public double getBillAmount(double billAmount)
    {
        return billAmount;
    }
}
