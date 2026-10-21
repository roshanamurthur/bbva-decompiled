package com.dasnano.vddocumentcapture.document;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DocumentFace.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/dasnano/vddocumentcapture/document/DocumentFace;", "", "(Ljava/lang/String;I)V", "OBVERSE", "REVERSE", "document-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public enum DocumentFace {
    OBVERSE,
    REVERSE;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<DocumentFace> getEntries() {
        return $ENTRIES;
    }
}
