package org.bouncycastle.pqc.crypto.xmss;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import zm.f;

/* JADX INFO: loaded from: classes13.dex */
public class XMSSReducedSignature implements XMSSStoreableObjectInterface {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final XMSSParameters f91406p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final f f91407q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final List<XMSSNode> f91408r0;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final XMSSParameters f91409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f f91410b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<XMSSNode> f91411c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f91412d = null;

        public Builder(XMSSParameters xMSSParameters) {
            this.f91409a = xMSSParameters;
        }

        public XMSSReducedSignature build() {
            return new XMSSReducedSignature(this);
        }

        public Builder withAuthPath(List<XMSSNode> list) {
            this.f91411c = list;
            return this;
        }

        public Builder withReducedSignature(byte[] bArr) {
            this.f91412d = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withWOTSPlusSignature(f fVar) {
            this.f91410b = fVar;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List, java.util.List<org.bouncycastle.pqc.crypto.xmss.XMSSNode>] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.List<org.bouncycastle.pqc.crypto.xmss.XMSSNode>] */
    public XMSSReducedSignature(Builder builder) {
        ?? arrayList;
        XMSSParameters xMSSParameters = builder.f91409a;
        this.f91406p0 = xMSSParameters;
        if (xMSSParameters == null) {
            throw new NullPointerException("params == null");
        }
        int treeDigestSize = xMSSParameters.getTreeDigestSize();
        int i10 = xMSSParameters.a().f91434a.f95107c;
        int height = xMSSParameters.getHeight();
        byte[] bArr = builder.f91412d;
        if (bArr != null) {
            if (bArr.length != (height * treeDigestSize) + (i10 * treeDigestSize)) {
                throw new IllegalArgumentException("signature has wrong size");
            }
            byte[][] bArr2 = new byte[i10][];
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                bArr2[i12] = XMSSUtil.extractBytesAtOffset(bArr, i11, treeDigestSize);
                i11 += treeDigestSize;
            }
            this.f91407q0 = new f(this.f91406p0.a().f91434a, bArr2);
            arrayList = new ArrayList();
            for (int i13 = 0; i13 < height; i13++) {
                arrayList.add(new XMSSNode(i13, XMSSUtil.extractBytesAtOffset(bArr, i11, treeDigestSize)));
                i11 += treeDigestSize;
            }
        } else {
            f fVar = builder.f91410b;
            this.f91407q0 = fVar == null ? new f(xMSSParameters.a().f91434a, (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i10, treeDigestSize)) : fVar;
            arrayList = builder.f91411c;
            if (arrayList == 0) {
                arrayList = new ArrayList();
            } else if (arrayList.size() != height) {
                throw new IllegalArgumentException("size of authPath needs to be equal to height of tree");
            }
        }
        this.f91408r0 = arrayList;
    }

    public List<XMSSNode> getAuthPath() {
        return this.f91408r0;
    }

    public XMSSParameters getParams() {
        return this.f91406p0;
    }

    public f getWOTSPlusSignature() {
        return this.f91407q0;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface
    public byte[] toByteArray() {
        XMSSParameters xMSSParameters = this.f91406p0;
        int treeDigestSize = xMSSParameters.getTreeDigestSize();
        byte[] bArr = new byte[(xMSSParameters.getHeight() * treeDigestSize) + (xMSSParameters.a().f91434a.f95107c * treeDigestSize)];
        int i10 = 0;
        int i11 = 0;
        for (byte[] bArr2 : XMSSUtil.cloneArray(this.f91407q0.f95112a)) {
            XMSSUtil.copyBytesAtOffset(bArr, bArr2, i11);
            i11 += treeDigestSize;
        }
        while (true) {
            List<XMSSNode> list = this.f91408r0;
            if (i10 >= list.size()) {
                return bArr;
            }
            XMSSUtil.copyBytesAtOffset(bArr, list.get(i10).getValue(), i11);
            i11 += treeDigestSize;
            i10++;
        }
    }
}
