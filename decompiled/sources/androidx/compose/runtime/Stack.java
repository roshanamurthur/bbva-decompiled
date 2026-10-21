package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.cellscore.web.constant.NavigationOperations;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Stack.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\t\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u000fJ\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/Stack;", ExifInterface.GPS_DIRECTION_TRUE, "", "value", "", "push", "(Ljava/lang/Object;)Z", NavigationOperations.POP, "()Ljava/lang/Object;", "peek", "", FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/Object;", "isEmpty", "isNotEmpty", "", ClearCommand.ID, "", "toArray", "()[Ljava/lang/Object;", "getSize", "()I", "size", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class Stack<T> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ArrayList<T> f14804a = new ArrayList<>();

    public final void clear() {
        this.f14804a.clear();
    }

    public final int getSize() {
        return this.f14804a.size();
    }

    public final boolean isEmpty() {
        return this.f14804a.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    public final T peek() {
        return this.f14804a.get(getSize() - 1);
    }

    public final T pop() {
        return this.f14804a.remove(getSize() - 1);
    }

    public final boolean push(T value) {
        return this.f14804a.add(value);
    }

    @NotNull
    public final T[] toArray() {
        ArrayList<T> arrayList = this.f14804a;
        int size = arrayList.size();
        T[] tArr = (T[]) new Object[size];
        for (int i10 = 0; i10 < size; i10++) {
            tArr[i10] = arrayList.get(i10);
        }
        return tArr;
    }

    public final T peek(int index) {
        return this.f14804a.get(index);
    }
}
