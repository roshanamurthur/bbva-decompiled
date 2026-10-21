package com.mypinpad.tsdk.isolation;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB'\u0012\u0006\u0010\u0003\u001a\u00020\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0015\u0012\u0006\u0010\b\u001a\u00020\u0012\u0012\u0006\u0010\n\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u000b\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0012¢\u0006\u0004\b\u000b\u0010\u0013"}, d2 = {"Lcom/mypinpad/tsdk/i/zl;", "", "Lcom/mypinpad/tsdk/i/xh;", "p0", "Lcom/mypinpad/tsdk/i/zj;", "p1", "", "Lcom/mypinpad/tsdk/i/yp;", "p2", "", "p3", "setX", "(Lcom/mypinpad/tsdk/i/xh;Lcom/mypinpad/tsdk/i/zj;Ljava/util/List;Z)Z", "Lcom/mypinpad/tsdk/i/zi;", "", "(Lcom/mypinpad/tsdk/i/zi;)V", "setY", "(Lcom/mypinpad/tsdk/i/zi;)Z", "", "(J)J", "Lcom/mypinpad/tsdk/i/zd;", "", "Ljava/util/concurrent/TimeUnit;", "<init>", "(Lcom/mypinpad/tsdk/i/zd;IJLjava/util/concurrent/TimeUnit;)V"}, k = 1, mv = {1, 6, 0})
public final class zl {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f62401f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f62402g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f62403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f62404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ze f62405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final setOnFocusChangeListener f62406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ConcurrentLinkedQueue<zi> f62407e;

    public static final class setOnFocusChangeListener extends zb {
        public setOnFocusChangeListener(String str) {
            super(str, false, 2, null);
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
            zl zlVar = zl.this;
            return Long.valueOf(((Long) zl.setOnFocusChangeListener(new Object[]{zlVar, Long.valueOf(System.nanoTime())}, 1906262391, -1906262388, System.identityHashCode(zlVar))).longValue());
        }

        @Override // com.mypinpad.tsdk.isolation.zb
        public final long setY() {
            return ((Long) setDividerPadding(new Object[]{this}, -1132550380, 1132550380, System.identityHashCode(this))).longValue();
        }
    }

    static {
        int i10 = f62402g;
        int i11 = (i10 ^ 61) + ((i10 & 61) << 1);
        f62401f = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public zl(@NotNull zd zdVar, int i10, long j10, @NotNull TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(zdVar, "");
        Intrinsics.checkNotNullParameter(timeUnit, "");
        this.f62403a = 5;
        this.f62404b = timeUnit.toNanos(5L);
        this.f62405c = (ze) zd.setOnFocusChangeListener(new Object[]{zdVar}, -1673899270, 1673899275, System.identityHashCode(zdVar));
        this.f62406d = new setOnFocusChangeListener(Intrinsics.stringPlus(yt.setOnDragListener, " ConnectionPool"));
        this.f62407e = new ConcurrentLinkedQueue<>();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007c A[SYNTHETIC] */
    public static /* synthetic */ Boolean a(Object[] objArr) {
        zl zlVar = (zl) objArr[0];
        xh xhVar = (xh) objArr[1];
        zj zjVar = (zj) objArr[2];
        List list = (List) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        Intrinsics.checkNotNullParameter(xhVar, "");
        Intrinsics.checkNotNullParameter(zjVar, "");
        for (zi ziVar : zlVar.f62407e) {
            Intrinsics.checkNotNullExpressionValue(ziVar, "");
            synchronized (ziVar) {
                if (zBooleanValue) {
                    try {
                        if (((Boolean) zi.setY(new Object[]{ziVar}, 431803447, -431803443, System.identityHashCode(ziVar))).booleanValue()) {
                            if (((Boolean) zi.setY(new Object[]{ziVar, xhVar, list}, 1488781649, -1488781639, System.identityHashCode(ziVar))).booleanValue()) {
                                zj.setDividerPadding(new Object[]{zjVar, ziVar}, 529348108, -529348085, System.identityHashCode(zjVar));
                                return Boolean.TRUE;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else if (((Boolean) zi.setY(new Object[]{ziVar, xhVar, list}, 1488781649, -1488781639, System.identityHashCode(ziVar))).booleanValue()) {
                    zj.setDividerPadding(new Object[]{zjVar, ziVar}, 529348108, -529348085, System.identityHashCode(zjVar));
                    return Boolean.TRUE;
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:25:0x010d  */
    /* JADX WARN: Code duplicated, block: B:27:0x011e  */
    /* JADX WARN: Code duplicated, block: B:28:0x012d  */
    /* JADX WARN: Code duplicated, block: B:32:0x014c  */
    /* JADX WARN: Code duplicated, block: B:33:0x014f  */
    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        Object objValueOf;
        int i13;
        int i14;
        ze zeVar;
        int i15 = ~i12;
        int i16 = ~i11;
        int i17 = (((~(i10 | i11 | i12)) | (~(i15 | i16)) | (~((~i10) | i16))) * 757) + ((~(i16 | i10 | i12)) * 1514) + ((i10 | i15) * (-757)) + (i11 * (-756)) + (i10 * 758);
        zi ziVar = null;
        char c10 = 2;
        if (i17 == 1) {
            zl zlVar = (zl) objArr[0];
            zi ziVar2 = (zi) objArr[1];
            long jLongValue = ((Number) objArr[2]).longValue();
            int i18 = f62402g;
            int i19 = i18 & 105;
            int i20 = (i18 | 105) & (~i19);
            int i21 = -(-(i19 << 1));
            int i22 = (i20 & i21) + (i20 | i21);
            f62401f = i22 % 128;
            if (i22 % 2 != 0) {
                byte[] bArr = yt.setX;
                throw null;
            }
            if (yt.setOnFocusChangeListener) {
                int i23 = f62402g;
                int i24 = (((i23 | 126) << 1) - (i23 ^ 126)) - 1;
                f62401f = i24 % 128;
                if (i24 % 2 != 0) {
                    Thread.holdsLock(ziVar2);
                    throw null;
                }
                if (!Thread.holdsLock(ziVar2)) {
                    StringBuilder sb2 = new StringBuilder("Thread ");
                    sb2.append((Object) Thread.currentThread().getName());
                    sb2.append(" MUST hold lock on ");
                    sb2.append(ziVar2);
                    throw new AssertionError(sb2.toString());
                }
            }
            List list = (List) zi.setY(new Object[]{ziVar2}, 1220489272, -1220489265, System.identityHashCode(ziVar2));
            int i25 = f62401f;
            int i26 = (i25 & 70) + (i25 | 70);
            int i27 = (i26 ^ (-1)) + (i26 << 1);
            f62402g = i27 % 128;
            int i28 = i27 % 2;
            int i29 = 0;
            while (i29 < list.size()) {
                int i30 = f62402g;
                int i31 = i30 & 23;
                int i32 = ((i30 ^ 23) | i31) << 1;
                int i33 = -((i30 | 23) & (~i31));
                int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
                f62401f = i34 % 128;
                if (i34 % 2 != 0) {
                    ((Reference) list.get(i29)).get();
                    throw null;
                }
                Reference reference = (Reference) list.get(i29);
                if (reference.get() != null) {
                    i29 = ((i29 | 1) << 1) - (i29 ^ 1);
                    int i35 = f62401f;
                    int i36 = ((i35 | 123) << 1) - (i35 ^ 123);
                    f62402g = i36 % 128;
                    int i37 = i36 % 2;
                } else {
                    zj.setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (zj.setCompoundDrawableTintBlendMode) reference;
                    StringBuilder sb3 = new StringBuilder("A connection to ");
                    yp ypVar = (yp) zi.setY(new Object[]{ziVar2}, 2102358168, -2102358143, System.identityHashCode(ziVar2));
                    xh xhVar = (xh) yp.setCompoundDrawableTintBlendMode(new Object[]{ypVar}, 204812250, -204812248, System.identityHashCode(ypVar));
                    sb3.append((yg) xh.setOnFocusChangeListener(new Object[]{xhVar}, -66216281, 66216289, System.identityHashCode(xhVar)));
                    sb3.append(" was leaked. Did you forget to close a response body?");
                    String string = sb3.toString();
                    aaw.setOnFocusChangeListener setonfocuschangelistener = aaw.setCompoundDrawableTintBlendMode;
                    ((aaw) aaw.setOnFocusChangeListener.setOnFocusChangeListener(new Object[0], -1152526253, 1152526259, (int) System.currentTimeMillis())).setDividerPadding(string, zj.setCompoundDrawableTintBlendMode.setOnFocusChangeListener(new Object[]{setcompounddrawabletintblendmode}, -1316733665, 1316733665, System.identityHashCode(setcompounddrawabletintblendmode)));
                    list.remove(i29);
                    zi.setY(new Object[]{ziVar2}, -1212665065, 1212665093, System.identityHashCode(ziVar2));
                    if (!(!list.isEmpty())) {
                        int i38 = f62402g;
                        int i39 = ((i38 | 125) << 1) - (i38 ^ 125);
                        f62401f = i39 % 128;
                        int i40 = i39 % 2;
                        zi.setY(new Object[]{ziVar2, Long.valueOf(jLongValue - zlVar.f62404b)}, 2039985364, -2039985351, System.identityHashCode(ziVar2));
                        int i41 = f62402g;
                        int i42 = i41 & 39;
                        int i43 = (i41 ^ 39) | i42;
                        int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                        f62401f = i44 % 128;
                        int i45 = i44 % 2;
                        objValueOf = 0;
                    }
                }
            }
            int size = list.size();
            int i46 = f62402g;
            int i47 = ((i46 ^ 9) | (i46 & 9)) << 1;
            int i48 = -(((~i46) & 9) | (i46 & (-10)));
            int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
            f62401f = i49 % 128;
            if (i49 % 2 != 0) {
                throw null;
            }
            objValueOf = Integer.valueOf(size);
        } else {
            if (i17 == 2) {
                return a(objArr);
            }
            int i50 = 3;
            if (i17 == 3) {
                zl zlVar2 = (zl) objArr[0];
                long jLongValue2 = ((Number) objArr[1]).longValue();
                long j10 = Long.MIN_VALUE;
                int i51 = 0;
                int i52 = 0;
                for (zi ziVar3 : zlVar2.f62407e) {
                    Intrinsics.checkNotNullExpressionValue(ziVar3, "");
                    synchronized (ziVar3) {
                        try {
                            Object[] objArr2 = new Object[i50];
                            objArr2[0] = zlVar2;
                            objArr2[1] = ziVar3;
                            objArr2[c10] = Long.valueOf(jLongValue2);
                            if (((Integer) setOnFocusChangeListener(objArr2, -84616033, 84616034, System.identityHashCode(zlVar2))).intValue() > 0) {
                                int iIdentityHashCode = System.identityHashCode(zlVar2);
                                int i53 = -(-(i52 * (-215)));
                                int i54 = (((217 | i53) << 1) - (~(-((i53 & (-218)) | (217 & (~i53)))))) - 1;
                                int i55 = -(-((~(iIdentityHashCode | 1)) * 216));
                                int i56 = i54 & i55;
                                int i57 = -(-(i55 | i54));
                                int i58 = (i56 & i57) + (i57 | i56);
                                int i59 = ~i52;
                                int i60 = ((~i59) & 1) | (i59 & (-2));
                                int i61 = i59 & 1;
                                int i62 = (i61 & i60) | (i60 ^ i61);
                                int i63 = ~iIdentityHashCode;
                                int i64 = ((~i63) & i62) | ((~i62) & i63);
                                int i65 = i62 & i63;
                                int i66 = -(-(((i65 & i64) | (i64 ^ i65)) * (-216)));
                                int i67 = i58 & i66;
                                int i68 = -(-((i66 ^ i58) | i67));
                                int i69 = (i67 & i68) + (i68 | i67);
                                int i70 = i63 ^ 1;
                                int i71 = i63 & 1;
                                int i72 = ~((i71 & i70) | (i70 ^ i71));
                                int i73 = i52 ^ i72;
                                int i74 = i72 & i52;
                                int i75 = -(-(((i74 & i73) | (i73 ^ i74)) * 216));
                                int i76 = i69 & i75;
                                int i77 = (i75 ^ i69) | i76;
                                i52 = (i76 ^ i77) + ((i77 & i76) << 1);
                            } else {
                                int i78 = i51 & 1;
                                int i79 = ((i51 ^ 1) | i78) << 1;
                                int i80 = -((~i78) & (i51 | 1));
                                i51 = ((i79 | i80) << 1) - (i79 ^ i80);
                                long jLongValue3 = jLongValue2 - ((Long) zi.setY(new Object[]{ziVar3}, 1566663103, -1566663076, System.identityHashCode(ziVar3))).longValue();
                                if (jLongValue3 > j10) {
                                    ziVar = ziVar3;
                                    j10 = jLongValue3;
                                }
                                Unit unit = Unit.INSTANCE;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    c10 = 2;
                    i50 = 3;
                }
                long j11 = zlVar2.f62404b;
                if (j10 >= j11 || i51 > zlVar2.f62403a) {
                    Intrinsics.checkNotNull(ziVar);
                    synchronized (ziVar) {
                        if (!((List) zi.setY(new Object[]{ziVar}, 1220489272, -1220489265, System.identityHashCode(ziVar))).isEmpty()) {
                            objValueOf = 0L;
                        } else if (((Long) zi.setY(new Object[]{ziVar}, 1566663103, -1566663076, System.identityHashCode(ziVar))).longValue() + j10 != jLongValue2) {
                            objValueOf = 0L;
                        } else {
                            zi.setY(new Object[]{ziVar}, -1212665065, 1212665093, System.identityHashCode(ziVar));
                            zlVar2.f62407e.remove(ziVar);
                            yt.setX((Socket) zi.setY(new Object[]{ziVar}, 326996816, -326996798, System.identityHashCode(ziVar)));
                            if (zlVar2.f62407e.isEmpty()) {
                                ze zeVar2 = zlVar2.f62405c;
                                ze.setY(new Object[]{zeVar2}, -569925527, 569925536, System.identityHashCode(zeVar2));
                            }
                            objValueOf = 0L;
                        }
                    }
                } else if (i51 > 0) {
                    objValueOf = Long.valueOf(j11 - j10);
                } else {
                    objValueOf = i52 > 0 ? Long.valueOf(j11) : -1L;
                }
            } else {
                if (i17 == 4) {
                    zl zlVar3 = (zl) objArr[0];
                    zi ziVar4 = (zi) objArr[1];
                    int i81 = f62401f;
                    int i82 = i81 & 53;
                    int i83 = (i81 | 53) & (~i82);
                    int i84 = i82 << 1;
                    int i85 = (i83 & i84) + (i83 | i84);
                    f62402g = i85 % 128;
                    if (i85 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(ziVar4, "");
                        byte[] bArr2 = yt.setX;
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(ziVar4, "");
                    if (yt.setOnFocusChangeListener && !Thread.holdsLock(ziVar4)) {
                        StringBuilder sb4 = new StringBuilder("Thread ");
                        sb4.append((Object) Thread.currentThread().getName());
                        sb4.append(" MUST hold lock on ");
                        sb4.append(ziVar4);
                        throw new AssertionError(sb4.toString());
                    }
                    zlVar3.f62407e.add(ziVar4);
                    ze.setY(new Object[]{zlVar3.f62405c, zlVar3.f62406d}, 338244324, -338244319, (int) System.currentTimeMillis());
                    int i86 = f62401f;
                    int i87 = (i86 | 55) << 1;
                    int i88 = -(i86 ^ 55);
                    int i89 = (i87 ^ i88) + ((i88 & i87) << 1);
                    f62402g = i89 % 128;
                    if (i89 % 2 != 0) {
                        return null;
                    }
                    throw null;
                }
                zl zlVar4 = (zl) objArr[0];
                zi ziVar5 = (zi) objArr[1];
                int i90 = f62401f;
                int i91 = (i90 ^ 13) + ((i90 & 13) << 1);
                f62402g = i91 % 128;
                int i92 = i91 % 2;
                Intrinsics.checkNotNullParameter(ziVar5, "");
                if (yt.setOnFocusChangeListener) {
                    int i93 = f62402g;
                    int i94 = ((i93 ^ 11) - (~((i93 & 11) << 1))) - 1;
                    f62401f = i94 % 128;
                    int i95 = i94 % 2;
                    if (!Thread.holdsLock(ziVar5)) {
                        StringBuilder sb5 = new StringBuilder("Thread ");
                        sb5.append((Object) Thread.currentThread().getName());
                        sb5.append(" MUST hold lock on ");
                        sb5.append(ziVar5);
                        throw new AssertionError(sb5.toString());
                    }
                }
                if (((Boolean) zi.setY(new Object[]{ziVar5}, -1952685773, 1952685797, System.identityHashCode(ziVar5))).booleanValue()) {
                    zi.setY(new Object[]{ziVar5}, -1212665065, 1212665093, System.identityHashCode(ziVar5));
                    zlVar4.f62407e.remove(ziVar5);
                    if (zlVar4.f62407e.isEmpty()) {
                        int i96 = f62401f;
                        int i97 = (i96 ^ 17) + ((i96 & 17) << 1);
                        f62402g = i97 % 128;
                        i14 = i97 % 2;
                        zeVar = zlVar4.f62405c;
                        if (i14 == 0) {
                            ze.setY(new Object[]{zeVar}, -569925527, 569925536, System.identityHashCode(zeVar));
                            int i98 = 87 / 0;
                        } else {
                            ze.setY(new Object[]{zeVar}, -569925527, 569925536, System.identityHashCode(zeVar));
                        }
                        int i99 = f62401f + 53;
                        f62402g = i99 % 128;
                        int i100 = i99 % 2;
                    }
                    i13 = f62401f + 11;
                    f62402g = i13 % 128;
                    if (i13 % 2 != 0) {
                        throw null;
                    }
                    objValueOf = Boolean.TRUE;
                } else {
                    int i101 = f62402g + 90;
                    int i102 = (i101 ^ (-1)) + (i101 << 1);
                    f62401f = i102 % 128;
                    int i103 = i102 % 2;
                    if (zlVar4.f62403a == 0) {
                        zi.setY(new Object[]{ziVar5}, -1212665065, 1212665093, System.identityHashCode(ziVar5));
                        zlVar4.f62407e.remove(ziVar5);
                        if (zlVar4.f62407e.isEmpty()) {
                            int i910 = f62401f;
                            int i911 = (i910 ^ 17) + ((i910 & 17) << 1);
                            f62402g = i911 % 128;
                            i14 = i911 % 2;
                            zeVar = zlVar4.f62405c;
                            if (i14 == 0) {
                                ze.setY(new Object[]{zeVar}, -569925527, 569925536, System.identityHashCode(zeVar));
                                int i912 = 87 / 0;
                            } else {
                                ze.setY(new Object[]{zeVar}, -569925527, 569925536, System.identityHashCode(zeVar));
                            }
                            int i913 = f62401f + 53;
                            f62402g = i913 % 128;
                            int i104 = i913 % 2;
                        }
                        i13 = f62401f + 11;
                        f62402g = i13 % 128;
                        if (i13 % 2 != 0) {
                            throw null;
                        }
                        objValueOf = Boolean.TRUE;
                    } else {
                        ze.setY(new Object[]{zlVar4.f62405c, zlVar4.f62406d}, 338244324, -338244319, (int) System.currentTimeMillis());
                        int i105 = f62402g;
                        int i106 = i105 | 59;
                        int i107 = i106 << 1;
                        int i108 = -((~(i105 & 59)) & i106);
                        int i109 = (i107 & i108) + (i108 | i107);
                        f62401f = i109 % 128;
                        int i110 = i109 % 2;
                        objValueOf = Boolean.FALSE;
                    }
                }
            }
        }
        return objValueOf;
    }

    public final long setX(long p4) {
        return ((Long) setOnFocusChangeListener(new Object[]{this, Long.valueOf(p4)}, 1906262391, -1906262388, System.identityHashCode(this))).longValue();
    }

    public final boolean setY(@NotNull zi p4) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, p4}, 215788913, -215788913, System.identityHashCode(this))).booleanValue();
    }

    public final void setX(@NotNull zi p4) throws Throwable {
        setOnFocusChangeListener(new Object[]{this, p4}, -652676996, 652677000, System.identityHashCode(this));
    }

    public final boolean setX(@NotNull xh p4, @NotNull zj p10, @Nullable List<yp> p11, boolean p12) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{this, p4, p10, p11, Boolean.valueOf(p12)}, -1683625768, 1683625770, System.identityHashCode(this))).booleanValue();
    }
}
