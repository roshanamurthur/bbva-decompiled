package com.mastercard.sonic.analytics.mixpanel;

import com.mastercard.sonic.network.MixPanelNetworkCalls;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MixPanelAnalyticsManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@DebugMetadata(c = "com.mastercard.sonic.analytics.mixpanel.MixPanelAnalyticsManager$syncFileToMixPanelAnalytics$1", f = "MixPanelAnalyticsManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public /* synthetic */ Object f51060p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ MixPanelAnalyticsManager f51061q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ String f51062r0;

    /* JADX INFO: renamed from: com.mastercard.sonic.analytics.mixpanel.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MixPanelAnalyticsManager.kt */
    @DebugMetadata(c = "com.mastercard.sonic.analytics.mixpanel.MixPanelAnalyticsManager$syncFileToMixPanelAnalytics$1$1", f = "MixPanelAnalyticsManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C0230a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MixPanelAnalyticsManager f51063p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f51064q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0230a(MixPanelAnalyticsManager mixPanelAnalyticsManager, String str, Continuation<? super C0230a> continuation) {
            super(2, continuation);
            this.f51063p0 = mixPanelAnalyticsManager;
            this.f51064q0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C0230a(this.f51063p0, this.f51064q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C0230a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MixPanelNetworkCalls.Companion companion = MixPanelNetworkCalls.INSTANCE;
            MixPanelAnalyticsManager mixPanelAnalyticsManager = this.f51063p0;
            if (200 == companion.syncMixPanelData(mixPanelAnalyticsManager.f51032g.getAnalyticsUrl(), this.f51064q0)) {
                MixPanelFileHandling.INSTANCE.getInstance(mixPanelAnalyticsManager.f51026a).deleteSyncedFile();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MixPanelAnalyticsManager mixPanelAnalyticsManager, String str, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f51061q0 = mixPanelAnalyticsManager;
        this.f51062r0 = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        a aVar = new a(this.f51061q0, this.f51062r0, continuation);
        aVar.f51060p0 = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f51060p0;
        MixPanelAnalyticsManager mixPanelAnalyticsManager = this.f51061q0;
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, mixPanelAnalyticsManager.f51034i, null, new C0230a(mixPanelAnalyticsManager, this.f51062r0, null), 2, null);
    }
}
