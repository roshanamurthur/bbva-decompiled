package org.bouncycastle.pqc.crypto.xmss;

import java.io.IOException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes13.dex */
public final class XMSSPrivateKeyParameters extends XMSSKeyParameters implements XMSSStoreableObjectInterface, Encodable {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final XMSSParameters f91384r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f91385s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f91386t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final byte[] f91387u0;
    public final byte[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public volatile BDS f91388w0;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final XMSSParameters f91389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f91390b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f91391c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f91392d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f91393e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte[] f91394f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f91395g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public BDS f91396h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public byte[] f91397i = null;

        public Builder(XMSSParameters xMSSParameters) {
            this.f91389a = xMSSParameters;
        }

        public XMSSPrivateKeyParameters build() {
            return new XMSSPrivateKeyParameters(this);
        }

        public Builder withBDSState(BDS bds) {
            this.f91396h = bds;
            return this;
        }

        public Builder withIndex(int i10) {
            this.f91390b = i10;
            return this;
        }

        public Builder withMaxIndex(int i10) {
            this.f91391c = i10;
            return this;
        }

        public Builder withPrivateKey(byte[] bArr) {
            this.f91397i = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withPublicSeed(byte[] bArr) {
            this.f91394f = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withRoot(byte[] bArr) {
            this.f91395g = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withSecretKeyPRF(byte[] bArr) {
            this.f91393e = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withSecretKeySeed(byte[] bArr) {
            this.f91392d = XMSSUtil.cloneArray(bArr);
            return this;
        }
    }

    public XMSSPrivateKeyParameters(Builder builder) {
        super(true, builder.f91389a.f91381f);
        XMSSParameters xMSSParameters = builder.f91389a;
        this.f91384r0 = xMSSParameters;
        if (xMSSParameters == null) {
            throw new NullPointerException("params == null");
        }
        int treeDigestSize = xMSSParameters.getTreeDigestSize();
        byte[] bArr = builder.f91397i;
        if (bArr != null) {
            int height = xMSSParameters.getHeight();
            int iBigEndianToInt = Pack.bigEndianToInt(bArr, 0);
            if (!XMSSUtil.isIndexValid(height, iBigEndianToInt)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            this.f91385s0 = XMSSUtil.extractBytesAtOffset(bArr, 4, treeDigestSize);
            int i10 = 4 + treeDigestSize;
            this.f91386t0 = XMSSUtil.extractBytesAtOffset(bArr, i10, treeDigestSize);
            int i11 = i10 + treeDigestSize;
            this.f91387u0 = XMSSUtil.extractBytesAtOffset(bArr, i11, treeDigestSize);
            int i12 = i11 + treeDigestSize;
            this.v0 = XMSSUtil.extractBytesAtOffset(bArr, i12, treeDigestSize);
            int i13 = i12 + treeDigestSize;
            try {
                BDS bds = (BDS) XMSSUtil.deserialize(XMSSUtil.extractBytesAtOffset(bArr, i13, bArr.length - i13), BDS.class);
                if (bds.getIndex() != iBigEndianToInt) {
                    throw new IllegalStateException("serialized BDS has wrong index");
                }
                this.f91388w0 = bds.withWOTSDigest(builder.f91389a.getTreeDigestOID());
                return;
            } catch (IOException e5) {
                throw new IllegalArgumentException(e5.getMessage(), e5);
            } catch (ClassNotFoundException e7) {
                throw new IllegalArgumentException(e7.getMessage(), e7);
            }
        }
        byte[] bArr2 = builder.f91392d;
        if (bArr2 == null) {
            this.f91385s0 = new byte[treeDigestSize];
        } else {
            if (bArr2.length != treeDigestSize) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.f91385s0 = bArr2;
        }
        byte[] bArr3 = builder.f91393e;
        if (bArr3 == null) {
            this.f91386t0 = new byte[treeDigestSize];
        } else {
            if (bArr3.length != treeDigestSize) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.f91386t0 = bArr3;
        }
        byte[] bArr4 = builder.f91394f;
        if (bArr4 == null) {
            this.f91387u0 = new byte[treeDigestSize];
        } else {
            if (bArr4.length != treeDigestSize) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f91387u0 = bArr4;
        }
        byte[] bArr5 = builder.f91395g;
        if (bArr5 == null) {
            this.v0 = new byte[treeDigestSize];
        } else {
            if (bArr5.length != treeDigestSize) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.v0 = bArr5;
        }
        BDS bds2 = builder.f91396h;
        if (bds2 == null) {
            if (builder.f91390b >= (1 << xMSSParameters.getHeight()) - 2 || bArr4 == null || bArr2 == null) {
                bds2 = new BDS(xMSSParameters, (1 << xMSSParameters.getHeight()) - 1, builder.f91390b);
            } else {
                OTSHashAddress oTSHashAddress = (OTSHashAddress) new OTSHashAddress.Builder().build();
                int i14 = builder.f91390b;
                bds2 = new BDS(xMSSParameters.a(), xMSSParameters.getHeight(), xMSSParameters.f91378c, (1 << xMSSParameters.getHeight()) - 1);
                bds2.a(bArr4, bArr2, oTSHashAddress);
                while (bds2.f91276y0 < i14) {
                    bds2.b(bArr4, bArr2, oTSHashAddress);
                    bds2.E0 = false;
                }
            }
        }
        this.f91388w0 = bds2;
        int i15 = builder.f91391c;
        if (i15 >= 0 && i15 != this.f91388w0.getMaxIndex()) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public final void a() {
        synchronized (this) {
            try {
                this.f91388w0 = this.f91388w0.getIndex() < this.f91388w0.getMaxIndex() ? this.f91388w0.getNextState(this.f91387u0, this.f91385s0, (OTSHashAddress) new OTSHashAddress.Builder().build()) : new BDS(this.f91384r0, this.f91388w0.getMaxIndex(), this.f91388w0.getMaxIndex() + 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public XMSSPrivateKeyParameters extractKeyShard(int i10) {
        XMSSPrivateKeyParameters xMSSPrivateKeyParametersBuild;
        if (i10 < 1) {
            throw new IllegalArgumentException("cannot ask for a shard with 0 keys");
        }
        synchronized (this) {
            long j10 = i10;
            try {
                if (j10 > getUsagesRemaining()) {
                    throw new IllegalArgumentException("usageCount exceeds usages remaining");
                }
                xMSSPrivateKeyParametersBuild = new Builder(this.f91384r0).withSecretKeySeed(this.f91385s0).withSecretKeyPRF(this.f91386t0).withPublicSeed(this.f91387u0).withRoot(this.v0).withIndex(getIndex()).withBDSState(this.f91388w0.withMaxIndex((this.f91388w0.getIndex() + i10) - 1, this.f91384r0.getTreeDigestOID())).build();
                if (j10 == getUsagesRemaining()) {
                    this.f91388w0 = new BDS(this.f91384r0, this.f91388w0.getMaxIndex(), getIndex() + i10);
                } else {
                    OTSHashAddress oTSHashAddress = (OTSHashAddress) new OTSHashAddress.Builder().build();
                    for (int i11 = 0; i11 != i10; i11++) {
                        this.f91388w0 = this.f91388w0.getNextState(this.f91387u0, this.f91385s0, oTSHashAddress);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xMSSPrivateKeyParametersBuild;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        byte[] byteArray;
        synchronized (this) {
            byteArray = toByteArray();
        }
        return byteArray;
    }

    public int getIndex() {
        return this.f91388w0.getIndex();
    }

    public XMSSPrivateKeyParameters getNextKey() {
        XMSSPrivateKeyParameters xMSSPrivateKeyParametersExtractKeyShard;
        synchronized (this) {
            xMSSPrivateKeyParametersExtractKeyShard = extractKeyShard(1);
        }
        return xMSSPrivateKeyParametersExtractKeyShard;
    }

    public XMSSParameters getParameters() {
        return this.f91384r0;
    }

    public byte[] getPublicSeed() {
        return XMSSUtil.cloneArray(this.f91387u0);
    }

    public byte[] getRoot() {
        return XMSSUtil.cloneArray(this.v0);
    }

    public byte[] getSecretKeyPRF() {
        return XMSSUtil.cloneArray(this.f91386t0);
    }

    public byte[] getSecretKeySeed() {
        return XMSSUtil.cloneArray(this.f91385s0);
    }

    public long getUsagesRemaining() {
        long maxIndex;
        synchronized (this) {
            maxIndex = (this.f91388w0.getMaxIndex() - getIndex()) + 1;
        }
        return maxIndex;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface
    public byte[] toByteArray() {
        byte[] bArrConcatenate;
        synchronized (this) {
            try {
                int treeDigestSize = this.f91384r0.getTreeDigestSize();
                byte[] bArr = new byte[treeDigestSize + 4 + treeDigestSize + treeDigestSize + treeDigestSize];
                Pack.intToBigEndian(this.f91388w0.getIndex(), bArr, 0);
                XMSSUtil.copyBytesAtOffset(bArr, this.f91385s0, 4);
                int i10 = 4 + treeDigestSize;
                XMSSUtil.copyBytesAtOffset(bArr, this.f91386t0, i10);
                int i11 = i10 + treeDigestSize;
                XMSSUtil.copyBytesAtOffset(bArr, this.f91387u0, i11);
                XMSSUtil.copyBytesAtOffset(bArr, this.v0, i11 + treeDigestSize);
                try {
                    bArrConcatenate = Arrays.concatenate(bArr, XMSSUtil.serialize(this.f91388w0));
                } catch (IOException e5) {
                    throw new RuntimeException("error serializing bds state: " + e5.getMessage());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArrConcatenate;
    }
}
