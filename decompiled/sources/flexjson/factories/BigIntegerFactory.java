package flexjson.factories;

import flexjson.JsonNumber;
import flexjson.ObjectBinder;
import flexjson.ObjectFactory;
import java.lang.reflect.Type;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes7.dex */
public class BigIntegerFactory implements ObjectFactory {
    @Override // flexjson.ObjectFactory
    public Object instantiate(ObjectBinder objectBinder, Object obj, Type type, Class cls) {
        return obj instanceof JsonNumber ? ((JsonNumber) obj).toBigInteger() : new BigInteger(obj.toString());
    }
}
