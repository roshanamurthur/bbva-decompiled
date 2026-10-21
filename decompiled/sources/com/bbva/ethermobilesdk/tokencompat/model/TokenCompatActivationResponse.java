package com.bbva.ethermobilesdk.tokencompat.model;

import ad.d;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TokenCompatRX.kt */
/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/TokenCompatActivationResponse;", "", "data", "Lcom/bbva/ethermobilesdk/tokencompat/model/TokenCompatActivationResponse$Data;", "(Lcom/bbva/ethermobilesdk/tokencompat/model/TokenCompatActivationResponse$Data;)V", "getData", "()Lcom/bbva/ethermobilesdk/tokencompat/model/TokenCompatActivationResponse$Data;", "component1", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Data", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TokenCompatActivationResponse {

    @NotNull
    private final Data data;

    /* JADX INFO: compiled from: TokenCompatRX.kt */
    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/model/TokenCompatActivationResponse$Data;", "", "activationData", "", "seed", "configuration", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getActivationData", "()Ljava/lang/String;", "getConfiguration", "getSeed", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Data {

        @NotNull
        private final String activationData;

        @NotNull
        private final String configuration;

        @NotNull
        private final String seed;

        public Data(@NotNull String activationData, @NotNull String seed, @NotNull String configuration) {
            Intrinsics.checkNotNullParameter(activationData, "activationData");
            Intrinsics.checkNotNullParameter(seed, "seed");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.activationData = activationData;
            this.seed = seed;
            this.configuration = configuration;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = data.activationData;
            }
            if ((i10 & 2) != 0) {
                str2 = data.seed;
            }
            if ((i10 & 4) != 0) {
                str3 = data.configuration;
            }
            return data.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getActivationData() {
            return this.activationData;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSeed() {
            return this.seed;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getConfiguration() {
            return this.configuration;
        }

        @NotNull
        public final Data copy(@NotNull String activationData, @NotNull String seed, @NotNull String configuration) {
            Intrinsics.checkNotNullParameter(activationData, "activationData");
            Intrinsics.checkNotNullParameter(seed, "seed");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new Data(activationData, seed, configuration);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.areEqual(this.activationData, data.activationData) && Intrinsics.areEqual(this.seed, data.seed) && Intrinsics.areEqual(this.configuration, data.configuration);
        }

        @NotNull
        public final String getActivationData() {
            return this.activationData;
        }

        @NotNull
        public final String getConfiguration() {
            return this.configuration;
        }

        @NotNull
        public final String getSeed() {
            return this.seed;
        }

        public int hashCode() {
            return this.configuration.hashCode() + n1.c(this.seed, this.activationData.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            String str = this.activationData;
            String str2 = this.seed;
            return d.f(a.c("Data(activationData=", str, ", seed=", str2, ", configuration="), this.configuration, ")");
        }
    }

    public TokenCompatActivationResponse(@NotNull Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public static /* synthetic */ TokenCompatActivationResponse copy$default(TokenCompatActivationResponse tokenCompatActivationResponse, Data data, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            data = tokenCompatActivationResponse.data;
        }
        return tokenCompatActivationResponse.copy(data);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    @NotNull
    public final TokenCompatActivationResponse copy(@NotNull Data data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new TokenCompatActivationResponse(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TokenCompatActivationResponse) && Intrinsics.areEqual(this.data, ((TokenCompatActivationResponse) other).data);
    }

    @NotNull
    public final Data getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "TokenCompatActivationResponse(data=" + this.data + ")";
    }
}
