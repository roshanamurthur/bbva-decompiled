package flexjson.factories;

import flexjson.ObjectBinder;
import flexjson.ObjectFactory;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes7.dex */
public class SortedSetObjectFactory implements ObjectFactory {
    @Override // flexjson.ObjectFactory
    public Object instantiate(ObjectBinder objectBinder, Object obj, Type type, Class cls) {
        if (obj instanceof Collection) {
            return objectBinder.bindIntoCollection((Collection) obj, new TreeSet(), type);
        }
        TreeSet treeSet = new TreeSet();
        treeSet.add(objectBinder.bind(obj));
        return treeSet;
    }
}
