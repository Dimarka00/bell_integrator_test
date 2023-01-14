package task3;

import java.util.*;

public class Staff {

    public static void main(String[] args) {
        List<Map<String, String>> employersList = new ArrayList<>();
        employersList.add(new HashMap<String, String>() {{
            put("Имя", "Кирилл");
            put("Возраст", "26");
            put("Должность", "Middle java dev");
            put("Зарплата", "150000 руб");
        }});
        employersList.add(new HashMap<String, String>() {{
            put("Имя", "Виталий");
            put("Возраст", "28");
            put("Должность", "Senior java automation QA");
            put("Зарплата", "2000$");
        }});
        employersList.add(new HashMap<String, String>() {{
            put("Имя", "Александр");
            put("Возраст", "31");
            put("Должность", "junior functional tester");
            put("Зарплата", "50000 руб");
        }});
        employersList.add(new HashMap<String, String>() {{
            put("Имя", "Дементий");
            put("Возраст", "35");
            put("Должность", "dev-ops");
            put("Зарплата", "1500$");
        }});

        List<Map<String, String>> employersUnderThirty = employersList
                .stream()
                .filter(o -> Integer.parseInt(o.get("Возраст")) < 30)
                .toList();
        System.out.println("Сотрудники младше 30:");
        employersUnderThirty.forEach(o -> System.out.println(o.get("Имя")));

        List<Map<String, String>> salaryInRuble = employersList
                .stream()
                .filter(o -> o.get("Зарплата").contains("руб"))
                .toList();
        System.out.println("\nСотрудники, получающие зарплату в рублях: ");
        salaryInRuble.forEach(o -> System.out.println(o.get("Имя")));

        int averageAge = employersList
                .stream()
                .mapToInt(o -> Integer.parseInt(o.get("Возраст"))).sum() / employersList.size();
        System.out.println("\nСредний возраст всех сотрудников: " + averageAge);
    }
}

