package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ContentColor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\" \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/graphics/Color;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalContentColor", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalContentColor", "material_release"}, k = 2, mv = {1, 8, 0})
public final class ContentColorKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<Color> f7029a = CompositionLocalKt.compositionLocalOf$default(null, a.f7030p0, 1, null);

    /* JADX INFO: compiled from: ContentColor.kt */
    public static final class a extends Lambda implements Function0<Color> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f7030p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Color invoke() {
            return Color.m2498boximpl(Color.INSTANCE.m2534getBlack0d7_KjU());
        }
    }

    @NotNull
    public static final ProvidableCompositionLocal<Color> getLocalContentColor() {
        return f7029a;
    }
}
