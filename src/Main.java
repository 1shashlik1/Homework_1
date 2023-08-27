public class Main {
    public static void main(String[] args) {
        // Задача№1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача№2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача№3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача№4
        var frend = 19;
        System.out.println(frend);
        frend = frend + 2;
        System.out.println(frend);
        frend = frend / 7;
        System.out.println(frend);
        // Задача№5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // Задача№6
        var fighterA = 78.2;
        System.out.println(fighterA);
        var fighterB = 82.7;
        System.out.println(fighterB);
        var totalWeight = fighterA + fighterB;
        System.out.println(totalWeight);
        var massDifference = fighterB - fighterA;
        System.out.println(massDifference);
        // Задача№7
        var massDifference2 = totalWeight % massDifference;
        System.out.println(massDifference2);
        // Задача№8
        var totalTime = 640;
        var workTime = 8;
        var totalEmployees = totalTime / workTime;
        System.out.println(totalEmployees); // 80
        var potentialNumberEmployees = totalEmployees + 94;
        System.out.println(potentialNumberEmployees);
        var potentialWorkTime = totalTime / potentialNumberEmployees;
        System.out.print(potentialWorkTime);//Непонятно, почему последние выводы пишутся слитно?
        System.out.print("Если в компании работает " + potentialNumberEmployees + " человек, то всего " + potentialWorkTime + " часа работы может быть поделено между сотрудиниками.");
        //Домашка


    }

}