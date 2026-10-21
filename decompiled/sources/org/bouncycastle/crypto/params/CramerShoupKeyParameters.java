package org.bouncycastle.crypto.params;

/* JADX INFO: loaded from: classes5.dex */
public class CramerShoupKeyParameters extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final CramerShoupParameters f89207q0;

    public CramerShoupKeyParameters(boolean z10, CramerShoupParameters cramerShoupParameters) {
        super(z10);
        this.f89207q0 = cramerShoupParameters;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CramerShoupKeyParameters)) {
            return false;
        }
        CramerShoupParameters cramerShoupParameters = this.f89207q0;
        CramerShoupParameters parameters = ((CramerShoupKeyParameters) obj).getParameters();
        if (cramerShoupParameters == null) {
            return parameters == null;
        }
        return cramerShoupParameters.equals(parameters);
    }

    public CramerShoupParameters getParameters() {
        return this.f89207q0;
    }

    public int hashCode() {
        int i10 = !isPrivate() ? 1 : 0;
        CramerShoupParameters cramerShoupParameters = this.f89207q0;
        return cramerShoupParameters != null ? i10 ^ cramerShoupParameters.hashCode() : i10;
    }
}
