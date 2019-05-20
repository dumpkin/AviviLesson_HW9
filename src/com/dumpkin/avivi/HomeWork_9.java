//Написати програму для роботи з Enums. (Даємо волю фантазії. ) Це може бути Опис ІТ компаній і їх спеціалізації.
// Універ і його факультети і т.д.

//Створити програму, яка буде повідомляти, чи є ціле число, введене користувачем, парним або непарним.
// Якщо користувач введе не ціла число, то повідомляти йому про помилку.

//Створити програму, яка буде обчислювати і виводити на екран суму двох цілих чисел, введених користувачем.
// Якщо користувач некоректно введе хоча б одне з чисел, то повідомляти про помилку.

package com.dumpkin.avivi;

public class HomeWork_9 {


    public static void main(String[] args) {
        System.out.println("Homework #9/1");

        Zakaz[] zakazList=new Zakaz[10];

        Material magister=new Material(700,498,230,Paper.CELULOSE);
        magister.setSheetCost(10.3f);

        Material multiColor=new Material(1020,700,300,Paper.MO);
        multiColor.setSheetCost(3.6f);

        Contragent avalon = new Contragent();
        avalon.agentName="Sergey Kakashin";
        avalon.companyName="Avalon INC";


        Contragent sigara = new Contragent();
        sigara.agentName="Mihailo Sukin";
        sigara.companyName="Verblood (C)";

        zakazList[0]=new Zakaz(avalon,magister,3000);
        zakazList[0].setStatus(Status.COMPLETE);
        zakazList[1]=new Zakaz(sigara,multiColor,8400);

        System.out.printf("contragent № %d \n" ,avalon.number);
        System.out.println("Company: "+ avalon.companyName+ "\n"+
                "Profit : "+zakazList[0].getPrice()+"\n"+
                "Status: "+zakazList[0].getStatus());

    }
}