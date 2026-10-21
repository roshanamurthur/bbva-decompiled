package androidx.window.core;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.networkplugin.command.impl.PatchCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.l;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Version.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0000\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\n\u001a\u00020\u0005H\u0016R\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/window/core/Version;", "", "", "toString", "other", "", "compareTo", "", "", "equals", GenerateActivationFormCommand.HASH_CODE, "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getMajor", "()I", "major", "q0", "getMinor", "minor", "r0", "getPatch", PatchCommand.ID, "s0", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "description", "Companion", "window_release"}, k = 1, mv = {1, 6, 0})
public final class Version implements Comparable<Version> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public static final Version f24111u0 = new Version(0, 0, 0, "");

    @NotNull
    public static final Version v0 = new Version(0, 1, 0, "");

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public static final Version f24112w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @NotNull
    public static final Version f24113x0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final int major;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public final int minor;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public final int patch;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String description;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Lazy f24118t0;

    /* JADX INFO: compiled from: Version.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/window/core/Version$Companion;", "", "()V", "CURRENT", "Landroidx/window/core/Version;", "getCURRENT", "()Landroidx/window/core/Version;", "UNKNOWN", "getUNKNOWN", "VERSION_0_1", "getVERSION_0_1", "VERSION_1_0", "getVERSION_1_0", "VERSION_PATTERN_STRING", "", "parse", "versionString", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Version getCURRENT() {
            return Version.f24113x0;
        }

        @NotNull
        public final Version getUNKNOWN() {
            return Version.f24111u0;
        }

        @NotNull
        public final Version getVERSION_0_1() {
            return Version.v0;
        }

        @NotNull
        public final Version getVERSION_1_0() {
            return Version.f24112w0;
        }

        @JvmStatic
        @Nullable
        public final Version parse(@Nullable String versionString) {
            if (versionString == null || l.isBlank(versionString)) {
                return null;
            }
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(versionString);
            if (!matcher.matches()) {
                return null;
            }
            String strGroup = matcher.group(1);
            Integer numValueOf = strGroup == null ? null : Integer.valueOf(Integer.parseInt(strGroup));
            if (numValueOf == null) {
                return null;
            }
            int iIntValue = numValueOf.intValue();
            String strGroup2 = matcher.group(2);
            Integer numValueOf2 = strGroup2 == null ? null : Integer.valueOf(Integer.parseInt(strGroup2));
            if (numValueOf2 == null) {
                return null;
            }
            int iIntValue2 = numValueOf2.intValue();
            String strGroup3 = matcher.group(3);
            Integer numValueOf3 = strGroup3 == null ? null : Integer.valueOf(Integer.parseInt(strGroup3));
            if (numValueOf3 == null) {
                return null;
            }
            int iIntValue3 = numValueOf3.intValue();
            String description = matcher.group(4) != null ? matcher.group(4) : "";
            Intrinsics.checkNotNullExpressionValue(description, "description");
            return new Version(iIntValue, iIntValue2, iIntValue3, description, null);
        }
    }

    /* JADX INFO: compiled from: Version.kt */
    public static final class a extends Lambda implements Function0<BigInteger> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final BigInteger invoke() {
            Version version = Version.this;
            return BigInteger.valueOf(version.getMajor()).shiftLeft(32).or(BigInteger.valueOf(version.getMinor())).shiftLeft(32).or(BigInteger.valueOf(version.getPatch()));
        }
    }

    static {
        Version version = new Version(1, 0, 0, "");
        f24112w0 = version;
        f24113x0 = version;
    }

    public /* synthetic */ Version(int i10, int i11, int i12, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, str);
    }

    @JvmStatic
    @Nullable
    public static final Version parse(@Nullable String str) {
        return INSTANCE.parse(str);
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof Version)) {
            return false;
        }
        Version version = (Version) other;
        return this.major == version.major && this.minor == version.minor && this.patch == version.patch;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public int hashCode() {
        return ((((527 + this.major) * 31) + this.minor) * 31) + this.patch;
    }

    @NotNull
    public String toString() {
        String str = this.description;
        String strStringPlus = l.isBlank(str) ^ true ? Intrinsics.stringPlus(Constant.DASH_STRING, str) : "";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.major);
        sb2.append('.');
        sb2.append(this.minor);
        sb2.append('.');
        return androidx.appcompat.widget.a.c(sb2, this.patch, strStringPlus);
    }

    public Version(int i10, int i11, int i12, String str) {
        this.major = i10;
        this.minor = i11;
        this.patch = i12;
        this.description = str;
        this.f24118t0 = LazyKt__LazyJVMKt.lazy(new a());
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Version other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Object value = this.f24118t0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-bigInteger>(...)");
        Object value2 = other.f24118t0.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "<get-bigInteger>(...)");
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }
}
