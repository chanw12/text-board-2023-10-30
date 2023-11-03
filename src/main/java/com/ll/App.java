package com.ll;

import com.ll.domain.Context;
import com.ll.domain.WiseSaying;
import com.ll.domain.controller.CmdController;
import com.ll.domain.repository.WiseSayingRepo;

import java.util.Scanner;

public class App {
    private final WiseSayingRepo wiseSayingRepo;
    private final CmdController cmdController;
    private final Scanner scanner;
    public App(Scanner scanner,WiseSayingRepo wiseSayingRepo,CmdController cmdController) {
        this.wiseSayingRepo = wiseSayingRepo;
        this.cmdController = cmdController;
        this.scanner = scanner;
    }


    public void run(){
        System.out.println("== 명언 앱 ==");
        cmdController.cmdStart();

    }
}
