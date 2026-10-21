package kotlin.io.path;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PathWalkOption.kt */
/* JADX INFO: loaded from: classes12.dex */
@SinceKotlin(version = "1.7")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/io/path/PathWalkOption;", "", "INCLUDE_DIRECTORIES", "BREADTH_FIRST", "FOLLOW_LINKS", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0})
@ExperimentalPathApi
public final class PathWalkOption {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PathWalkOption[] $VALUES;
    public static final PathWalkOption BREADTH_FIRST;
    public static final PathWalkOption FOLLOW_LINKS;
    public static final PathWalkOption INCLUDE_DIRECTORIES;

    static {
        PathWalkOption pathWalkOption = new PathWalkOption("INCLUDE_DIRECTORIES", 0);
        INCLUDE_DIRECTORIES = pathWalkOption;
        PathWalkOption pathWalkOption2 = new PathWalkOption("BREADTH_FIRST", 1);
        BREADTH_FIRST = pathWalkOption2;
        PathWalkOption pathWalkOption3 = new PathWalkOption("FOLLOW_LINKS", 2);
        FOLLOW_LINKS = pathWalkOption3;
        PathWalkOption[] pathWalkOptionArr = {pathWalkOption, pathWalkOption2, pathWalkOption3};
        $VALUES = pathWalkOptionArr;
        $ENTRIES = EnumEntriesKt.enumEntries(pathWalkOptionArr);
    }

    public PathWalkOption() {
        throw null;
    }

    @NotNull
    public static EnumEntries<PathWalkOption> getEntries() {
        return $ENTRIES;
    }

    public static PathWalkOption valueOf(String str) {
        return (PathWalkOption) Enum.valueOf(PathWalkOption.class, str);
    }

    public static PathWalkOption[] values() {
        return (PathWalkOption[]) $VALUES.clone();
    }
}
