// CustomPair2クラスの定義
public class CustomPair2<T, S> {
    public T first;
    public S second;

    // コンストラクタ
    public CustomPair2(T first, S second) {
        this.first = first;
        this.second = second;
    }

    // toStringメソッドのオーバーライド
    @Override
    public String toString() {
        return "(" + this.first + "," + this.second + ")";
    }
}
