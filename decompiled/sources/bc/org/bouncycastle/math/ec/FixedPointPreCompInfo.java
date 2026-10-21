package bc.org.bouncycastle.math.ec;

/* JADX INFO: loaded from: classes2.dex */
public class FixedPointPreCompInfo implements PreCompInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ECPoint f25037a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected ECPoint[] f25038b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f25039c = -1;

    public ECPoint getOffset() {
        return this.f25037a;
    }

    public ECPoint[] getPreComp() {
        return this.f25038b;
    }

    public int getWidth() {
        return this.f25039c;
    }

    public void setOffset(ECPoint eCPoint) {
        this.f25037a = eCPoint;
    }

    public void setPreComp(ECPoint[] eCPointArr) {
        this.f25038b = eCPointArr;
    }

    public void setWidth(int i10) {
        this.f25039c = i10;
    }
}
