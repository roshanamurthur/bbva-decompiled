package androidx.compose.material3;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class w1 extends Lambda implements Function1<Density, IntOffset> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SheetState f14359p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(SheetState sheetState) {
        super(1);
        this.f14359p0 = sheetState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final IntOffset invoke(Density density) {
        Density offset = density;
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m4498boximpl(IntOffsetKt.IntOffset(0, (int) this.f14359p0.requireOffset()));
    }
}
