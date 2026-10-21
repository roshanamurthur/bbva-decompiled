package com.bbva.ui.compose;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.AppBarKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.bbva.ui.R;
import com.bbva.ui.compose.theme.Theme;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mypinpad.tsdk.isolation.y2;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: TopAppBar.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0084\u0001\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0084\u0001\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0015\u001a\u00020\u00022\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0017\u001a\u008c\u0001\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000f0\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001b2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a7\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000f0\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0007¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "titleResId", "titleIconResId", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "", "roundCornersPercent", "", "Lcom/bbva/ui/compose/TopAppBarItem;", FirebaseAnalytics.Param.ITEMS, "Lcom/bbva/ui/compose/StatusNotificationState;", "statusNotificationState", "Lkotlin/Function0;", "", "onBackButtonClicked", "onCloseButtonClicked", "TopAppBar-gF0flNs", "(Landroidx/compose/ui/Modifier;ILjava/lang/Integer;JFLjava/util/List;Lcom/bbva/ui/compose/StatusNotificationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "TopAppBar", "imageResId", "imageContentDescriptionResId", "(Landroidx/compose/ui/Modifier;ILjava/lang/Integer;JLjava/util/List;FLcom/bbva/ui/compose/StatusNotificationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "TopAppBar-lVb_Clg", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;JFLjava/util/List;Lcom/bbva/ui/compose/StatusNotificationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "TopAppBarItemContainer", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ui_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nTopAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopAppBar.kt\ncom/bbva/ui/compose/TopAppBarKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,302:1\n67#2,5:303\n72#2:336\n76#2:384\n66#2,6:395\n72#2:429\n76#2:434\n78#3,11:308\n78#3,11:344\n91#3:378\n91#3:383\n78#3,11:401\n91#3:433\n456#4,8:319\n464#4,3:333\n456#4,8:355\n464#4,3:369\n467#4,3:375\n467#4,3:380\n25#4:386\n456#4,8:412\n464#4,3:426\n467#4,3:430\n4144#5,6:327\n4144#5,6:363\n4144#5,6:420\n71#6,7:337\n78#6:372\n82#6:379\n154#7:373\n154#7:385\n154#7:393\n154#7:394\n1#8:374\n1097#9,6:387\n*S KotlinDebug\n*F\n+ 1 TopAppBar.kt\ncom/bbva/ui/compose/TopAppBarKt\n*L\n140#1:303,5\n140#1:336\n140#1:384\n245#1:395,6\n245#1:429\n245#1:434\n140#1:308,11\n147#1:344,11\n147#1:378\n140#1:383\n245#1:401,11\n245#1:433\n140#1:319,8\n140#1:333,3\n147#1:355,8\n147#1:369,3\n147#1:375,3\n140#1:380,3\n207#1:386\n245#1:412,8\n245#1:426,3\n245#1:430,3\n140#1:327,6\n147#1:363,6\n245#1:420,6\n147#1:337,7\n147#1:372\n147#1:379\n154#1:373\n192#1:385\n208#1:393\n248#1:394\n207#1:387,6\n*E\n"})
public final class TopAppBarKt {

    /* JADX INFO: compiled from: TopAppBar.kt */
    @SourceDebugExtension({"SMAP\nTopAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopAppBar.kt\ncom/bbva/ui/compose/TopAppBarKt$ActionItem$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,302:1\n154#2:303\n154#2:339\n154#2:341\n72#3,6:304\n78#3:338\n82#3:347\n78#4,11:310\n91#4:346\n456#5,8:321\n464#5,3:335\n467#5,3:343\n4144#6,6:329\n76#7:340\n76#7:342\n*S KotlinDebug\n*F\n+ 1 TopAppBar.kt\ncom/bbva/ui/compose/TopAppBarKt$ActionItem$1\n*L\n212#1:303\n222#1:339\n227#1:341\n210#1:304,6\n210#1:338\n210#1:347\n210#1:310,11\n210#1:346\n210#1:321,8\n210#1:335,3\n210#1:343,3\n210#1:329,6\n225#1:340\n234#1:342\n*E\n"})
    public static final class a extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f37232p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Indication f37233q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f37234r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f37235s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f37236t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MutableInteractionSource mutableInteractionSource, Indication indication, Function0<Unit> function0, int i10, int i11) {
            super(3);
            this.f37232p0 = mutableInteractionSource;
            this.f37233q0 = indication;
            this.f37234r0 = function0;
            this.f37235s0 = i10;
            this.f37236t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            BoxScope TopAppBarItemContainer = boxScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(TopAppBarItemContainer, "$this$TopAppBarItemContainer");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1915211287, iIntValue, -1, "com.bbva.ui.compose.ActionItem.<anonymous> (TopAppBar.kt:209)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM146clickableO2vRcR0$default = ClickableKt.m146clickableO2vRcR0$default(SemanticsModifierKt.semantics$default(SizeKt.m340width3ABfNKs(companion, Dp.m4389constructorimpl(48)), false, com.bbva.ui.compose.h.f37301p0, 1, null), this.f37232p0, this.f37233q0, false, null, null, this.f37234r0, 28, null);
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM146clickableO2vRcR0$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyColumnMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
                if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                IconKt.m780Iconww6aTOc(PainterResources_androidKt.painterResource(this.f37235s0, composer2, 0), (String) null, SizeKt.m335size3ABfNKs(companion, Dp.m4389constructorimpl(24)), ((Color) composer2.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), composer2, 440, 0);
                SpacerKt.Spacer(SizeKt.m335size3ABfNKs(companion, Dp.m4389constructorimpl(2)), composer2, 6);
                TextKt.m879Text4IGK_g(StringResources_androidKt.stringResource(this.f37236t0, composer2, 0), (Modifier) null, ((Color) composer2.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), TextUnitKt.getSp(10), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4289boximpl(TextAlign.INSTANCE.m4296getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m4344getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 3120, 120306);
                if (y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TopAppBar.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f37237p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f37238q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f37239r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f37240s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f37241t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f37242u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Modifier modifier, int i10, int i11, Function0<Unit> function0, int i12, int i13) {
            super(2);
            this.f37237p0 = modifier;
            this.f37238q0 = i10;
            this.f37239r0 = i11;
            this.f37240s0 = function0;
            this.f37241t0 = i12;
            this.f37242u0 = i13;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TopAppBarKt.a(this.f37237p0, this.f37238q0, this.f37239r0, this.f37240s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37241t0 | 1), this.f37242u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TopAppBar.kt */
    @SourceDebugExtension({"SMAP\nTopAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopAppBar.kt\ncom/bbva/ui/compose/TopAppBarKt$TopAppBar$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,302:1\n72#2,7:303\n79#2:338\n83#2:346\n78#3,11:310\n91#3:345\n456#4,8:321\n464#4,3:335\n467#4,3:342\n4144#5,6:329\n154#6:339\n154#6:341\n76#7:340\n*S KotlinDebug\n*F\n+ 1 TopAppBar.kt\ncom/bbva/ui/compose/TopAppBarKt$TopAppBar$1\n*L\n77#1:303,7\n77#1:338\n77#1:346\n77#1:310,11\n77#1:345\n77#1:321,8\n77#1:335,3\n77#1:342,3\n77#1:329,6\n79#1:339\n84#1:341\n82#1:340\n*E\n"})
    public static final class c extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Integer f37243p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f37244q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, Integer num) {
            super(3);
            this.f37243p0 = num;
            this.f37244q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            BoxScope TopAppBar = boxScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1589575938, iIntValue, -1, "com.bbva.ui.compose.TopAppBar.<anonymous> (TopAppBar.kt:73)");
                }
                int i10 = this.f37244q0;
                Integer num2 = this.f37243p0;
                if (num2 == null) {
                    composer2.startReplaceableGroup(734670503);
                    TopAppBarKt.access$TitleComponent(i10, composer2, 0);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(734670567);
                    composer2.startReplaceableGroup(693286680);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                    Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyRowMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
                    if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    IconKt.m780Iconww6aTOc(PainterResources_androidKt.painterResource(num2.intValue(), composer2, 0), (String) null, SizeKt.m335size3ABfNKs(companion, Dp.m4389constructorimpl(24)), ((Color) composer2.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), composer2, 440, 0);
                    SpacerKt.Spacer(SizeKt.m335size3ABfNKs(companion, Dp.m4389constructorimpl(8)), composer2, 6);
                    TopAppBarKt.access$TitleComponent(i10, composer2, 0);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TopAppBar.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f37245p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f37246q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Integer f37247r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f37248s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ float f37249t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ List<TopAppBarItem> f37250u0;
        public final /* synthetic */ StatusNotificationState v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f37251w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f37252x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f37253y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f6, int i10, int i11, int i12, long j10, Modifier modifier, StatusNotificationState statusNotificationState, Integer num, List list, Function0 function0, Function0 function1) {
            super(2);
            this.f37245p0 = modifier;
            this.f37246q0 = i10;
            this.f37247r0 = num;
            this.f37248s0 = j10;
            this.f37249t0 = f6;
            this.f37250u0 = list;
            this.v0 = statusNotificationState;
            this.f37251w0 = function0;
            this.f37252x0 = function1;
            this.f37253y0 = i11;
            this.E0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TopAppBarKt.m4984TopAppBargF0flNs(this.f37245p0, this.f37246q0, this.f37247r0, this.f37248s0, this.f37249t0, this.f37250u0, this.v0, this.f37251w0, this.f37252x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37253y0 | 1), this.E0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TopAppBar.kt */
    @SourceDebugExtension({"SMAP\nTopAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopAppBar.kt\ncom/bbva/ui/compose/TopAppBarKt$TopAppBar$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n154#2:303\n76#3:304\n1#4:305\n*S KotlinDebug\n*F\n+ 1 TopAppBar.kt\ncom/bbva/ui/compose/TopAppBarKt$TopAppBar$3\n*L\n114#1:303\n116#1:304\n*E\n"})
    public static final class e extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f37254p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Integer f37255q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i10, Integer num) {
            super(3);
            this.f37254p0 = i10;
            this.f37255q0 = num;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) throws XmlPullParserException {
            BoxScope TopAppBar = boxScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1314098334, iIntValue, -1, "com.bbva.ui.compose.TopAppBar.<anonymous> (TopAppBar.kt:112)");
                }
                Modifier modifierM321height3ABfNKs = SizeKt.m321height3ABfNKs(Modifier.INSTANCE, Dp.m4389constructorimpl(20));
                Painter painterPainterResource = PainterResources_androidKt.painterResource(this.f37254p0, composer2, 0);
                ColorFilter colorFilterM2549tintxETnrds$default = ColorFilter.Companion.m2549tintxETnrds$default(ColorFilter.INSTANCE, ((Color) composer2.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), 0, 2, null);
                composer2.startReplaceableGroup(734672110);
                Integer num2 = this.f37255q0;
                String strStringResource = num2 == null ? null : StringResources_androidKt.stringResource(num2.intValue(), composer2, 0);
                composer2.endReplaceableGroup();
                ImageKt.Image(painterPainterResource, strStringResource, modifierM321height3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, colorFilterM2549tintxETnrds$default, composer2, 392, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TopAppBar.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f37256p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f37257q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Integer f37258r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f37259s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ List<TopAppBarItem> f37260t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ float f37261u0;
        public final /* synthetic */ StatusNotificationState v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f37262w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f37263x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f37264y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(float f6, int i10, int i11, int i12, long j10, Modifier modifier, StatusNotificationState statusNotificationState, Integer num, List list, Function0 function0, Function0 function1) {
            super(2);
            this.f37256p0 = modifier;
            this.f37257q0 = i10;
            this.f37258r0 = num;
            this.f37259s0 = j10;
            this.f37260t0 = list;
            this.f37261u0 = f6;
            this.v0 = statusNotificationState;
            this.f37262w0 = function0;
            this.f37263x0 = function1;
            this.f37264y0 = i11;
            this.E0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TopAppBarKt.m4985TopAppBargF0flNs(this.f37256p0, this.f37257q0, this.f37258r0, this.f37259s0, this.f37260t0, this.f37261u0, this.v0, this.f37262w0, this.f37263x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37264y0 | 1), this.E0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TopAppBar.kt */
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f37265p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0<Unit> function0) {
            super(2);
            this.f37265p0 = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(323833962, iIntValue, -1, "com.bbva.ui.compose.TopAppBar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TopAppBar.kt:154)");
                }
                TopAppBarKt.access$NavigationIcon(this.f37265p0, composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TopAppBar.kt */
    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<BoxScope, Composer, Integer, Unit> f37266p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f37266p0 = function3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(949810165, iIntValue, -1, "com.bbva.ui.compose.TopAppBar.<anonymous>.<anonymous>.<anonymous> (TopAppBar.kt:156)");
                }
                TopAppBarKt.TopAppBarItemContainer(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), this.f37266p0, composer2, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TopAppBar.kt */
    @SourceDebugExtension({"SMAP\nTopAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopAppBar.kt\ncom/bbva/ui/compose/TopAppBarKt$TopAppBar$5$1$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,302:1\n1549#2:303\n1620#2,3:304\n*S KotlinDebug\n*F\n+ 1 TopAppBar.kt\ncom/bbva/ui/compose/TopAppBarKt$TopAppBar$5$1$3\n*L\n163#1:303\n163#1:304,3\n*E\n"})
    public static final class i extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ List<TopAppBarItem> f37267p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f37268q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(List<TopAppBarItem> list, Function0<Unit> function0) {
            super(3);
            this.f37267p0 = list;
            this.f37268q0 = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope TopAppBar = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1673182816, iIntValue, -1, "com.bbva.ui.compose.TopAppBar.<anonymous>.<anonymous>.<anonymous> (TopAppBar.kt:162)");
                }
                composer2.startReplaceableGroup(-342996808);
                List<TopAppBarItem> list = this.f37267p0;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (TopAppBarItem topAppBarItem : list) {
                    TopAppBarKt.a(null, topAppBarItem.getTextResId(), topAppBarItem.getIconResId(), topAppBarItem.getOnClick(), composer2, 0, 1);
                    arrayList.add(Unit.INSTANCE);
                }
                composer2.endReplaceableGroup();
                Function0<Unit> function0 = this.f37268q0;
                Unit unit = null;
                if (function0 != null) {
                    TopAppBarKt.a(SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, com.bbva.ui.compose.i.f37302p0, 1, null), R.string.ui_close, R.drawable.ic_cross, function0, composer2, 0, 0);
                    unit = Unit.INSTANCE;
                }
                CollectionsKt___CollectionsKt.plus((Collection<? extends Unit>) arrayList, unit);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TopAppBar.kt */
    public static final class j extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f37269p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function3<BoxScope, Composer, Integer, Unit> f37270q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f37271r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f37272s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ List<TopAppBarItem> f37273t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ StatusNotificationState f37274u0;
        public final /* synthetic */ Function0<Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f37275w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f37276x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f37277y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(Modifier modifier, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, long j10, float f6, List<TopAppBarItem> list, StatusNotificationState statusNotificationState, Function0<Unit> function0, Function0<Unit> function1, int i10, int i11) {
            super(2);
            this.f37269p0 = modifier;
            this.f37270q0 = function3;
            this.f37271r0 = j10;
            this.f37272s0 = f6;
            this.f37273t0 = list;
            this.f37274u0 = statusNotificationState;
            this.v0 = function0;
            this.f37275w0 = function1;
            this.f37276x0 = i10;
            this.f37277y0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TopAppBarKt.m4986TopAppBarlVb_Clg(this.f37269p0, this.f37270q0, this.f37271r0, this.f37272s0, this.f37273t0, this.f37274u0, this.v0, this.f37275w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37276x0 | 1), this.f37277y0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TopAppBar.kt */
    public static final class k extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f37278p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function3<BoxScope, Composer, Integer, Unit> f37279q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f37280r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f37281s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(Modifier modifier, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f37278p0 = modifier;
            this.f37279q0 = function3;
            this.f37280r0 = i10;
            this.f37281s0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f37280r0 | 1);
            TopAppBarKt.TopAppBarItemContainer(this.f37278p0, this.f37279q0, composer, iUpdateChangedFlags, this.f37281s0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0151 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0153  */
    /* JADX WARN: Code duplicated, block: B:111:0x0156  */
    /* JADX WARN: Code duplicated, block: B:114:0x015b  */
    /* JADX WARN: Code duplicated, block: B:115:0x015d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0163  */
    /* JADX WARN: Code duplicated, block: B:120:0x0172  */
    /* JADX WARN: Code duplicated, block: B:121:0x0174  */
    /* JADX WARN: Code duplicated, block: B:123:0x0177  */
    /* JADX WARN: Code duplicated, block: B:124:0x017c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0182  */
    /* JADX WARN: Code duplicated, block: B:128:0x019f  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:138:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:141:0x0213  */
    /* JADX WARN: Code duplicated, block: B:145:0x0229  */
    /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00df  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:97:0x0120  */
    /* JADX WARN: Code duplicated, block: B:99:0x012a  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: TopAppBar-gF0flNs, reason: not valid java name */
    public static final void m4984TopAppBargF0flNs(@Nullable Modifier modifier, @StringRes int i10, @DrawableRes @Nullable Integer num, long j10, float f6, @Nullable List<TopAppBarItem> list, @Nullable StatusNotificationState statusNotificationState, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable Composer composer, int i11, int i12) {
        int i13;
        long jM5104getToolBar0d7_KjU;
        int i14;
        float f10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Modifier modifier2;
        Integer num2;
        float f11;
        List<TopAppBarItem> listEmptyList;
        StatusNotificationState statusNotificationState2;
        Function0<Unit> function2;
        Function0<Unit> function3;
        Function0<Unit> function4;
        long j11;
        float f12;
        List<TopAppBarItem> list2;
        StatusNotificationState statusNotificationState3;
        Integer num3;
        Modifier modifier3;
        Integer num4;
        long j12;
        List<TopAppBarItem> list3;
        StatusNotificationState statusNotificationState4;
        Function0<Unit> function5;
        Function0<Unit> function6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i21;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1430037786);
        int i22 = i12 & 1;
        if (i22 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= composerStartRestartGroup.changed(i10) ? 32 : 16;
        }
        int i23 = i12 & 4;
        if (i23 == 0) {
            if ((i11 & 896) == 0) {
                i13 |= composerStartRestartGroup.changed(num) ? 256 : 128;
            }
            if ((i11 & 7168) == 0) {
                if ((i12 & 8) == 0) {
                    jM5104getToolBar0d7_KjU = j10;
                    int i24 = composerStartRestartGroup.changed(jM5104getToolBar0d7_KjU) ? 2048 : 1024;
                    i13 |= i24;
                } else {
                    jM5104getToolBar0d7_KjU = j10;
                }
                i13 |= i24;
            } else {
                jM5104getToolBar0d7_KjU = j10;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                if ((57344 & i11) == 0) {
                    f10 = f6;
                    if (composerStartRestartGroup.changed(f10)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    i13 |= 65536;
                }
                if ((i11 & 3670016) != 0) {
                    if ((i12 & 64) == 0 || !composerStartRestartGroup.changed(statusNotificationState)) {
                        i21 = 524288;
                    } else {
                        i21 = 1048576;
                    }
                    i13 |= i21;
                }
                i17 = i12 & 128;
                if (i17 != 0) {
                    i13 |= 12582912;
                } else if ((i11 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 256;
                if (i19 != 0) {
                    if ((i11 & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i20 = 33554432;
                        }
                    }
                    if (i16 != 32 && (191739611 & i13) == 38347922 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        num4 = num;
                        list3 = list;
                        statusNotificationState4 = statusNotificationState;
                        j12 = jM5104getToolBar0d7_KjU;
                        f12 = f10;
                        function5 = function0;
                        function6 = function1;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i23 != 0) {
                                num2 = null;
                            } else {
                                num2 = num;
                            }
                            if ((i12 & 8) != 0) {
                                jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                                i13 &= -7169;
                            }
                            if (i14 != 0) {
                                f11 = 0.0f;
                            } else {
                                f11 = f10;
                            }
                            if (i16 != 0) {
                                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                            } else {
                                listEmptyList = list;
                            }
                            if ((i12 & 64) != 0) {
                                statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                                i13 &= -3670017;
                            } else {
                                statusNotificationState2 = statusNotificationState;
                            }
                            if (i17 != 0) {
                                function2 = null;
                            } else {
                                function2 = function0;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function1;
                            }
                            function4 = function2;
                            j11 = jM5104getToolBar0d7_KjU;
                            f12 = f11;
                            list2 = listEmptyList;
                            statusNotificationState3 = statusNotificationState2;
                            num3 = num2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i12 & 8) != 0) {
                                i13 &= -7169;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                            }
                            modifier2 = modifier;
                            num3 = num;
                            list2 = list;
                            statusNotificationState3 = statusNotificationState;
                            function4 = function0;
                            function3 = function1;
                            j11 = jM5104getToolBar0d7_KjU;
                            f12 = f10;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1430037786, i13, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:69)");
                        }
                        int i25 = 32816 | (i13 & 14);
                        int i26 = i13 >> 3;
                        Integer num5 = num3;
                        m4986TopAppBarlVb_Clg(modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1589575938, true, new c(i10, num3)), j11, f12, list2, statusNotificationState3, function4, function3, composerStartRestartGroup, i25 | (i26 & 896) | (i26 & 7168) | (458752 & i26) | (i26 & 3670016) | (i26 & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        num4 = num5;
                        j12 = j11;
                        list3 = list2;
                        statusNotificationState4 = statusNotificationState3;
                        function5 = function4;
                        function6 = function3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new d(f12, i10, i11, i12, j12, modifier3, statusNotificationState4, num4, list3, function5, function6));
                    }
                }
                i20 = 100663296;
                i13 |= i20;
                if (i16 != 32) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i23 != 0) {
                            num2 = null;
                        } else {
                            num2 = num;
                        }
                        if ((i12 & 8) != 0) {
                            jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f10;
                        }
                        if (i16 != 0) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if ((i12 & 64) != 0) {
                            statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                            i13 &= -3670017;
                        } else {
                            statusNotificationState2 = statusNotificationState;
                        }
                        if (i17 != 0) {
                            function2 = null;
                        } else {
                            function2 = function0;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        function4 = function2;
                        j11 = jM5104getToolBar0d7_KjU;
                        f12 = f11;
                        list2 = listEmptyList;
                        statusNotificationState3 = statusNotificationState2;
                        num3 = num2;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i23 != 0) {
                            num2 = null;
                        } else {
                            num2 = num;
                        }
                        if ((i12 & 8) != 0) {
                            jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f10;
                        }
                        if (i16 != 0) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if ((i12 & 64) != 0) {
                            statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                            i13 &= -3670017;
                        } else {
                            statusNotificationState2 = statusNotificationState;
                        }
                        if (i17 != 0) {
                            function2 = null;
                        } else {
                            function2 = function0;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        function4 = function2;
                        j11 = jM5104getToolBar0d7_KjU;
                        f12 = f11;
                        list2 = listEmptyList;
                        statusNotificationState3 = statusNotificationState2;
                        num3 = num2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1430037786, i13, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:69)");
                    }
                    int i27 = 32816 | (i13 & 14);
                    int i28 = i13 >> 3;
                    Integer num6 = num3;
                    m4986TopAppBarlVb_Clg(modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1589575938, true, new c(i10, num3)), j11, f12, list2, statusNotificationState3, function4, function3, composerStartRestartGroup, i27 | (i28 & 896) | (i28 & 7168) | (458752 & i28) | (i28 & 3670016) | (i28 & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    num4 = num6;
                    j12 = j11;
                    list3 = list2;
                    statusNotificationState4 = statusNotificationState3;
                    function5 = function4;
                    function6 = function3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i23 != 0) {
                            num2 = null;
                        } else {
                            num2 = num;
                        }
                        if ((i12 & 8) != 0) {
                            jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f10;
                        }
                        if (i16 != 0) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if ((i12 & 64) != 0) {
                            statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                            i13 &= -3670017;
                        } else {
                            statusNotificationState2 = statusNotificationState;
                        }
                        if (i17 != 0) {
                            function2 = null;
                        } else {
                            function2 = function0;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        function4 = function2;
                        j11 = jM5104getToolBar0d7_KjU;
                        f12 = f11;
                        list2 = listEmptyList;
                        statusNotificationState3 = statusNotificationState2;
                        num3 = num2;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i23 != 0) {
                            num2 = null;
                        } else {
                            num2 = num;
                        }
                        if ((i12 & 8) != 0) {
                            jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f10;
                        }
                        if (i16 != 0) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if ((i12 & 64) != 0) {
                            statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                            i13 &= -3670017;
                        } else {
                            statusNotificationState2 = statusNotificationState;
                        }
                        if (i17 != 0) {
                            function2 = null;
                        } else {
                            function2 = function0;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        function4 = function2;
                        j11 = jM5104getToolBar0d7_KjU;
                        f12 = f11;
                        list2 = listEmptyList;
                        statusNotificationState3 = statusNotificationState2;
                        num3 = num2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1430037786, i13, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:69)");
                    }
                    int i29 = 32816 | (i13 & 14);
                    int i210 = i13 >> 3;
                    Integer num7 = num3;
                    m4986TopAppBarlVb_Clg(modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1589575938, true, new c(i10, num3)), j11, f12, list2, statusNotificationState3, function4, function3, composerStartRestartGroup, i29 | (i210 & 896) | (i210 & 7168) | (458752 & i210) | (i210 & 3670016) | (i210 & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    num4 = num7;
                    j12 = j11;
                    list3 = list2;
                    statusNotificationState4 = statusNotificationState3;
                    function5 = function4;
                    function6 = function3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(f12, i10, i11, i12, j12, modifier3, statusNotificationState4, num4, list3, function5, function6));
                }
            }
            i13 |= 24576;
            f10 = f6;
            i16 = i12 & 32;
            if (i16 != 0) {
                i13 |= 65536;
            }
            if ((i11 & 3670016) != 0) {
                if ((i12 & 64) == 0) {
                    i21 = 524288;
                } else {
                    i21 = 524288;
                }
                i13 |= i21;
            }
            i17 = i12 & 128;
            if (i17 != 0) {
                i13 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i13 |= i18;
            }
            i19 = i12 & 256;
            if (i19 != 0) {
                if ((i11 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i20 = 33554432;
                    }
                }
                if (i16 != 32) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i23 != 0) {
                            num2 = null;
                        } else {
                            num2 = num;
                        }
                        if ((i12 & 8) != 0) {
                            jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f10;
                        }
                        if (i16 != 0) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if ((i12 & 64) != 0) {
                            statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                            i13 &= -3670017;
                        } else {
                            statusNotificationState2 = statusNotificationState;
                        }
                        if (i17 != 0) {
                            function2 = null;
                        } else {
                            function2 = function0;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        function4 = function2;
                        j11 = jM5104getToolBar0d7_KjU;
                        f12 = f11;
                        list2 = listEmptyList;
                        statusNotificationState3 = statusNotificationState2;
                        num3 = num2;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i23 != 0) {
                            num2 = null;
                        } else {
                            num2 = num;
                        }
                        if ((i12 & 8) != 0) {
                            jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f10;
                        }
                        if (i16 != 0) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if ((i12 & 64) != 0) {
                            statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                            i13 &= -3670017;
                        } else {
                            statusNotificationState2 = statusNotificationState;
                        }
                        if (i17 != 0) {
                            function2 = null;
                        } else {
                            function2 = function0;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        function4 = function2;
                        j11 = jM5104getToolBar0d7_KjU;
                        f12 = f11;
                        list2 = listEmptyList;
                        statusNotificationState3 = statusNotificationState2;
                        num3 = num2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1430037786, i13, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:69)");
                    }
                    int i211 = 32816 | (i13 & 14);
                    int i212 = i13 >> 3;
                    Integer num8 = num3;
                    m4986TopAppBarlVb_Clg(modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1589575938, true, new c(i10, num3)), j11, f12, list2, statusNotificationState3, function4, function3, composerStartRestartGroup, i211 | (i212 & 896) | (i212 & 7168) | (458752 & i212) | (i212 & 3670016) | (i212 & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    num4 = num8;
                    j12 = j11;
                    list3 = list2;
                    statusNotificationState4 = statusNotificationState3;
                    function5 = function4;
                    function6 = function3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i23 != 0) {
                            num2 = null;
                        } else {
                            num2 = num;
                        }
                        if ((i12 & 8) != 0) {
                            jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f10;
                        }
                        if (i16 != 0) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if ((i12 & 64) != 0) {
                            statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                            i13 &= -3670017;
                        } else {
                            statusNotificationState2 = statusNotificationState;
                        }
                        if (i17 != 0) {
                            function2 = null;
                        } else {
                            function2 = function0;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        function4 = function2;
                        j11 = jM5104getToolBar0d7_KjU;
                        f12 = f11;
                        list2 = listEmptyList;
                        statusNotificationState3 = statusNotificationState2;
                        num3 = num2;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i23 != 0) {
                            num2 = null;
                        } else {
                            num2 = num;
                        }
                        if ((i12 & 8) != 0) {
                            jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f10;
                        }
                        if (i16 != 0) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if ((i12 & 64) != 0) {
                            statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                            i13 &= -3670017;
                        } else {
                            statusNotificationState2 = statusNotificationState;
                        }
                        if (i17 != 0) {
                            function2 = null;
                        } else {
                            function2 = function0;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        function4 = function2;
                        j11 = jM5104getToolBar0d7_KjU;
                        f12 = f11;
                        list2 = listEmptyList;
                        statusNotificationState3 = statusNotificationState2;
                        num3 = num2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1430037786, i13, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:69)");
                    }
                    int i213 = 32816 | (i13 & 14);
                    int i214 = i13 >> 3;
                    Integer num9 = num3;
                    m4986TopAppBarlVb_Clg(modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1589575938, true, new c(i10, num3)), j11, f12, list2, statusNotificationState3, function4, function3, composerStartRestartGroup, i213 | (i214 & 896) | (i214 & 7168) | (458752 & i214) | (i214 & 3670016) | (i214 & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    num4 = num9;
                    j12 = j11;
                    list3 = list2;
                    statusNotificationState4 = statusNotificationState3;
                    function5 = function4;
                    function6 = function3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(f12, i10, i11, i12, j12, modifier3, statusNotificationState4, num4, list3, function5, function6));
                }
            }
            i20 = 100663296;
            i13 |= i20;
            if (i16 != 32) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i23 != 0) {
                        num2 = null;
                    } else {
                        num2 = num;
                    }
                    if ((i12 & 8) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f10;
                    }
                    if (i16 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if ((i12 & 64) != 0) {
                        statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                        i13 &= -3670017;
                    } else {
                        statusNotificationState2 = statusNotificationState;
                    }
                    if (i17 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    function4 = function2;
                    j11 = jM5104getToolBar0d7_KjU;
                    f12 = f11;
                    list2 = listEmptyList;
                    statusNotificationState3 = statusNotificationState2;
                    num3 = num2;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i23 != 0) {
                        num2 = null;
                    } else {
                        num2 = num;
                    }
                    if ((i12 & 8) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f10;
                    }
                    if (i16 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if ((i12 & 64) != 0) {
                        statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                        i13 &= -3670017;
                    } else {
                        statusNotificationState2 = statusNotificationState;
                    }
                    if (i17 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    function4 = function2;
                    j11 = jM5104getToolBar0d7_KjU;
                    f12 = f11;
                    list2 = listEmptyList;
                    statusNotificationState3 = statusNotificationState2;
                    num3 = num2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1430037786, i13, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:69)");
                }
                int i215 = 32816 | (i13 & 14);
                int i216 = i13 >> 3;
                Integer num10 = num3;
                m4986TopAppBarlVb_Clg(modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1589575938, true, new c(i10, num3)), j11, f12, list2, statusNotificationState3, function4, function3, composerStartRestartGroup, i215 | (i216 & 896) | (i216 & 7168) | (458752 & i216) | (i216 & 3670016) | (i216 & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                num4 = num10;
                j12 = j11;
                list3 = list2;
                statusNotificationState4 = statusNotificationState3;
                function5 = function4;
                function6 = function3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i23 != 0) {
                        num2 = null;
                    } else {
                        num2 = num;
                    }
                    if ((i12 & 8) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f10;
                    }
                    if (i16 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if ((i12 & 64) != 0) {
                        statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                        i13 &= -3670017;
                    } else {
                        statusNotificationState2 = statusNotificationState;
                    }
                    if (i17 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    function4 = function2;
                    j11 = jM5104getToolBar0d7_KjU;
                    f12 = f11;
                    list2 = listEmptyList;
                    statusNotificationState3 = statusNotificationState2;
                    num3 = num2;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i23 != 0) {
                        num2 = null;
                    } else {
                        num2 = num;
                    }
                    if ((i12 & 8) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f10;
                    }
                    if (i16 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if ((i12 & 64) != 0) {
                        statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                        i13 &= -3670017;
                    } else {
                        statusNotificationState2 = statusNotificationState;
                    }
                    if (i17 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    function4 = function2;
                    j11 = jM5104getToolBar0d7_KjU;
                    f12 = f11;
                    list2 = listEmptyList;
                    statusNotificationState3 = statusNotificationState2;
                    num3 = num2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1430037786, i13, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:69)");
                }
                int i217 = 32816 | (i13 & 14);
                int i218 = i13 >> 3;
                Integer num11 = num3;
                m4986TopAppBarlVb_Clg(modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1589575938, true, new c(i10, num3)), j11, f12, list2, statusNotificationState3, function4, function3, composerStartRestartGroup, i217 | (i218 & 896) | (i218 & 7168) | (458752 & i218) | (i218 & 3670016) | (i218 & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                num4 = num11;
                j12 = j11;
                list3 = list2;
                statusNotificationState4 = statusNotificationState3;
                function5 = function4;
                function6 = function3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new d(f12, i10, i11, i12, j12, modifier3, statusNotificationState4, num4, list3, function5, function6));
            }
        }
        i13 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        if ((i11 & 7168) == 0) {
            if ((i12 & 8) == 0) {
                jM5104getToolBar0d7_KjU = j10;
                if (composerStartRestartGroup.changed(jM5104getToolBar0d7_KjU)) {
                }
                i13 |= i24;
            } else {
                jM5104getToolBar0d7_KjU = j10;
            }
            i13 |= i24;
        } else {
            jM5104getToolBar0d7_KjU = j10;
        }
        i14 = i12 & 16;
        if (i14 != 0) {
            if ((57344 & i11) == 0) {
                f10 = f6;
                if (composerStartRestartGroup.changed(f10)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                i13 |= 65536;
            }
            if ((i11 & 3670016) != 0) {
                if ((i12 & 64) == 0) {
                    i21 = 524288;
                } else {
                    i21 = 524288;
                }
                i13 |= i21;
            }
            i17 = i12 & 128;
            if (i17 != 0) {
                i13 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i13 |= i18;
            }
            i19 = i12 & 256;
            if (i19 != 0) {
                if ((i11 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i20 = 33554432;
                    }
                }
                if (i16 != 32) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i23 != 0) {
                            num2 = null;
                        } else {
                            num2 = num;
                        }
                        if ((i12 & 8) != 0) {
                            jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f10;
                        }
                        if (i16 != 0) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if ((i12 & 64) != 0) {
                            statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                            i13 &= -3670017;
                        } else {
                            statusNotificationState2 = statusNotificationState;
                        }
                        if (i17 != 0) {
                            function2 = null;
                        } else {
                            function2 = function0;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        function4 = function2;
                        j11 = jM5104getToolBar0d7_KjU;
                        f12 = f11;
                        list2 = listEmptyList;
                        statusNotificationState3 = statusNotificationState2;
                        num3 = num2;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i23 != 0) {
                            num2 = null;
                        } else {
                            num2 = num;
                        }
                        if ((i12 & 8) != 0) {
                            jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f10;
                        }
                        if (i16 != 0) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if ((i12 & 64) != 0) {
                            statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                            i13 &= -3670017;
                        } else {
                            statusNotificationState2 = statusNotificationState;
                        }
                        if (i17 != 0) {
                            function2 = null;
                        } else {
                            function2 = function0;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        function4 = function2;
                        j11 = jM5104getToolBar0d7_KjU;
                        f12 = f11;
                        list2 = listEmptyList;
                        statusNotificationState3 = statusNotificationState2;
                        num3 = num2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1430037786, i13, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:69)");
                    }
                    int i219 = 32816 | (i13 & 14);
                    int i2110 = i13 >> 3;
                    Integer num12 = num3;
                    m4986TopAppBarlVb_Clg(modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1589575938, true, new c(i10, num3)), j11, f12, list2, statusNotificationState3, function4, function3, composerStartRestartGroup, i219 | (i2110 & 896) | (i2110 & 7168) | (458752 & i2110) | (i2110 & 3670016) | (i2110 & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    num4 = num12;
                    j12 = j11;
                    list3 = list2;
                    statusNotificationState4 = statusNotificationState3;
                    function5 = function4;
                    function6 = function3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i23 != 0) {
                            num2 = null;
                        } else {
                            num2 = num;
                        }
                        if ((i12 & 8) != 0) {
                            jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f10;
                        }
                        if (i16 != 0) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if ((i12 & 64) != 0) {
                            statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                            i13 &= -3670017;
                        } else {
                            statusNotificationState2 = statusNotificationState;
                        }
                        if (i17 != 0) {
                            function2 = null;
                        } else {
                            function2 = function0;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        function4 = function2;
                        j11 = jM5104getToolBar0d7_KjU;
                        f12 = f11;
                        list2 = listEmptyList;
                        statusNotificationState3 = statusNotificationState2;
                        num3 = num2;
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i23 != 0) {
                            num2 = null;
                        } else {
                            num2 = num;
                        }
                        if ((i12 & 8) != 0) {
                            jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f10;
                        }
                        if (i16 != 0) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if ((i12 & 64) != 0) {
                            statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                            i13 &= -3670017;
                        } else {
                            statusNotificationState2 = statusNotificationState;
                        }
                        if (i17 != 0) {
                            function2 = null;
                        } else {
                            function2 = function0;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        function4 = function2;
                        j11 = jM5104getToolBar0d7_KjU;
                        f12 = f11;
                        list2 = listEmptyList;
                        statusNotificationState3 = statusNotificationState2;
                        num3 = num2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1430037786, i13, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:69)");
                    }
                    int i2111 = 32816 | (i13 & 14);
                    int i2112 = i13 >> 3;
                    Integer num13 = num3;
                    m4986TopAppBarlVb_Clg(modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1589575938, true, new c(i10, num3)), j11, f12, list2, statusNotificationState3, function4, function3, composerStartRestartGroup, i2111 | (i2112 & 896) | (i2112 & 7168) | (458752 & i2112) | (i2112 & 3670016) | (i2112 & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    num4 = num13;
                    j12 = j11;
                    list3 = list2;
                    statusNotificationState4 = statusNotificationState3;
                    function5 = function4;
                    function6 = function3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(f12, i10, i11, i12, j12, modifier3, statusNotificationState4, num4, list3, function5, function6));
                }
            }
            i20 = 100663296;
            i13 |= i20;
            if (i16 != 32) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i23 != 0) {
                        num2 = null;
                    } else {
                        num2 = num;
                    }
                    if ((i12 & 8) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f10;
                    }
                    if (i16 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if ((i12 & 64) != 0) {
                        statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                        i13 &= -3670017;
                    } else {
                        statusNotificationState2 = statusNotificationState;
                    }
                    if (i17 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    function4 = function2;
                    j11 = jM5104getToolBar0d7_KjU;
                    f12 = f11;
                    list2 = listEmptyList;
                    statusNotificationState3 = statusNotificationState2;
                    num3 = num2;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i23 != 0) {
                        num2 = null;
                    } else {
                        num2 = num;
                    }
                    if ((i12 & 8) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f10;
                    }
                    if (i16 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if ((i12 & 64) != 0) {
                        statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                        i13 &= -3670017;
                    } else {
                        statusNotificationState2 = statusNotificationState;
                    }
                    if (i17 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    function4 = function2;
                    j11 = jM5104getToolBar0d7_KjU;
                    f12 = f11;
                    list2 = listEmptyList;
                    statusNotificationState3 = statusNotificationState2;
                    num3 = num2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1430037786, i13, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:69)");
                }
                int i2113 = 32816 | (i13 & 14);
                int i2114 = i13 >> 3;
                Integer num14 = num3;
                m4986TopAppBarlVb_Clg(modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1589575938, true, new c(i10, num3)), j11, f12, list2, statusNotificationState3, function4, function3, composerStartRestartGroup, i2113 | (i2114 & 896) | (i2114 & 7168) | (458752 & i2114) | (i2114 & 3670016) | (i2114 & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                num4 = num14;
                j12 = j11;
                list3 = list2;
                statusNotificationState4 = statusNotificationState3;
                function5 = function4;
                function6 = function3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i23 != 0) {
                        num2 = null;
                    } else {
                        num2 = num;
                    }
                    if ((i12 & 8) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f10;
                    }
                    if (i16 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if ((i12 & 64) != 0) {
                        statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                        i13 &= -3670017;
                    } else {
                        statusNotificationState2 = statusNotificationState;
                    }
                    if (i17 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    function4 = function2;
                    j11 = jM5104getToolBar0d7_KjU;
                    f12 = f11;
                    list2 = listEmptyList;
                    statusNotificationState3 = statusNotificationState2;
                    num3 = num2;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i23 != 0) {
                        num2 = null;
                    } else {
                        num2 = num;
                    }
                    if ((i12 & 8) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f10;
                    }
                    if (i16 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if ((i12 & 64) != 0) {
                        statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                        i13 &= -3670017;
                    } else {
                        statusNotificationState2 = statusNotificationState;
                    }
                    if (i17 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    function4 = function2;
                    j11 = jM5104getToolBar0d7_KjU;
                    f12 = f11;
                    list2 = listEmptyList;
                    statusNotificationState3 = statusNotificationState2;
                    num3 = num2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1430037786, i13, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:69)");
                }
                int i2115 = 32816 | (i13 & 14);
                int i2116 = i13 >> 3;
                Integer num15 = num3;
                m4986TopAppBarlVb_Clg(modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1589575938, true, new c(i10, num3)), j11, f12, list2, statusNotificationState3, function4, function3, composerStartRestartGroup, i2115 | (i2116 & 896) | (i2116 & 7168) | (458752 & i2116) | (i2116 & 3670016) | (i2116 & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                num4 = num15;
                j12 = j11;
                list3 = list2;
                statusNotificationState4 = statusNotificationState3;
                function5 = function4;
                function6 = function3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new d(f12, i10, i11, i12, j12, modifier3, statusNotificationState4, num4, list3, function5, function6));
            }
        }
        i13 |= 24576;
        f10 = f6;
        i16 = i12 & 32;
        if (i16 != 0) {
            i13 |= 65536;
        }
        if ((i11 & 3670016) != 0) {
            if ((i12 & 64) == 0) {
                i21 = 524288;
            } else {
                i21 = 524288;
            }
            i13 |= i21;
        }
        i17 = i12 & 128;
        if (i17 != 0) {
            i13 |= 12582912;
        } else if ((i11 & 29360128) == 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i13 |= i18;
        }
        i19 = i12 & 256;
        if (i19 != 0) {
            if ((i11 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i20 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i20 = 33554432;
                }
            }
            if (i16 != 32) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i23 != 0) {
                        num2 = null;
                    } else {
                        num2 = num;
                    }
                    if ((i12 & 8) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f10;
                    }
                    if (i16 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if ((i12 & 64) != 0) {
                        statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                        i13 &= -3670017;
                    } else {
                        statusNotificationState2 = statusNotificationState;
                    }
                    if (i17 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    function4 = function2;
                    j11 = jM5104getToolBar0d7_KjU;
                    f12 = f11;
                    list2 = listEmptyList;
                    statusNotificationState3 = statusNotificationState2;
                    num3 = num2;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i23 != 0) {
                        num2 = null;
                    } else {
                        num2 = num;
                    }
                    if ((i12 & 8) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f10;
                    }
                    if (i16 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if ((i12 & 64) != 0) {
                        statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                        i13 &= -3670017;
                    } else {
                        statusNotificationState2 = statusNotificationState;
                    }
                    if (i17 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    function4 = function2;
                    j11 = jM5104getToolBar0d7_KjU;
                    f12 = f11;
                    list2 = listEmptyList;
                    statusNotificationState3 = statusNotificationState2;
                    num3 = num2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1430037786, i13, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:69)");
                }
                int i2117 = 32816 | (i13 & 14);
                int i2118 = i13 >> 3;
                Integer num16 = num3;
                m4986TopAppBarlVb_Clg(modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1589575938, true, new c(i10, num3)), j11, f12, list2, statusNotificationState3, function4, function3, composerStartRestartGroup, i2117 | (i2118 & 896) | (i2118 & 7168) | (458752 & i2118) | (i2118 & 3670016) | (i2118 & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                num4 = num16;
                j12 = j11;
                list3 = list2;
                statusNotificationState4 = statusNotificationState3;
                function5 = function4;
                function6 = function3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i23 != 0) {
                        num2 = null;
                    } else {
                        num2 = num;
                    }
                    if ((i12 & 8) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f10;
                    }
                    if (i16 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if ((i12 & 64) != 0) {
                        statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                        i13 &= -3670017;
                    } else {
                        statusNotificationState2 = statusNotificationState;
                    }
                    if (i17 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    function4 = function2;
                    j11 = jM5104getToolBar0d7_KjU;
                    f12 = f11;
                    list2 = listEmptyList;
                    statusNotificationState3 = statusNotificationState2;
                    num3 = num2;
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i23 != 0) {
                        num2 = null;
                    } else {
                        num2 = num;
                    }
                    if ((i12 & 8) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f10;
                    }
                    if (i16 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if ((i12 & 64) != 0) {
                        statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                        i13 &= -3670017;
                    } else {
                        statusNotificationState2 = statusNotificationState;
                    }
                    if (i17 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    function4 = function2;
                    j11 = jM5104getToolBar0d7_KjU;
                    f12 = f11;
                    list2 = listEmptyList;
                    statusNotificationState3 = statusNotificationState2;
                    num3 = num2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1430037786, i13, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:69)");
                }
                int i2119 = 32816 | (i13 & 14);
                int i21110 = i13 >> 3;
                Integer num17 = num3;
                m4986TopAppBarlVb_Clg(modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1589575938, true, new c(i10, num3)), j11, f12, list2, statusNotificationState3, function4, function3, composerStartRestartGroup, i2119 | (i21110 & 896) | (i21110 & 7168) | (458752 & i21110) | (i21110 & 3670016) | (i21110 & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                num4 = num17;
                j12 = j11;
                list3 = list2;
                statusNotificationState4 = statusNotificationState3;
                function5 = function4;
                function6 = function3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new d(f12, i10, i11, i12, j12, modifier3, statusNotificationState4, num4, list3, function5, function6));
            }
        }
        i20 = 100663296;
        i13 |= i20;
        if (i16 != 32) {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i23 != 0) {
                    num2 = null;
                } else {
                    num2 = num;
                }
                if ((i12 & 8) != 0) {
                    jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    f11 = 0.0f;
                } else {
                    f11 = f10;
                }
                if (i16 != 0) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if ((i12 & 64) != 0) {
                    statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                    i13 &= -3670017;
                } else {
                    statusNotificationState2 = statusNotificationState;
                }
                if (i17 != 0) {
                    function2 = null;
                } else {
                    function2 = function0;
                }
                if (i19 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                function4 = function2;
                j11 = jM5104getToolBar0d7_KjU;
                f12 = f11;
                list2 = listEmptyList;
                statusNotificationState3 = statusNotificationState2;
                num3 = num2;
            } else {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i23 != 0) {
                    num2 = null;
                } else {
                    num2 = num;
                }
                if ((i12 & 8) != 0) {
                    jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    f11 = 0.0f;
                } else {
                    f11 = f10;
                }
                if (i16 != 0) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if ((i12 & 64) != 0) {
                    statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                    i13 &= -3670017;
                } else {
                    statusNotificationState2 = statusNotificationState;
                }
                if (i17 != 0) {
                    function2 = null;
                } else {
                    function2 = function0;
                }
                if (i19 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                function4 = function2;
                j11 = jM5104getToolBar0d7_KjU;
                f12 = f11;
                list2 = listEmptyList;
                statusNotificationState3 = statusNotificationState2;
                num3 = num2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1430037786, i13, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:69)");
            }
            int i21111 = 32816 | (i13 & 14);
            int i21112 = i13 >> 3;
            Integer num18 = num3;
            m4986TopAppBarlVb_Clg(modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1589575938, true, new c(i10, num3)), j11, f12, list2, statusNotificationState3, function4, function3, composerStartRestartGroup, i21111 | (i21112 & 896) | (i21112 & 7168) | (458752 & i21112) | (i21112 & 3670016) | (i21112 & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            num4 = num18;
            j12 = j11;
            list3 = list2;
            statusNotificationState4 = statusNotificationState3;
            function5 = function4;
            function6 = function3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i23 != 0) {
                    num2 = null;
                } else {
                    num2 = num;
                }
                if ((i12 & 8) != 0) {
                    jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    f11 = 0.0f;
                } else {
                    f11 = f10;
                }
                if (i16 != 0) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if ((i12 & 64) != 0) {
                    statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                    i13 &= -3670017;
                } else {
                    statusNotificationState2 = statusNotificationState;
                }
                if (i17 != 0) {
                    function2 = null;
                } else {
                    function2 = function0;
                }
                if (i19 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                function4 = function2;
                j11 = jM5104getToolBar0d7_KjU;
                f12 = f11;
                list2 = listEmptyList;
                statusNotificationState3 = statusNotificationState2;
                num3 = num2;
            } else {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i23 != 0) {
                    num2 = null;
                } else {
                    num2 = num;
                }
                if ((i12 & 8) != 0) {
                    jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    f11 = 0.0f;
                } else {
                    f11 = f10;
                }
                if (i16 != 0) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if ((i12 & 64) != 0) {
                    statusNotificationState2 = new StatusNotificationState(null, 0, false, 7, null);
                    i13 &= -3670017;
                } else {
                    statusNotificationState2 = statusNotificationState;
                }
                if (i17 != 0) {
                    function2 = null;
                } else {
                    function2 = function0;
                }
                if (i19 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                function4 = function2;
                j11 = jM5104getToolBar0d7_KjU;
                f12 = f11;
                list2 = listEmptyList;
                statusNotificationState3 = statusNotificationState2;
                num3 = num2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1430037786, i13, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:69)");
            }
            int i21113 = 32816 | (i13 & 14);
            int i21114 = i13 >> 3;
            Integer num19 = num3;
            m4986TopAppBarlVb_Clg(modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1589575938, true, new c(i10, num3)), j11, f12, list2, statusNotificationState3, function4, function3, composerStartRestartGroup, i21113 | (i21114 & 896) | (i21114 & 7168) | (458752 & i21114) | (i21114 & 3670016) | (i21114 & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            num4 = num19;
            j12 = j11;
            list3 = list2;
            statusNotificationState4 = statusNotificationState3;
            function5 = function4;
            function6 = function3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new d(f12, i10, i11, i12, j12, modifier3, statusNotificationState4, num4, list3, function5, function6));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0130  */
    /* JADX WARN: Code duplicated, block: B:103:0x0136  */
    /* JADX WARN: Code duplicated, block: B:105:0x0145  */
    /* JADX WARN: Code duplicated, block: B:107:0x0148  */
    /* JADX WARN: Code duplicated, block: B:108:0x014d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0153  */
    /* JADX WARN: Code duplicated, block: B:112:0x0169  */
    /* JADX WARN: Code duplicated, block: B:114:0x016c  */
    /* JADX WARN: Code duplicated, block: B:115:0x016e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0172  */
    /* JADX WARN: Code duplicated, block: B:119:0x017b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0188  */
    /* JADX WARN: Code duplicated, block: B:125:0x0196  */
    /* JADX WARN: Code duplicated, block: B:126:0x0198  */
    /* JADX WARN: Code duplicated, block: B:129:0x020c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0218  */
    /* JADX WARN: Code duplicated, block: B:133:0x021c  */
    /* JADX WARN: Code duplicated, block: B:136:0x022d  */
    /* JADX WARN: Code duplicated, block: B:138:0x023b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0285  */
    /* JADX WARN: Code duplicated, block: B:144:0x0291  */
    /* JADX WARN: Code duplicated, block: B:145:0x0295  */
    /* JADX WARN: Code duplicated, block: B:148:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:150:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:153:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:154:0x0306  */
    /* JADX WARN: Code duplicated, block: B:157:0x0359  */
    /* JADX WARN: Code duplicated, block: B:161:0x036a  */
    /* JADX WARN: Code duplicated, block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:86:0x0100  */
    /* JADX WARN: Code duplicated, block: B:88:0x0107  */
    /* JADX WARN: Code duplicated, block: B:98:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x012d  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: TopAppBar-lVb_Clg, reason: not valid java name */
    public static final void m4986TopAppBarlVb_Clg(@Nullable Modifier modifier, @NotNull Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> content, long j10, float f6, @Nullable List<TopAppBarItem> list, @Nullable StatusNotificationState statusNotificationState, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable Composer composer, int i10, int i11) {
        int i12;
        long jM5104getToolBar0d7_KjU;
        float f10;
        int i13;
        StatusNotificationState statusNotificationState2;
        int i14;
        int i15;
        int i16;
        int i17;
        Modifier modifier2;
        List<TopAppBarItem> listEmptyList;
        StatusNotificationState statusNotificationState3;
        Function0<Unit> function2;
        Function0<Unit> function3;
        List<TopAppBarItem> list2;
        float f11;
        int i18;
        Modifier modifierClip;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM2074constructorimpl;
        Function2 function2C;
        int currentCompositeKeyHash2;
        Function0<ComposeUiNode> constructor2;
        Composer composerM2074constructorimpl2;
        Function2 function2C2;
        boolean z10;
        ComposableLambda composableLambda;
        Function0<Unit> function4;
        Function0<Unit> function5;
        long j11;
        StatusNotificationState statusNotificationState4;
        List<TopAppBarItem> list3;
        float f12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1860549805);
        int i19 = i11 & 1;
        if (i19 != 0) {
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
        if ((i10 & 896) == 0) {
            jM5104getToolBar0d7_KjU = j10;
            i12 |= ((i11 & 4) == 0 && composerStartRestartGroup.changed(jM5104getToolBar0d7_KjU)) ? 256 : 128;
        } else {
            jM5104getToolBar0d7_KjU = j10;
        }
        int i20 = i11 & 8;
        if (i20 == 0) {
            if ((i10 & 7168) == 0) {
                f10 = f6;
                i12 |= composerStartRestartGroup.changed(f10) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                i12 |= 8192;
            }
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    statusNotificationState2 = statusNotificationState;
                    int i21 = composerStartRestartGroup.changed(statusNotificationState2) ? 131072 : 65536;
                    i12 |= i21;
                } else {
                    statusNotificationState2 = statusNotificationState;
                }
                i12 |= i21;
            } else {
                statusNotificationState2 = statusNotificationState;
            }
            i14 = i11 & 64;
            if (i14 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i12 |= i15;
            }
            i16 = i11 & 128;
            if (i16 != 0) {
                if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                }
                if (i13 != 16 && (23967451 & i12) == 4793490 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    list3 = list;
                    j11 = jM5104getToolBar0d7_KjU;
                    f12 = f10;
                    statusNotificationState4 = statusNotificationState2;
                    function5 = function0;
                    function4 = function1;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 4) != 0) {
                            jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                            i12 &= -897;
                        }
                        if (i20 != 0) {
                            f10 = 0.0f;
                        }
                        if (i13 != 0) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if ((i11 & 32) != 0) {
                            statusNotificationState3 = new StatusNotificationState(null, 0, false, 7, null);
                            i12 &= -458753;
                        } else {
                            statusNotificationState3 = statusNotificationState2;
                        }
                        if (i14 != 0) {
                            function2 = null;
                        } else {
                            function2 = function0;
                        }
                        if (i16 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        int i22 = i12;
                        list2 = listEmptyList;
                        f11 = f10;
                        i18 = i22;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                        }
                        modifier2 = modifier;
                        function2 = function0;
                        function3 = function1;
                        f11 = f10;
                        statusNotificationState3 = statusNotificationState2;
                        i18 = i12;
                        list2 = list;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1860549805, i18, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:138)");
                    }
                    if (f11 == 0.0f) {
                        modifierClip = modifier2;
                    } else {
                        int i23 = (int) (0.4f * f11 * 100);
                        modifierClip = ClipKt.clip(modifier2, RoundedCornerShapeKt.RoundedCornerShape$default(i23, i23, 0, 0, 12, (Object) null));
                    }
                    Modifier modifierM122backgroundbw27NRU$default = BackgroundKt.m122backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifierClip, 0.0f, 1, null), jM5104getToolBar0d7_KjU, null, 2, null);
                    Alignment.Companion companion = Alignment.INSTANCE;
                    Alignment center = companion.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    modifier3 = modifier2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    float f13 = f11;
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    long j12 = jM5104getToolBar0d7_KjU;
                    constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM122backgroundbw27NRU$default);
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
                    function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
                    if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                    composerStartRestartGroup.startReplaceableGroup(-483455358);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    constructor2 = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion3);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C2 = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl2, measurePolicyColumnMeasurePolicy, composerM2074constructorimpl2, currentCompositionLocalMap2);
                    if (composerM2074constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf2, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier modifierM342widthInVpY3zN4$default = SizeKt.m342widthInVpY3zN4$default(SizeKt.m321height3ABfNKs(companion3, PrimitiveResources_androidKt.dimensionResource(R.dimen.actionbar_height, composerStartRestartGroup, 0)), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen.activity_max_width, composerStartRestartGroup, 0), 1, null);
                    long jM2543getTransparent0d7_KjU = Color.INSTANCE.m2543getTransparent0d7_KjU();
                    long jM5086getOnBackground0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5086getOnBackground0d7_KjU();
                    float fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    if (function2 != null) {
                        z10 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 323833962, true, new g(function2));
                    } else {
                        z10 = true;
                        composableLambda = null;
                    }
                    Function0<Unit> function6 = function3;
                    AppBarKt.m661TopAppBarxWeB9s(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 949810165, z10, new h(content)), modifierM342widthInVpY3zN4$default, composableLambda, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1673182816, z10, new i(list2, function3)), jM2543getTransparent0d7_KjU, jM5086getOnBackground0d7_KjU, fM4389constructorimpl, composerStartRestartGroup, 1600518, 0);
                    StatusNotificationKt.StatusNotification(statusNotificationState3.getType(), statusNotificationState3.getTextResId(), statusNotificationState3.isVisible(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function6;
                    function5 = function2;
                    j11 = j12;
                    statusNotificationState4 = statusNotificationState3;
                    list3 = list2;
                    f12 = f13;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new j(modifier3, content, j11, f12, list3, statusNotificationState4, function5, function4, i10, i11));
                }
            }
            i17 = 12582912;
            i12 |= i17;
            if (i13 != 16) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i12 &= -897;
                    }
                    if (i20 != 0) {
                        f10 = 0.0f;
                    }
                    if (i13 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if ((i11 & 32) != 0) {
                        statusNotificationState3 = new StatusNotificationState(null, 0, false, 7, null);
                        i12 &= -458753;
                    } else {
                        statusNotificationState3 = statusNotificationState2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i16 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    int i24 = i12;
                    list2 = listEmptyList;
                    f11 = f10;
                    i18 = i24;
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i12 &= -897;
                    }
                    if (i20 != 0) {
                        f10 = 0.0f;
                    }
                    if (i13 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if ((i11 & 32) != 0) {
                        statusNotificationState3 = new StatusNotificationState(null, 0, false, 7, null);
                        i12 &= -458753;
                    } else {
                        statusNotificationState3 = statusNotificationState2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i16 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    int i25 = i12;
                    list2 = listEmptyList;
                    f11 = f10;
                    i18 = i25;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1860549805, i18, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:138)");
                }
                if (f11 == 0.0f) {
                    modifierClip = modifier2;
                } else {
                    int i26 = (int) (0.4f * f11 * 100);
                    modifierClip = ClipKt.clip(modifier2, RoundedCornerShapeKt.RoundedCornerShape$default(i26, i26, 0, 0, 12, (Object) null));
                }
                Modifier modifierM122backgroundbw27NRU$default2 = BackgroundKt.m122backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifierClip, 0.0f, 1, null), jM5104getToolBar0d7_KjU, null, 2, null);
                Alignment.Companion companion4 = Alignment.INSTANCE;
                Alignment center2 = companion4.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                modifier3 = modifier2;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                float f14 = f11;
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                long j13 = jM5104getToolBar0d7_KjU;
                constructor = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM122backgroundbw27NRU$default2);
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
                function2C = com.google.android.gms.measurement.internal.a.c(companion5, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy2, composerM2074constructorimpl, currentCompositionLocalMap3);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf3, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                Alignment.Horizontal centerHorizontally2 = companion4.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Modifier.Companion companion6 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion5.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion6);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C2 = com.google.android.gms.measurement.internal.a.c(companion5, composerM2074constructorimpl2, measurePolicyColumnMeasurePolicy2, composerM2074constructorimpl2, currentCompositionLocalMap4);
                if (composerM2074constructorimpl2.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
                }
                ai.a.j(0, function3ModifierMaterializerOf4, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                Modifier modifierM342widthInVpY3zN4$default2 = SizeKt.m342widthInVpY3zN4$default(SizeKt.m321height3ABfNKs(companion6, PrimitiveResources_androidKt.dimensionResource(R.dimen.actionbar_height, composerStartRestartGroup, 0)), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen.activity_max_width, composerStartRestartGroup, 0), 1, null);
                long jM2543getTransparent0d7_KjU2 = Color.INSTANCE.m2543getTransparent0d7_KjU();
                long jM5086getOnBackground0d7_KjU2 = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5086getOnBackground0d7_KjU();
                float fM4389constructorimpl2 = Dp.m4389constructorimpl(0);
                if (function2 != null) {
                    z10 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 323833962, true, new g(function2));
                } else {
                    z10 = true;
                    composableLambda = null;
                }
                Function0<Unit> function7 = function3;
                AppBarKt.m661TopAppBarxWeB9s(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 949810165, z10, new h(content)), modifierM342widthInVpY3zN4$default2, composableLambda, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1673182816, z10, new i(list2, function3)), jM2543getTransparent0d7_KjU2, jM5086getOnBackground0d7_KjU2, fM4389constructorimpl2, composerStartRestartGroup, 1600518, 0);
                StatusNotificationKt.StatusNotification(statusNotificationState3.getType(), statusNotificationState3.getTextResId(), statusNotificationState3.isVisible(), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function7;
                function5 = function2;
                j11 = j13;
                statusNotificationState4 = statusNotificationState3;
                list3 = list2;
                f12 = f14;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i12 &= -897;
                    }
                    if (i20 != 0) {
                        f10 = 0.0f;
                    }
                    if (i13 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if ((i11 & 32) != 0) {
                        statusNotificationState3 = new StatusNotificationState(null, 0, false, 7, null);
                        i12 &= -458753;
                    } else {
                        statusNotificationState3 = statusNotificationState2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i16 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    int i27 = i12;
                    list2 = listEmptyList;
                    f11 = f10;
                    i18 = i27;
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i12 &= -897;
                    }
                    if (i20 != 0) {
                        f10 = 0.0f;
                    }
                    if (i13 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if ((i11 & 32) != 0) {
                        statusNotificationState3 = new StatusNotificationState(null, 0, false, 7, null);
                        i12 &= -458753;
                    } else {
                        statusNotificationState3 = statusNotificationState2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i16 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    int i28 = i12;
                    list2 = listEmptyList;
                    f11 = f10;
                    i18 = i28;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1860549805, i18, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:138)");
                }
                if (f11 == 0.0f) {
                    modifierClip = modifier2;
                } else {
                    int i29 = (int) (0.4f * f11 * 100);
                    modifierClip = ClipKt.clip(modifier2, RoundedCornerShapeKt.RoundedCornerShape$default(i29, i29, 0, 0, 12, (Object) null));
                }
                Modifier modifierM122backgroundbw27NRU$default3 = BackgroundKt.m122backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifierClip, 0.0f, 1, null), jM5104getToolBar0d7_KjU, null, 2, null);
                Alignment.Companion companion7 = Alignment.INSTANCE;
                Alignment center3 = companion7.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                modifier3 = modifier2;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center3, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                float f15 = f11;
                ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                long j14 = jM5104getToolBar0d7_KjU;
                constructor = companion8.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM122backgroundbw27NRU$default3);
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
                function2C = com.google.android.gms.measurement.internal.a.c(companion8, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy3, composerM2074constructorimpl, currentCompositionLocalMap5);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf5, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                Alignment.Horizontal centerHorizontally3 = companion7.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Modifier.Companion companion9 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally3, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion8.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(companion9);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C2 = com.google.android.gms.measurement.internal.a.c(companion8, composerM2074constructorimpl2, measurePolicyColumnMeasurePolicy3, composerM2074constructorimpl2, currentCompositionLocalMap6);
                if (composerM2074constructorimpl2.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
                }
                ai.a.j(0, function3ModifierMaterializerOf6, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                Modifier modifierM342widthInVpY3zN4$default3 = SizeKt.m342widthInVpY3zN4$default(SizeKt.m321height3ABfNKs(companion9, PrimitiveResources_androidKt.dimensionResource(R.dimen.actionbar_height, composerStartRestartGroup, 0)), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen.activity_max_width, composerStartRestartGroup, 0), 1, null);
                long jM2543getTransparent0d7_KjU3 = Color.INSTANCE.m2543getTransparent0d7_KjU();
                long jM5086getOnBackground0d7_KjU3 = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5086getOnBackground0d7_KjU();
                float fM4389constructorimpl3 = Dp.m4389constructorimpl(0);
                if (function2 != null) {
                    z10 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 323833962, true, new g(function2));
                } else {
                    z10 = true;
                    composableLambda = null;
                }
                Function0<Unit> function8 = function3;
                AppBarKt.m661TopAppBarxWeB9s(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 949810165, z10, new h(content)), modifierM342widthInVpY3zN4$default3, composableLambda, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1673182816, z10, new i(list2, function3)), jM2543getTransparent0d7_KjU3, jM5086getOnBackground0d7_KjU3, fM4389constructorimpl3, composerStartRestartGroup, 1600518, 0);
                StatusNotificationKt.StatusNotification(statusNotificationState3.getType(), statusNotificationState3.getTextResId(), statusNotificationState3.isVisible(), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function8;
                function5 = function2;
                j11 = j14;
                statusNotificationState4 = statusNotificationState3;
                list3 = list2;
                f12 = f15;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new j(modifier3, content, j11, f12, list3, statusNotificationState4, function5, function4, i10, i11));
            }
        }
        i12 |= 3072;
        f10 = f6;
        i13 = i11 & 16;
        if (i13 != 0) {
            i12 |= 8192;
        }
        if ((458752 & i10) == 0) {
            if ((i11 & 32) == 0) {
                statusNotificationState2 = statusNotificationState;
                if (composerStartRestartGroup.changed(statusNotificationState2)) {
                }
                i12 |= i21;
            } else {
                statusNotificationState2 = statusNotificationState;
            }
            i12 |= i21;
        } else {
            statusNotificationState2 = statusNotificationState;
        }
        i14 = i11 & 64;
        if (i14 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 3670016) == 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i12 |= i15;
        }
        i16 = i11 & 128;
        if (i16 != 0) {
            if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
            }
            if (i13 != 16) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i12 &= -897;
                    }
                    if (i20 != 0) {
                        f10 = 0.0f;
                    }
                    if (i13 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if ((i11 & 32) != 0) {
                        statusNotificationState3 = new StatusNotificationState(null, 0, false, 7, null);
                        i12 &= -458753;
                    } else {
                        statusNotificationState3 = statusNotificationState2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i16 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    int i210 = i12;
                    list2 = listEmptyList;
                    f11 = f10;
                    i18 = i210;
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i12 &= -897;
                    }
                    if (i20 != 0) {
                        f10 = 0.0f;
                    }
                    if (i13 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if ((i11 & 32) != 0) {
                        statusNotificationState3 = new StatusNotificationState(null, 0, false, 7, null);
                        i12 &= -458753;
                    } else {
                        statusNotificationState3 = statusNotificationState2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i16 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    int i211 = i12;
                    list2 = listEmptyList;
                    f11 = f10;
                    i18 = i211;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1860549805, i18, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:138)");
                }
                if (f11 == 0.0f) {
                    modifierClip = modifier2;
                } else {
                    int i212 = (int) (0.4f * f11 * 100);
                    modifierClip = ClipKt.clip(modifier2, RoundedCornerShapeKt.RoundedCornerShape$default(i212, i212, 0, 0, 12, (Object) null));
                }
                Modifier modifierM122backgroundbw27NRU$default4 = BackgroundKt.m122backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifierClip, 0.0f, 1, null), jM5104getToolBar0d7_KjU, null, 2, null);
                Alignment.Companion companion10 = Alignment.INSTANCE;
                Alignment center4 = companion10.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                modifier3 = modifier2;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center4, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                float f16 = f11;
                ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                long j15 = jM5104getToolBar0d7_KjU;
                constructor = companion11.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierM122backgroundbw27NRU$default4);
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
                function2C = com.google.android.gms.measurement.internal.a.c(companion11, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy4, composerM2074constructorimpl, currentCompositionLocalMap7);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf7, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                Alignment.Horizontal centerHorizontally4 = companion10.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Modifier.Companion companion12 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally4, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion11.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(companion12);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C2 = com.google.android.gms.measurement.internal.a.c(companion11, composerM2074constructorimpl2, measurePolicyColumnMeasurePolicy4, composerM2074constructorimpl2, currentCompositionLocalMap8);
                if (composerM2074constructorimpl2.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
                }
                ai.a.j(0, function3ModifierMaterializerOf8, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                Modifier modifierM342widthInVpY3zN4$default4 = SizeKt.m342widthInVpY3zN4$default(SizeKt.m321height3ABfNKs(companion12, PrimitiveResources_androidKt.dimensionResource(R.dimen.actionbar_height, composerStartRestartGroup, 0)), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen.activity_max_width, composerStartRestartGroup, 0), 1, null);
                long jM2543getTransparent0d7_KjU4 = Color.INSTANCE.m2543getTransparent0d7_KjU();
                long jM5086getOnBackground0d7_KjU4 = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5086getOnBackground0d7_KjU();
                float fM4389constructorimpl4 = Dp.m4389constructorimpl(0);
                if (function2 != null) {
                    z10 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 323833962, true, new g(function2));
                } else {
                    z10 = true;
                    composableLambda = null;
                }
                Function0<Unit> function9 = function3;
                AppBarKt.m661TopAppBarxWeB9s(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 949810165, z10, new h(content)), modifierM342widthInVpY3zN4$default4, composableLambda, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1673182816, z10, new i(list2, function3)), jM2543getTransparent0d7_KjU4, jM5086getOnBackground0d7_KjU4, fM4389constructorimpl4, composerStartRestartGroup, 1600518, 0);
                StatusNotificationKt.StatusNotification(statusNotificationState3.getType(), statusNotificationState3.getTextResId(), statusNotificationState3.isVisible(), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function9;
                function5 = function2;
                j11 = j15;
                statusNotificationState4 = statusNotificationState3;
                list3 = list2;
                f12 = f16;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i12 &= -897;
                    }
                    if (i20 != 0) {
                        f10 = 0.0f;
                    }
                    if (i13 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if ((i11 & 32) != 0) {
                        statusNotificationState3 = new StatusNotificationState(null, 0, false, 7, null);
                        i12 &= -458753;
                    } else {
                        statusNotificationState3 = statusNotificationState2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i16 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    int i213 = i12;
                    list2 = listEmptyList;
                    f11 = f10;
                    i18 = i213;
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 4) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i12 &= -897;
                    }
                    if (i20 != 0) {
                        f10 = 0.0f;
                    }
                    if (i13 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if ((i11 & 32) != 0) {
                        statusNotificationState3 = new StatusNotificationState(null, 0, false, 7, null);
                        i12 &= -458753;
                    } else {
                        statusNotificationState3 = statusNotificationState2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i16 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    int i214 = i12;
                    list2 = listEmptyList;
                    f11 = f10;
                    i18 = i214;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1860549805, i18, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:138)");
                }
                if (f11 == 0.0f) {
                    modifierClip = modifier2;
                } else {
                    int i215 = (int) (0.4f * f11 * 100);
                    modifierClip = ClipKt.clip(modifier2, RoundedCornerShapeKt.RoundedCornerShape$default(i215, i215, 0, 0, 12, (Object) null));
                }
                Modifier modifierM122backgroundbw27NRU$default5 = BackgroundKt.m122backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifierClip, 0.0f, 1, null), jM5104getToolBar0d7_KjU, null, 2, null);
                Alignment.Companion companion13 = Alignment.INSTANCE;
                Alignment center5 = companion13.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                modifier3 = modifier2;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(center5, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                float f17 = f11;
                ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                long j16 = jM5104getToolBar0d7_KjU;
                constructor = companion14.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierM122backgroundbw27NRU$default5);
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
                function2C = com.google.android.gms.measurement.internal.a.c(companion14, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy5, composerM2074constructorimpl, currentCompositionLocalMap9);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf9, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                Alignment.Horizontal centerHorizontally5 = companion13.getCenterHorizontally();
                composerStartRestartGroup.startReplaceableGroup(-483455358);
                Modifier.Companion companion15 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally5, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                constructor2 = companion14.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(companion15);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C2 = com.google.android.gms.measurement.internal.a.c(companion14, composerM2074constructorimpl2, measurePolicyColumnMeasurePolicy5, composerM2074constructorimpl2, currentCompositionLocalMap10);
                if (composerM2074constructorimpl2.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
                }
                ai.a.j(0, function3ModifierMaterializerOf10, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                Modifier modifierM342widthInVpY3zN4$default5 = SizeKt.m342widthInVpY3zN4$default(SizeKt.m321height3ABfNKs(companion15, PrimitiveResources_androidKt.dimensionResource(R.dimen.actionbar_height, composerStartRestartGroup, 0)), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen.activity_max_width, composerStartRestartGroup, 0), 1, null);
                long jM2543getTransparent0d7_KjU5 = Color.INSTANCE.m2543getTransparent0d7_KjU();
                long jM5086getOnBackground0d7_KjU5 = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5086getOnBackground0d7_KjU();
                float fM4389constructorimpl5 = Dp.m4389constructorimpl(0);
                if (function2 != null) {
                    z10 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 323833962, true, new g(function2));
                } else {
                    z10 = true;
                    composableLambda = null;
                }
                Function0<Unit> function10 = function3;
                AppBarKt.m661TopAppBarxWeB9s(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 949810165, z10, new h(content)), modifierM342widthInVpY3zN4$default5, composableLambda, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1673182816, z10, new i(list2, function3)), jM2543getTransparent0d7_KjU5, jM5086getOnBackground0d7_KjU5, fM4389constructorimpl5, composerStartRestartGroup, 1600518, 0);
                StatusNotificationKt.StatusNotification(statusNotificationState3.getType(), statusNotificationState3.getTextResId(), statusNotificationState3.isVisible(), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function10;
                function5 = function2;
                j11 = j16;
                statusNotificationState4 = statusNotificationState3;
                list3 = list2;
                f12 = f17;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new j(modifier3, content, j11, f12, list3, statusNotificationState4, function5, function4, i10, i11));
            }
        }
        i17 = 12582912;
        i12 |= i17;
        if (i13 != 16) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                    i12 &= -897;
                }
                if (i20 != 0) {
                    f10 = 0.0f;
                }
                if (i13 != 0) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if ((i11 & 32) != 0) {
                    statusNotificationState3 = new StatusNotificationState(null, 0, false, 7, null);
                    i12 &= -458753;
                } else {
                    statusNotificationState3 = statusNotificationState2;
                }
                if (i14 != 0) {
                    function2 = null;
                } else {
                    function2 = function0;
                }
                if (i16 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                int i216 = i12;
                list2 = listEmptyList;
                f11 = f10;
                i18 = i216;
            } else {
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                    i12 &= -897;
                }
                if (i20 != 0) {
                    f10 = 0.0f;
                }
                if (i13 != 0) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if ((i11 & 32) != 0) {
                    statusNotificationState3 = new StatusNotificationState(null, 0, false, 7, null);
                    i12 &= -458753;
                } else {
                    statusNotificationState3 = statusNotificationState2;
                }
                if (i14 != 0) {
                    function2 = null;
                } else {
                    function2 = function0;
                }
                if (i16 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                int i217 = i12;
                list2 = listEmptyList;
                f11 = f10;
                i18 = i217;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1860549805, i18, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:138)");
            }
            if (f11 == 0.0f) {
                modifierClip = modifier2;
            } else {
                int i218 = (int) (0.4f * f11 * 100);
                modifierClip = ClipKt.clip(modifier2, RoundedCornerShapeKt.RoundedCornerShape$default(i218, i218, 0, 0, 12, (Object) null));
            }
            Modifier modifierM122backgroundbw27NRU$default6 = BackgroundKt.m122backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifierClip, 0.0f, 1, null), jM5104getToolBar0d7_KjU, null, 2, null);
            Alignment.Companion companion16 = Alignment.INSTANCE;
            Alignment center6 = companion16.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            modifier3 = modifier2;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(center6, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            float f18 = f11;
            ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
            long j17 = jM5104getToolBar0d7_KjU;
            constructor = companion17.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierM122backgroundbw27NRU$default6);
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
            function2C = com.google.android.gms.measurement.internal.a.c(companion17, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy6, composerM2074constructorimpl, currentCompositionLocalMap11);
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf11, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
            Alignment.Horizontal centerHorizontally6 = companion16.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Modifier.Companion companion18 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally6, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion17.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(companion18);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
            function2C2 = com.google.android.gms.measurement.internal.a.c(companion17, composerM2074constructorimpl2, measurePolicyColumnMeasurePolicy6, composerM2074constructorimpl2, currentCompositionLocalMap12);
            if (composerM2074constructorimpl2.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
            }
            ai.a.j(0, function3ModifierMaterializerOf12, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
            Modifier modifierM342widthInVpY3zN4$default6 = SizeKt.m342widthInVpY3zN4$default(SizeKt.m321height3ABfNKs(companion18, PrimitiveResources_androidKt.dimensionResource(R.dimen.actionbar_height, composerStartRestartGroup, 0)), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen.activity_max_width, composerStartRestartGroup, 0), 1, null);
            long jM2543getTransparent0d7_KjU6 = Color.INSTANCE.m2543getTransparent0d7_KjU();
            long jM5086getOnBackground0d7_KjU6 = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5086getOnBackground0d7_KjU();
            float fM4389constructorimpl6 = Dp.m4389constructorimpl(0);
            if (function2 != null) {
                z10 = true;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 323833962, true, new g(function2));
            } else {
                z10 = true;
                composableLambda = null;
            }
            Function0<Unit> function11 = function3;
            AppBarKt.m661TopAppBarxWeB9s(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 949810165, z10, new h(content)), modifierM342widthInVpY3zN4$default6, composableLambda, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1673182816, z10, new i(list2, function3)), jM2543getTransparent0d7_KjU6, jM5086getOnBackground0d7_KjU6, fM4389constructorimpl6, composerStartRestartGroup, 1600518, 0);
            StatusNotificationKt.StatusNotification(statusNotificationState3.getType(), statusNotificationState3.getTextResId(), statusNotificationState3.isVisible(), composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function4 = function11;
            function5 = function2;
            j11 = j17;
            statusNotificationState4 = statusNotificationState3;
            list3 = list2;
            f12 = f18;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                    i12 &= -897;
                }
                if (i20 != 0) {
                    f10 = 0.0f;
                }
                if (i13 != 0) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if ((i11 & 32) != 0) {
                    statusNotificationState3 = new StatusNotificationState(null, 0, false, 7, null);
                    i12 &= -458753;
                } else {
                    statusNotificationState3 = statusNotificationState2;
                }
                if (i14 != 0) {
                    function2 = null;
                } else {
                    function2 = function0;
                }
                if (i16 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                int i219 = i12;
                list2 = listEmptyList;
                f11 = f10;
                i18 = i219;
            } else {
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 4) != 0) {
                    jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                    i12 &= -897;
                }
                if (i20 != 0) {
                    f10 = 0.0f;
                }
                if (i13 != 0) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if ((i11 & 32) != 0) {
                    statusNotificationState3 = new StatusNotificationState(null, 0, false, 7, null);
                    i12 &= -458753;
                } else {
                    statusNotificationState3 = statusNotificationState2;
                }
                if (i14 != 0) {
                    function2 = null;
                } else {
                    function2 = function0;
                }
                if (i16 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                int i2110 = i12;
                list2 = listEmptyList;
                f11 = f10;
                i18 = i2110;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1860549805, i18, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:138)");
            }
            if (f11 == 0.0f) {
                modifierClip = modifier2;
            } else {
                int i2111 = (int) (0.4f * f11 * 100);
                modifierClip = ClipKt.clip(modifier2, RoundedCornerShapeKt.RoundedCornerShape$default(i2111, i2111, 0, 0, 12, (Object) null));
            }
            Modifier modifierM122backgroundbw27NRU$default7 = BackgroundKt.m122backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifierClip, 0.0f, 1, null), jM5104getToolBar0d7_KjU, null, 2, null);
            Alignment.Companion companion19 = Alignment.INSTANCE;
            Alignment center7 = companion19.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            modifier3 = modifier2;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(center7, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            float f19 = f11;
            ComposeUiNode.Companion companion110 = ComposeUiNode.INSTANCE;
            long j18 = jM5104getToolBar0d7_KjU;
            constructor = companion110.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierM122backgroundbw27NRU$default7);
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
            function2C = com.google.android.gms.measurement.internal.a.c(companion110, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy7, composerM2074constructorimpl, currentCompositionLocalMap13);
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf13, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
            Alignment.Horizontal centerHorizontally7 = companion19.getCenterHorizontally();
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Modifier.Companion companion111 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally7, composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            constructor2 = companion110.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(companion111);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
            function2C2 = com.google.android.gms.measurement.internal.a.c(companion110, composerM2074constructorimpl2, measurePolicyColumnMeasurePolicy7, composerM2074constructorimpl2, currentCompositionLocalMap14);
            if (composerM2074constructorimpl2.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
            }
            ai.a.j(0, function3ModifierMaterializerOf14, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance7 = ColumnScopeInstance.INSTANCE;
            Modifier modifierM342widthInVpY3zN4$default7 = SizeKt.m342widthInVpY3zN4$default(SizeKt.m321height3ABfNKs(companion111, PrimitiveResources_androidKt.dimensionResource(R.dimen.actionbar_height, composerStartRestartGroup, 0)), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen.activity_max_width, composerStartRestartGroup, 0), 1, null);
            long jM2543getTransparent0d7_KjU7 = Color.INSTANCE.m2543getTransparent0d7_KjU();
            long jM5086getOnBackground0d7_KjU7 = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5086getOnBackground0d7_KjU();
            float fM4389constructorimpl7 = Dp.m4389constructorimpl(0);
            if (function2 != null) {
                z10 = true;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 323833962, true, new g(function2));
            } else {
                z10 = true;
                composableLambda = null;
            }
            Function0<Unit> function12 = function3;
            AppBarKt.m661TopAppBarxWeB9s(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 949810165, z10, new h(content)), modifierM342widthInVpY3zN4$default7, composableLambda, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1673182816, z10, new i(list2, function3)), jM2543getTransparent0d7_KjU7, jM5086getOnBackground0d7_KjU7, fM4389constructorimpl7, composerStartRestartGroup, 1600518, 0);
            StatusNotificationKt.StatusNotification(statusNotificationState3.getType(), statusNotificationState3.getTextResId(), statusNotificationState3.isVisible(), composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function4 = function12;
            function5 = function2;
            j11 = j18;
            statusNotificationState4 = statusNotificationState3;
            list3 = list2;
            f12 = f19;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new j(modifier3, content, j11, f12, list3, statusNotificationState4, function5, function4, i10, i11));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void TopAppBarItemContainer(@Nullable Modifier modifier, @NotNull Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        Modifier modifier3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-422447226);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 14) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            modifier3 = i13 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-422447226, i12, -1, "com.bbva.ui.compose.TopAppBarItemContainer (TopAppBar.kt:243)");
            }
            Modifier modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(SizeKt.m321height3ABfNKs(modifier3, PrimitiveResources_androidKt.dimensionResource(R.dimen.actionbar_height, composerStartRestartGroup, 0)), 0.0f, Dp.m4389constructorimpl(16), 0.0f, 0.0f, 13, null);
            int i14 = (i12 << 6) & 7168;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            int i15 = i14 >> 3;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, (i15 & 112) | (i15 & 14));
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM300paddingqDBjuR0$default);
            int i16 = ((((i14 << 3) & 112) << 9) & 7168) | 6;
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
            Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j((i16 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            content.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i14 >> 6) & 112) | 6));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new k(modifier3, content, i10, i11));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(Modifier modifier, @StringRes int i10, @DrawableRes int i11, Function0<Unit> function0, Composer composer, int i12, int i13) {
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2133102973);
        int i15 = i13 & 1;
        if (i15 != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i14 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i12 & 112) == 0) {
            i14 |= composerStartRestartGroup.changed(i10) ? 32 : 16;
        }
        if ((i13 & 4) != 0) {
            i14 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i12 & 896) == 0) {
            i14 |= composerStartRestartGroup.changed(i11) ? 256 : 128;
        }
        if ((i13 & 8) != 0) {
            i14 |= 3072;
        } else if ((i12 & 7168) == 0) {
            i14 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i16 = i14;
        if ((i16 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i15 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2133102973, i16, -1, "com.bbva.ui.compose.ActionItem (TopAppBar.kt:205)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TopAppBarItemContainer(modifier, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1915211287, true, new a((MutableInteractionSource) objRememberedValue, RippleKt.m900rememberRipple9IZ8Weo(false, Dp.m4389constructorimpl(24), 0L, composerStartRestartGroup, 54, 4), function0, i11, i10)), composerStartRestartGroup, (i16 & 14) | 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier2, i10, i11, function0, i12, i13));
        }
    }

    public static final void access$NavigationIcon(Function0 function0, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(2125700210);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2125700210, i11, -1, "com.bbva.ui.compose.NavigationIcon (TopAppBar.kt:188)");
            }
            a(SemanticsModifierKt.semantics$default(PaddingKt.m295absolutePaddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m4389constructorimpl(8), 0.0f, 11, null), false, kc.f.f79306p0, 1, null), R.string.ui_back, R.drawable.ic_back, function0, composerStartRestartGroup, (i11 << 9) & 7168, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kc.g(i10, function0));
        }
    }

    public static final void access$TitleComponent(int i10, Composer composer, int i11) {
        int i12;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1703557347);
        if ((i11 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1703557347, i12, -1, "com.bbva.ui.compose.TitleComponent (TopAppBar.kt:274)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m879Text4IGK_g(StringResources_androidKt.stringResource(i10, composerStartRestartGroup, i12 & 14), (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, FontWeight.INSTANCE.getW700(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131030);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new kc.h(i10, i11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x014a  */
    /* JADX WARN: Code duplicated, block: B:109:0x014d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0153  */
    /* JADX WARN: Code duplicated, block: B:113:0x0160  */
    /* JADX WARN: Code duplicated, block: B:115:0x0164  */
    /* JADX WARN: Code duplicated, block: B:116:0x0169  */
    /* JADX WARN: Code duplicated, block: B:118:0x016d  */
    /* JADX WARN: Code duplicated, block: B:119:0x016f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0174  */
    /* JADX WARN: Code duplicated, block: B:123:0x0187  */
    /* JADX WARN: Code duplicated, block: B:126:0x018b  */
    /* JADX WARN: Code duplicated, block: B:127:0x018d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0191  */
    /* JADX WARN: Code duplicated, block: B:131:0x019c  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:137:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:141:0x0208  */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:95:0x0118  */
    /* JADX WARN: Code duplicated, block: B:97:0x0123  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: TopAppBar-gF0flNs, reason: not valid java name */
    public static final void m4985TopAppBargF0flNs(@Nullable Modifier modifier, @DrawableRes int i10, @StringRes @Nullable Integer num, long j10, @Nullable List<TopAppBarItem> list, float f6, @Nullable StatusNotificationState statusNotificationState, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable Composer composer, int i11, int i12) {
        int i13;
        float f10;
        StatusNotificationState statusNotificationState2;
        int i14;
        int i15;
        int i16;
        int i17;
        Modifier modifier2;
        long jM5104getToolBar0d7_KjU;
        List<TopAppBarItem> listEmptyList;
        float f11;
        StatusNotificationState statusNotificationState3;
        Function0<Unit> function2;
        Function0<Unit> function3;
        StatusNotificationState statusNotificationState4;
        int i18;
        long j11;
        List<TopAppBarItem> list2;
        StatusNotificationState statusNotificationState5;
        Function0<Unit> function4;
        Function0<Unit> function5;
        Modifier modifier3;
        long j12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i19;
        Composer composerStartRestartGroup = composer.startRestartGroup(-38744762);
        int i20 = i12 & 1;
        if (i20 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= composerStartRestartGroup.changed(i10) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i11 & 896) == 0) {
            i13 |= composerStartRestartGroup.changed(num) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i13 |= ((i12 & 8) == 0 && composerStartRestartGroup.changed(j10)) ? 2048 : 1024;
        }
        int i21 = i12 & 16;
        if (i21 != 0) {
            i13 |= 8192;
        }
        int i22 = i12 & 32;
        if (i22 == 0) {
            if ((i11 & 458752) == 0) {
                f10 = f6;
                i13 |= composerStartRestartGroup.changed(f10) ? 131072 : 65536;
            }
            if ((i11 & 3670016) == 0) {
                statusNotificationState2 = statusNotificationState;
                if ((i12 & 64) == 0 || !composerStartRestartGroup.changed(statusNotificationState2)) {
                    i19 = 524288;
                } else {
                    i19 = 1048576;
                }
                i13 |= i19;
            } else {
                statusNotificationState2 = statusNotificationState;
            }
            i14 = i12 & 128;
            if (i14 != 0) {
                i13 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i13 |= i15;
            }
            i16 = i12 & 256;
            if (i16 != 0) {
                if ((i11 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i17 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i17 = 33554432;
                    }
                }
                if (i21 != 16 && (191739611 & i13) == 38347922 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier;
                    j12 = j10;
                    list2 = list;
                    function4 = function0;
                    function5 = function1;
                    statusNotificationState5 = statusNotificationState2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i20 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i12 & 8) != 0) {
                            jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                            i13 &= -7169;
                        } else {
                            jM5104getToolBar0d7_KjU = j10;
                        }
                        if (i21 != 0) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        } else {
                            listEmptyList = list;
                        }
                        if (i22 != 0) {
                            f11 = 0.0f;
                        } else {
                            f11 = f10;
                        }
                        if ((i12 & 64) != 0) {
                            statusNotificationState3 = new StatusNotificationState(null, 0, false, 7, null);
                            i13 &= -3670017;
                        } else {
                            statusNotificationState3 = statusNotificationState2;
                        }
                        if (i14 != 0) {
                            function2 = null;
                        } else {
                            function2 = function0;
                        }
                        if (i16 != 0) {
                            function3 = null;
                        } else {
                            function3 = function1;
                        }
                        statusNotificationState4 = statusNotificationState3;
                        i18 = i13;
                        j11 = jM5104getToolBar0d7_KjU;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                        }
                        modifier2 = modifier;
                        listEmptyList = list;
                        function2 = function0;
                        function3 = function1;
                        i18 = i13;
                        statusNotificationState4 = statusNotificationState2;
                        f11 = f10;
                        j11 = j10;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-38744762, i18, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:108)");
                    }
                    int i23 = i18 >> 3;
                    m4986TopAppBarlVb_Clg(modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1314098334, true, new e(i10, num)), j11, f11, listEmptyList, statusNotificationState4, function2, function3, composerStartRestartGroup, ((i18 >> 6) & 7168) | 32816 | (i18 & 14) | (i23 & 896) | (458752 & i23) | (i23 & 3670016) | (i23 & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f10 = f11;
                    list2 = listEmptyList;
                    statusNotificationState5 = statusNotificationState4;
                    function4 = function2;
                    function5 = function3;
                    modifier3 = modifier2;
                    j12 = j11;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(f10, i10, i11, i12, j12, modifier3, statusNotificationState5, num, list2, function4, function5));
                }
            }
            i17 = 100663296;
            i13 |= i17;
            if (i21 != 16) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 8) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i13 &= -7169;
                    } else {
                        jM5104getToolBar0d7_KjU = j10;
                    }
                    if (i21 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i22 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f10;
                    }
                    if ((i12 & 64) != 0) {
                        statusNotificationState3 = new StatusNotificationState(null, 0, false, 7, null);
                        i13 &= -3670017;
                    } else {
                        statusNotificationState3 = statusNotificationState2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i16 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    statusNotificationState4 = statusNotificationState3;
                    i18 = i13;
                    j11 = jM5104getToolBar0d7_KjU;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 8) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i13 &= -7169;
                    } else {
                        jM5104getToolBar0d7_KjU = j10;
                    }
                    if (i21 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i22 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f10;
                    }
                    if ((i12 & 64) != 0) {
                        statusNotificationState3 = new StatusNotificationState(null, 0, false, 7, null);
                        i13 &= -3670017;
                    } else {
                        statusNotificationState3 = statusNotificationState2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i16 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    statusNotificationState4 = statusNotificationState3;
                    i18 = i13;
                    j11 = jM5104getToolBar0d7_KjU;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-38744762, i18, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:108)");
                }
                int i24 = i18 >> 3;
                m4986TopAppBarlVb_Clg(modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1314098334, true, new e(i10, num)), j11, f11, listEmptyList, statusNotificationState4, function2, function3, composerStartRestartGroup, ((i18 >> 6) & 7168) | 32816 | (i18 & 14) | (i24 & 896) | (458752 & i24) | (i24 & 3670016) | (i24 & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f10 = f11;
                list2 = listEmptyList;
                statusNotificationState5 = statusNotificationState4;
                function4 = function2;
                function5 = function3;
                modifier3 = modifier2;
                j12 = j11;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 8) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i13 &= -7169;
                    } else {
                        jM5104getToolBar0d7_KjU = j10;
                    }
                    if (i21 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i22 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f10;
                    }
                    if ((i12 & 64) != 0) {
                        statusNotificationState3 = new StatusNotificationState(null, 0, false, 7, null);
                        i13 &= -3670017;
                    } else {
                        statusNotificationState3 = statusNotificationState2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i16 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    statusNotificationState4 = statusNotificationState3;
                    i18 = i13;
                    j11 = jM5104getToolBar0d7_KjU;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 8) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i13 &= -7169;
                    } else {
                        jM5104getToolBar0d7_KjU = j10;
                    }
                    if (i21 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i22 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f10;
                    }
                    if ((i12 & 64) != 0) {
                        statusNotificationState3 = new StatusNotificationState(null, 0, false, 7, null);
                        i13 &= -3670017;
                    } else {
                        statusNotificationState3 = statusNotificationState2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i16 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    statusNotificationState4 = statusNotificationState3;
                    i18 = i13;
                    j11 = jM5104getToolBar0d7_KjU;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-38744762, i18, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:108)");
                }
                int i25 = i18 >> 3;
                m4986TopAppBarlVb_Clg(modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1314098334, true, new e(i10, num)), j11, f11, listEmptyList, statusNotificationState4, function2, function3, composerStartRestartGroup, ((i18 >> 6) & 7168) | 32816 | (i18 & 14) | (i25 & 896) | (458752 & i25) | (i25 & 3670016) | (i25 & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f10 = f11;
                list2 = listEmptyList;
                statusNotificationState5 = statusNotificationState4;
                function4 = function2;
                function5 = function3;
                modifier3 = modifier2;
                j12 = j11;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new f(f10, i10, i11, i12, j12, modifier3, statusNotificationState5, num, list2, function4, function5));
            }
        }
        i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        f10 = f6;
        if ((i11 & 3670016) == 0) {
            statusNotificationState2 = statusNotificationState;
            if ((i12 & 64) == 0) {
                i19 = 524288;
            } else {
                i19 = 524288;
            }
            i13 |= i19;
        } else {
            statusNotificationState2 = statusNotificationState;
        }
        i14 = i12 & 128;
        if (i14 != 0) {
            i13 |= 12582912;
        } else if ((i11 & 29360128) == 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i13 |= i15;
        }
        i16 = i12 & 256;
        if (i16 != 0) {
            if ((i11 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i17 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i17 = 33554432;
                }
            }
            if (i21 != 16) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 8) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i13 &= -7169;
                    } else {
                        jM5104getToolBar0d7_KjU = j10;
                    }
                    if (i21 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i22 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f10;
                    }
                    if ((i12 & 64) != 0) {
                        statusNotificationState3 = new StatusNotificationState(null, 0, false, 7, null);
                        i13 &= -3670017;
                    } else {
                        statusNotificationState3 = statusNotificationState2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i16 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    statusNotificationState4 = statusNotificationState3;
                    i18 = i13;
                    j11 = jM5104getToolBar0d7_KjU;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 8) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i13 &= -7169;
                    } else {
                        jM5104getToolBar0d7_KjU = j10;
                    }
                    if (i21 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i22 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f10;
                    }
                    if ((i12 & 64) != 0) {
                        statusNotificationState3 = new StatusNotificationState(null, 0, false, 7, null);
                        i13 &= -3670017;
                    } else {
                        statusNotificationState3 = statusNotificationState2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i16 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    statusNotificationState4 = statusNotificationState3;
                    i18 = i13;
                    j11 = jM5104getToolBar0d7_KjU;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-38744762, i18, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:108)");
                }
                int i26 = i18 >> 3;
                m4986TopAppBarlVb_Clg(modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1314098334, true, new e(i10, num)), j11, f11, listEmptyList, statusNotificationState4, function2, function3, composerStartRestartGroup, ((i18 >> 6) & 7168) | 32816 | (i18 & 14) | (i26 & 896) | (458752 & i26) | (i26 & 3670016) | (i26 & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f10 = f11;
                list2 = listEmptyList;
                statusNotificationState5 = statusNotificationState4;
                function4 = function2;
                function5 = function3;
                modifier3 = modifier2;
                j12 = j11;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 8) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i13 &= -7169;
                    } else {
                        jM5104getToolBar0d7_KjU = j10;
                    }
                    if (i21 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i22 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f10;
                    }
                    if ((i12 & 64) != 0) {
                        statusNotificationState3 = new StatusNotificationState(null, 0, false, 7, null);
                        i13 &= -3670017;
                    } else {
                        statusNotificationState3 = statusNotificationState2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i16 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    statusNotificationState4 = statusNotificationState3;
                    i18 = i13;
                    j11 = jM5104getToolBar0d7_KjU;
                } else {
                    if (i20 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i12 & 8) != 0) {
                        jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                        i13 &= -7169;
                    } else {
                        jM5104getToolBar0d7_KjU = j10;
                    }
                    if (i21 != 0) {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    } else {
                        listEmptyList = list;
                    }
                    if (i22 != 0) {
                        f11 = 0.0f;
                    } else {
                        f11 = f10;
                    }
                    if ((i12 & 64) != 0) {
                        statusNotificationState3 = new StatusNotificationState(null, 0, false, 7, null);
                        i13 &= -3670017;
                    } else {
                        statusNotificationState3 = statusNotificationState2;
                    }
                    if (i14 != 0) {
                        function2 = null;
                    } else {
                        function2 = function0;
                    }
                    if (i16 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    statusNotificationState4 = statusNotificationState3;
                    i18 = i13;
                    j11 = jM5104getToolBar0d7_KjU;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-38744762, i18, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:108)");
                }
                int i27 = i18 >> 3;
                m4986TopAppBarlVb_Clg(modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1314098334, true, new e(i10, num)), j11, f11, listEmptyList, statusNotificationState4, function2, function3, composerStartRestartGroup, ((i18 >> 6) & 7168) | 32816 | (i18 & 14) | (i27 & 896) | (458752 & i27) | (i27 & 3670016) | (i27 & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f10 = f11;
                list2 = listEmptyList;
                statusNotificationState5 = statusNotificationState4;
                function4 = function2;
                function5 = function3;
                modifier3 = modifier2;
                j12 = j11;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new f(f10, i10, i11, i12, j12, modifier3, statusNotificationState5, num, list2, function4, function5));
            }
        }
        i17 = 100663296;
        i13 |= i17;
        if (i21 != 16) {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i12 & 8) != 0) {
                    jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                    i13 &= -7169;
                } else {
                    jM5104getToolBar0d7_KjU = j10;
                }
                if (i21 != 0) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i22 != 0) {
                    f11 = 0.0f;
                } else {
                    f11 = f10;
                }
                if ((i12 & 64) != 0) {
                    statusNotificationState3 = new StatusNotificationState(null, 0, false, 7, null);
                    i13 &= -3670017;
                } else {
                    statusNotificationState3 = statusNotificationState2;
                }
                if (i14 != 0) {
                    function2 = null;
                } else {
                    function2 = function0;
                }
                if (i16 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                statusNotificationState4 = statusNotificationState3;
                i18 = i13;
                j11 = jM5104getToolBar0d7_KjU;
            } else {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i12 & 8) != 0) {
                    jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                    i13 &= -7169;
                } else {
                    jM5104getToolBar0d7_KjU = j10;
                }
                if (i21 != 0) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i22 != 0) {
                    f11 = 0.0f;
                } else {
                    f11 = f10;
                }
                if ((i12 & 64) != 0) {
                    statusNotificationState3 = new StatusNotificationState(null, 0, false, 7, null);
                    i13 &= -3670017;
                } else {
                    statusNotificationState3 = statusNotificationState2;
                }
                if (i14 != 0) {
                    function2 = null;
                } else {
                    function2 = function0;
                }
                if (i16 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                statusNotificationState4 = statusNotificationState3;
                i18 = i13;
                j11 = jM5104getToolBar0d7_KjU;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-38744762, i18, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:108)");
            }
            int i28 = i18 >> 3;
            m4986TopAppBarlVb_Clg(modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1314098334, true, new e(i10, num)), j11, f11, listEmptyList, statusNotificationState4, function2, function3, composerStartRestartGroup, ((i18 >> 6) & 7168) | 32816 | (i18 & 14) | (i28 & 896) | (458752 & i28) | (i28 & 3670016) | (i28 & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f10 = f11;
            list2 = listEmptyList;
            statusNotificationState5 = statusNotificationState4;
            function4 = function2;
            function5 = function3;
            modifier3 = modifier2;
            j12 = j11;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i12 & 8) != 0) {
                    jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                    i13 &= -7169;
                } else {
                    jM5104getToolBar0d7_KjU = j10;
                }
                if (i21 != 0) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i22 != 0) {
                    f11 = 0.0f;
                } else {
                    f11 = f10;
                }
                if ((i12 & 64) != 0) {
                    statusNotificationState3 = new StatusNotificationState(null, 0, false, 7, null);
                    i13 &= -3670017;
                } else {
                    statusNotificationState3 = statusNotificationState2;
                }
                if (i14 != 0) {
                    function2 = null;
                } else {
                    function2 = function0;
                }
                if (i16 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                statusNotificationState4 = statusNotificationState3;
                i18 = i13;
                j11 = jM5104getToolBar0d7_KjU;
            } else {
                if (i20 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i12 & 8) != 0) {
                    jM5104getToolBar0d7_KjU = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).m5104getToolBar0d7_KjU();
                    i13 &= -7169;
                } else {
                    jM5104getToolBar0d7_KjU = j10;
                }
                if (i21 != 0) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    listEmptyList = list;
                }
                if (i22 != 0) {
                    f11 = 0.0f;
                } else {
                    f11 = f10;
                }
                if ((i12 & 64) != 0) {
                    statusNotificationState3 = new StatusNotificationState(null, 0, false, 7, null);
                    i13 &= -3670017;
                } else {
                    statusNotificationState3 = statusNotificationState2;
                }
                if (i14 != 0) {
                    function2 = null;
                } else {
                    function2 = function0;
                }
                if (i16 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                statusNotificationState4 = statusNotificationState3;
                i18 = i13;
                j11 = jM5104getToolBar0d7_KjU;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-38744762, i18, -1, "com.bbva.ui.compose.TopAppBar (TopAppBar.kt:108)");
            }
            int i29 = i18 >> 3;
            m4986TopAppBarlVb_Clg(modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1314098334, true, new e(i10, num)), j11, f11, listEmptyList, statusNotificationState4, function2, function3, composerStartRestartGroup, ((i18 >> 6) & 7168) | 32816 | (i18 & 14) | (i29 & 896) | (458752 & i29) | (i29 & 3670016) | (i29 & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f10 = f11;
            list2 = listEmptyList;
            statusNotificationState5 = statusNotificationState4;
            function4 = function2;
            function5 = function3;
            modifier3 = modifier2;
            j12 = j11;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new f(f10, i10, i11, i12, j12, modifier3, statusNotificationState5, num, list2, function4, function5));
        }
    }
}
