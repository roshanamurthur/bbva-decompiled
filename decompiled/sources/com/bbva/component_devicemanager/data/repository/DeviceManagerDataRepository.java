package com.bbva.component_devicemanager.data.repository;

import com.bbva.component_devicemanager.data.datasource.ActiveServicesDataSource;
import com.bbva.component_devicemanager.data.datasource.BlackBoxDataSource;
import com.bbva.component_devicemanager.domain.model.BlackBox;
import com.bbva.component_devicemanager.domain.model.Country;
import com.bbva.component_devicemanager.domain.model.DeviceManager;
import com.bbva.component_devicemanager.domain.model.DeviceManagerData;
import com.bbva.component_devicemanager.domain.model.DeviceManagerDataSource;
import com.bbva.component_devicemanager.domain.model.DeviceType;
import com.bbva.component_devicemanager.domain.model.GlobalDeviceManagerResponse;
import com.bbva.component_devicemanager.domain.model.StatusType;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceCheckerPlayIntegrityResponse;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceIdResponse;
import com.bbva.ethermobilesdk.devicemanager.model.output.DeviceUIdResponse;
import com.veridas.contextualdata.ContextualDataConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeviceManagerDataRepository.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/bbva/component_devicemanager/data/repository/DeviceManagerDataRepository;", "", "Lcom/bbva/component_devicemanager/domain/model/DeviceManagerData;", "fetchDeviceManagerData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/component_devicemanager/domain/model/DeviceManagerDataSource;", "deviceManager", "", ContextualDataConstants.CD_COUNTRY_CODE, "Lcom/bbva/component_devicemanager/data/datasource/ActiveServicesDataSource;", "activeServicesDataSource", "Lcom/bbva/component_devicemanager/data/datasource/BlackBoxDataSource;", "blackBoxDataSource", "<init>", "(Lcom/bbva/component_devicemanager/domain/model/DeviceManagerDataSource;Ljava/lang/String;Lcom/bbva/component_devicemanager/data/datasource/ActiveServicesDataSource;Lcom/bbva/component_devicemanager/data/datasource/BlackBoxDataSource;)V", "component-devicemanager_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class DeviceManagerDataRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DeviceManagerDataSource f28891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f28892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ActiveServicesDataSource f28893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final BlackBoxDataSource f28894d;

    /* JADX INFO: compiled from: DeviceManagerDataRepository.kt */
    @DebugMetadata(c = "com.bbva.component_devicemanager.data.repository.DeviceManagerDataRepository", f = "DeviceManagerDataRepository.kt", i = {}, l = {25}, m = "fetchDeviceManagerData", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f28895p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f28897r0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f28895p0 = obj;
            this.f28897r0 |= Integer.MIN_VALUE;
            return DeviceManagerDataRepository.this.fetchDeviceManagerData(this);
        }
    }

    /* JADX INFO: compiled from: DeviceManagerDataRepository.kt */
    @DebugMetadata(c = "com.bbva.component_devicemanager.data.repository.DeviceManagerDataRepository", f = "DeviceManagerDataRepository.kt", i = {0}, l = {39}, m = "mapData", n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public DeviceManagerDataRepository f28898p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f28899q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public String f28900r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public String f28901s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public DeviceType f28902t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Country f28903u0;
        public StatusType v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public /* synthetic */ Object f28904w0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public int f28906y0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f28904w0 = obj;
            this.f28906y0 |= Integer.MIN_VALUE;
            return DeviceManagerDataRepository.this.a(null, this);
        }
    }

    public DeviceManagerDataRepository(@NotNull DeviceManagerDataSource deviceManager, @NotNull String countryCode, @NotNull ActiveServicesDataSource activeServicesDataSource, @NotNull BlackBoxDataSource blackBoxDataSource) {
        Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(activeServicesDataSource, "activeServicesDataSource");
        Intrinsics.checkNotNullParameter(blackBoxDataSource, "blackBoxDataSource");
        this.f28891a = deviceManager;
        this.f28892b = countryCode;
        this.f28893c = activeServicesDataSource;
        this.f28894d = blackBoxDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object a(GlobalDeviceManagerResponse globalDeviceManagerResponse, Continuation<? super DeviceManagerData> continuation) {
        b bVar;
        String str;
        StatusType statusType;
        String str2;
        DeviceType deviceType;
        DeviceManagerDataRepository deviceManagerDataRepository;
        Country country;
        String str3;
        DeviceCheckerPlayIntegrityResponse deviceCheckerPlayIntegrityResponse;
        Result<String> integrityToken;
        Result<String> uid;
        Result<String> id;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f28906y0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f28906y0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f28904w0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f28906y0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            DeviceIdResponse deviceIdResponse = (DeviceIdResponse) com.bbva.ethermobile.help.kit.result.ResultKt.getOrNull(globalDeviceManagerResponse.getDeviceIdResponse());
            String str4 = (deviceIdResponse == null || (id = deviceIdResponse.getId()) == null) ? null : (String) com.bbva.ethermobile.help.kit.result.ResultKt.getOrNull(id);
            String str5 = str4 == null ? "" : str4;
            DeviceUIdResponse deviceUIdResponse = (DeviceUIdResponse) com.bbva.ethermobile.help.kit.result.ResultKt.getOrNull(globalDeviceManagerResponse.getDeviceUIdResponse());
            String str6 = (deviceUIdResponse == null || (uid = deviceUIdResponse.getUid()) == null) ? null : (String) com.bbva.ethermobile.help.kit.result.ResultKt.getOrNull(uid);
            String str7 = str6 == null ? "" : str6;
            Result<DeviceCheckerPlayIntegrityResponse> deviceCheckerPlayIntegrityResponse2 = globalDeviceManagerResponse.getDeviceCheckerPlayIntegrityResponse();
            str = (deviceCheckerPlayIntegrityResponse2 == null || (deviceCheckerPlayIntegrityResponse = (DeviceCheckerPlayIntegrityResponse) com.bbva.ethermobile.help.kit.result.ResultKt.getOrNull(deviceCheckerPlayIntegrityResponse2)) == null || (integrityToken = deviceCheckerPlayIntegrityResponse.getIntegrityToken()) == null) ? null : (String) com.bbva.ethermobile.help.kit.result.ResultKt.getOrNull(integrityToken);
            DeviceType deviceType2 = new DeviceType(DeviceManager.DeviceType.MOBILE.toString());
            Country country2 = new Country(this.f28892b);
            statusType = new StatusType(DeviceManager.StatusType.ACTIVE.toString());
            bVar.f28898p0 = this;
            bVar.f28899q0 = str5;
            bVar.f28900r0 = str7;
            bVar.f28901s0 = str;
            bVar.f28902t0 = deviceType2;
            bVar.f28903u0 = country2;
            bVar.v0 = statusType;
            bVar.f28906y0 = 1;
            Object blackBox = this.f28894d.getBlackBox(globalDeviceManagerResponse, bVar);
            if (blackBox == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = str7;
            deviceType = deviceType2;
            obj = blackBox;
            deviceManagerDataRepository = this;
            String str8 = str5;
            country = country2;
            str3 = str8;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            StatusType statusType2 = bVar.v0;
            Country country3 = bVar.f28903u0;
            DeviceType deviceType3 = bVar.f28902t0;
            str = bVar.f28901s0;
            String str9 = bVar.f28900r0;
            String str10 = bVar.f28899q0;
            deviceManagerDataRepository = bVar.f28898p0;
            ResultKt.throwOnFailure(obj);
            statusType = statusType2;
            country = country3;
            str3 = str10;
            deviceType = deviceType3;
            str2 = str9;
        }
        return new DeviceManagerData(str3, str2, str, deviceType, country, statusType, (BlackBox) obj, deviceManagerDataRepository.f28893c.getActiveServices());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object fetchDeviceManagerData(@NotNull Continuation<? super DeviceManagerData> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f28897r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f28897r0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objA = aVar.f28895p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f28897r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objA);
            GlobalDeviceManagerResponse globalDeviceManagerResponseCollectData = this.f28891a.collectData();
            if (globalDeviceManagerResponseCollectData == null) {
                return null;
            }
            aVar.f28897r0 = 1;
            objA = a(globalDeviceManagerResponseCollectData, aVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objA);
        }
        DeviceManagerData deviceManagerData = (DeviceManagerData) objA;
        if (deviceManagerData == null) {
            return null;
        }
        return deviceManagerData;
    }
}
