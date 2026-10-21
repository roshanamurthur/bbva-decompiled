package com.viergegroup.sdk.taptophone;

import android.content.res.AssetManager;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.notifications.constants.PushConstants;
import com.d.c.getInjectedTransactionParameters;
import com.mypinpad.tsdk.api.models.Iso4217Currency;
import com.mypinpad.tsdk.api.models.TransactionParameters;
import com.mypinpad.tsdk.api.models.TransactionType;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/viergegroup/sdk/taptophone/AssetInjection;", "", "()V", "injectedTransactionParameters", "Lcom/mypinpad/tsdk/api/models/TransactionParameters;", "getInjectedTransactionParameters", "()Lcom/mypinpad/tsdk/api/models/TransactionParameters;", "setInjectedTransactionParameters", "(Lcom/mypinpad/tsdk/api/models/TransactionParameters;)V", "inject", "", "assets", "Landroid/content/res/AssetManager;", "readJsonAssetOrNull", "Lorg/json/JSONObject;", "assetName", "", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAssetInjection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetInjection.kt\ncom/viergegroup/sdk/taptophone/AssetInjection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
public final class AssetInjection {

    @NotNull
    public static final AssetInjection INSTANCE = new AssetInjection();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static volatile TransactionParameters f67597a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f67598b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f67599c = 1;

    private AssetInjection() {
    }

    @Nullable
    public final TransactionParameters getInjectedTransactionParameters() {
        return f67597a;
    }

    public final void inject(@NotNull AssetManager assets) {
        Object objM5535constructorimpl;
        JSONObject jSONObjectOptJSONObject;
        Object objM5535constructorimpl2;
        List listEmptyList;
        byte[] bArrDecodeBase64;
        Intrinsics.checkNotNullParameter(assets, "");
        boolean z10 = true;
        try {
            Result.Companion companion = Result.INSTANCE;
            try {
                Object[] objArr = {assets, "config.json"};
                Map<Integer, Object> map = getInjectedTransactionParameters.CurrencyCustomFormattingConfigKt;
                Object method = map.get(-1705409116);
                if (method == null) {
                    method = ((Class) getInjectedTransactionParameters.setInjectedTransactionParameters((char) (14247 - (ViewConfiguration.getEdgeSlop() >> 16)), 17 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1)).getMethod("setInjectedTransactionParameters", AssetManager.class, String.class);
                    map.put(-1705409116, method);
                }
                InputStream inputStream = (InputStream) ((Method) method).invoke(null, objArr);
                Intrinsics.checkNotNullExpressionValue(inputStream, "");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192);
                try {
                    String text = TextStreamsKt.readText(bufferedReader);
                    CloseableKt.closeFinally(bufferedReader, null);
                    objM5535constructorimpl = Result.m5535constructorimpl(new JSONObject(text));
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(bufferedReader, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                Throwable cause = th4.getCause();
                if (cause == null) {
                    throw th4;
                }
                throw cause;
            }
        } catch (Throwable th5) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th5));
        }
        if (!(!Result.m5540isFailureimpl(objM5535constructorimpl))) {
            int i10 = f67598b + 121;
            f67599c = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            objM5535constructorimpl = null;
        }
        JSONObject jSONObject = (JSONObject) objM5535constructorimpl;
        int i11 = f67599c + 73;
        f67598b = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("transaction_parameters")) == null) {
            return;
        }
        try {
            long jOptLong = jSONObjectOptJSONObject.optLong(PushConstants.AMOUNT, 0L);
            String strOptString = jSONObjectOptJSONObject.optString("amountOther", "");
            Intrinsics.checkNotNullExpressionValue(strOptString, "");
            if (strOptString.length() <= 0) {
                z10 = false;
            }
            if (!Boolean.valueOf(z10).booleanValue()) {
                strOptString = null;
            }
            Long lValueOf = strOptString != null ? Long.valueOf(Long.parseLong(strOptString)) : null;
            Iso4217Currency iso4217Currency = new Iso4217Currency(jSONObjectOptJSONObject.optInt("currency", 554));
            TransactionType transactionType = TransactionType.PURCHASE;
            String strOptString2 = jSONObjectOptJSONObject.optString("rrn", "123456789001");
            Intrinsics.checkNotNullExpressionValue(strOptString2, "");
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("applicationFilteringSelectors");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                int length = jSONArrayOptJSONArray.length();
                for (int i12 = 0; i12 < length; i12++) {
                    arrayList.set(i12, jSONArrayOptJSONArray.getString(i12));
                }
                listEmptyList = arrayList;
            } else {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            String strOptString3 = jSONObjectOptJSONObject.optString("metadata", "");
            Intrinsics.checkNotNullExpressionValue(strOptString3, "");
            if (strOptString3.length() <= 0) {
                strOptString3 = null;
            }
            if (strOptString3 == null || (bArrDecodeBase64 = UtilsKt.decodeBase64(strOptString3)) == null) {
                bArrDecodeBase64 = new byte[0];
            }
            byte[] bArr = bArrDecodeBase64;
            String strOptString4 = jSONObjectOptJSONObject.optString("gatewayId", "");
            Intrinsics.checkNotNullExpressionValue(strOptString4, "");
            if (strOptString4.length() <= 0) {
                strOptString4 = null;
            }
            objM5535constructorimpl2 = Result.m5535constructorimpl(new TransactionParameters(jOptLong, lValueOf, iso4217Currency, null, transactionType, strOptString2, listEmptyList, bArr, strOptString4 != null ? UUID.fromString(strOptString4) : null, 8, null));
        } catch (Throwable th6) {
            Result.Companion companion3 = Result.INSTANCE;
            objM5535constructorimpl2 = Result.m5535constructorimpl(ResultKt.createFailure(th6));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl2);
        if (thM5538exceptionOrNullimpl != null) {
            thM5538exceptionOrNullimpl.toString();
        }
        f67597a = (TransactionParameters) (Result.m5540isFailureimpl(objM5535constructorimpl2) ? null : objM5535constructorimpl2);
    }

    public final void setInjectedTransactionParameters(@Nullable TransactionParameters transactionParameters) {
        f67597a = transactionParameters;
    }
}
