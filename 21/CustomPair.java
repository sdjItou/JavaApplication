// CustomPairクラスの定義
public class CustomPair<T> {
    public T first;
    public T second;

    // コンストラクタ
    public CustomPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    // toStringメソッドのオーバーライド
    @Override
    public String toString() {
        return "(" + this.first + "," + this.second + ")";
    }
}
