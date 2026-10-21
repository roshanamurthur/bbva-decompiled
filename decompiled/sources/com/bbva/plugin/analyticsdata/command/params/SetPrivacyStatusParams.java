package com.bbva.plugin.analyticsdata.command.params;

import androidx.annotation.Keep;
import com.bbva.plugin.analyticsdata.command.validator.MalformedParams;
import kotlin.Metadata;

/* JADX INFO: compiled from: SetPrivacyStatusParams.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/bbva/plugin/analyticsdata/command/params/SetPrivacyStatusParams;", "Lcom/bbva/plugin/analyticsdata/command/validator/MalformedParams;", "status", "", "(I)V", "getStatus", "()I", "isMalformed", "", "analyticsdata-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SetPrivacyStatusParams implements MalformedParams {
    private final int status;

    public SetPrivacyStatusParams(int i10) {
        this.status = i10;
    }

    public final int getStatus() {
        return this.status;
    }

    @Override // com.bbva.plugin.analyticsdata.command.validator.MalformedParams
    public boolean isMalformed() {
        int i10 = this.status;
        boolean z10 = false;
        if (i10 >= 0 && i10 <= 2) {
            z10 = true;
        }
        return !z10;
    }
}
