package androidx.compose.ui.platform;

import android.graphics.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RenderNodeApi29.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(31)
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final x0 f17455a = new x0();

    @DoNotInline
    public final void a(@NotNull RenderNode renderNode, @Nullable RenderEffect renderEffect) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        renderNode.setRenderEffect(renderEffect != null ? renderEffect.asAndroidRenderEffect() : null);
    }
}
