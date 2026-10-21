package com.bbva.smsregex.extractor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bbva.smsregex.extractor.model.ConsentRequest;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SmsBroadcastReceiver.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/smsregex/extractor/SmsBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "Lkotlin/Function1;", "Lcom/bbva/smsregex/extractor/model/ConsentRequest;", "Lcom/bbva/smsregex/extractor/OnSmsReceived;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lkotlin/jvm/functions/Function1;)V", "smsregex_release"}, k = 1, mv = {1, 9, 0})
public final class SmsBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function1<ConsentRequest, Unit> f36821a;

    /* JADX WARN: Multi-variable type inference failed */
    public SmsBroadcastReceiver(@NotNull Function1<? super ConsentRequest, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f36821a = listener;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Bundle extras;
        Intent intent2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (!Intrinsics.areEqual(SmsRetriever.SMS_RETRIEVED_ACTION, intent.getAction()) || (extras = intent.getExtras()) == null) {
            return;
        }
        Object obj = extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.google.android.gms.common.api.Status");
        if (((Status) obj).getStatusCode() != 0 || (intent2 = (Intent) extras.getParcelable(SmsRetriever.EXTRA_CONSENT_INTENT)) == null) {
            return;
        }
        this.f36821a.invoke(new ConsentRequest(intent2));
    }
}
