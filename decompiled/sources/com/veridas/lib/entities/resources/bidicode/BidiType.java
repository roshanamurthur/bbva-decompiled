package com.veridas.lib.entities.resources.bidicode;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v4 com.veridas.lib.entities.resources.bidicode.BidiType[], still in use, count: 1, list:
  (r11v4 com.veridas.lib.entities.resources.bidicode.BidiType[]) from 0x0065: INVOKE (r11v4 com.veridas.lib.entities.resources.bidicode.BidiType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:102)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: BidiType.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/veridas/lib/entities/resources/bidicode/BidiType;", "", "", "bidiName", "Ljava/lang/String;", "getBidiName", "()Ljava/lang/String;", "Companion", "CODE_39", "CODE_128", "DATA_MATRIX", "ITF", "PDF_417", "QR_CODE", "CODABAR", "common-core-jvm"}, k = 1, mv = {1, 9, 0})
@Serializable
public final class BidiType {
    CODE_39("code39"),
    CODE_128("code128"),
    DATA_MATRIX("datamatrix"),
    ITF("itf"),
    PDF_417("pdf417"),
    QR_CODE("datamatrix"),
    CODABAR("codabar");

    private static final /* synthetic */ EnumEntries $ENTRIES;

    @NotNull
    private final String bidiName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) a.f67211p0);

    /* JADX INFO: compiled from: BidiType.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nHÆ\u0001¨\u0006\u000b"}, d2 = {"Lcom/veridas/lib/entities/resources/bidicode/BidiType$Companion;", "", "()V", "getCodeTypeFrom", "Lcom/veridas/lib/entities/resources/bidicode/BidiType;", "ordinal", "", "getNameFrom", "", "serializer", "Lkotlinx/serialization/KSerializer;", "common-core-jvm"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BidiType getCodeTypeFrom(int ordinal) {
            int iOrdinal = ((BidiType) CollectionsKt___CollectionsKt.last((List) BidiType.getEntries())).ordinal();
            if (ordinal <= iOrdinal) {
                return BidiType.getEntries().get(ordinal);
            }
            throw new IllegalStateException(("Ordinal value should be less than: " + iOrdinal).toString());
        }

        @NotNull
        public final String getNameFrom(int ordinal) {
            return getCodeTypeFrom(ordinal).getBidiName();
        }

        @NotNull
        public final KSerializer<BidiType> serializer() {
            return (KSerializer) BidiType.$cachedSerializer$delegate.getValue();
        }
    }

    /* JADX INFO: compiled from: BidiType.kt */
    public static final class a extends Lambda implements Function0<KSerializer<Object>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f67211p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final KSerializer<Object> invoke() {
            return EnumsKt.createSimpleEnumSerializer("com.veridas.lib.entities.resources.bidicode.BidiType", BidiType.values());
        }
    }

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(new BidiType[]{r0, r1, r2, r4, r8, r9, r7});
    }

    public BidiType(String str) {
        super(str, i);
        this.bidiName = str;
    }

    @NotNull
    public static EnumEntries<BidiType> getEntries() {
        return $ENTRIES;
    }

    public static BidiType valueOf(String str) {
        return (BidiType) Enum.valueOf(BidiType.class, str);
    }

    public static BidiType[] values() {
        return (BidiType[]) $VALUES.clone();
    }

    @NotNull
    public final String getBidiName() {
        return this.bidiName;
    }
}
