package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y.e;

/* JADX INFO: compiled from: LazyListItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"rememberLazyListItemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyListItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,106:1\n36#2:107\n1097#3,6:108\n*S KotlinDebug\n*F\n+ 1 LazyListItemProvider.kt\nandroidx/compose/foundation/lazy/LazyListItemProviderKt\n*L\n46#1:107\n46#1:108,6\n*E\n"})
public final class LazyListItemProviderKt {

    /* JADX INFO: compiled from: LazyListItemProvider.kt */
    public static final class b extends Lambda implements Function0<LazyListIntervalContent> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ State<Function1<LazyListScope, Unit>> f4582p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(State<? extends Function1<? super LazyListScope, Unit>> state) {
            super(0);
            this.f4582p0 = state;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LazyListIntervalContent invoke() {
            return new LazyListIntervalContent(this.f4582p0.getValue());
        }
    }

    /* JADX INFO: compiled from: LazyListItemProvider.kt */
    public static final class c extends Lambda implements Function0<e> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ State<LazyListIntervalContent> f4583p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LazyListState f4584q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ LazyItemScopeImpl f4585r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(State<LazyListIntervalContent> state, LazyListState lazyListState, LazyItemScopeImpl lazyItemScopeImpl) {
            super(0);
            this.f4583p0 = state;
            this.f4584q0 = lazyListState;
            this.f4585r0 = lazyItemScopeImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        public final e invoke() {
            LazyListIntervalContent value = this.f4583p0.getValue();
            LazyListState lazyListState = this.f4584q0;
            return new e(lazyListState, value, this.f4585r0, new NearestRangeKeyIndexMap(lazyListState.getNearestRange$foundation_release(), value));
        }
    }

    @Composable
    @NotNull
    public static final Function0<LazyListItemProvider> rememberLazyListItemProviderLambda(@NotNull LazyListState state, @NotNull Function1<? super LazyListScope, Unit> content, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(content, "content");
        composer.startReplaceableGroup(-343736148);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-343736148, i10, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProviderLambda (LazyListItemProvider.kt:40)");
        }
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(content, composer, (i10 >> 3) & 14);
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(state);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            LazyItemScopeImpl lazyItemScopeImpl = new LazyItemScopeImpl();
            objRememberedValue = new PropertyReference0Impl(SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new c(SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new b(stateRememberUpdatedState)), state, lazyItemScopeImpl))) { // from class: androidx.compose.foundation.lazy.LazyListItemProviderKt.a
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
                @Nullable
                public final Object get() {
                    return ((State) this.receiver).getValue();
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        KProperty0 kProperty0 = (KProperty0) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return kProperty0;
    }
}
