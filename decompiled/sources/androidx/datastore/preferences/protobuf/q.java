package androidx.datastore.preferences.protobuf;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.sqlite.SQLiteDatabase;
import android.util.JsonReader;
import androidx.compose.runtime.Composer;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.cellscore.web.data.CellsMessage;
import com.bbva.cellscore.web.navigation.Dispatcher;
import com.bbva.component.ic.security.utils.SecurityType;
import com.bbva.ethermobilesdk.securesharing.extension.ExceptionKt;
import com.bbva.glomohybrid.login.presentation.reactions.LoginReaction;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.mypinpad.tsdk.isolation.axy;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements Channel.ObjectAdapter, Reaction.NavigationExecution, SQLiteEventStore.a, LibraryVersionComponent.VersionExtractor, CrashlyticsReportJsonTransform.a {
    public static float a(float f6, float f10, float f11, float f12) {
        return ((f6 * f10) + f11) * f12;
    }

    public static String c(String str, Class cls) {
        return str + cls;
    }

    public static KotlinNothingValueException d(String str, Exception exc, int i10, Object obj) {
        ExceptionKt.throwError$default(str, exc, i10, obj);
        return new KotlinNothingValueException();
    }

    public static void e(int i10, Function2 function2, Composer composer) {
        function2.invoke(composer, Integer.valueOf(i10));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    public static void f(Exception exc, StringBuilder sb2, String str, boolean z10) {
        sb2.append(exc.getMessage());
        com.huawei.secure.android.common.activity.a.a(str, sb2.toString(), z10);
    }

    public static void g(Integer num, axy.a aVar, axy axyVar) {
        aVar.put(Integer.valueOf(num.intValue()), axyVar);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.a
    public Object apply(Object obj) {
        Encoding encoding = SQLiteEventStore.f43867u0;
        return (List) SQLiteEventStore.g(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new com.google.android.gms.internal.mlkit_common.a());
    }

    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.a
    public Object b(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.b(jsonReader);
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.NavigationExecution
    public void execute(Activity activity, Object obj, Object obj2) {
        LoginReaction.Companion companion = LoginReaction.INSTANCE;
        ((Dispatcher) obj).dispatch(activity, (CellsMessage) obj2);
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    @Override // com.bbva.cellscore.channel.model.Channel.ObjectAdapter
    public Object transform(Object obj) {
        List<SecurityType> list = (List) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Intrinsics.checkNotNull(list);
        for (SecurityType securityType : list) {
            linkedHashMap.put("authenticationtype", securityType.getAuthenticationType());
            linkedHashMap.put("authenticationdata", securityType.getAuthenticationData() + "=");
        }
        return linkedHashMap;
    }
}
