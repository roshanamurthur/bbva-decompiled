package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import com.bbva.plugin.push.command.UnregisterCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivityResultCaller.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B1\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0006\u0010\u001b\u001a\u00028\u0000¢\u0006\u0004\b \u0010!J!\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0004H\u0016J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u000bH\u0016R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR'\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015¨\u0006\""}, d2 = {"Landroidx/activity/result/ActivityResultCallerLauncher;", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "O", "Landroidx/activity/result/ActivityResultLauncher;", "", "input", "Landroidx/core/app/ActivityOptionsCompat;", "options", "launch", "(Lkotlin/Unit;Landroidx/core/app/ActivityOptionsCompat;)V", UnregisterCommand.ID, "Landroidx/activity/result/contract/ActivityResultContract;", "getContract", "a", "Landroidx/activity/result/ActivityResultLauncher;", "getLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "launcher", "b", "Landroidx/activity/result/contract/ActivityResultContract;", "getCallerContract", "()Landroidx/activity/result/contract/ActivityResultContract;", "callerContract", "c", "Ljava/lang/Object;", "getCallerInput", "()Ljava/lang/Object;", "callerInput", "d", "Lkotlin/Lazy;", "getResultContract", "resultContract", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;)V", "activity-ktx_release"}, k = 1, mv = {1, 8, 0})
public final class ActivityResultCallerLauncher<I, O> extends ActivityResultLauncher<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final ActivityResultLauncher<I> launcher;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final ActivityResultContract<I, O> callerContract;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final I callerInput;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final Lazy resultContract = LazyKt__LazyJVMKt.lazy(new Function0(this) { // from class: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        final /* synthetic */ ActivityResultCallerLauncher<I, O> f466p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.f466p0 = this;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.activity.result.ActivityResultCallerLauncher$resultContract$2$1] */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AnonymousClass1 invoke() {
            final ActivityResultCallerLauncher<I, O> activityResultCallerLauncher = this.f466p0;
            return new ActivityResultContract<Unit, O>() { // from class: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2.1
                @Override // androidx.activity.result.contract.ActivityResultContract
                public O parseResult(int resultCode, @Nullable Intent intent) {
                    return (O) activityResultCallerLauncher.getCallerContract().parseResult(resultCode, intent);
                }

                @Override // androidx.activity.result.contract.ActivityResultContract
                @NotNull
                public Intent createIntent(@NotNull Context context, @NotNull Unit input) {
                    return activityResultCallerLauncher.getCallerContract().createIntent(context, activityResultCallerLauncher.getCallerInput());
                }
            };
        }
    });

    public ActivityResultCallerLauncher(@NotNull ActivityResultLauncher<I> activityResultLauncher, @NotNull ActivityResultContract<I, O> activityResultContract, I i10) {
        this.launcher = activityResultLauncher;
        this.callerContract = activityResultContract;
        this.callerInput = i10;
    }

    @NotNull
    public final ActivityResultContract<I, O> getCallerContract() {
        return this.callerContract;
    }

    public final I getCallerInput() {
        return this.callerInput;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    @NotNull
    public ActivityResultContract<Unit, ?> getContract() {
        return getResultContract();
    }

    @NotNull
    public final ActivityResultLauncher<I> getLauncher() {
        return this.launcher;
    }

    @NotNull
    public final ActivityResultContract<Unit, O> getResultContract() {
        return (ActivityResultContract) this.resultContract.getValue();
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void unregister() {
        this.launcher.unregister();
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void launch(@NotNull Unit input, @Nullable ActivityOptionsCompat options) {
        this.launcher.launch(this.callerInput, options);
    }
}
