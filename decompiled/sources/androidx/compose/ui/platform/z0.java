package androidx.compose.ui.platform;

import android.view.RenderNode;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RenderNodeApi23.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final z0 f17457a = new z0();

    @DoNotInline
    public final void a(@NotNull RenderNode renderNode) {
        Intrinsics.checkNotNullParameter(renderNode, "renderNode");
        renderNode.discardDisplayList();
    }
}
