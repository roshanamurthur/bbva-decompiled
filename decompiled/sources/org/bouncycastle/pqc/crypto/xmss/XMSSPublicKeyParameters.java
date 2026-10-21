package org.bouncycastle.pqc.crypto.xmss;

import java.io.IOException;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes13.dex */
public final class XMSSPublicKeyParameters extends XMSSKeyParameters implements XMSSStoreableObjectInterface, Encodable {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final XMSSParameters f91398r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f91399s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f91400t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final byte[] f91401u0;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final XMSSParameters f91402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f91403b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f91404c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f91405d = null;

        public Builder(XMSSParameters xMSSParameters) {
            this.f91402a = xMSSParameters;
        }

        public XMSSPublicKeyParameters build() {
            return new XMSSPublicKeyParameters(this);
        }

        public Builder withPublicKey(byte[] bArr) {
            this.f91405d = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withPublicSeed(byte[] bArr) {
            this.f91404c = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withRoot(byte[] bArr) {
            this.f91403b = XMSSUtil.cloneArray(bArr);
            return this;
        }
    }

    public XMSSPublicKeyParameters(Builder builder) {
        super(false, builder.f91402a.f91381f);
        XMSSParameters xMSSParameters = builder.f91402a;
        this.f91398r0 = xMSSParameters;
        if (xMSSParameters == null) {
            throw new NullPointerException("params == null");
        }
        int treeDigestSize = xMSSParameters.getTreeDigestSize();
        byte[] bArr = builder.f91405d;
        if (bArr == null) {
            DefaultXMSSOid defaultXMSSOid = xMSSParameters.f91376a;
            if (defaultXMSSOid != null) {
                this.f91399s0 = defaultXMSSOid.getOid();
            } else {
                this.f91399s0 = 0;
            }
            byte[] bArr2 = builder.f91403b;
            if (bArr2 == null) {
                this.f91400t0 = new byte[treeDigestSize];
            } else {
                if (bArr2.length != treeDigestSize) {
                    throw new IllegalArgumentException("length of root must be equal to length of digest");
                }
                this.f91400t0 = bArr2;
            }
            byte[] bArr3 = builder.f91404c;
            if (bArr3 == null) {
                this.f91401u0 = new byte[treeDigestSize];
                return;
            } else {
                if (bArr3.length != treeDigestSize) {
                    throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
                }
                this.f91401u0 = bArr3;
                return;
            }
        }
        if (bArr.length == treeDigestSize + treeDigestSize) {
            this.f91399s0 = 0;
            this.f91400t0 = XMSSUtil.extractBytesAtOffset(bArr, 0, treeDigestSize);
            this.f91401u0 = XMSSUtil.extractBytesAtOffset(bArr, treeDigestSize, treeDigestSize);
            return;
        }
        int i10 = treeDigestSize + 4;
        int i11 = i10 + treeDigestSize;
        if (bArr.length == i11) {
            this.f91399s0 = Pack.bigEndianToInt(bArr, 0);
            this.f91400t0 = XMSSUtil.extractBytesAtOffset(bArr, 4, treeDigestSize);
            this.f91401u0 = XMSSUtil.extractBytesAtOffset(bArr, i10, treeDigestSize);
        } else {
            System.err.println(bArr.length + " " + i11);
            throw new IllegalArgumentException("public key has wrong size");
        }
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return toByteArray();
    }

    public XMSSParameters getParameters() {
        return this.f91398r0;
    }

    public byte[] getPublicSeed() {
        return XMSSUtil.cloneArray(this.f91401u0);
    }

    public byte[] getRoot() {
        return XMSSUtil.cloneArray(this.f91400t0);
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface
    public byte[] toByteArray() {
        byte[] bArr;
        int treeDigestSize = this.f91398r0.getTreeDigestSize();
        int i10 = 0;
        int i11 = this.f91399s0;
        if (i11 != 0) {
            bArr = new byte[treeDigestSize + 4 + treeDigestSize];
            Pack.intToBigEndian(i11, bArr, 0);
            i10 = 4;
        } else {
            bArr = new byte[treeDigestSize + treeDigestSize];
        }
        XMSSUtil.copyBytesAtOffset(bArr, this.f91400t0, i10);
        XMSSUtil.copyBytesAtOffset(bArr, this.f91401u0, i10 + treeDigestSize);
        return bArr;
    }
}
