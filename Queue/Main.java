package Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.insert(1);
        queue.insert(1323);
        queue.insert(124453);
        queue.insert(123313);
        System.out.println("Список до удаления элемента и его головной элемент = " +queue.element());
        queue.display();
        queue.remove();
        System.out.println("Список после удаления и его головной элемент = " + queue.element());
        queue.display();



    }

}
