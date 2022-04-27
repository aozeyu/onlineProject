package net.xdclass.online.utils;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.concurrent.TimeUnit;

/**
 * @program: online
 * @description: 222
 * @packagename: net.xdclass.online.utils
 * @author: 姚泽宇
 * @date: 2022-04-27 17:24
 **/
public class BaseCache {
    private Cache<String,Object> tenMinuteCache = CacheBuilder.newBuilder().initialCapacity(10).maximumSize(100).concurrencyLevel(5).expireAfterWrite(600, TimeUnit.SECONDS).recordStats().build();

    public Cache<String, Object> getTenMinuteCache() {
        return tenMinuteCache;
    }

    public void setTenMinuteCache(Cache<String, Object> tenMinuteCache) {
        this.tenMinuteCache = tenMinuteCache;
    }
}
