package org.bouncycastle.pqc.crypto.xmss;

import java.util.ArrayList;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import zm.e;
import zm.f;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm.d f91434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zm.b f91435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f91436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f91437d;

    public b(zm.d dVar) {
        if (dVar == null) {
            throw new NullPointerException("params == null");
        }
        this.f91434a = dVar;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = dVar.f95110f;
        int i10 = dVar.f95105a;
        this.f91435b = new zm.b(aSN1ObjectIdentifier, i10);
        this.f91436c = new byte[i10];
        this.f91437d = new byte[i10];
    }

    public static ArrayList b(int i10, int i11, byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("msg == null");
        }
        if (i10 != 4 && i10 != 16) {
            throw new IllegalArgumentException("w needs to be 4 or 16");
        }
        int iLog2 = XMSSUtil.log2(i10);
        if (i11 > (bArr.length * 8) / iLog2) {
            throw new IllegalArgumentException("outLength too big");
        }
        ArrayList arrayList = new ArrayList();
        for (byte b10 : bArr) {
            for (int i12 = 8 - iLog2; i12 >= 0; i12 -= iLog2) {
                arrayList.add(Integer.valueOf((b10 >> i12) & (i10 - 1)));
                if (arrayList.size() == i11) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public final byte[] a(byte[] bArr, int i10, int i11, OTSHashAddress oTSHashAddress) {
        zm.d dVar = this.f91434a;
        int i12 = dVar.f95105a;
        if (bArr == null) {
            throw new NullPointerException("startHash == null");
        }
        if (bArr.length != i12) {
            throw new IllegalArgumentException(androidx.camera.core.impl.utils.b.a("startHash needs to be ", i12, "bytes"));
        }
        if (oTSHashAddress == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (oTSHashAddress.toByteArray() == null) {
            throw new NullPointerException("otsHashAddress byte array == null");
        }
        int i13 = i10 + i11;
        if (i13 > dVar.f95106b - 1) {
            throw new IllegalArgumentException("max chain length must not be greater than w");
        }
        if (i11 == 0) {
            return bArr;
        }
        byte[] bArrA = a(bArr, i10, i11 - 1, oTSHashAddress);
        OTSHashAddress oTSHashAddress2 = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.f91295e).withChainAddress(oTSHashAddress.f91296f).withHashAddress(i13 - 1).withKeyAndMask(0).build();
        byte[] bArr2 = this.f91437d;
        byte[] byteArray = oTSHashAddress2.toByteArray();
        zm.b bVar = this.f91435b;
        byte[] bArrB = bVar.b(bArr2, byteArray);
        byte[] bArrB2 = bVar.b(this.f91437d, ((OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress2.getLayerAddress()).withTreeAddress(oTSHashAddress2.getTreeAddress()).withOTSAddress(oTSHashAddress2.f91295e).withChainAddress(oTSHashAddress2.f91296f).withHashAddress(oTSHashAddress2.f91297g).withKeyAndMask(1).build()).toByteArray());
        byte[] bArr3 = new byte[i12];
        for (int i14 = 0; i14 < i12; i14++) {
            bArr3[i14] = (byte) (bArrA[i14] ^ bArrB2[i14]);
        }
        bVar.getClass();
        int length = bArrB.length;
        int i15 = bVar.f95101b;
        if (length != i15) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (i12 == i15) {
            return bVar.c(0, bArrB, bArr3);
        }
        throw new IllegalArgumentException("wrong in length");
    }

    public final byte[] c(int i10) {
        if (i10 < 0 || i10 >= this.f91434a.f95107c) {
            throw new IllegalArgumentException("index out of bounds");
        }
        return this.f91435b.b(this.f91436c, XMSSUtil.toBytesBigEndian(i10, 32));
    }

    public final e d(OTSHashAddress oTSHashAddress) {
        zm.d dVar = this.f91434a;
        byte[][] bArr = new byte[dVar.f95107c][];
        for (int i10 = 0; i10 < dVar.f95107c; i10++) {
            oTSHashAddress = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.f91295e).withChainAddress(i10).withHashAddress(oTSHashAddress.f91297g).withKeyAndMask(oTSHashAddress.getKeyAndMask()).build();
            bArr[i10] = a(c(i10), 0, dVar.f95106b - 1, oTSHashAddress);
        }
        return new e(dVar, bArr);
    }

    public final byte[] e(byte[] bArr, OTSHashAddress oTSHashAddress) {
        return this.f91435b.b(bArr, ((OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.f91295e).build()).toByteArray());
    }

    public final void f(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i10 = this.f91434a.f95105a;
        if (length != i10) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        }
        if (bArr2 == null) {
            throw new NullPointerException("publicSeed == null");
        }
        if (bArr2.length != i10) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
        this.f91436c = bArr;
        this.f91437d = bArr2;
    }

    public final f g(byte[] bArr, OTSHashAddress oTSHashAddress) {
        if (bArr == null) {
            throw new NullPointerException("messageDigest == null");
        }
        int length = bArr.length;
        zm.d dVar = this.f91434a;
        if (length != dVar.f95105a) {
            throw new IllegalArgumentException("size of messageDigest needs to be equal to size of digest");
        }
        if (oTSHashAddress == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        int i10 = dVar.f95106b;
        int i11 = dVar.f95108d;
        ArrayList arrayListB = b(i10, i11, bArr);
        int iIntValue = 0;
        for (int i12 = 0; i12 < i11; i12++) {
            iIntValue += (i10 - 1) - ((Integer) arrayListB.get(i12)).intValue();
        }
        int iLog2 = XMSSUtil.log2(i10);
        int i13 = dVar.f95109e;
        arrayListB.addAll(b(i10, i13, XMSSUtil.toBytesBigEndian(iIntValue << (8 - ((iLog2 * i13) % 8)), (int) Math.ceil(((double) (XMSSUtil.log2(i10) * i13)) / 8.0d))));
        int i14 = dVar.f95107c;
        byte[][] bArr2 = new byte[i14][];
        for (int i15 = 0; i15 < i14; i15++) {
            oTSHashAddress = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.f91295e).withChainAddress(i15).withHashAddress(oTSHashAddress.f91297g).withKeyAndMask(oTSHashAddress.getKeyAndMask()).build();
            bArr2[i15] = a(c(i15), 0, ((Integer) arrayListB.get(i15)).intValue(), oTSHashAddress);
        }
        return new f(dVar, bArr2);
    }
}
