package k0;

import androidx.compose.material.ripple.AndroidRippleIndicationInstance;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Ripple.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ AndroidRippleIndicationInstance f79143p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        super(0);
        this.f79143p0 = androidRippleIndicationInstance;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AndroidRippleIndicationInstance androidRippleIndicationInstance = this.f79143p0;
        androidRippleIndicationInstance.f8932w0.setValue(Boolean.valueOf(!((Boolean) androidRippleIndicationInstance.f8932w0.getValue()).booleanValue()));
        return Unit.INSTANCE;
    }
}
