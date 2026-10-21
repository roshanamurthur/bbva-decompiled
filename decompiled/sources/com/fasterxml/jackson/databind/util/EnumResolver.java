package com.fasterxml.jackson.databind.util;

import ci.a;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class EnumResolver implements Serializable {
    protected final Enum<?> _defaultValue;
    protected final Class<Enum<?>> _enumClass;
    protected final Enum<?>[] _enums;
    protected final HashMap<String, Enum<?>> _enumsById;

    public EnumResolver(Class<Enum<?>> cls, Enum<?>[] enumArr, HashMap<String, Enum<?>> map, Enum<?> r4) {
        this._enumClass = cls;
        this._enums = enumArr;
        this._enumsById = map;
        this._defaultValue = r4;
    }

    public static EnumResolver constructFor(Class<Enum<?>> cls, AnnotationIntrospector annotationIntrospector) {
        Enum<?>[] enumConstants = cls.getEnumConstants();
        if (enumConstants == null) {
            throw new IllegalArgumentException("No enum constants for class ".concat(cls.getName()));
        }
        String[] strArrFindEnumValues = annotationIntrospector.findEnumValues(cls, enumConstants, new String[enumConstants.length]);
        HashMap map = new HashMap();
        int length = enumConstants.length;
        for (int i10 = 0; i10 < length; i10++) {
            String strName = strArrFindEnumValues[i10];
            if (strName == null) {
                strName = enumConstants[i10].name();
            }
            map.put(strName, enumConstants[i10]);
        }
        return new EnumResolver(cls, enumConstants, map, annotationIntrospector.findDefaultEnumValue(cls));
    }

    public static EnumResolver constructUnsafe(Class<?> cls, AnnotationIntrospector annotationIntrospector) {
        return constructFor(cls, annotationIntrospector);
    }

    public static EnumResolver constructUnsafeUsingMethod(Class<?> cls, AnnotatedMember annotatedMember, AnnotationIntrospector annotationIntrospector) {
        return constructUsingMethod(cls, annotatedMember, annotationIntrospector);
    }

    public static EnumResolver constructUnsafeUsingToString(Class<?> cls, AnnotationIntrospector annotationIntrospector) {
        return constructUsingToString(cls, annotationIntrospector);
    }

    public static EnumResolver constructUsingMethod(Class<Enum<?>> cls, AnnotatedMember annotatedMember, AnnotationIntrospector annotationIntrospector) {
        Enum<?>[] enumConstants = cls.getEnumConstants();
        HashMap map = new HashMap();
        int length = enumConstants.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            Enum<?> r3 = enumConstants[length];
            try {
                Object value = annotatedMember.getValue(r3);
                if (value != null) {
                    map.put(value.toString(), r3);
                }
            } catch (Exception e5) {
                StringBuilder sb2 = new StringBuilder("Failed to access @JsonValue of Enum value ");
                sb2.append(r3);
                sb2.append(": ");
                throw new IllegalArgumentException(a.b(e5, sb2));
            }
        }
        return new EnumResolver(cls, enumConstants, map, annotationIntrospector != null ? annotationIntrospector.findDefaultEnumValue(cls) : null);
    }

    @Deprecated
    public static EnumResolver constructUsingToString(Class<Enum<?>> cls) {
        return constructUsingToString(cls, null);
    }

    public CompactStringObjectMap constructLookup() {
        return CompactStringObjectMap.construct(this._enumsById);
    }

    public Enum<?> findEnum(String str) {
        return this._enumsById.get(str);
    }

    public Enum<?> getDefaultValue() {
        return this._defaultValue;
    }

    public Enum<?> getEnum(int i10) {
        if (i10 < 0) {
            return null;
        }
        Enum<?>[] enumArr = this._enums;
        if (i10 >= enumArr.length) {
            return null;
        }
        return enumArr[i10];
    }

    public Class<Enum<?>> getEnumClass() {
        return this._enumClass;
    }

    public Collection<String> getEnumIds() {
        return this._enumsById.keySet();
    }

    public List<Enum<?>> getEnums() {
        ArrayList arrayList = new ArrayList(this._enums.length);
        for (Enum<?> r1 : this._enums) {
            arrayList.add(r1);
        }
        return arrayList;
    }

    public Enum<?>[] getRawEnums() {
        return this._enums;
    }

    public int lastValidIndex() {
        return this._enums.length - 1;
    }

    public static EnumResolver constructUsingToString(Class<Enum<?>> cls, AnnotationIntrospector annotationIntrospector) {
        Enum<?>[] enumConstants = cls.getEnumConstants();
        HashMap map = new HashMap();
        int length = enumConstants.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            Enum<?> r3 = enumConstants[length];
            map.put(r3.toString(), r3);
        }
        return new EnumResolver(cls, enumConstants, map, annotationIntrospector == null ? null : annotationIntrospector.findDefaultEnumValue(cls));
    }
}
