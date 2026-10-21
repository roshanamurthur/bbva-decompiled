package com.bbva.ethermobilesdk.tokencompat;

import android.content.Context;
import androidx.camera.camera2.internal.n1;
import androidx.collection.h;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.token.storage.Storage;
import com.bbva.network.model.pinning.PinningCatalog;
import com.salesforce.marketingcloud.config.a;
import com.salesforce.marketingcloud.sfmcsdk.components.http.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TokenCompatConfig.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001:\u0002/0B5\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b-\u0010.J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J?\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\nHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u00061"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig;", "", "Landroid/content/Context;", "component1", "Lcom/bbva/network/model/pinning/PinningCatalog;", "component2", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$StorageMode;", "component3", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$EndpointConfig;", "component4", "Lcom/bbva/ethermobilesdk/token/storage/Storage;", "component5", "context", "pinningCatalog", "storageMode", a.f64109t, "relayedStorage", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Lcom/bbva/network/model/pinning/PinningCatalog;", "getPinningCatalog", "()Lcom/bbva/network/model/pinning/PinningCatalog;", "c", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$StorageMode;", "getStorageMode", "()Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$StorageMode;", "d", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$EndpointConfig;", "getEndpoint", "()Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$EndpointConfig;", "e", "Lcom/bbva/ethermobilesdk/token/storage/Storage;", "getRelayedStorage", "()Lcom/bbva/ethermobilesdk/token/storage/Storage;", "<init>", "(Landroid/content/Context;Lcom/bbva/network/model/pinning/PinningCatalog;Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$StorageMode;Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$EndpointConfig;Lcom/bbva/ethermobilesdk/token/storage/Storage;)V", "EndpointConfig", "StorageMode", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class TokenCompatConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final PinningCatalog pinningCatalog;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final StorageMode storageMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final EndpointConfig endpoint;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Storage relayedStorage;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: TokenCompatConfig.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$StorageMode;", "", "PRIVATE", "SHARED", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final class StorageMode {
        private static final /* synthetic */ StorageMode[] $VALUES;
        public static final StorageMode PRIVATE;
        public static final StorageMode SHARED;

        static {
            StorageMode storageMode = new StorageMode("PRIVATE", 0);
            PRIVATE = storageMode;
            StorageMode storageMode2 = new StorageMode("SHARED", 1);
            SHARED = storageMode2;
            $VALUES = new StorageMode[]{storageMode, storageMode2};
        }

        public StorageMode() {
            throw null;
        }

        public static StorageMode valueOf(String str) {
            return (StorageMode) Enum.valueOf(StorageMode.class, str);
        }

        public static StorageMode[] values() {
            return (StorageMode[]) $VALUES.clone();
        }
    }

    public TokenCompatConfig(@NotNull Context context, @Nullable PinningCatalog pinningCatalog, @NotNull StorageMode storageMode, @NotNull EndpointConfig endpoint, @Nullable Storage storage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(storageMode, "storageMode");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.context = context;
        this.pinningCatalog = pinningCatalog;
        this.storageMode = storageMode;
        this.endpoint = endpoint;
        this.relayedStorage = storage;
    }

    public static /* synthetic */ TokenCompatConfig copy$default(TokenCompatConfig tokenCompatConfig, Context context, PinningCatalog pinningCatalog, StorageMode storageMode, EndpointConfig endpointConfig, Storage storage, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = tokenCompatConfig.context;
        }
        if ((i10 & 2) != 0) {
            pinningCatalog = tokenCompatConfig.pinningCatalog;
        }
        PinningCatalog pinningCatalog2 = pinningCatalog;
        if ((i10 & 4) != 0) {
            storageMode = tokenCompatConfig.storageMode;
        }
        StorageMode storageMode2 = storageMode;
        if ((i10 & 8) != 0) {
            endpointConfig = tokenCompatConfig.endpoint;
        }
        EndpointConfig endpointConfig2 = endpointConfig;
        if ((i10 & 16) != 0) {
            storage = tokenCompatConfig.relayedStorage;
        }
        return tokenCompatConfig.copy(context, pinningCatalog2, storageMode2, endpointConfig2, storage);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PinningCatalog getPinningCatalog() {
        return this.pinningCatalog;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final StorageMode getStorageMode() {
        return this.storageMode;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EndpointConfig getEndpoint() {
        return this.endpoint;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Storage getRelayedStorage() {
        return this.relayedStorage;
    }

    @NotNull
    public final TokenCompatConfig copy(@NotNull Context context, @Nullable PinningCatalog pinningCatalog, @NotNull StorageMode storageMode, @NotNull EndpointConfig endpoint, @Nullable Storage relayedStorage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(storageMode, "storageMode");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        return new TokenCompatConfig(context, pinningCatalog, storageMode, endpoint, relayedStorage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenCompatConfig)) {
            return false;
        }
        TokenCompatConfig tokenCompatConfig = (TokenCompatConfig) other;
        return Intrinsics.areEqual(this.context, tokenCompatConfig.context) && Intrinsics.areEqual(this.pinningCatalog, tokenCompatConfig.pinningCatalog) && this.storageMode == tokenCompatConfig.storageMode && Intrinsics.areEqual(this.endpoint, tokenCompatConfig.endpoint) && Intrinsics.areEqual(this.relayedStorage, tokenCompatConfig.relayedStorage);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final EndpointConfig getEndpoint() {
        return this.endpoint;
    }

    @Nullable
    public final PinningCatalog getPinningCatalog() {
        return this.pinningCatalog;
    }

    @Nullable
    public final Storage getRelayedStorage() {
        return this.relayedStorage;
    }

    @NotNull
    public final StorageMode getStorageMode() {
        return this.storageMode;
    }

    public int hashCode() {
        int iHashCode = this.context.hashCode() * 31;
        PinningCatalog pinningCatalog = this.pinningCatalog;
        int iHashCode2 = (this.endpoint.hashCode() + ((this.storageMode.hashCode() + ((iHashCode + (pinningCatalog == null ? 0 : pinningCatalog.hashCode())) * 31)) * 31)) * 31;
        Storage storage = this.relayedStorage;
        return iHashCode2 + (storage != null ? storage.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TokenCompatConfig(context=" + this.context + ", pinningCatalog=" + this.pinningCatalog + ", storageMode=" + this.storageMode + ", endpoint=" + this.endpoint + ", relayedStorage=" + this.relayedStorage + ")";
    }

    /* JADX INFO: compiled from: TokenCompatConfig.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0003+,-B1\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b)\u0010*J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J;\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006."}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$EndpointConfig;", "", "", "component1", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$EndpointConfig$HttpMethod;", "component2", "component3", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$EndpointConfig$Mode;", "component4", "", "component5", "url", "httpMethod", Constants.originAppId, "mode", "timeout", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "b", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$EndpointConfig$HttpMethod;", "getHttpMethod", "()Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$EndpointConfig$HttpMethod;", "c", "getOriginAppId", "d", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$EndpointConfig$Mode;", "getMode", "()Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$EndpointConfig$Mode;", "e", "J", "getTimeout", "()J", "<init>", "(Ljava/lang/String;Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$EndpointConfig$HttpMethod;Ljava/lang/String;Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$EndpointConfig$Mode;J)V", "Companion", "HttpMethod", "Mode", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class EndpointConfig {

        @NotNull
        public static final String ACTIVATION_DATA_HASH_ID = "[activationDataHashId]";
        public static final long DEFAULT_TIMEOUT = 60;

        @NotNull
        public static final String SOFTWARE_TOKENS_ID = "[softwareTokensId]";

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String url;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final HttpMethod httpMethod;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String originAppId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Mode mode;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public final long timeout;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: TokenCompatConfig.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$EndpointConfig$HttpMethod;", "", "POST", Request.PUT, "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
        public static final class HttpMethod {
            private static final /* synthetic */ HttpMethod[] $VALUES;
            public static final HttpMethod POST;
            public static final HttpMethod PUT;

            static {
                HttpMethod httpMethod = new HttpMethod("POST", 0);
                POST = httpMethod;
                HttpMethod httpMethod2 = new HttpMethod(Request.PUT, 1);
                PUT = httpMethod2;
                $VALUES = new HttpMethod[]{httpMethod, httpMethod2};
            }

            public HttpMethod() {
                throw null;
            }

            public static HttpMethod valueOf(String str) {
                return (HttpMethod) Enum.valueOf(HttpMethod.class, str);
            }

            public static HttpMethod[] values() {
                return (HttpMethod[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: TokenCompatConfig.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$EndpointConfig$Mode;", "", "R1", "R2", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
        public static final class Mode {
            private static final /* synthetic */ Mode[] $VALUES;
            public static final Mode R1;
            public static final Mode R2;

            static {
                Mode mode = new Mode("R1", 0);
                R1 = mode;
                Mode mode2 = new Mode("R2", 1);
                R2 = mode2;
                $VALUES = new Mode[]{mode, mode2};
            }

            public Mode() {
                throw null;
            }

            public static Mode valueOf(String str) {
                return (Mode) Enum.valueOf(Mode.class, str);
            }

            public static Mode[] values() {
                return (Mode[]) $VALUES.clone();
            }
        }

        public EndpointConfig(@NotNull String url, @NotNull HttpMethod httpMethod, @NotNull String originAppId, @NotNull Mode mode, long j10) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
            Intrinsics.checkNotNullParameter(originAppId, "originAppId");
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.url = url;
            this.httpMethod = httpMethod;
            this.originAppId = originAppId;
            this.mode = mode;
            this.timeout = j10;
        }

        public static /* synthetic */ EndpointConfig copy$default(EndpointConfig endpointConfig, String str, HttpMethod httpMethod, String str2, Mode mode, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = endpointConfig.url;
            }
            if ((i10 & 2) != 0) {
                httpMethod = endpointConfig.httpMethod;
            }
            HttpMethod httpMethod2 = httpMethod;
            if ((i10 & 4) != 0) {
                str2 = endpointConfig.originAppId;
            }
            String str3 = str2;
            if ((i10 & 8) != 0) {
                mode = endpointConfig.mode;
            }
            Mode mode2 = mode;
            if ((i10 & 16) != 0) {
                j10 = endpointConfig.timeout;
            }
            return endpointConfig.copy(str, httpMethod2, str3, mode2, j10);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final HttpMethod getHttpMethod() {
            return this.httpMethod;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getOriginAppId() {
            return this.originAppId;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Mode getMode() {
            return this.mode;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final long getTimeout() {
            return this.timeout;
        }

        @NotNull
        public final EndpointConfig copy(@NotNull String url, @NotNull HttpMethod httpMethod, @NotNull String originAppId, @NotNull Mode mode, long timeout) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
            Intrinsics.checkNotNullParameter(originAppId, "originAppId");
            Intrinsics.checkNotNullParameter(mode, "mode");
            return new EndpointConfig(url, httpMethod, originAppId, mode, timeout);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EndpointConfig)) {
                return false;
            }
            EndpointConfig endpointConfig = (EndpointConfig) other;
            return Intrinsics.areEqual(this.url, endpointConfig.url) && this.httpMethod == endpointConfig.httpMethod && Intrinsics.areEqual(this.originAppId, endpointConfig.originAppId) && this.mode == endpointConfig.mode && this.timeout == endpointConfig.timeout;
        }

        @NotNull
        public final HttpMethod getHttpMethod() {
            return this.httpMethod;
        }

        @NotNull
        public final Mode getMode() {
            return this.mode;
        }

        @NotNull
        public final String getOriginAppId() {
            return this.originAppId;
        }

        public final long getTimeout() {
            return this.timeout;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int iHashCode = (this.mode.hashCode() + n1.c(this.originAppId, (this.httpMethod.hashCode() + (this.url.hashCode() * 31)) * 31, 31)) * 31;
            long j10 = this.timeout;
            return iHashCode + ((int) ((j10 >>> 32) ^ j10));
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("EndpointConfig(url=");
            sb2.append(this.url);
            sb2.append(", httpMethod=");
            sb2.append(this.httpMethod);
            sb2.append(", originAppId=");
            sb2.append(this.originAppId);
            sb2.append(", mode=");
            sb2.append(this.mode);
            sb2.append(", timeout=");
            return h.d(sb2, this.timeout, ")");
        }

        public /* synthetic */ EndpointConfig(String str, HttpMethod httpMethod, String str2, Mode mode, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, httpMethod, str2, mode, (i10 & 16) != 0 ? 60L : j10);
        }
    }

    public /* synthetic */ TokenCompatConfig(Context context, PinningCatalog pinningCatalog, StorageMode storageMode, EndpointConfig endpointConfig, Storage storage, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, pinningCatalog, storageMode, endpointConfig, (i10 & 16) != 0 ? null : storage);
    }
}
