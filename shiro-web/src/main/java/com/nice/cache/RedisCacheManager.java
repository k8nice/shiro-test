package com.nice.cache;

import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheException;
import org.apache.shiro.cache.CacheManager;

import javax.annotation.Resource;

/**
 * The current class is   ...
 * This ide name is IntelliJ IDEA.
 * The current project name is shiro-test.
 * The current package name is com.nice.cache.
 *
 * @author nice
 * @version jdk1.8
 * @date 2019/12/10 19:04
 */
public class RedisCacheManager implements CacheManager {

    @Resource
    private RedisCache redisCache;

    @Override
    public <K, V> Cache<K, V> getCache(String s) throws CacheException {
        return redisCache;
    }
}
