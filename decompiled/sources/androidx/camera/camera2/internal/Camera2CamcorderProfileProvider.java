package androidx.camera.camera2.internal;

import android.media.CamcorderProfile;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.CameraQuirks;
import androidx.camera.camera2.internal.compat.workaround.CamcorderProfileResolutionValidator;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CamcorderProfileProvider;
import androidx.camera.core.impl.CamcorderProfileProxy;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class Camera2CamcorderProfileProvider implements CamcorderProfileProvider {
    private static final String TAG = "Camera2CamcorderProfileProvider";
    private final CamcorderProfileResolutionValidator mCamcorderProfileResolutionValidator;
    private final int mCameraId;
    private final boolean mHasValidCameraId;

    public Camera2CamcorderProfileProvider(@NonNull String str, @NonNull CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        boolean z10;
        int i10;
        try {
            i10 = Integer.parseInt(str);
            z10 = true;
        } catch (NumberFormatException unused) {
            Logger.w(TAG, "Camera id is not an integer: " + str + ", unable to create CamcorderProfileProvider");
            z10 = false;
            i10 = -1;
        }
        this.mHasValidCameraId = z10;
        this.mCameraId = i10;
        this.mCamcorderProfileResolutionValidator = new CamcorderProfileResolutionValidator((CamcorderProfileResolutionQuirk) CameraQuirks.get(str, cameraCharacteristicsCompat).get(CamcorderProfileResolutionQuirk.class));
    }

    @Nullable
    private CamcorderProfileProxy getProfileInternal(int i10) {
        CamcorderProfile camcorderProfile;
        try {
            camcorderProfile = CamcorderProfile.get(this.mCameraId, i10);
        } catch (RuntimeException e5) {
            Logger.w(TAG, "Unable to get CamcorderProfile by quality: " + i10, e5);
            camcorderProfile = null;
        }
        if (camcorderProfile != null) {
            return CamcorderProfileProxy.fromCamcorderProfile(camcorderProfile);
        }
        return null;
    }

    @Override // androidx.camera.core.impl.CamcorderProfileProvider
    @Nullable
    public CamcorderProfileProxy get(int i10) {
        if (!this.mHasValidCameraId || !CamcorderProfile.hasProfile(this.mCameraId, i10)) {
            return null;
        }
        CamcorderProfileProxy profileInternal = getProfileInternal(i10);
        if (this.mCamcorderProfileResolutionValidator.hasValidVideoResolution(profileInternal)) {
            return profileInternal;
        }
        return null;
    }

    @Override // androidx.camera.core.impl.CamcorderProfileProvider
    public boolean hasProfile(int i10) {
        if (!this.mHasValidCameraId || !CamcorderProfile.hasProfile(this.mCameraId, i10)) {
            return false;
        }
        if (!this.mCamcorderProfileResolutionValidator.hasQuirk()) {
            return true;
        }
        return this.mCamcorderProfileResolutionValidator.hasValidVideoResolution(getProfileInternal(i10));
    }
}
