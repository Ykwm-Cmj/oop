# 어댑터(Adapter)

호환되지 않는 인터페이스를 가진 객체들이 협업할 수 있도록 하는 패턴

실생활에서 대표적인 예시로 여행갈때 챙겨가는 변환 어댑터가 있음

어댑터는 한 객체읜 인터페이스를 구현하고 협업할 객체는 래핑함(객체 어댑터)

다중 상속이 가능한 언어에서는 협업할 클래스들을 상속받아 구현할 수도 있음(클래스 어댑터)

## 적용시기

+ 기존 클래스를 사용하고 싶지만 그 인터페이스가 나머지 코드와 호환되지 않을 때
+ 부모클래스에 추가할 수 없는 어떤 공통 기능들이 없는 여러 기존 자식 클래스들을 재사용하려는 경우

## Java의 표준 어댑터
+ java.util.Arrays#asList()
+ java.util.Collections#list()
+ java.util.Collections#enumeration()
+ java.io.InputStreamReader(InputStream)
+ java.io.OutputStreamWriter(OutputStream)
+ javax.xml.bind.annotation.adapters.XmlAdapter#marshal() 과 #unmarshal()

## 식별법

다른 추상/인터페이스 유형의 인스턴스를 받는 생성자의 존재여부

어댑터가 메서드(혹은 생성자)에서 매개변수를 적절한 형식으로 변환한 다음<br>
래핑된 객체의 하나 또는 여러 메서드들에 전달함
