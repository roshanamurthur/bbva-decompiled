package j2;

import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PersistableBundle.kt */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(22)
public final class h {
    @JvmStatic
    @DoNotInline
    public static final void a(@NotNull PersistableBundle persistableBundle, @Nullable String str, boolean z10) {
        persistableBundle.putBoolean(str, z10);
    }

    @JvmStatic
    @DoNotInline
    public static final void b(@NotNull PersistableBundle persistableBundle, @Nullable String str, @NotNull boolean[] zArr) {
        persistableBundle.putBooleanArray(str, zArr);
    }
}
