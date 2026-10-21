package bc.org.bouncycastle.math.ec;

/* JADX INFO: loaded from: classes2.dex */
public class WNafPreCompInfo implements PreCompInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ECPoint[] f25046a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ECPoint[] f25047b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ECPoint f25048c = null;

    public ECPoint[] getPreComp() {
        return this.f25046a;
    }

    public ECPoint[] getPreCompNeg() {
        return this.f25047b;
    }

    public ECPoint getTwice() {
        return this.f25048c;
    }

    public void setPreComp(ECPoint[] eCPointArr) {
        this.f25046a = eCPointArr;
    }

    public void setPreCompNeg(ECPoint[] eCPointArr) {
        this.f25047b = eCPointArr;
    }

    public void setTwice(ECPoint eCPoint) {
        this.f25048c = eCPoint;
    }
}
