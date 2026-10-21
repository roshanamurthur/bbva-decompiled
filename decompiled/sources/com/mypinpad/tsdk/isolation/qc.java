package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001'B)\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J,\u0010\u0010\u001a\u00020\u000f2$\u0010\u000e\u001a \u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nj\u0004\u0018\u0001`\f0\tj\u0002`\rJ\u0010\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0011J\f\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/mypinpad/tsdk/internal/remote/OAuthTokenManager;", "", "Lcom/mypinpad/tsdk/internal/remote/OAuthTokenResult;", "checkCachedToken", "", "expireIn", "", "getExpireTimestampInSecond", "refreshOAuthToken", "Lkotlin/Function0;", "Lkotlin/Pair;", "", "Lcom/mypinpad/tsdk/internal/remote/ProxySetting;", "Lcom/mypinpad/tsdk/internal/remote/ProxyProvider;", "proxyProvider", "", "setProxyProvider", "Lcom/mypinpad/tsdk/internal/remote/TokenRefreshLogic;", "refresh", "token", "Lcom/mypinpad/tsdk/internal/remote/oauth/OAuthToken;", "", "hasExpired", "Lcom/mypinpad/tsdk/internal/remote/TokenManagerCache;", "cache", "Lcom/mypinpad/tsdk/internal/remote/TokenManagerCache;", "Lcom/mypinpad/tsdk/internal/utils/EndpointUtils$IdentityEndpointType;", "identityEndpointType", "Lcom/mypinpad/tsdk/internal/utils/EndpointUtils$IdentityEndpointType;", "Lcom/mypinpad/tsdk/internal/remote/oauth/IdentityService;", "identityService", "Lcom/mypinpad/tsdk/internal/remote/oauth/IdentityService;", "Lcom/mypinpad/tsdk/internal/sdk/models/authorization/SdkAuthorizationGrant;", "sdkAuthorizationGrant", "Lcom/mypinpad/tsdk/internal/sdk/models/authorization/SdkAuthorizationGrant;", "getSdkAuthorizationGrant$sdk_android_release", "()Lcom/mypinpad/tsdk/internal/sdk/models/authorization/SdkAuthorizationGrant;", "<init>", "(Lcom/mypinpad/tsdk/internal/remote/oauth/IdentityService;Lcom/mypinpad/tsdk/internal/sdk/models/authorization/SdkAuthorizationGrant;Lcom/mypinpad/tsdk/internal/utils/EndpointUtils$IdentityEndpointType;Lcom/mypinpad/tsdk/internal/remote/TokenManagerCache;)V", "Companion", "sdk-android_release"}, k = 1, mv = {1, 8, 0})
public final class qc {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f57837e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f57838f = 1;

    @NotNull
    public static final setOnFocusChangeListener setX = new setOnFocusChangeListener(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final qu f57839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final sr f57840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final um.setX f57841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final qq f57842d;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/mypinpad/tsdk/i/qh;", "setOnFocusChangeListener", "()Lcom/mypinpad/tsdk/i/qh;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends Lambda implements Function0<qh> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f57843q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f57844r0 = 1;

        public a() {
            super(0);
        }

        public static /* synthetic */ qh a(Object[] objArr, int i10, int i11, int i12) {
            if ((((~(i10 | (~i12))) | (~i11)) * 305) + (((~(i10 | i11)) | (~(i10 | i12))) * 305) + (i11 * 306) + (i10 * 306) + TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS == 1) {
                a aVar = (a) objArr[0];
                int i13 = f57844r0;
                int i14 = (i13 & 59) + (i13 | 59);
                f57843q0 = i14 % 128;
                if (i14 % 2 != 0) {
                    a(new Object[]{aVar}, 1498914687, -1498914687, System.identityHashCode(aVar));
                    throw null;
                }
                qh qhVarA = a(new Object[]{aVar}, 1498914687, -1498914687, System.identityHashCode(aVar));
                int i15 = f57843q0;
                int i16 = (i15 & (-58)) | ((~i15) & 57);
                int i17 = (i15 & 57) << 1;
                int i18 = (i16 & i17) + (i17 | i16);
                f57844r0 = i18 % 128;
                int i19 = i18 % 2;
                return qhVarA;
            }
            a aVar2 = (a) objArr[0];
            int iIdentityHashCode = System.identityHashCode(aVar2);
            int i20 = ~iIdentityHashCode;
            int i21 = i20 ^ (-1333948231);
            int i22 = (-1333948231) & i20;
            int i23 = ~((i21 & i22) | (i21 ^ i22));
            int i24 = 1325410884 ^ i23;
            int i25 = i23 & 1325410884;
            int i26 = -(-(((i25 & i24) | (i24 ^ i25)) * (-1188)));
            int i27 = (-1103426071) & i26;
            int i28 = (((i26 | (-1103426071)) & (~i27)) - (~(i27 << 1))) - 1;
            int i29 = 1333948230 & iIdentityHashCode;
            int i30 = (iIdentityHashCode | 1333948230) & (~i29);
            int i31 = ~((i30 & i29) | (i30 ^ i29));
            int i32 = 1325410884 ^ i31;
            int i33 = i31 & 1325410884;
            int i34 = (i33 & i32) | (i32 ^ i33);
            int i35 = i20 & 1870150396;
            int i36 = ~((i20 ^ 1870150396) | i35);
            int i37 = i34 & i36;
            int i38 = (i34 | i36) & (~i37);
            int i39 = ((i38 & i37) | (i38 ^ i37)) * 594;
            int i40 = ((((~i39) & i28) | ((~i28) & i39)) - (~(-(-((i39 & i28) << 1))))) - 1;
            int i41 = ((~i20) & 1333948230) | i22;
            int i42 = 1333948230 & i20;
            int i43 = (i41 & i42) | (i41 ^ i42);
            int i44 = ~i43;
            int i45 = (i43 | i44) & i44;
            int i46 = (1878687742 & i45) | ((~i45) & (-1878687743));
            int i47 = i45 & (-1878687743);
            int i48 = (i47 & i46) | (i46 ^ i47);
            int i49 = (i20 | 1870150396) & (~i35);
            int i50 = ~((i49 & i35) | (i49 ^ i35));
            int i51 = i48 & i50;
            int i52 = (i48 | i50) & (~i51);
            int i53 = -(-(((i52 & i51) | (i52 ^ i51)) * 594));
            int i54 = i40 & i53;
            int i55 = -(-((i53 ^ i40) | i54));
            int i56 = (i54 & i55) + (i55 | i54);
            int iIdentityHashCode2 = System.identityHashCode(aVar2);
            int i57 = ~iIdentityHashCode2;
            int i58 = (1995962303 & i57) | ((~i57) & (-1995962304));
            int i59 = i57 & (-1995962304);
            int i60 = (i58 & i59) | (i58 ^ i59);
            int i61 = ((-67236993) & i60) | ((~i60) & 67236992);
            int i62 = i60 & 67236992;
            int i63 = ((i62 & i61) | (i61 ^ i62)) * 1444;
            int i64 = 1508008721 & i63;
            int i65 = (i63 ^ 1508008721) | i64;
            int i66 = (i64 & i65) + (i65 | i64);
            int i67 = (-72610990) & iIdentityHashCode2;
            int i68 = ((-72610990) | iIdentityHashCode2) & (~i67);
            int i69 = ~((i68 & i67) | (i68 ^ i67));
            int i70 = 67236992 & i69;
            int i71 = (i69 | 67236992) & (~i70);
            int i72 = (i71 & i70) | (i71 ^ i70);
            int i73 = ~((iIdentityHashCode2 & (-1990588307)) | (i57 & (-1990588307)) | (1990588306 & iIdentityHashCode2));
            int i74 = ((i73 & i72) | (i72 ^ i73)) * (-1444);
            int i75 = i66 ^ i74;
            int i76 = -(-((i74 & i66) << 1));
            int i77 = ((i75 ^ i76) + ((i76 & i75) << 1)) - (-970270638);
            qc qcVar = qc.this;
            if (i56 > i77) {
                return (qh) qc.setDividerPadding(new Object[]{qcVar}, -807870203, 807870209, (int) System.currentTimeMillis());
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ qh invoke() {
            return a(new Object[]{this}, -384305025, 384305026, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/qc$setOnFocusChangeListener;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class setOnFocusChangeListener {
        public setOnFocusChangeListener() {
        }

        public /* synthetic */ setOnFocusChangeListener(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i10 = f57837e;
        int i11 = i10 ^ 75;
        int i12 = (i10 & 75) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f57838f = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    public qc(qu quVar, sr srVar, um.setX setx, qq qqVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        qqVar = (i10 & 8) != 0 ? new qb() : qqVar;
        Intrinsics.checkNotNullParameter(quVar, "");
        Intrinsics.checkNotNullParameter(srVar, "");
        Intrinsics.checkNotNullParameter(setx, "");
        Intrinsics.checkNotNullParameter(qqVar, "");
        this.f57839a = quVar;
        this.f57840b = srVar;
        this.f57841c = setx;
        this.f57842d = qqVar;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:57:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x02af  */
    /* JADX WARN: Code duplicated, block: B:60:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object qfVar;
        Object qdVar;
        Object objM5535constructorimpl;
        Throwable thM5538exceptionOrNullimpl;
        qu.setY sety;
        int i13 = ~((~i10) | i11);
        int i14 = ~i12;
        int i15 = (((~(i14 | i11)) | i13) * (-1188)) + (i11 * (-1187)) + (i10 * 595);
        int i16 = ~i11;
        int i17 = (~(i12 | i16)) | i13;
        int i18 = ~(i14 | i10);
        switch ((((~(i10 | i16)) | (~(i16 | i14)) | i18) * 594) + ((i17 | i18) * 594) + i15) {
            case 1:
                qc qcVar = (qc) objArr[0];
                int i19 = f57837e;
                int i20 = ((i19 | 79) << 1) - (i19 ^ 79);
                f57838f = i20 % 128;
                int i21 = i20 % 2;
                qx x4 = qcVar.f57842d.setX();
                if (x4 != null) {
                    if (!((Boolean) setDividerPadding(new Object[]{x4}, 1535040248, -1535040248, (int) System.currentTimeMillis())).booleanValue()) {
                        qfVar = new qf(x4);
                        int i22 = f57838f;
                        int i23 = i22 & 115;
                        int i24 = (i22 ^ 115) | i23;
                        int i25 = (i23 & i24) + (i24 | i23);
                        f57837e = i25 % 128;
                        if (i25 % 2 != 0) {
                            int i26 = 86 / 0;
                        }
                    } else {
                        mu.setCompoundDrawableTintBlendMode(new Object[]{170001, null, null, 6}, -1968587119, 1968587120, 170001);
                        qdVar = new qd(qd.setDividerPadding.setY, null, 2, null);
                        int i27 = f57838f;
                        int i28 = i27 & 7;
                        int i29 = (((i27 | 7) & (~i28)) - (~(i28 << 1))) - 1;
                        f57837e = i29 % 128;
                        int i30 = i29 % 2;
                    }
                    break;
                } else {
                    mu.setCompoundDrawableTintBlendMode(new Object[]{170000, null, null, 6}, -1968587119, 1968587120, 170000);
                    qdVar = new qd(qd.setDividerPadding.setCompoundDrawableTintBlendMode, null, 2, null);
                    int i31 = f57837e + 11;
                    f57838f = i31 % 128;
                    if (i31 % 2 == 0) {
                        throw null;
                    }
                }
                return qdVar;
            case 2:
                qc qcVar2 = (qc) objArr[0];
                int i32 = f57837e;
                int i33 = ((i32 | 100) << 1) - (i32 ^ 100);
                int i34 = (i33 ^ (-1)) + (i33 << 1);
                f57838f = i34 % 128;
                int i35 = i34 % 2;
                qh onFocusChangeListener = qcVar2.setOnFocusChangeListener(qs.setDividerPadding);
                int i36 = f57837e;
                int i37 = (i36 & (-6)) | ((~i36) & 5);
                int i38 = -(-((i36 & 5) << 1));
                int i39 = (i37 & i38) + (i38 | i37);
                f57838f = i39 % 128;
                int i40 = i39 % 2;
                return onFocusChangeListener;
            case 3:
                qc qcVar3 = (qc) objArr[0];
                mu.setCompoundDrawableTintBlendMode(new Object[]{170002, null, null, 6}, -1968587119, 1968587120, 170002);
                sr srVar = qcVar3.f57840b;
                if (srVar instanceof st) {
                    st stVar = (st) srVar;
                    if (((String) st.setCompoundDrawableTintBlendMode(new Object[]{stVar}, -1813715722, 1813715722, System.identityHashCode(stVar))).length() != 0) {
                        st stVar2 = (st) srVar;
                        if (((String) st.setCompoundDrawableTintBlendMode(new Object[]{stVar2}, 1827932406, -1827932405, System.identityHashCode(stVar2))).length() != 0) {
                            try {
                                Result.Companion companion = Result.INSTANCE;
                                objM5535constructorimpl = Result.m5535constructorimpl(qcVar3.f57839a.setCompoundDrawableTintBlendMode(srVar));
                            } catch (Throwable th2) {
                                Result.Companion companion2 = Result.INSTANCE;
                                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
                            }
                            thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                            if (thM5538exceptionOrNullimpl == null) {
                                ResultKt.throwOnFailure(objM5535constructorimpl);
                                sety = (qu.setY) objM5535constructorimpl;
                                if (((String) qu.setY.setX(new Object[]{sety}, 1158246745, -1158246745, System.identityHashCode(sety))) != null || ((String) qu.setY.setX(new Object[]{sety}, 1437643985, -1437643983, System.identityHashCode(sety))) == null || ((Integer) qu.setY.setX(new Object[]{sety}, -774643003, 774643004, System.identityHashCode(sety))) == null) {
                                    qdVar = new qd(qd.setDividerPadding.setDividerPadding, null, 2, null);
                                } else {
                                    try {
                                        String str = (String) qu.setY.setX(new Object[]{sety}, 1158246745, -1158246745, System.identityHashCode(sety));
                                        String str2 = (String) qu.setY.setX(new Object[]{sety}, 1437643985, -1437643983, System.identityHashCode(sety));
                                        int iIntValue = ((Integer) qu.setY.setX(new Object[]{sety}, -774643003, 774643004, System.identityHashCode(sety))).intValue();
                                        qx qxVar = new qx(str, str2, ((Long) setDividerPadding(new Object[]{Integer.valueOf(iIntValue)}, 2125920380, -2125920376, iIntValue)).longValue(), qcVar3.f57841c);
                                        qcVar3.f57842d.setCompoundDrawableTintBlendMode(qxVar);
                                        qdVar = new qf(qxVar);
                                    } catch (Exception e5) {
                                        qfVar = new qd(qd.setDividerPadding.setX, e5);
                                    }
                                }
                            } else {
                                qdVar = new qd(qd.setDividerPadding.setOnFocusChangeListener, thM5538exceptionOrNullimpl instanceof Exception ? (Exception) thM5538exceptionOrNullimpl : null);
                            }
                            break;
                        }
                    }
                    qdVar = new qd(qd.setDividerPadding.setNavigationOnClickListener, null, 2, null);
                } else {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM5535constructorimpl = Result.m5535constructorimpl(qcVar3.f57839a.setCompoundDrawableTintBlendMode(srVar));
                    thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                    if (thM5538exceptionOrNullimpl == null) {
                        ResultKt.throwOnFailure(objM5535constructorimpl);
                        sety = (qu.setY) objM5535constructorimpl;
                        if (((String) qu.setY.setX(new Object[]{sety}, 1158246745, -1158246745, System.identityHashCode(sety))) != null) {
                            qdVar = new qd(qd.setDividerPadding.setDividerPadding, null, 2, null);
                        } else {
                            qdVar = new qd(qd.setDividerPadding.setDividerPadding, null, 2, null);
                        }
                    } else {
                        qdVar = new qd(qd.setDividerPadding.setOnFocusChangeListener, thM5538exceptionOrNullimpl instanceof Exception ? (Exception) thM5538exceptionOrNullimpl : null);
                    }
                }
                return qdVar;
            case 4:
                int iIntValue2 = ((Number) objArr[0]).intValue();
                int i41 = f57837e + 85;
                f57838f = i41 % 128;
                long jLongValue = ((Long) (i41 % 2 == 0 ? uu.setY(new Object[0], 2036213809, -2036213809, (int) System.currentTimeMillis()) : uu.setY(new Object[0], 2036213809, -2036213809, (int) System.currentTimeMillis()))).longValue() + ((long) iIntValue2);
                int i42 = f57837e;
                int i43 = i42 & 27;
                int i44 = i42 | 27;
                int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                f57838f = i45 % 128;
                if (i45 % 2 == 0) {
                    int i46 = 4 / 0;
                }
                qdVar = Long.valueOf(jLongValue);
                return qdVar;
            case 5:
                qc qcVar4 = (qc) objArr[0];
                Function0<Pair<String, Integer>> function0 = (Function0) objArr[1];
                int i47 = f57837e + 79;
                f57838f = i47 % 128;
                int i48 = i47 % 2;
                Intrinsics.checkNotNullParameter(function0, "");
                qcVar4.f57839a.setY(function0);
                int i49 = f57838f + 15;
                f57837e = i49 % 128;
                int i50 = i49 % 2;
                return null;
            case 6:
                qc qcVar5 = (qc) objArr[0];
                int i51 = f57837e;
                int i52 = i51 & 121;
                int i53 = (i52 - (~(-(-((i51 ^ 121) | i52))))) - 1;
                f57838f = i53 % 128;
                if (i53 % 2 == 0) {
                    qdVar = (qh) setDividerPadding(new Object[]{qcVar5}, 18042570, -18042567, System.identityHashCode(qcVar5));
                    int i54 = 77 / 0;
                } else {
                    qdVar = (qh) setDividerPadding(new Object[]{qcVar5}, 18042570, -18042567, System.identityHashCode(qcVar5));
                }
                return qdVar;
            default:
                qx qxVar2 = (qx) objArr[0];
                int i55 = f57837e + 91;
                f57838f = i55 % 128;
                if (i55 % 2 != 0 ? ((Long) uu.setY(new Object[0], 2036213809, -2036213809, (int) System.currentTimeMillis())).longValue() + 30 <= qxVar2.setY() : ((Long) uu.setY(new Object[0], 2036213809, -2036213809, (int) System.currentTimeMillis())).longValue() - 30 <= qxVar2.setY()) {
                    int i56 = f57837e;
                    int i57 = i56 & 121;
                    int i58 = (i56 | 121) & (~i57);
                    int i59 = -(-(i57 << 1));
                    int i60 = (i58 ^ i59) + ((i58 & i59) << 1);
                    f57838f = i60 % 128;
                    int i61 = i60 % 2;
                    qdVar = Boolean.FALSE;
                } else {
                    int i62 = f57838f;
                    int i63 = ((i62 ^ 67) | (i62 & 67)) << 1;
                    int i64 = -(((~i62) & 67) | (i62 & (-68)));
                    int i65 = (i63 & i64) + (i64 | i63);
                    f57837e = i65 % 128;
                    if (i65 % 2 != 0) {
                        throw null;
                    }
                    qdVar = Boolean.TRUE;
                }
                return qdVar;
        }
        return qfVar;
    }

    public static final /* synthetic */ qh setX(qc qcVar) {
        return (qh) setDividerPadding(new Object[]{qcVar}, -807870203, 807870209, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ qh setY(qc qcVar) {
        return (qh) setDividerPadding(new Object[]{qcVar}, 762387121, -762387119, (int) System.currentTimeMillis());
    }

    @NotNull
    public final synchronized qh setOnFocusChangeListener(@NotNull qs qsVar) {
        qh qhVar;
        Intrinsics.checkNotNullParameter(qsVar, "");
        qhVar = (qh) pz.setCompoundDrawableTintBlendMode(new Object[]{(qh) setDividerPadding(new Object[]{this}, -1739062669, 1739062670, System.identityHashCode(this)), qsVar, new a()}, -247485112, 247485112, (int) System.currentTimeMillis());
        int i10 = f57837e + 15;
        f57838f = i10 % 128;
        int i11 = i10 % 2;
        return qhVar;
    }

    public final void setX(@NotNull Function0<Pair<String, Integer>> function0) {
        setDividerPadding(new Object[]{this, function0}, -2080515178, 2080515183, System.identityHashCode(this));
    }
}
