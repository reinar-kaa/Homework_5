public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    private static void task5() {
        //Напишите программу, которая определяет по номеру месяца в году,
        //к какому сезону этот месяц принадлежит. Например, 1 месяц (он же январь) принадлежит к сезону зима.
        //Для написания программы используйте оператор switch.
        //Для обозначения номера месяца используйте переменную monthNumber = 12.
        //Пропишите условие, при котором программа не будет выполняться (номер месяца больше 13).

        int monthNumber = 12;
        String month = "This month refers to";
        String season;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                season = "Winter";
                System.out.printf("%s %s\n", month, season);
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                System.out.printf("%s %s\n", month, season);
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                System.out.printf("%s %s\n", month, season);
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                System.out.printf("%s %s\n", month, season);
                break;
            default:
                season = "Are you really from Earth?";
                System.out.printf("%s\n", season);

        }

    }

    private static void task4() {
        //Условие задачи:
        //Напишите программу, которая выдает сообщение в консоль: "Потребуется дней: " + срок доставки
        //Объявить целочисл.переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
        //Доставка в пределах 20 км занимает сутки; От 20 км до 60 км добавляет +1 день; 60 км до 100 км добавляет +1 день.
        //Т.е. с каждым сл. интервалом доставки срок >> на 1 день.

        int deliveryDistance = 95; // km
        String howMuchDays = "Потребуется дней:";
        int days = 1;       // 1 day = 20 km // 2 = от 20 до 60 (+1 day), 3 = от 60 до 100 (+1 day)
        days = (deliveryDistance / 40) + days;      // 95/40 = 2 + 1 = 3 days way before the client.
        if (deliveryDistance >= 20 || deliveryDistance <= 60) {
            System.out.printf("%s %d\n", howMuchDays, days);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.printf("%s %d\n", howMuchDays, days);
        }

    }

    private static void task3() {
        //Напишите программу, которая определяет, является ли год високосным или нет.
        //Переменную года назовите year, в которую можно подставить значение интересующего нас года. Например, 2021.
        //Программа должна определять, високосный год или нет, и выводить соответствующее сообщение:
        //« …. год является високосным» или «... год не является високосным».
        //Високосным явл. каждый 4 год, но не явл. каждые 100. Также високосным явл. каждые 400 год.

        int year = 2017;
        String leapYear = "год является високосным";
        String notLeapYear = "год не является високосным";

        if (year < 2017 || year == 2020) {
            System.out.printf("%d %s\n", year, leapYear);
        } else if (year <=2017 || year > 2016) {
            System.out.printf("%d %s\n", year, notLeapYear);
        }

    }

    private static void task2() {
        // Условие задачи: определение ОС телефона, которым пользуется клиент (iOS или Android) и год его создания
        // От этого зависит, какая подойдет - облегченная или стандартная версия приложение для телефона или оно просто не установится.
        int clientDeviceYear = 2015; //год создания устройства (телефона)
        int clientOS = 1; // ОС: 0 = iOS, 1 = Android
        String earlyVersion = "Установите облегченную версию приложения для";
        String actualVersion = "Установите стандартную версию приложения для";
        if (clientDeviceYear <= 2015 && clientOS == 0 || clientDeviceYear >= 2015 && clientOS <= 1) {
            System.out.printf("%s iOS\n", earlyVersion);
        } else if (clientDeviceYear >= 2015 && clientOS > 1 || clientDeviceYear == 2015 && clientOS >= 0) {
            System.out.printf("%s iOS\n", actualVersion);
        }
        if (clientDeviceYear > 2015 && clientOS == 1 || clientDeviceYear <= 2015 && clientOS == 1) {
            System.out.printf("%s Android\n", actualVersion);
        } else if (clientDeviceYear >= 2015 && clientOS < 1 || clientDeviceYear < 2015 && clientOS > 1) {
            System.out.printf("%s Android\n", earlyVersion);
        }

    }

    public static void task1() {
        // Условие задачи: определение ОС телефона, которым пользуется клиент (iOS или Android)
        int clientOS = 0; // 0 = iOS, 1 = Android
        String OS = "Установите версию приложения для";

        if (clientOS < 0 || clientOS >= 1) {
            System.out.printf("%s iOS по ссылке\n", OS);
        } else if (clientOS > 0 || clientOS <= 1){
            System.out.printf("%s Android по ссылке\n", OS);
        }

        if (clientOS == 0 || clientOS >= 1) {
            System.out.printf("%s iOS по ссылке\n", OS);
        } else if (clientOS > 0 || clientOS <= 1){
            System.out.printf("%s Android по ссылке\n", OS);
        }

    }


}