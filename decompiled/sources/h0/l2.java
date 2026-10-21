package h0;

import androidx.compose.foundation.ScrollState;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ScrollState f68894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f68895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f68896c;

    public l2(@NotNull ScrollState scrollState, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f68894a = scrollState;
        this.f68895b = coroutineScope;
    }
}
