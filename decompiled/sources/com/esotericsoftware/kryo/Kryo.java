package com.esotericsoftware.kryo;

import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.o1;
import androidx.camera.core.processing.f;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.serializers.ClosureSerializer;
import com.esotericsoftware.kryo.serializers.CollectionSerializer;
import com.esotericsoftware.kryo.serializers.DefaultArraySerializers;
import com.esotericsoftware.kryo.serializers.DefaultSerializers;
import com.esotericsoftware.kryo.serializers.ImmutableCollectionsSerializers;
import com.esotericsoftware.kryo.serializers.MapSerializer;
import com.esotericsoftware.kryo.serializers.OptionalSerializers;
import com.esotericsoftware.kryo.serializers.RecordSerializer;
import com.esotericsoftware.kryo.serializers.TimeSerializers;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import com.esotericsoftware.kryo.util.DefaultGenerics;
import com.esotericsoftware.kryo.util.DefaultInstantiatorStrategy;
import com.esotericsoftware.kryo.util.Generics;
import com.esotericsoftware.kryo.util.IdentityMap;
import com.esotericsoftware.kryo.util.IntArray;
import com.esotericsoftware.kryo.util.MapReferenceResolver;
import com.esotericsoftware.kryo.util.NoGenerics;
import com.esotericsoftware.kryo.util.ObjectMap;
import com.esotericsoftware.kryo.util.Util;
import com.esotericsoftware.minlog.Log;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Currency;
import java.util.Date;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;
import org.objenesis.instantiator.ObjectInstantiator;
import org.objenesis.strategy.InstantiatorStrategy;

/* JADX INFO: loaded from: classes9.dex */
public class Kryo {
    private static final int DEFAULT_SERIALIZER_SIZE = 68;
    public static final byte NOT_NULL = 1;
    private static final int NO_REF = -2;
    public static final byte NULL = 0;
    private static final int REF = -1;
    private boolean autoReset;
    private ClassLoader classLoader;
    private final ClassResolver classResolver;
    private ObjectMap context;
    private int copyDepth;
    private boolean copyReferences;
    private boolean copyShallow;
    private SerializerFactory defaultSerializer;
    private final ArrayList<a> defaultSerializers;
    private int depth;
    private Generics generics;
    private ObjectMap graphContext;
    private final int lowPriorityDefaultSerializerCount;
    private int maxDepth;
    private Object needsCopyReference;
    private int nextRegisterID;
    private IdentityMap originalToCopy;
    private Object readObject;
    private final IntArray readReferenceIds;
    private ReferenceResolver referenceResolver;
    private boolean references;
    private boolean registrationRequired;
    private InstantiatorStrategy strategy;
    private volatile Thread thread;
    private boolean warnUnregisteredClasses;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f40026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SerializerFactory f40027b;

        public a(Class cls, SerializerFactory serializerFactory) {
            this.f40026a = cls;
            this.f40027b = serializerFactory;
        }
    }

    public Kryo() {
        this(new DefaultClassResolver(), null);
    }

    private void beginObject() {
        if (Log.DEBUG) {
            if (this.depth == 0) {
                this.thread = Thread.currentThread();
            } else if (this.thread != Thread.currentThread()) {
                throw new ConcurrentModificationException("Kryo must not be accessed concurrently by multiple threads.");
            }
        }
        int i10 = this.depth;
        if (i10 != this.maxDepth) {
            this.depth = i10 + 1;
        } else {
            throw new KryoException("Max depth exceeded: " + this.depth);
        }
    }

    private int insertDefaultSerializer(Class cls, SerializerFactory serializerFactory) {
        int size = this.defaultSerializers.size() - this.lowPriorityDefaultSerializerCount;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (cls.isAssignableFrom(this.defaultSerializers.get(i11).f40026a)) {
                i10 = i11 + 1;
            }
        }
        this.defaultSerializers.add(i10, new a(cls, serializerFactory));
        return i10;
    }

    public void addDefaultSerializer(Class cls, Serializer serializer) {
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        }
        if (serializer == null) {
            throw new IllegalArgumentException("serializer cannot be null.");
        }
        insertDefaultSerializer(cls, new SerializerFactory.SingletonSerializerFactory(serializer));
    }

    public <T> T copy(T t10) {
        if (t10 == null) {
            return null;
        }
        if (this.copyShallow) {
            return t10;
        }
        this.copyDepth++;
        try {
            if (this.originalToCopy == null) {
                this.originalToCopy = new IdentityMap();
            }
            T t11 = (T) this.originalToCopy.get(t10);
            if (t11 != null) {
                return t11;
            }
            if (this.copyReferences) {
                this.needsCopyReference = t10;
            }
            T t12 = t10 instanceof KryoCopyable ? (T) ((KryoCopyable) t10).copy(this) : (T) getSerializer(t10.getClass()).copy(this, t10);
            if (this.needsCopyReference != null) {
                reference(t12);
            }
            if (Log.TRACE || (Log.DEBUG && this.copyDepth == 1)) {
                Util.log("Copy", t12, -1);
            }
            return t12;
        } finally {
            int i10 = this.copyDepth - 1;
            this.copyDepth = i10;
            if (i10 == 0) {
                reset();
            }
        }
    }

    public <T> T copyShallow(T t10) {
        if (t10 == null) {
            return null;
        }
        this.copyDepth++;
        this.copyShallow = true;
        try {
            if (this.originalToCopy == null) {
                this.originalToCopy = new IdentityMap();
            }
            T t11 = (T) this.originalToCopy.get(t10);
            if (t11 != null) {
                return t11;
            }
            if (this.copyReferences) {
                this.needsCopyReference = t10;
            }
            T t12 = t10 instanceof KryoCopyable ? (T) ((KryoCopyable) t10).copy(this) : (T) getSerializer(t10.getClass()).copy(this, t10);
            if (this.needsCopyReference != null) {
                reference(t12);
            }
            if (Log.TRACE || (Log.DEBUG && this.copyDepth == 1)) {
                Util.log("Shallow copy", t12, -1);
            }
            return t12;
        } finally {
            this.copyShallow = false;
            int i10 = this.copyDepth - 1;
            this.copyDepth = i10;
            if (i10 == 0) {
                reset();
            }
        }
    }

    public ClassLoader getClassLoader() {
        return this.classLoader;
    }

    public ClassResolver getClassResolver() {
        return this.classResolver;
    }

    public ObjectMap getContext() {
        if (this.context == null) {
            this.context = new ObjectMap();
        }
        return this.context;
    }

    public Serializer getDefaultSerializer(Class cls) {
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        }
        Serializer defaultSerializerForAnnotatedType = getDefaultSerializerForAnnotatedType(cls);
        if (defaultSerializerForAnnotatedType != null) {
            return defaultSerializerForAnnotatedType;
        }
        int size = this.defaultSerializers.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = this.defaultSerializers.get(i10);
            if (aVar.f40026a.isAssignableFrom(cls)) {
                SerializerFactory serializerFactory = aVar.f40027b;
                if (serializerFactory.isSupported(cls)) {
                    return serializerFactory.newSerializer(this, cls);
                }
            }
        }
        return newDefaultSerializer(cls);
    }

    public Serializer getDefaultSerializerForAnnotatedType(Class cls) {
        if (!cls.isAnnotationPresent(DefaultSerializer.class)) {
            return null;
        }
        DefaultSerializer defaultSerializer = (DefaultSerializer) cls.getAnnotation(DefaultSerializer.class);
        return Util.newFactory(defaultSerializer.serializerFactory(), defaultSerializer.value()).newSerializer(this, cls);
    }

    public int getDepth() {
        return this.depth;
    }

    public Generics getGenerics() {
        return this.generics;
    }

    public ObjectMap getGraphContext() {
        if (this.graphContext == null) {
            this.graphContext = new ObjectMap();
        }
        return this.graphContext;
    }

    public InstantiatorStrategy getInstantiatorStrategy() {
        return this.strategy;
    }

    public int getNextRegistrationId() {
        while (true) {
            int i10 = this.nextRegisterID;
            if (i10 == -2) {
                throw new KryoException("No registration IDs are available.");
            }
            if (this.classResolver.getRegistration(i10) == null) {
                return this.nextRegisterID;
            }
            this.nextRegisterID++;
        }
    }

    public IdentityMap getOriginalToCopyMap() {
        return this.originalToCopy;
    }

    public ReferenceResolver getReferenceResolver() {
        return this.referenceResolver;
    }

    public boolean getReferences() {
        return this.references;
    }

    public Registration getRegistration(Class cls) {
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        }
        Registration registration = this.classResolver.getRegistration(cls);
        if (registration != null) {
            return registration;
        }
        if (!Proxy.isProxyClass(cls)) {
            if (!cls.isEnum() && Enum.class.isAssignableFrom(cls) && cls != Enum.class) {
                while (true) {
                    cls = cls.getSuperclass();
                    if (cls == null) {
                        break;
                    }
                    if (cls.isEnum()) {
                        registration = this.classResolver.getRegistration(cls);
                        break;
                    }
                }
            } else if (EnumSet.class.isAssignableFrom(cls)) {
                registration = this.classResolver.getRegistration(EnumSet.class);
            } else if (isClosure(cls)) {
                registration = this.classResolver.getRegistration(ClosureSerializer.Closure.class);
            }
        } else {
            registration = getRegistration(InvocationHandler.class);
        }
        if (registration != null) {
            return registration;
        }
        if (this.registrationRequired) {
            throw new IllegalArgumentException(unregisteredClassMessage(cls));
        }
        if (Log.WARN && this.warnUnregisteredClasses) {
            Log.warn(unregisteredClassMessage(cls));
        }
        return this.classResolver.registerImplicit(cls);
    }

    public Serializer getSerializer(Class cls) {
        return getRegistration(cls).getSerializer();
    }

    public boolean getWarnUnregisteredClasses() {
        return this.warnUnregisteredClasses;
    }

    public boolean isClosure(Class cls) {
        if (cls != null) {
            return cls.getName().indexOf(47) >= 0;
        }
        throw new IllegalArgumentException("type cannot be null.");
    }

    public boolean isFinal(Class cls) {
        if (cls != null) {
            return cls.isArray() ? Modifier.isFinal(Util.getElementClass(cls).getModifiers()) : Modifier.isFinal(cls.getModifiers());
        }
        throw new IllegalArgumentException("type cannot be null.");
    }

    public boolean isRegistrationRequired() {
        return this.registrationRequired;
    }

    public Serializer newDefaultSerializer(Class cls) {
        return this.defaultSerializer.newSerializer(this, cls);
    }

    public <T> T newInstance(Class<T> cls) {
        Registration registration = getRegistration(cls);
        ObjectInstantiator instantiator = registration.getInstantiator();
        if (instantiator == null) {
            instantiator = newInstantiator(cls);
            registration.setInstantiator(instantiator);
        }
        return (T) instantiator.newInstance();
    }

    public ObjectInstantiator newInstantiator(Class cls) {
        return this.strategy.newInstantiatorOf(cls);
    }

    public Registration readClass(Input input) {
        if (input == null) {
            throw new IllegalArgumentException("input cannot be null.");
        }
        try {
            return this.classResolver.readClass(input);
        } finally {
            if (this.depth == 0 && this.autoReset) {
                reset();
            }
        }
    }

    public Object readClassAndObject(Input input) {
        Object obj;
        if (input == null) {
            throw new IllegalArgumentException("input cannot be null.");
        }
        beginObject();
        try {
            Registration registration = readClass(input);
            if (registration == null) {
                return null;
            }
            Class type = registration.getType();
            if (this.references) {
                int referenceOrNull = readReferenceOrNull(input, type, false);
                if (referenceOrNull == -1) {
                    return this.readObject;
                }
                obj = registration.getSerializer().read(this, input, type);
                if (referenceOrNull == this.readReferenceIds.size) {
                    reference(obj);
                }
            } else {
                obj = registration.getSerializer().read(this, input, type);
            }
            if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                Util.log("Read", obj, input.position());
            }
            return obj;
        } finally {
            int i10 = this.depth - 1;
            this.depth = i10;
            if (i10 == 0 && this.autoReset) {
                reset();
            }
        }
    }

    public <T> T readObject(Input input, Class<T> cls) {
        T t10;
        if (input == null) {
            throw new IllegalArgumentException("input cannot be null.");
        }
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        }
        beginObject();
        try {
            if (this.references) {
                int referenceOrNull = readReferenceOrNull(input, cls, false);
                if (referenceOrNull == -1) {
                    return (T) this.readObject;
                }
                t10 = (T) getRegistration(cls).getSerializer().read(this, input, cls);
                if (referenceOrNull == this.readReferenceIds.size) {
                    reference(t10);
                }
            } else {
                t10 = (T) getRegistration(cls).getSerializer().read(this, input, cls);
            }
            if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                Util.log("Read", t10, input.position());
            }
            return t10;
        } finally {
            int i10 = this.depth - 1;
            this.depth = i10;
            if (i10 == 0 && this.autoReset) {
                reset();
            }
        }
    }

    public <T> T readObjectOrNull(Input input, Class<T> cls) {
        T t10;
        if (input == null) {
            throw new IllegalArgumentException("input cannot be null.");
        }
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        }
        beginObject();
        try {
            if (this.references) {
                int referenceOrNull = readReferenceOrNull(input, cls, true);
                if (referenceOrNull == -1) {
                    return (T) this.readObject;
                }
                t10 = (T) getRegistration(cls).getSerializer().read(this, input, cls);
                if (referenceOrNull == this.readReferenceIds.size) {
                    reference(t10);
                }
            } else {
                Serializer serializer = getRegistration(cls).getSerializer();
                if (!serializer.getAcceptsNull() && input.readByte() == 0) {
                    if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                        Util.log("Read", null, input.position());
                    }
                    return null;
                }
                t10 = (T) serializer.read(this, input, cls);
            }
            if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                Util.log("Read", t10, input.position());
            }
            return t10;
        } finally {
            int i10 = this.depth - 1;
            this.depth = i10;
            if (i10 == 0 && this.autoReset) {
                reset();
            }
        }
    }

    public int readReferenceOrNull(Input input, Class cls, boolean z10) {
        int varInt;
        if (cls.isPrimitive()) {
            cls = Util.getWrapperClass(cls);
        }
        boolean zUseReferences = this.referenceResolver.useReferences(cls);
        if (z10) {
            varInt = input.readVarInt(true);
            if (varInt == 0) {
                if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                    Util.log("Read", null, input.position());
                }
                this.readObject = null;
                return -1;
            }
            if (!zUseReferences) {
                this.readReferenceIds.add(-2);
                return this.readReferenceIds.size;
            }
        } else {
            if (!zUseReferences) {
                this.readReferenceIds.add(-2);
                return this.readReferenceIds.size;
            }
            varInt = input.readVarInt(true);
        }
        if (varInt != 1) {
            int i10 = varInt - 2;
            this.readObject = this.referenceResolver.getReadObject(cls, i10);
            if (Log.DEBUG) {
                StringBuilder sbC = o1.c("Read reference ", i10, ": ");
                sbC.append(Util.string(this.readObject));
                sbC.append(Util.pos(input.position()));
                Log.debug("kryo", sbC.toString());
            }
            return -1;
        }
        if (Log.TRACE) {
            Log.trace("kryo", "Read: <not null>" + Util.pos(input.position()));
        }
        int iNextReadId = this.referenceResolver.nextReadId(cls);
        if (Log.TRACE) {
            StringBuilder sbC2 = o1.c("Read initial reference ", iNextReadId, ": ");
            sbC2.append(Util.className(cls));
            sbC2.append(Util.pos(input.position()));
            Log.trace("kryo", sbC2.toString());
        }
        this.readReferenceIds.add(iNextReadId);
        return this.readReferenceIds.size;
    }

    public void reference(Object obj) {
        int iPop;
        if (this.copyDepth <= 0) {
            if (!this.references || obj == null || (iPop = this.readReferenceIds.pop()) == -2) {
                return;
            }
            this.referenceResolver.setReadObject(iPop, obj);
            return;
        }
        Object obj2 = this.needsCopyReference;
        if (obj2 != null) {
            if (obj == null) {
                throw new IllegalArgumentException("object cannot be null.");
            }
            this.originalToCopy.put(obj2, obj);
            this.needsCopyReference = null;
        }
    }

    public Registration register(Class cls) {
        Registration registration = this.classResolver.getRegistration(cls);
        return registration != null ? registration : register(cls, getDefaultSerializer(cls));
    }

    public void reset() {
        this.depth = 0;
        ObjectMap objectMap = this.graphContext;
        if (objectMap != null) {
            objectMap.clear(2048);
        }
        this.classResolver.reset();
        if (this.references) {
            this.referenceResolver.reset();
            this.readObject = null;
        }
        this.copyDepth = 0;
        IdentityMap identityMap = this.originalToCopy;
        if (identityMap != null) {
            identityMap.clear(2048);
        }
        if (Log.TRACE) {
            Log.trace("kryo", "Object graph complete.");
        }
    }

    public void setAutoReset(boolean z10) {
        this.autoReset = z10;
    }

    public void setClassLoader(ClassLoader classLoader) {
        if (classLoader == null) {
            throw new IllegalArgumentException("classLoader cannot be null.");
        }
        this.classLoader = classLoader;
    }

    public void setCopyReferences(boolean z10) {
        this.copyReferences = z10;
    }

    public void setDefaultSerializer(SerializerFactory serializerFactory) {
        if (serializerFactory == null) {
            throw new IllegalArgumentException("serializer cannot be null.");
        }
        this.defaultSerializer = serializerFactory;
    }

    public void setInstantiatorStrategy(InstantiatorStrategy instantiatorStrategy) {
        this.strategy = instantiatorStrategy;
    }

    public void setMaxDepth(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxDepth must be > 0.");
        }
        this.maxDepth = i10;
    }

    public void setOptimizedGenerics(boolean z10) {
        this.generics = z10 ? new DefaultGenerics(this) : NoGenerics.INSTANCE;
    }

    public void setReferenceResolver(ReferenceResolver referenceResolver) {
        if (referenceResolver == null) {
            throw new IllegalArgumentException("referenceResolver cannot be null.");
        }
        this.references = true;
        this.referenceResolver = referenceResolver;
        if (Log.TRACE) {
            Log.trace("kryo", "Reference resolver: ".concat(referenceResolver.getClass().getName()));
        }
    }

    public boolean setReferences(boolean z10) {
        boolean z11 = this.references;
        if (z10 == z11) {
            return z10;
        }
        if (z11) {
            this.referenceResolver.reset();
            this.readObject = null;
        }
        this.references = z10;
        if (z10 && this.referenceResolver == null) {
            this.referenceResolver = new MapReferenceResolver();
        }
        if (Log.TRACE) {
            Log.trace("kryo", "References: " + z10);
        }
        return !z10;
    }

    public void setRegistrationRequired(boolean z10) {
        this.registrationRequired = z10;
        if (Log.TRACE) {
            Log.trace("kryo", "Registration required: " + z10);
        }
    }

    public void setWarnUnregisteredClasses(boolean z10) {
        this.warnUnregisteredClasses = z10;
        if (Log.TRACE) {
            Log.trace("kryo", "Warn unregistered classes: " + z10);
        }
    }

    public String unregisteredClassMessage(Class cls) {
        return "Class is not registered: " + Util.className(cls) + "\nNote: To register this class use: kryo.register(" + Util.canonicalName(cls) + ".class);";
    }

    public Registration writeClass(Output output, Class cls) {
        if (output == null) {
            throw new IllegalArgumentException("output cannot be null.");
        }
        try {
            return this.classResolver.writeClass(output, cls);
        } finally {
            if (this.depth == 0 && this.autoReset) {
                reset();
            }
        }
    }

    public void writeClassAndObject(Output output, Object obj) {
        if (output == null) {
            throw new IllegalArgumentException("output cannot be null.");
        }
        beginObject();
        try {
            if (obj == null) {
                writeClass(output, null);
                int i10 = this.depth - 1;
                this.depth = i10;
                if (i10 == 0 && this.autoReset) {
                    reset();
                    return;
                }
                return;
            }
            Registration registrationWriteClass = writeClass(output, obj.getClass());
            if (this.references && writeReferenceOrNull(output, obj, false)) {
                int i11 = this.depth - 1;
                this.depth = i11;
                if (i11 == 0 && this.autoReset) {
                    reset();
                    return;
                }
                return;
            }
            if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                Util.log("Write", obj, output.position());
            }
            registrationWriteClass.getSerializer().write(this, output, obj);
            int i12 = this.depth - 1;
            this.depth = i12;
            if (i12 == 0 && this.autoReset) {
                reset();
            }
        } catch (Throwable th2) {
            int i13 = this.depth - 1;
            this.depth = i13;
            if (i13 == 0 && this.autoReset) {
                reset();
            }
            throw th2;
        }
    }

    public void writeObject(Output output, Object obj) {
        int i10;
        boolean z10;
        if (output == null) {
            throw new IllegalArgumentException("output cannot be null.");
        }
        if (obj == null) {
            throw new IllegalArgumentException("object cannot be null.");
        }
        beginObject();
        try {
            if (this.references && writeReferenceOrNull(output, obj, false)) {
                if (i10 == 0) {
                    if (z10) {
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                Util.log("Write", obj, output.position());
            }
            getRegistration(obj.getClass()).getSerializer().write(this, output, obj);
        } finally {
            i10 = this.depth - 1;
            this.depth = i10;
            if (i10 == 0 && this.autoReset) {
                reset();
            }
        }
    }

    public void writeObjectOrNull(Output output, Object obj, Class cls) {
        int i10;
        boolean z10;
        if (output == null) {
            throw new IllegalArgumentException("output cannot be null.");
        }
        beginObject();
        try {
            Serializer serializer = getRegistration(cls).getSerializer();
            if (this.references) {
                if (writeReferenceOrNull(output, obj, true)) {
                    if (i10 == 0) {
                        if (z10) {
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
            } else if (!serializer.getAcceptsNull()) {
                if (obj == null) {
                    if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                        Util.log("Write", obj, output.position());
                    }
                    output.writeByte((byte) 0);
                    if (i10 == 0) {
                        if (z10) {
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                if (Log.TRACE) {
                    Log.trace("kryo", "Write: <not null>" + Util.pos(output.position()));
                }
                output.writeByte((byte) 1);
            }
            if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                Util.log("Write", obj, output.position());
            }
            serializer.write(this, output, obj);
        } finally {
            i10 = this.depth - 1;
            this.depth = i10;
            if (i10 == 0 && this.autoReset) {
                reset();
            }
        }
    }

    public boolean writeReferenceOrNull(Output output, Object obj, boolean z10) {
        if (obj == null) {
            if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                Util.log("Write", null, output.position());
            }
            output.writeByte((byte) 0);
            return true;
        }
        if (!this.referenceResolver.useReferences(obj.getClass())) {
            if (z10) {
                if (Log.TRACE) {
                    Log.trace("kryo", "Write: <not null>" + Util.pos(output.position()));
                }
                output.writeByte((byte) 1);
            }
            return false;
        }
        int writtenId = this.referenceResolver.getWrittenId(obj);
        if (writtenId != -1) {
            if (Log.DEBUG) {
                StringBuilder sbC = o1.c("Write reference ", writtenId, ": ");
                sbC.append(Util.string(obj));
                sbC.append(Util.pos(output.position()));
                Log.debug("kryo", sbC.toString());
            }
            output.writeVarInt(writtenId + 2, true);
            return true;
        }
        int iAddWrittenObject = this.referenceResolver.addWrittenObject(obj);
        if (Log.TRACE) {
            Log.trace("kryo", "Write: <not null>" + Util.pos(output.position()));
        }
        output.writeByte((byte) 1);
        if (Log.TRACE) {
            StringBuilder sbC2 = o1.c("Write initial reference ", iAddWrittenObject, ": ");
            sbC2.append(Util.string(obj));
            sbC2.append(Util.pos(output.position()));
            Log.trace("kryo", sbC2.toString());
        }
        return false;
    }

    public Kryo(ReferenceResolver referenceResolver) {
        this(new DefaultClassResolver(), referenceResolver);
    }

    public Kryo(ClassResolver classResolver, ReferenceResolver referenceResolver) {
        this.defaultSerializer = new SerializerFactory.FieldSerializerFactory();
        ArrayList<a> arrayList = new ArrayList<>(68);
        this.defaultSerializers = arrayList;
        this.classLoader = getClass().getClassLoader();
        this.strategy = new DefaultInstantiatorStrategy();
        this.registrationRequired = true;
        this.maxDepth = Integer.MAX_VALUE;
        this.autoReset = true;
        this.readReferenceIds = new IntArray(0);
        this.copyReferences = true;
        this.generics = new DefaultGenerics(this);
        if (classResolver != null) {
            this.classResolver = classResolver;
            classResolver.setKryo(this);
            this.referenceResolver = referenceResolver;
            if (referenceResolver != null) {
                referenceResolver.setKryo(this);
                this.references = true;
            }
            addDefaultSerializer(byte[].class, DefaultArraySerializers.ByteArraySerializer.class);
            addDefaultSerializer(char[].class, DefaultArraySerializers.CharArraySerializer.class);
            addDefaultSerializer(short[].class, DefaultArraySerializers.ShortArraySerializer.class);
            addDefaultSerializer(int[].class, DefaultArraySerializers.IntArraySerializer.class);
            addDefaultSerializer(long[].class, DefaultArraySerializers.LongArraySerializer.class);
            addDefaultSerializer(float[].class, DefaultArraySerializers.FloatArraySerializer.class);
            addDefaultSerializer(double[].class, DefaultArraySerializers.DoubleArraySerializer.class);
            addDefaultSerializer(boolean[].class, DefaultArraySerializers.BooleanArraySerializer.class);
            addDefaultSerializer(String[].class, DefaultArraySerializers.StringArraySerializer.class);
            addDefaultSerializer(Object[].class, DefaultArraySerializers.ObjectArraySerializer.class);
            addDefaultSerializer(BigInteger.class, DefaultSerializers.BigIntegerSerializer.class);
            addDefaultSerializer(BigDecimal.class, DefaultSerializers.BigDecimalSerializer.class);
            addDefaultSerializer(Class.class, DefaultSerializers.ClassSerializer.class);
            addDefaultSerializer(Date.class, DefaultSerializers.DateSerializer.class);
            addDefaultSerializer(Enum.class, DefaultSerializers.EnumSerializer.class);
            addDefaultSerializer(EnumSet.class, DefaultSerializers.EnumSetSerializer.class);
            addDefaultSerializer(Currency.class, DefaultSerializers.CurrencySerializer.class);
            addDefaultSerializer(StringBuffer.class, DefaultSerializers.StringBufferSerializer.class);
            addDefaultSerializer(StringBuilder.class, DefaultSerializers.StringBuilderSerializer.class);
            addDefaultSerializer(Collections.EMPTY_LIST.getClass(), DefaultSerializers.CollectionsEmptyListSerializer.class);
            addDefaultSerializer(Collections.EMPTY_MAP.getClass(), DefaultSerializers.CollectionsEmptyMapSerializer.class);
            addDefaultSerializer(Collections.EMPTY_SET.getClass(), DefaultSerializers.CollectionsEmptySetSerializer.class);
            addDefaultSerializer(Collections.singletonList(null).getClass(), DefaultSerializers.CollectionsSingletonListSerializer.class);
            addDefaultSerializer(Collections.singletonMap(null, null).getClass(), DefaultSerializers.CollectionsSingletonMapSerializer.class);
            addDefaultSerializer(Collections.singleton(null).getClass(), DefaultSerializers.CollectionsSingletonSetSerializer.class);
            addDefaultSerializer(TreeSet.class, DefaultSerializers.TreeSetSerializer.class);
            addDefaultSerializer(Collection.class, CollectionSerializer.class);
            addDefaultSerializer(ConcurrentSkipListMap.class, DefaultSerializers.ConcurrentSkipListMapSerializer.class);
            addDefaultSerializer(TreeMap.class, DefaultSerializers.TreeMapSerializer.class);
            addDefaultSerializer(Map.class, MapSerializer.class);
            addDefaultSerializer(TimeZone.class, DefaultSerializers.TimeZoneSerializer.class);
            addDefaultSerializer(Calendar.class, DefaultSerializers.CalendarSerializer.class);
            addDefaultSerializer(Locale.class, DefaultSerializers.LocaleSerializer.class);
            addDefaultSerializer(Charset.class, DefaultSerializers.CharsetSerializer.class);
            addDefaultSerializer(URL.class, DefaultSerializers.URLSerializer.class);
            addDefaultSerializer(Arrays.asList(new Object[0]).getClass(), DefaultSerializers.ArraysAsListSerializer.class);
            addDefaultSerializer(Void.TYPE, new DefaultSerializers.VoidSerializer());
            addDefaultSerializer(PriorityQueue.class, new DefaultSerializers.PriorityQueueSerializer());
            addDefaultSerializer(BitSet.class, new DefaultSerializers.BitSetSerializer());
            addDefaultSerializer(KryoSerializable.class, DefaultSerializers.KryoSerializableSerializer.class);
            OptionalSerializers.addDefaultSerializers(this);
            TimeSerializers.addDefaultSerializers(this);
            ImmutableCollectionsSerializers.addDefaultSerializers(this);
            if (Util.isClassAvailable("java.lang.Record")) {
                addDefaultSerializer("java.lang.Record", RecordSerializer.class);
            }
            this.lowPriorityDefaultSerializerCount = arrayList.size();
            register(Integer.TYPE, new DefaultSerializers.IntSerializer());
            register(String.class, new DefaultSerializers.StringSerializer());
            register(Float.TYPE, new DefaultSerializers.FloatSerializer());
            register(Boolean.TYPE, new DefaultSerializers.BooleanSerializer());
            register(Byte.TYPE, new DefaultSerializers.ByteSerializer());
            register(Character.TYPE, new DefaultSerializers.CharSerializer());
            register(Short.TYPE, new DefaultSerializers.ShortSerializer());
            register(Long.TYPE, new DefaultSerializers.LongSerializer());
            register(Double.TYPE, new DefaultSerializers.DoubleSerializer());
            return;
        }
        throw new IllegalArgumentException("classResolver cannot be null.");
    }

    public Registration register(Class cls, int i10) {
        Registration registration = this.classResolver.getRegistration(cls);
        return registration != null ? registration : register(cls, getDefaultSerializer(cls), i10);
    }

    public void setDefaultSerializer(Class<? extends Serializer> cls) {
        if (cls != null) {
            this.defaultSerializer = new SerializerFactory.ReflectionSerializerFactory(cls);
            return;
        }
        throw new IllegalArgumentException("serializer cannot be null.");
    }

    public void addDefaultSerializer(Class cls, SerializerFactory serializerFactory) {
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        }
        if (serializerFactory != null) {
            insertDefaultSerializer(cls, serializerFactory);
            return;
        }
        throw new IllegalArgumentException("serializerFactory cannot be null.");
    }

    public Registration register(Class cls, Serializer serializer) {
        Registration registration = this.classResolver.getRegistration(cls);
        if (registration != null) {
            registration.setSerializer(serializer);
            return registration;
        }
        return this.classResolver.register(new Registration(cls, serializer, getNextRegistrationId()));
    }

    private void addDefaultSerializer(String str, Class<? extends Serializer> cls) {
        try {
            addDefaultSerializer(Class.forName(str), cls);
        } catch (ClassNotFoundException unused) {
            throw new KryoException(f.d("default serializer cannot be added: ", str));
        }
    }

    public Registration register(Class cls, Serializer serializer, int i10) {
        if (i10 >= 0) {
            return register(new Registration(cls, serializer, i10));
        }
        throw new IllegalArgumentException(g0.c("id must be >= 0: ", i10));
    }

    public void writeObject(Output output, Object obj, Serializer serializer) {
        int i10;
        boolean z10;
        if (output == null) {
            throw new IllegalArgumentException("output cannot be null.");
        }
        if (obj == null) {
            throw new IllegalArgumentException("object cannot be null.");
        }
        if (serializer != null) {
            beginObject();
            try {
                if (this.references && writeReferenceOrNull(output, obj, false)) {
                    if (i10 == 0) {
                        if (z10) {
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                    Util.log("Write", obj, output.position());
                }
                serializer.write(this, output, obj);
                if (i10 == 0) {
                    if (z10) {
                        return;
                    } else {
                        return;
                    }
                }
                return;
            } finally {
                i10 = this.depth - 1;
                this.depth = i10;
                if (i10 == 0 && this.autoReset) {
                    reset();
                }
            }
        }
        throw new IllegalArgumentException("serializer cannot be null.");
    }

    public <T> T copy(T t10, Serializer serializer) {
        T t11;
        if (t10 == null) {
            return null;
        }
        if (this.copyShallow) {
            return t10;
        }
        this.copyDepth++;
        try {
            if (this.originalToCopy == null) {
                this.originalToCopy = new IdentityMap();
            }
            T t12 = (T) this.originalToCopy.get(t10);
            if (t12 != null) {
                return t12;
            }
            if (this.copyReferences) {
                this.needsCopyReference = t10;
            }
            if (t10 instanceof KryoCopyable) {
                t11 = (T) ((KryoCopyable) t10).copy(this);
            } else {
                t11 = (T) serializer.copy(this, t10);
            }
            if (this.needsCopyReference != null) {
                reference(t11);
            }
            if (Log.TRACE || (Log.DEBUG && this.copyDepth == 1)) {
                Util.log("Copy", t11, -1);
            }
            return t11;
        } finally {
            int i10 = this.copyDepth - 1;
            this.copyDepth = i10;
            if (i10 == 0) {
                reset();
            }
        }
    }

    public <T> T readObject(Input input, Class<T> cls, Serializer serializer) {
        T t10;
        if (input == null) {
            throw new IllegalArgumentException("input cannot be null.");
        }
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        }
        if (serializer != null) {
            beginObject();
            try {
                if (this.references) {
                    int referenceOrNull = readReferenceOrNull(input, cls, false);
                    if (referenceOrNull == -1) {
                        return (T) this.readObject;
                    }
                    t10 = (T) serializer.read(this, input, cls);
                    if (referenceOrNull == this.readReferenceIds.size) {
                        reference(t10);
                    }
                } else {
                    t10 = (T) serializer.read(this, input, cls);
                }
                if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                    Util.log("Read", t10, input.position());
                }
                return t10;
            } finally {
                int i10 = this.depth - 1;
                this.depth = i10;
                if (i10 == 0 && this.autoReset) {
                    reset();
                }
            }
        }
        throw new IllegalArgumentException("serializer cannot be null.");
    }

    public Registration getRegistration(int i10) {
        return this.classResolver.getRegistration(i10);
    }

    public void writeObjectOrNull(Output output, Object obj, Serializer serializer) {
        int i10;
        boolean z10;
        if (output == null) {
            throw new IllegalArgumentException("output cannot be null.");
        }
        if (serializer != null) {
            beginObject();
            try {
                if (this.references) {
                    if (writeReferenceOrNull(output, obj, true)) {
                        if (i10 == 0) {
                            if (z10) {
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                } else if (!serializer.getAcceptsNull()) {
                    if (obj == null) {
                        if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                            Util.log("Write", null, output.position());
                        }
                        output.writeByte((byte) 0);
                        if (i10 == 0) {
                            if (z10) {
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                    if (Log.TRACE) {
                        Log.trace("kryo", "Write: <not null>" + Util.pos(output.position()));
                    }
                    output.writeByte((byte) 1);
                }
                if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                    Util.log("Write", obj, output.position());
                }
                serializer.write(this, output, obj);
                if (i10 == 0) {
                    if (z10) {
                        return;
                    } else {
                        return;
                    }
                }
                return;
            } finally {
                i10 = this.depth - 1;
                this.depth = i10;
                if (i10 == 0 && this.autoReset) {
                    reset();
                }
            }
        }
        throw new IllegalArgumentException("serializer cannot be null.");
    }

    public <T> T copyShallow(T t10, Serializer serializer) {
        T t11;
        if (t10 == null) {
            return null;
        }
        this.copyDepth++;
        this.copyShallow = true;
        try {
            if (this.originalToCopy == null) {
                this.originalToCopy = new IdentityMap();
            }
            T t12 = (T) this.originalToCopy.get(t10);
            if (t12 != null) {
                return t12;
            }
            if (this.copyReferences) {
                this.needsCopyReference = t10;
            }
            if (t10 instanceof KryoCopyable) {
                t11 = (T) ((KryoCopyable) t10).copy(this);
            } else {
                t11 = (T) serializer.copy(this, t10);
            }
            if (this.needsCopyReference != null) {
                reference(t11);
            }
            if (Log.TRACE || (Log.DEBUG && this.copyDepth == 1)) {
                Util.log("Shallow copy", t11, -1);
            }
            return t11;
        } finally {
            this.copyShallow = false;
            int i10 = this.copyDepth - 1;
            this.copyDepth = i10;
            if (i10 == 0) {
                reset();
            }
        }
    }

    public <T> T readObjectOrNull(Input input, Class<T> cls, Serializer serializer) {
        T t10;
        if (input == null) {
            throw new IllegalArgumentException("input cannot be null.");
        }
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        }
        if (serializer != null) {
            beginObject();
            try {
                if (this.references) {
                    int referenceOrNull = readReferenceOrNull(input, cls, true);
                    if (referenceOrNull == -1) {
                        return (T) this.readObject;
                    }
                    t10 = (T) serializer.read(this, input, cls);
                    if (referenceOrNull == this.readReferenceIds.size) {
                        reference(t10);
                    }
                } else {
                    if (!serializer.getAcceptsNull() && input.readByte() == 0) {
                        if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                            Util.log("Read", null, input.position());
                        }
                        return null;
                    }
                    t10 = (T) serializer.read(this, input, cls);
                }
                if (Log.TRACE || (Log.DEBUG && this.depth == 1)) {
                    Util.log("Read", t10, input.position());
                }
                return t10;
            } finally {
                int i10 = this.depth - 1;
                this.depth = i10;
                if (i10 == 0 && this.autoReset) {
                    reset();
                }
            }
        }
        throw new IllegalArgumentException("serializer cannot be null.");
    }

    public void addDefaultSerializer(Class cls, Class<? extends Serializer> cls2) {
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        }
        if (cls2 != null) {
            insertDefaultSerializer(cls, new SerializerFactory.ReflectionSerializerFactory(cls2));
            return;
        }
        throw new IllegalArgumentException("serializerClass cannot be null.");
    }

    public Registration register(Registration registration) {
        int id = registration.getId();
        if (id >= 0) {
            Registration registrationUnregister = this.classResolver.unregister(id);
            if (Log.DEBUG && registrationUnregister != null && registrationUnregister.getType() != registration.getType()) {
                Log.debug("kryo", "Registration overwritten: " + registrationUnregister + " -> " + registration);
            }
            return this.classResolver.register(registration);
        }
        throw new IllegalArgumentException(g0.c("id must be > 0: ", id));
    }
}
