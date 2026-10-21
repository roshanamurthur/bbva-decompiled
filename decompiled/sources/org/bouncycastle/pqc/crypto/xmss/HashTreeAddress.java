package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes13.dex */
public final class HashTreeAddress extends XMSSAddress {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f91285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f91286f;

    public static class Builder extends XMSSAddress.Builder<Builder> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f91287e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f91288f;

        public Builder() {
            super(2);
            this.f91287e = 0;
            this.f91288f = 0;
        }

        @Override // org.bouncycastle.pqc.crypto.xmss.XMSSAddress.Builder
        public XMSSAddress build() {
            return new HashTreeAddress(this);
        }

        @Override // org.bouncycastle.pqc.crypto.xmss.XMSSAddress.Builder
        public Builder getThis() {
            return this;
        }

        public Builder withTreeHeight(int i10) {
            this.f91287e = i10;
            return this;
        }

        public Builder withTreeIndex(int i10) {
            this.f91288f = i10;
            return this;
        }
    }

    public HashTreeAddress(Builder builder) {
        super(builder);
        this.f91285e = builder.f91287e;
        this.f91286f = builder.f91288f;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSAddress
    public final byte[] toByteArray() {
        byte[] byteArray = super.toByteArray();
        Pack.intToBigEndian(0, byteArray, 16);
        Pack.intToBigEndian(this.f91285e, byteArray, 20);
        Pack.intToBigEndian(this.f91286f, byteArray, 24);
        return byteArray;
    }
}
