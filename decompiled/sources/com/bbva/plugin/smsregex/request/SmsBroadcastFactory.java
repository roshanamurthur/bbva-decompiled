package com.bbva.plugin.smsregex.request;

import android.content.Context;
import com.bbva.smsregex.extractor.SmsListener;
import com.bbva.smsregex.extractor.SmsReceiver;
import com.bbva.smsregex.extractor.initializer.helpers.SmsRetrieverClient;
import com.bbva.smsregex.extractor.initializer.helpers.SmsRetrieverContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Injectior.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/plugin/smsregex/request/SmsBroadcastFactory;", "Lcom/bbva/plugin/smsregex/request/SmsFactory;", "()V", "createClient", "Lcom/bbva/smsregex/extractor/initializer/helpers/SmsRetrieverContract;", "context", "Landroid/content/Context;", "createReceiver", "Lcom/bbva/smsregex/extractor/SmsListener;", "smsregex-plugin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SmsBroadcastFactory implements SmsFactory {
    @Override // com.bbva.plugin.smsregex.request.SmsFactory
    @NotNull
    public SmsRetrieverContract createClient(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new SmsRetrieverClient(context);
    }

    @Override // com.bbva.plugin.smsregex.request.SmsFactory
    @NotNull
    public SmsListener createReceiver() {
        return new SmsReceiver();
    }
}
