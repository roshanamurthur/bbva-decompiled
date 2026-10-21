package com.bbva.component.dm.naturalauth.data.mapper.common.response;

import com.bbva.component.dm.naturalauth.data.helper.NetworkResponseExtensionsKt;
import com.bbva.component.dm.naturalauth.data.model.ErrorMessage;
import com.bbva.component.dm.naturalauth.data.model.ResponseErrorMessages;
import com.bbva.glomoutils.Mapper;
import com.bbva.network.exceptions.ConnectionException;
import com.bbva.network.model.response.NetworkResponse;
import com.bbva.sl.ar.android.secsdk.fido.error.FidoError;
import com.bbva.sl.ar.android.secsdk.fido.exception.FidoException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ExceptionsResponseMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/mapper/common/response/ExceptionsResponseMapper;", "Lcom/bbva/glomoutils/Mapper;", "", "Lcom/bbva/sl/ar/android/secsdk/fido/exception/FidoException;", "input", "map", "<init>", "()V", "Companion", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nExceptionsResponseMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionsResponseMapper.kt\ncom/bbva/component/dm/naturalauth/data/mapper/common/response/ExceptionsResponseMapper\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,80:1\n96#2:81\n*S KotlinDebug\n*F\n+ 1 ExceptionsResponseMapper.kt\ncom/bbva/component/dm/naturalauth/data/mapper/common/response/ExceptionsResponseMapper\n*L\n58#1:81\n*E\n"})
public final class ExceptionsResponseMapper implements Mapper<Throwable, FidoException> {

    @NotNull
    public static final String BLOCKED_PASSWORD_CODE = "blockedPassword";

    @NotNull
    public static final String CLIENT_ERROR_CODE = "THE_DEVICE_ALREADY_EXISTS_FOR_THE_SAME_USER";

    @NotNull
    public static final String EXPIRED_PASSWORD_ERROR_CODE = "expiredPassword";

    @NotNull
    public static final String FUNCTIONAL_ERROR_CODE = "functionalError";

    @NotNull
    public static final String INACTIVE_ACCOUNT_CODE = "inactiveAccount";

    /* JADX WARN: Code duplicated, block: B:35:0x00ee  */
    @Override // com.bbva.glomoutils.Mapper
    @NotNull
    public FidoException map(@NotNull Throwable input) {
        FidoException fidoExceptionBuild;
        Intrinsics.checkNotNullParameter(input, "input");
        if (!(input instanceof ConnectionException)) {
            FidoException fidoExceptionBuild2 = new FidoException.Builder(FidoError.SDK_FIDO_NETWORK).build();
            Intrinsics.checkNotNull(fidoExceptionBuild2);
            return fidoExceptionBuild2;
        }
        NetworkResponse networkResponse = ((ConnectionException) input).getCom.bbva.library.digipassmanager.constants.DigipassManagerConstants.KEY_RESPONSE java.lang.String();
        if (networkResponse == null) {
            fidoExceptionBuild = new FidoException.Builder(FidoError.SDK_AUTHENTICATE_OPERATION).build();
        } else {
            int code = networkResponse.getCode();
            if (499 <= code && code <= Integer.MAX_VALUE) {
                fidoExceptionBuild = new FidoException.Builder(FidoError.SDK_FIDO_NETWORK).processMessage(NetworkResponseExtensionsKt.bodyToString(networkResponse)).build();
                Intrinsics.checkNotNull(fidoExceptionBuild);
            } else if (code == 400) {
                String strBodyToString = NetworkResponseExtensionsKt.bodyToString(networkResponse);
                Json.Companion companion = Json.INSTANCE;
                companion.getSerializersModule();
                ErrorMessage errorMessage = (ErrorMessage) CollectionsKt___CollectionsKt.firstOrNull((List) ((ResponseErrorMessages) companion.decodeFromString(ResponseErrorMessages.INSTANCE.serializer(), strBodyToString)).getMessages());
                if (Intrinsics.areEqual(errorMessage != null ? errorMessage.getCode() : null, FUNCTIONAL_ERROR_CODE)) {
                    fidoExceptionBuild = new FidoException.Builder(FidoError.SDK_REGISTER_OPERATION).sdkClientCode(errorMessage.getClientSdkCode()).processMessage(strBodyToString).build();
                    Intrinsics.checkNotNull(fidoExceptionBuild);
                } else {
                    String code2 = errorMessage != null ? errorMessage.getCode() : null;
                    if (code2 == null) {
                        code2 = "";
                    }
                    if (Intrinsics.areEqual(code2, EXPIRED_PASSWORD_ERROR_CODE) || Intrinsics.areEqual(code2, INACTIVE_ACCOUNT_CODE) || Intrinsics.areEqual(code2, BLOCKED_PASSWORD_CODE)) {
                        fidoExceptionBuild = new FidoException.Builder(FidoError.SDK_BAD_SESSION).processMessage(strBodyToString).build();
                        Intrinsics.checkNotNull(fidoExceptionBuild);
                    } else {
                        FidoError fidoError = FidoError.SDK_BAD_SESSION;
                        fidoExceptionBuild = new FidoException.Builder(fidoError).sdkClientCode(fidoError.name()).processMessage(strBodyToString).build();
                        Intrinsics.checkNotNull(fidoExceptionBuild);
                    }
                }
            } else {
                fidoExceptionBuild = new FidoException.Builder(FidoError.SDK_AUTHENTICATE_OPERATION).processMessage(NetworkResponseExtensionsKt.bodyToString(networkResponse)).build();
                Intrinsics.checkNotNull(fidoExceptionBuild);
            }
            if (fidoExceptionBuild == null) {
                fidoExceptionBuild = new FidoException.Builder(FidoError.SDK_AUTHENTICATE_OPERATION).build();
            }
        }
        Intrinsics.checkNotNull(fidoExceptionBuild);
        return fidoExceptionBuild;
    }
}
