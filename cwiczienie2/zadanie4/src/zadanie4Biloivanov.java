

public class zadanie4Biloivanov {
    public static void main(String[] args) {
        int amountOfBricks;
        do {
            amountOfBricks = (int)(Math.random() * 51) + 50;
        }while(amountOfBricks % 2 == 0);
        System.out.println("Number of Bricks is "+ amountOfBricks);

        int containerCapacity;
        do {
            containerCapacity = (int)(Math.random() * 6) + 5;
        }while(containerCapacity % 2 != 0);
        int all_containers = (amountOfBricks/containerCapacity) + 1;
        int full_containers = (amountOfBricks/containerCapacity);
        float remainder = (amountOfBricks%containerCapacity);
        System.out.println("ContainerCapacity is "+ containerCapacity);
        System.out.println("There are " + all_containers + " containers");
        System.out.println(full_containers + " of " + all_containers + " containers are full");
        System.out.println("There are " + remainder + " Lego bricks in the not filled container");
    }

}
