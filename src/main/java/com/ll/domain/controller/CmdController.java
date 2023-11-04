package com.ll.domain.controller;

import com.ll.domain.Context;
import com.ll.domain.WiseSaying;
import com.ll.domain.repository.WiseSayingRepo;

import java.util.Scanner;

public class CmdController {
    private final WiseSayingRepo wiseSayingRepo;
    Context context = Context.getInstance();
    private final Scanner scanner;
    public CmdController(Scanner scanner,WiseSayingRepo wiseSayingRepo){
        this.wiseSayingRepo = wiseSayingRepo;
        this.scanner = scanner;
    }

    public void cmdStart(){
        while (!context.getIsEnd()) {
            System.out.print("명령) ");
            String cmd = scanner.nextLine();

            if (cmd.equals("종료")) {
                context.setIsEnd(true);
                break;
            } else if (cmd.equals("등록")) {

                System.out.print("명언 : ");
                String content = scanner.nextLine();
                System.out.print("작가 : ");
                String authorName = scanner.nextLine();
                WiseSaying wiseSaying = new WiseSaying(WiseSaying.idVal++, content, authorName);
                System.out.println(wiseSaying.getId()+"번 명언이 등록되었습니다.");
                wiseSayingRepo.getWiseSayingList().add(wiseSaying);
            }else if(cmd.equals("목록")){
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");
                for (WiseSaying ws: wiseSayingRepo.getWiseSayingList()){
                    System.out.println(ws.getId()+ " / "+ ws.getAuthor()+ " / "+ ws.getBody());
                }
            }
        }
    }
}
