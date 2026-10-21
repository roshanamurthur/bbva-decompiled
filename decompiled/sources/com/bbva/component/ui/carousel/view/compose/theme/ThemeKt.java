package com.bbva.component.ui.carousel.view.compose.theme;

import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Theme.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a6\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\" \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\" \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0014"}, d2 = {"", "isDarkModeEnabled", "isDarkTheme", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "Theme", "(ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/bbva/component/ui/carousel/view/compose/theme/PrimaryColors;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalCustomColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalCustomColors", "Lcom/bbva/component/ui/carousel/view/compose/theme/Typography;", "b", "getLocalCustomTypography", "LocalCustomTypography", "component-ui-carousel_release"}, k = 2, mv = {1, 8, 0})
public final class ThemeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<PrimaryColors> f28383a = CompositionLocalKt.staticCompositionLocalOf(a.f28385p0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<Typography> f28384b = CompositionLocalKt.staticCompositionLocalOf(b.f28386p0);

    /* JADX INFO: compiled from: Theme.kt */
    public static final class a extends Lambda implements Function0<PrimaryColors> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f28385p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final PrimaryColors invoke() {
            return new PrimaryColors(0L, null, 3, null);
        }
    }

    /* JADX INFO: compiled from: Theme.kt */
    public static final class b extends Lambda implements Function0<Typography> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f28386p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Typography invoke() {
            return new Typography(null, null, 3, null);
        }
    }

    /* JADX INFO: compiled from: Theme.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f28387p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f28388q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f28389r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f28390s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f28391t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(boolean z10, boolean z11, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f28387p0 = z10;
            this.f28388q0 = z11;
            this.f28389r0 = function2;
            this.f28390s0 = i10;
            this.f28391t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ThemeKt.Theme(this.f28387p0, this.f28388q0, this.f28389r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f28390s0 | 1), this.f28391t0);
            return Unit.INSTANCE;
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void Theme(boolean z10, boolean z11, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1917479287);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            i12 |= ((i11 & 2) == 0 && composerStartRestartGroup.changed(z11)) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i13 != 0) {
                    z10 = false;
                }
                if ((i11 & 2) != 0) {
                    z11 = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                    i12 &= -113;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1917479287, i12, -1, "com.bbva.component.ui.carousel.view.compose.theme.Theme (Theme.kt:12)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{f28383a.provides((z10 && z11) ? Colors.INSTANCE.getPrimaryDark() : Colors.INSTANCE.getPrimaryLight()), f28384b.provides(Fonts.INSTANCE.getTypography())}, content, composerStartRestartGroup, ((i12 >> 3) & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        boolean z12 = z10;
        boolean z13 = z11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(z12, z13, content, i10, i11));
    }

    @NotNull
    public static final ProvidableCompositionLocal<PrimaryColors> getLocalCustomColors() {
        return f28383a;
    }

    @NotNull
    public static final ProvidableCompositionLocal<Typography> getLocalCustomTypography() {
        return f28384b;
    }
}
