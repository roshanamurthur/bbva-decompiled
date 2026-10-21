package k7;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AllowValidation.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d extends Lambda implements Function0<Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f79220p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z10) {
        super(0);
        this.f79220p0 = z10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.f79220p0);
    }
}
