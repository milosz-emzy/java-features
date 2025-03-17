package ddd.policypattern;

class FixedAmountDiscountPolicy implements DiscountPolicy {

    private final Money discountAmount;

    public FixedAmountDiscountPolicy(Money discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public Money calculateDiscount(Money price) {
        return discountAmount;
    }
}
