package com.bbva.sl.ar.core.libmcrypt.impl;

import com.bbva.sl.ar.core.libmcrypt.exception.LibMCryptException;
import com.bbva.sl.ar.core.libmcrypt.tools.VarTools;

/* JADX INFO: loaded from: classes8.dex */
public class HostDataByte {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f36618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f36619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f36620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f36621d;

    public HostDataByte(String str) throws LibMCryptException {
        a aVar = new a(str);
        this.f36618a = VarTools.hexStr2Bytes(aVar.a());
        this.f36619b = VarTools.hexStr2Bytes(aVar.b());
        this.f36620c = VarTools.hexStr2Bytes(aVar.c());
        this.f36621d = VarTools.hexStr2Bytes(aVar.d());
    }

    public byte[] getIndice() {
        return this.f36618a;
    }

    public byte[] getSegmento1() {
        return this.f36620c;
    }

    public byte[] getSegmento2() {
        return this.f36621d;
    }

    public byte[] getVersion() {
        return this.f36619b;
    }

    public void setIndice(byte[] bArr) {
        this.f36618a = bArr;
    }

    public void setSegmento1(byte[] bArr) {
        this.f36620c = bArr;
    }

    public void setSegmento2(byte[] bArr) {
        this.f36621d = bArr;
    }

    public void setVersion(byte[] bArr) {
        this.f36619b = bArr;
    }
}
