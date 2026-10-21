package androidx.compose.ui.platform;

import android.os.Looper;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidUiDispatcher.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 8, 0})
public final class AndroidUiDispatcher_androidKt {
    public static final boolean access$isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
