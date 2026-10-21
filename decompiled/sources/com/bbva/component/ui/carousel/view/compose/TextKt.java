package com.bbva.component.ui.carousel.view.compose;

import androidx.appcompat.widget.g0;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.bbva.component.ui.carousel.view.compose.theme.Dimension;
import com.bbva.component.ui.carousel.view.compose.theme.Theme;
import com.mypinpad.tsdk.isolation.y2;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Text.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Link", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "onClick", "Lkotlin/Function0;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Title", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "component-ui-carousel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Text.kt\ncom/bbva/component/ui/carousel/view/compose/TextKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,86:1\n67#2,6:87\n73#2:119\n77#2:124\n67#2,6:139\n73#2:171\n77#2:176\n75#3:93\n76#3,11:95\n89#3:123\n75#3:145\n76#3,11:147\n89#3:175\n76#4:94\n76#4:146\n460#5,13:106\n473#5,3:120\n25#5:125\n36#5:132\n460#5,13:158\n473#5,3:172\n1114#6,6:126\n1114#6,6:133\n76#7:177\n*S KotlinDebug\n*F\n+ 1 Text.kt\ncom/bbva/component/ui/carousel/view/compose/TextKt\n*L\n28#1:87,6\n28#1:119\n28#1:124\n57#1:139,6\n57#1:171\n57#1:176\n28#1:93\n28#1:95,11\n28#1:123\n57#1:145\n57#1:147,11\n57#1:175\n28#1:94\n57#1:146\n28#1:106,13\n28#1:120,3\n52#1:125\n62#1:132\n57#1:158,13\n57#1:172,3\n52#1:126,6\n62#1:133,6\n56#1:177\n*E\n"})
public final class TextKt {

    /* JADX INFO: compiled from: Text.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f28343p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Text.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f28344p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f28345q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f28346r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f28347s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f28348t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f28349u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Modifier modifier, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function0<Unit> function0, int i10, int i11) {
            super(2);
            this.f28344p0 = str;
            this.f28345q0 = modifier;
            this.f28346r0 = paddingValues;
            this.f28347s0 = mutableInteractionSource;
            this.f28348t0 = function0;
            this.f28349u0 = i10;
            this.v0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TextKt.Link(this.f28344p0, this.f28345q0, this.f28346r0, this.f28347s0, this.f28348t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f28349u0 | 1), this.v0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Text.kt */
    public static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f28350p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function0<Unit> function0) {
            super(0);
            this.f28350p0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f28350p0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Text.kt */
    public static final class d extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f28351p0 = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setContainer(semantics, true);
            SemanticsPropertiesKt.m3843setRolekuIjeqM(semantics, Role.INSTANCE.m3831getButtono7Vup1c());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Text.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f28352p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f28353q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f28354r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f28355s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f28356t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f28357u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Modifier modifier, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function0<Unit> function0, int i10, int i11) {
            super(2);
            this.f28352p0 = str;
            this.f28353q0 = modifier;
            this.f28354r0 = paddingValues;
            this.f28355s0 = mutableInteractionSource;
            this.f28356t0 = function0;
            this.f28357u0 = i10;
            this.v0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TextKt.Link(this.f28352p0, this.f28353q0, this.f28354r0, this.f28355s0, this.f28356t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f28357u0 | 1), this.v0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Text.kt */
    public static final class f extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f28358p0 = new f(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setFocused(semantics, true);
            SemanticsPropertiesKt.setContainer(semantics, true);
            SemanticsPropertiesKt.heading(semantics);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Text.kt */
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f28359p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f28360q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f28361r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f28362s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Modifier modifier, int i10, int i11) {
            super(2);
            this.f28359p0 = str;
            this.f28360q0 = modifier;
            this.f28361r0 = i10;
            this.f28362s0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f28361r0 | 1);
            TextKt.Title(this.f28359p0, this.f28360q0, composer, iUpdateChangedFlags, this.f28362s0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:102:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:105:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:107:0x0205  */
    /* JADX WARN: Code duplicated, block: B:110:0x027e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0290  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x0067  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0072  */
    /* JADX WARN: Code duplicated, block: B:48:0x0079  */
    /* JADX WARN: Code duplicated, block: B:51:0x007f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0085  */
    /* JADX WARN: Code duplicated, block: B:55:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0090  */
    /* JADX WARN: Code duplicated, block: B:60:0x009c  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:89:0x0109  */
    /* JADX WARN: Code duplicated, block: B:91:0x011e  */
    /* JADX WARN: Code duplicated, block: B:93:0x013e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0146  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ac  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Link(@Nullable String str, @Nullable Modifier modifier, @Nullable PaddingValues paddingValues, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Function0<Unit> function0, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        PaddingValues paddingValues2;
        int i14;
        int i15;
        MutableInteractionSource mutableInteractionSource2;
        int i16;
        int i17;
        Function0<Unit> function1;
        int i18;
        int i19;
        Modifier modifier3;
        PaddingValues paddingValuesM291PaddingValuesYgX7TsA$default;
        MutableInteractionSource mutableInteractionSource3;
        State<Boolean> stateCollectIsPressedAsState;
        boolean zChanged;
        Object objRememberedValue;
        Function0<ComposeUiNode> constructor;
        long jM4879getDefault0d7_KjU;
        Composer composer2;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource4;
        Function0<Unit> function2;
        PaddingValues paddingValues3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2;
        Composer composerStartRestartGroup = composer.startRestartGroup(201264077);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    paddingValues2 = paddingValues;
                    if (composerStartRestartGroup.changed(paddingValues2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((57344 & i10) == 0) {
                            function1 = function0;
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        i19 = i12;
                        if ((46811 & i19) == 9362 || !composerStartRestartGroup.getSkipping()) {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                            } else {
                                paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if (i17 != 0) {
                                function1 = a.f28343p0;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                            }
                            if (str == null) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                    return;
                                }
                                scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                                return;
                            }
                            stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(function1);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new c(function1);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Modifier modifierSemantics = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            Alignment.Companion companion = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion, false, composerStartRestartGroup, 0, -1323940314);
                            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSemantics);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerStartRestartGroup.disableReusing();
                            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, density));
                            ai.a.j(0, function3MaterializerOf, g0.b(companion2, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                                composerStartRestartGroup.startReplaceableGroup(-1050024417);
                                jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-1050024357);
                                jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                            MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                            Function0<Unit> function3 = function1;
                            PaddingValues paddingValues4 = paddingValuesM291PaddingValuesYgX7TsA$default;
                            composer2 = composerStartRestartGroup;
                            androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                            if (y2.d(composer2)) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            mutableInteractionSource4 = mutableInteractionSource5;
                            function2 = function3;
                            paddingValues3 = paddingValues4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            composer2 = composerStartRestartGroup;
                            modifier4 = modifier2;
                            paddingValues3 = paddingValues2;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            function2 = function1;
                        }
                        scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup2 == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup2.updateScope(new e(str, modifier4, paddingValues3, mutableInteractionSource4, function2, i10, i11));
                    }
                    i12 |= 24576;
                    function1 = function0;
                    i19 = i12;
                    if ((46811 & i19) == 9362) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                        } else {
                            paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if (i17 != 0) {
                            function1 = a.f28343p0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                        }
                        if (str == null) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                            return;
                        }
                        stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function1);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierSemantics2 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyC2 = androidx.databinding.f.c(companion3, false, composerStartRestartGroup, 0, -1323940314);
                        Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        constructor = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierSemantics2);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerStartRestartGroup.disableReusing();
                        Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion4, composerM2074constructorimpl2, measurePolicyC2, composerM2074constructorimpl2, density2));
                        ai.a.j(0, function3MaterializerOf2, g0.b(companion4, composerM2074constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                            composerStartRestartGroup.startReplaceableGroup(-1050024417);
                            jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-1050024357);
                            jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                        Function0<Unit> function4 = function1;
                        PaddingValues paddingValues5 = paddingValuesM291PaddingValuesYgX7TsA$default;
                        composer2 = composerStartRestartGroup;
                        androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion3.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                        if (y2.d(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource4 = mutableInteractionSource6;
                        function2 = function4;
                        paddingValues3 = paddingValues5;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                        } else {
                            paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if (i17 != 0) {
                            function1 = a.f28343p0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                        }
                        if (str == null) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                            return;
                        }
                        stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function1);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierSemantics3 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Alignment.Companion companion5 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyC3 = androidx.databinding.f.c(companion5, false, composerStartRestartGroup, 0, -1323940314);
                        Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                        constructor = companion6.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierSemantics3);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerStartRestartGroup.disableReusing();
                        Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        Updater.m2081setimpl(composerM2074constructorimpl3, layoutDirection3, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion6, composerM2074constructorimpl3, measurePolicyC3, composerM2074constructorimpl3, density3));
                        ai.a.j(0, function3MaterializerOf3, g0.b(companion6, composerM2074constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                        if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                            composerStartRestartGroup.startReplaceableGroup(-1050024417);
                            jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-1050024357);
                            jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                        Function0<Unit> function5 = function1;
                        PaddingValues paddingValues6 = paddingValuesM291PaddingValuesYgX7TsA$default;
                        composer2 = composerStartRestartGroup;
                        androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion5.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                        if (y2.d(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource4 = mutableInteractionSource7;
                        function2 = function5;
                        paddingValues3 = paddingValues6;
                    }
                    scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup2.updateScope(new e(str, modifier4, paddingValues3, mutableInteractionSource4, function2, i10, i11));
                }
                i12 |= 3072;
                mutableInteractionSource2 = mutableInteractionSource;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((57344 & i10) == 0) {
                        function1 = function0;
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i12;
                    if ((46811 & i19) == 9362) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                        } else {
                            paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if (i17 != 0) {
                            function1 = a.f28343p0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                        }
                        if (str == null) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                            return;
                        }
                        stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function1);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierSemantics4 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Alignment.Companion companion7 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyC4 = androidx.databinding.f.c(companion7, false, composerStartRestartGroup, 0, -1323940314);
                        Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                        constructor = companion8.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierSemantics4);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerStartRestartGroup.disableReusing();
                        Composer composerM2074constructorimpl4 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        Updater.m2081setimpl(composerM2074constructorimpl4, layoutDirection4, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion8, composerM2074constructorimpl4, measurePolicyC4, composerM2074constructorimpl4, density4));
                        ai.a.j(0, function3MaterializerOf4, g0.b(companion8, composerM2074constructorimpl4, viewConfiguration4, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                        if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                            composerStartRestartGroup.startReplaceableGroup(-1050024417);
                            jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-1050024357);
                            jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource3;
                        Function0<Unit> function6 = function1;
                        PaddingValues paddingValues7 = paddingValuesM291PaddingValuesYgX7TsA$default;
                        composer2 = composerStartRestartGroup;
                        androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion7.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                        if (y2.d(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource4 = mutableInteractionSource8;
                        function2 = function6;
                        paddingValues3 = paddingValues7;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                        } else {
                            paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if (i17 != 0) {
                            function1 = a.f28343p0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                        }
                        if (str == null) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                            return;
                        }
                        stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function1);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierSemantics5 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Alignment.Companion companion9 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyC5 = androidx.databinding.f.c(companion9, false, composerStartRestartGroup, 0, -1323940314);
                        Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                        constructor = companion10.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierSemantics5);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerStartRestartGroup.disableReusing();
                        Composer composerM2074constructorimpl5 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        Updater.m2081setimpl(composerM2074constructorimpl5, layoutDirection5, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion10, composerM2074constructorimpl5, measurePolicyC5, composerM2074constructorimpl5, density5));
                        ai.a.j(0, function3MaterializerOf5, g0.b(companion10, composerM2074constructorimpl5, viewConfiguration5, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                        if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                            composerStartRestartGroup.startReplaceableGroup(-1050024417);
                            jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-1050024357);
                            jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource3;
                        Function0<Unit> function7 = function1;
                        PaddingValues paddingValues8 = paddingValuesM291PaddingValuesYgX7TsA$default;
                        composer2 = composerStartRestartGroup;
                        androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion9.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                        if (y2.d(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource4 = mutableInteractionSource9;
                        function2 = function7;
                        paddingValues3 = paddingValues8;
                    }
                    scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup2.updateScope(new e(str, modifier4, paddingValues3, mutableInteractionSource4, function2, i10, i11));
                }
                i12 |= 24576;
                function1 = function0;
                i19 = i12;
                if ((46811 & i19) == 9362) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                    } else {
                        paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (i17 != 0) {
                        function1 = a.f28343p0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                    }
                    if (str == null) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                        return;
                    }
                    stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics6 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion11 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyC6 = androidx.databinding.f.c(companion11, false, composerStartRestartGroup, 0, -1323940314);
                    Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration6 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                    constructor = companion12.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(modifierSemantics6);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2074constructorimpl6 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl6, layoutDirection6, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion12, composerM2074constructorimpl6, measurePolicyC6, composerM2074constructorimpl6, density6));
                    ai.a.j(0, function3MaterializerOf6, g0.b(companion12, composerM2074constructorimpl6, viewConfiguration6, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                    if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-1050024417);
                        jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1050024357);
                        jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    MutableInteractionSource mutableInteractionSource10 = mutableInteractionSource3;
                    Function0<Unit> function8 = function1;
                    PaddingValues paddingValues9 = paddingValuesM291PaddingValuesYgX7TsA$default;
                    composer2 = composerStartRestartGroup;
                    androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion11.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                    if (y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource4 = mutableInteractionSource10;
                    function2 = function8;
                    paddingValues3 = paddingValues9;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                    } else {
                        paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (i17 != 0) {
                        function1 = a.f28343p0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                    }
                    if (str == null) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                        return;
                    }
                    stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics7 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion13 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyC7 = androidx.databinding.f.c(companion13, false, composerStartRestartGroup, 0, -1323940314);
                    Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration7 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                    constructor = companion14.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf7 = LayoutKt.materializerOf(modifierSemantics7);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2074constructorimpl7 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl7, layoutDirection7, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion14, composerM2074constructorimpl7, measurePolicyC7, composerM2074constructorimpl7, density7));
                    ai.a.j(0, function3MaterializerOf7, g0.b(companion14, composerM2074constructorimpl7, viewConfiguration7, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                    if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-1050024417);
                        jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1050024357);
                        jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    MutableInteractionSource mutableInteractionSource11 = mutableInteractionSource3;
                    Function0<Unit> function9 = function1;
                    PaddingValues paddingValues10 = paddingValuesM291PaddingValuesYgX7TsA$default;
                    composer2 = composerStartRestartGroup;
                    androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion13.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                    if (y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource4 = mutableInteractionSource11;
                    function2 = function9;
                    paddingValues3 = paddingValues10;
                }
                scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup2.updateScope(new e(str, modifier4, paddingValues3, mutableInteractionSource4, function2, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            paddingValues2 = paddingValues;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((57344 & i10) == 0) {
                        function1 = function0;
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i12;
                    if ((46811 & i19) == 9362) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                        } else {
                            paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if (i17 != 0) {
                            function1 = a.f28343p0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                        }
                        if (str == null) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                            return;
                        }
                        stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function1);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierSemantics8 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Alignment.Companion companion15 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyC8 = androidx.databinding.f.c(companion15, false, composerStartRestartGroup, 0, -1323940314);
                        Density density8 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection8 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration8 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                        constructor = companion16.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf8 = LayoutKt.materializerOf(modifierSemantics8);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerStartRestartGroup.disableReusing();
                        Composer composerM2074constructorimpl8 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        Updater.m2081setimpl(composerM2074constructorimpl8, layoutDirection8, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion16, composerM2074constructorimpl8, measurePolicyC8, composerM2074constructorimpl8, density8));
                        ai.a.j(0, function3MaterializerOf8, g0.b(companion16, composerM2074constructorimpl8, viewConfiguration8, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                        if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                            composerStartRestartGroup.startReplaceableGroup(-1050024417);
                            jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-1050024357);
                            jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        MutableInteractionSource mutableInteractionSource12 = mutableInteractionSource3;
                        Function0<Unit> function10 = function1;
                        PaddingValues paddingValues11 = paddingValuesM291PaddingValuesYgX7TsA$default;
                        composer2 = composerStartRestartGroup;
                        androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion15.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                        if (y2.d(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource4 = mutableInteractionSource12;
                        function2 = function10;
                        paddingValues3 = paddingValues11;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                        } else {
                            paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if (i17 != 0) {
                            function1 = a.f28343p0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                        }
                        if (str == null) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                            return;
                        }
                        stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function1);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierSemantics9 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Alignment.Companion companion17 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyC9 = androidx.databinding.f.c(companion17, false, composerStartRestartGroup, 0, -1323940314);
                        Density density9 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection9 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration9 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                        constructor = companion18.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf9 = LayoutKt.materializerOf(modifierSemantics9);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerStartRestartGroup.disableReusing();
                        Composer composerM2074constructorimpl9 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        Updater.m2081setimpl(composerM2074constructorimpl9, layoutDirection9, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion18, composerM2074constructorimpl9, measurePolicyC9, composerM2074constructorimpl9, density9));
                        ai.a.j(0, function3MaterializerOf9, g0.b(companion18, composerM2074constructorimpl9, viewConfiguration9, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                        if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                            composerStartRestartGroup.startReplaceableGroup(-1050024417);
                            jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-1050024357);
                            jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        MutableInteractionSource mutableInteractionSource13 = mutableInteractionSource3;
                        Function0<Unit> function11 = function1;
                        PaddingValues paddingValues12 = paddingValuesM291PaddingValuesYgX7TsA$default;
                        composer2 = composerStartRestartGroup;
                        androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion17.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                        if (y2.d(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource4 = mutableInteractionSource13;
                        function2 = function11;
                        paddingValues3 = paddingValues12;
                    }
                    scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup2.updateScope(new e(str, modifier4, paddingValues3, mutableInteractionSource4, function2, i10, i11));
                }
                i12 |= 24576;
                function1 = function0;
                i19 = i12;
                if ((46811 & i19) == 9362) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                    } else {
                        paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (i17 != 0) {
                        function1 = a.f28343p0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                    }
                    if (str == null) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                        return;
                    }
                    stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics10 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion19 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyC10 = androidx.databinding.f.c(companion19, false, composerStartRestartGroup, 0, -1323940314);
                    Density density10 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection10 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration10 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion110 = ComposeUiNode.INSTANCE;
                    constructor = companion110.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf10 = LayoutKt.materializerOf(modifierSemantics10);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2074constructorimpl10 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl10, layoutDirection10, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion110, composerM2074constructorimpl10, measurePolicyC10, composerM2074constructorimpl10, density10));
                    ai.a.j(0, function3MaterializerOf10, g0.b(companion110, composerM2074constructorimpl10, viewConfiguration10, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                    if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-1050024417);
                        jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1050024357);
                        jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    MutableInteractionSource mutableInteractionSource14 = mutableInteractionSource3;
                    Function0<Unit> function12 = function1;
                    PaddingValues paddingValues13 = paddingValuesM291PaddingValuesYgX7TsA$default;
                    composer2 = composerStartRestartGroup;
                    androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion19.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                    if (y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource4 = mutableInteractionSource14;
                    function2 = function12;
                    paddingValues3 = paddingValues13;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                    } else {
                        paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (i17 != 0) {
                        function1 = a.f28343p0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                    }
                    if (str == null) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                        return;
                    }
                    stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics11 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion111 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyC11 = androidx.databinding.f.c(companion111, false, composerStartRestartGroup, 0, -1323940314);
                    Density density11 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection11 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration11 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion112 = ComposeUiNode.INSTANCE;
                    constructor = companion112.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf11 = LayoutKt.materializerOf(modifierSemantics11);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2074constructorimpl11 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl11, layoutDirection11, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion112, composerM2074constructorimpl11, measurePolicyC11, composerM2074constructorimpl11, density11));
                    ai.a.j(0, function3MaterializerOf11, g0.b(companion112, composerM2074constructorimpl11, viewConfiguration11, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                    if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-1050024417);
                        jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1050024357);
                        jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    MutableInteractionSource mutableInteractionSource15 = mutableInteractionSource3;
                    Function0<Unit> function13 = function1;
                    PaddingValues paddingValues14 = paddingValuesM291PaddingValuesYgX7TsA$default;
                    composer2 = composerStartRestartGroup;
                    androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion111.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                    if (y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource4 = mutableInteractionSource15;
                    function2 = function13;
                    paddingValues3 = paddingValues14;
                }
                scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup2.updateScope(new e(str, modifier4, paddingValues3, mutableInteractionSource4, function2, i10, i11));
            }
            i12 |= 3072;
            mutableInteractionSource2 = mutableInteractionSource;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((57344 & i10) == 0) {
                    function1 = function0;
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i12;
                if ((46811 & i19) == 9362) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                    } else {
                        paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (i17 != 0) {
                        function1 = a.f28343p0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                    }
                    if (str == null) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                        return;
                    }
                    stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics12 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion113 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyC12 = androidx.databinding.f.c(companion113, false, composerStartRestartGroup, 0, -1323940314);
                    Density density12 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection12 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration12 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion114 = ComposeUiNode.INSTANCE;
                    constructor = companion114.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf12 = LayoutKt.materializerOf(modifierSemantics12);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2074constructorimpl12 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl12, layoutDirection12, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion114, composerM2074constructorimpl12, measurePolicyC12, composerM2074constructorimpl12, density12));
                    ai.a.j(0, function3MaterializerOf12, g0.b(companion114, composerM2074constructorimpl12, viewConfiguration12, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                    if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-1050024417);
                        jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1050024357);
                        jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    MutableInteractionSource mutableInteractionSource16 = mutableInteractionSource3;
                    Function0<Unit> function14 = function1;
                    PaddingValues paddingValues15 = paddingValuesM291PaddingValuesYgX7TsA$default;
                    composer2 = composerStartRestartGroup;
                    androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion113.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                    if (y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource4 = mutableInteractionSource16;
                    function2 = function14;
                    paddingValues3 = paddingValues15;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                    } else {
                        paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (i17 != 0) {
                        function1 = a.f28343p0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                    }
                    if (str == null) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                        return;
                    }
                    stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics13 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion115 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyC13 = androidx.databinding.f.c(companion115, false, composerStartRestartGroup, 0, -1323940314);
                    Density density13 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection13 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration13 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion116 = ComposeUiNode.INSTANCE;
                    constructor = companion116.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf13 = LayoutKt.materializerOf(modifierSemantics13);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2074constructorimpl13 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl13, layoutDirection13, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion116, composerM2074constructorimpl13, measurePolicyC13, composerM2074constructorimpl13, density13));
                    ai.a.j(0, function3MaterializerOf13, g0.b(companion116, composerM2074constructorimpl13, viewConfiguration13, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                    if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-1050024417);
                        jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1050024357);
                        jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    MutableInteractionSource mutableInteractionSource17 = mutableInteractionSource3;
                    Function0<Unit> function15 = function1;
                    PaddingValues paddingValues16 = paddingValuesM291PaddingValuesYgX7TsA$default;
                    composer2 = composerStartRestartGroup;
                    androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion115.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                    if (y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource4 = mutableInteractionSource17;
                    function2 = function15;
                    paddingValues3 = paddingValues16;
                }
                scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup2.updateScope(new e(str, modifier4, paddingValues3, mutableInteractionSource4, function2, i10, i11));
            }
            i12 |= 24576;
            function1 = function0;
            i19 = i12;
            if ((46811 & i19) == 9362) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                } else {
                    paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (i17 != 0) {
                    function1 = a.f28343p0;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                }
                if (str == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                    return;
                }
                stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics14 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion117 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyC14 = androidx.databinding.f.c(companion117, false, composerStartRestartGroup, 0, -1323940314);
                Density density14 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection14 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration14 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion118 = ComposeUiNode.INSTANCE;
                constructor = companion118.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf14 = LayoutKt.materializerOf(modifierSemantics14);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl14 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl14, layoutDirection14, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion118, composerM2074constructorimpl14, measurePolicyC14, composerM2074constructorimpl14, density14));
                ai.a.j(0, function3MaterializerOf14, g0.b(companion118, composerM2074constructorimpl14, viewConfiguration14, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.INSTANCE;
                if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-1050024417);
                    jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1050024357);
                    jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                MutableInteractionSource mutableInteractionSource18 = mutableInteractionSource3;
                Function0<Unit> function16 = function1;
                PaddingValues paddingValues17 = paddingValuesM291PaddingValuesYgX7TsA$default;
                composer2 = composerStartRestartGroup;
                androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion117.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                if (y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource4 = mutableInteractionSource18;
                function2 = function16;
                paddingValues3 = paddingValues17;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                } else {
                    paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (i17 != 0) {
                    function1 = a.f28343p0;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                }
                if (str == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                    return;
                }
                stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics15 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion119 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyC15 = androidx.databinding.f.c(companion119, false, composerStartRestartGroup, 0, -1323940314);
                Density density15 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection15 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration15 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion1110 = ComposeUiNode.INSTANCE;
                constructor = companion1110.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf15 = LayoutKt.materializerOf(modifierSemantics15);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl15 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl15, layoutDirection15, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion1110, composerM2074constructorimpl15, measurePolicyC15, composerM2074constructorimpl15, density15));
                ai.a.j(0, function3MaterializerOf15, g0.b(companion1110, composerM2074constructorimpl15, viewConfiguration15, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.INSTANCE;
                if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-1050024417);
                    jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1050024357);
                    jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                MutableInteractionSource mutableInteractionSource19 = mutableInteractionSource3;
                Function0<Unit> function17 = function1;
                PaddingValues paddingValues18 = paddingValuesM291PaddingValuesYgX7TsA$default;
                composer2 = composerStartRestartGroup;
                androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion119.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                if (y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource4 = mutableInteractionSource19;
                function2 = function17;
                paddingValues3 = paddingValues18;
            }
            scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup2.updateScope(new e(str, modifier4, paddingValues3, mutableInteractionSource4, function2, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                paddingValues2 = paddingValues;
                if (composerStartRestartGroup.changed(paddingValues2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((57344 & i10) == 0) {
                        function1 = function0;
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i12;
                    if ((46811 & i19) == 9362) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                        } else {
                            paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if (i17 != 0) {
                            function1 = a.f28343p0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                        }
                        if (str == null) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                            return;
                        }
                        stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function1);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierSemantics16 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Alignment.Companion companion1111 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyC16 = androidx.databinding.f.c(companion1111, false, composerStartRestartGroup, 0, -1323940314);
                        Density density16 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection16 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration16 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion1112 = ComposeUiNode.INSTANCE;
                        constructor = companion1112.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf16 = LayoutKt.materializerOf(modifierSemantics16);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerStartRestartGroup.disableReusing();
                        Composer composerM2074constructorimpl16 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        Updater.m2081setimpl(composerM2074constructorimpl16, layoutDirection16, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion1112, composerM2074constructorimpl16, measurePolicyC16, composerM2074constructorimpl16, density16));
                        ai.a.j(0, function3MaterializerOf16, g0.b(companion1112, composerM2074constructorimpl16, viewConfiguration16, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance16 = BoxScopeInstance.INSTANCE;
                        if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                            composerStartRestartGroup.startReplaceableGroup(-1050024417);
                            jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-1050024357);
                            jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        MutableInteractionSource mutableInteractionSource110 = mutableInteractionSource3;
                        Function0<Unit> function18 = function1;
                        PaddingValues paddingValues19 = paddingValuesM291PaddingValuesYgX7TsA$default;
                        composer2 = composerStartRestartGroup;
                        androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion1111.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                        if (y2.d(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource4 = mutableInteractionSource110;
                        function2 = function18;
                        paddingValues3 = paddingValues19;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                        } else {
                            paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if (i17 != 0) {
                            function1 = a.f28343p0;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                        }
                        if (str == null) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                            return;
                        }
                        stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(function1);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue = new c(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = new c(function1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierSemantics17 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        Alignment.Companion companion1113 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyC17 = androidx.databinding.f.c(companion1113, false, composerStartRestartGroup, 0, -1323940314);
                        Density density17 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        LayoutDirection layoutDirection17 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                        ViewConfiguration viewConfiguration17 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                        ComposeUiNode.Companion companion1114 = ComposeUiNode.INSTANCE;
                        constructor = companion1114.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf17 = LayoutKt.materializerOf(modifierSemantics17);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerStartRestartGroup.disableReusing();
                        Composer composerM2074constructorimpl17 = Updater.m2074constructorimpl(composerStartRestartGroup);
                        Updater.m2081setimpl(composerM2074constructorimpl17, layoutDirection17, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion1114, composerM2074constructorimpl17, measurePolicyC17, composerM2074constructorimpl17, density17));
                        ai.a.j(0, function3MaterializerOf17, g0.b(companion1114, composerM2074constructorimpl17, viewConfiguration17, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance17 = BoxScopeInstance.INSTANCE;
                        if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                            composerStartRestartGroup.startReplaceableGroup(-1050024417);
                            jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-1050024357);
                            jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                            composerStartRestartGroup.endReplaceableGroup();
                        }
                        MutableInteractionSource mutableInteractionSource111 = mutableInteractionSource3;
                        Function0<Unit> function19 = function1;
                        PaddingValues paddingValues110 = paddingValuesM291PaddingValuesYgX7TsA$default;
                        composer2 = composerStartRestartGroup;
                        androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion1113.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                        if (y2.d(composer2)) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource4 = mutableInteractionSource111;
                        function2 = function19;
                        paddingValues3 = paddingValues110;
                    }
                    scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup2.updateScope(new e(str, modifier4, paddingValues3, mutableInteractionSource4, function2, i10, i11));
                }
                i12 |= 24576;
                function1 = function0;
                i19 = i12;
                if ((46811 & i19) == 9362) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                    } else {
                        paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (i17 != 0) {
                        function1 = a.f28343p0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                    }
                    if (str == null) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                        return;
                    }
                    stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics18 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion1115 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyC18 = androidx.databinding.f.c(companion1115, false, composerStartRestartGroup, 0, -1323940314);
                    Density density18 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection18 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration18 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion1116 = ComposeUiNode.INSTANCE;
                    constructor = companion1116.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf18 = LayoutKt.materializerOf(modifierSemantics18);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2074constructorimpl18 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl18, layoutDirection18, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion1116, composerM2074constructorimpl18, measurePolicyC18, composerM2074constructorimpl18, density18));
                    ai.a.j(0, function3MaterializerOf18, g0.b(companion1116, composerM2074constructorimpl18, viewConfiguration18, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance18 = BoxScopeInstance.INSTANCE;
                    if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-1050024417);
                        jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1050024357);
                        jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    MutableInteractionSource mutableInteractionSource112 = mutableInteractionSource3;
                    Function0<Unit> function110 = function1;
                    PaddingValues paddingValues111 = paddingValuesM291PaddingValuesYgX7TsA$default;
                    composer2 = composerStartRestartGroup;
                    androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion1115.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                    if (y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource4 = mutableInteractionSource112;
                    function2 = function110;
                    paddingValues3 = paddingValues111;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                    } else {
                        paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (i17 != 0) {
                        function1 = a.f28343p0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                    }
                    if (str == null) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                        return;
                    }
                    stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics19 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion1117 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyC19 = androidx.databinding.f.c(companion1117, false, composerStartRestartGroup, 0, -1323940314);
                    Density density19 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection19 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration19 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion1118 = ComposeUiNode.INSTANCE;
                    constructor = companion1118.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf19 = LayoutKt.materializerOf(modifierSemantics19);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2074constructorimpl19 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl19, layoutDirection19, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion1118, composerM2074constructorimpl19, measurePolicyC19, composerM2074constructorimpl19, density19));
                    ai.a.j(0, function3MaterializerOf19, g0.b(companion1118, composerM2074constructorimpl19, viewConfiguration19, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance19 = BoxScopeInstance.INSTANCE;
                    if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-1050024417);
                        jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1050024357);
                        jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    MutableInteractionSource mutableInteractionSource113 = mutableInteractionSource3;
                    Function0<Unit> function111 = function1;
                    PaddingValues paddingValues112 = paddingValuesM291PaddingValuesYgX7TsA$default;
                    composer2 = composerStartRestartGroup;
                    androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion1117.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                    if (y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource4 = mutableInteractionSource113;
                    function2 = function111;
                    paddingValues3 = paddingValues112;
                }
                scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup2.updateScope(new e(str, modifier4, paddingValues3, mutableInteractionSource4, function2, i10, i11));
            }
            i12 |= 3072;
            mutableInteractionSource2 = mutableInteractionSource;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((57344 & i10) == 0) {
                    function1 = function0;
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i12;
                if ((46811 & i19) == 9362) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                    } else {
                        paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (i17 != 0) {
                        function1 = a.f28343p0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                    }
                    if (str == null) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                        return;
                    }
                    stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics110 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion1119 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyC110 = androidx.databinding.f.c(companion1119, false, composerStartRestartGroup, 0, -1323940314);
                    Density density110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration110 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion11110 = ComposeUiNode.INSTANCE;
                    constructor = companion11110.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf110 = LayoutKt.materializerOf(modifierSemantics110);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2074constructorimpl110 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl110, layoutDirection110, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion11110, composerM2074constructorimpl110, measurePolicyC110, composerM2074constructorimpl110, density110));
                    ai.a.j(0, function3MaterializerOf110, g0.b(companion11110, composerM2074constructorimpl110, viewConfiguration110, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance110 = BoxScopeInstance.INSTANCE;
                    if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-1050024417);
                        jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1050024357);
                        jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    MutableInteractionSource mutableInteractionSource114 = mutableInteractionSource3;
                    Function0<Unit> function112 = function1;
                    PaddingValues paddingValues113 = paddingValuesM291PaddingValuesYgX7TsA$default;
                    composer2 = composerStartRestartGroup;
                    androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion1119.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                    if (y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource4 = mutableInteractionSource114;
                    function2 = function112;
                    paddingValues3 = paddingValues113;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                    } else {
                        paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (i17 != 0) {
                        function1 = a.f28343p0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                    }
                    if (str == null) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                        return;
                    }
                    stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics111 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion11111 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyC111 = androidx.databinding.f.c(companion11111, false, composerStartRestartGroup, 0, -1323940314);
                    Density density111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection111 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration111 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion11112 = ComposeUiNode.INSTANCE;
                    constructor = companion11112.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf111 = LayoutKt.materializerOf(modifierSemantics111);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2074constructorimpl111 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl111, layoutDirection111, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion11112, composerM2074constructorimpl111, measurePolicyC111, composerM2074constructorimpl111, density111));
                    ai.a.j(0, function3MaterializerOf111, g0.b(companion11112, composerM2074constructorimpl111, viewConfiguration111, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance111 = BoxScopeInstance.INSTANCE;
                    if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-1050024417);
                        jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1050024357);
                        jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    MutableInteractionSource mutableInteractionSource115 = mutableInteractionSource3;
                    Function0<Unit> function113 = function1;
                    PaddingValues paddingValues114 = paddingValuesM291PaddingValuesYgX7TsA$default;
                    composer2 = composerStartRestartGroup;
                    androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion11111.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                    if (y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource4 = mutableInteractionSource115;
                    function2 = function113;
                    paddingValues3 = paddingValues114;
                }
                scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup2.updateScope(new e(str, modifier4, paddingValues3, mutableInteractionSource4, function2, i10, i11));
            }
            i12 |= 24576;
            function1 = function0;
            i19 = i12;
            if ((46811 & i19) == 9362) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                } else {
                    paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (i17 != 0) {
                    function1 = a.f28343p0;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                }
                if (str == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                    return;
                }
                stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics112 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion11113 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyC112 = androidx.databinding.f.c(companion11113, false, composerStartRestartGroup, 0, -1323940314);
                Density density112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection112 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration112 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion11114 = ComposeUiNode.INSTANCE;
                constructor = companion11114.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf112 = LayoutKt.materializerOf(modifierSemantics112);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl112 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl112, layoutDirection112, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion11114, composerM2074constructorimpl112, measurePolicyC112, composerM2074constructorimpl112, density112));
                ai.a.j(0, function3MaterializerOf112, g0.b(companion11114, composerM2074constructorimpl112, viewConfiguration112, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance112 = BoxScopeInstance.INSTANCE;
                if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-1050024417);
                    jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1050024357);
                    jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                MutableInteractionSource mutableInteractionSource116 = mutableInteractionSource3;
                Function0<Unit> function114 = function1;
                PaddingValues paddingValues115 = paddingValuesM291PaddingValuesYgX7TsA$default;
                composer2 = composerStartRestartGroup;
                androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion11113.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                if (y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource4 = mutableInteractionSource116;
                function2 = function114;
                paddingValues3 = paddingValues115;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                } else {
                    paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (i17 != 0) {
                    function1 = a.f28343p0;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                }
                if (str == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                    return;
                }
                stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics113 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion11115 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyC113 = androidx.databinding.f.c(companion11115, false, composerStartRestartGroup, 0, -1323940314);
                Density density113 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection113 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration113 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion11116 = ComposeUiNode.INSTANCE;
                constructor = companion11116.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf113 = LayoutKt.materializerOf(modifierSemantics113);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl113 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl113, layoutDirection113, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion11116, composerM2074constructorimpl113, measurePolicyC113, composerM2074constructorimpl113, density113));
                ai.a.j(0, function3MaterializerOf113, g0.b(companion11116, composerM2074constructorimpl113, viewConfiguration113, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance113 = BoxScopeInstance.INSTANCE;
                if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-1050024417);
                    jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1050024357);
                    jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                MutableInteractionSource mutableInteractionSource117 = mutableInteractionSource3;
                Function0<Unit> function115 = function1;
                PaddingValues paddingValues116 = paddingValuesM291PaddingValuesYgX7TsA$default;
                composer2 = composerStartRestartGroup;
                androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion11115.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                if (y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource4 = mutableInteractionSource117;
                function2 = function115;
                paddingValues3 = paddingValues116;
            }
            scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup2.updateScope(new e(str, modifier4, paddingValues3, mutableInteractionSource4, function2, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        paddingValues2 = paddingValues;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((57344 & i10) == 0) {
                    function1 = function0;
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i12;
                if ((46811 & i19) == 9362) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                    } else {
                        paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (i17 != 0) {
                        function1 = a.f28343p0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                    }
                    if (str == null) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                        return;
                    }
                    stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics114 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion11117 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyC114 = androidx.databinding.f.c(companion11117, false, composerStartRestartGroup, 0, -1323940314);
                    Density density114 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection114 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration114 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion11118 = ComposeUiNode.INSTANCE;
                    constructor = companion11118.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf114 = LayoutKt.materializerOf(modifierSemantics114);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2074constructorimpl114 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl114, layoutDirection114, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion11118, composerM2074constructorimpl114, measurePolicyC114, composerM2074constructorimpl114, density114));
                    ai.a.j(0, function3MaterializerOf114, g0.b(companion11118, composerM2074constructorimpl114, viewConfiguration114, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance114 = BoxScopeInstance.INSTANCE;
                    if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-1050024417);
                        jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1050024357);
                        jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    MutableInteractionSource mutableInteractionSource118 = mutableInteractionSource3;
                    Function0<Unit> function116 = function1;
                    PaddingValues paddingValues117 = paddingValuesM291PaddingValuesYgX7TsA$default;
                    composer2 = composerStartRestartGroup;
                    androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion11117.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                    if (y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource4 = mutableInteractionSource118;
                    function2 = function116;
                    paddingValues3 = paddingValues117;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                    } else {
                        paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (i17 != 0) {
                        function1 = a.f28343p0;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                    }
                    if (str == null) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                        return;
                    }
                    stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new c(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = new c(function1);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierSemantics115 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    Alignment.Companion companion11119 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyC115 = androidx.databinding.f.c(companion11119, false, composerStartRestartGroup, 0, -1323940314);
                    Density density115 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection115 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration115 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    ComposeUiNode.Companion companion111110 = ComposeUiNode.INSTANCE;
                    constructor = companion111110.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf115 = LayoutKt.materializerOf(modifierSemantics115);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM2074constructorimpl115 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    Updater.m2081setimpl(composerM2074constructorimpl115, layoutDirection115, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion111110, composerM2074constructorimpl115, measurePolicyC115, composerM2074constructorimpl115, density115));
                    ai.a.j(0, function3MaterializerOf115, g0.b(companion111110, composerM2074constructorimpl115, viewConfiguration115, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance115 = BoxScopeInstance.INSTANCE;
                    if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-1050024417);
                        jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1050024357);
                        jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    MutableInteractionSource mutableInteractionSource119 = mutableInteractionSource3;
                    Function0<Unit> function117 = function1;
                    PaddingValues paddingValues118 = paddingValuesM291PaddingValuesYgX7TsA$default;
                    composer2 = composerStartRestartGroup;
                    androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion11119.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                    if (y2.d(composer2)) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource4 = mutableInteractionSource119;
                    function2 = function117;
                    paddingValues3 = paddingValues118;
                }
                scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup2.updateScope(new e(str, modifier4, paddingValues3, mutableInteractionSource4, function2, i10, i11));
            }
            i12 |= 24576;
            function1 = function0;
            i19 = i12;
            if ((46811 & i19) == 9362) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                } else {
                    paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (i17 != 0) {
                    function1 = a.f28343p0;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                }
                if (str == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                    return;
                }
                stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics116 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion111111 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyC116 = androidx.databinding.f.c(companion111111, false, composerStartRestartGroup, 0, -1323940314);
                Density density116 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection116 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration116 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion111112 = ComposeUiNode.INSTANCE;
                constructor = companion111112.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf116 = LayoutKt.materializerOf(modifierSemantics116);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl116 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl116, layoutDirection116, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion111112, composerM2074constructorimpl116, measurePolicyC116, composerM2074constructorimpl116, density116));
                ai.a.j(0, function3MaterializerOf116, g0.b(companion111112, composerM2074constructorimpl116, viewConfiguration116, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance116 = BoxScopeInstance.INSTANCE;
                if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-1050024417);
                    jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1050024357);
                    jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                MutableInteractionSource mutableInteractionSource1110 = mutableInteractionSource3;
                Function0<Unit> function118 = function1;
                PaddingValues paddingValues119 = paddingValuesM291PaddingValuesYgX7TsA$default;
                composer2 = composerStartRestartGroup;
                androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion111111.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                if (y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource4 = mutableInteractionSource1110;
                function2 = function118;
                paddingValues3 = paddingValues119;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                } else {
                    paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (i17 != 0) {
                    function1 = a.f28343p0;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                }
                if (str == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                    return;
                }
                stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics117 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion111113 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyC117 = androidx.databinding.f.c(companion111113, false, composerStartRestartGroup, 0, -1323940314);
                Density density117 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection117 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration117 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion111114 = ComposeUiNode.INSTANCE;
                constructor = companion111114.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf117 = LayoutKt.materializerOf(modifierSemantics117);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl117 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl117, layoutDirection117, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion111114, composerM2074constructorimpl117, measurePolicyC117, composerM2074constructorimpl117, density117));
                ai.a.j(0, function3MaterializerOf117, g0.b(companion111114, composerM2074constructorimpl117, viewConfiguration117, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance117 = BoxScopeInstance.INSTANCE;
                if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-1050024417);
                    jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1050024357);
                    jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                MutableInteractionSource mutableInteractionSource1111 = mutableInteractionSource3;
                Function0<Unit> function119 = function1;
                PaddingValues paddingValues1110 = paddingValuesM291PaddingValuesYgX7TsA$default;
                composer2 = composerStartRestartGroup;
                androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion111113.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                if (y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource4 = mutableInteractionSource1111;
                function2 = function119;
                paddingValues3 = paddingValues1110;
            }
            scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup2.updateScope(new e(str, modifier4, paddingValues3, mutableInteractionSource4, function2, i10, i11));
        }
        i12 |= 3072;
        mutableInteractionSource2 = mutableInteractionSource;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((57344 & i10) == 0) {
                function1 = function0;
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            i19 = i12;
            if ((46811 & i19) == 9362) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                } else {
                    paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (i17 != 0) {
                    function1 = a.f28343p0;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                }
                if (str == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                    return;
                }
                stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics118 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion111115 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyC118 = androidx.databinding.f.c(companion111115, false, composerStartRestartGroup, 0, -1323940314);
                Density density118 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection118 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration118 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion111116 = ComposeUiNode.INSTANCE;
                constructor = companion111116.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf118 = LayoutKt.materializerOf(modifierSemantics118);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl118 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl118, layoutDirection118, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion111116, composerM2074constructorimpl118, measurePolicyC118, composerM2074constructorimpl118, density118));
                ai.a.j(0, function3MaterializerOf118, g0.b(companion111116, composerM2074constructorimpl118, viewConfiguration118, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance118 = BoxScopeInstance.INSTANCE;
                if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-1050024417);
                    jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1050024357);
                    jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                MutableInteractionSource mutableInteractionSource1112 = mutableInteractionSource3;
                Function0<Unit> function1110 = function1;
                PaddingValues paddingValues1111 = paddingValuesM291PaddingValuesYgX7TsA$default;
                composer2 = composerStartRestartGroup;
                androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion111115.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                if (y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource4 = mutableInteractionSource1112;
                function2 = function1110;
                paddingValues3 = paddingValues1111;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                } else {
                    paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (i17 != 0) {
                    function1 = a.f28343p0;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
                }
                if (str == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                    return;
                }
                stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new c(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new c(function1);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics119 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion111117 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyC119 = androidx.databinding.f.c(companion111117, false, composerStartRestartGroup, 0, -1323940314);
                Density density119 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection119 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration119 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion111118 = ComposeUiNode.INSTANCE;
                constructor = companion111118.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf119 = LayoutKt.materializerOf(modifierSemantics119);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl119 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl119, layoutDirection119, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion111118, composerM2074constructorimpl119, measurePolicyC119, composerM2074constructorimpl119, density119));
                ai.a.j(0, function3MaterializerOf119, g0.b(companion111118, composerM2074constructorimpl119, viewConfiguration119, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance119 = BoxScopeInstance.INSTANCE;
                if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-1050024417);
                    jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1050024357);
                    jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                MutableInteractionSource mutableInteractionSource1113 = mutableInteractionSource3;
                Function0<Unit> function1111 = function1;
                PaddingValues paddingValues1112 = paddingValuesM291PaddingValuesYgX7TsA$default;
                composer2 = composerStartRestartGroup;
                androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion111117.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
                if (y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource4 = mutableInteractionSource1113;
                function2 = function1111;
                paddingValues3 = paddingValues1112;
            }
            scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup2.updateScope(new e(str, modifier4, paddingValues3, mutableInteractionSource4, function2, i10, i11));
        }
        i12 |= 24576;
        function1 = function0;
        i19 = i12;
        if ((46811 & i19) == 9362) {
            if (i20 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
            } else {
                paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
            }
            if (i15 != 0) {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
            } else {
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            if (i17 != 0) {
                function1 = a.f28343p0;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
            }
            if (str == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                return;
            }
            stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(function1);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new c(function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new c(function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierSemantics1110 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion111119 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyC1110 = androidx.databinding.f.c(companion111119, false, composerStartRestartGroup, 0, -1323940314);
            Density density1110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection1110 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration1110 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion1111110 = ComposeUiNode.INSTANCE;
            constructor = companion1111110.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1110 = LayoutKt.materializerOf(modifierSemantics1110);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl1110 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl1110, layoutDirection1110, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion1111110, composerM2074constructorimpl1110, measurePolicyC1110, composerM2074constructorimpl1110, density1110));
            ai.a.j(0, function3MaterializerOf1110, g0.b(companion1111110, composerM2074constructorimpl1110, viewConfiguration1110, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance1110 = BoxScopeInstance.INSTANCE;
            if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                composerStartRestartGroup.startReplaceableGroup(-1050024417);
                jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1050024357);
                jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                composerStartRestartGroup.endReplaceableGroup();
            }
            MutableInteractionSource mutableInteractionSource1114 = mutableInteractionSource3;
            Function0<Unit> function1112 = function1;
            PaddingValues paddingValues1113 = paddingValuesM291PaddingValuesYgX7TsA$default;
            composer2 = composerStartRestartGroup;
            androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion111119.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
            if (y2.d(composer2)) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            mutableInteractionSource4 = mutableInteractionSource1114;
            function2 = function1112;
            paddingValues3 = paddingValues1113;
        } else {
            if (i20 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                paddingValuesM291PaddingValuesYgX7TsA$default = PaddingKt.m291PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
            } else {
                paddingValuesM291PaddingValuesYgX7TsA$default = paddingValues2;
            }
            if (i15 != 0) {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue2;
            } else {
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            if (i17 != 0) {
                function1 = a.f28343p0;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(201264077, i19, -1, "com.bbva.component.ui.carousel.view.compose.Link (Text.kt:47)");
            }
            if (str == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(str, modifier3, paddingValuesM291PaddingValuesYgX7TsA$default, mutableInteractionSource3, function1, i10, i11));
                return;
            }
            stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i19 >> 9) & 14);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(function1);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new c(function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new c(function1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierSemantics1111 = SemanticsModifierKt.semantics(PaddingKt.padding(ClickableKt.m146clickableO2vRcR0$default(modifier3, mutableInteractionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null), paddingValuesM291PaddingValuesYgX7TsA$default), true, d.f28351p0);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion1111111 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyC1111 = androidx.databinding.f.c(companion1111111, false, composerStartRestartGroup, 0, -1323940314);
            Density density1111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection1111 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration1111 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion1111112 = ComposeUiNode.INSTANCE;
            constructor = companion1111112.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf1111 = LayoutKt.materializerOf(modifierSemantics1111);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl1111 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl1111, layoutDirection1111, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion1111112, composerM2074constructorimpl1111, measurePolicyC1111, composerM2074constructorimpl1111, density1111));
            ai.a.j(0, function3MaterializerOf1111, g0.b(companion1111112, composerM2074constructorimpl1111, viewConfiguration1111, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance1111 = BoxScopeInstance.INSTANCE;
            if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                composerStartRestartGroup.startReplaceableGroup(-1050024417);
                jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4880getPressed0d7_KjU();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1050024357);
                jM4879getDefault0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getLink().getMain().m4879getDefault0d7_KjU();
                composerStartRestartGroup.endReplaceableGroup();
            }
            MutableInteractionSource mutableInteractionSource1115 = mutableInteractionSource3;
            Function0<Unit> function1113 = function1;
            PaddingValues paddingValues1114 = paddingValuesM291PaddingValuesYgX7TsA$default;
            composer2 = composerStartRestartGroup;
            androidx.compose.material.TextKt.m879Text4IGK_g(str, SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion1111111.getCenterVertically(), false, 2, null), jM4879getDefault0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, Theme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLink(), composer2, (i19 & 14) | 48, 3072, 57336);
            if (y2.d(composer2)) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            mutableInteractionSource4 = mutableInteractionSource1115;
            function2 = function1113;
            paddingValues3 = paddingValues1114;
        }
        scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new e(str, modifier4, paddingValues3, mutableInteractionSource4, function2, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:46:0x0144  */
    /* JADX WARN: Code duplicated, block: B:51:0x0150  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Title(@NotNull String text, @Nullable Modifier modifier, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        Modifier modifier3;
        Function0<ComposeUiNode> constructor;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(111941051);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i13 = i12;
            if ((i13 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(111941051, i13, -1, "com.bbva.component.ui.carousel.view.compose.Title (Text.kt:26)");
                }
                Modifier modifierSemantics = SemanticsModifierKt.semantics(modifier3, true, f.f28358p0);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion, false, composerStartRestartGroup, 0, -1323940314);
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierSemantics);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, density));
                ai.a.j(0, function3MaterializerOf, g0.b(companion2, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion.getCenterVertically(), false, 2, null);
                Theme theme = Theme.INSTANCE;
                Modifier modifier4 = modifier3;
                composer2 = composerStartRestartGroup;
                androidx.compose.material.TextKt.m879Text4IGK_g(text, modifierWrapContentHeight$default, theme.getColors(composerStartRestartGroup, 6).m4874getText020d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, theme.getTypography(composerStartRestartGroup, 6).getDefault(), composer2, (i13 & 14) | 48, 3072, 57336);
                if (y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new g(text, modifier2, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        i13 = i12;
        if ((i13 & 91) == 18) {
            if (i14 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(111941051, i13, -1, "com.bbva.component.ui.carousel.view.compose.Title (Text.kt:26)");
            }
            Modifier modifierSemantics2 = SemanticsModifierKt.semantics(modifier3, true, f.f28358p0);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyC2 = androidx.databinding.f.c(companion3, false, composerStartRestartGroup, 0, -1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierSemantics2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion4, composerM2074constructorimpl2, measurePolicyC2, composerM2074constructorimpl2, density2));
            ai.a.j(0, function3MaterializerOf2, g0.b(companion4, composerM2074constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            Modifier modifierWrapContentHeight$default2 = SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion3.getCenterVertically(), false, 2, null);
            Theme theme2 = Theme.INSTANCE;
            Modifier modifier5 = modifier3;
            composer2 = composerStartRestartGroup;
            androidx.compose.material.TextKt.m879Text4IGK_g(text, modifierWrapContentHeight$default2, theme2.getColors(composerStartRestartGroup, 6).m4874getText020d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, theme2.getTypography(composerStartRestartGroup, 6).getDefault(), composer2, (i13 & 14) | 48, 3072, 57336);
            if (y2.d(composer2)) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier5;
        } else {
            if (i14 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(111941051, i13, -1, "com.bbva.component.ui.carousel.view.compose.Title (Text.kt:26)");
            }
            Modifier modifierSemantics3 = SemanticsModifierKt.semantics(modifier3, true, f.f28358p0);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion5 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyC3 = androidx.databinding.f.c(companion5, false, composerStartRestartGroup, 0, -1323940314);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            constructor = companion6.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierSemantics3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl3, layoutDirection3, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion6, composerM2074constructorimpl3, measurePolicyC3, composerM2074constructorimpl3, density3));
            ai.a.j(0, function3MaterializerOf3, g0.b(companion6, composerM2074constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            Modifier modifierWrapContentHeight$default3 = SizeKt.wrapContentHeight$default(SizeKt.m320defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dimension.TextBox.INSTANCE.m4862getHeightD9Ej5fM(), 1, null), companion5.getCenterVertically(), false, 2, null);
            Theme theme3 = Theme.INSTANCE;
            Modifier modifier6 = modifier3;
            composer2 = composerStartRestartGroup;
            androidx.compose.material.TextKt.m879Text4IGK_g(text, modifierWrapContentHeight$default3, theme3.getColors(composerStartRestartGroup, 6).m4874getText020d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, theme3.getTypography(composerStartRestartGroup, 6).getDefault(), composer2, (i13 & 14) | 48, 3072, 57336);
            if (y2.d(composer2)) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier6;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new g(text, modifier2, i10, i11));
    }
}
