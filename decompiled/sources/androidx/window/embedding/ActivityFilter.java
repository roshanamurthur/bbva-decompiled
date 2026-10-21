package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.webkit.ProxyConfig;
import androidx.window.core.ExperimentalWindowApi;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.fidoalliance.intent.api.UAFAppIntentExtras;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivityFilter.kt */
/* JADX INFO: loaded from: classes2.dex */
@ExperimentalWindowApi
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0013\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroidx/window/embedding/ActivityFilter;", "", "Landroid/content/Intent;", "intent", "", "matchesIntent", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "matchesActivity", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Landroid/content/ComponentName;", "a", "Landroid/content/ComponentName;", "getComponentName", "()Landroid/content/ComponentName;", UAFAppIntentExtras.IEN_COMPONENT_NAME, "b", "Ljava/lang/String;", "getIntentAction", "()Ljava/lang/String;", "intentAction", "<init>", "(Landroid/content/ComponentName;Ljava/lang/String;)V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class ActivityFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ComponentName componentName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String intentAction;

    public ActivityFilter(@NotNull ComponentName componentName, @Nullable String str) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        this.componentName = componentName;
        this.intentAction = str;
        String packageName = componentName.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "componentName.packageName");
        String className = componentName.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "componentName.className");
        if (packageName.length() <= 0) {
            throw new IllegalArgumentException("Package name must not be empty".toString());
        }
        if (className.length() <= 0) {
            throw new IllegalArgumentException("Activity class name must not be empty.".toString());
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) packageName, (CharSequence) ProxyConfig.MATCH_ALL_SCHEMES, false, 2, (Object) null) && StringsKt__StringsKt.indexOf$default((CharSequence) packageName, ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6, (Object) null) != packageName.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) className, (CharSequence) ProxyConfig.MATCH_ALL_SCHEMES, false, 2, (Object) null) && StringsKt__StringsKt.indexOf$default((CharSequence) className, ProxyConfig.MATCH_ALL_SCHEMES, 0, false, 6, (Object) null) != className.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityFilter)) {
            return false;
        }
        ActivityFilter activityFilter = (ActivityFilter) other;
        return Intrinsics.areEqual(this.componentName, activityFilter.componentName) && Intrinsics.areEqual(this.intentAction, activityFilter.intentAction);
    }

    @NotNull
    public final ComponentName getComponentName() {
        return this.componentName;
    }

    @Nullable
    public final String getIntentAction() {
        return this.intentAction;
    }

    public int hashCode() {
        int iHashCode = this.componentName.hashCode() * 31;
        String str = this.intentAction;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean matchesActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (MatcherUtils.INSTANCE.areActivityOrIntentComponentsMatching$window_release(activity, this.componentName)) {
            String str = this.intentAction;
            if (str != null) {
                Intent intent = activity.getIntent();
                if (Intrinsics.areEqual(str, intent == null ? null : intent.getAction())) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean matchesIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (!MatcherUtils.INSTANCE.areComponentsMatching$window_release(intent.getComponent(), this.componentName)) {
            return false;
        }
        String str = this.intentAction;
        return str == null || Intrinsics.areEqual(str, intent.getAction());
    }

    @NotNull
    public String toString() {
        return "ActivityFilter(componentName=" + this.componentName + ", intentAction=" + ((Object) this.intentAction) + RootService.CLOSE_BRACKET;
    }
}
