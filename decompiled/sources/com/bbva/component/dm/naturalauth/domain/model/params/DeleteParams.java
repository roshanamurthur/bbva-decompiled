package com.bbva.component.dm.naturalauth.domain.model.params;

import ad.d;
import androidx.camera.camera2.internal.n1;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.notifications.model.constants.BanxicoConstants;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoPayload;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeleteParams.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\b\t\nR\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/bbva/component/dm/naturalauth/domain/model/params/DeleteParams;", "", "", "getOriginAppId", "()Ljava/lang/String;", Constants.originAppId, "getDeviceId", "deviceId", "DeleteAllAuthenticators", "DeleteAllAuthenticatorsFromDevice", "DeleteOneAuthenticatorParams", "Lcom/bbva/component/dm/naturalauth/domain/model/params/DeleteParams$DeleteAllAuthenticators;", "Lcom/bbva/component/dm/naturalauth/domain/model/params/DeleteParams$DeleteAllAuthenticatorsFromDevice;", "Lcom/bbva/component/dm/naturalauth/domain/model/params/DeleteParams$DeleteOneAuthenticatorParams;", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
public abstract class DeleteParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FidoPayload f27872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f27873b;

    /* JADX INFO: compiled from: DeleteParams.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0004HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0011\u0010\u0010\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/dm/naturalauth/domain/model/params/DeleteParams$DeleteAllAuthenticators;", "Lcom/bbva/component/dm/naturalauth/domain/model/params/DeleteParams;", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoPayload;", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "", "consumerId", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "getMessage", "()Ljava/lang/String;", "message", "<init>", "(Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoPayload;Ljava/lang/String;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class DeleteAllAuthenticators extends DeleteParams {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final FidoPayload f27874c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final String f27875d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeleteAllAuthenticators(@NotNull FidoPayload payload, @NotNull String consumerId) {
            super(payload, consumerId, null);
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(consumerId, "consumerId");
            this.f27874c = payload;
            this.f27875d = consumerId;
        }

        public static /* synthetic */ DeleteAllAuthenticators copy$default(DeleteAllAuthenticators deleteAllAuthenticators, FidoPayload fidoPayload, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                fidoPayload = deleteAllAuthenticators.f27874c;
            }
            if ((i10 & 2) != 0) {
                str = deleteAllAuthenticators.f27875d;
            }
            return deleteAllAuthenticators.copy(fidoPayload, str);
        }

        @NotNull
        public final DeleteAllAuthenticators copy(@NotNull FidoPayload payload, @NotNull String consumerId) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(consumerId, "consumerId");
            return new DeleteAllAuthenticators(payload, consumerId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeleteAllAuthenticators)) {
                return false;
            }
            DeleteAllAuthenticators deleteAllAuthenticators = (DeleteAllAuthenticators) other;
            return Intrinsics.areEqual(this.f27874c, deleteAllAuthenticators.f27874c) && Intrinsics.areEqual(this.f27875d, deleteAllAuthenticators.f27875d);
        }

        @NotNull
        public final String getMessage() {
            String message = this.f27874c.getMessage();
            Intrinsics.checkNotNullExpressionValue(message, "getMessage(...)");
            return message;
        }

        public int hashCode() {
            return this.f27875d.hashCode() + (this.f27874c.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "DeleteAllAuthenticators(payload=" + this.f27874c + ", consumerId=" + this.f27875d + ")";
        }
    }

    /* JADX INFO: compiled from: DeleteParams.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J'\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/bbva/component/dm/naturalauth/domain/model/params/DeleteParams$DeleteAllAuthenticatorsFromDevice;", "Lcom/bbva/component/dm/naturalauth/domain/model/params/DeleteParams;", "", "component1", "deviceId", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoPayload;", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "consumerId", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "c", "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoPayload;Ljava/lang/String;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class DeleteAllAuthenticatorsFromDevice extends DeleteParams {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String deviceId;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final FidoPayload f27877d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final String f27878e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeleteAllAuthenticatorsFromDevice(@NotNull String deviceId, @NotNull FidoPayload payload, @NotNull String consumerId) {
            super(payload, consumerId, null);
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(consumerId, "consumerId");
            this.deviceId = deviceId;
            this.f27877d = payload;
            this.f27878e = consumerId;
        }

        public static /* synthetic */ DeleteAllAuthenticatorsFromDevice copy$default(DeleteAllAuthenticatorsFromDevice deleteAllAuthenticatorsFromDevice, String str, FidoPayload fidoPayload, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = deleteAllAuthenticatorsFromDevice.deviceId;
            }
            if ((i10 & 2) != 0) {
                fidoPayload = deleteAllAuthenticatorsFromDevice.f27877d;
            }
            if ((i10 & 4) != 0) {
                str2 = deleteAllAuthenticatorsFromDevice.f27878e;
            }
            return deleteAllAuthenticatorsFromDevice.copy(str, fidoPayload, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDeviceId() {
            return this.deviceId;
        }

        @NotNull
        public final DeleteAllAuthenticatorsFromDevice copy(@NotNull String deviceId, @NotNull FidoPayload payload, @NotNull String consumerId) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(consumerId, "consumerId");
            return new DeleteAllAuthenticatorsFromDevice(deviceId, payload, consumerId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeleteAllAuthenticatorsFromDevice)) {
                return false;
            }
            DeleteAllAuthenticatorsFromDevice deleteAllAuthenticatorsFromDevice = (DeleteAllAuthenticatorsFromDevice) other;
            return Intrinsics.areEqual(this.deviceId, deleteAllAuthenticatorsFromDevice.deviceId) && Intrinsics.areEqual(this.f27877d, deleteAllAuthenticatorsFromDevice.f27877d) && Intrinsics.areEqual(this.f27878e, deleteAllAuthenticatorsFromDevice.f27878e);
        }

        @Override // com.bbva.component.dm.naturalauth.domain.model.params.DeleteParams
        @NotNull
        public String getDeviceId() {
            return this.deviceId;
        }

        public int hashCode() {
            return this.f27878e.hashCode() + ((this.f27877d.hashCode() + (this.deviceId.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("DeleteAllAuthenticatorsFromDevice(deviceId=");
            sb2.append(this.deviceId);
            sb2.append(", payload=");
            sb2.append(this.f27877d);
            sb2.append(", consumerId=");
            return d.f(sb2, this.f27878e, ")");
        }
    }

    /* JADX INFO: compiled from: DeleteParams.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J1\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/bbva/component/dm/naturalauth/domain/model/params/DeleteParams$DeleteOneAuthenticatorParams;", "Lcom/bbva/component/dm/naturalauth/domain/model/params/DeleteParams;", "", "component1", "component2", "authenticator", "deviceId", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoPayload;", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "consumerId", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "c", "Ljava/lang/String;", "getAuthenticator", "()Ljava/lang/String;", "d", "getDeviceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoPayload;Ljava/lang/String;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
    public static final /* data */ class DeleteOneAuthenticatorParams extends DeleteParams {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String authenticator;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String deviceId;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final FidoPayload f27881e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f27882f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeleteOneAuthenticatorParams(@NotNull String authenticator, @NotNull String deviceId, @NotNull FidoPayload payload, @NotNull String consumerId) {
            super(payload, consumerId, null);
            Intrinsics.checkNotNullParameter(authenticator, "authenticator");
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(consumerId, "consumerId");
            this.authenticator = authenticator;
            this.deviceId = deviceId;
            this.f27881e = payload;
            this.f27882f = consumerId;
        }

        public static /* synthetic */ DeleteOneAuthenticatorParams copy$default(DeleteOneAuthenticatorParams deleteOneAuthenticatorParams, String str, String str2, FidoPayload fidoPayload, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = deleteOneAuthenticatorParams.authenticator;
            }
            if ((i10 & 2) != 0) {
                str2 = deleteOneAuthenticatorParams.deviceId;
            }
            if ((i10 & 4) != 0) {
                fidoPayload = deleteOneAuthenticatorParams.f27881e;
            }
            if ((i10 & 8) != 0) {
                str3 = deleteOneAuthenticatorParams.f27882f;
            }
            return deleteOneAuthenticatorParams.copy(str, str2, fidoPayload, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAuthenticator() {
            return this.authenticator;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDeviceId() {
            return this.deviceId;
        }

        @NotNull
        public final DeleteOneAuthenticatorParams copy(@NotNull String authenticator, @NotNull String deviceId, @NotNull FidoPayload payload, @NotNull String consumerId) {
            Intrinsics.checkNotNullParameter(authenticator, "authenticator");
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(consumerId, "consumerId");
            return new DeleteOneAuthenticatorParams(authenticator, deviceId, payload, consumerId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeleteOneAuthenticatorParams)) {
                return false;
            }
            DeleteOneAuthenticatorParams deleteOneAuthenticatorParams = (DeleteOneAuthenticatorParams) other;
            return Intrinsics.areEqual(this.authenticator, deleteOneAuthenticatorParams.authenticator) && Intrinsics.areEqual(this.deviceId, deleteOneAuthenticatorParams.deviceId) && Intrinsics.areEqual(this.f27881e, deleteOneAuthenticatorParams.f27881e) && Intrinsics.areEqual(this.f27882f, deleteOneAuthenticatorParams.f27882f);
        }

        @NotNull
        public final String getAuthenticator() {
            return this.authenticator;
        }

        @Override // com.bbva.component.dm.naturalauth.domain.model.params.DeleteParams
        @NotNull
        public String getDeviceId() {
            return this.deviceId;
        }

        public int hashCode() {
            return this.f27882f.hashCode() + ((this.f27881e.hashCode() + n1.c(this.deviceId, this.authenticator.hashCode() * 31, 31)) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("DeleteOneAuthenticatorParams(authenticator=");
            sb2.append(this.authenticator);
            sb2.append(", deviceId=");
            sb2.append(this.deviceId);
            sb2.append(", payload=");
            sb2.append(this.f27881e);
            sb2.append(", consumerId=");
            return d.f(sb2, this.f27882f, ")");
        }
    }

    public DeleteParams(FidoPayload fidoPayload, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.f27872a = fidoPayload;
        this.f27873b = str;
    }

    @NotNull
    public String getDeviceId() {
        String internalDeviceId = this.f27872a.getFidoAttributes().getInternalDeviceId();
        Intrinsics.checkNotNullExpressionValue(internalDeviceId, "getInternalDeviceId(...)");
        return internalDeviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: getOriginAppId, reason: from getter */
    public final String getF27873b() {
        return this.f27873b;
    }
}
