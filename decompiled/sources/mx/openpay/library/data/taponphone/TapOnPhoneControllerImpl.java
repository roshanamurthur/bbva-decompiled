package mx.openpay.library.data.taponphone;

import android.app.Application;
import android.content.Context;
import androidx.camera.camera2.internal.h0;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.bbva.nativesettings.common.Constants;
import com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorCodes;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.google.android.material.internal.ViewUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.mypinpad.tsdk.api.TsdkManualInitializer;
import com.viergegroup.sdk.taptophone.vierge.models.MessageLectureType;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import mx.openpay.library.data.R;
import mx.openpay.library.data.bluetooth.eglobal.mapper.ConnectedDeviceQ8MapperKt;
import mx.openpay.library.data.bluetooth.eglobal.model.C51Response;
import mx.openpay.library.data.bluetooth.eglobal.model.C54Response;
import mx.openpay.library.data.bluetooth.eglobal.model.Q8Response;
import mx.openpay.library.data.bluetooth.eglobal.model.Z10Response;
import mx.openpay.library.data.datasource.remote.model.response.TransactionErrorResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.EmvTerminalDataResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.GatewayResponseDto;
import mx.openpay.library.data.mapper.eglobal.EmvTerminalDataMapperKt;
import mx.openpay.library.data.taponphone.di.TapOnPhoneDependenciesProvider;
import mx.openpay.library.data.util.ChargeUtils;
import mx.openpay.library.data.util.EglobalUtils;
import mx.openpay.library.data.util.RefundUtils;
import mx.openpay.library.domain.bluetooth.model.eglobal.ConnectedDeviceQ8;
import mx.openpay.library.domain.model.CreateCharge;
import mx.openpay.library.domain.model.Error;
import mx.openpay.library.domain.model.ProcessingStep;
import mx.openpay.library.domain.model.eglobal.Bin;
import mx.openpay.library.domain.model.eglobal.Charge;
import mx.openpay.library.domain.model.eglobal.EmvTags;
import mx.openpay.library.domain.model.eglobal.EmvTerminalData;
import mx.openpay.library.domain.model.eglobal.GetMerchant;
import mx.openpay.library.domain.model.eglobal.Merchant;
import mx.openpay.library.domain.model.eglobal.PaymentPlan;
import mx.openpay.library.domain.model.eglobal.PaymentType;
import mx.openpay.library.domain.model.eglobal.RefundRequest;
import mx.openpay.library.domain.model.eglobal.ReverseRequest;
import mx.openpay.library.domain.model.eglobal.TerminalKeysRequest;
import mx.openpay.library.domain.model.eglobal.TerminalKeysResponse;
import mx.openpay.library.domain.model.taponphone.DeviceNFCStatus;
import mx.openpay.library.domain.model.taponphone.InitResult;
import mx.openpay.library.domain.model.taponphone.NotifyUserItem;
import mx.openpay.library.domain.model.taponphone.RegisterSmartphoneRequest;
import mx.openpay.library.domain.model.taponphone.TapOnPhoneCallback;
import mx.openpay.library.domain.model.taponphone.TapOnPhoneCallbackStates;
import mx.openpay.library.domain.model.taponphone.TapOnPhoneChargeRequest;
import mx.openpay.library.domain.model.transaction.Transaction;
import mx.openpay.library.domain.taponphone.TapOnPhoneController;
import mx.openpay.library.domain.usecase.GetPaymentPlansUseCase;
import mx.openpay.library.domain.usecase.eglobal.CanPayWithBbvaPointsUseCase;
import mx.openpay.library.domain.usecase.eglobal.CreateChargeUseCase;
import mx.openpay.library.domain.usecase.eglobal.DeleteAllBinesUseCase;
import mx.openpay.library.domain.usecase.eglobal.GetBinesCountUseCase;
import mx.openpay.library.domain.usecase.eglobal.GetBinesUseCase;
import mx.openpay.library.domain.usecase.eglobal.GetKeyInjectedDateBySerialUseCase;
import mx.openpay.library.domain.usecase.eglobal.GetMerchantUseCase;
import mx.openpay.library.domain.usecase.eglobal.GetRenewKeyBySlotAndTerminalUseCase;
import mx.openpay.library.domain.usecase.eglobal.InitializeKeysUseCase;
import mx.openpay.library.domain.usecase.eglobal.InsertBinesUseCase;
import mx.openpay.library.domain.usecase.eglobal.InsertMerchantDetailsUseCase;
import mx.openpay.library.domain.usecase.eglobal.RefundChargeUseCase;
import mx.openpay.library.domain.usecase.eglobal.ReverseChargeUseCase;
import mx.openpay.library.domain.usecase.eglobal.UpdateKeyInjectedDateBySerialUseCase;
import mx.openpay.library.domain.usecase.eglobal.UpdateRenewKeyBySlotAndTerminalUseCase;
import mx.openpay.library.domain.usecase.taponphone.RegisterSmartphoneUseCase;
import mx.openpay.library.domain.usecase.transaction.GetTransactionByIdUseCase;
import mx.openpay.library.domain.usecase.transaction.InsertTransactionUseCase;
import mx.openpay.library.domain.usecase.transaction.UpdateTransactionUseCase;
import mx.openpay.library.domain.util.CalendarUtils;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TapOnPhoneControllerImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 T2\u00020\u0001:\u0001TB¿\u0001\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010'\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010G\u001a\u00020F\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010K\u001a\u00020J\u0012\u0006\u0010M\u001a\u00020L\u0012\u0006\u0010O\u001a\u00020N\u0012\u0006\u0010Q\u001a\u00020P¢\u0006\u0004\bR\u0010SJ\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005J)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\u0006\u0010\u0011\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\u0006\u0010\u0011\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\u0006\u0010\u0011\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020#H\u0096@ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006U"}, d2 = {"Lmx/openpay/library/data/taponphone/TapOnPhoneControllerImpl;", "Lmx/openpay/library/domain/taponphone/TapOnPhoneController;", "Lmx/openpay/library/domain/util/Result;", "", "initTsdkManualInitializer", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/app/Application;", Constants.APPLICATION, "createdTsdkManualInitializer", "(Landroid/app/Application;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx/openpay/library/domain/model/taponphone/InitResult;", "initTapOnPhone", "Lmx/openpay/library/domain/model/taponphone/TapOnPhoneChargeRequest;", "tapOnPhoneChargeRequest", "Lmx/openpay/library/domain/model/taponphone/TapOnPhoneCallback;", "tapOnPhoneCallback", "Lmx/openpay/library/domain/model/eglobal/Charge;", "createCharge", "(Lmx/openpay/library/domain/model/taponphone/TapOnPhoneChargeRequest;Lmx/openpay/library/domain/model/taponphone/TapOnPhoneCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx/openpay/library/domain/model/CreateCharge;", "", "selectedPlan", "createChargePlansStep", "(Lmx/openpay/library/domain/model/CreateCharge;Lmx/openpay/library/domain/model/taponphone/TapOnPhoneCallback;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "encodedImage", "createChargeSignStep", "(Lmx/openpay/library/domain/model/CreateCharge;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withPoints", "createChargePointsStep", "(Lmx/openpay/library/domain/model/CreateCharge;Lmx/openpay/library/domain/model/taponphone/TapOnPhoneCallback;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmx/openpay/library/domain/model/transaction/Transaction;", "transaction", "executeRefundCharge", "(Lmx/openpay/library/domain/model/transaction/Transaction;Lmx/openpay/library/domain/model/taponphone/TapOnPhoneCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cancelProcess", "Landroid/content/Context;", "context", "isProdEnv", "Lcom/google/gson/Gson;", "gson", "Lmx/openpay/library/domain/usecase/eglobal/GetMerchantUseCase;", "getMerchantUseCase", "Lmx/openpay/library/domain/usecase/eglobal/InsertMerchantDetailsUseCase;", "insertMerchantDetailsUseCase", "Lmx/openpay/library/domain/usecase/eglobal/GetBinesUseCase;", "getBinesUseCase", "Lmx/openpay/library/domain/usecase/eglobal/DeleteAllBinesUseCase;", "deleteAllBinesUseCase", "Lmx/openpay/library/domain/usecase/eglobal/InsertBinesUseCase;", "insertBinesUseCase", "Lmx/openpay/library/domain/usecase/eglobal/GetBinesCountUseCase;", "getBinesCountUseCase", "Lmx/openpay/library/domain/usecase/eglobal/GetRenewKeyBySlotAndTerminalUseCase;", "getRenewKeyBySlotAndTerminalUseCase", "Lmx/openpay/library/domain/usecase/eglobal/InitializeKeysUseCase;", "initializeKeysUseCase", "Lmx/openpay/library/domain/usecase/eglobal/UpdateRenewKeyBySlotAndTerminalUseCase;", "updateRenewKeyBySlotAndTerminalUseCase", "Lmx/openpay/library/domain/usecase/transaction/GetTransactionByIdUseCase;", "getTransactionByIdUseCase", "Lmx/openpay/library/domain/usecase/transaction/UpdateTransactionUseCase;", "updateTransactionUseCase", "Lmx/openpay/library/domain/usecase/transaction/InsertTransactionUseCase;", "insertTransactionUseCase", "Lmx/openpay/library/domain/usecase/eglobal/ReverseChargeUseCase;", "reverseChargeUseCase", "Lmx/openpay/library/domain/usecase/eglobal/CanPayWithBbvaPointsUseCase;", "canPayWithBbvaPointsUseCase", "Lmx/openpay/library/domain/usecase/eglobal/GetKeyInjectedDateBySerialUseCase;", "getKeyInjectedDateBySerialUseCase", "Lmx/openpay/library/domain/usecase/eglobal/UpdateKeyInjectedDateBySerialUseCase;", "updateKeyInjectedDateBySerialUseCase", "Lmx/openpay/library/domain/usecase/eglobal/CreateChargeUseCase;", "createChargeUseCase", "Lmx/openpay/library/domain/usecase/taponphone/RegisterSmartphoneUseCase;", "registerSmartphoneUseCase", "Lmx/openpay/library/domain/usecase/eglobal/RefundChargeUseCase;", "refundChargeUseCase", "Lmx/openpay/library/domain/usecase/GetPaymentPlansUseCase;", "getPaymentPlansUseCase", "<init>", "(Landroid/content/Context;ZLcom/google/gson/Gson;Lmx/openpay/library/domain/usecase/eglobal/GetMerchantUseCase;Lmx/openpay/library/domain/usecase/eglobal/InsertMerchantDetailsUseCase;Lmx/openpay/library/domain/usecase/eglobal/GetBinesUseCase;Lmx/openpay/library/domain/usecase/eglobal/DeleteAllBinesUseCase;Lmx/openpay/library/domain/usecase/eglobal/InsertBinesUseCase;Lmx/openpay/library/domain/usecase/eglobal/GetBinesCountUseCase;Lmx/openpay/library/domain/usecase/eglobal/GetRenewKeyBySlotAndTerminalUseCase;Lmx/openpay/library/domain/usecase/eglobal/InitializeKeysUseCase;Lmx/openpay/library/domain/usecase/eglobal/UpdateRenewKeyBySlotAndTerminalUseCase;Lmx/openpay/library/domain/usecase/transaction/GetTransactionByIdUseCase;Lmx/openpay/library/domain/usecase/transaction/UpdateTransactionUseCase;Lmx/openpay/library/domain/usecase/transaction/InsertTransactionUseCase;Lmx/openpay/library/domain/usecase/eglobal/ReverseChargeUseCase;Lmx/openpay/library/domain/usecase/eglobal/CanPayWithBbvaPointsUseCase;Lmx/openpay/library/domain/usecase/eglobal/GetKeyInjectedDateBySerialUseCase;Lmx/openpay/library/domain/usecase/eglobal/UpdateKeyInjectedDateBySerialUseCase;Lmx/openpay/library/domain/usecase/eglobal/CreateChargeUseCase;Lmx/openpay/library/domain/usecase/taponphone/RegisterSmartphoneUseCase;Lmx/openpay/library/domain/usecase/eglobal/RefundChargeUseCase;Lmx/openpay/library/domain/usecase/GetPaymentPlansUseCase;)V", "Companion", "data_release"}, k = 1, mv = {1, 8, 0})
public final class TapOnPhoneControllerImpl implements TapOnPhoneController {

    @NotNull
    public String A;
    public boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f83607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f83608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Gson f83609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final GetMerchantUseCase f83610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final InsertMerchantDetailsUseCase f83611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final GetBinesUseCase f83612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final DeleteAllBinesUseCase f83613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final InsertBinesUseCase f83614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final GetBinesCountUseCase f83615i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final GetRenewKeyBySlotAndTerminalUseCase f83616j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final InitializeKeysUseCase f83617k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final UpdateRenewKeyBySlotAndTerminalUseCase f83618l;

    @NotNull
    public final GetTransactionByIdUseCase m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final UpdateTransactionUseCase f83619n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final InsertTransactionUseCase f83620o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final ReverseChargeUseCase f83621p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final CanPayWithBbvaPointsUseCase f83622q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final GetKeyInjectedDateBySerialUseCase f83623r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final UpdateKeyInjectedDateBySerialUseCase f83624s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final CreateChargeUseCase f83625t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final RegisterSmartphoneUseCase f83626u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final RefundChargeUseCase f83627v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final GetPaymentPlansUseCase f83628w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TapOnPhonePinPadSdkWrapper f83629x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ConnectedDeviceQ8 f83630y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Merchant f83631z;

    /* JADX INFO: compiled from: TapOnPhoneControllerImpl.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhoneControllerImpl", f = "TapOnPhoneControllerImpl.kt", i = {}, l = {995}, m = "applyReverse", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f83632p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f83634r0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83632p0 = obj;
            this.f83634r0 |= Integer.MIN_VALUE;
            return TapOnPhoneControllerImpl.this.a(null, false, 0, this);
        }
    }

    /* JADX INFO: compiled from: TapOnPhoneControllerImpl.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhoneControllerImpl", f = "TapOnPhoneControllerImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {1051, 1060}, m = "chargeTerminalOnResponseNoSuccess", n = {"this", "createCharge", "smartphoneInfo", "error", "errorCode", "httpCode", "description", "errorCode", "httpCode", "description"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Object f83635p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Object f83636q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Object f83637r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Ref.ObjectRef f83638s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Ref.IntRef f83639t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Ref.IntRef f83640u0;
        public Ref.ObjectRef v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public /* synthetic */ Object f83641w0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public int f83643y0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83641w0 = obj;
            this.f83643y0 |= Integer.MIN_VALUE;
            return TapOnPhoneControllerImpl.this.b(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: TapOnPhoneControllerImpl.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhoneControllerImpl", f = "TapOnPhoneControllerImpl.kt", i = {0, 0, 0, 1, 1, 1, 2, 4}, l = {304, 311, 324, 319, 345, 340}, m = "createCharge", n = {"this", "tapOnPhoneChargeRequest", "tapOnPhoneCallback", "this", "tapOnPhoneChargeRequest", "tapOnPhoneCallback", "tapOnPhoneCallback", "tapOnPhoneCallback"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$0"})
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Object f83644p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Object f83645q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Object f83646r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Merchant f83647s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public TapOnPhoneChargeRequest f83648t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public /* synthetic */ Object f83649u0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f83650w0;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83649u0 = obj;
            this.f83650w0 |= Integer.MIN_VALUE;
            return TapOnPhoneControllerImpl.this.createCharge(null, null, this);
        }
    }

    /* JADX INFO: compiled from: TapOnPhoneControllerImpl.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhoneControllerImpl", f = "TapOnPhoneControllerImpl.kt", i = {0, 0, 1, 1, 1, 4, 6}, l = {ErrorCodes.STORAGE_PERMISSION, 731, 732, 744, 752, 753, 763, ViewUtils.EDGE_TO_EDGE_FLAGS}, m = "executeCharge", n = {"this", "createCharge", "this", "createCharge", "chargeResponseData", "this", "this"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$0"})
    public static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TapOnPhoneControllerImpl f83651p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public CreateCharge f83652q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Charge f83653r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f83654s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f83656u0;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83654s0 = obj;
            this.f83656u0 |= Integer.MIN_VALUE;
            return TapOnPhoneControllerImpl.this.c(null, this);
        }
    }

    /* JADX INFO: compiled from: TapOnPhoneControllerImpl.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhoneControllerImpl", f = "TapOnPhoneControllerImpl.kt", i = {0, 0}, l = {853, 852}, m = "executeChargeC54Command", n = {"chargeResponse", "createCharge"}, s = {"L$0", "L$1"})
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Charge f83657p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public CreateCharge f83658q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public TapOnPhoneControllerImpl f83659r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f83660s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f83662u0;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83660s0 = obj;
            this.f83662u0 |= Integer.MIN_VALUE;
            return TapOnPhoneControllerImpl.this.d(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: TapOnPhoneControllerImpl.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhoneControllerImpl", f = "TapOnPhoneControllerImpl.kt", i = {0, 0, 0, 1, 1, 1, 3, 3}, l = {374, 379, 391, 398}, m = "executeInitialSetOfCommands", n = {"this", "smartphoneInfo", "merchantInfo", "this", "smartphoneInfo", "merchantInfo", "this", "initializeKeysResponse"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1"})
    public static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TapOnPhoneControllerImpl f83663p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Object f83664q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Merchant f83665r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f83666s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f83668u0;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83666s0 = obj;
            this.f83668u0 |= Integer.MIN_VALUE;
            return TapOnPhoneControllerImpl.this.e(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: TapOnPhoneControllerImpl.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhoneControllerImpl", f = "TapOnPhoneControllerImpl.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 4, 4, 4}, l = {1159, 1167, 1177, 1187, ReturnCode.ERR_CRY_MAC_CIPHER_A, 1216, 1231}, m = "executeRefundCharge", n = {"this", "transaction", "tapOnPhoneCallback", "refundRequest", "this", "transaction", "tapOnPhoneCallback", "refundRequest", "this", "transaction", "refundRequest", "this", "transaction", "refundRequest"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TapOnPhoneControllerImpl f83669p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Transaction f83670q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Object f83671r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public RefundRequest f83672s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public /* synthetic */ Object f83673t0;
        public int v0;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83673t0 = obj;
            this.v0 |= Integer.MIN_VALUE;
            return TapOnPhoneControllerImpl.this.executeRefundCharge(null, null, this);
        }
    }

    /* JADX INFO: compiled from: TapOnPhoneControllerImpl.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhoneControllerImpl", f = "TapOnPhoneControllerImpl.kt", i = {0, 0, 2, 2, 3, 3}, l = {LoginHelperConstants.MAINTENANCE_RESPONSE_CODE, 437, 446, 458, 464}, m = "executeZ11orZ12", n = {"this", "smartphoneInfo", "this", "responseZ11", "this", "smartphoneInfo"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class h extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TapOnPhoneControllerImpl f83675p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Object f83676q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f83677r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f83679t0;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83677r0 = obj;
            this.f83679t0 |= Integer.MIN_VALUE;
            return TapOnPhoneControllerImpl.this.f(null, null, this);
        }
    }

    /* JADX INFO: compiled from: TapOnPhoneControllerImpl.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhoneControllerImpl", f = "TapOnPhoneControllerImpl.kt", i = {0, 1, 2, 3, 3, 4, 4, 4}, l = {223, 229, 240, 243, 246, 256, 256, 258, 258}, m = "fetchInitialInfo", n = {"this", "this", "this", "this", "merchant", "this", "merchant", "merchantResponse"}, s = {"L$0", "L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$2"})
    public static final class i extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TapOnPhoneControllerImpl f83680p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public GetMerchant f83681q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Result f83682r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f83683s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f83685u0;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83683s0 = obj;
            this.f83685u0 |= Integer.MIN_VALUE;
            return TapOnPhoneControllerImpl.this.g(this);
        }
    }

    /* JADX INFO: compiled from: TapOnPhoneControllerImpl.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhoneControllerImpl", f = "TapOnPhoneControllerImpl.kt", i = {0, 1, 2, 3, 4, 5}, l = {129, 132, 135, 142, 152, 158}, m = "initTapOnPhone", n = {"this", "this", "this", "this", "this", "this"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$0"})
    public static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TapOnPhoneControllerImpl f83686p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f83687q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f83689s0;

        public j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83687q0 = obj;
            this.f83689s0 |= Integer.MIN_VALUE;
            return TapOnPhoneControllerImpl.this.initTapOnPhone(this);
        }
    }

    /* JADX INFO: compiled from: TapOnPhoneControllerImpl.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhoneControllerImpl", f = "TapOnPhoneControllerImpl.kt", i = {1}, l = {com.salesforce.marketingcloud.analytics.b.C, 892}, m = "manageChargeC54Response", n = {"c54Response"}, s = {"L$0"})
    public static final class k extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Result f83690p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f83691q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f83693s0;

        public k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83691q0 = obj;
            this.f83693s0 |= Integer.MIN_VALUE;
            return TapOnPhoneControllerImpl.this.h(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: TapOnPhoneControllerImpl.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhoneControllerImpl", f = "TapOnPhoneControllerImpl.kt", i = {0, 1}, l = {1341, 1339}, m = "manageRefundC54Response", n = {"c54Response", "c54Response"}, s = {"L$0", "L$0"})
    public static final class l extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Result f83694p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public TapOnPhoneControllerImpl f83695q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f83696r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f83698t0;

        public l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83696r0 = obj;
            this.f83698t0 |= Integer.MIN_VALUE;
            return TapOnPhoneControllerImpl.this.i(null, this);
        }
    }

    /* JADX INFO: compiled from: TapOnPhoneControllerImpl.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhoneControllerImpl", f = "TapOnPhoneControllerImpl.kt", i = {0, 0}, l = {491}, m = "readCardC51", n = {"this", "tapOnPhoneCallback"}, s = {"L$0", "L$1"})
    public static final class m extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TapOnPhoneControllerImpl f83699p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public TapOnPhoneCallback f83700q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f83701r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f83703t0;

        public m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83701r0 = obj;
            this.f83703t0 |= Integer.MIN_VALUE;
            return TapOnPhoneControllerImpl.this.j(null, false, null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: TapOnPhoneControllerImpl.kt */
    public static final class n extends Lambda implements Function1<MessageLectureType, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TapOnPhoneCallback f83704p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(TapOnPhoneCallback tapOnPhoneCallback) {
            super(1);
            this.f83704p0 = tapOnPhoneCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MessageLectureType messageLectureType) {
            MessageLectureType messageLectureType2 = messageLectureType;
            Integer numValueOf = messageLectureType2 != null ? Integer.valueOf(messageLectureType2.getF67968b()) : null;
            TapOnPhoneCallback tapOnPhoneCallback = this.f83704p0;
            if ((numValueOf != null && numValueOf.intValue() == 4) || (numValueOf != null && numValueOf.intValue() == 11)) {
                if (tapOnPhoneCallback != null) {
                    tapOnPhoneCallback.execute(new TapOnPhoneCallbackStates.NotifyUser(NotifyUserItem.BRING_CARD_CLOSER));
                }
            } else if (numValueOf != null && numValueOf.intValue() == 10) {
                if (tapOnPhoneCallback != null) {
                    tapOnPhoneCallback.execute(new TapOnPhoneCallbackStates.NotifyUser(NotifyUserItem.SEE_DEVICE));
                }
            } else if (numValueOf != null && numValueOf.intValue() == 5) {
                if (tapOnPhoneCallback != null) {
                    tapOnPhoneCallback.execute(new TapOnPhoneCallbackStates.NotifyUser(NotifyUserItem.MOVE_CARD_AWAY));
                }
            } else if (numValueOf != null && numValueOf.intValue() == 12) {
                if (tapOnPhoneCallback != null) {
                    tapOnPhoneCallback.execute(new TapOnPhoneCallbackStates.NotifyUser(NotifyUserItem.DO_NOT_REMOVE_CARD));
                }
            } else if (tapOnPhoneCallback != null) {
                tapOnPhoneCallback.execute(new TapOnPhoneCallbackStates.NotifyUser(NotifyUserItem.PROCESSING));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TapOnPhoneControllerImpl.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhoneControllerImpl", f = "TapOnPhoneControllerImpl.kt", i = {0, 0, 0, 0, 0}, l = {812, 819, 827}, m = "reviewChargeServiceResponse", n = {"this", "createCharge", "chargeResponse", "emvTerminalData", "gatewayResponseDto"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class o extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TapOnPhoneControllerImpl f83705p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public CreateCharge f83706q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Charge f83707r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public EmvTerminalData f83708s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public GatewayResponseDto f83709t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public /* synthetic */ Object f83710u0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f83711w0;

        public o(Continuation<? super o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83710u0 = obj;
            this.f83711w0 |= Integer.MIN_VALUE;
            return TapOnPhoneControllerImpl.this.k(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: TapOnPhoneControllerImpl.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhoneControllerImpl", f = "TapOnPhoneControllerImpl.kt", i = {0, 0}, l = {285, 286}, m = "validateBinesResponse", n = {"this", "binesResponse"}, s = {"L$0", "L$1"})
    public static final class p extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TapOnPhoneControllerImpl f83712p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Result f83713q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f83714r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f83716t0;

        public p(Continuation<? super p> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83714r0 = obj;
            this.f83716t0 |= Integer.MIN_VALUE;
            return TapOnPhoneControllerImpl.this.l(null, this);
        }
    }

    /* JADX INFO: compiled from: TapOnPhoneControllerImpl.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhoneControllerImpl", f = "TapOnPhoneControllerImpl.kt", i = {0, 0, 0, 0, 2}, l = {596, TypedValues.MotionType.TYPE_POLAR_RELATIVETO, 619}, m = "validateChargeFlow", n = {"this", "tapOnPhoneChargeRequest", "tapOnPhoneCallback", "createCharge", "cardInfoC51"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0"})
    public static final class q extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Object f83717p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public TapOnPhoneChargeRequest f83718q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public TapOnPhoneCallback f83719r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public CreateCharge f83720s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public /* synthetic */ Object f83721t0;
        public int v0;

        public q(Continuation<? super q> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83721t0 = obj;
            this.v0 |= Integer.MIN_VALUE;
            return TapOnPhoneControllerImpl.this.m(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: TapOnPhoneControllerImpl.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhoneControllerImpl", f = "TapOnPhoneControllerImpl.kt", i = {0, 0, 0}, l = {787, 788, 790}, m = "validateIfExistsTransactionData", n = {"this", "createCharge", "id"}, s = {"L$0", "L$1", "L$2"})
    public static final class r extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TapOnPhoneControllerImpl f83723p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public CreateCharge f83724q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public String f83725r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f83726s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f83728u0;

        public r(Continuation<? super r> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83726s0 = obj;
            this.f83728u0 |= Integer.MIN_VALUE;
            return TapOnPhoneControllerImpl.this.n(null, null, this);
        }
    }

    /* JADX INFO: compiled from: TapOnPhoneControllerImpl.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhoneControllerImpl", f = "TapOnPhoneControllerImpl.kt", i = {}, l = {696, 699, TypedValues.TransitionType.TYPE_TRANSITION_FLAGS}, m = "validateIfSignatureRequired", n = {}, s = {})
    public static final class s extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f83729p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f83731r0;

        public s(Continuation<? super s> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83729p0 = obj;
            this.f83731r0 |= Integer.MIN_VALUE;
            return TapOnPhoneControllerImpl.this.o(null, null, this);
        }
    }

    /* JADX INFO: compiled from: TapOnPhoneControllerImpl.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhoneControllerImpl", f = "TapOnPhoneControllerImpl.kt", i = {0, 0, 0}, l = {638, 654, 662}, m = "validatePayWithPlants", n = {"this", "createCharge", "tapOnPhoneCallback"}, s = {"L$0", "L$1", "L$2"})
    public static final class t extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TapOnPhoneControllerImpl f83732p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public CreateCharge f83733q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public TapOnPhoneCallback f83734r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f83735s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f83737u0;

        public t(Continuation<? super t> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83735s0 = obj;
            this.f83737u0 |= Integer.MIN_VALUE;
            return TapOnPhoneControllerImpl.this.q(0.0d, null, null, this);
        }
    }

    /* JADX INFO: compiled from: TapOnPhoneControllerImpl.kt */
    @DebugMetadata(c = "mx.openpay.library.data.taponphone.TapOnPhoneControllerImpl", f = "TapOnPhoneControllerImpl.kt", i = {0, 1, 2, 3, 4, 5, 6}, l = {1270, 1274, 1272, 1288, 1287, ReturnCode.ERR_CONFIG, 1298, 1315, 1313}, m = "validateRefundFlow", n = {"this", "refundResponse", "refundResponse", "refundResponse", "refundResponse", "refundResponse", "refundResponse"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0"})
    public static final class u extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Object f83738p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public TapOnPhoneControllerImpl f83739q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f83740r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f83742t0;

        public u(Continuation<? super u> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f83740r0 = obj;
            this.f83742t0 |= Integer.MIN_VALUE;
            return TapOnPhoneControllerImpl.this.r(null, null, null, null, this);
        }
    }

    public TapOnPhoneControllerImpl(@NotNull Context context, boolean z10, @NotNull Gson gson, @NotNull GetMerchantUseCase getMerchantUseCase, @NotNull InsertMerchantDetailsUseCase insertMerchantDetailsUseCase, @NotNull GetBinesUseCase getBinesUseCase, @NotNull DeleteAllBinesUseCase deleteAllBinesUseCase, @NotNull InsertBinesUseCase insertBinesUseCase, @NotNull GetBinesCountUseCase getBinesCountUseCase, @NotNull GetRenewKeyBySlotAndTerminalUseCase getRenewKeyBySlotAndTerminalUseCase, @NotNull InitializeKeysUseCase initializeKeysUseCase, @NotNull UpdateRenewKeyBySlotAndTerminalUseCase updateRenewKeyBySlotAndTerminalUseCase, @NotNull GetTransactionByIdUseCase getTransactionByIdUseCase, @NotNull UpdateTransactionUseCase updateTransactionUseCase, @NotNull InsertTransactionUseCase insertTransactionUseCase, @NotNull ReverseChargeUseCase reverseChargeUseCase, @NotNull CanPayWithBbvaPointsUseCase canPayWithBbvaPointsUseCase, @NotNull GetKeyInjectedDateBySerialUseCase getKeyInjectedDateBySerialUseCase, @NotNull UpdateKeyInjectedDateBySerialUseCase updateKeyInjectedDateBySerialUseCase, @NotNull CreateChargeUseCase createChargeUseCase, @NotNull RegisterSmartphoneUseCase registerSmartphoneUseCase, @NotNull RefundChargeUseCase refundChargeUseCase, @NotNull GetPaymentPlansUseCase getPaymentPlansUseCase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(getMerchantUseCase, "getMerchantUseCase");
        Intrinsics.checkNotNullParameter(insertMerchantDetailsUseCase, "insertMerchantDetailsUseCase");
        Intrinsics.checkNotNullParameter(getBinesUseCase, "getBinesUseCase");
        Intrinsics.checkNotNullParameter(deleteAllBinesUseCase, "deleteAllBinesUseCase");
        Intrinsics.checkNotNullParameter(insertBinesUseCase, "insertBinesUseCase");
        Intrinsics.checkNotNullParameter(getBinesCountUseCase, "getBinesCountUseCase");
        Intrinsics.checkNotNullParameter(getRenewKeyBySlotAndTerminalUseCase, "getRenewKeyBySlotAndTerminalUseCase");
        Intrinsics.checkNotNullParameter(initializeKeysUseCase, "initializeKeysUseCase");
        Intrinsics.checkNotNullParameter(updateRenewKeyBySlotAndTerminalUseCase, "updateRenewKeyBySlotAndTerminalUseCase");
        Intrinsics.checkNotNullParameter(getTransactionByIdUseCase, "getTransactionByIdUseCase");
        Intrinsics.checkNotNullParameter(updateTransactionUseCase, "updateTransactionUseCase");
        Intrinsics.checkNotNullParameter(insertTransactionUseCase, "insertTransactionUseCase");
        Intrinsics.checkNotNullParameter(reverseChargeUseCase, "reverseChargeUseCase");
        Intrinsics.checkNotNullParameter(canPayWithBbvaPointsUseCase, "canPayWithBbvaPointsUseCase");
        Intrinsics.checkNotNullParameter(getKeyInjectedDateBySerialUseCase, "getKeyInjectedDateBySerialUseCase");
        Intrinsics.checkNotNullParameter(updateKeyInjectedDateBySerialUseCase, "updateKeyInjectedDateBySerialUseCase");
        Intrinsics.checkNotNullParameter(createChargeUseCase, "createChargeUseCase");
        Intrinsics.checkNotNullParameter(registerSmartphoneUseCase, "registerSmartphoneUseCase");
        Intrinsics.checkNotNullParameter(refundChargeUseCase, "refundChargeUseCase");
        Intrinsics.checkNotNullParameter(getPaymentPlansUseCase, "getPaymentPlansUseCase");
        this.f83607a = context;
        this.f83608b = z10;
        this.f83609c = gson;
        this.f83610d = getMerchantUseCase;
        this.f83611e = insertMerchantDetailsUseCase;
        this.f83612f = getBinesUseCase;
        this.f83613g = deleteAllBinesUseCase;
        this.f83614h = insertBinesUseCase;
        this.f83615i = getBinesCountUseCase;
        this.f83616j = getRenewKeyBySlotAndTerminalUseCase;
        this.f83617k = initializeKeysUseCase;
        this.f83618l = updateRenewKeyBySlotAndTerminalUseCase;
        this.m = getTransactionByIdUseCase;
        this.f83619n = updateTransactionUseCase;
        this.f83620o = insertTransactionUseCase;
        this.f83621p = reverseChargeUseCase;
        this.f83622q = canPayWithBbvaPointsUseCase;
        this.f83623r = getKeyInjectedDateBySerialUseCase;
        this.f83624s = updateKeyInjectedDateBySerialUseCase;
        this.f83625t = createChargeUseCase;
        this.f83626u = registerSmartphoneUseCase;
        this.f83627v = refundChargeUseCase;
        this.f83628w = getPaymentPlansUseCase;
        this.A = "";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, boolean z10, int i10, Continuation<? super Unit> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f83634r0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f83634r0 = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objInvoke = aVar.f83632p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f83634r0;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            this.B = true;
            ReverseRequest reverseRequest = new ReverseRequest(str, true, null, 4, null);
            if (i10 > 0) {
                reverseRequest.setReasonReverse(Boxing.boxInt(i10));
            }
            ConnectedDeviceQ8 connectedDeviceQ8 = null;
            if (!z10) {
                Merchant merchant = this.f83631z;
                if (merchant == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant = null;
                }
                if (Integer.parseInt(merchant.getSlotKey().getSlotKey()) == 3) {
                    reverseRequest.setReasonReverse(Boxing.boxInt(40));
                }
            }
            ConnectedDeviceQ8 connectedDeviceQ9 = this.f83630y;
            if (connectedDeviceQ9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
            } else {
                connectedDeviceQ8 = connectedDeviceQ9;
            }
            String serial = connectedDeviceQ8.getSerial();
            aVar.f83634r0 = 1;
            objInvoke = this.f83621p.invoke(reverseRequest, serial, aVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke);
        }
        Result result = (Result) objInvoke;
        if (!(result instanceof Result.Success)) {
            boolean z11 = result instanceof Result.Failure;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x019a  */
    /* JADX WARN: Code duplicated, block: B:48:0x019f  */
    /* JADX WARN: Code duplicated, block: B:51:0x01c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, mx.openpay.library.data.datasource.remote.model.response.TransactionErrorResponseDto] */
    /* JADX WARN: Type inference failed for: r0v21, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v9, types: [T, java.lang.Object, java.lang.String] */
    public final Object b(CreateCharge createCharge, ConnectedDeviceQ8 connectedDeviceQ8, String str, Continuation<? super Result<Charge>> continuation) {
        b bVar;
        Ref.ObjectRef objectRef;
        CreateCharge createCharge2;
        Ref.ObjectRef objectRef2;
        ConnectedDeviceQ8 connectedDeviceQ9;
        Ref.ObjectRef objectRef3;
        Ref.IntRef intRef;
        Ref.IntRef intRef2;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl;
        CreateCharge createCharge3;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl2;
        ConnectedDeviceQ8 connectedDeviceQ10;
        EmvTerminalDataResponseDto emvTerminalDataResponse;
        EmvTerminalData emvTerminalDataMapToLocalEmvTerminalData;
        GatewayResponseDto gatewayResponseDto;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f83643y0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f83643y0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        b bVar2 = bVar;
        Object obj = bVar2.f83641w0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar2.f83643y0;
        if (i11 != 0) {
            if (i11 == 1) {
                objectRef2 = bVar2.v0;
                intRef2 = bVar2.f83640u0;
                intRef = bVar2.f83639t0;
                objectRef3 = bVar2.f83638s0;
                connectedDeviceQ9 = (ConnectedDeviceQ8) bVar2.f83637r0;
                createCharge2 = (CreateCharge) bVar2.f83636q0;
                tapOnPhoneControllerImpl = (TapOnPhoneControllerImpl) bVar2.f83635p0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef2 = (Ref.ObjectRef) bVar2.f83637r0;
                intRef2 = (Ref.IntRef) bVar2.f83636q0;
                intRef = (Ref.IntRef) bVar2.f83635p0;
                ResultKt.throwOnFailure(obj);
            }
            return new Result.Failure(new Error.Server(intRef2.element + "#" + intRef.element + "#" + objectRef2.element));
        }
        ResultKt.throwOnFailure(obj);
        this.B = true;
        objectRef = new Ref.ObjectRef();
        objectRef.element = new TransactionErrorResponseDto(null, null, 3, null);
        Ref.IntRef intRef3 = new Ref.IntRef();
        intRef3.element = 700;
        Ref.IntRef intRef4 = new Ref.IntRef();
        intRef4.element = 401;
        Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        objectRef4.element = "";
        try {
            JsonObject jsonObject = (JsonObject) new Gson().fromJson(str, JsonObject.class);
            if (jsonObject != null) {
                if (jsonObject.has("error_code")) {
                    intRef3.element = jsonObject.get("error_code").getAsInt();
                }
                if (jsonObject.has(EglobalUtils.HTTP_CODE_ENTRY)) {
                    intRef4.element = jsonObject.get(EglobalUtils.HTTP_CODE_ENTRY).getAsInt();
                }
                if (jsonObject.has("description")) {
                    ?? asString = jsonObject.get("description").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString, "json[EglobalUtils.DESCRIPTION_ENTRY].asString");
                    objectRef4.element = asString;
                } else if (jsonObject.has("message")) {
                    ?? asString2 = jsonObject.get("message").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString2, "json[EglobalUtils.MESSAGE_ENTRY].asString");
                    objectRef4.element = asString2;
                }
                if (jsonObject.has("transaction")) {
                    ?? FromJson = new Gson().fromJson(jsonObject.get("transaction").getAsJsonObject().toString(), (Class<??>) TransactionErrorResponseDto.class);
                    Intrinsics.checkNotNullExpressionValue(FromJson, "Gson().fromJson(\n       …va,\n                    )");
                    objectRef.element = FromJson;
                    if (Intrinsics.areEqual(((TransactionErrorResponseDto) FromJson).getGatewayResponseDto().getCode(), EglobalUtils.DOUBLE_AUTH_VISA_CODE) || Intrinsics.areEqual(((TransactionErrorResponseDto) objectRef.element).getGatewayResponseDto().getCode(), EglobalUtils.DOUBLE_AUTH_MC_CODE)) {
                        intRef3.element = EglobalUtils.DOUBLE_AUTH_ERROR_CODE;
                        ?? string = this.f83607a.getString(R.string.top_double_auth_error_description);
                        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…e_auth_error_description)");
                        objectRef4.element = string;
                    }
                }
            }
            createCharge3 = createCharge;
            objectRef2 = objectRef4;
            tapOnPhoneControllerImpl2 = this;
            intRef = intRef3;
            intRef2 = intRef4;
            connectedDeviceQ10 = connectedDeviceQ8;
        } catch (Exception unused) {
            bVar2.f83635p0 = this;
            bVar2.f83636q0 = createCharge;
            bVar2.f83637r0 = connectedDeviceQ8;
            bVar2.f83638s0 = objectRef;
            bVar2.f83639t0 = intRef3;
            bVar2.f83640u0 = intRef4;
            bVar2.v0 = objectRef4;
            bVar2.f83643y0 = 1;
            if (k(createCharge, null, null, connectedDeviceQ8, null, bVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            createCharge2 = createCharge;
            objectRef2 = objectRef4;
            connectedDeviceQ9 = connectedDeviceQ8;
            objectRef3 = objectRef;
            intRef = intRef3;
            intRef2 = intRef4;
            tapOnPhoneControllerImpl = this;
            objectRef = objectRef3;
            connectedDeviceQ10 = connectedDeviceQ9;
            tapOnPhoneControllerImpl2 = tapOnPhoneControllerImpl;
            createCharge3 = createCharge2;
        }
        emvTerminalDataResponse = ((TransactionErrorResponseDto) objectRef.element).getGatewayResponseDto().getEmvTerminalDataResponse();
        if (emvTerminalDataResponse != null) {
            emvTerminalDataMapToLocalEmvTerminalData = EmvTerminalDataMapperKt.mapToLocalEmvTerminalData(emvTerminalDataResponse);
        } else {
            emvTerminalDataMapToLocalEmvTerminalData = null;
        }
        gatewayResponseDto = ((TransactionErrorResponseDto) objectRef.element).getGatewayResponseDto();
        bVar2.f83635p0 = intRef;
        bVar2.f83636q0 = intRef2;
        bVar2.f83637r0 = objectRef2;
        bVar2.f83638s0 = null;
        bVar2.f83639t0 = null;
        bVar2.f83640u0 = null;
        bVar2.v0 = null;
        bVar2.f83643y0 = 2;
        if (tapOnPhoneControllerImpl2.k(createCharge3, null, emvTerminalDataMapToLocalEmvTerminalData, connectedDeviceQ10, gatewayResponseDto, bVar2) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return new Result.Failure(new Error.Server(intRef2.element + "#" + intRef.element + "#" + objectRef2.element));
        objectRef = objectRef3;
        connectedDeviceQ10 = connectedDeviceQ9;
        tapOnPhoneControllerImpl2 = tapOnPhoneControllerImpl;
        createCharge3 = createCharge2;
        emvTerminalDataResponse = ((TransactionErrorResponseDto) objectRef.element).getGatewayResponseDto().getEmvTerminalDataResponse();
        if (emvTerminalDataResponse != null) {
            emvTerminalDataMapToLocalEmvTerminalData = EmvTerminalDataMapperKt.mapToLocalEmvTerminalData(emvTerminalDataResponse);
        } else {
            emvTerminalDataMapToLocalEmvTerminalData = null;
        }
        gatewayResponseDto = ((TransactionErrorResponseDto) objectRef.element).getGatewayResponseDto();
        bVar2.f83635p0 = intRef;
        bVar2.f83636q0 = intRef2;
        bVar2.f83637r0 = objectRef2;
        bVar2.f83638s0 = null;
        bVar2.f83639t0 = null;
        bVar2.f83640u0 = null;
        bVar2.v0 = null;
        bVar2.f83643y0 = 2;
        if (tapOnPhoneControllerImpl2.k(createCharge3, null, emvTerminalDataMapToLocalEmvTerminalData, connectedDeviceQ10, gatewayResponseDto, bVar2) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return new Result.Failure(new Error.Server(intRef2.element + "#" + intRef.element + "#" + objectRef2.element));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    /* JADX WARN: Code duplicated, block: B:31:0x00aa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00cd A[PHI: r13
      0x00cd: PHI (r13v18 java.lang.Object) = (r13v16 java.lang.Object), (r13v1 java.lang.Object) binds: [B:37:0x00ca, B:17:0x004d] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fa A[PHI: r13
      0x00fa: PHI (r13v19 java.lang.Object) = (r13v13 java.lang.Object), (r13v1 java.lang.Object) binds: [B:48:0x00f7, B:16:0x0048] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:64:0x0120 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x0125  */
    /* JADX WARN: Code duplicated, block: B:68:0x012c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0141 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x015e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:78:0x016d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x017f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x0188  */
    public final Object c(CreateCharge createCharge, Continuation<? super Result<Charge>> continuation) {
        d dVar;
        Object obj;
        CreateCharge createCharge2;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl;
        Result result;
        Result.Failure failure;
        Error error;
        String orderId;
        String orderId2;
        ConnectedDeviceQ8 connectedDeviceQ8;
        Charge charge;
        String id;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl2;
        Charge charge2;
        ConnectedDeviceQ8 connectedDeviceQ9;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper2;
        GatewayResponseDto gatewayResponseDto;
        String code;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i10 = dVar.f83656u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f83656u0 = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objB = dVar.f83654s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        switch (dVar.f83656u0) {
            case 0:
                ResultKt.throwOnFailure(objB);
                ConnectedDeviceQ8 connectedDeviceQ10 = this.f83630y;
                if (connectedDeviceQ10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ10 = null;
                }
                String serial = connectedDeviceQ10.getSerial();
                dVar.f83651p0 = this;
                dVar.f83652q0 = createCharge;
                dVar.f83656u0 = 1;
                Object objInvoke = this.f83625t.invoke(serial, createCharge, true, dVar);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = objInvoke;
                createCharge2 = createCharge;
                tapOnPhoneControllerImpl = this;
                result = (Result) obj;
                if (result instanceof Result.Success) {
                    charge = (Charge) mx.openpay.library.domain.util.ResultKt.getSuccessData(result);
                    id = charge.getId();
                    dVar.f83651p0 = tapOnPhoneControllerImpl;
                    dVar.f83652q0 = createCharge2;
                    dVar.f83653r0 = charge;
                    dVar.f83656u0 = 2;
                    if (tapOnPhoneControllerImpl.n(createCharge2, id, dVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    tapOnPhoneControllerImpl2 = tapOnPhoneControllerImpl;
                    charge2 = charge;
                    EmvTerminalData emvTerminalData = charge2.getEmvTerminalData();
                    connectedDeviceQ9 = tapOnPhoneControllerImpl2.f83630y;
                    if (connectedDeviceQ9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                        connectedDeviceQ9 = null;
                    }
                    dVar.f83651p0 = null;
                    dVar.f83652q0 = null;
                    dVar.f83653r0 = null;
                    dVar.f83656u0 = 3;
                    objB = tapOnPhoneControllerImpl2.k(createCharge2, charge2, emvTerminalData, connectedDeviceQ9, null, dVar);
                    if (objB == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objB;
                }
                if (result instanceof Result.Failure) {
                    throw new NoWhenBranchMatchedException();
                }
                failure = (Result.Failure) result;
                error = failure.getError();
                if (error instanceof Error.Server) {
                    connectedDeviceQ8 = tapOnPhoneControllerImpl.f83630y;
                    if (connectedDeviceQ8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                        connectedDeviceQ8 = null;
                    }
                    String errorBody = failure.getError().getErrorBody();
                    dVar.f83651p0 = null;
                    dVar.f83652q0 = null;
                    dVar.f83656u0 = 4;
                    objB = tapOnPhoneControllerImpl.b(createCharge2, connectedDeviceQ8, errorBody, dVar);
                    if (objB == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objB;
                }
                if ((error instanceof Error.TimeOut) || (error instanceof Error.BadGateway) || (error instanceof Error.ServiceUnavailable) || (error instanceof Error.InternalServer)) {
                    orderId = createCharge2.getOrderId();
                    dVar.f83651p0 = tapOnPhoneControllerImpl;
                    dVar.f83652q0 = null;
                    dVar.f83656u0 = 5;
                    if (tapOnPhoneControllerImpl.a(orderId, true, 0, dVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    tapOnPhonePinPadSdkWrapper = tapOnPhoneControllerImpl.f83629x;
                    if (tapOnPhonePinPadSdkWrapper == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                        tapOnPhonePinPadSdkWrapper2 = null;
                    } else {
                        tapOnPhonePinPadSdkWrapper2 = tapOnPhonePinPadSdkWrapper;
                    }
                    dVar.f83651p0 = null;
                    dVar.f83656u0 = 6;
                    if (tapOnPhonePinPadSdkWrapper2.hostResponseC54("02", "00", EglobalUtils.ISSUER_AUTH_DATA_9100, "", dVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return new Result.Failure(new Error.ServerErrors(null, 1, null));
                }
                orderId2 = createCharge2.getOrderId();
                dVar.f83651p0 = tapOnPhoneControllerImpl;
                dVar.f83652q0 = null;
                dVar.f83656u0 = 7;
                if (tapOnPhoneControllerImpl.a(orderId2, true, 0, dVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                gatewayResponseDto = new GatewayResponseDto(null, null, 3, null);
                tapOnPhoneControllerImpl.getClass();
                code = gatewayResponseDto.getCode();
                if (code == null) {
                    code = "00";
                }
                tapOnPhoneControllerImpl.A = code;
                dVar.f83651p0 = null;
                dVar.f83656u0 = 8;
                if (tapOnPhoneControllerImpl.p(null, "", gatewayResponseDto, dVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return new Result.Failure(Error.TimeOut.INSTANCE);
            case 1:
                CreateCharge createCharge3 = dVar.f83652q0;
                TapOnPhoneControllerImpl tapOnPhoneControllerImpl3 = dVar.f83651p0;
                ResultKt.throwOnFailure(objB);
                createCharge2 = createCharge3;
                tapOnPhoneControllerImpl = tapOnPhoneControllerImpl3;
                obj = objB;
                result = (Result) obj;
                if (result instanceof Result.Success) {
                    charge = (Charge) mx.openpay.library.domain.util.ResultKt.getSuccessData(result);
                    id = charge.getId();
                    dVar.f83651p0 = tapOnPhoneControllerImpl;
                    dVar.f83652q0 = createCharge2;
                    dVar.f83653r0 = charge;
                    dVar.f83656u0 = 2;
                    if (tapOnPhoneControllerImpl.n(createCharge2, id, dVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    tapOnPhoneControllerImpl2 = tapOnPhoneControllerImpl;
                    charge2 = charge;
                    EmvTerminalData emvTerminalData2 = charge2.getEmvTerminalData();
                    connectedDeviceQ9 = tapOnPhoneControllerImpl2.f83630y;
                    if (connectedDeviceQ9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                        connectedDeviceQ9 = null;
                    }
                    dVar.f83651p0 = null;
                    dVar.f83652q0 = null;
                    dVar.f83653r0 = null;
                    dVar.f83656u0 = 3;
                    objB = tapOnPhoneControllerImpl2.k(createCharge2, charge2, emvTerminalData2, connectedDeviceQ9, null, dVar);
                    if (objB == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objB;
                }
                if (result instanceof Result.Failure) {
                    throw new NoWhenBranchMatchedException();
                }
                failure = (Result.Failure) result;
                error = failure.getError();
                if (error instanceof Error.Server) {
                    connectedDeviceQ8 = tapOnPhoneControllerImpl.f83630y;
                    if (connectedDeviceQ8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                        connectedDeviceQ8 = null;
                    }
                    String errorBody2 = failure.getError().getErrorBody();
                    dVar.f83651p0 = null;
                    dVar.f83652q0 = null;
                    dVar.f83656u0 = 4;
                    objB = tapOnPhoneControllerImpl.b(createCharge2, connectedDeviceQ8, errorBody2, dVar);
                    if (objB == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objB;
                }
                if (error instanceof Error.TimeOut) {
                    orderId2 = createCharge2.getOrderId();
                    dVar.f83651p0 = tapOnPhoneControllerImpl;
                    dVar.f83652q0 = null;
                    dVar.f83656u0 = 7;
                    if (tapOnPhoneControllerImpl.a(orderId2, true, 0, dVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    gatewayResponseDto = new GatewayResponseDto(null, null, 3, null);
                    tapOnPhoneControllerImpl.getClass();
                    code = gatewayResponseDto.getCode();
                    if (code == null) {
                        code = "00";
                    }
                    tapOnPhoneControllerImpl.A = code;
                    dVar.f83651p0 = null;
                    dVar.f83656u0 = 8;
                    if (tapOnPhoneControllerImpl.p(null, "", gatewayResponseDto, dVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return new Result.Failure(Error.TimeOut.INSTANCE);
                }
                orderId = createCharge2.getOrderId();
                dVar.f83651p0 = tapOnPhoneControllerImpl;
                dVar.f83652q0 = null;
                dVar.f83656u0 = 5;
                if (tapOnPhoneControllerImpl.a(orderId, true, 0, dVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tapOnPhonePinPadSdkWrapper = tapOnPhoneControllerImpl.f83629x;
                if (tapOnPhonePinPadSdkWrapper == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                    tapOnPhonePinPadSdkWrapper2 = null;
                } else {
                    tapOnPhonePinPadSdkWrapper2 = tapOnPhonePinPadSdkWrapper;
                }
                dVar.f83651p0 = null;
                dVar.f83656u0 = 6;
                if (tapOnPhonePinPadSdkWrapper2.hostResponseC54("02", "00", EglobalUtils.ISSUER_AUTH_DATA_9100, "", dVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return new Result.Failure(new Error.ServerErrors(null, 1, null));
            case 2:
                charge2 = dVar.f83653r0;
                CreateCharge createCharge4 = dVar.f83652q0;
                TapOnPhoneControllerImpl tapOnPhoneControllerImpl4 = dVar.f83651p0;
                ResultKt.throwOnFailure(objB);
                createCharge2 = createCharge4;
                tapOnPhoneControllerImpl2 = tapOnPhoneControllerImpl4;
                EmvTerminalData emvTerminalData3 = charge2.getEmvTerminalData();
                connectedDeviceQ9 = tapOnPhoneControllerImpl2.f83630y;
                if (connectedDeviceQ9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ9 = null;
                }
                dVar.f83651p0 = null;
                dVar.f83652q0 = null;
                dVar.f83653r0 = null;
                dVar.f83656u0 = 3;
                objB = tapOnPhoneControllerImpl2.k(createCharge2, charge2, emvTerminalData3, connectedDeviceQ9, null, dVar);
                if (objB == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objB;
            case 3:
                ResultKt.throwOnFailure(objB);
                return objB;
            case 4:
                ResultKt.throwOnFailure(objB);
                return objB;
            case 5:
                tapOnPhoneControllerImpl = dVar.f83651p0;
                ResultKt.throwOnFailure(objB);
                tapOnPhonePinPadSdkWrapper = tapOnPhoneControllerImpl.f83629x;
                if (tapOnPhonePinPadSdkWrapper == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                    tapOnPhonePinPadSdkWrapper2 = null;
                } else {
                    tapOnPhonePinPadSdkWrapper2 = tapOnPhonePinPadSdkWrapper;
                }
                dVar.f83651p0 = null;
                dVar.f83656u0 = 6;
                if (tapOnPhonePinPadSdkWrapper2.hostResponseC54("02", "00", EglobalUtils.ISSUER_AUTH_DATA_9100, "", dVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return new Result.Failure(new Error.ServerErrors(null, 1, null));
            case 6:
                ResultKt.throwOnFailure(objB);
                return new Result.Failure(new Error.ServerErrors(null, 1, null));
            case 7:
                tapOnPhoneControllerImpl = dVar.f83651p0;
                ResultKt.throwOnFailure(objB);
                gatewayResponseDto = new GatewayResponseDto(null, null, 3, null);
                tapOnPhoneControllerImpl.getClass();
                code = gatewayResponseDto.getCode();
                if (code == null) {
                    code = "00";
                }
                tapOnPhoneControllerImpl.A = code;
                dVar.f83651p0 = null;
                dVar.f83656u0 = 8;
                if (tapOnPhoneControllerImpl.p(null, "", gatewayResponseDto, dVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return new Result.Failure(Error.TimeOut.INSTANCE);
            case 8:
                ResultKt.throwOnFailure(objB);
                return new Result.Failure(Error.TimeOut.INSTANCE);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // mx.openpay.library.domain.taponphone.TapOnPhoneController
    @Nullable
    public Object cancelProcess(@NotNull Continuation<? super Unit> continuation) {
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper = this.f83629x;
        if (tapOnPhonePinPadSdkWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
            tapOnPhonePinPadSdkWrapper = null;
        }
        tapOnPhonePinPadSdkWrapper.clearPendingProcess();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:37:0x0103  */
    /* JADX WARN: Code duplicated, block: B:40:0x0115 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0116  */
    /* JADX WARN: Code duplicated, block: B:44:0x0120  */
    /* JADX WARN: Code duplicated, block: B:46:0x0124  */
    /* JADX WARN: Code duplicated, block: B:49:0x012c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0131  */
    /* JADX WARN: Code duplicated, block: B:53:0x0140  */
    /* JADX WARN: Code duplicated, block: B:56:0x0150  */
    /* JADX WARN: Code duplicated, block: B:59:0x0179 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x017a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0198 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x0199 A[PHI: r2
      0x0199: PHI (r2v26 java.lang.Object) = (r2v25 java.lang.Object), (r2v1 java.lang.Object) binds: [B:62:0x0196, B:14:0x0057] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x019a  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:72:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:73:0x01af  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:83:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:86:0x0201 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x0202  */
    /* JADX WARN: Code duplicated, block: B:90:0x0220 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:91:0x0221 A[PHI: r2
      0x0221: PHI (r2v29 java.lang.Object) = (r2v28 java.lang.Object), (r2v1 java.lang.Object) binds: [B:89:0x021e, B:12:0x0036] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    @Override // mx.openpay.library.domain.taponphone.TapOnPhoneController
    @Nullable
    public Object createCharge(@NotNull TapOnPhoneChargeRequest tapOnPhoneChargeRequest, @NotNull TapOnPhoneCallback tapOnPhoneCallback, @NotNull Continuation<? super Result<Charge>> continuation) {
        c cVar;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl;
        Object obj;
        TapOnPhoneCallback tapOnPhoneCallback2;
        TapOnPhoneChargeRequest tapOnPhoneChargeRequest2;
        ConnectedDeviceQ8 connectedDeviceQ8;
        ConnectedDeviceQ8 connectedDeviceQ9;
        Merchant merchant;
        Merchant merchant2;
        Merchant merchant3;
        Merchant merchant4;
        Merchant merchant5;
        Object objJ;
        TapOnPhoneChargeRequest tapOnPhoneChargeRequest3;
        TapOnPhoneCallback tapOnPhoneCallback3;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl2;
        ConnectedDeviceQ8 connectedDeviceQ10;
        Merchant merchant6;
        ConnectedDeviceQ8 connectedDeviceQ11;
        Merchant merchant7;
        Object objE;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl3;
        TapOnPhoneChargeRequest tapOnPhoneChargeRequest4;
        TapOnPhoneCallback tapOnPhoneCallback4;
        Result result;
        ConnectedDeviceQ8 connectedDeviceQ12;
        Merchant merchant8;
        Merchant merchant9;
        Merchant merchant10;
        Merchant merchant11;
        Merchant merchant12;
        Object objJ2;
        TapOnPhoneCallback tapOnPhoneCallback5;
        ConnectedDeviceQ8 connectedDeviceQ13;
        TapOnPhoneChargeRequest tapOnPhoneChargeRequest5;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl4;
        Merchant merchant13;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i10 = cVar.f83650w0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f83650w0 = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objM = cVar.f83649u0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        switch (cVar.f83650w0) {
            case 0:
                ResultKt.throwOnFailure(objM);
                if (this.f83631z == null) {
                    return new Result.Failure(new Error.UninitializedTapOnPhoneSDK(null, 1, null));
                }
                this.B = false;
                tapOnPhoneCallback.execute(new TapOnPhoneCallbackStates.NotifyUser(NotifyUserItem.PROCESSING));
                Merchant merchant14 = this.f83631z;
                if (merchant14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant14 = null;
                }
                int i11 = Integer.parseInt(merchant14.getSlotKey().getSlotKey());
                ConnectedDeviceQ8 connectedDeviceQ14 = this.f83630y;
                if (connectedDeviceQ14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ14 = null;
                }
                String serial = connectedDeviceQ14.getSerial();
                cVar.f83644p0 = this;
                cVar.f83645q0 = tapOnPhoneChargeRequest;
                cVar.f83646r0 = tapOnPhoneCallback;
                cVar.f83650w0 = 1;
                Object objInvoke = this.f83616j.invoke(i11, serial, cVar);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tapOnPhoneControllerImpl = this;
                obj = objInvoke;
                tapOnPhoneCallback2 = tapOnPhoneCallback;
                tapOnPhoneChargeRequest2 = tapOnPhoneChargeRequest;
                if (((Number) obj).intValue() == 2) {
                    connectedDeviceQ8 = tapOnPhoneControllerImpl.f83630y;
                    if (connectedDeviceQ8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                        connectedDeviceQ9 = null;
                    } else {
                        connectedDeviceQ9 = connectedDeviceQ8;
                    }
                    merchant = tapOnPhoneControllerImpl.f83631z;
                    if (merchant == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                        merchant2 = null;
                    } else {
                        merchant2 = merchant;
                    }
                    String amount = EglobalUtils.INSTANCE.parseAmount(tapOnPhoneChargeRequest2.getCom.bbva.notifications.constants.PushConstants.AMOUNT java.lang.String());
                    merchant3 = tapOnPhoneControllerImpl.f83631z;
                    if (merchant3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                        merchant3 = null;
                    }
                    String keyName = merchant3.getSlotKey().getKeyName();
                    merchant4 = tapOnPhoneControllerImpl.f83631z;
                    if (merchant4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                        merchant4 = null;
                    }
                    String slotKey = merchant4.getSlotKey().getSlotKey();
                    String orderId = tapOnPhoneChargeRequest2.getOrderId();
                    cVar.f83644p0 = tapOnPhoneCallback2;
                    cVar.f83645q0 = tapOnPhoneControllerImpl;
                    cVar.f83646r0 = connectedDeviceQ9;
                    cVar.f83647s0 = merchant2;
                    cVar.f83648t0 = tapOnPhoneChargeRequest2;
                    cVar.f83650w0 = 5;
                    merchant5 = merchant2;
                    objJ = tapOnPhoneControllerImpl.j(amount, true, keyName, slotKey, orderId, tapOnPhoneCallback2, cVar);
                    if (objJ == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    tapOnPhoneChargeRequest3 = tapOnPhoneChargeRequest2;
                    tapOnPhoneCallback3 = tapOnPhoneCallback2;
                    objM = objJ;
                    tapOnPhoneControllerImpl2 = tapOnPhoneControllerImpl;
                    connectedDeviceQ10 = connectedDeviceQ9;
                    merchant6 = merchant5;
                    cVar.f83644p0 = null;
                    cVar.f83645q0 = null;
                    cVar.f83646r0 = null;
                    cVar.f83647s0 = null;
                    cVar.f83648t0 = null;
                    cVar.f83650w0 = 6;
                    objM = tapOnPhoneControllerImpl2.m(connectedDeviceQ10, merchant6, tapOnPhoneChargeRequest3, (Result) objM, tapOnPhoneCallback3, cVar);
                    if (objM == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objM;
                }
                connectedDeviceQ11 = tapOnPhoneControllerImpl.f83630y;
                if (connectedDeviceQ11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ11 = null;
                }
                merchant7 = tapOnPhoneControllerImpl.f83631z;
                if (merchant7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant7 = null;
                }
                cVar.f83644p0 = tapOnPhoneControllerImpl;
                cVar.f83645q0 = tapOnPhoneChargeRequest2;
                cVar.f83646r0 = tapOnPhoneCallback2;
                cVar.f83650w0 = 2;
                objE = tapOnPhoneControllerImpl.e(connectedDeviceQ11, merchant7, tapOnPhoneCallback2, cVar);
                if (objE == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tapOnPhoneControllerImpl3 = tapOnPhoneControllerImpl;
                tapOnPhoneChargeRequest4 = tapOnPhoneChargeRequest2;
                tapOnPhoneCallback4 = tapOnPhoneCallback2;
                objM = objE;
                result = (Result) objM;
                if (!(result instanceof Result.Success)) {
                    if (result instanceof Result.Failure) {
                        return result;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                connectedDeviceQ12 = tapOnPhoneControllerImpl3.f83630y;
                if (connectedDeviceQ12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ12 = null;
                }
                merchant8 = tapOnPhoneControllerImpl3.f83631z;
                if (merchant8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant9 = null;
                } else {
                    merchant9 = merchant8;
                }
                String amount2 = EglobalUtils.INSTANCE.parseAmount(tapOnPhoneChargeRequest4.getCom.bbva.notifications.constants.PushConstants.AMOUNT java.lang.String());
                merchant10 = tapOnPhoneControllerImpl3.f83631z;
                if (merchant10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant10 = null;
                }
                String keyName2 = merchant10.getSlotKey().getKeyName();
                merchant11 = tapOnPhoneControllerImpl3.f83631z;
                if (merchant11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant11 = null;
                }
                String slotKey2 = merchant11.getSlotKey().getSlotKey();
                String orderId2 = tapOnPhoneChargeRequest4.getOrderId();
                cVar.f83644p0 = tapOnPhoneCallback4;
                cVar.f83645q0 = tapOnPhoneControllerImpl3;
                cVar.f83646r0 = connectedDeviceQ12;
                cVar.f83647s0 = merchant9;
                cVar.f83648t0 = tapOnPhoneChargeRequest4;
                cVar.f83650w0 = 3;
                merchant12 = merchant9;
                objJ2 = tapOnPhoneControllerImpl3.j(amount2, true, keyName2, slotKey2, orderId2, tapOnPhoneCallback4, cVar);
                if (objJ2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tapOnPhoneCallback5 = tapOnPhoneCallback4;
                connectedDeviceQ13 = connectedDeviceQ12;
                objM = objJ2;
                tapOnPhoneChargeRequest5 = tapOnPhoneChargeRequest4;
                tapOnPhoneControllerImpl4 = tapOnPhoneControllerImpl3;
                merchant13 = merchant12;
                cVar.f83644p0 = null;
                cVar.f83645q0 = null;
                cVar.f83646r0 = null;
                cVar.f83647s0 = null;
                cVar.f83648t0 = null;
                cVar.f83650w0 = 4;
                objM = tapOnPhoneControllerImpl4.m(connectedDeviceQ13, merchant13, tapOnPhoneChargeRequest5, (Result) objM, tapOnPhoneCallback5, cVar);
                if (objM == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objM;
            case 1:
                TapOnPhoneCallback tapOnPhoneCallback6 = (TapOnPhoneCallback) cVar.f83646r0;
                TapOnPhoneChargeRequest tapOnPhoneChargeRequest6 = (TapOnPhoneChargeRequest) cVar.f83645q0;
                TapOnPhoneControllerImpl tapOnPhoneControllerImpl5 = (TapOnPhoneControllerImpl) cVar.f83644p0;
                ResultKt.throwOnFailure(objM);
                tapOnPhoneControllerImpl = tapOnPhoneControllerImpl5;
                tapOnPhoneCallback2 = tapOnPhoneCallback6;
                tapOnPhoneChargeRequest2 = tapOnPhoneChargeRequest6;
                obj = objM;
                if (((Number) obj).intValue() == 2) {
                    connectedDeviceQ8 = tapOnPhoneControllerImpl.f83630y;
                    if (connectedDeviceQ8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                        connectedDeviceQ9 = null;
                    } else {
                        connectedDeviceQ9 = connectedDeviceQ8;
                    }
                    merchant = tapOnPhoneControllerImpl.f83631z;
                    if (merchant == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                        merchant2 = null;
                    } else {
                        merchant2 = merchant;
                    }
                    String amount3 = EglobalUtils.INSTANCE.parseAmount(tapOnPhoneChargeRequest2.getCom.bbva.notifications.constants.PushConstants.AMOUNT java.lang.String());
                    merchant3 = tapOnPhoneControllerImpl.f83631z;
                    if (merchant3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                        merchant3 = null;
                    }
                    String keyName3 = merchant3.getSlotKey().getKeyName();
                    merchant4 = tapOnPhoneControllerImpl.f83631z;
                    if (merchant4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                        merchant4 = null;
                    }
                    String slotKey3 = merchant4.getSlotKey().getSlotKey();
                    String orderId3 = tapOnPhoneChargeRequest2.getOrderId();
                    cVar.f83644p0 = tapOnPhoneCallback2;
                    cVar.f83645q0 = tapOnPhoneControllerImpl;
                    cVar.f83646r0 = connectedDeviceQ9;
                    cVar.f83647s0 = merchant2;
                    cVar.f83648t0 = tapOnPhoneChargeRequest2;
                    cVar.f83650w0 = 5;
                    merchant5 = merchant2;
                    objJ = tapOnPhoneControllerImpl.j(amount3, true, keyName3, slotKey3, orderId3, tapOnPhoneCallback2, cVar);
                    if (objJ == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    tapOnPhoneChargeRequest3 = tapOnPhoneChargeRequest2;
                    tapOnPhoneCallback3 = tapOnPhoneCallback2;
                    objM = objJ;
                    tapOnPhoneControllerImpl2 = tapOnPhoneControllerImpl;
                    connectedDeviceQ10 = connectedDeviceQ9;
                    merchant6 = merchant5;
                    cVar.f83644p0 = null;
                    cVar.f83645q0 = null;
                    cVar.f83646r0 = null;
                    cVar.f83647s0 = null;
                    cVar.f83648t0 = null;
                    cVar.f83650w0 = 6;
                    objM = tapOnPhoneControllerImpl2.m(connectedDeviceQ10, merchant6, tapOnPhoneChargeRequest3, (Result) objM, tapOnPhoneCallback3, cVar);
                    if (objM == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objM;
                }
                connectedDeviceQ11 = tapOnPhoneControllerImpl.f83630y;
                if (connectedDeviceQ11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ11 = null;
                }
                merchant7 = tapOnPhoneControllerImpl.f83631z;
                if (merchant7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant7 = null;
                }
                cVar.f83644p0 = tapOnPhoneControllerImpl;
                cVar.f83645q0 = tapOnPhoneChargeRequest2;
                cVar.f83646r0 = tapOnPhoneCallback2;
                cVar.f83650w0 = 2;
                objE = tapOnPhoneControllerImpl.e(connectedDeviceQ11, merchant7, tapOnPhoneCallback2, cVar);
                if (objE == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tapOnPhoneControllerImpl3 = tapOnPhoneControllerImpl;
                tapOnPhoneChargeRequest4 = tapOnPhoneChargeRequest2;
                tapOnPhoneCallback4 = tapOnPhoneCallback2;
                objM = objE;
                result = (Result) objM;
                if (!(result instanceof Result.Success)) {
                    if (result instanceof Result.Failure) {
                        return result;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                connectedDeviceQ12 = tapOnPhoneControllerImpl3.f83630y;
                if (connectedDeviceQ12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ12 = null;
                }
                merchant8 = tapOnPhoneControllerImpl3.f83631z;
                if (merchant8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant9 = null;
                } else {
                    merchant9 = merchant8;
                }
                String amount4 = EglobalUtils.INSTANCE.parseAmount(tapOnPhoneChargeRequest4.getCom.bbva.notifications.constants.PushConstants.AMOUNT java.lang.String());
                merchant10 = tapOnPhoneControllerImpl3.f83631z;
                if (merchant10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant10 = null;
                }
                String keyName4 = merchant10.getSlotKey().getKeyName();
                merchant11 = tapOnPhoneControllerImpl3.f83631z;
                if (merchant11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant11 = null;
                }
                String slotKey4 = merchant11.getSlotKey().getSlotKey();
                String orderId4 = tapOnPhoneChargeRequest4.getOrderId();
                cVar.f83644p0 = tapOnPhoneCallback4;
                cVar.f83645q0 = tapOnPhoneControllerImpl3;
                cVar.f83646r0 = connectedDeviceQ12;
                cVar.f83647s0 = merchant9;
                cVar.f83648t0 = tapOnPhoneChargeRequest4;
                cVar.f83650w0 = 3;
                merchant12 = merchant9;
                objJ2 = tapOnPhoneControllerImpl3.j(amount4, true, keyName4, slotKey4, orderId4, tapOnPhoneCallback4, cVar);
                if (objJ2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tapOnPhoneCallback5 = tapOnPhoneCallback4;
                connectedDeviceQ13 = connectedDeviceQ12;
                objM = objJ2;
                tapOnPhoneChargeRequest5 = tapOnPhoneChargeRequest4;
                tapOnPhoneControllerImpl4 = tapOnPhoneControllerImpl3;
                merchant13 = merchant12;
                cVar.f83644p0 = null;
                cVar.f83645q0 = null;
                cVar.f83646r0 = null;
                cVar.f83647s0 = null;
                cVar.f83648t0 = null;
                cVar.f83650w0 = 4;
                objM = tapOnPhoneControllerImpl4.m(connectedDeviceQ13, merchant13, tapOnPhoneChargeRequest5, (Result) objM, tapOnPhoneCallback5, cVar);
                if (objM == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objM;
            case 2:
                tapOnPhoneCallback4 = (TapOnPhoneCallback) cVar.f83646r0;
                TapOnPhoneChargeRequest tapOnPhoneChargeRequest7 = (TapOnPhoneChargeRequest) cVar.f83645q0;
                TapOnPhoneControllerImpl tapOnPhoneControllerImpl6 = (TapOnPhoneControllerImpl) cVar.f83644p0;
                ResultKt.throwOnFailure(objM);
                tapOnPhoneChargeRequest4 = tapOnPhoneChargeRequest7;
                tapOnPhoneControllerImpl3 = tapOnPhoneControllerImpl6;
                result = (Result) objM;
                if (!(result instanceof Result.Success)) {
                    if (result instanceof Result.Failure) {
                        return result;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                connectedDeviceQ12 = tapOnPhoneControllerImpl3.f83630y;
                if (connectedDeviceQ12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ12 = null;
                }
                merchant8 = tapOnPhoneControllerImpl3.f83631z;
                if (merchant8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant9 = null;
                } else {
                    merchant9 = merchant8;
                }
                String amount5 = EglobalUtils.INSTANCE.parseAmount(tapOnPhoneChargeRequest4.getCom.bbva.notifications.constants.PushConstants.AMOUNT java.lang.String());
                merchant10 = tapOnPhoneControllerImpl3.f83631z;
                if (merchant10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant10 = null;
                }
                String keyName5 = merchant10.getSlotKey().getKeyName();
                merchant11 = tapOnPhoneControllerImpl3.f83631z;
                if (merchant11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant11 = null;
                }
                String slotKey5 = merchant11.getSlotKey().getSlotKey();
                String orderId5 = tapOnPhoneChargeRequest4.getOrderId();
                cVar.f83644p0 = tapOnPhoneCallback4;
                cVar.f83645q0 = tapOnPhoneControllerImpl3;
                cVar.f83646r0 = connectedDeviceQ12;
                cVar.f83647s0 = merchant9;
                cVar.f83648t0 = tapOnPhoneChargeRequest4;
                cVar.f83650w0 = 3;
                merchant12 = merchant9;
                objJ2 = tapOnPhoneControllerImpl3.j(amount5, true, keyName5, slotKey5, orderId5, tapOnPhoneCallback4, cVar);
                if (objJ2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tapOnPhoneCallback5 = tapOnPhoneCallback4;
                connectedDeviceQ13 = connectedDeviceQ12;
                objM = objJ2;
                tapOnPhoneChargeRequest5 = tapOnPhoneChargeRequest4;
                tapOnPhoneControllerImpl4 = tapOnPhoneControllerImpl3;
                merchant13 = merchant12;
                cVar.f83644p0 = null;
                cVar.f83645q0 = null;
                cVar.f83646r0 = null;
                cVar.f83647s0 = null;
                cVar.f83648t0 = null;
                cVar.f83650w0 = 4;
                objM = tapOnPhoneControllerImpl4.m(connectedDeviceQ13, merchant13, tapOnPhoneChargeRequest5, (Result) objM, tapOnPhoneCallback5, cVar);
                if (objM == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objM;
            case 3:
                TapOnPhoneChargeRequest tapOnPhoneChargeRequest8 = cVar.f83648t0;
                Merchant merchant15 = cVar.f83647s0;
                connectedDeviceQ13 = (ConnectedDeviceQ8) cVar.f83646r0;
                TapOnPhoneControllerImpl tapOnPhoneControllerImpl7 = (TapOnPhoneControllerImpl) cVar.f83645q0;
                TapOnPhoneCallback tapOnPhoneCallback7 = (TapOnPhoneCallback) cVar.f83644p0;
                ResultKt.throwOnFailure(objM);
                tapOnPhoneCallback5 = tapOnPhoneCallback7;
                tapOnPhoneChargeRequest5 = tapOnPhoneChargeRequest8;
                merchant13 = merchant15;
                tapOnPhoneControllerImpl4 = tapOnPhoneControllerImpl7;
                cVar.f83644p0 = null;
                cVar.f83645q0 = null;
                cVar.f83646r0 = null;
                cVar.f83647s0 = null;
                cVar.f83648t0 = null;
                cVar.f83650w0 = 4;
                objM = tapOnPhoneControllerImpl4.m(connectedDeviceQ13, merchant13, tapOnPhoneChargeRequest5, (Result) objM, tapOnPhoneCallback5, cVar);
                if (objM == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objM;
            case 4:
                ResultKt.throwOnFailure(objM);
                return objM;
            case 5:
                TapOnPhoneChargeRequest tapOnPhoneChargeRequest9 = cVar.f83648t0;
                Merchant merchant16 = cVar.f83647s0;
                connectedDeviceQ10 = (ConnectedDeviceQ8) cVar.f83646r0;
                TapOnPhoneControllerImpl tapOnPhoneControllerImpl8 = (TapOnPhoneControllerImpl) cVar.f83645q0;
                TapOnPhoneCallback tapOnPhoneCallback8 = (TapOnPhoneCallback) cVar.f83644p0;
                ResultKt.throwOnFailure(objM);
                tapOnPhoneCallback3 = tapOnPhoneCallback8;
                tapOnPhoneChargeRequest3 = tapOnPhoneChargeRequest9;
                merchant6 = merchant16;
                tapOnPhoneControllerImpl2 = tapOnPhoneControllerImpl8;
                cVar.f83644p0 = null;
                cVar.f83645q0 = null;
                cVar.f83646r0 = null;
                cVar.f83647s0 = null;
                cVar.f83648t0 = null;
                cVar.f83650w0 = 6;
                objM = tapOnPhoneControllerImpl2.m(connectedDeviceQ10, merchant6, tapOnPhoneChargeRequest3, (Result) objM, tapOnPhoneCallback3, cVar);
                if (objM == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objM;
            case 6:
                ResultKt.throwOnFailure(objM);
                return objM;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // mx.openpay.library.domain.taponphone.TapOnPhoneController
    @Nullable
    public Object createChargePlansStep(@NotNull CreateCharge createCharge, @NotNull TapOnPhoneCallback tapOnPhoneCallback, int i10, @NotNull Continuation<? super Result<Charge>> continuation) {
        if (i10 > 0) {
            createCharge = createCharge.copy((127 & 1) != 0 ? createCharge.com.bbva.notifications.constants.PushConstants.AMOUNT java.lang.String : null, (127 & 2) != 0 ? createCharge.currency : null, (127 & 4) != 0 ? createCharge.description : null, (127 & 8) != 0 ? createCharge.encryptedCard : null, (127 & 16) != 0 ? createCharge.method : null, (127 & 32) != 0 ? createCharge.orderId : null, (127 & 64) != 0 ? createCharge.useCardPoints : false, (127 & 128) != 0 ? createCharge.paymentPlan : new PaymentPlan(i10, PaymentType.WITHOUT_INTEREST));
        }
        return o(createCharge, tapOnPhoneCallback, continuation);
    }

    @Override // mx.openpay.library.domain.taponphone.TapOnPhoneController
    @Nullable
    public Object createChargePointsStep(@NotNull CreateCharge createCharge, @NotNull TapOnPhoneCallback tapOnPhoneCallback, boolean z10, @NotNull Continuation<? super Result<Charge>> continuation) {
        createCharge.setUseCardPoints(z10);
        return z10 ? o(createCharge, tapOnPhoneCallback, continuation) : q(createCharge.getAmount().doubleValue(), createCharge, tapOnPhoneCallback, continuation);
    }

    @Override // mx.openpay.library.domain.taponphone.TapOnPhoneController
    @Nullable
    public Object createChargeSignStep(@NotNull CreateCharge createCharge, @NotNull String str, @NotNull Continuation<? super Result<Charge>> continuation) {
        if (str.length() > 0) {
            createCharge.getEncryptedCard().setHexSign(str);
            return c(createCharge, continuation);
        }
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper = this.f83629x;
        if (tapOnPhonePinPadSdkWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
            tapOnPhonePinPadSdkWrapper = null;
        }
        tapOnPhonePinPadSdkWrapper.clearPendingProcess();
        return new Result.Failure(new Error.InvalidDigitalSign(null, 1, null));
    }

    @Override // mx.openpay.library.domain.taponphone.TapOnPhoneController
    @Nullable
    public Object createdTsdkManualInitializer(@NotNull Application application, @NotNull Continuation<? super Result<Boolean>> continuation) {
        TsdkManualInitializer.INSTANCE.applicationCreated(application);
        return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, String str2, Charge charge, CreateCharge createCharge, GatewayResponseDto gatewayResponseDto, Continuation<? super Result<Charge>> continuation) {
        e eVar;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i10 = eVar.f83662u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f83662u0 = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object objP = eVar.f83660s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = eVar.f83662u0;
        if (i11 != 0) {
            if (i11 == 1) {
                tapOnPhoneControllerImpl = eVar.f83659r0;
                createCharge = eVar.f83658q0;
                charge = eVar.f83657p0;
                ResultKt.throwOnFailure(objP);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objP);
            }
        }
        ResultKt.throwOnFailure(objP);
        eVar.f83657p0 = charge;
        eVar.f83658q0 = createCharge;
        eVar.f83659r0 = this;
        eVar.f83662u0 = 1;
        objP = p(str, str2, gatewayResponseDto, eVar);
        if (objP == coroutine_suspended) {
            return coroutine_suspended;
        }
        tapOnPhoneControllerImpl = this;
        eVar.f83657p0 = null;
        eVar.f83658q0 = null;
        eVar.f83659r0 = null;
        eVar.f83662u0 = 2;
        objP = tapOnPhoneControllerImpl.h((Result) objP, charge, createCharge, eVar);
        return objP == coroutine_suspended ? coroutine_suspended : objP;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00df  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f0 A[PHI: r2
      0x00f0: PHI (r2v19 java.lang.Object) = (r2v18 java.lang.Object), (r2v1 java.lang.Object) binds: [B:39:0x00ed, B:17:0x004a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:46:0x0116 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0117  */
    /* JADX WARN: Code duplicated, block: B:50:0x011d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0121  */
    /* JADX WARN: Code duplicated, block: B:53:0x0131  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object e(ConnectedDeviceQ8 connectedDeviceQ8, Merchant merchant, TapOnPhoneCallback tapOnPhoneCallback, Continuation<? super Result<Boolean>> continuation) {
        f fVar;
        ConnectedDeviceQ8 connectedDeviceQ9;
        Merchant merchant2;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl;
        Merchant merchant3;
        Result result;
        UpdateRenewKeyBySlotAndTerminalUseCase updateRenewKeyBySlotAndTerminalUseCase;
        int i10;
        String serial;
        Result result2;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl2;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i11 = fVar.f83668u0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f83668u0 = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        Object objRequestRandomKeyZ10 = fVar.f83666s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i12 = fVar.f83668u0;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper2 = null;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objRequestRandomKeyZ10);
            if (tapOnPhoneCallback != null) {
                tapOnPhoneCallback.execute(new TapOnPhoneCallbackStates.NotifyUser(NotifyUserItem.INITIALIZE_KEYS));
            }
            TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper3 = this.f83629x;
            if (tapOnPhonePinPadSdkWrapper3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                tapOnPhonePinPadSdkWrapper3 = null;
            }
            String keyName = merchant.getSlotKey().getKeyName();
            fVar.f83663p0 = this;
            connectedDeviceQ9 = connectedDeviceQ8;
            fVar.f83664q0 = connectedDeviceQ9;
            merchant2 = merchant;
            fVar.f83665r0 = merchant2;
            fVar.f83668u0 = 1;
            objRequestRandomKeyZ10 = tapOnPhonePinPadSdkWrapper3.requestRandomKeyZ10(keyName, fVar);
            if (objRequestRandomKeyZ10 == coroutine_suspended) {
                return coroutine_suspended;
            }
            tapOnPhoneControllerImpl = this;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        ResultKt.throwOnFailure(objRequestRandomKeyZ10);
                        return objRequestRandomKeyZ10;
                    }
                    if (i12 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    result2 = (Result) fVar.f83664q0;
                    tapOnPhoneControllerImpl2 = fVar.f83663p0;
                    ResultKt.throwOnFailure(objRequestRandomKeyZ10);
                    tapOnPhonePinPadSdkWrapper = tapOnPhoneControllerImpl2.f83629x;
                    if (tapOnPhonePinPadSdkWrapper == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                    } else {
                        tapOnPhonePinPadSdkWrapper2 = tapOnPhonePinPadSdkWrapper;
                    }
                    tapOnPhonePinPadSdkWrapper2.clearPendingProcess();
                    return new Result.Failure(((Result.Failure) result2).getError());
                }
                merchant3 = fVar.f83665r0;
                connectedDeviceQ9 = (ConnectedDeviceQ8) fVar.f83664q0;
                tapOnPhoneControllerImpl = fVar.f83663p0;
                ResultKt.throwOnFailure(objRequestRandomKeyZ10);
                result = (Result) objRequestRandomKeyZ10;
                if (result instanceof Result.Success) {
                    fVar.f83663p0 = null;
                    fVar.f83664q0 = null;
                    fVar.f83665r0 = null;
                    fVar.f83668u0 = 3;
                    objRequestRandomKeyZ10 = tapOnPhoneControllerImpl.f(connectedDeviceQ9, (Result.Success) result, fVar);
                    if (objRequestRandomKeyZ10 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objRequestRandomKeyZ10;
                }
                if (result instanceof Result.Failure) {
                    throw new NoWhenBranchMatchedException();
                }
                updateRenewKeyBySlotAndTerminalUseCase = tapOnPhoneControllerImpl.f83618l;
                i10 = Integer.parseInt(merchant3.getSlotKey().getSlotKey());
                serial = connectedDeviceQ9.getSerial();
                fVar.f83663p0 = tapOnPhoneControllerImpl;
                fVar.f83664q0 = result;
                fVar.f83665r0 = null;
                fVar.f83668u0 = 4;
                if (updateRenewKeyBySlotAndTerminalUseCase.invoke(2, i10, serial, fVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result2 = result;
                tapOnPhoneControllerImpl2 = tapOnPhoneControllerImpl;
                tapOnPhonePinPadSdkWrapper = tapOnPhoneControllerImpl2.f83629x;
                if (tapOnPhonePinPadSdkWrapper == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                } else {
                    tapOnPhonePinPadSdkWrapper2 = tapOnPhonePinPadSdkWrapper;
                }
                tapOnPhonePinPadSdkWrapper2.clearPendingProcess();
                return new Result.Failure(((Result.Failure) result2).getError());
            }
            Merchant merchant4 = fVar.f83665r0;
            connectedDeviceQ9 = (ConnectedDeviceQ8) fVar.f83664q0;
            tapOnPhoneControllerImpl = fVar.f83663p0;
            ResultKt.throwOnFailure(objRequestRandomKeyZ10);
            merchant2 = merchant4;
        }
        Result result3 = (Result) objRequestRandomKeyZ10;
        if (!(result3 instanceof Result.Success)) {
            if (!(result3 instanceof Result.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper4 = tapOnPhoneControllerImpl.f83629x;
            if (tapOnPhonePinPadSdkWrapper4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
            } else {
                tapOnPhonePinPadSdkWrapper2 = tapOnPhonePinPadSdkWrapper4;
            }
            tapOnPhonePinPadSdkWrapper2.clearPendingProcess();
            return new Result.Failure(((Result.Failure) result3).getError());
        }
        InitializeKeysUseCase initializeKeysUseCase = tapOnPhoneControllerImpl.f83617k;
        String serial2 = connectedDeviceQ9.getSerial();
        TerminalKeysRequest terminalKeysRequest = new TerminalKeysRequest(((Z10Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3)).getTokenEs(), ((Z10Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3)).getTokenEw(), merchant2.getSlotKey().getSlotKey());
        fVar.f83663p0 = tapOnPhoneControllerImpl;
        fVar.f83664q0 = connectedDeviceQ9;
        fVar.f83665r0 = merchant2;
        fVar.f83668u0 = 2;
        objRequestRandomKeyZ10 = initializeKeysUseCase.invoke(serial2, terminalKeysRequest, fVar);
        if (objRequestRandomKeyZ10 == coroutine_suspended) {
            return coroutine_suspended;
        }
        merchant3 = merchant2;
        result = (Result) objRequestRandomKeyZ10;
        if (result instanceof Result.Success) {
            fVar.f83663p0 = null;
            fVar.f83664q0 = null;
            fVar.f83665r0 = null;
            fVar.f83668u0 = 3;
            objRequestRandomKeyZ10 = tapOnPhoneControllerImpl.f(connectedDeviceQ9, (Result.Success) result, fVar);
            if (objRequestRandomKeyZ10 == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objRequestRandomKeyZ10;
        }
        if (result instanceof Result.Failure) {
            throw new NoWhenBranchMatchedException();
        }
        updateRenewKeyBySlotAndTerminalUseCase = tapOnPhoneControllerImpl.f83618l;
        i10 = Integer.parseInt(merchant3.getSlotKey().getSlotKey());
        serial = connectedDeviceQ9.getSerial();
        fVar.f83663p0 = tapOnPhoneControllerImpl;
        fVar.f83664q0 = result;
        fVar.f83665r0 = null;
        fVar.f83668u0 = 4;
        if (updateRenewKeyBySlotAndTerminalUseCase.invoke(2, i10, serial, fVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        result2 = result;
        tapOnPhoneControllerImpl2 = tapOnPhoneControllerImpl;
        tapOnPhonePinPadSdkWrapper = tapOnPhoneControllerImpl2.f83629x;
        if (tapOnPhonePinPadSdkWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
        } else {
            tapOnPhonePinPadSdkWrapper2 = tapOnPhonePinPadSdkWrapper;
        }
        tapOnPhonePinPadSdkWrapper2.clearPendingProcess();
        return new Result.Failure(((Result.Failure) result2).getError());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x023b  */
    /* JADX WARN: Code duplicated, block: B:101:0x0248  */
    /* JADX WARN: Code duplicated, block: B:108:0x0260  */
    /* JADX WARN: Code duplicated, block: B:109:0x026f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0273  */
    /* JADX WARN: Code duplicated, block: B:112:0x0280  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0101  */
    /* JADX WARN: Code duplicated, block: B:37:0x0105  */
    /* JADX WARN: Code duplicated, block: B:40:0x010d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0121 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x0122  */
    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:49:0x013a  */
    /* JADX WARN: Code duplicated, block: B:52:0x014a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0170 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x0171  */
    /* JADX WARN: Code duplicated, block: B:59:0x017e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0182  */
    /* JADX WARN: Code duplicated, block: B:62:0x0187  */
    /* JADX WARN: Code duplicated, block: B:65:0x019f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x01a0 A[PHI: r3
      0x01a0: PHI (r3v22 java.lang.Object) = (r3v21 java.lang.Object), (r3v1 java.lang.Object) binds: [B:64:0x019d, B:15:0x0051] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:76:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:86:0x0209 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x020a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0214  */
    /* JADX WARN: Code duplicated, block: B:92:0x0218  */
    /* JADX WARN: Code duplicated, block: B:93:0x021d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0235 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:97:0x0236 A[PHI: r3
      0x0236: PHI (r3v27 java.lang.Object) = (r3v26 java.lang.Object), (r3v1 java.lang.Object) binds: [B:95:0x0233, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:98:0x0237  */
    @Override // mx.openpay.library.domain.taponphone.TapOnPhoneController
    @Nullable
    public Object executeRefundCharge(@NotNull Transaction transaction, @NotNull TapOnPhoneCallback tapOnPhoneCallback, @NotNull Continuation<? super Result<Transaction>> continuation) {
        g gVar;
        RefundRequest refundRequestCreateRefundRequest;
        Object objInvoke;
        TapOnPhoneCallback tapOnPhoneCallback2;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl;
        Merchant merchant;
        Merchant merchant2;
        Object objJ;
        Transaction transaction2;
        RefundRequest refundRequest;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl2;
        ConnectedDeviceQ8 connectedDeviceQ8;
        Merchant merchant3;
        Object objE;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl3;
        Transaction transaction3;
        RefundRequest refundRequest2;
        Result result;
        Merchant merchant4;
        Merchant merchant5;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl4;
        Object objJ2;
        RefundRequest refundRequest3;
        Transaction transaction4;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl5;
        Result result2;
        Object failure;
        ConnectedDeviceQ8 connectedDeviceQ9;
        ConnectedDeviceQ8 connectedDeviceQ10;
        Result result3;
        ConnectedDeviceQ8 connectedDeviceQ11;
        ConnectedDeviceQ8 connectedDeviceQ12;
        Result result4;
        Transaction transaction5 = transaction;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i10 = gVar.v0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.v0 = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object objInvoke2 = gVar.f83673t0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        switch (gVar.v0) {
            case 0:
                ResultKt.throwOnFailure(objInvoke2);
                if (this.f83631z == null) {
                    return new Result.Failure(new Error.UninitializedTapOnPhoneSDK(null, 1, null));
                }
                tapOnPhoneCallback.execute(new TapOnPhoneCallbackStates.NotifyUser(NotifyUserItem.PROCESSING));
                refundRequestCreateRefundRequest = RefundUtils.INSTANCE.createRefundRequest(transaction5);
                String gatewayCardPresent = transaction.getGatewayCardPresent();
                Locale locale = Locale.ROOT;
                String upperCase = gatewayCardPresent.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                String upperCase2 = EglobalUtils.GATEWAY_CARD_PRESENT_BANCOMER.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                if (!Intrinsics.areEqual(upperCase, upperCase2)) {
                    gVar.v0 = 7;
                    objInvoke2 = this.f83627v.invoke(refundRequestCreateRefundRequest, gVar);
                    if (objInvoke2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    result4 = (Result) objInvoke2;
                    if (result4 instanceof Result.Success) {
                        failure = new Result.Success(((Result.Success) result4).getData(), ProcessingStep.PROCESSED_STEP);
                    } else {
                        if (result4 instanceof Result.Failure) {
                            throw new NoWhenBranchMatchedException();
                        }
                        failure = new Result.Failure(((Result.Failure) result4).getError());
                    }
                    return failure;
                }
                Merchant merchant6 = this.f83631z;
                if (merchant6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant6 = null;
                }
                int i11 = Integer.parseInt(merchant6.getSlotKey().getSlotKey());
                ConnectedDeviceQ8 connectedDeviceQ13 = this.f83630y;
                if (connectedDeviceQ13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ13 = null;
                }
                String serial = connectedDeviceQ13.getSerial();
                gVar.f83669p0 = this;
                gVar.f83670q0 = transaction5;
                gVar.f83671r0 = tapOnPhoneCallback;
                gVar.f83672s0 = refundRequestCreateRefundRequest;
                gVar.v0 = 1;
                objInvoke = this.f83616j.invoke(i11, serial, gVar);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tapOnPhoneCallback2 = tapOnPhoneCallback;
                tapOnPhoneControllerImpl = this;
                if (((Number) objInvoke).intValue() == 2) {
                    String amount = EglobalUtils.INSTANCE.parseAmount(transaction5.getAmount());
                    merchant = tapOnPhoneControllerImpl.f83631z;
                    if (merchant == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                        merchant = null;
                    }
                    String keyName = merchant.getSlotKey().getKeyName();
                    merchant2 = tapOnPhoneControllerImpl.f83631z;
                    if (merchant2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                        merchant2 = null;
                    }
                    String slotKey = merchant2.getSlotKey().getSlotKey();
                    String orderId = transaction5.getOrderId();
                    gVar.f83669p0 = tapOnPhoneControllerImpl;
                    gVar.f83670q0 = transaction5;
                    gVar.f83671r0 = refundRequestCreateRefundRequest;
                    gVar.f83672s0 = null;
                    gVar.v0 = 5;
                    objJ = tapOnPhoneControllerImpl.j(amount, false, keyName, slotKey, orderId, tapOnPhoneCallback2, gVar);
                    if (objJ == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    transaction2 = transaction5;
                    refundRequest = refundRequestCreateRefundRequest;
                    objInvoke2 = objJ;
                    tapOnPhoneControllerImpl2 = tapOnPhoneControllerImpl;
                    result3 = (Result) objInvoke2;
                    if (!(result3 instanceof Result.Success)) {
                        if (!(result3 instanceof Result.Failure)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        failure = new Result.Failure(((Result.Failure) result3).getError());
                        return failure;
                    }
                    connectedDeviceQ11 = tapOnPhoneControllerImpl2.f83630y;
                    if (connectedDeviceQ11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                        connectedDeviceQ12 = null;
                    } else {
                        connectedDeviceQ12 = connectedDeviceQ11;
                    }
                    C51Response c51Response = (C51Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3);
                    gVar.f83669p0 = null;
                    gVar.f83670q0 = null;
                    gVar.f83671r0 = null;
                    gVar.v0 = 6;
                    objInvoke2 = tapOnPhoneControllerImpl2.r(connectedDeviceQ12, transaction2, refundRequest, c51Response, gVar);
                    if (objInvoke2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objInvoke2;
                }
                connectedDeviceQ8 = tapOnPhoneControllerImpl.f83630y;
                if (connectedDeviceQ8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ8 = null;
                }
                merchant3 = tapOnPhoneControllerImpl.f83631z;
                if (merchant3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant3 = null;
                }
                gVar.f83669p0 = tapOnPhoneControllerImpl;
                gVar.f83670q0 = transaction5;
                gVar.f83671r0 = tapOnPhoneCallback2;
                gVar.f83672s0 = refundRequestCreateRefundRequest;
                gVar.v0 = 2;
                objE = tapOnPhoneControllerImpl.e(connectedDeviceQ8, merchant3, tapOnPhoneCallback2, gVar);
                if (objE == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tapOnPhoneControllerImpl3 = tapOnPhoneControllerImpl;
                transaction3 = transaction5;
                refundRequest2 = refundRequestCreateRefundRequest;
                objInvoke2 = objE;
                result = (Result) objInvoke2;
                if (!(result instanceof Result.Success)) {
                    if (result instanceof Result.Failure) {
                        return result;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                String amount2 = EglobalUtils.INSTANCE.parseAmount(transaction3.getAmount());
                merchant4 = tapOnPhoneControllerImpl3.f83631z;
                if (merchant4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant4 = null;
                }
                String keyName2 = merchant4.getSlotKey().getKeyName();
                merchant5 = tapOnPhoneControllerImpl3.f83631z;
                if (merchant5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant5 = null;
                }
                String slotKey2 = merchant5.getSlotKey().getSlotKey();
                String orderId2 = transaction3.getOrderId();
                gVar.f83669p0 = tapOnPhoneControllerImpl3;
                gVar.f83670q0 = transaction3;
                gVar.f83671r0 = refundRequest2;
                gVar.f83672s0 = null;
                gVar.v0 = 3;
                tapOnPhoneControllerImpl4 = tapOnPhoneControllerImpl3;
                objJ2 = tapOnPhoneControllerImpl3.j(amount2, false, keyName2, slotKey2, orderId2, tapOnPhoneCallback2, gVar);
                if (objJ2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                refundRequest3 = refundRequest2;
                transaction4 = transaction3;
                tapOnPhoneControllerImpl5 = tapOnPhoneControllerImpl4;
                objInvoke2 = objJ2;
                result2 = (Result) objInvoke2;
                if (result2 instanceof Result.Success) {
                    if (result2 instanceof Result.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    failure = new Result.Failure(((Result.Failure) result2).getError());
                    return failure;
                }
                connectedDeviceQ9 = tapOnPhoneControllerImpl5.f83630y;
                if (connectedDeviceQ9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ10 = null;
                } else {
                    connectedDeviceQ10 = connectedDeviceQ9;
                }
                C51Response c51Response2 = (C51Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2);
                gVar.f83669p0 = null;
                gVar.f83670q0 = null;
                gVar.f83671r0 = null;
                gVar.v0 = 4;
                objInvoke2 = tapOnPhoneControllerImpl5.r(connectedDeviceQ10, transaction4, refundRequest3, c51Response2, gVar);
                if (objInvoke2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objInvoke2;
            case 1:
                RefundRequest refundRequest4 = gVar.f83672s0;
                TapOnPhoneCallback tapOnPhoneCallback3 = (TapOnPhoneCallback) gVar.f83671r0;
                Transaction transaction6 = gVar.f83670q0;
                TapOnPhoneControllerImpl tapOnPhoneControllerImpl6 = gVar.f83669p0;
                ResultKt.throwOnFailure(objInvoke2);
                tapOnPhoneCallback2 = tapOnPhoneCallback3;
                tapOnPhoneControllerImpl = tapOnPhoneControllerImpl6;
                refundRequestCreateRefundRequest = refundRequest4;
                transaction5 = transaction6;
                objInvoke = objInvoke2;
                if (((Number) objInvoke).intValue() == 2) {
                    String amount3 = EglobalUtils.INSTANCE.parseAmount(transaction5.getAmount());
                    merchant = tapOnPhoneControllerImpl.f83631z;
                    if (merchant == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                        merchant = null;
                    }
                    String keyName3 = merchant.getSlotKey().getKeyName();
                    merchant2 = tapOnPhoneControllerImpl.f83631z;
                    if (merchant2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                        merchant2 = null;
                    }
                    String slotKey3 = merchant2.getSlotKey().getSlotKey();
                    String orderId3 = transaction5.getOrderId();
                    gVar.f83669p0 = tapOnPhoneControllerImpl;
                    gVar.f83670q0 = transaction5;
                    gVar.f83671r0 = refundRequestCreateRefundRequest;
                    gVar.f83672s0 = null;
                    gVar.v0 = 5;
                    objJ = tapOnPhoneControllerImpl.j(amount3, false, keyName3, slotKey3, orderId3, tapOnPhoneCallback2, gVar);
                    if (objJ == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    transaction2 = transaction5;
                    refundRequest = refundRequestCreateRefundRequest;
                    objInvoke2 = objJ;
                    tapOnPhoneControllerImpl2 = tapOnPhoneControllerImpl;
                    result3 = (Result) objInvoke2;
                    if (!(result3 instanceof Result.Success)) {
                        if (!(result3 instanceof Result.Failure)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        failure = new Result.Failure(((Result.Failure) result3).getError());
                        return failure;
                    }
                    connectedDeviceQ11 = tapOnPhoneControllerImpl2.f83630y;
                    if (connectedDeviceQ11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                        connectedDeviceQ12 = null;
                    } else {
                        connectedDeviceQ12 = connectedDeviceQ11;
                    }
                    C51Response c51Response3 = (C51Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3);
                    gVar.f83669p0 = null;
                    gVar.f83670q0 = null;
                    gVar.f83671r0 = null;
                    gVar.v0 = 6;
                    objInvoke2 = tapOnPhoneControllerImpl2.r(connectedDeviceQ12, transaction2, refundRequest, c51Response3, gVar);
                    if (objInvoke2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objInvoke2;
                }
                connectedDeviceQ8 = tapOnPhoneControllerImpl.f83630y;
                if (connectedDeviceQ8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ8 = null;
                }
                merchant3 = tapOnPhoneControllerImpl.f83631z;
                if (merchant3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant3 = null;
                }
                gVar.f83669p0 = tapOnPhoneControllerImpl;
                gVar.f83670q0 = transaction5;
                gVar.f83671r0 = tapOnPhoneCallback2;
                gVar.f83672s0 = refundRequestCreateRefundRequest;
                gVar.v0 = 2;
                objE = tapOnPhoneControllerImpl.e(connectedDeviceQ8, merchant3, tapOnPhoneCallback2, gVar);
                if (objE == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tapOnPhoneControllerImpl3 = tapOnPhoneControllerImpl;
                transaction3 = transaction5;
                refundRequest2 = refundRequestCreateRefundRequest;
                objInvoke2 = objE;
                result = (Result) objInvoke2;
                if (!(result instanceof Result.Success)) {
                    if (result instanceof Result.Failure) {
                        return result;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                String amount4 = EglobalUtils.INSTANCE.parseAmount(transaction3.getAmount());
                merchant4 = tapOnPhoneControllerImpl3.f83631z;
                if (merchant4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant4 = null;
                }
                String keyName4 = merchant4.getSlotKey().getKeyName();
                merchant5 = tapOnPhoneControllerImpl3.f83631z;
                if (merchant5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant5 = null;
                }
                String slotKey4 = merchant5.getSlotKey().getSlotKey();
                String orderId4 = transaction3.getOrderId();
                gVar.f83669p0 = tapOnPhoneControllerImpl3;
                gVar.f83670q0 = transaction3;
                gVar.f83671r0 = refundRequest2;
                gVar.f83672s0 = null;
                gVar.v0 = 3;
                tapOnPhoneControllerImpl4 = tapOnPhoneControllerImpl3;
                objJ2 = tapOnPhoneControllerImpl3.j(amount4, false, keyName4, slotKey4, orderId4, tapOnPhoneCallback2, gVar);
                if (objJ2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                refundRequest3 = refundRequest2;
                transaction4 = transaction3;
                tapOnPhoneControllerImpl5 = tapOnPhoneControllerImpl4;
                objInvoke2 = objJ2;
                result2 = (Result) objInvoke2;
                if (result2 instanceof Result.Success) {
                    if (result2 instanceof Result.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    failure = new Result.Failure(((Result.Failure) result2).getError());
                    return failure;
                }
                connectedDeviceQ9 = tapOnPhoneControllerImpl5.f83630y;
                if (connectedDeviceQ9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ10 = null;
                } else {
                    connectedDeviceQ10 = connectedDeviceQ9;
                }
                C51Response c51Response4 = (C51Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2);
                gVar.f83669p0 = null;
                gVar.f83670q0 = null;
                gVar.f83671r0 = null;
                gVar.v0 = 4;
                objInvoke2 = tapOnPhoneControllerImpl5.r(connectedDeviceQ10, transaction4, refundRequest3, c51Response4, gVar);
                if (objInvoke2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objInvoke2;
            case 2:
                refundRequest2 = gVar.f83672s0;
                TapOnPhoneCallback tapOnPhoneCallback4 = (TapOnPhoneCallback) gVar.f83671r0;
                Transaction transaction7 = gVar.f83670q0;
                TapOnPhoneControllerImpl tapOnPhoneControllerImpl7 = gVar.f83669p0;
                ResultKt.throwOnFailure(objInvoke2);
                tapOnPhoneCallback2 = tapOnPhoneCallback4;
                transaction3 = transaction7;
                tapOnPhoneControllerImpl3 = tapOnPhoneControllerImpl7;
                result = (Result) objInvoke2;
                if (!(result instanceof Result.Success)) {
                    if (result instanceof Result.Failure) {
                        return result;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                String amount5 = EglobalUtils.INSTANCE.parseAmount(transaction3.getAmount());
                merchant4 = tapOnPhoneControllerImpl3.f83631z;
                if (merchant4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant4 = null;
                }
                String keyName5 = merchant4.getSlotKey().getKeyName();
                merchant5 = tapOnPhoneControllerImpl3.f83631z;
                if (merchant5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant5 = null;
                }
                String slotKey5 = merchant5.getSlotKey().getSlotKey();
                String orderId5 = transaction3.getOrderId();
                gVar.f83669p0 = tapOnPhoneControllerImpl3;
                gVar.f83670q0 = transaction3;
                gVar.f83671r0 = refundRequest2;
                gVar.f83672s0 = null;
                gVar.v0 = 3;
                tapOnPhoneControllerImpl4 = tapOnPhoneControllerImpl3;
                objJ2 = tapOnPhoneControllerImpl3.j(amount5, false, keyName5, slotKey5, orderId5, tapOnPhoneCallback2, gVar);
                if (objJ2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                refundRequest3 = refundRequest2;
                transaction4 = transaction3;
                tapOnPhoneControllerImpl5 = tapOnPhoneControllerImpl4;
                objInvoke2 = objJ2;
                result2 = (Result) objInvoke2;
                if (result2 instanceof Result.Success) {
                    if (result2 instanceof Result.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    failure = new Result.Failure(((Result.Failure) result2).getError());
                    return failure;
                }
                connectedDeviceQ9 = tapOnPhoneControllerImpl5.f83630y;
                if (connectedDeviceQ9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ10 = null;
                } else {
                    connectedDeviceQ10 = connectedDeviceQ9;
                }
                C51Response c51Response5 = (C51Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2);
                gVar.f83669p0 = null;
                gVar.f83670q0 = null;
                gVar.f83671r0 = null;
                gVar.v0 = 4;
                objInvoke2 = tapOnPhoneControllerImpl5.r(connectedDeviceQ10, transaction4, refundRequest3, c51Response5, gVar);
                if (objInvoke2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objInvoke2;
            case 3:
                RefundRequest refundRequest5 = (RefundRequest) gVar.f83671r0;
                Transaction transaction8 = gVar.f83670q0;
                tapOnPhoneControllerImpl5 = gVar.f83669p0;
                ResultKt.throwOnFailure(objInvoke2);
                refundRequest3 = refundRequest5;
                transaction4 = transaction8;
                result2 = (Result) objInvoke2;
                if (result2 instanceof Result.Success) {
                    if (result2 instanceof Result.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    failure = new Result.Failure(((Result.Failure) result2).getError());
                    return failure;
                }
                connectedDeviceQ9 = tapOnPhoneControllerImpl5.f83630y;
                if (connectedDeviceQ9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ10 = null;
                } else {
                    connectedDeviceQ10 = connectedDeviceQ9;
                }
                C51Response c51Response6 = (C51Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2);
                gVar.f83669p0 = null;
                gVar.f83670q0 = null;
                gVar.f83671r0 = null;
                gVar.v0 = 4;
                objInvoke2 = tapOnPhoneControllerImpl5.r(connectedDeviceQ10, transaction4, refundRequest3, c51Response6, gVar);
                if (objInvoke2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objInvoke2;
            case 4:
                ResultKt.throwOnFailure(objInvoke2);
                return objInvoke2;
            case 5:
                RefundRequest refundRequest6 = (RefundRequest) gVar.f83671r0;
                Transaction transaction9 = gVar.f83670q0;
                tapOnPhoneControllerImpl2 = gVar.f83669p0;
                ResultKt.throwOnFailure(objInvoke2);
                refundRequest = refundRequest6;
                transaction2 = transaction9;
                result3 = (Result) objInvoke2;
                if (!(result3 instanceof Result.Success)) {
                    if (!(result3 instanceof Result.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    failure = new Result.Failure(((Result.Failure) result3).getError());
                    return failure;
                }
                connectedDeviceQ11 = tapOnPhoneControllerImpl2.f83630y;
                if (connectedDeviceQ11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ12 = null;
                } else {
                    connectedDeviceQ12 = connectedDeviceQ11;
                }
                C51Response c51Response7 = (C51Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3);
                gVar.f83669p0 = null;
                gVar.f83670q0 = null;
                gVar.f83671r0 = null;
                gVar.v0 = 6;
                objInvoke2 = tapOnPhoneControllerImpl2.r(connectedDeviceQ12, transaction2, refundRequest, c51Response7, gVar);
                if (objInvoke2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objInvoke2;
            case 6:
                ResultKt.throwOnFailure(objInvoke2);
                return objInvoke2;
            case 7:
                ResultKt.throwOnFailure(objInvoke2);
                result4 = (Result) objInvoke2;
                if (result4 instanceof Result.Success) {
                    failure = new Result.Success(((Result.Success) result4).getData(), ProcessingStep.PROCESSED_STEP);
                } else {
                    if (result4 instanceof Result.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    failure = new Result.Failure(((Result.Failure) result4).getError());
                }
                return failure;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:54:0x0103  */
    /* JADX WARN: Code duplicated, block: B:55:0x0107  */
    /* JADX WARN: Code duplicated, block: B:57:0x0119  */
    /* JADX WARN: Code duplicated, block: B:71:0x014b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0151  */
    /* JADX WARN: Code duplicated, block: B:76:0x0171 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:78:0x017c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x0180  */
    /* JADX WARN: Code duplicated, block: B:82:0x018c  */
    public final Object f(ConnectedDeviceQ8 connectedDeviceQ8, Result.Success<TerminalKeysResponse> success, Continuation<? super Result<Boolean>> continuation) {
        h hVar;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl2;
        Result result;
        UpdateRenewKeyBySlotAndTerminalUseCase updateRenewKeyBySlotAndTerminalUseCase;
        Merchant merchant;
        int i10;
        String serial;
        Result result2;
        UpdateRenewKeyBySlotAndTerminalUseCase updateRenewKeyBySlotAndTerminalUseCase2;
        Merchant merchant2;
        int i11;
        String serial2;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper;
        Result result3;
        UpdateRenewKeyBySlotAndTerminalUseCase updateRenewKeyBySlotAndTerminalUseCase3;
        Merchant merchant3;
        int i12;
        String serial3;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i13 = hVar.f83679t0;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f83679t0 = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object objSendInitialKeyZ12 = hVar.f83677r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i14 = hVar.f83679t0;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper2 = null;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 == 2) {
                    ResultKt.throwOnFailure(objSendInitialKeyZ12);
                    return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
                }
                if (i14 == 3) {
                    result2 = (Result) hVar.f83676q0;
                    tapOnPhoneControllerImpl2 = hVar.f83675p0;
                    ResultKt.throwOnFailure(objSendInitialKeyZ12);
                    tapOnPhonePinPadSdkWrapper = tapOnPhoneControllerImpl2.f83629x;
                    if (tapOnPhonePinPadSdkWrapper == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                    } else {
                        tapOnPhonePinPadSdkWrapper2 = tapOnPhonePinPadSdkWrapper;
                    }
                    tapOnPhonePinPadSdkWrapper2.clearPendingProcess();
                    return new Result.Failure(((Result.Failure) result2).getError());
                }
                if (i14 == 4) {
                    connectedDeviceQ8 = (ConnectedDeviceQ8) hVar.f83676q0;
                    tapOnPhoneControllerImpl = hVar.f83675p0;
                    ResultKt.throwOnFailure(objSendInitialKeyZ12);
                    result3 = (Result) objSendInitialKeyZ12;
                    if (result3 instanceof Result.Success) {
                        if (result3 instanceof Result.Failure) {
                            return new Result.Failure(((Result.Failure) result3).getError());
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    updateRenewKeyBySlotAndTerminalUseCase3 = tapOnPhoneControllerImpl.f83618l;
                    merchant3 = tapOnPhoneControllerImpl.f83631z;
                    if (merchant3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                        merchant3 = null;
                    }
                    i12 = Integer.parseInt(merchant3.getSlotKey().getSlotKey());
                    serial3 = connectedDeviceQ8.getSerial();
                    hVar.f83675p0 = null;
                    hVar.f83676q0 = null;
                    hVar.f83679t0 = 5;
                    if (updateRenewKeyBySlotAndTerminalUseCase3.invoke(0, i12, serial3, hVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objSendInitialKeyZ12);
                }
                return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
            }
            connectedDeviceQ8 = (ConnectedDeviceQ8) hVar.f83676q0;
            tapOnPhoneControllerImpl2 = hVar.f83675p0;
            ResultKt.throwOnFailure(objSendInitialKeyZ12);
            result = (Result) objSendInitialKeyZ12;
            if (result instanceof Result.Success) {
                updateRenewKeyBySlotAndTerminalUseCase2 = tapOnPhoneControllerImpl2.f83618l;
                merchant2 = tapOnPhoneControllerImpl2.f83631z;
                if (merchant2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant2 = null;
                }
                i11 = Integer.parseInt(merchant2.getSlotKey().getSlotKey());
                serial2 = connectedDeviceQ8.getSerial();
                hVar.f83675p0 = null;
                hVar.f83676q0 = null;
                hVar.f83679t0 = 2;
                if (updateRenewKeyBySlotAndTerminalUseCase2.invoke(0, i11, serial2, hVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
            }
            if (result instanceof Result.Failure) {
                throw new NoWhenBranchMatchedException();
            }
            updateRenewKeyBySlotAndTerminalUseCase = tapOnPhoneControllerImpl2.f83618l;
            merchant = tapOnPhoneControllerImpl2.f83631z;
            if (merchant == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                merchant = null;
            }
            i10 = Integer.parseInt(merchant.getSlotKey().getSlotKey());
            serial = connectedDeviceQ8.getSerial();
            hVar.f83675p0 = tapOnPhoneControllerImpl2;
            hVar.f83676q0 = result;
            hVar.f83679t0 = 3;
            if (updateRenewKeyBySlotAndTerminalUseCase.invoke(2, i10, serial, hVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            result2 = result;
            tapOnPhonePinPadSdkWrapper = tapOnPhoneControllerImpl2.f83629x;
            if (tapOnPhonePinPadSdkWrapper == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
            } else {
                tapOnPhonePinPadSdkWrapper2 = tapOnPhonePinPadSdkWrapper;
            }
            tapOnPhonePinPadSdkWrapper2.clearPendingProcess();
            return new Result.Failure(((Result.Failure) result2).getError());
        }
        ResultKt.throwOnFailure(objSendInitialKeyZ12);
        if (!this.f83608b) {
            TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper3 = this.f83629x;
            if (tapOnPhonePinPadSdkWrapper3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                tapOnPhonePinPadSdkWrapper3 = null;
            }
            Merchant merchant4 = this.f83631z;
            if (merchant4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                merchant4 = null;
            }
            String keyName = merchant4.getSlotKey().getKeyName();
            hVar.f83675p0 = this;
            hVar.f83676q0 = connectedDeviceQ8;
            hVar.f83679t0 = 4;
            objSendInitialKeyZ12 = tapOnPhonePinPadSdkWrapper3.sendInitialKeyZ12(keyName, hVar);
            if (objSendInitialKeyZ12 == coroutine_suspended) {
                return coroutine_suspended;
            }
            tapOnPhoneControllerImpl = this;
            result3 = (Result) objSendInitialKeyZ12;
            if (result3 instanceof Result.Success) {
                if (result3 instanceof Result.Failure) {
                    return new Result.Failure(((Result.Failure) result3).getError());
                }
                throw new NoWhenBranchMatchedException();
            }
            updateRenewKeyBySlotAndTerminalUseCase3 = tapOnPhoneControllerImpl.f83618l;
            merchant3 = tapOnPhoneControllerImpl.f83631z;
            if (merchant3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                merchant3 = null;
            }
            i12 = Integer.parseInt(merchant3.getSlotKey().getSlotKey());
            serial3 = connectedDeviceQ8.getSerial();
            hVar.f83675p0 = null;
            hVar.f83676q0 = null;
            hVar.f83679t0 = 5;
            if (updateRenewKeyBySlotAndTerminalUseCase3.invoke(0, i12, serial3, hVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
        }
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper4 = this.f83629x;
        if (tapOnPhonePinPadSdkWrapper4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
            tapOnPhonePinPadSdkWrapper4 = null;
        }
        TerminalKeysResponse terminalKeysResponse = (TerminalKeysResponse) mx.openpay.library.domain.util.ResultKt.getSuccessData(success);
        Merchant merchant5 = this.f83631z;
        if (merchant5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
            merchant5 = null;
        }
        String keyName2 = merchant5.getSlotKey().getKeyName();
        hVar.f83675p0 = this;
        hVar.f83676q0 = connectedDeviceQ8;
        hVar.f83679t0 = 1;
        objSendInitialKeyZ12 = tapOnPhonePinPadSdkWrapper4.sendInitialKeyZ11(terminalKeysResponse, keyName2, hVar);
        if (objSendInitialKeyZ12 == coroutine_suspended) {
            return coroutine_suspended;
        }
        tapOnPhoneControllerImpl2 = this;
        result = (Result) objSendInitialKeyZ12;
        if (result instanceof Result.Success) {
            updateRenewKeyBySlotAndTerminalUseCase2 = tapOnPhoneControllerImpl2.f83618l;
            merchant2 = tapOnPhoneControllerImpl2.f83631z;
            if (merchant2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                merchant2 = null;
            }
            i11 = Integer.parseInt(merchant2.getSlotKey().getSlotKey());
            serial2 = connectedDeviceQ8.getSerial();
            hVar.f83675p0 = null;
            hVar.f83676q0 = null;
            hVar.f83679t0 = 2;
            if (updateRenewKeyBySlotAndTerminalUseCase2.invoke(0, i11, serial2, hVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
        }
        if (result instanceof Result.Failure) {
            throw new NoWhenBranchMatchedException();
        }
        updateRenewKeyBySlotAndTerminalUseCase = tapOnPhoneControllerImpl2.f83618l;
        merchant = tapOnPhoneControllerImpl2.f83631z;
        if (merchant == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
            merchant = null;
        }
        i10 = Integer.parseInt(merchant.getSlotKey().getSlotKey());
        serial = connectedDeviceQ8.getSerial();
        hVar.f83675p0 = tapOnPhoneControllerImpl2;
        hVar.f83676q0 = result;
        hVar.f83679t0 = 3;
        if (updateRenewKeyBySlotAndTerminalUseCase.invoke(2, i10, serial, hVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        result2 = result;
        tapOnPhonePinPadSdkWrapper = tapOnPhoneControllerImpl2.f83629x;
        if (tapOnPhonePinPadSdkWrapper == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
        } else {
            tapOnPhonePinPadSdkWrapper2 = tapOnPhonePinPadSdkWrapper;
        }
        tapOnPhonePinPadSdkWrapper2.clearPendingProcess();
        return new Result.Failure(((Result.Failure) result2).getError());
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00de  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:54:0x0102  */
    /* JADX WARN: Code duplicated, block: B:56:0x010e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0121 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x0122  */
    /* JADX WARN: Code duplicated, block: B:63:0x013b  */
    /* JADX WARN: Code duplicated, block: B:65:0x014b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x0159 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x015a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0166  */
    /* JADX WARN: Code duplicated, block: B:75:0x017c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:78:0x018b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x0196  */
    /* JADX WARN: Code duplicated, block: B:82:0x019a  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:89:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ef  */
    public final Object g(Continuation<? super Result<Boolean>> continuation) {
        i iVar;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl;
        Result result;
        Result.Failure failure;
        ConnectedDeviceQ8 connectedDeviceQ8MapToConnectedDeviceQ8;
        ConnectedDeviceQ8 connectedDeviceQ8;
        Result result2;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl2;
        ConnectedDeviceQ8 connectedDeviceQ9;
        GetMerchant getMerchant;
        GetMerchant getMerchant2;
        Result result3;
        InsertMerchantDetailsUseCase insertMerchantDetailsUseCase;
        Merchant merchant;
        ConnectedDeviceQ8 connectedDeviceQ10;
        GetMerchant getMerchant3;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl3;
        boolean updateBines;
        GetBinesUseCase getBinesUseCase;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i10 = iVar.f83685u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f83685u0 = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object smartphoneInformationQ8 = iVar.f83683s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        switch (iVar.f83685u0) {
            case 0:
                ResultKt.throwOnFailure(smartphoneInformationQ8);
                TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper = this.f83629x;
                if (tapOnPhonePinPadSdkWrapper == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                    tapOnPhonePinPadSdkWrapper = null;
                }
                iVar.f83680p0 = this;
                iVar.f83685u0 = 1;
                smartphoneInformationQ8 = tapOnPhonePinPadSdkWrapper.getSmartphoneInformationQ8(iVar);
                if (smartphoneInformationQ8 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tapOnPhoneControllerImpl = this;
                result = (Result) smartphoneInformationQ8;
                if (result instanceof Result.Success) {
                    connectedDeviceQ8MapToConnectedDeviceQ8 = ConnectedDeviceQ8MapperKt.mapToConnectedDeviceQ8((Q8Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result));
                    tapOnPhoneControllerImpl.f83630y = connectedDeviceQ8MapToConnectedDeviceQ8;
                    if (connectedDeviceQ8MapToConnectedDeviceQ8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                        connectedDeviceQ8MapToConnectedDeviceQ8 = null;
                    }
                    String serial = connectedDeviceQ8MapToConnectedDeviceQ8.getSerial();
                    connectedDeviceQ8 = tapOnPhoneControllerImpl.f83630y;
                    if (connectedDeviceQ8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                        connectedDeviceQ8 = null;
                    }
                    RegisterSmartphoneRequest registerSmartphoneRequest = new RegisterSmartphoneRequest(serial, connectedDeviceQ8.getModel());
                    iVar.f83680p0 = tapOnPhoneControllerImpl;
                    iVar.f83685u0 = 2;
                    smartphoneInformationQ8 = tapOnPhoneControllerImpl.f83626u.invoke(registerSmartphoneRequest, iVar);
                    if (smartphoneInformationQ8 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    result2 = (Result) smartphoneInformationQ8;
                    if (result2 instanceof Result.Success) {
                        GetBinesCountUseCase getBinesCountUseCase = tapOnPhoneControllerImpl.f83615i;
                        iVar.f83680p0 = tapOnPhoneControllerImpl;
                        iVar.f83685u0 = 3;
                        smartphoneInformationQ8 = getBinesCountUseCase.invoke(iVar);
                        if (smartphoneInformationQ8 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        tapOnPhoneControllerImpl2 = tapOnPhoneControllerImpl;
                        int iIntValue = ((Number) smartphoneInformationQ8).intValue();
                        connectedDeviceQ9 = tapOnPhoneControllerImpl2.f83630y;
                        if (connectedDeviceQ9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                            connectedDeviceQ9 = null;
                        }
                        getMerchant = new GetMerchant(null, iIntValue, connectedDeviceQ9.getSerial());
                        iVar.f83680p0 = tapOnPhoneControllerImpl2;
                        iVar.f83681q0 = getMerchant;
                        iVar.f83685u0 = 4;
                        smartphoneInformationQ8 = tapOnPhoneControllerImpl2.f83610d.invoke(getMerchant, iVar);
                        if (smartphoneInformationQ8 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        getMerchant2 = getMerchant;
                        result3 = (Result) smartphoneInformationQ8;
                        if (result3 instanceof Result.Success) {
                            insertMerchantDetailsUseCase = tapOnPhoneControllerImpl2.f83611e;
                            merchant = (Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3);
                            connectedDeviceQ10 = tapOnPhoneControllerImpl2.f83630y;
                            if (connectedDeviceQ10 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                                connectedDeviceQ10 = null;
                            }
                            iVar.f83680p0 = tapOnPhoneControllerImpl2;
                            iVar.f83681q0 = getMerchant2;
                            iVar.f83682r0 = result3;
                            iVar.f83685u0 = 5;
                            if (insertMerchantDetailsUseCase.invoke(merchant, connectedDeviceQ10, true, iVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            getMerchant3 = getMerchant2;
                            tapOnPhoneControllerImpl3 = tapOnPhoneControllerImpl2;
                            tapOnPhoneControllerImpl3.f83631z = (Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3);
                            updateBines = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3)).getUpdateBines();
                            getBinesUseCase = tapOnPhoneControllerImpl3.f83612f;
                            if (updateBines) {
                                iVar.f83680p0 = tapOnPhoneControllerImpl3;
                                iVar.f83681q0 = null;
                                iVar.f83682r0 = null;
                                iVar.f83685u0 = 6;
                                smartphoneInformationQ8 = getBinesUseCase.invoke(false, iVar);
                                if (smartphoneInformationQ8 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                iVar.f83680p0 = null;
                                iVar.f83685u0 = 7;
                                if (tapOnPhoneControllerImpl3.l((Result) smartphoneInformationQ8, iVar) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else if (!((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3)).getUpdateBines() && getMerchant3.getBinesCount() == 0) {
                                iVar.f83680p0 = tapOnPhoneControllerImpl3;
                                iVar.f83681q0 = null;
                                iVar.f83682r0 = null;
                                iVar.f83685u0 = 8;
                                smartphoneInformationQ8 = getBinesUseCase.invoke(true, iVar);
                                if (smartphoneInformationQ8 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                iVar.f83680p0 = null;
                                iVar.f83685u0 = 9;
                                if (tapOnPhoneControllerImpl3.l((Result) smartphoneInformationQ8, iVar) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
                        }
                        if (!(result3 instanceof Result.Failure)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        failure = new Result.Failure(new Error.Server(((Result.Failure) result3).getError().getErrorBody()));
                    } else {
                        if (!(result2 instanceof Result.Failure)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        failure = new Result.Failure(new Error.Server(((Result.Failure) result2).getError().getErrorBody()));
                    }
                } else {
                    if (result instanceof Result.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    failure = new Result.Failure(new Error.OnTerminal(((Result.Failure) result).getError().getStatus()));
                }
                return failure;
            case 1:
                tapOnPhoneControllerImpl = iVar.f83680p0;
                ResultKt.throwOnFailure(smartphoneInformationQ8);
                result = (Result) smartphoneInformationQ8;
                if (result instanceof Result.Success) {
                    connectedDeviceQ8MapToConnectedDeviceQ8 = ConnectedDeviceQ8MapperKt.mapToConnectedDeviceQ8((Q8Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result));
                    tapOnPhoneControllerImpl.f83630y = connectedDeviceQ8MapToConnectedDeviceQ8;
                    if (connectedDeviceQ8MapToConnectedDeviceQ8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                        connectedDeviceQ8MapToConnectedDeviceQ8 = null;
                    }
                    String serial2 = connectedDeviceQ8MapToConnectedDeviceQ8.getSerial();
                    connectedDeviceQ8 = tapOnPhoneControllerImpl.f83630y;
                    if (connectedDeviceQ8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                        connectedDeviceQ8 = null;
                    }
                    RegisterSmartphoneRequest registerSmartphoneRequest2 = new RegisterSmartphoneRequest(serial2, connectedDeviceQ8.getModel());
                    iVar.f83680p0 = tapOnPhoneControllerImpl;
                    iVar.f83685u0 = 2;
                    smartphoneInformationQ8 = tapOnPhoneControllerImpl.f83626u.invoke(registerSmartphoneRequest2, iVar);
                    if (smartphoneInformationQ8 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    result2 = (Result) smartphoneInformationQ8;
                    if (result2 instanceof Result.Success) {
                        GetBinesCountUseCase getBinesCountUseCase2 = tapOnPhoneControllerImpl.f83615i;
                        iVar.f83680p0 = tapOnPhoneControllerImpl;
                        iVar.f83685u0 = 3;
                        smartphoneInformationQ8 = getBinesCountUseCase2.invoke(iVar);
                        if (smartphoneInformationQ8 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        tapOnPhoneControllerImpl2 = tapOnPhoneControllerImpl;
                        int iIntValue2 = ((Number) smartphoneInformationQ8).intValue();
                        connectedDeviceQ9 = tapOnPhoneControllerImpl2.f83630y;
                        if (connectedDeviceQ9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                            connectedDeviceQ9 = null;
                        }
                        getMerchant = new GetMerchant(null, iIntValue2, connectedDeviceQ9.getSerial());
                        iVar.f83680p0 = tapOnPhoneControllerImpl2;
                        iVar.f83681q0 = getMerchant;
                        iVar.f83685u0 = 4;
                        smartphoneInformationQ8 = tapOnPhoneControllerImpl2.f83610d.invoke(getMerchant, iVar);
                        if (smartphoneInformationQ8 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        getMerchant2 = getMerchant;
                        result3 = (Result) smartphoneInformationQ8;
                        if (result3 instanceof Result.Success) {
                            insertMerchantDetailsUseCase = tapOnPhoneControllerImpl2.f83611e;
                            merchant = (Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3);
                            connectedDeviceQ10 = tapOnPhoneControllerImpl2.f83630y;
                            if (connectedDeviceQ10 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                                connectedDeviceQ10 = null;
                            }
                            iVar.f83680p0 = tapOnPhoneControllerImpl2;
                            iVar.f83681q0 = getMerchant2;
                            iVar.f83682r0 = result3;
                            iVar.f83685u0 = 5;
                            if (insertMerchantDetailsUseCase.invoke(merchant, connectedDeviceQ10, true, iVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            getMerchant3 = getMerchant2;
                            tapOnPhoneControllerImpl3 = tapOnPhoneControllerImpl2;
                            tapOnPhoneControllerImpl3.f83631z = (Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3);
                            updateBines = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3)).getUpdateBines();
                            getBinesUseCase = tapOnPhoneControllerImpl3.f83612f;
                            if (updateBines) {
                                iVar.f83680p0 = tapOnPhoneControllerImpl3;
                                iVar.f83681q0 = null;
                                iVar.f83682r0 = null;
                                iVar.f83685u0 = 6;
                                smartphoneInformationQ8 = getBinesUseCase.invoke(false, iVar);
                                if (smartphoneInformationQ8 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                iVar.f83680p0 = null;
                                iVar.f83685u0 = 7;
                                if (tapOnPhoneControllerImpl3.l((Result) smartphoneInformationQ8, iVar) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else if (!((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3)).getUpdateBines()) {
                                iVar.f83680p0 = tapOnPhoneControllerImpl3;
                                iVar.f83681q0 = null;
                                iVar.f83682r0 = null;
                                iVar.f83685u0 = 8;
                                smartphoneInformationQ8 = getBinesUseCase.invoke(true, iVar);
                                if (smartphoneInformationQ8 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                iVar.f83680p0 = null;
                                iVar.f83685u0 = 9;
                                if (tapOnPhoneControllerImpl3.l((Result) smartphoneInformationQ8, iVar) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
                        }
                        if (!(result3 instanceof Result.Failure)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        failure = new Result.Failure(new Error.Server(((Result.Failure) result3).getError().getErrorBody()));
                    } else {
                        if (!(result2 instanceof Result.Failure)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        failure = new Result.Failure(new Error.Server(((Result.Failure) result2).getError().getErrorBody()));
                    }
                } else {
                    if (result instanceof Result.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    failure = new Result.Failure(new Error.OnTerminal(((Result.Failure) result).getError().getStatus()));
                }
                return failure;
            case 2:
                tapOnPhoneControllerImpl = iVar.f83680p0;
                ResultKt.throwOnFailure(smartphoneInformationQ8);
                result2 = (Result) smartphoneInformationQ8;
                if (result2 instanceof Result.Success) {
                    GetBinesCountUseCase getBinesCountUseCase3 = tapOnPhoneControllerImpl.f83615i;
                    iVar.f83680p0 = tapOnPhoneControllerImpl;
                    iVar.f83685u0 = 3;
                    smartphoneInformationQ8 = getBinesCountUseCase3.invoke(iVar);
                    if (smartphoneInformationQ8 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    tapOnPhoneControllerImpl2 = tapOnPhoneControllerImpl;
                    int iIntValue3 = ((Number) smartphoneInformationQ8).intValue();
                    connectedDeviceQ9 = tapOnPhoneControllerImpl2.f83630y;
                    if (connectedDeviceQ9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                        connectedDeviceQ9 = null;
                    }
                    getMerchant = new GetMerchant(null, iIntValue3, connectedDeviceQ9.getSerial());
                    iVar.f83680p0 = tapOnPhoneControllerImpl2;
                    iVar.f83681q0 = getMerchant;
                    iVar.f83685u0 = 4;
                    smartphoneInformationQ8 = tapOnPhoneControllerImpl2.f83610d.invoke(getMerchant, iVar);
                    if (smartphoneInformationQ8 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    getMerchant2 = getMerchant;
                    result3 = (Result) smartphoneInformationQ8;
                    if (result3 instanceof Result.Success) {
                        insertMerchantDetailsUseCase = tapOnPhoneControllerImpl2.f83611e;
                        merchant = (Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3);
                        connectedDeviceQ10 = tapOnPhoneControllerImpl2.f83630y;
                        if (connectedDeviceQ10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                            connectedDeviceQ10 = null;
                        }
                        iVar.f83680p0 = tapOnPhoneControllerImpl2;
                        iVar.f83681q0 = getMerchant2;
                        iVar.f83682r0 = result3;
                        iVar.f83685u0 = 5;
                        if (insertMerchantDetailsUseCase.invoke(merchant, connectedDeviceQ10, true, iVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        getMerchant3 = getMerchant2;
                        tapOnPhoneControllerImpl3 = tapOnPhoneControllerImpl2;
                        tapOnPhoneControllerImpl3.f83631z = (Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3);
                        updateBines = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3)).getUpdateBines();
                        getBinesUseCase = tapOnPhoneControllerImpl3.f83612f;
                        if (updateBines) {
                            iVar.f83680p0 = tapOnPhoneControllerImpl3;
                            iVar.f83681q0 = null;
                            iVar.f83682r0 = null;
                            iVar.f83685u0 = 6;
                            smartphoneInformationQ8 = getBinesUseCase.invoke(false, iVar);
                            if (smartphoneInformationQ8 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            iVar.f83680p0 = null;
                            iVar.f83685u0 = 7;
                            if (tapOnPhoneControllerImpl3.l((Result) smartphoneInformationQ8, iVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (!((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3)).getUpdateBines()) {
                            iVar.f83680p0 = tapOnPhoneControllerImpl3;
                            iVar.f83681q0 = null;
                            iVar.f83682r0 = null;
                            iVar.f83685u0 = 8;
                            smartphoneInformationQ8 = getBinesUseCase.invoke(true, iVar);
                            if (smartphoneInformationQ8 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            iVar.f83680p0 = null;
                            iVar.f83685u0 = 9;
                            if (tapOnPhoneControllerImpl3.l((Result) smartphoneInformationQ8, iVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
                    }
                    if (!(result3 instanceof Result.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    failure = new Result.Failure(new Error.Server(((Result.Failure) result3).getError().getErrorBody()));
                } else {
                    if (!(result2 instanceof Result.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    failure = new Result.Failure(new Error.Server(((Result.Failure) result2).getError().getErrorBody()));
                }
                return failure;
            case 3:
                tapOnPhoneControllerImpl = iVar.f83680p0;
                ResultKt.throwOnFailure(smartphoneInformationQ8);
                tapOnPhoneControllerImpl2 = tapOnPhoneControllerImpl;
                int iIntValue4 = ((Number) smartphoneInformationQ8).intValue();
                connectedDeviceQ9 = tapOnPhoneControllerImpl2.f83630y;
                if (connectedDeviceQ9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ9 = null;
                }
                getMerchant = new GetMerchant(null, iIntValue4, connectedDeviceQ9.getSerial());
                iVar.f83680p0 = tapOnPhoneControllerImpl2;
                iVar.f83681q0 = getMerchant;
                iVar.f83685u0 = 4;
                smartphoneInformationQ8 = tapOnPhoneControllerImpl2.f83610d.invoke(getMerchant, iVar);
                if (smartphoneInformationQ8 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                getMerchant2 = getMerchant;
                result3 = (Result) smartphoneInformationQ8;
                if (result3 instanceof Result.Success) {
                    if (!(result3 instanceof Result.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    failure = new Result.Failure(new Error.Server(((Result.Failure) result3).getError().getErrorBody()));
                    return failure;
                }
                insertMerchantDetailsUseCase = tapOnPhoneControllerImpl2.f83611e;
                merchant = (Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3);
                connectedDeviceQ10 = tapOnPhoneControllerImpl2.f83630y;
                if (connectedDeviceQ10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ10 = null;
                }
                iVar.f83680p0 = tapOnPhoneControllerImpl2;
                iVar.f83681q0 = getMerchant2;
                iVar.f83682r0 = result3;
                iVar.f83685u0 = 5;
                if (insertMerchantDetailsUseCase.invoke(merchant, connectedDeviceQ10, true, iVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                getMerchant3 = getMerchant2;
                tapOnPhoneControllerImpl3 = tapOnPhoneControllerImpl2;
                tapOnPhoneControllerImpl3.f83631z = (Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3);
                updateBines = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3)).getUpdateBines();
                getBinesUseCase = tapOnPhoneControllerImpl3.f83612f;
                if (updateBines) {
                    iVar.f83680p0 = tapOnPhoneControllerImpl3;
                    iVar.f83681q0 = null;
                    iVar.f83682r0 = null;
                    iVar.f83685u0 = 6;
                    smartphoneInformationQ8 = getBinesUseCase.invoke(false, iVar);
                    if (smartphoneInformationQ8 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    iVar.f83680p0 = null;
                    iVar.f83685u0 = 7;
                    if (tapOnPhoneControllerImpl3.l((Result) smartphoneInformationQ8, iVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (!((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3)).getUpdateBines()) {
                    iVar.f83680p0 = tapOnPhoneControllerImpl3;
                    iVar.f83681q0 = null;
                    iVar.f83682r0 = null;
                    iVar.f83685u0 = 8;
                    smartphoneInformationQ8 = getBinesUseCase.invoke(true, iVar);
                    if (smartphoneInformationQ8 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    iVar.f83680p0 = null;
                    iVar.f83685u0 = 9;
                    if (tapOnPhoneControllerImpl3.l((Result) smartphoneInformationQ8, iVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
            case 4:
                getMerchant2 = iVar.f83681q0;
                tapOnPhoneControllerImpl2 = iVar.f83680p0;
                ResultKt.throwOnFailure(smartphoneInformationQ8);
                result3 = (Result) smartphoneInformationQ8;
                if (result3 instanceof Result.Success) {
                    if (!(result3 instanceof Result.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    failure = new Result.Failure(new Error.Server(((Result.Failure) result3).getError().getErrorBody()));
                    return failure;
                }
                insertMerchantDetailsUseCase = tapOnPhoneControllerImpl2.f83611e;
                merchant = (Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3);
                connectedDeviceQ10 = tapOnPhoneControllerImpl2.f83630y;
                if (connectedDeviceQ10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ10 = null;
                }
                iVar.f83680p0 = tapOnPhoneControllerImpl2;
                iVar.f83681q0 = getMerchant2;
                iVar.f83682r0 = result3;
                iVar.f83685u0 = 5;
                if (insertMerchantDetailsUseCase.invoke(merchant, connectedDeviceQ10, true, iVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                getMerchant3 = getMerchant2;
                tapOnPhoneControllerImpl3 = tapOnPhoneControllerImpl2;
                tapOnPhoneControllerImpl3.f83631z = (Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3);
                updateBines = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3)).getUpdateBines();
                getBinesUseCase = tapOnPhoneControllerImpl3.f83612f;
                if (updateBines) {
                    iVar.f83680p0 = tapOnPhoneControllerImpl3;
                    iVar.f83681q0 = null;
                    iVar.f83682r0 = null;
                    iVar.f83685u0 = 6;
                    smartphoneInformationQ8 = getBinesUseCase.invoke(false, iVar);
                    if (smartphoneInformationQ8 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    iVar.f83680p0 = null;
                    iVar.f83685u0 = 7;
                    if (tapOnPhoneControllerImpl3.l((Result) smartphoneInformationQ8, iVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (!((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3)).getUpdateBines()) {
                    iVar.f83680p0 = tapOnPhoneControllerImpl3;
                    iVar.f83681q0 = null;
                    iVar.f83682r0 = null;
                    iVar.f83685u0 = 8;
                    smartphoneInformationQ8 = getBinesUseCase.invoke(true, iVar);
                    if (smartphoneInformationQ8 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    iVar.f83680p0 = null;
                    iVar.f83685u0 = 9;
                    if (tapOnPhoneControllerImpl3.l((Result) smartphoneInformationQ8, iVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
            case 5:
                Result result4 = iVar.f83682r0;
                getMerchant3 = iVar.f83681q0;
                tapOnPhoneControllerImpl2 = iVar.f83680p0;
                ResultKt.throwOnFailure(smartphoneInformationQ8);
                result3 = result4;
                tapOnPhoneControllerImpl3 = tapOnPhoneControllerImpl2;
                tapOnPhoneControllerImpl3.f83631z = (Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3);
                updateBines = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3)).getUpdateBines();
                getBinesUseCase = tapOnPhoneControllerImpl3.f83612f;
                if (updateBines) {
                    iVar.f83680p0 = tapOnPhoneControllerImpl3;
                    iVar.f83681q0 = null;
                    iVar.f83682r0 = null;
                    iVar.f83685u0 = 6;
                    smartphoneInformationQ8 = getBinesUseCase.invoke(false, iVar);
                    if (smartphoneInformationQ8 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    iVar.f83680p0 = null;
                    iVar.f83685u0 = 7;
                    if (tapOnPhoneControllerImpl3.l((Result) smartphoneInformationQ8, iVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (!((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3)).getUpdateBines()) {
                    iVar.f83680p0 = tapOnPhoneControllerImpl3;
                    iVar.f83681q0 = null;
                    iVar.f83682r0 = null;
                    iVar.f83685u0 = 8;
                    smartphoneInformationQ8 = getBinesUseCase.invoke(true, iVar);
                    if (smartphoneInformationQ8 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    iVar.f83680p0 = null;
                    iVar.f83685u0 = 9;
                    if (tapOnPhoneControllerImpl3.l((Result) smartphoneInformationQ8, iVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
            case 6:
                tapOnPhoneControllerImpl3 = iVar.f83680p0;
                ResultKt.throwOnFailure(smartphoneInformationQ8);
                iVar.f83680p0 = null;
                iVar.f83685u0 = 7;
                if (tapOnPhoneControllerImpl3.l((Result) smartphoneInformationQ8, iVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
            case 7:
            case 9:
                ResultKt.throwOnFailure(smartphoneInformationQ8);
                return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
            case 8:
                tapOnPhoneControllerImpl3 = iVar.f83680p0;
                ResultKt.throwOnFailure(smartphoneInformationQ8);
                iVar.f83680p0 = null;
                iVar.f83685u0 = 9;
                if (tapOnPhoneControllerImpl3.l((Result) smartphoneInformationQ8, iVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(Result<C54Response> result, Charge charge, CreateCharge createCharge, Continuation<? super Result<Charge>> continuation) {
        k kVar;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i10 = kVar.f83693s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kVar.f83693s0 = i10 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        Object obj = kVar.f83691q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = kVar.f83693s0;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return new Result.Failure(new Error.CardRetired(null, 1, null));
            }
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            result = kVar.f83690p0;
            ResultKt.throwOnFailure(obj);
            return Intrinsics.areEqual(((Result.Failure) result).getError().getStatus(), EglobalUtils.CARD_REMOVED) ? new Result.Failure(new Error.CardRetired(null, 1, null)) : new Result.Failure(new Error.OnTerminal(null, 1, null));
        }
        ResultKt.throwOnFailure(obj);
        if (result instanceof Result.Success) {
            if (this.B) {
                return new Result.Failure(Error.Unknown.INSTANCE);
            }
            this.B = false;
            return new Result.Success(charge, ProcessingStep.PROCESSED_STEP);
        }
        if (!(result instanceof Result.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        this.B = true;
        if (StringsKt__StringsKt.contains$default((CharSequence) ((Result.Failure) result).getError().getStatus(), (CharSequence) EglobalUtils.CARD_REMOVED, false, 2, (Object) null)) {
            String orderId = createCharge.getOrderId();
            kVar.f83693s0 = 1;
            if (a(orderId, false, 22, kVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return new Result.Failure(new Error.CardRetired(null, 1, null));
        }
        if (Intrinsics.areEqual("00", this.A)) {
            String orderId2 = createCharge.getOrderId();
            kVar.f83690p0 = result;
            kVar.f83693s0 = 2;
            if (a(orderId2, false, 0, kVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (Intrinsics.areEqual(((Result.Failure) result).getError().getStatus(), EglobalUtils.CARD_REMOVED)) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(Result<C54Response> result, Continuation<? super Result<Boolean>> continuation) {
        l lVar;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper;
        Result<C54Response> result2;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl;
        Result<C54Response> result3;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i10 = lVar.f83698t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.f83698t0 = i10 - Integer.MIN_VALUE;
            } else {
                lVar = new l(continuation);
            }
        } else {
            lVar = new l(continuation);
        }
        Object objHostResponseC54 = lVar.f83696r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = lVar.f83698t0;
        if (i11 != 0) {
            if (i11 == 1) {
                tapOnPhoneControllerImpl = lVar.f83695q0;
                result2 = lVar.f83694p0;
                ResultKt.throwOnFailure(objHostResponseC54);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                result3 = lVar.f83694p0;
                ResultKt.throwOnFailure(objHostResponseC54);
            }
            return Intrinsics.areEqual(((Result.Failure) result3).getError().getStatus(), EglobalUtils.CARD_REMOVED) ? new Result.Failure(new Error.CardRetired(null, 1, null)) : new Result.Failure(new Error.OnTerminal(null, 1, null));
        }
        ResultKt.throwOnFailure(objHostResponseC54);
        if (result instanceof Result.Success) {
            return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
        }
        if (!(result instanceof Result.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper2 = this.f83629x;
        if (tapOnPhonePinPadSdkWrapper2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
            tapOnPhonePinPadSdkWrapper = null;
        } else {
            tapOnPhonePinPadSdkWrapper = tapOnPhonePinPadSdkWrapper2;
        }
        lVar.f83694p0 = result;
        lVar.f83695q0 = this;
        lVar.f83698t0 = 1;
        objHostResponseC54 = tapOnPhonePinPadSdkWrapper.hostResponseC54("01", "", EglobalUtils.ISSUER_AUTH_DATA_9100, "", lVar);
        if (objHostResponseC54 == coroutine_suspended) {
            return coroutine_suspended;
        }
        result2 = result;
        tapOnPhoneControllerImpl = this;
        lVar.f83694p0 = result2;
        lVar.f83695q0 = null;
        lVar.f83698t0 = 2;
        if (tapOnPhoneControllerImpl.i((Result) objHostResponseC54, lVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        result3 = result2;
        if (Intrinsics.areEqual(((Result.Failure) result3).getError().getStatus(), EglobalUtils.CARD_REMOVED)) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:102:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:105:0x01da  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:108:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:29:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0096  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:62:0x0111 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x0118  */
    /* JADX WARN: Code duplicated, block: B:67:0x0124  */
    /* JADX WARN: Code duplicated, block: B:70:0x0137 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0138  */
    /* JADX WARN: Code duplicated, block: B:74:0x0143  */
    /* JADX WARN: Code duplicated, block: B:76:0x014f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0155  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x015b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0161  */
    /* JADX WARN: Code duplicated, block: B:86:0x0167  */
    /* JADX WARN: Code duplicated, block: B:88:0x0171  */
    /* JADX WARN: Code duplicated, block: B:90:0x017d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0183  */
    /* JADX WARN: Code duplicated, block: B:95:0x0189  */
    /* JADX WARN: Code duplicated, block: B:97:0x018d  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a0  */
    @Override // mx.openpay.library.domain.taponphone.TapOnPhoneController
    @Nullable
    public Object initTapOnPhone(@NotNull Continuation<? super Result<InitResult>> continuation) {
        j jVar;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl;
        Result result;
        Result.Failure failure;
        Result result2;
        Merchant merchant;
        ConnectedDeviceQ8 connectedDeviceQ8;
        Merchant merchant2;
        ConnectedDeviceQ8 connectedDeviceQ9;
        Merchant merchant3;
        Result result3;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper;
        Merchant merchant4;
        Result result4;
        UpdateKeyInjectedDateBySerialUseCase updateKeyInjectedDateBySerialUseCase;
        String todayDateFormatted;
        ConnectedDeviceQ8 connectedDeviceQ10;
        String serial;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl2;
        Merchant merchant5;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i10 = jVar.f83689s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f83689s0 = i10 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        } else {
            jVar = new j(continuation);
        }
        Object objInitializeTapOnPhoneI51 = jVar.f83687q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        switch (jVar.f83689s0) {
            case 0:
                ResultKt.throwOnFailure(objInitializeTapOnPhoneI51);
                TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapperProvideTapOnPhonePinPadSdkWrapper = TapOnPhoneDependenciesProvider.INSTANCE.provideTapOnPhonePinPadSdkWrapper(this.f83607a, this.f83609c);
                this.f83629x = tapOnPhonePinPadSdkWrapperProvideTapOnPhonePinPadSdkWrapper;
                if (tapOnPhonePinPadSdkWrapperProvideTapOnPhonePinPadSdkWrapper == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                    tapOnPhonePinPadSdkWrapperProvideTapOnPhonePinPadSdkWrapper = null;
                }
                jVar.f83686p0 = this;
                jVar.f83689s0 = 1;
                objInitializeTapOnPhoneI51 = tapOnPhonePinPadSdkWrapperProvideTapOnPhonePinPadSdkWrapper.initializeTapOnPhoneI51(this.f83608b, jVar);
                if (objInitializeTapOnPhoneI51 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tapOnPhoneControllerImpl = this;
                result = (Result) objInitializeTapOnPhoneI51;
                if (result instanceof Result.Success) {
                    if (result instanceof Result.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    failure = (Result.Failure) result;
                    if (StringsKt__StringsKt.contains$default((CharSequence) failure.getError().getErrorBody(), (CharSequence) EglobalUtils.NO_NFC, false, 2, (Object) null)) {
                        return new Result.Success(new InitResult(DeviceNFCStatus.NO_NFC, null), null, 2, null);
                    }
                    if (StringsKt__StringsKt.contains$default((CharSequence) failure.getError().getErrorBody(), (CharSequence) EglobalUtils.NFC_DISABLE, false, 2, (Object) null)) {
                        return new Result.Success(new InitResult(DeviceNFCStatus.NFC_DISABLED, null), null, 2, null);
                    }
                    return StringsKt__StringsKt.contains$default((CharSequence) failure.getError().getErrorBody(), (CharSequence) EglobalUtils.INTERNAL_ERROR, false, 2, (Object) null) ? new Result.Failure(new Error.OnTerminal(failure.getError().getErrorBody())) : new Result.Failure(Error.Unknown.INSTANCE);
                }
                jVar.f83686p0 = tapOnPhoneControllerImpl;
                jVar.f83689s0 = 2;
                objInitializeTapOnPhoneI51 = tapOnPhoneControllerImpl.g(jVar);
                if (objInitializeTapOnPhoneI51 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result2 = (Result) objInitializeTapOnPhoneI51;
                if (!(result2 instanceof Result.Success)) {
                    if (result2 instanceof Result.Failure) {
                        return result2;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                GetRenewKeyBySlotAndTerminalUseCase getRenewKeyBySlotAndTerminalUseCase = tapOnPhoneControllerImpl.f83616j;
                merchant = tapOnPhoneControllerImpl.f83631z;
                if (merchant == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant = null;
                }
                int i11 = Integer.parseInt(merchant.getSlotKey().getSlotKey());
                connectedDeviceQ8 = tapOnPhoneControllerImpl.f83630y;
                if (connectedDeviceQ8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ8 = null;
                }
                String serial2 = connectedDeviceQ8.getSerial();
                jVar.f83686p0 = tapOnPhoneControllerImpl;
                jVar.f83689s0 = 3;
                objInitializeTapOnPhoneI51 = getRenewKeyBySlotAndTerminalUseCase.invoke(i11, serial2, jVar);
                if (objInitializeTapOnPhoneI51 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((Number) objInitializeTapOnPhoneI51).intValue() == 1) {
                    DeviceNFCStatus deviceNFCStatus = DeviceNFCStatus.NFC_ENABLED;
                    merchant2 = tapOnPhoneControllerImpl.f83631z;
                    if (merchant2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                        merchant2 = null;
                    }
                    return new Result.Success(new InitResult(deviceNFCStatus, merchant2), null, 2, null);
                }
                connectedDeviceQ9 = tapOnPhoneControllerImpl.f83630y;
                if (connectedDeviceQ9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ9 = null;
                }
                merchant3 = tapOnPhoneControllerImpl.f83631z;
                if (merchant3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant3 = null;
                }
                jVar.f83686p0 = tapOnPhoneControllerImpl;
                jVar.f83689s0 = 4;
                objInitializeTapOnPhoneI51 = tapOnPhoneControllerImpl.e(connectedDeviceQ9, merchant3, null, jVar);
                if (objInitializeTapOnPhoneI51 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result3 = (Result) objInitializeTapOnPhoneI51;
                if (!(result3 instanceof Result.Success)) {
                    if (result3 instanceof Result.Failure) {
                        return result3;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                tapOnPhonePinPadSdkWrapper = tapOnPhoneControllerImpl.f83629x;
                if (tapOnPhonePinPadSdkWrapper == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                    tapOnPhonePinPadSdkWrapper = null;
                }
                merchant4 = tapOnPhoneControllerImpl.f83631z;
                if (merchant4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant4 = null;
                }
                String keyName = merchant4.getSlotKey().getKeyName();
                jVar.f83686p0 = tapOnPhoneControllerImpl;
                jVar.f83689s0 = 5;
                objInitializeTapOnPhoneI51 = tapOnPhonePinPadSdkWrapper.validateRSAKeyZ13(keyName, jVar);
                if (objInitializeTapOnPhoneI51 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result4 = (Result) objInitializeTapOnPhoneI51;
                if (result4 instanceof Result.Success) {
                    if (result4 instanceof Result.Failure) {
                        return result4;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                updateKeyInjectedDateBySerialUseCase = tapOnPhoneControllerImpl.f83624s;
                todayDateFormatted = CalendarUtils.INSTANCE.getTodayDateFormatted();
                connectedDeviceQ10 = tapOnPhoneControllerImpl.f83630y;
                if (connectedDeviceQ10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ10 = null;
                }
                serial = connectedDeviceQ10.getSerial();
                jVar.f83686p0 = tapOnPhoneControllerImpl;
                jVar.f83689s0 = 6;
                if (updateKeyInjectedDateBySerialUseCase.invoke(todayDateFormatted, serial, jVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tapOnPhoneControllerImpl2 = tapOnPhoneControllerImpl;
                DeviceNFCStatus deviceNFCStatus2 = DeviceNFCStatus.NFC_ENABLED;
                merchant5 = tapOnPhoneControllerImpl2.f83631z;
                if (merchant5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant5 = null;
                }
                return new Result.Success(new InitResult(deviceNFCStatus2, merchant5), null, 2, null);
            case 1:
                tapOnPhoneControllerImpl = jVar.f83686p0;
                ResultKt.throwOnFailure(objInitializeTapOnPhoneI51);
                result = (Result) objInitializeTapOnPhoneI51;
                if (result instanceof Result.Success) {
                    if (result instanceof Result.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    failure = (Result.Failure) result;
                    if (StringsKt__StringsKt.contains$default((CharSequence) failure.getError().getErrorBody(), (CharSequence) EglobalUtils.NO_NFC, false, 2, (Object) null)) {
                        return new Result.Success(new InitResult(DeviceNFCStatus.NO_NFC, null), null, 2, null);
                    }
                    if (StringsKt__StringsKt.contains$default((CharSequence) failure.getError().getErrorBody(), (CharSequence) EglobalUtils.NFC_DISABLE, false, 2, (Object) null)) {
                        return new Result.Success(new InitResult(DeviceNFCStatus.NFC_DISABLED, null), null, 2, null);
                    }
                    if (StringsKt__StringsKt.contains$default((CharSequence) failure.getError().getErrorBody(), (CharSequence) EglobalUtils.INTERNAL_ERROR, false, 2, (Object) null)) {
                    }
                }
                jVar.f83686p0 = tapOnPhoneControllerImpl;
                jVar.f83689s0 = 2;
                objInitializeTapOnPhoneI51 = tapOnPhoneControllerImpl.g(jVar);
                if (objInitializeTapOnPhoneI51 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result2 = (Result) objInitializeTapOnPhoneI51;
                if (!(result2 instanceof Result.Success)) {
                    if (result2 instanceof Result.Failure) {
                        return result2;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                GetRenewKeyBySlotAndTerminalUseCase getRenewKeyBySlotAndTerminalUseCase2 = tapOnPhoneControllerImpl.f83616j;
                merchant = tapOnPhoneControllerImpl.f83631z;
                if (merchant == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant = null;
                }
                int i12 = Integer.parseInt(merchant.getSlotKey().getSlotKey());
                connectedDeviceQ8 = tapOnPhoneControllerImpl.f83630y;
                if (connectedDeviceQ8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ8 = null;
                }
                String serial3 = connectedDeviceQ8.getSerial();
                jVar.f83686p0 = tapOnPhoneControllerImpl;
                jVar.f83689s0 = 3;
                objInitializeTapOnPhoneI51 = getRenewKeyBySlotAndTerminalUseCase2.invoke(i12, serial3, jVar);
                if (objInitializeTapOnPhoneI51 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((Number) objInitializeTapOnPhoneI51).intValue() == 1) {
                    DeviceNFCStatus deviceNFCStatus3 = DeviceNFCStatus.NFC_ENABLED;
                    merchant2 = tapOnPhoneControllerImpl.f83631z;
                    if (merchant2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                        merchant2 = null;
                    }
                    return new Result.Success(new InitResult(deviceNFCStatus3, merchant2), null, 2, null);
                }
                connectedDeviceQ9 = tapOnPhoneControllerImpl.f83630y;
                if (connectedDeviceQ9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ9 = null;
                }
                merchant3 = tapOnPhoneControllerImpl.f83631z;
                if (merchant3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant3 = null;
                }
                jVar.f83686p0 = tapOnPhoneControllerImpl;
                jVar.f83689s0 = 4;
                objInitializeTapOnPhoneI51 = tapOnPhoneControllerImpl.e(connectedDeviceQ9, merchant3, null, jVar);
                if (objInitializeTapOnPhoneI51 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result3 = (Result) objInitializeTapOnPhoneI51;
                if (!(result3 instanceof Result.Success)) {
                    if (result3 instanceof Result.Failure) {
                        return result3;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                tapOnPhonePinPadSdkWrapper = tapOnPhoneControllerImpl.f83629x;
                if (tapOnPhonePinPadSdkWrapper == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                    tapOnPhonePinPadSdkWrapper = null;
                }
                merchant4 = tapOnPhoneControllerImpl.f83631z;
                if (merchant4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant4 = null;
                }
                String keyName2 = merchant4.getSlotKey().getKeyName();
                jVar.f83686p0 = tapOnPhoneControllerImpl;
                jVar.f83689s0 = 5;
                objInitializeTapOnPhoneI51 = tapOnPhonePinPadSdkWrapper.validateRSAKeyZ13(keyName2, jVar);
                if (objInitializeTapOnPhoneI51 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result4 = (Result) objInitializeTapOnPhoneI51;
                if (result4 instanceof Result.Success) {
                    if (result4 instanceof Result.Failure) {
                        return result4;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                updateKeyInjectedDateBySerialUseCase = tapOnPhoneControllerImpl.f83624s;
                todayDateFormatted = CalendarUtils.INSTANCE.getTodayDateFormatted();
                connectedDeviceQ10 = tapOnPhoneControllerImpl.f83630y;
                if (connectedDeviceQ10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ10 = null;
                }
                serial = connectedDeviceQ10.getSerial();
                jVar.f83686p0 = tapOnPhoneControllerImpl;
                jVar.f83689s0 = 6;
                if (updateKeyInjectedDateBySerialUseCase.invoke(todayDateFormatted, serial, jVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tapOnPhoneControllerImpl2 = tapOnPhoneControllerImpl;
                DeviceNFCStatus deviceNFCStatus4 = DeviceNFCStatus.NFC_ENABLED;
                merchant5 = tapOnPhoneControllerImpl2.f83631z;
                if (merchant5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant5 = null;
                }
                return new Result.Success(new InitResult(deviceNFCStatus4, merchant5), null, 2, null);
            case 2:
                tapOnPhoneControllerImpl = jVar.f83686p0;
                ResultKt.throwOnFailure(objInitializeTapOnPhoneI51);
                result2 = (Result) objInitializeTapOnPhoneI51;
                if (!(result2 instanceof Result.Success)) {
                    if (result2 instanceof Result.Failure) {
                        return result2;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                GetRenewKeyBySlotAndTerminalUseCase getRenewKeyBySlotAndTerminalUseCase3 = tapOnPhoneControllerImpl.f83616j;
                merchant = tapOnPhoneControllerImpl.f83631z;
                if (merchant == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant = null;
                }
                int i13 = Integer.parseInt(merchant.getSlotKey().getSlotKey());
                connectedDeviceQ8 = tapOnPhoneControllerImpl.f83630y;
                if (connectedDeviceQ8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ8 = null;
                }
                String serial4 = connectedDeviceQ8.getSerial();
                jVar.f83686p0 = tapOnPhoneControllerImpl;
                jVar.f83689s0 = 3;
                objInitializeTapOnPhoneI51 = getRenewKeyBySlotAndTerminalUseCase3.invoke(i13, serial4, jVar);
                if (objInitializeTapOnPhoneI51 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((Number) objInitializeTapOnPhoneI51).intValue() == 1) {
                    DeviceNFCStatus deviceNFCStatus5 = DeviceNFCStatus.NFC_ENABLED;
                    merchant2 = tapOnPhoneControllerImpl.f83631z;
                    if (merchant2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                        merchant2 = null;
                    }
                    return new Result.Success(new InitResult(deviceNFCStatus5, merchant2), null, 2, null);
                }
                connectedDeviceQ9 = tapOnPhoneControllerImpl.f83630y;
                if (connectedDeviceQ9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ9 = null;
                }
                merchant3 = tapOnPhoneControllerImpl.f83631z;
                if (merchant3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant3 = null;
                }
                jVar.f83686p0 = tapOnPhoneControllerImpl;
                jVar.f83689s0 = 4;
                objInitializeTapOnPhoneI51 = tapOnPhoneControllerImpl.e(connectedDeviceQ9, merchant3, null, jVar);
                if (objInitializeTapOnPhoneI51 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result3 = (Result) objInitializeTapOnPhoneI51;
                if (!(result3 instanceof Result.Success)) {
                    if (result3 instanceof Result.Failure) {
                        return result3;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                tapOnPhonePinPadSdkWrapper = tapOnPhoneControllerImpl.f83629x;
                if (tapOnPhonePinPadSdkWrapper == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                    tapOnPhonePinPadSdkWrapper = null;
                }
                merchant4 = tapOnPhoneControllerImpl.f83631z;
                if (merchant4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant4 = null;
                }
                String keyName3 = merchant4.getSlotKey().getKeyName();
                jVar.f83686p0 = tapOnPhoneControllerImpl;
                jVar.f83689s0 = 5;
                objInitializeTapOnPhoneI51 = tapOnPhonePinPadSdkWrapper.validateRSAKeyZ13(keyName3, jVar);
                if (objInitializeTapOnPhoneI51 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result4 = (Result) objInitializeTapOnPhoneI51;
                if (result4 instanceof Result.Success) {
                    if (result4 instanceof Result.Failure) {
                        return result4;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                updateKeyInjectedDateBySerialUseCase = tapOnPhoneControllerImpl.f83624s;
                todayDateFormatted = CalendarUtils.INSTANCE.getTodayDateFormatted();
                connectedDeviceQ10 = tapOnPhoneControllerImpl.f83630y;
                if (connectedDeviceQ10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ10 = null;
                }
                serial = connectedDeviceQ10.getSerial();
                jVar.f83686p0 = tapOnPhoneControllerImpl;
                jVar.f83689s0 = 6;
                if (updateKeyInjectedDateBySerialUseCase.invoke(todayDateFormatted, serial, jVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tapOnPhoneControllerImpl2 = tapOnPhoneControllerImpl;
                DeviceNFCStatus deviceNFCStatus6 = DeviceNFCStatus.NFC_ENABLED;
                merchant5 = tapOnPhoneControllerImpl2.f83631z;
                if (merchant5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant5 = null;
                }
                return new Result.Success(new InitResult(deviceNFCStatus6, merchant5), null, 2, null);
            case 3:
                tapOnPhoneControllerImpl = jVar.f83686p0;
                ResultKt.throwOnFailure(objInitializeTapOnPhoneI51);
                if (((Number) objInitializeTapOnPhoneI51).intValue() == 1) {
                    DeviceNFCStatus deviceNFCStatus7 = DeviceNFCStatus.NFC_ENABLED;
                    merchant2 = tapOnPhoneControllerImpl.f83631z;
                    if (merchant2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                        merchant2 = null;
                    }
                    return new Result.Success(new InitResult(deviceNFCStatus7, merchant2), null, 2, null);
                }
                connectedDeviceQ9 = tapOnPhoneControllerImpl.f83630y;
                if (connectedDeviceQ9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ9 = null;
                }
                merchant3 = tapOnPhoneControllerImpl.f83631z;
                if (merchant3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant3 = null;
                }
                jVar.f83686p0 = tapOnPhoneControllerImpl;
                jVar.f83689s0 = 4;
                objInitializeTapOnPhoneI51 = tapOnPhoneControllerImpl.e(connectedDeviceQ9, merchant3, null, jVar);
                if (objInitializeTapOnPhoneI51 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result3 = (Result) objInitializeTapOnPhoneI51;
                if (!(result3 instanceof Result.Success)) {
                    if (result3 instanceof Result.Failure) {
                        return result3;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                tapOnPhonePinPadSdkWrapper = tapOnPhoneControllerImpl.f83629x;
                if (tapOnPhonePinPadSdkWrapper == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                    tapOnPhonePinPadSdkWrapper = null;
                }
                merchant4 = tapOnPhoneControllerImpl.f83631z;
                if (merchant4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant4 = null;
                }
                String keyName4 = merchant4.getSlotKey().getKeyName();
                jVar.f83686p0 = tapOnPhoneControllerImpl;
                jVar.f83689s0 = 5;
                objInitializeTapOnPhoneI51 = tapOnPhonePinPadSdkWrapper.validateRSAKeyZ13(keyName4, jVar);
                if (objInitializeTapOnPhoneI51 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result4 = (Result) objInitializeTapOnPhoneI51;
                if (result4 instanceof Result.Success) {
                    if (result4 instanceof Result.Failure) {
                        return result4;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                updateKeyInjectedDateBySerialUseCase = tapOnPhoneControllerImpl.f83624s;
                todayDateFormatted = CalendarUtils.INSTANCE.getTodayDateFormatted();
                connectedDeviceQ10 = tapOnPhoneControllerImpl.f83630y;
                if (connectedDeviceQ10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ10 = null;
                }
                serial = connectedDeviceQ10.getSerial();
                jVar.f83686p0 = tapOnPhoneControllerImpl;
                jVar.f83689s0 = 6;
                if (updateKeyInjectedDateBySerialUseCase.invoke(todayDateFormatted, serial, jVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tapOnPhoneControllerImpl2 = tapOnPhoneControllerImpl;
                DeviceNFCStatus deviceNFCStatus8 = DeviceNFCStatus.NFC_ENABLED;
                merchant5 = tapOnPhoneControllerImpl2.f83631z;
                if (merchant5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant5 = null;
                }
                return new Result.Success(new InitResult(deviceNFCStatus8, merchant5), null, 2, null);
            case 4:
                tapOnPhoneControllerImpl = jVar.f83686p0;
                ResultKt.throwOnFailure(objInitializeTapOnPhoneI51);
                result3 = (Result) objInitializeTapOnPhoneI51;
                if (!(result3 instanceof Result.Success)) {
                    if (result3 instanceof Result.Failure) {
                        return result3;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                tapOnPhonePinPadSdkWrapper = tapOnPhoneControllerImpl.f83629x;
                if (tapOnPhonePinPadSdkWrapper == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                    tapOnPhonePinPadSdkWrapper = null;
                }
                merchant4 = tapOnPhoneControllerImpl.f83631z;
                if (merchant4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant4 = null;
                }
                String keyName5 = merchant4.getSlotKey().getKeyName();
                jVar.f83686p0 = tapOnPhoneControllerImpl;
                jVar.f83689s0 = 5;
                objInitializeTapOnPhoneI51 = tapOnPhonePinPadSdkWrapper.validateRSAKeyZ13(keyName5, jVar);
                if (objInitializeTapOnPhoneI51 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result4 = (Result) objInitializeTapOnPhoneI51;
                if (result4 instanceof Result.Success) {
                    if (result4 instanceof Result.Failure) {
                        return result4;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                updateKeyInjectedDateBySerialUseCase = tapOnPhoneControllerImpl.f83624s;
                todayDateFormatted = CalendarUtils.INSTANCE.getTodayDateFormatted();
                connectedDeviceQ10 = tapOnPhoneControllerImpl.f83630y;
                if (connectedDeviceQ10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ10 = null;
                }
                serial = connectedDeviceQ10.getSerial();
                jVar.f83686p0 = tapOnPhoneControllerImpl;
                jVar.f83689s0 = 6;
                if (updateKeyInjectedDateBySerialUseCase.invoke(todayDateFormatted, serial, jVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tapOnPhoneControllerImpl2 = tapOnPhoneControllerImpl;
                DeviceNFCStatus deviceNFCStatus9 = DeviceNFCStatus.NFC_ENABLED;
                merchant5 = tapOnPhoneControllerImpl2.f83631z;
                if (merchant5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant5 = null;
                }
                return new Result.Success(new InitResult(deviceNFCStatus9, merchant5), null, 2, null);
            case 5:
                tapOnPhoneControllerImpl = jVar.f83686p0;
                ResultKt.throwOnFailure(objInitializeTapOnPhoneI51);
                result4 = (Result) objInitializeTapOnPhoneI51;
                if (result4 instanceof Result.Success) {
                    if (result4 instanceof Result.Failure) {
                        return result4;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                updateKeyInjectedDateBySerialUseCase = tapOnPhoneControllerImpl.f83624s;
                todayDateFormatted = CalendarUtils.INSTANCE.getTodayDateFormatted();
                connectedDeviceQ10 = tapOnPhoneControllerImpl.f83630y;
                if (connectedDeviceQ10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("smartphoneInfo");
                    connectedDeviceQ10 = null;
                }
                serial = connectedDeviceQ10.getSerial();
                jVar.f83686p0 = tapOnPhoneControllerImpl;
                jVar.f83689s0 = 6;
                if (updateKeyInjectedDateBySerialUseCase.invoke(todayDateFormatted, serial, jVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tapOnPhoneControllerImpl2 = tapOnPhoneControllerImpl;
                DeviceNFCStatus deviceNFCStatus10 = DeviceNFCStatus.NFC_ENABLED;
                merchant5 = tapOnPhoneControllerImpl2.f83631z;
                if (merchant5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant5 = null;
                }
                return new Result.Success(new InitResult(deviceNFCStatus10, merchant5), null, 2, null);
            case 6:
                tapOnPhoneControllerImpl2 = jVar.f83686p0;
                ResultKt.throwOnFailure(objInitializeTapOnPhoneI51);
                DeviceNFCStatus deviceNFCStatus11 = DeviceNFCStatus.NFC_ENABLED;
                merchant5 = tapOnPhoneControllerImpl2.f83631z;
                if (merchant5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant5 = null;
                }
                return new Result.Success(new InitResult(deviceNFCStatus11, merchant5), null, 2, null);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // mx.openpay.library.domain.taponphone.TapOnPhoneController
    @Nullable
    public Object initTsdkManualInitializer(@NotNull Continuation<? super Result<Boolean>> continuation) {
        TsdkManualInitializer.INSTANCE.init(this.f83607a);
        return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public final Object j(String str, boolean z10, String str2, String str3, String str4, TapOnPhoneCallback tapOnPhoneCallback, Continuation<? super Result<C51Response>> continuation) {
        m mVar;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl;
        TapOnPhoneCallback tapOnPhoneCallback2 = tapOnPhoneCallback;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i10 = mVar.f83703t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mVar.f83703t0 = i10 - Integer.MIN_VALUE;
            } else {
                mVar = new m(continuation);
            }
        } else {
            mVar = new m(continuation);
        }
        m mVar2 = mVar;
        Object cardInfoC51 = mVar2.f83701r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = mVar2.f83703t0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(cardInfoC51);
            TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper2 = this.f83629x;
            if (tapOnPhonePinPadSdkWrapper2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                tapOnPhonePinPadSdkWrapper = null;
            } else {
                tapOnPhonePinPadSdkWrapper = tapOnPhonePinPadSdkWrapper2;
            }
            n nVar = new n(tapOnPhoneCallback2);
            mVar2.f83699p0 = this;
            mVar2.f83700q0 = tapOnPhoneCallback2;
            mVar2.f83703t0 = 1;
            cardInfoC51 = tapOnPhonePinPadSdkWrapper.readCardInfoC51(str, z10, str2, str3, str4, nVar, mVar2);
            if (cardInfoC51 == coroutine_suspended) {
                return coroutine_suspended;
            }
            tapOnPhoneControllerImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tapOnPhoneCallback2 = mVar2.f83700q0;
            tapOnPhoneControllerImpl = mVar2.f83699p0;
            ResultKt.throwOnFailure(cardInfoC51);
        }
        Result result = (Result) cardInfoC51;
        if (result instanceof Result.Success) {
            if (tapOnPhoneCallback2 != null) {
                tapOnPhoneCallback2.execute(new TapOnPhoneCallbackStates.NotifyUser(NotifyUserItem.PROCESSING));
            }
            return new Result.Success(mx.openpay.library.domain.util.ResultKt.getSuccessData(result), null, 2, null);
        }
        if (!(result instanceof Result.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Failure failure = (Result.Failure) result;
        if (StringsKt__StringsKt.contains$default((CharSequence) failure.getError().getErrorBody(), (CharSequence) "99", false, 2, (Object) null)) {
            if (tapOnPhoneCallback2 != null) {
                tapOnPhoneCallback2.execute(new TapOnPhoneCallbackStates.NotifyUser(NotifyUserItem.CANCELLING));
            }
        } else if (tapOnPhoneCallback2 != null) {
            tapOnPhoneCallback2.execute(new TapOnPhoneCallbackStates.NotifyUser(NotifyUserItem.PROCESSING));
        }
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper3 = tapOnPhoneControllerImpl.f83629x;
        if (tapOnPhonePinPadSdkWrapper3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
            tapOnPhonePinPadSdkWrapper3 = null;
        }
        tapOnPhonePinPadSdkWrapper3.clearPendingProcess();
        if (StringsKt__StringsKt.contains$default((CharSequence) failure.getError().getErrorBody(), (CharSequence) EglobalUtils.CARD_EXPIRED, false, 2, (Object) null)) {
            return new Result.Failure(new Error.CardExpired(null, 1, null));
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) failure.getError().getErrorBody(), (CharSequence) EglobalUtils.KEY_DERIVATION_FAILED_TIMEOUT, false, 2, (Object) null)) {
            return new Result.Failure(new Error.TimeOutTerminal(null, 1, null));
        }
        if (StringsKt__StringsKt.contains$default((CharSequence) failure.getError().getErrorBody(), (CharSequence) EglobalUtils.NFC_DISABLE, false, 2, (Object) null)) {
            return new Result.Failure(new Error.NFCDisabled(null, 1, null));
        }
        return StringsKt__StringsKt.contains$default((CharSequence) failure.getError().getErrorBody(), (CharSequence) "25", false, 2, (Object) null) ? new Result.Failure(new Error.UnsupportedCard(null, 1, null)) : new Result.Failure(failure.getError());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object k(CreateCharge createCharge, Charge charge, EmvTerminalData emvTerminalData, ConnectedDeviceQ8 connectedDeviceQ8, GatewayResponseDto gatewayResponseDto, Continuation<? super Result<Charge>> continuation) {
        o oVar;
        String code;
        String authorization;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl;
        CreateCharge createCharge2;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl2;
        String authorization2;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i10 = oVar.f83711w0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                oVar.f83711w0 = i10 - Integer.MIN_VALUE;
            } else {
                oVar = new o(continuation);
            }
        } else {
            oVar = new o(continuation);
        }
        o oVar2 = oVar;
        Object objD = oVar2.f83710u0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = oVar2.f83711w0;
        if (i11 != 0) {
            if (i11 == 1) {
                gatewayResponseDto = oVar2.f83709t0;
                emvTerminalData = oVar2.f83708s0;
                charge = oVar2.f83707r0;
                createCharge = oVar2.f83706q0;
                tapOnPhoneControllerImpl2 = oVar2.f83705p0;
                ResultKt.throwOnFailure(objD);
                createCharge2 = createCharge;
                tapOnPhoneControllerImpl = tapOnPhoneControllerImpl2;
            } else {
                if (i11 != 2) {
                    if (i11 == 3) {
                        ResultKt.throwOnFailure(objD);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objD);
            }
        }
        ResultKt.throwOnFailure(objD);
        if (gatewayResponseDto == null || (code = gatewayResponseDto.getCode()) == null) {
            code = "00";
        }
        this.A = code;
        if (emvTerminalData == null) {
            if (charge == null || (authorization = charge.getAuthorization()) == null) {
                authorization = "";
            }
            oVar2.f83711w0 = 3;
            objD = d(null, authorization, charge, createCharge, gatewayResponseDto, oVar2);
            return objD == coroutine_suspended ? coroutine_suspended : objD;
        }
        if (EglobalUtils.INSTANCE.getFLAGS_RENEW_KEYS_NEEDED().contains(emvTerminalData.getRequiresNewKey())) {
            int i12 = Integer.parseInt(emvTerminalData.getRequiresNewKey());
            Merchant merchant = this.f83631z;
            if (merchant == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                merchant = null;
            }
            int i13 = Integer.parseInt(merchant.getSlotKey().getSlotKey());
            String serial = connectedDeviceQ8.getSerial();
            oVar2.f83705p0 = this;
            oVar2.f83706q0 = createCharge;
            oVar2.f83707r0 = charge;
            oVar2.f83708s0 = emvTerminalData;
            oVar2.f83709t0 = gatewayResponseDto;
            oVar2.f83711w0 = 1;
            if (this.f83618l.invoke(i12, i13, serial, oVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            tapOnPhoneControllerImpl2 = this;
            createCharge2 = createCharge;
            tapOnPhoneControllerImpl = tapOnPhoneControllerImpl2;
        } else {
            tapOnPhoneControllerImpl = this;
            createCharge2 = createCharge;
        }
        String issuerAuthData = emvTerminalData.getIssuerAuthData();
        String str = (charge == null || (authorization2 = charge.getAuthorization()) == null) ? "" : authorization2;
        oVar2.f83705p0 = null;
        oVar2.f83706q0 = null;
        oVar2.f83707r0 = null;
        oVar2.f83708s0 = null;
        oVar2.f83709t0 = null;
        oVar2.f83711w0 = 2;
        objD = tapOnPhoneControllerImpl.d(issuerAuthData, str, charge, createCharge2, gatewayResponseDto, oVar2);
        return objD == coroutine_suspended ? coroutine_suspended : objD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(Result<? extends List<Bin>> result, Continuation<? super Unit> continuation) {
        p pVar;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i10 = pVar.f83716t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pVar.f83716t0 = i10 - Integer.MIN_VALUE;
            } else {
                pVar = new p(continuation);
            }
        } else {
            pVar = new p(continuation);
        }
        Object obj = pVar.f83714r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = pVar.f83716t0;
        if (i11 != 0) {
            if (i11 == 1) {
                result = pVar.f83713q0;
                tapOnPhoneControllerImpl = pVar.f83712p0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        if (!(result instanceof Result.Success)) {
            if (result instanceof Result.Failure) {
                ((Result.Failure) result).getError().toString();
            }
            return Unit.INSTANCE;
        }
        pVar.f83712p0 = this;
        pVar.f83713q0 = result;
        pVar.f83716t0 = 1;
        if (this.f83613g.invoke(pVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        tapOnPhoneControllerImpl = this;
        InsertBinesUseCase insertBinesUseCase = tapOnPhoneControllerImpl.f83614h;
        List<Bin> list = (List) mx.openpay.library.domain.util.ResultKt.getSuccessData(result);
        pVar.f83712p0 = null;
        pVar.f83713q0 = null;
        pVar.f83716t0 = 2;
        if (insertBinesUseCase.invoke(list, pVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object m(ConnectedDeviceQ8 connectedDeviceQ8, Merchant merchant, TapOnPhoneChargeRequest tapOnPhoneChargeRequest, Result<C51Response> result, TapOnPhoneCallback tapOnPhoneCallback, Continuation<? super Result<Charge>> continuation) {
        q qVar;
        TapOnPhoneChargeRequest tapOnPhoneChargeRequest2;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl;
        TapOnPhoneCallback tapOnPhoneCallback2;
        CreateCharge createCharge;
        Result<C51Response> result2 = result;
        if (continuation instanceof q) {
            qVar = (q) continuation;
            int i10 = qVar.v0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                qVar.v0 = i10 - Integer.MIN_VALUE;
            } else {
                qVar = new q(continuation);
            }
        } else {
            qVar = new q(continuation);
        }
        Object objQ = qVar.f83721t0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = qVar.v0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objQ);
            if (!(result2 instanceof Result.Success)) {
                if (!(result2 instanceof Result.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (StringsKt__StringsKt.contains$default((CharSequence) ((Result.Failure) result2).getError().getStatus(), (CharSequence) EglobalUtils.CARD_REMOVED, false, 2, (Object) null)) {
                    String orderId = tapOnPhoneChargeRequest.getOrderId();
                    qVar.f83717p0 = result2;
                    qVar.v0 = 3;
                    if (a(orderId, false, 22, qVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return new Result.Failure(((Result.Failure) result2).getError());
            }
            CreateCharge createChargeCreateChargeRequest = ChargeUtils.INSTANCE.createChargeRequest(this.f83607a, connectedDeviceQ8.getSerial(), merchant.getSlotKey().getSlotKey(), tapOnPhoneChargeRequest.getCom.bbva.notifications.constants.PushConstants.AMOUNT java.lang.String(), tapOnPhoneChargeRequest.getOrderId(), 0, tapOnPhoneChargeRequest.getDescription(), (C51Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result));
            String cardBin = ((C51Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result)).getCardBin();
            String slotKey = merchant.getSlotKey().getSlotKey();
            qVar.f83717p0 = this;
            tapOnPhoneChargeRequest2 = tapOnPhoneChargeRequest;
            qVar.f83718q0 = tapOnPhoneChargeRequest2;
            qVar.f83719r0 = tapOnPhoneCallback;
            qVar.f83720s0 = createChargeCreateChargeRequest;
            qVar.v0 = 1;
            Object objInvoke = this.f83622q.invoke(cardBin, slotKey, qVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            tapOnPhoneControllerImpl = this;
            tapOnPhoneCallback2 = tapOnPhoneCallback;
            objQ = objInvoke;
            createCharge = createChargeCreateChargeRequest;
            if (((Boolean) objQ).booleanValue()) {
                tapOnPhoneCallback2.execute(new TapOnPhoneCallbackStates.TapOnPhoneChargeCallbackStates.PayWithPoints(createCharge));
                return new Result.Success(null, ProcessingStep.PAY_WITH_POINTS_STEP);
            }
            double dDoubleValue = tapOnPhoneChargeRequest2.getCom.bbva.notifications.constants.PushConstants.AMOUNT java.lang.String().doubleValue();
            qVar.f83717p0 = null;
            qVar.f83718q0 = null;
            qVar.f83719r0 = null;
            qVar.f83720s0 = null;
            qVar.v0 = 2;
            objQ = tapOnPhoneControllerImpl.q(dDoubleValue, createCharge, tapOnPhoneCallback2, qVar);
            if (objQ == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i11 == 1) {
            createCharge = qVar.f83720s0;
            tapOnPhoneCallback2 = qVar.f83719r0;
            TapOnPhoneChargeRequest tapOnPhoneChargeRequest3 = qVar.f83718q0;
            tapOnPhoneControllerImpl = (TapOnPhoneControllerImpl) qVar.f83717p0;
            ResultKt.throwOnFailure(objQ);
            tapOnPhoneChargeRequest2 = tapOnPhoneChargeRequest3;
            if (((Boolean) objQ).booleanValue()) {
                tapOnPhoneCallback2.execute(new TapOnPhoneCallbackStates.TapOnPhoneChargeCallbackStates.PayWithPoints(createCharge));
                return new Result.Success(null, ProcessingStep.PAY_WITH_POINTS_STEP);
            }
            double dDoubleValue2 = tapOnPhoneChargeRequest2.getCom.bbva.notifications.constants.PushConstants.AMOUNT java.lang.String().doubleValue();
            qVar.f83717p0 = null;
            qVar.f83718q0 = null;
            qVar.f83719r0 = null;
            qVar.f83720s0 = null;
            qVar.v0 = 2;
            objQ = tapOnPhoneControllerImpl.q(dDoubleValue2, createCharge, tapOnPhoneCallback2, qVar);
            if (objQ == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                result2 = (Result) qVar.f83717p0;
                ResultKt.throwOnFailure(objQ);
                return new Result.Failure(((Result.Failure) result2).getError());
            }
            ResultKt.throwOnFailure(objQ);
        }
        return objQ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(CreateCharge createCharge, String str, Continuation<? super Unit> continuation) {
        r rVar;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl;
        if (continuation instanceof r) {
            rVar = (r) continuation;
            int i10 = rVar.f83728u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                rVar.f83728u0 = i10 - Integer.MIN_VALUE;
            } else {
                rVar = new r(continuation);
            }
        } else {
            rVar = new r(continuation);
        }
        Object objInvoke = rVar.f83726s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = rVar.f83728u0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            rVar.f83723p0 = this;
            rVar.f83724q0 = createCharge;
            rVar.f83725r0 = str;
            rVar.f83728u0 = 1;
            objInvoke = this.m.invoke(str, rVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            tapOnPhoneControllerImpl = this;
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(objInvoke);
                    return Unit.INSTANCE;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objInvoke);
                return Unit.INSTANCE;
            }
            str = rVar.f83725r0;
            createCharge = rVar.f83724q0;
            tapOnPhoneControllerImpl = rVar.f83723p0;
            ResultKt.throwOnFailure(objInvoke);
        }
        if (mx.openpay.library.domain.util.ResultKt.isSuccess((Result) objInvoke)) {
            UpdateTransactionUseCase updateTransactionUseCase = tapOnPhoneControllerImpl.f83619n;
            rVar.f83723p0 = null;
            rVar.f83724q0 = null;
            rVar.f83725r0 = null;
            rVar.f83728u0 = 2;
            if (updateTransactionUseCase.invoke(createCharge, str, rVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        InsertTransactionUseCase insertTransactionUseCase = tapOnPhoneControllerImpl.f83620o;
        rVar.f83723p0 = null;
        rVar.f83724q0 = null;
        rVar.f83725r0 = null;
        rVar.f83728u0 = 3;
        if (insertTransactionUseCase.invoke(createCharge, str, rVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object o(CreateCharge createCharge, TapOnPhoneCallback tapOnPhoneCallback, Continuation<? super Result<Charge>> continuation) {
        s sVar;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper;
        if (continuation instanceof s) {
            sVar = (s) continuation;
            int i10 = sVar.f83731r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sVar.f83731r0 = i10 - Integer.MIN_VALUE;
            } else {
                sVar = new s(continuation);
            }
        } else {
            sVar = new s(continuation);
        }
        s sVar2 = sVar;
        Object objC = sVar2.f83729p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = sVar2.f83731r0;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(objC);
            }
            if (i11 == 2) {
                ResultKt.throwOnFailure(objC);
                return new Result.Failure(new Error.PinLock(null, 1, null));
            }
            if (i11 == 3) {
                ResultKt.throwOnFailure(objC);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objC);
        String pinStatus = createCharge.getEncryptedCard().getPinStatus();
        String cardBin = createCharge.getEncryptedCard().getCardBin();
        String strValueOf = String.valueOf(cardBin != null ? Boxing.boxChar(StringsKt___StringsKt.first(cardBin)) : null);
        if (Intrinsics.areEqual("00", pinStatus)) {
            EglobalUtils eglobalUtils = EglobalUtils.INSTANCE;
            EmvTags emvTags = createCharge.getEncryptedCard().getEmvTags();
            if (!eglobalUtils.requiresSignatureAMEXMC(emvTags != null ? emvTags.getCardHolderVerification() : null)) {
                EmvTags emvTags2 = createCharge.getEncryptedCard().getEmvTags();
                if (!eglobalUtils.requiresSignatureVisa(emvTags2 != null ? emvTags2.getCardHolderVerificationVisa() : null)) {
                    sVar2.f83731r0 = 1;
                    objC = c(createCharge, sVar2);
                    return objC == coroutine_suspended ? coroutine_suspended : objC;
                }
            }
            tapOnPhoneCallback.execute(new TapOnPhoneCallbackStates.TapOnPhoneChargeCallbackStates.RequestDigitalSignature(createCharge));
            return new Result.Success(null, ProcessingStep.DIGITAL_SIGN_STEP);
        }
        if (!Intrinsics.areEqual(pinStatus, "02") || !Intrinsics.areEqual(strValueOf, ExifInterface.GPS_MEASUREMENT_3D)) {
            sVar2.f83731r0 = 3;
            objC = c(createCharge, sVar2);
            return objC == coroutine_suspended ? coroutine_suspended : objC;
        }
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper2 = this.f83629x;
        if (tapOnPhonePinPadSdkWrapper2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
            tapOnPhonePinPadSdkWrapper = null;
        } else {
            tapOnPhonePinPadSdkWrapper = tapOnPhonePinPadSdkWrapper2;
        }
        sVar2.f83731r0 = 2;
        if (tapOnPhonePinPadSdkWrapper.hostResponseC54("01", "00", EglobalUtils.ISSUER_AUTH_DATA_9100, "", sVar2) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return new Result.Failure(new Error.PinLock(null, 1, null));
    }

    public final Object p(String str, String str2, GatewayResponseDto gatewayResponseDto, Continuation<? super Result<C54Response>> continuation) {
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper2;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper3;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper4;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper5;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper6;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper7;
        if (str != null && str.length() != 0) {
            String longitudeIssuerAutData = EglobalUtils.INSTANCE.getLongitudeIssuerAutData(str);
            if (gatewayResponseDto == null) {
                String strB = h0.b("91", longitudeIssuerAutData, str);
                TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper8 = this.f83629x;
                if (tapOnPhonePinPadSdkWrapper8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                    tapOnPhonePinPadSdkWrapper5 = null;
                } else {
                    tapOnPhonePinPadSdkWrapper5 = tapOnPhonePinPadSdkWrapper8;
                }
                return tapOnPhonePinPadSdkWrapper5.hostResponseC54("00", "00", strB, str2, continuation);
            }
            String strB2 = h0.b("91", longitudeIssuerAutData, str);
            if (Intrinsics.areEqual(gatewayResponseDto.getCode(), EglobalUtils.DOUBLE_AUTH_MC_CODE)) {
                TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper9 = this.f83629x;
                if (tapOnPhonePinPadSdkWrapper9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                    tapOnPhonePinPadSdkWrapper7 = null;
                } else {
                    tapOnPhonePinPadSdkWrapper7 = tapOnPhonePinPadSdkWrapper9;
                }
                return tapOnPhonePinPadSdkWrapper7.hostResponseC54("00", gatewayResponseDto.getCode(), strB2, "", continuation);
            }
            TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper10 = this.f83629x;
            if (tapOnPhonePinPadSdkWrapper10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                tapOnPhonePinPadSdkWrapper6 = null;
            } else {
                tapOnPhonePinPadSdkWrapper6 = tapOnPhonePinPadSdkWrapper10;
            }
            return tapOnPhonePinPadSdkWrapper6.hostResponseC54("01", gatewayResponseDto.getCode(), strB2, "", continuation);
        }
        if (gatewayResponseDto != null) {
            if (Intrinsics.areEqual(gatewayResponseDto.getCode(), EglobalUtils.DOUBLE_AUTH_MC_CODE)) {
                TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper11 = this.f83629x;
                if (tapOnPhonePinPadSdkWrapper11 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                    tapOnPhonePinPadSdkWrapper4 = null;
                } else {
                    tapOnPhonePinPadSdkWrapper4 = tapOnPhonePinPadSdkWrapper11;
                }
                return tapOnPhonePinPadSdkWrapper4.hostResponseC54("00", gatewayResponseDto.getCode(), EglobalUtils.ISSUER_AUTH_DATA_9100, "", continuation);
            }
            TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper12 = this.f83629x;
            if (tapOnPhonePinPadSdkWrapper12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                tapOnPhonePinPadSdkWrapper3 = null;
            } else {
                tapOnPhonePinPadSdkWrapper3 = tapOnPhonePinPadSdkWrapper12;
            }
            return tapOnPhonePinPadSdkWrapper3.hostResponseC54("01", gatewayResponseDto.getCode(), EglobalUtils.ISSUER_AUTH_DATA_9100, "", continuation);
        }
        if (str2.length() > 0) {
            TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper13 = this.f83629x;
            if (tapOnPhonePinPadSdkWrapper13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                tapOnPhonePinPadSdkWrapper2 = null;
            } else {
                tapOnPhonePinPadSdkWrapper2 = tapOnPhonePinPadSdkWrapper13;
            }
            return tapOnPhonePinPadSdkWrapper2.hostResponseC54("00", "00", EglobalUtils.ISSUER_AUTH_DATA_9100, str2, continuation);
        }
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper14 = this.f83629x;
        if (tapOnPhonePinPadSdkWrapper14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
            tapOnPhonePinPadSdkWrapper = null;
        } else {
            tapOnPhonePinPadSdkWrapper = tapOnPhonePinPadSdkWrapper14;
        }
        return tapOnPhonePinPadSdkWrapper.hostResponseC54("01", "01", EglobalUtils.ISSUER_AUTH_DATA_9100, "", continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(double d2, CreateCharge createCharge, TapOnPhoneCallback tapOnPhoneCallback, Continuation<? super Result<Charge>> continuation) {
        t tVar;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl;
        if (continuation instanceof t) {
            tVar = (t) continuation;
            int i10 = tVar.f83737u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                tVar.f83737u0 = i10 - Integer.MIN_VALUE;
            } else {
                tVar = new t(continuation);
            }
        } else {
            tVar = new t(continuation);
        }
        Object objInvoke = tVar.f83735s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = tVar.f83737u0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            String cardBin = createCharge.getEncryptedCard().getCardBin();
            if (cardBin == null) {
                cardBin = "";
            }
            tVar.f83732p0 = this;
            tVar.f83733q0 = createCharge;
            tVar.f83734r0 = tapOnPhoneCallback;
            tVar.f83737u0 = 1;
            objInvoke = this.f83628w.invoke(cardBin, d2, tVar);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            tapOnPhoneControllerImpl = this;
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(objInvoke);
                }
                if (i11 == 3) {
                    ResultKt.throwOnFailure(objInvoke);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tapOnPhoneCallback = tVar.f83734r0;
            createCharge = tVar.f83733q0;
            tapOnPhoneControllerImpl = tVar.f83732p0;
            ResultKt.throwOnFailure(objInvoke);
        }
        Result result = (Result) objInvoke;
        if (!(result instanceof Result.Success)) {
            if (!(result instanceof Result.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            tVar.f83732p0 = null;
            tVar.f83733q0 = null;
            tVar.f83734r0 = null;
            tVar.f83737u0 = 3;
            objInvoke = tapOnPhoneControllerImpl.o(createCharge, tapOnPhoneCallback, tVar);
            return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
        }
        Result.Success success = (Result.Success) result;
        List list = (List) success.getData();
        if (list != null && (!list.isEmpty())) {
            List listEmptyList = (List) success.getData();
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            tapOnPhoneCallback.execute(new TapOnPhoneCallbackStates.TapOnPhoneChargeCallbackStates.PayWithPlans(createCharge, listEmptyList));
            return new Result.Success(null, ProcessingStep.PAY_WITH_PLANS_STEP);
        }
        tVar.f83732p0 = null;
        tVar.f83733q0 = null;
        tVar.f83734r0 = null;
        tVar.f83737u0 = 2;
        objInvoke = tapOnPhoneControllerImpl.o(createCharge, tapOnPhoneCallback, tVar);
        return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00db  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:44:0x0108 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0109  */
    /* JADX WARN: Code duplicated, block: B:47:0x0119  */
    /* JADX WARN: Code duplicated, block: B:49:0x011d  */
    /* JADX WARN: Code duplicated, block: B:62:0x013b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0155 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x0156  */
    /* JADX WARN: Code duplicated, block: B:69:0x0168 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x016f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0189 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:77:0x018a  */
    /* JADX WARN: Code duplicated, block: B:80:0x019c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:94:0x01de A[RETURN] */
    public final Object r(ConnectedDeviceQ8 connectedDeviceQ8, Transaction transaction, RefundRequest refundRequest, C51Response c51Response, Continuation<? super Result<Transaction>> continuation) {
        u uVar;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl;
        TapOnPhoneControllerImpl tapOnPhoneControllerImpl2;
        Result result;
        Error error;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper2;
        Object objHostResponseC54;
        Result result2;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper3;
        Object objHostResponseC55;
        TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper4;
        Object objHostResponseC56;
        Result result3;
        Result result4;
        Result result5;
        if (continuation instanceof u) {
            uVar = (u) continuation;
            int i10 = uVar.f83742t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                uVar.f83742t0 = i10 - Integer.MIN_VALUE;
            } else {
                uVar = new u(continuation);
            }
        } else {
            uVar = new u(continuation);
        }
        u uVar2 = uVar;
        Object objHostResponseC57 = uVar2.f83740r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        switch (uVar2.f83742t0) {
            case 0:
                ResultKt.throwOnFailure(objHostResponseC57);
                RefundUtils refundUtils = RefundUtils.INSTANCE;
                if (!refundUtils.validateIfCardIsCorrect(c51Response, transaction)) {
                    TapOnPhonePinPadSdkWrapper tapOnPhonePinPadSdkWrapper5 = this.f83629x;
                    if (tapOnPhonePinPadSdkWrapper5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                        tapOnPhonePinPadSdkWrapper = null;
                    } else {
                        tapOnPhonePinPadSdkWrapper = tapOnPhonePinPadSdkWrapper5;
                    }
                    uVar2.f83738p0 = this;
                    uVar2.f83742t0 = 8;
                    objHostResponseC57 = tapOnPhonePinPadSdkWrapper.hostResponseC54("01", "05", EglobalUtils.ISSUER_AUTH_DATA_9100, "", uVar2);
                    if (objHostResponseC57 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    tapOnPhoneControllerImpl = this;
                    uVar2.f83738p0 = null;
                    uVar2.f83742t0 = 9;
                    if (tapOnPhoneControllerImpl.i((Result) objHostResponseC57, uVar2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return new Result.Failure(new Error.DifferentCard(null, 1, null));
                }
                Merchant merchant = this.f83631z;
                if (merchant == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant = null;
                }
                connectedDeviceQ8.setSlotKey(merchant.getSlotKey().getSlotKey());
                Merchant merchant2 = this.f83631z;
                if (merchant2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantInfo");
                    merchant2 = null;
                }
                connectedDeviceQ8.setSlotKeyName(merchant2.getSlotKey().getKeyName());
                refundUtils.completeRefundRequest(this.f83607a, connectedDeviceQ8, transaction, refundRequest, c51Response);
                uVar2.f83738p0 = this;
                uVar2.f83742t0 = 1;
                objHostResponseC57 = this.f83627v.invoke(refundRequest, uVar2);
                if (objHostResponseC57 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tapOnPhoneControllerImpl2 = this;
                result = (Result) objHostResponseC57;
                if (result instanceof Result.Success) {
                    tapOnPhonePinPadSdkWrapper4 = tapOnPhoneControllerImpl2.f83629x;
                    if (tapOnPhonePinPadSdkWrapper4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                        tapOnPhonePinPadSdkWrapper4 = null;
                    }
                    uVar2.f83738p0 = result;
                    uVar2.f83739q0 = tapOnPhoneControllerImpl2;
                    uVar2.f83742t0 = 2;
                    objHostResponseC56 = tapOnPhonePinPadSdkWrapper4.hostResponseC54("00", "00", EglobalUtils.ISSUER_AUTH_DATA_9100, "", uVar2);
                    if (objHostResponseC56 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    result3 = result;
                    objHostResponseC57 = objHostResponseC56;
                    uVar2.f83738p0 = result3;
                    uVar2.f83739q0 = null;
                    uVar2.f83742t0 = 3;
                    if (tapOnPhoneControllerImpl2.i((Result) objHostResponseC57, uVar2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    result4 = result3;
                    return new Result.Success(((Result.Success) result4).getData(), ProcessingStep.PROCESSED_STEP);
                }
                if (result instanceof Result.Failure) {
                    throw new NoWhenBranchMatchedException();
                }
                error = ((Result.Failure) result).getError();
                if ((error instanceof Error.TimeOut) || (error instanceof Error.BadGateway) || (error instanceof Error.ServiceUnavailable) || (error instanceof Error.InternalServer)) {
                    tapOnPhonePinPadSdkWrapper2 = tapOnPhoneControllerImpl2.f83629x;
                    if (tapOnPhonePinPadSdkWrapper2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                        tapOnPhonePinPadSdkWrapper2 = null;
                    }
                    uVar2.f83738p0 = result;
                    uVar2.f83739q0 = tapOnPhoneControllerImpl2;
                    uVar2.f83742t0 = 4;
                    objHostResponseC54 = tapOnPhonePinPadSdkWrapper2.hostResponseC54("02", "00", EglobalUtils.ISSUER_AUTH_DATA_9100, "", uVar2);
                    if (objHostResponseC54 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    result2 = result;
                    objHostResponseC57 = objHostResponseC54;
                    uVar2.f83738p0 = result2;
                    uVar2.f83739q0 = null;
                    uVar2.f83742t0 = 5;
                    if (tapOnPhoneControllerImpl2.i((Result) objHostResponseC57, uVar2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    result5 = result2;
                    return new Result.Failure(((Result.Failure) result5).getError());
                }
                tapOnPhonePinPadSdkWrapper3 = tapOnPhoneControllerImpl2.f83629x;
                if (tapOnPhonePinPadSdkWrapper3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                    tapOnPhonePinPadSdkWrapper3 = null;
                }
                uVar2.f83738p0 = result;
                uVar2.f83739q0 = tapOnPhoneControllerImpl2;
                uVar2.f83742t0 = 6;
                objHostResponseC55 = tapOnPhonePinPadSdkWrapper3.hostResponseC54("01", "", EglobalUtils.ISSUER_AUTH_DATA_9100, "", uVar2);
                if (objHostResponseC55 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result2 = result;
                objHostResponseC57 = objHostResponseC55;
                uVar2.f83738p0 = result2;
                uVar2.f83739q0 = null;
                uVar2.f83742t0 = 7;
                if (tapOnPhoneControllerImpl2.i((Result) objHostResponseC57, uVar2) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result5 = result2;
                return new Result.Failure(((Result.Failure) result5).getError());
            case 1:
                tapOnPhoneControllerImpl2 = (TapOnPhoneControllerImpl) uVar2.f83738p0;
                ResultKt.throwOnFailure(objHostResponseC57);
                result = (Result) objHostResponseC57;
                if (result instanceof Result.Success) {
                    tapOnPhonePinPadSdkWrapper4 = tapOnPhoneControllerImpl2.f83629x;
                    if (tapOnPhonePinPadSdkWrapper4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                        tapOnPhonePinPadSdkWrapper4 = null;
                    }
                    uVar2.f83738p0 = result;
                    uVar2.f83739q0 = tapOnPhoneControllerImpl2;
                    uVar2.f83742t0 = 2;
                    objHostResponseC56 = tapOnPhonePinPadSdkWrapper4.hostResponseC54("00", "00", EglobalUtils.ISSUER_AUTH_DATA_9100, "", uVar2);
                    if (objHostResponseC56 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    result3 = result;
                    objHostResponseC57 = objHostResponseC56;
                    uVar2.f83738p0 = result3;
                    uVar2.f83739q0 = null;
                    uVar2.f83742t0 = 3;
                    if (tapOnPhoneControllerImpl2.i((Result) objHostResponseC57, uVar2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    result4 = result3;
                    return new Result.Success(((Result.Success) result4).getData(), ProcessingStep.PROCESSED_STEP);
                }
                if (result instanceof Result.Failure) {
                    throw new NoWhenBranchMatchedException();
                }
                error = ((Result.Failure) result).getError();
                if (error instanceof Error.TimeOut) {
                    tapOnPhonePinPadSdkWrapper3 = tapOnPhoneControllerImpl2.f83629x;
                    if (tapOnPhonePinPadSdkWrapper3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                        tapOnPhonePinPadSdkWrapper3 = null;
                    }
                    uVar2.f83738p0 = result;
                    uVar2.f83739q0 = tapOnPhoneControllerImpl2;
                    uVar2.f83742t0 = 6;
                    objHostResponseC55 = tapOnPhonePinPadSdkWrapper3.hostResponseC54("01", "", EglobalUtils.ISSUER_AUTH_DATA_9100, "", uVar2);
                    if (objHostResponseC55 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    result2 = result;
                    objHostResponseC57 = objHostResponseC55;
                    uVar2.f83738p0 = result2;
                    uVar2.f83739q0 = null;
                    uVar2.f83742t0 = 7;
                    if (tapOnPhoneControllerImpl2.i((Result) objHostResponseC57, uVar2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    result5 = result2;
                    return new Result.Failure(((Result.Failure) result5).getError());
                }
                tapOnPhonePinPadSdkWrapper2 = tapOnPhoneControllerImpl2.f83629x;
                if (tapOnPhonePinPadSdkWrapper2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tapOnPhonePinPadSdkWrapper");
                    tapOnPhonePinPadSdkWrapper2 = null;
                }
                uVar2.f83738p0 = result;
                uVar2.f83739q0 = tapOnPhoneControllerImpl2;
                uVar2.f83742t0 = 4;
                objHostResponseC54 = tapOnPhonePinPadSdkWrapper2.hostResponseC54("02", "00", EglobalUtils.ISSUER_AUTH_DATA_9100, "", uVar2);
                if (objHostResponseC54 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result2 = result;
                objHostResponseC57 = objHostResponseC54;
                uVar2.f83738p0 = result2;
                uVar2.f83739q0 = null;
                uVar2.f83742t0 = 5;
                if (tapOnPhoneControllerImpl2.i((Result) objHostResponseC57, uVar2) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result5 = result2;
                return new Result.Failure(((Result.Failure) result5).getError());
            case 2:
                tapOnPhoneControllerImpl2 = uVar2.f83739q0;
                result3 = (Result) uVar2.f83738p0;
                ResultKt.throwOnFailure(objHostResponseC57);
                uVar2.f83738p0 = result3;
                uVar2.f83739q0 = null;
                uVar2.f83742t0 = 3;
                if (tapOnPhoneControllerImpl2.i((Result) objHostResponseC57, uVar2) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result4 = result3;
                return new Result.Success(((Result.Success) result4).getData(), ProcessingStep.PROCESSED_STEP);
            case 3:
                result4 = (Result) uVar2.f83738p0;
                ResultKt.throwOnFailure(objHostResponseC57);
                return new Result.Success(((Result.Success) result4).getData(), ProcessingStep.PROCESSED_STEP);
            case 4:
                tapOnPhoneControllerImpl2 = uVar2.f83739q0;
                result2 = (Result) uVar2.f83738p0;
                ResultKt.throwOnFailure(objHostResponseC57);
                uVar2.f83738p0 = result2;
                uVar2.f83739q0 = null;
                uVar2.f83742t0 = 5;
                if (tapOnPhoneControllerImpl2.i((Result) objHostResponseC57, uVar2) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result5 = result2;
                return new Result.Failure(((Result.Failure) result5).getError());
            case 5:
            case 7:
                result5 = (Result) uVar2.f83738p0;
                ResultKt.throwOnFailure(objHostResponseC57);
                return new Result.Failure(((Result.Failure) result5).getError());
            case 6:
                tapOnPhoneControllerImpl2 = uVar2.f83739q0;
                result2 = (Result) uVar2.f83738p0;
                ResultKt.throwOnFailure(objHostResponseC57);
                uVar2.f83738p0 = result2;
                uVar2.f83739q0 = null;
                uVar2.f83742t0 = 7;
                if (tapOnPhoneControllerImpl2.i((Result) objHostResponseC57, uVar2) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result5 = result2;
                return new Result.Failure(((Result.Failure) result5).getError());
            case 8:
                tapOnPhoneControllerImpl = (TapOnPhoneControllerImpl) uVar2.f83738p0;
                ResultKt.throwOnFailure(objHostResponseC57);
                uVar2.f83738p0 = null;
                uVar2.f83742t0 = 9;
                if (tapOnPhoneControllerImpl.i((Result) objHostResponseC57, uVar2) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return new Result.Failure(new Error.DifferentCard(null, 1, null));
            case 9:
                ResultKt.throwOnFailure(objHostResponseC57);
                return new Result.Failure(new Error.DifferentCard(null, 1, null));
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
