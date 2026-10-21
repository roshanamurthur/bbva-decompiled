package com.bbva.gp2.android.product.mobilepayment.plugin.command;

import android.app.Activity;
import androidx.compose.ui.platform.j;
import com.bbva.androidtoolkit.optional.Optional;
import com.bbva.androidtoolkit.optional.function.Consumer;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.gp2.android.product.mobilepayment.library.MobilePaymentLib;
import com.bbva.gp2.android.product.mobilepayment.library.MobilePaymentResult;
import com.bbva.gp2.android.product.mobilepayment.plugin.MobilePaymentLibInjector;
import com.bbva.gp2.android.product.mobilepayment.plugin.request.SetNfcPaymentAppRequest;
import com.bbva.gp2.android.product.mobilepayment.plugin.utils.Response;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SetNfcPaymentAppCommand.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/gp2/android/product/mobilepayment/plugin/command/SetNfcPaymentAppCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/gp2/android/product/mobilepayment/plugin/request/SetNfcPaymentAppRequest;", "<init>", "()V", "execute", "", "request", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "Companion", "payments-mobilepayment-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SetNfcPaymentAppCommand extends AbstractCommand<SetNfcPaymentAppRequest> {

    @NotNull
    public static final String ID = "setnfcpaymentapp";

    public SetNfcPaymentAppCommand() {
        super(SetNfcPaymentAppRequest.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit execute$lambda$0(SetNfcPaymentAppRequest request, CommandCallback callback, SetNfcPaymentAppCommand this$0, Activity activity) {
        Intrinsics.checkNotNullParameter(request, "$request");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MobilePaymentLib mobilePayment = MobilePaymentLibInjector.INSTANCE.getMobilePayment();
        Intrinsics.checkNotNull(activity);
        MobilePaymentResult<String> nfcPaymentApp = mobilePayment.setNfcPaymentApp(activity, request.getRequestCode());
        if (nfcPaymentApp instanceof MobilePaymentResult.Result) {
            callback.sendEvent(this$0.mGson.toJson(Response.Companion.ok$default(Response.INSTANCE, null, 1, null)));
        } else {
            if (!(nfcPaymentApp instanceof MobilePaymentResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            callback.sendError(this$0.mGson.toJson(Response.INSTANCE.error(((MobilePaymentResult.Error) nfcPaymentApp).getError().name())));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$2(CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.sendError(Errors.ErrorDefault);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.bbva.gp2.android.product.mobilepayment.plugin.command.a] */
    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull final SetNfcPaymentAppRequest request, @NotNull final CommandCallback callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Optional<Activity> optional = this.mActivityContainer.get();
        final ?? r1 = new Function1() { // from class: com.bbva.gp2.android.product.mobilepayment.plugin.command.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SetNfcPaymentAppCommand.execute$lambda$0(request, callback, this, (Activity) obj);
            }
        };
        optional.ifPresentOrElse(new Consumer() { // from class: com.bbva.gp2.android.product.mobilepayment.plugin.command.b
            @Override // com.bbva.androidtoolkit.optional.function.Consumer
            public final void accept(Object obj) {
                SetNfcPaymentAppCommand.execute$lambda$1(r1, obj);
            }
        }, new j(callback, 5));
    }
}
