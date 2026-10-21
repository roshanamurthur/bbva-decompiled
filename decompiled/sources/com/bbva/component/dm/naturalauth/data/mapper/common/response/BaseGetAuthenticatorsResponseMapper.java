package com.bbva.component.dm.naturalauth.data.mapper.common.response;

import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.glomoutils.Mapper;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.sl.ar.android.secsdk.fido.model.AppInfo;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoAuthenticator;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoDevice;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoDeviceInfo;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BaseGetAuthenticatorsResponseMapper.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B/\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u0001\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\u0011"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/mapper/common/response/BaseGetAuthenticatorsResponseMapper;", "Lcom/bbva/glomoutils/Mapper;", "", "", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoDevice;", "Lcom/google/gson/JsonObject;", DigipassManagerConstants.KEY_RESPONSE, "Lcom/google/gson/JsonArray;", "extractDeviceArray", "input", "map", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoDeviceInfo;", "deviceInfoMapper", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoAuthenticator;", "authenticatorMapper", "<init>", "(Lcom/bbva/glomoutils/Mapper;Lcom/bbva/glomoutils/Mapper;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBaseGetAuthenticatorsResponseMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseGetAuthenticatorsResponseMapper.kt\ncom/bbva/component/dm/naturalauth/data/mapper/common/response/BaseGetAuthenticatorsResponseMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n1549#2:56\n1620#2,3:57\n1549#2:60\n1620#2,3:61\n1549#2:64\n1620#2,3:65\n1549#2:68\n1620#2,3:69\n*S KotlinDebug\n*F\n+ 1 BaseGetAuthenticatorsResponseMapper.kt\ncom/bbva/component/dm/naturalauth/data/mapper/common/response/BaseGetAuthenticatorsResponseMapper\n*L\n31#1:56\n31#1:57,3\n32#1:60\n32#1:61,3\n46#1:64\n46#1:65,3\n47#1:68\n47#1:69,3\n*E\n"})
public abstract class BaseGetAuthenticatorsResponseMapper implements Mapper<String, List<? extends FidoDevice>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Mapper<JsonObject, FidoDeviceInfo> f27825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Mapper<JsonObject, FidoAuthenticator> f27826b;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseGetAuthenticatorsResponseMapper(@NotNull Mapper<? super JsonObject, ? extends FidoDeviceInfo> deviceInfoMapper, @NotNull Mapper<? super JsonObject, ? extends FidoAuthenticator> authenticatorMapper) {
        Intrinsics.checkNotNullParameter(deviceInfoMapper, "deviceInfoMapper");
        Intrinsics.checkNotNullParameter(authenticatorMapper, "authenticatorMapper");
        this.f27825a = deviceInfoMapper;
        this.f27826b = authenticatorMapper;
    }

    @Nullable
    public abstract JsonArray extractDeviceArray(@NotNull JsonObject response);

    @Override // com.bbva.glomoutils.Mapper
    @NotNull
    public List<FidoDevice> map(@NotNull String input) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(input, "input");
        ArrayList arrayList = new ArrayList();
        JsonObject jsonObject = (JsonObject) new Gson().fromJson(input, JsonObject.class);
        Intrinsics.checkNotNull(jsonObject);
        JsonArray jsonArrayExtractDeviceArray = extractDeviceArray(jsonObject);
        if (jsonArrayExtractDeviceArray != null) {
            ArrayList<JsonObject> arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(jsonArrayExtractDeviceArray, 10));
            Iterator<JsonElement> it = jsonArrayExtractDeviceArray.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().getAsJsonObject());
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            for (JsonObject jsonObject2 : arrayList2) {
                Intrinsics.checkNotNull(jsonObject2);
                JsonObject asJsonObject = jsonObject2.getAsJsonObject(Constants.device);
                Intrinsics.checkNotNull(asJsonObject);
                FidoDeviceInfo map = this.f27825a.map(asJsonObject);
                AppInfo appInfo = new AppInfo(map.getId(), map.getName());
                try {
                    Result.Companion companion = Result.INSTANCE;
                    JsonArray asJsonArray = jsonObject2.getAsJsonArray(Constants.authenticators);
                    Intrinsics.checkNotNullExpressionValue(asJsonArray, "getAsJsonArray(...)");
                    ArrayList<JsonObject> arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(asJsonArray, 10));
                    Iterator<JsonElement> it2 = asJsonArray.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(it2.next().getAsJsonObject());
                    }
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                    for (JsonObject jsonObject3 : arrayList4) {
                        Mapper<JsonObject, FidoAuthenticator> mapper = this.f27826b;
                        Intrinsics.checkNotNull(jsonObject3);
                        arrayList5.add(mapper.map(jsonObject3));
                    }
                    objM5535constructorimpl = Result.m5535constructorimpl(arrayList5);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
                }
                if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
                    objM5535constructorimpl = null;
                }
                List listEmptyList = (List) objM5535constructorimpl;
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                arrayList3.add(new FidoDevice(map, appInfo, listEmptyList));
            }
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }
}
