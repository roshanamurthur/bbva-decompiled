package com.veridas.vdlibraryimageprocessing;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CaptureType.kt */
/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/veridas/vdlibraryimageprocessing/CaptureType;", "", "(Ljava/lang/String;I)V", "DOCUMENT", "VIDEO", "common-image-processing_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum CaptureType {
    DOCUMENT,
    VIDEO;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<CaptureType> getEntries() {
        return $ENTRIES;
    }
}
