package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes13.dex */
public abstract class XMSSAddress {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f91306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f91307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f91308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f91309d;

    public static abstract class Builder<T extends Builder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f91310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f91311b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f91312c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f91313d = 0;

        public Builder(int i10) {
            this.f91310a = i10;
        }

        public abstract XMSSAddress build();

        public abstract T getThis();

        public T withKeyAndMask(int i10) {
            this.f91313d = i10;
            return (T) getThis();
        }

        public T withLayerAddress(int i10) {
            this.f91311b = i10;
            return (T) getThis();
        }

        public T withTreeAddress(long j10) {
            this.f91312c = j10;
            return (T) getThis();
        }
    }

    public XMSSAddress(Builder builder) {
        this.f91306a = builder.f91311b;
        this.f91307b = builder.f91312c;
        this.f91308c = builder.f91310a;
        this.f91309d = builder.f91313d;
    }

    public final int getKeyAndMask() {
        return this.f91309d;
    }

    public final int getLayerAddress() {
        return this.f91306a;
    }

    public final long getTreeAddress() {
        return this.f91307b;
    }

    public final int getType() {
        return this.f91308c;
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[32];
        Pack.intToBigEndian(this.f91306a, bArr, 0);
        Pack.longToBigEndian(this.f91307b, bArr, 4);
        Pack.intToBigEndian(this.f91308c, bArr, 12);
        Pack.intToBigEndian(this.f91309d, bArr, 28);
        return bArr;
    }
}
