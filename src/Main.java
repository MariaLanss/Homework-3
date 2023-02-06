public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        int profession = 40000;
        System.out.println("Значение переменной int с типом profession равно " + profession);
        byte lessons = 22;
        System.out.println("Значение переменной byte с типом lessons равно " + lessons);
        short course = 32000;
        System.out.println("Значение переменной short с типом cource равно " + course);
        long year = 1000000;
        System.out.println("Значение переменной long с типом year равно " + year);
        float hours = 3;
        System.out.println("Значение переменной float с типом hours равно " + hours);
        double day = 1;
        System.out.println("Значение переменной double с типом day равно " + day);
    }

    public static void task2() {
        int profession = -159;
        System.out.println("Значение переменной int с типом profession равно " + profession);
        byte lessons = 67;
        System.out.println("Значение переменной byte с типом lessons равно " + lessons);
        short course = 27897;
        System.out.println("Значение переменной short с типом cource равно " + course);
        long year = 987678965549L;
        System.out.println("Значение переменной long с типом year равно " + year);
        float hours = 2.786f;
        System.out.println("Значение переменной float с типом hours равно " + hours);
        double day = 27.12d;
        System.out.println("Значение переменной double с типом day равно " + day);
        short classes = 569;
        System.out.println("Значение переменной short с типом classes равно " + classes);
    }

    public static void task3() {
        short ludmilaPavlovna = 23;
        short annaSergeevna = 27;
        short ekaterinaAndreevna = 30;
        short allPaper = 480;
        long allStudents = ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        System.out.println("На каждого ученика рассчитано " + allPaper / allStudents + " листов бумаги");

    }

    public static void task4() {
        byte twoMinutes = 16;
        int oneMinute = twoMinutes / 2;
        System.out.println("За одну минуту машина произвела " + oneMinute + " штук бутылок");
        int twentyMinutes = oneMinute * 20;
        System.out.println("За двадцать минут машина произвела " + twentyMinutes + " штук бутылок");
        int day = oneMinute * 1440;
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        int threeDays = oneMinute * 4320;
        System.out.println("За трое суток машина произвела " + threeDays + " штук бутылок");
        int month = oneMinute * 43800;
        System.out.println("За один месяц машина произвела " + month + " штук бутылок");
    }

    public static void task5() {
        int totalCans = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int oneClass = whitePaint + brownPaint;
        int allClasses = totalCans / oneClass;
        int white = allClasses * whitePaint;
        int brown = allClasses * brownPaint;
        System.out.println("В школе, где " + allClasses + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски");
    }

    public static void task6() {
        int bananas = 5;
        int milk = 200;
        int iceCream = 2;
        int eggs = 4;
        int weightOfBananas = bananas * 80;
        int weightOfMilk = (milk * 105) / 100;
        int weightOfIceCream = iceCream * 100;
        int weightOfEggs = eggs * 70;
        int totalWeight = weightOfEggs + weightOfBananas + weightOfMilk + weightOfIceCream;
        System.out.println("Общий вес спортзавтрака составил " + totalWeight + " граммов");
        int weightInGrams = totalWeight / 1000;
        System.out.println("Общий вес спортзавтрака составил " + weightInGrams + " килограмм");
    }

    public static void task7() {
        int weightLoss = 7;
        int weightLossInGrams = weightLoss * 1000;
        int loseOf250Grams = weightLossInGrams / 250;
        System.out.println("Если спортсмен будет терять по 250 грамм в день, то у него уйдет на это " + loseOf250Grams + " дней");
        int loseOf500Grams = weightLossInGrams / 500;
        System.out.println("Если спортсмен будет терять по 500 грамм в день, то у него уйдет на это " + loseOf500Grams + " дней");
        int totalDays = loseOf250Grams + loseOf500Grams;
        int daysOnAverage = totalDays / 2;
        System.out.println("В среднем спортсмену понадобится " + daysOnAverage + " день");
    }

    public static void task8() {
        long mashaSalary = 67760;
        long mashaIncrease = (mashaSalary * 10) / 100;
        long mashaNewSalary = mashaIncrease + mashaSalary;
        long denisSalary = 83690;
        long denisIncrease = (denisSalary * 10) / 100;
        long denisNewSalary = denisIncrease + denisSalary;
        long kristinaSalary = 76230;
        long kristinaIncrease = (kristinaSalary * 10) / 100;
        long kristinaNewSalary = kristinaIncrease + kristinaSalary;
        System.out.println("Новая зарплата Маши за месяц составит " + mashaNewSalary + " рублей");
        System.out.println("Новая зарплата Дениса за месяц составит " + denisNewSalary + " рублей");
        System.out.println("Новая зарплата Кристины за месяц составит " + kristinaNewSalary + " рублей");

        long mashaSalaryYear = mashaSalary * 12;
        long denisSalaryYear = denisSalary * 12;
        long kristinaSalaryYear = kristinaSalary * 12;

        long mashaNewSalaryYear = mashaNewSalary * 12;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + (mashaNewSalaryYear - mashaSalaryYear) + " рублей");
        long denisNewSalaryYear = denisNewSalary * 12;
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + (denisNewSalaryYear - denisSalaryYear) + " рублей");
        long kristinaNewSalaryYear = kristinaNewSalary * 12;
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + (kristinaNewSalaryYear - kristinaSalaryYear) + " рублей");
    }

}