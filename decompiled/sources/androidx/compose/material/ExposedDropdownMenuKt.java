package androidx.compose.material;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
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

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u001aS\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010²\u0006\u000e\u0010\u000e\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"}, d2 = {"", "expanded", "Lkotlin/Function1;", "", "onExpandedChange", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material/ExposedDropdownMenuBoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "ExposedDropdownMenuBox", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "", "width", "menuHeight", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,737:1\n76#2:738\n76#2:739\n25#3:740\n25#3:747\n25#3:755\n67#3,3:762\n66#3:765\n25#3:772\n50#3:779\n49#3:780\n456#3,8:804\n464#3,3:818\n467#3,3:822\n50#3:827\n49#3:828\n1097#4,6:741\n1097#4,6:748\n1097#4,6:756\n1097#4,6:766\n1097#4,6:773\n1097#4,6:781\n1097#4,6:829\n1#5:754\n66#6,6:787\n72#6:821\n76#6:826\n78#7,11:793\n91#7:825\n4144#8,6:812\n75#9:835\n108#9,2:836\n75#9:838\n108#9,2:839\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuKt\n*L\n97#1:738\n98#1:739\n99#1:740\n100#1:747\n102#1:755\n104#1:762,3\n104#1:765\n117#1:772\n131#1:779\n131#1:780\n119#1:804,8\n119#1:818,3\n119#1:822,3\n138#1:827\n138#1:828\n99#1:741,6\n100#1:748,6\n102#1:756,6\n104#1:766,6\n117#1:773,6\n131#1:781,6\n138#1:829,6\n119#1:787,6\n119#1:821\n119#1:826\n119#1:793,11\n119#1:825\n119#1:812,6\n99#1:835\n99#1:836,2\n100#1:838\n100#1:839,2\n*E\n"})
public final class ExposedDropdownMenuKt {

    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
    public static final class a extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Ref<LayoutCoordinates> f7153p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ View f7154q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f7155r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f7156s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f7157t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Ref<LayoutCoordinates> ref, View view, int i10, MutableIntState mutableIntState, MutableIntState mutableIntState2) {
            super(1);
            this.f7153p0 = ref;
            this.f7154q0 = view;
            this.f7155r0 = i10;
            this.f7156s0 = mutableIntState;
            this.f7157t0 = mutableIntState2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates it = layoutCoordinates;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f7156s0.setIntValue(IntSize.m4549getWidthimpl(it.mo3581getSizeYbymL2g()));
            Ref<LayoutCoordinates> ref = this.f7153p0;
            ref.setValue(it);
            View rootView = this.f7154q0.getRootView();
            Intrinsics.checkNotNullExpressionValue(rootView, "view.rootView");
            ExposedDropdownMenuKt.access$updateHeight(rootView, ref.getValue(), this.f7155r0, new x0(this.f7157t0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
    public static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f7158p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f7159q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super Boolean, Unit> function1, boolean z10) {
            super(0);
            this.f7158p0 = function1;
            this.f7159q0 = z10;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f7158p0.invoke(Boolean.valueOf(!this.f7159q0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
    public static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f7160p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ FocusRequester f7161q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, FocusRequester focusRequester) {
            super(0);
            this.f7160p0 = z10;
            this.f7161q0 = focusRequester;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (this.f7160p0) {
                this.f7161q0.requestFocus();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
    @SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuKt$ExposedDropdownMenuBox$5\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,737:1\n63#2,5:738\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/ExposedDropdownMenuKt$ExposedDropdownMenuBox$5\n*L\n153#1:738,5\n*E\n"})
    public static final class d extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ View f7162p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Ref<LayoutCoordinates> f7163q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f7164r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f7165s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view, Ref<LayoutCoordinates> ref, int i10, MutableIntState mutableIntState) {
            super(1);
            this.f7162p0 = view;
            this.f7163q0 = ref;
            this.f7164r0 = i10;
            this.f7165s0 = mutableIntState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            int i10 = this.f7164r0;
            MutableIntState mutableIntState = this.f7165s0;
            View view = this.f7162p0;
            final h0.a2 a2Var = new h0.a2(view, new z0(view, this.f7163q0, i10, mutableIntState));
            return new DisposableEffectResult() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    h0.a2 a2Var2 = a2Var;
                    boolean z10 = a2Var2.f68644r0;
                    View view2 = a2Var2.f68642p0;
                    if (z10) {
                        view2.getViewTreeObserver().removeOnGlobalLayoutListener(a2Var2);
                        a2Var2.f68644r0 = false;
                    }
                    view2.removeOnAttachStateChangeListener(a2Var2);
                }
            };
        }
    }

    /* JADX INFO: compiled from: ExposedDropdownMenu.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f7166p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f7167q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7168r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function3<ExposedDropdownMenuBoxScope, Composer, Integer, Unit> f7169s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f7170t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f7171u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(boolean z10, Function1<? super Boolean, Unit> function1, Modifier modifier, Function3<? super ExposedDropdownMenuBoxScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f7166p0 = z10;
            this.f7167q0 = function1;
            this.f7168r0 = modifier;
            this.f7169s0 = function3;
            this.f7170t0 = i10;
            this.f7171u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ExposedDropdownMenuKt.ExposedDropdownMenuBox(this.f7166p0, this.f7167q0, this.f7168r0, this.f7169s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7170t0 | 1), this.f7171u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02af  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:64:0x0103  */
    /* JADX WARN: Code duplicated, block: B:67:0x013b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0141  */
    /* JADX WARN: Code duplicated, block: B:72:0x015f  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:80:0x0202  */
    /* JADX WARN: Code duplicated, block: B:83:0x020e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0212  */
    /* JADX WARN: Code duplicated, block: B:87:0x0223  */
    /* JADX WARN: Code duplicated, block: B:89:0x0231  */
    /* JADX WARN: Code duplicated, block: B:92:0x0277  */
    /* JADX WARN: Code duplicated, block: B:94:0x027d  */
    /* JADX WARN: Code duplicated, block: B:97:0x02a5  */
    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ExposedDropdownMenuBox(boolean z10, @NotNull Function1<? super Boolean, Unit> onExpandedChange, @Nullable Modifier modifier, @NotNull Function3<? super ExposedDropdownMenuBoxScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        Modifier modifier3;
        final Density density;
        Object objRememberedValue;
        Composer.Companion companion;
        final MutableIntState mutableIntState;
        Object objRememberedValue2;
        final MutableIntState mutableIntState2;
        Object objRememberedValue3;
        boolean zChanged;
        Object objRememberedValue4;
        Object objRememberedValue5;
        FocusRequester focusRequester;
        boolean zChanged2;
        Object objRememberedValue6;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM2074constructorimpl;
        Function2 function2C;
        boolean zChanged3;
        Object objRememberedValue7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onExpandedChange, "onExpandedChange");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1456052980);
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
            i12 |= composerStartRestartGroup.changedInstance(onExpandedChange) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 == 0) {
            if ((i10 & 896) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            if ((i12 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1456052980, i12, -1, "androidx.compose.material.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:90)");
                }
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableIntState = (MutableIntState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableIntState2 = (MutableIntState) objRememberedValue2;
                int iMo413roundToPx0680j_4 = density.mo413roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Ref();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Ref ref = (Ref) objRememberedValue3;
                Integer numValueOf = Integer.valueOf(mutableIntState2.getIntValue());
                Integer numValueOf2 = Integer.valueOf(mutableIntState.getIntValue());
                composerStartRestartGroup.startReplaceableGroup(1618982084);
                zChanged = composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(numValueOf) | composerStartRestartGroup.changed(numValueOf2);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new ExposedDropdownMenuBoxScope() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1
                        @Override // androidx.compose.material.ExposedDropdownMenuBoxScope
                        public final /* synthetic */ void ExposedDropdownMenu(boolean z11, Function0 function0, Modifier modifier4, ScrollState scrollState, Function3 function3, Composer composer2, int i15, int i16) {
                            w0.a(this, z11, function0, modifier4, scrollState, function3, composer2, i15, i16);
                        }

                        @Override // androidx.compose.material.ExposedDropdownMenuBoxScope
                        @NotNull
                        public Modifier exposedDropdownSize(@NotNull Modifier modifier4, boolean z11) {
                            Intrinsics.checkNotNullParameter(modifier4, "<this>");
                            int intValue = mutableIntState2.getIntValue();
                            Density density2 = density;
                            Modifier modifierM323heightInVpY3zN4$default = SizeKt.m323heightInVpY3zN4$default(modifier4, 0.0f, density2.mo406toDpu2uoSUM(intValue), 1, null);
                            return z11 ? SizeKt.m340width3ABfNKs(modifierM323heightInVpY3zN4$default, density2.mo406toDpu2uoSUM(mutableIntState.getIntValue())) : modifierM323heightInVpY3zN4$default;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 = (ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1) objRememberedValue4;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new FocusRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                focusRequester = (FocusRequester) objRememberedValue5;
                Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier3, new a(ref, view, iMo413roundToPx0680j_4, mutableIntState, mutableIntState2));
                Boolean boolValueOf = Boolean.valueOf(z10);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged2 = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(onExpandedChange);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new b(onExpandedChange, z10);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Function0 function0 = (Function0) objRememberedValue6;
                Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SemanticsModifierKt.semantics$default(SuspendingPointerInputFilterKt.pointerInput(modifierOnGloballyPositioned, Unit.INSTANCE, new h0.b1(function0, null)), false, new h0.d1(Strings_androidKt.m832getString4foXLRw(Strings.INSTANCE.m828getExposedDropdownMenuUdPEhr4(), composerStartRestartGroup, 6), function0), 1, null), focusRequester);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFocusRequester);
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
                function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, currentCompositionLocalMap);
                if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                content.invoke(exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1, composerStartRestartGroup, Integer.valueOf((i12 >> 6) & 112));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                Boolean boolValueOf2 = Boolean.valueOf(z10);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(boolValueOf2) | composerStartRestartGroup.changed(focusRequester);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new c(z10, focusRequester);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) objRememberedValue7, composerStartRestartGroup, 0);
                EffectsKt.DisposableEffect(view, new d(view, ref, iMo413roundToPx0680j_4, mutableIntState2), composerStartRestartGroup, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(z10, onExpandedChange, modifier3, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5851) == 1170) {
            if (i14 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1456052980, i12, -1, "androidx.compose.material.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:90)");
            }
            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            View view2 = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableIntState = (MutableIntState) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableIntState2 = (MutableIntState) objRememberedValue2;
            int iMo413roundToPx0680j_5 = density.mo413roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Ref();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Ref ref2 = (Ref) objRememberedValue3;
            Integer numValueOf3 = Integer.valueOf(mutableIntState2.getIntValue());
            Integer numValueOf4 = Integer.valueOf(mutableIntState.getIntValue());
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            zChanged = composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(numValueOf3) | composerStartRestartGroup.changed(numValueOf4);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue4 = new ExposedDropdownMenuBoxScope() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1
                    @Override // androidx.compose.material.ExposedDropdownMenuBoxScope
                    public final /* synthetic */ void ExposedDropdownMenu(boolean z11, Function0 function1, Modifier modifier4, ScrollState scrollState, Function3 function3, Composer composer2, int i15, int i16) {
                        w0.a(this, z11, function1, modifier4, scrollState, function3, composer2, i15, i16);
                    }

                    @Override // androidx.compose.material.ExposedDropdownMenuBoxScope
                    @NotNull
                    public Modifier exposedDropdownSize(@NotNull Modifier modifier4, boolean z11) {
                        Intrinsics.checkNotNullParameter(modifier4, "<this>");
                        int intValue = mutableIntState2.getIntValue();
                        Density density2 = density;
                        Modifier modifierM323heightInVpY3zN4$default = SizeKt.m323heightInVpY3zN4$default(modifier4, 0.0f, density2.mo406toDpu2uoSUM(intValue), 1, null);
                        return z11 ? SizeKt.m340width3ABfNKs(modifierM323heightInVpY3zN4$default, density2.mo406toDpu2uoSUM(mutableIntState.getIntValue())) : modifierM323heightInVpY3zN4$default;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new ExposedDropdownMenuBoxScope() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1
                    @Override // androidx.compose.material.ExposedDropdownMenuBoxScope
                    public final /* synthetic */ void ExposedDropdownMenu(boolean z11, Function0 function1, Modifier modifier4, ScrollState scrollState, Function3 function3, Composer composer2, int i15, int i16) {
                        w0.a(this, z11, function1, modifier4, scrollState, function3, composer2, i15, i16);
                    }

                    @Override // androidx.compose.material.ExposedDropdownMenuBoxScope
                    @NotNull
                    public Modifier exposedDropdownSize(@NotNull Modifier modifier4, boolean z11) {
                        Intrinsics.checkNotNullParameter(modifier4, "<this>");
                        int intValue = mutableIntState2.getIntValue();
                        Density density2 = density;
                        Modifier modifierM323heightInVpY3zN4$default = SizeKt.m323heightInVpY3zN4$default(modifier4, 0.0f, density2.mo406toDpu2uoSUM(intValue), 1, null);
                        return z11 ? SizeKt.m340width3ABfNKs(modifierM323heightInVpY3zN4$default, density2.mo406toDpu2uoSUM(mutableIntState.getIntValue())) : modifierM323heightInVpY3zN4$default;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$2 = (ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1) objRememberedValue4;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            focusRequester = (FocusRequester) objRememberedValue5;
            Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier3, new a(ref2, view2, iMo413roundToPx0680j_5, mutableIntState, mutableIntState2));
            Boolean boolValueOf3 = Boolean.valueOf(z10);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged2 = composerStartRestartGroup.changed(boolValueOf3) | composerStartRestartGroup.changed(onExpandedChange);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue6 = new b(onExpandedChange, z10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                objRememberedValue6 = new b(onExpandedChange, z10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function0 function1 = (Function0) objRememberedValue6;
            Modifier modifierFocusRequester2 = FocusRequesterModifierKt.focusRequester(SemanticsModifierKt.semantics$default(SuspendingPointerInputFilterKt.pointerInput(modifierOnGloballyPositioned2, Unit.INSTANCE, new h0.b1(function1, null)), false, new h0.d1(Strings_androidKt.m832getString4foXLRw(Strings.INSTANCE.m828getExposedDropdownMenuUdPEhr4(), composerStartRestartGroup, 6), function1), 1, null), focusRequester);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC2 = androidx.databinding.f.c(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFocusRequester2);
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
            function2C = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl, measurePolicyC2, composerM2074constructorimpl, currentCompositionLocalMap2);
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf2, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            content.invoke(exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$2, composerStartRestartGroup, Integer.valueOf((i12 >> 6) & 112));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Boolean boolValueOf4 = Boolean.valueOf(z10);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged3 = composerStartRestartGroup.changed(boolValueOf4) | composerStartRestartGroup.changed(focusRequester);
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChanged3) {
                objRememberedValue7 = new c(z10, focusRequester);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            } else {
                objRememberedValue7 = new c(z10, focusRequester);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) objRememberedValue7, composerStartRestartGroup, 0);
            EffectsKt.DisposableEffect(view2, new d(view2, ref2, iMo413roundToPx0680j_5, mutableIntState2), composerStartRestartGroup, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i14 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1456052980, i12, -1, "androidx.compose.material.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:90)");
            }
            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            View view3 = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableIntState = (MutableIntState) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableIntState2 = (MutableIntState) objRememberedValue2;
            int iMo413roundToPx0680j_6 = density.mo413roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Ref();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Ref ref3 = (Ref) objRememberedValue3;
            Integer numValueOf5 = Integer.valueOf(mutableIntState2.getIntValue());
            Integer numValueOf6 = Integer.valueOf(mutableIntState.getIntValue());
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            zChanged = composerStartRestartGroup.changed(density) | composerStartRestartGroup.changed(numValueOf5) | composerStartRestartGroup.changed(numValueOf6);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue4 = new ExposedDropdownMenuBoxScope() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1
                    @Override // androidx.compose.material.ExposedDropdownMenuBoxScope
                    public final /* synthetic */ void ExposedDropdownMenu(boolean z11, Function0 function2, Modifier modifier4, ScrollState scrollState, Function3 function3, Composer composer2, int i15, int i16) {
                        w0.a(this, z11, function2, modifier4, scrollState, function3, composer2, i15, i16);
                    }

                    @Override // androidx.compose.material.ExposedDropdownMenuBoxScope
                    @NotNull
                    public Modifier exposedDropdownSize(@NotNull Modifier modifier4, boolean z11) {
                        Intrinsics.checkNotNullParameter(modifier4, "<this>");
                        int intValue = mutableIntState2.getIntValue();
                        Density density2 = density;
                        Modifier modifierM323heightInVpY3zN4$default = SizeKt.m323heightInVpY3zN4$default(modifier4, 0.0f, density2.mo406toDpu2uoSUM(intValue), 1, null);
                        return z11 ? SizeKt.m340width3ABfNKs(modifierM323heightInVpY3zN4$default, density2.mo406toDpu2uoSUM(mutableIntState.getIntValue())) : modifierM323heightInVpY3zN4$default;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new ExposedDropdownMenuBoxScope() { // from class: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1
                    @Override // androidx.compose.material.ExposedDropdownMenuBoxScope
                    public final /* synthetic */ void ExposedDropdownMenu(boolean z11, Function0 function2, Modifier modifier4, ScrollState scrollState, Function3 function3, Composer composer2, int i15, int i16) {
                        w0.a(this, z11, function2, modifier4, scrollState, function3, composer2, i15, i16);
                    }

                    @Override // androidx.compose.material.ExposedDropdownMenuBoxScope
                    @NotNull
                    public Modifier exposedDropdownSize(@NotNull Modifier modifier4, boolean z11) {
                        Intrinsics.checkNotNullParameter(modifier4, "<this>");
                        int intValue = mutableIntState2.getIntValue();
                        Density density2 = density;
                        Modifier modifierM323heightInVpY3zN4$default = SizeKt.m323heightInVpY3zN4$default(modifier4, 0.0f, density2.mo406toDpu2uoSUM(intValue), 1, null);
                        return z11 ? SizeKt.m340width3ABfNKs(modifierM323heightInVpY3zN4$default, density2.mo406toDpu2uoSUM(mutableIntState.getIntValue())) : modifierM323heightInVpY3zN4$default;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$3 = (ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1) objRememberedValue4;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            focusRequester = (FocusRequester) objRememberedValue5;
            Modifier modifierOnGloballyPositioned3 = OnGloballyPositionedModifierKt.onGloballyPositioned(modifier3, new a(ref3, view3, iMo413roundToPx0680j_6, mutableIntState, mutableIntState2));
            Boolean boolValueOf5 = Boolean.valueOf(z10);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged2 = composerStartRestartGroup.changed(boolValueOf5) | composerStartRestartGroup.changed(onExpandedChange);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue6 = new b(onExpandedChange, z10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                objRememberedValue6 = new b(onExpandedChange, z10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function0 function2 = (Function0) objRememberedValue6;
            Modifier modifierFocusRequester3 = FocusRequesterModifierKt.focusRequester(SemanticsModifierKt.semantics$default(SuspendingPointerInputFilterKt.pointerInput(modifierOnGloballyPositioned3, Unit.INSTANCE, new h0.b1(function2, null)), false, new h0.d1(Strings_androidKt.m832getString4foXLRw(Strings.INSTANCE.m828getExposedDropdownMenuUdPEhr4(), composerStartRestartGroup, 6), function2), 1, null), focusRequester);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC3 = androidx.databinding.f.c(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierFocusRequester3);
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
            function2C = com.google.android.gms.measurement.internal.a.c(companion4, composerM2074constructorimpl, measurePolicyC3, composerM2074constructorimpl, currentCompositionLocalMap3);
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf3, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            content.invoke(exposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$3, composerStartRestartGroup, Integer.valueOf((i12 >> 6) & 112));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Boolean boolValueOf6 = Boolean.valueOf(z10);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged3 = composerStartRestartGroup.changed(boolValueOf6) | composerStartRestartGroup.changed(focusRequester);
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChanged3) {
                objRememberedValue7 = new c(z10, focusRequester);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            } else {
                objRememberedValue7 = new c(z10, focusRequester);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) objRememberedValue7, composerStartRestartGroup, 0);
            EffectsKt.DisposableEffect(view3, new d(view3, ref3, iMo413roundToPx0680j_6, mutableIntState2), composerStartRestartGroup, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new e(z10, onExpandedChange, modifier3, content, i10, i11));
    }

    public static final void access$updateHeight(View view, LayoutCoordinates layoutCoordinates, int i10, Function1 function1) {
        if (layoutCoordinates == null) {
            return;
        }
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        float top = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates).getTop();
        int i11 = rect.top;
        function1.invoke(Integer.valueOf(((int) Math.max(top - i11, (rect.bottom - i11) - LayoutCoordinatesKt.boundsInWindow(layoutCoordinates).getBottom())) - i10));
    }
}
