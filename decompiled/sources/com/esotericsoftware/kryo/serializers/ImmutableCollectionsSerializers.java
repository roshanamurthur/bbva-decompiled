package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.util.Util;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class ImmutableCollectionsSerializers {

    public static class a extends CollectionSerializer<List<Object>> {
        public a() {
            setElementsCanBeNull(false);
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
        public final Collection create(Kryo kryo, Input input, Class cls, int i10) {
            return new ArrayList(i10);
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
        public final Collection createCopy(Kryo kryo, Collection collection) {
            return new ArrayList(((List) collection).size());
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer, com.esotericsoftware.kryo.Serializer
        public final /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends List<Object>>) cls);
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer, com.esotericsoftware.kryo.Serializer
        public final /* bridge */ /* synthetic */ Collection read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends List<Object>>) cls);
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
        public final List<Object> copy(Kryo kryo, List<Object> list) {
            List list2 = (List) super.copy(kryo, list);
            ArrayList arrayList = new ArrayList(list2.size());
            for (Object obj : list2) {
                Objects.requireNonNull(obj);
                arrayList.add(obj);
            }
            return Collections.unmodifiableList(arrayList);
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer, com.esotericsoftware.kryo.Serializer
        public final List<Object> read(Kryo kryo, Input input, Class<? extends List<Object>> cls) {
            List list = (List) super.read(kryo, input, (Class) cls);
            if (list == null) {
                return null;
            }
            Object[] array = list.toArray();
            ArrayList arrayList = new ArrayList(array.length);
            for (Object obj : array) {
                Objects.requireNonNull(obj);
                arrayList.add(obj);
            }
            return Collections.unmodifiableList(arrayList);
        }
    }

    public static class b extends MapSerializer<Map<Object, Object>> {
        public b() {
            setKeysCanBeNull(false);
            setValuesCanBeNull(false);
        }

        @Override // com.esotericsoftware.kryo.serializers.MapSerializer
        public final Map<Object, Object> create(Kryo kryo, Input input, Class<? extends Map<Object, Object>> cls, int i10) {
            return new HashMap();
        }

        @Override // com.esotericsoftware.kryo.serializers.MapSerializer
        public final Map<Object, Object> createCopy(Kryo kryo, Map<Object, Object> map) {
            return new HashMap();
        }

        @Override // com.esotericsoftware.kryo.serializers.MapSerializer, com.esotericsoftware.kryo.Serializer
        public final /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends Map<Object, Object>>) cls);
        }

        @Override // com.esotericsoftware.kryo.serializers.MapSerializer, com.esotericsoftware.kryo.Serializer
        public final Map<Object, Object> copy(Kryo kryo, Map<Object, Object> map) {
            Map mapCopy = super.copy(kryo, map);
            HashMap map2 = new HashMap(mapCopy.size());
            for (Map.Entry entry : mapCopy.entrySet()) {
                Object key = entry.getKey();
                Objects.requireNonNull(key);
                Object value = entry.getValue();
                Objects.requireNonNull(value);
                map2.put(key, value);
            }
            return Collections.unmodifiableMap(map2);
        }

        @Override // com.esotericsoftware.kryo.serializers.MapSerializer, com.esotericsoftware.kryo.Serializer
        public final Map<Object, Object> read(Kryo kryo, Input input, Class<? extends Map<Object, Object>> cls) {
            Map map = super.read(kryo, input, (Class<? extends Map>) cls);
            if (map == null) {
                return null;
            }
            HashMap map2 = new HashMap(map.size());
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Objects.requireNonNull(key);
                Object value = entry.getValue();
                Objects.requireNonNull(value);
                map2.put(key, value);
            }
            return Collections.unmodifiableMap(map2);
        }
    }

    public static class c extends CollectionSerializer<Set<Object>> {
        public c() {
            setElementsCanBeNull(false);
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
        public final Collection create(Kryo kryo, Input input, Class cls, int i10) {
            return new HashSet();
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
        public final Collection createCopy(Kryo kryo, Collection collection) {
            return new HashSet();
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer, com.esotericsoftware.kryo.Serializer
        public final /* bridge */ /* synthetic */ Object read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends Set<Object>>) cls);
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer, com.esotericsoftware.kryo.Serializer
        public final /* bridge */ /* synthetic */ Collection read(Kryo kryo, Input input, Class cls) {
            return read(kryo, input, (Class<? extends Set<Object>>) cls);
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer
        public final Set<Object> copy(Kryo kryo, Set<Object> set) {
            Set set2 = (Set) super.copy(kryo, set);
            HashSet hashSet = new HashSet(set2.size());
            for (Object obj : set2) {
                Objects.requireNonNull(obj);
                hashSet.add(obj);
            }
            return Collections.unmodifiableSet(hashSet);
        }

        @Override // com.esotericsoftware.kryo.serializers.CollectionSerializer, com.esotericsoftware.kryo.Serializer
        public final Set<Object> read(Kryo kryo, Input input, Class<? extends Set<Object>> cls) {
            Set set = (Set) super.read(kryo, input, (Class) cls);
            if (set == null) {
                return null;
            }
            Object[] array = set.toArray();
            HashSet hashSet = new HashSet(array.length);
            for (Object obj : array) {
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    throw new IllegalArgumentException(androidx.databinding.c.c("duplicate element: ", obj));
                }
            }
            return Collections.unmodifiableSet(hashSet);
        }
    }

    public static void addDefaultSerializers(Kryo kryo) {
        if (Util.isClassAvailable("java.util.ImmutableCollections")) {
            a aVar = new a();
            kryo.addDefaultSerializer(Collections.emptyList().getClass(), aVar);
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{1}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            kryo.addDefaultSerializer(Collections.unmodifiableList(arrayList).getClass(), aVar);
            Object[] objArr = {1, 2, 3, 4};
            ArrayList arrayList2 = new ArrayList(4);
            for (int i10 = 0; i10 < 4; i10++) {
                Object obj2 = objArr[i10];
                Objects.requireNonNull(obj2);
                arrayList2.add(obj2);
            }
            kryo.addDefaultSerializer(Collections.unmodifiableList(arrayList2).getClass(), aVar);
            Object[] objArr2 = {1, 2, 3, 4};
            ArrayList arrayList3 = new ArrayList(4);
            for (int i11 = 0; i11 < 4; i11++) {
                Object obj3 = objArr2[i11];
                Objects.requireNonNull(obj3);
                arrayList3.add(obj3);
            }
            kryo.addDefaultSerializer(Collections.unmodifiableList(arrayList3).subList(0, 2).getClass(), aVar);
            b bVar = new b();
            kryo.addDefaultSerializer(Collections.emptyMap().getClass(), bVar);
            Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(1, 2)};
            HashMap map = new HashMap(1);
            Map.Entry entry = entryArr[0];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException(androidx.databinding.c.c("duplicate key: ", key));
            }
            kryo.addDefaultSerializer(Collections.unmodifiableMap(map).getClass(), bVar);
            Map.Entry[] entryArr2 = {new AbstractMap.SimpleEntry(1, 2), new AbstractMap.SimpleEntry(3, 4)};
            HashMap map2 = new HashMap(2);
            for (int i12 = 0; i12 < 2; i12++) {
                Map.Entry entry2 = entryArr2[i12];
                Object key2 = entry2.getKey();
                Objects.requireNonNull(key2);
                Object value2 = entry2.getValue();
                Objects.requireNonNull(value2);
                if (map2.put(key2, value2) != null) {
                    throw new IllegalArgumentException(androidx.databinding.c.c("duplicate key: ", key2));
                }
            }
            kryo.addDefaultSerializer(Collections.unmodifiableMap(map2).getClass(), bVar);
            c cVar = new c();
            kryo.addDefaultSerializer(Collections.emptySet().getClass(), cVar);
            HashSet hashSet = new HashSet(1);
            Object obj4 = new Object[]{1}[0];
            Objects.requireNonNull(obj4);
            if (!hashSet.add(obj4)) {
                throw new IllegalArgumentException(androidx.databinding.c.c("duplicate element: ", obj4));
            }
            kryo.addDefaultSerializer(Collections.unmodifiableSet(hashSet).getClass(), cVar);
            Object[] objArr3 = {1, 2, 3, 4};
            HashSet hashSet2 = new HashSet(4);
            for (int i13 = 0; i13 < 4; i13++) {
                Object obj5 = objArr3[i13];
                Objects.requireNonNull(obj5);
                if (!hashSet2.add(obj5)) {
                    throw new IllegalArgumentException(androidx.databinding.c.c("duplicate element: ", obj5));
                }
            }
            kryo.addDefaultSerializer(Collections.unmodifiableSet(hashSet2).getClass(), cVar);
        }
    }
}
