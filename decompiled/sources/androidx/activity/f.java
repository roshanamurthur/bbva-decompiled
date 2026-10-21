package androidx.activity;

import androidx.camera.core.VideoCapture;
import androidx.camera.core.processing.SettableSurface;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.text.input.InputMethodManager;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.room.QueryInterceptorDatabase;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.utils.Utils;
import com.appsflyer.internal.AFa1dSDK;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.HashMap;
import java.util.zip.ZipInputStream;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f448p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f449q0;

    public /* synthetic */ f(Object obj, int i10) {
        this.f448p0 = i10;
        this.f449q0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r8v3, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r8v4, types: [T, java.lang.Boolean] */
    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f448p0;
        Object obj = this.f449q0;
        switch (i10) {
            case 0:
                ComponentActivity.j jVar = (ComponentActivity.j) obj;
                Runnable runnable = jVar.f309q0;
                if (runnable != null) {
                    runnable.run();
                    jVar.f309q0 = null;
                }
                break;
            case 1:
                ((VideoCapture) obj).lambda$onDetached$6();
                break;
            case 2:
                ((SettableSurface) obj).decrementUseCount();
                break;
            case 3:
                TextInputServiceAndroid this$0 = (TextInputServiceAndroid) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.m = null;
                boolean zIsFocused = this$0.f18145a.isFocused();
                MutableVector<TextInputServiceAndroid.a> mutableVector = this$0.f18156l;
                if (!zIsFocused) {
                    mutableVector.clear();
                } else {
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    int size = mutableVector.getSize();
                    if (size > 0) {
                        TextInputServiceAndroid.a[] content = mutableVector.getContent();
                        int i11 = 0;
                        do {
                            TextInputServiceAndroid.a aVar = content[i11];
                            int i12 = TextInputServiceAndroid.WhenMappings.$EnumSwitchMapping$0[aVar.ordinal()];
                            if (i12 == 1) {
                                ?? r10 = Boolean.TRUE;
                                objectRef.element = r10;
                                objectRef2.element = r10;
                            } else if (i12 == 2) {
                                ?? r11 = Boolean.FALSE;
                                objectRef.element = r11;
                                objectRef2.element = r11;
                            } else if ((i12 == 3 || i12 == 4) && !Intrinsics.areEqual(objectRef.element, Boolean.FALSE)) {
                                objectRef2.element = Boolean.valueOf(aVar == TextInputServiceAndroid.a.ShowKeyboard);
                            }
                            i11++;
                        } while (i11 < size);
                    }
                    mutableVector.clear();
                    boolean zAreEqual = Intrinsics.areEqual(objectRef.element, Boolean.TRUE);
                    InputMethodManager inputMethodManager = this$0.f18146b;
                    if (zAreEqual) {
                        inputMethodManager.restartInput();
                    }
                    Boolean bool = (Boolean) objectRef2.element;
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            inputMethodManager.showSoftInput();
                        } else {
                            inputMethodManager.hideSoftInput();
                        }
                    }
                    if (Intrinsics.areEqual(objectRef.element, Boolean.FALSE)) {
                        inputMethodManager.restartInput();
                    }
                }
                break;
            case 4:
                QueryInterceptorDatabase this$1 = (QueryInterceptorDatabase) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.f23255r0.onQuery("TRANSACTION SUCCESSFUL", CollectionsKt__CollectionsKt.emptyList());
                break;
            case 5:
                HashMap map = LottieCompositionFactory.f25604a;
                Utils.closeQuietly((ZipInputStream) obj);
                break;
            case 6:
                ((AFa1dSDK) obj).getLevel();
                break;
            case 7:
                CommandCallback callback = (CommandCallback) obj;
                Intrinsics.checkNotNullParameter(callback, "$callback");
                callback.sendError(Errors.ErrorCanceled);
                break;
            default:
                ((Disposable) obj).dispose();
                break;
        }
    }
}
