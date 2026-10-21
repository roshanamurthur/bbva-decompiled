package com.bbva.plugin.wearables.info.library;

import android.content.Context;
import com.bbva.glomoutils.mobileservices.MobileServices;
import com.bbva.plugin.wearables.info.library.models.PairedDeviceState;
import com.bbva.plugin.wearables.info.library.providers.DependenciesProvider;
import com.bbva.plugin.wearables.info.library.providers.UseCaseProvider;
import com.bbva.plugin.wearables.info.library.usecase.IsDevicePairedUserCase;
import com.bbva.plugin.wearables.info.library.usecase.IsPairedDeviceAppInstalledUseCase;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WearableDeviceInfo.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/bbva/plugin/wearables/info/library/WearableDeviceInfo;", "", "", "capabilityId", "Lcom/bbva/plugin/wearables/info/library/models/PairedDeviceState;", "getConnectionState", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "context", "Lcom/bbva/glomoutils/mobileservices/MobileServices;", "mobileServices", "Lcom/bbva/plugin/wearables/info/library/providers/UseCaseProvider;", "useCaseProvider", "<init>", "(Landroid/content/Context;Lcom/bbva/glomoutils/mobileservices/MobileServices;Lcom/bbva/plugin/wearables/info/library/providers/UseCaseProvider;)V", "plugin-wearables-info_release"}, k = 1, mv = {1, 9, 0})
public final class WearableDeviceInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final UseCaseProvider f36063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lazy f36064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Lazy f36065c;

    /* JADX INFO: compiled from: WearableDeviceInfo.kt */
    @DebugMetadata(c = "com.bbva.plugin.wearables.info.library.WearableDeviceInfo", f = "WearableDeviceInfo.kt", i = {0, 0, 1}, l = {26, 27}, m = "getConnectionState", n = {"this", "capabilityId", "isConnectionAvailable"}, s = {"L$0", "L$1", "Z$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public WearableDeviceInfo f36066p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f36067q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f36068r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f36069s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f36071u0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36069s0 = obj;
            this.f36071u0 |= Integer.MIN_VALUE;
            return WearableDeviceInfo.this.getConnectionState(null, this);
        }
    }

    /* JADX INFO: compiled from: WearableDeviceInfo.kt */
    public static final class b extends Lambda implements Function0<IsPairedDeviceAppInstalledUseCase> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final IsPairedDeviceAppInstalledUseCase invoke() {
            return WearableDeviceInfo.this.f36063a.isAppInstalled();
        }
    }

    /* JADX INFO: compiled from: WearableDeviceInfo.kt */
    public static final class c extends Lambda implements Function0<IsDevicePairedUserCase> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final IsDevicePairedUserCase invoke() {
            return WearableDeviceInfo.this.f36063a.isDeviceConnected();
        }
    }

    public WearableDeviceInfo(@NotNull Context context, @NotNull MobileServices mobileServices, @NotNull UseCaseProvider useCaseProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mobileServices, "mobileServices");
        Intrinsics.checkNotNullParameter(useCaseProvider, "useCaseProvider");
        this.f36063a = useCaseProvider;
        this.f36064b = LazyKt__LazyJVMKt.lazy(new c());
        this.f36065c = LazyKt__LazyJVMKt.lazy(new b());
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:27:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getConnectionState(@NotNull String str, @NotNull Continuation<? super PairedDeviceState> continuation) {
        a aVar;
        WearableDeviceInfo wearableDeviceInfo;
        boolean z10;
        boolean zBooleanValue;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f36071u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f36071u0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objInvoke = aVar.f36069s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f36071u0;
        if (i11 != 0) {
            if (i11 == 1) {
                str = aVar.f36067q0;
                wearableDeviceInfo = aVar.f36066p0;
                ResultKt.throwOnFailure(objInvoke);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z10 = aVar.f36068r0;
                ResultKt.throwOnFailure(objInvoke);
            }
            zBooleanValue = ((Boolean) objInvoke).booleanValue();
            if (z10) {
                return !zBooleanValue ? PairedDeviceState.APP_NOT_INSTALLED : PairedDeviceState.CONNECTION_AVAILABLE;
            }
            return PairedDeviceState.CONNECTION_NOT_AVAILABLE;
        }
        ResultKt.throwOnFailure(objInvoke);
        IsDevicePairedUserCase isDevicePairedUserCase = (IsDevicePairedUserCase) this.f36064b.getValue();
        aVar.f36066p0 = this;
        aVar.f36067q0 = str;
        aVar.f36071u0 = 1;
        objInvoke = isDevicePairedUserCase.invoke(aVar);
        if (objInvoke == coroutine_suspended) {
            return coroutine_suspended;
        }
        wearableDeviceInfo = this;
        boolean zBooleanValue2 = ((Boolean) objInvoke).booleanValue();
        IsPairedDeviceAppInstalledUseCase isPairedDeviceAppInstalledUseCase = (IsPairedDeviceAppInstalledUseCase) wearableDeviceInfo.f36065c.getValue();
        aVar.f36066p0 = null;
        aVar.f36067q0 = null;
        aVar.f36068r0 = zBooleanValue2;
        aVar.f36071u0 = 2;
        Object objInvoke2 = isPairedDeviceAppInstalledUseCase.invoke(str, aVar);
        if (objInvoke2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        objInvoke = objInvoke2;
        z10 = zBooleanValue2;
        zBooleanValue = ((Boolean) objInvoke).booleanValue();
        if (z10) {
            return PairedDeviceState.CONNECTION_NOT_AVAILABLE;
        }
        if (!zBooleanValue) {
        }
    }

    public /* synthetic */ WearableDeviceInfo(Context context, MobileServices mobileServices, UseCaseProvider useCaseProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, mobileServices, (i10 & 4) != 0 ? new DependenciesProvider(context, mobileServices) : useCaseProvider);
    }
}
