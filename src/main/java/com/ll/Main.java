package com.ll;

import com.ll.domain.controller.CmdController;
import com.ll.domain.repository.WiseSayingRepo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WiseSayingRepo wiseSayingRepo = new WiseSayingRepo();
        CmdController cmdController = new CmdController(scanner,wiseSayingRepo);
        App app = new App(scanner,wiseSayingRepo,cmdController);
        app.run();

    }
}