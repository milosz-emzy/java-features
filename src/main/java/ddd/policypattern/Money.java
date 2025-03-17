package ddd.policypattern;

import java.math.BigDecimal;
import java.math.RoundingMode;

record Money(BigDecimal amount) {

    Money(BigDecimal amount) {
        if (amount == null) {
            throw new IllegalArgumentException();
        }
        this.amount = setScale(amount);
    }

    Money add(Money money) {
        return new Money(this.amount.add(money.amount()));
    }

    Money subtract(Money money) {
        return new Money(this.amount.subtract(money.amount()));
    }

    Money multiply(int multiplier) {
        return new Money(setScale(this.amount.multiply(new BigDecimal(multiplier))));
    }

    private BigDecimal setScale(BigDecimal input) {
        return input.setScale(2, RoundingMode.HALF_EVEN);
    }
}
