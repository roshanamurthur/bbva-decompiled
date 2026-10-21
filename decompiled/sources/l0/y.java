package l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: BottomSheetScaffold.kt */
/* JADX INFO: loaded from: classes.dex */
public final class y {
    private static final /* synthetic */ y[] $VALUES;
    public static final y Body;
    public static final y Sheet;
    public static final y Snackbar;
    public static final y TopBar;

    static {
        y yVar = new y("TopBar", 0);
        TopBar = yVar;
        y yVar2 = new y("Body", 1);
        Body = yVar2;
        y yVar3 = new y("Sheet", 2);
        Sheet = yVar3;
        y yVar4 = new y("Snackbar", 3);
        Snackbar = yVar4;
        $VALUES = new y[]{yVar, yVar2, yVar3, yVar4};
    }

    public y() {
        throw null;
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) $VALUES.clone();
    }
}
