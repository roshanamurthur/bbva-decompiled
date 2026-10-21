package androidx.compose.ui.platform;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import androidx.compose.ui.semantics.ScrollAxisRange;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ScrollObservationScope f17447p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat f17448q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, ScrollObservationScope scrollObservationScope) {
        super(0);
        this.f17447p0 = scrollObservationScope;
        this.f17448q0 = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ScrollObservationScope scrollObservationScope = this.f17447p0;
        ScrollAxisRange horizontalScrollAxisRange = scrollObservationScope.getHorizontalScrollAxisRange();
        ScrollAxisRange verticalScrollAxisRange = scrollObservationScope.getVerticalScrollAxisRange();
        Float oldXValue = scrollObservationScope.getOldXValue();
        Float oldYValue = scrollObservationScope.getOldYValue();
        float fFloatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : horizontalScrollAxisRange.getValue().invoke().floatValue() - oldXValue.floatValue();
        float fFloatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : verticalScrollAxisRange.getValue().invoke().floatValue() - oldYValue.floatValue();
        if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
            int semanticsNodeId = scrollObservationScope.getSemanticsNodeId();
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.f17448q0;
            int iR = androidComposeViewAccessibilityDelegateCompat.r(semanticsNodeId);
            AndroidComposeViewAccessibilityDelegateCompat.v(androidComposeViewAccessibilityDelegateCompat, iR, 2048, 1, 8);
            AccessibilityEvent accessibilityEventCreateEvent$ui_release = androidComposeViewAccessibilityDelegateCompat.createEvent$ui_release(iR, 4096);
            if (horizontalScrollAxisRange != null) {
                accessibilityEventCreateEvent$ui_release.setScrollX((int) horizontalScrollAxisRange.getValue().invoke().floatValue());
                accessibilityEventCreateEvent$ui_release.setMaxScrollX((int) horizontalScrollAxisRange.getMaxValue().invoke().floatValue());
            }
            if (verticalScrollAxisRange != null) {
                accessibilityEventCreateEvent$ui_release.setScrollY((int) verticalScrollAxisRange.getValue().invoke().floatValue());
                accessibilityEventCreateEvent$ui_release.setMaxScrollY((int) verticalScrollAxisRange.getMaxValue().invoke().floatValue());
            }
            if (Build.VERSION.SDK_INT >= 28) {
                AndroidComposeViewAccessibilityDelegateCompat.b.a(accessibilityEventCreateEvent$ui_release, (int) fFloatValue, (int) fFloatValue2);
            }
            androidComposeViewAccessibilityDelegateCompat.t(accessibilityEventCreateEvent$ui_release);
        }
        if (horizontalScrollAxisRange != null) {
            scrollObservationScope.setOldXValue(horizontalScrollAxisRange.getValue().invoke());
        }
        if (verticalScrollAxisRange != null) {
            scrollObservationScope.setOldYValue(verticalScrollAxisRange.getValue().invoke());
        }
        return Unit.INSTANCE;
    }
}
