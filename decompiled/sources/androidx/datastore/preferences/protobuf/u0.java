package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: UnknownFieldSetLiteSchema.java */
/* JADX INFO: loaded from: classes2.dex */
public final class u0 extends t0<UnknownFieldSetLite, UnknownFieldSetLite> {
    @Override // androidx.datastore.preferences.protobuf.t0
    public final void a(int i10, int i11, Object obj) {
        ((UnknownFieldSetLite) obj).c((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // androidx.datastore.preferences.protobuf.t0
    public final void b(int i10, long j10, Object obj) {
        ((UnknownFieldSetLite) obj).c((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // androidx.datastore.preferences.protobuf.t0
    public final void c(int i10, Object obj, Object obj2) {
        ((UnknownFieldSetLite) obj).c((i10 << 3) | 3, (UnknownFieldSetLite) obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.t0
    public final void d(UnknownFieldSetLite unknownFieldSetLite, int i10, ByteString byteString) {
        unknownFieldSetLite.c((i10 << 3) | 2, byteString);
    }

    @Override // androidx.datastore.preferences.protobuf.t0
    public final void e(int i10, long j10, Object obj) {
        ((UnknownFieldSetLite) obj).c(i10 << 3, Long.valueOf(j10));
    }

    @Override // androidx.datastore.preferences.protobuf.t0
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

    @Override // androidx.datastore.preferences.protobuf.t0
    public final UnknownFieldSetLite g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.t0
    public final int h(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.getSerializedSize();
    }

    @Override // androidx.datastore.preferences.protobuf.t0
    public final int i(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.getSerializedSizeAsMessageSet();
    }

    @Override // androidx.datastore.preferences.protobuf.t0
    public final void j(Object obj) {
        ((GeneratedMessageLite) obj).unknownFields.makeImmutable();
    }

    @Override // androidx.datastore.preferences.protobuf.t0
    public final UnknownFieldSetLite k(Object obj, Object obj2) {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        UnknownFieldSetLite unknownFieldSetLite2 = (UnknownFieldSetLite) obj2;
        return unknownFieldSetLite2.equals(UnknownFieldSetLite.getDefaultInstance()) ? unknownFieldSetLite : UnknownFieldSetLite.b(unknownFieldSetLite, unknownFieldSetLite2);
    }

    @Override // androidx.datastore.preferences.protobuf.t0
    public final UnknownFieldSetLite m() {
        return new UnknownFieldSetLite();
    }

    @Override // androidx.datastore.preferences.protobuf.t0
    public final void n(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        ((GeneratedMessageLite) obj).unknownFields = unknownFieldSetLite;
    }

    @Override // androidx.datastore.preferences.protobuf.t0
    public final void o(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        ((GeneratedMessageLite) obj).unknownFields = unknownFieldSetLite;
    }

    @Override // androidx.datastore.preferences.protobuf.t0
    public final UnknownFieldSetLite q(Object obj) {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        unknownFieldSetLite.makeImmutable();
        return unknownFieldSetLite;
    }

    @Override // androidx.datastore.preferences.protobuf.t0
    public final void r(Object obj, h hVar) throws IOException {
        UnknownFieldSetLite unknownFieldSetLite = (UnknownFieldSetLite) obj;
        unknownFieldSetLite.getClass();
        hVar.getClass();
        if (Writer.FieldOrder.ASCENDING == Writer.FieldOrder.DESCENDING) {
            for (int i10 = unknownFieldSetLite.f21004a - 1; i10 >= 0; i10--) {
                hVar.l(WireFormat.getTagFieldNumber(unknownFieldSetLite.f21005b[i10]), unknownFieldSetLite.f21006c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < unknownFieldSetLite.f21004a; i11++) {
            hVar.l(WireFormat.getTagFieldNumber(unknownFieldSetLite.f21005b[i11]), unknownFieldSetLite.f21006c[i11]);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t0
    public final void s(Object obj, h hVar) throws IOException {
        ((UnknownFieldSetLite) obj).writeTo(hVar);
    }

    @Override // androidx.datastore.preferences.protobuf.t0
    public final void p() {
    }
}
