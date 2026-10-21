package org.bouncycastle.pqc.crypto.lms;

import androidx.databinding.c;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.WeakHashMap;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.pqc.crypto.ExhaustedPrivateKeyException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.io.Streams;
import um.h;

/* JADX INFO: loaded from: classes13.dex */
public class LMSPrivateKeyParameters extends LMSKeyParameters {
    public static final a F0;
    public static final a[] G0;
    public final ExtendedDigest E0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final byte[] f91103q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final LMSigParameters f91104r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final LMOtsParameters f91105s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final int f91106t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final byte[] f91107u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public LMSPublicKeyParameters f91108w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final int f91109x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final Map<a, byte[]> f91110y0;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f91111a;

        public a(int i10) {
            this.f91111a = i10;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof a) && ((a) obj).f91111a == this.f91111a;
        }

        public final int hashCode() {
            return this.f91111a;
        }
    }

    static {
        a aVar = new a(1);
        F0 = aVar;
        a[] aVarArr = new a[129];
        G0 = aVarArr;
        aVarArr[1] = aVar;
        int i10 = 2;
        while (true) {
            a[] aVarArr2 = G0;
            if (i10 >= aVarArr2.length) {
                return;
            }
            aVarArr2[i10] = new a(i10);
            i10++;
        }
    }

    public LMSPrivateKeyParameters(LMSPrivateKeyParameters lMSPrivateKeyParameters, int i10, int i11) {
        super(true);
        LMSigParameters lMSigParameters = lMSPrivateKeyParameters.f91104r0;
        this.f91104r0 = lMSigParameters;
        this.f91105s0 = lMSPrivateKeyParameters.f91105s0;
        this.v0 = i10;
        this.f91103q0 = lMSPrivateKeyParameters.f91103q0;
        this.f91106t0 = i11;
        this.f91107u0 = lMSPrivateKeyParameters.f91107u0;
        this.f91109x0 = 1 << lMSigParameters.getH();
        this.f91110y0 = lMSPrivateKeyParameters.f91110y0;
        this.E0 = um.a.a(lMSigParameters.getDigestOID());
        this.f91108w0 = lMSPrivateKeyParameters.f91108w0;
    }

    public static LMSPrivateKeyParameters getInstance(Object obj) throws Throwable {
        if (obj instanceof LMSPrivateKeyParameters) {
            return (LMSPrivateKeyParameters) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            if (dataInputStream.readInt() != 0) {
                throw new IllegalStateException("expected version 0 lms private key");
            }
            LMSigParameters lMSigParameters = LMSigParameters.f91118e.get(Integer.valueOf(dataInputStream.readInt()));
            LMOtsParameters parametersForType = LMOtsParameters.getParametersForType(dataInputStream.readInt());
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            int i10 = dataInputStream.readInt();
            int i11 = dataInputStream.readInt();
            int i12 = dataInputStream.readInt();
            if (i12 < 0) {
                throw new IllegalStateException("secret length less than zero");
            }
            if (i12 <= dataInputStream.available()) {
                byte[] bArr2 = new byte[i12];
                dataInputStream.readFully(bArr2);
                return new LMSPrivateKeyParameters(lMSigParameters, parametersForType, i10, bArr, i11, bArr2);
            }
            throw new IOException("secret length exceeded " + dataInputStream.available());
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj));
            }
            throw new IllegalArgumentException(c.c("cannot parse ", obj));
        }
        DataInputStream dataInputStream2 = null;
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                LMSPrivateKeyParameters lMSPrivateKeyParameters = getInstance(dataInputStream3);
                dataInputStream3.close();
                return lMSPrivateKeyParameters;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 != null) {
                    dataInputStream2.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final byte[] a(int i10) {
        int h4 = 1 << getSigParameters().getH();
        ExtendedDigest extendedDigest = this.E0;
        if (i10 < h4) {
            int i11 = i10 * 2;
            byte[] bArrB = b(i11);
            byte[] bArrB2 = b(i11 + 1);
            af.a.a(extendedDigest, getI());
            af.a.c(i10, extendedDigest);
            af.a.b((short) -31869, extendedDigest);
            extendedDigest.update(bArrB, 0, bArrB.length);
            extendedDigest.update(bArrB2, 0, bArrB2.length);
            byte[] bArr = new byte[extendedDigest.getDigestSize()];
            extendedDigest.doFinal(bArr, 0);
            return bArr;
        }
        af.a.a(extendedDigest, getI());
        af.a.c(i10, extendedDigest);
        af.a.b((short) -32126, extendedDigest);
        LMOtsParameters otsParameters = getOtsParameters();
        byte[] i12 = getI();
        int i13 = i10 - h4;
        byte[] masterSecret = getMasterSecret();
        ExtendedDigest extendedDigestA = um.a.a(otsParameters.getDigestOID());
        byte[] bArrBuild = Composer.compose().bytes(i12).u32str(i13).u16str(-32640).padUntil(0, 22).build();
        extendedDigestA.update(bArrBuild, 0, bArrBuild.length);
        ExtendedDigest extendedDigestA2 = um.a.a(otsParameters.getDigestOID());
        byte[] bArrBuild2 = Composer.compose().bytes(i12).u32str(i13).padUntil(0, extendedDigestA2.getDigestSize() + 23).build();
        h hVar = new h(i12, masterSecret, um.a.a(otsParameters.getDigestOID()));
        hVar.f93897d = i13;
        hVar.f93898e = 0;
        int p4 = otsParameters.getP();
        int n7 = otsParameters.getN();
        int w6 = (1 << otsParameters.getW()) - 1;
        int i14 = 0;
        while (i14 < p4) {
            hVar.a(i14 < p4 + (-1), 23, bArrBuild2);
            Pack.shortToBigEndian((short) i14, bArrBuild2, 20);
            for (int i15 = 0; i15 < w6; i15++) {
                bArrBuild2[22] = (byte) i15;
                extendedDigestA2.update(bArrBuild2, 0, bArrBuild2.length);
                extendedDigestA2.doFinal(bArrBuild2, 23);
            }
            extendedDigestA.update(bArrBuild2, 23, n7);
            i14++;
        }
        int digestSize = extendedDigestA.getDigestSize();
        byte[] bArr2 = new byte[digestSize];
        extendedDigestA.doFinal(bArr2, 0);
        extendedDigest.update(bArr2, 0, digestSize);
        byte[] bArr3 = new byte[extendedDigest.getDigestSize()];
        extendedDigest.doFinal(bArr3, 0);
        return bArr3;
    }

    public final byte[] b(int i10) {
        if (i10 < this.f91109x0) {
            return c(i10 < 129 ? G0[i10] : new a(i10));
        }
        return a(i10);
    }

    public final byte[] c(a aVar) {
        synchronized (this.f91110y0) {
            try {
                byte[] bArr = this.f91110y0.get(aVar);
                if (bArr != null) {
                    return bArr;
                }
                byte[] bArrA = a(aVar.f91111a);
                this.f91110y0.put(aVar, bArrA);
                return bArrA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public um.c d() {
        um.c cVar;
        synchronized (this) {
            try {
                int i10 = this.v0;
                if (i10 >= this.f91106t0) {
                    throw new ExhaustedPrivateKeyException("ots private key exhausted");
                }
                cVar = new um.c(this.f91105s0, this.f91103q0, i10, this.f91107u0);
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    public final synchronized void e() {
        this.v0++;
    }

    public boolean equals(Object obj) {
        LMSPublicKeyParameters lMSPublicKeyParameters;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LMSPrivateKeyParameters lMSPrivateKeyParameters = (LMSPrivateKeyParameters) obj;
        if (this.v0 != lMSPrivateKeyParameters.v0 || this.f91106t0 != lMSPrivateKeyParameters.f91106t0 || !Arrays.areEqual(this.f91103q0, lMSPrivateKeyParameters.f91103q0)) {
            return false;
        }
        LMSigParameters lMSigParameters = lMSPrivateKeyParameters.f91104r0;
        LMSigParameters lMSigParameters2 = this.f91104r0;
        if (lMSigParameters2 == null ? lMSigParameters != null : !lMSigParameters2.equals(lMSigParameters)) {
            return false;
        }
        LMOtsParameters lMOtsParameters = lMSPrivateKeyParameters.f91105s0;
        LMOtsParameters lMOtsParameters2 = this.f91105s0;
        if (lMOtsParameters2 == null ? lMOtsParameters != null : !lMOtsParameters2.equals(lMOtsParameters)) {
            return false;
        }
        if (!Arrays.areEqual(this.f91107u0, lMSPrivateKeyParameters.f91107u0)) {
            return false;
        }
        LMSPublicKeyParameters lMSPublicKeyParameters2 = this.f91108w0;
        if (lMSPublicKeyParameters2 == null || (lMSPublicKeyParameters = lMSPrivateKeyParameters.f91108w0) == null) {
            return true;
        }
        return lMSPublicKeyParameters2.equals(lMSPublicKeyParameters);
    }

    public LMSPrivateKeyParameters extractKeyShard(int i10) {
        LMSPrivateKeyParameters lMSPrivateKeyParameters;
        synchronized (this) {
            try {
                int i11 = this.v0;
                if (i11 + i10 >= this.f91106t0) {
                    throw new IllegalArgumentException("usageCount exceeds usages remaining");
                }
                lMSPrivateKeyParameters = new LMSPrivateKeyParameters(this, i11, i11 + i10);
                this.v0 += i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lMSPrivateKeyParameters;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSKeyParameters, org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        Composer composerU32str = Composer.compose().u32str(0).u32str(this.f91104r0.getType()).u32str(this.f91105s0.getType()).bytes(this.f91103q0).u32str(this.v0).u32str(this.f91106t0);
        byte[] bArr = this.f91107u0;
        return composerU32str.u32str(bArr.length).bytes(bArr).build();
    }

    public byte[] getI() {
        return Arrays.clone(this.f91103q0);
    }

    public synchronized int getIndex() {
        return this.v0;
    }

    public byte[] getMasterSecret() {
        return Arrays.clone(this.f91107u0);
    }

    public LMOtsParameters getOtsParameters() {
        return this.f91105s0;
    }

    public LMSPublicKeyParameters getPublicKey() {
        LMSPublicKeyParameters lMSPublicKeyParameters;
        synchronized (this) {
            try {
                if (this.f91108w0 == null) {
                    this.f91108w0 = new LMSPublicKeyParameters(this.f91104r0, this.f91105s0, c(F0), this.f91103q0);
                }
                lMSPublicKeyParameters = this.f91108w0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lMSPublicKeyParameters;
    }

    public LMSigParameters getSigParameters() {
        return this.f91104r0;
    }

    public long getUsagesRemaining() {
        return this.f91106t0 - this.v0;
    }

    public int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f91103q0) + (this.v0 * 31)) * 31;
        LMSigParameters lMSigParameters = this.f91104r0;
        int iHashCode2 = (iHashCode + (lMSigParameters != null ? lMSigParameters.hashCode() : 0)) * 31;
        LMOtsParameters lMOtsParameters = this.f91105s0;
        int iHashCode3 = (Arrays.hashCode(this.f91107u0) + ((((iHashCode2 + (lMOtsParameters != null ? lMOtsParameters.hashCode() : 0)) * 31) + this.f91106t0) * 31)) * 31;
        LMSPublicKeyParameters lMSPublicKeyParameters = this.f91108w0;
        return iHashCode3 + (lMSPublicKeyParameters != null ? lMSPublicKeyParameters.hashCode() : 0);
    }

    public LMSPrivateKeyParameters(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters, int i10, byte[] bArr, int i11, byte[] bArr2) {
        super(true);
        this.f91104r0 = lMSigParameters;
        this.f91105s0 = lMOtsParameters;
        this.v0 = i10;
        this.f91103q0 = Arrays.clone(bArr);
        this.f91106t0 = i11;
        this.f91107u0 = Arrays.clone(bArr2);
        this.f91109x0 = 1 << (lMSigParameters.getH() + 1);
        this.f91110y0 = new WeakHashMap();
        this.E0 = um.a.a(lMSigParameters.getDigestOID());
    }

    public static LMSPrivateKeyParameters getInstance(byte[] bArr, byte[] bArr2) throws Throwable {
        LMSPrivateKeyParameters lMSPrivateKeyParameters = getInstance(bArr);
        lMSPrivateKeyParameters.f91108w0 = LMSPublicKeyParameters.getInstance(bArr2);
        return lMSPrivateKeyParameters;
    }
}
