package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ Modifier E0;
    public final /* synthetic */ BringIntoViewRequester F0;
    public final /* synthetic */ TextFieldSelectionManager G0;
    public final /* synthetic */ boolean H0;
    public final /* synthetic */ boolean I0;
    public final /* synthetic */ Function1<TextLayoutResult, Unit> J0;
    public final /* synthetic */ OffsetMapping K0;
    public final /* synthetic */ Density L0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TextFieldState f6121p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ TextStyle f6122q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ int f6123r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ int f6124s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ TextFieldScrollerPosition f6125t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f6126u0;
    public final /* synthetic */ VisualTransformation v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final /* synthetic */ Modifier f6127w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ Modifier f6128x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ Modifier f6129y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(TextFieldState textFieldState, TextStyle textStyle, int i10, int i11, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, BringIntoViewRequester bringIntoViewRequester, TextFieldSelectionManager textFieldSelectionManager, boolean z10, boolean z11, Function1<? super TextLayoutResult, Unit> function1, OffsetMapping offsetMapping, Density density) {
        super(2);
        this.f6121p0 = textFieldState;
        this.f6122q0 = textStyle;
        this.f6123r0 = i10;
        this.f6124s0 = i11;
        this.f6125t0 = textFieldScrollerPosition;
        this.f6126u0 = textFieldValue;
        this.v0 = visualTransformation;
        this.f6127w0 = modifier;
        this.f6128x0 = modifier2;
        this.f6129y0 = modifier3;
        this.E0 = modifier4;
        this.F0 = bringIntoViewRequester;
        this.G0 = textFieldSelectionManager;
        this.H0 = z10;
        this.I0 = z11;
        this.J0 = function1;
        this.K0 = offsetMapping;
        this.L0 = density;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2032502107, iIntValue, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:624)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            TextFieldState textFieldState = this.f6121p0;
            Modifier modifierM323heightInVpY3zN4$default = SizeKt.m323heightInVpY3zN4$default(companion, textFieldState.m555getMinHeightForSingleLineFieldD9Ej5fM(), 0.0f, 2, null);
            TextStyle textStyle = this.f6122q0;
            Modifier modifierHeightInLines = HeightInLinesModifierKt.heightInLines(modifierM323heightInVpY3zN4$default, textStyle, this.f6123r0, this.f6124s0);
            d dVar = new d(textFieldState);
            SimpleLayoutKt.SimpleLayout(BringIntoViewRequesterKt.bringIntoViewRequester(TextFieldSizeKt.textFieldMinSize(TextFieldScrollKt.textFieldScroll(modifierHeightInLines, this.f6125t0, this.f6126u0, this.v0, dVar).then(this.f6127w0).then(this.f6128x0), textStyle).then(this.f6129y0).then(this.E0), this.F0), ComposableLambdaKt.composableLambda(composer2, -363167407, true, new c(this.G0, this.f6121p0, this.H0, this.I0, this.J0, this.f6126u0, this.K0, this.L0, this.f6124s0)), composer2, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
