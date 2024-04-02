# Prototype(프로토타입)

## 목차

---

- 프로토타입 패턴이란?
- 프로토타입 패턴의 등장 개요
- 프로토타입 패턴을 통한 해결책

## 📔프로토타입 패턴이란?

---

<aside>
💡 **프로토타입**은 코드를 그들의 클래스들에 의존시키지 않고 기존 객체들을 복사할 수 있도록 하는 생성 디자인 패턴입니다.

</aside>

## 📔개요

---

> 고민 : 객체가 있는데 그 객체의 정확한 복사본을 만들고 싶으면 어떻게 해야할까?
>
- new 로 동일한 필드에 값을 set해서 만드는건 결국 메모리 공간을 새로 차지하는거니까 서로 독립적인 객체다

    ```jsx
    ex) Person person1 = new Person("John", 30, "123 Main St"); 
        Person person2 = new Person("John", 30, "123 Main St"); 
    ```

- 여기서 말하는 복사란, 실제 객체 person1에 들어있는 내부의 데이터를 외부에서 가져오고 싶어하는 거다(하지만 근본적으로 필드는 캡슐화로 인해 private이라서 접근을 못함)
- 복사가 가능하려면 클래스정보를 알아야하는데, 해당 클래스가 이렇게 구성되어있어야함

  ⇒해당 클래스 스코프 내에서 필드의 값을 set할 수 있어야함

    ```jsx
    public class Person {
        private String name;
        private int age;
        private String address;
    
        // 생성자, 게터, 세터 등 필요한 메서드들...
    
        public Person copy() {
            Person copiedPerson = new Person();
            copiedPerson.setName(this.name);
            copiedPerson.setAge(this.age);
            copiedPerson.setAddress(this.address);
            return copiedPerson;
        }
    }
    
    ```

- 객체의 복제본을 생성하려면 객체의 클래스를 알아야 하므로, 당신의 코드가 해당 클래스에 의존하게 된다

  ⇒ 인텔리제이 예제코드 참조

    - code

        ```jsx
        class Address {
            private String city;
            private String street;
        
            public Address(String city, String street) {
                this.city = city;
                this.street = street;
            }
        
            // 주소 정보를 복제하는 메서드
            public Address clone() {
                return new Address(this.city, this.street);
            }
        
            // 주소 정보 출력 메서드
            public void printAddress() {
                System.out.println("City: " + city + ", Street: " + street);
            }
        }
        
        class Person {
            private String name;
            private int age;
            private Address address;
        
            public Person(String name, int age, Address address) {
                this.name = name;
                this.age = age;
                this.address = address;
            }
        
            // 객체를 복제하는 메서드
            public Person dependentCopy() {
                // Address 객체도 함께 복제하여 새로운 객체 생성
                Address dependentAddressCopy = this.address.clone();
                return new Person(this.name, this.age, dependentAddressCopy);
            }
        
            // 개인 정보를 출력하는 메서드
            public void printInfo() {
                System.out.println("Name: " + name + ", Age: " + age);
                System.out.print("Address: ");
                address.printAddress();
            }
        }
        
        public class Main {
            public static void main(String[] args) {
                Address address = new Address("Seoul", "Gangnam-gu");
                Person person1 = new Person("John", 30, address);
                Person person2 = person1.dependentCopy();
        
                // person1의 정보 출력
                System.out.println("Person 1:");
                person1.printInfo();
        
                // person2의 정보 출력
                System.out.println("\nPerson 2:");
                person2.printInfo();
            }
        }
        
        ```



## 📔프로토타입 패턴을 통한 해결책

---

- 프로토타입 패턴은 실제로 복제되는 객체들에 복제 프로세스를 위임
- 복제를 지원하는 모든 객체에 대한 공통 인터페이스를 선언함으로써 객체클래스에 결합하지 않고도 객체를 복사할 수 있다.
- 인터페이스에는 일반적으로 단일 `clone` 메서드만 포함됩니다.

> **`Prototype`** 인터페이스를 통해 프로토타입 객체를 참조하고, 복제 메서드를 호출하여 새로운 객체를 생성

클라이언트 코드에서는 구체적인 클래스를 알 필요 없이 프로토타입 객체를 다룰 수 있다.
>
> 
> 
> ## 📔적용사례

---

- [ ]  **프로토타입 패턴은 복사해야 하는 객체들의 구상 클래스들에 코드가 의존하면 안 될 때 사용**

⇒ 클라이언트 코드는 단순히 복제 메서드를 호출하여 새로운 객체를 얻을 뿐!!!
따라서 프로토타입 패턴을 사용하면 클라이언트 코드는 구체적인 클래스에 대한 지식    없이도 객체를 생성할 수 있다!!!!