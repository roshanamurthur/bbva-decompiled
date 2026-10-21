package j2;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Bundle.kt */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
public final class b {
    @JvmStatic
    @DoNotInline
    public static final void a(@NotNull Bundle bundle, @NotNull String str, @Nullable Size size) {
        bundle.putSize(str, size);
    }

    @JvmStatic
    @DoNotInline
    public static final void b(@NotNull Bundle bundle, @NotNull String str, @Nullable SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}
