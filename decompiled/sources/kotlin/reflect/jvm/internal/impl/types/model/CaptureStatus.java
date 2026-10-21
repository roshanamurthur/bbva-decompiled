package kotlin.reflect.jvm.internal.impl.types.model;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: TypeSystemContext.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class CaptureStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CaptureStatus[] $VALUES;
    public static final CaptureStatus FOR_INCORPORATION;
    public static final CaptureStatus FOR_SUBTYPING;
    public static final CaptureStatus FROM_EXPRESSION;

    static {
        CaptureStatus captureStatus = new CaptureStatus("FOR_SUBTYPING", 0);
        FOR_SUBTYPING = captureStatus;
        CaptureStatus captureStatus2 = new CaptureStatus("FOR_INCORPORATION", 1);
        FOR_INCORPORATION = captureStatus2;
        CaptureStatus captureStatus3 = new CaptureStatus("FROM_EXPRESSION", 2);
        FROM_EXPRESSION = captureStatus3;
        CaptureStatus[] captureStatusArr = {captureStatus, captureStatus2, captureStatus3};
        $VALUES = captureStatusArr;
        $ENTRIES = EnumEntriesKt.enumEntries(captureStatusArr);
    }

    public CaptureStatus() {
        throw null;
    }

    public static CaptureStatus valueOf(String str) {
        return (CaptureStatus) Enum.valueOf(CaptureStatus.class, str);
    }

    public static CaptureStatus[] values() {
        return (CaptureStatus[]) $VALUES.clone();
    }
}
