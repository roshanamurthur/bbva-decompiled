package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LayoutIntrinsics.kt */
/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/android/LayoutIntrinsics;", "", "Landroid/text/BoringLayout$Metrics;", "getBoringMetrics", "()Landroid/text/BoringLayout$Metrics;", "boringMetrics", "", "getMinIntrinsicWidth", "()F", "minIntrinsicWidth", "getMaxIntrinsicWidth", "maxIntrinsicWidth", "", "charSequence", "Landroid/text/TextPaint;", "textPaint", "", "textDirectionHeuristic", "<init>", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class LayoutIntrinsics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CharSequence f17790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TextPaint f17791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f17793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f17794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public BoringLayout.Metrics f17795f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17796g;

    public LayoutIntrinsics(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, int i10) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        this.f17790a = charSequence;
        this.f17791b = textPaint;
        this.f17792c = i10;
        this.f17793d = Float.NaN;
        this.f17794e = Float.NaN;
    }

    @Nullable
    public final BoringLayout.Metrics getBoringMetrics() {
        if (!this.f17796g) {
            this.f17795f = BoringLayoutFactory.INSTANCE.measure(this.f17790a, this.f17791b, TextLayoutKt.getTextDirectionHeuristic(this.f17792c));
            this.f17796g = true;
        }
        return this.f17795f;
    }

    public final float getMaxIntrinsicWidth() {
        if (!Float.isNaN(this.f17793d)) {
            return this.f17793d;
        }
        BoringLayout.Metrics boringMetrics = getBoringMetrics();
        Float fValueOf = boringMetrics != null ? Float.valueOf(boringMetrics.width) : null;
        TextPaint textPaint = this.f17791b;
        CharSequence charSequence = this.f17790a;
        if (fValueOf == null) {
            fValueOf = Float.valueOf((float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), textPaint)));
        }
        if (LayoutIntrinsicsKt.access$shouldIncreaseMaxIntrinsic(fValueOf.floatValue(), charSequence, textPaint)) {
            fValueOf = Float.valueOf(fValueOf.floatValue() + 0.5f);
        }
        float fFloatValue = fValueOf.floatValue();
        this.f17793d = fFloatValue;
        return fFloatValue;
    }

    public final float getMinIntrinsicWidth() {
        if (!Float.isNaN(this.f17794e)) {
            return this.f17794e;
        }
        float fMinIntrinsicWidth = LayoutIntrinsicsKt.minIntrinsicWidth(this.f17790a, this.f17791b);
        this.f17794e = fMinIntrinsicWidth;
        return fMinIntrinsicWidth;
    }
}
