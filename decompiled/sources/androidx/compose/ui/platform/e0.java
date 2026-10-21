package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e0 f17398a = new e0();

    @DoNotInline
    @RequiresApi(26)
    public final void a(@NotNull View view, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setFocusable(i10);
        view.setDefaultFocusHighlightEnabled(z10);
    }
}
