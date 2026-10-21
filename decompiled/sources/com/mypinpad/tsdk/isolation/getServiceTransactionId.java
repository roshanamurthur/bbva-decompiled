package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.cellscore.web.model.page.components.ComponentDTO;
import com.bbva.component_devicemanager.data.datasource.BlackBoxDataSource;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.login.domain.constants.LoginHelperConstants;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import com.bbva.tohu.android.core.response.backend.aso.AsoResponse;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import com.budiyev.android.codescanner.BarcodeUtils;
import com.esotericsoftware.asm.Opcodes;
import com.google.android.material.internal.ViewUtils;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.mastercard.sonic.StatusCode;
import com.veridas.detect.ImageAnalysisKt;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import mx.openpay.library.data.util.EglobalUtils;
import mx.openpay.library.domain.model.EnvironmentConstants;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0003\bý\u0001\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007R\u0011\u0010\u0005\u001a\u00020\u0002X\u0007¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0007\u001a\u00020\u0002X\u0007¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\bX\u0007¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0002X\u0007¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0011\u0010\n\u001a\u00020\bX\u0007¢\u0006\u0006\n\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001j\u0003\b¿\u0001j\u0003\bÀ\u0001j\u0003\bÁ\u0001j\u0003\bÂ\u0001j\u0003\bÃ\u0001j\u0003\bÄ\u0001j\u0003\bÅ\u0001j\u0003\bÆ\u0001j\u0003\bÇ\u0001j\u0003\bÈ\u0001j\u0003\bÉ\u0001j\u0003\bÊ\u0001j\u0003\bË\u0001j\u0003\bÌ\u0001j\u0003\bÍ\u0001j\u0003\bÎ\u0001j\u0003\bÏ\u0001j\u0003\bÐ\u0001j\u0003\bÑ\u0001j\u0003\bÒ\u0001j\u0003\bÓ\u0001j\u0003\bÔ\u0001j\u0003\bÕ\u0001j\u0003\bÖ\u0001j\u0003\b×\u0001j\u0003\bØ\u0001j\u0003\bÙ\u0001j\u0003\bÚ\u0001j\u0003\bÛ\u0001j\u0003\bÜ\u0001j\u0003\bÝ\u0001j\u0003\bÞ\u0001j\u0003\bß\u0001j\u0003\bà\u0001j\u0003\bá\u0001j\u0003\bâ\u0001j\u0003\bã\u0001j\u0003\bä\u0001j\u0003\bå\u0001j\u0003\bæ\u0001j\u0003\bç\u0001j\u0003\bè\u0001j\u0003\bé\u0001j\u0003\bê\u0001j\u0003\bë\u0001j\u0003\bì\u0001j\u0003\bí\u0001j\u0003\bî\u0001j\u0003\bï\u0001j\u0003\bð\u0001j\u0003\bñ\u0001j\u0003\bò\u0001j\u0003\bó\u0001j\u0003\bô\u0001j\u0003\bõ\u0001j\u0003\bö\u0001j\u0003\b÷\u0001j\u0003\bø\u0001j\u0003\bù\u0001j\u0003\bú\u0001j\u0003\bû\u0001j\u0003\bü\u0001j\u0003\bý\u0001j\u0003\bþ\u0001j\u0003\bÿ\u0001j\u0003\b\u0080\u0002j\u0003\b\u0081\u0002j\u0003\b\u0082\u0002j\u0003\b\u0083\u0002j\u0003\b\u0084\u0002j\u0003\b\u0085\u0002"}, d2 = {"Lcom/mypinpad/tsdk/i/getServiceTransactionId;", "", "", "setCompoundDrawableTintBlendMode", "Ljava/lang/String;", "setOnFocusChangeListener", "setX", "setDividerPadding", "", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "setY", "getNavBarTitleString", "setOnDragListener", "setLayoutAnimation", "setNavigationOnClickListener", "setOnLongClickListener", "setIncludeFontPadding", "setZ", "UiMessageCallbackKtWhenMappings", "notify", "setTextAlignment", "TerminalSdkConfiguration", "setAlwaysDrawnWithCacheEnabled", "setCompoundDrawablePadding", "setTextScaleX", "setOnEditorActionListener", "getAmountFieldTextColor", "initialise", "setChildDivider", "getSuppressed", "setMinHeight", "setImageResource", "setMaxEms", "setLayoutDirection", "TransactionResult", "setViewTranslationCallback", "printStackTrace", "setTextSelectHandleRight", "setAllowClickWhenDisabled", "setCursorVisible", "setAdapter", "setSmoothScrollbarEnabled", "setScroller", "setCacheColorHint", "setEllipsize", "getPreferredLanguage", "getError", "setImageTintMode", "setSelectedChildViewEnabled", "setFilterTouchesWhenObscured", "getType", "setError", "TsdkManualInitializerinit1", "setRendererPriorityPolicy", "setDivider", "setSaveEnabled", "setTitleMarginEnd", "setWebChromeClient", "UiMessageCallbackKt", "setTooltipText", "setHint", "setSpannableFactory", "d1", "setImageState", "isApplicationInitAllowed", "setEmptyView", "CardScheme", "setScrollBarFadeDuration", "getHeight", "setLineBreakStyle", "d2", "ClientCredentialsGrant", "TxnResultCallbackKt", "setMinEms", "setBackgroundTintMode", "bv", "setActivated", "setPadding", "setSubtitle", "getReason", "setNextClusterForwardId", "setClipToPadding", "setAccessibilityLiveRegion", "setOnScrollChangeListener", "getDesignatorAfterValue", "getPinGridButtonBgColor", "k", "setPaintFlags", "TerminalSessionDefaultImpls", "toString", "getPinDigitBgColor", "setSelectionFromTop", "setOnItemSelectedListener", "getDiscoveryTimeout", "setTitleMarginBottom", "setSystemUiVisibility", "setScrollX", "setAccessibilityTraversalAfter", "setScrollY", "setKeepScreenOn", "UiMessageId", "setSecondaryProgressTintMode", "setSelected", "UiMessage", "getNumericCode", "setProgressDrawable", "TsdkManualInitializer", "setSingleLine", "setHttpAuthUsernamePassword", "setIndeterminateTintList", "setOnGroupClickListener", "getDisplaySymbol", "junkify", "setOutlineAmbientShadowColor", "deactivate", "setBackgroundResource", "getStackTrace", "setFocusableInTouchMode", "getCurrencyCustomFormatting", "setMin", "setOnCapturedPointerListener", "CurrencyKt", "addSuppressed", "getApplicationFilteringSelectors", "getView", "setClipBounds", "setTransformationMethod", "getClearButtonText", "setPointerIcon", "TransactionErrorCause", "setOnGroupCollapseListener", "getAmountOther", "setTextDirection", "TerminalErrorCodes", "setAccessibilityTraversalBefore", "setSupportImageTintMode", "setTitle", "setPersistentDrawingCache", "getDetails", "setAlpha", "setScrollCaptureCallback", "SessionActivationFailure", "TransactionApproved", "setChoiceMode", "getTransactionLandscape", "setImportantForContentCapture", "setLineSpacing", "TransactionNotAuthorised", "setTranscriptMode", "getGeneralBgColor", "setStackTrace", "setContentInsetStartWithNavigation", "getNavBarTextColor", "setMultiChoiceModeListener", "setCameraDistance", "setDuplicateParentStateEnabled", "getHoldTime", "TransactionType", "fillInStackTrace", "setFastScrollStyle", "setProgressBackgroundTintMode", "setTouchscreenBlocksFocus", "setPrivateImeOptions", "getPinGridBgColor", "EuropeEndpoint", "notifyAll", "setBaseline", "setOnScrollListener", "setSubtitleTextAppearance", "getTotalElapsedTimeout", "setOverScrollMode", "setOnTouchListener", "setIndeterminateDrawableTiled", GenerateActivationFormCommand.HASH_CODE, "onPinPadLaunchRequest", "getValueQualifier", "setMaxHeight", "setNextFocusDownId", "setScrollBarStyle", "applicationCreated", "setContentInsetsAbsolute", "setChildIndicatorBounds", "getCardScheme", "setDividerHeight", "setFriction", "setBreakStrategy", "setLogoDescription", "setHorizontalScrollBarEnabled", "setImageBitmap", "setSupportBackgroundTintList", "setHapticFeedbackEnabled", "setTextSelectHandle", "setLayerType", "setWebContentsDebuggingEnabled", "setOnReceiveContentListener", "setJustificationMode", "TransactionParameters", "setAutoSizeTextTypeUniformWithPresetSizes", "getTransactionPortrait", "setBottom", "setWidth", "setLines", "setAccessibilityDelegate", "clone", "setOutlineProvider", "setHorizontalScrollbarOverlay", "setScrollIndicators", "setNetworkAvailable", "setColorFilter", "unregisterForContextMenu", "TerminalCallbackKt", "setVisibility", "getDynamicButtonIconTextSpacingDp", "getDisplayExponent", "setIndicatorBounds", "setFilterText", "getPinPadConfiguration", "TerminalSession", "setSoundEffectsEnabled", "setNavigationIcon", "init", "getCode", "setCompoundDrawablesWithIntrinsicBounds", "component31", "component30", "getDiscretionaryTagData", "component32", "HandlePinPadLaunchRequestResult", "getMessage", "component33", "component34", "setLongClickable", "setScrollCaptureHint", "setTransitionGroup", "setIndicatorBoundsRelative", "setLastBaselineToBottomHeight", "setExtractedText", "setBackgroundDrawable", "setEnabled", "setIndeterminateTintBlendMode", "setOnClickListener", "setLinksClickable", "setFreezesText", "component26", "getGatewayId", "component28", "component27", "component29", "setTitleMarginStart", "setOnGroupExpandListener", "setSecondaryProgress", "component25", "wait", "getLocalizedMessage", "onContextItemSelected", "getWidth", "setMotionEventSplittingEnabled", "setTypeface", "setForegroundTintBlendMode", "setImageIcon", "setScrollbarFadingEnabled", "setLayoutMode"}, k = 1, mv = {1, 5, 1})
public final class getServiceTransactionId {
    private static int equals = 1;
    private static int setRight;

    /* JADX INFO: renamed from: getNavBarTitleString, reason: from kotlin metadata */
    public int setY;

    /* JADX INFO: renamed from: setCompoundDrawableTintBlendMode, reason: from kotlin metadata */
    @NotNull
    public String setOnFocusChangeListener;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    public int setX;

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    @NotNull
    public String setDividerPadding;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @NotNull
    public String setCompoundDrawableTintBlendMode;
    public static final getServiceTransactionId setOnDragListener = new getServiceTransactionId(0, 16, "AD", "Andorra", "AND");
    public static final getServiceTransactionId setLayoutAnimation = new getServiceTransactionId(1, 784, "AE", "United Arab Emirates", "ARE");
    public static final getServiceTransactionId setNavigationOnClickListener = new getServiceTransactionId(2, 4, "AF", "Afghanistan", "AFG");
    public static final getServiceTransactionId setOnLongClickListener = new getServiceTransactionId(3, 28, "AG", "Antigua and Barbuda", "ATG");
    public static final getServiceTransactionId setIncludeFontPadding = new getServiceTransactionId(4, 660, "AI", "Anguilla", "AIA");
    public static final getServiceTransactionId setZ = new getServiceTransactionId(5, 8, "AL", "Albania", "ALB");
    public static final getServiceTransactionId UiMessageCallbackKtWhenMappings = new getServiceTransactionId(6, 51, "AM", "Armenia", "ARM");
    private static getServiceTransactionId notify = new getServiceTransactionId(7, 530, "AN", "Netherlands Antilles", "ANT");
    public static final getServiceTransactionId setTextAlignment = new getServiceTransactionId(8, 24, "AO", "Angola", "AGO");
    private static getServiceTransactionId TerminalSdkConfiguration = new getServiceTransactionId(9, 10, "AQ", "Antarctica", "ATA");
    public static final getServiceTransactionId setAlwaysDrawnWithCacheEnabled = new getServiceTransactionId(10, 32, "AR", "Argentina", "ARG");
    public static final getServiceTransactionId setCompoundDrawablePadding = new getServiceTransactionId(11, 16, "AS", "American Samoa", "ASM");
    public static final getServiceTransactionId setTextScaleX = new getServiceTransactionId(12, 40, "AT", "Austria", "AUT");
    public static final getServiceTransactionId setOnEditorActionListener = new getServiceTransactionId(13, 36, "AU", "Australia", "AUS");
    public static final getServiceTransactionId getAmountFieldTextColor = new getServiceTransactionId(14, 533, "AW", "Aruba", "ABW");
    private static getServiceTransactionId initialise = new getServiceTransactionId(15, 248, "AX", "Åland Islands", "ALA");
    public static final getServiceTransactionId setChildDivider = new getServiceTransactionId(16, 31, "AZ", "Azerbaijan", "AZE");
    public static final getServiceTransactionId getSuppressed = new getServiceTransactionId(17, 70, "BA", "Bosnia and Herzegovina", "BIH");
    public static final getServiceTransactionId setMinHeight = new getServiceTransactionId(18, 52, "BB", "Barbados", "BRB");
    public static final getServiceTransactionId setImageResource = new getServiceTransactionId(19, 50, "BD", "Bangladesh", "BGD");
    public static final getServiceTransactionId setMaxEms = new getServiceTransactionId(20, 56, "BE", "Belgium", "BEL");
    public static final getServiceTransactionId setLayoutDirection = new getServiceTransactionId(21, 854, "BF", "Burkina Faso", "BFA");
    public static final getServiceTransactionId TransactionResult = new getServiceTransactionId(22, 100, "BG", "Bulgaria", "BGR");
    public static final getServiceTransactionId setViewTranslationCallback = new getServiceTransactionId(23, 48, "BH", "Bahrain", "BHR");
    public static final getServiceTransactionId printStackTrace = new getServiceTransactionId(24, 108, "BI", "Burundi", "BDI");
    public static final getServiceTransactionId setTextSelectHandleRight = new getServiceTransactionId(25, 204, "BJ", "Benin", "BEN");
    private static getServiceTransactionId setAllowClickWhenDisabled = new getServiceTransactionId(26, 652, "BL", "Saint Barthélemy", "BLM");
    public static final getServiceTransactionId setCursorVisible = new getServiceTransactionId(27, 60, "BM", "Bermuda", "BMU");
    public static final getServiceTransactionId setAdapter = new getServiceTransactionId(28, 96, "BN", "Brunei Darussalam", "BRN");
    public static final getServiceTransactionId setSmoothScrollbarEnabled = new getServiceTransactionId(29, 68, "BO", "Plurinational State of Bolivia", "BOL");
    public static final getServiceTransactionId setScroller = new getServiceTransactionId(30, 535, "BQ", "Bonaire, Sint Eustatius and Saba", "BES");
    public static final getServiceTransactionId setCacheColorHint = new getServiceTransactionId(31, 76, "BR", "Brazil", "BRA");
    public static final getServiceTransactionId setEllipsize = new getServiceTransactionId(32, 44, "BS", "Bahamas", "BHS");
    public static final getServiceTransactionId getPreferredLanguage = new getServiceTransactionId(33, 64, EglobalUtils.CONNECTION_TYPE_BLUETOOTH, "Bhutan", "BTN");
    public static final getServiceTransactionId getError = new getServiceTransactionId(34, 74, "BV", "Bouvet Island", "BVT");
    public static final getServiceTransactionId setImageTintMode = new getServiceTransactionId(35, 72, "BW", "Botswana", "BWA");
    public static final getServiceTransactionId setSelectedChildViewEnabled = new getServiceTransactionId(36, 112, "BY", "Belarus", "BLR");
    public static final getServiceTransactionId setFilterTouchesWhenObscured = new getServiceTransactionId(37, 84, "BZ", "Belize", "BLZ");
    public static final getServiceTransactionId getType = new getServiceTransactionId(38, 124, "CA", "Canada", "CAN");
    public static final getServiceTransactionId setError = new getServiceTransactionId(39, 166, ComponentDTO.CROSS_COMPONENT, "Cocos Islands", "CCK");
    public static final getServiceTransactionId TsdkManualInitializerinit1 = new getServiceTransactionId(40, 180, "CD", "The Democratic Republic of the Congo", "COD");
    public static final getServiceTransactionId setRendererPriorityPolicy = new getServiceTransactionId(41, 140, "CF", "Central African Republic", "CAF");
    private static getServiceTransactionId setDivider = new getServiceTransactionId(42, 178, "CG", "Congo", "COG");
    public static final getServiceTransactionId setSaveEnabled = new getServiceTransactionId(43, 756, "CH", "Switzerland", "CHE");
    public static final getServiceTransactionId setTitleMarginEnd = new getServiceTransactionId(44, BluetoothState.REQUEST_CONNECT_DEVICE, "CI", "Côte d'Ivoire", "CIV");
    public static final getServiceTransactionId setWebChromeClient = new getServiceTransactionId(45, 184, "CK", "Cook Islands", "COK");
    public static final getServiceTransactionId UiMessageCallbackKt = new getServiceTransactionId(46, 152, "CL", "Chile", "CHL");
    public static final getServiceTransactionId setTooltipText = new getServiceTransactionId(47, 120, "CM", "Cameroon", "CMR");
    public static final getServiceTransactionId setHint = new getServiceTransactionId(48, 156, LoginHelperConstants.CLIENT_STATUS_CANCELLED_BY_BUSINESS, "China", "CHN");
    public static final getServiceTransactionId setSpannableFactory = new getServiceTransactionId(49, 170, "CO", "Colombia", "COL");

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final getServiceTransactionId f55959d1 = new getServiceTransactionId(50, 188, "CR", "Costa Rica", "CRI");
    public static final getServiceTransactionId setImageState = new getServiceTransactionId(51, 192, "CU", "Cuba", "CUB");
    public static final getServiceTransactionId isApplicationInitAllowed = new getServiceTransactionId(52, 132, "CV", "Cape Verde", "CPV");
    public static final getServiceTransactionId setEmptyView = new getServiceTransactionId(53, 531, "CW", "Cura/u00E7ao", "CUW");
    public static final getServiceTransactionId CardScheme = new getServiceTransactionId(54, 162, "CX", "Christmas Island", "CXR");
    public static final getServiceTransactionId setScrollBarFadeDuration = new getServiceTransactionId(55, 196, "CY", "Cyprus", "CYP");
    public static final getServiceTransactionId getHeight = new getServiceTransactionId(56, 203, "CZ", "Czech Republic", "CZE");
    public static final getServiceTransactionId setLineBreakStyle = new getServiceTransactionId(57, 276, "DE", "Germany", "DEU");
    public static final getServiceTransactionId d2 = new getServiceTransactionId(58, 262, "DJ", "Djibouti", "DJI");
    public static final getServiceTransactionId ClientCredentialsGrant = new getServiceTransactionId(59, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY, "DK", "Denmark", "DNK");
    public static final getServiceTransactionId TxnResultCallbackKt = new getServiceTransactionId(60, ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE, ComponentDTO.DATA_MANAGER, "Dominica", "DMA");
    public static final getServiceTransactionId setMinEms = new getServiceTransactionId(61, ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND, "DO", "Dominican Republic", "DOM");
    public static final getServiceTransactionId setBackgroundTintMode = new getServiceTransactionId(62, 12, "DZ", "Algeria", "DZA");
    public static final getServiceTransactionId bv = new getServiceTransactionId(63, 218, LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_EC, "Ecuador", "ECU");
    public static final getServiceTransactionId setActivated = new getServiceTransactionId(64, 233, "EE", "Estonia", "EST");
    public static final getServiceTransactionId setPadding = new getServiceTransactionId(65, 818, "EG", "Egypt", "EGY");
    private static getServiceTransactionId setSubtitle = new getServiceTransactionId(66, 732, "EH", "Western Sahara", "ESH");
    public static final getServiceTransactionId getReason = new getServiceTransactionId(67, 232, "ER", "Eritrea", "ERI");
    public static final getServiceTransactionId setNextClusterForwardId = new getServiceTransactionId(68, 724, "ES", "Spain", "ESP");
    public static final getServiceTransactionId setClipToPadding = new getServiceTransactionId(69, 231, "ET", "Ethiopia", "ETH");
    public static final getServiceTransactionId setAccessibilityLiveRegion = new getServiceTransactionId(70, 246, "FI", "Finland", "FIN");
    public static final getServiceTransactionId setOnScrollChangeListener = new getServiceTransactionId(71, 242, "FJ", "Fiji", "FJI");
    public static final getServiceTransactionId getDesignatorAfterValue = new getServiceTransactionId(72, 238, "FK", "Falkland Islands", "FLK");
    public static final getServiceTransactionId getPinGridButtonBgColor = new getServiceTransactionId(73, 583, "FM", "Federated States of Micronesia", "FSM");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final getServiceTransactionId f55960k = new getServiceTransactionId(74, 234, "FO", "Faroe Islands", "FRO");
    public static final getServiceTransactionId setPaintFlags = new getServiceTransactionId(75, 250, "FR", "France", "FRA");
    public static final getServiceTransactionId TerminalSessionDefaultImpls = new getServiceTransactionId(76, 266, "GA", "Gabon", "GAB");
    public static final getServiceTransactionId toString = new getServiceTransactionId(77, 826, BlackBoxDataSource.GIGA_BYTE, "United Kingdom", "GBR");
    public static final getServiceTransactionId getPinDigitBgColor = new getServiceTransactionId(78, 308, "GD", "Grenada", "GRD");
    public static final getServiceTransactionId setSelectionFromTop = new getServiceTransactionId(79, 268, "GE", "Georgia", "GEO");
    private static getServiceTransactionId setOnItemSelectedListener = new getServiceTransactionId(80, 254, "GF", "French Guiana", "GUF");
    private static getServiceTransactionId getDiscoveryTimeout = new getServiceTransactionId(81, 831, "GG", "Guemsey", "GGY");
    public static final getServiceTransactionId setTitleMarginBottom = new getServiceTransactionId(82, 288, "GH", "Ghana", "GHA");
    public static final getServiceTransactionId setSystemUiVisibility = new getServiceTransactionId(83, 292, "GI", "Gibraltar", "GIB");
    public static final getServiceTransactionId setScrollX = new getServiceTransactionId(84, 304, "GL", "Greenland", "GRL");
    public static final getServiceTransactionId setAccessibilityTraversalAfter = new getServiceTransactionId(85, BarcodeUtils.ROTATION_270, "GM", "Gambia", "GMB");
    public static final getServiceTransactionId setScrollY = new getServiceTransactionId(86, 324, "GN", "Guinea", "GIN");
    private static getServiceTransactionId setKeepScreenOn = new getServiceTransactionId(87, 312, "GP", "Guadeloupe", "GLP");
    public static final getServiceTransactionId UiMessageId = new getServiceTransactionId(88, 226, "GQ", "Equatorial Guinea", "GNQ");
    public static final getServiceTransactionId setSecondaryProgressTintMode = new getServiceTransactionId(89, 300, "GR", "Greece", "GRC");
    public static final getServiceTransactionId setSelected = new getServiceTransactionId(90, 239, "GS", "South Georgia and the South Sandwich Islands", "SGS");
    public static final getServiceTransactionId UiMessage = new getServiceTransactionId(91, 320, "GT", "Guatemala", "GTM");
    public static final getServiceTransactionId getNumericCode = new getServiceTransactionId(92, TypedValues.AttributesType.TYPE_PATH_ROTATE, "GU", "Guam", "GUM");
    public static final getServiceTransactionId setProgressDrawable = new getServiceTransactionId(93, 624, "GW", "Guinea-Bissau", "GNB");
    public static final getServiceTransactionId TsdkManualInitializer = new getServiceTransactionId(94, 328, "GY", "Guyana", "GUY");
    public static final getServiceTransactionId setSingleLine = new getServiceTransactionId(95, 344, "HK", "Hong Kong", "HKG");
    public static final getServiceTransactionId setHttpAuthUsernamePassword = new getServiceTransactionId(96, 334, "HM", "Heard Island and McDonald Islands", "HMD");
    public static final getServiceTransactionId setIndeterminateTintList = new getServiceTransactionId(97, 340, "HN", "Honduras", "HND");
    public static final getServiceTransactionId setOnGroupClickListener = new getServiceTransactionId(98, Opcodes.ATHROW, "HR", "Croatia", "HRV");
    public static final getServiceTransactionId getDisplaySymbol = new getServiceTransactionId(99, 332, "HT", "Haiti", "HTI");
    public static final getServiceTransactionId junkify = new getServiceTransactionId(100, 348, "HU", "Hungary", "HUN");
    public static final getServiceTransactionId setOutlineAmbientShadowColor = new getServiceTransactionId(101, 360, "ID", "Indonesia", "IDN");
    public static final getServiceTransactionId deactivate = new getServiceTransactionId(102, 372, "IE", "Ireland", "IRL");
    public static final getServiceTransactionId setBackgroundResource = new getServiceTransactionId(103, 376, "IL", "Israel", "ISR");
    public static final getServiceTransactionId getStackTrace = new getServiceTransactionId(104, 833, "IM", "Isle of Man", "IMN");
    public static final getServiceTransactionId setFocusableInTouchMode = new getServiceTransactionId(105, 356, "IN", "India", "IND");
    public static final getServiceTransactionId getCurrencyCustomFormatting = new getServiceTransactionId(106, 86, "IO", "British Indian Ocean Territory", "IOT");
    public static final getServiceTransactionId setMin = new getServiceTransactionId(107, 368, "IQ", "Iraq", "IRQ");
    public static final getServiceTransactionId setOnCapturedPointerListener = new getServiceTransactionId(108, 364, "IR", "Islamic Republic of Iran", "IRN");
    public static final getServiceTransactionId CurrencyKt = new getServiceTransactionId(109, ResultCode.ERROR_CONN_SSL_HANDSHAKE, "IS", "Iceland", "ISL");
    public static final getServiceTransactionId addSuppressed = new getServiceTransactionId(110, 380, "IT", "Italy", "ITA");
    private static getServiceTransactionId getApplicationFilteringSelectors = new getServiceTransactionId(111, 832, "JE", "Jersey", "JEY");
    public static final getServiceTransactionId getView = new getServiceTransactionId(112, 388, "JM", "Jamaica", "JAM");
    public static final getServiceTransactionId setClipBounds = new getServiceTransactionId(113, 400, "JO", "Jordan", "JOR");
    public static final getServiceTransactionId setTransformationMethod = new getServiceTransactionId(114, 392, "JP", "Japan", "JPN");
    public static final getServiceTransactionId getClearButtonText = new getServiceTransactionId(115, ResultCode.ERROR_REPO_CORRUPT, "KE", "Kenya", "KEN");
    public static final getServiceTransactionId setPointerIcon = new getServiceTransactionId(116, 417, ExpandedProductParsedResult.KILOGRAM, "Kyrgyzstan", "KGZ");
    public static final getServiceTransactionId TransactionErrorCause = new getServiceTransactionId(117, 116, "KH", "Cambodia", "KHM");
    public static final getServiceTransactionId setOnGroupCollapseListener = new getServiceTransactionId(118, 296, "KI", "Kiribati", "KIR");
    public static final getServiceTransactionId getAmountOther = new getServiceTransactionId(119, 174, "KM", "Comoros", "COM");
    public static final getServiceTransactionId setTextDirection = new getServiceTransactionId(120, 659, "KN", "Saint Kitts and Nevis", "KNA");
    public static final getServiceTransactionId TerminalErrorCodes = new getServiceTransactionId(121, Constant.ERROR_CODE_408, "KP", "Democratic People's Republic of Korea", "PRK");
    public static final getServiceTransactionId setAccessibilityTraversalBefore = new getServiceTransactionId(122, 410, "KR", "Republic of Korea", "KOR");
    public static final getServiceTransactionId setSupportImageTintMode = new getServiceTransactionId(123, 414, "KW", "Kuwait", "KWT");
    public static final getServiceTransactionId setTitle = new getServiceTransactionId(124, 136, "KY", "Cayman Islands", "CYM");
    public static final getServiceTransactionId setPersistentDrawingCache = new getServiceTransactionId(125, 398, "KZ", "Kazakhstan", "KAZ");
    public static final getServiceTransactionId getDetails = new getServiceTransactionId(126, 418, "LA", "Lao People's Democratic Republic", "LAO");
    public static final getServiceTransactionId setAlpha = new getServiceTransactionId(127, TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, ExpandedProductParsedResult.POUND, "Lebanon", "LBN");
    public static final getServiceTransactionId setScrollCaptureCallback = new getServiceTransactionId(128, 662, "LC", "Saint Lucia", "LCA");
    public static final getServiceTransactionId SessionActivationFailure = new getServiceTransactionId(129, 438, "LI", "Liechtenstein", "LIE");
    public static final getServiceTransactionId TransactionApproved = new getServiceTransactionId(130, 144, "LK", "Sri Lanka", "LKA");
    public static final getServiceTransactionId setChoiceMode = new getServiceTransactionId(131, LoginHelperConstants.MAINTENANCE_RESPONSE_CODE, "LR", "Liberia", "LBR");
    public static final getServiceTransactionId getTransactionLandscape = new getServiceTransactionId(132, 426, "LS", "Lesotho", "LSO");
    public static final getServiceTransactionId setImportantForContentCapture = new getServiceTransactionId(133, 440, "LT", "Lithuania", "LTU");
    public static final getServiceTransactionId setLineSpacing = new getServiceTransactionId(134, 442, "LU", "Luxembourg", "LUX");
    public static final getServiceTransactionId TransactionNotAuthorised = new getServiceTransactionId(135, AsoResponse.HTTP_ARMADILLO_OTP_NEEDED, "LV", "Latvia", "LVA");
    public static final getServiceTransactionId setTranscriptMode = new getServiceTransactionId(136, 434, "LY", "Libya", "LBY");
    public static final getServiceTransactionId getGeneralBgColor = new getServiceTransactionId(137, 504, "MA", "Morocco", "MAR");
    public static final getServiceTransactionId setStackTrace = new getServiceTransactionId(138, 492, "MC", "Monaco", "MCO");
    public static final getServiceTransactionId setContentInsetStartWithNavigation = new getServiceTransactionId(139, 498, "MD", "Republic of Moldova", "MDA");
    public static final getServiceTransactionId getNavBarTextColor = new getServiceTransactionId(140, 499, "ME", "Montenegro", "MNE");
    private static getServiceTransactionId setMultiChoiceModeListener = new getServiceTransactionId(141, 663, "MF", "Saint Martin", "MAF");
    public static final getServiceTransactionId setCameraDistance = new getServiceTransactionId(142, 450, AuthConstants.FACIAL_AUTH_CHANNEL, "Madagascar", "MDG");
    public static final getServiceTransactionId setDuplicateParentStateEnabled = new getServiceTransactionId(143, 584, "MH", "Marshall Islands", "MHL");
    public static final getServiceTransactionId getHoldTime = new getServiceTransactionId(144, 807, "MK", "The former Yugoslav Republic of Macedonia", "MKD");
    public static final getServiceTransactionId TransactionType = new getServiceTransactionId(145, 466, "ML", "Mali", "MLI");
    public static final getServiceTransactionId fillInStackTrace = new getServiceTransactionId(146, 104, "MM", "Myanmar", "MMR");
    public static final getServiceTransactionId setFastScrollStyle = new getServiceTransactionId(147, 496, "MN", "Mongolia", "MNG");
    public static final getServiceTransactionId setProgressBackgroundTintMode = new getServiceTransactionId(148, 492, "MO", "Macao", "MCO");
    public static final getServiceTransactionId setTouchscreenBlocksFocus = new getServiceTransactionId(149, 580, "MP", "Northern Mariana Islands", "MNP");
    private static getServiceTransactionId setPrivateImeOptions = new getServiceTransactionId(150, 474, "MQ", "Martinique", "MTQ");
    public static final getServiceTransactionId getPinGridBgColor = new getServiceTransactionId(151, 478, "MR", "Mauritania", "MRT");
    public static final getServiceTransactionId EuropeEndpoint = new getServiceTransactionId(152, 500, "MS", "Montserrat", "MSR");
    public static final getServiceTransactionId notifyAll = new getServiceTransactionId(153, 470, "MT", "Malta", "MLT");
    public static final getServiceTransactionId setBaseline = new getServiceTransactionId(154, 480, "MU", "Mauritius", "MUS");
    public static final getServiceTransactionId setOnScrollListener = new getServiceTransactionId(155, 462, "MV", "Maldives", "MDV");
    public static final getServiceTransactionId setSubtitleTextAppearance = new getServiceTransactionId(156, 454, "MW", "Malawi", "MWI");
    public static final getServiceTransactionId getTotalElapsedTimeout = new getServiceTransactionId(157, 484, "MX", "Mexico", Constant.MEX_ISO_CODE);
    public static final getServiceTransactionId setOverScrollMode = new getServiceTransactionId(158, 458, "MY", "Malaysia", "MYS");
    public static final getServiceTransactionId setOnTouchListener = new getServiceTransactionId(159, TypedValues.PositionType.TYPE_CURVE_FIT, "MZ", "Mozambique", "MOZ");
    public static final getServiceTransactionId setIndeterminateDrawableTiled = new getServiceTransactionId(160, LibMCryptConstants.IND_HEX_SEGMENTO2, "NA", "Namibia", "NAM");
    public static final getServiceTransactionId hashCode = new getServiceTransactionId(161, 540, "NC", "New Caledonia", "NCL");
    public static final getServiceTransactionId onPinPadLaunchRequest = new getServiceTransactionId(162, 562, LoginHelperConstants.CLIENT_STATUS_NEW_CLIENT, "Niger", "NER");
    public static final getServiceTransactionId getValueQualifier = new getServiceTransactionId(163, 574, "NF", "Norfolk Island", "NFK");
    public static final getServiceTransactionId setMaxHeight = new getServiceTransactionId(164, 566, "NG", "Nigeria", "NGA");
    public static final getServiceTransactionId setNextFocusDownId = new getServiceTransactionId(165, 558, "NI", "Nicaragua", "NIC");
    public static final getServiceTransactionId setScrollBarStyle = new getServiceTransactionId(166, 528, "NL", "Netherlands", "NLD");
    public static final getServiceTransactionId applicationCreated = new getServiceTransactionId(167, 578, "NO", "Norway", "NOR");
    public static final getServiceTransactionId setContentInsetsAbsolute = new getServiceTransactionId(168, 524, "NP", "Nepal", "NPL");
    public static final getServiceTransactionId setChildIndicatorBounds = new getServiceTransactionId(169, 520, "NR", "Nauru", "NRU");
    public static final getServiceTransactionId getCardScheme = new getServiceTransactionId(170, 570, "NU", "Niue", "NIU");
    public static final getServiceTransactionId setDividerHeight = new getServiceTransactionId(171, 554, "NZ", "New Zealand", "NZL");
    public static final getServiceTransactionId setFriction = new getServiceTransactionId(172, 512, "OM", "Oman", "OMN");
    public static final getServiceTransactionId setBreakStrategy = new getServiceTransactionId(173, 591, LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_PA, "Panama", "PAN");
    public static final getServiceTransactionId setLogoDescription = new getServiceTransactionId(174, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR, LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_PE, "Peru", "PER");
    public static final getServiceTransactionId setHorizontalScrollBarEnabled = new getServiceTransactionId(175, 258, "PF", "French Polynesia", "PYF");
    public static final getServiceTransactionId setImageBitmap = new getServiceTransactionId(176, 598, "PG", "Papua New Guinea", "PNG");
    public static final getServiceTransactionId setSupportBackgroundTintList = new getServiceTransactionId(177, TypedValues.MotionType.TYPE_DRAW_PATH, "PH", "Philippines", "PHL");
    public static final getServiceTransactionId setHapticFeedbackEnabled = new getServiceTransactionId(178, 586, "PK", "Pakistan", "PAK");
    public static final getServiceTransactionId setTextSelectHandle = new getServiceTransactionId(179, 616, "PL", "Poland", "POL");
    private static getServiceTransactionId setLayerType = new getServiceTransactionId(180, 666, "PM", "Saint Pierre and Miquelon", "SPM");
    public static final getServiceTransactionId setWebContentsDebuggingEnabled = new getServiceTransactionId(181, TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID, "PN", "Pitcairn", "PCN");
    public static final getServiceTransactionId setOnReceiveContentListener = new getServiceTransactionId(182, 630, "PR", "Puerto Rico", "PRI");
    public static final getServiceTransactionId setJustificationMode = new getServiceTransactionId(183, 275, LoginHelperConstants.CLIENT_STATUS_PENDING_TO_ACTIVATE_PS, "Occupied Palestinian Territory", "PSE");
    public static final getServiceTransactionId TransactionParameters = new getServiceTransactionId(184, 620, "PT", "Portugal", "PRT");
    public static final getServiceTransactionId setAutoSizeTextTypeUniformWithPresetSizes = new getServiceTransactionId(185, 585, "PW", "Palau", "PLW");
    public static final getServiceTransactionId getTransactionPortrait = new getServiceTransactionId(186, 600, "PY", "Paraguay", "PRY");
    public static final getServiceTransactionId setBottom = new getServiceTransactionId(187, 634, EnvironmentConstants.QA_ENV, "Qatar", "QAT");
    private static getServiceTransactionId setWidth = new getServiceTransactionId(188, 638, "RE", "Réunion", "REU");
    public static final getServiceTransactionId setLines = new getServiceTransactionId(189, 642, "RO", "Romania", "ROU");
    public static final getServiceTransactionId setAccessibilityDelegate = new getServiceTransactionId(190, 688, "RS", "Serbia", "SRB");
    public static final getServiceTransactionId clone = new getServiceTransactionId(Opcodes.ATHROW, 643, "RU", "Russian Federation", "RUS");
    public static final getServiceTransactionId setOutlineProvider = new getServiceTransactionId(192, 646, "RW", "Rwanda", "RWA");
    public static final getServiceTransactionId setHorizontalScrollbarOverlay = new getServiceTransactionId(Opcodes.INSTANCEOF, 682, "SA", "Saudi Arabia", "SAU");
    public static final getServiceTransactionId setScrollIndicators = new getServiceTransactionId(Opcodes.MONITORENTER, 90, "SB", "Solomon Islands", "SLB");
    public static final getServiceTransactionId setNetworkAvailable = new getServiceTransactionId(Opcodes.MONITOREXIT, 690, ReplenishLogic.SC_PARAM_KEY, "Seychelles", "SYC");
    public static final getServiceTransactionId setColorFilter = new getServiceTransactionId(196, 729, "SD", "Sudan", "SDN");
    public static final getServiceTransactionId unregisterForContextMenu = new getServiceTransactionId(Opcodes.MULTIANEWARRAY, 752, "SE", "Sweden", "SWE");
    public static final getServiceTransactionId TerminalCallbackKt = new getServiceTransactionId(Opcodes.IFNULL, 702, "SG", "Singapore", "SGP");
    public static final getServiceTransactionId setVisibility = new getServiceTransactionId(Opcodes.IFNONNULL, 654, "SH", "Saint Helena, Ascension and Tristan da Cunha", "SHN");
    public static final getServiceTransactionId getDynamicButtonIconTextSpacingDp = new getServiceTransactionId(200, TypedValues.TransitionType.TYPE_INTERPOLATOR, "SI", "Slovenia", "SVN");
    public static final getServiceTransactionId getDisplayExponent = new getServiceTransactionId(201, 744, "SJ", "Svalbard and Jan Mayen", "SJM");
    public static final getServiceTransactionId setIndicatorBounds = new getServiceTransactionId(202, ResultCode.ERROR_STRENGTH_SUITENOWHITE, "SK", "Slovakia", "SVK");
    public static final getServiceTransactionId setFilterText = new getServiceTransactionId(203, 694, "SL", "Sierra Leone", "SLE");
    public static final getServiceTransactionId getPinPadConfiguration = new getServiceTransactionId(204, 674, "SM", "San Marino", "SMR");
    public static final getServiceTransactionId TerminalSession = new getServiceTransactionId(205, 686, "SN", "Senegal", "SEN");
    public static final getServiceTransactionId setSoundEffectsEnabled = new getServiceTransactionId(206, TypedValues.TransitionType.TYPE_STAGGERED, "SO", "Somalia", "SOM");
    public static final getServiceTransactionId setNavigationIcon = new getServiceTransactionId(207, 740, "SR", "Suriname", "SUR");
    public static final getServiceTransactionId init = new getServiceTransactionId(ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY, 728, "SS", "South Sudan", "SSD");
    public static final getServiceTransactionId getCode = new getServiceTransactionId(ErrorCodes.ERR_CRY_BAD_PROTO, 678, "ST", "Sao Tome and Principe", "STP");
    public static final getServiceTransactionId setCompoundDrawablesWithIntrinsicBounds = new getServiceTransactionId(ErrorCodes.ERR_CRY_IO_PROPERTIES, 222, "SV", "El Salvador", "SLV");
    public static final getServiceTransactionId component31 = new getServiceTransactionId(211, 534, "SX", "Sint Maarten", "SXM");
    public static final getServiceTransactionId component30 = new getServiceTransactionId(ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE, 760, "SY", "Syrian Arab Republic", "SYR");
    public static final getServiceTransactionId getDiscretionaryTagData = new getServiceTransactionId(ErrorCodes.ERR_CRY_BAD_PIN_SIZE, 748, "SZ", "Swaziland", "SWZ");
    public static final getServiceTransactionId component32 = new getServiceTransactionId(ErrorCodes.ERR_CRY_PROPERTIES_KEYTAG_NOT_FOUND, 796, "TC", "Turks and Caicos Islands", "TCA");
    public static final getServiceTransactionId HandlePinPadLaunchRequestResult = new getServiceTransactionId(ErrorCodes.ERR_CRY_BAD_REC_RSA_PRIKEY, 148, "TD", "Chad", "TCD");
    private static getServiceTransactionId getMessage = new getServiceTransactionId(216, 260, "TF", "French Southern Territories", "ATF");
    public static final getServiceTransactionId component33 = new getServiceTransactionId(217, ViewUtils.EDGE_TO_EDGE_FLAGS, "TG", "Togo", "TGO");
    public static final getServiceTransactionId component34 = new getServiceTransactionId(218, 764, "TH", "Thailand", "THA");
    public static final getServiceTransactionId setLongClickable = new getServiceTransactionId(219, 762, "TJ", "Tajikistan", "TJK");
    public static final getServiceTransactionId setScrollCaptureHint = new getServiceTransactionId(220, 772, "TK", "Tokelau", "TKL");
    public static final getServiceTransactionId setTransitionGroup = new getServiceTransactionId(221, 626, "TL", "Timor-Leste", "TLS");
    public static final getServiceTransactionId setIndicatorBoundsRelative = new getServiceTransactionId(222, 795, "TM", "Turkmenistan", "TKM");
    public static final getServiceTransactionId setLastBaselineToBottomHeight = new getServiceTransactionId(223, 788, "TN", "Tunisia", "TUN");
    public static final getServiceTransactionId setExtractedText = new getServiceTransactionId(224, 776, "TO", "Tonga", "TON");
    public static final getServiceTransactionId setBackgroundDrawable = new getServiceTransactionId(225, 792, "TR", "Turkey", "TUR");
    public static final getServiceTransactionId setEnabled = new getServiceTransactionId(226, 780, "TT", "Trinidad and Tobago", "TTO");
    public static final getServiceTransactionId setIndeterminateTintBlendMode = new getServiceTransactionId(227, 798, "TV", "Tuvalu", "TUV");
    public static final getServiceTransactionId setOnClickListener = new getServiceTransactionId(228, 158, "TW", "Taiwan, Province of China", "TWN");
    public static final getServiceTransactionId setLinksClickable = new getServiceTransactionId(229, 834, "TZ", "United Republic of Tanzania", "TZA");
    public static final getServiceTransactionId setFreezesText = new getServiceTransactionId(ImageAnalysisKt.OVER_EXPOSED_THRESHOLD, ResultCode.ERROR_UPDATER_IO, "UA", "Ukraine", "UKR");
    public static final getServiceTransactionId component26 = new getServiceTransactionId(231, StatusCode.SUCCESS, "UG", "Uganda", "UGA");
    private static getServiceTransactionId getGatewayId = new getServiceTransactionId(232, 581, "UM", "United States Minor Outlying Islands", "UMI");
    public static final getServiceTransactionId component28 = new getServiceTransactionId(233, 840, "US", "United States", "USA");
    public static final getServiceTransactionId component27 = new getServiceTransactionId(234, 858, "UY", "Uruguay", "URY");
    public static final getServiceTransactionId component29 = new getServiceTransactionId(235, 860, "UZ", "Uzbekistan", "UZB");
    public static final getServiceTransactionId setTitleMarginStart = new getServiceTransactionId(236, 336, "VA", "Holy See", "VAT");
    public static final getServiceTransactionId setOnGroupExpandListener = new getServiceTransactionId(237, 670, "VC", "Saint Vincent and the Grenadines", "VCT");
    public static final getServiceTransactionId setSecondaryProgress = new getServiceTransactionId(238, 862, "VE", "Bolivarian Republic of Venezuela", "VEN");
    public static final getServiceTransactionId component25 = new getServiceTransactionId(239, 92, "VG", "British Virgin Islands", "VGB");
    public static final getServiceTransactionId wait = new getServiceTransactionId(240, 850, "VI", "Virgin Islands, U.S.", "VIR");
    public static final getServiceTransactionId getLocalizedMessage = new getServiceTransactionId(241, TypedValues.TransitionType.TYPE_AUTO_TRANSITION, "VN", "Viet Nam", "VNM");
    public static final getServiceTransactionId onContextItemSelected = new getServiceTransactionId(242, 548, "VU", "Vanuatu", "VUT");
    public static final getServiceTransactionId getWidth = new getServiceTransactionId(243, 876, "WF", "Wallis and Futuna", "WLF");
    public static final getServiceTransactionId setMotionEventSplittingEnabled = new getServiceTransactionId(244, 882, "WS", "Samoa", "WSM");
    public static final getServiceTransactionId setTypeface = new getServiceTransactionId(245, 887, "YE", "Yemen", "YEM");
    private static getServiceTransactionId setForegroundTintBlendMode = new getServiceTransactionId(246, 175, "YT", "Mayotte", "MYT");
    public static final getServiceTransactionId setImageIcon = new getServiceTransactionId(247, 710, "ZA", "South Africa", "ZAF");
    public static final getServiceTransactionId setScrollbarFadingEnabled = new getServiceTransactionId(248, 894, "ZM", "Zambia", "ZMB");
    public static final getServiceTransactionId setLayoutMode = new getServiceTransactionId(249, 716, "ZW", "Zimbabwe", "ZWE");
    private static final /* synthetic */ getServiceTransactionId[] setScaleX = a();

    static {
        int i10 = equals;
        int i11 = i10 & 19;
        int i12 = -(-(i10 | 19));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        setRight = i13 % 128;
        int i14 = i13 % 2;
    }

    public getServiceTransactionId(int i10, int i11, String str, String str2, String str3) {
        super(str, i10);
        this.setOnFocusChangeListener = str2;
        this.setDividerPadding = str3;
        this.setX = i11;
        this.setCompoundDrawableTintBlendMode = name();
        this.setY = this.setX;
    }

    public static final /* synthetic */ getServiceTransactionId[] a() {
        int i10 = equals;
        int i11 = i10 + 125;
        setRight = i11 % 128;
        int i12 = i11 % 2;
        getServiceTransactionId[] getservicetransactionidArr = {setOnDragListener, setLayoutAnimation, setNavigationOnClickListener, setOnLongClickListener, setIncludeFontPadding, setZ, UiMessageCallbackKtWhenMappings, notify, setTextAlignment, TerminalSdkConfiguration, setAlwaysDrawnWithCacheEnabled, setCompoundDrawablePadding, setTextScaleX, setOnEditorActionListener, getAmountFieldTextColor, initialise, setChildDivider, getSuppressed, setMinHeight, setImageResource, setMaxEms, setLayoutDirection, TransactionResult, setViewTranslationCallback, printStackTrace, setTextSelectHandleRight, setAllowClickWhenDisabled, setCursorVisible, setAdapter, setSmoothScrollbarEnabled, setScroller, setCacheColorHint, setEllipsize, getPreferredLanguage, getError, setImageTintMode, setSelectedChildViewEnabled, setFilterTouchesWhenObscured, getType, setError, TsdkManualInitializerinit1, setRendererPriorityPolicy, setDivider, setSaveEnabled, setTitleMarginEnd, setWebChromeClient, UiMessageCallbackKt, setTooltipText, setHint, setSpannableFactory, f55959d1, setImageState, isApplicationInitAllowed, setEmptyView, CardScheme, setScrollBarFadeDuration, getHeight, setLineBreakStyle, d2, ClientCredentialsGrant, TxnResultCallbackKt, setMinEms, setBackgroundTintMode, bv, setActivated, setPadding, setSubtitle, getReason, setNextClusterForwardId, setClipToPadding, setAccessibilityLiveRegion, setOnScrollChangeListener, getDesignatorAfterValue, getPinGridButtonBgColor, f55960k, setPaintFlags, TerminalSessionDefaultImpls, toString, getPinDigitBgColor, setSelectionFromTop, setOnItemSelectedListener, getDiscoveryTimeout, setTitleMarginBottom, setSystemUiVisibility, setScrollX, setAccessibilityTraversalAfter, setScrollY, setKeepScreenOn, UiMessageId, setSecondaryProgressTintMode, setSelected, UiMessage, getNumericCode, setProgressDrawable, TsdkManualInitializer, setSingleLine, setHttpAuthUsernamePassword, setIndeterminateTintList, setOnGroupClickListener, getDisplaySymbol, junkify, setOutlineAmbientShadowColor, deactivate, setBackgroundResource, getStackTrace, setFocusableInTouchMode, getCurrencyCustomFormatting, setMin, setOnCapturedPointerListener, CurrencyKt, addSuppressed, getApplicationFilteringSelectors, getView, setClipBounds, setTransformationMethod, getClearButtonText, setPointerIcon, TransactionErrorCause, setOnGroupCollapseListener, getAmountOther, setTextDirection, TerminalErrorCodes, setAccessibilityTraversalBefore, setSupportImageTintMode, setTitle, setPersistentDrawingCache, getDetails, setAlpha, setScrollCaptureCallback, SessionActivationFailure, TransactionApproved, setChoiceMode, getTransactionLandscape, setImportantForContentCapture, setLineSpacing, TransactionNotAuthorised, setTranscriptMode, getGeneralBgColor, setStackTrace, setContentInsetStartWithNavigation, getNavBarTextColor, setMultiChoiceModeListener, setCameraDistance, setDuplicateParentStateEnabled, getHoldTime, TransactionType, fillInStackTrace, setFastScrollStyle, setProgressBackgroundTintMode, setTouchscreenBlocksFocus, setPrivateImeOptions, getPinGridBgColor, EuropeEndpoint, notifyAll, setBaseline, setOnScrollListener, setSubtitleTextAppearance, getTotalElapsedTimeout, setOverScrollMode, setOnTouchListener, setIndeterminateDrawableTiled, hashCode, onPinPadLaunchRequest, getValueQualifier, setMaxHeight, setNextFocusDownId, setScrollBarStyle, applicationCreated, setContentInsetsAbsolute, setChildIndicatorBounds, getCardScheme, setDividerHeight, setFriction, setBreakStrategy, setLogoDescription, setHorizontalScrollBarEnabled, setImageBitmap, setSupportBackgroundTintList, setHapticFeedbackEnabled, setTextSelectHandle, setLayerType, setWebContentsDebuggingEnabled, setOnReceiveContentListener, setJustificationMode, TransactionParameters, setAutoSizeTextTypeUniformWithPresetSizes, getTransactionPortrait, setBottom, setWidth, setLines, setAccessibilityDelegate, clone, setOutlineProvider, setHorizontalScrollbarOverlay, setScrollIndicators, setNetworkAvailable, setColorFilter, unregisterForContextMenu, TerminalCallbackKt, setVisibility, getDynamicButtonIconTextSpacingDp, getDisplayExponent, setIndicatorBounds, setFilterText, getPinPadConfiguration, TerminalSession, setSoundEffectsEnabled, setNavigationIcon, init, getCode, setCompoundDrawablesWithIntrinsicBounds, component31, component30, getDiscretionaryTagData, component32, HandlePinPadLaunchRequestResult, getMessage, component33, component34, setLongClickable, setScrollCaptureHint, setTransitionGroup, setIndicatorBoundsRelative, setLastBaselineToBottomHeight, setExtractedText, setBackgroundDrawable, setEnabled, setIndeterminateTintBlendMode, setOnClickListener, setLinksClickable, setFreezesText, component26, getGatewayId, component28, component27, component29, setTitleMarginStart, setOnGroupExpandListener, setSecondaryProgress, component25, wait, getLocalizedMessage, onContextItemSelected, getWidth, setMotionEventSplittingEnabled, setTypeface, setForegroundTintBlendMode, setImageIcon, setScrollbarFadingEnabled, setLayoutMode};
        int i13 = i10 & 39;
        int i14 = (i10 ^ 39) | i13;
        int i15 = (i13 & i14) + (i14 | i13);
        setRight = i15 % 128;
        if (i15 % 2 == 0) {
            return getservicetransactionidArr;
        }
        throw null;
    }

    public static getServiceTransactionId valueOf(String str) {
        int i10 = setRight;
        int i11 = (((i10 | 124) << 1) - (i10 ^ 124)) - 1;
        equals = i11 % 128;
        if (i11 % 2 != 0) {
            return (getServiceTransactionId) Enum.valueOf(getServiceTransactionId.class, str);
        }
        Enum.valueOf(getServiceTransactionId.class, str);
        throw null;
    }

    public static getServiceTransactionId[] values() {
        int i10 = setRight;
        int i11 = i10 & 45;
        int i12 = ((i10 ^ 45) | i11) << 1;
        int i13 = -((i10 | 45) & (~i11));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        equals = i14 % 128;
        int i15 = i14 % 2;
        getServiceTransactionId[] getservicetransactionidArr = (getServiceTransactionId[]) setScaleX.clone();
        int i16 = equals;
        int i17 = i16 ^ 63;
        int i18 = -(-((i16 & 63) << 1));
        int i19 = (i17 & i18) + (i18 | i17);
        setRight = i19 % 128;
        int i20 = i19 % 2;
        return getservicetransactionidArr;
    }
}
