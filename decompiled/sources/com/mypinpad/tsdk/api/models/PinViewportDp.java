package com.mypinpad.tsdk.api.models;

import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0010\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/api/models/PinViewportDp;", "", "", "a", "F", "getX", "()F", "x", "b", "getY", "y", "c", "getWidth", "width", "d", "getHeight", "height", "<init>", "(FFFF)V"}, k = 1, mv = {1, 8, 0})
public final class PinViewportDp {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f51702e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f51703f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float x;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final float y;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final float width;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final float height;

    public PinViewportDp(float f6, float f10, float f11, float f12) {
        this.x = f6;
        this.y = f10;
        this.width = f11;
        this.height = f12;
    }

    @JvmName(name = "getHeight")
    public final float getHeight() {
        int i10 = f51703f;
        int i11 = i10 & 77;
        int i12 = ((((i10 ^ 77) | i11) << 1) - (~(-((~i11) & (i10 | 77))))) - 1;
        f51702e = i12 % 128;
        int i13 = i12 % 2;
        int i14 = i10 & 37;
        int i15 = -(-(i10 | 37));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        f51702e = i16 % 128;
        int i17 = i16 % 2;
        return this.height;
    }

    @JvmName(name = "getWidth")
    public final float getWidth() {
        int i10 = f51702e;
        int i11 = ((i10 ^ 6) + ((i10 & 6) << 1)) - 1;
        f51703f = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        int i12 = i10 + 103;
        f51703f = i12 % 128;
        int i13 = i12 % 2;
        return this.width;
    }

    @JvmName(name = "getX")
    public final float getX() {
        int i10 = f51702e;
        int i11 = (i10 ^ 47) + ((i10 & 47) << 1);
        int i12 = i11 % 128;
        f51703f = i12;
        int i13 = i11 % 2;
        int i14 = (i12 & 57) + (i12 | 57);
        f51702e = i14 % 128;
        int i15 = i14 % 2;
        return this.x;
    }

    @JvmName(name = "getY")
    public final float getY() {
        int i10 = f51703f;
        int i11 = ((((i10 ^ 65) | (i10 & 65)) << 1) - (~(-(((~i10) & 65) | (i10 & (-66)))))) - 1;
        int i12 = i11 % 128;
        f51702e = i12;
        int i13 = i11 % 2;
        int i14 = (i12 & 9) + (i12 | 9);
        f51703f = i14 % 128;
        int i15 = i14 % 2;
        return this.y;
    }
}
