package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t4 extends Lambda implements Function1<TextFieldValue, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ MutableState<TextFieldValue> f13122p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(MutableState<TextFieldValue> mutableState) {
        super(1);
        this.f13122p0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TextFieldValue textFieldValue) {
        TextFieldValue it = textFieldValue;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f13122p0.setValue(it);
        return Unit.INSTANCE;
    }
}
