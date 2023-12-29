package com.example.quizz_v1;

import java.util.ArrayList;
import java.util.Arrays;

public class Question {
    private final String questionText;
    private final String optionA,optionB,optionC,optionD,correctAns;

    public Question(String questionText, String optionA, String optionB, String optionC, String optionD, String correctAns) {
        this.questionText = questionText;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctAns = correctAns;
    }

    public static ArrayList<Question> toan_de = new ArrayList<>(
            Arrays.asList(
                    new Question("1 + 1 = ", "1", "2", "0", "11", "B"),
                    new Question("2 * 2 = ","4", "2", "22", "40", "A"),
                    new Question("1011 + 0000 = ","1011", "1111", "1001", "1110", "A"),
                    new Question("15 * 11 = ","165", "200", "5", "4", "A"),
                    new Question("20 * 20 = ","400", "2", "255", "102", "A")
            ));

    public static ArrayList<Question> toan_trungbinh = new ArrayList<>(
            Arrays.asList(
                    new Question("1 + 1 = ", "1", "2", "0", "11", "B"),
                    new Question("2 * 2 = ","4", "2", "22", "40", "A"),
                    new Question("1011 + 0000 = ","1011", "1111", "1001", "1110", "A"),
                    new Question("15 * 11 = ","165", "200", "5", "4", "A"),
                    new Question("20 * 20 = ","400", "2", "255", "102", "A")
            ));

    public static ArrayList<Question> toan_kho = new ArrayList<>(
            Arrays.asList(
                    new Question("1 + 1 = ", "1", "2", "0", "11", "B"),
                    new Question("2 * 2 = ","4", "2", "22", "40", "A"),
                    new Question("1011 + 0000 = ","1011", "1111", "1001", "1110", "A"),
                    new Question("15 * 11 = ","165", "200", "5", "4", "A"),
                    new Question("20 * 20 = ","400", "2", "255", "102", "A")
            ));
    public static ArrayList<Question> anh_de = new ArrayList<>(
            Arrays.asList(
                    new Question("I use the stones____the stones", "to destroy", "destroy", "destroyed", "none", "A"),
                    new Question("I agree____Thanos everyday a little more", "to", "with", "about", "none", "B"),
                    new Question("Some men just____to watch the world burn", "want", "wanted", "wants", "none", "A"),
                    new Question("She ran 2km and now____.", "she is dead", "she was dead", "she died", "none", "C"),
                    new Question("He____playing with his dog", "is playing", "plays", "to play", "played", "A")

            ));

    public static ArrayList<Question> anh_trungbinh = new ArrayList<>(
            Arrays.asList(
                    new Question("I use the stones____the stones", "to destroy", "destroy", "destroyed", "none", "A"),
                    new Question("I agree____Thanos everyday a little more", "to", "with", "about", "none", "B"),
                    new Question("Some men just____to watch the world burn", "want", "wanted", "wants", "none", "A"),
                    new Question("She ran 2km and now____.", "she is dead", "she was dead", "she died", "none", "C"),
                    new Question("He____playing with his dog", "is playing", "plays", "to play", "played", "A")
            ));
    public static ArrayList<Question> anh_kho = new ArrayList<>(
            Arrays.asList(
                    new Question("I use the stones____the stones", "to destroy", "destroy", "destroyed", "none", "A"),
                    new Question("I agree____Thanos everyday a little more", "to", "with", "about", "none", "B"),
                    new Question("Some men just____to watch the world burn", "want", "wanted", "wants", "none", "A"),
                    new Question("She ran 2km and now____.", "she is dead", "she was dead", "she died", "none", "C"),
                    new Question("He____playing with his dog", "is playing", "plays", "to play", "played", "A")
            ));

    public static ArrayList<Question> vatly_de = new ArrayList<>(
            Arrays.asList(
                    new Question("Trọng lực là:", "Lực đẩy của Trái Đất", "Lực hút của Trái Đất", "Lực đẩy của Mặt Trời", "Lực đẩy của Mặt Trăng", "B"),
                    new Question("Sử dụng hiệu điện thế nào dưới đây có thể gây nguy hiệm đối với cơ thể người?", "6V", "12V", "10V", "220V", "D"),
                    new Question("Dòng điện có cường độ nào dưới đây nếu đi qua cơ thể người là nguy hiểm?","40mA", "50mA", "60mA", "80mA", "D"),
                    new Question("Sử dụng loại đèn nào dưới đây sẽ tiêu thụ điện năng nhiều nhất?", "Đèn compac", "Đèn dây tóc nóng sáng", "Đèn LED", "Đèn ống", "B"),
                    new Question("Lực đàn hồi của lò xo:", "Chỉ xuất hiện khi lò xo bị kéo dãn ra", "Chỉ xuất hiện khi lò xo bị nén vào", "Luôn luôn xuất hiện trên lò xo", "Xuất hiện ngay cả khi lò xo bị kéo dãn ra hay bị nén vào", "D")
            ));

    public static ArrayList<Question> vatly_trungbinh = new ArrayList<>(
            Arrays.asList(
                    new Question("Trọng lực là:", "Lực đẩy của Trái Đất", "Lực hút của Trái Đất", "Lực đẩy của Mặt Trời", "Lực đẩy của Mặt Trăng", "B"),
                    new Question("Sử dụng hiệu điện thế nào dưới đây có thể gây nguy hiệm đối với cơ thể người?", "6V", "12V", "10V", "220V", "D"),
                    new Question("Dòng điện có cường độ nào dưới đây nếu đi qua cơ thể người là nguy hiểm?","40mA", "50mA", "60mA", "80mA", "D"),
                    new Question("Sử dụng loại đèn nào dưới đây sẽ tiêu thụ điện năng nhiều nhất?", "Đèn compac", "Đèn dây tóc nóng sáng", "Đèn LED", "Đèn ống", "B"),
                    new Question("Lực đàn hồi của lò xo:", "Chỉ xuất hiện khi lò xo bị kéo dãn ra", "Chỉ xuất hiện khi lò xo bị nén vào", "Luôn luôn xuất hiện trên lò xo", "Xuất hiện ngay cả khi lò xo bị kéo dãn ra hay bị nén vào", "D")
            ));

    public static ArrayList<Question> vatly_kho = new ArrayList<>(
            Arrays.asList(
                    new Question("Trọng lực là:", "Lực đẩy của Trái Đất", "Lực hút của Trái Đất", "Lực đẩy của Mặt Trời", "Lực đẩy của Mặt Trăng", "B"),
                    new Question("Sử dụng hiệu điện thế nào dưới đây có thể gây nguy hiệm đối với cơ thể người?", "6V", "12V", "10V", "220V", "D"),
                    new Question("Dòng điện có cường độ nào dưới đây nếu đi qua cơ thể người là nguy hiểm?","40mA", "50mA", "60mA", "80mA", "D"),
                    new Question("Sử dụng loại đèn nào dưới đây sẽ tiêu thụ điện năng nhiều nhất?", "Đèn compac", "Đèn dây tóc nóng sáng", "Đèn LED", "Đèn ống", "B"),
                    new Question("Lực đàn hồi của lò xo:", "Chỉ xuất hiện khi lò xo bị kéo dãn ra", "Chỉ xuất hiện khi lò xo bị nén vào", "Luôn luôn xuất hiện trên lò xo", "Xuất hiện ngay cả khi lò xo bị kéo dãn ra hay bị nén vào", "D")
            ));


    public String getQuestionText() {
        return questionText;
    }

    public String getOptionA() {
        return optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public String getCorrectAns() {
        return correctAns;
    }


}
