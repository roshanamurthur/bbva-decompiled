package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: OutlinedTextField.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c3 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
    public final /* synthetic */ Function2<Composer, Integer, Unit> E0;
    public final /* synthetic */ Function2<Composer, Integer, Unit> F0;
    public final /* synthetic */ Function2<Composer, Integer, Unit> G0;
    public final /* synthetic */ TextFieldColors H0;
    public final /* synthetic */ int I0;
    public final /* synthetic */ int J0;
    public final /* synthetic */ int K0;
    public final /* synthetic */ Shape L0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f12720p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f12721q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ boolean f12722r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ VisualTransformation f12723s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f12724t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ boolean f12725u0;
    public final /* synthetic */ Function2<Composer, Integer, Unit> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f12726w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f12727x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f12728y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(int i10, int i11, int i12, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors, Shape shape, TextFieldValue textFieldValue, VisualTransformation visualTransformation, Function2 function2, Function2 function3, Function2 function4, Function2 function5, Function2 function6, Function2 function7, Function2 function8, boolean z10, boolean z11, boolean z12) {
        super(3);
        this.f12720p0 = textFieldValue;
        this.f12721q0 = z10;
        this.f12722r0 = z11;
        this.f12723s0 = visualTransformation;
        this.f12724t0 = mutableInteractionSource;
        this.f12725u0 = z12;
        this.v0 = function2;
        this.f12726w0 = function3;
        this.f12727x0 = function4;
        this.f12728y0 = function5;
        this.E0 = function6;
        this.F0 = function7;
        this.G0 = function8;
        this.H0 = textFieldColors;
        this.I0 = i10;
        this.J0 = i11;
        this.K0 = i12;
        this.L0 = shape;
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
        Function2<? super Composer, ? super Integer, ? extends Unit> innerTextField = function2;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        if ((iIntValue & 14) == 0) {
            iIntValue |= composer2.changedInstance(innerTextField) ? 4 : 2;
        }
        int i10 = iIntValue;
        if ((i10 & 91) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-757328870, i10, -1, "androidx.compose.material3.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:357)");
            }
            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
            String text = this.f12720p0.getText();
            boolean z10 = this.f12721q0;
            boolean z11 = this.f12722r0;
            VisualTransformation visualTransformation = this.f12723s0;
            MutableInteractionSource mutableInteractionSource = this.f12724t0;
            boolean z12 = this.f12725u0;
            Function2<Composer, Integer, Unit> function3 = this.v0;
            Function2<Composer, Integer, Unit> function4 = this.f12726w0;
            Function2<Composer, Integer, Unit> function5 = this.f12727x0;
            Function2<Composer, Integer, Unit> function6 = this.f12728y0;
            Function2<Composer, Integer, Unit> function7 = this.E0;
            Function2<Composer, Integer, Unit> function8 = this.F0;
            Function2<Composer, Integer, Unit> function9 = this.G0;
            TextFieldColors textFieldColors = this.H0;
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, 255570733, true, new b3(z10, z12, mutableInteractionSource, textFieldColors, this.L0, this.I0, this.J0, this.K0));
            int i11 = this.I0;
            int i12 = this.J0;
            int i13 = this.K0;
            int i14 = i11 << 3;
            int i15 = ((i10 << 3) & 112) | ((i11 >> 3) & 896) | ((i12 >> 12) & 7168) | (i12 & 57344) | ((i13 << 15) & 458752) | ((i12 << 9) & 3670016) | (i14 & 29360128) | (i14 & 234881024) | (i14 & 1879048192);
            int i16 = ((i11 >> 27) & 14) | 14155776;
            int i17 = i12 << 3;
            outlinedTextFieldDefaults.DecorationBox(text, innerTextField, z10, z11, visualTransformation, mutableInteractionSource, z12, function3, function4, function5, function6, function7, function8, function9, textFieldColors, null, composableLambda, composer2, i15, i16 | (i17 & 112) | (i17 & 896) | (i17 & 7168) | ((i13 << 6) & 57344), 32768);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
