package org.studyeasy;

import org.studyeasy.laptop.Laptop;
import org.studyeasy.laptop.components.GraphicsCard;
import org.studyeasy.laptop.components.Processor;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        System.out.println(laptop.getProcessor().getBrand());

        Processor processor1 = new Processor();
        GraphicsCard graphicsCard1 = new GraphicsCard();

        Laptop laptop1 = new Laptop(17.3f, processor1, "16 GB", "1 TB", graphicsCard1, "DVD Writer", "RGB Backlit");
        System.out.println(laptop1.toString());

    }
}