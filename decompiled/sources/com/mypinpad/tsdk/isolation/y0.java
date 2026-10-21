package com.mypinpad.tsdk.isolation;

import com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorCodes;

/* JADX INFO: loaded from: classes10.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f61965a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f61966b = 1;

    public static class a implements akl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61967a;

        public a(String str) {
            this.f61967a = str;
        }

        @Override // com.mypinpad.tsdk.isolation.akl
        public final String setCompoundDrawableTintBlendMode() {
            Object[] objArr = {this};
            System.identityHashCode(this);
            return ((a) objArr[0]).f61967a;
        }
    }

    public static class b implements akl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61968a;

        public b(String str) {
            this.f61968a = str;
        }

        @Override // com.mypinpad.tsdk.isolation.akl
        public final String setCompoundDrawableTintBlendMode() {
            Object[] objArr = {this};
            System.identityHashCode(this);
            return ((b) objArr[0]).f61968a;
        }
    }

    public static /* synthetic */ akl a(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = i13 | (~(i14 | i15));
        int i17 = ~(i10 | i11);
        if ((((~(i10 | i15)) | (~(i11 | i14))) * ErrorCodes.STORAGE_PERMISSION) + (((~(i12 | i11)) | (~(i10 | i12)) | i17) * (-1444)) + ((i16 | i17) * 1444) + (i11 * (-721)) + (i10 * (-721)) != 1) {
            aky akyVar = (aky) objArr[0];
            ((Number) objArr[1]).intValue();
            akyVar.setY();
            b bVar = new b(akyVar.setX());
            int i18 = f61966b + 99;
            f61965a = i18 % 128;
            int i19 = i18 % 2;
            return bVar;
        }
        aky akyVar2 = (aky) objArr[0];
        akyVar2.setY();
        a aVar = new a(akyVar2.setX());
        int i20 = f61965a + 105;
        f61966b = i20 % 128;
        if (i20 % 2 != 0) {
            return aVar;
        }
        throw null;
    }
}
