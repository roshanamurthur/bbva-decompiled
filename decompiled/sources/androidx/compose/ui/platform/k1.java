package androidx.compose.ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ViewLayer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(31)
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k1 f17414a = new k1();

    @DoNotInline
    public final void a(@NotNull View view, @Nullable RenderEffect renderEffect) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setRenderEffect(renderEffect != null ? renderEffect.asAndroidRenderEffect() : null);
    }
}
