package com.veridas;

import kotlin.Metadata;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Veridas.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/veridas/Veridas;", "", "", "DATE_FORMAT", "Ljava/lang/String;", "EXIF_FULL_DATE_FORMAT", "EXIF_SHORT_DATE_FORMAT", "UTC", "Lkotlin/text/Regex;", "a", "Lkotlin/text/Regex;", "getSHORT_DATE_PATTERN", "()Lkotlin/text/Regex;", "SHORT_DATE_PATTERN", "b", "getFULL_DATE_PATTERN", "FULL_DATE_PATTERN", "REVISION", "MIME_TYPE_PATTERN", "JPEG_MIME_TYPE", "BASE64_MIME_TYPE", "US_ASCII", "<init>", "()V", "common-core-jvm"}, k = 1, mv = {1, 9, 0})
public final class Veridas {

    @NotNull
    public static final String BASE64_MIME_TYPE = "application/base64";

    @NotNull
    public static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    @NotNull
    public static final String EXIF_FULL_DATE_FORMAT = "yyyy:MM:dd HH:mm:ss.SSS";

    @NotNull
    public static final String EXIF_SHORT_DATE_FORMAT = "yyyy:MM:dd HH:mm:ss";

    @NotNull
    public static final String JPEG_MIME_TYPE = "image/jpeg";

    @NotNull
    public static final String MIME_TYPE_PATTERN = "\\w+/[-.\\w]+(?:\\+[-.\\w]+)?";

    @NotNull
    public static final String REVISION = "20201101";

    @NotNull
    public static final String US_ASCII = "US-ASCII";

    @NotNull
    public static final String UTC = "UTC";

    @NotNull
    public static final Veridas INSTANCE = new Veridas();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Regex SHORT_DATE_PATTERN = new Regex("^\\d{4}:\\d{2}:\\d{2} \\d{2}:\\d{2}:\\d{2}$");

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Regex FULL_DATE_PATTERN = new Regex("^\\d{4}:\\d{2}:\\d{2} \\d{2}:\\d{2}:\\d{2}\\.\\d{3}$");

    @NotNull
    public final Regex getFULL_DATE_PATTERN() {
        return FULL_DATE_PATTERN;
    }

    @NotNull
    public final Regex getSHORT_DATE_PATTERN() {
        return SHORT_DATE_PATTERN;
    }
}
