package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.KryoException;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.minlog.Log;
import com.esotericsoftware.reflectasm.MethodAccess;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes9.dex */
public class BeanSerializer<T> extends Serializer<T> {
    static final Object[] noArgs = new Object[0];
    Object access;
    private b[] properties;

    public class a implements Comparator<PropertyDescriptor> {
        public static int a(PropertyDescriptor propertyDescriptor, PropertyDescriptor propertyDescriptor2) {
            return propertyDescriptor.getName().compareTo(propertyDescriptor2.getName());
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(PropertyDescriptor propertyDescriptor, PropertyDescriptor propertyDescriptor2) {
            return a(propertyDescriptor, propertyDescriptor2);
        }
    }

    public class b<X> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f40028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Method f40029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Method f40030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Class f40031d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Serializer f40032e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f40033f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f40034g;

        public b() {
        }

        public final void a(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
            Object obj3 = BeanSerializer.this.access;
            if (obj3 != null) {
                ((MethodAccess) obj3).invoke(obj, this.f40034g, obj2);
            } else {
                this.f40030c.invoke(obj, obj2);
            }
        }

        public final String toString() {
            return this.f40028a;
        }
    }

    public BeanSerializer(Kryo kryo, Class cls) {
        try {
            PropertyDescriptor[] propertyDescriptors = Introspector.getBeanInfo(cls).getPropertyDescriptors();
            Arrays.sort(propertyDescriptors, new a());
            ArrayList arrayList = new ArrayList(propertyDescriptors.length);
            for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                String name = propertyDescriptor.getName();
                if (!name.equals(Name.LABEL)) {
                    Method readMethod = propertyDescriptor.getReadMethod();
                    Method writeMethod = propertyDescriptor.getWriteMethod();
                    if (readMethod != null && writeMethod != null) {
                        Class<?> returnType = readMethod.getReturnType();
                        Serializer serializer = kryo.isFinal(returnType) ? kryo.getRegistration(returnType).getSerializer() : null;
                        b bVar = new b();
                        bVar.f40028a = name;
                        bVar.f40029b = readMethod;
                        bVar.f40030c = writeMethod;
                        bVar.f40032e = serializer;
                        bVar.f40031d = writeMethod.getParameterTypes()[0];
                        arrayList.add(bVar);
                    }
                }
            }
            this.properties = (b[]) arrayList.toArray(new b[arrayList.size()]);
            try {
                this.access = MethodAccess.get(cls);
                int length = this.properties.length;
                for (int i10 = 0; i10 < length; i10++) {
                    b bVar2 = this.properties[i10];
                    bVar2.f40033f = ((MethodAccess) this.access).getIndex(bVar2.f40029b.getName(), bVar2.f40029b.getParameterTypes());
                    bVar2.f40034g = ((MethodAccess) this.access).getIndex(bVar2.f40030c.getName(), bVar2.f40030c.getParameterTypes());
                }
            } catch (Throwable unused) {
            }
        } catch (IntrospectionException e5) {
            throw new KryoException("Error getting bean info.", e5);
        }
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public T copy(Kryo kryo, T t10) {
        T t11 = (T) kryo.newInstance(t10.getClass());
        int length = this.properties.length;
        for (int i10 = 0; i10 < length; i10++) {
            b bVar = this.properties[i10];
            try {
                Object obj = BeanSerializer.this.access;
                bVar.a(t11, obj != null ? ((MethodAccess) obj).invoke(t10, bVar.f40033f, new Object[0]) : bVar.f40029b.invoke(t10, noArgs));
            } catch (KryoException e5) {
                e5.addTrace(bVar + " (" + t11.getClass().getName() + ")");
                throw e5;
            } catch (Exception e7) {
                throw new KryoException("Error copying bean property: " + bVar + " (" + t11.getClass().getName() + ")", e7);
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                kryoException.addTrace(bVar + " (" + t11.getClass().getName() + ")");
                throw kryoException;
            }
        }
        return t11;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public T read(Kryo kryo, Input input, Class<? extends T> cls) {
        T t10 = (T) kryo.newInstance(cls);
        kryo.reference(t10);
        int length = this.properties.length;
        for (int i10 = 0; i10 < length; i10++) {
            b bVar = this.properties[i10];
            try {
                if (Log.TRACE) {
                    Log.trace("kryo", "Read property: " + bVar + " (" + t10.getClass() + ")");
                }
                Serializer serializer = bVar.f40032e;
                bVar.a(t10, serializer != null ? kryo.readObjectOrNull(input, bVar.f40031d, serializer) : kryo.readClassAndObject(input));
            } catch (KryoException e5) {
                e5.addTrace(bVar + " (" + t10.getClass().getName() + ")");
                throw e5;
            } catch (IllegalAccessException e7) {
                throw new KryoException("Error accessing setter method: " + bVar + " (" + t10.getClass().getName() + ")", e7);
            } catch (InvocationTargetException e10) {
                throw new KryoException("Error invoking setter method: " + bVar + " (" + t10.getClass().getName() + ")", e10);
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                kryoException.addTrace(bVar + " (" + t10.getClass().getName() + ")");
                throw kryoException;
            }
        }
        return t10;
    }

    @Override // com.esotericsoftware.kryo.Serializer
    public void write(Kryo kryo, Output output, T t10) {
        Class<?> cls = t10.getClass();
        int length = this.properties.length;
        for (int i10 = 0; i10 < length; i10++) {
            b bVar = this.properties[i10];
            try {
                if (Log.TRACE) {
                    Log.trace("kryo", "Write property: " + bVar + " (" + cls.getName() + ")");
                }
                Object obj = BeanSerializer.this.access;
                Object objInvoke = obj != null ? ((MethodAccess) obj).invoke(t10, bVar.f40033f, new Object[0]) : bVar.f40029b.invoke(t10, noArgs);
                Serializer serializer = bVar.f40032e;
                if (serializer != null) {
                    kryo.writeObjectOrNull(output, objInvoke, serializer);
                } else {
                    kryo.writeClassAndObject(output, objInvoke);
                }
            } catch (KryoException e5) {
                e5.addTrace(bVar + " (" + cls.getName() + ")");
                throw e5;
            } catch (IllegalAccessException e7) {
                StringBuilder sb2 = new StringBuilder("Error accessing getter method: ");
                sb2.append(bVar);
                sb2.append(" (");
                throw new KryoException(androidx.datastore.preferences.protobuf.e.e(cls, sb2, ")"), e7);
            } catch (InvocationTargetException e10) {
                StringBuilder sb3 = new StringBuilder("Error invoking getter method: ");
                sb3.append(bVar);
                sb3.append(" (");
                throw new KryoException(androidx.datastore.preferences.protobuf.e.e(cls, sb3, ")"), e10);
            } catch (Throwable th2) {
                KryoException kryoException = new KryoException(th2);
                kryoException.addTrace(bVar + " (" + cls.getName() + ")");
                throw kryoException;
            }
        }
    }
}
