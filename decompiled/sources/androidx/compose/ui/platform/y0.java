package androidx.compose.ui.platform;

import android.view.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RenderNodeApi23.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final y0 f17456a = new y0();

    @DoNotInline
    public final void a(@NotNull RenderNode renderNode) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        renderNode.destroyDisplayListData();
    }
}
