package design;

import java.math.BigDecimal;

public class Strategy {

}

/**
 * 策略模式
 * 策略模式主要是来定义算法，一系列的算法，将每个方法进行封装，是他们能够相互替换，并且算法的变化不会影响到使用算法的人。它属于行为模式。
 * 比如，去超市买东西，结账时按正常价格计算是一种算法；如果当天搞活动打折，买东西有优惠，则是一种算法。把这些算法封装起来，按照所给条件进行不同的算法的使用就是一种策略。
 * 优点：
 * 1、把硬编码的代码改成以对象的形式维护，避免影响原有的代码。
 * 2、以抽象编程，可以提高代码通用算法的复用率。
 * 3、它提供了相同功能的不同实现。
 * 4、算法的扩展，对原有代码的影响较小。
 * 缺点：
 * 1、算法的过多，导致策略类的增加，使用时需要对每个策略类都清楚
 */
interface PriceStrategy {  //策略抽象
    BigDecimal calculate(BigDecimal price);
 }
class RemiumStrategy implements PriceStrategy {  //加价策略
    @Override
    public BigDecimal calculate(BigDecimal price) {
        return price.multiply(new BigDecimal(1.5));
    }
}
class DiscountStrategy implements  PriceStrategy { //打折
    @Override
    public BigDecimal calculate(BigDecimal price) {
        return price.multiply(new BigDecimal(0.9));
    }
}
class Context { //策略模板
    private PriceStrategy strategy;

    public PriceStrategy getStrategy() {
        return strategy;
    }
    public void setStrategy(PriceStrategy strategy) { this.strategy = strategy; }
    public BigDecimal calculate(BigDecimal price) { return strategy.calculate(price); }
    public static void main(String[] args) {
        Context context = new Context();
        RemiumStrategy remiumStrategy = new RemiumStrategy();
        context.setStrategy(remiumStrategy);
        BigDecimal calculate = context.calculate(new BigDecimal(1500));
        System.out.println(calculate);
    }
}