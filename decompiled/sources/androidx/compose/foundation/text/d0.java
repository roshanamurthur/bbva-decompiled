package androidx.compose.foundation.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TextFieldScroll.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends Lambda implements Function1<Float, Float> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TextFieldScrollerPosition f6120p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(TextFieldScrollerPosition textFieldScrollerPosition) {
        super(1);
        this.f6120p0 = textFieldScrollerPosition;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Float invoke(Float f6) {
        float fFloatValue = f6.floatValue();
        TextFieldScrollerPosition textFieldScrollerPosition = this.f6120p0;
        float offset = textFieldScrollerPosition.getOffset() + fFloatValue;
        if (offset > textFieldScrollerPosition.getMaximum()) {
            fFloatValue = textFieldScrollerPosition.getMaximum() - textFieldScrollerPosition.getOffset();
        } else if (offset < 0.0f) {
            fFloatValue = -textFieldScrollerPosition.getOffset();
        }
        textFieldScrollerPosition.setOffset(textFieldScrollerPosition.getOffset() + fFloatValue);
        return Float.valueOf(fFloatValue);
    }
}
