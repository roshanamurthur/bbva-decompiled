package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.util.Arrays;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encoding;

/* JADX INFO: loaded from: classes9.dex */
public abstract class x extends u implements Iterable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private Vector f66423p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f66424q0;

    public x() {
        this.f66423p0 = new Vector();
        this.f66424q0 = false;
    }

    public static x a(z zVar, boolean z10) {
        if (z10) {
            if (zVar.i()) {
                return (x) zVar.g();
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        }
        if (zVar.i()) {
            return zVar instanceof m0 ? new k0(zVar.g()) : new c2(zVar.g());
        }
        if (zVar.g() instanceof x) {
            return (x) zVar.g();
        }
        if (!(zVar.g() instanceof v)) {
            throw new IllegalArgumentException("unknown object in getInstance: ".concat(zVar.getClass().getName()));
        }
        v vVar = (v) zVar.g();
        return zVar instanceof m0 ? new k0(vVar.i()) : new c2(vVar.i());
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean d() {
        return true;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public u e() {
        if (this.f66424q0) {
            k1 k1Var = new k1();
            k1Var.f66423p0 = this.f66423p0;
            return k1Var;
        }
        Vector vector = new Vector();
        for (int i10 = 0; i10 != this.f66423p0.size(); i10++) {
            vector.addElement(this.f66423p0.elementAt(i10));
        }
        k1 k1Var2 = new k1();
        k1Var2.f66423p0 = vector;
        k1Var2.i();
        return k1Var2;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public u f() {
        c2 c2Var = new c2();
        c2Var.f66423p0 = this.f66423p0;
        return c2Var;
    }

    public Enumeration g() {
        return this.f66423p0.elements();
    }

    public int h() {
        return this.f66423p0.size();
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u, com.vasco.digipass.sdk.utils.utilities.obfuscated.o
    public int hashCode() {
        Enumeration enumerationG = g();
        int iH = h();
        while (enumerationG.hasMoreElements()) {
            iH = (iH * 17) ^ a(enumerationG).hashCode();
        }
        return iH;
    }

    public void i() {
        if (this.f66424q0) {
            return;
        }
        this.f66424q0 = true;
        if (this.f66423p0.size() > 1) {
            int size = this.f66423p0.size() - 1;
            boolean z10 = true;
            while (z10) {
                int i10 = 0;
                byte[] bArrA = a((g) this.f66423p0.elementAt(0));
                z10 = false;
                int i11 = 0;
                while (i11 != size) {
                    int i12 = i11 + 1;
                    byte[] bArrA2 = a((g) this.f66423p0.elementAt(i12));
                    if (a(bArrA, bArrA2)) {
                        bArrA = bArrA2;
                    } else {
                        Object objElementAt = this.f66423p0.elementAt(i11);
                        Vector vector = this.f66423p0;
                        vector.setElementAt(vector.elementAt(i12), i11);
                        this.f66423p0.setElementAt(objElementAt, i12);
                        z10 = true;
                        i10 = i11;
                    }
                    i11 = i12;
                }
                size = i10;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<g> iterator() {
        return new Arrays.a(j());
    }

    public g[] j() {
        g[] gVarArr = new g[h()];
        for (int i10 = 0; i10 != h(); i10++) {
            gVarArr[i10] = a(i10);
        }
        return gVarArr;
    }

    public String toString() {
        return this.f66423p0.toString();
    }

    public x(g gVar) {
        Vector vector = new Vector();
        this.f66423p0 = vector;
        this.f66424q0 = false;
        vector.addElement(gVar);
    }

    public x(h hVar, boolean z10) {
        this.f66423p0 = new Vector();
        this.f66424q0 = false;
        for (int i10 = 0; i10 != hVar.a(); i10++) {
            this.f66423p0.addElement(hVar.a(i10));
        }
        if (z10) {
            i();
        }
    }

    public x(g[] gVarArr, boolean z10) {
        this.f66423p0 = new Vector();
        this.f66424q0 = false;
        for (int i10 = 0; i10 != gVarArr.length; i10++) {
            this.f66423p0.addElement(gVarArr[i10]);
        }
        if (z10) {
            i();
        }
    }

    public g a(int i10) {
        return (g) this.f66423p0.elementAt(i10);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean a(u uVar) {
        if (!(uVar instanceof x)) {
            return false;
        }
        x xVar = (x) uVar;
        if (h() != xVar.h()) {
            return false;
        }
        Enumeration enumerationG = g();
        Enumeration enumerationG2 = xVar.g();
        while (enumerationG.hasMoreElements()) {
            g gVarA = a(enumerationG);
            g gVarA2 = a(enumerationG2);
            u aSN1Primitive = gVarA.toASN1Primitive();
            u aSN1Primitive2 = gVarA2.toASN1Primitive();
            if (aSN1Primitive != aSN1Primitive2 && !aSN1Primitive.equals(aSN1Primitive2)) {
                return false;
            }
        }
        return true;
    }

    private g a(Enumeration enumeration) {
        g gVar = (g) enumeration.nextElement();
        return gVar == null ? c1.f65958p0 : gVar;
    }

    private boolean a(byte[] bArr, byte[] bArr2) {
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i10 = 0; i10 != iMin; i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return (b10 & 255) < (b11 & 255);
            }
        }
        return iMin == bArr.length;
    }

    private byte[] a(g gVar) {
        try {
            return gVar.toASN1Primitive().getEncoded(ASN1Encoding.DER);
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }
}
