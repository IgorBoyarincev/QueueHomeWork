public class Person {
    private String fullName;
    private int countTicket;

    public Person(String fullName, int countTicket) {
        this.fullName = fullName;
        this.countTicket = countTicket;
    }

    public String getFullName() {
        return fullName;
    }

    public int getCountTicket() {
        return countTicket;
    }

    public boolean useTicket() {
        boolean result = false;
        if (countTicket - 1 >= 0) {
            countTicket -= 1;
            result = true;
        }
        return result;
    }
}
