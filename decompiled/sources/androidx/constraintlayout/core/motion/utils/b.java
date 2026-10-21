package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: compiled from: TypedValues.java */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b {
    public static int a(String str) {
        str.getClass();
        switch (str) {
            case "dimension":
                return 905;
            case "reference":
                return 906;
            case "string":
                return 903;
            case "boolean":
                return 904;
            case "color":
                return 902;
            case "float":
                return 901;
            case "integer":
                return TypedValues.Custom.TYPE_INT;
            default:
                return -1;
        }
    }
}
