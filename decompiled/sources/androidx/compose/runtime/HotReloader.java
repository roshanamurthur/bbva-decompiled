package androidx.compose.runtime;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: compiled from: HotReloader.kt */
/* JADX INFO: loaded from: classes.dex */
public final class HotReloader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Companion f14571a = new Companion(null);

    /* JADX INFO: compiled from: HotReloader.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/HotReloader$Companion;", "", "context", "", "simulateHotReload$runtime_release", "(Ljava/lang/Object;)V", "simulateHotReload", "", "key", "invalidateGroupsWithKey$runtime_release", "(I)V", "invalidateGroupsWithKey", "", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentErrors$runtime_release", "()Ljava/util/List;", "getCurrentErrors", "clearErrors$runtime_release", "()V", "clearErrors", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @TestOnly
        public final void clearErrors$runtime_release() {
            Recomposer.INSTANCE.clearErrors$runtime_release();
        }

        @TestOnly
        @NotNull
        public final List<RecomposerErrorInfo> getCurrentErrors$runtime_release() {
            return Recomposer.INSTANCE.getCurrentErrors$runtime_release();
        }

        @TestOnly
        public final void invalidateGroupsWithKey$runtime_release(int key) {
            Recomposer.INSTANCE.invalidateGroupsWithKey$runtime_release(key);
        }

        @TestOnly
        public final void simulateHotReload$runtime_release(@NotNull Object context) {
            Recomposer.Companion companion = Recomposer.INSTANCE;
            companion.loadStateAndComposeForHotReload$runtime_release(companion.saveStateAndDisposeForHotReload$runtime_release());
        }
    }
}
