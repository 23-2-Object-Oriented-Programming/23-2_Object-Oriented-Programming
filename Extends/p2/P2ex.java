package org.example.week9.p2;

import java.util.Scanner;

public class P2ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfMember, numOfCrew;
        int tmp_studentId;
        String tmp_name, tmp_department;
        Member[] members;
        System.out.print("일반 동아리원 수 입력하시오: ");
        numOfMember = scanner.nextInt();
        System.out.print("집행부 수를 입력하시오: ");
        numOfCrew = scanner.nextInt();

        members = new Member[numOfMember + numOfCrew];

        System.out.println("---Input Member Information---");
        for (int i = 0; i < numOfMember; i++) {
            System.out.print("Student ID: ");
            tmp_studentId = scanner.nextInt();
            System.out.print("Name: ");
            tmp_name = scanner.next();
            System.out.println();
            members[i] = new Member(tmp_studentId, tmp_name);
        }
        System.out.println("---Input Crew Information---");
        for (int i = numOfMember; i < numOfMember + numOfCrew; i++) {
            System.out.print("Student ID: ");
            tmp_studentId = scanner.nextInt();
            System.out.print("Name: ");
            tmp_name = scanner.next();
            System.out.print("Department: ");
            tmp_department = scanner.next();
            System.out.println();
            members[i] = new Crew(tmp_studentId, tmp_name, tmp_department);
        }

        for (int i = 0; i < numOfMember + numOfCrew; i++) {
            if (i == 0) {
                System.out.println("---Member Information---");
            }
            if (i == numOfMember) {
                System.out.println("---Crew Information---");
            }
            System.out.println(members[i]);
        }

    }
}
