# 중재자(Mediator)

객체 간의 혼란스러운 의존 관계를 줄일 수 있는 행동 패턴

객체간의 직접 통신을 제한하고 중재자를 통해 협력하도록 함

## 적용 시기

일부 클래스들이 다른 클래스들과 단단하게 겨합하여 변경하기 어려울 때

단단한 의존성 때문에 다른 프로그램에서 컴포넌트를 재사용할 수 없는 경우

어떤 행동을 하려할 때 다른 콘텍스트에서 재사용하기 위해 다시 자식클래스들을 만들 때

## 구현법

중재자 인터페이스를 선언하고 다양한 컴포넌트 간의 통신을 정의

컴포넌트들에 대한 참조를 중재자 클래스 내부에 저장

컴포넌트들도 중재자 객체에 대한 참조를 저장

컴포넌트의 코드를 다른 컴포넌트를 호출하는 것 대신 중재자를 호출하도록 수정