package org.bouncycastle.pqc.crypto.xmss;

import java.util.ArrayList;
import zm.e;
import zm.f;

/* JADX INFO: loaded from: classes13.dex */
public final class d {
    public static XMSSNode a(b bVar, int i10, byte[] bArr, XMSSReducedSignature xMSSReducedSignature, OTSHashAddress oTSHashAddress, int i11) {
        HashTreeAddress hashTreeAddress;
        OTSHashAddress oTSHashAddress2 = oTSHashAddress;
        if (bArr.length != bVar.f91434a.f95105a) {
            throw new IllegalArgumentException("size of messageDigest needs to be equal to size of digest");
        }
        if (xMSSReducedSignature == null) {
            throw new NullPointerException("signature == null");
        }
        if (oTSHashAddress2 == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        LTreeAddress.Builder builderWithTreeAddress = new LTreeAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress());
        int i12 = oTSHashAddress2.f91295e;
        LTreeAddress lTreeAddress = (LTreeAddress) builderWithTreeAddress.withLTreeAddress(i12).build();
        HashTreeAddress hashTreeAddress2 = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withTreeIndex(i12).build();
        f wOTSPlusSignature = xMSSReducedSignature.getWOTSPlusSignature();
        int length = bArr.length;
        zm.d dVar = bVar.f91434a;
        if (length != dVar.f95105a) {
            throw new IllegalArgumentException("size of messageDigest needs to be equal to size of digest");
        }
        if (wOTSPlusSignature == null) {
            throw new NullPointerException("signature == null");
        }
        int i13 = dVar.f95106b;
        int i14 = dVar.f95108d;
        ArrayList arrayListB = b.b(i13, i14, bArr);
        int iIntValue = 0;
        for (int i15 = 0; i15 < i14; i15++) {
            iIntValue += (i13 - 1) - ((Integer) arrayListB.get(i15)).intValue();
        }
        int iLog2 = XMSSUtil.log2(i13);
        int i16 = dVar.f95109e;
        arrayListB.addAll(b.b(i13, i16, XMSSUtil.toBytesBigEndian(iIntValue << (8 - ((iLog2 * i16) % 8)), (int) Math.ceil(((double) (XMSSUtil.log2(i13) * i16)) / 8.0d))));
        int i17 = dVar.f95107c;
        byte[][] bArr2 = new byte[i17][];
        for (int i18 = 0; i18 < i17; i18++) {
            oTSHashAddress2 = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress2.getLayerAddress()).withTreeAddress(oTSHashAddress2.getTreeAddress()).withOTSAddress(oTSHashAddress2.f91295e).withChainAddress(i18).withHashAddress(oTSHashAddress2.f91297g).withKeyAndMask(oTSHashAddress2.getKeyAndMask()).build();
            bArr2[i18] = bVar.a(XMSSUtil.cloneArray(wOTSPlusSignature.f95112a)[i18], ((Integer) arrayListB.get(i18)).intValue(), (i13 - 1) - ((Integer) arrayListB.get(i18)).intValue(), oTSHashAddress2);
        }
        XMSSNode[] xMSSNodeArr = new XMSSNode[2];
        xMSSNodeArr[0] = c.a(bVar, new e(dVar, bArr2), lTreeAddress);
        for (int i19 = 0; i19 < i10; i19++) {
            HashTreeAddress hashTreeAddress3 = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress2.getLayerAddress()).withTreeAddress(hashTreeAddress2.getTreeAddress()).withTreeHeight(i19).withTreeIndex(hashTreeAddress2.f91286f).withKeyAndMask(hashTreeAddress2.getKeyAndMask()).build();
            if (Math.floor(i11 / (1 << i19)) % 2.0d == 0.0d) {
                hashTreeAddress = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress3.getLayerAddress()).withTreeAddress(hashTreeAddress3.getTreeAddress()).withTreeHeight(hashTreeAddress3.f91285e).withTreeIndex(hashTreeAddress3.f91286f / 2).withKeyAndMask(hashTreeAddress3.getKeyAndMask()).build();
                XMSSNode xMSSNodeB = c.b(bVar, xMSSNodeArr[0], xMSSReducedSignature.getAuthPath().get(i19), hashTreeAddress);
                xMSSNodeArr[1] = xMSSNodeB;
                xMSSNodeArr[1] = new XMSSNode(xMSSNodeB.getHeight() + 1, xMSSNodeArr[1].getValue());
            } else {
                hashTreeAddress = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress3.getLayerAddress()).withTreeAddress(hashTreeAddress3.getTreeAddress()).withTreeHeight(hashTreeAddress3.f91285e).withTreeIndex((hashTreeAddress3.f91286f - 1) / 2).withKeyAndMask(hashTreeAddress3.getKeyAndMask()).build();
                XMSSNode xMSSNodeB2 = c.b(bVar, xMSSReducedSignature.getAuthPath().get(i19), xMSSNodeArr[0], hashTreeAddress);
                xMSSNodeArr[1] = xMSSNodeB2;
                xMSSNodeArr[1] = new XMSSNode(xMSSNodeB2.getHeight() + 1, xMSSNodeArr[1].getValue());
            }
            hashTreeAddress2 = hashTreeAddress;
            xMSSNodeArr[0] = xMSSNodeArr[1];
        }
        return xMSSNodeArr[0];
    }
}
