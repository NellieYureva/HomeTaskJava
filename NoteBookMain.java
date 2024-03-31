import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class NoteBookMain {
    public static void main(String[] args) {
        HashSet<NoteBook> noteBooks = new HashSet<>();
        noteBooks.add(new NoteBook("Lenovo", "IdeaPad Slim 3 Gen 8", 16, "черный", 1.74,16, 512, "Без ОС", 60000.00));
        noteBooks.add(new NoteBook("Huawei", "MDF-X", 14, "черный", 1.39,8, 256, "Без ОС", 47500.00));
        noteBooks.add(new NoteBook("ASUS", "B2502CVA-BQ0303X", 16, "черный", 1.75,16, 512, "Windows 11 Professional", 101200.00));
        System.out.println(noteBooks);
           
        Map <String, Integer> filters = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию⁚ ");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Диагональ экрана");
        System.out.println("4 - Цена"); 
        int num = scanner.nextInt();
        while (true) {
            if (num == 0) break;
                switch (num) {
                case 1:
                    System.out.println("Минимальный объем ОЗУ?");
                    filters.put("ram", scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Минимальный объем ЖД?");
                    filters.put("hDCapacity", scanner.nextInt());
                    break;
                case 3:
                    System.out.println("Минимальная диагональ экрана?");
                    filters.put("diagonal", scanner.nextInt());
                    break;                    
                case 4:
                    System.out.println("Минимальная цена?");
                    filters.put("price", scanner.nextInt());
                    break;                        
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        Set<NoteBook> filterNoteBook = noteBooks.stream()
                .filter(noteBook -> filters.getOrDefault("ram", 0) instanceof Integer && noteBook.ram >= (int) filters.getOrDefault("ram", 0))
                .filter(noteBook -> filters.getOrDefault("hDCapacity", 0) instanceof Integer && noteBook.hDCapacity >= (int) filters.getOrDefault("hDCapacity", 0))
                .filter(noteBook -> filters.getOrDefault("diagonal", 0)instanceof Integer && noteBook.diagonal >= (int) filters.getOrDefault("diagonal", 0))
                .filter(noteBook -> filters.getOrDefault("price", 0)instanceof Integer && noteBook.price >= (int) filters.getOrDefault("price", 0))
                .collect(Collectors.toSet());

        System.out.println("Отфильтрованные ноутбуки:");
        System.out.println(filterNoteBook);
        break;
        }
    }

}









