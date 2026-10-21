package com.bbva.cells.pluginkit.activity.result;

import android.content.Intent;
import com.bbva.plugin.localstorage.util.ConstantKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ActivityResultManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/cells/pluginkit/activity/result/ActivityResult;", "", "()V", ConstantKt.BIOMETRIC_NEGATIVE_BUTTON, "Success", "Lcom/bbva/cells/pluginkit/activity/result/ActivityResult$Success;", "Lcom/bbva/cells/pluginkit/activity/result/ActivityResult$Cancel;", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public abstract class ActivityResult {

    /* JADX INFO: compiled from: ActivityResultManager.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/cells/pluginkit/activity/result/ActivityResult$Cancel;", "Lcom/bbva/cells/pluginkit/activity/result/ActivityResult;", "()V", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
    public static final class Cancel extends ActivityResult {
        public Cancel() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: ActivityResultManager.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/cells/pluginkit/activity/result/ActivityResult$Success;", "Lcom/bbva/cells/pluginkit/activity/result/ActivityResult;", "Landroid/content/Intent;", "a", "Landroid/content/Intent;", "getIntent", "()Landroid/content/Intent;", "intent", "<init>", "(Landroid/content/Intent;)V", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
    public static final class Success extends ActivityResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Intent intent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull Intent intent) {
            super(null);
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.intent = intent;
        }

        @NotNull
        public final Intent getIntent() {
            return this.intent;
        }
    }

    public ActivityResult() {
    }

    public /* synthetic */ ActivityResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
