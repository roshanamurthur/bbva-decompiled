package j2;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Bundle.kt */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(18)
public final class a {
    @JvmStatic
    @DoNotInline
    public static final void a(@NotNull Bundle bundle, @NotNull String str, @Nullable IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
