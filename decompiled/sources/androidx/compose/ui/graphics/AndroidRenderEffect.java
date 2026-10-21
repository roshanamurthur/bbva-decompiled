package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidRenderEffect.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/AndroidRenderEffect;", "Landroidx/compose/ui/graphics/RenderEffect;", "Landroid/graphics/RenderEffect;", "createRenderEffect", "b", "Landroid/graphics/RenderEffect;", "getAndroidRenderEffect", "()Landroid/graphics/RenderEffect;", "androidRenderEffect", "<init>", "(Landroid/graphics/RenderEffect;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public final class AndroidRenderEffect extends RenderEffect {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final android.graphics.RenderEffect androidRenderEffect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidRenderEffect(@NotNull android.graphics.RenderEffect androidRenderEffect) {
        super(null);
        Intrinsics.checkNotNullParameter(androidRenderEffect, "androidRenderEffect");
        this.androidRenderEffect = androidRenderEffect;
    }

    @Override // androidx.compose.ui.graphics.RenderEffect
    @NotNull
    /* JADX INFO: renamed from: createRenderEffect, reason: from getter */
    public android.graphics.RenderEffect getAndroidRenderEffect() {
        return this.androidRenderEffect;
    }

    @NotNull
    public final android.graphics.RenderEffect getAndroidRenderEffect() {
        return this.androidRenderEffect;
    }
}
