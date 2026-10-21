package l0;

import androidx.compose.ui.focus.FocusState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SearchBar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f3 extends Lambda implements Function1<FocusState, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function1<Boolean, Unit> f82551p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f3(Function1<? super Boolean, Unit> function1) {
        super(1);
        this.f82551p0 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(FocusState focusState) {
        FocusState it = focusState;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isFocused()) {
            this.f82551p0.invoke(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
