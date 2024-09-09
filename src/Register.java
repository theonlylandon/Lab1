public class Register {

private static final Denomination[] denominations = {
        new Denomination("Hundred Note", 100.0, "bill", "hundred.png"),
        new Denomination("Fifty Note", 50.0, "bill", "fifty.png"),
        new Denomination("Twenty Note", 20.0, "bill", "twenty.png"),
        new Denomination("Ten Note", 10.0, "bill", "ten.png"),
        new Denomination("Five Note", 5.0, "bill", "five.png"),
        new Denomination("One Note", 1.0, "bill", "one.png"),
        new Denomination("Quarter", 0.25, "coin", "quarter.png"),
        new Denomination("Dime", 0.10, "coin", "dime.png"),
        new Denomination("Nickle", 0.05, "coin", "nickle.png"),
        new Denomination("Penny", 0.01, "coin", "penny.png")
    };

public Purse makeChange(double amt) {
        Purse purse = new Purse();

        // Go through each denomination from largest to smallest
        for (int i = 0; i < denominations.length; i++) {
            Denomination denom = denominations[i];
            int count = (int) (amt / denom.amt());
            if (count > 0) {
                purse.add(denom, count);
                amt -= count * denom.amt();
            }
        }
        return purse;
    }

    public static void main(String[] args) {
        Register register = new Register();
        Purse purse = register.makeChange(29.63);
        System.out.println(purse);

    }

}
