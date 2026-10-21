package l0;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ComposableSingletons$SearchBarKt;
import androidx.compose.material3.SearchBarDefaults;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SearchBar.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSearchBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.kt\nandroidx/compose/material3/SearchBarKt$SearchBarInputField$5\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,746:1\n1#2:747\n*E\n"})
public final class l3 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f82679p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f82680q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f82681r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82682s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82683t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f82684u0;
    public final /* synthetic */ TextFieldColors v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ int f82685w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ int f82686x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l3(String str, boolean z10, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, TextFieldColors textFieldColors, int i10, int i11) {
        super(3);
        this.f82679p0 = str;
        this.f82680q0 = z10;
        this.f82681r0 = mutableInteractionSource;
        this.f82682s0 = function2;
        this.f82683t0 = function3;
        this.f82684u0 = function4;
        this.v0 = textFieldColors;
        this.f82685w0 = i10;
        this.f82686x0 = i11;
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
        if ((iIntValue & 91) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(584727264, iIntValue, -1, "androidx.compose.material3.SearchBarInputField.<anonymous> (SearchBar.kt:468)");
            }
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
            String str = this.f82679p0;
            boolean z10 = this.f82680q0;
            VisualTransformation none = VisualTransformation.INSTANCE.getNone();
            MutableInteractionSource mutableInteractionSource = this.f82681r0;
            Function2<Composer, Integer, Unit> function3 = this.f82682s0;
            Function2<Composer, Integer, Unit> function4 = this.f82683t0;
            ComposableLambda composableLambda = function4 != null ? ComposableLambdaKt.composableLambda(composer2, -967380630, true, new j3(function4)) : null;
            Function2<Composer, Integer, Unit> function5 = this.f82684u0;
            ComposableLambda composableLambda2 = function5 != null ? ComposableLambdaKt.composableLambda(composer2, -2117865162, true, new k3(function5)) : null;
            Shape inputFieldShape = SearchBarDefaults.INSTANCE.getInputFieldShape(composer2, 6);
            TextFieldColors textFieldColors = this.v0;
            PaddingValues paddingValuesM1357contentPaddingWithoutLabela9UjIt4$default = TextFieldDefaults.m1357contentPaddingWithoutLabela9UjIt4$default(textFieldDefaults, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
            Function2<Composer, Integer, Unit> function2M1044getLambda1$material3_release = ComposableSingletons$SearchBarKt.INSTANCE.m1044getLambda1$material3_release();
            int i10 = this.f82685w0;
            int i11 = this.f82686x0;
            textFieldDefaults.DecorationBox(str, innerTextField, z10, true, none, mutableInteractionSource, false, null, function3, composableLambda, composableLambda2, null, null, null, inputFieldShape, textFieldColors, paddingValuesM1357contentPaddingWithoutLabela9UjIt4$default, function2M1044getLambda1$material3_release, composer2, ((iIntValue << 3) & 112) | (i10 & 14) | 27648 | ((i10 >> 12) & 896) | ((i11 << 12) & 458752) | ((i10 << 3) & 234881024), ((i11 << 15) & 458752) | 113246208, 14528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
