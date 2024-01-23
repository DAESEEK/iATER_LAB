package bagicStudy;

/**
 * 구구단 클래스
 *
 * @author 백성덕 (baek.sungduk@nhnpayco.com)
 */
public class Gugudan {

    // 구구단 출력
    public void print(int dan) {
        // 구구단 출력부
        for(int i=2; i<10; i++) {
            System.out.println(dan + "*" + i + "=" + dan * i);
        }
    }
}
