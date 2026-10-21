package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SelectionRegistrar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\"\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "", "selectableId", "", "hasSelection", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalSelectionRegistrar", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalSelectionRegistrar", "foundation_release"}, k = 2, mv = {1, 8, 0})
public final class SelectionRegistrarKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<SelectionRegistrar> f6399a = CompositionLocalKt.compositionLocalOf$default(null, a.f6400p0, 1, null);

    /* JADX INFO: compiled from: SelectionRegistrar.kt */
    public static final class a extends Lambda implements Function0<SelectionRegistrar> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f6400p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ SelectionRegistrar invoke() {
            return null;
        }
    }

    @NotNull
    public static final ProvidableCompositionLocal<SelectionRegistrar> getLocalSelectionRegistrar() {
        return f6399a;
    }

    public static final boolean hasSelection(@Nullable SelectionRegistrar selectionRegistrar, long j10) {
        Map<Long, Selection> subselections;
        if (selectionRegistrar == null || (subselections = selectionRegistrar.getSubselections()) == null) {
            return false;
        }
        return subselections.containsKey(Long.valueOf(j10));
    }
}
