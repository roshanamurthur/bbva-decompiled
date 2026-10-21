package o8;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DiskFileDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ StringBuilder f85290p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(StringBuilder sb2) {
        super(1);
        this.f85290p0 = sb2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f85290p0.append(it);
        return Unit.INSTANCE;
    }
}
