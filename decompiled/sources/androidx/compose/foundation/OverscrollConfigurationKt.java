package androidx.compose.foundation;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OverscrollConfiguration.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\"(\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/foundation/OverscrollConfiguration;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalOverscrollConfiguration", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalOverscrollConfiguration$annotations", "()V", "LocalOverscrollConfiguration", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class OverscrollConfigurationKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<OverscrollConfiguration> f3450a = CompositionLocalKt.compositionLocalOf$default(null, a.f3451p0, 1, null);

    /* JADX INFO: compiled from: OverscrollConfiguration.kt */
    public static final class a extends Lambda implements Function0<OverscrollConfiguration> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f3451p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final OverscrollConfiguration invoke() {
            return new OverscrollConfiguration(0L, null, 3, null);
        }
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final ProvidableCompositionLocal<OverscrollConfiguration> getLocalOverscrollConfiguration() {
        return f3450a;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getLocalOverscrollConfiguration$annotations() {
    }
}
