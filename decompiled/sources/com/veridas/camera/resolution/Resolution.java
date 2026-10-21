package com.veridas.camera.resolution;

import android.graphics.Point;
import android.hardware.Camera;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public class Resolution {
    public static final Resolution OPTIMAL_RESIZE_SIZE_10MP;
    public static final Resolution OPTIMAL_RESIZE_SIZE_1MP;
    public static final Resolution OPTIMAL_RESIZE_SIZE_2MP;
    public static final Resolution OPTIMAL_RESIZE_SIZE_3MP;
    public static final Resolution OPTIMAL_RESIZE_SIZE_4MP;
    public static final Resolution OPTIMAL_RESIZE_SIZE_5MP;
    public static final Resolution OPTIMAL_RESIZE_SIZE_6MP;
    public static final Resolution OPTIMAL_RESIZE_SIZE_7MP;
    public static final Resolution OPTIMAL_RESIZE_SIZE_8MP;
    public static final Resolution OPTIMAL_RESIZE_SIZE_9MP;
    public static final Resolution[] OPTIMAL_SIZE_LIST;
    public final float aspectRatio;
    public final int height;
    public final float inverseAspectRatio;
    public final int mp;
    public final int width;
    public static final Resolution FULL_HD_43 = create(1920, 1440);
    public static final Resolution FULL_HD_169 = create(1920, 1080);
    public static final Resolution HD_43 = create(1280, 960);
    public static final Resolution HD_169 = create(1280, 720);
    public static final Resolution OPTIMAL_ASPECT_RATIO = create(4, 3);

    static {
        Resolution resolutionCreate = create(960, 1280);
        OPTIMAL_RESIZE_SIZE_1MP = resolutionCreate;
        Resolution resolutionCreate2 = create(1224, 1632);
        OPTIMAL_RESIZE_SIZE_2MP = resolutionCreate2;
        Resolution resolutionCreate3 = create(1536, 2048);
        OPTIMAL_RESIZE_SIZE_3MP = resolutionCreate3;
        Resolution resolutionCreate4 = create(1752, 2336);
        OPTIMAL_RESIZE_SIZE_4MP = resolutionCreate4;
        Resolution resolutionCreate5 = create(1932, 2576);
        OPTIMAL_RESIZE_SIZE_5MP = resolutionCreate5;
        Resolution resolutionCreate6 = create(2112, 2816);
        OPTIMAL_RESIZE_SIZE_6MP = resolutionCreate6;
        Resolution resolutionCreate7 = create(2316, 3088);
        OPTIMAL_RESIZE_SIZE_7MP = resolutionCreate7;
        Resolution resolutionCreate8 = create(3264, 2448);
        OPTIMAL_RESIZE_SIZE_8MP = resolutionCreate8;
        Resolution resolutionCreate9 = create(2592, 3456);
        OPTIMAL_RESIZE_SIZE_9MP = resolutionCreate9;
        Resolution resolutionCreate10 = create(2736, 3648);
        OPTIMAL_RESIZE_SIZE_10MP = resolutionCreate10;
        OPTIMAL_SIZE_LIST = new Resolution[]{resolutionCreate, resolutionCreate2, resolutionCreate3, resolutionCreate4, resolutionCreate5, resolutionCreate6, resolutionCreate7, resolutionCreate8, resolutionCreate9, resolutionCreate10};
    }

    public Resolution(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException(String.format("Width cannot be less than zero (0), actual (%d)", Integer.valueOf(i10)));
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(String.format("Height cannot be less than zero (0), actual (%d)", Integer.valueOf(i11)));
        }
        this.width = i10;
        this.height = i11;
        this.mp = i10 * i11;
        float f6 = i10;
        float f10 = i11;
        this.aspectRatio = f6 / f10;
        this.inverseAspectRatio = f10 / f6;
    }

    public static List<Resolution> convert(List<Camera.Size> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        Iterator<Camera.Size> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(from(it.next()));
        }
        return arrayList;
    }

    public static Resolution create() {
        return create(1);
    }

    public static Resolution findOptimalResolutionForMegapixels(float f6) {
        int iAbs = Math.abs(Math.round(f6));
        return (iAbs < 1 || iAbs > 10) ? OPTIMAL_RESIZE_SIZE_8MP : OPTIMAL_SIZE_LIST[iAbs - 1];
    }

    public static Resolution from(Point point) {
        return create(point.x, point.y);
    }

    public Point calculateOffsetIn(Resolution resolution) {
        return new Point((resolution.width - this.width) / 2, (resolution.height - this.height) / 2);
    }

    public float calculateScaleFactor(Resolution resolution) {
        float f6;
        int i10;
        float f10;
        int i11;
        if (resolution.isLandscape()) {
            if (isPortrait()) {
                f10 = this.width;
                i11 = resolution.width;
            } else {
                f10 = this.height;
                i11 = resolution.height;
            }
            return f10 / i11;
        }
        if (resolution.isPortrait()) {
            if (isLandscape()) {
                f6 = resolution.height;
                i10 = this.height;
            } else {
                f6 = resolution.width;
                i10 = this.width;
            }
        } else {
            if (!resolution.isSquared()) {
                return 1.0f;
            }
            if (isLandscape()) {
                f6 = resolution.height;
                i10 = this.height;
            } else {
                f6 = resolution.width;
                i10 = this.width;
            }
        }
        return f6 / i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Resolution resolution = (Resolution) obj;
        return Float.compare(resolution.aspectRatio, this.aspectRatio) == 0 && Float.compare(resolution.inverseAspectRatio, this.inverseAspectRatio) == 0 && this.mp == resolution.mp && this.width == resolution.width && this.height == resolution.height;
    }

    public void fit(Resolution resolution) {
        throw new UnsupportedOperationException("This function has not yet been implemented.");
    }

    public int hashCode() {
        return ((((((Float.floatToRawIntBits(this.inverseAspectRatio) + ((Float.floatToRawIntBits(this.aspectRatio) + 1580903) * 1907)) * 1907) + this.mp) * 1907) + this.width) * 1907) + this.height;
    }

    public boolean isEqualFormat(Resolution resolution) {
        return resolution != null && resolution.width == this.width && resolution.height == this.height;
    }

    public boolean isLandscape() {
        return this.aspectRatio > 1.0f;
    }

    public boolean isPortrait() {
        return this.aspectRatio < 1.0f;
    }

    public boolean isSquared() {
        return this.aspectRatio == 1.0f;
    }

    public Resolution scale(float f6) {
        return create((int) (this.width * f6), (int) (this.height * f6));
    }

    public Point toPoint() {
        return new Point(this.width, this.height);
    }

    public String toString() {
        return String.format(Locale.ROOT, "%s[width=%d, height=%d, aspectRatio=%f, inverseAspectRatio=%f, mp=%d]", getClass().getSimpleName(), Integer.valueOf(this.width), Integer.valueOf(this.height), Float.valueOf(this.aspectRatio), Float.valueOf(this.inverseAspectRatio), Integer.valueOf(this.mp));
    }

    public static Resolution create(int i10) {
        return create(i10, i10);
    }

    public static Resolution from(Camera.Size size) {
        return create(size.width, size.height);
    }

    public static Resolution create(int i10, int i11) {
        return new Resolution(i10, i11);
    }

    public static Resolution from(View view) {
        return create(view.getWidth(), view.getHeight());
    }

    public static Resolution from(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("x");
        if (strArrSplit.length != 2) {
            return null;
        }
        return create(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]));
    }
}
