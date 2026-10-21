package androidx.compose.runtime;

import androidx.camera.core.impl.v;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JoinedKey.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0003J!\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/JoinedKey;", "", "", GenerateActivationFormCommand.HASH_CODE, "component1", "component2", Parameters.DIRECTION.LEFT, Parameters.DIRECTION.RIGHT, "copy", "", "toString", "other", "", "equals", "a", "Ljava/lang/Object;", "getLeft", "()Ljava/lang/Object;", "b", "getRight", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class JoinedKey {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Object left;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Object right;

    public JoinedKey(@Nullable Object obj, @Nullable Object obj2) {
        this.left = obj;
        this.right = obj2;
    }

    public static /* synthetic */ JoinedKey copy$default(JoinedKey joinedKey, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = joinedKey.left;
        }
        if ((i10 & 2) != 0) {
            obj2 = joinedKey.right;
        }
        return joinedKey.copy(obj, obj2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Object getLeft() {
        return this.left;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getRight() {
        return this.right;
    }

    @NotNull
    public final JoinedKey copy(@Nullable Object left, @Nullable Object right) {
        return new JoinedKey(left, right);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JoinedKey)) {
            return false;
        }
        JoinedKey joinedKey = (JoinedKey) other;
        return Intrinsics.areEqual(this.left, joinedKey.left) && Intrinsics.areEqual(this.right, joinedKey.right);
    }

    @Nullable
    public final Object getLeft() {
        return this.left;
    }

    @Nullable
    public final Object getRight() {
        return this.right;
    }

    public int hashCode() {
        int iHashCode;
        Object obj = this.left;
        int iHashCode2 = 0;
        if (obj instanceof Enum) {
            iHashCode = ((Enum) obj).ordinal();
        } else {
            iHashCode = obj != null ? obj.hashCode() : 0;
        }
        int i10 = iHashCode * 31;
        Object obj2 = this.right;
        if (obj2 instanceof Enum) {
            iHashCode2 = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            iHashCode2 = obj2.hashCode();
        }
        return iHashCode2 + i10;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("JoinedKey(left=");
        sb2.append(this.left);
        sb2.append(", right=");
        return v.d(sb2, this.right, RootService.CLOSE_BRACKET);
    }
}
