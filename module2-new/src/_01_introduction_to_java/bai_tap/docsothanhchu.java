package _01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class docsothanhchu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String doc = "";
        if(number < 0 || number > 999){
            System.out.println("Invalid number!");
        } else if(number <=10) {
            switch (number){
                case 1: doc += "one"; break;
                case 2: doc += "two"; break;
                case 3: doc += "three"; break;
                case 4: doc += "four"; break;
                case 5: doc += "five"; break;
                case 6: doc += "six"; break;
                case 7: doc += "seven"; break;
                case 8: doc += "eight"; break;
                case 9: doc += "nine"; break;
                case 10: doc += "ten"; break;
            }
        } else if(number < 20){
            switch (number-10){
                case 1: doc += "eleven"; break;
                case 2: doc += "twelve"; break;
                case 3: doc += "thirteen"; break;
                case 4: doc += "fourteen"; break;
                case 5: doc += "fifteen"; break;
                case 6: doc += "sixteen"; break;
                case 7: doc += "seventeen"; break;
                case 8: doc += "eighteen"; break;
                case 9: doc += "nineteen"; break;

            }
        } else if(number < 100){
            switch (number/10) {
                case 2: doc += "twenty"; break;
                case 3: doc += "thirty"; break;
                case 4: doc += "forty"; break;
                case 5: doc += "fifty"; break;
                case 6: doc += "sixty"; break;
                case 7: doc += "seventy"; break;
                case 8: doc += "eighty"; break;
                case 9: doc += "ninety"; break;

            }
            if(number%10 > 0) {
                doc += " ";
                switch(number%10){
                    case 1: doc += "one"; break;
                    case 2: doc += "two"; break;
                    case 3: doc += "three"; break;
                    case 4: doc += "four"; break;
                    case 5: doc += "five"; break;
                    case 6: doc += "six"; break;
                    case 7: doc += "seven"; break;
                    case 8: doc += "eight"; break;
                    case 9: doc += "nine"; break;

                }
            }
        } else { // number > 100
            switch(number/100){
                case 1: doc += "one hundred"; break;
                case 2: doc += "two hundred"; break;
                case 3: doc += "three hundred"; break;
                case 4: doc += "four hundred"; break;
                case 5: doc += "five hundred"; break;
                case 6: doc += "six hundred"; break;
                case 7: doc += "seven hundred"; break;
                case 8: doc += "eight hundred"; break;
                case 9: doc += "nine hundred"; break;
            }
            int bachuso = number%100;
            if(bachuso > 0){
                doc += " and";
                if(bachuso/10 < 2){
                    switch(bachuso){
                        case 1: doc += " one"; break;
                        case 2: doc += " two"; break;
                        case 3: doc += " three"; break;
                        case 4: doc += " four"; break;
                        case 5: doc += " five"; break;
                        case 6: doc += " six"; break;
                        case 7: doc += " seven"; break;
                        case 8: doc += " eight"; break;
                        case 9: doc += " nine"; break;
                        case 10: doc += " ten"; break;
                        case 11: doc += " eleven"; break;
                        case 12: doc += " twelve"; break;
                        case 13: doc += " thirteen"; break;
                        case 14: doc += " fourteen"; break;
                        case 15: doc += " fifteen"; break;
                        case 16: doc += " sixteen"; break;
                        case 17: doc += " seventeen"; break;
                        case 18: doc += " eighteen"; break;
                        case 19: doc += " nineteen"; break;
                    }
                } else {
                    switch(bachuso/10) {
                        case 2: doc += " twenty"; break;
                        case 3: doc += " thirty"; break;
                        case 4: doc += " forty"; break;
                        case 5: doc += " fifty"; break;
                        case 6: doc += " sixty"; break;
                        case 7: doc += " seventy"; break;
                        case 8: doc += " eighty"; break;
                        case 9: doc += " ninety"; break;
                    }
                    if(bachuso%10 > 0) {
                        switch(bachuso%10) {
                            case 1: doc += " one"; break;
                            case 2: doc += " two"; break;
                            case 3: doc += " three"; break;
                            case 4: doc += " four"; break;
                            case 5: doc += " five"; break;
                            case 6: doc += " six"; break;
                            case 7: doc += " seven"; break;
                            case 8: doc += " eight"; break;
                            case 9: doc += " nine"; break;
                            default: doc +=""; break;
                        }
                    }
                }
            }
        }

        System.out.println("Result: " + doc + ".");

    }

}
