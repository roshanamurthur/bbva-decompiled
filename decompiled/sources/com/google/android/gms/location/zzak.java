package com.google.android.gms.location;

import android.location.Location;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.core.location.LocationCompat;
import com.google.android.gms.internal.identity.zzeo;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@21.2.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzak {
    public static final /* synthetic */ int zza = 0;
    private static final DecimalFormat zzb;
    private static final DecimalFormat zzc;

    @GuardedBy("sharedStringBuilder")
    private static final StringBuilder zzd;

    static {
        Locale locale = Locale.ROOT;
        zzb = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(locale));
        DecimalFormat decimalFormat = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(locale));
        zzc = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        zzd = new StringBuilder();
    }

    public static StringBuilder zza(Location location, StringBuilder sb2) {
        sb2.ensureCapacity(100);
        if (location == null) {
            sb2.append((String) null);
            return sb2;
        }
        sb2.append("{");
        sb2.append(location.getProvider());
        sb2.append(", ");
        if (LocationCompat.isMock(location)) {
            sb2.append("mock, ");
        }
        DecimalFormat decimalFormat = zzb;
        sb2.append(decimalFormat.format(location.getLatitude()));
        sb2.append(",");
        sb2.append(decimalFormat.format(location.getLongitude()));
        if (location.hasAccuracy()) {
            sb2.append("±");
            sb2.append(zzc.format(location.getAccuracy()));
            sb2.append("m");
        }
        if (location.hasAltitude()) {
            sb2.append(", alt=");
            DecimalFormat decimalFormat2 = zzc;
            sb2.append(decimalFormat2.format(location.getAltitude()));
            if (LocationCompat.hasVerticalAccuracy(location)) {
                sb2.append("±");
                sb2.append(decimalFormat2.format(LocationCompat.getVerticalAccuracyMeters(location)));
            }
            sb2.append("m");
        }
        if (location.hasSpeed()) {
            sb2.append(", spd=");
            DecimalFormat decimalFormat3 = zzc;
            sb2.append(decimalFormat3.format(location.getSpeed()));
            if (LocationCompat.hasSpeedAccuracy(location)) {
                sb2.append("±");
                sb2.append(decimalFormat3.format(LocationCompat.getSpeedAccuracyMetersPerSecond(location)));
            }
            sb2.append("m/s");
        }
        if (location.hasBearing()) {
            sb2.append(", brg=");
            DecimalFormat decimalFormat4 = zzc;
            sb2.append(decimalFormat4.format(location.getBearing()));
            if (LocationCompat.hasBearingAccuracy(location)) {
                sb2.append("±");
                sb2.append(decimalFormat4.format(LocationCompat.getBearingAccuracyDegrees(location)));
            }
            sb2.append("°");
        }
        Bundle extras = location.getExtras();
        String string = extras != null ? extras.getString("floorLabel") : null;
        if (string != null) {
            sb2.append(", fl=");
            sb2.append(string);
        }
        Bundle extras2 = location.getExtras();
        String string2 = extras2 != null ? extras2.getString("levelId") : null;
        if (string2 != null) {
            sb2.append(", lv=");
            sb2.append(string2);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        sb2.append(", ert=");
        sb2.append(zzeo.zza(LocationCompat.getElapsedRealtimeMillis(location) + jCurrentTimeMillis));
        sb2.append(AbstractJsonLexerKt.END_OBJ);
        return sb2;
    }
}
