package org.bouncycastle.pqc.crypto.xmss;

import java.io.IOException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Encodable;

/* JADX INFO: loaded from: classes13.dex */
public final class XMSSMTPrivateKeyParameters extends XMSSMTKeyParameters implements XMSSStoreableObjectInterface, Encodable {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final XMSSMTParameters f91333r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f91334s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f91335t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final byte[] f91336u0;
    public final byte[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public volatile long f91337w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public volatile BDSStateMap f91338x0;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final XMSSMTParameters f91339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f91340b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f91341c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f91342d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f91343e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte[] f91344f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f91345g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public BDSStateMap f91346h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public byte[] f91347i = null;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public XMSSParameters f91348j = null;

        public Builder(XMSSMTParameters xMSSMTParameters) {
            this.f91339a = xMSSMTParameters;
        }

        public XMSSMTPrivateKeyParameters build() {
            return new XMSSMTPrivateKeyParameters(this);
        }

        public Builder withBDSState(BDSStateMap bDSStateMap) {
            if (bDSStateMap.getMaxIndex() == 0) {
                this.f91346h = new BDSStateMap(bDSStateMap, (1 << this.f91339a.getHeight()) - 1);
            } else {
                this.f91346h = bDSStateMap;
            }
            return this;
        }

        public Builder withIndex(long j10) {
            this.f91340b = j10;
            return this;
        }

        public Builder withMaxIndex(long j10) {
            this.f91341c = j10;
            return this;
        }

        public Builder withPrivateKey(byte[] bArr) {
            this.f91347i = XMSSUtil.cloneArray(bArr);
            this.f91348j = this.f91339a.getXMSSParameters();
            return this;
        }

        public Builder withPublicSeed(byte[] bArr) {
            this.f91344f = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withRoot(byte[] bArr) {
            this.f91345g = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withSecretKeyPRF(byte[] bArr) {
            this.f91343e = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withSecretKeySeed(byte[] bArr) {
            this.f91342d = XMSSUtil.cloneArray(bArr);
            return this;
        }
    }

    public XMSSMTPrivateKeyParameters(Builder builder) {
        super(true, builder.f91339a.getTreeDigest());
        XMSSMTParameters xMSSMTParameters = builder.f91339a;
        this.f91333r0 = xMSSMTParameters;
        if (xMSSMTParameters == null) {
            throw new NullPointerException("params == null");
        }
        int treeDigestSize = xMSSMTParameters.getTreeDigestSize();
        byte[] bArr = builder.f91347i;
        if (bArr != null) {
            if (builder.f91348j == null) {
                throw new NullPointerException("xmss == null");
            }
            int height = xMSSMTParameters.getHeight();
            int i10 = (height + 7) / 8;
            this.f91337w0 = XMSSUtil.bytesToXBigEndian(bArr, 0, i10);
            if (!XMSSUtil.isIndexValid(height, this.f91337w0)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            this.f91334s0 = XMSSUtil.extractBytesAtOffset(bArr, i10, treeDigestSize);
            int i11 = i10 + treeDigestSize;
            this.f91335t0 = XMSSUtil.extractBytesAtOffset(bArr, i11, treeDigestSize);
            int i12 = i11 + treeDigestSize;
            this.f91336u0 = XMSSUtil.extractBytesAtOffset(bArr, i12, treeDigestSize);
            int i13 = i12 + treeDigestSize;
            this.v0 = XMSSUtil.extractBytesAtOffset(bArr, i13, treeDigestSize);
            int i14 = i13 + treeDigestSize;
            try {
                this.f91338x0 = ((BDSStateMap) XMSSUtil.deserialize(XMSSUtil.extractBytesAtOffset(bArr, i14, bArr.length - i14), BDSStateMap.class)).withWOTSDigest(builder.f91348j.getTreeDigestOID());
                return;
            } catch (IOException e5) {
                throw new IllegalArgumentException(e5.getMessage(), e5);
            } catch (ClassNotFoundException e7) {
                throw new IllegalArgumentException(e7.getMessage(), e7);
            }
        }
        this.f91337w0 = builder.f91340b;
        byte[] bArr2 = builder.f91342d;
        if (bArr2 == null) {
            this.f91334s0 = new byte[treeDigestSize];
        } else {
            if (bArr2.length != treeDigestSize) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.f91334s0 = bArr2;
        }
        byte[] bArr3 = builder.f91343e;
        if (bArr3 == null) {
            this.f91335t0 = new byte[treeDigestSize];
        } else {
            if (bArr3.length != treeDigestSize) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.f91335t0 = bArr3;
        }
        byte[] bArr4 = builder.f91344f;
        if (bArr4 == null) {
            this.f91336u0 = new byte[treeDigestSize];
        } else {
            if (bArr4.length != treeDigestSize) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f91336u0 = bArr4;
        }
        byte[] bArr5 = builder.f91345g;
        if (bArr5 == null) {
            this.v0 = new byte[treeDigestSize];
        } else {
            if (bArr5.length != treeDigestSize) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.v0 = bArr5;
        }
        BDSStateMap bDSStateMap = builder.f91346h;
        if (bDSStateMap == null) {
            bDSStateMap = (!XMSSUtil.isIndexValid(xMSSMTParameters.getHeight(), builder.f91340b) || bArr4 == null || bArr2 == null) ? new BDSStateMap(builder.f91341c + 1) : new BDSStateMap(xMSSMTParameters, builder.f91340b, bArr4, bArr2);
        }
        this.f91338x0 = bDSStateMap;
        long j10 = builder.f91341c;
        if (j10 >= 0 && j10 != this.f91338x0.getMaxIndex()) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public final void a() {
        synchronized (this) {
            try {
                if (getIndex() < this.f91338x0.getMaxIndex()) {
                    this.f91338x0.b(this.f91333r0, this.f91337w0, this.f91336u0, this.f91334s0);
                    this.f91337w0++;
                } else {
                    this.f91337w0 = this.f91338x0.getMaxIndex() + 1;
                    this.f91338x0 = new BDSStateMap(this.f91338x0.getMaxIndex());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public XMSSMTPrivateKeyParameters extractKeyShard(int i10) {
        XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParametersBuild;
        if (i10 < 1) {
            throw new IllegalArgumentException("cannot ask for a shard with 0 keys");
        }
        synchronized (this) {
            long j10 = i10;
            try {
                if (j10 > getUsagesRemaining()) {
                    throw new IllegalArgumentException("usageCount exceeds usages remaining");
                }
                xMSSMTPrivateKeyParametersBuild = new Builder(this.f91333r0).withSecretKeySeed(this.f91334s0).withSecretKeyPRF(this.f91335t0).withPublicSeed(this.f91336u0).withRoot(this.v0).withIndex(getIndex()).withBDSState(new BDSStateMap(this.f91338x0, (getIndex() + j10) - 1)).build();
                for (int i11 = 0; i11 != i10; i11++) {
                    a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xMSSMTPrivateKeyParametersBuild;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        byte[] byteArray;
        synchronized (this) {
            byteArray = toByteArray();
        }
        return byteArray;
    }

    public long getIndex() {
        return this.f91337w0;
    }

    public XMSSMTPrivateKeyParameters getNextKey() {
        XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParametersExtractKeyShard;
        synchronized (this) {
            xMSSMTPrivateKeyParametersExtractKeyShard = extractKeyShard(1);
        }
        return xMSSMTPrivateKeyParametersExtractKeyShard;
    }

    public XMSSMTParameters getParameters() {
        return this.f91333r0;
    }

    public byte[] getPublicSeed() {
        return XMSSUtil.cloneArray(this.f91336u0);
    }

    public byte[] getRoot() {
        return XMSSUtil.cloneArray(this.v0);
    }

    public byte[] getSecretKeyPRF() {
        return XMSSUtil.cloneArray(this.f91335t0);
    }

    public byte[] getSecretKeySeed() {
        return XMSSUtil.cloneArray(this.f91334s0);
    }

    public long getUsagesRemaining() {
        long maxIndex;
        synchronized (this) {
            maxIndex = (this.f91338x0.getMaxIndex() - getIndex()) + 1;
        }
        return maxIndex;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface
    public byte[] toByteArray() {
        byte[] bArrConcatenate;
        synchronized (this) {
            try {
                int treeDigestSize = this.f91333r0.getTreeDigestSize();
                int height = (this.f91333r0.getHeight() + 7) / 8;
                byte[] bArr = new byte[height + treeDigestSize + treeDigestSize + treeDigestSize + treeDigestSize];
                XMSSUtil.copyBytesAtOffset(bArr, XMSSUtil.toBytesBigEndian(this.f91337w0, height), 0);
                XMSSUtil.copyBytesAtOffset(bArr, this.f91334s0, height);
                int i10 = height + treeDigestSize;
                XMSSUtil.copyBytesAtOffset(bArr, this.f91335t0, i10);
                int i11 = i10 + treeDigestSize;
                XMSSUtil.copyBytesAtOffset(bArr, this.f91336u0, i11);
                XMSSUtil.copyBytesAtOffset(bArr, this.v0, i11 + treeDigestSize);
                try {
                    bArrConcatenate = Arrays.concatenate(bArr, XMSSUtil.serialize(this.f91338x0));
                } catch (IOException e5) {
                    throw new IllegalStateException("error serializing bds state: " + e5.getMessage(), e5);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArrConcatenate;
    }
}
