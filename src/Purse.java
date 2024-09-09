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

public double getValue(){

    double totalVal = 0.0;
    for (Map.Entry<Denomination, Integer> entry : cash.entrySet()) {
        Denomination denomination = entry.getKey();
        int count = entry.getValue();
        totalVal += denomination.amt() * count;

    }
return totalVal;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Purse contains:\n");
        for (Map.Entry<Denomination, Integer> entry : cash.entrySet()) {
            sb.append(entry.getValue()).append(" x ").append(entry.getKey().name()).append("\n");
        }
        return sb.toString();
    }

}

