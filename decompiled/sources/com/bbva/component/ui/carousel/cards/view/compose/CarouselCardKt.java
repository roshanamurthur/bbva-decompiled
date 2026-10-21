package com.bbva.component.ui.carousel.cards.view.compose;

import androidx.appcompat.widget.g0;
import androidx.camera.core.impl.v;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import com.bbva.component.ui.carousel.cards.model.CarouselCardItem;
import com.bbva.component.ui.carousel.cards.view.compose.constants.TestTag;
import com.bbva.component.ui.carousel.cards.view.compose.defaults.CardImageDefaults;
import com.bbva.component.ui.carousel.view.compose.TextKt;
import com.bbva.component.ui.carousel.view.compose.theme.Dimension;
import com.bbva.component.ui.carousel.view.compose.theme.ThemeKt;
import com.bbva.document.scanner.plugin.validators.ValidationConstantsKt;
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

/* JADX INFO: compiled from: CarouselCard.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/component/ui/carousel/cards/model/CarouselCardItem;", ValidationConstantsKt.Card, "Lkotlin/Function0;", "", "onClick", "CarouselCard", "(Lcom/bbva/component/ui/carousel/cards/model/CarouselCardItem;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "component-ui-carousel_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCarouselCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarouselCard.kt\ncom/bbva/component/ui/carousel/cards/view/compose/CarouselCardKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,80:1\n25#2:81\n36#2:88\n460#2,13:114\n36#2:128\n36#2:135\n473#2,3:142\n1114#3,6:82\n1114#3,6:89\n1114#3,6:129\n1114#3,6:136\n74#4,6:95\n80#4:127\n84#4:146\n75#5:101\n76#5,11:103\n89#5:145\n76#6:102\n*S KotlinDebug\n*F\n+ 1 CarouselCard.kt\ncom/bbva/component/ui/carousel/cards/view/compose/CarouselCardKt\n*L\n34#1:81\n38#1:88\n35#1:114,13\n53#1:128\n60#1:135\n35#1:142,3\n34#1:82,6\n38#1:89,6\n53#1:129,6\n60#1:136,6\n35#1:95,6\n35#1:127\n35#1:146\n35#1:101\n35#1:103,11\n35#1:145\n35#1:102\n*E\n"})
public final class CarouselCardKt {

    /* JADX INFO: compiled from: CarouselCard.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f28306p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CarouselCard.kt */
    public static final class b extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CarouselCardItem f28307p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CarouselCardItem carouselCardItem) {
            super(1);
            this.f28307p0 = carouselCardItem;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setContainer(semantics, true);
            SemanticsPropertiesKt.m3843setRolekuIjeqM(semantics, Role.INSTANCE.m3831getButtono7Vup1c());
            SemanticsPropertiesKt.onClick$default(semantics, null, null, 1, null);
            SemanticsPropertiesKt.setContentDescription(semantics, this.f28307p0.getAccessibilityLabel());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CarouselCard.kt */
    public static final class c extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f28308p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.invisibleToUser(semantics);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CarouselCard.kt */
    public static final class d extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f28309p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0<Unit> function0) {
            super(0);
            this.f28309p0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f28309p0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CarouselCard.kt */
    public static final class e extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f28310p0 = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.invisibleToUser(semantics);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CarouselCard.kt */
    public static final class f extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f28311p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0<Unit> function0) {
            super(0);
            this.f28311p0 = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f28311p0.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: CarouselCard.kt */
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CarouselCardItem f28312p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f28313q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f28314r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f28315s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(CarouselCardItem carouselCardItem, Function0<Unit> function0, int i10, int i11) {
            super(2);
            this.f28312p0 = carouselCardItem;
            this.f28313q0 = function0;
            this.f28314r0 = i10;
            this.f28315s0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f28314r0 | 1);
            CarouselCardKt.CarouselCard(this.f28312p0, this.f28313q0, composer, iUpdateChangedFlags, this.f28315s0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:46:0x0100  */
    /* JADX WARN: Code duplicated, block: B:49:0x010c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0110  */
    /* JADX WARN: Code duplicated, block: B:53:0x0160  */
    /* JADX WARN: Code duplicated, block: B:55:0x0166  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void CarouselCard(@NotNull CarouselCardItem card, @Nullable Function0<Unit> function0, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Function0<Unit> function1;
        Function0<Unit> function2;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean zChanged;
        Object objRememberedValue2;
        Function0<ComposeUiNode> constructor;
        boolean zChanged2;
        Object objRememberedValue3;
        boolean zChanged3;
        Object objRememberedValue4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(card, "card");
        Composer composerStartRestartGroup = composer.startRestartGroup(611767346);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(card) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 == 0) {
            if ((i10 & 112) == 0) {
                function1 = function0;
                i12 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            if ((i12 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i13 != 0) {
                    function2 = a.f28306p0;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(611767346, i12, -1, "com.bbva.component.ui.carousel.cards.view.compose.CarouselCard (CarouselCard.kt:29)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierTestTag = TestTagKt.testTag(companion2, TestTag.Carousel.Item);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(card);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new b(card);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics = SemanticsModifierKt.semantics(modifierTestTag, true, (Function1) objRememberedValue2);
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyA = v.a(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                constructor = companion3.getConstructor();
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
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl, measurePolicyA, composerM2074constructorimpl, density));
                ai.a.j(0, function3MaterializerOf, g0.b(companion3, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                String pan = card.getPan();
                String image = card.getImage();
                CardImageDefaults cardImageDefaults = CardImageDefaults.INSTANCE;
                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(SizeKt.m340width3ABfNKs(SizeKt.m321height3ABfNKs(companion2, cardImageDefaults.m4856getHeightD9Ej5fM()), cardImageDefaults.m4857getWidthD9Ej5fM()), false, c.f28308p0, 1, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(function2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new d(function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CarouselCardImageKt.CarouselCardImage(pan, image, modifierSemantics$default, mutableInteractionSource, (Function0) objRememberedValue3, composerStartRestartGroup, 3072, 0);
                String link = card.getLink();
                Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(companion2, false, e.f28310p0, 1, null);
                PaddingValues paddingValuesM293PaddingValuesa9UjIt4$default = PaddingKt.m293PaddingValuesa9UjIt4$default(0.0f, Dimension.Padding.INSTANCE.m4859getExtraSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged3 = composerStartRestartGroup.changed(function2);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new f(function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TextKt.Link(link, modifierSemantics$default2, paddingValuesM293PaddingValuesa9UjIt4$default, mutableInteractionSource, (Function0) objRememberedValue4, composerStartRestartGroup, 3456, 0);
                if (y2.d(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function2 = function1;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new g(card, function2, i10, i11));
        }
        i12 |= 48;
        function1 = function0;
        if ((i12 & 91) == 18) {
            if (i13 != 0) {
                function2 = a.f28306p0;
            } else {
                function2 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(611767346, i12, -1, "com.bbva.component.ui.carousel.cards.view.compose.CarouselCard (CarouselCard.kt:29)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierTestTag2 = TestTagKt.testTag(companion4, TestTag.Carousel.Item);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(card);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new b(card);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new b(card);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierSemantics2 = SemanticsModifierKt.semantics(modifierTestTag2, true, (Function1) objRememberedValue2);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyA2 = v.a(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            constructor = companion5.getConstructor();
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
            Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion5, composerM2074constructorimpl2, measurePolicyA2, composerM2074constructorimpl2, density2));
            ai.a.j(0, function3MaterializerOf2, g0.b(companion5, composerM2074constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            String pan2 = card.getPan();
            String image2 = card.getImage();
            CardImageDefaults cardImageDefaults2 = CardImageDefaults.INSTANCE;
            Modifier modifierSemantics$default3 = SemanticsModifierKt.semantics$default(SizeKt.m340width3ABfNKs(SizeKt.m321height3ABfNKs(companion4, cardImageDefaults2.m4856getHeightD9Ej5fM()), cardImageDefaults2.m4857getWidthD9Ej5fM()), false, c.f28308p0, 1, null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged2 = composerStartRestartGroup.changed(function2);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue3 = new d(function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new d(function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CarouselCardImageKt.CarouselCardImage(pan2, image2, modifierSemantics$default3, mutableInteractionSource2, (Function0) objRememberedValue3, composerStartRestartGroup, 3072, 0);
            String link2 = card.getLink();
            Modifier modifierSemantics$default4 = SemanticsModifierKt.semantics$default(companion4, false, e.f28310p0, 1, null);
            PaddingValues paddingValuesM293PaddingValuesa9UjIt4$default2 = PaddingKt.m293PaddingValuesa9UjIt4$default(0.0f, Dimension.Padding.INSTANCE.m4859getExtraSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged3 = composerStartRestartGroup.changed(function2);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3) {
                objRememberedValue4 = new f(function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new f(function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TextKt.Link(link2, modifierSemantics$default4, paddingValuesM293PaddingValuesa9UjIt4$default2, mutableInteractionSource2, (Function0) objRememberedValue4, composerStartRestartGroup, 3456, 0);
            if (y2.d(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i13 != 0) {
                function2 = a.f28306p0;
            } else {
                function2 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(611767346, i12, -1, "com.bbva.component.ui.carousel.cards.view.compose.CarouselCard (CarouselCard.kt:29)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableInteractionSource mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
            Modifier.Companion companion6 = Modifier.INSTANCE;
            Modifier modifierTestTag3 = TestTagKt.testTag(companion6, TestTag.Carousel.Item);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(card);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new b(card);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new b(card);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierSemantics3 = SemanticsModifierKt.semantics(modifierTestTag3, true, (Function1) objRememberedValue2);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyA3 = v.a(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
            constructor = companion7.getConstructor();
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
            Updater.m2081setimpl(composerM2074constructorimpl3, layoutDirection3, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion7, composerM2074constructorimpl3, measurePolicyA3, composerM2074constructorimpl3, density3));
            ai.a.j(0, function3MaterializerOf3, g0.b(companion7, composerM2074constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            String pan3 = card.getPan();
            String image3 = card.getImage();
            CardImageDefaults cardImageDefaults3 = CardImageDefaults.INSTANCE;
            Modifier modifierSemantics$default5 = SemanticsModifierKt.semantics$default(SizeKt.m340width3ABfNKs(SizeKt.m321height3ABfNKs(companion6, cardImageDefaults3.m4856getHeightD9Ej5fM()), cardImageDefaults3.m4857getWidthD9Ej5fM()), false, c.f28308p0, 1, null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged2 = composerStartRestartGroup.changed(function2);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue3 = new d(function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new d(function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CarouselCardImageKt.CarouselCardImage(pan3, image3, modifierSemantics$default5, mutableInteractionSource3, (Function0) objRememberedValue3, composerStartRestartGroup, 3072, 0);
            String link3 = card.getLink();
            Modifier modifierSemantics$default6 = SemanticsModifierKt.semantics$default(companion6, false, e.f28310p0, 1, null);
            PaddingValues paddingValuesM293PaddingValuesa9UjIt4$default3 = PaddingKt.m293PaddingValuesa9UjIt4$default(0.0f, Dimension.Padding.INSTANCE.m4859getExtraSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged3 = composerStartRestartGroup.changed(function2);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged3) {
                objRememberedValue4 = new f(function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new f(function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TextKt.Link(link3, modifierSemantics$default6, paddingValuesM293PaddingValuesa9UjIt4$default3, mutableInteractionSource3, (Function0) objRememberedValue4, composerStartRestartGroup, 3456, 0);
            if (y2.d(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new g(card, function2, i10, i11));
    }

    public static final void access$CarouselCardPreview(Composer composer, int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1421964823);
        if (i10 == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1421964823, i10, -1, "com.bbva.component.ui.carousel.cards.view.compose.CarouselCardPreview (CarouselCard.kt:66)");
            }
            ThemeKt.Theme(false, false, ComposableSingletons$CarouselCardKt.INSTANCE.m4854getLambda1$component_ui_carousel_release(), composerStartRestartGroup, BluetoothState.REQUEST_CONNECT_DEVICE, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new j5.b(i10));
    }
}
