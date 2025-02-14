package team.jit.recruitment;

import java.util.HashMap;
import java.util.Map;

public class CatRepository {

    private final Map<Long, Cat> cats;


    public CatRepository() {
        this.cats = new HashMap<>();
        cats.put(1L, new Cat(1L, "Mruczek"));
        cats.put(2L, new Cat(2L, "Bonifacy"));
        cats.put(3L, new Cat(3L, "Filemon"));
    }
}
