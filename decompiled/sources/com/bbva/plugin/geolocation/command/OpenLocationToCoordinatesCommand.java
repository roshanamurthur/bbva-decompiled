package com.bbva.plugin.geolocation.command;

import bk.q;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.androidtoolkit.plugin.response.SimpleResponse;
import com.bbva.ethermobilesdk.geolocation.utils.PlusCodeKt;
import com.bbva.plugin.geolocation.command.params.OpenLocationToCoordinatesParams;
import com.bbva.plugin.geolocation.command.response.GeolocationErrors;
import com.bbva.plugin.geolocation.command.validator.OpenLocationToCoordinatesParamsValidator;
import com.google.openlocationcode.OpenLocationCode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OpenLocationToCoordinatesCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\tH\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/plugin/geolocation/command/OpenLocationToCoordinatesCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/geolocation/command/params/OpenLocationToCoordinatesParams;", "<init>", "()V", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "Companion", "geolocation-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OpenLocationToCoordinatesCommand extends AbstractCommand<OpenLocationToCoordinatesParams> {

    @NotNull
    public static final String ID = "openlocationtocoordinates";

    public OpenLocationToCoordinatesCommand() {
        super(OpenLocationToCoordinatesParams.class, new OpenLocationToCoordinatesParamsValidator());
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable OpenLocationToCoordinatesParams params, @NotNull CommandCallback callback) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNull(params);
        try {
            Result.Companion companion = Result.INSTANCE;
            String openLocationCode = params.getOpenLocationCode();
            Intrinsics.checkNotNull(openLocationCode);
            objM5535constructorimpl = Result.m5535constructorimpl(PlusCodeKt.openLocationCodeAsCoordinates(openLocationCode));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
            OpenLocationCode.CodeArea codeArea = (OpenLocationCode.CodeArea) objM5535constructorimpl;
            callback.sendEvent(SimpleResponse.toJson(q.mapOf(TuplesKt.to("latitude", Double.valueOf(codeArea.getCenterLatitude())), TuplesKt.to("longitude", Double.valueOf(codeArea.getCenterLongitude())), TuplesKt.to("length", Integer.valueOf(codeArea.getLength())))));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            if (thM5538exceptionOrNullimpl instanceof IllegalArgumentException) {
                callback.sendError(GeolocationErrors.ErrorOpenLocationCodeIsNotValid);
            } else if (thM5538exceptionOrNullimpl instanceof IllegalStateException) {
                callback.sendError(GeolocationErrors.ErrorOpenLocationCodeIsNotFull);
            } else {
                callback.sendError(Errors.ErrorDefault);
            }
        }
    }
}
