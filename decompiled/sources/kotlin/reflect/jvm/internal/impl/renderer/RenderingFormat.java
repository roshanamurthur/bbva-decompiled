package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: DescriptorRenderer.kt */
/* JADX INFO: loaded from: classes12.dex */
public abstract class RenderingFormat {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RenderingFormat[] $VALUES;
    public static final RenderingFormat HTML;
    public static final RenderingFormat PLAIN;

    /* JADX INFO: compiled from: DescriptorRenderer.kt */
    public static final class a extends RenderingFormat {
        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        @NotNull
        public String escape(@NotNull String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return l.replace$default(l.replace$default(string, "<", "&lt;", false, 4, (Object) null), ">", "&gt;", false, 4, (Object) null);
        }
    }

    /* JADX INFO: compiled from: DescriptorRenderer.kt */
    public static final class b extends RenderingFormat {
        @Override // kotlin.reflect.jvm.internal.impl.renderer.RenderingFormat
        @NotNull
        public String escape(@NotNull String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return string;
        }
    }

    static {
        b bVar = new b("PLAIN", 0, null);
        PLAIN = bVar;
        a aVar = new a("HTML", 1, null);
        HTML = aVar;
        RenderingFormat[] renderingFormatArr = {bVar, aVar};
        $VALUES = renderingFormatArr;
        $ENTRIES = EnumEntriesKt.enumEntries(renderingFormatArr);
    }

    public RenderingFormat() {
        throw null;
    }

    public RenderingFormat(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        super(str, i10);
    }

    public static RenderingFormat valueOf(String str) {
        return (RenderingFormat) Enum.valueOf(RenderingFormat.class, str);
    }

    public static RenderingFormat[] values() {
        return (RenderingFormat[]) $VALUES.clone();
    }

    @NotNull
    public abstract String escape(@NotNull String str);
}
