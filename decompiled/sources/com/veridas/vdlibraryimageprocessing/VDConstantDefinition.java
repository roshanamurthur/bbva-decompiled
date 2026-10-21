package com.veridas.vdlibraryimageprocessing;

import androidx.annotation.Keep;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public class VDConstantDefinition {

    @Keep
    public static final String ERROR_DOCUMENT = "Document_Error";

    @Keep
    public static final String PASSPORT = "XX_Passport_YYYY";

    @Keep
    public enum AnalysisType {
        NONE,
        OBVERSE_WITHOUT_FLASH,
        OBVERSE_WITH_FLASH,
        REVERSE_WITHOUT_FLASH,
        REVERSE_WITH_FLASH,
        PASSPORT_WITHOUT_FLASH,
        SELFIE,
        VIDEO,
        RECTANGLE_BOX_OBVERSE,
        RECTANGLE_BOX_REVERSE
    }

    @Keep
    public enum CameraType {
        FRONT_CAMERA,
        BACK_CAMERA
    }

    @Keep
    public enum DetectionMode {
        XML,
        PASSPORT,
        TEMPLATE,
        RECTANGLE,
        NONE
    }

    @Keep
    public enum DisplayOrientation {
        LANDSCAPE,
        PORTRAIT
    }

    @Keep
    public enum ErrorCodes {
        SERVER_UPLOAD_FAILURE,
        SERVER_GET_FAILURE,
        SIGN_IN_ERROR,
        LOG_IN_ERROR,
        ANALYZE_DOCUMENT_ERROR,
        ANALYZE_SELFIE_ERROR,
        ANALYZE_VIDEO_ERROR,
        COUNTRY_DOCUMENTS_ERROR,
        DATA_ERROR,
        CONFIRM_ERROR,
        SCORES_ERROR,
        VALIDATION_ERROR,
        UNKNOWN_ERROR
    }

    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface PublicApi {
    }

    @Keep
    public enum TemplateProximity {
        NONE,
        ERROR,
        NOT_FOUND,
        EXTREMELY_FAR,
        FAR,
        MIDDLE_DISTANCE,
        CLOSE,
        VERY_CLOSE,
        EXTREMELY_CLOSE,
        CENTERED,
        NOT_CENTERED
    }

    @Keep
    public enum ValiDasDetectorType {
        OBVERSE,
        REVERSE,
        FACE,
        NON_INTELLIGENT,
        RECTANGLE,
        PASSPORT
    }
}
