package com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository;

import c7.a0;
import c7.b0;
import c7.c0;
import c7.e;
import c7.f;
import c7.l;
import c7.o;
import c7.q;
import c7.s;
import c7.t;
import c7.w;
import c7.x;
import c7.y;
import c7.z;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.deviceinfo.DeviceInfo;
import com.bbva.ethermobilesdk.deviceinfo.component.Time;
import com.bbva.ethermobilesdk.deviceinfo.data.ApplicationVersion;
import com.bbva.ethermobilesdk.devicemanager.model.output.NfcState;
import com.bbva.ethermobilesdk.devicemanager.model.output.SystemThemeStateResponse;
import com.bbva.ethermobilesdk.devicemanager.model.output.error.DeviceManagerError;
import com.veridas.detect.ImageAnalysisKt;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceInfoRepositoryImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002H\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0002H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u0002H\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u0002H\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H\u0016J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u0002H\u0016J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H\u0016J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H\u0016J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H\u0016J\u0016\u00104\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010\u00030\u00030\u0002H\u0016J\u0016\u00105\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010\u00030\u00030\u0002H\u0016J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¢\u0006\u0004\b6\u00107J\u001e\u00108\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010\u00030\u00030\u0002H\u0096@¢\u0006\u0004\b8\u00107J\u001e\u00109\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010\u00030\u00030\u0002H\u0096@¢\u0006\u0004\b9\u00107J\u0016\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002H\u0096@¢\u0006\u0004\b:\u00107J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002H\u0016¨\u0006@"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/data/deviceinfo/repository/DeviceInfoRepositoryImpl;", "Lcom/bbva/ethermobilesdk/devicemanager/data/deviceinfo/repository/DeviceInfoRepository;", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", "getAndroidId", Constants.backendRequestUserId, "getCollideFingerprint", "applicationVersionCode", "applicationVersionName", "", "batteryLevel", "", "isBluetooth", "isMicrophonePresent", Constants.manufacturer, "model", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/NfcState;", "nfcStatus", "", "ramAvailable", "ramTotal", "ramUsed", "ramUsedPercent", "languageCode", "languageName", "isCaptivePortal", "isProxy", "isWifiSecured", "networkSignalStrength", "networkIpAddressVersion4", "networkIpAddressVersion6", "screenBrightnessLevel", "screenHeight", "screenWidth", "screenIsLocked", "storageTotal", "storageTotalUnit", "Lcom/bbva/ethermobilesdk/devicemanager/model/output/SystemThemeStateResponse;", "systemCurrentTheme", "isGmsAvailable", "systemPlatformName", "systemPlatformVersionName", "systemPlatformVersionCode", "systemPropertiesJavaVmName", "systemPropertiesJavaVmVersion", "systemPropertiesOsVersion", "systemPropertiesRuntimeName", "systemPropertiesRuntimeVersion", "currentTimeZone", "isAutomaticZone", "isAutomaticDateAndTime", "kotlin.jvm.PlatformType", "currentDate", "currentDateIso", "currentDateTimeNtp", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currentDateTimeNtpIso", "currentDateNtp", "currentTimeNtp", "currentTime", "Lcom/bbva/ethermobilesdk/deviceinfo/DeviceInfo;", "deviceInfo", "<init>", "(Lcom/bbva/ethermobilesdk/deviceinfo/DeviceInfo;)V", "devicemanager_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDeviceInfoRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceInfoRepositoryImpl.kt\ncom/bbva/ethermobilesdk/devicemanager/data/deviceinfo/repository/DeviceInfoRepositoryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,253:1\n1#2:254\n*E\n"})
public final class DeviceInfoRepositoryImpl implements DeviceInfoRepository {

    @Deprecated
    @NotNull
    public static final String DATE_FORMAT = "yyyy-MM-dd";

    @Deprecated
    @NotNull
    public static final String DATE_FORMAT_ISO = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    @Deprecated
    @NotNull
    public static final String DATE_FORMAT_NTP = "yyyy-MM-dd'T'HH:mm:ssZ";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DeviceInfo f29641a;

    /* JADX INFO: compiled from: DeviceInfoRepositoryImpl.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepositoryImpl$currentDateNtp$2", f = "DeviceInfoRepositoryImpl.kt", i = {}, l = {ImageAnalysisKt.OVER_EXPOSED_THRESHOLD}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function1<Continuation<? super String>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f29642p0;

        public a(Continuation<? super a> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return DeviceInfoRepositoryImpl.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super String> continuation) {
            return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws DeviceManagerError.DeviceInfoError.DeviceInfoInvalid, ParseException {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f29642p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f29642p0 = 1;
                obj = DeviceInfoRepositoryImpl.this.currentDateTimeNtp(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            String str = (String) com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow((Result) obj);
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", locale);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd", locale);
            Date date = simpleDateFormat.parse(str);
            if (date != null) {
                return simpleDateFormat2.format(date);
            }
            throw new DeviceManagerError.DeviceInfoError.DeviceInfoInvalid(null, null, 3, null);
        }
    }

    /* JADX INFO: compiled from: DeviceInfoRepositoryImpl.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepositoryImpl$currentDateTimeNtp$2", f = "DeviceInfoRepositoryImpl.kt", i = {}, l = {217, 218}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function1<Continuation<? super String>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f29644p0;

        public b(Continuation<? super b> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return DeviceInfoRepositoryImpl.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super String> continuation) {
            return ((b) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0059  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws DeviceManagerError.DeviceInfoError.DeviceInfoInvalid {
            String str;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f29644p0;
            DeviceInfoRepositoryImpl deviceInfoRepositoryImpl = DeviceInfoRepositoryImpl.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) obj;
                if (str == null) {
                    throw new DeviceManagerError.DeviceInfoError.DeviceInfoInvalid(null, null, 3, null);
                }
                return str;
            }
            ResultKt.throwOnFailure(obj);
            Time time = deviceInfoRepositoryImpl.f29641a.getTime();
            this.f29644p0 = 1;
            obj = Time.getTrueTime$default(time, "0.amazon.pool.ntp.org", 0, this, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = (String) obj;
            if (str == null) {
                Time time2 = deviceInfoRepositoryImpl.f29641a.getTime();
                this.f29644p0 = 2;
                obj = Time.getTrueTime$default(time2, null, 0, this, 3, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = (String) obj;
                if (str == null) {
                    throw new DeviceManagerError.DeviceInfoError.DeviceInfoInvalid(null, null, 3, null);
                }
            }
            return str;
        }
    }

    /* JADX INFO: compiled from: DeviceInfoRepositoryImpl.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepositoryImpl$currentDateTimeNtpIso$2", f = "DeviceInfoRepositoryImpl.kt", i = {}, l = {223}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function1<Continuation<? super String>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f29646p0;

        public c(Continuation<? super c> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return DeviceInfoRepositoryImpl.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super String> continuation) {
            return ((c) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws DeviceManagerError.DeviceInfoError.DeviceInfoInvalid, ParseException {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f29646p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f29646p0 = 1;
                obj = DeviceInfoRepositoryImpl.this.currentDateTimeNtp(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            String str = (String) com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow((Result) obj);
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", locale);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", locale);
            Date date = simpleDateFormat.parse(str);
            if (date != null) {
                return simpleDateFormat2.format(date);
            }
            throw new DeviceManagerError.DeviceInfoError.DeviceInfoInvalid(null, null, 3, null);
        }
    }

    /* JADX INFO: compiled from: DeviceInfoRepositoryImpl.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepositoryImpl$currentTimeNtp$2", f = "DeviceInfoRepositoryImpl.kt", i = {}, l = {237}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function1<Continuation<? super Long>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f29648p0;

        public d(Continuation<? super d> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return DeviceInfoRepositoryImpl.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Long> continuation) {
            return ((d) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws DeviceManagerError.DeviceInfoError.DeviceInfoInvalid, ParseException {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f29648p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f29648p0 = 1;
                obj = DeviceInfoRepositoryImpl.this.currentDateTimeNtp(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).parse((String) com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow((Result) obj));
            if (date != null) {
                return Boxing.boxLong(date.getTime());
            }
            throw new DeviceManagerError.DeviceInfoError.DeviceInfoInvalid(null, null, 3, null);
        }
    }

    public DeviceInfoRepositoryImpl(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.f29641a = deviceInfo;
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<String> applicationVersionCode() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new Function0() { // from class: c7.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws DeviceManagerError.DeviceInfoError.DeviceInfoInvalid {
                String versionCode;
                ApplicationVersion appVersion = this.f25392p0.f29641a.getCom.bbva.nativesettings.common.Constants.APPLICATION java.lang.String().getAppVersion();
                if (appVersion == null || (versionCode = appVersion.getVersionCode()) == null) {
                    throw new DeviceManagerError.DeviceInfoError.DeviceInfoInvalid(null, null, 3, null);
                }
                return versionCode;
            }
        });
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<String> applicationVersionName() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new y(this, 0));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<Integer> batteryLevel() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new Function0() { // from class: c7.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(this.f25393p0.f29641a.getHardware().getBatteryLevel());
            }
        });
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<String> currentDate() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new f());
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<String> currentDateIso() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new c7.a());
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @Nullable
    public Object currentDateNtp(@NotNull Continuation<? super Result<String>> continuation) {
        return com.bbva.ethermobile.help.kit.result.ResultKt.suspendCatching(new a(null), continuation);
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @Nullable
    public Object currentDateTimeNtp(@NotNull Continuation<? super Result<String>> continuation) {
        return com.bbva.ethermobile.help.kit.result.ResultKt.suspendCatching(new b(null), continuation);
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @Nullable
    public Object currentDateTimeNtpIso(@NotNull Continuation<? super Result<String>> continuation) {
        return com.bbva.ethermobile.help.kit.result.ResultKt.suspendCatching(new c(null), continuation);
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<Long> currentTime() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new t());
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @Nullable
    public Object currentTimeNtp(@NotNull Continuation<? super Result<Long>> continuation) {
        return com.bbva.ethermobile.help.kit.result.ResultKt.suspendCatching(new d(null), continuation);
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<String> currentTimeZone() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new x(this, 1));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<String> getAndroidId() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new c7.c(this, 1));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<String> getCollideFingerprint(@NotNull final String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new Function0() { // from class: c7.u
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f25409p0.f29641a.getCom.bbva.nativesettings.common.Constants.APPLICATION java.lang.String().getCollideFingerprint(userId);
            }
        });
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<Boolean> isAutomaticDateAndTime() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new Function0() { // from class: c7.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(this.f25400p0.f29641a.getTime().isAutomaticDateAndTime());
            }
        });
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<Boolean> isAutomaticZone() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new x(this, 0));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<Boolean> isBluetooth() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new Function0() { // from class: c7.d0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(this.f25389p0.f29641a.getHardware().isBluetooth());
            }
        });
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<Boolean> isCaptivePortal() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new e(this, 1));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<Boolean> isGmsAvailable() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new Function0() { // from class: c7.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(this.f25396p0.f29641a.getSystem().isGmsAvailable());
            }
        });
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<Boolean> isMicrophonePresent() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new b7.a(this, 1));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<Boolean> isProxy() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new c0(this, 1));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<Boolean> isWifiSecured() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new c7.d(this, 0));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<String> languageCode() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new Function0() { // from class: c7.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f25399p0.f29641a.getLocale().getLanguage().getLanguageCode();
            }
        });
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<String> languageName() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new q(this, 0));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<String> manufacturer() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new Function0() { // from class: c7.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f25394p0.f29641a.getHardware().getManufacturer();
            }
        });
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<String> model() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new c7.b(this, 0));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<String> networkIpAddressVersion4() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new w(this, 0));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<String> networkIpAddressVersion6() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new o(this, 0));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<Integer> networkSignalStrength() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new y(this, 1));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<NfcState> nfcStatus() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new z(this, 0));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<Long> ramAvailable() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new l(this, 0));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<Long> ramTotal() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new a0(this, 1));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<Long> ramUsed() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new s(this, 0));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<Integer> ramUsedPercent() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new c7.d(this, 1));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<Integer> screenBrightnessLevel() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new c7.c(this, 0));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<String> screenHeight() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new c7.b(this, 1));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<Boolean> screenIsLocked() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new l(this, 1));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<String> screenWidth() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new androidx.activity.c(this, 2));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<String> storageTotal() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new Function0() { // from class: c7.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StringsKt__StringsKt.substringBefore$default(kotlin.text.l.replace$default(this.f25395p0.f29641a.getFileSystem().getStorage().getTotal(), " ", " ", false, 4, (Object) null), " ", (String) null, 2, (Object) null);
            }
        });
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<String> storageTotalUnit() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new b7.b(this, 1));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<SystemThemeStateResponse> systemCurrentTheme() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new e(this, 0));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<String> systemPlatformName() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new b0(this, 1));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<String> systemPlatformVersionCode() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new Function0() { // from class: c7.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f25411p0.f29641a.getSystem().getPlatform().getPlatformVersionCode();
            }
        });
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<String> systemPlatformVersionName() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new w(this, 1));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<String> systemPropertiesJavaVmName() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new Function0() { // from class: c7.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws DeviceManagerError.DeviceInfoError.DeviceInfoInvalid {
                String javaVmName = this.f25406p0.f29641a.getSystem().getProperties().getJavaVmName();
                if (javaVmName != null) {
                    return javaVmName;
                }
                throw new DeviceManagerError.DeviceInfoError.DeviceInfoInvalid(null, null, 3, null);
            }
        });
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<String> systemPropertiesJavaVmVersion() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new Function0() { // from class: c7.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws DeviceManagerError.DeviceInfoError.DeviceInfoInvalid {
                String javaVmVersion = this.f25403p0.f29641a.getSystem().getProperties().getJavaVmVersion();
                if (javaVmVersion != null) {
                    return javaVmVersion;
                }
                throw new DeviceManagerError.DeviceInfoError.DeviceInfoInvalid(null, null, 3, null);
            }
        });
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<String> systemPropertiesOsVersion() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new b0(this, 0));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<String> systemPropertiesRuntimeName() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new c0(this, 0));
    }

    @Override // com.bbva.ethermobilesdk.devicemanager.data.deviceinfo.repository.DeviceInfoRepository
    @NotNull
    public Result<String> systemPropertiesRuntimeVersion() {
        return com.bbva.ethermobile.help.kit.result.ResultKt.catching(new a0(this, 0));
    }
}
