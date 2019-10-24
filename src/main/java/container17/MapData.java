package container17;

import java.util.LinkedHashMap;

public class MapData<K,V> extends LinkedHashMap<K,V> {

    public MapData(Generator<Pair<K,V>> gen, int quantity) {

        for (int i = 0; i < quantity; i++)
        {
            Pair<K,V> p = gen.next();
            put(p.key, p.value);
        }
    }

    public MapData(Generator<Pair<K,V>> genK, Generator<Pair<K,V>> genV, int quantity) {

        for (int i = 0; i < quantity; i++)
        {
            Pair<K, V> key = genK.next();
            Pair<K, V> value = genV.next();
            put(key,value);
        }
    }

    private void put(Pair<K,V> key, Pair<K,V> value) {
        put(key,value);
    }



}
