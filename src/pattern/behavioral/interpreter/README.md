### Interpreter

---

⇒ 컴퓨터 사이언스에서 인터프리터란?

<aside>
💡 원시코드(소스코드)를 기계언어로 변환하는 프로그램

</aside>

- 문법에 맞춰 작성된 스크립트를 해석하는 패턴
- 해석된 구문을 정해진 규칙대로 실행하는 패턴

```java
BEGIN FRONT LOOP 2 BACK RIGHT END BACK END
```

### 사용되는 명칭

---

1. **Abstract Expression (추상 표현식)**: 해석할 수 있는 모든 표현식에 대한 인터페이스를 정의
2. **Terminal Expression (종단 표현식)**: 더 이상 분해할 수 없는 표현식
3. **Non-terminal Expression (비종단 표현식)**: 다른 표현식을 포함하고 있는 표현식
4. **Context (문맥)**: 해석되는 정보를 유지하는 역할
5. **Client**: 표현식을 만들고 해석하는 역할

### 트리구조

---

3 + (4 * 5)

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/61a5c6bf-7a59-4970-897f-bce1b48b7ca4/9008fe1b-d1f5-41a3-a325-9d05c04aec5c/Untitled.png)