package androidx.compose.animation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Lambda implements Function1<Object, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f2827p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Object obj) {
        super(1);
        this.f2827p0 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(Intrinsics.areEqual(obj, this.f2827p0));
    }
}
