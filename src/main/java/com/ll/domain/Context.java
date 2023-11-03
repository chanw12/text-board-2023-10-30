package com.ll.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Context {
    private static Context instance = null;
    private Scanner scanner;
    private List<WiseSaying> wiseSayingList ;
    private Boolean isEnd;



    private Context() {
        wiseSayingList = new ArrayList<>();
        isEnd = false;
    }

    public static Context getInstance(){
        if(instance==null){
            instance = new Context();
        }
        return instance;
    }

    public List<WiseSaying> getWiseSayingList() {
        return wiseSayingList;
    }

    public Boolean getIsEnd() {
        return isEnd;
    }

    public void setIsEnd(Boolean end) {
        isEnd = end;
    }

    public Scanner getScanner() {
        return scanner;
    }
}
