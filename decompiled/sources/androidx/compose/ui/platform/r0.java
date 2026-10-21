package androidx.compose.ui.platform;

import android.view.MotionEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r0 f17439a = new r0();

    @DoNotInline
    public final boolean a(@NotNull MotionEvent event, int i10) {
        Intrinsics.checkNotNullParameter(event, "event");
        float rawX = event.getRawX(i10);
        if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
            float rawY = event.getRawY(i10);
            if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                return true;
            }
        }
        return false;
    }
}
