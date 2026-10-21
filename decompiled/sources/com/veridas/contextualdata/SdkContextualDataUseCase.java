package com.veridas.contextualdata;

import com.veridas.contextualdata.location.GeoPoint;
import com.veridas.contextualdata.network.NetworkType;
import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SdkContextualDataUseCase.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/veridas/contextualdata/SdkContextualDataUseCase;", "", "", "", "getAllAvailableData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/veridas/contextualdata/IContextualDataProvider;", "cdp", "", "shouldLocate", "<init>", "(Lcom/veridas/contextualdata/IContextualDataProvider;Z)V", "Companion", "common-core_release"}, k = 1, mv = {1, 9, 0})
public final class SdkContextualDataUseCase {
    public static final int BYTES_IN_GIGABYTE = 1073741824;
    public static final int TIMEOUT_SECONDS = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final IContextualDataProvider f66684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f66685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final DecimalFormat f66686c;

    /* JADX INFO: compiled from: SdkContextualDataUseCase.kt */
    @DebugMetadata(c = "com.veridas.contextualdata.SdkContextualDataUseCase$getAllAvailableData$2", f = "SdkContextualDataUseCase.kt", i = {0}, l = {70}, m = "invokeSuspend", n = {"contextualDataMap"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Map<String, String>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public LinkedHashMap f66687p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f66688q0;

        /* JADX INFO: renamed from: com.veridas.contextualdata.SdkContextualDataUseCase$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SdkContextualDataUseCase.kt */
        @DebugMetadata(c = "com.veridas.contextualdata.SdkContextualDataUseCase$getAllAvailableData$2$1$3", f = "SdkContextualDataUseCase.kt", i = {}, l = {71, 71, 75}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0276a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public Map f66690p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public int f66691q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ SdkContextualDataUseCase f66692r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ Map<String, String> f66693s0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0276a(SdkContextualDataUseCase sdkContextualDataUseCase, Map<String, String> map, Continuation<? super C0276a> continuation) {
                super(2, continuation);
                this.f66692r0 = sdkContextualDataUseCase;
                this.f66693s0 = map;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0276a(this.f66692r0, this.f66693s0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
                return ((C0276a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:22:0x0051  */
            /* JADX WARN: Code duplicated, block: B:24:0x007e A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:25:0x007f  */
            /* JADX WARN: Code duplicated, block: B:28:0x0084  */
            /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                GeoPoint geoPoint;
                Map<String, String> map;
                Map<String, String> map2;
                String str;
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f66691q0;
                SdkContextualDataUseCase sdkContextualDataUseCase = this.f66692r0;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else if (i10 == 2) {
                        ResultKt.throwOnFailure(obj);
                        geoPoint = (GeoPoint) obj;
                        if (geoPoint != null) {
                            return null;
                        }
                        String strValueOf = String.valueOf(geoPoint.getLatitude());
                        map = this.f66693s0;
                        map.put("latitude", strValueOf);
                        map.put("longitude", String.valueOf(geoPoint.getLongitude()));
                        IContextualDataProvider iContextualDataProvider = sdkContextualDataUseCase.f66684a;
                        this.f66690p0 = map;
                        this.f66691q0 = 3;
                        obj = iContextualDataProvider.getCountry(geoPoint, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        map2 = map;
                    } else {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        map2 = this.f66690p0;
                        ResultKt.throwOnFailure(obj);
                    }
                    str = (String) obj;
                    if (str != null) {
                        return map2.put(ContextualDataConstants.CD_COUNTRY_CODE, str);
                    }
                    return null;
                }
                ResultKt.throwOnFailure(obj);
                IContextualDataProvider iContextualDataProvider2 = sdkContextualDataUseCase.f66684a;
                this.f66691q0 = 1;
                obj = iContextualDataProvider2.getLastKnownLocation(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                geoPoint = (GeoPoint) obj;
                if (geoPoint == null) {
                    IContextualDataProvider iContextualDataProvider3 = sdkContextualDataUseCase.f66684a;
                    this.f66691q0 = 2;
                    obj = iContextualDataProvider3.getLocation(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    geoPoint = (GeoPoint) obj;
                }
                if (geoPoint != null) {
                    return null;
                }
                String strValueOf2 = String.valueOf(geoPoint.getLatitude());
                map = this.f66693s0;
                map.put("latitude", strValueOf2);
                map.put("longitude", String.valueOf(geoPoint.getLongitude()));
                IContextualDataProvider iContextualDataProvider4 = sdkContextualDataUseCase.f66684a;
                this.f66690p0 = map;
                this.f66691q0 = 3;
                obj = iContextualDataProvider4.getCountry(geoPoint, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                map2 = map;
                str = (String) obj;
                if (str != null) {
                    return map2.put(ContextualDataConstants.CD_COUNTRY_CODE, str);
                }
                return null;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SdkContextualDataUseCase.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Map<String, String>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LinkedHashMap linkedHashMap;
            String strName;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f66688q0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                SdkContextualDataUseCase sdkContextualDataUseCase = SdkContextualDataUseCase.this;
                linkedHashMap2.put(ContextualDataConstants.CD_OS_NAME, sdkContextualDataUseCase.f66684a.getOsName());
                linkedHashMap2.put(ContextualDataConstants.CD_OS_VERSION, String.valueOf(sdkContextualDataUseCase.f66684a.getOsVersionNumber()));
                linkedHashMap2.put(ContextualDataConstants.CD_DEVICE_MODEL, sdkContextualDataUseCase.f66684a.getDeviceModel());
                linkedHashMap2.put(ContextualDataConstants.CD_SDK_VERSION, sdkContextualDataUseCase.f66684a.getSdkVersionName());
                linkedHashMap2.put("language", sdkContextualDataUseCase.f66684a.getLanguage());
                NetworkType networkConnectionType = sdkContextualDataUseCase.f66684a.getNetworkConnectionType();
                if (networkConnectionType != null && (strName = networkConnectionType.name()) != null) {
                }
                String mobileCarrierName = sdkContextualDataUseCase.f66684a.getMobileCarrierName();
                if (mobileCarrierName != null) {
                }
                float f6 = 1073741824;
                String str = sdkContextualDataUseCase.f66686c.format(Boxing.boxFloat(sdkContextualDataUseCase.f66684a.getRamSizeBytes() / f6));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                linkedHashMap2.put(ContextualDataConstants.CD_DEVICE_RAM_SIZE, str);
                DecimalFormat decimalFormat = sdkContextualDataUseCase.f66686c;
                Float internalStorageSizeBytes = sdkContextualDataUseCase.f66684a.getInternalStorageSizeBytes();
                String str2 = decimalFormat.format(internalStorageSizeBytes != null ? Boxing.boxFloat(internalStorageSizeBytes.floatValue() / f6) : null);
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                linkedHashMap2.put(ContextualDataConstants.CD_INTERNAL_STORAGE_SIZE, str2);
                if (!sdkContextualDataUseCase.f66685b) {
                    return linkedHashMap2;
                }
                Duration.Companion companion = Duration.INSTANCE;
                long duration = DurationKt.toDuration(5, DurationUnit.SECONDS);
                C0276a c0276a = new C0276a(sdkContextualDataUseCase, linkedHashMap2, null);
                this.f66687p0 = linkedHashMap2;
                this.f66688q0 = 1;
                if (TimeoutKt.m5952withTimeoutOrNullKLykuaI(duration, c0276a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                linkedHashMap = linkedHashMap2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                linkedHashMap = this.f66687p0;
                ResultKt.throwOnFailure(obj);
            }
            return linkedHashMap;
        }
    }

    public SdkContextualDataUseCase(@NotNull IContextualDataProvider cdp, boolean z10) {
        Intrinsics.checkNotNullParameter(cdp, "cdp");
        this.f66684a = cdp;
        this.f66685b = z10;
        this.f66686c = new DecimalFormat("#.##");
    }

    @Nullable
    public final Object getAllAvailableData(@NotNull Continuation<? super Map<String, String>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new a(null), continuation);
    }
}
