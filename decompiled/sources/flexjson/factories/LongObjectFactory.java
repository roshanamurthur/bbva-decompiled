package flexjson.factories;

import flexjson.ObjectBinder;
import flexjson.ObjectFactory;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes7.dex */
public class LongObjectFactory implements ObjectFactory {
    @Override // flexjson.ObjectFactory
    public Object instantiate(ObjectBinder objectBinder, Object obj, Type type, Class cls) {
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        try {
            return Long.valueOf(Long.parseLong(obj.toString()));
        } catch (Exception unused) {
            throw objectBinder.cannotConvertValueToTargetType(obj, Long.class);
        }
    }
}
