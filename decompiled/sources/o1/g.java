package o1;

import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StaticLayoutFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
public final class g {
    @JvmStatic
    @DoNotInline
    public static final void a(@NotNull StaticLayout.Builder builder, int i10) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.setJustificationMode(i10);
    }
}
