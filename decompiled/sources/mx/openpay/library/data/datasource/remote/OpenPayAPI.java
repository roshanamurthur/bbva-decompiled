package mx.openpay.library.data.datasource.remote;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.notifications.constants.PushConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import mx.openpay.library.data.datasource.remote.model.request.EmptyRequestDto;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.CreateChargeRequestDto;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.FirmwareUpdateStatusRequestDto;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.GetMerchantRequestDto;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.RefundChargeRequestDto;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.ReverseRequestDto;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.TerminalCapacityRequestDto;
import mx.openpay.library.data.datasource.remote.model.request.eglobal.TerminalKeysRequestDto;
import mx.openpay.library.data.datasource.remote.model.request.paymentlink.CreatePaymentLinkRequestDto;
import mx.openpay.library.data.datasource.remote.model.request.paymentlink.UpdatePaymentLinkRequestDto;
import mx.openpay.library.data.datasource.remote.model.request.taponphone.RegisterSmartphoneRequestDto;
import mx.openpay.library.data.datasource.remote.model.request.transaction.SendVoucherRequestDto;
import mx.openpay.library.data.datasource.remote.model.response.TransactionResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.BinResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.ChargeResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.MerchantResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.PlanResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.RSAKeyResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.TerminalKeysResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.paymentlink.PaymentLinkResponseDto;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: compiled from: OpenPayAPI.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020\nH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ7\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u00062\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u0011H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u0017H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J+\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u00062\b\b\u0001\u0010\u001c\u001a\u00020\u001dH§@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJe\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040 0\u00032\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0001\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010(J'\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0 0\u00032\b\b\u0001\u0010+\u001a\u00020,H§@ø\u0001\u0000¢\u0006\u0002\u0010-J\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0003H§@ø\u0001\u0000¢\u0006\u0002\u00100J!\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00032\b\b\u0001\u00103\u001a\u000204H§@ø\u0001\u0000¢\u0006\u0002\u00105J+\u00106\u001a\b\u0012\u0004\u0012\u0002070\u00032\b\b\u0001\u00108\u001a\u00020\u00062\b\b\u0001\u00109\u001a\u00020:H§@ø\u0001\u0000¢\u0006\u0002\u0010;J!\u0010<\u001a\b\u0012\u0004\u0012\u0002070\u00032\b\b\u0001\u00109\u001a\u00020:H§@ø\u0001\u0000¢\u0006\u0002\u0010=J!\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u00032\b\b\u0001\u0010@\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u001d\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0 0\u0003H§@ø\u0001\u0000¢\u0006\u0002\u00100J1\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140 0\u00032\b\b\u0001\u0010C\u001a\u00020\u00062\b\b\u0001\u0010D\u001a\u00020\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010EJ\u0087\u0001\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140 0\u00032\n\b\u0001\u0010G\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010H\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0001\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010I\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010D\u001a\u00020\u00062\n\b\u0001\u0010J\u001a\u0004\u0018\u00010\u0006H§@ø\u0001\u0000¢\u0006\u0002\u0010KJ+\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u00062\b\b\u0001\u0010N\u001a\u00020OH§@ø\u0001\u0000¢\u0006\u0002\u0010PJ+\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010R\u001a\u00020SH§@ø\u0001\u0000¢\u0006\u0002\u0010TJ!\u0010U\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010V\u001a\u00020WH§@ø\u0001\u0000¢\u0006\u0002\u0010XJ+\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u00062\b\b\u0001\u0010Z\u001a\u00020[H§@ø\u0001\u0000¢\u0006\u0002\u0010\\J!\u0010]\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010^\u001a\u00020_H§@ø\u0001\u0000¢\u0006\u0002\u0010`J5\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010'\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020bH§@ø\u0001\u0000¢\u0006\u0002\u0010cJ5\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010'\u001a\u00020\u00062\b\b\u0001\u0010R\u001a\u00020SH§@ø\u0001\u0000¢\u0006\u0002\u0010eJ!\u0010f\u001a\b\u0012\u0004\u0012\u00020?0\u00032\b\b\u0001\u0010g\u001a\u00020hH§@ø\u0001\u0000¢\u0006\u0002\u0010i\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006j"}, d2 = {"Lmx/openpay/library/data/datasource/remote/OpenPayAPI;", "", "checkPaymentLink", "Lretrofit2/Response;", "Lmx/openpay/library/data/datasource/remote/model/response/paymentlink/PaymentLinkResponseDto;", "paymentLinkId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentLink", "linkInfo", "Lmx/openpay/library/data/datasource/remote/model/request/paymentlink/CreatePaymentLinkRequestDto;", "(Lmx/openpay/library/data/datasource/remote/model/request/paymentlink/CreatePaymentLinkRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeCharge", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/ChargeResponseDto;", "ptid", "source", "chargeRequestDto", "Lmx/openpay/library/data/datasource/remote/model/request/eglobal/CreateChargeRequestDto;", "(Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/data/datasource/remote/model/request/eglobal/CreateChargeRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeRefundCharge", "Lmx/openpay/library/data/datasource/remote/model/response/TransactionResponseDto;", "transactionId", "refundRequest", "Lmx/openpay/library/data/datasource/remote/model/request/eglobal/RefundChargeRequestDto;", "(Ljava/lang/String;Lmx/openpay/library/data/datasource/remote/model/request/eglobal/RefundChargeRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "firmwareUpdateStatus", "Ljava/lang/Void;", "serial", "firmware", "Lmx/openpay/library/data/datasource/remote/model/request/eglobal/FirmwareUpdateStatusRequestDto;", "(Ljava/lang/String;Lmx/openpay/library/data/datasource/remote/model/request/eglobal/FirmwareUpdateStatusRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllPaymentLinks", "", LogKeysKt.START_DATE, LogKeysKt.END_DATE, "nameOrLastName", "limit", "", TypedValues.CycleType.S_WAVE_OFFSET, "status", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBines", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/BinResponseDto;", "forceUpdate", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFirmware", "Lokhttp3/ResponseBody;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMerchant", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/MerchantResponseDto;", "getMerchantDto", "Lmx/openpay/library/data/datasource/remote/model/request/eglobal/GetMerchantRequestDto;", "(Lmx/openpay/library/data/datasource/remote/model/request/eglobal/GetMerchantRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentPlans", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/PlanResponseDto;", "bin", PushConstants.AMOUNT, "", "(Ljava/lang/String;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPaymentPlansWithoutBin", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRSAKeyBySlot", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/RSAKeyResponseDto;", "slotKey", "getRSAKeys", "getTransaction", "id", "originChannel", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTransactions", "operationGte", "operationLte", "paymentMethod", "productType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializeKeys", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/TerminalKeysResponseDto;", "terminalKeysRequestDto", "Lmx/openpay/library/data/datasource/remote/model/request/eglobal/TerminalKeysRequestDto;", "(Ljava/lang/String;Lmx/openpay/library/data/datasource/remote/model/request/eglobal/TerminalKeysRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refundCharge", "emptyRequest", "Lmx/openpay/library/data/datasource/remote/model/request/EmptyRequestDto;", "(Ljava/lang/String;Lmx/openpay/library/data/datasource/remote/model/request/EmptyRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerSmartphone", "registerSmartphoneRequestDto", "Lmx/openpay/library/data/datasource/remote/model/request/taponphone/RegisterSmartphoneRequestDto;", "(Lmx/openpay/library/data/datasource/remote/model/request/taponphone/RegisterSmartphoneRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reverse", "reverseRequest", "Lmx/openpay/library/data/datasource/remote/model/request/eglobal/ReverseRequestDto;", "(Ljava/lang/String;Lmx/openpay/library/data/datasource/remote/model/request/eglobal/ReverseRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendVoucher", "sendVoucherRequestDto", "Lmx/openpay/library/data/datasource/remote/model/request/transaction/SendVoucherRequestDto;", "(Lmx/openpay/library/data/datasource/remote/model/request/transaction/SendVoucherRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePaymentLink", "Lmx/openpay/library/data/datasource/remote/model/request/paymentlink/UpdatePaymentLinkRequestDto;", "(Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/data/datasource/remote/model/request/paymentlink/UpdatePaymentLinkRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePaymentLinkStatus", "(Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/data/datasource/remote/model/request/EmptyRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateTerminalCapacity", "terminalCapacity", "Lmx/openpay/library/data/datasource/remote/model/request/eglobal/TerminalCapacityRequestDto;", "(Lmx/openpay/library/data/datasource/remote/model/request/eglobal/TerminalCapacityRequestDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface OpenPayAPI {
    @GET("${merchant.id}/checkouts/{paymentLinkId}")
    @Nullable
    Object checkPaymentLink(@Path("paymentLinkId") @NotNull String str, @NotNull Continuation<? super Response<PaymentLinkResponseDto>> continuation);

    @POST("${merchant.id}/checkouts")
    @Nullable
    Object createPaymentLink(@Body @NotNull CreatePaymentLinkRequestDto createPaymentLinkRequestDto, @NotNull Continuation<? super Response<PaymentLinkResponseDto>> continuation);

    @POST("${merchant.id}/terminals/{ptid}/charges")
    @Nullable
    Object executeCharge(@Path("ptid") @NotNull String str, @Nullable @Query("source") String str2, @Body @NotNull CreateChargeRequestDto createChargeRequestDto, @NotNull Continuation<? super Response<ChargeResponseDto>> continuation);

    @POST("${merchant.id}/terminals_with_out_ptid/charges/{transactionId}/refund")
    @Nullable
    Object executeRefundCharge(@Path("transactionId") @NotNull String str, @Body @NotNull RefundChargeRequestDto refundChargeRequestDto, @NotNull Continuation<? super Response<TransactionResponseDto>> continuation);

    @PUT("${merchant.id}/terminals/{serial}/firmware-status-installation")
    @Nullable
    Object firmwareUpdateStatus(@Path("serial") @NotNull String str, @Body @NotNull FirmwareUpdateStatusRequestDto firmwareUpdateStatusRequestDto, @NotNull Continuation<? super Response<Void>> continuation);

    @GET("${merchant.id}/checkouts")
    @Nullable
    Object getAllPaymentLinks(@Nullable @Query(LogKeysKt.START_DATE) String str, @Nullable @Query(LogKeysKt.END_DATE) String str2, @Nullable @Query("nameOrLastName") String str3, @Nullable @Query("limit") Integer num, @Nullable @Query(TypedValues.CycleType.S_WAVE_OFFSET) Integer num2, @Nullable @Query("status") String str4, @NotNull Continuation<? super Response<List<PaymentLinkResponseDto>>> continuation);

    @GET("${merchant.id}/terminals_with_out_ptid/bines")
    @Nullable
    Object getBines(@Query("forceUpdate") boolean z10, @NotNull Continuation<? super Response<List<BinResponseDto>>> continuation);

    @Headers({"Content-Type:application/octet-stream"})
    @GET("${merchant.id}/terminals_with_out_ptid/firmware/D180")
    @Nullable
    Object getFirmware(@NotNull Continuation<? super Response<ResponseBody>> continuation);

    @POST("${merchant.id}/terminals_with_out_ptid/merchant")
    @Nullable
    Object getMerchant(@Body @NotNull GetMerchantRequestDto getMerchantRequestDto, @NotNull Continuation<? super Response<MerchantResponseDto>> continuation);

    @GET("allowed-payments-msi/terminals/${merchant.id}/{bin}")
    @Nullable
    Object getPaymentPlans(@Path("bin") @NotNull String str, @Query(PushConstants.AMOUNT) double d2, @NotNull Continuation<? super Response<PlanResponseDto>> continuation);

    @GET("allowed-payments-msi/terminals/${merchant.id}")
    @Nullable
    Object getPaymentPlansWithoutBin(@Query(PushConstants.AMOUNT) double d2, @NotNull Continuation<? super Response<PlanResponseDto>> continuation);

    @GET("${merchant.id}/terminals_with_out_ptid/rsa_key/{slot_key}")
    @Nullable
    Object getRSAKeyBySlot(@Path("slot_key") @NotNull String str, @NotNull Continuation<? super Response<RSAKeyResponseDto>> continuation);

    @GET("${merchant.id}/terminals_with_out_ptid/rsa_key")
    @Nullable
    Object getRSAKeys(@NotNull Continuation<? super Response<List<RSAKeyResponseDto>>> continuation);

    @GET("${merchant.id}/transactions")
    @Nullable
    Object getTransaction(@NotNull @Query("transactionId") String str, @NotNull @Query("originChannel") String str2, @NotNull Continuation<? super Response<List<TransactionResponseDto>>> continuation);

    @GET("${merchant.id}/transactions")
    @Nullable
    Object getTransactions(@Nullable @Query("operationGte") String str, @Nullable @Query("operationLte") String str2, @Nullable @Query("limit") Integer num, @Nullable @Query(TypedValues.CycleType.S_WAVE_OFFSET) Integer num2, @Nullable @Query("transactionId") String str3, @Nullable @Query("paymentMethod") String str4, @Nullable @Query("status") String str5, @NotNull @Query("originChannel") String str6, @Nullable @Query("productType") String str7, @NotNull Continuation<? super Response<List<TransactionResponseDto>>> continuation);

    @POST("${merchant.id}/terminals/{serial}/keys")
    @Nullable
    Object initializeKeys(@Path("serial") @NotNull String str, @Body @NotNull TerminalKeysRequestDto terminalKeysRequestDto, @NotNull Continuation<? super Response<TerminalKeysResponseDto>> continuation);

    @POST("${merchant.id}/charges/{transactionId}/refund")
    @Nullable
    Object refundCharge(@Path("transactionId") @NotNull String str, @Body @NotNull EmptyRequestDto emptyRequestDto, @NotNull Continuation<? super Response<TransactionResponseDto>> continuation);

    @POST("${merchant.id}/terminals")
    @Nullable
    Object registerSmartphone(@Body @NotNull RegisterSmartphoneRequestDto registerSmartphoneRequestDto, @NotNull Continuation<? super Response<Void>> continuation);

    @POST("${merchant.id}/terminals/{serial}/reverses")
    @Nullable
    Object reverse(@Path("serial") @NotNull String str, @Body @NotNull ReverseRequestDto reverseRequestDto, @NotNull Continuation<? super Response<Void>> continuation);

    @POST("${merchant.id}/terminals_with_out_ptid/send_voucher")
    @Nullable
    Object sendVoucher(@Body @NotNull SendVoucherRequestDto sendVoucherRequestDto, @NotNull Continuation<? super Response<Void>> continuation);

    @PUT("${merchant.id}/checkouts/{paymentLinkId}")
    @Nullable
    Object updatePaymentLink(@Path("paymentLinkId") @NotNull String str, @NotNull @Query("status") String str2, @Body @NotNull UpdatePaymentLinkRequestDto updatePaymentLinkRequestDto, @NotNull Continuation<? super Response<PaymentLinkResponseDto>> continuation);

    @PUT("${merchant.id}/checkouts/{paymentLinkId}")
    @Nullable
    Object updatePaymentLinkStatus(@Path("paymentLinkId") @NotNull String str, @NotNull @Query("status") String str2, @Body @NotNull EmptyRequestDto emptyRequestDto, @NotNull Continuation<? super Response<PaymentLinkResponseDto>> continuation);

    @POST("${merchant.id}/terminals_with_out_ptid/terminal_capacity")
    @Nullable
    Object updateTerminalCapacity(@Body @NotNull TerminalCapacityRequestDto terminalCapacityRequestDto, @NotNull Continuation<? super Response<RSAKeyResponseDto>> continuation);
}
