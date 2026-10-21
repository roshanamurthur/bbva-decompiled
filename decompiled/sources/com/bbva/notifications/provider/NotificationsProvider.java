package com.bbva.notifications.provider;

import android.content.Context;
import com.bbva.notifications.R;
import com.bbva.notifications.handlers.TimerCounterPushHandler;
import com.bbva.push.PushManager;
import com.bbva.push.PushManagerBuilder;
import com.bbva.push.executor.PushExecutor;
import com.bbva.push.firebase.ManualFirebasePushHandler;
import com.bbva.push.handler.PushHandler;
import com.bbva.push.model.NotificationChannel;
import com.bbva.push.model.NotificationImportance;
import com.bbva.push.salesforce.SalesforcePushHandler;
import com.bbva.push.source.PushSource;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: NotificationsProvider.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@BX\u0086.¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/bbva/notifications/provider/NotificationsProvider;", "Lorg/koin/core/component/KoinComponent;", "Landroid/content/Context;", "context", "", "initialize", "Lcom/bbva/push/PushManager;", "<set-?>", "p0", "Lcom/bbva/push/PushManager;", "getPushManager", "()Lcom/bbva/push/PushManager;", "pushManager", "<init>", "()V", "Companion", "Notifications_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNotificationsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationsProvider.kt\ncom/bbva/notifications/provider/NotificationsProvider\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n+ 4 Koin.kt\norg/koin/core/Koin\n+ 5 PushManager.kt\ncom/bbva/push/PushManager$Companion\n+ 6 KoinExtensions.kt\ncom/bbva/glomoutils/koin/KoinExtensionsKt\n*L\n1#1,71:1\n41#2,6:72\n47#2:79\n41#2,6:94\n47#2:101\n133#3:78\n158#3:87\n158#3:93\n133#3:100\n158#3:108\n158#3:114\n107#4:80\n120#4:86\n120#4:92\n107#4:102\n120#4:107\n120#4:113\n47#5:81\n42#6,4:82\n42#6,4:88\n42#6,4:103\n42#6,4:109\n*S KotlinDebug\n*F\n+ 1 NotificationsProvider.kt\ncom/bbva/notifications/provider/NotificationsProvider\n*L\n35#1:72,6\n35#1:79\n52#1:94,6\n52#1:101\n35#1:78\n40#1:87\n46#1:93\n52#1:100\n58#1:108\n64#1:114\n35#1:80\n40#1:86\n46#1:92\n52#1:102\n58#1:107\n64#1:113\n35#1:81\n40#1:82,4\n46#1:88,4\n58#1:103,4\n64#1:109,4\n*E\n"})
public final class NotificationsProvider implements KoinComponent {

    @NotNull
    public static final String NOTIFICATION_DESCRIPTION = "BBVA-Notification";

    @NotNull
    public static final String NOTIFICATION_ID = "BBVA-Notifications-id";

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public PushManager pushManager;

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final PushManager getPushManager() {
        PushManager pushManager = this.pushManager;
        if (pushManager != null) {
            return pushManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("pushManager");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void initialize(@NotNull Context context) {
        Object objM5535constructorimpl;
        Object objM5535constructorimpl2;
        Object objM5535constructorimpl3;
        Object objM5535constructorimpl4;
        Object objM5535constructorimpl5;
        Scope rootScope;
        KClass<?> orCreateKotlinClass;
        Intrinsics.checkNotNullParameter(context, "context");
        NotificationChannel notificationChannel = new NotificationChannel(NOTIFICATION_ID, NOTIFICATION_DESCRIPTION, NotificationImportance.HIGH);
        PushManager.Companion companion = PushManager.INSTANCE;
        PushManagerBuilder pushManagerBuilder = new PushManagerBuilder((PushExecutor) (this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(PushExecutor.class), null, null), notificationChannel);
        pushManagerBuilder.setDefaultIcon(R.drawable.icon_notification);
        try {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl((SalesforcePushHandler) getKoin().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(SalesforcePushHandler.class), null, null));
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
            objM5535constructorimpl = null;
        }
        SalesforcePushHandler salesforcePushHandler = (SalesforcePushHandler) objM5535constructorimpl;
        if (salesforcePushHandler != null) {
            pushManagerBuilder.addPushHandler(salesforcePushHandler);
        }
        try {
            objM5535constructorimpl2 = Result.m5535constructorimpl((ManualFirebasePushHandler) getKoin().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(ManualFirebasePushHandler.class), null, null));
        } catch (Throwable th3) {
            Result.Companion companion4 = Result.INSTANCE;
            objM5535constructorimpl2 = Result.m5535constructorimpl(ResultKt.createFailure(th3));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl2)) {
            objM5535constructorimpl2 = null;
        }
        ManualFirebasePushHandler manualFirebasePushHandler = (ManualFirebasePushHandler) objM5535constructorimpl2;
        if (manualFirebasePushHandler != null) {
            pushManagerBuilder.addPushHandler(manualFirebasePushHandler);
        }
        try {
            if (this instanceof KoinScopeComponent) {
                rootScope = ((KoinScopeComponent) this).getScope();
                orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PushSource.class);
            } else {
                rootScope = getKoin().getScopeRegistry().getRootScope();
                orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PushSource.class);
            }
            objM5535constructorimpl3 = Result.m5535constructorimpl((PushSource) rootScope.get(orCreateKotlinClass, null, null));
        } catch (Throwable th4) {
            Result.Companion companion5 = Result.INSTANCE;
            objM5535constructorimpl3 = Result.m5535constructorimpl(ResultKt.createFailure(th4));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl3)) {
            objM5535constructorimpl3 = null;
        }
        PushSource pushSource = (PushSource) objM5535constructorimpl3;
        if (pushSource != null) {
            pushManagerBuilder.addPushSource(pushSource);
        }
        try {
            objM5535constructorimpl4 = Result.m5535constructorimpl((TimerCounterPushHandler) getKoin().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(TimerCounterPushHandler.class), null, null));
        } catch (Throwable th5) {
            Result.Companion companion6 = Result.INSTANCE;
            objM5535constructorimpl4 = Result.m5535constructorimpl(ResultKt.createFailure(th5));
        }
        if (Result.m5540isFailureimpl(objM5535constructorimpl4)) {
            objM5535constructorimpl4 = null;
        }
        TimerCounterPushHandler timerCounterPushHandler = (TimerCounterPushHandler) objM5535constructorimpl4;
        if (timerCounterPushHandler != null) {
            pushManagerBuilder.addPushHandler(timerCounterPushHandler);
        }
        try {
            objM5535constructorimpl5 = Result.m5535constructorimpl((PushHandler) getKoin().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(PushHandler.class), null, null));
        } catch (Throwable th6) {
            Result.Companion companion7 = Result.INSTANCE;
            objM5535constructorimpl5 = Result.m5535constructorimpl(ResultKt.createFailure(th6));
        }
        PushHandler pushHandler = (PushHandler) (Result.m5540isFailureimpl(objM5535constructorimpl5) ? null : objM5535constructorimpl5);
        if (pushHandler != null) {
            pushManagerBuilder.addPushHandler(pushHandler);
        }
        this.pushManager = pushManagerBuilder.build(context);
    }
}
