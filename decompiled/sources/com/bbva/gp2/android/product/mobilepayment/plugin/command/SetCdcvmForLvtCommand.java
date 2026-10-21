package com.bbva.gp2.android.product.mobilepayment.plugin.command;

import android.content.Context;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.gp2.android.product.mobilepayment.library.MobilePaymentLib;
import com.bbva.gp2.android.product.mobilepayment.library.MobilePaymentResult;
import com.bbva.gp2.android.product.mobilepayment.plugin.MobilePaymentLibInjector;
import com.bbva.gp2.android.product.mobilepayment.plugin.request.SetCdcvmForLvmRequest;
import com.bbva.gp2.android.product.mobilepayment.plugin.utils.Response;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SetCdcvmForLvtCommand.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/gp2/android/product/mobilepayment/plugin/command/SetCdcvmForLvtCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/gp2/android/product/mobilepayment/plugin/request/SetCdcvmForLvmRequest;", "<init>", "()V", "execute", "", "request", "commandCallback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "Companion", "payments-mobilepayment-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SetCdcvmForLvtCommand extends AbstractCommand<SetCdcvmForLvmRequest> {

    @NotNull
    public static final String ID = "setcdcvmforlvt";

    public SetCdcvmForLvtCommand() {
        super(SetCdcvmForLvmRequest.class);
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull SetCdcvmForLvmRequest request, @NotNull CommandCallback commandCallback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(commandCallback, "commandCallback");
        MobilePaymentLibInjector mobilePaymentLibInjector = MobilePaymentLibInjector.INSTANCE;
        MobilePaymentLib mobilePayment = mobilePaymentLibInjector.getMobilePayment();
        Context applicationContext = this.mApplication.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        mobilePayment.setContext(applicationContext);
        MobilePaymentResult<String> cdcvmForLvt = mobilePaymentLibInjector.getMobilePayment().setCdcvmForLvt(request.getValue());
        if (cdcvmForLvt instanceof MobilePaymentResult.Result) {
            commandCallback.sendEvent(this.mGson.toJson(Response.Companion.ok$default(Response.INSTANCE, null, 1, null)));
        } else {
            if (!(cdcvmForLvt instanceof MobilePaymentResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            commandCallback.sendError(this.mGson.toJson(Response.INSTANCE.error(((MobilePaymentResult.Error) cdcvmForLvt).getError().name())));
        }
    }
}
