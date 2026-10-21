package com.bbva.component_devicemanager.data.datasource;

import androidx.collection.k;
import com.bbva.component_devicemanager.domain.model.AlertsInfo;
import com.bbva.component_devicemanager.domain.model.BlackBox;
import com.bbva.component_devicemanager.domain.model.GeolocationInfo;
import com.bbva.component_devicemanager.domain.model.GlobalDeviceManagerResponse;
import com.bbva.component_devicemanager.domain.model.NfcStatusType;
import com.bbva.component_devicemanager.domain.model.PhoneInfo;
import com.bbva.component_devicemanager.domain.model.ScreenInfo;
import com.bbva.component_devicemanager.domain.model.Storage;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobile.help.kit.result.ResultKt;
import com.bbva.ethermobilesdk.deviceinfo.DeviceInfo;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceCheckerResponse;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceInfoResponse;
import com.bbva.ethermobilesdk.devicemanager.model.output.GeolocationResponse;
import com.bbva.ethermobilesdk.devicemanager.model.output.NfcState;
import com.bbva.ethermobilesdk.devicemanager.model.output.SystemThemeStateResponse;
import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.storage.TargetStorage;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BlackBoxDataSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/bbva/component_devicemanager/data/datasource/BlackBoxDataSource;", "", "Lcom/bbva/component_devicemanager/domain/model/GlobalDeviceManagerResponse;", "deviceManagerResponse", "Lcom/bbva/component_devicemanager/domain/model/BlackBox;", "getBlackBox", "(Lcom/bbva/component_devicemanager/domain/model/GlobalDeviceManagerResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/deviceinfo/DeviceInfo;", "deviceInfo", "Lcom/bbva/glomo/storage/MainStorage;", "mainStorage", "<init>", "(Lcom/bbva/ethermobilesdk/deviceinfo/DeviceInfo;Lcom/bbva/glomo/storage/MainStorage;)V", "Companion", "component-devicemanager_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBlackBoxDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackBoxDataSource.kt\ncom/bbva/component_devicemanager/data/datasource/BlackBoxDataSource\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,201:1\n1747#2,3:202\n1747#2,3:205\n*S KotlinDebug\n*F\n+ 1 BlackBoxDataSource.kt\ncom/bbva/component_devicemanager/data/datasource/BlackBoxDataSource\n*L\n139#1:202,3\n144#1:205,3\n*E\n"})
public final class BlackBoxDataSource {

    @NotNull
    public static final String GIGA_BYTE = "GB";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DeviceInfo f28874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final MainStorage f28875b;

    /* JADX INFO: compiled from: BlackBoxDataSource.kt */
    @DebugMetadata(c = "com.bbva.component_devicemanager.data.datasource.BlackBoxDataSource", f = "BlackBoxDataSource.kt", i = {0, 0, 0}, l = {40}, m = "getBlackBox", n = {"this", "deviceManagerResponse", "deviceInfoResponse"}, s = {"L$0", "L$1", "L$2"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public BlackBoxDataSource f28876p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public GlobalDeviceManagerResponse f28877q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public DeviceInfoResponse f28878r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Storage f28879s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public NfcStatusType f28880t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public /* synthetic */ Object f28881u0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public int f28882w0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f28881u0 = obj;
            this.f28882w0 |= Integer.MIN_VALUE;
            return BlackBoxDataSource.this.getBlackBox(null, this);
        }
    }

    public BlackBoxDataSource(@NotNull DeviceInfo deviceInfo, @NotNull MainStorage mainStorage) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(mainStorage, "mainStorage");
        this.f28874a = deviceInfo;
        this.f28875b = mainStorage;
    }

    public static GeolocationInfo a(GeolocationResponse geolocationResponse) {
        Result<String> latitude;
        if (((geolocationResponse == null || (latitude = geolocationResponse.getLatitude()) == null) ? null : (String) ResultKt.getOrNull(latitude)) == null) {
            return null;
        }
        return new GeolocationInfo((String) ResultKt.getOrNull(geolocationResponse.getLatitude()), (String) ResultKt.getOrNull(geolocationResponse.getAltitude()), (String) ResultKt.getOrNull(geolocationResponse.getLongitude()), (String) ResultKt.getOrNull(geolocationResponse.getAccuracy()));
    }

    public static final /* synthetic */ Object access$getGeolocationInfo(BlackBoxDataSource blackBoxDataSource, GeolocationResponse geolocationResponse, Continuation continuation) {
        blackBoxDataSource.getClass();
        return a(geolocationResponse);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:107:0x01df  */
    /* JADX WARN: Code duplicated, block: B:343:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:? A[LOOP:1: B:105:0x01d9->B:345:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c3  */
    @Nullable
    public final Object getBlackBox(@NotNull GlobalDeviceManagerResponse globalDeviceManagerResponse, @NotNull Continuation<? super BlackBox> continuation) {
        a aVar;
        DeviceInfoResponse deviceInfoResponse;
        Object obj;
        BlackBoxDataSource blackBoxDataSource;
        Storage storage;
        NfcStatusType nfcStatusType;
        GlobalDeviceManagerResponse globalDeviceManagerResponse2;
        Result<NfcState> nfcStatus;
        Result<String> storageTotal;
        HashMap map;
        boolean z10;
        Collection collectionValues;
        Collection collection;
        Iterator it;
        Result result;
        Result<HashMap<Integer, Result<? extends Object>>> resultIsMagiskCompleteDetected;
        Result<String> currentDateIso;
        Result<Long> currentTime;
        Long l6;
        Result<String> currentTimeZone;
        Result<SystemThemeStateResponse> systemCurrentTheme;
        List listSplit$default;
        Result<String> languageCode;
        Result<Integer> networkSignalStrength;
        Integer num;
        Result<Integer> ramUsedPercent;
        Integer num2;
        Result<Integer> batteryLevelPercent;
        Integer num3;
        Result<String> systemPropertiesJavaVmVersion;
        Result<String> systemPropertiesJavaVmName;
        Result<String> systemPropertiesRuntimeVersion;
        Result<String> systemPropertiesRuntimeName;
        Result<String> systemPropertiesOsVersion;
        Result<String> applicationVersionName;
        Result<String> systemPlatformName;
        Result<String> systemPlatformName2;
        Result<String> networkIpAddressVersion4;
        Result<String> currentDate;
        Result<String> model;
        Result<String> manufacturer;
        Result<Boolean> resultIsGmsAvailable;
        Boolean bool;
        Result<Boolean> resultIsAutomaticDateAndTime;
        Boolean bool2;
        Result<Boolean> resultIsAutomaticZone;
        Boolean bool3;
        Result<Boolean> resultIsProxy;
        Boolean bool4;
        Result<Boolean> resultIsMicrophonePresent;
        Boolean bool5;
        Result<Boolean> resultIsBluetoothEnabled;
        Boolean bool6;
        Result<Boolean> screenIsLocked;
        Boolean bool7;
        Result<Boolean> resultIsWifiSecured;
        Boolean bool8;
        Result<Boolean> resultIsDeveloperModeEnabled;
        Boolean bool9;
        Collection collectionValues2;
        Result<HashMap<Integer, Result<Boolean>>> resultIsFridaCompleteDetected;
        Result<Boolean> resultIsDebuggable;
        Boolean bool10;
        Result<Boolean> resultIsRoot;
        Boolean bool11;
        Result<Integer> screenBrightnessLevelPercent;
        Integer num4;
        Result<String> screenHeight;
        Result<String> screenWidth;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f28882w0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f28882w0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objA = aVar.f28881u0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f28882w0;
        if (i11 == 0) {
            kotlin.ResultKt.throwOnFailure(objA);
            deviceInfoResponse = (DeviceInfoResponse) ResultKt.getOrNull(globalDeviceManagerResponse.getDeviceInfoResponse());
            String str = (deviceInfoResponse == null || (storageTotal = deviceInfoResponse.getStorageTotal()) == null) ? null : (String) ResultKt.getOrNull(storageTotal);
            NumberFormat numberFormat = NumberFormat.getInstance(Locale.getDefault());
            if (str == null) {
                str = "";
            }
            Number number = numberFormat.parse(str);
            Storage storage2 = new Storage(number != null ? number.doubleValue() : 0.0d, GIGA_BYTE);
            if (deviceInfoResponse == null || (nfcStatus = deviceInfoResponse.getNfcStatus()) == null || (obj = (NfcState) ResultKt.getOrNull(nfcStatus)) == null) {
                obj = NfcState.Inactive.INSTANCE;
            }
            String upperCase = obj.toString().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            NfcStatusType nfcStatusType2 = new NfcStatusType(upperCase);
            GeolocationResponse geolocationResponse = (GeolocationResponse) ResultKt.getOrNull(globalDeviceManagerResponse.getGeolocationResponse());
            aVar.f28876p0 = this;
            aVar.f28877q0 = globalDeviceManagerResponse;
            aVar.f28878r0 = deviceInfoResponse;
            aVar.f28879s0 = storage2;
            aVar.f28880t0 = nfcStatusType2;
            aVar.f28882w0 = 1;
            objA = a(geolocationResponse);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            blackBoxDataSource = this;
            storage = storage2;
            nfcStatusType = nfcStatusType2;
            globalDeviceManagerResponse2 = globalDeviceManagerResponse;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            NfcStatusType nfcStatusType3 = aVar.f28880t0;
            Storage storage3 = aVar.f28879s0;
            deviceInfoResponse = aVar.f28878r0;
            globalDeviceManagerResponse2 = aVar.f28877q0;
            blackBoxDataSource = aVar.f28876p0;
            kotlin.ResultKt.throwOnFailure(objA);
            nfcStatusType = nfcStatusType3;
            storage = storage3;
        }
        GeolocationInfo geolocationInfo = (GeolocationInfo) objA;
        blackBoxDataSource.getClass();
        String str2 = (deviceInfoResponse == null || (screenWidth = deviceInfoResponse.getScreenWidth()) == null) ? null : (String) ResultKt.getOrNull(screenWidth);
        if (str2 == null) {
            str2 = "";
        }
        String str3 = (deviceInfoResponse == null || (screenHeight = deviceInfoResponse.getScreenHeight()) == null) ? null : (String) ResultKt.getOrNull(screenHeight);
        if (str3 == null) {
            str3 = "";
        }
        ScreenInfo screenInfo = new ScreenInfo(blackBoxDataSource.f28874a.getScreen().getOrientation().toString(), androidx.camera.core.impl.utils.a.b(str2, " x ", str3), (deviceInfoResponse == null || (screenBrightnessLevelPercent = deviceInfoResponse.getScreenBrightnessLevelPercent()) == null || (num4 = (Integer) ResultKt.getOrNull(screenBrightnessLevelPercent)) == null) ? 0 : num4.intValue());
        DeviceCheckerResponse deviceCheckerResponse = (DeviceCheckerResponse) ResultKt.getOrNull(globalDeviceManagerResponse2.getDeviceCheckerResponse());
        DeviceInfoResponse deviceInfoResponse2 = (DeviceInfoResponse) ResultKt.getOrNull(globalDeviceManagerResponse2.getDeviceInfoResponse());
        boolean zBooleanValue = (deviceCheckerResponse == null || (resultIsRoot = deviceCheckerResponse.isRoot()) == null || (bool11 = (Boolean) ResultKt.getOrNull(resultIsRoot)) == null) ? false : bool11.booleanValue();
        boolean zBooleanValue2 = (deviceCheckerResponse == null || (resultIsDebuggable = deviceCheckerResponse.isDebuggable()) == null || (bool10 = (Boolean) ResultKt.getOrNull(resultIsDebuggable)) == null) ? false : bool10.booleanValue();
        HashMap map2 = (deviceCheckerResponse == null || (resultIsFridaCompleteDetected = deviceCheckerResponse.isFridaCompleteDetected()) == null) ? null : (HashMap) ResultKt.getOrNull(resultIsFridaCompleteDetected);
        if (map2 == null || (collectionValues2 = map2.values()) == null) {
            if (deviceCheckerResponse != null || (resultIsMagiskCompleteDetected = deviceCheckerResponse.isMagiskCompleteDetected()) == null) {
                map = null;
            } else {
                map = (HashMap) ResultKt.getOrNull(resultIsMagiskCompleteDetected);
            }
            if (map != null && (collectionValues = map.values()) != null) {
                collection = collectionValues;
                if (!collection.isEmpty()) {
                    it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            result = (Result) it.next();
                            Intrinsics.checkNotNull(result);
                            if (Intrinsics.areEqual(ResultKt.getOrNull(result), Boolean.TRUE)) {
                                z10 = true;
                            }
                        }
                    }
                }
            }
            z10 = false;
        } else {
            Collection collection2 = collectionValues2;
            if (collection2.isEmpty()) {
                if (deviceCheckerResponse != null) {
                    map = null;
                } else {
                    map = null;
                }
                if (map != null) {
                    collection = collectionValues;
                    if (!collection.isEmpty()) {
                        it = collection.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                result = (Result) it.next();
                                Intrinsics.checkNotNull(result);
                                if (Intrinsics.areEqual(ResultKt.getOrNull(result), Boolean.TRUE)) {
                                    z10 = true;
                                }
                            }
                        }
                    }
                }
                z10 = false;
            } else {
                Iterator it2 = collection2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Result result2 = (Result) it2.next();
                        Intrinsics.checkNotNull(result2);
                        if (Intrinsics.areEqual(ResultKt.getOrNull(result2), Boolean.TRUE)) {
                        }
                    } else {
                        if (deviceCheckerResponse != null) {
                            map = null;
                        } else {
                            map = null;
                        }
                        if (map != null) {
                            collection = collectionValues;
                            if (!collection.isEmpty()) {
                                it = collection.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        result = (Result) it.next();
                                        Intrinsics.checkNotNull(result);
                                        if (Intrinsics.areEqual(ResultKt.getOrNull(result), Boolean.TRUE)) {
                                        }
                                    }
                                }
                            }
                        }
                        z10 = false;
                    }
                    z10 = true;
                }
            }
        }
        boolean zBooleanValue3 = (deviceCheckerResponse == null || (resultIsDeveloperModeEnabled = deviceCheckerResponse.isDeveloperModeEnabled()) == null || (bool9 = (Boolean) ResultKt.getOrNull(resultIsDeveloperModeEnabled)) == null) ? false : bool9.booleanValue();
        boolean z11 = (deviceInfoResponse2 == null || (resultIsWifiSecured = deviceInfoResponse2.isWifiSecured()) == null || (bool8 = (Boolean) ResultKt.getOrNull(resultIsWifiSecured)) == null || bool8.booleanValue()) ? false : true;
        boolean boolean$default = MainStorage.getBoolean$default(blackBoxDataSource.f28875b, LocalStorageConstantsKt.IS_AUTO_FILLED_PASSWORD_KEY, false, null, 4, null);
        blackBoxDataSource.f28875b.remove(TargetStorage.Local, LocalStorageConstantsKt.IS_AUTO_FILLED_PASSWORD_KEY);
        AlertsInfo alertsInfo = new AlertsInfo(zBooleanValue, zBooleanValue2, z10, zBooleanValue3, z11, boolean$default, false, (deviceInfoResponse2 == null || (screenIsLocked = deviceInfoResponse2.getScreenIsLocked()) == null || (bool7 = (Boolean) ResultKt.getOrNull(screenIsLocked)) == null) ? false : bool7.booleanValue());
        PhoneInfo phoneInfo = new PhoneInfo((deviceInfoResponse == null || (resultIsBluetoothEnabled = deviceInfoResponse.isBluetoothEnabled()) == null || (bool6 = (Boolean) ResultKt.getOrNull(resultIsBluetoothEnabled)) == null) ? false : bool6.booleanValue(), (deviceInfoResponse == null || (resultIsMicrophonePresent = deviceInfoResponse.isMicrophonePresent()) == null || (bool5 = (Boolean) ResultKt.getOrNull(resultIsMicrophonePresent)) == null) ? false : bool5.booleanValue(), (deviceInfoResponse == null || (resultIsProxy = deviceInfoResponse.isProxy()) == null || (bool4 = (Boolean) ResultKt.getOrNull(resultIsProxy)) == null) ? false : bool4.booleanValue(), true, (deviceInfoResponse == null || (resultIsAutomaticZone = deviceInfoResponse.isAutomaticZone()) == null || (bool3 = (Boolean) ResultKt.getOrNull(resultIsAutomaticZone)) == null) ? false : bool3.booleanValue(), (deviceInfoResponse == null || (resultIsAutomaticDateAndTime = deviceInfoResponse.isAutomaticDateAndTime()) == null || (bool2 = (Boolean) ResultKt.getOrNull(resultIsAutomaticDateAndTime)) == null) ? false : bool2.booleanValue(), (deviceInfoResponse == null || (resultIsGmsAvailable = deviceInfoResponse.isGmsAvailable()) == null || (bool = (Boolean) ResultKt.getOrNull(resultIsGmsAvailable)) == null) ? false : bool.booleanValue());
        String str4 = (deviceInfoResponse == null || (manufacturer = deviceInfoResponse.getManufacturer()) == null) ? null : (String) ResultKt.getOrNull(manufacturer);
        String str5 = str4 == null ? "" : str4;
        String str6 = (deviceInfoResponse == null || (model = deviceInfoResponse.getModel()) == null) ? null : (String) ResultKt.getOrNull(model);
        String str7 = str6 == null ? "" : str6;
        String str8 = (deviceInfoResponse == null || (currentDate = deviceInfoResponse.getCurrentDate()) == null) ? null : (String) ResultKt.getOrNull(currentDate);
        String str9 = str8 == null ? "" : str8;
        String str10 = (deviceInfoResponse == null || (networkIpAddressVersion4 = deviceInfoResponse.getNetworkIpAddressVersion4()) == null) ? null : (String) ResultKt.getOrNull(networkIpAddressVersion4);
        String str11 = str10 == null ? "" : str10;
        String str12 = (deviceInfoResponse == null || (systemPlatformName2 = deviceInfoResponse.getSystemPlatformName()) == null) ? null : (String) ResultKt.getOrNull(systemPlatformName2);
        String str13 = str12 == null ? "" : str12;
        String str14 = (deviceInfoResponse == null || (systemPlatformName = deviceInfoResponse.getSystemPlatformName()) == null) ? null : (String) ResultKt.getOrNull(systemPlatformName);
        String str15 = str14 == null ? "" : str14;
        String str16 = (deviceInfoResponse == null || (applicationVersionName = deviceInfoResponse.getApplicationVersionName()) == null) ? null : (String) ResultKt.getOrNull(applicationVersionName);
        String str17 = str16 == null ? "" : str16;
        String str18 = (deviceInfoResponse == null || (systemPropertiesOsVersion = deviceInfoResponse.getSystemPropertiesOsVersion()) == null) ? null : (String) ResultKt.getOrNull(systemPropertiesOsVersion);
        if (str18 == null) {
            str18 = "";
        }
        String str19 = (deviceInfoResponse == null || (systemPropertiesRuntimeName = deviceInfoResponse.getSystemPropertiesRuntimeName()) == null) ? null : (String) ResultKt.getOrNull(systemPropertiesRuntimeName);
        if (str19 == null) {
            str19 = "";
        }
        String str20 = (deviceInfoResponse == null || (systemPropertiesRuntimeVersion = deviceInfoResponse.getSystemPropertiesRuntimeVersion()) == null) ? null : (String) ResultKt.getOrNull(systemPropertiesRuntimeVersion);
        if (str20 == null) {
            str20 = "";
        }
        String str21 = (deviceInfoResponse == null || (systemPropertiesJavaVmName = deviceInfoResponse.getSystemPropertiesJavaVmName()) == null) ? null : (String) ResultKt.getOrNull(systemPropertiesJavaVmName);
        if (str21 == null) {
            str21 = "";
        }
        String str22 = (deviceInfoResponse == null || (systemPropertiesJavaVmVersion = deviceInfoResponse.getSystemPropertiesJavaVmVersion()) == null) ? null : (String) ResultKt.getOrNull(systemPropertiesJavaVmVersion);
        if (str22 == null) {
            str22 = "";
        }
        StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("OS version: ", str18, " Runtime: ", str19, "Runtime Version: ");
        k.e(sbC, str20, "Vm Name: ", str21, "Vm Version: ");
        sbC.append(str22);
        String string = sbC.toString();
        int iIntValue = (deviceInfoResponse == null || (batteryLevelPercent = deviceInfoResponse.getBatteryLevelPercent()) == null || (num3 = (Integer) ResultKt.getOrNull(batteryLevelPercent)) == null) ? 0 : num3.intValue();
        int iIntValue2 = (deviceInfoResponse == null || (ramUsedPercent = deviceInfoResponse.getRamUsedPercent()) == null || (num2 = (Integer) ResultKt.getOrNull(ramUsedPercent)) == null) ? 0 : num2.intValue();
        int iIntValue3 = (deviceInfoResponse == null || (networkSignalStrength = deviceInfoResponse.getNetworkSignalStrength()) == null || (num = (Integer) ResultKt.getOrNull(networkSignalStrength)) == null) ? 0 : num.intValue();
        String str23 = (deviceInfoResponse == null || (languageCode = deviceInfoResponse.getLanguageCode()) == null) ? null : (String) ResultKt.getOrNull(languageCode);
        String str24 = (str23 == null || (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str23, new String[]{Constant.DASH_STRING}, false, 0, 6, (Object) null)) == null) ? null : (String) CollectionsKt___CollectionsKt.firstOrNull(listSplit$default);
        String str25 = str24 == null ? "" : str24;
        String upperCase2 = String.valueOf((deviceInfoResponse == null || (systemCurrentTheme = deviceInfoResponse.getSystemCurrentTheme()) == null) ? null : (SystemThemeStateResponse) ResultKt.getOrNull(systemCurrentTheme)).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String str26 = (deviceInfoResponse == null || (currentTimeZone = deviceInfoResponse.getCurrentTimeZone()) == null) ? null : (String) ResultKt.getOrNull(currentTimeZone);
        String str27 = str26 == null ? "" : str26;
        String string2 = (deviceInfoResponse == null || (currentTime = deviceInfoResponse.getCurrentTime()) == null || (l6 = (Long) ResultKt.getOrNull(currentTime)) == null) ? null : l6.toString();
        String str28 = string2 == null ? "" : string2;
        String str29 = (deviceInfoResponse == null || (currentDateIso = deviceInfoResponse.getCurrentDateIso()) == null) ? null : (String) ResultKt.getOrNull(currentDateIso);
        return new BlackBox(null, storage, nfcStatusType, geolocationInfo, screenInfo, alertsInfo, phoneInfo, str5, str7, str9, str11, str13, str15, str17, string, iIntValue, iIntValue2, iIntValue3, str25, upperCase2, str27, str28, str29 == null ? "" : str29);
    }
}
