package androidx.activity.compose;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.ActivityOptionsCompat;
import com.bbva.plugin.push.command.UnregisterCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivityResultRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B1\b\u0000\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b0\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0005\u001a\u00020\u0004H\u0017J!\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\f\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u000bH\u0016¨\u0006\u0013"}, d2 = {"Landroidx/activity/compose/ManagedActivityResultLauncher;", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "O", "Landroidx/activity/result/ActivityResultLauncher;", "", UnregisterCommand.ID, "input", "Landroidx/core/app/ActivityOptionsCompat;", "options", "launch", "(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", "Landroidx/activity/result/contract/ActivityResultContract;", "getContract", "Landroidx/activity/compose/ActivityResultLauncherHolder;", "launcher", "Landroidx/compose/runtime/State;", "contract", "<init>", "(Landroidx/activity/compose/ActivityResultLauncherHolder;Landroidx/compose/runtime/State;)V", "activity-compose_release"}, k = 1, mv = {1, 8, 0})
public final class ManagedActivityResultLauncher<I, O> extends ActivityResultLauncher<I> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ActivityResultLauncherHolder<I> f408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final State<ActivityResultContract<I, O>> f409b;

    /* JADX WARN: Multi-variable type inference failed */
    public ManagedActivityResultLauncher(@NotNull ActivityResultLauncherHolder<I> activityResultLauncherHolder, @NotNull State<? extends ActivityResultContract<I, O>> state) {
        this.f408a = activityResultLauncherHolder;
        this.f409b = state;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    @NotNull
    public ActivityResultContract<I, ?> getContract() {
        return this.f409b.getValue();
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void launch(I input, @Nullable ActivityOptionsCompat options) {
        this.f408a.launch(input, options);
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    @Deprecated(message = "Registration is automatically handled by rememberLauncherForActivityResult")
    public void unregister() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
