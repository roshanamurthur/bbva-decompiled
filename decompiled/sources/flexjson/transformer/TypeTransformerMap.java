package flexjson.transformer;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class TypeTransformerMap extends ConcurrentHashMap<Class, Transformer> {
    protected boolean locked;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final TypeTransformerMap f68525p0;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f68526a;
    }

    public TypeTransformerMap() {
    }

    public final Transformer a(Class cls, Class cls2, a aVar) {
        if (cls == null) {
            return null;
        }
        if (containsKey(cls)) {
            if (cls != cls2) {
                aVar.f68526a = false;
            }
            return get(cls);
        }
        if (cls.isArray()) {
            aVar.f68526a = false;
            return get(Arrays.class);
        }
        for (Class<?> cls3 : cls.getInterfaces()) {
            Transformer transformerA = a(cls3, cls2, aVar);
            if (transformerA != null) {
                return transformerA;
            }
        }
        return a(cls.getSuperclass(), cls2, aVar);
    }

    public Transformer getTransformer(Object obj) {
        TypeTransformerMap typeTransformerMap;
        a aVar = new a();
        Class<?> cls = obj == null ? Void.TYPE : obj.getClass();
        Transformer transformerA = a(cls, cls, aVar);
        if (transformerA == null && (typeTransformerMap = this.f68525p0) != null && (transformerA = typeTransformerMap.getTransformer(obj)) != null) {
            putTransformer(obj == null ? Void.TYPE : obj.getClass(), transformerA);
        }
        if (!aVar.f68526a) {
            putTransformer(cls, transformerA);
        }
        return transformerA;
    }

    public Transformer putTransformer(Class cls, Transformer transformer) {
        if (!this.locked) {
            put(cls, transformer);
        }
        return transformer;
    }

    public TypeTransformerMap(TypeTransformerMap typeTransformerMap) {
        this.f68525p0 = typeTransformerMap;
    }
}
