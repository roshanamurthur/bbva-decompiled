package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* JADX INFO: loaded from: classes12.dex */
public final class JvmProtoBuf {
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> anonymousObjectOriginName;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Property>> classLocalVariable;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> classModuleName;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, JvmMethodSignature> constructorSignature;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, Integer> flags;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, Boolean> isRaw;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> jvmClassFlags;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, Integer> lambdaClassOriginName;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, JvmMethodSignature> methodSignature;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, List<ProtoBuf.Property>> packageLocalVariable;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> packageModuleName;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmPropertySignature> propertySignature;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> typeAnnotation;
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> typeParameterAnnotation;

    public static final class JvmFieldSignature extends GeneratedMessageLite implements JvmFieldSignatureOrBuilder {
        public static Parser<JvmFieldSignature> PARSER = new a();
        public static final JvmFieldSignature v0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ByteString f81252p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f81253q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f81254r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f81255s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public byte f81256t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f81257u0;

        public static final class Builder extends GeneratedMessageLite.Builder<JvmFieldSignature, Builder> implements JvmFieldSignatureOrBuilder {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public int f81258q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public int f81259r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public int f81260s0;

            public JvmFieldSignature buildPartial() {
                JvmFieldSignature jvmFieldSignature = new JvmFieldSignature(this);
                int i10 = this.f81258q0;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                jvmFieldSignature.f81254r0 = this.f81259r0;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                jvmFieldSignature.f81255s0 = this.f81260s0;
                jvmFieldSignature.f81253q0 = i11;
                return jvmFieldSignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setDesc(int i10) {
                this.f81258q0 |= 2;
                this.f81260s0 = i10;
                return this;
            }

            public Builder setName(int i10) {
                this.f81258q0 |= 1;
                this.f81259r0 = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public JvmFieldSignature build() {
                JvmFieldSignature jvmFieldSignatureBuildPartial = buildPartial();
                if (jvmFieldSignatureBuildPartial.isInitialized()) {
                    return jvmFieldSignatureBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(jvmFieldSignatureBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public JvmFieldSignature getDefaultInstanceForType() {
                return JvmFieldSignature.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo5776clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(JvmFieldSignature jvmFieldSignature) {
                if (jvmFieldSignature == JvmFieldSignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmFieldSignature.hasName()) {
                    setName(jvmFieldSignature.getName());
                }
                if (jvmFieldSignature.hasDesc()) {
                    setDesc(jvmFieldSignature.getDesc());
                }
                setUnknownFields(getUnknownFields().concat(jvmFieldSignature.f81252p0));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                JvmFieldSignature jvmFieldSignature = null;
                try {
                    try {
                        JvmFieldSignature partialFrom = JvmFieldSignature.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        JvmFieldSignature jvmFieldSignature2 = (JvmFieldSignature) e5.getUnfinishedMessage();
                        try {
                            throw e5;
                        } catch (Throwable th2) {
                            th = th2;
                            jvmFieldSignature = jvmFieldSignature2;
                            if (jvmFieldSignature != null) {
                                mergeFrom(jvmFieldSignature);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (jvmFieldSignature != null) {
                        mergeFrom(jvmFieldSignature);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<JvmFieldSignature> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public JvmFieldSignature parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new JvmFieldSignature(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            JvmFieldSignature jvmFieldSignature = new JvmFieldSignature();
            v0 = jvmFieldSignature;
            jvmFieldSignature.f81254r0 = 0;
            jvmFieldSignature.f81255s0 = 0;
        }

        public JvmFieldSignature(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f81256t0 = (byte) -1;
            this.f81257u0 = -1;
            this.f81252p0 = builder.getUnknownFields();
        }

        public static JvmFieldSignature getDefaultInstance() {
            return v0;
        }

        public static Builder newBuilder(JvmFieldSignature jvmFieldSignature) {
            return newBuilder().mergeFrom(jvmFieldSignature);
        }

        public int getDesc() {
            return this.f81255s0;
        }

        public int getName() {
            return this.f81254r0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<JvmFieldSignature> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f81257u0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = (this.f81253q0 & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f81254r0) : 0;
            if ((this.f81253q0 & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f81255s0);
            }
            int size = this.f81252p0.size() + iComputeInt32Size;
            this.f81257u0 = size;
            return size;
        }

        public boolean hasDesc() {
            return (this.f81253q0 & 2) == 2;
        }

        public boolean hasName() {
            return (this.f81253q0 & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f81256t0;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f81256t0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f81253q0 & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f81254r0);
            }
            if ((this.f81253q0 & 2) == 2) {
                codedOutputStream.writeInt32(2, this.f81255s0);
            }
            codedOutputStream.writeRawBytes(this.f81252p0);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public JvmFieldSignature getDefaultInstanceForType() {
            return v0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public JvmFieldSignature() {
            this.f81256t0 = (byte) -1;
            this.f81257u0 = -1;
            this.f81252p0 = ByteString.EMPTY;
        }

        public JvmFieldSignature(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f81256t0 = (byte) -1;
            this.f81257u0 = -1;
            boolean z10 = false;
            this.f81254r0 = 0;
            this.f81255s0 = 0;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.f81253q0 |= 1;
                                this.f81254r0 = codedInputStream.readInt32();
                            } else if (tag != 16) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.f81253q0 |= 2;
                                this.f81255s0 = codedInputStream.readInt32();
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f81252p0 = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e5) {
                    throw e5.setUnfinishedMessage(this);
                } catch (IOException e7) {
                    throw new InvalidProtocolBufferException(e7.getMessage()).setUnfinishedMessage(this);
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f81252p0 = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface JvmFieldSignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class JvmMethodSignature extends GeneratedMessageLite implements JvmMethodSignatureOrBuilder {
        public static Parser<JvmMethodSignature> PARSER = new a();
        public static final JvmMethodSignature v0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ByteString f81261p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f81262q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f81263r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f81264s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public byte f81265t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f81266u0;

        public static final class Builder extends GeneratedMessageLite.Builder<JvmMethodSignature, Builder> implements JvmMethodSignatureOrBuilder {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public int f81267q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public int f81268r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public int f81269s0;

            public JvmMethodSignature buildPartial() {
                JvmMethodSignature jvmMethodSignature = new JvmMethodSignature(this);
                int i10 = this.f81267q0;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                jvmMethodSignature.f81263r0 = this.f81268r0;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                jvmMethodSignature.f81264s0 = this.f81269s0;
                jvmMethodSignature.f81262q0 = i11;
                return jvmMethodSignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setDesc(int i10) {
                this.f81267q0 |= 2;
                this.f81269s0 = i10;
                return this;
            }

            public Builder setName(int i10) {
                this.f81267q0 |= 1;
                this.f81268r0 = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public JvmMethodSignature build() {
                JvmMethodSignature jvmMethodSignatureBuildPartial = buildPartial();
                if (jvmMethodSignatureBuildPartial.isInitialized()) {
                    return jvmMethodSignatureBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(jvmMethodSignatureBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public JvmMethodSignature getDefaultInstanceForType() {
                return JvmMethodSignature.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo5776clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(JvmMethodSignature jvmMethodSignature) {
                if (jvmMethodSignature == JvmMethodSignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmMethodSignature.hasName()) {
                    setName(jvmMethodSignature.getName());
                }
                if (jvmMethodSignature.hasDesc()) {
                    setDesc(jvmMethodSignature.getDesc());
                }
                setUnknownFields(getUnknownFields().concat(jvmMethodSignature.f81261p0));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                JvmMethodSignature jvmMethodSignature = null;
                try {
                    try {
                        JvmMethodSignature partialFrom = JvmMethodSignature.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        JvmMethodSignature jvmMethodSignature2 = (JvmMethodSignature) e5.getUnfinishedMessage();
                        try {
                            throw e5;
                        } catch (Throwable th2) {
                            th = th2;
                            jvmMethodSignature = jvmMethodSignature2;
                            if (jvmMethodSignature != null) {
                                mergeFrom(jvmMethodSignature);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (jvmMethodSignature != null) {
                        mergeFrom(jvmMethodSignature);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<JvmMethodSignature> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public JvmMethodSignature parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new JvmMethodSignature(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            JvmMethodSignature jvmMethodSignature = new JvmMethodSignature();
            v0 = jvmMethodSignature;
            jvmMethodSignature.f81263r0 = 0;
            jvmMethodSignature.f81264s0 = 0;
        }

        public JvmMethodSignature(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f81265t0 = (byte) -1;
            this.f81266u0 = -1;
            this.f81261p0 = builder.getUnknownFields();
        }

        public static JvmMethodSignature getDefaultInstance() {
            return v0;
        }

        public static Builder newBuilder(JvmMethodSignature jvmMethodSignature) {
            return newBuilder().mergeFrom(jvmMethodSignature);
        }

        public int getDesc() {
            return this.f81264s0;
        }

        public int getName() {
            return this.f81263r0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<JvmMethodSignature> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f81266u0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = (this.f81262q0 & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f81263r0) : 0;
            if ((this.f81262q0 & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f81264s0);
            }
            int size = this.f81261p0.size() + iComputeInt32Size;
            this.f81266u0 = size;
            return size;
        }

        public boolean hasDesc() {
            return (this.f81262q0 & 2) == 2;
        }

        public boolean hasName() {
            return (this.f81262q0 & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f81265t0;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f81265t0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f81262q0 & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f81263r0);
            }
            if ((this.f81262q0 & 2) == 2) {
                codedOutputStream.writeInt32(2, this.f81264s0);
            }
            codedOutputStream.writeRawBytes(this.f81261p0);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public JvmMethodSignature getDefaultInstanceForType() {
            return v0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public JvmMethodSignature() {
            this.f81265t0 = (byte) -1;
            this.f81266u0 = -1;
            this.f81261p0 = ByteString.EMPTY;
        }

        public JvmMethodSignature(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f81265t0 = (byte) -1;
            this.f81266u0 = -1;
            boolean z10 = false;
            this.f81263r0 = 0;
            this.f81264s0 = 0;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.f81262q0 |= 1;
                                this.f81263r0 = codedInputStream.readInt32();
                            } else if (tag != 16) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.f81262q0 |= 2;
                                this.f81264s0 = codedInputStream.readInt32();
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f81261p0 = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e5) {
                    throw e5.setUnfinishedMessage(this);
                } catch (IOException e7) {
                    throw new InvalidProtocolBufferException(e7.getMessage()).setUnfinishedMessage(this);
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f81261p0 = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface JvmMethodSignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class JvmPropertySignature extends GeneratedMessageLite implements JvmPropertySignatureOrBuilder {
        public static Parser<JvmPropertySignature> PARSER = new a();

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public static final JvmPropertySignature f81270y0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ByteString f81271p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f81272q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public JvmFieldSignature f81273r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public JvmMethodSignature f81274s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public JvmMethodSignature f81275t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public JvmMethodSignature f81276u0;
        public JvmMethodSignature v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public byte f81277w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public int f81278x0;

        public static final class Builder extends GeneratedMessageLite.Builder<JvmPropertySignature, Builder> implements JvmPropertySignatureOrBuilder {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public int f81279q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public JvmFieldSignature f81280r0 = JvmFieldSignature.getDefaultInstance();

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public JvmMethodSignature f81281s0 = JvmMethodSignature.getDefaultInstance();

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public JvmMethodSignature f81282t0 = JvmMethodSignature.getDefaultInstance();

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public JvmMethodSignature f81283u0 = JvmMethodSignature.getDefaultInstance();
            public JvmMethodSignature v0 = JvmMethodSignature.getDefaultInstance();

            public JvmPropertySignature buildPartial() {
                JvmPropertySignature jvmPropertySignature = new JvmPropertySignature(this);
                int i10 = this.f81279q0;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                jvmPropertySignature.f81273r0 = this.f81280r0;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                jvmPropertySignature.f81274s0 = this.f81281s0;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                jvmPropertySignature.f81275t0 = this.f81282t0;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                jvmPropertySignature.f81276u0 = this.f81283u0;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                jvmPropertySignature.v0 = this.v0;
                jvmPropertySignature.f81272q0 = i11;
                return jvmPropertySignature;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDelegateMethod(JvmMethodSignature jvmMethodSignature) {
                if ((this.f81279q0 & 16) != 16 || this.v0 == JvmMethodSignature.getDefaultInstance()) {
                    this.v0 = jvmMethodSignature;
                } else {
                    this.v0 = JvmMethodSignature.newBuilder(this.v0).mergeFrom(jvmMethodSignature).buildPartial();
                }
                this.f81279q0 |= 16;
                return this;
            }

            public Builder mergeField(JvmFieldSignature jvmFieldSignature) {
                if ((this.f81279q0 & 1) != 1 || this.f81280r0 == JvmFieldSignature.getDefaultInstance()) {
                    this.f81280r0 = jvmFieldSignature;
                } else {
                    this.f81280r0 = JvmFieldSignature.newBuilder(this.f81280r0).mergeFrom(jvmFieldSignature).buildPartial();
                }
                this.f81279q0 |= 1;
                return this;
            }

            public Builder mergeGetter(JvmMethodSignature jvmMethodSignature) {
                if ((this.f81279q0 & 4) != 4 || this.f81282t0 == JvmMethodSignature.getDefaultInstance()) {
                    this.f81282t0 = jvmMethodSignature;
                } else {
                    this.f81282t0 = JvmMethodSignature.newBuilder(this.f81282t0).mergeFrom(jvmMethodSignature).buildPartial();
                }
                this.f81279q0 |= 4;
                return this;
            }

            public Builder mergeSetter(JvmMethodSignature jvmMethodSignature) {
                if ((this.f81279q0 & 8) != 8 || this.f81283u0 == JvmMethodSignature.getDefaultInstance()) {
                    this.f81283u0 = jvmMethodSignature;
                } else {
                    this.f81283u0 = JvmMethodSignature.newBuilder(this.f81283u0).mergeFrom(jvmMethodSignature).buildPartial();
                }
                this.f81279q0 |= 8;
                return this;
            }

            public Builder mergeSyntheticMethod(JvmMethodSignature jvmMethodSignature) {
                if ((this.f81279q0 & 2) != 2 || this.f81281s0 == JvmMethodSignature.getDefaultInstance()) {
                    this.f81281s0 = jvmMethodSignature;
                } else {
                    this.f81281s0 = JvmMethodSignature.newBuilder(this.f81281s0).mergeFrom(jvmMethodSignature).buildPartial();
                }
                this.f81279q0 |= 2;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public JvmPropertySignature build() {
                JvmPropertySignature jvmPropertySignatureBuildPartial = buildPartial();
                if (jvmPropertySignatureBuildPartial.isInitialized()) {
                    return jvmPropertySignatureBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(jvmPropertySignatureBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public JvmPropertySignature getDefaultInstanceForType() {
                return JvmPropertySignature.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo5776clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(JvmPropertySignature jvmPropertySignature) {
                if (jvmPropertySignature == JvmPropertySignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmPropertySignature.hasField()) {
                    mergeField(jvmPropertySignature.getField());
                }
                if (jvmPropertySignature.hasSyntheticMethod()) {
                    mergeSyntheticMethod(jvmPropertySignature.getSyntheticMethod());
                }
                if (jvmPropertySignature.hasGetter()) {
                    mergeGetter(jvmPropertySignature.getGetter());
                }
                if (jvmPropertySignature.hasSetter()) {
                    mergeSetter(jvmPropertySignature.getSetter());
                }
                if (jvmPropertySignature.hasDelegateMethod()) {
                    mergeDelegateMethod(jvmPropertySignature.getDelegateMethod());
                }
                setUnknownFields(getUnknownFields().concat(jvmPropertySignature.f81271p0));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                JvmPropertySignature jvmPropertySignature = null;
                try {
                    try {
                        JvmPropertySignature partialFrom = JvmPropertySignature.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        JvmPropertySignature jvmPropertySignature2 = (JvmPropertySignature) e5.getUnfinishedMessage();
                        try {
                            throw e5;
                        } catch (Throwable th2) {
                            th = th2;
                            jvmPropertySignature = jvmPropertySignature2;
                            if (jvmPropertySignature != null) {
                                mergeFrom(jvmPropertySignature);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (jvmPropertySignature != null) {
                        mergeFrom(jvmPropertySignature);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<JvmPropertySignature> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public JvmPropertySignature parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new JvmPropertySignature(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            JvmPropertySignature jvmPropertySignature = new JvmPropertySignature();
            f81270y0 = jvmPropertySignature;
            jvmPropertySignature.f81273r0 = JvmFieldSignature.getDefaultInstance();
            jvmPropertySignature.f81274s0 = JvmMethodSignature.getDefaultInstance();
            jvmPropertySignature.f81275t0 = JvmMethodSignature.getDefaultInstance();
            jvmPropertySignature.f81276u0 = JvmMethodSignature.getDefaultInstance();
            jvmPropertySignature.v0 = JvmMethodSignature.getDefaultInstance();
        }

        public JvmPropertySignature(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f81277w0 = (byte) -1;
            this.f81278x0 = -1;
            this.f81271p0 = builder.getUnknownFields();
        }

        public static JvmPropertySignature getDefaultInstance() {
            return f81270y0;
        }

        public static Builder newBuilder(JvmPropertySignature jvmPropertySignature) {
            return newBuilder().mergeFrom(jvmPropertySignature);
        }

        public JvmMethodSignature getDelegateMethod() {
            return this.v0;
        }

        public JvmFieldSignature getField() {
            return this.f81273r0;
        }

        public JvmMethodSignature getGetter() {
            return this.f81275t0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<JvmPropertySignature> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f81278x0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = (this.f81272q0 & 1) == 1 ? CodedOutputStream.computeMessageSize(1, this.f81273r0) : 0;
            if ((this.f81272q0 & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, this.f81274s0);
            }
            if ((this.f81272q0 & 4) == 4) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, this.f81275t0);
            }
            if ((this.f81272q0 & 8) == 8) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, this.f81276u0);
            }
            if ((this.f81272q0 & 16) == 16) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, this.v0);
            }
            int size = this.f81271p0.size() + iComputeMessageSize;
            this.f81278x0 = size;
            return size;
        }

        public JvmMethodSignature getSetter() {
            return this.f81276u0;
        }

        public JvmMethodSignature getSyntheticMethod() {
            return this.f81274s0;
        }

        public boolean hasDelegateMethod() {
            return (this.f81272q0 & 16) == 16;
        }

        public boolean hasField() {
            return (this.f81272q0 & 1) == 1;
        }

        public boolean hasGetter() {
            return (this.f81272q0 & 4) == 4;
        }

        public boolean hasSetter() {
            return (this.f81272q0 & 8) == 8;
        }

        public boolean hasSyntheticMethod() {
            return (this.f81272q0 & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f81277w0;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f81277w0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f81272q0 & 1) == 1) {
                codedOutputStream.writeMessage(1, this.f81273r0);
            }
            if ((this.f81272q0 & 2) == 2) {
                codedOutputStream.writeMessage(2, this.f81274s0);
            }
            if ((this.f81272q0 & 4) == 4) {
                codedOutputStream.writeMessage(3, this.f81275t0);
            }
            if ((this.f81272q0 & 8) == 8) {
                codedOutputStream.writeMessage(4, this.f81276u0);
            }
            if ((this.f81272q0 & 16) == 16) {
                codedOutputStream.writeMessage(5, this.v0);
            }
            codedOutputStream.writeRawBytes(this.f81271p0);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public JvmPropertySignature getDefaultInstanceForType() {
            return f81270y0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public JvmPropertySignature() {
            this.f81277w0 = (byte) -1;
            this.f81278x0 = -1;
            this.f81271p0 = ByteString.EMPTY;
        }

        public JvmPropertySignature(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f81277w0 = (byte) -1;
            this.f81278x0 = -1;
            this.f81273r0 = JvmFieldSignature.getDefaultInstance();
            this.f81274s0 = JvmMethodSignature.getDefaultInstance();
            this.f81275t0 = JvmMethodSignature.getDefaultInstance();
            this.f81276u0 = JvmMethodSignature.getDefaultInstance();
            this.v0 = JvmMethodSignature.getDefaultInstance();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                JvmFieldSignature.Builder builder = (this.f81272q0 & 1) == 1 ? this.f81273r0.toBuilder() : null;
                                JvmFieldSignature jvmFieldSignature = (JvmFieldSignature) codedInputStream.readMessage(JvmFieldSignature.PARSER, extensionRegistryLite);
                                this.f81273r0 = jvmFieldSignature;
                                if (builder != null) {
                                    builder.mergeFrom(jvmFieldSignature);
                                    this.f81273r0 = builder.buildPartial();
                                }
                                this.f81272q0 |= 1;
                            } else if (tag == 18) {
                                JvmMethodSignature.Builder builder2 = (this.f81272q0 & 2) == 2 ? this.f81274s0.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature = (JvmMethodSignature) codedInputStream.readMessage(JvmMethodSignature.PARSER, extensionRegistryLite);
                                this.f81274s0 = jvmMethodSignature;
                                if (builder2 != null) {
                                    builder2.mergeFrom(jvmMethodSignature);
                                    this.f81274s0 = builder2.buildPartial();
                                }
                                this.f81272q0 |= 2;
                            } else if (tag == 26) {
                                JvmMethodSignature.Builder builder3 = (this.f81272q0 & 4) == 4 ? this.f81275t0.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature2 = (JvmMethodSignature) codedInputStream.readMessage(JvmMethodSignature.PARSER, extensionRegistryLite);
                                this.f81275t0 = jvmMethodSignature2;
                                if (builder3 != null) {
                                    builder3.mergeFrom(jvmMethodSignature2);
                                    this.f81275t0 = builder3.buildPartial();
                                }
                                this.f81272q0 |= 4;
                            } else if (tag == 34) {
                                JvmMethodSignature.Builder builder4 = (this.f81272q0 & 8) == 8 ? this.f81276u0.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature3 = (JvmMethodSignature) codedInputStream.readMessage(JvmMethodSignature.PARSER, extensionRegistryLite);
                                this.f81276u0 = jvmMethodSignature3;
                                if (builder4 != null) {
                                    builder4.mergeFrom(jvmMethodSignature3);
                                    this.f81276u0 = builder4.buildPartial();
                                }
                                this.f81272q0 |= 8;
                            } else if (tag != 42) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                JvmMethodSignature.Builder builder5 = (this.f81272q0 & 16) == 16 ? this.v0.toBuilder() : null;
                                JvmMethodSignature jvmMethodSignature4 = (JvmMethodSignature) codedInputStream.readMessage(JvmMethodSignature.PARSER, extensionRegistryLite);
                                this.v0 = jvmMethodSignature4;
                                if (builder5 != null) {
                                    builder5.mergeFrom(jvmMethodSignature4);
                                    this.v0 = builder5.buildPartial();
                                }
                                this.f81272q0 |= 16;
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f81271p0 = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e5) {
                    throw e5.setUnfinishedMessage(this);
                } catch (IOException e7) {
                    throw new InvalidProtocolBufferException(e7.getMessage()).setUnfinishedMessage(this);
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f81271p0 = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface JvmPropertySignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class StringTableTypes extends GeneratedMessageLite implements StringTableTypesOrBuilder {
        public static Parser<StringTableTypes> PARSER = new a();
        public static final StringTableTypes v0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ByteString f81284p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public List<Record> f81285q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public List<Integer> f81286r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f81287s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public byte f81288t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f81289u0;

        public static final class Builder extends GeneratedMessageLite.Builder<StringTableTypes, Builder> implements StringTableTypesOrBuilder {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public int f81290q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public List<Record> f81291r0 = Collections.emptyList();

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public List<Integer> f81292s0 = Collections.emptyList();

            public StringTableTypes buildPartial() {
                StringTableTypes stringTableTypes = new StringTableTypes(this);
                if ((this.f81290q0 & 1) == 1) {
                    this.f81291r0 = Collections.unmodifiableList(this.f81291r0);
                    this.f81290q0 &= -2;
                }
                stringTableTypes.f81285q0 = this.f81291r0;
                if ((this.f81290q0 & 2) == 2) {
                    this.f81292s0 = Collections.unmodifiableList(this.f81292s0);
                    this.f81290q0 &= -3;
                }
                stringTableTypes.f81286r0 = this.f81292s0;
                return stringTableTypes;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public StringTableTypes build() {
                StringTableTypes stringTableTypesBuildPartial = buildPartial();
                if (stringTableTypesBuildPartial.isInitialized()) {
                    return stringTableTypesBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(stringTableTypesBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public StringTableTypes getDefaultInstanceForType() {
                return StringTableTypes.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo5776clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(StringTableTypes stringTableTypes) {
                if (stringTableTypes == StringTableTypes.getDefaultInstance()) {
                    return this;
                }
                if (!stringTableTypes.f81285q0.isEmpty()) {
                    if (this.f81291r0.isEmpty()) {
                        this.f81291r0 = stringTableTypes.f81285q0;
                        this.f81290q0 &= -2;
                    } else {
                        if ((this.f81290q0 & 1) != 1) {
                            this.f81291r0 = new ArrayList(this.f81291r0);
                            this.f81290q0 |= 1;
                        }
                        this.f81291r0.addAll(stringTableTypes.f81285q0);
                    }
                }
                if (!stringTableTypes.f81286r0.isEmpty()) {
                    if (this.f81292s0.isEmpty()) {
                        this.f81292s0 = stringTableTypes.f81286r0;
                        this.f81290q0 &= -3;
                    } else {
                        if ((this.f81290q0 & 2) != 2) {
                            this.f81292s0 = new ArrayList(this.f81292s0);
                            this.f81290q0 |= 2;
                        }
                        this.f81292s0.addAll(stringTableTypes.f81286r0);
                    }
                }
                setUnknownFields(getUnknownFields().concat(stringTableTypes.f81284p0));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                StringTableTypes stringTableTypes = null;
                try {
                    try {
                        StringTableTypes partialFrom = StringTableTypes.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        StringTableTypes stringTableTypes2 = (StringTableTypes) e5.getUnfinishedMessage();
                        try {
                            throw e5;
                        } catch (Throwable th2) {
                            th = th2;
                            stringTableTypes = stringTableTypes2;
                            if (stringTableTypes != null) {
                                mergeFrom(stringTableTypes);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (stringTableTypes != null) {
                        mergeFrom(stringTableTypes);
                    }
                    throw th;
                }
            }
        }

        public static final class Record extends GeneratedMessageLite implements RecordOrBuilder {
            public static final Record G0;
            public static Parser<Record> PARSER = new a();
            public byte E0;
            public int F0;

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final ByteString f81293p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public int f81294q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public int f81295r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public int f81296s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public Object f81297t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public Operation f81298u0;
            public List<Integer> v0;

            /* JADX INFO: renamed from: w0, reason: collision with root package name */
            public int f81299w0;

            /* JADX INFO: renamed from: x0, reason: collision with root package name */
            public List<Integer> f81300x0;

            /* JADX INFO: renamed from: y0, reason: collision with root package name */
            public int f81301y0;

            public static final class Builder extends GeneratedMessageLite.Builder<Record, Builder> implements RecordOrBuilder {

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public int f81302q0;

                /* JADX INFO: renamed from: s0, reason: collision with root package name */
                public int f81304s0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public int f81303r0 = 1;

                /* JADX INFO: renamed from: t0, reason: collision with root package name */
                public Object f81305t0 = "";

                /* JADX INFO: renamed from: u0, reason: collision with root package name */
                public Operation f81306u0 = Operation.NONE;
                public List<Integer> v0 = Collections.emptyList();

                /* JADX INFO: renamed from: w0, reason: collision with root package name */
                public List<Integer> f81307w0 = Collections.emptyList();

                public Record buildPartial() {
                    Record record = new Record(this);
                    int i10 = this.f81302q0;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    record.f81295r0 = this.f81303r0;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    record.f81296s0 = this.f81304s0;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    record.f81297t0 = this.f81305t0;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    record.f81298u0 = this.f81306u0;
                    if ((i10 & 16) == 16) {
                        this.v0 = Collections.unmodifiableList(this.v0);
                        this.f81302q0 &= -17;
                    }
                    record.v0 = this.v0;
                    if ((this.f81302q0 & 32) == 32) {
                        this.f81307w0 = Collections.unmodifiableList(this.f81307w0);
                        this.f81302q0 &= -33;
                    }
                    record.f81300x0 = this.f81307w0;
                    record.f81294q0 = i11;
                    return record;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setOperation(Operation operation) {
                    operation.getClass();
                    this.f81302q0 |= 8;
                    this.f81306u0 = operation;
                    return this;
                }

                public Builder setPredefinedIndex(int i10) {
                    this.f81302q0 |= 2;
                    this.f81304s0 = i10;
                    return this;
                }

                public Builder setRange(int i10) {
                    this.f81302q0 |= 1;
                    this.f81303r0 = i10;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Record build() {
                    Record recordBuildPartial = buildPartial();
                    if (recordBuildPartial.isInitialized()) {
                        return recordBuildPartial;
                    }
                    throw AbstractMessageLite.Builder.newUninitializedMessageException(recordBuildPartial);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public Record getDefaultInstanceForType() {
                    return Record.getDefaultInstance();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo5776clone() {
                    return new Builder().mergeFrom(buildPartial());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public Builder mergeFrom(Record record) {
                    if (record == Record.getDefaultInstance()) {
                        return this;
                    }
                    if (record.hasRange()) {
                        setRange(record.getRange());
                    }
                    if (record.hasPredefinedIndex()) {
                        setPredefinedIndex(record.getPredefinedIndex());
                    }
                    if (record.hasString()) {
                        this.f81302q0 |= 4;
                        this.f81305t0 = record.f81297t0;
                    }
                    if (record.hasOperation()) {
                        setOperation(record.getOperation());
                    }
                    if (!record.v0.isEmpty()) {
                        if (this.v0.isEmpty()) {
                            this.v0 = record.v0;
                            this.f81302q0 &= -17;
                        } else {
                            if ((this.f81302q0 & 16) != 16) {
                                this.v0 = new ArrayList(this.v0);
                                this.f81302q0 |= 16;
                            }
                            this.v0.addAll(record.v0);
                        }
                    }
                    if (!record.f81300x0.isEmpty()) {
                        if (this.f81307w0.isEmpty()) {
                            this.f81307w0 = record.f81300x0;
                            this.f81302q0 &= -33;
                        } else {
                            if ((this.f81302q0 & 32) != 32) {
                                this.f81307w0 = new ArrayList(this.f81307w0);
                                this.f81302q0 |= 32;
                            }
                            this.f81307w0.addAll(record.f81300x0);
                        }
                    }
                    setUnknownFields(getUnknownFields().concat(record.f81293p0));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Record record = null;
                    try {
                        try {
                            Record partialFrom = Record.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (partialFrom != null) {
                                mergeFrom(partialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e5) {
                            Record record2 = (Record) e5.getUnfinishedMessage();
                            try {
                                throw e5;
                            } catch (Throwable th2) {
                                th = th2;
                                record = record2;
                                if (record != null) {
                                    mergeFrom(record);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (record != null) {
                            mergeFrom(record);
                        }
                        throw th;
                    }
                }
            }

            public enum Operation implements Internal.EnumLite {
                NONE(0),
                INTERNAL_TO_CLASS_ID(1),
                DESC_TO_CLASS_ID(2);

                private static Internal.EnumLiteMap<Operation> internalValueMap = new a();
                private final int value;

                public static class a implements Internal.EnumLiteMap<Operation> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                    public Operation findValueByNumber(int i10) {
                        return Operation.valueOf(i10);
                    }
                }

                Operation(int i10) {
                    this.value = i10;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.value;
                }

                public static Operation valueOf(int i10) {
                    if (i10 == 0) {
                        return NONE;
                    }
                    if (i10 == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i10 != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }
            }

            public static class a extends AbstractParser<Record> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                public Record parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Record(codedInputStream, extensionRegistryLite);
                }
            }

            static {
                Record record = new Record();
                G0 = record;
                record.f81295r0 = 1;
                record.f81296s0 = 0;
                record.f81297t0 = "";
                record.f81298u0 = Operation.NONE;
                record.v0 = Collections.emptyList();
                record.f81300x0 = Collections.emptyList();
            }

            public Record(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.f81299w0 = -1;
                this.f81301y0 = -1;
                this.E0 = (byte) -1;
                this.F0 = -1;
                this.f81293p0 = builder.getUnknownFields();
            }

            public static Record getDefaultInstance() {
                return G0;
            }

            public static Builder newBuilder(Record record) {
                return newBuilder().mergeFrom(record);
            }

            public Operation getOperation() {
                return this.f81298u0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<Record> getParserForType() {
                return PARSER;
            }

            public int getPredefinedIndex() {
                return this.f81296s0;
            }

            public int getRange() {
                return this.f81295r0;
            }

            public int getReplaceCharCount() {
                return this.f81300x0.size();
            }

            public List<Integer> getReplaceCharList() {
                return this.f81300x0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.F0;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeInt32Size = (this.f81294q0 & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f81295r0) : 0;
                if ((this.f81294q0 & 2) == 2) {
                    iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f81296s0);
                }
                if ((this.f81294q0 & 8) == 8) {
                    iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.f81298u0.getNumber());
                }
                int iComputeInt32SizeNoTag = 0;
                for (int i11 = 0; i11 < this.v0.size(); i11++) {
                    iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.v0.get(i11).intValue());
                }
                int iComputeInt32SizeNoTag2 = iComputeInt32Size + iComputeInt32SizeNoTag;
                if (!getSubstringIndexList().isEmpty()) {
                    iComputeInt32SizeNoTag2 = iComputeInt32SizeNoTag2 + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
                }
                this.f81299w0 = iComputeInt32SizeNoTag;
                int iComputeInt32SizeNoTag3 = 0;
                for (int i12 = 0; i12 < this.f81300x0.size(); i12++) {
                    iComputeInt32SizeNoTag3 += CodedOutputStream.computeInt32SizeNoTag(this.f81300x0.get(i12).intValue());
                }
                int iComputeBytesSize = iComputeInt32SizeNoTag2 + iComputeInt32SizeNoTag3;
                if (!getReplaceCharList().isEmpty()) {
                    iComputeBytesSize = iComputeBytesSize + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag3);
                }
                this.f81301y0 = iComputeInt32SizeNoTag3;
                if ((this.f81294q0 & 4) == 4) {
                    iComputeBytesSize += CodedOutputStream.computeBytesSize(6, getStringBytes());
                }
                int size = this.f81293p0.size() + iComputeBytesSize;
                this.F0 = size;
                return size;
            }

            public String getString() {
                Object obj = this.f81297t0;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.f81297t0 = stringUtf8;
                }
                return stringUtf8;
            }

            public ByteString getStringBytes() {
                Object obj = this.f81297t0;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.f81297t0 = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            public int getSubstringIndexCount() {
                return this.v0.size();
            }

            public List<Integer> getSubstringIndexList() {
                return this.v0;
            }

            public boolean hasOperation() {
                return (this.f81294q0 & 8) == 8;
            }

            public boolean hasPredefinedIndex() {
                return (this.f81294q0 & 2) == 2;
            }

            public boolean hasRange() {
                return (this.f81294q0 & 1) == 1;
            }

            public boolean hasString() {
                return (this.f81294q0 & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.E0;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.E0 = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.f81294q0 & 1) == 1) {
                    codedOutputStream.writeInt32(1, this.f81295r0);
                }
                if ((this.f81294q0 & 2) == 2) {
                    codedOutputStream.writeInt32(2, this.f81296s0);
                }
                if ((this.f81294q0 & 8) == 8) {
                    codedOutputStream.writeEnum(3, this.f81298u0.getNumber());
                }
                if (getSubstringIndexList().size() > 0) {
                    codedOutputStream.writeRawVarint32(34);
                    codedOutputStream.writeRawVarint32(this.f81299w0);
                }
                for (int i10 = 0; i10 < this.v0.size(); i10++) {
                    codedOutputStream.writeInt32NoTag(this.v0.get(i10).intValue());
                }
                if (getReplaceCharList().size() > 0) {
                    codedOutputStream.writeRawVarint32(42);
                    codedOutputStream.writeRawVarint32(this.f81301y0);
                }
                for (int i11 = 0; i11 < this.f81300x0.size(); i11++) {
                    codedOutputStream.writeInt32NoTag(this.f81300x0.get(i11).intValue());
                }
                if ((this.f81294q0 & 4) == 4) {
                    codedOutputStream.writeBytes(6, getStringBytes());
                }
                codedOutputStream.writeRawBytes(this.f81293p0);
            }

            public static Builder newBuilder() {
                return new Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Record getDefaultInstanceForType() {
                return G0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            public Record() {
                this.f81299w0 = -1;
                this.f81301y0 = -1;
                this.E0 = (byte) -1;
                this.F0 = -1;
                this.f81293p0 = ByteString.EMPTY;
            }

            public Record(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.f81299w0 = -1;
                this.f81301y0 = -1;
                this.E0 = (byte) -1;
                this.F0 = -1;
                this.f81295r0 = 1;
                boolean z10 = false;
                this.f81296s0 = 0;
                this.f81297t0 = "";
                this.f81298u0 = Operation.NONE;
                this.v0 = Collections.emptyList();
                this.f81300x0 = Collections.emptyList();
                ByteString.Output outputNewOutput = ByteString.newOutput();
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                int i10 = 0;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f81294q0 |= 1;
                                    this.f81295r0 = codedInputStream.readInt32();
                                } else if (tag == 16) {
                                    this.f81294q0 |= 2;
                                    this.f81296s0 = codedInputStream.readInt32();
                                } else if (tag == 24) {
                                    int i11 = codedInputStream.readEnum();
                                    Operation operationValueOf = Operation.valueOf(i11);
                                    if (operationValueOf == null) {
                                        codedOutputStreamNewInstance.writeRawVarint32(tag);
                                        codedOutputStreamNewInstance.writeRawVarint32(i11);
                                    } else {
                                        this.f81294q0 |= 8;
                                        this.f81298u0 = operationValueOf;
                                    }
                                } else if (tag == 32) {
                                    if ((i10 & 16) != 16) {
                                        this.v0 = new ArrayList();
                                        i10 |= 16;
                                    }
                                    this.v0.add(Integer.valueOf(codedInputStream.readInt32()));
                                } else if (tag == 34) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i10 & 16) != 16 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.v0 = new ArrayList();
                                        i10 |= 16;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.v0.add(Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                } else if (tag == 40) {
                                    if ((i10 & 32) != 32) {
                                        this.f81300x0 = new ArrayList();
                                        i10 |= 32;
                                    }
                                    this.f81300x0.add(Integer.valueOf(codedInputStream.readInt32()));
                                } else if (tag == 42) {
                                    int iPushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i10 & 32) != 32 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f81300x0 = new ArrayList();
                                        i10 |= 32;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.f81300x0.add(Integer.valueOf(codedInputStream.readInt32()));
                                    }
                                    codedInputStream.popLimit(iPushLimit2);
                                } else if (tag != 50) {
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    ByteString bytes = codedInputStream.readBytes();
                                    this.f81294q0 |= 4;
                                    this.f81297t0 = bytes;
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e5) {
                            throw e5.setUnfinishedMessage(this);
                        } catch (IOException e7) {
                            throw new InvalidProtocolBufferException(e7.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th2) {
                        if ((i10 & 16) == 16) {
                            this.v0 = Collections.unmodifiableList(this.v0);
                        }
                        if ((i10 & 32) == 32) {
                            this.f81300x0 = Collections.unmodifiableList(this.f81300x0);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f81293p0 = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                if ((i10 & 16) == 16) {
                    this.v0 = Collections.unmodifiableList(this.v0);
                }
                if ((i10 & 32) == 32) {
                    this.f81300x0 = Collections.unmodifiableList(this.f81300x0);
                }
                try {
                    codedOutputStreamNewInstance.flush();
                } catch (IOException unused2) {
                } finally {
                    this.f81293p0 = outputNewOutput.toByteString();
                }
                makeExtensionsImmutable();
            }
        }

        public interface RecordOrBuilder extends MessageLiteOrBuilder {
        }

        public static class a extends AbstractParser<StringTableTypes> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public StringTableTypes parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new StringTableTypes(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            StringTableTypes stringTableTypes = new StringTableTypes();
            v0 = stringTableTypes;
            stringTableTypes.f81285q0 = Collections.emptyList();
            stringTableTypes.f81286r0 = Collections.emptyList();
        }

        public StringTableTypes(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f81287s0 = -1;
            this.f81288t0 = (byte) -1;
            this.f81289u0 = -1;
            this.f81284p0 = builder.getUnknownFields();
        }

        public static StringTableTypes getDefaultInstance() {
            return v0;
        }

        public static Builder newBuilder(StringTableTypes stringTableTypes) {
            return newBuilder().mergeFrom(stringTableTypes);
        }

        public static StringTableTypes parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public List<Integer> getLocalNameList() {
            return this.f81286r0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<StringTableTypes> getParserForType() {
            return PARSER;
        }

        public List<Record> getRecordList() {
            return this.f81285q0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f81289u0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f81285q0.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.f81285q0.get(i11));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i12 = 0; i12 < this.f81286r0.size(); i12++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.f81286r0.get(i12).intValue());
            }
            int iComputeInt32SizeNoTag2 = iComputeMessageSize + iComputeInt32SizeNoTag;
            if (!getLocalNameList().isEmpty()) {
                iComputeInt32SizeNoTag2 = iComputeInt32SizeNoTag2 + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.f81287s0 = iComputeInt32SizeNoTag;
            int size = this.f81284p0.size() + iComputeInt32SizeNoTag2;
            this.f81289u0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f81288t0;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f81288t0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i10 = 0; i10 < this.f81285q0.size(); i10++) {
                codedOutputStream.writeMessage(1, this.f81285q0.get(i10));
            }
            if (getLocalNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(42);
                codedOutputStream.writeRawVarint32(this.f81287s0);
            }
            for (int i11 = 0; i11 < this.f81286r0.size(); i11++) {
                codedOutputStream.writeInt32NoTag(this.f81286r0.get(i11).intValue());
            }
            codedOutputStream.writeRawBytes(this.f81284p0);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public StringTableTypes getDefaultInstanceForType() {
            return v0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public StringTableTypes() {
            this.f81287s0 = -1;
            this.f81288t0 = (byte) -1;
            this.f81289u0 = -1;
            this.f81284p0 = ByteString.EMPTY;
        }

        public StringTableTypes(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f81287s0 = -1;
            this.f81288t0 = (byte) -1;
            this.f81289u0 = -1;
            this.f81285q0 = Collections.emptyList();
            this.f81286r0 = Collections.emptyList();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                if ((i10 & 1) != 1) {
                                    this.f81285q0 = new ArrayList();
                                    i10 |= 1;
                                }
                                this.f81285q0.add((Record) codedInputStream.readMessage(Record.PARSER, extensionRegistryLite));
                            } else if (tag == 40) {
                                if ((i10 & 2) != 2) {
                                    this.f81286r0 = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f81286r0.add(Integer.valueOf(codedInputStream.readInt32()));
                            } else if (tag != 42) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i10 & 2) != 2 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f81286r0 = new ArrayList();
                                    i10 |= 2;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f81286r0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if ((i10 & 1) == 1) {
                            this.f81285q0 = Collections.unmodifiableList(this.f81285q0);
                        }
                        if ((i10 & 2) == 2) {
                            this.f81286r0 = Collections.unmodifiableList(this.f81286r0);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f81284p0 = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e5) {
                    throw e5.setUnfinishedMessage(this);
                } catch (IOException e7) {
                    throw new InvalidProtocolBufferException(e7.getMessage()).setUnfinishedMessage(this);
                }
            }
            if ((i10 & 1) == 1) {
                this.f81285q0 = Collections.unmodifiableList(this.f81285q0);
            }
            if ((i10 & 2) == 2) {
                this.f81286r0 = Collections.unmodifiableList(this.f81286r0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f81284p0 = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface StringTableTypesOrBuilder extends MessageLiteOrBuilder {
    }

    static {
        ProtoBuf.Constructor defaultInstance = ProtoBuf.Constructor.getDefaultInstance();
        JvmMethodSignature defaultInstance2 = JvmMethodSignature.getDefaultInstance();
        JvmMethodSignature defaultInstance3 = JvmMethodSignature.getDefaultInstance();
        WireFormat.FieldType fieldType = WireFormat.FieldType.MESSAGE;
        constructorSignature = GeneratedMessageLite.newSingularGeneratedExtension(defaultInstance, defaultInstance2, defaultInstance3, null, 100, fieldType, JvmMethodSignature.class);
        methodSignature = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Function.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), null, 100, fieldType, JvmMethodSignature.class);
        ProtoBuf.Function defaultInstance4 = ProtoBuf.Function.getDefaultInstance();
        WireFormat.FieldType fieldType2 = WireFormat.FieldType.INT32;
        lambdaClassOriginName = GeneratedMessageLite.newSingularGeneratedExtension(defaultInstance4, 0, null, null, 101, fieldType2, Integer.class);
        propertySignature = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Property.getDefaultInstance(), JvmPropertySignature.getDefaultInstance(), JvmPropertySignature.getDefaultInstance(), null, 100, fieldType, JvmPropertySignature.class);
        flags = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Property.getDefaultInstance(), 0, null, null, 101, fieldType2, Integer.class);
        typeAnnotation = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Type.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 100, fieldType, false, ProtoBuf.Annotation.class);
        isRaw = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Type.getDefaultInstance(), Boolean.FALSE, null, null, 101, WireFormat.FieldType.BOOL, Boolean.class);
        typeParameterAnnotation = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.TypeParameter.getDefaultInstance(), ProtoBuf.Annotation.getDefaultInstance(), null, 100, fieldType, false, ProtoBuf.Annotation.class);
        classModuleName = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), 0, null, null, 101, fieldType2, Integer.class);
        classLocalVariable = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), ProtoBuf.Property.getDefaultInstance(), null, 102, fieldType, false, ProtoBuf.Property.class);
        anonymousObjectOriginName = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), 0, null, null, 103, fieldType2, Integer.class);
        jvmClassFlags = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Class.getDefaultInstance(), 0, null, null, 104, fieldType2, Integer.class);
        packageModuleName = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf.Package.getDefaultInstance(), 0, null, null, 101, fieldType2, Integer.class);
        packageLocalVariable = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf.Package.getDefaultInstance(), ProtoBuf.Property.getDefaultInstance(), null, 102, fieldType, false, ProtoBuf.Property.class);
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(constructorSignature);
        extensionRegistryLite.add(methodSignature);
        extensionRegistryLite.add(lambdaClassOriginName);
        extensionRegistryLite.add(propertySignature);
        extensionRegistryLite.add(flags);
        extensionRegistryLite.add(typeAnnotation);
        extensionRegistryLite.add(isRaw);
        extensionRegistryLite.add(typeParameterAnnotation);
        extensionRegistryLite.add(classModuleName);
        extensionRegistryLite.add(classLocalVariable);
        extensionRegistryLite.add(anonymousObjectOriginName);
        extensionRegistryLite.add(jvmClassFlags);
        extensionRegistryLite.add(packageModuleName);
        extensionRegistryLite.add(packageLocalVariable);
    }
}
