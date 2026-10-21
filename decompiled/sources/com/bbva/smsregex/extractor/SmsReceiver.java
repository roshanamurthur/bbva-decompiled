package com.bbva.smsregex.extractor;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.bbva.smsregex.extractor.model.ConsentRequest;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SmsReceiver.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/bbva/smsregex/extractor/SmsReceiver;", "Lcom/bbva/smsregex/extractor/SmsListener;", "Landroid/content/Context;", "context", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/smsregex/extractor/model/ConsentRequest;", "listen", "", "registerReceiverOnTiramisu", "registerReceiverBelowTiramisu", "stop", "<init>", "()V", "smsregex_release"}, k = 1, mv = {1, 9, 0})
public final class SmsReceiver implements SmsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f36823a = CoroutineScopeKt.MainScope();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Channel<ConsentRequest> f36824b = ChannelKt.Channel$default(1, null, null, 6, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public SmsBroadcastReceiver f36825c;

    /* JADX INFO: compiled from: SmsReceiver.kt */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<ConsentRequest, Unit> {
        public a(Object obj) {
            super(1, obj, SmsReceiver.class, "onSmsReceived", "onSmsReceived(Lcom/bbva/smsregex/extractor/model/ConsentRequest;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ConsentRequest consentRequest) {
            ConsentRequest p4 = consentRequest;
            Intrinsics.checkNotNullParameter(p4, "p0");
            SmsReceiver.access$onSmsReceived((SmsReceiver) this.receiver, p4);
            return Unit.INSTANCE;
        }
    }

    public static final void access$onSmsReceived(SmsReceiver smsReceiver, ConsentRequest consentRequest) {
        BuildersKt__Builders_commonKt.launch$default(smsReceiver.f36823a, null, null, new gc.a(smsReceiver, consentRequest, null), 3, null);
    }

    @Override // com.bbva.smsregex.extractor.SmsListener
    @NotNull
    public Flow<ConsentRequest> listen(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        stop(context);
        this.f36825c = new SmsBroadcastReceiver(new a(this));
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiverOnTiramisu(context);
        } else {
            registerReceiverBelowTiramisu(context);
        }
        return FlowKt.consumeAsFlow(this.f36824b);
    }

    @SuppressLint({"UnspecifiedRegisterReceiverFlag"})
    public final void registerReceiverBelowTiramisu(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.registerReceiver(this.f36825c, new IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION));
    }

    @RequiresApi(33)
    public final void registerReceiverOnTiramisu(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.registerReceiver(this.f36825c, new IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION), 2);
    }

    @Override // com.bbva.smsregex.extractor.SmsListener
    public void stop(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            try {
                context.unregisterReceiver(this.f36825c);
            } catch (Exception e5) {
                Log.w("SmsReceiver", e5);
            }
        } finally {
            this.f36825c = null;
        }
    }
}
