package m7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.os.Process;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Provider.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d extends c {
    @Override // m7.c
    @SuppressLint({"QueryPermissionsNeeded"})
    @NotNull
    public final List<ProviderInfo> b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        List<ProviderInfo> listQueryContentProviders = context.getPackageManager().queryContentProviders((String) null, Process.myUid(), 0);
        Intrinsics.checkNotNullExpressionValue(listQueryContentProviders, "context.packageManager.queryContentProviders(null, android.os.Process.myUid(), 0)");
        return listQueryContentProviders;
    }
}
