package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ViewLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i1 f17408a = new i1();

    @DoNotInline
    public final void a(@NotNull View view, int i10) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOutlineAmbientShadowColor(i10);
    }

    @DoNotInline
    public final void b(@NotNull View view, int i10) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOutlineSpotShadowColor(i10);
    }
}
