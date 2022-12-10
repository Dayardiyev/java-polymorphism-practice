import weapons.*;

public class Player {
    private final Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[] {
                new Pistol(),
                new Rifle(),
                new Rpg(),
                new Slingshot(),
                new Watergun()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shootWithWeapon(int slot) {
        Weapon weapon = weaponSlots[slot - 1];
        weapon.shot();
    }
}
