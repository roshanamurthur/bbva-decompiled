package com.veridas.contextualdata;

import android.content.Context;
import com.adobe.marketing.mobile.EventDataKeys;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VDContextualData.kt */
/* JADX INFO: loaded from: classes9.dex */
@Deprecated(message = "This class is provided just for legacy support and shouldn't be used")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\n\u001a\u00020\bH\u0007J\b\u0010\u000b\u001a\u00020\u0006H\u0007J\b\u0010\r\u001a\u00020\fH\u0007¨\u0006\u0011"}, d2 = {"Lcom/veridas/contextualdata/VDContextualData;", "", "Lcom/veridas/contextualdata/VDContextualData$IVDContextualDataDelegate;", "delegate", "Landroid/content/Context;", "applicationContext", "", "shouldLocate", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "isStarted", "", "getVersion", "<init>", "()V", "IVDContextualDataDelegate", "common-core_release"}, k = 1, mv = {1, 9, 0})
public final class VDContextualData {

    @NotNull
    public static final VDContextualData INSTANCE = new VDContextualData();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f66694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static IVDContextualDataDelegate f66695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public static CoroutineScope f66696c;

    /* JADX INFO: compiled from: VDContextualData.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH&¨\u0006\n"}, d2 = {"Lcom/veridas/contextualdata/VDContextualData$IVDContextualDataDelegate;", "", "contextualDataFinished", "", "successfully", "", "contextualDataGathered", "contextualData", "", "", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface IVDContextualDataDelegate {
        void contextualDataFinished(boolean successfully);

        void contextualDataGathered(@NotNull Map<String, String> contextualData);
    }

    /* JADX INFO: compiled from: VDContextualData.kt */
    @DebugMetadata(c = "com.veridas.contextualdata.VDContextualData$start$1", f = "VDContextualData.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f66697p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SdkContextualDataUseCase f66698q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SdkContextualDataUseCase sdkContextualDataUseCase, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f66698q0 = sdkContextualDataUseCase;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f66698q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f66697p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f66697p0 = 1;
                obj = this.f66698q0.getAllAvailableData(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Map<String, String> map = (Map) obj;
            IVDContextualDataDelegate iVDContextualDataDelegate = VDContextualData.f66695b;
            if (iVDContextualDataDelegate != null) {
                iVDContextualDataDelegate.contextualDataGathered(map);
            }
            IVDContextualDataDelegate iVDContextualDataDelegate2 = VDContextualData.f66695b;
            if (iVDContextualDataDelegate2 != null) {
                iVDContextualDataDelegate2.contextualDataFinished(true);
            }
            VDContextualData.f66694a = false;
            return Unit.INSTANCE;
        }
    }

    @JvmStatic
    @NotNull
    public static final String getVersion() {
        return "8.4.0";
    }

    @JvmStatic
    public static final boolean isStarted() {
        return f66694a;
    }

    @JvmStatic
    public static final void start(@NotNull IVDContextualDataDelegate delegate, @NotNull Context applicationContext, boolean shouldLocate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        if (f66694a) {
            return;
        }
        f66694a = true;
        f66695b = delegate;
        Context applicationContext2 = applicationContext.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
        SdkContextualDataUseCase sdkContextualDataUseCase = new SdkContextualDataUseCase(new ContextualDataProvider(applicationContext2), shouldLocate);
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));
        f66696c = CoroutineScope;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new a(sdkContextualDataUseCase, null), 3, null);
    }

    @JvmStatic
    public static final void stop() {
        CoroutineScope coroutineScope = f66696c;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        f66696c = null;
        if (f66694a) {
            f66694a = false;
            IVDContextualDataDelegate iVDContextualDataDelegate = f66695b;
            if (iVDContextualDataDelegate != null) {
                iVDContextualDataDelegate.contextualDataFinished(false);
            }
        }
        f66695b = null;
    }
}
