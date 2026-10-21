package bc.org.bouncycastle.crypto.params;

/* JADX INFO: loaded from: classes2.dex */
public class a extends AsymmetricKeyParameter {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ECDomainParameters f24998k;

    public a(boolean z10, ECDomainParameters eCDomainParameters) {
        super(z10);
        this.f24998k = eCDomainParameters;
    }

    public ECDomainParameters getParameters() {
        return this.f24998k;
    }
}
