package com.bbva.plugin.smsregex.request;

import android.content.Context;
import com.bbva.smsregex.extractor.SmsListener;
import com.bbva.smsregex.extractor.initializer.helpers.SmsRetrieverContract;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Injectior.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/bbva/plugin/smsregex/request/SmsFactory;", "", "createClient", "Lcom/bbva/smsregex/extractor/initializer/helpers/SmsRetrieverContract;", "context", "Landroid/content/Context;", "createReceiver", "Lcom/bbva/smsregex/extractor/SmsListener;", "smsregex-plugin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SmsFactory {
    @NotNull
    SmsRetrieverContract createClient(@NotNull Context context);

    @NotNull
    SmsListener createReceiver();
}
