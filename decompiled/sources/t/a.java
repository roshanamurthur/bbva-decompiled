package t;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EdgeEffectCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(31)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f93346a = new a();

    @DoNotInline
    @NotNull
    public final EdgeEffect a(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    @DoNotInline
    public final float b(@NotNull EdgeEffect edgeEffect) {
        Intrinsics.checkNotNullParameter(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    @DoNotInline
    public final float c(@NotNull EdgeEffect edgeEffect, float f6, float f10) {
        Intrinsics.checkNotNullParameter(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.onPullDistance(f6, f10);
        } catch (Throwable unused) {
            edgeEffect.onPull(f6, f10);
            return 0.0f;
        }
    }
}
