package exercices.optional;

import java.util.HashMap;
import java.util.Optional;

class Exo1 {

    private static final HashMap<String, String> PHONE_NUMBERS = new HashMap<String, String>() {
        {
            put("Jos de Vos", "016/161616");
            put("An de Toekan", "016/161617");
            put("Kris de Vis", "016/161618");
        }
    };

    public Exo1() {
    }

    private HashMap<String, String> phoneBookEntries = PHONE_NUMBERS;

    public HashMap<String, String> getPhoneBookEntries() {
        return phoneBookEntries;
    }

    public Optional<String> findPhoneNumberByName(String name) {
        return null;
    }

    public Optional<String> findNameByPhoneNumber(String phoneNumber) {
        return null;
    }

    @Override
    public String toString() {
        System.out.println("Hello from PhoneBook's toString method");
        return "PhoneBook{" +
                "phoneBookEntries=" + phoneBookEntries +
                '}';
    }
}
