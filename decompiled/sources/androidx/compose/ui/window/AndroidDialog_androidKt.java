package androidx.compose.ui.window;

import android.view.View;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a:\u0010\u0007\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n²\u0006\u0017\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/ui/window/DialogProperties;", LogKeysKt.PROPERTIES, "Landroidx/compose/runtime/Composable;", "content", "Dialog", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "currentContent", "ui_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,466:1\n76#2:467\n76#2:468\n76#2:469\n50#3:470\n49#3:471\n456#3,8:489\n464#3,6:503\n1097#4,6:472\n78#5,11:478\n91#5:509\n4144#6,6:497\n81#7:510\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt\n*L\n156#1:467\n157#1:468\n158#1:469\n162#1:470\n162#1:471\n454#1:489,8\n454#1:503,6\n162#1:472,6\n454#1:478,11\n454#1:509\n454#1:497,6\n160#1:510\n*E\n"})
public final class AndroidDialog_androidKt {

    /* JADX INFO: compiled from: AndroidDialog.android.kt */
    @SourceDebugExtension({"SMAP\nAndroidDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,466:1\n63#2,5:467\n*S KotlinDebug\n*F\n+ 1 AndroidDialog.android.kt\nandroidx/compose/ui/window/AndroidDialog_androidKt$Dialog$1\n*L\n186#1:467,5\n*E\n"})
    public static final class a extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DialogWrapper f18399p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DialogWrapper dialogWrapper) {
            super(1);
            this.f18399p0 = dialogWrapper;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final DialogWrapper dialogWrapper = this.f18399p0;
            dialogWrapper.show();
            return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    DialogWrapper dialogWrapper2 = dialogWrapper;
                    dialogWrapper2.dismiss();
                    dialogWrapper2.v0.disposeComposition();
                }
            };
        }
    }

    /* JADX INFO: compiled from: AndroidDialog.android.kt */
    public static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DialogWrapper f18400p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f18401q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ DialogProperties f18402r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ LayoutDirection f18403s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DialogWrapper dialogWrapper, Function0<Unit> function0, DialogProperties dialogProperties, LayoutDirection layoutDirection) {
            super(0);
            this.f18400p0 = dialogWrapper;
            this.f18401q0 = function0;
            this.f18402r0 = dialogProperties;
            this.f18403s0 = layoutDirection;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f18400p0.d(this.f18401q0, this.f18402r0, this.f18403s0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidDialog.android.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f18404p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DialogProperties f18405q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f18406r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f18407s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f18408t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function0<Unit> function0, DialogProperties dialogProperties, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f18404p0 = function0;
            this.f18405q0 = dialogProperties;
            this.f18406r0 = function2;
            this.f18407s0 = i10;
            this.f18408t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AndroidDialog_androidKt.Dialog(this.f18404p0, this.f18405q0, this.f18406r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f18407s0 | 1), this.f18408t0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidDialog.android.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ State<Function2<Composer, Integer, Unit>> f18409p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(State<? extends Function2<? super Composer, ? super Integer, Unit>> state) {
            super(2);
            this.f18409p0 = state;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(488261145, iIntValue, -1, "androidx.compose.ui.window.Dialog.<anonymous>.<anonymous>.<anonymous> (AndroidDialog.android.kt:170)");
                }
                AndroidDialog_androidKt.access$DialogLayout(SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, androidx.compose.ui.window.a.f18478p0, 1, null), ComposableLambdaKt.composableLambda(composer2, -533674951, true, new androidx.compose.ui.window.b(this.f18409p0)), composer2, 48, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidDialog.android.kt */
    public static final class e extends Lambda implements Function0<UUID> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f18410p0 = new e(0);

        @Override // kotlin.jvm.functions.Function0
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:55:0x014f  */
    /* JADX WARN: Code duplicated, block: B:60:0x015a  */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void Dialog(@NotNull Function0<Unit> onDismissRequest, @Nullable DialogProperties dialogProperties, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        DialogProperties dialogProperties2;
        int i13;
        DialogProperties dialogProperties3;
        View view;
        Density density;
        LayoutDirection layoutDirection;
        CompositionContext parentComposition;
        State stateRememberUpdatedState;
        UUID dialogId;
        boolean zChanged;
        LayoutDirection layoutDirection2;
        Composer composer2;
        Object obj;
        DialogProperties dialogProperties4;
        Composer composer3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2032877254);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 == 0) {
            if ((i10 & 112) == 0) {
                dialogProperties2 = dialogProperties;
                i12 |= composerStartRestartGroup.changed(dialogProperties2) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            } else if ((i10 & 896) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            if ((i12 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i14 != 0) {
                    dialogProperties3 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
                } else {
                    dialogProperties3 = dialogProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2032877254, i12, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:150)");
                }
                view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                parentComposition = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
                stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composerStartRestartGroup, (i12 >> 6) & 14);
                dialogId = (UUID) RememberSaveableKt.m2165rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) e.f18410p0, composerStartRestartGroup, 3080, 6);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(view) | composerStartRestartGroup.changed(density);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Intrinsics.checkNotNullExpressionValue(dialogId, "dialogId");
                    layoutDirection2 = layoutDirection;
                    Composer composer4 = composerStartRestartGroup;
                    DialogWrapper dialogWrapper = new DialogWrapper(onDismissRequest, dialogProperties3, view, layoutDirection2, density, dialogId);
                    ComposableLambda children = ComposableLambdaKt.composableLambdaInstance(488261145, true, new d(stateRememberUpdatedState));
                    Intrinsics.checkNotNullParameter(parentComposition, "parentComposition");
                    Intrinsics.checkNotNullParameter(children, "children");
                    dialogWrapper.v0.setContent(parentComposition, children);
                    composer4.updateRememberedValue(dialogWrapper);
                    obj = dialogWrapper;
                    composer2 = composer4;
                } else {
                    layoutDirection2 = layoutDirection;
                    composer2 = composerStartRestartGroup;
                    obj = objRememberedValue;
                }
                composer2.endReplaceableGroup();
                DialogWrapper dialogWrapper2 = (DialogWrapper) obj;
                EffectsKt.DisposableEffect(dialogWrapper2, new a(dialogWrapper2), composer2, 8);
                EffectsKt.SideEffect(new b(dialogWrapper2, onDismissRequest, dialogProperties3, layoutDirection2), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                dialogProperties4 = dialogProperties3;
                composer3 = composer2;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                dialogProperties4 = dialogProperties2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(onDismissRequest, dialogProperties4, content, i10, i11));
        }
        i12 |= 48;
        dialogProperties2 = dialogProperties;
        if ((i11 & 4) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146) {
            if (i14 != 0) {
                dialogProperties3 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
            } else {
                dialogProperties3 = dialogProperties2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2032877254, i12, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:150)");
            }
            view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            parentComposition = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composerStartRestartGroup, (i12 >> 6) & 14);
            dialogId = (UUID) RememberSaveableKt.m2165rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) e.f18410p0, composerStartRestartGroup, 3080, 6);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(view) | composerStartRestartGroup.changed(density);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                Intrinsics.checkNotNullExpressionValue(dialogId, "dialogId");
                layoutDirection2 = layoutDirection;
                Composer composer5 = composerStartRestartGroup;
                DialogWrapper dialogWrapper3 = new DialogWrapper(onDismissRequest, dialogProperties3, view, layoutDirection2, density, dialogId);
                ComposableLambda children2 = ComposableLambdaKt.composableLambdaInstance(488261145, true, new d(stateRememberUpdatedState));
                Intrinsics.checkNotNullParameter(parentComposition, "parentComposition");
                Intrinsics.checkNotNullParameter(children2, "children");
                dialogWrapper3.v0.setContent(parentComposition, children2);
                composer5.updateRememberedValue(dialogWrapper3);
                obj = dialogWrapper3;
                composer2 = composer5;
            } else {
                Intrinsics.checkNotNullExpressionValue(dialogId, "dialogId");
                layoutDirection2 = layoutDirection;
                Composer composer6 = composerStartRestartGroup;
                DialogWrapper dialogWrapper4 = new DialogWrapper(onDismissRequest, dialogProperties3, view, layoutDirection2, density, dialogId);
                ComposableLambda children3 = ComposableLambdaKt.composableLambdaInstance(488261145, true, new d(stateRememberUpdatedState));
                Intrinsics.checkNotNullParameter(parentComposition, "parentComposition");
                Intrinsics.checkNotNullParameter(children3, "children");
                dialogWrapper4.v0.setContent(parentComposition, children3);
                composer6.updateRememberedValue(dialogWrapper4);
                obj = dialogWrapper4;
                composer2 = composer6;
            }
            composer2.endReplaceableGroup();
            DialogWrapper dialogWrapper5 = (DialogWrapper) obj;
            EffectsKt.DisposableEffect(dialogWrapper5, new a(dialogWrapper5), composer2, 8);
            EffectsKt.SideEffect(new b(dialogWrapper5, onDismissRequest, dialogProperties3, layoutDirection2), composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            dialogProperties4 = dialogProperties3;
            composer3 = composer2;
        } else {
            if (i14 != 0) {
                dialogProperties3 = new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null);
            } else {
                dialogProperties3 = dialogProperties2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2032877254, i12, -1, "androidx.compose.ui.window.Dialog (AndroidDialog.android.kt:150)");
            }
            view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            parentComposition = ComposablesKt.rememberCompositionContext(composerStartRestartGroup, 0);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composerStartRestartGroup, (i12 >> 6) & 14);
            dialogId = (UUID) RememberSaveableKt.m2165rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) e.f18410p0, composerStartRestartGroup, 3080, 6);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(view) | composerStartRestartGroup.changed(density);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                Intrinsics.checkNotNullExpressionValue(dialogId, "dialogId");
                layoutDirection2 = layoutDirection;
                Composer composer7 = composerStartRestartGroup;
                DialogWrapper dialogWrapper6 = new DialogWrapper(onDismissRequest, dialogProperties3, view, layoutDirection2, density, dialogId);
                ComposableLambda children4 = ComposableLambdaKt.composableLambdaInstance(488261145, true, new d(stateRememberUpdatedState));
                Intrinsics.checkNotNullParameter(parentComposition, "parentComposition");
                Intrinsics.checkNotNullParameter(children4, "children");
                dialogWrapper6.v0.setContent(parentComposition, children4);
                composer7.updateRememberedValue(dialogWrapper6);
                obj = dialogWrapper6;
                composer2 = composer7;
            } else {
                Intrinsics.checkNotNullExpressionValue(dialogId, "dialogId");
                layoutDirection2 = layoutDirection;
                Composer composer8 = composerStartRestartGroup;
                DialogWrapper dialogWrapper7 = new DialogWrapper(onDismissRequest, dialogProperties3, view, layoutDirection2, density, dialogId);
                ComposableLambda children5 = ComposableLambdaKt.composableLambdaInstance(488261145, true, new d(stateRememberUpdatedState));
                Intrinsics.checkNotNullParameter(parentComposition, "parentComposition");
                Intrinsics.checkNotNullParameter(children5, "children");
                dialogWrapper7.v0.setContent(parentComposition, children5);
                composer8.updateRememberedValue(dialogWrapper7);
                obj = dialogWrapper7;
                composer2 = composer8;
            }
            composer2.endReplaceableGroup();
            DialogWrapper dialogWrapper8 = (DialogWrapper) obj;
            EffectsKt.DisposableEffect(dialogWrapper8, new a(dialogWrapper8), composer2, 8);
            EffectsKt.SideEffect(new b(dialogWrapper8, onDismissRequest, dialogProperties3, layoutDirection2), composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            dialogProperties4 = dialogProperties3;
            composer3 = composer2;
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(onDismissRequest, dialogProperties4, content, i10, i11));
    }

    public static final Function2 access$Dialog$lambda$0(State state) {
        return (Function2) state.getValue();
    }

    public static final void access$DialogLayout(Modifier modifier, Function2 function2, Composer composer, int i10, int i11) {
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1177876616);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1177876616, i12, -1, "androidx.compose.ui.window.DialogLayout (AndroidDialog.android.kt:449)");
            }
            z1.a aVar = z1.a.f94928a;
            int i14 = ((i12 >> 3) & 14) | ((i12 << 3) & 112);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
            int i15 = ((i14 << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl, aVar, companion.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            ai.a.j((i15 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i15 >> 9) & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new z1.b(modifier, function2, i10, i11));
    }
}
