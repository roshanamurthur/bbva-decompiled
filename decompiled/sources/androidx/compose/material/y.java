package androidx.compose.material;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class y extends Lambda implements Function0<Float> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ BottomSheetScaffoldState f9111p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(BottomSheetScaffoldState bottomSheetScaffoldState) {
        super(0);
        this.f9111p0 = bottomSheetScaffoldState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.f9111p0.getBottomSheetState().requireOffset());
    }
}
