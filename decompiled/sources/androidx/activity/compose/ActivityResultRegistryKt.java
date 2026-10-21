package androidx.activity.compose;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivityResultRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001aM\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"rememberLauncherForActivityResult", "Landroidx/activity/compose/ManagedActivityResultLauncher;", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "O", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "onResult", "Lkotlin/Function1;", "", "(Landroidx/activity/result/contract/ActivityResultContract;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/activity/compose/ManagedActivityResultLauncher;", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,161:1\n25#2:162\n25#2:169\n955#3,6:163\n955#3,6:170\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt\n*L\n97#1:162\n98#1:169\n97#1:163,6\n98#1:170,6\n*E\n"})
public final class ActivityResultRegistryKt {

    /* JADX INFO: compiled from: ActivityResultRegistry.kt */
    @SourceDebugExtension({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,161:1\n62#2,5:162\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt$rememberLauncherForActivityResult$1\n*L\n108#1:162,5\n*E\n"})
    public static final class a extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ActivityResultLauncherHolder<I> f383p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ActivityResultRegistry f384q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f385r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ ActivityResultContract<I, O> f386s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ State<Function1<O, Unit>> f387t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ActivityResultLauncherHolder<I> activityResultLauncherHolder, ActivityResultRegistry activityResultRegistry, String str, ActivityResultContract<I, O> activityResultContract, State<? extends Function1<? super O, Unit>> state) {
            super(1);
            this.f383p0 = activityResultLauncherHolder;
            this.f384q0 = activityResultRegistry;
            this.f385r0 = str;
            this.f386s0 = activityResultContract;
            this.f387t0 = state;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            j.a aVar = new j.a(this.f387t0);
            ActivityResultLauncher activityResultLauncherRegister = this.f384q0.register(this.f385r0, this.f386s0, aVar);
            final ActivityResultLauncherHolder<I> activityResultLauncherHolder = this.f383p0;
            activityResultLauncherHolder.setLauncher((ActivityResultLauncher<I>) activityResultLauncherRegister);
            return new DisposableEffectResult() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    activityResultLauncherHolder.unregister();
                }
            };
        }
    }

    /* JADX INFO: compiled from: ActivityResultRegistry.kt */
    public static final class b extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f388p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return UUID.randomUUID().toString();
        }
    }

    @Composable
    @NotNull
    public static final <I, O> ManagedActivityResultLauncher<I, O> rememberLauncherForActivityResult(@NotNull ActivityResultContract<I, O> activityResultContract, @NotNull Function1<? super O, Unit> function1, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1408504823);
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(activityResultContract, composer, 8);
        State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function1, composer, (i10 >> 3) & 14);
        String str = (String) RememberSaveableKt.m2165rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) b.f388p0, composer, 3080, 6);
        ActivityResultRegistryOwner current = LocalActivityResultRegistryOwner.INSTANCE.getCurrent(composer, 6);
        if (current == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner".toString());
        }
        ActivityResultRegistry activityResultRegistry = current.getActivityResultRegistry();
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new ActivityResultLauncherHolder();
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        ActivityResultLauncherHolder activityResultLauncherHolder = (ActivityResultLauncherHolder) objRememberedValue;
        composer.startReplaceableGroup(-3687241);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new ManagedActivityResultLauncher(activityResultLauncherHolder, stateRememberUpdatedState);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        ManagedActivityResultLauncher<I, O> managedActivityResultLauncher = (ManagedActivityResultLauncher) objRememberedValue2;
        EffectsKt.DisposableEffect(activityResultRegistry, str, activityResultContract, new a(activityResultLauncherHolder, activityResultRegistry, str, activityResultContract, stateRememberUpdatedState2), composer, 520);
        composer.endReplaceableGroup();
        return managedActivityResultLauncher;
    }
}
