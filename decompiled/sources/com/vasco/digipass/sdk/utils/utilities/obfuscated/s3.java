package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import androidx.exifinterface.media.ExifInterface;
import androidx.room.RoomMasterTable;
import com.bbva.ethermobilesdk.tokencompat.model.StorageTokenBuilder;
import mx.openpay.library.data.util.EglobalUtils;

/* JADX INFO: loaded from: classes9.dex */
public interface s3 {
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
    public static final p f66334a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final p f66335a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f66336b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final p f66337b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f66338c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final p f66339c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f66340d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final p f66341d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p f66342e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final p f66343e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p f66344f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final p f66345f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p f66346g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final p f66347g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p f66348h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final p f66349h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p f66350i;
    public static final p i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p f66351j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p f66352k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p f66353l;
    public static final p m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p f66354n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p f66355o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final p f66356p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final p f66357q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final p f66358r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final p f66359s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final p f66360t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final p f66361u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final p f66362v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final p f66363w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final p f66364x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final p f66365y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final p f66366z;

    static {
        p pVar = new p("2.16.840.1.101.3.4");
        f66334a = pVar;
        p pVarA = pVar.a("2");
        f66336b = pVarA;
        f66338c = pVarA.a("1");
        f66340d = pVarA.a("2");
        f66342e = pVarA.a(ExifInterface.GPS_MEASUREMENT_3D);
        f66344f = pVarA.a("4");
        f66346g = pVarA.a("5");
        f66348h = pVarA.a(StorageTokenBuilder.OTP_LENGTH);
        f66350i = pVarA.a("7");
        f66351j = pVarA.a("8");
        f66352k = pVarA.a("9");
        f66353l = pVarA.a("10");
        m = pVarA.a("11");
        f66354n = pVarA.a("12");
        f66355o = pVarA.a("13");
        f66356p = pVarA.a("14");
        f66357q = pVarA.a("15");
        f66358r = pVarA.a("16");
        p pVarA2 = pVar.a("1");
        f66359s = pVarA2;
        f66360t = pVarA2.a("1");
        f66361u = pVarA2.a("2");
        f66362v = pVarA2.a(ExifInterface.GPS_MEASUREMENT_3D);
        f66363w = pVarA2.a("4");
        f66364x = pVarA2.a("5");
        f66365y = pVarA2.a(StorageTokenBuilder.OTP_LENGTH);
        f66366z = pVarA2.a("7");
        A = pVarA2.a("8");
        B = pVarA2.a("21");
        C = pVarA2.a("22");
        D = pVarA2.a(EglobalUtils.CARD_REMOVED);
        E = pVarA2.a("24");
        F = pVarA2.a("25");
        G = pVarA2.a("26");
        H = pVarA2.a("27");
        I = pVarA2.a("28");
        J = pVarA2.a("41");
        K = pVarA2.a(RoomMasterTable.DEFAULT_ID);
        L = pVarA2.a("43");
        M = pVarA2.a("44");
        N = pVarA2.a("45");
        O = pVarA2.a("46");
        P = pVarA2.a("47");
        Q = pVarA2.a("48");
        p pVarA3 = pVar.a(ExifInterface.GPS_MEASUREMENT_3D);
        R = pVarA3;
        S = pVarA3;
        T = pVarA3.a("1");
        U = pVarA3.a("2");
        V = pVarA3.a(ExifInterface.GPS_MEASUREMENT_3D);
        W = pVarA3.a("4");
        X = pVarA3.a("5");
        Y = pVarA3.a(StorageTokenBuilder.OTP_LENGTH);
        Z = pVarA3.a("7");
        f66335a0 = pVarA3.a("8");
        f66337b0 = pVarA3.a("9");
        f66339c0 = pVarA3.a("10");
        f66341d0 = pVarA3.a("11");
        f66343e0 = pVarA3.a("12");
        f66345f0 = pVarA3.a("13");
        f66347g0 = pVarA3.a("14");
        f66349h0 = pVarA3.a("15");
        i0 = pVarA3.a("16");
    }
}
