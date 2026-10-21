package androidx.lifecycle;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/lifecycle/SavedStateHandlesVM;", "Landroidx/lifecycle/ViewModel;", "", "", "Landroidx/lifecycle/SavedStateHandle;", "p0", "Ljava/util/Map;", "getHandles", "()Ljava/util/Map;", "handles", "<init>", "()V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0})
public final class SavedStateHandlesVM extends ViewModel {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f21997p0 = new LinkedHashMap();

    @NotNull
    public final Map<String, SavedStateHandle> getHandles() {
        return this.f21997p0;
    }
}
