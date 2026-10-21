package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.util.Arrays;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* JADX INFO: loaded from: classes9.dex */
public abstract class v extends u implements Iterable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    protected Vector f66399p0 = new Vector();

    public v() {
    }

    public static v a(Object obj) {
        if (obj == null || (obj instanceof v)) {
            return (v) obj;
        }
        if (obj instanceof w) {
            return a((Object) ((w) obj).toASN1Primitive());
        }
        if (obj instanceof byte[]) {
            try {
                return a((Object) u.a((byte[]) obj));
            } catch (IOException e5) {
                throw new IllegalArgumentException(androidx.camera.core.impl.a.d(e5, new StringBuilder("failed to construct sequence from byte[]: ")));
            }
        }
        if (obj instanceof g) {
            u aSN1Primitive = ((g) obj).toASN1Primitive();
            if (aSN1Primitive instanceof v) {
                return (v) aSN1Primitive;
            }
        }
        throw new IllegalArgumentException(androidx.emoji2.text.flatbuffer.a.c(obj, "unknown object in getInstance: "));
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean d() {
        return true;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public u e() {
        i1 i1Var = new i1();
        i1Var.f66399p0 = this.f66399p0;
        return i1Var;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public u f() {
        b2 b2Var = new b2();
        b2Var.f66399p0 = this.f66399p0;
        return b2Var;
    }

    public Enumeration g() {
        return this.f66399p0.elements();
    }

    public int h() {
        return this.f66399p0.size();
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

    public g[] i() {
        g[] gVarArr = new g[h()];
        for (int i10 = 0; i10 != h(); i10++) {
            gVarArr[i10] = a(i10);
        }
        return gVarArr;
    }

    @Override // java.lang.Iterable
    public Iterator<g> iterator() {
        return new Arrays.a(i());
    }

    public String toString() {
        return this.f66399p0.toString();
    }

    public v(h hVar) {
        for (int i10 = 0; i10 != hVar.a(); i10++) {
            this.f66399p0.addElement(hVar.a(i10));
        }
    }

    public g a(int i10) {
        return (g) this.f66399p0.elementAt(i10);
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean a(u uVar) {
        if (!(uVar instanceof v)) {
            return false;
        }
        v vVar = (v) uVar;
        if (h() != vVar.h()) {
            return false;
        }
        Enumeration enumerationG = g();
        Enumeration enumerationG2 = vVar.g();
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
        return (g) enumeration.nextElement();
    }
}
