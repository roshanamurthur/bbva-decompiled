package androidx.compose.ui.unit;

import androidx.camera.core.impl.utils.b;
import androidx.collection.g;
import androidx.collection.k;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.mypinpad.tsdk.isolation.y2;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Constraints.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087@\u0018\u0000 -2\u00020\u0001:\u0001-B\u0012\u0012\u0006\u0010*\u001a\u00020)ø\u0001\u0002¢\u0006\u0004\b+\u0010,J>\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0015\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000fR\u0011\u0010\u001c\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\"\u001a\u00020\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u001bR\u001a\u0010%\u001a\u00020\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u001bR\u001a\u0010(\u001a\u00020\u00128FX\u0087\u0004¢\u0006\f\u0012\u0004\b'\u0010!\u001a\u0004\b&\u0010\u001b\u0088\u0001*\u0092\u0001\u00020)ø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, d2 = {"Landroidx/compose/ui/unit/Constraints;", "", "", "minWidth", "maxWidth", "minHeight", "maxHeight", "copy-Zbe2FdA", "(JIIII)J", "copy", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "(J)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "getMinWidth-impl", "getMaxWidth-impl", "getMinHeight-impl", "getMaxHeight-impl", "getHasBoundedWidth-impl", "(J)Z", "hasBoundedWidth", "getHasBoundedHeight-impl", "hasBoundedHeight", "getHasFixedWidth-impl", "getHasFixedWidth$annotations", "()V", "hasFixedWidth", "getHasFixedHeight-impl", "getHasFixedHeight$annotations", "hasFixedHeight", "isZero-impl", "isZero$annotations", "isZero", "", "value", "constructor-impl", "(J)J", "Companion", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
@JvmInline
public final class Constraints {
    public static final int Infinity = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18296a;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final int[] f18293b = {18, 20, 17, 15};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final int[] f18294c = {65535, 262143, 32767, 8191};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final int[] f18295d = {32767, 8191, 65535, 262143};

    /* JADX INFO: compiled from: Constraints.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0015\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b+\u0010,J(\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\nJ8\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017R\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u0014\u0010 \u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0017R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001cR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u001cR\u0014\u0010$\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0017R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u001cR\u0014\u0010&\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u0017R\u0014\u0010'\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001aR\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u001cR\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u001cR\u0014\u0010*\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001a\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006-"}, d2 = {"Landroidx/compose/ui/unit/Constraints$Companion;", "", "", "width", "height", "Landroidx/compose/ui/unit/Constraints;", "fixed-JhjzzOo", "(II)J", "fixed", "fixedWidth-OenEA2s", "(I)J", "fixedWidth", "fixedHeight-OenEA2s", "fixedHeight", "minWidth", "maxWidth", "minHeight", "maxHeight", "createConstraints-Zbe2FdA$ui_unit_release", "(IIII)J", "createConstraints", "", "FocusMask", "J", "", "HeightMask", "[I", "Infinity", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "MaxFocusBits", "MaxFocusHeight", "MaxFocusMask", "MaxFocusWidth", "MaxNonFocusBits", "MaxNonFocusMask", "MinFocusBits", "MinFocusHeight", "MinFocusMask", "MinFocusWidth", "MinHeightOffsets", "MinNonFocusBits", "MinNonFocusMask", "WidthMask", "<init>", "()V", "ui-unit_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static int a(int i10) {
            if (i10 < 8191) {
                return 13;
            }
            if (i10 < 32767) {
                return 15;
            }
            if (i10 < 65535) {
                return 16;
            }
            if (i10 < 262143) {
                return 18;
            }
            throw new IllegalArgumentException(b.a("Can't represent a size of ", i10, " in Constraints"));
        }

        /* JADX INFO: renamed from: createConstraints-Zbe2FdA$ui_unit_release, reason: not valid java name */
        public final long m4364createConstraintsZbe2FdA$ui_unit_release(int minWidth, int maxWidth, int minHeight, int maxHeight) {
            long j10;
            int i10 = maxHeight == Integer.MAX_VALUE ? minHeight : maxHeight;
            int iA = a(i10);
            int i11 = maxWidth == Integer.MAX_VALUE ? minWidth : maxWidth;
            int iA2 = a(i11);
            if (iA + iA2 > 31) {
                throw new IllegalArgumentException(k.c("Can't represent a width of ", i11, " and height of ", i10, " in Constraints"));
            }
            if (iA2 == 13) {
                j10 = 3;
            } else if (iA2 == 18) {
                j10 = 1;
            } else if (iA2 == 15) {
                j10 = 2;
            } else {
                if (iA2 != 16) {
                    throw new IllegalStateException("Should only have the provided constants.");
                }
                j10 = 0;
            }
            int i12 = maxWidth == Integer.MAX_VALUE ? 0 : maxWidth + 1;
            int i13 = maxHeight != Integer.MAX_VALUE ? maxHeight + 1 : 0;
            int i14 = Constraints.f18293b[(int) j10];
            return Constraints.m4347constructorimpl((((long) i12) << 33) | j10 | (((long) minWidth) << 2) | (((long) minHeight) << i14) | (((long) i13) << (i14 + 31)));
        }

        @Stable
        /* JADX INFO: renamed from: fixed-JhjzzOo, reason: not valid java name */
        public final long m4365fixedJhjzzOo(int width, int height) {
            if (width < 0 || height < 0) {
                throw new IllegalArgumentException(k.c("width(", width, ") and height(", height, ") must be >= 0").toString());
            }
            return m4364createConstraintsZbe2FdA$ui_unit_release(width, width, height, height);
        }

        @Stable
        /* JADX INFO: renamed from: fixedHeight-OenEA2s, reason: not valid java name */
        public final long m4366fixedHeightOenEA2s(int height) {
            if (height >= 0) {
                return m4364createConstraintsZbe2FdA$ui_unit_release(0, Integer.MAX_VALUE, height, height);
            }
            throw new IllegalArgumentException(b.a("height(", height, ") must be >= 0").toString());
        }

        @Stable
        /* JADX INFO: renamed from: fixedWidth-OenEA2s, reason: not valid java name */
        public final long m4367fixedWidthOenEA2s(int width) {
            if (width >= 0) {
                return m4364createConstraintsZbe2FdA$ui_unit_release(width, width, 0, Integer.MAX_VALUE);
            }
            throw new IllegalArgumentException(b.a("width(", width, ") must be >= 0").toString());
        }
    }

    public /* synthetic */ Constraints(long j10) {
        this.f18296a = j10;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Constraints m4346boximpl(long j10) {
        return new Constraints(j10);
    }

    /* JADX INFO: renamed from: copy-Zbe2FdA, reason: not valid java name */
    public static final long m4348copyZbe2FdA(long j10, int i10, int i11, int i12, int i13) {
        if (i12 < 0 || i10 < 0) {
            throw new IllegalArgumentException(k.c("minHeight(", i12, ") and minWidth(", i10, ") must be >= 0").toString());
        }
        if (i11 < i10 && i11 != Integer.MAX_VALUE) {
            throw new IllegalArgumentException(g.b("maxWidth(", i11, ") must be >= minWidth(", i10, RootService.CLOSE_BRACKET).toString());
        }
        if (i13 >= i12 || i13 == Integer.MAX_VALUE) {
            return INSTANCE.m4364createConstraintsZbe2FdA$ui_unit_release(i10, i11, i12, i13);
        }
        throw new IllegalArgumentException(g.b("maxHeight(", i13, ") must be >= minHeight(", i12, RootService.CLOSE_BRACKET).toString());
    }

    /* JADX INFO: renamed from: copy-Zbe2FdA$default, reason: not valid java name */
    public static /* synthetic */ long m4349copyZbe2FdA$default(long j10, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = m4359getMinWidthimpl(j10);
        }
        int i15 = i10;
        if ((i14 & 2) != 0) {
            i11 = m4357getMaxWidthimpl(j10);
        }
        int i16 = i11;
        if ((i14 & 4) != 0) {
            i12 = m4358getMinHeightimpl(j10);
        }
        int i17 = i12;
        if ((i14 & 8) != 0) {
            i13 = m4356getMaxHeightimpl(j10);
        }
        return m4348copyZbe2FdA(j10, i15, i16, i17, i13);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m4350equalsimpl(long j10, Object obj) {
        return (obj instanceof Constraints) && j10 == ((Constraints) obj).getF18296a();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4351equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: getHasBoundedHeight-impl, reason: not valid java name */
    public static final boolean m4352getHasBoundedHeightimpl(long j10) {
        int i10 = (int) (3 & j10);
        return (((int) (j10 >> (f18293b[i10] + 31))) & f18295d[i10]) != 0;
    }

    /* JADX INFO: renamed from: getHasBoundedWidth-impl, reason: not valid java name */
    public static final boolean m4353getHasBoundedWidthimpl(long j10) {
        return (((int) (j10 >> 33)) & f18294c[(int) (3 & j10)]) != 0;
    }

    /* JADX INFO: renamed from: getHasFixedHeight-impl, reason: not valid java name */
    public static final boolean m4354getHasFixedHeightimpl(long j10) {
        return m4356getMaxHeightimpl(j10) == m4358getMinHeightimpl(j10);
    }

    /* JADX INFO: renamed from: getHasFixedWidth-impl, reason: not valid java name */
    public static final boolean m4355getHasFixedWidthimpl(long j10) {
        return m4357getMaxWidthimpl(j10) == m4359getMinWidthimpl(j10);
    }

    /* JADX INFO: renamed from: getMaxHeight-impl, reason: not valid java name */
    public static final int m4356getMaxHeightimpl(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((int) (j10 >> (f18293b[i10] + 31))) & f18295d[i10];
        if (i11 == 0) {
            return Integer.MAX_VALUE;
        }
        return i11 - 1;
    }

    /* JADX INFO: renamed from: getMaxWidth-impl, reason: not valid java name */
    public static final int m4357getMaxWidthimpl(long j10) {
        int i10 = ((int) (j10 >> 33)) & f18294c[(int) (3 & j10)];
        if (i10 == 0) {
            return Integer.MAX_VALUE;
        }
        return i10 - 1;
    }

    /* JADX INFO: renamed from: getMinHeight-impl, reason: not valid java name */
    public static final int m4358getMinHeightimpl(long j10) {
        int i10 = (int) (3 & j10);
        return ((int) (j10 >> f18293b[i10])) & f18295d[i10];
    }

    /* JADX INFO: renamed from: getMinWidth-impl, reason: not valid java name */
    public static final int m4359getMinWidthimpl(long j10) {
        return ((int) (j10 >> 2)) & f18294c[(int) (3 & j10)];
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m4360hashCodeimpl(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* JADX INFO: renamed from: isZero-impl, reason: not valid java name */
    public static final boolean m4361isZeroimpl(long j10) {
        return m4357getMaxWidthimpl(j10) == 0 || m4356getMaxHeightimpl(j10) == 0;
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m4362toStringimpl(long j10) {
        int iM4357getMaxWidthimpl = m4357getMaxWidthimpl(j10);
        String strValueOf = iM4357getMaxWidthimpl == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM4357getMaxWidthimpl);
        int iM4356getMaxHeightimpl = m4356getMaxHeightimpl(j10);
        String strValueOf2 = iM4356getMaxHeightimpl != Integer.MAX_VALUE ? String.valueOf(iM4356getMaxHeightimpl) : "Infinity";
        StringBuilder sb2 = new StringBuilder("Constraints(minWidth = ");
        sb2.append(m4359getMinWidthimpl(j10));
        sb2.append(", maxWidth = ");
        sb2.append(strValueOf);
        sb2.append(", minHeight = ");
        sb2.append(m4358getMinHeightimpl(j10));
        sb2.append(", maxHeight = ");
        return y2.b(sb2, strValueOf2, RootService.CLOSE_BRACKET);
    }

    public boolean equals(Object obj) {
        return m4350equalsimpl(this.f18296a, obj);
    }

    public int hashCode() {
        return m4360hashCodeimpl(this.f18296a);
    }

    @NotNull
    public String toString() {
        return m4362toStringimpl(this.f18296a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getF18296a() {
        return this.f18296a;
    }

    @Stable
    public static /* synthetic */ void getHasFixedHeight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getHasFixedWidth$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getValue$annotations() {
    }

    @Stable
    public static /* synthetic */ void isZero$annotations() {
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m4347constructorimpl(long j10) {
        return j10;
    }
}
