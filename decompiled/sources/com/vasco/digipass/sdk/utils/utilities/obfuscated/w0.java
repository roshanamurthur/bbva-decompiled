package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encoding;

/* JADX INFO: loaded from: classes9.dex */
public class w0 extends u {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private p f66412p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private m f66413q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private u f66414r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f66415s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private u f66416t0;

    public w0(h hVar) {
        int i10 = 0;
        u uVarA = a(hVar, 0);
        if (uVarA instanceof p) {
            this.f66412p0 = (p) uVarA;
            uVarA = a(hVar, 1);
            i10 = 1;
        }
        if (uVarA instanceof m) {
            this.f66413q0 = (m) uVarA;
            i10++;
            uVarA = a(hVar, i10);
        }
        if (!(uVarA instanceof z)) {
            this.f66414r0 = uVarA;
            i10++;
            uVarA = a(hVar, i10);
        }
        if (hVar.a() != i10 + 1) {
            throw new IllegalArgumentException("input vector too large");
        }
        if (!(uVarA instanceof z)) {
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
        z zVar = (z) uVarA;
        a(zVar.h());
        this.f66416t0 = zVar.g();
    }

    private u a(h hVar, int i10) {
        if (hVar.a() > i10) {
            return hVar.a(i10).toASN1Primitive();
        }
        throw new IllegalArgumentException("too few objects in input vector");
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public int c() throws IOException {
        return getEncoded().length;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean d() {
        return true;
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u, com.vasco.digipass.sdk.utils.utilities.obfuscated.o
    public int hashCode() {
        p pVar = this.f66412p0;
        int iHashCode = pVar != null ? pVar.hashCode() : 0;
        m mVar = this.f66413q0;
        if (mVar != null) {
            iHashCode ^= mVar.hashCode();
        }
        u uVar = this.f66414r0;
        if (uVar != null) {
            iHashCode ^= uVar.hashCode();
        }
        return iHashCode ^ this.f66416t0.hashCode();
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public void a(s sVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        p pVar = this.f66412p0;
        if (pVar != null) {
            byteArrayOutputStream.write(pVar.getEncoded(ASN1Encoding.DER));
        }
        m mVar = this.f66413q0;
        if (mVar != null) {
            byteArrayOutputStream.write(mVar.getEncoded(ASN1Encoding.DER));
        }
        u uVar = this.f66414r0;
        if (uVar != null) {
            byteArrayOutputStream.write(uVar.getEncoded(ASN1Encoding.DER));
        }
        byteArrayOutputStream.write(new n1(true, this.f66415s0, this.f66416t0).getEncoded(ASN1Encoding.DER));
        sVar.a(32, 8, byteArrayOutputStream.toByteArray());
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public boolean a(u uVar) {
        u uVar2;
        m mVar;
        p pVar;
        if (!(uVar instanceof w0)) {
            return false;
        }
        if (this == uVar) {
            return true;
        }
        w0 w0Var = (w0) uVar;
        p pVar2 = this.f66412p0;
        if (pVar2 != null && ((pVar = w0Var.f66412p0) == null || !pVar.equals(pVar2))) {
            return false;
        }
        m mVar2 = this.f66413q0;
        if (mVar2 != null && ((mVar = w0Var.f66413q0) == null || !mVar.equals(mVar2))) {
            return false;
        }
        u uVar3 = this.f66414r0;
        if (uVar3 == null || ((uVar2 = w0Var.f66414r0) != null && uVar2.equals(uVar3))) {
            return this.f66416t0.equals(w0Var.f66416t0);
        }
        return false;
    }

    private void a(int i10) {
        if (i10 >= 0 && i10 <= 2) {
            this.f66415s0 = i10;
            return;
        }
        throw new IllegalArgumentException(androidx.appcompat.widget.g0.c("invalid encoding value: ", i10));
    }
}
