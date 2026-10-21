package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: CodedOutputStreamWriter.java */
/* JADX INFO: loaded from: classes10.dex */
public final class f implements Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CodedOutputStream f47218a;

    /* JADX INFO: compiled from: CodedOutputStreamWriter.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47219a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f47219a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47219a[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47219a[WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47219a[WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47219a[WireFormat.FieldType.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47219a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f47219a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f47219a[WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f47219a[WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f47219a[WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f47219a[WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f47219a[WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public f(CodedOutputStream codedOutputStream) {
        Charset charset = Internal.f47106a;
        if (codedOutputStream == null) {
            throw new NullPointerException("output");
        }
        this.f47218a = codedOutputStream;
        codedOutputStream.f47018a = this;
    }

    public final void a(int i10, boolean z10) throws IOException {
        this.f47218a.writeBool(i10, z10);
    }

    public final void b(int i10, ByteString byteString) throws IOException {
        this.f47218a.writeBytes(i10, byteString);
    }

    public final void c(int i10, double d2) throws IOException {
        this.f47218a.writeDouble(i10, d2);
    }

    public final void d(int i10, int i11) throws IOException {
        this.f47218a.writeEnum(i10, i11);
    }

    public final void e(int i10, int i11) throws IOException {
        this.f47218a.writeFixed32(i10, i11);
    }

    public final void f(int i10, long j10) throws IOException {
        this.f47218a.writeFixed64(i10, j10);
    }

    public final void g(int i10, float f6) throws IOException {
        this.f47218a.writeFloat(i10, f6);
    }

    public final void h(int i10, q0 q0Var, Object obj) throws IOException {
        CodedOutputStream codedOutputStream = this.f47218a;
        codedOutputStream.writeTag(i10, 3);
        q0Var.g((MessageLite) obj, codedOutputStream.f47018a);
        codedOutputStream.writeTag(i10, 4);
    }

    public final void i(int i10, int i11) throws IOException {
        this.f47218a.writeInt32(i10, i11);
    }

    public final void j(int i10, long j10) throws IOException {
        this.f47218a.writeInt64(i10, j10);
    }

    public final void k(int i10, q0 q0Var, Object obj) throws IOException {
        this.f47218a.d(i10, (MessageLite) obj, q0Var);
    }

    public final void l(int i10, Object obj) throws IOException {
        boolean z10 = obj instanceof ByteString;
        CodedOutputStream codedOutputStream = this.f47218a;
        if (z10) {
            codedOutputStream.writeRawMessageSetExtension(i10, (ByteString) obj);
        } else {
            codedOutputStream.writeMessageSetExtension(i10, (MessageLite) obj);
        }
    }

    public final void m(int i10, int i11) throws IOException {
        this.f47218a.writeSFixed32(i10, i11);
    }

    public final void n(int i10, long j10) throws IOException {
        this.f47218a.writeSFixed64(i10, j10);
    }

    public final void o(int i10, int i11) throws IOException {
        this.f47218a.writeSInt32(i10, i11);
    }

    public final void p(int i10, long j10) throws IOException {
        this.f47218a.writeSInt64(i10, j10);
    }

    public final void q(int i10, int i11) throws IOException {
        this.f47218a.writeUInt32(i10, i11);
    }

    public final void r(int i10, long j10) throws IOException {
        this.f47218a.writeUInt64(i10, j10);
    }
}
