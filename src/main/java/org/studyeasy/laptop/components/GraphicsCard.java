package org.studyeasy.laptop.components;

public class GraphicsCard {
    private String brand;
    private int series;
    private String memory;

    public GraphicsCard(String brand, int series, String memory) {
        this.brand = brand;
        this.series = series;
        this.memory = memory;
    }

    public GraphicsCard() {
        this.brand = "Nvidia";
        this.series = 3100;
        this.memory = "6 GB";
    }

    @Override
    public String toString() {
        return "GraphicsCard{" +
                "brand='" + brand + '\'' +
                ", series=" + series +
                ", memory='" + memory + '\'' +
                '}';
    }
}
