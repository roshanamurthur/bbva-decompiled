package androidx.compose.material.ripple;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RippleTheme.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/ripple/RippleTheme;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalRippleTheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalRippleTheme", "material-ripple_release"}, k = 2, mv = {1, 8, 0})
public final class RippleThemeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<RippleTheme> f8988a = CompositionLocalKt.staticCompositionLocalOf(a.f8992p0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final RippleAlpha f8989b = new RippleAlpha(0.16f, 0.24f, 0.08f, 0.24f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final RippleAlpha f8990c = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.12f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final RippleAlpha f8991d = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.1f);

    /* JADX INFO: compiled from: RippleTheme.kt */
    public static final class a extends Lambda implements Function0<RippleTheme> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f8992p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ RippleTheme invoke() {
            return androidx.compose.material.ripple.a.f8998a;
        }
    }

    @NotNull
    public static final ProvidableCompositionLocal<RippleTheme> getLocalRippleTheme() {
        return f8988a;
    }
}
