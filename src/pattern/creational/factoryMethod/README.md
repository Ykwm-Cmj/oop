# 팩토리 메서드(Factory Method)

객체를 만들어 반환하는 함수를 생성자 대신 제공하여 초기화 과정을 외부에서 보지 못하게 숨기는 방법

부모 클래스에서 객체를 생성할 수 있는 인터페이스를 제공하며 자식클래스들이 생성될 객체들의 유형을 변경할 수 있도록 하는 패턴

객체의 생성만 책임지는 객체를 만드는 방법과 <br>
팩토리의 기능을 하는 메서드를 따로 만들어 생성자를 감추는 방법이 있다.

> 팩토리 패턴을 사용하면 단일책임원칙을 더 잘 지키게 됨 

> 클라이언트 코드가 작동해야하는 객체들의 유형과 의존관계를 모르는 경우,<br>
> 내부 컴포넌트들을 확장하는 방법을 제공하고 싶을 때 좋음
> 기존 객체들을 매번 재구축하는 대신 재사용하여 자원을 절약하고 싶을 때 사용