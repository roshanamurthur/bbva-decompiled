package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivityResultRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0004R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00028G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/activity/compose/LocalActivityResultRegistryOwner;", "", "Landroidx/activity/result/ActivityResultRegistryOwner;", "registryOwner", "Landroidx/compose/runtime/ProvidedValue;", "provides", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Landroidx/activity/result/ActivityResultRegistryOwner;", "current", "<init>", "()V", "activity-compose_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/LocalActivityResultRegistryOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,161:1\n76#2:162\n76#2:163\n23#3,8:164\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/LocalActivityResultRegistryOwner\n*L\n48#1:162\n49#1:163\n49#1:164,8\n*E\n"})
public final class LocalActivityResultRegistryOwner {
    public static final int $stable = 0;

    @NotNull
    public static final LocalActivityResultRegistryOwner INSTANCE = new LocalActivityResultRegistryOwner();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<ActivityResultRegistryOwner> f402a = CompositionLocalKt.compositionLocalOf$default(null, a.f403p0, 1, null);

    /* JADX INFO: compiled from: ActivityResultRegistry.kt */
    public static final class a extends Lambda implements Function0<ActivityResultRegistryOwner> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f403p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ ActivityResultRegistryOwner invoke() {
            return null;
        }
    }

    @Composable
    @JvmName(name = "getCurrent")
    @Nullable
    public final ActivityResultRegistryOwner getCurrent(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1418020823);
        ActivityResultRegistryOwner activityResultRegistryOwner = (ActivityResultRegistryOwner) composer.consume(f402a);
        if (activityResultRegistryOwner == null) {
            Object baseContext = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof ActivityResultRegistryOwner) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            activityResultRegistryOwner = (ActivityResultRegistryOwner) baseContext;
        }
        composer.endReplaceableGroup();
        return activityResultRegistryOwner;
    }

    @NotNull
    public final ProvidedValue<ActivityResultRegistryOwner> provides(@NotNull ActivityResultRegistryOwner registryOwner) {
        return f402a.provides(registryOwner);
    }
}
