public class Main {
    public static void main(String[] args) {
        String player1 = "Mike";
        String player2 = "Kolyan";
        doHod(player1);
        doHod1(player2);
        doHod(player1);
        doHod1(player2);
        doHod(player1);
        doHod1(player2);
    }
    static void doHod(String playerName) {
        System.out.println(playerName + " drew a cross");
    }
    static void doHod1(String playerName) {
        System.out.println(playerName + " draw a zero");
    }
}