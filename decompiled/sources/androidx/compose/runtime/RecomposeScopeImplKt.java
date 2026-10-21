package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.PublishedApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RecomposeScopeImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¨\u0006\u0003"}, d2 = {"", "flags", "updateChangedFlags", "runtime_release"}, k = 2, mv = {1, 8, 0})
public final class RecomposeScopeImplKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Object f14652a = new Object();

    @PublishedApi
    public static final int updateChangedFlags(int i10) {
        int i11 = 306783378 & i10;
        int i12 = 613566756 & i10;
        return (i10 & (-920350135)) | (i12 >> 1) | i11 | ((i11 << 1) & i12);
    }
}
