package um;

import androidx.appcompat.widget.z;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.pqc.crypto.lms.Composer;
import org.bouncycastle.pqc.crypto.lms.LMOtsParameters;
import org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSigParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes13.dex */
public final class e {
    public static LMSPrivateKeyParameters a(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters, int i10, byte[] bArr, byte[] bArr2) throws IllegalArgumentException {
        if (bArr2 != null && bArr2.length >= lMSigParameters.getM()) {
            return new LMSPrivateKeyParameters(lMSigParameters, lMOtsParameters, i10, bArr, 1 << lMSigParameters.getH(), bArr2);
        }
        throw new IllegalArgumentException("root seed is less than " + lMSigParameters.getM());
    }

    public static f b(LMSPrivateKeyParameters lMSPrivateKeyParameters, byte[] bArr) {
        LMSigParameters sigParameters = lMSPrivateKeyParameters.getSigParameters();
        int h4 = sigParameters.getH();
        int index = lMSPrivateKeyParameters.getIndex();
        c cVarD = lMSPrivateKeyParameters.d();
        LMOtsParameters lMOtsParameters = cVarD.f93881a;
        int n7 = lMOtsParameters.getN();
        int p4 = lMOtsParameters.getP();
        int w6 = lMOtsParameters.getW();
        byte[] bArr2 = new byte[p4 * n7];
        byte[] bArr3 = new byte[32];
        LMOtsParameters lMOtsParameters2 = cVarD.f93881a;
        ExtendedDigest extendedDigestA = a.a(lMOtsParameters2.getDigestOID());
        byte[] bArr4 = cVarD.f93882b;
        byte[] bArr5 = cVarD.f93884d;
        h hVar = new h(bArr4, bArr5, extendedDigestA);
        int i10 = cVarD.f93883c;
        hVar.f93897d = i10;
        hVar.f93898e = -3;
        hVar.a(false, 0, bArr3);
        h hVar2 = new h(bArr4, bArr5, a.a(lMOtsParameters2.getDigestOID()));
        hVar2.f93897d = i10;
        byte[] bArr6 = new byte[34];
        ExtendedDigest extendedDigestA2 = a.a(lMOtsParameters.getDigestOID());
        af.a.a(extendedDigestA2, bArr4);
        af.a.c(i10, extendedDigestA2);
        af.a.b((short) -32383, extendedDigestA2);
        extendedDigestA2.update(bArr3, 0, 32);
        extendedDigestA2.update(bArr, 0, bArr.length);
        extendedDigestA2.doFinal(bArr6, 0);
        int iB = z.b(bArr6, n7, lMOtsParameters);
        bArr6[n7] = (byte) ((iB >>> 8) & 255);
        bArr6[n7 + 1] = (byte) iB;
        int i11 = n7 + 23;
        byte[] bArrBuild = Composer.compose().bytes(bArr4).u32str(i10).padUntil(0, i11).build();
        hVar2.f93898e = 0;
        int i12 = 0;
        while (i12 < p4) {
            Pack.shortToBigEndian((short) i12, bArrBuild, 20);
            hVar2.a(i12 < p4 + (-1), 23, bArrBuild);
            int iC = z.c(i12, w6, bArr6);
            int i13 = 0;
            while (i13 < iC) {
                bArrBuild[22] = (byte) i13;
                extendedDigestA2.update(bArrBuild, 0, i11);
                extendedDigestA2.doFinal(bArrBuild, 23);
                i13++;
                p4 = p4;
            }
            System.arraycopy(bArrBuild, 23, bArr2, n7 * i12, n7);
            i12++;
            p4 = p4;
        }
        d dVar = new d(lMOtsParameters, bArr3, bArr2);
        int i14 = (1 << h4) + index;
        byte[][] bArr7 = new byte[h4][];
        for (int i15 = 0; i15 < h4; i15++) {
            bArr7[i15] = lMSPrivateKeyParameters.b((i14 / (1 << i15)) ^ 1);
        }
        return new f(index, dVar, sigParameters, bArr7);
    }

    public static boolean c(LMSPublicKeyParameters lMSPublicKeyParameters, f fVar, byte[] bArr) {
        byte[] bArr2 = lMSPublicKeyParameters.f91114s0;
        int type = lMSPublicKeyParameters.getOtsParameters().getType();
        int i10 = fVar.f93888p0;
        d dVar = fVar.f93889q0;
        if (dVar.f93885p0.getType() != type) {
            throw new IllegalArgumentException("ots type from lsm signature does not match ots signature type from embedded ots signature");
        }
        LMSigParameters lMSigParameters = fVar.f93890r0;
        lMSigParameters.getM();
        int h4 = lMSigParameters.getH();
        LMOtsParameters parametersForType = LMOtsParameters.getParametersForType(type);
        byte[] bArr3 = new byte[34];
        ExtendedDigest extendedDigestA = a.a(parametersForType.getDigestOID());
        extendedDigestA.update(bArr2, 0, bArr2.length);
        af.a.c(i10, extendedDigestA);
        af.a.b((short) -32383, extendedDigestA);
        af.a.a(extendedDigestA, dVar.f93886q0);
        extendedDigestA.update(bArr, 0, bArr.length);
        extendedDigestA.doFinal(bArr3, 0);
        int n7 = parametersForType.getN();
        int w6 = parametersForType.getW();
        int p4 = parametersForType.getP();
        int iB = z.b(bArr3, n7, parametersForType);
        bArr3[n7] = (byte) ((iB >>> 8) & 255);
        bArr3[n7 + 1] = (byte) iB;
        ExtendedDigest extendedDigestA2 = a.a(parametersForType.getDigestOID());
        extendedDigestA2.update(bArr2, 0, bArr2.length);
        af.a.c(i10, extendedDigestA2);
        af.a.b((short) -32640, extendedDigestA2);
        int i11 = n7 + 23;
        byte[] bArrBuild = Composer.compose().bytes(bArr2).u32str(i10).padUntil(0, i11).build();
        int i12 = (1 << w6) - 1;
        ExtendedDigest extendedDigestA3 = a.a(parametersForType.getDigestOID());
        int i13 = 0;
        while (i13 < p4) {
            int i14 = p4;
            Pack.shortToBigEndian((short) i13, bArrBuild, 20);
            byte[] bArr4 = dVar.f93887r0;
            d dVar2 = dVar;
            int i15 = 23;
            System.arraycopy(bArr4, i13 * n7, bArrBuild, 23, n7);
            int iC = z.c(i13, w6, bArr3);
            while (iC < i12) {
                bArrBuild[22] = (byte) iC;
                extendedDigestA3.update(bArrBuild, 0, i11);
                extendedDigestA3.doFinal(bArrBuild, 23);
                iC++;
                i15 = 23;
            }
            extendedDigestA2.update(bArrBuild, i15, n7);
            i13++;
            p4 = i14;
            dVar = dVar2;
        }
        byte[] bArr5 = new byte[n7];
        extendedDigestA2.doFinal(bArr5, 0);
        int i16 = (1 << h4) + i10;
        ExtendedDigest extendedDigestA4 = a.a(lMSigParameters.getDigestOID());
        int digestSize = extendedDigestA4.getDigestSize();
        byte[] bArr6 = new byte[digestSize];
        extendedDigestA4.update(bArr2, 0, bArr2.length);
        af.a.c(i16, extendedDigestA4);
        af.a.b((short) -32126, extendedDigestA4);
        extendedDigestA4.update(bArr5, 0, n7);
        extendedDigestA4.doFinal(bArr6, 0);
        int i17 = 0;
        while (i16 > 1) {
            int i18 = i16 & 1;
            byte[][] bArr7 = fVar.f93891s0;
            if (i18 == 1) {
                extendedDigestA4.update(bArr2, 0, bArr2.length);
                af.a.c(i16 / 2, extendedDigestA4);
                af.a.b((short) -31869, extendedDigestA4);
                byte[] bArr8 = bArr7[i17];
                extendedDigestA4.update(bArr8, 0, bArr8.length);
                extendedDigestA4.update(bArr6, 0, digestSize);
            } else {
                extendedDigestA4.update(bArr2, 0, bArr2.length);
                af.a.c(i16 / 2, extendedDigestA4);
                af.a.b((short) -31869, extendedDigestA4);
                extendedDigestA4.update(bArr6, 0, digestSize);
                byte[] bArr9 = bArr7[i17];
                extendedDigestA4.update(bArr9, 0, bArr9.length);
            }
            extendedDigestA4.doFinal(bArr6, 0);
            i16 /= 2;
            i17++;
        }
        return Arrays.areEqual(lMSPublicKeyParameters.f91115t0, bArr6);
    }
}
