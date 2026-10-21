package com.fasterxml.jackson.databind.deser.impl;

import androidx.camera.core.impl.utils.b;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public abstract class JavaUtilCollectionsDeserializers {
    public static final int TYPE_AS_LIST = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f43228a = Arrays.asList(null, null).getClass();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?> f43229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class<?> f43230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Class<?> f43231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class<?> f43232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class<?> f43233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Class<?> f43234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Class<?> f43235h;

    public static class a implements Converter<Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JavaType f43236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f43237b;

        public a(int i10, JavaType javaType) {
            this.f43236a = javaType;
            this.f43237b = i10;
        }

        public static void a(int i10) {
            if (i10 != 1) {
                throw new IllegalArgumentException(b.a("Can not deserialize Singleton container from ", i10, " entries"));
            }
        }

        @Override // com.fasterxml.jackson.databind.util.Converter
        public final Object convert(Object obj) {
            if (obj == null) {
                return null;
            }
            switch (this.f43237b) {
                case 1:
                    Set set = (Set) obj;
                    a(set.size());
                    return Collections.singleton(set.iterator().next());
                case 2:
                    List list = (List) obj;
                    a(list.size());
                    return Collections.singletonList(list.get(0));
                case 3:
                    Map map = (Map) obj;
                    a(map.size());
                    Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                    return Collections.singletonMap(entry.getKey(), entry.getValue());
                case 4:
                    return Collections.unmodifiableSet((Set) obj);
                case 5:
                    return Collections.unmodifiableList((List) obj);
                case 6:
                    return Collections.unmodifiableMap((Map) obj);
                default:
                    return obj;
            }
        }

        @Override // com.fasterxml.jackson.databind.util.Converter
        public final JavaType getInputType(TypeFactory typeFactory) {
            return this.f43236a;
        }

        @Override // com.fasterxml.jackson.databind.util.Converter
        public final JavaType getOutputType(TypeFactory typeFactory) {
            return this.f43236a;
        }
    }

    static {
        Boolean bool = Boolean.TRUE;
        Set setSingleton = Collections.singleton(bool);
        f43229b = setSingleton.getClass();
        f43232e = Collections.unmodifiableSet(setSingleton).getClass();
        List listSingletonList = Collections.singletonList(bool);
        f43230c = listSingletonList.getClass();
        f43233f = Collections.unmodifiableList(listSingletonList).getClass();
        f43234g = Collections.unmodifiableList(new LinkedList()).getClass();
        Map mapSingletonMap = Collections.singletonMap("a", "b");
        f43231d = mapSingletonMap.getClass();
        f43235h = Collections.unmodifiableMap(mapSingletonMap).getClass();
    }

    public static JsonDeserializer<?> findForCollection(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        a aVar;
        if (javaType.hasRawClass(f43228a)) {
            aVar = new a(7, javaType.findSuperType(List.class));
        } else if (javaType.hasRawClass(f43230c)) {
            aVar = new a(2, javaType.findSuperType(List.class));
        } else if (javaType.hasRawClass(f43229b)) {
            aVar = new a(1, javaType.findSuperType(Set.class));
        } else if (javaType.hasRawClass(f43233f) || javaType.hasRawClass(f43234g)) {
            aVar = new a(5, javaType.findSuperType(List.class));
        } else {
            if (!javaType.hasRawClass(f43232e)) {
                return null;
            }
            aVar = new a(4, javaType.findSuperType(Set.class));
        }
        return new StdDelegatingDeserializer(aVar);
    }

    public static JsonDeserializer<?> findForMap(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        a aVar;
        if (javaType.hasRawClass(f43231d)) {
            aVar = new a(3, javaType.findSuperType(Map.class));
        } else {
            if (!javaType.hasRawClass(f43235h)) {
                return null;
            }
            aVar = new a(6, javaType.findSuperType(Map.class));
        }
        return new StdDelegatingDeserializer(aVar);
    }
}
