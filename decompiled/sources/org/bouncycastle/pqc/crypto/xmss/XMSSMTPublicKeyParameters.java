package org.bouncycastle.pqc.crypto.xmss;

import java.io.IOException;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes13.dex */
public final class XMSSMTPublicKeyParameters extends XMSSMTKeyParameters implements XMSSStoreableObjectInterface, Encodable {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final XMSSMTParameters f91349r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f91350s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f91351t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final byte[] f91352u0;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final XMSSMTParameters f91353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f91354b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f91355c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f91356d = null;

        public Builder(XMSSMTParameters xMSSMTParameters) {
            this.f91353a = xMSSMTParameters;
        }

        public XMSSMTPublicKeyParameters build() {
            return new XMSSMTPublicKeyParameters(this);
        }

        public Builder withPublicKey(byte[] bArr) {
            this.f91356d = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withPublicSeed(byte[] bArr) {
            this.f91355c = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withRoot(byte[] bArr) {
            this.f91354b = XMSSUtil.cloneArray(bArr);
            return this;
        }
    }

    public XMSSMTPublicKeyParameters(Builder builder) {
        super(false, builder.f91353a.getTreeDigest());
        XMSSMTParameters xMSSMTParameters = builder.f91353a;
        this.f91349r0 = xMSSMTParameters;
        if (xMSSMTParameters == null) {
            throw new NullPointerException("params == null");
        }
        int treeDigestSize = xMSSMTParameters.getTreeDigestSize();
        byte[] bArr = builder.f91356d;
        if (bArr != null) {
            if (bArr.length == treeDigestSize + treeDigestSize) {
                this.f91350s0 = 0;
                this.f91351t0 = XMSSUtil.extractBytesAtOffset(bArr, 0, treeDigestSize);
                this.f91352u0 = XMSSUtil.extractBytesAtOffset(bArr, treeDigestSize, treeDigestSize);
                return;
            } else {
                int i10 = treeDigestSize + 4;
                if (bArr.length != i10 + treeDigestSize) {
                    throw new IllegalArgumentException("public key has wrong size");
                }
                this.f91350s0 = Pack.bigEndianToInt(bArr, 0);
                this.f91351t0 = XMSSUtil.extractBytesAtOffset(bArr, 4, treeDigestSize);
                this.f91352u0 = XMSSUtil.extractBytesAtOffset(bArr, i10, treeDigestSize);
                return;
            }
        }
        if (xMSSMTParameters.getOid() != null) {
            this.f91350s0 = xMSSMTParameters.getOid().getOid();
        } else {
            this.f91350s0 = 0;
        }
        byte[] bArr2 = builder.f91354b;
        if (bArr2 == null) {
            this.f91351t0 = new byte[treeDigestSize];
        } else {
            if (bArr2.length != treeDigestSize) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.f91351t0 = bArr2;
        }
        byte[] bArr3 = builder.f91355c;
        if (bArr3 == null) {
            this.f91352u0 = new byte[treeDigestSize];
        } else {
            if (bArr3.length != treeDigestSize) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.f91352u0 = bArr3;
        }
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return toByteArray();
    }

    public XMSSMTParameters getParameters() {
        return this.f91349r0;
    }

    public byte[] getPublicSeed() {
        return XMSSUtil.cloneArray(this.f91352u0);
    }

    public byte[] getRoot() {
        return XMSSUtil.cloneArray(this.f91351t0);
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface
    public byte[] toByteArray() {
        byte[] bArr;
        int treeDigestSize = this.f91349r0.getTreeDigestSize();
        int i10 = 0;
        int i11 = this.f91350s0;
        if (i11 != 0) {
            bArr = new byte[treeDigestSize + 4 + treeDigestSize];
            Pack.intToBigEndian(i11, bArr, 0);
            i10 = 4;
        } else {
            bArr = new byte[treeDigestSize + treeDigestSize];
        }
        XMSSUtil.copyBytesAtOffset(bArr, this.f91351t0, i10);
        XMSSUtil.copyBytesAtOffset(bArr, this.f91352u0, i10 + treeDigestSize);
        return bArr;
    }
}
