package com.bbva.glomohybrid.cellsweb.presentation.verishow.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VeriShowStatus.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/verishow/enums/VeriShowStatus;", "", "status", "", "(Ljava/lang/String;II)V", "getStatus", "()I", "VIDEOCALL_NOT_AVAILABLE_AGENT", "VIDEOCALL_STARTED", "VIDEOCALL_APP_READY", "VIDEOCALL_VALIDATION_ERROR", "VIDEOCALL_CLOSED_SESSION", "VIDEOCALL_AGENT_SUCCESS", "VIDEOCALL_AGENT_REJECTION", "VIDEOCALL_REJECTION_CAUSE", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum VeriShowStatus {
    VIDEOCALL_NOT_AVAILABLE_AGENT(-1),
    VIDEOCALL_STARTED(2),
    VIDEOCALL_APP_READY(7),
    VIDEOCALL_VALIDATION_ERROR(95),
    VIDEOCALL_CLOSED_SESSION(6),
    VIDEOCALL_AGENT_SUCCESS(4),
    VIDEOCALL_AGENT_REJECTION(3),
    VIDEOCALL_REJECTION_CAUSE(8);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int status;

    VeriShowStatus(int i10) {
        this.status = i10;
    }

    @NotNull
    public static EnumEntries<VeriShowStatus> getEntries() {
        return $ENTRIES;
    }

    public final int getStatus() {
        return this.status;
    }
}
