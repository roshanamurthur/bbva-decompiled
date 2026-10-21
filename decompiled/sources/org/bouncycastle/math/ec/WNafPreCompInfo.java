package org.bouncycastle.math.ec;

/* JADX INFO: loaded from: classes13.dex */
public class WNafPreCompInfo implements PreCompInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile int f90606a = 4;
    protected int confWidth = -1;
    protected ECPoint[] preComp = null;
    protected ECPoint[] preCompNeg = null;
    protected ECPoint twice = null;
    protected int width = -1;

    public int getConfWidth() {
        return this.confWidth;
    }

    public ECPoint[] getPreComp() {
        return this.preComp;
    }

    public ECPoint[] getPreCompNeg() {
        return this.preCompNeg;
    }

    public ECPoint getTwice() {
        return this.twice;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isPromoted() {
        return this.f90606a <= 0;
    }

    public void setConfWidth(int i10) {
        this.confWidth = i10;
    }

    public void setPreComp(ECPoint[] eCPointArr) {
        this.preComp = eCPointArr;
    }

    public void setPreCompNeg(ECPoint[] eCPointArr) {
        this.preCompNeg = eCPointArr;
    }

    public void setTwice(ECPoint eCPoint) {
        this.twice = eCPoint;
    }

    public void setWidth(int i10) {
        this.width = i10;
    }
}
