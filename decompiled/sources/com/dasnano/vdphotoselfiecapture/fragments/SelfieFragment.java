package com.dasnano.vdphotoselfiecapture.fragments;

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
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.w1;
import androidx.appcompat.widget.x1;
import androidx.camera.core.b0;
import androidx.camera.core.k1;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.core.text.HtmlCompat;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentActivity;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.bbva.ethermobilesdk.devicechecker.magisk.permission.MagiskApp;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.dasnano.vdphotoselfiecapture.BuildConfig;
import com.dasnano.vdphotoselfiecapture.CustomAlertDialog;
import com.dasnano.vdphotoselfiecapture.R;
import com.dasnano.vdphotoselfiecapture.VDPhotoSelfieCapture;
import com.dasnano.vdphotoselfiecapture.api.model.Action;
import com.dasnano.vdphotoselfiecapture.api.model.Challenge;
import com.dasnano.vdphotoselfiecapture.api.model.Token;
import com.dasnano.vdphotoselfiecapture.camera.resolution.BiggestCaptureResolutionSelectionStrategy;
import com.dasnano.vdphotoselfiecapture.camera.resolution.DefaultCaptureResolutionSelectionStrategy;
import com.dasnano.vdphotoselfiecapture.camera.resolution.DefaultPreviewResolutionSelectionStrategy;
import com.dasnano.vdphotoselfiecapture.config.VDPhotoSelfieConfiguration;
import com.dasnano.vdphotoselfiecapture.model.VDPhotoSelfieViewModel;
import com.dasnano.vdphotoselfiecapture.other.FaceShape;
import com.dasnano.vdphotoselfiecapture.other.RectangleView;
import com.dasnano.vdphotoselfiecapture.other.SelfieAliveProProcessing;
import com.dasnano.vdphotoselfiecapture.other.SelfieAliveProcessing;
import com.dasnano.vdphotoselfiecapture.other.SelfieProcessingProtocol;
import com.dasnano.vdphotoselfiecapture.other.TranslucentLayer;
import com.dasnano.vdphotoselfiecapture.other.util.ImageUtils;
import com.dasnano.vdphotoselfiecapture.other.util.Utils;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import com.google.mlkit.vision.face.Face;
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
import com.veridas.detect.obj.face.DefaultFaceDetectorFactory;
import com.veridas.detect.sequence.SequentialDetectionResult;
import com.veridas.detect.spatial.SpatialDetectionResult;
import com.veridas.di.CommonLibraryDepInjector;
import com.veridas.display.DisplayOrientation;
import com.veridas.fragment.DasCaptureFragment;
import com.veridas.fragment.DasFragment;
import com.veridas.fragment.FragmentExceptionListener;
import com.veridas.fragment.FragmentLifecycleAdapter;
import com.veridas.fragment.permission.CapturePermissionAdapter;
import com.veridas.fragment.permission.CapturePermissionDialogAdapter;
import com.veridas.fragment.permission.CapturePermissionDialogListener;
import com.veridas.graphics.Frame;
import com.veridas.log.Log;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;
import com.veridas.math.geometry.Rectangle;
import com.veridas.math.geometry.Vector2;
import com.veridas.math.geometry.VectorSpace;
import com.veridas.metadata.ExifMetadataIO;
import com.veridas.metadata.entities.ArtifactClass;
import com.veridas.metadata.entities.IntegrityCalculation;
import com.veridas.resource.database.IBlockingResourcesDatabase;
import com.veridas.util.AppUtil;
import com.veridas.util.Util;
import com.veridas.vdlibraryimageprocessing.VDConstantDefinition;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes9.dex */
public class SelfieFragment extends DasCaptureFragment<VDPhotoSelfieConfiguration, VDPhotoSelfieViewModel> implements SelfieProcessingProtocol, SensorEventListener {
    public static final String CHALLENGE_CAPTURED = "com.dasnano.selfieCapture.selfieFragment.challengeCaptured";
    public static final String CHALLENGE_TO_BE_REPEATED = "com.dasnano.selfieCapture.selfieFragment.challengeRepeated";
    public static final String CHALLENGE_VIDEO_PATH = "com.dasnano.selfieCapture.selfieFragment.challengeCaptured.video";
    public static final String CHALLENGE_VTT = "com.dasnano.selfieCapture.selfieFragment.challengeCaptured.vtt";
    public static final String FRAME_CAPTURED = "com.dasnano.selfieCapture.selfieFragment.frameCaptured";
    public static final String FRAME_FACE_PATH = "com.dasnano.selfieCapture.selfieFragment.frameCaptured.face";
    public static final String FRAME_SELFIE_PATH = "com.dasnano.selfieCapture.selfieFragment.frameCaptured.selfie";
    public static final String PHOTO_CAPTURED = "com.dasnano.selfieCapture.selfieFragment.photoCaptured";
    public static final String PHOTO_FACE_PATH = "com.dasnano.selfieCapture.selfieFragment.photoCaptured.face";
    public static final String PHOTO_SELFIE_PATH = "com.dasnano.selfieCapture.selfieFragment.photoCaptured.selfie";
    public static final float RATIO_ERROR_ALLOWED = 0.13f;
    public static final String SELFIE_FINISHED = "com.dasnano.selfieCapture.selfieFragment.finished";
    public static final int SMALL_CAPTURE_SIZE = 400;
    public static final long THREAD_JOIN_TIMEOUT = 30000;

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public static final List<Parameter.FocusMode> f39554a3 = Arrays.asList(Parameter.FocusMode.CONTINUOUS_PICTURE, Parameter.FocusMode.AUTO, Parameter.FocusMode.FIXED, Parameter.FocusMode.INFINITY);

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    public static final String[] f39555b3 = {"android.permission.CAMERA"};

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    public static final String[] f39556c3 = {"android.permission.CAMERA", MagiskApp.WRITE_EXTERNAL_STORAGE};
    public static final String d3 = "SelfieFragment";

    /* JADX INFO: renamed from: e3, reason: collision with root package name */
    public static final Resolution f39557e3;

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    public static final Resolution f39558f3;
    public ImageView A1;
    public int A2;
    public ImageView B1;
    public int B2;
    public ImageView C1;
    public int C2;
    public boolean D1;
    public int D2;
    public volatile double E1;
    public int E2;
    public volatile double F1;
    public long F2;
    public volatile double G1;
    public long G2;
    public volatile double H1;
    public String H2;
    public final AtomicLong I1;
    public String I2;
    public DefaultFaceDetectorFactory J0;
    public volatile SmileState J1;
    public String J2;
    public ObjectDetector<SequentialDetectionResult> K0;
    public final Object K1;
    public String K2;
    public ObjectDetector<SpatialDetectionResult> L0;
    public final Object L1;
    public String L2;
    public final Object M1;
    public String M2;
    public int N0;
    public final Object N1;
    public String N2;
    public SelfieAliveProcessing O0;
    public boolean O1;
    public String O2;
    public SelfieAliveProProcessing P0;
    public boolean P1;
    public String P2;
    public volatile Point Q0;
    public RectangleView Q1;
    public String Q2;
    public CountDownState R0;
    public MediaPlayer R1;
    public String R2;
    public volatile long S1;
    public String S2;
    public TextureView T0;
    public boolean T1;
    public String T2;
    public volatile Picture U1;
    public String U2;
    public boolean V1;
    public String V2;
    public boolean W1;
    public String W2;
    public boolean X1;
    public String X2;
    public boolean Y1;
    public final h Y2;
    public boolean Z1;
    public IBlockingResourcesDatabase Z2;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public boolean f39560a2;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public boolean f39562b2;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public boolean f39564c2;
    public boolean d2;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public boolean f39567e2;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public boolean f39569f2;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    public boolean f39571g2;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public boolean f39573h2;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public boolean f39575i2;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public boolean f39577j2;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public boolean f39579k2;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public boolean f39581l2;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public boolean f39583m2;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public boolean f39585n2;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public SensorManager f39586o1;
    public boolean o2;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public boolean f39588p2;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public boolean f39590q2;
    public final float[] r1;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public boolean f39591r2;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public float f39592s1;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public int f39593s2;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public VDConstantDefinition.TemplateProximity f39594t1;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public int f39595t2;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public boolean f39596u1;
    public int u2;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public boolean f39597v1;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public int f39598v2;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public boolean f39599w1;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public int f39600w2;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public boolean f39601x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public int f39602x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public TranslucentLayer f39603y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public int f39604y2;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public ImageView f39605z1;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public int f39606z2;
    public boolean M0 = false;
    protected AtomicBoolean isRunning = new AtomicBoolean(false);
    public volatile SelfieState S0 = SelfieState.SELFIE_WAITING_FOR_CONFIRMATION;
    public RelativeLayout U0 = null;
    public CustomAlertDialog V0 = null;
    public Rect W0 = null;
    public int X0 = 0;
    public FaceShape Y0 = null;
    public TextView Z0 = null;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public TextView f39559a1 = null;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public TextView f39561b1 = null;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public ImageView f39563c1 = null;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public TextView f39565d1 = null;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public LinearLayout f39566e1 = null;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public TextView f39568f1 = null;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public RelativeLayout f39570g1 = null;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public ImageView f39572h1 = null;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public ImageView f39574i1 = null;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public ImageView f39576j1 = null;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public ImageView f39578k1 = null;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public String f39580l1 = "";

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public HandlerThread f39582m1 = null;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public Handler f39584n1 = null;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public final float[] f39587p1 = new float[3];

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public final float[] f39589q1 = new float[3];

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CountDownState {
        private static final /* synthetic */ CountDownState[] $VALUES;
        public static final CountDownState COUNTDOWN_ALMOST;
        public static final CountDownState COUNTDOWN_CLOSE;
        public static final CountDownState COUNTDOWN_INVISIBLE;
        public static final CountDownState COUNTDOWN_MIDDLE_DISTANCE;

        static {
            CountDownState countDownState = new CountDownState("COUNTDOWN_MIDDLE_DISTANCE", 0);
            COUNTDOWN_MIDDLE_DISTANCE = countDownState;
            CountDownState countDownState2 = new CountDownState("COUNTDOWN_CLOSE", 1);
            COUNTDOWN_CLOSE = countDownState2;
            CountDownState countDownState3 = new CountDownState("COUNTDOWN_ALMOST", 2);
            COUNTDOWN_ALMOST = countDownState3;
            CountDownState countDownState4 = new CountDownState("COUNTDOWN_INVISIBLE", 3);
            COUNTDOWN_INVISIBLE = countDownState4;
            $VALUES = new CountDownState[]{countDownState, countDownState2, countDownState3, countDownState4};
        }

        public CountDownState() {
            throw null;
        }

        public static CountDownState valueOf(String str) {
            return (CountDownState) Enum.valueOf(CountDownState.class, str);
        }

        public static CountDownState[] values() {
            return (CountDownState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SelfieState {
        private static final /* synthetic */ SelfieState[] $VALUES;
        public static final SelfieState SELFIE_CALCULATING_FPS;
        public static final SelfieState SELFIE_CAMERA_RELEASED;
        public static final SelfieState SELFIE_CHALLENGE_ACTION;
        public static final SelfieState SELFIE_CHALLENGE_FINISHED;
        public static final SelfieState SELFIE_CHALLENGE_INIT_CHALLENGE;
        public static final SelfieState SELFIE_CHALLENGE_PRE_ACTION;
        public static final SelfieState SELFIE_PICTURE_TAKEN;
        public static final SelfieState SELFIE_PRE_SEARCHING_SMILE;
        public static final SelfieState SELFIE_SEARCHING_FACE;
        public static final SelfieState SELFIE_SEARCHING_SMILE;
        public static final SelfieState SELFIE_WAITING_FOR_CONFIRMATION;

        static {
            SelfieState selfieState = new SelfieState("SELFIE_WAITING_FOR_CONFIRMATION", 0);
            SELFIE_WAITING_FOR_CONFIRMATION = selfieState;
            SelfieState selfieState2 = new SelfieState("SELFIE_CALCULATING_FPS", 1);
            SELFIE_CALCULATING_FPS = selfieState2;
            SelfieState selfieState3 = new SelfieState("SELFIE_SEARCHING_FACE", 2);
            SELFIE_SEARCHING_FACE = selfieState3;
            SelfieState selfieState4 = new SelfieState("SELFIE_SEARCHING_SMILE", 3);
            SELFIE_SEARCHING_SMILE = selfieState4;
            SelfieState selfieState5 = new SelfieState("SELFIE_PICTURE_TAKEN", 4);
            SELFIE_PICTURE_TAKEN = selfieState5;
            SelfieState selfieState6 = new SelfieState("SELFIE_CAMERA_RELEASED", 5);
            SELFIE_CAMERA_RELEASED = selfieState6;
            SelfieState selfieState7 = new SelfieState("SELFIE_PRE_SEARCHING_SMILE", 6);
            SELFIE_PRE_SEARCHING_SMILE = selfieState7;
            SelfieState selfieState8 = new SelfieState("SELFIE_CHALLENGE_INIT_CHALLENGE", 7);
            SELFIE_CHALLENGE_INIT_CHALLENGE = selfieState8;
            SelfieState selfieState9 = new SelfieState("SELFIE_CHALLENGE_PRE_ACTION", 8);
            SELFIE_CHALLENGE_PRE_ACTION = selfieState9;
            SelfieState selfieState10 = new SelfieState("SELFIE_CHALLENGE_ACTION", 9);
            SELFIE_CHALLENGE_ACTION = selfieState10;
            SelfieState selfieState11 = new SelfieState("SELFIE_CHALLENGE_FINISHED", 10);
            SELFIE_CHALLENGE_FINISHED = selfieState11;
            $VALUES = new SelfieState[]{selfieState, selfieState2, selfieState3, selfieState4, selfieState5, selfieState6, selfieState7, selfieState8, selfieState9, selfieState10, selfieState11};
        }

        public SelfieState() {
            throw null;
        }

        public static SelfieState valueOf(String str) {
            return (SelfieState) Enum.valueOf(SelfieState.class, str);
        }

        public static SelfieState[] values() {
            return (SelfieState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SmileState {
        private static final /* synthetic */ SmileState[] $VALUES;
        public static final SmileState SELFIE_SERIOUS_MORE;
        public static final SmileState SELFIE_SERIOUS_REQUEST;
        public static final SmileState SELFIE_SMILE_MORE;
        public static final SmileState SELFIE_SMILING_REQUEST;

        static {
            SmileState smileState = new SmileState("SELFIE_SERIOUS_REQUEST", 0);
            SELFIE_SERIOUS_REQUEST = smileState;
            SmileState smileState2 = new SmileState("SELFIE_SMILING_REQUEST", 1);
            SELFIE_SMILING_REQUEST = smileState2;
            SmileState smileState3 = new SmileState("SELFIE_SMILE_MORE", 2);
            SELFIE_SMILE_MORE = smileState3;
            SmileState smileState4 = new SmileState("SELFIE_SERIOUS_MORE", 3);
            SELFIE_SERIOUS_MORE = smileState4;
            $VALUES = new SmileState[]{smileState, smileState2, smileState3, smileState4};
        }

        public SmileState() {
            throw null;
        }

        public static SmileState valueOf(String str) {
            return (SmileState) Enum.valueOf(SmileState.class, str);
        }

        public static SmileState[] values() {
            return (SmileState[]) $VALUES.clone();
        }
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f39607p0;

        public a(String str) {
            this.f39607p0 = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SelfieFragment selfieFragment = SelfieFragment.this;
            selfieFragment.f39565d1.setVisibility(0);
            selfieFragment.f39565d1.setText(HtmlCompat.fromHtml(this.f39607p0, 0));
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Rect f39609p0;

        public b(Rect rect) {
            this.f39609p0 = rect;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RectangleView rectangleView = SelfieFragment.this.Q1;
            if (rectangleView != null) {
                rectangleView.setRect(this.f39609p0);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0040  */
        /* JADX WARN: Code duplicated, block: B:13:0x004d  */
        /* JADX WARN: Code duplicated, block: B:15:0x0055  */
        /* JADX WARN: Code duplicated, block: B:16:0x005a  */
        /* JADX WARN: Code duplicated, block: B:18:0x005e  */
        /* JADX WARN: Code duplicated, block: B:19:0x0063  */
        /* JADX WARN: Code duplicated, block: B:21:0x0067  */
        /* JADX WARN: Code duplicated, block: B:22:0x006c  */
        /* JADX WARN: Code duplicated, block: B:24:0x0070  */
        @Override // java.lang.Runnable
        public final void run() {
            SelfieState selfieState;
            SmileState smileState;
            SelfieFragment selfieFragment = SelfieFragment.this;
            selfieFragment.f39603y1.setBackgroundColor(selfieFragment.f39606z2);
            if (selfieFragment.f39597v1) {
                if (selfieFragment.f39596u1) {
                    selfieState = selfieFragment.getSelfieState();
                    selfieFragment.f39563c1.setVisibility(4);
                    if (selfieState == SelfieState.SELFIE_SEARCHING_SMILE) {
                        smileState = selfieFragment.getSmileState();
                        if (smileState == SmileState.SELFIE_SMILING_REQUEST) {
                            selfieFragment.f39580l1 = selfieFragment.T2;
                        } else if (smileState == SmileState.SELFIE_SERIOUS_REQUEST) {
                            selfieFragment.f39580l1 = selfieFragment.S2;
                        } else if (smileState == SmileState.SELFIE_SMILE_MORE) {
                            selfieFragment.f39580l1 = selfieFragment.V2;
                        } else if (smileState == SmileState.SELFIE_SERIOUS_MORE) {
                            selfieFragment.f39580l1 = selfieFragment.U2;
                        }
                    }
                } else {
                    float f6 = selfieFragment.f39592s1;
                    if (f6 < 80.0f || f6 > 111.0f) {
                        selfieFragment.f39603y1.setBackgroundColor(selfieFragment.f39604y2);
                        selfieFragment.H(CountDownState.COUNTDOWN_INVISIBLE);
                        selfieFragment.f39563c1.setVisibility(0);
                        selfieFragment.K(selfieFragment.X2);
                        selfieFragment.A1.setVisibility(4);
                        selfieFragment.J();
                    } else {
                        selfieState = selfieFragment.getSelfieState();
                        selfieFragment.f39563c1.setVisibility(4);
                        if (selfieState == SelfieState.SELFIE_SEARCHING_SMILE) {
                            smileState = selfieFragment.getSmileState();
                            if (smileState == SmileState.SELFIE_SMILING_REQUEST) {
                                selfieFragment.f39580l1 = selfieFragment.T2;
                            } else if (smileState == SmileState.SELFIE_SERIOUS_REQUEST) {
                                selfieFragment.f39580l1 = selfieFragment.S2;
                            } else if (smileState == SmileState.SELFIE_SMILE_MORE) {
                                selfieFragment.f39580l1 = selfieFragment.V2;
                            } else if (smileState == SmileState.SELFIE_SERIOUS_MORE) {
                                selfieFragment.f39580l1 = selfieFragment.U2;
                            }
                        }
                    }
                }
                if (!selfieFragment.f39599w1) {
                    if (selfieFragment.f39601x1) {
                        if (selfieFragment.f39596u1) {
                            selfieFragment.f39603y1.setVisibility(4);
                            return;
                        } else {
                            selfieFragment.f39603y1.setReferenceRect(null);
                            selfieFragment.f39603y1.setVisibility(0);
                            return;
                        }
                    }
                    return;
                }
                if (!selfieFragment.f39601x1) {
                    selfieFragment.f39603y1.setReferenceRect(selfieFragment.W0);
                    selfieFragment.f39603y1.setVisibility(0);
                } else if (selfieFragment.f39596u1) {
                    selfieFragment.f39603y1.setReferenceRect(selfieFragment.W0);
                    selfieFragment.Y0.setVisibility(0);
                } else {
                    selfieFragment.f39603y1.setReferenceRect(null);
                    selfieFragment.Y0.setVisibility(4);
                }
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ VDConstantDefinition.TemplateProximity f39612p0;

        public d(VDConstantDefinition.TemplateProximity templateProximity) {
            this.f39612p0 = templateProximity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SelfieFragment selfieFragment = SelfieFragment.this;
            SelfieState selfieState = selfieFragment.getSelfieState();
            if (selfieState != SelfieState.SELFIE_SEARCHING_SMILE && selfieState != SelfieState.SELFIE_PRE_SEARCHING_SMILE) {
                int currentTextColor = selfieFragment.Z0.getCurrentTextColor();
                selfieFragment.K(selfieFragment.W2);
                VDConstantDefinition.TemplateProximity templateProximity = VDConstantDefinition.TemplateProximity.ERROR;
                VDConstantDefinition.TemplateProximity templateProximity2 = this.f39612p0;
                if (templateProximity2 == templateProximity) {
                    selfieFragment.Y0.setRect(ViewCompat.MEASURED_STATE_MASK, selfieFragment.W0, selfieFragment.X0);
                    selfieFragment.f39594t1 = templateProximity2;
                } else {
                    VDConstantDefinition.TemplateProximity templateProximity3 = VDConstantDefinition.TemplateProximity.NOT_FOUND;
                    if (templateProximity2 == templateProximity3 && selfieFragment.f39594t1 != VDConstantDefinition.TemplateProximity.VERY_CLOSE) {
                        selfieFragment.A1.setVisibility(4);
                        selfieFragment.H(CountDownState.COUNTDOWN_INVISIBLE);
                        if (selfieState != SelfieState.SELFIE_PICTURE_TAKEN && currentTextColor != 0) {
                            selfieFragment.Y0.setRect(-1, selfieFragment.W0, selfieFragment.X0);
                        }
                        selfieFragment.f39594t1 = templateProximity2;
                    } else if (templateProximity2 == VDConstantDefinition.TemplateProximity.EXTREMELY_FAR) {
                        selfieFragment.Y0.setRect(selfieFragment.f39595t2, selfieFragment.W0, selfieFragment.X0);
                        selfieFragment.f39594t1 = templateProximity2;
                        selfieFragment.J();
                        selfieFragment.f39563c1.setVisibility(4);
                        selfieFragment.K(selfieFragment.I2);
                    } else if (templateProximity2 == VDConstantDefinition.TemplateProximity.FAR) {
                        selfieFragment.H(CountDownState.COUNTDOWN_MIDDLE_DISTANCE);
                        selfieFragment.f39594t1 = templateProximity2;
                    } else if (templateProximity2 == VDConstantDefinition.TemplateProximity.MIDDLE_DISTANCE) {
                        selfieFragment.H(CountDownState.COUNTDOWN_CLOSE);
                        selfieFragment.f39594t1 = templateProximity2;
                    } else if (templateProximity2 == VDConstantDefinition.TemplateProximity.CLOSE) {
                        selfieFragment.Y0.setRect(selfieFragment.u2, selfieFragment.W0, selfieFragment.X0);
                        selfieFragment.f39594t1 = templateProximity2;
                    } else if (templateProximity2 == VDConstantDefinition.TemplateProximity.VERY_CLOSE) {
                        selfieFragment.H(CountDownState.COUNTDOWN_ALMOST);
                        selfieFragment.f39594t1 = templateProximity2;
                    } else if (templateProximity2 == VDConstantDefinition.TemplateProximity.EXTREMELY_CLOSE) {
                        selfieFragment.Y0.setRect(ViewCompat.MEASURED_STATE_MASK, selfieFragment.W0, selfieFragment.X0);
                        selfieFragment.f39594t1 = templateProximity2;
                        selfieFragment.H(CountDownState.COUNTDOWN_INVISIBLE);
                    } else if (templateProximity2 == VDConstantDefinition.TemplateProximity.NOT_CENTERED) {
                        selfieFragment.Y0.setRect(selfieFragment.f39595t2, selfieFragment.W0, selfieFragment.X0);
                        selfieFragment.f39594t1 = templateProximity2;
                        selfieFragment.J();
                        selfieFragment.f39563c1.setVisibility(4);
                        selfieFragment.K(selfieFragment.J2);
                    } else {
                        selfieFragment.f39580l1 = selfieFragment.getText(R.string.vd_photo_no_face).toString();
                        selfieFragment.Y0.setRect(0, selfieFragment.W0, selfieFragment.X0);
                        selfieFragment.f39594t1 = templateProximity3;
                        selfieFragment.H(CountDownState.COUNTDOWN_INVISIBLE);
                    }
                }
            }
            VDLogger.log(Logger.Tag.TEMPLATE_DISTANCE, selfieFragment.f39594t1.name());
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SelfieFragment selfieFragment = SelfieFragment.this;
            CharSequence text = selfieFragment.f39565d1.getText();
            if (text.equals(selfieFragment.T2) && text.equals(selfieFragment.S2) && text.equals(selfieFragment.V2) && text.equals(selfieFragment.U2)) {
                return;
            }
            selfieFragment.J();
            if (selfieFragment.f39580l1.isEmpty() || !selfieFragment.f39580l1.equalsIgnoreCase(selfieFragment.X2)) {
                selfieFragment.f39563c1.setVisibility(4);
                selfieFragment.K(selfieFragment.f39580l1);
            } else {
                selfieFragment.A1.setVisibility(4);
                selfieFragment.f39563c1.setVisibility(0);
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CountDownState f39615p0;

        public f(CountDownState countDownState) {
            this.f39615p0 = countDownState;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SelfieFragment selfieFragment = SelfieFragment.this;
            SelfieState selfieState = selfieFragment.getSelfieState();
            int[] iArr = g.f39619c;
            CountDownState countDownState = this.f39615p0;
            int i10 = iArr[countDownState.ordinal()];
            if (i10 == 1) {
                CountDownState countDownState2 = selfieFragment.R0;
                if (countDownState2 != countDownState && countDownState2 != CountDownState.COUNTDOWN_CLOSE && countDownState2 != CountDownState.COUNTDOWN_ALMOST && selfieState == SelfieState.SELFIE_SEARCHING_FACE) {
                    if (selfieFragment.P1) {
                        selfieFragment.Z0.setVisibility(4);
                        selfieFragment.f39559a1.setVisibility(0);
                        selfieFragment.f39561b1.setVisibility(0);
                    } else {
                        selfieFragment.Z0.setVisibility(0);
                        selfieFragment.f39559a1.setVisibility(4);
                        selfieFragment.f39561b1.setVisibility(4);
                    }
                    SelfieFragment.i(selfieFragment);
                    SelfieFragment.h(selfieFragment, ExifInterface.GPS_MEASUREMENT_3D);
                    selfieFragment.f39563c1.setVisibility(4);
                    selfieFragment.A1.setVisibility(4);
                    selfieFragment.Y0.setRect(selfieFragment.u2, selfieFragment.W0, selfieFragment.X0);
                }
            } else if (i10 == 2) {
                CountDownState countDownState3 = selfieFragment.R0;
                if (countDownState3 != countDownState && countDownState3 != CountDownState.COUNTDOWN_ALMOST && selfieState == SelfieState.SELFIE_SEARCHING_FACE) {
                    SelfieFragment.i(selfieFragment);
                    SelfieFragment.h(selfieFragment, "2");
                    selfieFragment.f39563c1.setVisibility(4);
                    selfieFragment.Y0.setRect(selfieFragment.u2, selfieFragment.W0, selfieFragment.X0);
                }
            } else if (i10 != 3) {
                if (i10 == 4) {
                    selfieFragment.J();
                    if (selfieFragment.R0 != countDownState) {
                        selfieFragment.Z0.clearAnimation();
                        selfieFragment.f39559a1.clearAnimation();
                        selfieFragment.f39561b1.clearAnimation();
                    }
                }
            } else if (selfieFragment.R0 != countDownState && selfieState == SelfieState.SELFIE_SEARCHING_FACE) {
                SelfieFragment.i(selfieFragment);
                SelfieFragment.h(selfieFragment, "1");
                selfieFragment.f39563c1.setVisibility(4);
                selfieFragment.Y0.setRect(selfieFragment.u2, selfieFragment.W0, selfieFragment.X0);
            }
            selfieFragment.R0 = countDownState;
        }
    }

    public static /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f39618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f39619c;

        static {
            int[] iArr = new int[CountDownState.values().length];
            f39619c = iArr;
            try {
                iArr[CountDownState.COUNTDOWN_MIDDLE_DISTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39619c[CountDownState.COUNTDOWN_CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39619c[CountDownState.COUNTDOWN_ALMOST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39619c[CountDownState.COUNTDOWN_INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[SelfieState.values().length];
            f39618b = iArr2;
            try {
                iArr2[SelfieState.SELFIE_CHALLENGE_INIT_CHALLENGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39618b[SelfieState.SELFIE_CHALLENGE_ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[Action.AccomplishStatus.values().length];
            f39617a = iArr3;
            try {
                iArr3[Action.AccomplishStatus.ACCOMPLISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f39617a[Action.AccomplishStatus.TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f39617a[Action.AccomplishStatus.WRONG_MOVEMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f39617a[Action.AccomplishStatus.RETURNING_TO_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f39617a[Action.AccomplishStatus.NOT_ACCOMPLISHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public class h extends CapturePermissionAdapter {
        @Override // com.veridas.fragment.permission.CapturePermissionAdapter, com.veridas.fragment.permission.CapturePermissionListener
        public final void onCapturePermissionDenied(Object obj, String str) {
            VDLogger.log(Logger.Tag.CAMERA_PERMISSION, "onRequestPermissionsResult false");
        }

        @Override // com.veridas.fragment.permission.CapturePermissionAdapter, com.veridas.fragment.permission.CapturePermissionListener
        public final void onCapturePermissionsGranted(Object obj) {
            VDLogger.log(Logger.Tag.CAMERA_PERMISSION, "true");
        }
    }

    public class i implements FragmentExceptionListener {
        @Override // com.veridas.fragment.FragmentExceptionListener
        public final void onException(DasFragment dasFragment, Throwable th2) {
            Log.e(SelfieFragment.d3, th2);
        }
    }

    public class j extends FragmentLifecycleAdapter {
        public j() {
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onBeforeCreated(DasFragment dasFragment, Bundle bundle) {
            SelfieFragment selfieFragment = SelfieFragment.this;
            String str = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
            Context context = selfieFragment.getContext();
            selfieFragment.Q0 = selfieFragment.getDisplaySize();
            DefaultFaceDetectorFactory defaultFaceDetectorFactory = new DefaultFaceDetectorFactory(context, selfieFragment.getBlockingResourcesDatabaseLazy());
            selfieFragment.J0 = defaultFaceDetectorFactory;
            ObjectDetector<SpatialDetectionResult> objectDetectorCreateImageFaceAnalyzer = defaultFaceDetectorFactory.createImageFaceAnalyzer(context);
            selfieFragment.L0 = objectDetectorCreateImageFaceAnalyzer;
            objectDetectorCreateImageFaceAnalyzer.initialize();
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onCreated(DasFragment dasFragment, Bundle bundle) {
            SelfieFragment.g(SelfieFragment.this);
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onDestroyed(DasFragment dasFragment) {
            SelfieFragment.this.destroyed();
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onPaused(DasFragment dasFragment) {
            SelfieFragment selfieFragment = SelfieFragment.this;
            selfieFragment.isRunning.set(false);
            selfieFragment.z(null, false);
            selfieFragment.setSelfieState(SelfieState.SELFIE_CAMERA_RELEASED);
            Logger.Tag tag = Logger.Tag.ON_PAUSE;
            String str = SelfieFragment.d3;
            VDLogger.log(tag, "On paused called in: %s", str);
            selfieFragment.V0 = (CustomAlertDialog) AppUtil.dismiss(selfieFragment.V0);
            selfieFragment.y(null);
            if (selfieFragment.f39582m1 != null) {
                selfieFragment.f39584n1.removeCallbacksAndMessages(null);
                selfieFragment.f39582m1.quit();
                try {
                    selfieFragment.f39582m1.join(30000L);
                    selfieFragment.f39582m1 = null;
                    selfieFragment.f39584n1 = null;
                } catch (InterruptedException e5) {
                    Log.e(str, e5);
                }
            }
            selfieFragment.f39586o1.unregisterListener(selfieFragment);
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onResumed(DasFragment dasFragment) {
            SelfieFragment.this.resumed();
        }
    }

    public class k extends CameraAdapter {

        public class a implements CameraAction {

            /* JADX INFO: renamed from: com.dasnano.vdphotoselfiecapture.fragments.SelfieFragment$k$a$a, reason: collision with other inner class name */
            public class RunnableC0185a implements Runnable {
                public RunnableC0185a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SelfieFragment selfieFragment = SelfieFragment.this;
                    String str = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
                    selfieFragment.N();
                }
            }

            public a() {
            }

            @Override // com.veridas.camera.CameraAction
            public final void execute(boolean z10) {
                SelfieFragment.this.runOnUiThread(new RunnableC0185a());
            }
        }

        public k() {
        }

        @Override // com.veridas.camera.CameraAdapter, com.veridas.camera.CameraListener
        public final void onMediaRecorderInitialized(Camera camera, MediaRecorder mediaRecorder) {
            new Handler(Looper.getMainLooper()).postDelayed(new androidx.camera.core.processing.a(this, camera, 2), 200L);
        }

        @Override // com.veridas.camera.CameraAdapter, com.veridas.camera.CameraListener
        public final void onParametersChanged(Camera camera) {
            int i10;
            CameraProperties properties = camera.getProperties();
            Resolution previewResolution = properties.getPreviewResolution();
            Resolution pictureResolution = properties.getPictureResolution();
            int i11 = 4;
            int i12 = 3;
            VDLogger.log(Logger.Tag.OPEN_CAMERA, "Preview size: %dx%d; Capture size: %dx%d", Integer.valueOf(previewResolution.width), Integer.valueOf(previewResolution.height), Integer.valueOf(pictureResolution.width), Integer.valueOf(pictureResolution.height));
            SelfieFragment selfieFragment = SelfieFragment.this;
            String str = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
            selfieFragment.C();
            SelfieFragment selfieFragment2 = SelfieFragment.this;
            Point correctedDisplaySize = selfieFragment2.getCorrectedDisplaySize();
            int i13 = selfieFragment2.Q0.x;
            int i14 = selfieFragment2.Q0.y;
            float f6 = (correctedDisplaySize.y - i14) / 2.0f;
            float f10 = (correctedDisplaySize.x - i13) / 2.0f;
            int i15 = i13 / 2;
            int i16 = i14 / 2;
            if (selfieFragment2.P1) {
                selfieFragment2.X0 = i14;
                i10 = i14 / 9;
                i11 = 3;
            } else {
                selfieFragment2.X0 = i13;
                i10 = i13 / 6;
            }
            int i17 = i10 * i11;
            int i18 = (int) (i17 / 0.8f);
            int i19 = (((int) f10) + i15) - (i17 / 2);
            int i20 = (((int) f6) + i16) - (i18 / 2);
            Rect rect = new Rect(i19, i20, i17 + i19, i18 + i20);
            selfieFragment2.W0 = rect;
            if (selfieFragment2.f39599w1) {
                selfieFragment2.Y0.setRect(-1, rect, selfieFragment2.X0);
                selfieFragment2.Y0.setVisibility(0);
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) selfieFragment2.f39566e1.getLayoutParams();
            if (correctedDisplaySize.x > selfieFragment2.Q0.x) {
                selfieFragment2.C1.setX(((correctedDisplaySize.x - selfieFragment2.Q0.x) / 2) + 25.0f);
                selfieFragment2.C1.setY(25.0f);
                if (selfieFragment2.f39566e1 != null) {
                    layoutParams.setMargins((int) (((correctedDisplaySize.x - selfieFragment2.Q0.x) / 2) + 25.0f), 0, (int) (((correctedDisplaySize.x - selfieFragment2.Q0.x) / 2) + 25.0f), selfieFragment2.getNavBarHeight());
                    selfieFragment2.f39566e1.setLayoutParams(layoutParams);
                }
            } else {
                selfieFragment2.C1.setX(25.0f);
                selfieFragment2.C1.setY(25.0f);
                layoutParams.setMargins(layoutParams.leftMargin, 0, layoutParams.rightMargin, selfieFragment2.getNavBarHeight());
            }
            if (!selfieFragment2.f39597v1) {
                selfieFragment2.f39601x1 = false;
                if (selfieFragment2.f39599w1) {
                    selfieFragment2.f39603y1.setReferenceRect(selfieFragment2.W0);
                    selfieFragment2.f39603y1.setVisibility(0);
                }
            } else if (selfieFragment2.f39601x1) {
                selfieFragment2.f39603y1.setVisibility(0);
            }
            if (selfieFragment2.f39583m2) {
                int iRound = (int) Math.round(((double) (selfieFragment2.P1 ? selfieFragment2.Q0.y : selfieFragment2.Q0.x)) * 0.09d);
                FragmentActivity activity = selfieFragment2.getActivity();
                Resources resources = activity.getResources();
                ImageButton imageButton = new ImageButton(activity);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iRound, iRound);
                imageButton.setLayoutParams(layoutParams2);
                Bitmap bitmapDecodeResource = selfieFragment2.X1 ? BitmapFactory.decodeResource(resources, resources.getIdentifier(selfieFragment2.K2, PluginUtils.IDENTIFIER_DRAWABLE, activity.getPackageName())) : BitmapFactory.decodeResource(resources, R.drawable.vd_photo_closebutton);
                int width = bitmapDecodeResource.getWidth();
                int height = bitmapDecodeResource.getHeight();
                float f11 = ((ViewGroup.LayoutParams) layoutParams2).width / width;
                float f12 = ((ViewGroup.LayoutParams) layoutParams2).height / height;
                Matrix matrix = new Matrix();
                matrix.postScale(f11, f12);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeResource, 0, 0, width, height, matrix, true);
                float f13 = iRound * 0.2f;
                float fRound = Math.round(((selfieFragment2.U0.getWidth() + ((selfieFragment2.getCorrectedDisplaySize().x - selfieFragment2.Q0.x) / 2)) - iRound) - f13);
                float fRound2 = Math.round(f13);
                imageButton.setBackgroundColor(0);
                imageButton.setImageBitmap(bitmapCreateBitmap);
                imageButton.setX(fRound);
                imageButton.setY(fRound2);
                imageButton.setOnClickListener(new w5.a(selfieFragment2, i12));
                selfieFragment2.U0.addView(imageButton);
            }
            SelfieFragment.this.I();
            SelfieFragment.this.U0.requestLayout();
        }

        @Override // com.veridas.camera.CameraAdapter, com.veridas.camera.CameraListener
        public final void onPictureReady(Camera camera, Picture picture) {
            String str = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
            SelfieFragment selfieFragment = SelfieFragment.this;
            selfieFragment.getClass();
            CameraProperties properties = camera.getProperties();
            if (!selfieFragment.f39571g2) {
                selfieFragment.setSelfieState(SelfieState.SELFIE_PICTURE_TAKEN);
                selfieFragment.M();
            }
            VDLogger.log(Logger.Tag.FACE_CAPTURED, "Face has been captured.");
            if (selfieFragment.f39593s2 == 0) {
                VDLogger.log(Logger.Tag.CAPTURE_RESIZED, "false");
            } else {
                VDLogger.log(Logger.Tag.CAPTURE_RESIZED, "true");
            }
            selfieFragment.f39584n1.post(new com.dasnano.vdphotoselfiecapture.fragments.m(selfieFragment, properties, picture));
        }

        @Override // com.veridas.camera.CameraAdapter, com.veridas.camera.CameraListener
        public final void onPreviewReady(Camera camera, Picture picture) {
            String str = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
            SelfieFragment selfieFragment = SelfieFragment.this;
            selfieFragment.getClass();
            try {
                if (selfieFragment.r(picture)) {
                    selfieFragment.requestFrame(picture);
                }
            } catch (RuntimeException e5) {
                Log.e(SelfieFragment.d3, e5);
            }
        }

        @Override // com.veridas.camera.CameraAdapter, com.veridas.camera.CameraListener
        public final void onStarted(Camera camera) {
            BiggestCaptureResolutionSelectionStrategy biggestCaptureResolutionSelectionStrategy = new BiggestCaptureResolutionSelectionStrategy();
            DefaultPreviewResolutionSelectionStrategy defaultPreviewResolutionSelectionStrategy = new DefaultPreviewResolutionSelectionStrategy();
            camera.setPreviewMode(Camera.PreviewMode.PULL);
            camera.createParametersBuilder().setCaptureResolutionSelectionStrategy(biggestCaptureResolutionSelectionStrategy).setColorEffectMode(Parameter.ColorEffectMode.NONE).setFocusMode(SelfieFragment.f39554a3).setSceneMode(Parameter.SceneMode.AUTO).setPreferredCaptureResolution(SelfieFragment.f39558f3).setCaptureMode(Parameter.CaptureMode.PICTURE).setPreferredPreviewResolution(Resolution.OPTIMAL_ASPECT_RATIO).setPreviewResolutionSelectionStrategy(defaultPreviewResolutionSelectionStrategy).setJpegQualityLevel(100).setMeteringArea(new MeteringArea(-200, -200, 400, 400, 1000)).setWhiteBalanceMode(Parameter.WhiteBalanceMode.AUTO).build().apply(new a());
        }
    }

    public class l extends CapturePermissionDialogAdapter {
        public l() {
        }

        @Override // com.veridas.fragment.permission.CapturePermissionDialogAdapter, com.veridas.fragment.permission.CapturePermissionDialogListener
        public final void onCapturePermissionsShow(AlertDialog alertDialog) {
            if (alertDialog != null) {
                int color = SelfieFragment.this.getResources().getColor(R.color.vd_photo_dialogButton);
                alertDialog.getButton(-1).setTextColor(color);
                alertDialog.getButton(-2).setTextColor(color);
            }
        }

        @Override // com.veridas.fragment.permission.CapturePermissionDialogAdapter, com.veridas.fragment.permission.CapturePermissionDialogListener
        public final void onClickCapturePermissionsDenied(AlertDialog alertDialog) {
            VDLogger.log(Logger.Tag.CAMERA_PERMISSION, "permission rationale false");
            String str = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
            SelfieFragment.this.O(null);
        }
    }

    public class m implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Action f39625p0;

        public class a implements RequestListener<GifDrawable> {

            /* JADX INFO: renamed from: com.dasnano.vdphotoselfiecapture.fragments.SelfieFragment$m$a$a, reason: collision with other inner class name */
            public class RunnableC0186a implements Runnable {
                public RunnableC0186a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SelfieFragment.this.B1.setVisibility(8);
                }
            }

            public a() {
            }

            public final void finalize() throws Throwable {
                super.finalize();
            }

            @Override // com.bumptech.glide.request.RequestListener
            public final boolean onLoadFailed(@Nullable GlideException glideException, Object obj, Target<GifDrawable> target, boolean z10) {
                SelfieFragment.this.runOnUiThread(new RunnableC0186a());
                return false;
            }

            @Override // com.bumptech.glide.request.RequestListener
            public final boolean onResourceReady(GifDrawable gifDrawable, Object obj, Target<GifDrawable> target, DataSource dataSource, boolean z10) {
                GifDrawable gifDrawable2 = gifDrawable;
                gifDrawable2.setVisible(true, true);
                gifDrawable2.setLoopCount(1);
                return false;
            }
        }

        public m(Action action) {
            this.f39625p0 = action;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int helpAnimation = this.f39625p0.getHelpAnimation();
            SelfieFragment selfieFragment = SelfieFragment.this;
            if (helpAnimation == 0 || !selfieFragment.f39577j2) {
                selfieFragment.B1.setVisibility(4);
                return;
            }
            Glide.get(selfieFragment.getContext()).clearMemory();
            Glide.with(selfieFragment.getActivity()).asGif().mo4905load(Integer.valueOf(helpAnimation)).apply((BaseRequestOptions<?>) RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE)).listener(new a()).into(selfieFragment.B1);
            selfieFragment.B1.setVisibility(0);
        }
    }

    public static class n extends Animation {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final float f39629p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final float f39630q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TextView f39631r0;

        public n(TextView textView, float f6, float f10) {
            this.f39631r0 = textView;
            this.f39630q0 = f6;
            this.f39629p0 = f10;
        }

        @Override // android.view.animation.Animation
        public final void applyTransformation(float f6, Transformation transformation) {
            float f10 = this.f39630q0;
            float f11 = this.f39629p0;
            float fA = androidx.datastore.preferences.protobuf.e.a(f10, f11, f6, f11);
            TextView textView = this.f39631r0;
            textView.setTextSize(fA);
            textView.requestLayout();
        }

        @Override // android.view.animation.Animation
        public final boolean willChangeBounds() {
            return true;
        }
    }

    static {
        Resolution resolution = Resolution.HD_169;
        f39557e3 = resolution;
        f39558f3 = resolution;
    }

    public SelfieFragment() {
        new ArrayList();
        this.r1 = new float[9];
        this.f39592s1 = 0.0f;
        this.f39594t1 = VDConstantDefinition.TemplateProximity.NOT_FOUND;
        this.f39596u1 = false;
        this.f39597v1 = true;
        this.f39599w1 = true;
        this.f39601x1 = true;
        this.f39603y1 = null;
        this.f39605z1 = null;
        this.A1 = null;
        this.B1 = null;
        this.C1 = null;
        this.D1 = false;
        this.E1 = 0.0d;
        this.F1 = 0.0d;
        this.G1 = -100.0d;
        this.H1 = 100.0d;
        this.I1 = new AtomicLong(0L);
        this.J1 = SmileState.SELFIE_SMILING_REQUEST;
        this.K1 = new Object();
        this.L1 = new Object();
        this.M1 = new Object();
        this.N1 = new Object();
        this.O1 = true;
        this.P1 = false;
        this.R1 = null;
        this.S1 = 0L;
        this.T1 = false;
        this.U1 = null;
        this.Y2 = new h();
        addExceptionListener(new i());
        addLifecycleListener(new j());
    }

    public static /* synthetic */ void c(SelfieFragment selfieFragment) {
        Challenge challenge = ((VDPhotoSelfieViewModel) selfieFragment.viewModel).getChallengeToken().getChallenge();
        challenge.resetStartDetectionTime();
        challenge.setTimeoutSeconds(selfieFragment.D2, selfieFragment.E2);
    }

    public static /* synthetic */ void d(SelfieFragment selfieFragment, byte[] bArr, int i10, int i11, int i12) {
        SpatialDetectionResult spatialDetectionResultRequest;
        selfieFragment.getClass();
        Bitmap bitmapCreateRotatedBitmap = ImageUtils.createRotatedBitmap(ImageUtils.createBitmapFromYuv(bArr, i10, i11), i12);
        Request requestBuild = new Request.Builder().frame(Frame.createRgb(bitmapCreateRotatedBitmap, 0)).objectIdentifiers(CollectionUtils.listOf("face")).build();
        synchronized (selfieFragment) {
            try {
                spatialDetectionResultRequest = selfieFragment.L0.request(requestBuild);
            } catch (Exception e5) {
                Log.e(d3, e5);
                spatialDetectionResultRequest = null;
            }
        }
        byte[] bArrV = selfieFragment.v(bitmapCreateRotatedBitmap);
        ArtifactClass artifactClass = ArtifactClass.SELFIE;
        String strF = selfieFragment.F(artifactClass, TypedValues.AttributesType.S_FRAME, bArrV);
        Rectangle candidate = spatialDetectionResultRequest.getCandidate();
        String strF2 = candidate.isNotEmpty() ? selfieFragment.F(artifactClass, "cropped_frame", selfieFragment.x(bitmapCreateRotatedBitmap, candidate)) : strF;
        ((VDPhotoSelfieViewModel) selfieFragment.viewModel).setFrameImagePath(strF);
        ((VDPhotoSelfieViewModel) selfieFragment.viewModel).setCroppedFrameImagePath(strF2);
    }

    public static void e(SelfieFragment selfieFragment, Runnable runnable) {
        selfieFragment.camera.initializeMediaRecorder(new com.dasnano.vdphotoselfiecapture.fragments.f(selfieFragment, runnable));
    }

    public static void f(SelfieFragment selfieFragment) {
        if (selfieFragment.W1) {
            if (((VDPhotoSelfieViewModel) selfieFragment.viewModel).getChallengeToken() == null) {
                String frameImagePath = ((VDPhotoSelfieViewModel) selfieFragment.viewModel).getFrameImagePath();
                String croppedFrameImagePath = ((VDPhotoSelfieViewModel) selfieFragment.viewModel).getCroppedFrameImagePath();
                Intent intent = new Intent(FRAME_CAPTURED);
                intent.putExtra(FRAME_SELFIE_PATH, frameImagePath);
                intent.putExtra(FRAME_FACE_PATH, croppedFrameImagePath);
                selfieFragment.broadcastIntent(intent);
            } else {
                Intent intent2 = new Intent(CHALLENGE_CAPTURED);
                intent2.putExtra(CHALLENGE_VIDEO_PATH, (String) null);
                intent2.putExtra(CHALLENGE_VTT, (String) null);
                selfieFragment.broadcastIntent(intent2);
            }
        }
        selfieFragment.s();
        selfieFragment.G(true);
        if (selfieFragment.f39575i2) {
            return;
        }
        selfieFragment.t(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g(SelfieFragment selfieFragment) {
        String str = d3;
        VDPhotoSelfieConfiguration vDPhotoSelfieConfiguration = (VDPhotoSelfieConfiguration) selfieFragment.getConfiguration();
        try {
            selfieFragment.H2 = vDPhotoSelfieConfiguration.getString("alertstyle");
            selfieFragment.I2 = vDPhotoSelfieConfiguration.getString(VDPhotoSelfieConfiguration.BRING_CLOSER_FACE_TEXT);
            selfieFragment.J2 = vDPhotoSelfieConfiguration.getString(VDPhotoSelfieConfiguration.CENTER_FACE_TEXT);
            selfieFragment.K2 = vDPhotoSelfieConfiguration.getString("closebuttonimage");
            selfieFragment.f39593s2 = vDPhotoSelfieConfiguration.getInteger(VDPhotoSelfieConfiguration.DESIRED_WIDTH);
            selfieFragment.f39595t2 = vDPhotoSelfieConfiguration.getColor(VDPhotoSelfieConfiguration.FACE_DETECTED_NOT_CENTERED_COLOR);
            selfieFragment.u2 = vDPhotoSelfieConfiguration.getColor(VDPhotoSelfieConfiguration.FACE_DETECTED_OK_COLOR);
            selfieFragment.L2 = vDPhotoSelfieConfiguration.getString(VDPhotoSelfieConfiguration.FACE_TIGHTNESS);
            selfieFragment.f39583m2 = vDPhotoSelfieConfiguration.getBoolean("closebutton");
            selfieFragment.X1 = !vDPhotoSelfieConfiguration.getString("closebuttonimage").equals("undefined");
            selfieFragment.V1 = vDPhotoSelfieConfiguration.getBoolean("fixedoval");
            selfieFragment.W1 = vDPhotoSelfieConfiguration.getBoolean(VDPhotoSelfieConfiguration.LIVE_PHOTO);
            selfieFragment.Y1 = vDPhotoSelfieConfiguration.getBoolean(VDPhotoSelfieConfiguration.ORIENTATION_OPACITY);
            selfieFragment.Z1 = vDPhotoSelfieConfiguration.getBoolean(VDPhotoSelfieConfiguration.SMILE_TIMEOUT);
            selfieFragment.M2 = vDPhotoSelfieConfiguration.getString("infoalert");
            selfieFragment.N2 = vDPhotoSelfieConfiguration.getString("infoalerttitle");
            selfieFragment.f39600w2 = vDPhotoSelfieConfiguration.getColor(VDPhotoSelfieConfiguration.INFORMATIVE_TEXT_BACKGROUND_COLOR);
            selfieFragment.f39598v2 = vDPhotoSelfieConfiguration.getColor("informativetextcolor");
            selfieFragment.f39560a2 = vDPhotoSelfieConfiguration.getString("facing").equalsIgnoreCase("back");
            selfieFragment.f39562b2 = vDPhotoSelfieConfiguration.getBoolean("faceshapeoval");
            selfieFragment.f39564c2 = vDPhotoSelfieConfiguration.getString(VDPhotoSelfieConfiguration.QUALITY_LEVEL).equalsIgnoreCase("medium");
            selfieFragment.d2 = vDPhotoSelfieConfiguration.getBoolean("mobileoval");
            selfieFragment.f39567e2 = !selfieFragment.H2.equalsIgnoreCase("white");
            selfieFragment.f39581l2 = vDPhotoSelfieConfiguration.getBoolean(VDPhotoSelfieConfiguration.SMART_SELFIE);
            selfieFragment.O2 = vDPhotoSelfieConfiguration.getString(VDPhotoSelfieConfiguration.JWS_TOKEN);
            selfieFragment.f39602x2 = vDPhotoSelfieConfiguration.getColor(VDPhotoSelfieConfiguration.MOBILE_OVAL_COLOR);
            selfieFragment.f39604y2 = vDPhotoSelfieConfiguration.getColor(VDPhotoSelfieConfiguration.ORIENTATION_BACKGROUND_COLOR);
            selfieFragment.f39606z2 = vDPhotoSelfieConfiguration.getColor(VDPhotoSelfieConfiguration.BACKGROUND_COLOR);
            selfieFragment.P2 = vDPhotoSelfieConfiguration.getString("permissionrefused");
            selfieFragment.Q2 = vDPhotoSelfieConfiguration.getString("permissionrefusedtitle");
            selfieFragment.R2 = vDPhotoSelfieConfiguration.getString("positivebuttontext");
            selfieFragment.A2 = vDPhotoSelfieConfiguration.getColor(VDPhotoSelfieConfiguration.SELFIEALIVE_ARROW_COLOR);
            selfieFragment.f39573h2 = vDPhotoSelfieConfiguration.getBoolean("infoalertshow");
            selfieFragment.f39575i2 = vDPhotoSelfieConfiguration.getBoolean(VDPhotoSelfieConfiguration.SHOW_SELFIE);
            selfieFragment.f39579k2 = vDPhotoSelfieConfiguration.getBoolean(VDPhotoSelfieConfiguration.SELFIEALIVE_SHOW_ARROWS);
            selfieFragment.f39577j2 = vDPhotoSelfieConfiguration.getBoolean(VDPhotoSelfieConfiguration.SELFIEALIVE_SHOW_GIF);
            selfieFragment.U2 = vDPhotoSelfieConfiguration.getString(VDPhotoSelfieConfiguration.SMILE_REQUEST_MORE_SERIOUS);
            selfieFragment.V2 = vDPhotoSelfieConfiguration.getString(VDPhotoSelfieConfiguration.SMILE_REQUEST_MORE_SMILE);
            selfieFragment.S2 = vDPhotoSelfieConfiguration.getString(VDPhotoSelfieConfiguration.SMILE_REQUEST_SERIOUS);
            vDPhotoSelfieConfiguration.getString(VDPhotoSelfieConfiguration.SMILE_REQUEST_SERIOUS_IMAGE);
            selfieFragment.T2 = vDPhotoSelfieConfiguration.getString(VDPhotoSelfieConfiguration.SMILE_REQUEST_SMILE);
            vDPhotoSelfieConfiguration.getString(VDPhotoSelfieConfiguration.SMILE_REQUEST_SMILE_IMAGE);
            selfieFragment.F2 = vDPhotoSelfieConfiguration.getLong(VDPhotoSelfieConfiguration.SMILE_TIMEOUT_SECONDS) * 1000;
            selfieFragment.G2 = vDPhotoSelfieConfiguration.getLong(VDPhotoSelfieConfiguration.SMILE_WARNING_SECONDS) * 1000;
            selfieFragment.B2 = vDPhotoSelfieConfiguration.getColor("tickcirclecolor");
            selfieFragment.C2 = vDPhotoSelfieConfiguration.getColor("tickcolor");
            vDPhotoSelfieConfiguration.getString(VDPhotoSelfieConfiguration.VIDEO_QUALITY);
            selfieFragment.f39585n2 = vDPhotoSelfieConfiguration.getBoolean(VDPhotoSelfieConfiguration.ALLOW_CHALLENGE_RETRY);
            selfieFragment.W2 = vDPhotoSelfieConfiguration.getString(VDPhotoSelfieConfiguration.SEARCHING_FACE_STEP_INSTRUCTION);
            selfieFragment.f39588p2 = vDPhotoSelfieConfiguration.getBoolean(VDPhotoSelfieConfiguration.TICK_SHOW);
            selfieFragment.D2 = vDPhotoSelfieConfiguration.getInteger(VDPhotoSelfieConfiguration.NGAS_FIRSTMOVEMENT_TIMEOUT);
            selfieFragment.E2 = vDPhotoSelfieConfiguration.getInteger(VDPhotoSelfieConfiguration.NGAS_TIMEOUT);
            selfieFragment.f39590q2 = vDPhotoSelfieConfiguration.getBoolean(VDPhotoSelfieConfiguration.FINAL_TUTORIAL_ALERT_SHOW);
            selfieFragment.X2 = vDPhotoSelfieConfiguration.getString(VDPhotoSelfieConfiguration.DEVICE_INCORRECT_POSITION);
            selfieFragment.f39591r2 = vDPhotoSelfieConfiguration.getBoolean(VDPhotoSelfieConfiguration.VERIDAS_LOGO_SHOW);
            selfieFragment.f39569f2 = vDPhotoSelfieConfiguration.isSelfieAlive() || vDPhotoSelfieConfiguration.isSelfieAlivePro();
            selfieFragment.f39571g2 = vDPhotoSelfieConfiguration.isSelfieAlivePro();
            selfieFragment.o2 = vDPhotoSelfieConfiguration.mustSaveToLocal();
        } catch (IllegalColorValueException e5) {
            e = e5;
            Log.e(str, e);
        } catch (PropertyNameNotFoundException e7) {
            e = e7;
            Log.e(str, e);
        }
        Context applicationContext = selfieFragment.getContext().getApplicationContext();
        ObjectDetector<SequentialDetectionResult> objectDetector = selfieFragment.K0;
        if (objectDetector != null) {
            objectDetector.finish();
        }
        ObjectDetector<SequentialDetectionResult> objectDetectorCreateImageFaceDetector = selfieFragment.J0.createImageFaceDetector(applicationContext);
        selfieFragment.K0 = objectDetectorCreateImageFaceDetector;
        objectDetectorCreateImageFaceDetector.initialize();
        try {
            String strSaveMp4InPrivateLocation = Util.saveMp4InPrivateLocation(selfieFragment.requireActivity(), new byte[0], ClientData.KEY_CHALLENGE);
            ((VDPhotoSelfieViewModel) selfieFragment.viewModel).setChallengeVideoPath(strSaveMp4InPrivateLocation);
            Util.deleteRecursive(new File(strSaveMp4InPrivateLocation));
        } catch (IOException | IllegalStateException e10) {
            Log.e(str, e10);
        }
        selfieFragment.addCapturePermissionListener(selfieFragment.Y2);
        selfieFragment.P1 = ((VDPhotoSelfieViewModel) selfieFragment.viewModel).getDisplayOrientation() == DisplayOrientation.LANDSCAPE;
        if (selfieFragment.f39560a2) {
            selfieFragment.O1 = false;
        }
        selfieFragment.B(selfieFragment.O2);
    }

    public static void h(SelfieFragment selfieFragment, String str) {
        selfieFragment.Z0.setText(HtmlCompat.fromHtml(str, 0));
        selfieFragment.f39559a1.setText(HtmlCompat.fromHtml(str, 0));
        selfieFragment.f39561b1.setText(HtmlCompat.fromHtml(str, 0));
    }

    public static void i(SelfieFragment selfieFragment) {
        if (!selfieFragment.P1) {
            TextView textView = selfieFragment.Z0;
            textView.startAnimation(w(textView, true));
        } else {
            TextView textView2 = selfieFragment.f39559a1;
            textView2.startAnimation(w(textView2, false));
            TextView textView3 = selfieFragment.f39561b1;
            textView3.startAnimation(w(textView3, false));
        }
    }

    public static AnimationSet w(TextView textView, boolean z10) {
        float f6 = z10 ? 110.0f : 160.0f;
        float f10 = z10 ? 100.0f : 140.0f;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(400L);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setStartOffset(0L);
        n nVar = new n(textView, f6, f10);
        nVar.setDuration(400L);
        nVar.setFillAfter(true);
        nVar.setStartOffset(0L);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(nVar);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    public final byte[] A(byte[] bArr, ArtifactClass artifactClass) {
        try {
            byte[] bArrHashString = IntegrityCalculation.INSTANCE.hashString(artifactClass.getClassName().getBytes(), "SHA-256");
            byte[] bArr2 = new byte[bArr.length + bArrHashString.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            System.arraycopy(bArrHashString, 0, bArr2, bArr.length, bArrHashString.length);
            return ExifMetadataIO.writePhotoSelfieCaptureMetadata(requireContext(), BuildConfig.VERSION_NAME, bArr2, this.f39569f2);
        } catch (IllegalStateException e5) {
            Log.e(d3, e5);
            return bArr;
        }
    }

    public final void B(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            ((VDPhotoSelfieViewModel) this.viewModel).setChallengeJWSToken(str);
            ((VDPhotoSelfieViewModel) this.viewModel).setChallengeToken(Token.getTokenFromJWS(str));
        } catch (Exception unused) {
            VDLogger.log(Logger.Tag.ERROR, getString(R.string.vd_photo_error_cant_decode_token));
        }
    }

    public final void C() {
        Point correctedDisplaySize = getCorrectedDisplaySize();
        int i10 = (correctedDisplaySize.x - this.Q0.x) / 2;
        int i11 = (correctedDisplaySize.y - this.Q0.y) / 2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(correctedDisplaySize.x, correctedDisplaySize.y);
        int i12 = -i10;
        int i13 = -i11;
        layoutParams.setMargins(i12, i13, i12, i13);
        this.U0.setLayoutParams(layoutParams);
        this.U0.requestLayout();
        this.f39565d1.setPadding(i10, i11, i10, i11);
    }

    public final void D() {
        Token challengeToken = ((VDPhotoSelfieViewModel) this.viewModel).getChallengeToken();
        if (challengeToken != null) {
            for (Action action : challengeToken.getChallenge().getActions()) {
                action.resetParameters();
            }
        }
    }

    public final synchronized void E() {
        requestFrame(this.U1);
    }

    public final synchronized String F(ArtifactClass artifactClass, String str, byte[] bArr) {
        String strSaveJpgInPrivateLocation;
        try {
            strSaveJpgInPrivateLocation = Util.saveJpgInPrivateLocation(requireActivity(), A(bArr, artifactClass), str);
        } catch (IOException | IllegalStateException e5) {
            Log.e(d3, e5);
            strSaveJpgInPrivateLocation = null;
        }
        return strSaveJpgInPrivateLocation;
    }

    public final void G(boolean z10) {
        if (this.o2) {
            Utils.saveData((VDPhotoSelfieViewModel) this.viewModel, z10);
        }
    }

    public final void H(CountDownState countDownState) {
        if (this.isRunning.get()) {
            runOnUiThread(new f(countDownState));
        }
    }

    public final void I() {
        int i10 = this.Q0.x / 11;
        TextView textView = (TextView) this.U0.findViewById(R.id.landscape_countdown_text_view_left);
        this.f39559a1 = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) this.U0.findViewById(R.id.vd_photo_landscape_countdown_text_view_right);
        this.f39561b1 = textView2;
        textView2.setTextColor(-1);
        TextView textView3 = (TextView) this.U0.findViewById(R.id.vd_photo_countdown_text_view);
        this.Z0 = textView3;
        textView3.setTextColor(-1);
        if (this.P1) {
            int width = (this.f39559a1.getWidth() / 2) + i10;
            ((ViewGroup.MarginLayoutParams) this.f39559a1.getLayoutParams()).setMargins(width, 0, 0, 0);
            ((ViewGroup.MarginLayoutParams) this.f39561b1.getLayoutParams()).setMargins(0, 0, width, 0);
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.Z0.getLayoutParams();
        layoutParams.addRule(8, 0);
        layoutParams.addRule(15, R.id.vd_photo_face_oval);
        this.Z0.setLayoutParams(layoutParams);
    }

    public final void J() {
        this.Z0.setVisibility(4);
        this.f39559a1.setVisibility(4);
        this.f39561b1.setVisibility(4);
    }

    public final void K(String str) {
        runOnUiThread(new a(str));
    }

    public final void L() {
        if (this.isRunning.get()) {
            runOnUiThread(new c());
        }
    }

    public final void M() {
        if (this.isRunning.get()) {
            runOnUiThread(new com.dasnano.vdphotoselfiecapture.fragments.n(this));
        }
    }

    public final void N() {
        if (this.M0 || !this.f39573h2) {
            setSelfieState(SelfieState.SELFIE_CALCULATING_FPS);
            requestFrame();
        } else {
            setSelfieState(SelfieState.SELFIE_WAITING_FOR_CONFIRMATION);
            this.M0 = true;
            this.dialogRegistry.createAlertDialogBuilder().context(requireActivity()).createAlertDialog().style(this.H2).fallbackThemeId(R.style.VeridasDialog).title(this.N2).message(this.M2).cancelable(false).positiveButtonClickButtonListener(new DialogInterface.OnClickListener() { // from class: com.dasnano.vdphotoselfiecapture.fragments.e
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    String str = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
                    this.f39660p0.N();
                }
            }).positiveButtonText(this.R2).positiveButtonTextColor(getResources().getColor(R.color.vd_photo_dialogButton)).build().show();
        }
    }

    public final void O(final androidx.appcompat.app.f fVar) {
        this.isRunning.set(false);
        final Camera camera = this.camera;
        if (camera != null) {
            camera.stopMediaRecorder(new CameraAction() { // from class: com.dasnano.vdphotoselfiecapture.fragments.c
                @Override // com.veridas.camera.CameraAction
                public final void execute(boolean z10) {
                    String str = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
                    SelfieFragment selfieFragment = this.f39657p0;
                    selfieFragment.getClass();
                    camera.stopPreview(new com.bbva.cellscore.reactor.d(selfieFragment, fVar));
                }
            });
        } else {
            runOnUiThread(new b0(this, fVar, 2));
        }
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public CapturePermissionDialogListener createCapturePermissionDialogListener() {
        return new l();
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public AlertDialog.Builder createPermissionDialogBuilder() {
        FragmentActivity activity = getActivity();
        AlertDialog.Builder builder = this.f39567e2 ? new AlertDialog.Builder(activity, R.style.VeridasDialog) : new AlertDialog.Builder(activity);
        builder.setMessage(HtmlCompat.fromHtml(this.P2, 0)).setTitle(HtmlCompat.fromHtml(this.Q2, 0));
        return builder;
    }

    public void destroyed() {
        ObjectDetector<SequentialDetectionResult> objectDetector = this.K0;
        if (objectDetector != null) {
            objectDetector.finish();
            this.K0 = null;
        }
        ObjectDetector<SpatialDetectionResult> objectDetector2 = this.L0;
        if (objectDetector2 != null) {
            objectDetector2.finish();
            this.L0 = null;
        }
        this.f39586o1 = null;
        this.R1 = null;
    }

    public void faceDetected() {
        if (this.isRunning.get()) {
            if (this.f39597v1 && !this.f39596u1) {
                E();
                return;
            }
            VDLogger.log(Logger.Tag.FACE_DETECTED, "Face detected");
            if (this.f39571g2) {
                setSelfieState(SelfieState.SELFIE_PRE_SEARCHING_SMILE);
                this.camera.takePicture(new hc.a(this));
            } else if (!this.W1) {
                this.camera.takePicture(new com.dasnano.vdphotoselfiecapture.fragments.b(this));
            } else {
                setSelfieState(SelfieState.SELFIE_PRE_SEARCHING_SMILE);
                E();
            }
        }
    }

    public void finishedFpsCalculation(double d2) {
        if (getSelfieState() == SelfieState.SELFIE_CALCULATING_FPS) {
            setSelfieState(SelfieState.SELFIE_SEARCHING_FACE);
        }
        if (((VDPhotoSelfieViewModel) this.viewModel).getChallengeToken() != null) {
            for (Action action : ((VDPhotoSelfieViewModel) this.viewModel).getChallengeToken().getChallenge().getActions()) {
                action.setValidationActionThresholdFromCameraFPS((int) d2);
            }
        }
    }

    public void forceIsRunningToFalse() {
        this.isRunning.set(false);
    }

    public double getActualSmileValue() {
        double d2;
        synchronized (this.K1) {
            d2 = this.F1;
        }
        return d2;
    }

    public synchronized IBlockingResourcesDatabase getBlockingResourcesDatabaseLazy() {
        try {
            if (this.Z2 == null) {
                this.Z2 = CommonLibraryDepInjector.getBlockingResourcesDatabase(requireContext());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.Z2;
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public CameraListener getCameraListener() {
        return new k();
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public String getCapturePermissionDialogNegativeButtonText() {
        return getResources().getString(android.R.string.cancel);
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public String getCapturePermissionDialogPositiveButtonText() {
        return this.R2;
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public int getCapturePermissionRequestCode() {
        return 1;
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public String[] getCapturePermissions() {
        return this.o2 ? f39556c3 : f39555b3;
    }

    @Override // com.veridas.fragment.DasFragment
    public Class<VDPhotoSelfieConfiguration> getConfigurationClass() {
        return VDPhotoSelfieConfiguration.class;
    }

    public double getMaxSmileValue() {
        double d2;
        synchronized (this.L1) {
            d2 = this.G1;
        }
        return d2;
    }

    public double getMinSmileValue() {
        double d2;
        synchronized (this.M1) {
            d2 = this.H1;
        }
        return d2;
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public View getPreviewSurface() {
        return this.T0;
    }

    public SelfieState getSelfieState() {
        SelfieState selfieState;
        synchronized (this.S0) {
            selfieState = this.S0;
        }
        return selfieState;
    }

    public SmileState getSmileState() {
        SmileState smileState;
        synchronized (this.J1) {
            smileState = this.J1;
        }
        return smileState;
    }

    public double getSmiling() {
        double d2;
        synchronized (this.N1) {
            d2 = this.E1;
        }
        return d2;
    }

    @Override // com.veridas.fragment.DasFragment
    public Class<VDPhotoSelfieViewModel> getViewModelClass() {
        return VDPhotoSelfieViewModel.class;
    }

    @Override // com.veridas.fragment.DasCaptureFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RelativeLayout relativeLayout = (RelativeLayout) layoutInflater.inflate(R.layout.fragment_selfie, viewGroup, false);
        this.U0 = relativeLayout;
        this.T0 = (TextureView) relativeLayout.findViewById(R.id.vd_photo_preview_surface);
        ImageView imageView = (ImageView) this.U0.findViewById(R.id.vd_photo_veridas_logo);
        this.C1 = imageView;
        if (!this.f39591r2) {
            imageView.setVisibility(4);
        }
        this.R1 = MediaPlayer.create(getActivity(), R.raw.vd_photo_sound_ok);
        ImageView imageView2 = (ImageView) this.U0.findViewById(R.id.vd_photo_orientation_guide_image_view);
        this.f39563c1 = imageView2;
        imageView2.setImageResource(R.drawable.smart_selfie_image);
        this.f39563c1.setVisibility(4);
        this.f39572h1 = (ImageView) this.U0.findViewById(R.id.vd_photo_arrow_bottom);
        this.f39574i1 = (ImageView) this.U0.findViewById(R.id.vd_photo_arrow_top);
        this.f39576j1 = (ImageView) this.U0.findViewById(R.id.vd_photo_arrow_left);
        this.f39578k1 = (ImageView) this.U0.findViewById(R.id.vd_photo_arrow_right);
        I();
        RectangleView rectangleView = (RectangleView) this.U0.findViewById(R.id.vd_photo_imageView);
        this.Q1 = rectangleView;
        rectangleView.setColor(this.f39602x2);
        this.Q1.setRatio(0.8f);
        FaceShape faceShape = (FaceShape) this.U0.findViewById(R.id.vd_photo_face_oval);
        this.Y0 = faceShape;
        faceShape.setIsFaceShapeOval(this.f39562b2);
        this.Y0.setRect(-1, this.W0, this.X0);
        this.Y0.setVisibility(4);
        TextView textView = (TextView) this.U0.findViewById(R.id.vd_photo_position_or_smile_text_view);
        this.f39565d1 = textView;
        textView.setTextColor(this.f39598v2);
        this.f39565d1.setBackgroundColor(this.f39600w2);
        this.f39565d1.setGravity(16);
        this.f39566e1 = (LinearLayout) this.U0.findViewById(R.id.vd_photo_position_or_smile_view);
        this.f39570g1 = (RelativeLayout) this.U0.findViewById(R.id.vd_photo_mask_arrow_container);
        this.B1 = (ImageView) this.U0.findViewById(R.id.vd_photo_gifIv);
        this.f39568f1 = (TextView) this.U0.findViewById(R.id.vd_photo_ngas_step_text);
        TranslucentLayer translucentLayer = (TranslucentLayer) this.U0.findViewById(R.id.vd_photo_translucent_layer);
        this.f39603y1 = translucentLayer;
        translucentLayer.setIsFaceShapeOval(this.f39562b2);
        this.f39603y1.setVisibility(4);
        this.f39605z1 = (ImageView) this.U0.findViewById(R.id.vd_photo_tick_view);
        int i10 = this.C2;
        int i11 = this.B2;
        Drawable[] drawableArr = {ContextCompat.getDrawable(getActivity(), R.mipmap.vd_photo_circle), ContextCompat.getDrawable(getActivity(), R.mipmap.vd_photo_tick)};
        try {
            Drawable drawable = drawableArr[0];
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(i11, mode);
            drawableArr[1].setColorFilter(i10, mode);
        } catch (Exception e5) {
            Object[] objArr = {e5.toString()};
            String str = d3;
            Log.e(str, "Exception changing tick colors: %s", objArr);
            Log.e(str, e5);
        }
        this.f39605z1.setImageDrawable(new LayerDrawable(drawableArr));
        this.A1 = (ImageView) this.U0.findViewById(R.id.vd_photo_smile_image_view);
        return this.U0;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (this.f39597v1) {
            int type = sensorEvent.sensor.getType();
            float[] fArr = this.f39589q1;
            float[] fArr2 = this.f39587p1;
            if (type == 1) {
                System.arraycopy(sensorEvent.values, 0, fArr, 0, 3);
            } else if (type == 2) {
                System.arraycopy(sensorEvent.values, 0, fArr2, 0, 3);
            } else if (type == 9) {
                System.arraycopy(sensorEvent.values, 0, fArr, 0, 3);
            }
            float[] fArr3 = this.r1;
            if (SensorManager.getRotationMatrix(fArr3, null, fArr, fArr2)) {
                float degrees = (float) Math.toDegrees((float) Math.acos(fArr3[8]));
                this.f39592s1 = degrees;
                if (this.f39597v1) {
                    if (!this.f39596u1 && degrees >= 80.0f && degrees < 111.0f) {
                        this.f39596u1 = true;
                        VDLogger.log(Logger.Tag.ORIENTATION, "Orientation OK");
                    }
                    if (this.f39596u1) {
                        float f6 = this.f39592s1;
                        if (f6 < 73.0f || f6 > 118.0f) {
                            this.f39596u1 = false;
                            VDLogger.log(Logger.Tag.ORIENTATION, "Orientation KO");
                            templateDistance(VDConstantDefinition.TemplateProximity.NOT_FOUND);
                            y(null);
                        }
                    }
                }
            }
        }
    }

    public final boolean r(Picture picture) {
        SequentialDetectionResult sequentialDetectionResultRequest;
        if (!this.isRunning.get()) {
            return true;
        }
        SelfieState selfieState = getSelfieState();
        this.U1 = picture;
        VDLogger.log("VERIDAS", "analyzePreviewFrame: %s", selfieState);
        if (picture.isEmpty()) {
            VDLogger.log(Logger.Tag.ON_PREVIEW_FRAME, "Image bytes are null");
            return true;
        }
        int rotation = picture.getRotation();
        Point correctedDisplaySize = getCorrectedDisplaySize();
        Token challengeToken = ((VDPhotoSelfieViewModel) this.viewModel).getChallengeToken();
        Frame frame = picture.toFrame();
        SequentialDetectionResult sequentialDetectionResultRequest2 = null;
        if (selfieState == SelfieState.SELFIE_CALCULATING_FPS) {
            K(this.W2);
            try {
                sequentialDetectionResultRequest2 = this.K0.request(new Request.Builder().frame(frame).viewport(Rectangle.from(correctedDisplaySize)).objectIdentifiers(CollectionUtils.listOf("face")).tightness(this.L2).build());
            } catch (Exception e5) {
                Log.e(d3, e5);
            }
            double fps = sequentialDetectionResultRequest2.getFps();
            VDLogger.log(Logger.Tag.FPS, "%.4f", Double.valueOf(fps));
            if (sequentialDetectionResultRequest2.getWarmupComplete()) {
                finishedFpsCalculation(fps);
            }
            return true;
        }
        if (selfieState == SelfieState.SELFIE_SEARCHING_FACE) {
            Rectangle rectangleFrom = Rectangle.from(correctedDisplaySize);
            com.veridas.math.geometry.Matrix matrixViewfinderSpace = new VectorSpace.Builder().frame(Rectangle.from(frame.getNaturalDimensions().toPoint().toPoint())).viewfinder(rectangleFrom).build().viewfinderSpace();
            try {
                sequentialDetectionResultRequest = this.K0.request(new Request.Builder().frame(frame).viewport(rectangleFrom.times(matrixViewfinderSpace)).objectIdentifiers(CollectionUtils.listOf("face")).tightness(this.L2).build());
            } catch (Exception e7) {
                Log.e(d3, e7);
                sequentialDetectionResultRequest = null;
            }
            VDLogger.log(Logger.Tag.FPS, "%.4f", Double.valueOf(sequentialDetectionResultRequest.getFps()));
            boolean z10 = this.f39597v1;
            if (!z10 || this.f39596u1) {
                Rectangle candidate = sequentialDetectionResultRequest.getSpatialDetectionResult().getCandidate();
                if (candidate.isNotEmpty()) {
                    VDLogger.log(Logger.Tag.ON_PREVIEW_FRAME, "Face detected");
                } else {
                    VDLogger.log(Logger.Tag.ON_PREVIEW_FRAME, "Face not detected");
                }
                if (this.d2) {
                    Rect rect = candidate.times(matrixViewfinderSpace.inverse()).toRect();
                    if (!this.f39560a2) {
                        int i10 = correctedDisplaySize.x;
                        rect = new Rect(i10 - rect.right, rect.top, i10 - rect.left, rect.bottom);
                    }
                    y(rect);
                }
                if (this.f39597v1) {
                    L();
                }
            } else if (z10) {
                if (this.d2) {
                    y(null);
                }
                L();
            }
            templateDistance(sequentialDetectionResultRequest.getProximity());
            if (!sequentialDetectionResultRequest.getObjectDetected()) {
                return true;
            }
            faceDetected();
            return false;
        }
        int i11 = 4;
        if (selfieState == SelfieState.SELFIE_PRE_SEARCHING_SMILE) {
            if (this.d2) {
                y(null);
            }
            this.f39597v1 = false;
            Resolution resolution = picture.getResolution();
            this.O0.process(frame.getData(), resolution.width, resolution.height, rotation, new androidx.camera.core.impl.t(this, i11), new androidx.core.view.b0(this, 5));
        } else if (selfieState == SelfieState.SELFIE_CHALLENGE_INIT_CHALLENGE) {
            if (this.d2) {
                y(null);
            }
            this.f39597v1 = false;
            Resolution resolution2 = picture.getResolution();
            this.P0.process(frame.getData(), resolution2.width, resolution2.height, rotation, new com.dasnano.vdphotoselfiecapture.fragments.d(), new androidx.activity.o(this, 1));
        } else {
            int i12 = 3;
            int i13 = 2;
            if (selfieState == SelfieState.SELFIE_CHALLENGE_PRE_ACTION) {
                if (this.N0 >= challengeToken.getChallenge().getActions().length) {
                    setSelfieState(SelfieState.SELFIE_CHALLENGE_FINISHED);
                    z(new androidx.camera.core.processing.m(this, 3), true);
                } else {
                    runOnUiThread(new androidx.camera.core.processing.n(this, challengeToken, i13));
                }
            } else if (selfieState == SelfieState.SELFIE_CHALLENGE_ACTION) {
                Resolution resolution3 = picture.getResolution();
                this.P0.process(frame.getData(), resolution3.width, resolution3.height, rotation, new androidx.room.f(this, i11), new androidx.room.g(this, 2));
            } else if (selfieState == SelfieState.SELFIE_CHALLENGE_FINISHED) {
                VDLogger.log("VERIDAS", "Start video: %s, Start movement: %s", Long.valueOf(this.S1), Long.valueOf(challengeToken.getChallenge().getActions()[0].getChallengeStartDetectionTime()));
            } else if (selfieState == SelfieState.SELFIE_SEARCHING_SMILE) {
                if (this.Z1 && !this.D1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.I1.get();
                    long j10 = this.G2;
                    long j11 = this.F2;
                    double maxSmileValue = getMaxSmileValue() - getMinSmileValue();
                    if (jCurrentTimeMillis > j10 && jCurrentTimeMillis < j11 && maxSmileValue > 0.168d) {
                        SmileState smileState = getSmileState();
                        if (smileState == SmileState.SELFIE_SMILING_REQUEST) {
                            setSmileState(SmileState.SELFIE_SMILE_MORE);
                        } else if (smileState == SmileState.SELFIE_SERIOUS_REQUEST) {
                            setSmileState(SmileState.SELFIE_SERIOUS_MORE);
                        }
                    } else if (jCurrentTimeMillis > j11 || (jCurrentTimeMillis > j10 && maxSmileValue <= 0.168d)) {
                        if (this.f39590q2) {
                            runOnUiThread(new com.dasnano.vdphotoselfiecapture.fragments.k(this, Boolean.FALSE));
                        } else {
                            setSelfieState(SelfieState.SELFIE_WAITING_FOR_CONFIRMATION);
                            t(false);
                        }
                    }
                }
                if (!this.f39597v1 || this.f39596u1) {
                    Resolution resolution4 = picture.getResolution();
                    this.O0.process(frame.getData(), resolution4.width, resolution4.height, rotation, new w1(this, 6), new x1(this, i12));
                }
            }
        }
        return false;
    }

    public void resumed() {
        Sensor defaultSensor;
        boolean z10 = false;
        this.D1 = false;
        this.I1.set(0L);
        setActualSmileValue(0.0d);
        setMaxSmileValue(-100.0d);
        setMinSmileValue(100.0d);
        setSmileState(SmileState.SELFIE_SMILING_REQUEST);
        setSmiling(0.0d);
        FragmentActivity activity = getActivity();
        if (this.f39582m1 == null) {
            HandlerThread handlerThread = new HandlerThread("CameraBackground");
            this.f39582m1 = handlerThread;
            handlerThread.start();
            this.f39584n1 = new Handler(this.f39582m1.getLooper());
        }
        VDLogger.log(Logger.Tag.ON_RESUME, "On resume called in: %s", d3);
        SensorManager sensorManager = (SensorManager) activity.getSystemService("sensor");
        this.f39586o1 = sensorManager;
        Sensor defaultSensor2 = sensorManager.getDefaultSensor(1);
        boolean zRegisterListener = defaultSensor2 != null ? this.f39586o1.registerListener(this, defaultSensor2, 2) : false;
        Sensor defaultSensor3 = this.f39586o1.getDefaultSensor(2);
        boolean zRegisterListener2 = defaultSensor3 != null ? this.f39586o1.registerListener(this, defaultSensor3, 2) : false;
        boolean zRegisterListener3 = (zRegisterListener || (defaultSensor = this.f39586o1.getDefaultSensor(9)) == null) ? false : this.f39586o1.registerListener(this, defaultSensor, 2);
        this.f39597v1 = true;
        if (!zRegisterListener2 || (!zRegisterListener && !zRegisterListener3)) {
            this.f39597v1 = false;
        }
        this.f39597v1 = this.f39581l2 && this.f39597v1;
        this.f39601x1 = this.Y1 && this.f39601x1;
        if (this.V1 && this.f39599w1) {
            z10 = true;
        }
        this.f39599w1 = z10;
        if (this.f39569f2) {
            this.O0 = new SelfieAliveProcessing(this);
            this.P0 = new SelfieAliveProProcessing(this);
        }
        this.isRunning.set(true);
    }

    public final void s() {
        String fullImagePath = ((VDPhotoSelfieViewModel) this.viewModel).getFullImagePath();
        String croppedFullImagePath = ((VDPhotoSelfieViewModel) this.viewModel).getCroppedFullImagePath();
        Intent intent = new Intent(PHOTO_CAPTURED);
        intent.putExtra(PHOTO_SELFIE_PATH, fullImagePath);
        intent.putExtra(PHOTO_FACE_PATH, croppedFullImagePath);
        broadcastIntent(intent);
    }

    @Override // com.dasnano.vdphotoselfiecapture.other.SelfieProcessingProtocol
    public void selfieAliveProProcessed(@NonNull Face face) {
        int i10 = g.f39618b[getSelfieState().ordinal()];
        int i11 = 3;
        if (i10 == 1) {
            if (this.T1) {
                return;
            }
            this.T1 = true;
            androidx.lifecycle.k kVar = new androidx.lifecycle.k(this, i11);
            VDLogger.log("VIDEO", "startChallengeVideoCapture");
            this.camera.createParametersBuilder().setCaptureResolutionSelectionStrategy(new DefaultCaptureResolutionSelectionStrategy(2.0d)).setPreferredPreviewResolution(Resolution.OPTIMAL_ASPECT_RATIO).setPreviewResolutionSelectionStrategy(new DefaultPreviewResolutionSelectionStrategy()).setPreferredCaptureResolution(f39558f3).setCaptureMode(Parameter.CaptureMode.PICTURE_AND_VIDEO).setJpegQualityLevel(100).build().apply(new k1(this, kVar));
            return;
        }
        if (i10 != 2) {
            return;
        }
        Action action = ((VDPhotoSelfieViewModel) this.viewModel).getChallengeToken().getChallenge().getActions()[this.N0];
        boolean z10 = this.f39579k2;
        int i12 = g.f39617a[action.checkFaceAction(this, face, z10 ? this.f39576j1 : null, z10 ? this.f39578k1 : null, z10 ? this.f39574i1 : null, z10 ? this.f39572h1 : null).ordinal()];
        if (i12 == 1) {
            this.N0++;
            setSelfieState(SelfieState.SELFIE_CHALLENGE_PRE_ACTION);
            return;
        }
        if (i12 == 2 || i12 == 3) {
            setSelfieState(SelfieState.SELFIE_WAITING_FOR_CONFIRMATION);
            runOnUiThread(new com.dasnano.vdphotoselfiecapture.fragments.k(this, Boolean.TRUE));
            this.S1 = 0L;
            broadcastIntent(new Intent("com.dasnano.selfieCapture.selfieFragment.challengeRepeated"));
            return;
        }
        if (i12 != 4) {
            return;
        }
        this.R1.start();
        u();
        K(this.f39580l1);
    }

    public void setActualSmileValue(double d2) {
        synchronized (this.K1) {
            this.F1 = d2;
        }
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public void setCameraQueryArguments(CameraQuery cameraQuery) {
        cameraQuery.facing(this.O1 ? Camera.Facing.FRONT : Camera.Facing.BACK).preferAutoFocus(true);
    }

    public void setMaxSmileValue(double d2) {
        synchronized (this.L1) {
            this.G1 = d2;
        }
    }

    public void setMinSmileValue(double d2) {
        synchronized (this.M1) {
            this.H1 = d2;
        }
    }

    public void setSelfieState(SelfieState selfieState) {
        synchronized (this.S0) {
            this.S0 = selfieState;
        }
    }

    public void setSmileState(SmileState smileState) {
        synchronized (this.J1) {
            this.J1 = smileState;
        }
    }

    public void setSmiling(double d2) {
        synchronized (this.N1) {
            this.E1 = d2;
        }
    }

    @Override // com.dasnano.vdphotoselfiecapture.other.SelfieProcessingProtocol
    public void smileProcessed(ByteBuffer byteBuffer, final int i10, final int i11, final int i12, float f6) {
        SelfieState selfieState = getSelfieState();
        SelfieState selfieState2 = SelfieState.SELFIE_SEARCHING_SMILE;
        if (selfieState == selfieState2) {
            double d2 = f6;
            if (this.isRunning.get() && d2 > 0.0d) {
                double maxSmileValue = getMaxSmileValue();
                double minSmileValue = getMinSmileValue();
                double smiling = (getSmiling() * 0.9d) + (0.09999999999999998d * d2);
                setSmiling(smiling);
                if (smiling > maxSmileValue) {
                    setMaxSmileValue(smiling);
                }
                if (smiling < minSmileValue) {
                    setMinSmileValue(smiling);
                }
                SmileState smileState = getSmileState();
                SmileState smileState2 = SmileState.SELFIE_SMILING_REQUEST;
                if (smileState != smileState2 && smiling < 0.2d) {
                    setSmileState(smileState2);
                }
                VDLogger.log(Logger.Tag.SMILE, "%s process with progress: %.8f", smileState.name(), Double.valueOf(smiling));
                if (getMaxSmileValue() - getMinSmileValue() > 0.28d && !this.D1) {
                    this.camera.takePicture();
                    runOnUiThread(new com.dasnano.vdphotoselfiecapture.fragments.l(this));
                    VDLogger.log(Logger.Tag.CAMERA_TAKE_PICTURE, "TAKE PICTURE");
                    this.D1 = true;
                }
            }
            if (this.f39597v1) {
                L();
            } else {
                SmileState smileState3 = getSmileState();
                if (smileState3 == SmileState.SELFIE_SMILING_REQUEST) {
                    this.f39580l1 = this.T2;
                } else if (smileState3 == SmileState.SELFIE_SERIOUS_REQUEST) {
                    this.f39580l1 = this.S2;
                } else if (smileState3 == SmileState.SELFIE_SMILE_MORE) {
                    this.f39580l1 = this.V2;
                } else if (smileState3 == SmileState.SELFIE_SERIOUS_MORE) {
                    this.f39580l1 = this.U2;
                }
            }
            runOnUiThread(new e());
            return;
        }
        if (selfieState == SelfieState.SELFIE_PRE_SEARCHING_SMILE) {
            setActualSmileValue(f6);
            final byte[] bArr = new byte[byteBuffer.capacity()];
            byteBuffer.get(bArr);
            this.f39584n1.post(new Runnable() { // from class: com.dasnano.vdphotoselfiecapture.fragments.a
                @Override // java.lang.Runnable
                public final void run() {
                    SelfieFragment.d(this.f39651p0, bArr, i10, i11, i12);
                }
            });
            double actualSmileValue = getActualSmileValue();
            setSmiling(actualSmileValue);
            if (actualSmileValue > 0.6d) {
                setSmileState(SmileState.SELFIE_SERIOUS_REQUEST);
            } else {
                setSmileState(SmileState.SELFIE_SMILING_REQUEST);
            }
            this.I1.set(System.currentTimeMillis());
            if (!this.f39571g2) {
                setSelfieState(selfieState2);
                return;
            }
            Token challengeToken = ((VDPhotoSelfieViewModel) this.viewModel).getChallengeToken();
            String nextChallenge = VDPhotoSelfieCapture.getNextChallenge();
            if (nextChallenge != null && challengeToken != null) {
                Action action = challengeToken.getChallenge().getActions()[0];
                int validationActionThreshold = action.getValidationActionThreshold();
                int invalidationActionThreshold = action.getInvalidationActionThreshold();
                B(nextChallenge);
                VDPhotoSelfieCapture.updateChallenge(null);
                for (Action action2 : ((VDPhotoSelfieViewModel) this.viewModel).getChallengeToken().getChallenge().getActions()) {
                    action2.setValidationActionThreshold(validationActionThreshold);
                    action2.setInvalidationActionThreshold(invalidationActionThreshold);
                }
            }
            Token challengeToken2 = ((VDPhotoSelfieViewModel) this.viewModel).getChallengeToken();
            if (challengeToken2 == null || challengeToken2.getChallenge().getActions().length <= 0) {
                setSelfieState(SelfieState.SELFIE_SEARCHING_SMILE);
                return;
            }
            this.N0 = 0;
            D();
            this.T1 = false;
            setSelfieState(SelfieState.SELFIE_CHALLENGE_INIT_CHALLENGE);
        }
    }

    public final void t(boolean z10) {
        Intent intent = new Intent(SELFIE_FINISHED);
        intent.putExtra(SELFIE_FINISHED, z10);
        broadcastIntent(intent);
    }

    public void templateDistance(VDConstantDefinition.TemplateProximity templateProximity) {
        if (this.isRunning.get()) {
            runOnUiThread(new d(templateProximity));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.veridas.config.Configuration] */
    public final void u() {
        if (this.isRunning.get()) {
            Action action = ((VDPhotoSelfieViewModel) this.viewModel).getChallengeToken().getChallenge().getActions()[this.N0];
            this.f39580l1 = action.getHelpText(getContext(), getConfiguration());
            runOnUiThread(new m(action));
        }
    }

    public final byte[] v(Bitmap bitmap) {
        int i10 = this.f39564c2 ? 70 : 85;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i10, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public final byte[] x(Bitmap bitmap, Rectangle rectangle) {
        Vector2 dimensions = rectangle.getDimensions();
        Vector2 vector2Multiply = new Vector2(1.4d, 1.8d).multiply(dimensions.getX());
        Vector2 vector2Minus = rectangle.getPosition().minus(vector2Multiply.minus(dimensions).div(2));
        Rectangle rectangle2 = new Rectangle(vector2Minus.getX(), vector2Minus.getY(), vector2Multiply.getX(), vector2Multiply.getY());
        Vector2 position = rectangle2.getPosition();
        Vector2 dimensions2 = rectangle2.getDimensions();
        Vector2 vector2 = new Vector2(Math.min(bitmap.getWidth(), dimensions2.getX() + position.getX()), Math.min(bitmap.getHeight(), dimensions2.getY() + position.getY()));
        return v(Bitmap.createBitmap(bitmap, (int) Math.round(position.getX()), (int) Math.round(position.getY()), (int) Math.round(vector2.getX() - position.getX()), (int) Math.round(vector2.getY() - position.getY())));
    }

    public final void y(Rect rect) {
        if (this.isRunning.get()) {
            runOnUiThread(new b(rect));
        }
    }

    public final void z(androidx.camera.core.processing.m mVar, boolean z10) {
        VDLogger.log("VIDEO", "endChallengeVideoCapture. Success: %b", Boolean.valueOf(z10));
        if (this.camera == null) {
            return;
        }
        runOnUiThread(new com.dasnano.vdphotoselfiecapture.fragments.g(this));
        if (!z10) {
            this.camera.stopMediaRecorder(new com.dasnano.vdphotoselfiecapture.fragments.j(this));
        } else if (this.camera.isRecording()) {
            this.camera.stopMediaRecorder(new com.dasnano.vdphotoselfiecapture.fragments.h(this, mVar));
        } else {
            runOnUiThread(new com.dasnano.vdphotoselfiecapture.fragments.i(this));
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
