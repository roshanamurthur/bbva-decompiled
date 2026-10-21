package mx.openpay.library.data.bluetooth.eglobal;

import ak.b;
import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RequiresPermission;
import androidx.camera.camera2.internal.h0;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.notifications.constants.PushConstants;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.vierge.bluetoothlibrary.MyBluetoothService;
import com.vierge.bluetoothlibrary.MyHandler;
import com.vierge.pinpadsdk.PinPadSdk;
import com.vierge.pinpadsdk.utils.Categories;
import ek.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import mx.openpay.library.data.R;
import mx.openpay.library.data.bluetooth.BluetoothStateReceiver;
import mx.openpay.library.data.bluetooth.FoundDeviceReceiver;
import mx.openpay.library.data.bluetooth.eglobal.mapper.ConnectedDeviceQ8MapperKt;
import mx.openpay.library.data.bluetooth.eglobal.model.C51Response;
import mx.openpay.library.data.bluetooth.eglobal.model.C54Response;
import mx.openpay.library.data.bluetooth.eglobal.model.InjectScriptsResponse;
import mx.openpay.library.data.bluetooth.eglobal.model.Q8Response;
import mx.openpay.library.data.bluetooth.eglobal.model.Z10Response;
import mx.openpay.library.data.bluetooth.eglobal.model.Z11Response;
import mx.openpay.library.data.bluetooth.eglobal.model.Z12Response;
import mx.openpay.library.data.bluetooth.eglobal.model.Z13Response;
import mx.openpay.library.data.datasource.remote.model.response.TransactionErrorResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.EmvTerminalDataResponseDto;
import mx.openpay.library.data.datasource.remote.model.response.eglobal.GatewayResponseDto;
import mx.openpay.library.data.mapper.eglobal.EmvTerminalDataMapperKt;
import mx.openpay.library.data.util.ChargeUtils;
import mx.openpay.library.data.util.EglobalUtils;
import mx.openpay.library.data.util.RefundUtils;
import mx.openpay.library.domain.bluetooth.BluetoothController;
import mx.openpay.library.domain.bluetooth.Device;
import mx.openpay.library.domain.bluetooth.model.eglobal.ConnectedDeviceQ8;
import mx.openpay.library.domain.model.CreateCharge;
import mx.openpay.library.domain.model.Error;
import mx.openpay.library.domain.model.ProcessingStep;
import mx.openpay.library.domain.model.common.ChargeCallback;
import mx.openpay.library.domain.model.common.ChargeCallbackStates;
import mx.openpay.library.domain.model.common.ChargeRequest;
import mx.openpay.library.domain.model.eglobal.Bin;
import mx.openpay.library.domain.model.eglobal.Charge;
import mx.openpay.library.domain.model.eglobal.EglobalChargeRequest;
import mx.openpay.library.domain.model.eglobal.EmvTags;
import mx.openpay.library.domain.model.eglobal.EmvTerminalData;
import mx.openpay.library.domain.model.eglobal.FirmwareUpdateStatusRequest;
import mx.openpay.library.domain.model.eglobal.GetMerchant;
import mx.openpay.library.domain.model.eglobal.Merchant;
import mx.openpay.library.domain.model.eglobal.PaymentPlan;
import mx.openpay.library.domain.model.eglobal.PaymentType;
import mx.openpay.library.domain.model.eglobal.RSAKey;
import mx.openpay.library.domain.model.eglobal.RefundRequest;
import mx.openpay.library.domain.model.eglobal.ReverseRequest;
import mx.openpay.library.domain.model.eglobal.TerminalKeysRequest;
import mx.openpay.library.domain.model.eglobal.TerminalKeysResponse;
import mx.openpay.library.domain.model.transaction.Transaction;
import mx.openpay.library.domain.usecase.GetPaymentPlansUseCase;
import mx.openpay.library.domain.usecase.eglobal.CanPayWithBbvaPointsUseCase;
import mx.openpay.library.domain.usecase.eglobal.CreateChargeUseCase;
import mx.openpay.library.domain.usecase.eglobal.DeleteAllBinesUseCase;
import mx.openpay.library.domain.usecase.eglobal.FirmwareUpdateStatusUseCase;
import mx.openpay.library.domain.usecase.eglobal.GetBinesCountUseCase;
import mx.openpay.library.domain.usecase.eglobal.GetBinesUseCase;
import mx.openpay.library.domain.usecase.eglobal.GetKeyInjectedDateBySerialUseCase;
import mx.openpay.library.domain.usecase.eglobal.GetMerchantKeyNameBySlotUseCase;
import mx.openpay.library.domain.usecase.eglobal.GetMerchantUseCase;
import mx.openpay.library.domain.usecase.eglobal.GetRSAKeysUseCase;
import mx.openpay.library.domain.usecase.eglobal.GetRenewKeyBySlotAndTerminalUseCase;
import mx.openpay.library.domain.usecase.eglobal.InitializeKeysUseCase;
import mx.openpay.library.domain.usecase.eglobal.InsertBinesUseCase;
import mx.openpay.library.domain.usecase.eglobal.InsertConnectedDeviceInfoUseCase;
import mx.openpay.library.domain.usecase.eglobal.InsertMerchantDetailsUseCase;
import mx.openpay.library.domain.usecase.eglobal.IsMerchantSlotKeyValidatedUseCase;
import mx.openpay.library.domain.usecase.eglobal.RefundChargeUseCase;
import mx.openpay.library.domain.usecase.eglobal.ReverseChargeUseCase;
import mx.openpay.library.domain.usecase.eglobal.UpdateFirmwareUseCase;
import mx.openpay.library.domain.usecase.eglobal.UpdateKeyInjectedDateBySerialUseCase;
import mx.openpay.library.domain.usecase.eglobal.UpdateMerchantSlotKeyInjectedBySlotUseCase;
import mx.openpay.library.domain.usecase.eglobal.UpdateRenewKeyBySlotAndTerminalUseCase;
import mx.openpay.library.domain.usecase.eglobal.UpdateTerminalCapacityDataUseCase;
import mx.openpay.library.domain.usecase.transaction.GetTransactionByIdUseCase;
import mx.openpay.library.domain.usecase.transaction.InsertTransactionUseCase;
import mx.openpay.library.domain.usecase.transaction.UpdateTransactionUseCase;
import mx.openpay.library.domain.util.CalendarUtils;
import mx.openpay.library.domain.util.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EglobalBluetoothController.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0084\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0085\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010'\u001a\u00020(\u0012\u0006\u0010)\u001a\u00020*\u0012\u0006\u0010+\u001a\u00020,\u0012\u0006\u0010-\u001a\u00020.\u0012\u0006\u0010/\u001a\u000200\u0012\u0006\u00101\u001a\u000202\u0012\u0006\u00103\u001a\u000204\u0012\u0006\u00105\u001a\u000206\u0012\u0006\u00107\u001a\u000208\u0012\u0006\u00109\u001a\u00020:\u0012\u0006\u0010;\u001a\u00020<\u0012\u0006\u0010=\u001a\u00020>\u0012\u0006\u0010?\u001a\u00020@¢\u0006\u0002\u0010AJ)\u0010r\u001a\b\u0012\u0004\u0012\u00020t0s2\u0006\u0010u\u001a\u00020v2\b\u0010w\u001a\u0004\u0018\u00010xH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010yJ,\u0010z\u001a\u00020{2\u0006\u0010|\u001a\u00020q2\u0006\u0010}\u001a\u00020\u00072\b\b\u0002\u0010~\u001a\u00020\u007fH\u0082@ø\u0001\u0000¢\u0006\u0003\u0010\u0080\u0001J5\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020t0s2\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u0007\u0010\u0084\u0001\u001a\u00020C2\u0007\u0010\u0085\u0001\u001a\u00020qH\u0082@ø\u0001\u0000¢\u0006\u0003\u0010\u0086\u0001J0\u0010\u0087\u0001\u001a\u00020{2\u0007\u0010\u0088\u0001\u001a\u00020\u00072\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010q2\u0007\u0010\u008a\u0001\u001a\u00020qH\u0082@ø\u0001\u0000¢\u0006\u0003\u0010\u008b\u0001J\t\u0010\u008c\u0001\u001a\u00020{H\u0016J=\u0010\u008d\u0001\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010s2\u0007\u0010\u008f\u0001\u001a\u00020q2\u0007\u0010\u0084\u0001\u001a\u00020C2\u0007\u0010\u0090\u0001\u001a\u00020\u00072\u0006\u0010|\u001a\u00020qH\u0082@ø\u0001\u0000¢\u0006\u0003\u0010\u0091\u0001J>\u0010\u0092\u0001\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010s2\u0007\u0010\u0094\u0001\u001a\u00020q2\u0007\u0010\u0095\u0001\u001a\u00020q2\u0007\u0010\u0096\u0001\u001a\u00020q2\u0007\u0010\u0097\u0001\u001a\u00020qH\u0082@ø\u0001\u0000¢\u0006\u0003\u0010\u0098\u0001J\"\u0010\u0099\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070s2\u0007\u0010\u009a\u0001\u001a\u00020qH\u0082@ø\u0001\u0000¢\u0006\u0003\u0010\u009b\u0001JD\u0010\u009c\u0001\u001a\b\u0012\u0004\u0012\u00020t0s2\u000e\u0010\u009d\u0001\u001a\t\u0012\u0005\u0012\u00030\u009e\u00010G2\u0006\u0010u\u001a\u00020v2\b\u0010w\u001a\u0004\u0018\u00010x2\u0007\u0010\u0090\u0001\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010\u009f\u0001J#\u0010 \u0001\u001a\b\u0012\u0004\u0012\u00020\u00070s2\b\u0010¡\u0001\u001a\u00030¢\u0001H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010£\u0001J-\u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020t0s2\b\u0010¤\u0001\u001a\u00030¥\u00012\b\u0010w\u001a\u0004\u0018\u00010xH\u0096@ø\u0001\u0000¢\u0006\u0003\u0010¦\u0001J6\u0010§\u0001\u001a\b\u0012\u0004\u0012\u00020t0s2\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\b\u0010w\u001a\u0004\u0018\u00010x2\u0007\u0010¨\u0001\u001a\u00020\u007fH\u0096@ø\u0001\u0000¢\u0006\u0003\u0010©\u0001J6\u0010ª\u0001\u001a\b\u0012\u0004\u0012\u00020t0s2\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\b\u0010w\u001a\u0004\u0018\u00010x2\u0007\u0010«\u0001\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010¬\u0001J,\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u00020t0s2\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u0007\u0010®\u0001\u001a\u00020qH\u0096@ø\u0001\u0000¢\u0006\u0003\u0010¯\u0001J#\u0010°\u0001\u001a\b\u0012\u0004\u0012\u00020t0s2\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010±\u0001JP\u0010²\u0001\u001a\b\u0012\u0004\u0012\u00020t0s2\t\u0010\u0096\u0001\u001a\u0004\u0018\u00010q2\u0007\u0010\u0097\u0001\u001a\u00020q2\t\u0010³\u0001\u001a\u0004\u0018\u00010t2\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\f\b\u0002\u0010´\u0001\u001a\u0005\u0018\u00010µ\u0001H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010¶\u0001J-\u0010·\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070s2\u0007\u0010\u0084\u0001\u001a\u00020C2\t\b\u0002\u0010¸\u0001\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010¹\u0001J$\u0010º\u0001\u001a\t\u0012\u0005\u0012\u00030»\u00010s2\b\u0010¼\u0001\u001a\u00030»\u0001H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010½\u0001J<\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070s2\u0007\u0010\u0084\u0001\u001a\u00020C2\u000f\u0010¿\u0001\u001a\n\u0012\u0005\u0012\u00030Á\u00010À\u00012\u0007\u0010¸\u0001\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010Â\u0001J#\u0010Ã\u0001\u001a\t\u0012\u0005\u0012\u00030Ä\u00010s2\u0007\u0010Å\u0001\u001a\u00020CH\u0082@ø\u0001\u0000¢\u0006\u0003\u0010Æ\u0001J\f\u0010Ç\u0001\u001a\u0005\u0018\u00010È\u0001H\u0003J\u0012\u0010É\u0001\u001a\u00020\u00072\u0007\u0010Ê\u0001\u001a\u00020qH\u0002J3\u0010Ë\u0001\u001a\t\u0012\u0005\u0012\u00030Á\u00010s2\u0007\u0010\u0084\u0001\u001a\u00020C2\u000e\u0010Ì\u0001\u001a\t\u0012\u0005\u0012\u00030Í\u00010sH\u0082@ø\u0001\u0000¢\u0006\u0003\u0010Î\u0001J*\u0010Ï\u0001\u001a\t\u0012\u0005\u0012\u00030Ð\u00010s2\u000e\u0010\u009d\u0001\u001a\t\u0012\u0005\u0012\u00030\u009e\u00010GH\u0082@ø\u0001\u0000¢\u0006\u0003\u0010Ñ\u0001J*\u0010Ò\u0001\u001a\t\u0012\u0005\u0012\u00030Ó\u00010s2\u000e\u0010Ô\u0001\u001a\t\u0012\u0004\u0012\u00020q0Õ\u0001H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010Ö\u0001J\u0014\u0010×\u0001\u001a\u00020\u00072\t\u0010Ø\u0001\u001a\u0004\u0018\u00010qH\u0002J \u0010Ù\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¢\u00010G0sH\u0097@ø\u0001\u0000¢\u0006\u0003\u0010Ú\u0001J>\u0010Û\u0001\u001a\b\u0012\u0004\u0012\u00020t0s2\u000e\u0010Ü\u0001\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010s2\t\u0010³\u0001\u001a\u0004\u0018\u00010t2\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010Ý\u0001J)\u0010Þ\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070s2\u000e\u0010Ü\u0001\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010sH\u0082@ø\u0001\u0000¢\u0006\u0003\u0010ß\u0001J\u0012\u0010à\u0001\u001a\u00020{2\u0007\u0010á\u0001\u001a\u00020\u0007H\u0002JO\u0010â\u0001\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010s2\u0007\u0010\u008f\u0001\u001a\u00020q2\u0007\u0010\u0090\u0001\u001a\u00020\u00072\u0007\u0010ã\u0001\u001a\u00020q2\u0007\u0010ä\u0001\u001a\u00020q2\u0007\u0010å\u0001\u001a\u00020q2\u0006\u0010|\u001a\u00020qH\u0082@ø\u0001\u0000¢\u0006\u0003\u0010æ\u0001J\t\u0010ç\u0001\u001a\u00020{H\u0016J,\u0010è\u0001\u001a\t\u0012\u0005\u0012\u00030Í\u00010s2\u0007\u0010ä\u0001\u001a\u00020q2\u0007\u0010¸\u0001\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010é\u0001JO\u0010ê\u0001\u001a\b\u0012\u0004\u0012\u00020t0s2\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\t\u0010³\u0001\u001a\u0004\u0018\u00010t2\n\u0010ë\u0001\u001a\u0005\u0018\u00010ì\u00012\u0007\u0010\u0084\u0001\u001a\u00020C2\n\u0010í\u0001\u001a\u0005\u0018\u00010µ\u0001H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010î\u0001J\u0013\u0010ï\u0001\u001a\u00020q2\b\u0010ð\u0001\u001a\u00030ñ\u0001H\u0002J#\u0010ò\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070s2\b\u0010ó\u0001\u001a\u00030ñ\u0001H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010ô\u0001J6\u0010õ\u0001\u001a\t\u0012\u0005\u0012\u00030ö\u00010s2\b\u0010÷\u0001\u001a\u00030Á\u00012\u0007\u0010ä\u0001\u001a\u00020q2\u0007\u0010¸\u0001\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010ø\u0001J,\u0010ù\u0001\u001a\t\u0012\u0005\u0012\u00030ú\u00010s2\u0007\u0010ã\u0001\u001a\u00020q2\u0007\u0010¸\u0001\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010é\u0001J\u0015\u0010û\u0001\u001a\u00020{2\n\u0010´\u0001\u001a\u0005\u0018\u00010µ\u0001H\u0002J\t\u0010ü\u0001\u001a\u00020{H\u0002J\u000f\u0010ý\u0001\u001a\b\u0012\u0004\u0012\u00020q0sH\u0017J\t\u0010þ\u0001\u001a\u00020{H\u0017J\t\u0010ÿ\u0001\u001a\u00020{H\u0003J)\u0010\u0080\u0002\u001a\u00020{2\u0014\u0010\u0081\u0002\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0082\u00020G0sH\u0082@ø\u0001\u0000¢\u0006\u0003\u0010ß\u0001JD\u0010\u0083\u0002\u001a\b\u0012\u0004\u0012\u00020t0s2\u0007\u0010\u0084\u0001\u001a\u00020C2\u0006\u0010u\u001a\u00020v2\u000e\u0010\u0084\u0002\u001a\t\u0012\u0005\u0012\u00030\u008e\u00010s2\b\u0010w\u001a\u0004\u0018\u00010xH\u0082@ø\u0001\u0000¢\u0006\u0003\u0010\u0085\u0002J=\u0010\u0086\u0002\u001a\b\u0012\u0004\u0012\u00020\u00070s2\b\u0010Ü\u0001\u001a\u00030\u0093\u00012\u0007\u0010\u0087\u0002\u001a\u00020q2\u0006\u0010|\u001a\u00020q2\u0007\u0010\u0090\u0001\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010\u0088\u0002J&\u0010\u0089\u0002\u001a\u00020{2\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u0007\u0010\u008a\u0002\u001a\u00020qH\u0082@ø\u0001\u0000¢\u0006\u0003\u0010¯\u0001J-\u0010\u008b\u0002\u001a\b\u0012\u0004\u0012\u00020t0s2\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\b\u0010w\u001a\u0004\u0018\u00010xH\u0082@ø\u0001\u0000¢\u0006\u0003\u0010\u008c\u0002J:\u0010\u008d\u0002\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010s2\t\u0010\u0096\u0001\u001a\u0004\u0018\u00010q2\u0007\u0010\u0097\u0001\u001a\u00020q2\n\u0010´\u0001\u001a\u0005\u0018\u00010µ\u0001H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010\u008e\u0002J#\u0010\u008f\u0002\u001a\t\u0012\u0005\u0012\u00030\u0090\u00020s2\u0007\u0010\u009a\u0001\u001a\u00020qH\u0082@ø\u0001\u0000¢\u0006\u0003\u0010\u009b\u0001JA\u0010\u0091\u0002\u001a\t\u0012\u0005\u0012\u00030»\u00010s2\u0007\u0010\u0084\u0001\u001a\u00020C2\b\u0010¼\u0001\u001a\u00030»\u00012\b\u0010\u0092\u0002\u001a\u00030\u0093\u00022\b\u0010\u0084\u0002\u001a\u00030\u008e\u0001H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010\u0094\u0002R\u0010\u0010B\u001a\u0004\u0018\u00010CX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00070EX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0G0EX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0G0EX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010J\u001a\b\u0012\u0004\u0012\u00020H0KX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010L\u001a\u0004\u0018\u00010M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR#\u0010U\u001a\n W*\u0004\u0018\u00010V0V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010Q\u001a\u0004\bX\u0010YR\u0010\u0010[\u001a\u0004\u0018\u00010\\X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010]\u001a\u00020^8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020@X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010_\u001a\u00020`8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00070b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010cR\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0G0b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010cR\u0010\u0010g\u001a\u0004\u0018\u00010hX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010i\u001a\u0004\u0018\u00010jX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010k\u001a\u0004\u0018\u00010lX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020<X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0G0b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010cR\u000e\u0010o\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020qX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0095\u0002"}, d2 = {"Lmx/openpay/library/data/bluetooth/eglobal/EglobalBluetoothController;", "Lmx/openpay/library/domain/bluetooth/BluetoothController;", "context", "Landroid/content/Context;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "isProdEnv", "", "isDevCertEnv", "gson", "Lcom/google/gson/Gson;", "getMerchantUseCase", "Lmx/openpay/library/domain/usecase/eglobal/GetMerchantUseCase;", "insertMerchantDetailsUseCase", "Lmx/openpay/library/domain/usecase/eglobal/InsertMerchantDetailsUseCase;", "updateFirmwareUseCase", "Lmx/openpay/library/domain/usecase/eglobal/UpdateFirmwareUseCase;", "getBinesUseCase", "Lmx/openpay/library/domain/usecase/eglobal/GetBinesUseCase;", "deleteAllBinesUseCase", "Lmx/openpay/library/domain/usecase/eglobal/DeleteAllBinesUseCase;", "insertBinesUseCase", "Lmx/openpay/library/domain/usecase/eglobal/InsertBinesUseCase;", "getBinesCountUseCase", "Lmx/openpay/library/domain/usecase/eglobal/GetBinesCountUseCase;", "getRenewKeyBySlotAndTerminalUseCase", "Lmx/openpay/library/domain/usecase/eglobal/GetRenewKeyBySlotAndTerminalUseCase;", "initializeKeysUseCase", "Lmx/openpay/library/domain/usecase/eglobal/InitializeKeysUseCase;", "updateRenewKeyBySlotAndTerminalUseCase", "Lmx/openpay/library/domain/usecase/eglobal/UpdateRenewKeyBySlotAndTerminalUseCase;", "createChargeUseCase", "Lmx/openpay/library/domain/usecase/eglobal/CreateChargeUseCase;", "getTransactionByIdUseCase", "Lmx/openpay/library/domain/usecase/transaction/GetTransactionByIdUseCase;", "updateTransactionUseCase", "Lmx/openpay/library/domain/usecase/transaction/UpdateTransactionUseCase;", "insertTransactionUseCase", "Lmx/openpay/library/domain/usecase/transaction/InsertTransactionUseCase;", "updateTerminalCapacityDataUseCase", "Lmx/openpay/library/domain/usecase/eglobal/UpdateTerminalCapacityDataUseCase;", "reverseChargeUseCase", "Lmx/openpay/library/domain/usecase/eglobal/ReverseChargeUseCase;", "canPayWithBbvaPointsUseCase", "Lmx/openpay/library/domain/usecase/eglobal/CanPayWithBbvaPointsUseCase;", "getMerchantKeyNameBySlotUseCase", "Lmx/openpay/library/domain/usecase/eglobal/GetMerchantKeyNameBySlotUseCase;", "isMerchantSlotKeyValidatedUseCase", "Lmx/openpay/library/domain/usecase/eglobal/IsMerchantSlotKeyValidatedUseCase;", "getRSAKeysUseCase", "Lmx/openpay/library/domain/usecase/eglobal/GetRSAKeysUseCase;", "updateMerchantSlotKeyInjectedBySlotUseCase", "Lmx/openpay/library/domain/usecase/eglobal/UpdateMerchantSlotKeyInjectedBySlotUseCase;", "insertConnectedDeviceInfoUseCase", "Lmx/openpay/library/domain/usecase/eglobal/InsertConnectedDeviceInfoUseCase;", "updateKeyInjectedDateBySerialUseCase", "Lmx/openpay/library/domain/usecase/eglobal/UpdateKeyInjectedDateBySerialUseCase;", "getKeyInjectedDateBySerialUseCase", "Lmx/openpay/library/domain/usecase/eglobal/GetKeyInjectedDateBySerialUseCase;", "refundChargeUseCase", "Lmx/openpay/library/domain/usecase/eglobal/RefundChargeUseCase;", "getPaymentPlansUseCase", "Lmx/openpay/library/domain/usecase/GetPaymentPlansUseCase;", "firmwareUpdateStatusUseCase", "Lmx/openpay/library/domain/usecase/eglobal/FirmwareUpdateStatusUseCase;", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;ZZLcom/google/gson/Gson;Lmx/openpay/library/domain/usecase/eglobal/GetMerchantUseCase;Lmx/openpay/library/domain/usecase/eglobal/InsertMerchantDetailsUseCase;Lmx/openpay/library/domain/usecase/eglobal/UpdateFirmwareUseCase;Lmx/openpay/library/domain/usecase/eglobal/GetBinesUseCase;Lmx/openpay/library/domain/usecase/eglobal/DeleteAllBinesUseCase;Lmx/openpay/library/domain/usecase/eglobal/InsertBinesUseCase;Lmx/openpay/library/domain/usecase/eglobal/GetBinesCountUseCase;Lmx/openpay/library/domain/usecase/eglobal/GetRenewKeyBySlotAndTerminalUseCase;Lmx/openpay/library/domain/usecase/eglobal/InitializeKeysUseCase;Lmx/openpay/library/domain/usecase/eglobal/UpdateRenewKeyBySlotAndTerminalUseCase;Lmx/openpay/library/domain/usecase/eglobal/CreateChargeUseCase;Lmx/openpay/library/domain/usecase/transaction/GetTransactionByIdUseCase;Lmx/openpay/library/domain/usecase/transaction/UpdateTransactionUseCase;Lmx/openpay/library/domain/usecase/transaction/InsertTransactionUseCase;Lmx/openpay/library/domain/usecase/eglobal/UpdateTerminalCapacityDataUseCase;Lmx/openpay/library/domain/usecase/eglobal/ReverseChargeUseCase;Lmx/openpay/library/domain/usecase/eglobal/CanPayWithBbvaPointsUseCase;Lmx/openpay/library/domain/usecase/eglobal/GetMerchantKeyNameBySlotUseCase;Lmx/openpay/library/domain/usecase/eglobal/IsMerchantSlotKeyValidatedUseCase;Lmx/openpay/library/domain/usecase/eglobal/GetRSAKeysUseCase;Lmx/openpay/library/domain/usecase/eglobal/UpdateMerchantSlotKeyInjectedBySlotUseCase;Lmx/openpay/library/domain/usecase/eglobal/InsertConnectedDeviceInfoUseCase;Lmx/openpay/library/domain/usecase/eglobal/UpdateKeyInjectedDateBySerialUseCase;Lmx/openpay/library/domain/usecase/eglobal/GetKeyInjectedDateBySerialUseCase;Lmx/openpay/library/domain/usecase/eglobal/RefundChargeUseCase;Lmx/openpay/library/domain/usecase/GetPaymentPlansUseCase;Lmx/openpay/library/domain/usecase/eglobal/FirmwareUpdateStatusUseCase;)V", "_connectedDevice", "Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;", "_isConnected", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_pairedDevices", "", "Lmx/openpay/library/data/bluetooth/eglobal/EglobalDevice;", "_scannedDevices", "_scannedDevicesAux", "", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "getBluetoothAdapter", "()Landroid/bluetooth/BluetoothAdapter;", "bluetoothAdapter$delegate", "Lkotlin/Lazy;", "bluetoothEnabled", "getBluetoothEnabled", "()Z", "bluetoothManager", "Landroid/bluetooth/BluetoothManager;", "kotlin.jvm.PlatformType", "getBluetoothManager", "()Landroid/bluetooth/BluetoothManager;", "bluetoothManager$delegate", "bluetoothService", "Lcom/vierge/bluetoothlibrary/MyBluetoothService;", "bluetoothStateReceiver", "Lmx/openpay/library/data/bluetooth/BluetoothStateReceiver;", "foundDeviceReceiver", "Lmx/openpay/library/data/bluetooth/FoundDeviceReceiver;", "isConnected", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "isEnableDoubleEncrypt", "pairedDevices", "getPairedDevices", "pinPadBTHandler", "Lcom/vierge/bluetoothlibrary/MyHandler;", "pinPadSdk", "Lcom/vierge/pinpadsdk/PinPadSdk;", "pinPadSdkWrapper", "Lmx/openpay/library/data/bluetooth/eglobal/PinPadSdkWrapper;", "scannedDevices", "getScannedDevices", "transactionFailed", "transactionResponseCode", "", "applyCharge", "Lmx/openpay/library/domain/util/Result;", "Lmx/openpay/library/domain/model/eglobal/Charge;", "eglobalChargeRequest", "Lmx/openpay/library/domain/model/eglobal/EglobalChargeRequest;", "chargeCallback", "Lmx/openpay/library/domain/model/common/ChargeCallback;", "(Lmx/openpay/library/domain/model/eglobal/EglobalChargeRequest;Lmx/openpay/library/domain/model/common/ChargeCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyReverse", "", "orderId", "isTimeOut", "reasonReverse", "", "(Ljava/lang/String;ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "chargeTerminalOnResponseNoSuccess", "createCharge", "Lmx/openpay/library/domain/model/CreateCharge;", "connectedDevice", "errorBody", "(Lmx/openpay/library/domain/model/CreateCharge;Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkNeedToUpdateFirmware", "updateVersion", "firmwareVersion", "deviceSerial", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "closeConnection", "commandInjectionC51", "Lmx/openpay/library/data/bluetooth/eglobal/model/C51Response;", PushConstants.AMOUNT, "isCharge", "(Ljava/lang/String;Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commandInjectionC54", "Lmx/openpay/library/data/bluetooth/eglobal/model/C54Response;", "hostStatus", "responseCode", "issuerAuthData", "authorization", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commandInjectionZ13", "rsaKeyName", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commandInjectionZ14", "rsaKeysResponse", "Lmx/openpay/library/domain/model/eglobal/RSAKey;", "(Ljava/util/List;Lmx/openpay/library/domain/model/eglobal/EglobalChargeRequest;Lmx/openpay/library/domain/model/common/ChargeCallback;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connectDevice", Constants.device, "Lmx/openpay/library/domain/bluetooth/Device;", "(Lmx/openpay/library/domain/bluetooth/Device;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "chargeRequest", "Lmx/openpay/library/domain/model/common/ChargeRequest;", "(Lmx/openpay/library/domain/model/common/ChargeRequest;Lmx/openpay/library/domain/model/common/ChargeCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createChargeEglobalPlansStep", "plans", "(Lmx/openpay/library/domain/model/CreateCharge;Lmx/openpay/library/domain/model/common/ChargeCallback;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createChargeEglobalPointsStep", "withPoints", "(Lmx/openpay/library/domain/model/CreateCharge;Lmx/openpay/library/domain/model/common/ChargeCallback;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createChargeEglobalSignStep", AuthConstants.IMAGE, "(Lmx/openpay/library/domain/model/CreateCharge;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeCharge", "(Lmx/openpay/library/domain/model/CreateCharge;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeChargeC54Command", "chargeResponse", "gatewayResponse", "Lmx/openpay/library/data/datasource/remote/model/response/eglobal/GatewayResponseDto;", "(Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/domain/model/eglobal/Charge;Lmx/openpay/library/domain/model/CreateCharge;Lmx/openpay/library/data/datasource/remote/model/response/eglobal/GatewayResponseDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeKeysInitialSetOfCommands", "isOnConnectionFlow", "(Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeRefundCharge", "Lmx/openpay/library/domain/model/transaction/Transaction;", "transaction", "(Lmx/openpay/library/domain/model/transaction/Transaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeZ11orZ12", "initializeKeysResponse", "Lmx/openpay/library/domain/util/Result$Success;", "Lmx/openpay/library/domain/model/eglobal/TerminalKeysResponse;", "(Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;Lmx/openpay/library/domain/util/Result$Success;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchMerchantInfo", "Lmx/openpay/library/domain/model/eglobal/Merchant;", "deviceInfo", "(Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocationOfDevice", "Landroid/location/Location;", "hasPermission", "permission", "initializeKeys", "responseZ10", "Lmx/openpay/library/data/bluetooth/eglobal/model/Z10Response;", "(Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;Lmx/openpay/library/domain/util/Result;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "injectRSAKeyZ14", "Lmx/openpay/library/data/bluetooth/eglobal/model/Z14Response;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "injectScripts", "Lmx/openpay/library/data/bluetooth/eglobal/model/InjectScriptsResponse;", "params", "", "([Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAValidDevice", "deviceName", "listDevicesScanned", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "manageChargeC54Response", "c54Response", "(Lmx/openpay/library/domain/util/Result;Lmx/openpay/library/domain/model/eglobal/Charge;Lmx/openpay/library/domain/model/CreateCharge;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "manageRefundC54Response", "(Lmx/openpay/library/domain/util/Result;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyConnectionStatus", "connected", "readCardC51", "slotKey", "slotKeyName", "merchantId", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "release", "requestRandomKeyZ10", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reviewChargeServiceResponse", "emvTerminalData", "Lmx/openpay/library/domain/model/eglobal/EmvTerminalData;", "gatewayResponseDto", "(Lmx/openpay/library/domain/model/CreateCharge;Lmx/openpay/library/domain/model/eglobal/Charge;Lmx/openpay/library/domain/model/eglobal/EmvTerminalData;Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;Lmx/openpay/library/data/datasource/remote/model/response/eglobal/GatewayResponseDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveFileToStorage", "data", "", "sendFile", "firmwareResponse", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendInitialKeyZ11", "Lmx/openpay/library/data/bluetooth/eglobal/model/Z11Response;", "terminalKeysResponse", "(Lmx/openpay/library/domain/model/eglobal/TerminalKeysResponse;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendInitialKeyZ12", "Lmx/openpay/library/data/bluetooth/eglobal/model/Z12Response;", "setTransactionResponseCode", "setUpBluetooth", "startDiscovery", "stopDiscovery", "updatePairedDevices", "validateBinesResponse", "binesResponse", "Lmx/openpay/library/domain/model/eglobal/Bin;", "validateChargeFlow", "cardInfoC51", "(Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;Lmx/openpay/library/domain/model/eglobal/EglobalChargeRequest;Lmx/openpay/library/domain/util/Result;Lmx/openpay/library/domain/model/common/ChargeCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateE2exists", "transactionReadMode", "(Lmx/openpay/library/data/bluetooth/eglobal/model/C54Response;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateIfExistsTransactionData", "id", "validateIfSignatureRequired", "(Lmx/openpay/library/domain/model/CreateCharge;Lmx/openpay/library/domain/model/common/ChargeCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateIssuerAuthDataToInjectCommandC54", "(Ljava/lang/String;Ljava/lang/String;Lmx/openpay/library/data/datasource/remote/model/response/eglobal/GatewayResponseDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateRSAKeyZ13", "Lmx/openpay/library/data/bluetooth/eglobal/model/Z13Response;", "validateRefundFlow", "refundRequest", "Lmx/openpay/library/domain/model/eglobal/RefundRequest;", "(Lmx/openpay/library/domain/bluetooth/model/eglobal/ConnectedDeviceQ8;Lmx/openpay/library/domain/model/transaction/Transaction;Lmx/openpay/library/domain/model/eglobal/RefundRequest;Lmx/openpay/library/data/bluetooth/eglobal/model/C51Response;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEglobalBluetoothController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EglobalBluetoothController.kt\nmx/openpay/library/data/bluetooth/eglobal/EglobalBluetoothController\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2027:1\n230#2,5:2028\n230#2,5:2033\n230#2,5:2047\n1855#3,2:2038\n1549#3:2040\n1620#3,3:2041\n766#3:2044\n857#3,2:2045\n*S KotlinDebug\n*F\n+ 1 EglobalBluetoothController.kt\nmx/openpay/library/data/bluetooth/eglobal/EglobalBluetoothController\n*L\n547#1:2028,5\n555#1:2033,5\n1906#1:2047,5\n1700#1:2038,2\n1897#1:2040\n1897#1:2041,3\n1903#1:2044\n1903#1:2045,2\n*E\n"})
public final class EglobalBluetoothController extends BluetoothController {

    @Nullable
    private ConnectedDeviceQ8 _connectedDevice;

    @NotNull
    private final MutableStateFlow<Boolean> _isConnected;

    @NotNull
    private final MutableStateFlow<List<EglobalDevice>> _pairedDevices;

    @NotNull
    private final MutableStateFlow<List<EglobalDevice>> _scannedDevices;

    @NotNull
    private final List<EglobalDevice> _scannedDevicesAux;

    /* JADX INFO: renamed from: bluetoothAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bluetoothAdapter;
    private final boolean bluetoothEnabled;

    /* JADX INFO: renamed from: bluetoothManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy bluetoothManager;

    @Nullable
    private MyBluetoothService bluetoothService;

    @SuppressLint({"MissingPermission"})
    @NotNull
    private final BluetoothStateReceiver bluetoothStateReceiver;

    @NotNull
    private final CanPayWithBbvaPointsUseCase canPayWithBbvaPointsUseCase;

    @NotNull
    private final Context context;

    @NotNull
    private final CoroutineScope coroutineScope;

    @NotNull
    private final CreateChargeUseCase createChargeUseCase;

    @NotNull
    private final DeleteAllBinesUseCase deleteAllBinesUseCase;

    @NotNull
    private final FirmwareUpdateStatusUseCase firmwareUpdateStatusUseCase;

    @SuppressLint({"MissingPermission"})
    @NotNull
    private final FoundDeviceReceiver foundDeviceReceiver;

    @NotNull
    private final GetBinesCountUseCase getBinesCountUseCase;

    @NotNull
    private final GetBinesUseCase getBinesUseCase;

    @NotNull
    private final GetKeyInjectedDateBySerialUseCase getKeyInjectedDateBySerialUseCase;

    @NotNull
    private final GetMerchantKeyNameBySlotUseCase getMerchantKeyNameBySlotUseCase;

    @NotNull
    private final GetMerchantUseCase getMerchantUseCase;

    @NotNull
    private final GetPaymentPlansUseCase getPaymentPlansUseCase;

    @NotNull
    private final GetRSAKeysUseCase getRSAKeysUseCase;

    @NotNull
    private final GetRenewKeyBySlotAndTerminalUseCase getRenewKeyBySlotAndTerminalUseCase;

    @NotNull
    private final GetTransactionByIdUseCase getTransactionByIdUseCase;

    @NotNull
    private final Gson gson;

    @NotNull
    private final InitializeKeysUseCase initializeKeysUseCase;

    @NotNull
    private final InsertBinesUseCase insertBinesUseCase;

    @NotNull
    private final InsertConnectedDeviceInfoUseCase insertConnectedDeviceInfoUseCase;

    @NotNull
    private final InsertMerchantDetailsUseCase insertMerchantDetailsUseCase;

    @NotNull
    private final InsertTransactionUseCase insertTransactionUseCase;
    private final boolean isDevCertEnv;
    private final boolean isEnableDoubleEncrypt;

    @NotNull
    private final IsMerchantSlotKeyValidatedUseCase isMerchantSlotKeyValidatedUseCase;
    private final boolean isProdEnv;

    @Nullable
    private MyHandler pinPadBTHandler;

    @Nullable
    private PinPadSdk pinPadSdk;

    @Nullable
    private PinPadSdkWrapper pinPadSdkWrapper;

    @NotNull
    private final RefundChargeUseCase refundChargeUseCase;

    @NotNull
    private final ReverseChargeUseCase reverseChargeUseCase;
    private boolean transactionFailed;

    @NotNull
    private String transactionResponseCode;

    @NotNull
    private final UpdateFirmwareUseCase updateFirmwareUseCase;

    @NotNull
    private final UpdateKeyInjectedDateBySerialUseCase updateKeyInjectedDateBySerialUseCase;

    @NotNull
    private final UpdateMerchantSlotKeyInjectedBySlotUseCase updateMerchantSlotKeyInjectedBySlotUseCase;

    @NotNull
    private final UpdateRenewKeyBySlotAndTerminalUseCase updateRenewKeyBySlotAndTerminalUseCase;

    @NotNull
    private final UpdateTerminalCapacityDataUseCase updateTerminalCapacityDataUseCase;

    @NotNull
    private final UpdateTransactionUseCase updateTransactionUseCase;

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$applyCharge$1, reason: invalid class name */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 5, 5, 5, 7}, l = {708, 710, 720, 724, 732, 744, 747, 765, 762}, m = "applyCharge", n = {"this", "eglobalChargeRequest", "chargeCallback", "connectedDevice", "this", "eglobalChargeRequest", "chargeCallback", "connectedDevice", "this", "eglobalChargeRequest", "chargeCallback", "connectedDevice", "this", "eglobalChargeRequest", "chargeCallback", "connectedDevice", "this", "eglobalChargeRequest", "chargeCallback", "chargeCallback"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.applyCharge(null, null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$applyReverse$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {}, l = {2014}, m = "applyReverse", n = {}, s = {})
    public static final class C07011 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C07011(Continuation<? super C07011> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.applyReverse(null, false, 0, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$chargeTerminalOnResponseNoSuccess$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {1141, 1150}, m = "chargeTerminalOnResponseNoSuccess", n = {"this", "createCharge", "connectedDevice", "error", "errorCode", "httpCode", "description", "errorCode", "httpCode", "description"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2"})
    public static final class C07021 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C07021(Continuation<? super C07021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.chargeTerminalOnResponseNoSuccess(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$checkNeedToUpdateFirmware$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {0, 0, 0}, l = {533, 535}, m = "checkNeedToUpdateFirmware", n = {"this", "firmwareVersion", "deviceSerial"}, s = {"L$0", "L$1", "L$2"})
    public static final class C07031 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C07031(Continuation<? super C07031> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.checkNeedToUpdateFirmware(false, null, null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$commandInjectionC51$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {}, l = {898}, m = "commandInjectionC51", n = {}, s = {})
    public static final class C07041 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C07041(Continuation<? super C07041> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.commandInjectionC51(null, null, false, null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$commandInjectionZ13$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {}, l = {921}, m = "commandInjectionZ13", n = {}, s = {})
    public static final class C07051 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C07051(Continuation<? super C07051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.commandInjectionZ13(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$commandInjectionZ14$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3}, l = {948, 950, 958, 962, 970}, m = "commandInjectionZ14", n = {"this", "eglobalChargeRequest", "chargeCallback", "connectedDevice", "isCharge", "this", "eglobalChargeRequest", "chargeCallback", "connectedDevice", "isCharge", "this", "eglobalChargeRequest", "chargeCallback", "connectedDevice", "isCharge", "this", "eglobalChargeRequest", "chargeCallback", "connectedDevice"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3"})
    public static final class C07061 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C07061(Continuation<? super C07061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.commandInjectionZ14(null, null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$connectDevice$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {0, 0, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 8, 8, 9}, l = {358, 361, 365, 366, 369, 371, 379, 388, 394, 399}, m = "connectDevice", n = {"this", "wrapper", "this", "this", "deviceInfo", "this", "deviceInfo", "this", "deviceInfo", "merchantInfo", "this", "deviceInfo", "merchantInfo", "this", "deviceInfo", "merchantInfo", "this", "deviceInfo", "this", "deviceInfo", "this"}, s = {"L$0", "L$1", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$0"})
    public static final class C07071 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C07071(Continuation<? super C07071> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.connectDevice(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$createCharge$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {587, 595, 599, TypedValues.MotionType.TYPE_PATHMOTION_ARC, 618}, m = "createCharge", n = {"this", "chargeCallback", "eglobalChargeRequest", "connectedDevice", "this", "chargeCallback", "eglobalChargeRequest", "connectedDevice", "this", "chargeCallback", "eglobalChargeRequest", "connectedDevice"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    public static final class C07081 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C07081(Continuation<? super C07081> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.createCharge(null, null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$createChargeEglobalPointsStep$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {1, 1, 1}, l = {1246, 1250, 1256, 1270}, m = "createChargeEglobalPointsStep", n = {"this", "createCharge", "chargeCallback"}, s = {"L$0", "L$1", "L$2"})
    public static final class C07091 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C07091(Continuation<? super C07091> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.createChargeEglobalPointsStep(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$executeCharge$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {0, 0, 0, 1, 1, 1, 1, 4, 6}, l = {1051, 1055, 1056, 1068, 1076, 1077, 1082, 1087}, m = "executeCharge", n = {"this", "createCharge", "connectedDevice", "this", "createCharge", "connectedDevice", "chargeResponseData", "this", "this"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$0"})
    public static final class C07101 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C07101(Continuation<? super C07101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.executeCharge(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$executeChargeC54Command$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {0, 0}, l = {1579, 1578}, m = "executeChargeC54Command", n = {"chargeResponse", "createCharge"}, s = {"L$0", "L$1"})
    public static final class C07111 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C07111(Continuation<? super C07111> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.executeChargeC54Command(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$executeKeysInitialSetOfCommands$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {0, 0, 0, 1, 1, 1, 3, 3}, l = {793, 797, 799, 807}, m = "executeKeysInitialSetOfCommands", n = {"this", "connectedDevice", "isOnConnectionFlow", "this", "connectedDevice", "isOnConnectionFlow", "this", "initializeKeysResponse"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0", "L$0", "L$1"})
    public static final class C07121 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C07121(Continuation<? super C07121> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.executeKeysInitialSetOfCommands(null, false, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$executeRefundCharge$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 4, 4, 4, 4}, l = {1379, 1387, 1392, ReturnCode.ERR_PAYMENT, 1418, 1426, 1443}, m = "executeRefundCharge", n = {"this", "transaction", "refundRequest", "connectedDevice", "this", "transaction", "refundRequest", "connectedDevice", "this", "transaction", "refundRequest", "connectedDevice", "this", "transaction", "refundRequest", "connectedDevice"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    public static final class C07131 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C07131(Continuation<? super C07131> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.executeRefundCharge(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$executeZ11orZ12$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {0, 0, 2, 3, 3}, l = {839, 847, 856, 866, 873}, m = "executeZ11orZ12", n = {"this", "connectedDevice", "responseZ11", "this", "connectedDevice"}, s = {"L$0", "L$1", "L$0", "L$0", "L$1"})
    public static final class C07141 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C07141(Continuation<? super C07141> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.executeZ11orZ12(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$fetchMerchantInfo$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9}, l = {466, 469, 471, 473, 480, 488, 488, 490, 490, 492}, m = "fetchMerchantInfo", n = {"this", "deviceInfo", "wrapper", "this", "deviceInfo", "wrapper", "merchant", "this", "deviceInfo", "wrapper", "merchant", "merchantResult", "this", "deviceInfo", "merchant", "merchantResult", "this", "deviceInfo", "merchant", "merchantResult", "this", "deviceInfo", "merchantResult", "this", "deviceInfo", "merchantResult", "this", "deviceInfo", "merchantResult", "this", "deviceInfo", "merchantResult", "merchantResult"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$3", "L$0", "L$1", "L$2", "L$0"})
    public static final class C07151 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C07151(Continuation<? super C07151> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.fetchMerchantInfo(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$injectRSAKeyZ14$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {0, 0}, l = {ReturnCode.ERR_HTTP_KEY_NOT_FOUND}, m = "injectRSAKeyZ14", n = {"wrapper", DigipassManagerConstants.KEY_RESPONSE}, s = {"L$0", "L$1"})
    public static final class C07161 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C07161(Continuation<? super C07161> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.injectRSAKeyZ14(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$injectScripts$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {0}, l = {1823}, m = "injectScripts", n = {"wrapper"}, s = {"L$0"})
    public static final class C07171 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07171(Continuation<? super C07171> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.injectScripts(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$listDevicesScanned$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {0}, l = {325}, m = "listDevicesScanned", n = {"this"}, s = {"L$0"})
    public static final class C07181 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07181(Continuation<? super C07181> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.listDevicesScanned(this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$manageChargeC54Response$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {0}, l = {ReturnCode.ERR_STORE_REMOVING_DATA, 1624, 1629}, m = "manageChargeC54Response", n = {"chargeResponse"}, s = {"L$0"})
    public static final class C07191 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07191(Continuation<? super C07191> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.manageChargeC54Response(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$manageRefundC54Response$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {1, 2}, l = {1533, 1552, 1551}, m = "manageRefundC54Response", n = {"c54Response", "c54Response"}, s = {"L$0", "L$0"})
    public static final class C07201 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C07201(Continuation<? super C07201> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.manageRefundC54Response(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$readCardC51$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {0}, l = {1786}, m = "readCardC51", n = {"wrapper"}, s = {"L$0"})
    public static final class C07211 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07211(Continuation<? super C07211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.readCardC51(null, false, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$requestRandomKeyZ10$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {0}, l = {1657}, m = "requestRandomKeyZ10", n = {"wrapper"}, s = {"L$0"})
    public static final class C07221 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07221(Continuation<? super C07221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.requestRandomKeyZ10(null, false, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$reviewChargeServiceResponse$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {1178, 1190, 1193, ReturnCode.ERR_CRY_DECRYPT, 1219}, m = "reviewChargeServiceResponse", n = {"this", "createCharge", "chargeResponse", "emvTerminalData", "gatewayResponseDto", "this", "createCharge", "chargeResponse", "emvTerminalData", "gatewayResponseDto"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    public static final class C07231 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C07231(Continuation<? super C07231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.reviewChargeServiceResponse(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$sendFile$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {}, l = {1326}, m = "sendFile", n = {}, s = {})
    public static final class C07241 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C07241(Continuation<? super C07241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.sendFile(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$sendInitialKeyZ11$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {0}, l = {1729}, m = "sendInitialKeyZ11", n = {"wrapper"}, s = {"L$0"})
    public static final class C07251 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07251(Continuation<? super C07251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.sendInitialKeyZ11(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$sendInitialKeyZ12$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {0}, l = {1755}, m = "sendInitialKeyZ12", n = {"wrapper"}, s = {"L$0"})
    public static final class C07261 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07261(Continuation<? super C07261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.sendInitialKeyZ12(null, false, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$validateBinesResponse$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {0, 0}, l = {517, 518}, m = "validateBinesResponse", n = {"this", "binesResponse"}, s = {"L$0", "L$1"})
    public static final class C07271 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C07271(Continuation<? super C07271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.validateBinesResponse(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$validateChargeFlow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {0, 0, 0, 0, 1, 1, 1, 4}, l = {652, 663, 669, 678, 687}, m = "validateChargeFlow", n = {"this", "eglobalChargeRequest", "chargeCallback", "createCharge", "this", "chargeCallback", "createCharge", "cardInfoC51"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0"})
    public static final class C07281 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C07281(Continuation<? super C07281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.validateChargeFlow(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$validateE2exists$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {0, 1, 1}, l = {1977, 1983}, m = "validateE2exists", n = {"this", "this", "isCharge"}, s = {"L$0", "L$0", "Z$0"})
    public static final class C07291 extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C07291(Continuation<? super C07291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.validateE2exists(null, null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$validateIfExistsTransactionData$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {0, 0, 0}, l = {1641, 1642, 1644}, m = "validateIfExistsTransactionData", n = {"this", "createCharge", "id"}, s = {"L$0", "L$1", "L$2"})
    public static final class C07301 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C07301(Continuation<? super C07301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.validateIfExistsTransactionData(null, null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$validateIfSignatureRequired$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {}, l = {1024, 1027, 1035}, m = "validateIfSignatureRequired", n = {}, s = {})
    public static final class C07311 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C07311(Continuation<? super C07311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.validateIfSignatureRequired(null, null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$validateRSAKeyZ13$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {0}, l = {1679}, m = "validateRSAKeyZ13", n = {"wrapper"}, s = {"L$0"})
    public static final class C07321 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C07321(Continuation<? super C07321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.validateRSAKeyZ13(null, this);
        }
    }

    /* JADX INFO: renamed from: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$validateRefundFlow$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: EglobalBluetoothController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController", f = "EglobalBluetoothController.kt", i = {0, 1, 2, 3, 4, 5, 6}, l = {1469, 1472, 1471, 1486, 1485, 1497, 1496, 1511, 1510}, m = "validateRefundFlow", n = {"this", "refundResponse", "refundResponse", "refundResponse", "refundResponse", "refundResponse", "refundResponse"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0"})
    public static final class C07331 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C07331(Continuation<? super C07331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EglobalBluetoothController.this.validateRefundFlow(null, null, null, null, this);
        }
    }

    public EglobalBluetoothController(@NotNull Context context, @NotNull CoroutineScope coroutineScope, boolean z10, boolean z11, @NotNull Gson gson, @NotNull GetMerchantUseCase getMerchantUseCase, @NotNull InsertMerchantDetailsUseCase insertMerchantDetailsUseCase, @NotNull UpdateFirmwareUseCase updateFirmwareUseCase, @NotNull GetBinesUseCase getBinesUseCase, @NotNull DeleteAllBinesUseCase deleteAllBinesUseCase, @NotNull InsertBinesUseCase insertBinesUseCase, @NotNull GetBinesCountUseCase getBinesCountUseCase, @NotNull GetRenewKeyBySlotAndTerminalUseCase getRenewKeyBySlotAndTerminalUseCase, @NotNull InitializeKeysUseCase initializeKeysUseCase, @NotNull UpdateRenewKeyBySlotAndTerminalUseCase updateRenewKeyBySlotAndTerminalUseCase, @NotNull CreateChargeUseCase createChargeUseCase, @NotNull GetTransactionByIdUseCase getTransactionByIdUseCase, @NotNull UpdateTransactionUseCase updateTransactionUseCase, @NotNull InsertTransactionUseCase insertTransactionUseCase, @NotNull UpdateTerminalCapacityDataUseCase updateTerminalCapacityDataUseCase, @NotNull ReverseChargeUseCase reverseChargeUseCase, @NotNull CanPayWithBbvaPointsUseCase canPayWithBbvaPointsUseCase, @NotNull GetMerchantKeyNameBySlotUseCase getMerchantKeyNameBySlotUseCase, @NotNull IsMerchantSlotKeyValidatedUseCase isMerchantSlotKeyValidatedUseCase, @NotNull GetRSAKeysUseCase getRSAKeysUseCase, @NotNull UpdateMerchantSlotKeyInjectedBySlotUseCase updateMerchantSlotKeyInjectedBySlotUseCase, @NotNull InsertConnectedDeviceInfoUseCase insertConnectedDeviceInfoUseCase, @NotNull UpdateKeyInjectedDateBySerialUseCase updateKeyInjectedDateBySerialUseCase, @NotNull GetKeyInjectedDateBySerialUseCase getKeyInjectedDateBySerialUseCase, @NotNull RefundChargeUseCase refundChargeUseCase, @NotNull GetPaymentPlansUseCase getPaymentPlansUseCase, @NotNull FirmwareUpdateStatusUseCase firmwareUpdateStatusUseCase) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(getMerchantUseCase, "getMerchantUseCase");
        Intrinsics.checkNotNullParameter(insertMerchantDetailsUseCase, "insertMerchantDetailsUseCase");
        Intrinsics.checkNotNullParameter(updateFirmwareUseCase, "updateFirmwareUseCase");
        Intrinsics.checkNotNullParameter(getBinesUseCase, "getBinesUseCase");
        Intrinsics.checkNotNullParameter(deleteAllBinesUseCase, "deleteAllBinesUseCase");
        Intrinsics.checkNotNullParameter(insertBinesUseCase, "insertBinesUseCase");
        Intrinsics.checkNotNullParameter(getBinesCountUseCase, "getBinesCountUseCase");
        Intrinsics.checkNotNullParameter(getRenewKeyBySlotAndTerminalUseCase, "getRenewKeyBySlotAndTerminalUseCase");
        Intrinsics.checkNotNullParameter(initializeKeysUseCase, "initializeKeysUseCase");
        Intrinsics.checkNotNullParameter(updateRenewKeyBySlotAndTerminalUseCase, "updateRenewKeyBySlotAndTerminalUseCase");
        Intrinsics.checkNotNullParameter(createChargeUseCase, "createChargeUseCase");
        Intrinsics.checkNotNullParameter(getTransactionByIdUseCase, "getTransactionByIdUseCase");
        Intrinsics.checkNotNullParameter(updateTransactionUseCase, "updateTransactionUseCase");
        Intrinsics.checkNotNullParameter(insertTransactionUseCase, "insertTransactionUseCase");
        Intrinsics.checkNotNullParameter(updateTerminalCapacityDataUseCase, "updateTerminalCapacityDataUseCase");
        Intrinsics.checkNotNullParameter(reverseChargeUseCase, "reverseChargeUseCase");
        Intrinsics.checkNotNullParameter(canPayWithBbvaPointsUseCase, "canPayWithBbvaPointsUseCase");
        Intrinsics.checkNotNullParameter(getMerchantKeyNameBySlotUseCase, "getMerchantKeyNameBySlotUseCase");
        Intrinsics.checkNotNullParameter(isMerchantSlotKeyValidatedUseCase, "isMerchantSlotKeyValidatedUseCase");
        Intrinsics.checkNotNullParameter(getRSAKeysUseCase, "getRSAKeysUseCase");
        Intrinsics.checkNotNullParameter(updateMerchantSlotKeyInjectedBySlotUseCase, "updateMerchantSlotKeyInjectedBySlotUseCase");
        Intrinsics.checkNotNullParameter(insertConnectedDeviceInfoUseCase, "insertConnectedDeviceInfoUseCase");
        Intrinsics.checkNotNullParameter(updateKeyInjectedDateBySerialUseCase, "updateKeyInjectedDateBySerialUseCase");
        Intrinsics.checkNotNullParameter(getKeyInjectedDateBySerialUseCase, "getKeyInjectedDateBySerialUseCase");
        Intrinsics.checkNotNullParameter(refundChargeUseCase, "refundChargeUseCase");
        Intrinsics.checkNotNullParameter(getPaymentPlansUseCase, "getPaymentPlansUseCase");
        Intrinsics.checkNotNullParameter(firmwareUpdateStatusUseCase, "firmwareUpdateStatusUseCase");
        this.context = context;
        this.coroutineScope = coroutineScope;
        this.isProdEnv = z10;
        this.isDevCertEnv = z11;
        this.gson = gson;
        this.getMerchantUseCase = getMerchantUseCase;
        this.insertMerchantDetailsUseCase = insertMerchantDetailsUseCase;
        this.updateFirmwareUseCase = updateFirmwareUseCase;
        this.getBinesUseCase = getBinesUseCase;
        this.deleteAllBinesUseCase = deleteAllBinesUseCase;
        this.insertBinesUseCase = insertBinesUseCase;
        this.getBinesCountUseCase = getBinesCountUseCase;
        this.getRenewKeyBySlotAndTerminalUseCase = getRenewKeyBySlotAndTerminalUseCase;
        this.initializeKeysUseCase = initializeKeysUseCase;
        this.updateRenewKeyBySlotAndTerminalUseCase = updateRenewKeyBySlotAndTerminalUseCase;
        this.createChargeUseCase = createChargeUseCase;
        this.getTransactionByIdUseCase = getTransactionByIdUseCase;
        this.updateTransactionUseCase = updateTransactionUseCase;
        this.insertTransactionUseCase = insertTransactionUseCase;
        this.updateTerminalCapacityDataUseCase = updateTerminalCapacityDataUseCase;
        this.reverseChargeUseCase = reverseChargeUseCase;
        this.canPayWithBbvaPointsUseCase = canPayWithBbvaPointsUseCase;
        this.getMerchantKeyNameBySlotUseCase = getMerchantKeyNameBySlotUseCase;
        this.isMerchantSlotKeyValidatedUseCase = isMerchantSlotKeyValidatedUseCase;
        this.getRSAKeysUseCase = getRSAKeysUseCase;
        this.updateMerchantSlotKeyInjectedBySlotUseCase = updateMerchantSlotKeyInjectedBySlotUseCase;
        this.insertConnectedDeviceInfoUseCase = insertConnectedDeviceInfoUseCase;
        this.updateKeyInjectedDateBySerialUseCase = updateKeyInjectedDateBySerialUseCase;
        this.getKeyInjectedDateBySerialUseCase = getKeyInjectedDateBySerialUseCase;
        this.refundChargeUseCase = refundChargeUseCase;
        this.getPaymentPlansUseCase = getPaymentPlansUseCase;
        this.firmwareUpdateStatusUseCase = firmwareUpdateStatusUseCase;
        this.bluetoothManager = LazyKt__LazyJVMKt.lazy(new Function0<BluetoothManager>() { // from class: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$bluetoothManager$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final BluetoothManager invoke() {
                return (BluetoothManager) this.this$0.context.getSystemService(BluetoothManager.class);
            }
        });
        this.bluetoothAdapter = LazyKt__LazyJVMKt.lazy(new Function0<BluetoothAdapter>() { // from class: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$bluetoothAdapter$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final BluetoothAdapter invoke() {
                BluetoothManager bluetoothManager = this.this$0.getBluetoothManager();
                if (bluetoothManager != null) {
                    return bluetoothManager.getAdapter();
                }
                return null;
            }
        });
        BluetoothAdapter bluetoothAdapter = getBluetoothAdapter();
        boolean z12 = false;
        if (bluetoothAdapter != null && bluetoothAdapter.isEnabled()) {
            z12 = true;
        }
        this.bluetoothEnabled = z12;
        this._isConnected = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this._scannedDevices = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this._scannedDevicesAux = new ArrayList();
        this._pairedDevices = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.transactionResponseCode = "";
        this.foundDeviceReceiver = new FoundDeviceReceiver(new Function1<BluetoothDevice, Unit>() { // from class: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$foundDeviceReceiver$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BluetoothDevice bluetoothDevice) {
                invoke2(bluetoothDevice);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull BluetoothDevice bluetoothDevice) {
                Intrinsics.checkNotNullParameter(bluetoothDevice, "bluetoothDevice");
                String name = bluetoothDevice.getName();
                if (name == null) {
                    name = "";
                }
                String address = bluetoothDevice.getAddress();
                Intrinsics.checkNotNullExpressionValue(address, "bluetoothDevice.address");
                EglobalDevice eglobalDevice = new EglobalDevice(name, address);
                if (this.this$0._scannedDevicesAux.contains(eglobalDevice) || !this.this$0.isAValidDevice(bluetoothDevice.getName())) {
                    return;
                }
                this.this$0._scannedDevicesAux.add(eglobalDevice);
            }
        });
        BluetoothStateReceiver bluetoothStateReceiver = new BluetoothStateReceiver(new Function2<Boolean, BluetoothDevice, Unit>() { // from class: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController$bluetoothStateReceiver$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, BluetoothDevice bluetoothDevice) {
                invoke(bool.booleanValue(), bluetoothDevice);
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z13, @NotNull BluetoothDevice bluetoothDevice) {
                Set<BluetoothDevice> bondedDevices;
                Intrinsics.checkNotNullParameter(bluetoothDevice, "bluetoothDevice");
                BluetoothAdapter bluetoothAdapter2 = this.this$0.getBluetoothAdapter();
                if (bluetoothAdapter2 != null && (bondedDevices = bluetoothAdapter2.getBondedDevices()) != null && bondedDevices.contains(bluetoothDevice)) {
                    List list = this.this$0._scannedDevicesAux;
                    ArrayList arrayList = new ArrayList();
                    boolean z14 = false;
                    for (Object obj : list) {
                        if (z14) {
                            arrayList.add(obj);
                        } else if (!Intrinsics.areEqual(((EglobalDevice) obj).getAddress(), bluetoothDevice.getAddress())) {
                            arrayList.add(obj);
                            z14 = true;
                        }
                    }
                    this.this$0._scannedDevicesAux.clear();
                    this.this$0._scannedDevicesAux.addAll(arrayList);
                }
                if (z13) {
                    return;
                }
                this.this$0.closeConnection();
            }
        });
        this.bluetoothStateReceiver = bluetoothStateReceiver;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        Unit unit = Unit.INSTANCE;
        context.registerReceiver(bluetoothStateReceiver, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:31:0x010f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0110  */
    /* JADX WARN: Code duplicated, block: B:35:0x011a  */
    /* JADX WARN: Code duplicated, block: B:37:0x011e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0135 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x013c  */
    /* JADX WARN: Code duplicated, block: B:44:0x015f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0160  */
    /* JADX WARN: Code duplicated, block: B:48:0x0179 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x017a A[PHI: r15
      0x017a: PHI (r15v29 java.lang.Object) = (r15v28 java.lang.Object), (r15v1 java.lang.Object) binds: [B:47:0x0177, B:16:0x0062] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x017b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0181  */
    /* JADX WARN: Code duplicated, block: B:55:0x0187  */
    /* JADX WARN: Code duplicated, block: B:57:0x019a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x019b  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x01c2 A[PHI: r15
      0x01c2: PHI (r15v36 java.lang.Object) = (r15v35 java.lang.Object), (r15v1 java.lang.Object) binds: [B:62:0x01bf, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x01da  */
    /* JADX WARN: Code duplicated, block: B:72:0x01fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:76:0x0219 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:77:0x021a A[PHI: r15
      0x021a: PHI (r15v39 java.lang.Object) = (r15v38 java.lang.Object), (r15v1 java.lang.Object) binds: [B:75:0x0217, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:78:0x021b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    public final Object applyCharge(EglobalChargeRequest eglobalChargeRequest, ChargeCallback chargeCallback, Continuation<? super Result<Charge>> continuation) {
        AnonymousClass1 anonymousClass1;
        EglobalBluetoothController eglobalBluetoothController;
        EglobalChargeRequest eglobalChargeRequest2;
        ConnectedDeviceQ8 connectedDeviceQ8;
        EglobalChargeRequest eglobalChargeRequest3;
        EglobalBluetoothController eglobalBluetoothController2;
        ConnectedDeviceQ8 connectedDeviceQ9;
        ChargeCallback chargeCallback2;
        EglobalChargeRequest eglobalChargeRequest4;
        EglobalBluetoothController eglobalBluetoothController3;
        ChargeCallback chargeCallback3;
        EglobalChargeRequest eglobalChargeRequest5;
        EglobalBluetoothController eglobalBluetoothController4;
        Result result;
        ConnectedDeviceQ8 connectedDeviceQ10;
        ChargeCallback chargeCallback4;
        EglobalChargeRequest eglobalChargeRequest6;
        EglobalBluetoothController eglobalBluetoothController5;
        Result result2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objInvoke = anonymousClass1.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        switch (anonymousClass1.label) {
            case 0:
                ResultKt.throwOnFailure(objInvoke);
                ConnectedDeviceQ8 connectedDeviceQ11 = this._connectedDevice;
                if (connectedDeviceQ11 == null) {
                    return new Result.Failure(new Error.TerminalNotConnected(null, 1, null));
                }
                GetMerchantKeyNameBySlotUseCase getMerchantKeyNameBySlotUseCase = this.getMerchantKeyNameBySlotUseCase;
                int i11 = Integer.parseInt(connectedDeviceQ11.getSlotKey());
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = eglobalChargeRequest;
                anonymousClass1.L$2 = chargeCallback;
                anonymousClass1.L$3 = connectedDeviceQ11;
                anonymousClass1.label = 1;
                Object objInvoke2 = getMerchantKeyNameBySlotUseCase.invoke(i11, anonymousClass1);
                if (objInvoke2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                eglobalBluetoothController = this;
                eglobalChargeRequest2 = eglobalChargeRequest;
                connectedDeviceQ8 = connectedDeviceQ11;
                objInvoke = objInvoke2;
                if (((String) objInvoke).length() > 0) {
                    return new Result.Failure(new Error.UninitializedKey(null, 1, null));
                }
                IsMerchantSlotKeyValidatedUseCase isMerchantSlotKeyValidatedUseCase = eglobalBluetoothController.isMerchantSlotKeyValidatedUseCase;
                String serial = connectedDeviceQ8.getSerial();
                int i12 = Integer.parseInt(connectedDeviceQ8.getSlotKey());
                anonymousClass1.L$0 = eglobalBluetoothController;
                anonymousClass1.L$1 = eglobalChargeRequest2;
                anonymousClass1.L$2 = chargeCallback;
                anonymousClass1.L$3 = connectedDeviceQ8;
                anonymousClass1.label = 2;
                objInvoke = isMerchantSlotKeyValidatedUseCase.invoke(serial, i12, anonymousClass1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                eglobalChargeRequest3 = eglobalChargeRequest2;
                eglobalBluetoothController2 = eglobalBluetoothController;
                if (((Boolean) objInvoke).booleanValue()) {
                    String amount = EglobalUtils.INSTANCE.parseAmount(eglobalChargeRequest3.getCom.bbva.notifications.constants.PushConstants.AMOUNT java.lang.String());
                    String orderId = eglobalChargeRequest3.getOrderId();
                    anonymousClass1.L$0 = chargeCallback;
                    anonymousClass1.L$1 = eglobalBluetoothController2;
                    anonymousClass1.L$2 = connectedDeviceQ8;
                    anonymousClass1.L$3 = eglobalChargeRequest3;
                    anonymousClass1.label = 8;
                    objInvoke = eglobalBluetoothController2.commandInjectionC51(amount, connectedDeviceQ8, true, orderId, anonymousClass1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    connectedDeviceQ9 = connectedDeviceQ8;
                    chargeCallback2 = chargeCallback;
                    eglobalChargeRequest4 = eglobalChargeRequest3;
                    eglobalBluetoothController3 = eglobalBluetoothController2;
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.L$2 = null;
                    anonymousClass1.L$3 = null;
                    anonymousClass1.label = 9;
                    objInvoke = eglobalBluetoothController3.validateChargeFlow(connectedDeviceQ9, eglobalChargeRequest4, (Result) objInvoke, chargeCallback2, anonymousClass1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objInvoke;
                }
                if (!eglobalBluetoothController2.isProdEnv) {
                    GetRSAKeysUseCase getRSAKeysUseCase = eglobalBluetoothController2.getRSAKeysUseCase;
                    anonymousClass1.L$0 = eglobalBluetoothController2;
                    anonymousClass1.L$1 = eglobalChargeRequest3;
                    anonymousClass1.L$2 = chargeCallback;
                    anonymousClass1.L$3 = null;
                    anonymousClass1.label = 6;
                    objInvoke = getRSAKeysUseCase.invoke(anonymousClass1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chargeCallback3 = chargeCallback;
                    eglobalChargeRequest5 = eglobalChargeRequest3;
                    eglobalBluetoothController4 = eglobalBluetoothController2;
                    result2 = (Result) objInvoke;
                    if (result2 instanceof Result.Success) {
                        if (result2 instanceof Result.Failure) {
                            return new Result.Failure(((Result.Failure) result2).getError());
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    Object data = ((Result.Success) result2).getData();
                    Intrinsics.checkNotNull(data);
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.L$2 = null;
                    anonymousClass1.label = 7;
                    objInvoke = eglobalBluetoothController4.commandInjectionZ14((List) data, eglobalChargeRequest5, chargeCallback3, true, anonymousClass1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objInvoke;
                }
                anonymousClass1.L$0 = eglobalBluetoothController2;
                anonymousClass1.L$1 = eglobalChargeRequest3;
                anonymousClass1.L$2 = chargeCallback;
                anonymousClass1.L$3 = connectedDeviceQ8;
                anonymousClass1.label = 3;
                objInvoke = executeKeysInitialSetOfCommands$default(eglobalBluetoothController2, connectedDeviceQ8, false, anonymousClass1, 2, null);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result = (Result) objInvoke;
                if (result instanceof Result.Success) {
                    if (result instanceof Result.Failure) {
                        return result;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                String amount2 = EglobalUtils.INSTANCE.parseAmount(eglobalChargeRequest3.getCom.bbva.notifications.constants.PushConstants.AMOUNT java.lang.String());
                String orderId2 = eglobalChargeRequest3.getOrderId();
                anonymousClass1.L$0 = eglobalBluetoothController2;
                anonymousClass1.L$1 = eglobalChargeRequest3;
                anonymousClass1.L$2 = chargeCallback;
                anonymousClass1.L$3 = connectedDeviceQ8;
                anonymousClass1.label = 4;
                objInvoke = eglobalBluetoothController2.commandInjectionC51(amount2, connectedDeviceQ8, true, orderId2, anonymousClass1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                connectedDeviceQ10 = connectedDeviceQ8;
                chargeCallback4 = chargeCallback;
                eglobalChargeRequest6 = eglobalChargeRequest3;
                eglobalBluetoothController5 = eglobalBluetoothController2;
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.L$3 = null;
                anonymousClass1.label = 5;
                objInvoke = eglobalBluetoothController5.validateChargeFlow(connectedDeviceQ10, eglobalChargeRequest6, (Result) objInvoke, chargeCallback4, anonymousClass1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objInvoke;
            case 1:
                connectedDeviceQ8 = (ConnectedDeviceQ8) anonymousClass1.L$3;
                chargeCallback = (ChargeCallback) anonymousClass1.L$2;
                eglobalChargeRequest2 = (EglobalChargeRequest) anonymousClass1.L$1;
                eglobalBluetoothController = (EglobalBluetoothController) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objInvoke);
                if (((String) objInvoke).length() > 0) {
                    return new Result.Failure(new Error.UninitializedKey(null, 1, null));
                }
                IsMerchantSlotKeyValidatedUseCase isMerchantSlotKeyValidatedUseCase2 = eglobalBluetoothController.isMerchantSlotKeyValidatedUseCase;
                String serial2 = connectedDeviceQ8.getSerial();
                int i13 = Integer.parseInt(connectedDeviceQ8.getSlotKey());
                anonymousClass1.L$0 = eglobalBluetoothController;
                anonymousClass1.L$1 = eglobalChargeRequest2;
                anonymousClass1.L$2 = chargeCallback;
                anonymousClass1.L$3 = connectedDeviceQ8;
                anonymousClass1.label = 2;
                objInvoke = isMerchantSlotKeyValidatedUseCase2.invoke(serial2, i13, anonymousClass1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                eglobalChargeRequest3 = eglobalChargeRequest2;
                eglobalBluetoothController2 = eglobalBluetoothController;
                if (((Boolean) objInvoke).booleanValue()) {
                    String amount3 = EglobalUtils.INSTANCE.parseAmount(eglobalChargeRequest3.getCom.bbva.notifications.constants.PushConstants.AMOUNT java.lang.String());
                    String orderId3 = eglobalChargeRequest3.getOrderId();
                    anonymousClass1.L$0 = chargeCallback;
                    anonymousClass1.L$1 = eglobalBluetoothController2;
                    anonymousClass1.L$2 = connectedDeviceQ8;
                    anonymousClass1.L$3 = eglobalChargeRequest3;
                    anonymousClass1.label = 8;
                    objInvoke = eglobalBluetoothController2.commandInjectionC51(amount3, connectedDeviceQ8, true, orderId3, anonymousClass1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    connectedDeviceQ9 = connectedDeviceQ8;
                    chargeCallback2 = chargeCallback;
                    eglobalChargeRequest4 = eglobalChargeRequest3;
                    eglobalBluetoothController3 = eglobalBluetoothController2;
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.L$2 = null;
                    anonymousClass1.L$3 = null;
                    anonymousClass1.label = 9;
                    objInvoke = eglobalBluetoothController3.validateChargeFlow(connectedDeviceQ9, eglobalChargeRequest4, (Result) objInvoke, chargeCallback2, anonymousClass1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objInvoke;
                }
                if (!eglobalBluetoothController2.isProdEnv) {
                    GetRSAKeysUseCase getRSAKeysUseCase2 = eglobalBluetoothController2.getRSAKeysUseCase;
                    anonymousClass1.L$0 = eglobalBluetoothController2;
                    anonymousClass1.L$1 = eglobalChargeRequest3;
                    anonymousClass1.L$2 = chargeCallback;
                    anonymousClass1.L$3 = null;
                    anonymousClass1.label = 6;
                    objInvoke = getRSAKeysUseCase2.invoke(anonymousClass1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chargeCallback3 = chargeCallback;
                    eglobalChargeRequest5 = eglobalChargeRequest3;
                    eglobalBluetoothController4 = eglobalBluetoothController2;
                    result2 = (Result) objInvoke;
                    if (result2 instanceof Result.Success) {
                        if (result2 instanceof Result.Failure) {
                            return new Result.Failure(((Result.Failure) result2).getError());
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    Object data2 = ((Result.Success) result2).getData();
                    Intrinsics.checkNotNull(data2);
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.L$2 = null;
                    anonymousClass1.label = 7;
                    objInvoke = eglobalBluetoothController4.commandInjectionZ14((List) data2, eglobalChargeRequest5, chargeCallback3, true, anonymousClass1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objInvoke;
                }
                anonymousClass1.L$0 = eglobalBluetoothController2;
                anonymousClass1.L$1 = eglobalChargeRequest3;
                anonymousClass1.L$2 = chargeCallback;
                anonymousClass1.L$3 = connectedDeviceQ8;
                anonymousClass1.label = 3;
                objInvoke = executeKeysInitialSetOfCommands$default(eglobalBluetoothController2, connectedDeviceQ8, false, anonymousClass1, 2, null);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result = (Result) objInvoke;
                if (result instanceof Result.Success) {
                    if (result instanceof Result.Failure) {
                        return result;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                String amount4 = EglobalUtils.INSTANCE.parseAmount(eglobalChargeRequest3.getCom.bbva.notifications.constants.PushConstants.AMOUNT java.lang.String());
                String orderId4 = eglobalChargeRequest3.getOrderId();
                anonymousClass1.L$0 = eglobalBluetoothController2;
                anonymousClass1.L$1 = eglobalChargeRequest3;
                anonymousClass1.L$2 = chargeCallback;
                anonymousClass1.L$3 = connectedDeviceQ8;
                anonymousClass1.label = 4;
                objInvoke = eglobalBluetoothController2.commandInjectionC51(amount4, connectedDeviceQ8, true, orderId4, anonymousClass1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                connectedDeviceQ10 = connectedDeviceQ8;
                chargeCallback4 = chargeCallback;
                eglobalChargeRequest6 = eglobalChargeRequest3;
                eglobalBluetoothController5 = eglobalBluetoothController2;
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.L$3 = null;
                anonymousClass1.label = 5;
                objInvoke = eglobalBluetoothController5.validateChargeFlow(connectedDeviceQ10, eglobalChargeRequest6, (Result) objInvoke, chargeCallback4, anonymousClass1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objInvoke;
            case 2:
                connectedDeviceQ8 = (ConnectedDeviceQ8) anonymousClass1.L$3;
                chargeCallback = (ChargeCallback) anonymousClass1.L$2;
                EglobalChargeRequest eglobalChargeRequest7 = (EglobalChargeRequest) anonymousClass1.L$1;
                EglobalBluetoothController eglobalBluetoothController6 = (EglobalBluetoothController) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objInvoke);
                eglobalChargeRequest3 = eglobalChargeRequest7;
                eglobalBluetoothController2 = eglobalBluetoothController6;
                if (((Boolean) objInvoke).booleanValue()) {
                    String amount5 = EglobalUtils.INSTANCE.parseAmount(eglobalChargeRequest3.getCom.bbva.notifications.constants.PushConstants.AMOUNT java.lang.String());
                    String orderId5 = eglobalChargeRequest3.getOrderId();
                    anonymousClass1.L$0 = chargeCallback;
                    anonymousClass1.L$1 = eglobalBluetoothController2;
                    anonymousClass1.L$2 = connectedDeviceQ8;
                    anonymousClass1.L$3 = eglobalChargeRequest3;
                    anonymousClass1.label = 8;
                    objInvoke = eglobalBluetoothController2.commandInjectionC51(amount5, connectedDeviceQ8, true, orderId5, anonymousClass1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    connectedDeviceQ9 = connectedDeviceQ8;
                    chargeCallback2 = chargeCallback;
                    eglobalChargeRequest4 = eglobalChargeRequest3;
                    eglobalBluetoothController3 = eglobalBluetoothController2;
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.L$2 = null;
                    anonymousClass1.L$3 = null;
                    anonymousClass1.label = 9;
                    objInvoke = eglobalBluetoothController3.validateChargeFlow(connectedDeviceQ9, eglobalChargeRequest4, (Result) objInvoke, chargeCallback2, anonymousClass1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objInvoke;
                }
                if (!eglobalBluetoothController2.isProdEnv) {
                    GetRSAKeysUseCase getRSAKeysUseCase3 = eglobalBluetoothController2.getRSAKeysUseCase;
                    anonymousClass1.L$0 = eglobalBluetoothController2;
                    anonymousClass1.L$1 = eglobalChargeRequest3;
                    anonymousClass1.L$2 = chargeCallback;
                    anonymousClass1.L$3 = null;
                    anonymousClass1.label = 6;
                    objInvoke = getRSAKeysUseCase3.invoke(anonymousClass1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    chargeCallback3 = chargeCallback;
                    eglobalChargeRequest5 = eglobalChargeRequest3;
                    eglobalBluetoothController4 = eglobalBluetoothController2;
                    result2 = (Result) objInvoke;
                    if (result2 instanceof Result.Success) {
                        if (result2 instanceof Result.Failure) {
                            return new Result.Failure(((Result.Failure) result2).getError());
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    Object data3 = ((Result.Success) result2).getData();
                    Intrinsics.checkNotNull(data3);
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.L$2 = null;
                    anonymousClass1.label = 7;
                    objInvoke = eglobalBluetoothController4.commandInjectionZ14((List) data3, eglobalChargeRequest5, chargeCallback3, true, anonymousClass1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objInvoke;
                }
                anonymousClass1.L$0 = eglobalBluetoothController2;
                anonymousClass1.L$1 = eglobalChargeRequest3;
                anonymousClass1.L$2 = chargeCallback;
                anonymousClass1.L$3 = connectedDeviceQ8;
                anonymousClass1.label = 3;
                objInvoke = executeKeysInitialSetOfCommands$default(eglobalBluetoothController2, connectedDeviceQ8, false, anonymousClass1, 2, null);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result = (Result) objInvoke;
                if (result instanceof Result.Success) {
                    if (result instanceof Result.Failure) {
                        return result;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                String amount6 = EglobalUtils.INSTANCE.parseAmount(eglobalChargeRequest3.getCom.bbva.notifications.constants.PushConstants.AMOUNT java.lang.String());
                String orderId6 = eglobalChargeRequest3.getOrderId();
                anonymousClass1.L$0 = eglobalBluetoothController2;
                anonymousClass1.L$1 = eglobalChargeRequest3;
                anonymousClass1.L$2 = chargeCallback;
                anonymousClass1.L$3 = connectedDeviceQ8;
                anonymousClass1.label = 4;
                objInvoke = eglobalBluetoothController2.commandInjectionC51(amount6, connectedDeviceQ8, true, orderId6, anonymousClass1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                connectedDeviceQ10 = connectedDeviceQ8;
                chargeCallback4 = chargeCallback;
                eglobalChargeRequest6 = eglobalChargeRequest3;
                eglobalBluetoothController5 = eglobalBluetoothController2;
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.L$3 = null;
                anonymousClass1.label = 5;
                objInvoke = eglobalBluetoothController5.validateChargeFlow(connectedDeviceQ10, eglobalChargeRequest6, (Result) objInvoke, chargeCallback4, anonymousClass1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objInvoke;
            case 3:
                connectedDeviceQ8 = (ConnectedDeviceQ8) anonymousClass1.L$3;
                chargeCallback = (ChargeCallback) anonymousClass1.L$2;
                EglobalChargeRequest eglobalChargeRequest8 = (EglobalChargeRequest) anonymousClass1.L$1;
                EglobalBluetoothController eglobalBluetoothController7 = (EglobalBluetoothController) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objInvoke);
                eglobalChargeRequest3 = eglobalChargeRequest8;
                eglobalBluetoothController2 = eglobalBluetoothController7;
                result = (Result) objInvoke;
                if (result instanceof Result.Success) {
                    if (result instanceof Result.Failure) {
                        return result;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                String amount7 = EglobalUtils.INSTANCE.parseAmount(eglobalChargeRequest3.getCom.bbva.notifications.constants.PushConstants.AMOUNT java.lang.String());
                String orderId7 = eglobalChargeRequest3.getOrderId();
                anonymousClass1.L$0 = eglobalBluetoothController2;
                anonymousClass1.L$1 = eglobalChargeRequest3;
                anonymousClass1.L$2 = chargeCallback;
                anonymousClass1.L$3 = connectedDeviceQ8;
                anonymousClass1.label = 4;
                objInvoke = eglobalBluetoothController2.commandInjectionC51(amount7, connectedDeviceQ8, true, orderId7, anonymousClass1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                connectedDeviceQ10 = connectedDeviceQ8;
                chargeCallback4 = chargeCallback;
                eglobalChargeRequest6 = eglobalChargeRequest3;
                eglobalBluetoothController5 = eglobalBluetoothController2;
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.L$3 = null;
                anonymousClass1.label = 5;
                objInvoke = eglobalBluetoothController5.validateChargeFlow(connectedDeviceQ10, eglobalChargeRequest6, (Result) objInvoke, chargeCallback4, anonymousClass1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objInvoke;
            case 4:
                ConnectedDeviceQ8 connectedDeviceQ12 = (ConnectedDeviceQ8) anonymousClass1.L$3;
                ChargeCallback chargeCallback5 = (ChargeCallback) anonymousClass1.L$2;
                EglobalChargeRequest eglobalChargeRequest9 = (EglobalChargeRequest) anonymousClass1.L$1;
                EglobalBluetoothController eglobalBluetoothController8 = (EglobalBluetoothController) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objInvoke);
                chargeCallback4 = chargeCallback5;
                eglobalChargeRequest6 = eglobalChargeRequest9;
                eglobalBluetoothController5 = eglobalBluetoothController8;
                connectedDeviceQ10 = connectedDeviceQ12;
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.L$3 = null;
                anonymousClass1.label = 5;
                objInvoke = eglobalBluetoothController5.validateChargeFlow(connectedDeviceQ10, eglobalChargeRequest6, (Result) objInvoke, chargeCallback4, anonymousClass1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objInvoke;
            case 5:
                ResultKt.throwOnFailure(objInvoke);
                return objInvoke;
            case 6:
                ChargeCallback chargeCallback6 = (ChargeCallback) anonymousClass1.L$2;
                EglobalChargeRequest eglobalChargeRequest10 = (EglobalChargeRequest) anonymousClass1.L$1;
                eglobalBluetoothController4 = (EglobalBluetoothController) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objInvoke);
                chargeCallback3 = chargeCallback6;
                eglobalChargeRequest5 = eglobalChargeRequest10;
                result2 = (Result) objInvoke;
                if (result2 instanceof Result.Success) {
                    if (result2 instanceof Result.Failure) {
                        return new Result.Failure(((Result.Failure) result2).getError());
                    }
                    throw new NoWhenBranchMatchedException();
                }
                Object data4 = ((Result.Success) result2).getData();
                Intrinsics.checkNotNull(data4);
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 7;
                objInvoke = eglobalBluetoothController4.commandInjectionZ14((List) data4, eglobalChargeRequest5, chargeCallback3, true, anonymousClass1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objInvoke;
            case 7:
                ResultKt.throwOnFailure(objInvoke);
                return objInvoke;
            case 8:
                EglobalChargeRequest eglobalChargeRequest11 = (EglobalChargeRequest) anonymousClass1.L$3;
                ConnectedDeviceQ8 connectedDeviceQ13 = (ConnectedDeviceQ8) anonymousClass1.L$2;
                eglobalBluetoothController3 = (EglobalBluetoothController) anonymousClass1.L$1;
                ChargeCallback chargeCallback7 = (ChargeCallback) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objInvoke);
                eglobalChargeRequest4 = eglobalChargeRequest11;
                chargeCallback2 = chargeCallback7;
                connectedDeviceQ9 = connectedDeviceQ13;
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.L$3 = null;
                anonymousClass1.label = 9;
                objInvoke = eglobalBluetoothController3.validateChargeFlow(connectedDeviceQ9, eglobalChargeRequest4, (Result) objInvoke, chargeCallback2, anonymousClass1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objInvoke;
            case 9:
                ResultKt.throwOnFailure(objInvoke);
                return objInvoke;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object applyReverse(String str, boolean z10, int i10, Continuation<? super Unit> continuation) {
        C07011 c07011;
        if (continuation instanceof C07011) {
            c07011 = (C07011) continuation;
            int i11 = c07011.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c07011.label = i11 - Integer.MIN_VALUE;
            } else {
                c07011 = new C07011(continuation);
            }
        } else {
            c07011 = new C07011(continuation);
        }
        Object objInvoke = c07011.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i12 = c07011.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            this.transactionFailed = true;
            ConnectedDeviceQ8 connectedDeviceQ8 = this._connectedDevice;
            if (connectedDeviceQ8 != null) {
                ReverseRequest reverseRequest = new ReverseRequest(str, true, null, 4, null);
                if (i10 > 0) {
                    reverseRequest.setReasonReverse(Boxing.boxInt(i10));
                }
                if (!z10 && Integer.parseInt(connectedDeviceQ8.getSlotKey()) == 2) {
                    reverseRequest.setReasonReverse(Boxing.boxInt(40));
                }
                ReverseChargeUseCase reverseChargeUseCase = this.reverseChargeUseCase;
                String serial = connectedDeviceQ8.getSerial();
                c07011.label = 1;
                objInvoke = reverseChargeUseCase.invoke(reverseRequest, serial, c07011);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objInvoke);
        Result result = (Result) objInvoke;
        if (result instanceof Result.Success) {
            Boxing.boxInt(Log.d("applyReverse - SUCCESS", "Reverse applied successfully"));
        } else if (!(result instanceof Result.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object applyReverse$default(EglobalBluetoothController eglobalBluetoothController, String str, boolean z10, int i10, Continuation continuation, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return eglobalBluetoothController.applyReverse(str, z10, i10, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:43:0x0169  */
    /* JADX WARN: Code duplicated, block: B:44:0x016e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0190 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, mx.openpay.library.data.datasource.remote.model.response.TransactionErrorResponseDto] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v9, types: [T, java.lang.Object, java.lang.String] */
    public final Object chargeTerminalOnResponseNoSuccess(CreateCharge createCharge, ConnectedDeviceQ8 connectedDeviceQ8, String str, Continuation<? super Result<Charge>> continuation) {
        C07021 c07021;
        Ref.ObjectRef objectRef;
        CreateCharge createCharge2;
        Ref.ObjectRef objectRef2;
        ConnectedDeviceQ8 connectedDeviceQ9;
        Ref.ObjectRef objectRef3;
        Ref.IntRef intRef;
        Ref.IntRef intRef2;
        EglobalBluetoothController eglobalBluetoothController;
        CreateCharge createCharge3;
        EglobalBluetoothController eglobalBluetoothController2;
        ConnectedDeviceQ8 connectedDeviceQ10;
        EmvTerminalDataResponseDto emvTerminalDataResponse;
        EmvTerminalData emvTerminalDataMapToLocalEmvTerminalData;
        GatewayResponseDto gatewayResponseDto;
        if (continuation instanceof C07021) {
            c07021 = (C07021) continuation;
            int i10 = c07021.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07021.label = i10 - Integer.MIN_VALUE;
            } else {
                c07021 = new C07021(continuation);
            }
        } else {
            c07021 = new C07021(continuation);
        }
        C07021 c07022 = c07021;
        Object obj = c07022.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07022.label;
        if (i11 != 0) {
            if (i11 == 1) {
                objectRef2 = (Ref.ObjectRef) c07022.L$6;
                intRef2 = (Ref.IntRef) c07022.L$5;
                intRef = (Ref.IntRef) c07022.L$4;
                objectRef3 = (Ref.ObjectRef) c07022.L$3;
                connectedDeviceQ9 = (ConnectedDeviceQ8) c07022.L$2;
                createCharge2 = (CreateCharge) c07022.L$1;
                eglobalBluetoothController = (EglobalBluetoothController) c07022.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef2 = (Ref.ObjectRef) c07022.L$2;
                intRef2 = (Ref.IntRef) c07022.L$1;
                intRef = (Ref.IntRef) c07022.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return new Result.Failure(new Error.Server(intRef2.element + "#" + intRef.element + "#" + objectRef2.element));
        }
        ResultKt.throwOnFailure(obj);
        this.transactionFailed = true;
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
                    Intrinsics.checkNotNullExpressionValue(asString, "json[DESCRIPTION_ENTRY].asString");
                    objectRef4.element = asString;
                } else if (jsonObject.has("message")) {
                    ?? asString2 = jsonObject.get("message").getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString2, "json[MESSAGE_ENTRY].asString");
                    objectRef4.element = asString2;
                }
                if (jsonObject.has("transaction")) {
                    ?? FromJson = new Gson().fromJson(jsonObject.get("transaction").getAsJsonObject().toString(), (Class<??>) TransactionErrorResponseDto.class);
                    Intrinsics.checkNotNullExpressionValue(FromJson, "Gson().fromJson(\n       …va,\n                    )");
                    objectRef.element = FromJson;
                }
            }
            createCharge3 = createCharge;
            objectRef2 = objectRef4;
            eglobalBluetoothController2 = this;
            intRef = intRef3;
            intRef2 = intRef4;
            connectedDeviceQ10 = connectedDeviceQ8;
        } catch (Exception unused) {
            c07022.L$0 = this;
            c07022.L$1 = createCharge;
            c07022.L$2 = connectedDeviceQ8;
            c07022.L$3 = objectRef;
            c07022.L$4 = intRef3;
            c07022.L$5 = intRef4;
            c07022.L$6 = objectRef4;
            c07022.label = 1;
            if (reviewChargeServiceResponse(createCharge, null, null, connectedDeviceQ8, null, c07022) == coroutine_suspended) {
                return coroutine_suspended;
            }
            createCharge2 = createCharge;
            objectRef2 = objectRef4;
            connectedDeviceQ9 = connectedDeviceQ8;
            objectRef3 = objectRef;
            intRef = intRef3;
            intRef2 = intRef4;
            eglobalBluetoothController = this;
            objectRef = objectRef3;
            connectedDeviceQ10 = connectedDeviceQ9;
            eglobalBluetoothController2 = eglobalBluetoothController;
            createCharge3 = createCharge2;
        }
        emvTerminalDataResponse = ((TransactionErrorResponseDto) objectRef.element).getGatewayResponseDto().getEmvTerminalDataResponse();
        if (emvTerminalDataResponse != null) {
            emvTerminalDataMapToLocalEmvTerminalData = EmvTerminalDataMapperKt.mapToLocalEmvTerminalData(emvTerminalDataResponse);
        } else {
            emvTerminalDataMapToLocalEmvTerminalData = null;
        }
        gatewayResponseDto = ((TransactionErrorResponseDto) objectRef.element).getGatewayResponseDto();
        c07022.L$0 = intRef;
        c07022.L$1 = intRef2;
        c07022.L$2 = objectRef2;
        c07022.L$3 = null;
        c07022.L$4 = null;
        c07022.L$5 = null;
        c07022.L$6 = null;
        c07022.label = 2;
        if (eglobalBluetoothController2.reviewChargeServiceResponse(createCharge3, null, emvTerminalDataMapToLocalEmvTerminalData, connectedDeviceQ10, gatewayResponseDto, c07022) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return new Result.Failure(new Error.Server(intRef2.element + "#" + intRef.element + "#" + objectRef2.element));
        objectRef = objectRef3;
        connectedDeviceQ10 = connectedDeviceQ9;
        eglobalBluetoothController2 = eglobalBluetoothController;
        createCharge3 = createCharge2;
        emvTerminalDataResponse = ((TransactionErrorResponseDto) objectRef.element).getGatewayResponseDto().getEmvTerminalDataResponse();
        if (emvTerminalDataResponse != null) {
            emvTerminalDataMapToLocalEmvTerminalData = EmvTerminalDataMapperKt.mapToLocalEmvTerminalData(emvTerminalDataResponse);
        } else {
            emvTerminalDataMapToLocalEmvTerminalData = null;
        }
        gatewayResponseDto = ((TransactionErrorResponseDto) objectRef.element).getGatewayResponseDto();
        c07022.L$0 = intRef;
        c07022.L$1 = intRef2;
        c07022.L$2 = objectRef2;
        c07022.L$3 = null;
        c07022.L$4 = null;
        c07022.L$5 = null;
        c07022.L$6 = null;
        c07022.label = 2;
        if (eglobalBluetoothController2.reviewChargeServiceResponse(createCharge3, null, emvTerminalDataMapToLocalEmvTerminalData, connectedDeviceQ10, gatewayResponseDto, c07022) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return new Result.Failure(new Error.Server(intRef2.element + "#" + intRef.element + "#" + objectRef2.element));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object checkNeedToUpdateFirmware(boolean z10, String str, String str2, Continuation<? super Unit> continuation) {
        C07031 c07031;
        EglobalBluetoothController eglobalBluetoothController;
        FirmwareUpdateStatusUseCase firmwareUpdateStatusUseCase;
        FirmwareUpdateStatusRequest firmwareUpdateStatusRequest;
        if (continuation instanceof C07031) {
            c07031 = (C07031) continuation;
            int i10 = c07031.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07031.label = i10 - Integer.MIN_VALUE;
            } else {
                c07031 = new C07031(continuation);
            }
        } else {
            c07031 = new C07031(continuation);
        }
        Object objInvoke = c07031.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07031.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            if (z10) {
                UpdateFirmwareUseCase updateFirmwareUseCase = this.updateFirmwareUseCase;
                c07031.L$0 = this;
                c07031.L$1 = str;
                c07031.L$2 = str2;
                c07031.label = 1;
                objInvoke = updateFirmwareUseCase.invoke(this, c07031);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                eglobalBluetoothController = this;
                if (((Result) objInvoke) instanceof Result.Success) {
                    firmwareUpdateStatusUseCase = eglobalBluetoothController.firmwareUpdateStatusUseCase;
                    if (str == null) {
                        str = "";
                    }
                    firmwareUpdateStatusRequest = new FirmwareUpdateStatusRequest(str, str2);
                    c07031.L$0 = null;
                    c07031.L$1 = null;
                    c07031.L$2 = null;
                    c07031.label = 2;
                    if (firmwareUpdateStatusUseCase.invoke(firmwareUpdateStatusRequest, c07031) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else if (i11 == 1) {
            str2 = (String) c07031.L$2;
            str = (String) c07031.L$1;
            eglobalBluetoothController = (EglobalBluetoothController) c07031.L$0;
            ResultKt.throwOnFailure(objInvoke);
            if (((Result) objInvoke) instanceof Result.Success) {
                firmwareUpdateStatusUseCase = eglobalBluetoothController.firmwareUpdateStatusUseCase;
                if (str == null) {
                    str = "";
                }
                firmwareUpdateStatusRequest = new FirmwareUpdateStatusRequest(str, str2);
                c07031.L$0 = null;
                c07031.L$1 = null;
                c07031.L$2 = null;
                c07031.label = 2;
                if (firmwareUpdateStatusUseCase.invoke(firmwareUpdateStatusRequest, c07031) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object commandInjectionC51(String str, ConnectedDeviceQ8 connectedDeviceQ8, boolean z10, String str2, Continuation<? super Result<C51Response>> continuation) {
        C07041 c07041;
        if (continuation instanceof C07041) {
            c07041 = (C07041) continuation;
            int i10 = c07041.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07041.label = i10 - Integer.MIN_VALUE;
            } else {
                c07041 = new C07041(continuation);
            }
        } else {
            c07041 = new C07041(continuation);
        }
        C07041 c07042 = c07041;
        Object cardC51 = c07042.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07042.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(cardC51);
            String slotKey = connectedDeviceQ8.getSlotKey();
            String slotKeyName = connectedDeviceQ8.getSlotKeyName();
            c07042.label = 1;
            cardC51 = readCardC51(str, z10, slotKey, slotKeyName, "", str2, c07042);
            if (cardC51 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(cardC51);
        }
        Result result = (Result) cardC51;
        if (result instanceof Result.Success) {
            return result;
        }
        if (result instanceof Result.Failure) {
            return new Result.Failure(((Result.Failure) result).getError());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object commandInjectionC54(String str, String str2, String str3, String str4, Continuation<? super Result<C54Response>> continuation) {
        PinPadSdkWrapper pinPadSdkWrapper = this.pinPadSdkWrapper;
        if (pinPadSdkWrapper == null) {
            return new Result.Failure(new Error.OnTerminal(null, 1, null));
        }
        if (!isConnected().getValue().booleanValue()) {
            return new Result.Failure(new Error.TerminalNotConnected(null, 1, null));
        }
        Object objHostResponseC54 = pinPadSdkWrapper.hostResponseC54(str, str2, str3, str4, continuation);
        return objHostResponseC54 == a.getCOROUTINE_SUSPENDED() ? objHostResponseC54 : (Result) objHostResponseC54;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object commandInjectionZ13(String str, Continuation<? super Result<Boolean>> continuation) {
        C07051 c07051;
        if (continuation instanceof C07051) {
            c07051 = (C07051) continuation;
            int i10 = c07051.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07051.label = i10 - Integer.MIN_VALUE;
            } else {
                c07051 = new C07051(continuation);
            }
        } else {
            c07051 = new C07051(continuation);
        }
        Object objValidateRSAKeyZ13 = c07051.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07051.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objValidateRSAKeyZ13);
            c07051.label = 1;
            objValidateRSAKeyZ13 = validateRSAKeyZ13(str, c07051);
            if (objValidateRSAKeyZ13 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objValidateRSAKeyZ13);
        }
        Result result = (Result) objValidateRSAKeyZ13;
        if (result instanceof Result.Success) {
            return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
        }
        if (result instanceof Result.Failure) {
            return new Result.Failure(((Result.Failure) result).getError());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x011a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x011b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0123  */
    /* JADX WARN: Code duplicated, block: B:42:0x0144 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x0145  */
    /* JADX WARN: Code duplicated, block: B:46:0x015e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x0160  */
    /* JADX WARN: Code duplicated, block: B:51:0x0165  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object commandInjectionZ14(List<RSAKey> list, EglobalChargeRequest eglobalChargeRequest, ChargeCallback chargeCallback, boolean z10, Continuation<? super Result<Charge>> continuation) {
        C07061 c07061;
        ConnectedDeviceQ8 connectedDeviceQ8;
        ChargeCallback chargeCallback2;
        boolean z11;
        EglobalBluetoothController eglobalBluetoothController;
        EglobalChargeRequest eglobalChargeRequest2;
        ConnectedDeviceQ8 connectedDeviceQ9;
        boolean z12;
        EglobalBluetoothController eglobalBluetoothController2;
        EglobalChargeRequest eglobalChargeRequest3;
        ChargeCallback chargeCallback3;
        Object objExecuteKeysInitialSetOfCommands$default;
        boolean z13;
        Result result;
        ConnectedDeviceQ8 connectedDeviceQ10;
        ChargeCallback chargeCallback4;
        EglobalChargeRequest eglobalChargeRequest4;
        EglobalBluetoothController eglobalBluetoothController3;
        if (continuation instanceof C07061) {
            c07061 = (C07061) continuation;
            int i10 = c07061.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07061.label = i10 - Integer.MIN_VALUE;
            } else {
                c07061 = new C07061(continuation);
            }
        } else {
            c07061 = new C07061(continuation);
        }
        Object objCommandInjectionC51 = c07061.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07061.label;
        if (i11 != 0) {
            if (i11 == 1) {
                boolean z14 = c07061.Z$0;
                connectedDeviceQ8 = (ConnectedDeviceQ8) c07061.L$3;
                ChargeCallback chargeCallback5 = (ChargeCallback) c07061.L$2;
                eglobalChargeRequest2 = (EglobalChargeRequest) c07061.L$1;
                eglobalBluetoothController = (EglobalBluetoothController) c07061.L$0;
                ResultKt.throwOnFailure(objCommandInjectionC51);
                z11 = z14;
                chargeCallback2 = chargeCallback5;
            } else if (i11 == 2) {
                boolean z15 = c07061.Z$0;
                ConnectedDeviceQ8 connectedDeviceQ11 = (ConnectedDeviceQ8) c07061.L$3;
                ChargeCallback chargeCallback6 = (ChargeCallback) c07061.L$2;
                EglobalChargeRequest eglobalChargeRequest5 = (EglobalChargeRequest) c07061.L$1;
                EglobalBluetoothController eglobalBluetoothController4 = (EglobalBluetoothController) c07061.L$0;
                ResultKt.throwOnFailure(objCommandInjectionC51);
                z12 = z15;
                connectedDeviceQ9 = connectedDeviceQ11;
                chargeCallback3 = chargeCallback6;
                eglobalChargeRequest3 = eglobalChargeRequest5;
                eglobalBluetoothController2 = eglobalBluetoothController4;
                c07061.L$0 = eglobalBluetoothController2;
                c07061.L$1 = eglobalChargeRequest3;
                c07061.L$2 = chargeCallback3;
                c07061.L$3 = connectedDeviceQ9;
                c07061.Z$0 = z12;
                c07061.label = 3;
                objExecuteKeysInitialSetOfCommands$default = executeKeysInitialSetOfCommands$default(eglobalBluetoothController2, connectedDeviceQ9, false, c07061, 2, null);
                if (objExecuteKeysInitialSetOfCommands$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z13 = z12;
                objCommandInjectionC51 = objExecuteKeysInitialSetOfCommands$default;
                result = (Result) objCommandInjectionC51;
                if (!(result instanceof Result.Success)) {
                    if (result instanceof Result.Failure) {
                        return result;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                String amount = EglobalUtils.INSTANCE.parseAmount(eglobalChargeRequest3.getCom.bbva.notifications.constants.PushConstants.AMOUNT java.lang.String());
                String orderId = eglobalChargeRequest3.getOrderId();
                c07061.L$0 = eglobalBluetoothController2;
                c07061.L$1 = eglobalChargeRequest3;
                c07061.L$2 = chargeCallback3;
                c07061.L$3 = connectedDeviceQ9;
                c07061.label = 4;
                objCommandInjectionC51 = eglobalBluetoothController2.commandInjectionC51(amount, connectedDeviceQ9, z13, orderId, c07061);
                if (objCommandInjectionC51 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                connectedDeviceQ10 = connectedDeviceQ9;
                chargeCallback4 = chargeCallback3;
                eglobalChargeRequest4 = eglobalChargeRequest3;
                eglobalBluetoothController3 = eglobalBluetoothController2;
                c07061.L$0 = null;
                c07061.L$1 = null;
                c07061.L$2 = null;
                c07061.L$3 = null;
                c07061.label = 5;
                objCommandInjectionC51 = eglobalBluetoothController3.validateChargeFlow(connectedDeviceQ10, eglobalChargeRequest4, (Result) objCommandInjectionC51, chargeCallback4, c07061);
                if (objCommandInjectionC51 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i11 == 3) {
                boolean z16 = c07061.Z$0;
                ConnectedDeviceQ8 connectedDeviceQ12 = (ConnectedDeviceQ8) c07061.L$3;
                ChargeCallback chargeCallback7 = (ChargeCallback) c07061.L$2;
                EglobalChargeRequest eglobalChargeRequest6 = (EglobalChargeRequest) c07061.L$1;
                EglobalBluetoothController eglobalBluetoothController5 = (EglobalBluetoothController) c07061.L$0;
                ResultKt.throwOnFailure(objCommandInjectionC51);
                connectedDeviceQ9 = connectedDeviceQ12;
                chargeCallback3 = chargeCallback7;
                eglobalChargeRequest3 = eglobalChargeRequest6;
                eglobalBluetoothController2 = eglobalBluetoothController5;
                z13 = z16;
                result = (Result) objCommandInjectionC51;
                if (!(result instanceof Result.Success)) {
                    if (result instanceof Result.Failure) {
                        return result;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                String amount2 = EglobalUtils.INSTANCE.parseAmount(eglobalChargeRequest3.getCom.bbva.notifications.constants.PushConstants.AMOUNT java.lang.String());
                String orderId2 = eglobalChargeRequest3.getOrderId();
                c07061.L$0 = eglobalBluetoothController2;
                c07061.L$1 = eglobalChargeRequest3;
                c07061.L$2 = chargeCallback3;
                c07061.L$3 = connectedDeviceQ9;
                c07061.label = 4;
                objCommandInjectionC51 = eglobalBluetoothController2.commandInjectionC51(amount2, connectedDeviceQ9, z13, orderId2, c07061);
                if (objCommandInjectionC51 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                connectedDeviceQ10 = connectedDeviceQ9;
                chargeCallback4 = chargeCallback3;
                eglobalChargeRequest4 = eglobalChargeRequest3;
                eglobalBluetoothController3 = eglobalBluetoothController2;
                c07061.L$0 = null;
                c07061.L$1 = null;
                c07061.L$2 = null;
                c07061.L$3 = null;
                c07061.label = 5;
                objCommandInjectionC51 = eglobalBluetoothController3.validateChargeFlow(connectedDeviceQ10, eglobalChargeRequest4, (Result) objCommandInjectionC51, chargeCallback4, c07061);
                if (objCommandInjectionC51 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i11 == 4) {
                ConnectedDeviceQ8 connectedDeviceQ13 = (ConnectedDeviceQ8) c07061.L$3;
                ChargeCallback chargeCallback8 = (ChargeCallback) c07061.L$2;
                eglobalChargeRequest4 = (EglobalChargeRequest) c07061.L$1;
                EglobalBluetoothController eglobalBluetoothController6 = (EglobalBluetoothController) c07061.L$0;
                ResultKt.throwOnFailure(objCommandInjectionC51);
                chargeCallback4 = chargeCallback8;
                connectedDeviceQ10 = connectedDeviceQ13;
                eglobalBluetoothController3 = eglobalBluetoothController6;
                c07061.L$0 = null;
                c07061.L$1 = null;
                c07061.L$2 = null;
                c07061.L$3 = null;
                c07061.label = 5;
                objCommandInjectionC51 = eglobalBluetoothController3.validateChargeFlow(connectedDeviceQ10, eglobalChargeRequest4, (Result) objCommandInjectionC51, chargeCallback4, c07061);
                if (objCommandInjectionC51 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCommandInjectionC51);
            }
            return objCommandInjectionC51;
        }
        ResultKt.throwOnFailure(objCommandInjectionC51);
        connectedDeviceQ8 = this._connectedDevice;
        if (connectedDeviceQ8 == null) {
            return new Result.Failure(new Error.TerminalNotConnected(null, 1, null));
        }
        c07061.L$0 = this;
        c07061.L$1 = eglobalChargeRequest;
        chargeCallback2 = chargeCallback;
        c07061.L$2 = chargeCallback2;
        c07061.L$3 = connectedDeviceQ8;
        z11 = z10;
        c07061.Z$0 = z11;
        c07061.label = 1;
        Object objInjectRSAKeyZ14 = injectRSAKeyZ14(list, c07061);
        if (objInjectRSAKeyZ14 == coroutine_suspended) {
            return coroutine_suspended;
        }
        eglobalBluetoothController = this;
        eglobalChargeRequest2 = eglobalChargeRequest;
        objCommandInjectionC51 = objInjectRSAKeyZ14;
        Result result2 = (Result) objCommandInjectionC51;
        if (!(result2 instanceof Result.Success)) {
            if (result2 instanceof Result.Failure) {
                return new Result.Failure(((Result.Failure) result2).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
        UpdateMerchantSlotKeyInjectedBySlotUseCase updateMerchantSlotKeyInjectedBySlotUseCase = eglobalBluetoothController.updateMerchantSlotKeyInjectedBySlotUseCase;
        int i12 = Integer.parseInt(connectedDeviceQ8.getSlotKey());
        String serial = connectedDeviceQ8.getSerial();
        c07061.L$0 = eglobalBluetoothController;
        c07061.L$1 = eglobalChargeRequest2;
        c07061.L$2 = chargeCallback2;
        c07061.L$3 = connectedDeviceQ8;
        c07061.Z$0 = z11;
        c07061.label = 2;
        if (updateMerchantSlotKeyInjectedBySlotUseCase.invoke(i12, serial, 1, c07061) == coroutine_suspended) {
            return coroutine_suspended;
        }
        connectedDeviceQ9 = connectedDeviceQ8;
        z12 = z11;
        eglobalBluetoothController2 = eglobalBluetoothController;
        eglobalChargeRequest3 = eglobalChargeRequest2;
        chargeCallback3 = chargeCallback2;
        c07061.L$0 = eglobalBluetoothController2;
        c07061.L$1 = eglobalChargeRequest3;
        c07061.L$2 = chargeCallback3;
        c07061.L$3 = connectedDeviceQ9;
        c07061.Z$0 = z12;
        c07061.label = 3;
        objExecuteKeysInitialSetOfCommands$default = executeKeysInitialSetOfCommands$default(eglobalBluetoothController2, connectedDeviceQ9, false, c07061, 2, null);
        if (objExecuteKeysInitialSetOfCommands$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        z13 = z12;
        objCommandInjectionC51 = objExecuteKeysInitialSetOfCommands$default;
        result = (Result) objCommandInjectionC51;
        if (!(result instanceof Result.Success)) {
            if (result instanceof Result.Failure) {
                return result;
            }
            throw new NoWhenBranchMatchedException();
        }
        String amount3 = EglobalUtils.INSTANCE.parseAmount(eglobalChargeRequest3.getCom.bbva.notifications.constants.PushConstants.AMOUNT java.lang.String());
        String orderId3 = eglobalChargeRequest3.getOrderId();
        c07061.L$0 = eglobalBluetoothController2;
        c07061.L$1 = eglobalChargeRequest3;
        c07061.L$2 = chargeCallback3;
        c07061.L$3 = connectedDeviceQ9;
        c07061.label = 4;
        objCommandInjectionC51 = eglobalBluetoothController2.commandInjectionC51(amount3, connectedDeviceQ9, z13, orderId3, c07061);
        if (objCommandInjectionC51 == coroutine_suspended) {
            return coroutine_suspended;
        }
        connectedDeviceQ10 = connectedDeviceQ9;
        chargeCallback4 = chargeCallback3;
        eglobalChargeRequest4 = eglobalChargeRequest3;
        eglobalBluetoothController3 = eglobalBluetoothController2;
        c07061.L$0 = null;
        c07061.L$1 = null;
        c07061.L$2 = null;
        c07061.L$3 = null;
        c07061.label = 5;
        objCommandInjectionC51 = eglobalBluetoothController3.validateChargeFlow(connectedDeviceQ10, eglobalChargeRequest4, (Result) objCommandInjectionC51, chargeCallback4, c07061);
        if (objCommandInjectionC51 == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objCommandInjectionC51;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00dc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00dd A[PHI: r15
      0x00dd: PHI (r15v16 java.lang.Object) = (r15v15 java.lang.Object), (r15v1 java.lang.Object) binds: [B:34:0x00da, B:18:0x0050] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00de  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:43:0x0103 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x0104 A[PHI: r15
      0x0104: PHI (r15v17 java.lang.Object) = (r15v13 java.lang.Object), (r15v1 java.lang.Object) binds: [B:42:0x0101, B:17:0x004b] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0105  */
    /* JADX WARN: Code duplicated, block: B:58:0x0131 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x0146 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x016b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x0182 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x018b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object executeCharge(CreateCharge createCharge, Continuation<? super Result<Charge>> continuation) {
        C07101 c07101;
        ConnectedDeviceQ8 connectedDeviceQ8;
        Object obj;
        CreateCharge createCharge2;
        EglobalBluetoothController eglobalBluetoothController;
        Result result;
        Result.Failure failure;
        Error error;
        String orderId;
        String orderId2;
        Charge charge;
        String id;
        ConnectedDeviceQ8 connectedDeviceQ9;
        Charge charge2;
        CreateCharge createCharge3;
        EglobalBluetoothController eglobalBluetoothController2;
        EglobalBluetoothController eglobalBluetoothController3;
        GatewayResponseDto gatewayResponseDto;
        if (continuation instanceof C07101) {
            c07101 = (C07101) continuation;
            int i10 = c07101.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07101.label = i10 - Integer.MIN_VALUE;
            } else {
                c07101 = new C07101(continuation);
            }
        } else {
            c07101 = new C07101(continuation);
        }
        Object objChargeTerminalOnResponseNoSuccess = c07101.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        switch (c07101.label) {
            case 0:
                ResultKt.throwOnFailure(objChargeTerminalOnResponseNoSuccess);
                connectedDeviceQ8 = this._connectedDevice;
                if (connectedDeviceQ8 == null) {
                    return new Result.Failure(new Error.TerminalNotConnected(null, 1, null));
                }
                CreateChargeUseCase createChargeUseCase = this.createChargeUseCase;
                String serial = connectedDeviceQ8.getSerial();
                c07101.L$0 = this;
                c07101.L$1 = createCharge;
                c07101.L$2 = connectedDeviceQ8;
                c07101.label = 1;
                Object objInvoke = createChargeUseCase.invoke(serial, createCharge, false, c07101);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = objInvoke;
                createCharge2 = createCharge;
                eglobalBluetoothController = this;
                result = (Result) obj;
                if (result instanceof Result.Success) {
                    charge = (Charge) mx.openpay.library.domain.util.ResultKt.getSuccessData(result);
                    id = charge.getId();
                    c07101.L$0 = eglobalBluetoothController;
                    c07101.L$1 = createCharge2;
                    c07101.L$2 = connectedDeviceQ8;
                    c07101.L$3 = charge;
                    c07101.label = 2;
                    if (eglobalBluetoothController.validateIfExistsTransactionData(createCharge2, id, c07101) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    connectedDeviceQ9 = connectedDeviceQ8;
                    charge2 = charge;
                    createCharge3 = createCharge2;
                    eglobalBluetoothController2 = eglobalBluetoothController;
                    EmvTerminalData emvTerminalData = charge2.getEmvTerminalData();
                    c07101.L$0 = null;
                    c07101.L$1 = null;
                    c07101.L$2 = null;
                    c07101.L$3 = null;
                    c07101.label = 3;
                    objChargeTerminalOnResponseNoSuccess = eglobalBluetoothController2.reviewChargeServiceResponse(createCharge3, charge2, emvTerminalData, connectedDeviceQ9, null, c07101);
                    if (objChargeTerminalOnResponseNoSuccess == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objChargeTerminalOnResponseNoSuccess;
                }
                if (result instanceof Result.Failure) {
                    throw new NoWhenBranchMatchedException();
                }
                failure = (Result.Failure) result;
                error = failure.getError();
                if (error instanceof Error.Server) {
                    String errorBody = failure.getError().getErrorBody();
                    c07101.L$0 = null;
                    c07101.L$1 = null;
                    c07101.L$2 = null;
                    c07101.label = 4;
                    objChargeTerminalOnResponseNoSuccess = eglobalBluetoothController.chargeTerminalOnResponseNoSuccess(createCharge2, connectedDeviceQ8, errorBody, c07101);
                    if (objChargeTerminalOnResponseNoSuccess == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objChargeTerminalOnResponseNoSuccess;
                }
                if ((error instanceof Error.TimeOut) || (error instanceof Error.BadGateway) || (error instanceof Error.ServiceUnavailable) || (error instanceof Error.InternalServer)) {
                    orderId = createCharge2.getOrderId();
                    c07101.L$0 = eglobalBluetoothController;
                    c07101.L$1 = null;
                    c07101.L$2 = null;
                    c07101.label = 5;
                    if (applyReverse$default(eglobalBluetoothController, orderId, true, 0, c07101, 4, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    eglobalBluetoothController3 = eglobalBluetoothController;
                    c07101.L$0 = null;
                    c07101.label = 6;
                    if (eglobalBluetoothController3.commandInjectionC54("02", "00", EglobalUtils.ISSUER_AUTH_DATA_9100, "", c07101) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return new Result.Failure(new Error.ServerErrors(null, 1, null));
                }
                orderId2 = createCharge2.getOrderId();
                c07101.L$0 = eglobalBluetoothController;
                c07101.L$1 = null;
                c07101.L$2 = null;
                c07101.label = 7;
                if (applyReverse$default(eglobalBluetoothController, orderId2, true, 0, c07101, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                gatewayResponseDto = new GatewayResponseDto(null, null, 3, null);
                eglobalBluetoothController.setTransactionResponseCode(gatewayResponseDto);
                c07101.L$0 = null;
                c07101.label = 8;
                if (eglobalBluetoothController.validateIssuerAuthDataToInjectCommandC54(null, "", gatewayResponseDto, c07101) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return new Result.Failure(Error.TimeOut.INSTANCE);
            case 1:
                ConnectedDeviceQ8 connectedDeviceQ10 = (ConnectedDeviceQ8) c07101.L$2;
                createCharge2 = (CreateCharge) c07101.L$1;
                EglobalBluetoothController eglobalBluetoothController4 = (EglobalBluetoothController) c07101.L$0;
                ResultKt.throwOnFailure(objChargeTerminalOnResponseNoSuccess);
                connectedDeviceQ8 = connectedDeviceQ10;
                eglobalBluetoothController = eglobalBluetoothController4;
                obj = objChargeTerminalOnResponseNoSuccess;
                result = (Result) obj;
                if (result instanceof Result.Success) {
                    charge = (Charge) mx.openpay.library.domain.util.ResultKt.getSuccessData(result);
                    id = charge.getId();
                    c07101.L$0 = eglobalBluetoothController;
                    c07101.L$1 = createCharge2;
                    c07101.L$2 = connectedDeviceQ8;
                    c07101.L$3 = charge;
                    c07101.label = 2;
                    if (eglobalBluetoothController.validateIfExistsTransactionData(createCharge2, id, c07101) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    connectedDeviceQ9 = connectedDeviceQ8;
                    charge2 = charge;
                    createCharge3 = createCharge2;
                    eglobalBluetoothController2 = eglobalBluetoothController;
                    EmvTerminalData emvTerminalData2 = charge2.getEmvTerminalData();
                    c07101.L$0 = null;
                    c07101.L$1 = null;
                    c07101.L$2 = null;
                    c07101.L$3 = null;
                    c07101.label = 3;
                    objChargeTerminalOnResponseNoSuccess = eglobalBluetoothController2.reviewChargeServiceResponse(createCharge3, charge2, emvTerminalData2, connectedDeviceQ9, null, c07101);
                    if (objChargeTerminalOnResponseNoSuccess == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objChargeTerminalOnResponseNoSuccess;
                }
                if (result instanceof Result.Failure) {
                    throw new NoWhenBranchMatchedException();
                }
                failure = (Result.Failure) result;
                error = failure.getError();
                if (error instanceof Error.Server) {
                    String errorBody2 = failure.getError().getErrorBody();
                    c07101.L$0 = null;
                    c07101.L$1 = null;
                    c07101.L$2 = null;
                    c07101.label = 4;
                    objChargeTerminalOnResponseNoSuccess = eglobalBluetoothController.chargeTerminalOnResponseNoSuccess(createCharge2, connectedDeviceQ8, errorBody2, c07101);
                    if (objChargeTerminalOnResponseNoSuccess == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objChargeTerminalOnResponseNoSuccess;
                }
                if (error instanceof Error.TimeOut) {
                    orderId2 = createCharge2.getOrderId();
                    c07101.L$0 = eglobalBluetoothController;
                    c07101.L$1 = null;
                    c07101.L$2 = null;
                    c07101.label = 7;
                    if (applyReverse$default(eglobalBluetoothController, orderId2, true, 0, c07101, 4, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    gatewayResponseDto = new GatewayResponseDto(null, null, 3, null);
                    eglobalBluetoothController.setTransactionResponseCode(gatewayResponseDto);
                    c07101.L$0 = null;
                    c07101.label = 8;
                    if (eglobalBluetoothController.validateIssuerAuthDataToInjectCommandC54(null, "", gatewayResponseDto, c07101) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return new Result.Failure(Error.TimeOut.INSTANCE);
                }
                orderId = createCharge2.getOrderId();
                c07101.L$0 = eglobalBluetoothController;
                c07101.L$1 = null;
                c07101.L$2 = null;
                c07101.label = 5;
                if (applyReverse$default(eglobalBluetoothController, orderId, true, 0, c07101, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                eglobalBluetoothController3 = eglobalBluetoothController;
                c07101.L$0 = null;
                c07101.label = 6;
                if (eglobalBluetoothController3.commandInjectionC54("02", "00", EglobalUtils.ISSUER_AUTH_DATA_9100, "", c07101) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return new Result.Failure(new Error.ServerErrors(null, 1, null));
            case 2:
                Charge charge3 = (Charge) c07101.L$3;
                ConnectedDeviceQ8 connectedDeviceQ11 = (ConnectedDeviceQ8) c07101.L$2;
                createCharge3 = (CreateCharge) c07101.L$1;
                EglobalBluetoothController eglobalBluetoothController5 = (EglobalBluetoothController) c07101.L$0;
                ResultKt.throwOnFailure(objChargeTerminalOnResponseNoSuccess);
                connectedDeviceQ9 = connectedDeviceQ11;
                eglobalBluetoothController2 = eglobalBluetoothController5;
                charge2 = charge3;
                EmvTerminalData emvTerminalData3 = charge2.getEmvTerminalData();
                c07101.L$0 = null;
                c07101.L$1 = null;
                c07101.L$2 = null;
                c07101.L$3 = null;
                c07101.label = 3;
                objChargeTerminalOnResponseNoSuccess = eglobalBluetoothController2.reviewChargeServiceResponse(createCharge3, charge2, emvTerminalData3, connectedDeviceQ9, null, c07101);
                if (objChargeTerminalOnResponseNoSuccess == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objChargeTerminalOnResponseNoSuccess;
            case 3:
                ResultKt.throwOnFailure(objChargeTerminalOnResponseNoSuccess);
                return objChargeTerminalOnResponseNoSuccess;
            case 4:
                ResultKt.throwOnFailure(objChargeTerminalOnResponseNoSuccess);
                return objChargeTerminalOnResponseNoSuccess;
            case 5:
                eglobalBluetoothController = (EglobalBluetoothController) c07101.L$0;
                ResultKt.throwOnFailure(objChargeTerminalOnResponseNoSuccess);
                eglobalBluetoothController3 = eglobalBluetoothController;
                c07101.L$0 = null;
                c07101.label = 6;
                if (eglobalBluetoothController3.commandInjectionC54("02", "00", EglobalUtils.ISSUER_AUTH_DATA_9100, "", c07101) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return new Result.Failure(new Error.ServerErrors(null, 1, null));
            case 6:
                ResultKt.throwOnFailure(objChargeTerminalOnResponseNoSuccess);
                return new Result.Failure(new Error.ServerErrors(null, 1, null));
            case 7:
                eglobalBluetoothController = (EglobalBluetoothController) c07101.L$0;
                ResultKt.throwOnFailure(objChargeTerminalOnResponseNoSuccess);
                gatewayResponseDto = new GatewayResponseDto(null, null, 3, null);
                eglobalBluetoothController.setTransactionResponseCode(gatewayResponseDto);
                c07101.L$0 = null;
                c07101.label = 8;
                if (eglobalBluetoothController.validateIssuerAuthDataToInjectCommandC54(null, "", gatewayResponseDto, c07101) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return new Result.Failure(Error.TimeOut.INSTANCE);
            case 8:
                ResultKt.throwOnFailure(objChargeTerminalOnResponseNoSuccess);
                return new Result.Failure(Error.TimeOut.INSTANCE);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object executeChargeC54Command(String str, String str2, Charge charge, CreateCharge createCharge, GatewayResponseDto gatewayResponseDto, Continuation<? super Result<Charge>> continuation) {
        C07111 c07111;
        EglobalBluetoothController eglobalBluetoothController;
        if (continuation instanceof C07111) {
            c07111 = (C07111) continuation;
            int i10 = c07111.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07111.label = i10 - Integer.MIN_VALUE;
            } else {
                c07111 = new C07111(continuation);
            }
        } else {
            c07111 = new C07111(continuation);
        }
        Object objValidateIssuerAuthDataToInjectCommandC54 = c07111.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07111.label;
        if (i11 != 0) {
            if (i11 == 1) {
                eglobalBluetoothController = (EglobalBluetoothController) c07111.L$2;
                createCharge = (CreateCharge) c07111.L$1;
                charge = (Charge) c07111.L$0;
                ResultKt.throwOnFailure(objValidateIssuerAuthDataToInjectCommandC54);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objValidateIssuerAuthDataToInjectCommandC54);
            }
        }
        ResultKt.throwOnFailure(objValidateIssuerAuthDataToInjectCommandC54);
        c07111.L$0 = charge;
        c07111.L$1 = createCharge;
        c07111.L$2 = this;
        c07111.label = 1;
        objValidateIssuerAuthDataToInjectCommandC54 = validateIssuerAuthDataToInjectCommandC54(str, str2, gatewayResponseDto, c07111);
        if (objValidateIssuerAuthDataToInjectCommandC54 == coroutine_suspended) {
            return coroutine_suspended;
        }
        eglobalBluetoothController = this;
        c07111.L$0 = null;
        c07111.L$1 = null;
        c07111.L$2 = null;
        c07111.label = 2;
        objValidateIssuerAuthDataToInjectCommandC54 = eglobalBluetoothController.manageChargeC54Response((Result) objValidateIssuerAuthDataToInjectCommandC54, charge, createCharge, c07111);
        return objValidateIssuerAuthDataToInjectCommandC54 == coroutine_suspended ? coroutine_suspended : objValidateIssuerAuthDataToInjectCommandC54;
    }

    public static /* synthetic */ Object executeChargeC54Command$default(EglobalBluetoothController eglobalBluetoothController, String str, String str2, Charge charge, CreateCharge createCharge, GatewayResponseDto gatewayResponseDto, Continuation continuation, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            gatewayResponseDto = null;
        }
        return eglobalBluetoothController.executeChargeC54Command(str, str2, charge, createCharge, gatewayResponseDto, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x009e  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae A[PHI: r11
      0x00ae: PHI (r11v12 java.lang.Object) = (r11v11 java.lang.Object), (r11v1 java.lang.Object) binds: [B:34:0x00ab, B:17:0x0043] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00af  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object executeKeysInitialSetOfCommands(ConnectedDeviceQ8 connectedDeviceQ8, boolean z10, Continuation<? super Result<Boolean>> continuation) {
        C07121 c07121;
        EglobalBluetoothController eglobalBluetoothController;
        Object obj;
        ConnectedDeviceQ8 connectedDeviceQ9;
        boolean z11;
        EglobalBluetoothController eglobalBluetoothController2;
        Result result;
        UpdateRenewKeyBySlotAndTerminalUseCase updateRenewKeyBySlotAndTerminalUseCase;
        int i10;
        String serial;
        Result result2;
        PinPadSdkWrapper pinPadSdkWrapper;
        if (continuation instanceof C07121) {
            c07121 = (C07121) continuation;
            int i11 = c07121.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c07121.label = i11 - Integer.MIN_VALUE;
            } else {
                c07121 = new C07121(continuation);
            }
        } else {
            c07121 = new C07121(continuation);
        }
        Object objRequestRandomKeyZ10 = c07121.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i12 = c07121.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objRequestRandomKeyZ10);
            String slotKeyName = connectedDeviceQ8.getSlotKeyName();
            c07121.L$0 = this;
            c07121.L$1 = connectedDeviceQ8;
            c07121.Z$0 = z10;
            c07121.label = 1;
            objRequestRandomKeyZ10 = requestRandomKeyZ10(slotKeyName, z10, c07121);
            if (objRequestRandomKeyZ10 == coroutine_suspended) {
                return coroutine_suspended;
            }
            eglobalBluetoothController = this;
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
                    result2 = (Result) c07121.L$1;
                    eglobalBluetoothController2 = (EglobalBluetoothController) c07121.L$0;
                    ResultKt.throwOnFailure(objRequestRandomKeyZ10);
                    pinPadSdkWrapper = eglobalBluetoothController2.pinPadSdkWrapper;
                    if (pinPadSdkWrapper != null) {
                        pinPadSdkWrapper.clearPendingProcess();
                    }
                    return new Result.Failure(((Result.Failure) result2).getError());
                }
                z11 = c07121.Z$0;
                ConnectedDeviceQ8 connectedDeviceQ10 = (ConnectedDeviceQ8) c07121.L$1;
                eglobalBluetoothController = (EglobalBluetoothController) c07121.L$0;
                ResultKt.throwOnFailure(objRequestRandomKeyZ10);
                obj = objRequestRandomKeyZ10;
                connectedDeviceQ9 = connectedDeviceQ10;
                eglobalBluetoothController2 = eglobalBluetoothController;
                result = (Result) obj;
                if (result instanceof Result.Success) {
                    c07121.L$0 = null;
                    c07121.L$1 = null;
                    c07121.label = 3;
                    objRequestRandomKeyZ10 = eglobalBluetoothController2.executeZ11orZ12(connectedDeviceQ9, (Result.Success) result, z11, c07121);
                    if (objRequestRandomKeyZ10 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objRequestRandomKeyZ10;
                }
                if (result instanceof Result.Failure) {
                    throw new NoWhenBranchMatchedException();
                }
                updateRenewKeyBySlotAndTerminalUseCase = eglobalBluetoothController2.updateRenewKeyBySlotAndTerminalUseCase;
                i10 = Integer.parseInt(connectedDeviceQ9.getSlotKey());
                serial = connectedDeviceQ9.getSerial();
                c07121.L$0 = eglobalBluetoothController2;
                c07121.L$1 = result;
                c07121.label = 4;
                if (updateRenewKeyBySlotAndTerminalUseCase.invoke(2, i10, serial, c07121) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result2 = result;
                pinPadSdkWrapper = eglobalBluetoothController2.pinPadSdkWrapper;
                if (pinPadSdkWrapper != null) {
                    pinPadSdkWrapper.clearPendingProcess();
                }
                return new Result.Failure(((Result.Failure) result2).getError());
            }
            z10 = c07121.Z$0;
            connectedDeviceQ8 = (ConnectedDeviceQ8) c07121.L$1;
            eglobalBluetoothController = (EglobalBluetoothController) c07121.L$0;
            ResultKt.throwOnFailure(objRequestRandomKeyZ10);
        }
        Result<Z10Response> result3 = (Result) objRequestRandomKeyZ10;
        if (!(result3 instanceof Result.Success)) {
            if (result3 instanceof Result.Failure) {
                return new Result.Failure(((Result.Failure) result3).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
        c07121.L$0 = eglobalBluetoothController;
        c07121.L$1 = connectedDeviceQ8;
        c07121.Z$0 = z10;
        c07121.label = 2;
        Object objInitializeKeys = eglobalBluetoothController.initializeKeys(connectedDeviceQ8, result3, c07121);
        if (objInitializeKeys == coroutine_suspended) {
            return coroutine_suspended;
        }
        obj = objInitializeKeys;
        connectedDeviceQ9 = connectedDeviceQ8;
        z11 = z10;
        eglobalBluetoothController2 = eglobalBluetoothController;
        result = (Result) obj;
        if (result instanceof Result.Success) {
            c07121.L$0 = null;
            c07121.L$1 = null;
            c07121.label = 3;
            objRequestRandomKeyZ10 = eglobalBluetoothController2.executeZ11orZ12(connectedDeviceQ9, (Result.Success) result, z11, c07121);
            if (objRequestRandomKeyZ10 == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objRequestRandomKeyZ10;
        }
        if (result instanceof Result.Failure) {
            throw new NoWhenBranchMatchedException();
        }
        updateRenewKeyBySlotAndTerminalUseCase = eglobalBluetoothController2.updateRenewKeyBySlotAndTerminalUseCase;
        i10 = Integer.parseInt(connectedDeviceQ9.getSlotKey());
        serial = connectedDeviceQ9.getSerial();
        c07121.L$0 = eglobalBluetoothController2;
        c07121.L$1 = result;
        c07121.label = 4;
        if (updateRenewKeyBySlotAndTerminalUseCase.invoke(2, i10, serial, c07121) == coroutine_suspended) {
            return coroutine_suspended;
        }
        result2 = result;
        pinPadSdkWrapper = eglobalBluetoothController2.pinPadSdkWrapper;
        if (pinPadSdkWrapper != null) {
            pinPadSdkWrapper.clearPendingProcess();
        }
        return new Result.Failure(((Result.Failure) result2).getError());
    }

    public static /* synthetic */ Object executeKeysInitialSetOfCommands$default(EglobalBluetoothController eglobalBluetoothController, ConnectedDeviceQ8 connectedDeviceQ8, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return eglobalBluetoothController.executeKeysInitialSetOfCommands(connectedDeviceQ8, z10, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00af  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0109  */
    /* JADX WARN: Code duplicated, block: B:57:0x010d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0127 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x0128  */
    /* JADX WARN: Code duplicated, block: B:63:0x0135  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object executeZ11orZ12(ConnectedDeviceQ8 connectedDeviceQ8, Result.Success<TerminalKeysResponse> success, boolean z10, Continuation<? super Result<Boolean>> continuation) {
        C07141 c07141;
        EglobalBluetoothController eglobalBluetoothController;
        EglobalBluetoothController eglobalBluetoothController2;
        Result result;
        UpdateRenewKeyBySlotAndTerminalUseCase updateRenewKeyBySlotAndTerminalUseCase;
        int i10;
        String serial;
        Result result2;
        UpdateRenewKeyBySlotAndTerminalUseCase updateRenewKeyBySlotAndTerminalUseCase2;
        int i11;
        String serial2;
        Result result3;
        UpdateRenewKeyBySlotAndTerminalUseCase updateRenewKeyBySlotAndTerminalUseCase3;
        int i12;
        String serial3;
        if (continuation instanceof C07141) {
            c07141 = (C07141) continuation;
            int i13 = c07141.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c07141.label = i13 - Integer.MIN_VALUE;
            } else {
                c07141 = new C07141(continuation);
            }
        } else {
            c07141 = new C07141(continuation);
        }
        Object objSendInitialKeyZ11 = c07141.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i14 = c07141.label;
        if (i14 != 0) {
            if (i14 == 1) {
                connectedDeviceQ8 = (ConnectedDeviceQ8) c07141.L$1;
                eglobalBluetoothController = (EglobalBluetoothController) c07141.L$0;
                ResultKt.throwOnFailure(objSendInitialKeyZ11);
                result = (Result) objSendInitialKeyZ11;
                if (result instanceof Result.Success) {
                    updateRenewKeyBySlotAndTerminalUseCase2 = eglobalBluetoothController.updateRenewKeyBySlotAndTerminalUseCase;
                    i11 = Integer.parseInt(connectedDeviceQ8.getSlotKey());
                    serial2 = connectedDeviceQ8.getSerial();
                    c07141.L$0 = null;
                    c07141.L$1 = null;
                    c07141.label = 2;
                    if (updateRenewKeyBySlotAndTerminalUseCase2.invoke(0, i11, serial2, c07141) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
                }
                if (result instanceof Result.Failure) {
                    throw new NoWhenBranchMatchedException();
                }
                updateRenewKeyBySlotAndTerminalUseCase = eglobalBluetoothController.updateRenewKeyBySlotAndTerminalUseCase;
                i10 = Integer.parseInt(connectedDeviceQ8.getSlotKey());
                serial = connectedDeviceQ8.getSerial();
                c07141.L$0 = result;
                c07141.L$1 = null;
                c07141.label = 3;
                if (updateRenewKeyBySlotAndTerminalUseCase.invoke(2, i10, serial, c07141) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result2 = result;
                return new Result.Failure(((Result.Failure) result2).getError());
            }
            if (i14 == 2) {
                ResultKt.throwOnFailure(objSendInitialKeyZ11);
                return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
            }
            if (i14 == 3) {
                result2 = (Result) c07141.L$0;
                ResultKt.throwOnFailure(objSendInitialKeyZ11);
                return new Result.Failure(((Result.Failure) result2).getError());
            }
            if (i14 == 4) {
                connectedDeviceQ8 = (ConnectedDeviceQ8) c07141.L$1;
                eglobalBluetoothController2 = (EglobalBluetoothController) c07141.L$0;
                ResultKt.throwOnFailure(objSendInitialKeyZ11);
                result3 = (Result) objSendInitialKeyZ11;
                if (result3 instanceof Result.Success) {
                    if (result3 instanceof Result.Failure) {
                        return new Result.Failure(((Result.Failure) result3).getError());
                    }
                    throw new NoWhenBranchMatchedException();
                }
                updateRenewKeyBySlotAndTerminalUseCase3 = eglobalBluetoothController2.updateRenewKeyBySlotAndTerminalUseCase;
                i12 = Integer.parseInt(connectedDeviceQ8.getSlotKey());
                serial3 = connectedDeviceQ8.getSerial();
                c07141.L$0 = null;
                c07141.L$1 = null;
                c07141.label = 5;
                if (updateRenewKeyBySlotAndTerminalUseCase3.invoke(0, i12, serial3, c07141) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i14 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendInitialKeyZ11);
            }
            return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
        }
        ResultKt.throwOnFailure(objSendInitialKeyZ11);
        if (!this.isProdEnv && !this.isDevCertEnv) {
            String slotKey = connectedDeviceQ8.getSlotKey();
            c07141.L$0 = this;
            c07141.L$1 = connectedDeviceQ8;
            c07141.label = 4;
            objSendInitialKeyZ11 = sendInitialKeyZ12(slotKey, z10, c07141);
            if (objSendInitialKeyZ11 == coroutine_suspended) {
                return coroutine_suspended;
            }
            eglobalBluetoothController2 = this;
            result3 = (Result) objSendInitialKeyZ11;
            if (result3 instanceof Result.Success) {
                if (result3 instanceof Result.Failure) {
                    return new Result.Failure(((Result.Failure) result3).getError());
                }
                throw new NoWhenBranchMatchedException();
            }
            updateRenewKeyBySlotAndTerminalUseCase3 = eglobalBluetoothController2.updateRenewKeyBySlotAndTerminalUseCase;
            i12 = Integer.parseInt(connectedDeviceQ8.getSlotKey());
            serial3 = connectedDeviceQ8.getSerial();
            c07141.L$0 = null;
            c07141.L$1 = null;
            c07141.label = 5;
            if (updateRenewKeyBySlotAndTerminalUseCase3.invoke(0, i12, serial3, c07141) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
        }
        TerminalKeysResponse terminalKeysResponse = (TerminalKeysResponse) mx.openpay.library.domain.util.ResultKt.getSuccessData(success);
        String slotKeyName = connectedDeviceQ8.getSlotKeyName();
        c07141.L$0 = this;
        c07141.L$1 = connectedDeviceQ8;
        c07141.label = 1;
        objSendInitialKeyZ11 = sendInitialKeyZ11(terminalKeysResponse, slotKeyName, z10, c07141);
        if (objSendInitialKeyZ11 == coroutine_suspended) {
            return coroutine_suspended;
        }
        eglobalBluetoothController = this;
        result = (Result) objSendInitialKeyZ11;
        if (result instanceof Result.Success) {
            updateRenewKeyBySlotAndTerminalUseCase2 = eglobalBluetoothController.updateRenewKeyBySlotAndTerminalUseCase;
            i11 = Integer.parseInt(connectedDeviceQ8.getSlotKey());
            serial2 = connectedDeviceQ8.getSerial();
            c07141.L$0 = null;
            c07141.L$1 = null;
            c07141.label = 2;
            if (updateRenewKeyBySlotAndTerminalUseCase2.invoke(0, i11, serial2, c07141) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
        }
        if (result instanceof Result.Failure) {
            throw new NoWhenBranchMatchedException();
        }
        updateRenewKeyBySlotAndTerminalUseCase = eglobalBluetoothController.updateRenewKeyBySlotAndTerminalUseCase;
        i10 = Integer.parseInt(connectedDeviceQ8.getSlotKey());
        serial = connectedDeviceQ8.getSerial();
        c07141.L$0 = result;
        c07141.L$1 = null;
        c07141.label = 3;
        if (updateRenewKeyBySlotAndTerminalUseCase.invoke(2, i10, serial, c07141) == coroutine_suspended) {
            return coroutine_suspended;
        }
        result2 = result;
        return new Result.Failure(((Result.Failure) result2).getError());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x012a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x012b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0134  */
    /* JADX WARN: Code duplicated, block: B:36:0x014f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x0150  */
    /* JADX WARN: Code duplicated, block: B:40:0x0170 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0171  */
    /* JADX WARN: Code duplicated, block: B:44:0x017c  */
    /* JADX WARN: Code duplicated, block: B:46:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:48:0x01be  */
    /* JADX WARN: Code duplicated, block: B:51:0x01d1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x01de  */
    /* JADX WARN: Code duplicated, block: B:56:0x01f1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:60:0x0207 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x020d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0219  */
    /* JADX WARN: Code duplicated, block: B:69:0x0233 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0234  */
    /* JADX WARN: Code duplicated, block: B:73:0x024a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x026b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x027b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x0282  */
    /* JADX WARN: Code duplicated, block: B:82:0x0286  */
    public final Object fetchMerchantInfo(ConnectedDeviceQ8 connectedDeviceQ8, Continuation<? super Result<Merchant>> continuation) {
        C07151 c07151;
        PinPadSdkWrapper pinPadSdkWrapper;
        EglobalBluetoothController eglobalBluetoothController;
        ConnectedDeviceQ8 connectedDeviceQ9;
        String str;
        GetMerchant getMerchant;
        ConnectedDeviceQ8 connectedDeviceQ10;
        PinPadSdkWrapper pinPadSdkWrapper2;
        GetMerchant getMerchant2;
        Result result;
        InsertMerchantDetailsUseCase insertMerchantDetailsUseCase;
        Merchant merchant;
        ConnectedDeviceQ8 connectedDeviceQ11;
        Result result2;
        Object terminalWelcomeText;
        ConnectedDeviceQ8 connectedDeviceQ12;
        boolean updateVersion;
        String firmwareVersion;
        ConnectedDeviceQ8 connectedDeviceQ13;
        String serial;
        EglobalBluetoothController eglobalBluetoothController2;
        EglobalBluetoothController eglobalBluetoothController3;
        ConnectedDeviceQ8 connectedDeviceQ14;
        ConnectedDeviceQ8 connectedDeviceQ15;
        EglobalBluetoothController eglobalBluetoothController4;
        if (continuation instanceof C07151) {
            c07151 = (C07151) continuation;
            int i10 = c07151.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07151.label = i10 - Integer.MIN_VALUE;
            } else {
                c07151 = new C07151(continuation);
            }
        } else {
            c07151 = new C07151(continuation);
        }
        Object objInvoke = c07151.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        switch (c07151.label) {
            case 0:
                ResultKt.throwOnFailure(objInvoke);
                pinPadSdkWrapper = this.pinPadSdkWrapper;
                if (pinPadSdkWrapper != null) {
                    String firmwareVersion2 = connectedDeviceQ8.getFirmwareVersion();
                    GetBinesCountUseCase getBinesCountUseCase = this.getBinesCountUseCase;
                    c07151.L$0 = this;
                    c07151.L$1 = connectedDeviceQ8;
                    c07151.L$2 = pinPadSdkWrapper;
                    c07151.L$3 = firmwareVersion2;
                    c07151.label = 1;
                    Object objInvoke2 = getBinesCountUseCase.invoke(c07151);
                    if (objInvoke2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    eglobalBluetoothController = this;
                    connectedDeviceQ9 = connectedDeviceQ8;
                    str = firmwareVersion2;
                    objInvoke = objInvoke2;
                    getMerchant = new GetMerchant(str, ((Number) objInvoke).intValue(), connectedDeviceQ9.getSerial());
                    GetMerchantUseCase getMerchantUseCase = eglobalBluetoothController.getMerchantUseCase;
                    c07151.L$0 = eglobalBluetoothController;
                    c07151.L$1 = connectedDeviceQ9;
                    c07151.L$2 = pinPadSdkWrapper;
                    c07151.L$3 = getMerchant;
                    c07151.label = 2;
                    objInvoke = getMerchantUseCase.invoke(getMerchant, c07151);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    connectedDeviceQ10 = connectedDeviceQ9;
                    pinPadSdkWrapper2 = pinPadSdkWrapper;
                    getMerchant2 = getMerchant;
                    result = (Result) objInvoke;
                    if (result instanceof Result.Success) {
                        insertMerchantDetailsUseCase = eglobalBluetoothController.insertMerchantDetailsUseCase;
                        merchant = (Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result);
                        c07151.L$0 = eglobalBluetoothController;
                        c07151.L$1 = connectedDeviceQ10;
                        c07151.L$2 = pinPadSdkWrapper2;
                        c07151.L$3 = getMerchant2;
                        c07151.L$4 = result;
                        c07151.label = 3;
                        if (insertMerchantDetailsUseCase.invoke(merchant, connectedDeviceQ10, false, c07151) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        connectedDeviceQ11 = connectedDeviceQ10;
                        result2 = result;
                        String merchantName = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getMerchantName();
                        c07151.L$0 = eglobalBluetoothController;
                        c07151.L$1 = connectedDeviceQ11;
                        c07151.L$2 = getMerchant2;
                        c07151.L$3 = result2;
                        c07151.L$4 = null;
                        c07151.label = 4;
                        terminalWelcomeText = pinPadSdkWrapper2.setTerminalWelcomeText(merchantName, c07151);
                        if (terminalWelcomeText == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        connectedDeviceQ12 = connectedDeviceQ11;
                        objInvoke = terminalWelcomeText;
                        if (mx.openpay.library.domain.util.ResultKt.isSuccess((Result) objInvoke)) {
                            connectedDeviceQ12.setSlotKey(((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getSlotKey().getSlotKey());
                            connectedDeviceQ12.setSlotKeyName(((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getSlotKey().getKeyName());
                            eglobalBluetoothController._connectedDevice = connectedDeviceQ12;
                            updateVersion = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getUpdateVersion();
                            firmwareVersion = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getFirmwareVersion();
                            connectedDeviceQ13 = eglobalBluetoothController._connectedDevice;
                            if (connectedDeviceQ13 != null || (serial = connectedDeviceQ13.getSerial()) == null) {
                                serial = "";
                            }
                            c07151.L$0 = eglobalBluetoothController;
                            c07151.L$1 = connectedDeviceQ12;
                            c07151.L$2 = getMerchant2;
                            c07151.L$3 = result2;
                            c07151.label = 5;
                            if (eglobalBluetoothController.checkNeedToUpdateFirmware(updateVersion, firmwareVersion, serial, c07151) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            GetMerchant getMerchant3 = getMerchant2;
                            eglobalBluetoothController2 = eglobalBluetoothController;
                            if (((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getUpdateBines()) {
                                GetBinesUseCase getBinesUseCase = eglobalBluetoothController2.getBinesUseCase;
                                c07151.L$0 = eglobalBluetoothController2;
                                c07151.L$1 = connectedDeviceQ12;
                                c07151.L$2 = eglobalBluetoothController2;
                                c07151.L$3 = result2;
                                c07151.label = 6;
                                objInvoke = getBinesUseCase.invoke(false, c07151);
                                if (objInvoke == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                eglobalBluetoothController3 = eglobalBluetoothController2;
                                connectedDeviceQ14 = connectedDeviceQ12;
                                c07151.L$0 = eglobalBluetoothController3;
                                c07151.L$1 = connectedDeviceQ14;
                                c07151.L$2 = result2;
                                c07151.L$3 = null;
                                c07151.label = 7;
                                if (eglobalBluetoothController2.validateBinesResponse((Result) objInvoke, c07151) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                connectedDeviceQ15 = connectedDeviceQ14;
                                eglobalBluetoothController4 = eglobalBluetoothController3;
                                connectedDeviceQ12 = connectedDeviceQ15;
                                eglobalBluetoothController2 = eglobalBluetoothController4;
                            } else if (!((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getUpdateBines() && getMerchant3.getBinesCount() == 0) {
                                GetBinesUseCase getBinesUseCase2 = eglobalBluetoothController2.getBinesUseCase;
                                c07151.L$0 = eglobalBluetoothController2;
                                c07151.L$1 = connectedDeviceQ12;
                                c07151.L$2 = eglobalBluetoothController2;
                                c07151.L$3 = result2;
                                c07151.label = 8;
                                objInvoke = getBinesUseCase2.invoke(true, c07151);
                                if (objInvoke == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                eglobalBluetoothController3 = eglobalBluetoothController2;
                                connectedDeviceQ14 = connectedDeviceQ12;
                                c07151.L$0 = eglobalBluetoothController3;
                                c07151.L$1 = connectedDeviceQ14;
                                c07151.L$2 = result2;
                                c07151.L$3 = null;
                                c07151.label = 9;
                                if (eglobalBluetoothController2.validateBinesResponse((Result) objInvoke, c07151) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                connectedDeviceQ15 = connectedDeviceQ14;
                                eglobalBluetoothController4 = eglobalBluetoothController3;
                                connectedDeviceQ12 = connectedDeviceQ15;
                                eglobalBluetoothController2 = eglobalBluetoothController4;
                            }
                            GetRenewKeyBySlotAndTerminalUseCase getRenewKeyBySlotAndTerminalUseCase = eglobalBluetoothController2.getRenewKeyBySlotAndTerminalUseCase;
                            int i11 = Integer.parseInt(connectedDeviceQ12.getSlotKey());
                            String serial2 = connectedDeviceQ12.getSerial();
                            c07151.L$0 = result2;
                            c07151.L$1 = null;
                            c07151.L$2 = null;
                            c07151.L$3 = null;
                            c07151.label = 10;
                            objInvoke = getRenewKeyBySlotAndTerminalUseCase.invoke(i11, serial2, c07151);
                            if (objInvoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            ((Number) objInvoke).intValue();
                            return new Result.Success(mx.openpay.library.domain.util.ResultKt.getSuccessData(result2), null, 2, null);
                        }
                        eglobalBluetoothController.notifyConnectionStatus(false);
                        eglobalBluetoothController.closeConnection();
                    } else if (result instanceof Result.Failure) {
                        eglobalBluetoothController.notifyConnectionStatus(false);
                        eglobalBluetoothController.closeConnection();
                        return new Result.Failure(((Result.Failure) result).getError());
                    }
                }
                return new Result.Failure(new Error.OnTerminal(null, 1, null));
            case 1:
                str = (String) c07151.L$3;
                pinPadSdkWrapper = (PinPadSdkWrapper) c07151.L$2;
                connectedDeviceQ9 = (ConnectedDeviceQ8) c07151.L$1;
                eglobalBluetoothController = (EglobalBluetoothController) c07151.L$0;
                ResultKt.throwOnFailure(objInvoke);
                getMerchant = new GetMerchant(str, ((Number) objInvoke).intValue(), connectedDeviceQ9.getSerial());
                GetMerchantUseCase getMerchantUseCase2 = eglobalBluetoothController.getMerchantUseCase;
                c07151.L$0 = eglobalBluetoothController;
                c07151.L$1 = connectedDeviceQ9;
                c07151.L$2 = pinPadSdkWrapper;
                c07151.L$3 = getMerchant;
                c07151.label = 2;
                objInvoke = getMerchantUseCase2.invoke(getMerchant, c07151);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                connectedDeviceQ10 = connectedDeviceQ9;
                pinPadSdkWrapper2 = pinPadSdkWrapper;
                getMerchant2 = getMerchant;
                result = (Result) objInvoke;
                if (result instanceof Result.Success) {
                    insertMerchantDetailsUseCase = eglobalBluetoothController.insertMerchantDetailsUseCase;
                    merchant = (Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result);
                    c07151.L$0 = eglobalBluetoothController;
                    c07151.L$1 = connectedDeviceQ10;
                    c07151.L$2 = pinPadSdkWrapper2;
                    c07151.L$3 = getMerchant2;
                    c07151.L$4 = result;
                    c07151.label = 3;
                    if (insertMerchantDetailsUseCase.invoke(merchant, connectedDeviceQ10, false, c07151) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    connectedDeviceQ11 = connectedDeviceQ10;
                    result2 = result;
                    String merchantName2 = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getMerchantName();
                    c07151.L$0 = eglobalBluetoothController;
                    c07151.L$1 = connectedDeviceQ11;
                    c07151.L$2 = getMerchant2;
                    c07151.L$3 = result2;
                    c07151.L$4 = null;
                    c07151.label = 4;
                    terminalWelcomeText = pinPadSdkWrapper2.setTerminalWelcomeText(merchantName2, c07151);
                    if (terminalWelcomeText == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    connectedDeviceQ12 = connectedDeviceQ11;
                    objInvoke = terminalWelcomeText;
                    if (mx.openpay.library.domain.util.ResultKt.isSuccess((Result) objInvoke)) {
                        connectedDeviceQ12.setSlotKey(((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getSlotKey().getSlotKey());
                        connectedDeviceQ12.setSlotKeyName(((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getSlotKey().getKeyName());
                        eglobalBluetoothController._connectedDevice = connectedDeviceQ12;
                        updateVersion = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getUpdateVersion();
                        firmwareVersion = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getFirmwareVersion();
                        connectedDeviceQ13 = eglobalBluetoothController._connectedDevice;
                        if (connectedDeviceQ13 != null) {
                            serial = "";
                        } else {
                            serial = "";
                        }
                        c07151.L$0 = eglobalBluetoothController;
                        c07151.L$1 = connectedDeviceQ12;
                        c07151.L$2 = getMerchant2;
                        c07151.L$3 = result2;
                        c07151.label = 5;
                        if (eglobalBluetoothController.checkNeedToUpdateFirmware(updateVersion, firmwareVersion, serial, c07151) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        GetMerchant getMerchant4 = getMerchant2;
                        eglobalBluetoothController2 = eglobalBluetoothController;
                        if (((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getUpdateBines()) {
                            GetBinesUseCase getBinesUseCase3 = eglobalBluetoothController2.getBinesUseCase;
                            c07151.L$0 = eglobalBluetoothController2;
                            c07151.L$1 = connectedDeviceQ12;
                            c07151.L$2 = eglobalBluetoothController2;
                            c07151.L$3 = result2;
                            c07151.label = 6;
                            objInvoke = getBinesUseCase3.invoke(false, c07151);
                            if (objInvoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            eglobalBluetoothController3 = eglobalBluetoothController2;
                            connectedDeviceQ14 = connectedDeviceQ12;
                            c07151.L$0 = eglobalBluetoothController3;
                            c07151.L$1 = connectedDeviceQ14;
                            c07151.L$2 = result2;
                            c07151.L$3 = null;
                            c07151.label = 7;
                            if (eglobalBluetoothController2.validateBinesResponse((Result) objInvoke, c07151) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            connectedDeviceQ15 = connectedDeviceQ14;
                            eglobalBluetoothController4 = eglobalBluetoothController3;
                            connectedDeviceQ12 = connectedDeviceQ15;
                            eglobalBluetoothController2 = eglobalBluetoothController4;
                        } else if (!((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getUpdateBines()) {
                            GetBinesUseCase getBinesUseCase4 = eglobalBluetoothController2.getBinesUseCase;
                            c07151.L$0 = eglobalBluetoothController2;
                            c07151.L$1 = connectedDeviceQ12;
                            c07151.L$2 = eglobalBluetoothController2;
                            c07151.L$3 = result2;
                            c07151.label = 8;
                            objInvoke = getBinesUseCase4.invoke(true, c07151);
                            if (objInvoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            eglobalBluetoothController3 = eglobalBluetoothController2;
                            connectedDeviceQ14 = connectedDeviceQ12;
                            c07151.L$0 = eglobalBluetoothController3;
                            c07151.L$1 = connectedDeviceQ14;
                            c07151.L$2 = result2;
                            c07151.L$3 = null;
                            c07151.label = 9;
                            if (eglobalBluetoothController2.validateBinesResponse((Result) objInvoke, c07151) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            connectedDeviceQ15 = connectedDeviceQ14;
                            eglobalBluetoothController4 = eglobalBluetoothController3;
                            connectedDeviceQ12 = connectedDeviceQ15;
                            eglobalBluetoothController2 = eglobalBluetoothController4;
                        }
                        GetRenewKeyBySlotAndTerminalUseCase getRenewKeyBySlotAndTerminalUseCase2 = eglobalBluetoothController2.getRenewKeyBySlotAndTerminalUseCase;
                        int i12 = Integer.parseInt(connectedDeviceQ12.getSlotKey());
                        String serial3 = connectedDeviceQ12.getSerial();
                        c07151.L$0 = result2;
                        c07151.L$1 = null;
                        c07151.L$2 = null;
                        c07151.L$3 = null;
                        c07151.label = 10;
                        objInvoke = getRenewKeyBySlotAndTerminalUseCase2.invoke(i12, serial3, c07151);
                        if (objInvoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ((Number) objInvoke).intValue();
                        return new Result.Success(mx.openpay.library.domain.util.ResultKt.getSuccessData(result2), null, 2, null);
                    }
                    eglobalBluetoothController.notifyConnectionStatus(false);
                    eglobalBluetoothController.closeConnection();
                } else if (result instanceof Result.Failure) {
                    eglobalBluetoothController.notifyConnectionStatus(false);
                    eglobalBluetoothController.closeConnection();
                    return new Result.Failure(((Result.Failure) result).getError());
                }
                return new Result.Failure(new Error.OnTerminal(null, 1, null));
            case 2:
                GetMerchant getMerchant5 = (GetMerchant) c07151.L$3;
                PinPadSdkWrapper pinPadSdkWrapper3 = (PinPadSdkWrapper) c07151.L$2;
                ConnectedDeviceQ8 connectedDeviceQ16 = (ConnectedDeviceQ8) c07151.L$1;
                eglobalBluetoothController = (EglobalBluetoothController) c07151.L$0;
                ResultKt.throwOnFailure(objInvoke);
                getMerchant2 = getMerchant5;
                connectedDeviceQ10 = connectedDeviceQ16;
                pinPadSdkWrapper2 = pinPadSdkWrapper3;
                result = (Result) objInvoke;
                if (result instanceof Result.Success) {
                    insertMerchantDetailsUseCase = eglobalBluetoothController.insertMerchantDetailsUseCase;
                    merchant = (Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result);
                    c07151.L$0 = eglobalBluetoothController;
                    c07151.L$1 = connectedDeviceQ10;
                    c07151.L$2 = pinPadSdkWrapper2;
                    c07151.L$3 = getMerchant2;
                    c07151.L$4 = result;
                    c07151.label = 3;
                    if (insertMerchantDetailsUseCase.invoke(merchant, connectedDeviceQ10, false, c07151) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    connectedDeviceQ11 = connectedDeviceQ10;
                    result2 = result;
                    String merchantName3 = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getMerchantName();
                    c07151.L$0 = eglobalBluetoothController;
                    c07151.L$1 = connectedDeviceQ11;
                    c07151.L$2 = getMerchant2;
                    c07151.L$3 = result2;
                    c07151.L$4 = null;
                    c07151.label = 4;
                    terminalWelcomeText = pinPadSdkWrapper2.setTerminalWelcomeText(merchantName3, c07151);
                    if (terminalWelcomeText == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    connectedDeviceQ12 = connectedDeviceQ11;
                    objInvoke = terminalWelcomeText;
                    if (mx.openpay.library.domain.util.ResultKt.isSuccess((Result) objInvoke)) {
                        connectedDeviceQ12.setSlotKey(((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getSlotKey().getSlotKey());
                        connectedDeviceQ12.setSlotKeyName(((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getSlotKey().getKeyName());
                        eglobalBluetoothController._connectedDevice = connectedDeviceQ12;
                        updateVersion = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getUpdateVersion();
                        firmwareVersion = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getFirmwareVersion();
                        connectedDeviceQ13 = eglobalBluetoothController._connectedDevice;
                        if (connectedDeviceQ13 != null) {
                            serial = "";
                        } else {
                            serial = "";
                        }
                        c07151.L$0 = eglobalBluetoothController;
                        c07151.L$1 = connectedDeviceQ12;
                        c07151.L$2 = getMerchant2;
                        c07151.L$3 = result2;
                        c07151.label = 5;
                        if (eglobalBluetoothController.checkNeedToUpdateFirmware(updateVersion, firmwareVersion, serial, c07151) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        GetMerchant getMerchant6 = getMerchant2;
                        eglobalBluetoothController2 = eglobalBluetoothController;
                        if (((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getUpdateBines()) {
                            GetBinesUseCase getBinesUseCase5 = eglobalBluetoothController2.getBinesUseCase;
                            c07151.L$0 = eglobalBluetoothController2;
                            c07151.L$1 = connectedDeviceQ12;
                            c07151.L$2 = eglobalBluetoothController2;
                            c07151.L$3 = result2;
                            c07151.label = 6;
                            objInvoke = getBinesUseCase5.invoke(false, c07151);
                            if (objInvoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            eglobalBluetoothController3 = eglobalBluetoothController2;
                            connectedDeviceQ14 = connectedDeviceQ12;
                            c07151.L$0 = eglobalBluetoothController3;
                            c07151.L$1 = connectedDeviceQ14;
                            c07151.L$2 = result2;
                            c07151.L$3 = null;
                            c07151.label = 7;
                            if (eglobalBluetoothController2.validateBinesResponse((Result) objInvoke, c07151) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            connectedDeviceQ15 = connectedDeviceQ14;
                            eglobalBluetoothController4 = eglobalBluetoothController3;
                            connectedDeviceQ12 = connectedDeviceQ15;
                            eglobalBluetoothController2 = eglobalBluetoothController4;
                        } else if (!((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getUpdateBines()) {
                            GetBinesUseCase getBinesUseCase6 = eglobalBluetoothController2.getBinesUseCase;
                            c07151.L$0 = eglobalBluetoothController2;
                            c07151.L$1 = connectedDeviceQ12;
                            c07151.L$2 = eglobalBluetoothController2;
                            c07151.L$3 = result2;
                            c07151.label = 8;
                            objInvoke = getBinesUseCase6.invoke(true, c07151);
                            if (objInvoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            eglobalBluetoothController3 = eglobalBluetoothController2;
                            connectedDeviceQ14 = connectedDeviceQ12;
                            c07151.L$0 = eglobalBluetoothController3;
                            c07151.L$1 = connectedDeviceQ14;
                            c07151.L$2 = result2;
                            c07151.L$3 = null;
                            c07151.label = 9;
                            if (eglobalBluetoothController2.validateBinesResponse((Result) objInvoke, c07151) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            connectedDeviceQ15 = connectedDeviceQ14;
                            eglobalBluetoothController4 = eglobalBluetoothController3;
                            connectedDeviceQ12 = connectedDeviceQ15;
                            eglobalBluetoothController2 = eglobalBluetoothController4;
                        }
                        GetRenewKeyBySlotAndTerminalUseCase getRenewKeyBySlotAndTerminalUseCase3 = eglobalBluetoothController2.getRenewKeyBySlotAndTerminalUseCase;
                        int i13 = Integer.parseInt(connectedDeviceQ12.getSlotKey());
                        String serial4 = connectedDeviceQ12.getSerial();
                        c07151.L$0 = result2;
                        c07151.L$1 = null;
                        c07151.L$2 = null;
                        c07151.L$3 = null;
                        c07151.label = 10;
                        objInvoke = getRenewKeyBySlotAndTerminalUseCase3.invoke(i13, serial4, c07151);
                        if (objInvoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ((Number) objInvoke).intValue();
                        return new Result.Success(mx.openpay.library.domain.util.ResultKt.getSuccessData(result2), null, 2, null);
                    }
                    eglobalBluetoothController.notifyConnectionStatus(false);
                    eglobalBluetoothController.closeConnection();
                } else if (result instanceof Result.Failure) {
                    eglobalBluetoothController.notifyConnectionStatus(false);
                    eglobalBluetoothController.closeConnection();
                    return new Result.Failure(((Result.Failure) result).getError());
                }
                return new Result.Failure(new Error.OnTerminal(null, 1, null));
            case 3:
                result2 = (Result) c07151.L$4;
                getMerchant2 = (GetMerchant) c07151.L$3;
                pinPadSdkWrapper2 = (PinPadSdkWrapper) c07151.L$2;
                ConnectedDeviceQ8 connectedDeviceQ17 = (ConnectedDeviceQ8) c07151.L$1;
                EglobalBluetoothController eglobalBluetoothController5 = (EglobalBluetoothController) c07151.L$0;
                ResultKt.throwOnFailure(objInvoke);
                connectedDeviceQ11 = connectedDeviceQ17;
                eglobalBluetoothController = eglobalBluetoothController5;
                String merchantName4 = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getMerchantName();
                c07151.L$0 = eglobalBluetoothController;
                c07151.L$1 = connectedDeviceQ11;
                c07151.L$2 = getMerchant2;
                c07151.L$3 = result2;
                c07151.L$4 = null;
                c07151.label = 4;
                terminalWelcomeText = pinPadSdkWrapper2.setTerminalWelcomeText(merchantName4, c07151);
                if (terminalWelcomeText == coroutine_suspended) {
                    return coroutine_suspended;
                }
                connectedDeviceQ12 = connectedDeviceQ11;
                objInvoke = terminalWelcomeText;
                if (mx.openpay.library.domain.util.ResultKt.isSuccess((Result) objInvoke)) {
                    eglobalBluetoothController.notifyConnectionStatus(false);
                    eglobalBluetoothController.closeConnection();
                    return new Result.Failure(new Error.OnTerminal(null, 1, null));
                }
                connectedDeviceQ12.setSlotKey(((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getSlotKey().getSlotKey());
                connectedDeviceQ12.setSlotKeyName(((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getSlotKey().getKeyName());
                eglobalBluetoothController._connectedDevice = connectedDeviceQ12;
                updateVersion = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getUpdateVersion();
                firmwareVersion = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getFirmwareVersion();
                connectedDeviceQ13 = eglobalBluetoothController._connectedDevice;
                if (connectedDeviceQ13 != null) {
                    serial = "";
                } else {
                    serial = "";
                }
                c07151.L$0 = eglobalBluetoothController;
                c07151.L$1 = connectedDeviceQ12;
                c07151.L$2 = getMerchant2;
                c07151.L$3 = result2;
                c07151.label = 5;
                if (eglobalBluetoothController.checkNeedToUpdateFirmware(updateVersion, firmwareVersion, serial, c07151) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                GetMerchant getMerchant7 = getMerchant2;
                eglobalBluetoothController2 = eglobalBluetoothController;
                if (((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getUpdateBines()) {
                    GetBinesUseCase getBinesUseCase7 = eglobalBluetoothController2.getBinesUseCase;
                    c07151.L$0 = eglobalBluetoothController2;
                    c07151.L$1 = connectedDeviceQ12;
                    c07151.L$2 = eglobalBluetoothController2;
                    c07151.L$3 = result2;
                    c07151.label = 6;
                    objInvoke = getBinesUseCase7.invoke(false, c07151);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    eglobalBluetoothController3 = eglobalBluetoothController2;
                    connectedDeviceQ14 = connectedDeviceQ12;
                    c07151.L$0 = eglobalBluetoothController3;
                    c07151.L$1 = connectedDeviceQ14;
                    c07151.L$2 = result2;
                    c07151.L$3 = null;
                    c07151.label = 7;
                    if (eglobalBluetoothController2.validateBinesResponse((Result) objInvoke, c07151) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    connectedDeviceQ15 = connectedDeviceQ14;
                    eglobalBluetoothController4 = eglobalBluetoothController3;
                    connectedDeviceQ12 = connectedDeviceQ15;
                    eglobalBluetoothController2 = eglobalBluetoothController4;
                } else if (!((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getUpdateBines()) {
                    GetBinesUseCase getBinesUseCase8 = eglobalBluetoothController2.getBinesUseCase;
                    c07151.L$0 = eglobalBluetoothController2;
                    c07151.L$1 = connectedDeviceQ12;
                    c07151.L$2 = eglobalBluetoothController2;
                    c07151.L$3 = result2;
                    c07151.label = 8;
                    objInvoke = getBinesUseCase8.invoke(true, c07151);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    eglobalBluetoothController3 = eglobalBluetoothController2;
                    connectedDeviceQ14 = connectedDeviceQ12;
                    c07151.L$0 = eglobalBluetoothController3;
                    c07151.L$1 = connectedDeviceQ14;
                    c07151.L$2 = result2;
                    c07151.L$3 = null;
                    c07151.label = 9;
                    if (eglobalBluetoothController2.validateBinesResponse((Result) objInvoke, c07151) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    connectedDeviceQ15 = connectedDeviceQ14;
                    eglobalBluetoothController4 = eglobalBluetoothController3;
                    connectedDeviceQ12 = connectedDeviceQ15;
                    eglobalBluetoothController2 = eglobalBluetoothController4;
                }
                GetRenewKeyBySlotAndTerminalUseCase getRenewKeyBySlotAndTerminalUseCase4 = eglobalBluetoothController2.getRenewKeyBySlotAndTerminalUseCase;
                int i14 = Integer.parseInt(connectedDeviceQ12.getSlotKey());
                String serial5 = connectedDeviceQ12.getSerial();
                c07151.L$0 = result2;
                c07151.L$1 = null;
                c07151.L$2 = null;
                c07151.L$3 = null;
                c07151.label = 10;
                objInvoke = getRenewKeyBySlotAndTerminalUseCase4.invoke(i14, serial5, c07151);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ((Number) objInvoke).intValue();
                return new Result.Success(mx.openpay.library.domain.util.ResultKt.getSuccessData(result2), null, 2, null);
            case 4:
                result2 = (Result) c07151.L$3;
                getMerchant2 = (GetMerchant) c07151.L$2;
                connectedDeviceQ12 = (ConnectedDeviceQ8) c07151.L$1;
                eglobalBluetoothController = (EglobalBluetoothController) c07151.L$0;
                ResultKt.throwOnFailure(objInvoke);
                if (mx.openpay.library.domain.util.ResultKt.isSuccess((Result) objInvoke)) {
                    eglobalBluetoothController.notifyConnectionStatus(false);
                    eglobalBluetoothController.closeConnection();
                    return new Result.Failure(new Error.OnTerminal(null, 1, null));
                }
                connectedDeviceQ12.setSlotKey(((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getSlotKey().getSlotKey());
                connectedDeviceQ12.setSlotKeyName(((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getSlotKey().getKeyName());
                eglobalBluetoothController._connectedDevice = connectedDeviceQ12;
                updateVersion = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getUpdateVersion();
                firmwareVersion = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getFirmwareVersion();
                connectedDeviceQ13 = eglobalBluetoothController._connectedDevice;
                if (connectedDeviceQ13 != null) {
                    serial = "";
                } else {
                    serial = "";
                }
                c07151.L$0 = eglobalBluetoothController;
                c07151.L$1 = connectedDeviceQ12;
                c07151.L$2 = getMerchant2;
                c07151.L$3 = result2;
                c07151.label = 5;
                if (eglobalBluetoothController.checkNeedToUpdateFirmware(updateVersion, firmwareVersion, serial, c07151) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                GetMerchant getMerchant8 = getMerchant2;
                eglobalBluetoothController2 = eglobalBluetoothController;
                if (((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getUpdateBines()) {
                    GetBinesUseCase getBinesUseCase9 = eglobalBluetoothController2.getBinesUseCase;
                    c07151.L$0 = eglobalBluetoothController2;
                    c07151.L$1 = connectedDeviceQ12;
                    c07151.L$2 = eglobalBluetoothController2;
                    c07151.L$3 = result2;
                    c07151.label = 6;
                    objInvoke = getBinesUseCase9.invoke(false, c07151);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    eglobalBluetoothController3 = eglobalBluetoothController2;
                    connectedDeviceQ14 = connectedDeviceQ12;
                    c07151.L$0 = eglobalBluetoothController3;
                    c07151.L$1 = connectedDeviceQ14;
                    c07151.L$2 = result2;
                    c07151.L$3 = null;
                    c07151.label = 7;
                    if (eglobalBluetoothController2.validateBinesResponse((Result) objInvoke, c07151) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    connectedDeviceQ15 = connectedDeviceQ14;
                    eglobalBluetoothController4 = eglobalBluetoothController3;
                    connectedDeviceQ12 = connectedDeviceQ15;
                    eglobalBluetoothController2 = eglobalBluetoothController4;
                } else if (!((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getUpdateBines()) {
                    GetBinesUseCase getBinesUseCase10 = eglobalBluetoothController2.getBinesUseCase;
                    c07151.L$0 = eglobalBluetoothController2;
                    c07151.L$1 = connectedDeviceQ12;
                    c07151.L$2 = eglobalBluetoothController2;
                    c07151.L$3 = result2;
                    c07151.label = 8;
                    objInvoke = getBinesUseCase10.invoke(true, c07151);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    eglobalBluetoothController3 = eglobalBluetoothController2;
                    connectedDeviceQ14 = connectedDeviceQ12;
                    c07151.L$0 = eglobalBluetoothController3;
                    c07151.L$1 = connectedDeviceQ14;
                    c07151.L$2 = result2;
                    c07151.L$3 = null;
                    c07151.label = 9;
                    if (eglobalBluetoothController2.validateBinesResponse((Result) objInvoke, c07151) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    connectedDeviceQ15 = connectedDeviceQ14;
                    eglobalBluetoothController4 = eglobalBluetoothController3;
                    connectedDeviceQ12 = connectedDeviceQ15;
                    eglobalBluetoothController2 = eglobalBluetoothController4;
                }
                GetRenewKeyBySlotAndTerminalUseCase getRenewKeyBySlotAndTerminalUseCase5 = eglobalBluetoothController2.getRenewKeyBySlotAndTerminalUseCase;
                int i15 = Integer.parseInt(connectedDeviceQ12.getSlotKey());
                String serial6 = connectedDeviceQ12.getSerial();
                c07151.L$0 = result2;
                c07151.L$1 = null;
                c07151.L$2 = null;
                c07151.L$3 = null;
                c07151.label = 10;
                objInvoke = getRenewKeyBySlotAndTerminalUseCase5.invoke(i15, serial6, c07151);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ((Number) objInvoke).intValue();
                return new Result.Success(mx.openpay.library.domain.util.ResultKt.getSuccessData(result2), null, 2, null);
            case 5:
                result2 = (Result) c07151.L$3;
                getMerchant2 = (GetMerchant) c07151.L$2;
                connectedDeviceQ12 = (ConnectedDeviceQ8) c07151.L$1;
                eglobalBluetoothController = (EglobalBluetoothController) c07151.L$0;
                ResultKt.throwOnFailure(objInvoke);
                GetMerchant getMerchant9 = getMerchant2;
                eglobalBluetoothController2 = eglobalBluetoothController;
                if (((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getUpdateBines()) {
                    GetBinesUseCase getBinesUseCase11 = eglobalBluetoothController2.getBinesUseCase;
                    c07151.L$0 = eglobalBluetoothController2;
                    c07151.L$1 = connectedDeviceQ12;
                    c07151.L$2 = eglobalBluetoothController2;
                    c07151.L$3 = result2;
                    c07151.label = 6;
                    objInvoke = getBinesUseCase11.invoke(false, c07151);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    eglobalBluetoothController3 = eglobalBluetoothController2;
                    connectedDeviceQ14 = connectedDeviceQ12;
                    c07151.L$0 = eglobalBluetoothController3;
                    c07151.L$1 = connectedDeviceQ14;
                    c07151.L$2 = result2;
                    c07151.L$3 = null;
                    c07151.label = 7;
                    if (eglobalBluetoothController2.validateBinesResponse((Result) objInvoke, c07151) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    connectedDeviceQ15 = connectedDeviceQ14;
                    eglobalBluetoothController4 = eglobalBluetoothController3;
                    connectedDeviceQ12 = connectedDeviceQ15;
                    eglobalBluetoothController2 = eglobalBluetoothController4;
                } else if (!((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2)).getUpdateBines()) {
                    GetBinesUseCase getBinesUseCase12 = eglobalBluetoothController2.getBinesUseCase;
                    c07151.L$0 = eglobalBluetoothController2;
                    c07151.L$1 = connectedDeviceQ12;
                    c07151.L$2 = eglobalBluetoothController2;
                    c07151.L$3 = result2;
                    c07151.label = 8;
                    objInvoke = getBinesUseCase12.invoke(true, c07151);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    eglobalBluetoothController3 = eglobalBluetoothController2;
                    connectedDeviceQ14 = connectedDeviceQ12;
                    c07151.L$0 = eglobalBluetoothController3;
                    c07151.L$1 = connectedDeviceQ14;
                    c07151.L$2 = result2;
                    c07151.L$3 = null;
                    c07151.label = 9;
                    if (eglobalBluetoothController2.validateBinesResponse((Result) objInvoke, c07151) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    connectedDeviceQ15 = connectedDeviceQ14;
                    eglobalBluetoothController4 = eglobalBluetoothController3;
                    connectedDeviceQ12 = connectedDeviceQ15;
                    eglobalBluetoothController2 = eglobalBluetoothController4;
                }
                GetRenewKeyBySlotAndTerminalUseCase getRenewKeyBySlotAndTerminalUseCase6 = eglobalBluetoothController2.getRenewKeyBySlotAndTerminalUseCase;
                int i16 = Integer.parseInt(connectedDeviceQ12.getSlotKey());
                String serial7 = connectedDeviceQ12.getSerial();
                c07151.L$0 = result2;
                c07151.L$1 = null;
                c07151.L$2 = null;
                c07151.L$3 = null;
                c07151.label = 10;
                objInvoke = getRenewKeyBySlotAndTerminalUseCase6.invoke(i16, serial7, c07151);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ((Number) objInvoke).intValue();
                return new Result.Success(mx.openpay.library.domain.util.ResultKt.getSuccessData(result2), null, 2, null);
            case 6:
                result2 = (Result) c07151.L$3;
                eglobalBluetoothController2 = (EglobalBluetoothController) c07151.L$2;
                connectedDeviceQ14 = (ConnectedDeviceQ8) c07151.L$1;
                eglobalBluetoothController3 = (EglobalBluetoothController) c07151.L$0;
                ResultKt.throwOnFailure(objInvoke);
                c07151.L$0 = eglobalBluetoothController3;
                c07151.L$1 = connectedDeviceQ14;
                c07151.L$2 = result2;
                c07151.L$3 = null;
                c07151.label = 7;
                if (eglobalBluetoothController2.validateBinesResponse((Result) objInvoke, c07151) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                connectedDeviceQ15 = connectedDeviceQ14;
                eglobalBluetoothController4 = eglobalBluetoothController3;
                connectedDeviceQ12 = connectedDeviceQ15;
                eglobalBluetoothController2 = eglobalBluetoothController4;
                GetRenewKeyBySlotAndTerminalUseCase getRenewKeyBySlotAndTerminalUseCase7 = eglobalBluetoothController2.getRenewKeyBySlotAndTerminalUseCase;
                int i17 = Integer.parseInt(connectedDeviceQ12.getSlotKey());
                String serial8 = connectedDeviceQ12.getSerial();
                c07151.L$0 = result2;
                c07151.L$1 = null;
                c07151.L$2 = null;
                c07151.L$3 = null;
                c07151.label = 10;
                objInvoke = getRenewKeyBySlotAndTerminalUseCase7.invoke(i17, serial8, c07151);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ((Number) objInvoke).intValue();
                return new Result.Success(mx.openpay.library.domain.util.ResultKt.getSuccessData(result2), null, 2, null);
            case 7:
            case 9:
                result2 = (Result) c07151.L$2;
                connectedDeviceQ15 = (ConnectedDeviceQ8) c07151.L$1;
                eglobalBluetoothController4 = (EglobalBluetoothController) c07151.L$0;
                ResultKt.throwOnFailure(objInvoke);
                connectedDeviceQ12 = connectedDeviceQ15;
                eglobalBluetoothController2 = eglobalBluetoothController4;
                GetRenewKeyBySlotAndTerminalUseCase getRenewKeyBySlotAndTerminalUseCase8 = eglobalBluetoothController2.getRenewKeyBySlotAndTerminalUseCase;
                int i18 = Integer.parseInt(connectedDeviceQ12.getSlotKey());
                String serial9 = connectedDeviceQ12.getSerial();
                c07151.L$0 = result2;
                c07151.L$1 = null;
                c07151.L$2 = null;
                c07151.L$3 = null;
                c07151.label = 10;
                objInvoke = getRenewKeyBySlotAndTerminalUseCase8.invoke(i18, serial9, c07151);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ((Number) objInvoke).intValue();
                return new Result.Success(mx.openpay.library.domain.util.ResultKt.getSuccessData(result2), null, 2, null);
            case 8:
                result2 = (Result) c07151.L$3;
                eglobalBluetoothController2 = (EglobalBluetoothController) c07151.L$2;
                connectedDeviceQ14 = (ConnectedDeviceQ8) c07151.L$1;
                eglobalBluetoothController3 = (EglobalBluetoothController) c07151.L$0;
                ResultKt.throwOnFailure(objInvoke);
                c07151.L$0 = eglobalBluetoothController3;
                c07151.L$1 = connectedDeviceQ14;
                c07151.L$2 = result2;
                c07151.L$3 = null;
                c07151.label = 9;
                if (eglobalBluetoothController2.validateBinesResponse((Result) objInvoke, c07151) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                connectedDeviceQ15 = connectedDeviceQ14;
                eglobalBluetoothController4 = eglobalBluetoothController3;
                connectedDeviceQ12 = connectedDeviceQ15;
                eglobalBluetoothController2 = eglobalBluetoothController4;
                GetRenewKeyBySlotAndTerminalUseCase getRenewKeyBySlotAndTerminalUseCase9 = eglobalBluetoothController2.getRenewKeyBySlotAndTerminalUseCase;
                int i19 = Integer.parseInt(connectedDeviceQ12.getSlotKey());
                String serial10 = connectedDeviceQ12.getSerial();
                c07151.L$0 = result2;
                c07151.L$1 = null;
                c07151.L$2 = null;
                c07151.L$3 = null;
                c07151.label = 10;
                objInvoke = getRenewKeyBySlotAndTerminalUseCase9.invoke(i19, serial10, c07151);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ((Number) objInvoke).intValue();
                return new Result.Success(mx.openpay.library.domain.util.ResultKt.getSuccessData(result2), null, 2, null);
            case 10:
                result2 = (Result) c07151.L$0;
                ResultKt.throwOnFailure(objInvoke);
                ((Number) objInvoke).intValue();
                return new Result.Success(mx.openpay.library.domain.util.ResultKt.getSuccessData(result2), null, 2, null);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BluetoothAdapter getBluetoothAdapter() {
        return (BluetoothAdapter) this.bluetoothAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BluetoothManager getBluetoothManager() {
        return (BluetoothManager) this.bluetoothManager.getValue();
    }

    @SuppressLint({"MissingPermission"})
    private final Location getLocationOfDevice() {
        Object systemService = this.context.getSystemService("location");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        if (locationManager.isProviderEnabled("gps")) {
            return locationManager.getLastKnownLocation("gps");
        }
        return null;
    }

    private final boolean hasPermission(String permission) {
        return this.context.checkSelfPermission(permission) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object initializeKeys(ConnectedDeviceQ8 connectedDeviceQ8, Result<Z10Response> result, Continuation<? super Result<TerminalKeysResponse>> continuation) {
        return this.initializeKeysUseCase.invoke(connectedDeviceQ8.getSerial(), new TerminalKeysRequest(((Z10Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result)).getTokenEs(), ((Z10Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result)).getTokenEw(), connectedDeviceQ8.getSlotKey()), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x006e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0085  */
    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0085 -> B:25:0x0086). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object injectRSAKeyZ14(java.util.List<mx.openpay.library.domain.model.eglobal.RSAKey> r9, kotlin.coroutines.Continuation<? super mx.openpay.library.domain.util.Result<mx.openpay.library.data.bluetooth.eglobal.model.Z14Response>> r10) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mx.openpay.library.data.bluetooth.eglobal.EglobalBluetoothController.injectRSAKeyZ14(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object injectScripts(String[] strArr, Continuation<? super Result<InjectScriptsResponse>> continuation) {
        C07171 c07171;
        PinPadSdkWrapper pinPadSdkWrapper;
        if (continuation instanceof C07171) {
            c07171 = (C07171) continuation;
            int i10 = c07171.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07171.label = i10 - Integer.MIN_VALUE;
            } else {
                c07171 = new C07171(continuation);
            }
        } else {
            c07171 = new C07171(continuation);
        }
        Object obj = c07171.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07171.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            PinPadSdkWrapper pinPadSdkWrapper2 = this.pinPadSdkWrapper;
            if (pinPadSdkWrapper2 == null) {
                return new Result.Failure(new Error.OnTerminal(null, 1, null));
            }
            if (!isConnected().getValue().booleanValue()) {
                return new Result.Failure(new Error.TerminalNotConnected(null, 1, null));
            }
            c07171.L$0 = pinPadSdkWrapper2;
            c07171.label = 1;
            Object objInjectScripts = pinPadSdkWrapper2.injectScripts(strArr, c07171);
            if (objInjectScripts == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objInjectScripts;
            pinPadSdkWrapper = pinPadSdkWrapper2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pinPadSdkWrapper = (PinPadSdkWrapper) c07171.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Result result = (Result) obj;
        if (result instanceof Result.Success) {
            return new Result.Success(mx.openpay.library.domain.util.ResultKt.getSuccessData(result), null, 2, null);
        }
        if (!(result instanceof Result.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        pinPadSdkWrapper.clearPendingProcess();
        return new Result.Failure(((Result.Failure) result).getError());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAValidDevice(String deviceName) {
        if (deviceName == null) {
            return false;
        }
        String lowerCase = deviceName.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (lowerCase != null) {
            return StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) EglobalUtils.DEVICE_PAX, false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) EglobalUtils.DEVICE_BBVA, false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) EglobalUtils.DEVICE_OPENPAY, false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) EglobalUtils.DEVICE_VIERGE, false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) EglobalUtils.DEVICE_INBURSA, false, 2, (Object) null);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    /* JADX WARN: Code duplicated, block: B:30:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object manageChargeC54Response(Result<C54Response> result, Charge charge, CreateCharge createCharge, Continuation<? super Result<Charge>> continuation) {
        C07191 c07191;
        Result result2;
        if (continuation instanceof C07191) {
            c07191 = (C07191) continuation;
            int i10 = c07191.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07191.label = i10 - Integer.MIN_VALUE;
            } else {
                c07191 = new C07191(continuation);
            }
        } else {
            c07191 = new C07191(continuation);
        }
        Object objValidateE2exists = c07191.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07191.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(objValidateE2exists);
                    return new Result.Failure(new Error.CardRetired(null, 1, null));
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objValidateE2exists);
                return new Result.Failure(new Error.OnTerminal(null, 1, null));
            }
            charge = (Charge) c07191.L$0;
            ResultKt.throwOnFailure(objValidateE2exists);
            result2 = (Result) objValidateE2exists;
            if (result2 instanceof Result.Success) {
                return new Result.Success(charge, ProcessingStep.PROCESSED_STEP);
            }
            if (result2 instanceof Result.Failure) {
                return new Result.Failure(((Result.Failure) result2).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
        ResultKt.throwOnFailure(objValidateE2exists);
        if (result instanceof Result.Success) {
            C54Response c54Response = (C54Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result);
            String readMode = createCharge.getEncryptedCard().getReadMode();
            String orderId = createCharge.getOrderId();
            c07191.L$0 = charge;
            c07191.label = 1;
            objValidateE2exists = validateE2exists(c54Response, readMode, orderId, true, c07191);
            if (objValidateE2exists == coroutine_suspended) {
                return coroutine_suspended;
            }
            result2 = (Result) objValidateE2exists;
            if (result2 instanceof Result.Success) {
                return new Result.Success(charge, ProcessingStep.PROCESSED_STEP);
            }
            if (result2 instanceof Result.Failure) {
                return new Result.Failure(((Result.Failure) result2).getError());
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(result instanceof Result.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        this.transactionFailed = true;
        if (StringsKt__StringsKt.contains$default((CharSequence) ((Result.Failure) result).getError().getErrorBody(), (CharSequence) EglobalUtils.CARD_REMOVED, false, 2, (Object) null)) {
            String orderId2 = createCharge.getOrderId();
            c07191.label = 2;
            if (applyReverse(orderId2, false, 22, c07191) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return new Result.Failure(new Error.CardRetired(null, 1, null));
        }
        if (Intrinsics.areEqual("00", this.transactionResponseCode)) {
            String orderId3 = createCharge.getOrderId();
            c07191.label = 3;
            if (applyReverse$default(this, orderId3, false, 0, c07191, 4, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return new Result.Failure(new Error.OnTerminal(null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:30:0x008b  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object manageRefundC54Response(Result<C54Response> result, Continuation<? super Result<Boolean>> continuation) {
        C07201 c07201;
        Result<C54Response> result2;
        EglobalBluetoothController eglobalBluetoothController;
        Result result3;
        Result<C54Response> result4;
        if (continuation instanceof C07201) {
            c07201 = (C07201) continuation;
            int i10 = c07201.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07201.label = i10 - Integer.MIN_VALUE;
            } else {
                c07201 = new C07201(continuation);
            }
        } else {
            c07201 = new C07201(continuation);
        }
        Object objCommandInjectionC54 = c07201.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07201.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objCommandInjectionC54);
            if (result instanceof Result.Success) {
                C54Response c54Response = (C54Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result);
                c07201.label = 1;
                objCommandInjectionC54 = validateE2exists(c54Response, "", "", false, c07201);
                if (objCommandInjectionC54 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result3 = (Result) objCommandInjectionC54;
                if (result3 instanceof Result.Success) {
                    return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
                }
                if (result3 instanceof Result.Failure) {
                    return new Result.Failure(((Result.Failure) result3).getError());
                }
                throw new NoWhenBranchMatchedException();
            }
            if (!(result instanceof Result.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            c07201.L$0 = result;
            c07201.L$1 = this;
            c07201.label = 2;
            objCommandInjectionC54 = commandInjectionC54("01", "", EglobalUtils.ISSUER_AUTH_DATA_9100, "", c07201);
            if (objCommandInjectionC54 == coroutine_suspended) {
                return coroutine_suspended;
            }
            result2 = result;
            eglobalBluetoothController = this;
            c07201.L$0 = result2;
            c07201.L$1 = null;
            c07201.label = 3;
            if (eglobalBluetoothController.manageRefundC54Response((Result) objCommandInjectionC54, c07201) == coroutine_suspended) {
                return coroutine_suspended;
            }
            result4 = result2;
        } else {
            if (i11 == 1) {
                ResultKt.throwOnFailure(objCommandInjectionC54);
                result3 = (Result) objCommandInjectionC54;
                if (result3 instanceof Result.Success) {
                    return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
                }
                if (result3 instanceof Result.Failure) {
                    return new Result.Failure(((Result.Failure) result3).getError());
                }
                throw new NoWhenBranchMatchedException();
            }
            if (i11 == 2) {
                eglobalBluetoothController = (EglobalBluetoothController) c07201.L$1;
                result2 = (Result) c07201.L$0;
                ResultKt.throwOnFailure(objCommandInjectionC54);
                c07201.L$0 = result2;
                c07201.L$1 = null;
                c07201.label = 3;
                if (eglobalBluetoothController.manageRefundC54Response((Result) objCommandInjectionC54, c07201) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result4 = result2;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                result4 = (Result) c07201.L$0;
                ResultKt.throwOnFailure(objCommandInjectionC54);
            }
        }
        return StringsKt__StringsKt.contains$default((CharSequence) ((Result.Failure) result4).getError().getErrorBody(), (CharSequence) EglobalUtils.CARD_REMOVED, false, 2, (Object) null) ? new Result.Failure(new Error.CardRetired(null, 1, null)) : new Result.Failure(new Error.OnTerminal(null, 1, null));
    }

    private final void notifyConnectionStatus(boolean connected) {
        Boolean value;
        MutableStateFlow<Boolean> mutableStateFlow = this._isConnected;
        do {
            value = mutableStateFlow.getValue();
            value.booleanValue();
        } while (!mutableStateFlow.compareAndSet(value, Boolean.valueOf(connected)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final Object readCardC51(String str, boolean z10, String str2, String str3, String str4, String str5, Continuation<? super Result<C51Response>> continuation) {
        C07211 c07211;
        PinPadSdkWrapper pinPadSdkWrapper;
        Result.Failure failure;
        if (continuation instanceof C07211) {
            c07211 = (C07211) continuation;
            int i10 = c07211.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07211.label = i10 - Integer.MIN_VALUE;
            } else {
                c07211 = new C07211(continuation);
            }
        } else {
            c07211 = new C07211(continuation);
        }
        C07211 c07212 = c07211;
        Object obj = c07212.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07212.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            PinPadSdkWrapper pinPadSdkWrapper2 = this.pinPadSdkWrapper;
            if (pinPadSdkWrapper2 == null) {
                return new Result.Failure(new Error.OnTerminal(null, 1, null));
            }
            if (!isConnected().getValue().booleanValue()) {
                return new Result.Failure(new Error.TerminalNotConnected(null, 1, null));
            }
            c07212.L$0 = pinPadSdkWrapper2;
            c07212.label = 1;
            Object cardInfoC51 = pinPadSdkWrapper2.readCardInfoC51(str, z10, str2, str3, str4, str5, c07212);
            if (cardInfoC51 == coroutine_suspended) {
                return coroutine_suspended;
            }
            pinPadSdkWrapper = pinPadSdkWrapper2;
            obj = cardInfoC51;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pinPadSdkWrapper = (PinPadSdkWrapper) c07212.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Result result = (Result) obj;
        if (result instanceof Result.Success) {
            return new Result.Success(mx.openpay.library.domain.util.ResultKt.getSuccessData(result), null, 2, null);
        }
        if (!(result instanceof Result.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        pinPadSdkWrapper.clearPendingProcess();
        Result.Failure failure2 = (Result.Failure) result;
        if (StringsKt__StringsKt.contains$default((CharSequence) EglobalUtils.CARD_EXPIRED, (CharSequence) failure2.getError().getErrorBody(), false, 2, (Object) null)) {
            failure = new Result.Failure(new Error.CardExpired(null, 1, null));
        } else {
            if (!StringsKt__StringsKt.contains$default((CharSequence) EglobalUtils.KEY_DERIVATION_FAILED_TIMEOUT, (CharSequence) failure2.getError().getErrorBody(), false, 2, (Object) null)) {
                return new Result.Failure(failure2.getError());
            }
            failure = new Result.Failure(new Error.TimeOutTerminal(null, 1, null));
        }
        return failure;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object requestRandomKeyZ10(String str, boolean z10, Continuation<? super Result<Z10Response>> continuation) {
        C07221 c07221;
        PinPadSdkWrapper pinPadSdkWrapper;
        if (continuation instanceof C07221) {
            c07221 = (C07221) continuation;
            int i10 = c07221.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07221.label = i10 - Integer.MIN_VALUE;
            } else {
                c07221 = new C07221(continuation);
            }
        } else {
            c07221 = new C07221(continuation);
        }
        Object obj = c07221.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07221.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            PinPadSdkWrapper pinPadSdkWrapper2 = this.pinPadSdkWrapper;
            if (pinPadSdkWrapper2 == null) {
                return new Result.Failure(new Error.OnTerminal(null, 1, null));
            }
            if (!z10 && !isConnected().getValue().booleanValue()) {
                return new Result.Failure(new Error.TerminalNotConnected(null, 1, null));
            }
            c07221.L$0 = pinPadSdkWrapper2;
            c07221.label = 1;
            Object objRequestRandomKeyZ10 = pinPadSdkWrapper2.requestRandomKeyZ10(str, c07221);
            if (objRequestRandomKeyZ10 == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objRequestRandomKeyZ10;
            pinPadSdkWrapper = pinPadSdkWrapper2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pinPadSdkWrapper = (PinPadSdkWrapper) c07221.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Result result = (Result) obj;
        if (result instanceof Result.Success) {
            return new Result.Success(mx.openpay.library.domain.util.ResultKt.getSuccessData(result), null, 2, null);
        }
        if (!(result instanceof Result.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        pinPadSdkWrapper.clearPendingProcess();
        return new Result.Failure(((Result.Failure) result).getError());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:46:0x010e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0124 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x0128  */
    /* JADX WARN: Code duplicated, block: B:53:0x012c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0139  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    public final Object reviewChargeServiceResponse(CreateCharge createCharge, Charge charge, EmvTerminalData emvTerminalData, ConnectedDeviceQ8 connectedDeviceQ8, GatewayResponseDto gatewayResponseDto, Continuation<? super Result<Charge>> continuation) {
        C07231 c07231;
        String authorization;
        GatewayResponseDto gatewayResponseDto2;
        CreateCharge createCharge2;
        EglobalBluetoothController eglobalBluetoothController;
        String authorization2;
        EglobalBluetoothController eglobalBluetoothController2;
        EmvTerminalData emvTerminalData2;
        Result result;
        String str;
        String authorization3;
        Charge charge2 = charge;
        EmvTerminalData emvTerminalData3 = emvTerminalData;
        GatewayResponseDto gatewayResponseDto3 = gatewayResponseDto;
        if (continuation instanceof C07231) {
            c07231 = (C07231) continuation;
            int i10 = c07231.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07231.label = i10 - Integer.MIN_VALUE;
            } else {
                c07231 = new C07231(continuation);
            }
        } else {
            c07231 = new C07231(continuation);
        }
        C07231 c07232 = c07231;
        Object objExecuteChargeC54Command = c07232.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07232.label;
        if (i11 != 0) {
            if (i11 == 1) {
                GatewayResponseDto gatewayResponseDto4 = (GatewayResponseDto) c07232.L$4;
                EmvTerminalData emvTerminalData4 = (EmvTerminalData) c07232.L$3;
                charge2 = (Charge) c07232.L$2;
                createCharge2 = (CreateCharge) c07232.L$1;
                EglobalBluetoothController eglobalBluetoothController3 = (EglobalBluetoothController) c07232.L$0;
                ResultKt.throwOnFailure(objExecuteChargeC54Command);
                eglobalBluetoothController = eglobalBluetoothController3;
                gatewayResponseDto3 = gatewayResponseDto4;
                emvTerminalData3 = emvTerminalData4;
                gatewayResponseDto2 = gatewayResponseDto3;
            } else if (i11 == 2) {
                GatewayResponseDto gatewayResponseDto5 = (GatewayResponseDto) c07232.L$4;
                emvTerminalData2 = (EmvTerminalData) c07232.L$3;
                charge2 = (Charge) c07232.L$2;
                createCharge2 = (CreateCharge) c07232.L$1;
                eglobalBluetoothController2 = (EglobalBluetoothController) c07232.L$0;
                ResultKt.throwOnFailure(objExecuteChargeC54Command);
                gatewayResponseDto2 = gatewayResponseDto5;
                result = (Result) objExecuteChargeC54Command;
                if (result instanceof Result.Success) {
                    if (result instanceof Result.Failure) {
                        return new Result.Failure(((Result.Failure) result).getError());
                    }
                    throw new NoWhenBranchMatchedException();
                }
                String issuerAuthData = emvTerminalData2.getIssuerAuthData();
                if (charge2 != null || (authorization3 = charge2.getAuthorization()) == null) {
                    str = "";
                } else {
                    str = authorization3;
                }
                c07232.L$0 = null;
                c07232.L$1 = null;
                c07232.L$2 = null;
                c07232.L$3 = null;
                c07232.L$4 = null;
                c07232.label = 3;
                objExecuteChargeC54Command = eglobalBluetoothController2.executeChargeC54Command(issuerAuthData, str, charge2, createCharge2, gatewayResponseDto2, c07232);
                if (objExecuteChargeC54Command == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 3 && i11 != 4) {
                    if (i11 == 5) {
                        ResultKt.throwOnFailure(objExecuteChargeC54Command);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objExecuteChargeC54Command);
            }
            return (Result) objExecuteChargeC54Command;
        }
        ResultKt.throwOnFailure(objExecuteChargeC54Command);
        setTransactionResponseCode(gatewayResponseDto3);
        if (emvTerminalData3 == null) {
            String str2 = (charge2 == null || (authorization = charge.getAuthorization()) == null) ? "" : authorization;
            c07232.label = 5;
            objExecuteChargeC54Command = executeChargeC54Command(null, str2, charge, createCharge, gatewayResponseDto, c07232);
            return objExecuteChargeC54Command == coroutine_suspended ? coroutine_suspended : objExecuteChargeC54Command;
        }
        if (EglobalUtils.INSTANCE.getFLAGS_RENEW_KEYS_NEEDED().contains(emvTerminalData.getRequiresNewKey())) {
            UpdateRenewKeyBySlotAndTerminalUseCase updateRenewKeyBySlotAndTerminalUseCase = this.updateRenewKeyBySlotAndTerminalUseCase;
            int i12 = Integer.parseInt(emvTerminalData.getRequiresNewKey());
            int i13 = Integer.parseInt(connectedDeviceQ8.getSlotKey());
            String serial = connectedDeviceQ8.getSerial();
            c07232.L$0 = this;
            c07232.L$1 = createCharge;
            c07232.L$2 = charge2;
            c07232.L$3 = emvTerminalData3;
            c07232.L$4 = gatewayResponseDto3;
            c07232.label = 1;
            if (updateRenewKeyBySlotAndTerminalUseCase.invoke(i12, i13, serial, c07232) == coroutine_suspended) {
                return coroutine_suspended;
            }
            createCharge2 = createCharge;
            eglobalBluetoothController = this;
            gatewayResponseDto2 = gatewayResponseDto3;
        } else {
            gatewayResponseDto2 = gatewayResponseDto3;
            createCharge2 = createCharge;
            eglobalBluetoothController = this;
        }
        String[] strArrValidateIssuerScripts = EglobalUtils.INSTANCE.validateIssuerScripts(emvTerminalData3.getIssuerScript71(), emvTerminalData3.getIssuerScript72());
        if (strArrValidateIssuerScripts != null) {
            c07232.L$0 = eglobalBluetoothController;
            c07232.L$1 = createCharge2;
            c07232.L$2 = charge2;
            c07232.L$3 = emvTerminalData3;
            c07232.L$4 = gatewayResponseDto2;
            c07232.label = 2;
            Object objInjectScripts = eglobalBluetoothController.injectScripts(strArrValidateIssuerScripts, c07232);
            if (objInjectScripts == coroutine_suspended) {
                return coroutine_suspended;
            }
            eglobalBluetoothController2 = eglobalBluetoothController;
            objExecuteChargeC54Command = objInjectScripts;
            emvTerminalData2 = emvTerminalData3;
            result = (Result) objExecuteChargeC54Command;
            if (result instanceof Result.Success) {
                if (result instanceof Result.Failure) {
                    return new Result.Failure(((Result.Failure) result).getError());
                }
                throw new NoWhenBranchMatchedException();
            }
            String issuerAuthData2 = emvTerminalData2.getIssuerAuthData();
            if (charge2 != null) {
                str = "";
            } else {
                str = "";
            }
            c07232.L$0 = null;
            c07232.L$1 = null;
            c07232.L$2 = null;
            c07232.L$3 = null;
            c07232.L$4 = null;
            c07232.label = 3;
            objExecuteChargeC54Command = eglobalBluetoothController2.executeChargeC54Command(issuerAuthData2, str, charge2, createCharge2, gatewayResponseDto2, c07232);
            if (objExecuteChargeC54Command == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            String issuerAuthData3 = emvTerminalData3.getIssuerAuthData();
            String str3 = (charge2 == null || (authorization2 = charge2.getAuthorization()) == null) ? "" : authorization2;
            c07232.L$0 = null;
            c07232.L$1 = null;
            c07232.L$2 = null;
            c07232.L$3 = null;
            c07232.L$4 = null;
            c07232.label = 4;
            objExecuteChargeC54Command = eglobalBluetoothController.executeChargeC54Command(issuerAuthData3, str3, charge2, createCharge2, gatewayResponseDto2, c07232);
            if (objExecuteChargeC54Command == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return (Result) objExecuteChargeC54Command;
    }

    private final String saveFileToStorage(byte[] data) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        Intrinsics.checkNotNullExpressionValue(externalStorageDirectory, "getExternalStorageDirectory()");
        String str = Environment.DIRECTORY_DOWNLOADS + "/PXD180-" + UUID.randomUUID() + ".VFI";
        FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, str));
        try {
            fileOutputStream.write(data);
            fileOutputStream.close();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, null);
            return str;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object sendInitialKeyZ11(TerminalKeysResponse terminalKeysResponse, String str, boolean z10, Continuation<? super Result<Z11Response>> continuation) {
        C07251 c07251;
        PinPadSdkWrapper pinPadSdkWrapper;
        if (continuation instanceof C07251) {
            c07251 = (C07251) continuation;
            int i10 = c07251.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07251.label = i10 - Integer.MIN_VALUE;
            } else {
                c07251 = new C07251(continuation);
            }
        } else {
            c07251 = new C07251(continuation);
        }
        Object obj = c07251.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07251.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            PinPadSdkWrapper pinPadSdkWrapper2 = this.pinPadSdkWrapper;
            if (pinPadSdkWrapper2 == null) {
                return new Result.Failure(new Error.OnTerminal(null, 1, null));
            }
            if (!z10 && !isConnected().getValue().booleanValue()) {
                return new Result.Failure(new Error.TerminalNotConnected(null, 1, null));
            }
            c07251.L$0 = pinPadSdkWrapper2;
            c07251.label = 1;
            Object objSendInitialKeyZ11 = pinPadSdkWrapper2.sendInitialKeyZ11(terminalKeysResponse, str, c07251);
            if (objSendInitialKeyZ11 == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objSendInitialKeyZ11;
            pinPadSdkWrapper = pinPadSdkWrapper2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pinPadSdkWrapper = (PinPadSdkWrapper) c07251.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Result result = (Result) obj;
        if (result instanceof Result.Success) {
            return new Result.Success(mx.openpay.library.domain.util.ResultKt.getSuccessData(result), null, 2, null);
        }
        if (!(result instanceof Result.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        pinPadSdkWrapper.clearPendingProcess();
        return new Result.Failure(((Result.Failure) result).getError());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object sendInitialKeyZ12(String str, boolean z10, Continuation<? super Result<Z12Response>> continuation) {
        C07261 c07261;
        PinPadSdkWrapper pinPadSdkWrapper;
        if (continuation instanceof C07261) {
            c07261 = (C07261) continuation;
            int i10 = c07261.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07261.label = i10 - Integer.MIN_VALUE;
            } else {
                c07261 = new C07261(continuation);
            }
        } else {
            c07261 = new C07261(continuation);
        }
        Object obj = c07261.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07261.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            PinPadSdkWrapper pinPadSdkWrapper2 = this.pinPadSdkWrapper;
            if (pinPadSdkWrapper2 == null) {
                return new Result.Failure(new Error.OnTerminal(null, 1, null));
            }
            if (!z10 && !isConnected().getValue().booleanValue()) {
                return new Result.Failure(new Error.TerminalNotConnected(null, 1, null));
            }
            c07261.L$0 = pinPadSdkWrapper2;
            c07261.label = 1;
            Object objSendInitialKeyZ12 = pinPadSdkWrapper2.sendInitialKeyZ12(str, c07261);
            if (objSendInitialKeyZ12 == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objSendInitialKeyZ12;
            pinPadSdkWrapper = pinPadSdkWrapper2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pinPadSdkWrapper = (PinPadSdkWrapper) c07261.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Result result = (Result) obj;
        if (result instanceof Result.Success) {
            return new Result.Success(mx.openpay.library.domain.util.ResultKt.getSuccessData(result), null, 2, null);
        }
        if (!(result instanceof Result.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        pinPadSdkWrapper.clearPendingProcess();
        return new Result.Failure(((Result.Failure) result).getError());
    }

    private final void setTransactionResponseCode(GatewayResponseDto gatewayResponse) {
        String code;
        if (gatewayResponse == null || (code = gatewayResponse.getCode()) == null) {
            code = "00";
        }
        this.transactionResponseCode = code;
    }

    private final void setUpBluetooth() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Categories.communication);
        arrayList.add(Categories.debug);
        PinPadSdk pinPadSdk = new PinPadSdk();
        this.pinPadSdk = pinPadSdk;
        pinPadSdk.setConnectionType(EglobalUtils.CONNECTION_TYPE_BLUETOOTH);
        PinPadSdk pinPadSdk2 = this.pinPadSdk;
        if (pinPadSdk2 != null) {
            pinPadSdk2.setDebug(false, arrayList);
        }
        this.pinPadBTHandler = new MyHandler();
        MyBluetoothService myBluetoothService = new MyBluetoothService(this.pinPadBTHandler);
        this.bluetoothService = myBluetoothService;
        myBluetoothService.startListen(false);
        PinPadSdk pinPadSdk3 = this.pinPadSdk;
        Intrinsics.checkNotNull(pinPadSdk3);
        MyBluetoothService myBluetoothService2 = this.bluetoothService;
        Intrinsics.checkNotNull(myBluetoothService2);
        Gson gson = this.gson;
        MyHandler myHandler = this.pinPadBTHandler;
        Intrinsics.checkNotNull(myHandler);
        this.pinPadSdkWrapper = new PinPadSdkWrapper(pinPadSdk3, myBluetoothService2, myHandler, gson);
    }

    @RequiresPermission("android.permission.BLUETOOTH_CONNECT")
    private final void updatePairedDevices() {
        BluetoothAdapter bluetoothAdapter;
        Set<BluetoothDevice> bondedDevices;
        if (!hasPermission("android.permission.BLUETOOTH_CONNECT") || (bluetoothAdapter = getBluetoothAdapter()) == null || (bondedDevices = bluetoothAdapter.getBondedDevices()) == null) {
            return;
        }
        Set<BluetoothDevice> set = bondedDevices;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
        for (BluetoothDevice bluetoothDevice : set) {
            String name = bluetoothDevice.getName();
            Intrinsics.checkNotNullExpressionValue(name, "bluetoothDevice.name");
            String address = bluetoothDevice.getAddress();
            Intrinsics.checkNotNullExpressionValue(address, "bluetoothDevice.address");
            arrayList.add(new EglobalDevice(name, address));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (isAValidDevice(((EglobalDevice) obj).getName())) {
                arrayList2.add(obj);
            }
        }
        MutableStateFlow<List<EglobalDevice>> mutableStateFlow = this._pairedDevices;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), arrayList2)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object validateBinesResponse(Result<? extends List<Bin>> result, Continuation<? super Unit> continuation) {
        C07271 c07271;
        EglobalBluetoothController eglobalBluetoothController;
        if (continuation instanceof C07271) {
            c07271 = (C07271) continuation;
            int i10 = c07271.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07271.label = i10 - Integer.MIN_VALUE;
            } else {
                c07271 = new C07271(continuation);
            }
        } else {
            c07271 = new C07271(continuation);
        }
        Object obj = c07271.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07271.label;
        if (i11 != 0) {
            if (i11 == 1) {
                result = (Result) c07271.L$1;
                eglobalBluetoothController = (EglobalBluetoothController) c07271.L$0;
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
        DeleteAllBinesUseCase deleteAllBinesUseCase = this.deleteAllBinesUseCase;
        c07271.L$0 = this;
        c07271.L$1 = result;
        c07271.label = 1;
        if (deleteAllBinesUseCase.invoke(c07271) == coroutine_suspended) {
            return coroutine_suspended;
        }
        eglobalBluetoothController = this;
        InsertBinesUseCase insertBinesUseCase = eglobalBluetoothController.insertBinesUseCase;
        List<Bin> list = (List) mx.openpay.library.domain.util.ResultKt.getSuccessData(result);
        c07271.L$0 = null;
        c07271.L$1 = null;
        c07271.label = 2;
        if (insertBinesUseCase.invoke(list, c07271) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00df  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:38:0x0116 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0117  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object validateChargeFlow(ConnectedDeviceQ8 connectedDeviceQ8, EglobalChargeRequest eglobalChargeRequest, Result<C51Response> result, ChargeCallback chargeCallback, Continuation<? super Result<Charge>> continuation) {
        C07281 c07281;
        EglobalChargeRequest eglobalChargeRequest2;
        ChargeCallback chargeCallback2;
        EglobalBluetoothController eglobalBluetoothController;
        CreateCharge createCharge;
        String cardBin;
        ChargeCallback chargeCallback3;
        Result<C51Response> result2 = result;
        if (continuation instanceof C07281) {
            c07281 = (C07281) continuation;
            int i10 = c07281.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07281.label = i10 - Integer.MIN_VALUE;
            } else {
                c07281 = new C07281(continuation);
            }
        } else {
            c07281 = new C07281(continuation);
        }
        Object objInvoke = c07281.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07281.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            if (!(result2 instanceof Result.Success)) {
                if (!(result2 instanceof Result.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (StringsKt__StringsKt.contains$default((CharSequence) ((Result.Failure) result2).getError().getErrorBody(), (CharSequence) EglobalUtils.CARD_REMOVED, false, 2, (Object) null)) {
                    String orderId = eglobalChargeRequest.getOrderId();
                    c07281.L$0 = result2;
                    c07281.label = 5;
                    if (applyReverse(orderId, false, 22, c07281) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return new Result.Failure(((Result.Failure) result2).getError());
            }
            CreateCharge createChargeCreateChargeRequest = ChargeUtils.INSTANCE.createChargeRequest(this.context, connectedDeviceQ8.getSerial(), connectedDeviceQ8.getSlotKey(), eglobalChargeRequest.getCom.bbva.notifications.constants.PushConstants.AMOUNT java.lang.String(), eglobalChargeRequest.getOrderId(), eglobalChargeRequest.getPlan(), eglobalChargeRequest.getDescription(), (C51Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result));
            CanPayWithBbvaPointsUseCase canPayWithBbvaPointsUseCase = this.canPayWithBbvaPointsUseCase;
            String cardBin2 = ((C51Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result)).getCardBin();
            String slotKey = connectedDeviceQ8.getSlotKey();
            c07281.L$0 = this;
            eglobalChargeRequest2 = eglobalChargeRequest;
            c07281.L$1 = eglobalChargeRequest2;
            chargeCallback2 = chargeCallback;
            c07281.L$2 = chargeCallback2;
            c07281.L$3 = createChargeCreateChargeRequest;
            c07281.label = 1;
            Object objInvoke2 = canPayWithBbvaPointsUseCase.invoke(cardBin2, slotKey, c07281);
            if (objInvoke2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            eglobalBluetoothController = this;
            objInvoke = objInvoke2;
            createCharge = createChargeCreateChargeRequest;
            if (((Boolean) objInvoke).booleanValue()) {
                if (chargeCallback2 != null) {
                    chargeCallback2.execute(new ChargeCallbackStates.Eglobal.PayWithPoints(createCharge));
                }
                return new Result.Success(null, ProcessingStep.PAY_WITH_POINTS_STEP);
            }
            GetPaymentPlansUseCase getPaymentPlansUseCase = eglobalBluetoothController.getPaymentPlansUseCase;
            cardBin = createCharge.getEncryptedCard().getCardBin();
            if (cardBin == null) {
                cardBin = "";
            }
            double dDoubleValue = eglobalChargeRequest2.getCom.bbva.notifications.constants.PushConstants.AMOUNT java.lang.String().doubleValue();
            c07281.L$0 = eglobalBluetoothController;
            c07281.L$1 = chargeCallback2;
            c07281.L$2 = createCharge;
            c07281.L$3 = null;
            c07281.label = 2;
            objInvoke = getPaymentPlansUseCase.invoke(cardBin, dDoubleValue, c07281);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            chargeCallback3 = chargeCallback2;
        } else if (i11 == 1) {
            createCharge = (CreateCharge) c07281.L$3;
            ChargeCallback chargeCallback4 = (ChargeCallback) c07281.L$2;
            EglobalChargeRequest eglobalChargeRequest3 = (EglobalChargeRequest) c07281.L$1;
            EglobalBluetoothController eglobalBluetoothController2 = (EglobalBluetoothController) c07281.L$0;
            ResultKt.throwOnFailure(objInvoke);
            chargeCallback2 = chargeCallback4;
            eglobalChargeRequest2 = eglobalChargeRequest3;
            eglobalBluetoothController = eglobalBluetoothController2;
            if (((Boolean) objInvoke).booleanValue()) {
                if (chargeCallback2 != null) {
                    chargeCallback2.execute(new ChargeCallbackStates.Eglobal.PayWithPoints(createCharge));
                }
                return new Result.Success(null, ProcessingStep.PAY_WITH_POINTS_STEP);
            }
            GetPaymentPlansUseCase getPaymentPlansUseCase2 = eglobalBluetoothController.getPaymentPlansUseCase;
            cardBin = createCharge.getEncryptedCard().getCardBin();
            if (cardBin == null) {
                cardBin = "";
            }
            double dDoubleValue2 = eglobalChargeRequest2.getCom.bbva.notifications.constants.PushConstants.AMOUNT java.lang.String().doubleValue();
            c07281.L$0 = eglobalBluetoothController;
            c07281.L$1 = chargeCallback2;
            c07281.L$2 = createCharge;
            c07281.L$3 = null;
            c07281.label = 2;
            objInvoke = getPaymentPlansUseCase2.invoke(cardBin, dDoubleValue2, c07281);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            chargeCallback3 = chargeCallback2;
        } else {
            if (i11 != 2) {
                if (i11 == 3) {
                    ResultKt.throwOnFailure(objInvoke);
                }
                if (i11 == 4) {
                    ResultKt.throwOnFailure(objInvoke);
                }
                if (i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                result2 = (Result) c07281.L$0;
                ResultKt.throwOnFailure(objInvoke);
                return new Result.Failure(((Result.Failure) result2).getError());
            }
            createCharge = (CreateCharge) c07281.L$2;
            chargeCallback3 = (ChargeCallback) c07281.L$1;
            eglobalBluetoothController = (EglobalBluetoothController) c07281.L$0;
            ResultKt.throwOnFailure(objInvoke);
        }
        Result result3 = (Result) objInvoke;
        if (result3 instanceof Result.Failure) {
            c07281.L$0 = null;
            c07281.L$1 = null;
            c07281.L$2 = null;
            c07281.label = 3;
            objInvoke = eglobalBluetoothController.validateIfSignatureRequired(createCharge, chargeCallback3, c07281);
            return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
        }
        if (!(result3 instanceof Result.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Success success = (Result.Success) result3;
        Collection collection = (Collection) success.getData();
        if (collection == null || collection.isEmpty()) {
            c07281.L$0 = null;
            c07281.L$1 = null;
            c07281.L$2 = null;
            c07281.label = 4;
            objInvoke = eglobalBluetoothController.validateIfSignatureRequired(createCharge, chargeCallback3, c07281);
            return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
        }
        List listEmptyList = (List) success.getData();
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        if (chargeCallback3 != null) {
            chargeCallback3.execute(new ChargeCallbackStates.Eglobal.PayWithPlans(createCharge, listEmptyList));
        }
        return new Result.Success(null, ProcessingStep.PAY_WITH_PLANS_STEP);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object validateE2exists(C54Response c54Response, String str, String str2, boolean z10, Continuation<? super Result<Boolean>> continuation) {
        C07291 c07291;
        EglobalBluetoothController eglobalBluetoothController;
        EglobalBluetoothController eglobalBluetoothController2;
        if (continuation instanceof C07291) {
            c07291 = (C07291) continuation;
            int i10 = c07291.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07291.label = i10 - Integer.MIN_VALUE;
            } else {
                c07291 = new C07291(continuation);
            }
        } else {
            c07291 = new C07291(continuation);
        }
        C07291 c07292 = c07291;
        Object obj = c07292.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07292.label;
        if (i11 != 0) {
            if (i11 == 1) {
                eglobalBluetoothController2 = (EglobalBluetoothController) c07292.L$0;
                ResultKt.throwOnFailure(obj);
                eglobalBluetoothController2.transactionResponseCode = "";
                return new Result.Failure(new Error.InvalidIssuerAuth(null, 1, null));
            }
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = c07292.Z$0;
            eglobalBluetoothController = (EglobalBluetoothController) c07292.L$0;
            ResultKt.throwOnFailure(obj);
            if (z10) {
                return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
            }
            if (eglobalBluetoothController.transactionFailed) {
                return new Result.Failure(Error.Unknown.INSTANCE);
            }
            eglobalBluetoothController.transactionFailed = false;
            return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
        }
        ResultKt.throwOnFailure(obj);
        String e5 = c54Response.getE2();
        if (e5 != null && e5.length() != 0) {
            Map<String, String> splitEmvValue = EglobalUtils.INSTANCE.getSplitEmvValue(c54Response.getE2());
            String str3 = splitEmvValue.get(EglobalUtils.CRYPTO_INFO);
            if (z10 && Intrinsics.areEqual("00", str3) && Intrinsics.areEqual("00", this.transactionResponseCode) && Intrinsics.areEqual("05", str)) {
                c07292.L$0 = this;
                c07292.label = 1;
                if (applyReverse$default(this, str2, false, 0, c07292, 4, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                eglobalBluetoothController2 = this;
                eglobalBluetoothController2.transactionResponseCode = "";
                return new Result.Failure(new Error.InvalidIssuerAuth(null, 1, null));
            }
            String str4 = splitEmvValue.get(EglobalUtils.CRYPTOGRAM);
            if (str4 != null) {
                String strSubstring = str4.substring(str4.length() - 4);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                if (strSubstring != null) {
                    UpdateTerminalCapacityDataUseCase updateTerminalCapacityDataUseCase = this.updateTerminalCapacityDataUseCase;
                    c07292.L$0 = this;
                    c07292.Z$0 = z10;
                    c07292.label = 2;
                    if (updateTerminalCapacityDataUseCase.invoke(strSubstring, c07292) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        }
        eglobalBluetoothController = this;
        if (z10) {
            return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
        }
        if (eglobalBluetoothController.transactionFailed) {
            return new Result.Failure(Error.Unknown.INSTANCE);
        }
        eglobalBluetoothController.transactionFailed = false;
        return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object validateIfExistsTransactionData(CreateCharge createCharge, String str, Continuation<? super Unit> continuation) {
        C07301 c07301;
        EglobalBluetoothController eglobalBluetoothController;
        if (continuation instanceof C07301) {
            c07301 = (C07301) continuation;
            int i10 = c07301.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07301.label = i10 - Integer.MIN_VALUE;
            } else {
                c07301 = new C07301(continuation);
            }
        } else {
            c07301 = new C07301(continuation);
        }
        Object objInvoke = c07301.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07301.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            GetTransactionByIdUseCase getTransactionByIdUseCase = this.getTransactionByIdUseCase;
            c07301.L$0 = this;
            c07301.L$1 = createCharge;
            c07301.L$2 = str;
            c07301.label = 1;
            objInvoke = getTransactionByIdUseCase.invoke(str, c07301);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            eglobalBluetoothController = this;
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
            str = (String) c07301.L$2;
            createCharge = (CreateCharge) c07301.L$1;
            eglobalBluetoothController = (EglobalBluetoothController) c07301.L$0;
            ResultKt.throwOnFailure(objInvoke);
        }
        if (mx.openpay.library.domain.util.ResultKt.isSuccess((Result) objInvoke)) {
            UpdateTransactionUseCase updateTransactionUseCase = eglobalBluetoothController.updateTransactionUseCase;
            c07301.L$0 = null;
            c07301.L$1 = null;
            c07301.L$2 = null;
            c07301.label = 2;
            if (updateTransactionUseCase.invoke(createCharge, str, c07301) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        InsertTransactionUseCase insertTransactionUseCase = eglobalBluetoothController.insertTransactionUseCase;
        c07301.L$0 = null;
        c07301.L$1 = null;
        c07301.L$2 = null;
        c07301.label = 3;
        if (insertTransactionUseCase.invoke(createCharge, str, c07301) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:47:0x00be  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object validateIfSignatureRequired(CreateCharge createCharge, ChargeCallback chargeCallback, Continuation<? super Result<Charge>> continuation) {
        C07311 c07311;
        EglobalUtils eglobalUtils;
        EmvTags emvTags;
        String cardHolderVerification;
        EmvTags emvTags2;
        String cardHolderVerificationVisa;
        if (continuation instanceof C07311) {
            c07311 = (C07311) continuation;
            int i10 = c07311.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07311.label = i10 - Integer.MIN_VALUE;
            } else {
                c07311 = new C07311(continuation);
            }
        } else {
            c07311 = new C07311(continuation);
        }
        C07311 c07312 = c07311;
        Object objExecuteCharge = c07312.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07312.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(objExecuteCharge);
            }
            if (i11 == 2) {
                ResultKt.throwOnFailure(objExecuteCharge);
                return new Result.Failure(new Error.PinLock(null, 1, null));
            }
            if (i11 == 3) {
                ResultKt.throwOnFailure(objExecuteCharge);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objExecuteCharge);
        String pinStatus = createCharge.getEncryptedCard().getPinStatus();
        String readMode = createCharge.getEncryptedCard().getReadMode();
        String cardBin = createCharge.getEncryptedCard().getCardBin();
        String strValueOf = String.valueOf(cardBin != null ? Boxing.boxChar(StringsKt___StringsKt.first(cardBin)) : null);
        if (!Intrinsics.areEqual("00", pinStatus)) {
            if (!Intrinsics.areEqual(pinStatus, "02") || !Intrinsics.areEqual(strValueOf, ExifInterface.GPS_MEASUREMENT_3D)) {
                c07312.label = 3;
                objExecuteCharge = executeCharge(createCharge, c07312);
                return objExecuteCharge == coroutine_suspended ? coroutine_suspended : objExecuteCharge;
            }
            c07312.label = 2;
            if (commandInjectionC54("01", "00", EglobalUtils.ISSUER_AUTH_DATA_9100, "", c07312) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return new Result.Failure(new Error.PinLock(null, 1, null));
        }
        boolean zAreEqual = false;
        boolean z10 = Intrinsics.areEqual(readMode, EglobalUtils.READ_MODE_MAGNETIC_STRIPE) || Intrinsics.areEqual(readMode, "80");
        EmvTags emvTags3 = createCharge.getEncryptedCard().getEmvTags();
        String cardHolderVerification2 = emvTags3 != null ? emvTags3.getCardHolderVerification() : null;
        if (cardHolderVerification2 == null || cardHolderVerification2.length() == 0) {
            EmvTags emvTags4 = createCharge.getEncryptedCard().getEmvTags();
            String cardHolderVerificationVisa2 = emvTags4 != null ? emvTags4.getCardHolderVerificationVisa() : null;
            if (cardHolderVerificationVisa2 == null || cardHolderVerificationVisa2.length() == 0) {
                zAreEqual = Intrinsics.areEqual(readMode, "05");
            } else {
                eglobalUtils = EglobalUtils.INSTANCE;
                emvTags = createCharge.getEncryptedCard().getEmvTags();
                if (emvTags != null) {
                    cardHolderVerification = emvTags.getCardHolderVerification();
                } else {
                    cardHolderVerification = null;
                }
                if (eglobalUtils.requiresSignatureAMEXMC(cardHolderVerification)) {
                    zAreEqual = true;
                } else {
                    emvTags2 = createCharge.getEncryptedCard().getEmvTags();
                    if (emvTags2 != null) {
                        cardHolderVerificationVisa = emvTags2.getCardHolderVerificationVisa();
                    } else {
                        cardHolderVerificationVisa = null;
                    }
                    if (eglobalUtils.requiresSignatureVisa(cardHolderVerificationVisa)) {
                        zAreEqual = true;
                    }
                }
            }
        } else {
            eglobalUtils = EglobalUtils.INSTANCE;
            emvTags = createCharge.getEncryptedCard().getEmvTags();
            if (emvTags != null) {
                cardHolderVerification = emvTags.getCardHolderVerification();
            } else {
                cardHolderVerification = null;
            }
            if (eglobalUtils.requiresSignatureAMEXMC(cardHolderVerification)) {
                zAreEqual = true;
            } else {
                emvTags2 = createCharge.getEncryptedCard().getEmvTags();
                if (emvTags2 != null) {
                    cardHolderVerificationVisa = emvTags2.getCardHolderVerificationVisa();
                } else {
                    cardHolderVerificationVisa = null;
                }
                if (eglobalUtils.requiresSignatureVisa(cardHolderVerificationVisa)) {
                    zAreEqual = true;
                }
            }
        }
        if (z10 || zAreEqual) {
            if (chargeCallback != null) {
                chargeCallback.execute(new ChargeCallbackStates.Eglobal.RequestDigitalSignature(createCharge));
            }
            return new Result.Success(null, ProcessingStep.DIGITAL_SIGN_STEP);
        }
        c07312.label = 1;
        objExecuteCharge = executeCharge(createCharge, c07312);
        return objExecuteCharge == coroutine_suspended ? coroutine_suspended : objExecuteCharge;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object validateIssuerAuthDataToInjectCommandC54(String str, String str2, GatewayResponseDto gatewayResponseDto, Continuation<? super Result<C54Response>> continuation) {
        if (str == null || str.length() == 0) {
            if (gatewayResponseDto != null) {
                return commandInjectionC54("01", gatewayResponseDto.getCode(), EglobalUtils.ISSUER_AUTH_DATA_9100, "", continuation);
            }
            return str2.length() > 0 ? commandInjectionC54("00", "00", EglobalUtils.ISSUER_AUTH_DATA_9100, str2, continuation) : commandInjectionC54("01", "01", EglobalUtils.ISSUER_AUTH_DATA_9100, "", continuation);
        }
        String longitudeIssuerAutData = EglobalUtils.INSTANCE.getLongitudeIssuerAutData(str);
        if (gatewayResponseDto != null) {
            return commandInjectionC54("01", gatewayResponseDto.getCode(), h0.b("91", longitudeIssuerAutData, str), "", continuation);
        }
        return commandInjectionC54("00", "00", h0.b("91", longitudeIssuerAutData, str), str2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object validateRSAKeyZ13(String str, Continuation<? super Result<Z13Response>> continuation) {
        C07321 c07321;
        PinPadSdkWrapper pinPadSdkWrapper;
        if (continuation instanceof C07321) {
            c07321 = (C07321) continuation;
            int i10 = c07321.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07321.label = i10 - Integer.MIN_VALUE;
            } else {
                c07321 = new C07321(continuation);
            }
        } else {
            c07321 = new C07321(continuation);
        }
        Object obj = c07321.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07321.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            PinPadSdkWrapper pinPadSdkWrapper2 = this.pinPadSdkWrapper;
            if (pinPadSdkWrapper2 == null) {
                return new Result.Failure(new Error.OnTerminal(null, 1, null));
            }
            c07321.L$0 = pinPadSdkWrapper2;
            c07321.label = 1;
            Object objValidateRSAKeyZ13 = pinPadSdkWrapper2.validateRSAKeyZ13(str, c07321);
            if (objValidateRSAKeyZ13 == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objValidateRSAKeyZ13;
            pinPadSdkWrapper = pinPadSdkWrapper2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pinPadSdkWrapper = (PinPadSdkWrapper) c07321.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Result result = (Result) obj;
        if (result instanceof Result.Success) {
            return new Result.Success(mx.openpay.library.domain.util.ResultKt.getSuccessData(result), null, 2, null);
        }
        if (!(result instanceof Result.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        pinPadSdkWrapper.clearPendingProcess();
        return new Result.Failure(((Result.Failure) result).getError());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:53:0x0127 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0128  */
    /* JADX WARN: Code duplicated, block: B:57:0x013c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x0156 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x0157  */
    /* JADX WARN: Code duplicated, block: B:65:0x016b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x0178  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object validateRefundFlow(ConnectedDeviceQ8 connectedDeviceQ8, Transaction transaction, RefundRequest refundRequest, C51Response c51Response, Continuation<? super Result<Transaction>> continuation) {
        C07331 c07331;
        EglobalBluetoothController eglobalBluetoothController;
        EglobalBluetoothController eglobalBluetoothController2;
        Result result;
        Error error;
        Object objCommandInjectionC54;
        Result result2;
        Object objCommandInjectionC55;
        Object objCommandInjectionC56;
        Result result3;
        Result result4;
        Result result5;
        if (continuation instanceof C07331) {
            c07331 = (C07331) continuation;
            int i10 = c07331.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07331.label = i10 - Integer.MIN_VALUE;
            } else {
                c07331 = new C07331(continuation);
            }
        } else {
            c07331 = new C07331(continuation);
        }
        C07331 c07332 = c07331;
        Object objCommandInjectionC57 = c07332.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        switch (c07332.label) {
            case 0:
                ResultKt.throwOnFailure(objCommandInjectionC57);
                RefundUtils refundUtils = RefundUtils.INSTANCE;
                if (!refundUtils.validateIfCardIsCorrect(c51Response, transaction)) {
                    c07332.L$0 = this;
                    c07332.label = 8;
                    objCommandInjectionC57 = commandInjectionC54("01", "05", EglobalUtils.ISSUER_AUTH_DATA_9100, "", c07332);
                    if (objCommandInjectionC57 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    eglobalBluetoothController = this;
                    c07332.L$0 = null;
                    c07332.label = 9;
                    if (eglobalBluetoothController.manageRefundC54Response((Result) objCommandInjectionC57, c07332) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return new Result.Failure(new Error.DifferentCard(null, 1, null));
                }
                refundUtils.completeRefundRequest(this.context, connectedDeviceQ8, transaction, refundRequest, c51Response);
                RefundChargeUseCase refundChargeUseCase = this.refundChargeUseCase;
                c07332.L$0 = this;
                c07332.label = 1;
                objCommandInjectionC57 = refundChargeUseCase.invoke(refundRequest, c07332);
                if (objCommandInjectionC57 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                eglobalBluetoothController2 = this;
                result = (Result) objCommandInjectionC57;
                if (result instanceof Result.Success) {
                    c07332.L$0 = result;
                    c07332.L$1 = eglobalBluetoothController2;
                    c07332.label = 2;
                    objCommandInjectionC56 = eglobalBluetoothController2.commandInjectionC54("00", "00", EglobalUtils.ISSUER_AUTH_DATA_9100, "", c07332);
                    if (objCommandInjectionC56 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    result3 = result;
                    objCommandInjectionC57 = objCommandInjectionC56;
                    c07332.L$0 = result3;
                    c07332.L$1 = null;
                    c07332.label = 3;
                    if (eglobalBluetoothController2.manageRefundC54Response((Result) objCommandInjectionC57, c07332) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    result4 = result3;
                    return new Result.Success(((Result.Success) result4).getData(), null, 2, null);
                }
                if (result instanceof Result.Failure) {
                    throw new NoWhenBranchMatchedException();
                }
                error = ((Result.Failure) result).getError();
                if ((error instanceof Error.TimeOut) || (error instanceof Error.BadGateway) || (error instanceof Error.ServiceUnavailable) || (error instanceof Error.InternalServer)) {
                    c07332.L$0 = result;
                    c07332.L$1 = eglobalBluetoothController2;
                    c07332.label = 4;
                    objCommandInjectionC54 = eglobalBluetoothController2.commandInjectionC54("02", "00", EglobalUtils.ISSUER_AUTH_DATA_9100, "", c07332);
                    if (objCommandInjectionC54 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    result2 = result;
                    objCommandInjectionC57 = objCommandInjectionC54;
                    c07332.L$0 = result2;
                    c07332.L$1 = null;
                    c07332.label = 5;
                    if (eglobalBluetoothController2.manageRefundC54Response((Result) objCommandInjectionC57, c07332) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    result5 = result2;
                    return new Result.Failure(((Result.Failure) result5).getError());
                }
                c07332.L$0 = result;
                c07332.L$1 = eglobalBluetoothController2;
                c07332.label = 6;
                objCommandInjectionC55 = eglobalBluetoothController2.commandInjectionC54("01", "", EglobalUtils.ISSUER_AUTH_DATA_9100, "", c07332);
                if (objCommandInjectionC55 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result2 = result;
                objCommandInjectionC57 = objCommandInjectionC55;
                c07332.L$0 = result2;
                c07332.L$1 = null;
                c07332.label = 7;
                if (eglobalBluetoothController2.manageRefundC54Response((Result) objCommandInjectionC57, c07332) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result5 = result2;
                return new Result.Failure(((Result.Failure) result5).getError());
            case 1:
                eglobalBluetoothController2 = (EglobalBluetoothController) c07332.L$0;
                ResultKt.throwOnFailure(objCommandInjectionC57);
                result = (Result) objCommandInjectionC57;
                if (result instanceof Result.Success) {
                    c07332.L$0 = result;
                    c07332.L$1 = eglobalBluetoothController2;
                    c07332.label = 2;
                    objCommandInjectionC56 = eglobalBluetoothController2.commandInjectionC54("00", "00", EglobalUtils.ISSUER_AUTH_DATA_9100, "", c07332);
                    if (objCommandInjectionC56 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    result3 = result;
                    objCommandInjectionC57 = objCommandInjectionC56;
                    c07332.L$0 = result3;
                    c07332.L$1 = null;
                    c07332.label = 3;
                    if (eglobalBluetoothController2.manageRefundC54Response((Result) objCommandInjectionC57, c07332) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    result4 = result3;
                    return new Result.Success(((Result.Success) result4).getData(), null, 2, null);
                }
                if (result instanceof Result.Failure) {
                    throw new NoWhenBranchMatchedException();
                }
                error = ((Result.Failure) result).getError();
                if (error instanceof Error.TimeOut) {
                    c07332.L$0 = result;
                    c07332.L$1 = eglobalBluetoothController2;
                    c07332.label = 6;
                    objCommandInjectionC55 = eglobalBluetoothController2.commandInjectionC54("01", "", EglobalUtils.ISSUER_AUTH_DATA_9100, "", c07332);
                    if (objCommandInjectionC55 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    result2 = result;
                    objCommandInjectionC57 = objCommandInjectionC55;
                    c07332.L$0 = result2;
                    c07332.L$1 = null;
                    c07332.label = 7;
                    if (eglobalBluetoothController2.manageRefundC54Response((Result) objCommandInjectionC57, c07332) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    result5 = result2;
                    return new Result.Failure(((Result.Failure) result5).getError());
                }
                c07332.L$0 = result;
                c07332.L$1 = eglobalBluetoothController2;
                c07332.label = 4;
                objCommandInjectionC54 = eglobalBluetoothController2.commandInjectionC54("02", "00", EglobalUtils.ISSUER_AUTH_DATA_9100, "", c07332);
                if (objCommandInjectionC54 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result2 = result;
                objCommandInjectionC57 = objCommandInjectionC54;
                c07332.L$0 = result2;
                c07332.L$1 = null;
                c07332.label = 5;
                if (eglobalBluetoothController2.manageRefundC54Response((Result) objCommandInjectionC57, c07332) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result5 = result2;
                return new Result.Failure(((Result.Failure) result5).getError());
            case 2:
                eglobalBluetoothController2 = (EglobalBluetoothController) c07332.L$1;
                result3 = (Result) c07332.L$0;
                ResultKt.throwOnFailure(objCommandInjectionC57);
                c07332.L$0 = result3;
                c07332.L$1 = null;
                c07332.label = 3;
                if (eglobalBluetoothController2.manageRefundC54Response((Result) objCommandInjectionC57, c07332) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result4 = result3;
                return new Result.Success(((Result.Success) result4).getData(), null, 2, null);
            case 3:
                result4 = (Result) c07332.L$0;
                ResultKt.throwOnFailure(objCommandInjectionC57);
                return new Result.Success(((Result.Success) result4).getData(), null, 2, null);
            case 4:
                eglobalBluetoothController2 = (EglobalBluetoothController) c07332.L$1;
                result2 = (Result) c07332.L$0;
                ResultKt.throwOnFailure(objCommandInjectionC57);
                c07332.L$0 = result2;
                c07332.L$1 = null;
                c07332.label = 5;
                if (eglobalBluetoothController2.manageRefundC54Response((Result) objCommandInjectionC57, c07332) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result5 = result2;
                return new Result.Failure(((Result.Failure) result5).getError());
            case 5:
            case 7:
                result5 = (Result) c07332.L$0;
                ResultKt.throwOnFailure(objCommandInjectionC57);
                return new Result.Failure(((Result.Failure) result5).getError());
            case 6:
                eglobalBluetoothController2 = (EglobalBluetoothController) c07332.L$1;
                result2 = (Result) c07332.L$0;
                ResultKt.throwOnFailure(objCommandInjectionC57);
                c07332.L$0 = result2;
                c07332.L$1 = null;
                c07332.label = 7;
                if (eglobalBluetoothController2.manageRefundC54Response((Result) objCommandInjectionC57, c07332) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result5 = result2;
                return new Result.Failure(((Result.Failure) result5).getError());
            case 8:
                eglobalBluetoothController = (EglobalBluetoothController) c07332.L$0;
                ResultKt.throwOnFailure(objCommandInjectionC57);
                c07332.L$0 = null;
                c07332.label = 9;
                if (eglobalBluetoothController.manageRefundC54Response((Result) objCommandInjectionC57, c07332) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return new Result.Failure(new Error.DifferentCard(null, 1, null));
            case 9:
                ResultKt.throwOnFailure(objCommandInjectionC57);
                return new Result.Failure(new Error.DifferentCard(null, 1, null));
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // mx.openpay.library.domain.bluetooth.BluetoothController
    public void closeConnection() {
        Boolean value;
        MyBluetoothService myBluetoothService = this.bluetoothService;
        if (myBluetoothService != null) {
            myBluetoothService.stop();
        }
        MutableStateFlow<Boolean> mutableStateFlow = this._isConnected;
        do {
            value = mutableStateFlow.getValue();
            value.booleanValue();
        } while (!mutableStateFlow.compareAndSet(value, Boolean.FALSE));
        this._connectedDevice = null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x025b  */
    /* JADX WARN: Code duplicated, block: B:105:0x026f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0273  */
    /* JADX WARN: Code duplicated, block: B:109:0x0285  */
    /* JADX WARN: Code duplicated, block: B:111:0x028b  */
    /* JADX WARN: Code duplicated, block: B:113:0x029c  */
    /* JADX WARN: Code duplicated, block: B:115:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:120:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:122:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:125:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:40:0x0102  */
    /* JADX WARN: Code duplicated, block: B:42:0x0112  */
    /* JADX WARN: Code duplicated, block: B:44:0x011e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:49:0x0140 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0141  */
    /* JADX WARN: Code duplicated, block: B:53:0x0150 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x0157  */
    /* JADX WARN: Code duplicated, block: B:58:0x015b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0174 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x0175  */
    /* JADX WARN: Code duplicated, block: B:66:0x0182  */
    /* JADX WARN: Code duplicated, block: B:68:0x019f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x01be  */
    /* JADX WARN: Code duplicated, block: B:78:0x01dc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x021b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:90:0x0229  */
    /* JADX WARN: Code duplicated, block: B:92:0x022d  */
    /* JADX WARN: Code duplicated, block: B:94:0x023f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0245  */
    /* JADX WARN: Code duplicated, block: B:98:0x0249  */
    @Override // mx.openpay.library.domain.bluetooth.BluetoothController
    @Nullable
    public Object connectDevice(@NotNull Device device, @NotNull Continuation<? super Result<Boolean>> continuation) {
        C07071 c07071;
        PinPadSdkWrapper pinPadSdkWrapper;
        Object obj;
        EglobalBluetoothController eglobalBluetoothController;
        Result result;
        MyBluetoothService myBluetoothService;
        MyBluetoothService myBluetoothService2;
        Result result2;
        ConnectedDeviceQ8 connectedDeviceQ8MapToConnectedDeviceQ8;
        InsertConnectedDeviceInfoUseCase insertConnectedDeviceInfoUseCase;
        EglobalBluetoothController eglobalBluetoothController2;
        ConnectedDeviceQ8 connectedDeviceQ8;
        Result result3;
        Object objInvoke;
        ConnectedDeviceQ8 connectedDeviceQ9;
        Result result4;
        EglobalBluetoothController eglobalBluetoothController3;
        ConnectedDeviceQ8 connectedDeviceQ10;
        EglobalBluetoothController eglobalBluetoothController4;
        Result result5;
        ConnectedDeviceQ8 connectedDeviceQ11;
        Result result6;
        UpdateKeyInjectedDateBySerialUseCase updateKeyInjectedDateBySerialUseCase;
        String todayDateFormatted;
        String serial;
        EglobalBluetoothController eglobalBluetoothController5;
        UpdateMerchantSlotKeyInjectedBySlotUseCase updateMerchantSlotKeyInjectedBySlotUseCase;
        int i10;
        String serial2;
        if (continuation instanceof C07071) {
            c07071 = (C07071) continuation;
            int i11 = c07071.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c07071.label = i11 - Integer.MIN_VALUE;
            } else {
                c07071 = new C07071(continuation);
            }
        } else {
            c07071 = new C07071(continuation);
        }
        Object terminalInformation = c07071.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        switch (c07071.label) {
            case 0:
                ResultKt.throwOnFailure(terminalInformation);
                String address = device.getAddress();
                if (address == null || address.length() == 0) {
                    return new Result.Failure(new Error.OnTerminal(null, 1, null));
                }
                if (this._isConnected.getValue().booleanValue()) {
                    closeConnection();
                }
                setUpBluetooth();
                pinPadSdkWrapper = this.pinPadSdkWrapper;
                if (pinPadSdkWrapper == null) {
                    return new Result.Failure(new Error.OnTerminal(null, 1, null));
                }
                String address2 = device.getAddress();
                Intrinsics.checkNotNull(address2);
                c07071.L$0 = this;
                c07071.L$1 = pinPadSdkWrapper;
                c07071.label = 1;
                Object objConnect = pinPadSdkWrapper.connect(address2, c07071);
                if (objConnect == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = objConnect;
                eglobalBluetoothController = this;
                result = (Result) obj;
                if (result instanceof Result.Success) {
                    if (result instanceof Result.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    myBluetoothService = eglobalBluetoothController.bluetoothService;
                    if (myBluetoothService != null) {
                        myBluetoothService.stop();
                    }
                    eglobalBluetoothController.notifyConnectionStatus(false);
                    return new Result.Failure(((Result.Failure) result).getError());
                }
                if (Intrinsics.areEqual(((Result.Success) result).getData(), Boxing.boxBoolean(true))) {
                    myBluetoothService2 = eglobalBluetoothController.bluetoothService;
                    if (myBluetoothService2 != null) {
                        myBluetoothService2.stop();
                    }
                    eglobalBluetoothController.notifyConnectionStatus(false);
                    return new Result.Failure(new Error.OnTerminal(null, 1, null));
                }
                c07071.L$0 = eglobalBluetoothController;
                c07071.L$1 = null;
                c07071.label = 2;
                terminalInformation = pinPadSdkWrapper.getTerminalInformation(c07071);
                if (terminalInformation == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result2 = (Result) terminalInformation;
                if (!mx.openpay.library.domain.util.ResultKt.isSuccess(result2)) {
                    eglobalBluetoothController.notifyConnectionStatus(false);
                    eglobalBluetoothController.closeConnection();
                    return new Result.Failure(new Error.OnTerminal(null, 1, null));
                }
                connectedDeviceQ8MapToConnectedDeviceQ8 = ConnectedDeviceQ8MapperKt.mapToConnectedDeviceQ8((Q8Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2));
                insertConnectedDeviceInfoUseCase = eglobalBluetoothController.insertConnectedDeviceInfoUseCase;
                c07071.L$0 = eglobalBluetoothController;
                c07071.L$1 = connectedDeviceQ8MapToConnectedDeviceQ8;
                c07071.label = 3;
                if (insertConnectedDeviceInfoUseCase.invoke(connectedDeviceQ8MapToConnectedDeviceQ8, c07071) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                eglobalBluetoothController2 = eglobalBluetoothController;
                connectedDeviceQ8 = connectedDeviceQ8MapToConnectedDeviceQ8;
                c07071.L$0 = eglobalBluetoothController2;
                c07071.L$1 = connectedDeviceQ8;
                c07071.label = 4;
                terminalInformation = eglobalBluetoothController2.fetchMerchantInfo(connectedDeviceQ8, c07071);
                if (terminalInformation == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result3 = (Result) terminalInformation;
                if (!(result3 instanceof Result.Success)) {
                    if (!(result3 instanceof Result.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eglobalBluetoothController2.notifyConnectionStatus(false);
                    eglobalBluetoothController2.closeConnection();
                    return new Result.Failure(((Result.Failure) result3).getError());
                }
                if (!eglobalBluetoothController2.isProdEnv || eglobalBluetoothController2.isDevCertEnv) {
                    GetKeyInjectedDateBySerialUseCase getKeyInjectedDateBySerialUseCase = eglobalBluetoothController2.getKeyInjectedDateBySerialUseCase;
                    String serial3 = connectedDeviceQ8.getSerial();
                    c07071.L$0 = eglobalBluetoothController2;
                    c07071.L$1 = connectedDeviceQ8;
                    c07071.L$2 = result3;
                    c07071.label = 5;
                    objInvoke = getKeyInjectedDateBySerialUseCase.invoke(serial3, c07071);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    EglobalBluetoothController eglobalBluetoothController6 = eglobalBluetoothController2;
                    connectedDeviceQ9 = connectedDeviceQ8;
                    result4 = result3;
                    terminalInformation = objInvoke;
                    eglobalBluetoothController3 = eglobalBluetoothController6;
                    if (TextUtils.isEmpty((CharSequence) terminalInformation)) {
                        GetRenewKeyBySlotAndTerminalUseCase getRenewKeyBySlotAndTerminalUseCase = eglobalBluetoothController3.getRenewKeyBySlotAndTerminalUseCase;
                        int i12 = Integer.parseInt(connectedDeviceQ9.getSlotKey());
                        String serial4 = connectedDeviceQ9.getSerial();
                        c07071.L$0 = eglobalBluetoothController3;
                        c07071.L$1 = connectedDeviceQ9;
                        c07071.L$2 = result4;
                        c07071.label = 6;
                        terminalInformation = getRenewKeyBySlotAndTerminalUseCase.invoke(i12, serial4, c07071);
                        if (terminalInformation == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (((Number) terminalInformation).intValue() == 1) {
                            c07071.L$0 = eglobalBluetoothController3;
                            c07071.L$1 = connectedDeviceQ9;
                            c07071.L$2 = result4;
                            c07071.label = 7;
                            terminalInformation = eglobalBluetoothController3.executeKeysInitialSetOfCommands(connectedDeviceQ9, true, c07071);
                            if (terminalInformation == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            EglobalBluetoothController eglobalBluetoothController7 = eglobalBluetoothController3;
                            connectedDeviceQ10 = connectedDeviceQ9;
                            eglobalBluetoothController4 = eglobalBluetoothController7;
                            result5 = (Result) terminalInformation;
                            if (result5 instanceof Result.Success) {
                                if (result5 instanceof Result.Failure) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                eglobalBluetoothController4.notifyConnectionStatus(false);
                                eglobalBluetoothController4.closeConnection();
                                return new Result.Failure(((Result.Failure) result5).getError());
                            }
                            String keyName = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result4)).getSlotKey().getKeyName();
                            c07071.L$0 = eglobalBluetoothController4;
                            c07071.L$1 = connectedDeviceQ10;
                            c07071.L$2 = null;
                            c07071.label = 8;
                            terminalInformation = eglobalBluetoothController4.commandInjectionZ13(keyName, c07071);
                            if (terminalInformation == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            connectedDeviceQ11 = connectedDeviceQ10;
                            result6 = (Result) terminalInformation;
                            if (!(result6 instanceof Result.Success)) {
                                if (!(result6 instanceof Result.Failure)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                eglobalBluetoothController4.notifyConnectionStatus(false);
                                eglobalBluetoothController4.closeConnection();
                                return new Result.Failure(((Result.Failure) result6).getError());
                            }
                            updateKeyInjectedDateBySerialUseCase = eglobalBluetoothController4.updateKeyInjectedDateBySerialUseCase;
                            todayDateFormatted = CalendarUtils.INSTANCE.getTodayDateFormatted();
                            serial = connectedDeviceQ11.getSerial();
                            c07071.L$0 = eglobalBluetoothController4;
                            c07071.L$1 = connectedDeviceQ11;
                            c07071.label = 9;
                            if (updateKeyInjectedDateBySerialUseCase.invoke(todayDateFormatted, serial, c07071) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            ConnectedDeviceQ8 connectedDeviceQ12 = connectedDeviceQ11;
                            eglobalBluetoothController5 = eglobalBluetoothController4;
                            updateMerchantSlotKeyInjectedBySlotUseCase = eglobalBluetoothController5.updateMerchantSlotKeyInjectedBySlotUseCase;
                            i10 = Integer.parseInt(connectedDeviceQ12.getSlotKey());
                            serial2 = connectedDeviceQ12.getSerial();
                            c07071.L$0 = eglobalBluetoothController5;
                            c07071.L$1 = null;
                            c07071.label = 10;
                            if (updateMerchantSlotKeyInjectedBySlotUseCase.invoke(i10, serial2, 1, c07071) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            eglobalBluetoothController5.notifyConnectionStatus(true);
                            return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
                        }
                    }
                    eglobalBluetoothController2 = eglobalBluetoothController3;
                }
                eglobalBluetoothController2.notifyConnectionStatus(true);
                return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
            case 1:
                PinPadSdkWrapper pinPadSdkWrapper2 = (PinPadSdkWrapper) c07071.L$1;
                EglobalBluetoothController eglobalBluetoothController8 = (EglobalBluetoothController) c07071.L$0;
                ResultKt.throwOnFailure(terminalInformation);
                pinPadSdkWrapper = pinPadSdkWrapper2;
                eglobalBluetoothController = eglobalBluetoothController8;
                obj = terminalInformation;
                result = (Result) obj;
                if (result instanceof Result.Success) {
                    if (result instanceof Result.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    myBluetoothService = eglobalBluetoothController.bluetoothService;
                    if (myBluetoothService != null) {
                        myBluetoothService.stop();
                    }
                    eglobalBluetoothController.notifyConnectionStatus(false);
                    return new Result.Failure(((Result.Failure) result).getError());
                }
                if (Intrinsics.areEqual(((Result.Success) result).getData(), Boxing.boxBoolean(true))) {
                    myBluetoothService2 = eglobalBluetoothController.bluetoothService;
                    if (myBluetoothService2 != null) {
                        myBluetoothService2.stop();
                    }
                    eglobalBluetoothController.notifyConnectionStatus(false);
                    return new Result.Failure(new Error.OnTerminal(null, 1, null));
                }
                c07071.L$0 = eglobalBluetoothController;
                c07071.L$1 = null;
                c07071.label = 2;
                terminalInformation = pinPadSdkWrapper.getTerminalInformation(c07071);
                if (terminalInformation == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result2 = (Result) terminalInformation;
                if (!mx.openpay.library.domain.util.ResultKt.isSuccess(result2)) {
                    eglobalBluetoothController.notifyConnectionStatus(false);
                    eglobalBluetoothController.closeConnection();
                    return new Result.Failure(new Error.OnTerminal(null, 1, null));
                }
                connectedDeviceQ8MapToConnectedDeviceQ8 = ConnectedDeviceQ8MapperKt.mapToConnectedDeviceQ8((Q8Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2));
                insertConnectedDeviceInfoUseCase = eglobalBluetoothController.insertConnectedDeviceInfoUseCase;
                c07071.L$0 = eglobalBluetoothController;
                c07071.L$1 = connectedDeviceQ8MapToConnectedDeviceQ8;
                c07071.label = 3;
                if (insertConnectedDeviceInfoUseCase.invoke(connectedDeviceQ8MapToConnectedDeviceQ8, c07071) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                eglobalBluetoothController2 = eglobalBluetoothController;
                connectedDeviceQ8 = connectedDeviceQ8MapToConnectedDeviceQ8;
                c07071.L$0 = eglobalBluetoothController2;
                c07071.L$1 = connectedDeviceQ8;
                c07071.label = 4;
                terminalInformation = eglobalBluetoothController2.fetchMerchantInfo(connectedDeviceQ8, c07071);
                if (terminalInformation == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result3 = (Result) terminalInformation;
                if (!(result3 instanceof Result.Success)) {
                    if (!(result3 instanceof Result.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eglobalBluetoothController2.notifyConnectionStatus(false);
                    eglobalBluetoothController2.closeConnection();
                    return new Result.Failure(((Result.Failure) result3).getError());
                }
                if (!eglobalBluetoothController2.isProdEnv) {
                    break;
                }
                GetKeyInjectedDateBySerialUseCase getKeyInjectedDateBySerialUseCase2 = eglobalBluetoothController2.getKeyInjectedDateBySerialUseCase;
                String serial5 = connectedDeviceQ8.getSerial();
                c07071.L$0 = eglobalBluetoothController2;
                c07071.L$1 = connectedDeviceQ8;
                c07071.L$2 = result3;
                c07071.label = 5;
                objInvoke = getKeyInjectedDateBySerialUseCase2.invoke(serial5, c07071);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                EglobalBluetoothController eglobalBluetoothController9 = eglobalBluetoothController2;
                connectedDeviceQ9 = connectedDeviceQ8;
                result4 = result3;
                terminalInformation = objInvoke;
                eglobalBluetoothController3 = eglobalBluetoothController9;
                if (TextUtils.isEmpty((CharSequence) terminalInformation)) {
                    GetRenewKeyBySlotAndTerminalUseCase getRenewKeyBySlotAndTerminalUseCase2 = eglobalBluetoothController3.getRenewKeyBySlotAndTerminalUseCase;
                    int i13 = Integer.parseInt(connectedDeviceQ9.getSlotKey());
                    String serial6 = connectedDeviceQ9.getSerial();
                    c07071.L$0 = eglobalBluetoothController3;
                    c07071.L$1 = connectedDeviceQ9;
                    c07071.L$2 = result4;
                    c07071.label = 6;
                    terminalInformation = getRenewKeyBySlotAndTerminalUseCase2.invoke(i13, serial6, c07071);
                    if (terminalInformation == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Number) terminalInformation).intValue() == 1) {
                        c07071.L$0 = eglobalBluetoothController3;
                        c07071.L$1 = connectedDeviceQ9;
                        c07071.L$2 = result4;
                        c07071.label = 7;
                        terminalInformation = eglobalBluetoothController3.executeKeysInitialSetOfCommands(connectedDeviceQ9, true, c07071);
                        if (terminalInformation == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        EglobalBluetoothController eglobalBluetoothController10 = eglobalBluetoothController3;
                        connectedDeviceQ10 = connectedDeviceQ9;
                        eglobalBluetoothController4 = eglobalBluetoothController10;
                        result5 = (Result) terminalInformation;
                        if (result5 instanceof Result.Success) {
                            if (result5 instanceof Result.Failure) {
                                throw new NoWhenBranchMatchedException();
                            }
                            eglobalBluetoothController4.notifyConnectionStatus(false);
                            eglobalBluetoothController4.closeConnection();
                            return new Result.Failure(((Result.Failure) result5).getError());
                        }
                        String keyName2 = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result4)).getSlotKey().getKeyName();
                        c07071.L$0 = eglobalBluetoothController4;
                        c07071.L$1 = connectedDeviceQ10;
                        c07071.L$2 = null;
                        c07071.label = 8;
                        terminalInformation = eglobalBluetoothController4.commandInjectionZ13(keyName2, c07071);
                        if (terminalInformation == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        connectedDeviceQ11 = connectedDeviceQ10;
                        result6 = (Result) terminalInformation;
                        if (!(result6 instanceof Result.Success)) {
                            if (!(result6 instanceof Result.Failure)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            eglobalBluetoothController4.notifyConnectionStatus(false);
                            eglobalBluetoothController4.closeConnection();
                            return new Result.Failure(((Result.Failure) result6).getError());
                        }
                        updateKeyInjectedDateBySerialUseCase = eglobalBluetoothController4.updateKeyInjectedDateBySerialUseCase;
                        todayDateFormatted = CalendarUtils.INSTANCE.getTodayDateFormatted();
                        serial = connectedDeviceQ11.getSerial();
                        c07071.L$0 = eglobalBluetoothController4;
                        c07071.L$1 = connectedDeviceQ11;
                        c07071.label = 9;
                        if (updateKeyInjectedDateBySerialUseCase.invoke(todayDateFormatted, serial, c07071) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ConnectedDeviceQ8 connectedDeviceQ13 = connectedDeviceQ11;
                        eglobalBluetoothController5 = eglobalBluetoothController4;
                        updateMerchantSlotKeyInjectedBySlotUseCase = eglobalBluetoothController5.updateMerchantSlotKeyInjectedBySlotUseCase;
                        i10 = Integer.parseInt(connectedDeviceQ13.getSlotKey());
                        serial2 = connectedDeviceQ13.getSerial();
                        c07071.L$0 = eglobalBluetoothController5;
                        c07071.L$1 = null;
                        c07071.label = 10;
                        if (updateMerchantSlotKeyInjectedBySlotUseCase.invoke(i10, serial2, 1, c07071) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        eglobalBluetoothController5.notifyConnectionStatus(true);
                        return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
                    }
                }
                eglobalBluetoothController2 = eglobalBluetoothController3;
                eglobalBluetoothController2.notifyConnectionStatus(true);
                return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
            case 2:
                eglobalBluetoothController = (EglobalBluetoothController) c07071.L$0;
                ResultKt.throwOnFailure(terminalInformation);
                result2 = (Result) terminalInformation;
                if (!mx.openpay.library.domain.util.ResultKt.isSuccess(result2)) {
                    eglobalBluetoothController.notifyConnectionStatus(false);
                    eglobalBluetoothController.closeConnection();
                    return new Result.Failure(new Error.OnTerminal(null, 1, null));
                }
                connectedDeviceQ8MapToConnectedDeviceQ8 = ConnectedDeviceQ8MapperKt.mapToConnectedDeviceQ8((Q8Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2));
                insertConnectedDeviceInfoUseCase = eglobalBluetoothController.insertConnectedDeviceInfoUseCase;
                c07071.L$0 = eglobalBluetoothController;
                c07071.L$1 = connectedDeviceQ8MapToConnectedDeviceQ8;
                c07071.label = 3;
                if (insertConnectedDeviceInfoUseCase.invoke(connectedDeviceQ8MapToConnectedDeviceQ8, c07071) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                eglobalBluetoothController2 = eglobalBluetoothController;
                connectedDeviceQ8 = connectedDeviceQ8MapToConnectedDeviceQ8;
                c07071.L$0 = eglobalBluetoothController2;
                c07071.L$1 = connectedDeviceQ8;
                c07071.label = 4;
                terminalInformation = eglobalBluetoothController2.fetchMerchantInfo(connectedDeviceQ8, c07071);
                if (terminalInformation == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result3 = (Result) terminalInformation;
                if (!(result3 instanceof Result.Success)) {
                    if (!(result3 instanceof Result.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eglobalBluetoothController2.notifyConnectionStatus(false);
                    eglobalBluetoothController2.closeConnection();
                    return new Result.Failure(((Result.Failure) result3).getError());
                }
                if (!eglobalBluetoothController2.isProdEnv) {
                    break;
                }
                GetKeyInjectedDateBySerialUseCase getKeyInjectedDateBySerialUseCase3 = eglobalBluetoothController2.getKeyInjectedDateBySerialUseCase;
                String serial7 = connectedDeviceQ8.getSerial();
                c07071.L$0 = eglobalBluetoothController2;
                c07071.L$1 = connectedDeviceQ8;
                c07071.L$2 = result3;
                c07071.label = 5;
                objInvoke = getKeyInjectedDateBySerialUseCase3.invoke(serial7, c07071);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                EglobalBluetoothController eglobalBluetoothController11 = eglobalBluetoothController2;
                connectedDeviceQ9 = connectedDeviceQ8;
                result4 = result3;
                terminalInformation = objInvoke;
                eglobalBluetoothController3 = eglobalBluetoothController11;
                if (TextUtils.isEmpty((CharSequence) terminalInformation)) {
                    GetRenewKeyBySlotAndTerminalUseCase getRenewKeyBySlotAndTerminalUseCase3 = eglobalBluetoothController3.getRenewKeyBySlotAndTerminalUseCase;
                    int i14 = Integer.parseInt(connectedDeviceQ9.getSlotKey());
                    String serial8 = connectedDeviceQ9.getSerial();
                    c07071.L$0 = eglobalBluetoothController3;
                    c07071.L$1 = connectedDeviceQ9;
                    c07071.L$2 = result4;
                    c07071.label = 6;
                    terminalInformation = getRenewKeyBySlotAndTerminalUseCase3.invoke(i14, serial8, c07071);
                    if (terminalInformation == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Number) terminalInformation).intValue() == 1) {
                        c07071.L$0 = eglobalBluetoothController3;
                        c07071.L$1 = connectedDeviceQ9;
                        c07071.L$2 = result4;
                        c07071.label = 7;
                        terminalInformation = eglobalBluetoothController3.executeKeysInitialSetOfCommands(connectedDeviceQ9, true, c07071);
                        if (terminalInformation == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        EglobalBluetoothController eglobalBluetoothController12 = eglobalBluetoothController3;
                        connectedDeviceQ10 = connectedDeviceQ9;
                        eglobalBluetoothController4 = eglobalBluetoothController12;
                        result5 = (Result) terminalInformation;
                        if (result5 instanceof Result.Success) {
                            if (result5 instanceof Result.Failure) {
                                throw new NoWhenBranchMatchedException();
                            }
                            eglobalBluetoothController4.notifyConnectionStatus(false);
                            eglobalBluetoothController4.closeConnection();
                            return new Result.Failure(((Result.Failure) result5).getError());
                        }
                        String keyName3 = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result4)).getSlotKey().getKeyName();
                        c07071.L$0 = eglobalBluetoothController4;
                        c07071.L$1 = connectedDeviceQ10;
                        c07071.L$2 = null;
                        c07071.label = 8;
                        terminalInformation = eglobalBluetoothController4.commandInjectionZ13(keyName3, c07071);
                        if (terminalInformation == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        connectedDeviceQ11 = connectedDeviceQ10;
                        result6 = (Result) terminalInformation;
                        if (!(result6 instanceof Result.Success)) {
                            if (!(result6 instanceof Result.Failure)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            eglobalBluetoothController4.notifyConnectionStatus(false);
                            eglobalBluetoothController4.closeConnection();
                            return new Result.Failure(((Result.Failure) result6).getError());
                        }
                        updateKeyInjectedDateBySerialUseCase = eglobalBluetoothController4.updateKeyInjectedDateBySerialUseCase;
                        todayDateFormatted = CalendarUtils.INSTANCE.getTodayDateFormatted();
                        serial = connectedDeviceQ11.getSerial();
                        c07071.L$0 = eglobalBluetoothController4;
                        c07071.L$1 = connectedDeviceQ11;
                        c07071.label = 9;
                        if (updateKeyInjectedDateBySerialUseCase.invoke(todayDateFormatted, serial, c07071) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ConnectedDeviceQ8 connectedDeviceQ14 = connectedDeviceQ11;
                        eglobalBluetoothController5 = eglobalBluetoothController4;
                        updateMerchantSlotKeyInjectedBySlotUseCase = eglobalBluetoothController5.updateMerchantSlotKeyInjectedBySlotUseCase;
                        i10 = Integer.parseInt(connectedDeviceQ14.getSlotKey());
                        serial2 = connectedDeviceQ14.getSerial();
                        c07071.L$0 = eglobalBluetoothController5;
                        c07071.L$1 = null;
                        c07071.label = 10;
                        if (updateMerchantSlotKeyInjectedBySlotUseCase.invoke(i10, serial2, 1, c07071) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        eglobalBluetoothController5.notifyConnectionStatus(true);
                        return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
                    }
                }
                eglobalBluetoothController2 = eglobalBluetoothController3;
                eglobalBluetoothController2.notifyConnectionStatus(true);
                return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
            case 3:
                connectedDeviceQ8 = (ConnectedDeviceQ8) c07071.L$1;
                eglobalBluetoothController2 = (EglobalBluetoothController) c07071.L$0;
                ResultKt.throwOnFailure(terminalInformation);
                c07071.L$0 = eglobalBluetoothController2;
                c07071.L$1 = connectedDeviceQ8;
                c07071.label = 4;
                terminalInformation = eglobalBluetoothController2.fetchMerchantInfo(connectedDeviceQ8, c07071);
                if (terminalInformation == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result3 = (Result) terminalInformation;
                if (!(result3 instanceof Result.Success)) {
                    if (!(result3 instanceof Result.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eglobalBluetoothController2.notifyConnectionStatus(false);
                    eglobalBluetoothController2.closeConnection();
                    return new Result.Failure(((Result.Failure) result3).getError());
                }
                if (!eglobalBluetoothController2.isProdEnv) {
                    break;
                }
                GetKeyInjectedDateBySerialUseCase getKeyInjectedDateBySerialUseCase4 = eglobalBluetoothController2.getKeyInjectedDateBySerialUseCase;
                String serial9 = connectedDeviceQ8.getSerial();
                c07071.L$0 = eglobalBluetoothController2;
                c07071.L$1 = connectedDeviceQ8;
                c07071.L$2 = result3;
                c07071.label = 5;
                objInvoke = getKeyInjectedDateBySerialUseCase4.invoke(serial9, c07071);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                EglobalBluetoothController eglobalBluetoothController13 = eglobalBluetoothController2;
                connectedDeviceQ9 = connectedDeviceQ8;
                result4 = result3;
                terminalInformation = objInvoke;
                eglobalBluetoothController3 = eglobalBluetoothController13;
                if (TextUtils.isEmpty((CharSequence) terminalInformation)) {
                    GetRenewKeyBySlotAndTerminalUseCase getRenewKeyBySlotAndTerminalUseCase4 = eglobalBluetoothController3.getRenewKeyBySlotAndTerminalUseCase;
                    int i15 = Integer.parseInt(connectedDeviceQ9.getSlotKey());
                    String serial10 = connectedDeviceQ9.getSerial();
                    c07071.L$0 = eglobalBluetoothController3;
                    c07071.L$1 = connectedDeviceQ9;
                    c07071.L$2 = result4;
                    c07071.label = 6;
                    terminalInformation = getRenewKeyBySlotAndTerminalUseCase4.invoke(i15, serial10, c07071);
                    if (terminalInformation == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Number) terminalInformation).intValue() == 1) {
                        c07071.L$0 = eglobalBluetoothController3;
                        c07071.L$1 = connectedDeviceQ9;
                        c07071.L$2 = result4;
                        c07071.label = 7;
                        terminalInformation = eglobalBluetoothController3.executeKeysInitialSetOfCommands(connectedDeviceQ9, true, c07071);
                        if (terminalInformation == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        EglobalBluetoothController eglobalBluetoothController14 = eglobalBluetoothController3;
                        connectedDeviceQ10 = connectedDeviceQ9;
                        eglobalBluetoothController4 = eglobalBluetoothController14;
                        result5 = (Result) terminalInformation;
                        if (result5 instanceof Result.Success) {
                            if (result5 instanceof Result.Failure) {
                                throw new NoWhenBranchMatchedException();
                            }
                            eglobalBluetoothController4.notifyConnectionStatus(false);
                            eglobalBluetoothController4.closeConnection();
                            return new Result.Failure(((Result.Failure) result5).getError());
                        }
                        String keyName4 = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result4)).getSlotKey().getKeyName();
                        c07071.L$0 = eglobalBluetoothController4;
                        c07071.L$1 = connectedDeviceQ10;
                        c07071.L$2 = null;
                        c07071.label = 8;
                        terminalInformation = eglobalBluetoothController4.commandInjectionZ13(keyName4, c07071);
                        if (terminalInformation == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        connectedDeviceQ11 = connectedDeviceQ10;
                        result6 = (Result) terminalInformation;
                        if (!(result6 instanceof Result.Success)) {
                            if (!(result6 instanceof Result.Failure)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            eglobalBluetoothController4.notifyConnectionStatus(false);
                            eglobalBluetoothController4.closeConnection();
                            return new Result.Failure(((Result.Failure) result6).getError());
                        }
                        updateKeyInjectedDateBySerialUseCase = eglobalBluetoothController4.updateKeyInjectedDateBySerialUseCase;
                        todayDateFormatted = CalendarUtils.INSTANCE.getTodayDateFormatted();
                        serial = connectedDeviceQ11.getSerial();
                        c07071.L$0 = eglobalBluetoothController4;
                        c07071.L$1 = connectedDeviceQ11;
                        c07071.label = 9;
                        if (updateKeyInjectedDateBySerialUseCase.invoke(todayDateFormatted, serial, c07071) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ConnectedDeviceQ8 connectedDeviceQ15 = connectedDeviceQ11;
                        eglobalBluetoothController5 = eglobalBluetoothController4;
                        updateMerchantSlotKeyInjectedBySlotUseCase = eglobalBluetoothController5.updateMerchantSlotKeyInjectedBySlotUseCase;
                        i10 = Integer.parseInt(connectedDeviceQ15.getSlotKey());
                        serial2 = connectedDeviceQ15.getSerial();
                        c07071.L$0 = eglobalBluetoothController5;
                        c07071.L$1 = null;
                        c07071.label = 10;
                        if (updateMerchantSlotKeyInjectedBySlotUseCase.invoke(i10, serial2, 1, c07071) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        eglobalBluetoothController5.notifyConnectionStatus(true);
                        return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
                    }
                }
                eglobalBluetoothController2 = eglobalBluetoothController3;
                eglobalBluetoothController2.notifyConnectionStatus(true);
                return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
            case 4:
                connectedDeviceQ8 = (ConnectedDeviceQ8) c07071.L$1;
                eglobalBluetoothController2 = (EglobalBluetoothController) c07071.L$0;
                ResultKt.throwOnFailure(terminalInformation);
                result3 = (Result) terminalInformation;
                if (!(result3 instanceof Result.Success)) {
                    if (!(result3 instanceof Result.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eglobalBluetoothController2.notifyConnectionStatus(false);
                    eglobalBluetoothController2.closeConnection();
                    return new Result.Failure(((Result.Failure) result3).getError());
                }
                if (!eglobalBluetoothController2.isProdEnv) {
                    break;
                }
                GetKeyInjectedDateBySerialUseCase getKeyInjectedDateBySerialUseCase5 = eglobalBluetoothController2.getKeyInjectedDateBySerialUseCase;
                String serial11 = connectedDeviceQ8.getSerial();
                c07071.L$0 = eglobalBluetoothController2;
                c07071.L$1 = connectedDeviceQ8;
                c07071.L$2 = result3;
                c07071.label = 5;
                objInvoke = getKeyInjectedDateBySerialUseCase5.invoke(serial11, c07071);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                EglobalBluetoothController eglobalBluetoothController15 = eglobalBluetoothController2;
                connectedDeviceQ9 = connectedDeviceQ8;
                result4 = result3;
                terminalInformation = objInvoke;
                eglobalBluetoothController3 = eglobalBluetoothController15;
                if (TextUtils.isEmpty((CharSequence) terminalInformation)) {
                    GetRenewKeyBySlotAndTerminalUseCase getRenewKeyBySlotAndTerminalUseCase5 = eglobalBluetoothController3.getRenewKeyBySlotAndTerminalUseCase;
                    int i16 = Integer.parseInt(connectedDeviceQ9.getSlotKey());
                    String serial12 = connectedDeviceQ9.getSerial();
                    c07071.L$0 = eglobalBluetoothController3;
                    c07071.L$1 = connectedDeviceQ9;
                    c07071.L$2 = result4;
                    c07071.label = 6;
                    terminalInformation = getRenewKeyBySlotAndTerminalUseCase5.invoke(i16, serial12, c07071);
                    if (terminalInformation == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Number) terminalInformation).intValue() == 1) {
                        c07071.L$0 = eglobalBluetoothController3;
                        c07071.L$1 = connectedDeviceQ9;
                        c07071.L$2 = result4;
                        c07071.label = 7;
                        terminalInformation = eglobalBluetoothController3.executeKeysInitialSetOfCommands(connectedDeviceQ9, true, c07071);
                        if (terminalInformation == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        EglobalBluetoothController eglobalBluetoothController16 = eglobalBluetoothController3;
                        connectedDeviceQ10 = connectedDeviceQ9;
                        eglobalBluetoothController4 = eglobalBluetoothController16;
                        result5 = (Result) terminalInformation;
                        if (result5 instanceof Result.Success) {
                            if (result5 instanceof Result.Failure) {
                                throw new NoWhenBranchMatchedException();
                            }
                            eglobalBluetoothController4.notifyConnectionStatus(false);
                            eglobalBluetoothController4.closeConnection();
                            return new Result.Failure(((Result.Failure) result5).getError());
                        }
                        String keyName5 = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result4)).getSlotKey().getKeyName();
                        c07071.L$0 = eglobalBluetoothController4;
                        c07071.L$1 = connectedDeviceQ10;
                        c07071.L$2 = null;
                        c07071.label = 8;
                        terminalInformation = eglobalBluetoothController4.commandInjectionZ13(keyName5, c07071);
                        if (terminalInformation == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        connectedDeviceQ11 = connectedDeviceQ10;
                        result6 = (Result) terminalInformation;
                        if (!(result6 instanceof Result.Success)) {
                            if (!(result6 instanceof Result.Failure)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            eglobalBluetoothController4.notifyConnectionStatus(false);
                            eglobalBluetoothController4.closeConnection();
                            return new Result.Failure(((Result.Failure) result6).getError());
                        }
                        updateKeyInjectedDateBySerialUseCase = eglobalBluetoothController4.updateKeyInjectedDateBySerialUseCase;
                        todayDateFormatted = CalendarUtils.INSTANCE.getTodayDateFormatted();
                        serial = connectedDeviceQ11.getSerial();
                        c07071.L$0 = eglobalBluetoothController4;
                        c07071.L$1 = connectedDeviceQ11;
                        c07071.label = 9;
                        if (updateKeyInjectedDateBySerialUseCase.invoke(todayDateFormatted, serial, c07071) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ConnectedDeviceQ8 connectedDeviceQ16 = connectedDeviceQ11;
                        eglobalBluetoothController5 = eglobalBluetoothController4;
                        updateMerchantSlotKeyInjectedBySlotUseCase = eglobalBluetoothController5.updateMerchantSlotKeyInjectedBySlotUseCase;
                        i10 = Integer.parseInt(connectedDeviceQ16.getSlotKey());
                        serial2 = connectedDeviceQ16.getSerial();
                        c07071.L$0 = eglobalBluetoothController5;
                        c07071.L$1 = null;
                        c07071.label = 10;
                        if (updateMerchantSlotKeyInjectedBySlotUseCase.invoke(i10, serial2, 1, c07071) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        eglobalBluetoothController5.notifyConnectionStatus(true);
                        return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
                    }
                }
                eglobalBluetoothController2 = eglobalBluetoothController3;
                eglobalBluetoothController2.notifyConnectionStatus(true);
                return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
            case 5:
                result4 = (Result) c07071.L$2;
                connectedDeviceQ9 = (ConnectedDeviceQ8) c07071.L$1;
                eglobalBluetoothController3 = (EglobalBluetoothController) c07071.L$0;
                ResultKt.throwOnFailure(terminalInformation);
                if (TextUtils.isEmpty((CharSequence) terminalInformation)) {
                    GetRenewKeyBySlotAndTerminalUseCase getRenewKeyBySlotAndTerminalUseCase6 = eglobalBluetoothController3.getRenewKeyBySlotAndTerminalUseCase;
                    int i17 = Integer.parseInt(connectedDeviceQ9.getSlotKey());
                    String serial13 = connectedDeviceQ9.getSerial();
                    c07071.L$0 = eglobalBluetoothController3;
                    c07071.L$1 = connectedDeviceQ9;
                    c07071.L$2 = result4;
                    c07071.label = 6;
                    terminalInformation = getRenewKeyBySlotAndTerminalUseCase6.invoke(i17, serial13, c07071);
                    if (terminalInformation == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Number) terminalInformation).intValue() == 1) {
                        c07071.L$0 = eglobalBluetoothController3;
                        c07071.L$1 = connectedDeviceQ9;
                        c07071.L$2 = result4;
                        c07071.label = 7;
                        terminalInformation = eglobalBluetoothController3.executeKeysInitialSetOfCommands(connectedDeviceQ9, true, c07071);
                        if (terminalInformation == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        EglobalBluetoothController eglobalBluetoothController17 = eglobalBluetoothController3;
                        connectedDeviceQ10 = connectedDeviceQ9;
                        eglobalBluetoothController4 = eglobalBluetoothController17;
                        result5 = (Result) terminalInformation;
                        if (result5 instanceof Result.Success) {
                            if (result5 instanceof Result.Failure) {
                                throw new NoWhenBranchMatchedException();
                            }
                            eglobalBluetoothController4.notifyConnectionStatus(false);
                            eglobalBluetoothController4.closeConnection();
                            return new Result.Failure(((Result.Failure) result5).getError());
                        }
                        String keyName6 = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result4)).getSlotKey().getKeyName();
                        c07071.L$0 = eglobalBluetoothController4;
                        c07071.L$1 = connectedDeviceQ10;
                        c07071.L$2 = null;
                        c07071.label = 8;
                        terminalInformation = eglobalBluetoothController4.commandInjectionZ13(keyName6, c07071);
                        if (terminalInformation == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        connectedDeviceQ11 = connectedDeviceQ10;
                        result6 = (Result) terminalInformation;
                        if (!(result6 instanceof Result.Success)) {
                            if (!(result6 instanceof Result.Failure)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            eglobalBluetoothController4.notifyConnectionStatus(false);
                            eglobalBluetoothController4.closeConnection();
                            return new Result.Failure(((Result.Failure) result6).getError());
                        }
                        updateKeyInjectedDateBySerialUseCase = eglobalBluetoothController4.updateKeyInjectedDateBySerialUseCase;
                        todayDateFormatted = CalendarUtils.INSTANCE.getTodayDateFormatted();
                        serial = connectedDeviceQ11.getSerial();
                        c07071.L$0 = eglobalBluetoothController4;
                        c07071.L$1 = connectedDeviceQ11;
                        c07071.label = 9;
                        if (updateKeyInjectedDateBySerialUseCase.invoke(todayDateFormatted, serial, c07071) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ConnectedDeviceQ8 connectedDeviceQ17 = connectedDeviceQ11;
                        eglobalBluetoothController5 = eglobalBluetoothController4;
                        updateMerchantSlotKeyInjectedBySlotUseCase = eglobalBluetoothController5.updateMerchantSlotKeyInjectedBySlotUseCase;
                        i10 = Integer.parseInt(connectedDeviceQ17.getSlotKey());
                        serial2 = connectedDeviceQ17.getSerial();
                        c07071.L$0 = eglobalBluetoothController5;
                        c07071.L$1 = null;
                        c07071.label = 10;
                        if (updateMerchantSlotKeyInjectedBySlotUseCase.invoke(i10, serial2, 1, c07071) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        eglobalBluetoothController5.notifyConnectionStatus(true);
                        return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
                    }
                }
                eglobalBluetoothController2 = eglobalBluetoothController3;
                eglobalBluetoothController2.notifyConnectionStatus(true);
                return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
            case 6:
                result4 = (Result) c07071.L$2;
                connectedDeviceQ9 = (ConnectedDeviceQ8) c07071.L$1;
                eglobalBluetoothController3 = (EglobalBluetoothController) c07071.L$0;
                ResultKt.throwOnFailure(terminalInformation);
                if (((Number) terminalInformation).intValue() == 1) {
                    c07071.L$0 = eglobalBluetoothController3;
                    c07071.L$1 = connectedDeviceQ9;
                    c07071.L$2 = result4;
                    c07071.label = 7;
                    terminalInformation = eglobalBluetoothController3.executeKeysInitialSetOfCommands(connectedDeviceQ9, true, c07071);
                    if (terminalInformation == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    EglobalBluetoothController eglobalBluetoothController18 = eglobalBluetoothController3;
                    connectedDeviceQ10 = connectedDeviceQ9;
                    eglobalBluetoothController4 = eglobalBluetoothController18;
                    result5 = (Result) terminalInformation;
                    if (result5 instanceof Result.Success) {
                        if (result5 instanceof Result.Failure) {
                            throw new NoWhenBranchMatchedException();
                        }
                        eglobalBluetoothController4.notifyConnectionStatus(false);
                        eglobalBluetoothController4.closeConnection();
                        return new Result.Failure(((Result.Failure) result5).getError());
                    }
                    String keyName7 = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result4)).getSlotKey().getKeyName();
                    c07071.L$0 = eglobalBluetoothController4;
                    c07071.L$1 = connectedDeviceQ10;
                    c07071.L$2 = null;
                    c07071.label = 8;
                    terminalInformation = eglobalBluetoothController4.commandInjectionZ13(keyName7, c07071);
                    if (terminalInformation == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    connectedDeviceQ11 = connectedDeviceQ10;
                    result6 = (Result) terminalInformation;
                    if (!(result6 instanceof Result.Success)) {
                        if (!(result6 instanceof Result.Failure)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        eglobalBluetoothController4.notifyConnectionStatus(false);
                        eglobalBluetoothController4.closeConnection();
                        return new Result.Failure(((Result.Failure) result6).getError());
                    }
                    updateKeyInjectedDateBySerialUseCase = eglobalBluetoothController4.updateKeyInjectedDateBySerialUseCase;
                    todayDateFormatted = CalendarUtils.INSTANCE.getTodayDateFormatted();
                    serial = connectedDeviceQ11.getSerial();
                    c07071.L$0 = eglobalBluetoothController4;
                    c07071.L$1 = connectedDeviceQ11;
                    c07071.label = 9;
                    if (updateKeyInjectedDateBySerialUseCase.invoke(todayDateFormatted, serial, c07071) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ConnectedDeviceQ8 connectedDeviceQ18 = connectedDeviceQ11;
                    eglobalBluetoothController5 = eglobalBluetoothController4;
                    updateMerchantSlotKeyInjectedBySlotUseCase = eglobalBluetoothController5.updateMerchantSlotKeyInjectedBySlotUseCase;
                    i10 = Integer.parseInt(connectedDeviceQ18.getSlotKey());
                    serial2 = connectedDeviceQ18.getSerial();
                    c07071.L$0 = eglobalBluetoothController5;
                    c07071.L$1 = null;
                    c07071.label = 10;
                    if (updateMerchantSlotKeyInjectedBySlotUseCase.invoke(i10, serial2, 1, c07071) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    eglobalBluetoothController5.notifyConnectionStatus(true);
                    return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
                }
                eglobalBluetoothController2 = eglobalBluetoothController3;
                eglobalBluetoothController2.notifyConnectionStatus(true);
                return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
            case 7:
                result4 = (Result) c07071.L$2;
                connectedDeviceQ9 = (ConnectedDeviceQ8) c07071.L$1;
                eglobalBluetoothController3 = (EglobalBluetoothController) c07071.L$0;
                ResultKt.throwOnFailure(terminalInformation);
                EglobalBluetoothController eglobalBluetoothController19 = eglobalBluetoothController3;
                connectedDeviceQ10 = connectedDeviceQ9;
                eglobalBluetoothController4 = eglobalBluetoothController19;
                result5 = (Result) terminalInformation;
                if (result5 instanceof Result.Success) {
                    if (result5 instanceof Result.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eglobalBluetoothController4.notifyConnectionStatus(false);
                    eglobalBluetoothController4.closeConnection();
                    return new Result.Failure(((Result.Failure) result5).getError());
                }
                String keyName8 = ((Merchant) mx.openpay.library.domain.util.ResultKt.getSuccessData(result4)).getSlotKey().getKeyName();
                c07071.L$0 = eglobalBluetoothController4;
                c07071.L$1 = connectedDeviceQ10;
                c07071.L$2 = null;
                c07071.label = 8;
                terminalInformation = eglobalBluetoothController4.commandInjectionZ13(keyName8, c07071);
                if (terminalInformation == coroutine_suspended) {
                    return coroutine_suspended;
                }
                connectedDeviceQ11 = connectedDeviceQ10;
                result6 = (Result) terminalInformation;
                if (!(result6 instanceof Result.Success)) {
                    if (!(result6 instanceof Result.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eglobalBluetoothController4.notifyConnectionStatus(false);
                    eglobalBluetoothController4.closeConnection();
                    return new Result.Failure(((Result.Failure) result6).getError());
                }
                updateKeyInjectedDateBySerialUseCase = eglobalBluetoothController4.updateKeyInjectedDateBySerialUseCase;
                todayDateFormatted = CalendarUtils.INSTANCE.getTodayDateFormatted();
                serial = connectedDeviceQ11.getSerial();
                c07071.L$0 = eglobalBluetoothController4;
                c07071.L$1 = connectedDeviceQ11;
                c07071.label = 9;
                if (updateKeyInjectedDateBySerialUseCase.invoke(todayDateFormatted, serial, c07071) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ConnectedDeviceQ8 connectedDeviceQ19 = connectedDeviceQ11;
                eglobalBluetoothController5 = eglobalBluetoothController4;
                updateMerchantSlotKeyInjectedBySlotUseCase = eglobalBluetoothController5.updateMerchantSlotKeyInjectedBySlotUseCase;
                i10 = Integer.parseInt(connectedDeviceQ19.getSlotKey());
                serial2 = connectedDeviceQ19.getSerial();
                c07071.L$0 = eglobalBluetoothController5;
                c07071.L$1 = null;
                c07071.label = 10;
                if (updateMerchantSlotKeyInjectedBySlotUseCase.invoke(i10, serial2, 1, c07071) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                eglobalBluetoothController5.notifyConnectionStatus(true);
                return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
            case 8:
                connectedDeviceQ11 = (ConnectedDeviceQ8) c07071.L$1;
                eglobalBluetoothController4 = (EglobalBluetoothController) c07071.L$0;
                ResultKt.throwOnFailure(terminalInformation);
                result6 = (Result) terminalInformation;
                if (!(result6 instanceof Result.Success)) {
                    if (!(result6 instanceof Result.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eglobalBluetoothController4.notifyConnectionStatus(false);
                    eglobalBluetoothController4.closeConnection();
                    return new Result.Failure(((Result.Failure) result6).getError());
                }
                updateKeyInjectedDateBySerialUseCase = eglobalBluetoothController4.updateKeyInjectedDateBySerialUseCase;
                todayDateFormatted = CalendarUtils.INSTANCE.getTodayDateFormatted();
                serial = connectedDeviceQ11.getSerial();
                c07071.L$0 = eglobalBluetoothController4;
                c07071.L$1 = connectedDeviceQ11;
                c07071.label = 9;
                if (updateKeyInjectedDateBySerialUseCase.invoke(todayDateFormatted, serial, c07071) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ConnectedDeviceQ8 connectedDeviceQ110 = connectedDeviceQ11;
                eglobalBluetoothController5 = eglobalBluetoothController4;
                updateMerchantSlotKeyInjectedBySlotUseCase = eglobalBluetoothController5.updateMerchantSlotKeyInjectedBySlotUseCase;
                i10 = Integer.parseInt(connectedDeviceQ110.getSlotKey());
                serial2 = connectedDeviceQ110.getSerial();
                c07071.L$0 = eglobalBluetoothController5;
                c07071.L$1 = null;
                c07071.label = 10;
                if (updateMerchantSlotKeyInjectedBySlotUseCase.invoke(i10, serial2, 1, c07071) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                eglobalBluetoothController5.notifyConnectionStatus(true);
                return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
            case 9:
                connectedDeviceQ11 = (ConnectedDeviceQ8) c07071.L$1;
                eglobalBluetoothController4 = (EglobalBluetoothController) c07071.L$0;
                ResultKt.throwOnFailure(terminalInformation);
                ConnectedDeviceQ8 connectedDeviceQ111 = connectedDeviceQ11;
                eglobalBluetoothController5 = eglobalBluetoothController4;
                updateMerchantSlotKeyInjectedBySlotUseCase = eglobalBluetoothController5.updateMerchantSlotKeyInjectedBySlotUseCase;
                i10 = Integer.parseInt(connectedDeviceQ111.getSlotKey());
                serial2 = connectedDeviceQ111.getSerial();
                c07071.L$0 = eglobalBluetoothController5;
                c07071.L$1 = null;
                c07071.label = 10;
                if (updateMerchantSlotKeyInjectedBySlotUseCase.invoke(i10, serial2, 1, c07071) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                eglobalBluetoothController5.notifyConnectionStatus(true);
                return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
            case 10:
                eglobalBluetoothController5 = (EglobalBluetoothController) c07071.L$0;
                ResultKt.throwOnFailure(terminalInformation);
                eglobalBluetoothController5.notifyConnectionStatus(true);
                return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:38:0x011a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x011b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0137 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x0139  */
    /* JADX WARN: Code duplicated, block: B:46:0x013d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x013e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // mx.openpay.library.domain.bluetooth.BluetoothController
    @Nullable
    public Object createCharge(@NotNull ChargeRequest chargeRequest, @Nullable ChargeCallback chargeCallback, @NotNull Continuation<? super Result<Charge>> continuation) {
        C07081 c07081;
        ChargeCallback chargeCallback2;
        EglobalBluetoothController eglobalBluetoothController;
        EglobalChargeRequest eglobalChargeRequest;
        ConnectedDeviceQ8 connectedDeviceQ8;
        EglobalBluetoothController eglobalBluetoothController2;
        Result result;
        EglobalBluetoothController eglobalBluetoothController3;
        Object objCommandInjectionC51;
        ConnectedDeviceQ8 connectedDeviceQ9;
        ChargeCallback chargeCallback3;
        EglobalChargeRequest eglobalChargeRequest2;
        EglobalBluetoothController eglobalBluetoothController4;
        if (continuation instanceof C07081) {
            c07081 = (C07081) continuation;
            int i10 = c07081.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07081.label = i10 - Integer.MIN_VALUE;
            } else {
                c07081 = new C07081(continuation);
            }
        } else {
            c07081 = new C07081(continuation);
        }
        Object objApplyCharge = c07081.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07081.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objApplyCharge);
            this.transactionFailed = false;
            Intrinsics.checkNotNull(chargeRequest, "null cannot be cast to non-null type mx.openpay.library.domain.model.eglobal.EglobalChargeRequest");
            EglobalChargeRequest eglobalChargeRequest3 = (EglobalChargeRequest) chargeRequest;
            ConnectedDeviceQ8 connectedDeviceQ10 = this._connectedDevice;
            if (connectedDeviceQ10 == null) {
                return new Result.Failure(new Error.TerminalNotConnected(null, 1, null));
            }
            GetRenewKeyBySlotAndTerminalUseCase getRenewKeyBySlotAndTerminalUseCase = this.getRenewKeyBySlotAndTerminalUseCase;
            int i12 = Integer.parseInt(connectedDeviceQ10.getSlotKey());
            String serial = connectedDeviceQ10.getSerial();
            c07081.L$0 = this;
            chargeCallback2 = chargeCallback;
            c07081.L$1 = chargeCallback2;
            c07081.L$2 = eglobalChargeRequest3;
            c07081.L$3 = connectedDeviceQ10;
            c07081.label = 1;
            Object objInvoke = getRenewKeyBySlotAndTerminalUseCase.invoke(i12, serial, c07081);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            eglobalBluetoothController = this;
            eglobalChargeRequest = eglobalChargeRequest3;
            connectedDeviceQ8 = connectedDeviceQ10;
            objApplyCharge = objInvoke;
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    connectedDeviceQ8 = (ConnectedDeviceQ8) c07081.L$3;
                    EglobalChargeRequest eglobalChargeRequest4 = (EglobalChargeRequest) c07081.L$2;
                    ChargeCallback chargeCallback4 = (ChargeCallback) c07081.L$1;
                    EglobalBluetoothController eglobalBluetoothController5 = (EglobalBluetoothController) c07081.L$0;
                    ResultKt.throwOnFailure(objApplyCharge);
                    eglobalChargeRequest = eglobalChargeRequest4;
                    chargeCallback2 = chargeCallback4;
                    eglobalBluetoothController2 = eglobalBluetoothController5;
                    result = (Result) objApplyCharge;
                    if (result instanceof Result.Success) {
                        if (result instanceof Result.Failure) {
                            return result;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    String amount = EglobalUtils.INSTANCE.parseAmount(eglobalChargeRequest.getCom.bbva.notifications.constants.PushConstants.AMOUNT java.lang.String());
                    String orderId = eglobalChargeRequest.getOrderId();
                    c07081.L$0 = eglobalBluetoothController2;
                    c07081.L$1 = chargeCallback2;
                    c07081.L$2 = eglobalChargeRequest;
                    c07081.L$3 = connectedDeviceQ8;
                    c07081.label = 3;
                    eglobalBluetoothController3 = eglobalBluetoothController2;
                    objCommandInjectionC51 = eglobalBluetoothController2.commandInjectionC51(amount, connectedDeviceQ8, true, orderId, c07081);
                    if (objCommandInjectionC51 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    connectedDeviceQ9 = connectedDeviceQ8;
                    chargeCallback3 = chargeCallback2;
                    eglobalChargeRequest2 = eglobalChargeRequest;
                    eglobalBluetoothController4 = eglobalBluetoothController3;
                    objApplyCharge = objCommandInjectionC51;
                    c07081.L$0 = null;
                    c07081.L$1 = null;
                    c07081.L$2 = null;
                    c07081.L$3 = null;
                    c07081.label = 4;
                    objApplyCharge = eglobalBluetoothController4.validateChargeFlow(connectedDeviceQ9, eglobalChargeRequest2, (Result) objApplyCharge, chargeCallback3, c07081);
                    if (objApplyCharge == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i11 == 3) {
                    ConnectedDeviceQ8 connectedDeviceQ11 = (ConnectedDeviceQ8) c07081.L$3;
                    EglobalChargeRequest eglobalChargeRequest5 = (EglobalChargeRequest) c07081.L$2;
                    ChargeCallback chargeCallback5 = (ChargeCallback) c07081.L$1;
                    EglobalBluetoothController eglobalBluetoothController6 = (EglobalBluetoothController) c07081.L$0;
                    ResultKt.throwOnFailure(objApplyCharge);
                    chargeCallback3 = chargeCallback5;
                    connectedDeviceQ9 = connectedDeviceQ11;
                    eglobalChargeRequest2 = eglobalChargeRequest5;
                    eglobalBluetoothController4 = eglobalBluetoothController6;
                    c07081.L$0 = null;
                    c07081.L$1 = null;
                    c07081.L$2 = null;
                    c07081.L$3 = null;
                    c07081.label = 4;
                    objApplyCharge = eglobalBluetoothController4.validateChargeFlow(connectedDeviceQ9, eglobalChargeRequest2, (Result) objApplyCharge, chargeCallback3, c07081);
                    if (objApplyCharge == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            ResultKt.throwOnFailure(objApplyCharge);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objApplyCharge);
                }
                return objApplyCharge;
            }
            connectedDeviceQ8 = (ConnectedDeviceQ8) c07081.L$3;
            EglobalChargeRequest eglobalChargeRequest6 = (EglobalChargeRequest) c07081.L$2;
            ChargeCallback chargeCallback6 = (ChargeCallback) c07081.L$1;
            EglobalBluetoothController eglobalBluetoothController7 = (EglobalBluetoothController) c07081.L$0;
            ResultKt.throwOnFailure(objApplyCharge);
            eglobalChargeRequest = eglobalChargeRequest6;
            chargeCallback2 = chargeCallback6;
            eglobalBluetoothController = eglobalBluetoothController7;
        }
        if (((Number) objApplyCharge).intValue() != 2) {
            c07081.L$0 = null;
            c07081.L$1 = null;
            c07081.L$2 = null;
            c07081.L$3 = null;
            c07081.label = 5;
            objApplyCharge = eglobalBluetoothController.applyCharge(eglobalChargeRequest, chargeCallback2, c07081);
            return objApplyCharge == coroutine_suspended ? coroutine_suspended : objApplyCharge;
        }
        c07081.L$0 = eglobalBluetoothController;
        c07081.L$1 = chargeCallback2;
        c07081.L$2 = eglobalChargeRequest;
        c07081.L$3 = connectedDeviceQ8;
        c07081.label = 2;
        EglobalBluetoothController eglobalBluetoothController8 = eglobalBluetoothController;
        Object objExecuteKeysInitialSetOfCommands$default = executeKeysInitialSetOfCommands$default(eglobalBluetoothController, connectedDeviceQ8, false, c07081, 2, null);
        if (objExecuteKeysInitialSetOfCommands$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        eglobalBluetoothController2 = eglobalBluetoothController8;
        objApplyCharge = objExecuteKeysInitialSetOfCommands$default;
        result = (Result) objApplyCharge;
        if (result instanceof Result.Success) {
            if (result instanceof Result.Failure) {
                return result;
            }
            throw new NoWhenBranchMatchedException();
        }
        String amount2 = EglobalUtils.INSTANCE.parseAmount(eglobalChargeRequest.getCom.bbva.notifications.constants.PushConstants.AMOUNT java.lang.String());
        String orderId2 = eglobalChargeRequest.getOrderId();
        c07081.L$0 = eglobalBluetoothController2;
        c07081.L$1 = chargeCallback2;
        c07081.L$2 = eglobalChargeRequest;
        c07081.L$3 = connectedDeviceQ8;
        c07081.label = 3;
        eglobalBluetoothController3 = eglobalBluetoothController2;
        objCommandInjectionC51 = eglobalBluetoothController2.commandInjectionC51(amount2, connectedDeviceQ8, true, orderId2, c07081);
        if (objCommandInjectionC51 == coroutine_suspended) {
            return coroutine_suspended;
        }
        connectedDeviceQ9 = connectedDeviceQ8;
        chargeCallback3 = chargeCallback2;
        eglobalChargeRequest2 = eglobalChargeRequest;
        eglobalBluetoothController4 = eglobalBluetoothController3;
        objApplyCharge = objCommandInjectionC51;
        c07081.L$0 = null;
        c07081.L$1 = null;
        c07081.L$2 = null;
        c07081.L$3 = null;
        c07081.label = 4;
        objApplyCharge = eglobalBluetoothController4.validateChargeFlow(connectedDeviceQ9, eglobalChargeRequest2, (Result) objApplyCharge, chargeCallback3, c07081);
        if (objApplyCharge == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objApplyCharge;
    }

    @Override // mx.openpay.library.domain.bluetooth.BluetoothController
    @Nullable
    public Object createChargeEglobalPlansStep(@NotNull CreateCharge createCharge, @Nullable ChargeCallback chargeCallback, int i10, @NotNull Continuation<? super Result<Charge>> continuation) {
        if (i10 > 0) {
            createCharge = createCharge.copy((127 & 1) != 0 ? createCharge.com.bbva.notifications.constants.PushConstants.AMOUNT java.lang.String : null, (127 & 2) != 0 ? createCharge.currency : null, (127 & 4) != 0 ? createCharge.description : null, (127 & 8) != 0 ? createCharge.encryptedCard : null, (127 & 16) != 0 ? createCharge.method : null, (127 & 32) != 0 ? createCharge.orderId : null, (127 & 64) != 0 ? createCharge.useCardPoints : false, (127 & 128) != 0 ? createCharge.paymentPlan : new PaymentPlan(i10, PaymentType.WITHOUT_INTEREST));
        }
        return validateIfSignatureRequired(createCharge, chargeCallback, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a2 A[PHI: r12
      0x00a2: PHI (r12v15 java.lang.Object) = (r12v14 java.lang.Object), (r12v1 java.lang.Object) binds: [B:36:0x009f, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e5 A[PHI: r12
      0x00e5: PHI (r12v16 java.lang.Object) = (r12v12 java.lang.Object), (r12v1 java.lang.Object) binds: [B:54:0x00e2, B:14:0x002e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.domain.bluetooth.BluetoothController
    @Nullable
    public Object createChargeEglobalPointsStep(@NotNull CreateCharge createCharge, @Nullable ChargeCallback chargeCallback, boolean z10, @NotNull Continuation<? super Result<Charge>> continuation) {
        C07091 c07091;
        EglobalBluetoothController eglobalBluetoothController;
        Result result;
        Collection collection;
        if (continuation instanceof C07091) {
            c07091 = (C07091) continuation;
            int i10 = c07091.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07091.label = i10 - Integer.MIN_VALUE;
            } else {
                c07091 = new C07091(continuation);
            }
        } else {
            c07091 = new C07091(continuation);
        }
        Object objInvoke = c07091.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07091.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            createCharge.setUseCardPoints(z10);
            if (z10) {
                c07091.label = 1;
                objInvoke = validateIfSignatureRequired(createCharge, chargeCallback, c07091);
                return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
            }
            GetPaymentPlansUseCase getPaymentPlansUseCase = this.getPaymentPlansUseCase;
            String cardBin = createCharge.getEncryptedCard().getCardBin();
            if (cardBin == null) {
                cardBin = "";
            }
            double dDoubleValue = createCharge.getAmount().doubleValue();
            c07091.L$0 = this;
            c07091.L$1 = createCharge;
            c07091.L$2 = chargeCallback;
            c07091.label = 2;
            objInvoke = getPaymentPlansUseCase.invoke(cardBin, dDoubleValue, c07091);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            eglobalBluetoothController = this;
            result = (Result) objInvoke;
            if (result instanceof Result.Failure) {
                c07091.L$0 = null;
                c07091.L$1 = null;
                c07091.L$2 = null;
                c07091.label = 3;
                objInvoke = eglobalBluetoothController.validateIfSignatureRequired(createCharge, chargeCallback, c07091);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objInvoke;
            }
            if (result instanceof Result.Success) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Success success = (Result.Success) result;
            collection = (Collection) success.getData();
            if (collection == null) {
            }
            c07091.L$0 = null;
            c07091.L$1 = null;
            c07091.L$2 = null;
            c07091.label = 4;
            objInvoke = eglobalBluetoothController.validateIfSignatureRequired(createCharge, chargeCallback, c07091);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objInvoke;
        }
        if (i11 == 1) {
            ResultKt.throwOnFailure(objInvoke);
        }
        if (i11 != 2) {
            if (i11 == 3) {
                ResultKt.throwOnFailure(objInvoke);
                return objInvoke;
            }
            if (i11 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke);
            return objInvoke;
        }
        chargeCallback = (ChargeCallback) c07091.L$2;
        createCharge = (CreateCharge) c07091.L$1;
        eglobalBluetoothController = (EglobalBluetoothController) c07091.L$0;
        ResultKt.throwOnFailure(objInvoke);
        result = (Result) objInvoke;
        if (result instanceof Result.Failure) {
            c07091.L$0 = null;
            c07091.L$1 = null;
            c07091.L$2 = null;
            c07091.label = 3;
            objInvoke = eglobalBluetoothController.validateIfSignatureRequired(createCharge, chargeCallback, c07091);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objInvoke;
        }
        if (result instanceof Result.Success) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Success success2 = (Result.Success) result;
        collection = (Collection) success2.getData();
        if (collection == null && !collection.isEmpty()) {
            List listEmptyList = (List) success2.getData();
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            if (chargeCallback != null) {
                chargeCallback.execute(new ChargeCallbackStates.Eglobal.PayWithPlans(createCharge, listEmptyList));
            }
            return new Result.Success(null, ProcessingStep.PAY_WITH_PLANS_STEP);
        }
        c07091.L$0 = null;
        c07091.L$1 = null;
        c07091.L$2 = null;
        c07091.label = 4;
        objInvoke = eglobalBluetoothController.validateIfSignatureRequired(createCharge, chargeCallback, c07091);
        if (objInvoke == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objInvoke;
    }

    @Override // mx.openpay.library.domain.bluetooth.BluetoothController
    @Nullable
    public Object createChargeEglobalSignStep(@NotNull CreateCharge createCharge, @NotNull String str, @NotNull Continuation<? super Result<Charge>> continuation) {
        if (str.length() > 0) {
            createCharge.getEncryptedCard().setHexSign(str);
            return executeCharge(createCharge, continuation);
        }
        PinPadSdkWrapper pinPadSdkWrapper = this.pinPadSdkWrapper;
        if (pinPadSdkWrapper != null) {
            pinPadSdkWrapper.clearPendingProcess();
        }
        return new Result.Failure(new Error.InvalidDigitalSign(null, 1, null));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0129  */
    /* JADX WARN: Code duplicated, block: B:31:0x013f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0140  */
    /* JADX WARN: Code duplicated, block: B:35:0x0149  */
    /* JADX WARN: Code duplicated, block: B:37:0x016c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x016d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0177  */
    /* JADX WARN: Code duplicated, block: B:43:0x0190 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x0191 A[PHI: r1
      0x0191: PHI (r1v25 java.lang.Object) = (r1v24 java.lang.Object), (r1v1 java.lang.Object) binds: [B:42:0x018e, B:15:0x0055] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0192  */
    /* JADX WARN: Code duplicated, block: B:47:0x0196  */
    /* JADX WARN: Code duplicated, block: B:49:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:51:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:58:0x01d9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x01da  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:64:0x01fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x01ff A[PHI: r1
      0x01ff: PHI (r1v35 java.lang.Object) = (r1v34 java.lang.Object), (r1v1 java.lang.Object) binds: [B:63:0x01fc, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x0200  */
    /* JADX WARN: Code duplicated, block: B:68:0x0204  */
    /* JADX WARN: Code duplicated, block: B:69:0x0210  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // mx.openpay.library.domain.bluetooth.BluetoothController
    @Nullable
    public Object executeRefundCharge(@NotNull Transaction transaction, @NotNull Continuation<? super Result<Transaction>> continuation) {
        C07131 c07131;
        Object objInvoke;
        EglobalBluetoothController eglobalBluetoothController;
        RefundRequest refundRequest;
        ConnectedDeviceQ8 connectedDeviceQ8;
        Transaction transaction2;
        Object objCommandInjectionC51;
        Transaction transaction3;
        ConnectedDeviceQ8 connectedDeviceQ9;
        RefundRequest refundRequest2;
        EglobalBluetoothController eglobalBluetoothController2;
        Object objExecuteKeysInitialSetOfCommands$default;
        EglobalBluetoothController eglobalBluetoothController3;
        Transaction transaction4;
        Result result;
        ConnectedDeviceQ8 connectedDeviceQ10;
        RefundRequest refundRequest3;
        Transaction transaction5;
        EglobalBluetoothController eglobalBluetoothController4;
        Result result2;
        Result.Failure failure;
        Result result3;
        if (continuation instanceof C07131) {
            c07131 = (C07131) continuation;
            int i10 = c07131.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07131.label = i10 - Integer.MIN_VALUE;
            } else {
                c07131 = new C07131(continuation);
            }
        } else {
            c07131 = new C07131(continuation);
        }
        Object objInvoke2 = c07131.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        switch (c07131.label) {
            case 0:
                ResultKt.throwOnFailure(objInvoke2);
                RefundRequest refundRequest4 = new RefundRequest(new BigDecimal(String.valueOf(transaction.getAmount())), transaction.getDescription(), transaction.getOrderId(), transaction.getId(), null, null, null, null, null, 496, null);
                String gatewayCardPresent = transaction.getGatewayCardPresent();
                Locale locale = Locale.ROOT;
                String upperCase = gatewayCardPresent.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                String upperCase2 = EglobalUtils.GATEWAY_CARD_PRESENT_BANCOMER.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                if (!Intrinsics.areEqual(upperCase, upperCase2)) {
                    RefundChargeUseCase refundChargeUseCase = this.refundChargeUseCase;
                    c07131.label = 7;
                    objInvoke2 = refundChargeUseCase.invoke(refundRequest4, c07131);
                    return objInvoke2 == coroutine_suspended ? coroutine_suspended : objInvoke2;
                }
                ConnectedDeviceQ8 connectedDeviceQ11 = this._connectedDevice;
                if (connectedDeviceQ11 == null) {
                    return new Result.Failure(new Error.TerminalNotConnected(null, 1, null));
                }
                GetRenewKeyBySlotAndTerminalUseCase getRenewKeyBySlotAndTerminalUseCase = this.getRenewKeyBySlotAndTerminalUseCase;
                int i11 = Integer.parseInt(connectedDeviceQ11.getSlotKey());
                String serial = connectedDeviceQ11.getSerial();
                c07131.L$0 = this;
                c07131.L$1 = transaction;
                c07131.L$2 = refundRequest4;
                c07131.L$3 = connectedDeviceQ11;
                c07131.label = 1;
                objInvoke = getRenewKeyBySlotAndTerminalUseCase.invoke(i11, serial, c07131);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                eglobalBluetoothController = this;
                refundRequest = refundRequest4;
                connectedDeviceQ8 = connectedDeviceQ11;
                transaction2 = transaction;
                if (((Number) objInvoke).intValue() == 2) {
                    String amount = EglobalUtils.INSTANCE.parseAmount(transaction2.getAmount());
                    String orderId = transaction2.getOrderId();
                    c07131.L$0 = eglobalBluetoothController;
                    c07131.L$1 = transaction2;
                    c07131.L$2 = refundRequest;
                    c07131.L$3 = connectedDeviceQ8;
                    c07131.label = 5;
                    objCommandInjectionC51 = eglobalBluetoothController.commandInjectionC51(amount, connectedDeviceQ8, false, orderId, c07131);
                    if (objCommandInjectionC51 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    transaction3 = transaction2;
                    objInvoke2 = objCommandInjectionC51;
                    connectedDeviceQ9 = connectedDeviceQ8;
                    refundRequest2 = refundRequest;
                    eglobalBluetoothController2 = eglobalBluetoothController;
                    result3 = (Result) objInvoke2;
                    if (!(result3 instanceof Result.Success)) {
                        if (!(result3 instanceof Result.Failure)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        failure = new Result.Failure(((Result.Failure) result3).getError());
                        return failure;
                    }
                    C51Response c51Response = (C51Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3);
                    c07131.L$0 = null;
                    c07131.L$1 = null;
                    c07131.L$2 = null;
                    c07131.L$3 = null;
                    c07131.label = 6;
                    objInvoke2 = eglobalBluetoothController2.validateRefundFlow(connectedDeviceQ9, transaction3, refundRequest2, c51Response, c07131);
                    if (objInvoke2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objInvoke2;
                }
                c07131.L$0 = eglobalBluetoothController;
                c07131.L$1 = transaction2;
                c07131.L$2 = refundRequest;
                c07131.L$3 = connectedDeviceQ8;
                c07131.label = 2;
                objExecuteKeysInitialSetOfCommands$default = executeKeysInitialSetOfCommands$default(eglobalBluetoothController, connectedDeviceQ8, false, c07131, 2, null);
                if (objExecuteKeysInitialSetOfCommands$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                eglobalBluetoothController3 = eglobalBluetoothController;
                transaction4 = transaction2;
                objInvoke2 = objExecuteKeysInitialSetOfCommands$default;
                result = (Result) objInvoke2;
                if (!(result instanceof Result.Success)) {
                    if (result instanceof Result.Failure) {
                        return result;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                String amount2 = EglobalUtils.INSTANCE.parseAmount(transaction4.getAmount());
                String orderId2 = transaction4.getOrderId();
                c07131.L$0 = eglobalBluetoothController3;
                c07131.L$1 = transaction4;
                c07131.L$2 = refundRequest;
                c07131.L$3 = connectedDeviceQ8;
                c07131.label = 3;
                objInvoke2 = eglobalBluetoothController3.commandInjectionC51(amount2, connectedDeviceQ8, false, orderId2, c07131);
                if (objInvoke2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                connectedDeviceQ10 = connectedDeviceQ8;
                refundRequest3 = refundRequest;
                transaction5 = transaction4;
                eglobalBluetoothController4 = eglobalBluetoothController3;
                result2 = (Result) objInvoke2;
                if (result2 instanceof Result.Success) {
                    if (result2 instanceof Result.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    failure = new Result.Failure(((Result.Failure) result2).getError());
                    return failure;
                }
                C51Response c51Response2 = (C51Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2);
                c07131.L$0 = null;
                c07131.L$1 = null;
                c07131.L$2 = null;
                c07131.L$3 = null;
                c07131.label = 4;
                objInvoke2 = eglobalBluetoothController4.validateRefundFlow(connectedDeviceQ10, transaction5, refundRequest3, c51Response2, c07131);
                if (objInvoke2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objInvoke2;
            case 1:
                ConnectedDeviceQ8 connectedDeviceQ12 = (ConnectedDeviceQ8) c07131.L$3;
                RefundRequest refundRequest5 = (RefundRequest) c07131.L$2;
                Transaction transaction6 = (Transaction) c07131.L$1;
                EglobalBluetoothController eglobalBluetoothController5 = (EglobalBluetoothController) c07131.L$0;
                ResultKt.throwOnFailure(objInvoke2);
                connectedDeviceQ8 = connectedDeviceQ12;
                refundRequest = refundRequest5;
                eglobalBluetoothController = eglobalBluetoothController5;
                objInvoke = objInvoke2;
                transaction2 = transaction6;
                if (((Number) objInvoke).intValue() == 2) {
                    String amount3 = EglobalUtils.INSTANCE.parseAmount(transaction2.getAmount());
                    String orderId3 = transaction2.getOrderId();
                    c07131.L$0 = eglobalBluetoothController;
                    c07131.L$1 = transaction2;
                    c07131.L$2 = refundRequest;
                    c07131.L$3 = connectedDeviceQ8;
                    c07131.label = 5;
                    objCommandInjectionC51 = eglobalBluetoothController.commandInjectionC51(amount3, connectedDeviceQ8, false, orderId3, c07131);
                    if (objCommandInjectionC51 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    transaction3 = transaction2;
                    objInvoke2 = objCommandInjectionC51;
                    connectedDeviceQ9 = connectedDeviceQ8;
                    refundRequest2 = refundRequest;
                    eglobalBluetoothController2 = eglobalBluetoothController;
                    result3 = (Result) objInvoke2;
                    if (!(result3 instanceof Result.Success)) {
                        if (!(result3 instanceof Result.Failure)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        failure = new Result.Failure(((Result.Failure) result3).getError());
                        return failure;
                    }
                    C51Response c51Response3 = (C51Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3);
                    c07131.L$0 = null;
                    c07131.L$1 = null;
                    c07131.L$2 = null;
                    c07131.L$3 = null;
                    c07131.label = 6;
                    objInvoke2 = eglobalBluetoothController2.validateRefundFlow(connectedDeviceQ9, transaction3, refundRequest2, c51Response3, c07131);
                    if (objInvoke2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objInvoke2;
                }
                c07131.L$0 = eglobalBluetoothController;
                c07131.L$1 = transaction2;
                c07131.L$2 = refundRequest;
                c07131.L$3 = connectedDeviceQ8;
                c07131.label = 2;
                objExecuteKeysInitialSetOfCommands$default = executeKeysInitialSetOfCommands$default(eglobalBluetoothController, connectedDeviceQ8, false, c07131, 2, null);
                if (objExecuteKeysInitialSetOfCommands$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                eglobalBluetoothController3 = eglobalBluetoothController;
                transaction4 = transaction2;
                objInvoke2 = objExecuteKeysInitialSetOfCommands$default;
                result = (Result) objInvoke2;
                if (!(result instanceof Result.Success)) {
                    if (result instanceof Result.Failure) {
                        return result;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                String amount4 = EglobalUtils.INSTANCE.parseAmount(transaction4.getAmount());
                String orderId4 = transaction4.getOrderId();
                c07131.L$0 = eglobalBluetoothController3;
                c07131.L$1 = transaction4;
                c07131.L$2 = refundRequest;
                c07131.L$3 = connectedDeviceQ8;
                c07131.label = 3;
                objInvoke2 = eglobalBluetoothController3.commandInjectionC51(amount4, connectedDeviceQ8, false, orderId4, c07131);
                if (objInvoke2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                connectedDeviceQ10 = connectedDeviceQ8;
                refundRequest3 = refundRequest;
                transaction5 = transaction4;
                eglobalBluetoothController4 = eglobalBluetoothController3;
                result2 = (Result) objInvoke2;
                if (result2 instanceof Result.Success) {
                    if (result2 instanceof Result.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    failure = new Result.Failure(((Result.Failure) result2).getError());
                    return failure;
                }
                C51Response c51Response4 = (C51Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2);
                c07131.L$0 = null;
                c07131.L$1 = null;
                c07131.L$2 = null;
                c07131.L$3 = null;
                c07131.label = 4;
                objInvoke2 = eglobalBluetoothController4.validateRefundFlow(connectedDeviceQ10, transaction5, refundRequest3, c51Response4, c07131);
                if (objInvoke2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objInvoke2;
            case 2:
                ConnectedDeviceQ8 connectedDeviceQ13 = (ConnectedDeviceQ8) c07131.L$3;
                RefundRequest refundRequest6 = (RefundRequest) c07131.L$2;
                Transaction transaction7 = (Transaction) c07131.L$1;
                EglobalBluetoothController eglobalBluetoothController6 = (EglobalBluetoothController) c07131.L$0;
                ResultKt.throwOnFailure(objInvoke2);
                connectedDeviceQ8 = connectedDeviceQ13;
                refundRequest = refundRequest6;
                transaction4 = transaction7;
                eglobalBluetoothController3 = eglobalBluetoothController6;
                result = (Result) objInvoke2;
                if (!(result instanceof Result.Success)) {
                    if (result instanceof Result.Failure) {
                        return result;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                String amount5 = EglobalUtils.INSTANCE.parseAmount(transaction4.getAmount());
                String orderId5 = transaction4.getOrderId();
                c07131.L$0 = eglobalBluetoothController3;
                c07131.L$1 = transaction4;
                c07131.L$2 = refundRequest;
                c07131.L$3 = connectedDeviceQ8;
                c07131.label = 3;
                objInvoke2 = eglobalBluetoothController3.commandInjectionC51(amount5, connectedDeviceQ8, false, orderId5, c07131);
                if (objInvoke2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                connectedDeviceQ10 = connectedDeviceQ8;
                refundRequest3 = refundRequest;
                transaction5 = transaction4;
                eglobalBluetoothController4 = eglobalBluetoothController3;
                result2 = (Result) objInvoke2;
                if (result2 instanceof Result.Success) {
                    if (result2 instanceof Result.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    failure = new Result.Failure(((Result.Failure) result2).getError());
                    return failure;
                }
                C51Response c51Response5 = (C51Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2);
                c07131.L$0 = null;
                c07131.L$1 = null;
                c07131.L$2 = null;
                c07131.L$3 = null;
                c07131.label = 4;
                objInvoke2 = eglobalBluetoothController4.validateRefundFlow(connectedDeviceQ10, transaction5, refundRequest3, c51Response5, c07131);
                if (objInvoke2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objInvoke2;
            case 3:
                ConnectedDeviceQ8 connectedDeviceQ14 = (ConnectedDeviceQ8) c07131.L$3;
                RefundRequest refundRequest7 = (RefundRequest) c07131.L$2;
                transaction5 = (Transaction) c07131.L$1;
                EglobalBluetoothController eglobalBluetoothController7 = (EglobalBluetoothController) c07131.L$0;
                ResultKt.throwOnFailure(objInvoke2);
                connectedDeviceQ10 = connectedDeviceQ14;
                eglobalBluetoothController4 = eglobalBluetoothController7;
                refundRequest3 = refundRequest7;
                result2 = (Result) objInvoke2;
                if (result2 instanceof Result.Success) {
                    if (result2 instanceof Result.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    failure = new Result.Failure(((Result.Failure) result2).getError());
                    return failure;
                }
                C51Response c51Response6 = (C51Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result2);
                c07131.L$0 = null;
                c07131.L$1 = null;
                c07131.L$2 = null;
                c07131.L$3 = null;
                c07131.label = 4;
                objInvoke2 = eglobalBluetoothController4.validateRefundFlow(connectedDeviceQ10, transaction5, refundRequest3, c51Response6, c07131);
                if (objInvoke2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objInvoke2;
            case 4:
                ResultKt.throwOnFailure(objInvoke2);
                return objInvoke2;
            case 5:
                ConnectedDeviceQ8 connectedDeviceQ15 = (ConnectedDeviceQ8) c07131.L$3;
                RefundRequest refundRequest8 = (RefundRequest) c07131.L$2;
                transaction3 = (Transaction) c07131.L$1;
                EglobalBluetoothController eglobalBluetoothController8 = (EglobalBluetoothController) c07131.L$0;
                ResultKt.throwOnFailure(objInvoke2);
                connectedDeviceQ9 = connectedDeviceQ15;
                eglobalBluetoothController2 = eglobalBluetoothController8;
                refundRequest2 = refundRequest8;
                result3 = (Result) objInvoke2;
                if (!(result3 instanceof Result.Success)) {
                    if (!(result3 instanceof Result.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    failure = new Result.Failure(((Result.Failure) result3).getError());
                    return failure;
                }
                C51Response c51Response7 = (C51Response) mx.openpay.library.domain.util.ResultKt.getSuccessData(result3);
                c07131.L$0 = null;
                c07131.L$1 = null;
                c07131.L$2 = null;
                c07131.L$3 = null;
                c07131.label = 6;
                objInvoke2 = eglobalBluetoothController2.validateRefundFlow(connectedDeviceQ9, transaction3, refundRequest2, c51Response7, c07131);
                if (objInvoke2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objInvoke2;
            case 6:
                ResultKt.throwOnFailure(objInvoke2);
                return objInvoke2;
            case 7:
                ResultKt.throwOnFailure(objInvoke2);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // mx.openpay.library.domain.bluetooth.BluetoothController
    public boolean getBluetoothEnabled() {
        return this.bluetoothEnabled;
    }

    @Override // mx.openpay.library.domain.bluetooth.BluetoothController
    @NotNull
    public StateFlow<List<EglobalDevice>> getPairedDevices() {
        return FlowKt.asStateFlow(this._pairedDevices);
    }

    @Override // mx.openpay.library.domain.bluetooth.BluetoothController
    @NotNull
    public StateFlow<List<EglobalDevice>> getScannedDevices() {
        return FlowKt.asStateFlow(this._scannedDevices);
    }

    @Override // mx.openpay.library.domain.bluetooth.BluetoothController
    @NotNull
    public StateFlow<Boolean> isConnected() {
        return FlowKt.asStateFlow(this._isConnected);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.domain.bluetooth.BluetoothController
    @RequiresPermission("android.permission.BLUETOOTH_SCAN")
    @Nullable
    public Object listDevicesScanned(@NotNull Continuation<? super Result<? extends List<? extends Device>>> continuation) {
        C07181 c07181;
        EglobalBluetoothController eglobalBluetoothController;
        if (continuation instanceof C07181) {
            c07181 = (C07181) continuation;
            int i10 = c07181.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07181.label = i10 - Integer.MIN_VALUE;
            } else {
                c07181 = new C07181(continuation);
            }
        } else {
            c07181 = new C07181(continuation);
        }
        Object obj = c07181.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07181.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            c07181.L$0 = this;
            c07181.label = 1;
            if (DelayKt.delay(5000L, c07181) == coroutine_suspended) {
                return coroutine_suspended;
            }
            eglobalBluetoothController = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eglobalBluetoothController = (EglobalBluetoothController) c07181.L$0;
            ResultKt.throwOnFailure(obj);
        }
        BluetoothAdapter bluetoothAdapter = eglobalBluetoothController.getBluetoothAdapter();
        if (bluetoothAdapter != null) {
            Boxing.boxBoolean(bluetoothAdapter.cancelDiscovery());
        }
        return new Result.Success(eglobalBluetoothController._scannedDevicesAux, null, 2, null);
    }

    @Override // mx.openpay.library.domain.bluetooth.BluetoothController
    public void release() {
        closeConnection();
        this.context.unregisterReceiver(this.foundDeviceReceiver);
        this.context.unregisterReceiver(this.bluetoothStateReceiver);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // mx.openpay.library.domain.bluetooth.BluetoothController
    @Nullable
    public Object sendFile(@NotNull byte[] bArr, @NotNull Continuation<? super Result<Boolean>> continuation) {
        C07241 c07241;
        if (continuation instanceof C07241) {
            c07241 = (C07241) continuation;
            int i10 = c07241.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c07241.label = i10 - Integer.MIN_VALUE;
            } else {
                c07241 = new C07241(continuation);
            }
        } else {
            c07241 = new C07241(continuation);
        }
        Object objSendFile = c07241.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c07241.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objSendFile);
                PinPadSdkWrapper pinPadSdkWrapper = this.pinPadSdkWrapper;
                if (pinPadSdkWrapper == null) {
                    return new Result.Failure(new Error.OnTerminal(null, 1, null));
                }
                if (this._connectedDevice == null) {
                    return new Result.Failure(new Error.TerminalNotConnected(null, 1, null));
                }
                String strSaveFileToStorage = saveFileToStorage(bArr);
                c07241.label = 1;
                objSendFile = pinPadSdkWrapper.sendFile(strSaveFileToStorage, c07241);
                if (objSendFile == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendFile);
            }
            Result result = (Result) objSendFile;
            if (result instanceof Result.Success) {
                return new Result.Success(Boxing.boxBoolean(true), null, 2, null);
            }
            if (result instanceof Result.Failure) {
                return new Result.Failure(((Result.Failure) result).getError());
            }
            throw new NoWhenBranchMatchedException();
        } catch (IOException e5) {
            b.stackTraceToString(e5);
            return new Result.Failure(new Error.OnTerminal(null, 1, null));
        }
    }

    @Override // mx.openpay.library.domain.bluetooth.BluetoothController
    @RequiresPermission(allOf = {"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN"})
    @NotNull
    public Result<String> startDiscovery() {
        if (!getBluetoothEnabled()) {
            String string = this.context.getString(R.string.error_disabled_bluetooth);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…error_disabled_bluetooth)");
            return new Result.Failure(new Error.OnTerminal(string));
        }
        if (!hasPermission("android.permission.ACCESS_FINE_LOCATION")) {
            String string2 = this.context.getString(R.string.error_permission_location);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…rror_permission_location)");
            return new Result.Failure(new Error.PermissionNonGranted(string2));
        }
        if (Build.VERSION.SDK_INT >= 31) {
            if (!hasPermission("android.permission.BLUETOOTH_SCAN")) {
                String string3 = this.context.getString(R.string.error_permission_bluetooth);
                Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…ror_permission_bluetooth)");
                return new Result.Failure(new Error.PermissionNonGranted(string3));
            }
        } else if (!hasPermission("android.permission.BLUETOOTH")) {
            String string4 = this.context.getString(R.string.error_permission_location);
            Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…rror_permission_location)");
            return new Result.Failure(new Error.PermissionNonGranted(string4));
        }
        this._scannedDevicesAux.clear();
        this.context.registerReceiver(this.foundDeviceReceiver, new IntentFilter("android.bluetooth.device.action.FOUND"));
        BluetoothAdapter bluetoothAdapter = getBluetoothAdapter();
        if (bluetoothAdapter != null) {
            bluetoothAdapter.startDiscovery();
        }
        return new Result.Success(this.context.getString(R.string.success_start_bluetooth), null, 2, null);
    }

    @Override // mx.openpay.library.domain.bluetooth.BluetoothController
    @RequiresPermission("android.permission.BLUETOOTH_SCAN")
    public void stopDiscovery() {
        BluetoothAdapter bluetoothAdapter;
        if (hasPermission("android.permission.BLUETOOTH_SCAN") && (bluetoothAdapter = getBluetoothAdapter()) != null) {
            bluetoothAdapter.cancelDiscovery();
        }
    }
}
