package com.bbva.push.salesforce;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import bk.p;
import bk.q;
import com.bbva.plugin.push.command.UnregisterCommand;
import com.bbva.push.creator.NotificationCreator;
import com.bbva.push.firebase.extensions.RawMessageKt;
import com.bbva.push.handler.PushHandler;
import com.bbva.push.inbox.Inbox;
import com.bbva.push.model.NotificationChannel;
import com.bbva.push.model.Push;
import com.bbva.push.model.RawMessage;
import com.bbva.push.salesforce.extension.ContextKt;
import com.bbva.push.salesforce.extension.MapKt;
import com.bbva.push.salesforce.extension.SFMSDKKt;
import com.bbva.push.salesforce.model.Configuration;
import com.bbva.push.salesforce.model.SalesforceConfig;
import com.bbva.push.tracker.Tracker;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.messages.push.PushMessageManager;
import com.salesforce.marketingcloud.notifications.NotificationCustomizationOptions;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdk;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkModuleConfig;
import com.salesforce.marketingcloud.sfmcsdk.components.identity.Identity;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SalesforcePushHandler.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\u00020\u0001:\u00010BM\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010\"\u001a\u00020\u001d\u0012\u0006\u0010)\u001a\u00020(\u0012\b\b\u0002\u0010+\u001a\u00020*\u0012\u0014\u0010-\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\b0,¢\u0006\u0004\b.\u0010/J\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001e\u0010\u0010\u001a\u00020\b2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0017J!\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0004J*\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u001a\u0010\u001b\u001a\u00020\b2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\rJ\u0006\u0010\u001c\u001a\u00020\bR\u001a\u0010\"\u001a\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Lcom/bbva/push/salesforce/SalesforcePushHandler;", "Lcom/bbva/push/handler/PushHandler;", "", "register", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", UnregisterCommand.ID, "", "token", "", "onNewToken", "Lcom/bbva/push/model/Push;", "push", "canHandlePush", "", "", "configurationOptions", "configure", "getConfiguration", "Landroid/content/Context;", "context", "", "defaultIcon", "Lcom/bbva/push/model/NotificationChannel;", "defaultChannel", "Landroidx/core/app/NotificationCompat$Builder;", "createNotification", k.a.f65041h, "setAttributes", "setIsHmsDeviceAttribute", "Lcom/bbva/push/inbox/Inbox;", "c", "Lcom/bbva/push/inbox/Inbox;", "getInbox", "()Lcom/bbva/push/inbox/Inbox;", "inbox", "getId", "()Ljava/lang/String;", "id", "Lcom/bbva/push/creator/NotificationCreator;", "creator", "Lcom/bbva/push/salesforce/model/SalesforceConfig;", "salesforceConfig", "Lcom/salesforce/marketingcloud/MarketingCloudConfig$Builder;", "builder", "Lkotlin/Function1;", "onSalesforceConfigured", "<init>", "(Landroid/content/Context;Lcom/bbva/push/creator/NotificationCreator;Lcom/bbva/push/inbox/Inbox;Lcom/bbva/push/salesforce/model/SalesforceConfig;Lcom/salesforce/marketingcloud/MarketingCloudConfig$Builder;Lkotlin/jvm/functions/Function1;)V", "Companion", "salesforce-push_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSalesforcePushHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SalesforcePushHandler.kt\ncom/bbva/push/salesforce/SalesforcePushHandler\n+ 2 SFMCSdkModuleConfig.kt\ncom/salesforce/marketingcloud/sfmcsdk/SFMCSdkModuleConfig$Companion\n*L\n1#1,271:1\n29#2:272\n*S KotlinDebug\n*F\n+ 1 SalesforcePushHandler.kt\ncom/bbva/push/salesforce/SalesforcePushHandler\n*L\n196#1:272\n*E\n"})
public final class SalesforcePushHandler implements PushHandler {

    @NotNull
    public static final String ID = "salesforce";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f36261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final NotificationCreator f36262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Inbox inbox;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function1<SalesforcePushHandler, Unit> f36264d;

    /* JADX INFO: compiled from: SalesforcePushHandler.kt */
    public static final class a extends Lambda implements Function1<Identity, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Configuration f36265p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Configuration configuration) {
            super(1);
            this.f36265p0 = configuration;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Identity identity) {
            Identity it = identity;
            Intrinsics.checkNotNullParameter(it, "it");
            SFMSDKKt.setProfileId(it, this.f36265p0.getContactKey());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SalesforcePushHandler.kt */
    public static final class b extends Lambda implements Function1<PushModuleInterface, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Configuration f36266p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Configuration configuration) {
            super(1);
            this.f36266p0 = configuration;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PushModuleInterface pushModuleInterface) {
            PushModuleInterface it = pushModuleInterface;
            Intrinsics.checkNotNullParameter(it, "it");
            Configuration configuration = this.f36266p0;
            SFMSDKKt.toggleActivation(it, configuration.getEnablePush());
            SFMSDKKt.toggleGeolocation(it, configuration.getEnableGeolocation());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SalesforcePushHandler.kt */
    public static final class c extends Lambda implements Function1<PushModuleInterface, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Push f36267p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Push push) {
            super(1);
            this.f36267p0 = push;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PushModuleInterface pushModuleInterface) {
            Unit unit;
            PushModuleInterface pushModule = pushModuleInterface;
            Intrinsics.checkNotNullParameter(pushModule, "pushModule");
            Push push = this.f36267p0;
            RawMessage rawMessage = push.getNotification().getRawMessage();
            if (rawMessage != null) {
                SFMSDKKt.handleRemoteMessage(pushModule, RawMessageKt.toFirebaseRemoteMessage(rawMessage));
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                SFMSDKKt.handlePushData(pushModule, push.getData());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SalesforcePushHandler.kt */
    public static final class d extends Lambda implements Function1<PushModuleInterface, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Continuation<Map<String, ? extends Object>> f36268p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SafeContinuation safeContinuation) {
            super(1);
            this.f36268p0 = safeContinuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PushModuleInterface pushModuleInterface) {
            PushModuleInterface it = pushModuleInterface;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f36268p0.resumeWith(Result.m5535constructorimpl(q.mapOf(TuplesKt.to("isEnabled", Boolean.valueOf(SFMSDKKt.isPushEnabled(it))), TuplesKt.to("isGeolocationEnabled", Boolean.valueOf(SFMSDKKt.isGeofenceMessagingEnabled(it))))));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SalesforcePushHandler.kt */
    public static final class e extends Lambda implements Function1<PushModuleInterface, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f36269p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(1);
            this.f36269p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PushModuleInterface pushModuleInterface) {
            PushModuleInterface it = pushModuleInterface;
            Intrinsics.checkNotNullParameter(it, "it");
            SFMSDKKt.setPushToken(it, this.f36269p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SalesforcePushHandler.kt */
    public static final class f extends Lambda implements Function1<PushModuleInterface, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f36270p0 = new f(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PushModuleInterface pushModuleInterface) {
            PushModuleInterface it = pushModuleInterface;
            Intrinsics.checkNotNullParameter(it, "it");
            SFMSDKKt.register(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SalesforcePushHandler.kt */
    public static final class g extends Lambda implements Function1<Identity, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Map<String, String> f36271p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Map<String, String> map) {
            super(1);
            this.f36271p0 = map;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Identity identity) {
            Identity it = identity;
            Intrinsics.checkNotNullParameter(it, "it");
            Identity.setProfileAttributes$default(it, this.f36271p0, null, 2, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SalesforcePushHandler.kt */
    public static final class h extends Lambda implements Function1<PushModuleInterface, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final h f36272p0 = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PushModuleInterface pushModuleInterface) {
            PushModuleInterface it = pushModuleInterface;
            Intrinsics.checkNotNullParameter(it, "it");
            SFMSDKKt.unregister(it);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SalesforcePushHandler(@NotNull Context context, @Nullable NotificationCreator notificationCreator, @NotNull Inbox inbox, @NotNull SalesforceConfig salesforceConfig, @NotNull MarketingCloudConfig.Builder builder, @NotNull Function1<? super SalesforcePushHandler, Unit> onSalesforceConfigured) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inbox, "inbox");
        Intrinsics.checkNotNullParameter(salesforceConfig, "salesforceConfig");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(onSalesforceConfigured, "onSalesforceConfigured");
        this.f36261a = context;
        this.f36262b = notificationCreator;
        this.inbox = inbox;
        this.f36264d = onSalesforceConfigured;
        SFMCSdkModuleConfig.Companion companion = SFMCSdkModuleConfig.INSTANCE;
        SFMCSdkModuleConfig.Builder builder2 = new SFMCSdkModuleConfig.Builder();
        builder.setApplicationId(salesforceConfig.getAppId());
        builder.setAccessToken(salesforceConfig.getAccessToken());
        builder.setMarketingCloudServerUrl(salesforceConfig.getServerUrl());
        builder.setMid(salesforceConfig.getMid());
        Boolean enableInbox = salesforceConfig.getEnableInbox();
        builder.setInboxEnabled(enableInbox != null ? enableInbox.booleanValue() : true);
        NotificationCustomizationOptions notificationConfig = salesforceConfig.getNotificationConfig();
        if (notificationConfig == null) {
            notificationConfig = NotificationCustomizationOptions.create(salesforceConfig.getIconId());
            Intrinsics.checkNotNullExpressionValue(notificationConfig, "create(...)");
        }
        builder.setNotificationCustomizationOptions(notificationConfig);
        Boolean delayRegisterUntilContact = salesforceConfig.getDelayRegisterUntilContact();
        builder.setDelayRegistrationUntilContactKeyIsSet(delayRegisterUntilContact != null ? delayRegisterUntilContact.booleanValue() : true);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        builder2.setPushModuleConfig(builder.build(applicationContext));
        SFMCSdkModuleConfig sFMCSdkModuleConfigBuild = builder2.build();
        SFMCSdk.Companion companion2 = SFMCSdk.INSTANCE;
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        companion2.configure((Application) applicationContext2, sFMCSdkModuleConfigBuild, new qb.a(this));
    }

    public static final void access$registerFirebaseToken(SalesforcePushHandler salesforcePushHandler) {
        salesforcePushHandler.getClass();
        SFMSDKKt.withMarketingCloudPushModule(new qb.c(salesforcePushHandler));
    }

    @Override // com.bbva.push.handler.PushHandler
    public boolean canHandlePush(@NotNull Push push) {
        Intrinsics.checkNotNullParameter(push, "push");
        return PushMessageManager.isMarketingCloudPush(push.getData());
    }

    @Override // com.bbva.push.handler.PushHandler
    @SuppressLint({"MissingPermission"})
    public void configure(@NotNull Map<String, ? extends Object> configurationOptions) {
        Intrinsics.checkNotNullParameter(configurationOptions, "configurationOptions");
        Configuration configuration = MapKt.toConfiguration(configurationOptions);
        SFMSDKKt.withMarketingCloudIdentity(new a(configuration));
        SFMSDKKt.withMarketingCloudPushModule(new b(configuration));
    }

    @Override // com.bbva.push.handler.PushHandler
    @Nullable
    public NotificationCompat.Builder createNotification(@NotNull Context context, @NotNull Push push, int defaultIcon, @NotNull NotificationChannel defaultChannel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(push, "push");
        Intrinsics.checkNotNullParameter(defaultChannel, "defaultChannel");
        NotificationCreator notificationCreator = this.f36262b;
        if (notificationCreator != null) {
            return notificationCreator.createNotificationBuilder(context, defaultIcon, defaultChannel, push);
        }
        SFMSDKKt.withMarketingCloudPushModule(new c(push));
        return null;
    }

    @Override // com.bbva.push.handler.PushHandler
    @Nullable
    public Object getConfiguration(@NotNull Continuation<? super Map<String, ? extends Object>> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        SFMSDKKt.withMarketingCloudPushModule(new d(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // com.bbva.push.handler.PushHandler
    @NotNull
    public String getId() {
        return ID;
    }

    @Override // com.bbva.push.handler.PushHandler
    @NotNull
    public Inbox getInbox() {
        return this.inbox;
    }

    @Override // com.bbva.push.handler.PushHandler
    public void onNewToken(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        SFMSDKKt.withMarketingCloudPushModule(new e(token));
    }

    @Override // com.bbva.push.handler.PushHandler
    @Nullable
    public Object register(@NotNull Continuation<? super Boolean> continuation) {
        SFMSDKKt.withMarketingCloudPushModule(f.f36270p0);
        return Boxing.boxBoolean(true);
    }

    public final void setAttributes(@NotNull Map<String, String> attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        SFMSDKKt.withMarketingCloudIdentity(new g(attributes));
    }

    public final void setIsHmsDeviceAttribute() {
        setAttributes(p.mapOf(TuplesKt.to("isHmsDevice", String.valueOf(ContextKt.isHmsDevice(this.f36261a)))));
    }

    @Override // com.bbva.push.handler.PushHandler
    @Nullable
    public Object token(@NotNull Continuation<? super String> continuation) {
        return PushHandler.DefaultImpls.token(this, continuation);
    }

    @Override // com.bbva.push.handler.PushHandler
    @Nullable
    public Object unregister(@NotNull Continuation<? super Boolean> continuation) {
        SFMSDKKt.withMarketingCloudPushModule(h.f36272p0);
        return Boxing.boxBoolean(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ SalesforcePushHandler(Context context, NotificationCreator notificationCreator, Inbox inbox, SalesforceConfig salesforceConfig, MarketingCloudConfig.Builder builder, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Inbox salesforceInbox;
        Tracker tracker = null;
        Object[] objArr = 0;
        NotificationCreator notificationCreator2 = (i10 & 2) != 0 ? null : notificationCreator;
        if ((i10 & 4) != 0) {
            salesforceInbox = new SalesforceInbox(tracker, 1, objArr == true ? 1 : 0);
        } else {
            salesforceInbox = inbox;
        }
        this(context, notificationCreator2, salesforceInbox, salesforceConfig, (i10 & 16) != 0 ? MarketingCloudConfig.INSTANCE.builder() : builder, function1);
    }
}
