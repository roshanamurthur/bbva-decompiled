package com.bbva.plugin.wearables.info.library.delegates;

import android.content.Context;
import com.google.android.gms.tasks.Tasks;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.Wearable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NodesDelegate.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/plugin/wearables/info/library/delegates/NodesDelegate;", "Lcom/bbva/plugin/wearables/info/library/delegates/ConnectedNodesInfo;", "", "Lcom/google/android/gms/wearable/Node;", "getConnectedNodes", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "plugin-wearables-info_release"}, k = 1, mv = {1, 9, 0})
public final class NodesDelegate implements ConnectedNodesInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f36075a;

    public NodesDelegate(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f36075a = context;
    }

    @Override // com.bbva.plugin.wearables.info.library.delegates.ConnectedNodesInfo
    @Nullable
    public List<Node> getConnectedNodes() {
        Object objM5535constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl((List) Tasks.await(Wearable.getNodeClient(this.f36075a).getConnectedNodes()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        return (List) objM5535constructorimpl;
    }
}
