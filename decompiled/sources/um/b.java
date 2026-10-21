package um;

import java.util.List;
import org.bouncycastle.pqc.crypto.ExhaustedPrivateKeyException;
import org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.lms.HSSSignature;
import org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    public static class a extends LMSPrivateKeyParameters {
        @Override // org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters
        public final c d() {
            throw new RuntimeException("placeholder only");
        }

        @Override // org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters
        public final LMSPublicKeyParameters getPublicKey() {
            throw new RuntimeException("placeholder only");
        }
    }

    public static HSSSignature a(HSSPrivateKeyParameters hSSPrivateKeyParameters, byte[] bArr) {
        synchronized (hSSPrivateKeyParameters) {
            try {
                b(hSSPrivateKeyParameters);
                List<LMSPrivateKeyParameters> listA = hSSPrivateKeyParameters.a();
                List<f> listB = hSSPrivateKeyParameters.b();
                int l6 = hSSPrivateKeyParameters.getL();
                int i10 = l6 - 1;
                f fVarB = e.b(hSSPrivateKeyParameters.a().get(i10), bArr);
                g[] gVarArr = new g[i10];
                int i11 = 0;
                while (i11 < i10) {
                    int i12 = i11 + 1;
                    gVarArr[i11] = new g(listB.get(i11), listA.get(i12).getPublicKey());
                    i11 = i12;
                }
                hSSPrivateKeyParameters.c();
                if (l6 == 1) {
                    return new HSSSignature(i10, gVarArr, fVarB);
                }
                return new HSSSignature(i10, gVarArr, fVarB);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b(HSSPrivateKeyParameters hSSPrivateKeyParameters) {
        synchronized (hSSPrivateKeyParameters) {
            try {
                if (hSSPrivateKeyParameters.getIndex() >= hSSPrivateKeyParameters.f91083u0) {
                    StringBuilder sb2 = new StringBuilder("hss private key");
                    sb2.append(hSSPrivateKeyParameters.f91080r0 ? " shard" : "");
                    sb2.append(" is exhausted");
                    throw new ExhaustedPrivateKeyException(sb2.toString());
                }
                int l6 = hSSPrivateKeyParameters.getL();
                List<LMSPrivateKeyParameters> listA = hSSPrivateKeyParameters.a();
                int i10 = l6;
                while (true) {
                    int i11 = i10 - 1;
                    if (listA.get(i11).getIndex() != (1 << listA.get(i11).getSigParameters().getH())) {
                        while (i10 < l6) {
                            hSSPrivateKeyParameters.d(i10);
                            i10++;
                        }
                    } else {
                        if (i11 == 0) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("hss private key");
                            sb3.append(hSSPrivateKeyParameters.f91080r0 ? " shard" : "");
                            sb3.append(" is exhausted the maximum limit for this HSS private key");
                            throw new ExhaustedPrivateKeyException(sb3.toString());
                        }
                        i10 = i11;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean c(HSSPublicKeyParameters hSSPublicKeyParameters, HSSSignature hSSSignature, byte[] bArr) {
        int i10 = hSSSignature.getlMinus1();
        int i11 = i10 + 1;
        if (i11 != hSSPublicKeyParameters.getL()) {
            return false;
        }
        f[] fVarArr = new f[i11];
        LMSPublicKeyParameters[] lMSPublicKeyParametersArr = new LMSPublicKeyParameters[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            fVarArr[i12] = hSSSignature.getSignedPubKey()[i12].f93892p0;
            lMSPublicKeyParametersArr[i12] = hSSSignature.getSignedPubKey()[i12].f93893q0;
        }
        fVarArr[i10] = hSSSignature.getSignature();
        LMSPublicKeyParameters lMSPublicKey = hSSPublicKeyParameters.getLMSPublicKey();
        for (int i13 = 0; i13 < i10; i13++) {
            if (!e.c(lMSPublicKey, fVarArr[i13], lMSPublicKeyParametersArr[i13].toByteArray())) {
                return false;
            }
            try {
                lMSPublicKey = lMSPublicKeyParametersArr[i13];
            } catch (Exception e5) {
                throw new IllegalStateException(e5.getMessage(), e5);
            }
        }
        return e.c(lMSPublicKey, fVarArr[i10], bArr);
    }
}
