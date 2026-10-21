package o1;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StaticLayoutFactory.kt */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CharSequence f85245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f85246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f85247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final TextPaint f85248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f85249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TextDirectionHeuristic f85250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Layout.Alignment f85251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f85252h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final TextUtils.TruncateAt f85253i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f85254j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f85255k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f85256l;
    public final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f85257n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f85258o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f85259p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f85260q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f85261r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f85262s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final int[] f85263t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public final int[] f85264u;

    public q(@NotNull CharSequence text, int i10, int i11, @NotNull TextPaint paint, int i12, @NotNull TextDirectionHeuristic textDir, @NotNull Layout.Alignment alignment, int i13, @Nullable TextUtils.TruncateAt truncateAt, int i14, float f6, float f10, int i15, boolean z10, boolean z11, int i16, int i17, int i18, int i19, @Nullable int[] iArr, @Nullable int[] iArr2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(textDir, "textDir");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.f85245a = text;
        this.f85246b = i10;
        this.f85247c = i11;
        this.f85248d = paint;
        this.f85249e = i12;
        this.f85250f = textDir;
        this.f85251g = alignment;
        this.f85252h = i13;
        this.f85253i = truncateAt;
        this.f85254j = i14;
        this.f85255k = f6;
        this.f85256l = f10;
        this.m = i15;
        this.f85257n = z10;
        this.f85258o = z11;
        this.f85259p = i16;
        this.f85260q = i17;
        this.f85261r = i18;
        this.f85262s = i19;
        this.f85263t = iArr;
        this.f85264u = iArr2;
        if (i10 < 0 || i10 > i11) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int length = text.length();
        if (i11 < 0 || i11 > length) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i14 < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (f6 < 0.0f) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
