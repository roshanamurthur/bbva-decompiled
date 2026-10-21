package t;

import androidx.compose.foundation.ScrollState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Scroll.kt */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends Lambda implements Function0<Float> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ScrollState f93401p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ScrollState scrollState) {
        super(0);
        this.f93401p0 = scrollState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        return Float.valueOf(this.f93401p0.getMaxValue());
    }
}
