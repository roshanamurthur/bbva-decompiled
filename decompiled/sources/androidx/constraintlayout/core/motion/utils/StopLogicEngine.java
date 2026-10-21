package androidx.constraintlayout.core.motion.utils;

import androidx.camera.camera2.internal.l0;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;

/* JADX INFO: loaded from: classes.dex */
public class StopLogicEngine implements StopEngine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f18912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f18913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f18914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f18915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f18916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f18917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f18918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f18919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f18920i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18921j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f18922k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f18923l = false;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f18924n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f18925o;

    public final void a(float f6, float f10, float f11, float f12, float f13) {
        this.f18920i = f10;
        if (f6 == 0.0f) {
            f6 = 1.0E-4f;
        }
        float f14 = f6 / f11;
        float f15 = (f14 * f6) / 2.0f;
        if (f6 < 0.0f) {
            float fSqrt = (float) Math.sqrt((f10 - ((((-f6) / f11) * f6) / 2.0f)) * f11);
            if (fSqrt < f12) {
                this.f18922k = "backward accelerate, decelerate";
                this.f18921j = 2;
                this.f18912a = f6;
                this.f18913b = fSqrt;
                this.f18914c = 0.0f;
                float f16 = (fSqrt - f6) / f11;
                this.f18915d = f16;
                this.f18916e = fSqrt / f11;
                this.f18918g = ((f6 + fSqrt) * f16) / 2.0f;
                this.f18919h = f10;
                this.f18920i = f10;
                return;
            }
            this.f18922k = "backward accelerate cruse decelerate";
            this.f18921j = 3;
            this.f18912a = f6;
            this.f18913b = f12;
            this.f18914c = f12;
            float f17 = (f12 - f6) / f11;
            this.f18915d = f17;
            float f18 = f12 / f11;
            this.f18917f = f18;
            float f19 = ((f6 + f12) * f17) / 2.0f;
            float f20 = (f18 * f12) / 2.0f;
            this.f18916e = ((f10 - f19) - f20) / f12;
            this.f18918g = f19;
            this.f18919h = f10 - f20;
            this.f18920i = f10;
            return;
        }
        if (f15 >= f10) {
            this.f18922k = "hard stop";
            this.f18921j = 1;
            this.f18912a = f6;
            this.f18913b = 0.0f;
            this.f18918g = f10;
            this.f18915d = (2.0f * f10) / f6;
            return;
        }
        float f21 = f10 - f15;
        float f22 = f21 / f6;
        if (f22 + f14 < f13) {
            this.f18922k = "cruse decelerate";
            this.f18921j = 2;
            this.f18912a = f6;
            this.f18913b = f6;
            this.f18914c = 0.0f;
            this.f18918g = f21;
            this.f18919h = f10;
            this.f18915d = f22;
            this.f18916e = f14;
            return;
        }
        float fSqrt2 = (float) Math.sqrt(((f6 * f6) / 2.0f) + (f11 * f10));
        float f23 = (fSqrt2 - f6) / f11;
        this.f18915d = f23;
        float f24 = fSqrt2 / f11;
        this.f18916e = f24;
        if (fSqrt2 < f12) {
            this.f18922k = "accelerate decelerate";
            this.f18921j = 2;
            this.f18912a = f6;
            this.f18913b = fSqrt2;
            this.f18914c = 0.0f;
            this.f18915d = f23;
            this.f18916e = f24;
            this.f18918g = ((f6 + fSqrt2) * f23) / 2.0f;
            this.f18919h = f10;
            return;
        }
        this.f18922k = "accelerate cruse decelerate";
        this.f18921j = 3;
        this.f18912a = f6;
        this.f18913b = f12;
        this.f18914c = f12;
        float f25 = (f12 - f6) / f11;
        this.f18915d = f25;
        float f26 = f12 / f11;
        this.f18917f = f26;
        float f27 = ((f6 + f12) * f25) / 2.0f;
        float f28 = (f26 * f12) / 2.0f;
        this.f18916e = ((f10 - f27) - f28) / f12;
        this.f18918g = f27;
        this.f18919h = f10 - f28;
        this.f18920i = f10;
    }

    public void config(float f6, float f10, float f11, float f12, float f13, float f14) {
        this.m = f6;
        boolean z10 = f6 > f10;
        this.f18923l = z10;
        if (z10) {
            a(-f11, f6 - f10, f13, f14, f12);
        } else {
            a(f11, f10 - f6, f13, f14, f12);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String str, float f6) {
        StringBuilder sbE = androidx.camera.core.processing.f.e(ad.d.f(androidx.camera.core.processing.f.e(str, " ===== "), this.f18922k, RootService.LINE_BREAK), str);
        sbE.append(this.f18923l ? "backwards" : "forward ");
        sbE.append(" time = ");
        sbE.append(f6);
        sbE.append("  stages ");
        String strC = androidx.appcompat.widget.a.c(sbE, this.f18921j, RootService.LINE_BREAK);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strC);
        sb2.append(str);
        sb2.append(" dur ");
        sb2.append(this.f18915d);
        sb2.append(" vel ");
        sb2.append(this.f18912a);
        sb2.append(" pos ");
        String strA = l0.a(sb2, this.f18918g, RootService.LINE_BREAK);
        if (this.f18921j > 1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(strA);
            sb3.append(str);
            sb3.append(" dur ");
            sb3.append(this.f18916e);
            sb3.append(" vel ");
            sb3.append(this.f18913b);
            sb3.append(" pos ");
            strA = l0.a(sb3, this.f18919h, RootService.LINE_BREAK);
        }
        if (this.f18921j > 2) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(strA);
            sb4.append(str);
            sb4.append(" dur ");
            sb4.append(this.f18917f);
            sb4.append(" vel ");
            sb4.append(this.f18914c);
            sb4.append(" pos ");
            strA = l0.a(sb4, this.f18920i, RootService.LINE_BREAK);
        }
        float f10 = this.f18915d;
        if (f6 <= f10) {
            return androidx.camera.core.impl.utils.a.b(strA, str, "stage 0\n");
        }
        int i10 = this.f18921j;
        if (i10 == 1) {
            return androidx.camera.core.impl.utils.a.b(strA, str, "end stage 0\n");
        }
        float f11 = f6 - f10;
        float f12 = this.f18916e;
        if (f11 < f12) {
            return androidx.camera.core.impl.utils.a.b(strA, str, " stage 1\n");
        }
        if (i10 == 2) {
            return androidx.camera.core.impl.utils.a.b(strA, str, "end stage 1\n");
        }
        return f11 - f12 < this.f18917f ? androidx.camera.core.impl.utils.a.b(strA, str, " stage 2\n") : androidx.camera.core.impl.utils.a.b(strA, str, " end stage 2\n");
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f6) {
        float f10;
        float f11 = this.f18915d;
        if (f6 <= f11) {
            float f12 = this.f18912a;
            f10 = ((((this.f18913b - f12) * f6) * f6) / (f11 * 2.0f)) + (f12 * f6);
        } else {
            int i10 = this.f18921j;
            if (i10 == 1) {
                f10 = this.f18918g;
            } else {
                float f13 = f6 - f11;
                float f14 = this.f18916e;
                if (f13 < f14) {
                    float f15 = this.f18918g;
                    float f16 = this.f18913b;
                    f10 = ((((this.f18914c - f16) * f13) * f13) / (f14 * 2.0f)) + (f16 * f13) + f15;
                } else if (i10 == 2) {
                    f10 = this.f18919h;
                } else {
                    float f17 = f13 - f14;
                    float f18 = this.f18917f;
                    if (f17 <= f18) {
                        float f19 = this.f18919h;
                        float f20 = this.f18914c * f17;
                        f10 = (f19 + f20) - ((f20 * f17) / (f18 * 2.0f));
                    } else {
                        f10 = this.f18920i;
                    }
                }
            }
        }
        this.f18924n = f10;
        this.f18925o = f6;
        return this.f18923l ? this.m - f10 : this.m + f10;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f6) {
        float f10;
        float f11;
        float f12 = this.f18915d;
        if (f6 <= f12) {
            f10 = this.f18912a;
            f11 = this.f18913b;
        } else {
            int i10 = this.f18921j;
            if (i10 == 1) {
                return 0.0f;
            }
            f6 -= f12;
            f12 = this.f18916e;
            if (f6 >= f12) {
                if (i10 == 2) {
                    return 0.0f;
                }
                float f13 = f6 - f12;
                float f14 = this.f18917f;
                if (f13 >= f14) {
                    return 0.0f;
                }
                float f15 = this.f18914c;
                return f15 - ((f13 * f15) / f14);
            }
            f10 = this.f18913b;
            f11 = this.f18914c;
        }
        return (((f11 - f10) * f6) / f12) + f10;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        return getVelocity() < 1.0E-5f && Math.abs(this.f18920i - this.f18924n) < 1.0E-5f;
    }

    public static class Decelerate implements StopEngine {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f18926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f18927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f18928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f18929d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f18930e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f18931f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f18932g = false;

        public void config(float f6, float f10, float f11) {
            this.f18932g = false;
            this.f18926a = f10;
            this.f18927b = f11;
            this.f18931f = f6;
            float f12 = (f10 - f6) / (f11 / 2.0f);
            this.f18930e = f12;
            this.f18928c = (-f11) / f12;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public String debug(String str, float f6) {
            return this.f18930e + " " + this.f18929d;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public float getInterpolation(float f6) {
            if (f6 > this.f18930e) {
                this.f18932g = true;
                return this.f18926a;
            }
            getVelocity(f6);
            return ((((this.f18928c * f6) / 2.0f) + this.f18927b) * f6) + this.f18931f;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public float getVelocity(float f6) {
            if (f6 > this.f18930e) {
                return 0.0f;
            }
            float f10 = (this.f18928c * f6) + this.f18927b;
            this.f18929d = f10;
            return f10;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public boolean isStopped() {
            return this.f18932g;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public float getVelocity() {
            return this.f18929d;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return this.f18923l ? -getVelocity(this.f18925o) : getVelocity(this.f18925o);
    }
}
