package kotlin.text;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractCollection;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0096\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000fH\u0096\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"kotlin/text/MatcherMatchResult$groups$1", "Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/collections/AbstractCollection;", "Lkotlin/text/MatchGroup;", "size", "", "getSize", "()I", "get", FirebaseAnalytics.Param.INDEX, "name", "", "isEmpty", "", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MatcherMatchResult$groups$1 extends AbstractCollection<MatchGroup> implements MatchNamedGroupCollection {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ MatcherMatchResult f82326p0;

    /* JADX INFO: compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/text/MatchGroup;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends Lambda implements Function1<Integer, MatchGroup> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ MatchGroup invoke(Integer num) {
            return invoke(num.intValue());
        }

        @Nullable
        public final MatchGroup invoke(int i10) {
            return MatcherMatchResult$groups$1.this.get(i10);
        }
    }

    public MatcherMatchResult$groups$1(MatcherMatchResult matcherMatchResult) {
        this.f82326p0 = matcherMatchResult;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof MatchGroup)) {
            return contains((MatchGroup) obj);
        }
        return false;
    }

    @Override // kotlin.text.MatchGroupCollection
    @Nullable
    public MatchGroup get(int index) {
        MatcherMatchResult matcherMatchResult = this.f82326p0;
        java.util.regex.MatchResult matchResult = matcherMatchResult.f82321a;
        IntRange intRangeUntil = kotlin.ranges.c.until(matchResult.start(index), matchResult.end(index));
        if (intRangeUntil.getStart().intValue() < 0) {
            return null;
        }
        String strGroup = matcherMatchResult.f82321a.group(index);
        Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
        return new MatchGroup(strGroup, intRangeUntil);
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f82326p0.f82321a.groupCount() + 1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return false;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<MatchGroup> iterator() {
        return SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(CollectionsKt__CollectionsKt.getIndices(this)), new a()).iterator();
    }

    public /* bridge */ boolean contains(MatchGroup matchGroup) {
        return super.contains(matchGroup);
    }

    @Override // kotlin.text.MatchNamedGroupCollection
    @Nullable
    public MatchGroup get(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return PlatformImplementationsKt.IMPLEMENTATIONS.getMatchResultNamedGroup(this.f82326p0.f82321a, name);
    }
}
