package androidx.compose.foundation.text;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Dp;
import androidx.room.RoomDatabase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TextFieldCursor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a4\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000\"\u001d\u0010\u0011\u001a\u00020\f8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/TextFieldState;", "state", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "", "enabled", "cursor", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getDefaultCursorThickness", "()F", "DefaultCursorThickness", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFieldCursor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,99:1\n154#2:100\n*S KotlinDebug\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt\n*L\n94#1:100\n*E\n"})
public final class TextFieldCursorKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final InfiniteRepeatableSpec f5979a = AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(b.f5985p0), null, 0, 6, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f5980b = Dp.m4389constructorimpl(2);

    /* JADX INFO: compiled from: TextFieldCursor.kt */
    @SourceDebugExtension({"SMAP\nTextFieldCursor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt$cursor$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,99:1\n25#2:100\n1097#3,6:101\n652#4:107\n*S KotlinDebug\n*F\n+ 1 TextFieldCursor.kt\nandroidx/compose/foundation/text/TextFieldCursorKt$cursor$1\n*L\n46#1:100\n46#1:101,6\n47#1:107\n*E\n"})
    public static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Brush f5981p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TextFieldState f5982q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TextFieldValue f5983r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ OffsetMapping f5984s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Brush brush, TextFieldState textFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
            super(3);
            this.f5981p0 = brush;
            this.f5982q0 = textFieldState;
            this.f5983r0 = textFieldValue;
            this.f5984s0 = offsetMapping;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0097  */
        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Modifier modifierDrawWithContent;
            Modifier modifier2 = modifier;
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier2, "$this$composed", composer2, 1634330012);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1634330012, iA, -1, "androidx.compose.foundation.text.cursor.<anonymous> (TextFieldCursor.kt:44)");
            }
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            Animatable animatable = (Animatable) objRememberedValue;
            Brush brush = this.f5981p0;
            boolean z10 = ((brush instanceof SolidColor) && ((SolidColor) brush).getValue() == Color.INSTANCE.m2544getUnspecified0d7_KjU()) ? false : true;
            if (this.f5982q0.getHasFocus()) {
                TextFieldValue textFieldValue = this.f5983r0;
                if (TextRange.m3961getCollapsedimpl(textFieldValue.getSelection()) && z10) {
                    EffectsKt.LaunchedEffect(textFieldValue.getAnnotatedString(), TextRange.m3955boximpl(textFieldValue.getSelection()), new q(animatable, null), composer2, 512);
                    modifierDrawWithContent = DrawModifierKt.drawWithContent(modifier2, new r(animatable, this.f5984s0, this.f5983r0, this.f5982q0, this.f5981p0));
                } else {
                    modifierDrawWithContent = Modifier.INSTANCE;
                }
            } else {
                modifierDrawWithContent = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return modifierDrawWithContent;
        }
    }

    /* JADX INFO: compiled from: TextFieldCursor.kt */
    public static final class b extends Lambda implements Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f5985p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
            KeyframesSpec.KeyframesSpecConfig<Float> keyframes = keyframesSpecConfig;
            Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
            keyframes.setDurationMillis(1000);
            Float fValueOf = Float.valueOf(1.0f);
            keyframes.at(fValueOf, 0);
            keyframes.at(fValueOf, 499);
            Float fValueOf2 = Float.valueOf(0.0f);
            keyframes.at(fValueOf2, 500);
            keyframes.at(fValueOf2, RoomDatabase.MAX_BIND_PARAMETER_CNT);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final Modifier cursor(@NotNull Modifier modifier, @NotNull TextFieldState state, @NotNull TextFieldValue value, @NotNull OffsetMapping offsetMapping, @NotNull Brush cursorBrush, boolean z10) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(offsetMapping, "offsetMapping");
        Intrinsics.checkNotNullParameter(cursorBrush, "cursorBrush");
        return z10 ? ComposedModifierKt.composed$default(modifier, null, new a(cursorBrush, state, value, offsetMapping), 1, null) : modifier;
    }

    public static final float getDefaultCursorThickness() {
        return f5980b;
    }
}
