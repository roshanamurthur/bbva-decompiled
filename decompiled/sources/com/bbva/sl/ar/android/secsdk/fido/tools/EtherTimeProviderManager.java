package com.bbva.sl.ar.android.secsdk.fido.tools;

import com.instacart.library.truetime.TrueTime;
import ek.a;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EtherTimeProviderManager.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\fH\u0002¨\u0006\u000f"}, d2 = {"Lcom/bbva/sl/ar/android/secsdk/fido/tools/EtherTimeProviderManager;", "", "<init>", "()V", "initializeWith", "", "ntpHost", "", "initializeWithNtp", "isInitialized", "", "now", "", "nowFromDevice", "Companion", "fido-legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EtherTimeProviderManager {

    @Deprecated
    @NotNull
    public static final String AMAZON_NTP = "0.amazon.pool.ntp.org";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String GOOGLE_NTP = "time.google.com";

    @NotNull
    private static final String TAG;

    /* JADX INFO: renamed from: com.bbva.sl.ar.android.secsdk.fido.tools.EtherTimeProviderManager$1, reason: invalid class name */
    /* JADX INFO: compiled from: EtherTimeProviderManager.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.bbva.sl.ar.android.secsdk.fido.tools.EtherTimeProviderManager$1", f = "EtherTimeProviderManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EtherTimeProviderManager.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EtherTimeProviderManager.this.initializeWith("0.amazon.pool.ntp.org");
            EtherTimeProviderManager.this.initializeWith("time.google.com");
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: compiled from: EtherTimeProviderManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bbva/sl/ar/android/secsdk/fido/tools/EtherTimeProviderManager$Companion;", "", "<init>", "()V", "TAG", "", "AMAZON_NTP", "GOOGLE_NTP", "fido-legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("EtherTimeProviderManager", "getSimpleName(...)");
        TAG = "EtherTimeProviderManager";
    }

    public EtherTimeProviderManager() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void initializeWith(String ntpHost) {
        Object objM5535constructorimpl;
        Calendar.getInstance().getTimeInMillis();
        try {
            Result.Companion companion = Result.INSTANCE;
            if (!isInitialized()) {
                initializeWithNtp(ntpHost);
                Calendar.getInstance().getTimeInMillis();
            }
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            Calendar.getInstance().getTimeInMillis();
            thM5538exceptionOrNullimpl.toString();
        }
    }

    private final void initializeWithNtp(String ntpHost) throws Exception {
        TrueTime.build().withConnectionTimeout(5000).withNtpHost(ntpHost).initialize();
    }

    private final boolean isInitialized() {
        return TrueTime.isInitialized();
    }

    private final long nowFromDevice() {
        return Calendar.getInstance().getTimeInMillis();
    }

    public final long now() {
        if (!isInitialized()) {
            return nowFromDevice();
        }
        Date dateNow = TrueTime.now();
        return dateNow != null ? dateNow.getTime() : nowFromDevice();
    }
}
