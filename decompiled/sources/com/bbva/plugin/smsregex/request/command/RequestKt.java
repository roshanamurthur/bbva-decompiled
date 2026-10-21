package com.bbva.plugin.smsregex.request.command;

import com.bbva.androidtoolkit.plugin.postmessage.PostMessenger;
import com.bbva.plugin.smsregex.request.command.model.CodePostBulkDTO;
import com.bbva.plugin.smsregex.request.command.model.ConsentDeniedDTO;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: Request.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"smsregex-plugin_release"}, k = 2, mv = {1, 9, 0})
public final class RequestKt {
    public static final void access$consentDenied(PostMessenger postMessenger) {
        ConsentDeniedDTO consentDeniedDTO = new ConsentDeniedDTO(null, 1, null);
        postMessenger.postMessage(consentDeniedDTO.getAction(), consentDeniedDTO);
    }

    public static final void access$smsCodes(PostMessenger postMessenger, List list) {
        CodePostBulkDTO codePostBulkDTO = new CodePostBulkDTO(null, list, 1, null);
        postMessenger.postMessage(codePostBulkDTO.getAction(), codePostBulkDTO);
    }
}
