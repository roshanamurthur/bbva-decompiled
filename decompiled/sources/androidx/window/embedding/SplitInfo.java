package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SplitInfo.kt */
/* JADX INFO: loaded from: classes2.dex */
@ExperimentalWindowApi
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\f\u0012\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0013\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/window/embedding/SplitInfo;", "", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Landroidx/window/embedding/ActivityStack;", "a", "Landroidx/window/embedding/ActivityStack;", "getPrimaryActivityStack", "()Landroidx/window/embedding/ActivityStack;", "primaryActivityStack", "b", "getSecondaryActivityStack", "secondaryActivityStack", "", "c", "F", "getSplitRatio", "()F", "splitRatio", "<init>", "(Landroidx/window/embedding/ActivityStack;Landroidx/window/embedding/ActivityStack;F)V", "window_release"}, k = 1, mv = {1, 6, 0})
public final class SplitInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ActivityStack primaryActivityStack;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ActivityStack secondaryActivityStack;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float splitRatio;

    public SplitInfo(@NotNull ActivityStack primaryActivityStack, @NotNull ActivityStack secondaryActivityStack, float f6) {
        Intrinsics.checkNotNullParameter(primaryActivityStack, "primaryActivityStack");
        Intrinsics.checkNotNullParameter(secondaryActivityStack, "secondaryActivityStack");
        this.primaryActivityStack = primaryActivityStack;
        this.secondaryActivityStack = secondaryActivityStack;
        this.splitRatio = f6;
    }

    public final boolean contains(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return this.primaryActivityStack.contains(activity) || this.secondaryActivityStack.contains(activity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitInfo)) {
            return false;
        }
        SplitInfo splitInfo = (SplitInfo) other;
        return Intrinsics.areEqual(this.primaryActivityStack, splitInfo.primaryActivityStack) && Intrinsics.areEqual(this.secondaryActivityStack, splitInfo.secondaryActivityStack) && this.splitRatio == splitInfo.splitRatio;
    }

    @NotNull
    public final ActivityStack getPrimaryActivityStack() {
        return this.primaryActivityStack;
    }

    @NotNull
    public final ActivityStack getSecondaryActivityStack() {
        return this.secondaryActivityStack;
    }

    public final float getSplitRatio() {
        return this.splitRatio;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.splitRatio) + ((this.secondaryActivityStack.hashCode() + (this.primaryActivityStack.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SplitInfo:{");
        sb2.append("primaryActivityStack=" + getPrimaryActivityStack() + AbstractJsonLexerKt.COMMA);
        sb2.append("secondaryActivityStack=" + getSecondaryActivityStack() + AbstractJsonLexerKt.COMMA);
        sb2.append("splitRatio=" + getSplitRatio() + AbstractJsonLexerKt.END_OBJ);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
