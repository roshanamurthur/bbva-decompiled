package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.webkit.ProxyConfig;
import androidx.window.core.ExperimentalWindowApi;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MatcherUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
@ExperimentalWindowApi
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\b\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/window/embedding/MatcherUtils;", "", "Landroid/content/ComponentName;", "activityComponent", "ruleComponent", "", "areComponentsMatching$window_release", "(Landroid/content/ComponentName;Landroid/content/ComponentName;)Z", "areComponentsMatching", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "areActivityOrIntentComponentsMatching$window_release", "(Landroid/app/Activity;Landroid/content/ComponentName;)Z", "areActivityOrIntentComponentsMatching", "sDebugMatchers", "Z", "", "sMatchersTag", "Ljava/lang/String;", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class MatcherUtils {

    @NotNull
    public static final MatcherUtils INSTANCE = new MatcherUtils();
    public static final boolean sDebugMatchers = false;

    @NotNull
    public static final String sMatchersTag = "SplitRuleResolution";

    public static boolean a(String str, String str2) {
        if (!StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) ProxyConfig.MATCH_ALL_SCHEMES, false, 2, (Object) null)) {
            return false;
        }
        if (Intrinsics.areEqual(str2, ProxyConfig.MATCH_ALL_SCHEMES)) {
            return true;
        }
        if (StringsKt__StringsKt.indexOf$default((CharSequence) str2, ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6, (Object) null) != StringsKt__StringsKt.lastIndexOf$default((CharSequence) str2, ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6, (Object) null) || !l.endsWith$default(str2, ProxyConfig.MATCH_ALL_SCHEMES, false, 2, null)) {
            throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end".toString());
        }
        String strSubstring = str2.substring(0, str2.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return l.startsWith$default(str, strSubstring, false, 2, null);
    }

    public final boolean areActivityOrIntentComponentsMatching$window_release(@NotNull Activity activity, @NotNull ComponentName ruleComponent) {
        ComponentName component;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(ruleComponent, "ruleComponent");
        if (areComponentsMatching$window_release(activity.getComponentName(), ruleComponent)) {
            return true;
        }
        Intent intent = activity.getIntent();
        if (intent == null || (component = intent.getComponent()) == null) {
            return false;
        }
        return INSTANCE.areComponentsMatching$window_release(component, ruleComponent);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0086  */
    public final boolean areComponentsMatching$window_release(@Nullable ComponentName activityComponent, @NotNull ComponentName ruleComponent) {
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(ruleComponent, "ruleComponent");
        if (activityComponent == null) {
            return Intrinsics.areEqual(ruleComponent.getPackageName(), ProxyConfig.MATCH_ALL_SCHEMES) && Intrinsics.areEqual(ruleComponent.getClassName(), ProxyConfig.MATCH_ALL_SCHEMES);
        }
        String string = activityComponent.toString();
        Intrinsics.checkNotNullExpressionValue(string, "activityComponent.toString()");
        if (!(!StringsKt__StringsKt.contains$default((CharSequence) string, (CharSequence) ProxyConfig.MATCH_ALL_SCHEMES, false, 2, (Object) null))) {
            throw new IllegalArgumentException("Wildcard can only be part of the rule.".toString());
        }
        if (Intrinsics.areEqual(activityComponent.getPackageName(), ruleComponent.getPackageName())) {
            z10 = true;
        } else {
            String packageName = activityComponent.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "activityComponent.packageName");
            String packageName2 = ruleComponent.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName2, "ruleComponent.packageName");
            if (a(packageName, packageName2)) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (Intrinsics.areEqual(activityComponent.getClassName(), ruleComponent.getClassName())) {
            z11 = true;
        } else {
            String className = activityComponent.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "activityComponent.className");
            String className2 = ruleComponent.getClassName();
            Intrinsics.checkNotNullExpressionValue(className2, "ruleComponent.className");
            if (a(className, className2)) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        return z10 && z11;
    }
}
