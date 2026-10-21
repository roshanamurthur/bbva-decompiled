package com.mypinpad.tsdk.isolation;

import androidx.room.a;
import com.bbva.glomohybrid.infoscreen.scratchCard.activity.ScratchcardActivity;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Header;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB'\u0012\u0006\u0010\u0003\u001a\u00020\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\nJ\u000f\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0007\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0007\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u000f\u0010\u0012J\u0017\u0010\u0007\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0007\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00168\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/mypinpad/tsdk/i/aaj;", "Lcom/mypinpad/tsdk/i/zu;", "Lcom/mypinpad/tsdk/i/yk;", "p0", "", "p1", "Lcom/mypinpad/tsdk/i/aco;", "setX", "(Lcom/mypinpad/tsdk/i/yk;J)Lcom/mypinpad/tsdk/i/aco;", "", "(Lcom/mypinpad/tsdk/i/yk;)V", "setY", "()V", "", "Lcom/mypinpad/tsdk/i/yr$setDividerPadding;", "setOnFocusChangeListener", "(Z)Lcom/mypinpad/tsdk/i/yr$setDividerPadding;", "Lcom/mypinpad/tsdk/i/yr;", "(Lcom/mypinpad/tsdk/i/yr;)J", "Lcom/mypinpad/tsdk/i/acp;", "(Lcom/mypinpad/tsdk/i/yr;)Lcom/mypinpad/tsdk/i/acp;", "setCompoundDrawableTintBlendMode", "Lcom/mypinpad/tsdk/i/zi;", "a", "Lcom/mypinpad/tsdk/i/zi;", "setDividerPadding", "()Lcom/mypinpad/tsdk/i/zi;", "Lcom/mypinpad/tsdk/i/ym;", "Lcom/mypinpad/tsdk/i/zs;", "p2", "Lcom/mypinpad/tsdk/i/aah;", "p3", "<init>", "(Lcom/mypinpad/tsdk/i/ym;Lcom/mypinpad/tsdk/i/zi;Lcom/mypinpad/tsdk/i/zs;Lcom/mypinpad/tsdk/i/aah;)V"}, k = 1, mv = {1, 6, 0})
public final class aaj implements zu {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f52135i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f52136j = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zi setOnFocusChangeListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final zs f52138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final aah f52139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public volatile aak f52140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final yi f52141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f52142f;

    /* JADX INFO: renamed from: setOnFocusChangeListener, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final List<String> f52133g = yt.setOnFocusChangeListener("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final List<String> f52134h = yt.setOnFocusChangeListener("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: com.mypinpad.tsdk.i.aaj$setOnFocusChangeListener, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010"}, d2 = {"Lcom/mypinpad/tsdk/i/aaj$setOnFocusChangeListener;", "", "Lcom/mypinpad/tsdk/i/yk;", "p0", "", "Lcom/mypinpad/tsdk/i/aab;", "setDividerPadding", "(Lcom/mypinpad/tsdk/i/yk;)Ljava/util/List;", "Lcom/mypinpad/tsdk/i/ye;", "Lcom/mypinpad/tsdk/i/yi;", "p1", "Lcom/mypinpad/tsdk/i/yr$setDividerPadding;", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/ye;Lcom/mypinpad/tsdk/i/yi;)Lcom/mypinpad/tsdk/i/yr$setDividerPadding;", "", "setLayoutAnimation", "Ljava/util/List;", "setOnFocusChangeListener", "setOnDragListener", "setX", "<init>", "()V"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f52143a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f52144b = 1;

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public static yr.setDividerPadding setCompoundDrawableTintBlendMode(@NotNull ye p4, @NotNull yi p10) {
            return (yr.setDividerPadding) setY(new Object[]{p4, p10}, -1345224335, 1345224336, (int) System.currentTimeMillis());
        }

        @NotNull
        public static List<aab> setDividerPadding(@NotNull yk p4) {
            return (List) setY(new Object[]{p4}, -1389637923, 1389637923, (int) System.currentTimeMillis());
        }

        /* JADX WARN: Code duplicated, block: B:18:0x01f7  */
        /* JADX WARN: Code duplicated, block: B:36:0x033f  */
        /* JADX WARN: Code duplicated, block: B:38:0x035d  */
        /* JADX WARN: Code duplicated, block: B:39:0x0373  */
        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws ProtocolException {
            yr.setDividerPadding setdividerpadding;
            int i13;
            String str;
            String str2;
            int i14;
            Object obj;
            int i15 = ~i11;
            int i16 = ~i12;
            int i17 = ((~(i15 | i10 | i12)) * (-1662)) + (((~(i15 | i16)) | (~(i10 | i11 | i12))) * (-831)) + (i11 * 832) + (i10 * (-830));
            int i18 = ~((~i10) | i16);
            int i19 = 611642845;
            if ((((~(i10 | i12)) | i18 | (~(i11 | i12))) * 831) + i17 != 1) {
                yk ykVar = (yk) objArr[0];
                Intrinsics.checkNotNullParameter(ykVar, "");
                ye yeVar = (ye) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar}, -1466291161, 1466291162, System.identityHashCode(ykVar));
                int dividerPadding = yeVar.setDividerPadding();
                System.currentTimeMillis();
                int i20 = -(-(dividerPadding * 825));
                int i21 = 6596 & i20;
                int i22 = -(-((6596 ^ i20) | i21));
                int i23 = (i21 & i22) + (i21 | i22);
                int i24 = ~dividerPadding;
                int i25 = -(-(((i24 ^ 4) | (i24 & 4)) * (-824)));
                int i26 = i23 & i25;
                int i27 = ((i23 ^ i25) | i26) << 1;
                int i28 = -((i23 | i25) & (~i26));
                int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
                int i30 = dividerPadding ^ 4;
                int i31 = dividerPadding & 4;
                int i32 = ((i30 ^ i31) | (i30 & i31)) * (-1648);
                int i33 = (i29 ^ i32) + ((i32 & i29) << 1);
                int i34 = (i24 | dividerPadding) & i24;
                int i35 = ((~i34) & (-5)) | (i34 & 4);
                int i36 = i34 & (-5);
                int i37 = ((i36 & i35) | (i35 ^ i36)) * 824;
                ArrayList arrayList = new ArrayList((i33 ^ i37) + ((i33 & i37) << 1));
                arrayList.add(new aab(aab.getNavBarTitleString, ykVar.setOnFocusChangeListener()));
                abw abwVar = aab.setOnDragListener;
                zx zxVar = zx.INSTANCE;
                arrayList.add(new aab(abwVar, (String) zx.setDividerPadding(new Object[]{ykVar.setY()}, -1315614297, 1315614297, (int) System.currentTimeMillis())));
                String str3 = (String) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar, "Host"}, 1273556189, -1273556181, System.identityHashCode(ykVar));
                if (str3 != null) {
                    arrayList.add(new aab(aab.setLayoutAnimation, str3));
                    int i38 = f52144b;
                    int i39 = i38 ^ 97;
                    int i40 = ((i38 & 97) | i39) << 1;
                    int i41 = -i39;
                    int i42 = (i40 & i41) + (i40 | i41);
                    f52143a = i42 % 128;
                    int i43 = i42 % 2;
                }
                arrayList.add(new aab(aab.setOnLongClickListener, ykVar.setY().setDividerPadding()));
                int iIntValue = ((Integer) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar}, -1558209065, 1558209065, System.identityHashCode(yeVar))).intValue();
                int i44 = f52144b;
                int i45 = (i44 ^ 67) + ((i44 & 67) << 1);
                f52143a = i45 % 128;
                int i46 = i45 % 2;
                int i47 = 0;
                while (i47 < iIntValue) {
                    int i48 = f52143a + 63;
                    f52144b = i48 % 128;
                    int i49 = i48 % 2;
                    int i50 = (((i47 ^ 119) | (i47 & 119)) << 1) - ((i47 & (-120)) | ((~i47) & 119));
                    int i51 = (i50 & 117) | ((~i50) & (-118));
                    int i52 = -(-((i50 & (-118)) << 1));
                    int i53 = (i51 & i52) + (i52 | i51);
                    String str4 = (String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar, Integer.valueOf(i47)}, 611642845, -611642844, i47);
                    Locale locale = Locale.US;
                    String strD = a.d(locale, "", str4, locale, "");
                    if (!((List) aaj.setCompoundDrawableTintBlendMode(new Object[0], -1054234081, 1054234088, (int) System.currentTimeMillis())).contains(strD)) {
                        arrayList.add(new aab(strD, yeVar.setCompoundDrawableTintBlendMode(i47)));
                        int i54 = f52144b;
                        int i55 = i54 ^ 117;
                        int i56 = ((((i54 & 117) | i55) << 1) - (~(-i55))) - 1;
                        f52143a = i56 % 128;
                        int i57 = i56 % 2;
                    } else {
                        int i58 = (-2) - ((f52143a + 44) ^ (-1));
                        f52144b = i58 % 128;
                        int i59 = i58 % 2;
                        if (Intrinsics.areEqual(strD, "te")) {
                            int i60 = f52143a;
                            int i61 = (-2) - (((i60 ^ 88) + ((i60 & 88) << 1)) ^ (-1));
                            f52144b = i61 % 128;
                            if (i61 % 2 == 0) {
                                Intrinsics.areEqual((String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar, Integer.valueOf(i47)}, -1668064352, 1668064356, i47), "trailers");
                                throw null;
                            }
                            if (Intrinsics.areEqual((String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar, Integer.valueOf(i47)}, -1668064352, 1668064356, i47), "trailers")) {
                                arrayList.add(new aab(strD, yeVar.setCompoundDrawableTintBlendMode(i47)));
                                int i510 = f52144b;
                                int i511 = i510 ^ 117;
                                int i512 = ((((i510 & 117) | i511) << 1) - (~(-i511))) - 1;
                                f52143a = i512 % 128;
                                int i513 = i512 % 2;
                            }
                        } else {
                            continue;
                        }
                    }
                    i47 = i53;
                }
                int i62 = f52143a;
                int i63 = (((i62 ^ 105) | (i62 & 105)) << 1) - (((~i62) & 105) | (i62 & (-106)));
                f52144b = i63 % 128;
                int i64 = i63 % 2;
                obj = arrayList;
            } else {
                ye yeVar2 = (ye) objArr[0];
                yi yiVar = (yi) objArr[1];
                Intrinsics.checkNotNullParameter(yeVar2, "");
                Intrinsics.checkNotNullParameter(yiVar, "");
                ye.setOnFocusChangeListener setonfocuschangelistener = new ye.setOnFocusChangeListener();
                int iIntValue2 = ((Integer) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar2}, -1558209065, 1558209065, System.identityHashCode(yeVar2))).intValue();
                int i65 = f52144b;
                int i66 = (i65 ^ 29) + ((i65 & 29) << 1);
                f52143a = i66 % 128;
                int i67 = i66 % 2;
                int i68 = 0;
                zy zyVar = null;
                while (i68 < iIntValue2) {
                    int i69 = f52144b;
                    int i70 = ((i69 | 89) << 1) - (i69 ^ 89);
                    f52143a = i70 % 128;
                    if (i70 % 2 != 0) {
                        int i71 = i68 & 4;
                        int i72 = i71 + ((i68 ^ 4) | i71);
                        String str5 = (String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar2, Integer.valueOf(i68)}, i19, -611642844, i68);
                        str2 = (String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar2, Integer.valueOf(i68)}, -1668064352, 1668064356, i68);
                        if (Intrinsics.areEqual(str5, Header.RESPONSE_STATUS_UTF8)) {
                            i13 = i72;
                            zy.Companion companion = zy.INSTANCE;
                            zyVar = (zy) zy.Companion.setY(new Object[]{Intrinsics.stringPlus("HTTP/1.1 ", str2)}, -1723180197, 1723180197, (int) System.currentTimeMillis());
                            int i73 = f52144b;
                            int i74 = i73 & 49;
                            int i75 = ((i73 ^ 49) | i74) << 1;
                            int i76 = -((i73 | 49) & (~i74));
                            int i77 = (i75 & i76) + (i76 | i75);
                            f52143a = i77 % 128;
                            int i78 = i77 % 2;
                            i68 = i13;
                        } else {
                            i13 = i72;
                            str = str5;
                            int i79 = i13;
                            if (!((List) aaj.setCompoundDrawableTintBlendMode(new Object[0], 2044487951, -2044487949, (int) System.currentTimeMillis())).contains(str)) {
                                int i80 = f52143a;
                                int i81 = i80 & 13;
                                int i82 = (i80 | 13) & (~i81);
                                int i83 = -(-(i81 << 1));
                                i14 = ((i82 | i83) << 1) - (i82 ^ i83);
                                f52144b = i14 % 128;
                                if (i14 % 2 == 0) {
                                    int i84 = 43 / 0;
                                }
                            }
                            i68 = i79;
                        }
                    } else {
                        int i85 = i68 & (-107);
                        int i86 = (i85 - (~((i68 ^ (-107)) | i85))) - 1;
                        int i87 = ((i86 ^ 108) | (i86 & 108)) << 1;
                        int i88 = -(((~i86) & 108) | (i86 & (-109)));
                        i13 = ((i87 | i88) << 1) - (i88 ^ i87);
                        str = (String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar2, Integer.valueOf(i68)}, i19, -611642844, i68);
                        str2 = (String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar2, Integer.valueOf(i68)}, -1668064352, 1668064356, i68);
                        if (!Intrinsics.areEqual(str, Header.RESPONSE_STATUS_UTF8)) {
                            int i710 = i13;
                            if (!((List) aaj.setCompoundDrawableTintBlendMode(new Object[0], 2044487951, -2044487949, (int) System.currentTimeMillis())).contains(str)) {
                                int i89 = f52143a;
                                int i810 = i89 & 13;
                                int i811 = (i89 | 13) & (~i810);
                                int i812 = -(-(i810 << 1));
                                i14 = ((i811 | i812) << 1) - (i811 ^ i812);
                                f52144b = i14 % 128;
                                if (i14 % 2 == 0) {
                                    int i813 = 43 / 0;
                                }
                            }
                            i68 = i710;
                        } else {
                            zy.Companion companion2 = zy.INSTANCE;
                            zyVar = (zy) zy.Companion.setY(new Object[]{Intrinsics.stringPlus("HTTP/1.1 ", str2)}, -1723180197, 1723180197, (int) System.currentTimeMillis());
                            int i711 = f52144b;
                            int i712 = i711 & 49;
                            int i713 = ((i711 ^ 49) | i712) << 1;
                            int i714 = -((i711 | 49) & (~i712));
                            int i715 = (i713 & i714) + (i714 | i713);
                            f52143a = i715 % 128;
                            int i716 = i715 % 2;
                            i68 = i13;
                        }
                    }
                    i19 = 611642845;
                }
                if (zyVar == null) {
                    throw new ProtocolException("Expected ':status' header not present");
                }
                yr.setDividerPadding setdividerpadding2 = new yr.setDividerPadding();
                yr.setDividerPadding setdividerpadding3 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding2, yiVar}, 1826457204, -1826457177, System.identityHashCode(setdividerpadding2));
                int i90 = zyVar.setDividerPadding;
                yr.setDividerPadding setdividerpadding4 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding3, Integer.valueOf(i90)}, 784510625, -784510596, i90);
                yr.setDividerPadding setdividerpadding5 = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding4, zyVar.setY}, 176587316, -176587297, System.identityHashCode(setdividerpadding4));
                setdividerpadding = (yr.setDividerPadding) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding5, (ye) ye.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -1008790874, 1008790879, System.identityHashCode(setonfocuschangelistener))}, 1273569601, -1273569577, System.identityHashCode(setdividerpadding5));
                int i91 = f52143a;
                int i92 = i91 ^ 97;
                int i93 = (i91 & 97) << 1;
                int i94 = (i92 & i93) + (i93 | i92);
                f52144b = i94 % 128;
                if (i94 % 2 == 0) {
                    obj = setdividerpadding;
                    throw null;
                }
            }
            obj = setdividerpadding;
            return obj;
        }
    }

    static {
        int i10 = f52136j;
        int i11 = ((-1) << 1) - ((-1) ^ (((i10 | 118) << 1) - (i10 ^ 118)));
        f52135i = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public aaj(@NotNull ym ymVar, @NotNull zi ziVar, @NotNull zs zsVar, @NotNull aah aahVar) {
        Intrinsics.checkNotNullParameter(ymVar, "");
        Intrinsics.checkNotNullParameter(ziVar, "");
        Intrinsics.checkNotNullParameter(zsVar, "");
        Intrinsics.checkNotNullParameter(aahVar, "");
        this.setOnFocusChangeListener = ziVar;
        this.f52138b = zsVar;
        this.f52139c = aahVar;
        List list = (List) ym.setY(new Object[]{ymVar}, 796888484, -796888454, System.identityHashCode(ymVar));
        yi yiVar = yi.setLayoutAnimation;
        this.f52141e = list.contains(yiVar) ? yiVar : yi.setY;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws IOException {
        long x4;
        Object objValueOf;
        boolean z10;
        int i13 = ~i10;
        int i14 = (i13 * 677) + (i11 * (-676)) + (i10 * 678);
        int i15 = ~i11;
        switch (((~(i10 | i15)) * 677) + ((i13 | i15) * (-677)) + i14) {
            case 1:
                aaj aajVar = (aaj) objArr[0];
                yk ykVar = (yk) objArr[1];
                ((Number) objArr[2]).longValue();
                int i16 = f52135i;
                int i17 = (i16 & 41) + (i16 | 41);
                f52136j = i17 % 128;
                int i18 = i17 % 2;
                Intrinsics.checkNotNullParameter(ykVar, "");
                aak aakVar = aajVar.f52140d;
                Intrinsics.checkNotNull(aakVar);
                aco acoVar = (aco) aak.setOnFocusChangeListener(new Object[]{aakVar}, 1804763460, -1804763454, System.identityHashCode(aakVar));
                int i19 = f52135i;
                int i20 = i19 ^ 7;
                int i21 = ((i19 & 7) | i20) << 1;
                int i22 = -i20;
                int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
                f52136j = i23 % 128;
                int i24 = i23 % 2;
                return acoVar;
            case 2:
                int i25 = f52136j + 103;
                f52135i = i25 % 128;
                if (i25 % 2 == 0) {
                    return f52134h;
                }
                throw null;
            case 3:
                yr yrVar = (yr) objArr[1];
                int i26 = f52135i;
                int i27 = (((i26 ^ 81) | (i26 & 81)) << 1) - (((~i26) & 81) | (i26 & (-82)));
                f52136j = i27 % 128;
                if (i27 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(yrVar, "");
                    ((Boolean) zt.setX(new Object[]{yrVar}, -1746594724, 1746594725, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(yrVar, "");
                if (!((Boolean) zt.setX(new Object[]{yrVar}, -1746594724, 1746594725, (int) System.currentTimeMillis())).booleanValue()) {
                    int i28 = f52135i;
                    int i29 = (i28 | 107) << 1;
                    int i30 = -(((~i28) & 107) | (i28 & (-108)));
                    int i31 = (i29 & i30) + (i30 | i29);
                    f52136j = i31 % 128;
                    int i32 = i31 % 2;
                    x4 = 0;
                } else {
                    x4 = yt.setX(yrVar);
                    int i33 = f52136j;
                    int i34 = i33 & 49;
                    int i35 = (i33 | 49) & (~i34);
                    int i36 = -(-(i34 << 1));
                    int i37 = ((i35 | i36) << 1) - (i35 ^ i36);
                    f52135i = i37 % 128;
                    int i38 = i37 % 2;
                }
                objValueOf = Long.valueOf(x4);
                break;
                break;
            case 4:
                aaj aajVar2 = (aaj) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int i39 = f52135i;
                int i40 = (((i39 | 36) << 1) - (i39 ^ 36)) - 1;
                f52136j = i40 % 128;
                if (i40 % 2 == 0) {
                    aak aakVar2 = aajVar2.f52140d;
                    Intrinsics.checkNotNull(aakVar2);
                    throw null;
                }
                aak aakVar3 = aajVar2.f52140d;
                Intrinsics.checkNotNull(aakVar3);
                yr.setDividerPadding setdividerpadding = (yr.setDividerPadding) Companion.setY(new Object[]{aakVar3.setIncludeFontPadding(), aajVar2.f52141e}, -1345224335, 1345224336, (int) System.currentTimeMillis());
                if (!(!zBooleanValue)) {
                    int i41 = f52136j;
                    int i42 = i41 & 63;
                    int i43 = (i42 - (~(-(-((i41 ^ 63) | i42))))) - 1;
                    f52135i = i43 % 128;
                    int i44 = i43 % 2;
                    if (((Integer) yr.setDividerPadding.setDividerPadding(new Object[]{setdividerpadding}, -314644963, 314644972, System.identityHashCode(setdividerpadding))).intValue() == 100) {
                        int i45 = f52135i;
                        int i46 = i45 + 89;
                        f52136j = i46 % 128;
                        if (i46 % 2 == 0) {
                            throw null;
                        }
                        int i47 = (i45 ^ 29) + ((i45 & 29) << 1);
                        f52136j = i47 % 128;
                        if (i47 % 2 != 0) {
                            return null;
                        }
                        throw null;
                    }
                }
                int i48 = f52136j;
                int i49 = (i48 & 41) + (i48 | 41);
                f52135i = i49 % 128;
                if (i49 % 2 == 0) {
                    return setdividerpadding;
                }
                throw null;
            case 5:
                aaj aajVar3 = (aaj) objArr[0];
                int i50 = f52136j;
                int i51 = i50 & 115;
                int i52 = -(-((i50 ^ 115) | i51));
                int i53 = (i51 & i52) + (i51 | i52);
                f52135i = i53 % 128;
                int i54 = i53 % 2;
                objValueOf = aajVar3.setOnFocusChangeListener;
                int i55 = ((i50 ^ 5) | (i50 & 5)) << 1;
                int i56 = -(((~i50) & 5) | (i50 & (-6)));
                int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                f52135i = i57 % 128;
                if (i57 % 2 != 0) {
                    throw null;
                }
                break;
            case 6:
                aaj aajVar4 = (aaj) objArr[0];
                int i58 = f52135i;
                int i59 = (i58 ^ 47) + ((i58 & 47) << 1);
                f52136j = i59 % 128;
                int i60 = i59 % 2;
                aah aahVar = aajVar4.f52139c;
                aah.setX(new Object[]{aahVar}, 1706538080, -1706538032, System.identityHashCode(aahVar));
                int i61 = f52135i;
                int i62 = (i61 ^ 41) + ((i61 & 41) << 1);
                f52136j = i62 % 128;
                int i63 = i62 % 2;
                return null;
            case 7:
                int i64 = f52136j;
                int i65 = (((i64 ^ 101) | (i64 & 101)) << 1) - (((~i64) & 101) | (i64 & (-102)));
                int i66 = i65 % 128;
                f52135i = i66;
                int i67 = i65 % 2;
                List<String> list = f52133g;
                int i68 = i66 & 17;
                int i69 = -(-((i66 ^ 17) | i68));
                int i70 = ((i68 | i69) << 1) - (i69 ^ i68);
                f52136j = i70 % 128;
                int i71 = i70 % 2;
                return list;
            case 8:
                aaj aajVar5 = (aaj) objArr[0];
                yk ykVar2 = (yk) objArr[1];
                int i72 = f52136j;
                int i73 = i72 ^ 17;
                int i74 = (i72 & 17) << 1;
                int i75 = (i73 ^ i74) + ((i74 & i73) << 1);
                f52135i = i75 % 128;
                if (i75 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(ykVar2, "");
                    aak aakVar4 = aajVar5.f52140d;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(ykVar2, "");
                if (aajVar5.f52140d != null) {
                    int i76 = f52136j;
                    int i77 = i76 & 89;
                    int i78 = (i76 | 89) & (~i77);
                    int i79 = i77 << 1;
                    int i80 = (i78 & i79) + (i78 | i79);
                    f52135i = i80 % 128;
                    int i81 = i80 % 2;
                    return null;
                }
                if (((yo) yk.setCompoundDrawableTintBlendMode(new Object[]{ykVar2}, -2084954302, 2084954305, System.identityHashCode(ykVar2))) != null) {
                    int i82 = f52136j;
                    int i83 = (i82 & (-94)) | ((~i82) & 93);
                    int i84 = (i82 & 93) << 1;
                    int i85 = (i83 & i84) + (i83 | i84);
                    f52135i = i85 % 128;
                    int i86 = i85 % 2;
                    int i87 = i82 ^ 83;
                    int i88 = ((i82 & 83) | i87) << 1;
                    int i89 = -i87;
                    int i90 = (i88 & i89) + (i88 | i89);
                    f52135i = i90 % 128;
                    int i91 = i90 % 2;
                    z10 = true;
                } else {
                    int i92 = f52136j;
                    int i93 = (((i92 ^ 19) | (i92 & 19)) << 1) - (((~i92) & 19) | (i92 & (-20)));
                    f52135i = i93 % 128;
                    int i94 = i93 % 2;
                    z10 = false;
                }
                List list2 = (List) Companion.setY(new Object[]{ykVar2}, -1389637923, 1389637923, (int) System.currentTimeMillis());
                aah aahVar2 = aajVar5.f52139c;
                aajVar5.f52140d = (aak) aah.setX(new Object[]{aahVar2, list2, Boolean.valueOf(z10)}, -1090144113, 1090144129, System.identityHashCode(aahVar2));
                if (aajVar5.f52142f) {
                    aak aakVar5 = aajVar5.f52140d;
                    Intrinsics.checkNotNull(aakVar5);
                    aak.setOnFocusChangeListener(new Object[]{aakVar5, aac.CANCEL}, 1937161244, -1937161244, System.identityHashCode(aakVar5));
                    throw new IOException(ScratchcardActivity.SCRATCHCARD_RESULT_CANCELED);
                }
                aak aakVar6 = aajVar5.f52140d;
                Intrinsics.checkNotNull(aakVar6);
                acq acqVar = (acq) aak.setOnFocusChangeListener(new Object[]{aakVar6}, -941467534, 941467536, System.identityHashCode(aakVar6));
                zs zsVar = aajVar5.f52138b;
                long jIntValue = ((Integer) zs.setCompoundDrawableTintBlendMode(new Object[]{zsVar}, -71337801, 71337801, System.identityHashCode(zsVar))).intValue();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                acqVar.setOnFocusChangeListener(jIntValue, timeUnit);
                aak aakVar7 = aajVar5.f52140d;
                Intrinsics.checkNotNull(aakVar7);
                acq acqVar2 = (acq) aak.setOnFocusChangeListener(new Object[]{aakVar7}, -253897860, 253897867, System.identityHashCode(aakVar7));
                zs zsVar2 = aajVar5.f52138b;
                acqVar2.setOnFocusChangeListener(((Integer) zs.setCompoundDrawableTintBlendMode(new Object[]{zsVar2}, 1387657808, -1387657796, System.identityHashCode(zsVar2))).intValue(), timeUnit);
                int i95 = f52136j;
                int i96 = i95 & 15;
                int i97 = (i95 ^ 15) | i96;
                int i98 = ((i96 | i97) << 1) - (i97 ^ i96);
                f52135i = i98 % 128;
                if (i98 % 2 == 0) {
                    return null;
                }
                int i99 = 5 / 0;
                return null;
            case 9:
                aaj aajVar6 = (aaj) objArr[0];
                int i100 = f52135i;
                int i101 = i100 & 43;
                int i102 = (((i100 | 43) & (~i101)) - (~(-(-(i101 << 1))))) - 1;
                f52136j = i102 % 128;
                int i103 = i102 % 2;
                aajVar6.f52142f = true;
                aak aakVar8 = aajVar6.f52140d;
                if (aakVar8 != null) {
                    aak.setOnFocusChangeListener(new Object[]{aakVar8, aac.CANCEL}, 1937161244, -1937161244, System.identityHashCode(aakVar8));
                    int i104 = f52135i + 111;
                    f52136j = i104 % 128;
                    int i105 = i104 % 2;
                    return null;
                }
                int i106 = f52136j;
                int i107 = (i106 & 1) + (i106 | 1);
                f52135i = i107 % 128;
                int i108 = i107 % 2;
                int i109 = ((i106 | 25) << 1) - (i106 ^ 25);
                f52135i = i109 % 128;
                if (i109 % 2 == 0) {
                    return null;
                }
                throw null;
            case 10:
                aaj aajVar7 = (aaj) objArr[0];
                yr yrVar2 = (yr) objArr[1];
                int i110 = f52135i;
                int i111 = i110 & 43;
                int i112 = (i110 | 43) & (~i111);
                int i113 = i111 << 1;
                int i114 = ((i112 | i113) << 1) - (i112 ^ i113);
                f52136j = i114 % 128;
                if (i114 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(yrVar2, "");
                    aak aakVar9 = aajVar7.f52140d;
                    Intrinsics.checkNotNull(aakVar9);
                    return (aak.setDividerPadding) aak.setOnFocusChangeListener(new Object[]{aakVar9}, 334486782, -334486771, System.identityHashCode(aakVar9));
                }
                Intrinsics.checkNotNullParameter(yrVar2, "");
                aak aakVar10 = aajVar7.f52140d;
                Intrinsics.checkNotNull(aakVar10);
                throw null;
            default:
                aaj aajVar8 = (aaj) objArr[0];
                int i115 = f52136j + 125;
                f52135i = i115 % 128;
                if (i115 % 2 != 0) {
                    aak aakVar11 = aajVar8.f52140d;
                    Intrinsics.checkNotNull(aakVar11);
                    ((aco) aak.setOnFocusChangeListener(new Object[]{aakVar11}, 1804763460, -1804763454, System.identityHashCode(aakVar11))).close();
                    throw null;
                }
                aak aakVar12 = aajVar8.f52140d;
                Intrinsics.checkNotNull(aakVar12);
                ((aco) aak.setOnFocusChangeListener(new Object[]{aakVar12}, 1804763460, -1804763454, System.identityHashCode(aakVar12))).close();
                int i116 = f52135i + 85;
                f52136j = i116 % 128;
                if (i116 % 2 != 0) {
                    return null;
                }
                throw null;
        }
        return objValueOf;
    }

    public static final /* synthetic */ List setNavigationOnClickListener() {
        return (List) setCompoundDrawableTintBlendMode(new Object[0], 2044487951, -2044487949, (int) System.currentTimeMillis());
    }

    public static final /* synthetic */ List setOnFocusChangeListener() {
        return (List) setCompoundDrawableTintBlendMode(new Object[0], -1054234081, 1054234088, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.zu
    @JvmName(name = "setDividerPadding")
    @NotNull
    public final zi setDividerPadding() {
        return (zi) setCompoundDrawableTintBlendMode(new Object[]{this}, -809741462, 809741467, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.zu
    @NotNull
    public final acp setX(@NotNull yr p4) {
        return (acp) setCompoundDrawableTintBlendMode(new Object[]{this, p4}, -2009000030, 2009000040, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.zu
    public final void setY() throws IOException {
        setCompoundDrawableTintBlendMode(new Object[]{this}, -1734894003, 1734894009, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.zu
    public final long setOnFocusChangeListener(@NotNull yr p4) {
        return ((Long) setCompoundDrawableTintBlendMode(new Object[]{this, p4}, -363272085, 363272088, System.identityHashCode(this))).longValue();
    }

    @Override // com.mypinpad.tsdk.isolation.zu
    public final void setX() throws IOException {
        setCompoundDrawableTintBlendMode(new Object[]{this}, 709772801, -709772801, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.zu
    @Nullable
    public final yr.setDividerPadding setOnFocusChangeListener(boolean p4) {
        return (yr.setDividerPadding) setCompoundDrawableTintBlendMode(new Object[]{this, Boolean.valueOf(p4)}, -1727041291, 1727041295, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.zu
    public final void setX(@NotNull yk p4) throws IOException {
        setCompoundDrawableTintBlendMode(new Object[]{this, p4}, 1228938508, -1228938500, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.zu
    @NotNull
    public final aco setX(@NotNull yk p4, long p10) {
        return (aco) setCompoundDrawableTintBlendMode(new Object[]{this, p4, Long.valueOf(p10)}, -903143, 903144, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.zu
    public final void setCompoundDrawableTintBlendMode() throws IOException {
        setCompoundDrawableTintBlendMode(new Object[]{this}, 753645687, -753645678, System.identityHashCode(this));
    }
}
