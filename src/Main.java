public class Main {
    public static void main(String[] args) {

        System.out.println("Тестовые задания, домашка 2");

        System.out.println("Тестовое задание 1"); // Присвоение значений переменным
        var dog = 8.0;
        System.out.println("dog = " +dog);
        var cat = 3.6;
        System.out.println("cat = " +cat);
        var paper = 763789;
        System.out.println("paper = " +paper);

        System.out.println("Тестовое задание 2"); // умножение переменных на 4
        dog = dog * 4;
        System.out.println("dog * 4 = " +dog);
        cat = cat * 4;
        System.out.println("cat * 4 = " +cat);
        paper = paper * 4;
        System.out.println("paper * 4 = " +paper);

        System.out.println("Тестовое задание 3"); // вычитание из первоначальных значений переменных
        var resultDog = 8.0 - 3.5;
        System.out.println("dog - 3.5 = " +resultDog);
        var resultCat = 3.6 - 1.6;
        System.out.println("cat - 1.6 = " +resultCat);
        var resultPaper = 763789 - 7639;
        System.out.println("paper - 7639 = " +resultPaper);

        System.out.println("Тестовое задание 4"); // последовательные операции сложения, деления
        var friend = 19;
        System.out.println("friend = " +friend);
        friend = friend + 2;
        System.out.println("friend + 2 = " +friend);
        friend = friend / 7;
        System.out.println("friend / 7 = " +friend);

        System.out.println("Тестовое задание 5"); // последовательные операции
        var frog = 3.5;
        System.out.println("frog = " +frog);
        frog = frog * 10;
        System.out.println("frog * 10 = " +frog);
        frog = frog / 3.5;
        System.out.println("frog / 3.5 = " +frog);
        frog = frog + 4;
        System.out.println("frog + 4 = " +frog);

        System.out.println("Тестовое задание 6"); // Боксеры
        var boxerWeight1 = 78.2;
        System.out.println("boxer 1 weight = " +boxerWeight1+ " kg");
        var boxerWeight2 = 82.7;
        System.out.println("boxer 2 weight = " +boxerWeight2+ " kg");
        var totalWeight = boxerWeight1 + boxerWeight2;
        System.out.println("total weight = " +totalWeight+ " kg");
        var weightDifference = boxerWeight2 - boxerWeight1;
        System.out.println("weight difference = " +weightDifference+ " kg");

        System.out.println("Тестовое задание 7"); // Боксеры остаток от деления
        var x = 78.2;
        var y = 82.7;
        var remainder = y % x;
        System.out.println("remainder = " +remainder);

        System.out.println("Тестовое задание 8"); // Работники, часы работы
        var workTime = 680;
        var workerTime = 8;
        var Workers = workTime / workerTime;
        System.out.println("всего работников в компании -- " +Workers+ " человек");
        var newWorkers = 94;
        var totalWorkers = (Workers + newWorkers);
        var foolWorktime = totalWorkers * workerTime;
        System.out.println("если в компании работает -- " +totalWorkers+ " человек, то всего " +foolWorktime+ " часа");


    }
}
