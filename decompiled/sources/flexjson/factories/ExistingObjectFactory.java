package flexjson.factories;

import flexjson.ObjectBinder;
import flexjson.ObjectFactory;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ExistingObjectFactory implements ObjectFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f68516a;

    public ExistingObjectFactory(Object obj) {
        this.f68516a = obj;
    }

    @Override // flexjson.ObjectFactory
    public Object instantiate(ObjectBinder objectBinder, Object obj, Type type, Class cls) {
        Object obj2 = this.f68516a;
        if (obj2 instanceof Map) {
            return objectBinder.bindIntoMap((Map) obj, (Map) obj2, null, null);
        }
        return obj2 instanceof Collection ? objectBinder.bindIntoCollection((Collection) obj, (Collection) obj2, type) : objectBinder.bindIntoObject((Map) obj, obj2, type);
    }
}
