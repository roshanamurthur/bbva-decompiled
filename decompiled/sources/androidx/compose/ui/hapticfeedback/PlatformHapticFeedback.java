package androidx.compose.ui.hapticfeedback;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PlatformHapticFeedback.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/compose/ui/hapticfeedback/PlatformHapticFeedback;", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "hapticFeedbackType", "", "performHapticFeedback-CdsT49E", "(I)V", "performHapticFeedback", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class PlatformHapticFeedback implements HapticFeedback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f16163a;

    public PlatformHapticFeedback(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f16163a = view;
    }

    @Override // androidx.compose.ui.hapticfeedback.HapticFeedback
    /* JADX INFO: renamed from: performHapticFeedback-CdsT49E */
    public void mo3031performHapticFeedbackCdsT49E(int hapticFeedbackType) {
        HapticFeedbackType.Companion companion = HapticFeedbackType.INSTANCE;
        boolean zM3035equalsimpl0 = HapticFeedbackType.m3035equalsimpl0(hapticFeedbackType, companion.m3039getLongPress5zf0vsI());
        View view = this.f16163a;
        if (zM3035equalsimpl0) {
            view.performHapticFeedback(0);
        } else if (HapticFeedbackType.m3035equalsimpl0(hapticFeedbackType, companion.m3040getTextHandleMove5zf0vsI())) {
            view.performHapticFeedback(9);
        }
    }
}
