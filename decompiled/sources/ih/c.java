package ih;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

/* JADX INFO: compiled from: BoundingBox.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitMatrix f69686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResultPoint f69687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResultPoint f69688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ResultPoint f69689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ResultPoint f69690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f69691f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f69692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f69693h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f69694i;

    public c(BitMatrix bitMatrix, ResultPoint resultPoint, ResultPoint resultPoint2, ResultPoint resultPoint3, ResultPoint resultPoint4) throws NotFoundException {
        boolean z10 = resultPoint == null || resultPoint2 == null;
        boolean z11 = resultPoint3 == null || resultPoint4 == null;
        if (z10 && z11) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (z10) {
            resultPoint = new ResultPoint(0.0f, resultPoint3.getY());
            resultPoint2 = new ResultPoint(0.0f, resultPoint4.getY());
        } else if (z11) {
            resultPoint3 = new ResultPoint(bitMatrix.getWidth() - 1, resultPoint.getY());
            resultPoint4 = new ResultPoint(bitMatrix.getWidth() - 1, resultPoint2.getY());
        }
        this.f69686a = bitMatrix;
        this.f69687b = resultPoint;
        this.f69688c = resultPoint2;
        this.f69689d = resultPoint3;
        this.f69690e = resultPoint4;
        this.f69691f = (int) Math.min(resultPoint.getX(), resultPoint2.getX());
        this.f69692g = (int) Math.max(resultPoint3.getX(), resultPoint4.getX());
        this.f69693h = (int) Math.min(resultPoint.getY(), resultPoint3.getY());
        this.f69694i = (int) Math.max(resultPoint2.getY(), resultPoint4.getY());
    }

    public c(c cVar) {
        this.f69686a = cVar.f69686a;
        this.f69687b = cVar.f69687b;
        this.f69688c = cVar.f69688c;
        this.f69689d = cVar.f69689d;
        this.f69690e = cVar.f69690e;
        this.f69691f = cVar.f69691f;
        this.f69692g = cVar.f69692g;
        this.f69693h = cVar.f69693h;
        this.f69694i = cVar.f69694i;
    }
}
