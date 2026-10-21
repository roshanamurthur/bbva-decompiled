package com.dasnano.vdphotoselfiecapture.other.util;

import android.graphics.PointF;
import android.os.Environment;
import androidx.camera.camera2.internal.compat.u;
import com.dasnano.vdphotoselfiecapture.api.model.Action;
import com.dasnano.vdphotoselfiecapture.api.model.Token;
import com.dasnano.vdphotoselfiecapture.model.VDPhotoSelfieViewModel;
import com.dasnano.vdphotoselfiecapture.other.FaceOrientation;
import com.dasnano.vdphotoselfiecapture.other.WebVTTBuilder;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceLandmark;
import com.veridas.log.Log;
import com.veridas.util.Util;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/* JADX INFO: loaded from: classes9.dex */
public class Utils {
    public static void a(String str, String str2) {
        if (str != null) {
            try {
                writeToFile(str2, Util.fileToByteArray(new File(str)));
            } catch (IOException e5) {
                Log.e("Utils", e5);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    public static int computePercentage(float f6, float f10, Action.ActionStatus actionStatus, FaceOrientation.FaceOrientationState faceOrientationState) {
        float fMax;
        float f11 = -13.0f;
        float f12 = 0.0f;
        if (actionStatus == Action.ActionStatus.REACHING_POSITION) {
            if (faceOrientationState == FaceOrientation.FaceOrientationState.CENTER_LEFT) {
                fMax = Math.max(f10, 0.0f);
                f11 = 0.0f;
                f12 = 25.0f;
            } else if (faceOrientationState == FaceOrientation.FaceOrientationState.CENTER_RIGHT) {
                fMax = Math.min(f10, 0.0f);
                f11 = 0.0f;
                f12 = -25.0f;
            } else if (faceOrientationState == FaceOrientation.FaceOrientationState.TOP_CENTER) {
                fMax = Math.max(f6, 0.0f);
                f11 = 0.0f;
                f12 = 13.0f;
            } else if (faceOrientationState == FaceOrientation.FaceOrientationState.BOTTOM_CENTER) {
                fMax = Math.min(f6, 0.0f);
                f12 = -13.0f;
                f11 = 0.0f;
            } else {
                fMax = 0.0f;
                f11 = 0.0f;
            }
        } else if (actionStatus == Action.ActionStatus.RETURNING_TO_CENTER_HORIZONTAL_LEFT) {
            fMax = Math.min(f10, 25.0f);
            f12 = 15.000001f;
            f11 = 25.0f;
        } else if (actionStatus == Action.ActionStatus.RETURNING_TO_CENTER_HORIZONTAL_RIGHT) {
            fMax = Math.max(f10, -25.0f);
            f12 = -15.000001f;
            f11 = -25.0f;
        } else if (actionStatus == Action.ActionStatus.RETURNING_TO_CENTER_VERTICAL_TOP) {
            fMax = Math.min(f6, 13.0f);
            f12 = 7.8f;
            f11 = 13.0f;
        } else if (actionStatus == Action.ActionStatus.RETURNING_TO_CENTER_VERTICAL_BOTTOM) {
            f12 = -7.8f;
            fMax = Math.max(f6, -13.0f);
        } else {
            fMax = 0.0f;
            f11 = 0.0f;
        }
        return (int) Math.abs(((fMax - f11) / (f12 - f11)) * 100.0f);
    }

    public static FaceOrientation.FaceOrientationState correctionDeadZoneToCenter(float f6, float f10, FaceOrientation.FaceOrientationState faceOrientationState, Action.ActionStatus actionStatus) {
        if (faceOrientationState == FaceOrientation.FaceOrientationState.DEAD_ZONE) {
            if ((actionStatus == Action.ActionStatus.RETURNING_TO_CENTER_HORIZONTAL_LEFT || actionStatus == Action.ActionStatus.RETURNING_TO_CENTER_HORIZONTAL_RIGHT) && f10 > -15.000001f && f10 < 15.000001f) {
                return FaceOrientation.FaceOrientationState.CENTER_CENTER;
            }
            if ((actionStatus == Action.ActionStatus.RETURNING_TO_CENTER_VERTICAL_BOTTOM || actionStatus == Action.ActionStatus.RETURNING_TO_CENTER_VERTICAL_TOP) && f6 > -7.8f && f6 < 7.8f) {
                return FaceOrientation.FaceOrientationState.CENTER_CENTER;
            }
        }
        return faceOrientationState;
    }

    public static double getCurrentEyesNoseDistance(Face face) {
        FaceLandmark faceLandmark = null;
        FaceLandmark faceLandmark2 = null;
        FaceLandmark faceLandmark3 = null;
        for (FaceLandmark faceLandmark4 : face.getAllLandmarks()) {
            int landmarkType = faceLandmark4.getLandmarkType();
            if (landmarkType == 4) {
                faceLandmark = faceLandmark4;
            } else if (landmarkType == 6) {
                faceLandmark3 = faceLandmark4;
            } else if (landmarkType == 10) {
                faceLandmark2 = faceLandmark4;
            }
        }
        if (faceLandmark == null || faceLandmark2 == null || faceLandmark3 == null) {
            return 0.0d;
        }
        PointF position = faceLandmark.getPosition();
        PointF position2 = faceLandmark2.getPosition();
        PointF position3 = faceLandmark3.getPosition();
        PointF pointF = new PointF((position.x + position2.x) / 2.0f, (position.y + position2.y) / 2.0f);
        return Math.sqrt(Math.pow(pointF.y - position3.y, 2.0d) + Math.pow(pointF.x - position3.x, 2.0d)) / ((double) face.getBoundingBox().height());
    }

    public static FaceOrientation getCurrentFrameFaceOrientation(Face face, Action.ActionStatus actionStatus, FaceOrientation.FaceOrientationState faceOrientationState) {
        float headEulerAngleX = face.getHeadEulerAngleX();
        float headEulerAngleY = face.getHeadEulerAngleY();
        return new FaceOrientation(getCurrentPosition(headEulerAngleX, headEulerAngleY), computePercentage(headEulerAngleX, headEulerAngleY, actionStatus, faceOrientationState));
    }

    public static double getCurrentNoseMouthDistance(Face face) {
        FaceLandmark faceLandmark = null;
        FaceLandmark faceLandmark2 = null;
        for (FaceLandmark faceLandmark3 : face.getAllLandmarks()) {
            int landmarkType = faceLandmark3.getLandmarkType();
            if (landmarkType == 0) {
                faceLandmark = faceLandmark3;
            } else if (landmarkType == 6) {
                faceLandmark2 = faceLandmark3;
            }
        }
        if (faceLandmark == null || faceLandmark2 == null) {
            return 0.0d;
        }
        PointF position = faceLandmark.getPosition();
        PointF position2 = faceLandmark2.getPosition();
        return Math.sqrt(Math.pow(position.y - position2.y, 2.0d) + Math.pow(position.x - position2.x, 2.0d)) / ((double) face.getBoundingBox().height());
    }

    public static FaceOrientation.FaceOrientationState getCurrentPosition(float f6, float f10) {
        if (f10 > 25.0f) {
            return FaceOrientation.FaceOrientationState.CENTER_LEFT;
        }
        if (f10 > 15.000001f) {
            return FaceOrientation.FaceOrientationState.DEAD_ZONE;
        }
        if (f10 < -25.0f) {
            return FaceOrientation.FaceOrientationState.CENTER_RIGHT;
        }
        if (f10 < -15.000001f) {
            return FaceOrientation.FaceOrientationState.DEAD_ZONE;
        }
        if (f6 > 13.0f) {
            return FaceOrientation.FaceOrientationState.TOP_CENTER;
        }
        if (f6 > 7.8f) {
            return FaceOrientation.FaceOrientationState.DEAD_ZONE;
        }
        if (f6 < -13.0f) {
            return FaceOrientation.FaceOrientationState.BOTTOM_CENTER;
        }
        return f6 < -7.8f ? FaceOrientation.FaceOrientationState.DEAD_ZONE : FaceOrientation.FaceOrientationState.CENTER_CENTER;
    }

    public static void saveData(VDPhotoSelfieViewModel vDPhotoSelfieViewModel, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
        sb2.append("/veridas_debug/");
        sb2.append(new Date().getTime());
        sb2.append(z10 ? "_ok/" : "_ko/");
        File file = new File(sb2.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        String absolutePath = file.getAbsolutePath();
        Token challengeToken = vDPhotoSelfieViewModel.getChallengeToken();
        String strF = u.f(absolutePath, "/webvtt.vtt");
        if (challengeToken != null) {
            try {
                writeToFile(strF, WebVTTBuilder.buildWebVTTString(challengeToken));
            } catch (IOException e5) {
                Log.e("Utils", e5);
            }
        }
        String challengeJWSToken = vDPhotoSelfieViewModel.getChallengeJWSToken();
        String strF2 = u.f(absolutePath, "/challenge_token.txt");
        if (challengeJWSToken != null && !challengeJWSToken.isEmpty()) {
            try {
                writeToFile(strF2, challengeJWSToken);
            } catch (IOException e7) {
                Log.e("Utils", e7);
            }
        }
        a(vDPhotoSelfieViewModel.getFullImagePath(), absolutePath + "/image.jpg");
        a(vDPhotoSelfieViewModel.getFrameImagePath(), absolutePath + "/frame.jpg");
        a(vDPhotoSelfieViewModel.getChallengeVideoPath(), absolutePath + "/challenge_video.mp4");
    }

    public static void writeToFile(File file, byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        Log.i("VDPhotoSelfieCapture", "Writing to %s", file.getAbsolutePath());
        file.createNewFile();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        Util.copyTo(byteArrayInputStream, fileOutputStream);
        fileOutputStream.close();
        byteArrayInputStream.close();
    }

    public static void writeToFile(File file, String str) throws IOException {
        if (str.isEmpty()) {
            return;
        }
        Log.i("VDPhotoSelfieCapture", "Writing to %s", file.getAbsolutePath());
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(str);
        fileWriter.flush();
        fileWriter.close();
    }

    public static void writeToFile(String str, byte[] bArr) throws IOException {
        writeToFile(new File(str), bArr);
    }

    public static void writeToFile(String str, String str2) throws IOException {
        writeToFile(new File(str), str2);
    }
}
