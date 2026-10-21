package androidx.compose.ui.platform;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 {
    public static boolean a(OpenEndRange openEndRange, @NotNull Comparable value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.compareTo(openEndRange.getStart()) >= 0 && value.compareTo(openEndRange.getEndExclusive()) < 0;
    }

    public static boolean b(OpenEndRange openEndRange) {
        return openEndRange.getStart().compareTo(openEndRange.getEndExclusive()) >= 0;
    }
}
