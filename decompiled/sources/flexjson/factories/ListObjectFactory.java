package flexjson.factories;

import flexjson.ObjectBinder;
import flexjson.ObjectFactory;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
public class ListObjectFactory implements ObjectFactory {
    @Override // flexjson.ObjectFactory
    public Object instantiate(ObjectBinder objectBinder, Object obj, Type type, Class cls) {
        if (obj instanceof Collection) {
            return objectBinder.bindIntoCollection((Collection) obj, new ArrayList(), type);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(objectBinder.bind(obj));
        return arrayList;
    }
}
