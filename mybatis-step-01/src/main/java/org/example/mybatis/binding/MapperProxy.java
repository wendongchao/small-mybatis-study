package org.example.mybatis.binding;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 映射代理类
 * @auther wendongchao
 * @date 2023/8/6 16:32
 **/
public class MapperProxy<T> implements InvocationHandler, Serializable {

    private static final long serialVersionUID = -8844672752693014924L;

    private final Map<String, String> sqlSession = new HashMap<>();
    private final Class<T> mapperInterface;

    public MapperProxy(Class<T> mapperInterface) {
        this.mapperInterface = mapperInterface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
