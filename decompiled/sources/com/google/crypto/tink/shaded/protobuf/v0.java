package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: UnknownFieldSchema.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class v0<T, B> {
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

    public final boolean l(B b10, o0 o0Var) throws IOException {
        e eVar = (e) o0Var;
        int i10 = eVar.f47210b;
        int tagFieldNumber = WireFormat.getTagFieldNumber(i10);
        int tagWireType = WireFormat.getTagWireType(i10);
        if (tagWireType == 0) {
            eVar.x(0);
            e(tagFieldNumber, eVar.f47209a.readInt64(), b10);
            return true;
        }
        if (tagWireType == 1) {
            eVar.x(1);
            b(tagFieldNumber, eVar.f47209a.readFixed64(), b10);
            return true;
        }
        if (tagWireType == 2) {
            d(b10, tagFieldNumber, eVar.e());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.d();
            }
            eVar.x(5);
            a(tagFieldNumber, eVar.f47209a.readFixed32(), b10);
            return true;
        }
        UnknownFieldSetLite unknownFieldSetLiteM = m();
        int i11 = (tagFieldNumber << 3) | 4;
        while (eVar.a() != Integer.MAX_VALUE && l(unknownFieldSetLiteM, eVar)) {
        }
        if (i11 != eVar.f47210b) {
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

    public abstract void r(Object obj, f fVar) throws IOException;

    public abstract void s(Object obj, f fVar) throws IOException;
}
