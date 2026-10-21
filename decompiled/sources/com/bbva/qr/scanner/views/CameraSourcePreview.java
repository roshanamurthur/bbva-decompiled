package com.bbva.qr.scanner.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import androidx.annotation.RequiresPermission;
import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.bbva.qr.scanner.camera.CameraSource;
import com.bbva.qr.scanner.camera.Picture;
import com.dasnano.vdphotoselfiecapture.api.model.Parameters;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CameraSourcePreview.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0002!\"B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u001c\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0007J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nJ0\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0014J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0014R\u0014\u0010\u001a\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006#"}, d2 = {"Lcom/bbva/qr/scanner/views/CameraSourcePreview;", "Landroid/view/ViewGroup;", "Lcom/bbva/qr/scanner/camera/CameraSource;", "cameraSource", "", EventDataKeys.Lifecycle.LIFECYCLE_START, "Lcom/bbva/qr/scanner/views/GraphicOverlay;", "overlay", "stop", "release", "Landroid/content/res/Resources;", "resources", "", "hasNavBar", "changed", "", Parameters.DIRECTION.LEFT, "top", Parameters.DIRECTION.RIGHT, "bottom", "onLayout", "Landroid/graphics/Canvas;", "canvas", "onDraw", "getBottomBarHeight", "()I", "bottomBarHeight", "Landroid/content/Context;", "contextActivity", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "a", "qr_release"}, k = 1, mv = {1, 8, 0})
public final class CameraSourcePreview extends ViewGroup {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Context f36324p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final SurfaceView f36325q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f36326r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f36327s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public CameraSource f36328t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public GraphicOverlay<?> f36329u0;

    /* JADX INFO: compiled from: CameraSourcePreview.kt */
    public final class a implements SurfaceHolder.Callback {
        public a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(@NotNull SurfaceHolder holder, int i10, int i11, int i12) {
            Intrinsics.checkNotNullParameter(holder, "holder");
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(@NotNull SurfaceHolder surface) {
            Intrinsics.checkNotNullParameter(surface, "surface");
            CameraSourcePreview cameraSourcePreview = CameraSourcePreview.this;
            cameraSourcePreview.f36327s0 = true;
            try {
                cameraSourcePreview.a();
            } catch (IOException | SecurityException | Exception unused) {
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(@NotNull SurfaceHolder surface) {
            Intrinsics.checkNotNullParameter(surface, "surface");
            CameraSourcePreview.this.f36327s0 = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraSourcePreview(@NotNull Context contextActivity, @NotNull AttributeSet attrs) {
        super(contextActivity, attrs);
        Intrinsics.checkNotNullParameter(contextActivity, "contextActivity");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f36324p0 = contextActivity;
        this.f36326r0 = false;
        this.f36327s0 = false;
        SurfaceView surfaceView = new SurfaceView(contextActivity);
        this.f36325q0 = surfaceView;
        surfaceView.getHolder().addCallback(new a());
        addView(surfaceView);
    }

    private final int getBottomBarHeight() {
        int identifier;
        Resources resources = this.f36324p0.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        if (hasNavBar(resources) && (identifier = resources.getIdentifier("navigation_bar_height", PluginUtils.IDENTIFIER_DIMENSION, "android")) > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    @RequiresPermission("android.permission.CAMERA")
    public final void a() throws IOException, SecurityException {
        if (this.f36326r0 && this.f36327s0) {
            CameraSource cameraSource = this.f36328t0;
            Intrinsics.checkNotNull(cameraSource);
            SurfaceHolder holder = this.f36325q0.getHolder();
            Intrinsics.checkNotNullExpressionValue(holder, "surfaceView.holder");
            cameraSource.start(holder);
            if (this.f36329u0 != null) {
                CameraSource cameraSource2 = this.f36328t0;
                Intrinsics.checkNotNull(cameraSource2);
                Picture picture = cameraSource2.getPicture();
                Intrinsics.checkNotNull(picture);
                Camera.Size preview = picture.getPreview();
                int iMin = Math.min(preview.width, preview.height);
                int iMax = Math.max(preview.width, preview.height);
                int i10 = this.f36324p0.getResources().getConfiguration().orientation;
                if (i10 != 2 && i10 == 1) {
                    GraphicOverlay<?> graphicOverlay = this.f36329u0;
                    Intrinsics.checkNotNull(graphicOverlay);
                    CameraSource cameraSource3 = this.f36328t0;
                    Intrinsics.checkNotNull(cameraSource3);
                    graphicOverlay.setCameraInfo(iMin, iMax, cameraSource3.getFacing());
                } else {
                    GraphicOverlay<?> graphicOverlay2 = this.f36329u0;
                    Intrinsics.checkNotNull(graphicOverlay2);
                    CameraSource cameraSource4 = this.f36328t0;
                    Intrinsics.checkNotNull(cameraSource4);
                    graphicOverlay2.setCameraInfo(iMax, iMin, cameraSource4.getFacing());
                }
                GraphicOverlay<?> graphicOverlay3 = this.f36329u0;
                Intrinsics.checkNotNull(graphicOverlay3);
                graphicOverlay3.clear();
            }
            this.f36326r0 = false;
        }
    }

    public final boolean hasNavBar(@NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        return identifier > 0 && resources.getBoolean(identifier);
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int i10 = right - left;
        int i11 = bottom - top;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            if (getChildAt(i12) instanceof CaptureOverlay) {
                getChildAt(i12).layout(30, 70, getRight(), getBottom());
            } else if (getChildAt(i12) instanceof GraphicOverlay) {
                getChildAt(i12).layout(0, 0, i10, i11);
            } else {
                getChildAt(i12).layout(0, 0, i10, getBottomBarHeight() + i11);
            }
        }
        try {
            a();
        } catch (IOException | SecurityException | Exception unused) {
        }
    }

    public final void release() {
        CameraSource cameraSource = this.f36328t0;
        if (cameraSource != null) {
            Intrinsics.checkNotNull(cameraSource);
            cameraSource.stop();
            this.f36328t0 = null;
        }
    }

    @RequiresPermission("android.permission.CAMERA")
    public final void start(@Nullable CameraSource cameraSource) throws IOException, SecurityException {
        if (cameraSource == null) {
            stop();
        }
        this.f36328t0 = cameraSource;
        if (cameraSource != null) {
            this.f36326r0 = true;
            a();
        }
    }

    public final void stop() {
        CameraSource cameraSource = this.f36328t0;
        if (cameraSource != null) {
            Intrinsics.checkNotNull(cameraSource);
            cameraSource.stop();
        }
    }

    @RequiresPermission("android.permission.CAMERA")
    public final void start(@NotNull CameraSource cameraSource, @NotNull GraphicOverlay<?> overlay) throws IOException, SecurityException {
        Intrinsics.checkNotNullParameter(cameraSource, "cameraSource");
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        this.f36329u0 = overlay;
        start(cameraSource);
    }
}
