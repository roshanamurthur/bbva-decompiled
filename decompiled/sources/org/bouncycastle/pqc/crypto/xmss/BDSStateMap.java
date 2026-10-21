package org.bouncycastle.pqc.crypto.xmss;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.TreeMap;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes13.dex */
public class BDSStateMap implements Serializable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final TreeMap f91277p0 = new TreeMap();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public transient long f91278q0;

    public BDSStateMap(long j10) {
        this.f91278q0 = j10;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f91278q0 = objectInputStream.available() != 0 ? objectInputStream.readLong() : 0L;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(this.f91278q0);
    }

    public final BDS a(int i10) {
        return (BDS) this.f91277p0.get(Integers.valueOf(i10));
    }

    public final void b(XMSSMTParameters xMSSMTParameters, long j10, byte[] bArr, byte[] bArr2) {
        XMSSParameters xMSSParameters = xMSSMTParameters.getXMSSParameters();
        int height = xMSSParameters.getHeight();
        long treeIndex = XMSSUtil.getTreeIndex(j10, height);
        int leafIndex = XMSSUtil.getLeafIndex(j10, height);
        OTSHashAddress oTSHashAddress = (OTSHashAddress) new OTSHashAddress.Builder().withTreeAddress(treeIndex).withOTSAddress(leafIndex).build();
        int i10 = (1 << height) - 1;
        TreeMap treeMap = this.f91277p0;
        if (leafIndex < i10) {
            if (a(0) == null || leafIndex == 0) {
                treeMap.put(Integers.valueOf(0), new BDS(xMSSParameters, bArr, bArr2, oTSHashAddress));
            }
        }
        for (int i11 = 1; i11 < xMSSMTParameters.getLayers(); i11++) {
            int leafIndex2 = XMSSUtil.getLeafIndex(treeIndex, height);
            treeIndex = XMSSUtil.getTreeIndex(treeIndex, height);
            OTSHashAddress oTSHashAddress2 = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(i11).withTreeAddress(treeIndex).withOTSAddress(leafIndex2).build();
            if (treeMap.get(Integer.valueOf(i11)) == null || XMSSUtil.isNewBDSInitNeeded(j10, height, i11)) {
                treeMap.put(Integer.valueOf(i11), new BDS(xMSSParameters, bArr, bArr2, oTSHashAddress2));
            }
            if (leafIndex2 < i10 && XMSSUtil.isNewAuthenticationPathNeeded(j10, height, i11)) {
            }
        }
    }

    public long getMaxIndex() {
        return this.f91278q0;
    }

    public boolean isEmpty() {
        return this.f91277p0.isEmpty();
    }

    public BDSStateMap withWOTSDigest(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        BDSStateMap bDSStateMap = new BDSStateMap(this.f91278q0);
        TreeMap treeMap = this.f91277p0;
        for (Integer num : treeMap.keySet()) {
            bDSStateMap.f91277p0.put(num, ((BDS) treeMap.get(num)).withWOTSDigest(aSN1ObjectIdentifier));
        }
        return bDSStateMap;
    }

    public BDSStateMap(BDSStateMap bDSStateMap, long j10) {
        for (Integer num : bDSStateMap.f91277p0.keySet()) {
            this.f91277p0.put(num, new BDS((BDS) bDSStateMap.f91277p0.get(num)));
        }
        this.f91278q0 = j10;
    }

    public BDSStateMap(XMSSMTParameters xMSSMTParameters, long j10, byte[] bArr, byte[] bArr2) {
        this.f91278q0 = (1 << xMSSMTParameters.getHeight()) - 1;
        for (long j11 = 0; j11 < j10; j11++) {
            b(xMSSMTParameters, j11, bArr, bArr2);
        }
    }
}
