package com.bbva.notifications.activity;

import android.content.Intent;
import com.bbva.glomohybrid.base.deeplink.model.DeeplinkConfig;
import com.bbva.glomohybrid.base.deeplink.model.LinkParamsKt;
import com.bbva.glomohybrid.base.deeplink.modules.DynamicLinkModuleKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import n4.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;

/* JADX INFO: compiled from: NotificationNoCommercialActivity.kt */
/* JADX INFO: loaded from: classes7.dex */
@DebugMetadata(c = "com.bbva.notifications.activity.NotificationNoCommercialActivity$onCreate$1$1", f = "NotificationNoCommercialActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nNotificationNoCommercialActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationNoCommercialActivity.kt\ncom/bbva/notifications/activity/NotificationNoCommercialActivity$onCreate$1$1\n+ 2 ComponentCallbackExt.kt\norg/koin/android/ext/android/ComponentCallbackExtKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,348:1\n52#2,5:349\n133#3:354\n*S KotlinDebug\n*F\n+ 1 NotificationNoCommercialActivity.kt\ncom/bbva/notifications/activity/NotificationNoCommercialActivity$onCreate$1$1\n*L\n94#1:349,5\n94#1:354\n*E\n"})
public final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public /* synthetic */ Object f35330p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ NotificationNoCommercialActivity f35331q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(NotificationNoCommercialActivity notificationNoCommercialActivity, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f35331q0 = notificationNoCommercialActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        c cVar = new c(this.f35331q0, continuation);
        cVar.f35330p0 = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f35330p0;
        NotificationNoCommercialActivity notificationNoCommercialActivity = this.f35331q0;
        notificationNoCommercialActivity.m().addViewModelAsComponent(coroutineScope.hashCode());
        notificationNoCommercialActivity.m().setUpObservers();
        notificationNoCommercialActivity.setContentView(notificationNoCommercialActivity.k().getRoot());
        NotificationNoCommercialActivity.access$configureUIComponents(notificationNoCommercialActivity);
        NotificationNoCommercialActivity.access$setupAdapter(notificationNoCommercialActivity);
        NotificationNoCommercialActivity.access$setIsLoading(notificationNoCommercialActivity, true);
        notificationNoCommercialActivity.k().iconClose.setOnClickListener(new j(notificationNoCommercialActivity, 2));
        NotificationNoCommercialActivity.access$setupObservers(notificationNoCommercialActivity);
        Intent intent = notificationNoCommercialActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        NotificationNoCommercialActivity.access$processIntent(notificationNoCommercialActivity, LinkParamsKt.toLinkParams(intent, (DeeplinkConfig) AndroidKoinScopeExtKt.getKoinScope(notificationNoCommercialActivity).get(Reflection.getOrCreateKotlinClass(DeeplinkConfig.class), DynamicLinkModuleKt.getDeeplinkConfig(), null), null));
        return Unit.INSTANCE;
    }
}
