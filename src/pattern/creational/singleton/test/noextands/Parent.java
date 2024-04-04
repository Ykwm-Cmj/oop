package pattern.creational.singleton.test.noextands;

public class Parent {
    private Parent(){;}

    /*
    지연 초기화 방법
    해당 객체를 사용할때에 초기화 함
    */
    private static Parent instance;

    public static Parent getInstance(){
        if(instance == null)
            instance = new Parent();
        return instance;
    }
//
//    /*
//    아래처럼 만들면 프로젝트를 올릴때 바로 초기화가 실행이 됨
//    그러면 사용하지 않는 객체가 생성되어 메모리를 잡고 있는 상황이 발생
//    */
//    private static Parent instance = new Parent();
//
//    public static Parent getInstance(){
//        return instance;
//    }
}
