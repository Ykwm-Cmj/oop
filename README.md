# OOP

## 정의

#### 객체지향프로그래밍(Object-Oriented Programming)
컴퓨터 프로그램을 명령어의 목록으로 보는 시각에서 벗어나 <br>
여러 독립된 단위의 객체들의 상호작용으로 구성하는 프로그래밍 패러다임

#### 객체(Objeect)
메소드, 변수를 가지며 특정 역할을 수행하도록 정의한 추상적인 개념

## 배경

기존 패러다임은 절차적 프로그램밍 방식으로 프로그램을 명령어의 모음으로 인식했음

프로그램의 기능에만 신경을 써서 스파게티코드를 낳는 상황이 발생함

위와 같은 문제를 해결하기 위해 구조적 프로그래밍 방식이 나옴

큰 문제를 해결하기 위해 몇 가지 작은 문제들로 나누어 해결하는 Top-down 방식임

이것마저도 문제들이 생겨 이를 해결하기 위해 객체지향 프로그래밍이 나옴
> **구조적 프로그래밍의 문제**<br>
> 데이터 처리방법은 구조화했으나 데이터 자체는 구조화 하지 못함<br>
> 전역 네임스페이스 포화(이미 이름을 다씀)<br>
> 실행 콘텍스트(실행할 코드에 제공할 환경 정보를 모아놓은 객체)를 저장할 방법이 없음 등등

객체지향 프로그래밍은 작은 문제를 해결하는 객체를 만든 후 그 객체들의 조합으로 큰문제를 해결하는 Bottom-up 방식

객체란 것을 독립성과 신뢰성을 높게 만들어놓으면 재사용할수 있으므로 개발기간과 비용이 대폭 줄어듬

> 시대가 지나면서 프로그램이 복잡해지고 복잡해진 객체 지향 프로그램을 간결하게 정리하기 위해 디자인 패턴이 생김

## 특징

### 캡슐화(encapsulation)

변수와 함수를 하나의 단위로 묶는 것(데이터 번들링,bundling)

#### 정보은닉(information hiding)

프로그램 세부 구현을 외부로 드러나지 않도록 감추는 것

내부 구현은 감추고 모듈 내에서 응집도를 높이고<br>
외부로의 노풀은 최소화하여 모듈간의 결합도를 떨어뜨리려는 목적<br> 
=> 유연함과 유지보수성이 높아짐

### 상속(inheritance)

자식 클래스가 부모 클래스의 특성과 기능을 물려받는 것

### 다형성(polymorphism)

변수나 함수가 상황에 따라 다른 의미로 해석될 수 있는 것

+ 서브타입 다형성(subtype polymorphism)<br>
    상위 클래스를 상속받은 하위 클래스를 만들어 <br>
    상위 클래스의 포인터나 참조변수들이 하위 클래스의 객체를 참조하게 하는것<br>
    (오버라이딩, orverriding)
+ 매개변수 다형성(parametric polymorphism)<br>
    타입을 매개변수로 받아 새로운 타입을 되돌려주는 기능<br>
   (제네릭, generic)
+ 임시 다형성(ad hoc polymorphism)<br>
    함수 오버로딩(function overloading)<br>
    동일한 이름의 함수를 매개변수에 따라 다른 기능으로 동작하도록 하는 기능<br>
    많이 사용하면 유지보수가 어려워져서 제네릭을 대체하는것이 일반적임
+ 강제 다형성(coercion polymorphism)<br>
    묵시적 형변환(implicit type coercion)<br>명시적 형변환(explicit type coercion)

## 원칙
SOLID 라고도 함

### SRP(Single Resposibility Principle) 단일 책임 원칙

객체는 오직 하나의 책임을 가져야한다.

> 한 클래스가 2가지의 책임을 지게되면 클래스의 목적이 모호해지고<br>
> 기능 수정 시 영향을 받는 범위도 커져 유지보수가 힘들어짐

### OCP(Open-Closed Principle) 개방-폐쇄 원칙

객체는 확장에 대해서는 개방적이고 수정에 대해서는 폐쇄적이어야 한다.<br>
(기능의 확장은 허용하고 스스로의 변경은 피해야함)

> 캐릭터 라는 클래스의 이동 메서드가 있을 때<br>
> 하위 클래스가 이동 메서드를 재정의 하는것(확장)<br>
> 캐릭터 클래스의 이동 메서드를 수정하는것(수정)

### LSP(Liskov Substitution Principle) 리스코프 치환 원칙

자식 클래스는 언제나 부모 클래스를 대체할 수 있어야 한다.<br>
(이 원칙이 지켜지지 않으면 다형성을 지킬 수 없게 됨)

> 옛날 핸드폰을 기준으로 객체를 설계 했을때<br>
> 이를 상속받은 스마트폰 클래스의 인스턴스는 통화버튼이 없어서 통화기능을 못쓰는 경우가 생김 

### ISP(Interface Segregation Principle) 인터페이스 분리 원칙

클라이언트를 기준으로 인터페이스를 분리해야 한다.

> 프린터와 팩스라는 클래스가 복합기라는 인터페이스를 지정받으면<br> 
> 필요없는 메서드를 강제하게 되는데<br>
> 이것보다는 프린터와 팩스라는 2개의 인터페이스를 만들어서<br>
> 복합기라는 클래스나 인터페이스가 2개의 인터페이스를 상속받아야함

### DIP(Dependency Inversion Principle) 의존석 역전 원칙

추상성이 높고 안정적인 고수준의 클래스는 구체적이고 불안정한 저수준의 클래스에 의존해서는 안된다.<br>
(보통 고수준의 클래스에서 저수준의 클래스를 추상화한 인터페이스를 사용해서 지킴)

> 이 원칙을 지키면 고수준의 클래스에서 어떤 변경도 없이
> 저수준의 클래스를 교체시킬 수 있다.
