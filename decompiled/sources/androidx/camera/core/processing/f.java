package androidx.camera.core.processing;

import android.content.Context;
import android.util.JsonReader;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.state.Interpolator;
import bk.p;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.component.ic.security.utils.SecurityType;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzh;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.aead.AesEaxParameters;
import com.google.crypto.tink.internal.ParametersSerializer;
import com.google.crypto.tink.internal.ProtoParametersSerialization;
import com.google.crypto.tink.internal.Serialization;
import com.google.crypto.tink.proto.AesEaxKeyFormat;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Interpolator, Channel.ObjectAdapter, ParametersSerializer.ParametersSerializationFunction, LibraryVersionComponent.VersionExtractor, CrashlyticsReportJsonTransform.a {
    public static int a(Iterable iterable, int i10, int i11) {
        return kotlin.ranges.c.coerceAtLeast(p.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, i10)), i11);
    }

    public static Object c(zzbl zzblVar, int i10, List list, int i11) {
        zzh.zzh(zzblVar.name(), i10, list);
        return list.get(i11);
    }

    public static String d(String str, String str2) {
        return str + str2;
    }

    public static StringBuilder e(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return sb2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.a
    public Object b(JsonReader jsonReader) throws IOException {
        DataEncoder dataEncoder = CrashlyticsReportJsonTransform.f48234a;
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Builder builder = CrashlyticsReport.Session.Event.Application.Execution.Thread.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    ArrayList arrayList = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(CrashlyticsReportJsonTransform.a(jsonReader));
                    }
                    jsonReader.endArray();
                    builder.setFrames(Collections.unmodifiableList(arrayList));
                    break;
                case "name":
                    builder.setName(jsonReader.nextString());
                    break;
                case "importance":
                    builder.setImportance(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return builder.build();
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        Context context = (Context) obj;
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? FirebaseCommonRegistrar.a(installerPackageName) : "";
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public float getInterpolation(float f6) {
        return (float) Easing.getInterpolator("decelerate").get(f6);
    }

    @Override // com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction
    public Serialization serializeParameters(Parameters parameters) {
        AesEaxParameters aesEaxParameters = (AesEaxParameters) parameters;
        ParametersSerializer<AesEaxParameters, ProtoParametersSerialization> parametersSerializer = com.google.crypto.tink.aead.a.f46534a;
        return ProtoParametersSerialization.create(KeyTemplate.newBuilder().setTypeUrl("type.googleapis.com/google.crypto.tink.AesEaxKey").setValue(AesEaxKeyFormat.newBuilder().setParams(com.google.crypto.tink.aead.a.a(aesEaxParameters)).setKeySize(aesEaxParameters.getKeySizeBytes()).build().toByteString()).setOutputPrefixType(com.google.crypto.tink.aead.a.b(aesEaxParameters.getVariant())).build());
    }

    @Override // com.bbva.cellscore.channel.model.Channel.ObjectAdapter
    public Object transform(Object obj) {
        List list = (List) obj;
        Intrinsics.checkNotNull(list);
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((SecurityType) it.next()).getAuthenticationType());
        }
        return p.mapOf(TuplesKt.to("type", CollectionsKt___CollectionsKt.toList(arrayList)));
    }
}
