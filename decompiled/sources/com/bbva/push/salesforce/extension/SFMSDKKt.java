package com.bbva.push.salesforce.extension;

import androidx.annotation.RequiresPermission;
import com.bbva.plugin.push.command.UnregisterCommand;
import com.google.firebase.messaging.RemoteMessage;
import com.salesforce.marketingcloud.messages.RegionMessageManager;
import com.salesforce.marketingcloud.messages.push.PushMessageManager;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdk;
import com.salesforce.marketingcloud.sfmcsdk.components.identity.Identity;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleReadyListener;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SFMSDK.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a\u001c\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0000\u001a\u001c\u0010\u0005\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0003H\u0000\u001a\u001c\u0010\u0007\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0000\u001a \u0010\t\u001a\u00020\u0001*\u00020\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0000\u001a\u0014\u0010\r\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\u001a\f\u0010\u0010\u001a\u00020\u0011*\u00020\bH\u0000\u001a\f\u0010\u0012\u001a\u00020\u0011*\u00020\bH\u0000\u001a\f\u0010\u0013\u001a\u00020\u0001*\u00020\bH\u0000\u001a\u0016\u0010\u0014\u001a\u00020\u0001*\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0000\u001a\u0014\u0010\u0016\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0017\u001a\u00020\fH\u0000\u001a\u0014\u0010\u0018\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0011H\u0000\u001a\u0014\u0010\u001a\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0011H\u0001\u001a\f\u0010\u001b\u001a\u00020\u0001*\u00020\bH\u0000¨\u0006\u001c"}, d2 = {"withMarketingCloud", "", "block", "Lkotlin/Function1;", "Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdk;", "withMarketingCloudIdentity", "Lcom/salesforce/marketingcloud/sfmcsdk/components/identity/Identity;", "withMarketingCloudPushModule", "Lcom/salesforce/marketingcloud/sfmcsdk/modules/push/PushModuleInterface;", "handlePushData", "data", "", "", "handleRemoteMessage", "message", "Lcom/google/firebase/messaging/RemoteMessage;", "isGeofenceMessagingEnabled", "", "isPushEnabled", "register", "setProfileId", "contactKey", "setPushToken", "token", "toggleActivation", "activate", "toggleGeolocation", UnregisterCommand.ID, "salesforce-push_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSFMSDK.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SFMSDK.kt\ncom/bbva/push/salesforce/extension/SFMSDKKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n1#2:138\n*E\n"})
public final class SFMSDKKt {

    /* JADX INFO: compiled from: SFMSDK.kt */
    public static final class a extends Lambda implements Function1<SFMCSdk, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Identity, Unit> f36273p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Identity, Unit> function1) {
            super(1);
            this.f36273p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SFMCSdk sFMCSdk) {
            SFMCSdk it = sFMCSdk;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f36273p0.invoke(it.getIdentity());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SFMSDK.kt */
    public static final class b extends Lambda implements Function1<SFMCSdk, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<PushModuleInterface, Unit> f36274p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super PushModuleInterface, Unit> function1) {
            super(1);
            this.f36274p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SFMCSdk sFMCSdk) {
            SFMCSdk it = sFMCSdk;
            Intrinsics.checkNotNullParameter(it, "it");
            final Function1<PushModuleInterface, Unit> function1 = this.f36274p0;
            it.mp(new PushModuleReadyListener() { // from class: rb.b
                @Override // com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleReadyListener, com.salesforce.marketingcloud.sfmcsdk.modules.ModuleReadyListener
                public final /* synthetic */ void ready(ModuleInterface moduleInterface) {
                    qi.a.a(this, moduleInterface);
                }

                @Override // com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleReadyListener
                public final void ready(PushModuleInterface pushModule) {
                    Function1 block = function1;
                    Intrinsics.checkNotNullParameter(block, "$block");
                    Intrinsics.checkNotNullParameter(pushModule, "pushModule");
                    block.invoke(pushModule);
                }
            });
            return Unit.INSTANCE;
        }
    }

    public static final void handlePushData(@NotNull PushModuleInterface pushModuleInterface, @NotNull Map<String, String> data) {
        Intrinsics.checkNotNullParameter(pushModuleInterface, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        pushModuleInterface.getPushMessageManager().handleMessage(data);
    }

    public static final void handleRemoteMessage(@NotNull PushModuleInterface pushModuleInterface, @NotNull RemoteMessage message) {
        Intrinsics.checkNotNullParameter(pushModuleInterface, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        pushModuleInterface.getPushMessageManager().handleMessage(message);
    }

    public static final boolean isGeofenceMessagingEnabled(@NotNull PushModuleInterface pushModuleInterface) {
        Intrinsics.checkNotNullParameter(pushModuleInterface, "<this>");
        return pushModuleInterface.getRegionMessageManager().isGeofenceMessagingEnabled();
    }

    public static final boolean isPushEnabled(@NotNull PushModuleInterface pushModuleInterface) {
        Intrinsics.checkNotNullParameter(pushModuleInterface, "<this>");
        return pushModuleInterface.getPushMessageManager().isPushEnabled();
    }

    public static final void register(@NotNull PushModuleInterface pushModuleInterface) {
        Intrinsics.checkNotNullParameter(pushModuleInterface, "<this>");
        pushModuleInterface.getPushMessageManager().enablePush();
    }

    public static final void setProfileId(@NotNull Identity identity, @Nullable String str) {
        Intrinsics.checkNotNullParameter(identity, "<this>");
        if (str != null) {
            Identity.setProfileId$default(identity, str, null, 2, null);
        }
    }

    public static final void setPushToken(@NotNull PushModuleInterface pushModuleInterface, @NotNull String token) {
        Intrinsics.checkNotNullParameter(pushModuleInterface, "<this>");
        Intrinsics.checkNotNullParameter(token, "token");
        pushModuleInterface.getPushMessageManager().setPushToken(token);
    }

    public static final void toggleActivation(@NotNull PushModuleInterface pushModuleInterface, boolean z10) {
        Intrinsics.checkNotNullParameter(pushModuleInterface, "<this>");
        PushMessageManager pushMessageManager = pushModuleInterface.getPushMessageManager();
        if (z10) {
            pushMessageManager.enablePush();
        } else {
            pushMessageManager.disablePush();
        }
    }

    @RequiresPermission(allOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"})
    public static final void toggleGeolocation(@NotNull PushModuleInterface pushModuleInterface, boolean z10) {
        Intrinsics.checkNotNullParameter(pushModuleInterface, "<this>");
        RegionMessageManager regionMessageManager = pushModuleInterface.getRegionMessageManager();
        if (z10) {
            regionMessageManager.enableGeofenceMessaging();
        } else {
            regionMessageManager.disableGeofenceMessaging();
        }
    }

    public static final void unregister(@NotNull PushModuleInterface pushModuleInterface) {
        Intrinsics.checkNotNullParameter(pushModuleInterface, "<this>");
        pushModuleInterface.getPushMessageManager().disablePush();
    }

    public static final void withMarketingCloud(@NotNull Function1<? super SFMCSdk, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        SFMCSdk.INSTANCE.requestSdk(new rb.a(block));
    }

    public static final void withMarketingCloudIdentity(@NotNull Function1<? super Identity, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        withMarketingCloud(new a(block));
    }

    public static final void withMarketingCloudPushModule(@NotNull Function1<? super PushModuleInterface, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        withMarketingCloud(new b(block));
    }
}
