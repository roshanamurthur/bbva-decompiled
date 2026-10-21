package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes13.dex */
public final class LTreeAddress extends XMSSAddress {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f91289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f91290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f91291g;

    public static class Builder extends XMSSAddress.Builder<Builder> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f91292e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f91293f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f91294g;

        public Builder() {
            super(1);
            this.f91292e = 0;
            this.f91293f = 0;
            this.f91294g = 0;
        }

        @Override // org.bouncycastle.pqc.crypto.xmss.XMSSAddress.Builder
        public XMSSAddress build() {
            return new LTreeAddress(this);
        }

        @Override // org.bouncycastle.pqc.crypto.xmss.XMSSAddress.Builder
        public Builder getThis() {
            return this;
        }

        public Builder withLTreeAddress(int i10) {
            this.f91292e = i10;
            return this;
        }

        public Builder withTreeHeight(int i10) {
            this.f91293f = i10;
            return this;
        }

        public Builder withTreeIndex(int i10) {
            this.f91294g = i10;
            return this;
        }
    }

    public LTreeAddress(Builder builder) {
        super(builder);
        this.f91289e = builder.f91292e;
        this.f91290f = builder.f91293f;
        this.f91291g = builder.f91294g;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSAddress
    public final byte[] toByteArray() {
        byte[] byteArray = super.toByteArray();
        Pack.intToBigEndian(this.f91289e, byteArray, 16);
        Pack.intToBigEndian(this.f91290f, byteArray, 20);
        Pack.intToBigEndian(this.f91291g, byteArray, 24);
        return byteArray;
    }
}
