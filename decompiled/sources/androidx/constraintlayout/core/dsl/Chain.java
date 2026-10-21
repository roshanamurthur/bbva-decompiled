package androidx.constraintlayout.core.dsl;

import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes.dex */
public abstract class Chain extends Helper {
    protected static final Map<Style, String> styleMap;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Style f18576a;
    protected ArrayList<Ref> references;

    public class Anchor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Constraint.Side f18577a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18579c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Constraint.Anchor f18578b = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f18580d = Integer.MIN_VALUE;

        public Anchor(Constraint.Side side) {
            this.f18577a = side;
        }

        public void build(StringBuilder sb2) {
            if (this.f18578b != null) {
                sb2.append(this.f18577a.toString().toLowerCase());
                sb2.append(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER);
                sb2.append(this);
                sb2.append(",\n");
            }
        }

        public String getId() {
            return Chain.this.name;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(Constant.BRACKET_OPEN);
            if (this.f18578b != null) {
                sb2.append("'");
                sb2.append(this.f18578b.getId());
                sb2.append("','");
                sb2.append(this.f18578b.f18607a.toString().toLowerCase());
                sb2.append("'");
            }
            if (this.f18579c != 0) {
                sb2.append(",");
                sb2.append(this.f18579c);
            }
            if (this.f18580d != Integer.MIN_VALUE) {
                if (this.f18579c == 0) {
                    sb2.append(",0,");
                    sb2.append(this.f18580d);
                } else {
                    sb2.append(",");
                    sb2.append(this.f18580d);
                }
            }
            sb2.append(Constant.BRACKET_CLOSE);
            return sb2.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Style {
        private static final /* synthetic */ Style[] $VALUES;
        public static final Style PACKED;
        public static final Style SPREAD;
        public static final Style SPREAD_INSIDE;

        static {
            Style style = new Style("PACKED", 0);
            PACKED = style;
            Style style2 = new Style("SPREAD", 1);
            SPREAD = style2;
            Style style3 = new Style("SPREAD_INSIDE", 2);
            SPREAD_INSIDE = style3;
            $VALUES = new Style[]{style, style2, style3};
        }

        public Style() {
            throw null;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }
    }

    static {
        HashMap map = new HashMap();
        styleMap = map;
        map.put(Style.SPREAD, "'spread'");
        map.put(Style.SPREAD_INSIDE, "'spread_inside'");
        map.put(Style.PACKED, "'packed'");
    }

    public Chain(String str) {
        super(str, new Helper.HelperType(""));
        this.f18576a = null;
        this.references = new ArrayList<>();
    }

    public Chain addReference(Ref ref) {
        this.references.add(ref);
        this.configMap.put(SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, referencesToString());
        return this;
    }

    public Style getStyle() {
        return this.f18576a;
    }

    public String referencesToString() {
        if (this.references.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(Constant.BRACKET_OPEN);
        Iterator<Ref> it = this.references.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().toString());
        }
        sb2.append(Constant.BRACKET_CLOSE);
        return sb2.toString();
    }

    public void setStyle(Style style) {
        this.f18576a = style;
        this.configMap.put("style", styleMap.get(style));
    }

    public Chain addReference(String str) {
        return addReference(Ref.parseStringToRef(str));
    }
}
