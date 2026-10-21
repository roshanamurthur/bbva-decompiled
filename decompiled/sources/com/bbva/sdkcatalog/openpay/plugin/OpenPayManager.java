package com.bbva.sdkcatalog.openpay.plugin;

import android.app.Activity;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.gp2.android.product.trustdevice.library.TrustDeviceLib;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.sdkcatalog.openpay.plugin.data.model.DeviceDTOModel;
import com.bbva.sdkcatalog.openpay.plugin.data.model.PaymentLinkModel;
import com.bbva.sdkcatalog.openpay.plugin.data.param.ExecuteChargeParams;
import com.bbva.sdkcatalog.openpay.plugin.data.param.TapOnPhoneExecuteRefundChargeParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import mx.openpay.library.core.model.OpenPayDeviceNFCStatus;
import mx.openpay.library.core.model.OpenPayPaymentLink;
import mx.openpay.library.core.model.extra.OpenPayRefundTransaction;
import mx.openpay.library.core.model.extra.PaymentLinkFilter;
import mx.openpay.library.core.model.extra.SecureTerminal;
import mx.openpay.library.core.model.extra.SendVoucherRequestDTO;
import mx.openpay.library.core.model.extra.TransactionDTO;
import mx.openpay.library.core.model.extra.TransactionFilter;
import mx.openpay.library.core.model.extra.UpdatePaymentLink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OpenPayManager.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H¦@¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H¦@¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001cH¦@¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190 0\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"H¦@¢\u0006\u0004\b#\u0010$J,\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0 0\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010'\u001a\u00020(H¦@¢\u0006\u0004\b)\u0010*J&\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010-\u001a\u00020.H¦@¢\u0006\u0004\b/\u00100J&\u00101\u001a\b\u0012\u0004\u0012\u00020,0\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u00102\u001a\u00020\bH¦@¢\u0006\u0004\b3\u00104J&\u00105\u001a\b\u0012\u0004\u0012\u00020,0\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u00106\u001a\u000207H¦@¢\u0006\u0004\b8\u00109J&\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010;\u001a\u00020\bH¦@¢\u0006\u0004\b<\u00104J,\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0 0\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010>\u001a\u00020?H¦@¢\u0006\u0004\b@\u0010AJ&\u0010B\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010C\u001a\u00020DH¦@¢\u0006\u0004\bE\u0010FJ&\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\bH¦@¢\u0006\u0004\bJ\u0010KJ&\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010M\u001a\u00020NH¦@¢\u0006\u0004\bO\u0010PJ&\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010M\u001a\u00020RH¦@¢\u0006\u0004\bS\u0010T¨\u0006U"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/OpenPayManager;", "", "initOpenPay", "Lkotlin/Result;", "", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "country", "", "environment", Constants.device, "initOpenPay-yxL6bBk", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scanNewDevices", "", "scanNewDevices-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connectToBluetoothDevice", "secureTerminal", "Lmx/openpay/library/core/model/extra/SecureTerminal;", "deviceDTOModel", "Lcom/bbva/sdkcatalog/openpay/plugin/data/model/DeviceDTOModel;", "connectToBluetoothDevice-0E7RQCE", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Lcom/bbva/sdkcatalog/openpay/plugin/data/model/DeviceDTOModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyTransactionRefund", "Lmx/openpay/library/core/model/extra/TransactionDTO;", "secureRefundTerminal", "openPayRefundTransaction", "Lmx/openpay/library/core/model/extra/OpenPayRefundTransaction;", "applyTransactionRefund-BWLJW6A", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Lmx/openpay/library/core/model/extra/SecureTerminal;Lmx/openpay/library/core/model/extra/OpenPayRefundTransaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listTransactions", "", "transactionFilter", "Lmx/openpay/library/core/model/extra/TransactionFilter;", "listTransactions-0E7RQCE", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Lmx/openpay/library/core/model/extra/TransactionFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentPlans", "", PushConstants.AMOUNT, "", "getPaymentPlans-0E7RQCE", "(Lmx/openpay/library/core/model/extra/SecureTerminal;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentLink", "Lmx/openpay/library/core/model/OpenPayPaymentLink;", "paymentLinkModel", "Lcom/bbva/sdkcatalog/openpay/plugin/data/model/PaymentLinkModel;", "createPaymentLink-0E7RQCE", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Lcom/bbva/sdkcatalog/openpay/plugin/data/model/PaymentLinkModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkPaymentLink", "paymentLinkId", "checkPaymentLink-0E7RQCE", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePaymentLink", "updatePaymentLinkData", "Lmx/openpay/library/core/model/extra/UpdatePaymentLink;", "updatePaymentLink-0E7RQCE", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Lmx/openpay/library/core/model/extra/UpdatePaymentLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refundPaymentLink", "transactionId", "refundPaymentLink-0E7RQCE", "paymentLinkListing", "paymentLinkListingModel", "Lmx/openpay/library/core/model/extra/PaymentLinkFilter;", "paymentLinkListing-0E7RQCE", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Lmx/openpay/library/core/model/extra/PaymentLinkFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendVoucher", "sendVoucherRequestDTO", "Lmx/openpay/library/core/model/extra/SendVoucherRequestDTO;", "sendVoucher-0E7RQCE", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Lmx/openpay/library/core/model/extra/SendVoucherRequestDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initTapOnPhone", "Lmx/openpay/library/core/model/OpenPayDeviceNFCStatus;", TrustDeviceLib.JWS, "initTapOnPhone-0E7RQCE", "(Landroid/app/Activity;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeTapOnPhoneCharge", "params", "Lcom/bbva/sdkcatalog/openpay/plugin/data/param/ExecuteChargeParams;", "executeTapOnPhoneCharge-0E7RQCE", "(Landroid/app/Activity;Lcom/bbva/sdkcatalog/openpay/plugin/data/param/ExecuteChargeParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeTapOnPhoneRefundCharge", "Lcom/bbva/sdkcatalog/openpay/plugin/data/param/TapOnPhoneExecuteRefundChargeParams;", "executeTapOnPhoneRefundCharge-0E7RQCE", "(Landroid/app/Activity;Lcom/bbva/sdkcatalog/openpay/plugin/data/param/TapOnPhoneExecuteRefundChargeParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface OpenPayManager {
    @Nullable
    /* JADX INFO: renamed from: applyTransactionRefund-BWLJW6A */
    Object mo4944applyTransactionRefundBWLJW6A(@NotNull SecureTerminal secureTerminal, @NotNull SecureTerminal secureTerminal2, @NotNull OpenPayRefundTransaction openPayRefundTransaction, @NotNull Continuation<? super Result<TransactionDTO>> continuation);

    @Nullable
    /* JADX INFO: renamed from: checkPaymentLink-0E7RQCE */
    Object mo4945checkPaymentLink0E7RQCE(@NotNull SecureTerminal secureTerminal, @NotNull String str, @NotNull Continuation<? super Result<OpenPayPaymentLink>> continuation);

    @Nullable
    /* JADX INFO: renamed from: connectToBluetoothDevice-0E7RQCE */
    Object mo4946connectToBluetoothDevice0E7RQCE(@NotNull SecureTerminal secureTerminal, @NotNull DeviceDTOModel deviceDTOModel, @NotNull Continuation<? super Result<Boolean>> continuation);

    @Nullable
    /* JADX INFO: renamed from: createPaymentLink-0E7RQCE */
    Object mo4947createPaymentLink0E7RQCE(@NotNull SecureTerminal secureTerminal, @NotNull PaymentLinkModel paymentLinkModel, @NotNull Continuation<? super Result<OpenPayPaymentLink>> continuation);

    @Nullable
    /* JADX INFO: renamed from: executeTapOnPhoneCharge-0E7RQCE */
    Object mo4948executeTapOnPhoneCharge0E7RQCE(@NotNull Activity activity, @NotNull ExecuteChargeParams executeChargeParams, @NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    /* JADX INFO: renamed from: executeTapOnPhoneRefundCharge-0E7RQCE */
    Object mo4949executeTapOnPhoneRefundCharge0E7RQCE(@NotNull Activity activity, @NotNull TapOnPhoneExecuteRefundChargeParams tapOnPhoneExecuteRefundChargeParams, @NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    /* JADX INFO: renamed from: getPaymentPlans-0E7RQCE */
    Object mo4950getPaymentPlans0E7RQCE(@NotNull SecureTerminal secureTerminal, double d2, @NotNull Continuation<? super Result<? extends List<Integer>>> continuation);

    @Nullable
    /* JADX INFO: renamed from: initOpenPay-yxL6bBk */
    Object mo4951initOpenPayyxL6bBk(@NotNull Activity activity, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    /* JADX INFO: renamed from: initTapOnPhone-0E7RQCE */
    Object mo4952initTapOnPhone0E7RQCE(@NotNull Activity activity, @NotNull String str, @NotNull Continuation<? super Result<? extends OpenPayDeviceNFCStatus>> continuation);

    @Nullable
    /* JADX INFO: renamed from: listTransactions-0E7RQCE */
    Object mo4953listTransactions0E7RQCE(@NotNull SecureTerminal secureTerminal, @NotNull TransactionFilter transactionFilter, @NotNull Continuation<? super Result<? extends List<TransactionDTO>>> continuation);

    @Nullable
    /* JADX INFO: renamed from: paymentLinkListing-0E7RQCE */
    Object mo4954paymentLinkListing0E7RQCE(@NotNull SecureTerminal secureTerminal, @NotNull PaymentLinkFilter paymentLinkFilter, @NotNull Continuation<? super Result<? extends List<OpenPayPaymentLink>>> continuation);

    @Nullable
    /* JADX INFO: renamed from: refundPaymentLink-0E7RQCE */
    Object mo4955refundPaymentLink0E7RQCE(@NotNull SecureTerminal secureTerminal, @NotNull String str, @NotNull Continuation<? super Result<TransactionDTO>> continuation);

    @Nullable
    /* JADX INFO: renamed from: scanNewDevices-IoAF18A */
    Object mo4956scanNewDevicesIoAF18A(@NotNull Continuation<? super Result<Boolean>> continuation);

    @Nullable
    /* JADX INFO: renamed from: sendVoucher-0E7RQCE */
    Object mo4957sendVoucher0E7RQCE(@NotNull SecureTerminal secureTerminal, @NotNull SendVoucherRequestDTO sendVoucherRequestDTO, @NotNull Continuation<? super Result<Boolean>> continuation);

    @Nullable
    /* JADX INFO: renamed from: updatePaymentLink-0E7RQCE */
    Object mo4958updatePaymentLink0E7RQCE(@NotNull SecureTerminal secureTerminal, @NotNull UpdatePaymentLink updatePaymentLink, @NotNull Continuation<? super Result<OpenPayPaymentLink>> continuation);
}
