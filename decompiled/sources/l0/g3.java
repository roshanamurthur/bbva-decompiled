package l0;

import androidx.compose.ui.focus.FocusRequester;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SearchBar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g3 extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ FocusRequester f82579p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(FocusRequester focusRequester) {
        super(0);
        this.f82579p0 = focusRequester;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        this.f82579p0.requestFocus();
        return Boolean.TRUE;
    }
}
