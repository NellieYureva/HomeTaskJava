/*Задание
-Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
методы. Реализовать в java.
-Создать множество ноутбуков.
-Написать метод, который будет запрашивать у пользователя критерий (или критерии)
фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
-Далее нужно запросить минимальные значения для указанных критериев - сохранить
параметры фильтрации можно также в Map.
-Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
условиям.*/

import java.util.Objects;

public class NoteBook {
    public String brand;
    public String model;
    public int diagonal;
    public String color;
    public double weight;
    public int ram;
    public int hDCapacity;
    public String oS;
    public double price;
        
    public NoteBook (String brand, String model, int diagonal, String color, double weight, int ram, int hDCapacity, String oS, double price) {
        this.brand = brand;
        this.model = model;
        this.diagonal = diagonal;
        this.color = color;
        this.weight = weight;
        this.ram = ram;
        this.hDCapacity = hDCapacity;
        this.oS = oS;
        this.price = price;
    }

    public String getBrand () {
        return brand;
    }

    public String getModel () {
        return model;
    }

    public int getDiagonal () {
        return diagonal;
    }

    public String getColor () {
        return color;
    }

    public double getwWight () {
        return weight;
    }

    public int getRam () {
        return ram;
    }

    public int getHDCapacity () {
        return hDCapacity;
    }

    public String getOS () {
        return oS;
    }

    public double getPrice () {
        return price;
    }

    public void setBrand (String brand) {
        this.brand = brand;
    }

    public  void setModel (String model) {
        this.model = model;
    }

    public  void setDiagonal (int diagonal) {
        this.diagonal = diagonal;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public void setwWight (double weight) {
        this.weight = weight;
    }

    public void setRam (int ram) {
        this.ram = ram;
    }

    public void setHDCapacity (int hDCapacity) {
        this.hDCapacity = hDCapacity;
    }

    public void setOS (String oS) {
        this.oS = oS;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Производитель: " + brand + ", марка: " + model + ", диагональ экрана: " + diagonal + "', цвет: " + color + ", вес: " + weight + " кг, ОЗУ: " + ram + "ГБ, объем ЖД: " + hDCapacity + "ГБ, операционная система: " + oS + ", цена: " + price + " руб.";
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, diagonal, color, weight, ram, hDCapacity, oS, price);
    }
    
}

        




    
