package com.dasnano.vddocumentcapture.managers;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import com.dasnano.vddocumentcapture.GenericDocumentState;
import com.dasnano.vddocumentcapture.config.VDDocumentConfiguration;
import com.dasnano.vddocumentcapture.fragments.DocumentFragment;
import com.veridas.bidicode.BidiCodeManager;
import com.veridas.camera.Camera;
import com.veridas.camera.CameraAction;
import com.veridas.camera.picture.Picture;
import com.veridas.config.Configuration;
import com.veridas.config.PropertyNameNotFoundException;
import com.veridas.detect.Request;
import com.veridas.detect.obj.ObjectDetector;
import com.veridas.detect.obj.document.DocumentDetectorFactory;
import com.veridas.detect.sequence.SequentialDetectionResult;
import com.veridas.detect.spatial.SpatialDetectionResult;
import com.veridas.graphics.Dimension;
import com.veridas.graphics.Frame;
import com.veridas.graphics.ImageEncoding;
import com.veridas.log.ILibraryLogger;
import com.veridas.log.Log;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;
import com.veridas.math.geometry.Matrix;
import com.veridas.math.geometry.Rectangle;
import com.veridas.math.geometry.VectorSpace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public class CameraManager extends CameraManagerBase {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f39387b;
    public BidiCodeManager bidiCodeManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f39388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f39390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f39391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f39392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f39393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ObjectDetector<SequentialDetectionResult> f39394i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ILibraryLogger f39395j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ObjectDetector<SequentialDetectionResult> f39396k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ObjectDetector<SequentialDetectionResult> f39397l;
    public ObjectDetector<SequentialDetectionResult> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ObjectDetector<SpatialDetectionResult> f39398n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ObjectDetector<SpatialDetectionResult> f39399o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile VectorSpace f39400p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile Rectangle f39401q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile Rectangle f39402r;

    public CameraManager(DocumentFragment documentFragment, CameraManagerBase.LayoutInterface layoutInterface, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, AtomicBoolean atomicBoolean3, AtomicBoolean atomicBoolean4) {
        super(documentFragment, layoutInterface, atomicBoolean);
        this.f39400p = null;
        this.f39401q = null;
        this.f39402r = null;
        this.f39390e = atomicBoolean2;
        this.f39391f = atomicBoolean3;
        this.f39392g = atomicBoolean4;
    }

    public void applyConfiguration(Configuration configuration) throws PropertyNameNotFoundException {
        this.f39393h = configuration.getBoolean(VDDocumentConfiguration.CAPTURE_BRIGHTS_DETECTION_ENABLED);
        this.f39387b = configuration.getBoolean(VDDocumentConfiguration.BRIGHTS_HELP);
        this.f39388c = configuration.getString("priority").equalsIgnoreCase("capture");
        this.f39389d = configuration.getBoolean(VDDocumentConfiguration.ADVANCED_DETECTION_ENABLED);
        this.configIntermittentIdentification = configuration.getBoolean(VDDocumentConfiguration.ADVANCED_DETECTION_DEFERRED);
        this.configIsFrontFacingCamera = configuration.getString("facing").equalsIgnoreCase("front");
        this.configIsOnPictureVibration = configuration.getBoolean(VDDocumentConfiguration.ON_PICTURE_VIBRATION);
        this.configMegaPixels = configuration.getDouble(VDDocumentConfiguration.MEGAPIXELS);
        this.configMustShowDocument = configuration.getBoolean(VDDocumentConfiguration.SHOW_DOCUMENT);
        this.f39389d = configuration.getBoolean(VDDocumentConfiguration.ADVANCED_DETECTION_ENABLED);
    }

    public void createDetectors(DocumentDetectorFactory documentDetectorFactory, Context context) {
        ObjectDetector<SequentialDetectionResult> objectDetectorCreateAnyDocumentAnalyzer = documentDetectorFactory.createAnyDocumentAnalyzer(context);
        this.f39396k = objectDetectorCreateAnyDocumentAnalyzer;
        objectDetectorCreateAnyDocumentAnalyzer.initialize();
        ObjectDetector<SpatialDetectionResult> objectDetectorCreateAnyDocumentDetector = documentDetectorFactory.createAnyDocumentDetector(context);
        this.f39398n = objectDetectorCreateAnyDocumentDetector;
        objectDetectorCreateAnyDocumentDetector.initialize();
        ObjectDetector<SequentialDetectionResult> objectDetectorCreateImageDocumentAnalyzer = documentDetectorFactory.createImageDocumentAnalyzer(context);
        this.f39397l = objectDetectorCreateImageDocumentAnalyzer;
        objectDetectorCreateImageDocumentAnalyzer.initialize();
        ObjectDetector<SequentialDetectionResult> objectDetectorCreateSmartDocumentAnalyzer = documentDetectorFactory.createSmartDocumentAnalyzer(context);
        this.m = objectDetectorCreateSmartDocumentAnalyzer;
        objectDetectorCreateSmartDocumentAnalyzer.initialize();
        ObjectDetector<SpatialDetectionResult> objectDetectorCreateImageDocumentDetector = documentDetectorFactory.createImageDocumentDetector(context);
        this.f39399o = objectDetectorCreateImageDocumentDetector;
        objectDetectorCreateImageDocumentDetector.initialize();
    }

    @Override // com.dasnano.vddocumentcapture.managers.CameraManagerBase
    public SpatialDetectionResult detectDocumentInCapturedFrame(Picture picture) {
        Frame frameCreateRgb = Frame.createRgb(picture.getBitmap(), picture.getRotation());
        this.layoutInterface.getGenericDocumentState();
        VectorSpace vectorSpaceL = l(frameCreateRgb.getDimensions());
        Matrix matrixViewfinderSpace = vectorSpaceL.viewfinderSpace();
        Rectangle rectangleTimes = vectorSpaceL.getViewfinder().times(matrixViewfinderSpace);
        boolean z10 = false;
        Request.Builder builderObjectIdentifiers = new Request.Builder().frame(frameCreateRgb).viewport(rectangleTimes).referenceObject(vectorSpaceL.getReferenceObject().times(matrixViewfinderSpace)).objectIdentifiers(Arrays.asList(this.layoutInterface.getPossibleDocs().get(0)));
        if (frameCreateRgb.getEncoding() != ImageEncoding.YUV && this.camera.getFacing() == Camera.Facing.FRONT) {
            z10 = true;
        }
        return this.f39399o.request(builderObjectIdentifiers.mirrored(z10).outOfFocusDetectionEnabled(true).detectLightBlobs(this.f39393h).build());
    }

    public BidiCodeManager getBidiCodeManager() {
        return this.bidiCodeManager;
    }

    public ILibraryLogger getLogger() {
        return this.f39395j;
    }

    public final SequentialDetectionResult k(Picture picture, boolean z10, boolean z11) {
        ObjectDetector<SequentialDetectionResult> objectDetector;
        boolean z12 = this.f39390e.get();
        if (this.f39389d) {
            objectDetector = z12 ? this.f39396k : this.m;
        } else {
            objectDetector = this.f39397l;
        }
        this.f39394i = objectDetector;
        Frame frame = picture.toFrame();
        return this.f39394i.request(new Request.Builder().frame(frame).viewport(this.f39401q).referenceObject(this.f39402r).objectIdentifiers(this.layoutInterface.getDocumentType()).detectLightBlobs(z11).rectangleHelp(z10).mirrored(frame.getEncoding() != ImageEncoding.YUV && this.camera.getFacing() == Camera.Facing.FRONT).build());
    }

    public final synchronized VectorSpace l(Dimension dimension) {
        Point correctedDisplaySize = this.fragment.getCorrectedDisplaySize();
        Rectangle rectangleFrom = Rectangle.from(dimension.toPoint().toPoint());
        Rectangle rectangleFrom2 = Rectangle.from(this.fragment.getReferenceRect());
        Rectangle rectangleFrom3 = Rectangle.from(correctedDisplaySize);
        if (this.f39400p == null || !this.f39400p.getFrame().equals(rectangleFrom) || !this.f39400p.getReferenceObject().equals(rectangleFrom2) || !this.f39400p.getViewfinder().equals(rectangleFrom3)) {
            this.f39400p = new VectorSpace.Builder().frame(rectangleFrom).viewfinder(rectangleFrom3).referenceObject(rectangleFrom2).build();
            Matrix matrixViewfinderSpace = this.f39400p.viewfinderSpace();
            this.f39401q = this.f39400p.getViewfinder().times(matrixViewfinderSpace);
            this.f39402r = this.f39400p.getReferenceObject().times(matrixViewfinderSpace);
        }
        return this.f39400p;
    }

    @Override // com.dasnano.vddocumentcapture.managers.CameraManagerBase
    public void onPreviewReady(Camera camera, Picture picture, GenericDocumentState genericDocumentState) {
        SequentialDetectionResult sequentialDetectionResultK;
        this.isPreviewing.set(true);
        if (genericDocumentState.isSearching) {
            SpatialDetectionResult spatialDetectionResultRequest = null;
            if (genericDocumentState == GenericDocumentState.AWAIT_DOCUMENT) {
                Frame frame = picture.toFrame();
                List<String> documentType = this.layoutInterface.getDocumentType();
                VectorSpace vectorSpaceL = l(frame.getDimensions());
                Matrix matrixViewfinderSpace = vectorSpaceL.viewfinderSpace();
                try {
                    spatialDetectionResultRequest = this.f39398n.request(new Request.Builder().frame(frame).viewport(vectorSpaceL.getViewfinder().times(matrixViewfinderSpace)).referenceObject(vectorSpaceL.getReferenceObject().times(matrixViewfinderSpace)).objectIdentifiers(documentType).mirrored(frame.getEncoding() != ImageEncoding.YUV && this.camera.getFacing() == Camera.Facing.FRONT).build());
                } catch (Exception e5) {
                    Log.e("CameraManager", e5);
                }
                if (spatialDetectionResultRequest.getCandidate().isNotEmpty()) {
                    this.layoutInterface.setGenericDocumentState(GenericDocumentState.CALCULATING_FPS);
                    return;
                }
                return;
            }
            if (genericDocumentState == GenericDocumentState.CALCULATING_FPS) {
                boolean z10 = this.f39388c;
                if (genericDocumentState.captureFace == null) {
                    return;
                }
                l(picture.toFrame().getDimensions());
                try {
                    SequentialDetectionResult sequentialDetectionResultK2 = k(picture, z10, false);
                    this.fragment.updateFps(sequentialDetectionResultK2.getFps());
                    if (sequentialDetectionResultK2.getWarmupComplete()) {
                        this.fragment.finishedFpsCalculation();
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    Log.e("CameraManager", e7);
                    return;
                }
            }
            if (genericDocumentState.isSearchingDocument) {
                boolean z11 = this.f39388c;
                boolean z12 = this.f39387b;
                if (genericDocumentState.captureFace == null) {
                    return;
                }
                Matrix matrixInverse = l(picture.toFrame().getDimensions()).viewfinderSpace().inverse();
                try {
                    sequentialDetectionResultK = k(picture, z11, z12);
                } catch (Exception e10) {
                    Log.e("CameraManager", e10);
                    sequentialDetectionResultK = null;
                }
                SpatialDetectionResult spatialDetectionResult = sequentialDetectionResultK.getSpatialDetectionResult();
                Rectangle candidate = spatialDetectionResult.getCandidate();
                boolean zIsNotEmpty = candidate.isNotEmpty();
                if (zIsNotEmpty) {
                    candidate = candidate.times(matrixInverse);
                }
                double fps = sequentialDetectionResultK.getFps();
                int iRound = (int) Math.round(sequentialDetectionResultK.getProgress());
                this.fragment.updateFps(fps);
                this.fragment.documentDetectionProgressPercentage(iRound);
                this.fragment.templateDistance(sequentialDetectionResultK.getProximity());
                if (spatialDetectionResult.getLightBlobDetected()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<Rectangle> it = spatialDetectionResult.getLightBlobs().iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().times(matrixInverse).toRect());
                    }
                    this.fragment.brightDetected(arrayList);
                }
                String objectData = sequentialDetectionResultK.getObjectData();
                if (!objectData.isEmpty()) {
                    this.fragment.documentTypeFound(Arrays.asList(objectData));
                }
                if (sequentialDetectionResultK.getObjectDetected()) {
                    this.fragment.documentDetected(sequentialDetectionResultK.getAnalysisType());
                }
                this.f39392g.compareAndSet(false, true);
                this.f39391f.compareAndSet(false, true);
                boolean f66788c = this.f39394i.getF66788c();
                if (!zIsNotEmpty) {
                    VDLogger.log(Logger.Tag.ON_PREVIEW_FRAME, "Document not detected with progress: %d", Integer.valueOf(iRound));
                    if (f66788c) {
                        this.layoutInterface.setArrowAttributes(null);
                    }
                    this.layoutInterface.drawDocument(null);
                    return;
                }
                VDLogger.log(Logger.Tag.ON_PREVIEW_FRAME, "Document detected with progress: %d", Integer.valueOf(iRound));
                Rect rect = candidate.toRect();
                if (this.configIsFrontFacingCamera) {
                    Point correctedDisplaySize = this.fragment.getCorrectedDisplaySize();
                    int i10 = rect.bottom;
                    int i11 = correctedDisplaySize.x;
                    rect = new Rect(i11 - rect.right, rect.top, i11 - rect.left, i10);
                }
                this.layoutInterface.drawDocument(rect);
                if (f66788c) {
                    this.layoutInterface.setArrowAttributes(rect);
                }
            }
        }
    }

    public void recreateDetectors(DocumentDetectorFactory documentDetectorFactory, Context context) {
        releaseDetectors();
        createDetectors(documentDetectorFactory, context);
    }

    public <T extends ObjectDetector> T releaseDetector(T t10) {
        if (t10 == null) {
            return null;
        }
        t10.finish();
        return null;
    }

    public void releaseDetectors() {
        this.f39396k = releaseDetector(this.f39396k);
        this.f39398n = releaseDetector(this.f39398n);
        this.f39399o = releaseDetector(this.f39399o);
        this.f39397l = releaseDetector(this.f39397l);
        this.m = releaseDetector(this.m);
    }

    public void setBidiCodeManager(BidiCodeManager bidiCodeManager) {
        this.bidiCodeManager = bidiCodeManager;
    }

    public void setLogger(ILibraryLogger iLibraryLogger) {
        this.f39395j = iLibraryLogger;
    }

    @Override // com.dasnano.vddocumentcapture.managers.CameraManagerBase
    public void start(DocumentDetectorFactory documentDetectorFactory, Context context, CameraAction cameraAction) {
        createDetectors(documentDetectorFactory, context);
        super.start(documentDetectorFactory, context, cameraAction);
    }

    @Override // com.dasnano.vddocumentcapture.managers.CameraManagerBase
    public void stop() {
        super.stop();
        releaseDetectors();
    }
}
