package flexjson.factories;

import flexjson.ObjectBinder;
import flexjson.ObjectFactory;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes7.dex */
public class ByteObjectFactory implements ObjectFactory {
    @Override // flexjson.ObjectFactory
    public Object instantiate(ObjectBinder objectBinder, Object obj, Type type, Class cls) {
        if (obj instanceof Number) {
            return Byte.valueOf(((Number) obj).byteValue());
        }
        throw objectBinder.cannotConvertValueToTargetType(obj, Byte.class);
    }
}
