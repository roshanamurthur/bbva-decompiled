package androidx.compose.material;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
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

/* JADX INFO: compiled from: IconButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aN\u0010\u000b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\\\u0010\u0010\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0011\u0010\n\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/runtime/Composable;", "content", "IconButton", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "checked", "Lkotlin/Function1;", "onCheckedChange", "IconToggleButton", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material/IconButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,130:1\n25#2:131\n456#2,8:154\n464#2,3:168\n467#2,3:173\n25#2:178\n456#2,8:201\n464#2,3:215\n467#2,3:220\n1097#3,6:132\n1097#3,6:179\n67#4,5:138\n72#4:171\n76#4:177\n67#4,5:185\n72#4:218\n76#4:224\n78#5,11:143\n91#5:176\n78#5,11:190\n91#5:223\n4144#6,6:162\n4144#6,6:209\n76#7:172\n76#7:219\n154#8:225\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material/IconButtonKt\n*L\n63#1:131\n66#1:154,8\n66#1:168,3\n66#1:173,3\n107#1:178\n110#1:201,8\n110#1:215,3\n110#1:220,3\n63#1:132,6\n107#1:179,6\n66#1:138,5\n66#1:171\n66#1:177\n110#1:185,5\n110#1:218\n110#1:224\n66#1:143,11\n66#1:176\n110#1:190,11\n110#1:223\n66#1:162,6\n110#1:209,6\n78#1:172\n123#1:219\n129#1:225\n*E\n"})
public final class IconButtonKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f7210a = Dp.m4389constructorimpl(24);

    /* JADX INFO: compiled from: IconButton.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f7211p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7212q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f7213r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f7214s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7215t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f7216u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function0<Unit> function0, Modifier modifier, boolean z10, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f7211p0 = function0;
            this.f7212q0 = modifier;
            this.f7213r0 = z10;
            this.f7214s0 = mutableInteractionSource;
            this.f7215t0 = function2;
            this.f7216u0 = i10;
            this.v0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            IconButtonKt.IconButton(this.f7211p0, this.f7212q0, this.f7213r0, this.f7214s0, this.f7215t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7216u0 | 1), this.v0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: IconButton.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f7217p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f7218q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7219r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f7220s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f7221t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7222u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f7223w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z10, Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z11, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f7217p0 = z10;
            this.f7218q0 = function1;
            this.f7219r0 = modifier;
            this.f7220s0 = z11;
            this.f7221t0 = mutableInteractionSource;
            this.f7222u0 = function2;
            this.v0 = i10;
            this.f7223w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            IconButtonKt.IconToggleButton(this.f7217p0, this.f7218q0, this.f7219r0, this.f7220s0, this.f7221t0, this.f7222u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f7223w0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:81:0x014e  */
    /* JADX WARN: Code duplicated, block: B:84:0x015a  */
    /* JADX WARN: Code duplicated, block: B:85:0x015e  */
    /* JADX WARN: Code duplicated, block: B:88:0x016f  */
    /* JADX WARN: Code duplicated, block: B:90:0x017d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0192  */
    /* JADX WARN: Code duplicated, block: B:95:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e2  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void IconButton(@NotNull Function0<Unit> onClick, @Nullable Modifier modifier, boolean z10, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        boolean z11;
        int i14;
        int i15;
        MutableInteractionSource mutableInteractionSource2;
        int i16;
        int i17;
        int i18;
        Modifier modifier3;
        boolean z12;
        MutableInteractionSource mutableInteractionSource3;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM2074constructorimpl;
        Function2 function2C;
        float disabled;
        Modifier modifier4;
        boolean z13;
        MutableInteractionSource mutableInteractionSource4;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-111063634);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
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
                    if ((i11 & 16) != 0) {
                        i12 |= 24576;
                    } else if ((57344 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    i18 = i12;
                    if ((46811 & i18) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-111063634, i18, -1, "androidx.compose.material.IconButton (IconButton.kt:58)");
                        }
                        Modifier modifierM146clickableO2vRcR0$default = ClickableKt.m146clickableO2vRcR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z12, null, Role.m3825boximpl(Role.INSTANCE.m3831getButtono7Vup1c()), onClick, 8, null);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM146clickableO2vRcR0$default);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
                        if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (z12) {
                            composerStartRestartGroup.startReplaceableGroup(753555784);
                            disabled = ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(753555810);
                            disabled = ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, 6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composerStartRestartGroup, ((i18 >> 9) & 112) | 8);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        z13 = z12;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        z13 = z11;
                        mutableInteractionSource4 = mutableInteractionSource2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(onClick, modifier4, z13, mutableInteractionSource4, content, i10, i11));
                }
                i12 |= 3072;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((57344 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                i18 = i12;
                if ((46811 & i18) == 9362) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-111063634, i18, -1, "androidx.compose.material.IconButton (IconButton.kt:58)");
                    }
                    Modifier modifierM146clickableO2vRcR0$default2 = ClickableKt.m146clickableO2vRcR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z12, null, Role.m3825boximpl(Role.INSTANCE.m3831getButtono7Vup1c()), onClick, 8, null);
                    Alignment center2 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM146clickableO2vRcR0$default2);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy2, composerM2074constructorimpl, currentCompositionLocalMap2);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf2, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    if (z12) {
                        composerStartRestartGroup.startReplaceableGroup(753555784);
                        disabled = ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(753555810);
                        disabled = ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, 6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composerStartRestartGroup, ((i18 >> 9) & 112) | 8);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    z13 = z12;
                    mutableInteractionSource4 = mutableInteractionSource3;
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-111063634, i18, -1, "androidx.compose.material.IconButton (IconButton.kt:58)");
                    }
                    Modifier modifierM146clickableO2vRcR0$default3 = ClickableKt.m146clickableO2vRcR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z12, null, Role.m3825boximpl(Role.INSTANCE.m3831getButtono7Vup1c()), onClick, 8, null);
                    Alignment center3 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center3, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM146clickableO2vRcR0$default3);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy3, composerM2074constructorimpl, currentCompositionLocalMap3);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf3, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    if (z12) {
                        composerStartRestartGroup.startReplaceableGroup(753555784);
                        disabled = ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(753555810);
                        disabled = ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, 6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composerStartRestartGroup, ((i18 >> 9) & 112) | 8);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    z13 = z12;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(onClick, modifier4, z13, mutableInteractionSource4, content, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            z11 = z10;
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
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((57344 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                i18 = i12;
                if ((46811 & i18) == 9362) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-111063634, i18, -1, "androidx.compose.material.IconButton (IconButton.kt:58)");
                    }
                    Modifier modifierM146clickableO2vRcR0$default4 = ClickableKt.m146clickableO2vRcR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z12, null, Role.m3825boximpl(Role.INSTANCE.m3831getButtono7Vup1c()), onClick, 8, null);
                    Alignment center4 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center4, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    constructor = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM146clickableO2vRcR0$default4);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion4, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy4, composerM2074constructorimpl, currentCompositionLocalMap4);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf4, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    if (z12) {
                        composerStartRestartGroup.startReplaceableGroup(753555784);
                        disabled = ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(753555810);
                        disabled = ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, 6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composerStartRestartGroup, ((i18 >> 9) & 112) | 8);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    z13 = z12;
                    mutableInteractionSource4 = mutableInteractionSource3;
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-111063634, i18, -1, "androidx.compose.material.IconButton (IconButton.kt:58)");
                    }
                    Modifier modifierM146clickableO2vRcR0$default5 = ClickableKt.m146clickableO2vRcR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z12, null, Role.m3825boximpl(Role.INSTANCE.m3831getButtono7Vup1c()), onClick, 8, null);
                    Alignment center5 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(center5, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    constructor = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM146clickableO2vRcR0$default5);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion5, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy5, composerM2074constructorimpl, currentCompositionLocalMap5);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf5, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                    if (z12) {
                        composerStartRestartGroup.startReplaceableGroup(753555784);
                        disabled = ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(753555810);
                        disabled = ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, 6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composerStartRestartGroup, ((i18 >> 9) & 112) | 8);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    z13 = z12;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(onClick, modifier4, z13, mutableInteractionSource4, content, i10, i11));
            }
            i12 |= 3072;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            i18 = i12;
            if ((46811 & i18) == 9362) {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-111063634, i18, -1, "androidx.compose.material.IconButton (IconButton.kt:58)");
                }
                Modifier modifierM146clickableO2vRcR0$default6 = ClickableKt.m146clickableO2vRcR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z12, null, Role.m3825boximpl(Role.INSTANCE.m3831getButtono7Vup1c()), onClick, 8, null);
                Alignment center6 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(center6, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                constructor = companion6.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM146clickableO2vRcR0$default6);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion6, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy6, composerM2074constructorimpl, currentCompositionLocalMap6);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf6, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                if (z12) {
                    composerStartRestartGroup.startReplaceableGroup(753555784);
                    disabled = ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(753555810);
                    disabled = ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composerStartRestartGroup, ((i18 >> 9) & 112) | 8);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z13 = z12;
                mutableInteractionSource4 = mutableInteractionSource3;
            } else {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-111063634, i18, -1, "androidx.compose.material.IconButton (IconButton.kt:58)");
                }
                Modifier modifierM146clickableO2vRcR0$default7 = ClickableKt.m146clickableO2vRcR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z12, null, Role.m3825boximpl(Role.INSTANCE.m3831getButtono7Vup1c()), onClick, 8, null);
                Alignment center7 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(center7, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                constructor = companion7.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM146clickableO2vRcR0$default7);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion7, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy7, composerM2074constructorimpl, currentCompositionLocalMap7);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf7, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                if (z12) {
                    composerStartRestartGroup.startReplaceableGroup(753555784);
                    disabled = ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(753555810);
                    disabled = ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composerStartRestartGroup, ((i18 >> 9) & 112) | 8);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z13 = z12;
                mutableInteractionSource4 = mutableInteractionSource3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(onClick, modifier4, z13, mutableInteractionSource4, content, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
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
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((57344 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                i18 = i12;
                if ((46811 & i18) == 9362) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-111063634, i18, -1, "androidx.compose.material.IconButton (IconButton.kt:58)");
                    }
                    Modifier modifierM146clickableO2vRcR0$default8 = ClickableKt.m146clickableO2vRcR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z12, null, Role.m3825boximpl(Role.INSTANCE.m3831getButtono7Vup1c()), onClick, 8, null);
                    Alignment center8 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy8 = BoxKt.rememberBoxMeasurePolicy(center8, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    constructor = companion8.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierM146clickableO2vRcR0$default8);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion8, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy8, composerM2074constructorimpl, currentCompositionLocalMap8);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf8, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                    if (z12) {
                        composerStartRestartGroup.startReplaceableGroup(753555784);
                        disabled = ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(753555810);
                        disabled = ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, 6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composerStartRestartGroup, ((i18 >> 9) & 112) | 8);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    z13 = z12;
                    mutableInteractionSource4 = mutableInteractionSource3;
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-111063634, i18, -1, "androidx.compose.material.IconButton (IconButton.kt:58)");
                    }
                    Modifier modifierM146clickableO2vRcR0$default9 = ClickableKt.m146clickableO2vRcR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z12, null, Role.m3825boximpl(Role.INSTANCE.m3831getButtono7Vup1c()), onClick, 8, null);
                    Alignment center9 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy9 = BoxKt.rememberBoxMeasurePolicy(center9, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                    constructor = companion9.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierM146clickableO2vRcR0$default9);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion9, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy9, composerM2074constructorimpl, currentCompositionLocalMap9);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf9, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                    if (z12) {
                        composerStartRestartGroup.startReplaceableGroup(753555784);
                        disabled = ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(753555810);
                        disabled = ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, 6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composerStartRestartGroup, ((i18 >> 9) & 112) | 8);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    z13 = z12;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(onClick, modifier4, z13, mutableInteractionSource4, content, i10, i11));
            }
            i12 |= 3072;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            i18 = i12;
            if ((46811 & i18) == 9362) {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-111063634, i18, -1, "androidx.compose.material.IconButton (IconButton.kt:58)");
                }
                Modifier modifierM146clickableO2vRcR0$default10 = ClickableKt.m146clickableO2vRcR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z12, null, Role.m3825boximpl(Role.INSTANCE.m3831getButtono7Vup1c()), onClick, 8, null);
                Alignment center10 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy10 = BoxKt.rememberBoxMeasurePolicy(center10, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                constructor = companion10.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierM146clickableO2vRcR0$default10);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion10, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy10, composerM2074constructorimpl, currentCompositionLocalMap10);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf10, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                if (z12) {
                    composerStartRestartGroup.startReplaceableGroup(753555784);
                    disabled = ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(753555810);
                    disabled = ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composerStartRestartGroup, ((i18 >> 9) & 112) | 8);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z13 = z12;
                mutableInteractionSource4 = mutableInteractionSource3;
            } else {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-111063634, i18, -1, "androidx.compose.material.IconButton (IconButton.kt:58)");
                }
                Modifier modifierM146clickableO2vRcR0$default11 = ClickableKt.m146clickableO2vRcR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z12, null, Role.m3825boximpl(Role.INSTANCE.m3831getButtono7Vup1c()), onClick, 8, null);
                Alignment center11 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy11 = BoxKt.rememberBoxMeasurePolicy(center11, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                constructor = companion11.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierM146clickableO2vRcR0$default11);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion11, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy11, composerM2074constructorimpl, currentCompositionLocalMap11);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf11, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                if (z12) {
                    composerStartRestartGroup.startReplaceableGroup(753555784);
                    disabled = ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(753555810);
                    disabled = ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composerStartRestartGroup, ((i18 >> 9) & 112) | 8);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z13 = z12;
                mutableInteractionSource4 = mutableInteractionSource3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(onClick, modifier4, z13, mutableInteractionSource4, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        z11 = z10;
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
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            i18 = i12;
            if ((46811 & i18) == 9362) {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-111063634, i18, -1, "androidx.compose.material.IconButton (IconButton.kt:58)");
                }
                Modifier modifierM146clickableO2vRcR0$default12 = ClickableKt.m146clickableO2vRcR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z12, null, Role.m3825boximpl(Role.INSTANCE.m3831getButtono7Vup1c()), onClick, 8, null);
                Alignment center12 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy12 = BoxKt.rememberBoxMeasurePolicy(center12, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                constructor = companion12.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(modifierM146clickableO2vRcR0$default12);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion12, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy12, composerM2074constructorimpl, currentCompositionLocalMap12);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf12, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                if (z12) {
                    composerStartRestartGroup.startReplaceableGroup(753555784);
                    disabled = ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(753555810);
                    disabled = ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composerStartRestartGroup, ((i18 >> 9) & 112) | 8);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z13 = z12;
                mutableInteractionSource4 = mutableInteractionSource3;
            } else {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-111063634, i18, -1, "androidx.compose.material.IconButton (IconButton.kt:58)");
                }
                Modifier modifierM146clickableO2vRcR0$default13 = ClickableKt.m146clickableO2vRcR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z12, null, Role.m3825boximpl(Role.INSTANCE.m3831getButtono7Vup1c()), onClick, 8, null);
                Alignment center13 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy13 = BoxKt.rememberBoxMeasurePolicy(center13, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                constructor = companion13.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierM146clickableO2vRcR0$default13);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion13, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy13, composerM2074constructorimpl, currentCompositionLocalMap13);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf13, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                if (z12) {
                    composerStartRestartGroup.startReplaceableGroup(753555784);
                    disabled = ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(753555810);
                    disabled = ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composerStartRestartGroup, ((i18 >> 9) & 112) | 8);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z13 = z12;
                mutableInteractionSource4 = mutableInteractionSource3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(onClick, modifier4, z13, mutableInteractionSource4, content, i10, i11));
        }
        i12 |= 3072;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i12 |= i17;
        }
        i18 = i12;
        if ((46811 & i18) == 9362) {
            if (i19 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (i15 != 0) {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
            } else {
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-111063634, i18, -1, "androidx.compose.material.IconButton (IconButton.kt:58)");
            }
            Modifier modifierM146clickableO2vRcR0$default14 = ClickableKt.m146clickableO2vRcR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z12, null, Role.m3825boximpl(Role.INSTANCE.m3831getButtono7Vup1c()), onClick, 8, null);
            Alignment center14 = Alignment.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy14 = BoxKt.rememberBoxMeasurePolicy(center14, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
            constructor = companion14.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierM146clickableO2vRcR0$default14);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            function2C = com.google.android.gms.measurement.internal.a.c(companion14, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy14, composerM2074constructorimpl, currentCompositionLocalMap14);
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf14, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.INSTANCE;
            if (z12) {
                composerStartRestartGroup.startReplaceableGroup(753555784);
                disabled = ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
            } else {
                composerStartRestartGroup.startReplaceableGroup(753555810);
                disabled = ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composerStartRestartGroup, ((i18 >> 9) & 112) | 8);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            z13 = z12;
            mutableInteractionSource4 = mutableInteractionSource3;
        } else {
            if (i19 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (i15 != 0) {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
            } else {
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-111063634, i18, -1, "androidx.compose.material.IconButton (IconButton.kt:58)");
            }
            Modifier modifierM146clickableO2vRcR0$default15 = ClickableKt.m146clickableO2vRcR0$default(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z12, null, Role.m3825boximpl(Role.INSTANCE.m3831getButtono7Vup1c()), onClick, 8, null);
            Alignment center15 = Alignment.INSTANCE.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy15 = BoxKt.rememberBoxMeasurePolicy(center15, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
            constructor = companion15.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierM146clickableO2vRcR0$default15);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            function2C = com.google.android.gms.measurement.internal.a.c(companion15, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy15, composerM2074constructorimpl, currentCompositionLocalMap15);
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf15, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.INSTANCE;
            if (z12) {
                composerStartRestartGroup.startReplaceableGroup(753555784);
                disabled = ((Number) composerStartRestartGroup.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
            } else {
                composerStartRestartGroup.startReplaceableGroup(753555810);
                disabled = ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composerStartRestartGroup, ((i18 >> 9) & 112) | 8);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            z13 = z12;
            mutableInteractionSource4 = mutableInteractionSource3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(onClick, modifier4, z13, mutableInteractionSource4, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:104:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:107:0x0204  */
    /* JADX WARN: Code duplicated, block: B:112:0x0214  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:84:0x0103  */
    /* JADX WARN: Code duplicated, block: B:87:0x010b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0170  */
    /* JADX WARN: Code duplicated, block: B:93:0x017c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0180  */
    /* JADX WARN: Code duplicated, block: B:97:0x0191  */
    /* JADX WARN: Code duplicated, block: B:99:0x019f  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void IconToggleButton(boolean z10, @NotNull Function1<? super Boolean, Unit> onCheckedChange, @Nullable Modifier modifier, boolean z11, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        boolean z12;
        int i14;
        int i15;
        MutableInteractionSource mutableInteractionSource2;
        int i16;
        int i17;
        Modifier modifier3;
        boolean z13;
        MutableInteractionSource mutableInteractionSource3;
        Composer composer2;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM2074constructorimpl;
        Function2 function2C;
        float disabled;
        boolean z14;
        MutableInteractionSource mutableInteractionSource4;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onCheckedChange, "onCheckedChange");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-54657793);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onCheckedChange) ? 32 : 16;
        }
        int i18 = i11 & 4;
        if (i18 == 0) {
            if ((i10 & 896) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    z12 = z11;
                    if (composerStartRestartGroup.changed(z12)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((57344 & i10) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 32) != 0) {
                        if ((458752 & i10) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i17 = 131072;
                            } else {
                                i17 = 65536;
                            }
                        }
                        if ((374491 & i12) == 74898 || !composerStartRestartGroup.getSkipping()) {
                            if (i18 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            } else {
                                z13 = z12;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                            }
                            int i19 = i12;
                            composer2 = composerStartRestartGroup;
                            Modifier modifierM462toggleableO2vRcR0 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                            Alignment center = Alignment.INSTANCE.getCenter();
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                            composer2.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            constructor = companion.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR0);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                            function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
                            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                            }
                            ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            if (z13) {
                                composer2.startReplaceableGroup(-1866758084);
                                disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                            } else {
                                composer2.startReplaceableGroup(-1866758058);
                                disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                            }
                            composer2.endReplaceableGroup();
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i19 >> 12) & 112) | 8);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            z14 = z13;
                            mutableInteractionSource4 = mutableInteractionSource3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            z14 = z12;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            composer2 = composerStartRestartGroup;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, onCheckedChange, modifier2, z14, mutableInteractionSource4, content, i10, i11));
                    }
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i12 |= i17;
                    if ((374491 & i12) == 74898) {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                        }
                        int i110 = i12;
                        composer2 = composerStartRestartGroup;
                        Modifier modifierM462toggleableO2vRcR1 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                        Alignment center2 = Alignment.INSTANCE.getCenter();
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR1);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy2, composerM2074constructorimpl, currentCompositionLocalMap2);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf2, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        if (z13) {
                            composer2.startReplaceableGroup(-1866758084);
                            disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                        } else {
                            composer2.startReplaceableGroup(-1866758058);
                            disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i110 >> 12) & 112) | 8);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    } else {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                        }
                        int i111 = i12;
                        composer2 = composerStartRestartGroup;
                        Modifier modifierM462toggleableO2vRcR2 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                        Alignment center3 = Alignment.INSTANCE.getCenter();
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center3, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        constructor = companion3.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR2);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy3, composerM2074constructorimpl, currentCompositionLocalMap3);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf3, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                        if (z13) {
                            composer2.startReplaceableGroup(-1866758084);
                            disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                        } else {
                            composer2.startReplaceableGroup(-1866758058);
                            disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i111 >> 12) & 112) | 8);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, onCheckedChange, modifier2, z14, mutableInteractionSource4, content, i10, i11));
                }
                i12 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i11 & 32) != 0) {
                    if ((458752 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                        }
                        int i112 = i12;
                        composer2 = composerStartRestartGroup;
                        Modifier modifierM462toggleableO2vRcR3 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                        Alignment center4 = Alignment.INSTANCE.getCenter();
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center4, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        constructor = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR3);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion4, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy4, composerM2074constructorimpl, currentCompositionLocalMap4);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf4, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                        if (z13) {
                            composer2.startReplaceableGroup(-1866758084);
                            disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                        } else {
                            composer2.startReplaceableGroup(-1866758058);
                            disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i112 >> 12) & 112) | 8);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    } else {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                        }
                        int i113 = i12;
                        composer2 = composerStartRestartGroup;
                        Modifier modifierM462toggleableO2vRcR4 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                        Alignment center5 = Alignment.INSTANCE.getCenter();
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(center5, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        constructor = companion5.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR4);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion5, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy5, composerM2074constructorimpl, currentCompositionLocalMap5);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf5, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                        if (z13) {
                            composer2.startReplaceableGroup(-1866758084);
                            disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                        } else {
                            composer2.startReplaceableGroup(-1866758058);
                            disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i113 >> 12) & 112) | 8);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, onCheckedChange, modifier2, z14, mutableInteractionSource4, content, i10, i11));
                }
                i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i17;
                if ((374491 & i12) == 74898) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                    }
                    int i114 = i12;
                    composer2 = composerStartRestartGroup;
                    Modifier modifierM462toggleableO2vRcR5 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                    Alignment center6 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(center6, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    constructor = companion6.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR5);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion6, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy6, composerM2074constructorimpl, currentCompositionLocalMap6);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf6, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                    if (z13) {
                        composer2.startReplaceableGroup(-1866758084);
                        disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                    } else {
                        composer2.startReplaceableGroup(-1866758058);
                        disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                    }
                    composer2.endReplaceableGroup();
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i114 >> 12) & 112) | 8);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    z14 = z13;
                    mutableInteractionSource4 = mutableInteractionSource3;
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                    }
                    int i115 = i12;
                    composer2 = composerStartRestartGroup;
                    Modifier modifierM462toggleableO2vRcR6 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                    Alignment center7 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(center7, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    constructor = companion7.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR6);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion7, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy7, composerM2074constructorimpl, currentCompositionLocalMap7);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf7, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                    if (z13) {
                        composer2.startReplaceableGroup(-1866758084);
                        disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                    } else {
                        composer2.startReplaceableGroup(-1866758058);
                        disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                    }
                    composer2.endReplaceableGroup();
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i115 >> 12) & 112) | 8);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    z14 = z13;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, onCheckedChange, modifier2, z14, mutableInteractionSource4, content, i10, i11));
            }
            i12 |= 3072;
            z12 = z11;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((57344 & i10) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i11 & 32) != 0) {
                    if ((458752 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                        }
                        int i116 = i12;
                        composer2 = composerStartRestartGroup;
                        Modifier modifierM462toggleableO2vRcR7 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                        Alignment center8 = Alignment.INSTANCE.getCenter();
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy8 = BoxKt.rememberBoxMeasurePolicy(center8, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                        constructor = companion8.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR7);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion8, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy8, composerM2074constructorimpl, currentCompositionLocalMap8);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf8, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                        if (z13) {
                            composer2.startReplaceableGroup(-1866758084);
                            disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                        } else {
                            composer2.startReplaceableGroup(-1866758058);
                            disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i116 >> 12) & 112) | 8);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    } else {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                        }
                        int i117 = i12;
                        composer2 = composerStartRestartGroup;
                        Modifier modifierM462toggleableO2vRcR8 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                        Alignment center9 = Alignment.INSTANCE.getCenter();
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy9 = BoxKt.rememberBoxMeasurePolicy(center9, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                        constructor = companion9.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR8);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion9, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy9, composerM2074constructorimpl, currentCompositionLocalMap9);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf9, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                        if (z13) {
                            composer2.startReplaceableGroup(-1866758084);
                            disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                        } else {
                            composer2.startReplaceableGroup(-1866758058);
                            disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i117 >> 12) & 112) | 8);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, onCheckedChange, modifier2, z14, mutableInteractionSource4, content, i10, i11));
                }
                i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i17;
                if ((374491 & i12) == 74898) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                    }
                    int i118 = i12;
                    composer2 = composerStartRestartGroup;
                    Modifier modifierM462toggleableO2vRcR9 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                    Alignment center10 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy10 = BoxKt.rememberBoxMeasurePolicy(center10, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap10 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    constructor = companion10.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR9);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion10, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy10, composerM2074constructorimpl, currentCompositionLocalMap10);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf10, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                    if (z13) {
                        composer2.startReplaceableGroup(-1866758084);
                        disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                    } else {
                        composer2.startReplaceableGroup(-1866758058);
                        disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                    }
                    composer2.endReplaceableGroup();
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i118 >> 12) & 112) | 8);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    z14 = z13;
                    mutableInteractionSource4 = mutableInteractionSource3;
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                    }
                    int i119 = i12;
                    composer2 = composerStartRestartGroup;
                    Modifier modifierM462toggleableO2vRcR10 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                    Alignment center11 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy11 = BoxKt.rememberBoxMeasurePolicy(center11, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap11 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    constructor = companion11.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR10);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion11, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy11, composerM2074constructorimpl, currentCompositionLocalMap11);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf11, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                    if (z13) {
                        composer2.startReplaceableGroup(-1866758084);
                        disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                    } else {
                        composer2.startReplaceableGroup(-1866758058);
                        disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                    }
                    composer2.endReplaceableGroup();
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i119 >> 12) & 112) | 8);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    z14 = z13;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, onCheckedChange, modifier2, z14, mutableInteractionSource4, content, i10, i11));
            }
            i12 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                    }
                    int i1110 = i12;
                    composer2 = composerStartRestartGroup;
                    Modifier modifierM462toggleableO2vRcR11 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                    Alignment center12 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy12 = BoxKt.rememberBoxMeasurePolicy(center12, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap12 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                    constructor = companion12.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR11);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion12, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy12, composerM2074constructorimpl, currentCompositionLocalMap12);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf12, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                    if (z13) {
                        composer2.startReplaceableGroup(-1866758084);
                        disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                    } else {
                        composer2.startReplaceableGroup(-1866758058);
                        disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                    }
                    composer2.endReplaceableGroup();
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i1110 >> 12) & 112) | 8);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    z14 = z13;
                    mutableInteractionSource4 = mutableInteractionSource3;
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                    }
                    int i1111 = i12;
                    composer2 = composerStartRestartGroup;
                    Modifier modifierM462toggleableO2vRcR12 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                    Alignment center13 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy13 = BoxKt.rememberBoxMeasurePolicy(center13, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap13 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                    constructor = companion13.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR12);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion13, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy13, composerM2074constructorimpl, currentCompositionLocalMap13);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf13, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                    if (z13) {
                        composer2.startReplaceableGroup(-1866758084);
                        disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                    } else {
                        composer2.startReplaceableGroup(-1866758058);
                        disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                    }
                    composer2.endReplaceableGroup();
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i1111 >> 12) & 112) | 8);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    z14 = z13;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, onCheckedChange, modifier2, z14, mutableInteractionSource4, content, i10, i11));
            }
            i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i17;
            if ((374491 & i12) == 74898) {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                }
                int i1112 = i12;
                composer2 = composerStartRestartGroup;
                Modifier modifierM462toggleableO2vRcR13 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                Alignment center14 = Alignment.INSTANCE.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy14 = BoxKt.rememberBoxMeasurePolicy(center14, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap14 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                constructor = companion14.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR13);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                function2C = com.google.android.gms.measurement.internal.a.c(companion14, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy14, composerM2074constructorimpl, currentCompositionLocalMap14);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf14, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.INSTANCE;
                if (z13) {
                    composer2.startReplaceableGroup(-1866758084);
                    disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                } else {
                    composer2.startReplaceableGroup(-1866758058);
                    disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                }
                composer2.endReplaceableGroup();
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i1112 >> 12) & 112) | 8);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                z14 = z13;
                mutableInteractionSource4 = mutableInteractionSource3;
            } else {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                }
                int i1113 = i12;
                composer2 = composerStartRestartGroup;
                Modifier modifierM462toggleableO2vRcR14 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                Alignment center15 = Alignment.INSTANCE.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy15 = BoxKt.rememberBoxMeasurePolicy(center15, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap15 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                constructor = companion15.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR14);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                function2C = com.google.android.gms.measurement.internal.a.c(companion15, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy15, composerM2074constructorimpl, currentCompositionLocalMap15);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf15, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.INSTANCE;
                if (z13) {
                    composer2.startReplaceableGroup(-1866758084);
                    disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                } else {
                    composer2.startReplaceableGroup(-1866758058);
                    disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                }
                composer2.endReplaceableGroup();
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i1113 >> 12) & 112) | 8);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                z14 = z13;
                mutableInteractionSource4 = mutableInteractionSource3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, onCheckedChange, modifier2, z14, mutableInteractionSource4, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                z12 = z11;
                if (composerStartRestartGroup.changed(z12)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((57344 & i10) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i11 & 32) != 0) {
                    if ((458752 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                        }
                        int i1114 = i12;
                        composer2 = composerStartRestartGroup;
                        Modifier modifierM462toggleableO2vRcR15 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                        Alignment center16 = Alignment.INSTANCE.getCenter();
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy16 = BoxKt.rememberBoxMeasurePolicy(center16, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap16 = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                        constructor = companion16.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf16 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR15);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion16, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy16, composerM2074constructorimpl, currentCompositionLocalMap16);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf16, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance16 = BoxScopeInstance.INSTANCE;
                        if (z13) {
                            composer2.startReplaceableGroup(-1866758084);
                            disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                        } else {
                            composer2.startReplaceableGroup(-1866758058);
                            disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i1114 >> 12) & 112) | 8);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    } else {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        } else {
                            z13 = z12;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                        }
                        int i1115 = i12;
                        composer2 = composerStartRestartGroup;
                        Modifier modifierM462toggleableO2vRcR16 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                        Alignment center17 = Alignment.INSTANCE.getCenter();
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy17 = BoxKt.rememberBoxMeasurePolicy(center17, false, composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap17 = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                        constructor = companion17.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf17 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR16);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion17, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy17, composerM2074constructorimpl, currentCompositionLocalMap17);
                        if (composerM2074constructorimpl.getInserting()) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        } else {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf17, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                        BoxScopeInstance boxScopeInstance17 = BoxScopeInstance.INSTANCE;
                        if (z13) {
                            composer2.startReplaceableGroup(-1866758084);
                            disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                        } else {
                            composer2.startReplaceableGroup(-1866758058);
                            disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                        }
                        composer2.endReplaceableGroup();
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i1115 >> 12) & 112) | 8);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        z14 = z13;
                        mutableInteractionSource4 = mutableInteractionSource3;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, onCheckedChange, modifier2, z14, mutableInteractionSource4, content, i10, i11));
                }
                i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i17;
                if ((374491 & i12) == 74898) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                    }
                    int i1116 = i12;
                    composer2 = composerStartRestartGroup;
                    Modifier modifierM462toggleableO2vRcR17 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                    Alignment center18 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy18 = BoxKt.rememberBoxMeasurePolicy(center18, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap18 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                    constructor = companion18.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf18 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR17);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion18, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy18, composerM2074constructorimpl, currentCompositionLocalMap18);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf18, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance18 = BoxScopeInstance.INSTANCE;
                    if (z13) {
                        composer2.startReplaceableGroup(-1866758084);
                        disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                    } else {
                        composer2.startReplaceableGroup(-1866758058);
                        disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                    }
                    composer2.endReplaceableGroup();
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i1116 >> 12) & 112) | 8);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    z14 = z13;
                    mutableInteractionSource4 = mutableInteractionSource3;
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                    }
                    int i1117 = i12;
                    composer2 = composerStartRestartGroup;
                    Modifier modifierM462toggleableO2vRcR18 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                    Alignment center19 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy19 = BoxKt.rememberBoxMeasurePolicy(center19, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap19 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion19 = ComposeUiNode.INSTANCE;
                    constructor = companion19.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf19 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR18);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion19, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy19, composerM2074constructorimpl, currentCompositionLocalMap19);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf19, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance19 = BoxScopeInstance.INSTANCE;
                    if (z13) {
                        composer2.startReplaceableGroup(-1866758084);
                        disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                    } else {
                        composer2.startReplaceableGroup(-1866758058);
                        disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                    }
                    composer2.endReplaceableGroup();
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i1117 >> 12) & 112) | 8);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    z14 = z13;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, onCheckedChange, modifier2, z14, mutableInteractionSource4, content, i10, i11));
            }
            i12 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                    }
                    int i1118 = i12;
                    composer2 = composerStartRestartGroup;
                    Modifier modifierM462toggleableO2vRcR19 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                    Alignment center110 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy110 = BoxKt.rememberBoxMeasurePolicy(center110, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap110 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion110 = ComposeUiNode.INSTANCE;
                    constructor = companion110.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf110 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR19);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion110, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy110, composerM2074constructorimpl, currentCompositionLocalMap110);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf110, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance110 = BoxScopeInstance.INSTANCE;
                    if (z13) {
                        composer2.startReplaceableGroup(-1866758084);
                        disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                    } else {
                        composer2.startReplaceableGroup(-1866758058);
                        disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                    }
                    composer2.endReplaceableGroup();
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i1118 >> 12) & 112) | 8);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    z14 = z13;
                    mutableInteractionSource4 = mutableInteractionSource3;
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                    }
                    int i1119 = i12;
                    composer2 = composerStartRestartGroup;
                    Modifier modifierM462toggleableO2vRcR110 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                    Alignment center111 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy111 = BoxKt.rememberBoxMeasurePolicy(center111, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap111 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
                    constructor = companion111.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf111 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR110);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion111, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy111, composerM2074constructorimpl, currentCompositionLocalMap111);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf111, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance111 = BoxScopeInstance.INSTANCE;
                    if (z13) {
                        composer2.startReplaceableGroup(-1866758084);
                        disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                    } else {
                        composer2.startReplaceableGroup(-1866758058);
                        disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                    }
                    composer2.endReplaceableGroup();
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i1119 >> 12) & 112) | 8);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    z14 = z13;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, onCheckedChange, modifier2, z14, mutableInteractionSource4, content, i10, i11));
            }
            i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i17;
            if ((374491 & i12) == 74898) {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                }
                int i11110 = i12;
                composer2 = composerStartRestartGroup;
                Modifier modifierM462toggleableO2vRcR111 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                Alignment center112 = Alignment.INSTANCE.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy112 = BoxKt.rememberBoxMeasurePolicy(center112, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap112 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion112 = ComposeUiNode.INSTANCE;
                constructor = companion112.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf112 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR111);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                function2C = com.google.android.gms.measurement.internal.a.c(companion112, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy112, composerM2074constructorimpl, currentCompositionLocalMap112);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf112, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance112 = BoxScopeInstance.INSTANCE;
                if (z13) {
                    composer2.startReplaceableGroup(-1866758084);
                    disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                } else {
                    composer2.startReplaceableGroup(-1866758058);
                    disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                }
                composer2.endReplaceableGroup();
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i11110 >> 12) & 112) | 8);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                z14 = z13;
                mutableInteractionSource4 = mutableInteractionSource3;
            } else {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                }
                int i11111 = i12;
                composer2 = composerStartRestartGroup;
                Modifier modifierM462toggleableO2vRcR112 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                Alignment center113 = Alignment.INSTANCE.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy113 = BoxKt.rememberBoxMeasurePolicy(center113, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap113 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion113 = ComposeUiNode.INSTANCE;
                constructor = companion113.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf113 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR112);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                function2C = com.google.android.gms.measurement.internal.a.c(companion113, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy113, composerM2074constructorimpl, currentCompositionLocalMap113);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf113, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance113 = BoxScopeInstance.INSTANCE;
                if (z13) {
                    composer2.startReplaceableGroup(-1866758084);
                    disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                } else {
                    composer2.startReplaceableGroup(-1866758058);
                    disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                }
                composer2.endReplaceableGroup();
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i11111 >> 12) & 112) | 8);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                z14 = z13;
                mutableInteractionSource4 = mutableInteractionSource3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, onCheckedChange, modifier2, z14, mutableInteractionSource4, content, i10, i11));
        }
        i12 |= 3072;
        z12 = z11;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((57344 & i10) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                    }
                    int i11112 = i12;
                    composer2 = composerStartRestartGroup;
                    Modifier modifierM462toggleableO2vRcR113 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                    Alignment center114 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy114 = BoxKt.rememberBoxMeasurePolicy(center114, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap114 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion114 = ComposeUiNode.INSTANCE;
                    constructor = companion114.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf114 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR113);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion114, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy114, composerM2074constructorimpl, currentCompositionLocalMap114);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf114, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance114 = BoxScopeInstance.INSTANCE;
                    if (z13) {
                        composer2.startReplaceableGroup(-1866758084);
                        disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                    } else {
                        composer2.startReplaceableGroup(-1866758058);
                        disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                    }
                    composer2.endReplaceableGroup();
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i11112 >> 12) & 112) | 8);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    z14 = z13;
                    mutableInteractionSource4 = mutableInteractionSource3;
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    } else {
                        z13 = z12;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                    }
                    int i11113 = i12;
                    composer2 = composerStartRestartGroup;
                    Modifier modifierM462toggleableO2vRcR114 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                    Alignment center115 = Alignment.INSTANCE.getCenter();
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy115 = BoxKt.rememberBoxMeasurePolicy(center115, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap115 = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion115 = ComposeUiNode.INSTANCE;
                    constructor = companion115.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf115 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR114);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion115, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy115, composerM2074constructorimpl, currentCompositionLocalMap115);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf115, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                    BoxScopeInstance boxScopeInstance115 = BoxScopeInstance.INSTANCE;
                    if (z13) {
                        composer2.startReplaceableGroup(-1866758084);
                        disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                    } else {
                        composer2.startReplaceableGroup(-1866758058);
                        disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                    }
                    composer2.endReplaceableGroup();
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i11113 >> 12) & 112) | 8);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    z14 = z13;
                    mutableInteractionSource4 = mutableInteractionSource3;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, onCheckedChange, modifier2, z14, mutableInteractionSource4, content, i10, i11));
            }
            i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i17;
            if ((374491 & i12) == 74898) {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                }
                int i11114 = i12;
                composer2 = composerStartRestartGroup;
                Modifier modifierM462toggleableO2vRcR115 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                Alignment center116 = Alignment.INSTANCE.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy116 = BoxKt.rememberBoxMeasurePolicy(center116, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap116 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion116 = ComposeUiNode.INSTANCE;
                constructor = companion116.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf116 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR115);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                function2C = com.google.android.gms.measurement.internal.a.c(companion116, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy116, composerM2074constructorimpl, currentCompositionLocalMap116);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf116, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance116 = BoxScopeInstance.INSTANCE;
                if (z13) {
                    composer2.startReplaceableGroup(-1866758084);
                    disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                } else {
                    composer2.startReplaceableGroup(-1866758058);
                    disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                }
                composer2.endReplaceableGroup();
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i11114 >> 12) & 112) | 8);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                z14 = z13;
                mutableInteractionSource4 = mutableInteractionSource3;
            } else {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                }
                int i11115 = i12;
                composer2 = composerStartRestartGroup;
                Modifier modifierM462toggleableO2vRcR116 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                Alignment center117 = Alignment.INSTANCE.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy117 = BoxKt.rememberBoxMeasurePolicy(center117, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap117 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion117 = ComposeUiNode.INSTANCE;
                constructor = companion117.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf117 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR116);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                function2C = com.google.android.gms.measurement.internal.a.c(companion117, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy117, composerM2074constructorimpl, currentCompositionLocalMap117);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf117, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance117 = BoxScopeInstance.INSTANCE;
                if (z13) {
                    composer2.startReplaceableGroup(-1866758084);
                    disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                } else {
                    composer2.startReplaceableGroup(-1866758058);
                    disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                }
                composer2.endReplaceableGroup();
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i11115 >> 12) & 112) | 8);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                z14 = z13;
                mutableInteractionSource4 = mutableInteractionSource3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, onCheckedChange, modifier2, z14, mutableInteractionSource4, content, i10, i11));
        }
        i12 |= 24576;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i11 & 32) != 0) {
            if ((458752 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
            }
            if ((374491 & i12) == 74898) {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                }
                int i11116 = i12;
                composer2 = composerStartRestartGroup;
                Modifier modifierM462toggleableO2vRcR117 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                Alignment center118 = Alignment.INSTANCE.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy118 = BoxKt.rememberBoxMeasurePolicy(center118, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap118 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion118 = ComposeUiNode.INSTANCE;
                constructor = companion118.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf118 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR117);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                function2C = com.google.android.gms.measurement.internal.a.c(companion118, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy118, composerM2074constructorimpl, currentCompositionLocalMap118);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf118, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance118 = BoxScopeInstance.INSTANCE;
                if (z13) {
                    composer2.startReplaceableGroup(-1866758084);
                    disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                } else {
                    composer2.startReplaceableGroup(-1866758058);
                    disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                }
                composer2.endReplaceableGroup();
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i11116 >> 12) & 112) | 8);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                z14 = z13;
                mutableInteractionSource4 = mutableInteractionSource3;
            } else {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z13 = true;
                } else {
                    z13 = z12;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
                }
                int i11117 = i12;
                composer2 = composerStartRestartGroup;
                Modifier modifierM462toggleableO2vRcR118 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
                Alignment center119 = Alignment.INSTANCE.getCenter();
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy119 = BoxKt.rememberBoxMeasurePolicy(center119, false, composer2, 6);
                composer2.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap119 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion119 = ComposeUiNode.INSTANCE;
                constructor = companion119.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf119 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR118);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                function2C = com.google.android.gms.measurement.internal.a.c(companion119, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy119, composerM2074constructorimpl, currentCompositionLocalMap119);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf119, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance119 = BoxScopeInstance.INSTANCE;
                if (z13) {
                    composer2.startReplaceableGroup(-1866758084);
                    disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
                } else {
                    composer2.startReplaceableGroup(-1866758058);
                    disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
                }
                composer2.endReplaceableGroup();
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i11117 >> 12) & 112) | 8);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                z14 = z13;
                mutableInteractionSource4 = mutableInteractionSource3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, onCheckedChange, modifier2, z14, mutableInteractionSource4, content, i10, i11));
        }
        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i12 |= i17;
        if ((374491 & i12) == 74898) {
            if (i18 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                z13 = true;
            } else {
                z13 = z12;
            }
            if (i15 != 0) {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
            } else {
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
            }
            int i11118 = i12;
            composer2 = composerStartRestartGroup;
            Modifier modifierM462toggleableO2vRcR119 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
            Alignment center1110 = Alignment.INSTANCE.getCenter();
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy1110 = BoxKt.rememberBoxMeasurePolicy(center1110, false, composer2, 6);
            composer2.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap1110 = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion1110 = ComposeUiNode.INSTANCE;
            constructor = companion1110.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1110 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR119);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
            function2C = com.google.android.gms.measurement.internal.a.c(companion1110, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy1110, composerM2074constructorimpl, currentCompositionLocalMap1110);
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf1110, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance1110 = BoxScopeInstance.INSTANCE;
            if (z13) {
                composer2.startReplaceableGroup(-1866758084);
                disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
            } else {
                composer2.startReplaceableGroup(-1866758058);
                disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
            }
            composer2.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i11118 >> 12) & 112) | 8);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            z14 = z13;
            mutableInteractionSource4 = mutableInteractionSource3;
        } else {
            if (i18 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                z13 = true;
            } else {
                z13 = z12;
            }
            if (i15 != 0) {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
            } else {
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-54657793, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:101)");
            }
            int i11119 = i12;
            composer2 = composerStartRestartGroup;
            Modifier modifierM462toggleableO2vRcR1110 = ToggleableKt.m462toggleableO2vRcR0(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), z10, mutableInteractionSource3, RippleKt.m900rememberRipple9IZ8Weo(false, f7210a, 0L, composerStartRestartGroup, 54, 4), z13, Role.m3825boximpl(Role.INSTANCE.m3832getCheckboxo7Vup1c()), onCheckedChange);
            Alignment center1111 = Alignment.INSTANCE.getCenter();
            composer2.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy1111 = BoxKt.rememberBoxMeasurePolicy(center1111, false, composer2, 6);
            composer2.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap1111 = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion1111 = ComposeUiNode.INSTANCE;
            constructor = companion1111.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf1111 = LayoutKt.modifierMaterializerOf(modifierM462toggleableO2vRcR1110);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
            function2C = com.google.android.gms.measurement.internal.a.c(companion1111, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy1111, composerM2074constructorimpl, currentCompositionLocalMap1111);
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf1111, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance1111 = BoxScopeInstance.INSTANCE;
            if (z13) {
                composer2.startReplaceableGroup(-1866758084);
                disabled = ((Number) composer2.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue();
            } else {
                composer2.startReplaceableGroup(-1866758058);
                disabled = ContentAlpha.INSTANCE.getDisabled(composer2, 6);
            }
            composer2.endReplaceableGroup();
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(disabled))}, content, composer2, ((i11119 >> 12) & 112) | 8);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            z14 = z13;
            mutableInteractionSource4 = mutableInteractionSource3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(z10, onCheckedChange, modifier2, z14, mutableInteractionSource4, content, i10, i11));
    }
}
