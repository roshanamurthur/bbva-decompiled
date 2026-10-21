package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.esotericsoftware.asm.Opcodes;
import java.math.BigInteger;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes10.dex */
public final class ajy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Hashtable f52949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Hashtable f52950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Hashtable f52951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f52952d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f52953e = 1;

    public static class a extends ajx {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f52954e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f52955f = 1;

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i11;
            int i14 = ~i12;
            if ((((~(i10 | i14 | i11)) | (~(i12 | i13)) | (~((~i10) | i13))) * 988) + ((i10 | i13) * (-988)) + (((~(i13 | i14 | i10)) | (~(i10 | i11 | i12))) * 988) + (i11 * (-987)) + (i10 * 989) != 1) {
                aph compoundDrawableTintBlendMode = ((a) objArr[0]).setCompoundDrawableTintBlendMode();
                ajz ajzVar = new ajz(compoundDrawableTintBlendMode, (akb) ajy.setY(new Object[]{compoundDrawableTintBlendMode, "03375D4CE24FDE434489DE8746E71786015009E66E38A926DD"}, -899146721, 899146722, (int) System.currentTimeMillis()), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, 162865573, -162865565, System.identityHashCode(compoundDrawableTintBlendMode)), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, -1899125725, 1899125734, System.identityHashCode(compoundDrawableTintBlendMode)), null);
                int i15 = f52954e;
                int i16 = ((i15 & 12) + (i15 | 12)) - 1;
                f52955f = i16 % 128;
                if (i16 % 2 != 0) {
                    return ajzVar;
                }
                int i17 = 11 / 0;
                return ajzVar;
            }
            aph aphVar = (aph) ajy.setY(new Object[]{new aph.setCompoundDrawableTintBlendMode(Opcodes.ATHROW, 9, ajy.a("6C01074756099122221056911C77D77E77A777E7E7E77FCB"), ajy.a("71FE1AF926CF847989EFEF8DB459F66394D90F32AD3F15E8"), (BigInteger) ajy.setY(new Object[]{"155555555555555555555555610C0B196812BFB6288A3EA3"}, -1328672270, 1328672277, (int) System.currentTimeMillis()), BigInteger.valueOf(6L))}, 1943199239, -1943199234, (int) System.currentTimeMillis());
            int i18 = f52955f;
            int i19 = i18 & 63;
            int i20 = ((i18 ^ 63) | i19) << 1;
            int i21 = -((i18 | 63) & (~i19));
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            f52954e = i22 % 128;
            int i23 = i22 % 2;
            return aphVar;
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final aph setDividerPadding() {
            return (aph) a(new Object[]{this}, 68605782, -68605781, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final ajz setX() {
            return (ajz) a(new Object[]{this}, -2048760376, 2048760376, System.identityHashCode(this));
        }
    }

    public static class b extends ajx {
        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11) {
            int i12 = ~i11;
            int i13 = (i12 * (-629)) + (i11 * (-628)) + (i10 * 630);
            int i14 = ~i10;
            if (((i14 | i11) * 629) + ((~(i12 | i14)) * (-629)) + i13 != 1) {
                return (aph) ajy.setY(new Object[]{new aph.setCompoundDrawableTintBlendMode(304, 1, 2, 11, ajy.a("FD0D693149A118F651E6DCE6802085377E5F882D1B510B44160074C1288078365A0396C8E681"), ajy.a("BDDB97E555A50A908E43B01C798EA5DAA6788F1EA2794EFCF57166B8C14039601E55827340BE"), (BigInteger) ajy.setY(new Object[]{"0101D556572AABAC800101D556572AABAC8001022D5C91DD173F8FB561DA6899164443051D"}, -1328672270, 1328672277, (int) System.currentTimeMillis()), BigInteger.valueOf(65070L))}, 1943199239, -1943199234, (int) System.currentTimeMillis());
            }
            aph compoundDrawableTintBlendMode = ((b) objArr[0]).setCompoundDrawableTintBlendMode();
            return new ajz(compoundDrawableTintBlendMode, (akb) ajy.setY(new Object[]{compoundDrawableTintBlendMode, "02197B07845E9BE2D96ADB0F5F3C7F2CFFBD7A3EB8B6FEC35C7FD67F26DDF6285A644F740A2614"}, -899146721, 899146722, (int) System.currentTimeMillis()), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, 162865573, -162865565, System.identityHashCode(compoundDrawableTintBlendMode)), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, -1899125725, 1899125734, System.identityHashCode(compoundDrawableTintBlendMode)), null);
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final aph setDividerPadding() {
            Object[] objArr = {this};
            System.identityHashCode(this);
            return (aph) a(objArr, -1575300986, 1575300986);
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final ajz setX() {
            Object[] objArr = {this};
            System.identityHashCode(this);
            return (ajz) a(objArr, 1451605490, -1451605489);
        }
    }

    public static class c extends ajx {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f52956e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f52957f = 1;

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * (-978)) + (i10 * 980);
            int i14 = ~i11;
            int i15 = ~i12;
            if ((((~(i10 | i15)) | (~(i14 | i12))) * 979) + ((i10 | i12) * (-979)) + ((~(i14 | i15)) * 979) + i13 != 1) {
                aph compoundDrawableTintBlendMode = ((c) objArr[0]).setCompoundDrawableTintBlendMode();
                ajz ajzVar = new ajz(compoundDrawableTintBlendMode, (akb) ajy.setY(new Object[]{compoundDrawableTintBlendMode, "021085E2755381DCCCE3C1557AFA10C2F0C0C2825646C5B34A394CBCFA8BC16B22E7E789E927BE216F02E1FB136A5F"}, -899146721, 899146722, (int) System.currentTimeMillis()), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, 162865573, -162865565, System.identityHashCode(compoundDrawableTintBlendMode)), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, -1899125725, 1899125734, System.identityHashCode(compoundDrawableTintBlendMode)), null);
                int i16 = f52956e + 7;
                f52957f = i16 % 128;
                int i17 = i16 % 2;
                return ajzVar;
            }
            aph aphVar = (aph) ajy.setY(new Object[]{new aph.setCompoundDrawableTintBlendMode(368, 1, 2, 85, ajy.a("E0D2EE25095206F5E2A4F9ED229F1F256E79A0E2B455970D8D0D865BD94778C576D62F0AB7519CCD2A1A906AE30D"), ajy.a("FC1217D4320A90452C760A58EDCD30C8DD069B3C34453837A34ED50CB54917E1C2112D84D164F444F8F74786046A"), (BigInteger) ajy.setY(new Object[]{"010090512DA9AF72B08349D98A5DD4C7B0532ECA51CE03E2D10F3B7AC579BD87E909AE40A6F131E9CFCE5BD967"}, -1328672270, 1328672277, (int) System.currentTimeMillis()), BigInteger.valueOf(65392L))}, 1943199239, -1943199234, (int) System.currentTimeMillis());
            int i18 = f52957f;
            int i19 = ((i18 | 53) << 1) - (i18 ^ 53);
            f52956e = i19 % 128;
            int i20 = i19 % 2;
            return aphVar;
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final aph setDividerPadding() {
            return (aph) a(new Object[]{this}, 2058708932, -2058708931, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final ajz setX() {
            return (ajz) a(new Object[]{this}, -249884909, 249884909, System.identityHashCode(this));
        }
    }

    public static class d extends ajx {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f52958e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f52959f = 1;

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            Object ajzVar;
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = (~(i13 | i14)) | (~(i14 | i12));
            int i16 = ~i12;
            int i17 = i16 | i10;
            if (((~i17) * 886) + ((i10 | (~(i11 | i16))) * (-1772)) + ((i15 | (~(i17 | i11))) * 886) + (i11 * (-885)) + (i10 * 1773) != 1) {
                aph compoundDrawableTintBlendMode = ((d) objArr[0]).setCompoundDrawableTintBlendMode();
                ajzVar = new ajz(compoundDrawableTintBlendMode, (akb) ajy.setY(new Object[]{compoundDrawableTintBlendMode, "026108BABB2CEEBCF787058A056CBE0CFE622D7723A289E08A07AE13EF0D10D171DD8D"}, -899146721, 899146722, (int) System.currentTimeMillis()), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, 162865573, -162865565, System.identityHashCode(compoundDrawableTintBlendMode)), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, -1899125725, 1899125734, System.identityHashCode(compoundDrawableTintBlendMode)), null);
                int i18 = f52958e;
                int i19 = i18 & 115;
                int i20 = ((i18 | 115) & (~i19)) + (i19 << 1);
                f52959f = i20 % 128;
                if (i20 % 2 == 0) {
                    throw null;
                }
            } else {
                ajzVar = (aph) ajy.setY(new Object[]{new aph.setCompoundDrawableTintBlendMode(272, 1, 3, 56, ajy.a("91A091F03B5FBA4AB2CCF49C4EDD220FB028712D42BE752B2C40094DBACDB586FB20"), ajy.a("7167EFC92BB2E3CE7C8AAAFF34E12A9C557003D7C73A6FAF003F99F6CC8482E540F7"), (BigInteger) ajy.setY(new Object[]{"0100FAF51354E0E39E4892DF6E319C72C8161603FA45AA7B998A167B8F1E629521"}, -1328672270, 1328672277, (int) System.currentTimeMillis()), BigInteger.valueOf(65286L))}, 1943199239, -1943199234, (int) System.currentTimeMillis());
                int i21 = f52959f + 59;
                f52958e = i21 % 128;
                if (i21 % 2 != 0) {
                    throw null;
                }
            }
            return ajzVar;
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final aph setDividerPadding() {
            return (aph) a(new Object[]{this}, 237305427, -237305426, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final ajz setX() {
            return (ajz) a(new Object[]{this}, 111719859, -111719859, System.identityHashCode(this));
        }
    }

    public static class e extends ajx {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f52960e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f52961f = 1;

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~(i13 | i12);
            int i15 = ~i12;
            int i16 = ((i14 | (~(i15 | i11))) * (-1808)) + (i11 * (-903)) + (i10 * 905);
            int i17 = ~i11;
            int i18 = i10 | i15;
            if ((((~i18) | (~(i11 | i13)) | (~(i12 | i17))) * 904) + (((~(i18 | i11)) | (~(i13 | i17 | i12))) * 904) + i16 == 1) {
                e eVar = (e) objArr[0];
                byte[] bArr = (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"31a92ee2029fd10d901b113e990710f0d21ac6b6"}, -666540625, 666540626, (int) System.currentTimeMillis());
                aph compoundDrawableTintBlendMode = eVar.setCompoundDrawableTintBlendMode();
                ajz ajzVar = new ajz(compoundDrawableTintBlendMode, (akb) ajy.setY(new Object[]{compoundDrawableTintBlendMode, "03eea2bae7e1497842f2de7769cfe9c989c072ad696f48034a"}, -899146721, 899146722, (int) System.currentTimeMillis()), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, 162865573, -162865565, System.identityHashCode(compoundDrawableTintBlendMode)), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, -1899125725, 1899125734, System.identityHashCode(compoundDrawableTintBlendMode)), bArr);
                int i19 = f52960e;
                int i20 = (((i19 | 13) << 1) - (~(-(((~i19) & 13) | (i19 & (-14)))))) - 1;
                f52961f = i20 % 128;
                int i21 = i20 % 2;
                return ajzVar;
            }
            aph aphVar = (aph) ajy.setY(new Object[]{new aph.setX(ajy.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"), ajy.a("fffffffffffffffffffffffffffffffefffffffffffffffc"), ajy.a("cc22d6dfb95c6b25e49c0d6364a4e5980c393aa21668d953"), (BigInteger) ajy.setY(new Object[]{"fffffffffffffffffffffffe5fb1a724dc80418648d8dd31"}, -1328672270, 1328672277, (int) System.currentTimeMillis()), BigInteger.valueOf(1L), true)}, 1943199239, -1943199234, (int) System.currentTimeMillis());
            int i22 = f52961f;
            int i23 = i22 & 103;
            int i24 = (i22 | 103) & (~i23);
            int i25 = i23 << 1;
            int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
            f52960e = i26 % 128;
            if (i26 % 2 == 0) {
                return aphVar;
            }
            int i27 = 84 / 0;
            return aphVar;
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final aph setDividerPadding() {
            return (aph) a(new Object[]{this}, -201992249, 201992249, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final ajz setX() {
            return (ajz) a(new Object[]{this}, -1554327176, 1554327177, System.identityHashCode(this));
        }
    }

    public static class f extends ajx {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f52962e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f52963f = 1;

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            Object ajzVar;
            int i13 = ((i10 | i11) * (-366)) + (i11 * 367) + (i10 * 367);
            int i14 = ~i11;
            if ((((~(i10 | i14 | i12)) | (~(i11 | (~i10)))) * 366) + (((~(i14 | i12)) | i10) * (-366)) + i13 != 1) {
                ajzVar = (aph) ajy.setY(new Object[]{new aph.setCompoundDrawableTintBlendMode(359, 68, ajy.a("5667676A654B20754F356EA92017D946567C46675556F19556A04616B567D223A5E05656FB549016A96656A557"), ajy.a("2472E2D0197C49363F1FE7F5B6DB075D52B6947D135D8CA445805D39BC345626089687742B6329E70680231988"), (BigInteger) ajy.setY(new Object[]{"01AF286BCA1AF286BCA1AF286BCA1AF286BCA1AF286BC9FB8F6B85C556892C20A7EB964FE7719E74F490758D3B"}, -1328672270, 1328672277, (int) System.currentTimeMillis()), BigInteger.valueOf(76L))}, 1943199239, -1943199234, (int) System.currentTimeMillis());
                int i15 = f52962e;
                int i16 = (-2) - (((i15 ^ 40) + ((i15 & 40) << 1)) ^ (-1));
                f52963f = i16 % 128;
                if (i16 % 2 == 0) {
                    throw null;
                }
            } else {
                aph compoundDrawableTintBlendMode = ((f) objArr[0]).setCompoundDrawableTintBlendMode();
                ajzVar = new ajz(compoundDrawableTintBlendMode, (akb) ajy.setY(new Object[]{compoundDrawableTintBlendMode, "033C258EF3047767E7EDE0F1FDAA79DAEE3841366A132E163ACED4ED2401DF9C6BDCDE98E8E707C07A2239B1B097"}, -899146721, 899146722, (int) System.currentTimeMillis()), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, 162865573, -162865565, System.identityHashCode(compoundDrawableTintBlendMode)), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, -1899125725, 1899125734, System.identityHashCode(compoundDrawableTintBlendMode)), null);
                int i17 = f52963f;
                int i18 = ((i17 | 123) << 1) - (i17 ^ 123);
                f52962e = i18 % 128;
                if (i18 % 2 != 0) {
                    int i19 = 85 / 0;
                }
            }
            return ajzVar;
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final aph setDividerPadding() {
            return (aph) a(new Object[]{this}, -665922232, 665922232, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final ajz setX() {
            return (ajz) a(new Object[]{this}, 1104816379, -1104816378, System.identityHashCode(this));
        }
    }

    public static class g extends ajx {
        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11) {
            int i12 = ~i10;
            int i13 = ((~(i12 | i11)) * 2748) + (i11 * 917) + (i10 * (-1831));
            int i14 = i12 | (~i11);
            if ((((~(i10 | i11)) | (~i14)) * 916) + (i14 * (-916)) + i13 == 1) {
                return (aph) ajy.setY(new Object[]{new aph.setX(new BigInteger("883423532389192164791648750360308885314476597252960362792450860609699839"), ajy.a("7fffffffffffffffffffffff7fffffffffff8000000000007ffffffffffc"), ajy.a("617fab6832576cbbfed50d99f0249c3fee58b94ba0038c7ae84c8c832f2c"), (BigInteger) ajy.setY(new Object[]{"7fffffffffffffffffffffff800000cfa7e8594377d414c03821bc582063"}, -1328672270, 1328672277, (int) System.currentTimeMillis()), BigInteger.valueOf(1L), true)}, 1943199239, -1943199234, (int) System.currentTimeMillis());
            }
            g gVar = (g) objArr[0];
            byte[] bArr = (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"e8b4011604095303ca3b8099982be09fcb9ae616"}, -666540625, 666540626, (int) System.currentTimeMillis());
            aph compoundDrawableTintBlendMode = gVar.setCompoundDrawableTintBlendMode();
            return new ajz(compoundDrawableTintBlendMode, (akb) ajy.setY(new Object[]{compoundDrawableTintBlendMode, "0238af09d98727705120c921bb5e9e26296a3cdcf2f35757a0eafd87b830e7"}, -899146721, 899146722, (int) System.currentTimeMillis()), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, 162865573, -162865565, System.identityHashCode(compoundDrawableTintBlendMode)), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, -1899125725, 1899125734, System.identityHashCode(compoundDrawableTintBlendMode)), bArr);
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final aph setDividerPadding() {
            Object[] objArr = {this};
            System.identityHashCode(this);
            return (aph) a(objArr, 196005426, -196005425);
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final ajz setX() {
            Object[] objArr = {this};
            System.identityHashCode(this);
            return (ajz) a(objArr, 1874147464, -1874147464);
        }
    }

    public static class h extends ajx {
        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            if ((((~(i10 | i12)) | i11) * 272) + (((~(i13 | i12)) | (~(i13 | i11))) * (-272)) + (((~((~i11) | i13 | (~i12))) | (~(i10 | i11 | i12))) * (-272)) + (i11 * (-271)) + (i10 * 273) == 1) {
                return (aph) ajy.setY(new Object[]{new aph.setX(new BigInteger("883423532389192164791648750360308885314476597252960362792450860609699839"), ajy.a("7fffffffffffffffffffffff7fffffffffff8000000000007ffffffffffc"), ajy.a("6b016c3bdcf18941d0d654921475ca71a9db2fb27d1d37796185c2942c0a"), (BigInteger) ajy.setY(new Object[]{"7fffffffffffffffffffffff7fffff9e5e9a9f5d9071fbd1522688909d0b"}, -1328672270, 1328672277, (int) System.currentTimeMillis()), BigInteger.valueOf(1L), true)}, 1943199239, -1943199234, (int) System.currentTimeMillis());
            }
            h hVar = (h) objArr[0];
            byte[] bArr = (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"e43bb460f0b80cc0c0b075798e948060f8321b7d"}, -666540625, 666540626, (int) System.currentTimeMillis());
            aph compoundDrawableTintBlendMode = hVar.setCompoundDrawableTintBlendMode();
            return new ajz(compoundDrawableTintBlendMode, (akb) ajy.setY(new Object[]{compoundDrawableTintBlendMode, "020ffa963cdca8816ccc33b8642bedf905c3d358573d3f27fbbd3b3cb9aaaf"}, -899146721, 899146722, (int) System.currentTimeMillis()), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, 162865573, -162865565, System.identityHashCode(compoundDrawableTintBlendMode)), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, -1899125725, 1899125734, System.identityHashCode(compoundDrawableTintBlendMode)), bArr);
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final aph setDividerPadding() {
            return (aph) a(new Object[]{this}, -2066274051, 2066274052, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final ajz setX() {
            return (ajz) a(new Object[]{this}, -548389134, 548389134, System.identityHashCode(this));
        }
    }

    public static class i extends ajx {
        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~(i12 | i11);
            if ((((~(i10 | (~i11))) | (~(i13 | i11))) * 110) + ((i14 | (~(i10 | i11))) * 220) + ((i13 | i14) * (-220)) + (i11 * 111) + (i10 * (-109)) != 1) {
                return (aph) ajy.setY(new Object[]{new aph.setX(new BigInteger("883423532389192164791648750360308885314476597252960362792450860609699839"), ajy.a("7fffffffffffffffffffffff7fffffffffff8000000000007ffffffffffc"), ajy.a("255705fa2a306654b1f4cb03d6a750a30c250102d4988717d9ba15ab6d3e"), (BigInteger) ajy.setY(new Object[]{"7fffffffffffffffffffffff7fffff975deb41b3a6057c3c432146526551"}, -1328672270, 1328672277, (int) System.currentTimeMillis()), BigInteger.valueOf(1L), true)}, 1943199239, -1943199234, (int) System.currentTimeMillis());
            }
            i iVar = (i) objArr[0];
            byte[] bArr = (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"7d7374168ffe3471b60a857686a19475d3bfa2ff"}, -666540625, 666540626, (int) System.currentTimeMillis());
            aph compoundDrawableTintBlendMode = iVar.setCompoundDrawableTintBlendMode();
            return new ajz(compoundDrawableTintBlendMode, (akb) ajy.setY(new Object[]{compoundDrawableTintBlendMode, "036768ae8e18bb92cfcf005c949aa2c6d94853d0e660bbf854b1c9505fe95a"}, -899146721, 899146722, (int) System.currentTimeMillis()), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, 162865573, -162865565, System.identityHashCode(compoundDrawableTintBlendMode)), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, -1899125725, 1899125734, System.identityHashCode(compoundDrawableTintBlendMode)), bArr);
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final aph setDividerPadding() {
            return (aph) a(new Object[]{this}, -1710819427, 1710819427, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final ajz setX() {
            return (ajz) a(new Object[]{this}, 1977543851, -1977543850, System.identityHashCode(this));
        }
    }

    public static class j extends ajx {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f52964e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f52965f = 1;

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11) {
            int i12 = (i11 * 702) + (i10 * (-700));
            int i13 = ~i10;
            int i14 = ~i11;
            if ((i14 * 701) + ((i13 | i11) * (-701)) + ((~(i13 | i14)) * 701) + i12 != 1) {
                j jVar = (j) objArr[0];
                byte[] bArr = (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"c469684435deb378c4b65ca9591e2a5763059a2e"}, -666540625, 666540626, (int) System.currentTimeMillis());
                aph compoundDrawableTintBlendMode = jVar.setCompoundDrawableTintBlendMode();
                ajz ajzVar = new ajz(compoundDrawableTintBlendMode, (akb) ajy.setY(new Object[]{compoundDrawableTintBlendMode, "027d29778100c65a1da1783716588dce2b8b4aee8e228f1896"}, -899146721, 899146722, (int) System.currentTimeMillis()), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, 162865573, -162865565, System.identityHashCode(compoundDrawableTintBlendMode)), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, -1899125725, 1899125734, System.identityHashCode(compoundDrawableTintBlendMode)), bArr);
                int i15 = f52965f;
                int i16 = (i15 ^ 25) + ((i15 & 25) << 1);
                f52964e = i16 % 128;
                int i17 = i16 % 2;
                return ajzVar;
            }
            aph aphVar = (aph) ajy.setY(new Object[]{new aph.setX(ajy.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"), ajy.a("fffffffffffffffffffffffffffffffefffffffffffffffc"), ajy.a("22123dc2395a05caa7423daeccc94760a7d462256bd56916"), (BigInteger) ajy.setY(new Object[]{"ffffffffffffffffffffffff7a62d031c83f4294f640ec13"}, -1328672270, 1328672277, (int) System.currentTimeMillis()), BigInteger.valueOf(1L), true)}, 1943199239, -1943199234, (int) System.currentTimeMillis());
            int i18 = f52964e;
            int i19 = i18 & 35;
            int i20 = i19 + ((i18 ^ 35) | i19);
            f52965f = i20 % 128;
            if (i20 % 2 != 0) {
                return aphVar;
            }
            int i21 = 82 / 0;
            return aphVar;
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final aph setDividerPadding() {
            Object[] objArr = {this};
            System.identityHashCode(this);
            return (aph) a(objArr, -1331575258, 1331575259);
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final ajz setX() {
            Object[] objArr = {this};
            System.identityHashCode(this);
            return (ajz) a(objArr, -2025056697, 2025056697);
        }
    }

    public static class k extends ajx {
        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = ~(i13 | i14);
            int i16 = ~i12;
            int i17 = (~(i13 | i16)) | i15 | (~(i14 | i16));
            int i18 = i10 | i11;
            int i19 = ((i17 | (~(i18 | i12))) * (-84)) + (i11 * 85) + (i10 * 85);
            int i20 = i10 | (~(i12 | i14));
            int i21 = ~(i11 | i16);
            if (((i21 | (~i18)) * 84) + ((i20 | i21) * (-84)) + i19 != 1) {
                return (aph) ajy.setY(new Object[]{new aph.setX(ajy.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"), ajy.a("fffffffffffffffffffffffffffffffefffffffffffffffc"), ajy.a("64210519e59c80e70fa7e9ab72243049feb8deecc146b9b1"), (BigInteger) ajy.setY(new Object[]{"ffffffffffffffffffffffff99def836146bc9b1b4d22831"}, -1328672270, 1328672277, (int) System.currentTimeMillis()), BigInteger.valueOf(1L), true)}, 1943199239, -1943199234, (int) System.currentTimeMillis());
            }
            k kVar = (k) objArr[0];
            byte[] bArr = (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"3045AE6FC8422f64ED579528D38120EAE12196D5"}, -666540625, 666540626, (int) System.currentTimeMillis());
            aph compoundDrawableTintBlendMode = kVar.setCompoundDrawableTintBlendMode();
            return new ajz(compoundDrawableTintBlendMode, (akb) ajy.setY(new Object[]{compoundDrawableTintBlendMode, "03188da80eb03090f67cbf20eb43a18800f4ff0afd82ff1012"}, -899146721, 899146722, (int) System.currentTimeMillis()), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, 162865573, -162865565, System.identityHashCode(compoundDrawableTintBlendMode)), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, -1899125725, 1899125734, System.identityHashCode(compoundDrawableTintBlendMode)), bArr);
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final aph setDividerPadding() {
            return (aph) a(new Object[]{this}, -1139926816, 1139926816, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final ajz setX() {
            return (ajz) a(new Object[]{this}, -2133182579, 2133182580, System.identityHashCode(this));
        }
    }

    public static class l extends ajx {
        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i11;
            int i14 = ~i12;
            int i15 = ~(i13 | i14);
            int i16 = ~i10;
            int i17 = ((i15 | (~(i16 | i12))) * (-370)) + (i11 * 371) + (i10 * 371);
            int i18 = (~(i12 | i13)) | (~(i16 | i14));
            int i19 = ~(i10 | i11);
            if ((i19 * 370) + ((i18 | i19) * (-370)) + i17 != 1) {
                return (aph) ajy.setY(new Object[]{new aph.setCompoundDrawableTintBlendMode(431, 120, ajy.a("1A827EF00DD6FC0E234CAF046C6A5D8A85395B236CC4AD2CF32A0CADBDC9DDF620B0EB9906D0957F6C6FEACD615468DF104DE296CD8F"), ajy.a("10D9B4A3D9047D8B154359ABFB1B7F5485B04CEB868237DDC9DEDA982A679A5A919B626D4E50A8DD731B107A9962381FB5D807BF2618"), (BigInteger) ajy.setY(new Object[]{"0340340340340340340340340340340340340340340340340340340323C313FAB50589703B5EC68D3587FEC60D161CC149C1AD4A91"}, -1328672270, 1328672277, (int) System.currentTimeMillis()), BigInteger.valueOf(10080L))}, 1943199239, -1943199234, (int) System.currentTimeMillis());
            }
            aph compoundDrawableTintBlendMode = ((l) objArr[0]).setCompoundDrawableTintBlendMode();
            return new ajz(compoundDrawableTintBlendMode, (akb) ajy.setY(new Object[]{compoundDrawableTintBlendMode, "02120FC05D3C67A99DE161D2F4092622FECA701BE4F50F4758714E8A87BBF2A658EF8C21E7C5EFE965361F6C2999C0C247B0DBD70CE6B7"}, -899146721, 899146722, (int) System.currentTimeMillis()), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, 162865573, -162865565, System.identityHashCode(compoundDrawableTintBlendMode)), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, -1899125725, 1899125734, System.identityHashCode(compoundDrawableTintBlendMode)), null);
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final aph setDividerPadding() {
            return (aph) a(new Object[]{this}, 62991231, -62991231, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final ajz setX() {
            return (ajz) a(new Object[]{this}, 1420601304, -1420601303, System.identityHashCode(this));
        }
    }

    public static class m extends ajx {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f52966e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f52967f = 1;

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = i13 | i14;
            int i16 = ~i15;
            int i17 = ~i12;
            if ((((~(i10 | i14 | i12)) | (~(i11 | i13)) | (~(i13 | i17))) * 168) + ((~(i15 | i12)) * 168) + ((i16 | (~(i14 | i17))) * 168) + (i11 * (-167)) + (i10 * (-167)) == 1) {
                aph compoundDrawableTintBlendMode = ((m) objArr[0]).setCompoundDrawableTintBlendMode();
                ajz ajzVar = new ajz(compoundDrawableTintBlendMode, (akb) ajy.setY(new Object[]{compoundDrawableTintBlendMode, "030024266E4EB5106D0A964D92C4860E2671DB9B6CC5"}, -899146721, 899146722, (int) System.currentTimeMillis()), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, 162865573, -162865565, System.identityHashCode(compoundDrawableTintBlendMode)), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, -1899125725, 1899125734, System.identityHashCode(compoundDrawableTintBlendMode)), null);
                int i18 = f52967f + 15;
                f52966e = i18 % 128;
                int i19 = i18 % 2;
                return ajzVar;
            }
            aph aphVar = (aph) ajy.setY(new Object[]{new aph.setCompoundDrawableTintBlendMode(163, 1, 2, 8, ajy.a("0108B39E77C4B108BED981ED0E890E117C511CF072"), ajy.a("0667ACEB38AF4E488C407433FFAE4F1C811638DF20"), (BigInteger) ajy.setY(new Object[]{"03FFFFFFFFFFFFFFFFFFFDF64DE1151ADBB78F10A7"}, -1328672270, 1328672277, (int) System.currentTimeMillis()), BigInteger.valueOf(2L))}, 1943199239, -1943199234, (int) System.currentTimeMillis());
            int i20 = f52966e;
            int i21 = i20 & 27;
            int i22 = (i20 ^ 27) | i21;
            int i23 = (i21 & i22) + (i22 | i21);
            f52967f = i23 % 128;
            int i24 = i23 % 2;
            return aphVar;
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final aph setDividerPadding() {
            return (aph) a(new Object[]{this}, 1147887524, -1147887524, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final ajz setX() {
            return (ajz) a(new Object[]{this}, -21932285, 21932286, System.identityHashCode(this));
        }
    }

    public static class n extends ajx {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f52968e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f52969f = 1;

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            Object ajzVar;
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = i13 | i14;
            int i16 = ~i15;
            int i17 = ~i12;
            if ((((~(i10 | i14 | i12)) | (~(i11 | i13)) | (~(i13 | i17))) * 168) + ((~(i15 | i12)) * 168) + ((i16 | (~(i14 | i17))) * 168) + (i11 * (-167)) + (i10 * (-167)) != 1) {
                ajzVar = (aph) ajy.setY(new Object[]{new aph.setCompoundDrawableTintBlendMode(163, 1, 2, 8, ajy.a("072546B5435234A422E0789675F432C89435DE5242"), ajy.a("00C9517D06D5240D3CFF38C74B20B6CD4D6F9DD4D9"), (BigInteger) ajy.setY(new Object[]{"0400000000000000000001E60FC8821CC74DAEAFC1"}, -1328672270, 1328672277, (int) System.currentTimeMillis()), BigInteger.valueOf(2L))}, 1943199239, -1943199234, (int) System.currentTimeMillis());
                int i18 = f52968e;
                int i19 = (((i18 ^ 37) | (i18 & 37)) << 1) - (((~i18) & 37) | (i18 & (-38)));
                f52969f = i19 % 128;
                if (i19 % 2 == 0) {
                    int i20 = 7 / 0;
                }
            } else {
                n nVar = (n) objArr[0];
                byte[] bArr = (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"D2C0FB15760860DEF1EEF4D696E6768756151754"}, -666540625, 666540626, (int) System.currentTimeMillis());
                aph compoundDrawableTintBlendMode = nVar.setCompoundDrawableTintBlendMode();
                ajzVar = new ajz(compoundDrawableTintBlendMode, (akb) ajy.setY(new Object[]{compoundDrawableTintBlendMode, "0307AF69989546103D79329FCC3D74880F33BBE803CB"}, -899146721, 899146722, (int) System.currentTimeMillis()), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, 162865573, -162865565, System.identityHashCode(compoundDrawableTintBlendMode)), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, -1899125725, 1899125734, System.identityHashCode(compoundDrawableTintBlendMode)), bArr);
                int i21 = f52969f;
                int i22 = (i21 ^ 123) + ((i21 & 123) << 1);
                f52968e = i22 % 128;
                if (i22 % 2 != 0) {
                    int i23 = 16 / 0;
                }
            }
            return ajzVar;
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final aph setDividerPadding() {
            return (aph) a(new Object[]{this}, 801375291, -801375291, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final ajz setX() {
            return (ajz) a(new Object[]{this}, -767190155, 767190156, System.identityHashCode(this));
        }
    }

    public static class o extends ajx {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f52970e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f52971f = 1;

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * (-978)) + (i10 * 980);
            int i14 = ~i11;
            int i15 = ~i12;
            if ((((~(i10 | i15)) | (~(i14 | i12))) * 979) + ((i10 | i12) * (-979)) + ((~(i14 | i15)) * 979) + i13 != 1) {
                aph aphVar = (aph) ajy.setY(new Object[]{new aph.setX(new BigInteger("115792089210356248762697446949407573530086143415290314195533631308867097853951"), ajy.a("ffffffff00000001000000000000000000000000fffffffffffffffffffffffc"), ajy.a("5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b"), (BigInteger) ajy.setY(new Object[]{"ffffffff00000000ffffffffffffffffbce6faada7179e84f3b9cac2fc632551"}, -1328672270, 1328672277, (int) System.currentTimeMillis()), BigInteger.valueOf(1L), true)}, 1943199239, -1943199234, (int) System.currentTimeMillis());
                int i16 = f52971f;
                int i17 = (i16 & 73) + (i16 | 73);
                f52970e = i17 % 128;
                int i18 = i17 % 2;
                return aphVar;
            }
            o oVar = (o) objArr[0];
            byte[] bArr = (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"c49d360886e704936a6678e1139d26b7819f7e90"}, -666540625, 666540626, (int) System.currentTimeMillis());
            aph compoundDrawableTintBlendMode = oVar.setCompoundDrawableTintBlendMode();
            ajz ajzVar = new ajz(compoundDrawableTintBlendMode, (akb) ajy.setY(new Object[]{compoundDrawableTintBlendMode, "036b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296"}, -899146721, 899146722, (int) System.currentTimeMillis()), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, 162865573, -162865565, System.identityHashCode(compoundDrawableTintBlendMode)), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, -1899125725, 1899125734, System.identityHashCode(compoundDrawableTintBlendMode)), bArr);
            int i19 = f52970e;
            int i20 = ((i19 ^ 21) | (i19 & 21)) << 1;
            int i21 = -(((~i19) & 21) | (i19 & (-22)));
            int i22 = (i20 & i21) + (i21 | i20);
            f52971f = i22 % 128;
            if (i22 % 2 != 0) {
                return ajzVar;
            }
            throw null;
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final aph setDividerPadding() {
            return (aph) a(new Object[]{this}, 1663117601, -1663117601, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final ajz setX() {
            return (ajz) a(new Object[]{this}, -800710080, 800710081, System.identityHashCode(this));
        }
    }

    public static class p extends ajx {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f52972e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f52973f = 1;

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            Object ajzVar;
            int i13 = ~i11;
            int i14 = ((~((~i12) | i13 | i10)) * 130) + (i11 * 131) + (i10 * (-129));
            int i15 = i13 | i10;
            if ((((~((~i10) | i11)) | (~(i15 | i12))) * 130) + ((~i15) * (-260)) + i14 != 1) {
                aph compoundDrawableTintBlendMode = ((p) objArr[0]).setCompoundDrawableTintBlendMode();
                ajzVar = new ajz(compoundDrawableTintBlendMode, (akb) ajy.setY(new Object[]{compoundDrawableTintBlendMode, "023809B2B7CC1B28CC5A87926AAD83FD28789E81E2C9E3BF10"}, -899146721, 899146722, (int) System.currentTimeMillis()), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, 162865573, -162865565, System.identityHashCode(compoundDrawableTintBlendMode)), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, -1899125725, 1899125734, System.identityHashCode(compoundDrawableTintBlendMode)), null);
                int i16 = f52973f;
                int i17 = ((i16 | 109) << 1) - (i16 ^ 109);
                f52972e = i17 % 128;
                if (i17 % 2 != 0) {
                    int i18 = 37 / 0;
                }
            } else {
                ajzVar = (aph) ajy.setY(new Object[]{new aph.setCompoundDrawableTintBlendMode(Opcodes.ATHROW, 9, ajy.a("401028774D7777C7B7666D1366EA432071274F89FF01E718"), ajy.a("0620048D28BCBD03B6249C99182B7C8CD19700C362C46A01"), (BigInteger) ajy.setY(new Object[]{"20000000000000000000000050508CB89F652824E06B8173"}, -1328672270, 1328672277, (int) System.currentTimeMillis()), BigInteger.valueOf(4L))}, 1943199239, -1943199234, (int) System.currentTimeMillis());
                int i19 = f52972e;
                int i20 = (((i19 | 40) << 1) - (i19 ^ 40)) - 1;
                f52973f = i20 % 128;
                if (i20 % 2 == 0) {
                    int i21 = 56 / 0;
                }
            }
            return ajzVar;
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final aph setDividerPadding() {
            return (aph) a(new Object[]{this}, -1036396091, 1036396092, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final ajz setX() {
            return (ajz) a(new Object[]{this}, 1026326047, -1026326047, System.identityHashCode(this));
        }
    }

    public static class q extends ajx {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f52974e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f52975f = 1;

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i11;
            int i14 = ~i12;
            int i15 = ~(i13 | i14);
            int i16 = ~i10;
            int i17 = ((i15 | (~(i16 | i12))) * (-370)) + (i11 * 371) + (i10 * 371);
            int i18 = (~(i12 | i13)) | (~(i16 | i14));
            int i19 = ~(i10 | i11);
            if ((i19 * 370) + ((i18 | i19) * (-370)) + i17 != 1) {
                aph compoundDrawableTintBlendMode = ((q) objArr[0]).setCompoundDrawableTintBlendMode();
                ajz ajzVar = new ajz(compoundDrawableTintBlendMode, (akb) ajy.setY(new Object[]{compoundDrawableTintBlendMode, "0202F9F87B7C574D0BDECF8A22E6524775F98CDEBDCB"}, -899146721, 899146722, (int) System.currentTimeMillis()), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, 162865573, -162865565, System.identityHashCode(compoundDrawableTintBlendMode)), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, -1899125725, 1899125734, System.identityHashCode(compoundDrawableTintBlendMode)), null);
                int i20 = f52974e + 51;
                f52975f = i20 % 128;
                int i21 = i20 % 2;
                return ajzVar;
            }
            aph aphVar = (aph) ajy.setY(new Object[]{new aph.setCompoundDrawableTintBlendMode(163, 1, 2, 8, ajy.a("07A526C63D3E25A256A007699F5447E32AE456B50E"), ajy.a("03F7061798EB99E238FD6F1BF95B48FEEB4854252B"), (BigInteger) ajy.setY(new Object[]{"03FFFFFFFFFFFFFFFFFFFE1AEE140F110AFF961309"}, -1328672270, 1328672277, (int) System.currentTimeMillis()), BigInteger.valueOf(2L))}, 1943199239, -1943199234, (int) System.currentTimeMillis());
            int i22 = f52975f;
            int i23 = ((i22 | 59) << 1) - (i22 ^ 59);
            f52974e = i23 % 128;
            if (i23 % 2 == 0) {
                return aphVar;
            }
            int i24 = 3 / 0;
            return aphVar;
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final aph setDividerPadding() {
            return (aph) a(new Object[]{this}, 923079534, -923079533, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final ajz setX() {
            return (ajz) a(new Object[]{this}, -169910255, 169910255, System.identityHashCode(this));
        }
    }

    public static class r extends ajx {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f52976e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f52977f = 1;

        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            Object ajzVar;
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = i13 | i14;
            int i16 = ~i12;
            if ((((~(i10 | i14 | i16)) | (~(i13 | i12))) * 765) + (((~i15) | (~(i13 | i16))) * 1530) + (((~(i11 | i13 | i12)) | (~(i15 | i16)) | (~(i14 | i10 | i12))) * 765) + (i11 * (-764)) + (i10 * (-1529)) != 1) {
                ajzVar = (aph) ajy.setY(new Object[]{new aph.setCompoundDrawableTintBlendMode(176, 1, 2, 43, ajy.a("E4E6DB2995065C407D9D39B8D0967B96704BA8E9C90B"), ajy.a("5DDA470ABE6414DE8EC133AE28E9BBD7FCEC0AE0FFF2"), (BigInteger) ajy.setY(new Object[]{"010092537397ECA4F6145799D62B0A19CE06FE26AD"}, -1328672270, 1328672277, (int) System.currentTimeMillis()), BigInteger.valueOf(65390L))}, 1943199239, -1943199234, (int) System.currentTimeMillis());
                int i17 = f52977f;
                int i18 = (((i17 & (-44)) | ((~i17) & 43)) - (~(-(-((i17 & 43) << 1))))) - 1;
                f52976e = i18 % 128;
                if (i18 % 2 != 0) {
                    throw null;
                }
            } else {
                aph compoundDrawableTintBlendMode = ((r) objArr[0]).setCompoundDrawableTintBlendMode();
                ajzVar = new ajz(compoundDrawableTintBlendMode, (akb) ajy.setY(new Object[]{compoundDrawableTintBlendMode, "038D16C2866798B600F9F08BB4A8E860F3298CE04A5798"}, -899146721, 899146722, (int) System.currentTimeMillis()), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, 162865573, -162865565, System.identityHashCode(compoundDrawableTintBlendMode)), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, -1899125725, 1899125734, System.identityHashCode(compoundDrawableTintBlendMode)), null);
                int i19 = f52976e;
                int i20 = ((i19 & (-110)) | ((~i19) & 109)) + ((i19 & 109) << 1);
                f52977f = i20 % 128;
                if (i20 % 2 == 0) {
                    throw null;
                }
            }
            return ajzVar;
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final aph setDividerPadding() {
            return (aph) a(new Object[]{this}, 1387854196, -1387854196, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final ajz setX() {
            return (ajz) a(new Object[]{this}, -2038406371, 2038406372, System.identityHashCode(this));
        }
    }

    public static class s extends ajx {
        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~((~i10) | (~i11));
            int i14 = ~i12;
            int i15 = ((i13 | (~(i14 | i10 | i11))) * (-828)) + (i11 * 829) + (i10 * 829);
            int i16 = i10 | i11;
            if (((~i16) * 828) + ((i16 | i14) * (-828)) + i15 != 1) {
                return (aph) ajy.setY(new Object[]{new aph.setCompoundDrawableTintBlendMode(Opcodes.ATHROW, 9, ajy.a("2866537B676752636A68F56554E12640276B649EF7526267"), ajy.a("2E45EF571F00786F67B0081B9495A3D95462F5DE0AA185EC"), (BigInteger) ajy.setY(new Object[]{"40000000000000000000000004A20E90C39067C893BBB9A5"}, -1328672270, 1328672277, (int) System.currentTimeMillis()), BigInteger.valueOf(2L))}, 1943199239, -1943199234, (int) System.currentTimeMillis());
            }
            s sVar = (s) objArr[0];
            byte[] bArr = (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"4E13CA542744D696E67687561517552F279A8C84"}, -666540625, 666540626, (int) System.currentTimeMillis());
            aph compoundDrawableTintBlendMode = sVar.setCompoundDrawableTintBlendMode();
            return new ajz(compoundDrawableTintBlendMode, (akb) ajy.setY(new Object[]{compoundDrawableTintBlendMode, "0236B3DAF8A23206F9C4F299D7B21A9C369137F2C84AE1AA0D"}, -899146721, 899146722, (int) System.currentTimeMillis()), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, 162865573, -162865565, System.identityHashCode(compoundDrawableTintBlendMode)), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, -1899125725, 1899125734, System.identityHashCode(compoundDrawableTintBlendMode)), bArr);
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final aph setDividerPadding() {
            return (aph) a(new Object[]{this}, 6088092, -6088092, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final ajz setX() {
            return (ajz) a(new Object[]{this}, -1401395788, 1401395789, System.identityHashCode(this));
        }
    }

    public static class t extends ajx {
        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * 965) + ((i10 * (-963)) - 964);
            int i14 = ~i10;
            int i15 = ~i11;
            if ((((~(i10 | i15)) | (~((~i12) | i15))) * (-964)) + ((i14 | (~(i15 | i12))) * (-964)) + i13 != 1) {
                aph compoundDrawableTintBlendMode = ((t) objArr[0]).setCompoundDrawableTintBlendMode();
                return new ajz(compoundDrawableTintBlendMode, (akb) ajy.setY(new Object[]{compoundDrawableTintBlendMode, "0370F6E9D04D289C4E89913CE3530BFDE903977D42B146D539BF1BDE4E9C92"}, -899146721, 899146722, (int) System.currentTimeMillis()), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, 162865573, -162865565, System.identityHashCode(compoundDrawableTintBlendMode)), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, -1899125725, 1899125734, System.identityHashCode(compoundDrawableTintBlendMode)), null);
            }
            return (aph) ajy.setY(new Object[]{new aph.setCompoundDrawableTintBlendMode(239, 36, ajy.a("01238774666A67766D6676F778E676B66999176666E687666D8766C66A9F"), ajy.a("6A941977BA9F6A435199ACFC51067ED587F519C5ECB541B8E44111DE1D40"), (BigInteger) ajy.setY(new Object[]{"0CCCCCCCCCCCCCCCCCCCCCCCCCCCCCAC4912D2D9DF903EF9888B8A0E4CFF"}, -1328672270, 1328672277, (int) System.currentTimeMillis()), BigInteger.valueOf(10L))}, 1943199239, -1943199234, (int) System.currentTimeMillis());
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final aph setDividerPadding() {
            return (aph) a(new Object[]{this}, -2335419, 2335420, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final ajz setX() {
            return (ajz) a(new Object[]{this}, -795832861, 795832861, System.identityHashCode(this));
        }
    }

    public static class u extends ajx {
        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i11;
            int i14 = ~i10;
            int i15 = ~i12;
            if (((~(i10 | i11)) * 933) + (((~(i15 | i13)) | (~(i13 | i10))) * 933) + (((~(i14 | i15)) | i13) * (-933)) + (i11 * (-932)) + (i10 * 934) != 1) {
                aph compoundDrawableTintBlendMode = ((u) objArr[0]).setCompoundDrawableTintBlendMode();
                return new ajz(compoundDrawableTintBlendMode, (akb) ajy.setY(new Object[]{compoundDrawableTintBlendMode, "0228F9D04E900069C8DC47A08534FE76D2B900B7D7EF31F5709F200C4CA205"}, -899146721, 899146722, (int) System.currentTimeMillis()), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, 162865573, -162865565, System.identityHashCode(compoundDrawableTintBlendMode)), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, -1899125725, 1899125734, System.identityHashCode(compoundDrawableTintBlendMode)), null);
            }
            return (aph) ajy.setY(new Object[]{new aph.setCompoundDrawableTintBlendMode(239, 36, ajy.a("4230017757A767FAE42398569B746325D45313AF0766266479B75654E65F"), ajy.a("5037EA654196CFF0CD82B2C14A2FCF2E3FF8775285B545722F03EACDB74B"), (BigInteger) ajy.setY(new Object[]{"1555555555555555555555555555553C6F2885259C31E3FCDF154624522D"}, -1328672270, 1328672277, (int) System.currentTimeMillis()), BigInteger.valueOf(6L))}, 1943199239, -1943199234, (int) System.currentTimeMillis());
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final aph setDividerPadding() {
            return (aph) a(new Object[]{this}, 1722450749, -1722450748, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final ajz setX() {
            return (ajz) a(new Object[]{this}, -1123525098, 1123525098, System.identityHashCode(this));
        }
    }

    public static class v extends ajx {
        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = (((~(i13 | i14)) | (~(i13 | i12))) * ReturnCode.ERR_CONN_IO) + (i11 * (-751)) + (i10 * (-751));
            int i16 = i11 | i13;
            if ((((~(i10 | i14)) | (~i16)) * 752) + ((~(i12 | i16)) * (-1504)) + i15 != 1) {
                return (aph) ajy.setY(new Object[]{new aph.setCompoundDrawableTintBlendMode(239, 36, ajy.a("32010857077C5431123A46B808906756F543423E8D27877578125778AC76"), ajy.a("790408F2EEDAF392B012EDEFB3392F30F4327C0CA3F31FC383C422AA8C16"), (BigInteger) ajy.setY(new Object[]{"2000000000000000000000000000000F4D42FFE1492A4993F1CAD666E447"}, -1328672270, 1328672277, (int) System.currentTimeMillis()), BigInteger.valueOf(4L))}, 1943199239, -1943199234, (int) System.currentTimeMillis());
            }
            aph compoundDrawableTintBlendMode = ((v) objArr[0]).setCompoundDrawableTintBlendMode();
            return new ajz(compoundDrawableTintBlendMode, (akb) ajy.setY(new Object[]{compoundDrawableTintBlendMode, "0257927098FA932E7C0A96D3FD5B706EF7E5F5C156E16B7E7C86038552E91D"}, -899146721, 899146722, (int) System.currentTimeMillis()), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, 162865573, -162865565, System.identityHashCode(compoundDrawableTintBlendMode)), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, -1899125725, 1899125734, System.identityHashCode(compoundDrawableTintBlendMode)), null);
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final aph setDividerPadding() {
            return (aph) a(new Object[]{this}, -1175948193, 1175948193, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final ajz setX() {
            return (ajz) a(new Object[]{this}, -2139555161, 2139555162, System.identityHashCode(this));
        }
    }

    public static class w extends ajx {
        public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * (-929)) + (i10 * (-464));
            int i14 = ~i10;
            int i15 = i11 | i12;
            if (((i14 | i15) * 465) + ((i11 | (~(i12 | i14))) * 930) + (((~i15) | i14) * (-465)) + i13 != 1) {
                aph compoundDrawableTintBlendMode = ((w) objArr[0]).setCompoundDrawableTintBlendMode();
                return new ajz(compoundDrawableTintBlendMode, (akb) ajy.setY(new Object[]{compoundDrawableTintBlendMode, "0289FDFBE4ABE193DF9559ECF07AC0CE78554E2784EB8C1ED1A57A"}, -899146721, 899146722, (int) System.currentTimeMillis()), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, 162865573, -162865565, System.identityHashCode(compoundDrawableTintBlendMode)), (BigInteger) aph.setX(new Object[]{compoundDrawableTintBlendMode}, -1899125725, 1899125734, System.identityHashCode(compoundDrawableTintBlendMode)), null);
            }
            return (aph) ajy.setY(new Object[]{new aph.setCompoundDrawableTintBlendMode(ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY, 1, 2, 83, BigInteger.valueOf(0L), ajy.a("C8619ED45A62E6212E1160349E2BFA844439FAFC2A3FD1638F9E"), (BigInteger) ajy.setY(new Object[]{"0101BAF95C9723C57B6C21DA2EFF2D5ED588BDD5717E212F9D"}, -1328672270, 1328672277, (int) System.currentTimeMillis()), BigInteger.valueOf(65096L))}, 1943199239, -1943199234, (int) System.currentTimeMillis());
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final aph setDividerPadding() {
            return (aph) a(new Object[]{this}, 35683069, -35683068, System.identityHashCode(this));
        }

        @Override // com.mypinpad.tsdk.isolation.ajx
        public final ajz setX() {
            return (ajz) a(new Object[]{this}, -1694656272, 1694656272, System.identityHashCode(this));
        }
    }

    static {
        k kVar = new k();
        e eVar = new e();
        j jVar = new j();
        h hVar = new h();
        g gVar = new g();
        i iVar = new i();
        o oVar = new o();
        n nVar = new n();
        m mVar = new m();
        q qVar = new q();
        r rVar = new r();
        s sVar = new s();
        p pVar = new p();
        a aVar = new a();
        w wVar = new w();
        v vVar = new v();
        u uVar = new u();
        t tVar = new t();
        d dVar = new d();
        b bVar = new b();
        f fVar = new f();
        c cVar = new c();
        l lVar = new l();
        f52949a = new Hashtable();
        f52950b = new Hashtable();
        f52951c = new Hashtable();
        setY(new Object[]{"prime192v1", akf.setCursorVisible, kVar}, 927200125, -927200125, (int) System.currentTimeMillis());
        setY(new Object[]{"prime192v2", akf.setViewTranslationCallback, eVar}, 927200125, -927200125, (int) System.currentTimeMillis());
        setY(new Object[]{"prime192v3", akf.setCacheColorHint, jVar}, 927200125, -927200125, (int) System.currentTimeMillis());
        setY(new Object[]{"prime239v1", akf.setSmoothScrollbarEnabled, hVar}, 927200125, -927200125, (int) System.currentTimeMillis());
        setY(new Object[]{"prime239v2", akf.setEllipsize, gVar}, 927200125, -927200125, (int) System.currentTimeMillis());
        setY(new Object[]{"prime239v3", akf.setScroller, iVar}, 927200125, -927200125, (int) System.currentTimeMillis());
        setY(new Object[]{"prime256v1", akf.setAdapter, oVar}, 927200125, -927200125, (int) System.currentTimeMillis());
        setY(new Object[]{"c2pnb163v1", akf.UiMessageCallbackKtWhenMappings, nVar}, 927200125, -927200125, (int) System.currentTimeMillis());
        setY(new Object[]{"c2pnb163v2", akf.setTextAlignment, mVar}, 927200125, -927200125, (int) System.currentTimeMillis());
        setY(new Object[]{"c2pnb163v3", akf.setZ, qVar}, 927200125, -927200125, (int) System.currentTimeMillis());
        setY(new Object[]{"c2pnb176w1", akf.setAlwaysDrawnWithCacheEnabled, rVar}, 927200125, -927200125, (int) System.currentTimeMillis());
        setY(new Object[]{"c2tnb191v1", akf.getAmountFieldTextColor, sVar}, 927200125, -927200125, (int) System.currentTimeMillis());
        setY(new Object[]{"c2tnb191v2", akf.setOnEditorActionListener, pVar}, 927200125, -927200125, (int) System.currentTimeMillis());
        setY(new Object[]{"c2tnb191v3", akf.setTextScaleX, aVar}, 927200125, -927200125, (int) System.currentTimeMillis());
        setY(new Object[]{"c2pnb208w1", akf.setCompoundDrawablePadding, wVar}, 927200125, -927200125, (int) System.currentTimeMillis());
        setY(new Object[]{"c2tnb239v1", akf.setChildDivider, vVar}, 927200125, -927200125, (int) System.currentTimeMillis());
        setY(new Object[]{"c2tnb239v2", akf.setLayoutDirection, uVar}, 927200125, -927200125, (int) System.currentTimeMillis());
        setY(new Object[]{"c2tnb239v3", akf.setImageResource, tVar}, 927200125, -927200125, (int) System.currentTimeMillis());
        setY(new Object[]{"c2pnb272w1", akf.setMinHeight, dVar}, 927200125, -927200125, (int) System.currentTimeMillis());
        setY(new Object[]{"c2pnb304w1", akf.setMaxEms, bVar}, 927200125, -927200125, (int) System.currentTimeMillis());
        setY(new Object[]{"c2tnb359v1", akf.getSuppressed, fVar}, 927200125, -927200125, (int) System.currentTimeMillis());
        setY(new Object[]{"c2pnb368w1", akf.TransactionResult, cVar}, 927200125, -927200125, (int) System.currentTimeMillis());
        setY(new Object[]{"c2tnb431r1", akf.setTextSelectHandleRight, lVar}, 927200125, -927200125, (int) System.currentTimeMillis());
        int i10 = f52952d;
        int i11 = (i10 ^ 3) + ((i10 & 3) << 1);
        f52953e = i11 % 128;
        int i12 = i11 % 2;
    }

    public static /* synthetic */ BigInteger a(String str) {
        return (BigInteger) setY(new Object[]{str}, -1328672270, 1328672277, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13 = (i11 * 965) + ((i10 * (-963)) - 964);
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = (((~(i10 | i15)) | (~((~i12) | i15))) * (-964)) + ((i14 | (~(i15 | i12))) * (-964)) + i13;
        Hashtable hashtable = f52950b;
        switch (i16) {
            case 1:
                aph aphVar = (aph) objArr[0];
                String str = (String) objArr[1];
                int i17 = f52953e + 21;
                f52952d = i17 % 128;
                if (i17 % 2 != 0) {
                    throw null;
                }
                obj = (akb) setY(new Object[]{aphVar, str}, -1056206985, 1056206989, (int) System.currentTimeMillis());
                int i18 = f52952d;
                int i19 = (i18 & (-60)) | ((~i18) & 59);
                int i20 = (i18 & 59) << 1;
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                f52953e = i21 % 128;
                if (i21 % 2 == 0) {
                    throw null;
                }
                break;
            case 2:
                adu aduVar = (adu) objArr[0];
                int i22 = f52953e;
                int i23 = i22 & 55;
                int i24 = (i22 ^ 55) | i23;
                int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
                f52952d = i25 % 128;
                int i26 = i25 % 2;
                Object obj2 = hashtable.get(aduVar);
                if (i26 != 0) {
                    throw null;
                }
                ajx ajxVar = (ajx) obj2;
                int i27 = f52953e;
                int i28 = i27 & 121;
                int i29 = ((i27 | 121) & (~i28)) + (i28 << 1);
                f52952d = i29 % 128;
                int i30 = i29 % 2;
                return ajxVar;
            case 3:
                obj = (aph) objArr[0];
                int i31 = f52952d + 102;
                int i32 = (i31 ^ (-1)) + (i31 << 1);
                int i33 = i32 % 128;
                f52953e = i33;
                int i34 = i32 % 2;
                int i35 = (i33 ^ 121) + ((i33 & 121) << 1);
                f52952d = i35 % 128;
                if (i35 % 2 != 0) {
                    throw null;
                }
                break;
            case 4:
                akb akbVar = new akb((aph) objArr[0], (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{(String) objArr[1]}, -666540625, 666540626, (int) System.currentTimeMillis()));
                aps.setDividerPadding(new Object[]{akbVar.setX()}, 1812545968, -1812545968, (int) System.currentTimeMillis());
                int i36 = f52952d + 13;
                f52953e = i36 % 128;
                if (i36 % 2 != 0) {
                    return akbVar;
                }
                int i37 = 33 / 0;
                return akbVar;
            case 5:
                aph aphVar2 = (aph) objArr[0];
                int i38 = f52952d;
                int i39 = (i38 ^ 76) + ((i38 & 76) << 1);
                int i40 = (i39 ^ (-1)) + (i39 << 1);
                f52953e = i40 % 128;
                int i41 = i40 % 2;
                aph aphVar3 = (aph) setY(new Object[]{aphVar2}, -1141645534, 1141645537, (int) System.currentTimeMillis());
                int i42 = f52953e;
                int i43 = i42 ^ 45;
                int i44 = ((i42 & 45) | i43) << 1;
                int i45 = -i43;
                int i46 = (i44 ^ i45) + ((i44 & i45) << 1);
                f52952d = i46 % 128;
                int i47 = i46 % 2;
                return aphVar3;
            case 6:
                adu aduVar2 = (adu) objArr[0];
                int i48 = f52952d + 53;
                f52953e = i48 % 128;
                int i49 = i48 % 2;
                ajx ajxVar2 = (ajx) setY(new Object[]{aduVar2}, 457327326, -457327324, (int) System.currentTimeMillis());
                if (ajxVar2 == null) {
                    int i50 = f52953e;
                    int i51 = i50 & 69;
                    int i52 = (i50 | 69) & (~i51);
                    int i53 = -(-(i51 << 1));
                    int i54 = (i52 ^ i53) + ((i52 & i53) << 1);
                    f52952d = i54 % 128;
                    if (i54 % 2 == 0) {
                        return null;
                    }
                    throw null;
                }
                ajz y7 = ajxVar2.setY();
                int i55 = f52953e;
                int i56 = i55 & 93;
                int i57 = ((((i55 ^ 93) | i56) << 1) - (~(-((i55 | 93) & (~i56))))) - 1;
                f52952d = i57 % 128;
                if (i57 % 2 == 0) {
                    return y7;
                }
                int i58 = 4 / 0;
                return y7;
            case 7:
                String str2 = (String) objArr[0];
                int i59 = f52952d;
                int i60 = (i59 ^ 111) + ((i59 & 111) << 1);
                f52953e = i60 % 128;
                if (i60 % 2 == 0) {
                    throw null;
                }
                BigInteger bigInteger = (BigInteger) setY(new Object[]{str2}, -1200124774, 1200124782, (int) System.currentTimeMillis());
                int i61 = f52953e + 15;
                f52952d = i61 % 128;
                int i62 = i61 % 2;
                return bigInteger;
            case 8:
                BigInteger bigInteger2 = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{(String) objArr[0]}, -666540625, 666540626, (int) System.currentTimeMillis()));
                int i63 = f52952d;
                int i64 = (((i63 | 12) << 1) - (i63 ^ 12)) - 1;
                f52953e = i64 % 128;
                int i65 = i64 % 2;
                return bigInteger2;
            default:
                String str3 = (String) objArr[0];
                adu aduVar3 = (adu) objArr[1];
                ajx ajxVar3 = (ajx) objArr[2];
                int i66 = f52952d;
                int i67 = i66 & 59;
                int i68 = (59 ^ i66) | i67;
                int i69 = ((i67 | i68) << 1) - (i68 ^ i67);
                f52953e = i69 % 128;
                int i70 = i69 % 2;
                f52949a.put(str3, aduVar3);
                f52951c.put(aduVar3, str3);
                hashtable.put(aduVar3, ajxVar3);
                int i71 = f52953e + 37;
                f52952d = i71 % 128;
                int i72 = i71 % 2;
                return null;
        }
        return obj;
    }

    public static ajz setY(adu aduVar) {
        return (ajz) setY(new Object[]{aduVar}, -2013889902, 2013889908, (int) System.currentTimeMillis());
    }
}
