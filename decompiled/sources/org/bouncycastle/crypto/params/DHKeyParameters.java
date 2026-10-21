package org.bouncycastle.crypto.params;

/* JADX INFO: loaded from: classes5.dex */
public class DHKeyParameters extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final DHParameters f89222q0;

    public DHKeyParameters(boolean z10, DHParameters dHParameters) {
        super(z10);
        this.f89222q0 = dHParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DHKeyParameters)) {
            return false;
        }
        DHParameters dHParameters = this.f89222q0;
        DHParameters parameters = ((DHKeyParameters) obj).getParameters();
        if (dHParameters == null) {
            return parameters == null;
        }
        return dHParameters.equals(parameters);
    }

    public DHParameters getParameters() {
        return this.f89222q0;
    }

    public int hashCode() {
        int i10 = !isPrivate() ? 1 : 0;
        DHParameters dHParameters = this.f89222q0;
        return dHParameters != null ? i10 ^ dHParameters.hashCode() : i10;
    }
}
