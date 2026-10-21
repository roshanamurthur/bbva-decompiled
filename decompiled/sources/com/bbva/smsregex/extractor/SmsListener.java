package com.bbva.smsregex.extractor;

import android.content.Context;
import com.bbva.smsregex.extractor.model.ConsentRequest;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SmsReceiver.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lcom/bbva/smsregex/extractor/SmsListener;", "", "listen", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/smsregex/extractor/model/ConsentRequest;", "context", "Landroid/content/Context;", "stop", "", "smsregex_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SmsListener {
    @NotNull
    Flow<ConsentRequest> listen(@NotNull Context context);

    void stop(@NotNull Context context);
}
