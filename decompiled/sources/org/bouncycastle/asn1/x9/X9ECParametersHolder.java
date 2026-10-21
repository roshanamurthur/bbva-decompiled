package org.bouncycastle.asn1.x9;

/* JADX INFO: loaded from: classes12.dex */
public abstract class X9ECParametersHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public X9ECParameters f87841a;

    public abstract X9ECParameters createParameters();

    public synchronized X9ECParameters getParameters() {
        try {
            if (this.f87841a == null) {
                this.f87841a = createParameters();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f87841a;
    }
}
