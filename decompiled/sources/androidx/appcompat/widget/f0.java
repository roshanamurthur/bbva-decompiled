package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;

/* JADX INFO: compiled from: AppCompatTextClassifierHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f1598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public TextClassifier f1599b;

    /* JADX INFO: compiled from: AppCompatTextClassifierHelper.java */
    @RequiresApi(26)
    public static final class a {
        @NonNull
        @DoNotInline
        public static TextClassifier a(@NonNull TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public f0(@NonNull TextView textView) {
        this.f1598a = (TextView) Preconditions.checkNotNull(textView);
    }
}
