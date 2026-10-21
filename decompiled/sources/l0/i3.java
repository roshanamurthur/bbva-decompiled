package l0;

import androidx.compose.foundation.text.KeyboardActionScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SearchBar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i3 extends Lambda implements Function1<KeyboardActionScope, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function1<String, Unit> f82614p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ String f82615q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(String str, Function1 function1) {
        super(1);
        this.f82614p0 = function1;
        this.f82615q0 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(KeyboardActionScope keyboardActionScope) {
        KeyboardActionScope $receiver = keyboardActionScope;
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        this.f82614p0.invoke(this.f82615q0);
        return Unit.INSTANCE;
    }
}
