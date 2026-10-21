package l0;

import androidx.compose.foundation.ScrollState;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ScrollState f82514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f82515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f82516c;

    public e3(@NotNull ScrollState scrollState, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f82514a = scrollState;
        this.f82515b = coroutineScope;
    }
}
