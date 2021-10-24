package bagicStudy;

/**
 * 다이아몬드 클래스
 *
 * @author 백성덕
 */
public class Diamond {
    // 다이아몬드의 크기
    private final int size;
    private final int halfSize;

    // 다이아몬드 생성자 (생성시 크기를 지정)
    public Diamond(int size) {
        this.size = size;
        this.halfSize = size / 2;
    }

    /**
     * 다이아몬드 출력
     * 핵심은 각 행별로 어디까지 공백을 할것인지 기준에 따라 찍고 그 후에 는 별을 어디까지 찍을지 찾는것.
     * 행별로 별을 찍고 뒷공백은 생각하지 않는다.
     */
    public void print() {
        // 행 for문. size가 5일 때, row는 -2,-1,0,1,2 로 진행.
        for (int i = -halfSize; i <= halfSize; i++) {
            // 비교용 변수.
            int k = 0;
            // 열 for문. Math.abs함수는 절대값 구하는 함수.
            for (int j = 0; j < size - Math.abs(i); j++) {
                // k와 행의 절대값과 비교해서 출력문구를 결정. 공백이 먼저 나오다 별이 나옴.
                String result = k < Math.abs(i) ? " " : "*";
                System.out.print(result);
                k++;
            }
            // 줄바꿈
            System.out.println();
        }
    }
}
