package androidx.compose.ui.platform;

import android.view.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RenderNodeApi23.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a1 f17375a = new a1();

    @DoNotInline
    public final int a(@NotNull RenderNode renderNode) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        return renderNode.getAmbientShadowColor();
    }

    @DoNotInline
    public final int b(@NotNull RenderNode renderNode) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        return renderNode.getSpotShadowColor();
    }

    @DoNotInline
    public final void c(@NotNull RenderNode renderNode, int i10) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        renderNode.setAmbientShadowColor(i10);
    }

    @DoNotInline
    public final void d(@NotNull RenderNode renderNode, int i10) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        renderNode.setSpotShadowColor(i10);
    }
}
