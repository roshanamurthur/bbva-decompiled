package org.bouncycastle.pqc.crypto.xmss;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import zm.e;

/* JADX INFO: loaded from: classes13.dex */
public final class BDS implements Serializable {
    public boolean E0;
    public transient int F0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final transient b f91268p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f91269q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ArrayList f91270r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f91271s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public XMSSNode f91272t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final ArrayList f91273u0;
    public final TreeMap v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final Stack<XMSSNode> f91274w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final TreeMap f91275x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f91276y0;

    public BDS(BDS bds) {
        this.f91268p0 = new b(bds.f91268p0.f91434a);
        this.f91269q0 = bds.f91269q0;
        this.f91271s0 = bds.f91271s0;
        this.f91272t0 = bds.f91272t0;
        ArrayList arrayList = new ArrayList();
        this.f91273u0 = arrayList;
        arrayList.addAll(bds.f91273u0);
        this.v0 = new TreeMap();
        for (Integer num : bds.v0.keySet()) {
            this.v0.put(num, (LinkedList) ((LinkedList) bds.v0.get(num)).clone());
        }
        Stack<XMSSNode> stack = new Stack<>();
        this.f91274w0 = stack;
        stack.addAll(bds.f91274w0);
        this.f91270r0 = new ArrayList();
        Iterator it = bds.f91270r0.iterator();
        while (it.hasNext()) {
            this.f91270r0.add(((a) it.next()).clone());
        }
        this.f91275x0 = new TreeMap((Map) bds.f91275x0);
        this.f91276y0 = bds.f91276y0;
        this.F0 = bds.F0;
        this.E0 = bds.E0;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int iAvailable = objectInputStream.available();
        int i10 = this.f91269q0;
        this.F0 = iAvailable != 0 ? objectInputStream.readInt() : (1 << i10) - 1;
        int i11 = this.F0;
        if (i11 > (1 << i10) - 1 || this.f91276y0 > i11 + 1 || objectInputStream.available() != 0) {
            throw new IOException("inconsistent BDS data detected");
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.F0);
    }

    public final void a(byte[] bArr, byte[] bArr2, OTSHashAddress oTSHashAddress) {
        OTSHashAddress oTSHashAddress2;
        int i10;
        if (oTSHashAddress == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        LTreeAddress lTreeAddress = (LTreeAddress) new LTreeAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).build();
        int i11 = 0;
        HashTreeAddress hashTreeAddress = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).build();
        LTreeAddress lTreeAddress2 = lTreeAddress;
        OTSHashAddress oTSHashAddress3 = oTSHashAddress;
        while (true) {
            int i12 = this.f91269q0;
            int i13 = 1 << i12;
            Stack<XMSSNode> stack = this.f91274w0;
            if (i11 >= i13) {
                this.f91272t0 = stack.pop();
                return;
            }
            OTSHashAddress oTSHashAddress4 = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress3.getLayerAddress()).withTreeAddress(oTSHashAddress3.getTreeAddress()).withOTSAddress(i11).withChainAddress(oTSHashAddress3.f91296f).withHashAddress(oTSHashAddress3.f91297g).withKeyAndMask(oTSHashAddress3.getKeyAndMask()).build();
            b bVar = this.f91268p0;
            bVar.f(bVar.e(bArr2, oTSHashAddress4), bArr);
            e eVarD = bVar.d(oTSHashAddress4);
            lTreeAddress2 = (LTreeAddress) new LTreeAddress.Builder().withLayerAddress(lTreeAddress2.getLayerAddress()).withTreeAddress(lTreeAddress2.getTreeAddress()).withLTreeAddress(i11).withTreeHeight(lTreeAddress2.f91290f).withTreeIndex(lTreeAddress2.f91291g).withKeyAndMask(lTreeAddress2.getKeyAndMask()).build();
            XMSSNode xMSSNodeA = c.a(bVar, eVarD, lTreeAddress2);
            hashTreeAddress = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress.getLayerAddress()).withTreeAddress(hashTreeAddress.getTreeAddress()).withTreeIndex(i11).withKeyAndMask(hashTreeAddress.getKeyAndMask()).build();
            while (!stack.isEmpty() && stack.peek().getHeight() == xMSSNodeA.getHeight()) {
                int height = i11 / (1 << xMSSNodeA.getHeight());
                if (height == 1) {
                    this.f91273u0.add(xMSSNodeA);
                }
                int i14 = this.f91271s0;
                if (height == 3) {
                    if (xMSSNodeA.getHeight() < i12 - i14) {
                        a aVar = (a) this.f91270r0.get(xMSSNodeA.getHeight());
                        aVar.f91428p0 = xMSSNodeA;
                        int height2 = xMSSNodeA.getHeight();
                        aVar.f91430r0 = height2;
                        oTSHashAddress2 = oTSHashAddress4;
                        if (height2 == aVar.f91429q0) {
                            aVar.f91433u0 = true;
                        }
                    } else {
                        oTSHashAddress2 = oTSHashAddress4;
                    }
                    i10 = 3;
                } else {
                    oTSHashAddress2 = oTSHashAddress4;
                    i10 = 3;
                }
                if (height >= i10 && (height & 1) == 1 && xMSSNodeA.getHeight() >= i12 - i14 && xMSSNodeA.getHeight() <= i12 - 2) {
                    Integer numValueOf = Integer.valueOf(xMSSNodeA.getHeight());
                    TreeMap treeMap = this.v0;
                    if (treeMap.get(numValueOf) == null) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(xMSSNodeA);
                        treeMap.put(Integer.valueOf(xMSSNodeA.getHeight()), linkedList);
                    } else {
                        ((LinkedList) treeMap.get(Integer.valueOf(xMSSNodeA.getHeight()))).add(xMSSNodeA);
                    }
                }
                HashTreeAddress hashTreeAddress2 = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress.getLayerAddress()).withTreeAddress(hashTreeAddress.getTreeAddress()).withTreeHeight(hashTreeAddress.f91285e).withTreeIndex((hashTreeAddress.f91286f - 1) / 2).withKeyAndMask(hashTreeAddress.getKeyAndMask()).build();
                XMSSNode xMSSNodeB = c.b(bVar, stack.pop(), xMSSNodeA, hashTreeAddress2);
                xMSSNodeA = new XMSSNode(xMSSNodeB.getHeight() + 1, xMSSNodeB.getValue());
                hashTreeAddress = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress2.getLayerAddress()).withTreeAddress(hashTreeAddress2.getTreeAddress()).withTreeHeight(hashTreeAddress2.f91285e + 1).withTreeIndex(hashTreeAddress2.f91286f).withKeyAndMask(hashTreeAddress2.getKeyAndMask()).build();
                oTSHashAddress4 = oTSHashAddress2;
            }
            stack.push(xMSSNodeA);
            i11++;
            oTSHashAddress3 = oTSHashAddress4;
        }
    }

    public final void b(byte[] bArr, byte[] bArr2, OTSHashAddress oTSHashAddress) {
        int i10;
        ArrayList arrayList;
        int i11;
        Stack<XMSSNode> stack;
        int i12;
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        OTSHashAddress oTSHashAddress2 = oTSHashAddress;
        if (oTSHashAddress2 == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (this.E0) {
            throw new IllegalStateException("index already used");
        }
        int i13 = this.f91276y0;
        int i14 = 1;
        if (i13 > this.F0 - 1) {
            throw new IllegalStateException("index out of bounds");
        }
        int i15 = this.f91269q0;
        int iCalculateTau = XMSSUtil.calculateTau(i13, i15);
        int i16 = (this.f91276y0 >> (iCalculateTau + 1)) & 1;
        TreeMap treeMap = this.f91275x0;
        ArrayList arrayList2 = this.f91273u0;
        if (i16 == 0 && iCalculateTau < i15 - 1) {
            treeMap.put(Integer.valueOf(iCalculateTau), arrayList2.get(iCalculateTau));
        }
        LTreeAddress lTreeAddress = (LTreeAddress) new LTreeAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).build();
        HashTreeAddress hashTreeAddress = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).build();
        ArrayList<a> arrayList3 = this.f91270r0;
        int i17 = this.f91271s0;
        b bVar = this.f91268p0;
        if (iCalculateTau == 0) {
            oTSHashAddress2 = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(this.f91276y0).withChainAddress(oTSHashAddress2.f91296f).withHashAddress(oTSHashAddress2.f91297g).withKeyAndMask(oTSHashAddress.getKeyAndMask()).build();
            bVar.f(bVar.e(bArr4, oTSHashAddress2), bArr3);
            arrayList2.set(0, c.a(bVar, bVar.d(oTSHashAddress2), (LTreeAddress) new LTreeAddress.Builder().withLayerAddress(lTreeAddress.getLayerAddress()).withTreeAddress(lTreeAddress.getTreeAddress()).withLTreeAddress(this.f91276y0).withTreeHeight(lTreeAddress.f91290f).withTreeIndex(lTreeAddress.f91291g).withKeyAndMask(lTreeAddress.getKeyAndMask()).build()));
            i10 = 0;
        } else {
            int i18 = iCalculateTau - 1;
            HashTreeAddress hashTreeAddress2 = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress.getLayerAddress()).withTreeAddress(hashTreeAddress.getTreeAddress()).withTreeHeight(i18).withTreeIndex(this.f91276y0 >> iCalculateTau).withKeyAndMask(hashTreeAddress.getKeyAndMask()).build();
            bVar.f(bVar.e(bArr4, oTSHashAddress2), bArr3);
            XMSSNode xMSSNodeB = c.b(bVar, (XMSSNode) arrayList2.get(i18), (XMSSNode) treeMap.get(Integer.valueOf(i18)), hashTreeAddress2);
            arrayList2.set(iCalculateTau, new XMSSNode(xMSSNodeB.getHeight() + 1, xMSSNodeB.getValue()));
            treeMap.remove(Integer.valueOf(i18));
            int i19 = 0;
            while (i19 < iCalculateTau) {
                arrayList2.set(i19, i19 < i15 - i17 ? ((a) arrayList3.get(i19)).f91428p0 : ((LinkedList) this.v0.get(Integer.valueOf(i19))).removeFirst());
                i19++;
            }
            int iMin = Math.min(iCalculateTau, i15 - i17);
            for (int i20 = 0; i20 < iMin; i20++) {
                int i21 = ((1 << i20) * 3) + this.f91276y0 + 1;
                if (i21 < (1 << i15)) {
                    a aVar = (a) arrayList3.get(i20);
                    aVar.f91428p0 = null;
                    aVar.f91430r0 = aVar.f91429q0;
                    aVar.f91431s0 = i21;
                    aVar.f91432t0 = true;
                    aVar.f91433u0 = false;
                }
            }
            i10 = 0;
        }
        a aVar2 = null;
        int i22 = i10;
        while (i22 < ((i15 - i17) >> i14)) {
            a aVar3 = aVar2;
            for (a aVar4 : arrayList3) {
                if (!aVar4.f91433u0 && aVar4.f91432t0 && (aVar3 == null || aVar4.b() < aVar3.b() || (aVar4.b() == aVar3.b() && aVar4.f91431s0 < aVar3.f91431s0))) {
                    aVar3 = aVar4;
                }
            }
            if (aVar3 == null) {
                arrayList = arrayList3;
                i11 = i17;
            } else {
                if (aVar3.f91433u0 || !aVar3.f91432t0) {
                    throw new IllegalStateException("finished or not initialized");
                }
                OTSHashAddress oTSHashAddress3 = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress2.getLayerAddress()).withTreeAddress(oTSHashAddress2.getTreeAddress()).withOTSAddress(aVar3.f91431s0).withChainAddress(oTSHashAddress2.f91296f).withHashAddress(oTSHashAddress2.f91297g).withKeyAndMask(oTSHashAddress2.getKeyAndMask()).build();
                arrayList = arrayList3;
                LTreeAddress lTreeAddress2 = (LTreeAddress) new LTreeAddress.Builder().withLayerAddress(oTSHashAddress3.getLayerAddress()).withTreeAddress(oTSHashAddress3.getTreeAddress()).withLTreeAddress(aVar3.f91431s0).build();
                a aVar5 = aVar3;
                HashTreeAddress hashTreeAddress3 = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(oTSHashAddress3.getLayerAddress()).withTreeAddress(oTSHashAddress3.getTreeAddress()).withTreeIndex(aVar5.f91431s0).build();
                bVar.f(bVar.e(bArr4, oTSHashAddress3), bArr3);
                XMSSNode xMSSNodeA = c.a(bVar, bVar.d(oTSHashAddress3), lTreeAddress2);
                while (true) {
                    stack = this.f91274w0;
                    boolean zIsEmpty = stack.isEmpty();
                    i12 = aVar5.f91429q0;
                    if (zIsEmpty || stack.peek().getHeight() != xMSSNodeA.getHeight() || stack.peek().getHeight() == i12) {
                        break;
                    }
                    HashTreeAddress hashTreeAddress4 = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress3.getLayerAddress()).withTreeAddress(hashTreeAddress3.getTreeAddress()).withTreeHeight(hashTreeAddress3.f91285e).withTreeIndex((hashTreeAddress3.f91286f - 1) / 2).withKeyAndMask(hashTreeAddress3.getKeyAndMask()).build();
                    XMSSNode xMSSNodeB2 = c.b(bVar, stack.pop(), xMSSNodeA, hashTreeAddress4);
                    xMSSNodeA = new XMSSNode(xMSSNodeB2.getHeight() + 1, xMSSNodeB2.getValue());
                    hashTreeAddress3 = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress4.getLayerAddress()).withTreeAddress(hashTreeAddress4.getTreeAddress()).withTreeHeight(hashTreeAddress4.f91285e + 1).withTreeIndex(hashTreeAddress4.f91286f).withKeyAndMask(hashTreeAddress4.getKeyAndMask()).build();
                    i17 = i17;
                }
                i11 = i17;
                XMSSNode xMSSNode = aVar5.f91428p0;
                if (xMSSNode == null) {
                    aVar5.f91428p0 = xMSSNodeA;
                } else if (xMSSNode.getHeight() == xMSSNodeA.getHeight()) {
                    HashTreeAddress hashTreeAddress5 = (HashTreeAddress) new HashTreeAddress.Builder().withLayerAddress(hashTreeAddress3.getLayerAddress()).withTreeAddress(hashTreeAddress3.getTreeAddress()).withTreeHeight(hashTreeAddress3.f91285e).withTreeIndex((hashTreeAddress3.f91286f - 1) / 2).withKeyAndMask(hashTreeAddress3.getKeyAndMask()).build();
                    xMSSNodeA = new XMSSNode(aVar5.f91428p0.getHeight() + 1, c.b(bVar, aVar5.f91428p0, xMSSNodeA, hashTreeAddress5).getValue());
                    aVar5.f91428p0 = xMSSNodeA;
                } else {
                    stack.push(xMSSNodeA);
                }
                if (aVar5.f91428p0.getHeight() == i12) {
                    aVar5.f91433u0 = true;
                } else {
                    aVar5.f91430r0 = xMSSNodeA.getHeight();
                    aVar5.f91431s0++;
                }
            }
            i22++;
            bArr3 = bArr;
            bArr4 = bArr2;
            arrayList3 = arrayList;
            i17 = i11;
            i14 = 1;
            aVar2 = null;
        }
        this.f91276y0++;
    }

    public final void c() {
        if (this.f91273u0 == null) {
            throw new IllegalStateException("authenticationPath == null");
        }
        if (this.v0 == null) {
            throw new IllegalStateException("retain == null");
        }
        if (this.f91274w0 == null) {
            throw new IllegalStateException("stack == null");
        }
        if (this.f91270r0 == null) {
            throw new IllegalStateException("treeHashInstances == null");
        }
        if (this.f91275x0 == null) {
            throw new IllegalStateException("keep == null");
        }
        if (!XMSSUtil.isIndexValid(this.f91269q0, this.f91276y0)) {
            throw new IllegalStateException("index in BDS state out of bounds");
        }
    }

    public List<XMSSNode> getAuthenticationPath() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f91273u0.iterator();
        while (it.hasNext()) {
            arrayList.add((XMSSNode) it.next());
        }
        return arrayList;
    }

    public int getIndex() {
        return this.f91276y0;
    }

    public int getMaxIndex() {
        return this.F0;
    }

    public BDS getNextState(byte[] bArr, byte[] bArr2, OTSHashAddress oTSHashAddress) {
        return new BDS(this, bArr, bArr2, oTSHashAddress);
    }

    public XMSSNode getRoot() {
        return this.f91272t0;
    }

    public int getTreeHeight() {
        return this.f91269q0;
    }

    public BDS withMaxIndex(int i10, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return new BDS(this, i10, aSN1ObjectIdentifier);
    }

    public BDS withWOTSDigest(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return new BDS(this, aSN1ObjectIdentifier);
    }

    public BDS(BDS bds, int i10, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f91268p0 = new b(new zm.d(aSN1ObjectIdentifier));
        this.f91269q0 = bds.f91269q0;
        this.f91271s0 = bds.f91271s0;
        this.f91272t0 = bds.f91272t0;
        ArrayList arrayList = new ArrayList();
        this.f91273u0 = arrayList;
        arrayList.addAll(bds.f91273u0);
        this.v0 = new TreeMap();
        for (Integer num : bds.v0.keySet()) {
            this.v0.put(num, (LinkedList) ((LinkedList) bds.v0.get(num)).clone());
        }
        Stack<XMSSNode> stack = new Stack<>();
        this.f91274w0 = stack;
        stack.addAll(bds.f91274w0);
        this.f91270r0 = new ArrayList();
        Iterator it = bds.f91270r0.iterator();
        while (it.hasNext()) {
            this.f91270r0.add(((a) it.next()).clone());
        }
        this.f91275x0 = new TreeMap((Map) bds.f91275x0);
        this.f91276y0 = bds.f91276y0;
        this.F0 = i10;
        this.E0 = bds.E0;
        c();
    }

    public BDS(BDS bds, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f91268p0 = new b(new zm.d(aSN1ObjectIdentifier));
        this.f91269q0 = bds.f91269q0;
        this.f91271s0 = bds.f91271s0;
        this.f91272t0 = bds.f91272t0;
        ArrayList arrayList = new ArrayList();
        this.f91273u0 = arrayList;
        arrayList.addAll(bds.f91273u0);
        this.v0 = new TreeMap();
        for (Integer num : bds.v0.keySet()) {
            this.v0.put(num, (LinkedList) ((LinkedList) bds.v0.get(num)).clone());
        }
        Stack<XMSSNode> stack = new Stack<>();
        this.f91274w0 = stack;
        stack.addAll(bds.f91274w0);
        this.f91270r0 = new ArrayList();
        Iterator it = bds.f91270r0.iterator();
        while (it.hasNext()) {
            this.f91270r0.add(((a) it.next()).clone());
        }
        this.f91275x0 = new TreeMap((Map) bds.f91275x0);
        this.f91276y0 = bds.f91276y0;
        this.F0 = bds.F0;
        this.E0 = bds.E0;
        c();
    }

    public BDS(BDS bds, byte[] bArr, byte[] bArr2, OTSHashAddress oTSHashAddress) {
        this.f91268p0 = new b(bds.f91268p0.f91434a);
        this.f91269q0 = bds.f91269q0;
        this.f91271s0 = bds.f91271s0;
        this.f91272t0 = bds.f91272t0;
        ArrayList arrayList = new ArrayList();
        this.f91273u0 = arrayList;
        arrayList.addAll(bds.f91273u0);
        this.v0 = new TreeMap();
        for (Integer num : bds.v0.keySet()) {
            this.v0.put(num, (LinkedList) ((LinkedList) bds.v0.get(num)).clone());
        }
        Stack<XMSSNode> stack = new Stack<>();
        this.f91274w0 = stack;
        stack.addAll(bds.f91274w0);
        this.f91270r0 = new ArrayList();
        Iterator it = bds.f91270r0.iterator();
        while (it.hasNext()) {
            this.f91270r0.add(((a) it.next()).clone());
        }
        this.f91275x0 = new TreeMap((Map) bds.f91275x0);
        this.f91276y0 = bds.f91276y0;
        this.F0 = bds.F0;
        this.E0 = false;
        b(bArr, bArr2, oTSHashAddress);
    }

    public BDS(b bVar, int i10, int i11, int i12) {
        this.f91268p0 = bVar;
        this.f91269q0 = i10;
        this.F0 = i12;
        this.f91271s0 = i11;
        if (i11 <= i10 && i11 >= 2) {
            int i13 = i10 - i11;
            if (i13 % 2 == 0) {
                this.f91273u0 = new ArrayList();
                this.v0 = new TreeMap();
                this.f91274w0 = new Stack<>();
                this.f91270r0 = new ArrayList();
                for (int i14 = 0; i14 < i13; i14++) {
                    this.f91270r0.add(new a(i14));
                }
                this.f91275x0 = new TreeMap();
                this.f91276y0 = 0;
                this.E0 = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    public BDS(XMSSParameters xMSSParameters, int i10, int i11) {
        this(xMSSParameters.a(), xMSSParameters.getHeight(), xMSSParameters.f91378c, i11);
        this.F0 = i10;
        this.f91276y0 = i11;
        this.E0 = true;
    }

    public BDS(XMSSParameters xMSSParameters, byte[] bArr, byte[] bArr2, OTSHashAddress oTSHashAddress) {
        this(xMSSParameters.a(), xMSSParameters.getHeight(), xMSSParameters.f91378c, (1 << xMSSParameters.getHeight()) - 1);
        a(bArr, bArr2, oTSHashAddress);
    }
}
