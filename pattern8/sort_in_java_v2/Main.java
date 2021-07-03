package pattern8.sort_in_java_v2;

class Main {
    public static void main(String[] args) {
        Integer[] a = { 2, 3, 1, 5, 8, 3 };
        MyArrays.sort(a);
        printArray(a);
        Character[] characters = { new Character("saber", 10), new Character("lancer", 1),
                new Character("assasin", 0) };
        MyArrays.sort(characters);
        printArray(characters);
    }

    private static void printArray(Object[] array) {
        for (Object obj : array) {
            System.out.print(obj);
            System.out.print(" ");
        }
        System.out.print("\n");
    }
}