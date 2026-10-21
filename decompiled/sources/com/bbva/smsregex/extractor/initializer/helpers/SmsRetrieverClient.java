package com.bbva.smsregex.extractor.initializer.helpers;

import android.content.Context;
import com.adobe.marketing.mobile.EventDataKeys;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.tasks.Tasks;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SmsRetrieverClient.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/bbva/smsregex/extractor/initializer/helpers/SmsRetrieverClient;", "Lcom/bbva/smsregex/extractor/initializer/helpers/SmsRetrieverContract;", "", "senderPhoneNumber", "Lcom/bbva/smsregex/extractor/initializer/helpers/SmsClientResult;", EventDataKeys.Lifecycle.LIFECYCLE_START, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "smsregex_release"}, k = 1, mv = {1, 9, 0})
public final class SmsRetrieverClient implements SmsRetrieverContract {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f36827a;

    public SmsRetrieverClient(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f36827a = context;
    }

    @Override // com.bbva.smsregex.extractor.initializer.helpers.SmsRetrieverContract
    @Nullable
    public Object start(@Nullable String str, @NotNull Continuation<? super SmsClientResult> continuation) {
        try {
            com.google.android.gms.auth.api.phone.SmsRetrieverClient client = SmsRetriever.getClient(this.f36827a);
            Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
            Tasks.await(client.startSmsUserConsent(str));
            Tasks.await(client.startSmsRetriever());
            return SmsClientResult.OK.INSTANCE;
        } catch (Exception e5) {
            return new SmsClientResult.ERROR(e5);
        }
    }
}
