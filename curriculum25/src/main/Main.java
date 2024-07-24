package main;

import java.util.Scanner;

import process.CharacterProcess;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
        System.out.print("名前を入力してください: ");
        String name = scanner.nextLine();

        CharacterProcess character = new CharacterProcess(name);
        character.displayStatus();
    }
	

}
