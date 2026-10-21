package bc.org.bouncycastle.math.ec;

/* JADX INFO: loaded from: classes2.dex */
public class ScaleYPointMap implements ECPointMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ECFieldElement f25045a;

    public ScaleYPointMap(ECFieldElement eCFieldElement) {
        this.f25045a = eCFieldElement;
    }

    @Override // bc.org.bouncycastle.math.ec.ECPointMap
    public ECPoint map(ECPoint eCPoint) {
        return eCPoint.scaleY(this.f25045a);
    }
}
