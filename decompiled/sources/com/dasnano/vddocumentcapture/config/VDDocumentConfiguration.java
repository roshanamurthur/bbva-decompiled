package com.dasnano.vddocumentcapture.config;

import android.content.res.Resources;
import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.tokencompat.model.StorageTokenBuilder;
import com.dasnano.vddocumentcapture.R;
import com.veridas.config.Configuration;
import com.veridas.config.PropertyNameNotFoundException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: VDDocumentConfiguration.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0014J\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\u000bH\u0002J\u0006\u0010\r\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¨\u0006\u0010"}, d2 = {"Lcom/dasnano/vddocumentcapture/config/VDDocumentConfiguration;", "Lcom/veridas/config/Configuration;", "resources", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources;)V", "getOnlyObverseDocuments", "", "", "initialize", "", "isOnlyObverse", "", "isOnlyObverseBoolean", "isOnlyObverseBooleanAndTrue", "splitOnlyObverse", "Companion", "document-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVDDocumentConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VDDocumentConfiguration.kt\ncom/dasnano/vddocumentcapture/config/VDDocumentConfiguration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,433:1\n766#2:434\n857#2,2:435\n*S KotlinDebug\n*F\n+ 1 VDDocumentConfiguration.kt\ncom/dasnano/vddocumentcapture/config/VDDocumentConfiguration\n*L\n395#1:434\n395#1:435,2\n*E\n"})
public final class VDDocumentConfiguration extends Configuration {

    @NotNull
    public static final String ADVANCED_DETECTION_DEFERRED = "advanceddetectiondeferred";

    @NotNull
    public static final String ADVANCED_DETECTION_ENABLED = "advanceddetectionenabled";

    @NotNull
    public static final String ADVANCED_DETECTION_OBVERSE_DELAY = "advanceddetectionobversedelay";

    @NotNull
    public static final String ADVANCED_DETECTION_REVERSE_DELAY = "advanceddetectionreversedelay";

    @NotNull
    public static final String ALERT_STYLE = "alertstyle";

    @NotNull
    public static final String ARROWS = "arrows";

    @NotNull
    public static final String ARROW_COLOR_1 = "arrowcolor1";

    @NotNull
    public static final String ARROW_COLOR_2 = "arrowcolor2";

    @NotNull
    public static final String ARROW_COLOR_3 = "arrowcolor3";

    @NotNull
    public static final String ARROW_COLOR_4 = "arrowcolor4";

    @NotNull
    public static final String ARROW_COLOR_5 = "arrowcolor5";

    @NotNull
    public static final String BAD_QUALITY_PICTURE_INFO = "badqualitypictureinfo";

    @NotNull
    public static final String BRIGHTS_HELP = "brightshelp";

    @NotNull
    public static final String BRIGHTS_HELP_CIRCLE_COLOR = "brightshelpcirclecolor";

    @NotNull
    public static final String BRIGHTS_HELP_COLOR = "brightshelpcolor";

    @NotNull
    public static final String BRIGHTS_HELP_TEXT = "brightshelptext";

    @NotNull
    public static final String CAMERA_ERROR_ALERT = "cameraerroralert";

    @NotNull
    public static final String CAMERA_ERROR_ALERT_TITLE = "cameraerroralerttitle";

    @NotNull
    public static final String CAMERA_FACING_BACK = "back";

    @NotNull
    public static final String CAMERA_FACING_FRONT = "front";

    @NotNull
    public static final String CAPTURE = "capture";

    @NotNull
    public static final String CAPTURE_BACKGROUND_COLOR = "capturebackgroundcolor";

    @NotNull
    public static final String CAPTURE_BRIGHTS_DETECTION_ENABLED = "capturebrightsdetectionenabled";

    @NotNull
    public static final String CAPTURE_BRIGHTS_DETECTION_INFO_TEXT = "capturebrightsdetectioninfotext";

    @NotNull
    public static final String CHECK_DOCUMENT_TEXT = "checkdocumenttext";

    @NotNull
    public static final String CHECK_DOCUMENT_TEXT_COLOR = "checkdocumenttextcolor";

    @NotNull
    public static final String CLASSIFICATION = "classification";

    @NotNull
    public static final String CLOSE_BUTTON = "closebutton";

    @NotNull
    public static final String CLOSE_BUTTON_IMAGE = "closebuttonimage";

    @NotNull
    public static final String CONTINUE_BUTTON_BACKGROUND_COLOR = "continuebuttonbackgroundcolor";

    @NotNull
    public static final String CONTINUE_BUTTON_ICON = "continuebuttonicon";

    @NotNull
    public static final String CONTINUE_BUTTON_TEXT = "continuebuttontext";

    @NotNull
    public static final String CONTINUE_BUTTON_TEXT_COLOR = "continuebuttontextcolor";

    @NotNull
    public static final String CUT_IMAGE = "cutimage";

    @NotNull
    public static final String CUT_SCREEN = "cut_screen";

    @NotNull
    private static final String DELIMITER = ";";

    @NotNull
    public static final String DOCUMENT_DETECTED_OK_LEVEL1_COLOR = "documentdetectedoklevel1color";

    @NotNull
    public static final String DOCUMENT_DETECTED_OK_LEVEL2_COLOR = "documentdetectedoklevel2color";

    @NotNull
    public static final String DOCUMENT_DETECTED_OK_LEVEL3_COLOR = "documentdetectedoklevel3color";

    @NotNull
    public static final String DOCUMENT_DETECTED_OK_LEVEL4_COLOR = "documentdetectedoklevel4color";

    @NotNull
    public static final String DOCUMENT_DETECTED_VERY_CLOSE_COLOR = "documentdetectedveryclosecolor";

    @NotNull
    public static final String DOCUMENT_DETECTED_VERY_FAR_COLOR = "documentdetectedveryfarcolor";

    @NotNull
    public static final String DOCUMENT_VERY_CLOSE = "documentveryclose";

    @NotNull
    public static final String DOCUMENT_VERY_FAR = "documentveryfar";

    @NotNull
    public static final String DRAW_RECTANGLE = "drawrectangle";

    @NotNull
    public static final String ENABLE_RECTANGLE_DETECTION_AFTER_SMART_DETECTION = "enablerectangledetectionaftersmartdetection";

    @NotNull
    public static final String EVALUATION_APP_BIDI_RETRIEVAL = "evaluation_app_bidi_retrieval";

    @NotNull
    public static final String FACING = "facing";

    @NotNull
    public static final String FIXED_RECTANGLE = "fixedrectangle";

    @NotNull
    public static final String FIXED_TEMPLATE = "fixedtemplate";

    @NotNull
    public static final String INFORMATION_BUTTON_ICON = "informationbuttonicon";

    @NotNull
    public static final String INFORMATIVE_TEXT_COLOR = "informativetextcolor";

    @NotNull
    public static final String INFO_ALERT = "infoalert";

    @NotNull
    public static final String INFO_ALERT_PASS = "infoalertpass";

    @NotNull
    public static final String INFO_ALERT_SHOW = "infoalertshow";

    @NotNull
    public static final String INFO_ALERT_TITLE = "infoalerttitle";

    @NotNull
    public static final String INFO_ALERT_TITLE_PASS = "infoalerttitlepass";

    @NotNull
    public static final String LOGGER_FACTORY_CLASS = "loggerfactoryclass";

    @NotNull
    public static final String MEGAPIXELS = "megapixels";

    @NotNull
    public static final String OBVERSE_DETECTION_DELAY = "obversedetectiondelay";

    @NotNull
    public static final String OBVERSE_NOT_FOUND_TEXT = "obversenotfoundtext";

    @NotNull
    public static final String OBVERSE_RECTANGLE_DETECTION_AFTER_SMART_DETECTION_DELAY = "obverserectangledetectionaftersmartdetection";

    @NotNull
    public static final String ONLY_OBVERSE = "onlyobverse";

    @NotNull
    public static final String ON_PICTURE_VIBRATION = "onpicturevibration";

    @NotNull
    public static final String PASSPORT_NOT_FOUND_TEXT = "passportnotfoundtext";

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
    public static final String PRIORITY = "priority";

    @NotNull
    public static final String REPEAT_BUTTON_BACKGROUND_COLOR = "repeatbuttonbackgroundcolor";

    @NotNull
    public static final String REPEAT_BUTTON_ICON = "repeatbuttonicon";

    @NotNull
    public static final String REPEAT_BUTTON_TEXT = "repeatbuttontext";

    @NotNull
    public static final String REPEAT_BUTTON_TEXT_COLOR = "repeatbuttontextcolor";

    @NotNull
    public static final String REQUIREMENTS_ALERT_MESSAGE = "requirementsalertmessage";

    @NotNull
    public static final String REQUIREMENTS_ALERT_TITLE = "requirementsalerttitle";

    @NotNull
    public static final String REVERSE_DETECTION_DELAY = "reversedetectiondelay";

    @NotNull
    public static final String REVERSE_NOT_FOUND_TEXT = "reversenotfoundtext";

    @NotNull
    public static final String REVERSE_RECTANGLE_DETECTION_AFTER_SMART_DETECTION_DELAY = "reverserectangledetectionaftersmartdetection";

    @NotNull
    public static final String SCREEN_ORIENTATION = "screenorientation";

    @NotNull
    public static final String SECONDS_WITHOUT_PICTURE = "secondsWithoutPicture";

    @NotNull
    public static final String SECONDS_WITHOUT_SHUTTER_BUTTON_OBVERSE = "secondswithoutshutterbuttonobverse";

    @NotNull
    public static final String SECONDS_WITHOUT_SHUTTER_BUTTON_REVERSE = "secondswithoutshutterbuttonreverse";

    @NotNull
    public static final String SECONDS_WITH_SHUTTER_BUTTON_MESSAGE = "secondswithshutterbuttonmessage";

    @NotNull
    public static final String SHOW_DOCUMENT = "showdocument";

    @NotNull
    public static final String SHOW_TUTORIAL = "showtutorial";

    @NotNull
    public static final String SHOW_USER_HELP = "showUserHelp";

    @NotNull
    public static final String SHUTTER_BUTTON_BACKGROUND_COLOR = "shutterbuttonbackgroundcolor";

    @NotNull
    public static final String SHUTTER_BUTTON_BORDER_COLOR = "shutterbuttonbordercolor";

    @NotNull
    public static final String SHUTTER_BUTTON_MESSAGE = "shutterbuttonmessage";

    @NotNull
    public static final String SHUTTER_BUTTON_MESSAGE_BACKGROUND_COLOR = "shutterbuttonmessagebackgroundcolor";

    @NotNull
    public static final String SHUTTER_BUTTON_MESSAGE_TEXT_COLOR = "shutterbuttonmessagetextcolor";

    @NotNull
    public static final String SHUTTER_BUTTON_SHOW = "shutterbuttonshow";

    @NotNull
    public static final String TEXT_BACKGROUND_COLOR = "textbackgroundcolor";

    @NotNull
    public static final String TICK_CIRCLE_COLOR = "tickcirclecolor";

    @NotNull
    public static final String TICK_COLOR = "tickcolor";

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
    public static final String TUTORIAL_SCREEN_ORIENTATION = "tutorialscreenorientation";

    @NotNull
    public static final String TUTORIAL_TEXT = "tutorialtext";

    @NotNull
    public static final String TUTORIAL_TEXT_COLOR = "tutorialtextcolor";

    @NotNull
    public static final String TUTORIAL_TITLE = "tutorialtitle";

    @NotNull
    public static final String TUTORIAL_TITLE_COLOR = "tutorialtitlecolor";

    @NotNull
    public static final String USER_HELP_DIALOG_MESSAGE = "userHelpDialogMessage";

    @NotNull
    public static final String USER_HELP_DIALOG_NEGATIVE_BUTTON = "userHelpDialogNegativeButton";

    @NotNull
    public static final String USER_HELP_DIALOG_POSITIVE_BUTTON = "userHelpDialogPositiveButton";

    @NotNull
    public static final String USER_HELP_DIALOG_TITLE = "userHelpDialogTitle";

    @NotNull
    public static final String USER_HELP_TEXT = "userHelpText";

    @NotNull
    public static final String USER_INFO = "userinfo";

    @NotNull
    public static final String VALIDATE_DOCUMENT_BUTTONS_WIDTH_DIVISOR = "validatedocumentbuttonswidthdivisor";

    @NotNull
    public static final String VALIDATION_BACKGROUND_COLOR = "validationbackgroundcolor";

    @NotNull
    public static final String WHITE = "white";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VDDocumentConfiguration(@NotNull Resources resources) {
        super(resources);
        Intrinsics.checkNotNullParameter(resources, "resources");
    }

    private final boolean isOnlyObverseBoolean() throws PropertyNameNotFoundException {
        List<String> listSplitOnlyObverse = splitOnlyObverse();
        if (listSplitOnlyObverse.size() != 1) {
            return false;
        }
        String str = listSplitOnlyObverse.get(0);
        return Intrinsics.areEqual(str, "YES") || Intrinsics.areEqual(str, "NO");
    }

    private final List<String> splitOnlyObverse() throws PropertyNameNotFoundException {
        String string = getString(ONLY_OBVERSE);
        Intrinsics.checkNotNull(string);
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) string, new String[]{";"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSplit$default) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Nullable
    public final List<String> getOnlyObverseDocuments() {
        if (isOnlyObverseBoolean()) {
            return null;
        }
        return splitOnlyObverse();
    }

    @Override // com.veridas.config.Configuration
    public void initialize(@NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        setProtectedProperties(CollectionsKt__CollectionsKt.mutableListOf(MEGAPIXELS, CUT_IMAGE, CUT_SCREEN, DRAW_RECTANGLE, "screenorientation", SHOW_USER_HELP, TUTORIAL_SCREEN_ORIENTATION, USER_HELP_DIALOG_MESSAGE, USER_HELP_DIALOG_NEGATIVE_BUTTON, USER_HELP_DIALOG_POSITIVE_BUTTON, USER_HELP_DIALOG_TITLE, USER_HELP_TEXT));
        setDefaultBooleanProperty(EVALUATION_APP_BIDI_RETRIEVAL, "NO");
        addAliasFor(ADVANCED_DETECTION_ENABLED, ENABLE_RECTANGLE_DETECTION_AFTER_SMART_DETECTION);
        addAliasFor(ADVANCED_DETECTION_OBVERSE_DELAY, OBVERSE_RECTANGLE_DETECTION_AFTER_SMART_DETECTION_DELAY);
        addAliasFor(ADVANCED_DETECTION_REVERSE_DELAY, REVERSE_RECTANGLE_DETECTION_AFTER_SMART_DETECTION_DELAY);
        setDefaultBooleanProperty(ARROWS, "YES");
        setDefaultBooleanProperty(BRIGHTS_HELP, "NO");
        setDefaultBooleanProperty(CAPTURE_BRIGHTS_DETECTION_ENABLED, "NO");
        setDefaultBooleanProperty("closebutton", "NO");
        setDefaultBooleanProperty(CUT_IMAGE, "NO");
        setDefaultBooleanProperty(CUT_SCREEN, "NO");
        setDefaultBooleanProperty("fixedrectangle", "YES");
        setDefaultBooleanProperty(FIXED_TEMPLATE, "YES");
        setDefaultBooleanProperty("infoalertshow", "YES");
        setDefaultBooleanProperty(ADVANCED_DETECTION_DEFERRED, "YES");
        setDefaultBooleanProperty(ON_PICTURE_VIBRATION, "NO");
        setDefaultBooleanProperty(SHOW_DOCUMENT, "YES");
        setDefaultBooleanProperty("showtutorial", "NO");
        setDefaultBooleanProperty(SHUTTER_BUTTON_SHOW, "YES");
        setDefaultBooleanProperty(ADVANCED_DETECTION_ENABLED, "NO");
        setDefaultBooleanProperty(DRAW_RECTANGLE, "NO");
        setDefaultColorProperty(ARROW_COLOR_1, "#FF006EC1");
        setDefaultColorProperty(ARROW_COLOR_2, "#FF009EE5");
        setDefaultColorProperty(ARROW_COLOR_3, "#FF52BCEC");
        setDefaultColorProperty(ARROW_COLOR_4, "#FF89D1F3");
        setDefaultColorProperty(ARROW_COLOR_5, "#FFB5E5F9");
        setDefaultColorProperty(BRIGHTS_HELP_COLOR, "#FC321E");
        setDefaultColorProperty(BRIGHTS_HELP_CIRCLE_COLOR, "#FC321E");
        setDefaultColorProperty(CHECK_DOCUMENT_TEXT_COLOR, "#FFFFFF");
        setDefaultColorProperty("continuebuttonbackgroundcolor", "#116466");
        setDefaultColorProperty("continuebuttontextcolor", "#FFFFFF");
        setDefaultColorProperty(CAPTURE_BACKGROUND_COLOR, "#CC808080");
        setDefaultColorProperty(DOCUMENT_DETECTED_OK_LEVEL1_COLOR, "#7FFFD4");
        setDefaultColorProperty(DOCUMENT_DETECTED_OK_LEVEL2_COLOR, "#3FFF7F");
        setDefaultColorProperty(DOCUMENT_DETECTED_OK_LEVEL3_COLOR, "#00FF00");
        setDefaultColorProperty(DOCUMENT_DETECTED_VERY_CLOSE_COLOR, "#FC321E");
        setDefaultColorProperty(DOCUMENT_DETECTED_VERY_FAR_COLOR, "#094FA4");
        setDefaultColorProperty("informativetextcolor", "#FFFFFF");
        setDefaultColorProperty("popupvalidationbackgroundcolor", "#AA000000");
        setDefaultColorProperty("popupvalidationtextcolor", "#FFFFFF");
        setDefaultColorProperty("repeatbuttonbackgroundcolor", "#116466");
        setDefaultColorProperty("repeatbuttontextcolor", "#FFFFFF");
        setDefaultColorProperty(SHUTTER_BUTTON_BACKGROUND_COLOR, "#eae9e9");
        setDefaultColorProperty(SHUTTER_BUTTON_BORDER_COLOR, "#cccccc");
        setDefaultColorProperty(SHUTTER_BUTTON_MESSAGE_BACKGROUND_COLOR, "#AA000000");
        setDefaultColorProperty(SHUTTER_BUTTON_MESSAGE_TEXT_COLOR, "#FFFFFF");
        setDefaultColorProperty("textbackgroundcolor", "#AA000000");
        setDefaultColorProperty("tickcirclecolor", "#FF48AE64");
        setDefaultColorProperty("tickcolor", "#FFFFFF");
        setDefaultColorProperty("tutorialbackgroundcolor", "#424242");
        setDefaultColorProperty("tutorialcontinuebuttoncolor", "#116466");
        setDefaultColorProperty("tutorialcontinuebuttontextcolor", "#FFFFFF");
        setDefaultColorProperty("tutorialtextcolor", "#FFFFFF");
        setDefaultColorProperty("tutorialtitlecolor", "#FFFFFF");
        setDefaultColorProperty(VALIDATION_BACKGROUND_COLOR, "#424242");
        setDefaultFloatProperty(VALIDATE_DOCUMENT_BUTTONS_WIDTH_DIVISOR, "2.1");
        setDefaultIntegerProperty(OBVERSE_DETECTION_DELAY, "0");
        setDefaultIntegerProperty(ADVANCED_DETECTION_OBVERSE_DELAY, StorageTokenBuilder.OTP_LENGTH);
        setDefaultIntegerProperty(REVERSE_DETECTION_DELAY, "0");
        setDefaultIntegerProperty(ADVANCED_DETECTION_REVERSE_DELAY, StorageTokenBuilder.OTP_LENGTH);
        setDefaultIntegerProperty(SECONDS_WITHOUT_SHUTTER_BUTTON_OBVERSE, "10");
        setDefaultIntegerProperty(SECONDS_WITHOUT_SHUTTER_BUTTON_REVERSE, "10");
        setDefaultIntegerProperty(SECONDS_WITH_SHUTTER_BUTTON_MESSAGE, "10");
        setDefaultIntegerProperty(SECONDS_WITHOUT_PICTURE, "40");
        setDefaultStringProperty("alertstyle", "black");
        setDefaultStringProperty(BAD_QUALITY_PICTURE_INFO, resources.getString(R.string.vd_document_bad_quality_picture_info));
        setDefaultStringProperty(BRIGHTS_HELP_TEXT, resources.getString(R.string.vd_document_avoid_brights));
        setDefaultStringProperty(CAMERA_ERROR_ALERT_TITLE, resources.getString(R.string.vd_document_camera_error_alert_title));
        setDefaultStringProperty(CAMERA_ERROR_ALERT, resources.getString(R.string.vd_document_camera_error_alert));
        setDefaultStringProperty(CAPTURE_BRIGHTS_DETECTION_INFO_TEXT, resources.getString(R.string.vd_document_capture_brights_detection_text));
        setDefaultStringProperty(CHECK_DOCUMENT_TEXT, resources.getString(R.string.vd_document_check_document_text));
        int i10 = R.string.vd_document_like;
        setDefaultStringProperty("continuebuttontext", resources.getString(i10));
        setDefaultStringProperty(DOCUMENT_VERY_CLOSE, resources.getString(R.string.vd_document_document_very_close));
        setDefaultStringProperty(DOCUMENT_VERY_FAR, resources.getString(R.string.vd_document_document_very_far));
        setDefaultStringProperty("facing", "back");
        setDefaultStringProperty("infoalert", resources.getString(R.string.vd_document_info_alert));
        setDefaultStringProperty("infoalertpass", resources.getString(R.string.vd_document_info_alert_passport));
        setDefaultStringProperty("infoalerttitle", "");
        setDefaultStringProperty("infoalerttitlepass", "");
        setDefaultStringProperty(OBVERSE_NOT_FOUND_TEXT, resources.getString(R.string.vd_document_obverse_not_found_text));
        setDefaultStringProperty(ONLY_OBVERSE, "NO");
        setDefaultStringProperty(PASSPORT_NOT_FOUND_TEXT, resources.getString(R.string.vd_document_passport_not_found));
        setDefaultStringProperty("permissionrefused", resources.getString(R.string.vd_document_camera_access));
        setDefaultStringProperty("permissionrefusedtitle", resources.getString(R.string.vd_document_camera_request));
        setDefaultStringProperty("positivebuttontext", resources.getString(i10));
        setDefaultStringProperty("priority", CLASSIFICATION);
        setDefaultStringProperty("repeatbuttontext", resources.getString(R.string.vd_document_repeat));
        setDefaultStringProperty(REQUIREMENTS_ALERT_MESSAGE, resources.getString(R.string.vd_document_hardware_requirements_message));
        setDefaultStringProperty(REQUIREMENTS_ALERT_TITLE, resources.getString(R.string.vd_document_hardware_requirements_title));
        setDefaultStringProperty(REVERSE_NOT_FOUND_TEXT, resources.getString(R.string.vd_document_reverse_not_found_text));
        setDefaultStringProperty(SHUTTER_BUTTON_MESSAGE, resources.getString(R.string.vd_document_shutter_button_message));
        setDefaultStringProperty("tutorialalternativepath", "");
        setDefaultStringProperty("tutorialcontinuebuttontext", resources.getString(i10));
        setDefaultStringProperty("tutorialgifpath", "");
        setDefaultStringProperty("tutorialtext", resources.getString(R.string.vd_document_document_tutorial_text));
        setDefaultStringProperty("tutorialtitle", resources.getString(R.string.vd_document_document_tutorial_title));
        setDefaultStringProperty("userinfo", resources.getString(R.string.vd_document_user_info));
        setDefaultStringProperty("continuebuttonicon", "undefined");
        setDefaultStringProperty(INFORMATION_BUTTON_ICON, "undefined");
        setDefaultStringProperty("repeatbuttonicon", "undefined");
        setDefaultStringProperty("closebuttonimage", "undefined");
        setDefaultBooleanProperty(SHOW_USER_HELP, "NO");
        setDefaultDisplayOrientationProperty("screenorientation", "landscape");
        setDefaultDisplayOrientationProperty(TUTORIAL_SCREEN_ORIENTATION, "portrait");
        setDefaultIntegerProperty(MEGAPIXELS, "8");
        setDefaultStringProperty(USER_HELP_DIALOG_MESSAGE, resources.getString(R.string.vd_document_help_dialog_message));
        setDefaultStringProperty(USER_HELP_DIALOG_NEGATIVE_BUTTON, resources.getString(R.string.vd_document_help_dialog_negative_button));
        setDefaultStringProperty(USER_HELP_DIALOG_POSITIVE_BUTTON, resources.getString(R.string.vd_document_help_dialog_positive_button));
        setDefaultStringProperty(USER_HELP_DIALOG_TITLE, resources.getString(R.string.vd_document_help_dialog_title));
        setDefaultStringProperty(USER_HELP_TEXT, resources.getString(R.string.vd_document_user_help_text));
        setDefaultStringProperty("loggerfactoryclass", "");
    }

    public final boolean isOnlyObverse() {
        if (isOnlyObverseBoolean()) {
            return isOnlyObverseBooleanAndTrue();
        }
        return splitOnlyObverse().size() > 0;
    }

    public final boolean isOnlyObverseBooleanAndTrue() {
        if (isOnlyObverseBoolean()) {
            return getBoolean(ONLY_OBVERSE);
        }
        return false;
    }
}
