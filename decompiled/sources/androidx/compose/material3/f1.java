package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Integer> f12818p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(MutableState<Integer> mutableState) {
        super(1);
        this.f12818p0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        this.f12818p0.setValue(Integer.valueOf(num.intValue()));
        return Unit.INSTANCE;
    }
}
