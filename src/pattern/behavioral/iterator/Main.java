package pattern.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        // 집합체 생성
        ConcreteAggregate aggregate = new ConcreteAggregate(5);
        aggregate.add(1);
        aggregate.add(2);
        aggregate.add(3);
        aggregate.add(4);
        aggregate.add(5);

        // 집합체에서 이터레이터 객체 반환
        Iterator iter = aggregate.iterator();

        // 이터레이터 통해 순회
        while(iter.hasNext()) {
            System.out.printf("%s → ", iter.next());
        }
    }

}
