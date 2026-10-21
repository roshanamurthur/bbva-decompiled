package com.bbva.plugin.geolocation.command;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.ethermobilesdk.geolocation.utils.PlusCodeKt;
import com.bbva.plugin.geolocation.command.params.CoordinatesToOpenLocationParams;
import com.bbva.plugin.geolocation.command.response.GeolocationErrors;
import com.bbva.plugin.geolocation.command.validator.CoordinatesToOpenLocationParamsValidator;
import com.google.openlocationcode.OpenLocationCode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CoordinatesToOpenLocationCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\tH\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/plugin/geolocation/command/CoordinatesToOpenLocationCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/geolocation/command/params/CoordinatesToOpenLocationParams;", "<init>", "()V", "execute", "", "params", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "Companion", "geolocation-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CoordinatesToOpenLocationCommand extends AbstractCommand<CoordinatesToOpenLocationParams> {

    @NotNull
    public static final String ID = "coordinatestoopenlocation";

    public CoordinatesToOpenLocationCommand() {
        super(CoordinatesToOpenLocationParams.class, new CoordinatesToOpenLocationParamsValidator());
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@Nullable CoordinatesToOpenLocationParams params, @NotNull CommandCallback callback) {
        Object objM5535constructorimpl;
        OpenLocationCode openLocationCodeCoordinatesAsOpenLocation$default;
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNull(params);
        try {
            Result.Companion companion = Result.INSTANCE;
            Integer length = params.getLength();
            if (length != null) {
                length.intValue();
                Double latitude = params.getLatitude();
                Intrinsics.checkNotNull(latitude);
                double dDoubleValue = latitude.doubleValue();
                Double longitude = params.getLongitude();
                Intrinsics.checkNotNull(longitude);
                openLocationCodeCoordinatesAsOpenLocation$default = PlusCodeKt.coordinatesAsOpenLocation(dDoubleValue, longitude.doubleValue(), params.getLength().intValue());
                if (openLocationCodeCoordinatesAsOpenLocation$default == null) {
                    Double latitude2 = params.getLatitude();
                    Intrinsics.checkNotNull(latitude2);
                    double dDoubleValue2 = latitude2.doubleValue();
                    Double longitude2 = params.getLongitude();
                    Intrinsics.checkNotNull(longitude2);
                    openLocationCodeCoordinatesAsOpenLocation$default = PlusCodeKt.coordinatesAsOpenLocation$default(dDoubleValue2, longitude2.doubleValue(), 0, 4, null);
                }
            } else {
                Double latitude3 = params.getLatitude();
                Intrinsics.checkNotNull(latitude3);
                double dDoubleValue3 = latitude3.doubleValue();
                Double longitude3 = params.getLongitude();
                Intrinsics.checkNotNull(longitude3);
                openLocationCodeCoordinatesAsOpenLocation$default = PlusCodeKt.coordinatesAsOpenLocation$default(dDoubleValue3, longitude3.doubleValue(), 0, 4, null);
            }
            objM5535constructorimpl = Result.m5535constructorimpl(openLocationCodeCoordinatesAsOpenLocation$default);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
            callback.sendEvent(((OpenLocationCode) objM5535constructorimpl).getCode());
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            if (thM5538exceptionOrNullimpl instanceof IllegalArgumentException) {
                callback.sendError(GeolocationErrors.ErrorOpenLocationCodeLengthNotValid);
            } else {
                callback.sendError(Errors.ErrorDefault);
            }
        }
    }
}
