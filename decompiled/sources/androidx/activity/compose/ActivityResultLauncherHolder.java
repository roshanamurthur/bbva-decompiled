package androidx.activity.compose;

import androidx.activity.result.ActivityResultLauncher;
import androidx.core.app.ActivityOptionsCompat;
import com.bbva.plugin.push.command.UnregisterCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivityResultRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00018\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\t\u001a\u00020\u0006R*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/activity/compose/ActivityResultLauncherHolder;", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "", "input", "Landroidx/core/app/ActivityOptionsCompat;", "options", "", "launch", "(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", UnregisterCommand.ID, "Landroidx/activity/result/ActivityResultLauncher;", "a", "Landroidx/activity/result/ActivityResultLauncher;", "getLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "setLauncher", "(Landroidx/activity/result/ActivityResultLauncher;)V", "launcher", "<init>", "()V", "activity-compose_release"}, k = 1, mv = {1, 8, 0})
public final class ActivityResultLauncherHolder<I> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ActivityResultLauncher<I> launcher;

    @Nullable
    public final ActivityResultLauncher<I> getLauncher() {
        return this.launcher;
    }

    public final void launch(@Nullable I input, @Nullable ActivityOptionsCompat options) {
        Unit unit;
        ActivityResultLauncher<I> activityResultLauncher = this.launcher;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(input, options);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Launcher has not been initialized".toString());
        }
    }

    public final void setLauncher(@Nullable ActivityResultLauncher<I> activityResultLauncher) {
        this.launcher = activityResultLauncher;
    }

    public final void unregister() {
        Unit unit;
        ActivityResultLauncher<I> activityResultLauncher = this.launcher;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Launcher has not been initialized".toString());
        }
    }
}
