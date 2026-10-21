package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LineBreak.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087@\u0018\u0000 \u001d2\u00020\u0001:\u0004\u001d\u001e\u001f B$\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0017\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0011\u0088\u0001!\u0092\u0001\u00020\u000fø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/style/LineBreak;", "", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "strategy", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "strictness", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "wordBreak", "copy-gijOMQM", "(IIII)I", "copy", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "getStrategy-fcGXIks", "getStrictness-usljTpc", "getWordBreak-jp8hJ3c", "constructor-impl", "(III)I", "Companion", "Strategy", "Strictness", "WordBreak", "mask", "ui-text_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class LineBreak {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f18224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f18225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f18226d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18227a;

    /* JADX INFO: compiled from: LineBreak.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Companion;", "", "()V", "Heading", "Landroidx/compose/ui/text/style/LineBreak;", "getHeading-rAG3T2k", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Paragraph", "getParagraph-rAG3T2k", "Simple", "getSimple-rAG3T2k", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getHeading-rAG3T2k, reason: not valid java name */
        public final int m4231getHeadingrAG3T2k() {
            return LineBreak.f18225c;
        }

        /* JADX INFO: renamed from: getParagraph-rAG3T2k, reason: not valid java name */
        public final int m4232getParagraphrAG3T2k() {
            return LineBreak.f18226d;
        }

        /* JADX INFO: renamed from: getSimple-rAG3T2k, reason: not valid java name */
        public final int m4233getSimplerAG3T2k() {
            return LineBreak.f18224b;
        }
    }

    static {
        Strategy.Companion companion = Strategy.INSTANCE;
        int iM4243getSimplefcGXIks = companion.m4243getSimplefcGXIks();
        Strictness.Companion companion2 = Strictness.INSTANCE;
        int iM4253getNormalusljTpc = companion2.m4253getNormalusljTpc();
        WordBreak.Companion companion3 = WordBreak.INSTANCE;
        f18224b = m4220constructorimpl(iM4243getSimplefcGXIks, iM4253getNormalusljTpc, companion3.m4262getDefaultjp8hJ3c());
        f18225c = m4220constructorimpl(companion.m4241getBalancedfcGXIks(), companion2.m4252getLooseusljTpc(), companion3.m4263getPhrasejp8hJ3c());
        f18226d = m4220constructorimpl(companion.m4242getHighQualityfcGXIks(), companion2.m4254getStrictusljTpc(), companion3.m4262getDefaultjp8hJ3c());
    }

    public /* synthetic */ LineBreak(int i10) {
        this.f18227a = i10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LineBreak m4219boximpl(int i10) {
        return new LineBreak(i10);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m4220constructorimpl(int i10, int i11, int i12) {
        return LineBreak_androidKt.access$packBytes(i10, i11, i12);
    }

    /* JADX INFO: renamed from: copy-gijOMQM, reason: not valid java name */
    public static final int m4221copygijOMQM(int i10, int i11, int i12, int i13) {
        return m4220constructorimpl(i11, i12, i13);
    }

    /* JADX INFO: renamed from: copy-gijOMQM$default, reason: not valid java name */
    public static /* synthetic */ int m4222copygijOMQM$default(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = m4225getStrategyfcGXIks(i10);
        }
        if ((i14 & 2) != 0) {
            i12 = m4226getStrictnessusljTpc(i10);
        }
        if ((i14 & 4) != 0) {
            i13 = m4227getWordBreakjp8hJ3c(i10);
        }
        return m4221copygijOMQM(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4223equalsimpl(int i10, Object obj) {
        return (obj instanceof LineBreak) && i10 == ((LineBreak) obj).getF18227a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4224equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: getStrategy-fcGXIks, reason: not valid java name */
    public static final int m4225getStrategyfcGXIks(int i10) {
        return Strategy.m4235constructorimpl(LineBreak_androidKt.access$unpackByte1(i10));
    }

    /* JADX INFO: renamed from: getStrictness-usljTpc, reason: not valid java name */
    public static final int m4226getStrictnessusljTpc(int i10) {
        return Strictness.m4245constructorimpl(LineBreak_androidKt.access$unpackByte2(i10));
    }

    /* JADX INFO: renamed from: getWordBreak-jp8hJ3c, reason: not valid java name */
    public static final int m4227getWordBreakjp8hJ3c(int i10) {
        return WordBreak.m4256constructorimpl(LineBreak_androidKt.access$unpackByte3(i10));
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4229toStringimpl(int i10) {
        return "LineBreak(strategy=" + ((Object) Strategy.m4239toStringimpl(m4225getStrategyfcGXIks(i10))) + ", strictness=" + ((Object) Strictness.m4249toStringimpl(m4226getStrictnessusljTpc(i10))) + ", wordBreak=" + ((Object) WordBreak.m4260toStringimpl(m4227getWordBreakjp8hJ3c(i10))) + RootService.CLOSE_BRACKET;
    }

    public boolean equals(Object obj) {
        return m4223equalsimpl(this.f18227a, obj);
    }

    public int hashCode() {
        return m4228hashCodeimpl(this.f18227a);
    }

    @NotNull
    public String toString() {
        return m4229toStringimpl(this.f18227a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getF18227a() {
        return this.f18227a;
    }

    /* JADX INFO: compiled from: LineBreak.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u000f\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strategy;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "value", "constructor-impl", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    @JvmInline
    public static final class Strategy {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f18228b = m4235constructorimpl(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f18229c = m4235constructorimpl(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f18230d = m4235constructorimpl(3);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18231a;

        /* JADX INFO: compiled from: LineBreak.android.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strategy$Companion;", "", "()V", "Balanced", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "getBalanced-fcGXIks", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "HighQuality", "getHighQuality-fcGXIks", "Simple", "getSimple-fcGXIks", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getBalanced-fcGXIks, reason: not valid java name */
            public final int m4241getBalancedfcGXIks() {
                return Strategy.f18230d;
            }

            /* JADX INFO: renamed from: getHighQuality-fcGXIks, reason: not valid java name */
            public final int m4242getHighQualityfcGXIks() {
                return Strategy.f18229c;
            }

            /* JADX INFO: renamed from: getSimple-fcGXIks, reason: not valid java name */
            public final int m4243getSimplefcGXIks() {
                return Strategy.f18228b;
            }
        }

        public /* synthetic */ Strategy(int i10) {
            this.f18231a = i10;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strategy m4234boximpl(int i10) {
            return new Strategy(i10);
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m4236equalsimpl(int i10, Object obj) {
            return (obj instanceof Strategy) && i10 == ((Strategy) obj).getF18231a();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m4237equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        @NotNull
        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m4239toStringimpl(int i10) {
            if (m4237equalsimpl0(i10, f18228b)) {
                return "Strategy.Simple";
            }
            if (m4237equalsimpl0(i10, f18229c)) {
                return "Strategy.HighQuality";
            }
            return m4237equalsimpl0(i10, f18230d) ? "Strategy.Balanced" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m4236equalsimpl(this.f18231a, obj);
        }

        public int hashCode() {
            return m4238hashCodeimpl(this.f18231a);
        }

        @NotNull
        public String toString() {
            return m4239toStringimpl(this.f18231a);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getF18231a() {
            return this.f18231a;
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m4235constructorimpl(int i10) {
            return i10;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m4238hashCodeimpl(int i10) {
            return i10;
        }
    }

    /* JADX INFO: compiled from: LineBreak.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u000f\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strictness;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "value", "constructor-impl", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    @JvmInline
    public static final class Strictness {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f18232b = m4245constructorimpl(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f18233c = m4245constructorimpl(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f18234d = m4245constructorimpl(3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f18235e = m4245constructorimpl(4);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18236a;

        /* JADX INFO: compiled from: LineBreak.android.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strictness$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "getDefault-usljTpc", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Loose", "getLoose-usljTpc", "Normal", "getNormal-usljTpc", "Strict", "getStrict-usljTpc", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getDefault-usljTpc, reason: not valid java name */
            public final int m4251getDefaultusljTpc() {
                return Strictness.f18232b;
            }

            /* JADX INFO: renamed from: getLoose-usljTpc, reason: not valid java name */
            public final int m4252getLooseusljTpc() {
                return Strictness.f18233c;
            }

            /* JADX INFO: renamed from: getNormal-usljTpc, reason: not valid java name */
            public final int m4253getNormalusljTpc() {
                return Strictness.f18234d;
            }

            /* JADX INFO: renamed from: getStrict-usljTpc, reason: not valid java name */
            public final int m4254getStrictusljTpc() {
                return Strictness.f18235e;
            }
        }

        public /* synthetic */ Strictness(int i10) {
            this.f18236a = i10;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Strictness m4244boximpl(int i10) {
            return new Strictness(i10);
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m4246equalsimpl(int i10, Object obj) {
            return (obj instanceof Strictness) && i10 == ((Strictness) obj).getF18236a();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m4247equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        @NotNull
        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m4249toStringimpl(int i10) {
            if (m4247equalsimpl0(i10, f18232b)) {
                return "Strictness.None";
            }
            if (m4247equalsimpl0(i10, f18233c)) {
                return "Strictness.Loose";
            }
            if (m4247equalsimpl0(i10, f18234d)) {
                return "Strictness.Normal";
            }
            return m4247equalsimpl0(i10, f18235e) ? "Strictness.Strict" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m4246equalsimpl(this.f18236a, obj);
        }

        public int hashCode() {
            return m4248hashCodeimpl(this.f18236a);
        }

        @NotNull
        public String toString() {
            return m4249toStringimpl(this.f18236a);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getF18236a() {
            return this.f18236a;
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m4245constructorimpl(int i10) {
            return i10;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m4248hashCodeimpl(int i10) {
            return i10;
        }
    }

    /* JADX INFO: compiled from: LineBreak.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u000f\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "value", "constructor-impl", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
    @JvmInline
    public static final class WordBreak {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f18237b = m4256constructorimpl(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f18238c = m4256constructorimpl(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18239a;

        /* JADX INFO: compiled from: LineBreak.android.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/style/LineBreak$WordBreak$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "getDefault-jp8hJ3c", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "Phrase", "getPhrase-jp8hJ3c", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getDefault-jp8hJ3c, reason: not valid java name */
            public final int m4262getDefaultjp8hJ3c() {
                return WordBreak.f18237b;
            }

            /* JADX INFO: renamed from: getPhrase-jp8hJ3c, reason: not valid java name */
            public final int m4263getPhrasejp8hJ3c() {
                return WordBreak.f18238c;
            }
        }

        public /* synthetic */ WordBreak(int i10) {
            this.f18239a = i10;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ WordBreak m4255boximpl(int i10) {
            return new WordBreak(i10);
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m4257equalsimpl(int i10, Object obj) {
            return (obj instanceof WordBreak) && i10 == ((WordBreak) obj).getF18239a();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m4258equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        @NotNull
        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m4260toStringimpl(int i10) {
            if (m4258equalsimpl0(i10, f18237b)) {
                return "WordBreak.None";
            }
            return m4258equalsimpl0(i10, f18238c) ? "WordBreak.Phrase" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m4257equalsimpl(this.f18239a, obj);
        }

        public int hashCode() {
            return m4259hashCodeimpl(this.f18239a);
        }

        @NotNull
        public String toString() {
            return m4260toStringimpl(this.f18239a);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getF18239a() {
            return this.f18239a;
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m4256constructorimpl(int i10) {
            return i10;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m4259hashCodeimpl(int i10) {
            return i10;
        }
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4228hashCodeimpl(int i10) {
        return i10;
    }
}
