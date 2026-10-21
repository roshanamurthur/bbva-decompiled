package androidx.compose.runtime.tooling;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InspectionTables.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0006\"%\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "Landroidx/compose/runtime/tooling/CompositionData;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalInspectionTables", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalInspectionTables", "runtime_release"}, k = 2, mv = {1, 8, 0})
public final class InspectionTablesKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<Set<CompositionData>> f15370a = CompositionLocalKt.staticCompositionLocalOf(a.f15371p0);

    /* JADX INFO: compiled from: InspectionTables.kt */
    public static final class a extends Lambda implements Function0<Set<CompositionData>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f15371p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Set<CompositionData> invoke() {
            return null;
        }
    }

    @NotNull
    public static final ProvidableCompositionLocal<Set<CompositionData>> getLocalInspectionTables() {
        return f15370a;
    }
}
