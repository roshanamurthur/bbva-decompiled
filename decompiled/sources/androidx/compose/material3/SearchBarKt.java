package androidx.compose.material3;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.shape.GenericShape;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SearchBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a\u008a\u0002\u0010 \u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\r¢\u0006\u0002\b\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0080\u0002\u0010#\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\r¢\u0006\u0002\b\u001cH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"\"\u001d\u0010(\u001a\u00020\u00158\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u001d\u0010+\u001a\u00020\u00158\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'\"\u001d\u0010.\u001a\u00020\u00158\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006/"}, d2 = {"", SearchIntents.EXTRA_QUERY, "Lkotlin/Function1;", "", "onQueryChange", "onSearch", "", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "onActiveChange", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material3/SearchBarColors;", "colors", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "content", "SearchBar-Id_Pb_0", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FLandroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "SearchBar", "DockedSearchBar-rpjkMjA", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SearchBarColors;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "DockedSearchBar", "b", "F", "getDockedActiveTableMinHeight", "()F", "DockedActiveTableMinHeight", "c", "getSearchBarMinWidth", "SearchBarMinWidth", "e", "getSearchBarVerticalPadding", "SearchBarVerticalPadding", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,746:1\n25#2:747\n25#2:756\n50#2:763\n49#2:764\n25#2:771\n36#2:778\n50#2:785\n49#2:786\n50#2:793\n49#2:794\n36#2:801\n25#2:808\n36#2:816\n25#2:823\n25#2:830\n36#2:840\n83#2,3:847\n50#2:857\n49#2:858\n1114#3,6:748\n1114#3,6:757\n1114#3,6:765\n1114#3,6:772\n1114#3,6:779\n1114#3,6:787\n1114#3,6:795\n1114#3,6:802\n1114#3,6:809\n1114#3,6:817\n1114#3,6:824\n1114#3,6:831\n1114#3,6:841\n1114#3,6:850\n1114#3,6:859\n76#4:754\n76#4:755\n76#4:815\n76#4:837\n76#4:856\n658#5:838\n646#5:839\n76#6:865\n75#7:866\n154#8:867\n154#8:868\n154#8:869\n154#8:870\n154#8:871\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt\n*L\n175#1:747\n188#1:756\n191#1:763\n191#1:764\n211#1:771\n212#1:778\n226#1:785\n226#1:786\n230#1:793\n230#1:794\n292#1:801\n357#1:808\n416#1:816\n435#1:823\n437#1:830\n451#1:840\n452#1:847,3\n467#1:857\n467#1:858\n175#1:748,6\n188#1:757,6\n191#1:765,6\n211#1:772,6\n212#1:779,6\n226#1:787,6\n230#1:795,6\n292#1:802,6\n357#1:809,6\n416#1:817,6\n435#1:824,6\n437#1:831,6\n451#1:841,6\n452#1:850,6\n467#1:859,6\n183#1:754\n184#1:755\n360#1:815\n440#1:837\n464#1:856\n440#1:838\n440#1:839\n188#1:865\n707#1:866\n708#1:867\n710#1:868\n711#1:869\n712#1:870\n714#1:871\n*E\n"})
public final class SearchBarKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f11164a = Dp.m4389constructorimpl(SearchBarDefaults.INSTANCE.m1230getInputFieldHeightD9Ej5fM() / 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f11165b = Dp.m4389constructorimpl(240);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f11166c = Dp.m4389constructorimpl(360);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f11167d = Dp.m4389constructorimpl(720);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f11168e = Dp.m4389constructorimpl(8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f11169f = Dp.m4389constructorimpl(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final TweenSpec f11170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final TweenSpec f11171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final EnterTransition f11172i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final ExitTransition f11173j;

    /* JADX INFO: compiled from: SearchBar.kt */
    @SourceDebugExtension({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$DockedSearchBar$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,746:1\n73#2,7:747\n80#2:780\n84#2:785\n75#3:754\n76#3,11:756\n89#3:784\n76#4:755\n460#5,13:767\n473#5,3:781\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$DockedSearchBar$2\n*L\n371#1:747,7\n371#1:780\n371#1:785\n371#1:754\n371#1:756,11\n371#1:784\n371#1:755\n371#1:767,13\n371#1:781,3\n*E\n"})
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ MutableInteractionSource E0;
        public final /* synthetic */ int F0;
        public final /* synthetic */ int G0;
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> H0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f11174p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f11175q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f11176r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f11177s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f11178t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ boolean f11179u0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11180w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11181x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ SearchBarColors f11182y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, Function1<? super String, Unit> function1, Function1<? super String, Unit> function2, boolean z10, Function1<? super Boolean, Unit> function3, boolean z11, Function2<? super Composer, ? super Integer, Unit> function4, Function2<? super Composer, ? super Integer, Unit> function5, Function2<? super Composer, ? super Integer, Unit> function6, SearchBarColors searchBarColors, MutableInteractionSource mutableInteractionSource, int i10, int i11, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function7) {
            super(2);
            this.f11174p0 = str;
            this.f11175q0 = function1;
            this.f11176r0 = function2;
            this.f11177s0 = z10;
            this.f11178t0 = function3;
            this.f11179u0 = z11;
            this.v0 = function4;
            this.f11180w0 = function5;
            this.f11181x0 = function6;
            this.f11182y0 = searchBarColors;
            this.E0 = mutableInteractionSource;
            this.F0 = i10;
            this.G0 = i11;
            this.H0 = function7;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1764436203, iIntValue, -1, "androidx.compose.material3.DockedSearchBar.<anonymous> (SearchBar.kt:369)");
                }
                String str = this.f11174p0;
                Function1<String, Unit> function1 = this.f11175q0;
                Function1<String, Unit> function2 = this.f11176r0;
                boolean z10 = this.f11177s0;
                Function1<Boolean, Unit> function3 = this.f11178t0;
                boolean z11 = this.f11179u0;
                Function2<Composer, Integer, Unit> function4 = this.v0;
                Function2<Composer, Integer, Unit> function5 = this.f11180w0;
                Function2<Composer, Integer, Unit> function6 = this.f11181x0;
                MutableInteractionSource mutableInteractionSource = this.E0;
                composer2.startReplaceableGroup(-483455358);
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyA = androidx.camera.core.impl.v.a(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composer2, 0, -1323940314);
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
                ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion2, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                SearchBarColors searchBarColors = this.f11182y0;
                TextFieldColors inputFieldColors = searchBarColors.getInputFieldColors();
                int i10 = this.F0;
                int i11 = this.G0;
                SearchBarKt.access$SearchBarInputField(str, function1, function2, z10, function3, null, z11, function4, function5, function6, inputFieldColors, mutableInteractionSource, composer2, (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (3670016 & i10) | (29360128 & i10) | (234881024 & i10) | (1879048192 & i10), (i11 >> 6) & 112, 32);
                AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z10, (Modifier) null, SearchBarKt.f11172i, SearchBarKt.f11173j, (String) null, ComposableLambdaKt.composableLambda(composer2, 393964167, true, new e3(searchBarColors, this.H0, i11)), composer2, 1600518 | ((i10 >> 6) & 112), 18);
                if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SearchBar.kt */
    @DebugMetadata(c = "androidx.compose.material3.SearchBarKt$DockedSearchBar$3", f = "SearchBar.kt", i = {}, l = {411}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f11183p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f11184q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ FocusManager f11185r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, FocusManager focusManager, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f11184q0 = z10;
            this.f11185r0 = focusManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.f11184q0, this.f11185r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f11183p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                if (!this.f11184q0) {
                    this.f11183p0 = 1;
                    if (DelayKt.delay(100L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            x0.d.a(this.f11185r0, false, 1, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SearchBar.kt */
    public static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f11186p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super Boolean, Unit> function1) {
            super(0);
            this.f11186p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f11186p0.invoke(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SearchBar.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Shape E0;
        public final /* synthetic */ SearchBarColors F0;
        public final /* synthetic */ float G0;
        public final /* synthetic */ MutableInteractionSource H0;
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> I0;
        public final /* synthetic */ int J0;
        public final /* synthetic */ int K0;
        public final /* synthetic */ int L0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f11187p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f11188q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f11189r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f11190s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f11191t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11192u0;
        public final /* synthetic */ boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11193w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11194x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11195y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, Function1<? super String, Unit> function1, Function1<? super String, Unit> function2, boolean z10, Function1<? super Boolean, Unit> function3, Modifier modifier, boolean z11, Function2<? super Composer, ? super Integer, Unit> function4, Function2<? super Composer, ? super Integer, Unit> function5, Function2<? super Composer, ? super Integer, Unit> function6, Shape shape, SearchBarColors searchBarColors, float f6, MutableInteractionSource mutableInteractionSource, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function7, int i10, int i11, int i12) {
            super(2);
            this.f11187p0 = str;
            this.f11188q0 = function1;
            this.f11189r0 = function2;
            this.f11190s0 = z10;
            this.f11191t0 = function3;
            this.f11192u0 = modifier;
            this.v0 = z11;
            this.f11193w0 = function4;
            this.f11194x0 = function5;
            this.f11195y0 = function6;
            this.E0 = shape;
            this.F0 = searchBarColors;
            this.G0 = f6;
            this.H0 = mutableInteractionSource;
            this.I0 = function7;
            this.J0 = i10;
            this.K0 = i11;
            this.L0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            SearchBarKt.m1233DockedSearchBarrpjkMjA(this.f11187p0, this.f11188q0, this.f11189r0, this.f11190s0, this.f11191t0, this.f11192u0, this.v0, this.f11193w0, this.f11194x0, this.f11195y0, this.E0, this.F0, this.G0, this.H0, this.I0, composer, RecomposeScopeImplKt.updateChangedFlags(this.J0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.K0), this.L0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SearchBar.kt */
    public static final class e extends Lambda implements Function1<WindowInsets, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ l0.m2 f11196p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ WindowInsets f11197q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(l0.m2 m2Var, WindowInsets windowInsets) {
            super(1);
            this.f11196p0 = m2Var;
            this.f11197q0 = windowInsets;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(WindowInsets windowInsets) {
            WindowInsets consumedInsets = windowInsets;
            Intrinsics.checkNotNullParameter(consumedInsets, "consumedInsets");
            WindowInsets windowInsetsExclude = WindowInsetsKt.exclude(this.f11197q0, consumedInsets);
            l0.m2 m2Var = this.f11196p0;
            m2Var.getClass();
            Intrinsics.checkNotNullParameter(windowInsetsExclude, "<set-?>");
            m2Var.f82700a.setValue(windowInsetsExclude);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SearchBar.kt */
    @SourceDebugExtension({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$SearchBar$3$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,746:1\n154#2:747\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$SearchBar$3$1\n*L\n232#1:747\n*E\n"})
    public static final class f extends Lambda implements Function3<MeasureScope, Measurable, Constraints, MeasureResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ State<Dp> f11198p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f11199q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(State<Dp> state, State<Float> state2) {
            super(3);
            this.f11198p0 = state;
            this.f11199q0 = state2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
            MeasureScope layout = measureScope;
            Measurable measurable2 = measurable;
            long f18296a = constraints.getF18296a();
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Intrinsics.checkNotNullParameter(measurable2, "measurable");
            float fM4403unboximpl = this.f11198p0.getValue().m4403unboximpl();
            float fM4389constructorimpl = Dp.m4389constructorimpl(0);
            State<Float> state = this.f11199q0;
            int iMo413roundToPx0680j_4 = layout.mo413roundToPx0680j_4(DpKt.m4432lerpMdfbLM(fM4403unboximpl, fM4389constructorimpl, state.getValue().floatValue()));
            int iCoerceAtMost = kotlin.ranges.c.coerceAtMost(Math.max(Constraints.m4359getMinWidthimpl(f18296a), layout.mo413roundToPx0680j_4(SearchBarKt.getSearchBarMinWidth())), Math.min(Constraints.m4357getMaxWidthimpl(f18296a), layout.mo413roundToPx0680j_4(SearchBarKt.f11167d)));
            int iCoerceAtMost2 = kotlin.ranges.c.coerceAtMost(Math.max(Constraints.m4358getMinHeightimpl(f18296a), layout.mo413roundToPx0680j_4(SearchBarDefaults.INSTANCE.m1230getInputFieldHeightD9Ej5fM())), Constraints.m4356getMaxHeightimpl(f18296a));
            int iM4357getMaxWidthimpl = Constraints.m4357getMaxWidthimpl(f18296a);
            int iM4356getMaxHeightimpl = Constraints.m4356getMaxHeightimpl(f18296a);
            int iLerp = MathHelpersKt.lerp(iCoerceAtMost, iM4357getMaxWidthimpl, state.getValue().floatValue());
            int iLerp2 = MathHelpersKt.lerp(iCoerceAtMost2, iM4356getMaxHeightimpl, state.getValue().floatValue()) + iMo413roundToPx0680j_4;
            return MeasureScope.CC.q(layout, iLerp, iLerp2, null, new f3(iMo413roundToPx0680j_4, measurable2.mo3575measureBRTryo0(ConstraintsKt.m4374offsetNN6EwU$default(Constraints.INSTANCE.m4365fixedJhjzzOo(iLerp, iLerp2), 0, -iMo413roundToPx0680j_4, 1, null))), 4, null);
        }
    }

    /* JADX INFO: compiled from: SearchBar.kt */
    @SourceDebugExtension({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$SearchBar$4\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,746:1\n73#2,7:747\n80#2:780\n74#2,6:802\n80#2:834\n84#2:839\n84#2:844\n75#3:754\n76#3,11:756\n75#3:808\n76#3,11:810\n89#3:838\n89#3:843\n76#4:755\n76#4:809\n460#5,13:767\n25#5:781\n25#5:788\n36#5:795\n460#5,13:821\n473#5,3:835\n473#5,3:840\n1114#6,6:782\n1114#6,6:789\n1114#6,6:796\n76#7:845\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$SearchBar$4\n*L\n252#1:747,7\n252#1:780\n275#1:802,6\n275#1:834\n275#1:839\n252#1:844\n252#1:754\n252#1:756,11\n275#1:808\n275#1:810,11\n275#1:838\n252#1:843\n252#1:755\n275#1:809\n252#1:767,13\n253#1:781\n271#1:788\n275#1:795\n275#1:821,13\n275#1:835,3\n252#1:840,3\n253#1:782,6\n271#1:789,6\n275#1:796,6\n271#1:845\n*E\n"})
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ MutableInteractionSource E0;
        public final /* synthetic */ int F0;
        public final /* synthetic */ int G0;
        public final /* synthetic */ State<Float> H0;
        public final /* synthetic */ State<Dp> I0;
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> J0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f11200p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f11201q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f11202r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f11203s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f11204t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ boolean f11205u0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11206w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11207x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ SearchBarColors f11208y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(String str, Function1<? super String, Unit> function1, Function1<? super String, Unit> function2, boolean z10, Function1<? super Boolean, Unit> function3, boolean z11, Function2<? super Composer, ? super Integer, Unit> function4, Function2<? super Composer, ? super Integer, Unit> function5, Function2<? super Composer, ? super Integer, Unit> function6, SearchBarColors searchBarColors, MutableInteractionSource mutableInteractionSource, int i10, int i11, State<Float> state, State<Dp> state2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function7) {
            super(2);
            this.f11200p0 = str;
            this.f11201q0 = function1;
            this.f11202r0 = function2;
            this.f11203s0 = z10;
            this.f11204t0 = function3;
            this.f11205u0 = z11;
            this.v0 = function4;
            this.f11206w0 = function5;
            this.f11207x0 = function6;
            this.f11208y0 = searchBarColors;
            this.E0 = mutableInteractionSource;
            this.F0 = i10;
            this.G0 = i11;
            this.H0 = state;
            this.I0 = state2;
            this.J0 = function7;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            State<Float> state;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-867266817, iIntValue, -1, "androidx.compose.material3.SearchBar.<anonymous> (SearchBar.kt:250)");
                }
                String str = this.f11200p0;
                Function1<String, Unit> function1 = this.f11201q0;
                Function1<String, Unit> function2 = this.f11202r0;
                boolean z10 = this.f11203s0;
                Function1<Boolean, Unit> function3 = this.f11204t0;
                boolean z11 = this.f11205u0;
                Function2<Composer, Integer, Unit> function4 = this.v0;
                Function2<Composer, Integer, Unit> function5 = this.f11206w0;
                Function2<Composer, Integer, Unit> function6 = this.f11207x0;
                MutableInteractionSource mutableInteractionSource = this.E0;
                composer2.startReplaceableGroup(-483455358);
                Modifier.Companion companion = Modifier.INSTANCE;
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyA = androidx.camera.core.impl.v.a(companion2, top, composer2, 0, -1323940314);
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion);
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
                Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl, measurePolicyA, composerM2074constructorimpl, density));
                ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl, viewConfiguration, composer2, composer2), composer2, 2058660585);
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer2.rememberedValue();
                Composer.Companion companion4 = Composer.INSTANCE;
                Object empty = companion4.getEmpty();
                State<Float> state2 = this.H0;
                if (objRememberedValue == empty) {
                    objRememberedValue = new l0.b(state2, this.I0);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                Modifier modifierPadding = PaddingKt.padding(companion, (l0.b) objRememberedValue);
                SearchBarColors searchBarColors = this.f11208y0;
                TextFieldColors inputFieldColors = searchBarColors.getInputFieldColors();
                int i10 = this.F0;
                int i11 = (i10 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (3670016 & i10) | (29360128 & i10) | (234881024 & i10) | (i10 & 1879048192);
                int i12 = this.G0;
                SearchBarKt.access$SearchBarInputField(str, function1, function2, z10, function3, modifierPadding, z11, function4, function5, function6, inputFieldColors, mutableInteractionSource, composer2, i11, (i12 >> 9) & 112, 0);
                composer2.startReplaceableGroup(-492369756);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (objRememberedValue2 == companion4.getEmpty()) {
                    state = state2;
                    objRememberedValue2 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new h3(state));
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    state = state2;
                }
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(551421060);
                if (((Boolean) ((State) objRememberedValue2).getValue()).booleanValue()) {
                    composer2.startReplaceableGroup(1157296644);
                    boolean zChanged = composer2.changed(state);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue3 == companion4.getEmpty()) {
                        objRememberedValue3 = new g3(state);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (Function1) objRememberedValue3);
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyA2 = androidx.camera.core.impl.v.a(companion2, arrangement.getTop(), composer2, 0, -1323940314);
                    Density density2 = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection2 = (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) composer2.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierGraphicsLayer);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    composer2.disableReusing();
                    Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composer2);
                    Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl2, measurePolicyA2, composerM2074constructorimpl2, density2));
                    ai.a.j(0, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl2, viewConfiguration2, composer2, composer2), composer2, 2058660585);
                    DividerKt.m1083Divider9IZ8Weo(null, 0.0f, searchBarColors.getDividerColor(), composer2, 0, 3);
                    this.J0.invoke(columnScopeInstance, composer2, Integer.valueOf(((i12 >> 12) & 112) | 6));
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                }
                if (androidx.databinding.e.e(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SearchBar.kt */
    @DebugMetadata(c = "androidx.compose.material3.SearchBarKt$SearchBar$5", f = "SearchBar.kt", i = {}, l = {287}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f11209p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f11210q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ FocusManager f11211r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z10, FocusManager focusManager, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f11210q0 = z10;
            this.f11211r0 = focusManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new h(this.f11210q0, this.f11211r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f11209p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                if (!this.f11210q0) {
                    this.f11209p0 = 1;
                    if (DelayKt.delay(100L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            x0.d.a(this.f11211r0, false, 1, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SearchBar.kt */
    public static final class i extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f11212p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(Function1<? super Boolean, Unit> function1) {
            super(0);
            this.f11212p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f11212p0.invoke(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SearchBar.kt */
    public static final class j extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Shape E0;
        public final /* synthetic */ SearchBarColors F0;
        public final /* synthetic */ float G0;
        public final /* synthetic */ WindowInsets H0;
        public final /* synthetic */ MutableInteractionSource I0;
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> J0;
        public final /* synthetic */ int K0;
        public final /* synthetic */ int L0;
        public final /* synthetic */ int M0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f11213p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f11214q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<String, Unit> f11215r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f11216s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f11217t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11218u0;
        public final /* synthetic */ boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11219w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11220x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11221y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(String str, Function1<? super String, Unit> function1, Function1<? super String, Unit> function2, boolean z10, Function1<? super Boolean, Unit> function3, Modifier modifier, boolean z11, Function2<? super Composer, ? super Integer, Unit> function4, Function2<? super Composer, ? super Integer, Unit> function5, Function2<? super Composer, ? super Integer, Unit> function6, Shape shape, SearchBarColors searchBarColors, float f6, WindowInsets windowInsets, MutableInteractionSource mutableInteractionSource, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function7, int i10, int i11, int i12) {
            super(2);
            this.f11213p0 = str;
            this.f11214q0 = function1;
            this.f11215r0 = function2;
            this.f11216s0 = z10;
            this.f11217t0 = function3;
            this.f11218u0 = modifier;
            this.v0 = z11;
            this.f11219w0 = function4;
            this.f11220x0 = function5;
            this.f11221y0 = function6;
            this.E0 = shape;
            this.F0 = searchBarColors;
            this.G0 = f6;
            this.H0 = windowInsets;
            this.I0 = mutableInteractionSource;
            this.J0 = function7;
            this.K0 = i10;
            this.L0 = i11;
            this.M0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            SearchBarKt.m1234SearchBarId_Pb_0(this.f11213p0, this.f11214q0, this.f11215r0, this.f11216s0, this.f11217t0, this.f11218u0, this.v0, this.f11219w0, this.f11220x0, this.f11221y0, this.E0, this.F0, this.G0, this.H0, this.I0, this.J0, composer, RecomposeScopeImplKt.updateChangedFlags(this.K0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.L0), this.M0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SearchBar.kt */
    @SourceDebugExtension({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$SearchBar$animatedShape$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,746:1\n88#2:747\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$SearchBar$animatedShape$1$1\n*L\n197#1:747\n*E\n"})
    public static final class k extends Lambda implements Function3<Path, Size, LayoutDirection, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Density f11222p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f11223q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Density density, State<Float> state) {
            super(3);
            this.f11222p0 = density;
            this.f11223q0 = state;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Path path, Size size, LayoutDirection layoutDirection) {
            Path $receiver = path;
            long f15551a = size.getF15551a();
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            Intrinsics.checkNotNullParameter(layoutDirection, "<anonymous parameter 1>");
            $receiver.addRoundRect(RoundRectKt.m2330RoundRectsniSvfs(SizeKt.m2365toRectuvyYCjk(f15551a), CornerRadiusKt.CornerRadius$default(this.f11222p0.mo415toPx0680j_4(Dp.m4389constructorimpl((1 - this.f11223q0.getValue().floatValue()) * SearchBarKt.f11164a)), 0.0f, 2, null)));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SearchBar.kt */
    @SourceDebugExtension({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$SearchBar$topPadding$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,746:1\n51#2:747\n*S KotlinDebug\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$SearchBar$topPadding$1$1\n*L\n214#1:747\n*E\n"})
    public static final class l extends Lambda implements Function0<Dp> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ l0.m2 f11224p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Density f11225q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(l0.m2 m2Var, Density density) {
            super(0);
            this.f11224p0 = m2Var;
            this.f11225q0 = density;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Dp invoke() {
            return Dp.m4387boximpl(Dp.m4389constructorimpl(WindowInsetsKt.asPaddingValues(this.f11224p0, this.f11225q0).getTop() + SearchBarKt.getSearchBarVerticalPadding()));
        }
    }

    /* JADX INFO: compiled from: SearchBar.kt */
    public static final class m extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f11226p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(State<Float> state) {
            super(0);
            this.f11226p0 = state;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(this.f11226p0.getValue().floatValue() == 1.0f);
        }
    }

    static {
        CubicBezierEasing easingEmphasizedDecelerateCubicBezier = MotionTokens.INSTANCE.getEasingEmphasizedDecelerateCubicBezier();
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.0f, 1.0f, 0.0f, 1.0f);
        TweenSpec tweenSpecTween = AnimationSpecKt.tween(600, 100, easingEmphasizedDecelerateCubicBezier);
        f11170g = tweenSpecTween;
        TweenSpec tweenSpecTween2 = AnimationSpecKt.tween(ResultCode.ERROR_CONN_SSL_GENERIC, 100, cubicBezierEasing);
        f11171h = tweenSpecTween2;
        TweenSpec tweenSpecTween3 = AnimationSpecKt.tween(600, 100, easingEmphasizedDecelerateCubicBezier);
        TweenSpec tweenSpecTween4 = AnimationSpecKt.tween(ResultCode.ERROR_CONN_SSL_GENERIC, 100, cubicBezierEasing);
        f11172i = EnterExitTransitionKt.fadeIn$default(tweenSpecTween, 0.0f, 2, null).plus(EnterExitTransitionKt.expandVertically$default(tweenSpecTween3, null, false, null, 14, null));
        f11173j = EnterExitTransitionKt.fadeOut$default(tweenSpecTween2, 0.0f, 2, null).plus(EnterExitTransitionKt.shrinkVertically$default(tweenSpecTween4, null, false, null, 14, null));
    }

    /* JADX WARN: Code duplicated, block: B:138:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:149:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:163:0x020e  */
    /* JADX WARN: Code duplicated, block: B:165:0x0215  */
    /* JADX WARN: Code duplicated, block: B:175:0x0240 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:176:0x0242  */
    /* JADX WARN: Code duplicated, block: B:177:0x0245  */
    /* JADX WARN: Code duplicated, block: B:179:0x0249  */
    /* JADX WARN: Code duplicated, block: B:180:0x024b  */
    /* JADX WARN: Code duplicated, block: B:182:0x024f  */
    /* JADX WARN: Code duplicated, block: B:183:0x0251  */
    /* JADX WARN: Code duplicated, block: B:185:0x0255  */
    /* JADX WARN: Code duplicated, block: B:186:0x0257  */
    /* JADX WARN: Code duplicated, block: B:188:0x025b  */
    /* JADX WARN: Code duplicated, block: B:189:0x025d  */
    /* JADX WARN: Code duplicated, block: B:192:0x0263  */
    /* JADX WARN: Code duplicated, block: B:193:0x026d  */
    /* JADX WARN: Code duplicated, block: B:196:0x0274  */
    /* JADX WARN: Code duplicated, block: B:197:0x0289  */
    /* JADX WARN: Code duplicated, block: B:199:0x028d  */
    /* JADX WARN: Code duplicated, block: B:200:0x0294  */
    /* JADX WARN: Code duplicated, block: B:202:0x0298  */
    /* JADX WARN: Code duplicated, block: B:204:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:207:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:210:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:213:0x038e  */
    /* JADX WARN: Code duplicated, block: B:215:0x0396  */
    /* JADX WARN: Code duplicated, block: B:218:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:223:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:225:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: DockedSearchBar-rpjkMjA, reason: not valid java name */
    public static final void m1233DockedSearchBarrpjkMjA(@NotNull String query, @NotNull Function1<? super String, Unit> onQueryChange, @NotNull Function1<? super String, Unit> onSearch, boolean z10, @NotNull Function1<? super Boolean, Unit> onActiveChange, @Nullable Modifier modifier, boolean z11, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function4, @Nullable Shape shape, @Nullable SearchBarColors searchBarColors, float f6, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        Modifier modifier2;
        boolean z12;
        Function2<? super Composer, ? super Integer, Unit> function5;
        Function2<? super Composer, ? super Integer, Unit> function6;
        Function2<? super Composer, ? super Integer, Unit> function7;
        Shape dockedShape;
        SearchBarColors searchBarColorsM1228colorsKlgxPg;
        float fM1229getElevationD9Ej5fM;
        Function2<? super Composer, ? super Integer, Unit> function8;
        MutableInteractionSource mutableInteractionSource2;
        Function2<? super Composer, ? super Integer, Unit> function9;
        Function2<? super Composer, ? super Integer, Unit> function10;
        boolean z13;
        float f10;
        Shape shape2;
        SearchBarColors searchBarColors2;
        int i16;
        Modifier modifier3;
        Object objRememberedValue;
        Composer composer2;
        boolean zChanged;
        Object objRememberedValue2;
        Modifier modifier4;
        boolean z14;
        Function2<? super Composer, ? super Integer, Unit> function11;
        Function2<? super Composer, ? super Integer, Unit> function12;
        Function2<? super Composer, ? super Integer, Unit> function13;
        Shape shape3;
        SearchBarColors searchBarColors3;
        float f11;
        MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(onQueryChange, "onQueryChange");
        Intrinsics.checkNotNullParameter(onSearch, "onSearch");
        Intrinsics.checkNotNullParameter(onActiveChange, "onActiveChange");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-451213062);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i13 = (composerStartRestartGroup.changed(query) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 112) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(onQueryChange) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(onSearch) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i13 |= composerStartRestartGroup.changed(z10) ? 2048 : 1024;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i10 & 57344) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(onActiveChange) ? 16384 : 8192;
        }
        int i17 = i12 & 32;
        if (i17 != 0) {
            i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i10 & 458752) == 0) {
            i13 |= composerStartRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        int i18 = i12 & 64;
        if (i18 != 0) {
            i13 |= 1572864;
        } else if ((i10 & 3670016) == 0) {
            i13 |= composerStartRestartGroup.changed(z11) ? 1048576 : 524288;
        }
        int i19 = i12 & 128;
        if (i19 != 0) {
            i13 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        }
        int i20 = i12 & 256;
        if (i20 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i21 = i12 & 512;
        if (i21 != 0) {
            i13 |= 805306368;
        } else if ((i10 & 1879048192) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function4) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i11 & 14) == 0) {
            i14 = i11 | (((i12 & 1024) == 0 && composerStartRestartGroup.changed(shape)) ? 4 : 2);
        } else {
            i14 = i11;
        }
        if ((i11 & 112) == 0) {
            i14 |= ((i12 & 2048) == 0 && composerStartRestartGroup.changed(searchBarColors)) ? 32 : 16;
        }
        int i22 = i14;
        int i23 = i12 & 4096;
        if (i23 == 0) {
            if ((i11 & 896) == 0) {
                i22 |= composerStartRestartGroup.changed(f6) ? 256 : 128;
            }
            i15 = i12 & 8192;
            if (i15 != 0) {
                if ((i11 & 7168) == 0) {
                    i22 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
                }
                if ((i12 & 16384) != 0) {
                    i22 |= 24576;
                } else if ((i11 & 57344) == 0) {
                    i22 |= composerStartRestartGroup.changedInstance(content) ? 16384 : 8192;
                }
                if ((1533916891 & i13) != 306783378 && (46811 & i22) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    z14 = z11;
                    function11 = function2;
                    function12 = function3;
                    function13 = function4;
                    shape3 = shape;
                    searchBarColors3 = searchBarColors;
                    f11 = f6;
                    mutableInteractionSource3 = mutableInteractionSource;
                    composer2 = composerStartRestartGroup;
                    modifier4 = modifier;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i17 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i18 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i19 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i20 != 0) {
                            function6 = null;
                        } else {
                            function6 = function3;
                        }
                        if (i21 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        if ((i12 & 1024) != 0) {
                            dockedShape = SearchBarDefaults.INSTANCE.getDockedShape(composerStartRestartGroup, 6);
                            i22 &= -15;
                        } else {
                            dockedShape = shape;
                        }
                        if ((i12 & 2048) != 0) {
                            searchBarColorsM1228colorsKlgxPg = SearchBarDefaults.INSTANCE.m1228colorsKlgxPg(0L, 0L, null, composerStartRestartGroup, 3072, 7);
                            i22 &= -113;
                        } else {
                            searchBarColorsM1228colorsKlgxPg = searchBarColors;
                        }
                        if (i23 != 0) {
                            fM1229getElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m1229getElevationD9Ej5fM();
                        } else {
                            fM1229getElevationD9Ej5fM = f6;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            Function2<? super Composer, ? super Integer, Unit> function14 = function6;
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            function8 = function14;
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            function8 = function6;
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        function9 = function7;
                        function10 = function5;
                        z13 = z12;
                        f10 = fM1229getElevationD9Ej5fM;
                        shape2 = dockedShape;
                        searchBarColors2 = searchBarColorsM1228colorsKlgxPg;
                        i16 = i22;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i12 & 1024) != 0) {
                            i22 &= -15;
                        }
                        if ((i12 & 2048) != 0) {
                            i22 &= -113;
                        }
                        modifier3 = modifier;
                        z13 = z11;
                        function10 = function2;
                        function8 = function3;
                        function9 = function4;
                        shape2 = shape;
                        searchBarColors2 = searchBarColors;
                        f10 = f6;
                        mutableInteractionSource2 = mutableInteractionSource;
                        i16 = i22;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-451213062, i13, i16, "androidx.compose.material3.DockedSearchBar (SearchBar.kt:342)");
                    }
                    FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                    long containerColor = searchBarColors2.getContainerColor();
                    long jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(searchBarColors2.getContainerColor(), composerStartRestartGroup, 0);
                    Modifier modifierM340width3ABfNKs = androidx.compose.foundation.layout.SizeKt.m340width3ABfNKs(ZIndexModifierKt.zIndex(modifier3, 1.0f), f11166c);
                    int i24 = i13;
                    Modifier modifier5 = modifier3;
                    composer2 = composerStartRestartGroup;
                    int i25 = i16;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifierM340width3ABfNKs, shape2, containerColor, jM1014contentColorForek8zF_U, f10, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -1764436203, true, new a(query, onQueryChange, onSearch, z10, onActiveChange, z13, function10, function8, function9, searchBarColors2, mutableInteractionSource2, i24, i16, content)), composer2, ((i25 << 3) & 112) | 12582912 | ((i25 << 6) & 57344), 96);
                    int i26 = (i24 >> 9) & 14;
                    EffectsKt.LaunchedEffect(Boolean.valueOf(z10), new b(z10, focusManager, null), composer2, i26 | 64);
                    composer2.startReplaceableGroup(1157296644);
                    zChanged = composer2.changed(onActiveChange);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new c(onActiveChange);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    BackHandlerKt.BackHandler(z10, (Function0) objRememberedValue2, composer2, i26, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier5;
                    z14 = z13;
                    function11 = function10;
                    function12 = function8;
                    function13 = function9;
                    shape3 = shape2;
                    searchBarColors3 = searchBarColors2;
                    f11 = f10;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(query, onQueryChange, onSearch, z10, onActiveChange, modifier4, z14, function11, function12, function13, shape3, searchBarColors3, f11, mutableInteractionSource3, content, i10, i11, i12));
            }
            i22 |= 3072;
            if ((i12 & 16384) != 0) {
                i22 |= 24576;
            } else if ((i11 & 57344) == 0) {
                i22 |= composerStartRestartGroup.changedInstance(content) ? 16384 : 8192;
            }
            if ((1533916891 & i13) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i20 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    if (i21 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if ((i12 & 1024) != 0) {
                        dockedShape = SearchBarDefaults.INSTANCE.getDockedShape(composerStartRestartGroup, 6);
                        i22 &= -15;
                    } else {
                        dockedShape = shape;
                    }
                    if ((i12 & 2048) != 0) {
                        searchBarColorsM1228colorsKlgxPg = SearchBarDefaults.INSTANCE.m1228colorsKlgxPg(0L, 0L, null, composerStartRestartGroup, 3072, 7);
                        i22 &= -113;
                    } else {
                        searchBarColorsM1228colorsKlgxPg = searchBarColors;
                    }
                    if (i23 != 0) {
                        fM1229getElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m1229getElevationD9Ej5fM();
                    } else {
                        fM1229getElevationD9Ej5fM = f6;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        Function2<? super Composer, ? super Integer, Unit> function15 = function6;
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function8 = function15;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        function8 = function6;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    function9 = function7;
                    function10 = function5;
                    z13 = z12;
                    f10 = fM1229getElevationD9Ej5fM;
                    shape2 = dockedShape;
                    searchBarColors2 = searchBarColorsM1228colorsKlgxPg;
                    i16 = i22;
                    modifier3 = modifier2;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i20 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    if (i21 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if ((i12 & 1024) != 0) {
                        dockedShape = SearchBarDefaults.INSTANCE.getDockedShape(composerStartRestartGroup, 6);
                        i22 &= -15;
                    } else {
                        dockedShape = shape;
                    }
                    if ((i12 & 2048) != 0) {
                        searchBarColorsM1228colorsKlgxPg = SearchBarDefaults.INSTANCE.m1228colorsKlgxPg(0L, 0L, null, composerStartRestartGroup, 3072, 7);
                        i22 &= -113;
                    } else {
                        searchBarColorsM1228colorsKlgxPg = searchBarColors;
                    }
                    if (i23 != 0) {
                        fM1229getElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m1229getElevationD9Ej5fM();
                    } else {
                        fM1229getElevationD9Ej5fM = f6;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        Function2<? super Composer, ? super Integer, Unit> function16 = function6;
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function8 = function16;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        function8 = function6;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    function9 = function7;
                    function10 = function5;
                    z13 = z12;
                    f10 = fM1229getElevationD9Ej5fM;
                    shape2 = dockedShape;
                    searchBarColors2 = searchBarColorsM1228colorsKlgxPg;
                    i16 = i22;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-451213062, i13, i16, "androidx.compose.material3.DockedSearchBar (SearchBar.kt:342)");
                }
                FocusManager focusManager2 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                long containerColor2 = searchBarColors2.getContainerColor();
                long jM1014contentColorForek8zF_U2 = ColorSchemeKt.m1014contentColorForek8zF_U(searchBarColors2.getContainerColor(), composerStartRestartGroup, 0);
                Modifier modifierM340width3ABfNKs2 = androidx.compose.foundation.layout.SizeKt.m340width3ABfNKs(ZIndexModifierKt.zIndex(modifier3, 1.0f), f11166c);
                int i27 = i13;
                Modifier modifier6 = modifier3;
                composer2 = composerStartRestartGroup;
                int i28 = i16;
                SurfaceKt.m1329SurfaceT9BRK9s(modifierM340width3ABfNKs2, shape2, containerColor2, jM1014contentColorForek8zF_U2, f10, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -1764436203, true, new a(query, onQueryChange, onSearch, z10, onActiveChange, z13, function10, function8, function9, searchBarColors2, mutableInteractionSource2, i27, i16, content)), composer2, ((i28 << 3) & 112) | 12582912 | ((i28 << 6) & 57344), 96);
                int i29 = (i27 >> 9) & 14;
                EffectsKt.LaunchedEffect(Boolean.valueOf(z10), new b(z10, focusManager2, null), composer2, i29 | 64);
                composer2.startReplaceableGroup(1157296644);
                zChanged = composer2.changed(onActiveChange);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new c(onActiveChange);
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new c(onActiveChange);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                BackHandlerKt.BackHandler(z10, (Function0) objRememberedValue2, composer2, i29, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier6;
                z14 = z13;
                function11 = function10;
                function12 = function8;
                function13 = function9;
                shape3 = shape2;
                searchBarColors3 = searchBarColors2;
                f11 = f10;
                mutableInteractionSource3 = mutableInteractionSource2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i20 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    if (i21 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if ((i12 & 1024) != 0) {
                        dockedShape = SearchBarDefaults.INSTANCE.getDockedShape(composerStartRestartGroup, 6);
                        i22 &= -15;
                    } else {
                        dockedShape = shape;
                    }
                    if ((i12 & 2048) != 0) {
                        searchBarColorsM1228colorsKlgxPg = SearchBarDefaults.INSTANCE.m1228colorsKlgxPg(0L, 0L, null, composerStartRestartGroup, 3072, 7);
                        i22 &= -113;
                    } else {
                        searchBarColorsM1228colorsKlgxPg = searchBarColors;
                    }
                    if (i23 != 0) {
                        fM1229getElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m1229getElevationD9Ej5fM();
                    } else {
                        fM1229getElevationD9Ej5fM = f6;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        Function2<? super Composer, ? super Integer, Unit> function17 = function6;
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function8 = function17;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        function8 = function6;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    function9 = function7;
                    function10 = function5;
                    z13 = z12;
                    f10 = fM1229getElevationD9Ej5fM;
                    shape2 = dockedShape;
                    searchBarColors2 = searchBarColorsM1228colorsKlgxPg;
                    i16 = i22;
                    modifier3 = modifier2;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i20 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    if (i21 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if ((i12 & 1024) != 0) {
                        dockedShape = SearchBarDefaults.INSTANCE.getDockedShape(composerStartRestartGroup, 6);
                        i22 &= -15;
                    } else {
                        dockedShape = shape;
                    }
                    if ((i12 & 2048) != 0) {
                        searchBarColorsM1228colorsKlgxPg = SearchBarDefaults.INSTANCE.m1228colorsKlgxPg(0L, 0L, null, composerStartRestartGroup, 3072, 7);
                        i22 &= -113;
                    } else {
                        searchBarColorsM1228colorsKlgxPg = searchBarColors;
                    }
                    if (i23 != 0) {
                        fM1229getElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m1229getElevationD9Ej5fM();
                    } else {
                        fM1229getElevationD9Ej5fM = f6;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        Function2<? super Composer, ? super Integer, Unit> function18 = function6;
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function8 = function18;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        function8 = function6;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    function9 = function7;
                    function10 = function5;
                    z13 = z12;
                    f10 = fM1229getElevationD9Ej5fM;
                    shape2 = dockedShape;
                    searchBarColors2 = searchBarColorsM1228colorsKlgxPg;
                    i16 = i22;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-451213062, i13, i16, "androidx.compose.material3.DockedSearchBar (SearchBar.kt:342)");
                }
                FocusManager focusManager3 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                long containerColor3 = searchBarColors2.getContainerColor();
                long jM1014contentColorForek8zF_U3 = ColorSchemeKt.m1014contentColorForek8zF_U(searchBarColors2.getContainerColor(), composerStartRestartGroup, 0);
                Modifier modifierM340width3ABfNKs3 = androidx.compose.foundation.layout.SizeKt.m340width3ABfNKs(ZIndexModifierKt.zIndex(modifier3, 1.0f), f11166c);
                int i210 = i13;
                Modifier modifier7 = modifier3;
                composer2 = composerStartRestartGroup;
                int i211 = i16;
                SurfaceKt.m1329SurfaceT9BRK9s(modifierM340width3ABfNKs3, shape2, containerColor3, jM1014contentColorForek8zF_U3, f10, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -1764436203, true, new a(query, onQueryChange, onSearch, z10, onActiveChange, z13, function10, function8, function9, searchBarColors2, mutableInteractionSource2, i210, i16, content)), composer2, ((i211 << 3) & 112) | 12582912 | ((i211 << 6) & 57344), 96);
                int i212 = (i210 >> 9) & 14;
                EffectsKt.LaunchedEffect(Boolean.valueOf(z10), new b(z10, focusManager3, null), composer2, i212 | 64);
                composer2.startReplaceableGroup(1157296644);
                zChanged = composer2.changed(onActiveChange);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new c(onActiveChange);
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new c(onActiveChange);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                BackHandlerKt.BackHandler(z10, (Function0) objRememberedValue2, composer2, i212, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier7;
                z14 = z13;
                function11 = function10;
                function12 = function8;
                function13 = function9;
                shape3 = shape2;
                searchBarColors3 = searchBarColors2;
                f11 = f10;
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(query, onQueryChange, onSearch, z10, onActiveChange, modifier4, z14, function11, function12, function13, shape3, searchBarColors3, f11, mutableInteractionSource3, content, i10, i11, i12));
        }
        i22 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        i15 = i12 & 8192;
        if (i15 != 0) {
            if ((i11 & 7168) == 0) {
                i22 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
            }
            if ((i12 & 16384) != 0) {
                i22 |= 24576;
            } else if ((i11 & 57344) == 0) {
                i22 |= composerStartRestartGroup.changedInstance(content) ? 16384 : 8192;
            }
            if ((1533916891 & i13) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i20 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    if (i21 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if ((i12 & 1024) != 0) {
                        dockedShape = SearchBarDefaults.INSTANCE.getDockedShape(composerStartRestartGroup, 6);
                        i22 &= -15;
                    } else {
                        dockedShape = shape;
                    }
                    if ((i12 & 2048) != 0) {
                        searchBarColorsM1228colorsKlgxPg = SearchBarDefaults.INSTANCE.m1228colorsKlgxPg(0L, 0L, null, composerStartRestartGroup, 3072, 7);
                        i22 &= -113;
                    } else {
                        searchBarColorsM1228colorsKlgxPg = searchBarColors;
                    }
                    if (i23 != 0) {
                        fM1229getElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m1229getElevationD9Ej5fM();
                    } else {
                        fM1229getElevationD9Ej5fM = f6;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        Function2<? super Composer, ? super Integer, Unit> function19 = function6;
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function8 = function19;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        function8 = function6;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    function9 = function7;
                    function10 = function5;
                    z13 = z12;
                    f10 = fM1229getElevationD9Ej5fM;
                    shape2 = dockedShape;
                    searchBarColors2 = searchBarColorsM1228colorsKlgxPg;
                    i16 = i22;
                    modifier3 = modifier2;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i20 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    if (i21 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if ((i12 & 1024) != 0) {
                        dockedShape = SearchBarDefaults.INSTANCE.getDockedShape(composerStartRestartGroup, 6);
                        i22 &= -15;
                    } else {
                        dockedShape = shape;
                    }
                    if ((i12 & 2048) != 0) {
                        searchBarColorsM1228colorsKlgxPg = SearchBarDefaults.INSTANCE.m1228colorsKlgxPg(0L, 0L, null, composerStartRestartGroup, 3072, 7);
                        i22 &= -113;
                    } else {
                        searchBarColorsM1228colorsKlgxPg = searchBarColors;
                    }
                    if (i23 != 0) {
                        fM1229getElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m1229getElevationD9Ej5fM();
                    } else {
                        fM1229getElevationD9Ej5fM = f6;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        Function2<? super Composer, ? super Integer, Unit> function110 = function6;
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function8 = function110;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        function8 = function6;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    function9 = function7;
                    function10 = function5;
                    z13 = z12;
                    f10 = fM1229getElevationD9Ej5fM;
                    shape2 = dockedShape;
                    searchBarColors2 = searchBarColorsM1228colorsKlgxPg;
                    i16 = i22;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-451213062, i13, i16, "androidx.compose.material3.DockedSearchBar (SearchBar.kt:342)");
                }
                FocusManager focusManager4 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                long containerColor4 = searchBarColors2.getContainerColor();
                long jM1014contentColorForek8zF_U4 = ColorSchemeKt.m1014contentColorForek8zF_U(searchBarColors2.getContainerColor(), composerStartRestartGroup, 0);
                Modifier modifierM340width3ABfNKs4 = androidx.compose.foundation.layout.SizeKt.m340width3ABfNKs(ZIndexModifierKt.zIndex(modifier3, 1.0f), f11166c);
                int i213 = i13;
                Modifier modifier8 = modifier3;
                composer2 = composerStartRestartGroup;
                int i214 = i16;
                SurfaceKt.m1329SurfaceT9BRK9s(modifierM340width3ABfNKs4, shape2, containerColor4, jM1014contentColorForek8zF_U4, f10, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -1764436203, true, new a(query, onQueryChange, onSearch, z10, onActiveChange, z13, function10, function8, function9, searchBarColors2, mutableInteractionSource2, i213, i16, content)), composer2, ((i214 << 3) & 112) | 12582912 | ((i214 << 6) & 57344), 96);
                int i215 = (i213 >> 9) & 14;
                EffectsKt.LaunchedEffect(Boolean.valueOf(z10), new b(z10, focusManager4, null), composer2, i215 | 64);
                composer2.startReplaceableGroup(1157296644);
                zChanged = composer2.changed(onActiveChange);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new c(onActiveChange);
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new c(onActiveChange);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                BackHandlerKt.BackHandler(z10, (Function0) objRememberedValue2, composer2, i215, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier8;
                z14 = z13;
                function11 = function10;
                function12 = function8;
                function13 = function9;
                shape3 = shape2;
                searchBarColors3 = searchBarColors2;
                f11 = f10;
                mutableInteractionSource3 = mutableInteractionSource2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i20 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    if (i21 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if ((i12 & 1024) != 0) {
                        dockedShape = SearchBarDefaults.INSTANCE.getDockedShape(composerStartRestartGroup, 6);
                        i22 &= -15;
                    } else {
                        dockedShape = shape;
                    }
                    if ((i12 & 2048) != 0) {
                        searchBarColorsM1228colorsKlgxPg = SearchBarDefaults.INSTANCE.m1228colorsKlgxPg(0L, 0L, null, composerStartRestartGroup, 3072, 7);
                        i22 &= -113;
                    } else {
                        searchBarColorsM1228colorsKlgxPg = searchBarColors;
                    }
                    if (i23 != 0) {
                        fM1229getElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m1229getElevationD9Ej5fM();
                    } else {
                        fM1229getElevationD9Ej5fM = f6;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        Function2<? super Composer, ? super Integer, Unit> function111 = function6;
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function8 = function111;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        function8 = function6;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    function9 = function7;
                    function10 = function5;
                    z13 = z12;
                    f10 = fM1229getElevationD9Ej5fM;
                    shape2 = dockedShape;
                    searchBarColors2 = searchBarColorsM1228colorsKlgxPg;
                    i16 = i22;
                    modifier3 = modifier2;
                } else {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i20 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    if (i21 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if ((i12 & 1024) != 0) {
                        dockedShape = SearchBarDefaults.INSTANCE.getDockedShape(composerStartRestartGroup, 6);
                        i22 &= -15;
                    } else {
                        dockedShape = shape;
                    }
                    if ((i12 & 2048) != 0) {
                        searchBarColorsM1228colorsKlgxPg = SearchBarDefaults.INSTANCE.m1228colorsKlgxPg(0L, 0L, null, composerStartRestartGroup, 3072, 7);
                        i22 &= -113;
                    } else {
                        searchBarColorsM1228colorsKlgxPg = searchBarColors;
                    }
                    if (i23 != 0) {
                        fM1229getElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m1229getElevationD9Ej5fM();
                    } else {
                        fM1229getElevationD9Ej5fM = f6;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        Function2<? super Composer, ? super Integer, Unit> function112 = function6;
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function8 = function112;
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        function8 = function6;
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    function9 = function7;
                    function10 = function5;
                    z13 = z12;
                    f10 = fM1229getElevationD9Ej5fM;
                    shape2 = dockedShape;
                    searchBarColors2 = searchBarColorsM1228colorsKlgxPg;
                    i16 = i22;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-451213062, i13, i16, "androidx.compose.material3.DockedSearchBar (SearchBar.kt:342)");
                }
                FocusManager focusManager5 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                long containerColor5 = searchBarColors2.getContainerColor();
                long jM1014contentColorForek8zF_U5 = ColorSchemeKt.m1014contentColorForek8zF_U(searchBarColors2.getContainerColor(), composerStartRestartGroup, 0);
                Modifier modifierM340width3ABfNKs5 = androidx.compose.foundation.layout.SizeKt.m340width3ABfNKs(ZIndexModifierKt.zIndex(modifier3, 1.0f), f11166c);
                int i216 = i13;
                Modifier modifier9 = modifier3;
                composer2 = composerStartRestartGroup;
                int i217 = i16;
                SurfaceKt.m1329SurfaceT9BRK9s(modifierM340width3ABfNKs5, shape2, containerColor5, jM1014contentColorForek8zF_U5, f10, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -1764436203, true, new a(query, onQueryChange, onSearch, z10, onActiveChange, z13, function10, function8, function9, searchBarColors2, mutableInteractionSource2, i216, i16, content)), composer2, ((i217 << 3) & 112) | 12582912 | ((i217 << 6) & 57344), 96);
                int i218 = (i216 >> 9) & 14;
                EffectsKt.LaunchedEffect(Boolean.valueOf(z10), new b(z10, focusManager5, null), composer2, i218 | 64);
                composer2.startReplaceableGroup(1157296644);
                zChanged = composer2.changed(onActiveChange);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new c(onActiveChange);
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new c(onActiveChange);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                BackHandlerKt.BackHandler(z10, (Function0) objRememberedValue2, composer2, i218, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier9;
                z14 = z13;
                function11 = function10;
                function12 = function8;
                function13 = function9;
                shape3 = shape2;
                searchBarColors3 = searchBarColors2;
                f11 = f10;
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(query, onQueryChange, onSearch, z10, onActiveChange, modifier4, z14, function11, function12, function13, shape3, searchBarColors3, f11, mutableInteractionSource3, content, i10, i11, i12));
        }
        i22 |= 3072;
        if ((i12 & 16384) != 0) {
            i22 |= 24576;
        } else if ((i11 & 57344) == 0) {
            i22 |= composerStartRestartGroup.changedInstance(content) ? 16384 : 8192;
        }
        if ((1533916891 & i13) != 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i18 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i20 != 0) {
                    function6 = null;
                } else {
                    function6 = function3;
                }
                if (i21 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                if ((i12 & 1024) != 0) {
                    dockedShape = SearchBarDefaults.INSTANCE.getDockedShape(composerStartRestartGroup, 6);
                    i22 &= -15;
                } else {
                    dockedShape = shape;
                }
                if ((i12 & 2048) != 0) {
                    searchBarColorsM1228colorsKlgxPg = SearchBarDefaults.INSTANCE.m1228colorsKlgxPg(0L, 0L, null, composerStartRestartGroup, 3072, 7);
                    i22 &= -113;
                } else {
                    searchBarColorsM1228colorsKlgxPg = searchBarColors;
                }
                if (i23 != 0) {
                    fM1229getElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m1229getElevationD9Ej5fM();
                } else {
                    fM1229getElevationD9Ej5fM = f6;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    Function2<? super Composer, ? super Integer, Unit> function113 = function6;
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function8 = function113;
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    function8 = function6;
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                function9 = function7;
                function10 = function5;
                z13 = z12;
                f10 = fM1229getElevationD9Ej5fM;
                shape2 = dockedShape;
                searchBarColors2 = searchBarColorsM1228colorsKlgxPg;
                i16 = i22;
                modifier3 = modifier2;
            } else {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i18 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i20 != 0) {
                    function6 = null;
                } else {
                    function6 = function3;
                }
                if (i21 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                if ((i12 & 1024) != 0) {
                    dockedShape = SearchBarDefaults.INSTANCE.getDockedShape(composerStartRestartGroup, 6);
                    i22 &= -15;
                } else {
                    dockedShape = shape;
                }
                if ((i12 & 2048) != 0) {
                    searchBarColorsM1228colorsKlgxPg = SearchBarDefaults.INSTANCE.m1228colorsKlgxPg(0L, 0L, null, composerStartRestartGroup, 3072, 7);
                    i22 &= -113;
                } else {
                    searchBarColorsM1228colorsKlgxPg = searchBarColors;
                }
                if (i23 != 0) {
                    fM1229getElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m1229getElevationD9Ej5fM();
                } else {
                    fM1229getElevationD9Ej5fM = f6;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    Function2<? super Composer, ? super Integer, Unit> function114 = function6;
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function8 = function114;
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    function8 = function6;
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                function9 = function7;
                function10 = function5;
                z13 = z12;
                f10 = fM1229getElevationD9Ej5fM;
                shape2 = dockedShape;
                searchBarColors2 = searchBarColorsM1228colorsKlgxPg;
                i16 = i22;
                modifier3 = modifier2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-451213062, i13, i16, "androidx.compose.material3.DockedSearchBar (SearchBar.kt:342)");
            }
            FocusManager focusManager6 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            long containerColor6 = searchBarColors2.getContainerColor();
            long jM1014contentColorForek8zF_U6 = ColorSchemeKt.m1014contentColorForek8zF_U(searchBarColors2.getContainerColor(), composerStartRestartGroup, 0);
            Modifier modifierM340width3ABfNKs6 = androidx.compose.foundation.layout.SizeKt.m340width3ABfNKs(ZIndexModifierKt.zIndex(modifier3, 1.0f), f11166c);
            int i219 = i13;
            Modifier modifier10 = modifier3;
            composer2 = composerStartRestartGroup;
            int i2110 = i16;
            SurfaceKt.m1329SurfaceT9BRK9s(modifierM340width3ABfNKs6, shape2, containerColor6, jM1014contentColorForek8zF_U6, f10, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -1764436203, true, new a(query, onQueryChange, onSearch, z10, onActiveChange, z13, function10, function8, function9, searchBarColors2, mutableInteractionSource2, i219, i16, content)), composer2, ((i2110 << 3) & 112) | 12582912 | ((i2110 << 6) & 57344), 96);
            int i2111 = (i219 >> 9) & 14;
            EffectsKt.LaunchedEffect(Boolean.valueOf(z10), new b(z10, focusManager6, null), composer2, i2111 | 64);
            composer2.startReplaceableGroup(1157296644);
            zChanged = composer2.changed(onActiveChange);
            objRememberedValue2 = composer2.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new c(onActiveChange);
                composer2.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new c(onActiveChange);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            BackHandlerKt.BackHandler(z10, (Function0) objRememberedValue2, composer2, i2111, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier10;
            z14 = z13;
            function11 = function10;
            function12 = function8;
            function13 = function9;
            shape3 = shape2;
            searchBarColors3 = searchBarColors2;
            f11 = f10;
            mutableInteractionSource3 = mutableInteractionSource2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i18 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i20 != 0) {
                    function6 = null;
                } else {
                    function6 = function3;
                }
                if (i21 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                if ((i12 & 1024) != 0) {
                    dockedShape = SearchBarDefaults.INSTANCE.getDockedShape(composerStartRestartGroup, 6);
                    i22 &= -15;
                } else {
                    dockedShape = shape;
                }
                if ((i12 & 2048) != 0) {
                    searchBarColorsM1228colorsKlgxPg = SearchBarDefaults.INSTANCE.m1228colorsKlgxPg(0L, 0L, null, composerStartRestartGroup, 3072, 7);
                    i22 &= -113;
                } else {
                    searchBarColorsM1228colorsKlgxPg = searchBarColors;
                }
                if (i23 != 0) {
                    fM1229getElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m1229getElevationD9Ej5fM();
                } else {
                    fM1229getElevationD9Ej5fM = f6;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    Function2<? super Composer, ? super Integer, Unit> function115 = function6;
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function8 = function115;
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    function8 = function6;
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                function9 = function7;
                function10 = function5;
                z13 = z12;
                f10 = fM1229getElevationD9Ej5fM;
                shape2 = dockedShape;
                searchBarColors2 = searchBarColorsM1228colorsKlgxPg;
                i16 = i22;
                modifier3 = modifier2;
            } else {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i18 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i20 != 0) {
                    function6 = null;
                } else {
                    function6 = function3;
                }
                if (i21 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                if ((i12 & 1024) != 0) {
                    dockedShape = SearchBarDefaults.INSTANCE.getDockedShape(composerStartRestartGroup, 6);
                    i22 &= -15;
                } else {
                    dockedShape = shape;
                }
                if ((i12 & 2048) != 0) {
                    searchBarColorsM1228colorsKlgxPg = SearchBarDefaults.INSTANCE.m1228colorsKlgxPg(0L, 0L, null, composerStartRestartGroup, 3072, 7);
                    i22 &= -113;
                } else {
                    searchBarColorsM1228colorsKlgxPg = searchBarColors;
                }
                if (i23 != 0) {
                    fM1229getElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m1229getElevationD9Ej5fM();
                } else {
                    fM1229getElevationD9Ej5fM = f6;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    Function2<? super Composer, ? super Integer, Unit> function116 = function6;
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function8 = function116;
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    function8 = function6;
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                function9 = function7;
                function10 = function5;
                z13 = z12;
                f10 = fM1229getElevationD9Ej5fM;
                shape2 = dockedShape;
                searchBarColors2 = searchBarColorsM1228colorsKlgxPg;
                i16 = i22;
                modifier3 = modifier2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-451213062, i13, i16, "androidx.compose.material3.DockedSearchBar (SearchBar.kt:342)");
            }
            FocusManager focusManager7 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            long containerColor7 = searchBarColors2.getContainerColor();
            long jM1014contentColorForek8zF_U7 = ColorSchemeKt.m1014contentColorForek8zF_U(searchBarColors2.getContainerColor(), composerStartRestartGroup, 0);
            Modifier modifierM340width3ABfNKs7 = androidx.compose.foundation.layout.SizeKt.m340width3ABfNKs(ZIndexModifierKt.zIndex(modifier3, 1.0f), f11166c);
            int i2112 = i13;
            Modifier modifier11 = modifier3;
            composer2 = composerStartRestartGroup;
            int i2113 = i16;
            SurfaceKt.m1329SurfaceT9BRK9s(modifierM340width3ABfNKs7, shape2, containerColor7, jM1014contentColorForek8zF_U7, f10, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -1764436203, true, new a(query, onQueryChange, onSearch, z10, onActiveChange, z13, function10, function8, function9, searchBarColors2, mutableInteractionSource2, i2112, i16, content)), composer2, ((i2113 << 3) & 112) | 12582912 | ((i2113 << 6) & 57344), 96);
            int i2114 = (i2112 >> 9) & 14;
            EffectsKt.LaunchedEffect(Boolean.valueOf(z10), new b(z10, focusManager7, null), composer2, i2114 | 64);
            composer2.startReplaceableGroup(1157296644);
            zChanged = composer2.changed(onActiveChange);
            objRememberedValue2 = composer2.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new c(onActiveChange);
                composer2.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new c(onActiveChange);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            BackHandlerKt.BackHandler(z10, (Function0) objRememberedValue2, composer2, i2114, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier11;
            z14 = z13;
            function11 = function10;
            function12 = function8;
            function13 = function9;
            shape3 = shape2;
            searchBarColors3 = searchBarColors2;
            f11 = f10;
            mutableInteractionSource3 = mutableInteractionSource2;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(query, onQueryChange, onSearch, z10, onActiveChange, modifier4, z14, function11, function12, function13, shape3, searchBarColors3, f11, mutableInteractionSource3, content, i10, i11, i12));
    }

    /* JADX WARN: Code duplicated, block: B:139:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:150:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:153:0x01da  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:160:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:163:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:166:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:176:0x0234  */
    /* JADX WARN: Code duplicated, block: B:178:0x023b  */
    /* JADX WARN: Code duplicated, block: B:191:0x026e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:192:0x0270  */
    /* JADX WARN: Code duplicated, block: B:193:0x0273  */
    /* JADX WARN: Code duplicated, block: B:195:0x0277  */
    /* JADX WARN: Code duplicated, block: B:196:0x0279  */
    /* JADX WARN: Code duplicated, block: B:198:0x027d  */
    /* JADX WARN: Code duplicated, block: B:199:0x027f  */
    /* JADX WARN: Code duplicated, block: B:201:0x0283  */
    /* JADX WARN: Code duplicated, block: B:202:0x0285  */
    /* JADX WARN: Code duplicated, block: B:204:0x0289  */
    /* JADX WARN: Code duplicated, block: B:205:0x028b  */
    /* JADX WARN: Code duplicated, block: B:208:0x0291  */
    /* JADX WARN: Code duplicated, block: B:209:0x029d  */
    /* JADX WARN: Code duplicated, block: B:212:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:213:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:215:0x02be  */
    /* JADX WARN: Code duplicated, block: B:216:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:219:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:220:0x02da  */
    /* JADX WARN: Code duplicated, block: B:222:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:224:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:226:0x0311  */
    /* JADX WARN: Code duplicated, block: B:229:0x032c  */
    /* JADX WARN: Code duplicated, block: B:231:0x0336  */
    /* JADX WARN: Code duplicated, block: B:232:0x0339  */
    /* JADX WARN: Code duplicated, block: B:234:0x033c  */
    /* JADX WARN: Code duplicated, block: B:235:0x033f  */
    /* JADX WARN: Code duplicated, block: B:238:0x0390  */
    /* JADX WARN: Code duplicated, block: B:241:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:243:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:245:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:246:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:248:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:249:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:253:0x0407  */
    /* JADX WARN: Code duplicated, block: B:256:0x0424  */
    /* JADX WARN: Code duplicated, block: B:258:0x042a  */
    /* JADX WARN: Code duplicated, block: B:261:0x0464  */
    /* JADX WARN: Code duplicated, block: B:263:0x046a  */
    /* JADX WARN: Code duplicated, block: B:266:0x0494  */
    /* JADX WARN: Code duplicated, block: B:268:0x049a  */
    /* JADX WARN: Code duplicated, block: B:271:0x053f  */
    /* JADX WARN: Code duplicated, block: B:273:0x0545  */
    /* JADX WARN: Code duplicated, block: B:276:0x055c  */
    /* JADX WARN: Code duplicated, block: B:281:0x0578  */
    /* JADX WARN: Code duplicated, block: B:283:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: SearchBar-Id_Pb_0, reason: not valid java name */
    public static final void m1234SearchBarId_Pb_0(@NotNull String query, @NotNull Function1<? super String, Unit> onQueryChange, @NotNull Function1<? super String, Unit> onSearch, boolean z10, @NotNull Function1<? super Boolean, Unit> onActiveChange, @Nullable Modifier modifier, boolean z11, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function4, @Nullable Shape shape, @Nullable SearchBarColors searchBarColors, float f6, @Nullable WindowInsets windowInsets, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier2;
        boolean z12;
        Function2<? super Composer, ? super Integer, Unit> function5;
        Function2<? super Composer, ? super Integer, Unit> function6;
        Function2<? super Composer, ? super Integer, Unit> function7;
        Shape inputFieldShape;
        SearchBarColors searchBarColorsM1228colorsKlgxPg;
        float fM1229getElevationD9Ej5fM;
        SearchBarColors searchBarColors2;
        WindowInsets windowInsets2;
        Function2<? super Composer, ? super Integer, Unit> function8;
        SearchBarColors searchBarColors3;
        Function2<? super Composer, ? super Integer, Unit> function9;
        Function2<? super Composer, ? super Integer, Unit> function10;
        boolean z13;
        Shape shape2;
        float f10;
        MutableInteractionSource mutableInteractionSource3;
        WindowInsets windowInsets3;
        int i16;
        Modifier modifier3;
        Object objRememberedValue;
        float f11;
        TweenSpec tweenSpec;
        State<Float> stateAnimateFloatAsState;
        Density density;
        Shape inputFieldShape2;
        Shape fullScreenShape;
        Object objRememberedValue2;
        Composer.Companion companion;
        State state;
        boolean zChanged;
        Object objRememberedValue3;
        Object objRememberedValue4;
        l0.m2 m2Var;
        boolean zChanged2;
        Object objRememberedValue5;
        State state2;
        boolean zChanged3;
        Object objRememberedValue6;
        boolean zChanged4;
        Object objRememberedValue7;
        WindowInsets windowInsets4;
        Composer composer2;
        boolean zChanged5;
        Object objRememberedValue8;
        boolean z14;
        Function2<? super Composer, ? super Integer, Unit> function11;
        Function2<? super Composer, ? super Integer, Unit> function12;
        Function2<? super Composer, ? super Integer, Unit> function13;
        SearchBarColors searchBarColors4;
        float f12;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape3;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(onQueryChange, "onQueryChange");
        Intrinsics.checkNotNullParameter(onSearch, "onSearch");
        Intrinsics.checkNotNullParameter(onActiveChange, "onActiveChange");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(156000634);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i13 = (composerStartRestartGroup.changed(query) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 112) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(onQueryChange) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(onSearch) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i13 |= composerStartRestartGroup.changed(z10) ? 2048 : 1024;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i10 & 57344) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(onActiveChange) ? 16384 : 8192;
        }
        int i17 = i12 & 32;
        if (i17 != 0) {
            i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i10 & 458752) == 0) {
            i13 |= composerStartRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        int i18 = i12 & 64;
        if (i18 != 0) {
            i13 |= 1572864;
        } else if ((i10 & 3670016) == 0) {
            i13 |= composerStartRestartGroup.changed(z11) ? 1048576 : 524288;
        }
        int i19 = i12 & 128;
        if (i19 != 0) {
            i13 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
        }
        int i20 = i12 & 256;
        if (i20 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i21 = i12 & 512;
        if (i21 != 0) {
            i13 |= 805306368;
        } else if ((i10 & 1879048192) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function4) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i11 & 14) == 0) {
            i14 = i11 | (((i12 & 1024) == 0 && composerStartRestartGroup.changed(shape)) ? 4 : 2);
        } else {
            i14 = i11;
        }
        if ((i11 & 112) == 0) {
            i14 |= ((i12 & 2048) == 0 && composerStartRestartGroup.changed(searchBarColors)) ? 32 : 16;
        }
        int i22 = i14;
        int i23 = i12 & 4096;
        if (i23 == 0) {
            if ((i11 & 896) == 0) {
                i22 |= composerStartRestartGroup.changed(f6) ? 256 : 128;
            }
            if ((i11 & 7168) != 0) {
                i22 |= ((i12 & 8192) == 0 || !composerStartRestartGroup.changed(windowInsets)) ? 1024 : 2048;
            }
            i15 = i12 & 16384;
            if (i15 != 0) {
                i22 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
            } else {
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i11 & 57344) == 0) {
                    i22 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
                }
            }
            if ((i12 & 32768) != 0) {
                i22 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i11 & 458752) == 0) {
                i22 |= composerStartRestartGroup.changedInstance(content) ? 131072 : 65536;
            }
            if ((i13 & 1533916891) != 306783378 && (374491 & i22) == 74898 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                z14 = z11;
                function11 = function2;
                function12 = function3;
                function13 = function4;
                shape3 = shape;
                f12 = f6;
                windowInsets4 = windowInsets;
                mutableInteractionSource4 = mutableInteractionSource2;
                searchBarColors4 = searchBarColors;
                composer2 = composerStartRestartGroup;
                modifier4 = modifier;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i18 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i19 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i20 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    if (i21 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if ((i12 & 1024) != 0) {
                        inputFieldShape = SearchBarDefaults.INSTANCE.getInputFieldShape(composerStartRestartGroup, 6);
                        i22 &= -15;
                    } else {
                        inputFieldShape = shape;
                    }
                    if ((i12 & 2048) != 0) {
                        searchBarColorsM1228colorsKlgxPg = SearchBarDefaults.INSTANCE.m1228colorsKlgxPg(0L, 0L, null, composerStartRestartGroup, 3072, 7);
                        i22 &= -113;
                    } else {
                        searchBarColorsM1228colorsKlgxPg = searchBarColors;
                    }
                    if (i23 != 0) {
                        fM1229getElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m1229getElevationD9Ej5fM();
                    } else {
                        fM1229getElevationD9Ej5fM = f6;
                    }
                    searchBarColors2 = searchBarColorsM1228colorsKlgxPg;
                    if ((i12 & 8192) != 0) {
                        windowInsets2 = SearchBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                        i22 &= -7169;
                    } else {
                        windowInsets2 = windowInsets;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        function8 = function6;
                        searchBarColors3 = searchBarColors2;
                        function9 = function7;
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        modifier3 = modifier2;
                        function10 = function5;
                        z13 = z12;
                        shape2 = inputFieldShape;
                        f10 = fM1229getElevationD9Ej5fM;
                        windowInsets3 = windowInsets2;
                        i16 = i22;
                    } else {
                        function8 = function6;
                        searchBarColors3 = searchBarColors2;
                        function9 = function7;
                        function10 = function5;
                        z13 = z12;
                        shape2 = inputFieldShape;
                        f10 = fM1229getElevationD9Ej5fM;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        windowInsets3 = windowInsets2;
                        i16 = i22;
                        modifier3 = modifier2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i12 & 1024) != 0) {
                        i22 &= -15;
                    }
                    if ((i12 & 2048) != 0) {
                        i22 &= -113;
                    }
                    if ((i12 & 8192) != 0) {
                        i22 &= -7169;
                    }
                    z13 = z11;
                    function10 = function2;
                    function8 = function3;
                    function9 = function4;
                    shape2 = shape;
                    searchBarColors3 = searchBarColors;
                    f10 = f6;
                    windowInsets3 = windowInsets;
                    i16 = i22;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    modifier3 = modifier;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(156000634, i13, i16, "androidx.compose.material3.SearchBar (SearchBar.kt:159)");
                }
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                if (z10) {
                    tweenSpec = f11170g;
                } else {
                    tweenSpec = f11171h;
                }
                stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(f11, tweenSpec, 0.0f, null, null, composerStartRestartGroup, 64, 28);
                FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                SearchBarDefaults searchBarDefaults = SearchBarDefaults.INSTANCE;
                inputFieldShape2 = searchBarDefaults.getInputFieldShape(composerStartRestartGroup, 6);
                fullScreenShape = searchBarDefaults.getFullScreenShape(composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                int i24 = i13;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new m(stateAnimateFloatAsState));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                state = (State) objRememberedValue2;
                Boolean boolValueOf = Boolean.valueOf(((Boolean) state.getValue()).booleanValue());
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(shape2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    if (Intrinsics.areEqual(shape2, inputFieldShape2)) {
                        objRememberedValue3 = new GenericShape(new k(density, stateAnimateFloatAsState));
                    } else if (access$SearchBar_Id_Pb_0$lambda$2(state)) {
                        objRememberedValue3 = fullScreenShape;
                    } else {
                        objRememberedValue3 = shape2;
                    }
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Shape shape4 = (Shape) objRememberedValue3;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new l0.m2(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                m2Var = (l0.m2) objRememberedValue4;
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged2 = composerStartRestartGroup.changed(density);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = SnapshotStateKt.derivedStateOf(new l(m2Var, density));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                state2 = (State) objRememberedValue5;
                long containerColor = searchBarColors3.getContainerColor();
                int i25 = i16;
                long jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(searchBarColors3.getContainerColor(), composerStartRestartGroup, 0);
                Modifier modifierZIndex = ZIndexModifierKt.zIndex(modifier3, 1.0f);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(m2Var) | composerStartRestartGroup.changed(windowInsets3);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new e(m2Var, windowInsets3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierConsumeWindowInsets = WindowInsetsPaddingKt.consumeWindowInsets(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(modifierZIndex, (Function1) objRememberedValue6), m2Var);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged4 = composerStartRestartGroup.changed(state2) | composerStartRestartGroup.changed(stateAnimateFloatAsState);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChanged4 || objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new f(state2, stateAnimateFloatAsState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceableGroup();
                windowInsets4 = windowInsets3;
                Shape shape5 = shape2;
                Modifier modifier5 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m1329SurfaceT9BRK9s(LayoutModifierKt.layout(modifierConsumeWindowInsets, (Function3) objRememberedValue7), shape4, containerColor, jM1014contentColorForek8zF_U, f10, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -867266817, true, new g(query, onQueryChange, onSearch, z10, onActiveChange, z13, function10, function8, function9, searchBarColors3, mutableInteractionSource3, i24, i25, stateAnimateFloatAsState, state2, content)), composer2, ((i25 << 6) & 57344) | 12582912, 96);
                int i26 = (i24 >> 9) & 14;
                EffectsKt.LaunchedEffect(Boolean.valueOf(z10), new h(z10, focusManager, null), composer2, i26 | 64);
                composer2.startReplaceableGroup(1157296644);
                zChanged5 = composer2.changed(onActiveChange);
                objRememberedValue8 = composer2.rememberedValue();
                if (zChanged5 || objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new i(onActiveChange);
                    composer2.updateRememberedValue(objRememberedValue8);
                }
                composer2.endReplaceableGroup();
                BackHandlerKt.BackHandler(z10, (Function0) objRememberedValue8, composer2, i26, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z14 = z13;
                function11 = function10;
                function12 = function8;
                function13 = function9;
                searchBarColors4 = searchBarColors3;
                f12 = f10;
                mutableInteractionSource4 = mutableInteractionSource3;
                shape3 = shape5;
                modifier4 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new j(query, onQueryChange, onSearch, z10, onActiveChange, modifier4, z14, function11, function12, function13, shape3, searchBarColors4, f12, windowInsets4, mutableInteractionSource4, content, i10, i11, i12));
        }
        i22 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        if ((i11 & 7168) != 0) {
            i22 |= ((i12 & 8192) == 0 || !composerStartRestartGroup.changed(windowInsets)) ? 1024 : 2048;
        }
        i15 = i12 & 16384;
        if (i15 != 0) {
            i22 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i11 & 57344) == 0) {
                i22 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 16384 : 8192;
            }
        }
        if ((i12 & 32768) != 0) {
            i22 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i11 & 458752) == 0) {
            i22 |= composerStartRestartGroup.changedInstance(content) ? 131072 : 65536;
        }
        if ((i13 & 1533916891) != 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i18 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i20 != 0) {
                    function6 = null;
                } else {
                    function6 = function3;
                }
                if (i21 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                if ((i12 & 1024) != 0) {
                    inputFieldShape = SearchBarDefaults.INSTANCE.getInputFieldShape(composerStartRestartGroup, 6);
                    i22 &= -15;
                } else {
                    inputFieldShape = shape;
                }
                if ((i12 & 2048) != 0) {
                    searchBarColorsM1228colorsKlgxPg = SearchBarDefaults.INSTANCE.m1228colorsKlgxPg(0L, 0L, null, composerStartRestartGroup, 3072, 7);
                    i22 &= -113;
                } else {
                    searchBarColorsM1228colorsKlgxPg = searchBarColors;
                }
                if (i23 != 0) {
                    fM1229getElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m1229getElevationD9Ej5fM();
                } else {
                    fM1229getElevationD9Ej5fM = f6;
                }
                searchBarColors2 = searchBarColorsM1228colorsKlgxPg;
                if ((i12 & 8192) != 0) {
                    windowInsets2 = SearchBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    i22 &= -7169;
                } else {
                    windowInsets2 = windowInsets;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function8 = function6;
                    searchBarColors3 = searchBarColors2;
                    function9 = function7;
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    modifier3 = modifier2;
                    function10 = function5;
                    z13 = z12;
                    shape2 = inputFieldShape;
                    f10 = fM1229getElevationD9Ej5fM;
                    windowInsets3 = windowInsets2;
                    i16 = i22;
                } else {
                    function8 = function6;
                    searchBarColors3 = searchBarColors2;
                    function9 = function7;
                    function10 = function5;
                    z13 = z12;
                    shape2 = inputFieldShape;
                    f10 = fM1229getElevationD9Ej5fM;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    windowInsets3 = windowInsets2;
                    i16 = i22;
                    modifier3 = modifier2;
                }
            } else {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i18 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i20 != 0) {
                    function6 = null;
                } else {
                    function6 = function3;
                }
                if (i21 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                if ((i12 & 1024) != 0) {
                    inputFieldShape = SearchBarDefaults.INSTANCE.getInputFieldShape(composerStartRestartGroup, 6);
                    i22 &= -15;
                } else {
                    inputFieldShape = shape;
                }
                if ((i12 & 2048) != 0) {
                    searchBarColorsM1228colorsKlgxPg = SearchBarDefaults.INSTANCE.m1228colorsKlgxPg(0L, 0L, null, composerStartRestartGroup, 3072, 7);
                    i22 &= -113;
                } else {
                    searchBarColorsM1228colorsKlgxPg = searchBarColors;
                }
                if (i23 != 0) {
                    fM1229getElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m1229getElevationD9Ej5fM();
                } else {
                    fM1229getElevationD9Ej5fM = f6;
                }
                searchBarColors2 = searchBarColorsM1228colorsKlgxPg;
                if ((i12 & 8192) != 0) {
                    windowInsets2 = SearchBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    i22 &= -7169;
                } else {
                    windowInsets2 = windowInsets;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function8 = function6;
                    searchBarColors3 = searchBarColors2;
                    function9 = function7;
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    modifier3 = modifier2;
                    function10 = function5;
                    z13 = z12;
                    shape2 = inputFieldShape;
                    f10 = fM1229getElevationD9Ej5fM;
                    windowInsets3 = windowInsets2;
                    i16 = i22;
                } else {
                    function8 = function6;
                    searchBarColors3 = searchBarColors2;
                    function9 = function7;
                    function10 = function5;
                    z13 = z12;
                    shape2 = inputFieldShape;
                    f10 = fM1229getElevationD9Ej5fM;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    windowInsets3 = windowInsets2;
                    i16 = i22;
                    modifier3 = modifier2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(156000634, i13, i16, "androidx.compose.material3.SearchBar (SearchBar.kt:159)");
            }
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            if (z10) {
                tweenSpec = f11170g;
            } else {
                tweenSpec = f11171h;
            }
            stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(f11, tweenSpec, 0.0f, null, null, composerStartRestartGroup, 64, 28);
            FocusManager focusManager2 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            SearchBarDefaults searchBarDefaults2 = SearchBarDefaults.INSTANCE;
            inputFieldShape2 = searchBarDefaults2.getInputFieldShape(composerStartRestartGroup, 6);
            fullScreenShape = searchBarDefaults2.getFullScreenShape(composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            int i27 = i13;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new m(stateAnimateFloatAsState));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            state = (State) objRememberedValue2;
            Boolean boolValueOf2 = Boolean.valueOf(((Boolean) state.getValue()).booleanValue());
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(boolValueOf2) | composerStartRestartGroup.changed(shape2);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                if (Intrinsics.areEqual(shape2, inputFieldShape2)) {
                    objRememberedValue3 = new GenericShape(new k(density, stateAnimateFloatAsState));
                } else if (access$SearchBar_Id_Pb_0$lambda$2(state)) {
                    objRememberedValue3 = fullScreenShape;
                } else {
                    objRememberedValue3 = shape2;
                }
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                if (Intrinsics.areEqual(shape2, inputFieldShape2)) {
                    objRememberedValue3 = new GenericShape(new k(density, stateAnimateFloatAsState));
                } else if (access$SearchBar_Id_Pb_0$lambda$2(state)) {
                    objRememberedValue3 = fullScreenShape;
                } else {
                    objRememberedValue3 = shape2;
                }
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Shape shape6 = (Shape) objRememberedValue3;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new l0.m2(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            m2Var = (l0.m2) objRememberedValue4;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged2 = composerStartRestartGroup.changed(density);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue5 = SnapshotStateKt.derivedStateOf(new l(m2Var, density));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                objRememberedValue5 = SnapshotStateKt.derivedStateOf(new l(m2Var, density));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            state2 = (State) objRememberedValue5;
            long containerColor2 = searchBarColors3.getContainerColor();
            int i28 = i16;
            long jM1014contentColorForek8zF_U2 = ColorSchemeKt.m1014contentColorForek8zF_U(searchBarColors3.getContainerColor(), composerStartRestartGroup, 0);
            Modifier modifierZIndex2 = ZIndexModifierKt.zIndex(modifier3, 1.0f);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged3 = composerStartRestartGroup.changed(m2Var) | composerStartRestartGroup.changed(windowInsets3);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged3) {
                objRememberedValue6 = new e(m2Var, windowInsets3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                objRememberedValue6 = new e(m2Var, windowInsets3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierConsumeWindowInsets2 = WindowInsetsPaddingKt.consumeWindowInsets(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(modifierZIndex2, (Function1) objRememberedValue6), m2Var);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged4 = composerStartRestartGroup.changed(state2) | composerStartRestartGroup.changed(stateAnimateFloatAsState);
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChanged4) {
                objRememberedValue7 = new f(state2, stateAnimateFloatAsState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            } else {
                objRememberedValue7 = new f(state2, stateAnimateFloatAsState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            composerStartRestartGroup.endReplaceableGroup();
            windowInsets4 = windowInsets3;
            Shape shape7 = shape2;
            Modifier modifier6 = modifier3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m1329SurfaceT9BRK9s(LayoutModifierKt.layout(modifierConsumeWindowInsets2, (Function3) objRememberedValue7), shape6, containerColor2, jM1014contentColorForek8zF_U2, f10, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -867266817, true, new g(query, onQueryChange, onSearch, z10, onActiveChange, z13, function10, function8, function9, searchBarColors3, mutableInteractionSource3, i27, i28, stateAnimateFloatAsState, state2, content)), composer2, ((i28 << 6) & 57344) | 12582912, 96);
            int i29 = (i27 >> 9) & 14;
            EffectsKt.LaunchedEffect(Boolean.valueOf(z10), new h(z10, focusManager2, null), composer2, i29 | 64);
            composer2.startReplaceableGroup(1157296644);
            zChanged5 = composer2.changed(onActiveChange);
            objRememberedValue8 = composer2.rememberedValue();
            if (zChanged5) {
                objRememberedValue8 = new i(onActiveChange);
                composer2.updateRememberedValue(objRememberedValue8);
            } else {
                objRememberedValue8 = new i(onActiveChange);
                composer2.updateRememberedValue(objRememberedValue8);
            }
            composer2.endReplaceableGroup();
            BackHandlerKt.BackHandler(z10, (Function0) objRememberedValue8, composer2, i29, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z14 = z13;
            function11 = function10;
            function12 = function8;
            function13 = function9;
            searchBarColors4 = searchBarColors3;
            f12 = f10;
            mutableInteractionSource4 = mutableInteractionSource3;
            shape3 = shape7;
            modifier4 = modifier6;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i18 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i20 != 0) {
                    function6 = null;
                } else {
                    function6 = function3;
                }
                if (i21 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                if ((i12 & 1024) != 0) {
                    inputFieldShape = SearchBarDefaults.INSTANCE.getInputFieldShape(composerStartRestartGroup, 6);
                    i22 &= -15;
                } else {
                    inputFieldShape = shape;
                }
                if ((i12 & 2048) != 0) {
                    searchBarColorsM1228colorsKlgxPg = SearchBarDefaults.INSTANCE.m1228colorsKlgxPg(0L, 0L, null, composerStartRestartGroup, 3072, 7);
                    i22 &= -113;
                } else {
                    searchBarColorsM1228colorsKlgxPg = searchBarColors;
                }
                if (i23 != 0) {
                    fM1229getElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m1229getElevationD9Ej5fM();
                } else {
                    fM1229getElevationD9Ej5fM = f6;
                }
                searchBarColors2 = searchBarColorsM1228colorsKlgxPg;
                if ((i12 & 8192) != 0) {
                    windowInsets2 = SearchBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    i22 &= -7169;
                } else {
                    windowInsets2 = windowInsets;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function8 = function6;
                    searchBarColors3 = searchBarColors2;
                    function9 = function7;
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    modifier3 = modifier2;
                    function10 = function5;
                    z13 = z12;
                    shape2 = inputFieldShape;
                    f10 = fM1229getElevationD9Ej5fM;
                    windowInsets3 = windowInsets2;
                    i16 = i22;
                } else {
                    function8 = function6;
                    searchBarColors3 = searchBarColors2;
                    function9 = function7;
                    function10 = function5;
                    z13 = z12;
                    shape2 = inputFieldShape;
                    f10 = fM1229getElevationD9Ej5fM;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    windowInsets3 = windowInsets2;
                    i16 = i22;
                    modifier3 = modifier2;
                }
            } else {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i18 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i19 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i20 != 0) {
                    function6 = null;
                } else {
                    function6 = function3;
                }
                if (i21 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                if ((i12 & 1024) != 0) {
                    inputFieldShape = SearchBarDefaults.INSTANCE.getInputFieldShape(composerStartRestartGroup, 6);
                    i22 &= -15;
                } else {
                    inputFieldShape = shape;
                }
                if ((i12 & 2048) != 0) {
                    searchBarColorsM1228colorsKlgxPg = SearchBarDefaults.INSTANCE.m1228colorsKlgxPg(0L, 0L, null, composerStartRestartGroup, 3072, 7);
                    i22 &= -113;
                } else {
                    searchBarColorsM1228colorsKlgxPg = searchBarColors;
                }
                if (i23 != 0) {
                    fM1229getElevationD9Ej5fM = SearchBarDefaults.INSTANCE.m1229getElevationD9Ej5fM();
                } else {
                    fM1229getElevationD9Ej5fM = f6;
                }
                searchBarColors2 = searchBarColorsM1228colorsKlgxPg;
                if ((i12 & 8192) != 0) {
                    windowInsets2 = SearchBarDefaults.INSTANCE.getWindowInsets(composerStartRestartGroup, 6);
                    i22 &= -7169;
                } else {
                    windowInsets2 = windowInsets;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    function8 = function6;
                    searchBarColors3 = searchBarColors2;
                    function9 = function7;
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    modifier3 = modifier2;
                    function10 = function5;
                    z13 = z12;
                    shape2 = inputFieldShape;
                    f10 = fM1229getElevationD9Ej5fM;
                    windowInsets3 = windowInsets2;
                    i16 = i22;
                } else {
                    function8 = function6;
                    searchBarColors3 = searchBarColors2;
                    function9 = function7;
                    function10 = function5;
                    z13 = z12;
                    shape2 = inputFieldShape;
                    f10 = fM1229getElevationD9Ej5fM;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    windowInsets3 = windowInsets2;
                    i16 = i22;
                    modifier3 = modifier2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(156000634, i13, i16, "androidx.compose.material3.SearchBar (SearchBar.kt:159)");
            }
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            if (z10) {
                tweenSpec = f11170g;
            } else {
                tweenSpec = f11171h;
            }
            stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(f11, tweenSpec, 0.0f, null, null, composerStartRestartGroup, 64, 28);
            FocusManager focusManager3 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            SearchBarDefaults searchBarDefaults3 = SearchBarDefaults.INSTANCE;
            inputFieldShape2 = searchBarDefaults3.getInputFieldShape(composerStartRestartGroup, 6);
            fullScreenShape = searchBarDefaults3.getFullScreenShape(composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            int i210 = i13;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new m(stateAnimateFloatAsState));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            state = (State) objRememberedValue2;
            Boolean boolValueOf3 = Boolean.valueOf(((Boolean) state.getValue()).booleanValue());
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(boolValueOf3) | composerStartRestartGroup.changed(shape2);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                if (Intrinsics.areEqual(shape2, inputFieldShape2)) {
                    objRememberedValue3 = new GenericShape(new k(density, stateAnimateFloatAsState));
                } else if (access$SearchBar_Id_Pb_0$lambda$2(state)) {
                    objRememberedValue3 = fullScreenShape;
                } else {
                    objRememberedValue3 = shape2;
                }
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                if (Intrinsics.areEqual(shape2, inputFieldShape2)) {
                    objRememberedValue3 = new GenericShape(new k(density, stateAnimateFloatAsState));
                } else if (access$SearchBar_Id_Pb_0$lambda$2(state)) {
                    objRememberedValue3 = fullScreenShape;
                } else {
                    objRememberedValue3 = shape2;
                }
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Shape shape8 = (Shape) objRememberedValue3;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new l0.m2(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            m2Var = (l0.m2) objRememberedValue4;
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged2 = composerStartRestartGroup.changed(density);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue5 = SnapshotStateKt.derivedStateOf(new l(m2Var, density));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                objRememberedValue5 = SnapshotStateKt.derivedStateOf(new l(m2Var, density));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            state2 = (State) objRememberedValue5;
            long containerColor3 = searchBarColors3.getContainerColor();
            int i211 = i16;
            long jM1014contentColorForek8zF_U3 = ColorSchemeKt.m1014contentColorForek8zF_U(searchBarColors3.getContainerColor(), composerStartRestartGroup, 0);
            Modifier modifierZIndex3 = ZIndexModifierKt.zIndex(modifier3, 1.0f);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged3 = composerStartRestartGroup.changed(m2Var) | composerStartRestartGroup.changed(windowInsets3);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged3) {
                objRememberedValue6 = new e(m2Var, windowInsets3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                objRememberedValue6 = new e(m2Var, windowInsets3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierConsumeWindowInsets3 = WindowInsetsPaddingKt.consumeWindowInsets(WindowInsetsPaddingKt.onConsumedWindowInsetsChanged(modifierZIndex3, (Function1) objRememberedValue6), m2Var);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged4 = composerStartRestartGroup.changed(state2) | composerStartRestartGroup.changed(stateAnimateFloatAsState);
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChanged4) {
                objRememberedValue7 = new f(state2, stateAnimateFloatAsState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            } else {
                objRememberedValue7 = new f(state2, stateAnimateFloatAsState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            composerStartRestartGroup.endReplaceableGroup();
            windowInsets4 = windowInsets3;
            Shape shape9 = shape2;
            Modifier modifier7 = modifier3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m1329SurfaceT9BRK9s(LayoutModifierKt.layout(modifierConsumeWindowInsets3, (Function3) objRememberedValue7), shape8, containerColor3, jM1014contentColorForek8zF_U3, f10, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, -867266817, true, new g(query, onQueryChange, onSearch, z10, onActiveChange, z13, function10, function8, function9, searchBarColors3, mutableInteractionSource3, i210, i211, stateAnimateFloatAsState, state2, content)), composer2, ((i211 << 6) & 57344) | 12582912, 96);
            int i212 = (i210 >> 9) & 14;
            EffectsKt.LaunchedEffect(Boolean.valueOf(z10), new h(z10, focusManager3, null), composer2, i212 | 64);
            composer2.startReplaceableGroup(1157296644);
            zChanged5 = composer2.changed(onActiveChange);
            objRememberedValue8 = composer2.rememberedValue();
            if (zChanged5) {
                objRememberedValue8 = new i(onActiveChange);
                composer2.updateRememberedValue(objRememberedValue8);
            } else {
                objRememberedValue8 = new i(onActiveChange);
                composer2.updateRememberedValue(objRememberedValue8);
            }
            composer2.endReplaceableGroup();
            BackHandlerKt.BackHandler(z10, (Function0) objRememberedValue8, composer2, i212, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z14 = z13;
            function11 = function10;
            function12 = function8;
            function13 = function9;
            searchBarColors4 = searchBarColors3;
            f12 = f10;
            mutableInteractionSource4 = mutableInteractionSource3;
            shape3 = shape9;
            modifier4 = modifier7;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new j(query, onQueryChange, onSearch, z10, onActiveChange, modifier4, z14, function11, function12, function13, shape3, searchBarColors4, f12, windowInsets4, mutableInteractionSource4, content, i10, i11, i12));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0126  */
    /* JADX WARN: Code duplicated, block: B:102:0x0129  */
    /* JADX WARN: Code duplicated, block: B:106:0x0131  */
    /* JADX WARN: Code duplicated, block: B:114:0x0147  */
    /* JADX WARN: Code duplicated, block: B:117:0x014f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0156  */
    /* JADX WARN: Code duplicated, block: B:121:0x015c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0162  */
    /* JADX WARN: Code duplicated, block: B:124:0x0165  */
    /* JADX WARN: Code duplicated, block: B:134:0x0194  */
    /* JADX WARN: Code duplicated, block: B:136:0x019e  */
    /* JADX WARN: Code duplicated, block: B:144:0x01c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:149:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:151:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:155:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:157:0x01db  */
    /* JADX WARN: Code duplicated, block: B:158:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:162:0x0210  */
    /* JADX WARN: Code duplicated, block: B:164:0x0214  */
    /* JADX WARN: Code duplicated, block: B:166:0x0223  */
    /* JADX WARN: Code duplicated, block: B:169:0x023c  */
    /* JADX WARN: Code duplicated, block: B:172:0x024c  */
    /* JADX WARN: Code duplicated, block: B:175:0x0266  */
    /* JADX WARN: Code duplicated, block: B:178:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:179:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:182:0x0303  */
    /* JADX WARN: Code duplicated, block: B:184:0x0309  */
    /* JADX WARN: Code duplicated, block: B:187:0x0339 A[LOOP:0: B:186:0x0337->B:187:0x0339, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:190:0x034b  */
    /* JADX WARN: Code duplicated, block: B:192:0x0353  */
    /* JADX WARN: Code duplicated, block: B:195:0x0400  */
    /* JADX WARN: Code duplicated, block: B:197:0x0408  */
    /* JADX WARN: Code duplicated, block: B:200:0x048f  */
    /* JADX WARN: Code duplicated, block: B:205:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:208:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x0100  */
    /* JADX WARN: Code duplicated, block: B:91:0x0106  */
    /* JADX WARN: Code duplicated, block: B:92:0x0109  */
    /* JADX WARN: Code duplicated, block: B:96:0x0111  */
    /* JADX WARN: Code duplicated, block: B:97:0x0118  */
    /* JADX WARN: Code duplicated, block: B:99:0x0120  */
    public static final void access$SearchBarInputField(String str, Function1 function1, Function1 function2, boolean z10, Function1 function3, Modifier modifier, boolean z11, Function2 function4, Function2 function5, Function2 function6, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, Composer composer, int i10, int i11, int i12) {
        int i13;
        Modifier modifier2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        Modifier modifier3;
        boolean z12;
        Function2 function7;
        Function2 function8;
        Function2 function9;
        TextFieldColors textFieldColorsM1232inputFieldColorsITpI4ow;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier4;
        boolean z13;
        Function2 function10;
        TextFieldColors textFieldColors2;
        Object objRememberedValue;
        int i26;
        Object objRememberedValue2;
        Composer.Companion companion;
        FocusRequester focusRequester;
        String strM1320getStringNWtq28;
        String strM1320getStringNWtq29;
        long jM3988getColor0d7_KjU;
        long jM2518unboximpl;
        boolean zChanged;
        Object objRememberedValue3;
        int i27;
        Object[] objArr;
        int i28;
        boolean zChanged2;
        Object objRememberedValue4;
        boolean zChanged3;
        Object objRememberedValue5;
        Composer composer2;
        boolean z14;
        Function2 function11;
        Function2 function12;
        Function2 function13;
        MutableInteractionSource mutableInteractionSource3;
        TextFieldColors textFieldColors3;
        Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1330051158);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i13 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 112) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i13 |= composerStartRestartGroup.changed(z10) ? 2048 : 1024;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((57344 & i10) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function3) ? 16384 : 8192;
        }
        int i29 = i12 & 32;
        if (i29 == 0) {
            if ((458752 & i10) == 0) {
                modifier2 = modifier;
                i13 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i14 = i12 & 64;
            if (i14 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z11)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i13 |= i15;
            }
            i16 = i12 & 128;
            if (i16 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i13 |= i17;
            }
            i18 = i12 & 256;
            if (i18 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i19 = 33554432;
                }
                i13 |= i19;
            }
            i20 = i12 & 512;
            if (i20 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(function6)) {
                    i21 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i21 = 268435456;
                }
                i13 |= i21;
            }
            if ((i11 & 14) == 0) {
                i22 = i11 | (((i12 & 1024) == 0 || !composerStartRestartGroup.changed(textFieldColors)) ? 2 : 4);
            } else {
                i22 = i11;
            }
            i23 = i12 & 2048;
            if (i23 != 0) {
                i22 |= 48;
            } else if ((i11 & 112) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i24 = 32;
                } else {
                    i24 = 16;
                }
                i22 |= i24;
            }
            i25 = i22;
            if ((i13 & 1533916891) != 306783378 && (i25 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                z14 = z11;
                function12 = function5;
                function13 = function6;
                textFieldColors3 = textFieldColors;
                mutableInteractionSource3 = mutableInteractionSource;
                composer2 = composerStartRestartGroup;
                modifier5 = modifier2;
                function11 = function4;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i29 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i16 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    if (i18 != 0) {
                        function8 = null;
                    } else {
                        function8 = function5;
                    }
                    if (i20 != 0) {
                        function9 = null;
                    } else {
                        function9 = function6;
                    }
                    if ((i12 & 1024) != 0) {
                        textFieldColorsM1232inputFieldColorsITpI4ow = SearchBarDefaults.INSTANCE.m1232inputFieldColorsITpI4ow(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 24576, 16383);
                        i25 &= -15;
                    } else {
                        textFieldColorsM1232inputFieldColorsITpI4ow = textFieldColors;
                    }
                    if (i23 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    modifier4 = modifier3;
                    z13 = z12;
                    function10 = function7;
                    textFieldColors2 = textFieldColorsM1232inputFieldColorsITpI4ow;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i12 & 1024) != 0) {
                        i25 &= -15;
                    }
                    modifier4 = modifier;
                    z13 = z11;
                    function10 = function4;
                    function8 = function5;
                    function9 = function6;
                    textFieldColors2 = textFieldColors;
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                i26 = i25;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1330051158, i13, i26, "androidx.compose.material3.SearchBarInputField (SearchBar.kt:422)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new FocusRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                focusRequester = (FocusRequester) objRememberedValue2;
                Strings.Companion companion2 = Strings.INSTANCE;
                strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(companion2.m1301getSearchBarSearchadMyvUU(), composerStartRestartGroup, 6);
                strM1320getStringNWtq29 = Strings_androidKt.m1320getStringNWtq28(companion2.m1305getSuggestionsAvailableadMyvUU(), composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(462567106);
                jM3988getColor0d7_KjU = ((TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle())).m3988getColor0d7_KjU();
                if (jM3988getColor0d7_KjU != Color.INSTANCE.m2544getUnspecified0d7_KjU()) {
                    jM2518unboximpl = jM3988getColor0d7_KjU;
                } else {
                    jM2518unboximpl = textFieldColors2.textColor$material3_release(z13, false, mutableInteractionSource2, composerStartRestartGroup, ((i26 << 9) & 7168) | ((i13 >> 18) & 14) | 48 | ((i26 << 3) & 896)).getValue().m2518unboximpl();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifier6 = modifier4;
                Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.SizeKt.m321height3ABfNKs(modifier4, SearchBarDefaults.INSTANCE.m1230getInputFieldHeightD9Ej5fM()), 0.0f, 1, null), focusRequester);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(function3);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new l0.f3(function3);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue3);
                objArr = new Object[]{strM1320getStringNWtq28, Boolean.valueOf(z10), strM1320getStringNWtq29, focusRequester};
                composerStartRestartGroup.startReplaceableGroup(-568225417);
                i28 = 0;
                zChanged2 = false;
                for (i27 = 4; i28 < i27; i27 = 4) {
                    zChanged2 |= composerStartRestartGroup.changed(objArr[i28]);
                    i28++;
                }
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new l0.h3(strM1320getStringNWtq28, z10, strM1320getStringNWtq29, focusRequester);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierOnFocusChanged, false, (Function1) objRememberedValue4, 1, null);
                TextStyle textStyleMerge = ((TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle())).merge(new TextStyle(jM2518unboximpl, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 4194302, null));
                SolidColor solidColor = new SolidColor(textFieldColors2.cursorColor$material3_release(false, composerStartRestartGroup, ((i26 << 3) & 112) | 6).getValue().m2518unboximpl(), null);
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m4122getSearcheUduSuo(), 7, null);
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged3 = composerStartRestartGroup.changed(function2) | composerStartRestartGroup.changed(str);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new l0.i3(str, function2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                TextFieldColors textFieldColors4 = textFieldColors2;
                composer2 = composerStartRestartGroup;
                BasicTextFieldKt.BasicTextField(str, (Function1<? super String, Unit>) function1, modifierSemantics$default, z13, false, textStyleMerge, keyboardOptions, new KeyboardActions(null, null, null, null, (Function1) objRememberedValue5, null, 47, null), true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource2, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, 584727264, true, new l0.l3(str, z13, mutableInteractionSource2, function10, function8, function9, textFieldColors4, i13, i26)), composer2, (i13 & 14) | 102236160 | (i13 & 112) | ((i13 >> 9) & 7168), ((i26 << 6) & 7168) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 7696);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z14 = z13;
                function11 = function10;
                function12 = function8;
                function13 = function9;
                mutableInteractionSource3 = mutableInteractionSource2;
                textFieldColors3 = textFieldColors4;
                modifier5 = modifier6;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new l0.m3(str, function1, function2, z10, function3, modifier5, z14, function11, function12, function13, textFieldColors3, mutableInteractionSource3, i10, i11, i12));
        }
        i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        modifier2 = modifier;
        i14 = i12 & 64;
        if (i14 != 0) {
            i13 |= 1572864;
        } else if ((i10 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(z11)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i13 |= i15;
        }
        i16 = i12 & 128;
        if (i16 != 0) {
            i13 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (composerStartRestartGroup.changedInstance(function4)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i13 |= i17;
        }
        i18 = i12 & 256;
        if (i18 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            if (composerStartRestartGroup.changedInstance(function5)) {
                i19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i19 = 33554432;
            }
            i13 |= i19;
        }
        i20 = i12 & 512;
        if (i20 != 0) {
            i13 |= 805306368;
        } else if ((i10 & 1879048192) == 0) {
            if (composerStartRestartGroup.changedInstance(function6)) {
                i21 = PKIFailureInfo.duplicateCertReq;
            } else {
                i21 = 268435456;
            }
            i13 |= i21;
        }
        if ((i11 & 14) == 0) {
            i22 = i11 | (((i12 & 1024) == 0 || !composerStartRestartGroup.changed(textFieldColors)) ? 2 : 4);
        } else {
            i22 = i11;
        }
        i23 = i12 & 2048;
        if (i23 != 0) {
            i22 |= 48;
        } else if ((i11 & 112) == 0) {
            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                i24 = 32;
            } else {
                i24 = 16;
            }
            i22 |= i24;
        }
        i25 = i22;
        if ((i13 & 1533916891) != 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i29 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier;
                }
                if (i14 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i16 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                if (i18 != 0) {
                    function8 = null;
                } else {
                    function8 = function5;
                }
                if (i20 != 0) {
                    function9 = null;
                } else {
                    function9 = function6;
                }
                if ((i12 & 1024) != 0) {
                    textFieldColorsM1232inputFieldColorsITpI4ow = SearchBarDefaults.INSTANCE.m1232inputFieldColorsITpI4ow(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 24576, 16383);
                    i25 &= -15;
                } else {
                    textFieldColorsM1232inputFieldColorsITpI4ow = textFieldColors;
                }
                if (i23 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                modifier4 = modifier3;
                z13 = z12;
                function10 = function7;
                textFieldColors2 = textFieldColorsM1232inputFieldColorsITpI4ow;
            } else {
                if (i29 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier;
                }
                if (i14 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i16 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                if (i18 != 0) {
                    function8 = null;
                } else {
                    function8 = function5;
                }
                if (i20 != 0) {
                    function9 = null;
                } else {
                    function9 = function6;
                }
                if ((i12 & 1024) != 0) {
                    textFieldColorsM1232inputFieldColorsITpI4ow = SearchBarDefaults.INSTANCE.m1232inputFieldColorsITpI4ow(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 24576, 16383);
                    i25 &= -15;
                } else {
                    textFieldColorsM1232inputFieldColorsITpI4ow = textFieldColors;
                }
                if (i23 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                modifier4 = modifier3;
                z13 = z12;
                function10 = function7;
                textFieldColors2 = textFieldColorsM1232inputFieldColorsITpI4ow;
            }
            i26 = i25;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1330051158, i13, i26, "androidx.compose.material3.SearchBarInputField (SearchBar.kt:422)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            focusRequester = (FocusRequester) objRememberedValue2;
            Strings.Companion companion3 = Strings.INSTANCE;
            strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(companion3.m1301getSearchBarSearchadMyvUU(), composerStartRestartGroup, 6);
            strM1320getStringNWtq29 = Strings_androidKt.m1320getStringNWtq28(companion3.m1305getSuggestionsAvailableadMyvUU(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(462567106);
            jM3988getColor0d7_KjU = ((TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle())).m3988getColor0d7_KjU();
            if (jM3988getColor0d7_KjU != Color.INSTANCE.m2544getUnspecified0d7_KjU()) {
                jM2518unboximpl = jM3988getColor0d7_KjU;
            } else {
                jM2518unboximpl = textFieldColors2.textColor$material3_release(z13, false, mutableInteractionSource2, composerStartRestartGroup, ((i26 << 9) & 7168) | ((i13 >> 18) & 14) | 48 | ((i26 << 3) & 896)).getValue().m2518unboximpl();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifier7 = modifier4;
            Modifier modifierFocusRequester2 = FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.SizeKt.m321height3ABfNKs(modifier4, SearchBarDefaults.INSTANCE.m1230getInputFieldHeightD9Ej5fM()), 0.0f, 1, null), focusRequester);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(function3);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue3 = new l0.f3(function3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new l0.f3(function3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOnFocusChanged2 = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester2, (Function1) objRememberedValue3);
            objArr = new Object[]{strM1320getStringNWtq28, Boolean.valueOf(z10), strM1320getStringNWtq29, focusRequester};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            i28 = 0;
            zChanged2 = false;
            while (i28 < i27) {
                zChanged2 |= composerStartRestartGroup.changed(objArr[i28]);
                i28++;
            }
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue4 = new l0.h3(strM1320getStringNWtq28, z10, strM1320getStringNWtq29, focusRequester);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new l0.h3(strM1320getStringNWtq28, z10, strM1320getStringNWtq29, focusRequester);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(modifierOnFocusChanged2, false, (Function1) objRememberedValue4, 1, null);
            TextStyle textStyleMerge2 = ((TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle())).merge(new TextStyle(jM2518unboximpl, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 4194302, null));
            SolidColor solidColor2 = new SolidColor(textFieldColors2.cursorColor$material3_release(false, composerStartRestartGroup, ((i26 << 3) & 112) | 6).getValue().m2518unboximpl(), null);
            KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m4122getSearcheUduSuo(), 7, null);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged3 = composerStartRestartGroup.changed(function2) | composerStartRestartGroup.changed(str);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged3) {
                objRememberedValue5 = new l0.i3(str, function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                objRememberedValue5 = new l0.i3(str, function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TextFieldColors textFieldColors5 = textFieldColors2;
            composer2 = composerStartRestartGroup;
            BasicTextFieldKt.BasicTextField(str, (Function1<? super String, Unit>) function1, modifierSemantics$default2, z13, false, textStyleMerge2, keyboardOptions2, new KeyboardActions(null, null, null, null, (Function1) objRememberedValue5, null, 47, null), true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource2, (Brush) solidColor2, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, 584727264, true, new l0.l3(str, z13, mutableInteractionSource2, function10, function8, function9, textFieldColors5, i13, i26)), composer2, (i13 & 14) | 102236160 | (i13 & 112) | ((i13 >> 9) & 7168), ((i26 << 6) & 7168) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 7696);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z14 = z13;
            function11 = function10;
            function12 = function8;
            function13 = function9;
            mutableInteractionSource3 = mutableInteractionSource2;
            textFieldColors3 = textFieldColors5;
            modifier5 = modifier7;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i29 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier;
                }
                if (i14 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i16 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                if (i18 != 0) {
                    function8 = null;
                } else {
                    function8 = function5;
                }
                if (i20 != 0) {
                    function9 = null;
                } else {
                    function9 = function6;
                }
                if ((i12 & 1024) != 0) {
                    textFieldColorsM1232inputFieldColorsITpI4ow = SearchBarDefaults.INSTANCE.m1232inputFieldColorsITpI4ow(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 24576, 16383);
                    i25 &= -15;
                } else {
                    textFieldColorsM1232inputFieldColorsITpI4ow = textFieldColors;
                }
                if (i23 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                modifier4 = modifier3;
                z13 = z12;
                function10 = function7;
                textFieldColors2 = textFieldColorsM1232inputFieldColorsITpI4ow;
            } else {
                if (i29 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier;
                }
                if (i14 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i16 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                if (i18 != 0) {
                    function8 = null;
                } else {
                    function8 = function5;
                }
                if (i20 != 0) {
                    function9 = null;
                } else {
                    function9 = function6;
                }
                if ((i12 & 1024) != 0) {
                    textFieldColorsM1232inputFieldColorsITpI4ow = SearchBarDefaults.INSTANCE.m1232inputFieldColorsITpI4ow(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 24576, 16383);
                    i25 &= -15;
                } else {
                    textFieldColorsM1232inputFieldColorsITpI4ow = textFieldColors;
                }
                if (i23 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                modifier4 = modifier3;
                z13 = z12;
                function10 = function7;
                textFieldColors2 = textFieldColorsM1232inputFieldColorsITpI4ow;
            }
            i26 = i25;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1330051158, i13, i26, "androidx.compose.material3.SearchBarInputField (SearchBar.kt:422)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            focusRequester = (FocusRequester) objRememberedValue2;
            Strings.Companion companion4 = Strings.INSTANCE;
            strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(companion4.m1301getSearchBarSearchadMyvUU(), composerStartRestartGroup, 6);
            strM1320getStringNWtq29 = Strings_androidKt.m1320getStringNWtq28(companion4.m1305getSuggestionsAvailableadMyvUU(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(462567106);
            jM3988getColor0d7_KjU = ((TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle())).m3988getColor0d7_KjU();
            if (jM3988getColor0d7_KjU != Color.INSTANCE.m2544getUnspecified0d7_KjU()) {
                jM2518unboximpl = jM3988getColor0d7_KjU;
            } else {
                jM2518unboximpl = textFieldColors2.textColor$material3_release(z13, false, mutableInteractionSource2, composerStartRestartGroup, ((i26 << 9) & 7168) | ((i13 >> 18) & 14) | 48 | ((i26 << 3) & 896)).getValue().m2518unboximpl();
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifier8 = modifier4;
            Modifier modifierFocusRequester3 = FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.SizeKt.m321height3ABfNKs(modifier4, SearchBarDefaults.INSTANCE.m1230getInputFieldHeightD9Ej5fM()), 0.0f, 1, null), focusRequester);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(function3);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue3 = new l0.f3(function3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new l0.f3(function3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierOnFocusChanged3 = FocusChangedModifierKt.onFocusChanged(modifierFocusRequester3, (Function1) objRememberedValue3);
            objArr = new Object[]{strM1320getStringNWtq28, Boolean.valueOf(z10), strM1320getStringNWtq29, focusRequester};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            i28 = 0;
            zChanged2 = false;
            while (i28 < i27) {
                zChanged2 |= composerStartRestartGroup.changed(objArr[i28]);
                i28++;
            }
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                objRememberedValue4 = new l0.h3(strM1320getStringNWtq28, z10, strM1320getStringNWtq29, focusRequester);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                objRememberedValue4 = new l0.h3(strM1320getStringNWtq28, z10, strM1320getStringNWtq29, focusRequester);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierSemantics$default3 = SemanticsModifierKt.semantics$default(modifierOnFocusChanged3, false, (Function1) objRememberedValue4, 1, null);
            TextStyle textStyleMerge3 = ((TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle())).merge(new TextStyle(jM2518unboximpl, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 4194302, null));
            SolidColor solidColor3 = new SolidColor(textFieldColors2.cursorColor$material3_release(false, composerStartRestartGroup, ((i26 << 3) & 112) | 6).getValue().m2518unboximpl(), null);
            KeyboardOptions keyboardOptions3 = new KeyboardOptions(0, false, 0, ImeAction.INSTANCE.m4122getSearcheUduSuo(), 7, null);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged3 = composerStartRestartGroup.changed(function2) | composerStartRestartGroup.changed(str);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChanged3) {
                objRememberedValue5 = new l0.i3(str, function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                objRememberedValue5 = new l0.i3(str, function2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TextFieldColors textFieldColors6 = textFieldColors2;
            composer2 = composerStartRestartGroup;
            BasicTextFieldKt.BasicTextField(str, (Function1<? super String, Unit>) function1, modifierSemantics$default3, z13, false, textStyleMerge3, keyboardOptions3, new KeyboardActions(null, null, null, null, (Function1) objRememberedValue5, null, 47, null), true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, mutableInteractionSource2, (Brush) solidColor3, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composerStartRestartGroup, 584727264, true, new l0.l3(str, z13, mutableInteractionSource2, function10, function8, function9, textFieldColors6, i13, i26)), composer2, (i13 & 14) | 102236160 | (i13 & 112) | ((i13 >> 9) & 7168), ((i26 << 6) & 7168) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 7696);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z14 = z13;
            function11 = function10;
            function12 = function8;
            function13 = function9;
            mutableInteractionSource3 = mutableInteractionSource2;
            textFieldColors3 = textFieldColors6;
            modifier5 = modifier8;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new l0.m3(str, function1, function2, z10, function3, modifier5, z14, function11, function12, function13, textFieldColors3, mutableInteractionSource3, i10, i11, i12));
    }

    public static final boolean access$SearchBar_Id_Pb_0$lambda$2(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public static final float getDockedActiveTableMinHeight() {
        return f11165b;
    }

    public static final float getSearchBarMinWidth() {
        return f11166c;
    }

    public static final float getSearchBarVerticalPadding() {
        return f11168e;
    }
}
