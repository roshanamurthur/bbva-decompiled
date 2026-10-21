package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.webkit.ProxyConfig;
import androidx.window.core.ExperimentalWindowApi;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SplitPairFilter.kt */
/* JADX INFO: loaded from: classes2.dex */
@ExperimentalWindowApi
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0013\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0018\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Landroidx/window/embedding/SplitPairFilter;", "", "Landroid/app/Activity;", "primaryActivity", "secondaryActivity", "", "matchesActivityPair", "Landroid/content/Intent;", "secondaryActivityIntent", "matchesActivityIntentPair", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Landroid/content/ComponentName;", "a", "Landroid/content/ComponentName;", "getPrimaryActivityName", "()Landroid/content/ComponentName;", "primaryActivityName", "b", "getSecondaryActivityName", "secondaryActivityName", "c", "Ljava/lang/String;", "getSecondaryActivityIntentAction", "()Ljava/lang/String;", "secondaryActivityIntentAction", "<init>", "(Landroid/content/ComponentName;Landroid/content/ComponentName;Ljava/lang/String;)V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class SplitPairFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ComponentName primaryActivityName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ComponentName secondaryActivityName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String secondaryActivityIntentAction;

    public SplitPairFilter(@NotNull ComponentName primaryActivityName, @NotNull ComponentName secondaryActivityName, @Nullable String str) {
        Intrinsics.checkNotNullParameter(primaryActivityName, "primaryActivityName");
        Intrinsics.checkNotNullParameter(secondaryActivityName, "secondaryActivityName");
        this.primaryActivityName = primaryActivityName;
        this.secondaryActivityName = secondaryActivityName;
        this.secondaryActivityIntentAction = str;
        String packageName = primaryActivityName.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "primaryActivityName.packageName");
        String className = primaryActivityName.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "primaryActivityName.className");
        String packageName2 = secondaryActivityName.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName2, "secondaryActivityName.packageName");
        String className2 = secondaryActivityName.getClassName();
        Intrinsics.checkNotNullExpressionValue(className2, "secondaryActivityName.className");
        if (packageName.length() == 0 || packageName2.length() == 0) {
            throw new IllegalArgumentException("Package name must not be empty".toString());
        }
        if (className.length() == 0 || className2.length() == 0) {
            throw new IllegalArgumentException("Activity class name must not be empty.".toString());
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) packageName, (CharSequence) ProxyConfig.MATCH_ALL_SCHEMES, false, 2, (Object) null) && StringsKt__StringsKt.indexOf$default((CharSequence) packageName, ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6, (Object) null) != packageName.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) className, (CharSequence) ProxyConfig.MATCH_ALL_SCHEMES, false, 2, (Object) null) && StringsKt__StringsKt.indexOf$default((CharSequence) className, ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6, (Object) null) != className.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
        }
        if (StringsKt__StringsKt.contains$default(packageName2, (CharSequence) r12, (boolean) r11, (int) r10, (Object) r9) && StringsKt__StringsKt.indexOf$default((CharSequence) packageName2, ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6, (Object) null) != packageName2.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) className2, (CharSequence) ProxyConfig.MATCH_ALL_SCHEMES, false, 2, (Object) 0) && StringsKt__StringsKt.indexOf$default((CharSequence) className2, ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6, (Object) null) != className2.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitPairFilter)) {
            return false;
        }
        SplitPairFilter splitPairFilter = (SplitPairFilter) other;
        return Intrinsics.areEqual(this.primaryActivityName, splitPairFilter.primaryActivityName) && Intrinsics.areEqual(this.secondaryActivityName, splitPairFilter.secondaryActivityName) && Intrinsics.areEqual(this.secondaryActivityIntentAction, splitPairFilter.secondaryActivityIntentAction);
    }

    @NotNull
    public final ComponentName getPrimaryActivityName() {
        return this.primaryActivityName;
    }

    @Nullable
    public final String getSecondaryActivityIntentAction() {
        return this.secondaryActivityIntentAction;
    }

    @NotNull
    public final ComponentName getSecondaryActivityName() {
        return this.secondaryActivityName;
    }

    public int hashCode() {
        int iHashCode = (this.secondaryActivityName.hashCode() + (this.primaryActivityName.hashCode() * 31)) * 31;
        String str = this.secondaryActivityIntentAction;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean matchesActivityIntentPair(@NotNull Activity primaryActivity, @NotNull Intent secondaryActivityIntent) {
        Intrinsics.checkNotNullParameter(primaryActivity, "primaryActivity");
        Intrinsics.checkNotNullParameter(secondaryActivityIntent, "secondaryActivityIntent");
        ComponentName componentName = primaryActivity.getComponentName();
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        if (!matcherUtils.areComponentsMatching$window_release(componentName, this.primaryActivityName) || !matcherUtils.areComponentsMatching$window_release(secondaryActivityIntent.getComponent(), this.secondaryActivityName)) {
            return false;
        }
        String str = this.secondaryActivityIntentAction;
        return str == null || Intrinsics.areEqual(str, secondaryActivityIntent.getAction());
    }

    public final boolean matchesActivityPair(@NotNull Activity primaryActivity, @NotNull Activity secondaryActivity) {
        Intrinsics.checkNotNullParameter(primaryActivity, "primaryActivity");
        Intrinsics.checkNotNullParameter(secondaryActivity, "secondaryActivity");
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        boolean z10 = false;
        boolean z11 = matcherUtils.areComponentsMatching$window_release(primaryActivity.getComponentName(), this.primaryActivityName) && matcherUtils.areComponentsMatching$window_release(secondaryActivity.getComponentName(), this.secondaryActivityName);
        if (secondaryActivity.getIntent() == null) {
            return z11;
        }
        if (z11) {
            Intent intent = secondaryActivity.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "secondaryActivity.intent");
            if (matchesActivityIntentPair(primaryActivity, intent)) {
                z10 = true;
            }
        }
        return z10;
    }

    @NotNull
    public String toString() {
        return "SplitPairFilter{primaryActivityName=" + this.primaryActivityName + ", secondaryActivityName=" + this.secondaryActivityName + ", secondaryActivityAction=" + ((Object) this.secondaryActivityIntentAction) + AbstractJsonLexerKt.END_OBJ;
    }
}
