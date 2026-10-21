package androidx.compose.material3;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ListItem.kt */
/* JADX INFO: loaded from: classes.dex */
@JvmInline
public final class ListItemType implements Comparable<ListItemType> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final Companion f10580p0 = new Companion(null);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f10581q0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f10582r0 = 2;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int f10583s0 = 3;

    /* JADX INFO: compiled from: ListItem.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/material3/ListItemType$Companion;", "", "()V", "OneLine", "Landroidx/compose/material3/ListItemType;", "getOneLine-AlXitO8", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "ThreeLine", "getThreeLine-AlXitO8", "TwoLine", "getTwoLine-AlXitO8", "getListItemType", "hasOverline", "", "hasSupporting", "getListItemType-7AlIA9s$material3_release", "(ZZ)I", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: getListItemType-7AlIA9s$material3_release, reason: not valid java name */
        public final int m1164getListItemType7AlIA9s$material3_release(boolean hasOverline, boolean hasSupporting) {
            if (hasOverline && hasSupporting) {
                return m1166getThreeLineAlXitO8();
            }
            return (hasOverline || hasSupporting) ? m1167getTwoLineAlXitO8() : m1165getOneLineAlXitO8();
        }

        /* JADX INFO: renamed from: getOneLine-AlXitO8, reason: not valid java name */
        public final int m1165getOneLineAlXitO8() {
            return ListItemType.f10581q0;
        }

        /* JADX INFO: renamed from: getThreeLine-AlXitO8, reason: not valid java name */
        public final int m1166getThreeLineAlXitO8() {
            return ListItemType.f10583s0;
        }

        /* JADX INFO: renamed from: getTwoLine-AlXitO8, reason: not valid java name */
        public final int m1167getTwoLineAlXitO8() {
            return ListItemType.f10582r0;
        }
    }

    public static final boolean a(int i10, int i11) {
        return i10 == i11;
    }
}
