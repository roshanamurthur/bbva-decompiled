package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class baf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f54296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54297b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f54298c = 1;

    public static class a extends f {
        public a() {
            super(0);
        }

        @Override // com.mypinpad.tsdk.i.baf.f
        public final amw a(ajj ajjVar) throws IOException {
            Object[] objArr = {this, ajjVar};
            System.identityHashCode(this);
            ajj ajjVar2 = (ajj) objArr[1];
            ads adsVar = (ads) ads.setDividerPadding(new Object[]{(ady) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 777066731, -777066731, System.identityHashCode(ajjVar2))}, 1337255032, -1337255030, (int) System.currentTimeMillis());
            byte[] bArr = (byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar));
            aiw aiwVar = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 912478577, -912478575, System.identityHashCode(ajjVar2));
            return new ayz((ayu) x2.k(new Object[]{(adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -661220858, 661220861, System.identityHashCode(aiwVar))}, -1921702706, 1921702716, (int) System.currentTimeMillis()), bArr);
        }
    }

    public static class b extends f {
        public b() {
            super(0);
        }

        @Override // com.mypinpad.tsdk.i.baf.f
        public final amw a(ajj ajjVar) throws IOException {
            Object[] objArr = {this, ajjVar};
            System.identityHashCode(this);
            ajj ajjVar2 = (ajj) objArr[1];
            ads adsVar = (ads) ads.setDividerPadding(new Object[]{(ady) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 777066731, -777066731, System.identityHashCode(ajjVar2))}, 1337255032, -1337255030, (int) System.currentTimeMillis());
            byte[] bArr = (byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar));
            aiw aiwVar = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 912478577, -912478575, System.identityHashCode(ajjVar2));
            return new ayv((ayr) x2.k(new Object[]{(adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -661220858, 661220861, System.identityHashCode(aiwVar))}, -1519969250, 1519969281, (int) System.currentTimeMillis()), bArr);
        }
    }

    public static class c extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f54299a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f54300b = 1;

        public c() {
            super(0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x00d3, code lost:
        
            if ((r6 % 2) != 0) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x00d5, code lost:
        
            r0 = com.mypinpad.tsdk.isolation.aya.setY(new java.lang.Object[]{(byte[]) com.mypinpad.tsdk.isolation.bek.setOnFocusChangeListener(new java.lang.Object[]{r1, 5, java.lang.Integer.valueOf(r1.length)}, 525237936, -525237917, 5)}, 1338346932, -1338346929, (int) java.lang.System.currentTimeMillis());
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0101, code lost:
        
            r0 = com.mypinpad.tsdk.isolation.aya.setY(new java.lang.Object[]{(byte[]) com.mypinpad.tsdk.isolation.bek.setOnFocusChangeListener(new java.lang.Object[]{r1, 4, java.lang.Integer.valueOf(r1.length)}, 525237936, -525237917, 4)}, 1338346932, -1338346929, (int) java.lang.System.currentTimeMillis());
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x012d, code lost:
        
            if (r1.length != 64) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x012f, code lost:
        
            r4 = com.mypinpad.tsdk.i.baf.c.f54299a;
            r6 = (((r4 | 100) << 1) - (r4 ^ 100)) - 1;
            com.mypinpad.tsdk.i.baf.c.f54300b = r6 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x013d, code lost:
        
            if ((r6 % 2) != 0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x013f, code lost:
        
            r1 = com.mypinpad.tsdk.isolation.bek.setOnFocusChangeListener(new java.lang.Object[]{r1, 2, java.lang.Integer.valueOf(r1.length)}, 525237936, -525237917, 2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0157, code lost:
        
            r1 = (byte[]) r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x015a, code lost:
        
            r1 = com.mypinpad.tsdk.isolation.bek.setOnFocusChangeListener(new java.lang.Object[]{r1, 4, java.lang.Integer.valueOf(r1.length)}, 525237936, -525237917, 4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0174, code lost:
        
            r4 = com.mypinpad.tsdk.i.baf.c.f54300b;
            r5 = r4 ^ 119;
            r4 = -(-((r4 & 119) << 1));
            r6 = (r5 & r4) + (r4 | r5);
            com.mypinpad.tsdk.i.baf.c.f54299a = r6 % 128;
            r6 = r6 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0186, code lost:
        
            r1 = (com.mypinpad.tsdk.isolation.axu) com.mypinpad.tsdk.isolation.axu.setX(new java.lang.Object[]{r1}, -447186264, 447186268, (int) java.lang.System.currentTimeMillis());
            r2 = com.mypinpad.tsdk.i.baf.c.f54299a;
            r2 = (-2) - ((((r2 | 32) << 1) - (r2 ^ 32)) ^ (-1));
            com.mypinpad.tsdk.i.baf.c.f54300b = r2 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x01ad, code lost:
        
            if ((r2 % 2) == 0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x01b0, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x01b2, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
        
            return (com.mypinpad.tsdk.isolation.aya) r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0080, code lost:
        
            if (((java.lang.Integer) com.mypinpad.tsdk.isolation.ber.setDividerPadding(new java.lang.Object[]{r1, 0}, 450133947, -450133937, 0)).intValue() == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x00be, code lost:
        
            if (((java.lang.Integer) com.mypinpad.tsdk.isolation.ber.setDividerPadding(new java.lang.Object[]{r1, 0}, 450133947, -450133937, 0)).intValue() == 1) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x00c0, code lost:
        
            r4 = com.mypinpad.tsdk.i.baf.c.f54299a;
            r6 = ((r4 | 77) << 1) - (r4 ^ 77);
            com.mypinpad.tsdk.i.baf.c.f54300b = r6 % 128;
         */
        @Override // com.mypinpad.tsdk.i.baf.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.mypinpad.tsdk.isolation.amw a(com.mypinpad.tsdk.isolation.ajj r17) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 435
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.baf.c.a(com.mypinpad.tsdk.i.ajj):com.mypinpad.tsdk.i.amw");
        }
    }

    public static class d extends f {
        public d() {
            super(0);
        }

        @Override // com.mypinpad.tsdk.i.baf.f
        public final amw a(ajj ajjVar) throws IOException {
            Object compoundDrawableTintBlendMode;
            Object[] objArr = {this, ajjVar};
            System.identityHashCode(this);
            ajj ajjVar2 = (ajj) objArr[1];
            aiw aiwVar = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 912478577, -912478575, System.identityHashCode(ajjVar2));
            avu avuVar = (avu) avu.setX(new Object[]{(add) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -513456911, 513456913, System.identityHashCode(aiwVar))}, -1683941502, 1683941502, (int) System.currentTimeMillis());
            if (avuVar != null) {
                aiw aiwVar2 = (aiw) avu.setX(new Object[]{avuVar}, 1408999976, -1408999973, System.identityHashCode(avuVar));
                adu aduVar = (adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar2}, -661220858, 661220861, System.identityHashCode(aiwVar2));
                avx avxVar = (avx) avx.setDividerPadding(new Object[]{(ady) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 777066731, -777066731, System.identityHashCode(ajjVar2))}, 744650889, -744650887, (int) System.currentTimeMillis());
                bba.setY sety = new bba.setY(new bbb(avuVar.setDividerPadding(), (aky) x2.k(new Object[]{aduVar}, -1245342802, 1245342815, (int) System.currentTimeMillis())));
                bba.setY sety2 = (bba.setY) bba.setY.setCompoundDrawableTintBlendMode(new Object[]{sety, (byte[]) avx.setDividerPadding(new Object[]{avxVar}, 628529069, -628529066, System.identityHashCode(avxVar))}, -935944386, 935944391, System.identityHashCode(sety));
                bba.setY sety3 = (bba.setY) bba.setY.setCompoundDrawableTintBlendMode(new Object[]{sety2, (byte[]) avx.setDividerPadding(new Object[]{avxVar}, 1442270359, -1442270358, System.identityHashCode(avxVar))}, -1036604683, 1036604685, System.identityHashCode(sety2));
                compoundDrawableTintBlendMode = bba.setY.setCompoundDrawableTintBlendMode(new Object[]{sety3}, 1100475496, -1100475493, System.identityHashCode(sety3));
            } else {
                ads adsVar = (ads) ads.setDividerPadding(new Object[]{(ady) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 777066731, -777066731, System.identityHashCode(ajjVar2))}, 1337255032, -1337255030, (int) System.currentTimeMillis());
                byte[] bArr = (byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar));
                int iIntValue = ((Integer) ber.setDividerPadding(new Object[]{bArr, 0}, 450133947, -450133937, 0)).intValue();
                bba.setY sety4 = new bba.setY((bbb) bbb.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(iIntValue)}, 105807270, -105807266, iIntValue));
                bba.setY sety5 = (bba.setY) bba.setY.setCompoundDrawableTintBlendMode(new Object[]{sety4, bArr}, 510586294, -510586293, System.identityHashCode(sety4));
                compoundDrawableTintBlendMode = bba.setY.setCompoundDrawableTintBlendMode(new Object[]{sety5}, 1100475496, -1100475493, System.identityHashCode(sety5));
            }
            return (bba) compoundDrawableTintBlendMode;
        }
    }

    public static class e extends f {
        public e() {
            super(0);
        }

        @Override // com.mypinpad.tsdk.i.baf.f
        public final amw a(ajj ajjVar) throws IOException {
            Object[] objArr = {this, ajjVar};
            System.identityHashCode(this);
            ajj ajjVar2 = (ajj) objArr[1];
            return new bdp(((Integer) x2.k(new Object[]{(aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 912478577, -912478575, System.identityHashCode(ajjVar2))}, -803697817, 803697822, (int) System.currentTimeMillis())).intValue(), ((acz) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, -792808893, 792808894, System.identityHashCode(ajjVar2))).setDividerPadding());
        }
    }

    public static abstract class f {
        private f() {
        }

        public /* synthetic */ f(int i10) {
            this();
        }

        public abstract amw a(ajj ajjVar) throws IOException;
    }

    public static class g extends f {
        public g() {
            super(0);
        }

        @Override // com.mypinpad.tsdk.i.baf.f
        public final amw a(ajj ajjVar) throws IOException {
            Object[] objArr = {this, ajjVar};
            System.identityHashCode(this);
            ajj ajjVar2 = (ajj) objArr[1];
            ads adsVar = (ads) ads.setDividerPadding(new Object[]{((aed) aed.setY(new Object[]{(ady) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 777066731, -777066731, System.identityHashCode(ajjVar2))}, 691787085, -691787084, (int) System.currentTimeMillis())).setX(0)}, 1337255032, -1337255030, (int) System.currentTimeMillis());
            byte[] bArr = (byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar));
            aiw aiwVar = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 912478577, -912478575, System.identityHashCode(ajjVar2));
            return new azn((azk) x2.k(new Object[]{(adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -661220858, 661220861, System.identityHashCode(aiwVar))}, 149475853, -149475837, (int) System.currentTimeMillis()), bArr);
        }
    }

    public static class h extends f {
        public h() {
            super(0);
        }

        @Override // com.mypinpad.tsdk.i.baf.f
        public final amw a(ajj ajjVar) throws IOException {
            Object[] objArr = {this, ajjVar};
            System.identityHashCode(this);
            ajj ajjVar2 = (ajj) objArr[1];
            acz aczVar = (acz) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, -792808893, 792808894, System.identityHashCode(ajjVar2));
            byte[] bArr = (byte[]) acz.setDividerPadding(new Object[]{aczVar}, 541981427, -541981422, System.identityHashCode(aczVar));
            aiw aiwVar = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 912478577, -912478575, System.identityHashCode(ajjVar2));
            return new axe((axd) x2.k(new Object[]{(adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -661220858, 661220861, System.identityHashCode(aiwVar))}, 95838676, -95838641, (int) System.currentTimeMillis()), (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr, 1, Integer.valueOf(bArr.length)}, 525237936, -525237917, 1));
        }
    }

    public static class i extends f {
        public i() {
            super(0);
        }

        @Override // com.mypinpad.tsdk.i.baf.f
        public final amw a(ajj ajjVar) throws IOException {
            Object[] objArr = {this, ajjVar};
            System.identityHashCode(this);
            ajj ajjVar2 = (ajj) objArr[1];
            ads adsVar = (ads) ads.setDividerPadding(new Object[]{(ady) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 777066731, -777066731, System.identityHashCode(ajjVar2))}, 1337255032, -1337255030, (int) System.currentTimeMillis());
            byte[] bArr = (byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar));
            aiw aiwVar = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 912478577, -912478575, System.identityHashCode(ajjVar2));
            return new axj((axi) x2.k(new Object[]{(adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -661220858, 661220861, System.identityHashCode(aiwVar))}, -1790218232, 1790218259, (int) System.currentTimeMillis()), bArr);
        }
    }

    public static class j extends f {
        public j() {
            super(0);
        }

        @Override // com.mypinpad.tsdk.i.baf.f
        public final amw a(ajj ajjVar) throws IOException {
            Object x4;
            Object[] objArr = {this, ajjVar};
            System.identityHashCode(this);
            ajj ajjVar2 = (ajj) objArr[1];
            aiw aiwVar = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 912478577, -912478575, System.identityHashCode(ajjVar2));
            avz avzVar = (avz) avz.setX(new Object[]{(add) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -513456911, 513456913, System.identityHashCode(aiwVar))}, -366821983, 366821987, (int) System.currentTimeMillis());
            if (avzVar != null) {
                aiw aiwVar2 = (aiw) avz.setX(new Object[]{avzVar}, -1861972624, 1861972624, System.identityHashCode(avzVar));
                adu aduVar = (adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar2}, -661220858, 661220861, System.identityHashCode(aiwVar2));
                avx avxVar = (avx) avx.setDividerPadding(new Object[]{(ady) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 777066731, -777066731, System.identityHashCode(ajjVar2))}, 744650889, -744650887, (int) System.currentTimeMillis());
                bay.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new bay.setCompoundDrawableTintBlendMode(new bax(((Integer) avz.setX(new Object[]{avzVar}, -388635423, 388635424, System.identityHashCode(avzVar))).intValue(), ((Integer) avz.setX(new Object[]{avzVar}, 1906123259, -1906123256, System.identityHashCode(avzVar))).intValue(), (aky) x2.k(new Object[]{aduVar}, -1245342802, 1245342815, (int) System.currentTimeMillis())));
                bay.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode2 = (bay.setCompoundDrawableTintBlendMode) bay.setCompoundDrawableTintBlendMode.setX(new Object[]{setcompounddrawabletintblendmode, (byte[]) avx.setDividerPadding(new Object[]{avxVar}, 628529069, -628529066, System.identityHashCode(avxVar))}, -817022474, 817022481, System.identityHashCode(setcompounddrawabletintblendmode));
                bay.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode3 = (bay.setCompoundDrawableTintBlendMode) bay.setCompoundDrawableTintBlendMode.setX(new Object[]{setcompounddrawabletintblendmode2, (byte[]) avx.setDividerPadding(new Object[]{avxVar}, 1442270359, -1442270358, System.identityHashCode(avxVar))}, -1801529851, 1801529851, System.identityHashCode(setcompounddrawabletintblendmode2));
                x4 = bay.setCompoundDrawableTintBlendMode.setX(new Object[]{setcompounddrawabletintblendmode3}, -115769576, 115769580, System.identityHashCode(setcompounddrawabletintblendmode3));
            } else {
                ads adsVar = (ads) ads.setDividerPadding(new Object[]{(ady) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 777066731, -777066731, System.identityHashCode(ajjVar2))}, 1337255032, -1337255030, (int) System.currentTimeMillis());
                byte[] bArr = (byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar));
                int iIntValue = ((Integer) ber.setDividerPadding(new Object[]{bArr, 0}, 450133947, -450133937, 0)).intValue();
                bay.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode4 = new bay.setCompoundDrawableTintBlendMode((bax) bax.setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue)}, 881387543, -881387534, iIntValue));
                bay.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode5 = (bay.setCompoundDrawableTintBlendMode) bay.setCompoundDrawableTintBlendMode.setX(new Object[]{setcompounddrawabletintblendmode4, bArr}, -1770964303, 1770964304, System.identityHashCode(setcompounddrawabletintblendmode4));
                x4 = bay.setCompoundDrawableTintBlendMode.setX(new Object[]{setcompounddrawabletintblendmode5}, -115769576, 115769580, System.identityHashCode(setcompounddrawabletintblendmode5));
            }
            return (bay) x4;
        }
    }

    public static class k extends f {
        public k() {
            super(0);
        }

        @Override // com.mypinpad.tsdk.i.baf.f
        public final amw a(ajj ajjVar) throws IOException {
            Object[] objArr = {this, ajjVar};
            System.identityHashCode(this);
            ajj ajjVar2 = (ajj) objArr[1];
            ads adsVar = (ads) ads.setDividerPadding(new Object[]{(ady) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 777066731, -777066731, System.identityHashCode(ajjVar2))}, 1337255032, -1337255030, (int) System.currentTimeMillis());
            byte[] bArr = (byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar));
            aiw aiwVar = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 912478577, -912478575, System.identityHashCode(ajjVar2));
            return new ayq((ayn) x2.k(new Object[]{(adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -661220858, 661220861, System.identityHashCode(aiwVar))}, -740620284, 740620305, (int) System.currentTimeMillis()), bArr);
        }
    }

    public static class l extends f {
        public l() {
            super(0);
        }

        @Override // com.mypinpad.tsdk.i.baf.f
        public final amw a(ajj ajjVar) throws IOException {
            Object[] objArr = {this, ajjVar};
            System.identityHashCode(this);
            ajj ajjVar2 = (ajj) objArr[1];
            ads adsVar = (ads) ads.setDividerPadding(new Object[]{(ady) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 777066731, -777066731, System.identityHashCode(ajjVar2))}, 1337255032, -1337255030, (int) System.currentTimeMillis());
            byte[] bArr = (byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar));
            aiw aiwVar = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 912478577, -912478575, System.identityHashCode(ajjVar2));
            return new axq((axp) x2.k(new Object[]{(adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -661220858, 661220861, System.identityHashCode(aiwVar))}, 95739742, -95739717, (int) System.currentTimeMillis()), bArr);
        }
    }

    public static class m extends f {
        public m() {
            super(0);
        }

        @Override // com.mypinpad.tsdk.i.baf.f
        public final amw a(ajj ajjVar) throws IOException {
            Object[] objArr = {this, ajjVar};
            System.identityHashCode(this);
            ajj ajjVar2 = (ajj) objArr[1];
            avl avlVar = (avl) avl.setCompoundDrawableTintBlendMode(new Object[]{(ady) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 777066731, -777066731, System.identityHashCode(ajjVar2))}, -111967668, 111967669, (int) System.currentTimeMillis());
            return new bdq(avlVar.setOnFocusChangeListener(), avlVar.setY(), avlVar.setCompoundDrawableTintBlendMode(), (String) x2.k(new Object[]{avlVar.setDividerPadding().setDividerPadding()}, 81608992, -81608977, (int) System.currentTimeMillis()));
        }
    }

    public static class n extends f {
        public n() {
            super(0);
        }

        @Override // com.mypinpad.tsdk.i.baf.f
        public final amw a(ajj ajjVar) throws IOException {
            Object[] objArr = {this, ajjVar};
            System.identityHashCode(this);
            ajj ajjVar2 = (ajj) objArr[1];
            aiw aiwVar = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 912478577, -912478575, System.identityHashCode(ajjVar2));
            aww awwVar = (aww) x2.k(new Object[]{(adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -661220858, 661220861, System.identityHashCode(aiwVar))}, 1078367349, -1078367338, (int) System.currentTimeMillis());
            try {
                avn avnVar = (avn) avn.setDividerPadding(new Object[]{(ady) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 777066731, -777066731, System.identityHashCode(ajjVar2))}, -469735755, 469735755, (int) System.currentTimeMillis());
                return new axa(awwVar, avnVar.setX(), avnVar.setDividerPadding());
            } catch (IOException unused) {
                return new axa(awwVar, ((acz) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, -792808893, 792808894, System.identityHashCode(ajjVar2))).setDividerPadding());
            }
        }
    }

    public static class o extends f {
        public o() {
            super(0);
        }

        @Override // com.mypinpad.tsdk.i.baf.f
        public final amw a(ajj ajjVar) throws IOException {
            Object[] objArr = {this, ajjVar};
            System.identityHashCode(this);
            ajj ajjVar2 = (ajj) objArr[1];
            ads adsVar = (ads) ads.setDividerPadding(new Object[]{(ady) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 777066731, -777066731, System.identityHashCode(ajjVar2))}, 1337255032, -1337255030, (int) System.currentTimeMillis());
            byte[] bArr = (byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar));
            aiw aiwVar = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 912478577, -912478575, System.identityHashCode(ajjVar2));
            return new baa((azz) x2.k(new Object[]{(adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -661220858, 661220861, System.identityHashCode(aiwVar))}, 1009577693, -1009577664, (int) System.currentTimeMillis()), (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr, 4, Integer.valueOf(bArr.length)}, 525237936, -525237917, 4));
        }
    }

    public static class p extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f54301a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f54302b = 1;

        public p() {
            super(0);
        }

        public static /* synthetic */ awy b(Object[] objArr, int i10, int i11) {
            int i12 = ~i10;
            int i13 = ~i11;
            if ((i13 * 701) + ((i12 | i11) * (-701)) + ((~(i12 | i13)) * 701) + (i11 * 702) + (i10 * (-700)) != 1) {
                ajj ajjVar = (ajj) objArr[1];
                int i14 = f54302b;
                int i15 = (i14 | 105) << 1;
                int i16 = -(((~i14) & 105) | (i14 & (-106)));
                int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                f54301a = i17 % 128;
                if (i17 % 2 != 0) {
                    aiw aiwVar = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar}, 912478577, -912478575, System.identityHashCode(ajjVar));
                    Object[] objArr2 = {(awu) x2.k(new Object[]{(adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -661220858, 661220861, System.identityHashCode(aiwVar))}, 1340222263, -1340222261, (int) System.currentTimeMillis()), (acz) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar}, -792808893, 792808894, System.identityHashCode(ajjVar))};
                    System.currentTimeMillis();
                    b(objArr2, -409142510, 409142511);
                    throw null;
                }
                aiw aiwVar2 = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar}, 912478577, -912478575, System.identityHashCode(ajjVar));
                Object[] objArr3 = {(awu) x2.k(new Object[]{(adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar2}, -661220858, 661220861, System.identityHashCode(aiwVar2))}, 1340222263, -1340222261, (int) System.currentTimeMillis()), (acz) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar}, -792808893, 792808894, System.identityHashCode(ajjVar))};
                System.currentTimeMillis();
                awy awyVarB = b(objArr3, -409142510, 409142511);
                int i18 = f54301a;
                int i19 = ((((i18 ^ 109) | (i18 & 109)) << 1) - (~(-(((~i18) & 109) | (i18 & (-110)))))) - 1;
                f54302b = i19 % 128;
                int i20 = i19 % 2;
                return awyVarB;
            }
            awu awuVar = (awu) objArr[0];
            acz aczVar = (acz) objArr[1];
            int i21 = f54301a;
            int i22 = i21 ^ 103;
            int i23 = ((i21 & 103) | i22) << 1;
            int i24 = -i22;
            int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
            f54302b = i25 % 128;
            try {
                if (i25 % 2 == 0) {
                    boolean z10 = ((ady) ady.setNavigationOnClickListener(new Object[]{(byte[]) acz.setDividerPadding(new Object[]{aczVar}, 541981427, -541981422, System.identityHashCode(aczVar))}, -1692126728, 1692126730, (int) System.currentTimeMillis())) instanceof aed;
                    throw null;
                }
                ady adyVar = (ady) ady.setNavigationOnClickListener(new Object[]{(byte[]) acz.setDividerPadding(new Object[]{aczVar}, 541981427, -541981422, System.identityHashCode(aczVar))}, -1692126728, 1692126730, (int) System.currentTimeMillis());
                if (!(adyVar instanceof aed)) {
                    ads adsVar = (ads) ads.setDividerPadding(new Object[]{adyVar}, 1337255032, -1337255030, (int) System.currentTimeMillis());
                    awy awyVar = new awy(awuVar, (byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar)));
                    int i26 = f54301a + 53;
                    f54302b = i26 % 128;
                    if (i26 % 2 != 0) {
                        return awyVar;
                    }
                    throw null;
                }
                aed aedVar = (aed) aed.setY(new Object[]{adyVar}, 691787085, -691787084, (int) System.currentTimeMillis());
                awy awyVar2 = new awy(awuVar, ads.setX(aedVar.setX(0)).setCompoundDrawableTintBlendMode(), ads.setX(aedVar.setX(1)).setCompoundDrawableTintBlendMode());
                int i27 = f54302b;
                int i28 = i27 & 9;
                int i29 = (i27 | 9) & (~i28);
                int i30 = i28 << 1;
                int i31 = (i29 & i30) + (i29 | i30);
                f54301a = i31 % 128;
                if (i31 % 2 == 0) {
                    return awyVar2;
                }
                throw null;
            } catch (IOException unused) {
                return new awy(awuVar, aczVar.setDividerPadding());
            }
        }

        @Override // com.mypinpad.tsdk.i.baf.f
        public final amw a(ajj ajjVar) throws IOException {
            Object[] objArr = {this, ajjVar};
            System.identityHashCode(this);
            return b(objArr, 1103463647, -1103463647);
        }
    }

    public static class q extends f {
        public q() {
            super(0);
        }

        @Override // com.mypinpad.tsdk.i.baf.f
        public final amw a(ajj ajjVar) throws IOException {
            Object[] objArr = {this, ajjVar};
            System.identityHashCode(this);
            ajj ajjVar2 = (ajj) objArr[1];
            return new ayd(((acz) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, -792808893, 792808894, System.identityHashCode(ajjVar2))).setNavigationOnClickListener());
        }
    }

    public static class r extends f {
        public r() {
            super(0);
        }

        @Override // com.mypinpad.tsdk.i.baf.f
        public final amw a(ajj ajjVar) throws IOException {
            Object[] objArr = {this, ajjVar};
            System.identityHashCode(this);
            ajj ajjVar2 = (ajj) objArr[1];
            ads adsVar = (ads) ads.setDividerPadding(new Object[]{(ady) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 777066731, -777066731, System.identityHashCode(ajjVar2))}, 1337255032, -1337255030, (int) System.currentTimeMillis());
            byte[] bArr = (byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar));
            aiw aiwVar = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 912478577, -912478575, System.identityHashCode(ajjVar2));
            return new ayi((ayk) x2.k(new Object[]{(adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -661220858, 661220861, System.identityHashCode(aiwVar))}, 1718175041, -1718175009, (int) System.currentTimeMillis()), bArr);
        }
    }

    public static class s extends f {
        public s() {
            super(0);
        }

        @Override // com.mypinpad.tsdk.i.baf.f
        public final amw a(ajj ajjVar) throws IOException {
            Object[] objArr = {this, ajjVar};
            System.identityHashCode(this);
            ajj ajjVar2 = (ajj) objArr[1];
            return new azs(((acz) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, -792808893, 792808894, System.identityHashCode(ajjVar2))).setNavigationOnClickListener(), (String) x2.k(new Object[]{avr.setY(((aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 912478577, -912478575, System.identityHashCode(ajjVar2))).setCompoundDrawableTintBlendMode())}, -819957658, 819957681, (int) System.currentTimeMillis()));
        }
    }

    public static class t extends f {
        public t() {
            super(0);
        }

        @Override // com.mypinpad.tsdk.i.baf.f
        public final amw a(ajj ajjVar) throws IOException {
            Object[] objArr = {this, ajjVar};
            System.identityHashCode(this);
            ajj ajjVar2 = (ajj) objArr[1];
            avj avjVar = (avj) avj.setX(new Object[]{(ady) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 777066731, -777066731, System.identityHashCode(ajjVar2))}, 557978652, -557978652, (int) System.currentTimeMillis());
            byte[] bArr = (byte[]) avj.setX(new Object[]{avjVar}, 143831184, -143831182, System.identityHashCode(avjVar));
            aiw aiwVar = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 912478577, -912478575, System.identityHashCode(ajjVar2));
            return new awo((awn) x2.k(new Object[]{(adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -661220858, 661220861, System.identityHashCode(aiwVar))}, -1425447275, 1425447279, (int) System.currentTimeMillis()), bArr);
        }
    }

    public static class u extends f {
        public u() {
            super(0);
        }

        @Override // com.mypinpad.tsdk.i.baf.f
        public final amw a(ajj ajjVar) throws IOException {
            Object[] objArr = {this, ajjVar};
            System.identityHashCode(this);
            ajj ajjVar2 = (ajj) objArr[1];
            ads adsVar = (ads) ads.setDividerPadding(new Object[]{(ady) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 777066731, -777066731, System.identityHashCode(ajjVar2))}, 1337255032, -1337255030, (int) System.currentTimeMillis());
            byte[] bArr = (byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar));
            aiw aiwVar = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 912478577, -912478575, System.identityHashCode(ajjVar2));
            return new awj((awa) x2.k(new Object[]{(adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -661220858, 661220861, System.identityHashCode(aiwVar))}, 1139146779, -1139146767, (int) System.currentTimeMillis()), bArr);
        }
    }

    public static class v extends f {
        public v() {
            super(0);
        }

        @Override // com.mypinpad.tsdk.i.baf.f
        public final amw a(ajj ajjVar) throws IOException {
            Object[] objArr = {this, ajjVar};
            System.identityHashCode(this);
            ajj ajjVar2 = (ajj) objArr[1];
            ads adsVar = (ads) ads.setDividerPadding(new Object[]{(ady) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 777066731, -777066731, System.identityHashCode(ajjVar2))}, 1337255032, -1337255030, (int) System.currentTimeMillis());
            byte[] bArr = (byte[]) ads.setDividerPadding(new Object[]{adsVar}, -952512304, 952512305, System.identityHashCode(adsVar));
            aiw aiwVar = (aiw) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar2}, 912478577, -912478575, System.identityHashCode(ajjVar2));
            return new azf((aze) x2.k(new Object[]{(adu) aiw.setOnFocusChangeListener(new Object[]{aiwVar}, -661220858, 661220861, System.identityHashCode(aiwVar))}, 2083172271, -2083172264, (int) System.currentTimeMillis()), bArr);
        }
    }

    static {
        HashMap map = new HashMap();
        f54296a = map;
        map.put(avq.setOnDragListener, new e());
        map.put(avq.setOnLongClickListener, new e());
        map.put(avq.setX, new s());
        map.put(avq.setDividerPadding, new q());
        map.put(avq.setLayoutAnimation, new d());
        map.put(avq.setNavigationOnClickListener, new j());
        map.put(ahl.setCompoundDrawableTintBlendMode, new d());
        map.put(ahl.setOnFocusChangeListener, new j());
        map.put(ahv.setMinHeight, new c());
        map.put(avq.setOnFocusChangeListener, new m());
        map.put(ahb.setSmoothScrollbarEnabled, new o());
        map.put(ahb.setAdapter, new o());
        map.put(ahb.setCacheColorHint, new o());
        map.put(ahb.setFilterTouchesWhenObscured, new o());
        map.put(ahb.setSelectedChildViewEnabled, new o());
        map.put(ahb.getError, new o());
        map.put(ahb.getPreferredLanguage, new o());
        map.put(ahb.setImageTintMode, new o());
        map.put(ahb.setRendererPriorityPolicy, new o());
        map.put(ahb.setSaveEnabled, new o());
        map.put(ahb.TsdkManualInitializerinit1, new o());
        map.put(ahb.getType, new o());
        map.put(ahb.setError, new o());
        map.put(ahb.setTitleMarginEnd, new o());
        map.put(ahb.UiMessageCallbackKt, new o());
        map.put(ahb.setHint, new o());
        map.put(ahb.setTooltipText, new o());
        map.put(ahb.setWebChromeClient, new o());
        map.put(ahb.setImageState, new o());
        map.put(ahb.UiMessage, new t());
        map.put(ahb.UiMessageId, new t());
        map.put(ahb.setSecondaryProgressTintMode, new t());
        map.put(ahb.getNumericCode, new t());
        map.put(ahb.setSelected, new t());
        map.put(ahb.TsdkManualInitializer, new t());
        map.put(ahb.setSingleLine, new t());
        map.put(ahb.setHttpAuthUsernamePassword, new t());
        map.put(ahb.setIndeterminateTintList, new t());
        map.put(ahb.setProgressDrawable, new t());
        map.put(ahb.deactivate, new i());
        map.put(ahb.setOutlineAmbientShadowColor, new i());
        map.put(ahb.setOnGroupClickListener, new i());
        map.put(ahb.junkify, new i());
        map.put(ahb.setFocusableInTouchMode, new i());
        map.put(ahb.setBackgroundResource, new i());
        map.put(ahb.setMin, new g());
        map.put(ahb.getCurrencyCustomFormatting, new g());
        map.put(ahb.setClipBounds, new g());
        map.put(ahb.getView, new g());
        map.put(ahb.addSuppressed, new g());
        map.put(ahb.CurrencyKt, new g());
        map.put(ahb.setOnCapturedPointerListener, new g());
        map.put(ahb.setOnGroupCollapseListener, new g());
        map.put(ahb.setTransformationMethod, new g());
        map.put(ahb.getClearButtonText, new g());
        map.put(ahb.TransactionErrorCause, new g());
        map.put(ahb.setPointerIcon, new g());
        map.put(ahb.getAmountOther, new g());
        map.put(ahb.TerminalErrorCodes, new g());
        map.put(ahb.setAccessibilityTraversalBefore, new g());
        map.put(ahb.setTextDirection, new g());
        map.put(ahb.setSupportImageTintMode, new g());
        map.put(ahb.setTitle, new g());
        map.put(ahb.setSpannableFactory, new a());
        map.put(ahb.setEmptyView, new a());
        map.put(ahb.d2, new a());
        map.put(ahb.setScrollBarFadeDuration, new a());
        map.put(ahb.setLineBreakStyle, new a());
        map.put(ahb.CardScheme, new a());
        map.put(ahb.getHeight, new a());
        map.put(ahb.TxnResultCallbackKt, new a());
        map.put(ahb.setMinEms, new a());
        map.put(ahb.setBackgroundTintMode, new a());
        map.put(ahb.bv, new a());
        map.put(ahb.ClientCredentialsGrant, new a());
        map.put(ahb.setPersistentDrawingCache, new r());
        map.put(ahb.setAlpha, new r());
        map.put(ahb.SessionActivationFailure, new r());
        map.put(ahb.setImportantForContentCapture, new r());
        map.put(ahb.setPadding, new h());
        map.put(ahb.setActivated, new h());
        map.put(ahb.TransactionApproved, new n());
        map.put(ahb.setChoiceMode, new n());
        map.put(ahb.setStackTrace, new n());
        map.put(ahb.getGeneralBgColor, new n());
        map.put(ahb.TransactionNotAuthorised, new n());
        map.put(ahb.setLineSpacing, new n());
        map.put(ahb.getHoldTime, new k());
        map.put(ahb.setContentInsetStartWithNavigation, new k());
        map.put(ahb.setCameraDistance, new k());
        map.put(ahb.getNavBarTextColor, new k());
        map.put(ahb.setProgressBackgroundTintMode, new k());
        map.put(ahb.setTouchscreenBlocksFocus, new k());
        map.put(ahb.setFastScrollStyle, new b());
        map.put(ahb.fillInStackTrace, new b());
        map.put(ahb.setOnScrollListener, new b());
        map.put(ahb.notifyAll, new b());
        map.put(ahb.getPinGridBgColor, new b());
        map.put(ahb.setBaseline, new b());
        map.put(ahb.getReason, new p());
        map.put(ahb.setNextClusterForwardId, new p());
        map.put(ahb.getPinGridButtonBgColor, new p());
        map.put(ahb.setAccessibilityLiveRegion, new p());
        map.put(ahb.getDesignatorAfterValue, new p());
        map.put(ahb.setOnScrollChangeListener, new p());
        map.put(ahb.setIndeterminateDrawableTiled, new u());
        map.put(ahb.getTotalElapsedTimeout, new u());
        map.put(ahb.setOnTouchListener, new u());
        map.put(ahb.setOverScrollMode, new l());
        map.put(ahb.hashCode, new l());
        map.put(ahb.setMaxHeight, new l());
        map.put(ahb.setPaintFlags, new v());
        map.put(ahb.toString, new v());
        map.put(ahb.getPinDigitBgColor, new v());
        map.put(ahb.TerminalSessionDefaultImpls, new v());
        map.put(ahb.setSelectionFromTop, new v());
        map.put(ahb.setAccessibilityTraversalAfter, new v());
        System.currentTimeMillis();
        System.currentTimeMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
    
        r6 = (com.mypinpad.tsdk.isolation.aiw) com.mypinpad.tsdk.isolation.ajj.setCompoundDrawableTintBlendMode(new java.lang.Object[]{r5}, 912478577, -912478575, java.lang.System.identityHashCode(r5));
        r7 = (com.mypinpad.tsdk.i.baf.f) com.mypinpad.tsdk.isolation.baf.f54296a.get((com.mypinpad.tsdk.isolation.adu) com.mypinpad.tsdk.isolation.aiw.setOnFocusChangeListener(new java.lang.Object[]{r6}, -661220858, 661220861, java.lang.System.identityHashCode(r6)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007f, code lost:
    
        if (r7 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0081, code lost:
    
        r6 = com.mypinpad.tsdk.isolation.baf.f54297b + 95;
        com.mypinpad.tsdk.isolation.baf.f54298c = r6 % 128;
        r6 = r6 % 2;
        r5 = r7.a(r5);
        r6 = com.mypinpad.tsdk.isolation.baf.f54297b;
        r6 = (-2) - (((r6 ^ 106) + ((r6 & 106) << 1)) ^ (-1));
        com.mypinpad.tsdk.isolation.baf.f54298c = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a2, code lost:
    
        r7 = new java.lang.StringBuilder("algorithm identifier in public key not recognised: ");
        r7.append(r6.setDividerPadding());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b9, code lost:
    
        throw new java.io.IOException(r7.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00bf, code lost:
    
        throw new java.lang.IllegalArgumentException("keyInfo argument null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f6, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004a, code lost:
    
        if (r5 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004d, code lost:
    
        if (r5 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setY(java.lang.Object[] r5, int r6, int r7, int r8) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.baf.setY(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static amw setY(ajj ajjVar) throws IOException {
        return (amw) setY(new Object[]{ajjVar}, -1408872677, 1408872678, (int) System.currentTimeMillis());
    }
}
