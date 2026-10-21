package org.bouncycastle.pqc.jcajce.provider.mceliece;

import androidx.camera.core.processing.f;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.pqc.asn1.McEliecePublicKey;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.crypto.mceliece.McEliecePublicKeyParameters;
import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;

/* JADX INFO: loaded from: classes13.dex */
public class BCMcEliecePublicKey implements PublicKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final McEliecePublicKeyParameters f91455p0;

    public BCMcEliecePublicKey(McEliecePublicKeyParameters mcEliecePublicKeyParameters) {
        this.f91455p0 = mcEliecePublicKeyParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCMcEliecePublicKey)) {
            return false;
        }
        BCMcEliecePublicKey bCMcEliecePublicKey = (BCMcEliecePublicKey) obj;
        McEliecePublicKeyParameters mcEliecePublicKeyParameters = this.f91455p0;
        return mcEliecePublicKeyParameters.getN() == bCMcEliecePublicKey.getN() && mcEliecePublicKeyParameters.getT() == bCMcEliecePublicKey.getT() && mcEliecePublicKeyParameters.getG().equals(bCMcEliecePublicKey.getG());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        McEliecePublicKeyParameters mcEliecePublicKeyParameters = this.f91455p0;
        try {
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.mcEliece), new McEliecePublicKey(mcEliecePublicKeyParameters.getN(), mcEliecePublicKeyParameters.getT(), mcEliecePublicKeyParameters.getG())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return ConstantKt.CERTIFICATE_TYPE_X509;
    }

    public GF2Matrix getG() {
        return this.f91455p0.getG();
    }

    public int getK() {
        return this.f91455p0.getK();
    }

    public int getN() {
        return this.f91455p0.getN();
    }

    public int getT() {
        return this.f91455p0.getT();
    }

    public int hashCode() {
        McEliecePublicKeyParameters mcEliecePublicKeyParameters = this.f91455p0;
        return mcEliecePublicKeyParameters.getG().hashCode() + (((mcEliecePublicKeyParameters.getT() * 37) + mcEliecePublicKeyParameters.getN()) * 37);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("McEliecePublicKey:\n length of the code         : ");
        McEliecePublicKeyParameters mcEliecePublicKeyParameters = this.f91455p0;
        sb2.append(mcEliecePublicKeyParameters.getN());
        sb2.append(RootService.LINE_BREAK);
        StringBuilder sbE = f.e(sb2.toString(), " error correction capability: ");
        sbE.append(mcEliecePublicKeyParameters.getT());
        sbE.append(RootService.LINE_BREAK);
        StringBuilder sbE2 = f.e(sbE.toString(), " generator matrix           : ");
        sbE2.append(mcEliecePublicKeyParameters.getG());
        return sbE2.toString();
    }
}
