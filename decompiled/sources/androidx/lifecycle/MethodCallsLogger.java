package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MethodCallsLogger.jvm.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¨\u0006\n"}, d2 = {"Landroidx/lifecycle/MethodCallsLogger;", "", "", "name", "", "type", "", "approveCall", "<init>", "()V", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class MethodCallsLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final HashMap f21937a = new HashMap();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean approveCall(@NotNull String name, int type) {
        Intrinsics.checkNotNullParameter(name, "name");
        HashMap map = this.f21937a;
        Integer num = (Integer) map.get(name);
        int iIntValue = num != null ? num.intValue() : 0;
        boolean z10 = (iIntValue & type) != 0;
        map.put(name, Integer.valueOf(type | iIntValue));
        return !z10;
    }
}
