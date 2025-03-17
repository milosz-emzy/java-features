package ddd.policypattern;

class PercentageDiscountPolicy implements DiscountPolicy{

    private final int percentage;

    PercentageDiscountPolicy(int percentage) {
        this.percentage = percentage;
    }

    @Override
    public Money calculateDiscount(Money money) {
        return money.multiply(percentage);
    }
}
