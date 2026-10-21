package com.bbva.glomohybrid.settings;

import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.component.dm.settings.domain.model.AppSettingsResult;
import com.bbva.component.dm.settings.domain.usecase.AppSettingsObserver;
import com.bbva.glomohybrid.base.cells.channels.AppSettingsChannels;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WebAppSettingsObserver.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u000fB\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomohybrid/settings/WebAppSettingsObserver;", "Lcom/bbva/component/dm/settings/domain/usecase/AppSettingsObserver;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/bbva/component/dm/settings/domain/model/AppSettingsResult;", "appSettingsResult", "", "onReceive", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/bbva/bridge/dispatcher/MessageDispatcher;", "webDispatcher", "<init>", "(Lcom/bbva/bridge/dispatcher/MessageDispatcher;)V", "Companion", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class WebAppSettingsObserver implements AppSettingsObserver, CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final MessageDispatcher f34469p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f34470q0;

    /* JADX INFO: compiled from: WebAppSettingsObserver.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.settings.WebAppSettingsObserver$onReceive$1", f = "WebAppSettingsObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WebAppSettingsObserver.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MessageDispatcher messageDispatcher = WebAppSettingsObserver.this.f34469p0;
            String name = AppSettingsChannels.INSTANCE.getAppSettingsChannel().getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            messageDispatcher.sendMessage(name, Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
    }

    public WebAppSettingsObserver(@NotNull MessageDispatcher webDispatcher) {
        Intrinsics.checkNotNullParameter(webDispatcher, "webDispatcher");
        this.f34469p0 = webDispatcher;
        this.f34470q0 = CoroutineScopeKt.MainScope();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f34470q0.getCoroutineContext();
    }

    @Override // com.bbva.component.dm.settings.domain.usecase.AppSettingsObserver
    public void onReceive(@NotNull AppSettingsResult appSettingsResult) {
        Intrinsics.checkNotNullParameter(appSettingsResult, "appSettingsResult");
        if ((appSettingsResult instanceof AppSettingsResult.FreshResult) && ((AppSettingsResult.FreshResult) appSettingsResult).getCode() == 200) {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(null), 3, null);
        }
    }
}
