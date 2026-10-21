package ci;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.glomohybrid.documents.component.TermsDataManager;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements UseCase.UseCaseErrorCallback {
    public static int a(Number number, Modifier modifier, String str, Composer composer, int i10) {
        int iIntValue = number.intValue();
        Intrinsics.checkNotNullParameter(modifier, str);
        composer.startReplaceableGroup(i10);
        return iIntValue;
    }

    public static String b(Exception exc, StringBuilder sb2) {
        sb2.append(exc.getMessage());
        return sb2.toString();
    }

    public static String c(StringBuilder sb2, Function1 function1, char c10) {
        sb2.append(function1);
        sb2.append(c10);
        return sb2.toString();
    }

    public static StringBuilder d(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static /* bridge */ /* synthetic */ boolean e(Object obj) {
        return true;
    }

    @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
    public void onUseCaseError(Throwable th2) {
        TermsDataManager.Companion companion = TermsDataManager.INSTANCE;
        th2.printStackTrace();
    }
}
