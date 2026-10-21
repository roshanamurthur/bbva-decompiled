package androidx.compose.foundation.text;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteAllCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputSession;
import java.io.IOException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
public final class i extends Lambda implements Function1<AnnotatedString, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f6140p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f6141q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ TextFieldState f6142r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ SemanticsPropertyReceiver f6143s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z10, boolean z11, TextFieldState textFieldState, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        super(1);
        this.f6140p0 = z10;
        this.f6141q0 = z11;
        this.f6142r0 = textFieldState;
        this.f6143s0 = semanticsPropertyReceiver;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AnnotatedString annotatedString) throws IOException {
        Unit unit;
        AnnotatedString text = annotatedString;
        Intrinsics.checkNotNullParameter(text, "text");
        if (this.f6140p0 || !this.f6141q0) {
            return Boolean.FALSE;
        }
        TextFieldState textFieldState = this.f6142r0;
        TextInputSession inputSession = textFieldState.getInputSession();
        if (inputSession != null) {
            TextFieldDelegate.INSTANCE.onEditCommand$foundation_release(CollectionsKt__CollectionsKt.listOf((Object[]) new EditCommand[]{new DeleteAllCommand(), new CommitTextCommand(text, 1)}), textFieldState.getProcessor(), textFieldState.getOnValueChange(), inputSession);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            textFieldState.getOnValueChange().invoke(new TextFieldValue(text.getText(), TextRangeKt.TextRange(text.getText().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
        }
        return Boolean.TRUE;
    }
}
