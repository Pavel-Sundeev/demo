package homework_8.practice;

import homework_8.UnderAgeException;

public class Main {

    public static void checkAge(int age) throws UnderAgeException {
        if(age < 18){
            throw new UnderAgeException("Продажа алкоголя Вам запрещена");
        } else {
            System.out.println("Вам можно пить!");
        }
    }

    static void main(String[] args) {
        int age = 19;
        try{
            checkAge(age);
        } catch (UnderAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
