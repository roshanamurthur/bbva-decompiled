package bc.org.bouncycastle.math.ec;

/* JADX INFO: loaded from: classes2.dex */
public class ScaleXPointMap implements ECPointMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final ECFieldElement f25044a;

    public ScaleXPointMap(ECFieldElement eCFieldElement) {
        this.f25044a = eCFieldElement;
    }

    @Override // bc.org.bouncycastle.math.ec.ECPointMap
    public ECPoint map(ECPoint eCPoint) {
        return eCPoint.scaleX(this.f25044a);
    }
}
