package design;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式
 */
public class ObservationTest {
    public static void main(String[] args) {
        Rate rmbRate = new RMBRate();
        ImportCompany importCompany = new ImportCompany();
        ExportCompany exportCompany = new ExportCompany();
        rmbRate.add(importCompany);
        rmbRate.add(exportCompany);
        rmbRate.change(10);
    }
}

/**
 * 抽象公司
 */
interface Company {

    void response(Integer number);
}

/**
 * 具体公司
 */
class ImportCompany implements Company {

    @Override
    public void response(Integer number) {
        if (number > 0) {
            System.out.println("人民币汇率升值"+number+"个基点，降低了进口产品成本，提升了进口公司利润率。");
        }
        else if(number < 0) {
            System.out.println("人民币汇率贬值"+(-number)+"个基点，提升了进口产品成本，降低了进口公司利润率。");
        }
    }
}

/**
 * 具体公司
 */
class ExportCompany implements Company  {

    @Override
    public void response(Integer number) {
        if(number>0) {
            System.out.println("人民币汇率升值"+number+"个基点，降低了出口产品收入，降低了出口公司的销售利润率。");
        }
        else if(number<0) {
            System.out.println("人民币汇率贬值"+(-number)+"个基点，提升了出口产品收入，提升了出口公司的销售利润率。");
        }
    }
}
abstract class Rate {

    protected List<Company> companys = new ArrayList();

    /**
     * 添加观察者
     * @param company
     */
    public void add(Company company) {
        companys.add(company);
    }

    /**
     * 一处观察者
     * @param company
     */
    public void remove(Company company) {
        companys.remove(company);
    }

    /**
     * 汇率变化触发
     * @param number
     */
    public abstract void change(Integer number);
}

/**
 * 目标类
 */
class RMBRate extends Rate {

    @Override
    public void change(Integer number) {
        for (Company company : companys) {
            company.response(number);
        }
    }
}