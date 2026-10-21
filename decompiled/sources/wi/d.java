package wi;

import com.veridas.camera.AbstractCameraQuery;
import com.veridas.camera.Camera;
import com.veridas.camera.CameraException;
import com.veridas.camera.CameraNotFoundException;
import com.veridas.camera.one.CameraOneCamera;
import com.veridas.log.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: CameraOneCameraQuery.java */
/* JADX INFO: loaded from: classes9.dex */
public final class d extends AbstractCameraQuery<CameraOneCamera> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f94267b = Arrays.asList("edof", "infinity", "fixed");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f94268a;

    public d(b bVar) {
        this.f94268a = bVar;
    }

    @Override // com.veridas.camera.CameraQuery
    public final Camera execute() throws CameraException {
        int iIntValue;
        Boolean bool = this.preferAutoFocus;
        if (bool == null || !bool.booleanValue()) {
            String str = Camera.LOG_TAG;
            Log.i(str, "Searching by facing.");
            int numberOfCameras = android.hardware.Camera.getNumberOfCameras();
            int i10 = this.facing == Camera.Facing.FRONT ? 1 : 0;
            Log.i(str, "Found %d cameras to search through.", Integer.valueOf(numberOfCameras));
            iIntValue = 0;
            while (true) {
                if (iIntValue >= numberOfCameras) {
                    iIntValue = -1;
                    break;
                }
                android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
                android.hardware.Camera.getCameraInfo(iIntValue, cameraInfo);
                if (cameraInfo.facing == i10) {
                    break;
                }
                iIntValue++;
            }
        } else {
            String str2 = Camera.LOG_TAG;
            Log.i(str2, "Searching by facing and autofocus preferred.");
            boolean z10 = this.preferAutoFocus.booleanValue();
            int i11 = this.facing == Camera.Facing.FRONT ? 1 : 0;
            int numberOfCameras2 = android.hardware.Camera.getNumberOfCameras();
            ArrayList arrayList = new ArrayList();
            Log.i(str2, "Found %d cameras to search through.", Integer.valueOf(numberOfCameras2));
            for (int i12 = 0; i12 < numberOfCameras2; i12++) {
                android.hardware.Camera.CameraInfo cameraInfo2 = new android.hardware.Camera.CameraInfo();
                android.hardware.Camera.getCameraInfo(i12, cameraInfo2);
                if (cameraInfo2.facing == i11) {
                    arrayList.add(Integer.valueOf(i12));
                }
            }
            Iterator it = arrayList.iterator();
            ArrayList arrayList2 = new ArrayList();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                android.hardware.Camera cameraOpen = android.hardware.Camera.open(iIntValue2);
                try {
                    cameraOpen.reconnect();
                } catch (IOException e5) {
                    Log.e(Camera.LOG_TAG, e5);
                }
                Iterator<String> it2 = cameraOpen.getParameters().getSupportedFocusModes().iterator();
                while (it2.hasNext()) {
                    if (!f94267b.contains(it2.next())) {
                        arrayList2.add(Integer.valueOf(iIntValue2));
                        break;
                    }
                }
                cameraOpen.release();
            }
            if (!arrayList2.isEmpty() && z10) {
                iIntValue = ((Integer) arrayList2.get(0)).intValue();
            } else {
                if (arrayList.isEmpty()) {
                    iIntValue = -1;
                    break;
                }
                iIntValue = ((Integer) arrayList.get(0)).intValue();
            }
        }
        if (iIntValue == -1) {
            throw new CameraNotFoundException();
        }
        Log.i(Camera.LOG_TAG, "Selected camera id %d.", Integer.valueOf(iIntValue));
        b bVar = this.f94268a;
        bVar.f94263a = iIntValue;
        return bVar.create();
    }
}
