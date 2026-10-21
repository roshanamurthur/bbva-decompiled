package flexjson;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes7.dex */
public interface ObjectFactory {
    Object instantiate(ObjectBinder objectBinder, Object obj, Type type, Class cls);
}
