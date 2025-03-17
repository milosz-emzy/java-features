package ddd.policypattern;

import java.math.BigDecimal;

class Main {
    public static void main(String[] args) {
        Money price = new Money(new BigDecimal("200"));

        Money fixedDiscountValue = new Money(new BigDecimal("50"));
        DiscountPolicy fixedPolicy = new FixedAmountDiscountPolicy(fixedDiscountValue);
        System.out.println("Fixed discount is: " + fixedPolicy.calculateDiscount(price));

        DiscountPolicy percentagePolicy = new PercentageDiscountPolicy(10);
        System.out.println("Percentage discount is: " + percentagePolicy.calculateDiscount(price));

        int i = 0;
        int j = i;
        j = ++i + j;
        System.out.println(i + " - " + j);
    }

    private static void testRoundingModeHalfEven() {
        //RoundingMode.HALF_EVEN
        Money money = new Money(new BigDecimal("50.50911")); // -> 50.51
        Money money2 = new Money(new BigDecimal("50.525")); // -> 50.52
        Money money3 = new Money(new BigDecimal("50.5250000000000000000001")); // -> 50.53
        Money money4 = new Money(new BigDecimal("50.5249999999999999999999999")); // -> 50.52
        Money money11111 = new Money(new BigDecimal("50.535")); // -> 50.54

        System.out.println(money);
        System.out.println(money2);
        System.out.println(money3);
        System.out.println(money4);
        System.out.println(money11111);
    }
}
