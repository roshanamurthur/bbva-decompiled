package com.salesforce.marketingcloud.sfmcsdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.salesforce.marketingcloud.sfmcsdk.components.behaviors.BehaviorManager;
import com.salesforce.marketingcloud.sfmcsdk.components.encryption.EncryptedSharedPreferences;
import com.salesforce.marketingcloud.sfmcsdk.components.encryption.EncryptionManager;
import com.salesforce.marketingcloud.sfmcsdk.components.events.EventManager;
import com.salesforce.marketingcloud.sfmcsdk.components.http.Authenticator;
import com.salesforce.marketingcloud.sfmcsdk.components.http.NetworkManager;
import com.salesforce.marketingcloud.sfmcsdk.components.identity.Identity;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import com.salesforce.marketingcloud.sfmcsdk.components.storage.StorageManager;
import com.salesforce.marketingcloud.sfmcsdk.components.utils.SdkExecutors;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SFMCSdkComponents.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 +2\u00020\u0001:\u0001+B/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0014\u0010'\u001a\u00020(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*H\u0007R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010!\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006,"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdkComponents;", "", "context", "Landroid/content/Context;", "moduleName", "", "moduleApplicationId", "behaviorManager", "Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/BehaviorManager;", "eventManager", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/EventManager;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/BehaviorManager;Lcom/salesforce/marketingcloud/sfmcsdk/components/events/EventManager;)V", "getBehaviorManager", "()Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/BehaviorManager;", "getContext$sfmcsdk_release", "()Landroid/content/Context;", "encryptionManager", "Lcom/salesforce/marketingcloud/sfmcsdk/components/encryption/EncryptionManager;", "getEncryptionManager", "()Lcom/salesforce/marketingcloud/sfmcsdk/components/encryption/EncryptionManager;", "getEventManager", "()Lcom/salesforce/marketingcloud/sfmcsdk/components/events/EventManager;", "executors", "Lcom/salesforce/marketingcloud/sfmcsdk/components/utils/SdkExecutors;", "getExecutors", "()Lcom/salesforce/marketingcloud/sfmcsdk/components/utils/SdkExecutors;", "identity", "Lcom/salesforce/marketingcloud/sfmcsdk/components/identity/Identity;", "getIdentity", "()Lcom/salesforce/marketingcloud/sfmcsdk/components/identity/Identity;", "getModuleApplicationId", "()Ljava/lang/String;", "getModuleName$sfmcsdk_release", "registrationId", "getRegistrationId", "storageManager", "Lcom/salesforce/marketingcloud/sfmcsdk/components/storage/StorageManager;", "getStorageManager", "()Lcom/salesforce/marketingcloud/sfmcsdk/components/storage/StorageManager;", "createNetworkManager", "Lcom/salesforce/marketingcloud/sfmcsdk/components/http/NetworkManager;", "authenticator", "Lcom/salesforce/marketingcloud/sfmcsdk/components/http/Authenticator;", "Companion", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SFMCSdkComponents {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    private static final String KEY_PREFS_REGISTRATION_ID = "registrationId";

    @Deprecated
    @NotNull
    private static final String REGISTRATION_ID_STORAGE = "unified_sdk_registration";

    @Deprecated
    @NotNull
    public static final String TAG = "SFMCSdkComponents";

    @NotNull
    private final BehaviorManager behaviorManager;

    @NotNull
    private final Context context;

    @NotNull
    private final EncryptionManager encryptionManager;

    @NotNull
    private final EventManager eventManager;

    @NotNull
    private final SdkExecutors executors;

    @NotNull
    private final Identity identity;

    @NotNull
    private final String moduleApplicationId;

    @NotNull
    private final String moduleName;

    @NotNull
    private final String registrationId;

    @NotNull
    private final StorageManager storageManager;

    /* JADX INFO: compiled from: SFMCSdkComponents.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdkComponents$Companion;", "", "()V", "KEY_PREFS_REGISTRATION_ID", "", "REGISTRATION_ID_STORAGE", "TAG", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SFMCSdkComponents(@NotNull Context context, @NotNull String moduleName, @NotNull String moduleApplicationId, @NotNull BehaviorManager behaviorManager, @NotNull EventManager eventManager) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(moduleApplicationId, "moduleApplicationId");
        Intrinsics.checkNotNullParameter(behaviorManager, "behaviorManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.context = context;
        this.moduleName = moduleName;
        this.moduleApplicationId = moduleApplicationId;
        this.behaviorManager = behaviorManager;
        this.eventManager = eventManager;
        EncryptionManager encryptionManager = new EncryptionManager(context, moduleApplicationId);
        this.encryptionManager = encryptionManager;
        this.executors = new SdkExecutors(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        SharedPreferences sharedPreferencesCreate = EncryptedSharedPreferences.create(context, REGISTRATION_ID_STORAGE, new EncryptionManager(context, packageName).getEncryptionKey());
        Intrinsics.checkNotNullExpressionValue(sharedPreferencesCreate, "create(\n        context,…me).encryptionKey\n      )");
        final String string = sharedPreferencesCreate.getString("registrationId", null);
        if (string != null) {
            SFMCSdkLogger.INSTANCE.d(TAG, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "StorageManager was initialized with existing install id: " + string;
                }
            });
        } else {
            string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            sharedPreferencesCreate.edit().putString("registrationId", string).apply();
            SFMCSdkLogger.INSTANCE.d(TAG, new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "StorageManager was initialized with new install id: " + string;
                }
            });
        }
        this.registrationId = string;
        this.storageManager = new StorageManager(context, encryptionManager, moduleApplicationId, string);
        this.identity = Identity.INSTANCE.create$sfmcsdk_release(string);
    }

    public static /* synthetic */ NetworkManager createNetworkManager$default(SFMCSdkComponents sFMCSdkComponents, Authenticator authenticator, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            authenticator = null;
        }
        return sFMCSdkComponents.createNetworkManager(authenticator);
    }

    @JvmOverloads
    @NotNull
    public final NetworkManager createNetworkManager() {
        return createNetworkManager$default(this, null, 1, null);
    }

    @NotNull
    public final BehaviorManager getBehaviorManager() {
        return this.behaviorManager;
    }

    @NotNull
    /* JADX INFO: renamed from: getContext$sfmcsdk_release, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final EncryptionManager getEncryptionManager() {
        return this.encryptionManager;
    }

    @NotNull
    public final EventManager getEventManager() {
        return this.eventManager;
    }

    @NotNull
    public final SdkExecutors getExecutors() {
        return this.executors;
    }

    @NotNull
    public final Identity getIdentity() {
        return this.identity;
    }

    @NotNull
    public final String getModuleApplicationId() {
        return this.moduleApplicationId;
    }

    @NotNull
    /* JADX INFO: renamed from: getModuleName$sfmcsdk_release, reason: from getter */
    public final String getModuleName() {
        return this.moduleName;
    }

    @NotNull
    public final String getRegistrationId() {
        return this.registrationId;
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.storageManager;
    }

    @JvmOverloads
    @NotNull
    public final NetworkManager createNetworkManager(@Nullable Authenticator authenticator) {
        return new NetworkManager(this.context, this.executors, this.storageManager.getSecurePrefs("network_manager"), authenticator);
    }
}
