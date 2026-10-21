package kotlin.reflect.jvm.internal.impl.metadata;

import com.esotericsoftware.asm.Opcodes;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.ProtocolStringList;

/* JADX INFO: loaded from: classes12.dex */
public final class ProtoBuf {

    public static final class Annotation extends GeneratedMessageLite implements AnnotationOrBuilder {
        public static Parser<Annotation> PARSER = new a();
        public static final Annotation v0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ByteString f80959p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f80960q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f80961r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public List<Argument> f80962s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public byte f80963t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f80964u0;

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
            public static Parser<Argument> PARSER = new a();
            public static final Argument v0;

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final ByteString f80965p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public int f80966q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public int f80967r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public Value f80968s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public byte f80969t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public int f80970u0;

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public int f80971q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public int f80972r0;

                /* JADX INFO: renamed from: s0, reason: collision with root package name */
                public Value f80973s0 = Value.getDefaultInstance();

                public Argument buildPartial() {
                    Argument argument = new Argument(this);
                    int i10 = this.f80971q0;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    argument.f80967r0 = this.f80972r0;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    argument.f80968s0 = this.f80973s0;
                    argument.f80966q0 = i11;
                    return argument;
                }

                public Value getValue() {
                    return this.f80973s0;
                }

                public boolean hasNameId() {
                    return (this.f80971q0 & 1) == 1;
                }

                public boolean hasValue() {
                    return (this.f80971q0 & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasNameId() && hasValue() && getValue().isInitialized();
                }

                public Builder mergeValue(Value value) {
                    if ((this.f80971q0 & 2) != 2 || this.f80973s0 == Value.getDefaultInstance()) {
                        this.f80973s0 = value;
                    } else {
                        this.f80973s0 = Value.newBuilder(this.f80973s0).mergeFrom(value).buildPartial();
                    }
                    this.f80971q0 |= 2;
                    return this;
                }

                public Builder setNameId(int i10) {
                    this.f80971q0 |= 1;
                    this.f80972r0 = i10;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Argument build() {
                    Argument argumentBuildPartial = buildPartial();
                    if (argumentBuildPartial.isInitialized()) {
                        return argumentBuildPartial;
                    }
                    throw AbstractMessageLite.Builder.newUninitializedMessageException(argumentBuildPartial);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public Argument getDefaultInstanceForType() {
                    return Argument.getDefaultInstance();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
                public Builder mo5776clone() {
                    return new Builder().mergeFrom(buildPartial());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public Builder mergeFrom(Argument argument) {
                    if (argument == Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasNameId()) {
                        setNameId(argument.getNameId());
                    }
                    if (argument.hasValue()) {
                        mergeValue(argument.getValue());
                    }
                    setUnknownFields(getUnknownFields().concat(argument.f80965p0));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Argument argument = null;
                    try {
                        try {
                            Argument partialFrom = Argument.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (partialFrom != null) {
                                mergeFrom(partialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e5) {
                            Argument argument2 = (Argument) e5.getUnfinishedMessage();
                            try {
                                throw e5;
                            } catch (Throwable th2) {
                                th = th2;
                                argument = argument2;
                                if (argument != null) {
                                    mergeFrom(argument);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (argument != null) {
                            mergeFrom(argument);
                        }
                        throw th;
                    }
                }
            }

            public static final class Value extends GeneratedMessageLite implements ValueOrBuilder {
                public static final Value J0;
                public static Parser<Value> PARSER = new a();
                public List<Value> E0;
                public int F0;
                public int G0;
                public byte H0;
                public int I0;

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final ByteString f80974p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public int f80975q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public Type f80976r0;

                /* JADX INFO: renamed from: s0, reason: collision with root package name */
                public long f80977s0;

                /* JADX INFO: renamed from: t0, reason: collision with root package name */
                public float f80978t0;

                /* JADX INFO: renamed from: u0, reason: collision with root package name */
                public double f80979u0;
                public int v0;

                /* JADX INFO: renamed from: w0, reason: collision with root package name */
                public int f80980w0;

                /* JADX INFO: renamed from: x0, reason: collision with root package name */
                public int f80981x0;

                /* JADX INFO: renamed from: y0, reason: collision with root package name */
                public Annotation f80982y0;

                public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {
                    public int F0;
                    public int G0;

                    /* JADX INFO: renamed from: q0, reason: collision with root package name */
                    public int f80983q0;

                    /* JADX INFO: renamed from: s0, reason: collision with root package name */
                    public long f80985s0;

                    /* JADX INFO: renamed from: t0, reason: collision with root package name */
                    public float f80986t0;

                    /* JADX INFO: renamed from: u0, reason: collision with root package name */
                    public double f80987u0;
                    public int v0;

                    /* JADX INFO: renamed from: w0, reason: collision with root package name */
                    public int f80988w0;

                    /* JADX INFO: renamed from: x0, reason: collision with root package name */
                    public int f80989x0;

                    /* JADX INFO: renamed from: r0, reason: collision with root package name */
                    public Type f80984r0 = Type.BYTE;

                    /* JADX INFO: renamed from: y0, reason: collision with root package name */
                    public Annotation f80990y0 = Annotation.getDefaultInstance();
                    public List<Value> E0 = Collections.emptyList();

                    public Value buildPartial() {
                        Value value = new Value(this);
                        int i10 = this.f80983q0;
                        int i11 = (i10 & 1) != 1 ? 0 : 1;
                        value.f80976r0 = this.f80984r0;
                        if ((i10 & 2) == 2) {
                            i11 |= 2;
                        }
                        value.f80977s0 = this.f80985s0;
                        if ((i10 & 4) == 4) {
                            i11 |= 4;
                        }
                        value.f80978t0 = this.f80986t0;
                        if ((i10 & 8) == 8) {
                            i11 |= 8;
                        }
                        value.f80979u0 = this.f80987u0;
                        if ((i10 & 16) == 16) {
                            i11 |= 16;
                        }
                        value.v0 = this.v0;
                        if ((i10 & 32) == 32) {
                            i11 |= 32;
                        }
                        value.f80980w0 = this.f80988w0;
                        if ((i10 & 64) == 64) {
                            i11 |= 64;
                        }
                        value.f80981x0 = this.f80989x0;
                        if ((i10 & 128) == 128) {
                            i11 |= 128;
                        }
                        value.f80982y0 = this.f80990y0;
                        if ((i10 & 256) == 256) {
                            this.E0 = Collections.unmodifiableList(this.E0);
                            this.f80983q0 &= -257;
                        }
                        value.E0 = this.E0;
                        if ((i10 & 512) == 512) {
                            i11 |= 256;
                        }
                        value.F0 = this.F0;
                        if ((i10 & 1024) == 1024) {
                            i11 |= 512;
                        }
                        value.G0 = this.G0;
                        value.f80975q0 = i11;
                        return value;
                    }

                    public Annotation getAnnotation() {
                        return this.f80990y0;
                    }

                    public Value getArrayElement(int i10) {
                        return this.E0.get(i10);
                    }

                    public int getArrayElementCount() {
                        return this.E0.size();
                    }

                    public boolean hasAnnotation() {
                        return (this.f80983q0 & 128) == 128;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        if (hasAnnotation() && !getAnnotation().isInitialized()) {
                            return false;
                        }
                        for (int i10 = 0; i10 < getArrayElementCount(); i10++) {
                            if (!getArrayElement(i10).isInitialized()) {
                                return false;
                            }
                        }
                        return true;
                    }

                    public Builder mergeAnnotation(Annotation annotation) {
                        if ((this.f80983q0 & 128) != 128 || this.f80990y0 == Annotation.getDefaultInstance()) {
                            this.f80990y0 = annotation;
                        } else {
                            this.f80990y0 = Annotation.newBuilder(this.f80990y0).mergeFrom(annotation).buildPartial();
                        }
                        this.f80983q0 |= 128;
                        return this;
                    }

                    public Builder setArrayDimensionCount(int i10) {
                        this.f80983q0 |= 512;
                        this.F0 = i10;
                        return this;
                    }

                    public Builder setClassId(int i10) {
                        this.f80983q0 |= 32;
                        this.f80988w0 = i10;
                        return this;
                    }

                    public Builder setDoubleValue(double d2) {
                        this.f80983q0 |= 8;
                        this.f80987u0 = d2;
                        return this;
                    }

                    public Builder setEnumValueId(int i10) {
                        this.f80983q0 |= 64;
                        this.f80989x0 = i10;
                        return this;
                    }

                    public Builder setFlags(int i10) {
                        this.f80983q0 |= 1024;
                        this.G0 = i10;
                        return this;
                    }

                    public Builder setFloatValue(float f6) {
                        this.f80983q0 |= 4;
                        this.f80986t0 = f6;
                        return this;
                    }

                    public Builder setIntValue(long j10) {
                        this.f80983q0 |= 2;
                        this.f80985s0 = j10;
                        return this;
                    }

                    public Builder setStringValue(int i10) {
                        this.f80983q0 |= 16;
                        this.v0 = i10;
                        return this;
                    }

                    public Builder setType(Type type) {
                        type.getClass();
                        this.f80983q0 |= 1;
                        this.f80984r0 = type;
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    public Value build() {
                        Value valueBuildPartial = buildPartial();
                        if (valueBuildPartial.isInitialized()) {
                            return valueBuildPartial;
                        }
                        throw AbstractMessageLite.Builder.newUninitializedMessageException(valueBuildPartial);
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                    public Value getDefaultInstanceForType() {
                        return Value.getDefaultInstance();
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                    /* JADX INFO: renamed from: clone */
                    public Builder mo5776clone() {
                        return new Builder().mergeFrom(buildPartial());
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                    public Builder mergeFrom(Value value) {
                        if (value == Value.getDefaultInstance()) {
                            return this;
                        }
                        if (value.hasType()) {
                            setType(value.getType());
                        }
                        if (value.hasIntValue()) {
                            setIntValue(value.getIntValue());
                        }
                        if (value.hasFloatValue()) {
                            setFloatValue(value.getFloatValue());
                        }
                        if (value.hasDoubleValue()) {
                            setDoubleValue(value.getDoubleValue());
                        }
                        if (value.hasStringValue()) {
                            setStringValue(value.getStringValue());
                        }
                        if (value.hasClassId()) {
                            setClassId(value.getClassId());
                        }
                        if (value.hasEnumValueId()) {
                            setEnumValueId(value.getEnumValueId());
                        }
                        if (value.hasAnnotation()) {
                            mergeAnnotation(value.getAnnotation());
                        }
                        if (!value.E0.isEmpty()) {
                            if (this.E0.isEmpty()) {
                                this.E0 = value.E0;
                                this.f80983q0 &= -257;
                            } else {
                                if ((this.f80983q0 & 256) != 256) {
                                    this.E0 = new ArrayList(this.E0);
                                    this.f80983q0 |= 256;
                                }
                                this.E0.addAll(value.E0);
                            }
                        }
                        if (value.hasArrayDimensionCount()) {
                            setArrayDimensionCount(value.getArrayDimensionCount());
                        }
                        if (value.hasFlags()) {
                            setFlags(value.getFlags());
                        }
                        setUnknownFields(getUnknownFields().concat(value.f80974p0));
                        return this;
                    }

                    /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                        Value value = null;
                        try {
                            try {
                                Value partialFrom = Value.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                                if (partialFrom != null) {
                                    mergeFrom(partialFrom);
                                }
                                return this;
                            } catch (InvalidProtocolBufferException e5) {
                                Value value2 = (Value) e5.getUnfinishedMessage();
                                try {
                                    throw e5;
                                } catch (Throwable th2) {
                                    th = th2;
                                    value = value2;
                                    if (value != null) {
                                        mergeFrom(value);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (value != null) {
                                mergeFrom(value);
                            }
                            throw th;
                        }
                    }
                }

                public enum Type implements Internal.EnumLite {
                    BYTE(0),
                    CHAR(1),
                    SHORT(2),
                    INT(3),
                    LONG(4),
                    FLOAT(5),
                    DOUBLE(6),
                    BOOLEAN(7),
                    STRING(8),
                    CLASS(9),
                    ENUM(10),
                    ANNOTATION(11),
                    ARRAY(12);

                    private static Internal.EnumLiteMap<Type> internalValueMap = new a();
                    private final int value;

                    public static class a implements Internal.EnumLiteMap<Type> {
                        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                        public Type findValueByNumber(int i10) {
                            return Type.valueOf(i10);
                        }
                    }

                    Type(int i10) {
                        this.value = i10;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                    public final int getNumber() {
                        return this.value;
                    }

                    public static Type valueOf(int i10) {
                        switch (i10) {
                            case 0:
                                return BYTE;
                            case 1:
                                return CHAR;
                            case 2:
                                return SHORT;
                            case 3:
                                return INT;
                            case 4:
                                return LONG;
                            case 5:
                                return FLOAT;
                            case 6:
                                return DOUBLE;
                            case 7:
                                return BOOLEAN;
                            case 8:
                                return STRING;
                            case 9:
                                return CLASS;
                            case 10:
                                return ENUM;
                            case 11:
                                return ANNOTATION;
                            case 12:
                                return ARRAY;
                            default:
                                return null;
                        }
                    }
                }

                public static class a extends AbstractParser<Value> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                    public Value parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Value(codedInputStream, extensionRegistryLite);
                    }
                }

                static {
                    Value value = new Value();
                    J0 = value;
                    value.a();
                }

                public Value(GeneratedMessageLite.Builder builder) {
                    super(builder);
                    this.H0 = (byte) -1;
                    this.I0 = -1;
                    this.f80974p0 = builder.getUnknownFields();
                }

                public static Value getDefaultInstance() {
                    return J0;
                }

                public static Builder newBuilder(Value value) {
                    return newBuilder().mergeFrom(value);
                }

                public final void a() {
                    this.f80976r0 = Type.BYTE;
                    this.f80977s0 = 0L;
                    this.f80978t0 = 0.0f;
                    this.f80979u0 = 0.0d;
                    this.v0 = 0;
                    this.f80980w0 = 0;
                    this.f80981x0 = 0;
                    this.f80982y0 = Annotation.getDefaultInstance();
                    this.E0 = Collections.emptyList();
                    this.F0 = 0;
                    this.G0 = 0;
                }

                public Annotation getAnnotation() {
                    return this.f80982y0;
                }

                public int getArrayDimensionCount() {
                    return this.F0;
                }

                public Value getArrayElement(int i10) {
                    return this.E0.get(i10);
                }

                public int getArrayElementCount() {
                    return this.E0.size();
                }

                public List<Value> getArrayElementList() {
                    return this.E0;
                }

                public int getClassId() {
                    return this.f80980w0;
                }

                public double getDoubleValue() {
                    return this.f80979u0;
                }

                public int getEnumValueId() {
                    return this.f80981x0;
                }

                public int getFlags() {
                    return this.G0;
                }

                public float getFloatValue() {
                    return this.f80978t0;
                }

                public long getIntValue() {
                    return this.f80977s0;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public Parser<Value> getParserForType() {
                    return PARSER;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.I0;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeEnumSize = (this.f80975q0 & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.f80976r0.getNumber()) : 0;
                    if ((this.f80975q0 & 2) == 2) {
                        iComputeEnumSize += CodedOutputStream.computeSInt64Size(2, this.f80977s0);
                    }
                    if ((this.f80975q0 & 4) == 4) {
                        iComputeEnumSize += CodedOutputStream.computeFloatSize(3, this.f80978t0);
                    }
                    if ((this.f80975q0 & 8) == 8) {
                        iComputeEnumSize += CodedOutputStream.computeDoubleSize(4, this.f80979u0);
                    }
                    if ((this.f80975q0 & 16) == 16) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(5, this.v0);
                    }
                    if ((this.f80975q0 & 32) == 32) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(6, this.f80980w0);
                    }
                    if ((this.f80975q0 & 64) == 64) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(7, this.f80981x0);
                    }
                    if ((this.f80975q0 & 128) == 128) {
                        iComputeEnumSize += CodedOutputStream.computeMessageSize(8, this.f80982y0);
                    }
                    for (int i11 = 0; i11 < this.E0.size(); i11++) {
                        iComputeEnumSize += CodedOutputStream.computeMessageSize(9, this.E0.get(i11));
                    }
                    if ((this.f80975q0 & 512) == 512) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(10, this.G0);
                    }
                    if ((this.f80975q0 & 256) == 256) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(11, this.F0);
                    }
                    int size = this.f80974p0.size() + iComputeEnumSize;
                    this.I0 = size;
                    return size;
                }

                public int getStringValue() {
                    return this.v0;
                }

                public Type getType() {
                    return this.f80976r0;
                }

                public boolean hasAnnotation() {
                    return (this.f80975q0 & 128) == 128;
                }

                public boolean hasArrayDimensionCount() {
                    return (this.f80975q0 & 256) == 256;
                }

                public boolean hasClassId() {
                    return (this.f80975q0 & 32) == 32;
                }

                public boolean hasDoubleValue() {
                    return (this.f80975q0 & 8) == 8;
                }

                public boolean hasEnumValueId() {
                    return (this.f80975q0 & 64) == 64;
                }

                public boolean hasFlags() {
                    return (this.f80975q0 & 512) == 512;
                }

                public boolean hasFloatValue() {
                    return (this.f80975q0 & 4) == 4;
                }

                public boolean hasIntValue() {
                    return (this.f80975q0 & 2) == 2;
                }

                public boolean hasStringValue() {
                    return (this.f80975q0 & 16) == 16;
                }

                public boolean hasType() {
                    return (this.f80975q0 & 1) == 1;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.H0;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    if (hasAnnotation() && !getAnnotation().isInitialized()) {
                        this.H0 = (byte) 0;
                        return false;
                    }
                    for (int i10 = 0; i10 < getArrayElementCount(); i10++) {
                        if (!getArrayElement(i10).isInitialized()) {
                            this.H0 = (byte) 0;
                            return false;
                        }
                    }
                    this.H0 = (byte) 1;
                    return true;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    getSerializedSize();
                    if ((this.f80975q0 & 1) == 1) {
                        codedOutputStream.writeEnum(1, this.f80976r0.getNumber());
                    }
                    if ((this.f80975q0 & 2) == 2) {
                        codedOutputStream.writeSInt64(2, this.f80977s0);
                    }
                    if ((this.f80975q0 & 4) == 4) {
                        codedOutputStream.writeFloat(3, this.f80978t0);
                    }
                    if ((this.f80975q0 & 8) == 8) {
                        codedOutputStream.writeDouble(4, this.f80979u0);
                    }
                    if ((this.f80975q0 & 16) == 16) {
                        codedOutputStream.writeInt32(5, this.v0);
                    }
                    if ((this.f80975q0 & 32) == 32) {
                        codedOutputStream.writeInt32(6, this.f80980w0);
                    }
                    if ((this.f80975q0 & 64) == 64) {
                        codedOutputStream.writeInt32(7, this.f80981x0);
                    }
                    if ((this.f80975q0 & 128) == 128) {
                        codedOutputStream.writeMessage(8, this.f80982y0);
                    }
                    for (int i10 = 0; i10 < this.E0.size(); i10++) {
                        codedOutputStream.writeMessage(9, this.E0.get(i10));
                    }
                    if ((this.f80975q0 & 512) == 512) {
                        codedOutputStream.writeInt32(10, this.G0);
                    }
                    if ((this.f80975q0 & 256) == 256) {
                        codedOutputStream.writeInt32(11, this.F0);
                    }
                    codedOutputStream.writeRawBytes(this.f80974p0);
                }

                public static Builder newBuilder() {
                    return new Builder();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public Value getDefaultInstanceForType() {
                    return J0;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public Builder newBuilderForType() {
                    return newBuilder();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public Builder toBuilder() {
                    return newBuilder(this);
                }

                public Value() {
                    this.H0 = (byte) -1;
                    this.I0 = -1;
                    this.f80974p0 = ByteString.EMPTY;
                }

                public Value(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    this.H0 = (byte) -1;
                    this.I0 = -1;
                    a();
                    ByteString.Output outputNewOutput = ByteString.newOutput();
                    CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                    boolean z10 = false;
                    int i10 = 0;
                    while (!z10) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                switch (tag) {
                                    case 0:
                                        break;
                                    case 8:
                                        int i11 = codedInputStream.readEnum();
                                        Type typeValueOf = Type.valueOf(i11);
                                        if (typeValueOf == null) {
                                            codedOutputStreamNewInstance.writeRawVarint32(tag);
                                            codedOutputStreamNewInstance.writeRawVarint32(i11);
                                        } else {
                                            this.f80975q0 |= 1;
                                            this.f80976r0 = typeValueOf;
                                            continue;
                                        }
                                        break;
                                    case 16:
                                        this.f80975q0 |= 2;
                                        this.f80977s0 = codedInputStream.readSInt64();
                                        continue;
                                    case 29:
                                        this.f80975q0 |= 4;
                                        this.f80978t0 = codedInputStream.readFloat();
                                        continue;
                                    case 33:
                                        this.f80975q0 |= 8;
                                        this.f80979u0 = codedInputStream.readDouble();
                                        continue;
                                    case 40:
                                        this.f80975q0 |= 16;
                                        this.v0 = codedInputStream.readInt32();
                                        continue;
                                    case 48:
                                        this.f80975q0 |= 32;
                                        this.f80980w0 = codedInputStream.readInt32();
                                        continue;
                                    case 56:
                                        this.f80975q0 |= 64;
                                        this.f80981x0 = codedInputStream.readInt32();
                                        continue;
                                    case 66:
                                        Builder builder = (this.f80975q0 & 128) == 128 ? this.f80982y0.toBuilder() : null;
                                        Annotation annotation = (Annotation) codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite);
                                        this.f80982y0 = annotation;
                                        if (builder != null) {
                                            builder.mergeFrom(annotation);
                                            this.f80982y0 = builder.buildPartial();
                                        }
                                        this.f80975q0 |= 128;
                                        continue;
                                    case 74:
                                        if ((i10 & 256) != 256) {
                                            this.E0 = new ArrayList();
                                            i10 |= 256;
                                        }
                                        this.E0.add((Value) codedInputStream.readMessage(PARSER, extensionRegistryLite));
                                        continue;
                                    case 80:
                                        this.f80975q0 |= 512;
                                        this.G0 = codedInputStream.readInt32();
                                        continue;
                                    case 88:
                                        this.f80975q0 |= 256;
                                        this.F0 = codedInputStream.readInt32();
                                        continue;
                                    default:
                                        if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                            break;
                                        }
                                        break;
                                }
                                z10 = true;
                            } catch (Throwable th2) {
                                if ((i10 & 256) == 256) {
                                    this.E0 = Collections.unmodifiableList(this.E0);
                                }
                                try {
                                    codedOutputStreamNewInstance.flush();
                                } catch (IOException unused) {
                                } finally {
                                    this.f80974p0 = outputNewOutput.toByteString();
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
                    if ((i10 & 256) == 256) {
                        this.E0 = Collections.unmodifiableList(this.E0);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused2) {
                    } finally {
                        this.f80974p0 = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                }
            }

            public interface ValueOrBuilder extends MessageLiteOrBuilder {
            }

            public static class a extends AbstractParser<Argument> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                public Argument parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Argument(codedInputStream, extensionRegistryLite);
                }
            }

            static {
                Argument argument = new Argument();
                v0 = argument;
                argument.f80967r0 = 0;
                argument.f80968s0 = Value.getDefaultInstance();
            }

            public Argument(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.f80969t0 = (byte) -1;
                this.f80970u0 = -1;
                this.f80965p0 = builder.getUnknownFields();
            }

            public static Argument getDefaultInstance() {
                return v0;
            }

            public static Builder newBuilder(Argument argument) {
                return newBuilder().mergeFrom(argument);
            }

            public int getNameId() {
                return this.f80967r0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<Argument> getParserForType() {
                return PARSER;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.f80970u0;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeInt32Size = (this.f80966q0 & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f80967r0) : 0;
                if ((this.f80966q0 & 2) == 2) {
                    iComputeInt32Size += CodedOutputStream.computeMessageSize(2, this.f80968s0);
                }
                int size = this.f80965p0.size() + iComputeInt32Size;
                this.f80970u0 = size;
                return size;
            }

            public Value getValue() {
                return this.f80968s0;
            }

            public boolean hasNameId() {
                return (this.f80966q0 & 1) == 1;
            }

            public boolean hasValue() {
                return (this.f80966q0 & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f80969t0;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (!hasNameId()) {
                    this.f80969t0 = (byte) 0;
                    return false;
                }
                if (!hasValue()) {
                    this.f80969t0 = (byte) 0;
                    return false;
                }
                if (getValue().isInitialized()) {
                    this.f80969t0 = (byte) 1;
                    return true;
                }
                this.f80969t0 = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.f80966q0 & 1) == 1) {
                    codedOutputStream.writeInt32(1, this.f80967r0);
                }
                if ((this.f80966q0 & 2) == 2) {
                    codedOutputStream.writeMessage(2, this.f80968s0);
                }
                codedOutputStream.writeRawBytes(this.f80965p0);
            }

            public static Builder newBuilder() {
                return new Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Argument getDefaultInstanceForType() {
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

            public Argument() {
                this.f80969t0 = (byte) -1;
                this.f80970u0 = -1;
                this.f80965p0 = ByteString.EMPTY;
            }

            public Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.f80969t0 = (byte) -1;
                this.f80970u0 = -1;
                boolean z10 = false;
                this.f80967r0 = 0;
                this.f80968s0 = Value.getDefaultInstance();
                ByteString.Output outputNewOutput = ByteString.newOutput();
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                while (!z10) {
                    try {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 8) {
                                        this.f80966q0 |= 1;
                                        this.f80967r0 = codedInputStream.readInt32();
                                    } else if (tag != 18) {
                                        if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        Value.Builder builder = (this.f80966q0 & 2) == 2 ? this.f80968s0.toBuilder() : null;
                                        Value value = (Value) codedInputStream.readMessage(Value.PARSER, extensionRegistryLite);
                                        this.f80968s0 = value;
                                        if (builder != null) {
                                            builder.mergeFrom(value);
                                            this.f80968s0 = builder.buildPartial();
                                        }
                                        this.f80966q0 |= 2;
                                    }
                                }
                                z10 = true;
                            } catch (InvalidProtocolBufferException e5) {
                                throw e5.setUnfinishedMessage(this);
                            }
                        } catch (IOException e7) {
                            throw new InvalidProtocolBufferException(e7.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f80965p0 = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                try {
                    codedOutputStreamNewInstance.flush();
                } catch (IOException unused2) {
                } finally {
                    this.f80965p0 = outputNewOutput.toByteString();
                }
                makeExtensionsImmutable();
            }
        }

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Annotation, Builder> implements AnnotationOrBuilder {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public int f80991q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public int f80992r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public List<Argument> f80993s0 = Collections.emptyList();

            public Annotation buildPartial() {
                Annotation annotation = new Annotation(this);
                int i10 = this.f80991q0;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                annotation.f80961r0 = this.f80992r0;
                if ((i10 & 2) == 2) {
                    this.f80993s0 = Collections.unmodifiableList(this.f80993s0);
                    this.f80991q0 &= -3;
                }
                annotation.f80962s0 = this.f80993s0;
                annotation.f80960q0 = i11;
                return annotation;
            }

            public Argument getArgument(int i10) {
                return this.f80993s0.get(i10);
            }

            public int getArgumentCount() {
                return this.f80993s0.size();
            }

            public boolean hasId() {
                return (this.f80991q0 & 1) == 1;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasId()) {
                    return false;
                }
                for (int i10 = 0; i10 < getArgumentCount(); i10++) {
                    if (!getArgument(i10).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder setId(int i10) {
                this.f80991q0 |= 1;
                this.f80992r0 = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Annotation build() {
                Annotation annotationBuildPartial = buildPartial();
                if (annotationBuildPartial.isInitialized()) {
                    return annotationBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(annotationBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Annotation getDefaultInstanceForType() {
                return Annotation.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo5776clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Annotation annotation) {
                if (annotation == Annotation.getDefaultInstance()) {
                    return this;
                }
                if (annotation.hasId()) {
                    setId(annotation.getId());
                }
                if (!annotation.f80962s0.isEmpty()) {
                    if (this.f80993s0.isEmpty()) {
                        this.f80993s0 = annotation.f80962s0;
                        this.f80991q0 &= -3;
                    } else {
                        if ((this.f80991q0 & 2) != 2) {
                            this.f80993s0 = new ArrayList(this.f80993s0);
                            this.f80991q0 |= 2;
                        }
                        this.f80993s0.addAll(annotation.f80962s0);
                    }
                }
                setUnknownFields(getUnknownFields().concat(annotation.f80959p0));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Annotation annotation = null;
                try {
                    try {
                        Annotation partialFrom = Annotation.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        Annotation annotation2 = (Annotation) e5.getUnfinishedMessage();
                        try {
                            throw e5;
                        } catch (Throwable th2) {
                            th = th2;
                            annotation = annotation2;
                            if (annotation != null) {
                                mergeFrom(annotation);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (annotation != null) {
                        mergeFrom(annotation);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<Annotation> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Annotation parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Annotation(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Annotation annotation = new Annotation();
            v0 = annotation;
            annotation.f80961r0 = 0;
            annotation.f80962s0 = Collections.emptyList();
        }

        public Annotation(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f80963t0 = (byte) -1;
            this.f80964u0 = -1;
            this.f80959p0 = builder.getUnknownFields();
        }

        public static Annotation getDefaultInstance() {
            return v0;
        }

        public static Builder newBuilder(Annotation annotation) {
            return newBuilder().mergeFrom(annotation);
        }

        public Argument getArgument(int i10) {
            return this.f80962s0.get(i10);
        }

        public int getArgumentCount() {
            return this.f80962s0.size();
        }

        public List<Argument> getArgumentList() {
            return this.f80962s0;
        }

        public int getId() {
            return this.f80961r0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Annotation> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f80964u0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = (this.f80960q0 & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f80961r0) : 0;
            for (int i11 = 0; i11 < this.f80962s0.size(); i11++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(2, this.f80962s0.get(i11));
            }
            int size = this.f80959p0.size() + iComputeInt32Size;
            this.f80964u0 = size;
            return size;
        }

        public boolean hasId() {
            return (this.f80960q0 & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f80963t0;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!hasId()) {
                this.f80963t0 = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < getArgumentCount(); i10++) {
                if (!getArgument(i10).isInitialized()) {
                    this.f80963t0 = (byte) 0;
                    return false;
                }
            }
            this.f80963t0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f80960q0 & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f80961r0);
            }
            for (int i10 = 0; i10 < this.f80962s0.size(); i10++) {
                codedOutputStream.writeMessage(2, this.f80962s0.get(i10));
            }
            codedOutputStream.writeRawBytes(this.f80959p0);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Annotation getDefaultInstanceForType() {
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

        public Annotation() {
            this.f80963t0 = (byte) -1;
            this.f80964u0 = -1;
            this.f80959p0 = ByteString.EMPTY;
        }

        public Annotation(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f80963t0 = (byte) -1;
            this.f80964u0 = -1;
            boolean z10 = false;
            this.f80961r0 = 0;
            this.f80962s0 = Collections.emptyList();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.f80960q0 |= 1;
                                this.f80961r0 = codedInputStream.readInt32();
                            } else if (tag != 18) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if ((i10 & 2) != 2) {
                                    this.f80962s0 = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f80962s0.add((Argument) codedInputStream.readMessage(Argument.PARSER, extensionRegistryLite));
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e5) {
                        throw e5.setUnfinishedMessage(this);
                    } catch (IOException e7) {
                        throw new InvalidProtocolBufferException(e7.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if ((i10 & 2) == 2) {
                        this.f80962s0 = Collections.unmodifiableList(this.f80962s0);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f80959p0 = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((i10 & 2) == 2) {
                this.f80962s0 = Collections.unmodifiableList(this.f80962s0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f80959p0 = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface AnnotationOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Class extends GeneratedMessageLite.ExtendableMessage<Class> implements ClassOrBuilder {
        public static Parser<Class> PARSER = new a();

        /* JADX INFO: renamed from: d1, reason: collision with root package name */
        public static final Class f80994d1;
        public List<Integer> E0;
        public int F0;
        public List<Type> G0;
        public List<Integer> H0;
        public int I0;
        public List<Constructor> J0;
        public List<Function> K0;
        public List<Property> L0;
        public List<TypeAlias> M0;
        public List<EnumEntry> N0;
        public List<Integer> O0;
        public int P0;
        public int Q0;
        public Type R0;
        public int S0;
        public List<Integer> T0;
        public int U0;
        public List<Type> V0;
        public List<Integer> W0;
        public int X0;
        public TypeTable Y0;
        public List<Integer> Z0;

        /* JADX INFO: renamed from: a1, reason: collision with root package name */
        public VersionRequirementTable f80995a1;

        /* JADX INFO: renamed from: b1, reason: collision with root package name */
        public byte f80996b1;

        /* JADX INFO: renamed from: c1, reason: collision with root package name */
        public int f80997c1;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ByteString f80998q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f80999r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f81000s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f81001t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f81002u0;
        public List<TypeParameter> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public List<Type> f81003w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public List<Integer> f81004x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public int f81005y0;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Class, Builder> implements ClassOrBuilder {
            public int N0;
            public int P0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public int f81006s0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public int f81008u0;
            public int v0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public int f81007t0 = 6;

            /* JADX INFO: renamed from: w0, reason: collision with root package name */
            public List<TypeParameter> f81009w0 = Collections.emptyList();

            /* JADX INFO: renamed from: x0, reason: collision with root package name */
            public List<Type> f81010x0 = Collections.emptyList();

            /* JADX INFO: renamed from: y0, reason: collision with root package name */
            public List<Integer> f81011y0 = Collections.emptyList();
            public List<Integer> E0 = Collections.emptyList();
            public List<Type> F0 = Collections.emptyList();
            public List<Integer> G0 = Collections.emptyList();
            public List<Constructor> H0 = Collections.emptyList();
            public List<Function> I0 = Collections.emptyList();
            public List<Property> J0 = Collections.emptyList();
            public List<TypeAlias> K0 = Collections.emptyList();
            public List<EnumEntry> L0 = Collections.emptyList();
            public List<Integer> M0 = Collections.emptyList();
            public Type O0 = Type.getDefaultInstance();
            public List<Integer> Q0 = Collections.emptyList();
            public List<Type> R0 = Collections.emptyList();
            public List<Integer> S0 = Collections.emptyList();
            public TypeTable T0 = TypeTable.getDefaultInstance();
            public List<Integer> U0 = Collections.emptyList();
            public VersionRequirementTable V0 = VersionRequirementTable.getDefaultInstance();

            public Class buildPartial() {
                Class r1 = new Class(this);
                int i10 = this.f81006s0;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                r1.f81000s0 = this.f81007t0;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                r1.f81001t0 = this.f81008u0;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                r1.f81002u0 = this.v0;
                if ((i10 & 8) == 8) {
                    this.f81009w0 = Collections.unmodifiableList(this.f81009w0);
                    this.f81006s0 &= -9;
                }
                r1.v0 = this.f81009w0;
                if ((this.f81006s0 & 16) == 16) {
                    this.f81010x0 = Collections.unmodifiableList(this.f81010x0);
                    this.f81006s0 &= -17;
                }
                r1.f81003w0 = this.f81010x0;
                if ((this.f81006s0 & 32) == 32) {
                    this.f81011y0 = Collections.unmodifiableList(this.f81011y0);
                    this.f81006s0 &= -33;
                }
                r1.f81004x0 = this.f81011y0;
                if ((this.f81006s0 & 64) == 64) {
                    this.E0 = Collections.unmodifiableList(this.E0);
                    this.f81006s0 &= -65;
                }
                r1.E0 = this.E0;
                if ((this.f81006s0 & 128) == 128) {
                    this.F0 = Collections.unmodifiableList(this.F0);
                    this.f81006s0 &= -129;
                }
                r1.G0 = this.F0;
                if ((this.f81006s0 & 256) == 256) {
                    this.G0 = Collections.unmodifiableList(this.G0);
                    this.f81006s0 &= -257;
                }
                r1.H0 = this.G0;
                if ((this.f81006s0 & 512) == 512) {
                    this.H0 = Collections.unmodifiableList(this.H0);
                    this.f81006s0 &= -513;
                }
                r1.J0 = this.H0;
                if ((this.f81006s0 & 1024) == 1024) {
                    this.I0 = Collections.unmodifiableList(this.I0);
                    this.f81006s0 &= -1025;
                }
                r1.K0 = this.I0;
                if ((this.f81006s0 & 2048) == 2048) {
                    this.J0 = Collections.unmodifiableList(this.J0);
                    this.f81006s0 &= -2049;
                }
                r1.L0 = this.J0;
                if ((this.f81006s0 & 4096) == 4096) {
                    this.K0 = Collections.unmodifiableList(this.K0);
                    this.f81006s0 &= -4097;
                }
                r1.M0 = this.K0;
                if ((this.f81006s0 & 8192) == 8192) {
                    this.L0 = Collections.unmodifiableList(this.L0);
                    this.f81006s0 &= -8193;
                }
                r1.N0 = this.L0;
                if ((this.f81006s0 & 16384) == 16384) {
                    this.M0 = Collections.unmodifiableList(this.M0);
                    this.f81006s0 &= -16385;
                }
                r1.O0 = this.M0;
                if ((i10 & 32768) == 32768) {
                    i11 |= 8;
                }
                r1.Q0 = this.N0;
                if ((i10 & 65536) == 65536) {
                    i11 |= 16;
                }
                r1.R0 = this.O0;
                if ((i10 & 131072) == 131072) {
                    i11 |= 32;
                }
                r1.S0 = this.P0;
                if ((this.f81006s0 & 262144) == 262144) {
                    this.Q0 = Collections.unmodifiableList(this.Q0);
                    this.f81006s0 &= -262145;
                }
                r1.T0 = this.Q0;
                if ((this.f81006s0 & 524288) == 524288) {
                    this.R0 = Collections.unmodifiableList(this.R0);
                    this.f81006s0 &= -524289;
                }
                r1.V0 = this.R0;
                if ((this.f81006s0 & 1048576) == 1048576) {
                    this.S0 = Collections.unmodifiableList(this.S0);
                    this.f81006s0 &= -1048577;
                }
                r1.W0 = this.S0;
                if ((i10 & 2097152) == 2097152) {
                    i11 |= 64;
                }
                r1.Y0 = this.T0;
                if ((this.f81006s0 & 4194304) == 4194304) {
                    this.U0 = Collections.unmodifiableList(this.U0);
                    this.f81006s0 &= -4194305;
                }
                r1.Z0 = this.U0;
                if ((i10 & 8388608) == 8388608) {
                    i11 |= 128;
                }
                r1.f80995a1 = this.V0;
                r1.f80999r0 = i11;
                return r1;
            }

            public Constructor getConstructor(int i10) {
                return this.H0.get(i10);
            }

            public int getConstructorCount() {
                return this.H0.size();
            }

            public Type getContextReceiverType(int i10) {
                return this.F0.get(i10);
            }

            public int getContextReceiverTypeCount() {
                return this.F0.size();
            }

            public EnumEntry getEnumEntry(int i10) {
                return this.L0.get(i10);
            }

            public int getEnumEntryCount() {
                return this.L0.size();
            }

            public Function getFunction(int i10) {
                return this.I0.get(i10);
            }

            public int getFunctionCount() {
                return this.I0.size();
            }

            public Type getInlineClassUnderlyingType() {
                return this.O0;
            }

            public Type getMultiFieldValueClassUnderlyingType(int i10) {
                return this.R0.get(i10);
            }

            public int getMultiFieldValueClassUnderlyingTypeCount() {
                return this.R0.size();
            }

            public Property getProperty(int i10) {
                return this.J0.get(i10);
            }

            public int getPropertyCount() {
                return this.J0.size();
            }

            public Type getSupertype(int i10) {
                return this.f81010x0.get(i10);
            }

            public int getSupertypeCount() {
                return this.f81010x0.size();
            }

            public TypeAlias getTypeAlias(int i10) {
                return this.K0.get(i10);
            }

            public int getTypeAliasCount() {
                return this.K0.size();
            }

            public TypeParameter getTypeParameter(int i10) {
                return this.f81009w0.get(i10);
            }

            public int getTypeParameterCount() {
                return this.f81009w0.size();
            }

            public TypeTable getTypeTable() {
                return this.T0;
            }

            public boolean hasFqName() {
                return (this.f81006s0 & 2) == 2;
            }

            public boolean hasInlineClassUnderlyingType() {
                return (this.f81006s0 & 65536) == 65536;
            }

            public boolean hasTypeTable() {
                return (this.f81006s0 & 2097152) == 2097152;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasFqName()) {
                    return false;
                }
                for (int i10 = 0; i10 < getTypeParameterCount(); i10++) {
                    if (!getTypeParameter(i10).isInitialized()) {
                        return false;
                    }
                }
                for (int i11 = 0; i11 < getSupertypeCount(); i11++) {
                    if (!getSupertype(i11).isInitialized()) {
                        return false;
                    }
                }
                for (int i12 = 0; i12 < getContextReceiverTypeCount(); i12++) {
                    if (!getContextReceiverType(i12).isInitialized()) {
                        return false;
                    }
                }
                for (int i13 = 0; i13 < getConstructorCount(); i13++) {
                    if (!getConstructor(i13).isInitialized()) {
                        return false;
                    }
                }
                for (int i14 = 0; i14 < getFunctionCount(); i14++) {
                    if (!getFunction(i14).isInitialized()) {
                        return false;
                    }
                }
                for (int i15 = 0; i15 < getPropertyCount(); i15++) {
                    if (!getProperty(i15).isInitialized()) {
                        return false;
                    }
                }
                for (int i16 = 0; i16 < getTypeAliasCount(); i16++) {
                    if (!getTypeAlias(i16).isInitialized()) {
                        return false;
                    }
                }
                for (int i17 = 0; i17 < getEnumEntryCount(); i17++) {
                    if (!getEnumEntry(i17).isInitialized()) {
                        return false;
                    }
                }
                if (hasInlineClassUnderlyingType() && !getInlineClassUnderlyingType().isInitialized()) {
                    return false;
                }
                for (int i18 = 0; i18 < getMultiFieldValueClassUnderlyingTypeCount(); i18++) {
                    if (!getMultiFieldValueClassUnderlyingType(i18).isInitialized()) {
                        return false;
                    }
                }
                return (!hasTypeTable() || getTypeTable().isInitialized()) && extensionsAreInitialized();
            }

            public Builder mergeInlineClassUnderlyingType(Type type) {
                if ((this.f81006s0 & 65536) != 65536 || this.O0 == Type.getDefaultInstance()) {
                    this.O0 = type;
                } else {
                    this.O0 = Type.newBuilder(this.O0).mergeFrom(type).buildPartial();
                }
                this.f81006s0 |= 65536;
                return this;
            }

            public Builder mergeTypeTable(TypeTable typeTable) {
                if ((this.f81006s0 & 2097152) != 2097152 || this.T0 == TypeTable.getDefaultInstance()) {
                    this.T0 = typeTable;
                } else {
                    this.T0 = TypeTable.newBuilder(this.T0).mergeFrom(typeTable).buildPartial();
                }
                this.f81006s0 |= 2097152;
                return this;
            }

            public Builder mergeVersionRequirementTable(VersionRequirementTable versionRequirementTable) {
                if ((this.f81006s0 & 8388608) != 8388608 || this.V0 == VersionRequirementTable.getDefaultInstance()) {
                    this.V0 = versionRequirementTable;
                } else {
                    this.V0 = VersionRequirementTable.newBuilder(this.V0).mergeFrom(versionRequirementTable).buildPartial();
                }
                this.f81006s0 |= 8388608;
                return this;
            }

            public Builder setCompanionObjectName(int i10) {
                this.f81006s0 |= 4;
                this.v0 = i10;
                return this;
            }

            public Builder setFlags(int i10) {
                this.f81006s0 |= 1;
                this.f81007t0 = i10;
                return this;
            }

            public Builder setFqName(int i10) {
                this.f81006s0 |= 2;
                this.f81008u0 = i10;
                return this;
            }

            public Builder setInlineClassUnderlyingPropertyName(int i10) {
                this.f81006s0 |= 32768;
                this.N0 = i10;
                return this;
            }

            public Builder setInlineClassUnderlyingTypeId(int i10) {
                this.f81006s0 |= 131072;
                this.P0 = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Class build() {
                Class classBuildPartial = buildPartial();
                if (classBuildPartial.isInitialized()) {
                    return classBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(classBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Class getDefaultInstanceForType() {
                return Class.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Class r4) {
                if (r4 == Class.getDefaultInstance()) {
                    return this;
                }
                if (r4.hasFlags()) {
                    setFlags(r4.getFlags());
                }
                if (r4.hasFqName()) {
                    setFqName(r4.getFqName());
                }
                if (r4.hasCompanionObjectName()) {
                    setCompanionObjectName(r4.getCompanionObjectName());
                }
                if (!r4.v0.isEmpty()) {
                    if (this.f81009w0.isEmpty()) {
                        this.f81009w0 = r4.v0;
                        this.f81006s0 &= -9;
                    } else {
                        if ((this.f81006s0 & 8) != 8) {
                            this.f81009w0 = new ArrayList(this.f81009w0);
                            this.f81006s0 |= 8;
                        }
                        this.f81009w0.addAll(r4.v0);
                    }
                }
                if (!r4.f81003w0.isEmpty()) {
                    if (this.f81010x0.isEmpty()) {
                        this.f81010x0 = r4.f81003w0;
                        this.f81006s0 &= -17;
                    } else {
                        if ((this.f81006s0 & 16) != 16) {
                            this.f81010x0 = new ArrayList(this.f81010x0);
                            this.f81006s0 |= 16;
                        }
                        this.f81010x0.addAll(r4.f81003w0);
                    }
                }
                if (!r4.f81004x0.isEmpty()) {
                    if (this.f81011y0.isEmpty()) {
                        this.f81011y0 = r4.f81004x0;
                        this.f81006s0 &= -33;
                    } else {
                        if ((this.f81006s0 & 32) != 32) {
                            this.f81011y0 = new ArrayList(this.f81011y0);
                            this.f81006s0 |= 32;
                        }
                        this.f81011y0.addAll(r4.f81004x0);
                    }
                }
                if (!r4.E0.isEmpty()) {
                    if (this.E0.isEmpty()) {
                        this.E0 = r4.E0;
                        this.f81006s0 &= -65;
                    } else {
                        if ((this.f81006s0 & 64) != 64) {
                            this.E0 = new ArrayList(this.E0);
                            this.f81006s0 |= 64;
                        }
                        this.E0.addAll(r4.E0);
                    }
                }
                if (!r4.G0.isEmpty()) {
                    if (this.F0.isEmpty()) {
                        this.F0 = r4.G0;
                        this.f81006s0 &= -129;
                    } else {
                        if ((this.f81006s0 & 128) != 128) {
                            this.F0 = new ArrayList(this.F0);
                            this.f81006s0 |= 128;
                        }
                        this.F0.addAll(r4.G0);
                    }
                }
                if (!r4.H0.isEmpty()) {
                    if (this.G0.isEmpty()) {
                        this.G0 = r4.H0;
                        this.f81006s0 &= -257;
                    } else {
                        if ((this.f81006s0 & 256) != 256) {
                            this.G0 = new ArrayList(this.G0);
                            this.f81006s0 |= 256;
                        }
                        this.G0.addAll(r4.H0);
                    }
                }
                if (!r4.J0.isEmpty()) {
                    if (this.H0.isEmpty()) {
                        this.H0 = r4.J0;
                        this.f81006s0 &= -513;
                    } else {
                        if ((this.f81006s0 & 512) != 512) {
                            this.H0 = new ArrayList(this.H0);
                            this.f81006s0 |= 512;
                        }
                        this.H0.addAll(r4.J0);
                    }
                }
                if (!r4.K0.isEmpty()) {
                    if (this.I0.isEmpty()) {
                        this.I0 = r4.K0;
                        this.f81006s0 &= -1025;
                    } else {
                        if ((this.f81006s0 & 1024) != 1024) {
                            this.I0 = new ArrayList(this.I0);
                            this.f81006s0 |= 1024;
                        }
                        this.I0.addAll(r4.K0);
                    }
                }
                if (!r4.L0.isEmpty()) {
                    if (this.J0.isEmpty()) {
                        this.J0 = r4.L0;
                        this.f81006s0 &= -2049;
                    } else {
                        if ((this.f81006s0 & 2048) != 2048) {
                            this.J0 = new ArrayList(this.J0);
                            this.f81006s0 |= 2048;
                        }
                        this.J0.addAll(r4.L0);
                    }
                }
                if (!r4.M0.isEmpty()) {
                    if (this.K0.isEmpty()) {
                        this.K0 = r4.M0;
                        this.f81006s0 &= -4097;
                    } else {
                        if ((this.f81006s0 & 4096) != 4096) {
                            this.K0 = new ArrayList(this.K0);
                            this.f81006s0 |= 4096;
                        }
                        this.K0.addAll(r4.M0);
                    }
                }
                if (!r4.N0.isEmpty()) {
                    if (this.L0.isEmpty()) {
                        this.L0 = r4.N0;
                        this.f81006s0 &= -8193;
                    } else {
                        if ((this.f81006s0 & 8192) != 8192) {
                            this.L0 = new ArrayList(this.L0);
                            this.f81006s0 |= 8192;
                        }
                        this.L0.addAll(r4.N0);
                    }
                }
                if (!r4.O0.isEmpty()) {
                    if (this.M0.isEmpty()) {
                        this.M0 = r4.O0;
                        this.f81006s0 &= -16385;
                    } else {
                        if ((this.f81006s0 & 16384) != 16384) {
                            this.M0 = new ArrayList(this.M0);
                            this.f81006s0 |= 16384;
                        }
                        this.M0.addAll(r4.O0);
                    }
                }
                if (r4.hasInlineClassUnderlyingPropertyName()) {
                    setInlineClassUnderlyingPropertyName(r4.getInlineClassUnderlyingPropertyName());
                }
                if (r4.hasInlineClassUnderlyingType()) {
                    mergeInlineClassUnderlyingType(r4.getInlineClassUnderlyingType());
                }
                if (r4.hasInlineClassUnderlyingTypeId()) {
                    setInlineClassUnderlyingTypeId(r4.getInlineClassUnderlyingTypeId());
                }
                if (!r4.T0.isEmpty()) {
                    if (this.Q0.isEmpty()) {
                        this.Q0 = r4.T0;
                        this.f81006s0 &= -262145;
                    } else {
                        if ((this.f81006s0 & 262144) != 262144) {
                            this.Q0 = new ArrayList(this.Q0);
                            this.f81006s0 |= 262144;
                        }
                        this.Q0.addAll(r4.T0);
                    }
                }
                if (!r4.V0.isEmpty()) {
                    if (this.R0.isEmpty()) {
                        this.R0 = r4.V0;
                        this.f81006s0 &= -524289;
                    } else {
                        if ((this.f81006s0 & 524288) != 524288) {
                            this.R0 = new ArrayList(this.R0);
                            this.f81006s0 |= 524288;
                        }
                        this.R0.addAll(r4.V0);
                    }
                }
                if (!r4.W0.isEmpty()) {
                    if (this.S0.isEmpty()) {
                        this.S0 = r4.W0;
                        this.f81006s0 &= -1048577;
                    } else {
                        if ((this.f81006s0 & 1048576) != 1048576) {
                            this.S0 = new ArrayList(this.S0);
                            this.f81006s0 |= 1048576;
                        }
                        this.S0.addAll(r4.W0);
                    }
                }
                if (r4.hasTypeTable()) {
                    mergeTypeTable(r4.getTypeTable());
                }
                if (!r4.Z0.isEmpty()) {
                    if (this.U0.isEmpty()) {
                        this.U0 = r4.Z0;
                        this.f81006s0 &= -4194305;
                    } else {
                        if ((this.f81006s0 & 4194304) != 4194304) {
                            this.U0 = new ArrayList(this.U0);
                            this.f81006s0 |= 4194304;
                        }
                        this.U0.addAll(r4.Z0);
                    }
                }
                if (r4.hasVersionRequirementTable()) {
                    mergeVersionRequirementTable(r4.getVersionRequirementTable());
                }
                mergeExtensionFields(r4);
                setUnknownFields(getUnknownFields().concat(r4.f80998q0));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo5776clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Class r1 = null;
                try {
                    try {
                        Class partialFrom = Class.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        Class r4 = (Class) e5.getUnfinishedMessage();
                        try {
                            throw e5;
                        } catch (Throwable th2) {
                            th = th2;
                            r1 = r4;
                            if (r1 != null) {
                                mergeFrom(r1);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (r1 != null) {
                        mergeFrom(r1);
                    }
                    throw th;
                }
            }
        }

        public enum Kind implements Internal.EnumLite {
            CLASS(0),
            INTERFACE(1),
            ENUM_CLASS(2),
            ENUM_ENTRY(3),
            ANNOTATION_CLASS(4),
            OBJECT(5),
            COMPANION_OBJECT(6);

            private static Internal.EnumLiteMap<Kind> internalValueMap = new a();
            private final int value;

            public static class a implements Internal.EnumLiteMap<Kind> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public Kind findValueByNumber(int i10) {
                    return Kind.valueOf(i10);
                }
            }

            Kind(int i10) {
                this.value = i10;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static Kind valueOf(int i10) {
                switch (i10) {
                    case 0:
                        return CLASS;
                    case 1:
                        return INTERFACE;
                    case 2:
                        return ENUM_CLASS;
                    case 3:
                        return ENUM_ENTRY;
                    case 4:
                        return ANNOTATION_CLASS;
                    case 5:
                        return OBJECT;
                    case 6:
                        return COMPANION_OBJECT;
                    default:
                        return null;
                }
            }
        }

        public static class a extends AbstractParser<Class> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Class parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Class(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Class r1 = new Class();
            f80994d1 = r1;
            r1.b();
        }

        public Class(GeneratedMessageLite.ExtendableBuilder<Class, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f81005y0 = -1;
            this.F0 = -1;
            this.I0 = -1;
            this.P0 = -1;
            this.U0 = -1;
            this.X0 = -1;
            this.f80996b1 = (byte) -1;
            this.f80997c1 = -1;
            this.f80998q0 = extendableBuilder.getUnknownFields();
        }

        public static Class getDefaultInstance() {
            return f80994d1;
        }

        public static Builder newBuilder(Class r1) {
            return newBuilder().mergeFrom(r1);
        }

        public static Class parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public final void b() {
            this.f81000s0 = 6;
            this.f81001t0 = 0;
            this.f81002u0 = 0;
            this.v0 = Collections.emptyList();
            this.f81003w0 = Collections.emptyList();
            this.f81004x0 = Collections.emptyList();
            this.E0 = Collections.emptyList();
            this.G0 = Collections.emptyList();
            this.H0 = Collections.emptyList();
            this.J0 = Collections.emptyList();
            this.K0 = Collections.emptyList();
            this.L0 = Collections.emptyList();
            this.M0 = Collections.emptyList();
            this.N0 = Collections.emptyList();
            this.O0 = Collections.emptyList();
            this.Q0 = 0;
            this.R0 = Type.getDefaultInstance();
            this.S0 = 0;
            this.T0 = Collections.emptyList();
            this.V0 = Collections.emptyList();
            this.W0 = Collections.emptyList();
            this.Y0 = TypeTable.getDefaultInstance();
            this.Z0 = Collections.emptyList();
            this.f80995a1 = VersionRequirementTable.getDefaultInstance();
        }

        public int getCompanionObjectName() {
            return this.f81002u0;
        }

        public Constructor getConstructor(int i10) {
            return this.J0.get(i10);
        }

        public int getConstructorCount() {
            return this.J0.size();
        }

        public List<Constructor> getConstructorList() {
            return this.J0;
        }

        public Type getContextReceiverType(int i10) {
            return this.G0.get(i10);
        }

        public int getContextReceiverTypeCount() {
            return this.G0.size();
        }

        public List<Integer> getContextReceiverTypeIdList() {
            return this.H0;
        }

        public List<Type> getContextReceiverTypeList() {
            return this.G0;
        }

        public EnumEntry getEnumEntry(int i10) {
            return this.N0.get(i10);
        }

        public int getEnumEntryCount() {
            return this.N0.size();
        }

        public List<EnumEntry> getEnumEntryList() {
            return this.N0;
        }

        public int getFlags() {
            return this.f81000s0;
        }

        public int getFqName() {
            return this.f81001t0;
        }

        public Function getFunction(int i10) {
            return this.K0.get(i10);
        }

        public int getFunctionCount() {
            return this.K0.size();
        }

        public List<Function> getFunctionList() {
            return this.K0;
        }

        public int getInlineClassUnderlyingPropertyName() {
            return this.Q0;
        }

        public Type getInlineClassUnderlyingType() {
            return this.R0;
        }

        public int getInlineClassUnderlyingTypeId() {
            return this.S0;
        }

        public int getMultiFieldValueClassUnderlyingNameCount() {
            return this.T0.size();
        }

        public List<Integer> getMultiFieldValueClassUnderlyingNameList() {
            return this.T0;
        }

        public Type getMultiFieldValueClassUnderlyingType(int i10) {
            return this.V0.get(i10);
        }

        public int getMultiFieldValueClassUnderlyingTypeCount() {
            return this.V0.size();
        }

        public int getMultiFieldValueClassUnderlyingTypeIdCount() {
            return this.W0.size();
        }

        public List<Integer> getMultiFieldValueClassUnderlyingTypeIdList() {
            return this.W0;
        }

        public List<Type> getMultiFieldValueClassUnderlyingTypeList() {
            return this.V0;
        }

        public List<Integer> getNestedClassNameList() {
            return this.E0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Class> getParserForType() {
            return PARSER;
        }

        public Property getProperty(int i10) {
            return this.L0.get(i10);
        }

        public int getPropertyCount() {
            return this.L0.size();
        }

        public List<Property> getPropertyList() {
            return this.L0;
        }

        public List<Integer> getSealedSubclassFqNameList() {
            return this.O0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f80997c1;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = (this.f80999r0 & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f81000s0) : 0;
            int iComputeInt32SizeNoTag = 0;
            for (int i11 = 0; i11 < this.f81004x0.size(); i11++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.f81004x0.get(i11).intValue());
            }
            int iComputeMessageSize = iComputeInt32Size + iComputeInt32SizeNoTag;
            if (!getSupertypeIdList().isEmpty()) {
                iComputeMessageSize = iComputeMessageSize + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.f81005y0 = iComputeInt32SizeNoTag;
            if ((this.f80999r0 & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeInt32Size(3, this.f81001t0);
            }
            if ((this.f80999r0 & 4) == 4) {
                iComputeMessageSize += CodedOutputStream.computeInt32Size(4, this.f81002u0);
            }
            for (int i12 = 0; i12 < this.v0.size(); i12++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, this.v0.get(i12));
            }
            for (int i13 = 0; i13 < this.f81003w0.size(); i13++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, this.f81003w0.get(i13));
            }
            int iComputeInt32SizeNoTag2 = 0;
            for (int i14 = 0; i14 < this.E0.size(); i14++) {
                iComputeInt32SizeNoTag2 += CodedOutputStream.computeInt32SizeNoTag(this.E0.get(i14).intValue());
            }
            int iComputeMessageSize2 = iComputeMessageSize + iComputeInt32SizeNoTag2;
            if (!getNestedClassNameList().isEmpty()) {
                iComputeMessageSize2 = iComputeMessageSize2 + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag2);
            }
            this.F0 = iComputeInt32SizeNoTag2;
            for (int i15 = 0; i15 < this.J0.size(); i15++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(8, this.J0.get(i15));
            }
            for (int i16 = 0; i16 < this.K0.size(); i16++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(9, this.K0.get(i16));
            }
            for (int i17 = 0; i17 < this.L0.size(); i17++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(10, this.L0.get(i17));
            }
            for (int i18 = 0; i18 < this.M0.size(); i18++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(11, this.M0.get(i18));
            }
            for (int i19 = 0; i19 < this.N0.size(); i19++) {
                iComputeMessageSize2 += CodedOutputStream.computeMessageSize(13, this.N0.get(i19));
            }
            int iComputeInt32SizeNoTag3 = 0;
            for (int i20 = 0; i20 < this.O0.size(); i20++) {
                iComputeInt32SizeNoTag3 += CodedOutputStream.computeInt32SizeNoTag(this.O0.get(i20).intValue());
            }
            int iComputeMessageSize3 = iComputeMessageSize2 + iComputeInt32SizeNoTag3;
            if (!getSealedSubclassFqNameList().isEmpty()) {
                iComputeMessageSize3 = iComputeMessageSize3 + 2 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag3);
            }
            this.P0 = iComputeInt32SizeNoTag3;
            if ((this.f80999r0 & 8) == 8) {
                iComputeMessageSize3 += CodedOutputStream.computeInt32Size(17, this.Q0);
            }
            if ((this.f80999r0 & 16) == 16) {
                iComputeMessageSize3 += CodedOutputStream.computeMessageSize(18, this.R0);
            }
            if ((this.f80999r0 & 32) == 32) {
                iComputeMessageSize3 += CodedOutputStream.computeInt32Size(19, this.S0);
            }
            for (int i21 = 0; i21 < this.G0.size(); i21++) {
                iComputeMessageSize3 += CodedOutputStream.computeMessageSize(20, this.G0.get(i21));
            }
            int iComputeInt32SizeNoTag4 = 0;
            for (int i22 = 0; i22 < this.H0.size(); i22++) {
                iComputeInt32SizeNoTag4 += CodedOutputStream.computeInt32SizeNoTag(this.H0.get(i22).intValue());
            }
            int iComputeInt32SizeNoTag5 = iComputeMessageSize3 + iComputeInt32SizeNoTag4;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                iComputeInt32SizeNoTag5 = iComputeInt32SizeNoTag5 + 2 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag4);
            }
            this.I0 = iComputeInt32SizeNoTag4;
            int iComputeInt32SizeNoTag6 = 0;
            for (int i23 = 0; i23 < this.T0.size(); i23++) {
                iComputeInt32SizeNoTag6 += CodedOutputStream.computeInt32SizeNoTag(this.T0.get(i23).intValue());
            }
            int iComputeMessageSize4 = iComputeInt32SizeNoTag5 + iComputeInt32SizeNoTag6;
            if (!getMultiFieldValueClassUnderlyingNameList().isEmpty()) {
                iComputeMessageSize4 = iComputeMessageSize4 + 2 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag6);
            }
            this.U0 = iComputeInt32SizeNoTag6;
            for (int i24 = 0; i24 < this.V0.size(); i24++) {
                iComputeMessageSize4 += CodedOutputStream.computeMessageSize(23, this.V0.get(i24));
            }
            int iComputeInt32SizeNoTag7 = 0;
            for (int i25 = 0; i25 < this.W0.size(); i25++) {
                iComputeInt32SizeNoTag7 += CodedOutputStream.computeInt32SizeNoTag(this.W0.get(i25).intValue());
            }
            int iComputeMessageSize5 = iComputeMessageSize4 + iComputeInt32SizeNoTag7;
            if (!getMultiFieldValueClassUnderlyingTypeIdList().isEmpty()) {
                iComputeMessageSize5 = iComputeMessageSize5 + 2 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag7);
            }
            this.X0 = iComputeInt32SizeNoTag7;
            if ((this.f80999r0 & 64) == 64) {
                iComputeMessageSize5 += CodedOutputStream.computeMessageSize(30, this.Y0);
            }
            int iComputeInt32SizeNoTag8 = 0;
            for (int i26 = 0; i26 < this.Z0.size(); i26++) {
                iComputeInt32SizeNoTag8 += CodedOutputStream.computeInt32SizeNoTag(this.Z0.get(i26).intValue());
            }
            int size = (getVersionRequirementList().size() * 2) + iComputeMessageSize5 + iComputeInt32SizeNoTag8;
            if ((this.f80999r0 & 128) == 128) {
                size += CodedOutputStream.computeMessageSize(32, this.f80995a1);
            }
            int size2 = this.f80998q0.size() + extensionsSerializedSize() + size;
            this.f80997c1 = size2;
            return size2;
        }

        public Type getSupertype(int i10) {
            return this.f81003w0.get(i10);
        }

        public int getSupertypeCount() {
            return this.f81003w0.size();
        }

        public List<Integer> getSupertypeIdList() {
            return this.f81004x0;
        }

        public List<Type> getSupertypeList() {
            return this.f81003w0;
        }

        public TypeAlias getTypeAlias(int i10) {
            return this.M0.get(i10);
        }

        public int getTypeAliasCount() {
            return this.M0.size();
        }

        public List<TypeAlias> getTypeAliasList() {
            return this.M0;
        }

        public TypeParameter getTypeParameter(int i10) {
            return this.v0.get(i10);
        }

        public int getTypeParameterCount() {
            return this.v0.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.v0;
        }

        public TypeTable getTypeTable() {
            return this.Y0;
        }

        public List<Integer> getVersionRequirementList() {
            return this.Z0;
        }

        public VersionRequirementTable getVersionRequirementTable() {
            return this.f80995a1;
        }

        public boolean hasCompanionObjectName() {
            return (this.f80999r0 & 4) == 4;
        }

        public boolean hasFlags() {
            return (this.f80999r0 & 1) == 1;
        }

        public boolean hasFqName() {
            return (this.f80999r0 & 2) == 2;
        }

        public boolean hasInlineClassUnderlyingPropertyName() {
            return (this.f80999r0 & 8) == 8;
        }

        public boolean hasInlineClassUnderlyingType() {
            return (this.f80999r0 & 16) == 16;
        }

        public boolean hasInlineClassUnderlyingTypeId() {
            return (this.f80999r0 & 32) == 32;
        }

        public boolean hasTypeTable() {
            return (this.f80999r0 & 64) == 64;
        }

        public boolean hasVersionRequirementTable() {
            return (this.f80999r0 & 128) == 128;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f80996b1;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!hasFqName()) {
                this.f80996b1 = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < getTypeParameterCount(); i10++) {
                if (!getTypeParameter(i10).isInitialized()) {
                    this.f80996b1 = (byte) 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < getSupertypeCount(); i11++) {
                if (!getSupertype(i11).isInitialized()) {
                    this.f80996b1 = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < getContextReceiverTypeCount(); i12++) {
                if (!getContextReceiverType(i12).isInitialized()) {
                    this.f80996b1 = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < getConstructorCount(); i13++) {
                if (!getConstructor(i13).isInitialized()) {
                    this.f80996b1 = (byte) 0;
                    return false;
                }
            }
            for (int i14 = 0; i14 < getFunctionCount(); i14++) {
                if (!getFunction(i14).isInitialized()) {
                    this.f80996b1 = (byte) 0;
                    return false;
                }
            }
            for (int i15 = 0; i15 < getPropertyCount(); i15++) {
                if (!getProperty(i15).isInitialized()) {
                    this.f80996b1 = (byte) 0;
                    return false;
                }
            }
            for (int i16 = 0; i16 < getTypeAliasCount(); i16++) {
                if (!getTypeAlias(i16).isInitialized()) {
                    this.f80996b1 = (byte) 0;
                    return false;
                }
            }
            for (int i17 = 0; i17 < getEnumEntryCount(); i17++) {
                if (!getEnumEntry(i17).isInitialized()) {
                    this.f80996b1 = (byte) 0;
                    return false;
                }
            }
            if (hasInlineClassUnderlyingType() && !getInlineClassUnderlyingType().isInitialized()) {
                this.f80996b1 = (byte) 0;
                return false;
            }
            for (int i18 = 0; i18 < getMultiFieldValueClassUnderlyingTypeCount(); i18++) {
                if (!getMultiFieldValueClassUnderlyingType(i18).isInitialized()) {
                    this.f80996b1 = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.f80996b1 = (byte) 0;
                return false;
            }
            if (extensionsAreInitialized()) {
                this.f80996b1 = (byte) 1;
                return true;
            }
            this.f80996b1 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.f80999r0 & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f81000s0);
            }
            if (getSupertypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(18);
                codedOutputStream.writeRawVarint32(this.f81005y0);
            }
            for (int i10 = 0; i10 < this.f81004x0.size(); i10++) {
                codedOutputStream.writeInt32NoTag(this.f81004x0.get(i10).intValue());
            }
            if ((this.f80999r0 & 2) == 2) {
                codedOutputStream.writeInt32(3, this.f81001t0);
            }
            if ((this.f80999r0 & 4) == 4) {
                codedOutputStream.writeInt32(4, this.f81002u0);
            }
            for (int i11 = 0; i11 < this.v0.size(); i11++) {
                codedOutputStream.writeMessage(5, this.v0.get(i11));
            }
            for (int i12 = 0; i12 < this.f81003w0.size(); i12++) {
                codedOutputStream.writeMessage(6, this.f81003w0.get(i12));
            }
            if (getNestedClassNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(58);
                codedOutputStream.writeRawVarint32(this.F0);
            }
            for (int i13 = 0; i13 < this.E0.size(); i13++) {
                codedOutputStream.writeInt32NoTag(this.E0.get(i13).intValue());
            }
            for (int i14 = 0; i14 < this.J0.size(); i14++) {
                codedOutputStream.writeMessage(8, this.J0.get(i14));
            }
            for (int i15 = 0; i15 < this.K0.size(); i15++) {
                codedOutputStream.writeMessage(9, this.K0.get(i15));
            }
            for (int i16 = 0; i16 < this.L0.size(); i16++) {
                codedOutputStream.writeMessage(10, this.L0.get(i16));
            }
            for (int i17 = 0; i17 < this.M0.size(); i17++) {
                codedOutputStream.writeMessage(11, this.M0.get(i17));
            }
            for (int i18 = 0; i18 < this.N0.size(); i18++) {
                codedOutputStream.writeMessage(13, this.N0.get(i18));
            }
            if (getSealedSubclassFqNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(130);
                codedOutputStream.writeRawVarint32(this.P0);
            }
            for (int i19 = 0; i19 < this.O0.size(); i19++) {
                codedOutputStream.writeInt32NoTag(this.O0.get(i19).intValue());
            }
            if ((this.f80999r0 & 8) == 8) {
                codedOutputStream.writeInt32(17, this.Q0);
            }
            if ((this.f80999r0 & 16) == 16) {
                codedOutputStream.writeMessage(18, this.R0);
            }
            if ((this.f80999r0 & 32) == 32) {
                codedOutputStream.writeInt32(19, this.S0);
            }
            for (int i20 = 0; i20 < this.G0.size(); i20++) {
                codedOutputStream.writeMessage(20, this.G0.get(i20));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(170);
                codedOutputStream.writeRawVarint32(this.I0);
            }
            for (int i21 = 0; i21 < this.H0.size(); i21++) {
                codedOutputStream.writeInt32NoTag(this.H0.get(i21).intValue());
            }
            if (getMultiFieldValueClassUnderlyingNameList().size() > 0) {
                codedOutputStream.writeRawVarint32(178);
                codedOutputStream.writeRawVarint32(this.U0);
            }
            for (int i22 = 0; i22 < this.T0.size(); i22++) {
                codedOutputStream.writeInt32NoTag(this.T0.get(i22).intValue());
            }
            for (int i23 = 0; i23 < this.V0.size(); i23++) {
                codedOutputStream.writeMessage(23, this.V0.get(i23));
            }
            if (getMultiFieldValueClassUnderlyingTypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(Opcodes.MONITORENTER);
                codedOutputStream.writeRawVarint32(this.X0);
            }
            for (int i24 = 0; i24 < this.W0.size(); i24++) {
                codedOutputStream.writeInt32NoTag(this.W0.get(i24).intValue());
            }
            if ((this.f80999r0 & 64) == 64) {
                codedOutputStream.writeMessage(30, this.Y0);
            }
            for (int i25 = 0; i25 < this.Z0.size(); i25++) {
                codedOutputStream.writeInt32(31, this.Z0.get(i25).intValue());
            }
            if ((this.f80999r0 & 128) == 128) {
                codedOutputStream.writeMessage(32, this.f80995a1);
            }
            extensionWriterNewExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f80998q0);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Class getDefaultInstanceForType() {
            return f80994d1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Class() {
            this.f81005y0 = -1;
            this.F0 = -1;
            this.I0 = -1;
            this.P0 = -1;
            this.U0 = -1;
            this.X0 = -1;
            this.f80996b1 = (byte) -1;
            this.f80997c1 = -1;
            this.f80998q0 = ByteString.EMPTY;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Class(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            boolean z10;
            this.f81005y0 = -1;
            this.F0 = -1;
            this.I0 = -1;
            this.P0 = -1;
            this.U0 = -1;
            this.X0 = -1;
            this.f80996b1 = (byte) -1;
            this.f80997c1 = -1;
            b();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z11 = false;
            int i10 = 0;
            while (!z11) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        switch (tag) {
                            case 0:
                                z10 = true;
                                z11 = true;
                                continue;
                            case 8:
                                z10 = true;
                                this.f80999r0 |= 1;
                                this.f81000s0 = codedInputStream.readInt32();
                                continue;
                            case 16:
                                if ((i10 & 32) != 32) {
                                    this.f81004x0 = new ArrayList();
                                    i10 |= 32;
                                }
                                this.f81004x0.add(Integer.valueOf(codedInputStream.readInt32()));
                                break;
                            case 18:
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i10 & 32) != 32 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f81004x0 = new ArrayList();
                                    i10 |= 32;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f81004x0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                                break;
                            case 24:
                                this.f80999r0 |= 2;
                                this.f81001t0 = codedInputStream.readInt32();
                                break;
                            case 32:
                                this.f80999r0 |= 4;
                                this.f81002u0 = codedInputStream.readInt32();
                                break;
                            case 42:
                                if ((i10 & 8) != 8) {
                                    this.v0 = new ArrayList();
                                    i10 |= 8;
                                }
                                this.v0.add((TypeParameter) codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                                break;
                            case 50:
                                if ((i10 & 16) != 16) {
                                    this.f81003w0 = new ArrayList();
                                    i10 |= 16;
                                }
                                this.f81003w0.add((Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                                break;
                            case 56:
                                if ((i10 & 64) != 64) {
                                    this.E0 = new ArrayList();
                                    i10 |= 64;
                                }
                                this.E0.add(Integer.valueOf(codedInputStream.readInt32()));
                                break;
                            case 58:
                                int iPushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i10 & 64) != 64 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.E0 = new ArrayList();
                                    i10 |= 64;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.E0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit2);
                                break;
                            case 66:
                                if ((i10 & 512) != 512) {
                                    this.J0 = new ArrayList();
                                    i10 |= 512;
                                }
                                this.J0.add((Constructor) codedInputStream.readMessage(Constructor.PARSER, extensionRegistryLite));
                                break;
                            case 74:
                                if ((i10 & 1024) != 1024) {
                                    this.K0 = new ArrayList();
                                    i10 |= 1024;
                                }
                                this.K0.add((Function) codedInputStream.readMessage(Function.PARSER, extensionRegistryLite));
                                break;
                            case 82:
                                if ((i10 & 2048) != 2048) {
                                    this.L0 = new ArrayList();
                                    i10 |= 2048;
                                }
                                this.L0.add((Property) codedInputStream.readMessage(Property.PARSER, extensionRegistryLite));
                                break;
                            case 90:
                                if ((i10 & 4096) != 4096) {
                                    this.M0 = new ArrayList();
                                    i10 |= 4096;
                                }
                                this.M0.add((TypeAlias) codedInputStream.readMessage(TypeAlias.PARSER, extensionRegistryLite));
                                break;
                            case 106:
                                if ((i10 & 8192) != 8192) {
                                    this.N0 = new ArrayList();
                                    i10 |= 8192;
                                }
                                this.N0.add((EnumEntry) codedInputStream.readMessage(EnumEntry.PARSER, extensionRegistryLite));
                                break;
                            case 128:
                                if ((i10 & 16384) != 16384) {
                                    this.O0 = new ArrayList();
                                    i10 |= 16384;
                                }
                                this.O0.add(Integer.valueOf(codedInputStream.readInt32()));
                                break;
                            case 130:
                                int iPushLimit3 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i10 & 16384) != 16384 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.O0 = new ArrayList();
                                    i10 |= 16384;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.O0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit3);
                                break;
                            case 136:
                                this.f80999r0 |= 8;
                                this.Q0 = codedInputStream.readInt32();
                                break;
                            case 146:
                                Type.Builder builder = (this.f80999r0 & 16) == 16 ? this.R0.toBuilder() : null;
                                Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.R0 = type;
                                if (builder != 0) {
                                    builder.mergeFrom(type);
                                    this.R0 = builder.buildPartial();
                                }
                                this.f80999r0 |= 16;
                                break;
                            case 152:
                                this.f80999r0 |= 32;
                                this.S0 = codedInputStream.readInt32();
                                break;
                            case 162:
                                if ((i10 & 128) != 128) {
                                    this.G0 = new ArrayList();
                                    i10 |= 128;
                                }
                                this.G0.add((Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                                break;
                            case 168:
                                if ((i10 & 256) != 256) {
                                    this.H0 = new ArrayList();
                                    i10 |= 256;
                                }
                                this.H0.add(Integer.valueOf(codedInputStream.readInt32()));
                                break;
                            case 170:
                                int iPushLimit4 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i10 & 256) != 256 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.H0 = new ArrayList();
                                    i10 |= 256;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.H0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit4);
                                break;
                            case 176:
                                if ((i10 & 262144) != 262144) {
                                    this.T0 = new ArrayList();
                                    i10 |= 262144;
                                }
                                this.T0.add(Integer.valueOf(codedInputStream.readInt32()));
                                break;
                            case 178:
                                int iPushLimit5 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i10 & 262144) != 262144 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.T0 = new ArrayList();
                                    i10 |= 262144;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.T0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit5);
                                break;
                            case 186:
                                if ((i10 & 524288) != 524288) {
                                    this.V0 = new ArrayList();
                                    i10 |= 524288;
                                }
                                this.V0.add((Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                                break;
                            case 192:
                                if ((i10 & 1048576) != 1048576) {
                                    this.W0 = new ArrayList();
                                    i10 |= 1048576;
                                }
                                this.W0.add(Integer.valueOf(codedInputStream.readInt32()));
                                break;
                            case Opcodes.MONITORENTER /* 194 */:
                                int iPushLimit6 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i10 & 1048576) != 1048576 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.W0 = new ArrayList();
                                    i10 |= 1048576;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.W0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit6);
                                break;
                            case 242:
                                TypeTable.Builder builder2 = (this.f80999r0 & 64) == 64 ? this.Y0.toBuilder() : null;
                                TypeTable typeTable = (TypeTable) codedInputStream.readMessage(TypeTable.PARSER, extensionRegistryLite);
                                this.Y0 = typeTable;
                                if (builder2 != 0) {
                                    builder2.mergeFrom(typeTable);
                                    this.Y0 = builder2.buildPartial();
                                }
                                this.f80999r0 |= 64;
                                break;
                            case 248:
                                if ((i10 & 4194304) != 4194304) {
                                    this.Z0 = new ArrayList();
                                    i10 |= 4194304;
                                }
                                this.Z0.add(Integer.valueOf(codedInputStream.readInt32()));
                                break;
                            case 250:
                                int iPushLimit7 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i10 & 4194304) != 4194304 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.Z0 = new ArrayList();
                                    i10 |= 4194304;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.Z0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit7);
                                break;
                            case 258:
                                VersionRequirementTable.Builder builder3 = (this.f80999r0 & 128) == 128 ? this.f80995a1.toBuilder() : null;
                                VersionRequirementTable versionRequirementTable = (VersionRequirementTable) codedInputStream.readMessage(VersionRequirementTable.PARSER, extensionRegistryLite);
                                this.f80995a1 = versionRequirementTable;
                                if (builder3 != 0) {
                                    builder3.mergeFrom(versionRequirementTable);
                                    this.f80995a1 = builder3.buildPartial();
                                }
                                this.f80999r0 |= 128;
                                break;
                            default:
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    z11 = true;
                                }
                                break;
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if ((i10 & 32) == 32) {
                            this.f81004x0 = Collections.unmodifiableList(this.f81004x0);
                        }
                        if ((i10 & 8) == 8) {
                            this.v0 = Collections.unmodifiableList(this.v0);
                        }
                        if ((i10 & 16) == 16) {
                            this.f81003w0 = Collections.unmodifiableList(this.f81003w0);
                        }
                        if ((i10 & 64) == 64) {
                            this.E0 = Collections.unmodifiableList(this.E0);
                        }
                        if ((i10 & 512) == 512) {
                            this.J0 = Collections.unmodifiableList(this.J0);
                        }
                        if ((i10 & 1024) == 1024) {
                            this.K0 = Collections.unmodifiableList(this.K0);
                        }
                        if ((i10 & 2048) == 2048) {
                            this.L0 = Collections.unmodifiableList(this.L0);
                        }
                        if ((i10 & 4096) == 4096) {
                            this.M0 = Collections.unmodifiableList(this.M0);
                        }
                        if ((i10 & 8192) == 8192) {
                            this.N0 = Collections.unmodifiableList(this.N0);
                        }
                        if ((i10 & 16384) == 16384) {
                            this.O0 = Collections.unmodifiableList(this.O0);
                        }
                        if ((i10 & 128) == 128) {
                            this.G0 = Collections.unmodifiableList(this.G0);
                        }
                        if ((i10 & 256) == 256) {
                            this.H0 = Collections.unmodifiableList(this.H0);
                        }
                        if ((i10 & 262144) == 262144) {
                            this.T0 = Collections.unmodifiableList(this.T0);
                        }
                        if ((i10 & 524288) == 524288) {
                            this.V0 = Collections.unmodifiableList(this.V0);
                        }
                        if ((i10 & 1048576) == 1048576) {
                            this.W0 = Collections.unmodifiableList(this.W0);
                        }
                        if ((i10 & 4194304) == 4194304) {
                            this.Z0 = Collections.unmodifiableList(this.Z0);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f80998q0 = outputNewOutput.toByteString();
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
            if ((i10 & 32) == 32) {
                this.f81004x0 = Collections.unmodifiableList(this.f81004x0);
            }
            if ((i10 & 8) == 8) {
                this.v0 = Collections.unmodifiableList(this.v0);
            }
            if ((i10 & 16) == 16) {
                this.f81003w0 = Collections.unmodifiableList(this.f81003w0);
            }
            if ((i10 & 64) == 64) {
                this.E0 = Collections.unmodifiableList(this.E0);
            }
            if ((i10 & 512) == 512) {
                this.J0 = Collections.unmodifiableList(this.J0);
            }
            if ((i10 & 1024) == 1024) {
                this.K0 = Collections.unmodifiableList(this.K0);
            }
            if ((i10 & 2048) == 2048) {
                this.L0 = Collections.unmodifiableList(this.L0);
            }
            if ((i10 & 4096) == 4096) {
                this.M0 = Collections.unmodifiableList(this.M0);
            }
            if ((i10 & 8192) == 8192) {
                this.N0 = Collections.unmodifiableList(this.N0);
            }
            if ((i10 & 16384) == 16384) {
                this.O0 = Collections.unmodifiableList(this.O0);
            }
            if ((i10 & 128) == 128) {
                this.G0 = Collections.unmodifiableList(this.G0);
            }
            if ((i10 & 256) == 256) {
                this.H0 = Collections.unmodifiableList(this.H0);
            }
            if ((i10 & 262144) == 262144) {
                this.T0 = Collections.unmodifiableList(this.T0);
            }
            if ((i10 & 524288) == 524288) {
                this.V0 = Collections.unmodifiableList(this.V0);
            }
            if ((i10 & 1048576) == 1048576) {
                this.W0 = Collections.unmodifiableList(this.W0);
            }
            if ((i10 & 4194304) == 4194304) {
                this.Z0 = Collections.unmodifiableList(this.Z0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f80998q0 = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface ClassOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Constructor extends GeneratedMessageLite.ExtendableMessage<Constructor> implements ConstructorOrBuilder {
        public static Parser<Constructor> PARSER = new a();

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static final Constructor f81012x0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ByteString f81013q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f81014r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f81015s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public List<ValueParameter> f81016t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public List<Integer> f81017u0;
        public byte v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f81018w0;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Constructor, Builder> implements ConstructorOrBuilder {

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public int f81019s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public int f81020t0 = 6;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public List<ValueParameter> f81021u0 = Collections.emptyList();
            public List<Integer> v0 = Collections.emptyList();

            public Constructor buildPartial() {
                Constructor constructor = new Constructor(this);
                int i10 = this.f81019s0;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                constructor.f81015s0 = this.f81020t0;
                if ((i10 & 2) == 2) {
                    this.f81021u0 = Collections.unmodifiableList(this.f81021u0);
                    this.f81019s0 &= -3;
                }
                constructor.f81016t0 = this.f81021u0;
                if ((this.f81019s0 & 4) == 4) {
                    this.v0 = Collections.unmodifiableList(this.v0);
                    this.f81019s0 &= -5;
                }
                constructor.f81017u0 = this.v0;
                constructor.f81014r0 = i11;
                return constructor;
            }

            public ValueParameter getValueParameter(int i10) {
                return this.f81021u0.get(i10);
            }

            public int getValueParameterCount() {
                return this.f81021u0.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < getValueParameterCount(); i10++) {
                    if (!getValueParameter(i10).isInitialized()) {
                        return false;
                    }
                }
                return extensionsAreInitialized();
            }

            public Builder setFlags(int i10) {
                this.f81019s0 |= 1;
                this.f81020t0 = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Constructor build() {
                Constructor constructorBuildPartial = buildPartial();
                if (constructorBuildPartial.isInitialized()) {
                    return constructorBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(constructorBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Constructor getDefaultInstanceForType() {
                return Constructor.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Constructor constructor) {
                if (constructor == Constructor.getDefaultInstance()) {
                    return this;
                }
                if (constructor.hasFlags()) {
                    setFlags(constructor.getFlags());
                }
                if (!constructor.f81016t0.isEmpty()) {
                    if (this.f81021u0.isEmpty()) {
                        this.f81021u0 = constructor.f81016t0;
                        this.f81019s0 &= -3;
                    } else {
                        if ((this.f81019s0 & 2) != 2) {
                            this.f81021u0 = new ArrayList(this.f81021u0);
                            this.f81019s0 |= 2;
                        }
                        this.f81021u0.addAll(constructor.f81016t0);
                    }
                }
                if (!constructor.f81017u0.isEmpty()) {
                    if (this.v0.isEmpty()) {
                        this.v0 = constructor.f81017u0;
                        this.f81019s0 &= -5;
                    } else {
                        if ((this.f81019s0 & 4) != 4) {
                            this.v0 = new ArrayList(this.v0);
                            this.f81019s0 |= 4;
                        }
                        this.v0.addAll(constructor.f81017u0);
                    }
                }
                mergeExtensionFields(constructor);
                setUnknownFields(getUnknownFields().concat(constructor.f81013q0));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo5776clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Constructor constructor = null;
                try {
                    try {
                        Constructor partialFrom = Constructor.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        Constructor constructor2 = (Constructor) e5.getUnfinishedMessage();
                        try {
                            throw e5;
                        } catch (Throwable th2) {
                            th = th2;
                            constructor = constructor2;
                            if (constructor != null) {
                                mergeFrom(constructor);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (constructor != null) {
                        mergeFrom(constructor);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<Constructor> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Constructor parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Constructor(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Constructor constructor = new Constructor();
            f81012x0 = constructor;
            constructor.f81015s0 = 6;
            constructor.f81016t0 = Collections.emptyList();
            constructor.f81017u0 = Collections.emptyList();
        }

        public Constructor(GeneratedMessageLite.ExtendableBuilder<Constructor, ?> extendableBuilder) {
            super(extendableBuilder);
            this.v0 = (byte) -1;
            this.f81018w0 = -1;
            this.f81013q0 = extendableBuilder.getUnknownFields();
        }

        public static Constructor getDefaultInstance() {
            return f81012x0;
        }

        public static Builder newBuilder(Constructor constructor) {
            return newBuilder().mergeFrom(constructor);
        }

        public int getFlags() {
            return this.f81015s0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Constructor> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f81018w0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = (this.f81014r0 & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f81015s0) : 0;
            for (int i11 = 0; i11 < this.f81016t0.size(); i11++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(2, this.f81016t0.get(i11));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i12 = 0; i12 < this.f81017u0.size(); i12++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.f81017u0.get(i12).intValue());
            }
            int size = this.f81013q0.size() + extensionsSerializedSize() + (getVersionRequirementList().size() * 2) + iComputeInt32Size + iComputeInt32SizeNoTag;
            this.f81018w0 = size;
            return size;
        }

        public ValueParameter getValueParameter(int i10) {
            return this.f81016t0.get(i10);
        }

        public int getValueParameterCount() {
            return this.f81016t0.size();
        }

        public List<ValueParameter> getValueParameterList() {
            return this.f81016t0;
        }

        public List<Integer> getVersionRequirementList() {
            return this.f81017u0;
        }

        public boolean hasFlags() {
            return (this.f81014r0 & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.v0;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < getValueParameterCount(); i10++) {
                if (!getValueParameter(i10).isInitialized()) {
                    this.v0 = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.v0 = (byte) 1;
                return true;
            }
            this.v0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.f81014r0 & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f81015s0);
            }
            for (int i10 = 0; i10 < this.f81016t0.size(); i10++) {
                codedOutputStream.writeMessage(2, this.f81016t0.get(i10));
            }
            for (int i11 = 0; i11 < this.f81017u0.size(); i11++) {
                codedOutputStream.writeInt32(31, this.f81017u0.get(i11).intValue());
            }
            extensionWriterNewExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f81013q0);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Constructor getDefaultInstanceForType() {
            return f81012x0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Constructor() {
            this.v0 = (byte) -1;
            this.f81018w0 = -1;
            this.f81013q0 = ByteString.EMPTY;
        }

        public Constructor(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.v0 = (byte) -1;
            this.f81018w0 = -1;
            this.f81015s0 = 6;
            this.f81016t0 = Collections.emptyList();
            this.f81017u0 = Collections.emptyList();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.f81014r0 |= 1;
                                this.f81015s0 = codedInputStream.readInt32();
                            } else if (tag == 18) {
                                if ((i10 & 2) != 2) {
                                    this.f81016t0 = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f81016t0.add((ValueParameter) codedInputStream.readMessage(ValueParameter.PARSER, extensionRegistryLite));
                            } else if (tag == 248) {
                                if ((i10 & 4) != 4) {
                                    this.f81017u0 = new ArrayList();
                                    i10 |= 4;
                                }
                                this.f81017u0.add(Integer.valueOf(codedInputStream.readInt32()));
                            } else if (tag != 250) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i10 & 4) != 4 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f81017u0 = new ArrayList();
                                    i10 |= 4;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f81017u0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e5) {
                        throw e5.setUnfinishedMessage(this);
                    } catch (IOException e7) {
                        throw new InvalidProtocolBufferException(e7.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if ((i10 & 2) == 2) {
                        this.f81016t0 = Collections.unmodifiableList(this.f81016t0);
                    }
                    if ((i10 & 4) == 4) {
                        this.f81017u0 = Collections.unmodifiableList(this.f81017u0);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f81013q0 = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((i10 & 2) == 2) {
                this.f81016t0 = Collections.unmodifiableList(this.f81016t0);
            }
            if ((i10 & 4) == 4) {
                this.f81017u0 = Collections.unmodifiableList(this.f81017u0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f81013q0 = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface ConstructorOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Contract extends GeneratedMessageLite implements ContractOrBuilder {
        public static Parser<Contract> PARSER = new a();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static final Contract f81022t0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ByteString f81023p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public List<Effect> f81024q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public byte f81025r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f81026s0;

        public static final class Builder extends GeneratedMessageLite.Builder<Contract, Builder> implements ContractOrBuilder {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public int f81027q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public List<Effect> f81028r0 = Collections.emptyList();

            public Contract buildPartial() {
                Contract contract = new Contract(this);
                if ((this.f81027q0 & 1) == 1) {
                    this.f81028r0 = Collections.unmodifiableList(this.f81028r0);
                    this.f81027q0 &= -2;
                }
                contract.f81024q0 = this.f81028r0;
                return contract;
            }

            public Effect getEffect(int i10) {
                return this.f81028r0.get(i10);
            }

            public int getEffectCount() {
                return this.f81028r0.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < getEffectCount(); i10++) {
                    if (!getEffect(i10).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Contract build() {
                Contract contractBuildPartial = buildPartial();
                if (contractBuildPartial.isInitialized()) {
                    return contractBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(contractBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Contract getDefaultInstanceForType() {
                return Contract.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo5776clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Contract contract) {
                if (contract == Contract.getDefaultInstance()) {
                    return this;
                }
                if (!contract.f81024q0.isEmpty()) {
                    if (this.f81028r0.isEmpty()) {
                        this.f81028r0 = contract.f81024q0;
                        this.f81027q0 &= -2;
                    } else {
                        if ((this.f81027q0 & 1) != 1) {
                            this.f81028r0 = new ArrayList(this.f81028r0);
                            this.f81027q0 |= 1;
                        }
                        this.f81028r0.addAll(contract.f81024q0);
                    }
                }
                setUnknownFields(getUnknownFields().concat(contract.f81023p0));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Contract contract = null;
                try {
                    try {
                        Contract partialFrom = Contract.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        Contract contract2 = (Contract) e5.getUnfinishedMessage();
                        try {
                            throw e5;
                        } catch (Throwable th2) {
                            th = th2;
                            contract = contract2;
                            if (contract != null) {
                                mergeFrom(contract);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (contract != null) {
                        mergeFrom(contract);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<Contract> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Contract parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Contract(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Contract contract = new Contract();
            f81022t0 = contract;
            contract.f81024q0 = Collections.emptyList();
        }

        public Contract(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f81025r0 = (byte) -1;
            this.f81026s0 = -1;
            this.f81023p0 = builder.getUnknownFields();
        }

        public static Contract getDefaultInstance() {
            return f81022t0;
        }

        public static Builder newBuilder(Contract contract) {
            return newBuilder().mergeFrom(contract);
        }

        public Effect getEffect(int i10) {
            return this.f81024q0.get(i10);
        }

        public int getEffectCount() {
            return this.f81024q0.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Contract> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f81026s0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f81024q0.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.f81024q0.get(i11));
            }
            int size = this.f81023p0.size() + iComputeMessageSize;
            this.f81026s0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f81025r0;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < getEffectCount(); i10++) {
                if (!getEffect(i10).isInitialized()) {
                    this.f81025r0 = (byte) 0;
                    return false;
                }
            }
            this.f81025r0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i10 = 0; i10 < this.f81024q0.size(); i10++) {
                codedOutputStream.writeMessage(1, this.f81024q0.get(i10));
            }
            codedOutputStream.writeRawBytes(this.f81023p0);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Contract getDefaultInstanceForType() {
            return f81022t0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Contract() {
            this.f81025r0 = (byte) -1;
            this.f81026s0 = -1;
            this.f81023p0 = ByteString.EMPTY;
        }

        public Contract(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f81025r0 = (byte) -1;
            this.f81026s0 = -1;
            this.f81024q0 = Collections.emptyList();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 10) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if (!(z11 & true)) {
                                    this.f81024q0 = new ArrayList();
                                    z11 |= true;
                                }
                                this.f81024q0.add((Effect) codedInputStream.readMessage(Effect.PARSER, extensionRegistryLite));
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if (z11 & true) {
                            this.f81024q0 = Collections.unmodifiableList(this.f81024q0);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f81023p0 = outputNewOutput.toByteString();
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
            if (z11 & true) {
                this.f81024q0 = Collections.unmodifiableList(this.f81024q0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f81023p0 = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface ContractOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Effect extends GeneratedMessageLite implements EffectOrBuilder {
        public static Parser<Effect> PARSER = new a();

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static final Effect f81029x0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ByteString f81030p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f81031q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public EffectType f81032r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public List<Expression> f81033s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Expression f81034t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public InvocationKind f81035u0;
        public byte v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f81036w0;

        public static final class Builder extends GeneratedMessageLite.Builder<Effect, Builder> implements EffectOrBuilder {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public int f81037q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public EffectType f81038r0 = EffectType.RETURNS_CONSTANT;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public List<Expression> f81039s0 = Collections.emptyList();

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public Expression f81040t0 = Expression.getDefaultInstance();

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public InvocationKind f81041u0 = InvocationKind.AT_MOST_ONCE;

            public Effect buildPartial() {
                Effect effect = new Effect(this);
                int i10 = this.f81037q0;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                effect.f81032r0 = this.f81038r0;
                if ((i10 & 2) == 2) {
                    this.f81039s0 = Collections.unmodifiableList(this.f81039s0);
                    this.f81037q0 &= -3;
                }
                effect.f81033s0 = this.f81039s0;
                if ((i10 & 4) == 4) {
                    i11 |= 2;
                }
                effect.f81034t0 = this.f81040t0;
                if ((i10 & 8) == 8) {
                    i11 |= 4;
                }
                effect.f81035u0 = this.f81041u0;
                effect.f81031q0 = i11;
                return effect;
            }

            public Expression getConclusionOfConditionalEffect() {
                return this.f81040t0;
            }

            public Expression getEffectConstructorArgument(int i10) {
                return this.f81039s0.get(i10);
            }

            public int getEffectConstructorArgumentCount() {
                return this.f81039s0.size();
            }

            public boolean hasConclusionOfConditionalEffect() {
                return (this.f81037q0 & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < getEffectConstructorArgumentCount(); i10++) {
                    if (!getEffectConstructorArgument(i10).isInitialized()) {
                        return false;
                    }
                }
                return !hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized();
            }

            public Builder mergeConclusionOfConditionalEffect(Expression expression) {
                if ((this.f81037q0 & 4) != 4 || this.f81040t0 == Expression.getDefaultInstance()) {
                    this.f81040t0 = expression;
                } else {
                    this.f81040t0 = Expression.newBuilder(this.f81040t0).mergeFrom(expression).buildPartial();
                }
                this.f81037q0 |= 4;
                return this;
            }

            public Builder setEffectType(EffectType effectType) {
                effectType.getClass();
                this.f81037q0 |= 1;
                this.f81038r0 = effectType;
                return this;
            }

            public Builder setKind(InvocationKind invocationKind) {
                invocationKind.getClass();
                this.f81037q0 |= 8;
                this.f81041u0 = invocationKind;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Effect build() {
                Effect effectBuildPartial = buildPartial();
                if (effectBuildPartial.isInitialized()) {
                    return effectBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(effectBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Effect getDefaultInstanceForType() {
                return Effect.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo5776clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Effect effect) {
                if (effect == Effect.getDefaultInstance()) {
                    return this;
                }
                if (effect.hasEffectType()) {
                    setEffectType(effect.getEffectType());
                }
                if (!effect.f81033s0.isEmpty()) {
                    if (this.f81039s0.isEmpty()) {
                        this.f81039s0 = effect.f81033s0;
                        this.f81037q0 &= -3;
                    } else {
                        if ((this.f81037q0 & 2) != 2) {
                            this.f81039s0 = new ArrayList(this.f81039s0);
                            this.f81037q0 |= 2;
                        }
                        this.f81039s0.addAll(effect.f81033s0);
                    }
                }
                if (effect.hasConclusionOfConditionalEffect()) {
                    mergeConclusionOfConditionalEffect(effect.getConclusionOfConditionalEffect());
                }
                if (effect.hasKind()) {
                    setKind(effect.getKind());
                }
                setUnknownFields(getUnknownFields().concat(effect.f81030p0));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Effect effect = null;
                try {
                    try {
                        Effect partialFrom = Effect.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        Effect effect2 = (Effect) e5.getUnfinishedMessage();
                        try {
                            throw e5;
                        } catch (Throwable th2) {
                            th = th2;
                            effect = effect2;
                            if (effect != null) {
                                mergeFrom(effect);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (effect != null) {
                        mergeFrom(effect);
                    }
                    throw th;
                }
            }
        }

        public enum EffectType implements Internal.EnumLite {
            RETURNS_CONSTANT(0),
            CALLS(1),
            RETURNS_NOT_NULL(2);

            private static Internal.EnumLiteMap<EffectType> internalValueMap = new a();
            private final int value;

            public static class a implements Internal.EnumLiteMap<EffectType> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public EffectType findValueByNumber(int i10) {
                    return EffectType.valueOf(i10);
                }
            }

            EffectType(int i10) {
                this.value = i10;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static EffectType valueOf(int i10) {
                if (i10 == 0) {
                    return RETURNS_CONSTANT;
                }
                if (i10 == 1) {
                    return CALLS;
                }
                if (i10 != 2) {
                    return null;
                }
                return RETURNS_NOT_NULL;
            }
        }

        public enum InvocationKind implements Internal.EnumLite {
            AT_MOST_ONCE(0),
            EXACTLY_ONCE(1),
            AT_LEAST_ONCE(2);

            private static Internal.EnumLiteMap<InvocationKind> internalValueMap = new a();
            private final int value;

            public static class a implements Internal.EnumLiteMap<InvocationKind> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public InvocationKind findValueByNumber(int i10) {
                    return InvocationKind.valueOf(i10);
                }
            }

            InvocationKind(int i10) {
                this.value = i10;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static InvocationKind valueOf(int i10) {
                if (i10 == 0) {
                    return AT_MOST_ONCE;
                }
                if (i10 == 1) {
                    return EXACTLY_ONCE;
                }
                if (i10 != 2) {
                    return null;
                }
                return AT_LEAST_ONCE;
            }
        }

        public static class a extends AbstractParser<Effect> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Effect parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Effect(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Effect effect = new Effect();
            f81029x0 = effect;
            effect.f81032r0 = EffectType.RETURNS_CONSTANT;
            effect.f81033s0 = Collections.emptyList();
            effect.f81034t0 = Expression.getDefaultInstance();
            effect.f81035u0 = InvocationKind.AT_MOST_ONCE;
        }

        public Effect(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.v0 = (byte) -1;
            this.f81036w0 = -1;
            this.f81030p0 = builder.getUnknownFields();
        }

        public static Effect getDefaultInstance() {
            return f81029x0;
        }

        public static Builder newBuilder(Effect effect) {
            return newBuilder().mergeFrom(effect);
        }

        public Expression getConclusionOfConditionalEffect() {
            return this.f81034t0;
        }

        public Expression getEffectConstructorArgument(int i10) {
            return this.f81033s0.get(i10);
        }

        public int getEffectConstructorArgumentCount() {
            return this.f81033s0.size();
        }

        public EffectType getEffectType() {
            return this.f81032r0;
        }

        public InvocationKind getKind() {
            return this.f81035u0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Effect> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f81036w0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeEnumSize = (this.f81031q0 & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.f81032r0.getNumber()) : 0;
            for (int i11 = 0; i11 < this.f81033s0.size(); i11++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, this.f81033s0.get(i11));
            }
            if ((this.f81031q0 & 2) == 2) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, this.f81034t0);
            }
            if ((this.f81031q0 & 4) == 4) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(4, this.f81035u0.getNumber());
            }
            int size = this.f81030p0.size() + iComputeEnumSize;
            this.f81036w0 = size;
            return size;
        }

        public boolean hasConclusionOfConditionalEffect() {
            return (this.f81031q0 & 2) == 2;
        }

        public boolean hasEffectType() {
            return (this.f81031q0 & 1) == 1;
        }

        public boolean hasKind() {
            return (this.f81031q0 & 4) == 4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.v0;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < getEffectConstructorArgumentCount(); i10++) {
                if (!getEffectConstructorArgument(i10).isInitialized()) {
                    this.v0 = (byte) 0;
                    return false;
                }
            }
            if (!hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized()) {
                this.v0 = (byte) 1;
                return true;
            }
            this.v0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f81031q0 & 1) == 1) {
                codedOutputStream.writeEnum(1, this.f81032r0.getNumber());
            }
            for (int i10 = 0; i10 < this.f81033s0.size(); i10++) {
                codedOutputStream.writeMessage(2, this.f81033s0.get(i10));
            }
            if ((this.f81031q0 & 2) == 2) {
                codedOutputStream.writeMessage(3, this.f81034t0);
            }
            if ((this.f81031q0 & 4) == 4) {
                codedOutputStream.writeEnum(4, this.f81035u0.getNumber());
            }
            codedOutputStream.writeRawBytes(this.f81030p0);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Effect getDefaultInstanceForType() {
            return f81029x0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Effect() {
            this.v0 = (byte) -1;
            this.f81036w0 = -1;
            this.f81030p0 = ByteString.EMPTY;
        }

        public Effect(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.v0 = (byte) -1;
            this.f81036w0 = -1;
            this.f81032r0 = EffectType.RETURNS_CONSTANT;
            this.f81033s0 = Collections.emptyList();
            this.f81034t0 = Expression.getDefaultInstance();
            this.f81035u0 = InvocationKind.AT_MOST_ONCE;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    int i11 = codedInputStream.readEnum();
                                    EffectType effectTypeValueOf = EffectType.valueOf(i11);
                                    if (effectTypeValueOf == null) {
                                        codedOutputStreamNewInstance.writeRawVarint32(tag);
                                        codedOutputStreamNewInstance.writeRawVarint32(i11);
                                    } else {
                                        this.f81031q0 |= 1;
                                        this.f81032r0 = effectTypeValueOf;
                                    }
                                } else if (tag == 18) {
                                    if ((i10 & 2) != 2) {
                                        this.f81033s0 = new ArrayList();
                                        i10 |= 2;
                                    }
                                    this.f81033s0.add((Expression) codedInputStream.readMessage(Expression.PARSER, extensionRegistryLite));
                                } else if (tag == 26) {
                                    Expression.Builder builder = (this.f81031q0 & 2) == 2 ? this.f81034t0.toBuilder() : null;
                                    Expression expression = (Expression) codedInputStream.readMessage(Expression.PARSER, extensionRegistryLite);
                                    this.f81034t0 = expression;
                                    if (builder != null) {
                                        builder.mergeFrom(expression);
                                        this.f81034t0 = builder.buildPartial();
                                    }
                                    this.f81031q0 |= 2;
                                } else if (tag != 32) {
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int i12 = codedInputStream.readEnum();
                                    InvocationKind invocationKindValueOf = InvocationKind.valueOf(i12);
                                    if (invocationKindValueOf == null) {
                                        codedOutputStreamNewInstance.writeRawVarint32(tag);
                                        codedOutputStreamNewInstance.writeRawVarint32(i12);
                                    } else {
                                        this.f81031q0 |= 4;
                                        this.f81035u0 = invocationKindValueOf;
                                    }
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e5) {
                            throw e5.setUnfinishedMessage(this);
                        }
                    } catch (IOException e7) {
                        throw new InvalidProtocolBufferException(e7.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if ((i10 & 2) == 2) {
                        this.f81033s0 = Collections.unmodifiableList(this.f81033s0);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f81030p0 = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((i10 & 2) == 2) {
                this.f81033s0 = Collections.unmodifiableList(this.f81033s0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f81030p0 = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface EffectOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class EnumEntry extends GeneratedMessageLite.ExtendableMessage<EnumEntry> implements EnumEntryOrBuilder {
        public static Parser<EnumEntry> PARSER = new a();
        public static final EnumEntry v0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ByteString f81042q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f81043r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f81044s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public byte f81045t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f81046u0;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<EnumEntry, Builder> implements EnumEntryOrBuilder {

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public int f81047s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public int f81048t0;

            public EnumEntry buildPartial() {
                EnumEntry enumEntry = new EnumEntry(this);
                int i10 = (this.f81047s0 & 1) != 1 ? 0 : 1;
                enumEntry.f81044s0 = this.f81048t0;
                enumEntry.f81043r0 = i10;
                return enumEntry;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return extensionsAreInitialized();
            }

            public Builder setName(int i10) {
                this.f81047s0 |= 1;
                this.f81048t0 = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public EnumEntry build() {
                EnumEntry enumEntryBuildPartial = buildPartial();
                if (enumEntryBuildPartial.isInitialized()) {
                    return enumEntryBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(enumEntryBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public EnumEntry getDefaultInstanceForType() {
                return EnumEntry.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(EnumEntry enumEntry) {
                if (enumEntry == EnumEntry.getDefaultInstance()) {
                    return this;
                }
                if (enumEntry.hasName()) {
                    setName(enumEntry.getName());
                }
                mergeExtensionFields(enumEntry);
                setUnknownFields(getUnknownFields().concat(enumEntry.f81042q0));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo5776clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                EnumEntry enumEntry = null;
                try {
                    try {
                        EnumEntry partialFrom = EnumEntry.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        EnumEntry enumEntry2 = (EnumEntry) e5.getUnfinishedMessage();
                        try {
                            throw e5;
                        } catch (Throwable th2) {
                            th = th2;
                            enumEntry = enumEntry2;
                            if (enumEntry != null) {
                                mergeFrom(enumEntry);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (enumEntry != null) {
                        mergeFrom(enumEntry);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<EnumEntry> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public EnumEntry parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new EnumEntry(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            EnumEntry enumEntry = new EnumEntry();
            v0 = enumEntry;
            enumEntry.f81044s0 = 0;
        }

        public EnumEntry(GeneratedMessageLite.ExtendableBuilder<EnumEntry, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f81045t0 = (byte) -1;
            this.f81046u0 = -1;
            this.f81042q0 = extendableBuilder.getUnknownFields();
        }

        public static EnumEntry getDefaultInstance() {
            return v0;
        }

        public static Builder newBuilder(EnumEntry enumEntry) {
            return newBuilder().mergeFrom(enumEntry);
        }

        public int getName() {
            return this.f81044s0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<EnumEntry> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f81046u0;
            if (i10 != -1) {
                return i10;
            }
            int size = this.f81042q0.size() + extensionsSerializedSize() + ((this.f81043r0 & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f81044s0) : 0);
            this.f81046u0 = size;
            return size;
        }

        public boolean hasName() {
            return (this.f81043r0 & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f81045t0;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (extensionsAreInitialized()) {
                this.f81045t0 = (byte) 1;
                return true;
            }
            this.f81045t0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.f81043r0 & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f81044s0);
            }
            extensionWriterNewExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f81042q0);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public EnumEntry getDefaultInstanceForType() {
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

        public EnumEntry() {
            this.f81045t0 = (byte) -1;
            this.f81046u0 = -1;
            this.f81042q0 = ByteString.EMPTY;
        }

        public EnumEntry(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f81045t0 = (byte) -1;
            this.f81046u0 = -1;
            boolean z10 = false;
            this.f81044s0 = 0;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 8) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.f81043r0 |= 1;
                                this.f81044s0 = codedInputStream.readInt32();
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e5) {
                        throw e5.setUnfinishedMessage(this);
                    } catch (IOException e7) {
                        throw new InvalidProtocolBufferException(e7.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f81042q0 = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f81042q0 = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface EnumEntryOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Expression extends GeneratedMessageLite implements ExpressionOrBuilder {
        public static final Expression F0;
        public static Parser<Expression> PARSER = new a();
        public int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ByteString f81049p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f81050q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f81051r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f81052s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public ConstantValue f81053t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Type f81054u0;
        public int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public List<Expression> f81055w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public List<Expression> f81056x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public byte f81057y0;

        public static final class Builder extends GeneratedMessageLite.Builder<Expression, Builder> implements ExpressionOrBuilder {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public int f81058q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public int f81059r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public int f81060s0;
            public int v0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public ConstantValue f81061t0 = ConstantValue.TRUE;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public Type f81062u0 = Type.getDefaultInstance();

            /* JADX INFO: renamed from: w0, reason: collision with root package name */
            public List<Expression> f81063w0 = Collections.emptyList();

            /* JADX INFO: renamed from: x0, reason: collision with root package name */
            public List<Expression> f81064x0 = Collections.emptyList();

            public Expression buildPartial() {
                Expression expression = new Expression(this);
                int i10 = this.f81058q0;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                expression.f81051r0 = this.f81059r0;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                expression.f81052s0 = this.f81060s0;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                expression.f81053t0 = this.f81061t0;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                expression.f81054u0 = this.f81062u0;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                expression.v0 = this.v0;
                if ((i10 & 32) == 32) {
                    this.f81063w0 = Collections.unmodifiableList(this.f81063w0);
                    this.f81058q0 &= -33;
                }
                expression.f81055w0 = this.f81063w0;
                if ((this.f81058q0 & 64) == 64) {
                    this.f81064x0 = Collections.unmodifiableList(this.f81064x0);
                    this.f81058q0 &= -65;
                }
                expression.f81056x0 = this.f81064x0;
                expression.f81050q0 = i11;
                return expression;
            }

            public Expression getAndArgument(int i10) {
                return this.f81063w0.get(i10);
            }

            public int getAndArgumentCount() {
                return this.f81063w0.size();
            }

            public Type getIsInstanceType() {
                return this.f81062u0;
            }

            public Expression getOrArgument(int i10) {
                return this.f81064x0.get(i10);
            }

            public int getOrArgumentCount() {
                return this.f81064x0.size();
            }

            public boolean hasIsInstanceType() {
                return (this.f81058q0 & 8) == 8;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasIsInstanceType() && !getIsInstanceType().isInitialized()) {
                    return false;
                }
                for (int i10 = 0; i10 < getAndArgumentCount(); i10++) {
                    if (!getAndArgument(i10).isInitialized()) {
                        return false;
                    }
                }
                for (int i11 = 0; i11 < getOrArgumentCount(); i11++) {
                    if (!getOrArgument(i11).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeIsInstanceType(Type type) {
                if ((this.f81058q0 & 8) != 8 || this.f81062u0 == Type.getDefaultInstance()) {
                    this.f81062u0 = type;
                } else {
                    this.f81062u0 = Type.newBuilder(this.f81062u0).mergeFrom(type).buildPartial();
                }
                this.f81058q0 |= 8;
                return this;
            }

            public Builder setConstantValue(ConstantValue constantValue) {
                constantValue.getClass();
                this.f81058q0 |= 4;
                this.f81061t0 = constantValue;
                return this;
            }

            public Builder setFlags(int i10) {
                this.f81058q0 |= 1;
                this.f81059r0 = i10;
                return this;
            }

            public Builder setIsInstanceTypeId(int i10) {
                this.f81058q0 |= 16;
                this.v0 = i10;
                return this;
            }

            public Builder setValueParameterReference(int i10) {
                this.f81058q0 |= 2;
                this.f81060s0 = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Expression build() {
                Expression expressionBuildPartial = buildPartial();
                if (expressionBuildPartial.isInitialized()) {
                    return expressionBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(expressionBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Expression getDefaultInstanceForType() {
                return Expression.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo5776clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Expression expression) {
                if (expression == Expression.getDefaultInstance()) {
                    return this;
                }
                if (expression.hasFlags()) {
                    setFlags(expression.getFlags());
                }
                if (expression.hasValueParameterReference()) {
                    setValueParameterReference(expression.getValueParameterReference());
                }
                if (expression.hasConstantValue()) {
                    setConstantValue(expression.getConstantValue());
                }
                if (expression.hasIsInstanceType()) {
                    mergeIsInstanceType(expression.getIsInstanceType());
                }
                if (expression.hasIsInstanceTypeId()) {
                    setIsInstanceTypeId(expression.getIsInstanceTypeId());
                }
                if (!expression.f81055w0.isEmpty()) {
                    if (this.f81063w0.isEmpty()) {
                        this.f81063w0 = expression.f81055w0;
                        this.f81058q0 &= -33;
                    } else {
                        if ((this.f81058q0 & 32) != 32) {
                            this.f81063w0 = new ArrayList(this.f81063w0);
                            this.f81058q0 |= 32;
                        }
                        this.f81063w0.addAll(expression.f81055w0);
                    }
                }
                if (!expression.f81056x0.isEmpty()) {
                    if (this.f81064x0.isEmpty()) {
                        this.f81064x0 = expression.f81056x0;
                        this.f81058q0 &= -65;
                    } else {
                        if ((this.f81058q0 & 64) != 64) {
                            this.f81064x0 = new ArrayList(this.f81064x0);
                            this.f81058q0 |= 64;
                        }
                        this.f81064x0.addAll(expression.f81056x0);
                    }
                }
                setUnknownFields(getUnknownFields().concat(expression.f81049p0));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Expression expression = null;
                try {
                    try {
                        Expression partialFrom = Expression.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        Expression expression2 = (Expression) e5.getUnfinishedMessage();
                        try {
                            throw e5;
                        } catch (Throwable th2) {
                            th = th2;
                            expression = expression2;
                            if (expression != null) {
                                mergeFrom(expression);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (expression != null) {
                        mergeFrom(expression);
                    }
                    throw th;
                }
            }
        }

        public enum ConstantValue implements Internal.EnumLite {
            TRUE(0),
            FALSE(1),
            NULL(2);

            private static Internal.EnumLiteMap<ConstantValue> internalValueMap = new a();
            private final int value;

            public static class a implements Internal.EnumLiteMap<ConstantValue> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public ConstantValue findValueByNumber(int i10) {
                    return ConstantValue.valueOf(i10);
                }
            }

            ConstantValue(int i10) {
                this.value = i10;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static ConstantValue valueOf(int i10) {
                if (i10 == 0) {
                    return TRUE;
                }
                if (i10 == 1) {
                    return FALSE;
                }
                if (i10 != 2) {
                    return null;
                }
                return NULL;
            }
        }

        public static class a extends AbstractParser<Expression> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Expression parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Expression(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Expression expression = new Expression();
            F0 = expression;
            expression.f81051r0 = 0;
            expression.f81052s0 = 0;
            expression.f81053t0 = ConstantValue.TRUE;
            expression.f81054u0 = Type.getDefaultInstance();
            expression.v0 = 0;
            expression.f81055w0 = Collections.emptyList();
            expression.f81056x0 = Collections.emptyList();
        }

        public Expression(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f81057y0 = (byte) -1;
            this.E0 = -1;
            this.f81049p0 = builder.getUnknownFields();
        }

        public static Expression getDefaultInstance() {
            return F0;
        }

        public static Builder newBuilder(Expression expression) {
            return newBuilder().mergeFrom(expression);
        }

        public Expression getAndArgument(int i10) {
            return this.f81055w0.get(i10);
        }

        public int getAndArgumentCount() {
            return this.f81055w0.size();
        }

        public ConstantValue getConstantValue() {
            return this.f81053t0;
        }

        public int getFlags() {
            return this.f81051r0;
        }

        public Type getIsInstanceType() {
            return this.f81054u0;
        }

        public int getIsInstanceTypeId() {
            return this.v0;
        }

        public Expression getOrArgument(int i10) {
            return this.f81056x0.get(i10);
        }

        public int getOrArgumentCount() {
            return this.f81056x0.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Expression> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.E0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = (this.f81050q0 & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f81051r0) : 0;
            if ((this.f81050q0 & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f81052s0);
            }
            if ((this.f81050q0 & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.f81053t0.getNumber());
            }
            if ((this.f81050q0 & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.f81054u0);
            }
            if ((this.f81050q0 & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(5, this.v0);
            }
            for (int i11 = 0; i11 < this.f81055w0.size(); i11++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(6, this.f81055w0.get(i11));
            }
            for (int i12 = 0; i12 < this.f81056x0.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(7, this.f81056x0.get(i12));
            }
            int size = this.f81049p0.size() + iComputeInt32Size;
            this.E0 = size;
            return size;
        }

        public int getValueParameterReference() {
            return this.f81052s0;
        }

        public boolean hasConstantValue() {
            return (this.f81050q0 & 4) == 4;
        }

        public boolean hasFlags() {
            return (this.f81050q0 & 1) == 1;
        }

        public boolean hasIsInstanceType() {
            return (this.f81050q0 & 8) == 8;
        }

        public boolean hasIsInstanceTypeId() {
            return (this.f81050q0 & 16) == 16;
        }

        public boolean hasValueParameterReference() {
            return (this.f81050q0 & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f81057y0;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (hasIsInstanceType() && !getIsInstanceType().isInitialized()) {
                this.f81057y0 = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < getAndArgumentCount(); i10++) {
                if (!getAndArgument(i10).isInitialized()) {
                    this.f81057y0 = (byte) 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < getOrArgumentCount(); i11++) {
                if (!getOrArgument(i11).isInitialized()) {
                    this.f81057y0 = (byte) 0;
                    return false;
                }
            }
            this.f81057y0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f81050q0 & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f81051r0);
            }
            if ((this.f81050q0 & 2) == 2) {
                codedOutputStream.writeInt32(2, this.f81052s0);
            }
            if ((this.f81050q0 & 4) == 4) {
                codedOutputStream.writeEnum(3, this.f81053t0.getNumber());
            }
            if ((this.f81050q0 & 8) == 8) {
                codedOutputStream.writeMessage(4, this.f81054u0);
            }
            if ((this.f81050q0 & 16) == 16) {
                codedOutputStream.writeInt32(5, this.v0);
            }
            for (int i10 = 0; i10 < this.f81055w0.size(); i10++) {
                codedOutputStream.writeMessage(6, this.f81055w0.get(i10));
            }
            for (int i11 = 0; i11 < this.f81056x0.size(); i11++) {
                codedOutputStream.writeMessage(7, this.f81056x0.get(i11));
            }
            codedOutputStream.writeRawBytes(this.f81049p0);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Expression getDefaultInstanceForType() {
            return F0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Expression() {
            this.f81057y0 = (byte) -1;
            this.E0 = -1;
            this.f81049p0 = ByteString.EMPTY;
        }

        public Expression(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f81057y0 = (byte) -1;
            this.E0 = -1;
            boolean z10 = false;
            this.f81051r0 = 0;
            this.f81052s0 = 0;
            this.f81053t0 = ConstantValue.TRUE;
            this.f81054u0 = Type.getDefaultInstance();
            this.v0 = 0;
            this.f81055w0 = Collections.emptyList();
            this.f81056x0 = Collections.emptyList();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.f81050q0 |= 1;
                                this.f81051r0 = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.f81050q0 |= 2;
                                this.f81052s0 = codedInputStream.readInt32();
                            } else if (tag == 24) {
                                int i11 = codedInputStream.readEnum();
                                ConstantValue constantValueValueOf = ConstantValue.valueOf(i11);
                                if (constantValueValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i11);
                                } else {
                                    this.f81050q0 |= 4;
                                    this.f81053t0 = constantValueValueOf;
                                }
                            } else if (tag == 34) {
                                Type.Builder builder = (this.f81050q0 & 8) == 8 ? this.f81054u0.toBuilder() : null;
                                Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.f81054u0 = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.f81054u0 = builder.buildPartial();
                                }
                                this.f81050q0 |= 8;
                            } else if (tag == 40) {
                                this.f81050q0 |= 16;
                                this.v0 = codedInputStream.readInt32();
                            } else if (tag == 50) {
                                if ((i10 & 32) != 32) {
                                    this.f81055w0 = new ArrayList();
                                    i10 |= 32;
                                }
                                this.f81055w0.add((Expression) codedInputStream.readMessage(PARSER, extensionRegistryLite));
                            } else if (tag != 58) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if ((i10 & 64) != 64) {
                                    this.f81056x0 = new ArrayList();
                                    i10 |= 64;
                                }
                                this.f81056x0.add((Expression) codedInputStream.readMessage(PARSER, extensionRegistryLite));
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e5) {
                        throw e5.setUnfinishedMessage(this);
                    } catch (IOException e7) {
                        throw new InvalidProtocolBufferException(e7.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if ((i10 & 32) == 32) {
                        this.f81055w0 = Collections.unmodifiableList(this.f81055w0);
                    }
                    if ((i10 & 64) == 64) {
                        this.f81056x0 = Collections.unmodifiableList(this.f81056x0);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f81049p0 = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((i10 & 32) == 32) {
                this.f81055w0 = Collections.unmodifiableList(this.f81055w0);
            }
            if ((i10 & 64) == 64) {
                this.f81056x0 = Collections.unmodifiableList(this.f81056x0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f81049p0 = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface ExpressionOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Function extends GeneratedMessageLite.ExtendableMessage<Function> implements FunctionOrBuilder {
        public static final Function O0;
        public static Parser<Function> PARSER = new a();
        public int E0;
        public List<Type> F0;
        public List<Integer> G0;
        public int H0;
        public List<ValueParameter> I0;
        public TypeTable J0;
        public List<Integer> K0;
        public Contract L0;
        public byte M0;
        public int N0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ByteString f81065q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f81066r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f81067s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f81068t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f81069u0;
        public Type v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f81070w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public List<TypeParameter> f81071x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public Type f81072y0;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Function, Builder> implements FunctionOrBuilder {
            public int F0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public int f81073s0;
            public int v0;

            /* JADX INFO: renamed from: x0, reason: collision with root package name */
            public int f81077x0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public int f81074t0 = 6;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public int f81075u0 = 6;

            /* JADX INFO: renamed from: w0, reason: collision with root package name */
            public Type f81076w0 = Type.getDefaultInstance();

            /* JADX INFO: renamed from: y0, reason: collision with root package name */
            public List<TypeParameter> f81078y0 = Collections.emptyList();
            public Type E0 = Type.getDefaultInstance();
            public List<Type> G0 = Collections.emptyList();
            public List<Integer> H0 = Collections.emptyList();
            public List<ValueParameter> I0 = Collections.emptyList();
            public TypeTable J0 = TypeTable.getDefaultInstance();
            public List<Integer> K0 = Collections.emptyList();
            public Contract L0 = Contract.getDefaultInstance();

            public Function buildPartial() {
                Function function = new Function(this);
                int i10 = this.f81073s0;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                function.f81067s0 = this.f81074t0;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                function.f81068t0 = this.f81075u0;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                function.f81069u0 = this.v0;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                function.v0 = this.f81076w0;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                function.f81070w0 = this.f81077x0;
                if ((i10 & 32) == 32) {
                    this.f81078y0 = Collections.unmodifiableList(this.f81078y0);
                    this.f81073s0 &= -33;
                }
                function.f81071x0 = this.f81078y0;
                if ((i10 & 64) == 64) {
                    i11 |= 32;
                }
                function.f81072y0 = this.E0;
                if ((i10 & 128) == 128) {
                    i11 |= 64;
                }
                function.E0 = this.F0;
                if ((this.f81073s0 & 256) == 256) {
                    this.G0 = Collections.unmodifiableList(this.G0);
                    this.f81073s0 &= -257;
                }
                function.F0 = this.G0;
                if ((this.f81073s0 & 512) == 512) {
                    this.H0 = Collections.unmodifiableList(this.H0);
                    this.f81073s0 &= -513;
                }
                function.G0 = this.H0;
                if ((this.f81073s0 & 1024) == 1024) {
                    this.I0 = Collections.unmodifiableList(this.I0);
                    this.f81073s0 &= -1025;
                }
                function.I0 = this.I0;
                if ((i10 & 2048) == 2048) {
                    i11 |= 128;
                }
                function.J0 = this.J0;
                if ((this.f81073s0 & 4096) == 4096) {
                    this.K0 = Collections.unmodifiableList(this.K0);
                    this.f81073s0 &= -4097;
                }
                function.K0 = this.K0;
                if ((i10 & 8192) == 8192) {
                    i11 |= 256;
                }
                function.L0 = this.L0;
                function.f81066r0 = i11;
                return function;
            }

            public Type getContextReceiverType(int i10) {
                return this.G0.get(i10);
            }

            public int getContextReceiverTypeCount() {
                return this.G0.size();
            }

            public Contract getContract() {
                return this.L0;
            }

            public Type getReceiverType() {
                return this.E0;
            }

            public Type getReturnType() {
                return this.f81076w0;
            }

            public TypeParameter getTypeParameter(int i10) {
                return this.f81078y0.get(i10);
            }

            public int getTypeParameterCount() {
                return this.f81078y0.size();
            }

            public TypeTable getTypeTable() {
                return this.J0;
            }

            public ValueParameter getValueParameter(int i10) {
                return this.I0.get(i10);
            }

            public int getValueParameterCount() {
                return this.I0.size();
            }

            public boolean hasContract() {
                return (this.f81073s0 & 8192) == 8192;
            }

            public boolean hasName() {
                return (this.f81073s0 & 4) == 4;
            }

            public boolean hasReceiverType() {
                return (this.f81073s0 & 64) == 64;
            }

            public boolean hasReturnType() {
                return (this.f81073s0 & 8) == 8;
            }

            public boolean hasTypeTable() {
                return (this.f81073s0 & 2048) == 2048;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasReturnType() && !getReturnType().isInitialized()) {
                    return false;
                }
                for (int i10 = 0; i10 < getTypeParameterCount(); i10++) {
                    if (!getTypeParameter(i10).isInitialized()) {
                        return false;
                    }
                }
                if (hasReceiverType() && !getReceiverType().isInitialized()) {
                    return false;
                }
                for (int i11 = 0; i11 < getContextReceiverTypeCount(); i11++) {
                    if (!getContextReceiverType(i11).isInitialized()) {
                        return false;
                    }
                }
                for (int i12 = 0; i12 < getValueParameterCount(); i12++) {
                    if (!getValueParameter(i12).isInitialized()) {
                        return false;
                    }
                }
                if (!hasTypeTable() || getTypeTable().isInitialized()) {
                    return (!hasContract() || getContract().isInitialized()) && extensionsAreInitialized();
                }
                return false;
            }

            public Builder mergeContract(Contract contract) {
                if ((this.f81073s0 & 8192) != 8192 || this.L0 == Contract.getDefaultInstance()) {
                    this.L0 = contract;
                } else {
                    this.L0 = Contract.newBuilder(this.L0).mergeFrom(contract).buildPartial();
                }
                this.f81073s0 |= 8192;
                return this;
            }

            public Builder mergeReceiverType(Type type) {
                if ((this.f81073s0 & 64) != 64 || this.E0 == Type.getDefaultInstance()) {
                    this.E0 = type;
                } else {
                    this.E0 = Type.newBuilder(this.E0).mergeFrom(type).buildPartial();
                }
                this.f81073s0 |= 64;
                return this;
            }

            public Builder mergeReturnType(Type type) {
                if ((this.f81073s0 & 8) != 8 || this.f81076w0 == Type.getDefaultInstance()) {
                    this.f81076w0 = type;
                } else {
                    this.f81076w0 = Type.newBuilder(this.f81076w0).mergeFrom(type).buildPartial();
                }
                this.f81073s0 |= 8;
                return this;
            }

            public Builder mergeTypeTable(TypeTable typeTable) {
                if ((this.f81073s0 & 2048) != 2048 || this.J0 == TypeTable.getDefaultInstance()) {
                    this.J0 = typeTable;
                } else {
                    this.J0 = TypeTable.newBuilder(this.J0).mergeFrom(typeTable).buildPartial();
                }
                this.f81073s0 |= 2048;
                return this;
            }

            public Builder setFlags(int i10) {
                this.f81073s0 |= 1;
                this.f81074t0 = i10;
                return this;
            }

            public Builder setName(int i10) {
                this.f81073s0 |= 4;
                this.v0 = i10;
                return this;
            }

            public Builder setOldFlags(int i10) {
                this.f81073s0 |= 2;
                this.f81075u0 = i10;
                return this;
            }

            public Builder setReceiverTypeId(int i10) {
                this.f81073s0 |= 128;
                this.F0 = i10;
                return this;
            }

            public Builder setReturnTypeId(int i10) {
                this.f81073s0 |= 16;
                this.f81077x0 = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Function build() {
                Function functionBuildPartial = buildPartial();
                if (functionBuildPartial.isInitialized()) {
                    return functionBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(functionBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Function getDefaultInstanceForType() {
                return Function.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Function function) {
                if (function == Function.getDefaultInstance()) {
                    return this;
                }
                if (function.hasFlags()) {
                    setFlags(function.getFlags());
                }
                if (function.hasOldFlags()) {
                    setOldFlags(function.getOldFlags());
                }
                if (function.hasName()) {
                    setName(function.getName());
                }
                if (function.hasReturnType()) {
                    mergeReturnType(function.getReturnType());
                }
                if (function.hasReturnTypeId()) {
                    setReturnTypeId(function.getReturnTypeId());
                }
                if (!function.f81071x0.isEmpty()) {
                    if (this.f81078y0.isEmpty()) {
                        this.f81078y0 = function.f81071x0;
                        this.f81073s0 &= -33;
                    } else {
                        if ((this.f81073s0 & 32) != 32) {
                            this.f81078y0 = new ArrayList(this.f81078y0);
                            this.f81073s0 |= 32;
                        }
                        this.f81078y0.addAll(function.f81071x0);
                    }
                }
                if (function.hasReceiverType()) {
                    mergeReceiverType(function.getReceiverType());
                }
                if (function.hasReceiverTypeId()) {
                    setReceiverTypeId(function.getReceiverTypeId());
                }
                if (!function.F0.isEmpty()) {
                    if (this.G0.isEmpty()) {
                        this.G0 = function.F0;
                        this.f81073s0 &= -257;
                    } else {
                        if ((this.f81073s0 & 256) != 256) {
                            this.G0 = new ArrayList(this.G0);
                            this.f81073s0 |= 256;
                        }
                        this.G0.addAll(function.F0);
                    }
                }
                if (!function.G0.isEmpty()) {
                    if (this.H0.isEmpty()) {
                        this.H0 = function.G0;
                        this.f81073s0 &= -513;
                    } else {
                        if ((this.f81073s0 & 512) != 512) {
                            this.H0 = new ArrayList(this.H0);
                            this.f81073s0 |= 512;
                        }
                        this.H0.addAll(function.G0);
                    }
                }
                if (!function.I0.isEmpty()) {
                    if (this.I0.isEmpty()) {
                        this.I0 = function.I0;
                        this.f81073s0 &= -1025;
                    } else {
                        if ((this.f81073s0 & 1024) != 1024) {
                            this.I0 = new ArrayList(this.I0);
                            this.f81073s0 |= 1024;
                        }
                        this.I0.addAll(function.I0);
                    }
                }
                if (function.hasTypeTable()) {
                    mergeTypeTable(function.getTypeTable());
                }
                if (!function.K0.isEmpty()) {
                    if (this.K0.isEmpty()) {
                        this.K0 = function.K0;
                        this.f81073s0 &= -4097;
                    } else {
                        if ((this.f81073s0 & 4096) != 4096) {
                            this.K0 = new ArrayList(this.K0);
                            this.f81073s0 |= 4096;
                        }
                        this.K0.addAll(function.K0);
                    }
                }
                if (function.hasContract()) {
                    mergeContract(function.getContract());
                }
                mergeExtensionFields(function);
                setUnknownFields(getUnknownFields().concat(function.f81065q0));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo5776clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Function function = null;
                try {
                    try {
                        Function partialFrom = Function.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        Function function2 = (Function) e5.getUnfinishedMessage();
                        try {
                            throw e5;
                        } catch (Throwable th2) {
                            th = th2;
                            function = function2;
                            if (function != null) {
                                mergeFrom(function);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (function != null) {
                        mergeFrom(function);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<Function> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Function parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Function(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Function function = new Function();
            O0 = function;
            function.b();
        }

        public Function(GeneratedMessageLite.ExtendableBuilder<Function, ?> extendableBuilder) {
            super(extendableBuilder);
            this.H0 = -1;
            this.M0 = (byte) -1;
            this.N0 = -1;
            this.f81065q0 = extendableBuilder.getUnknownFields();
        }

        public static Function getDefaultInstance() {
            return O0;
        }

        public static Builder newBuilder(Function function) {
            return newBuilder().mergeFrom(function);
        }

        public static Function parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public final void b() {
            this.f81067s0 = 6;
            this.f81068t0 = 6;
            this.f81069u0 = 0;
            this.v0 = Type.getDefaultInstance();
            this.f81070w0 = 0;
            this.f81071x0 = Collections.emptyList();
            this.f81072y0 = Type.getDefaultInstance();
            this.E0 = 0;
            this.F0 = Collections.emptyList();
            this.G0 = Collections.emptyList();
            this.I0 = Collections.emptyList();
            this.J0 = TypeTable.getDefaultInstance();
            this.K0 = Collections.emptyList();
            this.L0 = Contract.getDefaultInstance();
        }

        public Type getContextReceiverType(int i10) {
            return this.F0.get(i10);
        }

        public int getContextReceiverTypeCount() {
            return this.F0.size();
        }

        public List<Integer> getContextReceiverTypeIdList() {
            return this.G0;
        }

        public List<Type> getContextReceiverTypeList() {
            return this.F0;
        }

        public Contract getContract() {
            return this.L0;
        }

        public int getFlags() {
            return this.f81067s0;
        }

        public int getName() {
            return this.f81069u0;
        }

        public int getOldFlags() {
            return this.f81068t0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Function> getParserForType() {
            return PARSER;
        }

        public Type getReceiverType() {
            return this.f81072y0;
        }

        public int getReceiverTypeId() {
            return this.E0;
        }

        public Type getReturnType() {
            return this.v0;
        }

        public int getReturnTypeId() {
            return this.f81070w0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.N0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = (this.f81066r0 & 2) == 2 ? CodedOutputStream.computeInt32Size(1, this.f81068t0) : 0;
            if ((this.f81066r0 & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f81069u0);
            }
            if ((this.f81066r0 & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, this.v0);
            }
            for (int i11 = 0; i11 < this.f81071x0.size(); i11++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.f81071x0.get(i11));
            }
            if ((this.f81066r0 & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(5, this.f81072y0);
            }
            for (int i12 = 0; i12 < this.I0.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(6, this.I0.get(i12));
            }
            if ((this.f81066r0 & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, this.f81070w0);
            }
            if ((this.f81066r0 & 64) == 64) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(8, this.E0);
            }
            if ((this.f81066r0 & 1) == 1) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(9, this.f81067s0);
            }
            for (int i13 = 0; i13 < this.F0.size(); i13++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(10, this.F0.get(i13));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i14 = 0; i14 < this.G0.size(); i14++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.G0.get(i14).intValue());
            }
            int iComputeMessageSize = iComputeInt32Size + iComputeInt32SizeNoTag;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                iComputeMessageSize = iComputeMessageSize + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.H0 = iComputeInt32SizeNoTag;
            if ((this.f81066r0 & 128) == 128) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(30, this.J0);
            }
            int iComputeInt32SizeNoTag2 = 0;
            for (int i15 = 0; i15 < this.K0.size(); i15++) {
                iComputeInt32SizeNoTag2 += CodedOutputStream.computeInt32SizeNoTag(this.K0.get(i15).intValue());
            }
            int size = (getVersionRequirementList().size() * 2) + iComputeMessageSize + iComputeInt32SizeNoTag2;
            if ((this.f81066r0 & 256) == 256) {
                size += CodedOutputStream.computeMessageSize(32, this.L0);
            }
            int size2 = this.f81065q0.size() + extensionsSerializedSize() + size;
            this.N0 = size2;
            return size2;
        }

        public TypeParameter getTypeParameter(int i10) {
            return this.f81071x0.get(i10);
        }

        public int getTypeParameterCount() {
            return this.f81071x0.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.f81071x0;
        }

        public TypeTable getTypeTable() {
            return this.J0;
        }

        public ValueParameter getValueParameter(int i10) {
            return this.I0.get(i10);
        }

        public int getValueParameterCount() {
            return this.I0.size();
        }

        public List<ValueParameter> getValueParameterList() {
            return this.I0;
        }

        public List<Integer> getVersionRequirementList() {
            return this.K0;
        }

        public boolean hasContract() {
            return (this.f81066r0 & 256) == 256;
        }

        public boolean hasFlags() {
            return (this.f81066r0 & 1) == 1;
        }

        public boolean hasName() {
            return (this.f81066r0 & 4) == 4;
        }

        public boolean hasOldFlags() {
            return (this.f81066r0 & 2) == 2;
        }

        public boolean hasReceiverType() {
            return (this.f81066r0 & 32) == 32;
        }

        public boolean hasReceiverTypeId() {
            return (this.f81066r0 & 64) == 64;
        }

        public boolean hasReturnType() {
            return (this.f81066r0 & 8) == 8;
        }

        public boolean hasReturnTypeId() {
            return (this.f81066r0 & 16) == 16;
        }

        public boolean hasTypeTable() {
            return (this.f81066r0 & 128) == 128;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.M0;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!hasName()) {
                this.M0 = (byte) 0;
                return false;
            }
            if (hasReturnType() && !getReturnType().isInitialized()) {
                this.M0 = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < getTypeParameterCount(); i10++) {
                if (!getTypeParameter(i10).isInitialized()) {
                    this.M0 = (byte) 0;
                    return false;
                }
            }
            if (hasReceiverType() && !getReceiverType().isInitialized()) {
                this.M0 = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getContextReceiverTypeCount(); i11++) {
                if (!getContextReceiverType(i11).isInitialized()) {
                    this.M0 = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < getValueParameterCount(); i12++) {
                if (!getValueParameter(i12).isInitialized()) {
                    this.M0 = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.M0 = (byte) 0;
                return false;
            }
            if (hasContract() && !getContract().isInitialized()) {
                this.M0 = (byte) 0;
                return false;
            }
            if (extensionsAreInitialized()) {
                this.M0 = (byte) 1;
                return true;
            }
            this.M0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.f81066r0 & 2) == 2) {
                codedOutputStream.writeInt32(1, this.f81068t0);
            }
            if ((this.f81066r0 & 4) == 4) {
                codedOutputStream.writeInt32(2, this.f81069u0);
            }
            if ((this.f81066r0 & 8) == 8) {
                codedOutputStream.writeMessage(3, this.v0);
            }
            for (int i10 = 0; i10 < this.f81071x0.size(); i10++) {
                codedOutputStream.writeMessage(4, this.f81071x0.get(i10));
            }
            if ((this.f81066r0 & 32) == 32) {
                codedOutputStream.writeMessage(5, this.f81072y0);
            }
            for (int i11 = 0; i11 < this.I0.size(); i11++) {
                codedOutputStream.writeMessage(6, this.I0.get(i11));
            }
            if ((this.f81066r0 & 16) == 16) {
                codedOutputStream.writeInt32(7, this.f81070w0);
            }
            if ((this.f81066r0 & 64) == 64) {
                codedOutputStream.writeInt32(8, this.E0);
            }
            if ((this.f81066r0 & 1) == 1) {
                codedOutputStream.writeInt32(9, this.f81067s0);
            }
            for (int i12 = 0; i12 < this.F0.size(); i12++) {
                codedOutputStream.writeMessage(10, this.F0.get(i12));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(90);
                codedOutputStream.writeRawVarint32(this.H0);
            }
            for (int i13 = 0; i13 < this.G0.size(); i13++) {
                codedOutputStream.writeInt32NoTag(this.G0.get(i13).intValue());
            }
            if ((this.f81066r0 & 128) == 128) {
                codedOutputStream.writeMessage(30, this.J0);
            }
            for (int i14 = 0; i14 < this.K0.size(); i14++) {
                codedOutputStream.writeInt32(31, this.K0.get(i14).intValue());
            }
            if ((this.f81066r0 & 256) == 256) {
                codedOutputStream.writeMessage(32, this.L0);
            }
            extensionWriterNewExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f81065q0);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Function getDefaultInstanceForType() {
            return O0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Function() {
            this.H0 = -1;
            this.M0 = (byte) -1;
            this.N0 = -1;
            this.f81065q0 = ByteString.EMPTY;
        }

        public Function(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.H0 = -1;
            this.M0 = (byte) -1;
            this.N0 = -1;
            b();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        switch (tag) {
                            case 0:
                                break;
                            case 8:
                                this.f81066r0 |= 2;
                                this.f81068t0 = codedInputStream.readInt32();
                                continue;
                            case 16:
                                this.f81066r0 |= 4;
                                this.f81069u0 = codedInputStream.readInt32();
                                continue;
                            case 26:
                                Type.Builder builder = (this.f81066r0 & 8) == 8 ? this.v0.toBuilder() : null;
                                Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.v0 = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.v0 = builder.buildPartial();
                                }
                                this.f81066r0 |= 8;
                                continue;
                            case 34:
                                int i11 = (i10 == true ? 1 : 0) & 32;
                                i10 = i10;
                                if (i11 != 32) {
                                    this.f81071x0 = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 32;
                                }
                                this.f81071x0.add((TypeParameter) codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                                continue;
                            case 42:
                                Type.Builder builder2 = (this.f81066r0 & 32) == 32 ? this.f81072y0.toBuilder() : null;
                                Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.f81072y0 = type2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(type2);
                                    this.f81072y0 = builder2.buildPartial();
                                }
                                this.f81066r0 |= 32;
                                continue;
                            case 50:
                                int i12 = (i10 == true ? 1 : 0) & 1024;
                                i10 = i10;
                                if (i12 != 1024) {
                                    this.I0 = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 1024;
                                }
                                this.I0.add((ValueParameter) codedInputStream.readMessage(ValueParameter.PARSER, extensionRegistryLite));
                                continue;
                            case 56:
                                this.f81066r0 |= 16;
                                this.f81070w0 = codedInputStream.readInt32();
                                continue;
                            case 64:
                                this.f81066r0 |= 64;
                                this.E0 = codedInputStream.readInt32();
                                continue;
                            case 72:
                                this.f81066r0 |= 1;
                                this.f81067s0 = codedInputStream.readInt32();
                                continue;
                            case 82:
                                int i13 = (i10 == true ? 1 : 0) & 256;
                                i10 = i10;
                                if (i13 != 256) {
                                    this.F0 = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 256;
                                }
                                this.F0.add((Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                                continue;
                            case 88:
                                int i14 = (i10 == true ? 1 : 0) & 512;
                                i10 = i10;
                                if (i14 != 512) {
                                    this.G0 = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 512;
                                }
                                this.G0.add(Integer.valueOf(codedInputStream.readInt32()));
                                continue;
                            case 90:
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                int i15 = (i10 == true ? 1 : 0) & 512;
                                i10 = i10;
                                if (i15 != 512 && codedInputStream.getBytesUntilLimit() > 0) {
                                    i10 = i10;
                                    this.G0 = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 512;
                                }
                                i10 = i10;
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.G0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                                continue;
                            case 242:
                                TypeTable.Builder builder3 = (this.f81066r0 & 128) == 128 ? this.J0.toBuilder() : null;
                                TypeTable typeTable = (TypeTable) codedInputStream.readMessage(TypeTable.PARSER, extensionRegistryLite);
                                this.J0 = typeTable;
                                if (builder3 != null) {
                                    builder3.mergeFrom(typeTable);
                                    this.J0 = builder3.buildPartial();
                                }
                                this.f81066r0 |= 128;
                                continue;
                            case 248:
                                int i16 = (i10 == true ? 1 : 0) & 4096;
                                i10 = i10;
                                if (i16 != 4096) {
                                    this.K0 = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 4096;
                                }
                                this.K0.add(Integer.valueOf(codedInputStream.readInt32()));
                                continue;
                            case 250:
                                int iPushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                int i17 = (i10 == true ? 1 : 0) & 4096;
                                i10 = i10;
                                if (i17 != 4096 && codedInputStream.getBytesUntilLimit() > 0) {
                                    i10 = i10;
                                    this.K0 = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 4096;
                                }
                                i10 = i10;
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.K0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit2);
                                continue;
                            case 258:
                                Contract.Builder builder4 = (this.f81066r0 & 256) == 256 ? this.L0.toBuilder() : null;
                                Contract contract = (Contract) codedInputStream.readMessage(Contract.PARSER, extensionRegistryLite);
                                this.L0 = contract;
                                if (builder4 != null) {
                                    builder4.mergeFrom(contract);
                                    this.L0 = builder4.buildPartial();
                                }
                                this.f81066r0 |= 256;
                                continue;
                            default:
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    break;
                                }
                                break;
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e5) {
                        throw e5.setUnfinishedMessage(this);
                    } catch (IOException e7) {
                        throw new InvalidProtocolBufferException(e7.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (((i10 == true ? 1 : 0) & 32) == 32) {
                        this.f81071x0 = Collections.unmodifiableList(this.f81071x0);
                    }
                    if (((i10 == true ? 1 : 0) & 1024) == 1024) {
                        this.I0 = Collections.unmodifiableList(this.I0);
                    }
                    if (((i10 == true ? 1 : 0) & 256) == 256) {
                        this.F0 = Collections.unmodifiableList(this.F0);
                    }
                    if (((i10 == true ? 1 : 0) & 512) == 512) {
                        this.G0 = Collections.unmodifiableList(this.G0);
                    }
                    if (((i10 == true ? 1 : 0) & 4096) == 4096) {
                        this.K0 = Collections.unmodifiableList(this.K0);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f81065q0 = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (((i10 == true ? 1 : 0) & 32) == 32) {
                this.f81071x0 = Collections.unmodifiableList(this.f81071x0);
            }
            if (((i10 == true ? 1 : 0) & 1024) == 1024) {
                this.I0 = Collections.unmodifiableList(this.I0);
            }
            if (((i10 == true ? 1 : 0) & 256) == 256) {
                this.F0 = Collections.unmodifiableList(this.F0);
            }
            if (((i10 == true ? 1 : 0) & 512) == 512) {
                this.G0 = Collections.unmodifiableList(this.G0);
            }
            if (((i10 == true ? 1 : 0) & 4096) == 4096) {
                this.K0 = Collections.unmodifiableList(this.K0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f81065q0 = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface FunctionOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public enum MemberKind implements Internal.EnumLite {
        DECLARATION(0),
        FAKE_OVERRIDE(1),
        DELEGATION(2),
        SYNTHESIZED(3);

        private static Internal.EnumLiteMap<MemberKind> internalValueMap = new a();
        private final int value;

        public static class a implements Internal.EnumLiteMap<MemberKind> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            public MemberKind findValueByNumber(int i10) {
                return MemberKind.valueOf(i10);
            }
        }

        MemberKind(int i10) {
            this.value = i10;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        public static MemberKind valueOf(int i10) {
            if (i10 == 0) {
                return DECLARATION;
            }
            if (i10 == 1) {
                return FAKE_OVERRIDE;
            }
            if (i10 == 2) {
                return DELEGATION;
            }
            if (i10 != 3) {
                return null;
            }
            return SYNTHESIZED;
        }
    }

    public enum Modality implements Internal.EnumLite {
        FINAL(0),
        OPEN(1),
        ABSTRACT(2),
        SEALED(3);

        private static Internal.EnumLiteMap<Modality> internalValueMap = new a();
        private final int value;

        public static class a implements Internal.EnumLiteMap<Modality> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            public Modality findValueByNumber(int i10) {
                return Modality.valueOf(i10);
            }
        }

        Modality(int i10) {
            this.value = i10;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        public static Modality valueOf(int i10) {
            if (i10 == 0) {
                return FINAL;
            }
            if (i10 == 1) {
                return OPEN;
            }
            if (i10 == 2) {
                return ABSTRACT;
            }
            if (i10 != 3) {
                return null;
            }
            return SEALED;
        }
    }

    public static final class Package extends GeneratedMessageLite.ExtendableMessage<Package> implements PackageOrBuilder {
        public static final Package E0;
        public static Parser<Package> PARSER = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ByteString f81079q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f81080r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public List<Function> f81081s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public List<Property> f81082t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public List<TypeAlias> f81083u0;
        public TypeTable v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public VersionRequirementTable f81084w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public byte f81085x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public int f81086y0;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Package, Builder> implements PackageOrBuilder {

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public int f81087s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public List<Function> f81088t0 = Collections.emptyList();

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public List<Property> f81089u0 = Collections.emptyList();
            public List<TypeAlias> v0 = Collections.emptyList();

            /* JADX INFO: renamed from: w0, reason: collision with root package name */
            public TypeTable f81090w0 = TypeTable.getDefaultInstance();

            /* JADX INFO: renamed from: x0, reason: collision with root package name */
            public VersionRequirementTable f81091x0 = VersionRequirementTable.getDefaultInstance();

            public Package buildPartial() {
                Package r1 = new Package(this);
                int i10 = this.f81087s0;
                if ((i10 & 1) == 1) {
                    this.f81088t0 = Collections.unmodifiableList(this.f81088t0);
                    this.f81087s0 &= -2;
                }
                r1.f81081s0 = this.f81088t0;
                if ((this.f81087s0 & 2) == 2) {
                    this.f81089u0 = Collections.unmodifiableList(this.f81089u0);
                    this.f81087s0 &= -3;
                }
                r1.f81082t0 = this.f81089u0;
                if ((this.f81087s0 & 4) == 4) {
                    this.v0 = Collections.unmodifiableList(this.v0);
                    this.f81087s0 &= -5;
                }
                r1.f81083u0 = this.v0;
                int i11 = (i10 & 8) != 8 ? 0 : 1;
                r1.v0 = this.f81090w0;
                if ((i10 & 16) == 16) {
                    i11 |= 2;
                }
                r1.f81084w0 = this.f81091x0;
                r1.f81080r0 = i11;
                return r1;
            }

            public Function getFunction(int i10) {
                return this.f81088t0.get(i10);
            }

            public int getFunctionCount() {
                return this.f81088t0.size();
            }

            public Property getProperty(int i10) {
                return this.f81089u0.get(i10);
            }

            public int getPropertyCount() {
                return this.f81089u0.size();
            }

            public TypeAlias getTypeAlias(int i10) {
                return this.v0.get(i10);
            }

            public int getTypeAliasCount() {
                return this.v0.size();
            }

            public TypeTable getTypeTable() {
                return this.f81090w0;
            }

            public boolean hasTypeTable() {
                return (this.f81087s0 & 8) == 8;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < getFunctionCount(); i10++) {
                    if (!getFunction(i10).isInitialized()) {
                        return false;
                    }
                }
                for (int i11 = 0; i11 < getPropertyCount(); i11++) {
                    if (!getProperty(i11).isInitialized()) {
                        return false;
                    }
                }
                for (int i12 = 0; i12 < getTypeAliasCount(); i12++) {
                    if (!getTypeAlias(i12).isInitialized()) {
                        return false;
                    }
                }
                return (!hasTypeTable() || getTypeTable().isInitialized()) && extensionsAreInitialized();
            }

            public Builder mergeTypeTable(TypeTable typeTable) {
                if ((this.f81087s0 & 8) != 8 || this.f81090w0 == TypeTable.getDefaultInstance()) {
                    this.f81090w0 = typeTable;
                } else {
                    this.f81090w0 = TypeTable.newBuilder(this.f81090w0).mergeFrom(typeTable).buildPartial();
                }
                this.f81087s0 |= 8;
                return this;
            }

            public Builder mergeVersionRequirementTable(VersionRequirementTable versionRequirementTable) {
                if ((this.f81087s0 & 16) != 16 || this.f81091x0 == VersionRequirementTable.getDefaultInstance()) {
                    this.f81091x0 = versionRequirementTable;
                } else {
                    this.f81091x0 = VersionRequirementTable.newBuilder(this.f81091x0).mergeFrom(versionRequirementTable).buildPartial();
                }
                this.f81087s0 |= 16;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Package build() {
                Package packageBuildPartial = buildPartial();
                if (packageBuildPartial.isInitialized()) {
                    return packageBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(packageBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Package getDefaultInstanceForType() {
                return Package.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Package r4) {
                if (r4 == Package.getDefaultInstance()) {
                    return this;
                }
                if (!r4.f81081s0.isEmpty()) {
                    if (this.f81088t0.isEmpty()) {
                        this.f81088t0 = r4.f81081s0;
                        this.f81087s0 &= -2;
                    } else {
                        if ((this.f81087s0 & 1) != 1) {
                            this.f81088t0 = new ArrayList(this.f81088t0);
                            this.f81087s0 |= 1;
                        }
                        this.f81088t0.addAll(r4.f81081s0);
                    }
                }
                if (!r4.f81082t0.isEmpty()) {
                    if (this.f81089u0.isEmpty()) {
                        this.f81089u0 = r4.f81082t0;
                        this.f81087s0 &= -3;
                    } else {
                        if ((this.f81087s0 & 2) != 2) {
                            this.f81089u0 = new ArrayList(this.f81089u0);
                            this.f81087s0 |= 2;
                        }
                        this.f81089u0.addAll(r4.f81082t0);
                    }
                }
                if (!r4.f81083u0.isEmpty()) {
                    if (this.v0.isEmpty()) {
                        this.v0 = r4.f81083u0;
                        this.f81087s0 &= -5;
                    } else {
                        if ((this.f81087s0 & 4) != 4) {
                            this.v0 = new ArrayList(this.v0);
                            this.f81087s0 |= 4;
                        }
                        this.v0.addAll(r4.f81083u0);
                    }
                }
                if (r4.hasTypeTable()) {
                    mergeTypeTable(r4.getTypeTable());
                }
                if (r4.hasVersionRequirementTable()) {
                    mergeVersionRequirementTable(r4.getVersionRequirementTable());
                }
                mergeExtensionFields(r4);
                setUnknownFields(getUnknownFields().concat(r4.f81079q0));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo5776clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Package r1 = null;
                try {
                    try {
                        Package partialFrom = Package.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        Package r4 = (Package) e5.getUnfinishedMessage();
                        try {
                            throw e5;
                        } catch (Throwable th2) {
                            th = th2;
                            r1 = r4;
                            if (r1 != null) {
                                mergeFrom(r1);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (r1 != null) {
                        mergeFrom(r1);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<Package> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Package parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Package(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Package r1 = new Package();
            E0 = r1;
            r1.f81081s0 = Collections.emptyList();
            r1.f81082t0 = Collections.emptyList();
            r1.f81083u0 = Collections.emptyList();
            r1.v0 = TypeTable.getDefaultInstance();
            r1.f81084w0 = VersionRequirementTable.getDefaultInstance();
        }

        public Package(GeneratedMessageLite.ExtendableBuilder<Package, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f81085x0 = (byte) -1;
            this.f81086y0 = -1;
            this.f81079q0 = extendableBuilder.getUnknownFields();
        }

        public static Package getDefaultInstance() {
            return E0;
        }

        public static Builder newBuilder(Package r1) {
            return newBuilder().mergeFrom(r1);
        }

        public static Package parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public Function getFunction(int i10) {
            return this.f81081s0.get(i10);
        }

        public int getFunctionCount() {
            return this.f81081s0.size();
        }

        public List<Function> getFunctionList() {
            return this.f81081s0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Package> getParserForType() {
            return PARSER;
        }

        public Property getProperty(int i10) {
            return this.f81082t0.get(i10);
        }

        public int getPropertyCount() {
            return this.f81082t0.size();
        }

        public List<Property> getPropertyList() {
            return this.f81082t0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f81086y0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f81081s0.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, this.f81081s0.get(i11));
            }
            for (int i12 = 0; i12 < this.f81082t0.size(); i12++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, this.f81082t0.get(i12));
            }
            for (int i13 = 0; i13 < this.f81083u0.size(); i13++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, this.f81083u0.get(i13));
            }
            if ((this.f81080r0 & 1) == 1) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(30, this.v0);
            }
            if ((this.f81080r0 & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(32, this.f81084w0);
            }
            int size = this.f81079q0.size() + extensionsSerializedSize() + iComputeMessageSize;
            this.f81086y0 = size;
            return size;
        }

        public TypeAlias getTypeAlias(int i10) {
            return this.f81083u0.get(i10);
        }

        public int getTypeAliasCount() {
            return this.f81083u0.size();
        }

        public List<TypeAlias> getTypeAliasList() {
            return this.f81083u0;
        }

        public TypeTable getTypeTable() {
            return this.v0;
        }

        public VersionRequirementTable getVersionRequirementTable() {
            return this.f81084w0;
        }

        public boolean hasTypeTable() {
            return (this.f81080r0 & 1) == 1;
        }

        public boolean hasVersionRequirementTable() {
            return (this.f81080r0 & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f81085x0;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < getFunctionCount(); i10++) {
                if (!getFunction(i10).isInitialized()) {
                    this.f81085x0 = (byte) 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < getPropertyCount(); i11++) {
                if (!getProperty(i11).isInitialized()) {
                    this.f81085x0 = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < getTypeAliasCount(); i12++) {
                if (!getTypeAlias(i12).isInitialized()) {
                    this.f81085x0 = (byte) 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
                this.f81085x0 = (byte) 0;
                return false;
            }
            if (extensionsAreInitialized()) {
                this.f81085x0 = (byte) 1;
                return true;
            }
            this.f81085x0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            for (int i10 = 0; i10 < this.f81081s0.size(); i10++) {
                codedOutputStream.writeMessage(3, this.f81081s0.get(i10));
            }
            for (int i11 = 0; i11 < this.f81082t0.size(); i11++) {
                codedOutputStream.writeMessage(4, this.f81082t0.get(i11));
            }
            for (int i12 = 0; i12 < this.f81083u0.size(); i12++) {
                codedOutputStream.writeMessage(5, this.f81083u0.get(i12));
            }
            if ((this.f81080r0 & 1) == 1) {
                codedOutputStream.writeMessage(30, this.v0);
            }
            if ((this.f81080r0 & 2) == 2) {
                codedOutputStream.writeMessage(32, this.f81084w0);
            }
            extensionWriterNewExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f81079q0);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Package getDefaultInstanceForType() {
            return E0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Package() {
            this.f81085x0 = (byte) -1;
            this.f81086y0 = -1;
            this.f81079q0 = ByteString.EMPTY;
        }

        public Package(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f81085x0 = (byte) -1;
            this.f81086y0 = -1;
            this.f81081s0 = Collections.emptyList();
            this.f81082t0 = Collections.emptyList();
            this.f81083u0 = Collections.emptyList();
            this.v0 = TypeTable.getDefaultInstance();
            this.f81084w0 = VersionRequirementTable.getDefaultInstance();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 26) {
                                    int i11 = (i10 == true ? 1 : 0) & 1;
                                    i10 = i10;
                                    if (i11 != 1) {
                                        this.f81081s0 = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 1;
                                    }
                                    this.f81081s0.add((Function) codedInputStream.readMessage(Function.PARSER, extensionRegistryLite));
                                } else if (tag == 34) {
                                    int i12 = (i10 == true ? 1 : 0) & 2;
                                    i10 = i10;
                                    if (i12 != 2) {
                                        this.f81082t0 = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 2;
                                    }
                                    this.f81082t0.add((Property) codedInputStream.readMessage(Property.PARSER, extensionRegistryLite));
                                } else if (tag != 42) {
                                    if (tag == 242) {
                                        TypeTable.Builder builder = (this.f81080r0 & 1) == 1 ? this.v0.toBuilder() : null;
                                        TypeTable typeTable = (TypeTable) codedInputStream.readMessage(TypeTable.PARSER, extensionRegistryLite);
                                        this.v0 = typeTable;
                                        if (builder != null) {
                                            builder.mergeFrom(typeTable);
                                            this.v0 = builder.buildPartial();
                                        }
                                        this.f81080r0 |= 1;
                                    } else if (tag != 258) {
                                        if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        VersionRequirementTable.Builder builder2 = (this.f81080r0 & 2) == 2 ? this.f81084w0.toBuilder() : null;
                                        VersionRequirementTable versionRequirementTable = (VersionRequirementTable) codedInputStream.readMessage(VersionRequirementTable.PARSER, extensionRegistryLite);
                                        this.f81084w0 = versionRequirementTable;
                                        if (builder2 != null) {
                                            builder2.mergeFrom(versionRequirementTable);
                                            this.f81084w0 = builder2.buildPartial();
                                        }
                                        this.f81080r0 |= 2;
                                    }
                                } else {
                                    int i13 = (i10 == true ? 1 : 0) & 4;
                                    i10 = i10;
                                    if (i13 != 4) {
                                        this.f81083u0 = new ArrayList();
                                        i10 = (i10 == true ? 1 : 0) | 4;
                                    }
                                    this.f81083u0.add((TypeAlias) codedInputStream.readMessage(TypeAlias.PARSER, extensionRegistryLite));
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e5) {
                            throw e5.setUnfinishedMessage(this);
                        }
                    } catch (IOException e7) {
                        throw new InvalidProtocolBufferException(e7.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (((i10 == true ? 1 : 0) & 1) == 1) {
                        this.f81081s0 = Collections.unmodifiableList(this.f81081s0);
                    }
                    if (((i10 == true ? 1 : 0) & 2) == 2) {
                        this.f81082t0 = Collections.unmodifiableList(this.f81082t0);
                    }
                    if (((i10 == true ? 1 : 0) & 4) == 4) {
                        this.f81083u0 = Collections.unmodifiableList(this.f81083u0);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f81079q0 = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (((i10 == true ? 1 : 0) & 1) == 1) {
                this.f81081s0 = Collections.unmodifiableList(this.f81081s0);
            }
            if (((i10 == true ? 1 : 0) & 2) == 2) {
                this.f81082t0 = Collections.unmodifiableList(this.f81082t0);
            }
            if (((i10 == true ? 1 : 0) & 4) == 4) {
                this.f81083u0 = Collections.unmodifiableList(this.f81083u0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f81079q0 = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public static final class PackageFragment extends GeneratedMessageLite.ExtendableMessage<PackageFragment> implements PackageFragmentOrBuilder {
        public static Parser<PackageFragment> PARSER = new a();

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public static final PackageFragment f81092y0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ByteString f81093q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f81094r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public StringTable f81095s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public QualifiedNameTable f81096t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Package f81097u0;
        public List<Class> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public byte f81098w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public int f81099x0;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<PackageFragment, Builder> implements PackageFragmentOrBuilder {

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public int f81100s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public StringTable f81101t0 = StringTable.getDefaultInstance();

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public QualifiedNameTable f81102u0 = QualifiedNameTable.getDefaultInstance();
            public Package v0 = Package.getDefaultInstance();

            /* JADX INFO: renamed from: w0, reason: collision with root package name */
            public List<Class> f81103w0 = Collections.emptyList();

            public PackageFragment buildPartial() {
                PackageFragment packageFragment = new PackageFragment(this);
                int i10 = this.f81100s0;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                packageFragment.f81095s0 = this.f81101t0;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                packageFragment.f81096t0 = this.f81102u0;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                packageFragment.f81097u0 = this.v0;
                if ((i10 & 8) == 8) {
                    this.f81103w0 = Collections.unmodifiableList(this.f81103w0);
                    this.f81100s0 &= -9;
                }
                packageFragment.v0 = this.f81103w0;
                packageFragment.f81094r0 = i11;
                return packageFragment;
            }

            public Class getClass_(int i10) {
                return this.f81103w0.get(i10);
            }

            public int getClass_Count() {
                return this.f81103w0.size();
            }

            public Package getPackage() {
                return this.v0;
            }

            public QualifiedNameTable getQualifiedNames() {
                return this.f81102u0;
            }

            public boolean hasPackage() {
                return (this.f81100s0 & 4) == 4;
            }

            public boolean hasQualifiedNames() {
                return (this.f81100s0 & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
                    return false;
                }
                if (hasPackage() && !getPackage().isInitialized()) {
                    return false;
                }
                for (int i10 = 0; i10 < getClass_Count(); i10++) {
                    if (!getClass_(i10).isInitialized()) {
                        return false;
                    }
                }
                return extensionsAreInitialized();
            }

            public Builder mergePackage(Package r4) {
                if ((this.f81100s0 & 4) != 4 || this.v0 == Package.getDefaultInstance()) {
                    this.v0 = r4;
                } else {
                    this.v0 = Package.newBuilder(this.v0).mergeFrom(r4).buildPartial();
                }
                this.f81100s0 |= 4;
                return this;
            }

            public Builder mergeQualifiedNames(QualifiedNameTable qualifiedNameTable) {
                if ((this.f81100s0 & 2) != 2 || this.f81102u0 == QualifiedNameTable.getDefaultInstance()) {
                    this.f81102u0 = qualifiedNameTable;
                } else {
                    this.f81102u0 = QualifiedNameTable.newBuilder(this.f81102u0).mergeFrom(qualifiedNameTable).buildPartial();
                }
                this.f81100s0 |= 2;
                return this;
            }

            public Builder mergeStrings(StringTable stringTable) {
                if ((this.f81100s0 & 1) != 1 || this.f81101t0 == StringTable.getDefaultInstance()) {
                    this.f81101t0 = stringTable;
                } else {
                    this.f81101t0 = StringTable.newBuilder(this.f81101t0).mergeFrom(stringTable).buildPartial();
                }
                this.f81100s0 |= 1;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public PackageFragment build() {
                PackageFragment packageFragmentBuildPartial = buildPartial();
                if (packageFragmentBuildPartial.isInitialized()) {
                    return packageFragmentBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(packageFragmentBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public PackageFragment getDefaultInstanceForType() {
                return PackageFragment.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(PackageFragment packageFragment) {
                if (packageFragment == PackageFragment.getDefaultInstance()) {
                    return this;
                }
                if (packageFragment.hasStrings()) {
                    mergeStrings(packageFragment.getStrings());
                }
                if (packageFragment.hasQualifiedNames()) {
                    mergeQualifiedNames(packageFragment.getQualifiedNames());
                }
                if (packageFragment.hasPackage()) {
                    mergePackage(packageFragment.getPackage());
                }
                if (!packageFragment.v0.isEmpty()) {
                    if (this.f81103w0.isEmpty()) {
                        this.f81103w0 = packageFragment.v0;
                        this.f81100s0 &= -9;
                    } else {
                        if ((this.f81100s0 & 8) != 8) {
                            this.f81103w0 = new ArrayList(this.f81103w0);
                            this.f81100s0 |= 8;
                        }
                        this.f81103w0.addAll(packageFragment.v0);
                    }
                }
                mergeExtensionFields(packageFragment);
                setUnknownFields(getUnknownFields().concat(packageFragment.f81093q0));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo5776clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                PackageFragment packageFragment = null;
                try {
                    try {
                        PackageFragment partialFrom = PackageFragment.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        PackageFragment packageFragment2 = (PackageFragment) e5.getUnfinishedMessage();
                        try {
                            throw e5;
                        } catch (Throwable th2) {
                            th = th2;
                            packageFragment = packageFragment2;
                            if (packageFragment != null) {
                                mergeFrom(packageFragment);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (packageFragment != null) {
                        mergeFrom(packageFragment);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<PackageFragment> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public PackageFragment parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new PackageFragment(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            PackageFragment packageFragment = new PackageFragment();
            f81092y0 = packageFragment;
            packageFragment.f81095s0 = StringTable.getDefaultInstance();
            packageFragment.f81096t0 = QualifiedNameTable.getDefaultInstance();
            packageFragment.f81097u0 = Package.getDefaultInstance();
            packageFragment.v0 = Collections.emptyList();
        }

        public PackageFragment(GeneratedMessageLite.ExtendableBuilder<PackageFragment, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f81098w0 = (byte) -1;
            this.f81099x0 = -1;
            this.f81093q0 = extendableBuilder.getUnknownFields();
        }

        public static PackageFragment getDefaultInstance() {
            return f81092y0;
        }

        public static Builder newBuilder(PackageFragment packageFragment) {
            return newBuilder().mergeFrom(packageFragment);
        }

        public static PackageFragment parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseFrom(inputStream, extensionRegistryLite);
        }

        public Class getClass_(int i10) {
            return this.v0.get(i10);
        }

        public int getClass_Count() {
            return this.v0.size();
        }

        public List<Class> getClass_List() {
            return this.v0;
        }

        public Package getPackage() {
            return this.f81097u0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<PackageFragment> getParserForType() {
            return PARSER;
        }

        public QualifiedNameTable getQualifiedNames() {
            return this.f81096t0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f81099x0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = (this.f81094r0 & 1) == 1 ? CodedOutputStream.computeMessageSize(1, this.f81095s0) : 0;
            if ((this.f81094r0 & 2) == 2) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, this.f81096t0);
            }
            if ((this.f81094r0 & 4) == 4) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, this.f81097u0);
            }
            for (int i11 = 0; i11 < this.v0.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, this.v0.get(i11));
            }
            int size = this.f81093q0.size() + extensionsSerializedSize() + iComputeMessageSize;
            this.f81099x0 = size;
            return size;
        }

        public StringTable getStrings() {
            return this.f81095s0;
        }

        public boolean hasPackage() {
            return (this.f81094r0 & 4) == 4;
        }

        public boolean hasQualifiedNames() {
            return (this.f81094r0 & 2) == 2;
        }

        public boolean hasStrings() {
            return (this.f81094r0 & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f81098w0;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
                this.f81098w0 = (byte) 0;
                return false;
            }
            if (hasPackage() && !getPackage().isInitialized()) {
                this.f81098w0 = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < getClass_Count(); i10++) {
                if (!getClass_(i10).isInitialized()) {
                    this.f81098w0 = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.f81098w0 = (byte) 1;
                return true;
            }
            this.f81098w0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.f81094r0 & 1) == 1) {
                codedOutputStream.writeMessage(1, this.f81095s0);
            }
            if ((this.f81094r0 & 2) == 2) {
                codedOutputStream.writeMessage(2, this.f81096t0);
            }
            if ((this.f81094r0 & 4) == 4) {
                codedOutputStream.writeMessage(3, this.f81097u0);
            }
            for (int i10 = 0; i10 < this.v0.size(); i10++) {
                codedOutputStream.writeMessage(4, this.v0.get(i10));
            }
            extensionWriterNewExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f81093q0);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public PackageFragment getDefaultInstanceForType() {
            return f81092y0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public PackageFragment() {
            this.f81098w0 = (byte) -1;
            this.f81099x0 = -1;
            this.f81093q0 = ByteString.EMPTY;
        }

        public PackageFragment(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f81098w0 = (byte) -1;
            this.f81099x0 = -1;
            this.f81095s0 = StringTable.getDefaultInstance();
            this.f81096t0 = QualifiedNameTable.getDefaultInstance();
            this.f81097u0 = Package.getDefaultInstance();
            this.v0 = Collections.emptyList();
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
                                StringTable.Builder builder = (this.f81094r0 & 1) == 1 ? this.f81095s0.toBuilder() : null;
                                StringTable stringTable = (StringTable) codedInputStream.readMessage(StringTable.PARSER, extensionRegistryLite);
                                this.f81095s0 = stringTable;
                                if (builder != null) {
                                    builder.mergeFrom(stringTable);
                                    this.f81095s0 = builder.buildPartial();
                                }
                                this.f81094r0 |= 1;
                            } else if (tag == 18) {
                                QualifiedNameTable.Builder builder2 = (this.f81094r0 & 2) == 2 ? this.f81096t0.toBuilder() : null;
                                QualifiedNameTable qualifiedNameTable = (QualifiedNameTable) codedInputStream.readMessage(QualifiedNameTable.PARSER, extensionRegistryLite);
                                this.f81096t0 = qualifiedNameTable;
                                if (builder2 != null) {
                                    builder2.mergeFrom(qualifiedNameTable);
                                    this.f81096t0 = builder2.buildPartial();
                                }
                                this.f81094r0 |= 2;
                            } else if (tag == 26) {
                                Package.Builder builder3 = (this.f81094r0 & 4) == 4 ? this.f81097u0.toBuilder() : null;
                                Package r10 = (Package) codedInputStream.readMessage(Package.PARSER, extensionRegistryLite);
                                this.f81097u0 = r10;
                                if (builder3 != null) {
                                    builder3.mergeFrom(r10);
                                    this.f81097u0 = builder3.buildPartial();
                                }
                                this.f81094r0 |= 4;
                            } else if (tag != 34) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                int i11 = (i10 == true ? 1 : 0) & 8;
                                i10 = i10;
                                if (i11 != 8) {
                                    this.v0 = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 8;
                                }
                                this.v0.add((Class) codedInputStream.readMessage(Class.PARSER, extensionRegistryLite));
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if (((i10 == true ? 1 : 0) & 8) == 8) {
                            this.v0 = Collections.unmodifiableList(this.v0);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f81093q0 = outputNewOutput.toByteString();
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
            if (((i10 == true ? 1 : 0) & 8) == 8) {
                this.v0 = Collections.unmodifiableList(this.v0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f81093q0 = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface PackageFragmentOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface PackageOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Property extends GeneratedMessageLite.ExtendableMessage<Property> implements PropertyOrBuilder {
        public static final Property O0;
        public static Parser<Property> PARSER = new a();
        public int E0;
        public List<Type> F0;
        public List<Integer> G0;
        public int H0;
        public ValueParameter I0;
        public int J0;
        public int K0;
        public List<Integer> L0;
        public byte M0;
        public int N0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ByteString f81104q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f81105r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f81106s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f81107t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f81108u0;
        public Type v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f81109w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public List<TypeParameter> f81110x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public Type f81111y0;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Property, Builder> implements PropertyOrBuilder {
            public int F0;
            public int J0;
            public int K0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public int f81112s0;
            public int v0;

            /* JADX INFO: renamed from: x0, reason: collision with root package name */
            public int f81116x0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public int f81113t0 = 518;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public int f81114u0 = 2054;

            /* JADX INFO: renamed from: w0, reason: collision with root package name */
            public Type f81115w0 = Type.getDefaultInstance();

            /* JADX INFO: renamed from: y0, reason: collision with root package name */
            public List<TypeParameter> f81117y0 = Collections.emptyList();
            public Type E0 = Type.getDefaultInstance();
            public List<Type> G0 = Collections.emptyList();
            public List<Integer> H0 = Collections.emptyList();
            public ValueParameter I0 = ValueParameter.getDefaultInstance();
            public List<Integer> L0 = Collections.emptyList();

            public Property buildPartial() {
                Property property = new Property(this);
                int i10 = this.f81112s0;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                property.f81106s0 = this.f81113t0;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                property.f81107t0 = this.f81114u0;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                property.f81108u0 = this.v0;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                property.v0 = this.f81115w0;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                property.f81109w0 = this.f81116x0;
                if ((i10 & 32) == 32) {
                    this.f81117y0 = Collections.unmodifiableList(this.f81117y0);
                    this.f81112s0 &= -33;
                }
                property.f81110x0 = this.f81117y0;
                if ((i10 & 64) == 64) {
                    i11 |= 32;
                }
                property.f81111y0 = this.E0;
                if ((i10 & 128) == 128) {
                    i11 |= 64;
                }
                property.E0 = this.F0;
                if ((this.f81112s0 & 256) == 256) {
                    this.G0 = Collections.unmodifiableList(this.G0);
                    this.f81112s0 &= -257;
                }
                property.F0 = this.G0;
                if ((this.f81112s0 & 512) == 512) {
                    this.H0 = Collections.unmodifiableList(this.H0);
                    this.f81112s0 &= -513;
                }
                property.G0 = this.H0;
                if ((i10 & 1024) == 1024) {
                    i11 |= 128;
                }
                property.I0 = this.I0;
                if ((i10 & 2048) == 2048) {
                    i11 |= 256;
                }
                property.J0 = this.J0;
                if ((i10 & 4096) == 4096) {
                    i11 |= 512;
                }
                property.K0 = this.K0;
                if ((this.f81112s0 & 8192) == 8192) {
                    this.L0 = Collections.unmodifiableList(this.L0);
                    this.f81112s0 &= -8193;
                }
                property.L0 = this.L0;
                property.f81105r0 = i11;
                return property;
            }

            public Type getContextReceiverType(int i10) {
                return this.G0.get(i10);
            }

            public int getContextReceiverTypeCount() {
                return this.G0.size();
            }

            public Type getReceiverType() {
                return this.E0;
            }

            public Type getReturnType() {
                return this.f81115w0;
            }

            public ValueParameter getSetterValueParameter() {
                return this.I0;
            }

            public TypeParameter getTypeParameter(int i10) {
                return this.f81117y0.get(i10);
            }

            public int getTypeParameterCount() {
                return this.f81117y0.size();
            }

            public boolean hasName() {
                return (this.f81112s0 & 4) == 4;
            }

            public boolean hasReceiverType() {
                return (this.f81112s0 & 64) == 64;
            }

            public boolean hasReturnType() {
                return (this.f81112s0 & 8) == 8;
            }

            public boolean hasSetterValueParameter() {
                return (this.f81112s0 & 1024) == 1024;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (hasReturnType() && !getReturnType().isInitialized()) {
                    return false;
                }
                for (int i10 = 0; i10 < getTypeParameterCount(); i10++) {
                    if (!getTypeParameter(i10).isInitialized()) {
                        return false;
                    }
                }
                if (hasReceiverType() && !getReceiverType().isInitialized()) {
                    return false;
                }
                for (int i11 = 0; i11 < getContextReceiverTypeCount(); i11++) {
                    if (!getContextReceiverType(i11).isInitialized()) {
                        return false;
                    }
                }
                return (!hasSetterValueParameter() || getSetterValueParameter().isInitialized()) && extensionsAreInitialized();
            }

            public Builder mergeReceiverType(Type type) {
                if ((this.f81112s0 & 64) != 64 || this.E0 == Type.getDefaultInstance()) {
                    this.E0 = type;
                } else {
                    this.E0 = Type.newBuilder(this.E0).mergeFrom(type).buildPartial();
                }
                this.f81112s0 |= 64;
                return this;
            }

            public Builder mergeReturnType(Type type) {
                if ((this.f81112s0 & 8) != 8 || this.f81115w0 == Type.getDefaultInstance()) {
                    this.f81115w0 = type;
                } else {
                    this.f81115w0 = Type.newBuilder(this.f81115w0).mergeFrom(type).buildPartial();
                }
                this.f81112s0 |= 8;
                return this;
            }

            public Builder mergeSetterValueParameter(ValueParameter valueParameter) {
                if ((this.f81112s0 & 1024) != 1024 || this.I0 == ValueParameter.getDefaultInstance()) {
                    this.I0 = valueParameter;
                } else {
                    this.I0 = ValueParameter.newBuilder(this.I0).mergeFrom(valueParameter).buildPartial();
                }
                this.f81112s0 |= 1024;
                return this;
            }

            public Builder setFlags(int i10) {
                this.f81112s0 |= 1;
                this.f81113t0 = i10;
                return this;
            }

            public Builder setGetterFlags(int i10) {
                this.f81112s0 |= 2048;
                this.J0 = i10;
                return this;
            }

            public Builder setName(int i10) {
                this.f81112s0 |= 4;
                this.v0 = i10;
                return this;
            }

            public Builder setOldFlags(int i10) {
                this.f81112s0 |= 2;
                this.f81114u0 = i10;
                return this;
            }

            public Builder setReceiverTypeId(int i10) {
                this.f81112s0 |= 128;
                this.F0 = i10;
                return this;
            }

            public Builder setReturnTypeId(int i10) {
                this.f81112s0 |= 16;
                this.f81116x0 = i10;
                return this;
            }

            public Builder setSetterFlags(int i10) {
                this.f81112s0 |= 4096;
                this.K0 = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Property build() {
                Property propertyBuildPartial = buildPartial();
                if (propertyBuildPartial.isInitialized()) {
                    return propertyBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(propertyBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Property getDefaultInstanceForType() {
                return Property.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Property property) {
                if (property == Property.getDefaultInstance()) {
                    return this;
                }
                if (property.hasFlags()) {
                    setFlags(property.getFlags());
                }
                if (property.hasOldFlags()) {
                    setOldFlags(property.getOldFlags());
                }
                if (property.hasName()) {
                    setName(property.getName());
                }
                if (property.hasReturnType()) {
                    mergeReturnType(property.getReturnType());
                }
                if (property.hasReturnTypeId()) {
                    setReturnTypeId(property.getReturnTypeId());
                }
                if (!property.f81110x0.isEmpty()) {
                    if (this.f81117y0.isEmpty()) {
                        this.f81117y0 = property.f81110x0;
                        this.f81112s0 &= -33;
                    } else {
                        if ((this.f81112s0 & 32) != 32) {
                            this.f81117y0 = new ArrayList(this.f81117y0);
                            this.f81112s0 |= 32;
                        }
                        this.f81117y0.addAll(property.f81110x0);
                    }
                }
                if (property.hasReceiverType()) {
                    mergeReceiverType(property.getReceiverType());
                }
                if (property.hasReceiverTypeId()) {
                    setReceiverTypeId(property.getReceiverTypeId());
                }
                if (!property.F0.isEmpty()) {
                    if (this.G0.isEmpty()) {
                        this.G0 = property.F0;
                        this.f81112s0 &= -257;
                    } else {
                        if ((this.f81112s0 & 256) != 256) {
                            this.G0 = new ArrayList(this.G0);
                            this.f81112s0 |= 256;
                        }
                        this.G0.addAll(property.F0);
                    }
                }
                if (!property.G0.isEmpty()) {
                    if (this.H0.isEmpty()) {
                        this.H0 = property.G0;
                        this.f81112s0 &= -513;
                    } else {
                        if ((this.f81112s0 & 512) != 512) {
                            this.H0 = new ArrayList(this.H0);
                            this.f81112s0 |= 512;
                        }
                        this.H0.addAll(property.G0);
                    }
                }
                if (property.hasSetterValueParameter()) {
                    mergeSetterValueParameter(property.getSetterValueParameter());
                }
                if (property.hasGetterFlags()) {
                    setGetterFlags(property.getGetterFlags());
                }
                if (property.hasSetterFlags()) {
                    setSetterFlags(property.getSetterFlags());
                }
                if (!property.L0.isEmpty()) {
                    if (this.L0.isEmpty()) {
                        this.L0 = property.L0;
                        this.f81112s0 &= -8193;
                    } else {
                        if ((this.f81112s0 & 8192) != 8192) {
                            this.L0 = new ArrayList(this.L0);
                            this.f81112s0 |= 8192;
                        }
                        this.L0.addAll(property.L0);
                    }
                }
                mergeExtensionFields(property);
                setUnknownFields(getUnknownFields().concat(property.f81104q0));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo5776clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Property property = null;
                try {
                    try {
                        Property partialFrom = Property.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        Property property2 = (Property) e5.getUnfinishedMessage();
                        try {
                            throw e5;
                        } catch (Throwable th2) {
                            th = th2;
                            property = property2;
                            if (property != null) {
                                mergeFrom(property);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (property != null) {
                        mergeFrom(property);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<Property> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Property parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Property(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Property property = new Property();
            O0 = property;
            property.b();
        }

        public Property(GeneratedMessageLite.ExtendableBuilder<Property, ?> extendableBuilder) {
            super(extendableBuilder);
            this.H0 = -1;
            this.M0 = (byte) -1;
            this.N0 = -1;
            this.f81104q0 = extendableBuilder.getUnknownFields();
        }

        public static Property getDefaultInstance() {
            return O0;
        }

        public static Builder newBuilder(Property property) {
            return newBuilder().mergeFrom(property);
        }

        public final void b() {
            this.f81106s0 = 518;
            this.f81107t0 = 2054;
            this.f81108u0 = 0;
            this.v0 = Type.getDefaultInstance();
            this.f81109w0 = 0;
            this.f81110x0 = Collections.emptyList();
            this.f81111y0 = Type.getDefaultInstance();
            this.E0 = 0;
            this.F0 = Collections.emptyList();
            this.G0 = Collections.emptyList();
            this.I0 = ValueParameter.getDefaultInstance();
            this.J0 = 0;
            this.K0 = 0;
            this.L0 = Collections.emptyList();
        }

        public Type getContextReceiverType(int i10) {
            return this.F0.get(i10);
        }

        public int getContextReceiverTypeCount() {
            return this.F0.size();
        }

        public List<Integer> getContextReceiverTypeIdList() {
            return this.G0;
        }

        public List<Type> getContextReceiverTypeList() {
            return this.F0;
        }

        public int getFlags() {
            return this.f81106s0;
        }

        public int getGetterFlags() {
            return this.J0;
        }

        public int getName() {
            return this.f81108u0;
        }

        public int getOldFlags() {
            return this.f81107t0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Property> getParserForType() {
            return PARSER;
        }

        public Type getReceiverType() {
            return this.f81111y0;
        }

        public int getReceiverTypeId() {
            return this.E0;
        }

        public Type getReturnType() {
            return this.v0;
        }

        public int getReturnTypeId() {
            return this.f81109w0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.N0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = (this.f81105r0 & 2) == 2 ? CodedOutputStream.computeInt32Size(1, this.f81107t0) : 0;
            if ((this.f81105r0 & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f81108u0);
            }
            if ((this.f81105r0 & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, this.v0);
            }
            for (int i11 = 0; i11 < this.f81110x0.size(); i11++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.f81110x0.get(i11));
            }
            if ((this.f81105r0 & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(5, this.f81111y0);
            }
            if ((this.f81105r0 & 128) == 128) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(6, this.I0);
            }
            if ((this.f81105r0 & 256) == 256) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, this.J0);
            }
            if ((this.f81105r0 & 512) == 512) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(8, this.K0);
            }
            if ((this.f81105r0 & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(9, this.f81109w0);
            }
            if ((this.f81105r0 & 64) == 64) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(10, this.E0);
            }
            if ((this.f81105r0 & 1) == 1) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(11, this.f81106s0);
            }
            for (int i12 = 0; i12 < this.F0.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(12, this.F0.get(i12));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i13 = 0; i13 < this.G0.size(); i13++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.G0.get(i13).intValue());
            }
            int iComputeInt32SizeNoTag2 = iComputeInt32Size + iComputeInt32SizeNoTag;
            if (!getContextReceiverTypeIdList().isEmpty()) {
                iComputeInt32SizeNoTag2 = iComputeInt32SizeNoTag2 + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.H0 = iComputeInt32SizeNoTag;
            int iComputeInt32SizeNoTag3 = 0;
            for (int i14 = 0; i14 < this.L0.size(); i14++) {
                iComputeInt32SizeNoTag3 += CodedOutputStream.computeInt32SizeNoTag(this.L0.get(i14).intValue());
            }
            int size = this.f81104q0.size() + extensionsSerializedSize() + (getVersionRequirementList().size() * 2) + iComputeInt32SizeNoTag2 + iComputeInt32SizeNoTag3;
            this.N0 = size;
            return size;
        }

        public int getSetterFlags() {
            return this.K0;
        }

        public ValueParameter getSetterValueParameter() {
            return this.I0;
        }

        public TypeParameter getTypeParameter(int i10) {
            return this.f81110x0.get(i10);
        }

        public int getTypeParameterCount() {
            return this.f81110x0.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.f81110x0;
        }

        public List<Integer> getVersionRequirementList() {
            return this.L0;
        }

        public boolean hasFlags() {
            return (this.f81105r0 & 1) == 1;
        }

        public boolean hasGetterFlags() {
            return (this.f81105r0 & 256) == 256;
        }

        public boolean hasName() {
            return (this.f81105r0 & 4) == 4;
        }

        public boolean hasOldFlags() {
            return (this.f81105r0 & 2) == 2;
        }

        public boolean hasReceiverType() {
            return (this.f81105r0 & 32) == 32;
        }

        public boolean hasReceiverTypeId() {
            return (this.f81105r0 & 64) == 64;
        }

        public boolean hasReturnType() {
            return (this.f81105r0 & 8) == 8;
        }

        public boolean hasReturnTypeId() {
            return (this.f81105r0 & 16) == 16;
        }

        public boolean hasSetterFlags() {
            return (this.f81105r0 & 512) == 512;
        }

        public boolean hasSetterValueParameter() {
            return (this.f81105r0 & 128) == 128;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.M0;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!hasName()) {
                this.M0 = (byte) 0;
                return false;
            }
            if (hasReturnType() && !getReturnType().isInitialized()) {
                this.M0 = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < getTypeParameterCount(); i10++) {
                if (!getTypeParameter(i10).isInitialized()) {
                    this.M0 = (byte) 0;
                    return false;
                }
            }
            if (hasReceiverType() && !getReceiverType().isInitialized()) {
                this.M0 = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getContextReceiverTypeCount(); i11++) {
                if (!getContextReceiverType(i11).isInitialized()) {
                    this.M0 = (byte) 0;
                    return false;
                }
            }
            if (hasSetterValueParameter() && !getSetterValueParameter().isInitialized()) {
                this.M0 = (byte) 0;
                return false;
            }
            if (extensionsAreInitialized()) {
                this.M0 = (byte) 1;
                return true;
            }
            this.M0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.f81105r0 & 2) == 2) {
                codedOutputStream.writeInt32(1, this.f81107t0);
            }
            if ((this.f81105r0 & 4) == 4) {
                codedOutputStream.writeInt32(2, this.f81108u0);
            }
            if ((this.f81105r0 & 8) == 8) {
                codedOutputStream.writeMessage(3, this.v0);
            }
            for (int i10 = 0; i10 < this.f81110x0.size(); i10++) {
                codedOutputStream.writeMessage(4, this.f81110x0.get(i10));
            }
            if ((this.f81105r0 & 32) == 32) {
                codedOutputStream.writeMessage(5, this.f81111y0);
            }
            if ((this.f81105r0 & 128) == 128) {
                codedOutputStream.writeMessage(6, this.I0);
            }
            if ((this.f81105r0 & 256) == 256) {
                codedOutputStream.writeInt32(7, this.J0);
            }
            if ((this.f81105r0 & 512) == 512) {
                codedOutputStream.writeInt32(8, this.K0);
            }
            if ((this.f81105r0 & 16) == 16) {
                codedOutputStream.writeInt32(9, this.f81109w0);
            }
            if ((this.f81105r0 & 64) == 64) {
                codedOutputStream.writeInt32(10, this.E0);
            }
            if ((this.f81105r0 & 1) == 1) {
                codedOutputStream.writeInt32(11, this.f81106s0);
            }
            for (int i11 = 0; i11 < this.F0.size(); i11++) {
                codedOutputStream.writeMessage(12, this.F0.get(i11));
            }
            if (getContextReceiverTypeIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(106);
                codedOutputStream.writeRawVarint32(this.H0);
            }
            for (int i12 = 0; i12 < this.G0.size(); i12++) {
                codedOutputStream.writeInt32NoTag(this.G0.get(i12).intValue());
            }
            for (int i13 = 0; i13 < this.L0.size(); i13++) {
                codedOutputStream.writeInt32(31, this.L0.get(i13).intValue());
            }
            extensionWriterNewExtensionWriter.writeUntil(19000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f81104q0);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Property getDefaultInstanceForType() {
            return O0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Property() {
            this.H0 = -1;
            this.M0 = (byte) -1;
            this.N0 = -1;
            this.f81104q0 = ByteString.EMPTY;
        }

        public Property(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.H0 = -1;
            this.M0 = (byte) -1;
            this.N0 = -1;
            b();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        switch (tag) {
                            case 0:
                                break;
                            case 8:
                                this.f81105r0 |= 2;
                                this.f81107t0 = codedInputStream.readInt32();
                                continue;
                            case 16:
                                this.f81105r0 |= 4;
                                this.f81108u0 = codedInputStream.readInt32();
                                continue;
                            case 26:
                                Type.Builder builder = (this.f81105r0 & 8) == 8 ? this.v0.toBuilder() : null;
                                Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.v0 = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.v0 = builder.buildPartial();
                                }
                                this.f81105r0 |= 8;
                                continue;
                            case 34:
                                int i11 = (i10 == true ? 1 : 0) & 32;
                                i10 = i10;
                                if (i11 != 32) {
                                    this.f81110x0 = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 32;
                                }
                                this.f81110x0.add((TypeParameter) codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                                continue;
                            case 42:
                                Type.Builder builder2 = (this.f81105r0 & 32) == 32 ? this.f81111y0.toBuilder() : null;
                                Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.f81111y0 = type2;
                                if (builder2 != null) {
                                    builder2.mergeFrom(type2);
                                    this.f81111y0 = builder2.buildPartial();
                                }
                                this.f81105r0 |= 32;
                                continue;
                            case 50:
                                ValueParameter.Builder builder3 = (this.f81105r0 & 128) == 128 ? this.I0.toBuilder() : null;
                                ValueParameter valueParameter = (ValueParameter) codedInputStream.readMessage(ValueParameter.PARSER, extensionRegistryLite);
                                this.I0 = valueParameter;
                                if (builder3 != null) {
                                    builder3.mergeFrom(valueParameter);
                                    this.I0 = builder3.buildPartial();
                                }
                                this.f81105r0 |= 128;
                                continue;
                            case 56:
                                this.f81105r0 |= 256;
                                this.J0 = codedInputStream.readInt32();
                                continue;
                            case 64:
                                this.f81105r0 |= 512;
                                this.K0 = codedInputStream.readInt32();
                                continue;
                            case 72:
                                this.f81105r0 |= 16;
                                this.f81109w0 = codedInputStream.readInt32();
                                continue;
                            case 80:
                                this.f81105r0 |= 64;
                                this.E0 = codedInputStream.readInt32();
                                continue;
                            case 88:
                                this.f81105r0 |= 1;
                                this.f81106s0 = codedInputStream.readInt32();
                                continue;
                            case 98:
                                int i12 = (i10 == true ? 1 : 0) & 256;
                                i10 = i10;
                                if (i12 != 256) {
                                    this.F0 = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 256;
                                }
                                this.F0.add((Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                                continue;
                            case 104:
                                int i13 = (i10 == true ? 1 : 0) & 512;
                                i10 = i10;
                                if (i13 != 512) {
                                    this.G0 = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 512;
                                }
                                this.G0.add(Integer.valueOf(codedInputStream.readInt32()));
                                continue;
                            case 106:
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                int i14 = (i10 == true ? 1 : 0) & 512;
                                i10 = i10;
                                if (i14 != 512 && codedInputStream.getBytesUntilLimit() > 0) {
                                    i10 = i10;
                                    this.G0 = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 512;
                                }
                                i10 = i10;
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.G0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                                continue;
                            case 248:
                                int i15 = (i10 == true ? 1 : 0) & 8192;
                                i10 = i10;
                                if (i15 != 8192) {
                                    this.L0 = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 8192;
                                }
                                this.L0.add(Integer.valueOf(codedInputStream.readInt32()));
                                continue;
                            case 250:
                                int iPushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                int i16 = (i10 == true ? 1 : 0) & 8192;
                                i10 = i10;
                                if (i16 != 8192 && codedInputStream.getBytesUntilLimit() > 0) {
                                    i10 = i10;
                                    this.L0 = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 8192;
                                }
                                i10 = i10;
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.L0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit2);
                                continue;
                            default:
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    break;
                                }
                                break;
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e5) {
                        throw e5.setUnfinishedMessage(this);
                    } catch (IOException e7) {
                        throw new InvalidProtocolBufferException(e7.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (((i10 == true ? 1 : 0) & 32) == 32) {
                        this.f81110x0 = Collections.unmodifiableList(this.f81110x0);
                    }
                    if (((i10 == true ? 1 : 0) & 256) == 256) {
                        this.F0 = Collections.unmodifiableList(this.F0);
                    }
                    if (((i10 == true ? 1 : 0) & 512) == 512) {
                        this.G0 = Collections.unmodifiableList(this.G0);
                    }
                    if (((i10 == true ? 1 : 0) & 8192) == 8192) {
                        this.L0 = Collections.unmodifiableList(this.L0);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f81104q0 = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (((i10 == true ? 1 : 0) & 32) == 32) {
                this.f81110x0 = Collections.unmodifiableList(this.f81110x0);
            }
            if (((i10 == true ? 1 : 0) & 256) == 256) {
                this.F0 = Collections.unmodifiableList(this.F0);
            }
            if (((i10 == true ? 1 : 0) & 512) == 512) {
                this.G0 = Collections.unmodifiableList(this.G0);
            }
            if (((i10 == true ? 1 : 0) & 8192) == 8192) {
                this.L0 = Collections.unmodifiableList(this.L0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f81104q0 = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface PropertyOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class QualifiedNameTable extends GeneratedMessageLite implements QualifiedNameTableOrBuilder {
        public static Parser<QualifiedNameTable> PARSER = new a();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static final QualifiedNameTable f81118t0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ByteString f81119p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public List<QualifiedName> f81120q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public byte f81121r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f81122s0;

        public static final class Builder extends GeneratedMessageLite.Builder<QualifiedNameTable, Builder> implements QualifiedNameTableOrBuilder {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public int f81123q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public List<QualifiedName> f81124r0 = Collections.emptyList();

            public QualifiedNameTable buildPartial() {
                QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(this);
                if ((this.f81123q0 & 1) == 1) {
                    this.f81124r0 = Collections.unmodifiableList(this.f81124r0);
                    this.f81123q0 &= -2;
                }
                qualifiedNameTable.f81120q0 = this.f81124r0;
                return qualifiedNameTable;
            }

            public QualifiedName getQualifiedName(int i10) {
                return this.f81124r0.get(i10);
            }

            public int getQualifiedNameCount() {
                return this.f81124r0.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < getQualifiedNameCount(); i10++) {
                    if (!getQualifiedName(i10).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public QualifiedNameTable build() {
                QualifiedNameTable qualifiedNameTableBuildPartial = buildPartial();
                if (qualifiedNameTableBuildPartial.isInitialized()) {
                    return qualifiedNameTableBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(qualifiedNameTableBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public QualifiedNameTable getDefaultInstanceForType() {
                return QualifiedNameTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo5776clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(QualifiedNameTable qualifiedNameTable) {
                if (qualifiedNameTable == QualifiedNameTable.getDefaultInstance()) {
                    return this;
                }
                if (!qualifiedNameTable.f81120q0.isEmpty()) {
                    if (this.f81124r0.isEmpty()) {
                        this.f81124r0 = qualifiedNameTable.f81120q0;
                        this.f81123q0 &= -2;
                    } else {
                        if ((this.f81123q0 & 1) != 1) {
                            this.f81124r0 = new ArrayList(this.f81124r0);
                            this.f81123q0 |= 1;
                        }
                        this.f81124r0.addAll(qualifiedNameTable.f81120q0);
                    }
                }
                setUnknownFields(getUnknownFields().concat(qualifiedNameTable.f81119p0));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                QualifiedNameTable qualifiedNameTable = null;
                try {
                    try {
                        QualifiedNameTable partialFrom = QualifiedNameTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        QualifiedNameTable qualifiedNameTable2 = (QualifiedNameTable) e5.getUnfinishedMessage();
                        try {
                            throw e5;
                        } catch (Throwable th2) {
                            th = th2;
                            qualifiedNameTable = qualifiedNameTable2;
                            if (qualifiedNameTable != null) {
                                mergeFrom(qualifiedNameTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (qualifiedNameTable != null) {
                        mergeFrom(qualifiedNameTable);
                    }
                    throw th;
                }
            }
        }

        public static final class QualifiedName extends GeneratedMessageLite implements QualifiedNameOrBuilder {
            public static Parser<QualifiedName> PARSER = new a();

            /* JADX INFO: renamed from: w0, reason: collision with root package name */
            public static final QualifiedName f81125w0;

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final ByteString f81126p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public int f81127q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public int f81128r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public int f81129s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public Kind f81130t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public byte f81131u0;
            public int v0;

            public static final class Builder extends GeneratedMessageLite.Builder<QualifiedName, Builder> implements QualifiedNameOrBuilder {

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public int f81132q0;

                /* JADX INFO: renamed from: s0, reason: collision with root package name */
                public int f81134s0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public int f81133r0 = -1;

                /* JADX INFO: renamed from: t0, reason: collision with root package name */
                public Kind f81135t0 = Kind.PACKAGE;

                public QualifiedName buildPartial() {
                    QualifiedName qualifiedName = new QualifiedName(this);
                    int i10 = this.f81132q0;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    qualifiedName.f81128r0 = this.f81133r0;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    qualifiedName.f81129s0 = this.f81134s0;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    qualifiedName.f81130t0 = this.f81135t0;
                    qualifiedName.f81127q0 = i11;
                    return qualifiedName;
                }

                public boolean hasShortName() {
                    return (this.f81132q0 & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasShortName();
                }

                public Builder setKind(Kind kind) {
                    kind.getClass();
                    this.f81132q0 |= 4;
                    this.f81135t0 = kind;
                    return this;
                }

                public Builder setParentQualifiedName(int i10) {
                    this.f81132q0 |= 1;
                    this.f81133r0 = i10;
                    return this;
                }

                public Builder setShortName(int i10) {
                    this.f81132q0 |= 2;
                    this.f81134s0 = i10;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public QualifiedName build() {
                    QualifiedName qualifiedNameBuildPartial = buildPartial();
                    if (qualifiedNameBuildPartial.isInitialized()) {
                        return qualifiedNameBuildPartial;
                    }
                    throw AbstractMessageLite.Builder.newUninitializedMessageException(qualifiedNameBuildPartial);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public QualifiedName getDefaultInstanceForType() {
                    return QualifiedName.getDefaultInstance();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo5776clone() {
                    return new Builder().mergeFrom(buildPartial());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public Builder mergeFrom(QualifiedName qualifiedName) {
                    if (qualifiedName == QualifiedName.getDefaultInstance()) {
                        return this;
                    }
                    if (qualifiedName.hasParentQualifiedName()) {
                        setParentQualifiedName(qualifiedName.getParentQualifiedName());
                    }
                    if (qualifiedName.hasShortName()) {
                        setShortName(qualifiedName.getShortName());
                    }
                    if (qualifiedName.hasKind()) {
                        setKind(qualifiedName.getKind());
                    }
                    setUnknownFields(getUnknownFields().concat(qualifiedName.f81126p0));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    QualifiedName qualifiedName = null;
                    try {
                        try {
                            QualifiedName partialFrom = QualifiedName.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (partialFrom != null) {
                                mergeFrom(partialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e5) {
                            QualifiedName qualifiedName2 = (QualifiedName) e5.getUnfinishedMessage();
                            try {
                                throw e5;
                            } catch (Throwable th2) {
                                th = th2;
                                qualifiedName = qualifiedName2;
                                if (qualifiedName != null) {
                                    mergeFrom(qualifiedName);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (qualifiedName != null) {
                            mergeFrom(qualifiedName);
                        }
                        throw th;
                    }
                }
            }

            public enum Kind implements Internal.EnumLite {
                CLASS(0),
                PACKAGE(1),
                LOCAL(2);

                private static Internal.EnumLiteMap<Kind> internalValueMap = new a();
                private final int value;

                public static class a implements Internal.EnumLiteMap<Kind> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                    public Kind findValueByNumber(int i10) {
                        return Kind.valueOf(i10);
                    }
                }

                Kind(int i10) {
                    this.value = i10;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.value;
                }

                public static Kind valueOf(int i10) {
                    if (i10 == 0) {
                        return CLASS;
                    }
                    if (i10 == 1) {
                        return PACKAGE;
                    }
                    if (i10 != 2) {
                        return null;
                    }
                    return LOCAL;
                }
            }

            public static class a extends AbstractParser<QualifiedName> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                public QualifiedName parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new QualifiedName(codedInputStream, extensionRegistryLite);
                }
            }

            static {
                QualifiedName qualifiedName = new QualifiedName();
                f81125w0 = qualifiedName;
                qualifiedName.f81128r0 = -1;
                qualifiedName.f81129s0 = 0;
                qualifiedName.f81130t0 = Kind.PACKAGE;
            }

            public QualifiedName(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.f81131u0 = (byte) -1;
                this.v0 = -1;
                this.f81126p0 = builder.getUnknownFields();
            }

            public static QualifiedName getDefaultInstance() {
                return f81125w0;
            }

            public static Builder newBuilder(QualifiedName qualifiedName) {
                return newBuilder().mergeFrom(qualifiedName);
            }

            public Kind getKind() {
                return this.f81130t0;
            }

            public int getParentQualifiedName() {
                return this.f81128r0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<QualifiedName> getParserForType() {
                return PARSER;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.v0;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeInt32Size = (this.f81127q0 & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f81128r0) : 0;
                if ((this.f81127q0 & 2) == 2) {
                    iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f81129s0);
                }
                if ((this.f81127q0 & 4) == 4) {
                    iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.f81130t0.getNumber());
                }
                int size = this.f81126p0.size() + iComputeInt32Size;
                this.v0 = size;
                return size;
            }

            public int getShortName() {
                return this.f81129s0;
            }

            public boolean hasKind() {
                return (this.f81127q0 & 4) == 4;
            }

            public boolean hasParentQualifiedName() {
                return (this.f81127q0 & 1) == 1;
            }

            public boolean hasShortName() {
                return (this.f81127q0 & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f81131u0;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (hasShortName()) {
                    this.f81131u0 = (byte) 1;
                    return true;
                }
                this.f81131u0 = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.f81127q0 & 1) == 1) {
                    codedOutputStream.writeInt32(1, this.f81128r0);
                }
                if ((this.f81127q0 & 2) == 2) {
                    codedOutputStream.writeInt32(2, this.f81129s0);
                }
                if ((this.f81127q0 & 4) == 4) {
                    codedOutputStream.writeEnum(3, this.f81130t0.getNumber());
                }
                codedOutputStream.writeRawBytes(this.f81126p0);
            }

            public static Builder newBuilder() {
                return new Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public QualifiedName getDefaultInstanceForType() {
                return f81125w0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            public QualifiedName() {
                this.f81131u0 = (byte) -1;
                this.v0 = -1;
                this.f81126p0 = ByteString.EMPTY;
            }

            public QualifiedName(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.f81131u0 = (byte) -1;
                this.v0 = -1;
                this.f81128r0 = -1;
                boolean z10 = false;
                this.f81129s0 = 0;
                this.f81130t0 = Kind.PACKAGE;
                ByteString.Output outputNewOutput = ByteString.newOutput();
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.f81127q0 |= 1;
                                    this.f81128r0 = codedInputStream.readInt32();
                                } else if (tag == 16) {
                                    this.f81127q0 |= 2;
                                    this.f81129s0 = codedInputStream.readInt32();
                                } else if (tag != 24) {
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int i10 = codedInputStream.readEnum();
                                    Kind kindValueOf = Kind.valueOf(i10);
                                    if (kindValueOf == null) {
                                        codedOutputStreamNewInstance.writeRawVarint32(tag);
                                        codedOutputStreamNewInstance.writeRawVarint32(i10);
                                    } else {
                                        this.f81127q0 |= 4;
                                        this.f81130t0 = kindValueOf;
                                    }
                                }
                            }
                            z10 = true;
                        } catch (Throwable th2) {
                            try {
                                codedOutputStreamNewInstance.flush();
                            } catch (IOException unused) {
                            } finally {
                                this.f81126p0 = outputNewOutput.toByteString();
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
                    this.f81126p0 = outputNewOutput.toByteString();
                }
                makeExtensionsImmutable();
            }
        }

        public interface QualifiedNameOrBuilder extends MessageLiteOrBuilder {
        }

        public static class a extends AbstractParser<QualifiedNameTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public QualifiedNameTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new QualifiedNameTable(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            QualifiedNameTable qualifiedNameTable = new QualifiedNameTable();
            f81118t0 = qualifiedNameTable;
            qualifiedNameTable.f81120q0 = Collections.emptyList();
        }

        public QualifiedNameTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f81121r0 = (byte) -1;
            this.f81122s0 = -1;
            this.f81119p0 = builder.getUnknownFields();
        }

        public static QualifiedNameTable getDefaultInstance() {
            return f81118t0;
        }

        public static Builder newBuilder(QualifiedNameTable qualifiedNameTable) {
            return newBuilder().mergeFrom(qualifiedNameTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<QualifiedNameTable> getParserForType() {
            return PARSER;
        }

        public QualifiedName getQualifiedName(int i10) {
            return this.f81120q0.get(i10);
        }

        public int getQualifiedNameCount() {
            return this.f81120q0.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f81122s0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f81120q0.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.f81120q0.get(i11));
            }
            int size = this.f81119p0.size() + iComputeMessageSize;
            this.f81122s0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f81121r0;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < getQualifiedNameCount(); i10++) {
                if (!getQualifiedName(i10).isInitialized()) {
                    this.f81121r0 = (byte) 0;
                    return false;
                }
            }
            this.f81121r0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i10 = 0; i10 < this.f81120q0.size(); i10++) {
                codedOutputStream.writeMessage(1, this.f81120q0.get(i10));
            }
            codedOutputStream.writeRawBytes(this.f81119p0);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public QualifiedNameTable getDefaultInstanceForType() {
            return f81118t0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public QualifiedNameTable() {
            this.f81121r0 = (byte) -1;
            this.f81122s0 = -1;
            this.f81119p0 = ByteString.EMPTY;
        }

        public QualifiedNameTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f81121r0 = (byte) -1;
            this.f81122s0 = -1;
            this.f81120q0 = Collections.emptyList();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 10) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if (!(z11 & true)) {
                                    this.f81120q0 = new ArrayList();
                                    z11 |= true;
                                }
                                this.f81120q0.add((QualifiedName) codedInputStream.readMessage(QualifiedName.PARSER, extensionRegistryLite));
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if (z11 & true) {
                            this.f81120q0 = Collections.unmodifiableList(this.f81120q0);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f81119p0 = outputNewOutput.toByteString();
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
            if (z11 & true) {
                this.f81120q0 = Collections.unmodifiableList(this.f81120q0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f81119p0 = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface QualifiedNameTableOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class StringTable extends GeneratedMessageLite implements StringTableOrBuilder {
        public static Parser<StringTable> PARSER = new a();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static final StringTable f81136t0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ByteString f81137p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public LazyStringList f81138q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public byte f81139r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f81140s0;

        public static final class Builder extends GeneratedMessageLite.Builder<StringTable, Builder> implements StringTableOrBuilder {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public int f81141q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public LazyStringList f81142r0 = LazyStringArrayList.EMPTY;

            public StringTable buildPartial() {
                StringTable stringTable = new StringTable(this);
                if ((this.f81141q0 & 1) == 1) {
                    this.f81142r0 = this.f81142r0.getUnmodifiableView();
                    this.f81141q0 &= -2;
                }
                stringTable.f81138q0 = this.f81142r0;
                return stringTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public StringTable build() {
                StringTable stringTableBuildPartial = buildPartial();
                if (stringTableBuildPartial.isInitialized()) {
                    return stringTableBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(stringTableBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public StringTable getDefaultInstanceForType() {
                return StringTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo5776clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(StringTable stringTable) {
                if (stringTable == StringTable.getDefaultInstance()) {
                    return this;
                }
                if (!stringTable.f81138q0.isEmpty()) {
                    if (this.f81142r0.isEmpty()) {
                        this.f81142r0 = stringTable.f81138q0;
                        this.f81141q0 &= -2;
                    } else {
                        if ((this.f81141q0 & 1) != 1) {
                            this.f81142r0 = new LazyStringArrayList(this.f81142r0);
                            this.f81141q0 |= 1;
                        }
                        this.f81142r0.addAll(stringTable.f81138q0);
                    }
                }
                setUnknownFields(getUnknownFields().concat(stringTable.f81137p0));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                StringTable stringTable = null;
                try {
                    try {
                        StringTable partialFrom = StringTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        StringTable stringTable2 = (StringTable) e5.getUnfinishedMessage();
                        try {
                            throw e5;
                        } catch (Throwable th2) {
                            th = th2;
                            stringTable = stringTable2;
                            if (stringTable != null) {
                                mergeFrom(stringTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (stringTable != null) {
                        mergeFrom(stringTable);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<StringTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public StringTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new StringTable(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            StringTable stringTable = new StringTable();
            f81136t0 = stringTable;
            stringTable.f81138q0 = LazyStringArrayList.EMPTY;
        }

        public StringTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f81139r0 = (byte) -1;
            this.f81140s0 = -1;
            this.f81137p0 = builder.getUnknownFields();
        }

        public static StringTable getDefaultInstance() {
            return f81136t0;
        }

        public static Builder newBuilder(StringTable stringTable) {
            return newBuilder().mergeFrom(stringTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<StringTable> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f81140s0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeBytesSizeNoTag = 0;
            for (int i11 = 0; i11 < this.f81138q0.size(); i11++) {
                iComputeBytesSizeNoTag += CodedOutputStream.computeBytesSizeNoTag(this.f81138q0.getByteString(i11));
            }
            int size = this.f81137p0.size() + getStringList().size() + iComputeBytesSizeNoTag;
            this.f81140s0 = size;
            return size;
        }

        public String getString(int i10) {
            return this.f81138q0.get(i10);
        }

        public ProtocolStringList getStringList() {
            return this.f81138q0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f81139r0;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f81139r0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i10 = 0; i10 < this.f81138q0.size(); i10++) {
                codedOutputStream.writeBytes(1, this.f81138q0.getByteString(i10));
            }
            codedOutputStream.writeRawBytes(this.f81137p0);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public StringTable getDefaultInstanceForType() {
            return f81136t0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public StringTable() {
            this.f81139r0 = (byte) -1;
            this.f81140s0 = -1;
            this.f81137p0 = ByteString.EMPTY;
        }

        public StringTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f81139r0 = (byte) -1;
            this.f81140s0 = -1;
            this.f81138q0 = LazyStringArrayList.EMPTY;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 10) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                ByteString bytes = codedInputStream.readBytes();
                                if (!(z11 & true)) {
                                    this.f81138q0 = new LazyStringArrayList();
                                    z11 |= true;
                                }
                                this.f81138q0.add(bytes);
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if (z11 & true) {
                            this.f81138q0 = this.f81138q0.getUnmodifiableView();
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f81137p0 = outputNewOutput.toByteString();
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
            if (z11 & true) {
                this.f81138q0 = this.f81138q0.getUnmodifiableView();
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f81137p0 = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface StringTableOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Type extends GeneratedMessageLite.ExtendableMessage<Type> implements TypeOrBuilder {
        public static final Type N0;
        public static Parser<Type> PARSER = new a();
        public int E0;
        public int F0;
        public Type G0;
        public int H0;
        public Type I0;
        public int J0;
        public int K0;
        public byte L0;
        public int M0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ByteString f81143q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f81144r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public List<Argument> f81145s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f81146t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f81147u0;
        public Type v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f81148w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public int f81149x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public int f81150y0;

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {
            public static Parser<Argument> PARSER = new a();

            /* JADX INFO: renamed from: w0, reason: collision with root package name */
            public static final Argument f81151w0;

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final ByteString f81152p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public int f81153q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public Projection f81154r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public Type f81155s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public int f81156t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public byte f81157u0;
            public int v0;

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public int f81158q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public Projection f81159r0 = Projection.INV;

                /* JADX INFO: renamed from: s0, reason: collision with root package name */
                public Type f81160s0 = Type.getDefaultInstance();

                /* JADX INFO: renamed from: t0, reason: collision with root package name */
                public int f81161t0;

                public Argument buildPartial() {
                    Argument argument = new Argument(this);
                    int i10 = this.f81158q0;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    argument.f81154r0 = this.f81159r0;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    argument.f81155s0 = this.f81160s0;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    argument.f81156t0 = this.f81161t0;
                    argument.f81153q0 = i11;
                    return argument;
                }

                public Type getType() {
                    return this.f81160s0;
                }

                public boolean hasType() {
                    return (this.f81158q0 & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return !hasType() || getType().isInitialized();
                }

                public Builder mergeType(Type type) {
                    if ((this.f81158q0 & 2) != 2 || this.f81160s0 == Type.getDefaultInstance()) {
                        this.f81160s0 = type;
                    } else {
                        this.f81160s0 = Type.newBuilder(this.f81160s0).mergeFrom(type).buildPartial();
                    }
                    this.f81158q0 |= 2;
                    return this;
                }

                public Builder setProjection(Projection projection) {
                    projection.getClass();
                    this.f81158q0 |= 1;
                    this.f81159r0 = projection;
                    return this;
                }

                public Builder setTypeId(int i10) {
                    this.f81158q0 |= 4;
                    this.f81161t0 = i10;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Argument build() {
                    Argument argumentBuildPartial = buildPartial();
                    if (argumentBuildPartial.isInitialized()) {
                        return argumentBuildPartial;
                    }
                    throw AbstractMessageLite.Builder.newUninitializedMessageException(argumentBuildPartial);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public Argument getDefaultInstanceForType() {
                    return Argument.getDefaultInstance();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo5776clone() {
                    return new Builder().mergeFrom(buildPartial());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                public Builder mergeFrom(Argument argument) {
                    if (argument == Argument.getDefaultInstance()) {
                        return this;
                    }
                    if (argument.hasProjection()) {
                        setProjection(argument.getProjection());
                    }
                    if (argument.hasType()) {
                        mergeType(argument.getType());
                    }
                    if (argument.hasTypeId()) {
                        setTypeId(argument.getTypeId());
                    }
                    setUnknownFields(getUnknownFields().concat(argument.f81152p0));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Argument argument = null;
                    try {
                        try {
                            Argument partialFrom = Argument.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (partialFrom != null) {
                                mergeFrom(partialFrom);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e5) {
                            Argument argument2 = (Argument) e5.getUnfinishedMessage();
                            try {
                                throw e5;
                            } catch (Throwable th2) {
                                th = th2;
                                argument = argument2;
                                if (argument != null) {
                                    mergeFrom(argument);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (argument != null) {
                            mergeFrom(argument);
                        }
                        throw th;
                    }
                }
            }

            public enum Projection implements Internal.EnumLite {
                IN(0),
                OUT(1),
                INV(2),
                STAR(3);

                private static Internal.EnumLiteMap<Projection> internalValueMap = new a();
                private final int value;

                public static class a implements Internal.EnumLiteMap<Projection> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                    public Projection findValueByNumber(int i10) {
                        return Projection.valueOf(i10);
                    }
                }

                Projection(int i10) {
                    this.value = i10;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int getNumber() {
                    return this.value;
                }

                public static Projection valueOf(int i10) {
                    if (i10 == 0) {
                        return IN;
                    }
                    if (i10 == 1) {
                        return OUT;
                    }
                    if (i10 == 2) {
                        return INV;
                    }
                    if (i10 != 3) {
                        return null;
                    }
                    return STAR;
                }
            }

            public static class a extends AbstractParser<Argument> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                public Argument parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Argument(codedInputStream, extensionRegistryLite);
                }
            }

            static {
                Argument argument = new Argument();
                f81151w0 = argument;
                argument.f81154r0 = Projection.INV;
                argument.f81155s0 = Type.getDefaultInstance();
                argument.f81156t0 = 0;
            }

            public Argument(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.f81157u0 = (byte) -1;
                this.v0 = -1;
                this.f81152p0 = builder.getUnknownFields();
            }

            public static Argument getDefaultInstance() {
                return f81151w0;
            }

            public static Builder newBuilder(Argument argument) {
                return newBuilder().mergeFrom(argument);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<Argument> getParserForType() {
                return PARSER;
            }

            public Projection getProjection() {
                return this.f81154r0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.v0;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeEnumSize = (this.f81153q0 & 1) == 1 ? CodedOutputStream.computeEnumSize(1, this.f81154r0.getNumber()) : 0;
                if ((this.f81153q0 & 2) == 2) {
                    iComputeEnumSize += CodedOutputStream.computeMessageSize(2, this.f81155s0);
                }
                if ((this.f81153q0 & 4) == 4) {
                    iComputeEnumSize += CodedOutputStream.computeInt32Size(3, this.f81156t0);
                }
                int size = this.f81152p0.size() + iComputeEnumSize;
                this.v0 = size;
                return size;
            }

            public Type getType() {
                return this.f81155s0;
            }

            public int getTypeId() {
                return this.f81156t0;
            }

            public boolean hasProjection() {
                return (this.f81153q0 & 1) == 1;
            }

            public boolean hasType() {
                return (this.f81153q0 & 2) == 2;
            }

            public boolean hasTypeId() {
                return (this.f81153q0 & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f81157u0;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (!hasType() || getType().isInitialized()) {
                    this.f81157u0 = (byte) 1;
                    return true;
                }
                this.f81157u0 = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.f81153q0 & 1) == 1) {
                    codedOutputStream.writeEnum(1, this.f81154r0.getNumber());
                }
                if ((this.f81153q0 & 2) == 2) {
                    codedOutputStream.writeMessage(2, this.f81155s0);
                }
                if ((this.f81153q0 & 4) == 4) {
                    codedOutputStream.writeInt32(3, this.f81156t0);
                }
                codedOutputStream.writeRawBytes(this.f81152p0);
            }

            public static Builder newBuilder() {
                return new Builder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Argument getDefaultInstanceForType() {
                return f81151w0;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder newBuilderForType() {
                return newBuilder();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Builder toBuilder() {
                return newBuilder(this);
            }

            public Argument() {
                this.f81157u0 = (byte) -1;
                this.v0 = -1;
                this.f81152p0 = ByteString.EMPTY;
            }

            public Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.f81157u0 = (byte) -1;
                this.v0 = -1;
                this.f81154r0 = Projection.INV;
                this.f81155s0 = Type.getDefaultInstance();
                boolean z10 = false;
                this.f81156t0 = 0;
                ByteString.Output outputNewOutput = ByteString.newOutput();
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
                while (!z10) {
                    try {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 8) {
                                        int i10 = codedInputStream.readEnum();
                                        Projection projectionValueOf = Projection.valueOf(i10);
                                        if (projectionValueOf == null) {
                                            codedOutputStreamNewInstance.writeRawVarint32(tag);
                                            codedOutputStreamNewInstance.writeRawVarint32(i10);
                                        } else {
                                            this.f81153q0 |= 1;
                                            this.f81154r0 = projectionValueOf;
                                        }
                                    } else if (tag == 18) {
                                        Builder builder = (this.f81153q0 & 2) == 2 ? this.f81155s0.toBuilder() : null;
                                        Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                        this.f81155s0 = type;
                                        if (builder != null) {
                                            builder.mergeFrom(type);
                                            this.f81155s0 = builder.buildPartial();
                                        }
                                        this.f81153q0 |= 2;
                                    } else if (tag != 24) {
                                        if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        this.f81153q0 |= 4;
                                        this.f81156t0 = codedInputStream.readInt32();
                                    }
                                }
                                z10 = true;
                            } catch (InvalidProtocolBufferException e5) {
                                throw e5.setUnfinishedMessage(this);
                            }
                        } catch (IOException e7) {
                            throw new InvalidProtocolBufferException(e7.getMessage()).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f81152p0 = outputNewOutput.toByteString();
                        }
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                try {
                    codedOutputStreamNewInstance.flush();
                } catch (IOException unused2) {
                } finally {
                    this.f81152p0 = outputNewOutput.toByteString();
                }
                makeExtensionsImmutable();
            }
        }

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Type, Builder> implements TypeOrBuilder {
            public int E0;
            public int F0;
            public int G0;
            public int I0;
            public int K0;
            public int L0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public int f81162s0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public boolean f81164u0;
            public int v0;

            /* JADX INFO: renamed from: x0, reason: collision with root package name */
            public int f81166x0;

            /* JADX INFO: renamed from: y0, reason: collision with root package name */
            public int f81167y0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public List<Argument> f81163t0 = Collections.emptyList();

            /* JADX INFO: renamed from: w0, reason: collision with root package name */
            public Type f81165w0 = Type.getDefaultInstance();
            public Type H0 = Type.getDefaultInstance();
            public Type J0 = Type.getDefaultInstance();

            public Type buildPartial() {
                Type type = new Type(this);
                int i10 = this.f81162s0;
                if ((i10 & 1) == 1) {
                    this.f81163t0 = Collections.unmodifiableList(this.f81163t0);
                    this.f81162s0 &= -2;
                }
                type.f81145s0 = this.f81163t0;
                int i11 = (i10 & 2) != 2 ? 0 : 1;
                type.f81146t0 = this.f81164u0;
                if ((i10 & 4) == 4) {
                    i11 |= 2;
                }
                type.f81147u0 = this.v0;
                if ((i10 & 8) == 8) {
                    i11 |= 4;
                }
                type.v0 = this.f81165w0;
                if ((i10 & 16) == 16) {
                    i11 |= 8;
                }
                type.f81148w0 = this.f81166x0;
                if ((i10 & 32) == 32) {
                    i11 |= 16;
                }
                type.f81149x0 = this.f81167y0;
                if ((i10 & 64) == 64) {
                    i11 |= 32;
                }
                type.f81150y0 = this.E0;
                if ((i10 & 128) == 128) {
                    i11 |= 64;
                }
                type.E0 = this.F0;
                if ((i10 & 256) == 256) {
                    i11 |= 128;
                }
                type.F0 = this.G0;
                if ((i10 & 512) == 512) {
                    i11 |= 256;
                }
                type.G0 = this.H0;
                if ((i10 & 1024) == 1024) {
                    i11 |= 512;
                }
                type.H0 = this.I0;
                if ((i10 & 2048) == 2048) {
                    i11 |= 1024;
                }
                type.I0 = this.J0;
                if ((i10 & 4096) == 4096) {
                    i11 |= 2048;
                }
                type.J0 = this.K0;
                if ((i10 & 8192) == 8192) {
                    i11 |= 4096;
                }
                type.K0 = this.L0;
                type.f81144r0 = i11;
                return type;
            }

            public Type getAbbreviatedType() {
                return this.J0;
            }

            public Argument getArgument(int i10) {
                return this.f81163t0.get(i10);
            }

            public int getArgumentCount() {
                return this.f81163t0.size();
            }

            public Type getFlexibleUpperBound() {
                return this.f81165w0;
            }

            public Type getOuterType() {
                return this.H0;
            }

            public boolean hasAbbreviatedType() {
                return (this.f81162s0 & 2048) == 2048;
            }

            public boolean hasFlexibleUpperBound() {
                return (this.f81162s0 & 8) == 8;
            }

            public boolean hasOuterType() {
                return (this.f81162s0 & 512) == 512;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < getArgumentCount(); i10++) {
                    if (!getArgument(i10).isInitialized()) {
                        return false;
                    }
                }
                if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
                    return false;
                }
                if (!hasOuterType() || getOuterType().isInitialized()) {
                    return (!hasAbbreviatedType() || getAbbreviatedType().isInitialized()) && extensionsAreInitialized();
                }
                return false;
            }

            public Builder mergeAbbreviatedType(Type type) {
                if ((this.f81162s0 & 2048) != 2048 || this.J0 == Type.getDefaultInstance()) {
                    this.J0 = type;
                } else {
                    this.J0 = Type.newBuilder(this.J0).mergeFrom(type).buildPartial();
                }
                this.f81162s0 |= 2048;
                return this;
            }

            public Builder mergeFlexibleUpperBound(Type type) {
                if ((this.f81162s0 & 8) != 8 || this.f81165w0 == Type.getDefaultInstance()) {
                    this.f81165w0 = type;
                } else {
                    this.f81165w0 = Type.newBuilder(this.f81165w0).mergeFrom(type).buildPartial();
                }
                this.f81162s0 |= 8;
                return this;
            }

            public Builder mergeOuterType(Type type) {
                if ((this.f81162s0 & 512) != 512 || this.H0 == Type.getDefaultInstance()) {
                    this.H0 = type;
                } else {
                    this.H0 = Type.newBuilder(this.H0).mergeFrom(type).buildPartial();
                }
                this.f81162s0 |= 512;
                return this;
            }

            public Builder setAbbreviatedTypeId(int i10) {
                this.f81162s0 |= 4096;
                this.K0 = i10;
                return this;
            }

            public Builder setClassName(int i10) {
                this.f81162s0 |= 32;
                this.f81167y0 = i10;
                return this;
            }

            public Builder setFlags(int i10) {
                this.f81162s0 |= 8192;
                this.L0 = i10;
                return this;
            }

            public Builder setFlexibleTypeCapabilitiesId(int i10) {
                this.f81162s0 |= 4;
                this.v0 = i10;
                return this;
            }

            public Builder setFlexibleUpperBoundId(int i10) {
                this.f81162s0 |= 16;
                this.f81166x0 = i10;
                return this;
            }

            public Builder setNullable(boolean z10) {
                this.f81162s0 |= 2;
                this.f81164u0 = z10;
                return this;
            }

            public Builder setOuterTypeId(int i10) {
                this.f81162s0 |= 1024;
                this.I0 = i10;
                return this;
            }

            public Builder setTypeAliasName(int i10) {
                this.f81162s0 |= 256;
                this.G0 = i10;
                return this;
            }

            public Builder setTypeParameter(int i10) {
                this.f81162s0 |= 64;
                this.E0 = i10;
                return this;
            }

            public Builder setTypeParameterName(int i10) {
                this.f81162s0 |= 128;
                this.F0 = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Type build() {
                Type typeBuildPartial = buildPartial();
                if (typeBuildPartial.isInitialized()) {
                    return typeBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(typeBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public Type getDefaultInstanceForType() {
                return Type.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(Type type) {
                if (type == Type.getDefaultInstance()) {
                    return this;
                }
                if (!type.f81145s0.isEmpty()) {
                    if (this.f81163t0.isEmpty()) {
                        this.f81163t0 = type.f81145s0;
                        this.f81162s0 &= -2;
                    } else {
                        if ((this.f81162s0 & 1) != 1) {
                            this.f81163t0 = new ArrayList(this.f81163t0);
                            this.f81162s0 |= 1;
                        }
                        this.f81163t0.addAll(type.f81145s0);
                    }
                }
                if (type.hasNullable()) {
                    setNullable(type.getNullable());
                }
                if (type.hasFlexibleTypeCapabilitiesId()) {
                    setFlexibleTypeCapabilitiesId(type.getFlexibleTypeCapabilitiesId());
                }
                if (type.hasFlexibleUpperBound()) {
                    mergeFlexibleUpperBound(type.getFlexibleUpperBound());
                }
                if (type.hasFlexibleUpperBoundId()) {
                    setFlexibleUpperBoundId(type.getFlexibleUpperBoundId());
                }
                if (type.hasClassName()) {
                    setClassName(type.getClassName());
                }
                if (type.hasTypeParameter()) {
                    setTypeParameter(type.getTypeParameter());
                }
                if (type.hasTypeParameterName()) {
                    setTypeParameterName(type.getTypeParameterName());
                }
                if (type.hasTypeAliasName()) {
                    setTypeAliasName(type.getTypeAliasName());
                }
                if (type.hasOuterType()) {
                    mergeOuterType(type.getOuterType());
                }
                if (type.hasOuterTypeId()) {
                    setOuterTypeId(type.getOuterTypeId());
                }
                if (type.hasAbbreviatedType()) {
                    mergeAbbreviatedType(type.getAbbreviatedType());
                }
                if (type.hasAbbreviatedTypeId()) {
                    setAbbreviatedTypeId(type.getAbbreviatedTypeId());
                }
                if (type.hasFlags()) {
                    setFlags(type.getFlags());
                }
                mergeExtensionFields(type);
                setUnknownFields(getUnknownFields().concat(type.f81143q0));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo5776clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Type type = null;
                try {
                    try {
                        Type partialFrom = Type.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        Type type2 = (Type) e5.getUnfinishedMessage();
                        try {
                            throw e5;
                        } catch (Throwable th2) {
                            th = th2;
                            type = type2;
                            if (type != null) {
                                mergeFrom(type);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (type != null) {
                        mergeFrom(type);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<Type> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public Type parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Type(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            Type type = new Type();
            N0 = type;
            type.b();
        }

        public Type(GeneratedMessageLite.ExtendableBuilder<Type, ?> extendableBuilder) {
            super(extendableBuilder);
            this.L0 = (byte) -1;
            this.M0 = -1;
            this.f81143q0 = extendableBuilder.getUnknownFields();
        }

        public static Type getDefaultInstance() {
            return N0;
        }

        public static Builder newBuilder(Type type) {
            return newBuilder().mergeFrom(type);
        }

        public final void b() {
            this.f81145s0 = Collections.emptyList();
            this.f81146t0 = false;
            this.f81147u0 = 0;
            this.v0 = getDefaultInstance();
            this.f81148w0 = 0;
            this.f81149x0 = 0;
            this.f81150y0 = 0;
            this.E0 = 0;
            this.F0 = 0;
            this.G0 = getDefaultInstance();
            this.H0 = 0;
            this.I0 = getDefaultInstance();
            this.J0 = 0;
            this.K0 = 0;
        }

        public Type getAbbreviatedType() {
            return this.I0;
        }

        public int getAbbreviatedTypeId() {
            return this.J0;
        }

        public Argument getArgument(int i10) {
            return this.f81145s0.get(i10);
        }

        public int getArgumentCount() {
            return this.f81145s0.size();
        }

        public List<Argument> getArgumentList() {
            return this.f81145s0;
        }

        public int getClassName() {
            return this.f81149x0;
        }

        public int getFlags() {
            return this.K0;
        }

        public int getFlexibleTypeCapabilitiesId() {
            return this.f81147u0;
        }

        public Type getFlexibleUpperBound() {
            return this.v0;
        }

        public int getFlexibleUpperBoundId() {
            return this.f81148w0;
        }

        public boolean getNullable() {
            return this.f81146t0;
        }

        public Type getOuterType() {
            return this.G0;
        }

        public int getOuterTypeId() {
            return this.H0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Type> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.M0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = (this.f81144r0 & 4096) == 4096 ? CodedOutputStream.computeInt32Size(1, this.K0) : 0;
            for (int i11 = 0; i11 < this.f81145s0.size(); i11++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(2, this.f81145s0.get(i11));
            }
            if ((this.f81144r0 & 1) == 1) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(3, this.f81146t0);
            }
            if ((this.f81144r0 & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(4, this.f81147u0);
            }
            if ((this.f81144r0 & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(5, this.v0);
            }
            if ((this.f81144r0 & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(6, this.f81149x0);
            }
            if ((this.f81144r0 & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, this.f81150y0);
            }
            if ((this.f81144r0 & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(8, this.f81148w0);
            }
            if ((this.f81144r0 & 64) == 64) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(9, this.E0);
            }
            if ((this.f81144r0 & 256) == 256) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(10, this.G0);
            }
            if ((this.f81144r0 & 512) == 512) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(11, this.H0);
            }
            if ((this.f81144r0 & 128) == 128) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(12, this.F0);
            }
            if ((this.f81144r0 & 1024) == 1024) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(13, this.I0);
            }
            if ((this.f81144r0 & 2048) == 2048) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(14, this.J0);
            }
            int size = this.f81143q0.size() + extensionsSerializedSize() + iComputeInt32Size;
            this.M0 = size;
            return size;
        }

        public int getTypeAliasName() {
            return this.F0;
        }

        public int getTypeParameter() {
            return this.f81150y0;
        }

        public int getTypeParameterName() {
            return this.E0;
        }

        public boolean hasAbbreviatedType() {
            return (this.f81144r0 & 1024) == 1024;
        }

        public boolean hasAbbreviatedTypeId() {
            return (this.f81144r0 & 2048) == 2048;
        }

        public boolean hasClassName() {
            return (this.f81144r0 & 16) == 16;
        }

        public boolean hasFlags() {
            return (this.f81144r0 & 4096) == 4096;
        }

        public boolean hasFlexibleTypeCapabilitiesId() {
            return (this.f81144r0 & 2) == 2;
        }

        public boolean hasFlexibleUpperBound() {
            return (this.f81144r0 & 4) == 4;
        }

        public boolean hasFlexibleUpperBoundId() {
            return (this.f81144r0 & 8) == 8;
        }

        public boolean hasNullable() {
            return (this.f81144r0 & 1) == 1;
        }

        public boolean hasOuterType() {
            return (this.f81144r0 & 256) == 256;
        }

        public boolean hasOuterTypeId() {
            return (this.f81144r0 & 512) == 512;
        }

        public boolean hasTypeAliasName() {
            return (this.f81144r0 & 128) == 128;
        }

        public boolean hasTypeParameter() {
            return (this.f81144r0 & 32) == 32;
        }

        public boolean hasTypeParameterName() {
            return (this.f81144r0 & 64) == 64;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.L0;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < getArgumentCount(); i10++) {
                if (!getArgument(i10).isInitialized()) {
                    this.L0 = (byte) 0;
                    return false;
                }
            }
            if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
                this.L0 = (byte) 0;
                return false;
            }
            if (hasOuterType() && !getOuterType().isInitialized()) {
                this.L0 = (byte) 0;
                return false;
            }
            if (hasAbbreviatedType() && !getAbbreviatedType().isInitialized()) {
                this.L0 = (byte) 0;
                return false;
            }
            if (extensionsAreInitialized()) {
                this.L0 = (byte) 1;
                return true;
            }
            this.L0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.f81144r0 & 4096) == 4096) {
                codedOutputStream.writeInt32(1, this.K0);
            }
            for (int i10 = 0; i10 < this.f81145s0.size(); i10++) {
                codedOutputStream.writeMessage(2, this.f81145s0.get(i10));
            }
            if ((this.f81144r0 & 1) == 1) {
                codedOutputStream.writeBool(3, this.f81146t0);
            }
            if ((this.f81144r0 & 2) == 2) {
                codedOutputStream.writeInt32(4, this.f81147u0);
            }
            if ((this.f81144r0 & 4) == 4) {
                codedOutputStream.writeMessage(5, this.v0);
            }
            if ((this.f81144r0 & 16) == 16) {
                codedOutputStream.writeInt32(6, this.f81149x0);
            }
            if ((this.f81144r0 & 32) == 32) {
                codedOutputStream.writeInt32(7, this.f81150y0);
            }
            if ((this.f81144r0 & 8) == 8) {
                codedOutputStream.writeInt32(8, this.f81148w0);
            }
            if ((this.f81144r0 & 64) == 64) {
                codedOutputStream.writeInt32(9, this.E0);
            }
            if ((this.f81144r0 & 256) == 256) {
                codedOutputStream.writeMessage(10, this.G0);
            }
            if ((this.f81144r0 & 512) == 512) {
                codedOutputStream.writeInt32(11, this.H0);
            }
            if ((this.f81144r0 & 128) == 128) {
                codedOutputStream.writeInt32(12, this.F0);
            }
            if ((this.f81144r0 & 1024) == 1024) {
                codedOutputStream.writeMessage(13, this.I0);
            }
            if ((this.f81144r0 & 2048) == 2048) {
                codedOutputStream.writeInt32(14, this.J0);
            }
            extensionWriterNewExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f81143q0);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public Type getDefaultInstanceForType() {
            return N0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public Type() {
            this.L0 = (byte) -1;
            this.M0 = -1;
            this.f81143q0 = ByteString.EMPTY;
        }

        public Type(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builder;
            this.L0 = (byte) -1;
            this.M0 = -1;
            b();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            switch (tag) {
                                case 0:
                                    break;
                                case 8:
                                    this.f81144r0 |= 4096;
                                    this.K0 = codedInputStream.readInt32();
                                    continue;
                                case 18:
                                    if (!(z11 & true)) {
                                        this.f81145s0 = new ArrayList();
                                        z11 |= true;
                                    }
                                    this.f81145s0.add((Argument) codedInputStream.readMessage(Argument.PARSER, extensionRegistryLite));
                                    continue;
                                case 24:
                                    this.f81144r0 |= 1;
                                    this.f81146t0 = codedInputStream.readBool();
                                    continue;
                                case 32:
                                    this.f81144r0 |= 2;
                                    this.f81147u0 = codedInputStream.readInt32();
                                    continue;
                                case 42:
                                    builder = (this.f81144r0 & 4) == 4 ? this.v0.toBuilder() : null;
                                    Type type = (Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                                    this.v0 = type;
                                    if (builder != null) {
                                        builder.mergeFrom(type);
                                        this.v0 = builder.buildPartial();
                                    }
                                    this.f81144r0 |= 4;
                                    continue;
                                case 48:
                                    this.f81144r0 |= 16;
                                    this.f81149x0 = codedInputStream.readInt32();
                                    continue;
                                case 56:
                                    this.f81144r0 |= 32;
                                    this.f81150y0 = codedInputStream.readInt32();
                                    continue;
                                case 64:
                                    this.f81144r0 |= 8;
                                    this.f81148w0 = codedInputStream.readInt32();
                                    continue;
                                case 72:
                                    this.f81144r0 |= 64;
                                    this.E0 = codedInputStream.readInt32();
                                    continue;
                                case 82:
                                    builder = (this.f81144r0 & 256) == 256 ? this.G0.toBuilder() : null;
                                    Type type2 = (Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                                    this.G0 = type2;
                                    if (builder != null) {
                                        builder.mergeFrom(type2);
                                        this.G0 = builder.buildPartial();
                                    }
                                    this.f81144r0 |= 256;
                                    continue;
                                case 88:
                                    this.f81144r0 |= 512;
                                    this.H0 = codedInputStream.readInt32();
                                    continue;
                                case 96:
                                    this.f81144r0 |= 128;
                                    this.F0 = codedInputStream.readInt32();
                                    continue;
                                case 106:
                                    builder = (this.f81144r0 & 1024) == 1024 ? this.I0.toBuilder() : null;
                                    Type type3 = (Type) codedInputStream.readMessage(PARSER, extensionRegistryLite);
                                    this.I0 = type3;
                                    if (builder != null) {
                                        builder.mergeFrom(type3);
                                        this.I0 = builder.buildPartial();
                                    }
                                    this.f81144r0 |= 1024;
                                    continue;
                                case 112:
                                    this.f81144r0 |= 2048;
                                    this.J0 = codedInputStream.readInt32();
                                    continue;
                                default:
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                        break;
                                    }
                                    break;
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e5) {
                            throw e5.setUnfinishedMessage(this);
                        }
                    } catch (IOException e7) {
                        throw new InvalidProtocolBufferException(e7.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (z11 & true) {
                        this.f81145s0 = Collections.unmodifiableList(this.f81145s0);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f81143q0 = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z11 & true) {
                this.f81145s0 = Collections.unmodifiableList(this.f81145s0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f81143q0 = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public static final class TypeAlias extends GeneratedMessageLite.ExtendableMessage<TypeAlias> implements TypeAliasOrBuilder {
        public static final TypeAlias I0;
        public static Parser<TypeAlias> PARSER = new a();
        public List<Annotation> E0;
        public List<Integer> F0;
        public byte G0;
        public int H0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ByteString f81168q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f81169r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f81170s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f81171t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public List<TypeParameter> f81172u0;
        public Type v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f81173w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public Type f81174x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public int f81175y0;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeAlias, Builder> implements TypeAliasOrBuilder {
            public int E0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public int f81176s0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public int f81178u0;

            /* JADX INFO: renamed from: x0, reason: collision with root package name */
            public int f81180x0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public int f81177t0 = 6;
            public List<TypeParameter> v0 = Collections.emptyList();

            /* JADX INFO: renamed from: w0, reason: collision with root package name */
            public Type f81179w0 = Type.getDefaultInstance();

            /* JADX INFO: renamed from: y0, reason: collision with root package name */
            public Type f81181y0 = Type.getDefaultInstance();
            public List<Annotation> F0 = Collections.emptyList();
            public List<Integer> G0 = Collections.emptyList();

            public TypeAlias buildPartial() {
                TypeAlias typeAlias = new TypeAlias(this);
                int i10 = this.f81176s0;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                typeAlias.f81170s0 = this.f81177t0;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                typeAlias.f81171t0 = this.f81178u0;
                if ((i10 & 4) == 4) {
                    this.v0 = Collections.unmodifiableList(this.v0);
                    this.f81176s0 &= -5;
                }
                typeAlias.f81172u0 = this.v0;
                if ((i10 & 8) == 8) {
                    i11 |= 4;
                }
                typeAlias.v0 = this.f81179w0;
                if ((i10 & 16) == 16) {
                    i11 |= 8;
                }
                typeAlias.f81173w0 = this.f81180x0;
                if ((i10 & 32) == 32) {
                    i11 |= 16;
                }
                typeAlias.f81174x0 = this.f81181y0;
                if ((i10 & 64) == 64) {
                    i11 |= 32;
                }
                typeAlias.f81175y0 = this.E0;
                if ((this.f81176s0 & 128) == 128) {
                    this.F0 = Collections.unmodifiableList(this.F0);
                    this.f81176s0 &= -129;
                }
                typeAlias.E0 = this.F0;
                if ((this.f81176s0 & 256) == 256) {
                    this.G0 = Collections.unmodifiableList(this.G0);
                    this.f81176s0 &= -257;
                }
                typeAlias.F0 = this.G0;
                typeAlias.f81169r0 = i11;
                return typeAlias;
            }

            public Annotation getAnnotation(int i10) {
                return this.F0.get(i10);
            }

            public int getAnnotationCount() {
                return this.F0.size();
            }

            public Type getExpandedType() {
                return this.f81181y0;
            }

            public TypeParameter getTypeParameter(int i10) {
                return this.v0.get(i10);
            }

            public int getTypeParameterCount() {
                return this.v0.size();
            }

            public Type getUnderlyingType() {
                return this.f81179w0;
            }

            public boolean hasExpandedType() {
                return (this.f81176s0 & 32) == 32;
            }

            public boolean hasName() {
                return (this.f81176s0 & 2) == 2;
            }

            public boolean hasUnderlyingType() {
                return (this.f81176s0 & 8) == 8;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                for (int i10 = 0; i10 < getTypeParameterCount(); i10++) {
                    if (!getTypeParameter(i10).isInitialized()) {
                        return false;
                    }
                }
                if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
                    return false;
                }
                if (hasExpandedType() && !getExpandedType().isInitialized()) {
                    return false;
                }
                for (int i11 = 0; i11 < getAnnotationCount(); i11++) {
                    if (!getAnnotation(i11).isInitialized()) {
                        return false;
                    }
                }
                return extensionsAreInitialized();
            }

            public Builder mergeExpandedType(Type type) {
                if ((this.f81176s0 & 32) != 32 || this.f81181y0 == Type.getDefaultInstance()) {
                    this.f81181y0 = type;
                } else {
                    this.f81181y0 = Type.newBuilder(this.f81181y0).mergeFrom(type).buildPartial();
                }
                this.f81176s0 |= 32;
                return this;
            }

            public Builder mergeUnderlyingType(Type type) {
                if ((this.f81176s0 & 8) != 8 || this.f81179w0 == Type.getDefaultInstance()) {
                    this.f81179w0 = type;
                } else {
                    this.f81179w0 = Type.newBuilder(this.f81179w0).mergeFrom(type).buildPartial();
                }
                this.f81176s0 |= 8;
                return this;
            }

            public Builder setExpandedTypeId(int i10) {
                this.f81176s0 |= 64;
                this.E0 = i10;
                return this;
            }

            public Builder setFlags(int i10) {
                this.f81176s0 |= 1;
                this.f81177t0 = i10;
                return this;
            }

            public Builder setName(int i10) {
                this.f81176s0 |= 2;
                this.f81178u0 = i10;
                return this;
            }

            public Builder setUnderlyingTypeId(int i10) {
                this.f81176s0 |= 16;
                this.f81180x0 = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public TypeAlias build() {
                TypeAlias typeAliasBuildPartial = buildPartial();
                if (typeAliasBuildPartial.isInitialized()) {
                    return typeAliasBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(typeAliasBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public TypeAlias getDefaultInstanceForType() {
                return TypeAlias.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(TypeAlias typeAlias) {
                if (typeAlias == TypeAlias.getDefaultInstance()) {
                    return this;
                }
                if (typeAlias.hasFlags()) {
                    setFlags(typeAlias.getFlags());
                }
                if (typeAlias.hasName()) {
                    setName(typeAlias.getName());
                }
                if (!typeAlias.f81172u0.isEmpty()) {
                    if (this.v0.isEmpty()) {
                        this.v0 = typeAlias.f81172u0;
                        this.f81176s0 &= -5;
                    } else {
                        if ((this.f81176s0 & 4) != 4) {
                            this.v0 = new ArrayList(this.v0);
                            this.f81176s0 |= 4;
                        }
                        this.v0.addAll(typeAlias.f81172u0);
                    }
                }
                if (typeAlias.hasUnderlyingType()) {
                    mergeUnderlyingType(typeAlias.getUnderlyingType());
                }
                if (typeAlias.hasUnderlyingTypeId()) {
                    setUnderlyingTypeId(typeAlias.getUnderlyingTypeId());
                }
                if (typeAlias.hasExpandedType()) {
                    mergeExpandedType(typeAlias.getExpandedType());
                }
                if (typeAlias.hasExpandedTypeId()) {
                    setExpandedTypeId(typeAlias.getExpandedTypeId());
                }
                if (!typeAlias.E0.isEmpty()) {
                    if (this.F0.isEmpty()) {
                        this.F0 = typeAlias.E0;
                        this.f81176s0 &= -129;
                    } else {
                        if ((this.f81176s0 & 128) != 128) {
                            this.F0 = new ArrayList(this.F0);
                            this.f81176s0 |= 128;
                        }
                        this.F0.addAll(typeAlias.E0);
                    }
                }
                if (!typeAlias.F0.isEmpty()) {
                    if (this.G0.isEmpty()) {
                        this.G0 = typeAlias.F0;
                        this.f81176s0 &= -257;
                    } else {
                        if ((this.f81176s0 & 256) != 256) {
                            this.G0 = new ArrayList(this.G0);
                            this.f81176s0 |= 256;
                        }
                        this.G0.addAll(typeAlias.F0);
                    }
                }
                mergeExtensionFields(typeAlias);
                setUnknownFields(getUnknownFields().concat(typeAlias.f81168q0));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo5776clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TypeAlias typeAlias = null;
                try {
                    try {
                        TypeAlias partialFrom = TypeAlias.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        TypeAlias typeAlias2 = (TypeAlias) e5.getUnfinishedMessage();
                        try {
                            throw e5;
                        } catch (Throwable th2) {
                            th = th2;
                            typeAlias = typeAlias2;
                            if (typeAlias != null) {
                                mergeFrom(typeAlias);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (typeAlias != null) {
                        mergeFrom(typeAlias);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<TypeAlias> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public TypeAlias parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TypeAlias(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            TypeAlias typeAlias = new TypeAlias();
            I0 = typeAlias;
            typeAlias.b();
        }

        public TypeAlias(GeneratedMessageLite.ExtendableBuilder<TypeAlias, ?> extendableBuilder) {
            super(extendableBuilder);
            this.G0 = (byte) -1;
            this.H0 = -1;
            this.f81168q0 = extendableBuilder.getUnknownFields();
        }

        public static TypeAlias getDefaultInstance() {
            return I0;
        }

        public static Builder newBuilder(TypeAlias typeAlias) {
            return newBuilder().mergeFrom(typeAlias);
        }

        public static TypeAlias parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return PARSER.parseDelimitedFrom(inputStream, extensionRegistryLite);
        }

        public final void b() {
            this.f81170s0 = 6;
            this.f81171t0 = 0;
            this.f81172u0 = Collections.emptyList();
            this.v0 = Type.getDefaultInstance();
            this.f81173w0 = 0;
            this.f81174x0 = Type.getDefaultInstance();
            this.f81175y0 = 0;
            this.E0 = Collections.emptyList();
            this.F0 = Collections.emptyList();
        }

        public Annotation getAnnotation(int i10) {
            return this.E0.get(i10);
        }

        public int getAnnotationCount() {
            return this.E0.size();
        }

        public List<Annotation> getAnnotationList() {
            return this.E0;
        }

        public Type getExpandedType() {
            return this.f81174x0;
        }

        public int getExpandedTypeId() {
            return this.f81175y0;
        }

        public int getFlags() {
            return this.f81170s0;
        }

        public int getName() {
            return this.f81171t0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeAlias> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.H0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = (this.f81169r0 & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f81170s0) : 0;
            if ((this.f81169r0 & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f81171t0);
            }
            for (int i11 = 0; i11 < this.f81172u0.size(); i11++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, this.f81172u0.get(i11));
            }
            if ((this.f81169r0 & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.v0);
            }
            if ((this.f81169r0 & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(5, this.f81173w0);
            }
            if ((this.f81169r0 & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(6, this.f81174x0);
            }
            if ((this.f81169r0 & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(7, this.f81175y0);
            }
            for (int i12 = 0; i12 < this.E0.size(); i12++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(8, this.E0.get(i12));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i13 = 0; i13 < this.F0.size(); i13++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.F0.get(i13).intValue());
            }
            int size = this.f81168q0.size() + extensionsSerializedSize() + (getVersionRequirementList().size() * 2) + iComputeInt32Size + iComputeInt32SizeNoTag;
            this.H0 = size;
            return size;
        }

        public TypeParameter getTypeParameter(int i10) {
            return this.f81172u0.get(i10);
        }

        public int getTypeParameterCount() {
            return this.f81172u0.size();
        }

        public List<TypeParameter> getTypeParameterList() {
            return this.f81172u0;
        }

        public Type getUnderlyingType() {
            return this.v0;
        }

        public int getUnderlyingTypeId() {
            return this.f81173w0;
        }

        public List<Integer> getVersionRequirementList() {
            return this.F0;
        }

        public boolean hasExpandedType() {
            return (this.f81169r0 & 16) == 16;
        }

        public boolean hasExpandedTypeId() {
            return (this.f81169r0 & 32) == 32;
        }

        public boolean hasFlags() {
            return (this.f81169r0 & 1) == 1;
        }

        public boolean hasName() {
            return (this.f81169r0 & 2) == 2;
        }

        public boolean hasUnderlyingType() {
            return (this.f81169r0 & 4) == 4;
        }

        public boolean hasUnderlyingTypeId() {
            return (this.f81169r0 & 8) == 8;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.G0;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!hasName()) {
                this.G0 = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < getTypeParameterCount(); i10++) {
                if (!getTypeParameter(i10).isInitialized()) {
                    this.G0 = (byte) 0;
                    return false;
                }
            }
            if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
                this.G0 = (byte) 0;
                return false;
            }
            if (hasExpandedType() && !getExpandedType().isInitialized()) {
                this.G0 = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < getAnnotationCount(); i11++) {
                if (!getAnnotation(i11).isInitialized()) {
                    this.G0 = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.G0 = (byte) 1;
                return true;
            }
            this.G0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.f81169r0 & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f81170s0);
            }
            if ((this.f81169r0 & 2) == 2) {
                codedOutputStream.writeInt32(2, this.f81171t0);
            }
            for (int i10 = 0; i10 < this.f81172u0.size(); i10++) {
                codedOutputStream.writeMessage(3, this.f81172u0.get(i10));
            }
            if ((this.f81169r0 & 4) == 4) {
                codedOutputStream.writeMessage(4, this.v0);
            }
            if ((this.f81169r0 & 8) == 8) {
                codedOutputStream.writeInt32(5, this.f81173w0);
            }
            if ((this.f81169r0 & 16) == 16) {
                codedOutputStream.writeMessage(6, this.f81174x0);
            }
            if ((this.f81169r0 & 32) == 32) {
                codedOutputStream.writeInt32(7, this.f81175y0);
            }
            for (int i11 = 0; i11 < this.E0.size(); i11++) {
                codedOutputStream.writeMessage(8, this.E0.get(i11));
            }
            for (int i12 = 0; i12 < this.F0.size(); i12++) {
                codedOutputStream.writeInt32(31, this.F0.get(i12).intValue());
            }
            extensionWriterNewExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f81168q0);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public TypeAlias getDefaultInstanceForType() {
            return I0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public TypeAlias() {
            this.G0 = (byte) -1;
            this.H0 = -1;
            this.f81168q0 = ByteString.EMPTY;
        }

        public TypeAlias(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Type.Builder builder;
            this.G0 = (byte) -1;
            this.H0 = -1;
            b();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        switch (tag) {
                            case 0:
                                break;
                            case 8:
                                this.f81169r0 |= 1;
                                this.f81170s0 = codedInputStream.readInt32();
                                continue;
                            case 16:
                                this.f81169r0 |= 2;
                                this.f81171t0 = codedInputStream.readInt32();
                                continue;
                            case 26:
                                if ((i10 & 4) != 4) {
                                    this.f81172u0 = new ArrayList();
                                    i10 |= 4;
                                }
                                this.f81172u0.add((TypeParameter) codedInputStream.readMessage(TypeParameter.PARSER, extensionRegistryLite));
                                continue;
                            case 34:
                                builder = (this.f81169r0 & 4) == 4 ? this.v0.toBuilder() : null;
                                Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.v0 = type;
                                if (builder != null) {
                                    builder.mergeFrom(type);
                                    this.v0 = builder.buildPartial();
                                }
                                this.f81169r0 |= 4;
                                continue;
                            case 40:
                                this.f81169r0 |= 8;
                                this.f81173w0 = codedInputStream.readInt32();
                                continue;
                            case 50:
                                builder = (this.f81169r0 & 16) == 16 ? this.f81174x0.toBuilder() : null;
                                Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                this.f81174x0 = type2;
                                if (builder != null) {
                                    builder.mergeFrom(type2);
                                    this.f81174x0 = builder.buildPartial();
                                }
                                this.f81169r0 |= 16;
                                continue;
                            case 56:
                                this.f81169r0 |= 32;
                                this.f81175y0 = codedInputStream.readInt32();
                                continue;
                            case 66:
                                if ((i10 & 128) != 128) {
                                    this.E0 = new ArrayList();
                                    i10 |= 128;
                                }
                                this.E0.add((Annotation) codedInputStream.readMessage(Annotation.PARSER, extensionRegistryLite));
                                continue;
                            case 248:
                                if ((i10 & 256) != 256) {
                                    this.F0 = new ArrayList();
                                    i10 |= 256;
                                }
                                this.F0.add(Integer.valueOf(codedInputStream.readInt32()));
                                continue;
                            case 250:
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i10 & 256) != 256 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.F0 = new ArrayList();
                                    i10 |= 256;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.F0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                                continue;
                            default:
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    break;
                                }
                                break;
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if ((i10 & 4) == 4) {
                            this.f81172u0 = Collections.unmodifiableList(this.f81172u0);
                        }
                        if ((i10 & 128) == 128) {
                            this.E0 = Collections.unmodifiableList(this.E0);
                        }
                        if ((i10 & 256) == 256) {
                            this.F0 = Collections.unmodifiableList(this.F0);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f81168q0 = outputNewOutput.toByteString();
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
            if ((i10 & 4) == 4) {
                this.f81172u0 = Collections.unmodifiableList(this.f81172u0);
            }
            if ((i10 & 128) == 128) {
                this.E0 = Collections.unmodifiableList(this.E0);
            }
            if ((i10 & 256) == 256) {
                this.F0 = Collections.unmodifiableList(this.F0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f81168q0 = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface TypeAliasOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class TypeParameter extends GeneratedMessageLite.ExtendableMessage<TypeParameter> implements TypeParameterOrBuilder {
        public static final TypeParameter G0;
        public static Parser<TypeParameter> PARSER = new a();
        public byte E0;
        public int F0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ByteString f81182q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f81183r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f81184s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f81185t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f81186u0;
        public Variance v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public List<Type> f81187w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public List<Integer> f81188x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public int f81189y0;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeParameter, Builder> implements TypeParameterOrBuilder {

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public int f81190s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public int f81191t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public int f81192u0;
            public boolean v0;

            /* JADX INFO: renamed from: w0, reason: collision with root package name */
            public Variance f81193w0 = Variance.INV;

            /* JADX INFO: renamed from: x0, reason: collision with root package name */
            public List<Type> f81194x0 = Collections.emptyList();

            /* JADX INFO: renamed from: y0, reason: collision with root package name */
            public List<Integer> f81195y0 = Collections.emptyList();

            public TypeParameter buildPartial() {
                TypeParameter typeParameter = new TypeParameter(this);
                int i10 = this.f81190s0;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                typeParameter.f81184s0 = this.f81191t0;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                typeParameter.f81185t0 = this.f81192u0;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                typeParameter.f81186u0 = this.v0;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                typeParameter.v0 = this.f81193w0;
                if ((i10 & 16) == 16) {
                    this.f81194x0 = Collections.unmodifiableList(this.f81194x0);
                    this.f81190s0 &= -17;
                }
                typeParameter.f81187w0 = this.f81194x0;
                if ((this.f81190s0 & 32) == 32) {
                    this.f81195y0 = Collections.unmodifiableList(this.f81195y0);
                    this.f81190s0 &= -33;
                }
                typeParameter.f81188x0 = this.f81195y0;
                typeParameter.f81183r0 = i11;
                return typeParameter;
            }

            public Type getUpperBound(int i10) {
                return this.f81194x0.get(i10);
            }

            public int getUpperBoundCount() {
                return this.f81194x0.size();
            }

            public boolean hasId() {
                return (this.f81190s0 & 1) == 1;
            }

            public boolean hasName() {
                return (this.f81190s0 & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasId() || !hasName()) {
                    return false;
                }
                for (int i10 = 0; i10 < getUpperBoundCount(); i10++) {
                    if (!getUpperBound(i10).isInitialized()) {
                        return false;
                    }
                }
                return extensionsAreInitialized();
            }

            public Builder setId(int i10) {
                this.f81190s0 |= 1;
                this.f81191t0 = i10;
                return this;
            }

            public Builder setName(int i10) {
                this.f81190s0 |= 2;
                this.f81192u0 = i10;
                return this;
            }

            public Builder setReified(boolean z10) {
                this.f81190s0 |= 4;
                this.v0 = z10;
                return this;
            }

            public Builder setVariance(Variance variance) {
                variance.getClass();
                this.f81190s0 |= 8;
                this.f81193w0 = variance;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public TypeParameter build() {
                TypeParameter typeParameterBuildPartial = buildPartial();
                if (typeParameterBuildPartial.isInitialized()) {
                    return typeParameterBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(typeParameterBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public TypeParameter getDefaultInstanceForType() {
                return TypeParameter.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(TypeParameter typeParameter) {
                if (typeParameter == TypeParameter.getDefaultInstance()) {
                    return this;
                }
                if (typeParameter.hasId()) {
                    setId(typeParameter.getId());
                }
                if (typeParameter.hasName()) {
                    setName(typeParameter.getName());
                }
                if (typeParameter.hasReified()) {
                    setReified(typeParameter.getReified());
                }
                if (typeParameter.hasVariance()) {
                    setVariance(typeParameter.getVariance());
                }
                if (!typeParameter.f81187w0.isEmpty()) {
                    if (this.f81194x0.isEmpty()) {
                        this.f81194x0 = typeParameter.f81187w0;
                        this.f81190s0 &= -17;
                    } else {
                        if ((this.f81190s0 & 16) != 16) {
                            this.f81194x0 = new ArrayList(this.f81194x0);
                            this.f81190s0 |= 16;
                        }
                        this.f81194x0.addAll(typeParameter.f81187w0);
                    }
                }
                if (!typeParameter.f81188x0.isEmpty()) {
                    if (this.f81195y0.isEmpty()) {
                        this.f81195y0 = typeParameter.f81188x0;
                        this.f81190s0 &= -33;
                    } else {
                        if ((this.f81190s0 & 32) != 32) {
                            this.f81195y0 = new ArrayList(this.f81195y0);
                            this.f81190s0 |= 32;
                        }
                        this.f81195y0.addAll(typeParameter.f81188x0);
                    }
                }
                mergeExtensionFields(typeParameter);
                setUnknownFields(getUnknownFields().concat(typeParameter.f81182q0));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo5776clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TypeParameter typeParameter = null;
                try {
                    try {
                        TypeParameter partialFrom = TypeParameter.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        TypeParameter typeParameter2 = (TypeParameter) e5.getUnfinishedMessage();
                        try {
                            throw e5;
                        } catch (Throwable th2) {
                            th = th2;
                            typeParameter = typeParameter2;
                            if (typeParameter != null) {
                                mergeFrom(typeParameter);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (typeParameter != null) {
                        mergeFrom(typeParameter);
                    }
                    throw th;
                }
            }
        }

        public enum Variance implements Internal.EnumLite {
            IN(0),
            OUT(1),
            INV(2);

            private static Internal.EnumLiteMap<Variance> internalValueMap = new a();
            private final int value;

            public static class a implements Internal.EnumLiteMap<Variance> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public Variance findValueByNumber(int i10) {
                    return Variance.valueOf(i10);
                }
            }

            Variance(int i10) {
                this.value = i10;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static Variance valueOf(int i10) {
                if (i10 == 0) {
                    return IN;
                }
                if (i10 == 1) {
                    return OUT;
                }
                if (i10 != 2) {
                    return null;
                }
                return INV;
            }
        }

        public static class a extends AbstractParser<TypeParameter> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public TypeParameter parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TypeParameter(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            TypeParameter typeParameter = new TypeParameter();
            G0 = typeParameter;
            typeParameter.f81184s0 = 0;
            typeParameter.f81185t0 = 0;
            typeParameter.f81186u0 = false;
            typeParameter.v0 = Variance.INV;
            typeParameter.f81187w0 = Collections.emptyList();
            typeParameter.f81188x0 = Collections.emptyList();
        }

        public TypeParameter(GeneratedMessageLite.ExtendableBuilder<TypeParameter, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f81189y0 = -1;
            this.E0 = (byte) -1;
            this.F0 = -1;
            this.f81182q0 = extendableBuilder.getUnknownFields();
        }

        public static TypeParameter getDefaultInstance() {
            return G0;
        }

        public static Builder newBuilder(TypeParameter typeParameter) {
            return newBuilder().mergeFrom(typeParameter);
        }

        public int getId() {
            return this.f81184s0;
        }

        public int getName() {
            return this.f81185t0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeParameter> getParserForType() {
            return PARSER;
        }

        public boolean getReified() {
            return this.f81186u0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.F0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = (this.f81183r0 & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f81184s0) : 0;
            if ((this.f81183r0 & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f81185t0);
            }
            if ((this.f81183r0 & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeBoolSize(3, this.f81186u0);
            }
            if ((this.f81183r0 & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(4, this.v0.getNumber());
            }
            for (int i11 = 0; i11 < this.f81187w0.size(); i11++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(5, this.f81187w0.get(i11));
            }
            int iComputeInt32SizeNoTag = 0;
            for (int i12 = 0; i12 < this.f81188x0.size(); i12++) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(this.f81188x0.get(i12).intValue());
            }
            int iComputeInt32SizeNoTag2 = iComputeInt32Size + iComputeInt32SizeNoTag;
            if (!getUpperBoundIdList().isEmpty()) {
                iComputeInt32SizeNoTag2 = iComputeInt32SizeNoTag2 + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeInt32SizeNoTag);
            }
            this.f81189y0 = iComputeInt32SizeNoTag;
            int size = this.f81182q0.size() + extensionsSerializedSize() + iComputeInt32SizeNoTag2;
            this.F0 = size;
            return size;
        }

        public Type getUpperBound(int i10) {
            return this.f81187w0.get(i10);
        }

        public int getUpperBoundCount() {
            return this.f81187w0.size();
        }

        public List<Integer> getUpperBoundIdList() {
            return this.f81188x0;
        }

        public List<Type> getUpperBoundList() {
            return this.f81187w0;
        }

        public Variance getVariance() {
            return this.v0;
        }

        public boolean hasId() {
            return (this.f81183r0 & 1) == 1;
        }

        public boolean hasName() {
            return (this.f81183r0 & 2) == 2;
        }

        public boolean hasReified() {
            return (this.f81183r0 & 4) == 4;
        }

        public boolean hasVariance() {
            return (this.f81183r0 & 8) == 8;
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
            if (!hasId()) {
                this.E0 = (byte) 0;
                return false;
            }
            if (!hasName()) {
                this.E0 = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < getUpperBoundCount(); i10++) {
                if (!getUpperBound(i10).isInitialized()) {
                    this.E0 = (byte) 0;
                    return false;
                }
            }
            if (extensionsAreInitialized()) {
                this.E0 = (byte) 1;
                return true;
            }
            this.E0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.f81183r0 & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f81184s0);
            }
            if ((this.f81183r0 & 2) == 2) {
                codedOutputStream.writeInt32(2, this.f81185t0);
            }
            if ((this.f81183r0 & 4) == 4) {
                codedOutputStream.writeBool(3, this.f81186u0);
            }
            if ((this.f81183r0 & 8) == 8) {
                codedOutputStream.writeEnum(4, this.v0.getNumber());
            }
            for (int i10 = 0; i10 < this.f81187w0.size(); i10++) {
                codedOutputStream.writeMessage(5, this.f81187w0.get(i10));
            }
            if (getUpperBoundIdList().size() > 0) {
                codedOutputStream.writeRawVarint32(50);
                codedOutputStream.writeRawVarint32(this.f81189y0);
            }
            for (int i11 = 0; i11 < this.f81188x0.size(); i11++) {
                codedOutputStream.writeInt32NoTag(this.f81188x0.get(i11).intValue());
            }
            extensionWriterNewExtensionWriter.writeUntil(1000, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f81182q0);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public TypeParameter getDefaultInstanceForType() {
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

        public TypeParameter() {
            this.f81189y0 = -1;
            this.E0 = (byte) -1;
            this.F0 = -1;
            this.f81182q0 = ByteString.EMPTY;
        }

        public TypeParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f81189y0 = -1;
            this.E0 = (byte) -1;
            this.F0 = -1;
            boolean z10 = false;
            this.f81184s0 = 0;
            this.f81185t0 = 0;
            this.f81186u0 = false;
            this.v0 = Variance.INV;
            this.f81187w0 = Collections.emptyList();
            this.f81188x0 = Collections.emptyList();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.f81183r0 |= 1;
                                this.f81184s0 = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.f81183r0 |= 2;
                                this.f81185t0 = codedInputStream.readInt32();
                            } else if (tag == 24) {
                                this.f81183r0 |= 4;
                                this.f81186u0 = codedInputStream.readBool();
                            } else if (tag == 32) {
                                int i11 = codedInputStream.readEnum();
                                Variance varianceValueOf = Variance.valueOf(i11);
                                if (varianceValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i11);
                                } else {
                                    this.f81183r0 |= 8;
                                    this.v0 = varianceValueOf;
                                }
                            } else if (tag == 42) {
                                if ((i10 & 16) != 16) {
                                    this.f81187w0 = new ArrayList();
                                    i10 |= 16;
                                }
                                this.f81187w0.add((Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                            } else if (tag == 48) {
                                if ((i10 & 32) != 32) {
                                    this.f81188x0 = new ArrayList();
                                    i10 |= 32;
                                }
                                this.f81188x0.add(Integer.valueOf(codedInputStream.readInt32()));
                            } else if (tag != 50) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i10 & 32) != 32 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f81188x0 = new ArrayList();
                                    i10 |= 32;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.f81188x0.add(Integer.valueOf(codedInputStream.readInt32()));
                                }
                                codedInputStream.popLimit(iPushLimit);
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if ((i10 & 16) == 16) {
                            this.f81187w0 = Collections.unmodifiableList(this.f81187w0);
                        }
                        if ((i10 & 32) == 32) {
                            this.f81188x0 = Collections.unmodifiableList(this.f81188x0);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f81182q0 = outputNewOutput.toByteString();
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
            if ((i10 & 16) == 16) {
                this.f81187w0 = Collections.unmodifiableList(this.f81187w0);
            }
            if ((i10 & 32) == 32) {
                this.f81188x0 = Collections.unmodifiableList(this.f81188x0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f81182q0 = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface TypeParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class TypeTable extends GeneratedMessageLite implements TypeTableOrBuilder {
        public static Parser<TypeTable> PARSER = new a();
        public static final TypeTable v0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ByteString f81196p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f81197q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public List<Type> f81198r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f81199s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public byte f81200t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f81201u0;

        public static final class Builder extends GeneratedMessageLite.Builder<TypeTable, Builder> implements TypeTableOrBuilder {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public int f81202q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public List<Type> f81203r0 = Collections.emptyList();

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public int f81204s0 = -1;

            public TypeTable buildPartial() {
                TypeTable typeTable = new TypeTable(this);
                int i10 = this.f81202q0;
                if ((i10 & 1) == 1) {
                    this.f81203r0 = Collections.unmodifiableList(this.f81203r0);
                    this.f81202q0 &= -2;
                }
                typeTable.f81198r0 = this.f81203r0;
                int i11 = (i10 & 2) != 2 ? 0 : 1;
                typeTable.f81199s0 = this.f81204s0;
                typeTable.f81197q0 = i11;
                return typeTable;
            }

            public Type getType(int i10) {
                return this.f81203r0.get(i10);
            }

            public int getTypeCount() {
                return this.f81203r0.size();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i10 = 0; i10 < getTypeCount(); i10++) {
                    if (!getType(i10).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder setFirstNullable(int i10) {
                this.f81202q0 |= 2;
                this.f81204s0 = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public TypeTable build() {
                TypeTable typeTableBuildPartial = buildPartial();
                if (typeTableBuildPartial.isInitialized()) {
                    return typeTableBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(typeTableBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public TypeTable getDefaultInstanceForType() {
                return TypeTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo5776clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(TypeTable typeTable) {
                if (typeTable == TypeTable.getDefaultInstance()) {
                    return this;
                }
                if (!typeTable.f81198r0.isEmpty()) {
                    if (this.f81203r0.isEmpty()) {
                        this.f81203r0 = typeTable.f81198r0;
                        this.f81202q0 &= -2;
                    } else {
                        if ((this.f81202q0 & 1) != 1) {
                            this.f81203r0 = new ArrayList(this.f81203r0);
                            this.f81202q0 |= 1;
                        }
                        this.f81203r0.addAll(typeTable.f81198r0);
                    }
                }
                if (typeTable.hasFirstNullable()) {
                    setFirstNullable(typeTable.getFirstNullable());
                }
                setUnknownFields(getUnknownFields().concat(typeTable.f81196p0));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                TypeTable typeTable = null;
                try {
                    try {
                        TypeTable partialFrom = TypeTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        TypeTable typeTable2 = (TypeTable) e5.getUnfinishedMessage();
                        try {
                            throw e5;
                        } catch (Throwable th2) {
                            th = th2;
                            typeTable = typeTable2;
                            if (typeTable != null) {
                                mergeFrom(typeTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (typeTable != null) {
                        mergeFrom(typeTable);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<TypeTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public TypeTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TypeTable(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            TypeTable typeTable = new TypeTable();
            v0 = typeTable;
            typeTable.f81198r0 = Collections.emptyList();
            typeTable.f81199s0 = -1;
        }

        public TypeTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f81200t0 = (byte) -1;
            this.f81201u0 = -1;
            this.f81196p0 = builder.getUnknownFields();
        }

        public static TypeTable getDefaultInstance() {
            return v0;
        }

        public static Builder newBuilder(TypeTable typeTable) {
            return newBuilder().mergeFrom(typeTable);
        }

        public int getFirstNullable() {
            return this.f81199s0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeTable> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f81201u0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = 0;
            for (int i11 = 0; i11 < this.f81198r0.size(); i11++) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(1, this.f81198r0.get(i11));
            }
            if ((this.f81197q0 & 1) == 1) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f81199s0);
            }
            int size = this.f81196p0.size() + iComputeInt32Size;
            this.f81201u0 = size;
            return size;
        }

        public Type getType(int i10) {
            return this.f81198r0.get(i10);
        }

        public int getTypeCount() {
            return this.f81198r0.size();
        }

        public List<Type> getTypeList() {
            return this.f81198r0;
        }

        public boolean hasFirstNullable() {
            return (this.f81197q0 & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f81200t0;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < getTypeCount(); i10++) {
                if (!getType(i10).isInitialized()) {
                    this.f81200t0 = (byte) 0;
                    return false;
                }
            }
            this.f81200t0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i10 = 0; i10 < this.f81198r0.size(); i10++) {
                codedOutputStream.writeMessage(1, this.f81198r0.get(i10));
            }
            if ((this.f81197q0 & 1) == 1) {
                codedOutputStream.writeInt32(2, this.f81199s0);
            }
            codedOutputStream.writeRawBytes(this.f81196p0);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public TypeTable getDefaultInstanceForType() {
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

        public TypeTable() {
            this.f81200t0 = (byte) -1;
            this.f81201u0 = -1;
            this.f81196p0 = ByteString.EMPTY;
        }

        public TypeTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f81200t0 = (byte) -1;
            this.f81201u0 = -1;
            this.f81198r0 = Collections.emptyList();
            this.f81199s0 = -1;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                if (!(z11 & true)) {
                                    this.f81198r0 = new ArrayList();
                                    z11 |= true;
                                }
                                this.f81198r0.add((Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite));
                            } else if (tag != 16) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.f81197q0 |= 1;
                                this.f81199s0 = codedInputStream.readInt32();
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e5) {
                        throw e5.setUnfinishedMessage(this);
                    } catch (IOException e7) {
                        throw new InvalidProtocolBufferException(e7.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (z11 & true) {
                        this.f81198r0 = Collections.unmodifiableList(this.f81198r0);
                    }
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f81196p0 = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z11 & true) {
                this.f81198r0 = Collections.unmodifiableList(this.f81198r0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f81196p0 = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface TypeTableOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class ValueParameter extends GeneratedMessageLite.ExtendableMessage<ValueParameter> implements ValueParameterOrBuilder {
        public static final ValueParameter F0;
        public static Parser<ValueParameter> PARSER = new a();
        public int E0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final ByteString f81205q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f81206r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f81207s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f81208t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Type f81209u0;
        public int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public Type f81210w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public int f81211x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public byte f81212y0;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<ValueParameter, Builder> implements ValueParameterOrBuilder {

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public int f81213s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public int f81214t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public int f81215u0;

            /* JADX INFO: renamed from: w0, reason: collision with root package name */
            public int f81216w0;

            /* JADX INFO: renamed from: y0, reason: collision with root package name */
            public int f81218y0;
            public Type v0 = Type.getDefaultInstance();

            /* JADX INFO: renamed from: x0, reason: collision with root package name */
            public Type f81217x0 = Type.getDefaultInstance();

            public ValueParameter buildPartial() {
                ValueParameter valueParameter = new ValueParameter(this);
                int i10 = this.f81213s0;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                valueParameter.f81207s0 = this.f81214t0;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                valueParameter.f81208t0 = this.f81215u0;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                valueParameter.f81209u0 = this.v0;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                valueParameter.v0 = this.f81216w0;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                valueParameter.f81210w0 = this.f81217x0;
                if ((i10 & 32) == 32) {
                    i11 |= 32;
                }
                valueParameter.f81211x0 = this.f81218y0;
                valueParameter.f81206r0 = i11;
                return valueParameter;
            }

            public Type getType() {
                return this.v0;
            }

            public Type getVarargElementType() {
                return this.f81217x0;
            }

            public boolean hasName() {
                return (this.f81213s0 & 2) == 2;
            }

            public boolean hasType() {
                return (this.f81213s0 & 4) == 4;
            }

            public boolean hasVarargElementType() {
                return (this.f81213s0 & 16) == 16;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasName()) {
                    return false;
                }
                if (!hasType() || getType().isInitialized()) {
                    return (!hasVarargElementType() || getVarargElementType().isInitialized()) && extensionsAreInitialized();
                }
                return false;
            }

            public Builder mergeType(Type type) {
                if ((this.f81213s0 & 4) != 4 || this.v0 == Type.getDefaultInstance()) {
                    this.v0 = type;
                } else {
                    this.v0 = Type.newBuilder(this.v0).mergeFrom(type).buildPartial();
                }
                this.f81213s0 |= 4;
                return this;
            }

            public Builder mergeVarargElementType(Type type) {
                if ((this.f81213s0 & 16) != 16 || this.f81217x0 == Type.getDefaultInstance()) {
                    this.f81217x0 = type;
                } else {
                    this.f81217x0 = Type.newBuilder(this.f81217x0).mergeFrom(type).buildPartial();
                }
                this.f81213s0 |= 16;
                return this;
            }

            public Builder setFlags(int i10) {
                this.f81213s0 |= 1;
                this.f81214t0 = i10;
                return this;
            }

            public Builder setName(int i10) {
                this.f81213s0 |= 2;
                this.f81215u0 = i10;
                return this;
            }

            public Builder setTypeId(int i10) {
                this.f81213s0 |= 8;
                this.f81216w0 = i10;
                return this;
            }

            public Builder setVarargElementTypeId(int i10) {
                this.f81213s0 |= 32;
                this.f81218y0 = i10;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public ValueParameter build() {
                ValueParameter valueParameterBuildPartial = buildPartial();
                if (valueParameterBuildPartial.isInitialized()) {
                    return valueParameterBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(valueParameterBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public ValueParameter getDefaultInstanceForType() {
                return ValueParameter.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(ValueParameter valueParameter) {
                if (valueParameter == ValueParameter.getDefaultInstance()) {
                    return this;
                }
                if (valueParameter.hasFlags()) {
                    setFlags(valueParameter.getFlags());
                }
                if (valueParameter.hasName()) {
                    setName(valueParameter.getName());
                }
                if (valueParameter.hasType()) {
                    mergeType(valueParameter.getType());
                }
                if (valueParameter.hasTypeId()) {
                    setTypeId(valueParameter.getTypeId());
                }
                if (valueParameter.hasVarargElementType()) {
                    mergeVarargElementType(valueParameter.getVarargElementType());
                }
                if (valueParameter.hasVarargElementTypeId()) {
                    setVarargElementTypeId(valueParameter.getVarargElementTypeId());
                }
                mergeExtensionFields(valueParameter);
                setUnknownFields(getUnknownFields().concat(valueParameter.f81205q0));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo5776clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                ValueParameter valueParameter = null;
                try {
                    try {
                        ValueParameter partialFrom = ValueParameter.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        ValueParameter valueParameter2 = (ValueParameter) e5.getUnfinishedMessage();
                        try {
                            throw e5;
                        } catch (Throwable th2) {
                            th = th2;
                            valueParameter = valueParameter2;
                            if (valueParameter != null) {
                                mergeFrom(valueParameter);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (valueParameter != null) {
                        mergeFrom(valueParameter);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<ValueParameter> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public ValueParameter parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new ValueParameter(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            ValueParameter valueParameter = new ValueParameter();
            F0 = valueParameter;
            valueParameter.f81207s0 = 0;
            valueParameter.f81208t0 = 0;
            valueParameter.f81209u0 = Type.getDefaultInstance();
            valueParameter.v0 = 0;
            valueParameter.f81210w0 = Type.getDefaultInstance();
            valueParameter.f81211x0 = 0;
        }

        public ValueParameter(GeneratedMessageLite.ExtendableBuilder<ValueParameter, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f81212y0 = (byte) -1;
            this.E0 = -1;
            this.f81205q0 = extendableBuilder.getUnknownFields();
        }

        public static ValueParameter getDefaultInstance() {
            return F0;
        }

        public static Builder newBuilder(ValueParameter valueParameter) {
            return newBuilder().mergeFrom(valueParameter);
        }

        public int getFlags() {
            return this.f81207s0;
        }

        public int getName() {
            return this.f81208t0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<ValueParameter> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.E0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = (this.f81206r0 & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f81207s0) : 0;
            if ((this.f81206r0 & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f81208t0);
            }
            if ((this.f81206r0 & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(3, this.f81209u0);
            }
            if ((this.f81206r0 & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(4, this.f81210w0);
            }
            if ((this.f81206r0 & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(5, this.v0);
            }
            if ((this.f81206r0 & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(6, this.f81211x0);
            }
            int size = this.f81205q0.size() + extensionsSerializedSize() + iComputeInt32Size;
            this.E0 = size;
            return size;
        }

        public Type getType() {
            return this.f81209u0;
        }

        public int getTypeId() {
            return this.v0;
        }

        public Type getVarargElementType() {
            return this.f81210w0;
        }

        public int getVarargElementTypeId() {
            return this.f81211x0;
        }

        public boolean hasFlags() {
            return (this.f81206r0 & 1) == 1;
        }

        public boolean hasName() {
            return (this.f81206r0 & 2) == 2;
        }

        public boolean hasType() {
            return (this.f81206r0 & 4) == 4;
        }

        public boolean hasTypeId() {
            return (this.f81206r0 & 8) == 8;
        }

        public boolean hasVarargElementType() {
            return (this.f81206r0 & 16) == 16;
        }

        public boolean hasVarargElementTypeId() {
            return (this.f81206r0 & 32) == 32;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f81212y0;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!hasName()) {
                this.f81212y0 = (byte) 0;
                return false;
            }
            if (hasType() && !getType().isInitialized()) {
                this.f81212y0 = (byte) 0;
                return false;
            }
            if (hasVarargElementType() && !getVarargElementType().isInitialized()) {
                this.f81212y0 = (byte) 0;
                return false;
            }
            if (extensionsAreInitialized()) {
                this.f81212y0 = (byte) 1;
                return true;
            }
            this.f81212y0 = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.f81206r0 & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f81207s0);
            }
            if ((this.f81206r0 & 2) == 2) {
                codedOutputStream.writeInt32(2, this.f81208t0);
            }
            if ((this.f81206r0 & 4) == 4) {
                codedOutputStream.writeMessage(3, this.f81209u0);
            }
            if ((this.f81206r0 & 16) == 16) {
                codedOutputStream.writeMessage(4, this.f81210w0);
            }
            if ((this.f81206r0 & 8) == 8) {
                codedOutputStream.writeInt32(5, this.v0);
            }
            if ((this.f81206r0 & 32) == 32) {
                codedOutputStream.writeInt32(6, this.f81211x0);
            }
            extensionWriterNewExtensionWriter.writeUntil(200, codedOutputStream);
            codedOutputStream.writeRawBytes(this.f81205q0);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public ValueParameter getDefaultInstanceForType() {
            return F0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public ValueParameter() {
            this.f81212y0 = (byte) -1;
            this.E0 = -1;
            this.f81205q0 = ByteString.EMPTY;
        }

        public ValueParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Type.Builder builder;
            this.f81212y0 = (byte) -1;
            this.E0 = -1;
            boolean z10 = false;
            this.f81207s0 = 0;
            this.f81208t0 = 0;
            this.f81209u0 = Type.getDefaultInstance();
            this.v0 = 0;
            this.f81210w0 = Type.getDefaultInstance();
            this.f81211x0 = 0;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.f81206r0 |= 1;
                                this.f81207s0 = codedInputStream.readInt32();
                            } else if (tag != 16) {
                                if (tag == 26) {
                                    builder = (this.f81206r0 & 4) == 4 ? this.f81209u0.toBuilder() : null;
                                    Type type = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                    this.f81209u0 = type;
                                    if (builder != null) {
                                        builder.mergeFrom(type);
                                        this.f81209u0 = builder.buildPartial();
                                    }
                                    this.f81206r0 |= 4;
                                } else if (tag == 34) {
                                    builder = (this.f81206r0 & 16) == 16 ? this.f81210w0.toBuilder() : null;
                                    Type type2 = (Type) codedInputStream.readMessage(Type.PARSER, extensionRegistryLite);
                                    this.f81210w0 = type2;
                                    if (builder != null) {
                                        builder.mergeFrom(type2);
                                        this.f81210w0 = builder.buildPartial();
                                    }
                                    this.f81206r0 |= 16;
                                } else if (tag == 40) {
                                    this.f81206r0 |= 8;
                                    this.v0 = codedInputStream.readInt32();
                                } else if (tag != 48) {
                                    if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.f81206r0 |= 32;
                                    this.f81211x0 = codedInputStream.readInt32();
                                }
                            } else {
                                this.f81206r0 |= 2;
                                this.f81208t0 = codedInputStream.readInt32();
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e5) {
                        throw e5.setUnfinishedMessage(this);
                    } catch (IOException e7) {
                        throw new InvalidProtocolBufferException(e7.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    try {
                        codedOutputStreamNewInstance.flush();
                    } catch (IOException unused) {
                    } finally {
                        this.f81205q0 = outputNewOutput.toByteString();
                    }
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f81205q0 = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface ValueParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class VersionRequirement extends GeneratedMessageLite implements VersionRequirementOrBuilder {
        public static final VersionRequirement E0;
        public static Parser<VersionRequirement> PARSER = new a();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ByteString f81219p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f81220q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f81221r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f81222s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Level f81223t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f81224u0;
        public int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public VersionKind f81225w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public byte f81226x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public int f81227y0;

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirement, Builder> implements VersionRequirementOrBuilder {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public int f81228q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public int f81229r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public int f81230s0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public int f81232u0;
            public int v0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public Level f81231t0 = Level.ERROR;

            /* JADX INFO: renamed from: w0, reason: collision with root package name */
            public VersionKind f81233w0 = VersionKind.LANGUAGE_VERSION;

            public VersionRequirement buildPartial() {
                VersionRequirement versionRequirement = new VersionRequirement(this);
                int i10 = this.f81228q0;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                versionRequirement.f81221r0 = this.f81229r0;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                versionRequirement.f81222s0 = this.f81230s0;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                versionRequirement.f81223t0 = this.f81231t0;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                versionRequirement.f81224u0 = this.f81232u0;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                versionRequirement.v0 = this.v0;
                if ((i10 & 32) == 32) {
                    i11 |= 32;
                }
                versionRequirement.f81225w0 = this.f81233w0;
                versionRequirement.f81220q0 = i11;
                return versionRequirement;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setErrorCode(int i10) {
                this.f81228q0 |= 8;
                this.f81232u0 = i10;
                return this;
            }

            public Builder setLevel(Level level) {
                level.getClass();
                this.f81228q0 |= 4;
                this.f81231t0 = level;
                return this;
            }

            public Builder setMessage(int i10) {
                this.f81228q0 |= 16;
                this.v0 = i10;
                return this;
            }

            public Builder setVersion(int i10) {
                this.f81228q0 |= 1;
                this.f81229r0 = i10;
                return this;
            }

            public Builder setVersionFull(int i10) {
                this.f81228q0 |= 2;
                this.f81230s0 = i10;
                return this;
            }

            public Builder setVersionKind(VersionKind versionKind) {
                versionKind.getClass();
                this.f81228q0 |= 32;
                this.f81233w0 = versionKind;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public VersionRequirement build() {
                VersionRequirement versionRequirementBuildPartial = buildPartial();
                if (versionRequirementBuildPartial.isInitialized()) {
                    return versionRequirementBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(versionRequirementBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public VersionRequirement getDefaultInstanceForType() {
                return VersionRequirement.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo5776clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(VersionRequirement versionRequirement) {
                if (versionRequirement == VersionRequirement.getDefaultInstance()) {
                    return this;
                }
                if (versionRequirement.hasVersion()) {
                    setVersion(versionRequirement.getVersion());
                }
                if (versionRequirement.hasVersionFull()) {
                    setVersionFull(versionRequirement.getVersionFull());
                }
                if (versionRequirement.hasLevel()) {
                    setLevel(versionRequirement.getLevel());
                }
                if (versionRequirement.hasErrorCode()) {
                    setErrorCode(versionRequirement.getErrorCode());
                }
                if (versionRequirement.hasMessage()) {
                    setMessage(versionRequirement.getMessage());
                }
                if (versionRequirement.hasVersionKind()) {
                    setVersionKind(versionRequirement.getVersionKind());
                }
                setUnknownFields(getUnknownFields().concat(versionRequirement.f81219p0));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                VersionRequirement versionRequirement = null;
                try {
                    try {
                        VersionRequirement partialFrom = VersionRequirement.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        VersionRequirement versionRequirement2 = (VersionRequirement) e5.getUnfinishedMessage();
                        try {
                            throw e5;
                        } catch (Throwable th2) {
                            th = th2;
                            versionRequirement = versionRequirement2;
                            if (versionRequirement != null) {
                                mergeFrom(versionRequirement);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (versionRequirement != null) {
                        mergeFrom(versionRequirement);
                    }
                    throw th;
                }
            }
        }

        public enum Level implements Internal.EnumLite {
            WARNING(0),
            ERROR(1),
            HIDDEN(2);

            private static Internal.EnumLiteMap<Level> internalValueMap = new a();
            private final int value;

            public static class a implements Internal.EnumLiteMap<Level> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public Level findValueByNumber(int i10) {
                    return Level.valueOf(i10);
                }
            }

            Level(int i10) {
                this.value = i10;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static Level valueOf(int i10) {
                if (i10 == 0) {
                    return WARNING;
                }
                if (i10 == 1) {
                    return ERROR;
                }
                if (i10 != 2) {
                    return null;
                }
                return HIDDEN;
            }
        }

        public enum VersionKind implements Internal.EnumLite {
            LANGUAGE_VERSION(0),
            COMPILER_VERSION(1),
            API_VERSION(2);

            private static Internal.EnumLiteMap<VersionKind> internalValueMap = new a();
            private final int value;

            public static class a implements Internal.EnumLiteMap<VersionKind> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                public VersionKind findValueByNumber(int i10) {
                    return VersionKind.valueOf(i10);
                }
            }

            VersionKind(int i10) {
                this.value = i10;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            public static VersionKind valueOf(int i10) {
                if (i10 == 0) {
                    return LANGUAGE_VERSION;
                }
                if (i10 == 1) {
                    return COMPILER_VERSION;
                }
                if (i10 != 2) {
                    return null;
                }
                return API_VERSION;
            }
        }

        public static class a extends AbstractParser<VersionRequirement> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public VersionRequirement parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new VersionRequirement(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            VersionRequirement versionRequirement = new VersionRequirement();
            E0 = versionRequirement;
            versionRequirement.f81221r0 = 0;
            versionRequirement.f81222s0 = 0;
            versionRequirement.f81223t0 = Level.ERROR;
            versionRequirement.f81224u0 = 0;
            versionRequirement.v0 = 0;
            versionRequirement.f81225w0 = VersionKind.LANGUAGE_VERSION;
        }

        public VersionRequirement(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f81226x0 = (byte) -1;
            this.f81227y0 = -1;
            this.f81219p0 = builder.getUnknownFields();
        }

        public static VersionRequirement getDefaultInstance() {
            return E0;
        }

        public static Builder newBuilder(VersionRequirement versionRequirement) {
            return newBuilder().mergeFrom(versionRequirement);
        }

        public int getErrorCode() {
            return this.f81224u0;
        }

        public Level getLevel() {
            return this.f81223t0;
        }

        public int getMessage() {
            return this.v0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<VersionRequirement> getParserForType() {
            return PARSER;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f81227y0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeInt32Size = (this.f81220q0 & 1) == 1 ? CodedOutputStream.computeInt32Size(1, this.f81221r0) : 0;
            if ((this.f81220q0 & 2) == 2) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, this.f81222s0);
            }
            if ((this.f81220q0 & 4) == 4) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(3, this.f81223t0.getNumber());
            }
            if ((this.f81220q0 & 8) == 8) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(4, this.f81224u0);
            }
            if ((this.f81220q0 & 16) == 16) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(5, this.v0);
            }
            if ((this.f81220q0 & 32) == 32) {
                iComputeInt32Size += CodedOutputStream.computeEnumSize(6, this.f81225w0.getNumber());
            }
            int size = this.f81219p0.size() + iComputeInt32Size;
            this.f81227y0 = size;
            return size;
        }

        public int getVersion() {
            return this.f81221r0;
        }

        public int getVersionFull() {
            return this.f81222s0;
        }

        public VersionKind getVersionKind() {
            return this.f81225w0;
        }

        public boolean hasErrorCode() {
            return (this.f81220q0 & 8) == 8;
        }

        public boolean hasLevel() {
            return (this.f81220q0 & 4) == 4;
        }

        public boolean hasMessage() {
            return (this.f81220q0 & 16) == 16;
        }

        public boolean hasVersion() {
            return (this.f81220q0 & 1) == 1;
        }

        public boolean hasVersionFull() {
            return (this.f81220q0 & 2) == 2;
        }

        public boolean hasVersionKind() {
            return (this.f81220q0 & 32) == 32;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f81226x0;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f81226x0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.f81220q0 & 1) == 1) {
                codedOutputStream.writeInt32(1, this.f81221r0);
            }
            if ((this.f81220q0 & 2) == 2) {
                codedOutputStream.writeInt32(2, this.f81222s0);
            }
            if ((this.f81220q0 & 4) == 4) {
                codedOutputStream.writeEnum(3, this.f81223t0.getNumber());
            }
            if ((this.f81220q0 & 8) == 8) {
                codedOutputStream.writeInt32(4, this.f81224u0);
            }
            if ((this.f81220q0 & 16) == 16) {
                codedOutputStream.writeInt32(5, this.v0);
            }
            if ((this.f81220q0 & 32) == 32) {
                codedOutputStream.writeEnum(6, this.f81225w0.getNumber());
            }
            codedOutputStream.writeRawBytes(this.f81219p0);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public VersionRequirement getDefaultInstanceForType() {
            return E0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public VersionRequirement() {
            this.f81226x0 = (byte) -1;
            this.f81227y0 = -1;
            this.f81219p0 = ByteString.EMPTY;
        }

        public VersionRequirement(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f81226x0 = (byte) -1;
            this.f81227y0 = -1;
            boolean z10 = false;
            this.f81221r0 = 0;
            this.f81222s0 = 0;
            this.f81223t0 = Level.ERROR;
            this.f81224u0 = 0;
            this.v0 = 0;
            this.f81225w0 = VersionKind.LANGUAGE_VERSION;
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.f81220q0 |= 1;
                                this.f81221r0 = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.f81220q0 |= 2;
                                this.f81222s0 = codedInputStream.readInt32();
                            } else if (tag == 24) {
                                int i10 = codedInputStream.readEnum();
                                Level levelValueOf = Level.valueOf(i10);
                                if (levelValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i10);
                                } else {
                                    this.f81220q0 |= 4;
                                    this.f81223t0 = levelValueOf;
                                }
                            } else if (tag == 32) {
                                this.f81220q0 |= 8;
                                this.f81224u0 = codedInputStream.readInt32();
                            } else if (tag == 40) {
                                this.f81220q0 |= 16;
                                this.v0 = codedInputStream.readInt32();
                            } else if (tag != 48) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                int i11 = codedInputStream.readEnum();
                                VersionKind versionKindValueOf = VersionKind.valueOf(i11);
                                if (versionKindValueOf == null) {
                                    codedOutputStreamNewInstance.writeRawVarint32(tag);
                                    codedOutputStreamNewInstance.writeRawVarint32(i11);
                                } else {
                                    this.f81220q0 |= 32;
                                    this.f81225w0 = versionKindValueOf;
                                }
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f81219p0 = outputNewOutput.toByteString();
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
                this.f81219p0 = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface VersionRequirementOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class VersionRequirementTable extends GeneratedMessageLite implements VersionRequirementTableOrBuilder {
        public static Parser<VersionRequirementTable> PARSER = new a();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static final VersionRequirementTable f81234t0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ByteString f81235p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public List<VersionRequirement> f81236q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public byte f81237r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f81238s0;

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirementTable, Builder> implements VersionRequirementTableOrBuilder {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public int f81239q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public List<VersionRequirement> f81240r0 = Collections.emptyList();

            public VersionRequirementTable buildPartial() {
                VersionRequirementTable versionRequirementTable = new VersionRequirementTable(this);
                if ((this.f81239q0 & 1) == 1) {
                    this.f81240r0 = Collections.unmodifiableList(this.f81240r0);
                    this.f81239q0 &= -2;
                }
                versionRequirementTable.f81236q0 = this.f81240r0;
                return versionRequirementTable;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public VersionRequirementTable build() {
                VersionRequirementTable versionRequirementTableBuildPartial = buildPartial();
                if (versionRequirementTableBuildPartial.isInitialized()) {
                    return versionRequirementTableBuildPartial;
                }
                throw AbstractMessageLite.Builder.newUninitializedMessageException(versionRequirementTableBuildPartial);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public VersionRequirementTable getDefaultInstanceForType() {
                return VersionRequirementTable.getDefaultInstance();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo5776clone() {
                return new Builder().mergeFrom(buildPartial());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            public Builder mergeFrom(VersionRequirementTable versionRequirementTable) {
                if (versionRequirementTable == VersionRequirementTable.getDefaultInstance()) {
                    return this;
                }
                if (!versionRequirementTable.f81236q0.isEmpty()) {
                    if (this.f81240r0.isEmpty()) {
                        this.f81240r0 = versionRequirementTable.f81236q0;
                        this.f81239q0 &= -2;
                    } else {
                        if ((this.f81239q0 & 1) != 1) {
                            this.f81240r0 = new ArrayList(this.f81240r0);
                            this.f81239q0 |= 1;
                        }
                        this.f81240r0.addAll(versionRequirementTable.f81236q0);
                    }
                }
                setUnknownFields(getUnknownFields().concat(versionRequirementTable.f81235p0));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                VersionRequirementTable versionRequirementTable = null;
                try {
                    try {
                        VersionRequirementTable partialFrom = VersionRequirementTable.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (partialFrom != null) {
                            mergeFrom(partialFrom);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e5) {
                        VersionRequirementTable versionRequirementTable2 = (VersionRequirementTable) e5.getUnfinishedMessage();
                        try {
                            throw e5;
                        } catch (Throwable th2) {
                            th = th2;
                            versionRequirementTable = versionRequirementTable2;
                            if (versionRequirementTable != null) {
                                mergeFrom(versionRequirementTable);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (versionRequirementTable != null) {
                        mergeFrom(versionRequirementTable);
                    }
                    throw th;
                }
            }
        }

        public static class a extends AbstractParser<VersionRequirementTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            public VersionRequirementTable parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new VersionRequirementTable(codedInputStream, extensionRegistryLite);
            }
        }

        static {
            VersionRequirementTable versionRequirementTable = new VersionRequirementTable();
            f81234t0 = versionRequirementTable;
            versionRequirementTable.f81236q0 = Collections.emptyList();
        }

        public VersionRequirementTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f81237r0 = (byte) -1;
            this.f81238s0 = -1;
            this.f81235p0 = builder.getUnknownFields();
        }

        public static VersionRequirementTable getDefaultInstance() {
            return f81234t0;
        }

        public static Builder newBuilder(VersionRequirementTable versionRequirementTable) {
            return newBuilder().mergeFrom(versionRequirementTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<VersionRequirementTable> getParserForType() {
            return PARSER;
        }

        public int getRequirementCount() {
            return this.f81236q0.size();
        }

        public List<VersionRequirement> getRequirementList() {
            return this.f81236q0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.f81238s0;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f81236q0.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.f81236q0.get(i11));
            }
            int size = this.f81235p0.size() + iComputeMessageSize;
            this.f81238s0 = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f81237r0;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f81237r0 = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            for (int i10 = 0; i10 < this.f81236q0.size(); i10++) {
                codedOutputStream.writeMessage(1, this.f81236q0.get(i10));
            }
            codedOutputStream.writeRawBytes(this.f81235p0);
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public VersionRequirementTable getDefaultInstanceForType() {
            return f81234t0;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Builder toBuilder() {
            return newBuilder(this);
        }

        public VersionRequirementTable() {
            this.f81237r0 = (byte) -1;
            this.f81238s0 = -1;
            this.f81235p0 = ByteString.EMPTY;
        }

        public VersionRequirementTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f81237r0 = (byte) -1;
            this.f81238s0 = -1;
            this.f81236q0 = Collections.emptyList();
            ByteString.Output outputNewOutput = ByteString.newOutput();
            CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(outputNewOutput, 1);
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 10) {
                                if (!parseUnknownField(codedInputStream, codedOutputStreamNewInstance, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if (!(z11 & true)) {
                                    this.f81236q0 = new ArrayList();
                                    z11 |= true;
                                }
                                this.f81236q0.add((VersionRequirement) codedInputStream.readMessage(VersionRequirement.PARSER, extensionRegistryLite));
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if (z11 & true) {
                            this.f81236q0 = Collections.unmodifiableList(this.f81236q0);
                        }
                        try {
                            codedOutputStreamNewInstance.flush();
                        } catch (IOException unused) {
                        } finally {
                            this.f81235p0 = outputNewOutput.toByteString();
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
            if (z11 & true) {
                this.f81236q0 = Collections.unmodifiableList(this.f81236q0);
            }
            try {
                codedOutputStreamNewInstance.flush();
            } catch (IOException unused2) {
            } finally {
                this.f81235p0 = outputNewOutput.toByteString();
            }
            makeExtensionsImmutable();
        }
    }

    public interface VersionRequirementTableOrBuilder extends MessageLiteOrBuilder {
    }

    public enum Visibility implements Internal.EnumLite {
        INTERNAL(0),
        PRIVATE(1),
        PROTECTED(2),
        PUBLIC(3),
        PRIVATE_TO_THIS(4),
        LOCAL(5);

        private static Internal.EnumLiteMap<Visibility> internalValueMap = new a();
        private final int value;

        public static class a implements Internal.EnumLiteMap<Visibility> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            public Visibility findValueByNumber(int i10) {
                return Visibility.valueOf(i10);
            }
        }

        Visibility(int i10) {
            this.value = i10;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int getNumber() {
            return this.value;
        }

        public static Visibility valueOf(int i10) {
            if (i10 == 0) {
                return INTERNAL;
            }
            if (i10 == 1) {
                return PRIVATE;
            }
            if (i10 == 2) {
                return PROTECTED;
            }
            if (i10 == 3) {
                return PUBLIC;
            }
            if (i10 == 4) {
                return PRIVATE_TO_THIS;
            }
            if (i10 != 5) {
                return null;
            }
            return LOCAL;
        }
    }
}
