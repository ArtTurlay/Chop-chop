package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

//        chuvak chuvak1 = new chuvak();
//        chuvak chuvak2 = new chuvak("Aleksndr", "Lukashenko", 13, 130);
//                chuvak2.showChuvak();
//
//                System.out.println("Ты втираешь мне какую-то дичь " + chuvak2.getHeight());

        chuvak chuvak1 = new chuvak("Vladimir", "Putin", 13, 130);
        chuvak chuvak2 = new chuvak("Vladik", "Pukan", 12, 1330);
        chuvak chuvak3 = new chuvak("Zhora", "Pitun", 11, 20);
        chuvak chuvak4 = new chuvak("Vlad", "Popka", 133, 122);
        chuvak chuvak5 = new chuvak("Vasar", "Putas", 132, 13330);

        chuvak[] chuvaks = {chuvak1, chuvak2, chuvak3, chuvak4, chuvak5};

        Team team1 = new Team("Bitches", chuvaks, "Valentin_Petrovich");


    }



    }

