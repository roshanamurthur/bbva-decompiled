package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AndroidSelectionHandles.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f6458p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ long f6459q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j10, boolean z10) {
        super(1);
        this.f6458p0 = z10;
        this.f6459q0 = j10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        semantics.set(SelectionHandlesKt.getSelectionHandleInfoKey(), new SelectionHandleInfo(this.f6458p0 ? Handle.SelectionStart : Handle.SelectionEnd, this.f6459q0, null));
        return Unit.INSTANCE;
    }
}
