package androidx.compose.ui.layout;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BeyondBoundsLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\f\rJ@\u0010\u0002\u001a\u0004\u0018\u0001H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0019\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u0007¢\u0006\u0002\b\tH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/BeyondBoundsLayout;", "", PluginUtils.IDENTIFIER_LAYOUT, ExifInterface.GPS_DIRECTION_TRUE, "direction", "Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/ExtensionFunctionType;", "layout-o7g1Pn8", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "BeyondBoundsScope", "LayoutDirection", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface BeyondBoundsLayout {

    /* JADX INFO: compiled from: BeyondBoundsLayout.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "", "hasMoreContent", "", "getHasMoreContent", "()Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface BeyondBoundsScope {
        boolean getHasMoreContent();
    }

    @Nullable
    /* JADX INFO: renamed from: layout-o7g1Pn8 */
    <T> T mo401layouto7g1Pn8(int direction, @NotNull Function1<? super BeyondBoundsScope, ? extends T> block);

    /* JADX INFO: compiled from: BeyondBoundsLayout.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\r\u0088\u0001\u000f\u0092\u0001\u00020\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "hashCode-impl", "(I)I", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "value", "constructor-impl", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
    @JvmInline
    public static final class LayoutDirection {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f16521b = m3557constructorimpl(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f16522c = m3557constructorimpl(2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f16523d = m3557constructorimpl(3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f16524e = m3557constructorimpl(4);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f16525f = m3557constructorimpl(5);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f16526g = m3557constructorimpl(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f16527a;

        /* JADX INFO: compiled from: BeyondBoundsLayout.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u001c\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u001c\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection$Companion;", "", "()V", "Above", "Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection;", "getAbove-hoxUOeE", "()I", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "After", "getAfter-hoxUOeE", "Before", "getBefore-hoxUOeE", "Below", "getBelow-hoxUOeE", "Left", "getLeft-hoxUOeE", "Right", "getRight-hoxUOeE", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: renamed from: getAbove-hoxUOeE, reason: not valid java name */
            public final int m3563getAbovehoxUOeE() {
                return LayoutDirection.f16525f;
            }

            /* JADX INFO: renamed from: getAfter-hoxUOeE, reason: not valid java name */
            public final int m3564getAfterhoxUOeE() {
                return LayoutDirection.f16522c;
            }

            /* JADX INFO: renamed from: getBefore-hoxUOeE, reason: not valid java name */
            public final int m3565getBeforehoxUOeE() {
                return LayoutDirection.f16521b;
            }

            /* JADX INFO: renamed from: getBelow-hoxUOeE, reason: not valid java name */
            public final int m3566getBelowhoxUOeE() {
                return LayoutDirection.f16526g;
            }

            /* JADX INFO: renamed from: getLeft-hoxUOeE, reason: not valid java name */
            public final int m3567getLefthoxUOeE() {
                return LayoutDirection.f16523d;
            }

            /* JADX INFO: renamed from: getRight-hoxUOeE, reason: not valid java name */
            public final int m3568getRighthoxUOeE() {
                return LayoutDirection.f16524e;
            }
        }

        public /* synthetic */ LayoutDirection(int i10) {
            this.f16527a = i10;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ LayoutDirection m3556boximpl(int i10) {
            return new LayoutDirection(i10);
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m3558equalsimpl(int i10, Object obj) {
            return (obj instanceof LayoutDirection) && i10 == ((LayoutDirection) obj).getF16527a();
        }

        /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3559equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        @NotNull
        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m3561toStringimpl(int i10) {
            if (m3559equalsimpl0(i10, f16521b)) {
                return "Before";
            }
            if (m3559equalsimpl0(i10, f16522c)) {
                return "After";
            }
            if (m3559equalsimpl0(i10, f16523d)) {
                return "Left";
            }
            if (m3559equalsimpl0(i10, f16524e)) {
                return "Right";
            }
            if (m3559equalsimpl0(i10, f16525f)) {
                return "Above";
            }
            return m3559equalsimpl0(i10, f16526g) ? "Below" : "invalid LayoutDirection";
        }

        public boolean equals(Object obj) {
            return m3558equalsimpl(this.f16527a, obj);
        }

        public int hashCode() {
            return m3560hashCodeimpl(this.f16527a);
        }

        @NotNull
        public String toString() {
            return m3561toStringimpl(this.f16527a);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getF16527a() {
            return this.f16527a;
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static int m3557constructorimpl(int i10) {
            return i10;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m3560hashCodeimpl(int i10) {
            return i10;
        }
    }
}
