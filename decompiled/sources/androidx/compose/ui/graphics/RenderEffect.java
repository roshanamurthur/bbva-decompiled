package androidx.compose.ui.graphics;

import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidRenderEffect.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H%J\b\u0010\u0006\u001a\u00020\u0005H\u0016\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/RenderEffect;", "", "Landroid/graphics/RenderEffect;", "asAndroidRenderEffect", "createRenderEffect", "", "isSupported", "<init>", "()V", "Landroidx/compose/ui/graphics/AndroidRenderEffect;", "Landroidx/compose/ui/graphics/BlurEffect;", "Landroidx/compose/ui/graphics/OffsetEffect;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidRenderEffect.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidRenderEffect.android.kt\nandroidx/compose/ui/graphics/RenderEffect\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1#2:170\n*E\n"})
public abstract class RenderEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public android.graphics.RenderEffect f15708a;

    public /* synthetic */ RenderEffect(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @RequiresApi(31)
    @NotNull
    public final android.graphics.RenderEffect asAndroidRenderEffect() {
        android.graphics.RenderEffect renderEffect = this.f15708a;
        if (renderEffect != null) {
            return renderEffect;
        }
        android.graphics.RenderEffect renderEffectCreateRenderEffect = createRenderEffect();
        this.f15708a = renderEffectCreateRenderEffect;
        return renderEffectCreateRenderEffect;
    }

    @RequiresApi(31)
    @NotNull
    public abstract android.graphics.RenderEffect createRenderEffect();

    public boolean isSupported() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public RenderEffect() {
    }
}
