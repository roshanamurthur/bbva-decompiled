package w0;

import androidx.compose.ui.draw.CacheDrawScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ b f94108p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CacheDrawScope f94109q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, CacheDrawScope cacheDrawScope) {
        super(0);
        this.f94108p0 = bVar;
        this.f94109q0 = cacheDrawScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f94108p0.J0.invoke(this.f94109q0);
        return Unit.INSTANCE;
    }
}
