import java.util.HashMap;
import java.util.Map;

public class Purse {
    private Map<Denomination, Integer> cash;

    public Purse() {
        cash = new HashMap<>();

    }

    public void add(Denomination type, int num) {
        if (cash.containsKey(type)) {
            cash.put(type, cash.get(type) + num);
        }else {
            cash.put(type, num);
        }
    }

    public double remove(Denomination type, int num) {
        if (cash.containsKey(type) && cash.get(type) >= num) {
            cash.put(type, cash.get(type) - num);
            return type.amt() * num;
        }
return 0.0;
    }



}

