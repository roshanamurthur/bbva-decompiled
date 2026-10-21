package androidx.compose.foundation.pager;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Pager.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u0002H\u0016¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/pager/PagerSnapDistanceMaxPages;", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "", "startPage", "suggestedTargetPage", "", "velocity", "pageSize", "pageSpacing", "calculateTargetPage", "", "other", "", "equals", GenerateActivationFormCommand.HASH_CODE, "pagesLimit", "<init>", "(I)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
public final class PagerSnapDistanceMaxPages implements PagerSnapDistance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5485a;

    public PagerSnapDistanceMaxPages(int i10) {
        this.f5485a = i10;
    }

    @Override // androidx.compose.foundation.pager.PagerSnapDistance
    public int calculateTargetPage(int startPage, int suggestedTargetPage, float velocity, int pageSize, int pageSpacing) {
        int i10 = this.f5485a;
        return kotlin.ranges.c.coerceIn(suggestedTargetPage, startPage - i10, startPage + i10);
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof PagerSnapDistanceMaxPages) {
            return this.f5485a == ((PagerSnapDistanceMaxPages) other).f5485a;
        }
        return false;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public int getF5485a() {
        return this.f5485a;
    }
}
