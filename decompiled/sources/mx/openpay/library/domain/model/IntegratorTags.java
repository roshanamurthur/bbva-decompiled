package mx.openpay.library.domain.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'MPOS' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: IntegratorTags.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lmx/openpay/library/domain/model/IntegratorTags;", "", "", "productTypeToP", "Ljava/lang/String;", "getProductTypeToP", "()Ljava/lang/String;", "productTypePL", "getProductTypePL", "productType", "getProductType", "origin", "getOrigin", "GLOMO", "MPOS", "POS_AUTONOMOUS", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class IntegratorTags {
    private static final /* synthetic */ IntegratorTags[] $VALUES;
    public static final IntegratorTags GLOMO;
    public static final IntegratorTags MPOS;
    public static final IntegratorTags POS_AUTONOMOUS;

    @NotNull
    private final String origin;

    @NotNull
    private final String productType;

    @NotNull
    private final String productTypePL;

    @NotNull
    private final String productTypeToP;

    static {
        IntegratorTags integratorTags = new IntegratorTags(0, "GLOMO", "TAP_ON_PHONE", "PAYMENT_LINK", "MPOS", "ZONA_DE_COBRO");
        GLOMO = integratorTags;
        String str = "MPOS";
        IntegratorTags integratorTags2 = new IntegratorTags(str, 1, str, str);
        MPOS = integratorTags2;
        String str2 = "POS_AUTONOMO";
        IntegratorTags integratorTags3 = new IntegratorTags("POS_AUTONOMOUS", 2, str2, str2);
        POS_AUTONOMOUS = integratorTags3;
        $VALUES = new IntegratorTags[]{integratorTags, integratorTags2, integratorTags3};
    }

    public IntegratorTags(int i10, String str, String str2, String str3, String str4, String str5) {
        super(str, i10);
        this.productTypeToP = str2;
        this.productTypePL = str3;
        this.productType = str4;
        this.origin = str5;
    }

    public static IntegratorTags valueOf(String str) {
        return (IntegratorTags) Enum.valueOf(IntegratorTags.class, str);
    }

    public static IntegratorTags[] values() {
        return (IntegratorTags[]) $VALUES.clone();
    }

    @NotNull
    public final String getOrigin() {
        return this.origin;
    }

    @NotNull
    public final String getProductType() {
        return this.productType;
    }

    @NotNull
    public final String getProductTypePL() {
        return this.productTypePL;
    }

    @NotNull
    public final String getProductTypeToP() {
        return this.productTypeToP;
    }

    public /* synthetic */ IntegratorTags(String str, int i10, String str2, String str3) {
        this(i10, str, "", str2, str3, "APP_COBRO");
    }
}
