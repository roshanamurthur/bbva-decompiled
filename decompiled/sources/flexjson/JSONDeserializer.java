package flexjson;

import flexjson.factories.ClassLocatorObjectFactory;
import flexjson.factories.ExistingObjectFactory;
import flexjson.locators.StaticClassLocator;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class JSONDeserializer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f68483a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f68484b = new HashMap();

    public final ObjectBinder a() {
        ObjectBinder objectBinder = new ObjectBinder();
        HashMap map = this.f68483a;
        for (Class cls : map.keySet()) {
            objectBinder.use(cls, (ObjectFactory) map.get(cls));
        }
        HashMap map2 = this.f68484b;
        for (Path path : map2.keySet()) {
            objectBinder.use(path, (ObjectFactory) map2.get(path));
        }
        return objectBinder;
    }

    public T deserialize(String str) {
        return (T) a().bind(new JSONTokener(str).nextValue());
    }

    public T deserializeInto(String str, T t10) {
        return deserialize(str, new ExistingObjectFactory(t10));
    }

    public JSONDeserializer<T> use(String str, ClassLocator classLocator) {
        this.f68484b.put(Path.parse(str), new ClassLocatorObjectFactory(classLocator));
        return this;
    }

    public T deserializeInto(Reader reader, T t10) {
        return deserialize(reader, new ExistingObjectFactory(t10));
    }

    public JSONDeserializer<T> use(String str, Class cls) {
        return use(str, new StaticClassLocator(cls));
    }

    public T deserialize(Reader reader) {
        return (T) a().bind(new JSONTokener(reader).nextValue());
    }

    public T deserializeInto(String str, String str2, T t10) {
        return deserialize(str, str2, new ExistingObjectFactory(t10));
    }

    public JSONDeserializer<T> use(Class cls, ObjectFactory objectFactory) {
        HashMap map = this.f68483a;
        map.put(cls, objectFactory);
        if (cls == Boolean.class) {
            map.put(Boolean.TYPE, objectFactory);
        } else if (cls == Integer.class) {
            map.put(Integer.TYPE, objectFactory);
        } else if (cls == Short.class) {
            map.put(Short.TYPE, objectFactory);
        } else if (cls == Long.class) {
            map.put(Long.TYPE, objectFactory);
        } else if (cls == Byte.class) {
            map.put(Byte.TYPE, objectFactory);
        } else if (cls == Float.class) {
            map.put(Float.TYPE, objectFactory);
        } else if (cls == Double.class) {
            map.put(Double.TYPE, objectFactory);
        } else if (cls == Character.class) {
            map.put(Character.TYPE, objectFactory);
        }
        return this;
    }

    public T deserializeInto(Reader reader, String str, T t10) {
        return deserialize(reader, str, new ExistingObjectFactory(t10));
    }

    public T deserialize(String str, Class cls) {
        return (T) a().bind(new JSONTokener(str).nextValue(), (Type) cls);
    }

    public T deserialize(Reader reader, Class cls) {
        return (T) a().bind(new JSONTokener(reader).nextValue(), (Type) cls);
    }

    public T deserialize(String str, String str2, Class cls) {
        return (T) a().bind(((Map) new JSONTokener(str).nextValue()).get(str2), (Type) cls);
    }

    public T deserialize(Reader reader, String str, Class cls) {
        return (T) a().bind(((Map) new JSONTokener(reader).nextValue()).get(str), (Type) cls);
    }

    public JSONDeserializer<T> use(String str, ObjectFactory objectFactory) {
        this.f68484b.put(Path.parse(str), objectFactory);
        return this;
    }

    public JSONDeserializer<T> use(ObjectFactory objectFactory, String... strArr) {
        for (String str : strArr) {
            use(str, objectFactory);
        }
        return this;
    }

    public T deserialize(String str, ObjectFactory objectFactory) {
        use((String) null, objectFactory);
        return (T) a().bind(new JSONTokener(str).nextValue());
    }

    public T deserialize(Reader reader, ObjectFactory objectFactory) {
        use((String) null, objectFactory);
        return (T) a().bind(new JSONTokener(reader).nextValue());
    }

    public T deserialize(String str, String str2, ObjectFactory objectFactory) {
        use((String) null, objectFactory);
        return (T) a().bind(((Map) new JSONTokener(str).nextValue()).get(str2));
    }

    public T deserialize(Reader reader, String str, ObjectFactory objectFactory) {
        use((String) null, objectFactory);
        return (T) a().bind(((Map) new JSONTokener(reader).nextValue()).get(str));
    }
}
