package com.google.firebase.sessions;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SessionEvent.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\f\u0010\u001e¨\u0006!"}, d2 = {"Lcom/google/firebase/sessions/ProcessDetails;", "", "", "component1", "", "component2", "component3", "", "component4", "processName", "pid", "importance", "isDefaultProcess", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getProcessName", "()Ljava/lang/String;", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getPid", "()I", "c", "getImportance", "d", "Z", "()Z", "<init>", "(Ljava/lang/String;IIZ)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
public final /* data */ class ProcessDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String processName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int pid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int importance;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean isDefaultProcess;

    public ProcessDetails(@NotNull String processName, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        this.processName = processName;
        this.pid = i10;
        this.importance = i11;
        this.isDefaultProcess = z10;
    }

    public static /* synthetic */ ProcessDetails copy$default(ProcessDetails processDetails, String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = processDetails.processName;
        }
        if ((i12 & 2) != 0) {
            i10 = processDetails.pid;
        }
        if ((i12 & 4) != 0) {
            i11 = processDetails.importance;
        }
        if ((i12 & 8) != 0) {
            z10 = processDetails.isDefaultProcess;
        }
        return processDetails.copy(str, i10, i11, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProcessName() {
        return this.processName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPid() {
        return this.pid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getImportance() {
        return this.importance;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsDefaultProcess() {
        return this.isDefaultProcess;
    }

    @NotNull
    public final ProcessDetails copy(@NotNull String processName, int pid, int importance, boolean isDefaultProcess) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        return new ProcessDetails(processName, pid, importance, isDefaultProcess);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProcessDetails)) {
            return false;
        }
        ProcessDetails processDetails = (ProcessDetails) other;
        return Intrinsics.areEqual(this.processName, processDetails.processName) && this.pid == processDetails.pid && this.importance == processDetails.importance && this.isDefaultProcess == processDetails.isDefaultProcess;
    }

    public final int getImportance() {
        return this.importance;
    }

    public final int getPid() {
        return this.pid;
    }

    @NotNull
    public final String getProcessName() {
        return this.processName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = ((((this.processName.hashCode() * 31) + this.pid) * 31) + this.importance) * 31;
        boolean z10 = this.isDefaultProcess;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean isDefaultProcess() {
        return this.isDefaultProcess;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessDetails(processName=");
        sb2.append(this.processName);
        sb2.append(", pid=");
        sb2.append(this.pid);
        sb2.append(", importance=");
        sb2.append(this.importance);
        sb2.append(", isDefaultProcess=");
        return bc.org.bouncycastle.math.ec.custom.sec.a.d(sb2, this.isDefaultProcess, RootService.CLOSE_BRACKET);
    }
}
