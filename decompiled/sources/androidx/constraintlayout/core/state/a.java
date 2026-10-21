package androidx.constraintlayout.core.state;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.util.JsonReader;
import androidx.constraintlayout.core.motion.utils.Easing;
import bk.q;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.component.dm.biometriclogin.BiometricAuthenticationDataManager;
import com.bbva.glomo.user.domain.model.RememberedUser;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Interpolator, Channel.BundleAdapter, TextInputLayout.LengthCounter, LibraryVersionComponent.VersionExtractor, CrashlyticsReportJsonTransform.a, Reaction.ReactionExecution {
    public static /* synthetic */ String a(List list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) "+");
            }
        }
        return sb2.toString();
    }

    public static ArrayList c(LinkedHashMap linkedHashMap, Object obj) {
        ArrayList arrayList = new ArrayList();
        linkedHashMap.put(obj, arrayList);
        return arrayList;
    }

    @Override // com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform.a
    public Object b(JsonReader jsonReader) {
        return CrashlyticsReportJsonTransform.g(jsonReader);
    }

    @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
    public int countLength(Editable editable) {
        int i10 = TextInputLayout.T1;
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public void execute(Object obj, Object obj2) {
        String document;
        BiometricAuthenticationDataManager biometricAuthenticationDataManager = (BiometricAuthenticationDataManager) obj;
        RememberedUser rememberedUser = (RememberedUser) obj2;
        if (rememberedUser == null || (document = rememberedUser.getDocument()) == null) {
            return;
        }
        Intrinsics.checkNotNull(biometricAuthenticationDataManager);
        BiometricAuthenticationDataManager.setUp$default(biometricAuthenticationDataManager, document, null, 2, null);
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        ApplicationInfo applicationInfo = ((Context) obj).getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public float getInterpolation(float f6) {
        return (float) Easing.getInterpolator("standard").get(f6);
    }

    @Override // com.bbva.cellscore.channel.model.Channel.BundleAdapter
    public Object transform(Bundle bundle) {
        Pair[] pairArr = new Pair[2];
        String string = bundle.getString("authenticationtype");
        if (string == null) {
            string = "";
        }
        pairArr[0] = TuplesKt.to("authenticationtype", string);
        String string2 = bundle.getString("authenticationdata");
        pairArr[1] = TuplesKt.to("authenticationdata", string2 != null ? string2 : "");
        return q.mapOf(pairArr);
    }
}
