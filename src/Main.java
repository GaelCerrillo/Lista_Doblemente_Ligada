public class Main {
    public static void main(String[] args) {
        // Nueva lista
        DoublyLinkedList<VideogameCharacter> characters = new DoublyLinkedList<>();


        characters.insertLast(new VideogameCharacter("Link", "The Legend of Zelda"));
        characters.insertLast(new VideogameCharacter("Mario", "Super Mario Bros"));
        characters.insertLast(new VideogameCharacter("Kratos", "God of War"));

        // Transversa inversa
        System.out.println("Recorrido inverso:");
        characters.traverseBackward();
    }
}