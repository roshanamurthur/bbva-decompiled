package flexjson.factories;

import flexjson.JsonNumber;
import flexjson.ObjectBinder;
import flexjson.ObjectFactory;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes7.dex */
public class JsonNumberObjectFactory implements ObjectFactory {
    @Override // flexjson.ObjectFactory
    public Object instantiate(ObjectBinder objectBinder, Object obj, Type type, Class cls) {
        JsonNumber jsonNumber = (JsonNumber) obj;
        return jsonNumber.isLong() ? Long.valueOf(jsonNumber.longValue()) : Double.valueOf(jsonNumber.doubleValue());
    }
}
