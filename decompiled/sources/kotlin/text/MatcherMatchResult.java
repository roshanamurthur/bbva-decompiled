package kotlin.text;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class MatcherMatchResult implements MatchResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Matcher f82321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CharSequence f82322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MatcherMatchResult$groups$1 f82323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public MatcherMatchResult$groupValues$1 f82324d;

    public MatcherMatchResult(@NotNull Matcher matcher, @NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f82321a = matcher;
        this.f82322b = input;
        this.f82323c = new MatcherMatchResult$groups$1(this);
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    public MatchResult.Destructured getDestructured() {
        return MatchResult.DefaultImpls.getDestructured(this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.text.MatcherMatchResult$groupValues$1] */
    @Override // kotlin.text.MatchResult
    @NotNull
    public List<String> getGroupValues() {
        if (this.f82324d == null) {
            this.f82324d = new AbstractList<String>() { // from class: kotlin.text.MatcherMatchResult$groupValues$1
                @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
                public final /* bridge */ boolean contains(Object obj) {
                    if (obj instanceof String) {
                        return contains((String) obj);
                    }
                    return false;
                }

                @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
                /* JADX INFO: renamed from: getSize */
                public int getF79490r0() {
                    return this.f82325p0.f82321a.groupCount() + 1;
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public final /* bridge */ int indexOf(Object obj) {
                    if (obj instanceof String) {
                        return indexOf((String) obj);
                    }
                    return -1;
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                public final /* bridge */ int lastIndexOf(Object obj) {
                    if (obj instanceof String) {
                        return lastIndexOf((String) obj);
                    }
                    return -1;
                }

                public /* bridge */ boolean contains(String str) {
                    return super.contains(str);
                }

                @Override // kotlin.collections.AbstractList, java.util.List
                @NotNull
                public String get(int index) {
                    String strGroup = this.f82325p0.f82321a.group(index);
                    return strGroup == null ? "" : strGroup;
                }

                public /* bridge */ int indexOf(String str) {
                    return super.indexOf(str);
                }

                public /* bridge */ int lastIndexOf(String str) {
                    return super.lastIndexOf(str);
                }
            };
        }
        MatcherMatchResult$groupValues$1 matcherMatchResult$groupValues$1 = this.f82324d;
        Intrinsics.checkNotNull(matcherMatchResult$groupValues$1);
        return matcherMatchResult$groupValues$1;
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    public MatchGroupCollection getGroups() {
        return this.f82323c;
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    public IntRange getRange() {
        Matcher matcher = this.f82321a;
        return kotlin.ranges.c.until(matcher.start(), matcher.end());
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    public String getValue() {
        String strGroup = this.f82321a.group();
        Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
        return strGroup;
    }

    @Override // kotlin.text.MatchResult
    @Nullable
    public MatchResult next() {
        Matcher matcher = this.f82321a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f82322b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        Intrinsics.checkNotNullExpressionValue(matcher2, "matcher(...)");
        return RegexKt.access$findNext(matcher2, iEnd, charSequence);
    }
}
