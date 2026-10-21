package com.bbva.glomohybrid.base.deeplink.model;

import android.content.Intent;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.base.models.DeepLinkModel;
import com.bbva.notifications.model.constants.BanxicoConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LinkParams.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams;", "", "Deeplink", "DynamicLink", "GoogleAssistantLink", "GoogleWallet", "NoCommercialDeepLink", "OperationalNotification", "OtherBanks", "QRLink", "SalesforceNotification", "UniversalNotification", "Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams$Deeplink;", "Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams$DynamicLink;", "Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams$GoogleAssistantLink;", "Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams$GoogleWallet;", "Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams$NoCommercialDeepLink;", "Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams$OperationalNotification;", "Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams$OtherBanks;", "Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams$QRLink;", "Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams$SalesforceNotification;", "Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams$UniversalNotification;", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface LinkParams {

    /* JADX INFO: compiled from: LinkParams.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams$Deeplink;", "Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams;", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "component1", "deeplink", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "getDeeplink", "()Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "<init>", "(Lcom/bbva/glomohybrid/base/models/DeepLinkModel;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Deeplink implements LinkParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final DeepLinkModel deeplink;

        public Deeplink(@NotNull DeepLinkModel deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.deeplink = deeplink;
        }

        public static /* synthetic */ Deeplink copy$default(Deeplink deeplink, DeepLinkModel deepLinkModel, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                deepLinkModel = deeplink.deeplink;
            }
            return deeplink.copy(deepLinkModel);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DeepLinkModel getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final Deeplink copy(@NotNull DeepLinkModel deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new Deeplink(deeplink);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Deeplink) && Intrinsics.areEqual(this.deeplink, ((Deeplink) other).deeplink);
        }

        @NotNull
        public final DeepLinkModel getDeeplink() {
            return this.deeplink;
        }

        public int hashCode() {
            return this.deeplink.hashCode();
        }

        @NotNull
        public String toString() {
            return "Deeplink(deeplink=" + this.deeplink + ")";
        }
    }

    /* JADX INFO: compiled from: LinkParams.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams$DynamicLink;", "Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams;", "Landroid/content/Intent;", "component1", "intent", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Landroid/content/Intent;", "getIntent", "()Landroid/content/Intent;", "<init>", "(Landroid/content/Intent;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class DynamicLink implements LinkParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Intent intent;

        public DynamicLink(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.intent = intent;
        }

        public static /* synthetic */ DynamicLink copy$default(DynamicLink dynamicLink, Intent intent, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                intent = dynamicLink.intent;
            }
            return dynamicLink.copy(intent);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Intent getIntent() {
            return this.intent;
        }

        @NotNull
        public final DynamicLink copy(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return new DynamicLink(intent);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DynamicLink) && Intrinsics.areEqual(this.intent, ((DynamicLink) other).intent);
        }

        @NotNull
        public final Intent getIntent() {
            return this.intent;
        }

        public int hashCode() {
            return this.intent.hashCode();
        }

        @NotNull
        public String toString() {
            return "DynamicLink(intent=" + this.intent + ")";
        }
    }

    /* JADX INFO: compiled from: LinkParams.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams$GoogleAssistantLink;", "Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams;", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "component1", "deeplink", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "getDeeplink", "()Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "<init>", "(Lcom/bbva/glomohybrid/base/models/DeepLinkModel;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class GoogleAssistantLink implements LinkParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final DeepLinkModel deeplink;

        public GoogleAssistantLink(@NotNull DeepLinkModel deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.deeplink = deeplink;
        }

        public static /* synthetic */ GoogleAssistantLink copy$default(GoogleAssistantLink googleAssistantLink, DeepLinkModel deepLinkModel, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                deepLinkModel = googleAssistantLink.deeplink;
            }
            return googleAssistantLink.copy(deepLinkModel);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DeepLinkModel getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final GoogleAssistantLink copy(@NotNull DeepLinkModel deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new GoogleAssistantLink(deeplink);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GoogleAssistantLink) && Intrinsics.areEqual(this.deeplink, ((GoogleAssistantLink) other).deeplink);
        }

        @NotNull
        public final DeepLinkModel getDeeplink() {
            return this.deeplink;
        }

        public int hashCode() {
            return this.deeplink.hashCode();
        }

        @NotNull
        public String toString() {
            return "GoogleAssistantLink(deeplink=" + this.deeplink + ")";
        }
    }

    /* JADX INFO: compiled from: LinkParams.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams$GoogleWallet;", "Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams;", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "component1", "deeplink", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "getDeeplink", "()Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "<init>", "(Lcom/bbva/glomohybrid/base/models/DeepLinkModel;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class GoogleWallet implements LinkParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final DeepLinkModel deeplink;

        public GoogleWallet(@NotNull DeepLinkModel deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.deeplink = deeplink;
        }

        public static /* synthetic */ GoogleWallet copy$default(GoogleWallet googleWallet, DeepLinkModel deepLinkModel, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                deepLinkModel = googleWallet.deeplink;
            }
            return googleWallet.copy(deepLinkModel);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DeepLinkModel getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final GoogleWallet copy(@NotNull DeepLinkModel deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new GoogleWallet(deeplink);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GoogleWallet) && Intrinsics.areEqual(this.deeplink, ((GoogleWallet) other).deeplink);
        }

        @NotNull
        public final DeepLinkModel getDeeplink() {
            return this.deeplink;
        }

        public int hashCode() {
            return this.deeplink.hashCode();
        }

        @NotNull
        public String toString() {
            return "GoogleWallet(deeplink=" + this.deeplink + ")";
        }
    }

    /* JADX INFO: compiled from: LinkParams.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012*\u0010\u0007\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002j\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0006\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002j\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u0005HÆ\u0003J7\u0010\b\u001a\u00020\u00002,\b\u0002\u0010\u0007\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002j\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u0005HÆ\u0001J\t\u0010\t\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0004HÖ\u0003R;\u0010\u0007\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0002j\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams$NoCommercialDeepLink;", "Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams;", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "component1", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/util/HashMap;", "getPayload", "()Ljava/util/HashMap;", "<init>", "(Ljava/util/HashMap;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class NoCommercialDeepLink implements LinkParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final HashMap<String, Object> payload;

        public NoCommercialDeepLink(@Nullable HashMap<String, Object> map) {
            this.payload = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NoCommercialDeepLink copy$default(NoCommercialDeepLink noCommercialDeepLink, HashMap map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                map = noCommercialDeepLink.payload;
            }
            return noCommercialDeepLink.copy(map);
        }

        @Nullable
        public final HashMap<String, Object> component1() {
            return this.payload;
        }

        @NotNull
        public final NoCommercialDeepLink copy(@Nullable HashMap<String, Object> payload) {
            return new NoCommercialDeepLink(payload);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NoCommercialDeepLink) && Intrinsics.areEqual(this.payload, ((NoCommercialDeepLink) other).payload);
        }

        @Nullable
        public final HashMap<String, Object> getPayload() {
            return this.payload;
        }

        public int hashCode() {
            HashMap<String, Object> map = this.payload;
            if (map == null) {
                return 0;
            }
            return map.hashCode();
        }

        @NotNull
        public String toString() {
            return "NoCommercialDeepLink(payload=" + this.payload + ")";
        }
    }

    /* JADX INFO: compiled from: LinkParams.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams$OperationalNotification;", "Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams;", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "component1", "deeplink", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "getDeeplink", "()Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "<init>", "(Lcom/bbva/glomohybrid/base/models/DeepLinkModel;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class OperationalNotification implements LinkParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final DeepLinkModel deeplink;

        public OperationalNotification(@NotNull DeepLinkModel deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.deeplink = deeplink;
        }

        public static /* synthetic */ OperationalNotification copy$default(OperationalNotification operationalNotification, DeepLinkModel deepLinkModel, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                deepLinkModel = operationalNotification.deeplink;
            }
            return operationalNotification.copy(deepLinkModel);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DeepLinkModel getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final OperationalNotification copy(@NotNull DeepLinkModel deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new OperationalNotification(deeplink);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OperationalNotification) && Intrinsics.areEqual(this.deeplink, ((OperationalNotification) other).deeplink);
        }

        @NotNull
        public final DeepLinkModel getDeeplink() {
            return this.deeplink;
        }

        public int hashCode() {
            return this.deeplink.hashCode();
        }

        @NotNull
        public String toString() {
            return "OperationalNotification(deeplink=" + this.deeplink + ")";
        }
    }

    /* JADX INFO: compiled from: LinkParams.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u001f\u0010\u0006\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0003HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams$OtherBanks;", "Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams;", "", "", "component1", "arguments", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/util/Map;", "getArguments", "()Ljava/util/Map;", "<init>", "(Ljava/util/Map;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class OtherBanks implements LinkParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Map<String, String> arguments;

        public OtherBanks(@NotNull Map<String, String> arguments) {
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            this.arguments = arguments;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OtherBanks copy$default(OtherBanks otherBanks, Map map, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                map = otherBanks.arguments;
            }
            return otherBanks.copy(map);
        }

        @NotNull
        public final Map<String, String> component1() {
            return this.arguments;
        }

        @NotNull
        public final OtherBanks copy(@NotNull Map<String, String> arguments) {
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            return new OtherBanks(arguments);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OtherBanks) && Intrinsics.areEqual(this.arguments, ((OtherBanks) other).arguments);
        }

        @NotNull
        public final Map<String, String> getArguments() {
            return this.arguments;
        }

        public int hashCode() {
            return this.arguments.hashCode();
        }

        @NotNull
        public String toString() {
            return "OtherBanks(arguments=" + this.arguments + ")";
        }
    }

    /* JADX INFO: compiled from: LinkParams.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams$QRLink;", "Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams;", "Lcom/bbva/glomohybrid/base/deeplink/model/QRPayload;", "component1", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/base/deeplink/model/QRPayload;", "getPayload", "()Lcom/bbva/glomohybrid/base/deeplink/model/QRPayload;", "<init>", "(Lcom/bbva/glomohybrid/base/deeplink/model/QRPayload;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class QRLink implements LinkParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final QRPayload payload;

        public QRLink(@NotNull QRPayload payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.payload = payload;
        }

        public static /* synthetic */ QRLink copy$default(QRLink qRLink, QRPayload qRPayload, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                qRPayload = qRLink.payload;
            }
            return qRLink.copy(qRPayload);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final QRPayload getPayload() {
            return this.payload;
        }

        @NotNull
        public final QRLink copy(@NotNull QRPayload payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            return new QRLink(payload);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof QRLink) && Intrinsics.areEqual(this.payload, ((QRLink) other).payload);
        }

        @NotNull
        public final QRPayload getPayload() {
            return this.payload;
        }

        public int hashCode() {
            return this.payload.hashCode();
        }

        @NotNull
        public String toString() {
            return "QRLink(payload=" + this.payload + ")";
        }
    }

    /* JADX INFO: compiled from: LinkParams.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams$SalesforceNotification;", "Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams;", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "component1", "deeplink", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "getDeeplink", "()Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "<init>", "(Lcom/bbva/glomohybrid/base/models/DeepLinkModel;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class SalesforceNotification implements LinkParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final DeepLinkModel deeplink;

        public SalesforceNotification(@NotNull DeepLinkModel deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.deeplink = deeplink;
        }

        public static /* synthetic */ SalesforceNotification copy$default(SalesforceNotification salesforceNotification, DeepLinkModel deepLinkModel, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                deepLinkModel = salesforceNotification.deeplink;
            }
            return salesforceNotification.copy(deepLinkModel);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DeepLinkModel getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final SalesforceNotification copy(@NotNull DeepLinkModel deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new SalesforceNotification(deeplink);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SalesforceNotification) && Intrinsics.areEqual(this.deeplink, ((SalesforceNotification) other).deeplink);
        }

        @NotNull
        public final DeepLinkModel getDeeplink() {
            return this.deeplink;
        }

        public int hashCode() {
            return this.deeplink.hashCode();
        }

        @NotNull
        public String toString() {
            return "SalesforceNotification(deeplink=" + this.deeplink + ")";
        }
    }

    /* JADX INFO: compiled from: LinkParams.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams$UniversalNotification;", "Lcom/bbva/glomohybrid/base/deeplink/model/LinkParams;", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "component1", "deeplink", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "getDeeplink", "()Lcom/bbva/glomohybrid/base/models/DeepLinkModel;", "<init>", "(Lcom/bbva/glomohybrid/base/models/DeepLinkModel;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class UniversalNotification implements LinkParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final DeepLinkModel deeplink;

        public UniversalNotification(@NotNull DeepLinkModel deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.deeplink = deeplink;
        }

        public static /* synthetic */ UniversalNotification copy$default(UniversalNotification universalNotification, DeepLinkModel deepLinkModel, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                deepLinkModel = universalNotification.deeplink;
            }
            return universalNotification.copy(deepLinkModel);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final DeepLinkModel getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final UniversalNotification copy(@NotNull DeepLinkModel deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            return new UniversalNotification(deeplink);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UniversalNotification) && Intrinsics.areEqual(this.deeplink, ((UniversalNotification) other).deeplink);
        }

        @NotNull
        public final DeepLinkModel getDeeplink() {
            return this.deeplink;
        }

        public int hashCode() {
            return this.deeplink.hashCode();
        }

        @NotNull
        public String toString() {
            return "UniversalNotification(deeplink=" + this.deeplink + ")";
        }
    }
}
