/*
2. Пусть дан список сотрудников:
            Иван Иванов
            Светлана Петрова
            Кристина Белова
            Анна Мусина
            Анна Крутова
            Иван Юрин
            Петр Лыков
            Павел Чернов
            Петр Чернышов
            Мария Федорова
            Марина Светлова
            Мария Савина
            Мария Рыкова
            Марина Лугова
            Анна Владимирова
            Иван Мечников
            Петр Петин
            Иван Ежов
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
 */

package lesson05.secondTask;

import java.util.*;

public class Persons {
    public static void main(String[] args) {

        String namesString = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова,Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";

        String[] namesArray = namesString.split(", ");

        HashMap<String, Integer> names = new HashMap<String, Integer>();

        for (String name : namesArray) {
            String[] FullName = name.split(" ");
            if (names.containsKey(FullName[0])) {
                names.put(FullName[0], names.get(FullName[0]) + 1);
            } else {
                names.put(FullName[0], 1);
            }
        }

        List<Integer> positions = new ArrayList<Integer>(names.values());
        positions.sort(Collections.reverseOrder());

        HashMap<String, Integer> sortedNames = new LinkedHashMap<String, Integer>();
        for (int position : positions)
        {
            for (String name : names.keySet()){
                if (position == names.get(name)) {
                    sortedNames.put(name, position);
                }
            }
        }
        System.out.println(sortedNames);
    }
}
