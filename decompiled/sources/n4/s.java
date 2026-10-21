package n4;

import com.bbva.cellswidgets.CellsEditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CellsEditText.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CellsEditText f84460p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(CellsEditText cellsEditText) {
        super(1);
        this.f84460p0 = cellsEditText;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        Boolean bool2 = bool;
        Intrinsics.checkNotNull(bool2);
        boolean zBooleanValue = bool2.booleanValue();
        CellsEditText cellsEditText = this.f84460p0;
        if (zBooleanValue) {
            cellsEditText.getLeftActionButton().setVisibility(0);
        } else {
            cellsEditText.getLeftActionButton().setVisibility(8);
        }
        return Unit.INSTANCE;
    }
}
