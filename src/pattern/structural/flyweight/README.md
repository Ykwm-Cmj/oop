## 목차

---

- 플라이웨이트 패턴이란?
- 플라이웨이트 등장 개요
- 플라이웨이트 패턴 구조
- 플라이웨이트 구현 방법

## 📔Flyweight Pattern이란?

---

<aside>
💡 재사용 가능한 객체 인스턴스를 공유시켜 메모리 사용량을 최소화 하는 구조패턴(쓸때없는 new를 줄인다)

⇒ 이로써 캐시(Cache)의 개념을 코드로 패턴화 한 느낌이 된다.

</aside>

## Flyweight 패턴 등장 개요

---

> 게임개발 → 게임 내 몬스터 개체 수 증가(메이플 스토리) → 이들 객체는 유사한 그래픽 요소나 특성을 가지고 있음 → 메모리 사용량 급증 및 실행속도 저하
>

그럼? 모든 객체가 가지는 공통의 **고유한 속성[공유가능](intrinsic)**와 각 객체들이 외부에 의하여 변경될 수 있는 **유니크 속성**[**공유 불가능한 속성](extrinsic)**를 나눠서 객체를 생성하면 어떨까?

## Flyweight 패턴 구조

---

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/61a5c6bf-7a59-4970-897f-bce1b48b7ca4/cfe6289f-af69-4c10-91ce-1a53efed4571/Untitled.png)

- [ ]  Flyweight 경량 객체를 묶는 인터페이스.
- [ ]  **ConcreteFlyweight** 구현체 → 공유 가능하여 재사용되는 객체(intrinsic state)
- [ ]  **UnsahredConcreteFlyweight** 구현체 → 공유 불가능한 객체(**extrinsic state)**
- [ ]  FlyweightFactory
    - 경량 객체를 만드는 공장 역할과 캐시 역할을 겸비하는 Flyweight 객체 관리 클래스
    - GetFlyweight() 메서드 : 팩토리 메서드 역할
    - 만일 객체가 메모리에 존재하면 그대로 가져와 반환하고, 없다면 새로 생성해 반환한다
- [ ]  Client 클라이언트
    - FlyweightFactory를 통해 Flyweight 타입의 객체를 얻어 사용한다.

## Flyweight 패턴 구현방법

---

<aside>
💡 본질적인 상태(고유) 와 비본질적인 상태(유니크)를 잘 나눌 수 있어야한다.

</aside>

> intrinsic한 객체 : 장소나 상황에 의존하지 않기 때문에 값이 고정되어 공유할 수 있는 객체
>

> extrinsic한 객체 : 장소나 상황에 의존하기 때문에 매번 값이 바뀌어 공유할 수 없는 객체
>

ex) 폭탄피하기 게임이 있다고 하면?

폭탄 하나하나를 new 해서 매번 생성을 하면 각 폭탄마다 메모리를 잡아먹고 있어서 게임이 무거워진다.

따라서 이 폭탄을 플라이웨이트로 처리함으로써 폭탄 인스턴스는 하나만 만들고 이를 공유하여 화면에 뿌리면 된다.

😃폭탄의 속성이 아래와 같을때 본질/비본질을 나누면?

- [ ]  폭탄모양
- [ ]  폭탄 색깔
- [ ]  폭탄 x,y 좌표위치

> intrinsic → 폭탄 모양, 폭탄 색깔 → 캐시화가능
>

> extrinsic → 폭탄 x,y 좌표 → 캐시화 불가능
>

🫥**폭탄 클래스 구조를 플라이웨이트 디자인 패턴로 표현**

<aside>
💡 폭탄의 형태나 색깔 같은 고정 정보를 포함하고 있는 객체는 ConcreteFlyweight로 구현 되고, 폭탄의 좌표값 같은 정보를 변화 정보를 포함하고 있는 객체는 UnsahredConcreteFlyweight로 구현!

그리고 이 폭탄 객체를 FlyweightFactory가 생성하고 캐싱하고 관

</aside>

-

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/61a5c6bf-7a59-4970-897f-bce1b48b7ca4/b224782e-0562-4aac-abd2-bb461bc506e6/Untitled.png)