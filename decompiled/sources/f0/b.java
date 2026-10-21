package f0;

import androidx.compose.foundation.text.modifiers.SelectionController;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SelectionController.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Lambda implements Function0<TextLayoutResult> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SelectionController f68373p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SelectionController selectionController) {
        super(0);
        this.f68373p0 = selectionController;
    }

    @Override // kotlin.jvm.functions.Function0
    public final TextLayoutResult invoke() {
        return this.f68373p0.f6216r0.getTextLayoutResult();
    }
}
