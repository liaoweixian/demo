package design;

import java.math.BigDecimal;
import java.util.Observable;
import java.util.Observer;

public class JavaApiObservationTest {
    public static void main(String[] args) {
        RMB rmb = new RMB();
        ICompany iCompany = new ICompany();
        ECompany eCompany = new ECompany();

        rmb.addObserver(iCompany);
        rmb.addObserver(eCompany);
        rmb.setPprice(BigDecimal.valueOf(10.52));
    }
}

class RMB extends Observable {
    private BigDecimal price;

    public BigDecimal getPprice() {
        return price;
    }

    public void setPprice(BigDecimal pprice) {
        this.price = pprice;
        super.setChanged();
        super.notifyObservers( this.price);
    }
}

class ICompany implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        BigDecimal price = (BigDecimal) arg;
        int compareValue = price.compareTo(new BigDecimal(0));
        if (compareValue > 0) {
            System.out.println("人民币汇率升值"+price+"个基点，降低了进口产品成本，提升了进口公司利润率。");
        }
        else if(compareValue < 0) {
            System.out.println("人民币汇率贬值(-"+price+")个基点，提升了进口产品成本，降低了进口公司利润率。");
        }
    }
}

class  ECompany implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        BigDecimal price = (BigDecimal) arg;
        int compareValue = price.compareTo(new BigDecimal(0));
        if(compareValue > 0 ) {
            System.out.println("人民币汇率升值"+price.toString()+"个基点，降低了出口产品收入，降低了出口公司的销售利润率。");
        }
        else if(compareValue < 0) {
            System.out.println("人民币汇率贬值(-"+price.toString()+")个基点，提升了出口产品收入，提升了出口公司的销售利润率。");
        }
    }
}
