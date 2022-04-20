/**
 * Класс, реализующий компактное хранение последовательности ASCII-символов (их коды влезают в один байт) в массиве байт.
 * По сравнению с классом String, хранящим каждый символ как char, AsciiCharSequence будет занимать в два раза меньше памяти.
 *
 * Класс AsciiCharSequence должен:
 * 1) реализовывать интерфейс java.lang.CharSequence;
 * 2) иметь конструктор, принимающий массив байт;
 * 3) определять методы length(), charAt(), subSequence() и toString().
 *
 * Сигнатуры методов и ожидания по их поведению смотрите в описании интерфейса java.lang.CharSequence.
 */

public class AsciiCharSequence implements java.lang.CharSequence{

    private final byte[] values;
    private final int length;

    public AsciiCharSequence(byte[] values) {
        this.values = values;
        this.length = values.length;
    }

    @Override
    public int length() {
        return this.length ;
    }

    @Override
    public char charAt(int index) {
        return (char) this.values[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        String res = new String();
        for (int i = start; i < end; i++){
            res = res + this.charAt(i);
        }
        return res;
    }

    @Override
    public String toString() {
        return (String) this.subSequence(0, this.length);
    }
}
