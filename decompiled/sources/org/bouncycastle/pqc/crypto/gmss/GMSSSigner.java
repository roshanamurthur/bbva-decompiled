package org.bouncycastle.pqc.crypto.gmss;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.pqc.crypto.gmss.util.GMSSUtil;
import org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSVerify;
import org.bouncycastle.pqc.crypto.gmss.util.WinternitzOTSignature;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public class GMSSSigner implements MessageSigner {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GMSSUtil f91037a = new GMSSUtil();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f91038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Digest f91039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f91040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f91041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Digest f91042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WinternitzOTSignature f91043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final GMSSDigestProvider f91044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f91045i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[][][] f91046j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[][] f91047k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public GMSSParameters f91048l;
    public final GMSSRandom m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public GMSSKeyParameters f91049n;

    public GMSSSigner(GMSSDigestProvider gMSSDigestProvider) {
        this.f91044h = gMSSDigestProvider;
        Digest digest = gMSSDigestProvider.get();
        this.f91039c = digest;
        this.f91042f = digest;
        this.f91040d = digest.getDigestSize();
        this.m = new GMSSRandom(digest);
    }

    public final void a() {
        int i10;
        this.f91039c.reset();
        GMSSPrivateKeyParameters gMSSPrivateKeyParameters = (GMSSPrivateKeyParameters) this.f91049n;
        if (gMSSPrivateKeyParameters.isUsed()) {
            throw new IllegalStateException("Private key already used");
        }
        if (gMSSPrivateKeyParameters.getIndex(0) >= gMSSPrivateKeyParameters.getNumLeafs(0)) {
            throw new IllegalStateException("No more signatures can be generated");
        }
        GMSSParameters parameters = gMSSPrivateKeyParameters.getParameters();
        this.f91048l = parameters;
        this.f91041e = parameters.getNumOfLayers();
        byte[] bArr = gMSSPrivateKeyParameters.getCurrentSeeds()[this.f91041e - 1];
        int i11 = this.f91040d;
        byte[] bArr2 = new byte[i11];
        byte[] bArr3 = new byte[i11];
        System.arraycopy(bArr, 0, bArr3, 0, i11);
        this.f91043g = new WinternitzOTSignature(this.m.nextSeed(bArr3), this.f91044h.get(), this.f91048l.getWinternitzParameter()[this.f91041e - 1]);
        byte[][][] currentAuthPaths = gMSSPrivateKeyParameters.getCurrentAuthPaths();
        this.f91046j = new byte[this.f91041e][][];
        int i12 = 0;
        while (true) {
            i10 = this.f91041e;
            if (i12 >= i10) {
                break;
            }
            this.f91046j[i12] = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, currentAuthPaths[i12].length, i11);
            int i13 = 0;
            while (true) {
                byte[][] bArr4 = currentAuthPaths[i12];
                if (i13 < bArr4.length) {
                    System.arraycopy(bArr4[i13], 0, this.f91046j[i12][i13], 0, i11);
                    i13++;
                }
            }
            i12++;
        }
        this.f91045i = new int[i10];
        System.arraycopy(gMSSPrivateKeyParameters.getIndex(), 0, this.f91045i, 0, this.f91041e);
        this.f91047k = new byte[this.f91041e - 1][];
        for (int i14 = 0; i14 < this.f91041e - 1; i14++) {
            byte[] subtreeRootSig = gMSSPrivateKeyParameters.getSubtreeRootSig(i14);
            byte[][] bArr5 = this.f91047k;
            byte[] bArr6 = new byte[subtreeRootSig.length];
            bArr5[i14] = bArr6;
            System.arraycopy(subtreeRootSig, 0, bArr6, 0, subtreeRootSig.length);
        }
        gMSSPrivateKeyParameters.markUsed();
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        byte[] bArr2 = new byte[this.f91040d];
        byte[] signature = this.f91043g.getSignature(bArr);
        byte[][] bArr3 = this.f91046j[this.f91041e - 1];
        GMSSUtil gMSSUtil = this.f91037a;
        byte[] bArrConcatenateArray = gMSSUtil.concatenateArray(bArr3);
        byte[] bArrIntToBytesLittleEndian = gMSSUtil.intToBytesLittleEndian(this.f91045i[this.f91041e - 1]);
        int length = bArrIntToBytesLittleEndian.length + signature.length + bArrConcatenateArray.length;
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArrIntToBytesLittleEndian, 0, bArr4, 0, bArrIntToBytesLittleEndian.length);
        System.arraycopy(signature, 0, bArr4, bArrIntToBytesLittleEndian.length, signature.length);
        System.arraycopy(bArrConcatenateArray, 0, bArr4, bArrIntToBytesLittleEndian.length + signature.length, bArrConcatenateArray.length);
        byte[] bArr5 = new byte[0];
        for (int i10 = this.f91041e - 2; i10 >= 0; i10--) {
            byte[] bArrConcatenateArray2 = gMSSUtil.concatenateArray(this.f91046j[i10]);
            byte[] bArrIntToBytesLittleEndian2 = gMSSUtil.intToBytesLittleEndian(this.f91045i[i10]);
            int length2 = bArr5.length;
            byte[] bArr6 = new byte[length2];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            bArr5 = new byte[bArrIntToBytesLittleEndian2.length + length2 + this.f91047k[i10].length + bArrConcatenateArray2.length];
            System.arraycopy(bArr6, 0, bArr5, 0, length2);
            System.arraycopy(bArrIntToBytesLittleEndian2, 0, bArr5, length2, bArrIntToBytesLittleEndian2.length);
            byte[] bArr7 = this.f91047k[i10];
            System.arraycopy(bArr7, 0, bArr5, bArrIntToBytesLittleEndian2.length + length2, bArr7.length);
            System.arraycopy(bArrConcatenateArray2, 0, bArr5, length2 + bArrIntToBytesLittleEndian2.length + this.f91047k[i10].length, bArrConcatenateArray2.length);
        }
        byte[] bArr8 = new byte[bArr5.length + length];
        System.arraycopy(bArr4, 0, bArr8, 0, length);
        System.arraycopy(bArr5, 0, bArr8, length, bArr5.length);
        return bArr8;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (z10) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                parametersWithRandom.getRandom();
                this.f91049n = (GMSSPrivateKeyParameters) parametersWithRandom.getParameters();
            } else {
                CryptoServicesRegistrar.getSecureRandom();
                this.f91049n = (GMSSPrivateKeyParameters) cipherParameters;
            }
            a();
            return;
        }
        this.f91049n = (GMSSPublicKeyParameters) cipherParameters;
        this.f91039c.reset();
        GMSSPublicKeyParameters gMSSPublicKeyParameters = (GMSSPublicKeyParameters) this.f91049n;
        this.f91038b = gMSSPublicKeyParameters.getPublicKey();
        GMSSParameters parameters = gMSSPublicKeyParameters.getParameters();
        this.f91048l = parameters;
        this.f91041e = parameters.getNumOfLayers();
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        this.f91042f.reset();
        int i10 = 0;
        for (int i11 = this.f91041e - 1; i11 >= 0; i11--) {
            WinternitzOTSVerify winternitzOTSVerify = new WinternitzOTSVerify(this.f91044h.get(), this.f91048l.getWinternitzParameter()[i11]);
            int signatureLength = winternitzOTSVerify.getSignatureLength();
            int iBytesToIntLittleEndian = this.f91037a.bytesToIntLittleEndian(bArr2, i10);
            int i12 = i10 + 4;
            byte[] bArr3 = new byte[signatureLength];
            System.arraycopy(bArr2, i12, bArr3, 0, signatureLength);
            i10 = i12 + signatureLength;
            bArr = winternitzOTSVerify.Verify(bArr, bArr3);
            if (bArr == null) {
                System.err.println("OTS Public Key is null in GMSSSignature.verify");
                return false;
            }
            int i13 = this.f91048l.getHeightOfTrees()[i11];
            int i14 = this.f91040d;
            byte[][] bArr4 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i13, i14);
            for (byte[] bArr5 : bArr4) {
                System.arraycopy(bArr2, i10, bArr5, 0, i14);
                i10 += i14;
            }
            byte[] bArr6 = new byte[i14];
            int length = (1 << bArr4.length) + iBytesToIntLittleEndian;
            int i15 = 0;
            while (i15 < bArr4.length) {
                int i16 = i14 << 1;
                byte[] bArr7 = new byte[i16];
                if (length % 2 == 0) {
                    System.arraycopy(bArr, 0, bArr7, 0, i14);
                    System.arraycopy(bArr4[i15], 0, bArr7, i14, i14);
                } else {
                    System.arraycopy(bArr4[i15], 0, bArr7, 0, i14);
                    System.arraycopy(bArr, 0, bArr7, i14, bArr.length);
                    length--;
                }
                length /= 2;
                Digest digest = this.f91039c;
                digest.update(bArr7, 0, i16);
                byte[] bArr8 = new byte[digest.getDigestSize()];
                digest.doFinal(bArr8, 0);
                i15++;
                bArr = bArr8;
            }
        }
        return Arrays.areEqual(this.f91038b, bArr);
    }
}
