package y0;

import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: Vertices.kt */
/* JADX INFO: loaded from: classes.dex */
public final class t extends Lambda implements Function1<Integer, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ List<Offset> f94724p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(List<Offset> list) {
        super(1);
        this.f94724p0 = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Integer num) {
        int iIntValue = num.intValue();
        return Boolean.valueOf(iIntValue < 0 || iIntValue >= this.f94724p0.size());
    }
}
