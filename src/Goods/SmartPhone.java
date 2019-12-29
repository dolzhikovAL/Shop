package Goods;

import Specifications.Cpu;
import Specifications.Ram;
import Specifications.TechSpecificationPhone;


import java.util.Scanner;

public class SmartPhone extends Item {

    private TechSpecificationPhone techSpecificationPhone;
    private int guarantee;

    public SmartPhone(int id, int value, String name, String explanation, int price, TechSpecificationPhone techSpecificationPhone, int guarantee) {
        super(id, value, name, explanation, price);
        this.guarantee = guarantee;
        this.techSpecificationPhone = techSpecificationPhone;
    }

    public TechSpecificationPhone getTechSpecificationPhone() {
        return techSpecificationPhone;
    }

    public void setTechSpecificationPhone(TechSpecificationPhone techSpecificationPhone) {
        this.techSpecificationPhone = techSpecificationPhone;
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
        System.out.println("Операционная система -- " + techSpecificationPhone.getBaseOS() +
                "\nОперативная память Тип и объем --" + techSpecificationPhone.getRam().getTypeMemory() + " | " + techSpecificationPhone.getRam().getValueMemory() +
                "\nПроцессор Ядра и частота -- " + techSpecificationPhone.getCpu().getCores() + " | " + techSpecificationPhone.getCpu().getFrequency() +
                "\nДиагональ экрана --" + techSpecificationPhone.getScreenDiagonal() +
                "\nВремя работы от батареи -- " + techSpecificationPhone.getBatteryWorkTime() +
                "\nГарантийный срок --  " + guarantee);
    }

    public static SmartPhone createOne() {
        Scanner scanner = new Scanner(System.in);
        Item item = Item.addOne();

        System.out.println("Ведите Тип операционной системы");          //spec.
        String newTypeOS = scanner.next();

        System.out.println("Введите  объем оперативной памяти ");   //ram
        int newRamValue = scanner.nextInt();
        System.out.println("Ведите Тип оперативной памяти");
        String newTypeMemory = scanner.next();

        System.out.println("Ведите количество ядер процессора");    //cpu
        int newCores = scanner.nextInt();
        System.out.println("Ведите частоту процессора");
        int newFrequency = scanner.nextInt();

        System.out.println("Ведите диагональ экрана");          //spec.
        double newScreenDiagonal = scanner.nextDouble();
        System.out.println("Ведите время работы от аккумулятора ");
        int batteryWorkTime = scanner.nextInt();

        System.out.println("Введите срок гарантии ");
        int newGuarantee = scanner.nextInt();

        SmartPhone newOne = new SmartPhone(item.getId(), item.getValue(), item.getName(), item.getExplanation(), item.getPrice(),
                new TechSpecificationPhone(newTypeOS, new Ram(newRamValue, newTypeMemory), new Cpu(newCores, newFrequency), newScreenDiagonal, batteryWorkTime), newGuarantee);
        return newOne;
    }
}