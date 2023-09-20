import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        /* 初始化哈希表 */
        Map<Integer, String> map = new HashMap<>();

        /* 添加操作 */
// 在哈希表中添加键值对 (key, value)
        map.put(12836, "小哈");
        map.put(15937, "小啰");
        map.put(16750, "小算");
        map.put(13276, "小法");
        map.put(10583, "小鸭");

        /* 查询操作 */
// 向哈希表输入键 key ，得到值 value
        String name = map.get(15937);

        System.out.println(name);

        /* 删除操作 */
// 在哈希表中删除键值对 (key, value)
        map.remove(10583);
    }
}
