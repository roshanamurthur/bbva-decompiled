package h2;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.os.Build;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import androidx.core.location.GnssStatusCompat;
import androidx.core.util.Preconditions;
import java.util.Iterator;

/* JADX INFO: compiled from: GpsStatusWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class b extends GnssStatusCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GpsStatus f69255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("mWrapped")
    public int f69256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("mWrapped")
    public Iterator<GpsSatellite> f69257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @GuardedBy("mWrapped")
    public int f69258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("mWrapped")
    public GpsSatellite f69259e;

    public b(GpsStatus gpsStatus) {
        GpsStatus gpsStatus2 = (GpsStatus) Preconditions.checkNotNull(gpsStatus);
        this.f69255a = gpsStatus2;
        this.f69256b = -1;
        this.f69257c = gpsStatus2.getSatellites().iterator();
        this.f69258d = -1;
        this.f69259e = null;
    }

    public static int a(int i10) {
        if (i10 > 0 && i10 <= 32) {
            return 1;
        }
        if (i10 >= 33 && i10 <= 64) {
            return 2;
        }
        if (i10 > 64 && i10 <= 88) {
            return 3;
        }
        if (i10 <= 200 || i10 > 235) {
            return (i10 < 193 || i10 > 200) ? 0 : 4;
        }
        return 5;
    }

    public final GpsSatellite b(int i10) {
        GpsSatellite gpsSatellite;
        synchronized (this.f69255a) {
            try {
                if (i10 < this.f69258d) {
                    this.f69257c = this.f69255a.getSatellites().iterator();
                    this.f69258d = -1;
                }
                while (true) {
                    int i11 = this.f69258d;
                    if (i11 >= i10) {
                        break;
                    }
                    this.f69258d = i11 + 1;
                    if (!this.f69257c.hasNext()) {
                        this.f69259e = null;
                        break;
                    }
                    this.f69259e = this.f69257c.next();
                }
                gpsSatellite = this.f69259e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (GpsSatellite) Preconditions.checkNotNull(gpsSatellite);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f69255a.equals(((b) obj).f69255a);
        }
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public final float getAzimuthDegrees(int i10) {
        return b(i10).getAzimuth();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public final float getBasebandCn0DbHz(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public final float getCarrierFrequencyHz(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public final float getCn0DbHz(int i10) {
        return b(i10).getSnr();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public final int getConstellationType(int i10) {
        if (Build.VERSION.SDK_INT < 24) {
            return 1;
        }
        return a(b(i10).getPrn());
    }

    @Override // androidx.core.location.GnssStatusCompat
    public final float getElevationDegrees(int i10) {
        return b(i10).getElevation();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public final int getSatelliteCount() {
        int i10;
        synchronized (this.f69255a) {
            try {
                if (this.f69256b == -1) {
                    for (GpsSatellite gpsSatellite : this.f69255a.getSatellites()) {
                        this.f69256b++;
                    }
                    this.f69256b++;
                }
                i10 = this.f69256b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public final int getSvid(int i10) {
        if (Build.VERSION.SDK_INT < 24) {
            return b(i10).getPrn();
        }
        int prn = b(i10).getPrn();
        int iA = a(prn);
        if (iA == 2) {
            return prn + 87;
        }
        if (iA != 3) {
            return iA != 5 ? prn : prn - 200;
        }
        return prn - 64;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public final boolean hasAlmanacData(int i10) {
        return b(i10).hasAlmanac();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public final boolean hasBasebandCn0DbHz(int i10) {
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public final boolean hasCarrierFrequencyHz(int i10) {
        return false;
    }

    @Override // androidx.core.location.GnssStatusCompat
    public final boolean hasEphemerisData(int i10) {
        return b(i10).hasEphemeris();
    }

    public final int hashCode() {
        return this.f69255a.hashCode();
    }

    @Override // androidx.core.location.GnssStatusCompat
    public final boolean usedInFix(int i10) {
        return b(i10).usedInFix();
    }
}
