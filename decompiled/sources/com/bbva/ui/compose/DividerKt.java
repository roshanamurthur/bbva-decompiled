package com.bbva.ui.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import com.bbva.ui.compose.theme.Theme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Divider.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"Divider", "", "modifier", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "Divider-iJQMabo", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DividerKt {

    /* JADX INFO: compiled from: Divider.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f37161p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f37162q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f37163r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f37164s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Modifier modifier, long j10, int i10, int i11) {
            super(2);
            this.f37161p0 = modifier;
            this.f37162q0 = j10;
            this.f37163r0 = i10;
            this.f37164s0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            DividerKt.m4981DivideriJQMabo(this.f37161p0, this.f37162q0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37163r0 | 1), this.f37164s0);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Divider-iJQMabo, reason: not valid java name */
    public static final void m4981DivideriJQMabo(@Nullable Modifier modifier, long j10, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-66728128);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            i12 |= ((i11 & 2) == 0 && composerStartRestartGroup.changed(j10)) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i13 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if ((i11 & 2) != 0) {
                    j10 = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getFormat().getDivider();
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
                ComposerKt.traceEventStart(-66728128, i12, -1, "com.bbva.ui.compose.Divider (Divider.kt:20)");
            }
            androidx.compose.material.DividerKt.m746DivideroMI9zvI(modifier, j10, 0.0f, 0.0f, composerStartRestartGroup, (i12 & 14) | (i12 & 112), 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        long j11 = j10;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier2, j11, i10, i11));
        }
    }
}
