package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Shapes.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\" \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/Shapes;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalShapes", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalShapes", "material_release"}, k = 2, mv = {1, 8, 0})
public final class ShapesKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<Shapes> f7609a = CompositionLocalKt.staticCompositionLocalOf(a.f7610p0);

    /* JADX INFO: compiled from: Shapes.kt */
    public static final class a extends Lambda implements Function0<Shapes> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f7610p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Shapes invoke() {
            return new Shapes(null, null, null, 7, null);
        }
    }

    @NotNull
    public static final ProvidableCompositionLocal<Shapes> getLocalShapes() {
        return f7609a;
    }
}
