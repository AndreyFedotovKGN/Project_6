import java.util.Arrays;
public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
//### Задание 1
//Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
//Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
//в формате: «Сумма трат за месяц составила … рублей».
        System.out.println("Задание 1");

        int monthlyPaymentAmount = 0;
        for (int j : arr) {
            monthlyPaymentAmount += j;
        }
        System.out.println("Сумма трат за месяц составила " + monthlyPaymentAmount + " рублей.");
//### Задание 2
//Следующая задача — найти минимальную и максимальную трату за день.
//Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
//в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
        System.out.println("Задание 2");
        arr = generateRandomArray();
        int maxWaste = 1;
        int minWaste = 201_000;
        double averageWaste;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxWaste) {
                maxWaste = arr[i];
            } else if (arr[i] < minWaste) {
                minWaste = arr[i];
            } else if (i == arr.length-1) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr [i] + " ");
            }
        System.out.println("Максимальная сумма трат за день составила " + maxWaste + " рублей.");
        System.out.println("Минимальная сумма трат за день составила " + minWaste + " рублей.");
//### Задание 3
//А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
//Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней),
// и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
//Важно помнить:** подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).
        System.out.println("Задание 3");
        averageWaste = (int) Math.ceil((maxWaste-minWaste)/30.0);
        System.out.println("Средняя сумма трат за месяц составила " + averageWaste + " рублей.");
//Задание 4
//В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф. И. О. сотрудников начали отображаться в обратную сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
//Данные с именами сотрудников хранятся в виде массива символов (char[]).
//Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде. В качестве данных для массива используйте:
//char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
//В результате в консоль должно быть выведено "Ivanov Ivan".
//**Важно**: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length-1; i <= reverseFullName.length; i--) {
            if (i >= 0) {
                System.out.print(reverseFullName[i]);
            } else
                break;
        }










    }
}