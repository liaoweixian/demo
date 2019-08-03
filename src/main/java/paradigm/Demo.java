package paradigm;

import java.lang.reflect.Array;
import java.util.*;

public class Demo {

    public static void main(String[] args) {
        Class<? extends ArrayList> aClass = new ArrayList<String>().getClass();
        Class<? extends ArrayList> aClass1 = new ArrayList<Integer>().getClass();
        System.out.println(aClass == aClass1);
    }
}

class Frob {}

class Fnorkle {}

class Quark<Q> {}

class Particle<POSITION, MOMENTUM> {}

class LostInformation {
    public static void main(String[] args) {
        List<Frob> frobs = new ArrayList<>();
        Map<Frob, Fnorkle> frobFnorkleHashMap = new HashMap<Frob, Fnorkle>();
        Quark<Fnorkle> fnorkelQuark = new Quark<Fnorkle>();
        Particle<Long, Double> longDoubleParticle = new Particle<Long, Double>();

        System.out.println(Arrays.toString(frobs.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(frobFnorkleHashMap.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(frobFnorkleHashMap.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(longDoubleParticle.getClass().getTypeParameters()));

    }
}