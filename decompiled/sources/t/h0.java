package t;

import androidx.compose.foundation.ScrollState;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: Scroll.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends Lambda implements Function2<Float, Float, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f93394p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ boolean f93395q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ ScrollState f93396r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(CoroutineScope coroutineScope, boolean z10, ScrollState scrollState) {
        super(2);
        this.f93394p0 = coroutineScope;
        this.f93395q0 = z10;
        this.f93396r0 = scrollState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(Float f6, Float f10) {
        float fFloatValue = f6.floatValue();
        BuildersKt__Builders_commonKt.launch$default(this.f93394p0, null, null, new g0(this.f93395q0, this.f93396r0, f10.floatValue(), fFloatValue, null), 3, null);
        return Boolean.TRUE;
    }
}
