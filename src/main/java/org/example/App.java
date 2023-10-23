package org.example;



import java.util.Scanner;
public class App {

    private final Scanner sc;

    public App(Scanner sc){

        this.sc = sc;
    }
    long lastId = 0;

    public void run(){
        System.out.println("== 프로그램 시작 ==");
        while(true){
            System.out.printf("명령어) ");
            String command = sc.nextLine().trim();
            if(command.equals("종료")){
                System.out.println("== 프로그램 끝 ==");
            break;
            } else if (command.equals("등록")) {
               lastId++;

                System.out.printf("제목: ");
                String title = sc.nextLine();
                System.out.printf("내용: ");
                String content = sc.nextLine();

                System.out.println(lastId + "번 게시글이 등록되었습니다.");
            }
        }




    }

}
