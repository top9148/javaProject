//: ## version 10
//: - 생성자를 이용하여 인스턴스를 초기화시키라.
//: - 인스턴스를 다루는 메서드는 인스턴스 메서드로 전환하라.
//: 
//:

package javaProject;
 
public class App {

    public static void main(String[] args) {
     // Score 설계도에 따라 메모리를 준비한다.
        Score[] scores = {
            new Score("홍길동", 100, 90, 80), 
            new Score("임꺽정", 80, 80, 80), 
            new Score("유관순", 100, 100, 100)
        };
        
        for (Score s : scores) {
            s.print();
        }
    }
}


