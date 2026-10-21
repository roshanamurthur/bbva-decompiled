package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J3\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\nJ\u0012\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fR\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0018\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u0017R \u0010\u001b\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0017R \u0010\u001e\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0017\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006#²\u0006\f\u0010!\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\"\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/TabRowDefaults;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/Dp;", "thickness", "Landroidx/compose/ui/graphics/Color;", "color", "", "Divider-9IZ8Weo", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "Divider", "height", "Indicator-9IZ8Weo", "Indicator", "Landroidx/compose/material/TabPosition;", "currentTabPosition", "tabIndicatorOffset", "", "DividerOpacity", "F", "a", "getDividerThickness-D9Ej5fM", "()F", "DividerThickness", "b", "getIndicatorHeight-D9Ej5fM", "IndicatorHeight", "c", "getScrollableTabRowPadding-D9Ej5fM", "ScrollableTabRowPadding", "<init>", "()V", "currentTabWidth", "indicatorOffset", "material_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,517:1\n76#2:518\n76#2:519\n135#3:520\n154#4:521\n154#4:522\n154#4:523\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowDefaults\n*L\n367#1:518\n384#1:519\n404#1:520\n431#1:521\n436#1:522\n441#1:523\n*E\n"})
public final class TabRowDefaults {
    public static final int $stable = 0;
    public static final float DividerOpacity = 0.12f;

    @NotNull
    public static final TabRowDefaults INSTANCE = new TabRowDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final float DividerThickness = Dp.m4389constructorimpl(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float IndicatorHeight = Dp.m4389constructorimpl(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final float ScrollableTabRowPadding = Dp.m4389constructorimpl(52);

    /* JADX INFO: compiled from: TabRow.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f8085q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f8086r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f8087s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f8088t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f8089u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Modifier modifier, float f6, long j10, int i10, int i11) {
            super(2);
            this.f8085q0 = modifier;
            this.f8086r0 = f6;
            this.f8087s0 = j10;
            this.f8088t0 = i10;
            this.f8089u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TabRowDefaults.this.m852Divider9IZ8Weo(this.f8085q0, this.f8086r0, this.f8087s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8088t0 | 1), this.f8089u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TabRow.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f8091q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f8092r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f8093s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f8094t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f8095u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Modifier modifier, float f6, long j10, int i10, int i11) {
            super(2);
            this.f8091q0 = modifier;
            this.f8092r0 = f6;
            this.f8093s0 = j10;
            this.f8094t0 = i10;
            this.f8095u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TabRowDefaults.this.m853Indicator9IZ8Weo(this.f8091q0, this.f8092r0, this.f8093s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8094t0 | 1), this.f8095u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TabRow.kt */
    @SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowDefaults$tabIndicatorOffset$2\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,517:1\n81#2:518\n81#2:519\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowDefaults$tabIndicatorOffset$2\n*L\n409#1:518\n413#1:519\n*E\n"})
    public static final class c extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TabPosition f8096p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TabPosition tabPosition) {
            super(3);
            this.f8096p0 = tabPosition;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Modifier modifier2 = modifier;
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier2, "$this$composed", composer2, -398757863);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-398757863, iA, -1, "androidx.compose.material.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:407)");
            }
            TabPosition tabPosition = this.f8096p0;
            State<Dp> stateM67animateDpAsStateAjpBEmI = AnimateAsStateKt.m67animateDpAsStateAjpBEmI(tabPosition.getWidth(), AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, composer2, 0, 12);
            Modifier modifierM340width3ABfNKs = SizeKt.m340width3ABfNKs(OffsetKt.m270offsetVpY3zN4$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), Alignment.INSTANCE.getBottomStart(), false, 2, null), AnimateAsStateKt.m67animateDpAsStateAjpBEmI(tabPosition.getCom.dasnano.vdphotoselfiecapture.api.model.Parameters.DIRECTION.LEFT java.lang.String(), AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, composer2, 0, 12).getValue().m4403unboximpl(), 0.0f, 2, null), stateM67animateDpAsStateAjpBEmI.getValue().m4403unboximpl());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return modifierM340width3ABfNKs;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Divider-9IZ8Weo, reason: not valid java name */
    public final void m852Divider9IZ8Weo(@Nullable Modifier modifier, float f6, long j10, @Nullable Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        float f10;
        long jM2507copywmQWz5c$default;
        Modifier modifier3;
        float f11;
        long j11;
        Composer composerStartRestartGroup = composer.startRestartGroup(910934799);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 14) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                f10 = f6;
                int i14 = composerStartRestartGroup.changed(f10) ? 32 : 16;
                i12 |= i14;
            } else {
                f10 = f6;
            }
            i12 |= i14;
        } else {
            f10 = f6;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                jM2507copywmQWz5c$default = j10;
                int i15 = composerStartRestartGroup.changed(jM2507copywmQWz5c$default) ? 256 : 128;
                i12 |= i15;
            } else {
                jM2507copywmQWz5c$default = j10;
            }
            i12 |= i15;
        } else {
            jM2507copywmQWz5c$default = j10;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changed(this) ? 2048 : 1024;
        }
        if ((i12 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            f11 = f10;
            j11 = jM2507copywmQWz5c$default;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i13 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                    f11 = DividerThickness;
                } else {
                    f11 = f10;
                }
                if ((i11 & 4) != 0) {
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    i12 &= -897;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
                modifier3 = modifier2;
                f11 = f10;
            }
            long j12 = jM2507copywmQWz5c$default;
            int i16 = i12;
            j11 = j12;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(910934799, i16, -1, "androidx.compose.material.TabRowDefaults.Divider (TabRow.kt:363)");
            }
            DividerKt.m746DivideroMI9zvI(modifier3, j11, f11, 0.0f, composerStartRestartGroup, (i16 & 14) | ((i16 >> 3) & 112) | ((i16 << 3) & 896), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(modifier3, f11, j11, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Indicator-9IZ8Weo, reason: not valid java name */
    public final void m853Indicator9IZ8Weo(@Nullable Modifier modifier, float f6, long j10, @Nullable Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        float f10;
        long jM2518unboximpl;
        Modifier modifier3;
        float f11;
        long j11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1499002201);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 14) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                f10 = f6;
                int i14 = composerStartRestartGroup.changed(f10) ? 32 : 16;
                i12 |= i14;
            } else {
                f10 = f6;
            }
            i12 |= i14;
        } else {
            f10 = f6;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                jM2518unboximpl = j10;
                int i15 = composerStartRestartGroup.changed(jM2518unboximpl) ? 256 : 128;
                i12 |= i15;
            } else {
                jM2518unboximpl = j10;
            }
            i12 |= i15;
        } else {
            jM2518unboximpl = j10;
        }
        if ((i11 & 8) == 0) {
            if ((i10 & 7168) == 0) {
                i12 |= composerStartRestartGroup.changed(this) ? 2048 : 1024;
            }
            if ((i12 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i13 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        f11 = IndicatorHeight;
                    } else {
                        f11 = f10;
                    }
                    if ((i11 & 4) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    f11 = f10;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1499002201, i10, -1, "androidx.compose.material.TabRowDefaults.Indicator (TabRow.kt:380)");
                }
                BoxKt.Box(BackgroundKt.m122backgroundbw27NRU$default(SizeKt.m321height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), f11), jM2518unboximpl, null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                f11 = f10;
            }
            j11 = jM2518unboximpl;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, f11, j11, i10, i11));
        }
        i12 |= 3072;
        if ((i12 & 5851) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    f11 = IndicatorHeight;
                } else {
                    f11 = f10;
                }
                if ((i11 & 4) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                }
            } else {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    f11 = IndicatorHeight;
                } else {
                    f11 = f10;
                }
                if ((i11 & 4) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1499002201, i10, -1, "androidx.compose.material.TabRowDefaults.Indicator (TabRow.kt:380)");
            }
            BoxKt.Box(BackgroundKt.m122backgroundbw27NRU$default(SizeKt.m321height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), f11), jM2518unboximpl, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    f11 = IndicatorHeight;
                } else {
                    f11 = f10;
                }
                if ((i11 & 4) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                }
            } else {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    f11 = IndicatorHeight;
                } else {
                    f11 = f10;
                }
                if ((i11 & 4) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1499002201, i10, -1, "androidx.compose.material.TabRowDefaults.Indicator (TabRow.kt:380)");
            }
            BoxKt.Box(BackgroundKt.m122backgroundbw27NRU$default(SizeKt.m321height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), f11), jM2518unboximpl, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        j11 = jM2518unboximpl;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, f11, j11, i10, i11));
    }

    /* JADX INFO: renamed from: getDividerThickness-D9Ej5fM, reason: not valid java name */
    public final float m854getDividerThicknessD9Ej5fM() {
        return DividerThickness;
    }

    /* JADX INFO: renamed from: getIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m855getIndicatorHeightD9Ej5fM() {
        return IndicatorHeight;
    }

    /* JADX INFO: renamed from: getScrollableTabRowPadding-D9Ej5fM, reason: not valid java name */
    public final float m856getScrollableTabRowPaddingD9Ej5fM() {
        return ScrollableTabRowPadding;
    }

    @NotNull
    public final Modifier tabIndicatorOffset(@NotNull Modifier modifier, @NotNull final TabPosition currentTabPosition) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(currentTabPosition, "currentTabPosition");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1
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
        } : InspectableValueKt.getNoInspectorInfo(), new c(currentTabPosition));
    }
}
