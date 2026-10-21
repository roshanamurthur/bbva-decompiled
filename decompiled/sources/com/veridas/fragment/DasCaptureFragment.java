package com.veridas.fragment;

import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.media.MediaRecorder;
import android.view.Display;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.veridas.camera.Camera;
import com.veridas.camera.CameraAction;
import com.veridas.camera.CameraException;
import com.veridas.camera.CameraListener;
import com.veridas.camera.CameraQuery;
import com.veridas.camera.CameraSystemFactory;
import com.veridas.camera.NoPreviewSurfaceAvailableException;
import com.veridas.camera.one.CameraOneCameraSystemFactory;
import com.veridas.camera.picture.Picture;
import com.veridas.camera.resolution.Resolution;
import com.veridas.config.Configuration;
import com.veridas.display.DisplayOrientation;
import com.veridas.display.DisplayUtils;
import com.veridas.fragment.permission.CapturePermissionAdapter;
import com.veridas.fragment.permission.CapturePermissionDialogListener;
import com.veridas.fragment.permission.CapturePermissionListener;
import com.veridas.fragment.requirement.HardwareRequirementAdapter;
import com.veridas.fragment.requirement.HardwareRequirementListener;
import com.veridas.lifecycle.DasViewModel;
import com.veridas.log.Log;
import com.veridas.util.AppUtil;
import com.veridas.view.surface.DualExecuteSurfaceTextureListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public abstract class DasCaptureFragment<C extends Configuration, V extends DasViewModel<C>> extends DasFragment<C, V> {
    public static final /* synthetic */ int I0 = 0;
    public DualExecuteSurfaceTextureListener E0;
    public com.veridas.fragment.d F0;
    public final i G0;
    public final j H0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final AtomicBoolean f67096s0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final AtomicBoolean f67097t0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final AtomicBoolean f67098u0 = new AtomicBoolean(false);
    public final ArrayList v0 = new ArrayList();

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final ArrayList f67099w0 = new ArrayList();

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Object f67100x0 = new Object();

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public AlertDialog f67101y0 = null;
    protected volatile Camera camera = null;

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object f67102p0;

        public a(Object obj) {
            this.f67102p0 = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = DasCaptureFragment.this.v0.iterator();
            while (it.hasNext()) {
                ((CapturePermissionListener) it.next()).onCapturePermissionsDenied(this.f67102p0);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object f67104p0;

        public b(Object obj) {
            this.f67104p0 = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = DasCaptureFragment.this.v0.iterator();
            while (it.hasNext()) {
                ((CapturePermissionListener) it.next()).onCapturePermissionsGranted(this.f67104p0);
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object f67106p0;

        public c(Object obj) {
            this.f67106p0 = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = DasCaptureFragment.this.v0.iterator();
            while (it.hasNext()) {
                ((CapturePermissionListener) it.next()).onCapturePermissionsIncomplete(this.f67106p0);
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object f67108p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f67109q0;

        public d(Object obj, String str) {
            this.f67108p0 = obj;
            this.f67109q0 = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = DasCaptureFragment.this.f67099w0.iterator();
            while (it.hasNext()) {
                ((HardwareRequirementListener) it.next()).onHardwareRequirementFailed(this.f67108p0, this.f67109q0);
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object f67111p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f67112q0;

        public e(Object obj, String str) {
            this.f67111p0 = obj;
            this.f67112q0 = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = DasCaptureFragment.this.f67099w0.iterator();
            while (it.hasNext()) {
                ((HardwareRequirementListener) it.next()).onHardwareRequirementMet(this.f67111p0, this.f67112q0);
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object f67114p0;

        public f(Object obj) {
            this.f67114p0 = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = DasCaptureFragment.this.f67099w0.iterator();
            while (it.hasNext()) {
                ((HardwareRequirementListener) it.next()).onHardwareRequirementsFailed(this.f67114p0);
            }
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object f67116p0;

        public g(Object obj) {
            this.f67116p0 = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = DasCaptureFragment.this.f67099w0.iterator();
            while (it.hasNext()) {
                ((HardwareRequirementListener) it.next()).onHardwareRequirementsMet(this.f67116p0);
            }
        }
    }

    public class h extends FragmentLifecycleAdapter {
        public h() {
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onAfterPaused(DasFragment dasFragment) {
            DasCaptureFragment dasCaptureFragment = DasCaptureFragment.this;
            dasCaptureFragment.destroyCamera();
            dasCaptureFragment.f67097t0.set(false);
            dasCaptureFragment.f67096s0.set(false);
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onBeforeResumed(DasFragment dasFragment) {
            DasCaptureFragment.this.assertHardwareRequirements();
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onDestroyed(DasFragment dasFragment) {
            DasCaptureFragment.this.destroyPermissionDialog();
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onStarted(DasFragment dasFragment) {
            DasCaptureFragment dasCaptureFragment = DasCaptureFragment.this;
            dasCaptureFragment.addCapturePermissionListener(dasCaptureFragment.G0);
            dasCaptureFragment.addHardwareRequirementListener(dasCaptureFragment.H0);
            try {
                DasCaptureFragment.a(dasCaptureFragment);
            } catch (CameraException e5) {
                int i10 = DasCaptureFragment.I0;
                Log.e("DasCaptureFragment", e5);
                dasCaptureFragment.fireOnException(e5);
            }
        }

        @Override // com.veridas.fragment.FragmentLifecycleAdapter, com.veridas.fragment.FragmentLifecycleListener
        public final void onStopped(DasFragment dasFragment) {
            DasCaptureFragment dasCaptureFragment = DasCaptureFragment.this;
            dasCaptureFragment.closePermissionDialog();
            View previewSurface = dasCaptureFragment.getPreviewSurface();
            if (previewSurface instanceof SurfaceView) {
                ((SurfaceView) previewSurface).getHolder().removeCallback(dasCaptureFragment.F0);
                dasCaptureFragment.F0 = null;
            } else if (previewSurface instanceof TextureView) {
                dasCaptureFragment.E0.setFragmentSurfaceTextureListener(null);
                ((TextureView) previewSurface).setSurfaceTextureListener(null);
                dasCaptureFragment.E0 = null;
            }
            dasCaptureFragment.setPreviewSurfaceUnavailable();
            dasCaptureFragment.removeHardwareRequirementListener(dasCaptureFragment.H0);
            dasCaptureFragment.removeCapturePermissionListener(dasCaptureFragment.G0);
        }
    }

    public class i extends CapturePermissionAdapter {
        public i() {
        }

        @Override // com.veridas.fragment.permission.CapturePermissionAdapter, com.veridas.fragment.permission.CapturePermissionListener
        public final void onCapturePermissionsDenied(Object obj) {
            DasCaptureFragment.this.f67096s0.set(false);
        }

        @Override // com.veridas.fragment.permission.CapturePermissionAdapter, com.veridas.fragment.permission.CapturePermissionListener
        public final void onCapturePermissionsGranted(Object obj) {
            DasCaptureFragment dasCaptureFragment = DasCaptureFragment.this;
            dasCaptureFragment.f67096s0.set(true);
            dasCaptureFragment.startCamera();
        }
    }

    public class j extends HardwareRequirementAdapter {
        public j() {
        }

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
        @Override // com.veridas.fragment.requirement.HardwareRequirementAdapter, com.veridas.fragment.requirement.HardwareRequirementListener
        public final void onHardwareRequirementsMet(Object obj) {
            DasCaptureFragment dasCaptureFragment = DasCaptureFragment.this;
            dasCaptureFragment.f67097t0.set(true);
            FragmentActivity activity = dasCaptureFragment.getActivity();
            for (String str : dasCaptureFragment.getCapturePermissions()) {
                if (ContextCompat.checkSelfPermission(activity, str) == -1) {
                    dasCaptureFragment.firePermissionDeniedEvent(dasCaptureFragment, str);
                    dasCaptureFragment.firePermissionsDeniedEvent(dasCaptureFragment);
                    String[] capturePermissions = dasCaptureFragment.getCapturePermissions();
                    if (dasCaptureFragment.shouldShowRequestPermissionRationale(capturePermissions)) {
                        dasCaptureFragment.showPermissionDialog();
                        return;
                    } else {
                        dasCaptureFragment.requestPermissions(capturePermissions, dasCaptureFragment.getCapturePermissionRequestCode());
                        return;
                    }
                }
                dasCaptureFragment.firePermissionGrantedEvent(dasCaptureFragment, str);
            }
            dasCaptureFragment.firePermissionsGrantedEvent(dasCaptureFragment);
        }
    }

    public class k implements CameraListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CameraListener f67121a;

        public k(CameraListener cameraListener) {
            this.f67121a = cameraListener;
        }

        @Override // com.veridas.camera.CameraListener
        public final void onAvailable(Camera camera) {
            this.f67121a.onAvailable(camera);
        }

        @Override // com.veridas.camera.CameraListener
        public final void onError(Camera camera, Camera.Error error) {
            this.f67121a.onError(camera, error);
        }

        @Override // com.veridas.camera.CameraListener
        public final void onFocusFinished(Camera camera, boolean z10) {
            this.f67121a.onFocusFinished(camera, z10);
        }

        @Override // com.veridas.camera.CameraListener
        public final void onFocusStarted(Camera camera) {
            this.f67121a.onFocusStarted(camera);
        }

        @Override // com.veridas.camera.CameraListener
        public final void onLocked(Camera camera) {
            this.f67121a.onLocked(camera);
        }

        @Override // com.veridas.camera.CameraListener
        public final void onMediaRecorderInitialized(Camera camera, MediaRecorder mediaRecorder) {
            this.f67121a.onMediaRecorderInitialized(camera, mediaRecorder);
        }

        @Override // com.veridas.camera.CameraListener
        public final void onMediaRecorderStarted(Camera camera, MediaRecorder mediaRecorder) {
            this.f67121a.onMediaRecorderStarted(camera, mediaRecorder);
        }

        @Override // com.veridas.camera.CameraListener
        public final void onMediaRecorderStopped(Camera camera, MediaRecorder mediaRecorder) {
            this.f67121a.onMediaRecorderStopped(camera, mediaRecorder);
        }

        @Override // com.veridas.camera.CameraListener
        public final void onParametersChanged(Camera camera) {
            this.f67121a.onParametersChanged(camera);
        }

        @Override // com.veridas.camera.CameraListener
        public final void onPictureReady(Camera camera, Picture picture) {
            this.f67121a.onPictureReady(camera, picture);
        }

        @Override // com.veridas.camera.CameraListener
        public final void onPreviewReady(Camera camera, Picture picture) {
            this.f67121a.onPreviewReady(camera, picture);
        }

        @Override // com.veridas.camera.CameraListener
        public final void onPreviewStarted(Camera camera) {
            this.f67121a.onPreviewStarted(camera);
        }

        @Override // com.veridas.camera.CameraListener
        public final void onPreviewStopped(Camera camera) {
            this.f67121a.onPreviewStopped(camera);
        }

        @Override // com.veridas.camera.CameraListener
        public final void onPreviewSurfaceChanged(Camera camera, Resolution resolution) {
            this.f67121a.onPreviewSurfaceChanged(camera, resolution);
        }

        @Override // com.veridas.camera.CameraListener
        public final void onReconnected(Camera camera) {
            this.f67121a.onReconnected(camera);
        }

        @Override // com.veridas.camera.CameraListener
        public final void onReleased(Camera camera) {
            this.f67121a.onReleased(camera);
        }

        @Override // com.veridas.camera.CameraListener
        public final void onReoriented(Camera camera) {
            this.f67121a.onReoriented(camera);
        }

        @Override // com.veridas.camera.CameraListener
        public final void onStarted(Camera camera) {
            this.f67121a.onStarted(camera);
        }

        @Override // com.veridas.camera.CameraListener
        public final void onStopped(Camera camera) {
            this.f67121a.onStopped(camera);
        }

        @Override // com.veridas.camera.CameraListener
        public final void onUnlocked(Camera camera) {
            this.f67121a.onUnlocked(camera);
        }
    }

    public class l implements CameraAction {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CameraAction f67122p0;

        public l(CameraAction cameraAction) {
            this.f67122p0 = cameraAction;
        }

        @Override // com.veridas.camera.CameraAction
        public final void execute(boolean z10) {
            CameraAction cameraAction = this.f67122p0;
            if (z10) {
                DasCaptureFragment.this.startCamera(cameraAction);
            } else if (cameraAction != null) {
                cameraAction.execute(false);
            }
        }
    }

    public class m implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object f67124p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f67125q0;

        public m(Object obj, String str) {
            this.f67124p0 = obj;
            this.f67125q0 = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = DasCaptureFragment.this.v0.iterator();
            while (it.hasNext()) {
                ((CapturePermissionListener) it.next()).onCapturePermissionDenied(this.f67124p0, this.f67125q0);
            }
        }
    }

    public class n implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Object f67127p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f67128q0;

        public n(Object obj, String str) {
            this.f67127p0 = obj;
            this.f67128q0 = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = DasCaptureFragment.this.v0.iterator();
            while (it.hasNext()) {
                ((CapturePermissionListener) it.next()).onCapturePermissionGranted(this.f67127p0, this.f67128q0);
            }
        }
    }

    public DasCaptureFragment() {
        h hVar = new h();
        this.G0 = new i();
        this.H0 = new j();
        addLifecycleListener(hVar);
    }

    public static void a(DasCaptureFragment dasCaptureFragment) throws NoPreviewSurfaceAvailableException {
        View previewSurface = dasCaptureFragment.getPreviewSurface();
        if (previewSurface == null) {
            throw new NullPointerException("Preview surface cannot be null.");
        }
        if (previewSurface instanceof SurfaceView) {
            dasCaptureFragment.F0 = new com.veridas.fragment.d(dasCaptureFragment);
            ((SurfaceView) previewSurface).getHolder().addCallback(dasCaptureFragment.F0);
        } else {
            if (!(previewSurface instanceof TextureView)) {
                Log.e("DasCaptureFragment", "No preview surface available for camera, the camera will not work.");
                throw new NoPreviewSurfaceAvailableException(dasCaptureFragment.camera.getId());
            }
            DualExecuteSurfaceTextureListener dualExecuteSurfaceTextureListener = new DualExecuteSurfaceTextureListener();
            dasCaptureFragment.E0 = dualExecuteSurfaceTextureListener;
            dualExecuteSurfaceTextureListener.setFragmentSurfaceTextureListener(new com.veridas.fragment.e(dasCaptureFragment));
            ((TextureView) previewSurface).setSurfaceTextureListener(dasCaptureFragment.E0);
        }
    }

    public void addCapturePermissionListener(CapturePermissionListener capturePermissionListener) {
        this.v0.add(capturePermissionListener);
    }

    public void addHardwareRequirementListener(HardwareRequirementListener hardwareRequirementListener) {
        this.f67099w0.add(hardwareRequirementListener);
    }

    public void assertHardwareRequirements() {
        String[] hardwareRequirements = getHardwareRequirements();
        if (this.f67097t0.get() || hardwareRequirements == null) {
            fireHardwareRequirementsMet(this);
            return;
        }
        PackageManager packageManager = getActivity().getPackageManager();
        boolean z10 = true;
        for (String str : hardwareRequirements) {
            if (packageManager.hasSystemFeature(str)) {
                fireHardwareRequirementMet(this, str);
            } else {
                fireHardwareRequirementFailed(this, str);
                z10 = false;
            }
        }
        if (z10) {
            fireHardwareRequirementsMet(this);
        } else {
            fireHardwareRequirementsFailed(this);
        }
    }

    public final void b(Camera camera) throws CameraException {
        View previewSurface = getPreviewSurface();
        if (previewSurface == null) {
            throw new NullPointerException("Preview surface cannot be null.");
        }
        if (previewSurface instanceof SurfaceView) {
            camera.setPreviewSurface((SurfaceView) previewSurface);
        } else if (previewSurface instanceof TextureView) {
            camera.setPreviewSurface((TextureView) previewSurface);
        } else {
            Log.e("DasCaptureFragment", "No preview surface available for camera, the camera will not work.");
            throw new NoPreviewSurfaceAvailableException(camera.getId());
        }
    }

    public void clearCamera() {
        synchronized (this) {
            this.camera = null;
        }
    }

    public void closePermissionDialog() {
        destroyPermissionDialog();
    }

    public abstract CapturePermissionDialogListener createCapturePermissionDialogListener();

    public AlertDialog createPermissionDialog() {
        final CapturePermissionDialogListener capturePermissionDialogListenerCreateCapturePermissionDialogListener = createCapturePermissionDialogListener();
        AlertDialog alertDialogCreate = createPermissionDialogBuilder().setCancelable(false).setNegativeButton(getCapturePermissionDialogNegativeButtonText(), new DialogInterface.OnClickListener() { // from class: com.veridas.fragment.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                int i11 = DasCaptureFragment.I0;
                this.f67133p0.destroyPermissionDialog();
                capturePermissionDialogListenerCreateCapturePermissionDialogListener.onClickCapturePermissionsDenied((AlertDialog) dialogInterface);
            }
        }).setPositiveButton(getCapturePermissionDialogPositiveButtonText(), new DialogInterface.OnClickListener() { // from class: com.veridas.fragment.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                int i11 = DasCaptureFragment.I0;
                DasCaptureFragment dasCaptureFragment = this.f67135p0;
                dasCaptureFragment.destroyPermissionDialog();
                dasCaptureFragment.requestPermissions(dasCaptureFragment.getCapturePermissions(), dasCaptureFragment.getCapturePermissionRequestCode());
                capturePermissionDialogListenerCreateCapturePermissionDialogListener.onClickCapturePermissionsAccepted((AlertDialog) dialogInterface);
            }
        }).create();
        alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.veridas.fragment.c
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                int i10 = DasCaptureFragment.I0;
                capturePermissionDialogListenerCreateCapturePermissionDialogListener.onCapturePermissionsShow((AlertDialog) dialogInterface);
            }
        });
        return alertDialogCreate;
    }

    public abstract AlertDialog.Builder createPermissionDialogBuilder();

    public void destroyCamera() {
        destroyCamera(null);
    }

    public void destroyPermissionDialog() {
        this.f67101y0 = (AlertDialog) AppUtil.dismiss(this.f67101y0);
    }

    public void fireHardwareRequirementFailed(Object obj, String str) {
        runOnUiThread(new d(obj, str));
    }

    public void fireHardwareRequirementMet(Object obj, String str) {
        runOnUiThread(new e(obj, str));
    }

    public void fireHardwareRequirementsFailed(Object obj) {
        runOnUiThread(new f(obj));
    }

    public void fireHardwareRequirementsMet(Object obj) {
        runOnUiThread(new g(obj));
    }

    public void firePermissionDeniedEvent(Object obj, String str) {
        runOnUiThread(new m(obj, str));
    }

    public void firePermissionGrantedEvent(Object obj, String str) {
        runOnUiThread(new n(obj, str));
    }

    public void firePermissionsDeniedEvent(Object obj) {
        runOnUiThread(new a(obj));
    }

    public void firePermissionsGrantedEvent(Object obj) {
        runOnUiThread(new b(obj));
    }

    public void firePermissionsIncompleteEvent(Object obj) {
        runOnUiThread(new c(obj));
    }

    public abstract CameraListener getCameraListener();

    public CameraSystemFactory getCameraSystemFactory() {
        return new CameraOneCameraSystemFactory();
    }

    public abstract String getCapturePermissionDialogNegativeButtonText();

    public abstract String getCapturePermissionDialogPositiveButtonText();

    public abstract int getCapturePermissionRequestCode();

    public abstract String[] getCapturePermissions();

    public Point getCorrectedDisplaySize() {
        Display defaultDisplay = DisplayUtils.getDefaultDisplay(requireContext());
        DisplayOrientation displayOrientation = this.viewModel.getDisplayOrientation();
        return DisplayUtils.getCorrectedSize(defaultDisplay, displayOrientation, this.camera == null ? DisplayUtils.getSize(defaultDisplay, displayOrientation) : this.camera.getProperties().getPreviewResolution().toPoint());
    }

    public String[] getHardwareRequirements() {
        return null;
    }

    public View getPreviewSurface() {
        return null;
    }

    public boolean initializeCamera() {
        CameraListener cameraListener = getCameraListener();
        try {
            CameraQuery cameraQueryCreate = getCameraSystemFactory().createCameraQueryFactory().create();
            setCameraQueryArguments(cameraQueryCreate);
            Camera cameraExecute = cameraQueryCreate.execute();
            synchronized (this) {
                this.camera = cameraExecute;
            }
            cameraExecute.addCameraListener(new k(cameraListener));
            b(cameraExecute);
            int surfaceRotationInDegrees = getSurfaceRotationInDegrees();
            if (!isCameraInitialized(cameraExecute)) {
                return true;
            }
            cameraExecute.reorient(surfaceRotationInDegrees);
            return true;
        } catch (CameraException e5) {
            Log.e("DasCaptureFragment", e5);
            fireOnException(e5);
            return false;
        } catch (RuntimeException e7) {
            Log.e("DasCaptureFragment", e7);
            fireOnException(new CameraException(e7));
            return false;
        }
    }

    public boolean isCameraInitialized(Camera camera) {
        return camera != null;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (isCameraInitialized(this.camera)) {
            Camera camera = this.camera;
            int surfaceRotationInDegrees = getSurfaceRotationInDegrees();
            if (isCameraInitialized(camera)) {
                camera.reorient(surfaceRotationInDegrees);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (strArr.length != 0 && i10 == getCapturePermissionRequestCode()) {
            int length = iArr.length;
            if (length != strArr.length) {
                firePermissionsIncompleteEvent(this);
                return;
            }
            LinkedList linkedList = new LinkedList();
            for (int i11 = 0; i11 < length; i11++) {
                int i12 = iArr[i11];
                String str = strArr[i11];
                if (i12 == 0) {
                    firePermissionGrantedEvent(this, str);
                } else {
                    firePermissionDeniedEvent(this, str);
                    linkedList.add(str);
                }
            }
            if (linkedList.isEmpty() || !shouldShowRequestPermissionRationale((String[]) linkedList.toArray(new String[linkedList.size()]))) {
                return;
            }
            showPermissionDialog();
        }
    }

    public void recycleFrame(Picture picture) {
        synchronized (this) {
            try {
                if (this.camera != null) {
                    this.camera.recycle(picture);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void removeCapturePermissionListener(CapturePermissionListener capturePermissionListener) {
        this.v0.remove(capturePermissionListener);
    }

    public void removeHardwareRequirementListener(HardwareRequirementListener hardwareRequirementListener) {
        this.f67099w0.remove(hardwareRequirementListener);
    }

    public void requestFrame() {
        requestFrame(null);
    }

    public void restartCamera() {
        restartCamera(null);
    }

    public abstract void setCameraQueryArguments(CameraQuery cameraQuery);

    public void setPreviewSurfaceAvailable() {
        this.f67098u0.set(true);
        startCamera();
    }

    public void setPreviewSurfaceUnavailable() {
        this.f67098u0.set(false);
    }

    public boolean shouldShowRequestPermissionRationale(String[] strArr) {
        for (String str : strArr) {
            if (shouldShowRequestPermissionRationale(str)) {
                return true;
            }
        }
        return false;
    }

    public void showPermissionDialog() {
        destroyPermissionDialog();
        AlertDialog alertDialogCreatePermissionDialog = createPermissionDialog();
        this.f67101y0 = alertDialogCreatePermissionDialog;
        if (alertDialogCreatePermissionDialog.isShowing()) {
            return;
        }
        this.f67101y0.show();
    }

    public void startCamera() {
        startCamera(null);
    }

    public void stopCamera(CameraAction cameraAction) {
        this.camera.stop(new androidx.camera.core.processing.b(this, cameraAction));
    }

    public void destroyCamera(CameraAction cameraAction) {
        if (isCameraInitialized()) {
            if (this.camera.isRecording()) {
                this.camera.stopMediaRecorder(new xd.f(this, cameraAction));
            } else {
                stopCamera(cameraAction);
            }
        }
    }

    public boolean isCameraInitialized() {
        return isCameraInitialized(this.camera);
    }

    public void requestFrame(Picture picture) {
        synchronized (this) {
            try {
                if (this.camera != null) {
                    if (picture != null) {
                        this.camera.recycle(picture);
                    }
                    this.camera.requestFrame();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void restartCamera(CameraAction cameraAction) {
        destroyCamera(new l(cameraAction));
    }

    public void startCamera(CameraAction cameraAction) {
        synchronized (this.f67100x0) {
            try {
                if (this.f67097t0.get()) {
                    if (this.f67096s0.get()) {
                        if (this.f67098u0.get()) {
                            if (!isCameraInitialized()) {
                                if (initializeCamera()) {
                                    this.camera.start(cameraAction);
                                }
                            } else {
                                Camera camera = this.camera;
                                int surfaceRotationInDegrees = getSurfaceRotationInDegrees();
                                if (isCameraInitialized(camera)) {
                                    camera.reorient(surfaceRotationInDegrees);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
