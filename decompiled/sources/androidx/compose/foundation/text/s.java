package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldPreparedSelection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TextFieldKeyInput.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s extends Lambda implements Function1<TextFieldPreparedSelection, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final s f6270p0 = new s(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TextFieldPreparedSelection textFieldPreparedSelection) {
        TextFieldPreparedSelection collapseLeftOr = textFieldPreparedSelection;
        Intrinsics.checkNotNullParameter(collapseLeftOr, "$this$collapseLeftOr");
        collapseLeftOr.moveCursorLeft();
        return Unit.INSTANCE;
    }
}
