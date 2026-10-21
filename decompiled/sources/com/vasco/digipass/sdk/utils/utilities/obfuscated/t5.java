package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.asn1.x9.X9ECParameters;

/* JADX INFO: loaded from: classes9.dex */
public abstract class t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private X9ECParameters f66380a;

    public abstract X9ECParameters a();

    public synchronized X9ECParameters b() {
        try {
            if (this.f66380a == null) {
                this.f66380a = a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f66380a;
    }
}
