package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.MagnifierKt;
import androidx.compose.foundation.MagnifierStyle;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: TextFieldSelectionManager.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class n extends Lambda implements Function1<Function0<? extends Offset>, Modifier> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Density f6488p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MutableState<IntSize> f6489q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Density density, MutableState<IntSize> mutableState) {
        super(1);
        this.f6488p0 = density;
        this.f6489q0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Modifier invoke(Function0<? extends Offset> function0) {
        Function0<? extends Offset> center = function0;
        Intrinsics.checkNotNullParameter(center, "center");
        return MagnifierKt.magnifier$default(Modifier.INSTANCE, new l(center), null, 0.0f, MagnifierStyle.INSTANCE.getTextDefault(), new m(this.f6488p0, this.f6489q0), 6, null);
    }
}
