package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidPathEffect.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPathEffect;", "Landroidx/compose/ui/graphics/PathEffect;", "Landroid/graphics/PathEffect;", "a", "Landroid/graphics/PathEffect;", "getNativePathEffect", "()Landroid/graphics/PathEffect;", "nativePathEffect", "<init>", "(Landroid/graphics/PathEffect;)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
public final class AndroidPathEffect implements PathEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final android.graphics.PathEffect nativePathEffect;

    public AndroidPathEffect(@NotNull android.graphics.PathEffect nativePathEffect) {
        Intrinsics.checkNotNullParameter(nativePathEffect, "nativePathEffect");
        this.nativePathEffect = nativePathEffect;
    }

    @NotNull
    public final android.graphics.PathEffect getNativePathEffect() {
        return this.nativePathEffect;
    }
}
