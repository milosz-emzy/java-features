package ddd.policypattern;

//Policy pattern from DDD, using also a strategy design pattern
interface DiscountPolicy {
    Money calculateDiscount(Money money);

}
