package q1;

import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: EditProcessor.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Lambda implements Function1<EditCommand, CharSequence> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ EditCommand f92742p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ EditProcessor f92743q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(EditProcessor editProcessor, EditCommand editCommand) {
        super(1);
        this.f92742p0 = editCommand;
        this.f92743q0 = editProcessor;
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(EditCommand editCommand) {
        EditCommand it = editCommand;
        Intrinsics.checkNotNullParameter(it, "it");
        StringBuilder sbD = androidx.camera.core.impl.utils.c.d(this.f92742p0 == it ? " > " : "   ");
        sbD.append(EditProcessor.access$toStringForLog(this.f92743q0, it));
        return sbD.toString();
    }
}
