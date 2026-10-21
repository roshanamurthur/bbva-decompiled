package kotlinx.coroutines.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"kotlinx/coroutines/internal/SystemPropsKt__SystemPropsKt", "kotlinx/coroutines/internal/SystemPropsKt__SystemProps_commonKt"}, k = 4, mv = {1, 8, 0}, xi = 48)
public final class SystemPropsKt {
    public static final int getAVAILABLE_PROCESSORS() {
        return SystemPropsKt__SystemPropsKt.getAVAILABLE_PROCESSORS();
    }

    public static final int systemProp(@NotNull String str, int i10, int i11, int i12) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, i10, i11, i12);
    }

    public static final long systemProp(@NotNull String str, long j10, long j11, long j12) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, j10, j11, j12);
    }

    @Nullable
    public static final String systemProp(@NotNull String str) {
        return SystemPropsKt__SystemPropsKt.systemProp(str);
    }

    @NotNull
    public static final String systemProp(@NotNull String str, @NotNull String str2) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, str2);
    }

    public static final boolean systemProp(@NotNull String str, boolean z10) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, z10);
    }
}
