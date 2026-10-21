package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.collection.f;
import com.bbva.appsflyer.DeepLinkListenerAdapter;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public abstract class GeneratedMessageLite extends AbstractMessageLite implements Serializable {

    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage> extends MessageLiteOrBuilder {
    }

    public static class GeneratedExtension<ContainingType extends MessageLite, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContainingType f81402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Type f81403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MessageLite f81404c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f81405d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Method f81406e;

        public GeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, b bVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (bVar.getLiteType() == WireFormat.FieldType.MESSAGE && messageLite == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f81402a = containingtype;
            this.f81403b = type;
            this.f81404c = messageLite;
            this.f81405d = bVar;
            if (!Internal.EnumLite.class.isAssignableFrom(cls)) {
                this.f81406e = null;
                return;
            }
            try {
                this.f81406e = cls.getMethod(DeepLinkListenerAdapter.Constants.STATUS_VALUE_OF, Integer.TYPE);
            } catch (NoSuchMethodException e5) {
                String name = cls.getName();
                throw new RuntimeException(f.c(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e5);
            }
        }

        public final Object a(Object obj) {
            if (this.f81405d.getLiteJavaType() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            try {
                return this.f81406e.invoke(null, (Integer) obj);
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

        public final Object b(Object obj) {
            return this.f81405d.getLiteJavaType() == WireFormat.JavaType.ENUM ? Integer.valueOf(((Internal.EnumLite) obj).getNumber()) : obj;
        }

        public ContainingType getContainingTypeDefaultInstance() {
            return this.f81402a;
        }

        public MessageLite getMessageDefaultInstance() {
            return this.f81404c;
        }

        public int getNumber() {
            return this.f81405d.getNumber();
        }
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f81407a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f81407a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81407a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final class b implements FieldSet.FieldDescriptorLite<b> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Internal.EnumLiteMap<?> f81408p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f81409q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final WireFormat.FieldType f81410r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f81411s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f81412t0;

        public b(Internal.EnumLiteMap<?> enumLiteMap, int i10, WireFormat.FieldType fieldType, boolean z10, boolean z11) {
            this.f81408p0 = enumLiteMap;
            this.f81409q0 = i10;
            this.f81410r0 = fieldType;
            this.f81411s0 = z10;
            this.f81412t0 = z11;
        }

        public Internal.EnumLiteMap<?> getEnumType() {
            return this.f81408p0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public WireFormat.JavaType getLiteJavaType() {
            return this.f81410r0.getJavaType();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public WireFormat.FieldType getLiteType() {
            return this.f81410r0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public int getNumber() {
            return this.f81409q0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).mergeFrom((GeneratedMessageLite) messageLite);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public boolean isPacked() {
            return this.f81412t0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public boolean isRepeated() {
            return this.f81411s0;
        }

        @Override // java.lang.Comparable
        public int compareTo(b bVar) {
            return this.f81409q0 - bVar.f81409q0;
        }
    }

    public GeneratedMessageLite() {
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i10, WireFormat.FieldType fieldType, boolean z10, Class cls) {
        return new GeneratedExtension<>(containingtype, Collections.emptyList(), messageLite, new b(enumLiteMap, i10, fieldType, true, z10), cls);
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i10, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension<>(containingtype, type, messageLite, new b(enumLiteMap, i10, fieldType, false, false), cls);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
    public Parser<? extends MessageLite> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    public boolean parseUnknownField(CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i10) throws IOException {
        return codedInputStream.skipField(i10, codedOutputStream);
    }

    public static abstract class Builder<MessageType extends GeneratedMessageLite, BuilderType extends Builder> extends AbstractMessageLite.Builder<BuilderType> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public ByteString f81395p0 = ByteString.EMPTY;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public abstract MessageType getDefaultInstanceForType();

        public final ByteString getUnknownFields() {
            return this.f81395p0;
        }

        public abstract BuilderType mergeFrom(MessageType messagetype);

        public final BuilderType setUnknownFields(ByteString byteString) {
            this.f81395p0 = byteString;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public BuilderType mo5776clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements ExtendableMessageOrBuilder<MessageType> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final FieldSet<b> f81398p0;

        public class ExtensionWriter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator<Map.Entry<b, Object>> f81399a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Map.Entry<b, Object> f81400b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f81401c;

            public ExtensionWriter(ExtendableMessage extendableMessage) {
                Iterator it = extendableMessage.f81398p0.iterator();
                this.f81399a = it;
                if (it.hasNext()) {
                    this.f81400b = (Map.Entry) it.next();
                }
                this.f81401c = false;
            }

            public void writeUntil(int i10, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<b, Object> entry = this.f81400b;
                    if (entry == null || entry.getKey().getNumber() >= i10) {
                        return;
                    }
                    b key = this.f81400b.getKey();
                    if (this.f81401c && key.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !key.isRepeated()) {
                        codedOutputStream.writeMessageSetExtension(key.getNumber(), (MessageLite) this.f81400b.getValue());
                    } else {
                        FieldSet.writeField(key, this.f81400b.getValue(), codedOutputStream);
                    }
                    Iterator<Map.Entry<b, Object>> it = this.f81399a;
                    if (it.hasNext()) {
                        this.f81400b = it.next();
                    } else {
                        this.f81400b = null;
                    }
                }
            }
        }

        public ExtendableMessage() {
            this.f81398p0 = FieldSet.newFieldSet();
        }

        public final void a(GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public boolean extensionsAreInitialized() {
            return this.f81398p0.isInitialized();
        }

        public int extensionsSerializedSize() {
            return this.f81398p0.getSerializedSize();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [Type, java.util.ArrayList] */
        public final <Type> Type getExtension(GeneratedExtension<MessageType, Type> generatedExtension) {
            a(generatedExtension);
            FieldSet<b> fieldSet = this.f81398p0;
            b bVar = generatedExtension.f81405d;
            Type type = (Type) fieldSet.getField(bVar);
            if (type == null) {
                return generatedExtension.f81403b;
            }
            if (!bVar.isRepeated()) {
                return (Type) generatedExtension.a(type);
            }
            if (bVar.getLiteJavaType() != WireFormat.JavaType.ENUM) {
                return type;
            }
            ?? r1 = (Type) new ArrayList();
            Iterator it = ((List) type).iterator();
            while (it.hasNext()) {
                r1.add(generatedExtension.a(it.next()));
            }
            return r1;
        }

        public final <Type> int getExtensionCount(GeneratedExtension<MessageType, List<Type>> generatedExtension) {
            a(generatedExtension);
            return this.f81398p0.getRepeatedFieldCount(generatedExtension.f81405d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean hasExtension(GeneratedExtension<MessageType, Type> generatedExtension) {
            a(generatedExtension);
            return this.f81398p0.hasField(generatedExtension.f81405d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public void makeExtensionsImmutable() {
            this.f81398p0.makeImmutable();
        }

        public ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter() {
            return new ExtensionWriter(this);
        }

        /* JADX WARN: Code duplicated, block: B:4:0x0013  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public boolean parseUnknownField(CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i10) throws IOException {
            boolean z10;
            boolean z11;
            Object objBuild;
            MessageLite messageLite;
            int i11 = i10 & 7;
            GeneratedExtension generatedExtensionFindLiteExtensionByNumber = extensionRegistryLite.findLiteExtensionByNumber(getDefaultInstanceForType(), WireFormat.getTagFieldNumber(i10));
            if (generatedExtensionFindLiteExtensionByNumber == null) {
                z11 = false;
                z10 = true;
            } else {
                b bVar = generatedExtensionFindLiteExtensionByNumber.f81405d;
                WireFormat.FieldType liteType = bVar.getLiteType();
                FieldSet fieldSet = FieldSet.f81389d;
                if (i11 == liteType.getWireType()) {
                    z10 = false;
                    z11 = false;
                } else if (bVar.f81411s0 && bVar.f81410r0.isPackable()) {
                    bVar.getLiteType();
                    if (i11 == 2) {
                        z10 = false;
                        z11 = true;
                    } else {
                        z11 = false;
                        z10 = true;
                    }
                } else {
                    z11 = false;
                    z10 = true;
                }
            }
            if (z10) {
                return codedInputStream.skipField(i10, codedOutputStream);
            }
            FieldSet<b> fieldSet2 = this.f81398p0;
            if (z11) {
                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                WireFormat.FieldType liteType2 = generatedExtensionFindLiteExtensionByNumber.f81405d.getLiteType();
                WireFormat.FieldType fieldType = WireFormat.FieldType.ENUM;
                b bVar2 = generatedExtensionFindLiteExtensionByNumber.f81405d;
                if (liteType2 == fieldType) {
                    while (codedInputStream.getBytesUntilLimit() > 0) {
                        Internal.EnumLite enumLiteFindValueByNumber = bVar2.getEnumType().findValueByNumber(codedInputStream.readEnum());
                        if (enumLiteFindValueByNumber == null) {
                            return true;
                        }
                        fieldSet2.addRepeatedField(bVar2, generatedExtensionFindLiteExtensionByNumber.b(enumLiteFindValueByNumber));
                    }
                } else {
                    while (codedInputStream.getBytesUntilLimit() > 0) {
                        fieldSet2.addRepeatedField(bVar2, FieldSet.readPrimitiveField(codedInputStream, bVar2.getLiteType(), false));
                    }
                }
                codedInputStream.popLimit(iPushLimit);
                return true;
            }
            int i12 = a.f81407a[generatedExtensionFindLiteExtensionByNumber.f81405d.getLiteJavaType().ordinal()];
            b bVar3 = generatedExtensionFindLiteExtensionByNumber.f81405d;
            if (i12 == 1) {
                MessageLite.Builder builder = (bVar3.isRepeated() || (messageLite = (MessageLite) fieldSet2.getField(bVar3)) == null) ? null : messageLite.toBuilder();
                if (builder == null) {
                    builder = generatedExtensionFindLiteExtensionByNumber.getMessageDefaultInstance().newBuilderForType();
                }
                if (bVar3.getLiteType() == WireFormat.FieldType.GROUP) {
                    codedInputStream.readGroup(generatedExtensionFindLiteExtensionByNumber.getNumber(), builder, extensionRegistryLite);
                } else {
                    codedInputStream.readMessage(builder, extensionRegistryLite);
                }
                objBuild = builder.build();
            } else if (i12 != 2) {
                objBuild = FieldSet.readPrimitiveField(codedInputStream, bVar3.getLiteType(), false);
            } else {
                int i13 = codedInputStream.readEnum();
                Internal.EnumLite enumLiteFindValueByNumber2 = bVar3.getEnumType().findValueByNumber(i13);
                if (enumLiteFindValueByNumber2 == null) {
                    codedOutputStream.writeRawVarint32(i10);
                    codedOutputStream.writeUInt32NoTag(i13);
                    return true;
                }
                objBuild = enumLiteFindValueByNumber2;
            }
            if (bVar3.isRepeated()) {
                fieldSet2.addRepeatedField(bVar3, generatedExtensionFindLiteExtensionByNumber.b(objBuild));
                return true;
            }
            fieldSet2.setField(bVar3, generatedExtensionFindLiteExtensionByNumber.b(objBuild));
            return true;
        }

        public ExtendableMessage(ExtendableBuilder<MessageType, ?> extendableBuilder) {
            extendableBuilder.f81396q0.makeImmutable();
            extendableBuilder.f81397r0 = false;
            this.f81398p0 = extendableBuilder.f81396q0;
        }

        public final <Type> Type getExtension(GeneratedExtension<MessageType, List<Type>> generatedExtension, int i10) {
            a(generatedExtension);
            return (Type) generatedExtension.a(this.f81398p0.getRepeatedField(generatedExtension.f81405d, i10));
        }
    }

    public GeneratedMessageLite(Builder builder) {
    }

    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public FieldSet<b> f81396q0 = FieldSet.emptySet();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f81397r0;

        public boolean extensionsAreInitialized() {
            return this.f81396q0.isInitialized();
        }

        public final void mergeExtensionFields(MessageType messagetype) {
            if (!this.f81397r0) {
                this.f81396q0 = this.f81396q0.clone();
                this.f81397r0 = true;
            }
            this.f81396q0.mergeFrom(messagetype.f81398p0);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public BuilderType mo5776clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }
    }

    public void makeExtensionsImmutable() {
    }
}
