package pattern.structural.flyweight.usingFlyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * FlyweightFactory
 */
public class TreeModelFactory {

    // Flyweight Pool - TreeModel 객체들을 static Map으로 등록하여 캐싱
    private static final Map<String, TreeModel> cache = new HashMap<>();
    /* static final 이라 Thread-Safe 함
       -> JVM위에 하나의 인스턴스만 존재하게 되니까 여러 스레드에서
       이 변수를 접근할 때 값이 변경되지 않으므로 상호배타적 접근 가능 */

    
    // static factory method -> 객체생성없이 클래스로 호출가능
    public static TreeModel getInstance(String key) {
        // 만약 캐시 되어 있다면
        if(cache.containsKey(key)) {
            return cache.get(key); // 그대로 가져와 반환
        } else {
            // 캐시 되어있지 않으면 나무 모델 객체를 새로 생성하고 반환
            TreeModel model = new TreeModel(
                    key, // 타입
                    new Object(),
                    new Object()
            );

            Memory2.size +=  model.objSize;
            System.out.println("-- 나무 모델 객체 새로 생성 완료 --");

            // 캐시에 적재
            cache.put(key, model);

            return model;
        }
    }
}
