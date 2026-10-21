package fe;

import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.l0;
import androidx.core.math.MathUtils;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: compiled from: Arrangement.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f68403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f68404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f68405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f68406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f68407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f68408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f68409h;

    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ca  */
    public a(int i10, float f6, float f10, float f11, int i11, float f12, int i12, float f13, int i13, float f14) {
        float fAbs;
        this.f68402a = i10;
        float fClamp = MathUtils.clamp(f6, f10, f11);
        this.f68403b = fClamp;
        this.f68404c = i11;
        this.f68406e = f12;
        this.f68405d = i12;
        this.f68407f = f13;
        this.f68408g = i13;
        float f15 = i13;
        float f16 = (f12 * i12) + (f13 * f15);
        float f17 = i11;
        float f18 = f14 - ((fClamp * f17) + f16);
        if (i11 > 0 && f18 > 0.0f) {
            this.f68403b = Math.min(f18 / f17, f11 - fClamp) + fClamp;
        } else if (i11 > 0 && f18 < 0.0f) {
            this.f68403b = Math.max(f18 / f17, f10 - fClamp) + fClamp;
        }
        int i14 = this.f68404c;
        float f19 = i14 > 0 ? this.f68403b : 0.0f;
        this.f68403b = f19;
        int i15 = this.f68405d;
        float f20 = i15;
        float f21 = f20 / 2.0f;
        float f22 = (f14 - ((i14 + f21) * (i14 > 0 ? f19 : 0.0f))) / (f21 + f15);
        this.f68407f = f22;
        float f23 = (f19 + f22) / 2.0f;
        this.f68406e = f23;
        if (i15 > 0 && f22 != f13) {
            float f24 = (f13 - f22) * f15;
            float fMin = Math.min(Math.abs(f24), f23 * 0.1f * f20);
            if (f24 > 0.0f) {
                this.f68406e -= fMin / this.f68405d;
                this.f68407f = (fMin / f15) + this.f68407f;
            } else {
                this.f68406e = (fMin / this.f68405d) + this.f68406e;
                this.f68407f -= fMin / f15;
            }
        }
        if (i13 > 0 && this.f68404c > 0 && this.f68405d > 0) {
            float f25 = this.f68407f;
            float f26 = this.f68406e;
            if (f25 <= f26 || f26 <= this.f68403b) {
                fAbs = Float.MAX_VALUE;
            } else {
                fAbs = i10 * Math.abs(f13 - this.f68407f);
            }
        } else if (i13 <= 0 || this.f68404c <= 0 || this.f68407f > this.f68403b) {
            fAbs = i10 * Math.abs(f13 - this.f68407f);
        } else {
            fAbs = Float.MAX_VALUE;
        }
        this.f68409h = fAbs;
    }

    public static a a(float f6, float f10, float f11, float f12, int[] iArr, float f13, int[] iArr2, float f14, int[] iArr3) {
        a aVar = null;
        int i10 = 1;
        for (int i11 : iArr3) {
            int length = iArr2.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = iArr2[i12];
                int length2 = iArr.length;
                int i14 = 0;
                while (i14 < length2) {
                    int i15 = i14;
                    int i16 = length2;
                    int i17 = i12;
                    int i18 = length;
                    a aVar2 = new a(i10, f10, f11, f12, iArr[i14], f13, i13, f14, i11, f6);
                    float f15 = aVar2.f68409h;
                    if (aVar == null || f15 < aVar.f68409h) {
                        if (f15 == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    i10++;
                    i14 = i15 + 1;
                    length2 = i16;
                    i12 = i17;
                    length = i18;
                }
                i12++;
            }
        }
        return aVar;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Arrangement [priority=");
        sb2.append(this.f68402a);
        sb2.append(", smallCount=");
        sb2.append(this.f68404c);
        sb2.append(", smallSize=");
        sb2.append(this.f68403b);
        sb2.append(", mediumCount=");
        sb2.append(this.f68405d);
        sb2.append(", mediumSize=");
        sb2.append(this.f68406e);
        sb2.append(", largeCount=");
        sb2.append(this.f68408g);
        sb2.append(", largeSize=");
        sb2.append(this.f68407f);
        sb2.append(", cost=");
        return l0.a(sb2, this.f68409h, Constant.BRACKET_CLOSE);
    }
}
