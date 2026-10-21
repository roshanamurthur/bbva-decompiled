package androidx.compose.material;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.adobe.marketing.mobile.EventDataKeys;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextFieldDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\u0011\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bl\u0010mJM\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJS\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u001f\u001a\u00020\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010!\u001a\u00020\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u001eJ=\u0010#\u001a\u00020\u001c2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010\u001eJç\u0001\u0010<\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020$2\b\b\u0002\u0010(\u001a\u00020$2\b\b\u0002\u0010)\u001a\u00020$2\b\b\u0002\u0010*\u001a\u00020$2\b\b\u0002\u0010+\u001a\u00020$2\b\b\u0002\u0010,\u001a\u00020$2\b\b\u0002\u0010-\u001a\u00020$2\b\b\u0002\u0010.\u001a\u00020$2\b\b\u0002\u0010/\u001a\u00020$2\b\b\u0002\u00100\u001a\u00020$2\b\b\u0002\u00101\u001a\u00020$2\b\b\u0002\u00102\u001a\u00020$2\b\b\u0002\u00103\u001a\u00020$2\b\b\u0002\u00104\u001a\u00020$2\b\b\u0002\u00105\u001a\u00020$2\b\b\u0002\u00106\u001a\u00020$2\b\b\u0002\u00107\u001a\u00020$2\b\b\u0002\u00108\u001a\u00020$2\b\b\u0002\u00109\u001a\u00020$H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;Jç\u0001\u0010B\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020$2\b\b\u0002\u0010(\u001a\u00020$2\b\b\u0002\u0010)\u001a\u00020$2\b\b\u0002\u0010=\u001a\u00020$2\b\b\u0002\u0010>\u001a\u00020$2\b\b\u0002\u0010?\u001a\u00020$2\b\b\u0002\u0010@\u001a\u00020$2\b\b\u0002\u0010.\u001a\u00020$2\b\b\u0002\u0010/\u001a\u00020$2\b\b\u0002\u00100\u001a\u00020$2\b\b\u0002\u00101\u001a\u00020$2\b\b\u0002\u00102\u001a\u00020$2\b\b\u0002\u00103\u001a\u00020$2\b\b\u0002\u00104\u001a\u00020$2\b\b\u0002\u00105\u001a\u00020$2\b\b\u0002\u00106\u001a\u00020$2\b\b\u0002\u00107\u001a\u00020$2\b\b\u0002\u00108\u001a\u00020$2\b\b\u0002\u00109\u001a\u00020$H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bA\u0010;JÄ\u0001\u0010P\u001a\u00020\u00142\u0006\u0010D\u001a\u00020C2\u0011\u0010G\u001a\r\u0012\u0004\u0012\u00020\u00140E¢\u0006\u0002\bF2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\u00032\u0006\u0010J\u001a\u00020I2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0015\b\u0002\u0010K\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010E¢\u0006\u0002\bF2\u0015\b\u0002\u0010L\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010E¢\u0006\u0002\bF2\u0015\b\u0002\u0010M\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010E¢\u0006\u0002\bF2\u0015\b\u0002\u0010N\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010E¢\u0006\u0002\bF2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010O\u001a\u00020\u001cH\u0007¢\u0006\u0004\bP\u0010QJÙ\u0001\u0010S\u001a\u00020\u00142\u0006\u0010D\u001a\u00020C2\u0011\u0010G\u001a\r\u0012\u0004\u0012\u00020\u00140E¢\u0006\u0002\bF2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\u00032\u0006\u0010J\u001a\u00020I2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0015\b\u0002\u0010K\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010E¢\u0006\u0002\bF2\u0015\b\u0002\u0010L\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010E¢\u0006\u0002\bF2\u0015\b\u0002\u0010M\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010E¢\u0006\u0002\bF2\u0015\b\u0002\u0010N\u001a\u000f\u0012\u0004\u0012\u00020\u0014\u0018\u00010E¢\u0006\u0002\bF2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010O\u001a\u00020\u001c2\u0013\b\u0002\u0010R\u001a\r\u0012\u0004\u0012\u00020\u00140E¢\u0006\u0002\bFH\u0007¢\u0006\u0004\bS\u0010TR \u0010Y\u001a\u00020\n8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR \u0010\\\u001a\u00020\n8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bZ\u0010V\u001a\u0004\b[\u0010XR\u0014\u0010^\u001a\u00020]8\u0006X\u0086T¢\u0006\u0006\n\u0004\b^\u0010VR \u0010a\u001a\u00020\n8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b_\u0010V\u001a\u0004\b`\u0010XR \u0010d\u001a\u00020\n8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\bb\u0010V\u001a\u0004\bc\u0010XR\u0014\u0010e\u001a\u00020]8\u0006X\u0086T¢\u0006\u0006\n\u0004\be\u0010VR\u0014\u0010f\u001a\u00020]8\u0006X\u0086T¢\u0006\u0006\n\u0004\bf\u0010VR\u0011\u0010i\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0011\u0010k\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\bj\u0010h\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006n"}, d2 = {"Landroidx/compose/material/TextFieldDefaults;", "", "Landroidx/compose/ui/Modifier;", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/material/TextFieldColors;", "colors", "Landroidx/compose/ui/unit/Dp;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "indicatorLine-gv0btCI", "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;FF)Landroidx/compose/ui/Modifier;", "indicatorLine", "Landroidx/compose/ui/graphics/Shape;", "shape", "focusedBorderThickness", "unfocusedBorderThickness", "", "BorderBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "BorderBox", EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "top", "bottom", "Landroidx/compose/foundation/layout/PaddingValues;", "textFieldWithLabelPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "textFieldWithLabelPadding", "textFieldWithoutLabelPadding-a9UjIt4", "textFieldWithoutLabelPadding", "outlinedTextFieldPadding-a9UjIt4", "outlinedTextFieldPadding", "Landroidx/compose/ui/graphics/Color;", "textColor", "disabledTextColor", "backgroundColor", "cursorColor", "errorCursorColor", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "leadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "trailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "textFieldColors-dx8h9Zs", "(JJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material/TextFieldColors;", "textFieldColors", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "outlinedTextFieldColors-dx8h9Zs", "outlinedTextFieldColors", "", "value", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "innerTextField", "singleLine", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "label", "placeholder", "leadingIcon", "trailingIcon", "contentPadding", "TextFieldDecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;III)V", OutlinedTextFieldKt.BorderId, "OutlinedTextFieldDecorationBox", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "a", "F", "getMinHeight-D9Ej5fM", "()F", "MinHeight", "b", "getMinWidth-D9Ej5fM", "MinWidth", "", "IconOpacity", "c", "getUnfocusedBorderThickness-D9Ej5fM", "UnfocusedBorderThickness", "d", "getFocusedBorderThickness-D9Ej5fM", "FocusedBorderThickness", "BackgroundOpacity", "UnfocusedIndicatorLineOpacity", "getTextFieldShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "TextFieldShape", "getOutlinedTextFieldShape", "OutlinedTextFieldShape", "<init>", "()V", "material_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaults\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,855:1\n135#2:856\n76#3:857\n76#3:858\n154#4:859\n154#4:860\n154#4:861\n154#4:862\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/TextFieldDefaults\n*L\n273#1:856\n378#1:857\n436#1:858\n196#1:859\n202#1:860\n231#1:861\n237#1:862\n*E\n"})
public final class TextFieldDefaults {
    public static final int $stable = 0;
    public static final float BackgroundOpacity = 0.12f;
    public static final float IconOpacity = 0.54f;
    public static final float UnfocusedIndicatorLineOpacity = 0.42f;

    @NotNull
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();

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
        public final /* synthetic */ boolean f8134q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f8135r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ InteractionSource f8136s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ TextFieldColors f8137t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Shape f8138u0;
        public final /* synthetic */ float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ float f8139w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f8140x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f8141y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, boolean z11, InteractionSource interactionSource, TextFieldColors textFieldColors, Shape shape, float f6, float f10, int i10, int i11) {
            super(2);
            this.f8134q0 = z10;
            this.f8135r0 = z11;
            this.f8136s0 = interactionSource;
            this.f8137t0 = textFieldColors;
            this.f8138u0 = shape;
            this.v0 = f6;
            this.f8139w0 = f10;
            this.f8140x0 = i10;
            this.f8141y0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TextFieldDefaults.this.m863BorderBoxnbWgWpA(this.f8134q0, this.f8135r0, this.f8136s0, this.f8137t0, this.f8138u0, this.v0, this.f8139w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f8140x0 | 1), this.f8141y0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TextFieldDefaults.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f8142p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f8143q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ InteractionSource f8144r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ TextFieldColors f8145s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f8146t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f8147u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, int i11, InteractionSource interactionSource, TextFieldColors textFieldColors, boolean z10, boolean z11) {
            super(2);
            this.f8142p0 = z10;
            this.f8143q0 = z11;
            this.f8144r0 = interactionSource;
            this.f8145s0 = textFieldColors;
            this.f8146t0 = i10;
            this.f8147u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1261916269, iIntValue, -1, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox.<anonymous> (TextFieldDefaults.kt:648)");
                }
                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                boolean z10 = this.f8142p0;
                boolean z11 = this.f8143q0;
                InteractionSource interactionSource = this.f8144r0;
                TextFieldColors textFieldColors = this.f8145s0;
                int i10 = this.f8146t0;
                textFieldDefaults.m863BorderBoxnbWgWpA(z10, z11, interactionSource, textFieldColors, null, 0.0f, 0.0f, composer2, ((i10 >> 9) & 896) | ((i10 >> 6) & 14) | 12582912 | ((i10 >> 15) & 112) | ((this.f8147u0 << 6) & 7168), 112);
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
        public final /* synthetic */ TextFieldColors G0;
        public final /* synthetic */ PaddingValues H0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> I0;
        public final /* synthetic */ int J0;
        public final /* synthetic */ int K0;
        public final /* synthetic */ int L0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f8149q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f8150r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f8151s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f8152t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ VisualTransformation f8153u0;
        public final /* synthetic */ InteractionSource v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ boolean f8154w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f8155x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f8156y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(String str, Function2<? super Composer, ? super Integer, Unit> function2, boolean z10, boolean z11, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z12, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, Function2<? super Composer, ? super Integer, Unit> function5, Function2<? super Composer, ? super Integer, Unit> function6, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function7, int i10, int i11, int i12) {
            super(2);
            this.f8149q0 = str;
            this.f8150r0 = function2;
            this.f8151s0 = z10;
            this.f8152t0 = z11;
            this.f8153u0 = visualTransformation;
            this.v0 = interactionSource;
            this.f8154w0 = z12;
            this.f8155x0 = function3;
            this.f8156y0 = function4;
            this.E0 = function5;
            this.F0 = function6;
            this.G0 = textFieldColors;
            this.H0 = paddingValues;
            this.I0 = function7;
            this.J0 = i10;
            this.K0 = i11;
            this.L0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TextFieldDefaults.this.OutlinedTextFieldDecorationBox(this.f8149q0, this.f8150r0, this.f8151s0, this.f8152t0, this.f8153u0, this.v0, this.f8154w0, this.f8155x0, this.f8156y0, this.E0, this.F0, this.G0, this.H0, this.I0, composer, RecomposeScopeImplKt.updateChangedFlags(this.J0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.K0), this.L0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TextFieldDefaults.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function2<Composer, Integer, Unit> E0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> F0;
        public final /* synthetic */ TextFieldColors G0;
        public final /* synthetic */ PaddingValues H0;
        public final /* synthetic */ int I0;
        public final /* synthetic */ int J0;
        public final /* synthetic */ int K0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f8158q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f8159r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f8160s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f8161t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ VisualTransformation f8162u0;
        public final /* synthetic */ InteractionSource v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ boolean f8163w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f8164x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f8165y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(String str, Function2<? super Composer, ? super Integer, Unit> function2, boolean z10, boolean z11, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z12, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, Function2<? super Composer, ? super Integer, Unit> function5, Function2<? super Composer, ? super Integer, Unit> function6, TextFieldColors textFieldColors, PaddingValues paddingValues, int i10, int i11, int i12) {
            super(2);
            this.f8158q0 = str;
            this.f8159r0 = function2;
            this.f8160s0 = z10;
            this.f8161t0 = z11;
            this.f8162u0 = visualTransformation;
            this.v0 = interactionSource;
            this.f8163w0 = z12;
            this.f8164x0 = function3;
            this.f8165y0 = function4;
            this.E0 = function5;
            this.F0 = function6;
            this.G0 = textFieldColors;
            this.H0 = paddingValues;
            this.I0 = i10;
            this.J0 = i11;
            this.K0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TextFieldDefaults.this.TextFieldDecorationBox(this.f8158q0, this.f8159r0, this.f8160s0, this.f8161t0, this.f8162u0, this.v0, this.f8163w0, this.f8164x0, this.f8165y0, this.E0, this.F0, this.G0, this.H0, composer, RecomposeScopeImplKt.updateChangedFlags(this.I0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.J0), this.K0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TextFieldDefaults.kt */
    public static final class e extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f8166p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f8167q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ InteractionSource f8168r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ TextFieldColors f8169s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ float f8170t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ float f8171u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z10, boolean z11, InteractionSource interactionSource, TextFieldColors textFieldColors, float f6, float f10) {
            super(3);
            this.f8166p0 = z10;
            this.f8167q0 = z11;
            this.f8168r0 = interactionSource;
            this.f8169s0 = textFieldColors;
            this.f8170t0 = f6;
            this.f8171u0 = f10;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier, "$this$composed", composer2, 1398930845);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1398930845, iA, -1, "androidx.compose.material.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:280)");
            }
            Modifier modifierDrawIndicatorLine = TextFieldKt.drawIndicatorLine(Modifier.INSTANCE, (BorderStroke) TextFieldDefaultsKt.m874access$animateBorderStrokeAsStateNuRrP5Q(this.f8166p0, this.f8167q0, this.f8168r0, this.f8169s0, this.f8170t0, this.f8171u0, composer2, 0).getValue());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return modifierDrawIndicatorLine;
        }
    }

    /* JADX INFO: renamed from: outlinedTextFieldPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m860outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f6, float f10, float f11, float f12, int i10, Object obj) {
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
        return textFieldDefaults.m870outlinedTextFieldPaddinga9UjIt4(f6, f10, f11, f12);
    }

    /* JADX INFO: renamed from: textFieldWithLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m861textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f6, float f10, float f11, float f12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 2) != 0) {
            f10 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 4) != 0) {
            f11 = TextFieldKt.getFirstBaselineOffset();
        }
        if ((i10 & 8) != 0) {
            f12 = TextFieldKt.getTextFieldBottomPadding();
        }
        return textFieldDefaults.m872textFieldWithLabelPaddinga9UjIt4(f6, f10, f11, f12);
    }

    /* JADX INFO: renamed from: textFieldWithoutLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m862textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f6, float f10, float f11, float f12, int i10, Object obj) {
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
        return textFieldDefaults.m873textFieldWithoutLabelPaddinga9UjIt4(f6, f10, f11, f12);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0134 A[PHI: r1 r3 r5
      0x0134: PHI (r1v31 int) = (r1v21 int), (r1v33 int), (r1v34 int) binds: [B:114:0x0153, B:104:0x0131, B:105:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x0134: PHI (r3v13 androidx.compose.ui.graphics.Shape) = 
      (r3v3 androidx.compose.ui.graphics.Shape)
      (r3v2 androidx.compose.ui.graphics.Shape)
      (r3v2 androidx.compose.ui.graphics.Shape)
     binds: [B:114:0x0153, B:104:0x0131, B:105:0x0133] A[DONT_GENERATE, DONT_INLINE]
      0x0134: PHI (r5v6 float) = (r5v3 float), (r5v2 float), (r5v2 float) binds: [B:114:0x0153, B:104:0x0131, B:105:0x0133] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:107:0x013a  */
    /* JADX WARN: Code duplicated, block: B:109:0x013e  */
    /* JADX WARN: Code duplicated, block: B:112:0x014c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0155  */
    /* JADX WARN: Code duplicated, block: B:118:0x0166  */
    /* JADX WARN: Code duplicated, block: B:121:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:126:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0109  */
    /* JADX WARN: Code duplicated, block: B:94:0x0119  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterialApi
    /* JADX INFO: renamed from: BorderBox-nbWgWpA, reason: not valid java name */
    public final void m863BorderBoxnbWgWpA(boolean z10, boolean z11, @NotNull InteractionSource interactionSource, @NotNull TextFieldColors colors, @Nullable Shape shape, float f6, float f10, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Shape outlinedTextFieldShape;
        float f11;
        float f12;
        int i13;
        Shape shape2;
        float f13;
        float f14;
        Shape shape3;
        float f15;
        float f16;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Composer composerStartRestartGroup = composer.startRestartGroup(943754022);
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
                outlinedTextFieldShape = shape;
                int i14 = composerStartRestartGroup.changed(outlinedTextFieldShape) ? 16384 : 8192;
                i12 |= i14;
            } else {
                outlinedTextFieldShape = shape;
            }
            i12 |= i14;
        } else {
            outlinedTextFieldShape = shape;
        }
        if ((i10 & 458752) == 0) {
            if ((i11 & 32) == 0) {
                f11 = f6;
                int i15 = composerStartRestartGroup.changed(f11) ? 131072 : 65536;
                i12 |= i15;
            } else {
                f11 = f6;
            }
            i12 |= i15;
        } else {
            f11 = f6;
        }
        if ((3670016 & i10) == 0) {
            if ((i11 & 64) == 0) {
                f12 = f10;
                int i16 = composerStartRestartGroup.changed(f12) ? 1048576 : 524288;
                i12 |= i16;
            } else {
                f12 = f10;
            }
            i12 |= i16;
        } else {
            f12 = f10;
        }
        if ((i11 & 128) == 0) {
            if ((29360128 & i10) == 0) {
                i13 = composerStartRestartGroup.changed(this) ? 8388608 : 4194304;
            }
            if ((23967451 & i12) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if ((i11 & 16) != 0) {
                        outlinedTextFieldShape = getOutlinedTextFieldShape(composerStartRestartGroup, (i12 >> 21) & 14);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        f11 = FocusedBorderThickness;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        shape2 = outlinedTextFieldShape;
                        f13 = UnfocusedBorderThickness;
                        f14 = f11;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(943754022, i12, -1, "androidx.compose.material.TextFieldDefaults.BorderBox (TextFieldDefaults.kt:309)");
                    }
                    int i17 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                    int i18 = i12 >> 3;
                    Shape shape4 = shape2;
                    BoxKt.Box(BorderKt.border(Modifier.INSTANCE, (BorderStroke) TextFieldDefaultsKt.m874access$animateBorderStrokeAsStateNuRrP5Q(z10, z11, interactionSource, colors, f14, f13, composerStartRestartGroup, i17 | (57344 & i18) | (i18 & 458752)).getValue(), shape4), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape3 = shape4;
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
                shape2 = outlinedTextFieldShape;
                f14 = f11;
                f13 = f12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(943754022, i12, -1, "androidx.compose.material.TextFieldDefaults.BorderBox (TextFieldDefaults.kt:309)");
                }
                int i19 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                int i110 = i12 >> 3;
                Shape shape5 = shape2;
                BoxKt.Box(BorderKt.border(Modifier.INSTANCE, (BorderStroke) TextFieldDefaultsKt.m874access$animateBorderStrokeAsStateNuRrP5Q(z10, z11, interactionSource, colors, f14, f13, composerStartRestartGroup, i19 | (57344 & i110) | (i110 & 458752)).getValue(), shape5), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape3 = shape5;
                f15 = f14;
                f16 = f13;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                f15 = f11;
                f16 = f12;
                shape3 = outlinedTextFieldShape;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(z10, z11, interactionSource, colors, shape3, f15, f16, i10, i11));
        }
        i13 = 12582912;
        i12 |= i13;
        if ((23967451 & i12) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if ((i11 & 16) != 0) {
                    outlinedTextFieldShape = getOutlinedTextFieldShape(composerStartRestartGroup, (i12 >> 21) & 14);
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    f11 = FocusedBorderThickness;
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    shape2 = outlinedTextFieldShape;
                    f13 = UnfocusedBorderThickness;
                    f14 = f11;
                } else {
                    shape2 = outlinedTextFieldShape;
                    f14 = f11;
                    f13 = f12;
                }
            } else {
                if ((i11 & 16) != 0) {
                    outlinedTextFieldShape = getOutlinedTextFieldShape(composerStartRestartGroup, (i12 >> 21) & 14);
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    f11 = FocusedBorderThickness;
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    shape2 = outlinedTextFieldShape;
                    f13 = UnfocusedBorderThickness;
                    f14 = f11;
                } else {
                    shape2 = outlinedTextFieldShape;
                    f14 = f11;
                    f13 = f12;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(943754022, i12, -1, "androidx.compose.material.TextFieldDefaults.BorderBox (TextFieldDefaults.kt:309)");
            }
            int i111 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
            int i112 = i12 >> 3;
            Shape shape6 = shape2;
            BoxKt.Box(BorderKt.border(Modifier.INSTANCE, (BorderStroke) TextFieldDefaultsKt.m874access$animateBorderStrokeAsStateNuRrP5Q(z10, z11, interactionSource, colors, f14, f13, composerStartRestartGroup, i111 | (57344 & i112) | (i112 & 458752)).getValue(), shape6), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape3 = shape6;
            f15 = f14;
            f16 = f13;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if ((i11 & 16) != 0) {
                    outlinedTextFieldShape = getOutlinedTextFieldShape(composerStartRestartGroup, (i12 >> 21) & 14);
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    f11 = FocusedBorderThickness;
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    shape2 = outlinedTextFieldShape;
                    f13 = UnfocusedBorderThickness;
                    f14 = f11;
                } else {
                    shape2 = outlinedTextFieldShape;
                    f14 = f11;
                    f13 = f12;
                }
            } else {
                if ((i11 & 16) != 0) {
                    outlinedTextFieldShape = getOutlinedTextFieldShape(composerStartRestartGroup, (i12 >> 21) & 14);
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    f11 = FocusedBorderThickness;
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    shape2 = outlinedTextFieldShape;
                    f13 = UnfocusedBorderThickness;
                    f14 = f11;
                } else {
                    shape2 = outlinedTextFieldShape;
                    f14 = f11;
                    f13 = f12;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(943754022, i12, -1, "androidx.compose.material.TextFieldDefaults.BorderBox (TextFieldDefaults.kt:309)");
            }
            int i113 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
            int i114 = i12 >> 3;
            Shape shape7 = shape2;
            BoxKt.Box(BorderKt.border(Modifier.INSTANCE, (BorderStroke) TextFieldDefaultsKt.m874access$animateBorderStrokeAsStateNuRrP5Q(z10, z11, interactionSource, colors, f14, f13, composerStartRestartGroup, i113 | (57344 & i114) | (i114 & 458752)).getValue(), shape7), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape3 = shape7;
            f15 = f14;
            f16 = f13;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(z10, z11, interactionSource, colors, shape3, f15, f16, i10, i11));
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
    /* JADX WARN: Code duplicated, block: B:120:0x017a  */
    /* JADX WARN: Code duplicated, block: B:123:0x0185 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x018c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0192  */
    /* JADX WARN: Code duplicated, block: B:131:0x0196  */
    /* JADX WARN: Code duplicated, block: B:134:0x019f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:141:0x01af  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:153:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:155:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:157:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:167:0x020d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0214  */
    /* JADX WARN: Code duplicated, block: B:179:0x023c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:180:0x023e  */
    /* JADX WARN: Code duplicated, block: B:181:0x0240  */
    /* JADX WARN: Code duplicated, block: B:184:0x0245  */
    /* JADX WARN: Code duplicated, block: B:185:0x0247  */
    /* JADX WARN: Code duplicated, block: B:187:0x024b  */
    /* JADX WARN: Code duplicated, block: B:188:0x024d  */
    /* JADX WARN: Code duplicated, block: B:190:0x0251  */
    /* JADX WARN: Code duplicated, block: B:191:0x0253  */
    /* JADX WARN: Code duplicated, block: B:194:0x0258  */
    /* JADX WARN: Code duplicated, block: B:197:0x025e  */
    /* JADX WARN: Code duplicated, block: B:198:0x029e  */
    /* JADX WARN: Code duplicated, block: B:201:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:202:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:204:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:206:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:209:0x0310  */
    /* JADX WARN: Code duplicated, block: B:212:0x038a  */
    /* JADX WARN: Code duplicated, block: B:217:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0081  */
    /* JADX WARN: Code duplicated, block: B:38:0x0086  */
    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:43:0x0095  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00de  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fe  */
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
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void OutlinedTextFieldDecorationBox(@NotNull String value, @NotNull Function2<? super Composer, ? super Integer, Unit> innerTextField, boolean z10, boolean z11, @NotNull VisualTransformation visualTransformation, @NotNull InteractionSource interactionSource, boolean z12, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function4, @Nullable Function2<? super Composer, ? super Integer, Unit> function5, @Nullable TextFieldColors textFieldColors, @Nullable PaddingValues paddingValues, @Nullable Function2<? super Composer, ? super Integer, Unit> function6, @Nullable Composer composer, int i10, int i11, int i12) {
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
        boolean z13;
        Function2<? super Composer, ? super Integer, Unit> function7;
        Function2<? super Composer, ? super Integer, Unit> function8;
        Function2<? super Composer, ? super Integer, Unit> function9;
        TextFieldColors textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
        Function2<? super Composer, ? super Integer, Unit> function10;
        PaddingValues paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
        PaddingValues paddingValues2;
        TextFieldColors textFieldColors2;
        Function2<? super Composer, ? super Integer, Unit> function2ComposableLambda;
        Function2<? super Composer, ? super Integer, Unit> function11;
        boolean z14;
        Function2<? super Composer, ? super Integer, Unit> function12;
        Function2<? super Composer, ? super Integer, Unit> function13;
        Composer composer2;
        boolean z15;
        Function2<? super Composer, ? super Integer, Unit> function14;
        Function2<? super Composer, ? super Integer, Unit> function15;
        Function2<? super Composer, ? super Integer, Unit> function16;
        Function2<? super Composer, ? super Integer, Unit> function17;
        TextFieldColors textFieldColors3;
        PaddingValues paddingValues3;
        Function2<? super Composer, ? super Integer, Unit> function18;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1280721485);
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
                if ((i12 & 16) != 0) {
                    i13 |= 24576;
                } else if ((i10 & 57344) == 0) {
                    if (composerStartRestartGroup.changed(visualTransformation)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i13 |= i15;
                }
                if ((i12 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(interactionSource)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                    }
                    i17 = i12 & 64;
                    if (i17 != 0) {
                        i13 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z12)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i13 |= i18;
                    }
                    i19 = i12 & 128;
                    if (i19 != 0) {
                        i13 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i13 |= i20;
                    }
                    i21 = i12 & 256;
                    if (i21 != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i22 = 33554432;
                        }
                        i13 |= i22;
                    }
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 1879048192) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i24 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i24 = 268435456;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 1024;
                    if (i25 != 0) {
                        i26 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i27 = 4;
                        } else {
                            i27 = 2;
                        }
                        i26 = i11 | i27;
                    } else {
                        i26 = i11;
                    }
                    if ((i11 & 112) != 0) {
                        i26 |= ((i12 & 2048) == 0 || !composerStartRestartGroup.changed(textFieldColors)) ? 16 : 32;
                    }
                    if ((i11 & 896) != 0) {
                        i26 |= ((i12 & 4096) == 0 || !composerStartRestartGroup.changed(paddingValues)) ? 128 : 256;
                    }
                    i28 = i26;
                    i29 = i12 & 8192;
                    if (i29 != 0) {
                        if ((i11 & 7168) == 0) {
                            i28 |= composerStartRestartGroup.changedInstance(function6) ? 2048 : 1024;
                        }
                        if ((i12 & 16384) != 0) {
                            if ((i11 & 57344) == 0) {
                                i28 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
                            }
                            if ((i13 & 1533916891) != 306783378 && (46811 & i28) == 9362 && composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                function14 = function2;
                                function15 = function3;
                                function16 = function4;
                                function17 = function5;
                                textFieldColors3 = textFieldColors;
                                paddingValues3 = paddingValues;
                                function18 = function6;
                                composer2 = composerStartRestartGroup;
                                z15 = z12;
                            } else {
                                composerStartRestartGroup.startDefaults();
                                if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i17 != 0) {
                                        z13 = false;
                                    } else {
                                        z13 = z12;
                                    }
                                    if (i19 != 0) {
                                        function7 = null;
                                    } else {
                                        function7 = function2;
                                    }
                                    if (i21 != 0) {
                                        function8 = null;
                                    } else {
                                        function8 = function3;
                                    }
                                    if (i23 != 0) {
                                        function9 = null;
                                    } else {
                                        function9 = function4;
                                    }
                                    Function2<? super Composer, ? super Integer, Unit> function19 = i25 == 0 ? function5 : null;
                                    if ((i12 & 2048) != 0) {
                                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                        i28 &= -113;
                                    } else {
                                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                    }
                                    function10 = function9;
                                    if ((i12 & 4096) != 0) {
                                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        i28 &= -897;
                                    } else {
                                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                                    }
                                    if (i29 != 0) {
                                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                                    } else {
                                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                        function2ComposableLambda = function6;
                                    }
                                    function11 = function7;
                                    z14 = z13;
                                    function12 = function8;
                                    function13 = function19;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i12 & 2048) != 0) {
                                        i28 &= -113;
                                    }
                                    if ((i12 & 4096) != 0) {
                                        i28 &= -897;
                                    }
                                    z14 = z12;
                                    function11 = function2;
                                    function12 = function3;
                                    function10 = function4;
                                    function13 = function5;
                                    textFieldColors2 = textFieldColors;
                                    paddingValues2 = paddingValues;
                                    function2ComposableLambda = function6;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                                }
                                int i30 = i13 << 3;
                                int i31 = i13 >> 9;
                                composer2 = composerStartRestartGroup;
                                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i30 & 896) | (i30 & 112) | 6 | ((i13 >> 3) & 7168) | (i31 & 57344) | (458752 & i31) | (i31 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z15 = z14;
                                function14 = function11;
                                function15 = function12;
                                function16 = function10;
                                function17 = function13;
                                textFieldColors3 = textFieldColors2;
                                paddingValues3 = paddingValues2;
                                function18 = function2ComposableLambda;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
                        }
                        i28 |= 24576;
                        if ((i13 & 1533916891) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i17 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i19 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function2;
                                }
                                if (i21 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function3;
                                }
                                if (i23 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function4;
                                }
                                if (i25 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                    i28 &= -113;
                                } else {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                }
                                function10 = function9;
                                if ((i12 & 4096) != 0) {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i28 &= -897;
                                } else {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i29 != 0) {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                                } else {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = function6;
                                }
                                function11 = function7;
                                z14 = z13;
                                function12 = function8;
                                function13 = function19;
                            } else {
                                if (i17 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i19 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function2;
                                }
                                if (i21 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function3;
                                }
                                if (i23 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function4;
                                }
                                if (i25 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                    i28 &= -113;
                                } else {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                }
                                function10 = function9;
                                if ((i12 & 4096) != 0) {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i28 &= -897;
                                } else {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i29 != 0) {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                                } else {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = function6;
                                }
                                function11 = function7;
                                z14 = z13;
                                function12 = function8;
                                function13 = function19;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                            }
                            int i32 = i13 << 3;
                            int i33 = i13 >> 9;
                            composer2 = composerStartRestartGroup;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i32 & 896) | (i32 & 112) | 6 | ((i13 >> 3) & 7168) | (i33 & 57344) | (458752 & i33) | (i33 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z14;
                            function14 = function11;
                            function15 = function12;
                            function16 = function10;
                            function17 = function13;
                            textFieldColors3 = textFieldColors2;
                            paddingValues3 = paddingValues2;
                            function18 = function2ComposableLambda;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i17 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i19 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function2;
                                }
                                if (i21 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function3;
                                }
                                if (i23 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function4;
                                }
                                if (i25 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                    i28 &= -113;
                                } else {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                }
                                function10 = function9;
                                if ((i12 & 4096) != 0) {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i28 &= -897;
                                } else {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i29 != 0) {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                                } else {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = function6;
                                }
                                function11 = function7;
                                z14 = z13;
                                function12 = function8;
                                function13 = function19;
                            } else {
                                if (i17 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i19 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function2;
                                }
                                if (i21 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function3;
                                }
                                if (i23 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function4;
                                }
                                if (i25 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                    i28 &= -113;
                                } else {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                }
                                function10 = function9;
                                if ((i12 & 4096) != 0) {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i28 &= -897;
                                } else {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i29 != 0) {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                                } else {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = function6;
                                }
                                function11 = function7;
                                z14 = z13;
                                function12 = function8;
                                function13 = function19;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                            }
                            int i34 = i13 << 3;
                            int i35 = i13 >> 9;
                            composer2 = composerStartRestartGroup;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i34 & 896) | (i34 & 112) | 6 | ((i13 >> 3) & 7168) | (i35 & 57344) | (458752 & i35) | (i35 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z14;
                            function14 = function11;
                            function15 = function12;
                            function16 = function10;
                            function17 = function13;
                            textFieldColors3 = textFieldColors2;
                            paddingValues3 = paddingValues2;
                            function18 = function2ComposableLambda;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
                    }
                    i28 |= 3072;
                    if ((i12 & 16384) != 0) {
                        if ((i11 & 57344) == 0) {
                            i28 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
                        }
                        if ((i13 & 1533916891) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i17 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i19 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function2;
                                }
                                if (i21 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function3;
                                }
                                if (i23 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function4;
                                }
                                if (i25 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                    i28 &= -113;
                                } else {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                }
                                function10 = function9;
                                if ((i12 & 4096) != 0) {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i28 &= -897;
                                } else {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i29 != 0) {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                                } else {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = function6;
                                }
                                function11 = function7;
                                z14 = z13;
                                function12 = function8;
                                function13 = function19;
                            } else {
                                if (i17 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i19 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function2;
                                }
                                if (i21 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function3;
                                }
                                if (i23 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function4;
                                }
                                if (i25 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                    i28 &= -113;
                                } else {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                }
                                function10 = function9;
                                if ((i12 & 4096) != 0) {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i28 &= -897;
                                } else {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i29 != 0) {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                                } else {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = function6;
                                }
                                function11 = function7;
                                z14 = z13;
                                function12 = function8;
                                function13 = function19;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                            }
                            int i36 = i13 << 3;
                            int i37 = i13 >> 9;
                            composer2 = composerStartRestartGroup;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i36 & 896) | (i36 & 112) | 6 | ((i13 >> 3) & 7168) | (i37 & 57344) | (458752 & i37) | (i37 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z14;
                            function14 = function11;
                            function15 = function12;
                            function16 = function10;
                            function17 = function13;
                            textFieldColors3 = textFieldColors2;
                            paddingValues3 = paddingValues2;
                            function18 = function2ComposableLambda;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i17 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i19 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function2;
                                }
                                if (i21 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function3;
                                }
                                if (i23 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function4;
                                }
                                if (i25 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                    i28 &= -113;
                                } else {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                }
                                function10 = function9;
                                if ((i12 & 4096) != 0) {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i28 &= -897;
                                } else {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i29 != 0) {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                                } else {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = function6;
                                }
                                function11 = function7;
                                z14 = z13;
                                function12 = function8;
                                function13 = function19;
                            } else {
                                if (i17 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i19 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function2;
                                }
                                if (i21 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function3;
                                }
                                if (i23 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function4;
                                }
                                if (i25 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                    i28 &= -113;
                                } else {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                }
                                function10 = function9;
                                if ((i12 & 4096) != 0) {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i28 &= -897;
                                } else {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i29 != 0) {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                                } else {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = function6;
                                }
                                function11 = function7;
                                z14 = z13;
                                function12 = function8;
                                function13 = function19;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                            }
                            int i38 = i13 << 3;
                            int i39 = i13 >> 9;
                            composer2 = composerStartRestartGroup;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i38 & 896) | (i38 & 112) | 6 | ((i13 >> 3) & 7168) | (i39 & 57344) | (458752 & i39) | (i39 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z14;
                            function14 = function11;
                            function15 = function12;
                            function16 = function10;
                            function17 = function13;
                            textFieldColors3 = textFieldColors2;
                            paddingValues3 = paddingValues2;
                            function18 = function2ComposableLambda;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
                    }
                    i28 |= 24576;
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                        }
                        int i310 = i13 << 3;
                        int i311 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i310 & 896) | (i310 & 112) | 6 | ((i13 >> 3) & 7168) | (i311 & 57344) | (458752 & i311) | (i311 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function14 = function11;
                        function15 = function12;
                        function16 = function10;
                        function17 = function13;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function18 = function2ComposableLambda;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                        }
                        int i312 = i13 << 3;
                        int i313 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i312 & 896) | (i312 & 112) | 6 | ((i13 >> 3) & 7168) | (i313 & 57344) | (458752 & i313) | (i313 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function14 = function11;
                        function15 = function12;
                        function16 = function10;
                        function17 = function13;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function18 = function2ComposableLambda;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
                }
                i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i13 |= i16;
                i17 = i12 & 64;
                if (i17 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z12)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i22 = 33554432;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i24 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                if ((i11 & 112) != 0) {
                    i26 |= ((i12 & 2048) == 0 || !composerStartRestartGroup.changed(textFieldColors)) ? 16 : 32;
                }
                if ((i11 & 896) != 0) {
                    i26 |= ((i12 & 4096) == 0 || !composerStartRestartGroup.changed(paddingValues)) ? 128 : 256;
                }
                i28 = i26;
                i29 = i12 & 8192;
                if (i29 != 0) {
                    if ((i11 & 7168) == 0) {
                        i28 |= composerStartRestartGroup.changedInstance(function6) ? 2048 : 1024;
                    }
                    if ((i12 & 16384) != 0) {
                        if ((i11 & 57344) == 0) {
                            i28 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
                        }
                        if ((i13 & 1533916891) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i17 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i19 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function2;
                                }
                                if (i21 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function3;
                                }
                                if (i23 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function4;
                                }
                                if (i25 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                    i28 &= -113;
                                } else {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                }
                                function10 = function9;
                                if ((i12 & 4096) != 0) {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i28 &= -897;
                                } else {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i29 != 0) {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                                } else {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = function6;
                                }
                                function11 = function7;
                                z14 = z13;
                                function12 = function8;
                                function13 = function19;
                            } else {
                                if (i17 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i19 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function2;
                                }
                                if (i21 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function3;
                                }
                                if (i23 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function4;
                                }
                                if (i25 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                    i28 &= -113;
                                } else {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                }
                                function10 = function9;
                                if ((i12 & 4096) != 0) {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i28 &= -897;
                                } else {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i29 != 0) {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                                } else {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = function6;
                                }
                                function11 = function7;
                                z14 = z13;
                                function12 = function8;
                                function13 = function19;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                            }
                            int i314 = i13 << 3;
                            int i315 = i13 >> 9;
                            composer2 = composerStartRestartGroup;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i314 & 896) | (i314 & 112) | 6 | ((i13 >> 3) & 7168) | (i315 & 57344) | (458752 & i315) | (i315 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z14;
                            function14 = function11;
                            function15 = function12;
                            function16 = function10;
                            function17 = function13;
                            textFieldColors3 = textFieldColors2;
                            paddingValues3 = paddingValues2;
                            function18 = function2ComposableLambda;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i17 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i19 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function2;
                                }
                                if (i21 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function3;
                                }
                                if (i23 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function4;
                                }
                                if (i25 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                    i28 &= -113;
                                } else {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                }
                                function10 = function9;
                                if ((i12 & 4096) != 0) {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i28 &= -897;
                                } else {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i29 != 0) {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                                } else {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = function6;
                                }
                                function11 = function7;
                                z14 = z13;
                                function12 = function8;
                                function13 = function19;
                            } else {
                                if (i17 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i19 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function2;
                                }
                                if (i21 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function3;
                                }
                                if (i23 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function4;
                                }
                                if (i25 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                    i28 &= -113;
                                } else {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                }
                                function10 = function9;
                                if ((i12 & 4096) != 0) {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i28 &= -897;
                                } else {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i29 != 0) {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                                } else {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = function6;
                                }
                                function11 = function7;
                                z14 = z13;
                                function12 = function8;
                                function13 = function19;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                            }
                            int i316 = i13 << 3;
                            int i317 = i13 >> 9;
                            composer2 = composerStartRestartGroup;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i316 & 896) | (i316 & 112) | 6 | ((i13 >> 3) & 7168) | (i317 & 57344) | (458752 & i317) | (i317 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z14;
                            function14 = function11;
                            function15 = function12;
                            function16 = function10;
                            function17 = function13;
                            textFieldColors3 = textFieldColors2;
                            paddingValues3 = paddingValues2;
                            function18 = function2ComposableLambda;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
                    }
                    i28 |= 24576;
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                        }
                        int i318 = i13 << 3;
                        int i319 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i318 & 896) | (i318 & 112) | 6 | ((i13 >> 3) & 7168) | (i319 & 57344) | (458752 & i319) | (i319 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function14 = function11;
                        function15 = function12;
                        function16 = function10;
                        function17 = function13;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function18 = function2ComposableLambda;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                        }
                        int i3110 = i13 << 3;
                        int i3111 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i3110 & 896) | (i3110 & 112) | 6 | ((i13 >> 3) & 7168) | (i3111 & 57344) | (458752 & i3111) | (i3111 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function14 = function11;
                        function15 = function12;
                        function16 = function10;
                        function17 = function13;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function18 = function2ComposableLambda;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
                }
                i28 |= 3072;
                if ((i12 & 16384) != 0) {
                    if ((i11 & 57344) == 0) {
                        i28 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                        }
                        int i3112 = i13 << 3;
                        int i3113 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i3112 & 896) | (i3112 & 112) | 6 | ((i13 >> 3) & 7168) | (i3113 & 57344) | (458752 & i3113) | (i3113 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function14 = function11;
                        function15 = function12;
                        function16 = function10;
                        function17 = function13;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function18 = function2ComposableLambda;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                        }
                        int i3114 = i13 << 3;
                        int i3115 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i3114 & 896) | (i3114 & 112) | 6 | ((i13 >> 3) & 7168) | (i3115 & 57344) | (458752 & i3115) | (i3115 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function14 = function11;
                        function15 = function12;
                        function16 = function10;
                        function17 = function13;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function18 = function2ComposableLambda;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
                }
                i28 |= 24576;
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                    }
                    int i3116 = i13 << 3;
                    int i3117 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i3116 & 896) | (i3116 & 112) | 6 | ((i13 >> 3) & 7168) | (i3117 & 57344) | (458752 & i3117) | (i3117 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function14 = function11;
                    function15 = function12;
                    function16 = function10;
                    function17 = function13;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function18 = function2ComposableLambda;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                    }
                    int i3118 = i13 << 3;
                    int i3119 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i3118 & 896) | (i3118 & 112) | 6 | ((i13 >> 3) & 7168) | (i3119 & 57344) | (458752 & i3119) | (i3119 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function14 = function11;
                    function15 = function12;
                    function16 = function10;
                    function17 = function13;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function18 = function2ComposableLambda;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
            }
            i13 |= 3072;
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i10 & 57344) == 0) {
                if (composerStartRestartGroup.changed(visualTransformation)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            if ((i12 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(interactionSource)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                }
                i17 = i12 & 64;
                if (i17 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z12)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i22 = 33554432;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i24 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                if ((i11 & 112) != 0) {
                    i26 |= ((i12 & 2048) == 0 || !composerStartRestartGroup.changed(textFieldColors)) ? 16 : 32;
                }
                if ((i11 & 896) != 0) {
                    i26 |= ((i12 & 4096) == 0 || !composerStartRestartGroup.changed(paddingValues)) ? 128 : 256;
                }
                i28 = i26;
                i29 = i12 & 8192;
                if (i29 != 0) {
                    if ((i11 & 7168) == 0) {
                        i28 |= composerStartRestartGroup.changedInstance(function6) ? 2048 : 1024;
                    }
                    if ((i12 & 16384) != 0) {
                        if ((i11 & 57344) == 0) {
                            i28 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
                        }
                        if ((i13 & 1533916891) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i17 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i19 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function2;
                                }
                                if (i21 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function3;
                                }
                                if (i23 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function4;
                                }
                                if (i25 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                    i28 &= -113;
                                } else {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                }
                                function10 = function9;
                                if ((i12 & 4096) != 0) {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i28 &= -897;
                                } else {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i29 != 0) {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                                } else {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = function6;
                                }
                                function11 = function7;
                                z14 = z13;
                                function12 = function8;
                                function13 = function19;
                            } else {
                                if (i17 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i19 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function2;
                                }
                                if (i21 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function3;
                                }
                                if (i23 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function4;
                                }
                                if (i25 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                    i28 &= -113;
                                } else {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                }
                                function10 = function9;
                                if ((i12 & 4096) != 0) {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i28 &= -897;
                                } else {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i29 != 0) {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                                } else {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = function6;
                                }
                                function11 = function7;
                                z14 = z13;
                                function12 = function8;
                                function13 = function19;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                            }
                            int i31110 = i13 << 3;
                            int i31111 = i13 >> 9;
                            composer2 = composerStartRestartGroup;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i31110 & 896) | (i31110 & 112) | 6 | ((i13 >> 3) & 7168) | (i31111 & 57344) | (458752 & i31111) | (i31111 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z14;
                            function14 = function11;
                            function15 = function12;
                            function16 = function10;
                            function17 = function13;
                            textFieldColors3 = textFieldColors2;
                            paddingValues3 = paddingValues2;
                            function18 = function2ComposableLambda;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i17 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i19 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function2;
                                }
                                if (i21 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function3;
                                }
                                if (i23 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function4;
                                }
                                if (i25 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                    i28 &= -113;
                                } else {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                }
                                function10 = function9;
                                if ((i12 & 4096) != 0) {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i28 &= -897;
                                } else {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i29 != 0) {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                                } else {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = function6;
                                }
                                function11 = function7;
                                z14 = z13;
                                function12 = function8;
                                function13 = function19;
                            } else {
                                if (i17 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i19 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function2;
                                }
                                if (i21 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function3;
                                }
                                if (i23 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function4;
                                }
                                if (i25 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                    i28 &= -113;
                                } else {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                }
                                function10 = function9;
                                if ((i12 & 4096) != 0) {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i28 &= -897;
                                } else {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i29 != 0) {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                                } else {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = function6;
                                }
                                function11 = function7;
                                z14 = z13;
                                function12 = function8;
                                function13 = function19;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                            }
                            int i31112 = i13 << 3;
                            int i31113 = i13 >> 9;
                            composer2 = composerStartRestartGroup;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i31112 & 896) | (i31112 & 112) | 6 | ((i13 >> 3) & 7168) | (i31113 & 57344) | (458752 & i31113) | (i31113 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z14;
                            function14 = function11;
                            function15 = function12;
                            function16 = function10;
                            function17 = function13;
                            textFieldColors3 = textFieldColors2;
                            paddingValues3 = paddingValues2;
                            function18 = function2ComposableLambda;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
                    }
                    i28 |= 24576;
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                        }
                        int i31114 = i13 << 3;
                        int i31115 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i31114 & 896) | (i31114 & 112) | 6 | ((i13 >> 3) & 7168) | (i31115 & 57344) | (458752 & i31115) | (i31115 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function14 = function11;
                        function15 = function12;
                        function16 = function10;
                        function17 = function13;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function18 = function2ComposableLambda;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                        }
                        int i31116 = i13 << 3;
                        int i31117 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i31116 & 896) | (i31116 & 112) | 6 | ((i13 >> 3) & 7168) | (i31117 & 57344) | (458752 & i31117) | (i31117 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function14 = function11;
                        function15 = function12;
                        function16 = function10;
                        function17 = function13;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function18 = function2ComposableLambda;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
                }
                i28 |= 3072;
                if ((i12 & 16384) != 0) {
                    if ((i11 & 57344) == 0) {
                        i28 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                        }
                        int i31118 = i13 << 3;
                        int i31119 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i31118 & 896) | (i31118 & 112) | 6 | ((i13 >> 3) & 7168) | (i31119 & 57344) | (458752 & i31119) | (i31119 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function14 = function11;
                        function15 = function12;
                        function16 = function10;
                        function17 = function13;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function18 = function2ComposableLambda;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                        }
                        int i311110 = i13 << 3;
                        int i311111 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i311110 & 896) | (i311110 & 112) | 6 | ((i13 >> 3) & 7168) | (i311111 & 57344) | (458752 & i311111) | (i311111 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function14 = function11;
                        function15 = function12;
                        function16 = function10;
                        function17 = function13;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function18 = function2ComposableLambda;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
                }
                i28 |= 24576;
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                    }
                    int i311112 = i13 << 3;
                    int i311113 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i311112 & 896) | (i311112 & 112) | 6 | ((i13 >> 3) & 7168) | (i311113 & 57344) | (458752 & i311113) | (i311113 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function14 = function11;
                    function15 = function12;
                    function16 = function10;
                    function17 = function13;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function18 = function2ComposableLambda;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                    }
                    int i311114 = i13 << 3;
                    int i311115 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i311114 & 896) | (i311114 & 112) | 6 | ((i13 >> 3) & 7168) | (i311115 & 57344) | (458752 & i311115) | (i311115 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function14 = function11;
                    function15 = function12;
                    function16 = function10;
                    function17 = function13;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function18 = function2ComposableLambda;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
            }
            i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i13 |= i16;
            i17 = i12 & 64;
            if (i17 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z12)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i13 |= i18;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i13 |= i20;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i22 = 33554432;
                }
                i13 |= i22;
            }
            i23 = i12 & 512;
            if (i23 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i24 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i24 = 268435456;
                }
                i13 |= i24;
            }
            i25 = i12 & 1024;
            if (i25 != 0) {
                i26 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i11 | i27;
            } else {
                i26 = i11;
            }
            if ((i11 & 112) != 0) {
                i26 |= ((i12 & 2048) == 0 || !composerStartRestartGroup.changed(textFieldColors)) ? 16 : 32;
            }
            if ((i11 & 896) != 0) {
                i26 |= ((i12 & 4096) == 0 || !composerStartRestartGroup.changed(paddingValues)) ? 128 : 256;
            }
            i28 = i26;
            i29 = i12 & 8192;
            if (i29 != 0) {
                if ((i11 & 7168) == 0) {
                    i28 |= composerStartRestartGroup.changedInstance(function6) ? 2048 : 1024;
                }
                if ((i12 & 16384) != 0) {
                    if ((i11 & 57344) == 0) {
                        i28 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                        }
                        int i311116 = i13 << 3;
                        int i311117 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i311116 & 896) | (i311116 & 112) | 6 | ((i13 >> 3) & 7168) | (i311117 & 57344) | (458752 & i311117) | (i311117 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function14 = function11;
                        function15 = function12;
                        function16 = function10;
                        function17 = function13;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function18 = function2ComposableLambda;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                        }
                        int i311118 = i13 << 3;
                        int i311119 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i311118 & 896) | (i311118 & 112) | 6 | ((i13 >> 3) & 7168) | (i311119 & 57344) | (458752 & i311119) | (i311119 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function14 = function11;
                        function15 = function12;
                        function16 = function10;
                        function17 = function13;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function18 = function2ComposableLambda;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
                }
                i28 |= 24576;
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                    }
                    int i3111110 = i13 << 3;
                    int i3111111 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i3111110 & 896) | (i3111110 & 112) | 6 | ((i13 >> 3) & 7168) | (i3111111 & 57344) | (458752 & i3111111) | (i3111111 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function14 = function11;
                    function15 = function12;
                    function16 = function10;
                    function17 = function13;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function18 = function2ComposableLambda;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                    }
                    int i3111112 = i13 << 3;
                    int i3111113 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i3111112 & 896) | (i3111112 & 112) | 6 | ((i13 >> 3) & 7168) | (i3111113 & 57344) | (458752 & i3111113) | (i3111113 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function14 = function11;
                    function15 = function12;
                    function16 = function10;
                    function17 = function13;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function18 = function2ComposableLambda;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
            }
            i28 |= 3072;
            if ((i12 & 16384) != 0) {
                if ((i11 & 57344) == 0) {
                    i28 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                    }
                    int i3111114 = i13 << 3;
                    int i3111115 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i3111114 & 896) | (i3111114 & 112) | 6 | ((i13 >> 3) & 7168) | (i3111115 & 57344) | (458752 & i3111115) | (i3111115 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function14 = function11;
                    function15 = function12;
                    function16 = function10;
                    function17 = function13;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function18 = function2ComposableLambda;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                    }
                    int i3111116 = i13 << 3;
                    int i3111117 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i3111116 & 896) | (i3111116 & 112) | 6 | ((i13 >> 3) & 7168) | (i3111117 & 57344) | (458752 & i3111117) | (i3111117 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function14 = function11;
                    function15 = function12;
                    function16 = function10;
                    function17 = function13;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function18 = function2ComposableLambda;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
            }
            i28 |= 24576;
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i21 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i23 != 0) {
                        function9 = null;
                    } else {
                        function9 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function10 = function9;
                    if ((i12 & 4096) != 0) {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i28 &= -897;
                    } else {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i29 != 0) {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                    } else {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = function6;
                    }
                    function11 = function7;
                    z14 = z13;
                    function12 = function8;
                    function13 = function19;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i21 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i23 != 0) {
                        function9 = null;
                    } else {
                        function9 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function10 = function9;
                    if ((i12 & 4096) != 0) {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i28 &= -897;
                    } else {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i29 != 0) {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                    } else {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = function6;
                    }
                    function11 = function7;
                    z14 = z13;
                    function12 = function8;
                    function13 = function19;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                }
                int i3111118 = i13 << 3;
                int i3111119 = i13 >> 9;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i3111118 & 896) | (i3111118 & 112) | 6 | ((i13 >> 3) & 7168) | (i3111119 & 57344) | (458752 & i3111119) | (i3111119 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function14 = function11;
                function15 = function12;
                function16 = function10;
                function17 = function13;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
                function18 = function2ComposableLambda;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i21 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i23 != 0) {
                        function9 = null;
                    } else {
                        function9 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function10 = function9;
                    if ((i12 & 4096) != 0) {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i28 &= -897;
                    } else {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i29 != 0) {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                    } else {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = function6;
                    }
                    function11 = function7;
                    z14 = z13;
                    function12 = function8;
                    function13 = function19;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i21 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i23 != 0) {
                        function9 = null;
                    } else {
                        function9 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function10 = function9;
                    if ((i12 & 4096) != 0) {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i28 &= -897;
                    } else {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i29 != 0) {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                    } else {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = function6;
                    }
                    function11 = function7;
                    z14 = z13;
                    function12 = function8;
                    function13 = function19;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                }
                int i31111110 = i13 << 3;
                int i31111111 = i13 >> 9;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i31111110 & 896) | (i31111110 & 112) | 6 | ((i13 >> 3) & 7168) | (i31111111 & 57344) | (458752 & i31111111) | (i31111111 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function14 = function11;
                function15 = function12;
                function16 = function10;
                function17 = function13;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
                function18 = function2ComposableLambda;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
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
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i10 & 57344) == 0) {
                if (composerStartRestartGroup.changed(visualTransformation)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            if ((i12 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(interactionSource)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                }
                i17 = i12 & 64;
                if (i17 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z12)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i22 = 33554432;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i24 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                if ((i11 & 112) != 0) {
                    i26 |= ((i12 & 2048) == 0 || !composerStartRestartGroup.changed(textFieldColors)) ? 16 : 32;
                }
                if ((i11 & 896) != 0) {
                    i26 |= ((i12 & 4096) == 0 || !composerStartRestartGroup.changed(paddingValues)) ? 128 : 256;
                }
                i28 = i26;
                i29 = i12 & 8192;
                if (i29 != 0) {
                    if ((i11 & 7168) == 0) {
                        i28 |= composerStartRestartGroup.changedInstance(function6) ? 2048 : 1024;
                    }
                    if ((i12 & 16384) != 0) {
                        if ((i11 & 57344) == 0) {
                            i28 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
                        }
                        if ((i13 & 1533916891) != 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i17 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i19 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function2;
                                }
                                if (i21 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function3;
                                }
                                if (i23 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function4;
                                }
                                if (i25 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                    i28 &= -113;
                                } else {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                }
                                function10 = function9;
                                if ((i12 & 4096) != 0) {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i28 &= -897;
                                } else {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i29 != 0) {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                                } else {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = function6;
                                }
                                function11 = function7;
                                z14 = z13;
                                function12 = function8;
                                function13 = function19;
                            } else {
                                if (i17 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i19 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function2;
                                }
                                if (i21 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function3;
                                }
                                if (i23 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function4;
                                }
                                if (i25 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                    i28 &= -113;
                                } else {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                }
                                function10 = function9;
                                if ((i12 & 4096) != 0) {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i28 &= -897;
                                } else {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i29 != 0) {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                                } else {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = function6;
                                }
                                function11 = function7;
                                z14 = z13;
                                function12 = function8;
                                function13 = function19;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                            }
                            int i31111112 = i13 << 3;
                            int i31111113 = i13 >> 9;
                            composer2 = composerStartRestartGroup;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i31111112 & 896) | (i31111112 & 112) | 6 | ((i13 >> 3) & 7168) | (i31111113 & 57344) | (458752 & i31111113) | (i31111113 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z14;
                            function14 = function11;
                            function15 = function12;
                            function16 = function10;
                            function17 = function13;
                            textFieldColors3 = textFieldColors2;
                            paddingValues3 = paddingValues2;
                            function18 = function2ComposableLambda;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i17 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i19 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function2;
                                }
                                if (i21 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function3;
                                }
                                if (i23 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function4;
                                }
                                if (i25 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                    i28 &= -113;
                                } else {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                }
                                function10 = function9;
                                if ((i12 & 4096) != 0) {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i28 &= -897;
                                } else {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i29 != 0) {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                                } else {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = function6;
                                }
                                function11 = function7;
                                z14 = z13;
                                function12 = function8;
                                function13 = function19;
                            } else {
                                if (i17 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i19 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function2;
                                }
                                if (i21 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function3;
                                }
                                if (i23 != 0) {
                                    function9 = null;
                                } else {
                                    function9 = function4;
                                }
                                if (i25 == 0) {
                                }
                                if ((i12 & 2048) != 0) {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                    i28 &= -113;
                                } else {
                                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                                }
                                function10 = function9;
                                if ((i12 & 4096) != 0) {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i28 &= -897;
                                } else {
                                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i29 != 0) {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                                } else {
                                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                    function2ComposableLambda = function6;
                                }
                                function11 = function7;
                                z14 = z13;
                                function12 = function8;
                                function13 = function19;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                            }
                            int i31111114 = i13 << 3;
                            int i31111115 = i13 >> 9;
                            composer2 = composerStartRestartGroup;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i31111114 & 896) | (i31111114 & 112) | 6 | ((i13 >> 3) & 7168) | (i31111115 & 57344) | (458752 & i31111115) | (i31111115 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z14;
                            function14 = function11;
                            function15 = function12;
                            function16 = function10;
                            function17 = function13;
                            textFieldColors3 = textFieldColors2;
                            paddingValues3 = paddingValues2;
                            function18 = function2ComposableLambda;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
                    }
                    i28 |= 24576;
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                        }
                        int i31111116 = i13 << 3;
                        int i31111117 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i31111116 & 896) | (i31111116 & 112) | 6 | ((i13 >> 3) & 7168) | (i31111117 & 57344) | (458752 & i31111117) | (i31111117 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function14 = function11;
                        function15 = function12;
                        function16 = function10;
                        function17 = function13;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function18 = function2ComposableLambda;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                        }
                        int i31111118 = i13 << 3;
                        int i31111119 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i31111118 & 896) | (i31111118 & 112) | 6 | ((i13 >> 3) & 7168) | (i31111119 & 57344) | (458752 & i31111119) | (i31111119 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function14 = function11;
                        function15 = function12;
                        function16 = function10;
                        function17 = function13;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function18 = function2ComposableLambda;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
                }
                i28 |= 3072;
                if ((i12 & 16384) != 0) {
                    if ((i11 & 57344) == 0) {
                        i28 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                        }
                        int i311111110 = i13 << 3;
                        int i311111111 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i311111110 & 896) | (i311111110 & 112) | 6 | ((i13 >> 3) & 7168) | (i311111111 & 57344) | (458752 & i311111111) | (i311111111 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function14 = function11;
                        function15 = function12;
                        function16 = function10;
                        function17 = function13;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function18 = function2ComposableLambda;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                        }
                        int i311111112 = i13 << 3;
                        int i311111113 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i311111112 & 896) | (i311111112 & 112) | 6 | ((i13 >> 3) & 7168) | (i311111113 & 57344) | (458752 & i311111113) | (i311111113 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function14 = function11;
                        function15 = function12;
                        function16 = function10;
                        function17 = function13;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function18 = function2ComposableLambda;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
                }
                i28 |= 24576;
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                    }
                    int i311111114 = i13 << 3;
                    int i311111115 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i311111114 & 896) | (i311111114 & 112) | 6 | ((i13 >> 3) & 7168) | (i311111115 & 57344) | (458752 & i311111115) | (i311111115 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function14 = function11;
                    function15 = function12;
                    function16 = function10;
                    function17 = function13;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function18 = function2ComposableLambda;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                    }
                    int i311111116 = i13 << 3;
                    int i311111117 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i311111116 & 896) | (i311111116 & 112) | 6 | ((i13 >> 3) & 7168) | (i311111117 & 57344) | (458752 & i311111117) | (i311111117 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function14 = function11;
                    function15 = function12;
                    function16 = function10;
                    function17 = function13;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function18 = function2ComposableLambda;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
            }
            i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i13 |= i16;
            i17 = i12 & 64;
            if (i17 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z12)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i13 |= i18;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i13 |= i20;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i22 = 33554432;
                }
                i13 |= i22;
            }
            i23 = i12 & 512;
            if (i23 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i24 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i24 = 268435456;
                }
                i13 |= i24;
            }
            i25 = i12 & 1024;
            if (i25 != 0) {
                i26 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i11 | i27;
            } else {
                i26 = i11;
            }
            if ((i11 & 112) != 0) {
                i26 |= ((i12 & 2048) == 0 || !composerStartRestartGroup.changed(textFieldColors)) ? 16 : 32;
            }
            if ((i11 & 896) != 0) {
                i26 |= ((i12 & 4096) == 0 || !composerStartRestartGroup.changed(paddingValues)) ? 128 : 256;
            }
            i28 = i26;
            i29 = i12 & 8192;
            if (i29 != 0) {
                if ((i11 & 7168) == 0) {
                    i28 |= composerStartRestartGroup.changedInstance(function6) ? 2048 : 1024;
                }
                if ((i12 & 16384) != 0) {
                    if ((i11 & 57344) == 0) {
                        i28 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                        }
                        int i311111118 = i13 << 3;
                        int i311111119 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i311111118 & 896) | (i311111118 & 112) | 6 | ((i13 >> 3) & 7168) | (i311111119 & 57344) | (458752 & i311111119) | (i311111119 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function14 = function11;
                        function15 = function12;
                        function16 = function10;
                        function17 = function13;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function18 = function2ComposableLambda;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                        }
                        int i3111111110 = i13 << 3;
                        int i3111111111 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i3111111110 & 896) | (i3111111110 & 112) | 6 | ((i13 >> 3) & 7168) | (i3111111111 & 57344) | (458752 & i3111111111) | (i3111111111 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function14 = function11;
                        function15 = function12;
                        function16 = function10;
                        function17 = function13;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function18 = function2ComposableLambda;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
                }
                i28 |= 24576;
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                    }
                    int i3111111112 = i13 << 3;
                    int i3111111113 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i3111111112 & 896) | (i3111111112 & 112) | 6 | ((i13 >> 3) & 7168) | (i3111111113 & 57344) | (458752 & i3111111113) | (i3111111113 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function14 = function11;
                    function15 = function12;
                    function16 = function10;
                    function17 = function13;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function18 = function2ComposableLambda;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                    }
                    int i3111111114 = i13 << 3;
                    int i3111111115 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i3111111114 & 896) | (i3111111114 & 112) | 6 | ((i13 >> 3) & 7168) | (i3111111115 & 57344) | (458752 & i3111111115) | (i3111111115 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function14 = function11;
                    function15 = function12;
                    function16 = function10;
                    function17 = function13;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function18 = function2ComposableLambda;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
            }
            i28 |= 3072;
            if ((i12 & 16384) != 0) {
                if ((i11 & 57344) == 0) {
                    i28 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                    }
                    int i3111111116 = i13 << 3;
                    int i3111111117 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i3111111116 & 896) | (i3111111116 & 112) | 6 | ((i13 >> 3) & 7168) | (i3111111117 & 57344) | (458752 & i3111111117) | (i3111111117 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function14 = function11;
                    function15 = function12;
                    function16 = function10;
                    function17 = function13;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function18 = function2ComposableLambda;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                    }
                    int i3111111118 = i13 << 3;
                    int i3111111119 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i3111111118 & 896) | (i3111111118 & 112) | 6 | ((i13 >> 3) & 7168) | (i3111111119 & 57344) | (458752 & i3111111119) | (i3111111119 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function14 = function11;
                    function15 = function12;
                    function16 = function10;
                    function17 = function13;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function18 = function2ComposableLambda;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
            }
            i28 |= 24576;
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i21 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i23 != 0) {
                        function9 = null;
                    } else {
                        function9 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function10 = function9;
                    if ((i12 & 4096) != 0) {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i28 &= -897;
                    } else {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i29 != 0) {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                    } else {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = function6;
                    }
                    function11 = function7;
                    z14 = z13;
                    function12 = function8;
                    function13 = function19;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i21 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i23 != 0) {
                        function9 = null;
                    } else {
                        function9 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function10 = function9;
                    if ((i12 & 4096) != 0) {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i28 &= -897;
                    } else {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i29 != 0) {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                    } else {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = function6;
                    }
                    function11 = function7;
                    z14 = z13;
                    function12 = function8;
                    function13 = function19;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                }
                int i31111111110 = i13 << 3;
                int i31111111111 = i13 >> 9;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i31111111110 & 896) | (i31111111110 & 112) | 6 | ((i13 >> 3) & 7168) | (i31111111111 & 57344) | (458752 & i31111111111) | (i31111111111 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function14 = function11;
                function15 = function12;
                function16 = function10;
                function17 = function13;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
                function18 = function2ComposableLambda;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i21 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i23 != 0) {
                        function9 = null;
                    } else {
                        function9 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function10 = function9;
                    if ((i12 & 4096) != 0) {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i28 &= -897;
                    } else {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i29 != 0) {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                    } else {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = function6;
                    }
                    function11 = function7;
                    z14 = z13;
                    function12 = function8;
                    function13 = function19;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i21 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i23 != 0) {
                        function9 = null;
                    } else {
                        function9 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function10 = function9;
                    if ((i12 & 4096) != 0) {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i28 &= -897;
                    } else {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i29 != 0) {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                    } else {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = function6;
                    }
                    function11 = function7;
                    z14 = z13;
                    function12 = function8;
                    function13 = function19;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                }
                int i31111111112 = i13 << 3;
                int i31111111113 = i13 >> 9;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i31111111112 & 896) | (i31111111112 & 112) | 6 | ((i13 >> 3) & 7168) | (i31111111113 & 57344) | (458752 & i31111111113) | (i31111111113 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function14 = function11;
                function15 = function12;
                function16 = function10;
                function17 = function13;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
                function18 = function2ComposableLambda;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
        }
        i13 |= 3072;
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i10 & 57344) == 0) {
            if (composerStartRestartGroup.changed(visualTransformation)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i13 |= i15;
        }
        if ((i12 & 32) != 0) {
            if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(interactionSource)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
            }
            i17 = i12 & 64;
            if (i17 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z12)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i13 |= i18;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i13 |= i20;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i22 = 33554432;
                }
                i13 |= i22;
            }
            i23 = i12 & 512;
            if (i23 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i24 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i24 = 268435456;
                }
                i13 |= i24;
            }
            i25 = i12 & 1024;
            if (i25 != 0) {
                i26 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i11 | i27;
            } else {
                i26 = i11;
            }
            if ((i11 & 112) != 0) {
                i26 |= ((i12 & 2048) == 0 || !composerStartRestartGroup.changed(textFieldColors)) ? 16 : 32;
            }
            if ((i11 & 896) != 0) {
                i26 |= ((i12 & 4096) == 0 || !composerStartRestartGroup.changed(paddingValues)) ? 128 : 256;
            }
            i28 = i26;
            i29 = i12 & 8192;
            if (i29 != 0) {
                if ((i11 & 7168) == 0) {
                    i28 |= composerStartRestartGroup.changedInstance(function6) ? 2048 : 1024;
                }
                if ((i12 & 16384) != 0) {
                    if ((i11 & 57344) == 0) {
                        i28 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                        }
                        int i31111111114 = i13 << 3;
                        int i31111111115 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i31111111114 & 896) | (i31111111114 & 112) | 6 | ((i13 >> 3) & 7168) | (i31111111115 & 57344) | (458752 & i31111111115) | (i31111111115 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function14 = function11;
                        function15 = function12;
                        function16 = function10;
                        function17 = function13;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function18 = function2ComposableLambda;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function7 = null;
                            } else {
                                function7 = function2;
                            }
                            if (i21 != 0) {
                                function8 = null;
                            } else {
                                function8 = function3;
                            }
                            if (i23 != 0) {
                                function9 = null;
                            } else {
                                function9 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function10 = function9;
                            if ((i12 & 4096) != 0) {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i28 &= -897;
                            } else {
                                paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i29 != 0) {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                            } else {
                                paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                                textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                                function2ComposableLambda = function6;
                            }
                            function11 = function7;
                            z14 = z13;
                            function12 = function8;
                            function13 = function19;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                        }
                        int i31111111116 = i13 << 3;
                        int i31111111117 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i31111111116 & 896) | (i31111111116 & 112) | 6 | ((i13 >> 3) & 7168) | (i31111111117 & 57344) | (458752 & i31111111117) | (i31111111117 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function14 = function11;
                        function15 = function12;
                        function16 = function10;
                        function17 = function13;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                        function18 = function2ComposableLambda;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
                }
                i28 |= 24576;
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                    }
                    int i31111111118 = i13 << 3;
                    int i31111111119 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i31111111118 & 896) | (i31111111118 & 112) | 6 | ((i13 >> 3) & 7168) | (i31111111119 & 57344) | (458752 & i31111111119) | (i31111111119 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function14 = function11;
                    function15 = function12;
                    function16 = function10;
                    function17 = function13;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function18 = function2ComposableLambda;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                    }
                    int i311111111110 = i13 << 3;
                    int i311111111111 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i311111111110 & 896) | (i311111111110 & 112) | 6 | ((i13 >> 3) & 7168) | (i311111111111 & 57344) | (458752 & i311111111111) | (i311111111111 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function14 = function11;
                    function15 = function12;
                    function16 = function10;
                    function17 = function13;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function18 = function2ComposableLambda;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
            }
            i28 |= 3072;
            if ((i12 & 16384) != 0) {
                if ((i11 & 57344) == 0) {
                    i28 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                    }
                    int i311111111112 = i13 << 3;
                    int i311111111113 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i311111111112 & 896) | (i311111111112 & 112) | 6 | ((i13 >> 3) & 7168) | (i311111111113 & 57344) | (458752 & i311111111113) | (i311111111113 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function14 = function11;
                    function15 = function12;
                    function16 = function10;
                    function17 = function13;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function18 = function2ComposableLambda;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                    }
                    int i311111111114 = i13 << 3;
                    int i311111111115 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i311111111114 & 896) | (i311111111114 & 112) | 6 | ((i13 >> 3) & 7168) | (i311111111115 & 57344) | (458752 & i311111111115) | (i311111111115 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function14 = function11;
                    function15 = function12;
                    function16 = function10;
                    function17 = function13;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function18 = function2ComposableLambda;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
            }
            i28 |= 24576;
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i21 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i23 != 0) {
                        function9 = null;
                    } else {
                        function9 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function10 = function9;
                    if ((i12 & 4096) != 0) {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i28 &= -897;
                    } else {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i29 != 0) {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                    } else {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = function6;
                    }
                    function11 = function7;
                    z14 = z13;
                    function12 = function8;
                    function13 = function19;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i21 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i23 != 0) {
                        function9 = null;
                    } else {
                        function9 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function10 = function9;
                    if ((i12 & 4096) != 0) {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i28 &= -897;
                    } else {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i29 != 0) {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                    } else {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = function6;
                    }
                    function11 = function7;
                    z14 = z13;
                    function12 = function8;
                    function13 = function19;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                }
                int i311111111116 = i13 << 3;
                int i311111111117 = i13 >> 9;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i311111111116 & 896) | (i311111111116 & 112) | 6 | ((i13 >> 3) & 7168) | (i311111111117 & 57344) | (458752 & i311111111117) | (i311111111117 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function14 = function11;
                function15 = function12;
                function16 = function10;
                function17 = function13;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
                function18 = function2ComposableLambda;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i21 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i23 != 0) {
                        function9 = null;
                    } else {
                        function9 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function10 = function9;
                    if ((i12 & 4096) != 0) {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i28 &= -897;
                    } else {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i29 != 0) {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                    } else {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = function6;
                    }
                    function11 = function7;
                    z14 = z13;
                    function12 = function8;
                    function13 = function19;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i21 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i23 != 0) {
                        function9 = null;
                    } else {
                        function9 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function10 = function9;
                    if ((i12 & 4096) != 0) {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i28 &= -897;
                    } else {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i29 != 0) {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                    } else {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = function6;
                    }
                    function11 = function7;
                    z14 = z13;
                    function12 = function8;
                    function13 = function19;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                }
                int i311111111118 = i13 << 3;
                int i311111111119 = i13 >> 9;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i311111111118 & 896) | (i311111111118 & 112) | 6 | ((i13 >> 3) & 7168) | (i311111111119 & 57344) | (458752 & i311111111119) | (i311111111119 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function14 = function11;
                function15 = function12;
                function16 = function10;
                function17 = function13;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
                function18 = function2ComposableLambda;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
        }
        i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i13 |= i16;
        i17 = i12 & 64;
        if (i17 != 0) {
            i13 |= 1572864;
        } else if ((i10 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(z12)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i13 |= i18;
        }
        i19 = i12 & 128;
        if (i19 != 0) {
            i13 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i13 |= i20;
        }
        i21 = i12 & 256;
        if (i21 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i22 = 33554432;
            }
            i13 |= i22;
        }
        i23 = i12 & 512;
        if (i23 != 0) {
            i13 |= 805306368;
        } else if ((i10 & 1879048192) == 0) {
            if (composerStartRestartGroup.changedInstance(function4)) {
                i24 = PKIFailureInfo.duplicateCertReq;
            } else {
                i24 = 268435456;
            }
            i13 |= i24;
        }
        i25 = i12 & 1024;
        if (i25 != 0) {
            i26 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (composerStartRestartGroup.changedInstance(function5)) {
                i27 = 4;
            } else {
                i27 = 2;
            }
            i26 = i11 | i27;
        } else {
            i26 = i11;
        }
        if ((i11 & 112) != 0) {
            i26 |= ((i12 & 2048) == 0 || !composerStartRestartGroup.changed(textFieldColors)) ? 16 : 32;
        }
        if ((i11 & 896) != 0) {
            i26 |= ((i12 & 4096) == 0 || !composerStartRestartGroup.changed(paddingValues)) ? 128 : 256;
        }
        i28 = i26;
        i29 = i12 & 8192;
        if (i29 != 0) {
            if ((i11 & 7168) == 0) {
                i28 |= composerStartRestartGroup.changedInstance(function6) ? 2048 : 1024;
            }
            if ((i12 & 16384) != 0) {
                if ((i11 & 57344) == 0) {
                    i28 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                    }
                    int i3111111111110 = i13 << 3;
                    int i3111111111111 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i3111111111110 & 896) | (i3111111111110 & 112) | 6 | ((i13 >> 3) & 7168) | (i3111111111111 & 57344) | (458752 & i3111111111111) | (i3111111111111 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function14 = function11;
                    function15 = function12;
                    function16 = function10;
                    function17 = function13;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function18 = function2ComposableLambda;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function7 = null;
                        } else {
                            function7 = function2;
                        }
                        if (i21 != 0) {
                            function8 = null;
                        } else {
                            function8 = function3;
                        }
                        if (i23 != 0) {
                            function9 = null;
                        } else {
                            function9 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function10 = function9;
                        if ((i12 & 4096) != 0) {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i28 &= -897;
                        } else {
                            paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i29 != 0) {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                        } else {
                            paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                            textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                            function2ComposableLambda = function6;
                        }
                        function11 = function7;
                        z14 = z13;
                        function12 = function8;
                        function13 = function19;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                    }
                    int i3111111111112 = i13 << 3;
                    int i3111111111113 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i3111111111112 & 896) | (i3111111111112 & 112) | 6 | ((i13 >> 3) & 7168) | (i3111111111113 & 57344) | (458752 & i3111111111113) | (i3111111111113 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function14 = function11;
                    function15 = function12;
                    function16 = function10;
                    function17 = function13;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                    function18 = function2ComposableLambda;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
            }
            i28 |= 24576;
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i21 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i23 != 0) {
                        function9 = null;
                    } else {
                        function9 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function10 = function9;
                    if ((i12 & 4096) != 0) {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i28 &= -897;
                    } else {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i29 != 0) {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                    } else {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = function6;
                    }
                    function11 = function7;
                    z14 = z13;
                    function12 = function8;
                    function13 = function19;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i21 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i23 != 0) {
                        function9 = null;
                    } else {
                        function9 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function10 = function9;
                    if ((i12 & 4096) != 0) {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i28 &= -897;
                    } else {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i29 != 0) {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                    } else {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = function6;
                    }
                    function11 = function7;
                    z14 = z13;
                    function12 = function8;
                    function13 = function19;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                }
                int i3111111111114 = i13 << 3;
                int i3111111111115 = i13 >> 9;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i3111111111114 & 896) | (i3111111111114 & 112) | 6 | ((i13 >> 3) & 7168) | (i3111111111115 & 57344) | (458752 & i3111111111115) | (i3111111111115 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function14 = function11;
                function15 = function12;
                function16 = function10;
                function17 = function13;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
                function18 = function2ComposableLambda;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i21 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i23 != 0) {
                        function9 = null;
                    } else {
                        function9 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function10 = function9;
                    if ((i12 & 4096) != 0) {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i28 &= -897;
                    } else {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i29 != 0) {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                    } else {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = function6;
                    }
                    function11 = function7;
                    z14 = z13;
                    function12 = function8;
                    function13 = function19;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i21 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i23 != 0) {
                        function9 = null;
                    } else {
                        function9 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function10 = function9;
                    if ((i12 & 4096) != 0) {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i28 &= -897;
                    } else {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i29 != 0) {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                    } else {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = function6;
                    }
                    function11 = function7;
                    z14 = z13;
                    function12 = function8;
                    function13 = function19;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                }
                int i3111111111116 = i13 << 3;
                int i3111111111117 = i13 >> 9;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i3111111111116 & 896) | (i3111111111116 & 112) | 6 | ((i13 >> 3) & 7168) | (i3111111111117 & 57344) | (458752 & i3111111111117) | (i3111111111117 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function14 = function11;
                function15 = function12;
                function16 = function10;
                function17 = function13;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
                function18 = function2ComposableLambda;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
        }
        i28 |= 3072;
        if ((i12 & 16384) != 0) {
            if ((i11 & 57344) == 0) {
                i28 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
            }
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i21 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i23 != 0) {
                        function9 = null;
                    } else {
                        function9 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function10 = function9;
                    if ((i12 & 4096) != 0) {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i28 &= -897;
                    } else {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i29 != 0) {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                    } else {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = function6;
                    }
                    function11 = function7;
                    z14 = z13;
                    function12 = function8;
                    function13 = function19;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i21 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i23 != 0) {
                        function9 = null;
                    } else {
                        function9 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function10 = function9;
                    if ((i12 & 4096) != 0) {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i28 &= -897;
                    } else {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i29 != 0) {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                    } else {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = function6;
                    }
                    function11 = function7;
                    z14 = z13;
                    function12 = function8;
                    function13 = function19;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                }
                int i3111111111118 = i13 << 3;
                int i3111111111119 = i13 >> 9;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i3111111111118 & 896) | (i3111111111118 & 112) | 6 | ((i13 >> 3) & 7168) | (i3111111111119 & 57344) | (458752 & i3111111111119) | (i3111111111119 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function14 = function11;
                function15 = function12;
                function16 = function10;
                function17 = function13;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
                function18 = function2ComposableLambda;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i21 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i23 != 0) {
                        function9 = null;
                    } else {
                        function9 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function10 = function9;
                    if ((i12 & 4096) != 0) {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i28 &= -897;
                    } else {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i29 != 0) {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                    } else {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = function6;
                    }
                    function11 = function7;
                    z14 = z13;
                    function12 = function8;
                    function13 = function19;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function7 = null;
                    } else {
                        function7 = function2;
                    }
                    if (i21 != 0) {
                        function8 = null;
                    } else {
                        function8 = function3;
                    }
                    if (i23 != 0) {
                        function9 = null;
                    } else {
                        function9 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function10 = function9;
                    if ((i12 & 4096) != 0) {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i28 &= -897;
                    } else {
                        paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i29 != 0) {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                    } else {
                        paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                        textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                        function2ComposableLambda = function6;
                    }
                    function11 = function7;
                    z14 = z13;
                    function12 = function8;
                    function13 = function19;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
                }
                int i31111111111110 = i13 << 3;
                int i31111111111111 = i13 >> 9;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i31111111111110 & 896) | (i31111111111110 & 112) | 6 | ((i13 >> 3) & 7168) | (i31111111111111 & 57344) | (458752 & i31111111111111) | (i31111111111111 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function14 = function11;
                function15 = function12;
                function16 = function10;
                function17 = function13;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
                function18 = function2ComposableLambda;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
        }
        i28 |= 24576;
        if ((i13 & 1533916891) != 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (i19 != 0) {
                    function7 = null;
                } else {
                    function7 = function2;
                }
                if (i21 != 0) {
                    function8 = null;
                } else {
                    function8 = function3;
                }
                if (i23 != 0) {
                    function9 = null;
                } else {
                    function9 = function4;
                }
                if (i25 == 0) {
                }
                if ((i12 & 2048) != 0) {
                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                    i28 &= -113;
                } else {
                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                }
                function10 = function9;
                if ((i12 & 4096) != 0) {
                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    i28 &= -897;
                } else {
                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                }
                if (i29 != 0) {
                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                } else {
                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                    function2ComposableLambda = function6;
                }
                function11 = function7;
                z14 = z13;
                function12 = function8;
                function13 = function19;
            } else {
                if (i17 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (i19 != 0) {
                    function7 = null;
                } else {
                    function7 = function2;
                }
                if (i21 != 0) {
                    function8 = null;
                } else {
                    function8 = function3;
                }
                if (i23 != 0) {
                    function9 = null;
                } else {
                    function9 = function4;
                }
                if (i25 == 0) {
                }
                if ((i12 & 2048) != 0) {
                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                    i28 &= -113;
                } else {
                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                }
                function10 = function9;
                if ((i12 & 4096) != 0) {
                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    i28 &= -897;
                } else {
                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                }
                if (i29 != 0) {
                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                } else {
                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                    function2ComposableLambda = function6;
                }
                function11 = function7;
                z14 = z13;
                function12 = function8;
                function13 = function19;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
            }
            int i31111111111112 = i13 << 3;
            int i31111111111113 = i13 >> 9;
            composer2 = composerStartRestartGroup;
            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i31111111111112 & 896) | (i31111111111112 & 112) | 6 | ((i13 >> 3) & 7168) | (i31111111111113 & 57344) | (458752 & i31111111111113) | (i31111111111113 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z15 = z14;
            function14 = function11;
            function15 = function12;
            function16 = function10;
            function17 = function13;
            textFieldColors3 = textFieldColors2;
            paddingValues3 = paddingValues2;
            function18 = function2ComposableLambda;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (i19 != 0) {
                    function7 = null;
                } else {
                    function7 = function2;
                }
                if (i21 != 0) {
                    function8 = null;
                } else {
                    function8 = function3;
                }
                if (i23 != 0) {
                    function9 = null;
                } else {
                    function9 = function4;
                }
                if (i25 == 0) {
                }
                if ((i12 & 2048) != 0) {
                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                    i28 &= -113;
                } else {
                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                }
                function10 = function9;
                if ((i12 & 4096) != 0) {
                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    i28 &= -897;
                } else {
                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                }
                if (i29 != 0) {
                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                } else {
                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                    function2ComposableLambda = function6;
                }
                function11 = function7;
                z14 = z13;
                function12 = function8;
                function13 = function19;
            } else {
                if (i17 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (i19 != 0) {
                    function7 = null;
                } else {
                    function7 = function2;
                }
                if (i21 != 0) {
                    function8 = null;
                } else {
                    function8 = function3;
                }
                if (i23 != 0) {
                    function9 = null;
                } else {
                    function9 = function4;
                }
                if (i25 == 0) {
                }
                if ((i12 & 2048) != 0) {
                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = m869outlinedTextFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 9) & 112, 2097151);
                    i28 &= -113;
                } else {
                    textFieldColorsM869outlinedTextFieldColorsdx8h9Zs = textFieldColors;
                }
                function10 = function9;
                if ((i12 & 4096) != 0) {
                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = m860outlinedTextFieldPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    i28 &= -897;
                } else {
                    paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default = paddingValues;
                }
                if (i29 != 0) {
                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1261916269, true, new b(i13, i28, interactionSource, textFieldColorsM869outlinedTextFieldColorsdx8h9Zs, z10, z13));
                } else {
                    paddingValues2 = paddingValuesM860outlinedTextFieldPaddinga9UjIt4$default;
                    textFieldColors2 = textFieldColorsM869outlinedTextFieldColorsdx8h9Zs;
                    function2ComposableLambda = function6;
                }
                function11 = function7;
                z14 = z13;
                function12 = function8;
                function13 = function19;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1280721485, i13, i28, "androidx.compose.material.TextFieldDefaults.OutlinedTextFieldDecorationBox (TextFieldDefaults.kt:634)");
            }
            int i31111111111114 = i13 << 3;
            int i31111111111115 = i13 >> 9;
            composer2 = composerStartRestartGroup;
            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, value, innerTextField, visualTransformation, function11, function12, function10, function13, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, function2ComposableLambda, composer2, (i31111111111114 & 896) | (i31111111111114 & 112) | 6 | ((i13 >> 3) & 7168) | (i31111111111115 & 57344) | (458752 & i31111111111115) | (i31111111111115 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168) | ((i28 << 3) & 57344), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z15 = z14;
            function14 = function11;
            function15 = function12;
            function16 = function10;
            function17 = function13;
            textFieldColors3 = textFieldColors2;
            paddingValues3 = paddingValues2;
            function18 = function2ComposableLambda;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function14, function15, function16, function17, textFieldColors3, paddingValues3, function18, i10, i11, i12));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0142  */
    /* JADX WARN: Code duplicated, block: B:102:0x0148  */
    /* JADX WARN: Code duplicated, block: B:103:0x014b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0153  */
    /* JADX WARN: Code duplicated, block: B:108:0x0158  */
    /* JADX WARN: Code duplicated, block: B:110:0x015e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0164  */
    /* JADX WARN: Code duplicated, block: B:113:0x0167  */
    /* JADX WARN: Code duplicated, block: B:115:0x016c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0172  */
    /* JADX WARN: Code duplicated, block: B:120:0x0176  */
    /* JADX WARN: Code duplicated, block: B:123:0x0181 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x0188  */
    /* JADX WARN: Code duplicated, block: B:129:0x018e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0192  */
    /* JADX WARN: Code duplicated, block: B:134:0x019b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:147:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:159:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:169:0x0219 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x021b  */
    /* JADX WARN: Code duplicated, block: B:171:0x021d  */
    /* JADX WARN: Code duplicated, block: B:174:0x0222  */
    /* JADX WARN: Code duplicated, block: B:175:0x0224  */
    /* JADX WARN: Code duplicated, block: B:177:0x0228  */
    /* JADX WARN: Code duplicated, block: B:178:0x022a  */
    /* JADX WARN: Code duplicated, block: B:180:0x022e  */
    /* JADX WARN: Code duplicated, block: B:181:0x0230  */
    /* JADX WARN: Code duplicated, block: B:184:0x0235  */
    /* JADX WARN: Code duplicated, block: B:187:0x023b  */
    /* JADX WARN: Code duplicated, block: B:188:0x027b  */
    /* JADX WARN: Code duplicated, block: B:191:0x0283 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:192:0x0285  */
    /* JADX WARN: Code duplicated, block: B:193:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:196:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:199:0x02df  */
    /* JADX WARN: Code duplicated, block: B:202:0x0351  */
    /* JADX WARN: Code duplicated, block: B:207:0x0369  */
    /* JADX WARN: Code duplicated, block: B:209:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0081  */
    /* JADX WARN: Code duplicated, block: B:38:0x0086  */
    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0092  */
    /* JADX WARN: Code duplicated, block: B:43:0x0095  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:80:0x0102  */
    /* JADX WARN: Code duplicated, block: B:82:0x0108  */
    /* JADX WARN: Code duplicated, block: B:83:0x010b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0113  */
    /* JADX WARN: Code duplicated, block: B:88:0x011a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0122  */
    /* JADX WARN: Code duplicated, block: B:92:0x0128  */
    /* JADX WARN: Code duplicated, block: B:93:0x012b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0133  */
    /* JADX WARN: Code duplicated, block: B:98:0x013a  */
    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void TextFieldDecorationBox(@NotNull String value, @NotNull Function2<? super Composer, ? super Integer, Unit> innerTextField, boolean z10, boolean z11, @NotNull VisualTransformation visualTransformation, @NotNull InteractionSource interactionSource, boolean z12, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function4, @Nullable Function2<? super Composer, ? super Integer, Unit> function5, @Nullable TextFieldColors textFieldColors, @Nullable PaddingValues paddingValues, @Nullable Composer composer, int i10, int i11, int i12) {
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
        boolean z13;
        Function2<? super Composer, ? super Integer, Unit> function6;
        Function2<? super Composer, ? super Integer, Unit> function7;
        Function2<? super Composer, ? super Integer, Unit> function8;
        TextFieldColors textFieldColorsM871textFieldColorsdx8h9Zs;
        Function2<? super Composer, ? super Integer, Unit> function9;
        PaddingValues paddingValues2;
        TextFieldColors textFieldColors2;
        boolean z14;
        Function2<? super Composer, ? super Integer, Unit> function10;
        Function2<? super Composer, ? super Integer, Unit> function11;
        Function2<? super Composer, ? super Integer, Unit> function12;
        PaddingValues paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
        Composer composer2;
        boolean z15;
        Function2<? super Composer, ? super Integer, Unit> function13;
        Function2<? super Composer, ? super Integer, Unit> function14;
        Function2<? super Composer, ? super Integer, Unit> function15;
        Function2<? super Composer, ? super Integer, Unit> function16;
        TextFieldColors textFieldColors3;
        PaddingValues paddingValues3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        Intrinsics.checkNotNullParameter(visualTransformation, "visualTransformation");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Composer composerStartRestartGroup = composer.startRestartGroup(1171040065);
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
                if ((i12 & 16) != 0) {
                    i13 |= 24576;
                } else if ((i10 & 57344) == 0) {
                    if (composerStartRestartGroup.changed(visualTransformation)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i13 |= i15;
                }
                if ((i12 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(interactionSource)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                    }
                    i17 = i12 & 64;
                    if (i17 != 0) {
                        i13 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z12)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i13 |= i18;
                    }
                    i19 = i12 & 128;
                    if (i19 != 0) {
                        i13 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i13 |= i20;
                    }
                    i21 = i12 & 256;
                    if (i21 != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i22 = 33554432;
                        }
                        i13 |= i22;
                    }
                    i23 = i12 & 512;
                    if (i23 != 0) {
                        i13 |= 805306368;
                    } else if ((i10 & 1879048192) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i24 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i24 = 268435456;
                        }
                        i13 |= i24;
                    }
                    i25 = i12 & 1024;
                    if (i25 != 0) {
                        i26 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i27 = 4;
                        } else {
                            i27 = 2;
                        }
                        i26 = i11 | i27;
                    } else {
                        i26 = i11;
                    }
                    if ((i11 & 112) != 0) {
                        i26 |= ((i12 & 2048) == 0 || !composerStartRestartGroup.changed(textFieldColors)) ? 16 : 32;
                    }
                    if ((i11 & 896) != 0) {
                        i26 |= ((i12 & 4096) == 0 || !composerStartRestartGroup.changed(paddingValues)) ? 128 : 256;
                    }
                    i28 = i26;
                    if ((i12 & 8192) != 0) {
                        if ((i11 & 7168) == 0) {
                            i28 |= composerStartRestartGroup.changed(this) ? 2048 : 1024;
                        }
                        if ((i13 & 1533916891) != 306783378 && (i28 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            z15 = z12;
                            function13 = function2;
                            function14 = function3;
                            function15 = function4;
                            function16 = function5;
                            textFieldColors3 = textFieldColors;
                            paddingValues3 = paddingValues;
                            composer2 = composerStartRestartGroup;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i17 != 0) {
                                    z13 = false;
                                } else {
                                    z13 = z12;
                                }
                                if (i19 != 0) {
                                    function6 = null;
                                } else {
                                    function6 = function2;
                                }
                                if (i21 != 0) {
                                    function7 = null;
                                } else {
                                    function7 = function3;
                                }
                                if (i23 != 0) {
                                    function8 = null;
                                } else {
                                    function8 = function4;
                                }
                                Function2<? super Composer, ? super Integer, Unit> function17 = i25 == 0 ? function5 : null;
                                if ((i12 & 2048) != 0) {
                                    textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                                    i28 &= -113;
                                } else {
                                    textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                                }
                                function9 = function8;
                                if ((i12 & 4096) != 0) {
                                    if (function6 == null) {
                                        paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    } else {
                                        paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    }
                                    i28 &= -897;
                                    paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                                } else {
                                    paddingValues2 = paddingValues;
                                }
                                textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                                z14 = z13;
                                function10 = function6;
                                function11 = function17;
                                function12 = function7;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i12 & 2048) != 0) {
                                    i28 &= -113;
                                }
                                if ((i12 & 4096) != 0) {
                                    i28 &= -897;
                                }
                                z14 = z12;
                                function10 = function2;
                                function12 = function3;
                                function9 = function4;
                                function11 = function5;
                                textFieldColors2 = textFieldColors;
                                paddingValues2 = paddingValues;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                            }
                            int i29 = i13 << 3;
                            int i30 = i13 >> 9;
                            composer2 = composerStartRestartGroup;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i29 & 896) | (i29 & 112) | 6 | ((i13 >> 3) & 7168) | (i30 & 57344) | (i30 & 458752) | (i30 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z15 = z14;
                            function13 = function10;
                            function14 = function12;
                            function15 = function9;
                            function16 = function11;
                            textFieldColors3 = textFieldColors2;
                            paddingValues3 = paddingValues2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function13, function14, function15, function16, textFieldColors3, paddingValues3, i10, i11, i12));
                    }
                    i28 |= 3072;
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i21 != 0) {
                                function7 = null;
                            } else {
                                function7 = function3;
                            }
                            if (i23 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function9 = function8;
                            if ((i12 & 4096) != 0) {
                                if (function6 == null) {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i28 &= -897;
                                paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                            } else {
                                paddingValues2 = paddingValues;
                            }
                            textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                            z14 = z13;
                            function10 = function6;
                            function11 = function17;
                            function12 = function7;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i21 != 0) {
                                function7 = null;
                            } else {
                                function7 = function3;
                            }
                            if (i23 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function9 = function8;
                            if ((i12 & 4096) != 0) {
                                if (function6 == null) {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i28 &= -897;
                                paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                            } else {
                                paddingValues2 = paddingValues;
                            }
                            textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                            z14 = z13;
                            function10 = function6;
                            function11 = function17;
                            function12 = function7;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                        }
                        int i210 = i13 << 3;
                        int i31 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i210 & 896) | (i210 & 112) | 6 | ((i13 >> 3) & 7168) | (i31 & 57344) | (i31 & 458752) | (i31 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function13 = function10;
                        function14 = function12;
                        function15 = function9;
                        function16 = function11;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i21 != 0) {
                                function7 = null;
                            } else {
                                function7 = function3;
                            }
                            if (i23 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function9 = function8;
                            if ((i12 & 4096) != 0) {
                                if (function6 == null) {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i28 &= -897;
                                paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                            } else {
                                paddingValues2 = paddingValues;
                            }
                            textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                            z14 = z13;
                            function10 = function6;
                            function11 = function17;
                            function12 = function7;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i21 != 0) {
                                function7 = null;
                            } else {
                                function7 = function3;
                            }
                            if (i23 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function9 = function8;
                            if ((i12 & 4096) != 0) {
                                if (function6 == null) {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i28 &= -897;
                                paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                            } else {
                                paddingValues2 = paddingValues;
                            }
                            textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                            z14 = z13;
                            function10 = function6;
                            function11 = function17;
                            function12 = function7;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                        }
                        int i211 = i13 << 3;
                        int i32 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i211 & 896) | (i211 & 112) | 6 | ((i13 >> 3) & 7168) | (i32 & 57344) | (i32 & 458752) | (i32 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function13 = function10;
                        function14 = function12;
                        function15 = function9;
                        function16 = function11;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function13, function14, function15, function16, textFieldColors3, paddingValues3, i10, i11, i12));
                }
                i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i13 |= i16;
                i17 = i12 & 64;
                if (i17 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z12)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i22 = 33554432;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i24 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                if ((i11 & 112) != 0) {
                    i26 |= ((i12 & 2048) == 0 || !composerStartRestartGroup.changed(textFieldColors)) ? 16 : 32;
                }
                if ((i11 & 896) != 0) {
                    i26 |= ((i12 & 4096) == 0 || !composerStartRestartGroup.changed(paddingValues)) ? 128 : 256;
                }
                i28 = i26;
                if ((i12 & 8192) != 0) {
                    if ((i11 & 7168) == 0) {
                        i28 |= composerStartRestartGroup.changed(this) ? 2048 : 1024;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i21 != 0) {
                                function7 = null;
                            } else {
                                function7 = function3;
                            }
                            if (i23 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function9 = function8;
                            if ((i12 & 4096) != 0) {
                                if (function6 == null) {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i28 &= -897;
                                paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                            } else {
                                paddingValues2 = paddingValues;
                            }
                            textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                            z14 = z13;
                            function10 = function6;
                            function11 = function17;
                            function12 = function7;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i21 != 0) {
                                function7 = null;
                            } else {
                                function7 = function3;
                            }
                            if (i23 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function9 = function8;
                            if ((i12 & 4096) != 0) {
                                if (function6 == null) {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i28 &= -897;
                                paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                            } else {
                                paddingValues2 = paddingValues;
                            }
                            textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                            z14 = z13;
                            function10 = function6;
                            function11 = function17;
                            function12 = function7;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                        }
                        int i212 = i13 << 3;
                        int i33 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i212 & 896) | (i212 & 112) | 6 | ((i13 >> 3) & 7168) | (i33 & 57344) | (i33 & 458752) | (i33 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function13 = function10;
                        function14 = function12;
                        function15 = function9;
                        function16 = function11;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i21 != 0) {
                                function7 = null;
                            } else {
                                function7 = function3;
                            }
                            if (i23 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function9 = function8;
                            if ((i12 & 4096) != 0) {
                                if (function6 == null) {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i28 &= -897;
                                paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                            } else {
                                paddingValues2 = paddingValues;
                            }
                            textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                            z14 = z13;
                            function10 = function6;
                            function11 = function17;
                            function12 = function7;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i21 != 0) {
                                function7 = null;
                            } else {
                                function7 = function3;
                            }
                            if (i23 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function9 = function8;
                            if ((i12 & 4096) != 0) {
                                if (function6 == null) {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i28 &= -897;
                                paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                            } else {
                                paddingValues2 = paddingValues;
                            }
                            textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                            z14 = z13;
                            function10 = function6;
                            function11 = function17;
                            function12 = function7;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                        }
                        int i213 = i13 << 3;
                        int i34 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i213 & 896) | (i213 & 112) | 6 | ((i13 >> 3) & 7168) | (i34 & 57344) | (i34 & 458752) | (i34 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function13 = function10;
                        function14 = function12;
                        function15 = function9;
                        function16 = function11;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function13, function14, function15, function16, textFieldColors3, paddingValues3, i10, i11, i12));
                }
                i28 |= 3072;
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i21 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i23 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function9 = function8;
                        if ((i12 & 4096) != 0) {
                            if (function6 == null) {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i28 &= -897;
                            paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                        } else {
                            paddingValues2 = paddingValues;
                        }
                        textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                        z14 = z13;
                        function10 = function6;
                        function11 = function17;
                        function12 = function7;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i21 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i23 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function9 = function8;
                        if ((i12 & 4096) != 0) {
                            if (function6 == null) {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i28 &= -897;
                            paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                        } else {
                            paddingValues2 = paddingValues;
                        }
                        textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                        z14 = z13;
                        function10 = function6;
                        function11 = function17;
                        function12 = function7;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                    }
                    int i214 = i13 << 3;
                    int i35 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i214 & 896) | (i214 & 112) | 6 | ((i13 >> 3) & 7168) | (i35 & 57344) | (i35 & 458752) | (i35 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function13 = function10;
                    function14 = function12;
                    function15 = function9;
                    function16 = function11;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i21 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i23 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function9 = function8;
                        if ((i12 & 4096) != 0) {
                            if (function6 == null) {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i28 &= -897;
                            paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                        } else {
                            paddingValues2 = paddingValues;
                        }
                        textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                        z14 = z13;
                        function10 = function6;
                        function11 = function17;
                        function12 = function7;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i21 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i23 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function9 = function8;
                        if ((i12 & 4096) != 0) {
                            if (function6 == null) {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i28 &= -897;
                            paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                        } else {
                            paddingValues2 = paddingValues;
                        }
                        textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                        z14 = z13;
                        function10 = function6;
                        function11 = function17;
                        function12 = function7;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                    }
                    int i215 = i13 << 3;
                    int i36 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i215 & 896) | (i215 & 112) | 6 | ((i13 >> 3) & 7168) | (i36 & 57344) | (i36 & 458752) | (i36 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function13 = function10;
                    function14 = function12;
                    function15 = function9;
                    function16 = function11;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function13, function14, function15, function16, textFieldColors3, paddingValues3, i10, i11, i12));
            }
            i13 |= 3072;
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i10 & 57344) == 0) {
                if (composerStartRestartGroup.changed(visualTransformation)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            if ((i12 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(interactionSource)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                }
                i17 = i12 & 64;
                if (i17 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z12)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i22 = 33554432;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i24 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                if ((i11 & 112) != 0) {
                    i26 |= ((i12 & 2048) == 0 || !composerStartRestartGroup.changed(textFieldColors)) ? 16 : 32;
                }
                if ((i11 & 896) != 0) {
                    i26 |= ((i12 & 4096) == 0 || !composerStartRestartGroup.changed(paddingValues)) ? 128 : 256;
                }
                i28 = i26;
                if ((i12 & 8192) != 0) {
                    if ((i11 & 7168) == 0) {
                        i28 |= composerStartRestartGroup.changed(this) ? 2048 : 1024;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i21 != 0) {
                                function7 = null;
                            } else {
                                function7 = function3;
                            }
                            if (i23 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function9 = function8;
                            if ((i12 & 4096) != 0) {
                                if (function6 == null) {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i28 &= -897;
                                paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                            } else {
                                paddingValues2 = paddingValues;
                            }
                            textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                            z14 = z13;
                            function10 = function6;
                            function11 = function17;
                            function12 = function7;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i21 != 0) {
                                function7 = null;
                            } else {
                                function7 = function3;
                            }
                            if (i23 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function9 = function8;
                            if ((i12 & 4096) != 0) {
                                if (function6 == null) {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i28 &= -897;
                                paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                            } else {
                                paddingValues2 = paddingValues;
                            }
                            textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                            z14 = z13;
                            function10 = function6;
                            function11 = function17;
                            function12 = function7;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                        }
                        int i216 = i13 << 3;
                        int i37 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i216 & 896) | (i216 & 112) | 6 | ((i13 >> 3) & 7168) | (i37 & 57344) | (i37 & 458752) | (i37 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function13 = function10;
                        function14 = function12;
                        function15 = function9;
                        function16 = function11;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i21 != 0) {
                                function7 = null;
                            } else {
                                function7 = function3;
                            }
                            if (i23 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function9 = function8;
                            if ((i12 & 4096) != 0) {
                                if (function6 == null) {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i28 &= -897;
                                paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                            } else {
                                paddingValues2 = paddingValues;
                            }
                            textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                            z14 = z13;
                            function10 = function6;
                            function11 = function17;
                            function12 = function7;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i21 != 0) {
                                function7 = null;
                            } else {
                                function7 = function3;
                            }
                            if (i23 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function9 = function8;
                            if ((i12 & 4096) != 0) {
                                if (function6 == null) {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i28 &= -897;
                                paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                            } else {
                                paddingValues2 = paddingValues;
                            }
                            textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                            z14 = z13;
                            function10 = function6;
                            function11 = function17;
                            function12 = function7;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                        }
                        int i217 = i13 << 3;
                        int i38 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i217 & 896) | (i217 & 112) | 6 | ((i13 >> 3) & 7168) | (i38 & 57344) | (i38 & 458752) | (i38 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function13 = function10;
                        function14 = function12;
                        function15 = function9;
                        function16 = function11;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function13, function14, function15, function16, textFieldColors3, paddingValues3, i10, i11, i12));
                }
                i28 |= 3072;
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i21 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i23 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function9 = function8;
                        if ((i12 & 4096) != 0) {
                            if (function6 == null) {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i28 &= -897;
                            paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                        } else {
                            paddingValues2 = paddingValues;
                        }
                        textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                        z14 = z13;
                        function10 = function6;
                        function11 = function17;
                        function12 = function7;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i21 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i23 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function9 = function8;
                        if ((i12 & 4096) != 0) {
                            if (function6 == null) {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i28 &= -897;
                            paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                        } else {
                            paddingValues2 = paddingValues;
                        }
                        textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                        z14 = z13;
                        function10 = function6;
                        function11 = function17;
                        function12 = function7;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                    }
                    int i218 = i13 << 3;
                    int i39 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i218 & 896) | (i218 & 112) | 6 | ((i13 >> 3) & 7168) | (i39 & 57344) | (i39 & 458752) | (i39 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function13 = function10;
                    function14 = function12;
                    function15 = function9;
                    function16 = function11;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i21 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i23 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function9 = function8;
                        if ((i12 & 4096) != 0) {
                            if (function6 == null) {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i28 &= -897;
                            paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                        } else {
                            paddingValues2 = paddingValues;
                        }
                        textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                        z14 = z13;
                        function10 = function6;
                        function11 = function17;
                        function12 = function7;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i21 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i23 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function9 = function8;
                        if ((i12 & 4096) != 0) {
                            if (function6 == null) {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i28 &= -897;
                            paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                        } else {
                            paddingValues2 = paddingValues;
                        }
                        textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                        z14 = z13;
                        function10 = function6;
                        function11 = function17;
                        function12 = function7;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                    }
                    int i219 = i13 << 3;
                    int i310 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i219 & 896) | (i219 & 112) | 6 | ((i13 >> 3) & 7168) | (i310 & 57344) | (i310 & 458752) | (i310 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function13 = function10;
                    function14 = function12;
                    function15 = function9;
                    function16 = function11;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function13, function14, function15, function16, textFieldColors3, paddingValues3, i10, i11, i12));
            }
            i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i13 |= i16;
            i17 = i12 & 64;
            if (i17 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z12)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i13 |= i18;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i13 |= i20;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i22 = 33554432;
                }
                i13 |= i22;
            }
            i23 = i12 & 512;
            if (i23 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i24 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i24 = 268435456;
                }
                i13 |= i24;
            }
            i25 = i12 & 1024;
            if (i25 != 0) {
                i26 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i11 | i27;
            } else {
                i26 = i11;
            }
            if ((i11 & 112) != 0) {
                i26 |= ((i12 & 2048) == 0 || !composerStartRestartGroup.changed(textFieldColors)) ? 16 : 32;
            }
            if ((i11 & 896) != 0) {
                i26 |= ((i12 & 4096) == 0 || !composerStartRestartGroup.changed(paddingValues)) ? 128 : 256;
            }
            i28 = i26;
            if ((i12 & 8192) != 0) {
                if ((i11 & 7168) == 0) {
                    i28 |= composerStartRestartGroup.changed(this) ? 2048 : 1024;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i21 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i23 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function9 = function8;
                        if ((i12 & 4096) != 0) {
                            if (function6 == null) {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i28 &= -897;
                            paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                        } else {
                            paddingValues2 = paddingValues;
                        }
                        textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                        z14 = z13;
                        function10 = function6;
                        function11 = function17;
                        function12 = function7;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i21 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i23 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function9 = function8;
                        if ((i12 & 4096) != 0) {
                            if (function6 == null) {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i28 &= -897;
                            paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                        } else {
                            paddingValues2 = paddingValues;
                        }
                        textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                        z14 = z13;
                        function10 = function6;
                        function11 = function17;
                        function12 = function7;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                    }
                    int i2110 = i13 << 3;
                    int i311 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i2110 & 896) | (i2110 & 112) | 6 | ((i13 >> 3) & 7168) | (i311 & 57344) | (i311 & 458752) | (i311 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function13 = function10;
                    function14 = function12;
                    function15 = function9;
                    function16 = function11;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i21 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i23 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function9 = function8;
                        if ((i12 & 4096) != 0) {
                            if (function6 == null) {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i28 &= -897;
                            paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                        } else {
                            paddingValues2 = paddingValues;
                        }
                        textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                        z14 = z13;
                        function10 = function6;
                        function11 = function17;
                        function12 = function7;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i21 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i23 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function9 = function8;
                        if ((i12 & 4096) != 0) {
                            if (function6 == null) {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i28 &= -897;
                            paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                        } else {
                            paddingValues2 = paddingValues;
                        }
                        textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                        z14 = z13;
                        function10 = function6;
                        function11 = function17;
                        function12 = function7;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                    }
                    int i2111 = i13 << 3;
                    int i312 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i2111 & 896) | (i2111 & 112) | 6 | ((i13 >> 3) & 7168) | (i312 & 57344) | (i312 & 458752) | (i312 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function13 = function10;
                    function14 = function12;
                    function15 = function9;
                    function16 = function11;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function13, function14, function15, function16, textFieldColors3, paddingValues3, i10, i11, i12));
            }
            i28 |= 3072;
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i21 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i23 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function9 = function8;
                    if ((i12 & 4096) != 0) {
                        if (function6 == null) {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i28 &= -897;
                        paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                    } else {
                        paddingValues2 = paddingValues;
                    }
                    textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                    z14 = z13;
                    function10 = function6;
                    function11 = function17;
                    function12 = function7;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i21 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i23 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function9 = function8;
                    if ((i12 & 4096) != 0) {
                        if (function6 == null) {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i28 &= -897;
                        paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                    } else {
                        paddingValues2 = paddingValues;
                    }
                    textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                    z14 = z13;
                    function10 = function6;
                    function11 = function17;
                    function12 = function7;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                }
                int i2112 = i13 << 3;
                int i313 = i13 >> 9;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i2112 & 896) | (i2112 & 112) | 6 | ((i13 >> 3) & 7168) | (i313 & 57344) | (i313 & 458752) | (i313 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function13 = function10;
                function14 = function12;
                function15 = function9;
                function16 = function11;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i21 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i23 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function9 = function8;
                    if ((i12 & 4096) != 0) {
                        if (function6 == null) {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i28 &= -897;
                        paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                    } else {
                        paddingValues2 = paddingValues;
                    }
                    textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                    z14 = z13;
                    function10 = function6;
                    function11 = function17;
                    function12 = function7;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i21 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i23 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function9 = function8;
                    if ((i12 & 4096) != 0) {
                        if (function6 == null) {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i28 &= -897;
                        paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                    } else {
                        paddingValues2 = paddingValues;
                    }
                    textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                    z14 = z13;
                    function10 = function6;
                    function11 = function17;
                    function12 = function7;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                }
                int i2113 = i13 << 3;
                int i314 = i13 >> 9;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i2113 & 896) | (i2113 & 112) | 6 | ((i13 >> 3) & 7168) | (i314 & 57344) | (i314 & 458752) | (i314 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function13 = function10;
                function14 = function12;
                function15 = function9;
                function16 = function11;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function13, function14, function15, function16, textFieldColors3, paddingValues3, i10, i11, i12));
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
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i10 & 57344) == 0) {
                if (composerStartRestartGroup.changed(visualTransformation)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            if ((i12 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(interactionSource)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                }
                i17 = i12 & 64;
                if (i17 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z12)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 128;
                if (i19 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 256;
                if (i21 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i22 = 33554432;
                    }
                    i13 |= i22;
                }
                i23 = i12 & 512;
                if (i23 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i24 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i24 = 268435456;
                    }
                    i13 |= i24;
                }
                i25 = i12 & 1024;
                if (i25 != 0) {
                    i26 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i27 = 4;
                    } else {
                        i27 = 2;
                    }
                    i26 = i11 | i27;
                } else {
                    i26 = i11;
                }
                if ((i11 & 112) != 0) {
                    i26 |= ((i12 & 2048) == 0 || !composerStartRestartGroup.changed(textFieldColors)) ? 16 : 32;
                }
                if ((i11 & 896) != 0) {
                    i26 |= ((i12 & 4096) == 0 || !composerStartRestartGroup.changed(paddingValues)) ? 128 : 256;
                }
                i28 = i26;
                if ((i12 & 8192) != 0) {
                    if ((i11 & 7168) == 0) {
                        i28 |= composerStartRestartGroup.changed(this) ? 2048 : 1024;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i21 != 0) {
                                function7 = null;
                            } else {
                                function7 = function3;
                            }
                            if (i23 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function9 = function8;
                            if ((i12 & 4096) != 0) {
                                if (function6 == null) {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i28 &= -897;
                                paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                            } else {
                                paddingValues2 = paddingValues;
                            }
                            textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                            z14 = z13;
                            function10 = function6;
                            function11 = function17;
                            function12 = function7;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i21 != 0) {
                                function7 = null;
                            } else {
                                function7 = function3;
                            }
                            if (i23 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function9 = function8;
                            if ((i12 & 4096) != 0) {
                                if (function6 == null) {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i28 &= -897;
                                paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                            } else {
                                paddingValues2 = paddingValues;
                            }
                            textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                            z14 = z13;
                            function10 = function6;
                            function11 = function17;
                            function12 = function7;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                        }
                        int i2114 = i13 << 3;
                        int i315 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i2114 & 896) | (i2114 & 112) | 6 | ((i13 >> 3) & 7168) | (i315 & 57344) | (i315 & 458752) | (i315 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function13 = function10;
                        function14 = function12;
                        function15 = function9;
                        function16 = function11;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i21 != 0) {
                                function7 = null;
                            } else {
                                function7 = function3;
                            }
                            if (i23 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function9 = function8;
                            if ((i12 & 4096) != 0) {
                                if (function6 == null) {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i28 &= -897;
                                paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                            } else {
                                paddingValues2 = paddingValues;
                            }
                            textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                            z14 = z13;
                            function10 = function6;
                            function11 = function17;
                            function12 = function7;
                        } else {
                            if (i17 != 0) {
                                z13 = false;
                            } else {
                                z13 = z12;
                            }
                            if (i19 != 0) {
                                function6 = null;
                            } else {
                                function6 = function2;
                            }
                            if (i21 != 0) {
                                function7 = null;
                            } else {
                                function7 = function3;
                            }
                            if (i23 != 0) {
                                function8 = null;
                            } else {
                                function8 = function4;
                            }
                            if (i25 == 0) {
                            }
                            if ((i12 & 2048) != 0) {
                                textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                                i28 &= -113;
                            } else {
                                textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                            }
                            function9 = function8;
                            if ((i12 & 4096) != 0) {
                                if (function6 == null) {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                } else {
                                    paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                }
                                i28 &= -897;
                                paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                            } else {
                                paddingValues2 = paddingValues;
                            }
                            textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                            z14 = z13;
                            function10 = function6;
                            function11 = function17;
                            function12 = function7;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                        }
                        int i2115 = i13 << 3;
                        int i316 = i13 >> 9;
                        composer2 = composerStartRestartGroup;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i2115 & 896) | (i2115 & 112) | 6 | ((i13 >> 3) & 7168) | (i316 & 57344) | (i316 & 458752) | (i316 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z15 = z14;
                        function13 = function10;
                        function14 = function12;
                        function15 = function9;
                        function16 = function11;
                        textFieldColors3 = textFieldColors2;
                        paddingValues3 = paddingValues2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function13, function14, function15, function16, textFieldColors3, paddingValues3, i10, i11, i12));
                }
                i28 |= 3072;
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i21 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i23 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function9 = function8;
                        if ((i12 & 4096) != 0) {
                            if (function6 == null) {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i28 &= -897;
                            paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                        } else {
                            paddingValues2 = paddingValues;
                        }
                        textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                        z14 = z13;
                        function10 = function6;
                        function11 = function17;
                        function12 = function7;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i21 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i23 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function9 = function8;
                        if ((i12 & 4096) != 0) {
                            if (function6 == null) {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i28 &= -897;
                            paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                        } else {
                            paddingValues2 = paddingValues;
                        }
                        textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                        z14 = z13;
                        function10 = function6;
                        function11 = function17;
                        function12 = function7;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                    }
                    int i2116 = i13 << 3;
                    int i317 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i2116 & 896) | (i2116 & 112) | 6 | ((i13 >> 3) & 7168) | (i317 & 57344) | (i317 & 458752) | (i317 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function13 = function10;
                    function14 = function12;
                    function15 = function9;
                    function16 = function11;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i21 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i23 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function9 = function8;
                        if ((i12 & 4096) != 0) {
                            if (function6 == null) {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i28 &= -897;
                            paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                        } else {
                            paddingValues2 = paddingValues;
                        }
                        textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                        z14 = z13;
                        function10 = function6;
                        function11 = function17;
                        function12 = function7;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i21 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i23 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function9 = function8;
                        if ((i12 & 4096) != 0) {
                            if (function6 == null) {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i28 &= -897;
                            paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                        } else {
                            paddingValues2 = paddingValues;
                        }
                        textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                        z14 = z13;
                        function10 = function6;
                        function11 = function17;
                        function12 = function7;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                    }
                    int i2117 = i13 << 3;
                    int i318 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i2117 & 896) | (i2117 & 112) | 6 | ((i13 >> 3) & 7168) | (i318 & 57344) | (i318 & 458752) | (i318 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function13 = function10;
                    function14 = function12;
                    function15 = function9;
                    function16 = function11;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function13, function14, function15, function16, textFieldColors3, paddingValues3, i10, i11, i12));
            }
            i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i13 |= i16;
            i17 = i12 & 64;
            if (i17 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z12)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i13 |= i18;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i13 |= i20;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i22 = 33554432;
                }
                i13 |= i22;
            }
            i23 = i12 & 512;
            if (i23 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i24 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i24 = 268435456;
                }
                i13 |= i24;
            }
            i25 = i12 & 1024;
            if (i25 != 0) {
                i26 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i11 | i27;
            } else {
                i26 = i11;
            }
            if ((i11 & 112) != 0) {
                i26 |= ((i12 & 2048) == 0 || !composerStartRestartGroup.changed(textFieldColors)) ? 16 : 32;
            }
            if ((i11 & 896) != 0) {
                i26 |= ((i12 & 4096) == 0 || !composerStartRestartGroup.changed(paddingValues)) ? 128 : 256;
            }
            i28 = i26;
            if ((i12 & 8192) != 0) {
                if ((i11 & 7168) == 0) {
                    i28 |= composerStartRestartGroup.changed(this) ? 2048 : 1024;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i21 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i23 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function9 = function8;
                        if ((i12 & 4096) != 0) {
                            if (function6 == null) {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i28 &= -897;
                            paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                        } else {
                            paddingValues2 = paddingValues;
                        }
                        textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                        z14 = z13;
                        function10 = function6;
                        function11 = function17;
                        function12 = function7;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i21 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i23 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function9 = function8;
                        if ((i12 & 4096) != 0) {
                            if (function6 == null) {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i28 &= -897;
                            paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                        } else {
                            paddingValues2 = paddingValues;
                        }
                        textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                        z14 = z13;
                        function10 = function6;
                        function11 = function17;
                        function12 = function7;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                    }
                    int i2118 = i13 << 3;
                    int i319 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i2118 & 896) | (i2118 & 112) | 6 | ((i13 >> 3) & 7168) | (i319 & 57344) | (i319 & 458752) | (i319 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function13 = function10;
                    function14 = function12;
                    function15 = function9;
                    function16 = function11;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i21 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i23 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function9 = function8;
                        if ((i12 & 4096) != 0) {
                            if (function6 == null) {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i28 &= -897;
                            paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                        } else {
                            paddingValues2 = paddingValues;
                        }
                        textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                        z14 = z13;
                        function10 = function6;
                        function11 = function17;
                        function12 = function7;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i21 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i23 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function9 = function8;
                        if ((i12 & 4096) != 0) {
                            if (function6 == null) {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i28 &= -897;
                            paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                        } else {
                            paddingValues2 = paddingValues;
                        }
                        textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                        z14 = z13;
                        function10 = function6;
                        function11 = function17;
                        function12 = function7;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                    }
                    int i2119 = i13 << 3;
                    int i3110 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i2119 & 896) | (i2119 & 112) | 6 | ((i13 >> 3) & 7168) | (i3110 & 57344) | (i3110 & 458752) | (i3110 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function13 = function10;
                    function14 = function12;
                    function15 = function9;
                    function16 = function11;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function13, function14, function15, function16, textFieldColors3, paddingValues3, i10, i11, i12));
            }
            i28 |= 3072;
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i21 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i23 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function9 = function8;
                    if ((i12 & 4096) != 0) {
                        if (function6 == null) {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i28 &= -897;
                        paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                    } else {
                        paddingValues2 = paddingValues;
                    }
                    textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                    z14 = z13;
                    function10 = function6;
                    function11 = function17;
                    function12 = function7;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i21 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i23 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function9 = function8;
                    if ((i12 & 4096) != 0) {
                        if (function6 == null) {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i28 &= -897;
                        paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                    } else {
                        paddingValues2 = paddingValues;
                    }
                    textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                    z14 = z13;
                    function10 = function6;
                    function11 = function17;
                    function12 = function7;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                }
                int i21110 = i13 << 3;
                int i3111 = i13 >> 9;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i21110 & 896) | (i21110 & 112) | 6 | ((i13 >> 3) & 7168) | (i3111 & 57344) | (i3111 & 458752) | (i3111 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function13 = function10;
                function14 = function12;
                function15 = function9;
                function16 = function11;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i21 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i23 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function9 = function8;
                    if ((i12 & 4096) != 0) {
                        if (function6 == null) {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i28 &= -897;
                        paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                    } else {
                        paddingValues2 = paddingValues;
                    }
                    textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                    z14 = z13;
                    function10 = function6;
                    function11 = function17;
                    function12 = function7;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i21 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i23 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function9 = function8;
                    if ((i12 & 4096) != 0) {
                        if (function6 == null) {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i28 &= -897;
                        paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                    } else {
                        paddingValues2 = paddingValues;
                    }
                    textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                    z14 = z13;
                    function10 = function6;
                    function11 = function17;
                    function12 = function7;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                }
                int i21111 = i13 << 3;
                int i3112 = i13 >> 9;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i21111 & 896) | (i21111 & 112) | 6 | ((i13 >> 3) & 7168) | (i3112 & 57344) | (i3112 & 458752) | (i3112 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function13 = function10;
                function14 = function12;
                function15 = function9;
                function16 = function11;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function13, function14, function15, function16, textFieldColors3, paddingValues3, i10, i11, i12));
        }
        i13 |= 3072;
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i10 & 57344) == 0) {
            if (composerStartRestartGroup.changed(visualTransformation)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i13 |= i15;
        }
        if ((i12 & 32) != 0) {
            if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(interactionSource)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
            }
            i17 = i12 & 64;
            if (i17 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z12)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i13 |= i18;
            }
            i19 = i12 & 128;
            if (i19 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i13 |= i20;
            }
            i21 = i12 & 256;
            if (i21 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i22 = 33554432;
                }
                i13 |= i22;
            }
            i23 = i12 & 512;
            if (i23 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i24 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i24 = 268435456;
                }
                i13 |= i24;
            }
            i25 = i12 & 1024;
            if (i25 != 0) {
                i26 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i27 = 4;
                } else {
                    i27 = 2;
                }
                i26 = i11 | i27;
            } else {
                i26 = i11;
            }
            if ((i11 & 112) != 0) {
                i26 |= ((i12 & 2048) == 0 || !composerStartRestartGroup.changed(textFieldColors)) ? 16 : 32;
            }
            if ((i11 & 896) != 0) {
                i26 |= ((i12 & 4096) == 0 || !composerStartRestartGroup.changed(paddingValues)) ? 128 : 256;
            }
            i28 = i26;
            if ((i12 & 8192) != 0) {
                if ((i11 & 7168) == 0) {
                    i28 |= composerStartRestartGroup.changed(this) ? 2048 : 1024;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i21 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i23 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function9 = function8;
                        if ((i12 & 4096) != 0) {
                            if (function6 == null) {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i28 &= -897;
                            paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                        } else {
                            paddingValues2 = paddingValues;
                        }
                        textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                        z14 = z13;
                        function10 = function6;
                        function11 = function17;
                        function12 = function7;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i21 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i23 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function9 = function8;
                        if ((i12 & 4096) != 0) {
                            if (function6 == null) {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i28 &= -897;
                            paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                        } else {
                            paddingValues2 = paddingValues;
                        }
                        textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                        z14 = z13;
                        function10 = function6;
                        function11 = function17;
                        function12 = function7;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                    }
                    int i21112 = i13 << 3;
                    int i3113 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i21112 & 896) | (i21112 & 112) | 6 | ((i13 >> 3) & 7168) | (i3113 & 57344) | (i3113 & 458752) | (i3113 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function13 = function10;
                    function14 = function12;
                    function15 = function9;
                    function16 = function11;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i21 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i23 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function9 = function8;
                        if ((i12 & 4096) != 0) {
                            if (function6 == null) {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i28 &= -897;
                            paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                        } else {
                            paddingValues2 = paddingValues;
                        }
                        textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                        z14 = z13;
                        function10 = function6;
                        function11 = function17;
                        function12 = function7;
                    } else {
                        if (i17 != 0) {
                            z13 = false;
                        } else {
                            z13 = z12;
                        }
                        if (i19 != 0) {
                            function6 = null;
                        } else {
                            function6 = function2;
                        }
                        if (i21 != 0) {
                            function7 = null;
                        } else {
                            function7 = function3;
                        }
                        if (i23 != 0) {
                            function8 = null;
                        } else {
                            function8 = function4;
                        }
                        if (i25 == 0) {
                        }
                        if ((i12 & 2048) != 0) {
                            textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                            i28 &= -113;
                        } else {
                            textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                        }
                        function9 = function8;
                        if ((i12 & 4096) != 0) {
                            if (function6 == null) {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            } else {
                                paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            }
                            i28 &= -897;
                            paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                        } else {
                            paddingValues2 = paddingValues;
                        }
                        textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                        z14 = z13;
                        function10 = function6;
                        function11 = function17;
                        function12 = function7;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                    }
                    int i21113 = i13 << 3;
                    int i3114 = i13 >> 9;
                    composer2 = composerStartRestartGroup;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i21113 & 896) | (i21113 & 112) | 6 | ((i13 >> 3) & 7168) | (i3114 & 57344) | (i3114 & 458752) | (i3114 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z15 = z14;
                    function13 = function10;
                    function14 = function12;
                    function15 = function9;
                    function16 = function11;
                    textFieldColors3 = textFieldColors2;
                    paddingValues3 = paddingValues2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function13, function14, function15, function16, textFieldColors3, paddingValues3, i10, i11, i12));
            }
            i28 |= 3072;
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i21 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i23 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function9 = function8;
                    if ((i12 & 4096) != 0) {
                        if (function6 == null) {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i28 &= -897;
                        paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                    } else {
                        paddingValues2 = paddingValues;
                    }
                    textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                    z14 = z13;
                    function10 = function6;
                    function11 = function17;
                    function12 = function7;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i21 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i23 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function9 = function8;
                    if ((i12 & 4096) != 0) {
                        if (function6 == null) {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i28 &= -897;
                        paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                    } else {
                        paddingValues2 = paddingValues;
                    }
                    textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                    z14 = z13;
                    function10 = function6;
                    function11 = function17;
                    function12 = function7;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                }
                int i21114 = i13 << 3;
                int i3115 = i13 >> 9;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i21114 & 896) | (i21114 & 112) | 6 | ((i13 >> 3) & 7168) | (i3115 & 57344) | (i3115 & 458752) | (i3115 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function13 = function10;
                function14 = function12;
                function15 = function9;
                function16 = function11;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i21 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i23 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function9 = function8;
                    if ((i12 & 4096) != 0) {
                        if (function6 == null) {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i28 &= -897;
                        paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                    } else {
                        paddingValues2 = paddingValues;
                    }
                    textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                    z14 = z13;
                    function10 = function6;
                    function11 = function17;
                    function12 = function7;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i21 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i23 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function9 = function8;
                    if ((i12 & 4096) != 0) {
                        if (function6 == null) {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i28 &= -897;
                        paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                    } else {
                        paddingValues2 = paddingValues;
                    }
                    textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                    z14 = z13;
                    function10 = function6;
                    function11 = function17;
                    function12 = function7;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                }
                int i21115 = i13 << 3;
                int i3116 = i13 >> 9;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i21115 & 896) | (i21115 & 112) | 6 | ((i13 >> 3) & 7168) | (i3116 & 57344) | (i3116 & 458752) | (i3116 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function13 = function10;
                function14 = function12;
                function15 = function9;
                function16 = function11;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function13, function14, function15, function16, textFieldColors3, paddingValues3, i10, i11, i12));
        }
        i16 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i13 |= i16;
        i17 = i12 & 64;
        if (i17 != 0) {
            i13 |= 1572864;
        } else if ((i10 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(z12)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i13 |= i18;
        }
        i19 = i12 & 128;
        if (i19 != 0) {
            i13 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i13 |= i20;
        }
        i21 = i12 & 256;
        if (i21 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i22 = 33554432;
            }
            i13 |= i22;
        }
        i23 = i12 & 512;
        if (i23 != 0) {
            i13 |= 805306368;
        } else if ((i10 & 1879048192) == 0) {
            if (composerStartRestartGroup.changedInstance(function4)) {
                i24 = PKIFailureInfo.duplicateCertReq;
            } else {
                i24 = 268435456;
            }
            i13 |= i24;
        }
        i25 = i12 & 1024;
        if (i25 != 0) {
            i26 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (composerStartRestartGroup.changedInstance(function5)) {
                i27 = 4;
            } else {
                i27 = 2;
            }
            i26 = i11 | i27;
        } else {
            i26 = i11;
        }
        if ((i11 & 112) != 0) {
            i26 |= ((i12 & 2048) == 0 || !composerStartRestartGroup.changed(textFieldColors)) ? 16 : 32;
        }
        if ((i11 & 896) != 0) {
            i26 |= ((i12 & 4096) == 0 || !composerStartRestartGroup.changed(paddingValues)) ? 128 : 256;
        }
        i28 = i26;
        if ((i12 & 8192) != 0) {
            if ((i11 & 7168) == 0) {
                i28 |= composerStartRestartGroup.changed(this) ? 2048 : 1024;
            }
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i21 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i23 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function9 = function8;
                    if ((i12 & 4096) != 0) {
                        if (function6 == null) {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i28 &= -897;
                        paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                    } else {
                        paddingValues2 = paddingValues;
                    }
                    textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                    z14 = z13;
                    function10 = function6;
                    function11 = function17;
                    function12 = function7;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i21 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i23 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function9 = function8;
                    if ((i12 & 4096) != 0) {
                        if (function6 == null) {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i28 &= -897;
                        paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                    } else {
                        paddingValues2 = paddingValues;
                    }
                    textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                    z14 = z13;
                    function10 = function6;
                    function11 = function17;
                    function12 = function7;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                }
                int i21116 = i13 << 3;
                int i3117 = i13 >> 9;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i21116 & 896) | (i21116 & 112) | 6 | ((i13 >> 3) & 7168) | (i3117 & 57344) | (i3117 & 458752) | (i3117 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function13 = function10;
                function14 = function12;
                function15 = function9;
                function16 = function11;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i21 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i23 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function9 = function8;
                    if ((i12 & 4096) != 0) {
                        if (function6 == null) {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i28 &= -897;
                        paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                    } else {
                        paddingValues2 = paddingValues;
                    }
                    textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                    z14 = z13;
                    function10 = function6;
                    function11 = function17;
                    function12 = function7;
                } else {
                    if (i17 != 0) {
                        z13 = false;
                    } else {
                        z13 = z12;
                    }
                    if (i19 != 0) {
                        function6 = null;
                    } else {
                        function6 = function2;
                    }
                    if (i21 != 0) {
                        function7 = null;
                    } else {
                        function7 = function3;
                    }
                    if (i23 != 0) {
                        function8 = null;
                    } else {
                        function8 = function4;
                    }
                    if (i25 == 0) {
                    }
                    if ((i12 & 2048) != 0) {
                        textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                        i28 &= -113;
                    } else {
                        textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                    }
                    function9 = function8;
                    if ((i12 & 4096) != 0) {
                        if (function6 == null) {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        } else {
                            paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        }
                        i28 &= -897;
                        paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                    } else {
                        paddingValues2 = paddingValues;
                    }
                    textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                    z14 = z13;
                    function10 = function6;
                    function11 = function17;
                    function12 = function7;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
                }
                int i21117 = i13 << 3;
                int i3118 = i13 >> 9;
                composer2 = composerStartRestartGroup;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i21117 & 896) | (i21117 & 112) | 6 | ((i13 >> 3) & 7168) | (i3118 & 57344) | (i3118 & 458752) | (i3118 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z15 = z14;
                function13 = function10;
                function14 = function12;
                function15 = function9;
                function16 = function11;
                textFieldColors3 = textFieldColors2;
                paddingValues3 = paddingValues2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function13, function14, function15, function16, textFieldColors3, paddingValues3, i10, i11, i12));
        }
        i28 |= 3072;
        if ((i13 & 1533916891) != 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (i19 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                if (i21 != 0) {
                    function7 = null;
                } else {
                    function7 = function3;
                }
                if (i23 != 0) {
                    function8 = null;
                } else {
                    function8 = function4;
                }
                if (i25 == 0) {
                }
                if ((i12 & 2048) != 0) {
                    textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                    i28 &= -113;
                } else {
                    textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                }
                function9 = function8;
                if ((i12 & 4096) != 0) {
                    if (function6 == null) {
                        paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    } else {
                        paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    }
                    i28 &= -897;
                    paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                } else {
                    paddingValues2 = paddingValues;
                }
                textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                z14 = z13;
                function10 = function6;
                function11 = function17;
                function12 = function7;
            } else {
                if (i17 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (i19 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                if (i21 != 0) {
                    function7 = null;
                } else {
                    function7 = function3;
                }
                if (i23 != 0) {
                    function8 = null;
                } else {
                    function8 = function4;
                }
                if (i25 == 0) {
                }
                if ((i12 & 2048) != 0) {
                    textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                    i28 &= -113;
                } else {
                    textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                }
                function9 = function8;
                if ((i12 & 4096) != 0) {
                    if (function6 == null) {
                        paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    } else {
                        paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    }
                    i28 &= -897;
                    paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                } else {
                    paddingValues2 = paddingValues;
                }
                textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                z14 = z13;
                function10 = function6;
                function11 = function17;
                function12 = function7;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
            }
            int i21118 = i13 << 3;
            int i3119 = i13 >> 9;
            composer2 = composerStartRestartGroup;
            TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i21118 & 896) | (i21118 & 112) | 6 | ((i13 >> 3) & 7168) | (i3119 & 57344) | (i3119 & 458752) | (i3119 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z15 = z14;
            function13 = function10;
            function14 = function12;
            function15 = function9;
            function16 = function11;
            textFieldColors3 = textFieldColors2;
            paddingValues3 = paddingValues2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (i19 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                if (i21 != 0) {
                    function7 = null;
                } else {
                    function7 = function3;
                }
                if (i23 != 0) {
                    function8 = null;
                } else {
                    function8 = function4;
                }
                if (i25 == 0) {
                }
                if ((i12 & 2048) != 0) {
                    textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                    i28 &= -113;
                } else {
                    textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                }
                function9 = function8;
                if ((i12 & 4096) != 0) {
                    if (function6 == null) {
                        paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    } else {
                        paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    }
                    i28 &= -897;
                    paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                } else {
                    paddingValues2 = paddingValues;
                }
                textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                z14 = z13;
                function10 = function6;
                function11 = function17;
                function12 = function7;
            } else {
                if (i17 != 0) {
                    z13 = false;
                } else {
                    z13 = z12;
                }
                if (i19 != 0) {
                    function6 = null;
                } else {
                    function6 = function2;
                }
                if (i21 != 0) {
                    function7 = null;
                } else {
                    function7 = function3;
                }
                if (i23 != 0) {
                    function8 = null;
                } else {
                    function8 = function4;
                }
                if (i25 == 0) {
                }
                if ((i12 & 2048) != 0) {
                    textFieldColorsM871textFieldColorsdx8h9Zs = m871textFieldColorsdx8h9Zs(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 0, (i28 >> 6) & 112, 2097151);
                    i28 &= -113;
                } else {
                    textFieldColorsM871textFieldColorsdx8h9Zs = textFieldColors;
                }
                function9 = function8;
                if ((i12 & 4096) != 0) {
                    if (function6 == null) {
                        paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m862textFieldWithoutLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    } else {
                        paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default = m861textFieldWithLabelPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    }
                    i28 &= -897;
                    paddingValues2 = paddingValuesM861textFieldWithLabelPaddinga9UjIt4$default;
                } else {
                    paddingValues2 = paddingValues;
                }
                textFieldColors2 = textFieldColorsM871textFieldColorsdx8h9Zs;
                z14 = z13;
                function10 = function6;
                function11 = function17;
                function12 = function7;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1171040065, i13, i28, "androidx.compose.material.TextFieldDefaults.TextFieldDecorationBox (TextFieldDefaults.kt:542)");
            }
            int i21119 = i13 << 3;
            int i31110 = i13 >> 9;
            composer2 = composerStartRestartGroup;
            TextFieldImplKt.CommonDecorationBox(TextFieldType.Filled, value, innerTextField, visualTransformation, function10, function12, function9, function11, z11, z10, z14, interactionSource, paddingValues2, textFieldColors2, null, composer2, (i21119 & 896) | (i21119 & 112) | 6 | ((i13 >> 3) & 7168) | (i31110 & 57344) | (i31110 & 458752) | (i31110 & 3670016) | ((i28 << 21) & 29360128) | ((i13 << 15) & 234881024) | ((i13 << 21) & 1879048192), ((i13 >> 12) & 112) | ((i13 >> 18) & 14) | (i28 & 896) | ((i28 << 6) & 7168), 16384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z15 = z14;
            function13 = function10;
            function14 = function12;
            function15 = function9;
            function16 = function11;
            textFieldColors3 = textFieldColors2;
            paddingValues3 = paddingValues2;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(value, innerTextField, z10, z11, visualTransformation, interactionSource, z15, function13, function14, function15, function16, textFieldColors3, paddingValues3, i10, i11, i12));
    }

    /* JADX INFO: renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m864getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m865getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m866getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @JvmName(name = "getOutlinedTextFieldShape")
    @NotNull
    @Composable
    @ReadOnlyComposable
    public final Shape getOutlinedTextFieldShape(@Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1899109048, i10, -1, "androidx.compose.material.TextFieldDefaults.<get-OutlinedTextFieldShape> (TextFieldDefaults.kt:224)");
        }
        CornerBasedShape small = MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return small;
    }

    @JvmName(name = "getTextFieldShape")
    @NotNull
    @Composable
    @ReadOnlyComposable
    public final Shape getTextFieldShape(@Nullable Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1117199624, i10, -1, "androidx.compose.material.TextFieldDefaults.<get-TextFieldShape> (TextFieldDefaults.kt:215)");
        }
        CornerBasedShape cornerBasedShapeCopy$default = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return cornerBasedShapeCopy$default;
    }

    /* JADX INFO: renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m867getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    @ExperimentalMaterialApi
    @NotNull
    /* JADX INFO: renamed from: indicatorLine-gv0btCI, reason: not valid java name */
    public final Modifier m868indicatorLinegv0btCI(@NotNull Modifier indicatorLine, final boolean z10, final boolean z11, @NotNull final InteractionSource interactionSource, @NotNull final TextFieldColors colors, final float f6, final float f10) {
        Intrinsics.checkNotNullParameter(indicatorLine, "$this$indicatorLine");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Intrinsics.checkNotNullParameter(colors, "colors");
        return ComposedModifierKt.composed(indicatorLine, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                com.google.android.gms.internal.mlkit_vision_barcode_bundled.a.b(z11, com.google.android.gms.internal.mlkit_vision_barcode_bundled.a.b(z10, androidx.activity.a.c(inspectorInfo, "$this$null", "indicatorLine"), "enabled", inspectorInfo), "isError", inspectorInfo).set("interactionSource", interactionSource);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("colors", colors);
                androidx.activity.a.b(f6, inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String(), "focusedIndicatorLineThickness", inspectorInfo).set("unfocusedIndicatorLineThickness", Dp.m4387boximpl(f10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new e(z10, z11, interactionSource, colors, f6, f10));
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: outlinedTextFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m869outlinedTextFieldColorsdx8h9Zs(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, @Nullable Composer composer, int i10, int i11, int i12, int i13) {
        long jM2507copywmQWz5c$default;
        long jM2507copywmQWz5c$default2;
        long jM2507copywmQWz5c$default3;
        long jM2507copywmQWz5c$default4;
        long jM2507copywmQWz5c$default5;
        long jM2507copywmQWz5c$default6;
        composer.startReplaceableGroup(1762667317);
        long jM2507copywmQWz5c$default7 = (i13 & 1) != 0 ? Color.m2507copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if ((i13 & 2) != 0) {
            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default7, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default = j11;
        }
        long jM2543getTransparent0d7_KjU = (i13 & 4) != 0 ? Color.INSTANCE.m2543getTransparent0d7_KjU() : j12;
        long jM713getPrimary0d7_KjU = (i13 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m713getPrimary0d7_KjU() : j13;
        long jM707getError0d7_KjU = (i13 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m707getError0d7_KjU() : j14;
        long jM2507copywmQWz5c$default8 = (i13 & 32) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m713getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long jM2507copywmQWz5c$default9 = (i13 & 64) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        if ((i13 & 128) != 0) {
            jM2507copywmQWz5c$default2 = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default9, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default2 = j17;
        }
        long jM707getError0d7_KjU2 = (i13 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m707getError0d7_KjU() : j18;
        long jM2507copywmQWz5c$default10 = (i13 & 512) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        if ((i13 & 1024) != 0) {
            jM2507copywmQWz5c$default3 = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default10, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default3 = j20;
        }
        long j31 = (i13 & 2048) != 0 ? jM2507copywmQWz5c$default10 : j21;
        long jM2507copywmQWz5c$default11 = (i13 & 4096) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j22;
        if ((i13 & 8192) != 0) {
            jM2507copywmQWz5c$default4 = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default11, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default4 = j23;
        }
        long jM707getError0d7_KjU3 = (i13 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m707getError0d7_KjU() : j24;
        long jM2507copywmQWz5c$default12 = (32768 & i13) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m713getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long jM2507copywmQWz5c$default13 = (65536 & i13) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j26;
        if ((131072 & i13) != 0) {
            jM2507copywmQWz5c$default5 = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default13, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default5 = j27;
        }
        long jM707getError0d7_KjU4 = (262144 & i13) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m707getError0d7_KjU() : j28;
        long jM2507copywmQWz5c$default14 = (524288 & i13) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j29;
        if ((i13 & 1048576) != 0) {
            jM2507copywmQWz5c$default6 = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default14, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default6 = j30;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1762667317, i10, i11, "androidx.compose.material.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:434)");
        }
        h0.n0 n0Var = new h0.n0(jM2507copywmQWz5c$default7, jM2507copywmQWz5c$default, jM713getPrimary0d7_KjU, jM707getError0d7_KjU, jM2507copywmQWz5c$default8, jM2507copywmQWz5c$default9, jM707getError0d7_KjU2, jM2507copywmQWz5c$default2, jM2507copywmQWz5c$default10, jM2507copywmQWz5c$default3, j31, jM2507copywmQWz5c$default11, jM2507copywmQWz5c$default4, jM707getError0d7_KjU3, jM2543getTransparent0d7_KjU, jM2507copywmQWz5c$default12, jM2507copywmQWz5c$default13, jM2507copywmQWz5c$default5, jM707getError0d7_KjU4, jM2507copywmQWz5c$default14, jM2507copywmQWz5c$default6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return n0Var;
    }

    @ExperimentalMaterialApi
    @NotNull
    /* JADX INFO: renamed from: outlinedTextFieldPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m870outlinedTextFieldPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m292PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: textFieldColors-dx8h9Zs, reason: not valid java name */
    public final TextFieldColors m871textFieldColorsdx8h9Zs(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, @Nullable Composer composer, int i10, int i11, int i12, int i13) {
        long jM2507copywmQWz5c$default;
        long jM2507copywmQWz5c$default2;
        long jM2507copywmQWz5c$default3;
        long jM2507copywmQWz5c$default4;
        long jM2507copywmQWz5c$default5;
        long jM2507copywmQWz5c$default6;
        composer.startReplaceableGroup(231892599);
        long jM2507copywmQWz5c$default7 = (i13 & 1) != 0 ? Color.m2507copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j10;
        if ((i13 & 2) != 0) {
            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default7, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default = j11;
        }
        long jM2507copywmQWz5c$default8 = (i13 & 4) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long jM713getPrimary0d7_KjU = (i13 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m713getPrimary0d7_KjU() : j13;
        long jM707getError0d7_KjU = (i13 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m707getError0d7_KjU() : j14;
        long jM2507copywmQWz5c$default9 = (i13 & 32) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m713getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long jM2507copywmQWz5c$default10 = (i13 & 64) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        if ((i13 & 128) != 0) {
            jM2507copywmQWz5c$default2 = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default10, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default2 = j17;
        }
        long jM707getError0d7_KjU2 = (i13 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m707getError0d7_KjU() : j18;
        long jM2507copywmQWz5c$default11 = (i13 & 512) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        if ((i13 & 1024) != 0) {
            jM2507copywmQWz5c$default3 = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default11, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default3 = j20;
        }
        long j31 = (i13 & 2048) != 0 ? jM2507copywmQWz5c$default11 : j21;
        long jM2507copywmQWz5c$default12 = (i13 & 4096) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j22;
        if ((i13 & 8192) != 0) {
            jM2507copywmQWz5c$default4 = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default12, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default4 = j23;
        }
        long jM707getError0d7_KjU3 = (i13 & 16384) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m707getError0d7_KjU() : j24;
        long jM2507copywmQWz5c$default13 = (32768 & i13) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m713getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long jM2507copywmQWz5c$default14 = (65536 & i13) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j26;
        if ((131072 & i13) != 0) {
            jM2507copywmQWz5c$default5 = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default14, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default5 = j27;
        }
        long jM707getError0d7_KjU4 = (262144 & i13) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m707getError0d7_KjU() : j28;
        long jM2507copywmQWz5c$default15 = (524288 & i13) != 0 ? Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m712getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j29;
        if ((i13 & 1048576) != 0) {
            jM2507copywmQWz5c$default6 = Color.m2507copywmQWz5c$default(jM2507copywmQWz5c$default15, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM2507copywmQWz5c$default6 = j30;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(231892599, i10, i11, "androidx.compose.material.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:376)");
        }
        h0.n0 n0Var = new h0.n0(jM2507copywmQWz5c$default7, jM2507copywmQWz5c$default, jM713getPrimary0d7_KjU, jM707getError0d7_KjU, jM2507copywmQWz5c$default9, jM2507copywmQWz5c$default10, jM707getError0d7_KjU2, jM2507copywmQWz5c$default2, jM2507copywmQWz5c$default11, jM2507copywmQWz5c$default3, j31, jM2507copywmQWz5c$default12, jM2507copywmQWz5c$default4, jM707getError0d7_KjU3, jM2507copywmQWz5c$default8, jM2507copywmQWz5c$default13, jM2507copywmQWz5c$default14, jM2507copywmQWz5c$default5, jM707getError0d7_KjU4, jM2507copywmQWz5c$default15, jM2507copywmQWz5c$default6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return n0Var;
    }

    @ExperimentalMaterialApi
    @NotNull
    /* JADX INFO: renamed from: textFieldWithLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m872textFieldWithLabelPaddinga9UjIt4(float start, float end, float top, float bottom) {
        return PaddingKt.m292PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    @ExperimentalMaterialApi
    @NotNull
    /* JADX INFO: renamed from: textFieldWithoutLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m873textFieldWithoutLabelPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m292PaddingValuesa9UjIt4(start, top, end, bottom);
    }
}
