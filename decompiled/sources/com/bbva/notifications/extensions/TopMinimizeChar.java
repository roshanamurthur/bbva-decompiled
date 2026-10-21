package com.bbva.notifications.extensions;

import android.text.TextPaint;
import android.text.style.SuperscriptSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StringExtensions.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/notifications/extensions/TopMinimizeChar;", "Landroid/text/style/SuperscriptSpan;", "<init>", "()V", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
final class TopMinimizeChar extends SuperscriptSpan {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f35362p0 = 3;

    @Override // android.text.style.SuperscriptSpan, android.text.style.CharacterStyle
    public final void updateDrawState(@NotNull TextPaint tp) {
        Intrinsics.checkNotNullParameter(tp, "tp");
        tp.baselineShift += (int) (tp.ascent() / this.f35362p0);
    }

    @Override // android.text.style.SuperscriptSpan, android.text.style.MetricAffectingSpan
    public final void updateMeasureState(@NotNull TextPaint tp) {
        Intrinsics.checkNotNullParameter(tp, "tp");
        tp.baselineShift += (int) (tp.ascent() / this.f35362p0);
    }
}
