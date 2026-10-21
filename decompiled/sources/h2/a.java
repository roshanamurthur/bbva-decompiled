package h2;

import android.location.GnssStatus;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.location.GnssStatusCompat;
import androidx.core.util.Preconditions;

/* JADX INFO: compiled from: GnssStatusWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(24)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class a extends GnssStatusCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GnssStatus f69254a;

    /* JADX INFO: renamed from: h2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GnssStatusWrapper.java */
    @RequiresApi(26)
    public static class C0290a {
        @DoNotInline
        public static float a(GnssStatus gnssStatus, int i10) {
            return gnssStatus.getCarrierFrequencyHz(i10);
        }

        @DoNotInline
        public static boolean b(GnssStatus gnssStatus, int i10) {
            return gnssStatus.hasCarrierFrequencyHz(i10);
        }
    }

    /* JADX INFO: compiled from: GnssStatusWrapper.java */
    @RequiresApi(30)
    public static class b {
        @DoNotInline
        public static float a(GnssStatus gnssStatus, int i10) {
            return gnssStatus.getBasebandCn0DbHz(i10);
        }

        @DoNotInline
        public static boolean b(GnssStatus gnssStatus, int i10) {
            return gnssStatus.hasBasebandCn0DbHz(i10);
        }
    }

    public a(Object obj) {
        this.f69254a = com.esotericsoftware.kryo.serializers.m.a(Preconditions.checkNotNull(com.esotericsoftware.kryo.serializers.m.a(obj)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f69254a.equals(((a) obj).f69254a);
        }
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public final float getAzimuthDegrees(int i10) {
        return this.f69254a.getAzimuthDegrees(i10);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public final float getBasebandCn0DbHz(int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            return b.a(this.f69254a, i10);
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public final float getCarrierFrequencyHz(int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C0290a.a(this.f69254a, i10);
        }
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public final float getCn0DbHz(int i10) {
        return this.f69254a.getCn0DbHz(i10);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public final int getConstellationType(int i10) {
        return this.f69254a.getConstellationType(i10);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public final float getElevationDegrees(int i10) {
        return this.f69254a.getElevationDegrees(i10);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public final int getSatelliteCount() {
        return this.f69254a.getSatelliteCount();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public final int getSvid(int i10) {
        return this.f69254a.getSvid(i10);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public final boolean hasAlmanacData(int i10) {
        return this.f69254a.hasAlmanacData(i10);
    }

    @Override // androidx.core.location.GnssStatusCompat
    public final boolean hasBasebandCn0DbHz(int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            return b.b(this.f69254a, i10);
        }
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public final boolean hasCarrierFrequencyHz(int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C0290a.b(this.f69254a, i10);
        }
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public final boolean hasEphemerisData(int i10) {
        return this.f69254a.hasEphemerisData(i10);
    }

    public final int hashCode() {
        return this.f69254a.hashCode();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public final boolean usedInFix(int i10) {
        return this.f69254a.usedInFix(i10);
    }
}
