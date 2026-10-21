package androidx.core.view;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(16)
public final class a {
    @JvmStatic
    @DoNotInline
    public static final void a(@NotNull View view, @NotNull Runnable runnable, long j10) {
        view.postOnAnimationDelayed(runnable, j10);
    }
}
