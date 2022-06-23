package hello.upload.domain;

import java.util.HashMap;
import java.util.Map;

public class ItemRepository {

    private final Map<Long, Item> store = new HashMap<>();
    private long sequence;

    public Item save(Item item) {
        item.setId(++sequence);
        store.put(item.getId(), item);
        return item;
    }
    public Item findById(Long id) {
        return store.get(id);
    }
}
