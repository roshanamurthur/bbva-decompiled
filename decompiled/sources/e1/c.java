package e1;

import android.view.MotionEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MotionEventAdapter.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f68259a = new c();

    @DoNotInline
    public final long a(@NotNull MotionEvent motionEvent, int i10) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        return OffsetKt.Offset(motionEvent.getRawX(i10), motionEvent.getRawY(i10));
    }
}
