package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected UnknownFieldSetLite unknownFields = UnknownFieldSetLite.getDefaultInstance();

    public static abstract class Builder<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite.Builder<MessageType, BuilderType> {
        protected MessageType instance;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MessageType f47086p0;

        public Builder(MessageType messagetype) {
            this.f47086p0 = messagetype;
            if (messagetype.j()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = (MessageType) messagetype.l();
        }

        public final void copyOnWrite() {
            if (this.instance.j()) {
                return;
            }
            copyOnWriteInternal();
        }

        public void copyOnWriteInternal() {
            MessageType messagetype = (MessageType) this.f47086p0.l();
            MessageType messagetype2 = this.instance;
            l0 l0Var = l0.f47234c;
            l0Var.getClass();
            l0Var.a(messagetype.getClass()).a(messagetype, messagetype2);
            this.instance = messagetype;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return GeneratedMessageLite.isInitialized(this.instance, false);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final MessageType build() {
            MessageType messagetype = (MessageType) buildPartial();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw AbstractMessageLite.Builder.newUninitializedMessageException(messagetype);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public MessageType buildPartial() {
            if (!this.instance.j()) {
                return this.instance;
            }
            this.instance.makeImmutable();
            return this.instance;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final BuilderType clear() {
            MessageType messagetype = this.f47086p0;
            if (messagetype.j()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.instance = (MessageType) messagetype.l();
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public MessageType getDefaultInstanceForType() {
            return this.f47086p0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        public BuilderType internalMergeFrom(MessageType messagetype) {
            return (BuilderType) mergeFrom((GeneratedMessageLite) messagetype);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public BuilderType mo5285clone() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.instance = (MessageType) buildPartial();
            return buildertype;
        }

        public BuilderType mergeFrom(MessageType messagetype) {
            if (getDefaultInstanceForType().equals(messagetype)) {
                return this;
            }
            copyOnWrite();
            MessageType messagetype2 = this.instance;
            l0 l0Var = l0.f47234c;
            l0Var.getClass();
            l0Var.a(messagetype2.getClass()).a(messagetype2, messagetype);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i10, int i11, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            copyOnWrite();
            try {
                l0.f47234c.b(this.instance).h(this.instance, bArr, i10, i10 + i11, new c.b(extensionRegistryLite));
                return this;
            } catch (InvalidProtocolBufferException e5) {
                throw e5;
            } catch (IOException e7) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e7);
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.h();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            return (BuilderType) mergeFrom(bArr, i10, i11, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            copyOnWrite();
            try {
                q0 q0VarB = l0.f47234c.b(this.instance);
                MessageType messagetype = this.instance;
                e eVar = codedInputStream.f46976d;
                if (eVar == null) {
                    eVar = new e(codedInputStream);
                }
                q0VarB.i(messagetype, eVar, extensionRegistryLite);
                return this;
            } catch (RuntimeException e5) {
                if (e5.getCause() instanceof IOException) {
                    throw ((IOException) e5.getCause());
                }
                throw e5;
            }
        }
    }

    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        public ExtendableBuilder(MessageType messagetype) {
            super(messagetype);
        }

        public final <Type> BuilderType addExtension(ExtensionLite<MessageType, List<Type>> extensionLite, Type type) {
            int i10 = GeneratedMessageLite.UNINITIALIZED_SERIALIZED_SIZE;
            extensionLite.getClass();
            GeneratedExtension<MessageType, ?> generatedExtension = (GeneratedExtension) extensionLite;
            c(generatedExtension);
            copyOnWrite();
            b().a(generatedExtension.f47094d, generatedExtension.b(type));
            return this;
        }

        public final FieldSet<b> b() {
            FieldSet<b> fieldSet = ((ExtendableMessage) this.instance).extensions;
            if (!fieldSet.f47079b) {
                return fieldSet;
            }
            FieldSet fieldSetB = fieldSet.clone();
            ((ExtendableMessage) this.instance).extensions = fieldSetB;
            return fieldSetB;
        }

        public final void c(GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public final BuilderType clearExtension(ExtensionLite<MessageType, ?> extensionLite) {
            int i10 = GeneratedMessageLite.UNINITIALIZED_SERIALIZED_SIZE;
            extensionLite.getClass();
            GeneratedExtension<MessageType, ?> generatedExtension = (GeneratedExtension) extensionLite;
            c(generatedExtension);
            copyOnWrite();
            FieldSet<b> fieldSetB = b();
            AbstractMap abstractMap = fieldSetB.f47078a;
            abstractMap.remove(generatedExtension.f47094d);
            if (abstractMap.isEmpty()) {
                fieldSetB.f47080c = false;
            }
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder
        public void copyOnWriteInternal() {
            super.copyOnWriteInternal();
            MessageType messagetype = this.instance;
            if (((ExtendableMessage) messagetype).extensions != FieldSet.f47077d) {
                ((ExtendableMessage) messagetype).extensions = ((ExtendableMessage) messagetype).extensions.clone();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(ExtensionLite<MessageType, Type> extensionLite) {
            return (Type) ((ExtendableMessage) this.instance).getExtension(extensionLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> extensionLite) {
            return ((ExtendableMessage) this.instance).getExtensionCount(extensionLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(ExtensionLite<MessageType, Type> extensionLite) {
            return ((ExtendableMessage) this.instance).hasExtension(extensionLite);
        }

        public final <Type> BuilderType setExtension(ExtensionLite<MessageType, Type> extensionLite, Type type) {
            int i10 = GeneratedMessageLite.UNINITIALIZED_SERIALIZED_SIZE;
            extensionLite.getClass();
            GeneratedExtension<MessageType, ?> generatedExtension = (GeneratedExtension) extensionLite;
            c(generatedExtension);
            copyOnWrite();
            FieldSet<b> fieldSetB = b();
            b bVar = generatedExtension.f47094d;
            if (!bVar.f47102s0) {
                type = (Type) generatedExtension.b(type);
            } else if (bVar.f47101r0.getJavaType() == WireFormat.JavaType.ENUM) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) type).iterator();
                while (it.hasNext()) {
                    arrayList.add(generatedExtension.b(it.next()));
                }
                type = (Type) arrayList;
            }
            fieldSetB.q(bVar, type);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i10) {
            return (Type) ((ExtendableMessage) this.instance).getExtension(extensionLite, i10);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.Builder, com.google.crypto.tink.shaded.protobuf.MessageLite.Builder
        public final MessageType buildPartial() {
            if (!((ExtendableMessage) this.instance).j()) {
                return (MessageType) this.instance;
            }
            ((ExtendableMessage) this.instance).extensions.n();
            return (MessageType) super.buildPartial();
        }

        public final <Type> BuilderType setExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i10, Type type) {
            int i11 = GeneratedMessageLite.UNINITIALIZED_SERIALIZED_SIZE;
            extensionLite.getClass();
            GeneratedExtension<MessageType, ?> generatedExtension = (GeneratedExtension) extensionLite;
            c(generatedExtension);
            copyOnWrite();
            FieldSet<b> fieldSetB = b();
            Object objB = generatedExtension.b(type);
            b bVar = generatedExtension.f47094d;
            if (bVar.f47102s0) {
                Object objF = fieldSetB.f(bVar);
                if (objF != null) {
                    FieldSet.r(bVar, objB);
                    ((List) objF).set(i10, objB);
                    return this;
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
    }

    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends MessageLiteOrBuilder {
        <Type> Type getExtension(ExtensionLite<MessageType, Type> extensionLite);

        <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i10);

        <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> extensionLite);

        <Type> boolean hasExtension(ExtensionLite<MessageType, Type> extensionLite);
    }

    public static class GeneratedExtension<ContainingType extends MessageLite, Type> extends ExtensionLite<ContainingType, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContainingType f47091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Type f47092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MessageLite f47093c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f47094d;

        /* JADX WARN: Multi-variable type inference failed */
        public GeneratedExtension(MessageLite messageLite, Object obj, MessageLite messageLite2, b bVar) {
            if (messageLite == 0) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (bVar.f47101r0 == WireFormat.FieldType.MESSAGE && messageLite2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f47091a = messageLite;
            this.f47092b = obj;
            this.f47093c = messageLite2;
            this.f47094d = bVar;
        }

        public final Object a(Object obj) {
            b bVar = this.f47094d;
            return bVar.f47101r0.getJavaType() == WireFormat.JavaType.ENUM ? bVar.f47099p0.findValueByNumber(((Integer) obj).intValue()) : obj;
        }

        public final Object b(Object obj) {
            return this.f47094d.f47101r0.getJavaType() == WireFormat.JavaType.ENUM ? Integer.valueOf(((Internal.EnumLite) obj).getNumber()) : obj;
        }

        public ContainingType getContainingTypeDefaultInstance() {
            return this.f47091a;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ExtensionLite
        public Type getDefaultValue() {
            return this.f47092b;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ExtensionLite
        public WireFormat.FieldType getLiteType() {
            return this.f47094d.f47101r0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ExtensionLite
        public MessageLite getMessageDefaultInstance() {
            return this.f47093c;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ExtensionLite
        public int getNumber() {
            return this.f47094d.f47100q0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.ExtensionLite
        public boolean isRepeated() {
            return this.f47094d.f47102s0;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MethodToInvoke {
        private static final /* synthetic */ MethodToInvoke[] $VALUES;
        public static final MethodToInvoke BUILD_MESSAGE_INFO;
        public static final MethodToInvoke GET_DEFAULT_INSTANCE;
        public static final MethodToInvoke GET_MEMOIZED_IS_INITIALIZED;
        public static final MethodToInvoke GET_PARSER;
        public static final MethodToInvoke NEW_BUILDER;
        public static final MethodToInvoke NEW_MUTABLE_INSTANCE;
        public static final MethodToInvoke SET_MEMOIZED_IS_INITIALIZED;

        static {
            MethodToInvoke methodToInvoke = new MethodToInvoke("GET_MEMOIZED_IS_INITIALIZED", 0);
            GET_MEMOIZED_IS_INITIALIZED = methodToInvoke;
            MethodToInvoke methodToInvoke2 = new MethodToInvoke("SET_MEMOIZED_IS_INITIALIZED", 1);
            SET_MEMOIZED_IS_INITIALIZED = methodToInvoke2;
            MethodToInvoke methodToInvoke3 = new MethodToInvoke("BUILD_MESSAGE_INFO", 2);
            BUILD_MESSAGE_INFO = methodToInvoke3;
            MethodToInvoke methodToInvoke4 = new MethodToInvoke("NEW_MUTABLE_INSTANCE", 3);
            NEW_MUTABLE_INSTANCE = methodToInvoke4;
            MethodToInvoke methodToInvoke5 = new MethodToInvoke("NEW_BUILDER", 4);
            NEW_BUILDER = methodToInvoke5;
            MethodToInvoke methodToInvoke6 = new MethodToInvoke("GET_DEFAULT_INSTANCE", 5);
            GET_DEFAULT_INSTANCE = methodToInvoke6;
            MethodToInvoke methodToInvoke7 = new MethodToInvoke("GET_PARSER", 6);
            GET_PARSER = methodToInvoke7;
            $VALUES = new MethodToInvoke[]{methodToInvoke, methodToInvoke2, methodToInvoke3, methodToInvoke4, methodToInvoke5, methodToInvoke6, methodToInvoke7};
        }

        public MethodToInvoke() {
            throw null;
        }

        public static MethodToInvoke valueOf(String str) {
            return (MethodToInvoke) java.lang.Enum.valueOf(MethodToInvoke.class, str);
        }

        public static MethodToInvoke[] values() {
            return (MethodToInvoke[]) $VALUES.clone();
        }
    }

    public static final class SerializedForm implements Serializable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Class<?> f47095p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final String f47096q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final byte[] f47097r0;

        public SerializedForm(MessageLite messageLite) {
            Class<?> cls = messageLite.getClass();
            this.f47095p0 = cls;
            this.f47096q0 = cls.getName();
            this.f47097r0 = messageLite.toByteArray();
        }

        public static SerializedForm of(MessageLite messageLite) {
            return new SerializedForm(messageLite);
        }

        public Object readResolve() throws ObjectStreamException {
            Class<?> cls;
            Class<?> cls2 = this.f47095p0;
            byte[] bArr = this.f47097r0;
            String str = this.f47096q0;
            if (cls2 != null) {
                cls = cls2;
            } else {
                try {
                    cls = Class.forName(str);
                } catch (InvalidProtocolBufferException e5) {
                    throw new RuntimeException("Unable to understand proto buffer", e5);
                } catch (ClassNotFoundException e7) {
                    throw new RuntimeException(androidx.camera.core.processing.f.d("Unable to find proto buffer class: ", str), e7);
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException("Unable to call parsePartialFrom", e10);
                } catch (NoSuchFieldException unused) {
                    if (cls2 == null) {
                        try {
                            cls2 = Class.forName(str);
                        } catch (InvalidProtocolBufferException e11) {
                            throw new RuntimeException("Unable to understand proto buffer", e11);
                        } catch (ClassNotFoundException e12) {
                            throw new RuntimeException(androidx.camera.core.processing.f.d("Unable to find proto buffer class: ", str), e12);
                        } catch (IllegalAccessException e13) {
                            throw new RuntimeException("Unable to call parsePartialFrom", e13);
                        } catch (NoSuchFieldException e14) {
                            throw new RuntimeException(androidx.camera.core.processing.f.d("Unable to find defaultInstance in ", str), e14);
                        } catch (SecurityException e15) {
                            throw new RuntimeException(androidx.camera.core.processing.f.d("Unable to call defaultInstance in ", str), e15);
                        }
                    }
                    java.lang.reflect.Field declaredField = cls2.getDeclaredField("defaultInstance");
                    declaredField.setAccessible(true);
                    return ((MessageLite) declaredField.get(null)).newBuilderForType().mergeFrom(bArr).buildPartial();
                } catch (SecurityException e16) {
                    throw new RuntimeException(androidx.camera.core.processing.f.d("Unable to call DEFAULT_INSTANCE in ", str), e16);
                }
            }
            java.lang.reflect.Field declaredField2 = cls.getDeclaredField("DEFAULT_INSTANCE");
            declaredField2.setAccessible(true);
            return ((MessageLite) declaredField2.get(null)).newBuilderForType().mergeFrom(bArr).buildPartial();
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47098a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f47098a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47098a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final class b implements FieldSet.FieldDescriptorLite<b> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Internal.EnumLiteMap<?> f47099p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f47100q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final WireFormat.FieldType f47101r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f47102s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f47103t0;

        public b(Internal.EnumLiteMap<?> enumLiteMap, int i10, WireFormat.FieldType fieldType, boolean z10, boolean z11) {
            this.f47099p0 = enumLiteMap;
            this.f47100q0 = i10;
            this.f47101r0 = fieldType;
            this.f47102s0 = z10;
            this.f47103t0 = z11;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f47100q0 - ((b) obj).f47100q0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public final Internal.EnumLiteMap<?> getEnumType() {
            return this.f47099p0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public final WireFormat.JavaType getLiteJavaType() {
            return this.f47101r0.getJavaType();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public final WireFormat.FieldType getLiteType() {
            return this.f47101r0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public final int getNumber() {
            return this.f47100q0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public final MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).mergeFrom((GeneratedMessageLite) messageLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public final boolean isPacked() {
            return this.f47103t0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.FieldSet.FieldDescriptorLite
        public final boolean isRepeated() {
            return this.f47102s0;
        }
    }

    public static void e(GeneratedMessageLite generatedMessageLite) throws InvalidProtocolBufferException {
        if (generatedMessageLite != null && !generatedMessageLite.isInitialized()) {
            throw new UninitializedMessageException(generatedMessageLite).asInvalidProtocolBufferException().setUnfinishedMessage(generatedMessageLite);
        }
    }

    public static Internal.BooleanList emptyBooleanList() {
        return d.f47187s0;
    }

    public static Internal.DoubleList emptyDoubleList() {
        return g.f47220s0;
    }

    public static Internal.FloatList emptyFloatList() {
        return l.f47231s0;
    }

    public static Internal.IntList emptyIntList() {
        return n.f47241s0;
    }

    public static Internal.LongList emptyLongList() {
        return v.f47300s0;
    }

    public static <E> Internal.ProtobufList<E> emptyProtobufList() {
        return m0.f47238s0;
    }

    public static <T extends GeneratedMessageLite<?, ?>> T h(Class<T> cls) {
        GeneratedMessageLite<?, ?> generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException("Class initialization cannot fail.", e5);
            }
        }
        if (generatedMessageLite == null) {
            generatedMessageLite = (T) ((GeneratedMessageLite) x0.c(cls)).getDefaultInstanceForType();
            if (generatedMessageLite == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, generatedMessageLite);
        }
        return (T) generatedMessageLite;
    }

    public static Object i(java.lang.reflect.Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e5);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T m(T t10, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            CodedInputStream codedInputStreamNewInstance = CodedInputStream.newInstance(new AbstractMessageLite.Builder.a(inputStream, CodedInputStream.readRawVarint32(i10, inputStream)));
            T t11 = (T) n(t10, codedInputStreamNewInstance, extensionRegistryLite);
            try {
                codedInputStreamNewInstance.checkLastTagWas(0);
                return t11;
            } catch (InvalidProtocolBufferException e5) {
                throw e5.setUnfinishedMessage(t11);
            }
        } catch (InvalidProtocolBufferException e7) {
            if (e7.f47121q0) {
                throw new InvalidProtocolBufferException((IOException) e7);
            }
            throw e7;
        } catch (IOException e10) {
            throw new InvalidProtocolBufferException(e10);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.crypto.tink.shaded.protobuf.Internal$IntList] */
    public static Internal.IntList mutableCopy(Internal.IntList intList) {
        int size = intList.size();
        return intList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T n(T t10, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t11 = (T) t10.l();
        try {
            q0 q0VarB = l0.f47234c.b(t11);
            e eVar = codedInputStream.f46976d;
            if (eVar == null) {
                eVar = new e(codedInputStream);
            }
            q0VarB.i(t11, eVar, extensionRegistryLite);
            q0VarB.b(t11);
            return t11;
        } catch (InvalidProtocolBufferException e5) {
            e = e5;
            if (e.f47121q0) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e.setUnfinishedMessage(t11);
        } catch (UninitializedMessageException e7) {
            throw e7.asInvalidProtocolBufferException().setUnfinishedMessage(t11);
        } catch (IOException e10) {
            if (e10.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e10.getCause());
            }
            throw new InvalidProtocolBufferException(e10).setUnfinishedMessage(t11);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e11.getCause());
            }
            throw e11;
        }
    }

    public static Object newMessageInfo(MessageLite messageLite, String str, Object[] objArr) {
        return new n0(messageLite, str, objArr);
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i10, WireFormat.FieldType fieldType, boolean z10, Class cls) {
        return new GeneratedExtension<>(containingtype, Collections.emptyList(), messageLite, new b(enumLiteMap, i10, fieldType, true, z10));
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i10, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension<>(containingtype, type, messageLite, new b(enumLiteMap, i10, fieldType, false, false));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T o(T t10, byte[] bArr, int i10, int i11, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t11 = (T) t10.l();
        try {
            q0 q0VarB = l0.f47234c.b(t11);
            q0VarB.h(t11, bArr, i10, i10 + i11, new c.b(extensionRegistryLite));
            q0VarB.b(t11);
            return t11;
        } catch (InvalidProtocolBufferException e5) {
            e = e5;
            if (e.f47121q0) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e.setUnfinishedMessage(t11);
        } catch (UninitializedMessageException e7) {
            throw e7.asInvalidProtocolBufferException().setUnfinishedMessage(t11);
        } catch (IOException e10) {
            if (e10.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e10.getCause());
            }
            throw new InvalidProtocolBufferException(e10).setUnfinishedMessage(t11);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.h().setUnfinishedMessage(t11);
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t10, InputStream inputStream) throws InvalidProtocolBufferException {
        T t11 = (T) m(t10, inputStream, ExtensionRegistryLite.getEmptyRegistry());
        e(t11);
        return t11;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t11 = (T) parseFrom(t10, CodedInputStream.newInstance(byteBuffer), extensionRegistryLite);
        e(t11);
        return t11;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t10, CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return (T) n(t10, codedInputStream, ExtensionRegistryLite.getEmptyRegistry());
    }

    public static <T extends GeneratedMessageLite<?, ?>> void registerDefaultInstance(Class<T> cls, T t10) {
        t10.k();
        defaultInstanceMap.put(cls, t10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite
    public final int a() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite
    public final int b(q0 q0Var) {
        int iD;
        int iD2;
        if (j()) {
            if (q0Var == null) {
                l0 l0Var = l0.f47234c;
                l0Var.getClass();
                iD2 = l0Var.a(getClass()).d(this);
            } else {
                iD2 = q0Var.d(this);
            }
            if (iD2 >= 0) {
                return iD2;
            }
            throw new IllegalStateException(androidx.appcompat.widget.g0.c("serialized size must be non-negative, was ", iD2));
        }
        if (a() != Integer.MAX_VALUE) {
            return a();
        }
        if (q0Var == null) {
            l0 l0Var2 = l0.f47234c;
            l0Var2.getClass();
            iD = l0Var2.a(getClass()).d(this);
        } else {
            iD = q0Var.d(this);
        }
        d(iD);
        return iD;
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite
    public final void d(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(androidx.appcompat.widget.g0.c("serialized size must be non-negative, was ", i10));
        }
        this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj) {
        return dynamicMethod(methodToInvoke, obj, null);
    }

    public abstract Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l0 l0Var = l0.f47234c;
        l0Var.getClass();
        return l0Var.a(getClass()).f(this, (GeneratedMessageLite) obj);
    }

    public final void f() {
        this.memoizedHashCode = 0;
    }

    public final void g() {
        d(Integer.MAX_VALUE);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public final Parser<MessageType> getParserForType() {
        return (Parser) dynamicMethod(MethodToInvoke.GET_PARSER);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public int getSerializedSize() {
        return b(null);
    }

    public int hashCode() {
        if (j()) {
            l0 l0Var = l0.f47234c;
            l0Var.getClass();
            return l0Var.a(getClass()).e(this);
        }
        if (this.memoizedHashCode == 0) {
            l0 l0Var2 = l0.f47234c;
            l0Var2.getClass();
            this.memoizedHashCode = l0Var2.a(getClass()).e(this);
        }
        return this.memoizedHashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public final boolean j() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void k() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final MessageType l() {
        return (MessageType) dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }

    public void makeImmutable() {
        l0 l0Var = l0.f47234c;
        l0Var.getClass();
        l0Var.a(getClass()).b(this);
        k();
    }

    public void mergeLengthDelimitedField(int i10, ByteString byteString) {
        if (this.unknownFields == UnknownFieldSetLite.getDefaultInstance()) {
            this.unknownFields = new UnknownFieldSetLite();
        }
        UnknownFieldSetLite unknownFieldSetLite = this.unknownFields;
        unknownFieldSetLite.a();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        unknownFieldSetLite.e((i10 << 3) | 2, byteString);
    }

    public final void mergeUnknownFields(UnknownFieldSetLite unknownFieldSetLite) {
        this.unknownFields = UnknownFieldSetLite.d(this.unknownFields, unknownFieldSetLite);
    }

    public void mergeVarintField(int i10, int i11) {
        if (this.unknownFields == UnknownFieldSetLite.getDefaultInstance()) {
            this.unknownFields = new UnknownFieldSetLite();
        }
        UnknownFieldSetLite unknownFieldSetLite = this.unknownFields;
        unknownFieldSetLite.a();
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        unknownFieldSetLite.e(i10 << 3, Long.valueOf(i11));
    }

    public boolean parseUnknownField(int i10, CodedInputStream codedInputStream) throws IOException {
        if (WireFormat.getTagWireType(i10) == 4) {
            return false;
        }
        if (this.unknownFields == UnknownFieldSetLite.getDefaultInstance()) {
            this.unknownFields = new UnknownFieldSetLite();
        }
        return this.unknownFields.c(i10, codedInputStream);
    }

    public String toString() {
        String string = super.toString();
        char[] cArr = c0.f47186a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        c0.c(this, sb2, 0);
        return sb2.toString();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        l0 l0Var = l0.f47234c;
        l0Var.getClass();
        q0 q0VarA = l0Var.a(getClass());
        f fVar = codedOutputStream.f47018a;
        if (fVar == null) {
            fVar = new f(codedOutputStream);
        }
        q0VarA.g(this, fVar);
    }

    public static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.dynamicMethod(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        l0 l0Var = l0.f47234c;
        l0Var.getClass();
        boolean zC = l0Var.a(t10.getClass()).c(t10);
        if (z10) {
            t10.dynamicMethod(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, zC ? t10 : null);
        }
        return zC;
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom((GeneratedMessageLite) messagetype);
    }

    public Object dynamicMethod(MethodToInvoke methodToInvoke) {
        return dynamicMethod(methodToInvoke, null, null);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLite
    public final BuilderType toBuilder() {
        return (BuilderType) ((Builder) dynamicMethod(MethodToInvoke.NEW_BUILDER)).mergeFrom(this);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.crypto.tink.shaded.protobuf.Internal$LongList] */
    public static Internal.LongList mutableCopy(Internal.LongList longList) {
        int size = longList.size();
        return longList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (T) parseFrom(t10, byteBuffer, ExtensionRegistryLite.getEmptyRegistry());
    }

    public static class DefaultInstanceBasedParser<T extends GeneratedMessageLite<T, ?>> extends AbstractParser<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f47087b;

        public DefaultInstanceBasedParser(T t10) {
            this.f47087b = t10;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractParser, com.google.crypto.tink.shaded.protobuf.Parser
        public T parsePartialFrom(byte[] bArr, int i10, int i11, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.o(this.f47087b, bArr, i10, i11, extensionRegistryLite);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Parser
        public T parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.n(this.f47087b, codedInputStream, extensionRegistryLite);
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t10, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t11 = (T) m(t10, inputStream, extensionRegistryLite);
        e(t11);
        return t11;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, ByteString byteString) throws InvalidProtocolBufferException {
        T t11 = (T) parseFrom(t10, byteString, ExtensionRegistryLite.getEmptyRegistry());
        e(t11);
        return t11;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.crypto.tink.shaded.protobuf.Internal$FloatList] */
    public static Internal.FloatList mutableCopy(Internal.FloatList floatList) {
        int size = floatList.size();
        return floatList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStreamNewCodedInput = byteString.newCodedInput();
        T t11 = (T) n(t10, codedInputStreamNewCodedInput, extensionRegistryLite);
        try {
            codedInputStreamNewCodedInput.checkLastTagWas(0);
            e(t11);
            return t11;
        } catch (InvalidProtocolBufferException e5) {
            throw e5.setUnfinishedMessage(t11);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.crypto.tink.shaded.protobuf.Internal$DoubleList] */
    public static Internal.DoubleList mutableCopy(Internal.DoubleList doubleList) {
        int size = doubleList.size();
        return doubleList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.crypto.tink.shaded.protobuf.Internal$BooleanList] */
    public static Internal.BooleanList mutableCopy(Internal.BooleanList booleanList) {
        int size = booleanList.size();
        return booleanList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    public static <E> Internal.ProtobufList<E> mutableCopy(Internal.ProtobufList<E> protobufList) {
        int size = protobufList.size();
        return protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, byte[] bArr) throws InvalidProtocolBufferException {
        T t11 = (T) o(t10, bArr, 0, bArr.length, ExtensionRegistryLite.getEmptyRegistry());
        e(t11);
        return t11;
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected FieldSet<b> extensions = FieldSet.f47077d;

        public class ExtensionWriter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator<Map.Entry<b, Object>> f47088a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Map.Entry<b, Object> f47089b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f47090c;

            public ExtensionWriter(ExtendableMessage extendableMessage, boolean z10) {
                Iterator itM = extendableMessage.extensions.m();
                this.f47088a = itM;
                if (itM.hasNext()) {
                    this.f47089b = (Map.Entry) itM.next();
                }
                this.f47090c = z10;
            }

            public void writeUntil(int i10, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<b, Object> entry = this.f47089b;
                    if (entry == null || entry.getKey().f47100q0 >= i10) {
                        return;
                    }
                    b key = this.f47089b.getKey();
                    if (this.f47090c && key.f47101r0.getJavaType() == WireFormat.JavaType.MESSAGE && !key.f47102s0) {
                        codedOutputStream.writeMessageSetExtension(key.f47100q0, (MessageLite) this.f47089b.getValue());
                    } else {
                        Object value = this.f47089b.getValue();
                        FieldSet fieldSet = FieldSet.f47077d;
                        WireFormat.FieldType liteType = key.getLiteType();
                        int number = key.getNumber();
                        if (key.isRepeated()) {
                            List list = (List) value;
                            if (key.isPacked()) {
                                codedOutputStream.writeTag(number, 2);
                                Iterator it = list.iterator();
                                int iD = 0;
                                while (it.hasNext()) {
                                    iD += FieldSet.d(liteType, it.next());
                                }
                                codedOutputStream.writeUInt32NoTag(iD);
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    FieldSet.t(codedOutputStream, liteType, it2.next());
                                }
                            } else {
                                Iterator it3 = list.iterator();
                                while (it3.hasNext()) {
                                    FieldSet.s(codedOutputStream, liteType, number, it3.next());
                                }
                            }
                        } else if (value instanceof LazyField) {
                            FieldSet.s(codedOutputStream, liteType, number, ((LazyField) value).getValue());
                        } else {
                            FieldSet.s(codedOutputStream, liteType, number, value);
                        }
                    }
                    Iterator<Map.Entry<b, Object>> it4 = this.f47088a;
                    if (it4.hasNext()) {
                        this.f47089b = it4.next();
                    } else {
                        this.f47089b = null;
                    }
                }
            }
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.k();
        }

        public int extensionsSerializedSize() {
            return this.extensions.i();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.g();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [Type, java.util.ArrayList] */
        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(ExtensionLite<MessageType, Type> extensionLite) {
            extensionLite.getClass();
            GeneratedExtension<MessageType, ?> generatedExtension = (GeneratedExtension) extensionLite;
            r(generatedExtension);
            FieldSet<b> fieldSet = this.extensions;
            b bVar = generatedExtension.f47094d;
            Type type = (Type) fieldSet.f(bVar);
            if (type == null) {
                return generatedExtension.f47092b;
            }
            if (!bVar.f47102s0) {
                return (Type) generatedExtension.a(type);
            }
            if (bVar.f47101r0.getJavaType() != WireFormat.JavaType.ENUM) {
                return type;
            }
            ?? r1 = (Type) new ArrayList();
            Iterator it = ((List) type).iterator();
            while (it.hasNext()) {
                r1.add(generatedExtension.a(it.next()));
            }
            return r1;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> extensionLite) {
            extensionLite.getClass();
            GeneratedExtension<MessageType, ?> generatedExtension = (GeneratedExtension) extensionLite;
            r(generatedExtension);
            FieldSet<b> fieldSet = this.extensions;
            fieldSet.getClass();
            b bVar = generatedExtension.f47094d;
            if (!bVar.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objF = fieldSet.f(bVar);
            if (objF == null) {
                return 0;
            }
            return ((List) objF).size();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(ExtensionLite<MessageType, Type> extensionLite) {
            extensionLite.getClass();
            GeneratedExtension<MessageType, ?> generatedExtension = (GeneratedExtension) extensionLite;
            r(generatedExtension);
            FieldSet<b> fieldSet = this.extensions;
            fieldSet.getClass();
            b bVar = generatedExtension.f47094d;
            if (bVar.isRepeated()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return fieldSet.f47078a.get(bVar) != null;
        }

        public final void mergeExtensionFields(MessageType messagetype) {
            FieldSet<b> fieldSet = this.extensions;
            if (fieldSet.f47079b) {
                this.extensions = fieldSet.clone();
            }
            this.extensions.o(messagetype.extensions);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
        public /* bridge */ /* synthetic */ MessageLite.Builder newBuilderForType() {
            return super.newBuilderForType();
        }

        public ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newExtensionWriter() {
            return new ExtensionWriter(this, false);
        }

        public ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newMessageSetExtensionWriter() {
            return new ExtensionWriter(this, true);
        }

        public final FieldSet<b> p() {
            FieldSet<b> fieldSet = this.extensions;
            if (fieldSet.f47079b) {
                this.extensions = fieldSet.clone();
            }
            return this.extensions;
        }

        public <MessageType extends MessageLite> boolean parseUnknownField(MessageType messagetype, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i10) throws IOException {
            int tagFieldNumber = WireFormat.getTagFieldNumber(i10);
            return q(codedInputStream, extensionRegistryLite, extensionRegistryLite.findLiteExtensionByNumber(messagetype, tagFieldNumber), i10, tagFieldNumber);
        }

        public <MessageType extends MessageLite> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i10) throws IOException {
            if (i10 != 11) {
                return WireFormat.getTagWireType(i10) == 2 ? parseUnknownField(messagetype, codedInputStream, extensionRegistryLite, i10) : codedInputStream.skipField(i10);
            }
            int uInt32 = 0;
            ByteString bytes = null;
            GeneratedExtension<?, ?> generatedExtensionFindLiteExtensionByNumber = null;
            while (true) {
                int tag = codedInputStream.readTag();
                if (tag == 0) {
                    break;
                }
                if (tag == 16) {
                    uInt32 = codedInputStream.readUInt32();
                    if (uInt32 != 0) {
                        generatedExtensionFindLiteExtensionByNumber = extensionRegistryLite.findLiteExtensionByNumber(messagetype, uInt32);
                    }
                } else if (tag == 26) {
                    if (uInt32 == 0 || generatedExtensionFindLiteExtensionByNumber == null) {
                        bytes = codedInputStream.readBytes();
                    } else {
                        q(codedInputStream, extensionRegistryLite, generatedExtensionFindLiteExtensionByNumber, (uInt32 << 3) | 2, uInt32);
                        bytes = null;
                    }
                } else if (!codedInputStream.skipField(tag)) {
                    break;
                }
            }
            codedInputStream.checkLastTagWas(12);
            if (bytes == null || uInt32 == 0) {
                return true;
            }
            if (generatedExtensionFindLiteExtensionByNumber == null) {
                mergeLengthDelimitedField(uInt32, bytes);
                return true;
            }
            FieldSet<b> fieldSet = this.extensions;
            b bVar = generatedExtensionFindLiteExtensionByNumber.f47094d;
            MessageLite messageLite = (MessageLite) fieldSet.f(bVar);
            MessageLite.Builder builder = messageLite != null ? messageLite.toBuilder() : null;
            if (builder == null) {
                builder = generatedExtensionFindLiteExtensionByNumber.getMessageDefaultInstance().newBuilderForType();
            }
            builder.mergeFrom(bytes, extensionRegistryLite);
            p().q(bVar, generatedExtensionFindLiteExtensionByNumber.b(builder.build()));
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0009  */
        public final boolean q(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, GeneratedExtension<?, ?> generatedExtension, int i10, int i11) throws IOException {
            boolean z10;
            Object objBuild;
            MessageLite messageLite;
            int tagWireType = WireFormat.getTagWireType(i10);
            boolean z11 = false;
            if (generatedExtension == null) {
                z10 = false;
                z11 = true;
            } else {
                b bVar = generatedExtension.f47094d;
                WireFormat.FieldType fieldType = bVar.f47101r0;
                FieldSet fieldSet = FieldSet.f47077d;
                if (tagWireType == fieldType.getWireType()) {
                    z10 = false;
                } else if (bVar.f47102s0 && bVar.f47101r0.isPackable() && tagWireType == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                    z11 = true;
                }
            }
            if (z11) {
                return parseUnknownField(i10, codedInputStream);
            }
            p();
            if (z10) {
                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                b bVar2 = generatedExtension.f47094d;
                if (bVar2.f47101r0 == WireFormat.FieldType.ENUM) {
                    while (codedInputStream.getBytesUntilLimit() > 0) {
                        Internal.EnumLite enumLiteFindValueByNumber = bVar2.f47099p0.findValueByNumber(codedInputStream.readEnum());
                        if (enumLiteFindValueByNumber == null) {
                            return true;
                        }
                        this.extensions.a(bVar2, generatedExtension.b(enumLiteFindValueByNumber));
                    }
                } else {
                    while (codedInputStream.getBytesUntilLimit() > 0) {
                        this.extensions.a(bVar2, WireFormat.a(codedInputStream, bVar2.f47101r0, WireFormat.b.LOOSE));
                    }
                }
                codedInputStream.popLimit(iPushLimit);
            } else {
                int i12 = a.f47098a[generatedExtension.f47094d.f47101r0.getJavaType().ordinal()];
                b bVar3 = generatedExtension.f47094d;
                if (i12 == 1) {
                    MessageLite.Builder builder = (bVar3.f47102s0 || (messageLite = (MessageLite) this.extensions.f(bVar3)) == null) ? null : messageLite.toBuilder();
                    if (builder == null) {
                        builder = generatedExtension.getMessageDefaultInstance().newBuilderForType();
                    }
                    if (bVar3.f47101r0 == WireFormat.FieldType.GROUP) {
                        codedInputStream.readGroup(generatedExtension.getNumber(), builder, extensionRegistryLite);
                    } else {
                        codedInputStream.readMessage(builder, extensionRegistryLite);
                    }
                    objBuild = builder.build();
                } else if (i12 != 2) {
                    objBuild = WireFormat.a(codedInputStream, bVar3.f47101r0, WireFormat.b.LOOSE);
                } else {
                    int i13 = codedInputStream.readEnum();
                    Internal.EnumLite enumLiteFindValueByNumber2 = bVar3.f47099p0.findValueByNumber(i13);
                    if (enumLiteFindValueByNumber2 == null) {
                        mergeVarintField(i11, i13);
                        return true;
                    }
                    objBuild = enumLiteFindValueByNumber2;
                }
                if (bVar3.f47102s0) {
                    this.extensions.a(bVar3, generatedExtension.b(objBuild));
                } else {
                    this.extensions.q(bVar3, generatedExtension.b(objBuild));
                }
            }
            return true;
        }

        public final void r(GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite, com.google.crypto.tink.shaded.protobuf.MessageLite
        public /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
            return super.toBuilder();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i10) {
            extensionLite.getClass();
            GeneratedExtension<MessageType, ?> generatedExtension = (GeneratedExtension) extensionLite;
            r(generatedExtension);
            FieldSet<b> fieldSet = this.extensions;
            fieldSet.getClass();
            b bVar = generatedExtension.f47094d;
            if (bVar.isRepeated()) {
                Object objF = fieldSet.f(bVar);
                if (objF != null) {
                    return (Type) generatedExtension.a(((List) objF).get(i10));
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t11 = (T) o(t10, bArr, 0, bArr.length, extensionRegistryLite);
        e(t11);
        return t11;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, InputStream inputStream) throws InvalidProtocolBufferException {
        T t11 = (T) n(t10, CodedInputStream.newInstance(inputStream), ExtensionRegistryLite.getEmptyRegistry());
        e(t11);
        return t11;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t11 = (T) n(t10, CodedInputStream.newInstance(inputStream), extensionRegistryLite);
        e(t11);
        return t11;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return (T) parseFrom(t10, codedInputStream, ExtensionRegistryLite.getEmptyRegistry());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t11 = (T) n(t10, codedInputStream, extensionRegistryLite);
        e(t11);
        return t11;
    }
}
