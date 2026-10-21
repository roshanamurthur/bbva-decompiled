package com.bbva.glomohybrid.mobilepayment.lib.broadcast;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.camera.core.imagecapture.a;
import androidx.core.app.NotificationManagerCompat;
import com.bbva.glomohybrid.mobilepayment.lib.handler.PaymentsNotificationHandler;
import com.bbva.glomohybrid.mobilepayment.lib.model.PaymentNotificationContent;
import com.bbva.notifications.GloMoLocalNotificationCreator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: compiled from: PaymentBroadcast.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u00012\u00020\u0002:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/mobilepayment/lib/broadcast/PaymentBroadcast;", "Landroid/content/BroadcastReceiver;", "Lorg/koin/core/component/KoinComponent;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "<init>", "()V", "PaymentNotificationID", "library_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPaymentBroadcast.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentBroadcast.kt\ncom/bbva/glomohybrid/mobilepayment/lib/broadcast/PaymentBroadcast\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,42:1\n56#2,6:43\n56#2,6:49\n*S KotlinDebug\n*F\n+ 1 PaymentBroadcast.kt\ncom/bbva/glomohybrid/mobilepayment/lib/broadcast/PaymentBroadcast\n*L\n15#1:43,6\n16#1:49,6\n*E\n"})
public final class PaymentBroadcast extends BroadcastReceiver implements KoinComponent {
    public static final int TOHU_NOTIFICATIONS = 7530;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Lazy f33786p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Lazy f33787q0;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentBroadcast() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f33786p0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<GloMoLocalNotificationCreator>() { // from class: com.bbva.glomohybrid.mobilepayment.lib.broadcast.PaymentBroadcast$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.notifications.GloMoLocalNotificationCreator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final GloMoLocalNotificationCreator invoke() {
                KoinComponent koinComponent = this;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(GloMoLocalNotificationCreator.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.f33787q0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<PaymentsNotificationHandler>() { // from class: com.bbva.glomohybrid.mobilepayment.lib.broadcast.PaymentBroadcast$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.mobilepayment.lib.handler.PaymentsNotificationHandler, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PaymentsNotificationHandler invoke() {
                KoinComponent koinComponent = this;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(PaymentsNotificationHandler.class), objArr2, objArr3);
            }
        });
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        PaymentNotificationContent paymentNotificationContentBuildNotificationContentFromIntent;
        if (context == null || (paymentNotificationContentBuildNotificationContentFromIntent = ((PaymentsNotificationHandler) this.f33787q0.getValue()).buildNotificationContentFromIntent(intent)) == null) {
            return;
        }
        Notification notificationBuild = ((GloMoLocalNotificationCreator) this.f33786p0.getValue()).create(paymentNotificationContentBuildNotificationContentFromIntent.getData(), (6 & 2) != 0 ? 0 : 0, (6 & 4) != 0 ? false : false, (6 & 8) != 0 ? null : paymentNotificationContentBuildNotificationContentFromIntent.getDeeplinkInfo(), (6 & 16) != 0 ? null : paymentNotificationContentBuildNotificationContentFromIntent.getInfoPayment()).build();
        Intrinsics.checkNotNullExpressionValue(notificationBuild, "build(...)");
        NotificationManagerCompat.from(context).notify(TOHU_NOTIFICATIONS, notificationBuild);
    }
}
