package y0;

import android.graphics.RenderEffect;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidTileMode_androidKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidRenderEffect.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(31)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r f94722a = new r();

    @DoNotInline
    @NotNull
    public final RenderEffect a(@Nullable androidx.compose.ui.graphics.RenderEffect renderEffect, float f6, float f10, int i10) {
        if (renderEffect == null) {
            RenderEffect renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(f6, f10, AndroidTileMode_androidKt.m2422toAndroidTileMode0vamqd0(i10));
            Intrinsics.checkNotNullExpressionValue(renderEffectCreateBlurEffect, "{\n            android.gr…)\n            )\n        }");
            return renderEffectCreateBlurEffect;
        }
        RenderEffect renderEffectCreateBlurEffect2 = RenderEffect.createBlurEffect(f6, f10, renderEffect.asAndroidRenderEffect(), AndroidTileMode_androidKt.m2422toAndroidTileMode0vamqd0(i10));
        Intrinsics.checkNotNullExpressionValue(renderEffectCreateBlurEffect2, "{\n            android.gr…)\n            )\n        }");
        return renderEffectCreateBlurEffect2;
    }

    @DoNotInline
    @NotNull
    public final RenderEffect b(@Nullable androidx.compose.ui.graphics.RenderEffect renderEffect, long j10) {
        if (renderEffect == null) {
            RenderEffect renderEffectCreateOffsetEffect = RenderEffect.createOffsetEffect(Offset.m2275getXimpl(j10), Offset.m2276getYimpl(j10));
            Intrinsics.checkNotNullExpressionValue(renderEffectCreateOffsetEffect, "{\n            android.gr…et.x, offset.y)\n        }");
            return renderEffectCreateOffsetEffect;
        }
        RenderEffect renderEffectCreateOffsetEffect2 = RenderEffect.createOffsetEffect(Offset.m2275getXimpl(j10), Offset.m2276getYimpl(j10), renderEffect.asAndroidRenderEffect());
        Intrinsics.checkNotNullExpressionValue(renderEffectCreateOffsetEffect2, "{\n            android.gr…)\n            )\n        }");
        return renderEffectCreateOffsetEffect2;
    }
}
