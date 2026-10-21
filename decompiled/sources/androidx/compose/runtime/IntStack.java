package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.cellscore.web.constant.NavigationOperations;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Stack.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0013\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/IntStack;", "", "", "value", "", "push", NavigationOperations.POP, "default", "peekOr", "peek", "peek2", FirebaseAnalytics.Param.INDEX, "", "isEmpty", "isNotEmpty", ClearCommand.ID, "indexOf", "getSize", "()I", "size", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final class IntStack {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public int[] f14572a = new int[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14573b;

    public final void clear() {
        this.f14573b = 0;
    }

    /* JADX INFO: renamed from: getSize, reason: from getter */
    public final int getF14573b() {
        return this.f14573b;
    }

    public final int indexOf(int value) {
        int i10 = this.f14573b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f14572a[i11] == value) {
                return i11;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this.f14573b == 0;
    }

    public final boolean isNotEmpty() {
        return this.f14573b != 0;
    }

    public final int peek() {
        return this.f14572a[this.f14573b - 1];
    }

    public final int peek2() {
        return this.f14572a[this.f14573b - 2];
    }

    public final int peekOr(int i10) {
        return this.f14573b > 0 ? peek() : i10;
    }

    public final int pop() {
        int[] iArr = this.f14572a;
        int i10 = this.f14573b - 1;
        this.f14573b = i10;
        return iArr[i10];
    }

    public final void push(int value) {
        int i10 = this.f14573b;
        int[] iArr = this.f14572a;
        if (i10 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f14572a = iArrCopyOf;
        }
        int[] iArr2 = this.f14572a;
        int i11 = this.f14573b;
        this.f14573b = i11 + 1;
        iArr2[i11] = value;
    }

    public final int peek(int index) {
        return this.f14572a[index];
    }
}
