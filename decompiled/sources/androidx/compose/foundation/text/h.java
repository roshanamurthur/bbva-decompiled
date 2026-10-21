package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextLayoutResult;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h extends Lambda implements Function1<List<TextLayoutResult>, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ TextFieldState f6139p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TextFieldState textFieldState) {
        super(1);
        this.f6139p0 = textFieldState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(List<TextLayoutResult> list) {
        boolean z10;
        List<TextLayoutResult> it = list;
        Intrinsics.checkNotNullParameter(it, "it");
        TextFieldState textFieldState = this.f6139p0;
        if (textFieldState.getLayoutResult() != null) {
            TextLayoutResultProxy layoutResult = textFieldState.getLayoutResult();
            Intrinsics.checkNotNull(layoutResult);
            it.add(layoutResult.getValue());
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
