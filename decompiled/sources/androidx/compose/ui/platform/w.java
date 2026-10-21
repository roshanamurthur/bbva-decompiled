package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidComposeView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final w f17454a = new w();

    @DoNotInline
    @RequiresApi(29)
    public final void a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setForceDarkAllowed(false);
    }
}
