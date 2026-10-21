package com.veridas.config;

import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Configuration.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0013\"\u0014\u0010\u0001\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0002\"\u0014\u0010\b\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0002\"\u0014\u0010\t\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0002\"\u0014\u0010\n\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0002\"\u0014\u0010\u000b\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0002\"\u0014\u0010\f\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0002\"\u0014\u0010\r\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0002\"\u0014\u0010\u000e\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0002\"\u0014\u0010\u000f\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0002\"\u0014\u0010\u0010\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0002\"\u0014\u0010\u0011\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0002\"\u0014\u0010\u0012\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0002¨\u0006\u0013"}, d2 = {"", "COLOR_TRANSPARENT", "Ljava/lang/String;", "MSG_DEPRECATED_CONFIGURATION_KEY", "MSG_INVALID_BOOLEAN", "MSG_INVALID_COLOR", "MSG_INVALID_DSPL_ORIENTATION", "MSG_INVALID_DOUBLE", "MSG_INVALID_FLOAT", "MSG_INVALID_INTEGER", "MSG_INVALID_LONG", "MSG_INVALID_STRING", "MSG_INVALID_PROPERTY", "MSG_NO_PROPERTY_VALIDATOR_AVAILABLE", "VAL_LANDSCAPE", "VAL_NO", "VAL_PORTRAIT", "VAL_YES", "VAL_UNDEFINED", "common-core_release"}, k = 2, mv = {1, 9, 0})
public final class ConfigurationKt {

    @NotNull
    public static final String COLOR_TRANSPARENT = "#00000000";

    @NotNull
    public static final String MSG_DEPRECATED_CONFIGURATION_KEY = "The configuration key \"%s\" has been deprecated and will be removed in a future release, please use \"%s\" instead.";

    @NotNull
    public static final String MSG_INVALID_BOOLEAN = "Value \"%s\" is not a valid boolean value for parameter \"%s\".";

    @NotNull
    public static final String MSG_INVALID_COLOR = "Value \"%s\" is not a valid color value for parameter \"%s\".";

    @NotNull
    public static final String MSG_INVALID_DOUBLE = "Value \"%s\" is not a valid double value for parameter \"%s\".";

    @NotNull
    public static final String MSG_INVALID_DSPL_ORIENTATION = "Value \"%s\" is not a valid display orientation value for parameter \"%s\".";

    @NotNull
    public static final String MSG_INVALID_FLOAT = "Value \"%s\" is not a valid float value for parameter \"%s\".";

    @NotNull
    public static final String MSG_INVALID_INTEGER = "Value \"%s\" is not a valid integer value for parameter \"%s\".";

    @NotNull
    public static final String MSG_INVALID_LONG = "Value \"%s\" is not a valid long value for parameter \"%s\".";

    @NotNull
    public static final String MSG_INVALID_PROPERTY = "Value \"%s\" of property \"%s\" could not be validated by validator \"%s\".";

    @NotNull
    public static final String MSG_INVALID_STRING = "Value \"%s\" is not a valid string value for parameter \"%s\".";

    @NotNull
    public static final String MSG_NO_PROPERTY_VALIDATOR_AVAILABLE = "No validator available for property \"%s\".";

    @NotNull
    public static final String VAL_LANDSCAPE = "landscape";

    @NotNull
    public static final String VAL_NO = "NO";

    @NotNull
    public static final String VAL_PORTRAIT = "portrait";

    @NotNull
    public static final String VAL_UNDEFINED = "undefined";

    @NotNull
    public static final String VAL_YES = "YES";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static final String f66676a = Reflection.getOrCreateKotlinClass(Configuration.class).getSimpleName();
}
