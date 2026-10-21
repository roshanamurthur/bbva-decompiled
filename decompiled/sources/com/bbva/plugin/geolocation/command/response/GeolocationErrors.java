package com.bbva.plugin.geolocation.command.response;

import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v4 com.bbva.plugin.geolocation.command.response.GeolocationErrors[], still in use, count: 1, list:
  (r8v4 com.bbva.plugin.geolocation.command.response.GeolocationErrors[]) from 0x00c4: INVOKE (r8v4 com.bbva.plugin.geolocation.command.response.GeolocationErrors[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:197)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: GeolocationErrors.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/bbva/plugin/geolocation/command/response/GeolocationErrors;", "Lcom/bbva/androidtoolkit/plugin/response/ErrorMessage;", "", "", "getMessage", "", "getCode", "code", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "message", "Ljava/lang/String;", "ErrorGeocode", "ErrorParams", "ErrorLocation", "ErrorDirectLocation", "ErrorStopWatchLocation", "ErrorNotProviderAvailable", "ErrorNotLocationServiceEnabled", "ErrorOpenLocationCodeIsNotFull", "ErrorOpenLocationCodeIsNotValid", "ErrorOpenLocationCodeLengthNotValid", "ErrorReverseLocation", "geolocation-plugin_release"}, k = 1, mv = {2, 0, 0})
public final class GeolocationErrors implements ErrorMessage {
    ErrorGeocode(440, "ERROR: No geocoder is available"),
    ErrorParams(441, "Latitude and longitude are empty. Set Location permission to YES first."),
    ErrorLocation(442, "The location service is unable to retrieve a location right away."),
    ErrorDirectLocation(443, "ERROR: Could not retrieve any location using the address provided."),
    ErrorStopWatchLocation(444, "ERROR: Impossible to stop Watch Location."),
    ErrorNotProviderAvailable(445, "ERROR: No location provider is available"),
    ErrorNotLocationServiceEnabled(446, "Location service is disabled"),
    ErrorOpenLocationCodeIsNotFull(447, "Open Location Code provided is not a Full Code"),
    ErrorOpenLocationCodeIsNotValid(448, "Open Location Code provided is not valid"),
    ErrorOpenLocationCodeLengthNotValid(449, "Open Location Code length is not valid"),
    ErrorReverseLocation(450, "ERROR: Could not retrieve any address using the location provided.");

    private static final /* synthetic */ EnumEntries $ENTRIES;
    private final int code;

    @NotNull
    private final String message;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(geolocationErrorsArr);
    }

    public GeolocationErrors(int i10, String str) {
        super(str, i);
        this.code = i10;
        this.message = str;
    }

    @NotNull
    public static EnumEntries<GeolocationErrors> getEntries() {
        return $ENTRIES;
    }

    public static GeolocationErrors valueOf(String str) {
        return (GeolocationErrors) Enum.valueOf(GeolocationErrors.class, str);
    }

    public static GeolocationErrors[] values() {
        return (GeolocationErrors[]) $VALUES.clone();
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    public int getCode() {
        return this.code;
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    @NotNull
    public String getMessage() {
        return this.message;
    }
}
