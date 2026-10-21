package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u00020\f*\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014R\u001a\u0010\u0003\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/TabRowDefaults;", "", "()V", "containerColor", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "contentColor", "getContentColor", "Indicator", "", "modifier", "Landroidx/compose/ui/Modifier;", "height", "Landroidx/compose/ui/unit/Dp;", "color", "Indicator-9IZ8Weo", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "tabIndicatorOffset", "currentTabPosition", "Landroidx/compose/material3/TabPosition;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowDefaults\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,505:1\n135#2:506\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowDefaults\n*L\n407#1:506\n*E\n"})
public final class TabRowDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final TabRowDefaults INSTANCE = new TabRowDefaults();

    /* JADX INFO: compiled from: TabRow.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11986q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f11987r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f11988s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f11989t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f11990u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Modifier modifier, float f6, long j10, int i10, int i11) {
            super(2);
            this.f11986q0 = modifier;
            this.f11987r0 = f6;
            this.f11988s0 = j10;
            this.f11989t0 = i10;
            this.f11990u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TabRowDefaults.this.m1353Indicator9IZ8Weo(this.f11986q0, this.f11987r0, this.f11988s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11989t0 | 1), this.f11990u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TabRow.kt */
    @SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowDefaults$tabIndicatorOffset$2\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,505:1\n76#2:506\n76#2:507\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowDefaults$tabIndicatorOffset$2\n*L\n412#1:506\n416#1:507\n*E\n"})
    public static final class b extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TabPosition f11991p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TabPosition tabPosition) {
            super(3);
            this.f11991p0 = tabPosition;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Modifier modifier2 = modifier;
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier2, "$this$composed", composer2, -1541271084);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1541271084, iA, -1, "androidx.compose.material3.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:410)");
            }
            TabPosition tabPosition = this.f11991p0;
            State<Dp> stateM67animateDpAsStateAjpBEmI = AnimateAsStateKt.m67animateDpAsStateAjpBEmI(tabPosition.getWidth(), AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, composer2, 0, 12);
            Modifier modifierM340width3ABfNKs = SizeKt.m340width3ABfNKs(OffsetKt.m270offsetVpY3zN4$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), Alignment.INSTANCE.getBottomStart(), false, 2, null), AnimateAsStateKt.m67animateDpAsStateAjpBEmI(tabPosition.getCom.dasnano.vdphotoselfiecapture.api.model.Parameters.DIRECTION.LEFT java.lang.String(), AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, composer2, 0, 12).getValue().m4403unboximpl(), 0.0f, 2, null), stateM67animateDpAsStateAjpBEmI.getValue().m4403unboximpl());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return modifierM340width3ABfNKs;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082 A[PHI: r2 r3
      0x0082: PHI (r2v5 androidx.compose.ui.Modifier) = (r2v2 androidx.compose.ui.Modifier), (r2v6 androidx.compose.ui.Modifier) binds: [B:55:0x0096, B:46:0x007d] A[DONT_GENERATE, DONT_INLINE]
      0x0082: PHI (r3v9 float) = (r3v5 float), (r3v10 float) binds: [B:55:0x0096, B:46:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00df  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Indicator-9IZ8Weo, reason: not valid java name */
    public final void m1353Indicator9IZ8Weo(@Nullable Modifier modifier, float f6, long j10, @Nullable Composer composer, int i10, int i11) {
        int i12;
        long j11;
        Modifier modifier2;
        float fM1913getActiveIndicatorHeightD9Ej5fM;
        long jFromToken;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1454716052);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= composerStartRestartGroup.changed(f6) ? 32 : 16;
            }
            if ((i10 & 896) == 0) {
                if ((i11 & 4) == 0) {
                    j11 = j10;
                    int i15 = composerStartRestartGroup.changed(j11) ? 256 : 128;
                    i12 |= i15;
                } else {
                    j11 = j10;
                }
                i12 |= i15;
            } else {
                j11 = j10;
            }
            if ((i12 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i13 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i14 != 0) {
                        fM1913getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m1913getActiveIndicatorHeightD9Ej5fM();
                    } else {
                        fM1913getActiveIndicatorHeightD9Ej5fM = f6;
                    }
                    if ((i11 & 4) != 0) {
                        jFromToken = ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor());
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1454716052, i10, -1, "androidx.compose.material3.TabRowDefaults.Indicator (TabRow.kt:382)");
                    }
                    BoxKt.Box(BackgroundKt.m122backgroundbw27NRU$default(SizeKt.m321height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), fM1913getActiveIndicatorHeightD9Ej5fM), jFromToken, null, 2, null), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    fM1913getActiveIndicatorHeightD9Ej5fM = f6;
                }
                jFromToken = j11;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1454716052, i10, -1, "androidx.compose.material3.TabRowDefaults.Indicator (TabRow.kt:382)");
                }
                BoxKt.Box(BackgroundKt.m122backgroundbw27NRU$default(SizeKt.m321height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), fM1913getActiveIndicatorHeightD9Ej5fM), jFromToken, null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier2 = modifier;
                fM1913getActiveIndicatorHeightD9Ej5fM = f6;
                jFromToken = j11;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier2, fM1913getActiveIndicatorHeightD9Ej5fM, jFromToken, i10, i11));
        }
        i12 |= 48;
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                j11 = j10;
                if (composerStartRestartGroup.changed(j11)) {
                }
                i12 |= i15;
            } else {
                j11 = j10;
            }
            i12 |= i15;
        } else {
            j11 = j10;
        }
        if ((i12 & 731) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i14 != 0) {
                    fM1913getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m1913getActiveIndicatorHeightD9Ej5fM();
                } else {
                    fM1913getActiveIndicatorHeightD9Ej5fM = f6;
                }
                if ((i11 & 4) != 0) {
                    jFromToken = ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor());
                } else {
                    jFromToken = j11;
                }
            } else {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i14 != 0) {
                    fM1913getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m1913getActiveIndicatorHeightD9Ej5fM();
                } else {
                    fM1913getActiveIndicatorHeightD9Ej5fM = f6;
                }
                if ((i11 & 4) != 0) {
                    jFromToken = ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor());
                } else {
                    jFromToken = j11;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1454716052, i10, -1, "androidx.compose.material3.TabRowDefaults.Indicator (TabRow.kt:382)");
            }
            BoxKt.Box(BackgroundKt.m122backgroundbw27NRU$default(SizeKt.m321height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), fM1913getActiveIndicatorHeightD9Ej5fM), jFromToken, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i14 != 0) {
                    fM1913getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m1913getActiveIndicatorHeightD9Ej5fM();
                } else {
                    fM1913getActiveIndicatorHeightD9Ej5fM = f6;
                }
                if ((i11 & 4) != 0) {
                    jFromToken = ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor());
                } else {
                    jFromToken = j11;
                }
            } else {
                if (i13 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i14 != 0) {
                    fM1913getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m1913getActiveIndicatorHeightD9Ej5fM();
                } else {
                    fM1913getActiveIndicatorHeightD9Ej5fM = f6;
                }
                if ((i11 & 4) != 0) {
                    jFromToken = ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor());
                } else {
                    jFromToken = j11;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1454716052, i10, -1, "androidx.compose.material3.TabRowDefaults.Indicator (TabRow.kt:382)");
            }
            BoxKt.Box(BackgroundKt.m122backgroundbw27NRU$default(SizeKt.m321height3ABfNKs(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), fM1913getActiveIndicatorHeightD9Ej5fM), jFromToken, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier2, fM1913getActiveIndicatorHeightD9Ej5fM, jFromToken, i10, i11));
    }

    @Composable
    @JvmName(name = "getContainerColor")
    public final long getContainerColor(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-2026555673);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2026555673, i10, -1, "androidx.compose.material3.TabRowDefaults.<get-containerColor> (TabRow.kt:366)");
        }
        long color = ColorSchemeKt.toColor(PrimaryNavigationTabTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @Composable
    @JvmName(name = "getContentColor")
    public final long getContentColor(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1163072359);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1163072359, i10, -1, "androidx.compose.material3.TabRowDefaults.<get-contentColor> (TabRow.kt:370)");
        }
        long color = ColorSchemeKt.toColor(PrimaryNavigationTabTokens.INSTANCE.getActiveLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    @NotNull
    public final Modifier tabIndicatorOffset(@NotNull Modifier modifier, @NotNull final TabPosition currentTabPosition) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(currentTabPosition, "currentTabPosition");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("tabIndicatorOffset");
                inspectorInfo.setValue(currentTabPosition);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new b(currentTabPosition));
    }
}
