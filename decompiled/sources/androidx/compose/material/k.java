package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: BackdropScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class k extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f8805p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ BackdropScaffoldState f8806q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f8807r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(boolean z10, BackdropScaffoldState backdropScaffoldState, CoroutineScope coroutineScope) {
        super(0);
        this.f8805p0 = z10;
        this.f8806q0 = backdropScaffoldState;
        this.f8807r0 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f8805p0) {
            BackdropScaffoldState backdropScaffoldState = this.f8806q0;
            if (backdropScaffoldState.getConfirmStateChange$material_release().invoke(BackdropValue.Concealed).booleanValue()) {
                BuildersKt__Builders_commonKt.launch$default(this.f8807r0, null, null, new j(backdropScaffoldState, null), 3, null);
            }
        }
        return Unit.INSTANCE;
    }
}
