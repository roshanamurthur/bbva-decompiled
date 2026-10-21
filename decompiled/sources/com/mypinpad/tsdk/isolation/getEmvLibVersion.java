package com.mypinpad.tsdk.isolation;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.core.response.backend.aso.AsoResponse;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.data.util.EglobalUtils;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0003\b¯\u0001\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bR\u0011\u0010\u0003\u001a\u00020\u0002X\u0007¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\b\nj\u0002\bAj\u0002\b\bj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001"}, d2 = {"Lcom/mypinpad/tsdk/i/getEmvLibVersion;", "", "", "setDividerPadding", "Ljava/lang/String;", "", "setNavigationOnClickListener", "[B", "setX", "()[B", "setCompoundDrawableTintBlendMode", "setY", "setIncludeFontPadding", "setTextAlignment", "setZ", "setAlwaysDrawnWithCacheEnabled", "UiMessageCallbackKtWhenMappings", "getAmountFieldTextColor", "setCompoundDrawablePadding", "setOnEditorActionListener", "setTextScaleX", "setChildDivider", "setMaxEms", "setLayoutDirection", "setMinHeight", "getSuppressed", "setImageResource", "setViewTranslationCallback", "TransactionResult", "setCursorVisible", "setTextSelectHandleRight", "printStackTrace", "setSmoothScrollbarEnabled", "setEllipsize", "setAdapter", "setCacheColorHint", "setScroller", "setImageTintMode", "setSelectedChildViewEnabled", "getPreferredLanguage", "getError", "setFilterTouchesWhenObscured", "setSaveEnabled", "setError", "setRendererPriorityPolicy", "getType", "TsdkManualInitializerinit1", "setTitleMarginEnd", "setWebChromeClient", "setTooltipText", "UiMessageCallbackKt", "setHint", "setEmptyView", "isApplicationInitAllowed", "d1", "setSpannableFactory", "setImageState", "setScrollBarFadeDuration", "setLineBreakStyle", "getHeight", "d2", "CardScheme", "setBackgroundTintMode", "bv", "TxnResultCallbackKt", "setOnFocusChangeListener", "setLayoutAnimation", "setMinEms", "ClientCredentialsGrant", "setPadding", "setNextClusterForwardId", "setActivated", "getReason", "setClipToPadding", "setOnLongClickListener", "setOnDragListener", "k", "getDesignatorAfterValue", "setOnScrollChangeListener", "getPinGridButtonBgColor", "setAccessibilityLiveRegion", "toString", "getPinDigitBgColor", "setPaintFlags", "setSelectionFromTop", "TerminalSessionDefaultImpls", "setTitleMarginBottom", "setScrollX", "setSystemUiVisibility", "setScrollY", "setAccessibilityTraversalAfter", "UiMessageId", "UiMessage", "getNumericCode", "setSecondaryProgressTintMode", "setSelected", "setIndeterminateTintList", "getNavBarTitleString", "TsdkManualInitializer", "setHttpAuthUsernamePassword", "setSingleLine", "setProgressDrawable", "deactivate", "junkify", "getDisplaySymbol", "setOnGroupClickListener", "setOutlineAmbientShadowColor", "setMin", "setBackgroundResource", "getStackTrace", "getCurrencyCustomFormatting", "setFocusableInTouchMode", "setClipBounds", "addSuppressed", "getView", "setOnCapturedPointerListener", "CurrencyKt", "setPointerIcon", "setTransformationMethod", "TransactionErrorCause", "getClearButtonText", "setOnGroupCollapseListener", "setTextDirection", "setAccessibilityTraversalBefore", "TerminalErrorCodes", "getAmountOther", "setSupportImageTintMode", "setScrollCaptureCallback", "setAlpha", "getDetails", "setPersistentDrawingCache", "setTitle", "TransactionApproved", "setChoiceMode", "getTransactionLandscape", "setImportantForContentCapture", "SessionActivationFailure", "setTranscriptMode", "TransactionNotAuthorised", "setStackTrace", "getGeneralBgColor", "setLineSpacing", "setContentInsetStartWithNavigation", "getHoldTime", "setDuplicateParentStateEnabled", "setCameraDistance", "getNavBarTextColor", "TransactionType", "setTouchscreenBlocksFocus", "setProgressBackgroundTintMode", "setFastScrollStyle", "fillInStackTrace", "EuropeEndpoint", "setOnScrollListener", "notifyAll", "setBaseline", "getPinGridBgColor", "setSubtitleTextAppearance", "getTotalElapsedTimeout", "setIndeterminateDrawableTiled", "setOnTouchListener", "setOverScrollMode", "setMaxHeight", GenerateActivationFormCommand.HASH_CODE, "getValueQualifier", "setNextFocusDownId", "onPinPadLaunchRequest", "setScrollBarStyle", "setContentInsetsAbsolute", "getCardScheme", "setChildIndicatorBounds", "applicationCreated", "setFriction", "setBreakStrategy", "setDividerHeight", "setHorizontalScrollBarEnabled", "setLogoDescription", "setHapticFeedbackEnabled", "setWebContentsDebuggingEnabled", "setSupportBackgroundTintList", "setTextSelectHandle"}, k = 1, mv = {1, 5, 1})
public final class getEmvLibVersion {
    private static int setJustificationMode = 1;
    private static int setOnReceiveContentListener;

    @NotNull
    public String setDividerPadding;

    /* JADX INFO: renamed from: setNavigationOnClickListener, reason: from kotlin metadata */
    @NotNull
    private final byte[] setX;
    private static getEmvLibVersion setIncludeFontPadding = new getEmvLibVersion("SW_61", 0, EglobalUtils.INITIALIZED_KEYS_WRONG_COMMAND, "Command successfully executed; 'XX' bytes of data are available and can be requested using GET RESPONSE");
    private static getEmvLibVersion setTextAlignment = new getEmvLibVersion("SW_6200", 1, "6200", "No information given (NV-Ram not changed)");
    private static getEmvLibVersion setZ = new getEmvLibVersion("SW_6201", 2, "6201", "NV-Ram not changed 1");
    private static getEmvLibVersion setAlwaysDrawnWithCacheEnabled = new getEmvLibVersion("SW_6281", 3, "6281", "Part of returned data may be corrupted");
    private static getEmvLibVersion UiMessageCallbackKtWhenMappings = new getEmvLibVersion("SW_6282", 4, "6282", "End of file/record reached before reading Le bytes");
    private static getEmvLibVersion getAmountFieldTextColor = new getEmvLibVersion("SW_6283", 5, "6283", "Selected file invalidated");
    private static getEmvLibVersion setCompoundDrawablePadding = new getEmvLibVersion("SW_6284", 6, "6284", "Selected file is not valid. FCI not formated according to ISO");
    private static getEmvLibVersion setOnEditorActionListener = new getEmvLibVersion("SW_6285", 7, "6285", "Selected file is in termination state");
    private static getEmvLibVersion setTextScaleX = new getEmvLibVersion("SW_62A2", 8, "62A2", "Wrong R-MAC");
    private static getEmvLibVersion setChildDivider = new getEmvLibVersion("SW_62A4", 9, "62A4", "Card locked (during reset( ))");
    private static getEmvLibVersion setMaxEms = new getEmvLibVersion("SW_62F1", 10, "62F1", "Wrong C-MAC");
    private static getEmvLibVersion setLayoutDirection = new getEmvLibVersion("SW_62F3", 11, "62F3", "Internal reset");
    private static getEmvLibVersion setMinHeight = new getEmvLibVersion("SW_62F5", 12, "62F5", "Default agent locked");
    private static getEmvLibVersion getSuppressed = new getEmvLibVersion("SW_62F7", 13, "62F7", "Cardholder locked");
    private static getEmvLibVersion setImageResource = new getEmvLibVersion("SW_62F8", 14, "62F8", "Basement is current agent");
    private static getEmvLibVersion setViewTranslationCallback = new getEmvLibVersion("SW_62F9", 15, "62F9", "CALC Key Set not unblocked");
    private static getEmvLibVersion TransactionResult = new getEmvLibVersion("SW_62", 16, EglobalUtils.NOT_INIT_KEYS, "RFU");
    private static getEmvLibVersion setCursorVisible = new getEmvLibVersion("SW_6300", 17, "6300", "No information given (NV-Ram changed)");
    private static getEmvLibVersion setTextSelectHandleRight = new getEmvLibVersion("SW_6381", 18, "6381", "File filled up by the last write. Loading/updating is not allowed");
    private static getEmvLibVersion printStackTrace = new getEmvLibVersion("SW_6382", 19, "6382", "Card key not supported");
    private static getEmvLibVersion setSmoothScrollbarEnabled = new getEmvLibVersion("SW_6383", 20, "6383", "Reader key not supported");
    private static getEmvLibVersion setEllipsize = new getEmvLibVersion("SW_6384", 21, "6384", "Plaintext transmission not supported");
    private static getEmvLibVersion setAdapter = new getEmvLibVersion("SW_6385", 22, "6385", "Secured transmission not supported");
    private static getEmvLibVersion setCacheColorHint = new getEmvLibVersion("SW_6386", 23, "6386", "Volatile memory is not available");
    private static getEmvLibVersion setScroller = new getEmvLibVersion("SW_6387", 24, "6387", "Non-volatile memory is not available");
    private static getEmvLibVersion setImageTintMode = new getEmvLibVersion("SW_6388", 25, "6388", "Key number not valid");
    private static getEmvLibVersion setSelectedChildViewEnabled = new getEmvLibVersion("SW_6389", 26, "6389", "Key length is not correct");
    private static getEmvLibVersion getPreferredLanguage = new getEmvLibVersion("SW_63C0", 27, "63C0", "Verify fail, no try left");
    private static getEmvLibVersion getError = new getEmvLibVersion("SW_63C1", 28, "63C1", "Verify fail, 1 try left");
    private static getEmvLibVersion setFilterTouchesWhenObscured = new getEmvLibVersion("SW_63C2", 29, "63C2", "Verify fail, 2 tries left");
    private static getEmvLibVersion setSaveEnabled = new getEmvLibVersion("SW_63C3", 30, "63C3", "Verify fail, 3 tries left");
    private static getEmvLibVersion setError = new getEmvLibVersion("SW_63", 31, EglobalUtils.READ_CARD_ERROR, "RFU");
    private static getEmvLibVersion setRendererPriorityPolicy = new getEmvLibVersion("SW_6400", 32, "6400", "No information given (NV-Ram not changed)");
    private static getEmvLibVersion getType = new getEmvLibVersion("SW_6401", 33, "6401", "Command timeout");
    private static getEmvLibVersion TsdkManualInitializerinit1 = new getEmvLibVersion("SW_64", 34, "64", "RFU");
    private static getEmvLibVersion setTitleMarginEnd = new getEmvLibVersion("SW_6500", 35, "6500", "No information given");
    private static getEmvLibVersion setWebChromeClient = new getEmvLibVersion("SW_6501", 36, "6501", "Write error. Memory failure. There have been problems in writing or reading the EEPROM. Other hardware problems may also bring this error");
    private static getEmvLibVersion setTooltipText = new getEmvLibVersion("SW_6581", 37, "6581", "Memory failure");
    private static getEmvLibVersion UiMessageCallbackKt = new getEmvLibVersion("SW_65", 38, EglobalUtils.DOUBLE_AUTH_MC_CODE, "RFU");
    private static getEmvLibVersion setHint = new getEmvLibVersion("SW_6669", 39, "6669", "Incorrect Encryption/Decryption Padding");
    private static getEmvLibVersion setEmptyView = new getEmvLibVersion("SW_66", 40, "66", Constant.DASH_STRING);
    private static getEmvLibVersion isApplicationInitAllowed = new getEmvLibVersion("SW_6700", 41, "6700", "Wrong length");

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private static getEmvLibVersion f55834d1 = new getEmvLibVersion("SW_67", 42, "67", "length incorrect (procedure)(ISO 7816-3)");
    private static getEmvLibVersion setSpannableFactory = new getEmvLibVersion("SW_6800", 43, "6800", "No information given (The request function is not supported by the card)");
    private static getEmvLibVersion setImageState = new getEmvLibVersion("SW_6881", 44, "6881", "Logical channel not supported");
    private static getEmvLibVersion setScrollBarFadeDuration = new getEmvLibVersion("SW_6882", 45, "6882", "Secure messaging not supported");
    private static getEmvLibVersion setLineBreakStyle = new getEmvLibVersion("SW_6883", 46, "6883", "Last command of the chain expected");
    private static getEmvLibVersion getHeight = new getEmvLibVersion("SW_6884", 47, "6884", "Command chaining not supported");
    private static getEmvLibVersion d2 = new getEmvLibVersion("SW_68", 48, AsoResponse.ERROR_CODE_TSEC_TIME_OUT, "RFU");
    private static getEmvLibVersion CardScheme = new getEmvLibVersion("SW_6900", 49, "6900", "No information given (Command not allowed)");
    private static getEmvLibVersion setBackgroundTintMode = new getEmvLibVersion("SW_6981", 50, "6981", "Command incompatible with file structure");
    private static getEmvLibVersion bv = new getEmvLibVersion("SW_6982", 51, "6982", "Security condition not satisfied");
    private static getEmvLibVersion TxnResultCallbackKt = new getEmvLibVersion("SW_6983", 52, "6983", "Authentication method blocked");
    public static final getEmvLibVersion setCompoundDrawableTintBlendMode = new getEmvLibVersion("SW_6984", 53, "6984", "Referenced data reversibly blocked (invalidated)");
    public static final getEmvLibVersion setOnFocusChangeListener = new getEmvLibVersion("SW_6985", 54, "6985", "Conditions of use not satisfied");
    public static final getEmvLibVersion setX = new getEmvLibVersion("SW_6986", 55, "6986", "Command not allowed (no current EF)");
    public static final getEmvLibVersion setLayoutAnimation = new getEmvLibVersion("SW_6987", 56, "6987", "Expected secure messaging (SM) object missing");
    private static getEmvLibVersion setMinEms = new getEmvLibVersion("SW_6988", 57, "6988", "Incorrect secure messaging (SM) data object");
    private static getEmvLibVersion ClientCredentialsGrant = new getEmvLibVersion("SW_6996", 58, "6996", "Data must be updated again");
    private static getEmvLibVersion setPadding = new getEmvLibVersion("SW_69F0", 59, "69F0", "Permission Denied");
    private static getEmvLibVersion setNextClusterForwardId = new getEmvLibVersion("SW_69F1", 60, "69F1", "Permission Denied - Missing Privilege");
    private static getEmvLibVersion setActivated = new getEmvLibVersion("SW_69", 61, "69", "RFU");
    private static getEmvLibVersion getReason = new getEmvLibVersion("SW_6A00", 62, "6A00", "No information given (Bytes P1 and/or P2 are incorrect)");
    private static getEmvLibVersion setClipToPadding = new getEmvLibVersion("SW_6A80", 63, "6A80", "The parameters in the data field are incorrect");
    public static final getEmvLibVersion setOnLongClickListener = new getEmvLibVersion("SW_6A81", 64, "6A81", "Function not supported");
    public static final getEmvLibVersion setOnDragListener = new getEmvLibVersion("SW_6A82", 65, "6A82", "File not found");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static getEmvLibVersion f55835k = new getEmvLibVersion("SW_6A83", 66, "6A83", "Record not found");
    private static getEmvLibVersion getDesignatorAfterValue = new getEmvLibVersion("SW_6A84", 67, "6A84", "There is insufficient memory space in record or file");
    private static getEmvLibVersion setOnScrollChangeListener = new getEmvLibVersion("SW_6A85", 68, "6A85", "Lc inconsistent with TLV structure");
    private static getEmvLibVersion getPinGridButtonBgColor = new getEmvLibVersion("SW_6A86", 69, "6A86", "Incorrect P1 or P2 parameter");
    private static getEmvLibVersion setAccessibilityLiveRegion = new getEmvLibVersion("SW_6A87", 70, "6A87", "Lc inconsistent with P1-P2");
    private static getEmvLibVersion toString = new getEmvLibVersion("SW_6A88", 71, "6A88", "Referenced data not found");
    private static getEmvLibVersion getPinDigitBgColor = new getEmvLibVersion("SW_6A89", 72, "6A89", "File already exists");
    private static getEmvLibVersion setPaintFlags = new getEmvLibVersion("SW_6A8A", 73, "6A8A", "DF name already exists");
    private static getEmvLibVersion setSelectionFromTop = new getEmvLibVersion("SW_6AF0", 74, "6AF0", "Wrong parameter value");
    private static getEmvLibVersion TerminalSessionDefaultImpls = new getEmvLibVersion("SW_6A", 75, "6A", "RFU");
    private static getEmvLibVersion setTitleMarginBottom = new getEmvLibVersion("SW_6B00", 76, "6B00", "Wrong parameter(s) P1-P2");
    private static getEmvLibVersion setScrollX = new getEmvLibVersion("SW_6B", 77, "6B", "Reference incorrect (procedure byte), (ISO 78163)");
    private static getEmvLibVersion setSystemUiVisibility = new getEmvLibVersion("SW_6C00", 78, "6C00", "Incorrect P3 length");
    private static getEmvLibVersion setScrollY = new getEmvLibVersion("SW_6C", 79, "6C", "xx = exact Le");
    private static getEmvLibVersion setAccessibilityTraversalAfter = new getEmvLibVersion("SW_6D00", 80, "6D00", "Instruction code not supported or invalid");
    private static getEmvLibVersion UiMessageId = new getEmvLibVersion("SW_6D", 81, "6D", "Instruction code not programmed or invalid (procedure byte), (ISO 7816-3)");
    private static getEmvLibVersion UiMessage = new getEmvLibVersion("SW_6E00", 82, "6E00", "Class not supported");
    private static getEmvLibVersion getNumericCode = new getEmvLibVersion("SW_6E", 83, "6E", "Instruction class not supported (procedure byte), (ISO 7816-3)");
    private static getEmvLibVersion setSecondaryProgressTintMode = new getEmvLibVersion("SW_6F00", 84, "6F00", "Command aborted - more exact diagnosis not possible (e.g., operating system error)");
    private static getEmvLibVersion setSelected = new getEmvLibVersion("SW_6FFF", 85, "6FFF", "Card dead (overuse, …)");
    private static getEmvLibVersion setIndeterminateTintList = new getEmvLibVersion("SW_6F", 86, "6F", "No precise diagnosis (procedure byte), (ISO 7816-3)");
    public static final getEmvLibVersion getNavBarTitleString = new getEmvLibVersion("SW_9000", 87, "9000", "Command successfully executed (OK)");
    private static getEmvLibVersion TsdkManualInitializer = new getEmvLibVersion("SW_9004", 88, "9004", "PIN not succesfully verified, 3 or more PIN tries left");
    private static getEmvLibVersion setHttpAuthUsernamePassword = new getEmvLibVersion("SW_9008", 89, "9008", "Key/file not found");
    private static getEmvLibVersion setSingleLine = new getEmvLibVersion("SW_9080", 90, "9080", "Unblock Try Counter has reached zero");
    private static getEmvLibVersion setProgressDrawable = new getEmvLibVersion("SW_9101", 91, "9101", "States.activity, States.lock Status or States.lockable has wrong value");
    private static getEmvLibVersion deactivate = new getEmvLibVersion("SW_9102", 92, "9102", "Transaction number reached its limit");
    private static getEmvLibVersion junkify = new getEmvLibVersion("SW_9210", 93, "9210", "No more storage available");
    private static getEmvLibVersion getDisplaySymbol = new getEmvLibVersion("SW_9301", 94, "9301", "Integrity error");
    private static getEmvLibVersion setOnGroupClickListener = new getEmvLibVersion("SW_9302", 95, "9302", "Candidate S2 invalid");
    private static getEmvLibVersion setOutlineAmbientShadowColor = new getEmvLibVersion("SW_9401", 96, "9401", "Candidate currency code does not match purse currency");
    private static getEmvLibVersion setMin = new getEmvLibVersion("SW_9402", 97, "9402", "Candidate amount too high");
    private static getEmvLibVersion setBackgroundResource = new getEmvLibVersion("SW_9403", 98, "9403", "Candidate amount too low");
    private static getEmvLibVersion getStackTrace = new getEmvLibVersion("SW_9405", 99, "9405", "Problems in the data field");
    private static getEmvLibVersion getCurrencyCustomFormatting = new getEmvLibVersion("SW_9407", 100, "9407", "Bad currency : purse engine has no slot with R3bc currency");
    private static getEmvLibVersion setFocusableInTouchMode = new getEmvLibVersion("SW_9408", 101, "9408", "R3bc currency not supported in purse engine");
    private static getEmvLibVersion setClipBounds = new getEmvLibVersion("SW_9580", 102, "9580", "Bad sequence");
    private static getEmvLibVersion addSuppressed = new getEmvLibVersion("SW_9681", 103, "9681", "Slave not found");
    private static getEmvLibVersion getView = new getEmvLibVersion("SW_9700", 104, "9700", "PIN blocked and Unblock Try Counter is 1 or 2");
    private static getEmvLibVersion setOnCapturedPointerListener = new getEmvLibVersion("SW_9702", 105, "9702", "Main keys are blocked");
    private static getEmvLibVersion CurrencyKt = new getEmvLibVersion("SW_9704", 106, "9704", "PIN not succesfully verified, 3 or more PIN tries left");
    private static getEmvLibVersion setPointerIcon = new getEmvLibVersion("SW_9784", 107, "9784", "Base key");
    private static getEmvLibVersion setTransformationMethod = new getEmvLibVersion("SW_9785", 108, "9785", "Limit exceeded - C-MAC key");
    private static getEmvLibVersion TransactionErrorCause = new getEmvLibVersion("SW_9786", 109, "9786", "SM error - Limit exceeded - R-MAC key");
    private static getEmvLibVersion getClearButtonText = new getEmvLibVersion("SW_9787", 110, "9787", "Limit exceeded - sequence counter");
    private static getEmvLibVersion setOnGroupCollapseListener = new getEmvLibVersion("SW_9788", 111, "9788", "Limit exceeded - R-MAC length");
    private static getEmvLibVersion setTextDirection = new getEmvLibVersion("SW_9789", 112, "9789", "Service not available");
    private static getEmvLibVersion setAccessibilityTraversalBefore = new getEmvLibVersion("SW_9804", 113, "9804", "Access conditions not satisfied");
    private static getEmvLibVersion TerminalErrorCodes = new getEmvLibVersion("SW_9900", 114, "9900", "1 PIN try left");
    private static getEmvLibVersion getAmountOther = new getEmvLibVersion("SW_9904", 115, "9904", "PIN not succesfully verified, 1 PIN try left");
    private static getEmvLibVersion setSupportImageTintMode = new getEmvLibVersion("SW_9985", 116, "9985", "Wrong status - Cardholder lock");
    private static getEmvLibVersion setScrollCaptureCallback = new getEmvLibVersion("SW_9986", 117, "9986", "Missing privilege");
    private static getEmvLibVersion setAlpha = new getEmvLibVersion("SW_9987", 118, "9987", "PIN is not installed");
    private static getEmvLibVersion getDetails = new getEmvLibVersion("SW_9988", 119, "9988", "Wrong status - R-MAC state");
    private static getEmvLibVersion setPersistentDrawingCache = new getEmvLibVersion("SW_9A00", 120, "9A00", "2 PIN try left");
    private static getEmvLibVersion setTitle = new getEmvLibVersion("SW_9A04", 121, "9A04", "PIN not succesfully verified, 2 PIN try left");
    private static getEmvLibVersion TransactionApproved = new getEmvLibVersion("SW_9A71", 122, "9A71", "Wrong parameter value - Double agent AID");
    private static getEmvLibVersion setChoiceMode = new getEmvLibVersion("SW_9A72", 123, "9A72", "Wrong parameter value - Double agent Type");
    private static getEmvLibVersion getTransactionLandscape = new getEmvLibVersion("SW_9D05", 124, "9D05", "Incorrect certificate type");
    private static getEmvLibVersion setImportantForContentCapture = new getEmvLibVersion("SW_9D07", 125, "9D07", "Incorrect session data size");
    private static getEmvLibVersion SessionActivationFailure = new getEmvLibVersion("SW_9D08", 126, "9D08", "Incorrect DIR file record size");
    private static getEmvLibVersion setTranscriptMode = new getEmvLibVersion("SW_9D09", 127, "9D09", "Incorrect FCI record size");
    private static getEmvLibVersion TransactionNotAuthorised = new getEmvLibVersion("SW_9D0A", 128, "9D0A", "Incorrect code size");
    private static getEmvLibVersion setStackTrace = new getEmvLibVersion("SW_9D10", 129, "9D10", "Insufficient memory to load application");
    private static getEmvLibVersion getGeneralBgColor = new getEmvLibVersion("SW_9D11", 130, "9D11", "Invalid AID");
    private static getEmvLibVersion setLineSpacing = new getEmvLibVersion("SW_9D12", 131, "9D12", "Duplicate AID");
    private static getEmvLibVersion setContentInsetStartWithNavigation = new getEmvLibVersion("SW_9D13", 132, "9D13", "Application previously loaded");
    private static getEmvLibVersion getHoldTime = new getEmvLibVersion("SW_9D14", 133, "9D14", "Application history list full");
    private static getEmvLibVersion setDuplicateParentStateEnabled = new getEmvLibVersion("SW_9D15", 134, "9D15", "Application not open");
    private static getEmvLibVersion setCameraDistance = new getEmvLibVersion("SW_9D17", 135, "9D17", "Invalid offset");
    private static getEmvLibVersion getNavBarTextColor = new getEmvLibVersion("SW_9D18", 136, "9D18", "Application already loaded");
    private static getEmvLibVersion TransactionType = new getEmvLibVersion("SW_9D19", 137, "9D19", "Invalid certificate");
    private static getEmvLibVersion setTouchscreenBlocksFocus = new getEmvLibVersion("SW_9D1A", 138, "9D1A", "Invalid signature");
    private static getEmvLibVersion setProgressBackgroundTintMode = new getEmvLibVersion("SW_9D1B", 139, "9D1B", "Invalid KTU");
    private static getEmvLibVersion setFastScrollStyle = new getEmvLibVersion("SW_9D1D", 140, "9D1D", "MSM controls not set");
    private static getEmvLibVersion fillInStackTrace = new getEmvLibVersion("SW_9D1E", 141, "9D1E", "Application signature does not exist");
    private static getEmvLibVersion EuropeEndpoint = new getEmvLibVersion("SW_9D1F", 142, "9D1F", "KTU does not exist");
    private static getEmvLibVersion setOnScrollListener = new getEmvLibVersion("SW_9D20", 143, "9D20", "Application not loaded");
    private static getEmvLibVersion notifyAll = new getEmvLibVersion("SW_9D21", 144, "9D21", "Invalid Open command data length");
    private static getEmvLibVersion setBaseline = new getEmvLibVersion("SW_9D30", 145, "9D30", "Check data parameter is incorrect (invalid start address)");
    private static getEmvLibVersion getPinGridBgColor = new getEmvLibVersion("SW_9D31", 146, "9D31", "Check data parameter is incorrect (invalid length)");
    private static getEmvLibVersion setSubtitleTextAppearance = new getEmvLibVersion("SW_9D32", 147, "9D32", "Check data parameter is incorrect (illegal memory check area)");
    private static getEmvLibVersion getTotalElapsedTimeout = new getEmvLibVersion("SW_9D40", 148, "9D40", "Invalid MSM Controls ciphertext");
    private static getEmvLibVersion setIndeterminateDrawableTiled = new getEmvLibVersion("SW_9D41", 149, "9D41", "MSM controls already set");
    private static getEmvLibVersion setOnTouchListener = new getEmvLibVersion("SW_9D42", 150, "9D42", "Set MSM Controls data length less than 2 bytes");
    private static getEmvLibVersion setOverScrollMode = new getEmvLibVersion("SW_9D43", 151, "9D43", "Invalid MSM Controls data length");
    private static getEmvLibVersion setMaxHeight = new getEmvLibVersion("SW_9D44", 152, "9D44", "Excess MSM Controls ciphertext");
    private static getEmvLibVersion hashCode = new getEmvLibVersion("SW_9D45", 153, "9D45", "Verification of MSM Controls data failed");
    private static getEmvLibVersion getValueQualifier = new getEmvLibVersion("SW_9D50", 154, "9D50", "Invalid MCD Issuer production ID");
    private static getEmvLibVersion setNextFocusDownId = new getEmvLibVersion("SW_9D51", 155, "9D51", "Invalid MCD Issuer ID");
    private static getEmvLibVersion onPinPadLaunchRequest = new getEmvLibVersion("SW_9D52", 156, "9D52", "Invalid set MSM controls data date");
    private static getEmvLibVersion setScrollBarStyle = new getEmvLibVersion("SW_9D53", 157, "9D53", "Invalid MCD number");
    private static getEmvLibVersion setContentInsetsAbsolute = new getEmvLibVersion("SW_9D54", 158, "9D54", "Reserved field error");
    private static getEmvLibVersion getCardScheme = new getEmvLibVersion("SW_9D55", 159, "9D55", "Reserved field error");
    private static getEmvLibVersion setChildIndicatorBounds = new getEmvLibVersion("SW_9D56", 160, "9D56", "Reserved field error");
    private static getEmvLibVersion applicationCreated = new getEmvLibVersion("SW_9D57", 161, "9D57", "Reserved field error");
    private static getEmvLibVersion setFriction = new getEmvLibVersion("SW_9D60", 162, "9D60", "MAC verification failed");
    private static getEmvLibVersion setBreakStrategy = new getEmvLibVersion("SW_9D61", 163, "9D61", "Maximum number of unblocks reached");
    private static getEmvLibVersion setDividerHeight = new getEmvLibVersion("SW_9D62", 164, "9D62", "Card was not blocked");
    private static getEmvLibVersion setHorizontalScrollBarEnabled = new getEmvLibVersion("SW_9D63", 165, "9D63", "Crypto functions not available");
    private static getEmvLibVersion setLogoDescription = new getEmvLibVersion("SW_9D64", 166, "9D64", "No application loaded");
    private static getEmvLibVersion setHapticFeedbackEnabled = new getEmvLibVersion("SW_9E00", 167, "9E00", "PIN not installed");
    private static getEmvLibVersion setWebContentsDebuggingEnabled = new getEmvLibVersion("SW_9E04", 168, "9E04", "PIN not succesfully verified, PIN not installed");
    private static getEmvLibVersion setSupportBackgroundTintList = new getEmvLibVersion("SW_9F00", 169, "9F00", "PIN blocked and Unblock Try Counter is 3");
    private static getEmvLibVersion setTextSelectHandle = new getEmvLibVersion("SW_9F04", 170, "9F04", "PIN not succesfully verified, PIN blocked and Unblock Try Counter is 3");
    private static final /* synthetic */ getEmvLibVersion[] setImageBitmap = a();

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.getEmvLibVersion$setY, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/getEmvLibVersion$setY;", "", "", "p0", "Lcom/mypinpad/tsdk/i/getEmvLibVersion;", "setCompoundDrawableTintBlendMode", "([B)Lcom/mypinpad/tsdk/i/getEmvLibVersion;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f55836a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f55837b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public static getEmvLibVersion setCompoundDrawableTintBlendMode(@Nullable byte[] p4) {
            return (getEmvLibVersion) setOnFocusChangeListener(new Object[]{p4}, 617595066, -617595066, (int) System.currentTimeMillis());
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0089  */
        /* JADX WARN: Code duplicated, block: B:14:0x00a4  */
        /* JADX WARN: Code duplicated, block: B:29:0x0113 A[EDGE_INSN: B:29:0x0113->B:16:0x0113 BREAK  A[LOOP:0: B:7:0x0048->B:20:0x0149], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:30:0x0149 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:31:0x0149 A[SYNTHETIC] */
        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            getEmvLibVersion getemvlibversion;
            int i13;
            int i14;
            int i15;
            int i16;
            byte[] bArr = (byte[]) objArr[0];
            int i17 = f55836a;
            int i18 = i17 & 57;
            int i19 = ((i17 | 57) & (~i18)) + (i18 << 1);
            int i20 = i19 % 128;
            f55837b = i20;
            int i21 = i19 % 2;
            if (bArr != null) {
                int i22 = i20 + 47;
                int i23 = i22 % 128;
                f55836a = i23;
                int i24 = i22 % 2;
                if (bArr.length >= 2) {
                    int i25 = i23 & 73;
                    int i26 = -(-((i23 ^ 73) | i25));
                    int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
                    f55837b = i27 % 128;
                    int i28 = i27 % 2;
                    getEmvLibVersion[] getemvlibversionArrValues = getEmvLibVersion.values();
                    int length = getemvlibversionArrValues.length;
                    int i29 = f55837b;
                    int i30 = ((i29 & 108) + (i29 | 108)) - 1;
                    f55836a = i30 % 128;
                    int i31 = i30 % 2;
                    int i32 = 0;
                    while (true) {
                        if (i32 >= length) {
                            int i33 = f55836a;
                            int i34 = i33 & 115;
                            int i35 = i34 + ((i33 ^ 115) | i34);
                            f55837b = i35 % 128;
                            if (i35 % 2 != 0) {
                                return null;
                            }
                            throw null;
                        }
                        int i36 = f55837b;
                        int i37 = ((i36 | 95) << 1) - (i36 ^ 95);
                        f55836a = i37 % 128;
                        int i38 = i37 % 2;
                        getemvlibversion = getemvlibversionArrValues[i32];
                        if (getemvlibversion.setX().length == 1) {
                            int i39 = f55837b;
                            int i40 = i39 & 87;
                            int i41 = -(-((i39 ^ 87) | i40));
                            int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
                            f55836a = i42 % 128;
                            int i43 = i42 % 2;
                            int length2 = bArr.length;
                            int i44 = length2 & (-2);
                            if (bArr[(((length2 ^ (-2)) | i44) << 1) - ((length2 | (-2)) & (~i44))] == getemvlibversion.setX()[0]) {
                                break;
                            }
                            int length3 = bArr.length;
                            int i45 = length3 & (-2);
                            i13 = ((length3 ^ (-2)) | i45) << 1;
                            i14 = -((length3 | (-2)) & (~i45));
                            if (bArr[((i13 | i14) << 1) - (i14 ^ i13)] == getemvlibversion.setX()[0]) {
                                int i46 = f55837b;
                                int i47 = (((i46 & (-116)) | ((~i46) & 115)) - (~((i46 & 115) << 1))) - 1;
                                f55836a = i47 % 128;
                                int i48 = i47 % 2;
                                int length4 = bArr.length;
                                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                                int i49 = length4 * 242;
                                int i50 = (-483) ^ i49;
                                int i51 = ((i49 & (-483)) | i50) << 1;
                                int i52 = -i50;
                                int i53 = (i51 & i52) + (i51 | i52);
                                int i54 = ~length4;
                                int i55 = ~((i54 | length4) & i54);
                                int i56 = ~iCurrentTimeMillis;
                                int i57 = ~i56;
                                int i58 = i55 ^ i57;
                                int i59 = i55 & i57;
                                int i60 = -(-(((i59 & i58) | (i58 ^ i59)) * (-241)));
                                i15 = (((i54 ^ length4) | (i54 & length4)) * (-482)) + (i53 & i60) + (i60 | i53);
                                int i61 = ~i54;
                                int i62 = (i61 & i54) | (i61 ^ i54);
                                int i63 = ~i62;
                                int i64 = (i62 | i63) & i63;
                                int i65 = (i54 & i56) | ((~i56) & length4);
                                int i66 = length4 & i56;
                                int i67 = ~((i66 & i65) | (i65 ^ i66));
                                i16 = -(-(((i67 & i64) | (i64 ^ i67)) * 241));
                                if (bArr[((i15 & i16) - (~(i16 | i15))) - 1] == getemvlibversion.setX()[1]) {
                                    break;
                                }
                            }
                            int i68 = f55836a;
                            int i69 = i68 & 113;
                            int i70 = ((~i69) & (i68 | 113)) + (i69 << 1);
                            f55837b = i70 % 128;
                            int i71 = i70 % 2;
                            int i72 = i32 & 1;
                            int i73 = ((i32 ^ 1) | i72) << 1;
                            int i74 = -((i32 | 1) & (~i72));
                            i32 = ((i73 | i74) << 1) - (i74 ^ i73);
                            int i75 = (i68 & (-40)) | ((~i68) & 39);
                            int i76 = -(-((i68 & 39) << 1));
                            int i77 = (i75 & i76) + (i76 | i75);
                            f55837b = i77 % 128;
                            int i78 = i77 % 2;
                        } else {
                            int length5 = bArr.length;
                            int i410 = length5 & (-2);
                            i13 = ((length5 ^ (-2)) | i410) << 1;
                            i14 = -((length5 | (-2)) & (~i410));
                            if (bArr[((i13 | i14) << 1) - (i14 ^ i13)] == getemvlibversion.setX()[0]) {
                                int i411 = f55837b;
                                int i412 = (((i411 & (-116)) | ((~i411) & 115)) - (~((i411 & 115) << 1))) - 1;
                                f55836a = i412 % 128;
                                int i413 = i412 % 2;
                                int length6 = bArr.length;
                                int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                                int i414 = length6 * 242;
                                int i510 = (-483) ^ i414;
                                int i511 = ((i414 & (-483)) | i510) << 1;
                                int i512 = -i510;
                                int i513 = (i511 & i512) + (i511 | i512);
                                int i514 = ~length6;
                                int i515 = ~((i514 | length6) & i514);
                                int i516 = ~iCurrentTimeMillis2;
                                int i517 = ~i516;
                                int i518 = i515 ^ i517;
                                int i519 = i515 & i517;
                                int i610 = -(-(((i519 & i518) | (i518 ^ i519)) * (-241)));
                                i15 = (((i514 ^ length6) | (i514 & length6)) * (-482)) + (i513 & i610) + (i610 | i513);
                                int i611 = ~i514;
                                int i612 = (i611 & i514) | (i611 ^ i514);
                                int i613 = ~i612;
                                int i614 = (i612 | i613) & i613;
                                int i615 = (i514 & i516) | ((~i516) & length6);
                                int i616 = length6 & i516;
                                int i617 = ~((i616 & i615) | (i615 ^ i616));
                                i16 = -(-(((i617 & i614) | (i614 ^ i617)) * 241));
                                if (bArr[((i15 & i16) - (~(i16 | i15))) - 1] == getemvlibversion.setX()[1]) {
                                    break;
                                    break;
                                }
                            }
                            int i618 = f55836a;
                            int i619 = i618 & 113;
                            int i79 = ((~i619) & (i618 | 113)) + (i619 << 1);
                            f55837b = i79 % 128;
                            int i710 = i79 % 2;
                            int i711 = i32 & 1;
                            int i712 = ((i32 ^ 1) | i711) << 1;
                            int i713 = -((i32 | 1) & (~i711));
                            i32 = ((i712 | i713) << 1) - (i713 ^ i712);
                            int i714 = (i618 & (-40)) | ((~i618) & 39);
                            int i715 = -(-((i618 & 39) << 1));
                            int i716 = (i714 & i715) + (i715 | i714);
                            f55837b = i716 % 128;
                            int i717 = i716 % 2;
                        }
                    }
                    int i80 = f55836a;
                    int i81 = i80 & 117;
                    int i82 = (((i80 ^ 117) | i81) << 1) - ((i80 | 117) & (~i81));
                    int i83 = i82 % 128;
                    f55837b = i83;
                    int i84 = i82 % 2;
                    int i85 = i83 & 23;
                    int i86 = (i83 | 23) & (~i85);
                    int i87 = -(-(i85 << 1));
                    int i88 = (i86 & i87) + (i86 | i87);
                    int i89 = i88 % 128;
                    f55836a = i89;
                    if (i88 % 2 != 0) {
                        int i90 = 67 / 0;
                    }
                    int i91 = ((i89 | 39) << 1) - (i89 ^ 39);
                    f55837b = i91 % 128;
                    int i92 = i91 % 2;
                    return getemvlibversion;
                }
            }
            int i93 = f55836a;
            int i94 = i93 & 103;
            int i95 = i94 + ((i93 ^ 103) | i94);
            f55837b = i95 % 128;
            int i96 = i95 % 2;
            return null;
        }
    }

    static {
        System.currentTimeMillis();
        System.currentTimeMillis();
    }

    public getEmvLibVersion(String str, int i10, String str2, String str3) {
        super(str, i10);
        this.setDividerPadding = str3;
        this.setX = (byte[]) setInputExtras.setDividerPadding(new Object[]{str2}, -1768743273, 1768743278, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ getEmvLibVersion[] a() {
        int i10 = setOnReceiveContentListener;
        int i11 = i10 & 89;
        int i12 = ((~i11) & (i10 | 89)) + (i11 << 1);
        setJustificationMode = i12 % 128;
        int i13 = i12 % 2;
        getEmvLibVersion[] getemvlibversionArr = {setIncludeFontPadding, setTextAlignment, setZ, setAlwaysDrawnWithCacheEnabled, UiMessageCallbackKtWhenMappings, getAmountFieldTextColor, setCompoundDrawablePadding, setOnEditorActionListener, setTextScaleX, setChildDivider, setMaxEms, setLayoutDirection, setMinHeight, getSuppressed, setImageResource, setViewTranslationCallback, TransactionResult, setCursorVisible, setTextSelectHandleRight, printStackTrace, setSmoothScrollbarEnabled, setEllipsize, setAdapter, setCacheColorHint, setScroller, setImageTintMode, setSelectedChildViewEnabled, getPreferredLanguage, getError, setFilterTouchesWhenObscured, setSaveEnabled, setError, setRendererPriorityPolicy, getType, TsdkManualInitializerinit1, setTitleMarginEnd, setWebChromeClient, setTooltipText, UiMessageCallbackKt, setHint, setEmptyView, isApplicationInitAllowed, f55834d1, setSpannableFactory, setImageState, setScrollBarFadeDuration, setLineBreakStyle, getHeight, d2, CardScheme, setBackgroundTintMode, bv, TxnResultCallbackKt, setCompoundDrawableTintBlendMode, setOnFocusChangeListener, setX, setLayoutAnimation, setMinEms, ClientCredentialsGrant, setPadding, setNextClusterForwardId, setActivated, getReason, setClipToPadding, setOnLongClickListener, setOnDragListener, f55835k, getDesignatorAfterValue, setOnScrollChangeListener, getPinGridButtonBgColor, setAccessibilityLiveRegion, toString, getPinDigitBgColor, setPaintFlags, setSelectionFromTop, TerminalSessionDefaultImpls, setTitleMarginBottom, setScrollX, setSystemUiVisibility, setScrollY, setAccessibilityTraversalAfter, UiMessageId, UiMessage, getNumericCode, setSecondaryProgressTintMode, setSelected, setIndeterminateTintList, getNavBarTitleString, TsdkManualInitializer, setHttpAuthUsernamePassword, setSingleLine, setProgressDrawable, deactivate, junkify, getDisplaySymbol, setOnGroupClickListener, setOutlineAmbientShadowColor, setMin, setBackgroundResource, getStackTrace, getCurrencyCustomFormatting, setFocusableInTouchMode, setClipBounds, addSuppressed, getView, setOnCapturedPointerListener, CurrencyKt, setPointerIcon, setTransformationMethod, TransactionErrorCause, getClearButtonText, setOnGroupCollapseListener, setTextDirection, setAccessibilityTraversalBefore, TerminalErrorCodes, getAmountOther, setSupportImageTintMode, setScrollCaptureCallback, setAlpha, getDetails, setPersistentDrawingCache, setTitle, TransactionApproved, setChoiceMode, getTransactionLandscape, setImportantForContentCapture, SessionActivationFailure, setTranscriptMode, TransactionNotAuthorised, setStackTrace, getGeneralBgColor, setLineSpacing, setContentInsetStartWithNavigation, getHoldTime, setDuplicateParentStateEnabled, setCameraDistance, getNavBarTextColor, TransactionType, setTouchscreenBlocksFocus, setProgressBackgroundTintMode, setFastScrollStyle, fillInStackTrace, EuropeEndpoint, setOnScrollListener, notifyAll, setBaseline, getPinGridBgColor, setSubtitleTextAppearance, getTotalElapsedTimeout, setIndeterminateDrawableTiled, setOnTouchListener, setOverScrollMode, setMaxHeight, hashCode, getValueQualifier, setNextFocusDownId, onPinPadLaunchRequest, setScrollBarStyle, setContentInsetsAbsolute, getCardScheme, setChildIndicatorBounds, applicationCreated, setFriction, setBreakStrategy, setDividerHeight, setHorizontalScrollBarEnabled, setLogoDescription, setHapticFeedbackEnabled, setWebContentsDebuggingEnabled, setSupportBackgroundTintList, setTextSelectHandle};
        int i14 = ((i10 | 12) << 1) - (i10 ^ 12);
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        setJustificationMode = i15 % 128;
        int i16 = i15 % 2;
        return getemvlibversionArr;
    }

    public static getEmvLibVersion valueOf(String str) {
        int i10 = setJustificationMode;
        int i11 = (i10 ^ 75) + ((i10 & 75) << 1);
        setOnReceiveContentListener = i11 % 128;
        int i12 = i11 % 2;
        getEmvLibVersion getemvlibversion = (getEmvLibVersion) Enum.valueOf(getEmvLibVersion.class, str);
        int i13 = setJustificationMode;
        int i14 = (i13 & 33) + (i13 | 33);
        setOnReceiveContentListener = i14 % 128;
        if (i14 % 2 == 0) {
            return getemvlibversion;
        }
        throw null;
    }

    public static getEmvLibVersion[] values() {
        int i10 = setJustificationMode;
        int i11 = (i10 ^ 22) + ((i10 & 22) << 1);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        setOnReceiveContentListener = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        getEmvLibVersion[] getemvlibversionArr = (getEmvLibVersion[]) setImageBitmap.clone();
        int i13 = setJustificationMode;
        int i14 = i13 & 67;
        int i15 = ((((i13 ^ 67) | i14) << 1) - (~(-((i13 | 67) & (~i14))))) - 1;
        setOnReceiveContentListener = i15 % 128;
        int i16 = i15 % 2;
        return getemvlibversionArr;
    }

    @JvmName(name = "setX")
    @NotNull
    public final byte[] setX() {
        int i10 = setJustificationMode;
        int i11 = (i10 ^ 67) + ((i10 & 67) << 1);
        setOnReceiveContentListener = i11 % 128;
        int i12 = i11 % 2;
        byte[] bArr = this.setX;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
        int i13 = setJustificationMode;
        int i14 = ((i13 & (-26)) | ((~i13) & 25)) + ((i13 & 25) << 1);
        setOnReceiveContentListener = i14 % 128;
        if (i14 % 2 == 0) {
            return bArrCopyOf;
        }
        throw null;
    }
}
