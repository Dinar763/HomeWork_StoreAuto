import java.util.Arrays;
public class Store {
    public static final int storeSize = 10;
    public static String[] store = new String[storeSize];


    public static int getFreeSpaces() {
        int countFreeSpaces = 0;
        for (int i = 0; i < store.length; i++) {
            if (store[i] == null) {
                countFreeSpaces++;
            }
        }
        return countFreeSpaces;
    }

    public static void addProduct(String object) {
        if (getFreeSpaces() > 0) {
            for (int i = 0; i < store.length; i++) {
                if (store[i] == null) {
                    store[i] = object;
                    break;
                }
            }
            System.out.println("Ваш груз успешно добавлен на склад!");
        } else {
            System.out.println("Склад перегружен!!! Нужно что-то убрать со склада");
        }
    }

    public static void delProduct(String object) {
        if (getFreeSpaces() < storeSize) {
            for (int i = 0; i < store.length; i++) {
                if (store[i].equals(object)) {
                    store[i] = null;
                    break;
                }
            }
            System.out.println("Ваш груз успешно удален со склада!");
        } else {
            System.out.println("Склад полностью свободен, сначала что-нибудь добавьте на склад!");
        }
    }

    public static void checkProduct(String object) {
        boolean checkFlag = false;
        if (getFreeSpaces() != 0) {
            for (int i = 0; i < store.length; i++) {
                if (store[i] == object) {
                    break;
                }
            }
            System.out.println("Такой товар есть на складе!");
        } else {
            System.out.println("Склад полностью свободен, сначала что-нибудь добавьте на склад!");
        }

    }

    public static void numberCheckProducts(String object) {
        int counter = 0;
        for (int i = 0; i < store.length; i++) {
            if ((store[i] != null) && store[i].equals(object)) {
                counter += 1;
            }
        }
        System.out.println("Таких позиций на складе " + counter);

    }










}