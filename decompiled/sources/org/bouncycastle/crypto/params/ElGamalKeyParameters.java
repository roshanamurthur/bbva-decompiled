package org.bouncycastle.crypto.params;

/* JADX INFO: loaded from: classes5.dex */
public class ElGamalKeyParameters extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ElGamalParameters f89290q0;

    public ElGamalKeyParameters(boolean z10, ElGamalParameters elGamalParameters) {
        super(z10);
        this.f89290q0 = elGamalParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ElGamalKeyParameters)) {
            return false;
        }
        ElGamalParameters elGamalParameters = this.f89290q0;
        ElGamalParameters parameters = ((ElGamalKeyParameters) obj).getParameters();
        if (elGamalParameters == null) {
            return parameters == null;
        }
        return elGamalParameters.equals(parameters);
    }

    public ElGamalParameters getParameters() {
        return this.f89290q0;
    }

    public int hashCode() {
        ElGamalParameters elGamalParameters = this.f89290q0;
        if (elGamalParameters != null) {
            return elGamalParameters.hashCode();
        }
        return 0;
    }
}
