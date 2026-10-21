package com.mypinpad.tsdk.isolation;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/getRrn;", "", "", "setLayoutAnimation", "()V", "setX"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface getRrn {

    /* JADX INFO: renamed from: setX, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f55956a;

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.getRrn$setX, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f55956a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static ArrayList f55957b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final Object f55958c = new Object();

        public static /* synthetic */ void a(Object[] objArr) {
            getRrn getrrn = (getRrn) objArr[0];
            Intrinsics.checkNotNullParameter(getrrn, "");
            synchronized (f55958c) {
                f55957b.add(getrrn);
            }
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            ArrayList arrayList;
            int i13 = ~i10;
            int i14 = ~(i13 | i12);
            int i15 = ~i12;
            int i16 = ((i14 | (~(i15 | i11))) * (-1808)) + (i11 * (-903)) + (i10 * 905);
            int i17 = ~i11;
            int i18 = i10 | i15;
            if ((((~i18) | (~(i11 | i13)) | (~(i12 | i17))) * 904) + (((~(i18 | i11)) | (~(i13 | i17 | i12))) * 904) + i16 == 1) {
                a(objArr);
                return null;
            }
            synchronized (f55958c) {
                arrayList = f55957b;
                f55957b = new ArrayList();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((getRrn) it.next()).setLayoutAnimation();
            }
            return null;
        }

        public static void setY(@NotNull getRrn getrrn) {
            setCompoundDrawableTintBlendMode(new Object[]{getrrn}, 1708259647, -1708259646, (int) System.currentTimeMillis());
        }

        public static void setY() {
            setCompoundDrawableTintBlendMode(new Object[0], -533004245, 533004245, (int) System.currentTimeMillis());
        }
    }

    void setLayoutAnimation();
}
