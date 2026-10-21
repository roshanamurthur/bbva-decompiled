package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.model.StorageTokenBuilder;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.apdu.PaywaveHceLogic;

/* JADX INFO: loaded from: classes9.dex */
public interface y5 {
    public static final p A;
    public static final p B;
    public static final p C;
    public static final p D;
    public static final p E;
    public static final p F;
    public static final p G;
    public static final p H;
    public static final p I;
    public static final p J;
    public static final p K;
    public static final p L;
    public static final p M;
    public static final p N;
    public static final p O;
    public static final p P;
    public static final p Q;
    public static final p R;
    public static final p S;
    public static final p T;
    public static final p U;
    public static final p V;
    public static final p W;
    public static final p X;
    public static final p Y;
    public static final p Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f66461a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final p f66462a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f66463b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final p f66464b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f66465c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final p f66466c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f66467d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final p f66468d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p f66469e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final p f66470e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p f66471f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final p f66472f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p f66473g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final p f66474g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p f66475h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final p f66476h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p f66477i;
    public static final p i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p f66478j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final p f66479j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p f66480k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final p f66481k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p f66482l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final p f66483l0;
    public static final p m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final p f66484m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p f66485n;
    public static final p n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p f66486o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final p f66487o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final p f66488p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final p f66489q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final p f66490r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final p f66491s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final p f66492t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final p f66493u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final p f66494v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final p f66495w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final p f66496x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final p f66497y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final p f66498z;

    static {
        p pVar = new p("1.2.840.10045");
        f66461a = pVar;
        p pVarA = pVar.a("1");
        f66463b = pVarA;
        f66465c = pVarA.a("1");
        p pVarA2 = pVarA.a("2");
        f66467d = pVarA2;
        f66469e = pVarA2.a("3.1");
        f66471f = pVarA2.a("3.2");
        f66473g = pVarA2.a("3.3");
        p pVarA3 = pVar.a("4");
        f66475h = pVarA3;
        f66477i = pVarA3.a("1");
        p pVarA4 = pVar.a("2");
        f66478j = pVarA4;
        f66480k = pVarA4.a("1");
        p pVarA5 = pVarA3.a(ExifInterface.GPS_MEASUREMENT_3D);
        f66482l = pVarA5;
        m = pVarA5.a("1");
        f66485n = pVarA5.a("2");
        f66486o = pVarA5.a(ExifInterface.GPS_MEASUREMENT_3D);
        f66488p = pVarA5.a("4");
        p pVarA6 = pVar.a(ExifInterface.GPS_MEASUREMENT_3D);
        f66489q = pVarA6;
        p pVarA7 = pVarA6.a("0");
        f66490r = pVarA7;
        f66491s = pVarA7.a("1");
        f66492t = pVarA7.a("2");
        f66493u = pVarA7.a(ExifInterface.GPS_MEASUREMENT_3D);
        f66494v = pVarA7.a("4");
        f66495w = pVarA7.a("5");
        f66496x = pVarA7.a(StorageTokenBuilder.OTP_LENGTH);
        f66497y = pVarA7.a("7");
        f66498z = pVarA7.a("8");
        A = pVarA7.a("9");
        B = pVarA7.a("10");
        C = pVarA7.a("11");
        D = pVarA7.a("12");
        E = pVarA7.a("13");
        F = pVarA7.a("14");
        G = pVarA7.a("15");
        H = pVarA7.a("16");
        I = pVarA7.a("17");
        J = pVarA7.a("18");
        K = pVarA7.a("19");
        L = pVarA7.a(PaywaveHceLogic.TRANSACTION_TYPE_CODE_REFUND);
        p pVarA8 = pVarA6.a("1");
        M = pVarA8;
        N = pVarA8.a("1");
        O = pVarA8.a("2");
        P = pVarA8.a(ExifInterface.GPS_MEASUREMENT_3D);
        Q = pVarA8.a("4");
        R = pVarA8.a("5");
        S = pVarA8.a(StorageTokenBuilder.OTP_LENGTH);
        T = pVarA8.a("7");
        U = new p("1.2.840.10040.4.1");
        V = new p("1.2.840.10040.4.3");
        p pVar2 = new p("1.3.133.16.840.63.0");
        W = pVar2;
        X = pVar2.a("2");
        Y = pVar2.a(ExifInterface.GPS_MEASUREMENT_3D);
        Z = pVar2.a("16");
        p pVar3 = new p("1.2.840.10046");
        f66462a0 = pVar3;
        f66464b0 = pVar3.a("2.1");
        p pVarA9 = pVar3.a(ExifInterface.GPS_MEASUREMENT_3D);
        f66466c0 = pVarA9;
        f66468d0 = pVarA9.a("1");
        f66470e0 = pVarA9.a("2");
        f66472f0 = pVarA9.a(ExifInterface.GPS_MEASUREMENT_3D);
        f66474g0 = pVarA9.a("4");
        f66476h0 = pVarA9.a("5");
        i0 = pVarA9.a(StorageTokenBuilder.OTP_LENGTH);
        f66479j0 = pVarA9.a("7");
        f66481k0 = pVarA9.a("8");
        p pVar4 = new p("1.3.133.16.840.9.44");
        f66483l0 = pVar4;
        p pVarA10 = pVar4.a("1");
        f66484m0 = pVarA10;
        n0 = pVarA10.a("1");
        f66487o0 = pVarA10.a("2");
    }
}
