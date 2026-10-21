package com.mypinpad.tsdk.isolation;

import com.adobe.marketing.mobile.EventDataKeys;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.ArrayList;
import java.util.Iterator;
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
public final class finalize {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class setCompoundDrawableTintBlendMode extends FunctionReferenceImpl implements Function1<JSONObject, getAmount> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static int f55535p0 = 0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55536q0 = 1;
        public static final setCompoundDrawableTintBlendMode setCompoundDrawableTintBlendMode = new setCompoundDrawableTintBlendMode();

        static {
            int i10 = f55535p0;
            int i11 = (i10 & (-24)) | ((~i10) & 23);
            int i12 = (i10 & 23) << 1;
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            f55536q0 = i13 % 128;
            int i14 = i13 % 2;
        }

        public setCompoundDrawableTintBlendMode() {
            super(1, finalize.class, "toTlvConfigData", "toTlvConfigData(Lorg/json/JSONObject;)Lcom/mypinpad/softpos/emv/terminal/config/TlvConfigData;", 1);
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws JSONException {
            int i13 = (~i10) | (~i12);
            if (((i10 | (~(i11 | i12))) * 519) + (((~(i13 | i11)) | (~(i10 | i11 | i12))) * (-519)) + (((~i13) | i11) * 519) + (i11 * (-518)) + (i10 * (-518)) != 1) {
                setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = (setCompoundDrawableTintBlendMode) objArr[0];
                Object obj = objArr[1];
                int i14 = f55535p0;
                int i15 = i14 & 7;
                int i16 = (i14 ^ 7) | i15;
                int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
                f55536q0 = i17 % 128;
                int i18 = i17 % 2;
                getAmount getamount = (getAmount) setDividerPadding(new Object[]{setcompounddrawabletintblendmode, (JSONObject) obj}, -602587565, 602587566, System.identityHashCode(setcompounddrawabletintblendmode));
                int i19 = f55536q0;
                int i20 = ((i19 ^ 113) | (i19 & 113)) << 1;
                int i21 = -(((~i19) & 113) | (i19 & (-114)));
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                f55535p0 = i22 % 128;
                int i23 = i22 % 2;
                return getamount;
            }
            JSONObject jSONObject = (JSONObject) objArr[1];
            Intrinsics.checkNotNullParameter(jSONObject, "");
            String string = jSONObject.getString(LogKeysKt.TAG);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = jSONObject.getString("value");
            Intrinsics.checkNotNullExpressionValue(string2, "");
            getAmount getamount2 = new getAmount(string, string2);
            int i24 = f55535p0;
            int i25 = (i24 & (-32)) | ((~i24) & 31);
            int i26 = -(-((i24 & 31) << 1));
            int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
            f55536q0 = i27 % 128;
            if (i27 % 2 == 0) {
                int i28 = 31 / 0;
            }
            return getamount2;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [com.mypinpad.tsdk.i.getAmount, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ getAmount invoke(JSONObject jSONObject) {
            return setDividerPadding(new Object[]{this, jSONObject}, 1759873565, -1759873565, System.identityHashCode(this));
        }

        @NotNull
        public final getAmount setOnFocusChangeListener(@NotNull JSONObject jSONObject) {
            return (getAmount) setDividerPadding(new Object[]{this, jSONObject}, -602587565, 602587566, System.identityHashCode(this));
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class setDividerPadding extends FunctionReferenceImpl implements Function1<JSONObject, getAmount> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static int f55537p0 = 0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55538q0 = 1;
        public static final setDividerPadding setX = new setDividerPadding();

        static {
            int i10 = f55538q0 + 111;
            f55537p0 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 18 / 0;
            }
        }

        public setDividerPadding() {
            super(1, finalize.class, "toTlvConfigData", "toTlvConfigData(Lorg/json/JSONObject;)Lcom/mypinpad/softpos/emv/terminal/config/TlvConfigData;", 1);
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws JSONException {
            int i13 = ~i12;
            int i14 = ~(i13 | i10);
            int i15 = ((i11 | i14) * 764) + (i11 * (-1527)) + (i10 * 765);
            int i16 = ~((~i10) | i11);
            if ((((~(i10 | (~i11))) | i16 | i14) * 764) + (((~(i13 | i11)) | i16) * (-1528)) + i15 == 1) {
                JSONObject jSONObject = (JSONObject) objArr[1];
                Intrinsics.checkNotNullParameter(jSONObject, "");
                String string = jSONObject.getString(LogKeysKt.TAG);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = jSONObject.getString("value");
                Intrinsics.checkNotNullExpressionValue(string2, "");
                getAmount getamount = new getAmount(string, string2);
                int i17 = f55538q0 + 29;
                f55537p0 = i17 % 128;
                int i18 = i17 % 2;
                return getamount;
            }
            setDividerPadding setdividerpadding = (setDividerPadding) objArr[0];
            Object obj = objArr[1];
            int i19 = f55537p0;
            int i20 = i19 & 27;
            int i21 = i20 + ((i19 ^ 27) | i20);
            f55538q0 = i21 % 128;
            JSONObject jSONObject2 = (JSONObject) obj;
            if (i21 % 2 == 0) {
                throw null;
            }
            getAmount getamount2 = (getAmount) setCompoundDrawableTintBlendMode(new Object[]{setdividerpadding, jSONObject2}, 1762682553, -1762682552, System.identityHashCode(setdividerpadding));
            int i22 = f55538q0 + 17;
            f55537p0 = i22 % 128;
            if (i22 % 2 == 0) {
                return getamount2;
            }
            throw null;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [com.mypinpad.tsdk.i.getAmount, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ getAmount invoke(JSONObject jSONObject) {
            return setCompoundDrawableTintBlendMode(new Object[]{this, jSONObject}, -1850590348, 1850590348, System.identityHashCode(this));
        }

        @NotNull
        public final getAmount setX(@NotNull JSONObject jSONObject) {
            return (getAmount) setCompoundDrawableTintBlendMode(new Object[]{this, jSONObject}, 1762682553, -1762682552, System.identityHashCode(this));
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class setNavigationOnClickListener extends FunctionReferenceImpl implements Function1<JSONObject, component8> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static int f55539p0 = 0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55540q0 = 1;
        public static final setNavigationOnClickListener setCompoundDrawableTintBlendMode = new setNavigationOnClickListener();

        static {
            int i10 = f55539p0 + 1;
            f55540q0 = i10 % 128;
            int i11 = i10 % 2;
        }

        public setNavigationOnClickListener() {
            super(1, finalize.class, "toKernelTagsConfigData", "toKernelTagsConfigData(Lorg/json/JSONObject;)Lcom/mypinpad/softpos/emv/terminal/config/KernelTagsConfigData;", 1);
        }

        public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
            int i13 = (i11 * (-864)) + (i10 * 866);
            int i14 = ~i11;
            int i15 = ~i10;
            int i16 = ~i12;
            if ((((~(i10 | i16)) | (~(i14 | i16))) * 865) + ((~(i12 | i10)) * 865) + (((~(i15 | i16)) | i14) * (-865)) + i13 == 1) {
                JSONObject jSONObject = (JSONObject) objArr[1];
                Intrinsics.checkNotNullParameter(jSONObject, "");
                component8 component8Var = new component8(setInputType.setY(jSONObject, "kernelId"), setInputType.setOnFocusChangeListener(jSONObject, k.a.f65040g));
                int i17 = f55540q0;
                int i18 = (((i17 & (-52)) | ((~i17) & 51)) - (~(-(-((i17 & 51) << 1))))) - 1;
                f55539p0 = i18 % 128;
                int i19 = i18 % 2;
                return component8Var;
            }
            setNavigationOnClickListener setnavigationonclicklistener = (setNavigationOnClickListener) objArr[0];
            Object obj = objArr[1];
            int i20 = f55539p0;
            int i21 = (i20 & (-120)) | ((~i20) & 119);
            int i22 = (i20 & 119) << 1;
            int i23 = (i21 & i22) + (i22 | i21);
            f55540q0 = i23 % 128;
            JSONObject jSONObject2 = (JSONObject) obj;
            if (i23 % 2 == 0) {
                throw null;
            }
            component8 component8Var2 = (component8) setY(new Object[]{setnavigationonclicklistener, jSONObject2}, -1916696407, 1916696408, System.identityHashCode(setnavigationonclicklistener));
            int i24 = f55540q0;
            int i25 = ((i24 & (-40)) | ((~i24) & 39)) + ((i24 & 39) << 1);
            f55539p0 = i25 % 128;
            if (i25 % 2 == 0) {
                return component8Var2;
            }
            throw null;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [com.mypinpad.tsdk.i.component8, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ component8 invoke(JSONObject jSONObject) {
            return setY(new Object[]{this, jSONObject}, -184809943, 184809943, System.identityHashCode(this));
        }

        @NotNull
        public final component8 setDividerPadding(@NotNull JSONObject jSONObject) {
            return (component8) setY(new Object[]{this, jSONObject}, -1916696407, 1916696408, System.identityHashCode(this));
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class setOnFocusChangeListener extends FunctionReferenceImpl implements Function1<JSONObject, getAmount> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final int f55541p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55542q0 = 1;
        public static final setOnFocusChangeListener setOnFocusChangeListener = new setOnFocusChangeListener();

        static {
            int i10 = f55542q0 + 123;
            f55541p0 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        public setOnFocusChangeListener() {
            super(1, finalize.class, "toTlvConfigData", "toTlvConfigData(Lorg/json/JSONObject;)Lcom/mypinpad/softpos/emv/terminal/config/TlvConfigData;", 1);
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws JSONException {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = ~i12;
            int i16 = (((~(i10 | i11)) | (~(i15 | i10)) | (~(i13 | i14))) * 184) + ((i10 | i14 | i15) * 184) + ((i11 | i13) * (-368)) + (i11 * 185) + (i10 * (-183));
            int i17 = f55541p0;
            if (i16 != 1) {
                setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
                Object obj = objArr[1];
                System.identityHashCode(setonfocuschangelistener);
                System.identityHashCode(setonfocuschangelistener);
                getAmount getamount = (getAmount) setDividerPadding(new Object[]{setonfocuschangelistener, (JSONObject) obj}, 245570194, -245570193, System.identityHashCode(setonfocuschangelistener));
                int i18 = i17 + 89;
                f55542q0 = i18 % 128;
                if (i18 % 2 != 0) {
                    return getamount;
                }
                int i19 = 5 / 0;
                return getamount;
            }
            JSONObject jSONObject = (JSONObject) objArr[1];
            Intrinsics.checkNotNullParameter(jSONObject, "");
            String string = jSONObject.getString(LogKeysKt.TAG);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = jSONObject.getString("value");
            Intrinsics.checkNotNullExpressionValue(string2, "");
            getAmount getamount2 = new getAmount(string, string2);
            int i20 = ((i17 | 67) << 1) - (i17 ^ 67);
            f55542q0 = i20 % 128;
            int i21 = i20 % 2;
            return getamount2;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [com.mypinpad.tsdk.i.getAmount, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ getAmount invoke(JSONObject jSONObject) {
            return setDividerPadding(new Object[]{this, jSONObject}, 1819866337, -1819866337, System.identityHashCode(this));
        }

        @NotNull
        public final getAmount setCompoundDrawableTintBlendMode(@NotNull JSONObject jSONObject) {
            return (getAmount) setDividerPadding(new Object[]{this, jSONObject}, 245570194, -245570193, System.identityHashCode(this));
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class setX extends FunctionReferenceImpl implements Function1<JSONObject, List<? extends setFirstBaselineToTopHeight>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static int f55545p0 = 0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55546q0 = 1;
        public static final setX setX = new setX();

        static {
            int i10 = f55545p0;
            int i11 = ((i10 | 85) << 1) - (i10 ^ 85);
            f55546q0 = i11 % 128;
            int i12 = i11 % 2;
        }

        public setX() {
            super(1, finalize.class, "toApplicationConfigDataList", "toApplicationConfigDataList(Lorg/json/JSONObject;)Ljava/util/List;", 1);
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i11;
            int i14 = ((i10 | i13) * 983) + (i11 * 984) + (i10 * (-1965));
            int i15 = ~i10;
            int i16 = ~i12;
            if ((((~(i15 | i11)) | (~(i16 | i15))) * 983) + (((~(i13 | i16)) | i15) * (-983)) + i14 == 1) {
                setX setx = (setX) objArr[0];
                Object obj = objArr[1];
                int i17 = f55545p0;
                int i18 = (i17 & 125) + (i17 | 125);
                f55546q0 = i18 % 128;
                int i19 = i18 % 2;
                List list = (List) setOnFocusChangeListener(new Object[]{setx, (JSONObject) obj}, 812894506, -812894506, System.identityHashCode(setx));
                int i20 = f55545p0;
                int i21 = i20 ^ 83;
                int i22 = -(-((i20 & 83) << 1));
                int i23 = (i21 & i22) + (i22 | i21);
                f55546q0 = i23 % 128;
                if (i23 % 2 == 0) {
                    int i24 = 33 / 0;
                }
                return list;
            }
            JSONObject jSONObject = (JSONObject) objArr[1];
            Intrinsics.checkNotNullParameter(jSONObject, "");
            List list2 = (List) setInputType.setOnFocusChangeListener(new Object[]{jSONObject, EventDataKeys.Analytics.ANALYTICS_ID}, -5198295, 5198295, (int) System.currentTimeMillis());
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            int i25 = f55546q0;
            int i26 = ((i25 & 22) + (i25 | 22)) - 1;
            f55545p0 = i26 % 128;
            int i27 = i26 % 2;
            while (it.hasNext()) {
                arrayList.add(new setFirstBaselineToTopHeight((String) it.next(), setInputType.setOnFocusChangeListener(jSONObject, "config", setOnFocusChangeListener.setOnFocusChangeListener), setInputType.setOnFocusChangeListener(jSONObject, "transaction", setY.setOnFocusChangeListener), setInputType.setCompoundDrawableTintBlendMode(jSONObject, "filteringSelector", (String) null, 2, (Object) null)));
                int i28 = f55545p0;
                int i29 = i28 & 123;
                int i30 = (i28 | 123) & (~i29);
                int i31 = -(-(i29 << 1));
                int i32 = ((i30 | i31) << 1) - (i30 ^ i31);
                f55546q0 = i32 % 128;
                int i33 = i32 % 2;
            }
            int i34 = f55545p0 + 107;
            f55546q0 = i34 % 128;
            int i35 = i34 % 2;
            return arrayList;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List<? extends com.mypinpad.tsdk.i.setFirstBaselineToTopHeight>] */
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ List<? extends setFirstBaselineToTopHeight> invoke(JSONObject jSONObject) {
            return setOnFocusChangeListener(new Object[]{this, jSONObject}, -205516007, 205516008, System.identityHashCode(this));
        }

        @NotNull
        public final List<setFirstBaselineToTopHeight> setDividerPadding(@NotNull JSONObject jSONObject) {
            return (List) setOnFocusChangeListener(new Object[]{this, jSONObject}, 812894506, -812894506, System.identityHashCode(this));
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class setY extends FunctionReferenceImpl implements Function1<JSONObject, getDynamicButtonTextSizeSp> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static int f55547p0 = 0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55548q0 = 1;
        public static final setY setOnFocusChangeListener = new setY();

        static {
            int i10 = f55548q0 + 31;
            f55547p0 = i10 % 128;
            int i11 = i10 % 2;
        }

        public setY() {
            super(1, finalize.class, "toTransactionConfigData", "toTransactionConfigData(Lorg/json/JSONObject;)Lcom/mypinpad/softpos/emv/terminal/config/TransactionConfigData;", 1);
        }

        public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws JSONException {
            boolean z10;
            getDynamicButtonTextSizeSp getdynamicbuttontextsizesp;
            int i13 = ~i11;
            int i14 = ~i10;
            int i15 = ~i12;
            boolean zBooleanValue = false;
            if (((~(i10 | i11)) * 933) + (((~(i13 | i10)) | (~(i13 | i15))) * 933) + (((~(i14 | i15)) | i13) * (-933)) + (i11 * (-932)) + (i10 * 934) != 1) {
                setY sety = (setY) objArr[0];
                Object obj = objArr[1];
                int i16 = f55547p0;
                int i17 = i16 ^ 55;
                int i18 = ((i16 & 55) | i17) << 1;
                int i19 = -i17;
                int i20 = (i18 & i19) + (i18 | i19);
                f55548q0 = i20 % 128;
                JSONObject jSONObject = (JSONObject) obj;
                if (i20 % 2 == 0) {
                    getdynamicbuttontextsizesp = (getDynamicButtonTextSizeSp) setDividerPadding(new Object[]{sety, jSONObject}, -204833915, 204833916, System.identityHashCode(sety));
                    int i21 = 26 / 0;
                } else {
                    getdynamicbuttontextsizesp = (getDynamicButtonTextSizeSp) setDividerPadding(new Object[]{sety, jSONObject}, -204833915, 204833916, System.identityHashCode(sety));
                }
                int i22 = f55548q0;
                int i23 = ((i22 & (-42)) | ((~i22) & 41)) + ((i22 & 41) << 1);
                f55547p0 = i23 % 128;
                int i24 = i23 % 2;
            } else {
                JSONObject jSONObject2 = (JSONObject) objArr[1];
                int i25 = f55548q0;
                int i26 = i25 & 79;
                int i27 = (i25 | 79) & (~i26);
                int i28 = -(-(i26 << 1));
                int i29 = (i27 ^ i28) + ((i27 & i28) << 1);
                f55547p0 = i29 % 128;
                int i30 = i29 % 2;
                Intrinsics.checkNotNullParameter(jSONObject2, "");
                byte bByteValue = ((Byte) setInputType.setOnFocusChangeListener(new Object[]{jSONObject2, "transactionType"}, -1869921623, 1869921625, (int) System.currentTimeMillis())).byteValue();
                boolean z11 = jSONObject2.getBoolean("statusCheckSupportFlag");
                Boolean bool = (Boolean) setInputType.setOnFocusChangeListener(new Object[]{jSONObject2, "zeroAmountAllowedFlag", null, 2, null}, 858714105, -858714096, 2);
                boolean z12 = jSONObject2.getBoolean("extendedSelectionSupportFlag");
                List list = (List) setInputType.setOnFocusChangeListener(new Object[]{jSONObject2, "config", getNavBarTitleString.setDividerPadding}, 195668602, -195668594, (int) System.currentTimeMillis());
                Long l6 = (Long) setInputType.setOnFocusChangeListener(new Object[]{jSONObject2, "readerContactlessTransactionLimit", null, 2, null}, -1248205180, 1248205181, 2);
                Long l7 = (Long) setInputType.setOnFocusChangeListener(new Object[]{jSONObject2, "readerContactlessFloorLimit", null, 2, null}, -1248205180, 1248205181, 2);
                Long l10 = (Long) setInputType.setOnFocusChangeListener(new Object[]{jSONObject2, "readerCVMRequiredLimit", null, 2, null}, -1248205180, 1248205181, 2);
                List list2 = (List) setInputType.setOnFocusChangeListener(new Object[]{jSONObject2, "currencyConfiguration", setOnLongClickListener.setCompoundDrawableTintBlendMode}, 195668602, -195668594, (int) System.currentTimeMillis());
                Boolean bool2 = (Boolean) setInputType.setOnFocusChangeListener(new Object[]{jSONObject2, "partialSelectionSupportFlag", null}, -740291256, 740291261, (int) System.currentTimeMillis());
                if (bool2 == null) {
                    int i31 = f55547p0;
                    int i32 = ((i31 & 126) + (i31 | 126)) - 1;
                    f55548q0 = i32 % 128;
                    int i33 = i32 % 2;
                    int i34 = (i31 & 39) + (i31 | 39);
                    f55548q0 = i34 % 128;
                    int i35 = i34 % 2;
                    z10 = false;
                } else {
                    boolean zBooleanValue2 = bool2.booleanValue();
                    int i36 = f55548q0;
                    int i37 = i36 & 69;
                    int i38 = i37 + ((i36 ^ 69) | i37);
                    f55547p0 = i38 % 128;
                    int i39 = i38 % 2;
                    z10 = zBooleanValue2;
                }
                Boolean bool3 = (Boolean) setInputType.setOnFocusChangeListener(new Object[]{jSONObject2, "ppseSelectionFallbackSupportFlag", null}, -740291256, 740291261, (int) System.currentTimeMillis());
                if (bool3 == null) {
                    int i40 = f55547p0;
                    int i41 = ((i40 | 31) << 1) - (i40 ^ 31);
                    f55548q0 = i41 % 128;
                    int i42 = i41 % 2;
                    int i43 = i40 & 83;
                    int i44 = (i43 - (~((i40 ^ 83) | i43))) - 1;
                    f55548q0 = i44 % 128;
                    int i45 = i44 % 2;
                } else {
                    zBooleanValue = bool3.booleanValue();
                    int i46 = f55547p0;
                    int i47 = (i46 | 99) << 1;
                    int i48 = -(i46 ^ 99);
                    int i49 = ((i47 | i48) << 1) - (i48 ^ i47);
                    f55548q0 = i49 % 128;
                    int i50 = i49 % 2;
                }
                getdynamicbuttontextsizesp = new getDynamicButtonTextSizeSp(bByteValue, z11, bool, z12, z10, zBooleanValue, l6, l7, l10, list2, list);
                int i51 = f55548q0;
                int i52 = ((i51 & 65) - (~(i51 | 65))) - 1;
                f55547p0 = i52 % 128;
                if (i52 % 2 != 0) {
                    throw null;
                }
            }
            return getdynamicbuttontextsizesp;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [com.mypinpad.tsdk.i.getDynamicButtonTextSizeSp, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ getDynamicButtonTextSizeSp invoke(JSONObject jSONObject) {
            return setDividerPadding(new Object[]{this, jSONObject}, 1473359948, -1473359948, System.identityHashCode(this));
        }

        @NotNull
        public final getDynamicButtonTextSizeSp setCompoundDrawableTintBlendMode(@NotNull JSONObject jSONObject) {
            return (getDynamicButtonTextSizeSp) setDividerPadding(new Object[]{this, jSONObject}, -204833915, 204833916, System.identityHashCode(this));
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class getNavBarTitleString extends FunctionReferenceImpl implements Function1<JSONObject, getAmount> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static int f55533p0 = 0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final int f55534q0;
        public static final getNavBarTitleString setDividerPadding = new getNavBarTitleString();

        static {
            int i10 = f55533p0;
            int i11 = i10 & 31;
            int i12 = -(-((i10 ^ 31) | i11));
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            f55534q0 = i13 % 128;
            int i14 = i13 % 2;
        }

        public getNavBarTitleString() {
            super(1, finalize.class, "toTlvConfigData", "toTlvConfigData(Lorg/json/JSONObject;)Lcom/mypinpad/softpos/emv/terminal/config/TlvConfigData;", 1);
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws JSONException {
            int i13 = (i11 * (-520)) + (i10 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY);
            int i14 = ~i12;
            int i15 = ((i11 | i12) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (((~(i14 | i11)) | i10) * (-1042)) + i13;
            int i16 = ~i10;
            int i17 = (((~(i10 | i14 | i11)) | (~(i12 | i16)) | (~((~i11) | i16))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i15;
            int i18 = f55534q0;
            if (i17 != 1) {
                JSONObject jSONObject = (JSONObject) objArr[1];
                Intrinsics.checkNotNullParameter(jSONObject, "");
                String string = jSONObject.getString(LogKeysKt.TAG);
                Intrinsics.checkNotNullExpressionValue(string, "");
                String string2 = jSONObject.getString("value");
                Intrinsics.checkNotNullExpressionValue(string2, "");
                getAmount getamount = new getAmount(string, string2);
                int i19 = (i18 | 105) << 1;
                int i20 = -(i18 ^ 105);
                int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
                f55533p0 = i21 % 128;
                if (i21 % 2 == 0) {
                    return getamount;
                }
                throw null;
            }
            getNavBarTitleString getnavbartitlestring = (getNavBarTitleString) objArr[0];
            Object obj = objArr[1];
            int i22 = (((i18 ^ 45) | (i18 & 45)) << 1) - ((i18 & (-46)) | ((~i18) & 45));
            f55533p0 = i22 % 128;
            JSONObject jSONObject2 = (JSONObject) obj;
            if (i22 % 2 != 0) {
                throw null;
            }
            getAmount getamount2 = (getAmount) setX(new Object[]{getnavbartitlestring, jSONObject2}, -1085355680, 1085355680, System.identityHashCode(getnavbartitlestring));
            int i23 = i18 ^ 73;
            int i24 = (((i18 & 73) | i23) << 1) - i23;
            f55533p0 = i24 % 128;
            if (i24 % 2 != 0) {
                int i25 = 99 / 0;
            }
            return getamount2;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [com.mypinpad.tsdk.i.getAmount, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ getAmount invoke(JSONObject jSONObject) {
            return setX(new Object[]{this, jSONObject}, 877457039, -877457038, System.identityHashCode(this));
        }

        @NotNull
        public final getAmount setX(@NotNull JSONObject jSONObject) {
            return (getAmount) setX(new Object[]{this, jSONObject}, -1085355680, 1085355680, System.identityHashCode(this));
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class setOnLongClickListener extends FunctionReferenceImpl implements Function1<JSONObject, setFilters> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static int f55543p0 = 0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f55544q0 = 1;
        public static final setOnLongClickListener setCompoundDrawableTintBlendMode = new setOnLongClickListener();

        static {
            int i10 = f55544q0;
            int i11 = i10 & 19;
            int i12 = -(-((i10 ^ 19) | i11));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            f55543p0 = i13 % 128;
            if (i13 % 2 != 0) {
                throw null;
            }
        }

        public setOnLongClickListener() {
            super(1, finalize.class, "toCurrencyConfigData", "toCurrencyConfigData(Lorg/json/JSONObject;)Lcom/mypinpad/softpos/emv/terminal/config/CurrencyConfigData;", 1);
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws JSONException {
            int i13 = ~i11;
            int i14 = ~i12;
            if ((((~(i10 | i14)) | (~(i12 | (~i10))) | i13) * 45) + (((~(i11 | i10)) | (~(i13 | i12))) * (-45)) + (((~(i13 | i14)) | i10) * (-90)) + (i11 * 46) + (i10 * 46) == 1) {
                setOnLongClickListener setonlongclicklistener = (setOnLongClickListener) objArr[0];
                Object obj = objArr[1];
                int i15 = f55544q0;
                int i16 = ((-1) << 1) - (((i15 & 82) + (i15 | 82)) ^ (-1));
                f55543p0 = i16 % 128;
                int i17 = i16 % 2;
                setFilters setfilters = (setFilters) setOnFocusChangeListener(new Object[]{setonlongclicklistener, (JSONObject) obj}, 1413048367, -1413048367, System.identityHashCode(setonlongclicklistener));
                int i18 = f55543p0;
                int i19 = (i18 & 117) + (i18 | 117);
                f55544q0 = i19 % 128;
                int i20 = i19 % 2;
                return setfilters;
            }
            JSONObject jSONObject = (JSONObject) objArr[1];
            Intrinsics.checkNotNullParameter(jSONObject, "");
            String string = jSONObject.getString("currency");
            Intrinsics.checkNotNullExpressionValue(string, "");
            setFilters setfilters2 = new setFilters(string, setInputType.setDividerPadding(jSONObject, "readerContactlessTransactionLimit", null, 2, null), setInputType.setDividerPadding(jSONObject, "readerContactlessFloorLimit", null, 2, null), setInputType.setDividerPadding(jSONObject, "readerCVMRequiredLimit", null, 2, null), setInputType.setOnFocusChangeListener(jSONObject, "config", setDividerPadding.setX));
            int i21 = f55544q0;
            int i22 = (((i21 | 46) << 1) - (i21 ^ 46)) - 1;
            f55543p0 = i22 % 128;
            if (i22 % 2 == 0) {
                return setfilters2;
            }
            int i23 = 53 / 0;
            return setfilters2;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [com.mypinpad.tsdk.i.setFilters, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ setFilters invoke(JSONObject jSONObject) {
            return setOnFocusChangeListener(new Object[]{this, jSONObject}, 1325691153, -1325691152, System.identityHashCode(this));
        }

        @NotNull
        public final setFilters setOnFocusChangeListener(@NotNull JSONObject jSONObject) {
            return (setFilters) setOnFocusChangeListener(new Object[]{this, jSONObject}, 1413048367, -1413048367, System.identityHashCode(this));
        }
    }
}
