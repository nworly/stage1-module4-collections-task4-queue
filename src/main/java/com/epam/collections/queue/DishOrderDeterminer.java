package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }

        List<Integer> list = new ArrayList<>();

        int count = 1;
        while (!queue.isEmpty()) {
            if (count == everyDishNumberToEat) {
                list.add(queue.poll());
                count = 1;
            } else {
                queue.add(queue.poll());
                count++;
            }
        }

        return list;
    }
}
