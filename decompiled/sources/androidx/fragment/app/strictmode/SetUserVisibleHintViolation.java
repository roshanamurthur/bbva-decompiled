package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SetUserVisibleHintViolation.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/fragment/app/strictmode/SetUserVisibleHintViolation;", "Landroidx/fragment/app/strictmode/Violation;", "", "q0", "Z", "isVisibleToUser", "()Z", "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Landroidx/fragment/app/Fragment;Z)V", "fragment_release"}, k = 1, mv = {1, 5, 1})
public final class SetUserVisibleHintViolation extends Violation {

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public final boolean isVisibleToUser;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetUserVisibleHintViolation(@NotNull Fragment fragment, boolean z10) {
        super(fragment, "Attempting to set user visible hint to " + z10 + " for fragment " + fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.isVisibleToUser = z10;
    }

    /* JADX INFO: renamed from: isVisibleToUser, reason: from getter */
    public final boolean getIsVisibleToUser() {
        return this.isVisibleToUser;
    }
}
