public class Main {
    public static void main(String[] args) {
        List list = new List();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.print();

        System.out.println();
        list.removeKey(20);
        list.print();

        }

}

