package com.veridas.display;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes11.dex */
public class DisplayUtils {
    public static final String TAG = "DisplayUtils";

    public static Point getCorrectedSize(Display display, DisplayOrientation displayOrientation, Point point) {
        return getCorrectedSizeFromDisplaySize(displayOrientation, getSize(display, displayOrientation), point);
    }

    public static Point getCorrectedSizeFromDisplaySize(DisplayOrientation displayOrientation, Point point, Point point2) {
        double d2;
        int i10;
        double d3 = ((double) point.y) / ((double) point.x);
        if (displayOrientation == DisplayOrientation.LANDSCAPE) {
            d2 = point2.y;
            i10 = point2.x;
        } else {
            d2 = point2.x;
            i10 = point2.y;
        }
        double d7 = d2 / ((double) i10);
        Point point3 = new Point(point.x, point.y);
        if (d3 > d7) {
            point3.x = (int) (((double) point3.y) / d7);
        } else {
            point3.y = (int) (((double) point3.x) * d7);
        }
        return point3;
    }

    public static Point getCorrectedSizeWithoutBar(Display display, DisplayOrientation displayOrientation, Point point) {
        return getCorrectedSizeFromDisplaySize(displayOrientation, getSizeWithoutBar(display, displayOrientation), point);
    }

    public static Display getDefaultDisplay(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public static int getNavBarHeight(Display display) {
        return Math.abs(getSizeFromDisplay(display).y - getRawSizeFromDisplay(display).y);
    }

    public static Point getRawSizeFromDisplay(Display display) {
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }

    public static Point getRealSizeFromDisplay(Display display) {
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }

    public static Rect getReferenceImageRegion(Point point, Point point2, double d2, float f6) {
        float f10;
        float fRound;
        float fRound2;
        float f11;
        int i10 = point.x;
        float f12 = i10 / 1280.0f;
        double d3 = ((double) i10) / ((double) point.y);
        if (d2 > d3) {
            fRound2 = Math.round(((int) Math.round(d3 * 60.0d)) * f12);
            f10 = point.x - (fRound2 * 2.0f);
            fRound = Math.round(((double) f10) / d2);
            f11 = (point.y - fRound) / 2.0f;
        } else {
            float fRound3 = Math.round(f12 * 30.0f);
            float f13 = point.y - (fRound3 * 2.0f);
            float fRound4 = Math.round(((double) f13) * d2);
            float f14 = (point.x - fRound4) / 2.0f;
            f10 = fRound4;
            fRound = f13;
            fRound2 = f14;
            f11 = fRound3;
        }
        Rect rect = new Rect(Math.round(fRound2), Math.round(f11), Math.round(fRound2 + f10), Math.round(f11 + fRound));
        if (point2 == null) {
            point2 = point;
        }
        float f15 = point2.y - point.y;
        float f16 = point2.x - point.x;
        float f17 = f15 / 2.0f;
        int i11 = (int) (rect.top + f17);
        rect.top = i11;
        int i12 = (int) (rect.bottom + f17);
        rect.bottom = i12;
        float f18 = f16 / 2.0f;
        int i13 = (int) (rect.left + f18);
        rect.left = i13;
        int i14 = (int) (rect.right + f18);
        rect.right = i14;
        if (f6 == 1.0f) {
            return rect;
        }
        float f19 = i14 - i13;
        float f20 = i12 - i11;
        float f21 = f19 * f6;
        float f22 = f6 * f20;
        float f23 = i13 + ((f19 - f21) / 2.0f);
        float f24 = i11 + ((f20 - f22) / 2.0f);
        return new Rect(Math.round(f23), Math.round(f24), Math.round(f21 + f23), Math.round(f22 + f24));
    }

    public static Point getSize(Point point, Point point2, DisplayOrientation displayOrientation) {
        if (displayOrientation == DisplayOrientation.LANDSCAPE) {
            return point2.x > point2.y ? new Point(point.x, point.y) : new Point(point.y, point.x);
        }
        return point2.x > point2.y ? new Point(point.y, point.x) : new Point(point.x, point.y);
    }

    public static Point getSizeFromDisplay(Display display) {
        Point point = new Point();
        display.getSize(point);
        return point;
    }

    public static float getSizeInDp(Context context, float f6) {
        return (int) TypedValue.applyDimension(0, f6, context.getResources().getDisplayMetrics());
    }

    public static int getSizeInPixels(Context context, float f6) {
        return (int) TypedValue.applyDimension(1, f6, context.getResources().getDisplayMetrics());
    }

    public static Point getSizeWithoutBar(Display display, DisplayOrientation displayOrientation) {
        Point realSizeFromDisplay = getRealSizeFromDisplay(display);
        Point point = new Point();
        display.getSize(point);
        return getSize(point, realSizeFromDisplay, displayOrientation);
    }

    public static boolean hasNavBar(Display display) {
        return getNavBarHeight(display) > 0;
    }

    public static Point getSize(Display display, DisplayOrientation displayOrientation) {
        Point realSizeFromDisplay = getRealSizeFromDisplay(display);
        return getSize(realSizeFromDisplay, realSizeFromDisplay, displayOrientation);
    }
}
