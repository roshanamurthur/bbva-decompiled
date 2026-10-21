package com.bbva.component.ui.carousel.cards.view.compose;

import androidx.appcompat.widget.g0;
import androidx.camera.core.impl.v;
import androidx.compose.foundation.OverscrollConfigurationKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.bbva.component.ui.carousel.cards.CarouselCardsContract;
import com.bbva.component.ui.carousel.cards.model.CarouselCardItem;
import com.bbva.component.ui.carousel.cards.view.compose.constants.TestTag;
import com.bbva.component.ui.carousel.view.compose.TextKt;
import com.bbva.component.ui.carousel.view.compose.theme.Dimension;
import com.bbva.component.ui.carousel.view.compose.theme.ThemeKt;
import com.mypinpad.tsdk.isolation.y2;
import com.vierge.bluetoothlibrary.BluetoothState;
import j5.g;
import j5.h;
import j5.i;
import j5.j;
import j5.k;
import j5.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import x.n1;

/* JADX INFO: compiled from: CarouselOfCards.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a9\u0010\b\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/bbva/component/ui/carousel/cards/CarouselCardsContract$State;", "state", "", "isDarkModeEnabled", "Lkotlin/Function1;", "Lcom/bbva/component/ui/carousel/cards/CarouselCardsContract$Event;", "", "onClick", "CarouselOfCards", "(Lcom/bbva/component/ui/carousel/cards/CarouselCardsContract$State;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "component-ui-carousel_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCarouselOfCards.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselOfCards.kt\ncom/bbva/component/ui/carousel/cards/view/compose/CarouselOfCardsKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,121:1\n75#2,6:122\n81#2:154\n85#2:166\n75#3:128\n76#3,11:130\n89#3:165\n76#4:129\n460#5,13:141\n36#5:155\n473#5,3:162\n1114#6,6:156\n*S KotlinDebug\n*F\n+ 1 CarouselOfCards.kt\ncom/bbva/component/ui/carousel/cards/view/compose/CarouselOfCardsKt\n*L\n50#1:122,6\n50#1:154\n50#1:166\n50#1:128\n50#1:130,11\n50#1:165\n50#1:129\n50#1:141,13\n71#1:155\n50#1:162,3\n71#1:156,6\n*E\n"})
public final class CarouselOfCardsKt {

    /* JADX INFO: compiled from: CarouselOfCards.kt */
    public static final class a extends Lambda implements Function1<CarouselCardsContract.Event, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f28322p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(CarouselCardsContract.Event event) {
            CarouselCardsContract.Event it = event;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CarouselOfCards.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CarouselCardsContract.State f28323p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f28324q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<CarouselCardsContract.Event, Unit> f28325r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f28326s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f28327t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(CarouselCardsContract.State state, boolean z10, Function1<? super CarouselCardsContract.Event, Unit> function1, int i10, int i11) {
            super(2);
            this.f28323p0 = state;
            this.f28324q0 = z10;
            this.f28325r0 = function1;
            this.f28326s0 = i10;
            this.f28327t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            CarouselOfCardsKt.CarouselOfCards(this.f28323p0, this.f28324q0, this.f28325r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f28326s0 | 1), this.f28327t0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CarouselOfCards.kt */
    @SourceDebugExtension({"SMAP\nCarouselOfCards.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselOfCards.kt\ncom/bbva/component/ui/carousel/cards/view/compose/CarouselOfCardsKt$CarouselOfCards$3\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,121:1\n74#2,6:122\n80#2:154\n84#2:159\n75#3:128\n76#3,11:130\n89#3:158\n76#4:129\n460#5,13:141\n473#5,3:155\n*S KotlinDebug\n*F\n+ 1 CarouselOfCards.kt\ncom/bbva/component/ui/carousel/cards/view/compose/CarouselOfCardsKt$CarouselOfCards$3\n*L\n33#1:122,6\n33#1:154\n33#1:159\n33#1:128\n33#1:130,11\n33#1:158\n33#1:129\n33#1:141,13\n33#1:155,3\n*E\n"})
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CarouselCardsContract.State f28328p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<CarouselCardsContract.Event, Unit> f28329q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f28330r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(CarouselCardsContract.State state, Function1<? super CarouselCardsContract.Event, Unit> function1, int i10) {
            super(2);
            this.f28328p0 = state;
            this.f28329q0 = function1;
            this.f28330r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1094363763, iIntValue, -1, "com.bbva.component.ui.carousel.cards.view.compose.CarouselOfCards.<anonymous> (CarouselOfCards.kt:31)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Dimension.Padding padding = Dimension.Padding.INSTANCE;
                Modifier modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(companion, 0.0f, padding.m4860getMediumD9Ej5fM(), 0.0f, padding.m4860getMediumD9Ej5fM(), 5, null);
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyA = v.a(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composer2, 0, -1323940314);
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM300paddingqDBjuR0$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                composer2.disableReusing();
                Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl, measurePolicyA, composerM2074constructorimpl, density));
                ai.a.j(0, function3MaterializerOf, g0.b(companion2, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                CarouselCardsContract.State state = this.f28328p0;
                CarouselCardsContract.State.Header header = state.getHeader();
                int i10 = (this.f28330r0 >> 3) & 112;
                Function1<CarouselCardsContract.Event, Unit> function1 = this.f28329q0;
                CarouselOfCardsKt.access$Header(header, function1, composer2, i10, 0);
                CarouselOfCardsKt.access$Carousel(state.getItems(), function1, composer2, i10 | 8, 0);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CarouselOfCards.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CarouselCardsContract.State f28331p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f28332q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<CarouselCardsContract.Event, Unit> f28333r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f28334s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f28335t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(CarouselCardsContract.State state, boolean z10, Function1<? super CarouselCardsContract.Event, Unit> function1, int i10, int i11) {
            super(2);
            this.f28331p0 = state;
            this.f28332q0 = z10;
            this.f28333r0 = function1;
            this.f28334s0 = i10;
            this.f28335t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            CarouselOfCardsKt.CarouselOfCards(this.f28331p0, this.f28332q0, this.f28333r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f28334s0 | 1), this.f28335t0);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CarouselOfCards(@Nullable CarouselCardsContract.State state, boolean z10, @Nullable Function1<? super CarouselCardsContract.Event, Unit> function1, @Nullable Composer composer, int i10, int i11) {
        Composer composerStartRestartGroup = composer.startRestartGroup(31348585);
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            function1 = a.f28322p0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(31348585, i10, -1, "com.bbva.component.ui.carousel.cards.view.compose.CarouselOfCards (CarouselOfCards.kt:25)");
        }
        if (state == null || state.getItems().isEmpty()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(state, z10, function1, i10, i11));
            return;
        }
        ThemeKt.Theme(z10, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1094363763, true, new c(state, function1, i10)), composerStartRestartGroup, ((i10 >> 3) & 14) | BluetoothState.REQUEST_CONNECT_DEVICE, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new d(state, z10, function1, i10, i11));
    }

    public static final void access$Carousel(List list, Function1 function1, Composer composer, int i10, int i11) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1269592076);
        if ((i11 & 2) != 0) {
            function1 = j5.c.f78770p0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1269592076, i10, -1, "com.bbva.component.ui.carousel.cards.view.compose.Carousel (CarouselOfCards.kt:77)");
        }
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{OverscrollConfigurationKt.getLocalOverscrollConfiguration().provides(null)}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1809050828, true, new g(list, function1, i10)), composerStartRestartGroup, 56);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h(list, i10, i11, function1));
    }

    public static final void access$CarouselOfCardsPreview(Composer composer, int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1042192411);
        if (i10 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1042192411, i10, -1, "com.bbva.component.ui.carousel.cards.view.compose.CarouselOfCardsPreview (CarouselOfCards.kt:97)");
            }
            ArrayList arrayList = new ArrayList();
            for (int i11 = 1; i11 < 6; i11++) {
                arrayList.add(new CarouselCardItem(g0.c("id", i11), g0.c("000", i11), null, "Ver datos y CVV", g0.c("Tarjeta acaba en 0", i11)));
            }
            CarouselOfCards(new CarouselCardsContract.State(new CarouselCardsContract.State.Header("Comprar en internet", "Configurar"), arrayList), false, null, composerStartRestartGroup, 8, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new i(i10));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:45:0x0149  */
    /* JADX WARN: Code duplicated, block: B:47:0x0151  */
    /* JADX WARN: Code duplicated, block: B:50:0x016d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0177  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public static final void access$Header(CarouselCardsContract.State.Header header, Function1 function1, Composer composer, int i10, int i11) {
        int i12;
        Function1 function2;
        Function1 function3;
        Function0<ComposeUiNode> constructor;
        boolean zChanged;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1074811154);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(header) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 == 0) {
            if ((i10 & 112) == 0) {
                function2 = function1;
                i12 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            }
            if ((i12 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i13 != 0) {
                    function3 = j.f78785p0;
                } else {
                    function3 = function2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1074811154, i12, -1, "com.bbva.component.ui.carousel.cards.view.compose.Header (CarouselOfCards.kt:45)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierTestTag = TestTagKt.testTag(companion, TestTag.Header.Container);
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierTestTag);
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
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion2, composerM2074constructorimpl, measurePolicyRowMeasurePolicy, composerM2074constructorimpl, density));
                ai.a.j(0, function3MaterializerOf, g0.b(companion2, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                String title = header.getTitle();
                Modifier modifierTestTag2 = TestTagKt.testTag(companion, TestTag.Header.Title);
                Dimension.Padding padding = Dimension.Padding.INSTANCE;
                TextKt.Title(title, n1.a(rowScopeInstance, PaddingKt.m300paddingqDBjuR0$default(modifierTestTag2, padding.m4860getMediumD9Ej5fM(), padding.m4861getSmallD9Ej5fM(), 0.0f, padding.m4861getSmallD9Ej5fM(), 4, null), 1.0f, false, 2, null), composerStartRestartGroup, 0, 0);
                String link = header.getLink();
                Modifier modifierTestTag3 = TestTagKt.testTag(companion, TestTag.Header.Link);
                PaddingValues paddingValuesM292PaddingValuesa9UjIt4 = PaddingKt.m292PaddingValuesa9UjIt4(padding.m4860getMediumD9Ej5fM(), padding.m4861getSmallD9Ej5fM(), padding.m4860getMediumD9Ej5fM(), padding.m4861getSmallD9Ej5fM());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new k(function3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TextKt.Link(link, modifierTestTag3, paddingValuesM292PaddingValuesa9UjIt4, null, (Function0) objRememberedValue, composerStartRestartGroup, 48, 8);
                if (y2.d(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function3 = function2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new l(header, function3, i10, i11));
        }
        i12 |= 48;
        function2 = function1;
        if ((i12 & 91) == 18) {
            if (i13 != 0) {
                function3 = j.f78785p0;
            } else {
                function3 = function2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1074811154, i12, -1, "com.bbva.component.ui.carousel.cards.view.compose.Header (CarouselOfCards.kt:45)");
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierTestTag4 = TestTagKt.testTag(companion3, TestTag.Header.Container);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierTestTag4);
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
            Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion4, composerM2074constructorimpl2, measurePolicyRowMeasurePolicy2, composerM2074constructorimpl2, density2));
            ai.a.j(0, function3MaterializerOf2, g0.b(companion4, composerM2074constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            String title2 = header.getTitle();
            Modifier modifierTestTag5 = TestTagKt.testTag(companion3, TestTag.Header.Title);
            Dimension.Padding padding2 = Dimension.Padding.INSTANCE;
            TextKt.Title(title2, n1.a(rowScopeInstance2, PaddingKt.m300paddingqDBjuR0$default(modifierTestTag5, padding2.m4860getMediumD9Ej5fM(), padding2.m4861getSmallD9Ej5fM(), 0.0f, padding2.m4861getSmallD9Ej5fM(), 4, null), 1.0f, false, 2, null), composerStartRestartGroup, 0, 0);
            String link2 = header.getLink();
            Modifier modifierTestTag6 = TestTagKt.testTag(companion3, TestTag.Header.Link);
            PaddingValues paddingValuesM292PaddingValuesa9UjIt5 = PaddingKt.m292PaddingValuesa9UjIt4(padding2.m4860getMediumD9Ej5fM(), padding2.m4861getSmallD9Ej5fM(), padding2.m4860getMediumD9Ej5fM(), padding2.m4861getSmallD9Ej5fM());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(function3);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new k(function3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new k(function3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TextKt.Link(link2, modifierTestTag6, paddingValuesM292PaddingValuesa9UjIt5, null, (Function0) objRememberedValue, composerStartRestartGroup, 48, 8);
            if (y2.d(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i13 != 0) {
                function3 = j.f78785p0;
            } else {
                function3 = function2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1074811154, i12, -1, "com.bbva.component.ui.carousel.cards.view.compose.Header (CarouselOfCards.kt:45)");
            }
            Modifier.Companion companion5 = Modifier.INSTANCE;
            Modifier modifierTestTag7 = TestTagKt.testTag(companion5, TestTag.Header.Container);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            constructor = companion6.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierTestTag7);
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
            Updater.m2081setimpl(composerM2074constructorimpl3, layoutDirection3, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion6, composerM2074constructorimpl3, measurePolicyRowMeasurePolicy3, composerM2074constructorimpl3, density3));
            ai.a.j(0, function3MaterializerOf3, g0.b(companion6, composerM2074constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            String title3 = header.getTitle();
            Modifier modifierTestTag8 = TestTagKt.testTag(companion5, TestTag.Header.Title);
            Dimension.Padding padding3 = Dimension.Padding.INSTANCE;
            TextKt.Title(title3, n1.a(rowScopeInstance3, PaddingKt.m300paddingqDBjuR0$default(modifierTestTag8, padding3.m4860getMediumD9Ej5fM(), padding3.m4861getSmallD9Ej5fM(), 0.0f, padding3.m4861getSmallD9Ej5fM(), 4, null), 1.0f, false, 2, null), composerStartRestartGroup, 0, 0);
            String link3 = header.getLink();
            Modifier modifierTestTag9 = TestTagKt.testTag(companion5, TestTag.Header.Link);
            PaddingValues paddingValuesM292PaddingValuesa9UjIt6 = PaddingKt.m292PaddingValuesa9UjIt4(padding3.m4860getMediumD9Ej5fM(), padding3.m4861getSmallD9Ej5fM(), padding3.m4860getMediumD9Ej5fM(), padding3.m4861getSmallD9Ej5fM());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(function3);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new k(function3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new k(function3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TextKt.Link(link3, modifierTestTag9, paddingValuesM292PaddingValuesa9UjIt6, null, (Function0) objRememberedValue, composerStartRestartGroup, 48, 8);
            if (y2.d(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new l(header, function3, i10, i11));
    }
}
