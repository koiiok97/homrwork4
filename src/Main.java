
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 8;
        if (age >= 18){
            System.out.println("Если возраст человека равен "+ age +", то он совершеннолетний");
        }else{
            System.out.println("Если возраст человека равен "+ age +", то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("\nЗадание 2");
        int temp = -10;
        if (temp < 5){
            System.out.println("На улице "+ temp +" градусов, нужно надеть шапку!");
        }else{
            System.out.println("Можно идти без шапки");
        }

        System.out.println("\nЗадание 3");
        int speed = 60;
        if(speed > 60){
            System.out.println("Если скорость "+ speed +", то придется заплатить штраф ");
        }else{
            System.out.println("Можно ездить спокойно");
        }

        System.out.println("\nЗадание 4");
        int age1 = 25;
        if(age1 >= 2 && age1 <= 6){
            System.out.println("Если возраст человека равен "+ age1 +", то ему нужно ходить в детский сад");
        }else if(age1 >= 7 && age1 <= 17){
            System.out.println("Если возраст человека равен "+ age1 +", то ему нужно ходить в школу");
        }else if(age1 >= 18 && age1 <= 24){
            System.out.println("Если возраст человека равен "+ age1 +", то ему нужно ходить в университет");
        }else if (age1 > 24){
            System.out.println("Если возраст человека равен "+ age1 +", то ему нужно ходить на работу");
        }

        System.out.println("\nЗадание 5");
        int age2 = 5;
        boolean isAdult = true;
        if(age2 < 5){
            System.out.println("Если возраст ребенка равен "+ age2 +", то ему нельзя кататься на аттракционе");
        }else if(age2 >= 5 && age2 <= 14 && isAdult){
            System.out.println("Если возраст ребенка равен "+ age2 +", то ему можно кататься на аттракционе в сопровождении");
        }else if(age2 > 14){
            System.out.println("Если возраст ребенка равен "+ age2 +", то ему можно без сопровождения взрослого");
        }else{
            System.out.println("Нельзя");
        }

        System.out.println("\nЗадание 6");
        int totalPlaces = 102;
        int seating = 60;
        int persons = 111;
        if(persons < seating){
            System.out.println("В вагоне есть сидячие места");
        }else if (persons >= seating && persons < totalPlaces ){
            System.out.println("В вагоне есть стоячие места места");
        }else{
            System.out.println("Вагон полностью забит");
        }

        System.out.println("\nЗадание 7");
        int one = 33;
        int two = 44;
        int three = 33;
        int max;
        if (one <= two && two >= three)
            max = two;
        else if (two <= three && three >= one)
            max = three;
        else
            max = one;
        System.out.println(max);
    }
}