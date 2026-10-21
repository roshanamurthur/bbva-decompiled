package com.bbva.component.ui.carousel.cards.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.bbva.component.ui.carousel.R;
import com.bbva.component.ui.carousel.cards.CarouselCardsContract;
import com.bbva.component.ui.carousel.cards.CarouselCardsViewModel;
import com.bbva.component.ui.carousel.cards.view.compose.CarouselOfCardsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CarouselCardsView.kt */
/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB1\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/bbva/component/ui/carousel/cards/view/CarouselCardsView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Lkotlinx/coroutines/CoroutineScope;", "", "Content", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/bbva/component/ui/carousel/cards/CarouselCardsViewModel;", "E0", "Lcom/bbva/component/ui/carousel/cards/CarouselCardsViewModel;", "getViewModel", "()Lcom/bbva/component/ui/carousel/cards/CarouselCardsViewModel;", "viewModel", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "isDarkModeEnabled", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V", "Companion", "component-ui-carousel_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCarouselCardsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselCardsView.kt\ncom/bbva/component/ui/carousel/cards/view/CarouselCardsView\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,50:1\n76#2:51\n*S KotlinDebug\n*F\n+ 1 CarouselCardsView.kt\ncom/bbva/component/ui/carousel/cards/view/CarouselCardsView\n*L\n29#1:51\n*E\n"})
public final class CarouselCardsView extends AbstractComposeView implements CoroutineScope {

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    @NotNull
    public final CarouselCardsViewModel viewModel;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final boolean f28267x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f28268y0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: CarouselCardsView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/component/ui/carousel/cards/view/CarouselCardsView$Companion;", "", "<init>", "()V", "component-ui-carousel_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCarouselCardsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselCardsView.kt\ncom/bbva/component/ui/carousel/cards/view/CarouselCardsView$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1#2:51\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final boolean access$initIsDarkModeEnabled(Companion companion, Context context, AttributeSet attributeSet) {
            companion.getClass();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.carousel_isDarkModeEnabled});
            boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
            typedArrayObtainStyledAttributes.recycle();
            return z10;
        }
    }

    /* JADX INFO: compiled from: CarouselCardsView.kt */
    public static final class a extends Lambda implements Function1<CarouselCardsContract.Event, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(CarouselCardsContract.Event event) {
            CarouselCardsContract.Event it = event;
            Intrinsics.checkNotNullParameter(it, "it");
            CarouselCardsView.this.getViewModel().notify$component_ui_carousel_release(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CarouselCardsView.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f28271q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10) {
            super(2);
            this.f28271q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f28271q0 | 1);
            CarouselCardsView.this.Content(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CarouselCardsView(@NotNull Context context) {
        this(context, null, 0, false, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@Nullable Composer composer, int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1805603776);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1805603776, i10, -1, "com.bbva.component.ui.carousel.cards.view.CarouselCardsView.Content (CarouselCardsView.kt:27)");
        }
        CarouselOfCardsKt.CarouselOfCards((CarouselCardsContract.State) FlowExtKt.collectAsStateWithLifecycle(this.viewModel.getOnModel(), (Object) null, (LifecycleOwner) null, (Lifecycle.State) null, getCoroutineContext(), composerStartRestartGroup, 32824, 6).getValue(), this.f28267x0, new a(), composerStartRestartGroup, 8, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(i10));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f28268y0.getCoroutineContext();
    }

    @NotNull
    public final CarouselCardsViewModel getViewModel() {
        return this.viewModel;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CarouselCardsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CarouselCardsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, false, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CarouselCardsView(Context context, AttributeSet attributeSet, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        attributeSet = (i11 & 2) != 0 ? null : attributeSet;
        this(context, attributeSet, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? Companion.access$initIsDarkModeEnabled(INSTANCE, context, attributeSet) : z10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CarouselCardsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, boolean z10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28267x0 = z10;
        this.f28268y0 = CoroutineScopeKt.MainScope();
        this.viewModel = new CarouselCardsViewModel();
    }
}
