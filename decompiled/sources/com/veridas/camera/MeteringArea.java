package com.veridas.camera;

import androidx.core.app.NotificationManagerCompat;
import com.nulabinc.zxcvbn.Guess;

/* JADX INFO: loaded from: classes9.dex */
public class MeteringArea {
    public final int height;
    public final int weight;
    public final int width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f66600x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f66601y;

    public MeteringArea(int i10, int i11, int i12, int i13, int i14) {
        Integer numValueOf = Integer.valueOf(NotificationManagerCompat.IMPORTANCE_UNSPECIFIED);
        if (i10 < -1000 || i10 > 1000) {
            throw new IllegalArgumentException(String.format("X (%d) is out of range (%d..%d)", Integer.valueOf(i10), numValueOf, 1000));
        }
        if (i12 < 1 || i12 > 2000) {
            throw new IllegalArgumentException(String.format("Width (%d) is out of range (%d..%d)", Integer.valueOf(i10), 1, Integer.valueOf(Guess.REFERENCE_YEAR)));
        }
        int i15 = i10 + i12;
        if (i15 > 2000) {
            throw new IllegalArgumentException(String.format("Right edge = (%d) is out of range (%d..%d)", Integer.valueOf(i15), 1, Integer.valueOf(Guess.REFERENCE_YEAR)));
        }
        if (i11 < -1000 || i11 > 1000) {
            throw new IllegalArgumentException(String.format("Y (%d) is out of range (%d..%d)", Integer.valueOf(i11), numValueOf, 1000));
        }
        if (i13 < 1 || i13 > 2000) {
            throw new IllegalArgumentException(String.format("Height (%d) is out of range (%d..%d)", Integer.valueOf(i13), 1, Integer.valueOf(Guess.REFERENCE_YEAR)));
        }
        int i16 = i11 + i13;
        if (i16 > 2000) {
            throw new IllegalArgumentException(String.format("Bottom edge (%d) is out of range (%d..%d)", Integer.valueOf(i16), 1, Integer.valueOf(Guess.REFERENCE_YEAR)));
        }
        if (i14 < 1 || i14 > 1000) {
            throw new IllegalArgumentException(String.format("Weight (%d) is out of range (%d..%d)", Integer.valueOf(i14), 1, 1000));
        }
        this.height = i13;
        this.weight = i14;
        this.width = i12;
        this.f66600x = i10;
        this.f66601y = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MeteringArea meteringArea = (MeteringArea) obj;
        return this.f66600x == meteringArea.f66600x && this.f66601y == meteringArea.f66601y && this.width == meteringArea.width && this.height == meteringArea.height && this.weight == meteringArea.weight;
    }

    public int hashCode() {
        return (((((((((-1284303899) + this.f66600x) * 500527) + this.f66601y) * 500527) + this.width) * 500527) + this.height) * 500527) + this.weight;
    }
}
