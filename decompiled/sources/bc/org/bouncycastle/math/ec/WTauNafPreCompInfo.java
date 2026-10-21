package bc.org.bouncycastle.math.ec;

/* JADX INFO: loaded from: classes2.dex */
public class WTauNafPreCompInfo implements PreCompInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ECPoint.AbstractF2m[] f25053a = null;

    public ECPoint.AbstractF2m[] getPreComp() {
        return this.f25053a;
    }

    public void setPreComp(ECPoint.AbstractF2m[] abstractF2mArr) {
        this.f25053a = abstractF2mArr;
    }
}
