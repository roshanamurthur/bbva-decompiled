package org.bouncycastle.crypto.ec;

import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes2.dex */
public class ECPair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ECPoint f88240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ECPoint f88241b;

    public ECPair(ECPoint eCPoint, ECPoint eCPoint2) {
        this.f88240a = eCPoint;
        this.f88241b = eCPoint2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ECPair) {
            return equals((ECPair) obj);
        }
        return false;
    }

    public ECPoint getX() {
        return this.f88240a;
    }

    public ECPoint getY() {
        return this.f88241b;
    }

    public int hashCode() {
        return (this.f88241b.hashCode() * 37) + this.f88240a.hashCode();
    }

    public boolean equals(ECPair eCPair) {
        return eCPair.getX().equals(getX()) && eCPair.getY().equals(getY());
    }
}
