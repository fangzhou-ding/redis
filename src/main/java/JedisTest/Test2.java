package JedisTest;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class Test2 {
    public static void main(String[] args) {
        JedisPool pool = new JedisPool();
        Jedis resource = pool.getResource();
        resource.set("1","aaa");
    }
}
