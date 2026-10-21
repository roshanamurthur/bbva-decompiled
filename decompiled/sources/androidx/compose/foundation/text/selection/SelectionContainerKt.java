package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TouchMode_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SelectionContainer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0002\u0010\u0005\u001a*\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0007¢\u0006\u0002\u0010\t\u001aJ\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0014\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00010\r2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\f\u0010\n\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002"}, d2 = {"DisableSelection", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SelectionContainer", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "selection", "Landroidx/compose/foundation/text/selection/Selection;", "onSelectionChange", "Lkotlin/Function1;", "children", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/text/selection/Selection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSelectionContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 ContextMenu.android.kt\nandroidx/compose/foundation/text/ContextMenu_androidKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,145:1\n25#2:146\n36#2:153\n25#2:160\n25#2:167\n1097#3,6:147\n1097#3,6:154\n1097#3,6:161\n1097#3,6:168\n76#4:174\n76#4:175\n76#4:176\n38#5,2:177\n81#6:179\n107#6,2:180\n*S KotlinDebug\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt\n*L\n43#1:146\n47#1:153\n85#1:160\n86#1:167\n43#1:147,6\n47#1:154,6\n85#1:161,6\n86#1:168,6\n88#1:174\n89#1:175\n90#1:176\n95#1:177,2\n43#1:179\n43#1:180,2\n*E\n"})
public final class SelectionContainerKt {

    /* JADX INFO: compiled from: SelectionContainer.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6322p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f6323q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, Function2 function2) {
            super(2);
            this.f6322p0 = function2;
            this.f6323q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f6323q0 | 1);
            SelectionContainerKt.DisableSelection(this.f6322p0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SelectionContainer.kt */
    public static final class b extends Lambda implements Function1<Selection, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Selection> f6324p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MutableState<Selection> mutableState) {
            super(1);
            this.f6324p0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Selection selection) {
            this.f6324p0.setValue(selection);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SelectionContainer.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6325p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6326q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f6327r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f6328s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f6325p0 = modifier;
            this.f6326q0 = function2;
            this.f6327r0 = i10;
            this.f6328s0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f6327r0 | 1);
            SelectionContainerKt.SelectionContainer(this.f6325p0, this.f6326q0, composer, iUpdateChangedFlags, this.f6328s0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SelectionContainer.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6329p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SelectionManager f6330q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6331r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f6332s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Modifier modifier, SelectionManager selectionManager, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f6329p0 = modifier;
            this.f6330q0 = selectionManager;
            this.f6331r0 = function2;
            this.f6332s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(935424596, iIntValue, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous> (SelectionContainer.kt:95)");
                }
                SelectionManager selectionManager = this.f6330q0;
                SimpleLayoutKt.SimpleLayout(this.f6329p0.then(selectionManager.getModifier()), ComposableLambdaKt.composableLambda(composer2, 1375295262, true, new androidx.compose.foundation.text.selection.e(this.f6331r0, this.f6332s0, selectionManager)), composer2, 48, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SelectionContainer.kt */
    @SourceDebugExtension({"SMAP\nSelectionContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt$SelectionContainer$4\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,145:1\n63#2,5:146\n*S KotlinDebug\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt$SelectionContainer$4\n*L\n139#1:146,5\n*E\n"})
    public static final class e extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SelectionManager f6333p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(SelectionManager selectionManager) {
            super(1);
            this.f6333p0 = selectionManager;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final SelectionManager selectionManager = this.f6333p0;
            return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$4$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    SelectionManager selectionManager2 = selectionManager;
                    selectionManager2.onRelease();
                    selectionManager2.setHasFocus(false);
                }
            };
        }
    }

    /* JADX INFO: compiled from: SelectionContainer.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6334p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Selection f6335q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<Selection, Unit> f6336r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6337s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f6338t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f6339u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Modifier modifier, Selection selection, Function1<? super Selection, Unit> function1, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f6334p0 = modifier;
            this.f6335q0 = selection;
            this.f6336r0 = function1;
            this.f6337s0 = function2;
            this.f6338t0 = i10;
            this.f6339u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            SelectionContainerKt.SelectionContainer(this.f6334p0, this.f6335q0, this.f6336r0, this.f6337s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6338t0 | 1), this.f6339u0);
            return Unit.INSTANCE;
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void DisableSelection(@NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(336063542);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(336063542, i11, -1, "androidx.compose.foundation.text.selection.DisableSelection (SelectionContainer.kt:60)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{SelectionRegistrarKt.getLocalSelectionRegistrar().provides(null)}, content, composerStartRestartGroup, ((i11 << 3) & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(i10, content));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SelectionContainer(@Nullable Modifier modifier, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1075498320);
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
            i12 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1075498320, i12, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:41)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            Selection selection = (Selection) mutableState.getValue();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new b(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SelectionContainer(modifier, selection, (Function1) objRememberedValue2, content, composerStartRestartGroup, (i12 & 14) | ((i12 << 6) & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier, content, i10, i11));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SelectionContainer(@Nullable Modifier modifier, @Nullable Selection selection, @NotNull Function1<? super Selection, Unit> onSelectionChange, @NotNull Function2<? super Composer, ? super Integer, Unit> children, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(onSelectionChange, "onSelectionChange");
        Intrinsics.checkNotNullParameter(children, "children");
        Composer composerStartRestartGroup = composer.startRestartGroup(2078139907);
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
            i12 |= composerStartRestartGroup.changed(selection) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onSelectionChange) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(children) ? 2048 : 1024;
        }
        if ((i12 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2078139907, i12, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:75)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new SelectionRegistrarImpl();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SelectionRegistrarImpl selectionRegistrarImpl = (SelectionRegistrarImpl) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new SelectionManager(selectionRegistrarImpl);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SelectionManager selectionManager = (SelectionManager) objRememberedValue2;
            selectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
            selectionManager.setClipboardManager((ClipboardManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboardManager()));
            selectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
            selectionManager.setOnSelectionChange(onSelectionChange);
            selectionManager.setSelection(selection);
            selectionManager.setTouchMode(TouchMode_androidKt.isInTouchMode());
            composerStartRestartGroup.startReplaceableGroup(605522716);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{SelectionRegistrarKt.getLocalSelectionRegistrar().provides(selectionRegistrarImpl)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 935424596, true, new d(modifier, selectionManager, children, i12)), composerStartRestartGroup, 56);
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(selectionManager, new e(selectionManager), composerStartRestartGroup, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f(modifier2, selection, onSelectionChange, children, i10, i11));
    }
}
