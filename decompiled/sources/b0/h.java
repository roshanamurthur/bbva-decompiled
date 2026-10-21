package b0;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import androidx.compose.foundation.lazy.layout.MutableIntervalList;
import androidx.compose.foundation.pager.PagerIntervalContent;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.runtime.Composer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LazyLayoutPager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h extends LazyLayoutIntervalContent<PagerIntervalContent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function4<PagerScope, Integer, Composer, Integer, Unit> f24765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Function1<Integer, Object> f24766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableIntervalList f24767c;

    public h(int i10, @Nullable Function1 function1, @NotNull Function4 pageContent) {
        Intrinsics.checkNotNullParameter(pageContent, "pageContent");
        this.f24765a = pageContent;
        this.f24766b = function1;
        MutableIntervalList mutableIntervalList = new MutableIntervalList();
        mutableIntervalList.addInterval(i10, new PagerIntervalContent(function1, pageContent));
        this.f24767c = mutableIntervalList;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent
    @NotNull
    public final IntervalList<PagerIntervalContent> getIntervals() {
        return this.f24767c;
    }
}
