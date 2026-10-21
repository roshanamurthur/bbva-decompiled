package l0;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimePickerTextField$1$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1672:1\n154#2:1673\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerKt$TimePickerTextField$1$1$2\n*L\n1456#1:1673\n*E\n"})
public final class c5 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f82482p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f82483q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ TextFieldColors f82484r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(TextFieldValue textFieldValue, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors) {
        super(3);
        this.f82482p0 = textFieldValue;
        this.f82483q0 = mutableInteractionSource;
        this.f82484r0 = textFieldColors;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
        Function2<? super Composer, ? super Integer, ? extends Unit> it = function2;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if ((iIntValue & 14) == 0) {
            iIntValue |= composer2.changedInstance(it) ? 4 : 2;
        }
        int i10 = iIntValue;
        if ((i10 & 91) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2133555260, i10, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1446)");
            }
            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
            String text = this.f82482p0.getText();
            VisualTransformation none = VisualTransformation.INSTANCE.getNone();
            PaddingValues paddingValuesM289PaddingValues0680j_4 = PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0));
            MutableInteractionSource mutableInteractionSource = this.f82483q0;
            TextFieldColors textFieldColors = this.f82484r0;
            outlinedTextFieldDefaults.DecorationBox(text, it, true, true, none, mutableInteractionSource, false, null, null, null, null, null, null, null, textFieldColors, paddingValuesM289PaddingValues0680j_4, ComposableLambdaKt.composableLambda(composer2, -968963953, true, new b5(mutableInteractionSource, textFieldColors)), composer2, ((i10 << 3) & 112) | 224640, 14352384, 16320);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
