package l0;

import android.content.Context;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DynamicTonalPalette.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d0 f82486a = new d0();

    @DoNotInline
    public final long a(@NotNull Context context, @ColorRes int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        return ColorKt.Color(context.getResources().getColor(i10, context.getTheme()));
    }
}
