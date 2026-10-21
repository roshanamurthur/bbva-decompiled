package l1;

import android.content.Context;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ColorResources.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f83079a = new a();

    @DoNotInline
    public final long a(@NotNull Context context, @ColorRes int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        return ColorKt.Color(context.getResources().getColor(i10, context.getTheme()));
    }
}
