package flexjson.locators;

import flexjson.ClassLocator;
import flexjson.JSONException;
import flexjson.ObjectBinder;
import flexjson.Path;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class TypeLocator<T> implements ClassLocator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f68519b = new HashMap();

    public TypeLocator(String str) {
        this.f68518a = str;
    }

    public TypeLocator add(T t10, Class cls) {
        this.f68519b.put(t10, cls);
        return this;
    }

    @Override // flexjson.ClassLocator
    public Class locate(ObjectBinder objectBinder, Path path) throws ClassNotFoundException {
        Object source = objectBinder.getSource();
        boolean z10 = source instanceof Map;
        String str = this.f68518a;
        if (z10) {
            return (Class) this.f68519b.get(((Map) source).get(str));
        }
        throw new JSONException(String.format("%s: Don't know how to locate types for source %s using fieldname %s.  TypeLocator requires the source object be a java.util.Map in order to work.", objectBinder.getCurrentPath(), source.getClass(), str));
    }
}
