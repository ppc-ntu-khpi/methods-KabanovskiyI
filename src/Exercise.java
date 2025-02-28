//package domain;

public class Exercise {
    public static String[] Calculate(int number){
        String[] result = new String[3];  // Масив для зберігання результатів
        String numberStr = Integer.toString(number);  // Перетворюємо число в рядок для доступу до кожної цифри

        // Проходимо по цифрах з кінця
        for (int i = 2; i >= 0; i--) {
            int digit = Character.getNumericValue(numberStr.charAt(i));  // Отримуємо цифру на поточній позиції
            String zero = (i == 1) ? "0" : (i == 0) ? "00" : "";  // Додаємо "0" для 2-ї цифри, "00" для 3-ї
            result[2 - i] = Greedy(digit, zero);  // Викликаємо Greedy і зберігаємо результат в масив
        }

        return result;
    }
    private static String Greedy(int target, String zero) {
        StringBuilder result = new StringBuilder();
        int[] numbers = {5, 2, 1}; // Починаємо з найбільшого
        String suffix = (zero != null) ? zero : ""; // Додаємо zero, якщо воно є

        for (int num : numbers) {
            while (target >= num) {
                if (result.length() > 0) {
                    result.append(", "); // Додаємо роздільник між числами
                }
                result.append(num).append(suffix); // Додаємо число + zero
                target -= num;   // Зменшуємо залишок
            }
        }
        return result.toString();
    }
}
