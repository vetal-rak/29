package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Змінні для зберігання прізвища, імені та по батькові курсанта
        String lastName = "Прізвище";
        String firstName = "Ім'я";
        String patronymic = "По батькові";

        // Виведення прізвища, імені та по батькові курсанта
        System.out.println("Прізвище, ім'я та по батькові курсанта: " + lastName + " " + firstName + " " + patronymic);

        // Питання для тестування
        String[] questions = {
                "1. Як перекласти фразове дієслово 'take off'?",
                "2. Як перекласти фразове дієслово 'give up'?",
                "3. Як перекласти фразове дієслово 'put off'?",
                "4. Як перекласти фразове дієслово 'get along'?",
                "5. Як перекласти фразове дієслово 'turn down'?"
        };

        // Правильні відповіді
        String[] correctAnswers = {"a", "c", "b", "d", "c"};

        // Запитання та перевірка відповідей
        int totalQuestions = questions.length;
        int correctCount = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < totalQuestions; i++) {
            System.out.println(questions[i]);
            System.out.println("Варіанти відповідей: (a) переклад 1, (b) переклад 2, (c) переклад 3, (d) переклад 4");
            System.out.print("Введіть букву відповіді (або 'с' для завершення): ");
            String userAnswer = scanner.nextLine().toLowerCase();

            if (userAnswer.equals("с")) {
                break;
            }

            if (!userAnswer.matches("[a-d]")) {
                System.out.println("Некоректний варіант відповіді. Будь ласка, спробуйте знову.");
                i--;
                continue;
            }

            if (userAnswer.equals(correctAnswers[i])) {
                correctCount++;
            }
        }

        // Виведення результатів тестування
        double score = (double) correctCount / totalQuestions * 100;
        System.out.println("Результати тестування: " + score + "% правильних відповідей");

        // Перевірка пароля для перегляду правильних відповідей
        System.out.print("Введіть пароль для перегляду правильних відповідей: ");
        String password = scanner.nextLine();

        if (password.equals("1111")) {
            System.out.println("Правильні відповіді:");

            for (int i = 0; i < totalQuestions; i++) {
                System.out.println(questions[i]);
                System.out.println("Правильна відповідь: варіант " + correctAnswers[i]);
            }
        } else {
            System.out.println("Неправильний пароль. Правильні відповіді недоступні.");
        }


        scanner.close();
    }
}