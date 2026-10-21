package com.fasterxml.jackson.databind.deser.impl;

import androidx.camera.camera2.internal.h0;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class BeanPropertyMap implements Iterable<SettableBeanProperty>, Serializable {
    protected final boolean _caseInsensitive;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f43207p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f43208q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f43209r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Object[] f43210s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final SettableBeanProperty[] f43211t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Map<String, List<PropertyName>> f43212u0;
    public final Map<String, String> v0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.HashMap] */
    public BeanPropertyMap(boolean z10, Collection<SettableBeanProperty> collection, Map<String, List<PropertyName>> map) {
        ?? EmptyMap;
        this._caseInsensitive = z10;
        this.f43211t0 = (SettableBeanProperty[]) collection.toArray(new SettableBeanProperty[collection.size()]);
        this.f43212u0 = map;
        if (map == null || map.isEmpty()) {
            EmptyMap = Collections.emptyMap();
        } else {
            EmptyMap = new HashMap();
            for (Map.Entry<String, List<PropertyName>> entry : map.entrySet()) {
                String key = entry.getKey();
                key = this._caseInsensitive ? key.toLowerCase() : key;
                Iterator<PropertyName> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    String simpleName = it.next().getSimpleName();
                    if (this._caseInsensitive) {
                        simpleName = simpleName.toLowerCase();
                    }
                    EmptyMap.put(simpleName, key);
                }
            }
        }
        this.v0 = EmptyMap;
        init(collection);
    }

    public static BeanPropertyMap construct(Collection<SettableBeanProperty> collection, boolean z10, Map<String, List<PropertyName>> map) {
        return new BeanPropertyMap(z10, collection, map);
    }

    public SettableBeanProperty _rename(SettableBeanProperty settableBeanProperty, NameTransformer nameTransformer) {
        JsonDeserializer<Object> jsonDeserializerUnwrappingDeserializer;
        if (settableBeanProperty == null) {
            return settableBeanProperty;
        }
        SettableBeanProperty settableBeanPropertyWithSimpleName = settableBeanProperty.withSimpleName(nameTransformer.transform(settableBeanProperty.getName()));
        JsonDeserializer<Object> valueDeserializer = settableBeanPropertyWithSimpleName.getValueDeserializer();
        return (valueDeserializer == null || (jsonDeserializerUnwrappingDeserializer = valueDeserializer.unwrappingDeserializer(nameTransformer)) == valueDeserializer) ? settableBeanPropertyWithSimpleName : settableBeanPropertyWithSimpleName.withValueDeserializer(jsonDeserializerUnwrappingDeserializer);
    }

    public final int a(SettableBeanProperty settableBeanProperty) {
        SettableBeanProperty[] settableBeanPropertyArr = this.f43211t0;
        int length = settableBeanPropertyArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (settableBeanPropertyArr[i10] == settableBeanProperty) {
                return i10;
            }
        }
        throw new IllegalStateException("Illegal state: property '" + settableBeanProperty.getName() + "' missing from _propsInOrder");
    }

    public BeanPropertyMap assignIndexes() {
        int length = this.f43210s0.length;
        int i10 = 0;
        for (int i11 = 1; i11 < length; i11 += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this.f43210s0[i11];
            if (settableBeanProperty != null) {
                settableBeanProperty.assignIndex(i10);
                i10++;
            }
        }
        return this;
    }

    public final SettableBeanProperty b(String str) {
        if (str == null) {
            return null;
        }
        int iHashCode = str.hashCode() & this.f43207p0;
        int i10 = iHashCode << 1;
        Object obj = this.f43210s0[i10];
        if (str.equals(obj)) {
            return (SettableBeanProperty) this.f43210s0[i10 + 1];
        }
        if (obj == null) {
            return null;
        }
        int i11 = this.f43207p0 + 1;
        int i12 = ((iHashCode >> 1) + i11) << 1;
        Object obj2 = this.f43210s0[i12];
        if (str.equals(obj2)) {
            return (SettableBeanProperty) this.f43210s0[i12 + 1];
        }
        if (obj2 == null) {
            return null;
        }
        int i13 = (i11 + (i11 >> 1)) << 1;
        int i14 = this.f43209r0 + i13;
        while (i13 < i14) {
            Object obj3 = this.f43210s0[i13];
            if (obj3 == str || str.equals(obj3)) {
                return (SettableBeanProperty) this.f43210s0[i13 + 1];
            }
            i13 += 2;
        }
        return null;
    }

    public SettableBeanProperty find(int i10) {
        int length = this.f43210s0.length;
        for (int i11 = 1; i11 < length; i11 += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this.f43210s0[i11];
            if (settableBeanProperty != null && i10 == settableBeanProperty.getPropertyIndex()) {
                return settableBeanProperty;
            }
        }
        return null;
    }

    public boolean findDeserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        SettableBeanProperty settableBeanPropertyFind = find(str);
        if (settableBeanPropertyFind == null) {
            return false;
        }
        try {
            settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, obj);
            return true;
        } catch (Exception e5) {
            wrapAndThrow(e5, obj, str, deserializationContext);
            return true;
        }
    }

    public SettableBeanProperty[] getPropertiesInInsertionOrder() {
        return this.f43211t0;
    }

    public final String getPropertyName(SettableBeanProperty settableBeanProperty) {
        boolean z10 = this._caseInsensitive;
        String name = settableBeanProperty.getName();
        return z10 ? name.toLowerCase() : name;
    }

    public boolean hasAliases() {
        return !this.f43212u0.isEmpty();
    }

    public void init(Collection<SettableBeanProperty> collection) {
        int i10;
        int size = collection.size();
        this.f43208q0 = size;
        if (size <= 5) {
            i10 = 8;
        } else if (size <= 12) {
            i10 = 16;
        } else {
            int i11 = 32;
            while (i11 < size + (size >> 2)) {
                i11 += i11;
            }
            i10 = i11;
        }
        this.f43207p0 = i10 - 1;
        int i12 = (i10 >> 1) + i10;
        Object[] objArrCopyOf = new Object[i12 * 2];
        int i13 = 0;
        for (SettableBeanProperty settableBeanProperty : collection) {
            if (settableBeanProperty != null) {
                String propertyName = getPropertyName(settableBeanProperty);
                int iHashCode = propertyName.hashCode() & this.f43207p0;
                int i14 = iHashCode << 1;
                if (objArrCopyOf[i14] != null) {
                    i14 = ((iHashCode >> 1) + i10) << 1;
                    if (objArrCopyOf[i14] != null) {
                        i14 = (i12 << 1) + i13;
                        i13 += 2;
                        if (i14 >= objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length + 4);
                        }
                    }
                }
                objArrCopyOf[i14] = propertyName;
                objArrCopyOf[i14 + 1] = settableBeanProperty;
            }
        }
        this.f43210s0 = objArrCopyOf;
        this.f43209r0 = i13;
    }

    public boolean isCaseInsensitive() {
        return this._caseInsensitive;
    }

    @Override // java.lang.Iterable
    public Iterator<SettableBeanProperty> iterator() {
        ArrayList arrayList = new ArrayList(this.f43208q0);
        int length = this.f43210s0.length;
        for (int i10 = 1; i10 < length; i10 += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this.f43210s0[i10];
            if (settableBeanProperty != null) {
                arrayList.add(settableBeanProperty);
            }
        }
        return arrayList.iterator();
    }

    public void remove(SettableBeanProperty settableBeanProperty) {
        ArrayList arrayList = new ArrayList(this.f43208q0);
        String propertyName = getPropertyName(settableBeanProperty);
        int length = this.f43210s0.length;
        boolean zEquals = false;
        for (int i10 = 1; i10 < length; i10 += 2) {
            Object[] objArr = this.f43210s0;
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) objArr[i10];
            if (settableBeanProperty2 != null) {
                if (zEquals || !(zEquals = propertyName.equals(objArr[i10 - 1]))) {
                    arrayList.add(settableBeanProperty2);
                } else {
                    this.f43211t0[a(settableBeanProperty2)] = null;
                }
            }
        }
        if (zEquals) {
            init(arrayList);
            return;
        }
        throw new NoSuchElementException("No entry '" + settableBeanProperty.getName() + "' found, can't remove");
    }

    public BeanPropertyMap renameAll(NameTransformer nameTransformer) {
        if (nameTransformer == null || nameTransformer == NameTransformer.NOP) {
            return this;
        }
        SettableBeanProperty[] settableBeanPropertyArr = this.f43211t0;
        ArrayList arrayList = new ArrayList(settableBeanPropertyArr.length);
        for (SettableBeanProperty settableBeanProperty : settableBeanPropertyArr) {
            if (settableBeanProperty == null) {
                arrayList.add(settableBeanProperty);
            } else {
                arrayList.add(_rename(settableBeanProperty, nameTransformer));
            }
        }
        return new BeanPropertyMap(this._caseInsensitive, arrayList, this.f43212u0);
    }

    @Deprecated
    public void replace(SettableBeanProperty settableBeanProperty) {
        int i10;
        String propertyName = getPropertyName(settableBeanProperty);
        int iHashCode = propertyName.hashCode() & this.f43207p0;
        int i11 = iHashCode << 1;
        if (!propertyName.equals(this.f43210s0[i11])) {
            int i12 = this.f43207p0 + 1;
            int i13 = ((iHashCode >> 1) + i12) << 1;
            if (!propertyName.equals(this.f43210s0[i13])) {
                i13 = (i12 + (i12 >> 1)) << 1;
                int i14 = this.f43209r0 + i13;
                while (true) {
                    if (i13 >= i14) {
                        i10 = -1;
                        break;
                    } else {
                        if (propertyName.equals(this.f43210s0[i13])) {
                            i10 = i13 + 1;
                            break;
                        }
                        i13 += 2;
                    }
                }
            } else {
                i10 = i13 + 1;
                break;
            }
        } else {
            i10 = i11 + 1;
        }
        if (i10 < 0) {
            throw new NoSuchElementException(h0.b("No entry '", propertyName, "' found, can't replace"));
        }
        Object[] objArr = this.f43210s0;
        SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) objArr[i10];
        objArr[i10] = settableBeanProperty;
        this.f43211t0[a(settableBeanProperty2)] = settableBeanProperty;
    }

    public int size() {
        return this.f43208q0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Properties=[");
        int i10 = 0;
        for (SettableBeanProperty settableBeanProperty : this) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(settableBeanProperty.getName());
            sb2.append(RootService.OPEN_BRACKET);
            sb2.append(settableBeanProperty.getType());
            sb2.append(RootService.CLOSE_BRACKET);
            i10 = i11;
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        Map<String, List<PropertyName>> map = this.f43212u0;
        if (!map.isEmpty()) {
            sb2.append("(aliases: ");
            sb2.append(map);
            sb2.append(")");
        }
        return sb2.toString();
    }

    public BeanPropertyMap withCaseInsensitivity(boolean z10) {
        return this._caseInsensitive == z10 ? this : new BeanPropertyMap(this, z10);
    }

    public BeanPropertyMap withProperty(SettableBeanProperty settableBeanProperty) {
        String propertyName = getPropertyName(settableBeanProperty);
        int length = this.f43210s0.length;
        for (int i10 = 1; i10 < length; i10 += 2) {
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) this.f43210s0[i10];
            if (settableBeanProperty2 != null && settableBeanProperty2.getName().equals(propertyName)) {
                return new BeanPropertyMap(this, settableBeanProperty, i10, a(settableBeanProperty2));
            }
        }
        return new BeanPropertyMap(this, settableBeanProperty, propertyName, propertyName.hashCode() & this.f43207p0);
    }

    public BeanPropertyMap withoutProperties(Collection<String> collection) {
        if (collection.isEmpty()) {
            return this;
        }
        SettableBeanProperty[] settableBeanPropertyArr = this.f43211t0;
        ArrayList arrayList = new ArrayList(settableBeanPropertyArr.length);
        for (SettableBeanProperty settableBeanProperty : settableBeanPropertyArr) {
            if (settableBeanProperty != null && !collection.contains(settableBeanProperty.getName())) {
                arrayList.add(settableBeanProperty);
            }
        }
        return new BeanPropertyMap(this._caseInsensitive, arrayList, this.f43212u0);
    }

    public void wrapAndThrow(Throwable th2, Object obj, String str, DeserializationContext deserializationContext) throws IOException {
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        ClassUtil.throwIfError(th2);
        boolean z10 = deserializationContext == null || deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS);
        if (th2 instanceof IOException) {
            if (!z10 || !(th2 instanceof JsonProcessingException)) {
                throw ((IOException) th2);
            }
        } else if (!z10) {
            ClassUtil.throwIfRTE(th2);
        }
        throw JsonMappingException.wrapWithPath(th2, obj, str);
    }

    @Deprecated
    public static BeanPropertyMap construct(Collection<SettableBeanProperty> collection, boolean z10) {
        return construct(collection, z10, Collections.emptyMap());
    }

    public SettableBeanProperty find(String str) {
        if (str != null) {
            if (this._caseInsensitive) {
                str = str.toLowerCase();
            }
            int iHashCode = str.hashCode() & this.f43207p0;
            int i10 = iHashCode << 1;
            Object obj = this.f43210s0[i10];
            if (obj != str && !str.equals(obj)) {
                Map<String, String> map = this.v0;
                if (obj == null) {
                    return b(map.get(str));
                }
                int i11 = this.f43207p0 + 1;
                int i12 = ((iHashCode >> 1) + i11) << 1;
                Object obj2 = this.f43210s0[i12];
                if (str.equals(obj2)) {
                    return (SettableBeanProperty) this.f43210s0[i12 + 1];
                }
                if (obj2 != null) {
                    int i13 = (i11 + (i11 >> 1)) << 1;
                    int i14 = this.f43209r0 + i13;
                    while (i13 < i14) {
                        Object obj3 = this.f43210s0[i13];
                        if (obj3 == str || str.equals(obj3)) {
                            return (SettableBeanProperty) this.f43210s0[i13 + 1];
                        }
                        i13 += 2;
                    }
                }
                return b(map.get(str));
            }
            return (SettableBeanProperty) this.f43210s0[i10 + 1];
        }
        throw new IllegalArgumentException("Cannot pass null property name");
    }

    public BeanPropertyMap(BeanPropertyMap beanPropertyMap, SettableBeanProperty settableBeanProperty, int i10, int i11) {
        this._caseInsensitive = beanPropertyMap._caseInsensitive;
        this.f43207p0 = beanPropertyMap.f43207p0;
        this.f43208q0 = beanPropertyMap.f43208q0;
        this.f43209r0 = beanPropertyMap.f43209r0;
        this.f43212u0 = beanPropertyMap.f43212u0;
        this.v0 = beanPropertyMap.v0;
        Object[] objArr = beanPropertyMap.f43210s0;
        this.f43210s0 = Arrays.copyOf(objArr, objArr.length);
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap.f43211t0;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, settableBeanPropertyArr.length);
        this.f43211t0 = settableBeanPropertyArr2;
        this.f43210s0[i10] = settableBeanProperty;
        settableBeanPropertyArr2[i11] = settableBeanProperty;
    }

    public void replace(SettableBeanProperty settableBeanProperty, SettableBeanProperty settableBeanProperty2) {
        int length = this.f43210s0.length;
        for (int i10 = 1; i10 <= length; i10 += 2) {
            Object[] objArr = this.f43210s0;
            if (objArr[i10] == settableBeanProperty) {
                objArr[i10] = settableBeanProperty2;
                this.f43211t0[a(settableBeanProperty)] = settableBeanProperty2;
                return;
            }
        }
        throw new NoSuchElementException("No entry '" + settableBeanProperty.getName() + "' found, can't replace");
    }

    public BeanPropertyMap(BeanPropertyMap beanPropertyMap, SettableBeanProperty settableBeanProperty, String str, int i10) {
        this._caseInsensitive = beanPropertyMap._caseInsensitive;
        this.f43207p0 = beanPropertyMap.f43207p0;
        this.f43208q0 = beanPropertyMap.f43208q0;
        this.f43209r0 = beanPropertyMap.f43209r0;
        this.f43212u0 = beanPropertyMap.f43212u0;
        this.v0 = beanPropertyMap.v0;
        Object[] objArr = beanPropertyMap.f43210s0;
        this.f43210s0 = Arrays.copyOf(objArr, objArr.length);
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap.f43211t0;
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, length + 1);
        this.f43211t0 = settableBeanPropertyArr2;
        settableBeanPropertyArr2[length] = settableBeanProperty;
        int i11 = this.f43207p0 + 1;
        int i12 = i10 << 1;
        Object[] objArr2 = this.f43210s0;
        if (objArr2[i12] != null) {
            i12 = ((i10 >> 1) + i11) << 1;
            if (objArr2[i12] != null) {
                int i13 = this.f43209r0;
                i12 = ((i11 + (i11 >> 1)) << 1) + i13;
                this.f43209r0 = i13 + 2;
                if (i12 >= objArr2.length) {
                    this.f43210s0 = Arrays.copyOf(objArr2, objArr2.length + 4);
                }
            }
        }
        Object[] objArr3 = this.f43210s0;
        objArr3[i12] = str;
        objArr3[i12 + 1] = settableBeanProperty;
    }

    @Deprecated
    public BeanPropertyMap(boolean z10, Collection<SettableBeanProperty> collection) {
        this(z10, collection, Collections.emptyMap());
    }

    public BeanPropertyMap(BeanPropertyMap beanPropertyMap, boolean z10) {
        this._caseInsensitive = z10;
        this.f43212u0 = beanPropertyMap.f43212u0;
        this.v0 = beanPropertyMap.v0;
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap.f43211t0;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, settableBeanPropertyArr.length);
        this.f43211t0 = settableBeanPropertyArr2;
        init(Arrays.asList(settableBeanPropertyArr2));
    }
}
