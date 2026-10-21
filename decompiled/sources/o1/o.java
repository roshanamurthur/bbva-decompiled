package o1;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StaticLayoutFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(33)
public final class o {
    @JvmStatic
    @DoNotInline
    public static final boolean a(@NotNull StaticLayout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        return layout.isFallbackLineSpacingEnabled();
    }

    @JvmStatic
    @DoNotInline
    public static final void b(@NotNull StaticLayout.Builder builder, int i10, int i11) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        LineBreakConfig lineBreakConfigBuild = n.a().setLineBreakStyle(i10).setLineBreakWordStyle(i11).build();
        Intrinsics.checkNotNullExpressionValue(lineBreakConfigBuild, "Builder()\n              …\n                .build()");
        builder.setLineBreakConfig(lineBreakConfigBuild);
    }
}
