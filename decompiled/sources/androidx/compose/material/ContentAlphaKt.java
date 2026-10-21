package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ContentAlpha.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\"\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalContentAlpha", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalContentAlpha", "material_release"}, k = 2, mv = {1, 8, 0})
public final class ContentAlphaKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<Float> f7027a = CompositionLocalKt.compositionLocalOf$default(null, a.f7028p0, 1, null);

    /* JADX INFO: compiled from: ContentAlpha.kt */
    public static final class a extends Lambda implements Function0<Float> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f7028p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(1.0f);
        }
    }

    @NotNull
    public static final ProvidableCompositionLocal<Float> getLocalContentAlpha() {
        return f7027a;
    }
}
