package com.mypinpad.tsdk.isolation;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/mypinpad/tsdk/i/yc;", "", "Lcom/mypinpad/tsdk/i/yg;", "p0", "", "Lcom/mypinpad/tsdk/i/yb;", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/yg;)Ljava/util/List;", "p1", "", "setY", "(Lcom/mypinpad/tsdk/i/yg;Ljava/util/List;)V", "setDividerPadding"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface yc {

    /* JADX INFO: renamed from: setDividerPadding, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f62036a;

    @JvmField
    @NotNull
    public static final yc setOnFocusChangeListener = new Companion.a();

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.yc$setDividerPadding, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f62036a = new Companion();

        /* JADX INFO: renamed from: com.mypinpad.tsdk.i.yc$setDividerPadding$a */
        public static final class a implements yc {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static int f62037a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static int f62038b = 1;

            public static /* synthetic */ List a(Object[] objArr, int i10, int i11) {
                int i12 = ~i10;
                int i13 = (i12 * (-624)) + (i11 * (-623)) + (i10 * (-623));
                int i14 = ((i10 | i11) * 624) + ((i12 | i11) * 624) + i13;
                List listEmptyList = null;
                if (i14 != 1) {
                    yg ygVar = (yg) objArr[1];
                    int i15 = f62038b;
                    int i16 = (i15 & 113) + (i15 | 113);
                    f62037a = i16 % 128;
                    if (i16 % 2 != 0) {
                        Intrinsics.checkNotNullParameter(ygVar, "");
                        CollectionsKt__CollectionsKt.emptyList();
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(ygVar, "");
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                } else {
                    yg ygVar2 = (yg) objArr[1];
                    List list = (List) objArr[2];
                    int i17 = f62037a + 59;
                    f62038b = i17 % 128;
                    int i18 = i17 % 2;
                    Intrinsics.checkNotNullParameter(ygVar2, "");
                    Intrinsics.checkNotNullParameter(list, "");
                    int i19 = f62037a;
                    int i20 = (i19 ^ 37) + ((i19 & 37) << 1);
                    f62038b = i20 % 128;
                    if (i20 % 2 == 0) {
                        int i21 = 37 / 0;
                    }
                }
                return listEmptyList;
            }

            @Override // com.mypinpad.tsdk.isolation.yc
            @NotNull
            public final List<yb> setOnFocusChangeListener(@NotNull yg ygVar) {
                Object[] objArr = {this, ygVar};
                System.identityHashCode(this);
                return a(objArr, -1157402355, 1157402355);
            }

            @Override // com.mypinpad.tsdk.isolation.yc
            public final void setY(@NotNull yg ygVar, @NotNull List<yb> list) {
                System.identityHashCode(this);
                a(new Object[]{this, ygVar, list}, 567340903, -567340902);
            }
        }

        static {
            int i10 = (-1) - (~31);
            int i11 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
        }
    }

    @NotNull
    List<yb> setOnFocusChangeListener(@NotNull yg p4);

    void setY(@NotNull yg p4, @NotNull List<yb> p10);
}
