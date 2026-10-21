package org.bouncycastle.pqc.crypto.xmss;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Encodable;

/* JADX INFO: loaded from: classes13.dex */
public final class XMSSMTSignature implements XMSSStoreableObjectInterface, Encodable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final XMSSMTParameters f91357p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f91358q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f91359r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final List<XMSSReducedSignature> f91360s0;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final XMSSMTParameters f91361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f91362b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f91363c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List<XMSSReducedSignature> f91364d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f91365e = null;

        public Builder(XMSSMTParameters xMSSMTParameters) {
            this.f91361a = xMSSMTParameters;
        }

        public XMSSMTSignature build() {
            return new XMSSMTSignature(this);
        }

        public Builder withIndex(long j10) {
            this.f91362b = j10;
            return this;
        }

        public Builder withRandom(byte[] bArr) {
            this.f91363c = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withReducedSignatures(List<XMSSReducedSignature> list) {
            this.f91364d = list;
            return this;
        }

        public Builder withSignature(byte[] bArr) {
            this.f91365e = Arrays.clone(bArr);
            return this;
        }
    }

    public XMSSMTSignature(Builder builder) {
        XMSSMTParameters xMSSMTParameters = builder.f91361a;
        this.f91357p0 = xMSSMTParameters;
        if (xMSSMTParameters == null) {
            throw new NullPointerException("params == null");
        }
        int treeDigestSize = xMSSMTParameters.getTreeDigestSize();
        byte[] bArr = builder.f91365e;
        if (bArr == null) {
            this.f91358q0 = builder.f91362b;
            byte[] bArr2 = builder.f91363c;
            if (bArr2 == null) {
                this.f91359r0 = new byte[treeDigestSize];
            } else {
                if (bArr2.length != treeDigestSize) {
                    throw new IllegalArgumentException("size of random needs to be equal to size of digest");
                }
                this.f91359r0 = bArr2;
            }
            List<XMSSReducedSignature> list = builder.f91364d;
            this.f91360s0 = list == null ? new ArrayList<>() : list;
            return;
        }
        int i10 = xMSSMTParameters.getWOTSPlus().f91434a.f95107c;
        int iCeil = (int) Math.ceil(((double) xMSSMTParameters.getHeight()) / 8.0d);
        int height = ((xMSSMTParameters.getHeight() / xMSSMTParameters.getLayers()) + i10) * treeDigestSize;
        int i11 = iCeil + treeDigestSize;
        if (bArr.length != (xMSSMTParameters.getLayers() * height) + i11) {
            throw new IllegalArgumentException("signature has wrong size");
        }
        long jBytesToXBigEndian = XMSSUtil.bytesToXBigEndian(bArr, 0, iCeil);
        this.f91358q0 = jBytesToXBigEndian;
        if (!XMSSUtil.isIndexValid(xMSSMTParameters.getHeight(), jBytesToXBigEndian)) {
            throw new IllegalArgumentException("index out of bounds");
        }
        this.f91359r0 = XMSSUtil.extractBytesAtOffset(bArr, iCeil, treeDigestSize);
        this.f91360s0 = new ArrayList();
        while (i11 < bArr.length) {
            this.f91360s0.add(new XMSSReducedSignature.Builder(this.f91357p0.getXMSSParameters()).withReducedSignature(XMSSUtil.extractBytesAtOffset(bArr, i11, height)).build());
            i11 += height;
        }
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return toByteArray();
    }

    public long getIndex() {
        return this.f91358q0;
    }

    public byte[] getRandom() {
        return XMSSUtil.cloneArray(this.f91359r0);
    }

    public List<XMSSReducedSignature> getReducedSignatures() {
        return this.f91360s0;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface
    public byte[] toByteArray() {
        XMSSMTParameters xMSSMTParameters = this.f91357p0;
        int treeDigestSize = xMSSMTParameters.getTreeDigestSize();
        int i10 = xMSSMTParameters.getWOTSPlus().f91434a.f95107c;
        int iCeil = (int) Math.ceil(((double) xMSSMTParameters.getHeight()) / 8.0d);
        int height = ((xMSSMTParameters.getHeight() / xMSSMTParameters.getLayers()) + i10) * treeDigestSize;
        byte[] bArr = new byte[iCeil + treeDigestSize + (xMSSMTParameters.getLayers() * height)];
        XMSSUtil.copyBytesAtOffset(bArr, XMSSUtil.toBytesBigEndian(this.f91358q0, iCeil), 0);
        XMSSUtil.copyBytesAtOffset(bArr, this.f91359r0, iCeil);
        int i11 = iCeil + treeDigestSize;
        Iterator<XMSSReducedSignature> it = this.f91360s0.iterator();
        while (it.hasNext()) {
            XMSSUtil.copyBytesAtOffset(bArr, it.next().toByteArray(), i11);
            i11 += height;
        }
        return bArr;
    }
}
