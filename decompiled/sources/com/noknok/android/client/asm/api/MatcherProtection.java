package com.noknok.android.client.asm.api;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'MATCHER_PROTECTION_SOFTWARE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes11.dex */
public final class MatcherProtection {
    public static final MatcherProtection MATCHER_PROTECTION_ON_CHIP;
    public static final MatcherProtection MATCHER_PROTECTION_SOFTWARE;
    public static final MatcherProtection MATCHER_PROTECTION_TEE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ MatcherProtection[] f63112b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Values f63113a;

    public static class Values {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private short f63114a;

        private Values() {
        }

        public /* synthetic */ Values(int i10) {
            this();
        }
    }

    static {
        int i10 = 0;
        Values values = new Values(i10);
        values.f63114a = (short) 1;
        MatcherProtection matcherProtection = new MatcherProtection("MATCHER_PROTECTION_SOFTWARE", 0, values);
        MATCHER_PROTECTION_SOFTWARE = matcherProtection;
        Values values2 = new Values(i10);
        values2.f63114a = (short) 2;
        MatcherProtection matcherProtection2 = new MatcherProtection("MATCHER_PROTECTION_TEE", 1, values2);
        MATCHER_PROTECTION_TEE = matcherProtection2;
        Values values3 = new Values(i10);
        values3.f63114a = (short) 4;
        MatcherProtection matcherProtection3 = new MatcherProtection("MATCHER_PROTECTION_ON_CHIP", 2, values3);
        MATCHER_PROTECTION_ON_CHIP = matcherProtection3;
        f63112b = new MatcherProtection[]{matcherProtection, matcherProtection2, matcherProtection3};
    }

    private MatcherProtection(String str, int i10, Values values) {
        super(str, i10);
        this.f63113a = values;
    }

    public static MatcherProtection valueOf(String str) {
        return (MatcherProtection) Enum.valueOf(MatcherProtection.class, str);
    }

    public static MatcherProtection[] values() {
        return (MatcherProtection[]) f63112b.clone();
    }

    public short getUafValue() {
        return this.f63113a.f63114a;
    }
}
