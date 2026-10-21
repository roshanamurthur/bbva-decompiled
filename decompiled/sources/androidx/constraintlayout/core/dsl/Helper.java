package androidx.constraintlayout.core.dsl;

import ad.d;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Helper {
    protected static final Map<Constraint.Side, String> sideMap;
    protected static final Map<Type, String> typeMap;
    protected String config;
    protected Map<String, String> configMap;
    protected final String name;
    protected HelperType type;

    public static final class HelperType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f18622a;

        public HelperType(String str) {
            this.f18622a = str;
        }

        public String toString() {
            return this.f18622a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type BARRIER;
        public static final Type HORIZONTAL_CHAIN;
        public static final Type HORIZONTAL_GUIDELINE;
        public static final Type VERTICAL_CHAIN;
        public static final Type VERTICAL_GUIDELINE;

        static {
            Type type = new Type("VERTICAL_GUIDELINE", 0);
            VERTICAL_GUIDELINE = type;
            Type type2 = new Type("HORIZONTAL_GUIDELINE", 1);
            HORIZONTAL_GUIDELINE = type2;
            Type type3 = new Type("VERTICAL_CHAIN", 2);
            VERTICAL_CHAIN = type3;
            Type type4 = new Type("HORIZONTAL_CHAIN", 3);
            HORIZONTAL_CHAIN = type4;
            Type type5 = new Type("BARRIER", 4);
            BARRIER = type5;
            $VALUES = new Type[]{type, type2, type3, type4, type5};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    static {
        HashMap map = new HashMap();
        sideMap = map;
        map.put(Constraint.Side.LEFT, "'left'");
        map.put(Constraint.Side.RIGHT, "'right'");
        map.put(Constraint.Side.TOP, "'top'");
        map.put(Constraint.Side.BOTTOM, "'bottom'");
        map.put(Constraint.Side.START, "'start'");
        map.put(Constraint.Side.END, "'end'");
        map.put(Constraint.Side.BASELINE, "'baseline'");
        HashMap map2 = new HashMap();
        typeMap = map2;
        map2.put(Type.VERTICAL_GUIDELINE, "vGuideline");
        map2.put(Type.HORIZONTAL_GUIDELINE, "hGuideline");
        map2.put(Type.VERTICAL_CHAIN, "vChain");
        map2.put(Type.HORIZONTAL_CHAIN, "hChain");
        map2.put(Type.BARRIER, "barrier");
    }

    public Helper(String str, HelperType helperType) {
        this.type = null;
        this.configMap = new HashMap();
        this.name = str;
        this.type = helperType;
    }

    public static void main(String[] strArr) {
        System.out.println(new Barrier("abc", "['a1', 'b2']").toString());
    }

    public void append(Map<String, String> map, StringBuilder sb2) {
        if (map.isEmpty()) {
            return;
        }
        for (String str : map.keySet()) {
            sb2.append(str);
            sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
            sb2.append(map.get(str));
            sb2.append(",\n");
        }
    }

    public Map<String, String> convertConfigToMap() {
        String str = this.config;
        if (str == null || str.length() == 0) {
            return null;
        }
        HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder();
        String string = "";
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.config.length(); i12++) {
            char cCharAt = this.config.charAt(i12);
            if (cCharAt == ':') {
                string = sb2.toString();
                sb2.setLength(0);
            } else if (cCharAt == ',' && i10 == 0 && i11 == 0) {
                map.put(string, sb2.toString());
                sb2.setLength(0);
                string = "";
            } else if (cCharAt != ' ') {
                if (cCharAt == '[') {
                    i10++;
                } else if (cCharAt == ']') {
                    i10--;
                } else if (cCharAt == '{') {
                    i11++;
                } else if (cCharAt == '}') {
                    i11--;
                }
                sb2.append(cCharAt);
            }
        }
        map.put(string, sb2.toString());
        return map;
    }

    public String getConfig() {
        return this.config;
    }

    public String getId() {
        return this.name;
    }

    public HelperType getType() {
        return this.type;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(d.f(new StringBuilder(), this.name, ":{\n"));
        if (this.type != null) {
            sb2.append("type:'");
            sb2.append(this.type.toString());
            sb2.append("',\n");
        }
        Map<String, String> map = this.configMap;
        if (map != null) {
            append(map, sb2);
        }
        sb2.append("},\n");
        return sb2.toString();
    }

    public Helper(String str, HelperType helperType, String str2) {
        this.type = null;
        this.configMap = new HashMap();
        this.name = str;
        this.type = helperType;
        this.config = str2;
        this.configMap = convertConfigToMap();
    }
}
