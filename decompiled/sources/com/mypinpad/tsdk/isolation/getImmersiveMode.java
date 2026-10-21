package com.mypinpad.tsdk.isolation;

import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.google.pay.GoogleTapAndPay;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.nativesettings.common.Constants;
import com.bbva.zoomauth.facialauth.FacialAuthFragment;
import com.esotericsoftware.asm.Opcodes;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/getImmersiveMode;", "", "", "p0", "Lcom/mypinpad/tsdk/i/setGroupIndicator;", "setOnFocusChangeListener", "(Ljava/lang/String;)Lcom/mypinpad/tsdk/i/setGroupIndicator;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class getImmersiveMode {

    @NotNull
    public static final getImmersiveMode INSTANCE = new getImmersiveMode();

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<JSONObject, component4> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f55883p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55884q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f55885r0 = 1;

        static {
            int i10 = f55884q0;
            int i11 = i10 ^ 25;
            int i12 = (i10 & 25) << 1;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            f55885r0 = i13 % 128;
            int i14 = i13 % 2;
        }

        public a() {
            super(1, finalize.class, "toExceptionFileData", "toExceptionFileData(Lorg/json/JSONObject;)Lcom/mypinpad/softpos/emv/terminal/config/ExceptionFileData;", 1);
        }

        public static /* synthetic */ component4 a(Object[] objArr, int i10, int i11) throws JSONException {
            int i12 = (i11 * 825) + (i10 * 1649);
            int i13 = ~i11;
            if ((((~i10) | i13) * 824) + ((i11 | i10) * (-1648)) + ((i10 | i13) * (-824)) + i12 != 1) {
                JSONObject jSONObject = (JSONObject) objArr[1];
                Intrinsics.checkNotNullParameter(jSONObject, "");
                String string = jSONObject.getString(GoogleTapAndPay.KEY_PAN);
                Intrinsics.checkNotNullExpressionValue(string, "");
                component4 component4Var = new component4(string, setInputType.setCompoundDrawableTintBlendMode(jSONObject, "psn", (String) null, 2, (Object) null));
                int i14 = f55885r0;
                int i15 = ((i14 ^ 90) + ((i14 & 90) << 1)) - 1;
                f55884q0 = i15 % 128;
                int i16 = i15 % 2;
                return component4Var;
            }
            a aVar = (a) objArr[0];
            Object obj = objArr[1];
            int i17 = f55884q0;
            int i18 = i17 & 63;
            int i19 = ((i17 ^ 63) | i18) << 1;
            int i20 = -((i17 | 63) & (~i18));
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            f55885r0 = i21 % 128;
            JSONObject jSONObject2 = (JSONObject) obj;
            if (i21 % 2 != 0) {
                Object[] objArr2 = {aVar, jSONObject2};
                System.identityHashCode(aVar);
                return a(objArr2, 65909139, -65909139);
            }
            System.identityHashCode(aVar);
            a(new Object[]{aVar, jSONObject2}, 65909139, -65909139);
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ component4 invoke(JSONObject jSONObject) {
            Object[] objArr = {this, jSONObject};
            System.identityHashCode(this);
            return a(objArr, 1480361195, -1480361194);
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<JSONObject, setOutlineSpotShadowColor> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f55886p0 = new b();

        static {
            System.currentTimeMillis();
            System.currentTimeMillis();
        }

        public b() {
            super(1, finalize.class, "toPublicKeyConfigData", "toPublicKeyConfigData(Lorg/json/JSONObject;)Lcom/mypinpad/softpos/emv/terminal/config/PublicKeyConfigData;", 1);
        }

        public static /* synthetic */ setOutlineSpotShadowColor a(Object[] objArr, int i10, int i11, int i12) throws JSONException {
            int i13 = (i11 * Opcodes.INSTANCEOF) + (i10 * Opcodes.INSTANCEOF);
            int i14 = ~i12;
            int i15 = ~i10;
            int i16 = (((~(i15 | i11)) | i14) * (-192)) + i13;
            int i17 = ~i11;
            int i18 = i15 | i17;
            int i19 = i14 | i17;
            if ((((~(i10 | i11 | i12)) | (~(i19 | i10)) | (~(i18 | i12))) * 192) + (((~i19) | (~i18)) * (-384)) + i16 == 1) {
                b bVar = (b) objArr[0];
                return a(new Object[]{bVar, (JSONObject) objArr[1]}, -597288829, 597288829, System.identityHashCode(bVar));
            }
            JSONObject jSONObject = (JSONObject) objArr[1];
            Intrinsics.checkNotNullParameter(jSONObject, "");
            byte y7 = setInputType.setY(jSONObject, "hashAlgorithmIndicator");
            byte y10 = setInputType.setY(jSONObject, "publicKeyAlgorithmIndicator");
            String string = jSONObject.getString("modulus");
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = jSONObject.getString("exponent");
            Intrinsics.checkNotNullExpressionValue(string2, "");
            String string3 = jSONObject.getString("expiryDate");
            Intrinsics.checkNotNullExpressionValue(string3, "");
            String string4 = jSONObject.getString(FirebaseAnalytics.Param.INDEX);
            Intrinsics.checkNotNullExpressionValue(string4, "");
            String compoundDrawableTintBlendMode = setInputType.setCompoundDrawableTintBlendMode(jSONObject, "checksum", (String) null, 2, (Object) null);
            String string5 = jSONObject.getString("rId");
            Intrinsics.checkNotNullExpressionValue(string5, "");
            return new setOutlineSpotShadowColor(y7, y10, string, string2, string3, string4, compoundDrawableTintBlendMode, string5);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ setOutlineSpotShadowColor invoke(JSONObject jSONObject) {
            return a(new Object[]{this, jSONObject}, -1530978926, 1530978927, System.identityHashCode(this));
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class c extends FunctionReferenceImpl implements Function1<JSONObject, component7> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f55887p0 = new c();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55888q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f55889r0 = 1;

        static {
            int i10 = f55889r0;
            int i11 = ((i10 ^ 73) - (~((i10 & 73) << 1))) - 1;
            f55888q0 = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        }

        public c() {
            super(1, finalize.class, "toOnlineRequestTagsConfigData", "toOnlineRequestTagsConfigData(Lorg/json/JSONObject;)Lcom/mypinpad/softpos/emv/terminal/config/OnlineRequestTagsConfigData;", 1);
        }

        public static /* synthetic */ component7 a(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * 949) + (i10 * (-947));
            int i14 = ~i10;
            int i15 = ~i11;
            if (((i10 | i15) * 948) + ((~((~i12) | i14 | i15)) * (-948)) + (((~(i15 | i12)) | i14) * (-948)) + i13 == 1) {
                JSONObject jSONObject = (JSONObject) objArr[1];
                Intrinsics.checkNotNullParameter(jSONObject, "");
                component7 component7Var = new component7(setInputType.setOnFocusChangeListener(jSONObject, "genericTags"), setInputType.setOnFocusChangeListener(jSONObject, "kernelTags", finalize.setNavigationOnClickListener.setCompoundDrawableTintBlendMode));
                int i16 = f55888q0;
                int i17 = ((i16 | 125) << 1) - (i16 ^ 125);
                f55889r0 = i17 % 128;
                int i18 = i17 % 2;
                return component7Var;
            }
            c cVar = (c) objArr[0];
            Object obj = objArr[1];
            int i19 = f55888q0 + 1;
            f55889r0 = i19 % 128;
            JSONObject jSONObject2 = (JSONObject) obj;
            if (i19 % 2 == 0) {
                a(new Object[]{cVar, jSONObject2}, 1608408178, -1608408177, System.identityHashCode(cVar));
                throw null;
            }
            component7 component7VarA = a(new Object[]{cVar, jSONObject2}, 1608408178, -1608408177, System.identityHashCode(cVar));
            int i20 = f55889r0;
            int i21 = i20 & 37;
            int i22 = (((i20 | 37) & (~i21)) - (~(i21 << 1))) - 1;
            f55888q0 = i22 % 128;
            if (i22 % 2 == 0) {
                return component7VarA;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ component7 invoke(JSONObject jSONObject) {
            return a(new Object[]{this, jSONObject}, -1930936269, 1930936269, System.identityHashCode(this));
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class d extends FunctionReferenceImpl implements Function1<JSONObject, setTextFilterEnabled> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f55890p0 = new d();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55891q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f55892r0 = 1;

        static {
            int i10 = f55891q0;
            int i11 = i10 ^ 15;
            int i12 = (i10 & 15) << 1;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            f55892r0 = i13 % 128;
            int i14 = i13 % 2;
        }

        public d() {
            super(1, finalize.class, "toRevokedPublicKeyConfigData", "toRevokedPublicKeyConfigData(Lorg/json/JSONObject;)Lcom/mypinpad/softpos/emv/terminal/config/RevokedPublicKeyConfigData;", 1);
        }

        public static /* synthetic */ setTextFilterEnabled a(Object[] objArr, int i10, int i11, int i12) throws JSONException {
            int i13 = ~i11;
            int i14 = ~(i13 | i12);
            int i15 = ~i12;
            if ((((~((~i10) | i12)) | (~(i11 | i15))) * 406) + ((~(i13 | i15 | i10)) * (-406)) + ((i14 | (~(i15 | i10 | i11))) * (-406)) + (i11 * 407) + (i10 * (-405)) != 1) {
                d dVar = (d) objArr[0];
                Object obj = objArr[1];
                int i16 = f55891q0;
                int i17 = i16 & 41;
                int i18 = i17 + ((i16 ^ 41) | i17);
                f55892r0 = i18 % 128;
                int i19 = i18 % 2;
                setTextFilterEnabled settextfilterenabledA = a(new Object[]{dVar, (JSONObject) obj}, -322324006, 322324007, System.identityHashCode(dVar));
                int i20 = f55892r0;
                int i21 = (((i20 ^ 33) | (i20 & 33)) << 1) - (((~i20) & 33) | (i20 & (-34)));
                f55891q0 = i21 % 128;
                int i22 = i21 % 2;
                return settextfilterenabledA;
            }
            JSONObject jSONObject = (JSONObject) objArr[1];
            Intrinsics.checkNotNullParameter(jSONObject, "");
            String string = jSONObject.getString(FirebaseAnalytics.Param.INDEX);
            String string2 = jSONObject.getString("rId");
            List list = (List) setInputType.setOnFocusChangeListener(new Object[]{jSONObject, DigipassManagerConstants.KEY_SERIAL_NUMBER}, -5198295, 5198295, (int) System.currentTimeMillis());
            Intrinsics.checkNotNullExpressionValue(string2, "");
            Intrinsics.checkNotNullExpressionValue(string, "");
            setTextFilterEnabled settextfilterenabled = new setTextFilterEnabled(string2, string, list);
            int i23 = f55891q0;
            int i24 = (-2) - (((i23 ^ 116) + ((i23 & 116) << 1)) ^ (-1));
            f55892r0 = i24 % 128;
            if (i24 % 2 != 0) {
                return settextfilterenabled;
            }
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ setTextFilterEnabled invoke(JSONObject jSONObject) {
            return a(new Object[]{this, jSONObject}, 989728621, -989728621, System.identityHashCode(this));
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class e extends FunctionReferenceImpl implements Function1<JSONObject, PinPadConfiguration> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f55893p0 = new e();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55894q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f55895r0 = 1;

        static {
            int i10 = f55894q0;
            int i11 = ((i10 & 108) + (i10 | 108)) - 1;
            f55895r0 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        }

        public e() {
            super(1, finalize.class, "toKernelConfigData", "toKernelConfigData(Lorg/json/JSONObject;)Lcom/mypinpad/softpos/emv/terminal/config/KernelConfigData;", 1);
        }

        public static /* synthetic */ PinPadConfiguration a(Object[] objArr, int i10, int i11, int i12) throws JSONException {
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int i18 = ~i10;
            int i19 = ((i11 | i18) * (-1434)) + (i11 * 1435) + (i10 * (-716));
            int i20 = ~i12;
            int i21 = ~(i20 | i11);
            int i22 = ~(i10 | i11);
            int i23 = i18 | (~i11);
            if (((i22 | (~(i23 | i20)) | (~(i11 | i12))) * 717) + ((i21 | i22 | (~(i23 | i12))) * 717) + i19 == 1) {
                e eVar = (e) objArr[0];
                Object obj = objArr[1];
                int i24 = f55895r0 + 109;
                f55894q0 = i24 % 128;
                int i25 = i24 % 2;
                PinPadConfiguration pinPadConfigurationA = a(new Object[]{eVar, (JSONObject) obj}, 1573967135, -1573967135, System.identityHashCode(eVar));
                int i26 = f55894q0;
                int i27 = i26 & 1;
                int i28 = (i27 - (~(-(-((i26 ^ 1) | i27))))) - 1;
                f55895r0 = i28 % 128;
                int i29 = i28 % 2;
                return pinPadConfigurationA;
            }
            JSONObject jSONObject = (JSONObject) objArr[1];
            int i30 = f55895r0;
            int i31 = (i30 & (-86)) | ((~i30) & 85);
            int i32 = -(-((i30 & 85) << 1));
            int i33 = (i31 & i32) + (i32 | i31);
            f55894q0 = i33 % 128;
            int i34 = i33 % 2;
            Intrinsics.checkNotNullParameter(jSONObject, "");
            byte bByteValue = ((Byte) setInputType.setOnFocusChangeListener(new Object[]{jSONObject, "kernelId"}, -1498094168, 1498094179, (int) System.currentTimeMillis())).byteValue();
            List list = (List) setInputType.setOnFocusChangeListener(new Object[]{jSONObject, "config", finalize.setCompoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode}, 195668602, -195668594, (int) System.currentTimeMillis());
            List listFlatten = CollectionsKt__IterablesKt.flatten((List) setInputType.setOnFocusChangeListener(new Object[]{jSONObject, Constants.APPLICATION, finalize.setX.setX}, 195668602, -195668594, (int) System.currentTimeMillis()));
            component9 component5Var = null;
            JSONObject jSONObject2 = (JSONObject) setInputType.setOnFocusChangeListener(new Object[]{jSONObject, "kernelConfig", null, 2, null}, -1737187156, 1737187166, 2);
            if (jSONObject2 == null) {
                int i35 = f55895r0;
                int i36 = ((i35 | 51) << 1) - (i35 ^ 51);
                f55894q0 = i36 % 128;
                int i37 = i36 % 2;
                int i38 = (-2) - (((i35 & 66) + (i35 | 66)) ^ (-1));
                f55894q0 = i38 % 128;
                int i39 = i38 % 2;
            } else {
                if (bByteValue == 2) {
                    component5Var = new component3(jSONObject2.getBoolean("spiActivated"));
                    int i40 = f55895r0;
                    i17 = (((i40 | 8) << 1) - (i40 ^ 8)) - 1;
                } else {
                    if (bByteValue == 3) {
                        component5Var = new getClass(jSONObject2.getInt("terminalEntryCapability"), jSONObject2.getBoolean("fddaForOnlineSupported"), jSONObject2.getBoolean("displayAvailableSpendingAmount"), jSONObject2.getBoolean("aucManualCheckSupported"), jSONObject2.getBoolean("aucCashbackCheckSupported"), jSONObject2.getBoolean("exceptionFileEnabled"));
                        int i41 = f55895r0;
                        i15 = i41 & 123;
                        i16 = i41 | 123;
                    } else {
                        if (bByteValue == 4) {
                            boolean z10 = jSONObject2.getBoolean("odaEnabled");
                            String string = jSONObject2.getString("tacDenial");
                            Intrinsics.checkNotNullExpressionValue(string, "");
                            setTextCursorDrawable settextcursordrawable = new setTextCursorDrawable(z10, string, setInputType.setDividerPadding(jSONObject2, "restartTimeout", null, 2, null));
                            int i42 = f55895r0;
                            int i43 = ((i42 ^ 95) | (i42 & 95)) << 1;
                            int i44 = -(((~i42) & 95) | (i42 & (-96)));
                            int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                            f55894q0 = i45 % 128;
                            int i46 = i45 % 2;
                            component5Var = settextcursordrawable;
                        } else if (bByteValue == 6) {
                            component5Var = new component6(jSONObject2.getBoolean("tearingRecoveryEnabled"));
                            int i47 = f55894q0;
                            int i48 = i47 & 83;
                            i17 = ((((i47 ^ 83) | i48) << 1) - (~(-((i47 | 83) & (~i48))))) - 1;
                            f55895r0 = i17 % 128;
                            int i49 = i17 % 2;
                        } else {
                            if (bByteValue == 13) {
                                String string2 = jSONObject2.getString("tacDenial");
                                Intrinsics.checkNotNullExpressionValue(string2, "");
                                String string3 = jSONObject2.getString("defaultTdol");
                                Intrinsics.checkNotNullExpressionValue(string3, "");
                                component5Var = new setOnItemClickListener(string2, string3);
                                int i50 = f55895r0;
                                i13 = i50 ^ 54;
                                i14 = (i50 & 54) << 1;
                            } else if (bByteValue == -15) {
                                String string4 = jSONObject2.getString("tacDenial");
                                Intrinsics.checkNotNullExpressionValue(string4, "");
                                component5Var = new setEdgeEffectColor(string4);
                                int i51 = f55895r0;
                                i15 = i51 & 37;
                                i16 = i51 | 37;
                            } else if (bByteValue == -14) {
                                String string5 = jSONObject2.getString("tacDenial");
                                Intrinsics.checkNotNullExpressionValue(string5, "");
                                component5Var = new component5(string5);
                                int i52 = f55895r0;
                                int i53 = i52 ^ 105;
                                int i54 = -(-((i52 & 105) << 1));
                                int i55 = (i53 & i54) + (i54 | i53);
                                f55894q0 = i55 % 128;
                                int i56 = i55 % 2;
                            } else {
                                int i57 = f55895r0;
                                i13 = i57 & 10;
                                i14 = i57 | 10;
                            }
                            i17 = (i13 + i14) - 1;
                        }
                        int i58 = f55895r0;
                        int i59 = i58 & 93;
                        int i60 = (i58 ^ 93) | i59;
                        int i61 = ((i59 | i60) << 1) - (i60 ^ i59);
                        f55894q0 = i61 % 128;
                        int i62 = i61 % 2;
                    }
                    i17 = i15 + i16;
                }
                f55894q0 = i17 % 128;
                int i410 = i17 % 2;
                int i510 = f55895r0;
                int i511 = i510 & 93;
                int i63 = (i510 ^ 93) | i511;
                int i64 = ((i511 | i63) << 1) - (i63 ^ i511);
                f55894q0 = i64 % 128;
                int i65 = i64 % 2;
            }
            PinPadConfiguration pinPadConfiguration = new PinPadConfiguration(bByteValue, component5Var, list, listFlatten);
            int i66 = f55895r0;
            int i67 = ((i66 | 97) << 1) - (i66 ^ 97);
            f55894q0 = i67 % 128;
            if (i67 % 2 == 0) {
                return pinPadConfiguration;
            }
            int i68 = 87 / 0;
            return pinPadConfiguration;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ PinPadConfiguration invoke(JSONObject jSONObject) {
            return a(new Object[]{this, jSONObject}, -1216411069, 1216411070, System.identityHashCode(this));
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class f extends FunctionReferenceImpl implements Function1<JSONObject, getAmount> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final f f55896p0 = new f();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final int f55897q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f55898r0 = 1;

        static {
            int i10 = f55898r0;
            int i11 = (i10 | 29) << 1;
            int i12 = -(i10 ^ 29);
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            f55897q0 = i13 % 128;
            int i14 = i13 % 2;
        }

        public f() {
            super(1, finalize.class, "toTlvConfigData", "toTlvConfigData(Lorg/json/JSONObject;)Lcom/mypinpad/softpos/emv/terminal/config/TlvConfigData;", 1);
        }

        public static /* synthetic */ getAmount a(Object[] objArr, int i10, int i11, int i12) throws JSONException {
            int i13 = ~i12;
            int i14 = ((i10 | i13) * (-757)) + (i11 * (-756)) + (i10 * 758);
            int i15 = ~i11;
            int i16 = (((~(i10 | i11 | i12)) | (~(i13 | i15)) | (~((~i10) | i15))) * 757) + ((~(i15 | i10 | i12)) * 1514) + i14;
            int i17 = f55897q0;
            if (i16 != 1) {
                JSONObject jSONObject = (JSONObject) objArr[1];
                Intrinsics.checkNotNullParameter(jSONObject, "");
                String string = jSONObject.getString(LogKeysKt.TAG);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = jSONObject.getString("value");
                Intrinsics.checkNotNullExpressionValue(string2, "");
                getAmount getamount = new getAmount(string, string2);
                int i18 = i17 & 95;
                int i19 = i18 + ((i17 ^ 95) | i18);
                f55898r0 = i19 % 128;
                int i20 = i19 % 2;
                return getamount;
            }
            f fVar = (f) objArr[0];
            Object obj = objArr[1];
            int i21 = i17 & 99;
            int i22 = (i21 - (~(-(-((i17 ^ 99) | i21))))) - 1;
            f55898r0 = i22 % 128;
            JSONObject jSONObject2 = (JSONObject) obj;
            Object[] objArr2 = new Object[2];
            if (i22 % 2 != 0) {
                objArr2[0] = fVar;
                objArr2[1] = jSONObject2;
                return a(objArr2, 1140190135, -1140190135, System.identityHashCode(fVar));
            }
            objArr2[0] = fVar;
            objArr2[1] = jSONObject2;
            a(objArr2, 1140190135, -1140190135, System.identityHashCode(fVar));
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ getAmount invoke(JSONObject jSONObject) {
            return a(new Object[]{this, jSONObject}, -494886753, 494886754, System.identityHashCode(this));
        }
    }

    static {
        int i10 = 45 & (~0);
        int i11 = -(-0);
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        int i13 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        String str = (String) objArr[0];
        Intrinsics.checkNotNullParameter(str, "");
        JSONObject jSONObject = new JSONObject(str);
        return new setGroupIndicator(setInputType.setOnFocusChangeListener(jSONObject, "terminal", f.f55896p0), setInputType.setOnFocusChangeListener(jSONObject, "kernel", e.f55893p0), setInputType.setOnFocusChangeListener(jSONObject, "exceptionFile", a.f55883p0), setInputType.setOnFocusChangeListener(jSONObject, FacialAuthFragment.PUBLIC_KEY, b.f55886p0), setInputType.setOnFocusChangeListener(jSONObject, "revokedPublicKey", d.f55890p0), (component7) setInputType.setDividerPadding(jSONObject, "onlineRequestTags", c.f55887p0));
    }

    @NotNull
    public static setGroupIndicator setOnFocusChangeListener(@NotNull String p4) {
        return (setGroupIndicator) setDividerPadding(new Object[]{p4}, -822279764, 822279764, (int) System.currentTimeMillis());
    }
}
