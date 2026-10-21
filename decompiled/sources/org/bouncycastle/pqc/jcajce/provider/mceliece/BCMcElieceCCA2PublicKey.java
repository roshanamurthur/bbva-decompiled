package org.bouncycastle.pqc.jcajce.provider.mceliece;

import androidx.camera.core.processing.f;
import bn.a;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.pinning.constant.ConstantKt;
import java.io.IOException;
import java.security.PublicKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.pqc.asn1.McElieceCCA2PublicKey;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.crypto.mceliece.McElieceCCA2PublicKeyParameters;
import org.bouncycastle.pqc.math.linearalgebra.GF2Matrix;

/* JADX INFO: loaded from: classes13.dex */
public class BCMcElieceCCA2PublicKey implements CipherParameters, PublicKey {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final McElieceCCA2PublicKeyParameters f91453p0;

    public BCMcElieceCCA2PublicKey(McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters) {
        this.f91453p0 = mcElieceCCA2PublicKeyParameters;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BCMcElieceCCA2PublicKey)) {
            return false;
        }
        BCMcElieceCCA2PublicKey bCMcElieceCCA2PublicKey = (BCMcElieceCCA2PublicKey) obj;
        McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters = this.f91453p0;
        return mcElieceCCA2PublicKeyParameters.getN() == bCMcElieceCCA2PublicKey.getN() && mcElieceCCA2PublicKeyParameters.getT() == bCMcElieceCCA2PublicKey.getT() && mcElieceCCA2PublicKeyParameters.getG().equals(bCMcElieceCCA2PublicKey.getG());
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters = this.f91453p0;
        try {
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.mcElieceCca2), new McElieceCCA2PublicKey(mcElieceCCA2PublicKeyParameters.getN(), mcElieceCCA2PublicKeyParameters.getT(), mcElieceCCA2PublicKeyParameters.getG(), a.c(mcElieceCCA2PublicKeyParameters.getDigest()))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return ConstantKt.CERTIFICATE_TYPE_X509;
    }

    public GF2Matrix getG() {
        return this.f91453p0.getG();
    }

    public int getK() {
        return this.f91453p0.getK();
    }

    public int getN() {
        return this.f91453p0.getN();
    }

    public int getT() {
        return this.f91453p0.getT();
    }

    public int hashCode() {
        McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters = this.f91453p0;
        return mcElieceCCA2PublicKeyParameters.getG().hashCode() + (((mcElieceCCA2PublicKeyParameters.getT() * 37) + mcElieceCCA2PublicKeyParameters.getN()) * 37);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("McEliecePublicKey:\n length of the code         : ");
        McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters = this.f91453p0;
        sb2.append(mcElieceCCA2PublicKeyParameters.getN());
        sb2.append(RootService.LINE_BREAK);
        StringBuilder sbE = f.e(sb2.toString(), " error correction capability: ");
        sbE.append(mcElieceCCA2PublicKeyParameters.getT());
        sbE.append(RootService.LINE_BREAK);
        StringBuilder sbE2 = f.e(sbE.toString(), " generator matrix           : ");
        sbE2.append(mcElieceCCA2PublicKeyParameters.getG().toString());
        return sbE2.toString();
    }
}
