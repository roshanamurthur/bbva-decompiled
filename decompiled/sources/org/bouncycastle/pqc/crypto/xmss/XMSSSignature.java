package org.bouncycastle.pqc.crypto.xmss;

import java.io.IOException;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes13.dex */
public final class XMSSSignature extends XMSSReducedSignature implements Encodable {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f91413s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f91414t0;

    public static class Builder extends XMSSReducedSignature.Builder {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final XMSSParameters f91415e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f91416f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f91417g;

        public Builder(XMSSParameters xMSSParameters) {
            super(xMSSParameters);
            this.f91416f = 0;
            this.f91417g = null;
            this.f91415e = xMSSParameters;
        }

        public Builder withIndex(int i10) {
            this.f91416f = i10;
            return this;
        }

        public Builder withRandom(byte[] bArr) {
            this.f91417g = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withSignature(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("signature == null");
            }
            XMSSParameters xMSSParameters = this.f91415e;
            int treeDigestSize = xMSSParameters.getTreeDigestSize();
            int i10 = xMSSParameters.a().f91434a.f95107c;
            int height = xMSSParameters.getHeight() * treeDigestSize;
            this.f91416f = Pack.bigEndianToInt(bArr, 0);
            this.f91417g = XMSSUtil.extractBytesAtOffset(bArr, 4, treeDigestSize);
            withReducedSignature(XMSSUtil.extractBytesAtOffset(bArr, 4 + treeDigestSize, (i10 * treeDigestSize) + height));
            return this;
        }

        @Override // org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature.Builder
        public XMSSSignature build() {
            return new XMSSSignature(this);
        }
    }

    public XMSSSignature(Builder builder) {
        super(builder);
        this.f91413s0 = builder.f91416f;
        int treeDigestSize = getParams().getTreeDigestSize();
        byte[] bArr = builder.f91417g;
        if (bArr == null) {
            this.f91414t0 = new byte[treeDigestSize];
        } else {
            if (bArr.length != treeDigestSize) {
                throw new IllegalArgumentException("size of random needs to be equal to size of digest");
            }
            this.f91414t0 = bArr;
        }
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return toByteArray();
    }

    public int getIndex() {
        return this.f91413s0;
    }

    public byte[] getRandom() {
        return XMSSUtil.cloneArray(this.f91414t0);
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature, org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface
    public byte[] toByteArray() {
        int treeDigestSize = getParams().getTreeDigestSize();
        byte[] bArr = new byte[androidx.appcompat.widget.c.a(treeDigestSize, 4, getParams().a().f91434a.f95107c * treeDigestSize, getParams().getHeight() * treeDigestSize)];
        Pack.intToBigEndian(this.f91413s0, bArr, 0);
        XMSSUtil.copyBytesAtOffset(bArr, this.f91414t0, 4);
        int i10 = 4 + treeDigestSize;
        for (byte[] bArr2 : XMSSUtil.cloneArray(getWOTSPlusSignature().f95112a)) {
            XMSSUtil.copyBytesAtOffset(bArr, bArr2, i10);
            i10 += treeDigestSize;
        }
        for (int i11 = 0; i11 < getAuthPath().size(); i11++) {
            XMSSUtil.copyBytesAtOffset(bArr, getAuthPath().get(i11).getValue(), i10);
            i10 += treeDigestSize;
        }
        return bArr;
    }
}
