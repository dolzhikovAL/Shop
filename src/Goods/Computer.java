package Goods;

import Specifications.Cpu;
import Specifications.Ram;
import Specifications.TechSpecificationPC;
import Specifications.VideoCard;

import java.util.Scanner;

public class Computer extends Item {

    private TechSpecificationPC techSpecificationPC;
    private int guarantee;

    public Computer(int id, int value, String name, String explanation, int prise, TechSpecificationPC techSpecificationPC, int guarantee) {
        super(id, value, name, explanation, prise);
        this.guarantee = guarantee;
        this.techSpecificationPC = techSpecificationPC;


    }

    public TechSpecificationPC getTechSpecificationPC() {
        return techSpecificationPC;
    }

    public void setTechSpecificationPC(TechSpecificationPC techSpecificationPC) {
        this.techSpecificationPC = techSpecificationPC;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(int guarantee) {
        this.guarantee = guarantee;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Гарантия = " + guarantee +
                "\nОперативная память Тип и объем --" + techSpecificationPC.getRam().getTypeMemory() + " | " + techSpecificationPC.getRam().getValueMemory() +
                "\nПроцессор Ядра и частота -- " + techSpecificationPC.getCpu().getCores() + " | " + techSpecificationPC.getCpu().getFrequency() +
                "\nВидеокарта Тип и объем  -- " + techSpecificationPC.getVideoCard().getVideoRam().getTypeMemory() + " | " + techSpecificationPC.getVideoCard().getVideoRam().getValueMemory() +
                "\nВидеокарта Ядра и частота -- " + techSpecificationPC.getVideoCard().getCores() + " | " + techSpecificationPC.getVideoCard().getFrequency());
    }

    public static Computer createOne() {
        Scanner scanner = new Scanner(System.in);
        Item item = Item.addOne();

        System.out.println("Введите  объем оперативной памяти ");   //ram
        int newRamValue = scanner.nextInt();
        System.out.println("Ведите Тип оперативной памяти");
        String newTypeMemory = scanner.next();

        System.out.println("Ведите количество ядер процессора");    //cpu
        int newCores = scanner.nextInt();
        System.out.println("Ведите частоту процессора");
        int newFrequency = scanner.nextInt();

        System.out.println("Ведите количество ядер видеокарты"); //videoCard general
        int newVideoCardCores = scanner.nextInt();
        System.out.println("Ведите частоту видеокарты");
        int newVideoCardFrequency = scanner.nextInt();

        System.out.println("Ведитеобъем памяти видеокарты"); //videoCard ram
        int newVideoRamValue = scanner.nextInt();
        System.out.println("Ведите Тип памятивидеокарты");
        String newVideoTypeMemory = scanner.next();

        System.out.println("Введите срок гарантии ");
        int newGuarantee = scanner.nextInt();

        Computer newOne = new Computer(item.getId(), item.getValue(), item.getName(), item.getExplanation(), item.getPrice(),
                new TechSpecificationPC(new Ram(newRamValue,newTypeMemory),new Cpu(newCores,newFrequency),new VideoCard(newVideoCardCores,newVideoCardFrequency,
                        new Ram(newVideoRamValue,newVideoTypeMemory))),newGuarantee);

        return newOne;

    }
}
