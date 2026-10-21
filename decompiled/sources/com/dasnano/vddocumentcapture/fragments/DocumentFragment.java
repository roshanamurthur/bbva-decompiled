package com.dasnano.vddocumentcapture.fragments;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.r1;
import androidx.camera.core.c0;
import androidx.camera.core.u1;
import androidx.core.text.HtmlCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import com.dasnano.vddocumentcapture.GenericDocumentState;
import com.dasnano.vddocumentcapture.R;
import com.dasnano.vddocumentcapture.activities.DocumentClassificationInterface;
import com.dasnano.vddocumentcapture.config.VDDocumentConfiguration;
import com.dasnano.vddocumentcapture.document.DocumentFace;
import com.dasnano.vddocumentcapture.managers.BackgroundThreadsManager;
import com.dasnano.vddocumentcapture.managers.CameraManager;
import com.dasnano.vddocumentcapture.managers.CameraManagerBase;
import com.dasnano.vddocumentcapture.managers.CloseButtonManager;
import com.dasnano.vddocumentcapture.managers.UserVisualHelpManager;
import com.dasnano.vddocumentcapture.model.DocumentClassificationViewModel;
import com.dasnano.vddocumentcapture.other.BubbleWindow;
import com.dasnano.vddocumentcapture.other.TranslucentLayer;
import com.dasnano.vddocumentcapture.other.VDEnums;
import com.dasnano.vddocumentcapture.persist.SaveImageTask;
import com.veridas.bidicode.BidiCodeManager;
import com.veridas.bidicode.IBidiCodeManagerDelegate;
import com.veridas.bidicode.dependencies.AndroidBidiCodeLogger;
import com.veridas.bidicode.dependencies.AndroidVisionBidiCodeFinder;
import com.veridas.bidicode.dependencies.ResourcesBidiCodePlacementsProvider;
import com.veridas.bidicode.entities.BidiCodeRegion;
import com.veridas.camera.Camera;
import com.veridas.camera.CameraAction;
import com.veridas.camera.CameraAdapter;
import com.veridas.camera.CameraException;
import com.veridas.camera.CameraListener;
import com.veridas.camera.CameraQuery;
import com.veridas.camera.picture.Picture;
import com.veridas.config.IllegalColorValueException;
import com.veridas.config.PropertyNameNotFoundException;
import com.veridas.detect.obj.document.DefaultDocumentDetectorFactory;
import com.veridas.detect.spatial.SpatialDetectionResult;
import com.veridas.di.CommonLibraryDepInjector;
import com.veridas.display.DisplayOrientation;
import com.veridas.display.DisplayUtils;
import com.veridas.fragment.DasCaptureFragment;
import com.veridas.fragment.DasFragment;
import com.veridas.fragment.FragmentExceptionListener;
import com.veridas.fragment.FragmentLifecycleAdapter;
import com.veridas.fragment.permission.CapturePermissionAdapter;
import com.veridas.fragment.permission.CapturePermissionDialogAdapter;
import com.veridas.fragment.permission.CapturePermissionDialogListener;
import com.veridas.fragment.requirement.HardwareRequirementAdapter;
import com.veridas.lib.entities.resources.Document;
import com.veridas.lib.entities.resources.Side;
import com.veridas.log.ILibraryLogger;
import com.veridas.log.Log;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;
import com.veridas.metadata.entities.ArtifactClass;
import com.veridas.resource.database.IBlockingResourcesDatabase;
import com.veridas.util.AppUtil;
import com.veridas.util.Util;
import com.veridas.vdlibraryimageprocessing.CaptureType;
import com.veridas.vdlibraryimageprocessing.VDConstantDefinition;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public class DocumentFragment extends DasCaptureFragment<VDDocumentConfiguration, DocumentClassificationViewModel> implements UserVisualHelpManager.HelpManagerInterface, CloseButtonManager.CloseButtonInterface, CameraManagerBase.LayoutInterface, DocumentClassificationInterface {
    public static final String CAMERA_FAILURE = "com.veridas.documentCapture.documentFragment.cameraFailure";
    public static final String CODEREAD = "com.veridas.bidi.evaluation.codetoberead.coderead";
    public static final String CUT = "com.veridas.documentCapture.documentFragment.imageCaptured.cut";
    public static final String DOCUMENTS = "com.veridas.documentCapture.documentFragment.imageCaptured.documents";
    public static final String FINISH_FRAGMENT = "com.veridas.documentCapture.documentFragment.finishFragment";
    public static final String HAS_BRIGHTS = "com.veridas.documentCapture.documentFragment.imageCaptured.hasBrights";
    public static final String IMAGE_CAPTURED = "com.veridas.documentCapture.documentFragment.imageCaptured";
    public static final String IS_BLURRY = "com.veridas.documentCapture.documentFragment.imageCaptured.blurry";
    public static final String PATH = "com.veridas.documentCapture.documentFragment.imageCaptured.path";
    public static final String SECONDS = "com.veridas.documentCapture.documentFragment.timeWithoutCapture.seconds";
    public static final String TIME_WITHOUT_CAPTURE = "com.veridas.documentCapture.documentFragment.timeWithoutCapture";
    public static final String TYPE = "com.veridas.documentCapture.documentFragment.timeWithoutCapture.type";
    public static final String TYPE_CAPTURED = "com.veridas.documentCapture.documentFragment.imageCaptured.type";
    public static final String[] U0 = {"android.permission.CAMERA"};
    public IBlockingResourcesDatabase J0;
    public g K0;
    public final Handler L0;
    public final Handler M0;
    public View N0;
    public TranslucentLayer O0;
    public final AtomicBoolean P0;
    public final AtomicBoolean Q0;
    public volatile Point R0;
    public final l S0;
    public final m T0;
    protected volatile VDConstantDefinition.TemplateProximity actualTemplateProximity;
    protected final BackgroundThreadsManager backgroundThreadsManager;
    protected final CameraManager cameraManager;
    protected boolean canRepeatProcess;
    protected final CloseButtonManager closeButtonManager;
    protected String configAlertStyle;
    protected int configBrightsHelpCircleColor;
    protected int configBrightsHelpColor;
    protected CharSequence configBrightsHelpText;
    protected String configCameraErrorAlert;
    protected String configCameraErrorAlertTitle;
    protected String configCloseButtonImage;
    protected int configDocumentDetectedVeryCloseColor;
    protected int configDocumentDetectedVeryFarColor;
    protected boolean configDrawRectangle;
    protected boolean configHasCloseButtonImage;
    protected String configInfoAlert;
    protected String configInfoAlertPass;
    protected String configInfoAlertTitle;
    protected String configInfoAlertTitlePass;
    protected boolean configIsFrontFacingCamera;
    protected int configMegapixels;
    protected boolean configMustCutImage;
    protected boolean configMustCutScreen;
    protected int configObverseDetectionDelay;
    protected int configObverseSmartDetectorTimeOutSeconds;
    protected String configPermissionRefused;
    protected String configPermissionRefusedTitle;
    protected String configPositiveButtonText;
    protected String configRequirementsAlertMessage;
    protected String configRequirementsAlertTitle;
    protected int configReverseDetectionDelay;
    protected CharSequence configReverseNotFoundText;
    protected int configReverseSmartDetectorTimeOutSeconds;
    protected int configSecondsWithShutterButtonMessage;
    protected int configSecondsWithoutShutterButtonObverse;
    protected int configSecondsWithoutShutterButtonReverse;
    protected boolean configShowCloseButton;
    protected boolean configShowInfoAlert;
    protected boolean configShowShutterButton;
    protected int configShutterButtonBackgroundColor;
    protected int configShutterButtonBorderColor;
    protected boolean configSmartAndRectDetector;
    protected int configTransparentLayerBackgroundColor;
    protected int detectionHandlerDelay;
    protected String emptyDocumentString;
    protected final AtomicBoolean isRecoveringFromCameraRestart;
    protected final AtomicBoolean isRunning;
    protected AtomicBoolean lastPictureIsBlurry;
    protected BubbleWindow mBubbleWindow;
    protected r<String> mDocumentType;
    protected List<String> mOriginalDocs;
    protected boolean mPictureWithButtonIsShowing;
    protected List<String> mPossibleDocs;
    protected int mProgress;
    protected Rect mReferenceRect;
    protected int mSecondsWithShutterButtonMessage;
    protected int mSecondsWithoutShutterButtonObverse;
    protected int mSecondsWithoutShutterButtonReverse;
    protected Button mShutterButton;
    protected final Runnable mShutterButtonAppearRunnable;
    protected boolean mShutterButtonMessageIsShowing;
    protected int mShutterButtonOffset;
    protected AtomicBoolean mShutterButtonTimeIsFinished;
    protected final Runnable mSmartDetectorChangeToRectRunnable;
    protected final Handler mSmartDetectorHandler;
    protected final Runnable mStartDetectionRunnableShutterButton;
    protected Runnable mStartDetectionRunnableSmartRectDetector;
    protected volatile VDConstantDefinition.TemplateProximity previousTemplateProximity;
    protected final AtomicBoolean smartDetectorTimeOut;
    protected final AtomicBoolean startCountingSeconds;
    protected final AtomicBoolean startShutterButtonCountingSeconds;
    protected final UserVisualHelpManager userVisualHelpManager;
    protected float rectangleScale = 1.0f;
    protected String mDocumentFoundPrevious = "";

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Rect f39335p0;

        public a(Rect rect) {
            this.f39335p0 = rect;
        }

        @Override // java.lang.Runnable
        public final void run() {
            DocumentFragment documentFragment = DocumentFragment.this;
            UserVisualHelpManager userVisualHelpManager = documentFragment.userVisualHelpManager;
            Rect rect = this.f39335p0;
            boolean z10 = documentFragment.getGenericDocumentState().isSearching;
            VDConstantDefinition.TemplateProximity templateProximity = DocumentFragment.this.actualTemplateProximity;
            DocumentFragment documentFragment2 = DocumentFragment.this;
            userVisualHelpManager.setArrowAttributes(rect, z10, templateProximity, documentFragment2.mProgress, documentFragment2.mReferenceRect, documentFragment2.R0);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            DocumentFragment documentFragment = DocumentFragment.this;
            UserVisualHelpManager userVisualHelpManager = documentFragment.userVisualHelpManager;
            FragmentActivity activity = documentFragment.getActivity();
            DocumentFragment documentFragment2 = DocumentFragment.this;
            userVisualHelpManager.setDocumentReferenceDocumentOrFaceRectangle(activity, documentFragment2.mReferenceRect, documentFragment2.R0);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            DocumentFragment.this.userVisualHelpManager.showTickImageView();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            DocumentFragment documentFragment = DocumentFragment.this;
            if (!documentFragment.startCountingSeconds.get()) {
                documentFragment.M0.postDelayed(this, documentFragment.detectionHandlerDelay);
                return;
            }
            if (!documentFragment.configShowShutterButton || documentFragment.mPictureWithButtonIsShowing) {
                return;
            }
            documentFragment.L0.removeCallbacks(documentFragment.mShutterButtonAppearRunnable);
            documentFragment.mShutterButtonTimeIsFinished.set(false);
            documentFragment.disableCameraButton();
            documentFragment.L0.postDelayed(documentFragment.mShutterButtonAppearRunnable, ((long) (documentFragment.getGenericDocumentState().isSearchingObverse ? documentFragment.mSecondsWithoutShutterButtonObverse : documentFragment.mSecondsWithoutShutterButtonReverse)) * 1000);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            DocumentFragment documentFragment = DocumentFragment.this;
            if (!documentFragment.startCountingSeconds.get()) {
                documentFragment.M0.postDelayed(this, documentFragment.detectionHandlerDelay);
                return;
            }
            documentFragment.M0.removeCallbacks(this);
            documentFragment.mSmartDetectorHandler.postDelayed(documentFragment.mSmartDetectorChangeToRectRunnable, ((long) (documentFragment.getGenericDocumentState().isSearchingObverse ? documentFragment.configObverseSmartDetectorTimeOutSeconds : documentFragment.configReverseSmartDetectorTimeOutSeconds)) * 1000);
            documentFragment.startCountingSeconds.set(false);
        }
    }

    public class f implements Runnable {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                f fVar = f.this;
                AppUtil.dismiss(DocumentFragment.this.mBubbleWindow);
                DocumentFragment.this.mShutterButtonMessageIsShowing = false;
            }
        }

        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            DocumentFragment documentFragment = DocumentFragment.this;
            int i10 = documentFragment.mShutterButtonOffset;
            Point correctedDisplaySize = documentFragment.getCorrectedDisplaySize();
            int i11 = (int) (((double) (documentFragment.R0.y > documentFragment.R0.x ? documentFragment.R0.x : documentFragment.R0.y)) * 0.01d);
            Drawable[] children = ((DrawableContainer.DrawableContainerState) ((StateListDrawable) documentFragment.mShutterButton.getBackground()).mutate().getConstantState()).getChildren();
            GradientDrawable gradientDrawable = (GradientDrawable) children[0];
            GradientDrawable gradientDrawable2 = (GradientDrawable) children[1];
            gradientDrawable.setColor(documentFragment.configShutterButtonBackgroundColor);
            gradientDrawable.setStroke(i11, documentFragment.configShutterButtonBorderColor);
            gradientDrawable2.setColor(documentFragment.configShutterButtonBorderColor);
            gradientDrawable2.setStroke(i11, documentFragment.configShutterButtonBackgroundColor);
            ViewGroup.LayoutParams layoutParams = documentFragment.mShutterButton.getLayoutParams();
            int i12 = layoutParams.height;
            int i13 = layoutParams.width;
            int i14 = correctedDisplaySize.x - documentFragment.R0.x;
            int iA = c2.b.a(documentFragment.R0.y, correctedDisplaySize.y - documentFragment.R0.y, i12, 2);
            documentFragment.mShutterButton.setX(((((documentFragment.mReferenceRect.width() + documentFragment.R0.x) + i14) / 2) - i13) - i10);
            documentFragment.mShutterButton.setY(iA);
            documentFragment.N0.invalidate();
            int i15 = DocumentFragment.this.mShutterButton.getLayoutParams().width;
            DocumentFragment.this.mShutterButton.setClickable(true);
            DocumentFragment documentFragment2 = DocumentFragment.this;
            BubbleWindow bubbleWindow = documentFragment2.mBubbleWindow;
            View view = documentFragment2.N0;
            int iWidth = ((documentFragment2.R0.x - DocumentFragment.this.mReferenceRect.width()) + i15) / 2;
            int i16 = DocumentFragment.this.mShutterButtonOffset;
            bubbleWindow.setVisible(view, iWidth + i16, -(i15 + i16));
            DocumentFragment.this.mShutterButtonMessageIsShowing = true;
            new Handler().postDelayed(new a(), ((long) DocumentFragment.this.mSecondsWithShutterButtonMessage) * 1000);
        }
    }

    public class g implements ILibraryLogger {
        @Override // com.veridas.log.ILibraryLogger
        public final void log(@NonNull String str, @NonNull String str2) {
            VDLogger.log(str, str2);
        }
    }

    public static /* synthetic */ class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39344a;

        static {
            int[] iArr = new int[GenericDocumentState.values().length];
            f39344a = iArr;
            try {
                iArr[GenericDocumentState.ANALYZING_OBVERSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39344a[GenericDocumentState.ANALYZING_REVERSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public class j implements FragmentExceptionListener {
        public j() {
        }

        @Override // com.veridas.fragment.FragmentExceptionListener
        public final void onException(DasFragment dasFragment, Throwable th2) {
            if (th2 instanceof CameraException) {
                DocumentFragment.this.runOnUiThread(new u1(this, 3));
            }
        }
    }

    public class k extends FragmentLifecycleAdapter {
        public k() {
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onBeforeCreated(DasFragment dasFragment, Bundle bundle) {
            DocumentFragment.n(DocumentFragment.this);
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onCreated(DasFragment dasFragment, Bundle bundle) {
            DocumentFragment documentFragment = DocumentFragment.this;
            documentFragment.addHardwareRequirementListener(documentFragment.T0);
            documentFragment.addCapturePermissionListener(documentFragment.S0);
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onDestroyed(DasFragment dasFragment) {
            DocumentFragment documentFragment = DocumentFragment.this;
            documentFragment.removeCapturePermissionListener(documentFragment.S0);
            documentFragment.removeHardwareRequirementListener(documentFragment.T0);
            documentFragment.L0.removeCallbacksAndMessages(null);
            documentFragment.M0.removeCallbacksAndMessages(null);
            documentFragment.mSmartDetectorHandler.removeCallbacksAndMessages(null);
            documentFragment.backgroundThreadsManager.stopBackgroundThreads();
            documentFragment.mBubbleWindow = (BubbleWindow) AppUtil.dismiss(documentFragment.mBubbleWindow);
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onPaused(DasFragment dasFragment) {
            DocumentFragment.this.P0.set(false);
            DocumentFragment documentFragment = DocumentFragment.this;
            documentFragment.isRunning.set(false);
            documentFragment.userVisualHelpManager.setReferenceRectColor(-1);
            documentFragment.userVisualHelpManager.setDocumentReferenceDocumentOrFaceRectangle(documentFragment.getActivity(), documentFragment.mReferenceRect, documentFragment.R0);
            documentFragment.userVisualHelpManager.removeCallbacks(documentFragment.backgroundThreadsManager);
            documentFragment.cameraManager.stop();
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onResumed(DasFragment dasFragment) {
            DocumentFragment documentFragment = DocumentFragment.this;
            documentFragment.P0.set(true);
            DocumentFragment.o(documentFragment);
        }
    }

    public class l extends CapturePermissionAdapter {
        @Override // com.veridas.fragment.permission.CapturePermissionAdapter, com.veridas.fragment.permission.CapturePermissionListener
        public final void onCapturePermissionsDenied(Object obj) {
            VDLogger.log(Logger.Tag.CAMERA_PERMISSION, "onRequestPermissionsResult false");
        }

        @Override // com.veridas.fragment.permission.CapturePermissionAdapter, com.veridas.fragment.permission.CapturePermissionListener
        public final void onCapturePermissionsGranted(Object obj) {
            VDLogger.log(Logger.Tag.CAMERA_PERMISSION, "true");
        }
    }

    public class m extends HardwareRequirementAdapter {
        public m() {
        }

        @Override // com.veridas.fragment.requirement.HardwareRequirementAdapter, com.veridas.fragment.requirement.HardwareRequirementListener
        public final void onHardwareRequirementsFailed(Object obj) {
            DocumentFragment.this.runOnUiThread(new androidx.activity.h(this, 3));
        }
    }

    public class n extends CameraAdapter {

        public class a implements CameraAction {
            public a() {
            }

            @Override // com.veridas.camera.CameraAction
            public final void execute(boolean z10) {
                n nVar = n.this;
                DocumentFragment.this.Q0.set(true);
                if (DocumentFragment.this.isRecoveringFromCameraRestart.get()) {
                    DocumentFragment.this.isRecoveringFromCameraRestart.set(false);
                } else {
                    DocumentFragment.this.startProcess();
                }
            }
        }

        public n() {
        }

        @Override // com.veridas.camera.CameraAdapter, com.veridas.camera.CameraListener
        public final void onParametersChanged(Camera camera) {
            DocumentFragment.this.correctSurfaceSize();
        }

        @Override // com.veridas.camera.CameraAdapter, com.veridas.camera.CameraListener
        public final void onStarted(Camera camera) {
            DocumentFragment documentFragment = DocumentFragment.this;
            if (documentFragment.getGenericDocumentState() == GenericDocumentState.SEARCHING_OBVERSE) {
                documentFragment.setGenericDocumentState(GenericDocumentState.CALCULATING_AWAITING);
            }
            documentFragment.cameraManager.setCamera(camera);
            documentFragment.cameraManager.start(documentFragment.r(), documentFragment.getContext().getApplicationContext(), new a());
        }
    }

    public class o implements IBidiCodeManagerDelegate {
        public o() {
        }

        @Override // com.veridas.bidicode.IBidiCodeManagerDelegate
        public final void bidiRegionFound(@NonNull BidiCodeRegion bidiCodeRegion) {
            DocumentFragment.this.bidiCodeFound(bidiCodeRegion);
        }
    }

    public class p implements Runnable {
        public p() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            DocumentFragment documentFragment = DocumentFragment.this;
            documentFragment.cameraManager.setCanDetectDocument(true);
            documentFragment.restartWaitingShutterButton();
            documentFragment.restartWaitingChangeDetector();
            documentFragment.requestFrame();
        }
    }

    public class q implements SaveImageTask.Delegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ VDEnums.VDCaptureType f39352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f39353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f39354c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f39355d;

        public q(VDEnums.VDCaptureType vDCaptureType, List list, boolean z10, boolean z11) {
            this.f39352a = vDCaptureType;
            this.f39353b = list;
            this.f39354c = z10;
            this.f39355d = z11;
        }

        @Override // com.dasnano.vddocumentcapture.persist.SaveImageTask.Delegate
        public final void finish() {
            final boolean z10 = this.f39355d;
            DocumentFragment.this.runOnUiThread(new Runnable() { // from class: com.dasnano.vddocumentcapture.fragments.o
                @Override // java.lang.Runnable
                public final void run() {
                    DocumentFragment.q qVar = this.f39381p0;
                    qVar.getClass();
                    if (z10) {
                        String str = DocumentFragment.CAMERA_FAILURE;
                        DocumentFragment.this.p(true);
                    }
                }
            });
        }

        @Override // com.dasnano.vddocumentcapture.persist.SaveImageTask.Delegate
        public final void processed(@Nullable byte[] bArr, boolean z10) {
            String strName;
            DocumentFragment documentFragment = DocumentFragment.this;
            VDEnums.VDCaptureType vDCaptureType = this.f39352a;
            try {
                if (z10) {
                    strName = vDCaptureType.name() + "_crop";
                } else {
                    strName = vDCaptureType.name();
                }
                String strSaveJpgInPrivateLocation = Util.saveJpgInPrivateLocation(documentFragment.requireActivity(), bArr, strName);
                if (strSaveJpgInPrivateLocation == null) {
                    String str = DocumentFragment.CAMERA_FAILURE;
                    Log.w("DocumentFragment", "The path argument is null.");
                    return;
                }
                Intent intent = new Intent(DocumentFragment.IMAGE_CAPTURED);
                intent.putExtra(DocumentFragment.PATH, strSaveJpgInPrivateLocation);
                intent.putExtra(DocumentFragment.TYPE_CAPTURED, vDCaptureType);
                intent.putStringArrayListExtra(DocumentFragment.DOCUMENTS, new ArrayList<>(this.f39353b));
                intent.putExtra(DocumentFragment.IS_BLURRY, documentFragment.lastPictureIsBlurry.get());
                intent.putExtra(DocumentFragment.HAS_BRIGHTS, this.f39354c);
                intent.putExtra(DocumentFragment.CUT, z10);
                documentFragment.broadcastIntent(intent);
            } catch (IOException e5) {
                e = e5;
                String str2 = DocumentFragment.CAMERA_FAILURE;
                Log.e("DocumentFragment", e);
            } catch (IllegalStateException e7) {
                e = e7;
                String str3 = DocumentFragment.CAMERA_FAILURE;
                Log.e("DocumentFragment", e);
            }
        }
    }

    public class r<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f39357a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList<E> f39358b;

        public r(List list) {
            this.f39358b = new ArrayList<>(list);
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList clone() {
            ArrayList arrayList;
            synchronized (this.f39357a) {
                arrayList = new ArrayList(this.f39358b);
            }
            return arrayList;
        }

        public final Object b() {
            E e5;
            synchronized (this.f39357a) {
                e5 = this.f39358b.get(0);
            }
            return e5;
        }

        public final void c(List<E> list) {
            synchronized (this.f39357a) {
                this.f39358b.clear();
                this.f39358b.addAll(list);
            }
        }

        public final int d() {
            int size;
            synchronized (this.f39357a) {
                size = this.f39358b.size();
            }
            return size;
        }
    }

    public DocumentFragment() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.startCountingSeconds = atomicBoolean;
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        this.startShutterButtonCountingSeconds = atomicBoolean2;
        this.L0 = new Handler();
        this.M0 = new Handler();
        this.mSmartDetectorHandler = new Handler();
        this.detectionHandlerDelay = 1000;
        this.actualTemplateProximity = VDConstantDefinition.TemplateProximity.NOT_FOUND;
        this.previousTemplateProximity = VDConstantDefinition.TemplateProximity.NONE;
        this.mProgress = 0;
        this.mSecondsWithoutShutterButtonObverse = 8;
        this.mSecondsWithoutShutterButtonReverse = 8;
        this.mSecondsWithShutterButtonMessage = 8;
        this.canRepeatProcess = true;
        this.mShutterButtonTimeIsFinished = new AtomicBoolean(false);
        this.mShutterButtonMessageIsShowing = false;
        this.mPictureWithButtonIsShowing = false;
        AtomicBoolean atomicBoolean3 = new AtomicBoolean(false);
        this.smartDetectorTimeOut = atomicBoolean3;
        this.mShutterButtonOffset = 0;
        AtomicBoolean atomicBoolean4 = new AtomicBoolean(false);
        this.isRunning = atomicBoolean4;
        this.isRecoveringFromCameraRestart = new AtomicBoolean(false);
        this.P0 = new AtomicBoolean(false);
        this.Q0 = new AtomicBoolean(false);
        this.userVisualHelpManager = new UserVisualHelpManager(this, this.dialogRegistry);
        this.closeButtonManager = new CloseButtonManager(this);
        this.cameraManager = new CameraManager(this, this, atomicBoolean4, atomicBoolean3, atomicBoolean, atomicBoolean2);
        this.emptyDocumentString = "";
        this.lastPictureIsBlurry = new AtomicBoolean(false);
        this.backgroundThreadsManager = new BackgroundThreadsManager();
        j jVar = new j();
        k kVar = new k();
        this.S0 = new l();
        this.T0 = new m();
        this.mShutterButtonAppearRunnable = new c0(this, 5);
        this.mStartDetectionRunnableShutterButton = new d();
        this.mSmartDetectorChangeToRectRunnable = new k0.e(this, 4);
        this.mStartDetectionRunnableSmartRectDetector = new e();
        addExceptionListener(jVar);
        addLifecycleListener(kVar);
    }

    public static void c(DocumentFragment documentFragment) {
        if (!documentFragment.configShowInfoAlert || documentFragment.getGenericDocumentState() == GenericDocumentState.SEARCHING_REVERSE) {
            documentFragment.startCapture();
        } else {
            documentFragment.runOnUiThread(new r1(documentFragment, 6));
        }
    }

    public static void d(final DocumentFragment documentFragment) {
        documentFragment.dialogRegistry.discard();
        FragmentActivity fragmentActivityRequireActivity = documentFragment.requireActivity();
        documentFragment.showAlertDialog(documentFragment.q(), documentFragment.dialogRegistry.createAlertDialogBuilder().createAlertDialog().context(fragmentActivityRequireActivity).style(documentFragment.configAlertStyle).fallbackThemeId(R.style.VeridasDialog).title(documentFragment.configCameraErrorAlertTitle).message(documentFragment.configCameraErrorAlert).cancelable(false).positiveButtonClickButtonListener(new DialogInterface.OnClickListener() { // from class: com.dasnano.vddocumentcapture.fragments.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                String str = DocumentFragment.CAMERA_FAILURE;
                DocumentFragment documentFragment2 = this.f39368p0;
                documentFragment2.getClass();
                VDLogger.log(Logger.Tag.CAMERA_FATAL_ERROR, "Camera failure.");
                documentFragment2.broadcastIntent(new Intent("com.veridas.documentCapture.documentFragment.cameraFailure"));
            }
        }).positiveButtonText(documentFragment.configPositiveButtonText).positiveButtonTextColor(fragmentActivityRequireActivity.getResources().getColor(R.color.vd_document_dialog_button)).build(), documentFragment.configAlertStyle, documentFragment.mReferenceRect);
    }

    public static /* synthetic */ void e(DocumentFragment documentFragment) {
        documentFragment.mShutterButton.setClickable(false);
        if (documentFragment.mShutterButton.getVisibility() == 0) {
            documentFragment.mShutterButton.setVisibility(8);
        }
        documentFragment.mShutterButtonMessageIsShowing = false;
        AppUtil.dismiss(documentFragment.mBubbleWindow);
    }

    public static void g(final DocumentFragment documentFragment) {
        documentFragment.dialogRegistry.discard();
        FragmentActivity fragmentActivityRequireActivity = documentFragment.requireActivity();
        documentFragment.showAlertDialog(documentFragment.q(), documentFragment.dialogRegistry.createAlertDialogBuilder().createAlertDialog().context(fragmentActivityRequireActivity).style(documentFragment.configAlertStyle).fallbackThemeId(R.style.VeridasDialog).title(documentFragment.configRequirementsAlertTitle).message(documentFragment.configRequirementsAlertMessage).cancelable(false).positiveButtonClickButtonListener(new DialogInterface.OnClickListener() { // from class: com.dasnano.vddocumentcapture.fragments.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                String str = DocumentFragment.CAMERA_FAILURE;
                this.f39370p0.requirementsFailed();
            }
        }).positiveButtonText(documentFragment.configPositiveButtonText).positiveButtonTextColor(fragmentActivityRequireActivity.getResources().getColor(R.color.vd_document_dialog_button)).build(), documentFragment.configAlertStyle, null);
    }

    public static /* synthetic */ void i(DocumentFragment documentFragment, VDConstantDefinition.AnalysisType analysisType) {
        documentFragment.getClass();
        if (analysisType == VDConstantDefinition.AnalysisType.RECTANGLE_BOX_OBVERSE) {
            documentFragment.mPossibleDocs.clear();
            documentFragment.mPossibleDocs.addAll(documentFragment.mOriginalDocs);
        }
        documentFragment.userVisualHelpManager.disableTextViewHelp();
        documentFragment.userVisualHelpManager.removeLightSpotsView();
        documentFragment.takeFirstPicture();
    }

    public static void j(DocumentFragment documentFragment, Runnable runnable) {
        Context applicationContext = documentFragment.getActivity().getApplicationContext();
        documentFragment.N0.setLayoutParams(documentFragment.q());
        documentFragment.N0.requestLayout();
        documentFragment.mReferenceRect = documentFragment.getReferenceRectForDocument((String) documentFragment.mDocumentType.b());
        documentFragment.closeButtonManager.setCloseImageButtonPosition(applicationContext, documentFragment.getCorrectedDisplaySize(), documentFragment.R0);
        GenericDocumentState genericDocumentState = documentFragment.getGenericDocumentState();
        if (genericDocumentState.isInitial) {
            documentFragment.userVisualHelpManager.setReferenceRectColor(-1);
        }
        documentFragment.O0.setBackgroundColor(documentFragment.configTransparentLayerBackgroundColor);
        documentFragment.O0.setReferenceRect(applicationContext, documentFragment.mReferenceRect);
        DocumentFace documentFace = genericDocumentState.documentFace;
        if (documentFragment.mDocumentType.d() == 1) {
            String str = (String) documentFragment.mDocumentType.b();
            if (documentFace != null) {
                documentFragment.userVisualHelpManager.drawDocumentHelpTemplate(str, documentFace, documentFragment.mReferenceRect, documentFragment.getBlockingResourcesDatabaseLazy());
            }
        }
        if (documentFace != null) {
            documentFragment.t(documentFace);
        }
        documentFragment.userVisualHelpManager.drawDocumentReference(documentFragment.getActivity(), documentFragment.mReferenceRect, documentFragment.R0);
        if (runnable != null) {
            runnable.run();
        }
    }

    public static /* synthetic */ void k(DocumentFragment documentFragment, List list) {
        documentFragment.getClass();
        if (!list.isEmpty()) {
            documentFragment.userVisualHelpManager.setTextToShow(documentFragment.configBrightsHelpText);
            documentFragment.v();
            documentFragment.userVisualHelpManager.setReferenceRectColor(documentFragment.configBrightsHelpColor);
            documentFragment.userVisualHelpManager.setDocumentReferenceDocumentOrFaceRectangle(documentFragment.getActivity(), documentFragment.mReferenceRect, documentFragment.R0);
        }
        documentFragment.userVisualHelpManager.drawLightSpots(list);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public static /* synthetic */ void l(DocumentFragment documentFragment, List list, GenericDocumentState genericDocumentState) {
        String str;
        if (list != null) {
            documentFragment.getClass();
            if (!((String) list.get(0)).equals(VDConstantDefinition.ERROR_DOCUMENT)) {
                documentFragment.invalidateSmartDetector();
            } else if (documentFragment.mSmartDetectorChangeToRectRunnable == null) {
                documentFragment.restartWaitingChangeDetector();
            }
        } else if (documentFragment.mSmartDetectorChangeToRectRunnable == null) {
            documentFragment.restartWaitingChangeDetector();
        }
        if (documentFragment.mDocumentType.d() > 1) {
            if (list != null) {
                str = (String) list.get(0);
                documentFragment.mPossibleDocs.clear();
                documentFragment.mPossibleDocs.addAll(list);
            } else {
                str = "";
            }
            if (documentFragment.mDocumentFoundPrevious.equalsIgnoreCase(str)) {
                return;
            }
            documentFragment.mDocumentFoundPrevious = str;
            if (genericDocumentState.isSearchingDocument) {
                documentFragment.userVisualHelpManager.drawDocumentHelpTemplate(str, genericDocumentState.documentFace, documentFragment.mReferenceRect, documentFragment.getBlockingResourcesDatabaseLazy());
            }
        }
    }

    public static void m(final DocumentFragment documentFragment) {
        documentFragment.dialogRegistry.discard();
        FragmentActivity fragmentActivityRequireActivity = documentFragment.requireActivity();
        int color = fragmentActivityRequireActivity.getResources().getColor(R.color.vd_document_dialog_button);
        boolean zIsPassport = Document.isPassport((String) documentFragment.mDocumentType.b());
        documentFragment.showAlertDialog(documentFragment.q(), documentFragment.dialogRegistry.createAlertDialogBuilder().createAlertDialog().context(fragmentActivityRequireActivity).style(documentFragment.configAlertStyle).fallbackThemeId(R.style.VeridasDialog).title(zIsPassport ? documentFragment.configInfoAlertTitlePass : documentFragment.configInfoAlertTitle).message(zIsPassport ? documentFragment.configInfoAlertPass : documentFragment.configInfoAlert).cancelable(false).positiveButtonClickButtonListener(new DialogInterface.OnClickListener() { // from class: com.dasnano.vddocumentcapture.fragments.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                String str = DocumentFragment.CAMERA_FAILURE;
                this.f39369p0.startCapture();
            }
        }).positiveButtonText(documentFragment.configPositiveButtonText).positiveButtonTextColor(color).build(), documentFragment.configAlertStyle, documentFragment.mReferenceRect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.veridas.config.Configuration] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void n(DocumentFragment documentFragment) {
        documentFragment.R0 = documentFragment.getDisplaySize();
        ?? configuration = documentFragment.getConfiguration();
        try {
            documentFragment.configAlertStyle = configuration.getString("alertstyle");
            documentFragment.configBrightsHelpCircleColor = configuration.getColor(VDDocumentConfiguration.BRIGHTS_HELP_CIRCLE_COLOR);
            documentFragment.configBrightsHelpColor = configuration.getColor(VDDocumentConfiguration.BRIGHTS_HELP_COLOR);
            documentFragment.configBrightsHelpText = HtmlCompat.fromHtml(configuration.getString(VDDocumentConfiguration.BRIGHTS_HELP_TEXT), 0);
            documentFragment.configCameraErrorAlert = configuration.getString(VDDocumentConfiguration.CAMERA_ERROR_ALERT);
            documentFragment.configCameraErrorAlertTitle = configuration.getString(VDDocumentConfiguration.CAMERA_ERROR_ALERT_TITLE);
            documentFragment.configCloseButtonImage = configuration.getString("closebuttonimage");
            documentFragment.configDocumentDetectedVeryCloseColor = configuration.getColor(VDDocumentConfiguration.DOCUMENT_DETECTED_VERY_CLOSE_COLOR);
            documentFragment.configDocumentDetectedVeryFarColor = configuration.getColor(VDDocumentConfiguration.DOCUMENT_DETECTED_VERY_FAR_COLOR);
            documentFragment.configDrawRectangle = configuration.getBoolean(VDDocumentConfiguration.DRAW_RECTANGLE);
            documentFragment.configHasCloseButtonImage = !configuration.getString("closebuttonimage").equals("undefined");
            documentFragment.configInfoAlert = configuration.getString("infoalert");
            documentFragment.configInfoAlertPass = configuration.getString("infoalertpass");
            documentFragment.configInfoAlertTitle = configuration.getString("infoalerttitle");
            documentFragment.configInfoAlertTitlePass = configuration.getString("infoalerttitlepass");
            documentFragment.configIsFrontFacingCamera = configuration.getString("facing").equalsIgnoreCase("front");
            documentFragment.configMegapixels = configuration.getInteger(VDDocumentConfiguration.MEGAPIXELS);
            documentFragment.configMustCutImage = configuration.getBoolean(VDDocumentConfiguration.CUT_IMAGE);
            documentFragment.configMustCutScreen = configuration.getBoolean(VDDocumentConfiguration.CUT_SCREEN);
            documentFragment.configObverseDetectionDelay = configuration.getInteger(VDDocumentConfiguration.OBVERSE_DETECTION_DELAY);
            documentFragment.configObverseSmartDetectorTimeOutSeconds = configuration.getInteger(VDDocumentConfiguration.ADVANCED_DETECTION_OBVERSE_DELAY);
            documentFragment.configPermissionRefused = configuration.getString("permissionrefused");
            documentFragment.configPermissionRefusedTitle = configuration.getString("permissionrefusedtitle");
            documentFragment.configPositiveButtonText = configuration.getString("positivebuttontext");
            documentFragment.configRequirementsAlertMessage = configuration.getString(VDDocumentConfiguration.REQUIREMENTS_ALERT_MESSAGE);
            documentFragment.configRequirementsAlertTitle = configuration.getString(VDDocumentConfiguration.REQUIREMENTS_ALERT_TITLE);
            documentFragment.configReverseDetectionDelay = configuration.getInteger(VDDocumentConfiguration.REVERSE_DETECTION_DELAY);
            documentFragment.configReverseNotFoundText = HtmlCompat.fromHtml(configuration.getString(VDDocumentConfiguration.REVERSE_NOT_FOUND_TEXT), 0);
            documentFragment.configReverseSmartDetectorTimeOutSeconds = configuration.getInteger(VDDocumentConfiguration.ADVANCED_DETECTION_REVERSE_DELAY);
            documentFragment.configSecondsWithoutShutterButtonObverse = configuration.getInteger(VDDocumentConfiguration.SECONDS_WITHOUT_SHUTTER_BUTTON_OBVERSE);
            documentFragment.configSecondsWithoutShutterButtonReverse = configuration.getInteger(VDDocumentConfiguration.SECONDS_WITHOUT_SHUTTER_BUTTON_REVERSE);
            documentFragment.configSecondsWithShutterButtonMessage = configuration.getInteger(VDDocumentConfiguration.SECONDS_WITH_SHUTTER_BUTTON_MESSAGE);
            documentFragment.configShowCloseButton = configuration.getBoolean("closebutton");
            documentFragment.configShowInfoAlert = configuration.getBoolean("infoalertshow");
            documentFragment.configShowShutterButton = configuration.getBoolean(VDDocumentConfiguration.SHUTTER_BUTTON_SHOW);
            documentFragment.configShutterButtonBackgroundColor = configuration.getColor(VDDocumentConfiguration.SHUTTER_BUTTON_BACKGROUND_COLOR);
            documentFragment.configShutterButtonBorderColor = configuration.getColor(VDDocumentConfiguration.SHUTTER_BUTTON_BORDER_COLOR);
            documentFragment.configSmartAndRectDetector = configuration.getBoolean(VDDocumentConfiguration.ADVANCED_DETECTION_ENABLED);
            documentFragment.configTransparentLayerBackgroundColor = configuration.getColor(VDDocumentConfiguration.CAPTURE_BACKGROUND_COLOR);
            documentFragment.cameraManager.applyConfiguration(configuration);
        } catch (IllegalColorValueException | PropertyNameNotFoundException e5) {
            Log.e("DocumentFragment", e5);
        }
        if (documentFragment.configIsFrontFacingCamera) {
            documentFragment.rectangleScale = ((DocumentClassificationViewModel) documentFragment.viewModel).getDisplayOrientation() == DisplayOrientation.LANDSCAPE ? 0.5f : 0.75f;
        }
        documentFragment.mShutterButtonOffset = DisplayUtils.getSizeInPixels(documentFragment.getActivity().getApplicationContext(), 10.00005f);
        documentFragment.backgroundThreadsManager.startBackgroundThreads();
        r<String> rVar = new r<>(((DocumentClassificationViewModel) documentFragment.viewModel).getDocuments());
        documentFragment.mDocumentType = rVar;
        documentFragment.mOriginalDocs = rVar.clone();
        documentFragment.mReferenceRect = documentFragment.getReferenceRectForDocument((String) documentFragment.mDocumentType.b());
    }

    public static void o(DocumentFragment documentFragment) {
        documentFragment.userVisualHelpManager.setReferenceRectColor(-1);
        documentFragment.userVisualHelpManager.drawDocumentHelpTemplate(null, null, null, documentFragment.getBlockingResourcesDatabaseLazy());
        documentFragment.userVisualHelpManager.resetProgressLevel();
        DocumentFace documentFace = ((DocumentClassificationViewModel) documentFragment.viewModel).getDocumentFace();
        documentFragment.s(documentFace);
        if (documentFragment.getGenericDocumentState() != GenericDocumentState.CALCULATING_AWAITING) {
            documentFragment.u(documentFace);
        }
        documentFragment.cameraManager.setCanDetectDocument(false);
        documentFragment.disableCameraButton();
        documentFragment.isRunning.set(true);
        documentFragment.startProcess();
    }

    @Override // com.dasnano.vddocumentcapture.activities.DocumentClassificationInterface
    public void VDTimeWithoutPhotoTaken(int i10, VDEnums.VDCaptureType vDCaptureType) {
        Intent intent = new Intent(TIME_WITHOUT_CAPTURE);
        intent.putExtra(SECONDS, i10);
        intent.putExtra(TYPE, vDCaptureType);
        broadcastIntent(intent);
    }

    @Override // com.dasnano.vddocumentcapture.managers.CameraManagerBase.LayoutInterface
    public void bidiCodeFound(BidiCodeRegion bidiCodeRegion) {
        this.userVisualHelpManager.addBidiCodeFound(bidiCodeRegion, getContext());
    }

    public void brightDetected(List<Rect> list) {
        if (this.isRunning.get()) {
            runOnUiThread(new h2.i(this, list, 3));
        }
    }

    @Override // com.dasnano.vddocumentcapture.managers.CameraManagerBase.LayoutInterface
    public boolean canRepeatProcess() {
        return this.canRepeatProcess;
    }

    @Override // com.dasnano.vddocumentcapture.managers.CloseButtonManager.CloseButtonInterface
    public void closeButtonClicked() {
        this.isRunning.set(false);
        VDLogger.log(Logger.Tag.CLOSE, "CLOSE_BUTTON with state: %s", getGenericDocumentState().name());
        p(false);
    }

    @Override // com.dasnano.vddocumentcapture.managers.CameraManagerBase.LayoutInterface
    public void correctSurfaceSize() {
        correctSurfaceSize(null);
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public CapturePermissionDialogListener createCapturePermissionDialogListener() {
        return new h();
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public AlertDialog.Builder createPermissionDialogBuilder() {
        return new AlertDialog.Builder(getActivity(), R.style.VeridasDialog).setMessage(HtmlCompat.fromHtml(this.configPermissionRefusedTitle, 0)).setTitle(HtmlCompat.fromHtml(this.configPermissionRefused, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void delegateImagesInAnotherThread(Picture picture, SpatialDetectionResult spatialDetectionResult, VDEnums.VDCaptureType vDCaptureType) {
        Handler processImageHandler;
        if (this.isRunning.get() && (processImageHandler = this.backgroundThreadsManager.getProcessImageHandler()) != null) {
            this.cameraManager.setFocusAttempts(0);
            List<String> list = this.mPictureWithButtonIsShowing ? this.mOriginalDocs : this.mPossibleDocs;
            VDLogger.log(Logger.Tag.DOCUMENT_CAPTURED, "capture_face : %s, possible_documents : %s, bidiCodeInfoList: %s", vDCaptureType.name(), list.toString(), this.cameraManager.bidiCodeManager.getFoundCodes().toString());
            boolean z10 = (vDCaptureType.isPassport || (vDCaptureType.isObverse && !shouldCaptureReverse()) || vDCaptureType.isReverse) && !this.cameraManager.shouldShowDocument();
            boolean lightBlobDetected = spatialDetectionResult.getLightBlobDetected();
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Point point = new Point();
            fragmentActivityRequireActivity.getWindowManager().getDefaultDisplay().getRealSize(point);
            ArtifactClass artifactClass = vDCaptureType.isObverse ? ArtifactClass.DOCUMENT_OBVERSE : ArtifactClass.DOCUMENT_REVERSE;
            SaveImageTask saveImageTaskBuild = new SaveImageTask.Builder().artifactClass(artifactClass).bidiCodes(this.cameraManager.bidiCodeManager.getFoundCodes()).captureType(vDCaptureType).context(requireContext()).cropImage(this.configMustCutImage).cropScreen(this.configMustCutScreen).delegate(new q(vDCaptureType, list, lightBlobDetected, z10)).detection(spatialDetectionResult.getCandidate()).displaySize(point).maximumMegapixels(this.configMegapixels).picture(picture).build();
            int i10 = artifactClass != ArtifactClass.DOCUMENT_OBVERSE ? 1 : 0;
            try {
                if (((VDDocumentConfiguration) getConfiguration()).getBoolean(VDDocumentConfiguration.EVALUATION_APP_BIDI_RETRIEVAL)) {
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.cameraManager.bidiCodeManager.getAllCodesReadOrNotForCurrentSide(i10));
                    Intent intent = new Intent(CODEREAD);
                    intent.putParcelableArrayListExtra("bidis", arrayList);
                    broadcastIntent(intent);
                }
            } catch (PropertyNameNotFoundException e5) {
                Log.e("DocumentFragment", e5);
            }
            processImageHandler.post(saveImageTaskBuild);
        }
    }

    public void disableCameraButton() {
        runOnUiThread(new androidx.core.app.a(this, 2));
    }

    @Override // com.dasnano.vddocumentcapture.managers.CameraManagerBase.LayoutInterface
    public void disableTextViewHelp() {
        this.userVisualHelpManager.disableTextViewHelp();
    }

    @Override // com.dasnano.vddocumentcapture.managers.CameraManagerBase.LayoutInterface
    public void dismissProgressDialogIfNeeded() {
        this.dialogRegistry.discard();
    }

    public void documentDetected(VDConstantDefinition.AnalysisType analysisType) {
        if (this.isRunning.get()) {
            VDLogger.log(Logger.Tag.DOCUMENT_DETECTED, "documentDetected");
            this.cameraManager.setCanDetectDocument(false);
            drawDocument(null);
            runOnUiThread(new androidx.camera.core.processing.a(this, analysisType, 1));
        }
    }

    public void documentDetectionProgressPercentage(int i10) {
        runOnUiThread(new com.dasnano.vddocumentcapture.fragments.d(this, i10, 0));
    }

    public void documentTypeFound(List<String> list) {
        if (this.isRunning.get()) {
            runOnUiThread(new com.bbva.sl.ar.android.secsdk.fido.impl.a(this, list, 1, getGenericDocumentState()));
        }
    }

    @Override // com.dasnano.vddocumentcapture.managers.CameraManagerBase.LayoutInterface
    public void drawBidiCodesFound(Rect rect) {
        this.userVisualHelpManager.drawBidiCodesFound(rect);
    }

    @Override // com.dasnano.vddocumentcapture.managers.CameraManagerBase.LayoutInterface
    public void drawDocument(Rect rect) {
        if (this.configDrawRectangle) {
            this.userVisualHelpManager.drawRect(rect);
        }
    }

    public void enableCameraButton() {
        if (this.configShowShutterButton) {
            runOnUiThread(new f());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.veridas.config.Configuration] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.dasnano.vddocumentcapture.managers.CameraManagerBase.LayoutInterface
    public void endOfObverseCapture(CameraAction cameraAction) {
        if (this.cameraManager.shouldShowDocument()) {
            showValidationTick();
        }
        if (!this.mPictureWithButtonIsShowing) {
            this.mDocumentType.c(this.mPossibleDocs);
        }
        if (this.configSmartAndRectDetector) {
            this.mPictureWithButtonIsShowing = false;
        }
        if (shouldCaptureReverse() && !this.cameraManager.shouldShowDocument()) {
            setGenericDocumentState(GenericDocumentState.SEARCHING_REVERSE);
            ((DocumentClassificationViewModel) this.viewModel).setDocumentFace(DocumentFace.REVERSE);
            this.cameraManager.recreateDetectors(r(), requireContext().getApplicationContext());
            this.cameraManager.setCanTakePicture(true);
            this.userVisualHelpManager.setReferenceRectColor(-1);
            this.userVisualHelpManager.removeCallbacks(this.backgroundThreadsManager);
            this.userVisualHelpManager.postHelpDelayed(getActivity(), getConfiguration(), this.backgroundThreadsManager);
            this.userVisualHelpManager.resetProgressLevel();
            runOnUiThread(new androidx.room.h(this, 2));
        }
        if (cameraAction != null) {
            cameraAction.execute(true);
        }
    }

    public void finishedFpsCalculation() {
        boolean zIsPassport = Document.isPassport((String) this.mDocumentType.b());
        this.dialogRegistry.discard();
        GenericDocumentState genericDocumentState = GenericDocumentState.SEARCHING_OBVERSE;
        if (zIsPassport) {
            genericDocumentState = GenericDocumentState.SEARCHING_PASSPORT;
        }
        setGenericDocumentState(genericDocumentState);
    }

    public void forceIsRunningToFalse() {
        this.isRunning.set(false);
    }

    public synchronized IBlockingResourcesDatabase getBlockingResourcesDatabaseLazy() {
        try {
            if (this.J0 == null) {
                this.J0 = CommonLibraryDepInjector.getBlockingResourcesDatabase(requireContext());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.J0;
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public CameraListener getCameraListener() {
        return new n();
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public String getCapturePermissionDialogNegativeButtonText() {
        return getActivity().getResources().getString(android.R.string.cancel);
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public String getCapturePermissionDialogPositiveButtonText() {
        return this.configPositiveButtonText;
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public int getCapturePermissionRequestCode() {
        return 1;
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public String[] getCapturePermissions() {
        return U0;
    }

    @Override // com.veridas.fragment.DasFragment
    public Class<VDDocumentConfiguration> getConfigurationClass() {
        return VDDocumentConfiguration.class;
    }

    @Override // com.dasnano.vddocumentcapture.managers.CameraManagerBase.LayoutInterface
    public List<String> getDocumentType() {
        return this.mDocumentType.clone();
    }

    @Override // com.dasnano.vddocumentcapture.managers.UserVisualHelpManager.HelpManagerInterface, com.dasnano.vddocumentcapture.managers.CameraManagerBase.LayoutInterface
    public GenericDocumentState getGenericDocumentState() {
        GenericDocumentState genericDocumentState;
        synchronized (((DocumentClassificationViewModel) this.viewModel)) {
            genericDocumentState = ((DocumentClassificationViewModel) this.viewModel).getGenericDocumentState();
        }
        return genericDocumentState;
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public String[] getHardwareRequirements() {
        return new String[]{"android.hardware.camera.autofocus"};
    }

    public synchronized ILibraryLogger getLoggerLazy() {
        try {
            if (this.K0 == null) {
                this.K0 = new g();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.K0;
    }

    @Override // com.dasnano.vddocumentcapture.managers.UserVisualHelpManager.HelpManagerInterface, com.dasnano.vddocumentcapture.managers.CameraManagerBase.LayoutInterface
    public List<String> getPossibleDocs() {
        return this.mPossibleDocs;
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public View getPreviewSurface() {
        return this.N0.findViewById(R.id.vd_document_surface_view_camera);
    }

    @Override // com.dasnano.vddocumentcapture.managers.CameraManagerBase.LayoutInterface
    public int getProgress() {
        return this.mProgress;
    }

    @Override // com.dasnano.vddocumentcapture.managers.CameraManagerBase.LayoutInterface
    public Rect getReferenceRect() {
        return this.mReferenceRect;
    }

    public Rect getReferenceRectForDocument(String str) {
        Document documentById = getBlockingResourcesDatabaseLazy().getDocumentById(str);
        return DisplayUtils.getReferenceImageRegion(this.R0, getCorrectedDisplaySize(), documentById != null ? documentById.getAspectRatio() : 1.58d, 1.0f);
    }

    @Override // com.veridas.fragment.DasFragment
    public Class<DocumentClassificationViewModel> getViewModelClass() {
        return DocumentClassificationViewModel.class;
    }

    public void invalidateSmartDetector() {
        this.mSmartDetectorHandler.removeCallbacks(this.mSmartDetectorChangeToRectRunnable);
    }

    @Override // com.veridas.fragment.DasCaptureFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        correctSurfaceSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.veridas.config.Configuration] */
    /* JADX WARN: Type inference failed for: r7v21, types: [com.veridas.config.Configuration] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentActivity activity = getActivity();
        this.emptyDocumentString = getString(R.string.vd_document_document_empty);
        View viewInflate = layoutInflater.inflate(R.layout.fragment_document, viewGroup, false);
        this.N0 = viewInflate;
        Button button = (Button) viewInflate.findViewById(R.id.vd_document_camera_button_shutter);
        this.mShutterButton = button;
        button.setOnClickListener(new com.dasnano.vddocumentcapture.fragments.j(this, button));
        this.mBubbleWindow = (BubbleWindow) AppUtil.dismiss(this.mBubbleWindow);
        this.mBubbleWindow = new BubbleWindow(getActivity(), getConfiguration());
        this.O0 = (TranslucentLayer) this.N0.findViewById(R.id.vd_document_document_translucent_layer);
        this.mPossibleDocs = this.mDocumentType.clone();
        this.mSecondsWithoutShutterButtonObverse = this.configSecondsWithoutShutterButtonObverse;
        this.mSecondsWithoutShutterButtonReverse = this.configSecondsWithoutShutterButtonReverse;
        this.mSecondsWithShutterButtonMessage = this.configSecondsWithShutterButtonMessage;
        DocumentFace documentFace = ((DocumentClassificationViewModel) this.viewModel).getDocumentFace();
        DocumentFace documentFace2 = DocumentFace.OBVERSE;
        if (documentFace == documentFace2) {
            if (this.mSecondsWithoutShutterButtonObverse < this.configObverseSmartDetectorTimeOutSeconds) {
                throw new IllegalArgumentException("SECONDS_WITHOUT_SHUTTER_BUTTON_OBVERSE must never be less than ADVANCED_DETECTION_OBVERSE_DELAY");
            }
        } else if (this.mSecondsWithoutShutterButtonReverse < this.configReverseSmartDetectorTimeOutSeconds) {
            throw new IllegalArgumentException("SECONDS_WITHOUT_SHUTTER_BUTTON_REVERSE must never be less than ADVANCED_DETECTION_REVERSE_DELAY");
        }
        ?? configuration = getConfiguration();
        BidiCodeManager bidiCodeManager = new BidiCodeManager(new AndroidVisionBidiCodeFinder(), new ResourcesBidiCodePlacementsProvider(getBlockingResourcesDatabaseLazy()), new AndroidBidiCodeLogger("BIDI_DETECTION"), new o());
        Vibrator vibrator = (Vibrator) getContext().getSystemService("vibrator");
        this.cameraManager.setBidiCodeManager(bidiCodeManager);
        this.cameraManager.setCanTakePicture(true);
        this.cameraManager.setLogger(getLoggerLazy());
        this.cameraManager.setVibrator(vibrator);
        boolean z10 = ((DocumentClassificationViewModel) this.viewModel).getDocumentFace() == documentFace2;
        this.userVisualHelpManager.initialize(activity, this.N0);
        try {
            this.userVisualHelpManager.applyConfiguration(getActivity(), configuration);
        } catch (IllegalColorValueException | PropertyNameNotFoundException e5) {
            Log.e("DocumentFragment", e5);
        }
        this.userVisualHelpManager.drawTextViewHelp((String) this.mDocumentType.b(), z10);
        this.userVisualHelpManager.setImageViewHelpTemplateDocVisibility();
        this.userVisualHelpManager.setLightSpotsViewColor(this.configBrightsHelpCircleColor);
        if (this.configShowCloseButton) {
            this.closeButtonManager.createCloseButton(activity, this.N0);
        }
        return this.N0;
    }

    @Override // com.dasnano.vddocumentcapture.managers.CameraManagerBase.LayoutInterface
    public void onPictureTaken(Picture picture, SpatialDetectionResult spatialDetectionResult, GenericDocumentState genericDocumentState) {
        int i10 = i.f39344a[genericDocumentState.ordinal()];
        if (i10 == 1) {
            onPictureTakenAnalizingObverse(picture, spatialDetectionResult);
        } else {
            if (i10 != 2) {
                return;
            }
            onPictureTakenAnalizingReverse(picture, spatialDetectionResult);
        }
    }

    public void onPictureTakenAnalizingObverse(Picture picture, SpatialDetectionResult spatialDetectionResult) {
        boolean zIsPassport = Document.isPassport((String) this.mDocumentType.b());
        this.userVisualHelpManager.removeCallbacks(this.backgroundThreadsManager);
        if (!zIsPassport) {
            endOfObverseCapture(new com.dasnano.vddocumentcapture.fragments.m(this, picture, spatialDetectionResult));
            return;
        }
        new Handler().postDelayed(new com.dasnano.vddocumentcapture.fragments.n(this), 400L);
        delegateImagesInAnotherThread(picture, spatialDetectionResult, VDEnums.VDCaptureType.VD_OBVERSE_PASSPORT_WITHOUT_FLASH);
        if (this.cameraManager.shouldShowDocument()) {
            this.userVisualHelpManager.drawDocumentHelpTemplate(null, DocumentFace.OBVERSE, this.mReferenceRect, getBlockingResourcesDatabaseLazy());
        }
    }

    public void onPictureTakenAnalizingReverse(Picture picture, SpatialDetectionResult spatialDetectionResult) {
        delegateImagesInAnotherThread(picture, spatialDetectionResult, VDEnums.VDCaptureType.VD_REVERSE_WITHOUT_FLASH);
        this.userVisualHelpManager.removeCallbacks(this.backgroundThreadsManager);
        this.dialogRegistry.discard();
        showValidationTick();
        if (this.cameraManager.shouldShowDocument()) {
            this.cameraManager.setCanTakePicture(true);
        }
    }

    public final void p(boolean z10) {
        Intent intent = new Intent(FINISH_FRAGMENT);
        intent.putExtra(FINISH_FRAGMENT, z10);
        broadcastIntent(intent);
    }

    public void permissionsDenied() {
        p(false);
    }

    public final FrameLayout.LayoutParams q() {
        Point correctedDisplaySize = getCorrectedDisplaySize();
        if (correctedDisplaySize == null) {
            correctedDisplaySize = this.R0;
        }
        int i10 = -((correctedDisplaySize.x - this.R0.x) / 2);
        int i11 = -((correctedDisplaySize.y - this.R0.y) / 2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(correctedDisplaySize.x, correctedDisplaySize.y);
        layoutParams.setMargins(i10, i11, i10, i11);
        return layoutParams;
    }

    public final DefaultDocumentDetectorFactory r() {
        return new DefaultDocumentDetectorFactory(CaptureType.DOCUMENT, ((DocumentClassificationViewModel) this.viewModel).getDocumentFace() == DocumentFace.OBVERSE ? Side.OBVERSE : Side.REVERSE, getBlockingResourcesDatabaseLazy(), getLoggerLazy(), getDocumentType());
    }

    public void requirementsFailed() {
        p(false);
    }

    @Override // com.veridas.fragment.DasCaptureFragment, com.dasnano.vddocumentcapture.managers.CameraManagerBase.LayoutInterface
    public void restartCamera(CameraAction cameraAction) {
        this.isRecoveringFromCameraRestart.set(true);
        super.restartCamera(cameraAction);
    }

    public void restartWaitingChangeDetector() {
        if (this.configSmartAndRectDetector) {
            this.smartDetectorTimeOut.set(false);
            invalidateSmartDetector();
            this.M0.postDelayed(this.mStartDetectionRunnableSmartRectDetector, this.detectionHandlerDelay);
        }
    }

    public void restartWaitingShutterButton() {
        this.M0.postDelayed(this.mStartDetectionRunnableShutterButton, this.detectionHandlerDelay);
    }

    public final void s(DocumentFace documentFace) {
        this.mDocumentFoundPrevious = "";
        if (documentFace == DocumentFace.OBVERSE) {
            this.mPictureWithButtonIsShowing = false;
            this.mDocumentType.c(this.mOriginalDocs);
            this.mPossibleDocs = new ArrayList(this.mOriginalDocs);
        }
    }

    @Override // com.dasnano.vddocumentcapture.managers.CameraManagerBase.LayoutInterface
    public synchronized void setArrowAttributes(Rect rect) {
        runOnUiThread(new a(rect));
    }

    @Override // com.veridas.fragment.DasCaptureFragment
    public void setCameraQueryArguments(CameraQuery cameraQuery) {
        cameraQuery.preferAutoFocus(true).facing(this.configIsFrontFacingCamera ? Camera.Facing.FRONT : Camera.Facing.BACK);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.veridas.config.Configuration] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setDocumentFace(DocumentFace documentFace) {
        s(documentFace);
        runOnUiThread(new com.dasnano.vddocumentcapture.fragments.i(this));
        t(documentFace);
        u(documentFace);
        this.userVisualHelpManager.setTextToShowDependingOnDocumentTypeAndState((String) this.mDocumentType.b(), documentFace);
        this.cameraManager.setCanTakePicture(true);
        this.userVisualHelpManager.postHelpDelayed(getActivity(), getConfiguration(), this.backgroundThreadsManager);
    }

    @Override // com.dasnano.vddocumentcapture.managers.CameraManagerBase.LayoutInterface
    public void setDocumentReferenceDocumentOrFaceRectangle(int i10) {
        this.userVisualHelpManager.setReferenceRectColor(i10);
        runOnUiThread(new b());
    }

    @Override // com.dasnano.vddocumentcapture.managers.CameraManagerBase.LayoutInterface
    public void setGenericDocumentState(GenericDocumentState genericDocumentState) {
        synchronized (((DocumentClassificationViewModel) this.viewModel)) {
            ((DocumentClassificationViewModel) this.viewModel).setGenericDocumentState(genericDocumentState);
        }
    }

    @Override // com.dasnano.vddocumentcapture.managers.CameraManagerBase.LayoutInterface
    public void setLastPictureIsBlurry(boolean z10) {
        this.lastPictureIsBlurry.set(z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean shouldCaptureReverse() {
        VDDocumentConfiguration vDDocumentConfiguration = (VDDocumentConfiguration) getConfiguration();
        boolean z10 = false;
        if (vDDocumentConfiguration.isOnlyObverseBooleanAndTrue()) {
            ((DocumentClassificationViewModel) this.viewModel).setShouldCaptureReverse(false);
            return false;
        }
        List<String> onlyObverseDocuments = vDDocumentConfiguration.getOnlyObverseDocuments();
        if (onlyObverseDocuments != null && this.mPossibleDocs.size() <= onlyObverseDocuments.size()) {
            boolean z11 = !onlyObverseDocuments.containsAll(this.mPossibleDocs);
            ((DocumentClassificationViewModel) this.viewModel).setShouldCaptureReverse(z11);
            return z11;
        }
        Iterator<String> it = this.mPossibleDocs.iterator();
        while (it.hasNext()) {
            Document documentById = getBlockingResourcesDatabaseLazy().getDocumentById(it.next());
            if (documentById == null || documentById.getReverse() != null) {
                z10 = true;
                break;
            }
        }
        ((DocumentClassificationViewModel) this.viewModel).setShouldCaptureReverse(z10);
        return z10;
    }

    public void showAlertDialog(FrameLayout.LayoutParams layoutParams, Dialog dialog, String str, Rect rect) {
        dialog.show();
        if (rect == null || str.equalsIgnoreCase("white")) {
            return;
        }
        Window window = dialog.getWindow();
        int iRound = Math.round(this.R0.x * 0.5729167f);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 3;
        attributes.width = iRound;
        attributes.x = ((rect.width() - iRound) / 2) + layoutParams.leftMargin + rect.left;
        window.setAttributes(attributes);
    }

    @Override // com.dasnano.vddocumentcapture.managers.CameraManagerBase.LayoutInterface
    public void showCameraErrorAlert() {
        runOnUiThread(new androidx.camera.core.r1(this, 3));
    }

    @Override // com.dasnano.vddocumentcapture.managers.CameraManagerBase.LayoutInterface
    public void showValidationTick() {
        runOnUiThread(new c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.veridas.config.Configuration] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void startCapture() {
        restartWaitingShutterButton();
        restartWaitingChangeDetector();
        if (getGenericDocumentState().isSearchingDocument) {
            this.userVisualHelpManager.removeCallbacks(this.backgroundThreadsManager);
            this.userVisualHelpManager.postHelpDelayed(getActivity(), getConfiguration(), this.backgroundThreadsManager);
        }
        this.userVisualHelpManager.enableTextViewHelp();
        w();
    }

    public void startProcess() {
        if (this.P0.get() && this.Q0.get()) {
            correctSurfaceSize(new androidx.camera.core.imagecapture.m(this, 2));
        }
    }

    public final void t(DocumentFace documentFace) {
        if (this.mDocumentType.d() == 1) {
            this.userVisualHelpManager.drawDocumentHelpTemplate((String) this.mDocumentType.b(), documentFace, this.mReferenceRect, getBlockingResourcesDatabaseLazy());
        } else if (documentFace == DocumentFace.OBVERSE) {
            this.userVisualHelpManager.drawDocumentHelpTemplate(null, documentFace, this.mReferenceRect, getBlockingResourcesDatabaseLazy());
        }
    }

    public void takeFirstPicture() {
        GenericDocumentState genericDocumentState = getGenericDocumentState();
        if (genericDocumentState.isSearchingDocument) {
            if (genericDocumentState.isObverseFace) {
                setGenericDocumentState(GenericDocumentState.ANALYZING_OBVERSE);
            } else if (genericDocumentState.isReverseFace) {
                setGenericDocumentState(GenericDocumentState.ANALYZING_REVERSE);
            }
        }
        this.cameraManager.tryToTakeAPictureOnFocus();
    }

    public void templateDistance(final VDConstantDefinition.TemplateProximity templateProximity) {
        final int i10;
        GenericDocumentState genericDocumentState = getGenericDocumentState();
        if (!this.isRunning.get() || genericDocumentState.isCapturePossible || this.previousTemplateProximity == templateProximity) {
            return;
        }
        VDLogger.log(Logger.Tag.TEMPLATE_DISTANCE, templateProximity.toString());
        boolean z10 = getGenericDocumentState().isSearching;
        VDConstantDefinition.TemplateProximity templateProximity2 = VDConstantDefinition.TemplateProximity.ERROR;
        if (templateProximity == templateProximity2) {
            i10 = ViewCompat.MEASURED_STATE_MASK;
        } else if (templateProximity == VDConstantDefinition.TemplateProximity.EXTREMELY_FAR && z10) {
            i10 = this.configDocumentDetectedVeryFarColor;
        } else {
            i10 = (templateProximity == VDConstantDefinition.TemplateProximity.EXTREMELY_CLOSE && z10) ? this.configDocumentDetectedVeryCloseColor : -1;
        }
        this.previousTemplateProximity = templateProximity;
        boolean z11 = getGenericDocumentState().isSearching;
        this.actualTemplateProximity = (templateProximity == templateProximity2 || (templateProximity == VDConstantDefinition.TemplateProximity.EXTREMELY_FAR && z11) || (templateProximity == VDConstantDefinition.TemplateProximity.EXTREMELY_CLOSE && z11)) ? templateProximity : VDConstantDefinition.TemplateProximity.NOT_FOUND;
        if (!getGenericDocumentState().isSearching || this.mShutterButtonMessageIsShowing) {
            this.userVisualHelpManager.disableTextViewHelp();
        } else {
            this.userVisualHelpManager.enableTextViewHelp();
        }
        this.userVisualHelpManager.setTextToShowDependingOnTemplateProximity(genericDocumentState, templateProximity);
        runOnUiThread(new Runnable() { // from class: com.dasnano.vddocumentcapture.fragments.e
            @Override // java.lang.Runnable
            public final void run() {
                DocumentFragment documentFragment = this.f39365p0;
                VDConstantDefinition.TemplateProximity templateProximity3 = templateProximity;
                int i11 = i10;
                String str = DocumentFragment.CAMERA_FAILURE;
                boolean z12 = documentFragment.getGenericDocumentState().isSearching;
                documentFragment.userVisualHelpManager.setReferenceRectColor(i11);
                if (templateProximity3 == VDConstantDefinition.TemplateProximity.ERROR) {
                    documentFragment.userVisualHelpManager.setDocumentReferenceDocumentOrFaceRectangle(documentFragment.getActivity(), documentFragment.mReferenceRect, documentFragment.R0);
                } else if (templateProximity3 == VDConstantDefinition.TemplateProximity.NOT_FOUND) {
                    if (z12) {
                        documentFragment.userVisualHelpManager.setDocumentReferenceDocumentOrFaceRectangle(documentFragment.getActivity(), documentFragment.mReferenceRect, documentFragment.R0);
                    }
                } else if ((templateProximity3 == VDConstantDefinition.TemplateProximity.EXTREMELY_FAR && z12) || templateProximity3 != VDConstantDefinition.TemplateProximity.EXTREMELY_CLOSE || z12) {
                    documentFragment.userVisualHelpManager.setDocumentReferenceDocumentOrFaceRectangle(documentFragment.getActivity(), documentFragment.mReferenceRect, documentFragment.R0);
                } else {
                    documentFragment.userVisualHelpManager.setDocumentReferenceDocumentOrFaceRectangle(documentFragment.getActivity(), documentFragment.mReferenceRect, documentFragment.R0);
                }
                documentFragment.v();
            }
        });
    }

    public final void u(DocumentFace documentFace) {
        if (Document.isPassport((String) this.mDocumentType.b())) {
            setGenericDocumentState(GenericDocumentState.SEARCHING_PASSPORT);
        } else if (documentFace == DocumentFace.OBVERSE) {
            setGenericDocumentState(GenericDocumentState.SEARCHING_OBVERSE);
        } else {
            setGenericDocumentState(GenericDocumentState.SEARCHING_REVERSE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.veridas.config.Configuration] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void updateFps(double d2) {
        VDLogger.log(Logger.Tag.FPS, "%.4f", Double.valueOf(d2));
        this.userVisualHelpManager.removeCallbacks(this.backgroundThreadsManager);
        this.userVisualHelpManager.postHelpDelayed(getActivity(), getConfiguration(), this.backgroundThreadsManager);
    }

    public final void v() {
        boolean z10 = !this.mShutterButtonMessageIsShowing;
        CharSequence textToShow = this.userVisualHelpManager.getTextToShow();
        if (getGenericDocumentState().isSearching && z10 && !this.emptyDocumentString.equalsIgnoreCase(textToShow.toString())) {
            this.userVisualHelpManager.setHelpText(textToShow);
        } else {
            this.userVisualHelpManager.setHelpText(null);
        }
    }

    public final void w() {
        int i10 = this.configObverseDetectionDelay;
        GenericDocumentState genericDocumentState = getGenericDocumentState();
        this.cameraManager.setCanDetectDocument(false);
        if (genericDocumentState.isReverseFace) {
            i10 = this.configReverseDetectionDelay;
            if (!((DocumentClassificationViewModel) this.viewModel).getAlreadyFlipped()) {
                this.userVisualHelpManager.flipDocument();
                ((DocumentClassificationViewModel) this.viewModel).setAlreadyFlipped(true);
            }
        }
        new Handler().postDelayed(new p(), i10 > 0 ? i10 * 1000 : 0);
    }

    public void correctSurfaceSize(Runnable runnable) {
        runOnUiThread(new androidx.room.i(this, runnable));
    }

    @Override // com.dasnano.vddocumentcapture.managers.UserVisualHelpManager.HelpManagerInterface
    public DocumentClassificationInterface getIVDDocumentDelegate() {
        return this;
    }

    public void requirementsSuccess() {
    }

    public class h extends CapturePermissionDialogAdapter {
        public h() {
        }

        @Override // com.veridas.fragment.permission.CapturePermissionDialogAdapter, com.veridas.fragment.permission.CapturePermissionDialogListener
        public final void onCapturePermissionsShow(AlertDialog alertDialog) {
            int color = DocumentFragment.this.getResources().getColor(R.color.vd_document_dialog_button);
            alertDialog.getButton(-1).setTextColor(color);
            alertDialog.getButton(-2).setTextColor(color);
        }

        @Override // com.veridas.fragment.permission.CapturePermissionDialogAdapter, com.veridas.fragment.permission.CapturePermissionDialogListener
        public final void onClickCapturePermissionsDenied(AlertDialog alertDialog) {
            DocumentFragment.this.permissionsDenied();
        }

        @Override // com.veridas.fragment.permission.CapturePermissionDialogAdapter, com.veridas.fragment.permission.CapturePermissionDialogListener
        public final void onClickCapturePermissionsAccepted(AlertDialog alertDialog) {
        }
    }
}
