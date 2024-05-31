## 1. 스테이트 패턴?

- **스테이트 패턴** (State Pattern)
    - 객체가 상태에 따라 행위를 다르게 할 때, 직접 상태를 체크하여 상태에 따른 행위를 호출하는 것이 아니라 **상태를 객체화**하여 **필요에 따라 다르게 행동하도록 위임**하는 디자인 패턴
        - 객체의 특정 상태 = **클래스**
        - 상태에 따른 행위 = **클래스 내 메서드**
        - 상태 클래스를 인터페이스로 캡슐화

## **2. 사용 이유**

> **기존 상황 : 상태**와 **상태에 따른 행위**들이 추가될수록 **필요한 변수**와 **메서드 및 메서드 내부 조건문들이 추가되어야 함**
>

<aside>
💡 **스테이트 패턴은 상태를 객체화하여 위와 같은 문제를 해결하도록 돕는다.**

</aside>

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/61a5c6bf-7a59-4970-897f-bce1b48b7ca4/4cc8a3e5-9a46-4dc1-8500-dc07a10ca657/Untitled.png)

### BAD CODE : 상태를 조건문으로 검사해서 행위를 달리하는 코드

문서편집기

---

```jsx
public class Document {
    private String state; // "READ_ONLY" or "EDITABLE"
    private String content;

    public Document(String initialState) {
        this.state = initialState;
        this.content = "";
    }

    public void setState(String state) {
        this.state = state;
    }

    **public void write(String text) {
        if ("EDITABLE".equals(state)) {
            content += text;
            System.out.println("Writing to document: " + text);
        } else if ("READ_ONLY".equals(state)) {
            System.out.println("Document is read-only. Cannot write.");
        }
    }**

    public void read() {
        System.out.println("Document content: " + content);
    }

    public static void main(String[] args) {
        Document doc = new Document("READ_ONLY");

        doc.read();
        doc.write("Hello, world!"); // 출력: Document is read-only. Cannot write.

        doc.setState("EDITABLE");
        doc.write("Hello, world!"); // 출력: Writing to document: Hello, world!
        doc.read(); // 출력: Document content: Hello, world!
    }
}

```