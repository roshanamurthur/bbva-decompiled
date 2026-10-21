package com.dasnano.vdvideoselfiecapture.config;

import android.content.res.Resources;
import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.tokencompat.model.StorageTokenBuilder;
import com.dasnano.vdvideoselfiecapture.R;
import com.veridas.config.Configuration;
import com.veridas.config.ConfigurationKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VDVideoSelfieConfiguration.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0014¨\u0006\b"}, d2 = {"Lcom/dasnano/vdvideoselfiecapture/config/VDVideoSelfieConfiguration;", "Lcom/veridas/config/Configuration;", "resources", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources;)V", "initialize", "", "Companion", "video-selfie-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VDVideoSelfieConfiguration extends Configuration {

    @NotNull
    public static final String ALERT_STYLE = "alertstyle";

    @NotNull
    public static final String AUTHENTICATION = "authentication";

    @NotNull
    public static final String BOTTOM = "bottom";

    @NotNull
    public static final String CAPTURED_BACKGROUND_ALPHA = "capturedbackgroundalpha";

    @NotNull
    public static final String CAPTURED_LABEL_ICON = "capturedlabelicon";

    @NotNull
    public static final String CAPTURED_LABEL_POSITION = "capturedlabelposition";

    @NotNull
    public static final String CAPTURED_LABEL_TEXT = "capturedlabeltext";

    @NotNull
    public static final String CENTER = "center";

    @NotNull
    public static final String CLOSE_BUTTON = "closebutton";

    @NotNull
    public static final String CLOSE_BUTTON_IMAGE = "closebuttonimage";

    @NotNull
    public static final String DOCUMENT_CENTER = "documentcenter";

    @NotNull
    public static final String DOCUMENT_LABEL_TEXT_BACKGROUND_COLOR = "documentlabeltextbackgroundcolor";

    @NotNull
    public static final String DOCUMENT_MOBILE_OVAL = "documentmobileoval";

    @NotNull
    public static final String DOCUMENT_MOBILE_OVAL_COLOR = "documentmobileovalcolor";

    @NotNull
    public static final String DOCUMENT_OBVERSE_LABEL_TEXT = "documentobverselabeltext";

    @NotNull
    public static final String DOCUMENT_REVERSE_LABEL_TEXT = "documentreverselabeltext";

    @NotNull
    public static final String EMPTY_STRING = "";

    @NotNull
    public static final String FACE_MOBILE_OVAL = "facemobileoval";

    @NotNull
    public static final String FACE_MOBILE_OVAL_COLOR = "facemobileovalcolor";

    @NotNull
    public static final String FACE_NOT_FOUND_ERROR = "facenotfounderror";

    @NotNull
    public static final String FACE_NOT_FOUND_ERROR_TITLE = "facenotfounderrortitle";

    @NotNull
    public static final String FACE_SHAPE_OVAL = "faceshapeoval";

    @NotNull
    public static final String FINAL_ERROR = "finalerror";

    @NotNull
    public static final String FINAL_ERROR_TITLE = "finalerrortitle";

    @NotNull
    public static final String FIXED_OVAL = "fixedoval";

    @NotNull
    public static final String FIXED_RECTANGLE = "fixedrectangle";

    @NotNull
    public static final String FIXED_RECTANGLE_POSITION = "fixedrectangleposition";

    @NotNull
    public static final String HIGH = "high";

    @NotNull
    public static final String IMAGE_QUALITY = "imagequality";

    @NotNull
    public static final String INFO_ALERT = "infoalert";

    @NotNull
    public static final String INFO_ALERT_AUTHENTICATE_MODE = "infoalertauthenticatemode";

    @NotNull
    public static final String INFO_ALERT_PASS = "infoalertpass";

    @NotNull
    public static final String INFO_ALERT_SHOW = "infoalertshow";

    @NotNull
    public static final String INFO_ALERT_TITLE = "infoalerttitle";

    @NotNull
    public static final String INFO_ALERT_TITLE_AUTHENTICATE_MODE = "infoalerttitleauthenticatemode";

    @NotNull
    public static final String INFO_ALERT_TITLE_PASS = "infoalerttitlepass";

    @NotNull
    public static final String LANDSCAPE = "LANDSCAPE";

    @NotNull
    public static final String LIFE_TYPE = "lifetype";

    @NotNull
    public static final String LOGGER_FACTORY_CLASS = "loggerfactoryclass";

    @NotNull
    public static final String LOW = "low";

    @NotNull
    public static final String MAX = "max";

    @NotNull
    public static final String MEDIUM = "medium";

    @NotNull
    public static final String META_DATA_DATE = "metadatadate";

    @NotNull
    public static final String META_DATA_TOKEN = "metadatatoken";

    @NotNull
    public static final String MOBILE_OVAL = "mobileoval";

    @NotNull
    public static final String NO = "NO";

    @NotNull
    public static final String NULL = "NULL";

    @NotNull
    public static final String OBVERSE_NOT_FOUND_ERROR = "obversenotfounderror";

    @NotNull
    public static final String OBVERSE_NOT_FOUND_ERROR_TITLE = "obversenotfounderrortitle";

    @NotNull
    public static final String ONBOARDING = "onboarding";

    @NotNull
    public static final String PERMISSION_REFUSED = "permissionrefused";

    @NotNull
    public static final String PERMISSION_REFUSED_TITLE = "permissionrefusedtitle";

    @NotNull
    public static final String PORTRAIT = "PORTRAIT";

    @NotNull
    public static final String POSITIVE_BUTTON_TITLE = "positivebuttontitle";

    @NotNull
    public static final String REVERSE_DETECTION = "reversedetection";

    @NotNull
    public static final String REVERSE_NOT_FOUND_ERROR = "reversenotfounderror";

    @NotNull
    public static final String REVERSE_NOT_FOUND_ERROR_TITLE = "reversenotfounderrortitle";

    @NotNull
    public static final String SCREEN_ORIENTATION = "screenorientation";

    @NotNull
    public static final String SECONDS_OBVERSE_NOTFOUND_ERROR = "secondsobversenotfounderror";

    @NotNull
    public static final String SECONDS_REVERSE_NOTFOUND_ERROR = "secondsreversenotfounderror";

    @NotNull
    public static final String SECONDS_SHOWING_FACE = "secondsshowingface";

    @NotNull
    public static final String SECONDS_SHOWING_OBVERSE = "secondsshowingobverse";

    @NotNull
    public static final String SECONDS_SHOWING_REVERSE = "secondsshowingreverse";

    @NotNull
    public static final String SECONDS_VIDEO_TIMEOUT = "secondsvideotimeout";

    @NotNull
    public static final String SECONDS_VIDEO_TIMEOUT_ONLYOBVERSE = "secondsvideotimeoutonlyobverse";

    @NotNull
    public static final String SHOW_TUTORIAL = "showtutorial";

    @NotNull
    public static final String TICK_CIRCLE_COLOR = "tickcirclecolor";

    @NotNull
    public static final String TICK_COLOR = "tickcolor";

    @NotNull
    public static final String TOKEN = "token";

    @NotNull
    public static final String TOP = "top";

    @NotNull
    public static final String TUTORIAL_ALTERNATIVE_PATH = "tutorialalternativepath";

    @NotNull
    public static final String TUTORIAL_BACKGROUND_COLOR = "tutorialbackgroundcolor";

    @NotNull
    public static final String TUTORIAL_CONTINUE_BUTTON_COLOR = "tutorialcontinuebuttoncolor";

    @NotNull
    public static final String TUTORIAL_CONTINUE_BUTTON_TEXT = "tutorialcontinuebuttontext";

    @NotNull
    public static final String TUTORIAL_CONTINUE_BUTTON_TEXT_COLOR = "tutorialcontinuebuttontextcolor";

    @NotNull
    public static final String TUTORIAL_GIF_PATH = "tutorialgifpath";

    @NotNull
    public static final String TUTORIAL_PASSPORT_TEXT = "tutorialpassporttext";

    @NotNull
    public static final String TUTORIAL_TEXT = "tutorialtext";

    @NotNull
    public static final String TUTORIAL_TEXT_COLOR = "tutorialtextcolor";

    @NotNull
    public static final String TUTORIAL_TITLE = "tutorialtitle";

    @NotNull
    public static final String TUTORIAL_TITLE_COLOR = "tutorialtitlecolor";

    @NotNull
    public static final String UNDEFINED = "undefined";

    @NotNull
    public static final String VIDEO_FLASHING_COLOR = "videoflashingcolor";

    @NotNull
    public static final String VIDEO_INFORMATIVE_LABEL = "videoinformativelabel";

    @NotNull
    public static final String VIDEO_INFORMATIVE_LABEL_BACKGROUND_COLOR = "videoinformativelabelbackgroundcolor";

    @NotNull
    public static final String VIDEO_INFORMATIVE_LABEL_BORDER_COLOR = "videoinformativelabelbordercolor";

    @NotNull
    public static final String VIDEO_INFORMATIVE_LABEL_OBVERSE_BACKGROUND_COLOR = "videoinformativelabelobversebackgroundcolor";

    @NotNull
    public static final String VIDEO_INFORMATIVE_LABEL_POSITION = "videoinformativelabelposition";

    @NotNull
    public static final String VIDEO_INFORMATIVE_LABEL_REVERSE_BACKGROUND_COLOR = "videoinformativelabelreversebackgroundcolor";

    @NotNull
    public static final String VIDEO_INFORMATIVE_TEXT1 = "videoinformativetext1";

    @NotNull
    public static final String VIDEO_INFORMATIVE_TEXT2 = "videoinformativetext2";

    @NotNull
    public static final String VIDEO_INFORMATIVE_TEXT2_PASS = "videoinformativetext2pass";

    @NotNull
    public static final String VIDEO_INFORMATIVE_TEXT3 = "videoinformativetext3";

    @NotNull
    public static final String WHITE = "white";

    @NotNull
    public static final String YES = "YES";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VDVideoSelfieConfiguration(@NotNull Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.veridas.config.Configuration
    public void initialize(@NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        setProtectedProperties(CollectionsKt__CollectionsKt.mutableListOf(IMAGE_QUALITY, "screenorientation"));
        setDefaultBooleanProperty("closebutton", "NO");
        setDefaultBooleanProperty(DOCUMENT_MOBILE_OVAL, "YES");
        setDefaultBooleanProperty(FACE_MOBILE_OVAL, "YES");
        setDefaultBooleanProperty("faceshapeoval", "YES");
        setDefaultBooleanProperty("fixedoval", "YES");
        setDefaultBooleanProperty("fixedrectangle", "YES");
        setDefaultBooleanProperty("infoalertshow", "NO");
        setDefaultBooleanProperty(META_DATA_DATE, "YES");
        setDefaultBooleanProperty(META_DATA_TOKEN, "YES");
        setDefaultBooleanProperty(REVERSE_DETECTION, "YES");
        setDefaultBooleanProperty("showtutorial", "NO");
        setDefaultBooleanProperty(VIDEO_INFORMATIVE_LABEL, "YES");
        setDefaultColorProperty(DOCUMENT_LABEL_TEXT_BACKGROUND_COLOR, "#AA000000");
        setDefaultColorProperty(DOCUMENT_MOBILE_OVAL_COLOR, "#00CC00");
        setDefaultColorProperty(FACE_MOBILE_OVAL_COLOR, "#00CC00");
        setDefaultColorProperty("tickcirclecolor", "#FF48AE64");
        setDefaultColorProperty("tickcolor", "#FFFFFFFF");
        setDefaultColorProperty("tutorialbackgroundcolor", "#424242");
        setDefaultColorProperty("tutorialcontinuebuttoncolor", "#116466");
        setDefaultColorProperty("tutorialcontinuebuttontextcolor", "#ffffff");
        setDefaultColorProperty("tutorialtextcolor", "#ffffff");
        setDefaultColorProperty("tutorialtitlecolor", "#ffffff");
        setDefaultColorProperty(VIDEO_FLASHING_COLOR, "#3FFF7F");
        setDefaultColorProperty(VIDEO_INFORMATIVE_LABEL_BACKGROUND_COLOR, "#AA000000");
        setDefaultColorProperty(VIDEO_INFORMATIVE_LABEL_BORDER_COLOR, ConfigurationKt.COLOR_TRANSPARENT);
        setDefaultColorProperty(VIDEO_INFORMATIVE_LABEL_OBVERSE_BACKGROUND_COLOR, "#AA000000");
        setDefaultColorProperty(VIDEO_INFORMATIVE_LABEL_REVERSE_BACKGROUND_COLOR, "#AA000000");
        setDefaultFloatProperty(CAPTURED_BACKGROUND_ALPHA, "0.85");
        setDefaultIntegerProperty(SECONDS_OBVERSE_NOTFOUND_ERROR, StorageTokenBuilder.OTP_LENGTH);
        setDefaultIntegerProperty(SECONDS_REVERSE_NOTFOUND_ERROR, "12");
        setDefaultIntegerProperty(SECONDS_SHOWING_FACE, "7");
        setDefaultIntegerProperty(SECONDS_SHOWING_OBVERSE, StorageTokenBuilder.OTP_LENGTH);
        setDefaultIntegerProperty(SECONDS_SHOWING_REVERSE, StorageTokenBuilder.OTP_LENGTH);
        setDefaultIntegerProperty(SECONDS_VIDEO_TIMEOUT_ONLYOBVERSE, "17");
        setDefaultIntegerProperty(SECONDS_VIDEO_TIMEOUT, "41");
        setDefaultStringProperty("alertstyle", "black");
        setDefaultStringProperty(CAPTURED_LABEL_ICON, "undefined");
        setDefaultStringProperty(CAPTURED_LABEL_POSITION, "bottom");
        setDefaultStringProperty(CAPTURED_LABEL_TEXT, resources.getString(R.string.vd_video_captured));
        setDefaultStringProperty("closebuttonimage", "undefined");
        setDefaultStringProperty(DOCUMENT_OBVERSE_LABEL_TEXT, resources.getString(R.string.vd_video_document_obverse_label_text));
        setDefaultStringProperty(DOCUMENT_REVERSE_LABEL_TEXT, resources.getString(R.string.vd_video_document_reverse_label_text));
        setDefaultStringProperty(FACE_NOT_FOUND_ERROR_TITLE, resources.getString(R.string.vd_video_face_not_found_error_title));
        setDefaultStringProperty(FACE_NOT_FOUND_ERROR, resources.getString(R.string.vd_video_camera_face_lost));
        setDefaultStringProperty(FINAL_ERROR_TITLE, resources.getString(R.string.vd_video_final_error_title));
        setDefaultStringProperty(FINAL_ERROR, resources.getString(R.string.vd_video_final_error));
        setDefaultStringProperty(FIXED_RECTANGLE_POSITION, "top");
        setDefaultStringProperty(IMAGE_QUALITY, "medium");
        setDefaultStringProperty(INFO_ALERT_AUTHENTICATE_MODE, resources.getString(R.string.vd_video_info_alert_authenticate_mode));
        setDefaultStringProperty("infoalertpass", resources.getString(R.string.vd_video_life_proof_message_body_passport));
        setDefaultStringProperty(INFO_ALERT_TITLE_AUTHENTICATE_MODE, resources.getString(R.string.vd_video_info_alert_title_authenticate_mode));
        setDefaultStringProperty("infoalerttitlepass", resources.getString(R.string.vd_video_info_alert_title_pass));
        setDefaultStringProperty("infoalerttitle", resources.getString(R.string.vd_video_info_alert_title));
        setDefaultStringProperty("infoalert", resources.getString(R.string.vd_video_life_proof_message_body));
        setDefaultStringProperty(LIFE_TYPE, ONBOARDING);
        setDefaultStringProperty("loggerfactoryclass", "");
        setDefaultStringProperty(OBVERSE_NOT_FOUND_ERROR_TITLE, "");
        setDefaultStringProperty(OBVERSE_NOT_FOUND_ERROR, resources.getString(R.string.vd_video_show_document_front));
        setDefaultStringProperty("permissionrefusedtitle", resources.getString(R.string.vd_video_permission_required));
        setDefaultStringProperty("permissionrefused", resources.getString(R.string.vd_video_permission_refused));
        setDefaultStringProperty(POSITIVE_BUTTON_TITLE, resources.getString(R.string.vd_video_continue_text));
        setDefaultStringProperty(REVERSE_NOT_FOUND_ERROR_TITLE, "");
        setDefaultStringProperty(REVERSE_NOT_FOUND_ERROR, resources.getString(R.string.vd_video_show_document_back));
        setDefaultStringProperty("token", "");
        setDefaultStringProperty("tutorialalternativepath", "");
        setDefaultStringProperty("tutorialcontinuebuttontext", resources.getString(R.string.vd_video_like));
        setDefaultStringProperty("tutorialgifpath", "");
        setDefaultStringProperty(TUTORIAL_PASSPORT_TEXT, resources.getString(R.string.vd_video_tutorial_text_passport));
        setDefaultStringProperty("tutorialtext", resources.getString(R.string.vd_video_tutorial_text));
        setDefaultStringProperty("tutorialtitle", resources.getString(R.string.vd_video_tutorial_title));
        setDefaultStringProperty(VIDEO_INFORMATIVE_LABEL_POSITION, "top");
        setDefaultStringProperty(VIDEO_INFORMATIVE_TEXT1, resources.getString(R.string.vd_video_informative_text_1));
        setDefaultStringProperty(VIDEO_INFORMATIVE_TEXT2_PASS, resources.getString(R.string.vd_video_informative_text_2_pass));
        setDefaultStringProperty(VIDEO_INFORMATIVE_TEXT2, resources.getString(R.string.vd_video_informative_text_2));
        setDefaultStringProperty(VIDEO_INFORMATIVE_TEXT3, resources.getString(R.string.vd_video_informative_text_3));
        setDefaultDisplayOrientationProperty("screenorientation", PORTRAIT);
    }
}
