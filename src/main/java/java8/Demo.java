package java8;

import com.sun.xml.internal.ws.util.StringUtils;

import java.io.*;
import java.time.*;
import java.time.format.TextStyle;
import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {
        /*Arrays.asList("a", "b", "c").sort((a, b)->{
           return a.compareTo(b);
        });*/


        //final Car car = Car.careate(Car::new);
        //final List<Car> cars = Arrays.asList(car);
//        Optional<String> empty = Optional.empty();
//        System.out.println("empty : " + empty.orElseGet(()->"empty"));
//        if (empty.equals(null))
//        {
//            System.out.println("null");
//        }
//        Optional<String> s = empty.filter((t) -> {
//            return empty.equals(t);
//        });
//        System.out.println(s.orElseGet(() -> "empty2"));

        /*List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> collect = strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
        System.out.println("strings : " + collect.toString());

        Random random = new Random();
        random.ints().limit(10).forEach((e)->{
           System.out.println("random: " + e);
        });

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> numbersList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println("numberList: " + numbersList);

        System.out.println("strEmptyCount :" + strings.stream().filter(str -> str.isEmpty()).count());

        List<Integer> randomSorted = random.ints().limit(10).sorted().boxed().collect(Collectors.toList());
        System.out.println("randomSorted: " + randomSorted);

        //并行
        long parallelCount = strings.parallelStream().filter(str -> str.isEmpty()).count();
        System.out.println("parallelCount: " + parallelCount);

        String joinString = strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.joining(","));
        System.out.println("joinString: " + joinString);


          String dataFile = "invoicedata";

         final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
         final int[] units = { 12, 8, 13, 29, 50 };
         final String[] descs = {
                "Java T-shirt",
                "Java Mug",
                "Duke Juggling Dolls",
                "Java Pin",
                "Java Key Chain"
        };

		*//*
		 * DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new
		 * FileOutputStream(dataFile))); for (int i = 0; i < prices.length; i ++) {
		 * out.writeDouble(prices[i]); out.writeInt(units[i]); out.writeUTF(descs[i]); }
		 *//*
        
        for(int i =0; i<10; i++)
        {
        	try {
				Thread.sleep(4000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return ;
			}
        	
        	if(Thread.interrupted()) 
        	{
        		System.out.println("----------已停止");
        	}
        	System.out.println(i);
        }*/


    }
}

class Car {
    public static Car careate(final Supplier<Car> supplier) {
        return supplier.get();
    }

    public static void collide(final Car car) {
        System.out.println("Collided " + car.toString());
    }

    public void follow(final Car another) {
        System.out.println("Following the " + another.toString());
    }

    public static final void tos() {
        System.out.println("是这个意思吗？");
    }

    public void repair() {
        System.out.println("Repair " + this.toString());
    }


}

