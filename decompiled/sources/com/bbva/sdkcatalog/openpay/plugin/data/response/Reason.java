package com.bbva.sdkcatalog.openpay.plugin.data.response;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CheckTapOnPhoneMobileCapabilitiesResponse.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/data/response/Reason;", "", "<init>", "(Ljava/lang/String;I)V", "TAP_ON_PHONE_NOT_IMPLEMENTED", "UNSUPPORTED_ANDROID_VERSION", "NO_NFC", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum Reason {
    TAP_ON_PHONE_NOT_IMPLEMENTED,
    UNSUPPORTED_ANDROID_VERSION,
    NO_NFC;

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

    @NotNull
    public static EnumEntries<Reason> getEntries() {
        return $ENTRIES;
    }
}
