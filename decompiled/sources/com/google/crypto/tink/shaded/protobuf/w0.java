package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: UnknownFieldSetLiteSchema.java */
/* JADX INFO: loaded from: classes10.dex */
public final class w0 extends v0<UnknownFieldSetLite, UnknownFieldSetLite> {
    @Override // com.google.crypto.tink.shaded.protobuf.v0
    public final void a(int i10, int i11, Object obj) {
        ((UnknownFieldSetLite) obj).e((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v0
    public final void b(int i10, long j10, Object obj) {
        ((UnknownFieldSetLite) obj).e((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v0
    public final void c(int i10, Object obj, Object obj2) {
        ((UnknownFieldSetLite) obj).e((i10 << 3) | 3, (UnknownFieldSetLite) obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v0
    public final void d(UnknownFieldSetLite unknownFieldSetLite, int i10, ByteString byteString) {
        unknownFieldSetLite.e((i10 << 3) | 2, byteString);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v0
    public final void e(int i10, long j10, Object obj) {
        ((UnknownFieldSetLite) obj).e(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v0
    public final UnknownFieldSetLite f(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        UnknownFieldSetLite unknownFieldSetLite2 = new UnknownFieldSetLite();
        generatedMessageLite.unknownFields = unknownFieldSetLite2;
        return unknownFieldSetLite2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v0
    public final UnknownFieldSetLite g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v0
    public final int h(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.getSerializedSize();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v0
    public final int i(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.getSerializedSizeAsMessageSet();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v0
    public final void j(Object obj) {
        ((GeneratedMessageLite) obj).unknownFields.makeImmutable();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v0
    public final UnknownFieldSetLite k(Object obj, Object obj2) {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        UnknownFieldSetLite unknownFieldSetLite2 = (UnknownFieldSetLite) obj2;
        if (UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLite2)) {
            return unknownFieldSetLite;
        }
        if (UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLite)) {
            return UnknownFieldSetLite.d(unknownFieldSetLite, unknownFieldSetLite2);
        }
        unknownFieldSetLite.getClass();
        if (unknownFieldSetLite2.equals(UnknownFieldSetLite.getDefaultInstance())) {
            return unknownFieldSetLite;
        }
        unknownFieldSetLite.a();
        int i10 = unknownFieldSetLite.f47168a + unknownFieldSetLite2.f47168a;
        unknownFieldSetLite.b(i10);
        System.arraycopy(unknownFieldSetLite2.f47169b, 0, unknownFieldSetLite.f47169b, unknownFieldSetLite.f47168a, unknownFieldSetLite2.f47168a);
        System.arraycopy(unknownFieldSetLite2.f47170c, 0, unknownFieldSetLite.f47170c, unknownFieldSetLite.f47168a, unknownFieldSetLite2.f47168a);
        unknownFieldSetLite.f47168a = i10;
        return unknownFieldSetLite;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v0
    public final UnknownFieldSetLite m() {
        return new UnknownFieldSetLite();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v0
    public final void n(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        ((GeneratedMessageLite) obj).unknownFields = unknownFieldSetLite;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v0
    public final void o(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        ((GeneratedMessageLite) obj).unknownFields = unknownFieldSetLite;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v0
    public final UnknownFieldSetLite q(Object obj) {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        unknownFieldSetLite.makeImmutable();
        return unknownFieldSetLite;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v0
    public final void r(Object obj, f fVar) throws IOException {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        unknownFieldSetLite.getClass();
        fVar.getClass();
        if (Writer.FieldOrder.ASCENDING == Writer.FieldOrder.DESCENDING) {
            for (int i10 = unknownFieldSetLite.f47168a - 1; i10 >= 0; i10--) {
                fVar.l(WireFormat.getTagFieldNumber(unknownFieldSetLite.f47169b[i10]), unknownFieldSetLite.f47170c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < unknownFieldSetLite.f47168a; i11++) {
            fVar.l(WireFormat.getTagFieldNumber(unknownFieldSetLite.f47169b[i11]), unknownFieldSetLite.f47170c[i11]);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v0
    public final void s(Object obj, f fVar) throws IOException {
        ((UnknownFieldSetLite) obj).writeTo(fVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.v0
    public final void p() {
    }
}
