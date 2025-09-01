package RegexJunit.Regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {
    public boolean isValidUsername(String username) {
        return username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,14}$");
    }
    public boolean isValidLicensePlate(String plate) {
        return plate.matches("^[A-Z]{2}\\d{4}$");
    }
    public boolean isValidHexColor(String color) {
        return color.matches("^#([A-Fa-f0-9]{6})$");
    }
    public List<String> extractEmails(String text) {
        Matcher m = Pattern.compile("[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}").matcher(text);
        List<String> emails = new ArrayList<>();
        while (m.find()) emails.add(m.group());
        return emails;
    }
    public List<String> extractCapitalizedWords(String text) {
        Matcher m = Pattern.compile("\\b[A-Z][a-z]*\\b").matcher(text);
        List<String> words = new ArrayList<>();
        while (m.find()) words.add(m.group());
        return words;
    }
    public List<String> extractDates(String text) {
        Matcher m = Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b").matcher(text);
        List<String> dates = new ArrayList<>();
        while (m.find()) dates.add(m.group());
        return dates;
    }
    public List<String> extractLinks(String text) {
        Matcher m = Pattern.compile("https?://\\S+").matcher(text);
        List<String> links = new ArrayList<>();
        while (m.find()) links.add(m.group());
        return links;
    }

    public String normalizeSpaces(String input) {
        return input.replaceAll("\\s{2,}", " ");
    }

    public String censorBadWords(String input, List<String> badWords) {
        for (String word : badWords) {
            input = input.replaceAll("(?i)\\b" + Pattern.quote(word) + "\\b", "****");
        }
        return input;
    }
    public boolean isValidIPAddress(String ip) {
        String regex = "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)(\\.|$)){4}$";
        return ip.matches(regex);
    }
    public boolean isValidVisa(String card) {
        return card.matches("^4\\d{15}$");
    }

    public boolean isValidMasterCard(String card) {
        return card.matches("^5\\d{15}$");
    }

    public List<String> extractLanguages(String text) {
        Matcher m = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b").matcher(text);
        List<String> langs = new ArrayList<>();
        while (m.find()) langs.add(m.group());
        return langs;
    }

    public List<String> extractCurrencyValues(String text) {
        Matcher m = Pattern.compile("\\$?\\d+\\.\\d{2}").matcher(text);
        List<String> values = new ArrayList<>();
        while (m.find()) values.add(m.group());
        return values;
    }
    public Set<String> findRepeatingWords(String text) {
        Matcher m = Pattern.compile("\\b(\\w+)\\b\\s+\\1\\b").matcher(text);
        Set<String> repeats = new HashSet<>();
        while (m.find()) repeats.add(m.group(1));
        return repeats;
    }
    public boolean isValidSSN(String ssn) {
        return ssn.matches("^\\d{3}-\\d{2}-\\d{4}$");
    }

    public static void main(String[] args) {
        RegexPractice rp = new RegexPractice();

        // 1. Username Validation
        System.out.println("Username Valid: " + rp.isValidUsername("user_123")); // true
        System.out.println("Username Invalid: " + rp.isValidUsername("123user")); // false

        // 2. License Plate Validation
        System.out.println("License Plate Valid: " + rp.isValidLicensePlate("AB1234")); // true
        System.out.println("License Plate Invalid: " + rp.isValidLicensePlate("A12345")); // false

        // 3. Hex Color Validation
        System.out.println("Hex Color Valid: " + rp.isValidHexColor("#FFA500")); // true
        System.out.println("Hex Color Invalid: " + rp.isValidHexColor("#123")); // false

        // 4. Extract Emails
        System.out.println("Emails: " + rp.extractEmails("Contact us at support@example.com and info@company.org"));

        // 5. Extract Capitalized Words
        System.out.println("Capitalized Words: " + rp.extractCapitalizedWords("The Eiffel Tower is in Paris and the Statue of Liberty is in New York."));

        // 6. Extract Dates
        System.out.println("Dates: " + rp.extractDates("The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020."));

        // 7. Extract Links
        System.out.println("Links: " + rp.extractLinks("Visit https://www.google.com and http://example.org for more info."));

        // 8. Normalize Spaces
        System.out.println("Normalized: " + rp.normalizeSpaces("This  is   an example    with multiple   spaces."));

        // 9. Censor Bad Words
        List<String> badWords = Arrays.asList("damn", "stupid");
        System.out.println("Censored: " + rp.censorBadWords("This is a damn bad example with some stupid words.", badWords));

        // 10. IP Address Validation
        System.out.println("IP Valid: " + rp.isValidIPAddress("192.168.1.1")); // true
        System.out.println("IP Invalid: " + rp.isValidIPAddress("999.999.999.999")); // false

        // 11. Credit Card Validation
        System.out.println("Visa Valid: " + rp.isValidVisa("4123456789012345")); // true
        System.out.println("MasterCard Valid: " + rp.isValidMasterCard("5123456789012345")); // true

        // 12. Extract Programming Languages
        System.out.println("Languages: " + rp.extractLanguages("I love Java, Python, and JavaScript, but I haven't tried Go yet."));

        // 13. Extract Currency Values
        System.out.println("Currency Values: " + rp.extractCurrencyValues("The price is $45.99, and the discount is 10.50."));

        // 14. Find Repeating Words
        System.out.println("Repeating Words: " + rp.findRepeatingWords("This is is a repeated repeated word test."));

        // 15. SSN Validation
        System.out.println("SSN Valid: " + rp.isValidSSN("123-45-6789")); // true
        System.out.println("SSN Invalid: " + rp.isValidSSN("123456789")); // false
    }


}
