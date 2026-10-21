package bc.org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class ECPrivateKeyParameters extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final BigInteger f24993l;

    public ECPrivateKeyParameters(BigInteger bigInteger, ECDomainParameters eCDomainParameters) {
        super(true, eCDomainParameters);
        this.f24993l = bigInteger;
    }

    public BigInteger getD() {
        return this.f24993l;
    }
}
