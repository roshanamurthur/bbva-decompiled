package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivityStack.kt */
/* JADX INFO: loaded from: classes2.dex */
@ExperimentalWindowApi
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\r\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0013\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/window/embedding/ActivityStack;", "", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "isEmpty", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "a", "Ljava/util/List;", "getActivities$window_release", "()Ljava/util/List;", "activities", "<init>", "(Ljava/util/List;Z)V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class ActivityStack {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Activity> activities;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24125b;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityStack(@NotNull List<? extends Activity> activities, boolean z10) {
        Intrinsics.checkNotNullParameter(activities, "activities");
        this.activities = activities;
        this.f24125b = z10;
    }

    public final boolean contains(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return this.activities.contains(activity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityStack)) {
            return false;
        }
        ActivityStack activityStack = (ActivityStack) other;
        return (Intrinsics.areEqual(this.activities, activityStack.activities) || this.f24125b == activityStack.f24125b) ? false : true;
    }

    @NotNull
    public final List<Activity> getActivities$window_release() {
        return this.activities;
    }

    public int hashCode() {
        return this.activities.hashCode() + ((this.f24125b ? 1 : 0) * 31);
    }

    /* JADX INFO: renamed from: isEmpty, reason: from getter */
    public final boolean getF24125b() {
        return this.f24125b;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ActivityStack{");
        sb2.append(Intrinsics.stringPlus("activities=", getActivities$window_release()));
        sb2.append("isEmpty=" + this.f24125b + AbstractJsonLexerKt.END_OBJ);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public /* synthetic */ ActivityStack(List list, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i10 & 2) != 0 ? false : z10);
    }
}
