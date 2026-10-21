package com.bbva.ethermobilesdk.pinning.constant;

import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Constant.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u001c\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u000e\u0010\r\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"ALGORITHM_PUBLIC_KEY", "", "ALGORITHM_VERIFY_SIGNATURE", "BAD_COUNTRY_2LDS", "", "getBAD_COUNTRY_2LDS", "()Ljava/util/List;", "CERTIFICATE_TYPE_X509", "LOCALE", "Ljava/util/Locale;", "kotlin.jvm.PlatformType", "getLOCALE", "()Ljava/util/Locale;", "LOG_ORIGIN", "pinning_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ConstantKt {

    @NotNull
    public static final String ALGORITHM_PUBLIC_KEY = "RSA";

    @NotNull
    public static final String ALGORITHM_VERIFY_SIGNATURE = "SHA256withRSA";

    @NotNull
    public static final String CERTIFICATE_TYPE_X509 = "X.509";

    @NotNull
    public static final String LOG_ORIGIN = "com.bbva.ethermobilesdk.pinning";

    @NotNull
    private static final List<String> BAD_COUNTRY_2LDS = CollectionsKt___CollectionsKt.sorted(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"ac", "co", "com", "ed", "edu", "go", "gouv", "gov", "info", "lg", "ne", "net", "or", "org"}));
    private static final Locale LOCALE = Locale.US;

    @NotNull
    public static final List<String> getBAD_COUNTRY_2LDS() {
        return BAD_COUNTRY_2LDS;
    }

    public static final Locale getLOCALE() {
        return LOCALE;
    }
}
