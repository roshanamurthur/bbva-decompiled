package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyLayoutPinnableItem.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"LazyLayoutPinnableItem", "", "key", "", FirebaseAnalytics.Param.INDEX, "", "pinnedItemList", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;ILandroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyLayoutPinnableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,162:1\n50#2:163\n49#2:164\n36#2:172\n1097#3,6:165\n1097#3,6:173\n76#4:171\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt\n*L\n50#1:163\n50#1:164\n53#1:172\n50#1:165,6\n53#1:173,6\n52#1:171\n*E\n"})
public final class LazyLayoutPinnableItemKt {

    /* JADX INFO: compiled from: LazyLayoutPinnableItem.kt */
    @SourceDebugExtension({"SMAP\nLazyLayoutPinnableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,162:1\n63#2,5:163\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1\n*L\n53#1:163,5\n*E\n"})
    public static final class a extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ n f5009p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar) {
            super(1);
            this.f5009p0 = nVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            DisposableEffectScope DisposableEffect = disposableEffectScope;
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            final n nVar = this.f5009p0;
            return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    n nVar2 = nVar;
                    int intValue = nVar2.f5105d.getIntValue();
                    for (int i10 = 0; i10 < intValue; i10++) {
                        nVar2.release();
                    }
                }
            };
        }
    }

    /* JADX INFO: compiled from: LazyLayoutPinnableItem.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object f5010p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f5011q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ LazyLayoutPinnedItemList f5012r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f5013s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f5014t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Object obj, int i10, LazyLayoutPinnedItemList lazyLayoutPinnedItemList, Function2<? super Composer, ? super Integer, Unit> function2, int i11) {
            super(2);
            this.f5010p0 = obj;
            this.f5011q0 = i10;
            this.f5012r0 = lazyLayoutPinnedItemList;
            this.f5013s0 = function2;
            this.f5014t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(this.f5010p0, this.f5011q0, this.f5012r0, this.f5013s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f5014t0 | 1));
            return Unit.INSTANCE;
        }
    }

    @Composable
    @ExperimentalFoundationApi
    public static final void LazyLayoutPinnableItem(@Nullable Object obj, int i10, @NotNull LazyLayoutPinnedItemList pinnedItemList, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i11) {
        Intrinsics.checkNotNullParameter(pinnedItemList, "pinnedItemList");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2079116560);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2079116560, i11, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:43)");
        }
        composerStartRestartGroup.startReplaceableGroup(511388516);
        boolean zChanged = composerStartRestartGroup.changed(obj) | composerStartRestartGroup.changed(pinnedItemList);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new n(obj, pinnedItemList);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        n nVar = (n) objRememberedValue;
        MutableIntState mutableIntState = nVar.f5104c;
        MutableState mutableState = nVar.f5106e;
        MutableState mutableState2 = nVar.f5107f;
        mutableIntState.setIntValue(i10);
        PinnableContainer pinnableContainer = (PinnableContainer) composerStartRestartGroup.consume(PinnableContainerKt.getLocalPinnableContainer());
        Snapshot snapshotCreateNonObservableSnapshot = Snapshot.INSTANCE.createNonObservableSnapshot();
        try {
            Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
            try {
                if (pinnableContainer != ((PinnableContainer) mutableState2.getValue())) {
                    mutableState2.setValue(pinnableContainer);
                    if (nVar.f5105d.getIntValue() > 0) {
                        PinnableContainer.PinnedHandle pinnedHandle = (PinnableContainer.PinnedHandle) mutableState.getValue();
                        if (pinnedHandle != null) {
                            pinnedHandle.release();
                        }
                        mutableState.setValue(pinnableContainer != null ? pinnableContainer.pin() : null);
                    }
                }
                Unit unit = Unit.INSTANCE;
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                snapshotCreateNonObservableSnapshot.dispose();
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged2 = composerStartRestartGroup.changed(nVar);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new a(nVar);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.DisposableEffect(nVar, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{PinnableContainerKt.getLocalPinnableContainer().provides(nVar)}, content, composerStartRestartGroup, ((i11 >> 6) & 112) | 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(obj, i10, pinnedItemList, content, i11));
            } catch (Throwable th2) {
                snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                throw th2;
            }
        } catch (Throwable th3) {
            snapshotCreateNonObservableSnapshot.dispose();
            throw th3;
        }
    }
}
