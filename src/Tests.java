import java.util.Scanner;
import java.util.Arrays;
public class Tests {
    private static boolean flag;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Приветствуем Вас !!! Мы Вам очень рады!!!");
//        System.out.println("Какой размер склада вам нужен? введите количество мест");
//        public static int storeSize = scanner.nextInt();
//        if (storeSize > 0){
//            flag = true;
//        } else{
//            System.out.println("Такой склад не может быть создан, начните заново");
//            flag = false;
//        }
        while (true) {
            System.out.println("Приветствуем Вас на нашем складе!!! Мы Вам очень рады!!!");
            System.out.println("Получить список команд для работы склада, введите \"help\"");
            System.out.println("Текущее состояние склада: всего мест на складе - " + Store.storeSize);
            System.out.println("Свободных мест на складе осталось: " + Store.getFreeSpaces());


            String command = scanner.nextLine();

            if (command.equals("help")){
                System.out.println("add - Добавить товар");
                System.out.println("del - Удалить товар");
                System.out.println("poz - Показать наличие на складе");
                System.out.println("poznum - Показать количество товара на складе");
                System.out.println("exit - Закрыть меню склада");

            }else if (command.equals("add")){
                System.out.println("Давайте ваш груз");
                String addedProduct = scanner.nextLine();
                Store.addProduct(addedProduct);

            }else if (command.equals("del")){
                System.out.println("Какой груз нужно убрать со склада?");
                String removableProduct = scanner.nextLine();
                Store.delProduct(removableProduct);

            }else if (command.equals("poz")){
                System.out.println("Наличие какого груза Вы хотите узнать???");
                String desiredProduct = scanner.nextLine();
                Store.checkProduct(desiredProduct);

            }else if (command.equals("poznum")){
                System.out.println("Количество какого груза Вы хотите узнать???");
                String numProducts = scanner.nextLine();
                Store.numberCheckProducts(numProducts);
            }else if(command.equals("exit")){
                System.out.println("До свидания! Будем рады видеть Вас снова!!!");
                System.exit(0);
            }
            else
                System.out.println("Вы ввели не верную команду! Попробуйте еще раз!");



        }
    }
}

