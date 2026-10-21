package androidx.activity;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import androidx.compose.ui.unit.Dp;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.glomohybrid.documents.component.TermsDataManager;
import com.google.android.gms.measurement.internal.zzfr;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements UseCase.UseCaseSuccessCallback {
    public static int a(int i10, int i11, int i12, int i13) {
        return ((i10 + i11) - i12) % i13;
    }

    public static ValueElementSequence b(float f6, ValueElementSequence valueElementSequence, String str, InspectorInfo inspectorInfo) {
        valueElementSequence.set(str, Dp.m4387boximpl(f6));
        return inspectorInfo.getProperties();
    }

    public static ValueElementSequence c(InspectorInfo inspectorInfo, String str, String str2) {
        Intrinsics.checkNotNullParameter(inspectorInfo, str);
        inspectorInfo.setName(str2);
        return inspectorInfo.getProperties();
    }

    public static String d(StringBuilder sb2, int i10, char c10) {
        sb2.append(i10);
        sb2.append(c10);
        return sb2.toString();
    }

    public static Iterator e(Sequence sequence, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(sequence, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return sequence.iterator();
    }

    public static KClass f(Scope scope, String str, ParametersHolder parametersHolder, String str2, Class cls) {
        Intrinsics.checkNotNullParameter(scope, str);
        Intrinsics.checkNotNullParameter(parametersHolder, str2);
        return Reflection.getOrCreateKotlinClass(cls);
    }

    public static void g(zzfr zzfrVar, String str) {
        zzfrVar.zzay().zzj().zza(str);
    }

    @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
    public void onUseCaseComplete(Object obj) {
        TermsDataManager.Companion companion = TermsDataManager.INSTANCE;
    }
}
