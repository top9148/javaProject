// version 05
//- 클래스 문법 응용

package javaProject;

public class App {
    public static void main(String[] args) {
        // 학생의 성적을 저장할 때 사용할 사용자 정의 데이터 타입을 만든다.
        //: > '사용자 정의 데이터 타입'은 데이터를 저장할 *메모리를 설계*하는 것이다.
        
        class Score {
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;
        }
        
        //: 학생의 성적을 저장할 메모리를 준비한다.
        Score s1 = new Score();
        s1.name = "홍길동";
        s1.kor = 100;
        s1.eng = 90;
        s1.math = 80;
        s1.sum = s1.kor + s1.eng + s1.math;
        s1.aver = s1.sum / 3f;
        
        Score s2 = new Score();
        s2.name = "임꺽정";
        s2.kor = 80;
        s2.eng = 80;
        s2.math = 80;
        s2.sum = s2.kor + s2.eng + s2.math;
        s2.aver = s2.sum / 3f;
        
        Score s3 = new Score();
        s3.name = "유관순";
        s3.kor = 100;
        s3.eng = 100;
        s3.math = 100;
        s3.sum = s3.kor + s3.eng + s3.math;
        s3.aver = s3.sum / 3f;
        
        //: 학생 성적을 출력한다.
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
            s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.aver);
        
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                s2.name, s2.kor, s2.eng, s2.math, s2.sum, s2.aver);
        
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                s3.name, s3.kor, s3.eng, s3.math, s3.sum, s3.aver);
    }
}
