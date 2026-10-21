package com.bbva.sdkcatalog.openpay.plugin;

import kotlin.Metadata;
import mx.openpay.library.core.OpenPaySdk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Process.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/Process;", "", "<init>", "()V", "isTapOnPhoneProcess", "", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Process {

    @NotNull
    public static final Process INSTANCE = new Process();

    private Process() {
    }

    public final boolean isTapOnPhoneProcess() {
        return BuildHelper.INSTANCE.getVersionCode() >= 30 && !OpenPaySdk.INSTANCE.isApplicationInitAllowed();
    }
}
