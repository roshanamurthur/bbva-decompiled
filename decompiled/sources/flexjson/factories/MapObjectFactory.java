package flexjson.factories;

import flexjson.ObjectBinder;
import flexjson.ObjectFactory;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class MapObjectFactory implements ObjectFactory {
    public HashMap<Object, Object> createMapImpl() {
        return new HashMap<>();
    }

    @Override // flexjson.ObjectFactory
    public Object instantiate(ObjectBinder objectBinder, Object obj, Type type, Class cls) {
        if (type == null || !(type instanceof ParameterizedType)) {
            return objectBinder.bindIntoMap((Map) obj, createMapImpl(), null, null);
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type type2 = parameterizedType.getActualTypeArguments()[0];
        Type type3 = parameterizedType.getActualTypeArguments()[1];
        Map map = (Map) obj;
        HashMap<Object, Object> mapCreateMapImpl = createMapImpl();
        if (type2 == Object.class) {
            type2 = null;
        }
        return objectBinder.bindIntoMap(map, mapCreateMapImpl, type2, type3 != Object.class ? type3 : null);
    }
}
