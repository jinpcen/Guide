package guide.config;


import guide.bean.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;

import java.net.UnknownHostException;

/**
 * 重写RedisTemplate RedisCacheManager
 */
@Configuration
public class MyRedisConfig {

    @Bean
    public RedisTemplate<Object, Student> studentredisTemplate(RedisConnectionFactory redisConnectionFactory) throws UnknownHostException {
        RedisTemplate<Object, Student> template = new RedisTemplate();
        template.setConnectionFactory(redisConnectionFactory);
        Jackson2JsonRedisSerializer<Student> employeeGenericJackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<Student>(Student.class);
        template.setDefaultSerializer(employeeGenericJackson2JsonRedisSerializer);
        return template;
    }

    @Bean
    public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) throws UnknownHostException {
        RedisTemplate<Object, Object> template = new RedisTemplate();
        template.setConnectionFactory(redisConnectionFactory);
        Jackson2JsonRedisSerializer<Object> employeeGenericJackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<Object>(Object.class);
        template.setDefaultSerializer(employeeGenericJackson2JsonRedisSerializer);
        return template;
    }

//    @Bean
//    public RedisTemplate<Object, Department> DeptredisTemplate(RedisConnectionFactory redisConnectionFactory) throws UnknownHostException {
//        RedisTemplate<Object, Department> template = new RedisTemplate();
//        template.setConnectionFactory(redisConnectionFactory);
//        Jackson2JsonRedisSerializer<Department> employeeGenericJackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<Department>(Department.class);
//        template.setDefaultSerializer(employeeGenericJackson2JsonRedisSerializer);
//        return template;
//    }

    @Primary//默认的
    @Bean
    public RedisCacheManager CacheManager(RedisTemplate<Object, Object> redisTemplate){
        RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);
        //key多个前缀
        return cacheManager;
    }

    //自己定义缓存规则
    @Bean
    public RedisCacheManager studentCacheManager(RedisTemplate<Object, Student> studentredisTemplate){
        RedisCacheManager cacheManager = new RedisCacheManager(studentredisTemplate);
        //key多个前缀
        cacheManager.setUsePrefix(true);
        cacheManager.setUsePrefix(true);
        return cacheManager;
    }

//    @Bean
//    public RedisCacheManager DeptloyeeCacheManager(RedisTemplate<Object, Department> DeptredisTemplate){
//        RedisCacheManager cacheManager = new RedisCacheManager(DeptredisTemplate);
//        //key多个前缀
//        cacheManager.setUsePrefix(true);
//        return cacheManagereManager;
//    }
}
