package com.bbva.sdkcatalog.openpay.plugin;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.gp2.android.product.trustdevice.library.TrustDeviceLib;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.sdkcatalog.openpay.plugin.data.model.DeviceDTOModel;
import com.bbva.sdkcatalog.openpay.plugin.data.model.PaymentLinkModel;
import com.bbva.sdkcatalog.openpay.plugin.data.param.ExecuteChargeParams;
import com.bbva.sdkcatalog.openpay.plugin.data.param.TapOnPhoneExecuteRefundChargeParams;
import com.sun.mail.imap.IMAPStore;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.UninitializedPropertyAccessException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import mx.openpay.library.core.OpenPaySdk;
import mx.openpay.library.core.feature.PaymentLinkController;
import mx.openpay.library.core.feature.TapOnPhoneController;
import mx.openpay.library.core.model.OpenPayConfiguration;
import mx.openpay.library.core.model.OpenPayCountryFactory;
import mx.openpay.library.core.model.OpenPayDeviceNFCStatus;
import mx.openpay.library.core.model.OpenPayEnvironment;
import mx.openpay.library.core.model.OpenPayEnvironmentFactory;
import mx.openpay.library.core.model.OpenPayError;
import mx.openpay.library.core.model.OpenPayIntegrator;
import mx.openpay.library.core.model.OpenPayPaymentLink;
import mx.openpay.library.core.model.OpenPayResult;
import mx.openpay.library.core.model.PaymentLink;
import mx.openpay.library.core.model.extra.DeviceDTO;
import mx.openpay.library.core.model.extra.OpenPayRefundTransaction;
import mx.openpay.library.core.model.extra.PaymentLinkFilter;
import mx.openpay.library.core.model.extra.PaymentMethod;
import mx.openpay.library.core.model.extra.SecureTerminal;
import mx.openpay.library.core.model.extra.SendVoucherRequestDTO;
import mx.openpay.library.core.model.extra.TransactionDTO;
import mx.openpay.library.core.model.extra.TransactionFilter;
import mx.openpay.library.core.model.extra.UpdatePaymentLink;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DefaultOpenPayManager.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 g2\u00020\u0001:\u0001gB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J.\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b\u001f\u0010 J,\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\"0\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$H\u0096@¢\u0006\u0004\b%\u0010&J,\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\"0\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010)\u001a\u00020*H\u0096@¢\u0006\u0004\b+\u0010,J&\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010/\u001a\u000200H\u0096@¢\u0006\u0004\b1\u00102JF\u00103\u001a\b\u0012\u0004\u0012\u0002H40\u0005\"\u0006\b\u0000\u00104\u0018\u00012\u0006\u0010)\u001a\u00020*2\u001e\u00105\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\"\u0012\n\u0012\b\u0012\u0004\u0012\u0002H40\u000506H\u0082H¢\u0006\u0004\b7\u00108J&\u00109\u001a\b\u0012\u0004\u0012\u00020.0\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\nH\u0096@¢\u0006\u0004\b;\u0010<J&\u0010=\u001a\b\u0012\u0004\u0012\u00020.0\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010>\u001a\u00020?H\u0096@¢\u0006\u0004\b@\u0010AJ&\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00052\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010C\u001a\u00020\nH\u0096@¢\u0006\u0004\bD\u0010<J,\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\"0\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010F\u001a\u00020GH\u0096@¢\u0006\u0004\bH\u0010IJ&\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010K\u001a\u00020LH\u0096@¢\u0006\u0004\bM\u0010NJ&\u0010O\u001a\b\u0012\u0004\u0012\u00020P0\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\nH\u0096@¢\u0006\u0004\bR\u0010SJB\u0010T\u001a\b\u0012\u0004\u0012\u0002H40\u0005\"\u0006\b\u0000\u00104\u0018\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010U\u001a\u00020\n2\u0012\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H40\u00050VH\u0082H¢\u0006\u0004\bW\u0010XJ&\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010Z\u001a\u00020[H\u0096@¢\u0006\u0004\b\\\u0010]J&\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010Z\u001a\u00020_H\u0096@¢\u0006\u0004\b`\u0010aJJ\u0010b\u001a\b\u0012\u0004\u0012\u0002H40\u0005\"\u0006\b\u0000\u00104\u0018\u00012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010c\u001a\u0004\u0018\u00010\n2\u0012\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H40\u00050VH\u0082\b¢\u0006\u0004\be\u0010f¨\u0006h"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/DefaultOpenPayManager;", "Lcom/bbva/sdkcatalog/openpay/plugin/OpenPayManager;", "<init>", "()V", "initOpenPay", "Lkotlin/Result;", "", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "country", "", "environment", Constants.device, "initOpenPay-yxL6bBk", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scanNewDevices", "", "scanNewDevices-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connectToBluetoothDevice", "secureTerminal", "Lmx/openpay/library/core/model/extra/SecureTerminal;", "deviceDTOModel", "Lcom/bbva/sdkcatalog/openpay/plugin/data/model/DeviceDTOModel;", "connectToBluetoothDevice-0E7RQCE", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Lcom/bbva/sdkcatalog/openpay/plugin/data/model/DeviceDTOModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyTransactionRefund", "Lmx/openpay/library/core/model/extra/TransactionDTO;", "secureRefundTerminal", "openPayRefundTransaction", "Lmx/openpay/library/core/model/extra/OpenPayRefundTransaction;", "applyTransactionRefund-BWLJW6A", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Lmx/openpay/library/core/model/extra/SecureTerminal;Lmx/openpay/library/core/model/extra/OpenPayRefundTransaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listTransactions", "", "transactionFilter", "Lmx/openpay/library/core/model/extra/TransactionFilter;", "listTransactions-0E7RQCE", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Lmx/openpay/library/core/model/extra/TransactionFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentPlans", "", PushConstants.AMOUNT, "", "getPaymentPlans-0E7RQCE", "(Lmx/openpay/library/core/model/extra/SecureTerminal;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentLink", "Lmx/openpay/library/core/model/OpenPayPaymentLink;", "paymentLinkModel", "Lcom/bbva/sdkcatalog/openpay/plugin/data/model/PaymentLinkModel;", "createPaymentLink-0E7RQCE", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Lcom/bbva/sdkcatalog/openpay/plugin/data/model/PaymentLinkModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handlePaymentPlans", ExifInterface.GPS_DIRECTION_TRUE, "action", "Lkotlin/Function1;", "handlePaymentPlans-0E7RQCE", "(DLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkPaymentLink", "paymentLinkId", "checkPaymentLink-0E7RQCE", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePaymentLink", "updatePaymentLinkData", "Lmx/openpay/library/core/model/extra/UpdatePaymentLink;", "updatePaymentLink-0E7RQCE", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Lmx/openpay/library/core/model/extra/UpdatePaymentLink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refundPaymentLink", "transactionId", "refundPaymentLink-0E7RQCE", "paymentLinkListing", "paymentLinkListingModel", "Lmx/openpay/library/core/model/extra/PaymentLinkFilter;", "paymentLinkListing-0E7RQCE", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Lmx/openpay/library/core/model/extra/PaymentLinkFilter;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendVoucher", "sendVoucherRequestDTO", "Lmx/openpay/library/core/model/extra/SendVoucherRequestDTO;", "sendVoucher-0E7RQCE", "(Lmx/openpay/library/core/model/extra/SecureTerminal;Lmx/openpay/library/core/model/extra/SendVoucherRequestDTO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initTapOnPhone", "Lmx/openpay/library/core/model/OpenPayDeviceNFCStatus;", TrustDeviceLib.JWS, "initTapOnPhone-0E7RQCE", "(Landroid/app/Activity;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initTsdkManualInitializer", "authToken", "Lkotlin/Function0;", "initTsdkManualInitializer-BWLJW6A", "(Landroid/app/Activity;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeTapOnPhoneCharge", "params", "Lcom/bbva/sdkcatalog/openpay/plugin/data/param/ExecuteChargeParams;", "executeTapOnPhoneCharge-0E7RQCE", "(Landroid/app/Activity;Lcom/bbva/sdkcatalog/openpay/plugin/data/param/ExecuteChargeParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeTapOnPhoneRefundCharge", "Lcom/bbva/sdkcatalog/openpay/plugin/data/param/TapOnPhoneExecuteRefundChargeParams;", "executeTapOnPhoneRefundCharge-0E7RQCE", "(Landroid/app/Activity;Lcom/bbva/sdkcatalog/openpay/plugin/data/param/TapOnPhoneExecuteRefundChargeParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleCommand", "newToken", IMAPStore.ID_COMMAND, "handleCommand-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Companion", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultOpenPayManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultOpenPayManager.kt\ncom/bbva/sdkcatalog/openpay/plugin/DefaultOpenPayManager\n*L\n1#1,417:1\n393#1,21:418\n393#1,21:439\n393#1,21:460\n393#1,21:481\n393#1,21:502\n211#1:523\n393#1,17:524\n212#1,4:541\n410#1,4:545\n216#1:549\n211#1:550\n393#1,17:551\n212#1,4:568\n410#1,4:572\n216#1:576\n393#1,21:577\n393#1,21:598\n393#1,21:619\n393#1,21:640\n393#1,21:661\n393#1,21:682\n331#1:703\n393#1,17:704\n332#1,31:721\n410#1,4:752\n363#1:756\n393#1,21:757\n393#1,21:778\n393#1,21:799\n*S KotlinDebug\n*F\n+ 1 DefaultOpenPayManager.kt\ncom/bbva/sdkcatalog/openpay/plugin/DefaultOpenPayManager\n*L\n53#1:418,21\n76#1:439,21\n87#1:460,21\n107#1:481,21\n149#1:502,21\n177#1:523\n177#1:524,17\n177#1:541,4\n177#1:545,4\n177#1:549\n185#1:550\n185#1:551,17\n185#1:568,4\n185#1:572,4\n185#1:576\n211#1:577,21\n222#1:598,21\n238#1:619,21\n254#1:640,21\n271#1:661,21\n293#1:682,21\n309#1:703\n309#1:704,17\n309#1:721,31\n309#1:752,4\n309#1:756\n331#1:757,21\n369#1:778,21\n382#1:799,21\n*E\n"})
public final class DefaultOpenPayManager implements OpenPayManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String ERROR_INIT_MESSAGE = "100#100#OPENPAY SDK INIT FAILED";

    @NotNull
    private static final String ERROR_INIT_TAP_ON_PHONE_NOT_IMPLEMENTED = "883#883#TAP ON PHONE SDK NOT IMPLEMENTED";

    @NotNull
    private static final String ERROR_INIT_TAP_ON_PHONE_NO_NFC = "881#881#TAP ON PHONE SDK INIT FAILED NO NFC";

    @NotNull
    private static final String ERROR_INIT_TAP_ON_PHONE_UNSUPPORTED = "882#882#TAP ON PHONE SDK UNSUPPORTED ANDROID VERSION";
    private static boolean isTsdkManualInitializerCreated;

    /* JADX INFO: compiled from: DefaultOpenPayManager.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/DefaultOpenPayManager$Companion;", "", "<init>", "()V", "ERROR_INIT_MESSAGE", "", "ERROR_INIT_TAP_ON_PHONE_NO_NFC", "ERROR_INIT_TAP_ON_PHONE_UNSUPPORTED", "ERROR_INIT_TAP_ON_PHONE_NOT_IMPLEMENTED", "value", "", "isTsdkManualInitializerCreated", "isTsdkManualInitializerCreated$openpay_plugin_release", "()Z", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isTsdkManualInitializerCreated$openpay_plugin_release() {
            return DefaultOpenPayManager.isTsdkManualInitializerCreated;
        }
    }

    /* JADX INFO: compiled from: DefaultOpenPayManager.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OpenPayDeviceNFCStatus.values().length];
            try {
                iArr[OpenPayDeviceNFCStatus.NO_NFC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: handleCommand-0E7RQCE, reason: not valid java name */
    private final /* synthetic */ <T> Object m4940handleCommand0E7RQCE(String authToken, String newToken, Function0<? extends Result<? extends T>> command) {
        if (authToken != null) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new DefaultOpenPayManager$handleCommand$1$1(authToken, null), 2, null);
        }
        if (newToken != null) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new DefaultOpenPayManager$handleCommand$2$1(newToken, null), 2, null);
        }
        try {
            return command.invoke().getF79387p0();
        } catch (UninitializedPropertyAccessException unused) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_MESSAGE)));
        } catch (Exception e5) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(e5.getMessage())));
        }
    }

    /* JADX INFO: renamed from: handleCommand-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ Object m4941handleCommand0E7RQCE$default(DefaultOpenPayManager defaultOpenPayManager, String str, String str2, Function0 function0, int i10, Object obj) {
        String str3 = (i10 & 1) != 0 ? null : str;
        String str4 = (i10 & 2) != 0 ? null : str2;
        if (str3 != null) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new DefaultOpenPayManager$handleCommand$1$1(str3, null), 2, null);
        }
        if (str4 != null) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new DefaultOpenPayManager$handleCommand$2$1(str4, null), 2, null);
        }
        try {
            return ((Result) function0.invoke()).getF79387p0();
        } catch (UninitializedPropertyAccessException unused) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_MESSAGE)));
        } catch (Exception e5) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(e5.getMessage())));
        }
    }

    /* JADX INFO: renamed from: handlePaymentPlans-0E7RQCE, reason: not valid java name */
    private final /* synthetic */ <T> Object m4942handlePaymentPlans0E7RQCE(double d2, Function1<? super List<Integer>, ? extends Result<? extends T>> function1, Continuation<? super Result<? extends T>> continuation) {
        Object objM5535constructorimpl;
        try {
            PaymentLinkController paymentLink = OpenPaySdk.INSTANCE.getPaymentLink();
            InlineMarker.mark(3);
            InlineMarker.mark(0);
            Object paymentPlans = paymentLink.getPaymentPlans(d2, null);
            InlineMarker.mark(1);
            OpenPayResult openPayResult = (OpenPayResult) paymentPlans;
            if (openPayResult instanceof OpenPayResult.Success) {
                objM5535constructorimpl = function1.invoke(((OpenPayResult.Success) openPayResult).getData()).getF79387p0();
            } else {
                if (!(openPayResult instanceof OpenPayResult.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                Result.Companion companion = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(new Exception(((OpenPayResult.Failure) openPayResult).getError().getErrorBody())));
            }
            return Result.m5534boximpl(objM5535constructorimpl).getF79387p0();
        } catch (UninitializedPropertyAccessException unused) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_MESSAGE)));
        } catch (Exception e5) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(e5.getMessage())));
        }
    }

    /* JADX INFO: renamed from: initTsdkManualInitializer-BWLJW6A, reason: not valid java name */
    private final /* synthetic */ <T> Object m4943initTsdkManualInitializerBWLJW6A(Activity activity, String str, Function0<? extends Result<? extends T>> function0, Continuation<? super Result<? extends T>> continuation) {
        Object success;
        Object objM5535constructorimpl;
        if (str != null) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new DefaultOpenPayManager$handleCommand$1$1(str, null), 2, null);
        }
        try {
            if (INSTANCE.isTsdkManualInitializerCreated$openpay_plugin_release()) {
                success = new OpenPayResult.Success(Boolean.TRUE);
            } else {
                Context applicationContext = activity.getApplicationContext();
                Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                TapOnPhoneController tapOnPhoneController = OpenPaySdk.INSTANCE.getTapOnPhoneController();
                InlineMarker.mark(3);
                InlineMarker.mark(0);
                Object objCreatedTsdkManualInitializer = tapOnPhoneController.createdTsdkManualInitializer((Application) applicationContext, null);
                InlineMarker.mark(1);
                success = (OpenPayResult) objCreatedTsdkManualInitializer;
            }
            if (success instanceof OpenPayResult.Success) {
                isTsdkManualInitializerCreated = true;
                TapOnPhoneController tapOnPhoneController2 = OpenPaySdk.INSTANCE.getTapOnPhoneController();
                InlineMarker.mark(3);
                InlineMarker.mark(0);
                Object objInitTsdkManualInitializer = tapOnPhoneController2.initTsdkManualInitializer(null);
                InlineMarker.mark(1);
                OpenPayResult openPayResult = (OpenPayResult) objInitTsdkManualInitializer;
                if (openPayResult instanceof OpenPayResult.Success) {
                    objM5535constructorimpl = function0.invoke().getF79387p0();
                } else {
                    if (!(openPayResult instanceof OpenPayResult.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    OpenPayError error = ((OpenPayResult.Failure) openPayResult).getError();
                    if (Intrinsics.areEqual(error, OpenPayError.NotImplemented.INSTANCE)) {
                        Result.Companion companion = Result.INSTANCE;
                        objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_TAP_ON_PHONE_NOT_IMPLEMENTED)));
                    } else if (Intrinsics.areEqual(error, OpenPayError.UnsupportedVersion.INSTANCE)) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_TAP_ON_PHONE_UNSUPPORTED)));
                    } else {
                        Result.Companion companion3 = Result.INSTANCE;
                        objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(new Exception(((OpenPayResult.Failure) openPayResult).getError().getErrorBody())));
                    }
                }
            } else {
                if (!(success instanceof OpenPayResult.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                OpenPayError error2 = ((OpenPayResult.Failure) success).getError();
                if (Intrinsics.areEqual(error2, OpenPayError.NotImplemented.INSTANCE)) {
                    Result.Companion companion4 = Result.INSTANCE;
                    objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_TAP_ON_PHONE_NOT_IMPLEMENTED)));
                } else if (Intrinsics.areEqual(error2, OpenPayError.UnsupportedVersion.INSTANCE)) {
                    Result.Companion companion5 = Result.INSTANCE;
                    objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_TAP_ON_PHONE_UNSUPPORTED)));
                } else {
                    Result.Companion companion6 = Result.INSTANCE;
                    objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(new Exception(((OpenPayResult.Failure) success).getError().getErrorBody())));
                }
            }
            return Result.m5534boximpl(objM5535constructorimpl).getF79387p0();
        } catch (UninitializedPropertyAccessException unused) {
            Result.Companion companion7 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_MESSAGE)));
        } catch (Exception e5) {
            Result.Companion companion8 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(e5.getMessage())));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.bbva.sdkcatalog.openpay.plugin.OpenPayManager
    @Nullable
    /* JADX INFO: renamed from: applyTransactionRefund-BWLJW6A, reason: not valid java name */
    public Object mo4944applyTransactionRefundBWLJW6A(@NotNull SecureTerminal secureTerminal, @NotNull SecureTerminal secureTerminal2, @NotNull OpenPayRefundTransaction openPayRefundTransaction, @NotNull Continuation<? super Result<TransactionDTO>> continuation) {
        DefaultOpenPayManager$applyTransactionRefund$1 defaultOpenPayManager$applyTransactionRefund$1;
        if (continuation instanceof DefaultOpenPayManager$applyTransactionRefund$1) {
            defaultOpenPayManager$applyTransactionRefund$1 = (DefaultOpenPayManager$applyTransactionRefund$1) continuation;
            int i10 = defaultOpenPayManager$applyTransactionRefund$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                defaultOpenPayManager$applyTransactionRefund$1.label = i10 - Integer.MIN_VALUE;
            } else {
                defaultOpenPayManager$applyTransactionRefund$1 = new DefaultOpenPayManager$applyTransactionRefund$1(this, continuation);
            }
        } else {
            defaultOpenPayManager$applyTransactionRefund$1 = new DefaultOpenPayManager$applyTransactionRefund$1(this, continuation);
        }
        Object objApplyTransactionRefund = defaultOpenPayManager$applyTransactionRefund$1.result;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = defaultOpenPayManager$applyTransactionRefund$1.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objApplyTransactionRefund);
                String jws = secureTerminal2.getJws();
                if (jws != null) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new DefaultOpenPayManager$handleCommand$2$1(jws, null), 2, null);
                }
                OpenPaySdk openPaySdk = OpenPaySdk.INSTANCE;
                String id = openPayRefundTransaction.getId();
                String description = openPayRefundTransaction.getDescription();
                String str = description == null ? "" : description;
                String orderId = openPayRefundTransaction.getOrderId();
                double amount = openPayRefundTransaction.getAmount();
                List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                String gatewayCardPresent = openPayRefundTransaction.getGatewayCardPresent();
                TransactionDTO transactionDTO = new TransactionDTO(id, "", "", "", "", false, "", "", str, "", "", "", orderId, amount, "", "", listEmptyList, gatewayCardPresent == null ? "" : gatewayCardPresent, openPayRefundTransaction.getCard(), openPayRefundTransaction.getReadMode(), 0.0d, null, "", "", null, null, 50331648, null);
                defaultOpenPayManager$applyTransactionRefund$1.label = 1;
                objApplyTransactionRefund = openPaySdk.applyTransactionRefund(secureTerminal, secureTerminal2, transactionDTO, defaultOpenPayManager$applyTransactionRefund$1);
                if (objApplyTransactionRefund == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objApplyTransactionRefund);
            }
            OpenPayResult openPayResult = (OpenPayResult) objApplyTransactionRefund;
            if (openPayResult instanceof OpenPayResult.Success) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m5535constructorimpl(((OpenPayResult.Success) openPayResult).getData());
            }
            if (!(openPayResult instanceof OpenPayResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(((OpenPayResult.Failure) openPayResult).getError().getErrorBody())));
        } catch (UninitializedPropertyAccessException unused) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_MESSAGE)));
        } catch (Exception e5) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(e5.getMessage())));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.sdkcatalog.openpay.plugin.OpenPayManager
    @Nullable
    /* JADX INFO: renamed from: checkPaymentLink-0E7RQCE, reason: not valid java name */
    public Object mo4945checkPaymentLink0E7RQCE(@NotNull SecureTerminal secureTerminal, @NotNull String str, @NotNull Continuation<? super Result<OpenPayPaymentLink>> continuation) {
        DefaultOpenPayManager$checkPaymentLink$1 defaultOpenPayManager$checkPaymentLink$1;
        if (continuation instanceof DefaultOpenPayManager$checkPaymentLink$1) {
            defaultOpenPayManager$checkPaymentLink$1 = (DefaultOpenPayManager$checkPaymentLink$1) continuation;
            int i10 = defaultOpenPayManager$checkPaymentLink$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                defaultOpenPayManager$checkPaymentLink$1.label = i10 - Integer.MIN_VALUE;
            } else {
                defaultOpenPayManager$checkPaymentLink$1 = new DefaultOpenPayManager$checkPaymentLink$1(this, continuation);
            }
        } else {
            defaultOpenPayManager$checkPaymentLink$1 = new DefaultOpenPayManager$checkPaymentLink$1(this, continuation);
        }
        Object objCheckPaymentLink = defaultOpenPayManager$checkPaymentLink$1.result;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = defaultOpenPayManager$checkPaymentLink$1.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objCheckPaymentLink);
                OpenPaySdk openPaySdk = OpenPaySdk.INSTANCE;
                defaultOpenPayManager$checkPaymentLink$1.label = 1;
                objCheckPaymentLink = openPaySdk.checkPaymentLink(secureTerminal, str, defaultOpenPayManager$checkPaymentLink$1);
                if (objCheckPaymentLink == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCheckPaymentLink);
            }
            OpenPayResult openPayResult = (OpenPayResult) objCheckPaymentLink;
            if (openPayResult instanceof OpenPayResult.Success) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m5535constructorimpl(((OpenPayResult.Success) openPayResult).getData());
            }
            if (!(openPayResult instanceof OpenPayResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(((OpenPayResult.Failure) openPayResult).getError().getErrorBody())));
        } catch (UninitializedPropertyAccessException unused) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_MESSAGE)));
        } catch (Exception e5) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(e5.getMessage())));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.sdkcatalog.openpay.plugin.OpenPayManager
    @Nullable
    /* JADX INFO: renamed from: connectToBluetoothDevice-0E7RQCE, reason: not valid java name */
    public Object mo4946connectToBluetoothDevice0E7RQCE(@NotNull SecureTerminal secureTerminal, @NotNull DeviceDTOModel deviceDTOModel, @NotNull Continuation<? super Result<Boolean>> continuation) {
        DefaultOpenPayManager$connectToBluetoothDevice$1 defaultOpenPayManager$connectToBluetoothDevice$1;
        if (continuation instanceof DefaultOpenPayManager$connectToBluetoothDevice$1) {
            defaultOpenPayManager$connectToBluetoothDevice$1 = (DefaultOpenPayManager$connectToBluetoothDevice$1) continuation;
            int i10 = defaultOpenPayManager$connectToBluetoothDevice$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                defaultOpenPayManager$connectToBluetoothDevice$1.label = i10 - Integer.MIN_VALUE;
            } else {
                defaultOpenPayManager$connectToBluetoothDevice$1 = new DefaultOpenPayManager$connectToBluetoothDevice$1(this, continuation);
            }
        } else {
            defaultOpenPayManager$connectToBluetoothDevice$1 = new DefaultOpenPayManager$connectToBluetoothDevice$1(this, continuation);
        }
        Object objConnectToBluetoothDevice = defaultOpenPayManager$connectToBluetoothDevice$1.result;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = defaultOpenPayManager$connectToBluetoothDevice$1.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objConnectToBluetoothDevice);
                OpenPaySdk openPaySdk = OpenPaySdk.INSTANCE;
                DeviceDTO deviceDTO = new DeviceDTO(deviceDTOModel.getName(), deviceDTOModel.getAddress());
                defaultOpenPayManager$connectToBluetoothDevice$1.label = 1;
                objConnectToBluetoothDevice = openPaySdk.connectToBluetoothDevice(deviceDTO, secureTerminal, defaultOpenPayManager$connectToBluetoothDevice$1);
                if (objConnectToBluetoothDevice == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objConnectToBluetoothDevice);
            }
            OpenPayResult openPayResult = (OpenPayResult) objConnectToBluetoothDevice;
            if (openPayResult instanceof OpenPayResult.Success) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m5535constructorimpl(((OpenPayResult.Success) openPayResult).getData());
            }
            if (!(openPayResult instanceof OpenPayResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(((OpenPayResult.Failure) openPayResult).getError().getErrorBody())));
        } catch (UninitializedPropertyAccessException unused) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_MESSAGE)));
        } catch (Exception e5) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(e5.getMessage())));
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00bb A[Catch: Exception -> 0x0033, UninitializedPropertyAccessException -> 0x0124, TryCatch #2 {UninitializedPropertyAccessException -> 0x0124, Exception -> 0x0033, blocks: (B:12:0x002e, B:30:0x00b5, B:32:0x00bb, B:33:0x00c8, B:35:0x00cc, B:36:0x00e6, B:37:0x00eb, B:19:0x0046, B:25:0x006a, B:27:0x0070, B:38:0x00ec, B:40:0x00f0, B:41:0x010a, B:42:0x010f, B:22:0x0053), top: B:46:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c8 A[Catch: Exception -> 0x0033, UninitializedPropertyAccessException -> 0x0124, TryCatch #2 {UninitializedPropertyAccessException -> 0x0124, Exception -> 0x0033, blocks: (B:12:0x002e, B:30:0x00b5, B:32:0x00bb, B:33:0x00c8, B:35:0x00cc, B:36:0x00e6, B:37:0x00eb, B:19:0x0046, B:25:0x006a, B:27:0x0070, B:38:0x00ec, B:40:0x00f0, B:41:0x010a, B:42:0x010f, B:22:0x0053), top: B:46:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc A[Catch: Exception -> 0x0033, UninitializedPropertyAccessException -> 0x0124, TryCatch #2 {UninitializedPropertyAccessException -> 0x0124, Exception -> 0x0033, blocks: (B:12:0x002e, B:30:0x00b5, B:32:0x00bb, B:33:0x00c8, B:35:0x00cc, B:36:0x00e6, B:37:0x00eb, B:19:0x0046, B:25:0x006a, B:27:0x0070, B:38:0x00ec, B:40:0x00f0, B:41:0x010a, B:42:0x010f, B:22:0x0053), top: B:46:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e6 A[Catch: Exception -> 0x0033, UninitializedPropertyAccessException -> 0x0124, TryCatch #2 {UninitializedPropertyAccessException -> 0x0124, Exception -> 0x0033, blocks: (B:12:0x002e, B:30:0x00b5, B:32:0x00bb, B:33:0x00c8, B:35:0x00cc, B:36:0x00e6, B:37:0x00eb, B:19:0x0046, B:25:0x006a, B:27:0x0070, B:38:0x00ec, B:40:0x00f0, B:41:0x010a, B:42:0x010f, B:22:0x0053), top: B:46:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.bbva.sdkcatalog.openpay.plugin.OpenPayManager
    @Nullable
    /* JADX INFO: renamed from: createPaymentLink-0E7RQCE, reason: not valid java name */
    public Object mo4947createPaymentLink0E7RQCE(@NotNull SecureTerminal secureTerminal, @NotNull PaymentLinkModel paymentLinkModel, @NotNull Continuation<? super Result<OpenPayPaymentLink>> continuation) {
        DefaultOpenPayManager$createPaymentLink$1 defaultOpenPayManager$createPaymentLink$1;
        SecureTerminal secureTerminal2;
        PaymentLinkModel paymentLinkModel2;
        OpenPayResult openPayResult;
        if (continuation instanceof DefaultOpenPayManager$createPaymentLink$1) {
            defaultOpenPayManager$createPaymentLink$1 = (DefaultOpenPayManager$createPaymentLink$1) continuation;
            int i10 = defaultOpenPayManager$createPaymentLink$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                defaultOpenPayManager$createPaymentLink$1.label = i10 - Integer.MIN_VALUE;
            } else {
                defaultOpenPayManager$createPaymentLink$1 = new DefaultOpenPayManager$createPaymentLink$1(this, continuation);
            }
        } else {
            defaultOpenPayManager$createPaymentLink$1 = new DefaultOpenPayManager$createPaymentLink$1(this, continuation);
        }
        Object paymentPlans = defaultOpenPayManager$createPaymentLink$1.result;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = defaultOpenPayManager$createPaymentLink$1.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    PaymentLinkModel paymentLinkModel3 = (PaymentLinkModel) defaultOpenPayManager$createPaymentLink$1.L$1;
                    SecureTerminal secureTerminal3 = (SecureTerminal) defaultOpenPayManager$createPaymentLink$1.L$0;
                    ResultKt.throwOnFailure(paymentPlans);
                    paymentLinkModel2 = paymentLinkModel3;
                    secureTerminal2 = secureTerminal3;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(paymentPlans);
                }
                openPayResult = (OpenPayResult) paymentPlans;
                if (openPayResult instanceof OpenPayResult.Success) {
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m5535constructorimpl(((OpenPayResult.Success) openPayResult).getData());
                }
                if (openPayResult instanceof OpenPayResult.Failure) {
                    throw new NoWhenBranchMatchedException();
                }
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(((OpenPayResult.Failure) openPayResult).getError().getErrorBody())));
            }
            ResultKt.throwOnFailure(paymentPlans);
            double amount = paymentLinkModel.getAmount();
            PaymentLinkController paymentLink = OpenPaySdk.INSTANCE.getPaymentLink();
            secureTerminal2 = secureTerminal;
            defaultOpenPayManager$createPaymentLink$1.L$0 = secureTerminal2;
            paymentLinkModel2 = paymentLinkModel;
            defaultOpenPayManager$createPaymentLink$1.L$1 = paymentLinkModel2;
            defaultOpenPayManager$createPaymentLink$1.label = 1;
            paymentPlans = paymentLink.getPaymentPlans(amount, defaultOpenPayManager$createPaymentLink$1);
            if (paymentPlans == coroutine_suspended) {
                return coroutine_suspended;
            }
            OpenPayResult openPayResult2 = (OpenPayResult) paymentPlans;
            if (!(openPayResult2 instanceof OpenPayResult.Success)) {
                if (!(openPayResult2 instanceof OpenPayResult.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                Result.Companion companion3 = Result.INSTANCE;
                return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(((OpenPayResult.Failure) openPayResult2).getError().getErrorBody())));
            }
            List list = (List) ((OpenPayResult.Success) openPayResult2).getData();
            OpenPaySdk openPaySdk = OpenPaySdk.INSTANCE;
            PaymentLink paymentLink2 = new PaymentLink(paymentLinkModel2.getAmount(), paymentLinkModel2.getDescription(), paymentLinkModel2.getOrderId(), null, paymentLinkModel2.getIva(), paymentLinkModel2.getRedirectURL(), paymentLinkModel2.getExpirationDate(), paymentLinkModel2.getSendEmail(), paymentLinkModel2.getCustomer(), list, 8, null);
            defaultOpenPayManager$createPaymentLink$1.L$0 = null;
            defaultOpenPayManager$createPaymentLink$1.L$1 = null;
            defaultOpenPayManager$createPaymentLink$1.label = 2;
            paymentPlans = openPaySdk.createPaymentLink(secureTerminal2, paymentLink2, defaultOpenPayManager$createPaymentLink$1);
            if (paymentPlans == coroutine_suspended) {
                return coroutine_suspended;
            }
            openPayResult = (OpenPayResult) paymentPlans;
            if (openPayResult instanceof OpenPayResult.Success) {
                Result.Companion companion4 = Result.INSTANCE;
                return Result.m5535constructorimpl(((OpenPayResult.Success) openPayResult).getData());
            }
            if (openPayResult instanceof OpenPayResult.Failure) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Companion companion5 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(((OpenPayResult.Failure) openPayResult).getError().getErrorBody())));
        } catch (UninitializedPropertyAccessException unused) {
            Result.Companion companion6 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_MESSAGE)));
        } catch (Exception e5) {
            Result.Companion companion7 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(e5.getMessage())));
        }
    }

    @Override // com.bbva.sdkcatalog.openpay.plugin.OpenPayManager
    @Nullable
    /* JADX INFO: renamed from: executeTapOnPhoneCharge-0E7RQCE, reason: not valid java name */
    public Object mo4948executeTapOnPhoneCharge0E7RQCE(@NotNull Activity activity, @NotNull ExecuteChargeParams executeChargeParams, @NotNull Continuation<? super Result<Unit>> continuation) {
        String jws = executeChargeParams.getSecureTerminal().getJws();
        if (jws != null) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new DefaultOpenPayManager$handleCommand$1$1(jws, null), 2, null);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            OpenPaySdk.INSTANCE.getTapOnPhoneController().executeCharge(activity, executeChargeParams.getOrderTerminal());
            return Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (UninitializedPropertyAccessException unused) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_MESSAGE)));
        } catch (Exception e5) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(e5.getMessage())));
        }
    }

    @Override // com.bbva.sdkcatalog.openpay.plugin.OpenPayManager
    @Nullable
    /* JADX INFO: renamed from: executeTapOnPhoneRefundCharge-0E7RQCE, reason: not valid java name */
    public Object mo4949executeTapOnPhoneRefundCharge0E7RQCE(@NotNull Activity activity, @NotNull TapOnPhoneExecuteRefundChargeParams tapOnPhoneExecuteRefundChargeParams, @NotNull Continuation<? super Result<Unit>> continuation) {
        String jws = tapOnPhoneExecuteRefundChargeParams.getSecureRefundTerminal().getJws();
        if (jws != null) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new DefaultOpenPayManager$handleCommand$2$1(jws, null), 2, null);
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            OpenPaySdk.INSTANCE.getTapOnPhoneController().executeRefundCharge(activity, tapOnPhoneExecuteRefundChargeParams.getTransaction());
            return Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (UninitializedPropertyAccessException unused) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_MESSAGE)));
        } catch (Exception e5) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(e5.getMessage())));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.sdkcatalog.openpay.plugin.OpenPayManager
    @Nullable
    /* JADX INFO: renamed from: getPaymentPlans-0E7RQCE, reason: not valid java name */
    public Object mo4950getPaymentPlans0E7RQCE(@NotNull SecureTerminal secureTerminal, double d2, @NotNull Continuation<? super Result<? extends List<Integer>>> continuation) {
        DefaultOpenPayManager$getPaymentPlans$1 defaultOpenPayManager$getPaymentPlans$1;
        if (continuation instanceof DefaultOpenPayManager$getPaymentPlans$1) {
            defaultOpenPayManager$getPaymentPlans$1 = (DefaultOpenPayManager$getPaymentPlans$1) continuation;
            int i10 = defaultOpenPayManager$getPaymentPlans$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                defaultOpenPayManager$getPaymentPlans$1.label = i10 - Integer.MIN_VALUE;
            } else {
                defaultOpenPayManager$getPaymentPlans$1 = new DefaultOpenPayManager$getPaymentPlans$1(this, continuation);
            }
        } else {
            defaultOpenPayManager$getPaymentPlans$1 = new DefaultOpenPayManager$getPaymentPlans$1(this, continuation);
        }
        Object paymentPlans = defaultOpenPayManager$getPaymentPlans$1.result;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = defaultOpenPayManager$getPaymentPlans$1.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(paymentPlans);
                PaymentLinkController paymentLink = OpenPaySdk.INSTANCE.getPaymentLink();
                defaultOpenPayManager$getPaymentPlans$1.label = 1;
                paymentPlans = paymentLink.getPaymentPlans(d2, defaultOpenPayManager$getPaymentPlans$1);
                if (paymentPlans == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(paymentPlans);
            }
            OpenPayResult openPayResult = (OpenPayResult) paymentPlans;
            if (openPayResult instanceof OpenPayResult.Success) {
                return Result.m5535constructorimpl((List) ((OpenPayResult.Success) openPayResult).getData());
            }
            if (!(openPayResult instanceof OpenPayResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(((OpenPayResult.Failure) openPayResult).getError().getErrorBody())));
        } catch (UninitializedPropertyAccessException unused) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_MESSAGE)));
        } catch (Exception e5) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(e5.getMessage())));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006f A[Catch: Exception -> 0x0039, UninitializedPropertyAccessException -> 0x00b4, TryCatch #2 {UninitializedPropertyAccessException -> 0x00b4, Exception -> 0x0039, blocks: (B:3:0x0004, B:11:0x002a, B:13:0x0032, B:25:0x0067, B:27:0x006f, B:28:0x0084, B:29:0x0095, B:30:0x0096, B:31:0x009f, B:16:0x003b, B:18:0x0043, B:19:0x004a, B:21:0x0052, B:22:0x0059, B:24:0x0061), top: B:35:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0084 A[Catch: Exception -> 0x0039, UninitializedPropertyAccessException -> 0x00b4, TryCatch #2 {UninitializedPropertyAccessException -> 0x00b4, Exception -> 0x0039, blocks: (B:3:0x0004, B:11:0x002a, B:13:0x0032, B:25:0x0067, B:27:0x006f, B:28:0x0084, B:29:0x0095, B:30:0x0096, B:31:0x009f, B:16:0x003b, B:18:0x0043, B:19:0x004a, B:21:0x0052, B:22:0x0059, B:24:0x0061), top: B:35:0x0004 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x0084, please report this as an issue */
    @Override // com.bbva.sdkcatalog.openpay.plugin.OpenPayManager
    @Nullable
    /* JADX INFO: renamed from: initOpenPay-yxL6bBk, reason: not valid java name */
    public Object mo4951initOpenPayyxL6bBk(@NotNull Activity activity, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super Result<Unit>> continuation) {
        OpenPayEnvironment openPayEnvironmentCreateQAEnvironment;
        try {
            Result.Companion companion = Result.INSTANCE;
            OpenPaySdk openPaySdk = OpenPaySdk.INSTANCE;
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            int iHashCode = str2.hashCode();
            if (iHashCode == 3600) {
                if (str2.equals("qa")) {
                    openPayEnvironmentCreateQAEnvironment = OpenPayEnvironmentFactory.INSTANCE.createQAEnvironment();
                    if (Intrinsics.areEqual(str, "mxn")) {
                        openPaySdk.initOpenPay(applicationContext, new OpenPayConfiguration(openPayEnvironmentCreateQAEnvironment, OpenPayCountryFactory.INSTANCE.createMexico(), OpenPayIntegrator.GLOMO));
                        return Result.m5535constructorimpl(Unit.INSTANCE);
                    }
                    throw new IllegalArgumentException("Invalid country: " + str);
                }
                throw new IllegalArgumentException("Invalid environment: ".concat(str2));
            }
            if (iHashCode == 99349) {
                if (str2.equals("dev")) {
                    openPayEnvironmentCreateQAEnvironment = OpenPayEnvironmentFactory.INSTANCE.createDevelopmentEnvironment();
                    if (Intrinsics.areEqual(str, "mxn")) {
                        openPaySdk.initOpenPay(applicationContext, new OpenPayConfiguration(openPayEnvironmentCreateQAEnvironment, OpenPayCountryFactory.INSTANCE.createMexico(), OpenPayIntegrator.GLOMO));
                        return Result.m5535constructorimpl(Unit.INSTANCE);
                    }
                    throw new IllegalArgumentException("Invalid country: " + str);
                }
                throw new IllegalArgumentException("Invalid environment: ".concat(str2));
            }
            if (iHashCode == 3449687) {
                if (str2.equals("prod")) {
                    openPayEnvironmentCreateQAEnvironment = OpenPayEnvironmentFactory.INSTANCE.createProductionEnvironment();
                    if (Intrinsics.areEqual(str, "mxn")) {
                        openPaySdk.initOpenPay(applicationContext, new OpenPayConfiguration(openPayEnvironmentCreateQAEnvironment, OpenPayCountryFactory.INSTANCE.createMexico(), OpenPayIntegrator.GLOMO));
                        return Result.m5535constructorimpl(Unit.INSTANCE);
                    }
                    throw new IllegalArgumentException("Invalid country: " + str);
                }
                throw new IllegalArgumentException("Invalid environment: ".concat(str2));
            }
            if (iHashCode == 1865400007 && str2.equals("sandbox")) {
                openPayEnvironmentCreateQAEnvironment = OpenPayEnvironmentFactory.INSTANCE.createSandboxEnvironment();
                if (Intrinsics.areEqual(str, "mxn")) {
                    openPaySdk.initOpenPay(applicationContext, new OpenPayConfiguration(openPayEnvironmentCreateQAEnvironment, OpenPayCountryFactory.INSTANCE.createMexico(), OpenPayIntegrator.GLOMO));
                    return Result.m5535constructorimpl(Unit.INSTANCE);
                }
                throw new IllegalArgumentException("Invalid country: " + str);
            }
            throw new IllegalArgumentException("Invalid environment: ".concat(str2));
        } catch (UninitializedPropertyAccessException unused) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_MESSAGE)));
        } catch (Exception e5) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(e5.getMessage())));
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009b A[Catch: Exception -> 0x003c, UninitializedPropertyAccessException -> 0x01ed, TryCatch #2 {UninitializedPropertyAccessException -> 0x01ed, Exception -> 0x003c, blocks: (B:13:0x0037, B:42:0x00c1, B:44:0x00c7, B:46:0x00da, B:47:0x00ed, B:48:0x00fb, B:50:0x00ff, B:51:0x011a, B:52:0x011f, B:19:0x0047, B:37:0x00ac, B:39:0x00b2, B:53:0x0120, B:55:0x0124, B:57:0x0133, B:58:0x0144, B:60:0x014c, B:61:0x015d, B:62:0x0178, B:63:0x017d, B:20:0x004b, B:30:0x008b, B:32:0x0097, B:34:0x009b, B:64:0x017e, B:66:0x0182, B:68:0x0191, B:69:0x01a1, B:71:0x01a9, B:72:0x01b9, B:73:0x01d3, B:74:0x01d8, B:25:0x0069, B:27:0x0071, B:31:0x008e), top: B:78:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b2 A[Catch: Exception -> 0x003c, UninitializedPropertyAccessException -> 0x01ed, TryCatch #2 {UninitializedPropertyAccessException -> 0x01ed, Exception -> 0x003c, blocks: (B:13:0x0037, B:42:0x00c1, B:44:0x00c7, B:46:0x00da, B:47:0x00ed, B:48:0x00fb, B:50:0x00ff, B:51:0x011a, B:52:0x011f, B:19:0x0047, B:37:0x00ac, B:39:0x00b2, B:53:0x0120, B:55:0x0124, B:57:0x0133, B:58:0x0144, B:60:0x014c, B:61:0x015d, B:62:0x0178, B:63:0x017d, B:20:0x004b, B:30:0x008b, B:32:0x0097, B:34:0x009b, B:64:0x017e, B:66:0x0182, B:68:0x0191, B:69:0x01a1, B:71:0x01a9, B:72:0x01b9, B:73:0x01d3, B:74:0x01d8, B:25:0x0069, B:27:0x0071, B:31:0x008e), top: B:78:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c7 A[Catch: Exception -> 0x003c, UninitializedPropertyAccessException -> 0x01ed, TryCatch #2 {UninitializedPropertyAccessException -> 0x01ed, Exception -> 0x003c, blocks: (B:13:0x0037, B:42:0x00c1, B:44:0x00c7, B:46:0x00da, B:47:0x00ed, B:48:0x00fb, B:50:0x00ff, B:51:0x011a, B:52:0x011f, B:19:0x0047, B:37:0x00ac, B:39:0x00b2, B:53:0x0120, B:55:0x0124, B:57:0x0133, B:58:0x0144, B:60:0x014c, B:61:0x015d, B:62:0x0178, B:63:0x017d, B:20:0x004b, B:30:0x008b, B:32:0x0097, B:34:0x009b, B:64:0x017e, B:66:0x0182, B:68:0x0191, B:69:0x01a1, B:71:0x01a9, B:72:0x01b9, B:73:0x01d3, B:74:0x01d8, B:25:0x0069, B:27:0x0071, B:31:0x008e), top: B:78:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00da A[Catch: Exception -> 0x003c, UninitializedPropertyAccessException -> 0x01ed, TryCatch #2 {UninitializedPropertyAccessException -> 0x01ed, Exception -> 0x003c, blocks: (B:13:0x0037, B:42:0x00c1, B:44:0x00c7, B:46:0x00da, B:47:0x00ed, B:48:0x00fb, B:50:0x00ff, B:51:0x011a, B:52:0x011f, B:19:0x0047, B:37:0x00ac, B:39:0x00b2, B:53:0x0120, B:55:0x0124, B:57:0x0133, B:58:0x0144, B:60:0x014c, B:61:0x015d, B:62:0x0178, B:63:0x017d, B:20:0x004b, B:30:0x008b, B:32:0x0097, B:34:0x009b, B:64:0x017e, B:66:0x0182, B:68:0x0191, B:69:0x01a1, B:71:0x01a9, B:72:0x01b9, B:73:0x01d3, B:74:0x01d8, B:25:0x0069, B:27:0x0071, B:31:0x008e), top: B:78:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ed A[Catch: Exception -> 0x003c, UninitializedPropertyAccessException -> 0x01ed, TryCatch #2 {UninitializedPropertyAccessException -> 0x01ed, Exception -> 0x003c, blocks: (B:13:0x0037, B:42:0x00c1, B:44:0x00c7, B:46:0x00da, B:47:0x00ed, B:48:0x00fb, B:50:0x00ff, B:51:0x011a, B:52:0x011f, B:19:0x0047, B:37:0x00ac, B:39:0x00b2, B:53:0x0120, B:55:0x0124, B:57:0x0133, B:58:0x0144, B:60:0x014c, B:61:0x015d, B:62:0x0178, B:63:0x017d, B:20:0x004b, B:30:0x008b, B:32:0x0097, B:34:0x009b, B:64:0x017e, B:66:0x0182, B:68:0x0191, B:69:0x01a1, B:71:0x01a9, B:72:0x01b9, B:73:0x01d3, B:74:0x01d8, B:25:0x0069, B:27:0x0071, B:31:0x008e), top: B:78:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00fb A[Catch: Exception -> 0x003c, UninitializedPropertyAccessException -> 0x01ed, TryCatch #2 {UninitializedPropertyAccessException -> 0x01ed, Exception -> 0x003c, blocks: (B:13:0x0037, B:42:0x00c1, B:44:0x00c7, B:46:0x00da, B:47:0x00ed, B:48:0x00fb, B:50:0x00ff, B:51:0x011a, B:52:0x011f, B:19:0x0047, B:37:0x00ac, B:39:0x00b2, B:53:0x0120, B:55:0x0124, B:57:0x0133, B:58:0x0144, B:60:0x014c, B:61:0x015d, B:62:0x0178, B:63:0x017d, B:20:0x004b, B:30:0x008b, B:32:0x0097, B:34:0x009b, B:64:0x017e, B:66:0x0182, B:68:0x0191, B:69:0x01a1, B:71:0x01a9, B:72:0x01b9, B:73:0x01d3, B:74:0x01d8, B:25:0x0069, B:27:0x0071, B:31:0x008e), top: B:78:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ff A[Catch: Exception -> 0x003c, UninitializedPropertyAccessException -> 0x01ed, TryCatch #2 {UninitializedPropertyAccessException -> 0x01ed, Exception -> 0x003c, blocks: (B:13:0x0037, B:42:0x00c1, B:44:0x00c7, B:46:0x00da, B:47:0x00ed, B:48:0x00fb, B:50:0x00ff, B:51:0x011a, B:52:0x011f, B:19:0x0047, B:37:0x00ac, B:39:0x00b2, B:53:0x0120, B:55:0x0124, B:57:0x0133, B:58:0x0144, B:60:0x014c, B:61:0x015d, B:62:0x0178, B:63:0x017d, B:20:0x004b, B:30:0x008b, B:32:0x0097, B:34:0x009b, B:64:0x017e, B:66:0x0182, B:68:0x0191, B:69:0x01a1, B:71:0x01a9, B:72:0x01b9, B:73:0x01d3, B:74:0x01d8, B:25:0x0069, B:27:0x0071, B:31:0x008e), top: B:78:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:51:0x011a A[Catch: Exception -> 0x003c, UninitializedPropertyAccessException -> 0x01ed, TryCatch #2 {UninitializedPropertyAccessException -> 0x01ed, Exception -> 0x003c, blocks: (B:13:0x0037, B:42:0x00c1, B:44:0x00c7, B:46:0x00da, B:47:0x00ed, B:48:0x00fb, B:50:0x00ff, B:51:0x011a, B:52:0x011f, B:19:0x0047, B:37:0x00ac, B:39:0x00b2, B:53:0x0120, B:55:0x0124, B:57:0x0133, B:58:0x0144, B:60:0x014c, B:61:0x015d, B:62:0x0178, B:63:0x017d, B:20:0x004b, B:30:0x008b, B:32:0x0097, B:34:0x009b, B:64:0x017e, B:66:0x0182, B:68:0x0191, B:69:0x01a1, B:71:0x01a9, B:72:0x01b9, B:73:0x01d3, B:74:0x01d8, B:25:0x0069, B:27:0x0071, B:31:0x008e), top: B:78:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0120 A[Catch: Exception -> 0x003c, UninitializedPropertyAccessException -> 0x01ed, TryCatch #2 {UninitializedPropertyAccessException -> 0x01ed, Exception -> 0x003c, blocks: (B:13:0x0037, B:42:0x00c1, B:44:0x00c7, B:46:0x00da, B:47:0x00ed, B:48:0x00fb, B:50:0x00ff, B:51:0x011a, B:52:0x011f, B:19:0x0047, B:37:0x00ac, B:39:0x00b2, B:53:0x0120, B:55:0x0124, B:57:0x0133, B:58:0x0144, B:60:0x014c, B:61:0x015d, B:62:0x0178, B:63:0x017d, B:20:0x004b, B:30:0x008b, B:32:0x0097, B:34:0x009b, B:64:0x017e, B:66:0x0182, B:68:0x0191, B:69:0x01a1, B:71:0x01a9, B:72:0x01b9, B:73:0x01d3, B:74:0x01d8, B:25:0x0069, B:27:0x0071, B:31:0x008e), top: B:78:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0124 A[Catch: Exception -> 0x003c, UninitializedPropertyAccessException -> 0x01ed, TryCatch #2 {UninitializedPropertyAccessException -> 0x01ed, Exception -> 0x003c, blocks: (B:13:0x0037, B:42:0x00c1, B:44:0x00c7, B:46:0x00da, B:47:0x00ed, B:48:0x00fb, B:50:0x00ff, B:51:0x011a, B:52:0x011f, B:19:0x0047, B:37:0x00ac, B:39:0x00b2, B:53:0x0120, B:55:0x0124, B:57:0x0133, B:58:0x0144, B:60:0x014c, B:61:0x015d, B:62:0x0178, B:63:0x017d, B:20:0x004b, B:30:0x008b, B:32:0x0097, B:34:0x009b, B:64:0x017e, B:66:0x0182, B:68:0x0191, B:69:0x01a1, B:71:0x01a9, B:72:0x01b9, B:73:0x01d3, B:74:0x01d8, B:25:0x0069, B:27:0x0071, B:31:0x008e), top: B:78:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0133 A[Catch: Exception -> 0x003c, UninitializedPropertyAccessException -> 0x01ed, TryCatch #2 {UninitializedPropertyAccessException -> 0x01ed, Exception -> 0x003c, blocks: (B:13:0x0037, B:42:0x00c1, B:44:0x00c7, B:46:0x00da, B:47:0x00ed, B:48:0x00fb, B:50:0x00ff, B:51:0x011a, B:52:0x011f, B:19:0x0047, B:37:0x00ac, B:39:0x00b2, B:53:0x0120, B:55:0x0124, B:57:0x0133, B:58:0x0144, B:60:0x014c, B:61:0x015d, B:62:0x0178, B:63:0x017d, B:20:0x004b, B:30:0x008b, B:32:0x0097, B:34:0x009b, B:64:0x017e, B:66:0x0182, B:68:0x0191, B:69:0x01a1, B:71:0x01a9, B:72:0x01b9, B:73:0x01d3, B:74:0x01d8, B:25:0x0069, B:27:0x0071, B:31:0x008e), top: B:78:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0144 A[Catch: Exception -> 0x003c, UninitializedPropertyAccessException -> 0x01ed, TryCatch #2 {UninitializedPropertyAccessException -> 0x01ed, Exception -> 0x003c, blocks: (B:13:0x0037, B:42:0x00c1, B:44:0x00c7, B:46:0x00da, B:47:0x00ed, B:48:0x00fb, B:50:0x00ff, B:51:0x011a, B:52:0x011f, B:19:0x0047, B:37:0x00ac, B:39:0x00b2, B:53:0x0120, B:55:0x0124, B:57:0x0133, B:58:0x0144, B:60:0x014c, B:61:0x015d, B:62:0x0178, B:63:0x017d, B:20:0x004b, B:30:0x008b, B:32:0x0097, B:34:0x009b, B:64:0x017e, B:66:0x0182, B:68:0x0191, B:69:0x01a1, B:71:0x01a9, B:72:0x01b9, B:73:0x01d3, B:74:0x01d8, B:25:0x0069, B:27:0x0071, B:31:0x008e), top: B:78:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:60:0x014c A[Catch: Exception -> 0x003c, UninitializedPropertyAccessException -> 0x01ed, TryCatch #2 {UninitializedPropertyAccessException -> 0x01ed, Exception -> 0x003c, blocks: (B:13:0x0037, B:42:0x00c1, B:44:0x00c7, B:46:0x00da, B:47:0x00ed, B:48:0x00fb, B:50:0x00ff, B:51:0x011a, B:52:0x011f, B:19:0x0047, B:37:0x00ac, B:39:0x00b2, B:53:0x0120, B:55:0x0124, B:57:0x0133, B:58:0x0144, B:60:0x014c, B:61:0x015d, B:62:0x0178, B:63:0x017d, B:20:0x004b, B:30:0x008b, B:32:0x0097, B:34:0x009b, B:64:0x017e, B:66:0x0182, B:68:0x0191, B:69:0x01a1, B:71:0x01a9, B:72:0x01b9, B:73:0x01d3, B:74:0x01d8, B:25:0x0069, B:27:0x0071, B:31:0x008e), top: B:78:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:61:0x015d A[Catch: Exception -> 0x003c, UninitializedPropertyAccessException -> 0x01ed, TryCatch #2 {UninitializedPropertyAccessException -> 0x01ed, Exception -> 0x003c, blocks: (B:13:0x0037, B:42:0x00c1, B:44:0x00c7, B:46:0x00da, B:47:0x00ed, B:48:0x00fb, B:50:0x00ff, B:51:0x011a, B:52:0x011f, B:19:0x0047, B:37:0x00ac, B:39:0x00b2, B:53:0x0120, B:55:0x0124, B:57:0x0133, B:58:0x0144, B:60:0x014c, B:61:0x015d, B:62:0x0178, B:63:0x017d, B:20:0x004b, B:30:0x008b, B:32:0x0097, B:34:0x009b, B:64:0x017e, B:66:0x0182, B:68:0x0191, B:69:0x01a1, B:71:0x01a9, B:72:0x01b9, B:73:0x01d3, B:74:0x01d8, B:25:0x0069, B:27:0x0071, B:31:0x008e), top: B:78:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0178 A[Catch: Exception -> 0x003c, UninitializedPropertyAccessException -> 0x01ed, TryCatch #2 {UninitializedPropertyAccessException -> 0x01ed, Exception -> 0x003c, blocks: (B:13:0x0037, B:42:0x00c1, B:44:0x00c7, B:46:0x00da, B:47:0x00ed, B:48:0x00fb, B:50:0x00ff, B:51:0x011a, B:52:0x011f, B:19:0x0047, B:37:0x00ac, B:39:0x00b2, B:53:0x0120, B:55:0x0124, B:57:0x0133, B:58:0x0144, B:60:0x014c, B:61:0x015d, B:62:0x0178, B:63:0x017d, B:20:0x004b, B:30:0x008b, B:32:0x0097, B:34:0x009b, B:64:0x017e, B:66:0x0182, B:68:0x0191, B:69:0x01a1, B:71:0x01a9, B:72:0x01b9, B:73:0x01d3, B:74:0x01d8, B:25:0x0069, B:27:0x0071, B:31:0x008e), top: B:78:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:64:0x017e A[Catch: Exception -> 0x003c, UninitializedPropertyAccessException -> 0x01ed, TryCatch #2 {UninitializedPropertyAccessException -> 0x01ed, Exception -> 0x003c, blocks: (B:13:0x0037, B:42:0x00c1, B:44:0x00c7, B:46:0x00da, B:47:0x00ed, B:48:0x00fb, B:50:0x00ff, B:51:0x011a, B:52:0x011f, B:19:0x0047, B:37:0x00ac, B:39:0x00b2, B:53:0x0120, B:55:0x0124, B:57:0x0133, B:58:0x0144, B:60:0x014c, B:61:0x015d, B:62:0x0178, B:63:0x017d, B:20:0x004b, B:30:0x008b, B:32:0x0097, B:34:0x009b, B:64:0x017e, B:66:0x0182, B:68:0x0191, B:69:0x01a1, B:71:0x01a9, B:72:0x01b9, B:73:0x01d3, B:74:0x01d8, B:25:0x0069, B:27:0x0071, B:31:0x008e), top: B:78:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0182 A[Catch: Exception -> 0x003c, UninitializedPropertyAccessException -> 0x01ed, TryCatch #2 {UninitializedPropertyAccessException -> 0x01ed, Exception -> 0x003c, blocks: (B:13:0x0037, B:42:0x00c1, B:44:0x00c7, B:46:0x00da, B:47:0x00ed, B:48:0x00fb, B:50:0x00ff, B:51:0x011a, B:52:0x011f, B:19:0x0047, B:37:0x00ac, B:39:0x00b2, B:53:0x0120, B:55:0x0124, B:57:0x0133, B:58:0x0144, B:60:0x014c, B:61:0x015d, B:62:0x0178, B:63:0x017d, B:20:0x004b, B:30:0x008b, B:32:0x0097, B:34:0x009b, B:64:0x017e, B:66:0x0182, B:68:0x0191, B:69:0x01a1, B:71:0x01a9, B:72:0x01b9, B:73:0x01d3, B:74:0x01d8, B:25:0x0069, B:27:0x0071, B:31:0x008e), top: B:78:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0191 A[Catch: Exception -> 0x003c, UninitializedPropertyAccessException -> 0x01ed, TryCatch #2 {UninitializedPropertyAccessException -> 0x01ed, Exception -> 0x003c, blocks: (B:13:0x0037, B:42:0x00c1, B:44:0x00c7, B:46:0x00da, B:47:0x00ed, B:48:0x00fb, B:50:0x00ff, B:51:0x011a, B:52:0x011f, B:19:0x0047, B:37:0x00ac, B:39:0x00b2, B:53:0x0120, B:55:0x0124, B:57:0x0133, B:58:0x0144, B:60:0x014c, B:61:0x015d, B:62:0x0178, B:63:0x017d, B:20:0x004b, B:30:0x008b, B:32:0x0097, B:34:0x009b, B:64:0x017e, B:66:0x0182, B:68:0x0191, B:69:0x01a1, B:71:0x01a9, B:72:0x01b9, B:73:0x01d3, B:74:0x01d8, B:25:0x0069, B:27:0x0071, B:31:0x008e), top: B:78:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01a1 A[Catch: Exception -> 0x003c, UninitializedPropertyAccessException -> 0x01ed, TryCatch #2 {UninitializedPropertyAccessException -> 0x01ed, Exception -> 0x003c, blocks: (B:13:0x0037, B:42:0x00c1, B:44:0x00c7, B:46:0x00da, B:47:0x00ed, B:48:0x00fb, B:50:0x00ff, B:51:0x011a, B:52:0x011f, B:19:0x0047, B:37:0x00ac, B:39:0x00b2, B:53:0x0120, B:55:0x0124, B:57:0x0133, B:58:0x0144, B:60:0x014c, B:61:0x015d, B:62:0x0178, B:63:0x017d, B:20:0x004b, B:30:0x008b, B:32:0x0097, B:34:0x009b, B:64:0x017e, B:66:0x0182, B:68:0x0191, B:69:0x01a1, B:71:0x01a9, B:72:0x01b9, B:73:0x01d3, B:74:0x01d8, B:25:0x0069, B:27:0x0071, B:31:0x008e), top: B:78:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01a9 A[Catch: Exception -> 0x003c, UninitializedPropertyAccessException -> 0x01ed, TryCatch #2 {UninitializedPropertyAccessException -> 0x01ed, Exception -> 0x003c, blocks: (B:13:0x0037, B:42:0x00c1, B:44:0x00c7, B:46:0x00da, B:47:0x00ed, B:48:0x00fb, B:50:0x00ff, B:51:0x011a, B:52:0x011f, B:19:0x0047, B:37:0x00ac, B:39:0x00b2, B:53:0x0120, B:55:0x0124, B:57:0x0133, B:58:0x0144, B:60:0x014c, B:61:0x015d, B:62:0x0178, B:63:0x017d, B:20:0x004b, B:30:0x008b, B:32:0x0097, B:34:0x009b, B:64:0x017e, B:66:0x0182, B:68:0x0191, B:69:0x01a1, B:71:0x01a9, B:72:0x01b9, B:73:0x01d3, B:74:0x01d8, B:25:0x0069, B:27:0x0071, B:31:0x008e), top: B:78:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01b9 A[Catch: Exception -> 0x003c, UninitializedPropertyAccessException -> 0x01ed, TryCatch #2 {UninitializedPropertyAccessException -> 0x01ed, Exception -> 0x003c, blocks: (B:13:0x0037, B:42:0x00c1, B:44:0x00c7, B:46:0x00da, B:47:0x00ed, B:48:0x00fb, B:50:0x00ff, B:51:0x011a, B:52:0x011f, B:19:0x0047, B:37:0x00ac, B:39:0x00b2, B:53:0x0120, B:55:0x0124, B:57:0x0133, B:58:0x0144, B:60:0x014c, B:61:0x015d, B:62:0x0178, B:63:0x017d, B:20:0x004b, B:30:0x008b, B:32:0x0097, B:34:0x009b, B:64:0x017e, B:66:0x0182, B:68:0x0191, B:69:0x01a1, B:71:0x01a9, B:72:0x01b9, B:73:0x01d3, B:74:0x01d8, B:25:0x0069, B:27:0x0071, B:31:0x008e), top: B:78:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01d3 A[Catch: Exception -> 0x003c, UninitializedPropertyAccessException -> 0x01ed, TryCatch #2 {UninitializedPropertyAccessException -> 0x01ed, Exception -> 0x003c, blocks: (B:13:0x0037, B:42:0x00c1, B:44:0x00c7, B:46:0x00da, B:47:0x00ed, B:48:0x00fb, B:50:0x00ff, B:51:0x011a, B:52:0x011f, B:19:0x0047, B:37:0x00ac, B:39:0x00b2, B:53:0x0120, B:55:0x0124, B:57:0x0133, B:58:0x0144, B:60:0x014c, B:61:0x015d, B:62:0x0178, B:63:0x017d, B:20:0x004b, B:30:0x008b, B:32:0x0097, B:34:0x009b, B:64:0x017e, B:66:0x0182, B:68:0x0191, B:69:0x01a1, B:71:0x01a9, B:72:0x01b9, B:73:0x01d3, B:74:0x01d8, B:25:0x0069, B:27:0x0071, B:31:0x008e), top: B:78:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // com.bbva.sdkcatalog.openpay.plugin.OpenPayManager
    @Nullable
    /* JADX INFO: renamed from: initTapOnPhone-0E7RQCE, reason: not valid java name */
    public Object mo4952initTapOnPhone0E7RQCE(@NotNull Activity activity, @NotNull String str, @NotNull Continuation<? super Result<? extends OpenPayDeviceNFCStatus>> continuation) {
        DefaultOpenPayManager$initTapOnPhone$1 defaultOpenPayManager$initTapOnPhone$1;
        Object success;
        OpenPayError error;
        OpenPayResult openPayResult;
        OpenPayError error2;
        OpenPayResult openPayResult2;
        if (continuation instanceof DefaultOpenPayManager$initTapOnPhone$1) {
            defaultOpenPayManager$initTapOnPhone$1 = (DefaultOpenPayManager$initTapOnPhone$1) continuation;
            int i10 = defaultOpenPayManager$initTapOnPhone$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                defaultOpenPayManager$initTapOnPhone$1.label = i10 - Integer.MIN_VALUE;
            } else {
                defaultOpenPayManager$initTapOnPhone$1 = new DefaultOpenPayManager$initTapOnPhone$1(this, continuation);
            }
        } else {
            defaultOpenPayManager$initTapOnPhone$1 = new DefaultOpenPayManager$initTapOnPhone$1(this, continuation);
        }
        Object objCreatedTsdkManualInitializer = defaultOpenPayManager$initTapOnPhone$1.result;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = defaultOpenPayManager$initTapOnPhone$1.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(objCreatedTsdkManualInitializer);
                } else if (i11 == 2) {
                    ResultKt.throwOnFailure(objCreatedTsdkManualInitializer);
                    openPayResult = (OpenPayResult) objCreatedTsdkManualInitializer;
                    if (!(openPayResult instanceof OpenPayResult.Success)) {
                        if (!(openPayResult instanceof OpenPayResult.Failure)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        error2 = ((OpenPayResult.Failure) openPayResult).getError();
                        if (Intrinsics.areEqual(error2, OpenPayError.NotImplemented.INSTANCE)) {
                            Result.Companion companion = Result.INSTANCE;
                            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_TAP_ON_PHONE_NOT_IMPLEMENTED)));
                        }
                        if (Intrinsics.areEqual(error2, OpenPayError.UnsupportedVersion.INSTANCE)) {
                            Result.Companion companion2 = Result.INSTANCE;
                            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_TAP_ON_PHONE_UNSUPPORTED)));
                        }
                        Result.Companion companion3 = Result.INSTANCE;
                        return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(((OpenPayResult.Failure) openPayResult).getError().getErrorBody())));
                    }
                    TapOnPhoneController tapOnPhoneController = OpenPaySdk.INSTANCE.getTapOnPhoneController();
                    defaultOpenPayManager$initTapOnPhone$1.label = 3;
                    objCreatedTsdkManualInitializer = tapOnPhoneController.initTapOnPhone(defaultOpenPayManager$initTapOnPhone$1);
                    if (objCreatedTsdkManualInitializer == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objCreatedTsdkManualInitializer);
                }
                openPayResult2 = (OpenPayResult) objCreatedTsdkManualInitializer;
                if (!(openPayResult2 instanceof OpenPayResult.Success)) {
                    if (!(openPayResult2 instanceof OpenPayResult.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Result.Companion companion4 = Result.INSTANCE;
                    return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(((OpenPayResult.Failure) openPayResult2).getError().getErrorBody())));
                }
                if (WhenMappings.$EnumSwitchMapping$0[((OpenPayDeviceNFCStatus) ((OpenPayResult.Success) openPayResult2).getData()).ordinal()] == 1) {
                    Result.Companion companion5 = Result.INSTANCE;
                    return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_TAP_ON_PHONE_NO_NFC)));
                }
                Result.Companion companion6 = Result.INSTANCE;
                return Result.m5535constructorimpl(((OpenPayResult.Success) openPayResult2).getData());
            }
            ResultKt.throwOnFailure(objCreatedTsdkManualInitializer);
            if (str != null) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new DefaultOpenPayManager$handleCommand$1$1(str, null), 2, null);
            }
            if (INSTANCE.isTsdkManualInitializerCreated$openpay_plugin_release()) {
                success = new OpenPayResult.Success(Boxing.boxBoolean(true));
            } else {
                Context applicationContext = activity.getApplicationContext();
                Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                TapOnPhoneController tapOnPhoneController2 = OpenPaySdk.INSTANCE.getTapOnPhoneController();
                defaultOpenPayManager$initTapOnPhone$1.label = 1;
                objCreatedTsdkManualInitializer = tapOnPhoneController2.createdTsdkManualInitializer((Application) applicationContext, defaultOpenPayManager$initTapOnPhone$1);
                if (objCreatedTsdkManualInitializer == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (success instanceof OpenPayResult.Success) {
                if (success instanceof OpenPayResult.Failure) {
                    throw new NoWhenBranchMatchedException();
                }
                error = ((OpenPayResult.Failure) success).getError();
                if (Intrinsics.areEqual(error, OpenPayError.NotImplemented.INSTANCE)) {
                    Result.Companion companion7 = Result.INSTANCE;
                    return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_TAP_ON_PHONE_NOT_IMPLEMENTED)));
                }
                if (Intrinsics.areEqual(error, OpenPayError.UnsupportedVersion.INSTANCE)) {
                    Result.Companion companion8 = Result.INSTANCE;
                    return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_TAP_ON_PHONE_UNSUPPORTED)));
                }
                Result.Companion companion9 = Result.INSTANCE;
                return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(((OpenPayResult.Failure) success).getError().getErrorBody())));
            }
            isTsdkManualInitializerCreated = true;
            TapOnPhoneController tapOnPhoneController3 = OpenPaySdk.INSTANCE.getTapOnPhoneController();
            defaultOpenPayManager$initTapOnPhone$1.label = 2;
            objCreatedTsdkManualInitializer = tapOnPhoneController3.initTsdkManualInitializer(defaultOpenPayManager$initTapOnPhone$1);
            if (objCreatedTsdkManualInitializer == coroutine_suspended) {
                return coroutine_suspended;
            }
            openPayResult = (OpenPayResult) objCreatedTsdkManualInitializer;
            if (!(openPayResult instanceof OpenPayResult.Success)) {
                if (!(openPayResult instanceof OpenPayResult.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                error2 = ((OpenPayResult.Failure) openPayResult).getError();
                if (Intrinsics.areEqual(error2, OpenPayError.NotImplemented.INSTANCE)) {
                    Result.Companion companion10 = Result.INSTANCE;
                    return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_TAP_ON_PHONE_NOT_IMPLEMENTED)));
                }
                if (Intrinsics.areEqual(error2, OpenPayError.UnsupportedVersion.INSTANCE)) {
                    Result.Companion companion11 = Result.INSTANCE;
                    return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_TAP_ON_PHONE_UNSUPPORTED)));
                }
                Result.Companion companion12 = Result.INSTANCE;
                return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(((OpenPayResult.Failure) openPayResult).getError().getErrorBody())));
            }
            TapOnPhoneController tapOnPhoneController4 = OpenPaySdk.INSTANCE.getTapOnPhoneController();
            defaultOpenPayManager$initTapOnPhone$1.label = 3;
            objCreatedTsdkManualInitializer = tapOnPhoneController4.initTapOnPhone(defaultOpenPayManager$initTapOnPhone$1);
            if (objCreatedTsdkManualInitializer == coroutine_suspended) {
                return coroutine_suspended;
            }
            openPayResult2 = (OpenPayResult) objCreatedTsdkManualInitializer;
            if (!(openPayResult2 instanceof OpenPayResult.Success)) {
                if (!(openPayResult2 instanceof OpenPayResult.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                Result.Companion companion13 = Result.INSTANCE;
                return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(((OpenPayResult.Failure) openPayResult2).getError().getErrorBody())));
            }
            if (WhenMappings.$EnumSwitchMapping$0[((OpenPayDeviceNFCStatus) ((OpenPayResult.Success) openPayResult2).getData()).ordinal()] == 1) {
                Result.Companion companion14 = Result.INSTANCE;
                return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_TAP_ON_PHONE_NO_NFC)));
            }
            Result.Companion companion15 = Result.INSTANCE;
            return Result.m5535constructorimpl(((OpenPayResult.Success) openPayResult2).getData());
            success = (OpenPayResult) objCreatedTsdkManualInitializer;
            if (success instanceof OpenPayResult.Success) {
                if (success instanceof OpenPayResult.Failure) {
                    throw new NoWhenBranchMatchedException();
                }
                error = ((OpenPayResult.Failure) success).getError();
                if (Intrinsics.areEqual(error, OpenPayError.NotImplemented.INSTANCE)) {
                    Result.Companion companion16 = Result.INSTANCE;
                    return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_TAP_ON_PHONE_NOT_IMPLEMENTED)));
                }
                if (Intrinsics.areEqual(error, OpenPayError.UnsupportedVersion.INSTANCE)) {
                    Result.Companion companion17 = Result.INSTANCE;
                    return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_TAP_ON_PHONE_UNSUPPORTED)));
                }
                Result.Companion companion18 = Result.INSTANCE;
                return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(((OpenPayResult.Failure) success).getError().getErrorBody())));
            }
            isTsdkManualInitializerCreated = true;
            TapOnPhoneController tapOnPhoneController5 = OpenPaySdk.INSTANCE.getTapOnPhoneController();
            defaultOpenPayManager$initTapOnPhone$1.label = 2;
            objCreatedTsdkManualInitializer = tapOnPhoneController5.initTsdkManualInitializer(defaultOpenPayManager$initTapOnPhone$1);
            if (objCreatedTsdkManualInitializer == coroutine_suspended) {
                return coroutine_suspended;
            }
            openPayResult = (OpenPayResult) objCreatedTsdkManualInitializer;
            if (!(openPayResult instanceof OpenPayResult.Success)) {
                if (!(openPayResult instanceof OpenPayResult.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                error2 = ((OpenPayResult.Failure) openPayResult).getError();
                if (Intrinsics.areEqual(error2, OpenPayError.NotImplemented.INSTANCE)) {
                    Result.Companion companion19 = Result.INSTANCE;
                    return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_TAP_ON_PHONE_NOT_IMPLEMENTED)));
                }
                if (Intrinsics.areEqual(error2, OpenPayError.UnsupportedVersion.INSTANCE)) {
                    Result.Companion companion110 = Result.INSTANCE;
                    return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_TAP_ON_PHONE_UNSUPPORTED)));
                }
                Result.Companion companion111 = Result.INSTANCE;
                return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(((OpenPayResult.Failure) openPayResult).getError().getErrorBody())));
            }
            TapOnPhoneController tapOnPhoneController6 = OpenPaySdk.INSTANCE.getTapOnPhoneController();
            defaultOpenPayManager$initTapOnPhone$1.label = 3;
            objCreatedTsdkManualInitializer = tapOnPhoneController6.initTapOnPhone(defaultOpenPayManager$initTapOnPhone$1);
            if (objCreatedTsdkManualInitializer == coroutine_suspended) {
                return coroutine_suspended;
            }
            openPayResult2 = (OpenPayResult) objCreatedTsdkManualInitializer;
            if (!(openPayResult2 instanceof OpenPayResult.Success)) {
                if (!(openPayResult2 instanceof OpenPayResult.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                Result.Companion companion112 = Result.INSTANCE;
                return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(((OpenPayResult.Failure) openPayResult2).getError().getErrorBody())));
            }
            if (WhenMappings.$EnumSwitchMapping$0[((OpenPayDeviceNFCStatus) ((OpenPayResult.Success) openPayResult2).getData()).ordinal()] == 1) {
                Result.Companion companion113 = Result.INSTANCE;
                return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_TAP_ON_PHONE_NO_NFC)));
            }
            Result.Companion companion114 = Result.INSTANCE;
            return Result.m5535constructorimpl(((OpenPayResult.Success) openPayResult2).getData());
        } catch (UninitializedPropertyAccessException unused) {
            Result.Companion companion20 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_MESSAGE)));
        } catch (Exception e5) {
            Result.Companion companion21 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(e5.getMessage())));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.bbva.sdkcatalog.openpay.plugin.OpenPayManager
    @Nullable
    /* JADX INFO: renamed from: listTransactions-0E7RQCE, reason: not valid java name */
    public Object mo4953listTransactions0E7RQCE(@NotNull SecureTerminal secureTerminal, @NotNull TransactionFilter transactionFilter, @NotNull Continuation<? super Result<? extends List<TransactionDTO>>> continuation) {
        DefaultOpenPayManager$listTransactions$1 defaultOpenPayManager$listTransactions$1;
        if (continuation instanceof DefaultOpenPayManager$listTransactions$1) {
            defaultOpenPayManager$listTransactions$1 = (DefaultOpenPayManager$listTransactions$1) continuation;
            int i10 = defaultOpenPayManager$listTransactions$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                defaultOpenPayManager$listTransactions$1.label = i10 - Integer.MIN_VALUE;
            } else {
                defaultOpenPayManager$listTransactions$1 = new DefaultOpenPayManager$listTransactions$1(this, continuation);
            }
        } else {
            defaultOpenPayManager$listTransactions$1 = new DefaultOpenPayManager$listTransactions$1(this, continuation);
        }
        Object objListTransactions = defaultOpenPayManager$listTransactions$1.result;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = defaultOpenPayManager$listTransactions$1.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objListTransactions);
                OpenPaySdk openPaySdk = OpenPaySdk.INSTANCE;
                String transactionId = transactionFilter.getTransactionId();
                PaymentMethod paymentMethod = transactionFilter.getPaymentMethod();
                Iterable status = transactionFilter.getStatus();
                if (status == null) {
                    status = CollectionsKt__CollectionsKt.emptyList();
                }
                TransactionFilter transactionFilter2 = new TransactionFilter(transactionId, paymentMethod, (ArrayList) CollectionsKt___CollectionsKt.toCollection(status, new ArrayList()), transactionFilter.getLimit(), transactionFilter.getOffset(), transactionFilter.getOperationGte(), transactionFilter.getOperationLte(), transactionFilter.getProductTypes());
                defaultOpenPayManager$listTransactions$1.label = 1;
                objListTransactions = openPaySdk.listTransactions(secureTerminal, transactionFilter2, defaultOpenPayManager$listTransactions$1);
                if (objListTransactions == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objListTransactions);
            }
            OpenPayResult openPayResult = (OpenPayResult) objListTransactions;
            if (openPayResult instanceof OpenPayResult.Success) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m5535constructorimpl(((OpenPayResult.Success) openPayResult).getData());
            }
            if (!(openPayResult instanceof OpenPayResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(((OpenPayResult.Failure) openPayResult).getError().getErrorBody())));
        } catch (UninitializedPropertyAccessException unused) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_MESSAGE)));
        } catch (Exception e5) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(e5.getMessage())));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.sdkcatalog.openpay.plugin.OpenPayManager
    @Nullable
    /* JADX INFO: renamed from: paymentLinkListing-0E7RQCE, reason: not valid java name */
    public Object mo4954paymentLinkListing0E7RQCE(@NotNull SecureTerminal secureTerminal, @NotNull PaymentLinkFilter paymentLinkFilter, @NotNull Continuation<? super Result<? extends List<OpenPayPaymentLink>>> continuation) {
        DefaultOpenPayManager$paymentLinkListing$1 defaultOpenPayManager$paymentLinkListing$1;
        if (continuation instanceof DefaultOpenPayManager$paymentLinkListing$1) {
            defaultOpenPayManager$paymentLinkListing$1 = (DefaultOpenPayManager$paymentLinkListing$1) continuation;
            int i10 = defaultOpenPayManager$paymentLinkListing$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                defaultOpenPayManager$paymentLinkListing$1.label = i10 - Integer.MIN_VALUE;
            } else {
                defaultOpenPayManager$paymentLinkListing$1 = new DefaultOpenPayManager$paymentLinkListing$1(this, continuation);
            }
        } else {
            defaultOpenPayManager$paymentLinkListing$1 = new DefaultOpenPayManager$paymentLinkListing$1(this, continuation);
        }
        Object objPaymentLinkListing = defaultOpenPayManager$paymentLinkListing$1.result;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = defaultOpenPayManager$paymentLinkListing$1.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objPaymentLinkListing);
                OpenPaySdk openPaySdk = OpenPaySdk.INSTANCE;
                PaymentLinkFilter paymentLinkFilter2 = new PaymentLinkFilter(paymentLinkFilter.getStartDate(), paymentLinkFilter.getEndDate(), paymentLinkFilter.getLimit(), paymentLinkFilter.getOffset(), paymentLinkFilter.getStatus());
                defaultOpenPayManager$paymentLinkListing$1.label = 1;
                objPaymentLinkListing = openPaySdk.paymentLinkListing(secureTerminal, paymentLinkFilter2, defaultOpenPayManager$paymentLinkListing$1);
                if (objPaymentLinkListing == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPaymentLinkListing);
            }
            OpenPayResult openPayResult = (OpenPayResult) objPaymentLinkListing;
            if (openPayResult instanceof OpenPayResult.Success) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m5535constructorimpl(((OpenPayResult.Success) openPayResult).getData());
            }
            if (!(openPayResult instanceof OpenPayResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(((OpenPayResult.Failure) openPayResult).getError().getErrorBody())));
        } catch (UninitializedPropertyAccessException unused) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_MESSAGE)));
        } catch (Exception e5) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(e5.getMessage())));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.sdkcatalog.openpay.plugin.OpenPayManager
    @Nullable
    /* JADX INFO: renamed from: refundPaymentLink-0E7RQCE, reason: not valid java name */
    public Object mo4955refundPaymentLink0E7RQCE(@NotNull SecureTerminal secureTerminal, @NotNull String str, @NotNull Continuation<? super Result<TransactionDTO>> continuation) {
        DefaultOpenPayManager$refundPaymentLink$1 defaultOpenPayManager$refundPaymentLink$1;
        if (continuation instanceof DefaultOpenPayManager$refundPaymentLink$1) {
            defaultOpenPayManager$refundPaymentLink$1 = (DefaultOpenPayManager$refundPaymentLink$1) continuation;
            int i10 = defaultOpenPayManager$refundPaymentLink$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                defaultOpenPayManager$refundPaymentLink$1.label = i10 - Integer.MIN_VALUE;
            } else {
                defaultOpenPayManager$refundPaymentLink$1 = new DefaultOpenPayManager$refundPaymentLink$1(this, continuation);
            }
        } else {
            defaultOpenPayManager$refundPaymentLink$1 = new DefaultOpenPayManager$refundPaymentLink$1(this, continuation);
        }
        Object objRefundPaymentLink = defaultOpenPayManager$refundPaymentLink$1.result;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = defaultOpenPayManager$refundPaymentLink$1.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objRefundPaymentLink);
                String jws = secureTerminal.getJws();
                if (jws != null) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new DefaultOpenPayManager$handleCommand$2$1(jws, null), 2, null);
                }
                OpenPaySdk openPaySdk = OpenPaySdk.INSTANCE;
                defaultOpenPayManager$refundPaymentLink$1.label = 1;
                objRefundPaymentLink = openPaySdk.refundPaymentLink(secureTerminal, secureTerminal, str, defaultOpenPayManager$refundPaymentLink$1);
                if (objRefundPaymentLink == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objRefundPaymentLink);
            }
            OpenPayResult openPayResult = (OpenPayResult) objRefundPaymentLink;
            if (openPayResult instanceof OpenPayResult.Success) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m5535constructorimpl(((OpenPayResult.Success) openPayResult).getData());
            }
            if (!(openPayResult instanceof OpenPayResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(((OpenPayResult.Failure) openPayResult).getError().getErrorBody())));
        } catch (UninitializedPropertyAccessException unused) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_MESSAGE)));
        } catch (Exception e5) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(e5.getMessage())));
        }
    }

    @Override // com.bbva.sdkcatalog.openpay.plugin.OpenPayManager
    @Nullable
    /* JADX INFO: renamed from: scanNewDevices-IoAF18A, reason: not valid java name */
    public Object mo4956scanNewDevicesIoAF18A(@NotNull Continuation<? super Result<Boolean>> continuation) {
        try {
            OpenPayResult<String> openPayResultScanNewDevices = OpenPaySdk.INSTANCE.scanNewDevices();
            if (openPayResultScanNewDevices instanceof OpenPayResult.Success) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m5535constructorimpl(Boxing.boxBoolean(true));
            }
            if (!(openPayResultScanNewDevices instanceof OpenPayResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(((OpenPayResult.Failure) openPayResultScanNewDevices).getError().getErrorBody())));
        } catch (UninitializedPropertyAccessException unused) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_MESSAGE)));
        } catch (Exception e5) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(e5.getMessage())));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.sdkcatalog.openpay.plugin.OpenPayManager
    @Nullable
    /* JADX INFO: renamed from: sendVoucher-0E7RQCE, reason: not valid java name */
    public Object mo4957sendVoucher0E7RQCE(@NotNull SecureTerminal secureTerminal, @NotNull SendVoucherRequestDTO sendVoucherRequestDTO, @NotNull Continuation<? super Result<Boolean>> continuation) {
        DefaultOpenPayManager$sendVoucher$1 defaultOpenPayManager$sendVoucher$1;
        if (continuation instanceof DefaultOpenPayManager$sendVoucher$1) {
            defaultOpenPayManager$sendVoucher$1 = (DefaultOpenPayManager$sendVoucher$1) continuation;
            int i10 = defaultOpenPayManager$sendVoucher$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                defaultOpenPayManager$sendVoucher$1.label = i10 - Integer.MIN_VALUE;
            } else {
                defaultOpenPayManager$sendVoucher$1 = new DefaultOpenPayManager$sendVoucher$1(this, continuation);
            }
        } else {
            defaultOpenPayManager$sendVoucher$1 = new DefaultOpenPayManager$sendVoucher$1(this, continuation);
        }
        Object objSendVoucher = defaultOpenPayManager$sendVoucher$1.result;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = defaultOpenPayManager$sendVoucher$1.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objSendVoucher);
                OpenPaySdk openPaySdk = OpenPaySdk.INSTANCE;
                defaultOpenPayManager$sendVoucher$1.label = 1;
                objSendVoucher = openPaySdk.sendVoucher(secureTerminal, sendVoucherRequestDTO, defaultOpenPayManager$sendVoucher$1);
                if (objSendVoucher == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendVoucher);
            }
            OpenPayResult openPayResult = (OpenPayResult) objSendVoucher;
            if (openPayResult instanceof OpenPayResult.Success) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m5535constructorimpl(((OpenPayResult.Success) openPayResult).getData());
            }
            if (!(openPayResult instanceof OpenPayResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(((OpenPayResult.Failure) openPayResult).getError().getErrorBody())));
        } catch (UninitializedPropertyAccessException unused) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_MESSAGE)));
        } catch (Exception e5) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(e5.getMessage())));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.sdkcatalog.openpay.plugin.OpenPayManager
    @Nullable
    /* JADX INFO: renamed from: updatePaymentLink-0E7RQCE, reason: not valid java name */
    public Object mo4958updatePaymentLink0E7RQCE(@NotNull SecureTerminal secureTerminal, @NotNull UpdatePaymentLink updatePaymentLink, @NotNull Continuation<? super Result<OpenPayPaymentLink>> continuation) {
        DefaultOpenPayManager$updatePaymentLink$1 defaultOpenPayManager$updatePaymentLink$1;
        if (continuation instanceof DefaultOpenPayManager$updatePaymentLink$1) {
            defaultOpenPayManager$updatePaymentLink$1 = (DefaultOpenPayManager$updatePaymentLink$1) continuation;
            int i10 = defaultOpenPayManager$updatePaymentLink$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                defaultOpenPayManager$updatePaymentLink$1.label = i10 - Integer.MIN_VALUE;
            } else {
                defaultOpenPayManager$updatePaymentLink$1 = new DefaultOpenPayManager$updatePaymentLink$1(this, continuation);
            }
        } else {
            defaultOpenPayManager$updatePaymentLink$1 = new DefaultOpenPayManager$updatePaymentLink$1(this, continuation);
        }
        Object objUpdatePaymentLink = defaultOpenPayManager$updatePaymentLink$1.result;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = defaultOpenPayManager$updatePaymentLink$1.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objUpdatePaymentLink);
                OpenPaySdk openPaySdk = OpenPaySdk.INSTANCE;
                defaultOpenPayManager$updatePaymentLink$1.label = 1;
                objUpdatePaymentLink = openPaySdk.updatePaymentLink(secureTerminal, updatePaymentLink, defaultOpenPayManager$updatePaymentLink$1);
                if (objUpdatePaymentLink == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUpdatePaymentLink);
            }
            OpenPayResult openPayResult = (OpenPayResult) objUpdatePaymentLink;
            if (openPayResult instanceof OpenPayResult.Success) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m5535constructorimpl(((OpenPayResult.Success) openPayResult).getData());
            }
            if (!(openPayResult instanceof OpenPayResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(((OpenPayResult.Failure) openPayResult).getError().getErrorBody())));
        } catch (UninitializedPropertyAccessException unused) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(ERROR_INIT_MESSAGE)));
        } catch (Exception e5) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m5535constructorimpl(ResultKt.createFailure(new Exception(e5.getMessage())));
        }
    }
}
