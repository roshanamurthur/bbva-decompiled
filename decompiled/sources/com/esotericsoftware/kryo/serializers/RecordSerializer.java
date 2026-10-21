package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.minlog.Log;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
public class RecordSerializer<T> extends ImmutableSerializer<T> {
    private static final Method GET_NAME;
    private static final Method GET_RECORD_COMPONENTS;
    private static final Method GET_TYPE;
    private static final Method IS_RECORD;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f40037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<?> f40038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f40039c;

        public a(int i10, String str, Class cls) {
            this.f40037a = str;
            this.f40038b = cls;
            this.f40039c = i10;
        }
    }

    static {
        Method declaredMethod;
        Method method;
        Method method2;
        Method method3;
        try {
            Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
            declaredMethod = Class.class.getDeclaredMethod("isRecord", new Class[0]);
            method = Class.class.getMethod("getRecordComponents", new Class[0]);
            method3 = cls.getMethod("getName", new Class[0]);
            method2 = cls.getMethod("getType", new Class[0]);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            declaredMethod = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        IS_RECORD = declaredMethod;
        GET_RECORD_COMPONENTS = method;
        GET_NAME = method3;
        GET_TYPE = method2;
    }

    private static Object componentValue(Object obj, a aVar) {
        try {
            return obj.getClass().getDeclaredMethod(aVar.f40037a, new Class[0]).invoke(obj, new Object[0]);
        } catch (Throwable th2) {
            KryoException kryoException = new KryoException(th2);
            kryoException.addTrace("Could not retrieve record components (" + obj.getClass().getName() + ")");
            throw kryoException;
        }
    }

    private static <T> T invokeCanonicalConstructor(Class<T> cls, a[] aVarArr, Object[] objArr) {
        try {
            return cls.getConstructor((Class[]) Arrays.stream(aVarArr).map(new r(0)).toArray(new s())).newInstance(objArr);
        } catch (Throwable th2) {
            KryoException kryoException = new KryoException(th2);
            kryoException.addTrace("Could not construct type (" + cls.getName() + ")");
            throw kryoException;
        }
    }

    private boolean isRecord(Class<?> cls) {
        try {
            return ((Boolean) IS_RECORD.invoke(cls, new Object[0])).booleanValue();
        } catch (Throwable unused) {
            throw new KryoException("Could not determine type (" + cls + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Class[] lambda$invokeCanonicalConstructor$0(int i10) {
        return new Class[i10];
    }

    private static <T> a[] recordComponents(Class<T> cls, Comparator<a> comparator) {
        try {
            Object[] objArr = (Object[]) GET_RECORD_COMPONENTS.invoke(cls, new Object[0]);
            a[] aVarArr = new a[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                Object obj = objArr[i10];
                aVarArr[i10] = new a(i10, (String) GET_NAME.invoke(obj, new Object[0]), (Class) GET_TYPE.invoke(obj, new Object[0]));
            }
            if (comparator != null) {
                Arrays.sort(aVarArr, comparator);
            }
            return aVarArr;
        } catch (Throwable th2) {
            KryoException kryoException = new KryoException(th2);
            kryoException.addTrace("Could not retrieve record components (" + cls.getName() + ")");
            throw kryoException;
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public T read(Kryo kryo, Input input, Class<? extends T> cls) {
        if (!isRecord(cls)) {
            throw new KryoException("Not a record (" + cls + ")");
        }
        int i10 = 0;
        a[] aVarArrRecordComponents = recordComponents(cls, Comparator.comparing(new t(i10)));
        Object[] objArr = new Object[aVarArrRecordComponents.length];
        for (a aVar : aVarArrRecordComponents) {
            String str = aVar.f40037a;
            Class<?> cls2 = aVar.f40038b;
            try {
                if (Log.TRACE) {
                    Log.trace("kryo", "Read property: " + str + " (" + cls.getName() + ")");
                }
                objArr[aVar.f40039c] = cls2.isPrimitive() ? kryo.readObject(input, cls2) : kryo.readObjectOrNull(input, cls2);
            } catch (KryoException e5) {
                StringBuilder sbE = androidx.camera.core.processing.f.e(str, " (");
                sbE.append(cls.getName());
                sbE.append(")");
                e5.addTrace(sbE.toString());
                throw e5;
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                StringBuilder sbE2 = androidx.camera.core.processing.f.e(str, " (");
                sbE2.append(cls.getName());
                sbE2.append(")");
                kryoException.addTrace(sbE2.toString());
                throw kryoException;
            }
        }
        Arrays.sort(aVarArrRecordComponents, Comparator.comparing(new u(i10)));
        return (T) invokeCanonicalConstructor(cls, aVarArrRecordComponents, objArr);
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, T t10) {
        Class<?> cls = t10.getClass();
        if (!isRecord(cls)) {
            throw new KryoException(t10 + " is not a record");
        }
        int i10 = 0;
        a[] aVarArrRecordComponents = recordComponents(cls, Comparator.comparing(new q(i10)));
        int length = aVarArrRecordComponents.length;
        while (i10 < length) {
            a aVar = aVarArrRecordComponents[i10];
            Class<?> cls2 = aVar.f40038b;
            String str = aVar.f40037a;
            try {
                if (Log.TRACE) {
                    Log.trace("kryo", "Write property: " + str + " (" + cls2.getName() + ")");
                }
                if (aVar.f40038b.isPrimitive()) {
                    kryo.writeObject(output, componentValue(t10, aVar));
                } else {
                    kryo.writeObjectOrNull(output, componentValue(t10, aVar), cls2);
                }
                i10++;
            } catch (KryoException e5) {
                StringBuilder sbE = androidx.camera.core.processing.f.e(str, " (");
                sbE.append(cls2.getName());
                sbE.append(")");
                e5.addTrace(sbE.toString());
                throw e5;
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                StringBuilder sbE2 = androidx.camera.core.processing.f.e(str, " (");
                sbE2.append(cls2.getName());
                sbE2.append(")");
                kryoException.addTrace(sbE2.toString());
                throw kryoException;
            }
        }
    }
}
