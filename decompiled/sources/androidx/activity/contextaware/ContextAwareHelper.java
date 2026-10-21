package androidx.activity.contextaware;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ContextAwareHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0006¨\u0006\u000e"}, d2 = {"Landroidx/activity/contextaware/ContextAwareHelper;", "", "Landroid/content/Context;", "peekAvailableContext", "Landroidx/activity/contextaware/OnContextAvailableListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "addOnContextAvailableListener", "removeOnContextAvailableListener", "context", "dispatchOnContextAvailable", "clearAvailableContext", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0})
public final class ContextAwareHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArraySet f440a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public volatile Context f441b;

    public final void addOnContextAvailableListener(@NotNull OnContextAvailableListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context context = this.f441b;
        if (context != null) {
            listener.onContextAvailable(context);
        }
        this.f440a.add(listener);
    }

    public final void clearAvailableContext() {
        this.f441b = null;
    }

    public final void dispatchOnContextAvailable(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f441b = context;
        Iterator it = this.f440a.iterator();
        while (it.hasNext()) {
            ((OnContextAvailableListener) it.next()).onContextAvailable(context);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: peekAvailableContext, reason: from getter */
    public final Context getF441b() {
        return this.f441b;
    }

    public final void removeOnContextAvailableListener(@NotNull OnContextAvailableListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f440a.remove(listener);
    }
}
