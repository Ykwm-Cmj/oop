## 목차

---

- 복합체 패턴이란?
- 복합체 패턴 등장 배경
- 복합체 패턴을 통한 해결

## *복합체  패턴이란?*

---

<aside>
💡 하나의 오브젝트 그룹(리스트 안에 오브젝트)과 그 오브젝트의 단일 객체가 같은 타입으로 취급되는 패턴

이를 통해 오브젝트를 트리구조로 관리할 수 있다.

</aside>

> 같은 타입 → 같은 인터페이스를 사용하고 있다.
결국 인터페이스의 구현체(상속물)들이다.

이때,
인터페이스 → Component
상속 받은 단일객체 → Leaf
오브젝트 리스트 → Composite (인터페이스 타입의 객체 리스트)
>
>
> ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/61a5c6bf-7a59-4970-897f-bce1b48b7ca4/f033b6f7-2702-4e3a-9949-3822d64de271/Untitled.png)
>

## 복합체 패턴의 등장배경

---

> 이런식으로 나 자신이 누군가의 부분일 수가 있고, 전체일 수도 있는 구조를 표현하고자 할때, 동일한 작업을 최상위에서 한번 실행할 수 없을까?
>
>
> ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/61a5c6bf-7a59-4970-897f-bce1b48b7ca4/413c0206-5d68-4849-9261-2f8c7d8a1d87/Untitled.png)
>
> ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/61a5c6bf-7a59-4970-897f-bce1b48b7ca4/216feaa7-288e-45d8-951d-03d49da0d14a/Untitled.png)
>
> ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/61a5c6bf-7a59-4970-897f-bce1b48b7ca4/9750a10b-b7f3-48e9-8688-4eba29c5a07f/Untitled.png)
>

## 복합체 패턴을 통한 해결

---

<aside>
💡 애플리케이션의 핵심 모델이 트리구조로 표현될 수 있을 때만 사용한다.

부분-전체의 관계를 표현하는 패턴이다. 따라서, 재귀적 구조를 표현할 때 요ㅑㅇ이하다.

</aside>

!! 재귀적 구조란? 자신을 정의할때 자기자신을 참조하는 구조

분할정복

ex) 파일디렉토리 → 디렉토리는 파일과 다른 디렉토리를 포함할 수 있다.

![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/61a5c6bf-7a59-4970-897f-bce1b48b7ca4/1b007f93-bc96-4f3e-b0c9-b181d99589f5/Untitled.png)