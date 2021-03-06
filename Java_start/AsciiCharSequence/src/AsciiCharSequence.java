import java.util.Arrays;

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

        /* клонирование, чтобы не допустить возможности
        изменения содержания this.values извне класса */

        byte[] vals = values.clone();
        this.values = vals;
        this.length = vals.length;
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
        return new AsciiCharSequence(Arrays.copyOfRange(this.values, start, end));
    }

    @Override
    public String toString() {
        return new String(values);
    }
}
