### Iterator Pattern

---

⇒ 자료구조 별 순회 로직?

- 컬렉션 별로 순회 하는 로직이 다를 수 있다. 너비 우선? 깊이 우선?

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/61a5c6bf-7a59-4970-897f-bce1b48b7ca4/ad00c9b9-a1ca-48a0-b0c8-78f783e0aff0/Untitled.png)

> 이러한 복잡하게 얽혀있는 자료 컬렉션들을 순회하는 알고리즘 전략을 이터레이터 패턴이라고 함 → 컬렉션객체 안에 있는 원소들에 대한 접근 방식을 공통화 하여, 어떤 종류의 컬렉션에서도 순회가능하도록 다형적 설계 가능!
>

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/61a5c6bf-7a59-4970-897f-bce1b48b7ca4/05ed3dfb-96b8-4e46-9849-daa296498e7b/Untitled.png)

<aside>
💡 자바의 컬렉션 프레임워크(JCF)에서 각종 컬렉션을 무리없이 순회할수 있는 것도 내부에 미리 이터레이터 패턴이 적용되어 있기 때문!

</aside>

### 구조

---

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/61a5c6bf-7a59-4970-897f-bce1b48b7ca4/ff0a731a-50e2-4b96-8d87-02337d36a25b/Untitled.png)

- [ ]  Aggregate (인터페이스) : ConcreateIterator 객체를 반환하는 인터페이스를 제공
    - iterator() : ConcreateIterator 객체를 만드는 팩토리 메서드
- [ ]  ConcreateAggregate (클래스) : 여러 요소들이 이루어져 있는 데이터 집합체
- [ ]  Iterator (인터페이스) : 집합체 내의 요소들을 순서대로 검색하기 위한 인터페이스를 제공
    - hasNext() : 순회할 다음 요소가 있는지 확인 (true / false)
    - next() : 요소를 반환하고 다음 요소를 반환할 준비를 하기 위해 커서를 이동시킴
- [ ]  ConcreateIterator (클래스) : 반복자 객체
    - ConcreateAggregate가 구현한 메서드로부터 생성되며, ConcreateAggregate 의 컬렉션을 참조하여 순회
    - 어떤 전략으로 순회할지에 대한 로직을 구체화


### 장점

---

- 일관된 이터레이터 인터페이스를 사용해 여러 형태의 컬렉션에 대해 동일한 순회 방법을 제공한다.
- 컬렉션의 내부 구조 및 순회 방식을 알지 않아도 된다.
- 데이터 저장 컬렉션 종류가 변경되어도 클라이언트 구현 코드는 손상되지 않아 수정에는 닫혀 있어 개방 폐쇄 원칙을 준수한다.

### 단점

---

- 복잡도 증가