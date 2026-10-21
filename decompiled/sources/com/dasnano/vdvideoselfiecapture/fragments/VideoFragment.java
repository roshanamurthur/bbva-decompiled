package com.dasnano.vdvideoselfiecapture.fragments;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.camera.core.impl.y;
import androidx.compose.material3.TooltipKt;
import androidx.core.content.ContextCompat;
import androidx.core.text.HtmlCompat;
import androidx.fragment.app.FragmentActivity;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.dasnano.vdvideoselfiecapture.R;
import com.dasnano.vdvideoselfiecapture.camera.resolution.DefaultCaptureResolutionSelectionStrategy;
import com.dasnano.vdvideoselfiecapture.camera.resolution.DefaultPreviewResolutionSelectionStrategy;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import com.dasnano.vdvideoselfiecapture.model.VDVideoSelfieViewModel;
import com.dasnano.vdvideoselfiecapture.other.DocumentRectangleOrFace;
import com.dasnano.vdvideoselfiecapture.other.FaceShapeView;
import com.dasnano.vdvideoselfiecapture.other.OvalView;
import com.dasnano.vdvideoselfiecapture.other.RectangleView;
import com.google.android.gms.wearable.WearableStatusCodes;
import com.veridas.camera.Camera;
import com.veridas.camera.CameraAction;
import com.veridas.camera.CameraAdapter;
import com.veridas.camera.CameraListener;
import com.veridas.camera.CameraProperties;
import com.veridas.camera.CameraQuery;
import com.veridas.camera.MeteringArea;
import com.veridas.camera.parameter.Parameter;
import com.veridas.camera.picture.Picture;
import com.veridas.camera.resolution.Resolution;
import com.veridas.config.IllegalColorValueException;
import com.veridas.config.PropertyNameNotFoundException;
import com.veridas.detect.Request;
import com.veridas.detect.obj.ObjectDetector;
import com.veridas.detect.obj.document.DefaultDocumentDetectorFactory;
import com.veridas.detect.obj.face.DefaultFaceDetectorFactory;
import com.veridas.detect.sequence.SequentialDetectionResult;
import com.veridas.di.CommonLibraryDepInjector;
import com.veridas.display.DisplayOrientation;
import com.veridas.fragment.DasCaptureFragment;
import com.veridas.fragment.DasFragment;
import com.veridas.fragment.FragmentLifecycleAdapter;
import com.veridas.fragment.permission.CapturePermissionAdapter;
import com.veridas.fragment.permission.CapturePermissionDialogAdapter;
import com.veridas.fragment.permission.CapturePermissionDialogListener;
import com.veridas.graphics.Frame;
import com.veridas.graphics.ImageEncoding;
import com.veridas.lib.entities.resources.Document;
import com.veridas.lib.entities.resources.Side;
import com.veridas.log.ILibraryLogger;
import com.veridas.log.Log;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;
import com.veridas.math.geometry.Rectangle;
import com.veridas.math.geometry.VectorSpace;
import com.veridas.resource.AndroidResourcesUtil;
import com.veridas.resource.database.IBlockingResourcesDatabase;
import com.veridas.util.Util;
import com.veridas.vdlibraryimageprocessing.CaptureType;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
public class VideoFragment extends DasCaptureFragment<VDVideoSelfieConfiguration, VDVideoSelfieViewModel> {
    public static final String CAPTURED_VIDEO_NAME = "capturedData";
    public static final String[] T2 = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
    public static final List<VideoState> U2;
    public static String V2 = null;
    public static final String VIDEO_FRAGMENT_FINISHED = "com.veridas.videoSelfieCapture.videoFragment.CAPTURE_FINISHED";
    public static final String VIDEO_FRAGMENT_VIDEO_CAPTURED = "com.veridas.videoSelfieCapture.videoFragment.VIDEO_CAPTURED";
    public ObjectDetector<SequentialDetectionResult> A1;
    public String A2;
    public ObjectDetector<SequentialDetectionResult> B1;
    public String B2;
    public ObjectDetector<SequentialDetectionResult> C1;
    public String C2;
    public boolean D1;
    public String D2;
    public boolean E1;
    public String E2;
    public boolean F1;
    public String F2;
    public boolean G1;
    public String G2;
    public boolean H1;
    public String H2;
    public boolean I1;
    public String I2;
    public boolean J1;
    public String J2;
    public HandlerThread K0;
    public boolean K1;
    public IBlockingResourcesDatabase K2;
    public Handler L0;
    public boolean L1;
    public f L2;
    public boolean M1;
    public boolean N1;
    public String O0;
    public boolean O1;
    public boolean P1;
    public boolean Q1;
    public boolean R1;
    public boolean S1;
    public float T1;
    public int U1;
    public int V1;
    public int W1;
    public int X1;
    public int Y1;
    public int Z1;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public int f39728a2;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public int f39730b2;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public int f39732c2;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public View f39733d1;
    public int d2;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public ImageView f39734e1;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public int f39735e2;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public Rect f39736f1;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public String f39737f2;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public Rect f39738g1;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public String f39739g2;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public DocumentRectangleOrFace f39740h1;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public String f39741h2;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public ImageButton f39742i1;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public String f39743i2;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public String f39745j2;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public String f39747k2;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public String f39749l2;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public String f39751m2;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public String f39753n2;
    public String o2;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public int f39755p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public String f39756p2;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public int f39757q1;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public String f39758q2;
    public int r1;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public String f39759r2;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public int f39760s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public String f39761s2;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public int f39762t1;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public String f39763t2;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public int f39764u1;
    public String u2;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public String f39766v2;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public String f39768w2;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public String f39770x2;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public String f39772y2;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public volatile Point f39773z1;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public String f39774z2;
    protected AtomicBoolean isRunning = new AtomicBoolean(false);
    public long J0 = 0;
    public OvalView M0 = null;
    public RectangleView N0 = null;
    public int P0 = 0;
    public volatile VideoState Q0 = VideoState.VIDEO_CALCULATING_FPS;
    public TextView R0 = null;
    public FrameLayout S0 = null;
    public View T0 = null;
    public MediaPlayer U0 = null;
    public FaceShapeView V0 = null;
    public final float W0 = 0.7f;
    public Document X0 = null;
    public final AtomicInteger Y0 = new AtomicInteger(0);
    public final AtomicInteger Z0 = new AtomicInteger(5);

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public float f39727a1 = 0.5f;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final AtomicBoolean f39729b1 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final AtomicBoolean f39731c1 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public TextView f39744j1 = null;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public ImageView f39746k1 = null;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public TextView f39748l1 = null;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public TextView f39750m1 = null;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public TextView f39752n1 = null;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public Handler f39754o1 = null;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public int f39765v1 = 0;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public boolean f39767w1 = false;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public RelativeLayout f39769x1 = null;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public TextView f39771y1 = null;
    public final n M2 = new n();
    public b N2 = new b();
    public c O2 = new c();
    public d P2 = new d();
    public e Q2 = new e();
    public g R2 = new g();
    public h S2 = new h();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class VideoState {
        private static final /* synthetic */ VideoState[] $VALUES;
        public static final VideoState VIDEO_CALCULATING_FPS;
        public static final VideoState VIDEO_CAMERA_RELEASE;
        public static final VideoState VIDEO_ERROR;
        public static final VideoState VIDEO_RECORDED;
        public static final VideoState VIDEO_SEARCHING_FACE;
        public static final VideoState VIDEO_SHOW_DOCUMENT_NO_DETECTION;
        public static final VideoState VIDEO_SHOW_OBVERSE;
        public static final VideoState VIDEO_SHOW_REVERSE;

        static {
            VideoState videoState = new VideoState("VIDEO_CALCULATING_FPS", 0);
            VIDEO_CALCULATING_FPS = videoState;
            VideoState videoState2 = new VideoState("VIDEO_SEARCHING_FACE", 1);
            VIDEO_SEARCHING_FACE = videoState2;
            VideoState videoState3 = new VideoState("VIDEO_SHOW_DOCUMENT_NO_DETECTION", 2);
            VIDEO_SHOW_DOCUMENT_NO_DETECTION = videoState3;
            VideoState videoState4 = new VideoState("VIDEO_SHOW_OBVERSE", 3);
            VIDEO_SHOW_OBVERSE = videoState4;
            VideoState videoState5 = new VideoState("VIDEO_SHOW_REVERSE", 4);
            VIDEO_SHOW_REVERSE = videoState5;
            VideoState videoState6 = new VideoState("VIDEO_RECORDED", 5);
            VIDEO_RECORDED = videoState6;
            VideoState videoState7 = new VideoState("VIDEO_CAMERA_RELEASE", 6);
            VIDEO_CAMERA_RELEASE = videoState7;
            VideoState videoState8 = new VideoState("VIDEO_ERROR", 7);
            VIDEO_ERROR = videoState8;
            $VALUES = new VideoState[]{videoState, videoState2, videoState3, videoState4, videoState5, videoState6, videoState7, videoState8};
        }

        public VideoState() {
            throw null;
        }

        public static VideoState valueOf(String str) {
            return (VideoState) Enum.valueOf(VideoState.class, str);
        }

        public static VideoState[] values() {
            return (VideoState[]) $VALUES.clone();
        }
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f39775p0;

        public a(String str) {
            this.f39775p0 = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str = VideoFragment.VIDEO_FRAGMENT_VIDEO_CAPTURED;
            VideoFragment videoFragment = VideoFragment.this;
            videoFragment.getClass();
            Intent intent = new Intent("com.veridas.videoSelfieCapture.videoFragment.VIDEO_CAPTURED");
            intent.putExtra("com.veridas.videoSelfieCapture.videoFragment.VIDEO_CAPTURED", this.f39775p0);
            videoFragment.broadcastIntent(intent);
            videoFragment.q(true);
        }
    }

    public class b implements Runnable {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                b bVar = b.this;
                VideoFragment videoFragment = VideoFragment.this;
                videoFragment.V0.setRect(-1, videoFragment.f39738g1, videoFragment.P0, videoFragment.getActivity());
                VideoFragment videoFragment2 = VideoFragment.this;
                videoFragment2.R0.setText(HtmlCompat.fromHtml(videoFragment2.G2, 0));
                if (videoFragment2.R1) {
                    videoFragment2.runOnUiThread(new com.dasnano.vdvideoselfiecapture.fragments.k(videoFragment2));
                }
                VideoFragment.d(videoFragment2, videoFragment2.F2, videoFragment2.f39736f1);
                try {
                    MediaPlayer mediaPlayer = videoFragment2.U0;
                    if (mediaPlayer != null) {
                        mediaPlayer.start();
                    }
                } catch (Exception e5) {
                    String str = VideoFragment.VIDEO_FRAGMENT_VIDEO_CAPTURED;
                    Log.e("VideoFragment", "Error playing sound: " + e5.getMessage(), e5);
                }
                VideoFragment.c(videoFragment2, false);
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            VideoFragment.this.runOnUiThread(new a());
        }
    }

    public class c implements Runnable {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                VideoFragment videoFragment = VideoFragment.this;
                String str = VideoFragment.VIDEO_FRAGMENT_VIDEO_CAPTURED;
                videoFragment.y();
            }
        }

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            VideoFragment.this.runOnUiThread(new a());
        }
    }

    public class d implements Runnable {

        public class a implements Runnable {

            /* JADX INFO: renamed from: com.dasnano.vdvideoselfiecapture.fragments.VideoFragment$d$a$a, reason: collision with other inner class name */
            public class RunnableC0187a implements Runnable {
                public RunnableC0187a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    VideoFragment videoFragment = VideoFragment.this;
                    VideoFragment.j(videoFragment, (videoFragment.f39755p1 / 1000) / 2);
                }
            }

            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                d dVar = d.this;
                boolean z10 = VideoFragment.this.f39731c1.get();
                VideoFragment videoFragment = VideoFragment.this;
                if (z10) {
                    videoFragment.u(null);
                    videoFragment.setVideoState(VideoState.VIDEO_SHOW_OBVERSE);
                    videoFragment.L0.postDelayed(videoFragment.R2, videoFragment.r1);
                } else {
                    videoFragment.setVideoState(VideoState.VIDEO_SHOW_DOCUMENT_NO_DETECTION);
                }
                videoFragment.R0.setText(HtmlCompat.fromHtml(videoFragment.H2, 0));
                videoFragment.R0.setBackgroundColor(videoFragment.f39730b2);
                if (videoFragment.I1) {
                    videoFragment.E();
                    videoFragment.f39740h1.setDocumentOrFaceRectangle(-1, videoFragment.f39736f1, DocumentRectangleOrFace.typesDrawables.ROUNDED_RECTANGLE, videoFragment.P0, videoFragment.getActivity());
                    videoFragment.f39744j1.setX(videoFragment.A(30) + videoFragment.f39736f1.left);
                    videoFragment.f39744j1.setY(videoFragment.A(15) + videoFragment.f39736f1.bottom);
                    videoFragment.f39744j1.setText(HtmlCompat.fromHtml(videoFragment.f39747k2, 0));
                    videoFragment.f39744j1.setVisibility(0);
                    VideoFragment.d(videoFragment, videoFragment.F2, videoFragment.f39736f1);
                    videoFragment.t(VideoFragment.V2);
                    if (!videoFragment.f39731c1.get()) {
                        videoFragment.f39748l1.setY((videoFragment.f39736f1.centerY() - (videoFragment.f39736f1.height() / 2)) - 20);
                        videoFragment.f39754o1.postDelayed(new RunnableC0187a(), 0L);
                    }
                }
                videoFragment.V0.setRect(0, videoFragment.f39738g1, videoFragment.P0, videoFragment.getActivity());
                videoFragment.u(null);
                if (videoFragment.R1) {
                    videoFragment.runOnUiThread(new com.dasnano.vdvideoselfiecapture.fragments.k(videoFragment));
                }
                try {
                    MediaPlayer mediaPlayer = videoFragment.U0;
                    if (mediaPlayer != null) {
                        mediaPlayer.start();
                    }
                } catch (Exception e5) {
                    String str = VideoFragment.VIDEO_FRAGMENT_VIDEO_CAPTURED;
                    Log.e("VideoFragment", "Error playing sound: " + e5.getMessage(), e5);
                }
                VideoFragment.c(videoFragment, false);
            }
        }

        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            VideoFragment.this.runOnUiThread(new a());
        }
    }

    public class e implements Runnable {

        public class a implements Runnable {

            /* JADX INFO: renamed from: com.dasnano.vdvideoselfiecapture.fragments.VideoFragment$e$a$a, reason: collision with other inner class name */
            public class RunnableC0188a implements Runnable {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ int f39786p0;

                public RunnableC0188a(int i10) {
                    this.f39786p0 = i10;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    VideoFragment.j(VideoFragment.this, (this.f39786p0 / 1000) / 2);
                }
            }

            public class b implements Runnable {
                public b() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = a.this;
                    VideoFragment.this.setVideoState(VideoState.VIDEO_RECORDED);
                    VideoFragment.this.y();
                    VideoFragment.this.v(null);
                    VideoFragment.this.Y0.set(0);
                    VideoFragment.l(VideoFragment.this);
                    VideoFragment.h(VideoFragment.this);
                }
            }

            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zIsPassport = Document.isPassport(VideoFragment.V2);
                e eVar = e.this;
                if (zIsPassport) {
                    VideoFragment videoFragment = VideoFragment.this;
                    videoFragment.R0.setText(HtmlCompat.fromHtml(videoFragment.I2, 0));
                } else {
                    boolean zX = VideoFragment.this.x();
                    VideoFragment videoFragment2 = VideoFragment.this;
                    if (zX) {
                        videoFragment2.R0.setText(HtmlCompat.fromHtml(videoFragment2.J2, 0));
                    } else {
                        videoFragment2.R0.setText(HtmlCompat.fromHtml(videoFragment2.H2, 0));
                    }
                }
                VideoFragment videoFragment3 = VideoFragment.this;
                videoFragment3.R0.setBackgroundColor(videoFragment3.f39732c2);
                VideoFragment videoFragment4 = VideoFragment.this;
                if (videoFragment4.I1) {
                    videoFragment4.E();
                    if (!zIsPassport && videoFragment4.x()) {
                        videoFragment4.f39744j1.setText(HtmlCompat.fromHtml(videoFragment4.f39749l2, 0));
                        videoFragment4.f39744j1.setVisibility(0);
                        videoFragment4.f39744j1.setX(videoFragment4.A(30) + videoFragment4.f39736f1.left);
                        videoFragment4.f39744j1.setY(videoFragment4.A(10) + videoFragment4.f39736f1.bottom);
                    }
                    videoFragment4.f39740h1.setDocumentOrFaceRectangle(-1, videoFragment4.f39736f1, DocumentRectangleOrFace.typesDrawables.ROUNDED_RECTANGLE, videoFragment4.P0, videoFragment4.getActivity());
                    String str = VideoFragment.V2;
                    if (videoFragment4.isRunning.get()) {
                        videoFragment4.runOnUiThread(new com.dasnano.vdvideoselfiecapture.fragments.g(videoFragment4, str));
                    }
                }
                if (videoFragment4.R1) {
                    videoFragment4.runOnUiThread(new com.dasnano.vdvideoselfiecapture.fragments.k(videoFragment4));
                }
                try {
                    MediaPlayer mediaPlayer = videoFragment4.U0;
                    if (mediaPlayer != null) {
                        mediaPlayer.start();
                    }
                } catch (Exception e5) {
                    String str2 = VideoFragment.VIDEO_FRAGMENT_VIDEO_CAPTURED;
                    Log.e("VideoFragment", "Error playing sound: " + e5.getMessage(), e5);
                }
                if (zIsPassport || !videoFragment4.x()) {
                    VideoFragment.c(videoFragment4, false);
                    videoFragment4.V0.setRect(0, videoFragment4.f39738g1, videoFragment4.P0, videoFragment4.getActivity());
                    videoFragment4.setVideoState(VideoState.VIDEO_SHOW_DOCUMENT_NO_DETECTION);
                    videoFragment4.u(null);
                } else {
                    VideoFragment.c(videoFragment4, true);
                }
                if (videoFragment4.f39731c1.get()) {
                    return;
                }
                int i10 = videoFragment4.f39757q1;
                if (zIsPassport || !videoFragment4.x()) {
                    i10 = videoFragment4.f39755p1;
                }
                videoFragment4.f39748l1.setY((videoFragment4.f39736f1.centerY() - (videoFragment4.f39736f1.height() / 2)) - 20);
                videoFragment4.f39754o1.postDelayed(new RunnableC0188a(i10), 1000L);
                new Handler().postDelayed(new b(), i10);
            }
        }

        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            VideoFragment.this.runOnUiThread(new a());
        }
    }

    public class f implements ILibraryLogger {
        @Override // com.veridas.log.ILibraryLogger
        public final void log(@NonNull String str, @NonNull String str2) {
            VDLogger.log(str, str2);
        }
    }

    public class g implements Runnable {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                g gVar = g.this;
                VideoState videoState = VideoFragment.this.getVideoState();
                if (videoState == VideoState.VIDEO_SHOW_OBVERSE || videoState == VideoState.VIDEO_SHOW_REVERSE) {
                    VideoState videoState2 = VideoState.VIDEO_SHOW_REVERSE;
                    VideoFragment videoFragment = VideoFragment.this;
                    if (videoState != videoState2 || videoFragment.Y0.get() < videoFragment.Z0.get() * videoFragment.f39727a1) {
                        if (videoFragment.Y0.get() <= 2) {
                            VideoFragment.k(videoFragment);
                            return;
                        }
                        videoFragment.Y0.decrementAndGet();
                        videoFragment.L0.removeCallbacksAndMessages(videoFragment.R2);
                        videoFragment.L0.postDelayed(videoFragment.R2, 3000L);
                        return;
                    }
                    videoFragment.L0.removeCallbacksAndMessages(videoFragment.S2);
                    videoFragment.setVideoState(VideoState.VIDEO_RECORDED);
                    videoFragment.y();
                    videoFragment.v(null);
                    videoFragment.Y0.set(0);
                    VideoFragment.l(videoFragment);
                    VideoFragment.h(videoFragment);
                }
            }
        }

        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            VideoFragment.this.runOnUiThread(new a());
        }
    }

    public class h implements Runnable {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                h hVar = h.this;
                VideoState videoState = VideoFragment.this.getVideoState();
                VideoFragment videoFragment = VideoFragment.this;
                videoFragment.L0.removeCallbacksAndMessages(null);
                VideoState videoState2 = VideoState.VIDEO_RECORDED;
                if (videoState == videoState2 || videoState == VideoState.VIDEO_CAMERA_RELEASE) {
                    return;
                }
                if (videoState == VideoState.VIDEO_SHOW_REVERSE && videoFragment.Y0.get() >= videoFragment.Z0.get() * videoFragment.f39727a1) {
                    videoFragment.setVideoState(videoState2);
                    videoFragment.y();
                    videoFragment.v(null);
                    videoFragment.Y0.set(0);
                    VideoFragment.l(videoFragment);
                    VideoFragment.h(videoFragment);
                    return;
                }
                videoFragment.u(null);
                videoFragment.v(null);
                videoFragment.setVideoState(VideoState.VIDEO_ERROR);
                videoFragment.f39754o1.removeCallbacksAndMessages(null);
                videoFragment.L0.removeCallbacksAndMessages(null);
                videoFragment.y();
                if (videoFragment.z()) {
                    ((DasCaptureFragment) videoFragment).camera.stopMediaRecorder(new z0.c(this));
                } else {
                    videoFragment.B();
                }
            }
        }

        public h() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            VideoFragment.this.runOnUiThread(new a());
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f39793p0;

        public i(String str) {
            this.f39793p0 = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            VideoFragment videoFragment = VideoFragment.this;
            String str = this.f39793p0;
            if (str == null || str.equalsIgnoreCase("")) {
                videoFragment.f39734e1.setImageBitmap(null);
                videoFragment.f39734e1.requestLayout();
                return;
            }
            Document documentById = videoFragment.getBlockingResourcesDatabaseLazy().getDocumentById(str);
            Bitmap bitmapBytesToBitmap = documentById != null ? AndroidResourcesUtil.bytesToBitmap(videoFragment.getBlockingResourcesDatabaseLazy().getObverseStencilBytes(documentById.getId())) : null;
            if (bitmapBytesToBitmap == null) {
                videoFragment.f39734e1.setImageBitmap(null);
                videoFragment.f39734e1.requestLayout();
                return;
            }
            int width = bitmapBytesToBitmap.getWidth();
            int height = bitmapBytesToBitmap.getHeight();
            float fWidth = videoFragment.f39736f1.width() / width;
            float fHeight = videoFragment.f39736f1.height() / height;
            Matrix matrix = new Matrix();
            matrix.preScale(-1.0f, 1.0f);
            matrix.postScale(fWidth, fHeight);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapBytesToBitmap, 0, 0, width, height, matrix, true);
            videoFragment.f39734e1.setX(videoFragment.f39736f1.left);
            videoFragment.f39734e1.setY(videoFragment.f39736f1.top);
            videoFragment.f39734e1.setImageBitmap(bitmapCreateBitmap);
            videoFragment.f39734e1.requestLayout();
        }
    }

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str = VideoFragment.VIDEO_FRAGMENT_VIDEO_CAPTURED;
            VideoFragment videoFragment = VideoFragment.this;
            videoFragment.u(null);
            videoFragment.v(null);
        }
    }

    public class k implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f39796p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Rectangle f39797q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ com.veridas.math.geometry.Matrix f39798r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Point f39799s0;

        public k(boolean z10, Rectangle rectangle, com.veridas.math.geometry.Matrix matrix, Point point) {
            this.f39796p0 = z10;
            this.f39797q0 = rectangle;
            this.f39798r0 = matrix;
            this.f39799s0 = point;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10 = this.f39796p0;
            VideoFragment videoFragment = VideoFragment.this;
            if (z10) {
                videoFragment.faceLost();
            }
            Rectangle rectangle = this.f39797q0;
            if (rectangle.isEmpty()) {
                VDLogger.log(Logger.Tag.ON_PREVIEW_FRAME, "Face not detected");
                String str = VideoFragment.VIDEO_FRAGMENT_VIDEO_CAPTURED;
                videoFragment.u(null);
            } else {
                VDLogger.log(Logger.Tag.ON_PREVIEW_FRAME, "Face detected");
                Rect rect = rectangle.times(this.f39798r0.inverse()).toRect();
                int i10 = this.f39799s0.x;
                Rect rect2 = new Rect(i10 - rect.right, rect.top, i10 - rect.left, rect.bottom);
                String str2 = VideoFragment.VIDEO_FRAGMENT_VIDEO_CAPTURED;
                videoFragment.u(rect2);
            }
        }
    }

    public class l implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Rectangle f39801p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ VideoState f39802q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ com.veridas.math.geometry.Matrix f39803r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Point f39804s0;

        public l(Rectangle rectangle, VideoState videoState, com.veridas.math.geometry.Matrix matrix, Point point) {
            this.f39801p0 = rectangle;
            this.f39802q0 = videoState;
            this.f39803r0 = matrix;
            this.f39804s0 = point;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Rectangle rectangle = this.f39801p0;
            boolean zIsNotEmpty = rectangle.isNotEmpty();
            VideoState videoState = this.f39802q0;
            VideoFragment videoFragment = VideoFragment.this;
            if (!zIsNotEmpty || videoFragment.f39729b1.get()) {
                VDLogger.log(Logger.Tag.ON_PREVIEW_FRAME, "Document not detected with progress: %f, and state: %s", Float.valueOf(videoFragment.Y0.get() / videoFragment.Z0.get()), videoState);
                videoFragment.v(null);
                return;
            }
            int iIncrementAndGet = videoFragment.Y0.incrementAndGet();
            int i10 = videoFragment.Z0.get();
            VDLogger.log(Logger.Tag.ON_PREVIEW_FRAME, "Document detected with progress: %f, and state: %s", Float.valueOf(iIncrementAndGet / i10), videoState);
            if (iIncrementAndGet < i10) {
                Rect rect = rectangle.times(this.f39803r0.inverse()).toRect();
                int i11 = this.f39804s0.x;
                videoFragment.v(new Rect(i11 - rect.right, rect.top, i11 - rect.left, rect.bottom));
                return;
            }
            videoFragment.Y0.set(0);
            videoFragment.y();
            videoFragment.v(null);
            videoFragment.f39769x1.setVisibility(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, videoFragment.T1);
            alphaAnimation.setDuration(1250L);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setAnimationListener(new com.dasnano.vdvideoselfiecapture.fragments.i(videoFragment));
            videoFragment.f39769x1.startAnimation(alphaAnimation);
            videoFragment.L0.removeCallbacks(videoFragment.R2);
            if (((long) videoFragment.f39764u1) - (System.currentTimeMillis() - videoFragment.J0) < videoFragment.f39760s1) {
                videoFragment.L0.removeCallbacks(videoFragment.S2);
                videoFragment.L0.postDelayed(videoFragment.S2, videoFragment.f39760s1);
            }
            videoFragment.L0.postDelayed(videoFragment.R2, videoFragment.f39760s1 + 1000);
            videoFragment.L0.postDelayed(videoFragment.Q2, 1000L);
            videoFragment.setVideoState(VideoState.VIDEO_SHOW_REVERSE);
        }
    }

    public class m implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Rectangle f39806p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ VideoState f39807q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ com.veridas.math.geometry.Matrix f39808r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Point f39809s0;

        public m(Rectangle rectangle, VideoState videoState, com.veridas.math.geometry.Matrix matrix, Point point) {
            this.f39806p0 = rectangle;
            this.f39807q0 = videoState;
            this.f39808r0 = matrix;
            this.f39809s0 = point;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Rectangle rectangle = this.f39806p0;
            boolean zIsNotEmpty = rectangle.isNotEmpty();
            VideoState videoState = this.f39807q0;
            VideoFragment videoFragment = VideoFragment.this;
            if (!zIsNotEmpty || videoFragment.f39729b1.get()) {
                VDLogger.log(Logger.Tag.ON_PREVIEW_FRAME, "Document not detected with progress: %f, and state: %s", Float.valueOf(videoFragment.Y0.get() / videoFragment.Z0.get()), videoState);
                videoFragment.v(null);
                return;
            }
            videoFragment.Y0.incrementAndGet();
            VDLogger.log(Logger.Tag.ON_PREVIEW_FRAME, "Document detected with progress: %f, and state: %s", Float.valueOf(videoFragment.Y0.get() / videoFragment.Z0.get()), videoState);
            Rect rect = rectangle.times(this.f39808r0.inverse()).toRect();
            int i10 = this.f39809s0.x;
            videoFragment.v(new Rect(i10 - rect.right, rect.top, i10 - rect.left, rect.bottom));
            if (videoFragment.Y0.get() >= videoFragment.Z0.get()) {
                videoFragment.setVideoState(VideoState.VIDEO_RECORDED);
                videoFragment.y();
                videoFragment.v(null);
                videoFragment.Y0.set(0);
                VideoFragment.l(videoFragment);
                VideoFragment.h(videoFragment);
            }
        }
    }

    public class n extends CapturePermissionAdapter {
        @Override // com.veridas.fragment.permission.CapturePermissionAdapter, com.veridas.fragment.permission.CapturePermissionListener
        public final void onCapturePermissionDenied(Object obj, String str) {
            VDLogger.log(Logger.Tag.PERMISSION, "Permission: %s: false", str);
        }

        @Override // com.veridas.fragment.permission.CapturePermissionAdapter, com.veridas.fragment.permission.CapturePermissionListener
        public final void onCapturePermissionGranted(Object obj, String str) {
            VDLogger.log(Logger.Tag.PERMISSION, "Permission: %s: true", str);
        }

        @Override // com.veridas.fragment.permission.CapturePermissionAdapter, com.veridas.fragment.permission.CapturePermissionListener
        public final void onCapturePermissionsIncomplete(Object obj) {
            VDLogger.log(Logger.Tag.PERMISSION, "Some permissions have not been accepted");
        }
    }

    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            VideoFragment videoFragment = VideoFragment.this;
            View view = videoFragment.T0;
            if (view == null || videoFragment.R0 == null || videoFragment.S0 == null) {
                return;
            }
            view.clearAnimation();
            videoFragment.R0.clearAnimation();
            videoFragment.S0.clearAnimation();
            videoFragment.T0.setVisibility(8);
            videoFragment.R0.setVisibility(8);
            videoFragment.S0.setVisibility(8);
            videoFragment.f39744j1.setVisibility(8);
        }
    }

    public class p implements Runnable {
        public p() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            VideoFragment videoFragment = VideoFragment.this;
            VideoState videoState = videoFragment.getVideoState();
            if (videoState == VideoState.VIDEO_SEARCHING_FACE) {
                VDLogger.log(Logger.Tag.ERROR_FACE, "Face lost in state: %s", videoState.name());
                videoFragment.setVideoState(VideoState.VIDEO_ERROR);
                videoFragment.u(null);
                videoFragment.L0.removeCallbacksAndMessages(null);
                videoFragment.L0.removeCallbacksAndMessages(null);
                videoFragment.y();
                if (videoFragment.z()) {
                    ((DasCaptureFragment) videoFragment).camera.stopMediaRecorder(new y(this));
                    return;
                }
                videoFragment.B();
                String str = videoFragment.f39751m2;
                String str2 = videoFragment.f39753n2;
                VDLogger.log(Logger.Tag.ERROR_TIMEOUT, "User has reached max time available");
                videoFragment.runOnUiThread(new com.dasnano.vdvideoselfiecapture.fragments.d(videoFragment, str2, str));
            }
        }
    }

    public class q extends CapturePermissionDialogAdapter {
        public q() {
        }

        @Override // com.veridas.fragment.permission.CapturePermissionDialogAdapter, com.veridas.fragment.permission.CapturePermissionDialogListener
        public final void onCapturePermissionsShow(AlertDialog alertDialog) {
            Button button = alertDialog.getButton(-1);
            VideoFragment videoFragment = VideoFragment.this;
            int i10 = videoFragment.f39765v1;
            if (button != null) {
                button.setTextColor(i10);
            }
            Button button2 = alertDialog.getButton(-2);
            int i11 = videoFragment.f39765v1;
            if (button2 != null) {
                button2.setTextColor(i11);
            }
        }

        @Override // com.veridas.fragment.permission.CapturePermissionDialogAdapter, com.veridas.fragment.permission.CapturePermissionDialogListener
        public final void onClickCapturePermissionsDenied(AlertDialog alertDialog) {
            VDLogger.log(Logger.Tag.PERMISSION, "Permission rationale: false");
            String str = VideoFragment.VIDEO_FRAGMENT_VIDEO_CAPTURED;
            VideoFragment.this.q(false);
        }
    }

    public class r extends FragmentLifecycleAdapter {
        public r() {
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onBeforeCreated(DasFragment dasFragment, Bundle bundle) {
            VideoFragment videoFragment = VideoFragment.this;
            videoFragment.f39773z1 = videoFragment.getDisplaySize();
            VideoFragment videoFragment2 = VideoFragment.this;
            videoFragment2.f39765v1 = videoFragment2.getResources().getColor(R.color.vd_video_dialogButton);
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onCreated(DasFragment dasFragment, Bundle bundle) {
            VideoFragment.f(VideoFragment.this);
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onDestroyed(DasFragment dasFragment) {
            VideoFragment.this.destroyed();
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onPaused(DasFragment dasFragment) {
            VideoFragment.i(VideoFragment.this);
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onResumed(DasFragment dasFragment) {
            VideoFragment videoFragment = VideoFragment.this;
            String str = VideoFragment.VIDEO_FRAGMENT_VIDEO_CAPTURED;
            videoFragment.getClass();
            VDLogger.log(Logger.Tag.ON_RESUME, "On resumed called in: %s", "VideoFragment");
            int i10 = videoFragment.f39773z1.x / 13;
            if (videoFragment.f39767w1) {
                int width = (videoFragment.f39750m1.getWidth() / 2) + i10;
                ((ViewGroup.MarginLayoutParams) videoFragment.f39750m1.getLayoutParams()).setMargins(width, 0, 0, 0);
                ((ViewGroup.MarginLayoutParams) videoFragment.f39752n1.getLayoutParams()).setMargins(0, 0, width, 0);
            }
            videoFragment.setVideoState(VideoState.VIDEO_CALCULATING_FPS);
            if (VideoFragment.V2.equalsIgnoreCase("")) {
                videoFragment.f39731c1.set(false);
            } else {
                videoFragment.X0 = videoFragment.getBlockingResourcesDatabaseLazy().getDocumentById(VideoFragment.V2);
            }
            if (videoFragment.f39731c1.get()) {
                videoFragment.D(4);
            }
            videoFragment.F();
            videoFragment.y();
            try {
                videoFragment.U0 = MediaPlayer.create(videoFragment.getActivity(), R.raw.vd_video_notification);
            } catch (Exception e5) {
                Log.e("VideoFragment", "Error creating mediaplayer.", e5);
            }
            videoFragment.isRunning.set(true);
        }
    }

    public class s extends CameraAdapter {

        public class a implements CameraAction {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Camera f39816p0;

            public a(Camera camera) {
                this.f39816p0 = camera;
            }

            @Override // com.veridas.camera.CameraAction
            public final void execute(boolean z10) {
                if (z10) {
                    this.f39816p0.requestFrame();
                }
            }
        }

        public class b implements CameraAction {

            public class a implements Runnable {
                public a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    b bVar = b.this;
                    VideoFragment.this.f39733d1.requestLayout();
                    VideoFragment videoFragment = VideoFragment.this;
                    if (videoFragment.Q1) {
                        videoFragment.s().show();
                    } else {
                        videoFragment.G();
                    }
                }
            }

            public b() {
            }

            @Override // com.veridas.camera.CameraAction
            public final void execute(boolean z10) {
                s sVar = s.this;
                VideoFragment videoFragment = VideoFragment.this;
                String str = VideoFragment.VIDEO_FRAGMENT_VIDEO_CAPTURED;
                videoFragment.F();
                VideoFragment.this.runOnUiThread(new a());
            }
        }

        public s() {
        }

        @Override // com.veridas.camera.CameraAdapter, com.veridas.camera.CameraListener
        public final void onMediaRecorderInitialized(Camera camera, MediaRecorder mediaRecorder) {
            camera.startMediaRecorder(new a(camera));
        }

        @Override // com.veridas.camera.CameraAdapter, com.veridas.camera.CameraListener
        public final void onParametersChanged(Camera camera) {
            int i10;
            CameraProperties properties = camera.getProperties();
            Resolution previewResolution = properties.getPreviewResolution();
            Resolution videoResolution = properties.getVideoResolution();
            int i11 = 4;
            VDLogger.log(Logger.Tag.OPEN_CAMERA, "Preview size: %dx%d; Capture size: %dx%d", Integer.valueOf(previewResolution.width), Integer.valueOf(previewResolution.height), Integer.valueOf(videoResolution.width), Integer.valueOf(videoResolution.height));
            VideoFragment videoFragment = VideoFragment.this;
            String str = VideoFragment.VIDEO_FRAGMENT_VIDEO_CAPTURED;
            videoFragment.r();
            VideoFragment videoFragment2 = VideoFragment.this;
            Point correctedDisplaySize = videoFragment2.getCorrectedDisplaySize();
            Document document = videoFragment2.X0;
            double aspectRatio = document != null ? document.getAspectRatio() : 1.56d;
            if (correctedDisplaySize == null) {
                return;
            }
            float f6 = (correctedDisplaySize.y - videoFragment2.f39773z1.y) / 2.0f;
            float f10 = (correctedDisplaySize.x - videoFragment2.f39773z1.x) / 2.0f;
            int i12 = videoFragment2.f39773z1.x;
            int i13 = videoFragment2.f39773z1.y;
            int i14 = i12 / 2;
            int i15 = i13 / 2;
            if (videoFragment2.f39767w1) {
                int i16 = videoFragment2.f39773z1.y;
                videoFragment2.P0 = i16;
                i10 = i16 / 9;
                i11 = 5;
            } else {
                int i17 = videoFragment2.f39773z1.x;
                videoFragment2.P0 = i17;
                i10 = i17 / 6;
            }
            if (videoFragment2.E1) {
                int i18 = (int) (((double) (videoFragment2.f39767w1 ? videoFragment2.f39773z1.y : videoFragment2.f39773z1.x)) * 0.09d);
                FragmentActivity activity = videoFragment2.getActivity();
                ImageButton imageButton = new ImageButton(videoFragment2.getActivity());
                videoFragment2.f39742i1 = imageButton;
                imageButton.setLayoutParams(new RelativeLayout.LayoutParams(i18, i18));
                Resources resources = videoFragment2.getActivity().getResources();
                Bitmap bitmapDecodeResource = videoFragment2.S1 ? BitmapFactory.decodeResource(resources, resources.getIdentifier(videoFragment2.f39739g2, PluginUtils.IDENTIFIER_DRAWABLE, activity.getPackageName())) : BitmapFactory.decodeResource(resources, R.drawable.vd_video_close_button);
                int width = bitmapDecodeResource.getWidth();
                int height = bitmapDecodeResource.getHeight();
                float f11 = videoFragment2.f39742i1.getLayoutParams().width / width;
                float f12 = videoFragment2.f39742i1.getLayoutParams().height / height;
                Matrix matrix = new Matrix();
                matrix.postScale(f11, f12);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeResource, 0, 0, width, height, matrix, true);
                videoFragment2.f39742i1.setBackgroundColor(0);
                videoFragment2.f39742i1.setImageBitmap(bitmapCreateBitmap);
                float f13 = (float) (((double) i18) * 0.2d);
                videoFragment2.f39742i1.setX(f13);
                videoFragment2.f39742i1.setY(f13);
                videoFragment2.f39742i1.setOnClickListener(new com.dasnano.vdvideoselfiecapture.fragments.p(videoFragment2));
                float f14 = (float) (((double) videoFragment2.P0) * 0.09d * 0.3d);
                videoFragment2.f39742i1.setX(f14 + f10);
                videoFragment2.f39742i1.setY(f14 + f6);
                videoFragment2.R0.setTextSize(2, 18.0f);
                if (videoFragment2.F2.equals("top")) {
                    videoFragment2.f39742i1.post(new com.dasnano.vdvideoselfiecapture.fragments.j(videoFragment2));
                }
                ((RelativeLayout) videoFragment2.f39733d1).addView(videoFragment2.f39742i1);
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) videoFragment2.S0.getLayoutParams();
            int i19 = (int) f10;
            int iA = videoFragment2.A(10) + i19;
            layoutParams.leftMargin = iA;
            layoutParams.rightMargin = iA;
            videoFragment2.S0.setLayoutParams(layoutParams);
            int i20 = i10 * i11;
            int i21 = (int) (i20 / videoFragment2.W0);
            int i22 = (i14 + i19) - (i20 / 2);
            int i23 = (int) f6;
            int i24 = (i15 + i23) - (i21 / 2);
            videoFragment2.f39738g1 = new Rect(i22, i24, i20 + i22, i21 + i24);
            int i25 = (int) (0.85f * videoFragment2.P0);
            int i26 = (int) (((double) i25) / aspectRatio);
            int iA2 = androidx.appcompat.widget.a.a(i12, i25, 2, i19);
            int iA3 = androidx.appcompat.widget.a.a(i13, i26, 2, i23);
            videoFragment2.f39736f1 = new Rect(iA2, iA3, i25 + iA2, i26 + iA3);
            videoFragment2.E();
            FragmentActivity activity2 = videoFragment2.getActivity();
            videoFragment2.f39740h1.setDocumentOrFaceRectangle(0, videoFragment2.f39736f1, DocumentRectangleOrFace.typesDrawables.ROUNDED_RECTANGLE, videoFragment2.P0, activity2);
            videoFragment2.t(null);
            videoFragment2.V0.setRect(0, videoFragment2.f39738g1, videoFragment2.P0, activity2);
            videoFragment2.f39733d1.invalidate();
            if (videoFragment2.M0 != null) {
                videoFragment2.u(null);
            }
        }

        @Override // com.veridas.camera.CameraAdapter, com.veridas.camera.CameraListener
        public final void onPreviewReady(Camera camera, Picture picture) {
            String str = VideoFragment.VIDEO_FRAGMENT_VIDEO_CAPTURED;
            VideoFragment videoFragment = VideoFragment.this;
            videoFragment.getClass();
            try {
                VideoState videoState = videoFragment.getVideoState();
                if (videoFragment.isRunning.get() && camera.isRecording() && !VideoFragment.U2.contains(videoState)) {
                    videoFragment.H(picture, videoState);
                    camera.recycle(picture);
                    camera.requestFrame();
                }
            } catch (RuntimeException e5) {
                Log.e("VideoFragment", e5);
            }
        }

        @Override // com.veridas.camera.CameraAdapter, com.veridas.camera.CameraListener
        public final void onStarted(Camera camera) {
            List<Parameter.FocusMode> listAsList = Arrays.asList(Parameter.FocusMode.CONTINUOUS_PICTURE, Parameter.FocusMode.AUTO, Parameter.FocusMode.FIXED, Parameter.FocusMode.INFINITY);
            DefaultCaptureResolutionSelectionStrategy defaultCaptureResolutionSelectionStrategy = new DefaultCaptureResolutionSelectionStrategy();
            DefaultPreviewResolutionSelectionStrategy defaultPreviewResolutionSelectionStrategy = new DefaultPreviewResolutionSelectionStrategy();
            camera.setPreviewMode(Camera.PreviewMode.PULL);
            camera.createParametersBuilder().setCaptureResolutionSelectionStrategy(defaultCaptureResolutionSelectionStrategy).setColorEffectMode(Parameter.ColorEffectMode.NONE).setFocusMode(listAsList).setSceneMode(Parameter.SceneMode.AUTO).setPreferredCaptureResolution(Resolution.HD_169).setCaptureMode(Parameter.CaptureMode.VIDEO).setPreferredPreviewResolution(Resolution.OPTIMAL_ASPECT_RATIO).setPreviewResolutionSelectionStrategy(defaultPreviewResolutionSelectionStrategy).setMeteringArea(new MeteringArea(-200, -200, 400, 400, 1000)).setWhiteBalanceMode(Parameter.WhiteBalanceMode.AUTO).build().apply(new b());
        }
    }

    static {
        Object[] objArr = {VideoState.VIDEO_CAMERA_RELEASE, VideoState.VIDEO_ERROR, VideoState.VIDEO_RECORDED};
        ArrayList arrayList = new ArrayList(3);
        for (int i10 = 0; i10 < 3; i10++) {
            Object obj = objArr[i10];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        U2 = Collections.unmodifiableList(arrayList);
        V2 = "";
    }

    public VideoFragment() {
        addLifecycleListener(new r());
    }

    public static SequentialDetectionResult C(ObjectDetector objectDetector, Request request) {
        try {
            return (SequentialDetectionResult) objectDetector.request(request);
        } catch (Exception e5) {
            Log.e("VideoFragment", e5);
            return null;
        }
    }

    public static void c(VideoFragment videoFragment, boolean z10) {
        int i10;
        VideoState videoState = videoFragment.getVideoState();
        if (videoState == VideoState.VIDEO_SHOW_OBVERSE) {
            i10 = videoFragment.f39730b2;
        } else {
            i10 = videoState == VideoState.VIDEO_SHOW_REVERSE ? videoFragment.f39732c2 : videoFragment.Z1;
        }
        if (z10 && videoFragment.I1) {
            videoFragment.f39740h1.setCameraDistance(videoFragment.getActivity().getResources().getDisplayMetrics().density * 1920.0f);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(videoFragment.f39740h1, "rotationY", 0.0f, 180.0f);
            objectAnimatorOfFloat.setDuration(TooltipKt.TooltipDuration);
            objectAnimatorOfFloat.start();
        }
        o(videoFragment.R0, videoFragment.f39735e2, i10);
        o(videoFragment.T0, videoFragment.f39735e2, videoFragment.f39728a2);
        o(videoFragment.f39744j1, videoFragment.f39735e2, videoFragment.d2);
    }

    public static void d(VideoFragment videoFragment, String str, Rect rect) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) videoFragment.S0.getLayoutParams();
        int[] rules = layoutParams.getRules();
        if (str.equals("top")) {
            rules[12] = 0;
            rules[13] = 0;
            layoutParams.addRule(10);
        } else if (str.equals("center")) {
            rules[12] = 0;
            rules[10] = 0;
            layoutParams.addRule(13);
        } else if (str.equals(VDVideoSelfieConfiguration.DOCUMENT_CENTER)) {
            rules[12] = 0;
            rules[10] = 0;
            rules[14] = 1;
            layoutParams.topMargin = ((rect.height() / 2) + rect.top) - (layoutParams.height / 2);
            layoutParams.width = rect.width() - (rect.width() / 5);
        } else {
            rules[10] = 0;
            rules[13] = 0;
            layoutParams.addRule(12);
        }
        videoFragment.S0.setLayoutParams(layoutParams);
    }

    public static Dialog e(final VideoFragment videoFragment, String str, String str2) {
        return videoFragment.dialogRegistry.createAlertDialogBuilder().createAlertDialog().context(videoFragment.requireActivity()).style(videoFragment.f39737f2).fallbackThemeId(R.style.VeridasDialog).title(str).message(str2).cancelable(false).positiveButtonClickButtonListener(new DialogInterface.OnClickListener() { // from class: com.dasnano.vdvideoselfiecapture.fragments.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                VideoFragment videoFragment2 = this.f39827p0;
                videoFragment2.f39729b1.set(false);
                if (videoFragment2.Q1) {
                    videoFragment2.s().show();
                    return;
                }
                videoFragment2.V0.setVisibility(8);
                videoFragment2.f39740h1.setVisibility(8);
                videoFragment2.f39744j1.setVisibility(8);
                videoFragment2.G();
            }
        }).positiveButtonText(videoFragment.B2).positiveButtonTextColor(videoFragment.f39765v1).build();
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [com.veridas.config.Configuration] */
    public static void f(VideoFragment videoFragment) {
        ?? configuration = videoFragment.getConfiguration();
        try {
            videoFragment.T1 = configuration.getFloat(VDVideoSelfieConfiguration.CAPTURED_BACKGROUND_ALPHA);
            videoFragment.f39741h2 = configuration.getString(VDVideoSelfieConfiguration.CAPTURED_LABEL_ICON);
            videoFragment.f39743i2 = configuration.getString(VDVideoSelfieConfiguration.CAPTURED_LABEL_POSITION);
            videoFragment.f39745j2 = configuration.getString(VDVideoSelfieConfiguration.CAPTURED_LABEL_TEXT);
            videoFragment.f39739g2 = configuration.getString("closebuttonimage");
            videoFragment.U1 = configuration.getColor(VDVideoSelfieConfiguration.DOCUMENT_LABEL_TEXT_BACKGROUND_COLOR);
            videoFragment.V1 = configuration.getColor(VDVideoSelfieConfiguration.DOCUMENT_MOBILE_OVAL_COLOR);
            videoFragment.f39747k2 = configuration.getString(VDVideoSelfieConfiguration.DOCUMENT_OBVERSE_LABEL_TEXT);
            videoFragment.f39749l2 = configuration.getString(VDVideoSelfieConfiguration.DOCUMENT_REVERSE_LABEL_TEXT);
            videoFragment.W1 = configuration.getColor("tickcolor");
            videoFragment.X1 = configuration.getColor("tickcirclecolor");
            videoFragment.Y1 = configuration.getColor(VDVideoSelfieConfiguration.FACE_MOBILE_OVAL_COLOR);
            videoFragment.f39751m2 = configuration.getString(VDVideoSelfieConfiguration.FACE_NOT_FOUND_ERROR);
            videoFragment.f39753n2 = configuration.getString(VDVideoSelfieConfiguration.FACE_NOT_FOUND_ERROR_TITLE);
            videoFragment.o2 = configuration.getString(VDVideoSelfieConfiguration.FINAL_ERROR);
            videoFragment.f39756p2 = configuration.getString(VDVideoSelfieConfiguration.FINAL_ERROR_TITLE);
            videoFragment.f39758q2 = configuration.getString(VDVideoSelfieConfiguration.FIXED_RECTANGLE_POSITION);
            videoFragment.D1 = !configuration.getString(VDVideoSelfieConfiguration.CAPTURED_LABEL_ICON).equalsIgnoreCase("undefined");
            videoFragment.E1 = configuration.getBoolean("closebutton");
            videoFragment.F1 = configuration.getBoolean(VDVideoSelfieConfiguration.DOCUMENT_MOBILE_OVAL);
            videoFragment.G1 = configuration.getBoolean(VDVideoSelfieConfiguration.FACE_MOBILE_OVAL);
            videoFragment.H1 = configuration.getBoolean("fixedoval");
            videoFragment.I1 = configuration.getBoolean("fixedrectangle");
            videoFragment.J1 = configuration.getBoolean(VDVideoSelfieConfiguration.META_DATA_TOKEN);
            videoFragment.K1 = configuration.getBoolean(VDVideoSelfieConfiguration.META_DATA_DATE);
            videoFragment.L1 = configuration.getBoolean("faceshapeoval");
            configuration.getString(VDVideoSelfieConfiguration.IMAGE_QUALITY);
            videoFragment.f39759r2 = configuration.getString("infoalert");
            videoFragment.f39761s2 = configuration.getString(VDVideoSelfieConfiguration.INFO_ALERT_AUTHENTICATE_MODE);
            videoFragment.f39763t2 = configuration.getString("infoalertpass");
            videoFragment.u2 = configuration.getString("infoalerttitle");
            videoFragment.f39766v2 = configuration.getString(VDVideoSelfieConfiguration.INFO_ALERT_TITLE_AUTHENTICATE_MODE);
            videoFragment.f39768w2 = configuration.getString("infoalerttitlepass");
            videoFragment.Z1 = configuration.getColor(VDVideoSelfieConfiguration.VIDEO_INFORMATIVE_LABEL_BACKGROUND_COLOR);
            videoFragment.f39728a2 = configuration.getColor(VDVideoSelfieConfiguration.VIDEO_INFORMATIVE_LABEL_BORDER_COLOR);
            videoFragment.f39730b2 = configuration.getColor(VDVideoSelfieConfiguration.VIDEO_INFORMATIVE_LABEL_OBVERSE_BACKGROUND_COLOR);
            videoFragment.f39732c2 = configuration.getColor(VDVideoSelfieConfiguration.VIDEO_INFORMATIVE_LABEL_REVERSE_BACKGROUND_COLOR);
            videoFragment.M1 = configuration.getString(VDVideoSelfieConfiguration.LIFE_TYPE).equalsIgnoreCase("authentication");
            String string = configuration.getString("alertstyle");
            videoFragment.f39737f2 = string;
            videoFragment.N1 = !string.equalsIgnoreCase("white");
            videoFragment.O1 = configuration.getString(VDVideoSelfieConfiguration.LIFE_TYPE).equalsIgnoreCase(VDVideoSelfieConfiguration.ONBOARDING);
            videoFragment.d2 = configuration.getColor(VDVideoSelfieConfiguration.DOCUMENT_LABEL_TEXT_BACKGROUND_COLOR);
            videoFragment.f39770x2 = configuration.getString(VDVideoSelfieConfiguration.OBVERSE_NOT_FOUND_ERROR);
            videoFragment.f39772y2 = configuration.getString(VDVideoSelfieConfiguration.OBVERSE_NOT_FOUND_ERROR_TITLE);
            videoFragment.f39774z2 = configuration.getString("permissionrefused");
            videoFragment.A2 = configuration.getString("permissionrefusedtitle");
            videoFragment.B2 = configuration.getString(VDVideoSelfieConfiguration.POSITIVE_BUTTON_TITLE);
            videoFragment.P1 = configuration.getBoolean(VDVideoSelfieConfiguration.REVERSE_DETECTION);
            videoFragment.C2 = configuration.getString(VDVideoSelfieConfiguration.REVERSE_NOT_FOUND_ERROR);
            videoFragment.D2 = configuration.getString(VDVideoSelfieConfiguration.REVERSE_NOT_FOUND_ERROR_TITLE);
            videoFragment.S1 = !configuration.getString("closebuttonimage").equalsIgnoreCase("undefined");
            videoFragment.Q1 = configuration.getBoolean("infoalertshow");
            videoFragment.R1 = configuration.getBoolean(VDVideoSelfieConfiguration.VIDEO_INFORMATIVE_LABEL);
            videoFragment.E2 = configuration.getString("token");
            videoFragment.f39735e2 = configuration.getColor(VDVideoSelfieConfiguration.VIDEO_FLASHING_COLOR);
            videoFragment.F2 = configuration.getString(VDVideoSelfieConfiguration.VIDEO_INFORMATIVE_LABEL_POSITION);
            videoFragment.G2 = configuration.getString(VDVideoSelfieConfiguration.VIDEO_INFORMATIVE_TEXT1);
            videoFragment.H2 = configuration.getString(VDVideoSelfieConfiguration.VIDEO_INFORMATIVE_TEXT2);
            videoFragment.I2 = configuration.getString(VDVideoSelfieConfiguration.VIDEO_INFORMATIVE_TEXT2_PASS);
            videoFragment.J2 = configuration.getString(VDVideoSelfieConfiguration.VIDEO_INFORMATIVE_TEXT3);
            int integer = configuration.getInteger(VDVideoSelfieConfiguration.SECONDS_SHOWING_OBVERSE) * 1000;
            int i10 = WearableStatusCodes.TARGET_NODE_NOT_CONNECTED;
            if (integer < 4000) {
                integer = 4000;
            }
            videoFragment.f39755p1 = integer;
            int integer2 = configuration.getInteger(VDVideoSelfieConfiguration.SECONDS_SHOWING_REVERSE) * 1000;
            if (integer2 >= 4000) {
                i10 = integer2;
            }
            videoFragment.f39757q1 = i10;
            videoFragment.r1 = configuration.getInteger(VDVideoSelfieConfiguration.SECONDS_OBVERSE_NOTFOUND_ERROR) * 1000;
            videoFragment.f39760s1 = configuration.getInteger(VDVideoSelfieConfiguration.SECONDS_REVERSE_NOTFOUND_ERROR) * 1000;
            videoFragment.f39762t1 = configuration.getInteger(VDVideoSelfieConfiguration.SECONDS_SHOWING_FACE) * 1000;
            videoFragment.f39764u1 = configuration.getInteger(VDVideoSelfieConfiguration.SECONDS_VIDEO_TIMEOUT) * 1000;
        } catch (IllegalColorValueException | PropertyNameNotFoundException e5) {
            Log.e("VideoFragment", e5);
        }
        Context applicationContext = videoFragment.getActivity().getApplicationContext();
        videoFragment.addCapturePermissionListener(videoFragment.M2);
        videoFragment.f39767w1 = ((VDVideoSelfieViewModel) videoFragment.viewModel).getDisplayOrientation() == DisplayOrientation.LANDSCAPE;
        videoFragment.f39731c1.set(((VDVideoSelfieViewModel) videoFragment.viewModel).getSmartVideo().booleanValue());
        videoFragment.O0 = videoFragment.getActivity().getFilesDir() + "/DNSelfieRemovable.mp4";
        DefaultFaceDetectorFactory defaultFaceDetectorFactory = new DefaultFaceDetectorFactory(applicationContext, videoFragment.getBlockingResourcesDatabaseLazy());
        videoFragment.getClass();
        ObjectDetector<SequentialDetectionResult> objectDetectorCreateVideoFaceDetector = defaultFaceDetectorFactory.createVideoFaceDetector(applicationContext);
        videoFragment.A1 = objectDetectorCreateVideoFaceDetector;
        objectDetectorCreateVideoFaceDetector.initialize();
        String documentType = ((VDVideoSelfieViewModel) videoFragment.viewModel).getDocumentType();
        V2 = documentType;
        List listAsList = Arrays.asList(documentType);
        CaptureType captureType = CaptureType.VIDEO;
        ObjectDetector<SequentialDetectionResult> objectDetectorCreateVideoDocumentDetector = new DefaultDocumentDetectorFactory(captureType, Side.OBVERSE, videoFragment.getBlockingResourcesDatabaseLazy(), videoFragment.getLoggerLazy(), listAsList).createVideoDocumentDetector(applicationContext);
        videoFragment.B1 = objectDetectorCreateVideoDocumentDetector;
        objectDetectorCreateVideoDocumentDetector.initialize();
        ObjectDetector<SequentialDetectionResult> objectDetectorCreateVideoDocumentDetector2 = new DefaultDocumentDetectorFactory(captureType, Side.REVERSE, videoFragment.getBlockingResourcesDatabaseLazy(), videoFragment.getLoggerLazy(), listAsList).createVideoDocumentDetector(applicationContext);
        videoFragment.C1 = objectDetectorCreateVideoDocumentDetector2;
        objectDetectorCreateVideoDocumentDetector2.initialize();
    }

    public static void g(VideoFragment videoFragment) {
        videoFragment.isRunning.set(false);
        videoFragment.setVideoState(VideoState.VIDEO_CAMERA_RELEASE);
        if (videoFragment.z()) {
            videoFragment.camera.stopMediaRecorder(new com.dasnano.vdvideoselfiecapture.fragments.e(videoFragment));
        } else {
            videoFragment.B();
            videoFragment.q(false);
        }
    }

    public static void h(VideoFragment videoFragment) {
        videoFragment.isRunning.set(false);
        videoFragment.setVideoState(VideoState.VIDEO_CAMERA_RELEASE);
        if (videoFragment.z()) {
            videoFragment.camera.stopMediaRecorder(new com.dasnano.vdvideoselfiecapture.fragments.f(videoFragment));
        } else {
            videoFragment.w();
        }
    }

    public static void i(VideoFragment videoFragment) {
        videoFragment.isRunning.set(false);
        VDLogger.log(Logger.Tag.ON_PAUSE, "On paused called in: %s", "VideoFragment");
        if (videoFragment.z()) {
            videoFragment.camera.stopMediaRecorder();
        }
        videoFragment.setVideoState(VideoState.VIDEO_CAMERA_RELEASE);
        videoFragment.f39754o1.removeCallbacksAndMessages(null);
        videoFragment.L0.removeCallbacksAndMessages(null);
        videoFragment.V0.invalidateDraw();
        videoFragment.f39740h1.setDocumentOrFaceRectangle(0, null, DocumentRectangleOrFace.typesDrawables.ROUNDED_RECTANGLE, 0, videoFragment.getActivity());
        videoFragment.t(null);
        videoFragment.u(null);
        videoFragment.v(null);
        videoFragment.L0.removeCallbacksAndMessages(null);
        HandlerThread handlerThread = videoFragment.K0;
        if (handlerThread != null) {
            handlerThread.quit();
            try {
                videoFragment.K0.join();
                videoFragment.K0 = null;
                videoFragment.L0 = null;
            } catch (InterruptedException e5) {
                Log.e("VideoFragment", e5);
            }
        }
        if (videoFragment.f39754o1 != null) {
            videoFragment.f39754o1 = null;
        }
        MediaPlayer mediaPlayer = videoFragment.U0;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            videoFragment.U0 = null;
        }
    }

    public static void j(VideoFragment videoFragment, int i10) {
        if (i10 != 1) {
            videoFragment.f39754o1.postDelayed(new com.dasnano.vdvideoselfiecapture.fragments.n(videoFragment, i10), 2000L);
        } else {
            videoFragment.getClass();
        }
        videoFragment.runOnUiThread(new com.dasnano.vdvideoselfiecapture.fragments.o(videoFragment, i10));
    }

    public static void k(VideoFragment videoFragment) {
        VideoState videoState = videoFragment.getVideoState();
        videoFragment.Y0.set(0);
        VDLogger.log(Logger.Tag.ERROR_DOC, "Error locating document in state: %s", videoState);
        videoFragment.f39729b1.set(true);
        String str = videoFragment.f39770x2;
        String str2 = videoFragment.f39772y2;
        if (videoState == VideoState.VIDEO_SHOW_OBVERSE) {
            str = videoFragment.C2;
            str2 = videoFragment.D2;
        }
        videoFragment.dialogRegistry.createAlertDialogBuilder().createAlertDialog().context(videoFragment.requireActivity()).style(videoFragment.f39737f2).fallbackThemeId(R.style.VeridasDialog).title(str).message(str2).cancelable(false).positiveButtonClickButtonListener(new q5.a(videoFragment, 1)).positiveButtonText(videoFragment.B2).positiveButtonTextColor(videoFragment.f39765v1).build().show();
    }

    public static void l(VideoFragment videoFragment) {
        if (videoFragment.isRunning.get()) {
            videoFragment.runOnUiThread(new com.dasnano.vdvideoselfiecapture.fragments.l(videoFragment, videoFragment.getActivity()));
        }
    }

    public static void o(View view, int i10, int i11) {
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, "backgroundColor", new ArgbEvaluator(), Integer.valueOf(i10), Integer.valueOf(i11));
        objectAnimatorOfObject.setDuration(TooltipKt.TooltipDuration);
        objectAnimatorOfObject.setRepeatCount(0);
        objectAnimatorOfObject.start();
    }

    public final int A(int i10) {
        return (i10 * this.f39773z1.y) / 1920;
    }

    public final void B() {
        File file = new File(this.O0);
        if (!file.exists() || file.delete()) {
            return;
        }
        Log.w("Video not deleted %s", Thread.currentThread().getName());
    }

    public final void D(int i10) {
        if (this.f39767w1) {
            this.f39748l1.setVisibility(4);
            this.f39750m1.setVisibility(i10);
            this.f39752n1.setVisibility(i10);
        } else {
            this.f39748l1.setVisibility(i10);
            this.f39750m1.setVisibility(4);
            this.f39752n1.setVisibility(4);
        }
    }

    public final void E() {
        int iHeight;
        Point correctedDisplaySize = getCorrectedDisplaySize();
        if (correctedDisplaySize == null) {
            correctedDisplaySize = this.f39773z1;
        }
        int i10 = correctedDisplaySize.y;
        int iA = A(30);
        if (this.f39758q2.equalsIgnoreCase("top")) {
            iHeight = this.F2.equals("top") ? this.S0.getBottom() + iA : iA;
        } else {
            iHeight = 0;
        }
        if (this.f39758q2.equalsIgnoreCase("center")) {
            iHeight = (int) (((((double) (i10 - iA)) / 2.0d) - ((double) (this.f39736f1.height() / 2))) + ((double) A(20)));
        }
        if (this.f39758q2.equalsIgnoreCase("bottom")) {
            iHeight = i10 - (((i10 - this.f39773z1.y) / 2) + (this.f39736f1.height() + (this.f39744j1.getHeight() + A(45))));
        }
        Rect rect = this.f39736f1;
        this.f39736f1 = new Rect(rect.left, iHeight, rect.right, rect.height() + iHeight);
    }

    public final void F() {
        if (this.K0 == null) {
            HandlerThread handlerThread = new HandlerThread("RunnablesThread");
            this.K0 = handlerThread;
            handlerThread.start();
            this.L0 = new Handler(this.K0.getLooper());
        }
        if (this.f39754o1 == null) {
            this.f39754o1 = new Handler();
        }
    }

    public final void G() {
        VideoState videoState = getVideoState();
        if (videoState == VideoState.VIDEO_SHOW_OBVERSE || videoState == VideoState.VIDEO_SHOW_REVERSE || videoState == VideoState.VIDEO_ERROR || videoState == VideoState.VIDEO_SHOW_DOCUMENT_NO_DETECTION) {
            setVideoState(VideoState.VIDEO_SEARCHING_FACE);
        }
        runOnUiThread(new com.dasnano.vdvideoselfiecapture.fragments.b(this, this.camera));
    }

    public final void H(Picture picture, VideoState videoState) {
        if (picture.isEmpty()) {
            runOnUiThread(new j());
            return;
        }
        Point correctedDisplaySize = getCorrectedDisplaySize();
        Rectangle rectangleFrom = Rectangle.from(correctedDisplaySize);
        Rectangle rectangleFrom2 = Rectangle.from(this.f39736f1);
        Frame frame = picture.toFrame();
        com.veridas.math.geometry.Matrix matrixViewfinderSpace = new VectorSpace.Builder().frame(Rectangle.from(frame.getNaturalDimensions().toPoint().toPoint())).viewfinder(rectangleFrom).referenceObject(rectangleFrom2).build().viewfinderSpace();
        Rectangle rectangleTimes = rectangleFrom.times(matrixViewfinderSpace);
        Request requestBuild = new Request.Builder().frame(frame).viewport(rectangleTimes).referenceObject(rectangleFrom2.times(matrixViewfinderSpace)).objectIdentifiers(Arrays.asList(V2)).mirrored(frame.getEncoding() != ImageEncoding.YUV && this.camera.getFacing() == Camera.Facing.FRONT).build();
        if (videoState == VideoState.VIDEO_CALCULATING_FPS) {
            SequentialDetectionResult sequentialDetectionResultC = C(this.A1, requestBuild);
            if (sequentialDetectionResultC.getWarmupComplete()) {
                finishedFpsCalculation(sequentialDetectionResultC.getFps());
                setVideoState(VideoState.VIDEO_SEARCHING_FACE);
                return;
            }
            return;
        }
        if (videoState == VideoState.VIDEO_SEARCHING_FACE) {
            SequentialDetectionResult sequentialDetectionResultC2 = C(this.A1, requestBuild);
            Rectangle candidate = sequentialDetectionResultC2.getSpatialDetectionResult().getCandidate();
            finishedFpsCalculation(sequentialDetectionResultC2.getFps());
            runOnUiThread(new k(sequentialDetectionResultC2.getObjectLost(), candidate, matrixViewfinderSpace, correctedDisplaySize));
            return;
        }
        if (videoState == VideoState.VIDEO_SHOW_OBVERSE) {
            SequentialDetectionResult sequentialDetectionResultC3 = C(this.B1, requestBuild);
            Rectangle candidate2 = sequentialDetectionResultC3.getSpatialDetectionResult().getCandidate();
            finishedFpsCalculation(sequentialDetectionResultC3.getFps());
            runOnUiThread(new l(candidate2, videoState, matrixViewfinderSpace, correctedDisplaySize));
            return;
        }
        if (videoState == VideoState.VIDEO_SHOW_REVERSE) {
            SequentialDetectionResult sequentialDetectionResultC4 = C(this.C1, requestBuild);
            Rectangle candidate3 = sequentialDetectionResultC4.getSpatialDetectionResult().getCandidate();
            finishedFpsCalculation(sequentialDetectionResultC4.getFps());
            runOnUiThread(new m(candidate3, videoState, matrixViewfinderSpace, correctedDisplaySize));
        }
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public CapturePermissionDialogListener createCapturePermissionDialogListener() {
        return new q();
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public AlertDialog.Builder createPermissionDialogBuilder() {
        FragmentActivity activity = getActivity();
        AlertDialog.Builder builder = this.N1 ? new AlertDialog.Builder(activity, R.style.VeridasDialog) : new AlertDialog.Builder(activity);
        builder.setMessage(HtmlCompat.fromHtml(this.f39774z2, 0)).setTitle(HtmlCompat.fromHtml(this.A2, 0));
        return builder;
    }

    public void destroyed() {
        this.N2 = null;
        this.O2 = null;
        this.P2 = null;
        this.Q2 = null;
        this.R2 = null;
        this.S2 = null;
        this.K0 = null;
        this.L0 = null;
        this.U0 = null;
        this.f39754o1 = null;
        removeCapturePermissionListener(this.M2);
        this.B1.finish();
        this.C1.finish();
        this.A1.finish();
    }

    public void faceLost() {
        if (this.isRunning.get()) {
            runOnUiThread(new p());
        }
    }

    public void finishedFpsCalculation(double d2) {
        VDLogger.log(Logger.Tag.FPS, "%.4f", Double.valueOf(d2));
        AtomicInteger atomicInteger = this.Z0;
        atomicInteger.set((int) Math.round(d2 * 1.5d));
        if (atomicInteger.get() < 5) {
            atomicInteger.set(5);
        }
    }

    public void forceIsRunningToFalse() {
        this.isRunning.set(false);
    }

    public synchronized IBlockingResourcesDatabase getBlockingResourcesDatabaseLazy() {
        try {
            if (this.K2 == null) {
                this.K2 = CommonLibraryDepInjector.getBlockingResourcesDatabase(requireContext());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.K2;
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public CameraListener getCameraListener() {
        return new s();
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public String getCapturePermissionDialogNegativeButtonText() {
        return getResources().getString(android.R.string.cancel);
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public String getCapturePermissionDialogPositiveButtonText() {
        return this.B2;
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public int getCapturePermissionRequestCode() {
        return 1;
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public String[] getCapturePermissions() {
        return T2;
    }

    @Override // com.veridas.fragment.DasFragment
    public Class<VDVideoSelfieConfiguration> getConfigurationClass() {
        return VDVideoSelfieConfiguration.class;
    }

    public synchronized ILibraryLogger getLoggerLazy() {
        try {
            if (this.L2 == null) {
                this.L2 = new f();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.L2;
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public View getPreviewSurface() {
        return this.f39733d1.findViewById(R.id.vd_video_surface_view);
    }

    public VideoState getVideoState() {
        VideoState videoState;
        synchronized (this.Q0) {
            videoState = this.Q0;
        }
        return videoState;
    }

    @Override // com.veridas.fragment.DasFragment
    public Class<VDVideoSelfieViewModel> getViewModelClass() {
        return VDVideoSelfieViewModel.class;
    }

    @Override // com.veridas.fragment.DasCaptureFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_video, viewGroup, false);
        this.f39733d1 = viewInflate;
        this.S0 = (FrameLayout) viewInflate.findViewById(R.id.vd_video_textview_border);
        this.f39769x1 = (RelativeLayout) this.f39733d1.findViewById(R.id.vd_video_captured_layout);
        this.f39771y1 = (TextView) this.f39733d1.findViewById(R.id.vd_video_captured_textview);
        this.T0 = this.f39733d1.findViewById(R.id.vd_video_green_border);
        this.S0.setBackgroundColor(this.f39728a2);
        this.T0.setBackgroundColor(this.f39728a2);
        this.R0 = (TextView) this.f39733d1.findViewById(R.id.vd_video_textView_video_fragment);
        OvalView ovalView = (OvalView) this.f39733d1.findViewById(R.id.vd_video_oval_video_fragment);
        this.M0 = ovalView;
        ovalView.setColor(this.Y1);
        this.M0.setIsFaceShapeOval(this.L1);
        this.M0.setRatio(this.W0);
        FaceShapeView faceShapeView = (FaceShapeView) this.f39733d1.findViewById(R.id.vd_video_face_oval);
        this.V0 = faceShapeView;
        faceShapeView.setIsFaceShapeOval(this.L1);
        this.f39734e1 = (ImageView) this.f39733d1.findViewById(R.id.vd_video_image_view_help);
        this.f39740h1 = (DocumentRectangleOrFace) this.f39733d1.findViewById(R.id.vd_video_rectangle_fixed);
        TextView textView = (TextView) this.f39733d1.findViewById(R.id.vd_video_template_informative_text);
        this.f39744j1 = textView;
        textView.setBackgroundColor(this.U1);
        this.V0.setVisibility(4);
        this.f39740h1.setVisibility(4);
        this.f39740h1.setDocumentOrFaceRectangle(0, this.f39736f1, DocumentRectangleOrFace.typesDrawables.ROUNDED_RECTANGLE, this.P0, getActivity());
        this.f39746k1 = (ImageView) this.f39733d1.findViewById(R.id.vd_video_tick_view);
        int i10 = this.W1;
        int i11 = this.X1;
        FragmentActivity activity = getActivity();
        Drawable[] drawableArr = {ContextCompat.getDrawable(activity, R.mipmap.vd_video_circle), ContextCompat.getDrawable(activity, R.mipmap.vd_video_tick)};
        try {
            Drawable drawable = drawableArr[0];
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(i11, mode);
            drawableArr[1].setColorFilter(i10, mode);
        } catch (Exception e5) {
            Log.e("VideoFragment", "Exception changing tick colors: " + e5.toString());
        }
        this.f39746k1.setImageDrawable(new LayerDrawable(drawableArr));
        this.V0.setRect(0, this.f39738g1, this.P0, getActivity());
        RectangleView rectangleView = (RectangleView) this.f39733d1.findViewById(R.id.vd_video_rectangle_video_fragment);
        this.N0 = rectangleView;
        rectangleView.setColor(this.V1);
        if (!this.R1) {
            y();
        }
        if (!this.P1) {
            this.f39727a1 = 0.0f;
        }
        this.f39748l1 = (TextView) this.f39733d1.findViewById(R.id.vd_video_countdown_textview);
        this.f39750m1 = (TextView) this.f39733d1.findViewById(R.id.vd_video_countdown_textview_left);
        this.f39752n1 = (TextView) this.f39733d1.findViewById(R.id.vd_video_countdown_textview_right);
        this.f39769x1.setAlpha(this.T1);
        this.f39771y1.setText(HtmlCompat.fromHtml(this.f39745j2, 0));
        if (this.D1) {
            this.f39771y1.setCompoundDrawablesWithIntrinsicBounds(getActivity().getResources().getIdentifier(this.f39741h2, PluginUtils.IDENTIFIER_DRAWABLE, getActivity().getPackageName()), 0, 0, 0);
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f39771y1.getLayoutParams();
        if (this.f39743i2.equals("top")) {
            layoutParams.addRule(10);
        } else if (this.f39743i2.equals("center")) {
            layoutParams.addRule(13);
        } else {
            layoutParams.addRule(12);
        }
        this.f39771y1.setLayoutParams(layoutParams);
        return this.f39733d1;
    }

    public final byte[] p(byte[] bArr) {
        boolean z10 = this.J1;
        if (z10 || this.K1) {
            String str = z10 ? this.E2 : "";
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(bArr);
                if (this.J1 && !TextUtils.isEmpty(str)) {
                    byteArrayOutputStream.write(str.getBytes());
                }
                if (this.K1) {
                    byteArrayOutputStream.write(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()).getBytes());
                }
                byteArrayOutputStream.flush();
            } catch (IOException e5) {
                Log.e("VideoFragment", e5);
            }
            bArr = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (IOException e7) {
                Log.e("VideoFragment", e7);
            }
        }
        return bArr;
    }

    public final void q(boolean z10) {
        Intent intent = new Intent(VIDEO_FRAGMENT_FINISHED);
        intent.putExtra(VIDEO_FRAGMENT_FINISHED, z10);
        broadcastIntent(intent);
    }

    public final void r() {
        Point correctedDisplaySize = getCorrectedDisplaySize();
        if (correctedDisplaySize == null) {
            correctedDisplaySize = this.f39773z1;
        }
        int i10 = (correctedDisplaySize.x - this.f39773z1.x) / 2;
        int i11 = (correctedDisplaySize.y - this.f39773z1.y) / 2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(correctedDisplaySize.x, correctedDisplaySize.y);
        int i12 = -i10;
        int i13 = -i11;
        layoutParams.setMargins(i12, i13, i12, i13);
        this.f39733d1.setLayoutParams(layoutParams);
        this.f39733d1.requestLayout();
    }

    public final Dialog s() {
        String str;
        String str2;
        if (this.M1) {
            str = this.f39761s2;
            str2 = this.f39766v2;
        } else {
            boolean zIsPassport = Document.isPassport(V2);
            String str3 = this.f39759r2;
            String str4 = this.u2;
            if (zIsPassport) {
                str = this.f39763t2;
                str2 = this.f39768w2;
            } else {
                str = str3;
                str2 = str4;
            }
        }
        return this.dialogRegistry.createAlertDialogBuilder().context(requireActivity()).createAlertDialog().style(this.f39737f2).fallbackThemeId(R.style.VeridasDialog).title(str2).message(str).cancelable(false).positiveButtonClickButtonListener(new q5.b(this, 1)).positiveButtonText(this.B2).positiveButtonTextColor(this.f39765v1).build();
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public void setCameraQueryArguments(CameraQuery cameraQuery) {
        cameraQuery.preferAutoFocus(true).facing(Camera.Facing.FRONT);
    }

    public void setVideoState(VideoState videoState) {
        synchronized (this.Q0) {
            this.Q0 = videoState;
        }
    }

    public final void t(String str) {
        if (this.isRunning.get()) {
            runOnUiThread(new i(str));
        }
    }

    public final void u(Rect rect) {
        OvalView ovalView;
        if (this.isRunning.get()) {
            if (getVideoState() != VideoState.VIDEO_SEARCHING_FACE) {
                OvalView ovalView2 = this.M0;
                if (ovalView2 != null) {
                    ovalView2.setRect(null);
                    return;
                }
                return;
            }
            VDLogger.log(Logger.Tag.FACE_RECT, "Face detected in: %s", rect == null ? "null rect" : rect.toString());
            if (!this.G1 || (ovalView = this.M0) == null) {
                return;
            }
            ovalView.setRect(rect);
        }
    }

    public final void v(Rect rect) {
        RectangleView rectangleView;
        if (this.isRunning.get()) {
            VideoState videoState = getVideoState();
            if (videoState != VideoState.VIDEO_SHOW_OBVERSE && videoState != VideoState.VIDEO_SHOW_REVERSE) {
                RectangleView rectangleView2 = this.N0;
                if (rectangleView2 != null) {
                    rectangleView2.setRect(null);
                    return;
                }
                return;
            }
            VDLogger.log(Logger.Tag.DOC_RECT, "Doc detected in: %s", rect == null ? "null rect" : rect.toString());
            if (!this.F1 || (rectangleView = this.N0) == null) {
                return;
            }
            rectangleView.setRect(rect);
        }
    }

    public final void w() {
        File file = new File(this.O0);
        if (!file.exists()) {
            Log.e("VideoFragment", "Video file %s does not exist.", this.O0);
            return;
        }
        try {
            byte[] bArrP = p(Util.fileToByteArray(file));
            file.delete();
            runOnUiThread(new a(Util.saveMp4InPrivateLocation(requireActivity(), bArrP, CAPTURED_VIDEO_NAME)));
        } catch (IOException e5) {
            Log.e("VideoFragment", e5);
        }
    }

    public final boolean x() {
        Document document;
        return V2.equals("") || (document = this.X0) == null || document.getReverse() != null;
    }

    public final void y() {
        runOnUiThread(new o());
    }

    public final boolean z() {
        return this.camera != null && this.camera.isRecording();
    }
}
