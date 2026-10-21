package com.bbva.component.dm.naturalauth.domain.model.params;

import ad.d;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.model.constants.BanxicoConstants;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AuthenticationParams.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0014\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006\u0082\u0001\u0002\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/bbva/component/dm/naturalauth/domain/model/params/AuthenticationParams;", "", "", "a", "Ljava/lang/String;", "getOriginAppId", "()Ljava/lang/String;", Constants.originAppId, "getOriginUserId", Constants.originUserId, "getDeviceId", "deviceId", "getPolicy", Constants.policy, "getMessage", "message", "getCountry", "country", "getAuthTypeCode", "authTypeCode", "Finish", "Init", "Lcom/bbva/component/dm/naturalauth/domain/model/params/AuthenticationParams$Finish;", "Lcom/bbva/component/dm/naturalauth/domain/model/params/AuthenticationParams$Init;", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
public abstract class AuthenticationParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String originAppId;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FidoPayload f27864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f27865c;

    /* JADX INFO: compiled from: AuthenticationParams.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/bbva/component/dm/naturalauth/domain/model/params/AuthenticationParams$Finish;", "Lcom/bbva/component/dm/naturalauth/domain/model/params/AuthenticationParams;", "", "component1", "component3", "consumerId", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoPayload;", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "multiStepProcessId", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "d", "Ljava/lang/String;", "getConsumerId", "()Ljava/lang/String;", "f", "getMultiStepProcessId", "<init>", "(Ljava/lang/String;Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoPayload;Ljava/lang/String;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Finish extends AuthenticationParams {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String consumerId;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final FidoPayload f27867e;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String multiStepProcessId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Finish(@NotNull String consumerId, @NotNull FidoPayload payload, @NotNull String multiStepProcessId) {
            super(consumerId, payload, null, 4, null);
            Intrinsics.checkNotNullParameter(consumerId, "consumerId");
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(multiStepProcessId, "multiStepProcessId");
            this.consumerId = consumerId;
            this.f27867e = payload;
            this.multiStepProcessId = multiStepProcessId;
        }

        public static /* synthetic */ Finish copy$default(Finish finish, String str, FidoPayload fidoPayload, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = finish.consumerId;
            }
            if ((i10 & 2) != 0) {
                fidoPayload = finish.f27867e;
            }
            if ((i10 & 4) != 0) {
                str2 = finish.multiStepProcessId;
            }
            return finish.copy(str, fidoPayload, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConsumerId() {
            return this.consumerId;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMultiStepProcessId() {
            return this.multiStepProcessId;
        }

        @NotNull
        public final Finish copy(@NotNull String consumerId, @NotNull FidoPayload payload, @NotNull String multiStepProcessId) {
            Intrinsics.checkNotNullParameter(consumerId, "consumerId");
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(multiStepProcessId, "multiStepProcessId");
            return new Finish(consumerId, payload, multiStepProcessId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Finish)) {
                return false;
            }
            Finish finish = (Finish) other;
            return Intrinsics.areEqual(this.consumerId, finish.consumerId) && Intrinsics.areEqual(this.f27867e, finish.f27867e) && Intrinsics.areEqual(this.multiStepProcessId, finish.multiStepProcessId);
        }

        @NotNull
        public final String getConsumerId() {
            return this.consumerId;
        }

        @NotNull
        public final String getMultiStepProcessId() {
            return this.multiStepProcessId;
        }

        public int hashCode() {
            return this.multiStepProcessId.hashCode() + ((this.f27867e.hashCode() + (this.consumerId.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Finish(consumerId=");
            sb2.append(this.consumerId);
            sb2.append(", payload=");
            sb2.append(this.f27867e);
            sb2.append(", multiStepProcessId=");
            return d.f(sb2, this.multiStepProcessId, ")");
        }
    }

    /* JADX INFO: compiled from: AuthenticationParams.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J'\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/bbva/component/dm/naturalauth/domain/model/params/AuthenticationParams$Init;", "Lcom/bbva/component/dm/naturalauth/domain/model/params/AuthenticationParams;", "", "component1", "consumerId", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoPayload;", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, Constants.authenticationType, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "d", "Ljava/lang/String;", "getConsumerId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoPayload;Ljava/lang/String;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Init extends AuthenticationParams {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String consumerId;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final FidoPayload f27870e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f27871f;

        public /* synthetic */ Init(String str, FidoPayload fidoPayload, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, fidoPayload, (i10 & 4) != 0 ? "106" : str2);
        }

        public static /* synthetic */ Init copy$default(Init init, String str, FidoPayload fidoPayload, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = init.consumerId;
            }
            if ((i10 & 2) != 0) {
                fidoPayload = init.f27870e;
            }
            if ((i10 & 4) != 0) {
                str2 = init.f27871f;
            }
            return init.copy(str, fidoPayload, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getConsumerId() {
            return this.consumerId;
        }

        @NotNull
        public final Init copy(@NotNull String consumerId, @NotNull FidoPayload payload, @NotNull String authenticationType) {
            Intrinsics.checkNotNullParameter(consumerId, "consumerId");
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(authenticationType, "authenticationType");
            return new Init(consumerId, payload, authenticationType);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Init)) {
                return false;
            }
            Init init = (Init) other;
            return Intrinsics.areEqual(this.consumerId, init.consumerId) && Intrinsics.areEqual(this.f27870e, init.f27870e) && Intrinsics.areEqual(this.f27871f, init.f27871f);
        }

        @NotNull
        public final String getConsumerId() {
            return this.consumerId;
        }

        public int hashCode() {
            return this.f27871f.hashCode() + ((this.f27870e.hashCode() + (this.consumerId.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Init(consumerId=");
            sb2.append(this.consumerId);
            sb2.append(", payload=");
            sb2.append(this.f27870e);
            sb2.append(", authenticationType=");
            return d.f(sb2, this.f27871f, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Init(@NotNull String consumerId, @NotNull FidoPayload payload, @NotNull String authenticationType) {
            super(consumerId, payload, authenticationType, null);
            Intrinsics.checkNotNullParameter(consumerId, "consumerId");
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(authenticationType, "authenticationType");
            this.consumerId = consumerId;
            this.f27870e = payload;
            this.f27871f = authenticationType;
        }
    }

    public /* synthetic */ AuthenticationParams(String str, FidoPayload fidoPayload, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fidoPayload, (i10 & 4) != 0 ? "106" : str2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: getAuthTypeCode, reason: from getter */
    public final String getF27865c() {
        return this.f27865c;
    }

    @NotNull
    public final String getCountry() {
        String country = this.f27864b.getFidoSession().getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "getCountry(...)");
        return country;
    }

    @NotNull
    public final String getDeviceId() {
        String internalDeviceId = this.f27864b.getFidoAttributes().getInternalDeviceId();
        Intrinsics.checkNotNullExpressionValue(internalDeviceId, "getInternalDeviceId(...)");
        return internalDeviceId;
    }

    @NotNull
    public final String getMessage() {
        String message = this.f27864b.getMessage();
        return message == null ? "" : message;
    }

    @NotNull
    public final String getOriginAppId() {
        return this.originAppId;
    }

    @NotNull
    public final String getOriginUserId() {
        String userId = this.f27864b.getFidoSession().getUserId();
        Intrinsics.checkNotNullExpressionValue(userId, "getUserId(...)");
        return userId;
    }

    @NotNull
    public final String getPolicy() {
        String policy = this.f27864b.getFidoSession().getPolicy();
        Intrinsics.checkNotNullExpressionValue(policy, "getPolicy(...)");
        return policy;
    }

    public AuthenticationParams(String str, FidoPayload fidoPayload, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this.originAppId = str;
        this.f27864b = fidoPayload;
        this.f27865c = str2;
    }
}
