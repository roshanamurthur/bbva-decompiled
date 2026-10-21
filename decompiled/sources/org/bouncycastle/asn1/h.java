package org.bouncycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends ASN1Sequence {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public byte[] f87269q0;

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final synchronized void a(ASN1OutputStream aSN1OutputStream, boolean z10) throws IOException {
        try {
            byte[] bArr = this.f87269q0;
            if (bArr != null) {
                aSN1OutputStream.f(z10, 48, bArr);
            } else {
                super.d().a(aSN1OutputStream, z10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final synchronized int b() throws IOException {
        byte[] bArr = this.f87269q0;
        if (bArr != null) {
            return j.a(bArr.length) + 1 + this.f87269q0.length;
        }
        return super.d().b();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Primitive
    public final synchronized ASN1Primitive c() {
        f();
        return super.c();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Primitive
    public final synchronized ASN1Primitive d() {
        f();
        return super.d();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public final ASN1Encodable[] e() {
        f();
        return this.f86524p0;
    }

    public final void f() {
        if (this.f87269q0 != null) {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            g gVar = new g(this.f87269q0);
            while (gVar.hasMoreElements()) {
                aSN1EncodableVector.add((ASN1Primitive) gVar.nextElement());
            }
            this.f86524p0 = aSN1EncodableVector.b();
            this.f87269q0 = null;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public final synchronized ASN1Encodable getObjectAt(int i10) {
        f();
        return super.getObjectAt(i10);
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public final synchronized Enumeration getObjects() {
        byte[] bArr = this.f87269q0;
        if (bArr != null) {
            return new g(bArr);
        }
        return super.getObjects();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public final synchronized int hashCode() {
        f();
        return super.hashCode();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence, org.bouncycastle.util.Iterable, java.lang.Iterable
    public final synchronized Iterator<ASN1Encodable> iterator() {
        f();
        return super.iterator();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public final synchronized int size() {
        f();
        return super.size();
    }

    @Override // org.bouncycastle.asn1.ASN1Sequence
    public final synchronized ASN1Encodable[] toArray() {
        f();
        return super.toArray();
    }
}
