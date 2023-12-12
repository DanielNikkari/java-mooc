//package part08.Part08_04.LiquidContainers2.src.main.java;


public class Container {
    public int liquidVolume;
    public int maxVolume;

    public Container() {
        liquidVolume = 0;
        maxVolume = 100;
    }

    public int contains() {
        return liquidVolume;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }

        if (liquidVolume + amount > maxVolume) {
            liquidVolume = maxVolume;
            return;
        }

        liquidVolume += amount;
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }

        if (amount > liquidVolume) {
            liquidVolume = 0;
            return;
        }

        liquidVolume -= amount;
    }

    public String toString() {
        return liquidVolume + "/100";
    }
}