package com.bbva.glomohybrid;

import com.bbva.sdkcatalog.openpay.plugin.Process;
import kotlin.Metadata;

/* JADX INFO: compiled from: CountryTapOnPhone.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"isTapOnPhoneProcess", "", "app_mexicoProdGoogleRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CountryTapOnPhoneKt {
    public static final boolean isTapOnPhoneProcess() {
        return Process.INSTANCE.isTapOnPhoneProcess();
    }
}
