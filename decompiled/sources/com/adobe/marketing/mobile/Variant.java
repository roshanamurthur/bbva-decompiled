package com.adobe.marketing.mobile;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
abstract class Variant implements Cloneable {
    public static final long MAX_SAFE_INTEGER = 9007199254740991L;
    public static final long MIN_SAFE_INTEGER = -9007199254740991L;

    /* JADX INFO: renamed from: com.adobe.marketing.mobile.Variant$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$adobe$marketing$mobile$VariantKind;

        static {
            int[] iArr = new int[VariantKind.values().length];
            $SwitchMap$com$adobe$marketing$mobile$VariantKind = iArr;
            try {
                iArr[VariantKind.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$VariantKind[VariantKind.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$VariantKind[VariantKind.INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$VariantKind[VariantKind.LONG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$VariantKind[VariantKind.DOUBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$VariantKind[VariantKind.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$VariantKind[VariantKind.MAP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$adobe$marketing$mobile$VariantKind[VariantKind.VECTOR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    @Deprecated
    public static final class ObjectVariant extends Variant {
        private final Object value;

        public ObjectVariant(Object obj) {
            this.value = obj;
        }

        @Override // com.adobe.marketing.mobile.Variant
        public VariantKind getKind() {
            return VariantKind.OBJECT;
        }

        @Override // com.adobe.marketing.mobile.Variant
        public <T> T getObject(Class<T> cls) throws VariantException {
            Object obj = this.value;
            if (obj == null) {
                return null;
            }
            if (cls.isInstance(obj)) {
                return (T) this.value;
            }
            throw new VariantException();
        }

        @Override // com.adobe.marketing.mobile.Variant
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public Variant mo4852clone() {
            return new ObjectVariant(this.value);
        }
    }

    public static Variant fromBoolean(boolean z10) {
        return BooleanVariant.from(z10);
    }

    public static Variant fromDouble(double d2) {
        return DoubleVariant.from(d2);
    }

    public static Variant fromInteger(int i10) {
        return IntegerVariant.from(i10);
    }

    public static Variant fromLong(long j10) {
        return LongVariant.from(j10);
    }

    public static Variant fromNull() {
        return NullVariant.from();
    }

    @Deprecated
    public static Variant fromObject(Object obj) {
        try {
            return PermissiveVariantSerializer.DEFAULT_INSTANCE.serialize(obj);
        } catch (VariantException unused) {
            return new ObjectVariant(obj);
        }
    }

    public static Variant fromString(String str) {
        return str == null ? fromNull() : StringVariant.from(str);
    }

    public static Variant fromStringList(List<String> list) {
        return fromTypedList(list, new StringVariantSerializer());
    }

    public static Variant fromStringMap(Map<String, String> map) {
        return fromTypedMap(map, new StringVariantSerializer());
    }

    public static <T> Variant fromTypedList(List<? extends T> list, VariantSerializer<T> variantSerializer) {
        if (variantSerializer != null) {
            return list == null ? fromNull() : new TypedListVariantSerializer(variantSerializer).serializeList(list);
        }
        throw new IllegalArgumentException();
    }

    public static <T> Variant fromTypedMap(Map<String, ? extends T> map, VariantSerializer<T> variantSerializer) {
        if (variantSerializer != null) {
            return new TypedMapVariantSerializer(variantSerializer).serializeMap(map);
        }
        throw new IllegalArgumentException();
    }

    public static <T> Variant fromTypedObject(T t10, VariantSerializer<T> variantSerializer) throws VariantException {
        if (variantSerializer == null) {
            throw new IllegalArgumentException();
        }
        if (t10 == null) {
            return fromNull();
        }
        try {
            Variant variantSerialize = variantSerializer.serialize(t10);
            if (variantSerialize != null) {
                return variantSerialize;
            }
            throw new VariantSerializationFailedException("cannot serialize to null");
        } catch (VariantSerializationFailedException e5) {
            throw e5;
        } catch (Exception e7) {
            throw new VariantSerializationFailedException(e7);
        }
    }

    public static Variant fromVariantList(List<Variant> list) {
        return list == null ? fromNull() : VectorVariant.from(list);
    }

    public static Variant fromVariantMap(Map<String, Variant> map) {
        return map == null ? fromNull() : MapVariant.from(map);
    }

    private Object getValue() {
        try {
            switch (AnonymousClass1.$SwitchMap$com$adobe$marketing$mobile$VariantKind[getKind().ordinal()]) {
                case 1:
                    return Boolean.valueOf(getBoolean());
                case 2:
                    return getString();
                case 3:
                    return Integer.valueOf(getInteger());
                case 4:
                    return Long.valueOf(getLong());
                case 5:
                    return Double.valueOf(getDouble());
                case 6:
                    return null;
                case 7:
                    return getVariantMap();
                case 8:
                    return getVariantList();
                default:
                    throw new IllegalStateException();
            }
        } catch (VariantException e5) {
            throw new IllegalStateException(e5);
        }
    }

    public static Variant getVariantFromMap(Map<String, Variant> map, String str) throws VariantException {
        if (map == null) {
            throw new IllegalArgumentException();
        }
        if (str == null) {
            throw new IllegalArgumentException();
        }
        Variant variant = map.get(str);
        if (variant != null) {
            return variant;
        }
        throw new VariantKeyNotFoundException("missing key ".concat(str));
    }

    public static Variant optVariantFromMap(Map<String, Variant> map, String str, Variant variant) {
        if (map == null) {
            throw new IllegalArgumentException();
        }
        if (str == null) {
            throw new IllegalArgumentException();
        }
        try {
            return getVariantFromMap(map, str);
        } catch (VariantException unused) {
            return variant;
        }
    }

    public static Map<String, Variant> toVariantMap(Map<?, ?> map) throws VariantException {
        return PermissiveVariantSerializer.DEFAULT_INSTANCE.serializeToVariantMap(map);
    }

    @Override // 
    /* JADX INFO: renamed from: clone */
    public abstract Variant mo4852clone();

    public double convertToDouble() throws VariantException {
        throw new VariantException("value is not convertible to a double");
    }

    public String convertToString() throws VariantException {
        throw new VariantException("value is not convertible to a string");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Variant)) {
            return false;
        }
        Variant variant = (Variant) obj;
        if (getKind() != variant.getKind()) {
            return false;
        }
        Object value = getValue();
        Object value2 = variant.getValue();
        if (value == value2) {
            return true;
        }
        if (value == null || value2 == null) {
            return false;
        }
        return value.equals(value2);
    }

    public boolean getBoolean() throws VariantException {
        throw new VariantKindException("value not gettable as a boolean");
    }

    public double getDouble() throws VariantException {
        throw new VariantKindException("value not gettable as a double");
    }

    public int getInteger() throws VariantException {
        throw new VariantKindException("value not gettable as an int");
    }

    public abstract VariantKind getKind();

    public long getLong() throws VariantException {
        throw new VariantKindException("value not gettable as a long");
    }

    @Deprecated
    public Object getObject() throws VariantException {
        return getObject(Object.class);
    }

    @Deprecated
    public <T> List<T> getObjectList(Class<T> cls) throws ClassCastException {
        try {
            List list = (List) getObject(List.class);
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            return arrayList;
        } catch (VariantException unused) {
            throw new ClassCastException();
        }
    }

    public String getString() throws VariantException {
        throw new VariantKindException("value not gettable as a string");
    }

    public final List<String> getStringList() throws VariantException {
        return getTypedList(new StringVariantSerializer());
    }

    public final Map<String, String> getStringMap() throws VariantException {
        return getTypedMap(new StringVariantSerializer());
    }

    public final <T> List<T> getTypedList(VariantSerializer<T> variantSerializer) throws VariantException {
        if (variantSerializer == null) {
            throw new IllegalArgumentException();
        }
        return new TypedListVariantSerializer(variantSerializer).deserializeList(getVariantList());
    }

    public final <T> Map<String, T> getTypedMap(VariantSerializer<T> variantSerializer) throws VariantException {
        if (variantSerializer == null) {
            throw new IllegalArgumentException();
        }
        return new TypedMapVariantSerializer(variantSerializer).deserializeMap(getVariantMap());
    }

    public final <T> T getTypedObject(VariantSerializer<T> variantSerializer) throws VariantException {
        if (variantSerializer == null) {
            throw new IllegalArgumentException();
        }
        try {
            return variantSerializer.deserialize(this);
        } catch (VariantSerializationFailedException e5) {
            throw e5;
        } catch (Exception e7) {
            throw new VariantSerializationFailedException(e7);
        }
    }

    public List<Variant> getVariantList() throws VariantException {
        throw new VariantKindException("value not gettable as a vector");
    }

    public Map<String, Variant> getVariantMap() throws VariantException {
        throw new VariantKindException("value not gettable as a map");
    }

    public final int hashCode() {
        Object value = getValue();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKind().hashCode());
        sb2.append(",");
        sb2.append(value == null ? "" : Integer.valueOf(value.hashCode()));
        return sb2.toString().hashCode();
    }

    public final boolean optBoolean(boolean z10) {
        try {
            return getBoolean();
        } catch (VariantException unused) {
            return z10;
        }
    }

    public final double optDouble(double d2) {
        try {
            return getDouble();
        } catch (VariantException unused) {
            return d2;
        }
    }

    public final int optInteger(int i10) {
        try {
            return getInteger();
        } catch (VariantException unused) {
            return i10;
        }
    }

    public final long optLong(long j10) {
        try {
            return getLong();
        } catch (VariantException unused) {
            return j10;
        }
    }

    public final String optString(String str) {
        try {
            return getString();
        } catch (VariantException unused) {
            return str;
        }
    }

    public final List<String> optStringList(List<String> list) {
        try {
            return getStringList();
        } catch (VariantException unused) {
            return list;
        }
    }

    public final Map<String, String> optStringMap(Map<String, String> map) {
        try {
            return getStringMap();
        } catch (VariantException unused) {
            return map;
        }
    }

    public final <T> List<T> optTypedList(List<T> list, VariantSerializer<T> variantSerializer) {
        try {
            return getTypedList(variantSerializer);
        } catch (VariantException unused) {
            return list;
        }
    }

    public final <T> Map<String, T> optTypedMap(Map<String, T> map, VariantSerializer<T> variantSerializer) {
        try {
            return getTypedMap(variantSerializer);
        } catch (VariantException unused) {
            return map;
        }
    }

    public final <T> T optTypedObject(T t10, VariantSerializer<T> variantSerializer) {
        try {
            return (T) getTypedObject(variantSerializer);
        } catch (VariantException unused) {
            return t10;
        }
    }

    public final List<Variant> optVariantList(List<Variant> list) {
        try {
            return getVariantList();
        } catch (VariantException unused) {
            return list;
        }
    }

    public final Map<String, Variant> optVariantMap(Map<String, Variant> map) {
        try {
            return getVariantMap();
        } catch (VariantException unused) {
            return map;
        }
    }

    @Deprecated
    public <T> T getObject(Class<T> cls) throws VariantException {
        T t10 = (T) PermissiveVariantSerializer.DEFAULT_INSTANCE.deserialize(this);
        if (t10 == null) {
            return null;
        }
        if (cls.isInstance(t10)) {
            return t10;
        }
        throw new VariantException();
    }

    public static Variant optVariantFromMap(Map<String, Variant> map, String str) {
        return optVariantFromMap(map, str, fromNull());
    }
}
