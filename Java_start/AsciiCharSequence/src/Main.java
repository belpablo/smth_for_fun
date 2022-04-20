public class Main {

    public static void main(String[] args) {

        // Тесты:

        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new AsciiCharSequence(example);

        System.out.println("Sequence: " + answer.toString());//Hello!
        System.out.println("It's length: " + answer.length());//6
        System.out.println("0-th symbol: " + answer.charAt(0));//H
        System.out.println("Subsequence (1 - 5): " + answer.subSequence(1, 5));//ello

        //проверка на нарушение инкапсуляции private поля:
        System.out.println(answer.toString());//Hello!
        example[0] = 74;
        System.out.println(answer.toString());//Hello!
    }

}