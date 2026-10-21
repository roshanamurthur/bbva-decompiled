package androidx.compose.foundation.lazy.layout;

import androidx.appcompat.widget.o1;
import androidx.camera.camera2.internal.compat.u;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyLayoutSemantics.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a?\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"lazyLayoutSemantics", "Landroidx/compose/ui/Modifier;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "state", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "userScrollEnabled", "", "reverseScrolling", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLazyLayoutSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutSemantics.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,156:1\n486#2,4:157\n490#2,2:165\n494#2:171\n25#3:161\n83#3,3:172\n1097#4,3:162\n1100#4,3:168\n1097#4,6:175\n486#5:167\n*S KotlinDebug\n*F\n+ 1 LazyLayoutSemantics.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsKt\n*L\n48#1:157,4\n48#1:165,2\n48#1:171\n48#1:161\n50#1:172,3\n48#1:162,3\n48#1:168,3\n50#1:175,6\n48#1:167\n*E\n"})
public final class LazyLayoutSemanticsKt {

    /* JADX INFO: compiled from: LazyLayoutSemantics.kt */
    public static final class a extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Object, Integer> f5034p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f5035q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ScrollAxisRange f5036r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Float, Float, Boolean> f5037s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function1<Integer, Boolean> f5038t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ CollectionInfo f5039u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, boolean z10, ScrollAxisRange scrollAxisRange, e eVar, f fVar, CollectionInfo collectionInfo) {
            super(1);
            this.f5034p0 = dVar;
            this.f5035q0 = z10;
            this.f5036r0 = scrollAxisRange;
            this.f5037s0 = eVar;
            this.f5038t0 = fVar;
            this.f5039u0 = collectionInfo;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setTraversalGroup(semantics, true);
            SemanticsPropertiesKt.indexForKey(semantics, this.f5034p0);
            boolean z10 = this.f5035q0;
            ScrollAxisRange scrollAxisRange = this.f5036r0;
            if (z10) {
                SemanticsPropertiesKt.setVerticalScrollAxisRange(semantics, scrollAxisRange);
            } else {
                SemanticsPropertiesKt.setHorizontalScrollAxisRange(semantics, scrollAxisRange);
            }
            Function2<Float, Float, Boolean> function2 = this.f5037s0;
            if (function2 != null) {
                SemanticsPropertiesKt.scrollBy$default(semantics, null, function2, 1, null);
            }
            Function1<Integer, Boolean> function1 = this.f5038t0;
            if (function1 != null) {
                SemanticsPropertiesKt.scrollToIndex$default(semantics, null, function1, 1, null);
            }
            SemanticsPropertiesKt.setCollectionInfo(semantics, this.f5039u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: LazyLayoutSemantics.kt */
    public static final class b extends Lambda implements Function0<Float> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LazyLayoutSemanticState f5040p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LazyLayoutSemanticState lazyLayoutSemanticState) {
            super(0);
            this.f5040p0 = lazyLayoutSemanticState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(this.f5040p0.getCurrentPosition());
        }
    }

    /* JADX INFO: compiled from: LazyLayoutSemantics.kt */
    public static final class c extends Lambda implements Function0<Float> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<LazyLayoutItemProvider> f5041p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LazyLayoutSemanticState f5042q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function0<? extends LazyLayoutItemProvider> function0, LazyLayoutSemanticState lazyLayoutSemanticState) {
            super(0);
            this.f5041p0 = function0;
            this.f5042q0 = lazyLayoutSemanticState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            LazyLayoutItemProvider lazyLayoutItemProviderInvoke = this.f5041p0.invoke();
            LazyLayoutSemanticState lazyLayoutSemanticState = this.f5042q0;
            return Float.valueOf(lazyLayoutSemanticState.getCanScrollForward() ? lazyLayoutItemProviderInvoke.getItemCount() + 1.0f : lazyLayoutSemanticState.getCurrentPosition());
        }
    }

    /* JADX INFO: compiled from: LazyLayoutSemantics.kt */
    public static final class d extends Lambda implements Function1<Object, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<LazyLayoutItemProvider> f5043p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function0<? extends LazyLayoutItemProvider> function0) {
            super(1);
            this.f5043p0 = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(Object needle) {
            Intrinsics.checkNotNullParameter(needle, "needle");
            LazyLayoutItemProvider lazyLayoutItemProviderInvoke = this.f5043p0.invoke();
            int itemCount = lazyLayoutItemProviderInvoke.getItemCount();
            int i10 = 0;
            while (i10 < itemCount) {
                if (Intrinsics.areEqual(lazyLayoutItemProviderInvoke.getKey(i10), needle)) {
                    return Integer.valueOf(i10);
                }
                i10++;
            }
            i10 = -1;
            return Integer.valueOf(i10);
        }
    }

    /* JADX INFO: compiled from: LazyLayoutSemantics.kt */
    public static final class e extends Lambda implements Function2<Float, Float, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f5044p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f5045q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ LazyLayoutSemanticState f5046r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10, CoroutineScope coroutineScope, LazyLayoutSemanticState lazyLayoutSemanticState) {
            super(2);
            this.f5044p0 = z10;
            this.f5045q0 = coroutineScope;
            this.f5046r0 = lazyLayoutSemanticState;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Boolean invoke(Float f6, Float f10) {
            float fFloatValue = f6.floatValue();
            float fFloatValue2 = f10.floatValue();
            if (this.f5044p0) {
                fFloatValue = fFloatValue2;
            }
            BuildersKt__Builders_commonKt.launch$default(this.f5045q0, null, null, new o(this.f5046r0, fFloatValue, null), 3, null);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: LazyLayoutSemantics.kt */
    public static final class f extends Lambda implements Function1<Integer, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<LazyLayoutItemProvider> f5047p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f5048q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ LazyLayoutSemanticState f5049r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function0<? extends LazyLayoutItemProvider> function0, CoroutineScope coroutineScope, LazyLayoutSemanticState lazyLayoutSemanticState) {
            super(1);
            this.f5047p0 = function0;
            this.f5048q0 = coroutineScope;
            this.f5049r0 = lazyLayoutSemanticState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Integer num) {
            int iIntValue = num.intValue();
            LazyLayoutItemProvider lazyLayoutItemProviderInvoke = this.f5047p0.invoke();
            if (iIntValue >= 0 && iIntValue < lazyLayoutItemProviderInvoke.getItemCount()) {
                BuildersKt__Builders_commonKt.launch$default(this.f5048q0, null, null, new p(this.f5049r0, iIntValue, null), 3, null);
                return Boolean.TRUE;
            }
            StringBuilder sbC = o1.c("Can't scroll to index ", iIntValue, ", it is out of bounds [0, ");
            sbC.append(lazyLayoutItemProviderInvoke.getItemCount());
            sbC.append(RootService.CLOSE_BRACKET);
            throw new IllegalArgumentException(sbC.toString().toString());
        }
    }

    @Composable
    @NotNull
    public static final Modifier lazyLayoutSemantics(@NotNull Modifier modifier, @NotNull Function0<? extends LazyLayoutItemProvider> itemProviderLambda, @NotNull LazyLayoutSemanticState state, @NotNull Orientation orientation, boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(itemProviderLambda, "itemProviderLambda");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        composer.startReplaceableGroup(1070136913);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1070136913, i10, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:40)");
        }
        Object objB = androidx.databinding.c.b(composer, 773894976, -492369756);
        if (objB == Composer.INSTANCE.getEmpty()) {
            objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer), composer);
        }
        composer.endReplaceableGroup();
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
        composer.endReplaceableGroup();
        Object[] objArr = {itemProviderLambda, state, orientation, Boolean.valueOf(z10)};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i11 = 0; i11 < 4; i11++) {
            zChanged |= composer.changed(objArr[i11]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            boolean z12 = orientation == Orientation.Vertical;
            objRememberedValue = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new a(new d(itemProviderLambda), z12, new ScrollAxisRange(new b(state), new c(itemProviderLambda, state), z11), z10 ? new e(z12, coroutineScope, state) : null, z10 ? new f(itemProviderLambda, coroutineScope, state) : null, state.collectionInfo()), 1, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier modifierThen = modifier.then((Modifier) objRememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifierThen;
    }
}
