package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes13.dex */
public final class OTSHashAddress extends XMSSAddress {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f91295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f91296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f91297g;

    public static class Builder extends XMSSAddress.Builder<Builder> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f91298e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f91299f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f91300g;

        public Builder() {
            super(0);
            this.f91298e = 0;
            this.f91299f = 0;
            this.f91300g = 0;
        }

        @Override // org.bouncycastle.pqc.crypto.xmss.XMSSAddress.Builder
        public XMSSAddress build() {
            return new OTSHashAddress(this);
        }

        @Override // org.bouncycastle.pqc.crypto.xmss.XMSSAddress.Builder
        public Builder getThis() {
            return this;
        }

        public Builder withChainAddress(int i10) {
            this.f91299f = i10;
            return this;
        }

        public Builder withHashAddress(int i10) {
            this.f91300g = i10;
            return this;
        }

        public Builder withOTSAddress(int i10) {
            this.f91298e = i10;
            return this;
        }
    }

    public OTSHashAddress(Builder builder) {
        super(builder);
        this.f91295e = builder.f91298e;
        this.f91296f = builder.f91299f;
        this.f91297g = builder.f91300g;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSAddress
    public final byte[] toByteArray() {
        byte[] byteArray = super.toByteArray();
        Pack.intToBigEndian(this.f91295e, byteArray, 16);
        Pack.intToBigEndian(this.f91296f, byteArray, 20);
        Pack.intToBigEndian(this.f91297g, byteArray, 24);
        return byteArray;
    }
}
