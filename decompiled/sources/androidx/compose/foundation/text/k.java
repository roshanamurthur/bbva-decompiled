package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k extends Lambda implements Function3<Integer, Integer, Boolean, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ OffsetMapping f6149p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f6150q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f6151r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f6152s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ TextFieldState f6153t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, OffsetMapping offsetMapping, TextFieldValue textFieldValue, boolean z10) {
        super(3);
        this.f6149p0 = offsetMapping;
        this.f6150q0 = z10;
        this.f6151r0 = textFieldValue;
        this.f6152s0 = textFieldSelectionManager;
        this.f6153t0 = textFieldState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Boolean invoke(Integer num, Integer num2, Boolean bool) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        boolean zBooleanValue = bool.booleanValue();
        OffsetMapping offsetMapping = this.f6149p0;
        if (!zBooleanValue) {
            iIntValue = offsetMapping.transformedToOriginal(iIntValue);
        }
        if (!zBooleanValue) {
            iIntValue2 = offsetMapping.transformedToOriginal(iIntValue2);
        }
        boolean z10 = false;
        if (this.f6150q0) {
            TextFieldValue textFieldValue = this.f6151r0;
            if (iIntValue != TextRange.m3967getStartimpl(textFieldValue.getSelection()) || iIntValue2 != TextRange.m3962getEndimpl(textFieldValue.getSelection())) {
                int iCoerceAtMost = kotlin.ranges.c.coerceAtMost(iIntValue, iIntValue2);
                TextFieldSelectionManager textFieldSelectionManager = this.f6152s0;
                if (iCoerceAtMost < 0 || kotlin.ranges.c.coerceAtLeast(iIntValue, iIntValue2) > textFieldValue.getAnnotatedString().length()) {
                    textFieldSelectionManager.exitSelectionMode$foundation_release();
                } else {
                    if (zBooleanValue || iIntValue == iIntValue2) {
                        textFieldSelectionManager.exitSelectionMode$foundation_release();
                    } else {
                        textFieldSelectionManager.enterSelectionMode$foundation_release();
                    }
                    this.f6153t0.getOnValueChange().invoke(new TextFieldValue(textFieldValue.getAnnotatedString(), TextRangeKt.TextRange(iIntValue, iIntValue2), (TextRange) null, 4, (DefaultConstructorMarker) null));
                    z10 = true;
                }
            }
        }
        return Boolean.valueOf(z10);
    }
}
