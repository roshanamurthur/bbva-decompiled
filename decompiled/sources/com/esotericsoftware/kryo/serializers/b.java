package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.SerializerFactory;
import com.esotericsoftware.kryo.util.Generics;
import com.esotericsoftware.kryo.util.Util;
import com.esotericsoftware.minlog.Log;
import com.esotericsoftware.reflectasm.FieldAccess;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: compiled from: CachedFields.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b implements Comparator<FieldSerializer.CachedField> {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final FieldSerializer.CachedField[] f40040u0 = new FieldSerializer.CachedField[0];

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final FieldSerializer f40041p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public FieldSerializer.CachedField[] f40042q0 = new FieldSerializer.CachedField[0];

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public FieldSerializer.CachedField[] f40043r0 = new FieldSerializer.CachedField[0];

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final ArrayList<Field> f40044s0 = new ArrayList<>();

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public FieldAccess f40045t0;

    public b(FieldSerializer fieldSerializer) {
        this.f40041p0 = fieldSerializer;
    }

    public final Serializer a(Class cls, Class cls2, Class cls3) {
        if (cls2 == Serializer.class) {
            cls2 = null;
        }
        if (cls3 == SerializerFactory.class) {
            cls3 = null;
        }
        if (cls3 == null && cls2 != null) {
            cls3 = SerializerFactory.ReflectionSerializerFactory.class;
        }
        if (cls3 == null) {
            return null;
        }
        return Util.newFactory(cls3, cls2).newSerializer(this.f40041p0.kryo, cls);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0185  */
    /* JADX WARN: Code duplicated, block: B:102:0x018c  */
    /* JADX WARN: Code duplicated, block: B:103:0x018e  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:115:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:121:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:122:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:124:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:125:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:127:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:130:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:134:0x0200  */
    /* JADX WARN: Code duplicated, block: B:136:0x0204  */
    /* JADX WARN: Code duplicated, block: B:137:0x020a  */
    /* JADX WARN: Code duplicated, block: B:138:0x020c  */
    /* JADX WARN: Code duplicated, block: B:143:0x0226  */
    /* JADX WARN: Code duplicated, block: B:145:0x0234  */
    /* JADX WARN: Code duplicated, block: B:147:0x023a  */
    /* JADX WARN: Code duplicated, block: B:149:0x023e  */
    /* JADX WARN: Code duplicated, block: B:150:0x0244  */
    /* JADX WARN: Code duplicated, block: B:152:0x0248  */
    /* JADX WARN: Code duplicated, block: B:153:0x024e  */
    /* JADX WARN: Code duplicated, block: B:155:0x0252  */
    /* JADX WARN: Code duplicated, block: B:156:0x0258  */
    /* JADX WARN: Code duplicated, block: B:158:0x025c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0262  */
    /* JADX WARN: Code duplicated, block: B:161:0x0266  */
    /* JADX WARN: Code duplicated, block: B:162:0x026c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0270  */
    /* JADX WARN: Code duplicated, block: B:165:0x0276  */
    /* JADX WARN: Code duplicated, block: B:167:0x027a  */
    /* JADX WARN: Code duplicated, block: B:168:0x0280  */
    /* JADX WARN: Code duplicated, block: B:170:0x0284  */
    /* JADX WARN: Code duplicated, block: B:171:0x028a  */
    /* JADX WARN: Code duplicated, block: B:174:0x0299  */
    /* JADX WARN: Code duplicated, block: B:175:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:178:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:180:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:183:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:186:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:188:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:191:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:192:0x0320  */
    /* JADX WARN: Code duplicated, block: B:193:0x0322  */
    /* JADX WARN: Code duplicated, block: B:196:0x0328  */
    /* JADX WARN: Code duplicated, block: B:199:0x0331  */
    /* JADX WARN: Code duplicated, block: B:202:0x0366  */
    /* JADX WARN: Code duplicated, block: B:204:0x036a  */
    /* JADX WARN: Code duplicated, block: B:206:0x0376  */
    /* JADX WARN: Code duplicated, block: B:208:0x0379  */
    /* JADX WARN: Code duplicated, block: B:211:0x038a  */
    /* JADX WARN: Code duplicated, block: B:217:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:219:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:221:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:223:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:226:0x040c  */
    /* JADX WARN: Code duplicated, block: B:228:0x0411  */
    /* JADX WARN: Code duplicated, block: B:236:0x0466  */
    /* JADX WARN: Code duplicated, block: B:238:0x046a  */
    /* JADX WARN: Code duplicated, block: B:240:0x0476  */
    /* JADX WARN: Code duplicated, block: B:242:0x0482  */
    /* JADX WARN: Code duplicated, block: B:246:0x0496  */
    /* JADX WARN: Code duplicated, block: B:249:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:251:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:253:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:255:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:262:0x0516  */
    /* JADX WARN: Code duplicated, block: B:264:0x051a  */
    /* JADX WARN: Code duplicated, block: B:265:0x0520  */
    /* JADX WARN: Code duplicated, block: B:268:0x0526  */
    /* JADX WARN: Code duplicated, block: B:269:0x052c  */
    /* JADX WARN: Code duplicated, block: B:270:0x052f  */
    /* JADX WARN: Code duplicated, block: B:286:0x03a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x0434 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x0418 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x04ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x04ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:73:0x0125  */
    /* JADX WARN: Code duplicated, block: B:76:0x012e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0134  */
    /* JADX WARN: Code duplicated, block: B:80:0x0138  */
    /* JADX WARN: Code duplicated, block: B:81:0x013f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0143  */
    /* JADX WARN: Code duplicated, block: B:84:0x014a  */
    /* JADX WARN: Code duplicated, block: B:86:0x014e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0155  */
    /* JADX WARN: Code duplicated, block: B:89:0x0159  */
    /* JADX WARN: Code duplicated, block: B:90:0x0160  */
    /* JADX WARN: Code duplicated, block: B:92:0x0164  */
    /* JADX WARN: Code duplicated, block: B:93:0x016b  */
    /* JADX WARN: Code duplicated, block: B:95:0x016f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0176  */
    /* JADX WARN: Code duplicated, block: B:98:0x017a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0181  */
    /* JADX WARN: Instruction removed from duplicated block: B:174:0x0299, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:191:0x02f5, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:199:0x0331, please report this as an issue */
    public final void b() {
        FieldSerializer.Optional optional;
        boolean zIsTransient;
        Class<?> declaringClass;
        Field[] fieldArr;
        Generics.GenericType genericType;
        int i10;
        Class cls;
        Class<?> type;
        int index;
        boolean z10;
        FieldSerializer.CachedField vVar;
        FieldSerializer.CachedField aVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z11;
        Field field;
        Class clsValueClass;
        Serializer serializerA;
        Class cls2;
        Serializer serializerA2;
        MapSerializer mapSerializer;
        Class clsElementClass;
        Serializer serializerA3;
        CollectionSerializer collectionSerializer;
        Class clsValueClass2;
        Serializer serializerA4;
        boolean z12;
        FieldSerializer fieldSerializer = this.f40041p0;
        if (fieldSerializer.type.isInterface()) {
            FieldSerializer.CachedField[] cachedFieldArr = f40040u0;
            this.f40042q0 = cachedFieldArr;
            this.f40043r0 = cachedFieldArr;
            fieldSerializer.initializeCachedFields();
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        boolean z13 = true;
        boolean z14 = (Util.unsafe || Util.isAndroid || !Modifier.isPublic(fieldSerializer.type.getModifiers())) ? false : true;
        Class superclass = fieldSerializer.type;
        while (superclass != Object.class) {
            Field[] declaredFields = superclass.getDeclaredFields();
            int length = declaredFields.length;
            int i11 = 0;
            while (i11 < length) {
                Field field2 = declaredFields[i11];
                int modifiers = field2.getModifiers();
                if (Modifier.isStatic(modifiers)) {
                    z10 = z14;
                    cls = superclass;
                    fieldArr = declaredFields;
                    i10 = length;
                    i11 = i11;
                } else {
                    FieldSerializer.FieldSerializerConfig fieldSerializerConfig = fieldSerializer.config;
                    if (field2.isSynthetic() && fieldSerializerConfig.ignoreSyntheticFields) {
                        z10 = z14;
                        cls = superclass;
                        fieldArr = declaredFields;
                        i10 = length;
                        i11 = i11;
                    } else if (field2.isAccessible()) {
                        optional = (FieldSerializer.Optional) field2.getAnnotation(FieldSerializer.Optional.class);
                        if ((optional != null || fieldSerializer.kryo.getContext().containsKey(optional.value())) && !this.f40044s0.contains(field2) && (!(zIsTransient = Modifier.isTransient(modifiers)) || fieldSerializerConfig.serializeTransient || fieldSerializerConfig.copyTransient)) {
                            declaringClass = field2.getDeclaringClass();
                            fieldArr = declaredFields;
                            i10 = length;
                            cls = superclass;
                            genericType = new Generics.GenericType(declaringClass, fieldSerializer.type, field2.getGenericType());
                            if (genericType.getType() instanceof Class) {
                                type = (Class) genericType.getType();
                            } else {
                                type = field2.getType();
                            }
                            if (z14 || Modifier.isFinal(modifiers) || !Modifier.isPublic(modifiers) || !Modifier.isPublic(type.getModifiers())) {
                                index = -1;
                            } else {
                                try {
                                    if (this.f40045t0 == null) {
                                        this.f40045t0 = FieldAccess.get(fieldSerializer.type);
                                    }
                                    index = this.f40045t0.getIndex(field2);
                                } catch (RuntimeException e5) {
                                    if (Log.DEBUG) {
                                        Log.debug("kryo", "Unable to use ReflectASM.", e5);
                                    }
                                    index = -1;
                                }
                            }
                            z10 = z14;
                            if (Util.unsafe) {
                                if (type.isPrimitive()) {
                                    if (type == Integer.TYPE) {
                                        vVar = new j0.f(field2);
                                    } else if (type == Float.TYPE) {
                                        vVar = new j0.e(field2);
                                    } else if (type == Boolean.TYPE) {
                                        vVar = new j0.a(field2);
                                    } else if (type == Long.TYPE) {
                                        vVar = new j0.g(field2);
                                    } else if (type == Double.TYPE) {
                                        vVar = new j0.d(field2);
                                    } else if (type == Short.TYPE) {
                                        vVar = new j0.h(field2);
                                    } else if (type == Character.TYPE) {
                                        vVar = new j0.c(field2);
                                    } else if (type == Byte.TYPE) {
                                        vVar = new j0.b(field2);
                                    } else if (type == String.class) {
                                        vVar = new j0(field2, fieldSerializer, genericType);
                                    } else {
                                        vVar = new j0(field2, fieldSerializer, genericType);
                                    }
                                } else if (type == String.class || (fieldSerializer.kryo.getReferences() && fieldSerializer.kryo.getReferenceResolver().useReferences(String.class))) {
                                    vVar = new j0(field2, fieldSerializer, genericType);
                                } else {
                                    vVar = new j0.i(field2);
                                }
                            } else if (index != -1) {
                                if (type.isPrimitive()) {
                                    if (type == Integer.TYPE) {
                                        aVar = new a.f(field2);
                                    } else if (type == Float.TYPE) {
                                        aVar = new a.e(field2);
                                    } else if (type == Boolean.TYPE) {
                                        aVar = new a.C0191a(field2);
                                    } else if (type == Long.TYPE) {
                                        aVar = new a.g(field2);
                                    } else if (type == Double.TYPE) {
                                        aVar = new a.d(field2);
                                    } else if (type == Short.TYPE) {
                                        aVar = new a.h(field2);
                                    } else if (type == Character.TYPE) {
                                        aVar = new a.c(field2);
                                    } else if (type == Byte.TYPE) {
                                        aVar = new a.b(field2);
                                    } else if (type == String.class) {
                                        aVar = new a(field2, fieldSerializer, genericType);
                                    } else {
                                        aVar = new a(field2, fieldSerializer, genericType);
                                    }
                                } else if (type == String.class || (fieldSerializer.kryo.getReferences() && fieldSerializer.kryo.getReferenceResolver().useReferences(String.class))) {
                                    aVar = new a(field2, fieldSerializer, genericType);
                                } else {
                                    aVar = new a.i(field2);
                                }
                                aVar.access = this.f40045t0;
                                aVar.accessIndex = index;
                                vVar = aVar;
                            } else if (!type.isPrimitive()) {
                                vVar = new v(field2, fieldSerializer, genericType);
                            } else if (type == Integer.TYPE) {
                                vVar = new v.f(field2);
                            } else if (type == Float.TYPE) {
                                vVar = new v.e(field2);
                            } else if (type == Boolean.TYPE) {
                                vVar = new v.a(field2);
                            } else if (type == Long.TYPE) {
                                vVar = new v.g(field2);
                            } else if (type == Double.TYPE) {
                                vVar = new v.d(field2);
                            } else if (type == Short.TYPE) {
                                vVar = new v.h(field2);
                            } else if (type == Character.TYPE) {
                                vVar = new v.c(field2);
                            } else if (type == Byte.TYPE) {
                                vVar = new v.b(field2);
                            } else {
                                vVar = new v(field2, fieldSerializer, genericType);
                            }
                            vVar.varEncoding = fieldSerializerConfig.varEncoding;
                            if (fieldSerializerConfig.extendedFieldNames) {
                                vVar.name = declaringClass.getSimpleName() + Constant.DOT_STRING + field2.getName();
                            } else {
                                vVar.name = field2.getName();
                            }
                            arrayList = arrayList4;
                            arrayList2 = arrayList3;
                            if (vVar instanceof v) {
                                if (fieldSerializerConfig.fieldsCanBeNull || field2.isAnnotationPresent(FieldSerializer.NotNull.class)) {
                                    z12 = false;
                                } else {
                                    z12 = true;
                                }
                                vVar.canBeNull = z12;
                                if (fieldSerializer.kryo.isFinal(type) || fieldSerializerConfig.fixedFieldTypes) {
                                    vVar.valueClass = type;
                                }
                                if (Log.TRACE) {
                                    Log.trace("kryo", "Cached " + type.getSimpleName() + " field: " + field2.getName() + " (" + Util.className(declaringClass) + ")");
                                }
                            } else {
                                if (type == String.class || !fieldSerializerConfig.fieldsCanBeNull) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                vVar.canBeNull = z11;
                                vVar.valueClass = type;
                                if (Log.TRACE) {
                                    Log.trace("kryo", "Cached " + type.getSimpleName() + " field: " + field2.getName() + " (" + Util.className(declaringClass) + ")");
                                }
                            }
                            field = vVar.field;
                            if (field.isAnnotationPresent(FieldSerializer.Bind.class)) {
                                if (vVar.serializer != null) {
                                    throw new KryoException("@Bind applied to a field that already has a serializer: " + vVar.field.getDeclaringClass().getName() + Constant.DOT_STRING + vVar.field.getName());
                                }
                                FieldSerializer.Bind bind = (FieldSerializer.Bind) field.getAnnotation(FieldSerializer.Bind.class);
                                clsValueClass2 = bind.valueClass();
                                if (clsValueClass2 == Object.class) {
                                    clsValueClass2 = null;
                                }
                                if (clsValueClass2 != null) {
                                    vVar.setValueClass(clsValueClass2);
                                }
                                serializerA4 = a(clsValueClass2, bind.serializer(), bind.serializerFactory());
                                if (serializerA4 != null) {
                                    vVar.setSerializer(serializerA4);
                                }
                                vVar.setCanBeNull(bind.canBeNull());
                                vVar.setVariableLengthEncoding(bind.variableLengthEncoding());
                                vVar.setOptimizePositive(bind.optimizePositive());
                            }
                            if (field.isAnnotationPresent(CollectionSerializer.BindCollection.class)) {
                                if (vVar.serializer != null) {
                                    throw new KryoException("@BindCollection applied to a field that already has a serializer: " + vVar.field.getDeclaringClass().getName() + Constant.DOT_STRING + vVar.field.getName());
                                }
                                if (!Collection.class.isAssignableFrom(field.getType())) {
                                    throw new KryoException("@BindCollection can only be used with a field implementing Collection: " + Util.className(field.getType()));
                                }
                                CollectionSerializer.BindCollection bindCollection = (CollectionSerializer.BindCollection) field.getAnnotation(CollectionSerializer.BindCollection.class);
                                clsElementClass = bindCollection.elementClass();
                                if (clsElementClass == Object.class) {
                                    clsElementClass = null;
                                }
                                serializerA3 = a(clsElementClass, bindCollection.elementSerializer(), bindCollection.elementSerializerFactory());
                                collectionSerializer = new CollectionSerializer();
                                collectionSerializer.setElementsCanBeNull(bindCollection.elementsCanBeNull());
                                if (clsElementClass != null) {
                                    collectionSerializer.setElementClass(clsElementClass);
                                }
                                if (serializerA3 != null) {
                                    collectionSerializer.setElementSerializer(serializerA3);
                                }
                                vVar.setSerializer(collectionSerializer);
                            }
                            if (field.isAnnotationPresent(MapSerializer.BindMap.class)) {
                                if (vVar.serializer != null) {
                                    throw new KryoException("@BindMap applied to a field that already has a serializer: " + vVar.field.getDeclaringClass().getName() + Constant.DOT_STRING + vVar.field.getName());
                                }
                                if (!Map.class.isAssignableFrom(field.getType())) {
                                    throw new KryoException("@BindMap can only be used with a field implementing Map: " + Util.className(field.getType()));
                                }
                                MapSerializer.BindMap bindMap = (MapSerializer.BindMap) field.getAnnotation(MapSerializer.BindMap.class);
                                clsValueClass = bindMap.valueClass();
                                if (clsValueClass == Object.class) {
                                    clsValueClass = null;
                                }
                                serializerA = a(clsValueClass, bindMap.valueSerializer(), bindMap.valueSerializerFactory());
                                Class clsKeyClass = bindMap.keyClass();
                                cls2 = clsKeyClass != Object.class ? clsKeyClass : null;
                                serializerA2 = a(cls2, bindMap.keySerializer(), bindMap.keySerializerFactory());
                                mapSerializer = new MapSerializer();
                                mapSerializer.setKeysCanBeNull(bindMap.keysCanBeNull());
                                mapSerializer.setValuesCanBeNull(bindMap.valuesCanBeNull());
                                if (cls2 != null) {
                                    mapSerializer.setKeyClass(cls2);
                                }
                                if (serializerA2 != null) {
                                    mapSerializer.setKeySerializer(serializerA2);
                                }
                                if (clsValueClass != null) {
                                    mapSerializer.setValueClass(clsValueClass);
                                }
                                if (serializerA != null) {
                                    mapSerializer.setValueSerializer(serializerA);
                                }
                                vVar.setSerializer(mapSerializer);
                            }
                            if (zIsTransient) {
                                if (fieldSerializerConfig.serializeTransient) {
                                    arrayList3 = arrayList2;
                                    arrayList3.add(vVar);
                                } else {
                                    arrayList3 = arrayList2;
                                }
                                if (fieldSerializerConfig.copyTransient) {
                                    arrayList4 = arrayList;
                                    arrayList4.add(vVar);
                                } else {
                                    arrayList4 = arrayList;
                                }
                            } else {
                                arrayList4 = arrayList;
                                arrayList3 = arrayList2;
                                arrayList3.add(vVar);
                                arrayList4.add(vVar);
                            }
                        } else {
                            z10 = z14;
                            cls = superclass;
                            fieldArr = declaredFields;
                            i10 = length;
                            i11 = i11;
                        }
                    } else {
                        if (fieldSerializerConfig.setFieldsAsAccessible) {
                            try {
                                field2.setAccessible(z13);
                                optional = (FieldSerializer.Optional) field2.getAnnotation(FieldSerializer.Optional.class);
                                if (optional != null) {
                                    declaringClass = field2.getDeclaringClass();
                                    fieldArr = declaredFields;
                                    i10 = length;
                                    cls = superclass;
                                    genericType = new Generics.GenericType(declaringClass, fieldSerializer.type, field2.getGenericType());
                                    if (genericType.getType() instanceof Class) {
                                        type = (Class) genericType.getType();
                                    } else {
                                        type = field2.getType();
                                    }
                                    if (z14) {
                                        index = -1;
                                    } else {
                                        index = -1;
                                    }
                                    z10 = z14;
                                    if (Util.unsafe) {
                                        if (type.isPrimitive()) {
                                            if (type == String.class) {
                                                vVar = new j0(field2, fieldSerializer, genericType);
                                            } else {
                                                vVar = new j0(field2, fieldSerializer, genericType);
                                            }
                                        } else if (type == Integer.TYPE) {
                                            vVar = new j0.f(field2);
                                        } else if (type == Float.TYPE) {
                                            vVar = new j0.e(field2);
                                        } else if (type == Boolean.TYPE) {
                                            vVar = new j0.a(field2);
                                        } else if (type == Long.TYPE) {
                                            vVar = new j0.g(field2);
                                        } else if (type == Double.TYPE) {
                                            vVar = new j0.d(field2);
                                        } else if (type == Short.TYPE) {
                                            vVar = new j0.h(field2);
                                        } else if (type == Character.TYPE) {
                                            vVar = new j0.c(field2);
                                        } else if (type == Byte.TYPE) {
                                            vVar = new j0.b(field2);
                                        } else if (type == String.class) {
                                            vVar = new j0(field2, fieldSerializer, genericType);
                                        } else {
                                            vVar = new j0(field2, fieldSerializer, genericType);
                                        }
                                    } else if (index != -1) {
                                        if (type.isPrimitive()) {
                                            if (type == String.class) {
                                                aVar = new a(field2, fieldSerializer, genericType);
                                            } else {
                                                aVar = new a(field2, fieldSerializer, genericType);
                                            }
                                        } else if (type == Integer.TYPE) {
                                            aVar = new a.f(field2);
                                        } else if (type == Float.TYPE) {
                                            aVar = new a.e(field2);
                                        } else if (type == Boolean.TYPE) {
                                            aVar = new a.C0191a(field2);
                                        } else if (type == Long.TYPE) {
                                            aVar = new a.g(field2);
                                        } else if (type == Double.TYPE) {
                                            aVar = new a.d(field2);
                                        } else if (type == Short.TYPE) {
                                            aVar = new a.h(field2);
                                        } else if (type == Character.TYPE) {
                                            aVar = new a.c(field2);
                                        } else if (type == Byte.TYPE) {
                                            aVar = new a.b(field2);
                                        } else if (type == String.class) {
                                            aVar = new a(field2, fieldSerializer, genericType);
                                        } else {
                                            aVar = new a(field2, fieldSerializer, genericType);
                                        }
                                        aVar.access = this.f40045t0;
                                        aVar.accessIndex = index;
                                        vVar = aVar;
                                    } else if (!type.isPrimitive()) {
                                        vVar = new v(field2, fieldSerializer, genericType);
                                    } else if (type == Integer.TYPE) {
                                        vVar = new v.f(field2);
                                    } else if (type == Float.TYPE) {
                                        vVar = new v.e(field2);
                                    } else if (type == Boolean.TYPE) {
                                        vVar = new v.a(field2);
                                    } else if (type == Long.TYPE) {
                                        vVar = new v.g(field2);
                                    } else if (type == Double.TYPE) {
                                        vVar = new v.d(field2);
                                    } else if (type == Short.TYPE) {
                                        vVar = new v.h(field2);
                                    } else if (type == Character.TYPE) {
                                        vVar = new v.c(field2);
                                    } else if (type == Byte.TYPE) {
                                        vVar = new v.b(field2);
                                    } else {
                                        vVar = new v(field2, fieldSerializer, genericType);
                                    }
                                    vVar.varEncoding = fieldSerializerConfig.varEncoding;
                                    if (fieldSerializerConfig.extendedFieldNames) {
                                        vVar.name = declaringClass.getSimpleName() + Constant.DOT_STRING + field2.getName();
                                    } else {
                                        vVar.name = field2.getName();
                                    }
                                    arrayList = arrayList4;
                                    arrayList2 = arrayList3;
                                    if (vVar instanceof v) {
                                        if (fieldSerializerConfig.fieldsCanBeNull) {
                                            z12 = false;
                                        } else {
                                            z12 = false;
                                        }
                                        vVar.canBeNull = z12;
                                        if (fieldSerializer.kryo.isFinal(type)) {
                                            vVar.valueClass = type;
                                        } else {
                                            vVar.valueClass = type;
                                        }
                                        if (Log.TRACE) {
                                            Log.trace("kryo", "Cached " + type.getSimpleName() + " field: " + field2.getName() + " (" + Util.className(declaringClass) + ")");
                                        }
                                    } else {
                                        if (type == String.class) {
                                            z11 = false;
                                        } else {
                                            z11 = false;
                                        }
                                        vVar.canBeNull = z11;
                                        vVar.valueClass = type;
                                        if (Log.TRACE) {
                                            Log.trace("kryo", "Cached " + type.getSimpleName() + " field: " + field2.getName() + " (" + Util.className(declaringClass) + ")");
                                        }
                                    }
                                    field = vVar.field;
                                    if (field.isAnnotationPresent(FieldSerializer.Bind.class)) {
                                        if (vVar.serializer != null) {
                                            throw new KryoException("@Bind applied to a field that already has a serializer: " + vVar.field.getDeclaringClass().getName() + Constant.DOT_STRING + vVar.field.getName());
                                        }
                                        FieldSerializer.Bind bind2 = (FieldSerializer.Bind) field.getAnnotation(FieldSerializer.Bind.class);
                                        clsValueClass2 = bind2.valueClass();
                                        if (clsValueClass2 == Object.class) {
                                            clsValueClass2 = null;
                                        }
                                        if (clsValueClass2 != null) {
                                            vVar.setValueClass(clsValueClass2);
                                        }
                                        serializerA4 = a(clsValueClass2, bind2.serializer(), bind2.serializerFactory());
                                        if (serializerA4 != null) {
                                            vVar.setSerializer(serializerA4);
                                        }
                                        vVar.setCanBeNull(bind2.canBeNull());
                                        vVar.setVariableLengthEncoding(bind2.variableLengthEncoding());
                                        vVar.setOptimizePositive(bind2.optimizePositive());
                                    }
                                    if (field.isAnnotationPresent(CollectionSerializer.BindCollection.class)) {
                                        if (vVar.serializer != null) {
                                            throw new KryoException("@BindCollection applied to a field that already has a serializer: " + vVar.field.getDeclaringClass().getName() + Constant.DOT_STRING + vVar.field.getName());
                                        }
                                        if (!Collection.class.isAssignableFrom(field.getType())) {
                                            throw new KryoException("@BindCollection can only be used with a field implementing Collection: " + Util.className(field.getType()));
                                        }
                                        CollectionSerializer.BindCollection bindCollection2 = (CollectionSerializer.BindCollection) field.getAnnotation(CollectionSerializer.BindCollection.class);
                                        clsElementClass = bindCollection2.elementClass();
                                        if (clsElementClass == Object.class) {
                                            clsElementClass = null;
                                        }
                                        serializerA3 = a(clsElementClass, bindCollection2.elementSerializer(), bindCollection2.elementSerializerFactory());
                                        collectionSerializer = new CollectionSerializer();
                                        collectionSerializer.setElementsCanBeNull(bindCollection2.elementsCanBeNull());
                                        if (clsElementClass != null) {
                                            collectionSerializer.setElementClass(clsElementClass);
                                        }
                                        if (serializerA3 != null) {
                                            collectionSerializer.setElementSerializer(serializerA3);
                                        }
                                        vVar.setSerializer(collectionSerializer);
                                    }
                                    if (field.isAnnotationPresent(MapSerializer.BindMap.class)) {
                                        if (vVar.serializer != null) {
                                            throw new KryoException("@BindMap applied to a field that already has a serializer: " + vVar.field.getDeclaringClass().getName() + Constant.DOT_STRING + vVar.field.getName());
                                        }
                                        if (!Map.class.isAssignableFrom(field.getType())) {
                                            throw new KryoException("@BindMap can only be used with a field implementing Map: " + Util.className(field.getType()));
                                        }
                                        MapSerializer.BindMap bindMap2 = (MapSerializer.BindMap) field.getAnnotation(MapSerializer.BindMap.class);
                                        clsValueClass = bindMap2.valueClass();
                                        if (clsValueClass == Object.class) {
                                            clsValueClass = null;
                                        }
                                        serializerA = a(clsValueClass, bindMap2.valueSerializer(), bindMap2.valueSerializerFactory());
                                        Class clsKeyClass2 = bindMap2.keyClass();
                                        if (clsKeyClass2 != Object.class) {
                                        }
                                        serializerA2 = a(cls2, bindMap2.keySerializer(), bindMap2.keySerializerFactory());
                                        mapSerializer = new MapSerializer();
                                        mapSerializer.setKeysCanBeNull(bindMap2.keysCanBeNull());
                                        mapSerializer.setValuesCanBeNull(bindMap2.valuesCanBeNull());
                                        if (cls2 != null) {
                                            mapSerializer.setKeyClass(cls2);
                                        }
                                        if (serializerA2 != null) {
                                            mapSerializer.setKeySerializer(serializerA2);
                                        }
                                        if (clsValueClass != null) {
                                            mapSerializer.setValueClass(clsValueClass);
                                        }
                                        if (serializerA != null) {
                                            mapSerializer.setValueSerializer(serializerA);
                                        }
                                        vVar.setSerializer(mapSerializer);
                                    }
                                    if (zIsTransient) {
                                        if (fieldSerializerConfig.serializeTransient) {
                                            arrayList3 = arrayList2;
                                            arrayList3.add(vVar);
                                        } else {
                                            arrayList3 = arrayList2;
                                        }
                                        if (fieldSerializerConfig.copyTransient) {
                                            arrayList4 = arrayList;
                                            arrayList4.add(vVar);
                                        } else {
                                            arrayList4 = arrayList;
                                        }
                                    } else {
                                        arrayList4 = arrayList;
                                        arrayList3 = arrayList2;
                                        arrayList3.add(vVar);
                                        arrayList4.add(vVar);
                                    }
                                } else {
                                    declaringClass = field2.getDeclaringClass();
                                    fieldArr = declaredFields;
                                    i10 = length;
                                    cls = superclass;
                                    genericType = new Generics.GenericType(declaringClass, fieldSerializer.type, field2.getGenericType());
                                    if (genericType.getType() instanceof Class) {
                                        type = (Class) genericType.getType();
                                    } else {
                                        type = field2.getType();
                                    }
                                    if (z14) {
                                        index = -1;
                                    } else {
                                        index = -1;
                                    }
                                    z10 = z14;
                                    if (Util.unsafe) {
                                        if (type.isPrimitive()) {
                                            if (type == String.class) {
                                                vVar = new j0(field2, fieldSerializer, genericType);
                                            } else {
                                                vVar = new j0(field2, fieldSerializer, genericType);
                                            }
                                        } else if (type == Integer.TYPE) {
                                            vVar = new j0.f(field2);
                                        } else if (type == Float.TYPE) {
                                            vVar = new j0.e(field2);
                                        } else if (type == Boolean.TYPE) {
                                            vVar = new j0.a(field2);
                                        } else if (type == Long.TYPE) {
                                            vVar = new j0.g(field2);
                                        } else if (type == Double.TYPE) {
                                            vVar = new j0.d(field2);
                                        } else if (type == Short.TYPE) {
                                            vVar = new j0.h(field2);
                                        } else if (type == Character.TYPE) {
                                            vVar = new j0.c(field2);
                                        } else if (type == Byte.TYPE) {
                                            vVar = new j0.b(field2);
                                        } else if (type == String.class) {
                                            vVar = new j0(field2, fieldSerializer, genericType);
                                        } else {
                                            vVar = new j0(field2, fieldSerializer, genericType);
                                        }
                                    } else if (index != -1) {
                                        if (type.isPrimitive()) {
                                            if (type == String.class) {
                                                aVar = new a(field2, fieldSerializer, genericType);
                                            } else {
                                                aVar = new a(field2, fieldSerializer, genericType);
                                            }
                                        } else if (type == Integer.TYPE) {
                                            aVar = new a.f(field2);
                                        } else if (type == Float.TYPE) {
                                            aVar = new a.e(field2);
                                        } else if (type == Boolean.TYPE) {
                                            aVar = new a.C0191a(field2);
                                        } else if (type == Long.TYPE) {
                                            aVar = new a.g(field2);
                                        } else if (type == Double.TYPE) {
                                            aVar = new a.d(field2);
                                        } else if (type == Short.TYPE) {
                                            aVar = new a.h(field2);
                                        } else if (type == Character.TYPE) {
                                            aVar = new a.c(field2);
                                        } else if (type == Byte.TYPE) {
                                            aVar = new a.b(field2);
                                        } else if (type == String.class) {
                                            aVar = new a(field2, fieldSerializer, genericType);
                                        } else {
                                            aVar = new a(field2, fieldSerializer, genericType);
                                        }
                                        aVar.access = this.f40045t0;
                                        aVar.accessIndex = index;
                                        vVar = aVar;
                                    } else if (!type.isPrimitive()) {
                                        vVar = new v(field2, fieldSerializer, genericType);
                                    } else if (type == Integer.TYPE) {
                                        vVar = new v.f(field2);
                                    } else if (type == Float.TYPE) {
                                        vVar = new v.e(field2);
                                    } else if (type == Boolean.TYPE) {
                                        vVar = new v.a(field2);
                                    } else if (type == Long.TYPE) {
                                        vVar = new v.g(field2);
                                    } else if (type == Double.TYPE) {
                                        vVar = new v.d(field2);
                                    } else if (type == Short.TYPE) {
                                        vVar = new v.h(field2);
                                    } else if (type == Character.TYPE) {
                                        vVar = new v.c(field2);
                                    } else if (type == Byte.TYPE) {
                                        vVar = new v.b(field2);
                                    } else {
                                        vVar = new v(field2, fieldSerializer, genericType);
                                    }
                                    vVar.varEncoding = fieldSerializerConfig.varEncoding;
                                    if (fieldSerializerConfig.extendedFieldNames) {
                                        vVar.name = declaringClass.getSimpleName() + Constant.DOT_STRING + field2.getName();
                                    } else {
                                        vVar.name = field2.getName();
                                    }
                                    arrayList = arrayList4;
                                    arrayList2 = arrayList3;
                                    if (vVar instanceof v) {
                                        if (fieldSerializerConfig.fieldsCanBeNull) {
                                            z12 = false;
                                        } else {
                                            z12 = false;
                                        }
                                        vVar.canBeNull = z12;
                                        if (fieldSerializer.kryo.isFinal(type)) {
                                            vVar.valueClass = type;
                                        } else {
                                            vVar.valueClass = type;
                                        }
                                        if (Log.TRACE) {
                                            Log.trace("kryo", "Cached " + type.getSimpleName() + " field: " + field2.getName() + " (" + Util.className(declaringClass) + ")");
                                        }
                                    } else {
                                        if (type == String.class) {
                                            z11 = false;
                                        } else {
                                            z11 = false;
                                        }
                                        vVar.canBeNull = z11;
                                        vVar.valueClass = type;
                                        if (Log.TRACE) {
                                            Log.trace("kryo", "Cached " + type.getSimpleName() + " field: " + field2.getName() + " (" + Util.className(declaringClass) + ")");
                                        }
                                    }
                                    field = vVar.field;
                                    if (field.isAnnotationPresent(FieldSerializer.Bind.class)) {
                                        if (vVar.serializer != null) {
                                            throw new KryoException("@Bind applied to a field that already has a serializer: " + vVar.field.getDeclaringClass().getName() + Constant.DOT_STRING + vVar.field.getName());
                                        }
                                        FieldSerializer.Bind bind3 = (FieldSerializer.Bind) field.getAnnotation(FieldSerializer.Bind.class);
                                        clsValueClass2 = bind3.valueClass();
                                        if (clsValueClass2 == Object.class) {
                                            clsValueClass2 = null;
                                        }
                                        if (clsValueClass2 != null) {
                                            vVar.setValueClass(clsValueClass2);
                                        }
                                        serializerA4 = a(clsValueClass2, bind3.serializer(), bind3.serializerFactory());
                                        if (serializerA4 != null) {
                                            vVar.setSerializer(serializerA4);
                                        }
                                        vVar.setCanBeNull(bind3.canBeNull());
                                        vVar.setVariableLengthEncoding(bind3.variableLengthEncoding());
                                        vVar.setOptimizePositive(bind3.optimizePositive());
                                    }
                                    if (field.isAnnotationPresent(CollectionSerializer.BindCollection.class)) {
                                        if (vVar.serializer != null) {
                                            throw new KryoException("@BindCollection applied to a field that already has a serializer: " + vVar.field.getDeclaringClass().getName() + Constant.DOT_STRING + vVar.field.getName());
                                        }
                                        if (!Collection.class.isAssignableFrom(field.getType())) {
                                            throw new KryoException("@BindCollection can only be used with a field implementing Collection: " + Util.className(field.getType()));
                                        }
                                        CollectionSerializer.BindCollection bindCollection3 = (CollectionSerializer.BindCollection) field.getAnnotation(CollectionSerializer.BindCollection.class);
                                        clsElementClass = bindCollection3.elementClass();
                                        if (clsElementClass == Object.class) {
                                            clsElementClass = null;
                                        }
                                        serializerA3 = a(clsElementClass, bindCollection3.elementSerializer(), bindCollection3.elementSerializerFactory());
                                        collectionSerializer = new CollectionSerializer();
                                        collectionSerializer.setElementsCanBeNull(bindCollection3.elementsCanBeNull());
                                        if (clsElementClass != null) {
                                            collectionSerializer.setElementClass(clsElementClass);
                                        }
                                        if (serializerA3 != null) {
                                            collectionSerializer.setElementSerializer(serializerA3);
                                        }
                                        vVar.setSerializer(collectionSerializer);
                                    }
                                    if (field.isAnnotationPresent(MapSerializer.BindMap.class)) {
                                        if (vVar.serializer != null) {
                                            throw new KryoException("@BindMap applied to a field that already has a serializer: " + vVar.field.getDeclaringClass().getName() + Constant.DOT_STRING + vVar.field.getName());
                                        }
                                        if (!Map.class.isAssignableFrom(field.getType())) {
                                            throw new KryoException("@BindMap can only be used with a field implementing Map: " + Util.className(field.getType()));
                                        }
                                        MapSerializer.BindMap bindMap3 = (MapSerializer.BindMap) field.getAnnotation(MapSerializer.BindMap.class);
                                        clsValueClass = bindMap3.valueClass();
                                        if (clsValueClass == Object.class) {
                                            clsValueClass = null;
                                        }
                                        serializerA = a(clsValueClass, bindMap3.valueSerializer(), bindMap3.valueSerializerFactory());
                                        Class clsKeyClass3 = bindMap3.keyClass();
                                        if (clsKeyClass3 != Object.class) {
                                        }
                                        serializerA2 = a(cls2, bindMap3.keySerializer(), bindMap3.keySerializerFactory());
                                        mapSerializer = new MapSerializer();
                                        mapSerializer.setKeysCanBeNull(bindMap3.keysCanBeNull());
                                        mapSerializer.setValuesCanBeNull(bindMap3.valuesCanBeNull());
                                        if (cls2 != null) {
                                            mapSerializer.setKeyClass(cls2);
                                        }
                                        if (serializerA2 != null) {
                                            mapSerializer.setKeySerializer(serializerA2);
                                        }
                                        if (clsValueClass != null) {
                                            mapSerializer.setValueClass(clsValueClass);
                                        }
                                        if (serializerA != null) {
                                            mapSerializer.setValueSerializer(serializerA);
                                        }
                                        vVar.setSerializer(mapSerializer);
                                    }
                                    if (zIsTransient) {
                                        if (fieldSerializerConfig.serializeTransient) {
                                            arrayList3 = arrayList2;
                                            arrayList3.add(vVar);
                                        } else {
                                            arrayList3 = arrayList2;
                                        }
                                        if (fieldSerializerConfig.copyTransient) {
                                            arrayList4 = arrayList;
                                            arrayList4.add(vVar);
                                        } else {
                                            arrayList4 = arrayList;
                                        }
                                    } else {
                                        arrayList4 = arrayList;
                                        arrayList3 = arrayList2;
                                        arrayList3.add(vVar);
                                        arrayList4.add(vVar);
                                    }
                                }
                            } catch (AccessControlException unused) {
                                if (Log.DEBUG) {
                                    Log.debug("kryo", "Unable to set field as accessible: " + field2);
                                }
                            }
                        }
                        z10 = z14;
                        cls = superclass;
                        fieldArr = declaredFields;
                        i10 = length;
                        i11 = i11;
                    }
                }
                i11++;
                declaredFields = fieldArr;
                length = i10;
                superclass = cls;
                z14 = z10;
                z13 = true;
            }
            superclass = superclass.getSuperclass();
            z13 = true;
        }
        if (this.f40042q0.length != arrayList3.size()) {
            this.f40042q0 = new FieldSerializer.CachedField[arrayList3.size()];
        }
        arrayList3.toArray(this.f40042q0);
        Arrays.sort(this.f40042q0, this);
        if (this.f40043r0.length != arrayList4.size()) {
            this.f40043r0 = new FieldSerializer.CachedField[arrayList4.size()];
        }
        arrayList4.toArray(this.f40043r0);
        Arrays.sort(this.f40043r0, this);
        fieldSerializer.initializeCachedFields();
    }

    @Override // java.util.Comparator
    public final int compare(FieldSerializer.CachedField cachedField, FieldSerializer.CachedField cachedField2) {
        return cachedField.name.compareTo(cachedField2.name);
    }
}
