package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: UnknownFieldSchema.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class t0<T, B> {
    public abstract void a(int i10, int i11, Object obj);

    public abstract void b(int i10, long j10, Object obj);

    public abstract void c(int i10, Object obj, Object obj2);

    public abstract void d(B b10, int i10, ByteString byteString);

    public abstract void e(int i10, long j10, Object obj);

    public abstract UnknownFieldSetLite f(Object obj);

    public abstract UnknownFieldSetLite g(Object obj);

    public abstract int h(T t10);

    public abstract int i(T t10);

    public abstract void j(Object obj);

    public abstract UnknownFieldSetLite k(Object obj, Object obj2);

    public final boolean l(B b10, m0 m0Var) throws IOException {
        int tag = m0Var.getTag();
        int tagFieldNumber = WireFormat.getTagFieldNumber(tag);
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            e(tagFieldNumber, m0Var.N(), b10);
            return true;
        }
        if (tagWireType == 1) {
            b(tagFieldNumber, m0Var.b(), b10);
            return true;
        }
        if (tagWireType == 2) {
            d(b10, tagFieldNumber, m0Var.o());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.d();
            }
            a(tagFieldNumber, m0Var.x(), b10);
            return true;
        }
        UnknownFieldSetLite unknownFieldSetLiteM = m();
        int i10 = (tagFieldNumber << 3) | 4;
        while (m0Var.F() != Integer.MAX_VALUE && l(unknownFieldSetLiteM, m0Var)) {
        }
        if (i10 != m0Var.getTag()) {
            throw InvalidProtocolBufferException.a();
        }
        c(tagFieldNumber, b10, q(unknownFieldSetLiteM));
        return true;
    }

    public abstract UnknownFieldSetLite m();

    public abstract void n(Object obj, B b10);

    public abstract void o(Object obj, T t10);

    public abstract void p();

    public abstract UnknownFieldSetLite q(Object obj);

    public abstract void r(Object obj, h hVar) throws IOException;

    public abstract void s(Object obj, h hVar) throws IOException;
}
