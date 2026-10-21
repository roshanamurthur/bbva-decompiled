package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import com.bbva.networkplugin.command.impl.PutCommand;
import com.bbva.plugin.localstorage.command.ClearCommand;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ViewModelStore.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\u0002J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0007J\u0006\u0010\u000b\u001a\u00020\u0006¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/ViewModelStore;", "", "", "key", "Landroidx/lifecycle/ViewModel;", "viewModel", "", PutCommand.ID, "get", "", "keys", ClearCommand.ID, "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
public class ViewModelStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f22040a = new LinkedHashMap();

    public final void clear() {
        LinkedHashMap linkedHashMap = this.f22040a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((ViewModel) it.next()).clear$lifecycle_viewmodel_release();
        }
        linkedHashMap.clear();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final ViewModel get(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (ViewModel) this.f22040a.get(key);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final Set<String> keys() {
        return new HashSet(this.f22040a.keySet());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void put(@NotNull String key, @NotNull ViewModel viewModel) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        ViewModel viewModel2 = (ViewModel) this.f22040a.put(key, viewModel);
        if (viewModel2 != null) {
            viewModel2.clear$lifecycle_viewmodel_release();
        }
    }
}
