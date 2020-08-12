package JedisTest;

import redis.clients.jedis.Jedis;

public class Test1 {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.83.102", 6379);
        String ping = jedis.ping();
        System.out.println(ping);


    }
}
