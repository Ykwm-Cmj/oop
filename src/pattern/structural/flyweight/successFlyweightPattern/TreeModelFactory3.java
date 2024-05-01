package pattern.structural.flyweight.successFlyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * FlyweightFactory
 */
public class TreeModelFactory3 {

    private static final Map<String, TreeModel3> cache = new HashMap<>();


    public static TreeModel3 getInstance(String key) {
        // 만약 캐시 되어 있다면
        if(cache.containsKey(key)) {
            return cache.get(key); // 그대로 가져와 반환
        } else {
            // 캐시 되어있지 않으면 나무 모델 객체를 새로 생성하고 반환
            TreeModel3 model = new TreeModel3(
                    key, // 타입
                    new Object(),
                    new Object()
            );
            System.out.println("-- 나무 모델 객체 새로 생성 완료 --");

            // 캐시에 적재
            cache.put(key, model);

            return model;
        }
    }
}
