// Mainクラスの定義
public class Main {
    public static void main(String[] args) {
        // CustomPairクラスのインスタンスを作成
        CustomPair<String> p1 = new CustomPair<>("test1", "test2");
        // CustomPairクラスのインスタンスを出力
        System.out.println("CustomPair: " + p1);

        // CustomPair2クラスのインスタンスを作成
        CustomPair2<String, Integer> p2 = new CustomPair2<>("test1", 100);
        // CustomPair2クラスのインスタンスを出力
        System.out.println("CustomPair2: " + p2);
    }
}
