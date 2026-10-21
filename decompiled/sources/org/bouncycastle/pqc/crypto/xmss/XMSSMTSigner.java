package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.crypto.StateAwareMessageSigner;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import zm.f;

/* JADX INFO: loaded from: classes13.dex */
public class XMSSMTSigner implements StateAwareMessageSigner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public XMSSMTPrivateKeyParameters f91366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public XMSSMTPublicKeyParameters f91367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public XMSSMTParameters f91368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public XMSSParameters f91369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f91370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f91371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f91372g;

    public final f a(byte[] bArr, OTSHashAddress oTSHashAddress) {
        if (bArr.length != this.f91368c.getTreeDigestSize()) {
            throw new IllegalArgumentException("size of messageDigest needs to be equal to size of digest");
        }
        if (oTSHashAddress == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        b bVar = this.f91370e;
        bVar.f(bVar.e(this.f91366a.getSecretKeySeed(), oTSHashAddress), this.f91366a.getPublicSeed());
        return this.f91370e.g(bArr, oTSHashAddress);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        byte[] byteArray;
        if (bArr == null) {
            throw new NullPointerException("message == null");
        }
        if (!this.f91372g) {
            throw new IllegalStateException("signer not initialized for signature generation");
        }
        XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParameters = this.f91366a;
        if (xMSSMTPrivateKeyParameters == null) {
            throw new IllegalStateException("signing key no longer usable");
        }
        synchronized (xMSSMTPrivateKeyParameters) {
            if (this.f91366a.getUsagesRemaining() <= 0) {
                throw new IllegalStateException("no usages of private key remaining");
            }
            if (this.f91366a.f91338x0.isEmpty()) {
                throw new IllegalStateException("not initialized");
            }
            try {
                BDSStateMap bDSStateMap = this.f91366a.f91338x0;
                long index = this.f91366a.getIndex();
                this.f91368c.getHeight();
                int height = this.f91369d.getHeight();
                if (this.f91366a.getUsagesRemaining() <= 0) {
                    throw new IllegalStateException("index out of bounds");
                }
                byte[] bArrB = this.f91370e.f91435b.b(this.f91366a.getSecretKeyPRF(), XMSSUtil.toBytesBigEndian(index, 32));
                byte[] bArrA = this.f91370e.f91435b.a(Arrays.concatenate(bArrB, this.f91366a.getRoot(), XMSSUtil.toBytesBigEndian(index, this.f91368c.getTreeDigestSize())), bArr);
                this.f91371f = true;
                XMSSMTSignature xMSSMTSignatureBuild = new XMSSMTSignature.Builder(this.f91368c).withIndex(index).withRandom(bArrB).build();
                long treeIndex = XMSSUtil.getTreeIndex(index, height);
                int leafIndex = XMSSUtil.getLeafIndex(index, height);
                this.f91370e.f(new byte[this.f91368c.getTreeDigestSize()], this.f91366a.getPublicSeed());
                OTSHashAddress oTSHashAddress = (OTSHashAddress) new OTSHashAddress.Builder().withTreeAddress(treeIndex).withOTSAddress(leafIndex).build();
                if (bDSStateMap.a(0) == null || leafIndex == 0) {
                    bDSStateMap.f91277p0.put(Integers.valueOf(0), new BDS(this.f91369d, this.f91366a.getPublicSeed(), this.f91366a.getSecretKeySeed(), oTSHashAddress));
                }
                xMSSMTSignatureBuild.getReducedSignatures().add(new XMSSReducedSignature.Builder(this.f91369d).withWOTSPlusSignature(a(bArrA, oTSHashAddress)).withAuthPath(bDSStateMap.a(0).getAuthenticationPath()).build());
                for (int i10 = 1; i10 < this.f91368c.getLayers(); i10++) {
                    XMSSNode root = bDSStateMap.a(i10 - 1).getRoot();
                    int leafIndex2 = XMSSUtil.getLeafIndex(treeIndex, height);
                    treeIndex = XMSSUtil.getTreeIndex(treeIndex, height);
                    OTSHashAddress oTSHashAddress2 = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(i10).withTreeAddress(treeIndex).withOTSAddress(leafIndex2).build();
                    f fVarA = a(root.getValue(), oTSHashAddress2);
                    if (bDSStateMap.a(i10) == null || XMSSUtil.isNewBDSInitNeeded(index, height, i10)) {
                        bDSStateMap.f91277p0.put(Integers.valueOf(i10), new BDS(this.f91369d, this.f91366a.getPublicSeed(), this.f91366a.getSecretKeySeed(), oTSHashAddress2));
                    }
                    xMSSMTSignatureBuild.getReducedSignatures().add(new XMSSReducedSignature.Builder(this.f91369d).withWOTSPlusSignature(fVarA).withAuthPath(bDSStateMap.a(i10).getAuthenticationPath()).build());
                }
                byteArray = xMSSMTSignatureBuild.toByteArray();
                this.f91366a.a();
            } catch (Throwable th2) {
                this.f91366a.a();
                throw th2;
            }
        }
        return byteArray;
    }

    @Override // org.bouncycastle.pqc.crypto.StateAwareMessageSigner
    public AsymmetricKeyParameter getUpdatedPrivateKey() {
        if (this.f91371f) {
            XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParameters = this.f91366a;
            this.f91366a = null;
            return xMSSMTPrivateKeyParameters;
        }
        XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParameters2 = this.f91366a;
        if (xMSSMTPrivateKeyParameters2 != null) {
            this.f91366a = xMSSMTPrivateKeyParameters2.getNextKey();
        }
        return xMSSMTPrivateKeyParameters2;
    }

    public long getUsagesRemaining() {
        return this.f91366a.getUsagesRemaining();
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z10, CipherParameters cipherParameters) {
        XMSSMTParameters parameters;
        if (z10) {
            this.f91372g = true;
            this.f91371f = false;
            XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParameters = (XMSSMTPrivateKeyParameters) cipherParameters;
            this.f91366a = xMSSMTPrivateKeyParameters;
            parameters = xMSSMTPrivateKeyParameters.getParameters();
        } else {
            this.f91372g = false;
            XMSSMTPublicKeyParameters xMSSMTPublicKeyParameters = (XMSSMTPublicKeyParameters) cipherParameters;
            this.f91367b = xMSSMTPublicKeyParameters;
            parameters = xMSSMTPublicKeyParameters.getParameters();
        }
        this.f91368c = parameters;
        this.f91369d = parameters.getXMSSParameters();
        this.f91370e = this.f91368c.getWOTSPlus();
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("message == null");
        }
        if (bArr2 == null) {
            throw new NullPointerException("signature == null");
        }
        if (this.f91367b == null) {
            throw new NullPointerException("publicKey == null");
        }
        XMSSMTSignature xMSSMTSignatureBuild = new XMSSMTSignature.Builder(this.f91368c).withSignature(bArr2).build();
        byte[] bArrA = this.f91370e.f91435b.a(Arrays.concatenate(xMSSMTSignatureBuild.getRandom(), this.f91367b.getRoot(), XMSSUtil.toBytesBigEndian(xMSSMTSignatureBuild.getIndex(), this.f91368c.getTreeDigestSize())), bArr);
        long index = xMSSMTSignatureBuild.getIndex();
        int height = this.f91369d.getHeight();
        long treeIndex = XMSSUtil.getTreeIndex(index, height);
        int leafIndex = XMSSUtil.getLeafIndex(index, height);
        this.f91370e.f(new byte[this.f91368c.getTreeDigestSize()], this.f91367b.getPublicSeed());
        OTSHashAddress oTSHashAddress = (OTSHashAddress) new OTSHashAddress.Builder().withTreeAddress(treeIndex).withOTSAddress(leafIndex).build();
        XMSSNode xMSSNodeA = d.a(this.f91370e, height, bArrA, xMSSMTSignatureBuild.getReducedSignatures().get(0), oTSHashAddress, leafIndex);
        int i10 = 1;
        while (i10 < this.f91368c.getLayers()) {
            XMSSReducedSignature xMSSReducedSignature = xMSSMTSignatureBuild.getReducedSignatures().get(i10);
            int leafIndex2 = XMSSUtil.getLeafIndex(treeIndex, height);
            long treeIndex2 = XMSSUtil.getTreeIndex(treeIndex, height);
            xMSSNodeA = d.a(this.f91370e, height, xMSSNodeA.getValue(), xMSSReducedSignature, (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(i10).withTreeAddress(treeIndex2).withOTSAddress(leafIndex2).build(), leafIndex2);
            i10++;
            treeIndex = treeIndex2;
        }
        return Arrays.constantTimeAreEqual(xMSSNodeA.getValue(), this.f91367b.getRoot());
    }
}
