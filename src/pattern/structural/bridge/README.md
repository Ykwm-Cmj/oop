## 목차

---

- 브릿지 패턴이란?
- 브릿지 패턴 등장 배경
- 브릿지 패턴을 통한 해결

## 브릿지 패턴이란?

---

<aside>
💡 큰 클래스 또는 밀접하게 관련된 클래스들의 집합을 두 개의 개별 계층구조(추상화 및 구현)로 나눈 후 각각 독립적으로 개발할 수 있도록 하는 구조 디자인 패턴

</aside>

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/61a5c6bf-7a59-4970-897f-bce1b48b7ca4/69d3fdb0-66c8-4fc4-8775-27c0cab751ad/Untitled.png)

> 새로운 기능이 추가된 텔레비전(구현)이 나오더라도 기존의 리모컨(추상화)를 변경하지 않고도 새로운 리모컨의 기능을 제어할 수 있다!
>

## 브릿지 패턴의 등장배경

---

> 만약? 원과 직사각형이라는 자식클래스를 가지는 Shape(모양) 클래스가 있는데. 이 계층구조에 색상을 도입하기 위해서 Red와 Blue 자식클래스를 만들거라면?

→ 4개의 클래스를 만들어야함(기하급수적인 증가로 인한 자원낭비)
>
>
> ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/61a5c6bf-7a59-4970-897f-bce1b48b7ca4/9a734c5b-eec2-490e-a1dd-41b0e28500a7/Untitled.png)
>

## 브릿지 패턴을 통한 해결

---

> 그럼 모양과 색을 분리해보자.
그리고 모양에 색을 입히는 방식으로 하면 어떨까?
이때 모양과 색 그 어떤 것도 확장이 가능하게 인터페이스나 추상클래스로 설계를 한다면?
>

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/61a5c6bf-7a59-4970-897f-bce1b48b7ca4/0cea7166-7ec8-4c0f-9ee1-42656e196bc6/Untitled.png)

> 모양에 색을 입히는 방식으로 설계
>

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/61a5c6bf-7a59-4970-897f-bce1b48b7ca4/a205e942-120b-45e3-bdc1-82d97f8ac702/Untitled.png)

<aside>
💡 Abstract 추상클래스(추상화) + interface(구현) 의 분리
or
interface 2개로도 설계가능

</aside>

## 예시

---

- [ ]  인텔리제이 코드 외 예시

TV.java(interface)

```java
interface TV {
    void powerOn();
    void powerOff();
    void changeChannel(int channel);
}
```

AdvancedTV.java(새로운 기능이 생긴 티비)

```java
class AdvancedTV implements TV {
    @Override
    public void powerOn() {
        System.out.println("Advanced TV is powered on.");
    }

    @Override
    public void powerOff() {
        System.out.println("Advanced TV is powered off.");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("Advanced TV is changing to channel " + channel);
    }

    // 새로운 기능
    public void connectToInternet() {
        System.out.println("Advanced TV is connected to the internet.");
    }
}
```

[Remote.java](http://Remote.java)(interface)

```java
interface Remote {
    void power();
    void channelUp();
    void channelDown();
}

```

BasicRemote.java(기존 리모컨)

```java
class BasicRemote implements Remote {
    private TV tv;

    public BasicRemote(TV tv) {
        this.tv = tv;
    }

    @Override
    public void power() {
        tv.powerOn();
    }

    @Override
    public void channelUp() {
        System.out.println("Basic Remote is changing channel up.");
    }

    @Override
    public void channelDown() {
        System.out.println("Basic Remote is changing channel down.");
    }
}
```

AdvancedRemote (새로운 기능의 티비를 제어하는 리모컨)

```java
class AdvancedRemote implements Remote {
    private AdvancedTV tv;

    public AdvancedRemote(AdvancedTV tv) {
        this.tv = tv;
    }

    @Override
    public void power() {
        tv.powerOn();
    }

    @Override
    public void channelUp() {
        System.out.println("Advanced Remote is changing channel up.");
    }

    @Override
    public void channelDown() {
        System.out.println("Advanced Remote is changing channel down.");
    }

    // 새로운 기능을 제어하는 메서드
    public void connectToInternet() {
        tv.connectToInternet();
    }
}
```

Main.java

```java
public class Main {
    public static void main(String[] args) {
        // 새로운 기능이 추가된 텔레비전 생성
        AdvancedTV advancedTV = new AdvancedTV();

        **// 기존 리모컨으로 텔레비전 제어
        BasicRemote basicRemote = new BasicRemote(advancedTV);**
        basicRemote.power(); // 텔레비전을 켬
        basicRemote.channelUp(); // 채널을 올림

        // 새로운 리모컨으로 텔레비전 제어 (새로운 기능 제어)
        AdvancedRemote advancedRemote = new AdvancedRemote(advancedTV);
        advancedRemote.power(); // 텔레비전을 켬
        advancedRemote.connectToInternet(); // 인터넷에 연결
    }
}
```

<aside>
💡 BasicRemote 클래스 안에서 TV 변수가 TV 인터페이스를 참조하도록 선언되어 있다. 이렇게 하면 BasicRemote 클래스의 하위 클래스에서 해당 인터페이스를 구현한 구체적인 클래스(예: BasicTV(있다면), AdvancedTV )의 인스턴스를 참조할 수 있다.

</aside>