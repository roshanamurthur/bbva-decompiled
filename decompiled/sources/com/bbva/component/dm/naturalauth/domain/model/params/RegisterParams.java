package com.bbva.component.dm.naturalauth.domain.model.params;

import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.model.constants.BanxicoConstants;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RegisterParams.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\r\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/bbva/component/dm/naturalauth/domain/model/params/RegisterParams;", "", "", "b", "Ljava/lang/String;", "getConsumerId", "()Ljava/lang/String;", "consumerId", "getPolicy", Constants.policy, "getMessage", "message", "getDeviceId", "deviceId", "getExternalDeviceId", "externalDeviceId", "Finish", "Init", "Lcom/bbva/component/dm/naturalauth/domain/model/params/RegisterParams$Finish;", "Lcom/bbva/component/dm/naturalauth/domain/model/params/RegisterParams$Init;", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
public abstract class RegisterParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FidoPayload f27884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String consumerId;

    /* JADX INFO: compiled from: RegisterParams.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/bbva/component/dm/naturalauth/domain/model/params/RegisterParams$Finish;", "Lcom/bbva/component/dm/naturalauth/domain/model/params/RegisterParams;", "", "component2", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoPayload;", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "consumerId", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "d", "Ljava/lang/String;", "getConsumerId", "()Ljava/lang/String;", "<init>", "(Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoPayload;Ljava/lang/String;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Finish extends RegisterParams {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final FidoPayload f27886c;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String consumerId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Finish(@NotNull FidoPayload payload, @NotNull String consumerId) {
            super(payload, consumerId, null);
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(consumerId, "consumerId");
            this.f27886c = payload;
            this.consumerId = consumerId;
        }

        public static /* synthetic */ Finish copy$default(Finish finish, FidoPayload fidoPayload, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                fidoPayload = finish.f27886c;
            }
            if ((i10 & 2) != 0) {
                str = finish.consumerId;
            }
            return finish.copy(fidoPayload, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConsumerId() {
            return this.consumerId;
        }

        @NotNull
        public final Finish copy(@NotNull FidoPayload payload, @NotNull String consumerId) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(consumerId, "consumerId");
            return new Finish(payload, consumerId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Finish)) {
                return false;
            }
            Finish finish = (Finish) other;
            return Intrinsics.areEqual(this.f27886c, finish.f27886c) && Intrinsics.areEqual(this.consumerId, finish.consumerId);
        }

        @Override // com.bbva.component.dm.naturalauth.domain.model.params.RegisterParams
        @NotNull
        public String getConsumerId() {
            return this.consumerId;
        }

        public int hashCode() {
            return this.consumerId.hashCode() + (this.f27886c.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Finish(payload=" + this.f27886c + ", consumerId=" + this.consumerId + ")";
        }
    }

    /* JADX INFO: compiled from: RegisterParams.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/bbva/component/dm/naturalauth/domain/model/params/RegisterParams$Init;", "Lcom/bbva/component/dm/naturalauth/domain/model/params/RegisterParams;", "", "component2", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoPayload;", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "consumerId", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "d", "Ljava/lang/String;", "getConsumerId", "()Ljava/lang/String;", "<init>", "(Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoPayload;Ljava/lang/String;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class Init extends RegisterParams {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final FidoPayload f27888c;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String consumerId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Init(@NotNull FidoPayload payload, @NotNull String consumerId) {
            super(payload, consumerId, null);
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(consumerId, "consumerId");
            this.f27888c = payload;
            this.consumerId = consumerId;
        }

        public static /* synthetic */ Init copy$default(Init init, FidoPayload fidoPayload, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                fidoPayload = init.f27888c;
            }
            if ((i10 & 2) != 0) {
                str = init.consumerId;
            }
            return init.copy(fidoPayload, str);
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getConsumerId() {
            return this.consumerId;
        }

        @NotNull
        public final Init copy(@NotNull FidoPayload payload, @NotNull String consumerId) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(consumerId, "consumerId");
            return new Init(payload, consumerId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Init)) {
                return false;
            }
            Init init = (Init) other;
            return Intrinsics.areEqual(this.f27888c, init.f27888c) && Intrinsics.areEqual(this.consumerId, init.consumerId);
        }

        @Override // com.bbva.component.dm.naturalauth.domain.model.params.RegisterParams
        @NotNull
        public String getConsumerId() {
            return this.consumerId;
        }

        public int hashCode() {
            return this.consumerId.hashCode() + (this.f27888c.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Init(payload=" + this.f27888c + ", consumerId=" + this.consumerId + ")";
        }
    }

    public RegisterParams(FidoPayload fidoPayload, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.f27884a = fidoPayload;
        this.consumerId = str;
    }

    @NotNull
    public String getConsumerId() {
        return this.consumerId;
    }

    @NotNull
    public final String getDeviceId() {
        String internalDeviceId = this.f27884a.getFidoAttributes().getInternalDeviceId();
        Intrinsics.checkNotNullExpressionValue(internalDeviceId, "getInternalDeviceId(...)");
        return internalDeviceId;
    }

    @NotNull
    public final String getExternalDeviceId() {
        String externalDeviceId = this.f27884a.getFidoAttributes().getExternalDeviceId();
        Intrinsics.checkNotNullExpressionValue(externalDeviceId, "getExternalDeviceId(...)");
        return externalDeviceId;
    }

    @NotNull
    public final String getMessage() {
        String message = this.f27884a.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "getMessage(...)");
        return message;
    }

    @NotNull
    public final String getPolicy() {
        String policy = this.f27884a.getFidoSession().getPolicy();
        Intrinsics.checkNotNullExpressionValue(policy, "getPolicy(...)");
        return policy;
    }
}
