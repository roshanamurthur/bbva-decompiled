package com.esotericsoftware.kryo.serializers;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.SerializerFactory;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.util.Generics;
import com.esotericsoftware.kryo.util.Util;
import com.esotericsoftware.minlog.Log;
import com.esotericsoftware.reflectasm.FieldAccess;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class FieldSerializer<T> extends Serializer<T> {
    final b cachedFields;
    final FieldSerializerConfig config;
    private final Generics.GenericsHierarchy genericsHierarchy;
    final Kryo kryo;
    final Class type;

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Bind {
        boolean canBeNull() default true;

        boolean optimizePositive() default false;

        Class<? extends Serializer> serializer() default Serializer.class;

        Class<? extends SerializerFactory> serializerFactory() default SerializerFactory.class;

        Class valueClass() default Object.class;

        boolean variableLengthEncoding() default true;
    }

    public static abstract class CachedField {
        FieldAccess access;
        boolean canBeNull;
        final Field field;
        String name;
        long offset;
        boolean optimizePositive;
        Serializer serializer;
        int tag;
        Class valueClass;
        boolean varEncoding = true;
        boolean reuseSerializer = true;
        int accessIndex = -1;

        public CachedField(Field field) {
            this.field = field;
        }

        public abstract void copy(Object obj, Object obj2);

        public boolean getCanBeNull() {
            return this.canBeNull;
        }

        public Field getField() {
            return this.field;
        }

        public String getName() {
            return this.name;
        }

        public boolean getOptimizePositive() {
            return this.optimizePositive;
        }

        public boolean getReuseSerializer() {
            return this.reuseSerializer;
        }

        public Serializer getSerializer() {
            return this.serializer;
        }

        public Class getValueClass() {
            return this.valueClass;
        }

        public boolean getVariableLengthEncoding() {
            return this.varEncoding;
        }

        public abstract void read(Input input, Object obj);

        public void setCanBeNull(boolean z10) {
            this.canBeNull = z10;
        }

        public void setOptimizePositive(boolean z10) {
            this.optimizePositive = z10;
        }

        public void setReuseSerializer(boolean z10) {
            this.reuseSerializer = z10;
        }

        public void setSerializer(Serializer serializer) {
            this.serializer = serializer;
        }

        public void setValueClass(Class cls) {
            this.valueClass = cls;
        }

        public void setVariableLengthEncoding(boolean z10) {
            this.varEncoding = z10;
        }

        public String toString() {
            return this.name;
        }

        public abstract void write(Output output, Object obj);

        public void setValueClass(Class cls, Serializer serializer) {
            this.valueClass = cls;
            this.serializer = serializer;
        }
    }

    public static class FieldSerializerConfig implements Cloneable {
        boolean extendedFieldNames;
        boolean fixedFieldTypes;
        boolean serializeTransient;
        boolean fieldsCanBeNull = true;
        boolean setFieldsAsAccessible = true;
        boolean ignoreSyntheticFields = true;
        boolean copyTransient = true;
        boolean varEncoding = true;

        public boolean getCopyTransient() {
            return this.copyTransient;
        }

        public boolean getExtendedFieldNames() {
            return this.extendedFieldNames;
        }

        public boolean getFieldsCanBeNull() {
            return this.fieldsCanBeNull;
        }

        public boolean getFixedFieldTypes() {
            return this.fixedFieldTypes;
        }

        public boolean getIgnoreSyntheticFields() {
            return this.ignoreSyntheticFields;
        }

        public boolean getSerializeTransient() {
            return this.serializeTransient;
        }

        public boolean getSetFieldsAsAccessible() {
            return this.setFieldsAsAccessible;
        }

        public boolean getVariableLengthEncoding() {
            return this.varEncoding;
        }

        public void setCopyTransient(boolean z10) {
            this.copyTransient = z10;
            if (Log.TRACE) {
                Log.trace("kryo", "FieldSerializerConfig copyTransient: " + z10);
            }
        }

        public void setExtendedFieldNames(boolean z10) {
            this.extendedFieldNames = z10;
            if (Log.TRACE) {
                Log.trace("kryo", "FieldSerializerConfig extendedFieldNames: " + z10);
            }
        }

        public void setFieldsAsAccessible(boolean z10) {
            this.setFieldsAsAccessible = z10;
            if (Log.TRACE) {
                Log.trace("kryo", "FieldSerializerConfig setFieldsAsAccessible: " + z10);
            }
        }

        public void setFieldsCanBeNull(boolean z10) {
            this.fieldsCanBeNull = z10;
            if (Log.TRACE) {
                Log.trace("kryo", "FieldSerializerConfig fieldsCanBeNull: " + z10);
            }
        }

        public void setFixedFieldTypes(boolean z10) {
            this.fixedFieldTypes = z10;
            if (Log.TRACE) {
                Log.trace("kryo", "FieldSerializerConfig fixedFieldTypes: " + z10);
            }
        }

        public void setIgnoreSyntheticFields(boolean z10) {
            this.ignoreSyntheticFields = z10;
            if (Log.TRACE) {
                Log.trace("kryo", "FieldSerializerConfig ignoreSyntheticFields: " + z10);
            }
        }

        public void setSerializeTransient(boolean z10) {
            this.serializeTransient = z10;
            if (Log.TRACE) {
                Log.trace("kryo", "FieldSerializerConfig serializeTransient: " + z10);
            }
        }

        public void setVariableLengthEncoding(boolean z10) {
            this.varEncoding = z10;
            if (Log.TRACE) {
                Log.trace("kryo", "FieldSerializerConfig variable length encoding: " + z10);
            }
        }

        @Override // 
        /* JADX INFO: renamed from: clone */
        public FieldSerializerConfig mo5277clone() {
            try {
                return (FieldSerializerConfig) super.clone();
            } catch (CloneNotSupportedException e5) {
                throw new KryoException(e5);
            }
        }
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface NotNull {
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Optional {
        String value();
    }

    public FieldSerializer(Kryo kryo, Class cls) {
        this(kryo, cls, new FieldSerializerConfig());
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public T copy(Kryo kryo, T t10) {
        T tCreateCopy = createCopy(kryo, t10);
        kryo.reference(tCreateCopy);
        int length = this.cachedFields.f40043r0.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.cachedFields.f40043r0[i10].copy(t10, tCreateCopy);
        }
        return tCreateCopy;
    }

    public T create(Kryo kryo, Input input, Class<? extends T> cls) {
        return (T) kryo.newInstance(cls);
    }

    public T createCopy(Kryo kryo, T t10) {
        return (T) kryo.newInstance(t10.getClass());
    }

    public CachedField[] getCopyFields() {
        return this.cachedFields.f40043r0;
    }

    public CachedField getField(String str) {
        for (CachedField cachedField : this.cachedFields.f40042q0) {
            if (cachedField.name.equals(str)) {
                return cachedField;
            }
        }
        StringBuilder sbD = ci.a.d("Field \"", str, "\" not found on class: ");
        sbD.append(this.type.getName());
        throw new IllegalArgumentException(sbD.toString());
    }

    public FieldSerializerConfig getFieldSerializerConfig() {
        return this.config;
    }

    public CachedField[] getFields() {
        return this.cachedFields.f40042q0;
    }

    public Kryo getKryo() {
        return this.kryo;
    }

    public Class getType() {
        return this.type;
    }

    public void log(String str, CachedField cachedField, int i10) {
        String simpleName;
        if (cachedField instanceof v) {
            v vVar = (v) cachedField;
            Class<?> clsB = vVar.b();
            if (clsB == null) {
                clsB = cachedField.field.getType();
            }
            simpleName = Util.simpleName(clsB, vVar.f40051b);
        } else {
            Class cls = cachedField.valueClass;
            simpleName = cls != null ? cls.getSimpleName() : cachedField.field.getType().getSimpleName();
        }
        Log.trace("kryo", str + " field " + simpleName + ": " + cachedField.name + " (" + Util.className(cachedField.field.getDeclaringClass()) + RootService.CLOSE_BRACKET + Util.pos(i10));
    }

    public void popTypeVariables(int i10) {
        Generics generics = this.kryo.getGenerics();
        if (i10 > 0) {
            generics.popTypeVariables(i10);
        }
        generics.popGenericType();
    }

    public int pushTypeVariables() {
        Generics.GenericType[] genericTypeArrNextGenericTypes = this.kryo.getGenerics().nextGenericTypes();
        if (genericTypeArrNextGenericTypes == null) {
            return 0;
        }
        int iPushTypeVariables = this.kryo.getGenerics().pushTypeVariables(this.genericsHierarchy, genericTypeArrNextGenericTypes);
        if (Log.TRACE && iPushTypeVariables > 0) {
            Log.trace("kryo", "Generics: " + this.kryo.getGenerics());
        }
        return iPushTypeVariables;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public T read(Kryo kryo, Input input, Class<? extends T> cls) {
        int iPushTypeVariables = pushTypeVariables();
        T tCreate = create(kryo, input, cls);
        kryo.reference(tCreate);
        CachedField[] cachedFieldArr = this.cachedFields.f40042q0;
        int length = cachedFieldArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (Log.TRACE) {
                log("Read", cachedFieldArr[i10], input.position());
            }
            cachedFieldArr[i10].read(input, tCreate);
        }
        popTypeVariables(iPushTypeVariables);
        return tCreate;
    }

    public void removeField(String str) {
        ArrayList<Field> arrayList;
        boolean z10;
        b bVar = this.cachedFields;
        int i10 = 0;
        while (true) {
            CachedField[] cachedFieldArr = bVar.f40042q0;
            int length = cachedFieldArr.length;
            arrayList = bVar.f40044s0;
            if (i10 >= length) {
                z10 = false;
                break;
            }
            CachedField cachedField = cachedFieldArr[i10];
            if (cachedField.name.equals(str)) {
                CachedField[] cachedFieldArr2 = bVar.f40042q0;
                int length2 = cachedFieldArr2.length - 1;
                CachedField[] cachedFieldArr3 = new CachedField[length2];
                System.arraycopy(cachedFieldArr2, 0, cachedFieldArr3, 0, i10);
                System.arraycopy(bVar.f40042q0, i10 + 1, cachedFieldArr3, i10, length2 - i10);
                bVar.f40042q0 = cachedFieldArr3;
                arrayList.add(cachedField.field);
                z10 = true;
                break;
            }
            i10++;
        }
        int i11 = 0;
        while (true) {
            CachedField[] cachedFieldArr4 = bVar.f40043r0;
            if (i11 >= cachedFieldArr4.length) {
                if (z10) {
                    return;
                }
                StringBuilder sbD = ci.a.d("Field \"", str, "\" not found on class: ");
                sbD.append(bVar.f40041p0.type.getName());
                throw new IllegalArgumentException(sbD.toString());
            }
            CachedField cachedField2 = cachedFieldArr4[i11];
            if (cachedField2.name.equals(str)) {
                CachedField[] cachedFieldArr5 = bVar.f40043r0;
                int length3 = cachedFieldArr5.length - 1;
                CachedField[] cachedFieldArr6 = new CachedField[length3];
                System.arraycopy(cachedFieldArr5, 0, cachedFieldArr6, 0, i11);
                System.arraycopy(bVar.f40043r0, i11 + 1, cachedFieldArr6, i11, length3 - i11);
                bVar.f40043r0 = cachedFieldArr6;
                arrayList.add(cachedField2.field);
                return;
            }
            i11++;
        }
    }

    public void updateFields() {
        if (Log.TRACE) {
            Log.trace("kryo", "Update fields: " + Util.className(this.type));
        }
        this.cachedFields.b();
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, T t10) {
        int iPushTypeVariables = pushTypeVariables();
        CachedField[] cachedFieldArr = this.cachedFields.f40042q0;
        int length = cachedFieldArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (Log.TRACE) {
                log("Write", cachedFieldArr[i10], output.position());
            }
            cachedFieldArr[i10].write(output, t10);
        }
        popTypeVariables(iPushTypeVariables);
    }

    public FieldSerializer(Kryo kryo, Class cls, FieldSerializerConfig fieldSerializerConfig) {
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        }
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.q.c("type cannot be a primitive class: ", cls));
        }
        if (fieldSerializerConfig == null) {
            throw new IllegalArgumentException("config cannot be null.");
        }
        this.kryo = kryo;
        this.type = cls;
        this.config = fieldSerializerConfig;
        this.genericsHierarchy = new Generics.GenericsHierarchy(cls);
        b bVar = new b(this);
        this.cachedFields = bVar;
        bVar.b();
    }

    public void initializeCachedFields() {
    }

    public void removeField(CachedField cachedField) {
        ArrayList<Field> arrayList;
        boolean z10;
        b bVar = this.cachedFields;
        int i10 = 0;
        while (true) {
            CachedField[] cachedFieldArr = bVar.f40042q0;
            int length = cachedFieldArr.length;
            arrayList = bVar.f40044s0;
            if (i10 >= length) {
                z10 = false;
                break;
            }
            CachedField cachedField2 = cachedFieldArr[i10];
            if (cachedField2 == cachedField) {
                int length2 = cachedFieldArr.length - 1;
                CachedField[] cachedFieldArr2 = new CachedField[length2];
                System.arraycopy(cachedFieldArr, 0, cachedFieldArr2, 0, i10);
                System.arraycopy(bVar.f40042q0, i10 + 1, cachedFieldArr2, i10, length2 - i10);
                bVar.f40042q0 = cachedFieldArr2;
                arrayList.add(cachedField2.field);
                z10 = true;
                break;
            }
            i10++;
        }
        int i11 = 0;
        while (true) {
            CachedField[] cachedFieldArr3 = bVar.f40043r0;
            if (i11 >= cachedFieldArr3.length) {
                if (z10) {
                    return;
                }
                throw new IllegalArgumentException("Field \"" + cachedField + "\" not found on class: " + bVar.f40041p0.type.getName());
            }
            CachedField cachedField3 = cachedFieldArr3[i11];
            if (cachedField3 == cachedField) {
                int length3 = cachedFieldArr3.length - 1;
                CachedField[] cachedFieldArr4 = new CachedField[length3];
                System.arraycopy(cachedFieldArr3, 0, cachedFieldArr4, 0, i11);
                System.arraycopy(bVar.f40043r0, i11 + 1, cachedFieldArr4, i11, length3 - i11);
                bVar.f40043r0 = cachedFieldArr4;
                arrayList.add(cachedField3.field);
                return;
            }
            i11++;
        }
    }
}
