package androidx.compose.material;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableOpenTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextFieldImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aá\u0001\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00062\u0006\u0010\t\u001a\u00020\b2\u0013\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\f\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001aW\u0010&\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2 \u0010#\u001a\u001c\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0000H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%\u001a\u0012\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'H\u0000\u001a\u0012\u0010+\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'H\u0000\"\u0014\u0010,\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b,\u0010-\"\u0014\u0010.\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b.\u0010-\"\u0014\u0010/\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u0010-\"\u0014\u00100\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u0010-\"\u0014\u00101\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u0010-\"\u001d\u00107\u001a\u0002028\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0014\u00108\u001a\u00020)8\u0000X\u0080T¢\u0006\u0006\n\u0004\b8\u00109\"\u001d\u0010?\u001a\u00020:8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u001d\u0010B\u001a\u00020:8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\bA\u0010>\"\u001a\u0010H\u001a\u00020C8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u001a\u0010M\u001a\u0004\u0018\u00010J*\u00020I8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006N"}, d2 = {"Landroidx/compose/material/TextFieldType;", "type", "", "value", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "innerTextField", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "", "singleLine", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/material/TextFieldColors;", "colors", OutlinedTextFieldKt.BorderId, "CommonDecorationBox", "(Landroidx/compose/material/TextFieldType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/material/TextFieldColors;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/graphics/Color;", "contentColor", "Landroidx/compose/ui/text/TextStyle;", "typography", "", "contentAlpha", "Landroidx/compose/runtime/ComposableOpenTarget;", FirebaseAnalytics.Param.INDEX, "content", "Decoration-euL9pac", "(JLandroidx/compose/ui/text/TextStyle;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Decoration", "Landroidx/compose/ui/layout/Placeable;", "placeable", "", "widthOrZero", "heightOrZero", "TextFieldId", "Ljava/lang/String;", "PlaceholderId", "LabelId", "LeadingId", "TrailingId", "Landroidx/compose/ui/unit/Constraints;", "a", "J", "getZeroConstraints", "()J", "ZeroConstraints", "AnimationDuration", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Landroidx/compose/ui/unit/Dp;", "b", "F", "getTextFieldPadding", "()F", "TextFieldPadding", "c", "getHorizontalIconPadding", "HorizontalIconPadding", "Landroidx/compose/ui/Modifier;", "d", "Landroidx/compose/ui/Modifier;", "getIconDefaultSizeModifier", "()Landroidx/compose/ui/Modifier;", "IconDefaultSizeModifier", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "getLayoutId", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Ljava/lang/Object;", "layoutId", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,376:1\n50#2:377\n49#2:378\n1097#3,6:379\n658#4:385\n646#4:386\n658#4:387\n646#4:388\n154#5:389\n154#5:390\n154#5:391\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt\n*L\n81#1:377\n81#1:378\n81#1:379,6\n112#1:385\n112#1:386\n115#1:387\n115#1:388\n373#1:389\n374#1:390\n376#1:391\n*E\n"})
public final class TextFieldImplKt {
    public static final int AnimationDuration = 150;

    @NotNull
    public static final String LabelId = "Label";

    @NotNull
    public static final String LeadingId = "Leading";

    @NotNull
    public static final String PlaceholderId = "Hint";

    @NotNull
    public static final String TextFieldId = "TextField";

    @NotNull
    public static final String TrailingId = "Trailing";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f8178a = ConstraintsKt.Constraints(0, 0, 0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f8179b = Dp.m4389constructorimpl(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f8180c = Dp.m4389constructorimpl(12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Modifier f8181d;

    /* JADX INFO: compiled from: TextFieldImpl.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ boolean E0;
        public final /* synthetic */ InteractionSource F0;
        public final /* synthetic */ PaddingValues G0;
        public final /* synthetic */ TextFieldColors H0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> I0;
        public final /* synthetic */ int J0;
        public final /* synthetic */ int K0;
        public final /* synthetic */ int L0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TextFieldType f8191p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f8192q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f8193r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ VisualTransformation f8194s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f8195t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f8196u0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f8197w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ boolean f8198x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ boolean f8199y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(TextFieldType textFieldType, String str, Function2<? super Composer, ? super Integer, Unit> function2, VisualTransformation visualTransformation, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, Function2<? super Composer, ? super Integer, Unit> function5, Function2<? super Composer, ? super Integer, Unit> function6, boolean z10, boolean z11, boolean z12, InteractionSource interactionSource, PaddingValues paddingValues, TextFieldColors textFieldColors, Function2<? super Composer, ? super Integer, Unit> function7, int i10, int i11, int i12) {
            super(2);
            this.f8191p0 = textFieldType;
            this.f8192q0 = str;
            this.f8193r0 = function2;
            this.f8194s0 = visualTransformation;
            this.f8195t0 = function3;
            this.f8196u0 = function4;
            this.v0 = function5;
            this.f8197w0 = function6;
            this.f8198x0 = z10;
            this.f8199y0 = z11;
            this.E0 = z12;
            this.F0 = interactionSource;
            this.G0 = paddingValues;
            this.H0 = textFieldColors;
            this.I0 = function7;
            this.J0 = i10;
            this.K0 = i11;
            this.L0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TextFieldImplKt.CommonDecorationBox(this.f8191p0, this.f8192q0, this.f8193r0, this.f8194s0, this.f8195t0, this.f8196u0, this.v0, this.f8197w0, this.f8198x0, this.f8199y0, this.E0, this.F0, this.G0, this.H0, this.I0, composer, RecomposeScopeImplKt.updateChangedFlags(this.J0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.K0), this.L0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TextFieldImpl.kt */
    public static final class b extends Lambda implements Function3<h0.g1, Composer, Integer, Color> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TextFieldColors f8200p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f8201q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f8202r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ InteractionSource f8203s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f8204t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f8205u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, int i11, InteractionSource interactionSource, TextFieldColors textFieldColors, boolean z10, boolean z11) {
            super(3);
            this.f8200p0 = textFieldColors;
            this.f8201q0 = z10;
            this.f8202r0 = z11;
            this.f8203s0 = interactionSource;
            this.f8204t0 = i10;
            this.f8205u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Color invoke(h0.g1 g1Var, Composer composer, Integer num) {
            h0.g1 it = g1Var;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(it, "it");
            composer2.startReplaceableGroup(697243846);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(697243846, iIntValue, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:91)");
            }
            TextFieldColors textFieldColors = this.f8200p0;
            boolean z10 = this.f8201q0;
            boolean z11 = it == h0.g1.UnfocusedEmpty ? false : this.f8202r0;
            InteractionSource interactionSource = this.f8203s0;
            int i10 = (this.f8204t0 >> 27) & 14;
            int i11 = this.f8205u0;
            long jM2518unboximpl = textFieldColors.labelColor(z10, z11, interactionSource, composer2, i10 | ((i11 << 3) & 896) | (i11 & 7168)).getValue().m2518unboximpl();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return Color.m2498boximpl(jM2518unboximpl);
        }
    }

    /* JADX INFO: compiled from: TextFieldImpl.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f8206p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TextStyle f8207q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Float f8208r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f8209s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f8210t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f8211u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(long j10, TextStyle textStyle, Float f6, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f8206p0 = j10;
            this.f8207q0 = textStyle;
            this.f8208r0 = f6;
            this.f8209s0 = function2;
            this.f8210t0 = i10;
            this.f8211u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TextFieldImplKt.m875DecorationeuL9pac(this.f8206p0, this.f8207q0, this.f8208r0, this.f8209s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8210t0 | 1), this.f8211u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TextFieldImpl.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f8212p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Float f8213q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f8214r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f8215s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10, long j10, Float f6, Function2 function2) {
            super(2);
            this.f8212p0 = j10;
            this.f8213q0 = f6;
            this.f8214r0 = function2;
            this.f8215s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(494684590, iIntValue, -1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:239)");
                }
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(this.f8212p0))}, ComposableLambdaKt.composableLambda(composer2, -1132188434, true, new j3(this.f8215s0, this.f8212p0, this.f8213q0, this.f8214r0)), composer2, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    static {
        float f6 = 48;
        f8181d = SizeKt.m319defaultMinSizeVpY3zN4(Modifier.INSTANCE, Dp.m4389constructorimpl(f6), Dp.m4389constructorimpl(f6));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void CommonDecorationBox(@NotNull final TextFieldType type, @NotNull String value, @NotNull final Function2<? super Composer, ? super Integer, Unit> innerTextField, @NotNull VisualTransformation visualTransformation, @Nullable final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function4, @Nullable Function2<? super Composer, ? super Integer, Unit> function5, boolean z10, boolean z11, boolean z12, @NotNull final InteractionSource interactionSource, @NotNull final PaddingValues contentPadding, @NotNull final TextFieldColors colors, @Nullable Function2<? super Composer, ? super Integer, Unit> function6, @Nullable Composer composer, int i10, int i11, int i12) {
        int i13;
        int i14;
        h0.g1 g1Var;
        Composer composer2;
        Function2<? super Composer, ? super Integer, Unit> function7;
        Function2<? super Composer, ? super Integer, Unit> function8;
        Function2<? super Composer, ? super Integer, Unit> function9;
        boolean z13;
        boolean z14;
        boolean z15;
        Function2<? super Composer, ? super Integer, Unit> function10;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer composerStartRestartGroup = composer.startRestartGroup(-712568069);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i13 = (composerStartRestartGroup.changed(type) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 112) == 0) {
            i13 |= composerStartRestartGroup.changed(value) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(innerTextField) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i13 |= composerStartRestartGroup.changed(visualTransformation) ? 2048 : 1024;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((57344 & i10) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        int i15 = i12 & 32;
        if (i15 != 0) {
            i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i10 & 458752) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function3) ? 131072 : 65536;
        }
        int i16 = i12 & 64;
        if (i16 != 0) {
            i13 |= 1572864;
        } else if ((i10 & 3670016) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function4) ? 1048576 : 524288;
        }
        int i17 = i12 & 128;
        if (i17 != 0) {
            i13 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(function5) ? 8388608 : 4194304;
        }
        int i18 = i12 & 256;
        if (i18 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            i13 |= composerStartRestartGroup.changed(z10) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i19 = i12 & 512;
        if (i19 != 0) {
            i13 |= 805306368;
        } else if ((i10 & 1879048192) == 0) {
            i13 |= composerStartRestartGroup.changed(z11) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i20 = i12 & 1024;
        if (i20 != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i14 = i11 | (composerStartRestartGroup.changed(z12) ? 4 : 2);
        } else {
            i14 = i11;
        }
        if ((i12 & 2048) != 0) {
            i14 |= 48;
        } else if ((i11 & 112) == 0) {
            i14 |= composerStartRestartGroup.changed(interactionSource) ? 32 : 16;
        }
        int i21 = i14;
        if ((i12 & 4096) != 0) {
            i21 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i11 & 896) == 0) {
            i21 |= composerStartRestartGroup.changed(contentPadding) ? 256 : 128;
        }
        if ((i12 & 8192) != 0) {
            i21 |= 3072;
        } else if ((i11 & 7168) == 0) {
            i21 |= composerStartRestartGroup.changed(colors) ? 2048 : 1024;
        }
        int i22 = i12 & 16384;
        if (i22 != 0) {
            i21 |= 24576;
        } else if ((i11 & 57344) == 0) {
            i21 |= composerStartRestartGroup.changedInstance(function6) ? 16384 : 8192;
        }
        if ((i13 & 1533916891) == 306783378 && (46811 & i21) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function7 = function3;
            function8 = function4;
            function9 = function5;
            z13 = z10;
            z14 = z11;
            z15 = z12;
            function10 = function6;
            composer2 = composerStartRestartGroup;
        } else {
            Function2<? super Composer, ? super Integer, Unit> function11 = i15 != 0 ? null : function3;
            Function2<? super Composer, ? super Integer, Unit> function12 = i16 != 0 ? null : function4;
            Function2<? super Composer, ? super Integer, Unit> function13 = i17 != 0 ? null : function5;
            boolean z16 = i18 != 0 ? false : z10;
            boolean z17 = i19 != 0 ? true : z11;
            boolean z18 = i20 != 0 ? false : z12;
            Function2<? super Composer, ? super Integer, Unit> function14 = i22 != 0 ? null : function6;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-712568069, i13, i21, "androidx.compose.material.CommonDecorationBox (TextFieldImpl.kt:63)");
            }
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(value) | composerStartRestartGroup.changed(visualTransformation);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = visualTransformation.filter(new AnnotatedString(value, null, null, 6, null));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final String text = ((TransformedText) objRememberedValue).getText().getText();
            if (FocusInteractionKt.collectIsFocusedAsState(interactionSource, composerStartRestartGroup, (i21 >> 3) & 14).getValue().booleanValue()) {
                g1Var = h0.g1.Focused;
            } else {
                g1Var = text.length() == 0 ? h0.g1.UnfocusedEmpty : h0.g1.UnfocusedNotEmpty;
            }
            h0.g1 g1Var2 = g1Var;
            final int i23 = i13;
            b bVar = new b(i13, i21, interactionSource, colors, z17, z18);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            Typography typography = materialTheme.getTypography(composerStartRestartGroup, 6);
            TextStyle subtitle1 = typography.getSubtitle1();
            TextStyle caption = typography.getCaption();
            long jM3988getColor0d7_KjU = subtitle1.m3988getColor0d7_KjU();
            Color.Companion companion = Color.INSTANCE;
            boolean z19 = (Color.m2509equalsimpl0(jM3988getColor0d7_KjU, companion.m2544getUnspecified0d7_KjU()) && !Color.m2509equalsimpl0(caption.m3988getColor0d7_KjU(), companion.m2544getUnspecified0d7_KjU())) || (!Color.m2509equalsimpl0(subtitle1.m3988getColor0d7_KjU(), companion.m2544getUnspecified0d7_KjU()) && Color.m2509equalsimpl0(caption.m3988getColor0d7_KjU(), companion.m2544getUnspecified0d7_KjU()));
            TextFieldTransitionScope textFieldTransitionScope = TextFieldTransitionScope.f8284a;
            composerStartRestartGroup.startReplaceableGroup(2129141006);
            long jM3988getColor0d7_KjU2 = materialTheme.getTypography(composerStartRestartGroup, 6).getCaption().m3988getColor0d7_KjU();
            if (z19 && jM3988getColor0d7_KjU2 == companion.m2544getUnspecified0d7_KjU()) {
                jM3988getColor0d7_KjU2 = bVar.invoke(g1Var2, composerStartRestartGroup, 0).m2518unboximpl();
            }
            long j10 = jM3988getColor0d7_KjU2;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(2129141197);
            long jM3988getColor0d7_KjU3 = materialTheme.getTypography(composerStartRestartGroup, 6).getSubtitle1().m3988getColor0d7_KjU();
            if (z19 && jM3988getColor0d7_KjU3 == companion.m2544getUnspecified0d7_KjU()) {
                jM3988getColor0d7_KjU3 = bVar.invoke(g1Var2, composerStartRestartGroup, 0).m2518unboximpl();
            }
            long j11 = jM3988getColor0d7_KjU3;
            composerStartRestartGroup.endReplaceableGroup();
            final Function2<? super Composer, ? super Integer, Unit> function15 = function11;
            final boolean z20 = z18;
            final int i24 = i21;
            final boolean z21 = z17;
            final Function2<? super Composer, ? super Integer, Unit> function16 = function12;
            final Function2<? super Composer, ? super Integer, Unit> function17 = function13;
            final boolean z22 = z16;
            final boolean z23 = z19;
            final Function2<? super Composer, ? super Integer, Unit> function18 = function14;
            composer2 = composerStartRestartGroup;
            textFieldTransitionScope.a(g1Var2, j10, j11, bVar, function2 != null, ComposableLambdaKt.composableLambda(composer2, 341865432, true, new Function6<Float, Color, Color, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt.CommonDecorationBox.3

                /* JADX INFO: renamed from: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$WhenMappings */
                /* JADX INFO: compiled from: TextFieldImpl.kt */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[TextFieldType.values().length];
                        try {
                            iArr[TextFieldType.Filled.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[TextFieldType.Outlined.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(6);
                }

                /* JADX WARN: Type inference failed for: r1v22 */
                /* JADX WARN: Type inference failed for: r1v3 */
                /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlin.jvm.functions.Function6
                public final Unit invoke(Float f6, Color color, Color color2, Float f10, Composer composer3, Integer num) {
                    int i25;
                    ?? r1;
                    ComposableLambda composableLambda;
                    Composer composer4;
                    Object obj;
                    ComposableLambda composableLambda2;
                    long jM2518unboximpl;
                    long jM2518unboximpl2;
                    int i26;
                    ComposableLambda composableLambda3;
                    float f11;
                    float fFloatValue = f6.floatValue();
                    long jM2518unboximpl3 = color.m2518unboximpl();
                    long jM2518unboximpl4 = color2.m2518unboximpl();
                    float fFloatValue2 = f10.floatValue();
                    Composer composer5 = composer3;
                    int iIntValue = num.intValue();
                    if ((iIntValue & 14) == 0) {
                        i25 = (composer5.changed(fFloatValue) ? 4 : 2) | iIntValue;
                    } else {
                        i25 = iIntValue;
                    }
                    if ((iIntValue & 112) == 0) {
                        i25 |= composer5.changed(jM2518unboximpl3) ? 32 : 16;
                    }
                    if ((iIntValue & 896) == 0) {
                        i25 |= composer5.changed(jM2518unboximpl4) ? 256 : 128;
                    }
                    if ((iIntValue & 7168) == 0) {
                        i25 |= composer5.changed(fFloatValue2) ? 2048 : 1024;
                    }
                    int i27 = i25;
                    if ((46811 & i27) == 9362 && composer5.getSkipping()) {
                        composer5.skipToGroupEnd();
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(341865432, i27, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:118)");
                        }
                        Function2<Composer, Integer, Unit> function19 = function2;
                        if (function19 != null) {
                            r1 = 1;
                            composableLambda = ComposableLambdaKt.composableLambda(composer5, 362863774, true, new d3(fFloatValue, jM2518unboximpl4, function19, i27, z23, jM2518unboximpl3));
                        } else {
                            r1 = 1;
                            composableLambda = null;
                        }
                        if (function15 == null || text.length() != 0 || fFloatValue2 <= 0.0f) {
                            composer4 = composer5;
                            obj = null;
                            composableLambda2 = null;
                        } else {
                            obj = null;
                            composer4 = composer5;
                            composableLambda2 = ComposableLambdaKt.composableLambda(composer4, 1120552650, r1, new f3(fFloatValue2, colors, z21, i23, i24, function15));
                        }
                        String strM832getString4foXLRw = Strings_androidKt.m832getString4foXLRw(Strings.INSTANCE.m827getDefaultErrorMessageUdPEhr4(), composer4, 6);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        boolean z24 = z20;
                        Boolean boolValueOf = Boolean.valueOf(z24);
                        composer4.startReplaceableGroup(511388516);
                        boolean zChanged2 = composer4.changed(boolValueOf) | composer4.changed(strM832getString4foXLRw);
                        Object objRememberedValue2 = composer4.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new h3(z24, strM832getString4foXLRw);
                            composer4.updateRememberedValue(objRememberedValue2);
                        }
                        composer4.endReplaceableGroup();
                        Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion2, false, (Function1) objRememberedValue2, r1, obj);
                        TextFieldColors textFieldColors = colors;
                        boolean z25 = textFieldColors instanceof TextFieldColorsWithIcons;
                        boolean z26 = z21;
                        int i28 = i23;
                        int i29 = i24;
                        if (z25) {
                            composer4.startReplaceableGroup(-1083197701);
                            int i30 = i29 << 3;
                            jM2518unboximpl = ((TextFieldColorsWithIcons) textFieldColors).leadingIconColor(z21, z20, interactionSource, composer4, ((i28 >> 27) & 14) | (i30 & 112) | (i30 & 896)).getValue().m2518unboximpl();
                            composer4.endReplaceableGroup();
                        } else {
                            composer4.startReplaceableGroup(-1083197605);
                            jM2518unboximpl = textFieldColors.leadingIconColor(z26, z24, composer4, ((i28 >> 27) & 14) | ((i29 << 3) & 112) | ((i29 >> 3) & 896)).getValue().m2518unboximpl();
                            composer4.endReplaceableGroup();
                        }
                        ComposableLambda composableLambda4 = composableLambda2;
                        long j12 = jM2518unboximpl;
                        Function2<Composer, Integer, Unit> function20 = function16;
                        ComposableLambda composableLambda5 = function20 != null ? ComposableLambdaKt.composableLambda(composer4, 1505327088, true, new e3(j12, function20)) : null;
                        if (z25) {
                            composer4.startReplaceableGroup(-1083197259);
                            int i31 = i29 << 3;
                            jM2518unboximpl2 = ((TextFieldColorsWithIcons) textFieldColors).trailingIconColor(z21, z20, interactionSource, composer4, ((i28 >> 27) & 14) | (i31 & 112) | (i31 & 896)).getValue().m2518unboximpl();
                            composer4.endReplaceableGroup();
                        } else {
                            composer4.startReplaceableGroup(-1083197162);
                            jM2518unboximpl2 = textFieldColors.trailingIconColor(z26, z24, composer4, ((i28 >> 27) & 14) | ((i29 << 3) & 112) | ((i29 >> 3) & 896)).getValue().m2518unboximpl();
                            composer4.endReplaceableGroup();
                        }
                        Function2<Composer, Integer, Unit> function21 = function17;
                        if (function21 != null) {
                            g3 g3Var = new g3(jM2518unboximpl2, function21);
                            i26 = 1;
                            composableLambda3 = ComposableLambdaKt.composableLambda(composer4, -1894727196, true, g3Var);
                        } else {
                            i26 = 1;
                            composableLambda3 = null;
                        }
                        int i32 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
                        if (i32 == i26) {
                            Composer composer6 = composer4;
                            composer6.startReplaceableGroup(-1083196826);
                            TextFieldKt.TextFieldLayout(modifierSemantics$default, innerTextField, composableLambda, composableLambda4, composableLambda5, composableLambda3, z22, fFloatValue, contentPadding, composer6, ((i28 >> 3) & 112) | ((i28 >> 6) & 3670016) | ((i27 << 21) & 29360128) | ((i29 << 18) & 234881024));
                            composer6.endReplaceableGroup();
                        } else if (i32 != 2) {
                            composer4.startReplaceableGroup(-1083194783);
                            composer4.endReplaceableGroup();
                        } else {
                            Object objB = androidx.databinding.c.b(composer4, -1083196270, -492369756);
                            Composer.Companion companion3 = Composer.INSTANCE;
                            if (objB == companion3.getEmpty()) {
                                objB = SnapshotStateKt.mutableStateOf$default(Size.m2332boximpl(Size.INSTANCE.m2353getZeroNHjbRc()), null, 2, null);
                                composer4.updateRememberedValue(objB);
                            }
                            composer4.endReplaceableGroup();
                            MutableState mutableState = (MutableState) objB;
                            ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composer4, 139886979, true, new i3(mutableState, contentPadding, function18, i29));
                            Function2<Composer, Integer, Unit> function22 = innerTextField;
                            boolean z27 = z22;
                            Float fValueOf = Float.valueOf(fFloatValue);
                            composer4.startReplaceableGroup(511388516);
                            boolean zChanged3 = composer4.changed(fValueOf) | composer4.changed(mutableState);
                            Object objRememberedValue3 = composer4.rememberedValue();
                            if (zChanged3 || objRememberedValue3 == companion3.getEmpty()) {
                                f11 = fFloatValue;
                                objRememberedValue3 = new c3(mutableState, f11);
                                composer4.updateRememberedValue(objRememberedValue3);
                            } else {
                                f11 = fFloatValue;
                            }
                            composer4.endReplaceableGroup();
                            Composer composer7 = composer4;
                            OutlinedTextFieldKt.OutlinedTextFieldLayout(modifierSemantics$default, function22, composableLambda4, composableLambda, composableLambda5, composableLambda3, z27, f11, (Function1) objRememberedValue3, composableLambda6, contentPadding, composer7, ((i28 >> 3) & 112) | 805306368 | ((i28 >> 6) & 3670016) | ((i27 << 21) & 29360128), (i29 >> 6) & 14);
                            composer7.endReplaceableGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    return Unit.INSTANCE;
                }
            }), composer2, 1769472);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function7 = function11;
            function8 = function12;
            function9 = function13;
            z13 = z16;
            z14 = z17;
            z15 = z18;
            function10 = function14;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(type, value, innerTextField, visualTransformation, function2, function7, function8, function9, z13, z14, z15, interactionSource, contentPadding, colors, function10, i10, i11, i12));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:61:0x009d  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableOpenTarget(index = 0)
    /* JADX INFO: renamed from: Decoration-euL9pac, reason: not valid java name */
    public static final void m875DecorationeuL9pac(long j10, @Nullable TextStyle textStyle, @Nullable Float f6, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        TextStyle textStyle2;
        int i13;
        Float f10;
        int i14;
        int i15;
        int i16;
        TextStyle textStyle3;
        Float f11;
        ComposableLambda composableLambda;
        Float f12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-399493340);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(j10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 112) == 0) {
                textStyle2 = textStyle;
                i12 |= composerStartRestartGroup.changed(textStyle2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    f10 = f6;
                    if (composerStartRestartGroup.changed(f10)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 7168) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                i16 = i12;
                if ((i16 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    if (i17 != 0) {
                        textStyle3 = null;
                    } else {
                        textStyle3 = textStyle2;
                    }
                    if (i13 != 0) {
                        f11 = null;
                    } else {
                        f11 = f10;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-399493340, i16, -1, "androidx.compose.material.Decoration (TextFieldImpl.kt:233)");
                    }
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 494684590, true, new d(i16, j10, f11, content));
                    if (textStyle3 != null) {
                        composerStartRestartGroup.startReplaceableGroup(-2009952671);
                        TextKt.ProvideTextStyle(textStyle3, composableLambda, composerStartRestartGroup, ((i16 >> 3) & 14) | 48);
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-2009952619);
                        composableLambda.invoke(composerStartRestartGroup, 6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    textStyle2 = textStyle3;
                    f12 = f11;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    f12 = f10;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(j10, textStyle2, f12, content, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            f10 = f6;
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            i16 = i12;
            if ((i16 & 5851) == 1170) {
                if (i17 != 0) {
                    textStyle3 = null;
                } else {
                    textStyle3 = textStyle2;
                }
                if (i13 != 0) {
                    f11 = null;
                } else {
                    f11 = f10;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-399493340, i16, -1, "androidx.compose.material.Decoration (TextFieldImpl.kt:233)");
                }
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 494684590, true, new d(i16, j10, f11, content));
                if (textStyle3 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-2009952671);
                    TextKt.ProvideTextStyle(textStyle3, composableLambda, composerStartRestartGroup, ((i16 >> 3) & 14) | 48);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-2009952619);
                    composableLambda.invoke(composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                textStyle2 = textStyle3;
                f12 = f11;
            } else {
                if (i17 != 0) {
                    textStyle3 = null;
                } else {
                    textStyle3 = textStyle2;
                }
                if (i13 != 0) {
                    f11 = null;
                } else {
                    f11 = f10;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-399493340, i16, -1, "androidx.compose.material.Decoration (TextFieldImpl.kt:233)");
                }
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 494684590, true, new d(i16, j10, f11, content));
                if (textStyle3 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-2009952671);
                    TextKt.ProvideTextStyle(textStyle3, composableLambda, composerStartRestartGroup, ((i16 >> 3) & 14) | 48);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-2009952619);
                    composableLambda.invoke(composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                textStyle2 = textStyle3;
                f12 = f11;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(j10, textStyle2, f12, content, i10, i11));
        }
        i12 |= 48;
        textStyle2 = textStyle;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                f10 = f6;
                if (composerStartRestartGroup.changed(f10)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            i16 = i12;
            if ((i16 & 5851) == 1170) {
                if (i17 != 0) {
                    textStyle3 = null;
                } else {
                    textStyle3 = textStyle2;
                }
                if (i13 != 0) {
                    f11 = null;
                } else {
                    f11 = f10;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-399493340, i16, -1, "androidx.compose.material.Decoration (TextFieldImpl.kt:233)");
                }
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 494684590, true, new d(i16, j10, f11, content));
                if (textStyle3 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-2009952671);
                    TextKt.ProvideTextStyle(textStyle3, composableLambda, composerStartRestartGroup, ((i16 >> 3) & 14) | 48);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-2009952619);
                    composableLambda.invoke(composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                textStyle2 = textStyle3;
                f12 = f11;
            } else {
                if (i17 != 0) {
                    textStyle3 = null;
                } else {
                    textStyle3 = textStyle2;
                }
                if (i13 != 0) {
                    f11 = null;
                } else {
                    f11 = f10;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-399493340, i16, -1, "androidx.compose.material.Decoration (TextFieldImpl.kt:233)");
                }
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 494684590, true, new d(i16, j10, f11, content));
                if (textStyle3 != null) {
                    composerStartRestartGroup.startReplaceableGroup(-2009952671);
                    TextKt.ProvideTextStyle(textStyle3, composableLambda, composerStartRestartGroup, ((i16 >> 3) & 14) | 48);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-2009952619);
                    composableLambda.invoke(composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                textStyle2 = textStyle3;
                f12 = f11;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(j10, textStyle2, f12, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        f10 = f6;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i12 |= i15;
        }
        i16 = i12;
        if ((i16 & 5851) == 1170) {
            if (i17 != 0) {
                textStyle3 = null;
            } else {
                textStyle3 = textStyle2;
            }
            if (i13 != 0) {
                f11 = null;
            } else {
                f11 = f10;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-399493340, i16, -1, "androidx.compose.material.Decoration (TextFieldImpl.kt:233)");
            }
            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 494684590, true, new d(i16, j10, f11, content));
            if (textStyle3 != null) {
                composerStartRestartGroup.startReplaceableGroup(-2009952671);
                TextKt.ProvideTextStyle(textStyle3, composableLambda, composerStartRestartGroup, ((i16 >> 3) & 14) | 48);
            } else {
                composerStartRestartGroup.startReplaceableGroup(-2009952619);
                composableLambda.invoke(composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle2 = textStyle3;
            f12 = f11;
        } else {
            if (i17 != 0) {
                textStyle3 = null;
            } else {
                textStyle3 = textStyle2;
            }
            if (i13 != 0) {
                f11 = null;
            } else {
                f11 = f10;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-399493340, i16, -1, "androidx.compose.material.Decoration (TextFieldImpl.kt:233)");
            }
            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 494684590, true, new d(i16, j10, f11, content));
            if (textStyle3 != null) {
                composerStartRestartGroup.startReplaceableGroup(-2009952671);
                TextKt.ProvideTextStyle(textStyle3, composableLambda, composerStartRestartGroup, ((i16 >> 3) & 14) | 48);
            } else {
                composerStartRestartGroup.startReplaceableGroup(-2009952619);
                composableLambda.invoke(composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            textStyle2 = textStyle3;
            f12 = f11;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(j10, textStyle2, f12, content, i10, i11));
    }

    public static final float getHorizontalIconPadding() {
        return f8180c;
    }

    @NotNull
    public static final Modifier getIconDefaultSizeModifier() {
        return f8181d;
    }

    @Nullable
    public static final Object getLayoutId(@NotNull IntrinsicMeasurable intrinsicMeasurable) {
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "<this>");
        Object parentData = intrinsicMeasurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    public static final float getTextFieldPadding() {
        return f8179b;
    }

    public static final long getZeroConstraints() {
        return f8178a;
    }

    public static final int heightOrZero(@Nullable Placeable placeable) {
        if (placeable != null) {
            return placeable.getHeight();
        }
        return 0;
    }

    public static final int widthOrZero(@Nullable Placeable placeable) {
        if (placeable != null) {
            return placeable.getWidth();
        }
        return 0;
    }
}
