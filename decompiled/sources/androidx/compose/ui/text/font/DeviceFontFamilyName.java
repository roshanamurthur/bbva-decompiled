package androidx.compose.ui.text.font;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeviceFontFamilyNameFont.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u0013\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/font/DeviceFontFamilyName;", "", "", "toString-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Ljava/lang/String;)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "a", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "constructor-impl", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
@SourceDebugExtension({"SMAP\nDeviceFontFamilyNameFont.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFontFamilyNameFont.kt\nandroidx/compose/ui/text/font/DeviceFontFamilyName\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
public final class DeviceFontFamilyName {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    public /* synthetic */ DeviceFontFamilyName(String str) {
        this.name = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DeviceFontFamilyName m4029boximpl(String str) {
        return new DeviceFontFamilyName(str);
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m4030constructorimpl(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (name.length() > 0) {
            return name;
        }
        throw new IllegalArgumentException("name may not be empty".toString());
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4031equalsimpl(String str, Object obj) {
        return (obj instanceof DeviceFontFamilyName) && Intrinsics.areEqual(str, ((DeviceFontFamilyName) obj).m4035unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4032equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4033hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4034toStringimpl(String str) {
        return androidx.camera.core.impl.utils.a.a("DeviceFontFamilyName(name=", str, RootService.CLOSE_BRACKET);
    }

    public boolean equals(Object obj) {
        return m4031equalsimpl(this.name, obj);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return m4033hashCodeimpl(this.name);
    }

    public String toString() {
        return m4034toStringimpl(this.name);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m4035unboximpl() {
        return this.name;
    }
}
