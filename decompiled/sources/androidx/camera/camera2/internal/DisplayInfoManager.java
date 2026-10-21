package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.camera2.internal.compat.workaround.MaxPreviewSize;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class DisplayInfoManager {
    private static volatile DisplayInfoManager sInstance;

    @NonNull
    private final DisplayManager mDisplayManager;
    private static final Size MAX_PREVIEW_SIZE = new Size(1920, 1080);
    private static final Object INSTANCE_LOCK = new Object();
    private volatile Size mPreviewSize = null;
    private final MaxPreviewSize mMaxPreviewSize = new MaxPreviewSize();

    private DisplayInfoManager(@NonNull Context context) {
        this.mDisplayManager = (DisplayManager) context.getSystemService("display");
    }

    private Size calculatePreviewSize() {
        Point point = new Point();
        getMaxSizeDisplay().getRealSize(point);
        Size size = point.x > point.y ? new Size(point.x, point.y) : new Size(point.y, point.x);
        int height = size.getHeight() * size.getWidth();
        Size size2 = MAX_PREVIEW_SIZE;
        if (height > size2.getHeight() * size2.getWidth()) {
            size = size2;
        }
        return this.mMaxPreviewSize.getMaxPreviewResolution(size);
    }

    @NonNull
    public static DisplayInfoManager getInstance(@NonNull Context context) {
        if (sInstance == null) {
            synchronized (INSTANCE_LOCK) {
                try {
                    if (sInstance == null) {
                        sInstance = new DisplayInfoManager(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return sInstance;
    }

    @VisibleForTesting
    public static void releaseInstance() {
        sInstance = null;
    }

    @NonNull
    public Display getMaxSizeDisplay() {
        Display[] displays = this.mDisplayManager.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display display = null;
        int i10 = -1;
        for (Display display2 : displays) {
            if (display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i11 = point.x;
                int i12 = point.y;
                if (i11 * i12 > i10) {
                    display = display2;
                    i10 = i11 * i12;
                }
            }
        }
        if (display != null) {
            return display;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    @NonNull
    public Size getPreviewSize() {
        if (this.mPreviewSize != null) {
            return this.mPreviewSize;
        }
        this.mPreviewSize = calculatePreviewSize();
        return this.mPreviewSize;
    }

    public void refresh() {
        this.mPreviewSize = calculatePreviewSize();
    }
}
