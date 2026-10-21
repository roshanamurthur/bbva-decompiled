package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder;
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

/* JADX INFO: loaded from: classes2.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final /* synthetic */ int f20922p0 = 0;
    protected UnknownFieldSetLite unknownFields = UnknownFieldSetLite.getDefaultInstance();
    protected int memoizedSerializedSize = -1;

    public static abstract class Builder<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite.Builder<MessageType, BuilderType> {
        protected MessageType instance;
        protected boolean isBuilt = false;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MessageType f20923p0;

        public Builder(MessageType messagetype) {
            this.f20923p0 = messagetype;
            this.instance = (MessageType) messagetype.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        public void copyOnWrite() {
            if (this.isBuilt) {
                MessageType messagetype = (MessageType) this.instance.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
                MessageType messagetype2 = this.instance;
                j0 j0Var = j0.f21070c;
                j0Var.getClass();
                j0Var.a(messagetype.getClass()).a(messagetype, messagetype2);
                this.instance = messagetype;
                this.isBuilt = false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return GeneratedMessageLite.isInitialized(this.instance, false);
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public final MessageType build() {
            MessageType messagetype = (MessageType) buildPartial();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw AbstractMessageLite.Builder.newUninitializedMessageException(messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public MessageType buildPartial() {
            if (this.isBuilt) {
                return this.instance;
            }
            this.instance.makeImmutable();
            this.isBuilt = true;
            return this.instance;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLite.Builder
        public final BuilderType clear() {
            this.instance = (MessageType) this.instance.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
        public MessageType getDefaultInstanceForType() {
            return this.f20923p0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        public BuilderType internalMergeFrom(MessageType messagetype) {
            return (BuilderType) mergeFrom((GeneratedMessageLite) messagetype);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
        public BuilderType mo4640clone() {
            Empty.Builder builder = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            builder.mergeFrom(buildPartial());
            return builder;
        }

        public BuilderType mergeFrom(MessageType messagetype) {
            copyOnWrite();
            MessageType messagetype2 = this.instance;
            j0 j0Var = j0.f21070c;
            j0Var.getClass();
            j0Var.a(messagetype2.getClass()).a(messagetype2, messagetype);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i10, int i11, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            copyOnWrite();
            try {
                j0 j0Var = j0.f21070c;
                MessageType messagetype = this.instance;
                j0Var.getClass();
                j0Var.a(messagetype.getClass()).i(this.instance, bArr, i10, i10 + i11, new c.b(extensionRegistryLite));
                return this;
            } catch (InvalidProtocolBufferException e5) {
                throw e5;
            } catch (IOException e7) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e7);
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.i();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            return (BuilderType) mergeFrom(bArr, i10, i11, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            copyOnWrite();
            try {
                j0 j0Var = j0.f21070c;
                MessageType messagetype = this.instance;
                j0Var.getClass();
                o0 o0VarA = j0Var.a(messagetype.getClass());
                MessageType messagetype2 = this.instance;
                g gVar = codedInputStream.f20812d;
                if (gVar == null) {
                    gVar = new g(codedInputStream);
                }
                o0VarA.g(messagetype2, gVar, extensionRegistryLite);
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
            int i10 = GeneratedMessageLite.f20922p0;
            extensionLite.getClass();
            GeneratedExtension<MessageType, ?> generatedExtension = (GeneratedExtension) extensionLite;
            c(generatedExtension);
            copyOnWrite();
            b().a(generatedExtension.f20931d, generatedExtension.b(type));
            return this;
        }

        public final FieldSet<b> b() {
            FieldSet<b> fieldSet = ((ExtendableMessage) this.instance).extensions;
            if (!fieldSet.f20915b) {
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

        public final <Type> BuilderType clearExtension(ExtensionLite<MessageType, ?> extensionLite) {
            int i10 = GeneratedMessageLite.f20922p0;
            extensionLite.getClass();
            GeneratedExtension<MessageType, ?> generatedExtension = (GeneratedExtension) extensionLite;
            c(generatedExtension);
            copyOnWrite();
            FieldSet<b> fieldSetB = b();
            AbstractMap abstractMap = fieldSetB.f20914a;
            abstractMap.remove(generatedExtension.f20931d);
            if (abstractMap.isEmpty()) {
                fieldSetB.f20916c = false;
            }
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder
        public void copyOnWrite() {
            if (this.isBuilt) {
                super.copyOnWrite();
                MessageType messagetype = this.instance;
                ((ExtendableMessage) messagetype).extensions = ((ExtendableMessage) messagetype).extensions.clone();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(ExtensionLite<MessageType, Type> extensionLite) {
            return (Type) ((ExtendableMessage) this.instance).getExtension(extensionLite);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> extensionLite) {
            return ((ExtendableMessage) this.instance).getExtensionCount(extensionLite);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(ExtensionLite<MessageType, Type> extensionLite) {
            return ((ExtendableMessage) this.instance).hasExtension(extensionLite);
        }

        public final <Type> BuilderType setExtension(ExtensionLite<MessageType, Type> extensionLite, Type type) {
            int i10 = GeneratedMessageLite.f20922p0;
            extensionLite.getClass();
            GeneratedExtension<MessageType, ?> generatedExtension = (GeneratedExtension) extensionLite;
            c(generatedExtension);
            copyOnWrite();
            FieldSet<b> fieldSetB = b();
            b bVar = generatedExtension.f20931d;
            if (!bVar.f20939s0) {
                type = (Type) generatedExtension.b(type);
            } else if (bVar.f20938r0.getJavaType() == WireFormat.JavaType.ENUM) {
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

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i10) {
            return (Type) ((ExtendableMessage) this.instance).getExtension(extensionLite, i10);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.Builder, androidx.datastore.preferences.protobuf.MessageLite.Builder
        public final MessageType buildPartial() {
            if (this.isBuilt) {
                return (MessageType) this.instance;
            }
            ((ExtendableMessage) this.instance).extensions.n();
            return (MessageType) super.buildPartial();
        }

        public final <Type> BuilderType setExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i10, Type type) {
            int i11 = GeneratedMessageLite.f20922p0;
            extensionLite.getClass();
            GeneratedExtension<MessageType, ?> generatedExtension = (GeneratedExtension) extensionLite;
            c(generatedExtension);
            copyOnWrite();
            FieldSet<b> fieldSetB = b();
            Object objB = generatedExtension.b(type);
            b bVar = generatedExtension.f20931d;
            if (bVar.f20939s0) {
                Object objF = fieldSetB.f(bVar);
                if (objF != null) {
                    FieldSet.r(bVar.f20938r0, objB);
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
        public final ContainingType f20928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Type f20929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MessageLite f20930c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f20931d;

        /* JADX WARN: Multi-variable type inference failed */
        public GeneratedExtension(MessageLite messageLite, Object obj, MessageLite messageLite2, b bVar) {
            if (messageLite == 0) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (bVar.f20938r0 == WireFormat.FieldType.MESSAGE && messageLite2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f20928a = messageLite;
            this.f20929b = obj;
            this.f20930c = messageLite2;
            this.f20931d = bVar;
        }

        public final Object a(Object obj) {
            b bVar = this.f20931d;
            return bVar.f20938r0.getJavaType() == WireFormat.JavaType.ENUM ? bVar.f20936p0.findValueByNumber(((Integer) obj).intValue()) : obj;
        }

        public final Object b(Object obj) {
            return this.f20931d.f20938r0.getJavaType() == WireFormat.JavaType.ENUM ? Integer.valueOf(((Internal.EnumLite) obj).getNumber()) : obj;
        }

        public ContainingType getContainingTypeDefaultInstance() {
            return this.f20928a;
        }

        @Override // androidx.datastore.preferences.protobuf.ExtensionLite
        public Type getDefaultValue() {
            return this.f20929b;
        }

        @Override // androidx.datastore.preferences.protobuf.ExtensionLite
        public WireFormat.FieldType getLiteType() {
            return this.f20931d.f20938r0;
        }

        @Override // androidx.datastore.preferences.protobuf.ExtensionLite
        public MessageLite getMessageDefaultInstance() {
            return this.f20930c;
        }

        @Override // androidx.datastore.preferences.protobuf.ExtensionLite
        public int getNumber() {
            return this.f20931d.f20937q0;
        }

        @Override // androidx.datastore.preferences.protobuf.ExtensionLite
        public boolean isRepeated() {
            return this.f20931d.f20939s0;
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
        public final Class<?> f20932p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final String f20933q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final byte[] f20934r0;

        public SerializedForm(MessageLite messageLite) {
            Class<?> cls = messageLite.getClass();
            this.f20932p0 = cls;
            this.f20933q0 = cls.getName();
            this.f20934r0 = messageLite.toByteArray();
        }

        public static SerializedForm of(MessageLite messageLite) {
            return new SerializedForm(messageLite);
        }

        public Object readResolve() throws ObjectStreamException {
            Class<?> cls;
            Class<?> cls2 = this.f20932p0;
            byte[] bArr = this.f20934r0;
            String str = this.f20933q0;
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
        public static final /* synthetic */ int[] f20935a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f20935a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20935a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final class b implements FieldSet.FieldDescriptorLite<b> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Internal.EnumLiteMap<?> f20936p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f20937q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final WireFormat.FieldType f20938r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f20939s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f20940t0;

        public b(Internal.EnumLiteMap<?> enumLiteMap, int i10, WireFormat.FieldType fieldType, boolean z10, boolean z11) {
            this.f20936p0 = enumLiteMap;
            this.f20937q0 = i10;
            this.f20938r0 = fieldType;
            this.f20939s0 = z10;
            this.f20940t0 = z11;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f20937q0 - ((b) obj).f20937q0;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final Internal.EnumLiteMap<?> getEnumType() {
            return this.f20936p0;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final WireFormat.JavaType getLiteJavaType() {
            return this.f20938r0.getJavaType();
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final WireFormat.FieldType getLiteType() {
            return this.f20938r0;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final int getNumber() {
            return this.f20937q0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).mergeFrom((GeneratedMessageLite) messageLite);
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final boolean isPacked() {
            return this.f20940t0;
        }

        @Override // androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite
        public final boolean isRepeated() {
            return this.f20939s0;
        }
    }

    public static void e(GeneratedMessageLite generatedMessageLite) throws InvalidProtocolBufferException {
        if (generatedMessageLite != null && !generatedMessageLite.isInitialized()) {
            throw new UninitializedMessageException(generatedMessageLite).asInvalidProtocolBufferException().setUnfinishedMessage(generatedMessageLite);
        }
    }

    public static Internal.BooleanList emptyBooleanList() {
        return f.f21052s0;
    }

    public static Internal.DoubleList emptyDoubleList() {
        return i.f21066s0;
    }

    public static Internal.FloatList emptyFloatList() {
        return n.f21083s0;
    }

    public static Internal.IntList emptyIntList() {
        return p.f21103s0;
    }

    public static Internal.LongList emptyLongList() {
        return t.f21142s0;
    }

    public static <E> Internal.ProtobufList<E> emptyProtobufList() {
        return k0.f21073s0;
    }

    public static <T extends GeneratedMessageLite<?, ?>> T f(Class<T> cls) {
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
            generatedMessageLite = (T) ((GeneratedMessageLite) v0.b(cls)).getDefaultInstanceForType();
            if (generatedMessageLite == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, generatedMessageLite);
        }
        return (T) generatedMessageLite;
    }

    public static Object g(java.lang.reflect.Method method, Object obj, Object... objArr) {
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

    public static <T extends GeneratedMessageLite<T, ?>> T h(T t10, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            CodedInputStream codedInputStreamNewInstance = CodedInputStream.newInstance(new AbstractMessageLite.Builder.a(inputStream, CodedInputStream.readRawVarint32(i10, inputStream)));
            T t11 = (T) i(t10, codedInputStreamNewInstance, extensionRegistryLite);
            try {
                codedInputStreamNewInstance.checkLastTagWas(0);
                return t11;
            } catch (InvalidProtocolBufferException e5) {
                throw e5.setUnfinishedMessage(t11);
            }
        } catch (IOException e7) {
            throw new InvalidProtocolBufferException(e7.getMessage());
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T i(T t10, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t11 = (T) t10.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            j0 j0Var = j0.f21070c;
            j0Var.getClass();
            o0 o0VarA = j0Var.a(t11.getClass());
            g gVar = codedInputStream.f20812d;
            if (gVar == null) {
                gVar = new g(codedInputStream);
            }
            o0VarA.g(t11, gVar, extensionRegistryLite);
            o0VarA.b(t11);
            return t11;
        } catch (IOException e5) {
            if (e5.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e5.getCause());
            }
            throw new InvalidProtocolBufferException(e5.getMessage()).setUnfinishedMessage(t11);
        } catch (RuntimeException e7) {
            if (e7.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e7.getCause());
            }
            throw e7;
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T j(T t10, byte[] bArr, int i10, int i11, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t11 = (T) t10.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            j0 j0Var = j0.f21070c;
            j0Var.getClass();
            o0 o0VarA = j0Var.a(t11.getClass());
            o0VarA.i(t11, bArr, i10, i10 + i11, new c.b(extensionRegistryLite));
            o0VarA.b(t11);
            if (t11.memoizedHashCode == 0) {
                return t11;
            }
            throw new RuntimeException();
        } catch (IOException e5) {
            if (e5.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e5.getCause());
            }
            throw new InvalidProtocolBufferException(e5.getMessage()).setUnfinishedMessage(t11);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.i().setUnfinishedMessage(t11);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.Internal$IntList] */
    public static Internal.IntList mutableCopy(Internal.IntList intList) {
        int size = intList.size();
        return intList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    public static Object newMessageInfo(MessageLite messageLite, String str, Object[] objArr) {
        return new l0(messageLite, str, objArr);
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i10, WireFormat.FieldType fieldType, boolean z10, Class cls) {
        return new GeneratedExtension<>(containingtype, Collections.emptyList(), messageLite, new b(enumLiteMap, i10, fieldType, true, z10));
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i10, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension<>(containingtype, type, messageLite, new b(enumLiteMap, i10, fieldType, false, false));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t10, InputStream inputStream) throws InvalidProtocolBufferException {
        T t11 = (T) h(t10, inputStream, ExtensionRegistryLite.getEmptyRegistry());
        e(t11);
        return t11;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t11 = (T) parseFrom(t10, CodedInputStream.newInstance(byteBuffer), extensionRegistryLite);
        e(t11);
        return t11;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t10, CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return (T) i(t10, codedInputStream, ExtensionRegistryLite.getEmptyRegistry());
    }

    public static <T extends GeneratedMessageLite<?, ?>> void registerDefaultInstance(Class<T> cls, T t10) {
        defaultInstanceMap.put(cls, t10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    public final int a() {
        return this.memoizedSerializedSize;
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractMessageLite
    public final void d(int i10) {
        this.memoizedSerializedSize = i10;
    }

    public Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj) {
        return dynamicMethod(methodToInvoke, obj, null);
    }

    public abstract Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getDefaultInstanceForType().getClass().isInstance(obj)) {
            return false;
        }
        j0 j0Var = j0.f21070c;
        j0Var.getClass();
        return j0Var.a(getClass()).f(this, (GeneratedMessageLite) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final Parser<MessageType> getParserForType() {
        return (Parser) dynamicMethod(MethodToInvoke.GET_PARSER);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            j0 j0Var = j0.f21070c;
            j0Var.getClass();
            this.memoizedSerializedSize = j0Var.a(getClass()).d(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        j0 j0Var = j0.f21070c;
        j0Var.getClass();
        int iE = j0Var.a(getClass()).e(this);
        this.memoizedHashCode = iE;
        return iE;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public void makeImmutable() {
        j0 j0Var = j0.f21070c;
        j0Var.getClass();
        j0Var.a(getClass()).b(this);
    }

    public void mergeLengthDelimitedField(int i10, ByteString byteString) {
        if (this.unknownFields == UnknownFieldSetLite.getDefaultInstance()) {
            this.unknownFields = new UnknownFieldSetLite();
        }
        UnknownFieldSetLite unknownFieldSetLite = this.unknownFields;
        if (!unknownFieldSetLite.f21008e) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        unknownFieldSetLite.c((i10 << 3) | 2, byteString);
    }

    public final void mergeUnknownFields(UnknownFieldSetLite unknownFieldSetLite) {
        this.unknownFields = UnknownFieldSetLite.b(this.unknownFields, unknownFieldSetLite);
    }

    public void mergeVarintField(int i10, int i11) {
        if (this.unknownFields == UnknownFieldSetLite.getDefaultInstance()) {
            this.unknownFields = new UnknownFieldSetLite();
        }
        UnknownFieldSetLite unknownFieldSetLite = this.unknownFields;
        if (!unknownFieldSetLite.f21008e) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        unknownFieldSetLite.c(i10 << 3, Long.valueOf(i11));
    }

    public boolean parseUnknownField(int i10, CodedInputStream codedInputStream) throws IOException {
        if (WireFormat.getTagWireType(i10) == 4) {
            return false;
        }
        if (this.unknownFields == UnknownFieldSetLite.getDefaultInstance()) {
            this.unknownFields = new UnknownFieldSetLite();
        }
        return this.unknownFields.a(i10, codedInputStream);
    }

    public String toString() {
        String string = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        a0.c(this, sb2, 0);
        return sb2.toString();
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        j0 j0Var = j0.f21070c;
        j0Var.getClass();
        o0 o0VarA = j0Var.a(getClass());
        h hVar = codedOutputStream.f20854a;
        if (hVar == null) {
            hVar = new h(codedOutputStream);
        }
        o0VarA.h(this, hVar);
    }

    public static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.dynamicMethod(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        j0 j0Var = j0.f21070c;
        j0Var.getClass();
        boolean zC = j0Var.a(t10.getClass()).c(t10);
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

    @Override // androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    @Override // androidx.datastore.preferences.protobuf.MessageLite
    public final BuilderType toBuilder() {
        BuilderType buildertype = (BuilderType) dynamicMethod(MethodToInvoke.NEW_BUILDER);
        buildertype.mergeFrom(this);
        return buildertype;
    }

    public static class DefaultInstanceBasedParser<T extends GeneratedMessageLite<T, ?>> extends AbstractParser<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f20924b;

        public DefaultInstanceBasedParser(T t10) {
            this.f20924b = t10;
        }

        @Override // androidx.datastore.preferences.protobuf.Parser
        public T parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.i(this.f20924b, codedInputStream, extensionRegistryLite);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractParser, androidx.datastore.preferences.protobuf.Parser
        public T parsePartialFrom(byte[] bArr, int i10, int i11, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.j(this.f20924b, bArr, i10, i11, extensionRegistryLite);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.Internal$LongList] */
    public static Internal.LongList mutableCopy(Internal.LongList longList) {
        int size = longList.size();
        return longList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (T) parseFrom(t10, byteBuffer, ExtensionRegistryLite.getEmptyRegistry());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t10, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t11 = (T) h(t10, inputStream, extensionRegistryLite);
        e(t11);
        return t11;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, ByteString byteString) throws InvalidProtocolBufferException {
        T t11 = (T) parseFrom(t10, byteString, ExtensionRegistryLite.getEmptyRegistry());
        e(t11);
        return t11;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.Internal$FloatList] */
    public static Internal.FloatList mutableCopy(Internal.FloatList floatList) {
        int size = floatList.size();
        return floatList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStreamNewCodedInput = byteString.newCodedInput();
        T t11 = (T) i(t10, codedInputStreamNewCodedInput, extensionRegistryLite);
        try {
            codedInputStreamNewCodedInput.checkLastTagWas(0);
            e(t11);
            return t11;
        } catch (InvalidProtocolBufferException e5) {
            throw e5.setUnfinishedMessage(t11);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.Internal$DoubleList] */
    public static Internal.DoubleList mutableCopy(Internal.DoubleList doubleList) {
        int size = doubleList.size();
        return doubleList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.datastore.preferences.protobuf.Internal$BooleanList] */
    public static Internal.BooleanList mutableCopy(Internal.BooleanList booleanList) {
        int size = booleanList.size();
        return booleanList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    public static <E> Internal.ProtobufList<E> mutableCopy(Internal.ProtobufList<E> protobufList) {
        int size = protobufList.size();
        return protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, byte[] bArr) throws InvalidProtocolBufferException {
        T t11 = (T) j(t10, bArr, 0, bArr.length, ExtensionRegistryLite.getEmptyRegistry());
        e(t11);
        return t11;
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected FieldSet<b> extensions = FieldSet.f20913d;

        public class ExtensionWriter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator<Map.Entry<b, Object>> f20925a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Map.Entry<b, Object> f20926b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f20927c;

            public ExtensionWriter(ExtendableMessage extendableMessage, boolean z10) {
                Iterator itM = extendableMessage.extensions.m();
                this.f20925a = itM;
                if (itM.hasNext()) {
                    this.f20926b = (Map.Entry) itM.next();
                }
                this.f20927c = z10;
            }

            public void writeUntil(int i10, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<b, Object> entry = this.f20926b;
                    if (entry == null || entry.getKey().f20937q0 >= i10) {
                        return;
                    }
                    b key = this.f20926b.getKey();
                    if (this.f20927c && key.f20938r0.getJavaType() == WireFormat.JavaType.MESSAGE && !key.f20939s0) {
                        codedOutputStream.writeMessageSetExtension(key.f20937q0, (MessageLite) this.f20926b.getValue());
                    } else {
                        Object value = this.f20926b.getValue();
                        FieldSet fieldSet = FieldSet.f20913d;
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
                                codedOutputStream.writeRawVarint32(iD);
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
                    Iterator<Map.Entry<b, Object>> it4 = this.f20925a;
                    if (it4.hasNext()) {
                        this.f20926b = it4.next();
                    } else {
                        this.f20926b = null;
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

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [Type, java.util.ArrayList] */
        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(ExtensionLite<MessageType, Type> extensionLite) {
            extensionLite.getClass();
            GeneratedExtension<MessageType, ?> generatedExtension = (GeneratedExtension) extensionLite;
            m(generatedExtension);
            FieldSet<b> fieldSet = this.extensions;
            b bVar = generatedExtension.f20931d;
            Type type = (Type) fieldSet.f(bVar);
            if (type == null) {
                return generatedExtension.f20929b;
            }
            if (!bVar.f20939s0) {
                return (Type) generatedExtension.a(type);
            }
            if (bVar.f20938r0.getJavaType() != WireFormat.JavaType.ENUM) {
                return type;
            }
            ?? r1 = (Type) new ArrayList();
            Iterator it = ((List) type).iterator();
            while (it.hasNext()) {
                r1.add(generatedExtension.a(it.next()));
            }
            return r1;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> extensionLite) {
            extensionLite.getClass();
            GeneratedExtension<MessageType, ?> generatedExtension = (GeneratedExtension) extensionLite;
            m(generatedExtension);
            FieldSet<b> fieldSet = this.extensions;
            fieldSet.getClass();
            b bVar = generatedExtension.f20931d;
            if (!bVar.isRepeated()) {
                throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
            }
            Object objF = fieldSet.f(bVar);
            if (objF == null) {
                return 0;
            }
            return ((List) objF).size();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(ExtensionLite<MessageType, Type> extensionLite) {
            extensionLite.getClass();
            GeneratedExtension<MessageType, ?> generatedExtension = (GeneratedExtension) extensionLite;
            m(generatedExtension);
            FieldSet<b> fieldSet = this.extensions;
            fieldSet.getClass();
            b bVar = generatedExtension.f20931d;
            if (bVar.isRepeated()) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return fieldSet.f20914a.get(bVar) != null;
        }

        public final FieldSet<b> k() {
            FieldSet<b> fieldSet = this.extensions;
            if (fieldSet.f20915b) {
                this.extensions = fieldSet.clone();
            }
            return this.extensions;
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0009  */
        public final boolean l(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, GeneratedExtension<?, ?> generatedExtension, int i10, int i11) throws IOException {
            boolean z10;
            Object objBuild;
            MessageLite messageLite;
            int tagWireType = WireFormat.getTagWireType(i10);
            boolean z11 = false;
            if (generatedExtension == null) {
                z10 = false;
                z11 = true;
            } else {
                b bVar = generatedExtension.f20931d;
                WireFormat.FieldType fieldType = bVar.f20938r0;
                FieldSet fieldSet = FieldSet.f20913d;
                if (tagWireType == fieldType.getWireType()) {
                    z10 = false;
                } else if (bVar.f20939s0 && bVar.f20938r0.isPackable() && tagWireType == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                    z11 = true;
                }
            }
            if (z11) {
                return parseUnknownField(i10, codedInputStream);
            }
            k();
            if (z10) {
                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                b bVar2 = generatedExtension.f20931d;
                if (bVar2.f20938r0 == WireFormat.FieldType.ENUM) {
                    while (codedInputStream.getBytesUntilLimit() > 0) {
                        Internal.EnumLite enumLiteFindValueByNumber = bVar2.f20936p0.findValueByNumber(codedInputStream.readEnum());
                        if (enumLiteFindValueByNumber == null) {
                            return true;
                        }
                        this.extensions.a(bVar2, generatedExtension.b(enumLiteFindValueByNumber));
                    }
                } else {
                    while (codedInputStream.getBytesUntilLimit() > 0) {
                        this.extensions.a(bVar2, WireFormat.a(codedInputStream, bVar2.f20938r0, WireFormat.b.LOOSE));
                    }
                }
                codedInputStream.popLimit(iPushLimit);
            } else {
                int i12 = a.f20935a[generatedExtension.f20931d.f20938r0.getJavaType().ordinal()];
                b bVar3 = generatedExtension.f20931d;
                if (i12 == 1) {
                    MessageLite.Builder builder = (bVar3.f20939s0 || (messageLite = (MessageLite) this.extensions.f(bVar3)) == null) ? null : messageLite.toBuilder();
                    if (builder == null) {
                        builder = generatedExtension.getMessageDefaultInstance().newBuilderForType();
                    }
                    if (bVar3.f20938r0 == WireFormat.FieldType.GROUP) {
                        codedInputStream.readGroup(generatedExtension.getNumber(), builder, extensionRegistryLite);
                    } else {
                        codedInputStream.readMessage(builder, extensionRegistryLite);
                    }
                    objBuild = builder.build();
                } else if (i12 != 2) {
                    objBuild = WireFormat.a(codedInputStream, bVar3.f20938r0, WireFormat.b.LOOSE);
                } else {
                    int i13 = codedInputStream.readEnum();
                    Internal.EnumLite enumLiteFindValueByNumber2 = bVar3.f20936p0.findValueByNumber(i13);
                    if (enumLiteFindValueByNumber2 == null) {
                        mergeVarintField(i11, i13);
                        return true;
                    }
                    objBuild = enumLiteFindValueByNumber2;
                }
                if (bVar3.f20939s0) {
                    this.extensions.a(bVar3, generatedExtension.b(objBuild));
                } else {
                    this.extensions.q(bVar3, generatedExtension.b(objBuild));
                }
            }
            return true;
        }

        public final void m(GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public final void mergeExtensionFields(MessageType messagetype) {
            FieldSet<b> fieldSet = this.extensions;
            if (fieldSet.f20915b) {
                this.extensions = fieldSet.clone();
            }
            this.extensions.o(messagetype.extensions);
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLite
        public /* bridge */ /* synthetic */ MessageLite.Builder newBuilderForType() {
            return super.newBuilderForType();
        }

        public ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newExtensionWriter() {
            return new ExtensionWriter(this, false);
        }

        public ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newMessageSetExtensionWriter() {
            return new ExtensionWriter(this, true);
        }

        public <MessageType extends MessageLite> boolean parseUnknownField(MessageType messagetype, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i10) throws IOException {
            int tagFieldNumber = WireFormat.getTagFieldNumber(i10);
            return l(codedInputStream, extensionRegistryLite, extensionRegistryLite.findLiteExtensionByNumber(messagetype, tagFieldNumber), i10, tagFieldNumber);
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
                        l(codedInputStream, extensionRegistryLite, generatedExtensionFindLiteExtensionByNumber, (uInt32 << 3) | 2, uInt32);
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
            b bVar = generatedExtensionFindLiteExtensionByNumber.f20931d;
            MessageLite messageLite = (MessageLite) fieldSet.f(bVar);
            MessageLite.Builder builder = messageLite != null ? messageLite.toBuilder() : null;
            if (builder == null) {
                builder = generatedExtensionFindLiteExtensionByNumber.getMessageDefaultInstance().newBuilderForType();
            }
            builder.mergeFrom(bytes, extensionRegistryLite);
            k().q(bVar, generatedExtensionFindLiteExtensionByNumber.b(builder.build()));
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite, androidx.datastore.preferences.protobuf.MessageLite
        public /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
            return super.toBuilder();
        }

        @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i10) {
            extensionLite.getClass();
            GeneratedExtension<MessageType, ?> generatedExtension = (GeneratedExtension) extensionLite;
            m(generatedExtension);
            FieldSet<b> fieldSet = this.extensions;
            fieldSet.getClass();
            b bVar = generatedExtension.f20931d;
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
        T t11 = (T) j(t10, bArr, 0, bArr.length, extensionRegistryLite);
        e(t11);
        return t11;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, InputStream inputStream) throws InvalidProtocolBufferException {
        T t11 = (T) i(t10, CodedInputStream.newInstance(inputStream), ExtensionRegistryLite.getEmptyRegistry());
        e(t11);
        return t11;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t11 = (T) i(t10, CodedInputStream.newInstance(inputStream), extensionRegistryLite);
        e(t11);
        return t11;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return (T) parseFrom(t10, codedInputStream, ExtensionRegistryLite.getEmptyRegistry());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        T t11 = (T) i(t10, codedInputStream, extensionRegistryLite);
        e(t11);
        return t11;
    }
}
