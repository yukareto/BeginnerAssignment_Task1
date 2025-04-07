package com.yureto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // 1番目の数字を入力
            System.out.print("1番目の数字を入力してください: ");
            String input1 = scanner.nextLine();
            int num1 = Integer.parseInt(input1);

            // 演算子を入力
            System.out.print("演算子を入力してください (+, -, *, /): ");
            String operator = scanner.nextLine();

            // 2番目の数字を入力してください
            System.out.print("2番目の数字を入力してください: ");
            String input2 = scanner.nextLine();
            int num2 = Integer.parseInt(input2);

            int result;
            boolean validOperator = true;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("エラー: 0で割ることはできません。");
                        scanner.close();
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    validOperator = false;
                    System.out.println("エラー: 無効な演算子です。+, -, *, / のいずれかを入力してください。");
                    result = 0;
            }

            if (validOperator) {
                System.out.println("計算結果: " + num1 + " " + operator + " " + num2 + " = " + result);
            }

        } catch (NumberFormatException e) {
            System.out.println("エラー: 数字が正しく入力されていません。整数を入力してください。");
        } catch (Exception e) {
            System.out.println("予期しないエラーが発生しました: " + e.getMessage());
        }
    }
}
