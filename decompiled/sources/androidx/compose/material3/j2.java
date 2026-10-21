package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ModalBottomSheet.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j2 extends Lambda implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SheetState f12943p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f12944q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(SheetState sheetState, Function0<Unit> function0) {
        super(1);
        this.f12943p0 = sheetState;
        this.f12944q0 = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th2) {
        if (!this.f12943p0.isVisible()) {
            this.f12944q0.invoke();
        }
        return Unit.INSTANCE;
    }
}
