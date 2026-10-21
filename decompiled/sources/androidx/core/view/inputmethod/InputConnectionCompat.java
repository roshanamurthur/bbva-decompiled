package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.g;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class InputConnectionCompat {
    public static final int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = 1;

    public interface OnCommitContentListener {
        boolean onCommitContent(@NonNull InputContentInfoCompat inputContentInfoCompat, int i10, @Nullable Bundle bundle);
    }

    public class a extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ OnCommitContentListener f20397a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InputConnection inputConnection, OnCommitContentListener onCommitContentListener) {
            super(inputConnection, false);
            this.f20397a = onCommitContentListener;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
            if (this.f20397a.onCommitContent(InputContentInfoCompat.wrap(inputContentInfo), i10, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i10, bundle);
        }
    }

    public class b extends InputConnectionWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ OnCommitContentListener f20398a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InputConnection inputConnection, OnCommitContentListener onCommitContentListener) {
            super(inputConnection, false);
            this.f20398a = onCommitContentListener;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0 */
        /* JADX WARN: Type inference failed for: r3v3, types: [int] */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v3, types: [android.os.ResultReceiver] */
        /* JADX WARN: Type inference failed for: r5v5, types: [android.os.ResultReceiver] */
        /* JADX WARN: Type inference failed for: r5v7 */
        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public final boolean performPrivateCommand(String str, Bundle bundle) throws Throwable {
            boolean z10;
            ?? r10;
            boolean zOnCommitContent;
            OnCommitContentListener onCommitContentListener = this.f20398a;
            if (bundle != null) {
                ?? r3 = 0;
                r3 = 0;
                if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                    z10 = false;
                } else if (TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                    z10 = true;
                }
                try {
                    ?? r11 = (ResultReceiver) bundle.getParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
                    try {
                        Uri uri = (Uri) bundle.getParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                        ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                        Uri uri2 = (Uri) bundle.getParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                        int i10 = bundle.getInt(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                        Bundle bundle2 = (Bundle) bundle.getParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                        if (uri != null && clipDescription != null) {
                            zOnCommitContent = onCommitContentListener.onCommitContent(new InputContentInfoCompat(uri, clipDescription, uri2), i10, bundle2);
                        }
                        if (r11 != 0) {
                            r3 = zOnCommitContent;
                            r11.send(r3, null);
                        }
                        if (r3 != 0) {
                            return true;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r10 = r11;
                        if (r10 != 0) {
                            r10.send(0, null);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r10 = 0;
                }
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    @RequiresApi(25)
    public static class c {
        @DoNotInline
        public static boolean a(InputConnection inputConnection, InputContentInfo inputContentInfo, int i10, Bundle bundle) {
            return inputConnection.commitContent(inputContentInfo, i10, bundle);
        }
    }

    @Deprecated
    public InputConnectionCompat() {
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    public static boolean commitContent(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo, @NonNull InputContentInfoCompat inputContentInfoCompat, int i10, @Nullable Bundle bundle) {
        char c10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25) {
            return c.a(inputConnection, h8.a.b(inputContentInfoCompat.unwrap()), i10, bundle);
        }
        boolean z10 = true;
        if (i11 >= 25) {
            c10 = 1;
        } else {
            Bundle bundle2 = editorInfo.extras;
            if (bundle2 == null) {
                c10 = 0;
            } else {
                boolean zContainsKey = bundle2.containsKey("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                boolean zContainsKey2 = editorInfo.extras.containsKey("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                if (zContainsKey && zContainsKey2) {
                    c10 = 4;
                } else if (zContainsKey) {
                    c10 = 3;
                } else if (zContainsKey2) {
                    c10 = 2;
                } else {
                    c10 = 0;
                }
            }
        }
        if (c10 != 2) {
            if (c10 != 3 && c10 != 4) {
                return false;
            }
            z10 = false;
        }
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI", inputContentInfoCompat.getContentUri());
        bundle3.putParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION", inputContentInfoCompat.getDescription());
        bundle3.putParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI", inputContentInfoCompat.getLinkUri());
        bundle3.putInt(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS", i10);
        bundle3.putParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS", bundle);
        return inputConnection.performPrivateCommand(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT" : "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", bundle3);
    }

    @NonNull
    @Deprecated
    public static InputConnection createWrapper(@NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo, @NonNull OnCommitContentListener onCommitContentListener) {
        ObjectsCompat.requireNonNull(inputConnection, "inputConnection must be non-null");
        ObjectsCompat.requireNonNull(editorInfo, "editorInfo must be non-null");
        ObjectsCompat.requireNonNull(onCommitContentListener, "onCommitContentListener must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new a(inputConnection, onCommitContentListener);
        }
        return EditorInfoCompat.getContentMimeTypes(editorInfo).length == 0 ? inputConnection : new b(inputConnection, onCommitContentListener);
    }

    @NonNull
    public static InputConnection createWrapper(@NonNull View view, @NonNull InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        Preconditions.checkNotNull(view);
        return createWrapper(inputConnection, editorInfo, new g(view));
    }
}
