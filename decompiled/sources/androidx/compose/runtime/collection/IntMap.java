package androidx.compose.runtime.collection;

import android.util.SparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActualIntMap.android.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002J\u001a\u0010\u0007\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\nJ \u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0010\u001a\u00020\fR\u0011\u0010\u0013\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/collection/IntMap;", ExifInterface.LONGITUDE_EAST, "", "", "key", "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "get", "(I)Ljava/lang/Object;", "valueIfAbsent", "(ILjava/lang/Object;)Ljava/lang/Object;", "value", "", SetCommand.ID, "(ILjava/lang/Object;)V", RemoveCommand.ID, ClearCommand.ID, "getSize", "()I", "size", "initialCapacity", "<init>", "(I)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class IntMap<E> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SparseArray<E> f14864a;

    public IntMap() {
        throw null;
    }

    public IntMap(int i10) {
        this.f14864a = new SparseArray<>(i10);
    }

    public final void clear() {
        this.f14864a.clear();
    }

    public final boolean contains(int key) {
        return this.f14864a.indexOfKey(key) >= 0;
    }

    @Nullable
    public final E get(int key) {
        return this.f14864a.get(key);
    }

    public final int getSize() {
        return this.f14864a.size();
    }

    public final void remove(int key) {
        this.f14864a.remove(key);
    }

    public final void set(int key, E value) {
        this.f14864a.put(key, value);
    }

    public final E get(int key, E valueIfAbsent) {
        return this.f14864a.get(key, valueIfAbsent);
    }

    public /* synthetic */ IntMap(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 10 : i10);
    }
}
