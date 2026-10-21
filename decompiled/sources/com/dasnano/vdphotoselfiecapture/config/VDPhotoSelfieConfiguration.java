package com.dasnano.vdphotoselfiecapture.config;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.tokencompat.model.StorageTokenBuilder;
import com.dasnano.vdphotoselfiecapture.R;
import com.veridas.config.Configuration;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VDPhotoSelfieConfiguration.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0014J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\b¨\u0006\f"}, d2 = {"Lcom/dasnano/vdphotoselfiecapture/config/VDPhotoSelfieConfiguration;", "Lcom/veridas/config/Configuration;", "resources", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources;)V", "initialize", "", "isSelfieAlive", "", "isSelfieAlivePro", "mustSaveToLocal", "Companion", "photo-selfie-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class VDPhotoSelfieConfiguration extends Configuration {

    @NotNull
    public static final String ALERT_STYLE = "alertstyle";

    @NotNull
    public static final String ALLOW_CHALLENGE_RETRY = "allowchallengeretry";

    @NotNull
    public static final String BACK = "back";

    @NotNull
    public static final String BACKGROUND_COLOR = "backgroundcolor";

    @NotNull
    public static final String BOTTOM = "bottom";

    @NotNull
    public static final String BRING_CLOSER_FACE_TEXT = "bringcloserfacetext";

    @NotNull
    public static final String CENTER = "center";

    @NotNull
    public static final String CENTER_FACE_TEXT = "centerfacetext";

    @NotNull
    public static final String CHECK_SELFIE_BACKGROUND_COLOR = "checkselfiebackgroundcolor";

    @NotNull
    public static final String CHECK_SELFIE_TEXT = "checkselfietext";

    @NotNull
    public static final String CHECK_SELFIE_TEXT_COLOR = "checkselfietextcolor";

    @NotNull
    public static final String CLOSE_BUTTON = "closebutton";

    @NotNull
    public static final String CLOSE_BUTTON_IMAGE = "closebuttonimage";

    @NotNull
    public static final String COLOR_WHITE = "white";

    @NotNull
    public static final String CONTINUE_BUTTON_BACKGROUND_COLOR = "continuebuttonbackgroundcolor";

    @NotNull
    public static final String CONTINUE_BUTTON_ICON = "continuebuttonicon";

    @NotNull
    public static final String CONTINUE_BUTTON_TEXT = "continuebuttontext";

    @NotNull
    public static final String CONTINUE_BUTTON_TEXT_COLOR = "continuebuttontextcolor";

    @NotNull
    public static final String DESIRED_WIDTH = "desiredWidth";

    @NotNull
    public static final String DEVICE_INCORRECT_POSITION = "deviceincorrectposition";

    @NotNull
    public static final String FACE_DETECTED_NOT_CENTERED_COLOR = "facedetectednotcenteredcolor";

    @NotNull
    public static final String FACE_DETECTED_OK_COLOR = "facedetectedokcolor";

    @NotNull
    public static final String FACE_SHAPE_OVAL = "faceshapeoval";

    @NotNull
    public static final String FACE_TIGHTNESS = "facetightness";

    @NotNull
    public static final String FACING = "facing";

    @NotNull
    public static final String FINAL_TUTORIAL_ALERT_SHOW = "finaltutorialalertshow";

    @NotNull
    public static final String FIXED_OVAL = "fixedoval";

    @NotNull
    public static final String FRONT = "front";

    @NotNull
    public static final String HIGH = "high";

    @NotNull
    public static final String INFORMATIVE_TEXT_BACKGROUND_COLOR = "informativetextbackgroundcolor";

    @NotNull
    public static final String INFORMATIVE_TEXT_COLOR = "informativetextcolor";

    @NotNull
    public static final String INFO_ALERT = "infoalert";

    @NotNull
    public static final String INFO_ALERT_SHOW = "infoalertshow";

    @NotNull
    public static final String INFO_ALERT_TITLE = "infoalerttitle";

    @NotNull
    public static final String JWS_TOKEN = "jwstoken";

    @NotNull
    private static final String JWS_TOKEN_ALIAS = "jws_token";

    @NotNull
    public static final String LIVE_PHOTO = "livephoto";

    @NotNull
    public static final String LOGGER_FACTORY_CLASS = "loggerfactoryclass";

    @NotNull
    public static final String LOOSE = "loose";

    @NotNull
    public static final String LOW = "low";

    @NotNull
    public static final String MEDIUM = "medium";

    @NotNull
    public static final String MOBILE_OVAL = "mobileoval";

    @NotNull
    public static final String MOBILE_OVAL_COLOR = "mobileovalcolor";

    @NotNull
    public static final String NGAS_FIRSTMOVEMENT_TIMEOUT = "ngasfirstmovementtimeout";

    @NotNull
    private static final String NGAS_FIRSTMOVEMENT_TIMEOUT_ALIAS = "ngas_firstmovement_timeout";

    @NotNull
    public static final String NGAS_TIMEOUT = "ngastimeout";

    @NotNull
    public static final String ORIENTATION_BACKGROUND_COLOR = "orientationbackgroundcolor";

    @NotNull
    public static final String ORIENTATION_OPACITY = "orientationopacity";

    @NotNull
    public static final String PERMISSION_REFUSED = "permissionrefused";

    @NotNull
    public static final String PERMISSION_REFUSED_TITLE = "permissionrefusedtitle";

    @NotNull
    public static final String POPUP_VALIDATION_BACKGROUND_COLOR = "popupvalidationbackgroundcolor";

    @NotNull
    public static final String POPUP_VALIDATION_TEXT_COLOR = "popupvalidationtextcolor";

    @NotNull
    public static final String POSITIVE_BUTTON_TEXT = "positivebuttontext";

    @NotNull
    public static final String QUALITY_LEVEL = "qualitylevel";

    @NotNull
    public static final String QUALITY_LEVEL_MEDIUM = "medium";

    @NotNull
    public static final String REPEAT_BUTTOM_ICON = "repeatbuttonicon";

    @NotNull
    public static final String REPEAT_BUTTON_BACKGROUND_COLOR = "repeatbuttonbackgroundcolor";

    @NotNull
    public static final String REPEAT_BUTTON_TEXT = "repeatbuttontext";

    @NotNull
    public static final String REPEAT_BUTTON_TEXT_COLOR = "repeatbuttontextcolor";

    @NotNull
    public static final String SAVE_TO_LOCAL = "saveToLocal";

    @NotNull
    public static final String SCREEN_ORIENTATION = "screenorientation";

    @NotNull
    public static final String SEARCHING_FACE_STEP_INSTRUCTION = "searchingfacestepinstruction";

    @NotNull
    public static final String SELFIEALIVE_ARROW_COLOR = "selfiealivearrowcolor";

    @NotNull
    public static final String SELFIEALIVE_ARROW_COLOR_ALIAS = "selfiealive_arrow_color";

    @NotNull
    public static final String SELFIEALIVE_SHOW_ARROWS = "selfiealiveshowarrows";

    @NotNull
    public static final String SELFIEALIVE_SHOW_ARROWS_ALIAS = "selfiealive_show_arrows";

    @NotNull
    public static final String SELFIEALIVE_SHOW_GIF = "selfiealiveshowgif";

    @NotNull
    public static final String SELFIEALIVE_SHOW_GIF_ALIAS = "selfiealive_show_gif";

    @NotNull
    public static final String SELFIE_NGAS_CHALLENGE_BOTTOM_TEXT = "challengebottomtext";

    @NotNull
    public static final String SELFIE_NGAS_CHALLENGE_CENTER_TEXT = "challengecentertext";

    @NotNull
    public static final String SELFIE_NGAS_CHALLENGE_LEFT_TEXT = "challengelefttext";

    @NotNull
    public static final String SELFIE_NGAS_CHALLENGE_RIGHT_TEXT = "challengerighttext";

    @NotNull
    public static final String SELFIE_NGAS_CHALLENGE_TOP_TEXT = "challengetoptext";

    @NotNull
    public static final String SELFIE_NGAS_ERROR_ALERT_BUTTON_TEXT = "selfiengaserroralertbuttontext";

    @NotNull
    public static final String SELFIE_NGAS_ERROR_ALERT_DESCRIPTION = "selfiengaserroralertdescription";

    @NotNull
    public static final String SELFIE_NGAS_ERROR_ALERT_STEP1 = "selfiengaserroralertstep1";

    @NotNull
    public static final String SELFIE_NGAS_ERROR_ALERT_STEP2 = "selfiengaserroralertstep2";

    @NotNull
    public static final String SELFIE_NGAS_ERROR_ALERT_STEP3 = "selfiengaserroralertstep3";

    @NotNull
    public static final String SELFIE_NGAS_ERROR_ALERT_TITLE = "selfiengaserroralerttitle";

    @NotNull
    public static final String SELFIE_NGAS_ERROR_ALERT_TITLE_COLOR = "selfiengaserroralerttitlecolor";

    @NotNull
    public static final String SELFIE_NGAS_TUTORIAL_STEP3_DESCRIPTION = "selfiengastutorialdescription3";

    @NotNull
    public static final String SELFIE_NGAS_TUTORIAL_STEP3_TITLE = "selfiengastutorialstep3title";

    @NotNull
    public static final String SELFIE_SMILE_TUTORIAL_STEP3_DESCRIPTION = "selfiesmiletutorialdescription3";

    @NotNull
    public static final String SELFIE_SMILE_TUTORIAL_STEP3_TITLE = "selfiesmiletutorialstep3title";

    @NotNull
    public static final String SELFIE_TUTORIAL_BACKGROUND_COLOR = "selfietutorialbackgroundcolor";

    @NotNull
    public static final String SELFIE_TUTORIAL_CONTINUE_BUTTON_FIRST_GRADIENT_COLOR = "selfietutorialcontinuebuttonfirstgradientcolor";

    @NotNull
    public static final String SELFIE_TUTORIAL_CONTINUE_BUTTON_SECOND_GRADIENT_COLOR = "selfietutorialcontinuebuttonsecondgradientcolor";

    @NotNull
    public static final String SELFIE_TUTORIAL_CONTINUE_BUTTON_TEXT = "selfietutorialcontinuebuttontext";

    @NotNull
    public static final String SELFIE_TUTORIAL_CONTINUE_BUTTON_TEXT_COLOR = "selfietutorialcontinuebuttontextcolor";

    @NotNull
    public static final String SELFIE_TUTORIAL_CURRENT_POINT_COLOR = "selfietutorialcurrentpointcolor";

    @NotNull
    public static final String SELFIE_TUTORIAL_GENERAL_TITLE = "selfietutorialgeneraltitle";

    @NotNull
    public static final String SELFIE_TUTORIAL_GENERAL_TITLE_COLOR = "selfietutorialgeneraltitlecolor";

    @NotNull
    public static final String SELFIE_TUTORIAL_STEP1_DESCRIPTION = "selfietutorialdescription1";

    @NotNull
    public static final String SELFIE_TUTORIAL_STEP1_TITLE = "selfietutorialstep1title";

    @NotNull
    public static final String SELFIE_TUTORIAL_STEP2_DESCRIPTION = "selfietutorialdescription2";

    @NotNull
    public static final String SELFIE_TUTORIAL_STEP2_TITLE = "selfietutorialstep2title";

    @NotNull
    public static final String SELFIE_TUTORIAL_STEP_BUTTON_NEXT_COLOR = "selfietutorialstepbuttonnexttextcolor";

    @NotNull
    public static final String SELFIE_TUTORIAL_STEP_BUTTON_NEXT_TEXT = "selfietutorialstepbuttonnexttext";

    @NotNull
    public static final String SELFIE_TUTORIAL_STEP_BUTTON_PREVIOUS_COLOR = "selfietutorialstepbuttonprevioustextcolor";

    @NotNull
    public static final String SELFIE_TUTORIAL_STEP_BUTTON_PREVIOUS_TEXT = "selfietutorialstepbuttonprevioustext";

    @NotNull
    public static final String SELFIE_TUTORIAL_STEP_DESCRIPTION_COLOR = "selfietutorialdescriptioncolor";

    @NotNull
    public static final String SELFIE_TUTORIAL_STEP_TITLE_COLOR = "selfietutorialsteptitlecolor";

    @NotNull
    public static final String SHOW_SELFIE = "showselfie";

    @NotNull
    public static final String SHOW_TUTORIAL = "showtutorial";

    @NotNull
    public static final String SMART_SELFIE = "smartselfie";

    @NotNull
    public static final String SMILE_REQUEST_MORE_SERIOUS = "smilerequestmoreserious";

    @NotNull
    public static final String SMILE_REQUEST_MORE_SMILE = "smilerequestmoresmile";

    @NotNull
    public static final String SMILE_REQUEST_SERIOUS = "smilerequestserious";

    @NotNull
    public static final String SMILE_REQUEST_SERIOUS_IMAGE = "smilerequestseriousimage";

    @NotNull
    public static final String SMILE_REQUEST_SMILE = "smilerequestsmile";

    @NotNull
    public static final String SMILE_REQUEST_SMILE_IMAGE = "smilerequestsmileimage";

    @NotNull
    public static final String SMILE_TIMEOUT = "smiletimeout";

    @NotNull
    public static final String SMILE_TIMEOUT_MESSAGE = "smiletimeoutmessage";

    @NotNull
    public static final String SMILE_TIMEOUT_SECONDS = "smiletimeoutseconds";

    @NotNull
    public static final String SMILE_WARNING_SECONDS = "smilewarningseconds";

    @NotNull
    public static final String TEXT_BACKGROUND_COLOR = "textbackgroundcolor";

    @NotNull
    public static final String TICK_CIRCLE_COLOR = "tickcirclecolor";

    @NotNull
    public static final String TICK_COLOR = "tickcolor";

    @NotNull
    public static final String TICK_SHOW = "tickshow";

    @NotNull
    public static final String TIGHT = "tight";

    @NotNull
    public static final String TOP = "top";

    @NotNull
    public static final String USER_INFO = "userinfo";

    @NotNull
    public static final String VERIDAS_LOGO_SHOW = "veridaslogoshow";

    @NotNull
    public static final String VIDEO_QUALITY = "videoquality";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VDPhotoSelfieConfiguration(@NotNull Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    @Override // com.veridas.config.Configuration
    public void initialize(@NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        addAliasFor(JWS_TOKEN, JWS_TOKEN_ALIAS);
        addAliasFor(NGAS_FIRSTMOVEMENT_TIMEOUT, NGAS_FIRSTMOVEMENT_TIMEOUT_ALIAS);
        addAliasFor(SELFIEALIVE_SHOW_ARROWS, SELFIEALIVE_SHOW_ARROWS_ALIAS);
        addAliasFor(SELFIEALIVE_SHOW_GIF, SELFIEALIVE_SHOW_GIF_ALIAS);
        addAliasFor(SELFIEALIVE_ARROW_COLOR, SELFIEALIVE_ARROW_COLOR_ALIAS);
        setProtectedProperties(CollectionsKt__CollectionsKt.mutableListOf(ALLOW_CHALLENGE_RETRY, "screenorientation"));
        setDefaultLongProperty(SMILE_TIMEOUT_SECONDS, "10");
        setDefaultLongProperty(SMILE_WARNING_SECONDS, "5");
        setDefaultBooleanProperty(ALLOW_CHALLENGE_RETRY, "YES");
        setDefaultBooleanProperty("closebutton", "NO");
        setDefaultBooleanProperty("faceshapeoval", "YES");
        setDefaultBooleanProperty(FINAL_TUTORIAL_ALERT_SHOW, "YES");
        setDefaultBooleanProperty("fixedoval", "YES");
        setDefaultBooleanProperty("infoalertshow", "NO");
        setDefaultBooleanProperty(LIVE_PHOTO, "NO");
        setDefaultBooleanProperty("mobileoval", "NO");
        setDefaultBooleanProperty(ORIENTATION_OPACITY, "YES");
        setDefaultBooleanProperty(SAVE_TO_LOCAL, "NO");
        setDefaultBooleanProperty(SELFIEALIVE_SHOW_ARROWS, "YES");
        setDefaultBooleanProperty(SELFIEALIVE_SHOW_GIF, "YES");
        setDefaultBooleanProperty(SHOW_SELFIE, "YES");
        setDefaultBooleanProperty("showtutorial", "YES");
        setDefaultBooleanProperty(SMART_SELFIE, "YES");
        setDefaultBooleanProperty(SMILE_TIMEOUT, "YES");
        setDefaultBooleanProperty(TICK_SHOW, "YES");
        setDefaultBooleanProperty(VERIDAS_LOGO_SHOW, "YES");
        setDefaultIntegerProperty(DESIRED_WIDTH, "1920");
        setDefaultIntegerProperty(NGAS_TIMEOUT, StorageTokenBuilder.OTP_LENGTH);
        setDefaultIntegerProperty(NGAS_FIRSTMOVEMENT_TIMEOUT, "10");
        setDefaultStringProperty("alertstyle", "black");
        setDefaultStringProperty(BRING_CLOSER_FACE_TEXT, resources.getString(R.string.vd_photo_bring_closer_face_text));
        setDefaultStringProperty(CENTER_FACE_TEXT, resources.getString(R.string.vd_photo_center_face_text));
        setDefaultStringProperty(CHECK_SELFIE_TEXT, resources.getString(R.string.vd_photo_check_selfie_text));
        int i10 = R.string.vd_photo_continue_text;
        setDefaultStringProperty("continuebuttontext", resources.getString(i10));
        setDefaultStringProperty(FACE_TIGHTNESS, TIGHT);
        setDefaultStringProperty("facing", "front");
        setDefaultStringProperty("infoalert", resources.getString(R.string.vd_photo_info_alert));
        setDefaultStringProperty("infoalerttitle", "");
        setDefaultStringProperty("permissionrefused", resources.getString(R.string.vd_photo_permission_camera));
        setDefaultStringProperty("permissionrefusedtitle", resources.getString(R.string.vd_photo_permission_required));
        setDefaultStringProperty("positivebuttontext", resources.getString(i10));
        setDefaultStringProperty(QUALITY_LEVEL, "high");
        setDefaultStringProperty("repeatbuttontext", resources.getString(R.string.vd_photo_repeat_text));
        setDefaultStringProperty("screenorientation", "portrait");
        setDefaultStringProperty(SMILE_REQUEST_MORE_SERIOUS, resources.getString(R.string.vd_photo_smile_request_more_serious));
        setDefaultStringProperty(SMILE_REQUEST_MORE_SMILE, resources.getString(R.string.vd_photo_smile_request_more_smile));
        setDefaultStringProperty(SMILE_REQUEST_SERIOUS, resources.getString(R.string.vd_photo_smile_request_serious));
        setDefaultStringProperty(SMILE_REQUEST_SMILE, resources.getString(R.string.vd_photo_smile_request_smile));
        setDefaultStringProperty(SMILE_TIMEOUT_MESSAGE, resources.getString(R.string.vd_photo_smile_timeout_message));
        setDefaultStringProperty(JWS_TOKEN, "");
        setDefaultStringProperty("userinfo", resources.getString(R.string.vd_photo_user_info));
        setDefaultStringProperty(SELFIE_NGAS_ERROR_ALERT_TITLE, resources.getString(R.string.vd_photo_ngas_alert_error_title));
        setDefaultStringProperty(SELFIE_NGAS_ERROR_ALERT_DESCRIPTION, resources.getString(R.string.vd_photo_ngas_alert_error_description));
        setDefaultStringProperty(SELFIE_NGAS_ERROR_ALERT_STEP1, resources.getString(R.string.vd_photo_ngas_alert_error_step1));
        setDefaultStringProperty(SELFIE_NGAS_ERROR_ALERT_STEP2, resources.getString(R.string.vd_photo_ngas_alert_error_step2));
        setDefaultStringProperty(SELFIE_NGAS_ERROR_ALERT_STEP3, resources.getString(R.string.vd_photo_ngas_alert_error_step3));
        setDefaultStringProperty(SELFIE_NGAS_ERROR_ALERT_BUTTON_TEXT, resources.getString(R.string.vd_photo_ngas_alert_error_button));
        setDefaultStringProperty(SELFIE_NGAS_CHALLENGE_TOP_TEXT, resources.getString(R.string.vd_photo_movement_top));
        setDefaultStringProperty(SELFIE_NGAS_CHALLENGE_BOTTOM_TEXT, resources.getString(R.string.vd_photo_movement_bottom));
        setDefaultStringProperty(SELFIE_NGAS_CHALLENGE_LEFT_TEXT, resources.getString(R.string.vd_photo_movement_left));
        setDefaultStringProperty(SELFIE_NGAS_CHALLENGE_RIGHT_TEXT, resources.getString(R.string.vd_photo_movement_right));
        setDefaultStringProperty(SELFIE_NGAS_CHALLENGE_CENTER_TEXT, resources.getString(R.string.vd_photo_movement_center));
        setDefaultStringProperty(DEVICE_INCORRECT_POSITION, resources.getString(R.string.vd_photo_device_incorrect_position));
        setDefaultStringProperty(SEARCHING_FACE_STEP_INSTRUCTION, resources.getString(R.string.vd_photo_selfie_help_text));
        setDefaultStringProperty("continuebuttonicon", "undefined");
        setDefaultStringProperty("repeatbuttonicon", "undefined");
        setDefaultStringProperty("closebuttonimage", "undefined");
        setDefaultStringProperty(SMILE_REQUEST_SMILE_IMAGE, "undefined");
        setDefaultStringProperty(SMILE_REQUEST_SERIOUS_IMAGE, "undefined");
        setDefaultStringProperty(SELFIE_TUTORIAL_CONTINUE_BUTTON_TEXT, resources.getString(R.string.vd_photo_like));
        setDefaultStringProperty(SELFIE_TUTORIAL_GENERAL_TITLE, resources.getString(R.string.vd_photo_selfie_tutorial_general_title));
        setDefaultStringProperty(SELFIE_TUTORIAL_STEP1_TITLE, resources.getString(R.string.vd_photo_selfie_tutorial_step1_title));
        setDefaultStringProperty(SELFIE_TUTORIAL_STEP2_TITLE, resources.getString(R.string.vd_photo_selfie_tutorial_step2_title));
        setDefaultStringProperty(SELFIE_NGAS_TUTORIAL_STEP3_TITLE, resources.getString(R.string.vd_photo_selfie_tutorial_ngas_step3_title));
        setDefaultStringProperty(SELFIE_SMILE_TUTORIAL_STEP3_TITLE, resources.getString(R.string.vd_photo_selfie_tutorial_smile_step3_title));
        setDefaultStringProperty(SELFIE_TUTORIAL_STEP1_DESCRIPTION, resources.getString(R.string.vd_photo_selfie_tutorial_step1_description));
        setDefaultStringProperty(SELFIE_TUTORIAL_STEP2_DESCRIPTION, resources.getString(R.string.vd_photo_selfie_tutorial_step2_description));
        setDefaultStringProperty(SELFIE_NGAS_TUTORIAL_STEP3_DESCRIPTION, resources.getString(R.string.vd_photo_selfie_tutorial_ngas_step3_description));
        setDefaultStringProperty(SELFIE_SMILE_TUTORIAL_STEP3_DESCRIPTION, resources.getString(R.string.vd_photo_selfie_tutorial_smile_step3_description));
        setDefaultStringProperty(SELFIE_TUTORIAL_STEP_BUTTON_NEXT_TEXT, resources.getString(R.string.vd_photo_next_button));
        setDefaultStringProperty(SELFIE_TUTORIAL_STEP_BUTTON_PREVIOUS_TEXT, resources.getString(R.string.vd_photo_previous_button));
        setDefaultStringProperty(VIDEO_QUALITY, "medium");
        setDefaultStringProperty("loggerfactoryclass", "");
        setDefaultColorProperty(BACKGROUND_COLOR, "#CC808080");
        setDefaultColorProperty(CHECK_SELFIE_BACKGROUND_COLOR, "#424242");
        setDefaultColorProperty(CHECK_SELFIE_TEXT_COLOR, "#FFFFFFFF");
        setDefaultColorProperty("continuebuttonbackgroundcolor", "#116466");
        setDefaultColorProperty("continuebuttontextcolor", "#FFFFFF");
        setDefaultColorProperty(FACE_DETECTED_NOT_CENTERED_COLOR, "#FC321E");
        setDefaultColorProperty(FACE_DETECTED_OK_COLOR, "#3b9dd6");
        setDefaultColorProperty("informativetextcolor", "#1a5eb0");
        setDefaultColorProperty(INFORMATIVE_TEXT_BACKGROUND_COLOR, "#FFFFFF");
        setDefaultColorProperty(MOBILE_OVAL_COLOR, "#00CC00");
        setDefaultColorProperty(ORIENTATION_BACKGROUND_COLOR, "#CC00ECFF");
        setDefaultColorProperty("popupvalidationbackgroundcolor", "#AA000000");
        setDefaultColorProperty("popupvalidationtextcolor", "#FFFFFF");
        setDefaultColorProperty("repeatbuttonbackgroundcolor", "#116466");
        setDefaultColorProperty("repeatbuttontextcolor", "#FFFFFF");
        setDefaultColorProperty("textbackgroundcolor", "#AA000000");
        setDefaultColorProperty("tickcirclecolor", "#1a5eb0");
        setDefaultColorProperty(MOBILE_OVAL_COLOR, "#00CC00");
        setDefaultColorProperty("tickcolor", "#FFFFFFFF");
        setDefaultColorProperty(SELFIEALIVE_ARROW_COLOR, "#1a5eb0");
        setDefaultColorProperty(SELFIE_NGAS_ERROR_ALERT_TITLE_COLOR, "#1a5eb0");
        setDefaultColorProperty(SELFIE_TUTORIAL_CURRENT_POINT_COLOR, "#1a5eb0");
        setDefaultColorProperty(SELFIE_TUTORIAL_CONTINUE_BUTTON_FIRST_GRADIENT_COLOR, "#3b9ed7");
        setDefaultColorProperty(SELFIE_TUTORIAL_CONTINUE_BUTTON_SECOND_GRADIENT_COLOR, "#1a5db0");
        setDefaultColorProperty(SELFIE_TUTORIAL_BACKGROUND_COLOR, "#ececec");
        setDefaultColorProperty(SELFIE_TUTORIAL_CONTINUE_BUTTON_TEXT_COLOR, "#ffffff");
        setDefaultColorProperty(SELFIE_TUTORIAL_GENERAL_TITLE_COLOR, "#1a5eb0");
        setDefaultColorProperty(SELFIE_TUTORIAL_STEP_TITLE_COLOR, "#1a5eb0");
        setDefaultColorProperty(SELFIE_TUTORIAL_STEP_DESCRIPTION_COLOR, "#868686");
        setDefaultColorProperty(SELFIE_TUTORIAL_STEP_BUTTON_NEXT_COLOR, "#1a5eb0");
        setDefaultColorProperty(SELFIE_TUTORIAL_STEP_BUTTON_PREVIOUS_COLOR, "#1a5eb0");
    }

    public final boolean isSelfieAlive() {
        return getBoolean(LIVE_PHOTO) && TextUtils.isEmpty(getString(JWS_TOKEN));
    }

    public final boolean isSelfieAlivePro() {
        return getBoolean(LIVE_PHOTO) && !TextUtils.isEmpty(getString(JWS_TOKEN));
    }

    public final boolean mustSaveToLocal() {
        return getBoolean(SAVE_TO_LOCAL);
    }
}
