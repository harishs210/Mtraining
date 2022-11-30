package com.mt.app;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		runApp();
	}

	public static void runApp() {
		Question[] qns;

		qns = new Question[10];

		qns[0] = new Question("1", "Questions1", "option1", "option2", "option3", "option4", 2);
		qns[1] = new Question("2", "Questions2", "option1", "option2", "option3", "option4", 1);
		qns[2] = new Question("3", "Questions3", "option1", "option2", "option3", "option4", 4);
		qns[3] = new Question("4", "Questions4", "option1", "option2", "option3", "option4", 2);
		qns[4] = new Question("5", "Questions5", "option1", "option2", "option3", "option4", 4);
		qns[5] = new Question("6", "Questions6", "option1", "option2", "option3", "option4", 1);
		qns[6] = new Question("7", "Questions7", "option1", "option2", "option3", "option4", 3);
		qns[7] = new Question("8", "Questions8", "option1", "option2", "option3", "option4", 4);
		qns[8] = new Question("9", "Questions9", "option1", "option2", "option3", "option4", 4);
		qns[9] = new Question("10", "Questions10", "option1", "option2", "option32", "option4", 1);
		

		System.out.println("Welcome to Exam.Are you Ready(y-start,n-stop)");
		Scanner sc = new Scanner(System.in);
		String startOption = sc.nextLine();

		if (startOption.equalsIgnoreCase("Y")) {
			for (int i=0; i<qns.length;i++) {
				System.out.println(qns[i].getQuestionId() + ". " + qns[i].getQns());
				System.out.println("* "+qns[i].getOption1() + "   * "+ qns[i].getOption2());
				System.out.println("* "+qns[i].getOption3() + "   * "+ qns[i].getOption4());
				
				if (sc.nextLine().equals(String.valueOf(qns[i].getRightOption()))) {

					System.out.println("Yes correct");
				} else {
					System.out.println("Not Correct Answer");
					System.out.println("Do you want to try again? (y-Yes,n-No)");
					if (sc.nextLine().equalsIgnoreCase("Y")) {
						System.out.println("You have choosen to submit answer again");
						i--;
					}else {
						continue;
					}
				}

			}
		} else if (startOption.equalsIgnoreCase("N")) {
			System.out.println("You exit to exam!");
		} else {
			System.out.println("Wrong Input");
		}

	}

}
