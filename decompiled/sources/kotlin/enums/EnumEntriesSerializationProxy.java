package kotlin.enums;

import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EnumEntriesSerializationProxy.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000b*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00060\u0003j\u0002`\u0004:\u0001\fB\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0006\u001a\u00020\u0005H\u0002¨\u0006\r"}, d2 = {"Lkotlin/enums/EnumEntriesSerializationProxy;", "", ExifInterface.LONGITUDE_EAST, "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "", "entries", "<init>", "([Ljava/lang/Enum;)V", "q0", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public final class EnumEntriesSerializationProxy<E extends Enum<E>> implements Serializable {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    private static final a f79610q0 = new a(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Class<E> f79611p0;

    /* JADX INFO: compiled from: EnumEntriesSerializationProxy.kt */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public EnumEntriesSerializationProxy(@NotNull E[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Class<E> cls = (Class<E>) entries.getClass().getComponentType();
        Intrinsics.checkNotNull(cls);
        this.f79611p0 = cls;
    }

    private final Object readResolve() {
        E[] enumConstants = this.f79611p0.getEnumConstants();
        Intrinsics.checkNotNullExpressionValue(enumConstants, "getEnumConstants(...)");
        return EnumEntriesKt.enumEntries(enumConstants);
    }
}
