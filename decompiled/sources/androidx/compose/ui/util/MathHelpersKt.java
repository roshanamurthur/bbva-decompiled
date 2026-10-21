package androidx.compose.ui.util;

import com.adobe.marketing.mobile.EventDataKeys;
import kotlin.Metadata;
import mk.c;

/* JADX INFO: compiled from: MathHelpers.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u001e\u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u001e\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0001¨\u0006\u0007"}, d2 = {"lerp", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "fraction", "", "", "ui-util_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MathHelpersKt {
    public static final float lerp(float f6, float f10, float f11) {
        return (f11 * f10) + ((1 - f11) * f6);
    }

    public static final int lerp(int i10, int i11, float f6) {
        return c.roundToInt(((double) (i11 - i10)) * ((double) f6)) + i10;
    }

    public static final long lerp(long j10, long j11, float f6) {
        return c.roundToLong((j11 - j10) * ((double) f6)) + j10;
    }
}
