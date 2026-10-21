package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.util.Arrays;
import zm.e;

/* JADX INFO: loaded from: classes13.dex */
public final class c {
    public static XMSSNode a(b bVar, e eVar, LTreeAddress lTreeAddress) {
        double d2;
        if (lTreeAddress == null) {
            throw new NullPointerException("address == null");
        }
        int iCeil = bVar.f91434a.f95107c;
        byte[][] bArrCloneArray = XMSSUtil.cloneArray(eVar.f95111a);
        XMSSNode[] xMSSNodeArr = new XMSSNode[bArrCloneArray.length];
        for (int i10 = 0; i10 < bArrCloneArray.length; i10++) {
            xMSSNodeArr[i10] = new XMSSNode(0, bArrCloneArray[i10]);
        }
        LTreeAddress.Builder builderWithKeyAndMask = new LTreeAddress.Builder().withLayerAddress(lTreeAddress.getLayerAddress()).withTreeAddress(lTreeAddress.getTreeAddress()).withLTreeAddress(lTreeAddress.f91289e).withTreeHeight(0).withTreeIndex(lTreeAddress.f91291g).withKeyAndMask(lTreeAddress.getKeyAndMask());
        while (true) {
            LTreeAddress lTreeAddress2 = (LTreeAddress) builderWithKeyAndMask.build();
            if (iCeil <= 1) {
                return xMSSNodeArr[0];
            }
            int i11 = 0;
            while (true) {
                d2 = iCeil / 2;
                if (i11 >= ((int) Math.floor(d2))) {
                    break;
                }
                lTreeAddress2 = (LTreeAddress) new LTreeAddress.Builder().withLayerAddress(lTreeAddress2.getLayerAddress()).withTreeAddress(lTreeAddress2.getTreeAddress()).withLTreeAddress(lTreeAddress2.f91289e).withTreeHeight(lTreeAddress2.f91290f).withTreeIndex(i11).withKeyAndMask(lTreeAddress2.getKeyAndMask()).build();
                int i12 = i11 * 2;
                xMSSNodeArr[i11] = b(bVar, xMSSNodeArr[i12], xMSSNodeArr[i12 + 1], lTreeAddress2);
                i11++;
            }
            if (iCeil % 2 == 1) {
                xMSSNodeArr[(int) Math.floor(d2)] = xMSSNodeArr[iCeil - 1];
            }
            iCeil = (int) Math.ceil(((double) iCeil) / 2.0d);
            builderWithKeyAndMask = new LTreeAddress.Builder().withLayerAddress(lTreeAddress2.getLayerAddress()).withTreeAddress(lTreeAddress2.getTreeAddress()).withLTreeAddress(lTreeAddress2.f91289e).withTreeHeight(lTreeAddress2.f91290f + 1).withTreeIndex(lTreeAddress2.f91291g).withKeyAndMask(lTreeAddress2.getKeyAndMask());
        }
    }

    public static XMSSNode b(b bVar, XMSSNode xMSSNode, XMSSNode xMSSNode2, XMSSAddress xMSSAddress) {
        if (xMSSNode == null) {
            throw new NullPointerException("left == null");
        }
        if (xMSSNode2 == null) {
            throw new NullPointerException("right == null");
        }
        if (xMSSNode.getHeight() != xMSSNode2.getHeight()) {
            throw new IllegalStateException("height of both nodes must be equal");
        }
        if (xMSSAddress == null) {
            throw new NullPointerException("address == null");
        }
        byte[] bArrClone = Arrays.clone(bVar.f91437d);
        if (xMSSAddress instanceof LTreeAddress) {
            LTreeAddress lTreeAddress = (LTreeAddress) xMSSAddress;
            xMSSAddress = (LTreeAddress) new LTreeAddress.Builder().withLayerAddress(lTreeAddress.getLayerAddress()).withTreeAddress(lTreeAddress.getTreeAddress()).withLTreeAddress(lTreeAddress.f91289e).withTreeHeight(lTreeAddress.f91290f).withTreeIndex(lTreeAddress.f91291g).withKeyAndMask(0).build();
        } else if (xMSSAddress instanceof HashTreeAddress) {
            HashTreeAddress hashTreeAddress = (HashTreeAddress) xMSSAddress;
            xMSSAddress = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress.getLayerAddress()).withTreeAddress(hashTreeAddress.getTreeAddress()).withTreeHeight(hashTreeAddress.f91285e).withTreeIndex(hashTreeAddress.f91286f).withKeyAndMask(0).build();
        }
        byte[] byteArray = xMSSAddress.toByteArray();
        zm.b bVar2 = bVar.f91435b;
        byte[] bArrB = bVar2.b(bArrClone, byteArray);
        if (xMSSAddress instanceof LTreeAddress) {
            LTreeAddress lTreeAddress2 = (LTreeAddress) xMSSAddress;
            xMSSAddress = (LTreeAddress) new LTreeAddress.Builder().withLayerAddress(lTreeAddress2.getLayerAddress()).withTreeAddress(lTreeAddress2.getTreeAddress()).withLTreeAddress(lTreeAddress2.f91289e).withTreeHeight(lTreeAddress2.f91290f).withTreeIndex(lTreeAddress2.f91291g).withKeyAndMask(1).build();
        } else if (xMSSAddress instanceof HashTreeAddress) {
            HashTreeAddress hashTreeAddress2 = (HashTreeAddress) xMSSAddress;
            xMSSAddress = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress2.getLayerAddress()).withTreeAddress(hashTreeAddress2.getTreeAddress()).withTreeHeight(hashTreeAddress2.f91285e).withTreeIndex(hashTreeAddress2.f91286f).withKeyAndMask(1).build();
        }
        byte[] bArrB2 = bVar2.b(bArrClone, xMSSAddress.toByteArray());
        if (xMSSAddress instanceof LTreeAddress) {
            LTreeAddress lTreeAddress3 = (LTreeAddress) xMSSAddress;
            xMSSAddress = (LTreeAddress) new LTreeAddress.Builder().withLayerAddress(lTreeAddress3.getLayerAddress()).withTreeAddress(lTreeAddress3.getTreeAddress()).withLTreeAddress(lTreeAddress3.f91289e).withTreeHeight(lTreeAddress3.f91290f).withTreeIndex(lTreeAddress3.f91291g).withKeyAndMask(2).build();
        } else if (xMSSAddress instanceof HashTreeAddress) {
            HashTreeAddress hashTreeAddress3 = (HashTreeAddress) xMSSAddress;
            xMSSAddress = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress3.getLayerAddress()).withTreeAddress(hashTreeAddress3.getTreeAddress()).withTreeHeight(hashTreeAddress3.f91285e).withTreeIndex(hashTreeAddress3.f91286f).withKeyAndMask(2).build();
        }
        byte[] bArrB3 = bVar2.b(bArrClone, xMSSAddress.toByteArray());
        int i10 = bVar.f91434a.f95105a;
        int i11 = i10 * 2;
        byte[] bArr = new byte[i11];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) (xMSSNode.getValue()[i12] ^ bArrB2[i12]);
        }
        for (int i13 = 0; i13 < i10; i13++) {
            bArr[i13 + i10] = (byte) (xMSSNode2.getValue()[i13] ^ bArrB3[i13]);
        }
        bVar2.getClass();
        int length = bArrB.length;
        int i14 = bVar2.f95101b;
        if (length != i14) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (i11 != i14 * 2) {
            throw new IllegalArgumentException("wrong in length");
        }
        return new XMSSNode(xMSSNode.getHeight(), bVar2.c(1, bArrB, bArr));
    }
}
