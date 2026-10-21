package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes9.dex */
class l3 implements Enumeration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l f66178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f66179b = a();

    public l3(byte[] bArr) {
        this.f66178a = new l(bArr, true);
    }

    private Object a() {
        try {
            return this.f66178a.d();
        } catch (IOException e5) {
            throw new t(ad.e.d("malformed DER construction: ", e5), e5);
        }
    }

    @Override // java.util.Enumeration
    public boolean hasMoreElements() {
        return this.f66179b != null;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        Object obj = this.f66179b;
        this.f66179b = a();
        return obj;
    }
}
