package okio;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.-DeprecatedUpgrade, reason: invalid class name */
/* JADX INFO: compiled from: DeprecatedUpgrade.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lokio/-DeprecatedOkio;", "a", "Lokio/-DeprecatedOkio;", "getOkio", "()Lokio/-DeprecatedOkio;", "Okio", "Lokio/-DeprecatedUtf8;", "b", "Lokio/-DeprecatedUtf8;", "getUtf8", "()Lokio/-DeprecatedUtf8;", "Utf8", "okio"}, k = 2, mv = {1, 9, 0})
@JvmName(name = "-DeprecatedUpgrade")
public final class DeprecatedUpgrade {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final DeprecatedOkio f86319a = DeprecatedOkio.INSTANCE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final DeprecatedUtf8 f86320b = DeprecatedUtf8.INSTANCE;

    @NotNull
    public static final DeprecatedOkio getOkio() {
        return f86319a;
    }

    @NotNull
    public static final DeprecatedUtf8 getUtf8() {
        return f86320b;
    }
}
