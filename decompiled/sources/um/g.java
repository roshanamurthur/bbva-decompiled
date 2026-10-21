package um;

import java.io.IOException;
import org.bouncycastle.pqc.crypto.lms.Composer;
import org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters;
import org.bouncycastle.util.Encodable;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements Encodable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final f f93892p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final LMSPublicKeyParameters f93893q0;

    public g(f fVar, LMSPublicKeyParameters lMSPublicKeyParameters) {
        this.f93892p0 = fVar;
        this.f93893q0 = lMSPublicKeyParameters;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        f fVar = gVar.f93892p0;
        f fVar2 = this.f93892p0;
        if (fVar2 == null ? fVar != null : !fVar2.equals(fVar)) {
            return false;
        }
        LMSPublicKeyParameters lMSPublicKeyParameters = gVar.f93893q0;
        LMSPublicKeyParameters lMSPublicKeyParameters2 = this.f93893q0;
        if (lMSPublicKeyParameters2 != null) {
            return lMSPublicKeyParameters2.equals(lMSPublicKeyParameters);
        }
        return lMSPublicKeyParameters == null;
    }

    @Override // org.bouncycastle.util.Encodable
    public final byte[] getEncoded() throws IOException {
        return Composer.compose().bytes(this.f93892p0.getEncoded()).bytes(this.f93893q0.getEncoded()).build();
    }

    public final int hashCode() {
        f fVar = this.f93892p0;
        int iHashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        LMSPublicKeyParameters lMSPublicKeyParameters = this.f93893q0;
        return iHashCode + (lMSPublicKeyParameters != null ? lMSPublicKeyParameters.hashCode() : 0);
    }
}
