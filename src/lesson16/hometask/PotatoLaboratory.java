package lesson16.hometask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PotatoLaboratory {

    public static void main(String[] args) {
        List<Potato> potatoes = List.of(
                new Potato(1, 30, 30, 30),
                new Potato(2, 35, 31, 35),
                new Potato(3, 40, 35, 44),
                new Potato(4, 28, 44, 41),
                new Potato(5, 33, 23, 30),
                new Potato(6, 35, 33, 33),
                new Potato(7, 38, 41, 24)
        );

        List<Potato> fourUnderExperiment = findPotatoesForExperiment(potatoes);

        System.out.println("Картофелины для эксперимента: " + fourUnderExperiment);
    }

    private static List<Potato> findPotatoesForExperiment(List<Potato> potatoes) {
				/* Вычислите две самые большие и две самые маленькие картофелины,
           а затем выведите их в порядке от самых маленьких до самых больших.*/
        List<Potato> list = new ArrayList<>(potatoes);
        Collections.sort(list);

        System.out.println("The biggest potatos:");
        System.out.println("1. " + list.get(list.size()-1) + " with alpha: " + list.get(list.size()-1).getAlpha());
        System.out.println("2. " + list.get(list.size()-2) + " with alpha: " + list.get(list.size()-2).getAlpha());

        System.out.println("The smallest potatos:");
        System.out.println("1. " + list.get(0) + " with alpha: " + list.get(0).getAlpha());
        System.out.println("2. " + list.get(1) + " with alpha: " + list.get(1).getAlpha());

        System.out.println("Sorted potatos:");
        list.forEach(potato -> {
            System.out.println(potato + " with alpha: " + potato.getAlpha());
        });

        return list;
    }
}
