package z;

import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LazyGridAnimateScrollScope.kt */
/* JADX INFO: loaded from: classes.dex */
public final class e extends Lambda implements Function1<Integer, Integer> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f94893p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ List<LazyGridItemInfo> f94894q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(boolean z10, List<? extends LazyGridItemInfo> list) {
        super(1);
        this.f94893p0 = z10;
        this.f94894q0 = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(Integer num) {
        int iIntValue = num.intValue();
        boolean z10 = this.f94893p0;
        LazyGridItemInfo lazyGridItemInfo = this.f94894q0.get(iIntValue);
        return Integer.valueOf(z10 ? lazyGridItemInfo.getRow() : lazyGridItemInfo.getColumn());
    }
}
