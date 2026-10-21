package androidx.core.os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.RequiresOptIn;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BuildCompat.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0007\u001a\u00020\u0005H\u0007J\b\u0010\b\u001a\u00020\u0005H\u0007J\b\u0010\t\u001a\u00020\u0005H\u0007J\b\u0010\n\u001a\u00020\u0005H\u0007J\b\u0010\u000b\u001a\u00020\u0005H\u0007J\b\u0010\f\u001a\u00020\u0005H\u0007J\b\u0010\r\u001a\u00020\u0005H\u0007J\b\u0010\u000e\u001a\u00020\u0005H\u0007J\b\u0010\u000f\u001a\u00020\u0005H\u0007J\b\u0010\u0010\u001a\u00020\u0005H\u0007J\b\u0010\u0011\u001a\u00020\u0005H\u0007J\b\u0010\u0012\u001a\u00020\u0005H\u0007R\u0014\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015¨\u0006\u001d"}, d2 = {"Landroidx/core/os/BuildCompat;", "", "", "codename", "buildCodename", "", "isAtLeastPreReleaseCodename", "isAtLeastN", "isAtLeastNMR1", "isAtLeastO", "isAtLeastOMR1", "isAtLeastP", "isAtLeastQ", "isAtLeastR", "isAtLeastS", "isAtLeastSv2", "isAtLeastT", "isAtLeastU", "isAtLeastV", "", "R_EXTENSION_INT", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "S_EXTENSION_INT", "T_EXTENSION_INT", "AD_SERVICES_EXTENSION_INT", "<init>", "()V", "a", "PrereleaseSdkCheck", "core_release"}, k = 1, mv = {1, 8, 0})
public final class BuildCompat {

    @ChecksSdkIntAtLeast(extension = DurationKt.NANOS_IN_MILLIS)
    @JvmField
    public static final int AD_SERVICES_EXTENSION_INT;

    @NotNull
    public static final BuildCompat INSTANCE = new BuildCompat();

    @ChecksSdkIntAtLeast(extension = 30)
    @JvmField
    public static final int R_EXTENSION_INT;

    @ChecksSdkIntAtLeast(extension = 31)
    @JvmField
    public static final int S_EXTENSION_INT;

    @ChecksSdkIntAtLeast(extension = 33)
    @JvmField
    public static final int T_EXTENSION_INT;

    /* JADX INFO: compiled from: BuildCompat.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/core/os/BuildCompat$PrereleaseSdkCheck;", "", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @RequiresOptIn
    @Retention(RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(AnnotationRetention.BINARY)
    public @interface PrereleaseSdkCheck {
    }

    /* JADX INFO: compiled from: BuildCompat.kt */
    @RequiresApi(30)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f19992a = new a();

        @DoNotInline
        public final int a(int i10) {
            return SdkExtensions.getExtensionVersion(i10);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        a aVar = a.f19992a;
        R_EXTENSION_INT = i10 >= 30 ? aVar.a(30) : 0;
        S_EXTENSION_INT = i10 >= 30 ? aVar.a(31) : 0;
        T_EXTENSION_INT = i10 >= 30 ? aVar.a(33) : 0;
        AD_SERVICES_EXTENSION_INT = i10 >= 30 ? aVar.a(DurationKt.NANOS_IN_MILLIS) : 0;
    }

    @Deprecated(message = "Android N is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 24`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 24", imports = {}))
    @JvmStatic
    @ChecksSdkIntAtLeast(api = 24)
    public static final boolean isAtLeastN() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Deprecated(message = "Android N MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 25`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 25", imports = {}))
    @JvmStatic
    @ChecksSdkIntAtLeast(api = 25)
    public static final boolean isAtLeastNMR1() {
        return Build.VERSION.SDK_INT >= 25;
    }

    @Deprecated(message = "Android O is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead use `Build.VERSION.SDK_INT >= 26`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 26", imports = {}))
    @JvmStatic
    @ChecksSdkIntAtLeast(api = 26)
    public static final boolean isAtLeastO() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @Deprecated(message = "Android O MR1 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 27`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 27", imports = {}))
    @JvmStatic
    @ChecksSdkIntAtLeast(api = 27)
    public static final boolean isAtLeastOMR1() {
        return Build.VERSION.SDK_INT >= 27;
    }

    @Deprecated(message = "Android P is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 28`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 28", imports = {}))
    @JvmStatic
    @ChecksSdkIntAtLeast(api = 28)
    public static final boolean isAtLeastP() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public static final boolean isAtLeastPreReleaseCodename(@NotNull String codename, @NotNull String buildCodename) {
        Intrinsics.checkNotNullParameter(codename, "codename");
        Intrinsics.checkNotNullParameter(buildCodename, "buildCodename");
        if (Intrinsics.areEqual("REL", buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = codename.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    @Deprecated(message = "Android Q is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 29`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 29", imports = {}))
    @JvmStatic
    @ChecksSdkIntAtLeast(api = 29)
    public static final boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @Deprecated(message = "Android R is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 30`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 30", imports = {}))
    @JvmStatic
    @ChecksSdkIntAtLeast(api = 30)
    public static final boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @Deprecated(message = "Android S is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 31`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 31", imports = {}))
    @JvmStatic
    @ChecksSdkIntAtLeast(api = 31, codename = ExifInterface.LATITUDE_SOUTH)
    public static final boolean isAtLeastS() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31) {
            if (i10 >= 30) {
                String CODENAME = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
                if (isAtLeastPreReleaseCodename(ExifInterface.LATITUDE_SOUTH, CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    @Deprecated(message = "Android Sv2 is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 32`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 32", imports = {}))
    @JvmStatic
    @ChecksSdkIntAtLeast(api = 32, codename = "Sv2")
    public static final boolean isAtLeastSv2() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 32) {
            if (i10 >= 31) {
                String CODENAME = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
                if (isAtLeastPreReleaseCodename("Sv2", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    @Deprecated(message = "Android Tiramisu is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 33`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 33", imports = {}))
    @JvmStatic
    @ChecksSdkIntAtLeast(api = 33, codename = "Tiramisu")
    public static final boolean isAtLeastT() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33) {
            if (i10 >= 32) {
                String CODENAME = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
                if (isAtLeastPreReleaseCodename("Tiramisu", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    @Deprecated(message = "Android UpsideDownCase is a finalized release and this method is no longer necessary. It will be removed in a future release of this library. Instead, use `Build.VERSION.SDK_INT >= 34`.", replaceWith = @ReplaceWith(expression = "android.os.Build.VERSION.SDK_INT >= 34", imports = {}))
    @JvmStatic
    @ChecksSdkIntAtLeast(api = 34, codename = "UpsideDownCake")
    public static final boolean isAtLeastU() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 34) {
            if (i10 >= 33) {
                String CODENAME = Build.VERSION.CODENAME;
                Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
                if (isAtLeastPreReleaseCodename("UpsideDownCake", CODENAME)) {
                }
            }
            return false;
        }
        return true;
    }

    @JvmStatic
    @ChecksSdkIntAtLeast(codename = "VanillaIceCream")
    @PrereleaseSdkCheck
    public static final boolean isAtLeastV() {
        if (Build.VERSION.SDK_INT >= 34) {
            String CODENAME = Build.VERSION.CODENAME;
            Intrinsics.checkNotNullExpressionValue(CODENAME, "CODENAME");
            if (isAtLeastPreReleaseCodename("VanillaIceCream", CODENAME)) {
                return true;
            }
        }
        return false;
    }
}
