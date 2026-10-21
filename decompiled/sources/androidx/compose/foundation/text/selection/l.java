package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TextFieldSelectionManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l extends Lambda implements Function1<Density, Offset> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Function0<Offset> f6485p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Function0<Offset> function0) {
        super(1);
        this.f6485p0 = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Offset invoke(Density density) {
        Density magnifier = density;
        Intrinsics.checkNotNullParameter(magnifier, "$this$magnifier");
        return Offset.m2264boximpl(this.f6485p0.invoke().getF15533a());
    }
}
