package lesson6.bigtasks.task1;

import lesson6.bigtasks.task1.weapons.Ak47;
import lesson6.bigtasks.task1.weapons.M4a1;
import lesson6.bigtasks.task1.weapons.Pistol;
import lesson6.bigtasks.task1.weapons.Weapon;

import java.util.Scanner;

class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private final Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[] {
                 new Pistol(),
                 new M4a1(),
                new Ak47()
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if(slot < getSlotsCount()-1) {
            // Получаем оружие из выбранного слота
            Weapon weapon = weaponSlots[slot];
            // Огонь!
            weapon.shot();
        } else {
            System.out.println("No such slot");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        // Как настоящие программисты мы имеем в виду, что исчисление начинается с 0
        System.out.format("У игрока %d слотов с оружием,"
                        + " введите номер, чтобы выстрелить,"
                        + " -1 чтобы выйти%n",
                player.getSlotsCount()
        );
        int slot;

        // TODO главный цикл игры:
        // запрашивать номер с клавиатуры
        // с помощью scanner.nextInt(),
        // пока не будет введено -1
        while (true) {
            slot = scanner.nextInt();
            if(slot == -1) break;
            player.shotWithWeapon(slot);
        }

        System.out.println("Game over!");
    }

}
