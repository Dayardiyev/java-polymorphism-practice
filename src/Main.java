import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.format("The player has 5 slots with the required number to shoot, or enter \"-1\" to exit",
                player.getSlotsCount()
        );

        int slot;
        while (true) {
            slot = scanner.nextInt();
            if (slot == -1) {
                break;
            }
            player.shootWithWeapon(slot);
        }
        System.out.println("Game over!");
    }
}