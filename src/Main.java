import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random r = new Random();
        Scanner s = new Scanner(System.in);

        int question = r.nextInt(1, 32);

        switch (question) {
            case 1 -> {
                System.out.println("Что такое перечисление(enum)?");
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s1 = s.nextLine();
                if (s1.equals("q")) {
                    System.out.println("Это класс, который хранит в себе константы");
                    System.out.println("Можно добавить поля и методы. Конструктор будет приватным");
                }
            }
            case 2 -> {
                System.out.println("Какие на самом деле константы в перечислении?"); // не понял
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s2 = s.nextLine();
                if (s2.equals("q")) {
                    System.out.println();
                }
            }
            case 3 -> {
                System.out.println("Какие методы есть в классе enum?");
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s3 = s.nextLine();
                if (s3.equals("q")) {
                    System.out.println("values() - кладёт все константы в массив и возпращает их");
                    System.out.println("ordinal() - показывает на каком месте стоит константа");
                    System.out.println("name() - возвращает строковое значение");
                    System.out.println("valuesOf() - находит константу по слову");
                    System.out.println("toString() - возвращает имя константы");
                }
            }
            case 4 -> {
                System.out.println("Почему модификатор доступа конструктора enum по умолчанию приватный?");
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s4 = s.nextLine();
                if (s4.equals("q")) {
                    System.out.println("Потому что enum это конечные значения");
                }
            }
            case 5 -> {
                System.out.println("Зачем нужна обработка исключений?");
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s5 = s.nextLine();
                if (s5.equals("q")) {
                    System.out.println("Что бы программа не прекратила работу");
                }
            }
            case 6 -> {
                System.out.println("Что такое Try с ресурсами?");
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s6 = s.nextLine();
                if (s6.equals("q")) {
                    System.out.println("оператор try в котором объявляются ресурсы. По завершению болока - ресурс закрывается.");
                    System.out.println("Проподает необходимость сисать finally");
                }
            }
            case 7 -> {
                System.out.println("Что означает проверенное и непроверенное исключение?");
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s7 = s.nextLine();
                if (s7.equals("q")) {
                    System.out.println("Проверенное - во время компиляции");
                    System.out.println("Непроверенное - после Run");
                }
            }
            case 8 -> {
                System.out.println("Зачем нам нужно ключевое слово throws?");
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s8 = s.nextLine();
                if (s8.equals("q")) {
                    System.out.println("Для предупреждения что здесь возможно будет ошибка");
                }
            }
            case 9 -> {
                System.out.println("Можем ли мы обработать ошибку?"); //
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s9 = s.nextLine();
                if (s9.equals("q")) {
                    System.out.println("Нет");
                }
            }
            case 10 -> {
                System.out.println("Что содержит каркас коллекции?");
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s10 = s.nextLine();
                if (s10.equals("q")) {
                    System.out.println("List, Queue, Deque, Set");
                }
            }
            case 11 -> {
                System.out.println("Какие интерфейсы расширяют интерфейс Collection?");
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s11 = s.nextLine();
                if (s11.equals("q")) {
                    System.out.println("Все которые есть в колекции");
                }
            }
            case 12 -> {
                System.out.println("Как работает ArrayList?");
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s12 = s.nextLine();
                if (s12.equals("q")) {
                    System.out.println("Как обычный массив, только динамичнее");
                }
            }
            case 13 -> {
                System.out.println("Как работает LinkedList?");
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s13 = s.nextLine();
                if (s13.equals("q")) {
                    System.out.println("Связанный список");
                }
            }
            case 14 -> {
                System.out.println("Какая разница между ArrayList и LinkedList?");
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s14 = s.nextLine();
                if (s14.equals("q")) {
                    System.out.println("ArrayList - это список на основе массива. LinkedList - связанный список на основе элементов и связи между ними");
                }
            }
            case 15 -> {
                System.out.println("В чем особенность интерфейса Set?");
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s15 = s.nextLine();
                if (s15.equals("q")) {
                    System.out.println("Set не хранит в себе дубликаты");
                }
            }
            case 16 -> {
                System.out.println("Есть ли индексы в интерфейсе Set?");
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s16 = s.nextLine();
                if (s16.equals("q")) {
                    System.out.println("Нет");
                }
            }
            case 17 -> {
                System.out.println("В чем разница между HashSet LinkedHashSet и TreeSet?");
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s17 = s.nextLine();
                if (s17.equals("q")) {
                    System.out.println("TreeSet выводит элементы сортируя их");
                    System.out.println("LinkedHashSet выводит элементы в том порядке, в котором мы их добавили");
                    System.out.println("HashSet может вывести элементы вразбос");
                }
            }
            case 18 -> {
                System.out.println("Что означает методы equals hashCode и откуда они взялись?");
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s18 = s.nextLine();
                if (s18.equals("q")) {
                    System.out.println("equals сравнивает два объекта логически");
                    System.out.println("hashCode уникальный номер");
                }
            }
            case 19 -> {
                System.out.println("Почему Карта не расширяет интерфейс Коллекции?");
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s19 = s.nextLine();
                if (s19.equals("q")) {
                    System.out.println("Он не входит в Коллекцию");
                }
            }
            case 20 -> {
                System.out.println("Зачем нам нужен дженерик в java?");
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s20 = s.nextLine();
                if (s20.equals("q")) {
                    System.out.println("Если мы пока не знаем какой тип дадим - используем дженерик");
                }
            }
            case 21 -> {
                System.out.println("Что мы можем облагородить?");
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s21 = s.nextLine();
                if (s21.equals("q")) {
                    System.out.println("Класс, метод, поля");
                }
            }
            case 22 -> {
                System.out.println("Зачем нужны подстановочные знаки дженериков?"); // не понял
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s22 = s.nextLine();
                if (s22.equals("q")) {
                    System.out.println("Для ограничения");
                }
            }
            case 23 -> {
                System.out.println("Что такое анонимный класс?");
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s23 = s.nextLine();
                if (s23.equals("q")) {
                    System.out.println("Класс который можно использовать один раз");
                    System.out.println("Нет конструктора. Есть метод не можем использовать. Не имеет имени");
                    System.out.println("Каждый анонимный класс уникальный");
                }
            }
            case 24 -> {
                System.out.println("Что такое функциональный интерфейс и зачем он нам нужен?");
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s24 = s.nextLine();
                if (s24.equals("q")) {
                    System.out.println("Интерфейс который содежит один абстракный метод");
                    System.out.println("Даёт возможность передовать функции как параметр другим методам");
                    System.out.println("Статик или дефолт методы не считаются");
                }
            }
            case 25 -> {
                System.out.println("Что такое лямбда?");
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s25 = s.nextLine();
                if (s25.equals("q")) {
                    System.out.println("Альтернатива анонимным классам (анонимные функции) Метод без объявления");
                }
            }
            case 26 -> {
                System.out.println("Зачем нам Stream API?");
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s26 = s.nextLine();
                if (s26.equals("q")) {
                    System.out.println("Это способ работать со структурами данных");
                    System.out.println("Нужен для упрощения работы с набором данных");
                    System.out.println("Упростить операции фильтрации");
                }
            }
            case 27 -> {
                System.out.println("Как работают потоки?");
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s27 = s.nextLine();
                if (s27.equals("q")) {
                    System.out.println("1. Создаётся экземпяр необходимого потока");
                    System.out.println("2. Последний открывается для считывания. При необходимости для записи новой информации");
                    System.out.println("3. Проводим действия");
                    System.out.println("Закрытие потока");
                }
            }
            case 28 -> {
                System.out.println("Какие промежуточные операторы вы знаете?");
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s28 = s.nextLine();
                if (s28.equals("q")) {
                    System.out.println("Оператор map - преобразовывает элемент и возвращает новый поток");
                    System.out.println("filter, collect");
                }
            }
            case 29 -> {
                System.out.println("Должны ли мы всегда использовать промежуточные операторы?");
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s29 = s.nextLine();
                if (s29.equals("q")) {
                    System.out.println("Да");
                }
            }
            case 30 -> {
                System.out.println("Можем ли мы создать поток (stream) без операторов терминала?");
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s30 = s.nextLine();
                if (s30.equals("q")) {
                    System.out.println("Нет");
                }
            }
            case 31 -> {
                System.out.println("Можем ли мы использовать несколько операторов терминала в одном потоке?"); //
                System.out.println("нажмите q и enter чтобы узнать ответ");
                String s31 = s.nextLine();
                if (s31.equals("q")){
                    System.out.println("Нет");
                }
            }

        }

    }
}