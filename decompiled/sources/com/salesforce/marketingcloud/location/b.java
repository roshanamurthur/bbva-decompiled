package com.salesforce.marketingcloud.location;

import android.annotation.SuppressLint;
import androidx.annotation.RestrictTo;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.mypinpad.tsdk.isolation.z1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u0000 \u00162\u00020\u0001:\u0003\u0003\u0005\u0007B/\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J;\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/salesforce/marketingcloud/location/b;", "", "", "a", "", "b", "", "c", "d", "", "e", "id", "radius", "latitude", "longitude", ConstantsKt.TRANSITION_EXTRA_ID, "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "F", "i", "()F", "D", "g", "()D", "h", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "j", "()I", "<init>", "(Ljava/lang/String;FDDI)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"ShiftFlags"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final /* data */ class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f64405g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f64406h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f64407i = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final double latitude;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final double longitude;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int transition;

    /* JADX INFO: renamed from: com.salesforce.marketingcloud.location.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/salesforce/marketingcloud/location/b$b;", "", "sdk_release"}, k = 1, mv = {1, 8, 0})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface InterfaceC0256b {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/salesforce/marketingcloud/location/b$c;", "", "sdk_release"}, k = 1, mv = {1, 8, 0})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface c {
    }

    public b(@NotNull String id, float f6, double d2, double d3, int i10) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.radius = f6;
        this.latitude = d2;
        this.longitude = d3;
        this.transition = i10;
    }

    public static /* synthetic */ b a(b bVar, String str, float f6, double d2, double d3, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bVar.id;
        }
        if ((i11 & 2) != 0) {
            f6 = bVar.radius;
        }
        float f10 = f6;
        if ((i11 & 4) != 0) {
            d2 = bVar.latitude;
        }
        double d7 = d2;
        if ((i11 & 8) != 0) {
            d3 = bVar.longitude;
        }
        double d10 = d3;
        if ((i11 & 16) != 0) {
            i10 = bVar.transition;
        }
        return bVar.a(str, f10, d7, d10, i10);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getTransition() {
        return this.transition;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return Intrinsics.areEqual(this.id, bVar.id) && Float.compare(this.radius, bVar.radius) == 0 && Double.compare(this.latitude, bVar.latitude) == 0 && Double.compare(this.longitude, bVar.longitude) == 0 && this.transition == bVar.transition;
    }

    @NotNull
    public final String f() {
        return this.id;
    }

    public final double g() {
        return this.latitude;
    }

    public final double h() {
        return this.longitude;
    }

    public int hashCode() {
        int iA = z1.a(this.radius, this.id.hashCode() * 31, 31);
        long jDoubleToLongBits = Double.doubleToLongBits(this.latitude);
        int i10 = (iA + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)))) * 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        return ((i10 + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + this.transition;
    }

    public final float i() {
        return this.radius;
    }

    public final int j() {
        return this.transition;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GeofenceRegion(id=");
        sb2.append(this.id);
        sb2.append(", radius=");
        sb2.append(this.radius);
        sb2.append(", latitude=");
        sb2.append(this.latitude);
        sb2.append(", longitude=");
        sb2.append(this.longitude);
        sb2.append(", transition=");
        return androidx.activity.a.d(sb2, this.transition, RootService.CLOSE_BRACKET);
    }

    @NotNull
    public final b a(@NotNull String id, float radius, double latitude, double longitude, int transition) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new b(id, radius, latitude, longitude, transition);
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }
}
