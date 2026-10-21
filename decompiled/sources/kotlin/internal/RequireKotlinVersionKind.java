package kotlin.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.2")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/internal/RequireKotlinVersionKind;", "", "LANGUAGE_VERSION", "COMPILER_VERSION", "API_VERSION", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
public final class RequireKotlinVersionKind {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RequireKotlinVersionKind[] $VALUES;
    public static final RequireKotlinVersionKind API_VERSION;
    public static final RequireKotlinVersionKind COMPILER_VERSION;
    public static final RequireKotlinVersionKind LANGUAGE_VERSION;

    static {
        RequireKotlinVersionKind requireKotlinVersionKind = new RequireKotlinVersionKind("LANGUAGE_VERSION", 0);
        LANGUAGE_VERSION = requireKotlinVersionKind;
        RequireKotlinVersionKind requireKotlinVersionKind2 = new RequireKotlinVersionKind("COMPILER_VERSION", 1);
        COMPILER_VERSION = requireKotlinVersionKind2;
        RequireKotlinVersionKind requireKotlinVersionKind3 = new RequireKotlinVersionKind("API_VERSION", 2);
        API_VERSION = requireKotlinVersionKind3;
        RequireKotlinVersionKind[] requireKotlinVersionKindArr = {requireKotlinVersionKind, requireKotlinVersionKind2, requireKotlinVersionKind3};
        $VALUES = requireKotlinVersionKindArr;
        $ENTRIES = EnumEntriesKt.enumEntries(requireKotlinVersionKindArr);
    }

    public RequireKotlinVersionKind() {
        throw null;
    }

    @NotNull
    public static EnumEntries<RequireKotlinVersionKind> getEntries() {
        return $ENTRIES;
    }

    public static RequireKotlinVersionKind valueOf(String str) {
        return (RequireKotlinVersionKind) Enum.valueOf(RequireKotlinVersionKind.class, str);
    }

    public static RequireKotlinVersionKind[] values() {
        return (RequireKotlinVersionKind[]) $VALUES.clone();
    }
}
