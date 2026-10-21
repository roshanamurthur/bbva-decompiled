package androidx.window.embedding;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.util.Pair;
import android.view.WindowMetrics;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.ActivityFilter;
import androidx.window.embedding.EmbeddingAdapter;
import androidx.window.embedding.SplitPairFilter;
import androidx.window.embedding.SplitRule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EmbeddingAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@ExperimentalWindowApi
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J(\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J(\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u000b0\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007H\u0007J\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007¨\u0006\u001d"}, d2 = {"Landroidx/window/embedding/EmbeddingAdapter;", "", "", "Landroidx/window/extensions/embedding/SplitInfo;", "splitInfoList", "Landroidx/window/embedding/SplitInfo;", "translate", "", "Landroidx/window/embedding/SplitPairFilter;", "splitPairFilters", "Ljava/util/function/Predicate;", "Landroid/util/Pair;", "Landroid/app/Activity;", "translateActivityPairPredicates", "Landroid/content/Intent;", "translateActivityIntentPredicates", "Landroidx/window/embedding/SplitRule;", "splitRule", "Landroid/view/WindowMetrics;", "translateParentMetricsPredicate", "Landroidx/window/embedding/ActivityFilter;", "activityFilters", "translateActivityPredicates", "translateIntentPredicates", "Landroidx/window/embedding/EmbeddingRule;", "rules", "Landroidx/window/extensions/embedding/EmbeddingRule;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class EmbeddingAdapter {
    public static SplitInfo a(androidx.window.extensions.embedding.SplitInfo splitInfo) {
        boolean zIsEmpty;
        androidx.window.extensions.embedding.ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        Intrinsics.checkNotNullExpressionValue(primaryActivityStack, "splitInfo.primaryActivityStack");
        boolean zIsEmpty2 = false;
        try {
            zIsEmpty = primaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused) {
            zIsEmpty = false;
        }
        List activities = primaryActivityStack.getActivities();
        Intrinsics.checkNotNullExpressionValue(activities, "primaryActivityStack.activities");
        ActivityStack activityStack = new ActivityStack(activities, zIsEmpty);
        androidx.window.extensions.embedding.ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        Intrinsics.checkNotNullExpressionValue(secondaryActivityStack, "splitInfo.secondaryActivityStack");
        try {
            zIsEmpty2 = secondaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused2) {
        }
        List activities2 = secondaryActivityStack.getActivities();
        Intrinsics.checkNotNullExpressionValue(activities2, "secondaryActivityStack.activities");
        return new SplitInfo(activityStack, new ActivityStack(activities2, zIsEmpty2), splitInfo.getSplitRatio());
    }

    @NotNull
    public final List<SplitInfo> translate(@NotNull List<? extends androidx.window.extensions.embedding.SplitInfo> splitInfoList) {
        Intrinsics.checkNotNullParameter(splitInfoList, "splitInfoList");
        List<? extends androidx.window.extensions.embedding.SplitInfo> list = splitInfoList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((androidx.window.extensions.embedding.SplitInfo) it.next()));
        }
        return arrayList;
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<Pair<Activity, Intent>> translateActivityIntentPredicates(@NotNull final Set<SplitPairFilter> splitPairFilters) {
        Intrinsics.checkNotNullParameter(splitPairFilters, "splitPairFilters");
        return new Predicate() { // from class: l3.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                EmbeddingAdapter this$0 = this.f83082a;
                Set splitPairFilters2 = splitPairFilters;
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(splitPairFilters2, "$splitPairFilters");
                Intrinsics.checkNotNullExpressionValue(pair, "(first, second)");
                this$0.getClass();
                Intrinsics.checkNotNullParameter(pair, "<this>");
                Activity activity = (Activity) pair.first;
                Intrinsics.checkNotNullParameter(pair, "<this>");
                Intent intent = (Intent) pair.second;
                Set set = splitPairFilters2;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return false;
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (((SplitPairFilter) it.next()).matchesActivityIntentPair(activity, intent)) {
                        return true;
                    }
                }
                return false;
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<Pair<Activity, Activity>> translateActivityPairPredicates(@NotNull final Set<SplitPairFilter> splitPairFilters) {
        Intrinsics.checkNotNullParameter(splitPairFilters, "splitPairFilters");
        return new Predicate() { // from class: l3.e
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                EmbeddingAdapter this$0 = this.f83087a;
                Set splitPairFilters2 = splitPairFilters;
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(splitPairFilters2, "$splitPairFilters");
                Intrinsics.checkNotNullExpressionValue(pair, "(first, second)");
                this$0.getClass();
                Intrinsics.checkNotNullParameter(pair, "<this>");
                Activity activity = (Activity) pair.first;
                Intrinsics.checkNotNullParameter(pair, "<this>");
                Activity activity2 = (Activity) pair.second;
                Set set = splitPairFilters2;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return false;
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (((SplitPairFilter) it.next()).matchesActivityPair(activity, activity2)) {
                        return true;
                    }
                }
                return false;
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<Activity> translateActivityPredicates(@NotNull final Set<ActivityFilter> activityFilters) {
        Intrinsics.checkNotNullParameter(activityFilters, "activityFilters");
        return new Predicate() { // from class: l3.b
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Set activityFilters2 = activityFilters;
                Activity activity = (Activity) obj;
                Intrinsics.checkNotNullParameter(activityFilters2, "$activityFilters");
                Set<ActivityFilter> set = activityFilters2;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return false;
                }
                for (ActivityFilter activityFilter : set) {
                    Intrinsics.checkNotNullExpressionValue(activity, "activity");
                    if (activityFilter.matchesActivity(activity)) {
                        return true;
                    }
                }
                return false;
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<Intent> translateIntentPredicates(@NotNull final Set<ActivityFilter> activityFilters) {
        Intrinsics.checkNotNullParameter(activityFilters, "activityFilters");
        return new Predicate() { // from class: l3.d
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Set activityFilters2 = activityFilters;
                Intent intent = (Intent) obj;
                Intrinsics.checkNotNullParameter(activityFilters2, "$activityFilters");
                Set<ActivityFilter> set = activityFilters2;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return false;
                }
                for (ActivityFilter activityFilter : set) {
                    Intrinsics.checkNotNullExpressionValue(intent, "intent");
                    if (activityFilter.matchesIntent(intent)) {
                        return true;
                    }
                }
                return false;
            }
        };
    }

    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    @NotNull
    public final Predicate<WindowMetrics> translateParentMetricsPredicate(@NotNull final SplitRule splitRule) {
        Intrinsics.checkNotNullParameter(splitRule, "splitRule");
        return new Predicate() { // from class: l3.c
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                SplitRule splitRule2 = splitRule;
                WindowMetrics windowMetrics = (WindowMetrics) obj;
                Intrinsics.checkNotNullParameter(splitRule2, "$splitRule");
                Intrinsics.checkNotNullExpressionValue(windowMetrics, "windowMetrics");
                return splitRule2.checkParentMetrics(windowMetrics);
            }
        };
    }

    @NotNull
    public final Set<androidx.window.extensions.embedding.EmbeddingRule> translate(@NotNull Set<? extends EmbeddingRule> rules) {
        androidx.window.extensions.embedding.SplitPairRule splitPairRuleBuild;
        Intrinsics.checkNotNullParameter(rules, "rules");
        Set<? extends EmbeddingRule> set = rules;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
        for (EmbeddingRule embeddingRule : set) {
            if (embeddingRule instanceof SplitPairRule) {
                SplitPairRule splitPairRule = (SplitPairRule) embeddingRule;
                splitPairRuleBuild = new androidx.window.extensions.embedding.SplitPairRule.Builder(translateActivityPairPredicates(splitPairRule.getFilters()), translateActivityIntentPredicates(splitPairRule.getFilters()), translateParentMetricsPredicate((SplitRule) embeddingRule)).setSplitRatio(splitPairRule.getSplitRatio()).setLayoutDirection(splitPairRule.getLayoutDirection()).setShouldFinishPrimaryWithSecondary(splitPairRule.getFinishPrimaryWithSecondary()).setShouldFinishSecondaryWithPrimary(splitPairRule.getFinishSecondaryWithPrimary()).setShouldClearTop(splitPairRule.getClearTop()).build();
                Intrinsics.checkNotNullExpressionValue(splitPairRuleBuild, "SplitPairRuleBuilder(\n  …                 .build()");
            } else if (embeddingRule instanceof SplitPlaceholderRule) {
                SplitPlaceholderRule splitPlaceholderRule = (SplitPlaceholderRule) embeddingRule;
                splitPairRuleBuild = new androidx.window.extensions.embedding.SplitPlaceholderRule.Builder(splitPlaceholderRule.getPlaceholderIntent(), translateActivityPredicates(splitPlaceholderRule.getFilters()), translateIntentPredicates(splitPlaceholderRule.getFilters()), translateParentMetricsPredicate((SplitRule) embeddingRule)).setSplitRatio(splitPlaceholderRule.getSplitRatio()).setLayoutDirection(splitPlaceholderRule.getLayoutDirection()).build();
                Intrinsics.checkNotNullExpressionValue(splitPairRuleBuild, "SplitPlaceholderRuleBuil…                 .build()");
            } else if (embeddingRule instanceof ActivityRule) {
                ActivityRule activityRule = (ActivityRule) embeddingRule;
                splitPairRuleBuild = new androidx.window.extensions.embedding.ActivityRule.Builder(translateActivityPredicates(activityRule.getFilters()), translateIntentPredicates(activityRule.getFilters())).setShouldAlwaysExpand(activityRule.getAlwaysExpand()).build();
                Intrinsics.checkNotNullExpressionValue(splitPairRuleBuild, "ActivityRuleBuilder(\n   …                 .build()");
            } else {
                throw new IllegalArgumentException("Unsupported rule type");
            }
            arrayList.add((androidx.window.extensions.embedding.EmbeddingRule) splitPairRuleBuild);
        }
        return CollectionsKt___CollectionsKt.toSet(arrayList);
    }
}
