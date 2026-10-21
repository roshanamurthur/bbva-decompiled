package kotlin.internal;

import com.bbva.networkplugin.command.impl.PatchCommand;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.internal.jdk8.JDK8PlatformImplementations;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PlatformImplementations.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0001\"\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "major", "minor", PatchCommand.ID, "", "apiVersionIsAtLeast", "Lkotlin/internal/PlatformImplementations;", "IMPLEMENTATIONS", "Lkotlin/internal/PlatformImplementations;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
public final class PlatformImplementationsKt {

    @JvmField
    @NotNull
    public static final PlatformImplementations IMPLEMENTATIONS = new JDK8PlatformImplementations();

    @SinceKotlin(version = "1.2")
    @PublishedApi
    public static final boolean apiVersionIsAtLeast(int i10, int i11, int i12) {
        return KotlinVersion.CURRENT.isAtLeast(i10, i11, i12);
    }
}
