package androidx.appcompat.app;

/* JADX INFO: compiled from: TwilightCalculator.java */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static f0 f725d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f728c;

    public final void a(double d2, double d3, long j10) {
        float f6 = (j10 - 946728000000L) / 8.64E7f;
        float f10 = (0.01720197f * f6) + 6.24006f;
        double d7 = f10;
        double dSin = (Math.sin(f10 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f10) * 3.4906598739326E-4d) + (Math.sin(d7) * 0.03341960161924362d) + d7 + 1.796593063d + 3.141592653589793d;
        double d10 = (-d3) / 360.0d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d7) * 0.0053d) + ((double) (Math.round(((double) (f6 - 9.0E-4f)) - d10) + 9.0E-4f)) + d10;
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d11 = 0.01745329238474369d * d2;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d11))) / (Math.cos(dAsin) * Math.cos(d11));
        if (dSin3 >= 1.0d) {
            this.f728c = 1;
            this.f726a = -1L;
            this.f727b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f728c = 0;
                this.f726a = -1L;
                this.f727b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f726a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f727b = jRound;
            if (jRound >= j10 || this.f726a <= j10) {
                this.f728c = 1;
            } else {
                this.f728c = 0;
            }
        }
    }
}
