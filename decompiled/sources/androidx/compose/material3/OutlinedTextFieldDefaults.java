package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.adobe.marketing.mobile.EventDataKeys;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextFieldDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bk\u0010lJS\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018JÃ\u0003\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001a2\b\b\u0002\u0010\u001f\u001a\u00020\u001a2\b\b\u0002\u0010 \u001a\u00020\u001a2\b\b\u0002\u0010!\u001a\u00020\u001a2\b\b\u0002\u0010\"\u001a\u00020\u001a2\b\b\u0002\u0010#\u001a\u00020\u001a2\b\b\u0002\u0010$\u001a\u00020\u001a2\b\b\u0002\u0010&\u001a\u00020%2\b\b\u0002\u0010'\u001a\u00020\u001a2\b\b\u0002\u0010(\u001a\u00020\u001a2\b\b\u0002\u0010)\u001a\u00020\u001a2\b\b\u0002\u0010*\u001a\u00020\u001a2\b\b\u0002\u0010+\u001a\u00020\u001a2\b\b\u0002\u0010,\u001a\u00020\u001a2\b\b\u0002\u0010-\u001a\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020\u001a2\b\b\u0002\u0010/\u001a\u00020\u001a2\b\b\u0002\u00100\u001a\u00020\u001a2\b\b\u0002\u00101\u001a\u00020\u001a2\b\b\u0002\u00102\u001a\u00020\u001a2\b\b\u0002\u00103\u001a\u00020\u001a2\b\b\u0002\u00104\u001a\u00020\u001a2\b\b\u0002\u00105\u001a\u00020\u001a2\b\b\u0002\u00106\u001a\u00020\u001a2\b\b\u0002\u00107\u001a\u00020\u001a2\b\b\u0002\u00108\u001a\u00020\u001a2\b\b\u0002\u00109\u001a\u00020\u001a2\b\b\u0002\u0010:\u001a\u00020\u001a2\b\b\u0002\u0010;\u001a\u00020\u001a2\b\b\u0002\u0010<\u001a\u00020\u001a2\b\b\u0002\u0010=\u001a\u00020\u001a2\b\b\u0002\u0010>\u001a\u00020\u001a2\b\b\u0002\u0010?\u001a\u00020\u001a2\b\b\u0002\u0010@\u001a\u00020\u001a2\b\b\u0002\u0010A\u001a\u00020\u001a2\b\b\u0002\u0010B\u001a\u00020\u001a2\b\b\u0002\u0010C\u001a\u00020\u001a2\b\b\u0002\u0010D\u001a\u00020\u001a2\b\b\u0002\u0010E\u001a\u00020\u001a2\b\b\u0002\u0010F\u001a\u00020\u001aH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bG\u0010HJ\u009e\u0002\u0010Y\u001a\u00020\u000e2\u0006\u0010J\u001a\u00020I2\u0011\u0010M\u001a\r\u0012\u0004\u0012\u00020\u000e0K¢\u0006\u0002\bL2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010N\u001a\u00020\u00022\u0006\u0010P\u001a\u00020O2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0015\b\u0002\u0010Q\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010K¢\u0006\u0002\bL2\u0015\b\u0002\u0010R\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010K¢\u0006\u0002\bL2\u0015\b\u0002\u0010S\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010K¢\u0006\u0002\bL2\u0015\b\u0002\u0010T\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010K¢\u0006\u0002\bL2\u0015\b\u0002\u0010U\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010K¢\u0006\u0002\bL2\u0015\b\u0002\u0010V\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010K¢\u0006\u0002\bL2\u0015\b\u0002\u0010W\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010K¢\u0006\u0002\bL2\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00162\u0013\b\u0002\u0010X\u001a\r\u0012\u0004\u0012\u00020\u000e0K¢\u0006\u0002\bLH\u0007¢\u0006\u0004\bY\u0010ZR \u0010_\u001a\u00020\u000b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R \u0010b\u001a\u00020\u000b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b`\u0010\\\u001a\u0004\ba\u0010^R \u0010e\u001a\u00020\u000b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bc\u0010\\\u001a\u0004\bd\u0010^R \u0010h\u001a\u00020\u000b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bf\u0010\\\u001a\u0004\bg\u0010^R\u0011\u0010\n\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\bi\u0010j\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006m"}, d2 = {"Landroidx/compose/material3/OutlinedTextFieldDefaults;", "", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/material3/TextFieldColors;", "colors", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/unit/Dp;", "focusedBorderThickness", "unfocusedBorderThickness", "", "ContainerBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "ContainerBox", EventDataKeys.Lifecycle.LIFECYCLE_START, "top", "end", "bottom", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "Landroidx/compose/ui/graphics/Color;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "selectionColors", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "colors-0hiis_0", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "", "value", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "innerTextField", "singleLine", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "prefix", DynamicLink.Builder.KEY_SUFFIX, "supportingText", "container", "DecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "a", "F", "getMinHeight-D9Ej5fM", "()F", "MinHeight", "b", "getMinWidth-D9Ej5fM", "MinWidth", "c", "getUnfocusedBorderThickness-D9Ej5fM", "UnfocusedBorderThickness", "d", "getFocusedBorderThickness-D9Ej5fM", "FocusedBorderThickness", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/OutlinedTextFieldDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2124:1\n76#2:2125\n154#3:2126\n154#3:2127\n154#3:2128\n154#3:2129\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/OutlinedTextFieldDefaults\n*L\n1491#1:2125\n1354#1:2126\n1360#1:2127\n1365#1:2128\n1370#1:2129\n*E\n"})
public final class OutlinedTextFieldDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final OutlinedTextFieldDefaults INSTANCE = new OutlinedTextFieldDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final float MinHeight = Dp.m4389constructorimpl(56);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float MinWidth = Dp.m4389constructorimpl(280);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final float UnfocusedBorderThickness = Dp.m4389constructorimpl(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final float FocusedBorderThickness = Dp.m4389constructorimpl(2);

    /* JADX INFO: compiled from: TextFieldDefaults.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f10933q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f10934r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ InteractionSource f10935s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ TextFieldColors f10936t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Shape f10937u0;
        public final /* synthetic */ float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ float f10938w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f10939x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f10940y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, boolean z11, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f6, float f10, int i10, int i11) {
            super(2);
            this.f10933q0 = z10;
            this.f10934r0 = z11;
            this.f10935s0 = interactionSource;
            this.f10936t0 = textFieldColors;
            this.f10937u0 = shape;
            this.v0 = f6;
            this.f10938w0 = f10;
            this.f10939x0 = i10;
            this.f10940y0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OutlinedTextFieldDefaults.this.m1192ContainerBoxnbWgWpA(this.f10933q0, this.f10934r0, this.f10935s0, this.f10936t0, this.f10937u0, this.v0, this.f10938w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10939x0 | 1), this.f10940y0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TextFieldDefaults.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f10941p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f10942q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ InteractionSource f10943r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ TextFieldColors f10944s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f10945t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f10946u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, boolean z11, InteractionSource interactionSource, TextFieldColors textFieldColors, int i10, int i11) {
            super(2);
            this.f10941p0 = z10;
            this.f10942q0 = z11;
            this.f10943r0 = interactionSource;
            this.f10944s0 = textFieldColors;
            this.f10945t0 = i10;
            this.f10946u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1448570018, iIntValue, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1654)");
                }
                OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
                boolean z10 = this.f10941p0;
                boolean z11 = this.f10942q0;
                InteractionSource interactionSource = this.f10943r0;
                TextFieldColors textFieldColors = this.f10944s0;
                int i10 = this.f10945t0;
                outlinedTextFieldDefaults.m1192ContainerBoxnbWgWpA(z10, z11, interactionSource, textFieldColors, null, 0.0f, 0.0f, composer2, ((i10 >> 9) & 896) | ((i10 >> 6) & 14) | 12582912 | ((i10 >> 15) & 112) | ((this.f10946u0 >> 3) & 7168), 112);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TextFieldDefaults.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function2<Composer, Integer, Unit> E0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> F0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> G0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> H0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> I0;
        public final /* synthetic */ TextFieldColors J0;
        public final /* synthetic */ PaddingValues K0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> L0;
        public final /* synthetic */ int M0;
        public final /* synthetic */ int N0;
        public final /* synthetic */ int O0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f10948q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10949r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f10950s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f10951t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ VisualTransformation f10952u0;
        public final /* synthetic */ InteractionSource v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ boolean f10953w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10954x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10955y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(String str, Function2<? super Composer, ? super Integer, Unit> function2, boolean z10, boolean z11, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z12, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, Function2<? super Composer, ? super Integer, Unit> function5, Function2<? super Composer, ? super Integer, Unit> function6, Function2<? super Composer, ? super Integer, Unit> function7, Function2<? super Composer, ? super Integer, Unit> function8, Function2<? super Composer, ? super Integer, Unit> function9, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function10, int i10, int i11, int i12) {
            super(2);
            this.f10948q0 = str;
            this.f10949r0 = function2;
            this.f10950s0 = z10;
            this.f10951t0 = z11;
            this.f10952u0 = visualTransformation;
            this.v0 = interactionSource;
            this.f10953w0 = z12;
            this.f10954x0 = function3;
            this.f10955y0 = function4;
            this.E0 = function5;
            this.F0 = function6;
            this.G0 = function7;
            this.H0 = function8;
            this.I0 = function9;
            this.J0 = textFieldColors;
            this.K0 = paddingValues;
            this.L0 = function10;
            this.M0 = i10;
            this.N0 = i11;
            this.O0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            OutlinedTextFieldDefaults.this.DecorationBox(this.f10948q0, this.f10949r0, this.f10950s0, this.f10951t0, this.f10952u0, this.v0, this.f10953w0, this.f10954x0, this.f10955y0, this.E0, this.F0, this.G0, this.H0, this.I0, this.J0, this.K0, this.L0, composer, RecomposeScopeImplKt.updateChangedFlags(this.M0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.N0), this.O0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: contentPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m1191contentPaddinga9UjIt4$default(OutlinedTextFieldDefaults outlinedTextFieldDefaults, float f6, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 2) != 0) {
            f10 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 4) != 0) {
            f11 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 8) != 0) {
            f12 = TextFieldImplKt.getTextFieldPadding();
        }
        return outlinedTextFieldDefaults.m1194contentPaddinga9UjIt4(f6, f10, f11, f12);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x016b  */
    /* JADX WARN: Code duplicated, block: B:121:0x01cf  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterial3Api
    /* JADX INFO: renamed from: ContainerBox-nbWgWpA, reason: not valid java name */
    public final void m1192ContainerBoxnbWgWpA(boolean z10, boolean z11, @NotNull InteractionSource interactionSource, @NotNull TextFieldColors colors, @Nullable Shape shape, float f6, float f10, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Shape shape2;
        float f11;
        float f12;
        Shape shape3;
        float f13;
        float f14;
        Shape shape4;
        float f15;
        float f16;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer composerStartRestartGroup = composer.startRestartGroup(1461761386);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(z11) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.changed(interactionSource) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changed(colors) ? 2048 : 1024;
        }
        if ((i10 & 57344) == 0) {
            if ((i11 & 16) == 0) {
                shape2 = shape;
                int i13 = composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
                i12 |= i13;
            } else {
                shape2 = shape;
            }
            i12 |= i13;
        } else {
            shape2 = shape;
        }
        if ((i10 & 458752) == 0) {
            if ((i11 & 32) == 0) {
                f11 = f6;
                int i14 = composerStartRestartGroup.changed(f11) ? 131072 : 65536;
                i12 |= i14;
            } else {
                f11 = f6;
            }
            i12 |= i14;
        } else {
            f11 = f6;
        }
        if ((3670016 & i10) == 0) {
            if ((i11 & 64) == 0) {
                f12 = f10;
                int i15 = composerStartRestartGroup.changed(f12) ? 1048576 : 524288;
                i12 |= i15;
            } else {
                f12 = f10;
            }
            i12 |= i15;
        } else {
            f12 = f10;
        }
        if ((i11 & 128) != 0) {
            i12 |= 12582912;
        } else if ((29360128 & i10) == 0) {
            i12 |= composerStartRestartGroup.changed(this) ? 8388608 : 4194304;
        }
        if ((23967451 & i12) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            f15 = f11;
            f16 = f12;
            shape4 = shape2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i11 & 16) != 0) {
                    shape2 = ShapesKt.toShape(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), composerStartRestartGroup, 6);
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    f11 = FocusedBorderThickness;
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    shape3 = shape2;
                    f13 = UnfocusedBorderThickness;
                    f14 = f11;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461761386, i12, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox (TextFieldDefaults.kt:1389)");
                }
                int i16 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                int i17 = i12 >> 3;
                Shape shape5 = shape3;
                BoxKt.Box(BackgroundKt.m121backgroundbw27NRU(BorderKt.border(Modifier.INSTANCE, (BorderStroke) TextFieldDefaultsKt.m1384access$animateBorderStrokeAsStateNuRrP5Q(z10, z11, interactionSource, colors, f14, f13, composerStartRestartGroup, i16 | (i17 & 57344) | (i17 & 458752)).getValue(), shape5), colors.containerColor$material3_release(z10, z11, interactionSource, composerStartRestartGroup, i16).getValue().m2518unboximpl(), shape5), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape4 = shape5;
                f15 = f14;
                f16 = f13;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                }
            }
            shape3 = shape2;
            f14 = f11;
            f13 = f12;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1461761386, i12, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox (TextFieldDefaults.kt:1389)");
            }
            int i18 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
            int i19 = i12 >> 3;
            Shape shape6 = shape3;
            BoxKt.Box(BackgroundKt.m121backgroundbw27NRU(BorderKt.border(Modifier.INSTANCE, (BorderStroke) TextFieldDefaultsKt.m1384access$animateBorderStrokeAsStateNuRrP5Q(z10, z11, interactionSource, colors, f14, f13, composerStartRestartGroup, i18 | (i19 & 57344) | (i19 & 458752)).getValue(), shape6), colors.containerColor$material3_release(z10, z11, interactionSource, composerStartRestartGroup, i18).getValue().m2518unboximpl(), shape6), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape4 = shape6;
            f15 = f14;
            f16 = f13;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(z10, z11, interactionSource, colors, shape4, f15, f16, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0146  */
    /* JADX WARN: Code duplicated, block: B:102:0x014c  */
    /* JADX WARN: Code duplicated, block: B:103:0x014f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0157  */
    /* JADX WARN: Code duplicated, block: B:108:0x015c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0162  */
    /* JADX WARN: Code duplicated, block: B:112:0x0168  */
    /* JADX WARN: Code duplicated, block: B:113:0x016b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0170  */
    /* JADX WARN: Code duplicated, block: B:118:0x0176  */
    /* JADX WARN: Code duplicated, block: B:120:0x017b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0181  */
    /* JADX WARN: Code duplicated, block: B:124:0x0187  */
    /* JADX WARN: Code duplicated, block: B:125:0x018a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0193  */
    /* JADX WARN: Code duplicated, block: B:131:0x0198  */
    /* JADX WARN: Code duplicated, block: B:133:0x019c  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:140:0x01af  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:152:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:155:0x01d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:157:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:160:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:162:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:170:0x0201  */
    /* JADX WARN: Code duplicated, block: B:171:0x0208  */
    /* JADX WARN: Code duplicated, block: B:173:0x020e  */
    /* JADX WARN: Code duplicated, block: B:175:0x0214  */
    /* JADX WARN: Code duplicated, block: B:176:0x0217  */
    /* JADX WARN: Code duplicated, block: B:180:0x021f  */
    /* JADX WARN: Code duplicated, block: B:181:0x0226  */
    /* JADX WARN: Code duplicated, block: B:183:0x022c  */
    /* JADX WARN: Code duplicated, block: B:185:0x0232  */
    /* JADX WARN: Code duplicated, block: B:186:0x0235  */
    /* JADX WARN: Code duplicated, block: B:190:0x0243  */
    /* JADX WARN: Code duplicated, block: B:196:0x0270  */
    /* JADX WARN: Code duplicated, block: B:198:0x0277  */
    /* JADX WARN: Code duplicated, block: B:208:0x02ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:209:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:210:0x02af  */
    /* JADX WARN: Code duplicated, block: B:213:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:214:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:216:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:217:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:219:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:220:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:222:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:223:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:225:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:226:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:228:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:229:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:232:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:235:0x02df  */
    /* JADX WARN: Code duplicated, block: B:236:0x0356  */
    /* JADX WARN: Code duplicated, block: B:239:0x035f  */
    /* JADX WARN: Code duplicated, block: B:240:0x0383  */
    /* JADX WARN: Code duplicated, block: B:243:0x0389  */
    /* JADX WARN: Code duplicated, block: B:245:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:248:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:251:0x0459  */
    /* JADX WARN: Code duplicated, block: B:256:0x0479  */
    /* JADX WARN: Code duplicated, block: B:258:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0084  */
    /* JADX WARN: Code duplicated, block: B:40:0x0088  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00af  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00be  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:78:0x0100  */
    /* JADX WARN: Code duplicated, block: B:80:0x0106  */
    /* JADX WARN: Code duplicated, block: B:82:0x010c  */
    /* JADX WARN: Code duplicated, block: B:83:0x010f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0117  */
    /* JADX WARN: Code duplicated, block: B:88:0x011e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0126  */
    /* JADX WARN: Code duplicated, block: B:92:0x012c  */
    /* JADX WARN: Code duplicated, block: B:93:0x012f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0137  */
    /* JADX WARN: Code duplicated, block: B:98:0x013e  */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][_][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void DecorationBox(@NotNull String value, @NotNull Function2<? super Composer, ? super Integer, Unit> innerTextField, boolean z10, boolean z11, @NotNull VisualTransformation visualTransformation, @NotNull InteractionSource interactionSource, boolean z12, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function4, @Nullable Function2<? super Composer, ? super Integer, Unit> function5, @Nullable Function2<? super Composer, ? super Integer, Unit> function6, @Nullable Function2<? super Composer, ? super Integer, Unit> function7, @Nullable Function2<? super Composer, ? super Integer, Unit> function8, @Nullable TextFieldColors textFieldColors, @Nullable PaddingValues paddingValues, @Nullable Function2<? super Composer, ? super Integer, Unit> function9, @Nullable Composer composer, int i10, int i11, int i12) {
        int i13;
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
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        boolean z13;
        Function2<? super Composer, ? super Integer, Unit> function10;
        Function2<? super Composer, ? super Integer, Unit> function11;
        Function2<? super Composer, ? super Integer, Unit> function12;
        Function2<? super Composer, ? super Integer, Unit> function13;
        Function2<? super Composer, ? super Integer, Unit> function14;
        Function2<? super Composer, ? super Integer, Unit> function15;
        TextFieldColors textFieldColorsM1193colors0hiis_0;
        PaddingValues paddingValuesM1191contentPaddinga9UjIt4$default;
        Function2<? super Composer, ? super Integer, Unit> function16;
        Function2<? super Composer, ? super Integer, Unit> function17;
        Function2<? super Composer, ? super Integer, Unit> function18;
        Function2<? super Composer, ? super Integer, Unit> function2ComposableLambda;
        Function2<? super Composer, ? super Integer, Unit> function19;
        Function2<? super Composer, ? super Integer, Unit> function20;
        Function2<? super Composer, ? super Integer, Unit> function21;
        boolean z14;
        TextFieldColors textFieldColors2;
        Function2<? super Composer, ? super Integer, Unit> function22;
        PaddingValues paddingValues2;
        Composer composer2;
        boolean z15;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Function2<? super Composer, ? super Integer, Unit> function24;
        Function2<? super Composer, ? super Integer, Unit> function25;
        Function2<? super Composer, ? super Integer, Unit> function26;
        Function2<? super Composer, ? super Integer, Unit> function27;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        TextFieldColors textFieldColors3;
        PaddingValues paddingValues3;
        Function2<? super Composer, ? super Integer, Unit> function30;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i38;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Composer composerStartRestartGroup = composer.startRestartGroup(-350442135);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i13 = (composerStartRestartGroup.changed(value) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 112) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(innerTextField) ? 32 : 16;
        }
        if ((i12 & 4) == 0) {
            if ((i10 & 896) == 0) {
                i13 |= composerStartRestartGroup.changed(z10) ? 256 : 128;
            }
            if ((i12 & 8) != 0) {
                if ((i10 & 7168) == 0) {
                    if (composerStartRestartGroup.changed(z11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i13 |= i14;
                }
                i15 = 8192;
                if ((i12 & 16) != 0) {
                    i13 |= 24576;
                } else if ((i10 & 57344) == 0) {
                    if (composerStartRestartGroup.changed(visualTransformation)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i13 |= i16;
                }
                if ((i12 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(interactionSource)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                    }
                    i18 = i12 & 64;
                    if (i18 != 0) {
                        i13 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z12)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i13 |= i19;
                    }
                    i20 = i12 & 128;
                    if (i20 != 0) {
                        i13 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i13 |= i21;
                    }
                    i22 = i12 & 256;
                    if (i22 != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i23 = 33554432;
                        }
                        i13 |= i23;
                    }
                    i24 = i12 & 512;
                    if (i24 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 1879048192) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i25 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i25 = 268435456;
                        }
                        i13 |= i25;
                    }
                    i26 = i12 & 1024;
                    if (i26 != 0) {
                        i27 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i28 = 4;
                        } else {
                            i28 = 2;
                        }
                        i27 = i11 | i28;
                    } else {
                        i27 = i11;
                    }
                    i29 = i12 & 2048;
                    if (i29 != 0) {
                        i27 |= 48;
                    } else if ((i11 & 112) == 0) {
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i30 = 32;
                        } else {
                            i30 = 16;
                        }
                        i27 |= i30;
                    }
                    i31 = i27;
                    i32 = i12 & 4096;
                    if (i32 != 0) {
                        if ((i11 & 896) == 0) {
                            if (composerStartRestartGroup.changedInstance(function7)) {
                                i33 = 256;
                            } else {
                                i33 = 128;
                            }
                            i31 |= i33;
                        }
                        i34 = i12 & 8192;
                        if (i34 != 0) {
                            if ((i11 & 7168) == 0) {
                                i31 |= composerStartRestartGroup.changedInstance(function8) ? 2048 : 1024;
                            }
                            if ((i11 & 57344) != 0) {
                                if ((i12 & 16384) == 0 && composerStartRestartGroup.changed(textFieldColors)) {
                                    i15 = 16384;
                                }
                                i31 |= i15;
                            }
                            if ((i11 & 458752) != 0) {
                                if ((i12 & 32768) == 0 || !composerStartRestartGroup.changed(paddingValues)) {
                                    i38 = 65536;
                                } else {
                                    i38 = 131072;
                                }
                                i31 |= i38;
                            }
                            i35 = i12 & 65536;
                            if (i35 != 0) {
                                i31 |= 1572864;
                            } else if ((i11 & 3670016) == 0) {
                                if (composerStartRestartGroup.changedInstance(function9)) {
                                    i36 = 1048576;
                                } else {
                                    i36 = 524288;
                                }
                                i31 |= i36;
                            }
                            if ((i12 & 131072) != 0) {
                                i31 |= 12582912;
                            } else if ((i11 & 29360128) == 0) {
                                if (composerStartRestartGroup.changed(this)) {
                                    i37 = 8388608;
                                } else {
                                    i37 = 4194304;
                                }
                                i31 |= i37;
                            }
                            if ((i13 & 1533916891) != 306783378 && (23967451 & i31) == 4793490 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                function23 = function2;
                                function24 = function3;
                                function25 = function4;
                                function26 = function5;
                                function27 = function6;
                                function28 = function7;
                                function29 = function8;
                                textFieldColors3 = textFieldColors;
                                paddingValues3 = paddingValues;
                                function30 = function9;
                                composer2 = composerStartRestartGroup;
                                z15 = z12;
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i18 != 0) {
                                        z13 = false;
                                    } else {
                                        z13 = z12;
                                    }
                                    if (i20 != 0) {
                                        function10 = null;
                                    } else {
                                        function10 = function2;
                                    }
                                    if (i22 != 0) {
                                        function11 = null;
                                    } else {
                                        function11 = function3;
                                    }
                                    if (i24 != 0) {
                                        function12 = null;
                                    } else {
                                        function12 = function4;
                                    }
                                    if (i26 != 0) {
                                        function13 = null;
                                    } else {
                                        function13 = function5;
                                    }
                                    if (i29 != 0) {
                                        function14 = null;
                                    } else {
                                        function14 = function6;
                                    }
                                    if (i32 != 0) {
                                        function15 = null;
                                    } else {
                                        function15 = function7;
                                    }
                                    Function2<? super Composer, ? super Integer, Unit> function31 = i34 == 0 ? function8 : null;
                                    if ((i12 & 16384) != 0) {
                                        textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                        i31 &= -57345;
                                    } else {
                                        textFieldColorsM1193colors0hiis_0 = textFieldColors;
                                    }
                                    if ((i12 & 32768) != 0) {
                                        paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        i31 &= -458753;
                                    } else {
                                        paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                                    }
                                    function16 = function12;
                                    if (i35 != 0) {
                                        function17 = function13;
                                        function18 = function14;
                                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                                    } else {
                                        function17 = function13;
                                        function18 = function14;
                                        function2ComposableLambda = function9;
                                    }
                                    function19 = function10;
                                    function20 = function11;
                                    function21 = function15;
                                    z14 = z13;
                                    textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                                    function22 = function31;
                                    paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i12 & 16384) != 0) {
                                        i31 &= -57345;
                                    }
                                    if ((32768 & i12) != 0) {
                                        i31 &= -458753;
                                    }
                                    z14 = z12;
                                    function19 = function2;
                                    function20 = function3;
                                    function16 = function4;
                                    function17 = function5;
                                    function18 = function6;
                                    function21 = function7;
                                    function22 = function8;
                                    textFieldColors2 = textFieldColors;
                                    paddingValues2 = paddingValues;
                                    function2ComposableLambda = function9;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                                }
                                int i39 = i13;
                                int i40 = i39 << 3;
                                int i41 = i39 >> 3;
                                int i42 = i39 >> 9;
                                int i43 = i31 << 21;
                                composer2 = composerStartRestartGroup;
                                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i40 & 896) | (i40 & 112) | 6 | (i41 & 7168) | (i42 & 57344) | (i42 & 458752) | (i42 & 3670016) | (i43 & 29360128) | (234881024 & i43) | (i43 & 1879048192), ((i31 >> 9) & 14) | ((i39 >> 6) & 112) | (i39 & 896) | (i42 & 7168) | (i41 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z15 = z14;
                                function23 = function19;
                                function24 = function20;
                                function25 = function16;
                                function26 = function17;
                                function27 = function18;
                                function28 = function21;
                                function29 = function22;
                                textFieldColors3 = textFieldColors2;
                                paddingValues3 = paddingValues2;
                                function30 = function2ComposableLambda;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
                        }
                        i31 |= 3072;
                        if ((i11 & 57344) != 0) {
                            if ((i12 & 16384) == 0) {
                                i15 = 16384;
                            }
                            i31 |= i15;
                        }
                        if ((i11 & 458752) != 0) {
                            if ((i12 & 32768) == 0) {
                                i38 = 65536;
                            } else {
                                i38 = 65536;
                            }
                            i31 |= i38;
                        }
                        i35 = i12 & 65536;
                        if (i35 != 0) {
                            i31 |= 1572864;
                        } else if ((i11 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(function9)) {
                                i36 = 1048576;
                            } else {
                                i36 = 524288;
                            }
                            i31 |= i36;
                        }
                        if ((i12 & 131072) != 0) {
                            i31 |= 12582912;
                        } else if ((i11 & 29360128) == 0) {
                            if (composerStartRestartGroup.changed(this)) {
                                i37 = 8388608;
                            } else {
                                i37 = 4194304;
                            }
                            i31 |= i37;
                        }
                        if ((i13 & 1533916891) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i18 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i20 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function2;
                                }
                                if (i22 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i24 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i26 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i29 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i32 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i34 == 0) {
                                }
                                if ((i12 & 16384) != 0) {
                                    textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                    i31 &= -57345;
                                } else {
                                    textFieldColorsM1193colors0hiis_0 = textFieldColors;
                                }
                                if ((i12 & 32768) != 0) {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i31 &= -458753;
                                } else {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                                }
                                function16 = function12;
                                if (i35 != 0) {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                                } else {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = function9;
                                }
                                function19 = function10;
                                function20 = function11;
                                function21 = function15;
                                z14 = z13;
                                textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                                function22 = function31;
                                paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                            } else {
                                if (i18 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i20 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function2;
                                }
                                if (i22 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i24 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i26 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i29 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i32 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i34 == 0) {
                                }
                                if ((i12 & 16384) != 0) {
                                    textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                    i31 &= -57345;
                                } else {
                                    textFieldColorsM1193colors0hiis_0 = textFieldColors;
                                }
                                if ((i12 & 32768) != 0) {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i31 &= -458753;
                                } else {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                                }
                                function16 = function12;
                                if (i35 != 0) {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                                } else {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = function9;
                                }
                                function19 = function10;
                                function20 = function11;
                                function21 = function15;
                                z14 = z13;
                                textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                                function22 = function31;
                                paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                            }
                            int i310 = i13;
                            int i44 = i310 << 3;
                            int i45 = i310 >> 3;
                            int i46 = i310 >> 9;
                            int i47 = i31 << 21;
                            composer2 = composerStartRestartGroup;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i44 & 896) | (i44 & 112) | 6 | (i45 & 7168) | (i46 & 57344) | (i46 & 458752) | (i46 & 3670016) | (i47 & 29360128) | (234881024 & i47) | (i47 & 1879048192), ((i31 >> 9) & 14) | ((i310 >> 6) & 112) | (i310 & 896) | (i46 & 7168) | (i45 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z14;
                            function23 = function19;
                            function24 = function20;
                            function25 = function16;
                            function26 = function17;
                            function27 = function18;
                            function28 = function21;
                            function29 = function22;
                            textFieldColors3 = textFieldColors2;
                            paddingValues3 = paddingValues2;
                            function30 = function2ComposableLambda;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i18 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i20 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function2;
                                }
                                if (i22 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i24 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i26 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i29 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i32 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i34 == 0) {
                                }
                                if ((i12 & 16384) != 0) {
                                    textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                    i31 &= -57345;
                                } else {
                                    textFieldColorsM1193colors0hiis_0 = textFieldColors;
                                }
                                if ((i12 & 32768) != 0) {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i31 &= -458753;
                                } else {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                                }
                                function16 = function12;
                                if (i35 != 0) {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                                } else {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = function9;
                                }
                                function19 = function10;
                                function20 = function11;
                                function21 = function15;
                                z14 = z13;
                                textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                                function22 = function31;
                                paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                            } else {
                                if (i18 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i20 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function2;
                                }
                                if (i22 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i24 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i26 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i29 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i32 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i34 == 0) {
                                }
                                if ((i12 & 16384) != 0) {
                                    textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                    i31 &= -57345;
                                } else {
                                    textFieldColorsM1193colors0hiis_0 = textFieldColors;
                                }
                                if ((i12 & 32768) != 0) {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i31 &= -458753;
                                } else {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                                }
                                function16 = function12;
                                if (i35 != 0) {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                                } else {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = function9;
                                }
                                function19 = function10;
                                function20 = function11;
                                function21 = function15;
                                z14 = z13;
                                textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                                function22 = function31;
                                paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                            }
                            int i311 = i13;
                            int i48 = i311 << 3;
                            int i49 = i311 >> 3;
                            int i410 = i311 >> 9;
                            int i411 = i31 << 21;
                            composer2 = composerStartRestartGroup;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i48 & 896) | (i48 & 112) | 6 | (i49 & 7168) | (i410 & 57344) | (i410 & 458752) | (i410 & 3670016) | (i411 & 29360128) | (234881024 & i411) | (i411 & 1879048192), ((i31 >> 9) & 14) | ((i311 >> 6) & 112) | (i311 & 896) | (i410 & 7168) | (i49 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z14;
                            function23 = function19;
                            function24 = function20;
                            function25 = function16;
                            function26 = function17;
                            function27 = function18;
                            function28 = function21;
                            function29 = function22;
                            textFieldColors3 = textFieldColors2;
                            paddingValues3 = paddingValues2;
                            function30 = function2ComposableLambda;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
                    }
                    i31 |= BluetoothState.REQUEST_CONNECT_DEVICE;
                    i34 = i12 & 8192;
                    if (i34 != 0) {
                        if ((i11 & 7168) == 0) {
                            i31 |= composerStartRestartGroup.changedInstance(function8) ? 2048 : 1024;
                        }
                        if ((i11 & 57344) != 0) {
                            if ((i12 & 16384) == 0) {
                                i15 = 16384;
                            }
                            i31 |= i15;
                        }
                        if ((i11 & 458752) != 0) {
                            if ((i12 & 32768) == 0) {
                                i38 = 65536;
                            } else {
                                i38 = 65536;
                            }
                            i31 |= i38;
                        }
                        i35 = i12 & 65536;
                        if (i35 != 0) {
                            i31 |= 1572864;
                        } else if ((i11 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(function9)) {
                                i36 = 1048576;
                            } else {
                                i36 = 524288;
                            }
                            i31 |= i36;
                        }
                        if ((i12 & 131072) != 0) {
                            i31 |= 12582912;
                        } else if ((i11 & 29360128) == 0) {
                            if (composerStartRestartGroup.changed(this)) {
                                i37 = 8388608;
                            } else {
                                i37 = 4194304;
                            }
                            i31 |= i37;
                        }
                        if ((i13 & 1533916891) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i18 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i20 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function2;
                                }
                                if (i22 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i24 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i26 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i29 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i32 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i34 == 0) {
                                }
                                if ((i12 & 16384) != 0) {
                                    textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                    i31 &= -57345;
                                } else {
                                    textFieldColorsM1193colors0hiis_0 = textFieldColors;
                                }
                                if ((i12 & 32768) != 0) {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i31 &= -458753;
                                } else {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                                }
                                function16 = function12;
                                if (i35 != 0) {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                                } else {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = function9;
                                }
                                function19 = function10;
                                function20 = function11;
                                function21 = function15;
                                z14 = z13;
                                textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                                function22 = function31;
                                paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                            } else {
                                if (i18 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i20 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function2;
                                }
                                if (i22 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i24 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i26 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i29 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i32 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i34 == 0) {
                                }
                                if ((i12 & 16384) != 0) {
                                    textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                    i31 &= -57345;
                                } else {
                                    textFieldColorsM1193colors0hiis_0 = textFieldColors;
                                }
                                if ((i12 & 32768) != 0) {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i31 &= -458753;
                                } else {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                                }
                                function16 = function12;
                                if (i35 != 0) {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                                } else {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = function9;
                                }
                                function19 = function10;
                                function20 = function11;
                                function21 = function15;
                                z14 = z13;
                                textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                                function22 = function31;
                                paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                            }
                            int i312 = i13;
                            int i412 = i312 << 3;
                            int i413 = i312 >> 3;
                            int i414 = i312 >> 9;
                            int i415 = i31 << 21;
                            composer2 = composerStartRestartGroup;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i412 & 896) | (i412 & 112) | 6 | (i413 & 7168) | (i414 & 57344) | (i414 & 458752) | (i414 & 3670016) | (i415 & 29360128) | (234881024 & i415) | (i415 & 1879048192), ((i31 >> 9) & 14) | ((i312 >> 6) & 112) | (i312 & 896) | (i414 & 7168) | (i413 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z14;
                            function23 = function19;
                            function24 = function20;
                            function25 = function16;
                            function26 = function17;
                            function27 = function18;
                            function28 = function21;
                            function29 = function22;
                            textFieldColors3 = textFieldColors2;
                            paddingValues3 = paddingValues2;
                            function30 = function2ComposableLambda;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i18 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i20 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function2;
                                }
                                if (i22 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i24 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i26 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i29 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i32 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i34 == 0) {
                                }
                                if ((i12 & 16384) != 0) {
                                    textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                    i31 &= -57345;
                                } else {
                                    textFieldColorsM1193colors0hiis_0 = textFieldColors;
                                }
                                if ((i12 & 32768) != 0) {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i31 &= -458753;
                                } else {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                                }
                                function16 = function12;
                                if (i35 != 0) {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                                } else {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = function9;
                                }
                                function19 = function10;
                                function20 = function11;
                                function21 = function15;
                                z14 = z13;
                                textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                                function22 = function31;
                                paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                            } else {
                                if (i18 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i20 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function2;
                                }
                                if (i22 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i24 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i26 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i29 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i32 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i34 == 0) {
                                }
                                if ((i12 & 16384) != 0) {
                                    textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                    i31 &= -57345;
                                } else {
                                    textFieldColorsM1193colors0hiis_0 = textFieldColors;
                                }
                                if ((i12 & 32768) != 0) {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i31 &= -458753;
                                } else {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                                }
                                function16 = function12;
                                if (i35 != 0) {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                                } else {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = function9;
                                }
                                function19 = function10;
                                function20 = function11;
                                function21 = function15;
                                z14 = z13;
                                textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                                function22 = function31;
                                paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                            }
                            int i313 = i13;
                            int i416 = i313 << 3;
                            int i417 = i313 >> 3;
                            int i418 = i313 >> 9;
                            int i419 = i31 << 21;
                            composer2 = composerStartRestartGroup;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i416 & 896) | (i416 & 112) | 6 | (i417 & 7168) | (i418 & 57344) | (i418 & 458752) | (i418 & 3670016) | (i419 & 29360128) | (234881024 & i419) | (i419 & 1879048192), ((i31 >> 9) & 14) | ((i313 >> 6) & 112) | (i313 & 896) | (i418 & 7168) | (i417 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z14;
                            function23 = function19;
                            function24 = function20;
                            function25 = function16;
                            function26 = function17;
                            function27 = function18;
                            function28 = function21;
                            function29 = function22;
                            textFieldColors3 = textFieldColors2;
                            paddingValues3 = paddingValues2;
                            function30 = function2ComposableLambda;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
                    }
                    i31 |= 3072;
                    if ((i11 & 57344) != 0) {
                        if ((i12 & 16384) == 0) {
                            i15 = 16384;
                        }
                        i31 |= i15;
                    }
                    if ((i11 & 458752) != 0) {
                        if ((i12 & 32768) == 0) {
                            i38 = 65536;
                        } else {
                            i38 = 65536;
                        }
                        i31 |= i38;
                    }
                    i35 = i12 & 65536;
                    if (i35 != 0) {
                        i31 |= 1572864;
                    } else if ((i11 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function9)) {
                            i36 = 1048576;
                        } else {
                            i36 = 524288;
                        }
                        i31 |= i36;
                    }
                    if ((i12 & 131072) != 0) {
                        i31 |= 12582912;
                    } else if ((i11 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(this)) {
                            i37 = 8388608;
                        } else {
                            i37 = 4194304;
                        }
                        i31 |= i37;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        } else {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                        }
                        int i314 = i13;
                        int i4110 = i314 << 3;
                        int i4111 = i314 >> 3;
                        int i4112 = i314 >> 9;
                        int i4113 = i31 << 21;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i4110 & 896) | (i4110 & 112) | 6 | (i4111 & 7168) | (i4112 & 57344) | (i4112 & 458752) | (i4112 & 3670016) | (i4113 & 29360128) | (234881024 & i4113) | (i4113 & 1879048192), ((i31 >> 9) & 14) | ((i314 >> 6) & 112) | (i314 & 896) | (i4112 & 7168) | (i4111 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function23 = function19;
                        function24 = function20;
                        function25 = function16;
                        function26 = function17;
                        function27 = function18;
                        function28 = function21;
                        function29 = function22;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function30 = function2ComposableLambda;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        } else {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                        }
                        int i315 = i13;
                        int i4114 = i315 << 3;
                        int i4115 = i315 >> 3;
                        int i4116 = i315 >> 9;
                        int i4117 = i31 << 21;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i4114 & 896) | (i4114 & 112) | 6 | (i4115 & 7168) | (i4116 & 57344) | (i4116 & 458752) | (i4116 & 3670016) | (i4117 & 29360128) | (234881024 & i4117) | (i4117 & 1879048192), ((i31 >> 9) & 14) | ((i315 >> 6) & 112) | (i315 & 896) | (i4116 & 7168) | (i4115 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function23 = function19;
                        function24 = function20;
                        function25 = function16;
                        function26 = function17;
                        function27 = function18;
                        function28 = function21;
                        function29 = function22;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function30 = function2ComposableLambda;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
                }
                i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i13 |= i17;
                i18 = i12 & 64;
                if (i18 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z12)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 128;
                if (i20 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i13 |= i21;
                }
                i22 = i12 & 256;
                if (i22 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i23 = 33554432;
                    }
                    i13 |= i23;
                }
                i24 = i12 & 512;
                if (i24 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i25 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i25 = 268435456;
                    }
                    i13 |= i25;
                }
                i26 = i12 & 1024;
                if (i26 != 0) {
                    i27 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i11 | i28;
                } else {
                    i27 = i11;
                }
                i29 = i12 & 2048;
                if (i29 != 0) {
                    i27 |= 48;
                } else if ((i11 & 112) == 0) {
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i30 = 32;
                    } else {
                        i30 = 16;
                    }
                    i27 |= i30;
                }
                i31 = i27;
                i32 = i12 & 4096;
                if (i32 != 0) {
                    if ((i11 & 896) == 0) {
                        if (composerStartRestartGroup.changedInstance(function7)) {
                            i33 = 256;
                        } else {
                            i33 = 128;
                        }
                        i31 |= i33;
                    }
                    i34 = i12 & 8192;
                    if (i34 != 0) {
                        if ((i11 & 7168) == 0) {
                            i31 |= composerStartRestartGroup.changedInstance(function8) ? 2048 : 1024;
                        }
                        if ((i11 & 57344) != 0) {
                            if ((i12 & 16384) == 0) {
                                i15 = 16384;
                            }
                            i31 |= i15;
                        }
                        if ((i11 & 458752) != 0) {
                            if ((i12 & 32768) == 0) {
                                i38 = 65536;
                            } else {
                                i38 = 65536;
                            }
                            i31 |= i38;
                        }
                        i35 = i12 & 65536;
                        if (i35 != 0) {
                            i31 |= 1572864;
                        } else if ((i11 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(function9)) {
                                i36 = 1048576;
                            } else {
                                i36 = 524288;
                            }
                            i31 |= i36;
                        }
                        if ((i12 & 131072) != 0) {
                            i31 |= 12582912;
                        } else if ((i11 & 29360128) == 0) {
                            if (composerStartRestartGroup.changed(this)) {
                                i37 = 8388608;
                            } else {
                                i37 = 4194304;
                            }
                            i31 |= i37;
                        }
                        if ((i13 & 1533916891) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i18 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i20 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function2;
                                }
                                if (i22 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i24 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i26 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i29 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i32 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i34 == 0) {
                                }
                                if ((i12 & 16384) != 0) {
                                    textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                    i31 &= -57345;
                                } else {
                                    textFieldColorsM1193colors0hiis_0 = textFieldColors;
                                }
                                if ((i12 & 32768) != 0) {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i31 &= -458753;
                                } else {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                                }
                                function16 = function12;
                                if (i35 != 0) {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                                } else {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = function9;
                                }
                                function19 = function10;
                                function20 = function11;
                                function21 = function15;
                                z14 = z13;
                                textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                                function22 = function31;
                                paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                            } else {
                                if (i18 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i20 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function2;
                                }
                                if (i22 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i24 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i26 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i29 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i32 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i34 == 0) {
                                }
                                if ((i12 & 16384) != 0) {
                                    textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                    i31 &= -57345;
                                } else {
                                    textFieldColorsM1193colors0hiis_0 = textFieldColors;
                                }
                                if ((i12 & 32768) != 0) {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i31 &= -458753;
                                } else {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                                }
                                function16 = function12;
                                if (i35 != 0) {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                                } else {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = function9;
                                }
                                function19 = function10;
                                function20 = function11;
                                function21 = function15;
                                z14 = z13;
                                textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                                function22 = function31;
                                paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                            }
                            int i316 = i13;
                            int i4118 = i316 << 3;
                            int i4119 = i316 >> 3;
                            int i41110 = i316 >> 9;
                            int i41111 = i31 << 21;
                            composer2 = composerStartRestartGroup;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i4118 & 896) | (i4118 & 112) | 6 | (i4119 & 7168) | (i41110 & 57344) | (i41110 & 458752) | (i41110 & 3670016) | (i41111 & 29360128) | (234881024 & i41111) | (i41111 & 1879048192), ((i31 >> 9) & 14) | ((i316 >> 6) & 112) | (i316 & 896) | (i41110 & 7168) | (i4119 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z14;
                            function23 = function19;
                            function24 = function20;
                            function25 = function16;
                            function26 = function17;
                            function27 = function18;
                            function28 = function21;
                            function29 = function22;
                            textFieldColors3 = textFieldColors2;
                            paddingValues3 = paddingValues2;
                            function30 = function2ComposableLambda;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i18 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i20 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function2;
                                }
                                if (i22 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i24 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i26 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i29 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i32 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i34 == 0) {
                                }
                                if ((i12 & 16384) != 0) {
                                    textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                    i31 &= -57345;
                                } else {
                                    textFieldColorsM1193colors0hiis_0 = textFieldColors;
                                }
                                if ((i12 & 32768) != 0) {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i31 &= -458753;
                                } else {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                                }
                                function16 = function12;
                                if (i35 != 0) {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                                } else {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = function9;
                                }
                                function19 = function10;
                                function20 = function11;
                                function21 = function15;
                                z14 = z13;
                                textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                                function22 = function31;
                                paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                            } else {
                                if (i18 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i20 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function2;
                                }
                                if (i22 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i24 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i26 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i29 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i32 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i34 == 0) {
                                }
                                if ((i12 & 16384) != 0) {
                                    textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                    i31 &= -57345;
                                } else {
                                    textFieldColorsM1193colors0hiis_0 = textFieldColors;
                                }
                                if ((i12 & 32768) != 0) {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i31 &= -458753;
                                } else {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                                }
                                function16 = function12;
                                if (i35 != 0) {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                                } else {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = function9;
                                }
                                function19 = function10;
                                function20 = function11;
                                function21 = function15;
                                z14 = z13;
                                textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                                function22 = function31;
                                paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                            }
                            int i317 = i13;
                            int i41112 = i317 << 3;
                            int i41113 = i317 >> 3;
                            int i41114 = i317 >> 9;
                            int i41115 = i31 << 21;
                            composer2 = composerStartRestartGroup;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i41112 & 896) | (i41112 & 112) | 6 | (i41113 & 7168) | (i41114 & 57344) | (i41114 & 458752) | (i41114 & 3670016) | (i41115 & 29360128) | (234881024 & i41115) | (i41115 & 1879048192), ((i31 >> 9) & 14) | ((i317 >> 6) & 112) | (i317 & 896) | (i41114 & 7168) | (i41113 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z14;
                            function23 = function19;
                            function24 = function20;
                            function25 = function16;
                            function26 = function17;
                            function27 = function18;
                            function28 = function21;
                            function29 = function22;
                            textFieldColors3 = textFieldColors2;
                            paddingValues3 = paddingValues2;
                            function30 = function2ComposableLambda;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
                    }
                    i31 |= 3072;
                    if ((i11 & 57344) != 0) {
                        if ((i12 & 16384) == 0) {
                            i15 = 16384;
                        }
                        i31 |= i15;
                    }
                    if ((i11 & 458752) != 0) {
                        if ((i12 & 32768) == 0) {
                            i38 = 65536;
                        } else {
                            i38 = 65536;
                        }
                        i31 |= i38;
                    }
                    i35 = i12 & 65536;
                    if (i35 != 0) {
                        i31 |= 1572864;
                    } else if ((i11 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function9)) {
                            i36 = 1048576;
                        } else {
                            i36 = 524288;
                        }
                        i31 |= i36;
                    }
                    if ((i12 & 131072) != 0) {
                        i31 |= 12582912;
                    } else if ((i11 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(this)) {
                            i37 = 8388608;
                        } else {
                            i37 = 4194304;
                        }
                        i31 |= i37;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        } else {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                        }
                        int i318 = i13;
                        int i41116 = i318 << 3;
                        int i41117 = i318 >> 3;
                        int i41118 = i318 >> 9;
                        int i41119 = i31 << 21;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i41116 & 896) | (i41116 & 112) | 6 | (i41117 & 7168) | (i41118 & 57344) | (i41118 & 458752) | (i41118 & 3670016) | (i41119 & 29360128) | (234881024 & i41119) | (i41119 & 1879048192), ((i31 >> 9) & 14) | ((i318 >> 6) & 112) | (i318 & 896) | (i41118 & 7168) | (i41117 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function23 = function19;
                        function24 = function20;
                        function25 = function16;
                        function26 = function17;
                        function27 = function18;
                        function28 = function21;
                        function29 = function22;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function30 = function2ComposableLambda;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        } else {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                        }
                        int i319 = i13;
                        int i411110 = i319 << 3;
                        int i411111 = i319 >> 3;
                        int i411112 = i319 >> 9;
                        int i411113 = i31 << 21;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i411110 & 896) | (i411110 & 112) | 6 | (i411111 & 7168) | (i411112 & 57344) | (i411112 & 458752) | (i411112 & 3670016) | (i411113 & 29360128) | (234881024 & i411113) | (i411113 & 1879048192), ((i31 >> 9) & 14) | ((i319 >> 6) & 112) | (i319 & 896) | (i411112 & 7168) | (i411111 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function23 = function19;
                        function24 = function20;
                        function25 = function16;
                        function26 = function17;
                        function27 = function18;
                        function28 = function21;
                        function29 = function22;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function30 = function2ComposableLambda;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
                }
                i31 |= BluetoothState.REQUEST_CONNECT_DEVICE;
                i34 = i12 & 8192;
                if (i34 != 0) {
                    if ((i11 & 7168) == 0) {
                        i31 |= composerStartRestartGroup.changedInstance(function8) ? 2048 : 1024;
                    }
                    if ((i11 & 57344) != 0) {
                        if ((i12 & 16384) == 0) {
                            i15 = 16384;
                        }
                        i31 |= i15;
                    }
                    if ((i11 & 458752) != 0) {
                        if ((i12 & 32768) == 0) {
                            i38 = 65536;
                        } else {
                            i38 = 65536;
                        }
                        i31 |= i38;
                    }
                    i35 = i12 & 65536;
                    if (i35 != 0) {
                        i31 |= 1572864;
                    } else if ((i11 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function9)) {
                            i36 = 1048576;
                        } else {
                            i36 = 524288;
                        }
                        i31 |= i36;
                    }
                    if ((i12 & 131072) != 0) {
                        i31 |= 12582912;
                    } else if ((i11 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(this)) {
                            i37 = 8388608;
                        } else {
                            i37 = 4194304;
                        }
                        i31 |= i37;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        } else {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                        }
                        int i3110 = i13;
                        int i411114 = i3110 << 3;
                        int i411115 = i3110 >> 3;
                        int i411116 = i3110 >> 9;
                        int i411117 = i31 << 21;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i411114 & 896) | (i411114 & 112) | 6 | (i411115 & 7168) | (i411116 & 57344) | (i411116 & 458752) | (i411116 & 3670016) | (i411117 & 29360128) | (234881024 & i411117) | (i411117 & 1879048192), ((i31 >> 9) & 14) | ((i3110 >> 6) & 112) | (i3110 & 896) | (i411116 & 7168) | (i411115 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function23 = function19;
                        function24 = function20;
                        function25 = function16;
                        function26 = function17;
                        function27 = function18;
                        function28 = function21;
                        function29 = function22;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function30 = function2ComposableLambda;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        } else {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                        }
                        int i3111 = i13;
                        int i411118 = i3111 << 3;
                        int i411119 = i3111 >> 3;
                        int i4111110 = i3111 >> 9;
                        int i4111111 = i31 << 21;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i411118 & 896) | (i411118 & 112) | 6 | (i411119 & 7168) | (i4111110 & 57344) | (i4111110 & 458752) | (i4111110 & 3670016) | (i4111111 & 29360128) | (234881024 & i4111111) | (i4111111 & 1879048192), ((i31 >> 9) & 14) | ((i3111 >> 6) & 112) | (i3111 & 896) | (i4111110 & 7168) | (i411119 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function23 = function19;
                        function24 = function20;
                        function25 = function16;
                        function26 = function17;
                        function27 = function18;
                        function28 = function21;
                        function29 = function22;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function30 = function2ComposableLambda;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
                }
                i31 |= 3072;
                if ((i11 & 57344) != 0) {
                    if ((i12 & 16384) == 0) {
                        i15 = 16384;
                    }
                    i31 |= i15;
                }
                if ((i11 & 458752) != 0) {
                    if ((i12 & 32768) == 0) {
                        i38 = 65536;
                    } else {
                        i38 = 65536;
                    }
                    i31 |= i38;
                }
                i35 = i12 & 65536;
                if (i35 != 0) {
                    i31 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function9)) {
                        i36 = 1048576;
                    } else {
                        i36 = 524288;
                    }
                    i31 |= i36;
                }
                if ((i12 & 131072) != 0) {
                    i31 |= 12582912;
                } else if ((i11 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i37 = 8388608;
                    } else {
                        i37 = 4194304;
                    }
                    i31 |= i37;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    } else {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                    }
                    int i3112 = i13;
                    int i4111112 = i3112 << 3;
                    int i4111113 = i3112 >> 3;
                    int i4111114 = i3112 >> 9;
                    int i4111115 = i31 << 21;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i4111112 & 896) | (i4111112 & 112) | 6 | (i4111113 & 7168) | (i4111114 & 57344) | (i4111114 & 458752) | (i4111114 & 3670016) | (i4111115 & 29360128) | (234881024 & i4111115) | (i4111115 & 1879048192), ((i31 >> 9) & 14) | ((i3112 >> 6) & 112) | (i3112 & 896) | (i4111114 & 7168) | (i4111113 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function23 = function19;
                    function24 = function20;
                    function25 = function16;
                    function26 = function17;
                    function27 = function18;
                    function28 = function21;
                    function29 = function22;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function30 = function2ComposableLambda;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    } else {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                    }
                    int i3113 = i13;
                    int i4111116 = i3113 << 3;
                    int i4111117 = i3113 >> 3;
                    int i4111118 = i3113 >> 9;
                    int i4111119 = i31 << 21;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i4111116 & 896) | (i4111116 & 112) | 6 | (i4111117 & 7168) | (i4111118 & 57344) | (i4111118 & 458752) | (i4111118 & 3670016) | (i4111119 & 29360128) | (234881024 & i4111119) | (i4111119 & 1879048192), ((i31 >> 9) & 14) | ((i3113 >> 6) & 112) | (i3113 & 896) | (i4111118 & 7168) | (i4111117 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function23 = function19;
                    function24 = function20;
                    function25 = function16;
                    function26 = function17;
                    function27 = function18;
                    function28 = function21;
                    function29 = function22;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function30 = function2ComposableLambda;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
            }
            i13 |= 3072;
            i15 = 8192;
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i10 & 57344) == 0) {
                if (composerStartRestartGroup.changed(visualTransformation)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i13 |= i16;
            }
            if ((i12 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(interactionSource)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z12)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 128;
                if (i20 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i13 |= i21;
                }
                i22 = i12 & 256;
                if (i22 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i23 = 33554432;
                    }
                    i13 |= i23;
                }
                i24 = i12 & 512;
                if (i24 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i25 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i25 = 268435456;
                    }
                    i13 |= i25;
                }
                i26 = i12 & 1024;
                if (i26 != 0) {
                    i27 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i11 | i28;
                } else {
                    i27 = i11;
                }
                i29 = i12 & 2048;
                if (i29 != 0) {
                    i27 |= 48;
                } else if ((i11 & 112) == 0) {
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i30 = 32;
                    } else {
                        i30 = 16;
                    }
                    i27 |= i30;
                }
                i31 = i27;
                i32 = i12 & 4096;
                if (i32 != 0) {
                    if ((i11 & 896) == 0) {
                        if (composerStartRestartGroup.changedInstance(function7)) {
                            i33 = 256;
                        } else {
                            i33 = 128;
                        }
                        i31 |= i33;
                    }
                    i34 = i12 & 8192;
                    if (i34 != 0) {
                        if ((i11 & 7168) == 0) {
                            i31 |= composerStartRestartGroup.changedInstance(function8) ? 2048 : 1024;
                        }
                        if ((i11 & 57344) != 0) {
                            if ((i12 & 16384) == 0) {
                                i15 = 16384;
                            }
                            i31 |= i15;
                        }
                        if ((i11 & 458752) != 0) {
                            if ((i12 & 32768) == 0) {
                                i38 = 65536;
                            } else {
                                i38 = 65536;
                            }
                            i31 |= i38;
                        }
                        i35 = i12 & 65536;
                        if (i35 != 0) {
                            i31 |= 1572864;
                        } else if ((i11 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(function9)) {
                                i36 = 1048576;
                            } else {
                                i36 = 524288;
                            }
                            i31 |= i36;
                        }
                        if ((i12 & 131072) != 0) {
                            i31 |= 12582912;
                        } else if ((i11 & 29360128) == 0) {
                            if (composerStartRestartGroup.changed(this)) {
                                i37 = 8388608;
                            } else {
                                i37 = 4194304;
                            }
                            i31 |= i37;
                        }
                        if ((i13 & 1533916891) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i18 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i20 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function2;
                                }
                                if (i22 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i24 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i26 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i29 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i32 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i34 == 0) {
                                }
                                if ((i12 & 16384) != 0) {
                                    textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                    i31 &= -57345;
                                } else {
                                    textFieldColorsM1193colors0hiis_0 = textFieldColors;
                                }
                                if ((i12 & 32768) != 0) {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i31 &= -458753;
                                } else {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                                }
                                function16 = function12;
                                if (i35 != 0) {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                                } else {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = function9;
                                }
                                function19 = function10;
                                function20 = function11;
                                function21 = function15;
                                z14 = z13;
                                textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                                function22 = function31;
                                paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                            } else {
                                if (i18 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i20 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function2;
                                }
                                if (i22 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i24 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i26 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i29 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i32 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i34 == 0) {
                                }
                                if ((i12 & 16384) != 0) {
                                    textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                    i31 &= -57345;
                                } else {
                                    textFieldColorsM1193colors0hiis_0 = textFieldColors;
                                }
                                if ((i12 & 32768) != 0) {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i31 &= -458753;
                                } else {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                                }
                                function16 = function12;
                                if (i35 != 0) {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                                } else {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = function9;
                                }
                                function19 = function10;
                                function20 = function11;
                                function21 = function15;
                                z14 = z13;
                                textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                                function22 = function31;
                                paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                            }
                            int i3114 = i13;
                            int i41111110 = i3114 << 3;
                            int i41111111 = i3114 >> 3;
                            int i41111112 = i3114 >> 9;
                            int i41111113 = i31 << 21;
                            composer2 = composerStartRestartGroup;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i41111110 & 896) | (i41111110 & 112) | 6 | (i41111111 & 7168) | (i41111112 & 57344) | (i41111112 & 458752) | (i41111112 & 3670016) | (i41111113 & 29360128) | (234881024 & i41111113) | (i41111113 & 1879048192), ((i31 >> 9) & 14) | ((i3114 >> 6) & 112) | (i3114 & 896) | (i41111112 & 7168) | (i41111111 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z14;
                            function23 = function19;
                            function24 = function20;
                            function25 = function16;
                            function26 = function17;
                            function27 = function18;
                            function28 = function21;
                            function29 = function22;
                            textFieldColors3 = textFieldColors2;
                            paddingValues3 = paddingValues2;
                            function30 = function2ComposableLambda;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i18 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i20 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function2;
                                }
                                if (i22 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i24 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i26 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i29 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i32 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i34 == 0) {
                                }
                                if ((i12 & 16384) != 0) {
                                    textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                    i31 &= -57345;
                                } else {
                                    textFieldColorsM1193colors0hiis_0 = textFieldColors;
                                }
                                if ((i12 & 32768) != 0) {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i31 &= -458753;
                                } else {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                                }
                                function16 = function12;
                                if (i35 != 0) {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                                } else {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = function9;
                                }
                                function19 = function10;
                                function20 = function11;
                                function21 = function15;
                                z14 = z13;
                                textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                                function22 = function31;
                                paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                            } else {
                                if (i18 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i20 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function2;
                                }
                                if (i22 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i24 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i26 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i29 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i32 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i34 == 0) {
                                }
                                if ((i12 & 16384) != 0) {
                                    textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                    i31 &= -57345;
                                } else {
                                    textFieldColorsM1193colors0hiis_0 = textFieldColors;
                                }
                                if ((i12 & 32768) != 0) {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i31 &= -458753;
                                } else {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                                }
                                function16 = function12;
                                if (i35 != 0) {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                                } else {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = function9;
                                }
                                function19 = function10;
                                function20 = function11;
                                function21 = function15;
                                z14 = z13;
                                textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                                function22 = function31;
                                paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                            }
                            int i3115 = i13;
                            int i41111114 = i3115 << 3;
                            int i41111115 = i3115 >> 3;
                            int i41111116 = i3115 >> 9;
                            int i41111117 = i31 << 21;
                            composer2 = composerStartRestartGroup;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i41111114 & 896) | (i41111114 & 112) | 6 | (i41111115 & 7168) | (i41111116 & 57344) | (i41111116 & 458752) | (i41111116 & 3670016) | (i41111117 & 29360128) | (234881024 & i41111117) | (i41111117 & 1879048192), ((i31 >> 9) & 14) | ((i3115 >> 6) & 112) | (i3115 & 896) | (i41111116 & 7168) | (i41111115 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z14;
                            function23 = function19;
                            function24 = function20;
                            function25 = function16;
                            function26 = function17;
                            function27 = function18;
                            function28 = function21;
                            function29 = function22;
                            textFieldColors3 = textFieldColors2;
                            paddingValues3 = paddingValues2;
                            function30 = function2ComposableLambda;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
                    }
                    i31 |= 3072;
                    if ((i11 & 57344) != 0) {
                        if ((i12 & 16384) == 0) {
                            i15 = 16384;
                        }
                        i31 |= i15;
                    }
                    if ((i11 & 458752) != 0) {
                        if ((i12 & 32768) == 0) {
                            i38 = 65536;
                        } else {
                            i38 = 65536;
                        }
                        i31 |= i38;
                    }
                    i35 = i12 & 65536;
                    if (i35 != 0) {
                        i31 |= 1572864;
                    } else if ((i11 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function9)) {
                            i36 = 1048576;
                        } else {
                            i36 = 524288;
                        }
                        i31 |= i36;
                    }
                    if ((i12 & 131072) != 0) {
                        i31 |= 12582912;
                    } else if ((i11 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(this)) {
                            i37 = 8388608;
                        } else {
                            i37 = 4194304;
                        }
                        i31 |= i37;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        } else {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                        }
                        int i3116 = i13;
                        int i41111118 = i3116 << 3;
                        int i41111119 = i3116 >> 3;
                        int i411111110 = i3116 >> 9;
                        int i411111111 = i31 << 21;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i41111118 & 896) | (i41111118 & 112) | 6 | (i41111119 & 7168) | (i411111110 & 57344) | (i411111110 & 458752) | (i411111110 & 3670016) | (i411111111 & 29360128) | (234881024 & i411111111) | (i411111111 & 1879048192), ((i31 >> 9) & 14) | ((i3116 >> 6) & 112) | (i3116 & 896) | (i411111110 & 7168) | (i41111119 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function23 = function19;
                        function24 = function20;
                        function25 = function16;
                        function26 = function17;
                        function27 = function18;
                        function28 = function21;
                        function29 = function22;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function30 = function2ComposableLambda;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        } else {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                        }
                        int i3117 = i13;
                        int i411111112 = i3117 << 3;
                        int i411111113 = i3117 >> 3;
                        int i411111114 = i3117 >> 9;
                        int i411111115 = i31 << 21;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i411111112 & 896) | (i411111112 & 112) | 6 | (i411111113 & 7168) | (i411111114 & 57344) | (i411111114 & 458752) | (i411111114 & 3670016) | (i411111115 & 29360128) | (234881024 & i411111115) | (i411111115 & 1879048192), ((i31 >> 9) & 14) | ((i3117 >> 6) & 112) | (i3117 & 896) | (i411111114 & 7168) | (i411111113 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function23 = function19;
                        function24 = function20;
                        function25 = function16;
                        function26 = function17;
                        function27 = function18;
                        function28 = function21;
                        function29 = function22;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function30 = function2ComposableLambda;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
                }
                i31 |= BluetoothState.REQUEST_CONNECT_DEVICE;
                i34 = i12 & 8192;
                if (i34 != 0) {
                    if ((i11 & 7168) == 0) {
                        i31 |= composerStartRestartGroup.changedInstance(function8) ? 2048 : 1024;
                    }
                    if ((i11 & 57344) != 0) {
                        if ((i12 & 16384) == 0) {
                            i15 = 16384;
                        }
                        i31 |= i15;
                    }
                    if ((i11 & 458752) != 0) {
                        if ((i12 & 32768) == 0) {
                            i38 = 65536;
                        } else {
                            i38 = 65536;
                        }
                        i31 |= i38;
                    }
                    i35 = i12 & 65536;
                    if (i35 != 0) {
                        i31 |= 1572864;
                    } else if ((i11 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function9)) {
                            i36 = 1048576;
                        } else {
                            i36 = 524288;
                        }
                        i31 |= i36;
                    }
                    if ((i12 & 131072) != 0) {
                        i31 |= 12582912;
                    } else if ((i11 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(this)) {
                            i37 = 8388608;
                        } else {
                            i37 = 4194304;
                        }
                        i31 |= i37;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        } else {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                        }
                        int i3118 = i13;
                        int i411111116 = i3118 << 3;
                        int i411111117 = i3118 >> 3;
                        int i411111118 = i3118 >> 9;
                        int i411111119 = i31 << 21;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i411111116 & 896) | (i411111116 & 112) | 6 | (i411111117 & 7168) | (i411111118 & 57344) | (i411111118 & 458752) | (i411111118 & 3670016) | (i411111119 & 29360128) | (234881024 & i411111119) | (i411111119 & 1879048192), ((i31 >> 9) & 14) | ((i3118 >> 6) & 112) | (i3118 & 896) | (i411111118 & 7168) | (i411111117 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function23 = function19;
                        function24 = function20;
                        function25 = function16;
                        function26 = function17;
                        function27 = function18;
                        function28 = function21;
                        function29 = function22;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function30 = function2ComposableLambda;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        } else {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                        }
                        int i3119 = i13;
                        int i4111111110 = i3119 << 3;
                        int i4111111111 = i3119 >> 3;
                        int i4111111112 = i3119 >> 9;
                        int i4111111113 = i31 << 21;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i4111111110 & 896) | (i4111111110 & 112) | 6 | (i4111111111 & 7168) | (i4111111112 & 57344) | (i4111111112 & 458752) | (i4111111112 & 3670016) | (i4111111113 & 29360128) | (234881024 & i4111111113) | (i4111111113 & 1879048192), ((i31 >> 9) & 14) | ((i3119 >> 6) & 112) | (i3119 & 896) | (i4111111112 & 7168) | (i4111111111 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function23 = function19;
                        function24 = function20;
                        function25 = function16;
                        function26 = function17;
                        function27 = function18;
                        function28 = function21;
                        function29 = function22;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function30 = function2ComposableLambda;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
                }
                i31 |= 3072;
                if ((i11 & 57344) != 0) {
                    if ((i12 & 16384) == 0) {
                        i15 = 16384;
                    }
                    i31 |= i15;
                }
                if ((i11 & 458752) != 0) {
                    if ((i12 & 32768) == 0) {
                        i38 = 65536;
                    } else {
                        i38 = 65536;
                    }
                    i31 |= i38;
                }
                i35 = i12 & 65536;
                if (i35 != 0) {
                    i31 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function9)) {
                        i36 = 1048576;
                    } else {
                        i36 = 524288;
                    }
                    i31 |= i36;
                }
                if ((i12 & 131072) != 0) {
                    i31 |= 12582912;
                } else if ((i11 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i37 = 8388608;
                    } else {
                        i37 = 4194304;
                    }
                    i31 |= i37;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    } else {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                    }
                    int i31110 = i13;
                    int i4111111114 = i31110 << 3;
                    int i4111111115 = i31110 >> 3;
                    int i4111111116 = i31110 >> 9;
                    int i4111111117 = i31 << 21;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i4111111114 & 896) | (i4111111114 & 112) | 6 | (i4111111115 & 7168) | (i4111111116 & 57344) | (i4111111116 & 458752) | (i4111111116 & 3670016) | (i4111111117 & 29360128) | (234881024 & i4111111117) | (i4111111117 & 1879048192), ((i31 >> 9) & 14) | ((i31110 >> 6) & 112) | (i31110 & 896) | (i4111111116 & 7168) | (i4111111115 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function23 = function19;
                    function24 = function20;
                    function25 = function16;
                    function26 = function17;
                    function27 = function18;
                    function28 = function21;
                    function29 = function22;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function30 = function2ComposableLambda;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    } else {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                    }
                    int i31111 = i13;
                    int i4111111118 = i31111 << 3;
                    int i4111111119 = i31111 >> 3;
                    int i41111111110 = i31111 >> 9;
                    int i41111111111 = i31 << 21;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i4111111118 & 896) | (i4111111118 & 112) | 6 | (i4111111119 & 7168) | (i41111111110 & 57344) | (i41111111110 & 458752) | (i41111111110 & 3670016) | (i41111111111 & 29360128) | (234881024 & i41111111111) | (i41111111111 & 1879048192), ((i31 >> 9) & 14) | ((i31111 >> 6) & 112) | (i31111 & 896) | (i41111111110 & 7168) | (i4111111119 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function23 = function19;
                    function24 = function20;
                    function25 = function16;
                    function26 = function17;
                    function27 = function18;
                    function28 = function21;
                    function29 = function22;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function30 = function2ComposableLambda;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
            }
            i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i13 |= i17;
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z12)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i13 |= i19;
            }
            i20 = i12 & 128;
            if (i20 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i13 |= i21;
            }
            i22 = i12 & 256;
            if (i22 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i23 = 33554432;
                }
                i13 |= i23;
            }
            i24 = i12 & 512;
            if (i24 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i25 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i25 = 268435456;
                }
                i13 |= i25;
            }
            i26 = i12 & 1024;
            if (i26 != 0) {
                i27 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i11 | i28;
            } else {
                i27 = i11;
            }
            i29 = i12 & 2048;
            if (i29 != 0) {
                i27 |= 48;
            } else if ((i11 & 112) == 0) {
                if (composerStartRestartGroup.changedInstance(function6)) {
                    i30 = 32;
                } else {
                    i30 = 16;
                }
                i27 |= i30;
            }
            i31 = i27;
            i32 = i12 & 4096;
            if (i32 != 0) {
                if ((i11 & 896) == 0) {
                    if (composerStartRestartGroup.changedInstance(function7)) {
                        i33 = 256;
                    } else {
                        i33 = 128;
                    }
                    i31 |= i33;
                }
                i34 = i12 & 8192;
                if (i34 != 0) {
                    if ((i11 & 7168) == 0) {
                        i31 |= composerStartRestartGroup.changedInstance(function8) ? 2048 : 1024;
                    }
                    if ((i11 & 57344) != 0) {
                        if ((i12 & 16384) == 0) {
                            i15 = 16384;
                        }
                        i31 |= i15;
                    }
                    if ((i11 & 458752) != 0) {
                        if ((i12 & 32768) == 0) {
                            i38 = 65536;
                        } else {
                            i38 = 65536;
                        }
                        i31 |= i38;
                    }
                    i35 = i12 & 65536;
                    if (i35 != 0) {
                        i31 |= 1572864;
                    } else if ((i11 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function9)) {
                            i36 = 1048576;
                        } else {
                            i36 = 524288;
                        }
                        i31 |= i36;
                    }
                    if ((i12 & 131072) != 0) {
                        i31 |= 12582912;
                    } else if ((i11 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(this)) {
                            i37 = 8388608;
                        } else {
                            i37 = 4194304;
                        }
                        i31 |= i37;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        } else {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                        }
                        int i31112 = i13;
                        int i41111111112 = i31112 << 3;
                        int i41111111113 = i31112 >> 3;
                        int i41111111114 = i31112 >> 9;
                        int i41111111115 = i31 << 21;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i41111111112 & 896) | (i41111111112 & 112) | 6 | (i41111111113 & 7168) | (i41111111114 & 57344) | (i41111111114 & 458752) | (i41111111114 & 3670016) | (i41111111115 & 29360128) | (234881024 & i41111111115) | (i41111111115 & 1879048192), ((i31 >> 9) & 14) | ((i31112 >> 6) & 112) | (i31112 & 896) | (i41111111114 & 7168) | (i41111111113 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function23 = function19;
                        function24 = function20;
                        function25 = function16;
                        function26 = function17;
                        function27 = function18;
                        function28 = function21;
                        function29 = function22;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function30 = function2ComposableLambda;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        } else {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                        }
                        int i31113 = i13;
                        int i41111111116 = i31113 << 3;
                        int i41111111117 = i31113 >> 3;
                        int i41111111118 = i31113 >> 9;
                        int i41111111119 = i31 << 21;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i41111111116 & 896) | (i41111111116 & 112) | 6 | (i41111111117 & 7168) | (i41111111118 & 57344) | (i41111111118 & 458752) | (i41111111118 & 3670016) | (i41111111119 & 29360128) | (234881024 & i41111111119) | (i41111111119 & 1879048192), ((i31 >> 9) & 14) | ((i31113 >> 6) & 112) | (i31113 & 896) | (i41111111118 & 7168) | (i41111111117 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function23 = function19;
                        function24 = function20;
                        function25 = function16;
                        function26 = function17;
                        function27 = function18;
                        function28 = function21;
                        function29 = function22;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function30 = function2ComposableLambda;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
                }
                i31 |= 3072;
                if ((i11 & 57344) != 0) {
                    if ((i12 & 16384) == 0) {
                        i15 = 16384;
                    }
                    i31 |= i15;
                }
                if ((i11 & 458752) != 0) {
                    if ((i12 & 32768) == 0) {
                        i38 = 65536;
                    } else {
                        i38 = 65536;
                    }
                    i31 |= i38;
                }
                i35 = i12 & 65536;
                if (i35 != 0) {
                    i31 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function9)) {
                        i36 = 1048576;
                    } else {
                        i36 = 524288;
                    }
                    i31 |= i36;
                }
                if ((i12 & 131072) != 0) {
                    i31 |= 12582912;
                } else if ((i11 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i37 = 8388608;
                    } else {
                        i37 = 4194304;
                    }
                    i31 |= i37;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    } else {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                    }
                    int i31114 = i13;
                    int i411111111110 = i31114 << 3;
                    int i411111111111 = i31114 >> 3;
                    int i411111111112 = i31114 >> 9;
                    int i411111111113 = i31 << 21;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i411111111110 & 896) | (i411111111110 & 112) | 6 | (i411111111111 & 7168) | (i411111111112 & 57344) | (i411111111112 & 458752) | (i411111111112 & 3670016) | (i411111111113 & 29360128) | (234881024 & i411111111113) | (i411111111113 & 1879048192), ((i31 >> 9) & 14) | ((i31114 >> 6) & 112) | (i31114 & 896) | (i411111111112 & 7168) | (i411111111111 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function23 = function19;
                    function24 = function20;
                    function25 = function16;
                    function26 = function17;
                    function27 = function18;
                    function28 = function21;
                    function29 = function22;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function30 = function2ComposableLambda;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    } else {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                    }
                    int i31115 = i13;
                    int i411111111114 = i31115 << 3;
                    int i411111111115 = i31115 >> 3;
                    int i411111111116 = i31115 >> 9;
                    int i411111111117 = i31 << 21;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i411111111114 & 896) | (i411111111114 & 112) | 6 | (i411111111115 & 7168) | (i411111111116 & 57344) | (i411111111116 & 458752) | (i411111111116 & 3670016) | (i411111111117 & 29360128) | (234881024 & i411111111117) | (i411111111117 & 1879048192), ((i31 >> 9) & 14) | ((i31115 >> 6) & 112) | (i31115 & 896) | (i411111111116 & 7168) | (i411111111115 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function23 = function19;
                    function24 = function20;
                    function25 = function16;
                    function26 = function17;
                    function27 = function18;
                    function28 = function21;
                    function29 = function22;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function30 = function2ComposableLambda;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
            }
            i31 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            i34 = i12 & 8192;
            if (i34 != 0) {
                if ((i11 & 7168) == 0) {
                    i31 |= composerStartRestartGroup.changedInstance(function8) ? 2048 : 1024;
                }
                if ((i11 & 57344) != 0) {
                    if ((i12 & 16384) == 0) {
                        i15 = 16384;
                    }
                    i31 |= i15;
                }
                if ((i11 & 458752) != 0) {
                    if ((i12 & 32768) == 0) {
                        i38 = 65536;
                    } else {
                        i38 = 65536;
                    }
                    i31 |= i38;
                }
                i35 = i12 & 65536;
                if (i35 != 0) {
                    i31 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function9)) {
                        i36 = 1048576;
                    } else {
                        i36 = 524288;
                    }
                    i31 |= i36;
                }
                if ((i12 & 131072) != 0) {
                    i31 |= 12582912;
                } else if ((i11 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i37 = 8388608;
                    } else {
                        i37 = 4194304;
                    }
                    i31 |= i37;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    } else {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                    }
                    int i31116 = i13;
                    int i411111111118 = i31116 << 3;
                    int i411111111119 = i31116 >> 3;
                    int i4111111111110 = i31116 >> 9;
                    int i4111111111111 = i31 << 21;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i411111111118 & 896) | (i411111111118 & 112) | 6 | (i411111111119 & 7168) | (i4111111111110 & 57344) | (i4111111111110 & 458752) | (i4111111111110 & 3670016) | (i4111111111111 & 29360128) | (234881024 & i4111111111111) | (i4111111111111 & 1879048192), ((i31 >> 9) & 14) | ((i31116 >> 6) & 112) | (i31116 & 896) | (i4111111111110 & 7168) | (i411111111119 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function23 = function19;
                    function24 = function20;
                    function25 = function16;
                    function26 = function17;
                    function27 = function18;
                    function28 = function21;
                    function29 = function22;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function30 = function2ComposableLambda;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    } else {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                    }
                    int i31117 = i13;
                    int i4111111111112 = i31117 << 3;
                    int i4111111111113 = i31117 >> 3;
                    int i4111111111114 = i31117 >> 9;
                    int i4111111111115 = i31 << 21;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i4111111111112 & 896) | (i4111111111112 & 112) | 6 | (i4111111111113 & 7168) | (i4111111111114 & 57344) | (i4111111111114 & 458752) | (i4111111111114 & 3670016) | (i4111111111115 & 29360128) | (234881024 & i4111111111115) | (i4111111111115 & 1879048192), ((i31 >> 9) & 14) | ((i31117 >> 6) & 112) | (i31117 & 896) | (i4111111111114 & 7168) | (i4111111111113 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function23 = function19;
                    function24 = function20;
                    function25 = function16;
                    function26 = function17;
                    function27 = function18;
                    function28 = function21;
                    function29 = function22;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function30 = function2ComposableLambda;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
            }
            i31 |= 3072;
            if ((i11 & 57344) != 0) {
                if ((i12 & 16384) == 0) {
                    i15 = 16384;
                }
                i31 |= i15;
            }
            if ((i11 & 458752) != 0) {
                if ((i12 & 32768) == 0) {
                    i38 = 65536;
                } else {
                    i38 = 65536;
                }
                i31 |= i38;
            }
            i35 = i12 & 65536;
            if (i35 != 0) {
                i31 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function9)) {
                    i36 = 1048576;
                } else {
                    i36 = 524288;
                }
                i31 |= i36;
            }
            if ((i12 & 131072) != 0) {
                i31 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i37 = 8388608;
                } else {
                    i37 = 4194304;
                }
                i31 |= i37;
            }
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i20 != 0) {
                        function10 = null;
                    } else {
                        function10 = function2;
                    }
                    if (i22 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i24 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i26 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i29 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i32 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i34 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                        i31 &= -57345;
                    } else {
                        textFieldColorsM1193colors0hiis_0 = textFieldColors;
                    }
                    if ((i12 & 32768) != 0) {
                        paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i31 &= -458753;
                    } else {
                        paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                    }
                    function16 = function12;
                    if (i35 != 0) {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                    } else {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = function9;
                    }
                    function19 = function10;
                    function20 = function11;
                    function21 = function15;
                    z14 = z13;
                    textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                    function22 = function31;
                    paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                } else {
                    if (i18 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i20 != 0) {
                        function10 = null;
                    } else {
                        function10 = function2;
                    }
                    if (i22 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i24 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i26 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i29 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i32 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i34 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                        i31 &= -57345;
                    } else {
                        textFieldColorsM1193colors0hiis_0 = textFieldColors;
                    }
                    if ((i12 & 32768) != 0) {
                        paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i31 &= -458753;
                    } else {
                        paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                    }
                    function16 = function12;
                    if (i35 != 0) {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                    } else {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = function9;
                    }
                    function19 = function10;
                    function20 = function11;
                    function21 = function15;
                    z14 = z13;
                    textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                    function22 = function31;
                    paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                }
                int i31118 = i13;
                int i4111111111116 = i31118 << 3;
                int i4111111111117 = i31118 >> 3;
                int i4111111111118 = i31118 >> 9;
                int i4111111111119 = i31 << 21;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i4111111111116 & 896) | (i4111111111116 & 112) | 6 | (i4111111111117 & 7168) | (i4111111111118 & 57344) | (i4111111111118 & 458752) | (i4111111111118 & 3670016) | (i4111111111119 & 29360128) | (234881024 & i4111111111119) | (i4111111111119 & 1879048192), ((i31 >> 9) & 14) | ((i31118 >> 6) & 112) | (i31118 & 896) | (i4111111111118 & 7168) | (i4111111111117 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function23 = function19;
                function24 = function20;
                function25 = function16;
                function26 = function17;
                function27 = function18;
                function28 = function21;
                function29 = function22;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
                function30 = function2ComposableLambda;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i20 != 0) {
                        function10 = null;
                    } else {
                        function10 = function2;
                    }
                    if (i22 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i24 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i26 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i29 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i32 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i34 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                        i31 &= -57345;
                    } else {
                        textFieldColorsM1193colors0hiis_0 = textFieldColors;
                    }
                    if ((i12 & 32768) != 0) {
                        paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i31 &= -458753;
                    } else {
                        paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                    }
                    function16 = function12;
                    if (i35 != 0) {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                    } else {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = function9;
                    }
                    function19 = function10;
                    function20 = function11;
                    function21 = function15;
                    z14 = z13;
                    textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                    function22 = function31;
                    paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                } else {
                    if (i18 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i20 != 0) {
                        function10 = null;
                    } else {
                        function10 = function2;
                    }
                    if (i22 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i24 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i26 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i29 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i32 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i34 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                        i31 &= -57345;
                    } else {
                        textFieldColorsM1193colors0hiis_0 = textFieldColors;
                    }
                    if ((i12 & 32768) != 0) {
                        paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i31 &= -458753;
                    } else {
                        paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                    }
                    function16 = function12;
                    if (i35 != 0) {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                    } else {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = function9;
                    }
                    function19 = function10;
                    function20 = function11;
                    function21 = function15;
                    z14 = z13;
                    textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                    function22 = function31;
                    paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                }
                int i31119 = i13;
                int i41111111111110 = i31119 << 3;
                int i41111111111111 = i31119 >> 3;
                int i41111111111112 = i31119 >> 9;
                int i41111111111113 = i31 << 21;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i41111111111110 & 896) | (i41111111111110 & 112) | 6 | (i41111111111111 & 7168) | (i41111111111112 & 57344) | (i41111111111112 & 458752) | (i41111111111112 & 3670016) | (i41111111111113 & 29360128) | (234881024 & i41111111111113) | (i41111111111113 & 1879048192), ((i31 >> 9) & 14) | ((i31119 >> 6) & 112) | (i31119 & 896) | (i41111111111112 & 7168) | (i41111111111111 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function23 = function19;
                function24 = function20;
                function25 = function16;
                function26 = function17;
                function27 = function18;
                function28 = function21;
                function29 = function22;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
                function30 = function2ComposableLambda;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
        }
        i13 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        if ((i12 & 8) != 0) {
            if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changed(z11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i13 |= i14;
            }
            i15 = 8192;
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i10 & 57344) == 0) {
                if (composerStartRestartGroup.changed(visualTransformation)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i13 |= i16;
            }
            if ((i12 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(interactionSource)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z12)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 128;
                if (i20 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i13 |= i21;
                }
                i22 = i12 & 256;
                if (i22 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i23 = 33554432;
                    }
                    i13 |= i23;
                }
                i24 = i12 & 512;
                if (i24 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i25 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i25 = 268435456;
                    }
                    i13 |= i25;
                }
                i26 = i12 & 1024;
                if (i26 != 0) {
                    i27 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i28 = 4;
                    } else {
                        i28 = 2;
                    }
                    i27 = i11 | i28;
                } else {
                    i27 = i11;
                }
                i29 = i12 & 2048;
                if (i29 != 0) {
                    i27 |= 48;
                } else if ((i11 & 112) == 0) {
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i30 = 32;
                    } else {
                        i30 = 16;
                    }
                    i27 |= i30;
                }
                i31 = i27;
                i32 = i12 & 4096;
                if (i32 != 0) {
                    if ((i11 & 896) == 0) {
                        if (composerStartRestartGroup.changedInstance(function7)) {
                            i33 = 256;
                        } else {
                            i33 = 128;
                        }
                        i31 |= i33;
                    }
                    i34 = i12 & 8192;
                    if (i34 != 0) {
                        if ((i11 & 7168) == 0) {
                            i31 |= composerStartRestartGroup.changedInstance(function8) ? 2048 : 1024;
                        }
                        if ((i11 & 57344) != 0) {
                            if ((i12 & 16384) == 0) {
                                i15 = 16384;
                            }
                            i31 |= i15;
                        }
                        if ((i11 & 458752) != 0) {
                            if ((i12 & 32768) == 0) {
                                i38 = 65536;
                            } else {
                                i38 = 65536;
                            }
                            i31 |= i38;
                        }
                        i35 = i12 & 65536;
                        if (i35 != 0) {
                            i31 |= 1572864;
                        } else if ((i11 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(function9)) {
                                i36 = 1048576;
                            } else {
                                i36 = 524288;
                            }
                            i31 |= i36;
                        }
                        if ((i12 & 131072) != 0) {
                            i31 |= 12582912;
                        } else if ((i11 & 29360128) == 0) {
                            if (composerStartRestartGroup.changed(this)) {
                                i37 = 8388608;
                            } else {
                                i37 = 4194304;
                            }
                            i31 |= i37;
                        }
                        if ((i13 & 1533916891) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i18 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i20 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function2;
                                }
                                if (i22 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i24 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i26 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i29 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i32 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i34 == 0) {
                                }
                                if ((i12 & 16384) != 0) {
                                    textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                    i31 &= -57345;
                                } else {
                                    textFieldColorsM1193colors0hiis_0 = textFieldColors;
                                }
                                if ((i12 & 32768) != 0) {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i31 &= -458753;
                                } else {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                                }
                                function16 = function12;
                                if (i35 != 0) {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                                } else {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = function9;
                                }
                                function19 = function10;
                                function20 = function11;
                                function21 = function15;
                                z14 = z13;
                                textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                                function22 = function31;
                                paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                            } else {
                                if (i18 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i20 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function2;
                                }
                                if (i22 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i24 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i26 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i29 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i32 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i34 == 0) {
                                }
                                if ((i12 & 16384) != 0) {
                                    textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                    i31 &= -57345;
                                } else {
                                    textFieldColorsM1193colors0hiis_0 = textFieldColors;
                                }
                                if ((i12 & 32768) != 0) {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i31 &= -458753;
                                } else {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                                }
                                function16 = function12;
                                if (i35 != 0) {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                                } else {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = function9;
                                }
                                function19 = function10;
                                function20 = function11;
                                function21 = function15;
                                z14 = z13;
                                textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                                function22 = function31;
                                paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                            }
                            int i311110 = i13;
                            int i41111111111114 = i311110 << 3;
                            int i41111111111115 = i311110 >> 3;
                            int i41111111111116 = i311110 >> 9;
                            int i41111111111117 = i31 << 21;
                            composer2 = composerStartRestartGroup;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i41111111111114 & 896) | (i41111111111114 & 112) | 6 | (i41111111111115 & 7168) | (i41111111111116 & 57344) | (i41111111111116 & 458752) | (i41111111111116 & 3670016) | (i41111111111117 & 29360128) | (234881024 & i41111111111117) | (i41111111111117 & 1879048192), ((i31 >> 9) & 14) | ((i311110 >> 6) & 112) | (i311110 & 896) | (i41111111111116 & 7168) | (i41111111111115 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z14;
                            function23 = function19;
                            function24 = function20;
                            function25 = function16;
                            function26 = function17;
                            function27 = function18;
                            function28 = function21;
                            function29 = function22;
                            textFieldColors3 = textFieldColors2;
                            paddingValues3 = paddingValues2;
                            function30 = function2ComposableLambda;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i18 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i20 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function2;
                                }
                                if (i22 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i24 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i26 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i29 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i32 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i34 == 0) {
                                }
                                if ((i12 & 16384) != 0) {
                                    textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                    i31 &= -57345;
                                } else {
                                    textFieldColorsM1193colors0hiis_0 = textFieldColors;
                                }
                                if ((i12 & 32768) != 0) {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i31 &= -458753;
                                } else {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                                }
                                function16 = function12;
                                if (i35 != 0) {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                                } else {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = function9;
                                }
                                function19 = function10;
                                function20 = function11;
                                function21 = function15;
                                z14 = z13;
                                textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                                function22 = function31;
                                paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                            } else {
                                if (i18 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i20 != 0) {
                                    function10 = null;
                                } else {
                                    function10 = function2;
                                }
                                if (i22 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i24 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i26 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i29 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i32 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i34 == 0) {
                                }
                                if ((i12 & 16384) != 0) {
                                    textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                    i31 &= -57345;
                                } else {
                                    textFieldColorsM1193colors0hiis_0 = textFieldColors;
                                }
                                if ((i12 & 32768) != 0) {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i31 &= -458753;
                                } else {
                                    paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                                }
                                function16 = function12;
                                if (i35 != 0) {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                                } else {
                                    function17 = function13;
                                    function18 = function14;
                                    function2ComposableLambda = function9;
                                }
                                function19 = function10;
                                function20 = function11;
                                function21 = function15;
                                z14 = z13;
                                textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                                function22 = function31;
                                paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                            }
                            int i311111 = i13;
                            int i41111111111118 = i311111 << 3;
                            int i41111111111119 = i311111 >> 3;
                            int i411111111111110 = i311111 >> 9;
                            int i411111111111111 = i31 << 21;
                            composer2 = composerStartRestartGroup;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i41111111111118 & 896) | (i41111111111118 & 112) | 6 | (i41111111111119 & 7168) | (i411111111111110 & 57344) | (i411111111111110 & 458752) | (i411111111111110 & 3670016) | (i411111111111111 & 29360128) | (234881024 & i411111111111111) | (i411111111111111 & 1879048192), ((i31 >> 9) & 14) | ((i311111 >> 6) & 112) | (i311111 & 896) | (i411111111111110 & 7168) | (i41111111111119 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z14;
                            function23 = function19;
                            function24 = function20;
                            function25 = function16;
                            function26 = function17;
                            function27 = function18;
                            function28 = function21;
                            function29 = function22;
                            textFieldColors3 = textFieldColors2;
                            paddingValues3 = paddingValues2;
                            function30 = function2ComposableLambda;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
                    }
                    i31 |= 3072;
                    if ((i11 & 57344) != 0) {
                        if ((i12 & 16384) == 0) {
                            i15 = 16384;
                        }
                        i31 |= i15;
                    }
                    if ((i11 & 458752) != 0) {
                        if ((i12 & 32768) == 0) {
                            i38 = 65536;
                        } else {
                            i38 = 65536;
                        }
                        i31 |= i38;
                    }
                    i35 = i12 & 65536;
                    if (i35 != 0) {
                        i31 |= 1572864;
                    } else if ((i11 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function9)) {
                            i36 = 1048576;
                        } else {
                            i36 = 524288;
                        }
                        i31 |= i36;
                    }
                    if ((i12 & 131072) != 0) {
                        i31 |= 12582912;
                    } else if ((i11 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(this)) {
                            i37 = 8388608;
                        } else {
                            i37 = 4194304;
                        }
                        i31 |= i37;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        } else {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                        }
                        int i311112 = i13;
                        int i411111111111112 = i311112 << 3;
                        int i411111111111113 = i311112 >> 3;
                        int i411111111111114 = i311112 >> 9;
                        int i411111111111115 = i31 << 21;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i411111111111112 & 896) | (i411111111111112 & 112) | 6 | (i411111111111113 & 7168) | (i411111111111114 & 57344) | (i411111111111114 & 458752) | (i411111111111114 & 3670016) | (i411111111111115 & 29360128) | (234881024 & i411111111111115) | (i411111111111115 & 1879048192), ((i31 >> 9) & 14) | ((i311112 >> 6) & 112) | (i311112 & 896) | (i411111111111114 & 7168) | (i411111111111113 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function23 = function19;
                        function24 = function20;
                        function25 = function16;
                        function26 = function17;
                        function27 = function18;
                        function28 = function21;
                        function29 = function22;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function30 = function2ComposableLambda;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        } else {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                        }
                        int i311113 = i13;
                        int i411111111111116 = i311113 << 3;
                        int i411111111111117 = i311113 >> 3;
                        int i411111111111118 = i311113 >> 9;
                        int i411111111111119 = i31 << 21;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i411111111111116 & 896) | (i411111111111116 & 112) | 6 | (i411111111111117 & 7168) | (i411111111111118 & 57344) | (i411111111111118 & 458752) | (i411111111111118 & 3670016) | (i411111111111119 & 29360128) | (234881024 & i411111111111119) | (i411111111111119 & 1879048192), ((i31 >> 9) & 14) | ((i311113 >> 6) & 112) | (i311113 & 896) | (i411111111111118 & 7168) | (i411111111111117 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function23 = function19;
                        function24 = function20;
                        function25 = function16;
                        function26 = function17;
                        function27 = function18;
                        function28 = function21;
                        function29 = function22;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function30 = function2ComposableLambda;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
                }
                i31 |= BluetoothState.REQUEST_CONNECT_DEVICE;
                i34 = i12 & 8192;
                if (i34 != 0) {
                    if ((i11 & 7168) == 0) {
                        i31 |= composerStartRestartGroup.changedInstance(function8) ? 2048 : 1024;
                    }
                    if ((i11 & 57344) != 0) {
                        if ((i12 & 16384) == 0) {
                            i15 = 16384;
                        }
                        i31 |= i15;
                    }
                    if ((i11 & 458752) != 0) {
                        if ((i12 & 32768) == 0) {
                            i38 = 65536;
                        } else {
                            i38 = 65536;
                        }
                        i31 |= i38;
                    }
                    i35 = i12 & 65536;
                    if (i35 != 0) {
                        i31 |= 1572864;
                    } else if ((i11 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function9)) {
                            i36 = 1048576;
                        } else {
                            i36 = 524288;
                        }
                        i31 |= i36;
                    }
                    if ((i12 & 131072) != 0) {
                        i31 |= 12582912;
                    } else if ((i11 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(this)) {
                            i37 = 8388608;
                        } else {
                            i37 = 4194304;
                        }
                        i31 |= i37;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        } else {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                        }
                        int i311114 = i13;
                        int i4111111111111110 = i311114 << 3;
                        int i4111111111111111 = i311114 >> 3;
                        int i4111111111111112 = i311114 >> 9;
                        int i4111111111111113 = i31 << 21;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i4111111111111110 & 896) | (i4111111111111110 & 112) | 6 | (i4111111111111111 & 7168) | (i4111111111111112 & 57344) | (i4111111111111112 & 458752) | (i4111111111111112 & 3670016) | (i4111111111111113 & 29360128) | (234881024 & i4111111111111113) | (i4111111111111113 & 1879048192), ((i31 >> 9) & 14) | ((i311114 >> 6) & 112) | (i311114 & 896) | (i4111111111111112 & 7168) | (i4111111111111111 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function23 = function19;
                        function24 = function20;
                        function25 = function16;
                        function26 = function17;
                        function27 = function18;
                        function28 = function21;
                        function29 = function22;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function30 = function2ComposableLambda;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        } else {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                        }
                        int i311115 = i13;
                        int i4111111111111114 = i311115 << 3;
                        int i4111111111111115 = i311115 >> 3;
                        int i4111111111111116 = i311115 >> 9;
                        int i4111111111111117 = i31 << 21;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i4111111111111114 & 896) | (i4111111111111114 & 112) | 6 | (i4111111111111115 & 7168) | (i4111111111111116 & 57344) | (i4111111111111116 & 458752) | (i4111111111111116 & 3670016) | (i4111111111111117 & 29360128) | (234881024 & i4111111111111117) | (i4111111111111117 & 1879048192), ((i31 >> 9) & 14) | ((i311115 >> 6) & 112) | (i311115 & 896) | (i4111111111111116 & 7168) | (i4111111111111115 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function23 = function19;
                        function24 = function20;
                        function25 = function16;
                        function26 = function17;
                        function27 = function18;
                        function28 = function21;
                        function29 = function22;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function30 = function2ComposableLambda;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
                }
                i31 |= 3072;
                if ((i11 & 57344) != 0) {
                    if ((i12 & 16384) == 0) {
                        i15 = 16384;
                    }
                    i31 |= i15;
                }
                if ((i11 & 458752) != 0) {
                    if ((i12 & 32768) == 0) {
                        i38 = 65536;
                    } else {
                        i38 = 65536;
                    }
                    i31 |= i38;
                }
                i35 = i12 & 65536;
                if (i35 != 0) {
                    i31 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function9)) {
                        i36 = 1048576;
                    } else {
                        i36 = 524288;
                    }
                    i31 |= i36;
                }
                if ((i12 & 131072) != 0) {
                    i31 |= 12582912;
                } else if ((i11 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i37 = 8388608;
                    } else {
                        i37 = 4194304;
                    }
                    i31 |= i37;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    } else {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                    }
                    int i311116 = i13;
                    int i4111111111111118 = i311116 << 3;
                    int i4111111111111119 = i311116 >> 3;
                    int i41111111111111110 = i311116 >> 9;
                    int i41111111111111111 = i31 << 21;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i4111111111111118 & 896) | (i4111111111111118 & 112) | 6 | (i4111111111111119 & 7168) | (i41111111111111110 & 57344) | (i41111111111111110 & 458752) | (i41111111111111110 & 3670016) | (i41111111111111111 & 29360128) | (234881024 & i41111111111111111) | (i41111111111111111 & 1879048192), ((i31 >> 9) & 14) | ((i311116 >> 6) & 112) | (i311116 & 896) | (i41111111111111110 & 7168) | (i4111111111111119 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function23 = function19;
                    function24 = function20;
                    function25 = function16;
                    function26 = function17;
                    function27 = function18;
                    function28 = function21;
                    function29 = function22;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function30 = function2ComposableLambda;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    } else {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                    }
                    int i311117 = i13;
                    int i41111111111111112 = i311117 << 3;
                    int i41111111111111113 = i311117 >> 3;
                    int i41111111111111114 = i311117 >> 9;
                    int i41111111111111115 = i31 << 21;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i41111111111111112 & 896) | (i41111111111111112 & 112) | 6 | (i41111111111111113 & 7168) | (i41111111111111114 & 57344) | (i41111111111111114 & 458752) | (i41111111111111114 & 3670016) | (i41111111111111115 & 29360128) | (234881024 & i41111111111111115) | (i41111111111111115 & 1879048192), ((i31 >> 9) & 14) | ((i311117 >> 6) & 112) | (i311117 & 896) | (i41111111111111114 & 7168) | (i41111111111111113 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function23 = function19;
                    function24 = function20;
                    function25 = function16;
                    function26 = function17;
                    function27 = function18;
                    function28 = function21;
                    function29 = function22;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function30 = function2ComposableLambda;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
            }
            i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i13 |= i17;
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z12)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i13 |= i19;
            }
            i20 = i12 & 128;
            if (i20 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i13 |= i21;
            }
            i22 = i12 & 256;
            if (i22 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i23 = 33554432;
                }
                i13 |= i23;
            }
            i24 = i12 & 512;
            if (i24 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i25 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i25 = 268435456;
                }
                i13 |= i25;
            }
            i26 = i12 & 1024;
            if (i26 != 0) {
                i27 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i11 | i28;
            } else {
                i27 = i11;
            }
            i29 = i12 & 2048;
            if (i29 != 0) {
                i27 |= 48;
            } else if ((i11 & 112) == 0) {
                if (composerStartRestartGroup.changedInstance(function6)) {
                    i30 = 32;
                } else {
                    i30 = 16;
                }
                i27 |= i30;
            }
            i31 = i27;
            i32 = i12 & 4096;
            if (i32 != 0) {
                if ((i11 & 896) == 0) {
                    if (composerStartRestartGroup.changedInstance(function7)) {
                        i33 = 256;
                    } else {
                        i33 = 128;
                    }
                    i31 |= i33;
                }
                i34 = i12 & 8192;
                if (i34 != 0) {
                    if ((i11 & 7168) == 0) {
                        i31 |= composerStartRestartGroup.changedInstance(function8) ? 2048 : 1024;
                    }
                    if ((i11 & 57344) != 0) {
                        if ((i12 & 16384) == 0) {
                            i15 = 16384;
                        }
                        i31 |= i15;
                    }
                    if ((i11 & 458752) != 0) {
                        if ((i12 & 32768) == 0) {
                            i38 = 65536;
                        } else {
                            i38 = 65536;
                        }
                        i31 |= i38;
                    }
                    i35 = i12 & 65536;
                    if (i35 != 0) {
                        i31 |= 1572864;
                    } else if ((i11 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function9)) {
                            i36 = 1048576;
                        } else {
                            i36 = 524288;
                        }
                        i31 |= i36;
                    }
                    if ((i12 & 131072) != 0) {
                        i31 |= 12582912;
                    } else if ((i11 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(this)) {
                            i37 = 8388608;
                        } else {
                            i37 = 4194304;
                        }
                        i31 |= i37;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        } else {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                        }
                        int i311118 = i13;
                        int i41111111111111116 = i311118 << 3;
                        int i41111111111111117 = i311118 >> 3;
                        int i41111111111111118 = i311118 >> 9;
                        int i41111111111111119 = i31 << 21;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i41111111111111116 & 896) | (i41111111111111116 & 112) | 6 | (i41111111111111117 & 7168) | (i41111111111111118 & 57344) | (i41111111111111118 & 458752) | (i41111111111111118 & 3670016) | (i41111111111111119 & 29360128) | (234881024 & i41111111111111119) | (i41111111111111119 & 1879048192), ((i31 >> 9) & 14) | ((i311118 >> 6) & 112) | (i311118 & 896) | (i41111111111111118 & 7168) | (i41111111111111117 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function23 = function19;
                        function24 = function20;
                        function25 = function16;
                        function26 = function17;
                        function27 = function18;
                        function28 = function21;
                        function29 = function22;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function30 = function2ComposableLambda;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        } else {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                        }
                        int i311119 = i13;
                        int i411111111111111110 = i311119 << 3;
                        int i411111111111111111 = i311119 >> 3;
                        int i411111111111111112 = i311119 >> 9;
                        int i411111111111111113 = i31 << 21;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i411111111111111110 & 896) | (i411111111111111110 & 112) | 6 | (i411111111111111111 & 7168) | (i411111111111111112 & 57344) | (i411111111111111112 & 458752) | (i411111111111111112 & 3670016) | (i411111111111111113 & 29360128) | (234881024 & i411111111111111113) | (i411111111111111113 & 1879048192), ((i31 >> 9) & 14) | ((i311119 >> 6) & 112) | (i311119 & 896) | (i411111111111111112 & 7168) | (i411111111111111111 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function23 = function19;
                        function24 = function20;
                        function25 = function16;
                        function26 = function17;
                        function27 = function18;
                        function28 = function21;
                        function29 = function22;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function30 = function2ComposableLambda;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
                }
                i31 |= 3072;
                if ((i11 & 57344) != 0) {
                    if ((i12 & 16384) == 0) {
                        i15 = 16384;
                    }
                    i31 |= i15;
                }
                if ((i11 & 458752) != 0) {
                    if ((i12 & 32768) == 0) {
                        i38 = 65536;
                    } else {
                        i38 = 65536;
                    }
                    i31 |= i38;
                }
                i35 = i12 & 65536;
                if (i35 != 0) {
                    i31 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function9)) {
                        i36 = 1048576;
                    } else {
                        i36 = 524288;
                    }
                    i31 |= i36;
                }
                if ((i12 & 131072) != 0) {
                    i31 |= 12582912;
                } else if ((i11 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i37 = 8388608;
                    } else {
                        i37 = 4194304;
                    }
                    i31 |= i37;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    } else {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                    }
                    int i3111110 = i13;
                    int i411111111111111114 = i3111110 << 3;
                    int i411111111111111115 = i3111110 >> 3;
                    int i411111111111111116 = i3111110 >> 9;
                    int i411111111111111117 = i31 << 21;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i411111111111111114 & 896) | (i411111111111111114 & 112) | 6 | (i411111111111111115 & 7168) | (i411111111111111116 & 57344) | (i411111111111111116 & 458752) | (i411111111111111116 & 3670016) | (i411111111111111117 & 29360128) | (234881024 & i411111111111111117) | (i411111111111111117 & 1879048192), ((i31 >> 9) & 14) | ((i3111110 >> 6) & 112) | (i3111110 & 896) | (i411111111111111116 & 7168) | (i411111111111111115 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function23 = function19;
                    function24 = function20;
                    function25 = function16;
                    function26 = function17;
                    function27 = function18;
                    function28 = function21;
                    function29 = function22;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function30 = function2ComposableLambda;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    } else {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                    }
                    int i3111111 = i13;
                    int i411111111111111118 = i3111111 << 3;
                    int i411111111111111119 = i3111111 >> 3;
                    int i4111111111111111110 = i3111111 >> 9;
                    int i4111111111111111111 = i31 << 21;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i411111111111111118 & 896) | (i411111111111111118 & 112) | 6 | (i411111111111111119 & 7168) | (i4111111111111111110 & 57344) | (i4111111111111111110 & 458752) | (i4111111111111111110 & 3670016) | (i4111111111111111111 & 29360128) | (234881024 & i4111111111111111111) | (i4111111111111111111 & 1879048192), ((i31 >> 9) & 14) | ((i3111111 >> 6) & 112) | (i3111111 & 896) | (i4111111111111111110 & 7168) | (i411111111111111119 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function23 = function19;
                    function24 = function20;
                    function25 = function16;
                    function26 = function17;
                    function27 = function18;
                    function28 = function21;
                    function29 = function22;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function30 = function2ComposableLambda;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
            }
            i31 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            i34 = i12 & 8192;
            if (i34 != 0) {
                if ((i11 & 7168) == 0) {
                    i31 |= composerStartRestartGroup.changedInstance(function8) ? 2048 : 1024;
                }
                if ((i11 & 57344) != 0) {
                    if ((i12 & 16384) == 0) {
                        i15 = 16384;
                    }
                    i31 |= i15;
                }
                if ((i11 & 458752) != 0) {
                    if ((i12 & 32768) == 0) {
                        i38 = 65536;
                    } else {
                        i38 = 65536;
                    }
                    i31 |= i38;
                }
                i35 = i12 & 65536;
                if (i35 != 0) {
                    i31 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function9)) {
                        i36 = 1048576;
                    } else {
                        i36 = 524288;
                    }
                    i31 |= i36;
                }
                if ((i12 & 131072) != 0) {
                    i31 |= 12582912;
                } else if ((i11 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i37 = 8388608;
                    } else {
                        i37 = 4194304;
                    }
                    i31 |= i37;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    } else {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                    }
                    int i3111112 = i13;
                    int i4111111111111111112 = i3111112 << 3;
                    int i4111111111111111113 = i3111112 >> 3;
                    int i4111111111111111114 = i3111112 >> 9;
                    int i4111111111111111115 = i31 << 21;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i4111111111111111112 & 896) | (i4111111111111111112 & 112) | 6 | (i4111111111111111113 & 7168) | (i4111111111111111114 & 57344) | (i4111111111111111114 & 458752) | (i4111111111111111114 & 3670016) | (i4111111111111111115 & 29360128) | (234881024 & i4111111111111111115) | (i4111111111111111115 & 1879048192), ((i31 >> 9) & 14) | ((i3111112 >> 6) & 112) | (i3111112 & 896) | (i4111111111111111114 & 7168) | (i4111111111111111113 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function23 = function19;
                    function24 = function20;
                    function25 = function16;
                    function26 = function17;
                    function27 = function18;
                    function28 = function21;
                    function29 = function22;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function30 = function2ComposableLambda;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    } else {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                    }
                    int i3111113 = i13;
                    int i4111111111111111116 = i3111113 << 3;
                    int i4111111111111111117 = i3111113 >> 3;
                    int i4111111111111111118 = i3111113 >> 9;
                    int i4111111111111111119 = i31 << 21;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i4111111111111111116 & 896) | (i4111111111111111116 & 112) | 6 | (i4111111111111111117 & 7168) | (i4111111111111111118 & 57344) | (i4111111111111111118 & 458752) | (i4111111111111111118 & 3670016) | (i4111111111111111119 & 29360128) | (234881024 & i4111111111111111119) | (i4111111111111111119 & 1879048192), ((i31 >> 9) & 14) | ((i3111113 >> 6) & 112) | (i3111113 & 896) | (i4111111111111111118 & 7168) | (i4111111111111111117 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function23 = function19;
                    function24 = function20;
                    function25 = function16;
                    function26 = function17;
                    function27 = function18;
                    function28 = function21;
                    function29 = function22;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function30 = function2ComposableLambda;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
            }
            i31 |= 3072;
            if ((i11 & 57344) != 0) {
                if ((i12 & 16384) == 0) {
                    i15 = 16384;
                }
                i31 |= i15;
            }
            if ((i11 & 458752) != 0) {
                if ((i12 & 32768) == 0) {
                    i38 = 65536;
                } else {
                    i38 = 65536;
                }
                i31 |= i38;
            }
            i35 = i12 & 65536;
            if (i35 != 0) {
                i31 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function9)) {
                    i36 = 1048576;
                } else {
                    i36 = 524288;
                }
                i31 |= i36;
            }
            if ((i12 & 131072) != 0) {
                i31 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i37 = 8388608;
                } else {
                    i37 = 4194304;
                }
                i31 |= i37;
            }
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i20 != 0) {
                        function10 = null;
                    } else {
                        function10 = function2;
                    }
                    if (i22 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i24 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i26 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i29 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i32 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i34 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                        i31 &= -57345;
                    } else {
                        textFieldColorsM1193colors0hiis_0 = textFieldColors;
                    }
                    if ((i12 & 32768) != 0) {
                        paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i31 &= -458753;
                    } else {
                        paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                    }
                    function16 = function12;
                    if (i35 != 0) {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                    } else {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = function9;
                    }
                    function19 = function10;
                    function20 = function11;
                    function21 = function15;
                    z14 = z13;
                    textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                    function22 = function31;
                    paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                } else {
                    if (i18 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i20 != 0) {
                        function10 = null;
                    } else {
                        function10 = function2;
                    }
                    if (i22 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i24 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i26 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i29 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i32 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i34 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                        i31 &= -57345;
                    } else {
                        textFieldColorsM1193colors0hiis_0 = textFieldColors;
                    }
                    if ((i12 & 32768) != 0) {
                        paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i31 &= -458753;
                    } else {
                        paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                    }
                    function16 = function12;
                    if (i35 != 0) {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                    } else {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = function9;
                    }
                    function19 = function10;
                    function20 = function11;
                    function21 = function15;
                    z14 = z13;
                    textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                    function22 = function31;
                    paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                }
                int i3111114 = i13;
                int i41111111111111111110 = i3111114 << 3;
                int i41111111111111111111 = i3111114 >> 3;
                int i41111111111111111112 = i3111114 >> 9;
                int i41111111111111111113 = i31 << 21;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i41111111111111111110 & 896) | (i41111111111111111110 & 112) | 6 | (i41111111111111111111 & 7168) | (i41111111111111111112 & 57344) | (i41111111111111111112 & 458752) | (i41111111111111111112 & 3670016) | (i41111111111111111113 & 29360128) | (234881024 & i41111111111111111113) | (i41111111111111111113 & 1879048192), ((i31 >> 9) & 14) | ((i3111114 >> 6) & 112) | (i3111114 & 896) | (i41111111111111111112 & 7168) | (i41111111111111111111 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function23 = function19;
                function24 = function20;
                function25 = function16;
                function26 = function17;
                function27 = function18;
                function28 = function21;
                function29 = function22;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
                function30 = function2ComposableLambda;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i20 != 0) {
                        function10 = null;
                    } else {
                        function10 = function2;
                    }
                    if (i22 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i24 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i26 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i29 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i32 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i34 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                        i31 &= -57345;
                    } else {
                        textFieldColorsM1193colors0hiis_0 = textFieldColors;
                    }
                    if ((i12 & 32768) != 0) {
                        paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i31 &= -458753;
                    } else {
                        paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                    }
                    function16 = function12;
                    if (i35 != 0) {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                    } else {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = function9;
                    }
                    function19 = function10;
                    function20 = function11;
                    function21 = function15;
                    z14 = z13;
                    textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                    function22 = function31;
                    paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                } else {
                    if (i18 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i20 != 0) {
                        function10 = null;
                    } else {
                        function10 = function2;
                    }
                    if (i22 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i24 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i26 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i29 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i32 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i34 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                        i31 &= -57345;
                    } else {
                        textFieldColorsM1193colors0hiis_0 = textFieldColors;
                    }
                    if ((i12 & 32768) != 0) {
                        paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i31 &= -458753;
                    } else {
                        paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                    }
                    function16 = function12;
                    if (i35 != 0) {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                    } else {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = function9;
                    }
                    function19 = function10;
                    function20 = function11;
                    function21 = function15;
                    z14 = z13;
                    textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                    function22 = function31;
                    paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                }
                int i3111115 = i13;
                int i41111111111111111114 = i3111115 << 3;
                int i41111111111111111115 = i3111115 >> 3;
                int i41111111111111111116 = i3111115 >> 9;
                int i41111111111111111117 = i31 << 21;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i41111111111111111114 & 896) | (i41111111111111111114 & 112) | 6 | (i41111111111111111115 & 7168) | (i41111111111111111116 & 57344) | (i41111111111111111116 & 458752) | (i41111111111111111116 & 3670016) | (i41111111111111111117 & 29360128) | (234881024 & i41111111111111111117) | (i41111111111111111117 & 1879048192), ((i31 >> 9) & 14) | ((i3111115 >> 6) & 112) | (i3111115 & 896) | (i41111111111111111116 & 7168) | (i41111111111111111115 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function23 = function19;
                function24 = function20;
                function25 = function16;
                function26 = function17;
                function27 = function18;
                function28 = function21;
                function29 = function22;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
                function30 = function2ComposableLambda;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
        }
        i13 |= 3072;
        i15 = 8192;
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i10 & 57344) == 0) {
            if (composerStartRestartGroup.changed(visualTransformation)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i13 |= i16;
        }
        if ((i12 & 32) != 0) {
            if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(interactionSource)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
            }
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z12)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i13 |= i19;
            }
            i20 = i12 & 128;
            if (i20 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i13 |= i21;
            }
            i22 = i12 & 256;
            if (i22 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i23 = 33554432;
                }
                i13 |= i23;
            }
            i24 = i12 & 512;
            if (i24 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i25 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i25 = 268435456;
                }
                i13 |= i25;
            }
            i26 = i12 & 1024;
            if (i26 != 0) {
                i27 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i28 = 4;
                } else {
                    i28 = 2;
                }
                i27 = i11 | i28;
            } else {
                i27 = i11;
            }
            i29 = i12 & 2048;
            if (i29 != 0) {
                i27 |= 48;
            } else if ((i11 & 112) == 0) {
                if (composerStartRestartGroup.changedInstance(function6)) {
                    i30 = 32;
                } else {
                    i30 = 16;
                }
                i27 |= i30;
            }
            i31 = i27;
            i32 = i12 & 4096;
            if (i32 != 0) {
                if ((i11 & 896) == 0) {
                    if (composerStartRestartGroup.changedInstance(function7)) {
                        i33 = 256;
                    } else {
                        i33 = 128;
                    }
                    i31 |= i33;
                }
                i34 = i12 & 8192;
                if (i34 != 0) {
                    if ((i11 & 7168) == 0) {
                        i31 |= composerStartRestartGroup.changedInstance(function8) ? 2048 : 1024;
                    }
                    if ((i11 & 57344) != 0) {
                        if ((i12 & 16384) == 0) {
                            i15 = 16384;
                        }
                        i31 |= i15;
                    }
                    if ((i11 & 458752) != 0) {
                        if ((i12 & 32768) == 0) {
                            i38 = 65536;
                        } else {
                            i38 = 65536;
                        }
                        i31 |= i38;
                    }
                    i35 = i12 & 65536;
                    if (i35 != 0) {
                        i31 |= 1572864;
                    } else if ((i11 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function9)) {
                            i36 = 1048576;
                        } else {
                            i36 = 524288;
                        }
                        i31 |= i36;
                    }
                    if ((i12 & 131072) != 0) {
                        i31 |= 12582912;
                    } else if ((i11 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(this)) {
                            i37 = 8388608;
                        } else {
                            i37 = 4194304;
                        }
                        i31 |= i37;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        } else {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                        }
                        int i3111116 = i13;
                        int i41111111111111111118 = i3111116 << 3;
                        int i41111111111111111119 = i3111116 >> 3;
                        int i411111111111111111110 = i3111116 >> 9;
                        int i411111111111111111111 = i31 << 21;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i41111111111111111118 & 896) | (i41111111111111111118 & 112) | 6 | (i41111111111111111119 & 7168) | (i411111111111111111110 & 57344) | (i411111111111111111110 & 458752) | (i411111111111111111110 & 3670016) | (i411111111111111111111 & 29360128) | (234881024 & i411111111111111111111) | (i411111111111111111111 & 1879048192), ((i31 >> 9) & 14) | ((i3111116 >> 6) & 112) | (i3111116 & 896) | (i411111111111111111110 & 7168) | (i41111111111111111119 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function23 = function19;
                        function24 = function20;
                        function25 = function16;
                        function26 = function17;
                        function27 = function18;
                        function28 = function21;
                        function29 = function22;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function30 = function2ComposableLambda;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        } else {
                            if (i18 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i20 != 0) {
                                function10 = null;
                            } else {
                                function10 = function2;
                            }
                            if (i22 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i24 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i26 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i29 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i32 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i34 == 0) {
                            }
                            if ((i12 & 16384) != 0) {
                                textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                                i31 &= -57345;
                            } else {
                                textFieldColorsM1193colors0hiis_0 = textFieldColors;
                            }
                            if ((i12 & 32768) != 0) {
                                paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i31 &= -458753;
                            } else {
                                paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                            }
                            function16 = function12;
                            if (i35 != 0) {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                            } else {
                                function17 = function13;
                                function18 = function14;
                                function2ComposableLambda = function9;
                            }
                            function19 = function10;
                            function20 = function11;
                            function21 = function15;
                            z14 = z13;
                            textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                            function22 = function31;
                            paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                        }
                        int i3111117 = i13;
                        int i411111111111111111112 = i3111117 << 3;
                        int i411111111111111111113 = i3111117 >> 3;
                        int i411111111111111111114 = i3111117 >> 9;
                        int i411111111111111111115 = i31 << 21;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i411111111111111111112 & 896) | (i411111111111111111112 & 112) | 6 | (i411111111111111111113 & 7168) | (i411111111111111111114 & 57344) | (i411111111111111111114 & 458752) | (i411111111111111111114 & 3670016) | (i411111111111111111115 & 29360128) | (234881024 & i411111111111111111115) | (i411111111111111111115 & 1879048192), ((i31 >> 9) & 14) | ((i3111117 >> 6) & 112) | (i3111117 & 896) | (i411111111111111111114 & 7168) | (i411111111111111111113 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function23 = function19;
                        function24 = function20;
                        function25 = function16;
                        function26 = function17;
                        function27 = function18;
                        function28 = function21;
                        function29 = function22;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function30 = function2ComposableLambda;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
                }
                i31 |= 3072;
                if ((i11 & 57344) != 0) {
                    if ((i12 & 16384) == 0) {
                        i15 = 16384;
                    }
                    i31 |= i15;
                }
                if ((i11 & 458752) != 0) {
                    if ((i12 & 32768) == 0) {
                        i38 = 65536;
                    } else {
                        i38 = 65536;
                    }
                    i31 |= i38;
                }
                i35 = i12 & 65536;
                if (i35 != 0) {
                    i31 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function9)) {
                        i36 = 1048576;
                    } else {
                        i36 = 524288;
                    }
                    i31 |= i36;
                }
                if ((i12 & 131072) != 0) {
                    i31 |= 12582912;
                } else if ((i11 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i37 = 8388608;
                    } else {
                        i37 = 4194304;
                    }
                    i31 |= i37;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    } else {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                    }
                    int i3111118 = i13;
                    int i411111111111111111116 = i3111118 << 3;
                    int i411111111111111111117 = i3111118 >> 3;
                    int i411111111111111111118 = i3111118 >> 9;
                    int i411111111111111111119 = i31 << 21;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i411111111111111111116 & 896) | (i411111111111111111116 & 112) | 6 | (i411111111111111111117 & 7168) | (i411111111111111111118 & 57344) | (i411111111111111111118 & 458752) | (i411111111111111111118 & 3670016) | (i411111111111111111119 & 29360128) | (234881024 & i411111111111111111119) | (i411111111111111111119 & 1879048192), ((i31 >> 9) & 14) | ((i3111118 >> 6) & 112) | (i3111118 & 896) | (i411111111111111111118 & 7168) | (i411111111111111111117 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function23 = function19;
                    function24 = function20;
                    function25 = function16;
                    function26 = function17;
                    function27 = function18;
                    function28 = function21;
                    function29 = function22;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function30 = function2ComposableLambda;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    } else {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                    }
                    int i3111119 = i13;
                    int i4111111111111111111110 = i3111119 << 3;
                    int i4111111111111111111111 = i3111119 >> 3;
                    int i4111111111111111111112 = i3111119 >> 9;
                    int i4111111111111111111113 = i31 << 21;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i4111111111111111111110 & 896) | (i4111111111111111111110 & 112) | 6 | (i4111111111111111111111 & 7168) | (i4111111111111111111112 & 57344) | (i4111111111111111111112 & 458752) | (i4111111111111111111112 & 3670016) | (i4111111111111111111113 & 29360128) | (234881024 & i4111111111111111111113) | (i4111111111111111111113 & 1879048192), ((i31 >> 9) & 14) | ((i3111119 >> 6) & 112) | (i3111119 & 896) | (i4111111111111111111112 & 7168) | (i4111111111111111111111 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function23 = function19;
                    function24 = function20;
                    function25 = function16;
                    function26 = function17;
                    function27 = function18;
                    function28 = function21;
                    function29 = function22;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function30 = function2ComposableLambda;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
            }
            i31 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            i34 = i12 & 8192;
            if (i34 != 0) {
                if ((i11 & 7168) == 0) {
                    i31 |= composerStartRestartGroup.changedInstance(function8) ? 2048 : 1024;
                }
                if ((i11 & 57344) != 0) {
                    if ((i12 & 16384) == 0) {
                        i15 = 16384;
                    }
                    i31 |= i15;
                }
                if ((i11 & 458752) != 0) {
                    if ((i12 & 32768) == 0) {
                        i38 = 65536;
                    } else {
                        i38 = 65536;
                    }
                    i31 |= i38;
                }
                i35 = i12 & 65536;
                if (i35 != 0) {
                    i31 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function9)) {
                        i36 = 1048576;
                    } else {
                        i36 = 524288;
                    }
                    i31 |= i36;
                }
                if ((i12 & 131072) != 0) {
                    i31 |= 12582912;
                } else if ((i11 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i37 = 8388608;
                    } else {
                        i37 = 4194304;
                    }
                    i31 |= i37;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    } else {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                    }
                    int i31111110 = i13;
                    int i4111111111111111111114 = i31111110 << 3;
                    int i4111111111111111111115 = i31111110 >> 3;
                    int i4111111111111111111116 = i31111110 >> 9;
                    int i4111111111111111111117 = i31 << 21;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i4111111111111111111114 & 896) | (i4111111111111111111114 & 112) | 6 | (i4111111111111111111115 & 7168) | (i4111111111111111111116 & 57344) | (i4111111111111111111116 & 458752) | (i4111111111111111111116 & 3670016) | (i4111111111111111111117 & 29360128) | (234881024 & i4111111111111111111117) | (i4111111111111111111117 & 1879048192), ((i31 >> 9) & 14) | ((i31111110 >> 6) & 112) | (i31111110 & 896) | (i4111111111111111111116 & 7168) | (i4111111111111111111115 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function23 = function19;
                    function24 = function20;
                    function25 = function16;
                    function26 = function17;
                    function27 = function18;
                    function28 = function21;
                    function29 = function22;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function30 = function2ComposableLambda;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    } else {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                    }
                    int i31111111 = i13;
                    int i4111111111111111111118 = i31111111 << 3;
                    int i4111111111111111111119 = i31111111 >> 3;
                    int i41111111111111111111110 = i31111111 >> 9;
                    int i41111111111111111111111 = i31 << 21;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i4111111111111111111118 & 896) | (i4111111111111111111118 & 112) | 6 | (i4111111111111111111119 & 7168) | (i41111111111111111111110 & 57344) | (i41111111111111111111110 & 458752) | (i41111111111111111111110 & 3670016) | (i41111111111111111111111 & 29360128) | (234881024 & i41111111111111111111111) | (i41111111111111111111111 & 1879048192), ((i31 >> 9) & 14) | ((i31111111 >> 6) & 112) | (i31111111 & 896) | (i41111111111111111111110 & 7168) | (i4111111111111111111119 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function23 = function19;
                    function24 = function20;
                    function25 = function16;
                    function26 = function17;
                    function27 = function18;
                    function28 = function21;
                    function29 = function22;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function30 = function2ComposableLambda;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
            }
            i31 |= 3072;
            if ((i11 & 57344) != 0) {
                if ((i12 & 16384) == 0) {
                    i15 = 16384;
                }
                i31 |= i15;
            }
            if ((i11 & 458752) != 0) {
                if ((i12 & 32768) == 0) {
                    i38 = 65536;
                } else {
                    i38 = 65536;
                }
                i31 |= i38;
            }
            i35 = i12 & 65536;
            if (i35 != 0) {
                i31 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function9)) {
                    i36 = 1048576;
                } else {
                    i36 = 524288;
                }
                i31 |= i36;
            }
            if ((i12 & 131072) != 0) {
                i31 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i37 = 8388608;
                } else {
                    i37 = 4194304;
                }
                i31 |= i37;
            }
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i20 != 0) {
                        function10 = null;
                    } else {
                        function10 = function2;
                    }
                    if (i22 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i24 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i26 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i29 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i32 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i34 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                        i31 &= -57345;
                    } else {
                        textFieldColorsM1193colors0hiis_0 = textFieldColors;
                    }
                    if ((i12 & 32768) != 0) {
                        paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i31 &= -458753;
                    } else {
                        paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                    }
                    function16 = function12;
                    if (i35 != 0) {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                    } else {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = function9;
                    }
                    function19 = function10;
                    function20 = function11;
                    function21 = function15;
                    z14 = z13;
                    textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                    function22 = function31;
                    paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                } else {
                    if (i18 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i20 != 0) {
                        function10 = null;
                    } else {
                        function10 = function2;
                    }
                    if (i22 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i24 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i26 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i29 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i32 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i34 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                        i31 &= -57345;
                    } else {
                        textFieldColorsM1193colors0hiis_0 = textFieldColors;
                    }
                    if ((i12 & 32768) != 0) {
                        paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i31 &= -458753;
                    } else {
                        paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                    }
                    function16 = function12;
                    if (i35 != 0) {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                    } else {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = function9;
                    }
                    function19 = function10;
                    function20 = function11;
                    function21 = function15;
                    z14 = z13;
                    textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                    function22 = function31;
                    paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                }
                int i31111112 = i13;
                int i41111111111111111111112 = i31111112 << 3;
                int i41111111111111111111113 = i31111112 >> 3;
                int i41111111111111111111114 = i31111112 >> 9;
                int i41111111111111111111115 = i31 << 21;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i41111111111111111111112 & 896) | (i41111111111111111111112 & 112) | 6 | (i41111111111111111111113 & 7168) | (i41111111111111111111114 & 57344) | (i41111111111111111111114 & 458752) | (i41111111111111111111114 & 3670016) | (i41111111111111111111115 & 29360128) | (234881024 & i41111111111111111111115) | (i41111111111111111111115 & 1879048192), ((i31 >> 9) & 14) | ((i31111112 >> 6) & 112) | (i31111112 & 896) | (i41111111111111111111114 & 7168) | (i41111111111111111111113 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function23 = function19;
                function24 = function20;
                function25 = function16;
                function26 = function17;
                function27 = function18;
                function28 = function21;
                function29 = function22;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
                function30 = function2ComposableLambda;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i20 != 0) {
                        function10 = null;
                    } else {
                        function10 = function2;
                    }
                    if (i22 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i24 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i26 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i29 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i32 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i34 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                        i31 &= -57345;
                    } else {
                        textFieldColorsM1193colors0hiis_0 = textFieldColors;
                    }
                    if ((i12 & 32768) != 0) {
                        paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i31 &= -458753;
                    } else {
                        paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                    }
                    function16 = function12;
                    if (i35 != 0) {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                    } else {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = function9;
                    }
                    function19 = function10;
                    function20 = function11;
                    function21 = function15;
                    z14 = z13;
                    textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                    function22 = function31;
                    paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                } else {
                    if (i18 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i20 != 0) {
                        function10 = null;
                    } else {
                        function10 = function2;
                    }
                    if (i22 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i24 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i26 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i29 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i32 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i34 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                        i31 &= -57345;
                    } else {
                        textFieldColorsM1193colors0hiis_0 = textFieldColors;
                    }
                    if ((i12 & 32768) != 0) {
                        paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i31 &= -458753;
                    } else {
                        paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                    }
                    function16 = function12;
                    if (i35 != 0) {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                    } else {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = function9;
                    }
                    function19 = function10;
                    function20 = function11;
                    function21 = function15;
                    z14 = z13;
                    textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                    function22 = function31;
                    paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                }
                int i31111113 = i13;
                int i41111111111111111111116 = i31111113 << 3;
                int i41111111111111111111117 = i31111113 >> 3;
                int i41111111111111111111118 = i31111113 >> 9;
                int i41111111111111111111119 = i31 << 21;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i41111111111111111111116 & 896) | (i41111111111111111111116 & 112) | 6 | (i41111111111111111111117 & 7168) | (i41111111111111111111118 & 57344) | (i41111111111111111111118 & 458752) | (i41111111111111111111118 & 3670016) | (i41111111111111111111119 & 29360128) | (234881024 & i41111111111111111111119) | (i41111111111111111111119 & 1879048192), ((i31 >> 9) & 14) | ((i31111113 >> 6) & 112) | (i31111113 & 896) | (i41111111111111111111118 & 7168) | (i41111111111111111111117 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function23 = function19;
                function24 = function20;
                function25 = function16;
                function26 = function17;
                function27 = function18;
                function28 = function21;
                function29 = function22;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
                function30 = function2ComposableLambda;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
        }
        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i13 |= i17;
        i18 = i12 & 64;
        if (i18 != 0) {
            i13 |= 1572864;
        } else if ((i10 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(z12)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i13 |= i19;
        }
        i20 = i12 & 128;
        if (i20 != 0) {
            i13 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i21 = 8388608;
            } else {
                i21 = 4194304;
            }
            i13 |= i21;
        }
        i22 = i12 & 256;
        if (i22 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i23 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i23 = 33554432;
            }
            i13 |= i23;
        }
        i24 = i12 & 512;
        if (i24 != 0) {
            i13 |= 805306368;
        } else if ((i10 & 1879048192) == 0) {
            if (composerStartRestartGroup.changedInstance(function4)) {
                i25 = PKIFailureInfo.duplicateCertReq;
            } else {
                i25 = 268435456;
            }
            i13 |= i25;
        }
        i26 = i12 & 1024;
        if (i26 != 0) {
            i27 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (composerStartRestartGroup.changedInstance(function5)) {
                i28 = 4;
            } else {
                i28 = 2;
            }
            i27 = i11 | i28;
        } else {
            i27 = i11;
        }
        i29 = i12 & 2048;
        if (i29 != 0) {
            i27 |= 48;
        } else if ((i11 & 112) == 0) {
            if (composerStartRestartGroup.changedInstance(function6)) {
                i30 = 32;
            } else {
                i30 = 16;
            }
            i27 |= i30;
        }
        i31 = i27;
        i32 = i12 & 4096;
        if (i32 != 0) {
            if ((i11 & 896) == 0) {
                if (composerStartRestartGroup.changedInstance(function7)) {
                    i33 = 256;
                } else {
                    i33 = 128;
                }
                i31 |= i33;
            }
            i34 = i12 & 8192;
            if (i34 != 0) {
                if ((i11 & 7168) == 0) {
                    i31 |= composerStartRestartGroup.changedInstance(function8) ? 2048 : 1024;
                }
                if ((i11 & 57344) != 0) {
                    if ((i12 & 16384) == 0) {
                        i15 = 16384;
                    }
                    i31 |= i15;
                }
                if ((i11 & 458752) != 0) {
                    if ((i12 & 32768) == 0) {
                        i38 = 65536;
                    } else {
                        i38 = 65536;
                    }
                    i31 |= i38;
                }
                i35 = i12 & 65536;
                if (i35 != 0) {
                    i31 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function9)) {
                        i36 = 1048576;
                    } else {
                        i36 = 524288;
                    }
                    i31 |= i36;
                }
                if ((i12 & 131072) != 0) {
                    i31 |= 12582912;
                } else if ((i11 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i37 = 8388608;
                    } else {
                        i37 = 4194304;
                    }
                    i31 |= i37;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    } else {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                    }
                    int i31111114 = i13;
                    int i411111111111111111111110 = i31111114 << 3;
                    int i411111111111111111111111 = i31111114 >> 3;
                    int i411111111111111111111112 = i31111114 >> 9;
                    int i411111111111111111111113 = i31 << 21;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i411111111111111111111110 & 896) | (i411111111111111111111110 & 112) | 6 | (i411111111111111111111111 & 7168) | (i411111111111111111111112 & 57344) | (i411111111111111111111112 & 458752) | (i411111111111111111111112 & 3670016) | (i411111111111111111111113 & 29360128) | (234881024 & i411111111111111111111113) | (i411111111111111111111113 & 1879048192), ((i31 >> 9) & 14) | ((i31111114 >> 6) & 112) | (i31111114 & 896) | (i411111111111111111111112 & 7168) | (i411111111111111111111111 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function23 = function19;
                    function24 = function20;
                    function25 = function16;
                    function26 = function17;
                    function27 = function18;
                    function28 = function21;
                    function29 = function22;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function30 = function2ComposableLambda;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    } else {
                        if (i18 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i20 != 0) {
                            function10 = null;
                        } else {
                            function10 = function2;
                        }
                        if (i22 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i24 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i26 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i29 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i32 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i34 == 0) {
                        }
                        if ((i12 & 16384) != 0) {
                            textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                            i31 &= -57345;
                        } else {
                            textFieldColorsM1193colors0hiis_0 = textFieldColors;
                        }
                        if ((i12 & 32768) != 0) {
                            paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i31 &= -458753;
                        } else {
                            paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                        }
                        function16 = function12;
                        if (i35 != 0) {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                        } else {
                            function17 = function13;
                            function18 = function14;
                            function2ComposableLambda = function9;
                        }
                        function19 = function10;
                        function20 = function11;
                        function21 = function15;
                        z14 = z13;
                        textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                        function22 = function31;
                        paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                    }
                    int i31111115 = i13;
                    int i411111111111111111111114 = i31111115 << 3;
                    int i411111111111111111111115 = i31111115 >> 3;
                    int i411111111111111111111116 = i31111115 >> 9;
                    int i411111111111111111111117 = i31 << 21;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i411111111111111111111114 & 896) | (i411111111111111111111114 & 112) | 6 | (i411111111111111111111115 & 7168) | (i411111111111111111111116 & 57344) | (i411111111111111111111116 & 458752) | (i411111111111111111111116 & 3670016) | (i411111111111111111111117 & 29360128) | (234881024 & i411111111111111111111117) | (i411111111111111111111117 & 1879048192), ((i31 >> 9) & 14) | ((i31111115 >> 6) & 112) | (i31111115 & 896) | (i411111111111111111111116 & 7168) | (i411111111111111111111115 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function23 = function19;
                    function24 = function20;
                    function25 = function16;
                    function26 = function17;
                    function27 = function18;
                    function28 = function21;
                    function29 = function22;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function30 = function2ComposableLambda;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
            }
            i31 |= 3072;
            if ((i11 & 57344) != 0) {
                if ((i12 & 16384) == 0) {
                    i15 = 16384;
                }
                i31 |= i15;
            }
            if ((i11 & 458752) != 0) {
                if ((i12 & 32768) == 0) {
                    i38 = 65536;
                } else {
                    i38 = 65536;
                }
                i31 |= i38;
            }
            i35 = i12 & 65536;
            if (i35 != 0) {
                i31 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function9)) {
                    i36 = 1048576;
                } else {
                    i36 = 524288;
                }
                i31 |= i36;
            }
            if ((i12 & 131072) != 0) {
                i31 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i37 = 8388608;
                } else {
                    i37 = 4194304;
                }
                i31 |= i37;
            }
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i20 != 0) {
                        function10 = null;
                    } else {
                        function10 = function2;
                    }
                    if (i22 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i24 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i26 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i29 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i32 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i34 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                        i31 &= -57345;
                    } else {
                        textFieldColorsM1193colors0hiis_0 = textFieldColors;
                    }
                    if ((i12 & 32768) != 0) {
                        paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i31 &= -458753;
                    } else {
                        paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                    }
                    function16 = function12;
                    if (i35 != 0) {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                    } else {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = function9;
                    }
                    function19 = function10;
                    function20 = function11;
                    function21 = function15;
                    z14 = z13;
                    textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                    function22 = function31;
                    paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                } else {
                    if (i18 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i20 != 0) {
                        function10 = null;
                    } else {
                        function10 = function2;
                    }
                    if (i22 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i24 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i26 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i29 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i32 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i34 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                        i31 &= -57345;
                    } else {
                        textFieldColorsM1193colors0hiis_0 = textFieldColors;
                    }
                    if ((i12 & 32768) != 0) {
                        paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i31 &= -458753;
                    } else {
                        paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                    }
                    function16 = function12;
                    if (i35 != 0) {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                    } else {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = function9;
                    }
                    function19 = function10;
                    function20 = function11;
                    function21 = function15;
                    z14 = z13;
                    textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                    function22 = function31;
                    paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                }
                int i31111116 = i13;
                int i411111111111111111111118 = i31111116 << 3;
                int i411111111111111111111119 = i31111116 >> 3;
                int i4111111111111111111111110 = i31111116 >> 9;
                int i4111111111111111111111111 = i31 << 21;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i411111111111111111111118 & 896) | (i411111111111111111111118 & 112) | 6 | (i411111111111111111111119 & 7168) | (i4111111111111111111111110 & 57344) | (i4111111111111111111111110 & 458752) | (i4111111111111111111111110 & 3670016) | (i4111111111111111111111111 & 29360128) | (234881024 & i4111111111111111111111111) | (i4111111111111111111111111 & 1879048192), ((i31 >> 9) & 14) | ((i31111116 >> 6) & 112) | (i31111116 & 896) | (i4111111111111111111111110 & 7168) | (i411111111111111111111119 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function23 = function19;
                function24 = function20;
                function25 = function16;
                function26 = function17;
                function27 = function18;
                function28 = function21;
                function29 = function22;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
                function30 = function2ComposableLambda;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i20 != 0) {
                        function10 = null;
                    } else {
                        function10 = function2;
                    }
                    if (i22 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i24 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i26 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i29 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i32 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i34 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                        i31 &= -57345;
                    } else {
                        textFieldColorsM1193colors0hiis_0 = textFieldColors;
                    }
                    if ((i12 & 32768) != 0) {
                        paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i31 &= -458753;
                    } else {
                        paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                    }
                    function16 = function12;
                    if (i35 != 0) {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                    } else {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = function9;
                    }
                    function19 = function10;
                    function20 = function11;
                    function21 = function15;
                    z14 = z13;
                    textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                    function22 = function31;
                    paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                } else {
                    if (i18 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i20 != 0) {
                        function10 = null;
                    } else {
                        function10 = function2;
                    }
                    if (i22 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i24 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i26 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i29 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i32 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i34 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                        i31 &= -57345;
                    } else {
                        textFieldColorsM1193colors0hiis_0 = textFieldColors;
                    }
                    if ((i12 & 32768) != 0) {
                        paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i31 &= -458753;
                    } else {
                        paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                    }
                    function16 = function12;
                    if (i35 != 0) {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                    } else {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = function9;
                    }
                    function19 = function10;
                    function20 = function11;
                    function21 = function15;
                    z14 = z13;
                    textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                    function22 = function31;
                    paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                }
                int i31111117 = i13;
                int i4111111111111111111111112 = i31111117 << 3;
                int i4111111111111111111111113 = i31111117 >> 3;
                int i4111111111111111111111114 = i31111117 >> 9;
                int i4111111111111111111111115 = i31 << 21;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i4111111111111111111111112 & 896) | (i4111111111111111111111112 & 112) | 6 | (i4111111111111111111111113 & 7168) | (i4111111111111111111111114 & 57344) | (i4111111111111111111111114 & 458752) | (i4111111111111111111111114 & 3670016) | (i4111111111111111111111115 & 29360128) | (234881024 & i4111111111111111111111115) | (i4111111111111111111111115 & 1879048192), ((i31 >> 9) & 14) | ((i31111117 >> 6) & 112) | (i31111117 & 896) | (i4111111111111111111111114 & 7168) | (i4111111111111111111111113 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function23 = function19;
                function24 = function20;
                function25 = function16;
                function26 = function17;
                function27 = function18;
                function28 = function21;
                function29 = function22;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
                function30 = function2ComposableLambda;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
        }
        i31 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        i34 = i12 & 8192;
        if (i34 != 0) {
            if ((i11 & 7168) == 0) {
                i31 |= composerStartRestartGroup.changedInstance(function8) ? 2048 : 1024;
            }
            if ((i11 & 57344) != 0) {
                if ((i12 & 16384) == 0) {
                    i15 = 16384;
                }
                i31 |= i15;
            }
            if ((i11 & 458752) != 0) {
                if ((i12 & 32768) == 0) {
                    i38 = 65536;
                } else {
                    i38 = 65536;
                }
                i31 |= i38;
            }
            i35 = i12 & 65536;
            if (i35 != 0) {
                i31 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function9)) {
                    i36 = 1048576;
                } else {
                    i36 = 524288;
                }
                i31 |= i36;
            }
            if ((i12 & 131072) != 0) {
                i31 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i37 = 8388608;
                } else {
                    i37 = 4194304;
                }
                i31 |= i37;
            }
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i20 != 0) {
                        function10 = null;
                    } else {
                        function10 = function2;
                    }
                    if (i22 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i24 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i26 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i29 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i32 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i34 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                        i31 &= -57345;
                    } else {
                        textFieldColorsM1193colors0hiis_0 = textFieldColors;
                    }
                    if ((i12 & 32768) != 0) {
                        paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i31 &= -458753;
                    } else {
                        paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                    }
                    function16 = function12;
                    if (i35 != 0) {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                    } else {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = function9;
                    }
                    function19 = function10;
                    function20 = function11;
                    function21 = function15;
                    z14 = z13;
                    textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                    function22 = function31;
                    paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                } else {
                    if (i18 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i20 != 0) {
                        function10 = null;
                    } else {
                        function10 = function2;
                    }
                    if (i22 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i24 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i26 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i29 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i32 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i34 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                        i31 &= -57345;
                    } else {
                        textFieldColorsM1193colors0hiis_0 = textFieldColors;
                    }
                    if ((i12 & 32768) != 0) {
                        paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i31 &= -458753;
                    } else {
                        paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                    }
                    function16 = function12;
                    if (i35 != 0) {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                    } else {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = function9;
                    }
                    function19 = function10;
                    function20 = function11;
                    function21 = function15;
                    z14 = z13;
                    textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                    function22 = function31;
                    paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                }
                int i31111118 = i13;
                int i4111111111111111111111116 = i31111118 << 3;
                int i4111111111111111111111117 = i31111118 >> 3;
                int i4111111111111111111111118 = i31111118 >> 9;
                int i4111111111111111111111119 = i31 << 21;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i4111111111111111111111116 & 896) | (i4111111111111111111111116 & 112) | 6 | (i4111111111111111111111117 & 7168) | (i4111111111111111111111118 & 57344) | (i4111111111111111111111118 & 458752) | (i4111111111111111111111118 & 3670016) | (i4111111111111111111111119 & 29360128) | (234881024 & i4111111111111111111111119) | (i4111111111111111111111119 & 1879048192), ((i31 >> 9) & 14) | ((i31111118 >> 6) & 112) | (i31111118 & 896) | (i4111111111111111111111118 & 7168) | (i4111111111111111111111117 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function23 = function19;
                function24 = function20;
                function25 = function16;
                function26 = function17;
                function27 = function18;
                function28 = function21;
                function29 = function22;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
                function30 = function2ComposableLambda;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i20 != 0) {
                        function10 = null;
                    } else {
                        function10 = function2;
                    }
                    if (i22 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i24 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i26 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i29 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i32 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i34 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                        i31 &= -57345;
                    } else {
                        textFieldColorsM1193colors0hiis_0 = textFieldColors;
                    }
                    if ((i12 & 32768) != 0) {
                        paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i31 &= -458753;
                    } else {
                        paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                    }
                    function16 = function12;
                    if (i35 != 0) {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                    } else {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = function9;
                    }
                    function19 = function10;
                    function20 = function11;
                    function21 = function15;
                    z14 = z13;
                    textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                    function22 = function31;
                    paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                } else {
                    if (i18 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i20 != 0) {
                        function10 = null;
                    } else {
                        function10 = function2;
                    }
                    if (i22 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i24 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i26 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i29 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i32 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i34 == 0) {
                    }
                    if ((i12 & 16384) != 0) {
                        textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                        i31 &= -57345;
                    } else {
                        textFieldColorsM1193colors0hiis_0 = textFieldColors;
                    }
                    if ((i12 & 32768) != 0) {
                        paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i31 &= -458753;
                    } else {
                        paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                    }
                    function16 = function12;
                    if (i35 != 0) {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                    } else {
                        function17 = function13;
                        function18 = function14;
                        function2ComposableLambda = function9;
                    }
                    function19 = function10;
                    function20 = function11;
                    function21 = function15;
                    z14 = z13;
                    textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                    function22 = function31;
                    paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
                }
                int i31111119 = i13;
                int i41111111111111111111111110 = i31111119 << 3;
                int i41111111111111111111111111 = i31111119 >> 3;
                int i41111111111111111111111112 = i31111119 >> 9;
                int i41111111111111111111111113 = i31 << 21;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i41111111111111111111111110 & 896) | (i41111111111111111111111110 & 112) | 6 | (i41111111111111111111111111 & 7168) | (i41111111111111111111111112 & 57344) | (i41111111111111111111111112 & 458752) | (i41111111111111111111111112 & 3670016) | (i41111111111111111111111113 & 29360128) | (234881024 & i41111111111111111111111113) | (i41111111111111111111111113 & 1879048192), ((i31 >> 9) & 14) | ((i31111119 >> 6) & 112) | (i31111119 & 896) | (i41111111111111111111111112 & 7168) | (i41111111111111111111111111 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function23 = function19;
                function24 = function20;
                function25 = function16;
                function26 = function17;
                function27 = function18;
                function28 = function21;
                function29 = function22;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
                function30 = function2ComposableLambda;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
        }
        i31 |= 3072;
        if ((i11 & 57344) != 0) {
            if ((i12 & 16384) == 0) {
                i15 = 16384;
            }
            i31 |= i15;
        }
        if ((i11 & 458752) != 0) {
            if ((i12 & 32768) == 0) {
                i38 = 65536;
            } else {
                i38 = 65536;
            }
            i31 |= i38;
        }
        i35 = i12 & 65536;
        if (i35 != 0) {
            i31 |= 1572864;
        } else if ((i11 & 3670016) == 0) {
            if (composerStartRestartGroup.changedInstance(function9)) {
                i36 = 1048576;
            } else {
                i36 = 524288;
            }
            i31 |= i36;
        }
        if ((i12 & 131072) != 0) {
            i31 |= 12582912;
        } else if ((i11 & 29360128) == 0) {
            if (composerStartRestartGroup.changed(this)) {
                i37 = 8388608;
            } else {
                i37 = 4194304;
            }
            i31 |= i37;
        }
        if ((i13 & 1533916891) != 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (i20 != 0) {
                    function10 = null;
                } else {
                    function10 = function2;
                }
                if (i22 != 0) {
                    function11 = null;
                } else {
                    function11 = function3;
                }
                if (i24 != 0) {
                    function12 = null;
                } else {
                    function12 = function4;
                }
                if (i26 != 0) {
                    function13 = null;
                } else {
                    function13 = function5;
                }
                if (i29 != 0) {
                    function14 = null;
                } else {
                    function14 = function6;
                }
                if (i32 != 0) {
                    function15 = null;
                } else {
                    function15 = function7;
                }
                if (i34 == 0) {
                }
                if ((i12 & 16384) != 0) {
                    textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                    i31 &= -57345;
                } else {
                    textFieldColorsM1193colors0hiis_0 = textFieldColors;
                }
                if ((i12 & 32768) != 0) {
                    paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    i31 &= -458753;
                } else {
                    paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                }
                function16 = function12;
                if (i35 != 0) {
                    function17 = function13;
                    function18 = function14;
                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                } else {
                    function17 = function13;
                    function18 = function14;
                    function2ComposableLambda = function9;
                }
                function19 = function10;
                function20 = function11;
                function21 = function15;
                z14 = z13;
                textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                function22 = function31;
                paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
            } else {
                if (i18 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (i20 != 0) {
                    function10 = null;
                } else {
                    function10 = function2;
                }
                if (i22 != 0) {
                    function11 = null;
                } else {
                    function11 = function3;
                }
                if (i24 != 0) {
                    function12 = null;
                } else {
                    function12 = function4;
                }
                if (i26 != 0) {
                    function13 = null;
                } else {
                    function13 = function5;
                }
                if (i29 != 0) {
                    function14 = null;
                } else {
                    function14 = function6;
                }
                if (i32 != 0) {
                    function15 = null;
                } else {
                    function15 = function7;
                }
                if (i34 == 0) {
                }
                if ((i12 & 16384) != 0) {
                    textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                    i31 &= -57345;
                } else {
                    textFieldColorsM1193colors0hiis_0 = textFieldColors;
                }
                if ((i12 & 32768) != 0) {
                    paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    i31 &= -458753;
                } else {
                    paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                }
                function16 = function12;
                if (i35 != 0) {
                    function17 = function13;
                    function18 = function14;
                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                } else {
                    function17 = function13;
                    function18 = function14;
                    function2ComposableLambda = function9;
                }
                function19 = function10;
                function20 = function11;
                function21 = function15;
                z14 = z13;
                textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                function22 = function31;
                paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
            }
            int i311111110 = i13;
            int i41111111111111111111111114 = i311111110 << 3;
            int i41111111111111111111111115 = i311111110 >> 3;
            int i41111111111111111111111116 = i311111110 >> 9;
            int i41111111111111111111111117 = i31 << 21;
            composer2 = composerStartRestartGroup;
            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i41111111111111111111111114 & 896) | (i41111111111111111111111114 & 112) | 6 | (i41111111111111111111111115 & 7168) | (i41111111111111111111111116 & 57344) | (i41111111111111111111111116 & 458752) | (i41111111111111111111111116 & 3670016) | (i41111111111111111111111117 & 29360128) | (234881024 & i41111111111111111111111117) | (i41111111111111111111111117 & 1879048192), ((i31 >> 9) & 14) | ((i311111110 >> 6) & 112) | (i311111110 & 896) | (i41111111111111111111111116 & 7168) | (i41111111111111111111111115 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z15 = z14;
            function23 = function19;
            function24 = function20;
            function25 = function16;
            function26 = function17;
            function27 = function18;
            function28 = function21;
            function29 = function22;
            textFieldColors3 = textFieldColors2;
            paddingValues3 = paddingValues2;
            function30 = function2ComposableLambda;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (i20 != 0) {
                    function10 = null;
                } else {
                    function10 = function2;
                }
                if (i22 != 0) {
                    function11 = null;
                } else {
                    function11 = function3;
                }
                if (i24 != 0) {
                    function12 = null;
                } else {
                    function12 = function4;
                }
                if (i26 != 0) {
                    function13 = null;
                } else {
                    function13 = function5;
                }
                if (i29 != 0) {
                    function14 = null;
                } else {
                    function14 = function6;
                }
                if (i32 != 0) {
                    function15 = null;
                } else {
                    function15 = function7;
                }
                if (i34 == 0) {
                }
                if ((i12 & 16384) != 0) {
                    textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                    i31 &= -57345;
                } else {
                    textFieldColorsM1193colors0hiis_0 = textFieldColors;
                }
                if ((i12 & 32768) != 0) {
                    paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    i31 &= -458753;
                } else {
                    paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                }
                function16 = function12;
                if (i35 != 0) {
                    function17 = function13;
                    function18 = function14;
                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                } else {
                    function17 = function13;
                    function18 = function14;
                    function2ComposableLambda = function9;
                }
                function19 = function10;
                function20 = function11;
                function21 = function15;
                z14 = z13;
                textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                function22 = function31;
                paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
            } else {
                if (i18 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (i20 != 0) {
                    function10 = null;
                } else {
                    function10 = function2;
                }
                if (i22 != 0) {
                    function11 = null;
                } else {
                    function11 = function3;
                }
                if (i24 != 0) {
                    function12 = null;
                } else {
                    function12 = function4;
                }
                if (i26 != 0) {
                    function13 = null;
                } else {
                    function13 = function5;
                }
                if (i29 != 0) {
                    function14 = null;
                } else {
                    function14 = function6;
                }
                if (i32 != 0) {
                    function15 = null;
                } else {
                    function15 = function7;
                }
                if (i34 == 0) {
                }
                if ((i12 & 16384) != 0) {
                    textFieldColorsM1193colors0hiis_0 = m1193colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, 0, 0, (i31 >> 12) & 7168, Integer.MAX_VALUE, 4095);
                    i31 &= -57345;
                } else {
                    textFieldColorsM1193colors0hiis_0 = textFieldColors;
                }
                if ((i12 & 32768) != 0) {
                    paddingValuesM1191contentPaddinga9UjIt4$default = m1191contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    i31 &= -458753;
                } else {
                    paddingValuesM1191contentPaddinga9UjIt4$default = paddingValues;
                }
                function16 = function12;
                if (i35 != 0) {
                    function17 = function13;
                    function18 = function14;
                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new b(z10, z13, interactionSource, textFieldColorsM1193colors0hiis_0, i13, i31));
                } else {
                    function17 = function13;
                    function18 = function14;
                    function2ComposableLambda = function9;
                }
                function19 = function10;
                function20 = function11;
                function21 = function15;
                z14 = z13;
                textFieldColors2 = textFieldColorsM1193colors0hiis_0;
                function22 = function31;
                paddingValues2 = paddingValuesM1191contentPaddinga9UjIt4$default;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-350442135, i13, i31, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1637)");
            }
            int i311111111 = i13;
            int i41111111111111111111111118 = i311111111 << 3;
            int i41111111111111111111111119 = i311111111 >> 3;
            int i411111111111111111111111110 = i311111111 >> 9;
            int i411111111111111111111111111 = i31 << 21;
            composer2 = composerStartRestartGroup;
            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function19, function20, function16, function17, function18, function21, function22, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i41111111111111111111111118 & 896) | (i41111111111111111111111118 & 112) | 6 | (i41111111111111111111111119 & 7168) | (i411111111111111111111111110 & 57344) | (i411111111111111111111111110 & 458752) | (i411111111111111111111111110 & 3670016) | (i411111111111111111111111111 & 29360128) | (234881024 & i411111111111111111111111111) | (i411111111111111111111111111 & 1879048192), ((i31 >> 9) & 14) | ((i311111111 >> 6) & 112) | (i311111111 & 896) | (i411111111111111111111111110 & 7168) | (i41111111111111111111111119 & 57344) | (i31 & 458752) | ((i31 << 6) & 3670016) | ((i31 << 3) & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z15 = z14;
            function23 = function19;
            function24 = function20;
            function25 = function16;
            function26 = function17;
            function27 = function18;
            function28 = function21;
            function29 = function22;
            textFieldColors3 = textFieldColors2;
            paddingValues3 = paddingValues2;
            function30 = function2ComposableLambda;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function23, function24, function25, function26, function27, function28, function29, textFieldColors3, paddingValues3, function30, i10, i11, i12));
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: colors-0hiis_0, reason: not valid java name */
    public final TextFieldColors m1193colors0hiis_0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, @Nullable TextSelectionColors textSelectionColors, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, @Nullable Composer composer, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        composer.startReplaceableGroup(1767617725);
        long color = (i15 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusInputColor(), composer, 6) : j10;
        long color2 = (i15 & 2) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputColor(), composer, 6) : j11;
        long jM2507copywmQWz5c$default = (i15 & 4) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long color3 = (i15 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorInputColor(), composer, 6) : j13;
        long jM2543getTransparent0d7_KjU = (i15 & 16) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j14;
        long jM2543getTransparent0d7_KjU2 = (i15 & 32) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j15;
        long jM2543getTransparent0d7_KjU3 = (i15 & 64) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j16;
        long jM2543getTransparent0d7_KjU4 = (i15 & 128) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j17;
        long color4 = (i15 & 256) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j18;
        long color5 = (i15 & 512) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor(), composer, 6) : j19;
        TextSelectionColors textSelectionColors2 = (i15 & 1024) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long color6 = (i15 & 2048) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor(), composer, 6) : j20;
        long color7 = (i15 & 4096) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getOutlineColor(), composer, 6) : j21;
        long jM2507copywmQWz5c$default2 = (i15 & 8192) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long color8 = (i15 & 16384) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor(), composer, 6) : j23;
        long color9 = (32768 & i15) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor(), composer, 6) : j24;
        long color10 = (65536 & i15) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j25;
        long jM2507copywmQWz5c$default3 = (131072 & i15) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long color11 = (262144 & i15) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor(), composer, 6) : j27;
        long color12 = (524288 & i15) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor(), composer, 6) : j28;
        long color13 = (1048576 & i15) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j29;
        long jM2507copywmQWz5c$default4 = (2097152 & i15) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j30;
        long color14 = (4194304 & i15) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor(), composer, 6) : j31;
        long color15 = (8388608 & i15) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor(), composer, 6) : j32;
        long color16 = (16777216 & i15) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getLabelColor(), composer, 6) : j33;
        long jM2507copywmQWz5c$default5 = (33554432 & i15) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j34;
        long color17 = (67108864 & i15) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor(), composer, 6) : j35;
        long color18 = (134217728 & i15) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j36;
        long color19 = (268435456 & i15) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j37;
        long jM2507copywmQWz5c$default6 = (536870912 & i15) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j38;
        long color20 = (i15 & 1073741824) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor(), composer, 6) : j39;
        long color21 = (i16 & 1) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor(), composer, 6) : j40;
        long color22 = (i16 & 2) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getSupportingColor(), composer, 6) : j41;
        long jM2507copywmQWz5c$default7 = (i16 & 4) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j42;
        long color23 = (i16 & 8) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor(), composer, 6) : j43;
        long color24 = (i16 & 16) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j44;
        long color25 = (i16 & 32) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j45;
        long jM2507copywmQWz5c$default8 = (i16 & 64) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j46;
        long color26 = (i16 & 128) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor(), composer, 6) : j47;
        long color27 = (i16 & 256) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j48;
        long color28 = (i16 & 512) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j49;
        long jM2507copywmQWz5c$default9 = (i16 & 1024) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j50;
        long color29 = (i16 & 2048) != 0 ? ColorSchemeKt.toColor(OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor(), composer, 6) : j51;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1767617725, i10, i11, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1478)");
        }
        TextFieldColors textFieldColors = new TextFieldColors(color, color2, jM2507copywmQWz5c$default, color3, jM2543getTransparent0d7_KjU, jM2543getTransparent0d7_KjU2, jM2543getTransparent0d7_KjU3, jM2543getTransparent0d7_KjU4, color4, color5, textSelectionColors2, color6, color7, jM2507copywmQWz5c$default2, color8, color9, color10, jM2507copywmQWz5c$default3, color11, color12, color13, jM2507copywmQWz5c$default4, color14, color15, color16, jM2507copywmQWz5c$default5, color17, color18, color19, jM2507copywmQWz5c$default6, color20, color21, color22, jM2507copywmQWz5c$default7, color23, color24, color25, jM2507copywmQWz5c$default8, color26, color27, color28, jM2507copywmQWz5c$default9, color29, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColors;
    }

    @NotNull
    /* JADX INFO: renamed from: contentPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m1194contentPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m292PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    /* JADX INFO: renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m1195getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1196getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1197getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1066756961);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1066756961, i10, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:1347)");
        }
        Shape shape = ShapesKt.toShape(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* JADX INFO: renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m1198getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }
}
