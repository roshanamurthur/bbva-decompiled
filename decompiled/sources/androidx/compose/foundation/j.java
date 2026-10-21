package androidx.compose.foundation;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Magnifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Lambda implements Function1<LayoutCoordinates, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Offset> f4135p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(MutableState<Offset> mutableState) {
        super(1);
        this.f4135p0 = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates it = layoutCoordinates;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f4135p0.setValue(Offset.m2264boximpl(LayoutCoordinatesKt.positionInRoot(it)));
        return Unit.INSTANCE;
    }
}
