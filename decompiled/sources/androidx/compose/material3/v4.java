package androidx.compose.material3;

import androidx.compose.foundation.text.KeyboardActionScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class v4 extends Lambda implements Function1<KeyboardActionScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TimePickerState f14350p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(TimePickerState timePickerState) {
        super(1);
        this.f14350p0 = timePickerState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(KeyboardActionScope keyboardActionScope) {
        KeyboardActionScope $receiver = keyboardActionScope;
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        this.f14350p0.m1422setSelectioniHAOin8$material3_release(Selection.INSTANCE.m1242getMinuteJiIwxys());
        return Unit.INSTANCE;
    }
}
