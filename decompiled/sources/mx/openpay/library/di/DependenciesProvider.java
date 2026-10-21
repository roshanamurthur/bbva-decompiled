package mx.openpay.library.di;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import androidx.annotation.Keep;
import androidx.room.Room;
import com.google.gson.Gson;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.CoroutineScope;
import mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController;
import mx.openpay.library.data.datasource.local.EglobalLocalDataSourceImpl;
import mx.openpay.library.data.datasource.local.InMemoryTokenDataSourceImpl;
import mx.openpay.library.data.datasource.local.TransactionsLocalDataSourceImpl;
import mx.openpay.library.data.datasource.local.database.OpenPaySDKDataBase;
import mx.openpay.library.data.datasource.local.database.dao.BinDao;
import mx.openpay.library.data.datasource.local.database.dao.ConnectedDeviceDao;
import mx.openpay.library.data.datasource.local.database.dao.MerchantDao;
import mx.openpay.library.data.datasource.local.database.dao.MerchantSlotDao;
import mx.openpay.library.data.datasource.local.database.dao.TransactionDao;
import mx.openpay.library.data.datasource.remote.OpenPayAPI;
import mx.openpay.library.data.datasource.remote.datasource.EglobalRemoteDataSourceImpl;
import mx.openpay.library.data.datasource.remote.datasource.PaymentLinkRemoteDataSourceImpl;
import mx.openpay.library.data.datasource.remote.datasource.TapOnPhoneDataSourceImpl;
import mx.openpay.library.data.datasource.remote.datasource.TransactionsRemoteDataSourceImpl;
import mx.openpay.library.data.datasource.remote.interceptors.AuthHeaderInterceptor;
import mx.openpay.library.data.datasource.remote.interceptors.CountryHeaderInterceptor;
import mx.openpay.library.data.datasource.remote.interceptors.UserAgentHeaderInterceptor;
import mx.openpay.library.data.repository.AuthTokenRepositoryImpl;
import mx.openpay.library.data.repository.EglobalRepositoryImpl;
import mx.openpay.library.data.repository.PaymentLinkRepositoryImpl;
import mx.openpay.library.data.repository.TapOnPhoneRepositoryImpl;
import mx.openpay.library.data.repository.TransactionRepositoryImpl;
import mx.openpay.library.data.taponphone.TapOnPhoneControllerImpl;
import mx.openpay.library.data.taponphone.TapOnPhonePinPadControllerImpl;
import mx.openpay.library.data.util.AndroidErrorLogger;
import mx.openpay.library.data.util.ErrorHandlerImpl;
import mx.openpay.library.domain.bluetooth.BluetoothController;
import mx.openpay.library.domain.datasource.TapOnPhoneDataSource;
import mx.openpay.library.domain.model.Configuration;
import mx.openpay.library.domain.model.Country;
import mx.openpay.library.domain.model.Environment;
import mx.openpay.library.domain.model.EnvironmentConstants;
import mx.openpay.library.domain.model.IntegratorTags;
import mx.openpay.library.domain.repository.AuthTokenRepository;
import mx.openpay.library.domain.repository.EglobalRepository;
import mx.openpay.library.domain.repository.PaymentLinkRepository;
import mx.openpay.library.domain.repository.TapOnPhoneRepository;
import mx.openpay.library.domain.repository.TransactionRepository;
import mx.openpay.library.domain.taponphone.TapOnPhoneController;
import mx.openpay.library.domain.taponphone.TapOnPhonePinPadController;
import mx.openpay.library.domain.usecase.GetPaymentPlansUseCase;
import mx.openpay.library.domain.usecase.GetPaymentPlansUseCaseImpl;
import mx.openpay.library.domain.usecase.GetPaymentPlansWithoutBinUseCase;
import mx.openpay.library.domain.usecase.GetPaymentPlansWithoutBinUseCaseImpl;
import mx.openpay.library.domain.usecase.eglobal.CanPayWithBbvaPointsUseCase;
import mx.openpay.library.domain.usecase.eglobal.CanPayWithBbvaPointsUseCaseImpl;
import mx.openpay.library.domain.usecase.eglobal.CheckTerminalCapacityDataUseCase;
import mx.openpay.library.domain.usecase.eglobal.CheckTerminalCapacityDataUseCaseImpl;
import mx.openpay.library.domain.usecase.eglobal.CreateChargeUseCase;
import mx.openpay.library.domain.usecase.eglobal.CreateChargeUseCaseImpl;
import mx.openpay.library.domain.usecase.eglobal.DeleteAllBinesUseCase;
import mx.openpay.library.domain.usecase.eglobal.DeleteAllBinesUseCaseImpl;
import mx.openpay.library.domain.usecase.eglobal.ExecuteChargeUseCase;
import mx.openpay.library.domain.usecase.eglobal.ExecuteChargeUseCaseImpl;
import mx.openpay.library.domain.usecase.eglobal.FirmwareUpdateStatusUseCase;
import mx.openpay.library.domain.usecase.eglobal.FirmwareUpdateStatusUseCaseImpl;
import mx.openpay.library.domain.usecase.eglobal.GetBinesCountUseCase;
import mx.openpay.library.domain.usecase.eglobal.GetBinesCountUseCaseImpl;
import mx.openpay.library.domain.usecase.eglobal.GetBinesUseCase;
import mx.openpay.library.domain.usecase.eglobal.GetBinesUseCaseImpl;
import mx.openpay.library.domain.usecase.eglobal.GetFirmwareUseCase;
import mx.openpay.library.domain.usecase.eglobal.GetFirmwareUseCaseImpl;
import mx.openpay.library.domain.usecase.eglobal.GetKeyInjectedDateBySerialUseCase;
import mx.openpay.library.domain.usecase.eglobal.GetKeyInjectedDateBySerialUseCaseImpl;
import mx.openpay.library.domain.usecase.eglobal.GetMerchantKeyNameBySlotUseCase;
import mx.openpay.library.domain.usecase.eglobal.GetMerchantKeyNameBySlotUseCaseImpl;
import mx.openpay.library.domain.usecase.eglobal.GetMerchantUseCase;
import mx.openpay.library.domain.usecase.eglobal.GetMerchantUseCaseImpl;
import mx.openpay.library.domain.usecase.eglobal.GetRSAKeysUseCase;
import mx.openpay.library.domain.usecase.eglobal.GetRSAKeysUseCaseImpl;
import mx.openpay.library.domain.usecase.eglobal.GetRenewKeyBySlotAndTerminalUseCase;
import mx.openpay.library.domain.usecase.eglobal.GetRenewKeyBySlotAndTerminalUseCaseImpl;
import mx.openpay.library.domain.usecase.eglobal.InitializeKeysUseCase;
import mx.openpay.library.domain.usecase.eglobal.InitializeKeysUseCaseImpl;
import mx.openpay.library.domain.usecase.eglobal.InsertBinesUseCase;
import mx.openpay.library.domain.usecase.eglobal.InsertBinesUseCaseImpl;
import mx.openpay.library.domain.usecase.eglobal.InsertConnectedDeviceInfoUseCase;
import mx.openpay.library.domain.usecase.eglobal.InsertConnectedDeviceInfoUseCaseImpl;
import mx.openpay.library.domain.usecase.eglobal.InsertMerchantDetailsUseCase;
import mx.openpay.library.domain.usecase.eglobal.InsertMerchantDetailsUseCaseImpl;
import mx.openpay.library.domain.usecase.eglobal.IsMerchantSlotKeyValidatedUseCase;
import mx.openpay.library.domain.usecase.eglobal.IsMerchantSlotKeyValidatedUseCaseImpl;
import mx.openpay.library.domain.usecase.eglobal.RefundChargeUseCase;
import mx.openpay.library.domain.usecase.eglobal.RefundChargeUseCaseImpl;
import mx.openpay.library.domain.usecase.eglobal.ReverseChargeUseCase;
import mx.openpay.library.domain.usecase.eglobal.ReverseChargeUseCaseImpl;
import mx.openpay.library.domain.usecase.eglobal.UpdateFirmwareUseCase;
import mx.openpay.library.domain.usecase.eglobal.UpdateFirmwareUseCaseImpl;
import mx.openpay.library.domain.usecase.eglobal.UpdateKeyInjectedDateBySerialUseCase;
import mx.openpay.library.domain.usecase.eglobal.UpdateKeyInjectedDateBySerialUseCaseImpl;
import mx.openpay.library.domain.usecase.eglobal.UpdateMerchantSlotKeyInjectedBySlotUseCase;
import mx.openpay.library.domain.usecase.eglobal.UpdateMerchantSlotKeyInjectedBySlotUseCaseImpl;
import mx.openpay.library.domain.usecase.eglobal.UpdateRenewKeyBySlotAndTerminalUseCase;
import mx.openpay.library.domain.usecase.eglobal.UpdateRenewKeyBySlotAndTerminalUseCaseImpl;
import mx.openpay.library.domain.usecase.eglobal.UpdateTerminalCapacityDataUseCase;
import mx.openpay.library.domain.usecase.eglobal.UpdateTerminalCapacityDataUseCaseImpl;
import mx.openpay.library.domain.usecase.paymentlink.CheckPaymentLinkUseCaseImpl;
import mx.openpay.library.domain.usecase.paymentlink.CreatePaymentLinkUseCaseImpl;
import mx.openpay.library.domain.usecase.paymentlink.GetAllPaymentLinksUseCaseImpl;
import mx.openpay.library.domain.usecase.paymentlink.RefundPaymentLinkUseCaseImpl;
import mx.openpay.library.domain.usecase.paymentlink.UpdatePaymentLinkStatusUseCaseImpl;
import mx.openpay.library.domain.usecase.paymentlink.UpdatePaymentLinkUseCaseImpl;
import mx.openpay.library.domain.usecase.taponphone.CancelTapOnPhoneProcessUseCase;
import mx.openpay.library.domain.usecase.taponphone.CancelTapOnPhoneProcessUseCaseImpl;
import mx.openpay.library.domain.usecase.taponphone.CreatedTsdkManualInitializerUseCase;
import mx.openpay.library.domain.usecase.taponphone.CreatedTsdkManualInitializerUseCaseImpl;
import mx.openpay.library.domain.usecase.taponphone.ExecuteTapOnPhoneChargePlansStepUseCase;
import mx.openpay.library.domain.usecase.taponphone.ExecuteTapOnPhoneChargePlansStepUseCaseImpl;
import mx.openpay.library.domain.usecase.taponphone.ExecuteTapOnPhoneChargePointsStepUseCase;
import mx.openpay.library.domain.usecase.taponphone.ExecuteTapOnPhoneChargePointsStepUseCaseImpl;
import mx.openpay.library.domain.usecase.taponphone.ExecuteTapOnPhoneChargeSignStepUseCase;
import mx.openpay.library.domain.usecase.taponphone.ExecuteTapOnPhoneChargeSignStepUseCaseImpl;
import mx.openpay.library.domain.usecase.taponphone.ExecuteTapOnPhoneChargeUseCase;
import mx.openpay.library.domain.usecase.taponphone.ExecuteTapOnPhoneChargeUseCaseImpl;
import mx.openpay.library.domain.usecase.taponphone.ExecuteTapOnPhoneRefundChargeUseCase;
import mx.openpay.library.domain.usecase.taponphone.ExecuteTapOnPhoneRefundChargeUseCaseImpl;
import mx.openpay.library.domain.usecase.taponphone.InitTapOnPhoneUseCase;
import mx.openpay.library.domain.usecase.taponphone.InitTapOnPhoneUseCaseImpl;
import mx.openpay.library.domain.usecase.taponphone.InitTsdkManualInitializerUseCase;
import mx.openpay.library.domain.usecase.taponphone.InitTsdkManualInitializerUseCaseImpl;
import mx.openpay.library.domain.usecase.taponphone.IsApplicationInitAllowedUseCase;
import mx.openpay.library.domain.usecase.taponphone.IsApplicationInitAllowedUseCaseImpl;
import mx.openpay.library.domain.usecase.taponphone.RegisterSmartphoneUseCase;
import mx.openpay.library.domain.usecase.taponphone.RegisterSmartphoneUseCaseImpl;
import mx.openpay.library.domain.usecase.transaction.GetAllTransactionsUseCase;
import mx.openpay.library.domain.usecase.transaction.GetTransactionByIdUseCase;
import mx.openpay.library.domain.usecase.transaction.InsertTransactionUseCase;
import mx.openpay.library.domain.usecase.transaction.InsertTransactionUseCaseImpl;
import mx.openpay.library.domain.usecase.transaction.SendVoucherUseCase;
import mx.openpay.library.domain.usecase.transaction.SendVoucherUseCaseImpl;
import mx.openpay.library.domain.usecase.transaction.UpdateTransactionUseCase;
import mx.openpay.library.domain.usecase.transaction.UpdateTransactionUseCaseImpl;
import mx.openpay.library.domain.util.ErrorHandler;
import mx.openpay.library.domain.util.ErrorLogger;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: compiled from: DependenciesProvider.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004KLMNB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020(2\u0006\u00101\u001a\u00020&J\b\u00102\u001a\u000203H\u0002J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u00020(2\u0006\u00107\u001a\u000208J\u0006\u00109\u001a\u00020\u0004J\b\u0010:\u001a\u00020;H\u0002J\u0006\u0010<\u001a\u00020\u0004J\u0006\u0010=\u001a\u00020>J\b\u0010?\u001a\u00020\fH\u0002J\b\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u00020CH\u0002J\u001a\u0010D\u001a\u00020E2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010F\u001a\u00020\u0016H\u0002J\u0010\u0010G\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010H\u001a\u00020\u0004H\u0002J\b\u0010I\u001a\u00020JH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0015\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0019\u0010\u0017R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\n\u001a\u0004\b\"\u0010#R\u000e\u0010%\u001a\u00020&X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010)\u001a\u00020*8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b+\u0010,¨\u0006O"}, d2 = {"Lmx/openpay/library/di/DependenciesProvider;", "", "()V", "SDK_DATABASE_NAME", "", "dataBase", "Lmx/openpay/library/data/datasource/local/database/OpenPaySDKDataBase;", "getDataBase", "()Lmx/openpay/library/data/datasource/local/database/OpenPaySDKDataBase;", "dataBase$delegate", "Lkotlin/Lazy;", "environment", "Lmx/openpay/library/domain/model/Environment;", "getEnvironment", "()Lmx/openpay/library/domain/model/Environment;", "environment$delegate", "errorHandler", "Lmx/openpay/library/domain/util/ErrorHandler;", "getErrorHandler", "()Lmx/openpay/library/domain/util/ErrorHandler;", "errorHandler$delegate", "isDevCertEnv", "", "()Z", "isDevCertEnv$delegate", "isProdEnv", "isProdEnv$delegate", "logCatLogger", "Lmx/openpay/library/domain/util/ErrorLogger;", "getLogCatLogger", "()Lmx/openpay/library/domain/util/ErrorLogger;", "logCatLogger$delegate", "openPayApi", "Lmx/openpay/library/data/datasource/remote/OpenPayAPI;", "getOpenPayApi", "()Lmx/openpay/library/data/datasource/remote/OpenPayAPI;", "openPayApi$delegate", "openPayConfiguration", "Lmx/openpay/library/domain/model/Configuration;", "openPayContext", "Landroid/content/Context;", "tokenRepository", "Lmx/openpay/library/domain/repository/AuthTokenRepository;", "getTokenRepository", "()Lmx/openpay/library/domain/repository/AuthTokenRepository;", "tokenRepository$delegate", "init", "", "context", "configuration", "provideAuthHeaderInterceptor", "Lmx/openpay/library/data/datasource/remote/interceptors/AuthHeaderInterceptor;", "provideBluetoothController", "Lmx/openpay/library/domain/bluetooth/BluetoothController;", "appContext", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "provideCountryCode", "provideCountryHeaderInterceptor", "Lmx/openpay/library/data/datasource/remote/interceptors/CountryHeaderInterceptor;", "provideCurrencyIsoCode", "provideCurrentCountry", "Lmx/openpay/library/domain/model/Country;", "provideCurrentEnvironment", "provideCurrentIntegratorTags", "Lmx/openpay/library/domain/model/IntegratorTags;", "provideLocalTokenDataSource", "Lmx/openpay/library/data/datasource/local/InMemoryTokenDataSourceImpl;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "includeCountryInterceptor", "provideOpenAPI", "provideUserAgent", "provideUserAgentInterceptor", "Lmx/openpay/library/data/datasource/remote/interceptors/UserAgentHeaderInterceptor;", "EglobalModule", "PaymentLinkModule", "TapOnPhoneModule", "TransactionModule", "di_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"StaticFieldLeak"})
public final class DependenciesProvider {

    @NotNull
    private static final String SDK_DATABASE_NAME = "OpenPaySDK-DataBase";
    private static Configuration openPayConfiguration;
    private static Context openPayContext;

    @NotNull
    public static final DependenciesProvider INSTANCE = new DependenciesProvider();

    /* JADX INFO: renamed from: dataBase$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy dataBase = LazyKt__LazyJVMKt.lazy(a.f83839p0);

    /* JADX INFO: renamed from: tokenRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy tokenRepository = LazyKt__LazyJVMKt.lazy(h.f83846p0);

    /* JADX INFO: renamed from: environment$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy environment = LazyKt__LazyJVMKt.lazy(b.f83840p0);

    /* JADX INFO: renamed from: isProdEnv$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy isProdEnv = LazyKt__LazyJVMKt.lazy(e.f83843p0);

    /* JADX INFO: renamed from: isDevCertEnv$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy isDevCertEnv = LazyKt__LazyJVMKt.lazy(d.f83842p0);

    /* JADX INFO: renamed from: openPayApi$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy openPayApi = LazyKt__LazyJVMKt.lazy(g.f83845p0);

    /* JADX INFO: renamed from: logCatLogger$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy logCatLogger = LazyKt__LazyJVMKt.lazy(f.f83844p0);

    /* JADX INFO: renamed from: errorHandler$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy errorHandler = LazyKt__LazyJVMKt.lazy(c.f83841p0);

    /* JADX INFO: compiled from: DependenciesProvider.kt */
    @Keep
    @Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u00020%H\u0002J\u0006\u0010&\u001a\u00020'J\u0006\u0010(\u001a\u00020)J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020-H\u0002J\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u000201J\u0006\u00102\u001a\u000203J\u0006\u00104\u001a\u000205J\b\u00106\u001a\u000207H\u0002J\u0006\u00108\u001a\u000209J\u0006\u0010:\u001a\u00020;J\u0006\u0010<\u001a\u00020=J\u0006\u0010>\u001a\u00020?J\u0006\u0010@\u001a\u00020AJ\u0006\u0010B\u001a\u00020CJ\u0006\u0010D\u001a\u00020EJ\u0006\u0010F\u001a\u00020GJ\u0006\u0010H\u001a\u00020IJ\u0006\u0010J\u001a\u00020KJ\u0006\u0010L\u001a\u00020MJ\u0006\u0010N\u001a\u00020OJ\u0006\u0010P\u001a\u00020QJ\u0006\u0010R\u001a\u00020SJ\b\u0010T\u001a\u00020UH\u0002J\u0006\u0010V\u001a\u00020WJ\u0006\u0010X\u001a\u00020YJ\u0006\u0010Z\u001a\u00020[J\u0006\u0010\\\u001a\u00020]J\u0006\u0010^\u001a\u00020_R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\b\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\b\u001a\u0004\b\u001f\u0010 ¨\u0006`"}, d2 = {"Lmx/openpay/library/di/DependenciesProvider$EglobalModule;", "", "()V", "binDao", "Lmx/openpay/library/data/datasource/local/database/dao/BinDao;", "getBinDao", "()Lmx/openpay/library/data/datasource/local/database/dao/BinDao;", "binDao$delegate", "Lkotlin/Lazy;", "connectedDeviceDao", "Lmx/openpay/library/data/datasource/local/database/dao/ConnectedDeviceDao;", "getConnectedDeviceDao", "()Lmx/openpay/library/data/datasource/local/database/dao/ConnectedDeviceDao;", "connectedDeviceDao$delegate", "eglobalRepository", "Lmx/openpay/library/domain/repository/EglobalRepository;", "getEglobalRepository", "()Lmx/openpay/library/domain/repository/EglobalRepository;", "eglobalRepository$delegate", "merchantDao", "Lmx/openpay/library/data/datasource/local/database/dao/MerchantDao;", "getMerchantDao", "()Lmx/openpay/library/data/datasource/local/database/dao/MerchantDao;", "merchantDao$delegate", "merchantSlotDao", "Lmx/openpay/library/data/datasource/local/database/dao/MerchantSlotDao;", "getMerchantSlotDao", "()Lmx/openpay/library/data/datasource/local/database/dao/MerchantSlotDao;", "merchantSlotDao$delegate", "transactionDao", "Lmx/openpay/library/data/datasource/local/database/dao/TransactionDao;", "getTransactionDao", "()Lmx/openpay/library/data/datasource/local/database/dao/TransactionDao;", "transactionDao$delegate", "provideCanPayWithBbvaPointsUseCase", "Lmx/openpay/library/domain/usecase/eglobal/CanPayWithBbvaPointsUseCase;", "provideCheckTerminalCapacityDataUseCase", "Lmx/openpay/library/domain/usecase/eglobal/CheckTerminalCapacityDataUseCase;", "provideCreateChargeUseCase", "Lmx/openpay/library/domain/usecase/eglobal/CreateChargeUseCase;", "provideDeleteAllBinesUseCase", "Lmx/openpay/library/domain/usecase/eglobal/DeleteAllBinesUseCase;", "provideEglobalRemoteDataSource", "Lmx/openpay/library/data/datasource/remote/datasource/EglobalRemoteDataSourceImpl;", "provideEglobalRepository", "Lmx/openpay/library/data/repository/EglobalRepositoryImpl;", "provideExecuteChargeUseCase", "Lmx/openpay/library/domain/usecase/eglobal/ExecuteChargeUseCase;", "provideFirmwareUpdateStatus", "Lmx/openpay/library/domain/usecase/eglobal/FirmwareUpdateStatusUseCase;", "provideGetBinesCountUseCase", "Lmx/openpay/library/domain/usecase/eglobal/GetBinesCountUseCase;", "provideGetBinesUseCase", "Lmx/openpay/library/domain/usecase/eglobal/GetBinesUseCase;", "provideGetFirmwareUseCase", "Lmx/openpay/library/domain/usecase/eglobal/GetFirmwareUseCase;", "provideGetKeyInjectedDateBySerialUseCase", "Lmx/openpay/library/domain/usecase/eglobal/GetKeyInjectedDateBySerialUseCase;", "provideGetMerchantKeyNameBySlotUseCase", "Lmx/openpay/library/domain/usecase/eglobal/GetMerchantKeyNameBySlotUseCase;", "provideGetMerchantUseCase", "Lmx/openpay/library/domain/usecase/eglobal/GetMerchantUseCase;", "provideGetPaymentPlansUseCaseImpl", "Lmx/openpay/library/domain/usecase/GetPaymentPlansUseCase;", "provideGetPaymentPlansWithoutBinUseCase", "Lmx/openpay/library/domain/usecase/GetPaymentPlansWithoutBinUseCase;", "provideGetRSAKeysUseCase", "Lmx/openpay/library/domain/usecase/eglobal/GetRSAKeysUseCase;", "provideGetRenewKeyBySlotAndTerminalUseCase", "Lmx/openpay/library/domain/usecase/eglobal/GetRenewKeyBySlotAndTerminalUseCase;", "provideInitializeKeysUseCase", "Lmx/openpay/library/domain/usecase/eglobal/InitializeKeysUseCase;", "provideInsertBinesUseCase", "Lmx/openpay/library/domain/usecase/eglobal/InsertBinesUseCase;", "provideInsertConnectedDeviceInfoUseCase", "Lmx/openpay/library/domain/usecase/eglobal/InsertConnectedDeviceInfoUseCase;", "provideInsertMerchantDetailsUseCase", "Lmx/openpay/library/domain/usecase/eglobal/InsertMerchantDetailsUseCase;", "provideIsMerchantSlotKeyValidatedUseCase", "Lmx/openpay/library/domain/usecase/eglobal/IsMerchantSlotKeyValidatedUseCase;", "provideRefundChargeUseCase", "Lmx/openpay/library/domain/usecase/eglobal/RefundChargeUseCase;", "provideReverseChargeUseCase", "Lmx/openpay/library/domain/usecase/eglobal/ReverseChargeUseCase;", "provideTerminalLocalDataSource", "Lmx/openpay/library/data/datasource/local/EglobalLocalDataSourceImpl;", "provideUpdateFirmwareUseCase", "Lmx/openpay/library/domain/usecase/eglobal/UpdateFirmwareUseCase;", "provideUpdateKeyInjectedDateBySerialUseCase", "Lmx/openpay/library/domain/usecase/eglobal/UpdateKeyInjectedDateBySerialUseCase;", "provideUpdateMerchantSlotKeyInjectedBySlotUseCase", "Lmx/openpay/library/domain/usecase/eglobal/UpdateMerchantSlotKeyInjectedBySlotUseCase;", "provideUpdateRenewKeyBySlotAndTerminalUseCase", "Lmx/openpay/library/domain/usecase/eglobal/UpdateRenewKeyBySlotAndTerminalUseCase;", "provideUpdateTerminalCapacityDataUseCase", "Lmx/openpay/library/domain/usecase/eglobal/UpdateTerminalCapacityDataUseCase;", "di_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class EglobalModule {

        @NotNull
        public static final EglobalModule INSTANCE = new EglobalModule();

        /* JADX INFO: renamed from: eglobalRepository$delegate, reason: from kotlin metadata */
        @NotNull
        private static final Lazy eglobalRepository = LazyKt__LazyJVMKt.lazy(c.f83831p0);

        /* JADX INFO: renamed from: binDao$delegate, reason: from kotlin metadata */
        @NotNull
        private static final Lazy binDao = LazyKt__LazyJVMKt.lazy(a.f83829p0);

        /* JADX INFO: renamed from: transactionDao$delegate, reason: from kotlin metadata */
        @NotNull
        private static final Lazy transactionDao = LazyKt__LazyJVMKt.lazy(f.f83834p0);

        /* JADX INFO: renamed from: merchantDao$delegate, reason: from kotlin metadata */
        @NotNull
        private static final Lazy merchantDao = LazyKt__LazyJVMKt.lazy(d.f83832p0);

        /* JADX INFO: renamed from: merchantSlotDao$delegate, reason: from kotlin metadata */
        @NotNull
        private static final Lazy merchantSlotDao = LazyKt__LazyJVMKt.lazy(e.f83833p0);

        /* JADX INFO: renamed from: connectedDeviceDao$delegate, reason: from kotlin metadata */
        @NotNull
        private static final Lazy connectedDeviceDao = LazyKt__LazyJVMKt.lazy(b.f83830p0);

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        public static final class a extends Lambda implements Function0<BinDao> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f83829p0 = new a(0);

            @Override // kotlin.jvm.functions.Function0
            public final BinDao invoke() {
                return DependenciesProvider.INSTANCE.getDataBase().binDao();
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        public static final class b extends Lambda implements Function0<ConnectedDeviceDao> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final b f83830p0 = new b(0);

            @Override // kotlin.jvm.functions.Function0
            public final ConnectedDeviceDao invoke() {
                return DependenciesProvider.INSTANCE.getDataBase().connectedDeviceDao();
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        public static final class c extends Lambda implements Function0<EglobalRepositoryImpl> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final c f83831p0 = new c(0);

            @Override // kotlin.jvm.functions.Function0
            public final EglobalRepositoryImpl invoke() {
                return EglobalModule.INSTANCE.provideEglobalRepository();
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        public static final class d extends Lambda implements Function0<MerchantDao> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final d f83832p0 = new d(0);

            @Override // kotlin.jvm.functions.Function0
            public final MerchantDao invoke() {
                return DependenciesProvider.INSTANCE.getDataBase().merchantDao();
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        public static final class e extends Lambda implements Function0<MerchantSlotDao> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final e f83833p0 = new e(0);

            @Override // kotlin.jvm.functions.Function0
            public final MerchantSlotDao invoke() {
                return DependenciesProvider.INSTANCE.getDataBase().merchantSlotDao();
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        public static final class f extends Lambda implements Function0<TransactionDao> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final f f83834p0 = new f(0);

            @Override // kotlin.jvm.functions.Function0
            public final TransactionDao invoke() {
                return DependenciesProvider.INSTANCE.getDataBase().transactionDao();
            }
        }

        private EglobalModule() {
        }

        private final BinDao getBinDao() {
            return (BinDao) binDao.getValue();
        }

        private final ConnectedDeviceDao getConnectedDeviceDao() {
            return (ConnectedDeviceDao) connectedDeviceDao.getValue();
        }

        private final EglobalRepository getEglobalRepository() {
            return (EglobalRepository) eglobalRepository.getValue();
        }

        private final MerchantDao getMerchantDao() {
            return (MerchantDao) merchantDao.getValue();
        }

        private final MerchantSlotDao getMerchantSlotDao() {
            return (MerchantSlotDao) merchantSlotDao.getValue();
        }

        private final CheckTerminalCapacityDataUseCase provideCheckTerminalCapacityDataUseCase() {
            return new CheckTerminalCapacityDataUseCaseImpl(getEglobalRepository(), TransactionModule.INSTANCE.getTransactionsRepository());
        }

        private final EglobalRemoteDataSourceImpl provideEglobalRemoteDataSource() {
            DependenciesProvider dependenciesProvider = DependenciesProvider.INSTANCE;
            return new EglobalRemoteDataSourceImpl(dependenciesProvider.getOpenPayApi(), dependenciesProvider.getErrorHandler(), dependenciesProvider.provideCurrentIntegratorTags());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final EglobalRepositoryImpl provideEglobalRepository() {
            return new EglobalRepositoryImpl(provideEglobalRemoteDataSource(), provideTerminalLocalDataSource());
        }

        private final GetFirmwareUseCase provideGetFirmwareUseCase() {
            return new GetFirmwareUseCaseImpl(getEglobalRepository());
        }

        private final EglobalLocalDataSourceImpl provideTerminalLocalDataSource() {
            return new EglobalLocalDataSourceImpl(getBinDao(), getMerchantDao(), getMerchantSlotDao(), getConnectedDeviceDao());
        }

        @NotNull
        public final TransactionDao getTransactionDao() {
            return (TransactionDao) transactionDao.getValue();
        }

        @NotNull
        public final CanPayWithBbvaPointsUseCase provideCanPayWithBbvaPointsUseCase() {
            return new CanPayWithBbvaPointsUseCaseImpl(getEglobalRepository());
        }

        @NotNull
        public final CreateChargeUseCase provideCreateChargeUseCase() {
            return new CreateChargeUseCaseImpl(getEglobalRepository());
        }

        @NotNull
        public final DeleteAllBinesUseCase provideDeleteAllBinesUseCase() {
            return new DeleteAllBinesUseCaseImpl(getEglobalRepository());
        }

        @NotNull
        public final ExecuteChargeUseCase provideExecuteChargeUseCase() {
            return new ExecuteChargeUseCaseImpl(TransactionModule.INSTANCE.getTransactionsRepository(), provideCheckTerminalCapacityDataUseCase());
        }

        @NotNull
        public final FirmwareUpdateStatusUseCase provideFirmwareUpdateStatus() {
            return new FirmwareUpdateStatusUseCaseImpl(getEglobalRepository());
        }

        @NotNull
        public final GetBinesCountUseCase provideGetBinesCountUseCase() {
            return new GetBinesCountUseCaseImpl(getEglobalRepository());
        }

        @NotNull
        public final GetBinesUseCase provideGetBinesUseCase() {
            return new GetBinesUseCaseImpl(getEglobalRepository());
        }

        @NotNull
        public final GetKeyInjectedDateBySerialUseCase provideGetKeyInjectedDateBySerialUseCase() {
            return new GetKeyInjectedDateBySerialUseCaseImpl(getEglobalRepository());
        }

        @NotNull
        public final GetMerchantKeyNameBySlotUseCase provideGetMerchantKeyNameBySlotUseCase() {
            return new GetMerchantKeyNameBySlotUseCaseImpl(getEglobalRepository());
        }

        @NotNull
        public final GetMerchantUseCase provideGetMerchantUseCase() {
            return new GetMerchantUseCaseImpl(getEglobalRepository());
        }

        @NotNull
        public final GetPaymentPlansUseCase provideGetPaymentPlansUseCaseImpl() {
            return new GetPaymentPlansUseCaseImpl(getEglobalRepository());
        }

        @NotNull
        public final GetPaymentPlansWithoutBinUseCase provideGetPaymentPlansWithoutBinUseCase() {
            return new GetPaymentPlansWithoutBinUseCaseImpl(getEglobalRepository());
        }

        @NotNull
        public final GetRSAKeysUseCase provideGetRSAKeysUseCase() {
            return new GetRSAKeysUseCaseImpl(getEglobalRepository());
        }

        @NotNull
        public final GetRenewKeyBySlotAndTerminalUseCase provideGetRenewKeyBySlotAndTerminalUseCase() {
            return new GetRenewKeyBySlotAndTerminalUseCaseImpl(getEglobalRepository());
        }

        @NotNull
        public final InitializeKeysUseCase provideInitializeKeysUseCase() {
            return new InitializeKeysUseCaseImpl(getEglobalRepository());
        }

        @NotNull
        public final InsertBinesUseCase provideInsertBinesUseCase() {
            return new InsertBinesUseCaseImpl(getEglobalRepository());
        }

        @NotNull
        public final InsertConnectedDeviceInfoUseCase provideInsertConnectedDeviceInfoUseCase() {
            return new InsertConnectedDeviceInfoUseCaseImpl(getEglobalRepository());
        }

        @NotNull
        public final InsertMerchantDetailsUseCase provideInsertMerchantDetailsUseCase() {
            return new InsertMerchantDetailsUseCaseImpl(getEglobalRepository());
        }

        @NotNull
        public final IsMerchantSlotKeyValidatedUseCase provideIsMerchantSlotKeyValidatedUseCase() {
            return new IsMerchantSlotKeyValidatedUseCaseImpl(getEglobalRepository());
        }

        @NotNull
        public final RefundChargeUseCase provideRefundChargeUseCase() {
            return new RefundChargeUseCaseImpl(getEglobalRepository());
        }

        @NotNull
        public final ReverseChargeUseCase provideReverseChargeUseCase() {
            return new ReverseChargeUseCaseImpl(getEglobalRepository());
        }

        @NotNull
        public final UpdateFirmwareUseCase provideUpdateFirmwareUseCase() {
            return new UpdateFirmwareUseCaseImpl(provideGetFirmwareUseCase());
        }

        @NotNull
        public final UpdateKeyInjectedDateBySerialUseCase provideUpdateKeyInjectedDateBySerialUseCase() {
            return new UpdateKeyInjectedDateBySerialUseCaseImpl(getEglobalRepository());
        }

        @NotNull
        public final UpdateMerchantSlotKeyInjectedBySlotUseCase provideUpdateMerchantSlotKeyInjectedBySlotUseCase() {
            return new UpdateMerchantSlotKeyInjectedBySlotUseCaseImpl(getEglobalRepository());
        }

        @NotNull
        public final UpdateRenewKeyBySlotAndTerminalUseCase provideUpdateRenewKeyBySlotAndTerminalUseCase() {
            return new UpdateRenewKeyBySlotAndTerminalUseCaseImpl(getEglobalRepository());
        }

        @NotNull
        public final UpdateTerminalCapacityDataUseCase provideUpdateTerminalCapacityDataUseCase() {
            return new UpdateTerminalCapacityDataUseCaseImpl(TransactionModule.INSTANCE.getTransactionsRepository());
        }
    }

    /* JADX INFO: compiled from: DependenciesProvider.kt */
    @Keep
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0018R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0019"}, d2 = {"Lmx/openpay/library/di/DependenciesProvider$PaymentLinkModule;", "", "()V", "paymentLinkRepository", "Lmx/openpay/library/domain/repository/PaymentLinkRepository;", "getPaymentLinkRepository", "()Lmx/openpay/library/domain/repository/PaymentLinkRepository;", "paymentLinkRepository$delegate", "Lkotlin/Lazy;", "provideCheckPaymentLinkUseCase", "Lmx/openpay/library/domain/usecase/paymentlink/CheckPaymentLinkUseCaseImpl;", "provideCreatePaymentLinkUseCase", "Lmx/openpay/library/domain/usecase/paymentlink/CreatePaymentLinkUseCaseImpl;", "provideGetAllPaymentLinksUseCase", "Lmx/openpay/library/domain/usecase/paymentlink/GetAllPaymentLinksUseCaseImpl;", "providePaymentLinkRemoteDataSource", "Lmx/openpay/library/data/datasource/remote/datasource/PaymentLinkRemoteDataSourceImpl;", "providePaymentLinkRepository", "Lmx/openpay/library/data/repository/PaymentLinkRepositoryImpl;", "provideRefundPaymentLinkUseCase", "Lmx/openpay/library/domain/usecase/paymentlink/RefundPaymentLinkUseCaseImpl;", "provideUpdatePaymentLinkStatusUseCase", "Lmx/openpay/library/domain/usecase/paymentlink/UpdatePaymentLinkStatusUseCaseImpl;", "provideUpdatePaymentLinkUseCase", "Lmx/openpay/library/domain/usecase/paymentlink/UpdatePaymentLinkUseCaseImpl;", "di_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PaymentLinkModule {

        @NotNull
        public static final PaymentLinkModule INSTANCE = new PaymentLinkModule();

        /* JADX INFO: renamed from: paymentLinkRepository$delegate, reason: from kotlin metadata */
        @NotNull
        private static final Lazy paymentLinkRepository = LazyKt__LazyJVMKt.lazy(a.f83835p0);

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        public static final class a extends Lambda implements Function0<PaymentLinkRepositoryImpl> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f83835p0 = new a(0);

            @Override // kotlin.jvm.functions.Function0
            public final PaymentLinkRepositoryImpl invoke() {
                return PaymentLinkModule.INSTANCE.providePaymentLinkRepository();
            }
        }

        private PaymentLinkModule() {
        }

        private final PaymentLinkRepository getPaymentLinkRepository() {
            return (PaymentLinkRepository) paymentLinkRepository.getValue();
        }

        private final PaymentLinkRemoteDataSourceImpl providePaymentLinkRemoteDataSource() {
            DependenciesProvider dependenciesProvider = DependenciesProvider.INSTANCE;
            return new PaymentLinkRemoteDataSourceImpl(dependenciesProvider.getOpenPayApi(), dependenciesProvider.getErrorHandler(), dependenciesProvider.provideCurrentIntegratorTags());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final PaymentLinkRepositoryImpl providePaymentLinkRepository() {
            return new PaymentLinkRepositoryImpl(providePaymentLinkRemoteDataSource());
        }

        @NotNull
        public final CheckPaymentLinkUseCaseImpl provideCheckPaymentLinkUseCase() {
            return new CheckPaymentLinkUseCaseImpl(getPaymentLinkRepository());
        }

        @NotNull
        public final CreatePaymentLinkUseCaseImpl provideCreatePaymentLinkUseCase() {
            return new CreatePaymentLinkUseCaseImpl(getPaymentLinkRepository());
        }

        @NotNull
        public final GetAllPaymentLinksUseCaseImpl provideGetAllPaymentLinksUseCase() {
            return new GetAllPaymentLinksUseCaseImpl(getPaymentLinkRepository());
        }

        @NotNull
        public final RefundPaymentLinkUseCaseImpl provideRefundPaymentLinkUseCase() {
            return new RefundPaymentLinkUseCaseImpl(getPaymentLinkRepository());
        }

        @NotNull
        public final UpdatePaymentLinkStatusUseCaseImpl provideUpdatePaymentLinkStatusUseCase() {
            return new UpdatePaymentLinkStatusUseCaseImpl(getPaymentLinkRepository());
        }

        @NotNull
        public final UpdatePaymentLinkUseCaseImpl provideUpdatePaymentLinkUseCase() {
            return new UpdatePaymentLinkUseCaseImpl(getPaymentLinkRepository());
        }
    }

    /* JADX INFO: compiled from: DependenciesProvider.kt */
    @Keep
    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\nH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\f¨\u0006+"}, d2 = {"Lmx/openpay/library/di/DependenciesProvider$TapOnPhoneModule;", "", "()V", "tapOnPhonePinPadController", "Lmx/openpay/library/domain/taponphone/TapOnPhonePinPadController;", "getTapOnPhonePinPadController", "()Lmx/openpay/library/domain/taponphone/TapOnPhonePinPadController;", "tapOnPhonePinPadController$delegate", "Lkotlin/Lazy;", "tapOnPhoneRepository", "Lmx/openpay/library/domain/repository/TapOnPhoneRepository;", "getTapOnPhoneRepository", "()Lmx/openpay/library/domain/repository/TapOnPhoneRepository;", "tapOnPhoneRepository$delegate", "provideCancelTapOnPhoneProcessUseCase", "Lmx/openpay/library/domain/usecase/taponphone/CancelTapOnPhoneProcessUseCase;", "provideCreatedTsdkManualInitializerUseCase", "Lmx/openpay/library/domain/usecase/taponphone/CreatedTsdkManualInitializerUseCase;", "provideExecuteTapOnPhoneChargePlansStepUseCase", "Lmx/openpay/library/domain/usecase/taponphone/ExecuteTapOnPhoneChargePlansStepUseCase;", "provideExecuteTapOnPhoneChargePointsStepUseCase", "Lmx/openpay/library/domain/usecase/taponphone/ExecuteTapOnPhoneChargePointsStepUseCase;", "provideExecuteTapOnPhoneChargeSignStepUseCase", "Lmx/openpay/library/domain/usecase/taponphone/ExecuteTapOnPhoneChargeSignStepUseCase;", "provideExecuteTapOnPhoneChargeUseCase", "Lmx/openpay/library/domain/usecase/taponphone/ExecuteTapOnPhoneChargeUseCase;", "provideExecuteTapOnPhoneRefundChargeUseCase", "Lmx/openpay/library/domain/usecase/taponphone/ExecuteTapOnPhoneRefundChargeUseCase;", "provideInitTapOnPhoneUseCase", "Lmx/openpay/library/domain/usecase/taponphone/InitTapOnPhoneUseCase;", "provideInitTsdkManualInitializerUseCase", "Lmx/openpay/library/domain/usecase/taponphone/InitTsdkManualInitializerUseCase;", "provideIsApplicationInitAllowedUseCase", "Lmx/openpay/library/domain/usecase/taponphone/IsApplicationInitAllowedUseCase;", "provideRegisterSmartphoneUseCase", "Lmx/openpay/library/domain/usecase/taponphone/RegisterSmartphoneUseCase;", "provideTapOnPhoneController", "Lmx/openpay/library/domain/taponphone/TapOnPhoneController;", "appContext", "Landroid/content/Context;", "provideTapOnPhoneDataSource", "Lmx/openpay/library/domain/datasource/TapOnPhoneDataSource;", "provideTapOnPhoneRepository", "di_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TapOnPhoneModule {

        @NotNull
        public static final TapOnPhoneModule INSTANCE = new TapOnPhoneModule();

        /* JADX INFO: renamed from: tapOnPhoneRepository$delegate, reason: from kotlin metadata */
        @NotNull
        private static final Lazy tapOnPhoneRepository = LazyKt__LazyJVMKt.lazy(b.f83837p0);

        /* JADX INFO: renamed from: tapOnPhonePinPadController$delegate, reason: from kotlin metadata */
        @NotNull
        private static final Lazy tapOnPhonePinPadController = LazyKt__LazyJVMKt.lazy(a.f83836p0);

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        public static final class a extends Lambda implements Function0<TapOnPhonePinPadControllerImpl> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f83836p0 = new a(0);

            @Override // kotlin.jvm.functions.Function0
            public final TapOnPhonePinPadControllerImpl invoke() {
                return new TapOnPhonePinPadControllerImpl();
            }
        }

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        public static final class b extends Lambda implements Function0<TapOnPhoneRepository> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final b f83837p0 = new b(0);

            @Override // kotlin.jvm.functions.Function0
            public final TapOnPhoneRepository invoke() {
                return TapOnPhoneModule.INSTANCE.provideTapOnPhoneRepository();
            }
        }

        private TapOnPhoneModule() {
        }

        private final TapOnPhoneRepository getTapOnPhoneRepository() {
            return (TapOnPhoneRepository) tapOnPhoneRepository.getValue();
        }

        private final TapOnPhoneDataSource provideTapOnPhoneDataSource() {
            DependenciesProvider dependenciesProvider = DependenciesProvider.INSTANCE;
            return new TapOnPhoneDataSourceImpl(dependenciesProvider.getOpenPayApi(), new ErrorHandlerImpl(dependenciesProvider.getEnvironment().getLogsEnabled() ? dependenciesProvider.getLogCatLogger() : null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TapOnPhoneRepository provideTapOnPhoneRepository() {
            return new TapOnPhoneRepositoryImpl(provideTapOnPhoneDataSource());
        }

        @NotNull
        public final TapOnPhonePinPadController getTapOnPhonePinPadController() {
            return (TapOnPhonePinPadController) tapOnPhonePinPadController.getValue();
        }

        @NotNull
        public final CancelTapOnPhoneProcessUseCase provideCancelTapOnPhoneProcessUseCase() {
            return new CancelTapOnPhoneProcessUseCaseImpl();
        }

        @NotNull
        public final CreatedTsdkManualInitializerUseCase provideCreatedTsdkManualInitializerUseCase() {
            return new CreatedTsdkManualInitializerUseCaseImpl();
        }

        @NotNull
        public final ExecuteTapOnPhoneChargePlansStepUseCase provideExecuteTapOnPhoneChargePlansStepUseCase() {
            return new ExecuteTapOnPhoneChargePlansStepUseCaseImpl();
        }

        @NotNull
        public final ExecuteTapOnPhoneChargePointsStepUseCase provideExecuteTapOnPhoneChargePointsStepUseCase() {
            return new ExecuteTapOnPhoneChargePointsStepUseCaseImpl();
        }

        @NotNull
        public final ExecuteTapOnPhoneChargeSignStepUseCase provideExecuteTapOnPhoneChargeSignStepUseCase() {
            return new ExecuteTapOnPhoneChargeSignStepUseCaseImpl();
        }

        @NotNull
        public final ExecuteTapOnPhoneChargeUseCase provideExecuteTapOnPhoneChargeUseCase() {
            return new ExecuteTapOnPhoneChargeUseCaseImpl(TransactionModule.INSTANCE.getTransactionsRepository());
        }

        @NotNull
        public final ExecuteTapOnPhoneRefundChargeUseCase provideExecuteTapOnPhoneRefundChargeUseCase() {
            return new ExecuteTapOnPhoneRefundChargeUseCaseImpl();
        }

        @NotNull
        public final InitTapOnPhoneUseCase provideInitTapOnPhoneUseCase() {
            return new InitTapOnPhoneUseCaseImpl();
        }

        @NotNull
        public final InitTsdkManualInitializerUseCase provideInitTsdkManualInitializerUseCase() {
            return new InitTsdkManualInitializerUseCaseImpl();
        }

        @NotNull
        public final IsApplicationInitAllowedUseCase provideIsApplicationInitAllowedUseCase() {
            return new IsApplicationInitAllowedUseCaseImpl(getTapOnPhonePinPadController());
        }

        @NotNull
        public final RegisterSmartphoneUseCase provideRegisterSmartphoneUseCase() {
            return new RegisterSmartphoneUseCaseImpl(getTapOnPhoneRepository());
        }

        @NotNull
        public final TapOnPhoneController provideTapOnPhoneController(@NotNull Context appContext) {
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            boolean zIsProdEnv = DependenciesProvider.INSTANCE.isProdEnv();
            Gson gson = new Gson();
            EglobalModule eglobalModule = EglobalModule.INSTANCE;
            GetMerchantUseCase getMerchantUseCaseProvideGetMerchantUseCase = eglobalModule.provideGetMerchantUseCase();
            InsertMerchantDetailsUseCase insertMerchantDetailsUseCaseProvideInsertMerchantDetailsUseCase = eglobalModule.provideInsertMerchantDetailsUseCase();
            GetBinesUseCase getBinesUseCaseProvideGetBinesUseCase = eglobalModule.provideGetBinesUseCase();
            DeleteAllBinesUseCase deleteAllBinesUseCaseProvideDeleteAllBinesUseCase = eglobalModule.provideDeleteAllBinesUseCase();
            InsertBinesUseCase insertBinesUseCaseProvideInsertBinesUseCase = eglobalModule.provideInsertBinesUseCase();
            GetBinesCountUseCase getBinesCountUseCaseProvideGetBinesCountUseCase = eglobalModule.provideGetBinesCountUseCase();
            GetRenewKeyBySlotAndTerminalUseCase getRenewKeyBySlotAndTerminalUseCaseProvideGetRenewKeyBySlotAndTerminalUseCase = eglobalModule.provideGetRenewKeyBySlotAndTerminalUseCase();
            InitializeKeysUseCase initializeKeysUseCaseProvideInitializeKeysUseCase = eglobalModule.provideInitializeKeysUseCase();
            UpdateRenewKeyBySlotAndTerminalUseCase updateRenewKeyBySlotAndTerminalUseCaseProvideUpdateRenewKeyBySlotAndTerminalUseCase = eglobalModule.provideUpdateRenewKeyBySlotAndTerminalUseCase();
            TransactionModule transactionModule = TransactionModule.INSTANCE;
            return new TapOnPhoneControllerImpl(appContext, zIsProdEnv, gson, getMerchantUseCaseProvideGetMerchantUseCase, insertMerchantDetailsUseCaseProvideInsertMerchantDetailsUseCase, getBinesUseCaseProvideGetBinesUseCase, deleteAllBinesUseCaseProvideDeleteAllBinesUseCase, insertBinesUseCaseProvideInsertBinesUseCase, getBinesCountUseCaseProvideGetBinesCountUseCase, getRenewKeyBySlotAndTerminalUseCaseProvideGetRenewKeyBySlotAndTerminalUseCase, initializeKeysUseCaseProvideInitializeKeysUseCase, updateRenewKeyBySlotAndTerminalUseCaseProvideUpdateRenewKeyBySlotAndTerminalUseCase, transactionModule.provideGetTransactionByIdUseCase(), transactionModule.provideUpdateTransactionUseCase(), transactionModule.provideInsertTransactionUseCase(), eglobalModule.provideReverseChargeUseCase(), eglobalModule.provideCanPayWithBbvaPointsUseCase(), eglobalModule.provideGetKeyInjectedDateBySerialUseCase(), eglobalModule.provideUpdateKeyInjectedDateBySerialUseCase(), eglobalModule.provideCreateChargeUseCase(), provideRegisterSmartphoneUseCase(), eglobalModule.provideRefundChargeUseCase(), eglobalModule.provideGetPaymentPlansUseCaseImpl());
        }
    }

    /* JADX INFO: compiled from: DependenciesProvider.kt */
    @Keep
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u0017\u001a\u00020\u0018R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0019"}, d2 = {"Lmx/openpay/library/di/DependenciesProvider$TransactionModule;", "", "()V", "transactionsRepository", "Lmx/openpay/library/domain/repository/TransactionRepository;", "getTransactionsRepository", "()Lmx/openpay/library/domain/repository/TransactionRepository;", "transactionsRepository$delegate", "Lkotlin/Lazy;", "provideGetTransactionByIdUseCase", "Lmx/openpay/library/domain/usecase/transaction/GetTransactionByIdUseCase;", "provideGetTransactionsUseCase", "Lmx/openpay/library/domain/usecase/transaction/GetAllTransactionsUseCase;", "provideInsertTransactionUseCase", "Lmx/openpay/library/domain/usecase/transaction/InsertTransactionUseCase;", "provideLocalTransactionsDataSource", "Lmx/openpay/library/data/datasource/local/TransactionsLocalDataSourceImpl;", "provideRemoteTransactionsDataSource", "Lmx/openpay/library/data/datasource/remote/datasource/TransactionsRemoteDataSourceImpl;", "provideSendVoucherUseCase", "Lmx/openpay/library/domain/usecase/transaction/SendVoucherUseCase;", "provideTransactionsRepository", "Lmx/openpay/library/data/repository/TransactionRepositoryImpl;", "provideUpdateTransactionUseCase", "Lmx/openpay/library/domain/usecase/transaction/UpdateTransactionUseCase;", "di_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TransactionModule {

        @NotNull
        public static final TransactionModule INSTANCE = new TransactionModule();

        /* JADX INFO: renamed from: transactionsRepository$delegate, reason: from kotlin metadata */
        @NotNull
        private static final Lazy transactionsRepository = LazyKt__LazyJVMKt.lazy(a.f83838p0);

        /* JADX INFO: compiled from: DependenciesProvider.kt */
        public static final class a extends Lambda implements Function0<TransactionRepositoryImpl> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f83838p0 = new a(0);

            @Override // kotlin.jvm.functions.Function0
            public final TransactionRepositoryImpl invoke() {
                return TransactionModule.INSTANCE.provideTransactionsRepository();
            }
        }

        private TransactionModule() {
        }

        private final TransactionsLocalDataSourceImpl provideLocalTransactionsDataSource() {
            return new TransactionsLocalDataSourceImpl(EglobalModule.INSTANCE.getTransactionDao());
        }

        private final TransactionsRemoteDataSourceImpl provideRemoteTransactionsDataSource() {
            DependenciesProvider dependenciesProvider = DependenciesProvider.INSTANCE;
            return new TransactionsRemoteDataSourceImpl(dependenciesProvider.getOpenPayApi(), new ErrorHandlerImpl(dependenciesProvider.getEnvironment().getLogsEnabled() ? dependenciesProvider.getLogCatLogger() : null), dependenciesProvider.provideCurrentIntegratorTags());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TransactionRepositoryImpl provideTransactionsRepository() {
            return new TransactionRepositoryImpl(provideRemoteTransactionsDataSource(), provideLocalTransactionsDataSource());
        }

        @NotNull
        public final TransactionRepository getTransactionsRepository() {
            return (TransactionRepository) transactionsRepository.getValue();
        }

        @NotNull
        public final GetTransactionByIdUseCase provideGetTransactionByIdUseCase() {
            return new GetTransactionByIdUseCase(getTransactionsRepository());
        }

        @NotNull
        public final GetAllTransactionsUseCase provideGetTransactionsUseCase() {
            return new GetAllTransactionsUseCase(getTransactionsRepository());
        }

        @NotNull
        public final InsertTransactionUseCase provideInsertTransactionUseCase() {
            return new InsertTransactionUseCaseImpl(getTransactionsRepository());
        }

        @NotNull
        public final SendVoucherUseCase provideSendVoucherUseCase() {
            return new SendVoucherUseCaseImpl(getTransactionsRepository());
        }

        @NotNull
        public final UpdateTransactionUseCase provideUpdateTransactionUseCase() {
            return new UpdateTransactionUseCaseImpl(getTransactionsRepository());
        }
    }

    /* JADX INFO: compiled from: DependenciesProvider.kt */
    public static final class a extends Lambda implements Function0<OpenPaySDKDataBase> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f83839p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final OpenPaySDKDataBase invoke() {
            Context context = DependenciesProvider.openPayContext;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("openPayContext");
                context = null;
            }
            return (OpenPaySDKDataBase) Room.databaseBuilder(context, OpenPaySDKDataBase.class, DependenciesProvider.SDK_DATABASE_NAME).build();
        }
    }

    /* JADX INFO: compiled from: DependenciesProvider.kt */
    public static final class b extends Lambda implements Function0<Environment> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f83840p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Environment invoke() {
            return DependenciesProvider.INSTANCE.provideCurrentEnvironment();
        }
    }

    /* JADX INFO: compiled from: DependenciesProvider.kt */
    public static final class c extends Lambda implements Function0<ErrorHandlerImpl> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f83841p0 = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final ErrorHandlerImpl invoke() {
            DependenciesProvider dependenciesProvider = DependenciesProvider.INSTANCE;
            return new ErrorHandlerImpl(dependenciesProvider.getEnvironment().getLogsEnabled() ? dependenciesProvider.getLogCatLogger() : null);
        }
    }

    /* JADX INFO: compiled from: DependenciesProvider.kt */
    public static final class d extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f83842p0 = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(Intrinsics.areEqual(DependenciesProvider.INSTANCE.getEnvironment().getName(), EnvironmentConstants.DEVELOPMENT_CERTIFICATION_ENV));
        }
    }

    /* JADX INFO: compiled from: DependenciesProvider.kt */
    public static final class e extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f83843p0 = new e(0);

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(Intrinsics.areEqual(DependenciesProvider.INSTANCE.getEnvironment().getName(), EnvironmentConstants.PRODUCTION_ENV));
        }
    }

    /* JADX INFO: compiled from: DependenciesProvider.kt */
    public static final class f extends Lambda implements Function0<AndroidErrorLogger> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f83844p0 = new f(0);

        @Override // kotlin.jvm.functions.Function0
        public final AndroidErrorLogger invoke() {
            return new AndroidErrorLogger();
        }
    }

    /* JADX INFO: compiled from: DependenciesProvider.kt */
    public static final class g extends Lambda implements Function0<OpenPayAPI> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f83845p0 = new g(0);

        @Override // kotlin.jvm.functions.Function0
        public final OpenPayAPI invoke() {
            DependenciesProvider dependenciesProvider = DependenciesProvider.INSTANCE;
            return dependenciesProvider.provideOpenAPI(dependenciesProvider.getEnvironment());
        }
    }

    /* JADX INFO: compiled from: DependenciesProvider.kt */
    public static final class h extends Lambda implements Function0<AuthTokenRepositoryImpl> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f83846p0 = new h(0);

        @Override // kotlin.jvm.functions.Function0
        public final AuthTokenRepositoryImpl invoke() {
            return new AuthTokenRepositoryImpl(DependenciesProvider.INSTANCE.provideLocalTokenDataSource());
        }
    }

    private DependenciesProvider() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Environment getEnvironment() {
        return (Environment) environment.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ErrorLogger getLogCatLogger() {
        return (ErrorLogger) logCatLogger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OpenPayAPI getOpenPayApi() {
        return (OpenPayAPI) openPayApi.getValue();
    }

    private final boolean isDevCertEnv() {
        return ((Boolean) isDevCertEnv.getValue()).booleanValue();
    }

    private final AuthHeaderInterceptor provideAuthHeaderInterceptor() {
        return new AuthHeaderInterceptor(getTokenRepository());
    }

    private final CountryHeaderInterceptor provideCountryHeaderInterceptor() {
        return new CountryHeaderInterceptor(provideCountryCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Environment provideCurrentEnvironment() {
        Configuration configuration = openPayConfiguration;
        if (configuration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("openPayConfiguration");
            configuration = null;
        }
        return configuration.getEnvironment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IntegratorTags provideCurrentIntegratorTags() {
        Configuration configuration = openPayConfiguration;
        if (configuration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("openPayConfiguration");
            configuration = null;
        }
        return configuration.getTags();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InMemoryTokenDataSourceImpl provideLocalTokenDataSource() {
        return new InMemoryTokenDataSourceImpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final OkHttpClient provideOkHttpClient(Environment environment2, boolean includeCountryInterceptor) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        long connectTimeoutSeconds = environment2.getConnectTimeoutSeconds();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderWriteTimeout = builder.connectTimeout(connectTimeoutSeconds, timeUnit).readTimeout(environment2.getConnectTimeoutSeconds(), timeUnit).writeTimeout(environment2.getConnectTimeoutSeconds(), timeUnit);
        builderWriteTimeout.addInterceptor(provideUserAgentInterceptor());
        if (environment2.getLogsEnabled()) {
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, 0 == true ? 1 : 0);
            httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
            builderWriteTimeout.addInterceptor(httpLoggingInterceptor);
        }
        builderWriteTimeout.addInterceptor(provideAuthHeaderInterceptor());
        if (includeCountryInterceptor) {
            builderWriteTimeout.addInterceptor(provideCountryHeaderInterceptor());
        }
        return builderWriteTimeout.build();
    }

    public static /* synthetic */ OkHttpClient provideOkHttpClient$default(DependenciesProvider dependenciesProvider, Environment environment2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return dependenciesProvider.provideOkHttpClient(environment2, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OpenPayAPI provideOpenAPI(Environment environment2) {
        Object objCreate = new Retrofit.Builder().baseUrl(environment2.getApiBaseUrl()).addConverterFactory(GsonConverterFactory.create()).client(provideOkHttpClient$default(this, environment2, false, 2, null)).build().create(OpenPayAPI.class);
        Intrinsics.checkNotNullExpressionValue(objCreate, "Builder()\n            .b…e(OpenPayAPI::class.java)");
        return (OpenPayAPI) objCreate;
    }

    private final String provideUserAgent() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.US, "%s/%s (%s; %s; %s; %s; %s)", Arrays.copyOf(new Object[]{"OpenPaySdk", "1.0.0", Build.VERSION.RELEASE, Build.MODEL, Build.BRAND, Build.DEVICE, Locale.getDefault().getLanguage()}, 7));
        Intrinsics.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        return str;
    }

    private final UserAgentHeaderInterceptor provideUserAgentInterceptor() {
        return new UserAgentHeaderInterceptor(provideUserAgent());
    }

    @NotNull
    public final OpenPaySDKDataBase getDataBase() {
        return (OpenPaySDKDataBase) dataBase.getValue();
    }

    @NotNull
    public final ErrorHandler getErrorHandler() {
        return (ErrorHandler) errorHandler.getValue();
    }

    @NotNull
    public final AuthTokenRepository getTokenRepository() {
        return (AuthTokenRepository) tokenRepository.getValue();
    }

    public final void init(@NotNull Context context, @NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        openPayContext = context;
        openPayConfiguration = configuration;
    }

    public final boolean isProdEnv() {
        return ((Boolean) isProdEnv.getValue()).booleanValue();
    }

    @NotNull
    public final BluetoothController provideBluetoothController(@NotNull Context appContext, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        boolean zIsProdEnv = isProdEnv();
        boolean zIsDevCertEnv = isDevCertEnv();
        Gson gson = new Gson();
        EglobalModule eglobalModule = EglobalModule.INSTANCE;
        GetMerchantUseCase getMerchantUseCaseProvideGetMerchantUseCase = eglobalModule.provideGetMerchantUseCase();
        InsertMerchantDetailsUseCase insertMerchantDetailsUseCaseProvideInsertMerchantDetailsUseCase = eglobalModule.provideInsertMerchantDetailsUseCase();
        UpdateFirmwareUseCase updateFirmwareUseCaseProvideUpdateFirmwareUseCase = eglobalModule.provideUpdateFirmwareUseCase();
        GetBinesUseCase getBinesUseCaseProvideGetBinesUseCase = eglobalModule.provideGetBinesUseCase();
        DeleteAllBinesUseCase deleteAllBinesUseCaseProvideDeleteAllBinesUseCase = eglobalModule.provideDeleteAllBinesUseCase();
        InsertBinesUseCase insertBinesUseCaseProvideInsertBinesUseCase = eglobalModule.provideInsertBinesUseCase();
        GetBinesCountUseCase getBinesCountUseCaseProvideGetBinesCountUseCase = eglobalModule.provideGetBinesCountUseCase();
        GetRenewKeyBySlotAndTerminalUseCase getRenewKeyBySlotAndTerminalUseCaseProvideGetRenewKeyBySlotAndTerminalUseCase = eglobalModule.provideGetRenewKeyBySlotAndTerminalUseCase();
        InitializeKeysUseCase initializeKeysUseCaseProvideInitializeKeysUseCase = eglobalModule.provideInitializeKeysUseCase();
        UpdateRenewKeyBySlotAndTerminalUseCase updateRenewKeyBySlotAndTerminalUseCaseProvideUpdateRenewKeyBySlotAndTerminalUseCase = eglobalModule.provideUpdateRenewKeyBySlotAndTerminalUseCase();
        CreateChargeUseCase createChargeUseCaseProvideCreateChargeUseCase = eglobalModule.provideCreateChargeUseCase();
        TransactionModule transactionModule = TransactionModule.INSTANCE;
        return new EglobalBluetoothController(appContext, coroutineScope, zIsProdEnv, zIsDevCertEnv, gson, getMerchantUseCaseProvideGetMerchantUseCase, insertMerchantDetailsUseCaseProvideInsertMerchantDetailsUseCase, updateFirmwareUseCaseProvideUpdateFirmwareUseCase, getBinesUseCaseProvideGetBinesUseCase, deleteAllBinesUseCaseProvideDeleteAllBinesUseCase, insertBinesUseCaseProvideInsertBinesUseCase, getBinesCountUseCaseProvideGetBinesCountUseCase, getRenewKeyBySlotAndTerminalUseCaseProvideGetRenewKeyBySlotAndTerminalUseCase, initializeKeysUseCaseProvideInitializeKeysUseCase, updateRenewKeyBySlotAndTerminalUseCaseProvideUpdateRenewKeyBySlotAndTerminalUseCase, createChargeUseCaseProvideCreateChargeUseCase, transactionModule.provideGetTransactionByIdUseCase(), transactionModule.provideUpdateTransactionUseCase(), transactionModule.provideInsertTransactionUseCase(), eglobalModule.provideUpdateTerminalCapacityDataUseCase(), eglobalModule.provideReverseChargeUseCase(), eglobalModule.provideCanPayWithBbvaPointsUseCase(), eglobalModule.provideGetMerchantKeyNameBySlotUseCase(), eglobalModule.provideIsMerchantSlotKeyValidatedUseCase(), eglobalModule.provideGetRSAKeysUseCase(), eglobalModule.provideUpdateMerchantSlotKeyInjectedBySlotUseCase(), eglobalModule.provideInsertConnectedDeviceInfoUseCase(), eglobalModule.provideUpdateKeyInjectedDateBySerialUseCase(), eglobalModule.provideGetKeyInjectedDateBySerialUseCase(), eglobalModule.provideRefundChargeUseCase(), eglobalModule.provideGetPaymentPlansUseCaseImpl(), eglobalModule.provideFirmwareUpdateStatus());
    }

    @NotNull
    public final String provideCountryCode() {
        Configuration configuration = openPayConfiguration;
        if (configuration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("openPayConfiguration");
            configuration = null;
        }
        return configuration.getCountry().getCode();
    }

    @NotNull
    public final String provideCurrencyIsoCode() {
        Configuration configuration = openPayConfiguration;
        if (configuration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("openPayConfiguration");
            configuration = null;
        }
        return configuration.getCountry().getCurrency().getIsoCode();
    }

    @NotNull
    public final Country provideCurrentCountry() {
        Configuration configuration = openPayConfiguration;
        if (configuration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("openPayConfiguration");
            configuration = null;
        }
        return configuration.getCountry();
    }
}
