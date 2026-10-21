package io.card.payment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Util.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f69854a = Build.MODEL.equals("DROID2");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f69855b;

    public static boolean a() {
        if (f69855b == null) {
            boolean z10 = false;
            if (!CardScanner.G0 && (CardScanner.nUseNeon() || CardScanner.nUseTegra() || CardScanner.nUseX86())) {
                try {
                    Camera cameraOpen = Camera.open();
                    if (cameraOpen != null) {
                        List<Camera.Size> supportedPreviewSizes = cameraOpen.getParameters().getSupportedPreviewSizes();
                        cameraOpen.release();
                        Iterator<Camera.Size> it = supportedPreviewSizes.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                Log.w("card.io", "- Camera resolution is insufficient");
                                break;
                            }
                            Camera.Size next = it.next();
                            if (next.width == 640 && next.height == 480) {
                                z10 = true;
                                break;
                            }
                        }
                    } else {
                        Log.w("card.io", "- No camera found");
                    }
                } catch (RuntimeException unused) {
                }
            } else {
                Log.w("card.io", "- Processor type is not supported");
            }
            f69855b = Boolean.valueOf(z10);
        }
        return f69855b.booleanValue();
    }

    public static Rect b(Point point, int i10, int i11) {
        int i12 = point.x;
        int i13 = i10 / 2;
        int i14 = point.y;
        int i15 = i11 / 2;
        return new Rect(i12 - i13, i14 - i15, i12 + i13, i14 + i15);
    }

    public static void c(Paint paint) {
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setTypeface(Typeface.create(Typeface.SANS_SERIF, 1));
        paint.setAntiAlias(true);
        paint.setShadowLayer(1.5f, 0.5f, 0.0f, Color.HSVToColor(200, new float[]{0.0f, 0.0f, 0.0f}));
    }

    public static void d(Intent intent, Intent intent2, g gVar) {
        if (!intent.getBooleanExtra(CardIOActivity.EXTRA_RETURN_CARD_IMAGE, false) || gVar == null || gVar.f69782r0 == null) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        gVar.f69782r0.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        intent2.putExtra(CardIOActivity.EXTRA_CAPTURED_CARD_IMAGE, byteArrayOutputStream.toByteArray());
    }
}
